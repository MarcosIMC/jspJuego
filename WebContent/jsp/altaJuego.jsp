<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alta juego</title>
</head>
<body>

	<h3>Inserta los datos del videojuego</h3>

	<br>

	<form method="post" action="?peticion=insertar">
	
		<input type="text" name="consola" placeholder="Consola">
		
		<input type="text" name="titulo" placeholder="Título">
		
		<input type="text" name="genero" placeholder="Género">
		
		<input type="submit" value="Registrar">
	
	</form>
</body>
</html>