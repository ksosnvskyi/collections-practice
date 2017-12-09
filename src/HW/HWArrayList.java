package HW;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class HWArrayList {

    //1)Составить и вывести список из самых популярных безрамочных и рамочных смартфонов
    //2)Вывести поочередно безрамочные, а после них смартфоны с рамками
    //3)Заменить 5 любых смартфонов на идентичные
    //4)Удалить две первые и последние марки телефонов
    //GO!

    public static void main(String... args) {

        ArrayList<String> alist = new ArrayList<String>();
        alist.add("IPHONE X");
        alist.add("SAMSUNG GALAXY S8");
        alist.add("Siemens e57");
        alist.add("XIAOMI 5 PLUS");
        alist.add("Nokia 3500 classic");
        alist.add("HUAWEI 6X");
        alist.add("Samsung Galaxy Ace 2");
        alist.add("SAMSUNG GALAXY S8");
        alist.add("Google Pixel 2");
        alist.add("DOOGEE MIX");

        alist.set(2, "LG V30"); //change phone
        alist.set(3, "Oukitel u11"); //change phone
        alist.set(4, "SonyXperia XZ1"); //change phone
        alist.set(5, "MTC Mobile Phone"); //change phone

        int count = Collections.frequency(alist, "SAMSUNG GALAXY S8");

        System.out.println(count);

        /*String[] myArray = {}; // конвертируем ArrayList в массив
        myArray = alist.toArray(new String[alist.size()]);*/
        /*alist.remove(0); // 4) Complete
        alist.remove(1);
        alist.remove(6);
        alist.remove(5);*/
        for (String i : alist) {
            System.out.println(i);
        /*Iterator<String> iter = alist.iterator(); //use iterator
        while(iter.hasNext()) {
            System.out.println(iter.next());
            }*/
           /* System.out.println(" ");
            System.out.println("Представляем вашему вниманию топ5 безрамочных смартфонов этого года:"); //2) Complete
            System.out.println(alist.get(0) + ", " + alist.get(1) + ", " + alist.get(3) + ", " + alist.get(5) + ", " + alist.get(9) + ". ");
            System.out.println(" ");
            System.out.println("Лучшие смартфоны с рамками всех времен:"); //2) Complete
            System.out.print(alist.get(2) + ", ");
            System.out.print(alist.get(4) + ", ");
            System.out.print(alist.get(6) + ", ");
            System.out.print(alist.get(7) + ", ");
            System.out.print(alist.get(8) + ".");*/
        }
    }
}
