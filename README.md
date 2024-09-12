# Guess My Number

## Overview
The `GuessMyNumber` game is a simple number guessing game where the program attempts to guess the number you're thinking of. The game uses a binary search strategy to guess your number by repeatedly asking if the guess is too high or too low. The player provides feedback, and the program adjusts its guesses accordingly until it arrives at the correct answer.

## How It Works
1. The program starts by guessing 50.
2. If the guess is incorrect, the player indicates whether the number is higher or lower.
3. The program adjusts its guess based on the player's feedback:
   - If the number is higher, it adds a "modifier" to its current guess.
   - If the number is lower, it subtracts the modifier.
4. The modifier starts at 25 and is halved with each incorrect guess, ensuring the guess becomes more precise over time.
5. The loop continues until the correct number is guessed.

## Features
- Uses binary search-like logic to efficiently guess the player's number.
- Simple text-based interaction with input through the console.
- Handles higher or lower guesses and automatically adjusts the guess range.

5. Follow the prompts in the console to play the game.

## Requirements
- **Java 8** or higher.

## Installation
1. Download or clone this repository.
2. Compile and run the `GuessMyNumber.java` file using any Java-compatible IDE or terminal.

## Contact

For any questions or suggestions, feel free to reach out to me at [ashakirov@stetson.edu].

