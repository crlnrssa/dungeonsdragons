package models.racas.anaos

import models.racas.iRaca
import models.Personagem

class Anao : iRaca {
    override fun AplicarBonus(personagem: Personagem) {
        personagem.constituicao += 2 // Aplica o bônus de 2 na constituição

    }
}