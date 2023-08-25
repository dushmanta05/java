
public class logical {
    public static void main(String a[])
    {
        int p = 5;
        int q = 6;
        int r = 7;
        int s = 8;

        boolean result1 = p<q && r>s;
        System.out.println((result1));

        boolean result2 = p<q || r>s;
        System.out.println((result2));

        boolean result3 = !(p<q || r>s);
        System.out.println((result3));

    }
}
