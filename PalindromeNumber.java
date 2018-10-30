/**
 * Created by giraffissimo on 30.10.2018.
 * Determine whether an integer is a palindrome.
 * An integer is a palindrome when it reads the same backward as forward.
 *
 * Follow up:
 * Coud you solve it without converting the integer to a string?
 */
public class PalindromeNumber {

    public static int reverse(int x) {
        int res = 0;
        int temp = 0;
        while(x != 0){
            int tail = x%10;

            temp = res*10 +tail;

            /*if((temp-tail)/10 !=res)
                return 0;*/
            res = temp;
            x = x/10;
        }
        return res;
    }

    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        return reverse(x) == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
}