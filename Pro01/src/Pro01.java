import java.util.Scanner;

public class Pro01 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String inputNum=null;
		System.out.println("Please enter an integer number:");
		//��ȡ���������
		inputNum=input.nextLine();
		input.close();
        System.out.println("The entered integer number is:"+inputNum);
        try {
        	//ǿ��ת��Ϊint���ͣ��ж�������Ƿ�Ϊ��������
        	int oldNumber=Integer.parseInt(inputNum);
        	
        	//ǿ����ת���ɹ����������ַ�ת����
        	int newNumber=0;
        	int numLength=inputNum.length();  
        	if(oldNumber<0) {
        		//������Ϊ����ʱ��-���Ż���һλ�ַ�����
        		numLength=numLength-1;
        	}   	
        	for(int i=0;i<numLength;i++) {
        		//�����λ��ʼ��ÿλ����ת���������ֵĶ�Ӧλ��
        		newNumber+= (int)(oldNumber/Math.pow(10,i)%10)*Math.pow(10,numLength-i-1);        		
        	}
        		
        	System.out.println("The converted integer number is:"+newNumber);
        	
        }catch(NumberFormatException e){     
        	//���벻��int�������ֻ�ת��������ֲ���int��������ʱ�����������Ϣ
        	System.out.println("The input cannot be converted to an integer number.");
        }
        
    }
}
