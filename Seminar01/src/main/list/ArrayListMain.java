package main.list;

import main.list.core.GBList;
import main.list.core.lists.GBArrayList;
import main.list.core.lists.GBLinkedList;

public class ArrayListMain {
    public static void main(String[] args) {
        GBList<Integer> list = new GBArrayList<>();
        GBList<Integer> list2 = new GBLinkedList<>();

        list.add(3);
        list.add(5);
        list.add(6);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        list2.add(3);
        list2.add(5);
        list2.add(6);
        list2.add(1);
        list2.add(9);
        list2.addFirst(8);
        System.out.println("Список GBLinkedList - " + list2);

        System.out.println("Size = " + list2.size());
        System.out.println("Index 1 = " + list2.get(1));
        list2.remove(3);
        System.out.println("После удаления Size = " + list2.size());

        for (Integer item : list2) {
            System.out.println(item);
        }

    }
}