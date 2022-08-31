package LeftmostNonRepeatingElement;

import java.util.Arrays;

public class EfficientLeftMostNonRepeatEle {
    static final int CHAR = 256;

    public static int nonRepeat(String world){
        int name[] = new int[CHAR];
        Arrays.fill(name, -1);

        for(int i = 0; i < world.length(); i++){
            if(name[world.charAt(i)] == -1){
                name[world.charAt(i)] = i;
            }
            else{
                name[world.charAt(i)] = -2;
            }
        }
        int names = Integer.MAX_VALUE;
        for(int i = 0; i < CHAR; i++){
            if(name[i] >= 0){
                names = Math.min(names, name[i]);
            }
        }
        return (names == Integer.MAX_VALUE)? - 1: names;
    }
    public static void main(String[] args) {
        String name = "fforgeeks";
        System.out.println("Index of leftmost non repeating element");
        System.out.println(nonRepeat(name));
    }
}
