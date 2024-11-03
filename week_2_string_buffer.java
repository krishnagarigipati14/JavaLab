public class week_2_string_buffer {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("Hello World");
        System.out.println(str);
        str.delete(1,3);
        System.out.println(str);
    }
}
