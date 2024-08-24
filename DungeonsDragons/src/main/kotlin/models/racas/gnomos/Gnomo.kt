package models.racas.gnomos

import models.racas.iRaca
import models.Personagem

class Gnomo : iRaca {
    override fun AplicarBonus(personagem: Personagem) {
        personagem.inteligencia += 2 // Aplica o bônus de 2 na inteligência

    }
}