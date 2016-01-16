package org.springside.examples.quickstart;

public class Test {

	public static void main(String[] args){
		String colums="email,name,id_card,hometow,gender,age,mobile_num,role_name";
		String[] colunmArray=colums.split(",");
		for(String column:colunmArray){
			if(column.indexOf("_")>-1){
				String[] arry=column.split("_");
				if(column.startsWith("gmt_")){
					System.out.println("private Date "+arry[0]+arry[1].substring(0,1).toUpperCase()+arry[1].substring(1)+";");
				}else{
					System.out.println("private String "+arry[0]+arry[1].substring(0,1).toUpperCase()+arry[1].substring(1)+";");
				}
			}else{
				System.out.println("private String "+column+";");
			}
			
		}
		for(String column:colunmArray){
			if(column.indexOf("_")>-1){
				String[] arry=column.split("_");
				String realColumn=arry[0]+arry[1].substring(0,1).toUpperCase()+arry[1].substring(1);
				String methodColumn=arry[0].substring(0,1).toUpperCase()+arry[0].substring(1)+arry[1].substring(0,1).toUpperCase()+arry[1].substring(1);
				if(column.startsWith("gmt_")){
					System.out.println("public void set"+methodColumn+"(Date "+realColumn+"){ this."+realColumn+"="+realColumn+";}");
					System.out.println("public Date get"+methodColumn+"(){ return "+realColumn+";}");
				}else{
					System.out.println("public void set"+methodColumn+"(String "+realColumn+"){ this."+realColumn+"="+realColumn+";}");
					System.out.println("public String get"+methodColumn+"(){ return "+realColumn+";}");
				}
			}else{
				String realColumn=column;
				String methodColumn=column.substring(0,1).toUpperCase()+column.substring(1);
				System.out.println("public void set"+methodColumn+"(String "+realColumn+"){ this."+realColumn+"="+realColumn+";}");
				System.out.println("public String get"+methodColumn+"(){ return "+realColumn+";}");
			}
			
		}
	}
}
