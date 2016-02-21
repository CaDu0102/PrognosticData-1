package prognosticdata

class Especialidade_Medica {

    String nome_especialidade

    static belongsTo = Medico

    static constraints = {

        nome_especialidade     maxSize:100, blank: false, nullable: false

    }
}
