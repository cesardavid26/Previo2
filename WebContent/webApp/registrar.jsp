<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar</title>
<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
 <link rel="stylesheet" type="text/css" href="../estilo/css.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-primary" id="nav">
		
  <a class="navbar-brand" id="zam" href="index.html">Soldier 26</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
</nav><br>
<aside><br><br>
  <div class="row justify-content-center align-self-center"  >
    <div class="col col-sm-8 col-md-8 col-lg-4 col-xl-4 h-100" id="level1">
      <h2 id="nom">Registrar</h2>
      
      <hr>
        <form id="formLogin" method="post" action="CarreraController">
 
          <div class="form-group row"><br>
        
            <label for="inputEmail3" style="text-align: left;" class="col-sm-3 col-form-label">Codigo</label>
            <div class="col-sm-9">
            <input type="text" class="form-control" name="codigo" placeholder="Cedula" required="Llena este campo">
           </div>
          </div>
          <div class="form-group row">
           <label for="inputEmail3" style="text-align: left;" class="col-sm-3 col-form-label">Nombre</label>
          <div class="col-sm-9">
          <input type="text" class="form-control" name="nombre" placeholder="Contraseña" required="Llena este campo">
          </div>
         </div>
         <div class="form-group row">
           <label for="inputEmail3" style="text-align: left;" class="col-sm-3 col-form-label">Creditos</label>
          <div class="col-sm-9">
          <input type="text" class="form-control" name="credito" placeholder="Contraseña" required="Llena este campo">
          </div>
         </div>
         <div class="form-group row">
           <label for="inputEmail3" style="text-align: left;" class="col-sm-3 col-form-label">Semestres</label>
          <div class="col-sm-9">
          <input type="text" class="form-control" name="semestre" placeholder="Contraseña" required="Llena este campo">
          </div>
         </div>
         
  <div class="col-sm-12">
      <button type="submit" name="accion" value="ingresar" class="btn btn-dark" >Registrar</button><br><br>
    </div>
    

  </form>
</div>
</div>
</aside>

<footer class="bg-dark rounded-top text-center">
  <div class="container py-1">
    <p class="text-white my-2">
      Derechos Reservados - 2020
    </p>
  </div>
</footer>
</body>
</html>