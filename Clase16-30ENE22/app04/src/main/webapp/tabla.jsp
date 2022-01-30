<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

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

