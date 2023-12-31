<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<title>Contacto</title>
	<link rel="stylesheet" href="static/css/style.css">
    <!-- CSS de Bootstrap -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>
<body>
	<%@ include file="menu.jsp" %>
	<main class="container main-forms container-contacto">
		<h4 class="titulo-form">Formulario de Contacto</h4>
        <form action='formContacto' method='post' onsubmit="mostrarModal()">
        	<div class="form-floating form-control-personalizado">
                <input type="text" class="form-control input-personalizado" id="nombre" name="nombre" required>
                <label for="nombre">Nombre</label>
            </div>
            <div class="form-floating form-control-personalizado">
                <input type="email" class="form-control input-personalizado" id="email" name="email" required>
                <label for="email">Correo electrónico</label>
            </div>
            <div class="form-floating form-control-personalizado">
                <textarea class="form-control input-personalizado" id="consulta" name="consulta" rows="5" required></textarea>
                <label for="consulta">Mensaje</label>
            </div>
            <button type="submit" class="btn btn-dark btn-submit-personalizado">Enviar</button>
        </form>
	</main>
	<%@ include file="footer.jsp" %>
	<!-- JS de Bootstrap -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="static/js/index.js"></script>
</body>
</html>