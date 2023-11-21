public class SimpleStartupGame {
  public static void main(String[] args) {
    // Initialize a counter for the number of user guesses.
    int numOfGuesses = 0;

    // Create an instance of GameHelper to get user input.
    GameHelper helper = new GameHelper();

    // Create a SimpleStartup object representing the game.
    SimpleStartup theStartup = new SimpleStartup();

    // Generate a random number between 0 and 4 to use as the starting point of the target location.
    int randomNum = (int) (Math.random() * 5);

    // Set up an array to hold the location cells of the target (3 consecutive numbers starting from randomNum).
    int[] locations = {randomNum, randomNum + 1, randomNum + 2};

    // Set the location cells for theStartup game instance.
    theStartup.setLocationCells(locations);

    // A boolean flag to keep track of whether the game is still going.
    boolean isAlive = true;

    // Main game loop - continues as long as isAlive is true.
    while (isAlive) {
      // Get user input by calling the getUserInput method from the GameHelper instance.
      int guess = helper.getUserInput("enter a number");

      // Check the user's guess and store the result.
      String result = theStartup.checkYourself(guess);

      // Increment the number of guesses.
      numOfGuesses++;

      // If the result is "kill", it means the game is over.
      if (result.equals("kill")) {
        // Set isAlive to false to exit the loop.
        isAlive = false;

        // Output the number of guesses it took the user to win.
        System.out.println("You took " + numOfGuesses + " guesses");
      } // End of if
    } // End of while loop
  } // End of main method
}
