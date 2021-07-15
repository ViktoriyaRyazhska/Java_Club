import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task72 {
    public static void execute(Scanner sc) {
        System.out.println("This program helps you to add words to and their entries");
        System.out.println("Enter word: " );
        String word = sc.next();
        System.out.println("Enter the meaning of this word: ");
        String meaning = sc.next();
        Dictionary d = new Dictionary();
        d.newEntry(word, meaning);
        System.out.println("Now you can look it up in a dictionary");
        System.out.println("Enter your word and program return it: ");
        String word2 = sc.next();
        System.out.println(d.look(word2));
    }
}

class Dictionary {
    private final Map<String, String> dictionary;

    public Dictionary(){
        dictionary = new HashMap<>();
    }

    public void newEntry(String key, String value){
        dictionary.put(key, value);
    }

    public String look(String key){
        return dictionary.getOrDefault(key, "Cant find entry for " + key);
    }
}
