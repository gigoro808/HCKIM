package HW;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kosta Document : Main Created on : ����ö 2014. 9. 16, ���� 5:17:33
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<MemberVO> str = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        while (true) {
            System.out.print("1 - ȸ�������Է�, 2 - ȸ������Ʈ���, 3 - ���� :");
            switch (n) {
                case 1:
                    MemberVO v = new MemberVO();
                    System.out.print("ȸ����ȣ : ");
                    v.setNum(sc.nextInt());
                    System.out.print("ȸ���� �̸� : ");
                    v.setName(sc.nextLine());
                    System.out.print("ȸ���� ������ : ");
                    v.setWeight(sc.nextFloat());
                    System.out.print("ȸ���� ���ǿ��� : ");
                    v.setAgree(sc.nextBoolean());
                    System.out.print("ȸ���� �̸��� : ");
                    v.setEmail(sc.nextLine());
                    System.out.print("ȸ���� ���� : ");
                    v.setAge(sc.nextInt());
                    str.add(v);

                case 2:
                    for(MemberVO e : str){
                    System.out.println("ȸ����ȣ :" + e.getNum());
                    System.out.println("�̸� :" + e.getName());
                    System.out.println("������ :" + e.getWeight());
                    System.out.println("���ǿ��� :" + e.isAgree());
                    System.out.println("ȸ�� �̸���:" + e.getEmail());
                    System.out.println("���� :" + e.getAge());
                    }
                    
                    //e.info(v);

                case 3:
                    System.out.println("�����մϴ�!");

            }
        }
    }
}
