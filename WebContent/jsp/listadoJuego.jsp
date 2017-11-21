<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de juegos</title>
</head>
<body>
	<h3>Listado de todos los videojuegos</h3>
	
	<jsp:useBean id='juegos' class="Model.Juego"/>
	
	<jsp:setProperty property="titulo" name="juegos" value="CoD"/>
	<jsp:setProperty property="genero" name="juegos" value="Belico"/>
	<jsp:setProperty property="consola" name="juegos" value="PS4"/>

	<p>CoD</p>
	
	<jsp:getProperty property="titulo" name="juegos"/>
	<jsp:getProperty property="genero" name="juegos"/>
	<jsp:getProperty property="consola" name="juegos"/>
	
	<c:forEach items="${listadoJuegos}" var="elemento">
	
		<p>Consola -> ${elemento.getConsola()}</p>
		
		<p>Título -> ${elemento.getTitulo()}</p>
		
		<p>Género -> ${elemento.getGenero()}</p>
		
		
		<br>
	</c:forEach>
	
</body>
</html>