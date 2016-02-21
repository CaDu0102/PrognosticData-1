
<%@ page import="prognosticdata.Atendimento" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'atendimento.label', default: 'Atendimento')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-atendimento" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-atendimento" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list atendimento">
			
				<g:if test="${atendimentoInstance?.data}">
				<li class="fieldcontain">
					<span id="data-label" class="property-label"><g:message code="atendimento.data.label" default="Data" /></span>
					
						<span class="property-value" aria-labelledby="data-label"><g:formatDate date="${atendimentoInstance?.data}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${atendimentoInstance?.diagnostico}">
				<li class="fieldcontain">
					<span id="diagnostico-label" class="property-label"><g:message code="atendimento.diagnostico.label" default="Diagnostico" /></span>
					
						<g:each in="${atendimentoInstance.diagnostico}" var="d">
						<span class="property-value" aria-labelledby="diagnostico-label"><g:link controller="diagnostico" action="show" id="${d.id}">${d?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${atendimentoInstance?.medico}">
				<li class="fieldcontain">
					<span id="medico-label" class="property-label"><g:message code="atendimento.medico.label" default="Medico" /></span>
					
						<g:each in="${atendimentoInstance.medico}" var="m">
						<span class="property-value" aria-labelledby="medico-label"><g:link controller="medico" action="show" id="${m.id}">${m?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${atendimentoInstance?.paciente}">
				<li class="fieldcontain">
					<span id="paciente-label" class="property-label"><g:message code="atendimento.paciente.label" default="Paciente" /></span>
					
						<g:each in="${atendimentoInstance.paciente}" var="p">
						<span class="property-value" aria-labelledby="paciente-label"><g:link controller="paciente" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:atendimentoInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${atendimentoInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
