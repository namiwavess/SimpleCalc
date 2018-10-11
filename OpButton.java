import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

/**演算記号ボタンクラス*/
public class OpButton extends JButton implements MouseListener{

    /**割り当てられた演算記号*/
    private String opStr;
    /**演算器*/
    private ArithmeticUnit arithmUnit;
    /**コンストラクタ*/
    public OpButton(String opStr, ArithmeticUnit arithmUnit/*, JLabel opLabel*/) {	
		super(opStr);
		this.opStr = opStr;
		this.arithmUnit = arithmUnit;
		//this.opLabel = opLabel;
		addMouseListener(this);
    }


	public void setValue(String opStr){this.opStr = opStr;}


    /**(演算記号ボタン)が押された*/
    public void mouseClicked(MouseEvent e){
		arithmUnit.setOperator(opStr);
		//opLabel.setText(opStr);
	}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
}
