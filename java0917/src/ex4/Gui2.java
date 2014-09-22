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
 * @author kosta Document : Gui2 Created on : ±èÇöÃ¶ 2014. 9. 18, ¿ÀÈÄ 5:33:05
 */
public class Gui2 extends JFrame implements ActionListener {

    private JPanel p1,p2;
    private JButton btn1, btn2, btn3;
    private Gui1 g1;
    public Gui2(Gui1 g1) {
        p1 = new JPanel();
        this.g1 = g1;
        p1.add(btn1 = new JButton("Red"));
        p1.add(btn2 = new JButton("Green"));
        p1.add(btn3 = new JButton("Blue"));
        
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
       

        btn1.setBackground(Color.red);
        btn2.setBackground(Color.green);
        btn3.setBackground(Color.blue);

        add(p1, "North");
        setBounds(450, 100, 300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         JButton vv = (JButton) e.getSource();
         Color col = vv.getBackground();
         g1.getPp1().setBackground(col);
        
    }
}


//    @Override
//    public void actionPerformed(ActionEvent e) {
//        Object v = e.getSource();
//        JButton vv = (JButton) e.getSource();
//
//        p2.setBackground(vv.getBackground());

    