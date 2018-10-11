import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

/**=ボタンクラス*/
public class EqualButton extends JButton
implements MouseListener{

	/** 演算器*/
    private ArithmeticUnit arithmUnit;
	private JLabel opLabel;
	/**コンストラクタ*/
    public EqualButton(ArithmeticUnit arithmUnit/*,JLabel opLabel*/) {
	super("=");
	this.arithmUnit=arithmUnit;
	    //this.opLabel=opLabel
	addMouseListener(this);
    }

    /**（=ボタンが）押された*/
    public void mouseClicked(MouseEvent e){
		arithmUnit.operate();
		arithmUnit.setOperator("");
		//opLabel.setText("");
}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
}
