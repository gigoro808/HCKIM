package ex1;
/**
 *
 * @author kosta
 * Document : Ex2_Main Created on : ����ö 2014. 9. 16, ���� 10:37:32
 */
public class Ex2_Main {
    Ex2_Throws et;
    public Ex2_Main(String m){
        et = new Ex2_Throws();
        try {
            et.setData(m);
        } catch (NumberFormatException e) {
            System.out.println("����� ���ڸ� �Է��߽��ϴ�. ���ڸ� �Է�");
            e.printStackTrace(); // �����޼����� Ȯ��!
        }
    }
    public static void main(String[] args) {
        Ex2_Main ref = new Ex2_Main("a");
    }
}
