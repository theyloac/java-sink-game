class SimpleStartup {
  // Array to store the locations of the object the player needs to find.
  private int[] locationCells;

  // Counter for the number of successful hits made by the player.
  private int numOfHits = 0;

  // Setter method for locationCells.
  // This method is used to initialize the location cells with the array provided.
  public void setLocationCells(int[] locs) {
    locationCells = locs;
  }

  // Method to check the player's guess against the location cells.
  public String checkYourself(int guess) {
    // Default result is "miss" unless a hit is detected.
    String result = "miss";

    // Loop through each cell in the locationCells array.
    for (int cell : locationCells) {
      // Check if the player's guess matches the current cell.
      if (guess == cell) {
        // If there's a match, change result to "hit" and increment numOfHits.
        result = "hit";
        numOfHits++;
        // Exit the loop as no need to check further once a hit is found.
        break;
      } // End of if block
    } // End of for loop

    // Check if the number of hits is equal to the length of locationCells.
    // If yes, change result to "kill" indicating all cells have been hit.
    if (numOfHits == locationCells.length) {
      result = "kill";
    } // End of if block

    // Print the result ("miss", "hit", or "kill").
    System.out.println(result);

    // Return the result.
    return result;
  } // End of checkYourself method
} // End of SimpleStartup class
