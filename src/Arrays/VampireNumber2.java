package Arrays;

public class VampireNumber2 {
    public static void main(String[] args) {
        /*** this programe finds vampire numbers ***/
        int a=11; int b=11; int r=1111; //used in for loops
        String s;
        String c;

        for(a = 10; a <= 99; a++) { //used for first half gigits of first number
            for(b = 10; b <= 99; b++) { //used for second half gigits of first number
                r = a * b; // mul happens here
                s = "" + a + b;
                c = "" + r;

                if(c.length() == 4) {
                    char ch [] = new char[s.length()];
                    char ch1 [] = new char[c.length()];

                    for(int i = 0; i < ch.length; i++) {
                        ch[i] = s.charAt(i);
                        ch1[i] = c.charAt(i);
                    }
                    outer:
                    for(int j = 0; j < 1; j++) {

                        if(ch1[0] == ch1[1] || ch1[0] == ch1[2] || ch1[0] == ch1[3]) { // of 6
                            if(ch1[0] != ch[0] && ch1[0] != ch[1] && ch1[0] != ch[2]) break outer;
                            if(ch1[0] != ch[0] && ch1[0] != ch[2] && ch1[0] != ch[3]) break outer;
                            if(ch1[0] != ch[0] && ch1[0] != ch[1] && ch1[0] != ch[3]) break outer;
                            if(ch1[0] != ch[1] && ch1[0] != ch[2] && ch1[0] != ch[3]) break outer;
                        }

                        if(ch1[1] == ch1[0] || ch1[1] == ch1[2] || ch1[1] == ch1[3]) { // of 8
                            if(ch1[1] != ch[0] && ch1[1] != ch[1] && ch1[1] != ch[2]) break outer;
                            if(ch1[1] != ch[0] && ch1[1] != ch[2] && ch1[1] != ch[3]) break outer;
                            if(ch1[1] != ch[0] && ch1[1] != ch[1] && ch1[1] != ch[3]) break outer;
                            if(ch1[1] != ch[1] && ch1[1] != ch[2] && ch1[1] != ch[3]) break outer;
                        }

                        if(ch1[2] == ch1[0] || ch1[2] == ch1[1] || ch1[2] == ch1[3]) { // of 8
                            if(ch1[2] != ch[0] && ch1[2] != ch[1] && ch1[2] != ch[2]) break outer;
                            if(ch1[2] != ch[0] && ch1[2] != ch[2] && ch1[2] != ch[3]) break outer;
                            if(ch1[2] != ch[0] && ch1[2] != ch[1] && ch1[2] != ch[3]) break outer;
                            if(ch1[2] != ch[1] && ch1[2] != ch[2] && ch1[2] != ch[3]) break outer;
                        }

                        if(ch1[3] == ch1[0] || ch1[3] == ch1[1] || ch1[3] == ch1[1]) { // of 0
                            if(ch1[3] != ch[0] && ch1[3] != ch[1] && ch1[3] != ch[2]) break outer;
                            if(ch1[3] != ch[0] && ch1[3] != ch[2] && ch1[3] != ch[3]) break outer;
                            if(ch1[3] != ch[0] && ch1[3] != ch[1] && ch1[3] != ch[3]) break outer;
                            if(ch1[3] != ch[1] && ch1[3] != ch[2] && ch1[3] != ch[3]) break outer;
                        }

                        if(ch1[0] != ch[0] && ch1[0] != ch[1] && ch1[0] != ch[2] && ch1[0] != ch[3]) break outer;
                        //*******************************************************************************************//
                        if(ch[0] != ch1[0] && ch[0] != ch1[1] && ch[0] != ch1[2] && ch[0] != ch1[3]) break outer;
                        //*******************************************************************************************//
                        if(ch1[1] != ch[0] && ch1[1] != ch[1] && ch1[1] != ch[2] && ch1[1] != ch[3]) break outer;
                        //*******************************************************************************************//
                        if(ch[1] != ch1[0] && ch[1] != ch1[1] && ch[1] != ch1[2] && ch[1] != ch1[3]) break outer;
                        //*******************************************************************************************//
                        if(ch1[2] != ch[0] && ch1[2] != ch[1] && ch1[2] != ch[2] && ch1[2] != ch[3]) break outer;
                        //*******************************************************************************************//
                        if(ch[2] != ch1[0] && ch[2] != ch1[1] && ch[2] != ch1[2] && ch[2] != ch1[3]) break outer;
                        //*******************************************************************************************//
                        if(ch1[3] != ch[0] && ch1[3] != ch[1] && ch1[3] != ch[2] && ch1[3] != ch[3]) break outer;
                        //*******************************************************************************************//
                        if(ch[3] != ch1[0] && ch[3] != ch1[1] && ch[3] != ch1[2] && ch[3] != ch1[3]) break outer;

                        /********************************************************************************************/
                        if(ch[0] == ch1[0] || ch[0] == ch1[1] || ch[0] == ch1[2] || ch[0] == ch1[3])
                            System.out.println(r + " = " + a + " * " + b);
                    }
                }
            }
        }
    }
}