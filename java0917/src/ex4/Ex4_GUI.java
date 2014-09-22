package ex4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author kosta Document : Ex4_GUI Created on : ����ö 2014. 9. 17, ���� 1:44:27
 */
// 1. Event����
// 2. Event�� ���� �������̽��� ����
// 3. ������ �߻�޼��带 �������ؼ� ���� �����ϰ�
// 4. Event�� ����� ���ü���� ������(addXXListener(this))�� ���·� �ۼ�
// 5. �̿� ���� ����� ����Ŭ������ ���� �����ϴ�.
public class Ex4_GUI extends JFrame implements ActionListener {

    private JPanel p1, p2; // ������Ʈ�̸鼭 �����̳� ��ü
    private JButton btn1, btn2, btn3; // ������Ʈ ��ư ��ü
    private JLabel lb; //text�� �������� ǥ�� ������Ʈ ��ü

    public Ex4_GUI() {
        // JPanel ��ü�� ����
        p1 = new JPanel();
        p2 = new JPanel();
        // p1�� ��ܸ޴�, ��ư�� ����
        p1.add(btn1 = new JButton("Red"));
        p1.add(btn2 = new JButton("Green"));
        p1.add(btn3 = new JButton("Blue"));

        // EventListner�� ���
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        // ��ư�� ���� ����
        btn1.setBackground(Color.pink);
        btn2.setBackground(Color.green);
        btn3.setBackground(Color.blue);
        // JFrame�� ���� - ����(North)
        add(p1, "North");
        // p2�� JLabel����, �̺�Ʈ�� ���� Text�� ���
        p2.add(lb = new JLabel("��"));
        // JFrame�� ���� - �⺻��(Center)
        add(p2);
        //x,y,w,h
        setBounds(450, 100, 300, 100);
        //â����(x)�� ���α׷� ����(jdk 5)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); //â�� Ȱ��ȭ
    }

    public static void main(String[] args) {
        new Ex4_GUI();
       
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object v = e.getSource();
        JButton vv = (JButton) e.getSource();
        Color col = null;
        String msg ="";
        // �ڵ鸵
        if (v == btn1) {
           msg="A����";
        } else if (v == btn2) {
          
        }
        
        p1.setBackground(vv.getBackground());
       
    }
}
