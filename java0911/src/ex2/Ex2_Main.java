package ex2;

import ex2.vo.MemberVO;
import java.util.Scanner;

/**
 *
 * @author kosta
 * Document : Ex2_Main Created on : 김현철 2014. 9. 11, 오전 11:29:11
 */
public class Ex2_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("번호 입력 :");
        MemberVO vo2 = new MemberVO();
        vo2.setNum(Integer.parseInt(sc.nextLine()));
        //int num = Integer.parseInt(sc.nextLine());
        System.out.print("이름 입력 :");
        vo2.setName(sc.nextLine());
        //String name = sc.nextLine();
        System.out.print("나이 입력 :");
        vo2.setAge(sc.nextLine());
        //String age = sc.nextLine();
        System.out.print("성별 입력 :");
        vo2.setGender(sc.nextLine());
        //String gender = sc.nextLine();
        System.out.print("전화번호 입력 :");
        vo2.setTel(sc.nextLine());
        //String tel = sc.nextLine();
        //-- 사용클래스 생성
        System.out.println("입력하신 정보 :");
        System.out.println("번호 :"+vo2.getNum());
        System.out.println("이름 :"+vo2.getName());
        System.out.println("나이 :"+vo2.getAge());
        System.out.println("성별 :"+vo2.getGender());
        System.out.println("전화번호 :"+vo2.getTel());
    }
}
