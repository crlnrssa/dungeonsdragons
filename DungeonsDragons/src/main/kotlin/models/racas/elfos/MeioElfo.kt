package models.racas.elfos

import models.racas.iRaca
import models.Personagem

class MeioElfo : iRaca  {
    override fun AplicarBonus(personagem: Personagem) {
        personagem.carisma += 2 // Aplica o bônus de 2 na carisma

    }
}