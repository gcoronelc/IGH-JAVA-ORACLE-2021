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
	<div class="container">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="login-form bg-light mt-4 p-4">
					<form action="Ingresar" method="post" class="row g-3">
						<h1>Eureka Bankk</h1>
						<h3>Inicio de sesión</h3>
						<hr></hr>
						<c:if test="${error!=null}">
							<div class="alert alert-danger" role="alert">${error}</div>
						</c:if>
						<div class="col-12">
							<label>Username</label> <input type="text" name="usuario"
								class="form-control" placeholder="Usuario">
						</div>
						<div class="col-12">
							<label>Password</label> <input type="password" name="clave"
								class="form-control" placeholder="Clave">
						</div>
						<hr></hr>
						<div class="col-12">
							<button type="submit" class="btn btn-primary float-end">Ingresar</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	</div>

	<!--Bootstrap Bundle with Popper -->
	<script src="js/bootstrap.bundle.min.js"></script>

</body>
</html>