package CheckifStrinfSubsequence;

import java.util.Scanner;

public class IterativeCheckStringSubsequence {
    public static boolean isSubSubsequence(String name, String names){
        int j = 0;
        for(int i = 0; i < name.length()-1 && j < names.length()-1; i++){
            if(name.charAt(i) == names.charAt(j)){
                j++;
            }
        }
        return j == names.length();
    }
    public static void main(String[] args) {
        Scanner world = new Scanner(System.in);
        int n, m;
        n = world.nextInt();
        m = world.nextInt();

        String name, names; 
        name = world.next();
        names = world.next();

        System.out.println(isSubSubsequence(name, names));
    }
}
