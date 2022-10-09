package basics;

import java.util.ArrayList;
import java.util.List;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="1+2+3+4+5-15+1*12/6+22";
		
		int n1=0;
		int n2=0;
		Character oper=null;
		Character operator=null;
		int sum=0;

		
		int n=str.length();
		
		
		
		
		int j=0;
		while(j<=n) {
			
			Character a=str.charAt(j);
			
			if(Character.isDigit(a)) {
				int digit= Character.getNumericValue(a);
				n1=(n1*10)+digit;
			
			}
			else if(a.equals('+')||a.equals('-')||a.equals('*')||a.equals('/')){
				
				oper=a;
				j++;
				break;
			}
			j++;
			
		}
	//	System.out.println("n1...."+n1+"      j="+j);
		
		
			while(j<n) {
				while(j<n) {
			
					Character a=str.charAt(j);
					if(a.equals('+')||a.equals('-')||a.equals('*')||a.equals('/')){
		     			System.out.println("operator");
						operator=a;
						j++;
						break;
					}
			
					else if(Character.isDigit(a)) {
						int digit= Character.getNumericValue(a);
						n2=(n2*10)+digit;
		//			System.out.println("n2..."+n2);
			
					}
					
					j++;

				}
				System.out.println("  "+n1+" "+operator+" "+n2);
				//execution
				if(oper.equals('+')) {
					sum=n1+n2;
				}
				
				else if(oper.equals('-')) {
					sum=n1-n2;
				}
				
				else if(oper.equals('*')) {
					sum=n1*n2;
				}
				
				else if(oper.equals('/')) {
					sum=n1/n2;
				}
				
				
				n1=sum;
				n2=0;
				oper=operator;
				System.out.println(sum);
			}
		}
	}
