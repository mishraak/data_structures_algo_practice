package com.akshay.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TasksScheduler {

	public static void main(String[] args) {
		System.out.println(leastInterval(new char[] {'A','A','A','B','B','B'},2));
	}
	
	public static int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> map = new HashMap();        
        int count=0; 
        for(char c : tasks){
            if(map.containsKey(c)) map.put(c, map.get(c)+1);
            else map.put(c,1);                        
        }
        
        if(map.size()>n){
            count= tasks.length;            
        }
        else {
            int t=0, dc=0;;              
            Object[] arr = map.keySet().toArray();
            while(t<tasks.length){                
                 for(int i=0;i<map.size(); i++){
                	 	char m = arr[i].toString().charAt(0);
                     if(map.get(m) > 0) count+=1;
                     map.put(m, map.get(m)-1);
                     t+=1;
                     dc+=1;
                 }
                if(dc<map.size())
                		count+=map.size()-dc;
                dc=0;
                if((tasks.length-t)<map.size()){
                    count+=(tasks.length-t);
                    break;
                }
            }                
        }
        return count;                            
    }

}
