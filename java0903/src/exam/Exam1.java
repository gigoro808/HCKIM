package exam;

import java.util.Scanner;

/**
 *
 * @author kosta
 * Document : Exam1 Created on : 2014. 9. 3, ���� 11:35:44
 */
public class Exam1 {
    public static void main(String[] args) {
        // Scanner�� ���� ���� �Է¹��� �� 
        // �� ���� Ȧ������ ¦�������� ����ϼ���.
        // ex) �� �Է� : 1 <Enter>
        // �Է��� �� [1]�� Ȧ�� �Դϴ�.
        // [����] : Scanner, if else, ����
        Scanner sc = new Scanner(System.in);
        System.out.print("�� �Է� : ");   
        // ����ڷκ��� ���� �ޱ� ���� ���� ����� �޼��� ȣ��
        int a = Integer.parseInt(sc.nextLine());
        String msg="";
        if (a%2 == 0) {
            msg ="¦��";
            // System.out.println("�Է��� �� ["+a+"]�� ¦�� �Դϴ�.");
        } else {
            msg ="Ȧ��";
           // System.out.println("�Է��� �� ["+a+"]�� Ȧ�� �Դϴ�."); 
        }
        System.out.println("�Է��� �� ["+a+"]�� "+msg+"�Դϴ�.");
    }
    

}
