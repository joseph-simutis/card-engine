package io.github.josephsimutis.card.standard

import io.github.josephsimutis.card.Card
import java.util.ArrayList

data class StandardCard(val numeric: Numeric, val suit: Suit, val jokerStatus: JokerStatus = JokerStatus.FALSE) : Card() {
    override val name: String
        get() = "$numeric of $suit"

    companion object {
        fun permute(includeJokers: Boolean): List<StandardCard> =
            Suit.entries.toTypedArray().fold(ArrayList<StandardCard>()) { list, suit ->
                ((list + Numeric.entries.toTypedArray().map { StandardCard(it, suit) }) as ArrayList<StandardCard>)
            }.also { list ->
                if (includeJokers) {
                    list += StandardCard(Numeric.ACE, Suit.SPADES, JokerStatus.RED)
                    list += StandardCard(Numeric.ACE, Suit.SPADES, JokerStatus.BLACK)
                }
            }
    }
}