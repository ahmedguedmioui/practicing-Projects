package Time;

public class Time extends Thread {
    static void setTime(int hour, int minute) {
        int second = 00;
        while (second <= 60) {
            try {
                Time.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(second == 60) {
                minute++; second = 0;
            }
            if(minute == 60) {
                hour++; minute = 0; second = 0;
            }
            if(hour == 13) {
                hour = 0; minute = 0; second = 0;
            }

            if(hour < 10)  System.out.print("0"+hour+":");
            if(minute < 10) System.out.print("0"+minute+":");
            if(second < 10) System.out.print("0"+second+"\n");

            if(hour >= 10)  System.out.print(hour+":");
            if(minute >= 10) System.out.print(minute+":");
            if(second >= 10) System.out.print(second+"\n");

            second++;
        }
    }
    public static void main(String[] args) {
        setTime(02, 30);
    }
}