package exam;

import java.util.Scanner;

/**
 *
 * @author kosta Document : Exam1 Created on : ±èÇöÃ¶ 2014. 9. 4, ¿ÀÈÄ 1:48:43
 */
public class Exam1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 1;
        int win = 0;
        while (true) {
            System.out.print("UI - 1-È¦, 2-Â¦, 3-Á¾·á :");
            int num = Integer.parseInt(sc.nextLine());
            System.out.println("TOTAL : " + total);
         
            int cnum = (int) (Math.random() * 2);
            if (num == 1) {
                if (cnum == 0) {
                    System.out.println("CPU : Â¦");
                    System.out.println("YOU : È¦");
                    System.out.println("==============");
                    System.out.println("WIN : " + win);
                    System.out.println("[´ç½ÅÀº Á³½À´Ï´Ù.]");

                } else if (cnum == 1) {
                    System.out.println("CPU : È¦");
                    System.out.println("YOU : È¦");
                    System.out.println("==============");
                    win++;
                    System.out.println("WIN : " + win);
                    System.out.println("[´ç½ÅÀº ÀÌ°å½À´Ï´Ù.]");
                }
            } else if (num == 2) {
                if (cnum == 0) {
                    System.out.println("CPU : Â¦");
                    System.out.println("YOU : Â¦");
                    System.out.println("==============");
                    win++;
                    System.out.println("WIN : " + win);
                    System.out.println("[´ç½ÅÀº ÀÌ°å½À´Ï´Ù.]");

                } else if (cnum == 1) {
                    System.out.println("CPU : È¦");
                    System.out.println("YOU : Â¦");
                    System.out.println("==============");
                    System.out.println("WIN : " + win);
                    System.out.println("[´ç½ÅÀº Á³½À´Ï´Ù.]");
             }
            }else if (num == 3) {
                     
                    System.out.println("WIN : " + win);
                    int per = (win / total) * 100;
                    System.out.println("½Â·ü : " + win + " %");
                    if (per == 100) {
                        System.out.println("»óÇ° : µÎ¹ÙÀÌ±¹¹ÎÂ÷");
                    } else if (per >= 90 & per < 100) {
                        System.out.println("»óÇ° : µÎ¹ÙÀÌ±¹¹Î¿ÀÅä¹ÙÀÌ");
                    } else if (per >= 80 & per < 90) {
                        System.out.println("»óÇ° : µÎ¹ÙÀÌ±¹¹ÎÀÚÀü°Å");
                    } else if (per >= 70 & per < 80) {
                        System.out.println("»óÇ° : µÎ¹ÙÀÌ±¹¹ÎÆù");
                    } else if (per >= 60 & per < 70) {
                        System.out.println("»óÇ° : µÎ¹ÙÀÌ±¹¹Î»óÇ°±Ç");
                    } else {
                        System.out.println("»óÇ° : ±âÅ¸");
                    } 
                   
                    break;
                }
                total++;
                System.out.println("");
            }

        }

    }

