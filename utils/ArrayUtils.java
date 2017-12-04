package utils;
public class ArrayUtils {
    public static String reverse(int arr[]) {
        String newWord="";
        for (int x =arr.length-1 ; x >=0 ; x--) {
        newWord += arr[x];
        }
        return newWord;
    }

/////////////////////////////////////////////////////////////////////
    public static String stringifyArray(int[] arr){
        String String="";
        for(int x=0 ; x< arr.length ; x++){
            String += arr[x] + ",";
        }
        return String;
    }
}
