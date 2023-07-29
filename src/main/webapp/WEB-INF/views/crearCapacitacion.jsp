<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<title>Crear Capacitación</title>
	<link rel="stylesheet" href="static/css/style.css">
    <!-- CSS de Bootstrap -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>
<body>
	<%@ include file="menu.jsp" %>
	<main class="container main-forms container-crearCapacitacion">
        <h4 class="titulo-form">Crear Capacitación</h4>
        <form action="CrearCapacitacion" method="post">
        	<input type="hidden" name="formulario" value="capacitacion">
            <div class="form-floating form-control-personalizado">
                <input type="text" id="nombre" name="nombre" class="form-control input-personalizado">
                <label for="nombre">Nombre</label>
            </div>
            <div class="form-floating form-control-personalizado">
                <input id="lugar" name="lugar" class="form-control input-personalizado">
                <label for="lugar">Lugar</label>
            </div>
            <div class="form-floating form-control-personalizado">
                <input type="date" id="fecha" name="fecha" class="form-control input-personalizado">
                <label for="fecha">Fecha</label>
            </div>
            <div class="form-floating form-control-personalizado">
                <input type="time" id="hora" name="hora" class="form-control input-personalizado">
                <label for="hora">Hora</label>
            </div>
            <div class="form-floating form-control-personalizado">
                <input id="duracion" name="duracion" class="form-control input-personalizado">
                <label for="duracion">Duración</label>
            </div>
            <button type="submit" class="btn btn-dark btn-submit-personalizado">Crear</button>
        </form>
	</main>
	<%@ include file="footer.jsp" %>
	
	<!-- JS de Bootstrap -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="static/js/index.js"></script>
</body>
</html>