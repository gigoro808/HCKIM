package ex2;

import java.util.Scanner;

/**
 *
 * @author kosta
 * Document : Ex2_dowhile Created on : ±èÇöÃ¶ 2014. 9. 4, ¿ÀÈÄ 12:08:26
 */
public class Ex2_dowhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      int selection;
                do {
            System.out.print("Select number :");
            selection = Integer.parseInt(in.nextLine());
            System.out.println("Your number is "+selection); 
        }
        while (selection !=0);
    }

}
