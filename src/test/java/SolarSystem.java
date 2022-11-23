import java.util.ArrayList;
import java.util.Collections;

public class SolarSystem {
    public static void main(String[] args) {
        ArrayList listSolar = new ArrayList();
        listSolar.add("mercury");
        listSolar.add("venus");
        listSolar.add("earth");
        listSolar.add("mars");
        listSolar.add("jupiter");
        listSolar.add("saturn");
        listSolar.add("neptune");
        listSolar.add("uranus");

        Collections.swap(listSolar, listSolar.indexOf("neptune"), listSolar.indexOf("uranus"));
        System.out.println(listSolar);

    }
}
