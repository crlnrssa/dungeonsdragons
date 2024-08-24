package models.racas.halflings

import models.racas.iRaca
import models.Personagem

class HalflingRobusto : iRaca {
    override fun AplicarBonus(personagem: Personagem) {
        personagem.constituicao += 1 // Aplica o bônus de 1 na constituição

    }
}