import javax.swing.*;
/**
 * Frame을 설정해주는 클래스
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class TextFieldFrame extends JFrame
{
    /**
     * TextFieldFrame 클래스의 객체 생성자
     */
    public TextFieldFrame()
    {
        this.setTitle("과제#3(2019315020 오성빈, 2018210032 김태영)");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(new MyPanel());
    }
}
