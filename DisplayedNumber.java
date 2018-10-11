import javax.swing.*;
/**
関数電卓内プログラムにおいて、計算過程を保持してディスプレイに表示する。
入力終了時に終了フラグを立てる。
@author Shibuki Yamasaki
*/
public class DisplayedNumber extends JLabel{
/*計算過程の保持*/
    private long num;
/*終了フラグ*/
    private boolean finishedFlag = true;
/*コンストラクタ*/
    public DisplayedNumber(){
	this.num = 0;
	this.setText(Long.toString(this.num));
    }
/*(表示する数)1桁加える*/
    public void addSingleDigit(int d){
	if(this.finishedFlag == true){
	    this.num = 0;
	    this.finishedFlag = false;
	}
	String s = String.valueOf(this.num);
	if(num == 0){
	    this.num = d;
	}else{
        if(s.length() <= 9){
	        this.num = this.num * 10;
	        this.num += d;
         }
	}
	s = String.valueOf(this.num);
	if(s.length() <= 10){
	this.setText(s);
	}
	if((this.num >= 2147483647) || (this.num <= -2147483648)){
        s = "error";
	this.setText(s);
	}
    }
/*(表示する数)を0にする*/
    public void clear(){
	this.num = 0;
	String s = String.valueOf(this.num);
	this.setText(s);
    }
/*(表示する数)値を代入する*/
    public void setValue(long num){
	this.num = num;
	String s = String.valueOf(this.num);
	this.setText(s);
    }
/*(表示する数)値を読み出す*/
    public long getValue(){
	num = this.num;
	return num;
    }
/*(表示する数)の入力完了フラグを立てる*/
    public void finished(){ 
	this.finishedFlag = true;
    }
/*フラグを読み出す*/
    public boolean getFlag(){
	boolean flag = this.finishedFlag;
	return flag;
    }
}
