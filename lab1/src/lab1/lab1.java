package lab1;
import java.util.*;
public class lab1 {

	public static void main(String[] args) {
	    int x[]={1,2,3,4,8,3};
	  int max1=0;
	  int max2=0;
	    for (int i = 0; i < x.length; i++) {
	    	if(max1< x[i]){
	    		max2=max1;
	    		max1=x[i];
	    	}
	    	else if(max2<x[i]) {
	    		max2=x[i];
				
			}
	    }
			System.out.println(max1);
			System.out.println(max2);

	}	}