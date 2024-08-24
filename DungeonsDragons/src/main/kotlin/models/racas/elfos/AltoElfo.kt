package models.racas.elfos

import models.racas.iRaca
import models.Personagem

class AltoElfo : iRaca {
    override fun AplicarBonus(personagem: Personagem) {
        personagem.inteligencia += 1 // Aplica o bônus de 1 na inteligência

    }
}