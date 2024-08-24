package client

class AppMenu {
    fun exibirMenu() {
        var opc: Int?

        do {
            println("*** SEJA BEM-VINDO ***")
            println("\n*** MENU ***")
            println("1 - Cadastro de Personagem")
//            println("2 - Consulta de Personagem")
            println("2 - Sair da Aplicação")
            opc = readLine()?.toIntOrNull()

            when (opc) {
                1 -> {
                    AppCadastroPersonagem()
                    break
                }
//                2 -> {
//                    AppConsultaPersonagem()
//                    break
//                }
                3 -> {
                    println("Saindo da aplicação...")
                }
                else -> println("Opção inválida")
            }
        } while (opc != 3)
    }
}