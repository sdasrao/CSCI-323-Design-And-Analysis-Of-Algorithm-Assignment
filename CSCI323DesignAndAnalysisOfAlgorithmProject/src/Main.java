
import java.util.Random;
import java.util.*;
public class Main {
	

	public static void main(String[] args){
		
		 int min = 1;
		 int max = 1000000;
		 
	 // Variables for the counting all clocktime together for each array size and each sorting algo ( to average  later)
		    long ms16 = 0;
			long is16 = 0;
			long qs16 = 0;
			
			long ms32= 0;
			long is32 = 0;
			long qs32= 0;
			
			long ms64= 0;
			long is64 = 0;
			long qs64= 0;
			
			long ms128= 0;
			long is128 = 0;
			long qs128= 0;
			
			long ms256= 0;
			long is256 = 0;
			long qs256= 0;
		
		
		/* 
1.generate an array of 10,000 random integers, with values between 1 and 1,000,000.
2. Sortthe array using:
     InsertionSort
     MergeSort
     QuickSort (basic version of Partition)
3. RUN the sorting algorithms a total of 100 times each, and display the average clock time used by each of the algorithms. 
*/
	
		 
   {

	   {
		
		   for(int j = 0; j <100; j++ ) { // running the each algo for 100 times for size 16
		   	

		   	  MergeSort ms1 = new MergeSort();	// instance of nerge sort
		   	  InsertionSort is1 = new InsertionSort(); //instance of insertion sort
		   	  QuickSort qs1  = new QuickSort(); //instance of quick sort
		   	
		   		 
		   		 //System.out.println("Input the array size: ");
		   		//Scanner sc = new Scanner(System.in); 
		   		
		   		//int length = sc.nextInt();
		   		
		   		 int arr1[]= new int[16]; // generating an array of size 16
		   		
		   		 Random rand = new Random(); // generating random array for each time
		   		 
		    // for(int j = 0; j <5; j++ ) {
		   		
		   		for (int i = 0; i<arr1.length; i++) 
		   		{
		   	    arr1[i] = rand.nextInt(max-min) + min ;
		   	   
		   		
		   	    }
		   		
		   		int[]arr1a = Arrays.copyOf(arr1,arr1.length); // copying the original unsorted array as 1b for sorting using insertion 
		   		int[]arr1b = Arrays.copyOf(arr1,arr1.length); // copying the original unsorted array as 1b for sorting using insertion
		   		
		   		//array size of 16	
		   		//MergeSort ms1 = new MergeSort();	
		   	       System.out.println(" \n Given Array Of Size 16:");
		           ms1.printArray(arr1); // prints the original array
		           long startTime_ms16 = System.nanoTime();
		           ms1.sort(arr1, 0, arr1.length - 1);   // sorting using merge sort
		           long endTime_ms16   = System.nanoTime(); // recording clocktime 
		           long totalTime_ms16 = endTime_ms16 - startTime_ms16; // total clock time needed to run
		           System.out.println("Merge Sorted array:");
		           ms1.printArray(arr1);   // prints sorted array 
		           long Accumms1= totalTime_ms16; // Accumms1 is the variable to record each individual runtime of each algo of each size
		           
		           //Accumms1 = Accumms1+ Accumms1;
		           System.out.println("Total time taken for merge sort: " + Accumms1 + " nanoseconds");
		           
		           ms16 = ms16+Accumms1; // adding the runtime to average out later

		   		
		     //  }
		           //InsertionSort is1 = new InsertionSort();
		          //System.out.println("Given Array:");
		          //is1.printArray(arr1a);
		           long startTime_is16 = System.nanoTime(); // starting clock time for insertion sort
		           
		           is1.sort(arr1a); // sorting teh original unsorted array using insertions sort
		           
		           long endTime_is16   = System.nanoTime();
		           long totalTime_is16 = endTime_is16 - startTime_is16; // total time needed 
		           System.out.println("Insertion sorted Array:");
		           is1.printArray(arr1a); /// printing the array after insertion sort
		           long Accumis1= totalTime_is16; //Accumis1 is the variable to record each individual insertion sort runtime of each size
		           
		           System.out.println("Total time taken for insertion sort: " + Accumis1 + " nanoseconds");
		           
		           is16 = is16+Accumis1; // adding the runtime to average out later
		           
		           
		                   
		          // QuickSort qs1  = new QuickSort();
		          // System.out.println(" \n Given Array:");
		          // qs1.printArray(arr1b, max);
		           long startTime_qs16 = System.nanoTime(); // starting time
		           qs1.quickSort(arr1b, 0, arr1b.length - 1); // sorting the original unsorted array using quick sort
		           long endTime_qs16   = System.nanoTime();
		           long totalTime_qs16 = endTime_qs16 - startTime_qs16; // total time that is needed 
		           System.out.println("Quick Sorted array: ");
		           qs1.printArray(arr1b, arr1b.length); // printing sorted array after using quick sort
		           long Accumqs1=totalTime_qs16; // Accumqs1 is the variable to record each individual quick sort runtime of each size 
		           System.out.println("Total time taken for quick sort " + Accumqs1 + " nanoseconds");
		           
		           qs16 = qs16+Accumqs1; // adding the runtime to average out later
		           
		       }
		        // Accumms1 = Accumms1+Accumms1;
		        System.out.println ("\n Average time taken for Merge sort: " + ms16 / 100 ); // printing the average of running 100 arrays of size 16 using merge sort.
		        //Accumis1 = Accumis1+Accumis1;
		        System.out.println ("Average time taken for Insertion sort: " + is16 / 100 ); // printing the average of running 100 arrays of size 16 using insertion sort. 
		       // Accumqs1 = Accumqs1+Accumqs1;
		        System.out.println ("Average time taken for Quick sort: " + qs16 / 100 );// printing the average of running 100 arrays of size 16 using quick sort.

		   		}

			
		

     //array size of 32
{
   for(int k = 0; k <100; k++ ) {
   		 
        MergeSort ms2 = new MergeSort();
        InsertionSort is2 = new InsertionSort();
        QuickSort qs2  = new QuickSort();
            
   		int arr2[]= new int[32];
   			
   		Random rand2 = new Random();
   		
   		for (int i = 0; i<arr2.length; i++) 
   		{
   	    arr2[i] = rand2.nextInt(max-min) + min;
   		
   	    }
   		
   		int[]arr2a = Arrays.copyOf(arr2,arr2.length);
   		int[]arr2b = Arrays.copyOf(arr2,arr2.length);
   
		System.out.println("\n Given Array Of Size 32:");
        ms2.printArray(arr2); 
        
        long startTime_ms32 = System.nanoTime();
        
        ms2.sort(arr2, 0, arr2.length - 1); 
        
        long endTime_ms32   = System.nanoTime();
        long totalTime_ms32 = endTime_ms32 - startTime_ms32;
        
        System.out.println("Merge Sorted array:");
        ms2.printArray(arr2);  
        long Accumms2=totalTime_ms32;
        System.out.println("Total time taken for merge sort: " + Accumms2 + " nanoseconds");
        
        ms32 = ms32 + Accumms2;
        
       
        
       //System.out.println("Given Array:");
       //is2.printArray(arr2a);
        long startTime_is32 = System.nanoTime();
        is2.sort(arr2a);
        long endTime_is32   = System.nanoTime();
        long totalTime_is32 = endTime_is32 - startTime_is32;
        System.out.println("Insertion sorted Array :");
        is2.printArray(arr2a);
        long Accumis2= totalTime_is32;
        System.out.println("Total time taken for insertion sort: " + Accumis2 + " nanoseconds");
        
        is32 = is32 + Accumis2;
        
         //System.out.println(" \n Given Array:");
        //System.out.printArray (arr2b);
        long startTime_qs32 = System.nanoTime();
        qs2.quickSort(arr2b, 0, arr2b.length - 1);
        long endTime_qs32   = System.nanoTime();
        long totalTime_qs32 = endTime_qs32 - startTime_qs32;
        System.out.println("Quick Sorted array: ");
        qs2.printArray(arr2b, arr2b.length);
        long Accumqs2 = totalTime_qs32;
        System.out.println("Total time taken for quick sort: " + Accumqs2 + " nanoseconds");
        
        qs32 = qs32 + Accumqs2;
        
    }
       // Accumms2 = Accumms2+Accumms2;
        System.out.println ("\n Average time taken for Merge sort: " + ms32 / 100 );
       // Accumis2 = Accumis2+Accumis2;
        System.out.println ("Average time taken for Insertion sort: " + is32 / 100 );
       // Accumqs2 = Accumqs2+Accumqs2;
        System.out.println ("Average time taken for Quick sort: " + qs32 / 100 );
        
        
}
        
        
 //array size of 64

{
	   
for(int l = 0; l <100; l++ ) {
	
	   MergeSort ms3 = new MergeSort();
	   InsertionSort is3 = new InsertionSort();
	   QuickSort qs3  = new QuickSort();
	   
	   
      		 
       		int arr3[]= new int[64];
       		
       		Random rand3 = new Random();
       		
       		
       		for (int i = 0; i<arr3.length; i++) 
       		{
       	    arr3[i] = rand3.nextInt(max-min) + min;
       		
       	    }
       		
       		int[]arr3a = Arrays.copyOf(arr3,arr3.length);
       		int[]arr3b = Arrays.copyOf(arr3,arr3.length);
	 
        //MergeSort ms3 = new MergeSort();	
		System.out.println("\n Given Array Of Size 64:");
        ms3.printArray(arr3);
        long startTime_ms64 = System.nanoTime();
        ms3.sort(arr3, 0, arr3.length - 1);  
        long endTime_ms64   = System.nanoTime();
        long totalTime_ms64 = endTime_ms64 - startTime_ms64;
        System.out.println("Merge Sorted array:");
        ms3.printArray(arr3); 
        long Accumms3= totalTime_ms64;
        System.out.println("Total time taken for merge sort: " + Accumms3 + " nanoseconds");
        
        ms64 = ms64 + Accumms3;
        
        
        long startTime_is64 = System.nanoTime();
       // InsertionSort is3 = new InsertionSort();
        //System.out.println("Given Array:");
        //is3.printArray(arr3a);
        is3.sort(arr3a);
        long endTime_is64   = System.nanoTime();
        long totalTime_is64 = endTime_is64 - startTime_is64;
        System.out.println("Insertion sorted Array :");
        is3.printArray(arr3a);
        long Accumis3= totalTime_is64;
        System.out.println("Total time taken for insertion sort: " + Accumis3 + " nanoseconds");
        
        is64 = is64 + Accumis3;
        
      // QuickSort qs3  = new QuickSort();
        //System.out.println(" \n Given Array:");
        //qs3.printArray(arr3b , max);
        long startTime_qs64 = System.nanoTime();
        qs3.quickSort(arr3, 0, arr3b.length - 1);
        long endTime_qs64   = System.nanoTime();
        long totalTime_qs64 = endTime_qs64 - startTime_qs64;
        System.out.println("Quick Sorted array: ");
        qs3.printArray(arr3b, arr3b.length);
        long Accumqs3= totalTime_qs64;
        System.out.println("Total time taken for quick sort: " + Accumqs3 + " nanoseconds");
        
        qs64 = qs64 + Accumqs3;
        
    }
  //Accumms3 = Accumms3+Accumms3;
  System.out.println ("\n Average time taken for Merge sort: " + ms64 / 100 );
  //Accumis3 = Accumis3+Accumis3;
  System.out.println ("Average time taken for Insertion sort: " + is64 / 100 );
  //Accumqs3 = Accumqs3+Accumqs3;
  System.out.println ("Average time taken for Quick sort: " + qs64 / 100 );
  
} 
 //array size of 128
  
{
	 
  for(int m = 0; m <100; m++ ) {
	  
         MergeSort ms4 = new MergeSort();	
       	 InsertionSort is4 = new InsertionSort();
       	 QuickSort qs4  = new QuickSort();
      		 
       		int arr4[]= new int[128];
       		
       		Random rand4 = new Random();
       		
       		
       		for (int i = 0; i<arr4.length; i++) 
       		{
       	    arr4[i] = rand4.nextInt(max-min) + min;
       		
       	    }
       		
       		int[]arr4a = Arrays.copyOf(arr4,arr4.length);
       		int[]arr4b = Arrays.copyOf(arr4,arr4.length);
	  
        
        
		System.out.println(" \n Given Array Of Size 128: ");
        ms4.printArray(arr4); 
        long startTime_ms128 = System.nanoTime();
        ms4.sort(arr4, 0, arr4.length - 1);  
        long endTime_ms128   = System.nanoTime();
        long totalTime_ms128 = endTime_ms128 - startTime_ms128;
        System.out.println("Merge Sorted array: ");
        ms4.printArray(arr4);  
        long Accumms4= totalTime_ms128;
        System.out.println("Total time taken for merge sort: " + Accumms4 + " nanoseconds");
       
        ms128 = ms128 + Accumms4;
       
       // System.out.println("Given Array:");
        //is4.printArray(arr4a);
        long startTime_is128 = System.nanoTime();
        is4.sort(arr4a);
        long endTime_is128   = System.nanoTime();
        long totalTime_is128 = endTime_is128 - startTime_is128;
        System.out.println("Insertion sorted Array:");
        is4.printArray(arr4a);
        long Accumis4= totalTime_is128;
        
        System.out.println("Total time taken for insertion sort: " + Accumis4 + " nanoseconds");
        
        is128 = is128 + Accumis4;
        
        
        // System.out.println(" \n Given Array:");
        // qs4.printArray(arr4b, max);
         long startTime_qs128 = System.nanoTime();
         qs4.quickSort(arr4b, 0, arr4b.length - 1);
         long endTime_qs128   = System.nanoTime();
         long totalTime_qs128 = endTime_qs128 - startTime_qs128;
         System.out.println("Quick Sorted array: ");
         qs4.printArray(arr4b, arr4b.length);
         long Accumqs4= totalTime_qs128;
         System.out.println("Total time taken for quick sort: " + Accumqs4 + " nanoseconds");
         
         qs128 = qs128 + Accumqs4;
         
  }
        
       // Accumms4 = Accumms4+Accumms4;
        System.out.println ("\n Average time taken for Merge sort: " + ms128 / 100 );
        // Accumis4 = Accumis4+Accumis4;
        System.out.println ("Average time taken for Insertion sort: " + is128 / 100 );
        // Accumqs4 = Accumqs4+Accumqs4;
        System.out.println ("Average time taken for Quick sort: " + qs128 / 100 );
} 
        
//array size of 256
   {

	   
         for(int n = 0; n <100; n++ ) {
        	 

      	   MergeSort ms5 = new MergeSort();	
      	   InsertionSort is5 = new InsertionSort();
      	   QuickSort qs5  = new QuickSort();
      	   
       		 
        		int arr5[]= new int[256];
        		
        		Random rand5 = new Random();
        		
        		
        		for (int i = 0; i<arr5.length; i++) 
        		{
        	    arr5[i] = rand5.nextInt(max-min) + min;
        		
        	    }
        		
        		int[]arr5a = Arrays.copyOf(arr5,arr5.length);
        		int[]arr5b = Arrays.copyOf(arr5,arr5.length);
	  
       
		System.out.println(" \n Given Array Of 256:");
        ms5.printArray(arr5); 
        long startTime_ms256 = System.nanoTime();
        ms5.sort(arr5, 0, arr5.length - 1);  
        long endTime_ms256   = System.nanoTime();
        long totalTime_ms256 = endTime_ms256 - startTime_ms256;
        System.out.println("Merge Sorted array:");
        ms5.printArray(arr5);  
        long Accumms5= totalTime_ms256;
        System.out.println("Total time taken for merge sort: " + Accumms5 + " nanoseconds");
        
        ms256 = ms256 + Accumms5;
        
        
       
        
       //System.out.println("Given Array:");
       // is5.printArray(arr5a);
        long startTime_is256 = System.nanoTime();
        is5.sort(arr5a);
        long endTime_is256   = System.nanoTime();
        long totalTime_is256 = endTime_is256 - startTime_is256;
        System.out.println("Insertion sorted Array:");
        is5.printArray(arr5a);
        long Accumis5= totalTime_is256;
        System.out.println("Total time taken for insertion sort: " + Accumis5 + " nanoseconds");
     
        is256 = is256 + Accumis5;
        
       
       // System.out.println(" \n Given Array:");
       // qs5.printArray(arr5b, max);
        long startTime_qs256 = System.nanoTime();
        qs5.quickSort(arr5b, 0, arr5b.length - 1);
        long endTime_qs256   = System.nanoTime();
        long totalTime_qs256 = endTime_qs256 - startTime_qs256;
        System.out.println("Quick Sorted array: ");
        qs5.printArray(arr5b, arr5b.length);
        long Accumqs5= totalTime_qs256; 
        System.out.println("Total time taken for quick sort: " + Accumqs5 + " nanoseconds");
        
        qs256 = qs256 + Accumqs5;
       
         }
         //Accumms5 = Accumms5+Accumms5;
         System.out.println ("\n Average time taken for Merge sort: " + ms256 / 100 );
         //Accumis5 = Accumis5+Accumis5;
         System.out.println ("Average time taken for Insertion sort: " + is256 / 100 );
         //Accumqs5 = Accumqs5+Accumqs5;
         System.out.println ("Average time taken for Quick sort: " + qs256 / 100 );
         
   }
   
   
  
         
         }
        
        }
        }

        
		
        
        

