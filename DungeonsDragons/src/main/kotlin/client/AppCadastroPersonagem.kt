package client

import models.Personagem
import models.racas.*
import models.racas.anaos.*
import models.racas.draconatos.Draconato
import models.racas.drows.Drow
import models.racas.elfos.*
import models.racas.gnomos.*
import models.racas.halflings.*
import models.racas.humanos.*
import models.racas.orcs.MeioOrc
import models.racas.tieflings.Tiefling

class AppCadastroPersonagem {

    init {
        println("Iniciando Cadastro de Personagem...")

        val raca = selecionarRaca()
        val personagem = Personagem(raca)

        distribuirPontos(personagem)
        exibirDetalhesPersonagem(personagem)
    }

    private fun selecionarRaca(): iRaca {
        println("Escolha uma raça:")
        // Lista todas as raças disponíveis
        println("1 - Humano")
        println("2 - Anão")
        println("3 - Anão da Colina")
        println("4 - Anão da Montanha")
        println("5 - Draconato")
        println("6 - Drow")
        println("7 - Alto Elfo")
        println("8 - Elfo")
        println("9 - Elfo da Floresta")
        println("10 - Meio-Elfo")
        println("11 - Gnomo")
        println("12 - Gnomo da Floresta")
        println("13 - Gnomo das Rochas")
        println("14 - Halfling")
        println("15 - Halfling Pés-Leves")
        println("16 - Halfling Robusto")
        println("17 - Meio-Orc")
        println("18 - Tiefling")

        val opcao = readLine()?.toIntOrNull()

        return when (opcao) {
            1 -> Humano()
            2 -> Anao()
            3 -> AnaoColina()
            4 -> AnaoMontanha()
            5 -> Draconato()
            6 -> Drow()
            7 -> AltoElfo()
            8 -> Elfo()
            9 -> ElfoFloresta()
            10 -> MeioElfo()
            11 -> Gnomo()
            12 -> GnomoFloresta()
            13 -> GnomoRochas()
            14 -> Halfling()
            15 -> HalflingPesLeves()
            16 -> HalflingRobusto()
            17 -> MeioOrc()
            18 -> Tiefling()
            else -> {
                println("Opção inválida, selecionando Humano por padrão.")
                Humano()
            }
        }
    }

    private fun distribuirPontos(personagem: Personagem) {
        var pontosDisponiveis = 27
        println("Você tem $pontosDisponiveis pontos para distribuir entre os atributos.")

        fun alocarPontos(atributo: String, atributoAtual: Int): Int {
            println("Você tem $pontosDisponiveis pontos restantes.")
            println("Quantos pontos você deseja alocar para $atributo? (Atributo atual: $atributoAtual)")
            val pontos = readLine()?.toIntOrNull() ?: 0

            // Validação para garantir que o valor final não ultrapasse 15
            val valorMaximoPermitido = 15 - 8
            if (pontos > valorMaximoPermitido) {
                println("Você não pode alocar mais do que ${valorMaximoPermitido} pontos em $atributo, pois o valor máximo permitido é 15.")
                return alocarPontos(atributo, atributoAtual)
            }

            return if (pontos in 0..pontosDisponiveis) {
                pontosDisponiveis -= pontos
                atributoAtual + pontos
            } else {
                println("Número de pontos inválido.")
                alocarPontos(atributo, atributoAtual)
            }
        }

        personagem.forca = alocarPontos("Força", personagem.forca)
        personagem.destreza = alocarPontos("Destreza", personagem.destreza)
        personagem.constituicao = alocarPontos("Constituição", personagem.constituicao)
        personagem.inteligencia = alocarPontos("Inteligência", personagem.inteligencia)
        personagem.sabedoria = alocarPontos("Sabedoria", personagem.sabedoria)
        personagem.carisma = alocarPontos("Carisma", personagem.carisma)

        while (pontosDisponiveis > 0) {
            println("Ainda restam $pontosDisponiveis pontos.")
            println("Deseja realocar esses pontos? (s/n)")
            val resposta = readLine()?.toLowerCase()

            if (resposta == "s") {
                println("Escolha um atributo para realocar os pontos restantes:")
                println("1 - Força")
                println("2 - Destreza")
                println("3 - Constituição")
                println("4 - Inteligência")
                println("5 - Sabedoria")
                println("6 - Carisma")

                val opcao = readLine()?.toIntOrNull()
                when (opcao) {
                    1 -> personagem.forca = alocarPontos("Força", personagem.forca)
                    2 -> personagem.destreza = alocarPontos("Destreza", personagem.destreza)
                    3 -> personagem.constituicao = alocarPontos("Constituição", personagem.constituicao)
                    4 -> personagem.inteligencia = alocarPontos("Inteligência", personagem.inteligencia)
                    5 -> personagem.sabedoria = alocarPontos("Sabedoria", personagem.sabedoria)
                    6 -> personagem.carisma = alocarPontos("Carisma", personagem.carisma)
                    else -> println("Opção inválida.")
                }
            } else {
                break
            }
        }

        if (pontosDisponiveis > 0) {
            println("Distribuição de pontos concluída, restaram $pontosDisponiveis pontos não utilizados.")
        } else {
            println("Distribuição de pontos concluída. Você usou todos os pontos disponíveis.")
        }
    }

    private fun exibirDetalhesPersonagem(personagem: Personagem) {
        println("\nPersonagem criado com sucesso!")
        println("Raça: ${personagem.raca::class.simpleName}")
        println("Força: ${personagem.forca} (Modificador: ${personagem.modificadorForca})")
        println("Destreza: ${personagem.destreza} (Modificador: ${personagem.modificadorDestreza})")
        println("Constituição: ${personagem.constituicao} (Modificador: ${personagem.modificadorConstituicao})")
        println("Inteligência: ${personagem.inteligencia} (Modificador: ${personagem.modificadorInteligencia})")
        println("Sabedoria: ${personagem.sabedoria} (Modificador: ${personagem.modificadorSabedoria})")
        println("Carisma: ${personagem.carisma} (Modificador: ${personagem.modificadorCarisma})")
        println("Vida: ${personagem.vida}")
    }
}
