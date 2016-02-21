package prognosticdata

class Medico {

    String nome
    String matricula
    String crm
    Date data_admissao

    static belongsTo = Atendimento
    static hasMany = [especialidade:Especialidade_Medica]

    static constraints = {

        nome               maxSize:100, blank: false, nullable: false
        matricula          maxSize:20, blank: false, nullable: false
        crm                maxSize:20, blank: false, nullable: false
        data_admissao      blank: false, nullable: false

    }
}
