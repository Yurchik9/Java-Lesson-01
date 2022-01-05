package ua.lviv.lgs;

public class Application{
public static void main(String[] args) {
	
	byte a = 1;
	short b = 6;
	int c = 33;
	long d = 7865;
	float e = 27.8f;
	double f = 39.7;
	char g = 2255;
	boolean h = true;
	String j = "yup";
	
	
	System.out.println(Byte.MAX_VALUE);System.out.println(Byte.MIN_VALUE);
	System.out.println(Short.MAX_VALUE);System.out.println(Byte.MIN_VALUE);
	System.out.println(Integer.MAX_VALUE);System.out.println(Byte.MIN_VALUE);
	System.out.println(Long.MAX_VALUE);System.out.println(Byte.MIN_VALUE);
	System.out.println(Float.MAX_VALUE);System.out.println(Byte.MIN_VALUE);
	System.out.println(Double.MAX_VALUE);System.out.println(Byte.MIN_VALUE);
	System.out.println(Character.MAX_VALUE);System.out.println(Character.MIN_VALUE);
	
	
	int [] arr = {1,5,9,0,7,-2,53,-67,22,54};
	int max, min;
	max=min=arr[0];
	for(int i=1; i<10;i++) {
	if (arr[i]<min) {
		min=arr[i];
		}
	if (arr[i]>max) {
		max=arr[i];
		}
	}
	System.out.println("min = "+min);
	System.out.println("max = "+max);
	
	
	
	
	
	
	
}
}