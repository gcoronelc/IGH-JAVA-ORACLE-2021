// Inicializar la página
window.onload = function() {

	// Procesos
	let lnkCrearCuenta = document.getElementById("lnkCrearCuenta");
	lnkCrearCuenta.onclick = fnCrearCuenta;

	// Consulta 
	let lnkConsultarCuentas = document.getElementById("lnkConsultarCuentas");
	lnkConsultarCuentas.onclick = fnConsultarCuentas;
	
	// Reportes
	let lnkReporteCuentas = document.getElementById("lnkReporteCuentas");
	lnkReporteCuentas.onclick = fnReporteCuentas;

};

function fnCrearCuenta(){
	document.getElementById("divWork").innerHTML='<object width="100%" type="text/html" data="crearCuenta.jsp" ></object>';
}

function fnConsultarCuentas(){
	document.getElementById("divWork").innerHTML='<object width="100%" type="text/html" data="consultarCuentas.jsp" ></object>';
}

function fnReporteCuentas(){
	document.getElementById("divWork").innerHTML='<object width="100%" type="text/html" data="reporteCuentas.jsp" ></object>';
}



