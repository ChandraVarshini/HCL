
	public class Sort {    
	    public static void main(String[] args) {        
	        int [] arr = new int [] {39,12,9,6,43,75};     
	        int temp = 0;    
	        System.out.println("array: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }      
	        for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }    
	         System.out.println();       
	        System.out.println("sorted array");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }    
	    }    
	}    

