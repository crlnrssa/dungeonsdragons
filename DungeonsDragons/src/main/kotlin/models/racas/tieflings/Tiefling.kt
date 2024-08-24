package models.racas.tieflings
import models.racas.iRaca
import models.Personagem

class Tiefling : iRaca{
    override fun AplicarBonus(personagem: Personagem) {
        personagem.inteligencia += 1 // Aplica o bônus de 1 na inteligência
        personagem.carisma += 2 // Aplica o bônus de 2 na carisma
    }
}