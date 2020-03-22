<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Alteração de URL</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="/webjars/jquery/3.4.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet"href="/webjars/bootstrap/4.4.1/css/bootstrap.min.css" />
</head>
<body>
	<div class="container-fluid p-5">
	<h3 class="text-center jumbotron">Alterar dados da URL</h3>

	<div class="alert alert-info">
	<a href="#" class="close" data-dismiss="alert">x</a>
	<i class="fas fa-info-circle mr-2"></i>${msg}
	</div>

<form method="post" action="/alterar/alterar" id="formEdit">
		
		<br/>ID<br/>
		<input type="number" name="idurl" id="idurl" size="10"  required="required" value="${url.idurl}" readonly/>
		
		<br/>URL<br/>
		<input type="text" name="url" id="url" required="required" value="${url.url}"/>
		
		<br/>URL encurtada<br/>
		<input type="text" name="urlencurtada" id="urlencurtada" required="required" value="${url.urlencurtada}" readonly/>
		<br/>
		<input type="hidden" id="shorturl_hidden" name="shorturl_hidden" required> <br />
		
		
		
		<button type="submit" class="btn btn-info mt-2">Alterar dados</button>
		<a href="/" class="btn btn-info mt-2">Voltar</a>
	</form>
	</div>

		<button onClick="getShortUrl()" id="btn2Submit" class="btn btn-info mt-2">Alterar</button>

<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script src="/js/mainEdit.js"></script>
</body>
</html>