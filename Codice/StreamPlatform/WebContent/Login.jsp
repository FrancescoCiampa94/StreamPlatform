<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
<script src="https://kit.fontawesome.com/a076d05399.js"></script>
<link rel="stylesheet" href="grafica.css">
<title>www.StreamPlatform.com</title>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" style="color: #fe0114" href="Menu.jsp">StreamPlatform</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarText">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="Menu.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="ServletFilm">Film</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="ServletSerieTv">Serie TV</a>
      </li>
    </ul>
    
	
    <ul class="navbar-nav" id="ULPulsanti">
    	<li><a href="Login.jsp">LOGIN</a></li>
    	<li><a href="Registrazione.jsp">REGISTRATI</a></li>
    </ul>
  </div>
</nav>








<footer class="footer">
	<div class="container">
  		<div class="row">
    		<div class="col-sm">
      			<div class="footerInformazioni">
					<p style="color: gray;">Domande? chiama 800 900 313</p>
					<ul class="footerInformazioniLeft">
						<li><a href="#">Domande Frequenti</a></li>
						<li><a href="#">Rapporti con investitori</a></li>
						<li><a href="#">Come guardare con StreamPlatform</a></li>
						<li><a href="#">Work in progress</a></li>
					</ul>
				</div>	
    		</div>
    		<div class="col-sm">
    			 <p style="color:grey;text-align:center;">Contatti social</p>
      				<ul class="socialFooter">
						<li><a href="#"><i class="fab fa-facebook"></i></a></li>
						<li><a href="#"><i class="fab fa-instagram"></i></a></li>
						<li><a href="#"><i class="fab fa-youtube"></i></a></li>
					</ul>
    			</div>
    		<div class="col-sm">
      			<p style="color:grey;text-align: center;">all right reserved</p>
    		</div>
  		</div>
	</div>
</footer>



</body>
</html>