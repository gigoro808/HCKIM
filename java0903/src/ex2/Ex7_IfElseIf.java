package ex2;

import java.util.Scanner;

/**
 *
 * @author kosta
 * Document : Ex7_IfElse Created on : 2014. 9. 3, ���� 1:51:09
 */
public class Ex7_IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�����ϴ� ���� �Է� (red,blue,green...):");
        String msg = sc.nextLine();
        //red
        //����ڰ� ���࿡ Red,RED : ��ҹ��� ���о��� StringŬ������ 
        // ���ڿ��� ���� �� ���ش�.
        if(msg.equalsIgnoreCase("red")) {
            System.out.println("������ �̱���.");
        }else if (msg.equalsIgnoreCase("blue")) {
            System.out.println("�Ķ����Դϴ�.");
        }else if (msg.equalsIgnoreCase("green")) {
            System.out.println("�ʷϻ��Դϴ�.");
        }else{
            System.out.println("�𸣰ڽ��ϴ�.");
        }
    }

}
