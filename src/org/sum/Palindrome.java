package org.sum;

public class Palindrome {
	public static void main(String[] args) {
		
int a=131;
int reverse=0;
int temp=a;
while(a>0) {
	int Rem = a%10;
	reverse=reverse*10+Rem;
	a=a/10;
}
if(reverse==temp) {
	System.out.println(temp+" is Palindrome Number");
}
else
{
	System.out.println("Not a Palindrome Number");
}


	}}
