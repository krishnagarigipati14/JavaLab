public class week_4_permutations_string {

    public static void permutations(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String remaining =  str.substring(0,i) + str.substring(i+1);

            permutations(remaining, ans+ch);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("All the permutations");
        permutations(str, " ");
    }
}
