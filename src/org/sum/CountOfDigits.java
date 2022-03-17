package org.sum;

public class CountOfDigits {
public static void main(String[] args) {
	long a=78676543245l;
	int count=0;
	while(a>0)
	{
	count++;
	a=a/10;
	}
	System.out.println(count);
}
}









