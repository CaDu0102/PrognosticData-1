<%@ page import="prognosticdata.Atendimento" %>



<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'data', 'error')} required">
	<label for="data">
		<g:message code="atendimento.data.label" default="Data" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="data" precision="day"  value="${atendimentoInstance?.data}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'diagnostico', 'error')} ">
	<label for="diagnostico">
		<g:message code="atendimento.diagnostico.label" default="Diagnostico" />
		
	</label>
	<g:select name="diagnostico" from="${prognosticdata.Diagnostico.list()}" multiple="multiple" optionKey="id" size="5" value="${atendimentoInstance?.diagnostico*.id}" class="many-to-many"/>

</div>

<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'medico', 'error')} ">
	<label for="medico">
		<g:message code="atendimento.medico.label" default="Medico" />
		
	</label>
	<g:select name="medico" from="${prognosticdata.Medico.list()}" multiple="multiple" optionKey="id" size="5" value="${atendimentoInstance?.medico*.id}" class="many-to-many"/>

</div>

<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'paciente', 'error')} ">
	<label for="paciente">
		<g:message code="atendimento.paciente.label" default="Paciente" />
		
	</label>
	<g:select name="paciente" from="${prognosticdata.Paciente.list()}" multiple="multiple" optionKey="id" size="5" value="${atendimentoInstance?.paciente*.id}" class="many-to-many"/>

</div>

