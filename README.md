# Number-Guessing-Game
A fun and interactive console-based game where the user tries to guess a randomly generated number. The game offers three difficulty levels, each with a different number of chances to guess.

---

## Features

- **Difficulty Levels**:
  - **Easy**: 10 chances to guess the number.
  - **Medium**: 5 chances to guess the number.
  - **Hard**: 3 chances to guess the number.
  
- **Dynamic Feedback**:
  - The game provides hints if the guessed number is too high or too low.
  
- **Error Handling**:
  - Ensures that invalid inputs do not crash the program.

- **Interactive Gameplay**:
  - Users are informed about their progress and remaining attempts.

---

## How to Run

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/number-guessing-game.git
   cd number-guessing-game
   ```

2. **Compile the Code**:
   Ensure you have Java installed and run the following command:
   ```bash
   javac -d bin src/com/number_guessing/Main.java
   ```

3. **Run the Game**:
   ```bash
   java -cp bin com.number_guessing.Main
   ```

---

## How to Play

1. **Start the Game**:
   - Upon running the program, a welcome message and instructions will be displayed.

2. **Select Difficulty**:
   - Choose a difficulty level by entering `1`, `2`, or `3` for Easy, Medium, or Hard, respectively.

3. **Make Your Guesses**:
   - Enter your guesses one by one.
   - The game will provide feedback if your guess is too high or too low.

4. **Win or Lose**:
   - Guess the correct number within the allotted chances to win.
   - If you exhaust all attempts, the game will reveal the correct number.

---

## Example Run

```plaintext
Welcome to the Number Guessing Game!
I'm thinking of a number between 1 and 100.

Please select the difficulty level:
1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)

ENTER YOUR CHOICE: 2
Great! You have selected Medium difficulty.
Let's start the game!

Attempt 1 of 5. Enter your guess: 50
Incorrect! The number is greater than 50.
Attempt 2 of 5. Enter your guess: 75
Incorrect! The number is less than 75.
Attempt 3 of 5. Enter your guess: 63
Congratulations! You guessed the correct number in 3 attempts.
```

---

## Dependencies

- **Java SE Development Kit (JDK)**: Make sure JDK 8 or later is installed.

---
