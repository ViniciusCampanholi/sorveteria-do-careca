<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ page import="Model.Sorvetes"%>
<%@ page import="java.util.ArrayList"%>
<% 
ArrayList<Sorvetes> lista = (ArrayList<Sorvetes>) request.getAttribute("sorvetes"); 
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset = "utf-8">
		<title>Avaliação de pedido</title>
		<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
		<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-colors-highway.css">
	</head>
	<body>
		<header>
			<div class="w3-container w3-bar w3-pale-red">
				<h1>Sorveteria do careca !</h1>
			</div>
			<nav class="w3-bar w3-pale-red">
				<a href="pedir.html" class="w3-bar-item w3-button">Pedir</a>
				<a href="Avaliação.jsp" class="w3-bar-item w3-button">Avaliar</a>
			</nav>
		</header>
		<div class="w3-row-padding">
			<div class="w3-panel w3-col s12">
				<div class="w3-card-4 w3-leftbar w3-rightbar w3-bottombar w3-border-purple">
					<header class="w3-container w3-purple">
						<label>Sorvetes avaliados</label>
					</header>
					<div class="w2-responsive">
						<table class="w3-table-all w3-hoverable w3-centered">
							<tr class="w3-pale-red">
								<th scope="col">Id</th>
								<th scope="col">Produto</th>
								<th scope="col">Avaliacao</th>
							</tr>   
							<%for (int i=0;i<lista.size();i++) { %>
								<tr class="w3-light-grey w3-hover-purple">
									<td><%=lista.get(i).getID_sorvete() %></td>
									<td><%=lista.get(i).getNome_sorvete() %></td>
									<td><%=lista.get(i).getAvaliacao() %></td>
								</tr> 
							<%} %>
						</table>
					</div>
				</div>
			</div>
		</div>	
	</body>
	<footer class="w3-container w3-pale-red " style="width:100%;">
		<p>Desenvolvido por Cauê Caversan | Samuel Aguiar | Vinícius Campanholi</p>
		<p>Para a matéria de Sistemas Cliente - Servidor</p>
	</footer>
</html>