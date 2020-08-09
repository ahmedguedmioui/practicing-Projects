package Guitar;

public class Guitar {
    private String colore;
    private String type;

    Guitar(String colore, String type) {
        this.colore = colore;
        this.type = type;
    }

    interface GuitarString {
        String MakeSound();
    }

    class FirstString implements GuitarString {
        private String sound = "first string";

        public String MakeSound() {
            return sound;
        }
    }

    public FirstString frist_string() {
        return new FirstString();
    }

    class FirstFrit {
        FirstString firstString = frist_string();
        private String sound1 = "first frit + " + firstString.MakeSound();

        String MakeSound(GuitarString gs) {
            if (gs instanceof FirstString) return sound1;
            else return null;
        }
    }

    FirstFrit first_frit() {
        return new FirstFrit();
    }

    public static void main(String[] args) {
        Guitar MyGuitar = new Guitar("black", "electrinc");

        Guitar.FirstString firstString = MyGuitar.frist_string();
        Guitar.FirstFrit firstFrit = MyGuitar.first_frit();

        System.out.println(firstFrit.MakeSound(firstString));
        System.out.println(firstString.MakeSound());
    }
}