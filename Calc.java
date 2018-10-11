import javax.swing.*;
import java.awt.*;

/** 電卓クラス*/

public class Calc extends JFrame{
    /** 数字ボタン(0~9) */
    private NumButton[] numButton;

    /** 演算記号ボタン(+-*／)*/
    private OpButton[] opButton;

    /** =ボタン*/
    private EqualButton equalButton;

    /** Cボタン*/
    private ClearButton clearButton;

    /** 表示する数*/
    private DisplayedNumber dispNumber;

    /** 演算器*/
    private ArithmeticUnit arithmUnit;
    

    /** メイン関数*/
    public static void main(String[] args){
	Calc calc = new Calc();
	calc.setVisible(true);
    }


    /** コンストラクタ*/
    public Calc(){
	initFields();
	initGUI();
    }

    /** 電卓の属性を初期化する*/
    private void initFields(){
	dispNumber = new DisplayedNumber();
	arithmUnit = new ArithmeticUnit(dispNumber);

	numButton = new NumButton[10];

	for(int i = 0; i<10; i++)
	    numButton[i] = new NumButton(i, dispNumber);

	opButton = new OpButton[4];

	opButton[0] = new OpButton("+", arithmUnit);
	opButton[1] = new OpButton("-", arithmUnit);
	opButton[2] = new OpButton("×", arithmUnit);
	opButton[3] = new OpButton("÷", arithmUnit);

	equalButton = new EqualButton(arithmUnit);

	clearButton = new ClearButton(dispNumber, arithmUnit);

    }

    /** 電卓の表示を初期化する*/
    private void initGUI(){
	setSize(300, 250);
	setLocation(100, 100);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
	c.fill = GridBagConstraints.BOTH;
	c.weightx = c.weighty = 1;
	c.gridx = GridBagConstraints.RELATIVE;
	
	/** 0行目*/
	c.gridy = 0;
	add(arithmUnit, c);//演算記号
	arithmUnit.setHorizontalAlignment(SwingConstants.CENTER);	
	c.gridwidth = 4;
	add(dispNumber, c);//表示する数
	dispNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		
	/**1行目*/
	c.gridwidth = 1;
	c.gridy = 1;
	add(numButton[7], c);//7
	add(numButton[8], c);//8
	add(numButton[9], c);//9
	c.gridwidth = 2;
	add(clearButton, c);//C

	/**2行目*/
	c.gridwidth = 1;
	c.gridy = 2;
	add(numButton[4], c);//4
	add(numButton[5], c);//5
	add(numButton[6], c);//6
	add(opButton[2], c);//×
	add(opButton[3], c);//÷

	/**3行目*/
	c.gridwidth = 1;
	c.gridy = 3;
	add(numButton[1], c);//1
	add(numButton[2], c);//2
	add(numButton[3], c);//3
	c.gridheight = 2;
	add(opButton[0], c);//+
	c.gridheight = 1;
	add(opButton[1], c);//-
	
	/**4行目*/
	c.gridy = 4;
	add(equalButton, c);//=
	c.gridwidth = 2;
	c.gridx = 0;
	add(numButton[0], c);//0


    }
}
    
