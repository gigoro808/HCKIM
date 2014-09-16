package ex1;
/**
 *
 * @author kosta
 * Document : PojoTest Created on : 김현철 2014. 9. 5, 오전 11:47:46
 */
// POJO (순수한 값만을 가지는 객체)
// 상속등 어디에도 귀속되지 않는 클래스
// 기본생성자로 생성되는 클래스
// 멤버필드는 은닉화 되고, 접근은 setter/getter로 캡슐화 시킨 클래스
public class PojoTest {
    private int num;
    private String name;
    private boolean flag;
    // boolean만 getter가 isXX형식임 ***
    public boolean isFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
     

}
