package ex4;

import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author kosta Document : Gui2 Created on : ±èÇöÃ¶ 2014. 9. 18, ¿ÀÀü 11:18:12
 */
public class Gui1 extends JFrame implements ActionListener {

    private JPanel pp1;
    private JButton btn4;
    private Gui2 g2;

    public JPanel getPp1() {
        return pp1;
    }

    public Gui1() {
        g2 = new Gui2(this);
        pp1 = new JPanel();

        pp1.add(btn4 = new JButton("view"));

        btn4.addActionListener(this);
        add(pp1);
        setBounds(100, 100, 300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Gui1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str1 = btn4.getText();
        String str2 = "Close";
        if (str1 != str2) {
            btn4.setText(str2);
            g2.setVisible(true);
        } else {
            g2.setVisible(false);
        }

    }

}
