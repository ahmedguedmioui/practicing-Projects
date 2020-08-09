package GYM;

import java.util.Scanner;

class SighnUp {
    Scanner scan = new Scanner(System.in);
    Data data = new Data();
    Login log = new Login();

    String UserName;
    String PassWord;
    String Email;

    SighnUp() { // constarcter to call functions that get users info
        System.out.println("Sghin up");
        System.out.println("---------------------------");

        sendInfo();

        System.out.println("---------------------------");
        System.out.println("Hello " + data.user1[0] + ", you just creatd a new acount!");
        System.out.println("---------------------------");

        log.check_username_email(data);
    }

//--------------------------------------------------------------

    void sendInfo() { // send array of user
        setUserName();
        setPassword();
        setEmail();
    }

//--------------------------------------------------------------

    void setUserName() { //set username and send it to array of user
        System.out.print("enter username: ");
        UserName = scan.nextLine();

        if (getUserName() == false) setUserName();

        for (int i = 1; i < data.All.length; i++) {
            if (UserName.equals(data.All[i][0])) {
                System.out.println("this username is already used\n" + "Try again");
                setUserName();
            }
        }

        data.user1[0] = UserName;
    }

//--------------------------------------------------------------

    void setPassword() { //set password and send it to array of user
        System.out.print("enter password: ");
        this.PassWord = scan.nextLine();

        boolean boo = getPassword();

        if (boo == false) setPassword();

        data.user1[1] = PassWord;
    }

//--------------------------------------------------------------

    void setEmail() { //set email and send it to array of user
        System.out.print("enter email:    ");
        Email = scan.nextLine();

        if (getEmail() == false) setEmail();

        for (int i = 1; i < data.All.length; i++) {
            if (Email.equals(data.All[i][2])) {
                System.out.println("this email already used\n" + "Try again");
                setUserName();
            }
        }
        data.user1[2] = UserName;
    }

//--------------------------------------------------------------

    /**
     * ----------------------------------------------------------------------------------
     **/
    boolean getUserName() {

        //to check if UseName's length is between 1 and 60
        if (UserName.length() >= 60) {
            System.out.println("username is too long");
            return false;
        }
        if (UserName.length() <= 0) {
            System.out.println("username is nor valid");
            return false;
        }

        int counter = 0;
        String letters = "0123456789._" +
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "abcdefghijklmnopqrstuvwxyz";

        //to check if UseName doen't contain any extra shit
        for (int i = 0; i < UserName.length(); i++)
            for (int j = 0; j < letters.length(); j++)
                if (UserName.charAt(i) == letters.charAt(j))
                    counter++;

        //we leave if everything's fine with a true:
        if (counter == UserName.length()) {
            return true;
        }

        //we leave if UserName contain extra shit, with a false:
        else {
            System.out.println("username is nor valid");
            return false;
        }
    }

    /**
     * ----------------------------------------------------------------------------------
     **/

    boolean getPassword() {

        //to check if PassWord's length is between 8 and 16:
        if (PassWord.length() < 8) {
            System.out.println("password is too short");
            return false;
        }
        if (PassWord.length() > 16) {
            System.out.println("password is too long");
            return false;
        }

        int counter = 0;
        String letters = "0123456789._@!?&" +
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "abcdefghijklmnopqrstuvwxyz";

        // to check if PassWord doesn't contain extra shit:
        for (int i = 0; i < PassWord.length(); i++)
            for (int j = 0; j < letters.length(); j++)
                if (PassWord.charAt(i) == letters.charAt(j))
                    counter++;

        String numbers = "0123456789";
        String characters = "abcdefghijklmnopqrstuvwxyz";
        int countnum = 0, countchar = 0;

        //we can only enter here if PassWord doesn't contain extra shit:
        if (counter == PassWord.length()) {

            // to check if there are at least 2 digits and letters in PassWord:
            //characters:
            for (int i = 0; i < PassWord.length(); i++)
                for (int j = 0; j < numbers.length(); j++)
                    if (PassWord.charAt(i) == numbers.charAt(j))
                        countnum++;
            //digits:
            for (int i = 0; i < PassWord.length(); i++)
                for (int j = 0; j < characters.length(); j++)
                    if (PassWord.charAt(i) == characters.charAt(j))
                        countchar++;
        }

        //we leave with a false in here if PassWord contain extra shit:
        if (counter < PassWord.length()) {
            System.out.println("password can only contain digits, letters and ._@!?&");
            return false;
        }

        //we leave if PassWord contain at least 2 digits and 2 letters, with a true.
        //anyway, if every thing goes fine:
        if (countnum >= 2 && countchar >= 2) {
            return true;
        }

        //w leave in here if PassWord doen't contain at least
        //2 digits and 2 letters, with a false:
        else {
            System.out.println("password must contain at least"
                    + " two digits and two charachters");
            return false;
        }
    }

    /**
     * ----------------------------------------------------------------------------------
     **/
    boolean getEmail() {
        int counter = 0, counter2 = 0;
        String gmail = "@gmail.com";

        //to check if the length of Email is greater then 10,
        //bcz if it's 10 that means there's only @gmail.com:
        if (Email.length() > 10) {

            //to check if the last 10 characters in Email are "@gmail.com":
            for (int i = gmail.length() - 1, j = Email.length() - 1; i >= 0; i--, j--)
                if (Email.charAt(j) == gmail.charAt(i))
                    counter++;

            //if the last 10 characters in Email are NOT "@gmail.com",
            //we leave a "false" here:
            if (counter != gmail.length()) {
                System.out.println("email not valid");
                return false;
            }

            String letters = "0123456789._" +
                    "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                    "abcdefghijklmnopqrstuvwxyz";

            // to check if Email doesn't contain extra shit:
            for (int i = 0; i < Email.length() - 10; i++)
                for (int j = 0; j < letters.length(); j++)
                    if (Email.charAt(i) == letters.charAt(j))
                        counter2++;

            //if the Email doesn't contain extra shit, we leave with a true here:
            if (counter2 == Email.length() - 10) {
                return true;
            }

            //if the Email contains extra shit, we leave with a false here:
            else {
                System.out.println("email not valid");
                return false;
            }
        }

        //if the Email's length not less than 10 , we leave with a false here:
        else {
            System.out.println("email not valid");
            return false;
        }
    }
}