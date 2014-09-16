package ex2;

import ex2.vo.MemberVO;

/**
 *
 * @author kosta
 * Document : Ex2_CallbyReference Created on : 김현철 2014. 9. 11, 오전 11:23:33
 */
public class Ex2_CallbyReference1 {
    // 연습문제 : 현재 클래스는 변화에 유연하지 못한 클래스로 설계가 되어 있다.
    // info라 메서드에게 자원을 추가해서 사용하기 위해서
    // 메서드의 인자값도 늘여야 하고, 멤버필드 및 setter/getter도 늘려야 한다.
    // private boolean agree를 추가해서 사용해보면 알것임..
    // POJO, CallbyReference를 적적히 사용하면 해결됨.
   private MemberVO vo;
   
   // 메서드로 호출시 MemberVO를 생성한 후 setter로 값을 저장한 후 
   // 인자값으로 호출해야 한다. ******
    public void info(MemberVO vo){
    // 만약 가공이 필요하다면? *****
        if(vo.getTel().contains("02")){
            System.out.println("Log : 서울사람이닷!");
        }
        this.vo = vo;
    }
    public MemberVO getVO() {
        return vo;
    }
}