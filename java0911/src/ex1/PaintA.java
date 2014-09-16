package ex1;
/**
 *
 * @author kosta
 * Document : PaintA Created on : 김현철 2014. 9. 11, 오전 10:28:52
 */
public class PaintA {
    // 사용자가 호출시에 Home의 주소값과 색상값을 호출할 수 있도록 정의한다.
    // 전달받은 home의 주소에서 setDoorColor란 자원을 꺼내어서 가공한다.
    // 사용자가 호출시 Home을 반드시 생성한 후 그 주소를 전달.
    public void paintHome(Home home, String col) {
        System.out.println("A회사");
        home.setDoorColor(col);
    }

}
