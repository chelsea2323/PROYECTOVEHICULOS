<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.model.clientes"%>
<%@ page import="com.model.Vehiculos"%>
<%@ page import="com.model.contrato"%>
<%@ page import="com.model.reserva"%>
<%@ page import="com.model.Revision"%>
<%@ page import="com.model.proveedores"%>

<%@ page import="com.ies.baroja.Controller"%>
<%@ page import="java.util.LinkedList"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>perfil Administrador</title>
<link rel="stylesheet" href="css/perfilAdmin.css">
<link
	href="https://fonts.googleapis.com/css?family=Karla:400,700&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdn.materialdesignicons.com/4.8.95/css/materialdesignicons.min.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>

<script>
	$(document).ready(function() {
		$("#myTab a").click(function(e) {
			e.preventDefault();
			$(this).tab("show");
		});
	});
</script>

</head>
<body>
	<div class="page">
		<div class="sidebar">
			<div class="sidebar-header">
				<img src="images/45.png" width="100%" height="100%" alt="">
			</div>
			<br> <br>
			<div class="row ">
				<div class="col-9">

					<div class="d-flex align-items-start">
						<div class="nav flex-column nav-pills me-3" id="v-pills-tab"
							role="tablist" aria-orientation="vertical">
							<ul class="nav nav-pills " id="myTab">
								<li class="nav-item "><a href="#clientes"
									class="nav-link active  " id="home-tab" data-toggle="tab"
									role="tab" aria-controls="home" aria-selected="true">
										Clientes</a></li>
								<li class="nav-item"><a href="#vehiculos" class="nav-link">Vehiculos</a>
								</li>
								<li class="nav-item"><a href="#contratos" class="nav-link">Contratos</a>
								</li>
								<li class="nav-item"><a href="#reservas" class="nav-link">Reservas</a>
								</li>
								<li class="nav-item"><a href="#revisiones" class="nav-link">Revisiones</a>
								</li>
							</ul>


						</div>
					</div>
				</div>
			</div>
		</div>

<!-- INICIO DE NAVBAR -->
		<nav class="navbar navbar-lightbg-light">
			<div class="container-fluid">
				<button class="sidebarToggle navbar-toggler" id="sidebarToggle"
					type="button" data-bs-toggle="collapse"
					data-bs-target="#navbarToggleExternalContent"
					aria-controls="navbarToggleExternalContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>


				<a class="nav-link disabled" href="#" tabindex="-1"
					aria-disabled="true"> <svg xmlns="http://www.w3.org/2000/svg"
						width="16" height="16" fill="currentColor"
						class="bi bi-inbox-fill" viewBox="0 0 16 16">
  <path
							d="M4.98 4a.5.5 0 0 0-.39.188L1.54 8H6a.5.5 0 0 1 .5.5 1.5 1.5 0 1 0 3 0A.5.5 0 0 1 10 8h4.46l-3.05-3.812A.5.5 0 0 0 11.02 4H4.98zm-1.17-.437A1.5 1.5 0 0 1 4.98 3h6.04a1.5 1.5 0 0 1 1.17.563l3.7 4.625a.5.5 0 0 1 .106.374l-.39 3.124A1.5 1.5 0 0 1 14.117 13H1.883a1.5 1.5 0 0 1-1.489-1.314l-.39-3.124a.5.5 0 0 1 .106-.374l3.7-4.625z" />
</svg> <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
						fill="currentColor" class="bi bi-person-circle"
						viewBox="0 0 16 16">
  <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z" />
  <path fill-rule="evenodd"
							d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z" />
</svg> ADMIN
				</a>


			</div>
		</nav><!-- FIN DE NAVBAR -->



<!-- CONTENIDO -->
		<div class="content">
			<div class="content">
				<div class="tab-content">
					<div class="tab-pane fade show active table-responsive"
						id="clientes">
<!-- FORMULARIO -->
										<form action="ServletForm" method="POST">
						<h1>Listado de clientes</h1>


						<!-- Button trigger modal -->
						<button type="button" class="btn btn-outline-success"
							data-bs-toggle="modal" data-bs-target="#staticBackdrop">
							Agregar
							<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20"
								fill="currentColor" class="bi bi-plus" viewBox="0 0 16 16">
  <path
									d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z" />
