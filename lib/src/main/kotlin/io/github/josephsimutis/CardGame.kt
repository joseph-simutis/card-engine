package io.github.josephsimutis

abstract class CardGame(val players: Array<Player>) {
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
    }

    open fun endGame() {
        ended = true
    }
}