package List_ArrayList_01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1,20);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        System.out.println(list);

//        System.out.println(list);
//
//        List<Integer> newlist = new ArrayList();
//        newlist.add(34);
//        newlist.add(43);
//        list.addAll(newlist);
//        System.out.println(list);
//


    }
}
