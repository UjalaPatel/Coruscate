/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Exam2 {

    public static int getseatinfo(int n)
    {
           int ch;
           ch = n % 12;
           switch(ch)
           {
                   case 0: n-=11;
                                   System.out.println( n + "WS");
                                   break;

                   case 1: n+=11;
                                   System.out.println( n + "WS");
                                   break;

                   case 2: n+=9;
                                   System.out.println( n + "MS");
                                   break;	

                   case 3: n+=7;
                                   System.out.println( n + "AS");
                                   break;

                   case 4: n+=5;
                                   System.out.println( n + "AS");
                                   break;

                   case 5: n+=3;
                                   System.out.println( n + "MS");
                                   break;

                   case 6: n+=1;
                                   System.out.println( n + "WS");
                                   break;

                   case 7: n-=1;
                                   System.out.println( n + "WS");
                                   break;

                   case 8: n-=3;
                                   System.out.println( n + "MS");
                                   break;

                   case 9: n-=5;
                                   System.out.println( n + "AS");
                                   break;

                   case 10: n-=7;
                                   System.out.println( n + "AS");
                                   break;

                   case 11: n-=9;
                                   System.out.println( n + "MS");
                                   break;
           }
           return 0;
    }

    public static void main(String[] args) {
       int t , n;
	Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of Testcase:");
	t = s.nextInt();
	for(int i=1 ; i<=t ; i++)
	{
		System.out.println("Enter seat number :");
		n = s.nextInt();
		getseatinfo(n);
	}
    }
    
}
