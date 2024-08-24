package models.racas.drows
import models.racas.iRaca
import models.Personagem

class Drow : iRaca{
    override fun AplicarBonus(personagem: Personagem) {
        personagem.carisma += 1 // Aplica o bônus de 1 na carisma

    }
}