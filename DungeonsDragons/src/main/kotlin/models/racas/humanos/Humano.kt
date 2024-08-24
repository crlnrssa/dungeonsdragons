package models.racas.humanos

import models.racas.iRaca
import models.Personagem


class Humano : iRaca {
    override fun AplicarBonus(personagem: Personagem) {
        personagem.forca += 1 // Aplica o bônus de 1 na força
        personagem.destreza += 1 // Aplica o bônus de 1 na destreza
        personagem.constituicao += 1 // Aplica o bônus de 1 na constituição
        personagem.inteligencia += 1 // Aplica o bônus de 1 na inteligência
        personagem.sabedoria += 1 // Aplica o bônus de 1 na sabedoria
        personagem.carisma += 1 // Aplica o bônus de 1 na sabedoria
    }
}

