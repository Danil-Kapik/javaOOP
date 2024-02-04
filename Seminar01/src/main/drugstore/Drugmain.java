package main.drugstore;
import main.drugstore.components.Azitronite;
import main.drugstore.components.Penicillin;
import main.drugstore.components.Water;
import java.util.*;

public class Drugmain {

    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component penicillin = new Penicillin("Penicillin", 1.6D, 6);


        Pharmacy p1 = new Pharmacy();
        p1.addComponents(water, azitronite);        // 15

        Pharmacy p2 = new Pharmacy();
        p2.addComponents(penicillin, water);        // 7

        Pharmacy p3 = new Pharmacy();
        p3.addComponents(azitronite, penicillin);   // 20

        System.out.println(p2.compareTo(p1));
        System.out.println(p2.compareTo(p3));
        System.out.println(p2.compareTo(p2));
        System.out.println(p3.compareTo(p2));
        System.out.println(p1.compareTo(p2));
    }
}



//Pharmacy p1 = new Pharmacy();
//        p1.addComponents(water, azitronite);
//
//Pharmacy p2 = new Pharmacy();
//        p2.addComponents(penicillin, water);
//
//Pharmacy p3 = new Pharmacy();
//        p3.addComponents(azitronite, penicillin);
//
//        System.out.println(p2 == p1);
//
//List<Component> components = new ArrayList<>();
//        components.add(azitronite);
//        components.add(water);
//        components.add(penicillin);
//
//        System.out.println(components);
//
//        components.sort(Comparator.reverseOrder());
//        System.out.println(components);