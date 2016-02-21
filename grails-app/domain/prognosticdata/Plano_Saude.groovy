package prognosticdata

class Plano_Saude {

    String nome_empresa
    Tipo tipo_plano

    static belongsTo = Paciente

    static constraints = {

        nome_empresa   maxSize:100, blank: false, nullable: false
        tipo_plano     maxSize:15, blank: false, nullable: false

    }
}

enum Tipo {

    particial, total

}