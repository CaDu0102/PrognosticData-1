<%@ page import="prognosticdata.Paciente" %>



<div class="fieldcontain ${hasErrors(bean: pacienteInstance, field: 'nome', 'error')} required">
	<label for="nome">
		<g:message code="paciente.nome.label" default="Nome" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome" maxlength="100" required="" value="${pacienteInstance?.nome}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pacienteInstance, field: 'cpf', 'error')} required">
	<label for="cpf">
		<g:message code="paciente.cpf.label" default="Cpf" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="cpf" maxlength="11" required="" value="${pacienteInstance?.cpf}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pacienteInstance, field: 'data_nascimento', 'error')} required">
	<label for="data_nascimento">
		<g:message code="paciente.data_nascimento.label" default="Datanascimento" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="data_nascimento" precision="day"  value="${pacienteInstance?.data_nascimento}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: pacienteInstance, field: 'sexo', 'error')} required">
	<label for="sexo">
		<g:message code="paciente.sexo.label" default="Sexo" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="sexo" from="${prognosticdata.Sexo?.values()}" keys="${prognosticdata.Sexo.values()*.name()}" required="" value="${pacienteInstance?.sexo?.name()}" />

</div>

<div class="fieldcontain ${hasErrors(bean: pacienteInstance, field: 'endereco', 'error')} required">
	<label for="endereco">
		<g:message code="paciente.endereco.label" default="Endereco" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="endereco" maxlength="100" required="" value="${pacienteInstance?.endereco}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pacienteInstance, field: 'cidade', 'error')} required">
	<label for="cidade">
		<g:message code="paciente.cidade.label" default="Cidade" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="cidade" maxlength="100" required="" value="${pacienteInstance?.cidade}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pacienteInstance, field: 'uf', 'error')} required">
	<label for="uf">
		<g:message code="paciente.uf.label" default="Uf" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="uf" from="${prognosticdata.Uf?.values()}" keys="${prognosticdata.Uf.values()*.name()}" required="" value="${pacienteInstance?.uf?.name()}" />

</div>

<div class="fieldcontain ${hasErrors(bean: pacienteInstance, field: 'telefone', 'error')} required">
	<label for="telefone">
		<g:message code="paciente.telefone.label" default="Telefone" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="telefone" maxlength="14" required="" value="${pacienteInstance?.telefone}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pacienteInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="paciente.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="email" maxlength="60" required="" value="${pacienteInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pacienteInstance, field: 'plano', 'error')} ">
	<label for="plano">
		<g:message code="paciente.plano.label" default="Plano" />
		
	</label>
	<g:select name="plano" from="${prognosticdata.Plano_Saude.list()}" multiple="multiple" optionKey="id" size="5" value="${pacienteInstance?.plano*.id}" class="many-to-many"/>

</div>

