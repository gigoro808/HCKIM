package HW;

/**
 *
 * @author kosta Document : MemberControl Created on : 김현철 2014. 9. 16, 오후
 * 5:16:48
 */
public class MemberControl {

    private MemberVO vo;

    public void info(MemberVO vo) {
        if (vo.getAge() <= 18) {
            System.out.println("[미성년자] / 성년");

        } else {
            System.out.println("미성년자 / [성년]");

        }
    }

    public MemberVO getVo() {
        return vo;
    }

}