</svg>
						</button>

						<!-- Modal -->
						<div class="modal fade" id="staticBackdrop"
							data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1"
							aria-labelledby="staticBackdropLabel" aria-hidden="true">
							<div class="modal-dialog modal-lg">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title" id="staticBackdropLabel">INSERTAR
											CLIENTE EN LA BASE DE DATOS</h5>
										<button type="button" class="btn-close"
											data-bs-dismiss="modal" aria-label="Close"></button>
									</div>
									<div class="modal-body">

										
<!-- Modal BODY -->

<div class="row">
  <div class="col">
    <!-- Name input -->
    <div class="form-outline">
      <input type="number" id="codigocliente" class="form-control" name="codigocliente" required/>
      <label class="form-label" for="codigocliente">Código Cliente</label>
    </div>
  </div>
  <div class="col">
    <!-- NOMBRE input -->
    <div class="form-outline">
      <input type="text" id="nombrecliente" class="form-control" name="nombrecliente"  />
      <label class="form-label" for="nombrecliente">Nombre</label>
    </div>
  </div>
  <div class="col">
    <!-- APELLIDO input -->
    <div class="form-outline">
      <input type="text" id="apellidocliente" class="form-control" name="apellidocliente"/>
      <label class="form-label" for="apellidocliente">Apellido</label>
    </div>
  </div>
</div>

<hr />

<div class="row">
  
  <div class="col">
    <!-- TELEFONO input -->
    <div class="form-outline">
      <input type="text" id="form8Example4" class="form-control" name="telefono"/>
      <label class="form-label" for="form8Example4"> Teléfono</label>
    </div>
  </div>
    <div class="col">
    <!-- DIRECCION input -->
    <div class="form-outline">
      <input type="text" id="form8Example5" class="form-control" name="direccion" />
      <label class="form-label" for="form8Example5">Dirección</label>
    </div>
  </div>
  
   </div>  <!-- CIERRE ROW -->
   <hr />
   <div class="row">   <!-- ABRIR ROW -->

   <div class="col">
    <!-- LOCALIDAD input -->
    <div class="form-outline">
      <input type="text" id="form8Example11" class="form-control"  name="localidad"/>
      <label class="form-label" for="form8Example11">Localidad</label>
    </div>
  </div>
 
 
    <div class="col">
    <!-- SUBIR ARCHIVO input -->
    <div class="form-outline">
    <input type="text" id="form8Example10" class="form-control" name="provincia"/>
      <label class="form-label" for="form8Example10">Provincia</label>
    </div>
  </div>
   </div> <!-- CIERRE ROW -->
    <hr />
   <div class="row">   <!-- ABRIR ROW -->
     <div class="col">
    <!-- CODIGO POSTAL input -->
    <div class="form-outline">
      <input type="text" id="form8Example10" class="form-control" pattern="[0-9]{5}" name="codigopostal"/>
      <label class="form-label" for="form8Example10">Código Postal</label>
    </div>
  </div>
      <div class="col">
    <!-- EMAILPOSTAL input -->
    <div class="form-outline">
      <input type="email" id="form8Example5" class="form-control" required/>
      <label class="form-label" for="form8Example5">Email</label>
    </div>
  </div>
  
  
  
    </div>

