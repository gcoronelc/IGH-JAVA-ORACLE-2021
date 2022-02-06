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

function fnCrearCuenta() {
	const xhttp = new XMLHttpRequest();
	xhttp.onload = function() {
		let destino = document.getElementById("divWork");
		let html = this.responseText;
		insertHTML(html,destino);
	}
	xhttp.open("GET", "CrearCuentaForm", true);
	xhttp.send(null);
}

function fnConsultarCuentas() {
	document.getElementById("divWork").innerHTML = '<object width="100%" type="text/html" data="consultarCuentas.jsp" ></object>';
}

function fnReporteCuentas() {
	const xhttp = new XMLHttpRequest();
	xhttp.onload = function() {
		let destino = document.getElementById("divWork");
		let html = this.responseText;
		insertHTML(html,destino);
	}
	xhttp.open("GET", "reporteCuentas.jsp", true);
	xhttp.send();
}


function insertHTML(html, dest, append=false){
    // if no append is requested, clear the target element
    if(!append) dest.innerHTML = '';
    // create a temporary container and insert provided HTML code
    let container = document.createElement('div');
    container.innerHTML = html;
    // cache a reference to all the scripts in the container
    let scripts = container.querySelectorAll('script');
    // get all child elements and clone them in the target element
    let nodes = container.childNodes;
    for( let i=0; i< nodes.length; i++) dest.appendChild( nodes[i].cloneNode(true) );
    // force the found scripts to execute...
    for( let i=0; i< scripts.length; i++){
        let script = document.createElement('script');
        script.type = scripts[i].type || 'text/javascript';
        if( scripts[i].hasAttribute('src') ) script.src = scripts[i].src;
        script.innerHTML = scripts[i].innerHTML;
        document.head.appendChild(script);
        document.head.removeChild(script);
    }
    // done!
    return true;
}
