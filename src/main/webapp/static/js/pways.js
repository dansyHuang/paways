 BUI.use('bui/uploader',function (Uploader) {
          
      /**
       * 返回数据的格式
       *
       *  默认是 {url : 'url'},否则认为上传失败
       *  可以通过isSuccess 更改判定成功失败的结构
       */
      var uploader = new Uploader.Uploader({
        render: '#J_Uploader',
        url: '/paways/upload',
        //根据业务需求来判断上传是否成功，这里返回一个boolean
        isSuccess: function(result){
        	alert(result);
          if(result && result.url){
            return true;
          }
          return false;
        }
      }).render();
    });
 BUI.use('bui/form',function(Form){
     
    var form= new Form.Form({
       srcNode : '#registryForm'
     }).render();
     alert(form);
 });  