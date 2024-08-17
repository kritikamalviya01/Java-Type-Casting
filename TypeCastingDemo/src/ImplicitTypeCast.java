//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ImplicitTypeCast {
    public static void main(String[] args) {

        // converting byte to short to int to long implicitly
        byte a = 1;
        short b = a;
        int c = b;
        long d = c;
        char e = 'A';
        System.out.println(d);
        System.out.println(e);

        float f = 12.01f;
        double g = f;
        System.out.println(g);
    }
}