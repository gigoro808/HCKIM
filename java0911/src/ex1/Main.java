package ex1;

/**
 *
 * @author kosta Document : Main Created on : ����ö 2014. 9. 11, ���� 10:34:53
 */
public class Main {

    public static void main(String[] args) {
        Home home = new Home();
        PaintA a = new PaintA();
        PaintB b = new PaintB();
        a.paintHome(home, "RED");
        b.paintHome(home, "BLUE");
        System.out.println("�빮 ������ "+home.getDoorColor());

    }

}
