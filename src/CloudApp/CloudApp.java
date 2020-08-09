package CloudApp;

class Media {}
class Video extends Media {}
class Picture extends Media {}
class Arr {
    static Arr arr = new Arr();
    int counter = -1;
    Media[] media = new Media[6];
    void setMedia(Media m) {
        counter++;
        if(counter < 6)  media[counter] = m;
        else  return;
    }
    void check() {
        if(media[0] instanceof Picture && media[1] instanceof Picture &&
                media[2] instanceof Picture && media[3] instanceof Video) {
            System.out.println("3 pic ,, 1 vid");
            media = new Media[4];
            System.out.println("array is runing out of storage!");
        }
        else if(media[0] instanceof Picture && media[1] instanceof Picture &&
                media[2] instanceof Picture && media[3] instanceof Picture &&
                media[4] instanceof Picture && media[5] instanceof Picture) {
            System.out.println("6 pic");
        }
        else if(media[0] instanceof Video && media[1] instanceof Video) {
            System.out.println("2 vid");
            media = new Media[2];
            System.out.println("array is runing out of storage!");
        }
        else
            System.out.println("else");
    }
    public static void main(String[] args) {

    }
}