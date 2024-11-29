package io.github.josephsimutis

import io.github.josephsimutis.card.Card
import io.github.josephsimutis.card.Deck

abstract class CardGame<C : Card>(val deck: Deck<C>, val players: Array<Player>) {
    var turn = 0
    var started = false
    var ended = false

    val currentPlayer: Player
        get() = players[turn]

    val ongoing: Boolean
        get() = started && !ended

    abstract val winner: Player?

    open fun startGame() {
        started = true
    }

    open fun advanceTurn() {
        turn++
        if (turn > players.lastIndex) turn = 0
        currentPlayer.preformTurn()
    }

    open fun drawCards(num: Int) {
        currentPlayer.addCards(deck.draw(num))
    }

    open fun endGame() {
        ended = true
    }
}