package java102.AdventureGame.Obstacles;

import java.util.Random;

public class Snake extends Obstacle{
    public Snake() {
        super(4, "Snake", generateRandomDamage(), 12, 0);
    }

    private static int generateRandomDamage() {
        Random random = new Random();
        return random.nextInt(4) + 3; // Generates a random number between 3 and 6 (included)
    }

}
