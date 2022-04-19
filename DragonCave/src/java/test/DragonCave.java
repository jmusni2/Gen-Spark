import java.util.Scanner;


class DragonCave{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into?(1 or 2)");
        try {
            String input = s.nextLine();
            System.out.println(displayResult(input));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
    public static String displayResult(String i){
        if (!(i.equals("1")||i.equals("2")))
            return "Wrong input";
        else {System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and..,");}
        if (i.equals("1"))
            return "Gobbles you down in one byte!";
        else
            return "Offers you some of his treasure. You got lucky this time.";
    }
}