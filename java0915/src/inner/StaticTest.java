package inner;

/**
 *
 * @author kosta Document : StaticTest Created on : ±èÇöÃ¶ 2014. 9. 15, ¿ÀÈÄ 3:06:08
 */
public class StaticTest {

    private static int a;
    private int b;

    public int increment() {
        a++;
        return a;
    }

    public int increment2() {
        b++;
        return b;
    }

    public static void main(String[] args) {
        StaticTest t1 = new StaticTest();
        StaticTest t2 = new StaticTest();
        System.out.println(t1.increment());
        System.out.println(t1.increment2());
        System.out.println("--------------------");
        System.out.println(t2.increment());
        System.out.println(t2.increment2());
    }
}
