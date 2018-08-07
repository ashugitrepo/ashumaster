package java_programs;

import java.util.Arrays;

public class Program_Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//star1(5);
//star2(5);
	//star3(5);
		//sort_arr2_loop();
		//revSTR_fun();
		//revSTR_loop();
		getDuplicates();
	}

	
	public static void star1(int num){
		
	for(int i=0; i<num; i++){
		
		for(int j=0; j<=i; j++){
			
			System.out.print("*");
	
		}
		
		System.out.println("");
	}
		
		
		
	}
	
	
	public static void star2(int num){
		
		for(int i=0; i<num; i++){
			
			for(int j=num; j>i; j--){
				
				System.out.print("*");
		
			}
			
			System.out.println("");
		}
			
			
			
		}
//failed below code
	public static void star3(int num){
		
		for(int i=0; i<num; i++){
			for(int j=0; j<=i; j++){
				
				System.out.print(" ");
			}
			
			
			for(int k=5; k>i; k--){
				System.out.print("*");
			}
			
			System.out.println("");
		}
			
			
			
		}

	public static void sort_arr1(){
		
		int[] x={40,20,30,50,10,20,30};
		Arrays.sort(x);
		
		for(int arr:x){
			
			System.out.println(arr);			
			
		}
		
			
	}
	
public static void sort_arr2_loop(){
		
		int[] x={40,20,30,50,10,20,30};
		int temp=0;
		int i;
		int j;
		
		int len=x.length;
		
		for(i=0; i<len; i++){
			
			for(j=0; j<len; j++){
				
				if(x[i]<x[j]){
					temp=x[j];
					x[j]=x[i];
					x[i]=temp;
				}
			}						
		}
		System.out.println(Arrays.toString(x));
	}

public static void revSTR_fun(){
	String str="ashu singh";
	
StringBuffer bf=new StringBuffer();
bf.append(str);
bf.reverse();
System.out.println(bf);	
		
}

public static void revSTR_loop(){
	String str="ashu singh";
	char[] ch=str.toCharArray();
		int len=ch.length;
		for(int i=len-1; i>=0; i--){
			System.out.print(ch[i]);
			
		}
			
}
public static void getDuplicates() {
	String input = "ashutosh";

    char chara = 's';

    int count = 0;

    input = input.toLowerCase();

    for (int i = 0; i < input.length(); i++) {

        if (input.charAt(i) == chara ) {
            count++;
        }
    }

    System.out.println(chara+" count is: "+count);

}}