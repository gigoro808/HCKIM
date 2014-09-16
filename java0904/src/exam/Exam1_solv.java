package exam;

import java.util.Scanner;

/**
 *
 * @author kosta Document : Exam1_solv Created on : 김현철 2014. 9. 4, 오후 3:28:21
 */
public class Exam1_solv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 지역변수 초기화 / 누적이 필요한 변수 
        int winCnt = 0, totalCnt = 0;
        // ""-0번지,"홀"-1번지..  String 배열에 기억시켜놓자
        String[] m = {"", "홀", "짝"};
        while (true) {
            System.out.print("홀-1,짝-2,종료-3:");
            int num = Integer.parseInt(sc.nextLine());
            //Math.random() : 0.0에서 1.0 사이의 난수를 리턴한다.
            //(int) 0.0<(Math.random()*2)<2.0  ==> 0,1
            // +1을 해줌으로 cNum은 1,2의 값을 가지게 된다.
            int cNum = (int) (Math.random() * 2) + 1;
            String msg = "";
            if (num == 3) {
                System.out.println("TOTAL:" + totalCnt);
                System.out.println("WIN :" + winCnt);
                //winn 메소드는 winCnt와 totalCnt 두개의 인자를 가진 메소드
                int winN = winn(winCnt, totalCnt);
                System.out.println("승률:" + winN + "%");
                if (totalCnt > 10){
                System.out.println("상품:" + gift(winN));
                }
                System.out.println("종료");
                break;
            } else if (num == cNum) {
                msg = "[승리 하셨습니다]";
                winCnt++;
            } else if (num != cNum) {
                msg = "[당신은 졌습니다.]";
            }
            totalCnt++;
            System.out.println("TOTAL:" + totalCnt);
            System.out.println("CPU :" + m[cNum]);
            System.out.println("YOU :" + m[num]);

            System.out.println("------------");
            System.out.println("WIN :" + winCnt);
            System.out.println(msg);
        }
    }
    // 메서드의 반환형 - 반환될 자료형으로 명시
    // return 자료형에 맞는값
    // int xx = winn(50,100);   

    public static int winn(int win, int total) {
        // win과 total의 자료형은 int
        // win/total의 계산결과는 double
        // 정확한 결과를 위해서는 win/total의 double값을 가져야한다

        int rate = (int) (((double) win / total) * 100);
        return rate;
    }

    public static String gift(int winN) {
        String gMsg = "";
        if (winN == 100) {
            gMsg = "축하합니다. 페라리 당첨입니다. ^^";
        } else if (winN < 100 && winN >= 90) {
            gMsg = "축하합니다. 에쿠스 당첨입니다. ^^";
        } else if (winN < 90 && winN >= 80) {
            gMsg = "축하합니다. 그랜져 당첨입니다. ^^";
        } else if (winN < 80 && winN >= 70) {
            gMsg = "축하합니다. 소나타 당첨입니다. ^^";
        } else if (winN < 70 && winN >= 60) {
            gMsg = "축하합니다. 모닝 당첨입니다. ^^";
        } else {
            gMsg = "더 노력하세요. ^^";
        }
        return gMsg;
    }

}
