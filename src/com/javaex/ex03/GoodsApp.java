package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	List<Goods> lst=new ArrayList<>();
    	String input;
    	Scanner sc=new Scanner(System.in);
    	int sum=0;
    	while(true) {
	    	input=sc.nextLine();
	    	if(input.equals("q")) {
    			break;
    		}
	    	String name=input.substring(0,input.indexOf(","));
	    	input=input.substring(input.indexOf(",")+1);
	    	
	    	int price=Integer.parseInt(input.substring(0,input.indexOf(",")));
	    	input=input.substring(input.indexOf(",")+1);
	    	
	    	int count=Integer.parseInt(input);
	    	sum+=count;
	    	Goods good=new Goods(name,price,count);
	    	lst.add(good);
    	}
    	Iterator<Goods> it = lst.iterator();
		
		while(it.hasNext()) {   
			Goods item = it.next(); 
			System.out.println(item.toString());
		}
		System.out.printf("모든 상품의 갯수는 %d 개 입니다 %n",sum);
    	sc.close();
       
    }

}
