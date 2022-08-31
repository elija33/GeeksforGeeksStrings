package CheckforAnagram;

public class EfficientAnagramChecking {
    static final int CHAR = 256;

    public static boolean areAnagram(String name, String names){
        if(name.length() != names.length())
        return false;

        int count[] = new int[CHAR];
        for(int i = 0; i < name.length(); i++){
            count[name.charAt(i)]++;
            count[names.charAt(i)]--;
        }

        for(int i = 0; i < CHAR; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String word = "abaac";
        String words = "aacba";
        if(areAnagram(word, words)){
            System.out.println("The two strings are" + "anagram of each other");
        }
        else{
            System.out.println("The two strings are not" + "anagram of each other");
        }
    }
}
