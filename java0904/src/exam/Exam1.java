package exam;

import java.util.Scanner;

/**
 *
 * @author kosta Document : Exam1 Created on : ����ö 2014. 9. 4, ���� 1:48:43
 */
public class Exam1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 1;
        int win = 0;
        while (true) {
            System.out.print("UI - 1-Ȧ, 2-¦, 3-���� :");
            int num = Integer.parseInt(sc.nextLine());
            System.out.println("TOTAL : " + total);
         
            int cnum = (int) (Math.random() * 2);
            if (num == 1) {
                if (cnum == 0) {
                    System.out.println("CPU : ¦");
                    System.out.println("YOU : Ȧ");
                    System.out.println("==============");
                    System.out.println("WIN : " + win);
                    System.out.println("[����� �����ϴ�.]");

                } else if (cnum == 1) {
                    System.out.println("CPU : Ȧ");
                    System.out.println("YOU : Ȧ");
                    System.out.println("==============");
                    win++;
                    System.out.println("WIN : " + win);
                    System.out.println("[����� �̰���ϴ�.]");
                }
            } else if (num == 2) {
                if (cnum == 0) {
                    System.out.println("CPU : ¦");
                    System.out.println("YOU : ¦");
                    System.out.println("==============");
                    win++;
                    System.out.println("WIN : " + win);
                    System.out.println("[����� �̰���ϴ�.]");

                } else if (cnum == 1) {
                    System.out.println("CPU : Ȧ");
                    System.out.println("YOU : ¦");
                    System.out.println("==============");
                    System.out.println("WIN : " + win);
                    System.out.println("[����� �����ϴ�.]");
             }
            }else if (num == 3) {
                     
                    System.out.println("WIN : " + win);
                    int per = (win / total) * 100;
                    System.out.println("�·� : " + win + " %");
                    if (per == 100) {
                        System.out.println("��ǰ : �ι��̱�����");
                    } else if (per >= 90 & per < 100) {
                        System.out.println("��ǰ : �ι��̱��ο������");
                    } else if (per >= 80 & per < 90) {
                        System.out.println("��ǰ : �ι��̱���������");
                    } else if (per >= 70 & per < 80) {
                        System.out.println("��ǰ : �ι��̱�����");
                    } else if (per >= 60 & per < 70) {
                        System.out.println("��ǰ : �ι��̱��λ�ǰ��");
                    } else {
                        System.out.println("��ǰ : ��Ÿ");
                    } 
                   
                    break;
                }
                total++;
                System.out.println("");
            }

        }

    }

