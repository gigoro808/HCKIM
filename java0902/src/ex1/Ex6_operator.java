package ex1;

import java.util.Scanner;

/**
 *
 * @author kosta
 * Document : Ex6_oper Created on : 2014. 9. 2, ���� 1:59:54
 */
public class Ex6_operator {
    public static void main(String[] args) {
        // Scanner Ŭ������ ����ؼ� ����ڷ� ���� �Է�ó��
        // Scanner sc ���� �ϸ鼭 ����
        // Scanner sc = new Scanner(System.in);
        // ���� - Ŭ������ ����ϱ� ���ؼ��� Ctrl + space�� �ҷ��� ���
        Scanner sc = new Scanner(System.in);
        
        // UI ���ڸ� �Է��ϼ���.
        System.out.println("�޼��� �Է� :");
        
        //����ڷ� ���� ���ڿ��� �Է� ���� ��  String msg�� �����ϱ�
        //sc.nextLine()�� �޼��尡 ȣ���� �Ǹ� String���� ��ȯ�Ǳ⶧����
        //�Ʒ��� ���� ���� Ÿ���� ������ �����ؼ� ���� �� �ִ�.
        //�޼��� �м�) �Է¹��� ���ڿ��� ?�� ������ �о String���� ��ȯ�Ѵ�. 
        String msg = sc.nextLine(); //blocking �޼���
        
        System.out.println("�޼��� �Է�2 :");
        String msg2 = sc.nextLine();
        
        System.out.println("=================================================");
        System.out.println("�Է°�1 :"+msg);
        System.out.println("�Է°�2 :"+msg2);
        System.out.println("msg/msg2 �ּҰ��� �� :"+(msg==msg2)); // false
        // String Ŭ���� : ���ڿ����� ������ ��ü
        System.out.println("msg/msg2 ������ �� :"+(msg.equals(msg2))); // true
        // ����
        String svc1 = new String("MyTest");
        String svc2 = new String("MyTest");
        System.out.println("svc1/svc2 ������ �� :"+(svc1.equals(svc2))); //true

//        // �Ϲ��ڷ��� :  �� ��
//        int a = 10;
//        int b = 20;
//        System.out.println("a��b �� : "+(a==b));
//        // �����ڷ��� : �ּҰ� ��
//        String str1 = new String("T");
//        String str2 = new String("T");
//        System.out.println("str1��str2 �� : "+(str1==str2));
//        
//        String str3 = "T";
//        String str4 = "T";
//        System.out.println("str3��str4 �� : "+(str3==str4));
//        
    }

}
