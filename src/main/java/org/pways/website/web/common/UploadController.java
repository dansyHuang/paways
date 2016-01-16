package org.pways.website.web.common;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.pways.website.web.account.AjaxController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author dansy
 */
@Controller
public class UploadController {
	
	private final static int BUFFER_SIZE=1024*1024; 
	private final static String  BUFFER_DIR="/tem";
	
	private final static long MAX_SIZE=10*1024*104;
	private final static Logger logger = LoggerFactory.getLogger(AjaxController.class); 
	/**
	 * 上传文件
	 * 
	 * @return
	 * @throws IOException
	 * @throws IllegalStateException
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST ,produces = "applicaiton/javascript")
	public String upload(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		boolean flag = true;
		// 检查输入请求是否为multipart表单数据。
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		String filePath="";
		// 若果是的话
		if (isMultipart) {
			/** 为该请求创建一个DiskFileItemFactory对象，通过它来解析请求。执行解析后，所有的表单项目都保存在一个List中。 **/
			try {
				DiskFileItemFactory factory = new DiskFileItemFactory();
				 factory.setSizeThreshold(BUFFER_SIZE); // 设置缓冲区大小，这里是4kb
				 factory.setRepository(new File(BUFFER_DIR));// 设置缓冲区目录
				ServletFileUpload upload = new ServletFileUpload(factory);
				String path = this.getClass().getClassLoader().getResource("/").getPath();
				String savePath=path+"/upload";
				File saveDir=new File(savePath);
				if(!saveDir.exists()){
					saveDir.mkdir();
				}
				upload.setHeaderEncoding("UTF-8");// 解决文件乱码问题
				 upload.setSizeMax(MAX_SIZE);// 设置最大文件尺寸
				List<FileItem> items = upload.parseRequest(request);
				// 检查是否符合上传的类型
				Iterator<FileItem> itr = items.iterator();// 所有的表单项
				// 保存文件
				while (itr.hasNext()) {
					FileItem item = (FileItem) itr.next();// 循环获得每个表单项
					 if (!item.isFormField()) {  
						String name = item.getName();// 获得文件名 包括路径啊
						if (name != null) {
							File fullFile = new File(item.getName());
							File savedFile = new File(saveDir, fullFile.getName());
							item.write(savedFile);
							filePath+=savedFile.getPath()+";";
						}
					}
				}

			} catch (FileUploadException e) {
				flag = false;
				logger.error("UploadController FileUploadException",e);

			} catch (Exception e) {
				flag = false;
				logger.error("UploadController Exception",e);
			}

		} else {
			flag = false;
			System.out.println("the enctype must be multipart/form-data");
		}
		request.setAttribute("filePath", filePath);
		if(!flag)return "upload/failed";
		return "upload/upload";

	}
}
