package exam;

/**
 *
 * @author kosta Document : BoardControl Created on : 김현철 2014. 9. 11, 오후 2:15:17
 */
public class BoardControl {

    private BoardVO vo;
    // 입력받은 성별의 값이 "M","F","m","f" 값이 아닌경우 
    // 제어할 수 있도록 boolean 형식으로 메서드를 반환한다
    // 적절히 입력했을 경우 입력받은 값을 현재 클래스의 vo에 대입한다.

    public boolean info(BoardVO vo) {
        if (!vo.getGender().equalsIgnoreCase("m") && !vo.getGender().equalsIgnoreCase("f")) {
            return false;
        } else {
            this.vo = vo;
            return true;
        }

    }

    public BoardVO getVo() {
        return vo;
    }

}
