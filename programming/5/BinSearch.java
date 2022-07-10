/**
 * Binary Search by Team Did You Mean Recursion?
 * Jenna Lin
 * collaborators: First Last, First Last
 */

public class BinSearch
{
    public static void main (String[] args)
    {     
        System.out.println("\nNow testing binSearch on int array...");
    
        //Declare and initialize array of ints
        int[] iArr = { 2, 4, 6, 8, 6, 42 };
        printArray(iArr);

        System.out.println( "iArr1 sorted? -- " + isSorted(iArr) );

        System.out.println();

        int[] iArr2 = { 2, 4, 6, 8, 13, 42 };
        printArray(iArr2);
        System.out.println( "iArr2 sorted? -- " + isSorted(iArr2) );


        //search for 2 in array
        System.out.printf("The element 2 is present at index %d.\n", binSearch(iArr2, 2));
        //search for 4 in array
        System.out.printf("The element 4 is present at index %d.\n", binSearch(iArr2, 4));
        //search for 6 in array
        System.out.printf("The element 6 is present at index %d.\n", binSearch(iArr2, 6));
        //search for 8 in array
        System.out.printf("The element 8 is present at index %d.\n", binSearch(iArr2, 8));
        //search for 13 in array
        System.out.printf("The element 13 is present at index %d.\n", binSearch(iArr2, 13));
        //search for 42 in array
        System.out.printf("The element 42 is present at index %d.\n", binSearch(iArr2, 42));


        //search for 43 in array
        System.out.printf("The element 43 is present at index %d.\n", binSearch(iArr2, 43));

        System.out.println();
        
        int[] iArr3 = new int[100];
        for(int i = 0; i < iArr3.length; i++) 
        {
            iArr3[i] = i * 2;
        }

        printArray(iArr3);
        System.out.println( "iArr3 sorted? -- " + isSorted(iArr3) );

        System.out.println();

        System.out.println("Now testing binSearch on iArr3..." );
        System.out.printf("The element 4 is present at index %d.\n", binSearch(iArr3, 4));
        System.out.printf("The element 8 is present at index %d.\n", binSearch(iArr3, 8));
        System.out.printf("The element 5 is present at index %d.\n", binSearch(iArr3, 5));

        //search for 43 in array
        System.out.printf("The element 43 is present at index %d.\n", binSearch(iArr3, 43));

    }


    /**
        int binSearch(int[],int) -- searches an array of ints for target int
        precondition:  input array is sorted in ascending order
        postcondition: returns index of target, or returns -1 if target not found
    */
        public static int binSearch(int[] a, int target)
        {            
            return binSearchRec(a, target, 0, a.length - 1);
        }


        public static int binSearchRec(int[] a, int target, int loPos, int hiPos)
        {
            int targetPosition = -1; //initial return variable to flag/signal value

            int mPos = (loPos + hiPos) / 2; //init tracker variable for middle position

            //exit case. If lo & hi have crossed, target not present
            if (loPos > hiPos)
            {
                return targetPosition;
            }
            
            // target found
            if (a[mPos] == target) 
            {
                return mPos;
            }

            // value at mid index higher than target
            else if (a[mPos] > target)
            {
                //discard all elements to the right of mPos[a], including mPos[a]. Now the new high value would be mPos - 1. 
                return binSearchRec(a, target, loPos, mPos - 1);
            }

            // value at mid index lower than target
            else if (a[mPos] < target) 
            {
                //discard all elements to the left of mPos[a], including mPos[a]. Now the new low value would be mPos + 1. 
                return binSearchRec(a, target, mPos + 1, hiPos);
            }

            return targetPosition;

        }//end binSearchRec


    //tell whether an array is sorted in ascending order
    private static boolean isSorted(int[] arr)
    {
        boolean retBoo = true; //initializes to true, assume array is sorted

        for( int i = 0; i < arr.length - 1; i++ ) 
        {
            if (arr[i] > arr[i + 1]) 
            {
                return false;
            }
        }
        
        return retBoo; //if entire array was traversed, it must be sorted
    }


    // utility/helper fxn to display contents of an array of Objects
    private static void printArray(int[] arr)
    {
            String output = "{ ";

            for(int c : arr)
            output += c + ", ";

            output = output.substring(0, output.length()-2) + " }";

            System.out.println(output);
    }



  
  

}