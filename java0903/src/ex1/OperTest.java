package ex1;
/**
 *
 * @author kosta
 * Document : OerTest Created on : 2014. 9. 3, ���� 10:44:04
 */
public class OperTest { 
    // && : �������� true�� ���� �������� �����ϸ�
    // �������� false�̸� �������� �������� �ʴ´�. 
    // || : �������� true�̸� �������� �������� ������
    // �������� false�� ���� �������� �����Ѵ�. 
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // (( a += 12) > b )�� true, (a==(b+=2))�� ������� �ʴ´�.
        boolean c = ((a += 12) >b) || (a == (b += 2)); 
        System.out.println(c); // true || ����ȵ� = true
        System.out.println(a); // (a += 12) = 10+12 = 22
        System.out.println(b); // (b += 2) ����ȵ�, b=20
    }
}
