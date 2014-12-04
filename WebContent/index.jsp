<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alunos EJB-JPA</title>
</head>
<body>
	<h3>Alunos EJB-JPA</h3>
	<f:view>
		<h:dataTable border="1" value="#{alunoMB.alunos}" var="aluno">
			<h:column id="column1">
				<h:outputText value="#{aluno.cpf}"></h:outputText>
				<f:facet name="header">
					<h:outputText value="CPF"></h:outputText>
				</f:facet>
			</h:column>
			<h:column id="column2">
				<h:outputText value="#{aluno.nome}"></h:outputText>
				<f:facet name="header">
					<h:outputText value="Nome"></h:outputText>
				</f:facet>
			</h:column>
			<h:column id="column3">
				<h:outputText value="#{aluno.matricula}"></h:outputText>
				<f:facet name="header">
					<h:outputText value="Matrícula"></h:outputText>
				</f:facet>
			</h:column>
			<h:column id="column4">
				<h:outputText value="#{aluno.email}"></h:outputText>
				<f:facet name="header">
					<h:outputText value="Email"></h:outputText>
				</f:facet>
			</h:column>
		</h:dataTable>
	</f:view>
</body>
</html>