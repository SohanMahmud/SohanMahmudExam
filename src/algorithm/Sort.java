package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helping methods.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        for (int i = 1; i <= array.length; i++) {
            for (int j = i - 1; j > 0; j--) {
                while (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here
        
        
        
        
        
        
        return list;
    }
    


        public int [] mergeSort(int [] array){
            final long startTime = System.currentTimeMillis();
            int [] list = array;
//implement here
            int size = list.length;
            int mid = size / 2;
            int leftSize = mid;
            int rightSize = size - mid;
            int[] left = new int[leftSize];
            int[] right = new int[rightSize];

            int[] temp=new int[left.length+right.length];
            int i=0;
            int j=0;
            int h=0;
            while(i<left.length && j<right.length){
                if(j>right.length||(i<left.length &&left[i]<right[j])){
                    temp[h++]=left[i++];

                }
                else
                    temp[h++]=right[j++];
            }

            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;

            return temp;
        }


    

    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here



        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here



        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
