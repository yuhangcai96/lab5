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
public class TestScores {
    static double []score;
	static int len;
	

	public TestScores(double[] score, int len) {
		super();
		this.score = score;
		this.len = len;
	}
	
	static double getAverage()
	{
		int sum=0;
		for(int i=0;i<len;i++)
		{
			sum+=score[i];
		}
		double ave=sum*1.0/len;
		return ave;
	}

	public double[] getScore() {
		return score;
	}


	public void setScore(double[] score) {
		this.score = score;
	}


	public int getLen() {
		return len;
	}


	public void setLen(int len) {
		this.len = len;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of score to test:");
		int n=sc.nextInt();
		double a[]=new double[n];
		System.out.println("Please enter a score:");
		int f=1;
		try
		{
			for(int i=0;i<n;i++)
			{
			
				a[i]=sc.nextDouble();
				if(a[i]<0||a[i]>100)
				{
					f=0;
					throw new Exception("The score can not be negative or greater than 100!");
					
				}
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		if(f==1)
		{
			TestScores ts=new TestScores(a, n);
			System.out.println("Average score:"+ts.getAverage());
		}
		

	}
}
