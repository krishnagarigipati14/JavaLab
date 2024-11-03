import java.util.HashMap;
import java.util.*;
public class week_4_most_occuring_word {

    public static char getMostFrequent(String str){
        Map<Character, Integer> freq = new HashMap<Character, Integer>();

        for(char c:str.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);

        }

        char ans = ' ';
        int maxFreq = 0;

        for(Map.Entry<Character, Integer> entry: freq.entrySet()){
            if(entry.getValue() > maxFreq){
                ans = entry.getKey();
                maxFreq = entry.getValue();
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(getMostFrequent(str));
    }
}
