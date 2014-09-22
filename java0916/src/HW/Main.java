package HW;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kosta Document : Main Created on : 김현철 2014. 9. 16, 오후 5:17:33
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<MemberVO> str = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        while (true) {
            System.out.print("1 - 회원정보입력, 2 - 회원리스트출력, 3 - 종료 :");
            switch (n) {
                case 1:
                    MemberVO v = new MemberVO();
                    System.out.print("회원번호 : ");
                    v.setNum(sc.nextInt());
                    System.out.print("회원의 이름 : ");
                    v.setName(sc.nextLine());
                    System.out.print("회원의 몸무게 : ");
                    v.setWeight(sc.nextFloat());
                    System.out.print("회원의 동의여부 : ");
                    v.setAgree(sc.nextBoolean());
                    System.out.print("회원의 이메일 : ");
                    v.setEmail(sc.nextLine());
                    System.out.print("회원의 나이 : ");
                    v.setAge(sc.nextInt());
                    str.add(v);

                case 2:
                    for(MemberVO e : str){
                    System.out.println("회원번호 :" + e.getNum());
                    System.out.println("이름 :" + e.getName());
                    System.out.println("몸무게 :" + e.getWeight());
                    System.out.println("동의여부 :" + e.isAgree());
                    System.out.println("회원 이메일:" + e.getEmail());
                    System.out.println("나이 :" + e.getAge());
                    }
                    
                    //e.info(v);

                case 3:
                    System.out.println("종료합니다!");

            }
        }
    }
}
