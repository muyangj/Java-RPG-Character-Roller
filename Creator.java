import java.util.Random;

public class Creator {
    public static void main(String[] args) {
        String name = args[0];

        Random Rand = new Random();

        int h = Rand.nextInt(10) + 2;
        int s = Rand.nextInt(10) + 2;
        int m = Rand.nextInt(10) + 2;

        int n = Rand.nextInt(3);
        String character;

        switch (n) {
            case 0:
                character = "Warrior";
                s = s * 3;
                break;
            case 1:
                character = "Wizard";
                m = m * 3;
                break;
            case 2:
                character = "Potato";
                h = h * 3;
                break;
        }

        System.out.println("Welcome to the character generator!");
        System.out.println("-----------------------------------------");
        System.out.println(name + " is... a " + character + "!");
        System.out.println();
        System.out.println("        Strenth: " + s);
        System.out.println("        Magic: " + m);
        System.out.println("        Health: " + h);
        System.out.println();
        System.out.println("Happy adventuring! ");
        System.out.println("-----------------------------------------");


    }
}