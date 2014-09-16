package ex1;

/**
 *
 * @author kosta Document : MyThread Created on : 김현철 2014. 9. 16, 오전 11:37:54
 */
public class MyThread {

    public MyThread() {
        for (int i = 0; i < 10; i++) {
            try {
                //일반적인 예외는 반드시 컴파일단계에서 점검함!
                //sleep은 지연이 발생하는것을 체크?
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