<br>
<br>

											<button type="submit" class="btn btn-primary"> Insertar Datos en Clientes</button>
										</form>
										<!-- FIN FORMULARIO -->

									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-secondary"
											data-bs-dismiss="modal">Cerrar</button>
										<button type="button" class="btn btn-primary">Guardar</button>
									</div>
								</div>
							</div>
						</div>
						<!-- FIN Modal -->
						<br> <br>
							<!-- TABLA CLIENTES -->
						<table class="table table-hover">
							<thead>
								<tr>
									<th>codigocliente</th>
									<th>nombre</th>
									<th>apellido</th>
									<th>telefono</th>
									<th>direccion</th>
									<th>localidad</th>
									<th>provincia</th>
									<th>codigopostal</th>
									<th>email</th>
									<th>acciones</th>
								</tr>
							</thead>
							<tbody>
								<!-- listado de clientes   -->
								<%
								LinkedList<clientes> listaClientes = Controller.getclientes();
								for (int i = 0; i < listaClientes.size(); i++) {

									out.println("<tr class=''>");
									out.println("<td>" + listaClientes.get(i).getCodigocliente() + "</td>");
									out.println("<td>" + listaClientes.get(i).getNombrecliente() + "</td>");

									out.println("<td>" + listaClientes.get(i).getApellidocliente() + "</td>");
									out.println("<td>" + listaClientes.get(i).getTelefono() + "</td>");
									out.println("<td>" + listaClientes.get(i).getDireccion() + "</td>");
									out.println("<td>" + listaClientes.get(i).getLocalidad() + "</td>");
									out.println("<td>" + listaClientes.get(i).getProvincia() + "</td>");
									out.println("<td>" + listaClientes.get(i).getCodigopostal() + "</td>");
									out.println("<td>" + listaClientes.get(i).getEmail() + "</td>");
									out.println("<td>");
									out.println("<button type='button' type='submit' class='btn btn-warning'>Editar</button>");
									out.println("<button type='button' class='btn btn-danger'>Eliminar  </button>");
									out.println("</td>");
									out.println("</tr>");
								}
								%>
								<!--  cierre listado de clientes   -->
							</tbody>
						</table>

						<!--  cierre de tabla  -->

					</div>

					<div class="tab-pane fade" id="vehiculos">
<!-- FORMULARIO -->
										<form action="ServletForm" method="POST">
						<h1>Listado de vehiculos</h1>


						<!-- Button trigger modal -->
						<button type="button" class="btn btn-outline-success"
							data-bs-toggle="modal" data-bs-target="#modalvehiculos">
							Agregar
							<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20"
								fill="currentColor" class="bi bi-plus" viewBox="0 0 16 16">
  <path
									d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z" />
</svg>
						</button>

						<!-- Modal -->
						<div class="modal fade" id="modalvehiculos"
							data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1"
							aria-labelledby="modalvehiculos" aria-hidden="true">
							<div class="modal-dialog modal-lg">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title" id="modalvehiculos">INSERTAR
											VEHICULOS EN LA BASE DE DATOS</h5>
										<button type="button" class="btn-close"
											data-bs-dismiss="modal" aria-label="Close"></button>
									</div>
									<div class="modal-body">

										
<!-- Modal BODY -->

<div class="row">
  <div class="col">
    <!-- Name input -->
    <div class="form-outline">
      <input type="number" id="codigovehiculo" class="form-control" name="codigovehiculo"/>
      <label class="form-label" for="codigovehiculo">Código  Vehiculo</label>
    </div>
  </div>
  <div class="col">
    <!-- Email input -->
    <div class="form-outline">
      <input type="matricula" id="form8Example2" class="form-control" name="matricula" pattern="^\\d{4}[A-Z]{3}"  placeholder="1234ABC"/>
      <label class="form-label" for="form8Example2">Mátricula</label>
    </div>
  </div>
</div>

<hr />

<div class="row">
  <div class="col">
    <!-- Name input -->
    <div class="form-outline">
      <input type="text" id="form8Example3" class="form-control" name="modelo"/>
      <label class="form-label" for="form8Example3">Modelo</label>
    </div>
  </div>
  <div class="col">
    <!-- matricula input -->
    <div class="form-outline">
      <input type="text" id="form8Example4" class="form-control" name="marca"/>
      <label class="form-label" for="form8Example4">Marca</label>
    </div>
  </div>
    <div class="col">
    <!-- modelo input -->
    <div class="form-outline">
      <input type="text" id="form8Example5" class="form-control" name="color" />
      <label class="form-label" for="form8Example5">Color</label>
    </div>
  </div>
  
   </div>  <!-- CIERRE ROW -->
   <hr />
   <div class="row">   <!-- ABRIR ROW -->

   <div class="col">
    <!-- PRECIO input -->
    <div class="form-outline">
      <input type="text" id="form8Example5" class="form-control" name="precio" />
      <label class="form-label" for="form8Example5">Precio</label>
    </div>
  </div>
 
 
    <div class="col">
    <!-- SUBIR ARCHIVO input -->
    <div class="form-outline">
   <label for="formFile" class="form-label" _msthash="1143272" _msttexthash="324220" _msthidden="1">Default file input</label>
