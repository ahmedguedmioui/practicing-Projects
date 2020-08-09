package Arrays;

import static print.print.*;

public class SumOfReptedItems {
    public static void main(String[] args) {

        String s = "135798642";
        for (int i = 0, j = s.length()-1; i < s.length(); i++, j--) {
            if(i == j) {
                print(s.charAt(i));
                break;
            }
            print(s.charAt(i)+""+s.charAt(j));
        }

        println();

        String s2 = "0246897531";
        for (int i = 0, j = s.length()-1; i < s.length()/2; i++, j--) {
            print(s.charAt(i)+""+s.charAt(j));
        }
    }
}