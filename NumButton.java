import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

/**数字ボタンクラス*/
public class NumButton extends JButton implements MouseListener{

    /**割り当てられた数字*/
    private int digit;

    /**表示する数*/
    private DisplayedNumber dispNumber;

    /**コンストラクタ*/
    public NumButton(int digit, DisplayedNumber dispNumber){
		super(Integer.toString(digit));
		addMouseListener(this);
		this.digit = digit;
		this.dispNumber = dispNumber;
    }

	public void mouseClicked(MouseEvent e){

		dispNumber.addSingleDigit(digit);

	}

    /**（数字ボタンが）押された*/
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    
}
