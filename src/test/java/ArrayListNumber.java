import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNumber {
    public static void main(String[] args) {
        ArrayList arrayListN = new ArrayList();
        arrayListN.add(6);
        arrayListN.add(83);
        arrayListN.add(0);
        arrayListN.add(9);
        arrayListN.add(75);
        arrayListN.add(39);
        arrayListN.add(44);
        arrayListN.add(51);
        System.out.println("Содержимое arrayListN " + arrayListN);

        Collections.sort(arrayListN);
        System.out.println("По возрастанию: " + arrayListN);

        Collections.sort(arrayListN, Collections.reverseOrder());
        System.out.println("По убыванию: " + arrayListN);

        arrayListN.clear();
        System.out.println("Ну вот и всё: " + arrayListN);
    }
}
