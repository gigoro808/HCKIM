package exam;

import java.util.Scanner;

/**
 *
 * @author kosta Document : Exam1_solv Created on : ����ö 2014. 9. 4, ���� 3:28:21
 */
public class Exam1_solv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // �������� �ʱ�ȭ / ������ �ʿ��� ���� 
        int winCnt = 0, totalCnt = 0;
        // ""-0����,"Ȧ"-1����..  String �迭�� �����ѳ���
        String[] m = {"", "Ȧ", "¦"};
        while (true) {
            System.out.print("Ȧ-1,¦-2,����-3:");
            int num = Integer.parseInt(sc.nextLine());
            //Math.random() : 0.0���� 1.0 ������ ������ �����Ѵ�.
            //(int) 0.0<(Math.random()*2)<2.0  ==> 0,1
            // +1�� �������� cNum�� 1,2�� ���� ������ �ȴ�.
            int cNum = (int) (Math.random() * 2) + 1;
            String msg = "";
            if (num == 3) {
                System.out.println("TOTAL:" + totalCnt);
                System.out.println("WIN :" + winCnt);
                //winn �޼ҵ�� winCnt�� totalCnt �ΰ��� ���ڸ� ���� �޼ҵ�
                int winN = winn(winCnt, totalCnt);
                System.out.println("�·�:" + winN + "%");
                if (totalCnt > 10){
                System.out.println("��ǰ:" + gift(winN));
                }
                System.out.println("����");
                break;
            } else if (num == cNum) {
                msg = "[�¸� �ϼ̽��ϴ�]";
                winCnt++;
            } else if (num != cNum) {
                msg = "[����� �����ϴ�.]";
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
    // �޼����� ��ȯ�� - ��ȯ�� �ڷ������� ���
    // return �ڷ����� �´°�
    // int xx = winn(50,100);   

    public static int winn(int win, int total) {
        // win�� total�� �ڷ����� int
        // win/total�� ������� double
        // ��Ȯ�� ����� ���ؼ��� win/total�� double���� �������Ѵ�

        int rate = (int) (((double) win / total) * 100);
        return rate;
    }

    public static String gift(int winN) {
        String gMsg = "";
        if (winN == 100) {
            gMsg = "�����մϴ�. ��� ��÷�Դϴ�. ^^";
        } else if (winN < 100 && winN >= 90) {
            gMsg = "�����մϴ�. ���� ��÷�Դϴ�. ^^";
        } else if (winN < 90 && winN >= 80) {
            gMsg = "�����մϴ�. �׷��� ��÷�Դϴ�. ^^";
        } else if (winN < 80 && winN >= 70) {
            gMsg = "�����մϴ�. �ҳ�Ÿ ��÷�Դϴ�. ^^";
        } else if (winN < 70 && winN >= 60) {
            gMsg = "�����մϴ�. ��� ��÷�Դϴ�. ^^";
        } else {
            gMsg = "�� ����ϼ���. ^^";
        }
        return gMsg;
    }

}
