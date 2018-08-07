package java_programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Rev_String();
//Rev_Str_Fn();
//	fact();
//Print_Stars();
//sort_arr();
		//print_Star1();
		//print_arr();
		
	dup_character();
	}

	
	public static void Rev_String(){
		
	String	x="ASHU";
		int len=x.length();
		
		System.out.println(len);
		
	/*	for(int i=0; i<len; i++){
		System.out.print(x.charAt(i));
		}*/
		
		for(int i=len-1; i>=0; i--){
			
		System.out.print(x.charAt(i));
		}
			System.out.println("");	
	}

	
	//Reverse string using functions
public static void Rev_Str_Fn(){
	
	String x="ashu TATA";
	
	StringBuilder stb=new StringBuilder();
	stb.append(x);
	stb.reverse();
	System.out.println(stb);
}

public static void fact(){
	
	int x=4;
	int y=1;
	
	for(int i=1;i<=x;i++){
		
		y=y*i;
	}
	
	System.out.println(y);
	
}

public static void Print_Stars(){
	 int i;
	 int j;
	
	
for(i=0;i<5;i++)
	{
		
		for(j=0;j<=i;j++){
		System.out.print(" * ");
		}
		System.out.println("");
	}
	
}

public static void sort_arr(){
int[]	arr={10,20,30,10};
Arrays.sort(arr);

for(int val:arr){
Arrays.asList(val);
	
	System.out.println(val);	
}
	}


public static void print_Star1(){
	
	for(int row=0; row<5; row++){
		
		for(int col=5; col>row; col--){

			System.out.print("");
		}
		
		for(int k=0; k<=row; k++){
			
			System.out.print(" *");
			}
		
		System.out.println("");
		}
}

public static void print_arr(){
	
	int[] aint={10,30,20,10,40};

	
	for(int i=0; i<aint.length; i++)
	{
		
	//	System.out.print(aint[i]);
		
		for(int j=0; j<aint.length; j++){
			
			if(aint[i]<aint[j]){
				
		         int  tempVar = aint [j ];
		          aint [j ]= aint [i];

		          aint [i] = tempVar;


			}
		}
	}
	
	
	String numbersString = Arrays.toString(aint);

	System.out.println(numbersString);
	
}

public static void dup_character(){
    String str = "ashutosh";
    Map<Character, Integer> charMap = new HashMap<Character, Integer>();
    char[] arr = str.toCharArray();

    for (char value: arr) {

       if (Character.isAlphabetic(value)) {
           if (charMap.containsKey(value)) {
               charMap.put(value, charMap.get(value) + 1);

           } else {
               charMap.put(value, 1);
           }
       }
    }

    System.out.println(charMap);

	
}

public static void dup_for(){
String ip="aaaa"; 
int count=0; 
char [] input = ip.toCharArray(); 
//System.out.println("Duplicate Characters are as follows:"); 
for(int i=0;i<ip.length();i++) 
{ 
for(int j=i+1;j<ip.length();j++) 
{ 
if(input[i]==input[j]) 
{ 
System.out.println(input[j]); 
count ++; 
break; 
} 
} 
} 


} 

} 


