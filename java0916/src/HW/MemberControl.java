package HW;

/**
 *
 * @author kosta Document : MemberControl Created on : ����ö 2014. 9. 16, ����
 * 5:16:48
 */
public class MemberControl {

    private MemberVO vo;

    public void info(MemberVO vo) {
        if (vo.getAge() <= 18) {
            System.out.println("[�̼�����] / ����");

        } else {
            System.out.println("�̼����� / [����]");

        }
    }

    public MemberVO getVo() {
        return vo;
    }

}
