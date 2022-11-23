import java.util.ArrayList;
import java.util.Collections;

public class MaxMinArray {
    public static void main(String[] args) {
        ArrayList arrayListMaxMin = new ArrayList();
        arrayListMaxMin.add(69);
        arrayListMaxMin.add(82);
        arrayListMaxMin.add(0);
        arrayListMaxMin.add(13);
        arrayListMaxMin.add(74);
        arrayListMaxMin.add(3);
        arrayListMaxMin.add(46);
        arrayListMaxMin.add(51);
        System.out.println(Collections.max(arrayListMaxMin));
        System.out.println(Collections.min(arrayListMaxMin));


    }
}
