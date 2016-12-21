<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>用户首页</title>
<script type="text/javascript" src="jquery/jquery-1.8.3.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Insert title here</title>
<style type="text/css">
.r_price{
    width:700px;
    height: 600px;
    margin: auto;
   border: 1px solid #dfdfdf;
   text-align: center;
}

.r_price .p_form input {
	width: 200px;
	height: 30px;
	border: 1px solid #dfdfdf;
	line-height: 40px;
	padding-left: 10px;
	outline: none;
	font-size: 18px;
	margin-top: 10px;
	
}


.r_price .p_form .f_btn {
	width: 200px;
	height: 40px;
	line-height: 40px;
	text-align: center;
	color: #FFF;
	font-size: 14px;
	text-decoration: none;
	background: red;
	display: block;
	
}

.r_price h2 {
	font-size: 20px;
	color: #666;
	margin: 10px 0;
}

.r_price .p_form #ti{
  margin-left: 250px;
  	margin-top: 20px;
}
#chu{
  margin-left: -300px;
}

</style>
<script>
	$(function(){
		alert("dsfsdf");
	});
</script>
</head>
<body>
<form action="${webtxc}/home/goods/getPhone.do" method="post" enctype="multipart/form-datas">
<div class="r_price">
<br>
<h2>请输入品牌信息</h2>
		<div class="p_form">
		
	品&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;牌:<input name="name" placeholder="用户密码"/>
图&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;片:<input name="image" type="file" accept=".png,.gif,.jpeg"/><br/>
型&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号:<input name="type" placeholder="x9Plus"/>
手机颜色:<input name="color" placeholder="金色 玫瑰金"/><br/>
操作系统:<input name="os" placeholder="安卓"/>
电池类型:<input name="cellType" placeholder="不可拆卸"/><br/>
电池容量:<input name="bc" placeholder="4000mAh"/>
运行内存:<input name="ram" placeholder="6GB"/><br/>
存储容量:<input name="sc" placeholder="64GB"/>
网络模式:<input name="networkMold" placeholder="双卡多模"/><br/>
厚&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;度:<input name="thickness" placeholder="9mm以下"/> 



分&nbsp;&nbsp;辨&nbsp;&nbsp;率:<input name="resolutionRatio" placeholder="1920x1080"/><br/>

视频格式:<input name="videoFormat" placeholder="1080陪（全高清D5）"/>
款&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;式:<input name="style" placeholder="直板"/><br/>
键盘类型:<input name="keyboardType" placeholder="虚拟触屏键盘"/>
网络类型:<input name="networkType" placeholder="移动4G/联通4G/电信4G"/><br/>
摄像头类型:<input name="cameraType" placeholder="三摄像头"/>
后置摄像头:<input name="postpositionCamera" placeholder="1600万"/><br>

<div id="chu">
触摸屏类型:<input name="touchScreenType" placeholder="电容式"/><br/></div>
<div id="ti">
<button type="submit"  class="f_btn">提交
</button></div>
		
		</div>
	</div>
</form>
</body>
</html>