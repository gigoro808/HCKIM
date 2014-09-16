package HW;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kosta
 * Document : MemberMain Created on : ����ö 2014. 9. 17, ���� 8:27:13
 */
public class MemberMain {

    public static void main(String[] args) {
        ArrayList<MemberVO> str = new ArrayList<>();
        MemberControl mc = new MemberControl();
        Scanner sc = new Scanner(System.in);
        stop : while (true) {
            System.out.println("===============================================");
            System.out.print("1 - ȸ�������Է�, 2 - ȸ������Ʈ���, 3 - ���� :");             
            int n = Integer.parseInt(sc.nextLine());
            System.out.println("===============================================");
            switch (n) {
                case 1:
                    MemberVO v = new MemberVO();
                    System.out.print("ȸ����ȣ(int) : ");
                    v.setNum(Integer.parseInt(sc.nextLine()));
                    System.out.print("ȸ���� �̸�(String) : ");
                    v.setName(sc.nextLine());
                    System.out.print("ȸ���� ������(float) : ");
                    v.setWeight(Float.parseFloat(sc.nextLine()));
                    System.out.print("ȸ���� ���ǿ���(boolean) : ");
                    v.setAgree(Boolean.parseBoolean(sc.nextLine()));
                    System.out.print("ȸ���� �̸���(String) : ");
                    v.setEmail(sc.nextLine());
                    System.out.print("ȸ���� ����(int) : ");
                    v.setAge(Integer.parseInt(sc.nextLine()));
                    str.add(v);
                   
                    break;
                case 2:
                    
                    for (MemberVO e : str) {
                        System.out.println("ȸ����ȣ :" + e.getNum());
                        System.out.println("�̸� :" + e.getName());
                        System.out.println("������ :" + e.getWeight()+" kg");
                        System.out.println("���ǿ��� :" + e.isAgree());
                        System.out.println("ȸ�� �̸���:" + e.getEmail());
                        System.out.println("���� :" + e.getAge()+"��");
                        mc.info(e);
                        System.out.println("===============================================");
                    }
                    break;
                case 3:
                    System.out.println("�����մϴ�!");
                    break stop;
            }
        }
    }
}

