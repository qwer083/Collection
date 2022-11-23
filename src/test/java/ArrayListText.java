import java.util.ArrayList;

public class ArrayListText {
    public static void main(String[] args) {
        ArrayList arrayListText = new ArrayList();
        arrayListText.add("Вывести");
        arrayListText.add("в");
        arrayListText.add("консоль");
        arrayListText.add("все");
        arrayListText.add("значения");
        arrayListText.add("из");
        arrayListText.add("него");
        System.out.println("Печать: " + arrayListText);

        arrayListText.sort(
                (o1, o2) -> o1.toString().length() - o2.toString().length());

        System.out.println("Сортировка по возрастанию: " + arrayListText);


        arrayListText.sort(
                (o1, o2) -> o2.toString().length() - o1.toString().length());


        System.out.println("Сортировка по убыванию : " + arrayListText);


    }
}
