# OCP Bowling Score Kata
Kata taken from [Matteo Vaccari's article](http://matteo.vaccari.name/blog/archives/293)

## Kata constraint
1. **A Factory** should be limited to creating objects and linking them together. **No conditionals allowed.**
2. In the **Refactoring** step be careful not to implement new functionality; the current test should still fail
3. You cannot change the object you have created unless you are refactoring

## OCP Instructions

1. Write the first failing test. 
2. Write a Factory that returns an object, or an aggregate of objects, that make the test pass.
3. Write the next failing test.
4. Can you make it pass by changing the factory and/or creating a new class and nothing else?
   - If **yes**: great! Go back to point **n. 1**
   - If **not**: refactor until you can 

## Bowling Score

[bowling-score]: http://www.wpclipart.com/recreation/sports/bowling/bowling_scoresheet_example.png "bowling score card"

![Bowling scoreboard][bowling-score]

The game consists of 10 frames as shown above. In each frame the player has
two opportunities to knock down 10 pins. The score for the frame is the total
number of pins knocked down, plus bonuses for strikes and spares.

A spare is when the player knocks down all 10 pins in two tries. The bonus for
that frame is the number of pins knocked down by the next roll. So in frame 3
above, the score is 10 (the total number knocked down) plus a bonus of 5 (the
number of pins knocked down on the next roll.)

A strike is when the player knocks down all 10 pins on his first try. The bonus
for that frame is the value of the next two balls rolled.

In the tenth frame a player who rolls a spare or strike is allowed to roll the extra
balls to complete the frame. However no more than three balls can be rolled in
tenth frame.


## The requirements

* Write class "BowlingGame" that has two methods
    - `roll(pins : int)`
        - called each time the player rolls a ball. The argument is the number of pins knocked down.
    - `score() : int`
        - called only after the very end of the game. Returns total score of the game.


## Quick design session

- One game
- A game has 10 frames
- A frame has one or two rolls
- The tenth frame has two or three rolls. It's different from all the other frames
- The score function must iterate through all the frames, and calculate all their scores
- The score for a spare or a strike depends on the frames successor

---

# Application Specific instruction

## Prerequisites
- Kotlin and JVM installed

## Run Application
```
./gradlew clean build
java -jar build/libs/OCPBowlingScoreKata-1.jar
```

## Run tests
```
./gradlew clean test
```

