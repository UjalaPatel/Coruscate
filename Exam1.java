/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import sun.security.util.ArrayUtil;

/**
 *
 * @author ASUS
 */
public class Exam1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Players: ");
        int players = sc.nextInt();
        System.out.println("Enter No of Coins:");
        int coins = sc.nextInt();
        int noOfCoins = players * coins;
        
        if ((coins * players) == 0) {
            System.out.println("not allowed..");
        } else {
            int player1[] = new int[coins];
            int player2[] = new int[coins];
            System.out.println("Enter coin Value:");
            int coinsQueue[] = new int[noOfCoins];
            for (int i = 0; i < noOfCoins; i++) {
                coinsQueue[i] = sc.nextInt();
//                coinsQueue.add(value);
            }
            System.out.println("queue=" + Arrays.toString(coinsQueue));

//            int temp = coinsQueue.size();
//            for(int i=temp-1;i>=0;i--)
//            {
//                int t=noOfCoins-coinsQueue.size();
//                System.out.println("t="+t);
//                if(coinsQueue.get(t)>coinsQueue.get(noOfCoins-1))
//                {                    
//                    player1.add(coinsQueue.get(0));
//                    coinsQueue.remove(coinsQueue.get(0));
//                    System.out.println("Remove first");
//                    System.out.println("t="+t);
//                    t++;
//                    continue;
////                    break;
//                }
//                else
//                {
//                    
//                    player1.add(coinsQueue.get(noOfCoins-1));
//                    coinsQueue.remove(coinsQueue.get(noOfCoins-1));
//                    System.out.println("Remove last");
//                    System.out.println("t="+t);
//                    t++;
//                    continue;
////                    break;
//                }
//            }
            int temp = coinsQueue.length;
            int p1=0,p2=0;
            int i = noOfCoins;
            while (i>0) {
                int flag1 = 0, flag2 = 0;
                
                int anotherArray[] = new int[noOfCoins * 2];
                if (i > 0) {
                    if (i % 2 == 0) {
                        if (coinsQueue[0] > coinsQueue[coinsQueue.length - 1]) {
                            player2[flag2] = coinsQueue[0];
                            p2=p2+coinsQueue[0];
                            for (int k = 0; k < coinsQueue.length-1; k++) {
                                coinsQueue[k] = coinsQueue[k+1];
                                
                            }
                            //System.out.println("queue=" + Arrays.toString(coinsQueue));
                            flag2++;
                            System.out.println("Player 2 Remove first first : "+Arrays.toString(coinsQueue));
                            i--;
                        } else {
                            player2[flag2] = coinsQueue[coinsQueue.length - 1];
                            p2=p2+coinsQueue[coinsQueue.length-1];
                            for (int k = coinsQueue[coinsQueue.length-1]; k < coinsQueue.length-1; k++) {
                                coinsQueue[k] = coinsQueue[k+1];
                            }
                            flag2++;
                            System.out.println("Player 2 Remove last coin : "+p2);
                            i--;
                            continue;
                        }
                    } else {
                        if (coinsQueue[0] > coinsQueue[coinsQueue.length - 1]) {
                            player1[flag1] = coinsQueue[0];
                            p1=p1+coinsQueue[0];
                            for (int k = 0; k < coinsQueue.length-1; k++) {
                                coinsQueue[k] = coinsQueue[k+1];
                            }
                            flag1++;
                            System.out.println("Player 1 remove first coin :"+p1);
                            i--;
                        } else {
                            player1[flag1] = coinsQueue[coinsQueue.length - 1];
                            p1=p1+coinsQueue[coinsQueue.length-1];
                            for (int k = coinsQueue[coinsQueue.length-1]; k < coinsQueue.length-1; k++) {
                                coinsQueue[k] = coinsQueue[k+1];
                            }
                            flag1++;
                            System.out.println("Player 1 remove last coin :"+p1);
                            i--;
//                            continue;
                        }
//                        continue;
                    }

                } else if (i == 0) {
                    break;
                } else {
                    break;
                }
            }
            System.out.println("player1=" + p1);
            System.out.println("player2=" + p2);
        }

    }

}
