package exam;

/**
 *
 * @author kosta Document : BoardControl Created on : ����ö 2014. 9. 11, ���� 2:15:17
 */
public class BoardControl {

    private BoardVO vo;
    // �Է¹��� ������ ���� "M","F","m","f" ���� �ƴѰ�� 
    // ������ �� �ֵ��� boolean �������� �޼��带 ��ȯ�Ѵ�
    // ������ �Է����� ��� �Է¹��� ���� ���� Ŭ������ vo�� �����Ѵ�.

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
