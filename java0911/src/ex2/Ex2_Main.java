package ex2;

import ex2.vo.MemberVO;
import java.util.Scanner;

/**
 *
 * @author kosta
 * Document : Ex2_Main Created on : ����ö 2014. 9. 11, ���� 11:29:11
 */
public class Ex2_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("��ȣ �Է� :");
        MemberVO vo2 = new MemberVO();
        vo2.setNum(Integer.parseInt(sc.nextLine()));
        //int num = Integer.parseInt(sc.nextLine());
        System.out.print("�̸� �Է� :");
        vo2.setName(sc.nextLine());
        //String name = sc.nextLine();
        System.out.print("���� �Է� :");
        vo2.setAge(sc.nextLine());
        //String age = sc.nextLine();
        System.out.print("���� �Է� :");
        vo2.setGender(sc.nextLine());
        //String gender = sc.nextLine();
        System.out.print("��ȭ��ȣ �Է� :");
        vo2.setTel(sc.nextLine());
        //String tel = sc.nextLine();
        //-- ���Ŭ���� ����
        System.out.println("�Է��Ͻ� ���� :");
        System.out.println("��ȣ :"+vo2.getNum());
        System.out.println("�̸� :"+vo2.getName());
        System.out.println("���� :"+vo2.getAge());
        System.out.println("���� :"+vo2.getGender());
        System.out.println("��ȭ��ȣ :"+vo2.getTel());
    }
}
