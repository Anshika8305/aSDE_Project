
Magical Arena Game
This code implements a simple Magical Arena Game where two players battle each other. Players have attributes like health, strength, and attack power. Each round, players roll dice to determine attack and defense effectiveness. The winner is the player who remains alive at the end.

Running the Game
Save the code: Save the code in three files: Player.java, Game.java, and Main.java.
Run Command : mvn clean install 
Compile the code: You'll need Java installed and set up. Use a Java compiler (e.g., javac) to compile the files into a single class file:

Bash
javac Player.java Game.java Main.java
Use code with caution.
content_copy
Run the game: Once compiled, navigate to the directory containing the class files and run the Main class:

Bash
java Main
Use code with caution.
content_copy
The program will prompt you to enter health, strength, and attack values for each player. After entering the values, the game will simulate the fight and declare the winner.

Code Breakdown
Player Class: This class represents a player in the game. It stores attributes like health, strength, and attack power.
Game Class: This class manages the game logic. It includes methods to determine the initial attacker, roll dice, check if a player is alive, play a round, calculate damage, and determine the winner.
Main Class: This is the entry point of the program. It prompts the user for player attributes, creates Player objects, and initiates the game by calling the PlayGame method from the Game class.

I hope this README provides a clear explanation of your code!
