import java.io.*;

import java.util.*;


class Meeting{
    
    int start;
    int end;
    int pos;
    
    Meeting(int start , int end , int pos){

        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}
class GFG {
	public static void main (String[] args) {
	
	ArrayList<Meeting> list = new ArrayList<>();
	
	int start[] = {1,3,0,5,8,5};
	int end[] =  {2,4,5,7,9,9};
	
	int n =6;
	
	for(int i=0 ; i<n ; i++){
	    
	    list.add(new Meeting(start[i] , end[i] , i+1));
	}
	
	for(Meeting obj : list){
	    
	    System.out.println(obj.start);
	    System.out.println(obj.end);
	    System.out.println(obj.pos);
	}
	
	
	
	
	}
}
