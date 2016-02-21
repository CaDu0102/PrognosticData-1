package prognosticdata

class FilterLoginFilters {

    def filters = {  // filtro de usuarios
        all(controller:'usuario', action:'paginaLogin',invert:true) {
            before = {
                if(session.usuario){
                    true
                }else{
                    redirect(controller: 'usuario',action: 'paginaLogin') //(Mudado)
                }
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
