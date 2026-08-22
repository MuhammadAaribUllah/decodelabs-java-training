
This repository contains three Java projects completed as part of the DecodeLabs
Industrial Training Kit, covering core Java fundamentals: control flow, data
processing, and object-oriented programming.

## Projects

### Project 1: Number Guessing Game
`Project1-NumberGame/DecodeLabs_Java_P1.java`

A number-guessing game where the program generates a random number between 1 and
100, and the user has to guess it with High/Low feedback after each attempt.

**Key concepts:** `Random` class, loops, conditionals, input handling

**Features:**
- Random number generation using `java.util.Random`
- Attempt limiter (7 guesses max)
- Play again / multiple rounds via `do-while` loop
- Handles invalid (non-numeric) input without crashing

**Run it:**


---

### Project 2: Student Grade Calculator
`Project2-GradeCalculator/DecodeLabs_Java_P2.java`

Calculates a student's total marks, average percentage, and letter grade based
on marks entered for multiple subjects.

**Key concepts:** Variables, loops, arithmetic operations, conditional statements

**Features:**
- Accepts marks for any number of subjects
- Validates marks are within 0–100 range, re-prompts on invalid input
- Correctly casts to `double` before dividing to avoid integer truncation
- Grade assigned via a strictest-first conditional ladder (A/B/C/D/F)
- Clean output formatting with `printf`

**Run it:**


---

### Project 3: ATM Interface
`Project3-ATMInterface/ATM.java`, `Project3-ATMInterface/BankAccount.java`

A console-based ATM system built using object-oriented principles, separating
the user interface from the account logic.

**Key concepts:** Classes & objects, methods, encapsulation, input validation

**Features:**
- Two-class architecture:
  - `BankAccount` — private fields (`balance`, `accountNumber`), with
    `deposit()`, `withdraw()`, and `checkBalance()` methods enforcing business
    rules (no negative amounts, no overdrafts)
  - `ATM` — handles the menu, Scanner input, and orchestrates calls to
    `BankAccount`
- Robust input validation using `hasNextInt()` / `hasNextDouble()` to prevent
  crashes on bad input

**Run it:**

---

## Tech Stack
- Java (JDK 17)
- Compiled and run via terminal / VS Code

## Author
Muhammad Aarib Ullah