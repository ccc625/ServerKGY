<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="../lib/jquery/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	ajaxStart();
});
function ajaxStart(){
	 $.ajax({         
         type : "GET",
         data : {"id" : "id"},
         url : "ajaxSatrt.do",
         dataType : "text",
         error : function(e){
             alert('통신실패!!');
             console.log(e)
         },
         success : function(data){
             alert("통신데이터 값 : " + data) ;
         }
          
     });

}
</script>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<%-- <c:forEach var="i" items="${list}"> --%>

<%--  	 ${i.emp_id}  --%>
<%-- </c:forEach> --%>
<span></span>
</body>
</html>