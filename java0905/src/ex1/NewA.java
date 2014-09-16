package ex1;
/**
 *
 * @author kosta
 * Document : NewA Created on : 김현철 2014. 9. 5, 오전 11:29:44
 */
public class NewA {
    public static void main(String[] args) {
        NewClass ref = new NewClass();
        ref.insertPay(1000, "dd");
        int pay = ref.getPay();
        int res = pay * 1000;
        System.out.println("당신의 급여는 :"+res+"입니다.");
    }

}
