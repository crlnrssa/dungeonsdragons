package models.racas.orcs

import models.racas.iRaca
import models.Personagem

class MeioOrc : iRaca {
    override fun AplicarBonus(personagem: Personagem) {
        personagem.forca += 2 // Aplica o bônus de 2 na força
        personagem.constituicao += 1 // Aplica o bônus de 1 na força
    }
}