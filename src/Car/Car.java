package Car;

import java.util.Scanner;

class Car {
    Scanner scan = new Scanner(System.in);
    private int max_speed;
    private int set_speed;

    private boolean close_open_door = false;
    private boolean get_in_out = false;
    private boolean on_off_light = false;
    private boolean on_off_car = false;
    private boolean go_stop = false;

    private String let;

    private String od = "od";
    private String cd = "cd";
    private String ic = "inc";
    private String oc = "oc";
    private String onl = "onl";
    private String ofl = "ofl";
    private String onc = "onc";
    private String ofc = "ofc";
    private String gc = "gc";
    private String sc = "sc";

    public Car(int speed) {
        this.max_speed = speed;
    }

    //----------------------------------play the car

    public void play_car() {
        System.out.println("enjoy your car!");
        this.let = scan.next();

        if (this.let.equalsIgnoreCase(this.od))
            this.open_door();
        else if (this.let.equalsIgnoreCase(this.cd))
            this.close_door();

        else if (this.let.equalsIgnoreCase(this.ic))
            this.get_in_the_car();
        else if (this.let.equalsIgnoreCase(this.oc))
            this.get_out_the_car();

        else if (this.let.equalsIgnoreCase(this.onl))
            this.turn_on_lights();
        else if (this.let.equalsIgnoreCase(this.ofl))
            this.turn_off_lights();

        else if (this.let.equalsIgnoreCase(this.onc))
            this.turn_on_car();
        else if (this.let.equalsIgnoreCase(this.ofc))
            this.turn_off_car();

        else if (this.let.equalsIgnoreCase(this.gc))
            this.go_car();
        else if (this.let.equalsIgnoreCase(this.sc))
            this.stop_car();

        else {
            System.out.println("no result!");
            play_car();
        }
    }

    //----------------------------------open and close the door
    public boolean open_door() {
        if (this.close_open_door == false && this.go_stop == false) {
            System.out.println("door is open!");
            this.close_open_door = true;
        } else if (this.close_open_door == false && this.go_stop == true) {
            System.out.println("you'r trying to open a door while driving!");
            this.close_open_door = true;
        } else
            System.out.println("door is already open!");

        this.let = scan.next();

        if (this.let.equalsIgnoreCase(this.od))
            this.open_door();
        else if (this.let.equalsIgnoreCase(this.cd))
            this.close_door();

        else if (this.let.equalsIgnoreCase(this.ic))
            this.get_in_the_car();
        else if (this.let.equalsIgnoreCase(this.oc))
            this.get_out_the_car();

        else if (this.let.equalsIgnoreCase(this.onl))
            this.turn_on_lights();
        else if (this.let.equalsIgnoreCase(this.ofl))
            this.turn_off_lights();

        else if (this.let.equalsIgnoreCase(this.onc))
            this.turn_on_car();
        else if (this.let.equalsIgnoreCase(this.ofc))
            this.turn_off_car();

        else if (this.let.equalsIgnoreCase(this.gc))
            this.go_car();
        else if (this.let.equalsIgnoreCase(this.sc))
            this.stop_car();

        else {
            System.out.println("you should press on the right button!");
            open_door();
        }
        return this.close_open_door;
    }

    public boolean close_door() {
        if (this.close_open_door == true) {
            System.out.println("door is closed!");
            this.close_open_door = false;
        } else
            System.out.println("door is already closed!");

        this.let = scan.next();

        if (this.let.equalsIgnoreCase(this.od))
            this.open_door();
        else if (this.let.equalsIgnoreCase(this.cd))
            this.close_door();

        else if (this.let.equalsIgnoreCase(this.ic))
            this.get_in_the_car();
        else if (this.let.equalsIgnoreCase(this.oc))
            this.get_out_the_car();

        else if (this.let.equalsIgnoreCase(this.onl))
            this.turn_on_lights();
        else if (this.let.equalsIgnoreCase(this.ofl))
            this.turn_off_lights();

        else if (this.let.equalsIgnoreCase(this.onc))
            this.turn_on_car();
        else if (this.let.equalsIgnoreCase(this.ofc))
            this.turn_off_car();

        else if (this.let.equalsIgnoreCase(this.gc))
            this.go_car();
        else if (this.let.equalsIgnoreCase(this.sc))
            this.stop_car();

        else {
            System.out.println("you should press on the right button!");
            close_door();
        }
        return this.close_open_door;

    }

