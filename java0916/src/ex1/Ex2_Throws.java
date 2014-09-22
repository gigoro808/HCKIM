package ex1;

/**
 *
 * @author kosta Document : Ex2_Throws Created on : ����ö 2014. 9. 16, ���� 10:23:02
 */
public class Ex2_Throws {

    public void setData(String m) throws NumberFormatException {
        if (m.length() >= 1) {
            String str = m.substring(0, 1); // ���� ù��° ����
            printData(str);
        }
    }

    public void printData(String m) throws NumberFormatException {
        int dan = Integer.parseInt(m);
        System.out.println(dan + "��");
        System.out.println("----------------");
        for (int i = 0; i < 9; i++) {
            System.out.println(dan + "x" + (i + 1) + "=" + (dan * (i + 1)));
        }
    }
}
