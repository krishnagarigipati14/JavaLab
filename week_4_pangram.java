import java.util.HashSet;
import java.util.Locale;

public class week_4_pangram {
    public static boolean isPangram(String str){
        str = str.toLowerCase();
        HashSet<Character> letters = new HashSet<>();

        for(char c:str.toCharArray()){
            if(c>='a' && c<='z'){
                letters.add(c);
            }
        }

        return letters.size()==26;
    }
    public static void main(String[] args) {
        String test = "The quick brown fox jumps over the lazy dog";
        if(isPangram(test)){
            System.out.println("Yes");
        }

        else{
            System.out.println("No");
        }
    }
}
