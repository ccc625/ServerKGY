<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function onload(){
// 	location.href="sample.do";
}

function ajaxSample1(){
 	location.href="sample/openSampleList.do";	
}

function ajaxSample2(){
 	location.href="sample/openSampleList2.do";	
}
</script>
</head>
<body onload="onload()">
<h1>index.jsp Page</h1>
<input type="button" value="ajaxSample1" onclick="ajaxSample1()">
<input type="button" value="ajaxSample2" onclick="ajaxSample2()">
</body>
</html>