🎲 Advanced Dual Dice Roller Android App
An interactive and advanced Android dice-rolling application (Dice Roller). The project started as a simple single-die concept and was engineered to support dual dice rolling simultaneously, seamlessly bridging XML user interfaces with backend logic inside MainActivity to create a dynamic and engaging user experience.

🚀 Project Evolution (رحلة تطور المشروع)
Phase 1 (المرحلة الأولى): Building a foundational application relying on a single die (Single Dice).

Phase 2 (المرحلة الثانية - التطوير): Engineering an upgrade to support dual dice (Dual Dice) rolled with a single button press, requiring precise layout rearrangement and independent state handling to generate random numbers and display corresponding images simultaneously.

🛠️ UI Design & XML Architecture (تصميم الواجهات وهندسة الـ XML)
The user interface was built entirely using ConstraintLayout to ensure high flexibility and optimal performance, containing the following core elements:

First Dice Image (ImageView - ivDice1):

Dimensions: Explicitly structured width and height.

Positioning: Constrained to the upper section to serve as a primary visual focal point.

Second Dice Image (ImageView - ivDice2):

Dimensions: Symmetrical to the first die.

Positioning: Dynamically shifted and positioned horizontally/vertically relative to the layout to ensure clean spacing without visual overlap.

Roll Button (Button - btnRoll):

Functionality: The interactive trigger responsible for initiating the roll sequence and generating fresh outputs for both dice.

💻 Backend Logic & MainActivity (MainActivity Logic)
The UI components were integrated with Kotlin programming constructs inside MainActivity.kt through the following step-by-step logic:

Variables Declaration (إعلان المتغيرات):

Declared two distinct ImageView variables with unique identifiers and names to control each die independently (ivDice1 and ivDice2).

Declared a Button variable mapped to the XML roll button ID.

View Binding via findViewById (الربط البرمجي):

Retrieved each view component from the XML file and bound them to Kotlin variables to enable full programmatic control.

Click Listener Implementation (تفعيل مستمع النقرات):

Configured setOnClickListener on the btnRoll button to execute the random generation logic upon user interaction.

Random Generation & Image Mapping (توليد الأرقام العشوائية وربطها بالصور):

Implemented random number generation logic (Random.nextInt) covering a range from 1 to 6, duplicated for both dice variables.

Mapped each generated random integer to its corresponding face image (Drawable Resources), allowing both dice faces to update independently and instantly based on the randomized output.

📌 Implementation Methodology Summary (ملخص المنهجية المتبعة)
Structural Foundation: Utilizing ConstraintLayout to precisely position, align, and shift views.

Programmatic Definition: Declaring 3 primary variables (2 images + 1 button) and applying findViewById.

Dynamic Control: Combining setOnClickListener with Random functions to accurately sync randomized logic outputs with die asset images.
