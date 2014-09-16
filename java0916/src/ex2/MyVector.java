package ex2;

import java.util.Vector;

/**
 *
 * @author kosta Document : MyVector Created on : ����ö 2014. 9. 16, ���� 12:14:08
 */
public class MyVector {

    public static void main(String[] args) {
        // �÷����� �ڷᱸ���̰�, ��ü�� ������ ��!
        Vector v = new Vector();
        v.add(new String("Test"));
        v.add(10);
        v.add('A');
        v.add(true);
        v.add(3.14f);
        v.add(100L);
        System.out.println("������ ũ�� :" + v.size());

        for (Object e : v) {
            //Vector�� ����� �� ��ü�� �ڷ����� ������ �̸����� ����ϱ�
            if (e instanceof String) {
                System.out.println("String :" + e);
            } else if (e instanceof Integer) {
                System.out.println("Integer :" + e);
            } else if (e instanceof Boolean) {
                System.out.println("Boolean :" + e);
            } else if (e instanceof Short) {
                System.out.println("Short :" + e);
            } else if (e instanceof Byte) {
                System.out.println("Byte :" + e);
            } else if (e instanceof Long) {
                System.out.println("Long :" + e);
            } else if (e instanceof Float) {
                System.out.println("Float :" + e);
            } else if (e instanceof Double) {
                System.out.println("Double :" + e);
            }
        }
    }
}
