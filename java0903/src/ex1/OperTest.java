package ex1;
/**
 *
 * @author kosta
 * Document : OerTest Created on : 2014. 9. 3, 오전 10:44:04
 */
public class OperTest { 
    // && : 선조건이 true일 때만 후조건을 실행하며
    // 선조건이 false이면 후조건은 실행하지 않는다. 
    // || : 선조건이 true이면 후조건을 실행하지 않으며
    // 선조건이 false일 때만 후조건을 실행한다. 
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // (( a += 12) > b )가 true, (a==(b+=2))는 실행되지 않는다.
        boolean c = ((a += 12) >b) || (a == (b += 2)); 
        System.out.println(c); // true || 실행안됨 = true
        System.out.println(a); // (a += 12) = 10+12 = 22
        System.out.println(b); // (b += 2) 실행안됨, b=20
    }
}
