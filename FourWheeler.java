//Created by Pooja
//on 4 oct 2019
//Program shows implementation of throws keyword to declare an exception in java.

import java.lang.*;
import java.util.*;
import java.io.*;
class Apple
{
	public static void main(String args[]) throws IOException
	{
		double avg;
		float sum=0;
		float sales[]=new float[7];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=1;i<=7;i++)
		{
			System.out.println ("Enter sales for day"+i+" of week =");
			sales[i-1] = Float.parseFloat(br.readLine());
			sum=sum+sales[i-1];
		}
		System.out.println ("Sum = "+sum);
		avg=sum/7;
		System.out.println ("Average sale of week="+avg);
	}
