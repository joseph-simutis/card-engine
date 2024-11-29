package io.github.josephsimutis.card

abstract class Deck<C : Card>(private val cards: List<C>) {
    private var currentCards = cards.shuffled().toMutableList()

    open fun draw(num: Int): List<C> = ArrayList<C>().apply {
        repeat(num) {
            try {
                this += currentCards[0]
                currentCards.removeFirst()
            } catch (e: IndexOutOfBoundsException) {
                return this
            }
        }
    }

    open fun add(cards: List<C>) {
        currentCards.addAll(cards)
    }

    open fun shuffle() {
        currentCards.shuffle()
    }

    open fun reset() {
        currentCards = cards.shuffled().toMutableList()
    }
}