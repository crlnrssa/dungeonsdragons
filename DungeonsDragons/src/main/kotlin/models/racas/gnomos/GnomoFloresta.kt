package models.racas.gnomos

import models.racas.iRaca
import models.Personagem

class GnomoFloresta : iRaca {
    override fun AplicarBonus(personagem: Personagem) {
        personagem.destreza += 1 // Aplica o bônus de 1 na destreza

    }
}