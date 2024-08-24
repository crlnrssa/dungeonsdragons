package models.racas.gnomos

import models.racas.iRaca
import models.Personagem

class GnomoRochas : iRaca {
    override fun AplicarBonus(personagem: Personagem) {
        personagem.constituicao += 1 // Aplica o bônus de 1 na constituição

    }
}