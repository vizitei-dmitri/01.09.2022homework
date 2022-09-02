import java.util.*;

public class Program{

    public static void main(String[] args) {

        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "lion");
        states.put(6, "zebra");
        states.put(4, "crocodile");
        states.put(3, "tiger");
        states.put(2, "giraffe");

        Set<Integer> keys = states.keySet();


        HashMap<String, Integer> carnivorous = new HashMap<>();
        HashMap<String, Integer> herbivorous = new LinkedHashMap<>();
        for(Map.Entry<Integer, String> animal : states.entrySet()){
            System.out.printf("Key: %d  Value: %s \n", animal.getKey(), animal.getValue());
            if(states.containsValue("lion")||states.containsValue("crocodile")||states.containsValue("tiger")){
                Collection<String> values = states.values();
                carnivorous.putIfAbsent("lion", 1);
                carnivorous.putIfAbsent("tiger", 2);
                carnivorous.putIfAbsent("crocodile", 3);}
                if (carnivorous.containsValue("lion")){
                    states.remove(2);
            }
            if (states.containsValue("1")||states.containsValue("giraffe")){
                herbivorous.putIfAbsent("zebra", 1);
                herbivorous.putIfAbsent("giraffe", 2);
            }}
        System.out.println(carnivorous);
        System.out.println(herbivorous);

        System.out.println(states);
    }
}
