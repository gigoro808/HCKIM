package ex1;
/**
 *
 * @author kosta
 * Document : PaintA Created on : ����ö 2014. 9. 11, ���� 10:28:52
 */
public class PaintA {
    // ����ڰ� ȣ��ÿ� Home�� �ּҰ��� ������ ȣ���� �� �ֵ��� �����Ѵ�.
    // ���޹��� home�� �ּҿ��� setDoorColor�� �ڿ��� ����� �����Ѵ�.
    // ����ڰ� ȣ��� Home�� �ݵ�� ������ �� �� �ּҸ� ����.
    public void paintHome(Home home, String col) {
        System.out.println("Aȸ��");
        home.setDoorColor(col);
    }

}
