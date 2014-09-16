package exam;

import java.util.Scanner;

/**
 *
 * @author kosta Document : ExamException Created on : 김현철 2014. 9. 16, 오전
 * 9:45:34
 */
public class ExamException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // NumberFormatException - 숫자가 아닌 값
        // ArithmeticException - 0으로 나눌려고 할 때
        for (int i = 0; i <= 10; i++) {
            System.out.print("수 입력 :");
            try {
                int num = Integer.parseInt(sc.nextLine());
                int com = (int) (Math.random() * 3); //0~2
                int res = num / com;
                System.out.println("출력된 결과 :" + res);
                // return으로 인해 종료되면 출력이 안됨
                System.out.println("자원 반납!");
//NumberFormatException와 ArithmeticException은 Exception에 포함되어 있는 예외
//따라서 Exception이 처음에 나오게 되면 아래에 예외처리가 무의미해지기 때문에
//컴파일 에러가 발생한다.
//            } catch (Exception e) {
//                System.out.println("숫자만 작성");
            } catch (NumberFormatException e) {
                System.out.println("숫자만 작성");
                // return문이 들어가게 되면 오류발생시 종료되게 된다.
                // 따라서 반드시 수행되어야 하는 구문이 있다면 
                // 마지막에 finally사용하도록 한다.
                return; 
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다.");
            } catch (Exception e) {
                // 상위예외객체가 항상 아래에 와야 한다. ***
                System.out.println("숫자만 작성");
            } finally { // 무조건 수행되는 개념!
                System.out.println("무조건 실행되면 자원을 반환!");
            }

        }
    }
}
