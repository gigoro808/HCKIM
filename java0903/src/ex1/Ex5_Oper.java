package ex1;
/**
 *
 * @author kosta
 * Document : Ex_Oper5 Created on : 2014. 9. 3, ���� 11:13:06
 */
public class Ex5_Oper {
    public static void main(String[] args) {
        //����Ʈ������. >> bit���� ���������� �̵�
        //���ڸ��� ��ȣ������ ����)
        //<<
        int a = 12; // 0000 1100
        int b = 2;  // 0000 0011 ==> 3
        int c = a >> b;
        System.out.println(c);
    }

}
