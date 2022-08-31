package LeftmostNonRepeatingElement;

public class NaiveLeftMostNonRepeatEle {
    public static int NonRepeat(String name){
        for(int i = 0; i < name.length(); i++){
            boolean flag = false;
            for(int j = 0; j < name.length(); j++){
                if(i != j && name.charAt(i) == name.charAt(j)){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("Index of leftmost non-repeating element:");
        System.out.println(NonRepeat(str)); 
    }
}
