package A;

import java.util.*;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {

        Month[] monthMassiv = new Month[12];
        System.out.println("-------------------------");
        System.out.println("Заполнение Массива");
        for (int i = 0; i < monthMassiv.length; i++) {
            monthMassiv[i] = new Month(random.nextInt(1, 13));
            System.out.println(monthMassiv[i]);
        }
        System.out.println("-------------------------");
        System.out.println("Сортировка Массива");
        Sorting(monthMassiv);

        ArrayList<Month> monthArrayList = new ArrayList<>();
        System.out.println("-------------------------");
        System.out.println("Заполнение ArrayList");
        for (int i = 0; i < 12; i++) {
            monthArrayList.add(new Month(random.nextInt(1, 13)));
            System.out.println(monthArrayList.get(i));
        }
        System.out.println("-------------------------");
        System.out.println("Сортировка ArrayList");
        Sorting(monthArrayList);


        LinkedList<Month> monthLinkedList = new LinkedList<>();
        System.out.println("-------------------------");
        System.out.println("Заполнение LinkedList");
        for (int i = 0; i < 12; i++) {
            monthLinkedList.add(new Month(random.nextInt(1, 13)));
            System.out.println(monthLinkedList.get(i));
        }
        System.out.println("-------------------------");
        System.out.println("Сортировка LinkedList");
        Sorting(monthLinkedList);
    }

    public static void Sorting(Month[] months) {
        String[] month = new String[months.length];
        for (int i = 0; i < month.length; i++) {
            month[i] = months[i].getYearMonth().getMonthInRussia();
        }
        Arrays.sort(month);
        for (int i = 0; i < month.length; i++) {
            System.out.println(month[i]);
        }
    }

    public static void Sorting(ArrayList<Month> months) {
        ArrayList<String> month = new ArrayList<>();
        for (int i = 0; i < months.size(); i++) {
            month.add(months.get(i).getYearMonth().getMonthInRussia());
        }
        Collections.sort(month);
        for (int i = 0; i < month.size(); i++) {
            System.out.println(month.get(i));
        }
    }

    public static void Sorting(LinkedList<Month> months) {
        LinkedList<String> month = new LinkedList<>();
        for (int i = 0; i < months.size(); i++) {
            month.add(months.get(i).getYearMonth().getMonthInRussia());
        }
        Collections.sort(month);
        for (int i = 0; i < month.size(); i++) {
            System.out.println(month.get(i));
        }
    }


}