    //----------------------------------get in and out the car
    public boolean get_in_the_car() {
        if (this.get_in_out == false && this.close_open_door == true && this.go_stop == false) {
            System.out.println("get in the car!");
            this.get_in_out = true;
        } else if (this.get_in_out == true)
            System.out.println("you're already in the car!");

        else if (this.close_open_door == false && this.get_in_out == false)
            System.out.println("you can't get in the car!");

        else if (this.get_in_out == false && this.go_stop == true) {
            System.out.println("you can't get in the car because you jumped!");

            System.out.println("");
            System.out.println("-------------");
            System.out.println("--GAME OVER--");
            System.out.println("-------------");
            System.out.println("");

            System.out.println("play again :)");
            play_car();
        } else
            System.out.println("something went wrong!");

        this.let = scan.next();

        if (this.let.equalsIgnoreCase(this.od))
            this.open_door();
        else if (this.let.equalsIgnoreCase(this.cd))
            this.close_door();

        else if (this.let.equalsIgnoreCase(this.ic))
            this.get_in_the_car();
        else if (this.let.equalsIgnoreCase(this.oc))
            this.get_out_the_car();

        else if (this.let.equalsIgnoreCase(this.onl))
            this.turn_on_lights();
        else if (this.let.equalsIgnoreCase(this.ofl))
            this.turn_off_lights();

        else if (this.let.equalsIgnoreCase(this.onc))
            this.turn_on_car();
        else if (this.let.equalsIgnoreCase(this.ofc))
            this.turn_off_car();

        else if (this.let.equalsIgnoreCase(this.gc))
            this.go_car();
        else if (this.let.equalsIgnoreCase(this.sc))
            this.stop_car();

        else {
            System.out.println("you should press on the right button!");
            get_in_the_car();
        }
        return this.get_in_out;
    }

    public boolean get_out_the_car() {
        if (this.get_in_out == true && this.close_open_door == true) {
            System.out.println("get out the car!");
            this.get_in_out = false;
        } else if (this.get_in_out == false)
            System.out.println("you're already out the car!");

        else if (this.close_open_door == false && this.get_in_out == true)
            System.out.println("you can't get out of the car!");

        else
            System.out.println("something went wrong!");

        this.let = scan.next();

        if (this.let.equalsIgnoreCase(this.od))
            this.open_door();
        else if (this.let.equalsIgnoreCase(this.cd))
            this.close_door();

        else if (this.let.equalsIgnoreCase(this.ic))
            this.get_in_the_car();
        else if (this.let.equalsIgnoreCase(this.oc))
            this.get_out_the_car();

        else if (this.let.equalsIgnoreCase(this.onl))
            this.turn_on_lights();
        else if (this.let.equalsIgnoreCase(this.ofl))
            this.turn_off_lights();

        else if (this.let.equalsIgnoreCase(this.onc))
            this.turn_on_car();
        else if (this.let.equalsIgnoreCase(this.ofc))
            this.turn_off_car();

        else if (this.let.equalsIgnoreCase(this.gc))
            this.go_car();
        else if (this.let.equalsIgnoreCase(this.sc))
            this.stop_car();

        else {
            System.out.println("you should press on the right button!");
            get_out_the_car();
        }
        return this.get_in_out;
    }

    //----------------------------------turn on and off the lights
    public boolean turn_on_lights() {
        if (this.on_off_light == false && this.get_in_out == true) {
            System.out.println("lights are turned on!");
            this.on_off_light = true;
        } else if (this.on_off_light == true)
            System.out.println("lights are already turned on!");

        else if (this.get_in_out == false)
            System.out.println("you can't turne on the lights!");

        else
            System.out.println("something went wrong!");

        this.let = scan.next();

        if (this.let.equalsIgnoreCase(this.od))
            this.open_door();
        else if (this.let.equalsIgnoreCase(this.cd))
            this.close_door();

        else if (this.let.equalsIgnoreCase(this.ic))
            this.get_in_the_car();
        else if (this.let.equalsIgnoreCase(this.oc))
            this.get_out_the_car();

        else if (this.let.equalsIgnoreCase(this.onl))
            this.turn_on_lights();
        else if (this.let.equalsIgnoreCase(this.ofl))
            this.turn_off_lights();

        else if (this.let.equalsIgnoreCase(this.onc))
            this.turn_on_car();
        else if (this.let.equalsIgnoreCase(this.ofc))
            this.turn_off_car();

        else if (this.let.equalsIgnoreCase(this.gc))
            this.go_car();
        else if (this.let.equalsIgnoreCase(this.sc))
            this.stop_car();

        else {
            System.out.println("you should press on the right button!");
            turn_on_lights();
        }
        return this.on_off_light;
    }

