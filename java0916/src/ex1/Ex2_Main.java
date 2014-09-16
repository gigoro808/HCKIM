package ex1;
/**
 *
 * @author kosta
 * Document : Ex2_Main Created on : 김현철 2014. 9. 16, 오전 10:37:32
 */
public class Ex2_Main {
    Ex2_Throws et;
    public Ex2_Main(String m){
        et = new Ex2_Throws();
        try {
            et.setData(m);
        } catch (NumberFormatException e) {
            System.out.println("당신은 문자를 입력했습니다. 숫자만 입력");
            e.printStackTrace(); // 에러메세지를 확인!
        }
    }
    public static void main(String[] args) {
        Ex2_Main ref = new Ex2_Main("a");
    }
}
