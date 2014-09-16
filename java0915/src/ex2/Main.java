package ex2;
/**
 *
 * @author kosta
 Document : Main Created on : 김현철 2014. 9. 15, 오전 10:22:19
 */
public class Main {
    public static void main(String[] args) {
        // 추상 클래스는 new로 객체가 생성될 수 없다.
        // 내부클래스
        Super su = new Super() {

            @Override
            public void draw(String msg) {
                System.out.println("헛 :");
            }
        };
        su.draw("Test");
        
        Super[] ar = new Super[2];
        ar[0] = new A();
        ar[1] = new B();
        String[] msg = {"사각형","육각형"};
        int i = 0;
        for(Super e : ar){
            e.draw(msg[i]);
            i++;
        }
    }
}
