package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	List<Friend> lst=new ArrayList<>();
    	for(int i=0;i<3;i++) {
	    	String input=sc.nextLine();
	    	String name=input.substring(0,input.indexOf(" "));
	    	input=input.substring(input.indexOf(" ")+1);
	    	
	    	String hp=input.substring(0,input.indexOf(" "));
	    	input=input.substring(input.indexOf(" ")+1);
	    	
	    	String school=input;
	    	
	    	Friend friend=new Friend(name,hp,school);
	    	lst.add(friend);
    	}
    	
    	Iterator<Friend> it = lst.iterator();
		
		while(it.hasNext()) {   
			Friend item = it.next(); 
			System.out.println(item.toString());
		}
		sc.close();
    }

}
