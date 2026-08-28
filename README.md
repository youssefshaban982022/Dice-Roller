# 🎲 Dual Dice Roller Android App

An interactive Android application built with Kotlin, evolving from a single-die concept into a fully functional **Dual Dice Roller** system.

---

## 🚀 Project Overview & Evolution
* **Initial Stage:** Developed as a basic single-die rolling application.
* **Evolution:** Upgraded and engineered to support **dual dice (`Dual Dice`)** rolled simultaneously via a single button press, featuring independent state handling for each die.

---

## 🛠️ XML UI Architecture
Designed entirely using **`ConstraintLayout`** for high performance and precise element positioning:
1. **First Dice (`ImageView - ivDice1`):** Sized and constrained near the upper section as the primary visual anchor.
2. **Second Dice (`ImageView - ivDice2`):** Dynamically positioned and constrained alongside the first die to prevent visual overlapping.
3. **Roll Button (`Button - btnRoll`):** The core interactive trigger that initiates the rolling mechanics.

---

## 💻 MainActivity Logic
1. **Variable Declaration:** Initialized two distinct `ImageView` references (`ivDice1`, `ivDice2`) and one `Button` reference.
2. **View Binding:** Bound XML components to Kotlin variables using `findViewById`.
3. **Event Handling:** Configured `setOnClickListener` on the roll button to execute the logic sequence upon user interaction.
4. **Randomization & Image Mapping:** Implemented `Random.nextInt` ranging from **1 to 6** independently for both dice, mapping each randomized output to its corresponding `Drawable` face resource.

---

## 🔗 Repository
[GitHub - Dual Dice Roller](https://github.com/youssefshaban982022/Dice-Roller)
