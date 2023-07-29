<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<title>Capacitaciones</title>
	<link rel="stylesheet" href="static/css/style.css">
	<!-- CSS de Bootstrap -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>
<body>
	<%@ include file="menu.jsp" %>
	<section>
		<div class="container">
	        <h4 class="titulo-form">Listado de Capacitaciones</h4>
			<a class="btn btn-dark btn-agregar-capacitacion" href="/ProyectoSpringMVC/crearCapacitacion">Agregar Capacitación</a>
	        <table class="table table-striped table-hover">
	            <thead>
	                <tr>
	                	<th>ID</th>
	                    <th>Nombre</th>
	                    <th>Detalle</th>
	                </tr>
	            </thead>
	            <tbody>
		                <tr>
		                	<td>1</td>
	                        <td>Test</td>
	                        <td>Detalle test</td>
	                    </tr>
	            </tbody>
	        </table>
	    </div>
	</section>
	<%@ include file="footer.jsp" %>
	
	<!-- JS de Bootstrap -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="static/js/index.js"></script>
</body>
</html>