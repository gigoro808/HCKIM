package ex2;
/**
 *
 * @author kosta
 * Document : Ex1_Abstract Created on : 김현철 2014. 9. 12, 오후 12:00:57
 */
// 추상메서드를 가진 클래스는 반드시 추상클래스여야 한다.
public abstract class Ex1_Abstract {
    private String money;

    public Ex1_Abstract() {
        money = "1000억원";
    }
    //추상 메서드 : 산을 옮겨라.
    abstract public void moveMount();

    //일반 메서드
    public String getMoney() {
        return money;
    }
    
}
