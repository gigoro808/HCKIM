package exam;

import java.util.Scanner;

/**
 *
 * @author kosta Document : Exam3_sol Created on : 2014. 9. 4, ���� 9:27:21
 */
public class Exam3_sol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("���Է� : ");
        int dan = Integer.parseInt(sc.nextLine());
        System.out.print("�����Է�(3,5,7,9) :");
        int limit = Integer.parseInt(sc.nextLine());
        int start = dan - limit / 2; //����ȯ
        int end = dan + limit / 2;
        for (int i = 0; i <= 9; i++) {
            for (int j = start; j <= end; j++) {
                if (i == 0) {
                    System.out.print("   " + j + "��\t\t");
                } else {
                    if (j > 0) {
                        System.out.print(j + " x " + i + " = " + (i * j) + "\t");
                    } else {
                        System.out.print("          \t");
                    }
                }

            }
            System.out.println("");
        }

    }
}
