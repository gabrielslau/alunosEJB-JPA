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
	<h3>Novo Aluno EJB-JPA</h3>
	<f:view>
		<h:outputText value="#{alunoMB.mensagem}"
			rendered="#{alunoMB.temMensagem}" style="color: #0000FF"></h:outputText>
		<h:form>
			<h:panelGrid columns="2" border="1">
				<h:outputLabel value="CPF: "></h:outputLabel>
				<h:inputText value="#{alunoMB.cpf}" required="true"></h:inputText>
				<h:outputLabel value="Nome: "></h:outputLabel>
				<h:inputText value="#{alunoMB.nome}"></h:inputText>
				<h:outputLabel value="Matrícula: "></h:outputLabel>
				<h:inputText value="#{alunoMB.matricula}"></h:inputText>
				<h:outputLabel value="Email: "></h:outputLabel>
				<h:inputText value="#{alunoMB.email}"></h:inputText>
			</h:panelGrid>
			<h:commandButton value="Cadastrar Aluno" action="#{alunoMB.add}"></h:commandButton>
			<br>
			<h:commandLink value="Voltar" action="index.jsp"></h:commandLink>
		</h:form>
	</f:view>
</body>
</html>