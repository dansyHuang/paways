$(document).ready(function(){
	$("#schoolName").focus(function(){
	    var top = $(this).position().top+28;
	  	  var left = $(this).position().left;
	  	  $("div[class='provinceSchool']").css({top:top,left:left});
	  	  $("div[class='provinceSchool']").show();
	  	
			});
});
function selectOrg(provinceId) { 
		var schoolUlStr = "";
		var tempSchoolName="";
		jQuery.ajax({
			url:'/paways/geo/city',
			data:{"parentId":provinceId},
			type:"POST",
			beforeSend:function()
			{  
			},
			success:function(result)
			{
				var obj=eval(result);
				for(var i=0,len=obj.length;i<len;i++){
				  	  tempSchoolName = obj[i];
					  if(tempSchoolName.length>13){
					  	schoolUlStr = schoolUlStr + "<li onclick='getArea(\""+obj[i].id+"\",\""+obj[i].name+"\")' class='DoubleWidthLi'>"+obj[i].name+"</li>";
					  }else {
					  	schoolUlStr = schoolUlStr + "<li onclick='getArea(\""+obj[i].id+"\",\""+obj[i].name+"\")' >"+obj[i].name+"</li>";
					  }
					  $("div[class='schoolList'] ul").html(schoolUlStr);
				    }
			}
		});
		
	  };
	function getArea(id,name){
	  $("#schoolName").val(name);
	  $("#homeTown").val(id);
	  $("div[class='provinceSchool']").hide();
	};