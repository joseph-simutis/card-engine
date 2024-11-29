package io.github.josephsimutis.card.standard

import io.github.josephsimutis.card.Deck

class StandardDeck : Deck<StandardCard>(StandardCard.permute())