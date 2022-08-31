package ReverseWordsString;

public class EfficientReverseWords {
    public static void reverse(char name[], int low, int high){
        while(low <= high){
            char temp = name[low];
            name[low] = name[high];
            name[high] = temp;

            low++;
            high--;
        }
    }

    public static void reverseWords(char name[], int words){
        int start = 0;
        for(int end = 0; end < name.length; end++){
            if(name[end] == ' '){
                reverse(name, start, end - 1);
                start = end + 1;
            }
        }
        reverse(name, start, name.length - 1);
        reverse(name, 0, name.length-1);
    }
    public static void main(String[] args) {
        String names = "Welcome to Gfg";
        int words = names.length();
        char[] name = names.toCharArray();
        System.out.println("After reversing words in the string:");
        reverseWords(name, words);
        System.out.println(name);
    }
}
