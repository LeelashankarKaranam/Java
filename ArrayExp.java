package shankar1;

public class ArrayExp {
	public static void main(String[] args) {
	     /* int [] test = {1,2,3,4,5,6,7,8,9};
			
			  System.out.println(test.length);
			  System.out.println(test[2]);
			 
	        
	        for(int i:test)
	        
			System.out.print(i);
	        System.out.println("-->original numbers");
	        
	        for(int i=5;i<test.length;i++)
	        	System.out.print(test[i]);
	        
	        for(int i=0;i<=4;i++)
	        	System.out.print(test[i]);
	        System.out.println("-->Required output");
	        }
		*/   // Declare and initialize an array
        int[] numbers = new int[1000];
        
		
		 // for (int i = 0; i < 1000; i++) { numbers[i] = i + 1; }
		 
		 
       int index=numbers.length/2;
        // Print the modified array
        System.out.println("Modified array:"+index);
        for (int i = index; i <=numbers.length; i++)  
           // System.out.print(numbers[(i + 500) % numbers.length] + " ");
        	System.out.print(i+",");
        	
        	for(int i=1;i<index;i++)
        		System.out.print(i+",");
        }
    }


