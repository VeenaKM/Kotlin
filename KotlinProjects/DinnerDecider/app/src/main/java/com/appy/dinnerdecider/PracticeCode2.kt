package com.appy.dinnerdecider

class PracticeCode2 {
    fun playGame() {
        val game = Game()
        println(game.path)
        game.north()
        game.south()
        game.east()
        game.west()
        game.end()
        println(game.path)


       // Higher order functions
        val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
        print(numbers.divisibleBy {
            it.rem(3)
        })

//        add a while loop that is always true.
//        Inside the loop, print instructions to the player:
        while (true) {
            print("Enter a direction: n/s/e/w: ")
            game.makeMove(readLine())   //Call makeMove() with the contents of the input from the user via readLine()
        }
    }
}
//Create an enum class, Directions, that has the directions NORTH, SOUTH, EAST and WEST, as well as START, and END.
enum class Directions{
    EAST,WEST,NORTH,SOUTH,START,END
}
//Create a class Game.
class Game{
//    Inside Game, declare a var, path, that is a mutable list of Direction. Initialize it with one element, START.
      var path = mutableListOf<Directions>(Directions.START)

    //Create 4 lambdas, north, south, east, and west, that add the respective direction to the path.

    val north = { path.add(Directions.NORTH)}
    val south = { path.add(Directions.SOUTH)}
    val east = { path.add(Directions.EAST)}
    val west = { path.add(Directions.WEST)}
    val end = { path.add(Directions.END); println("Game Over: $path"); path.clear(); false }

    // In the game class, create a function move() that takes an argument called where, which is a lambda with no arguments that returns Unit.
    fun move(where: () -> Boolean ) {
//    Inside move(), invoke the passed-in lambda.
        where.invoke()
    }
     //    In the Game class, create a function makeMove() that takes a nullable String argument and returns nothing.
    fun makeMove(command:String?) {
// Inside makeMove, test whether the String is any of the 4 directions and invoke move() with the corresponding lambda. Otherwise, invoke move() with end.
        if (command.equals("n")) move(north)
        else if (command.equals("s")) move(south)
        else if (command.equals("e")) move(east)
        else if (command.equals("w")) move(west)
        else move(end)
    }
}

// Example Higher order functions
fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }
    return result
}


