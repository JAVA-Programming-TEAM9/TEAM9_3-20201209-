import javax.swing.*;
import java.awt.event.*;
/**
 * 이름,학과,주소,학년을 저장시켜주는 panel 겸용 listener 클래스
 * 
 * @author (2019315020 오성빈, 2018210032 김태영) 
 * @version (2020.12.09)
 */
public class MyPanel extends JPanel implements MouseListener
{
    JTextField tfName;
    JTextField tfDept;
    JTextField tfAddress;
    JButton add = new JButton("추가");
    JButton clear = new JButton("Clear");
    JTextArea ta = new JTextArea(10,20);
    String[] grade = {"1학년", "2학년", "3학년", "4학년"};
    JComboBox<String> gradeCombo = new JComboBox<String>(grade);

    /**
     * MyPanel 클래스의 객체 생성자
     */
    public MyPanel()
    {
        this.add(new JLabel("이름 "));
        tfName = new JTextField(25);
        this.add(tfName);
        this.add(new JLabel("학과 "));
        tfDept = new JTextField("글로벌소프트웨어학과", 25);
        this.add(tfDept);
        this.add(new JLabel("주소 "));
        tfAddress = new JTextField("아산시...",25);
        this.add(tfAddress);
        this.add(new JLabel("학년"));
        this.add(gradeCombo);
        this.add(add);
        this.add(clear);
        this.add(new JScrollPane(ta));

        add.addMouseListener(this);
        clear.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e){
        JButton b = (JButton)e.getSource();
        if(b.getText().equals("추가"))
        {
            ta.append("이름 : " + tfName.getText() + "\n" + "학과 : " + tfDept.getText() + "\n" + "학년 : " + gradeCombo.getSelectedItem().toString() + "\n" + "주소 : " + tfAddress.getText() + "\n" + "-------------------------------" + "\n");
        }
        else if(b.getText().equals("Clear"))
        {
            ta.setText("");
        }

    }

    public void mouseEntered(MouseEvent e){}
    
    public void mouseExited(MouseEvent e){}
    
    public void mousePressed(MouseEvent e){}
    
    public void mouseReleased(MouseEvent e){}
}