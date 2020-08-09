package Contacts;

import static print.print.*;
import java.util.*;

public class Contacts implements Call {
    Map<String, Integer> contacts = new HashMap<>();

    Object o;
    String message;

    Person me = new ME("ahmed", 610447190);
    Person contact1 = new Person("brahim", 644105871);
    Person contact2 = new Person("imad", 647895401);
    Person contact3 = new Person("khadija", 647890145);

    void SetData(Object o) {
        this.o = o;
        contacts.put(me.Getname(), me.Getphone());
        contacts.put(contact1.Getname(), contact1.Getphone());
        contacts.put(contact2.Getname(), contact2.Getphone());
        contacts.put(contact3.Getname(), contact3.Getphone());
    }
    Object getData() {
        String obj = null;

        if (contacts.containsKey(o))
            obj = (String) o;

        if(obj != null)
            return obj;
        else
            return o;
    }

    public void call(Object o) {
        SetData(o);
        if (o instanceof String) {
            if (contacts.containsKey(getData()))
                println("calling '" + (getData() + "' \n" +contacts.get(getData()) +""+ "..."));


            if(!contacts.containsKey(getData()))
                println("no result");
        }
        
        if (contacts.containsValue(o))
            println("calling " + o + "...");
    }
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        contacts.call("bm");
    }
}
/**
    "ahmed"   , 610447190
    "brahim"  , 644105871
    "imad"    , 647895401
    "khadija" , 647890145
**/