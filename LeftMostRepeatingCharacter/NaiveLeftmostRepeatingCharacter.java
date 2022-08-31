package LeftMostRepeatingCharacter;

public class NaiveLeftmostRepeatingCharacter {
    public static int LeftMostRepeatingCharacter(String world){
        for(int i = 0; i<world.length(); i++){
            for(int j = i + 1; j<world.length(); j++){
                if(world.charAt(i) == world.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String world = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(LeftMostRepeatingCharacter(world));
    }
}
