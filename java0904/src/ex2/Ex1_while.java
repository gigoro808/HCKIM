package ex2;
/**
 *
 * @author kosta
 * Document : Ex1_while Created on : ±èÇöÃ¶ 2014. 9. 4, ¿ÀÈÄ 12:01:45
 */
public class Ex1_while {
    public static void main(String[] args) {
        int total = 0;
        int number = 1;
        while (number <= 10) {
            System.out.print(total+"\t");
            total += number;
            number++;
            
                    }
        System.out.println("total : "+ total);
    }

}
