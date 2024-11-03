public class week_7_multiple_exceptions {
    public static void main(String[] args) {
        String[] inputs = {"10", "0", null};

        for(String input:inputs){
            try{
                int n = Integer.parseInt(input);
                int res = 100/n;

                System.out.println(res);
            }

            catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }

            catch(NullPointerException e){
                System.out.println(e.getMessage());
            }

            catch(NumberFormatException e){
                System.out.println(e.getMessage());

            }
        }
    }
}
