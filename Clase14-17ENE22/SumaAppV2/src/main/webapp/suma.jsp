<%@page import="com.igh.sumaappv2.service.MatematicaService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
	// Variables
	int num1, num2, suma;
	// Datos
	num1 = Integer.parseInt(request.getParameter("num1")); 
	num2 = Integer.parseInt(request.getParameter("num2")); 
	// Proceso
	MatematicaService service = new MatematicaService();
	suma = service.sumar(num1, num2);
%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>RESULTADO</title>
	</head>
	<body>
		<h1>SUMA DE 2 NUMEROS</h1>
		<div>
			Número 1: <%=num1%>
		</div>
		<div>
			Número 2: <%=num2%>
		</div>
		<div>
			Suma: <%=suma%>
		</div>
		<div>
			<a href="index.html">Retornar</a>
		</div>
	</body>
</html>
