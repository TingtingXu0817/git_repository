import java.util.Scanner;

public class Pro01 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String inputNum=null;
		System.out.println("Please enter an integer number:");
		//读取输入的数字
		inputNum=input.nextLine();
		input.close();
        System.out.println("The entered integer number is:"+inputNum);
        try {
        	//强制转换为int类型，判断输入的是否为整型数字
        	int oldNumber=Integer.parseInt(inputNum);
        	
        	//强制你转换成功，进行数字翻转操作
        	int newNumber=0;
        	int numLength=inputNum.length();  
        	if(oldNumber<0) {
        		//当输入为负数时，-符号会多出一位字符长度
        		numLength=numLength-1;
        	}   	
        	for(int i=0;i<numLength;i++) {
        		//从最低位开始把每位数字转换到新数字的对应位上
        		newNumber+= (int)(oldNumber/Math.pow(10,i)%10)*Math.pow(10,numLength-i-1);        		
        	}
        		
        	System.out.println("The converted integer number is:"+newNumber);
        	
        }catch(NumberFormatException e){     
        	//输入不是int类型数字或转换后的数字不是int类型数字时，输出错误信息
        	System.out.println("The input cannot be converted to an integer number.");
        }
        
    }
}
