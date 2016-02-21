package prognosticdata

class Atendimento {

    Date data

    static hasMany = [diagnostico:Diagnostico,paciente:Paciente,medico:Medico]


    static constraints = {

        data blank: false, nullable: false

    }
}
