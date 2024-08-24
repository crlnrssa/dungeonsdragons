package models.racas.anaos

import models.Personagem
import models.racas.iRaca

class AnaoMontanha : iRaca {
    override fun AplicarBonus(personagem: Personagem) {
        personagem.forca += 2 // Aplica o bônus de 2 na força
    }
}
