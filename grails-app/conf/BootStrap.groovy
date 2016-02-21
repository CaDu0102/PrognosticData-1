import prognosticdata.Usuario

class BootStrap {

    def init = { servletContext ->

        //Criação de um Policial
        def u1 = new Usuario (nome: 'Carlos Cesar Duarte',usuario: 'z',senha:'1',cargo: 'Medico')
        //u1.senha = u1.senha.encodeAsMD5()
        u1.save(flush: true)

    }
    def destroy = {
    }
}
