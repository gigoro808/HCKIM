package ex1;
/**
 *
 * @author kosta
 * Document : Ex1_Robo Created on : 김현철 2014. 9. 5, 오전 10:31:38

* 클래스를 설계하고 정의 하는 방법
* 접근제한자 : public, default
* Class명은 앞첫글자는 항상 대문자로 작성, 식별자 명명규칙
* main메서드는 분리한다.
*/ 
public class Ex1_Robo {
    /**
     * power는 전원의 값을 기억하는 속성
     * true가 켜진상태, false는 꺼진상태
     */
    boolean power;
    /**
     *  @serialField col은 색상값이며 빨강, 노랑들으로 제어할때 사용하세요.
     */
    String col;
    /**
     * 
     * @param num : 로봇의 상태값으로 0보다 큰수에 동작되도록 되어 있음
     * @return boolean 값으로 당신이 받아서 알아서 제어하시오.
     */
    public boolean move(int num){
        boolean res = false;
        if(num <=0 ){
            System.out.println("로보가 멈춥니다.");
        }else{
            System.out.println("로보가 "+num+"의 속도로 움직입니다.");
            res = true;
        }
        return res;
    }
    // 멤버필드의 power의 값을 돌려주는 메서드
   public boolean isPower() {
       return power;
   }

}
