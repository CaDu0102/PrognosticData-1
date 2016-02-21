package prognosticdata



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class Plano_SaudeController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Plano_Saude.list(params), model:[plano_SaudeInstanceCount: Plano_Saude.count()]
    }

    def show(Plano_Saude plano_SaudeInstance) {
        respond plano_SaudeInstance
    }

    def create() {
        respond new Plano_Saude(params)
    }

    @Transactional
    def save(Plano_Saude plano_SaudeInstance) {
        if (plano_SaudeInstance == null) {
            notFound()
            return
        }

        if (plano_SaudeInstance.hasErrors()) {
            respond plano_SaudeInstance.errors, view:'create'
            return
        }

        plano_SaudeInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'plano_Saude.label', default: 'Plano_Saude'), plano_SaudeInstance.id])
                redirect plano_SaudeInstance
            }
            '*' { respond plano_SaudeInstance, [status: CREATED] }
        }
    }

    def edit(Plano_Saude plano_SaudeInstance) {
        respond plano_SaudeInstance
    }

    @Transactional
    def update(Plano_Saude plano_SaudeInstance) {
        if (plano_SaudeInstance == null) {
            notFound()
            return
        }

        if (plano_SaudeInstance.hasErrors()) {
            respond plano_SaudeInstance.errors, view:'edit'
            return
        }

        plano_SaudeInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Plano_Saude.label', default: 'Plano_Saude'), plano_SaudeInstance.id])
                redirect plano_SaudeInstance
            }
            '*'{ respond plano_SaudeInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Plano_Saude plano_SaudeInstance) {

        if (plano_SaudeInstance == null) {
            notFound()
            return
        }

        plano_SaudeInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Plano_Saude.label', default: 'Plano_Saude'), plano_SaudeInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'plano_Saude.label', default: 'Plano_Saude'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
