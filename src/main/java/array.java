import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danny
 */
public class array {
    public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number of digits in the array: ");
		int len=sc.nextInt();
		int a[]=new int [len];
		System.out.println("Enter a array: ");
		for(int i=0;i<len;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Please enter N: ");
		int n=sc.nextInt();
		
		max(a,n);
		

	}
	public static void max(int a[],int n){
		System.out.println("All numbers greater than N are: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>n)
			{
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		
	}
}
