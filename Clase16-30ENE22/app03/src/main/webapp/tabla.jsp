<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<title>Tabla de Multiplicar</title>
<style type="text/css">

td{
	margin: 5;
	padding: 5;
	text-align: center;
	width: 50px;
	height: 40px;
	background-color:#abdbe3;
}

</style>
</head>
<body>
	<h1>TABLA DE MULTIPLICAR</h1>
	<h2>Tabla del ${numero}</h2>
	<table>
		<c:forEach items="${tabla}" var="r">
			<tr>
				<td>${r.col1}</td>
				<td>*</td>
				<td>${r.col2}</td>
				<td>=</td>
				<td>${r.col3}</td>
			</tr>
		</c:forEach>
	</table>
	<div>
		<a href="index.html">Retornar</a>
	</div>
</body>
</html>
