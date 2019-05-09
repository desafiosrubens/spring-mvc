<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:ui="http://java.sun.com/jsf/facelets">

<ui:composition template="_template.xhtml">
	<ui:define name="titulo">
		<h1>Projeto de Exemplo Spring.</h1>
	</ui:define>
	<ui:define name="conteudo">
	<fieldset>
	<legend>Dado dos Livros</legend>
		<table>
			<tr>
				<td>Java 8 Pratica</td>
				<td>Certificação OCP</td>
			</tr>
			<tr>
				<td>TDD - Na Partica</td>
				<td>Certificação OCP 2</td>
			</tr>
		</table>
	</fieldset>
	</ui:define>
</ui:composition>
</html>