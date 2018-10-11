import javax.swing.*;

/** 演算器、演算器号の表示部も含む。２つの数に対して４種類の演算をする。
 * 演算結果は「表示する数」オブジェクトに渡して、表示する。*/

public class ArithmeticUnit extends JLabel{

    /** +演算子(足し算記号) operatorが取りうる値 */
    public static String OP_PLUS = "+";
    /** -演算子(引き算記号) operatorが取りうる値 */
    public static String OP_MINUS = "-";
    /** *演算子(掛け算記号) operatorが取りうる値 */
    public static String OP_TIMES = "×";
    /** /演算子(割り算記号) operatorが取りうる値 */
    public static String OP_DIVIDE = "÷";
    /** 演算子が未設定であることを示す。 operatorが取りうる値。 */
    public static String OP_NONE = "";
    /** ボタンを表示する演算子を列挙した数列 */
    public static String OPERATORS[] = {OP_PLUS, OP_MINUS, OP_TIMES, OP_DIVIDE};

    /** 一つ目の数の値 */
    private long firstOperand;
    /** 演算子 */
    private String operator;
    /** 表示する数 */
    private DisplayedNumber dispNumber;

    /** コンストラクタ */
    public ArithmeticUnit(DisplayedNumber dispNumber){
	this.dispNumber = dispNumber;
	firstOperand = dispNumber.getValue();
	
	
    }

    /** 演算器が演算する */
    public void operate(){
	long result = 0;
	if(operator !=""){
	    if(operator == "+"){
		result = firstOperand + dispNumber.getValue();
}
	else if(operator == "-"){
		result = firstOperand - dispNumber.getValue();
}
	else if(operator == "×"){
		result = firstOperand * dispNumber.getValue();
}
	else if(operator == "÷"){
		result = firstOperand / dispNumber.getValue();
}
	if(Long.toString(result).length() < 12){
		dispNumber.setValue(result);
		firstOperand = result;
}
	else{
		dispNumber.setText("Error: Over/Under flow");
    }
	this.dispNumber.finished();
	this.operator = "";
}
}
    
    /** 演算器に演算子を設定する */
    public void setOperator(String operator){
	if (operator !="" && dispNumber.getFlag() == false){
	    operate();
    }
	this.dispNumber.finished();
	this.operator = operator;
	firstOperand = dispNumber.getValue();
    }
	

    /** 演算器の演算子を未設定にする */
    public void clear(){
	firstOperand = 0;
	operator = "";
	
    }

}
