package ex1;

import java.util.Scanner;

/**
 *
 * @author kosta Document : Ex1_RoboMain Created on : ����ö 2014. 9. 5, ����
 * 10:37:42
 */
public class Ex1_RoboMain {

    // Ex1_Robo.class �޾Ƽ� �����ϱ� ���� �۾�

    public static void main(String[] args) {
        // �����ڷ��� Ex1_Robo ref; ����
        // new �����ڸ� ����ؼ� Ex1_Robo() Heap������ ����
        Ex1_Robo ref = new Ex1_Robo();
        //�Ӽ��� ���� �Ҵ�
        Scanner sc = new Scanner(System.in);
       // System.out.print("���� ON : true, ���� OFF : false : ");
       // boolean p = Boolean.parseBoolean(sc.nextLine());
       // ref.power = p;
        ref.power = true; // �������� �ִ� Ex1_Robo��ü�� �ڿ��� power��
        // true���� ������ ����
        // ���� ref.isPower() �޼��带 ȣ���ϸ� �翬�� true���� ������ �ִ� 
        // power���� ���� Ȯ���� �� �ִ�.
        if (ref.power == true) {
            System.out.println("�κ��� ������ �������ϴ�.");
        } else {
            System.out.println("�κ��� ������ �������ϴ�.");
        }
        // �������� : Ex1_Robo ��ü�� move()�� ȣ���ؼ�
        // �κ��� �����̰� �����ϰ� ���α׷��� �Ͻÿ�.
        // System.out.print("�κ��� ������ �ӷ��� �Է��ϼ��� : ");
        // int v = Integer.parseInt(sc.nextLine());
        // ref.move(v);
        boolean rv = ref.move(10);
        if(!rv){
            System.out.println("�κ� ���ۿ� ������ �ֽ��ϴ�.");
        }
    }
}
