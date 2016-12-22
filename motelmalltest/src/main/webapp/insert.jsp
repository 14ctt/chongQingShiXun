<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/WEB-INF/jsp/header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${webtxc}/plugin/kindeditor417/themes/default/default.css" />      
<script charset="utf-8" src="${webtxc}/plugin/kindeditor417/kindeditor.js"></script>
<script charset="UTF-8" src="${webtxc}/plugin/kindeditor417/lang/zh_CN.js"></script>
<script type="text/javascript">
$(function(){
	KindEditor.ready(function(K){
	    var uploadbutton = K.uploadbutton({
	      button : K('#imgBtn')[0],
	      fieldName : 'imgFile',
	      url : path+'/plugin/kindeditor417/jsp/upload_json.jsp',
	      afterUpload : function(data) {
	    	  console.info(data)
	              if (data.error === 0) {
	                    $("input[name='goodsImg']").val(data.url);
	                    $("#goodsImg").attr('src',path+'/'+data.url.substring(data.url.indexOf("files")));
	              }
	      }
		     });
		     uploadbutton.fileBox.change(function(e) {
	     	 uploadbutton.submit();
			 });  
		  var editor = K.editor({
			uploadJson: path+'/plugin/kindeditor417/jsp/upload_json.jsp',
	     fileManagerJson: path+'/plugin/kindeditor417/jsp/file_manager_json.jsp',
	     allowFileManager: true,
		});
	});
})

</script>
<style type="text/css">
input{
  margin: 5px;
}
</style>
</head>
<body>
<form action="${webtxc}/home/goods/addGoods.do">
id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="goodsId"/><br/>
name:<input type="text" name="goodsName"/><br/>
<input id="imageInput" name="goodsImg" type="text" />
<input type="button" id="imgBtn" value="选择图片"/>
<img id="goodsImg" style="width: 300px;height: 200px;"/>
<input type="submit" value="提交"/>
</form>

</body>
</html>