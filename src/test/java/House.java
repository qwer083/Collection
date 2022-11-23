import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class House {
    public static void main(String[] args) {

        HashMap<String, Integer> tenantHashMap = new HashMap<>();
        tenantHashMap.put("Воскобойников Иван Васильевич", 65);
        tenantHashMap.put("Абрамова Лилия Вадимовна", 12);
        tenantHashMap.put("Сороковников Илья Вагнатович", 23);
        tenantHashMap.put("Толстопузов Игнат Валерьевич", 1);
        tenantHashMap.put("Кирьянова Ирина Владимировна", 34);
        tenantHashMap.put("Самохвалова Татьяна Сергеевна", 9);
        tenantHashMap.put("Рычков Дмитрий Родионович", 44);
        tenantHashMap.put("Лобанов Сергей Дмитриевич", 18);
        tenantHashMap.put("Пестрохватов Жиль Андреевич", 64);
        tenantHashMap.put("Скоробейникова Дарья Мироновна", 51);

        List<String> tenants = new ArrayList();
        for (Map.Entry<String, Integer> entry : tenantHashMap.entrySet()) {
            if (entry.getValue() > 18) {
                tenants.add(entry.getKey());
            }
        }
        System.out.println(tenants);
    }
}
