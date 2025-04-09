import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Random rand = new Random();
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;

        System.out.println("🎲 You rolled: " + die1 + " + " + die2 + " = " + (die1 + die2));
    }
}
