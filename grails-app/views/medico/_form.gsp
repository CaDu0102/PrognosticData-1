<%@ page import="prognosticdata.Medico" %>



<div class="fieldcontain ${hasErrors(bean: medicoInstance, field: 'nome', 'error')} required">
	<label for="nome">
		<g:message code="medico.nome.label" default="Nome" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome" maxlength="100" required="" value="${medicoInstance?.nome}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: medicoInstance, field: 'matricula', 'error')} required">
	<label for="matricula">
		<g:message code="medico.matricula.label" default="Matricula" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="matricula" maxlength="20" required="" value="${medicoInstance?.matricula}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: medicoInstance, field: 'crm', 'error')} required">
	<label for="crm">
		<g:message code="medico.crm.label" default="Crm" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="crm" maxlength="20" required="" value="${medicoInstance?.crm}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: medicoInstance, field: 'data_admissao', 'error')} required">
	<label for="data_admissao">
		<g:message code="medico.data_admissao.label" default="Dataadmissao" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="data_admissao" precision="day"  value="${medicoInstance?.data_admissao}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: medicoInstance, field: 'especialidade', 'error')} ">
	<label for="especialidade">
		<g:message code="medico.especialidade.label" default="Especialidade" />
		
	</label>
	<g:select name="especialidade" from="${prognosticdata.Especialidade_Medica.list()}" multiple="multiple" optionKey="id" size="5" value="${medicoInstance?.especialidade*.id}" class="many-to-many"/>

</div>

