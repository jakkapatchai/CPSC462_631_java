class x { 
 
    public static void main(String args[]){
      int array[] = new int[]{1, 2, 3, 4, 5, 10};
   
      int max = Max(array);
      System.out.println("Maximum Value is: "+max);
  
      int min = Min(array);
      System.out.println("Minimum Value is: "+min);
    }
   
    public static int Max(int[] inputArray){ 
      int maxValue = inputArray[0]; 
      for(int i=1;i < inputArray.length;i++){ 
        if(inputArray[i] > maxValue){ 
           maxValue = inputArray[i]; 
        } 
      } 
      return maxValue; 
    }
   
    public static int Min(int[] inputArray){ 
      int minValue = inputArray[0]; 
      for(int i=1;i<inputArray.length;i++){ 
        if(inputArray[i] < minValue){ 
          minValue = inputArray[i]; 
        } 
      } 
      return minValue; 
    } 
  }