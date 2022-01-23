<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
// Variables
int numero;
int tabla[][] = new int[12][3];

// Datos
numero = Integer.parseInt(request.getParameter("numero"));

// Proceso
for(int n=1; n<=12; n++){
	tabla[n-1][0] = n;
	tabla[n-1][1] = numero;
	tabla[n-1][2] = n * numero;
}

%>    
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>
	<h1>TABLA DE MULTIPLICAR</h1>
	<h2>Tabla del <%=numero%></h2>
	<table>
		<% for(int i=0; i<12; i++){ %>
			<tr>
				<td><%=tabla[i][0]%></td>
				<td>*</td>
				<td><%=tabla[i][1]%></td>
				<td>=</td>
				<td><%=tabla[i][2]%></td>
			</tr>
		<% } %>
	</table>
</body>
</html>
