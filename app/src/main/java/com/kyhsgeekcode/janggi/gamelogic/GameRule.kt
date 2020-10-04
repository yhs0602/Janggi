package com.kyhsgeekcode.janggi.gamelogic

typealias Dimension2D = Pair<Int, Int>

abstract class GameRule {
    abstract val name: String
    abstract val boardSize: Dimension2D


}