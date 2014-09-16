package HW;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kosta
 * Document : MemberMain Created on : 김현철 2014. 9. 17, 오전 8:27:13
 */
public class MemberMain {

    public static void main(String[] args) {
        ArrayList<MemberVO> str = new ArrayList<>();
        MemberControl mc = new MemberControl();
        Scanner sc = new Scanner(System.in);
        stop : while (true) {
            System.out.println("===============================================");
            System.out.print("1 - 회원정보입력, 2 - 회원리스트출력, 3 - 종료 :");             
            int n = Integer.parseInt(sc.nextLine());
            System.out.println("===============================================");
            switch (n) {
                case 1:
                    MemberVO v = new MemberVO();
                    System.out.print("회원번호(int) : ");
                    v.setNum(Integer.parseInt(sc.nextLine()));
                    System.out.print("회원의 이름(String) : ");
                    v.setName(sc.nextLine());
                    System.out.print("회원의 몸무게(float) : ");
                    v.setWeight(Float.parseFloat(sc.nextLine()));
                    System.out.print("회원의 동의여부(boolean) : ");
                    v.setAgree(Boolean.parseBoolean(sc.nextLine()));
                    System.out.print("회원의 이메일(String) : ");
                    v.setEmail(sc.nextLine());
                    System.out.print("회원의 나이(int) : ");
                    v.setAge(Integer.parseInt(sc.nextLine()));
                    str.add(v);
                   
                    break;
                case 2:
                    
                    for (MemberVO e : str) {
                        System.out.println("회원번호 :" + e.getNum());
                        System.out.println("이름 :" + e.getName());
                        System.out.println("몸무게 :" + e.getWeight()+" kg");
                        System.out.println("동의여부 :" + e.isAgree());
                        System.out.println("회원 이메일:" + e.getEmail());
                        System.out.println("나이 :" + e.getAge()+"세");
                        mc.info(e);
                        System.out.println("===============================================");
                    }
                    break;
                case 3:
                    System.out.println("종료합니다!");
                    break stop;
            }
        }
    }
}

