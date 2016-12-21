<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=uft-8">
<title>删除</title>
</head>
<body>
<table border="1" style="width:80%">
  <tr>
    <tb>
       <td>编号:</td>
       <td>用户名:</td>
       <td>性别:</td>
       <td>年轻:</td>
       <td>手机号:</td>
     </tr>
     <c:forEach itecms="${pageList}" var="list" varStatus="s">
     <tr>
        <td>${s.count}</td>
        <td></td>
     
       
       
       
    
    
</tr>
</c:forEach>
</table>


</body>
</html>