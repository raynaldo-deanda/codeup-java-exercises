import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {


     String[] adjectivesArr = {"powerful", "honorable", "villainous", "humble", "courageous", "mighty", "chaotic", "wise", "discerning", "vigilant"};

     String[] nounsArr = {"sorcerer", "philosopher", "bard", "fighter", "rogue", "monks", "warlock", "barbarian", "ranger", "wizard"};

        System.out.println("Your server name is: ");
        System.out.printf("%s-%s", getWord(adjectivesArr), getWord(nounsArr));
    }
    public static String getWord(String[] words){
        Random random = new Random();
        int index = random.nextInt(words.length);
        return words[index];
    }
}
