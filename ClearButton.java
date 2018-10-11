import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

/**Cボタンクラス*/
public class ClearButton extends JButton implements MouseListener{
    /**表示する数*/
    private DisplayedNumber dispNumber;
    /**演算器*/
    private ArithmeticUnit arithmUnit;
    /**コンストラクタ*/
	private JLabel opLabel;
    public ClearButton(DisplayedNumber dispNumber, ArithmeticUnit arithmUnit/*,JLabel opLabel*/) {
		super("C");
		this.dispNumber=dispNumber;
       	this.arithmUnit=arithmUnit;
	//this.opLabel=opLabel;
		addMouseListener(this);
    }

    /**(Cボタン)が押された*/
    public void mouseClicked(MouseEvent e){
		dispNumber.clear();
		arithmUnit.clear();
		//opLabel.setText("");
}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
}
