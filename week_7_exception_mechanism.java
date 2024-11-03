public class week_7_exception_mechanism {
    public static void main(String[] args) {
        int n = 10;
        int d = 0;

        try{
            int res = n/d;
            System.out.println(res);


        }

        catch(ArithmeticException e){
            System.out.println("Cannot divide with 0");
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }

        finally{
            System.out.println("Runned up anyways!");
        }
    }
}