    public boolean turn_off_lights() {
        if (this.on_off_light == true && this.get_in_out == true) {
            System.out.println("lights are turned off!");
            this.on_off_light = false;
        } else if (this.on_off_light == false)
            System.out.println("lights are already turned on!");

        else if (this.get_in_out == false)
            System.out.println("you can't turne off the lights!");

        else
            System.out.println("something went wrong!");

        this.let = scan.next();

        if (this.let.equalsIgnoreCase(this.od))
            this.open_door();
        else if (this.let.equalsIgnoreCase(this.cd))
            this.close_door();

        else if (this.let.equalsIgnoreCase(this.ic))
            this.get_in_the_car();
        else if (this.let.equalsIgnoreCase(this.oc))
            this.get_out_the_car();

        else if (this.let.equalsIgnoreCase(this.onl))
            this.turn_on_lights();
        else if (this.let.equalsIgnoreCase(this.ofl))
            this.turn_off_lights();

        else if (this.let.equalsIgnoreCase(this.onc))
            this.turn_on_car();
        else if (this.let.equalsIgnoreCase(this.ofc))
            this.turn_off_car();

        else if (this.let.equalsIgnoreCase(this.gc))
            this.go_car();
        else if (this.let.equalsIgnoreCase(this.sc))
            this.stop_car();

        else {
            System.out.println("you should press on the right button!");
            turn_off_lights();
        }
        return this.on_off_light;
    }

    //----------------------------------turn on and off the car
    public boolean turn_on_car() {
        if (this.on_off_car == false && this.get_in_out == true && go_stop == false) {
            System.out.println("car is turned on!");
            this.on_off_car = true;
        } else if (this.on_off_car = true && this.get_in_out == true)
            System.out.println("car is already turned on!");

        else if (go_stop == true || this.get_in_out == false || this.on_off_car == true)
            System.out.println("you can't turn on the car!");

        else
            System.out.println("something went wrong!");

        this.let = scan.next();

        if (this.let.equalsIgnoreCase(this.od))
            this.open_door();
        else if (this.let.equalsIgnoreCase(this.cd))
            this.close_door();

        else if (this.let.equalsIgnoreCase(this.ic))
            this.get_in_the_car();
        else if (this.let.equalsIgnoreCase(this.oc))
            this.get_out_the_car();

        else if (this.let.equalsIgnoreCase(this.onl))
            this.turn_on_lights();
        else if (this.let.equalsIgnoreCase(this.ofl))
            this.turn_off_lights();

        else if (this.let.equalsIgnoreCase(this.onc))
            this.turn_on_car();
        else if (this.let.equalsIgnoreCase(this.ofc))
            this.turn_off_car();

        else if (this.let.equalsIgnoreCase(this.gc))
            this.go_car();
        else if (this.let.equalsIgnoreCase(this.sc))
            this.stop_car();

        else {
            System.out.println("you should press on the right button!");
            turn_on_car();
        }
        return this.on_off_car;
    }

    public boolean turn_off_car() {
        if (this.on_off_car == true && go_stop == false && this.get_in_out == true) {
            System.out.println("car is turned off!");
            this.on_off_car = false;
        } else if (this.on_off_car == false && this.get_in_out == true)
            System.out.println("car is already turned off!");

        else if (go_stop == true || this.get_in_out == false || this.on_off_car == false)
            System.out.println("you can't turn off the car!");

        else
            System.out.println("something went wrong!");

        this.let = scan.next();

        if (this.let.equalsIgnoreCase(this.od))
            this.open_door();
        else if (this.let.equalsIgnoreCase(this.cd))
            this.close_door();

        else if (this.let.equalsIgnoreCase(this.ic))
            this.get_in_the_car();
        else if (this.let.equalsIgnoreCase(this.oc))
            this.get_out_the_car();

        else if (this.let.equalsIgnoreCase(this.onl))
            this.turn_on_lights();
        else if (this.let.equalsIgnoreCase(this.ofl))
            this.turn_off_lights();

        else if (this.let.equalsIgnoreCase(this.onc))
            this.turn_on_car();
        else if (this.let.equalsIgnoreCase(this.ofc))
            this.turn_off_car();

        else if (this.let.equalsIgnoreCase(this.gc))
            this.go_car();
        else if (this.let.equalsIgnoreCase(this.sc))
            this.stop_car();

        else {
            System.out.println("you should press on the right button!");
            turn_off_car();
        }
        return this.on_off_car;
    }

