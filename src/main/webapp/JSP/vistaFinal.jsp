<%-- 
    Document   : vistaFinal
    Created on : 8 nov. 2023, 16:47:04
    Author     : Pedro Lazaro
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.page contentType="text/html" pageEncoding="UTF-8"/>
<!DOCTYPE html>
<html>
<html lang="es">
    <head>
        <jsp:directive.include file="/INC/metas.inc"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./CSS/styles.css" rel="stylesheet" type="text/css"/>
        <title>Capitalizacion</title>
    </head>
    <body>
        <div class="main-container">
            <h4>Tus datos capitalizados: </h4><br>
            <p>Nombre: ${sessionScope.nombre}</p><br>
            <p>Apellidos: ${sessionScope.apellido}</p>
        <div>
    </body>
</html>
