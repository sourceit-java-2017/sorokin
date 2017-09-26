import java.util.Arrays;

public class FindPalindrome {

    public static boolean isPalindrome(int integer) {
        String strNum = String.valueOf(integer);
        String reversed = new StringBuffer(strNum).reverse().toString();
        return strNum.equals(reversed);
    }


    public static void palindromes() {
        int input[] = {100, 200, 3231, 404, 902, 42241, 76467};
        int plndrm1 = 0;
        int plndrm2 = 0;
        for(int e: input){
            if (isPalindrome(e)) {
                if (plndrm1 == 0) {
                    plndrm1 = e;
                } else  if (plndrm2 == 0) {
                    plndrm2 = e;
                } else {
                    break;
                }
            }
        }
        System.out.println("Looking for palindromes in this array: " + Arrays.toString(input));
        System.out.println("palindromes: " + plndrm1 + ", " + plndrm2);
    }
}