    //----------------------------------go and stop the car
    public boolean go_car() {
        if (this.go_stop == false && this.get_in_out == true && this.on_off_car == true && this.close_open_door == false) {
            System.out.print("Set Speed : ");
            this.set_speed = scan.nextInt();

            if (this.set_speed > this.max_speed) {
                System.out.println(this.set_speed + "km" + " is too much speed!");
                go_car();
            } else if (this.set_speed < 1) {
                System.out.println(this.set_speed + "km" + " is too low speed!");
                go_car();
            } else if (this.set_speed == 120) {
				System.out.println("car is going : " + this.set_speed + "km" + "  'dangours'");
                this.go_stop = true;
            } else {
                System.out.println("car is going : " + this.set_speed + "km");
                this.go_stop = true;
            }
        } else if (this.go_stop == false && this.get_in_out == true && this.on_off_car == true && this.close_open_door == true) {
            System.out.println("car is going, but you're driving while a door is open!");
            this.go_stop = true;
        } else if (this.go_stop == true)
            System.out.println("car is already going!");

        else if (this.get_in_out == false || this.on_off_car == false)
            System.out.println("the car can't start going!");

        else
            System.out.println("something went wrong!");

        this.let = scan.next();

        if (this.let.equalsIgnoreCase(this.od))
            this.open_door();
        else if (this.let.equalsIgnoreCase(this.cd))
            this.close_door();

        else if (this.let.equalsIgnoreCase(this.ic))
            this.get_in_the_car();
        else if (this.let.equalsIgnoreCase(this.oc))
            this.get_out_the_car();

        else if (this.let.equalsIgnoreCase(this.onl))
            this.turn_on_lights();
        else if (this.let.equalsIgnoreCase(this.ofl))
            this.turn_off_lights();

        else if (this.let.equalsIgnoreCase(this.onc))
            this.turn_on_car();
        else if (this.let.equalsIgnoreCase(this.ofc))
            this.turn_off_car();

        else if (this.let.equalsIgnoreCase(this.gc))
            this.go_car();
        else if (this.let.equalsIgnoreCase(this.sc))
            this.stop_car();

        else {
            System.out.println("you should press on the right button!");
            go_car();
        }
        return this.go_stop;
    }

    public boolean stop_car() {
        if (this.go_stop == true && this.get_in_out == true && this.on_off_car == true) {
            System.out.println("car is stopping!");
            this.go_stop = false;
        } else if (this.go_stop = false)
            System.out.println("car is already stopped!");

        else if (this.get_in_out == false || this.on_off_car == false)
            System.out.println("the car can't start stopping!");

        else
            System.out.println("something went wrong!");

        this.let = scan.next();

        if (this.let.equalsIgnoreCase(this.od))
            this.open_door();
        else if (this.let.equalsIgnoreCase(this.cd))
            this.close_door();

        else if (this.let.equalsIgnoreCase(this.ic))
            this.get_in_the_car();
        else if (this.let.equalsIgnoreCase(this.oc))
            this.get_out_the_car();

        else if (this.let.equalsIgnoreCase(this.onl))
            this.turn_on_lights();
        else if (this.let.equalsIgnoreCase(this.ofl))
            this.turn_off_lights();

        else if (this.let.equalsIgnoreCase(this.onc))
            this.turn_on_car();
        else if (this.let.equalsIgnoreCase(this.ofc))
            this.turn_off_car();

        else if (this.let.equalsIgnoreCase(this.gc))
            this.go_car();
        else if (this.let.equalsIgnoreCase(this.sc))
            this.stop_car();

        else {
            System.out.println("you should press on the right button!");
            stop_car();
        }
        return this.go_stop;
    }
}