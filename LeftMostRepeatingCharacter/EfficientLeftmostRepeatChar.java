package LeftMostRepeatingCharacter;

import java.util.Arrays;

public class EfficientLeftmostRepeatChar {
    static final int CHAR = 256;

   public static int leftMost(String world) {
    int[] fIndex = new int[CHAR];
    Arrays.fill(fIndex,-1);
    int res=Integer.MAX_VALUE;
    for(int i=0;i<world.length();i++){
        int fi=fIndex[world.charAt(i)];
        if(fi==-1)
        fIndex[world.charAt(i)]=i;
        else
        res=Math.min(res,fi);
    }
    
    return (res==Integer.MAX_VALUE)?-1:res;
    } 
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str)); 
    }
}
