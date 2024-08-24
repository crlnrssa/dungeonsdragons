package models.racas.anaos

import models.racas.iRaca
import models.Personagem

class AnaoColina : iRaca {
    override fun AplicarBonus(personagem: Personagem) {
        personagem.sabedoria += 1 // Aplica o bônus de 1 na sabedoria
    }
}