package models.racas.elfos
import models.racas.iRaca
import models.Personagem

class Elfo : iRaca{
    override fun AplicarBonus(personagem: Personagem) {
        personagem.destreza += 2 // Aplica o bônus de 2 na destreza
    }
}