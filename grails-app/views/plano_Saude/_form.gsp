<%@ page import="prognosticdata.Plano_Saude" %>



<div class="fieldcontain ${hasErrors(bean: plano_SaudeInstance, field: 'nome_empresa', 'error')} required">
	<label for="nome_empresa">
		<g:message code="plano_Saude.nome_empresa.label" default="Nomeempresa" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome_empresa" maxlength="100" required="" value="${plano_SaudeInstance?.nome_empresa}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: plano_SaudeInstance, field: 'tipo_plano', 'error')} required">
	<label for="tipo_plano">
		<g:message code="plano_Saude.tipo_plano.label" default="Tipoplano" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="tipo_plano" from="${prognosticdata.Tipo?.values()}" keys="${prognosticdata.Tipo.values()*.name()}" required="" value="${plano_SaudeInstance?.tipo_plano?.name()}" />

</div>

