<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common.jsp"%>

<!Doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<title>three</title>
<meta name="Keywords" content="关键字,关键字">
<meta name="description" content="">

<style type="text/css">
* {
	margin: 0;
	padding: 0;
}

body {
	font-size: 14px;
	font-family: "微软雅黑";
	color: #666;
	background: url("images/images_baiduindex/bg.jpg");
}

.logo {
	width: 270px;
	height: 129px;
	margin: 0 auto;
}

.search {
	width: 657px;
	height: 40px;
	margin: 0 auto;
	line-height: 40px;
}

.search input {
	width: 521px;
	height: 20px;
	padding: 8px;;
	float: left;
	outline: none;
}

.search a {
	width: 116px;
	height: 40px;
	display: block;
	text-decoration: none;
	color: #000;
	float: right;
	text-align: center;
	line-height: 40px;
	font-size: 16px;
	background: #F3F3F3;
}

.nav {
	width: 911px;
	height: 318px;
	margin: 50px auto;
	margin-top: 30px;
}

.nav .menu {
	width: 80px;
	height: 318px;
	float: left;
	background: #1E2E35;
	position: relative;
} /*rgba文字不透明*/
.nav .menu a {
	width: 80px;
	height: 35px;
	display: block;
	line-height: 35px;
	text-align: center;
	text-decoration: none;
	color: #fff;
}

.nav .menu .sel {
	background: url("images/images_baiduindex/me.png");
}

.nav .menu a:hover {
	background: #6F797E;
}

.nav .menu .tool {
	position: absolute;
	bottom: 0;
	left: 0;
}

.nav .menu .tool span {
	width: 20px;
	height: 20px;
	display: block;
	background-image: url(images/images_baiduindex/icon.png);
	background-position: -688px -406px;
	margin: 7px auto;
}

.nav .cont {
	width: 811px;
	height: 318px;
	float: right;
	overflow: hidden;
	position: relative;
}

.nav .cont div {
	position: absolute;
	top: -318px;
	left: 0;
}

/*S share*/
.share {
	margin-left: 850px;
	margin-top: -50px;
	position: absolute;
}

.share a {
	width: 38px;
	height: 38px;
	display: block;
	float: right;
	margin: 0px 0px 0 0;
	position: relative;
	overflow: hidden;
}

.share a span {
	display: block;
	width: 30px;
	height: 80px;
	background: url("images/images_baiduindex/share.png") no-repeat;
	position: absolute;
}

.share .sina {
	background-position: 3px 5px
}

.share .tenc {
	background-position: -82px 5px
}

.share .weib {
	background-position: -42px 5px
}
/*E share*/

 /*S nav*/
	  .na{text-align: center;width: 700px;
	height: 30px;
	margin: 0 auto;
	margin-top: 10px}
	 .na ul li{float:left;list-style:none;height:50px;}
	 .na ul li a{display:block;line-height:50px;text-decoration:none;width:50px;color:#fff;font-size:16px;text-align:center;padding:0 25px;}
	   .na ul li a:hover{background:#2c2c2c;}
 .na ul li .sel{background:#2c2c2c;}
 .na ul .na_select{position:relative;}
	 .na ul .na_tips{position:absolute;left:27px;top:-21px;z-index:3}
	 .na ul .na_select .na_bbs{background:#000;position:absolute;top:76px;z-index:2;visibility:hidden;}
	  .na ul .na_select:hover .na_bbs{visibility:visible;}
 .na ul .na_select .na_bbs a{width:130px;height:35px; line-height:35px;padding:0 15px;text-align:left;}
	   /*E anv*/
	   
	 #dv1{
	      width:811px;
	      height:318px;
	      border:1px solid gray;
	      border-bottom: 1px solid gray;
	      	      border-right: 1px solid gray;
	 
	   }
	   #dv2{
	      width:811px;
	      height:319px;
	      border:1px solid gray;
	   }
	   #dv3{
	      width:811px;
	      height:319px;
	     border:1px solid gray;
	   }
	   #dv4{
	     width:811px;
	      height:319px;
	     border:1px solid gray;
	   }
</style>
</head>

<body>
	<div class="logo">
		<img src="images/images_baiduindex/baidu.png" width="270" height="129"
			alt="logo" />
	</div>
	<!--S share-->
	<div class="share">
		<a href="#"><span class="sina"></span></a> <a href="#"><span
			class="tenc"></span></a> <a href="#"><span class="weib"></span></a>
	</div>
	<!--E share-->


	<div class="search">
		<input type="text" name="name"/> <a href="${webtxc}/home/goods/homeShow.do">百度一下</a>
	</div>



 <!--S nav-->
		 <div class="na">
		    <ul>
			   <li><a href="#" class="sel">首页</a></li>
			    <li><a href="#">返回</a></li>
			   <li><a href="${webtxc}/home/goods/showGoods.do?goodsName=${it.goodsName}">查看</a></li>
			   <li><a href="${webtxc}/home/goods/showLook.do?goodsName=${hg}">查看所有</a></li>
			   <li><a href="#">删除</a></li>
			   <li><a href="#">修改</a></li>
			   <li class="na_select">
			      <a href="#">活动</a>
				  <div class="na_bbs">
				     <span class="na_tips">
					     <img src="images/images_tanzhou/tip.png" alt="下拉框" width="26"height="16"/>
					 </span>
					 <a href="#">SEO研究中心</a>
					 <a href="#">网页制作中心</a>
					 <a href="#">淘宝论坛</a>
					 <a href="#">ps论坛</a>
					 <a href="#">网络营销</a>			     
				  </div>
			   </li>
			</ul>
		 </div>
		 
		 

	<div class="nav">
		<div class="menu">
			<a href="#" class="sel">珠宝</a> <a href="#">女装</a> <a href="#">腕表</a>
			<a href="#">跑车</a> <a href="#" class="tool"><span></span></a>
		</div>
		<div class="cont">
			<div id="dv1">525555</div>
			<div id="dv2">你是猪吗</div>
			<div id="dv3">为什么追我</div>
			<div id="dv4">452475</div>
		</div>
	</div>

	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript">
		//初始值
		var i = 0; //当前点击索引
		var j = 1; //上次点击索引
		$(function() {
			$(".menu a").click(function() {
				$(this).addClass("sel").siblings().removeClass("sel");
				i = $(this).index();
				if (i < j) {
					$(".cont div").eq(j).animate({
						top : "319px"
					}, 300);
					$(".cont div").eq(i).animate({
						top : "0"
					}, 300);
					j = i;
				} else if (i > j) {
					$(".cont div").eq(i).css("top", "319px");
					$(".cont div").eq(j).animate({
						top : "-319px"
					}, 300);
					$(".cont div").eq(i).animate({
						top : "0"
					}, 300);
					j = i;
				}
			});
		});

		$(".share a").each(function(index) {
			$(this).hover(function() {
				if (index == 0) {
					$(this).css({
						"background-color" : "#f75454"
					});
				} else if (index == 1) {
					$(this).css({
						"background-color" : "#0e71b7"
					});
				} else if (index == 2) {
					$(this).css({
						"background-color" : "#CC3"
					});
				}
				$(this).css({
					"border-radius" : 4
				});
				$(this).find("span").stop();//在每次创建动画前先停止下来
				$(this).find("span").animate({
					"top" : -46
				}, "normal");//创建动画
			}, function() {//还原到初始值
				var _this = $(this);//取到a标签的this
				$(this).find("span").animate({
					"top" : 0
				}, "normal", function() {
					_this.css({
						"background" : "none"
					});
				});//回调函数
			});
		});
	</script>
</body>
</html>