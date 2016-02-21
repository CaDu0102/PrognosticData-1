
<%@ page import="prognosticdata.Plano_Saude" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'plano_Saude.label', default: 'Plano_Saude')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-plano_Saude" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-plano_Saude" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list plano_Saude">
			
				<g:if test="${plano_SaudeInstance?.nome_empresa}">
				<li class="fieldcontain">
					<span id="nome_empresa-label" class="property-label"><g:message code="plano_Saude.nome_empresa.label" default="Nomeempresa" /></span>
					
						<span class="property-value" aria-labelledby="nome_empresa-label"><g:fieldValue bean="${plano_SaudeInstance}" field="nome_empresa"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${plano_SaudeInstance?.tipo_plano}">
				<li class="fieldcontain">
					<span id="tipo_plano-label" class="property-label"><g:message code="plano_Saude.tipo_plano.label" default="Tipoplano" /></span>
					
						<span class="property-value" aria-labelledby="tipo_plano-label"><g:fieldValue bean="${plano_SaudeInstance}" field="tipo_plano"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:plano_SaudeInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${plano_SaudeInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
