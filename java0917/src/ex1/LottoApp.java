package ex1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author kosta Document : LottoApp Created on : ����ö 2014. 9. 17, ���� 10:37:28
 */
public class LottoApp {

    private String lotNum;

    public LottoApp() {
        // �ʱ�ȭ�� ȣ��
        lottoGame();
    }

    private void lottoGame() {
        TreeSet<Integer> it = new TreeSet<>();
        while (it.size() < 6) {
            int num = (int) (Math.random() * 45 + 1);
            it.add(num);
        } 
        Iterator<Integer> ii = it.iterator();
        //*���� StringŬ������ �Һ����� Ư¡������ 
        //�޸��� ������ ���� ��ų �� �ֱ� ������
        //���ڿ��� �������� �����ϴ� ���۰�ü�� ��� �ΰ� ����Ѵ�.
        StringBuffer sb = new StringBuffer();
        while (ii.hasNext()) {
            Integer lotNumber = ii.next();
            //* lotNum += lotNumber +"\t";
            //StringBuffer�� ��Ƶδ� �޼���
            sb.append(lotNumber).append("\t");
        }
        lotNum = sb.toString();
    }

    public String getLotNum() {
        return lotNum;
    }

}
