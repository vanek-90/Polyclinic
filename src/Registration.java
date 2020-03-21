import java.util.LinkedHashMap;
import java.util.Map;

public class Registration {


    public static LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap();


    public void myMap() {

        linkedHashMap.put(1, String.valueOf(Patient.patient1));
        linkedHashMap.put(2, String.valueOf(Patient.patient2));
        linkedHashMap.put(3, String.valueOf(Patient.patient3));
        linkedHashMap.put(4, String.valueOf(Patient.patient4));
        linkedHashMap.put(5, String.valueOf(Patient.patient5));
        linkedHashMap.put(6, String.valueOf(Patient.patient6));
        linkedHashMap.put(7, String.valueOf(Patient.patient7));
        linkedHashMap.put(8, String.valueOf(Patient.patient8));
        linkedHashMap.put(9, String.valueOf(Patient.patient9));
        linkedHashMap.put(10, String.valueOf(Patient.patient10));
        linkedHashMap.put(11, String.valueOf(Patient.patient11));
        linkedHashMap.put(12, String.valueOf(Patient.patient12));


        for (Object element : linkedHashMap.entrySet()) {
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());

        }
    }
}
