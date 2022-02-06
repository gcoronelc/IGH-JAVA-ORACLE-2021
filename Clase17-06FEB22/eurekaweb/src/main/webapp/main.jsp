<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Eureka Bank</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container">
			<a class="navbar-brand" href="#">Eureka</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarProcesos"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							Procesos </a>
						<ul class="dropdown-menu" aria-labelledby="navbarProcesos">
							<li><a class="dropdown-item" id="lnkCrearCuenta" href="#">Crear cuenta</a></li>
							<li><a class="dropdown-item" href="#">Depósito</a></li>
							<li><a class="dropdown-item" href="#">Retiro</a></li>
						</ul></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarConsultas"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							Consultas </a>
						<ul class="dropdown-menu" aria-labelledby="navbarConsultas">
							<li><a class="dropdown-item" href="#">Clientes</a></li>
							<li><a class="dropdown-item" id="lnkConsultarCuentas" href="#">Cuentas</a></li>
							<li><a class="dropdown-item" href="#">Movimientos</a></li>
						</ul></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarReportes"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							Reportes </a>
						<ul class="dropdown-menu" aria-labelledby="navbarReportes">
							<li><a class="dropdown-item" href="#">Clientes</a></li>
							<li><a class="dropdown-item" id="lnkReporteCuentas" href="#">Cuentas</a></li>
							<li><a class="dropdown-item" href="#">Movimientos</a></li>
						</ul></li>

				</ul>
				<form class="d-flex">
					<input class="form-control me-2" type="text" value="Usuario: ${usuario.nombre}"
						aria-label="Search" disabled="disabled">
					<button class="btn btn-secondary" type="button">Salir</button>
				</form>
			</div>
		</div>
	</nav>

	<div class="container" id="divWork">
		Area de trabajo.
	</div>


	<!--Bootstrap Bundle with Popper -->
	<script src="js/bootstrap.bundle.min.js"></script>
	<script src="js/main.js"></script>
</body>
</html>