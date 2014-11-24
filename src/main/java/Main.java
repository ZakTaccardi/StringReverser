/**
 * Created by zak on 11/24/14.
 */
public class Main {
    public static void main(String[] args) {
        reverse("abcde".toCharArray());
        reverse("chicken".toCharArray());
        reverse("cow".toCharArray());
        reverse("a".toCharArray());
        reverse("boom".toCharArray());
        reverse("belt".toCharArray());
        reverse("at".toCharArray());
    }

    /**
     * Reverse the order of a char array. Ex: 'abcde' will be returned as 'edcba'
     * @param str a char array of the string to be flipped
     */
    static void reverse(char[] str){
        int l = str.length; //the length of the char array.
        //number of times to swap the first and last element of the array, moving inward by 1 element position each time.
        int numFlips = str.length / 2; //this will ignore flipping the middle number, because 7/2 == 3
        System.out.println("Flipping string: " + new String(str));
        for (int i = 0; i < numFlips; i++){
            char x = str[l - 1];
            str[l-1] = str[i];
            str[i] = x;
            l--; //decrement the length so when you flip, you don't always replace the last element.
        }
        System.out.println("result : " + new String(str));

    }
}
