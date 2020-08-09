package Arrays;

import java.util.Arrays;
public class VampireNumber1 {
    public static boolean check(String s1, String s2) {
        int counter = 0;
        char c1[] = s1.toCharArray(),
                c2[] = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(c1.length == c2.length) {
            for(int i = 0; i < c1.length; i++)
                if(c1[i] == c2[i]) counter++;

            if(counter == 4) return true;
            else return false;
        }
        else return false;
    }

    public static void main(String[] args) {
        int i, j, r;
        String s1, s2;
        for(i = 10; i < 99; i++) {
            for(j = 10; j < 99; j++) {
                r = i * j;
                s1 = "" + i + j; s2 = "" + r;
                if(check(s1, s2) == true)
                    System.out.println(s1 + " = " + s2.charAt(0)+s2.charAt(1)
                            + " * " + s2.charAt(2)+s2.charAt(3));
            }
        }
    }
}