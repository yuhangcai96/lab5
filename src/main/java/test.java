/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danny
 */
public class test {
    public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};//Group initialization
		int sum=getTotal(a);
		double ave=getAverage(a);
		int max=getHighest(a);
		int min=getLowest(a);
		

		System.out.println("Total:"+sum);
		System.out.println("Average:"+ave);
		System.out.println("Highest:"+max);
		System.out.println("Lowest:"+min);
	}

	
	static int getTotal(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
		
	}
	
	
	static double getAverage(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		double ave=sum*1.0/a.length;
		return ave;
	}
	
	static int  getHighest(int a[])
	{
		int m=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(m<a[i]){
				m=a[i];
			}
		}

		
		return m;
	}
	
	
	static int  getLowest(int a[])
	{
		int m=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(m>a[i]){
				m=a[i];
			}
		}

		return m;
	}
}
