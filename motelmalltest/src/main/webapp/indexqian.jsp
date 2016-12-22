<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>我是首页</title>
<style type="text/css">
			div#dvShow{/*表示id为dvShow的div。div #dvShow表示div里面id为dvShow的元素*/
				margin: auto;/*设置块级元素的 width 可以阻止它从左到右撑满容器。
				然后你就可以设置左右外边距为 auto 来使其水平居中。元素会占据你所指定
				的宽度，然后剩余的宽度会一分为二成为左右外边距*/
			width:1366px;
				height:768px;
				border: 1px solid mediumpurple;
					padding: 0px;
			}
			
			img#imgShow{
				width:1366px;
				height:768px;/*IE浏览器快捷键：Fn+F5刷新  */
				margin: auto;
				padding: 0px;
			}
			table{
				border:none;
			}
			
			#ge{
			
				 margin-left: 900px;
		       margin-top:750px;
		       position: absolute;
				}
				
	.f_btn {
	width: 150px;
	height: 40px;
	line-height: 40px;
	text-align: center;
	color: #FFF;
	font-size: 16px;
	text-decoration: none;
	background: gray;
	display: block;
	 margin-left: 550px;
		       margin-top:500px;
		       position: absolute;
}
			
			</style>
			
		<script type="text/javascript">	
/*function add(v)
{ 
alert(v);
}
<input type="text" id="abc" onclick="add()"  />*/
                var timeid;
				function showPic(no){
	                count=no;
	                setbtnColor(no);
	                document.getElementById("imgShow").src="images/images_baiduindex/q"+count+".jpg";
	                count++;
	                timeid=setTimeout("showPic(count)",3000);
	                if(count>3)
	                count=count-3;
				}
				window.onload=function(){
					showPic(1);
					onclickbtnEvent();
				}
				function onclickbtnEvent(){
					var btns=document.getElementsByTagName("input");
					for(var i=0;i<btns.length;i++){
						btns[i].onclick=function(){
							clearTimeout(timeid);
							count=this.value;
							setbtnColor(count);
							timeid=setTimeout("showPic(count)",3000);
						}
					}
				}
				function setbtnColor(num){
					var btns=document.getElementsByTagName("input");
					for(var i=0;i<btns.length;i++){
						if(btns[i].value==num)
						btns[i].style.backgroundColor="purple";
					else
						btns[i].style.backgroundColor="";
					}
				}
				</script>
</head>
<body>
<form action="index.jsp">
<div id="big">

<div id="ti">
<button type="submit"  class="f_btn">提交
</button></div>

<div id="ge"><input type="button" value="1"/>
						<input type="button" value="2"/>
						<input type="button" value="3"/>
						</div>
<div id="dvShow">
			<div>
				<img id="imgShow">
			</div>
				</div>

       
</div>


</form>
</body>
</html>