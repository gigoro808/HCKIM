package ex1;

/**
 *
 * @author kosta Document : Ex1_CallbyValue Created on : ����ö 2014. 9. 11, ����
 * 9:31:20
 */
public class Ex1_CallbyValue {

    public void test(int n) {
        n = n + 10;
        // n�� ���� call������ �� ������ ����Ǿ� n1: 20 
        System.out.println("n1: " + n);
    }

    public static void main(String[] args) {
        // // static�� �ƴ� �޼ҵ带 ����ϱ� ���ؼ��� ��ü�� ������ �� ȣ��
        Ex1_CallbyValue a = new Ex1_CallbyValue();
        int n = 10; // ���� �������� n���� 10���� �ʱ�ȭ
        a.test(n);
        //������ n�� test�޼��� �������� ��ȿ�� ����������
        // �޼����� ������ ����Ǹ� stack���� �Ҹ��Ѵ�.
        //  n2 : 10
        System.out.println("n2: " + n);
    }
}
