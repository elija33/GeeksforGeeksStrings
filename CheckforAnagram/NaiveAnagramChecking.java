package CheckforAnagram;

import java.util.Arrays;

public class NaiveAnagramChecking {
    public static boolean areAnagram(String name, String names){
        if(name.length() != names.length()){
            return false;
        }
        char word[] = name.toCharArray();
        Arrays.sort(word);
        name = new String(word);
        char words[] = names.toCharArray();
        Arrays.sort(words);
        names = new String(words);

        return name.equals(names);
    }
    public static void main(String[] args) {
        String name = "abaac";
        String names = "aacba";
        if(areAnagram(name, names)){
            System.out.println("The two strings are " + "anagram of each other");
        }
        else{
            System.out.println("The two strings are not" + "anagram of each other");
        }
        
    }
}
