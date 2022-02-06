<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>
	<div class="card">
		<div class="card-header">Crear cuenta</div>
		<div class="card-body">

			<form>
				<div class="row mb-3">
					<label for="inputEmail3" class="col-sm-2 col-form-label">Cliente</label>
					<div class="col-sm-10">
						<select id="cliente" name="cliente" class="form-select"
							aria-label="Default select">
							<option selected="0">Seleccione una opción</option>
							<c:forEach items="${clientes}" var="rec">
								<option value="${rec.codigo}">${rec.etiqueta}</option>
							</c:forEach>
						</select>
					</div>
				</div>

				<div class="row mb-3">
					<label for="inputEmail3" class="col-sm-2 col-form-label">Moneda</label>
					<div class="col-sm-10">
						<select id="moneda" name="moneda" class="form-select"
							aria-label="Default select">
							<option selected="0">Seleccione una opción</option>
							<c:forEach items="${monedas}" var="rec">
								<option value="${rec.codigo}">${rec.etiqueta}</option>
							</c:forEach>
						</select>
					</div>
				</div>

				<div class="row mb-3">
					<label for="importe" class="col-sm-2 col-form-label">Importe</label>
					<div class="col-sm-10">
						<input type="number" class="form-control" id="importe">
					</div>
				</div>


				<div class="row mb-3">
					<label for="clave" class="col-sm-2 col-form-label">Clave</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="clave">
					</div>
				</div>

				<button type="button" id="btnCrearCuenta" class="btn btn-primary">Procesar</button>
			</form>

		</div>

	</div>

	<script type="text/javascript">
		let btnCrearCuenta = document.getElementById("btnCrearCuenta");
		btnCrearCuenta.onclick = fnBtnCrearCuenta;

		function fnBtnCrearCuenta() {
			// Datos
			let eleCliente = document.getElementById("cliente");
			let cliente = eleCliente.options[eleCliente.selectedIndex].value;
			let eleMoneda = document.getElementById("moneda");
			let moneda = eleMoneda.options[eleMoneda.selectedIndex].value;
			let importe = document.getElementById("importe").value;
			let clave = document.getElementById("clave").value;
			let data = "cliente=" + cliente + "&moneda=" + moneda + "&importe=" + importe + "&clave=" + clave;
			// Proceso
			const xhttp = new XMLHttpRequest();
			let url = "CrearCuentaProc?" + data;
			xhttp.onload = function() {
				alert(this.responseText);
			}
			xhttp.open("GET", url, true);
			xhttp.send(null);
		}
	</script>
</body>