<input class="form-control" type="file" id="formFile" name="foto">
    </div>
  </div>
     <div class="col">
    <!-- CODIGOCLIENTE input -->
    <div class="form-outline">
      <input type="text" id="form8Example5" class="form-control" name="codigocliente"/>
      <label class="form-label" for="form8Example5">Código Cliente</label>
    </div>
  </div>
  
  
  
  
    </div>

<br>
<br>

											<button type="submit" class="btn btn-primary"> Insertar Datos en Clientes</button>
										</form>
										<!-- FIN FORMULARIO -->

									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-secondary"
											data-bs-dismiss="modal">Cerrar</button>
										<button type="button" class="btn btn-primary">Guardar</button>
									</div>
								</div>
							</div>
						</div>
						<!-- FIN Modal -->
						<br> <br>
				
						<table class="table table-responsive">
							<thead class="table-light">
								<tr>
									<th>codigovehiculo</th>
									<th>matricula</th>
									<th>modelo</th>
									<th>marca</th>
									<th>color</th>
									<th>precio</th>
									<th>foto</th>
									<th>codigocliente</th>
									<th>Acciones</th>

								</tr>
							</thead>
							<tbody>
								<%
								LinkedList<Vehiculos> listaVehiculos = Controller.getVehiculos();
								for (int i = 0; i < listaVehiculos.size(); i++) {

									out.println("<tr class='table-light'>");
									out.println("<td>" + listaVehiculos.get(i).getCodigovehiculo() + "</td>");
									out.println("<td>" + listaVehiculos.get(i).getMatricula() + "</td>");

									out.println("<td>" + listaVehiculos.get(i).getModelo() + "</td>");
									out.println("<td>" + listaVehiculos.get(i).getMarca() + "</td>");
									out.println("<td>" + listaVehiculos.get(i).getColor() + "</td>");
									out.println("<td>" + listaVehiculos.get(i).getPrecio() + "</td>");
									out.println("<td>" + listaVehiculos.get(i).getFoto() + "</td>");
									out.println("<td>" + listaVehiculos.get(i).getCodigocliente() + "</td>");
									out.println("<td>");
									out.println("<button type='button' class='btn btn-warning'>Editar</button>");
									out.println("<button type='button' class='btn btn-danger'>Eliminar </button>");
									out.println("</td>");
									out.println("</tr>");
								}
								%>
							</tbody>
						</table>

					</div>
					<div class="tab-pane fade" id="contratos">
					
					
										<h1>Listado de Contratos</h1>
						<button type="button" class="btn btn-outline-success">Agregar</button>
						<br> <br>
						<table class="table table-responsive">
							<thead class="table-light">
								<tr>
									<th>Código contrato</th>
									<th>Valor del contrato</th>
									<th>Fecha</th>
									<th>Código Proveedor</th>
									<th>Código reserva</th>
								
									<th>Acciones</th>

								</tr>
							</thead>
							<tbody>
								<%
								LinkedList<contrato> listaContrato = Controller.getContrato();
								for (int i = 0; i < listaContrato.size(); i++) {

									out.println("<tr class='table-light'>");
									out.println("<td>" + listaContrato.get(i).getCodigocontrato() + "</td>");
									out.println("<td>" + listaContrato.get(i).getValor_contrato() + "</td>");

									out.println("<td>" + listaContrato.get(i).getFecha() + "</td>");
									out.println("<td>" + listaContrato.get(i).getCod_proveedor() + "</td>");
									out.println("<td>" + listaContrato.get(i).getCod_reserva() + "</td>");
							
									out.println("<td>");
									out.println("<button type='button' class='btn btn-warning'>Editar</button>");
									out.println("<button type='button' class='btn btn-danger'>Eliminar </button>");
									out.println("</td>");
									out.println("</tr>");
								}
								%>
							</tbody>
						</table>
					
					
					
					</div>
										<div class="tab-pane fade" id="reservas">
					
					
										<h1>Listado de Rreservas</h1>
						<button type="button" class="btn btn-outline-success">Agregar</button>
						<br> <br>
						<table class="table table-responsive">
							<thead class="table-light">
								<tr>
									<th>Código Reserva</th>
									<th>Fecha_inicio</th>
									<th>Fecha_fin</th>
									<th>Fecha_Entrega</th>
									<th>Código vehiculo</th>
									<th>Código cliente</th>
							
									<th>Acciones</th>

								</tr>
							</thead>
							<tbody>
								<%
								LinkedList<reserva> listaReserva = Controller.getReserva();
								for (int i = 0; i < listaReserva.size(); i++) {

									out.println("<tr class='table-light'>");
									out.println("<td>" + listaReserva.get(i).getCodigoreserva() + "</td>");
									out.println("<td>" + listaReserva.get(i).getFecha_inicio() + "</td>");

									out.println("<td>" + listaReserva.get(i).getFecha_fin() + "</td>");
									out.println("<td>" + listaReserva.get(i).getFecha_entrega() + "</td>");
									out.println("<td>" + listaReserva.get(i).getCodigovehiculo() + "</td>");
									out.println("<td>" + listaReserva.get(i).getCod_cliente() + "</td>");

									out.println("<td>");
									out.println("<button type='button' class='btn btn-warning'>Editar</button>");
									out.println("<button type='button' class='btn btn-danger'>Eliminar </button>");
									out.println("</td>");
									out.println("</tr>");
								}
								%>
							</tbody>
						</table>
					
					
					
					</div>
										<div class="tab-pane fade" id="revisiones">
					
					
										<h1>Listado de Revisiones</h1>
						<button type="button" class="btn btn-outline-success">Agregar</button>
						<br> <br>
						<table class="table table-responsive">
							<thead class="table-light">
								<tr>
									<th>Codigo Revión</th>
									<th>Código vehiculo</th>
									<th>cambio_filtro</th>
									<th>cambio_aceite</th>
									<th>cambio_frenos</th>
								
									<th>Acciones</th>

								</tr>
							</thead>
							<tbody>
								<%
								LinkedList<Revision> listaRevision = Controller.getRevision();
								for (int i = 0; i < listaRevision.size(); i++) {

									out.println("<tr class='table-light'>");
									out.println("<td>" + listaRevision.get(i).getCodigorevision() + "</td>");
									out.println("<td>" + listaRevision.get(i).getCod_vehiculo() + "</td>");

									out.println("<td>" +  listaRevision.get(i).getCambio_filtro() + "</td>");
									out.println("<td>" + listaRevision.get(i).getCambio_aceite() + "</td>");
									out.println("<td>" + listaRevision.get(i).getCambio_frenos() + "</td>");
							
									out.println("<td>");
									out.println("<button type='button' class='btn btn-warning'>Editar</button>");
									out.println("<button type='button' class='btn btn-danger'>Eliminar </button>");
									out.println("</td>");
									out.println("</tr>");
								}
								%>
							</tbody>
						</table>
					
					
					
					</div>
				</div>
			</div>


		</div>
	</div>
	<script>
		let sidebarToggle = document.querySelector(".sidebarToggle");
		sidebarToggle.addEventListener("click",
				function() {
					document.querySelector("body").classList.toggle("active");
					document.getElementById("sidebarToggle").classList
							.toggle("active");
				})
				
				$(document).on('change','.btn-file :file',function(){
  var input = $(this);
  var numFiles = input.get(0).files ? input.get(0).files.length : 1;
  var label = input.val().replace(/\\/g,'/').replace(/.*\//,'');
  input.trigger('fileselect',[numFiles,label]);
});
$(document).ready(function(){
  $('.btn-file :file').on('fileselect',function(event,numFiles,label){
    var input = $(this).parents('.input-group').find(':text');
    var log = numFiles > 1 ? numFiles + ' files selected' : label;
    if(input.length){ input.val(log); }else{ if (log) alert(log); }
  });
});
	</script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>
