package lzwSkill;
/*1、导入模块
import javax.swing.JOptionPane;
2、输入对话框：
String num=JOptionPane.showInputDialog("请输入a值：");
3、输出对话框
JOptionPane.showMessageDialog(null, "a<b");
4、注意输入的为字符串，需要转换成int型
int a=Integer.parseInt(num);*/

import javax.swing.JOptionPane;

public class ShuRu {
	public static void main(String[] args) {
		//不带缺省值
				String num=JOptionPane.showInputDialog("请输入a值：");
				
				//带缺省值
				String num2=JOptionPane.showInputDialog("请输入b值：");
				try{
				int a=Integer.parseInt(num);
				int b=Integer.parseInt(num2);
				if(a > b){
					//System.out.print("a大于b");
					JOptionPane.showMessageDialog(null, "a>b");
				}
				else if(a==b){
					//System.out.print("a等于b");
					JOptionPane.showMessageDialog(null, "a=b");
				}
				else
					//System.out.print("a小于b");
					JOptionPane.showMessageDialog(null, "a<b");
				}catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, "字符非法","提示标题",JOptionPane.DEFAULT_OPTION);
				}		
	}

}
