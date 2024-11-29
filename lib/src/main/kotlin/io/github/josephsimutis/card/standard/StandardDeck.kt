package io.github.josephsimutis.card.standard

import io.github.josephsimutis.card.Deck

class StandardDeck(includeJokers: Boolean) : Deck<StandardCard>(StandardCard.permute(includeJokers))