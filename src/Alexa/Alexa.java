package Alexa;

class Listener {
    Listener(String WakeUp) {
        Light("Blue");
        System.out.println("...");
        Light("Green");
    }
    static void Light(String light) {
        System.out.println(light + " light");
    }
}
class Player {
    Phone phone = new Phone("Open Phone");
    Player(Spotify value) {
        phone.GetSong(value);
        PlaySong(value);
    }
    Player(Netflix value) {
        phone.GetSerie(value);
        PlaySerie(value);
    }
    void PlaySong(Spotify song) {
        if (song == null){ System.out.println("Song Not Found!"); return; }
        else
        System.out.println("Playing '" + song + "'");
    }
    void PlaySerie(Netflix serie) {
        if (serie == null){ System.out.println("Serie Not Found!"); return; }
        else
            System.out.println("Playing '" + serie + "'");
    }
}
enum Spotify { THE_JUDGE, WITH_OUT_ME }
enum Netflix { PREASON_BRAK, DARK }
class Phone {
    Phone(String WakeUp) {
        System.out.println("Phone: green light");
    }
    Spotify GetSong(Spotify song) {
        if(song == Spotify.THE_JUDGE) return Spotify.THE_JUDGE;
        else if(song == Spotify.WITH_OUT_ME) return Spotify.WITH_OUT_ME;
        else return null;
    }
    Netflix GetSerie(Netflix serie) {
        if(serie == Netflix.PREASON_BRAK) return Netflix.PREASON_BRAK;
        else if(serie == Netflix.DARK) return Netflix.DARK;
        else return null;
    }
}
class House {
    public static void main(String[] args) {
        //Alexa
        Listener love = new Listener("Alexa!");
        Player player = new Player(Netflix.DARK);
    }
}