package io.github.josephsimutis.card.standard

import io.github.josephsimutis.card.Card

data class StandardCard(val numeric: Numeric, val suit: Suit) : Card() {
    override val name: String
        get() = "$numeric of $suit"

    companion object {
        fun permute(): List<StandardCard> {
            return Suit.entries.toTypedArray().fold(ArrayList()) { list, suit ->
                (list + Numeric.entries.toTypedArray().map { StandardCard(it, suit) }) as ArrayList<StandardCard>
            }
        }
    }
}