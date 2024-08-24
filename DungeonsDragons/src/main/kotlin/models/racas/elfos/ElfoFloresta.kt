package models.racas.elfos

import models.racas.iRaca
import models.Personagem

class ElfoFloresta : iRaca {
    override fun AplicarBonus(personagem: Personagem) {
        personagem.sabedoria += 1 // Aplica o bônus de 1 na sabedoria
    }
}