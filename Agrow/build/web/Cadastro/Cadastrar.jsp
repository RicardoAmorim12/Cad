<%-- 
    Document   : Cadastrar
    Created on : 20/02/2020, 14:59:39
    Author     : ricar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Language" content="pt-br">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">	
        <style>
            body{
	background-image: url(lavoura.jpg);
	
	background-position: center, center fixed; 
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;

}
.container{
	margin-top: 10%;
}

        </style>

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
	
<form action="<%=request.getServletContext().getContextPath()%>/cadastro/CadastroSave" name="cadastro" method="post">
  
    <div class="form-group">
    <label for="cliente">Cliente:</label>
    <input type="text" class="form-control" id="name" required="required" placeholder="Nome do Cliente">
  </div>
  <div class="form-group">
    <label for="solicitante">Solicitante:</label>
    <input type="text" class="form-control" id="soli" placeholder="Nome do Solicitante">
  </div>
  <div class="form-group">
  <label for="descricao">Descricao:</label>
  <textarea class="form-control" rows="5" id="descricao"  placeholder="Descricao"></textarea>
</div>
<div class="form-group">
    <label for="data_limite">Data limite:</label>
    <input type="date" class="form-control" id="data" >
  </div>
  <div class="form-group">
    <label for="responsavel">Responsavel</label>
    <select class="form-control" id="resp" required="required">
      <option>Ricardo</option>
      <option>Yago</option>
      <option>Odirlei</option>
      <option>Imepac</option>
      <option>aGrow</option>
    </select>
  </div>
    <button type="submit" class="btn btn-success" value="Enviar">Salvar</button>
</form>
</div>
    </body>
</html>
