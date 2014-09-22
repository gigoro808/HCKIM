package ex1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author kosta Document : LottoApp Created on : 김현철 2014. 9. 17, 오전 10:37:28
 */
public class LottoApp {

    private String lotNum;

    public LottoApp() {
        // 초기화시 호출
        lottoGame();
    }

    private void lottoGame() {
        TreeSet<Integer> it = new TreeSet<>();
        while (it.size() < 6) {
            int num = (int) (Math.random() * 45 + 1);
            it.add(num);
        } 
        Iterator<Integer> ii = it.iterator();
        //*에서 String클래스의 불변적인 특징때문에 
        //메모리의 성능을 저하 시킬 수 있기 때문에
        //문자열을 전용으로 저장하는 버퍼객체에 담아 두고 사용한다.
        StringBuffer sb = new StringBuffer();
        while (ii.hasNext()) {
            Integer lotNumber = ii.next();
            //* lotNum += lotNumber +"\t";
            //StringBuffer에 담아두는 메서드
            sb.append(lotNumber).append("\t");
        }
        lotNum = sb.toString();
    }

    public String getLotNum() {
        return lotNum;
    }

}
