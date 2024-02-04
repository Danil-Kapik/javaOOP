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

        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(p1);
        pharmacies.add(p2);
        pharmacies.add(p3);

        System.out.println(pharmacies);
        System.out.println("Отсортированный методом compareTo ");
        sortAndPrintPharmacies(pharmacies);
    }

    private static void sortAndPrintPharmacies(List<Pharmacy> pharmacies) {
        pharmacies.sort(Pharmacy::compareTo);
        List<Pharmacy> ph = new ArrayList<>(pharmacies);
        System.out.println(ph);

    }
}
