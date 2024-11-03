import java.util.Arrays;

public class week_4_anagram {

    public static boolean anagramChecker(String str1,  String str2){
        str1.replaceAll("\\s", "").toLowerCase();
        str2.replaceAll("\\s", "").toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String s1 = "CAT";
        String s2 = "ACT";

        System.out.println(anagramChecker(s1, s2));
    }
}
