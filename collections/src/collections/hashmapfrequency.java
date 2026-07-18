package collections;
import java.util.HashMap;
import java.util.Map;

public class hashmapfrequency {

    public static void main(String[] args) {

        String str = "";
        HashMap<Character, Integer> hm = new HashMap<>();

        // Count frequency
        for (char ch : str.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        // Print frequencies
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
