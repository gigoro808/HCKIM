package ex1;

import java.util.Scanner;

/**
 *
 * @author kosta Document : Ex3_LoopSwitch Created on : 2014. 9. 4, ���� 10:36:02
 */
public class Ex3_LoopSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        xx: for (;;) {
            System.out.print("������ �Է�:(R,G,B) ����� bye :");
            String col = sc.nextLine();
            // String API�߿��� ���ڿ��� �ҹ��ڷ� ����
            col = col.toLowerCase();
            String res = "";
            switch (col) {
                case "red":
                    System.out.println("�������̳׿� ^^");
                    break;
                case "blue":
                    System.out.println("�Ķ����̳׿� ^^");
                    break;
                case "bye":
                    System.out.println("�����ϰ��������! ^^");
                    break xx;
            }
            System.out.println("����� �Է��� ������ " + col + "�Դϴ�.");
        }
    }

}
