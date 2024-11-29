package io.github.josephsimutis

import io.github.josephsimutis.card.Card

abstract class Player(val name: String) {
    val hand = ArrayList<Card>()

    open fun addCards(cards: List<Card>) {
        hand += cards
    }

    abstract fun preformTurn()
}