<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<title>Usuarios</title>
	<link rel="stylesheet" href="static/css/style.css">
	<!-- CSS de Bootstrap -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>
<body>
	<%@ include file="menu.jsp" %>
	<section class="container-capacitaciones">
		<div class="container">
	        <h4 class="titulo-form">Listado de Usuarios</h4>
	        <table class="table table-striped table-hover">
	            <thead>
	                <tr>
	                	<th>ID</th>
	                    <th>Nombre</th>
	                    <th>Fecha de nacimiento</th>
	                    <th>Rut</th>
	                    <th>Tipo</th>
	                </tr>
	            </thead>
	            <tbody>
	            <c:forEach items="${usuarios}" var="usuario">
		            <tr>
	                	<td>${usuario.id}</td>
                        <td>${usuario.nombre}</td>
                        <td>${usuario.fechaNacimiento}</td>
                        <td>${usuario.rut}</td>
                        <td>${usuario.tipo}</td>
                    </tr>
		        </c:forEach>
		          	
		                
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