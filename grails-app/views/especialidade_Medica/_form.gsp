<%@ page import="prognosticdata.Especialidade_Medica" %>



<div class="fieldcontain ${hasErrors(bean: especialidade_MedicaInstance, field: 'nome_especialidade', 'error')} required">
	<label for="nome_especialidade">
		<g:message code="especialidade_Medica.nome_especialidade.label" default="Nomeespecialidade" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome_especialidade" maxlength="100" required="" value="${especialidade_MedicaInstance?.nome_especialidade}"/>

</div>

