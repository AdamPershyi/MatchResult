public class JavaCore {
    public static void main(String[] args) {
        System.out.println(toBinaryString(21));


    }
    public static String toBinaryString(int value) {
        int resoult = value % 2;
        String gg = String.valueOf(resoult);

        return gg;
    }

}
