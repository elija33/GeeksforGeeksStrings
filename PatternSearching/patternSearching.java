package PatternSearching;

import java.util.jar.Attributes.Name;

public class patternSearching {
    public static void patternSearching(String name, String pat){
        for(int i = 0; i<= (name.length() - pat.length()); i++){
            int j;
            for(j = 0; j < pat.length(); j++){
                if(pat.charAt(j) != name.charAt(i+j)){
                    break;
                }
            }
            if(j == pat.length()){
                System.out.println(i+ " ");
            }
        }
    }
    public static void main(String[] args) {
        String txt = "ABCABCD";String pat="ABCD";
        System.out.print("All index numbers where pattern found: ");
        patternSearching(txt,pat);  
    }
}
