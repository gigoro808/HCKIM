package ex2;

import ex1.Animal;
import ex3.InterFaceTest;
import ex3.MsgBank;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author kosta Document : ContainerExample Created on : 김현철 2014. 9. 15, 오전
 * 10:34:46
 */
//extends JFrame 은 가장 base, Container인 객체이므로 
//상속으로 처리하는것이 바람직하다.
//인터페이스 다중구현 
public class ContainerExample extends JFrame
                                implements InterFaceTest, MsgBank {

    private JPanel p, p2;
    private JButton btn;
    private JLabel lb;

    public ContainerExample() {
        // 패널 생성
        p = new JPanel();
        p2 = new JPanel();
        // 생성해서 사용
        String msg = new Animal().msg("클릭");
        // 재정의 하기 위한 내부익명클래스로 사용
        Animal ani = new Animal() {

            @Override
            public String msg(String msg) {
                return " [하트] " + msg;
            }

        };
        p.add(btn = new JButton(ani.msg("마이버튼")));
        add(p, "North");
        //p2 적용
        p2.add(lb = new JLabel("임시내용"));
        p2.setBackground(Color.PINK);
        add(p2);
        setLocation(100, 100);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new ContainerExample();
    }

    // InterFaceTest 재정의

    @Override
    public int getA() {
        return A;
    }

    @Override
    public int getB() {
        return b;
    }

    //MsgBank 재정의

    @Override
    public String printMsg(String msg) {
        return "My Msg" + msg;
    }
}
