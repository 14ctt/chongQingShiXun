<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>用户首页</title>
<style type="text/css">
.r_price{
    width:500px;
    height: 400px;
    margin: auto;
   border: 1px solid #dfdfdf;
   text-align: center;
   line-height: 40px;
	padding-left: 10px;	
	font-size: 18px;
}
body {
	background: url("../images_baiduindex/bg.jpg");
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="360-site-verification"
	content="e51821f6fb255ccd23b0e6e03e345b1d" />
<%@ include file="/WEB-INF/jsp/header.jsp"%>
<script type="text/javascript">  
        <%--JS gloable varilible--%>  
</script>
<script type="text/javascript" src="${webtxc}/js/jquery.x_down.js"></script>
<script type="text/javascript" src="${webtxc}/myjs/home/home.js?v=2016052702"></script>
</head>
<body>
				<div class="r_price">
				<c:forEach var="it" items="${list}">					
					${it.name}
				</c:forEach>
				</div>
				
</body>
</html>