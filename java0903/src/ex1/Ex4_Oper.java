package ex1;
/**
 *
 * @author kosta
 * Document : Ex4_Oper Created on : 2014. 9. 3, ���� 11:09:46
 */
public class Ex4_Oper {
    public static void main(String[] args) {
        int a = 10; // 1010
        int b = 7;  // 0111 => 0010 = 2
        int c = a & b;
        System.out.println("���� c :"+c);
        int c2 = a | b;
        System.out.println("���� c :"+c2);
        int c3 = a ^ b;
        System.out.println("���� c :"+c3);
        int c4 = ~a;
        System.out.println("���� c :"+c4);
    }

}
