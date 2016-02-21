import prognosticdata.Diagnostico
import prognosticdata.Especialidade_Medica
import prognosticdata.Plano_Saude
import prognosticdata.Usuario

class BootStrap {

    def init = { servletContext ->

        //Criação de um Usuario-----------------------------------------------------------------------------------------
        def u1 = new Usuario (nome: 'Carlos Cesar Duarte',usuario: 'z',senha:'1',cargo: 'Medico')
        //u1.senha = u1.senha.encodeAsMD5()
        u1.save(flush: true)

        //Fim -------------------------------------------------------------------------------------Criação de um Usuario


        //Criação de um Especialidade_Medica----------------------------------------------------------------------------
        def em1 = new Especialidade_Medica (nome_especialidade: 'Acupuntura')
        em1.save(flush: true)

        def em2 = new Especialidade_Medica (nome_especialidade: 'Alergia e Imunologia')
        em2.save(flush: true)

        def em3 = new Especialidade_Medica (nome_especialidade: 'Anestesiologia')
        em3.save(flush: true)

        def em4 = new Especialidade_Medica (nome_especialidade: 'Angiologia')
        em4.save(flush: true)

        def em5 = new Especialidade_Medica (nome_especialidade: 'Cancerologia')
        em5.save(flush: true)

        def em6 = new Especialidade_Medica (nome_especialidade: 'Cardiologia')
        em6.save(flush: true)

        def em7 = new Especialidade_Medica (nome_especialidade: 'Cirurgia Cardiovascular')
        em7.save(flush: true)

        def em8 = new Especialidade_Medica (nome_especialidade: 'Cirurgia da Mão')
        em8.save(flush: true)

        def em9 = new Especialidade_Medica (nome_especialidade: 'Cirurgia de cabeça e pescoço')
        em9.save(flush: true)

        def em10 = new Especialidade_Medica (nome_especialidade: 'Cirurgia do Aparelho Digestivo')
        em10.save(flush: true)

        def em11 = new Especialidade_Medica (nome_especialidade: 'Cirurgia Geral')
        em11.save(flush: true)

        def em12 = new Especialidade_Medica (nome_especialidade: 'Cirurgia Pediátrica')
        em12.save(flush: true)

        def em13 = new Especialidade_Medica (nome_especialidade: 'Cirurgia Plástica')
        em13.save(flush: true)

        def em14 = new Especialidade_Medica (nome_especialidade: 'Cirurgia Torácica')
        em14.save(flush: true)

        def em15 = new Especialidade_Medica (nome_especialidade: 'Cirurgia Vascular')
        em15.save(flush: true)

        def em16 = new Especialidade_Medica (nome_especialidade: 'Clínica Médica ')
        em16.save(flush: true)

        def em17 = new Especialidade_Medica (nome_especialidade: 'Coloproctologia')
        em17.save(flush: true)

        def em18 = new Especialidade_Medica (nome_especialidade: 'Dermatologia')
        em18.save(flush: true)

        def em19 = new Especialidade_Medica (nome_especialidade: 'Endocrinologia e Metabologia')
        em19.save(flush: true)

        def em20 = new Especialidade_Medica (nome_especialidade: 'Endoscopia')
        em20.save(flush: true)

        def em21 = new Especialidade_Medica (nome_especialidade: 'Gastroenterologia')
        em21.save(flush: true)

        def em22 = new Especialidade_Medica (nome_especialidade: 'Genética médica')
        em22.save(flush: true)

        def em23 = new Especialidade_Medica (nome_especialidade: 'Geriatria')
        em23.save(flush: true)

        def em24 = new Especialidade_Medica (nome_especialidade: 'Ginecologia e Obstetrícia')
        em24.save(flush: true)

        def em25 = new Especialidade_Medica (nome_especialidade: 'Hematologia e Hemoterapia')
        em25.save(flush: true)

        def em26 = new Especialidade_Medica (nome_especialidade: 'Homeopatia')
        em26.save(flush: true)

        def em27 = new Especialidade_Medica (nome_especialidade: 'Infectologia')
        em27.save(flush: true)

        def em28 = new Especialidade_Medica (nome_especialidade: 'Mastologia')
        em28.save(flush: true)

        def em29 = new Especialidade_Medica (nome_especialidade: 'Medicina de Família e Comunidade')
        em29.save(flush: true)

        def em30 = new Especialidade_Medica (nome_especialidade: 'Medicina do Trabalho')
        em30.save(flush: true)

        def em31 = new Especialidade_Medica (nome_especialidade: 'Medicina do Tráfego')
        em31.save(flush: true)

        def em32 = new Especialidade_Medica (nome_especialidade: 'Medicina Esportiva')
        em32.save(flush: true)

        def em33 = new Especialidade_Medica (nome_especialidade: 'Medicina Física e Reabilitação')
        em33.save(flush: true)

        def em34 = new Especialidade_Medica (nome_especialidade: 'Medicina Intensiva')
        em34.save(flush: true)

        def em35 = new Especialidade_Medica (nome_especialidade: 'Medicina Legal e Perícia Médica')
        em35.save(flush: true)

        def em36 = new Especialidade_Medica (nome_especialidade: 'Medicina Nuclear')
        em36.save(flush: true)

        def em37 = new Especialidade_Medica (nome_especialidade: 'Medicina Preventiva e Social')
        em37.save(flush: true)

        def em38 = new Especialidade_Medica (nome_especialidade: 'Nefrologia')
        em38.save(flush: true)

        def em39 = new Especialidade_Medica (nome_especialidade: 'Neurocirurgia')
        em39.save(flush: true)

        def em40 = new Especialidade_Medica (nome_especialidade: 'Neurologia')
        em40.save(flush: true)

        def em41 = new Especialidade_Medica (nome_especialidade: 'Nutrologia')
        em41.save(flush: true)

        def em42 = new Especialidade_Medica (nome_especialidade: 'Oftalmologia')
        em42.save(flush: true)

        def em43 = new Especialidade_Medica (nome_especialidade: 'Ortopedia e Traumatologia')
        em43.save(flush: true)

        def em44 = new Especialidade_Medica (nome_especialidade: 'Otorrinolaringologia')
        em44.save(flush: true)

        def em45 = new Especialidade_Medica (nome_especialidade: 'Patologia')
        em45.save(flush: true)

        def em46 = new Especialidade_Medica (nome_especialidade: 'Patologia Clínica/Medicina laboratorial')
        em46.save(flush: true)

        def em47 = new Especialidade_Medica (nome_especialidade: 'Pediatria')
        em47.save(flush: true)

        def em48 = new Especialidade_Medica (nome_especialidade: 'Pneumologia')
        em48.save(flush: true)

        def em49 = new Especialidade_Medica (nome_especialidade: 'Psiquiatria')
        em49.save(flush: true)

        def em50 = new Especialidade_Medica (nome_especialidade: 'Radiologia e Diagnóstico por Imagem')
        em50.save(flush: true)

        def em51 = new Especialidade_Medica (nome_especialidade: 'Radioterapia')
        em51.save(flush: true)

        def em52 = new Especialidade_Medica (nome_especialidade: 'Reumatologia')
        em52.save(flush: true)

        def em53 = new Especialidade_Medica (nome_especialidade: 'Urologia')
        em53.save(flush: true)

        //Fim ------------------------------------------------------------------------Criação de um Especialidade_Medica


        //Criação de um Plano_Saude-------------------------------------------------------------------------------------
        def s1 = new Plano_Saude (nome_empresa: 'Amil',tipo_plano: 'particial')
        //u1.senha = u1.senha.encodeAsMD5()
        s1.save(flush: true)

        def s2 = new Plano_Saude (nome_empresa: 'Amil',tipo_plano: 'total')
        //u1.senha = u1.senha.encodeAsMD5()
        s2.save(flush: true)

        def s3 = new Plano_Saude (nome_empresa: 'ASSIM',tipo_plano: 'particial')
        //u1.senha = u1.senha.encodeAsMD5()
        s3.save(flush: true)

        def s4 = new Plano_Saude (nome_empresa: 'ASSIM',tipo_plano: 'total')
        //u1.senha = u1.senha.encodeAsMD5()
        s4.save(flush: true)

        def s5 = new Plano_Saude (nome_empresa: 'Bradesco',tipo_plano: 'particial')
        //u1.senha = u1.senha.encodeAsMD5()
        s5.save(flush: true)

        def s6 = new Plano_Saude (nome_empresa: 'Bradesco',tipo_plano: 'total')
        //u1.senha = u1.senha.encodeAsMD5()
        s6.save(flush: true)

        def s7 = new Plano_Saude (nome_empresa: 'Golden Cross',tipo_plano: 'particial')
        //u1.senha = u1.senha.encodeAsMD5()
        s7.save(flush: true)

        def s8 = new Plano_Saude (nome_empresa: 'Golden Cross',tipo_plano: 'total')
        //u1.senha = u1.senha.encodeAsMD5()
        s8.save(flush: true)

        def s9 = new Plano_Saude (nome_empresa: 'dix',tipo_plano: 'particial')
        //u1.senha = u1.senha.encodeAsMD5()
        s9.save(flush: true)

        def s10 = new Plano_Saude (nome_empresa: 'dix',tipo_plano: 'total')
        //u1.senha = u1.senha.encodeAsMD5()
        s10.save(flush: true)

        def s11 = new Plano_Saude (nome_empresa: 'Sulamerica',tipo_plano: 'particial')
        //u1.senha = u1.senha.encodeAsMD5()
        s11.save(flush: true)

        def s12 = new Plano_Saude (nome_empresa: 'Sulamerica',tipo_plano: 'total')
        //u1.senha = u1.senha.encodeAsMD5()
        s12.save(flush: true)
        def s13 = new Plano_Saude (nome_empresa: 'Unimed',tipo_plano: 'particial')
        //u1.senha = u1.senha.encodeAsMD5()
        s13.save(flush: true)

        def s14 = new Plano_Saude (nome_empresa: 'Unimed',tipo_plano: 'total')
        //u1.senha = u1.senha.encodeAsMD5()
        s14.save(flush: true)

        def s15 = new Plano_Saude (nome_empresa: 'Medial',tipo_plano: 'particial')
        //u1.senha = u1.senha.encodeAsMD5()
        s15.save(flush: true)

        def s16 = new Plano_Saude (nome_empresa: 'Medial',tipo_plano: 'total')
        //u1.senha = u1.senha.encodeAsMD5()
        s16.save(flush: true)

        def s17 = new Plano_Saude (nome_empresa: 'UH',tipo_plano: 'particial')
        //u1.senha = u1.senha.encodeAsMD5()
        s17.save(flush: true)

        def s18 = new Plano_Saude (nome_empresa: 'UH',tipo_plano: 'total')
        //u1.senha = u1.senha.encodeAsMD5()
        s18.save(flush: true)

        def s19 = new Plano_Saude (nome_empresa: 'Intermédia',tipo_plano: 'particial')
        //u1.senha = u1.senha.encodeAsMD5()
        s19.save(flush: true)

        def s20 = new Plano_Saude (nome_empresa: 'Intermédia',tipo_plano: 'total')
        //u1.senha = u1.senha.encodeAsMD5()
        s20.save(flush: true)

        def s21 = new Plano_Saude (nome_empresa: 'ONE',tipo_plano: 'particial')
        //u1.senha = u1.senha.encodeAsMD5()
        s21.save(flush: true)

        def s22 = new Plano_Saude (nome_empresa: 'ONE',tipo_plano: 'total')
        //u1.senha = u1.senha.encodeAsMD5()
        s22.save(flush: true)

        def s23 = new Plano_Saude (nome_empresa: 'Silvestre',tipo_plano: 'particial')
        //u1.senha = u1.senha.encodeAsMD5()
        s23.save(flush: true)

        def s24 = new Plano_Saude (nome_empresa: 'Silvestre',tipo_plano: 'total')
        //u1.senha = u1.senha.encodeAsMD5()
        s24.save(flush: true)

        //Fim ---------------------------------------------------------------------------------Criação de um Plano_Saude


        //Criação de um Diagnostico-------------------------------------------------------------------------------------
        def u = new Diagnostico (nome_doenca: '1',sintomas: '1',tratamento:'1',causas: '1',diagnostico:'1',gravidade:'1',complicacoes:'1',)
        //u1.senha = u1.senha.encodeAsMD5()
        u.save(flush: true)


        //Fim ---------------------------------------------------------------------------------Criação de um Diagnostico

    }
    def destroy = {
    }
}
