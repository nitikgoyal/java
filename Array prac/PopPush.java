package com.in;
import java.util.*;
public class PopPush 
{
	 public static void main(String args[]) 
	    { 
	        Stack<Integer> S= new Stack<Integer>(); 
	        S.push(1); 
	        S.push(2); 
	        S.push(3); 
	        S.push(4); 
	        System.out.println("Stack after pop peration : " + S); 
	        System.out.println("Popped element : " +  
	                                         S.pop()); 
	        System.out.println("Popped element : " +  
	                                         S.pop()); 
	        System.out.println("Stack after pop peration : "
	                                             + S); 
	    } 
} 
