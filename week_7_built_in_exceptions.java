public class week_7_built_in_exceptions {
    public static void main(String[] args) {
        int n = 10;
        int d = 0;

        try{
            int res = n/d;
            System.out.println(res);
        }

        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
