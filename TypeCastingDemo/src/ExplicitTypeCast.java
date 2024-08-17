public class ExplicitTypeCast {
    public static void main(String[] args) {
        int i = 122;
        byte b = (byte) i;
        System.out.println(b);

        // Converting beyond range
        int j = 130;
        byte c = (byte) j;
        System.out.println(c); // prints -126

        long l = 1234567898;
        int h = (int) l;
        System.out.println(h);

        byte p = 100;
        char ch = (char) p;
        System.out.println(ch);
    }
}
