package exam;
/**
 *
 * @author kosta
 * Document : A Created on : 김현철 2014. 9. 4, 오후 4:06:04
 */
class A {
    public static void main(String[] args) {
        int win = 5;
        int total = 10;
        // static 메서드 사용
        // 오직 static 공간에 하나만 생성되어서
        // 사용할 때 생성없이 자원을 사용할 수 있다.
        int res = ExamGame.winn(win, total);
        System.out.println("승률:"+res+" %");
    }

}
