package Translator;

import java.util.Scanner;
abstract class Language {
    String words[];
}

class Arabic extends Language {
    String words [] = {"انا","انت","لعب"};
}
class Eglish extends Language {
    String words [] = {"I", "You","Play"};
}

class Translator {
    Arabic arabic = new Arabic();
    Eglish eglish = new Eglish();
    String ALLwords[][] = {arabic.words, eglish.words};

    void translat(String word) {
        int counter1 = -1, counter2 = -1;

        for(int i = 0; i < ALLwords.length; i++)
            for(int j = 0; j < ALLwords[i].length; j++)
                if(word.equalsIgnoreCase(ALLwords[i][j])) {
                    counter1 = i; counter2 = j;
                }

        if(counter1 < 0 && counter2 < 0) {
            System.out.println("...");
            getWord();
        }
        switch (counter1) {
            case 0:
                System.out.println("       "+ALLwords[1][counter2]);
                break;
            case 1:
                System.out.println("       "+ALLwords[0][counter2]);
                break;
        }
        getWord();
    }

    void getWord() {
        Scanner scan = new Scanner(System.in);

        System.out.print("write: ");
        String word = scan.nextLine();
        translat(word);
    }
    public static void main(String[] args) {
        Translator t = new Translator();
        t.getWord();
    }
}