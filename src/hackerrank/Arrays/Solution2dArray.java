package hackerrank.Arrays;


import java.util.*;

//Hourglass hackerrank problem -Array
public class Solution2dArray {
    private List<Integer> listOfArrays= new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
      
        Solution2dArray s1= new Solution2dArray();
       
       s1.printResult(arr);
     
        
    }
    
    private  int getWeight(int[][] arrVal)
    {   int sum=0;
    	for (int i = 0; i < 3; i++) {
    		sum= arrVal[i][0]+arrVal[i][1]+arrVal[i][2]+sum;
		}
    	
    	return sum;
    }
    private  void iteraction(int[][] mainArray)
    {
    	
    	for (int i = 0; i < 4; i++) {
    		for (int j = 0; j < 4; j++) {
    			int[][] p=new int[3][3];
    			p[0][0]= mainArray[i][j];
    			p[0][1]= mainArray[i][j+1];
    			p[0][2]= mainArray[i][j+2];
    			p[1][0]= 0;
    			p[1][1]= mainArray[i+1][j+1];
    			p[1][2]= 0;
    			p[2][0]= mainArray[i+2][j];
    			p[2][1]= mainArray[i+2][j+1];
    			p[2][2]= mainArray[i+2][j+2];
    		   this.listOfArrays.add(getWeight(p));
			
		}
    }
   
}
    public void printResult(int[][] mainArray)
    {   int result=0;
        int max=-1000;
        iteraction(mainArray);
        
    	for (int i = 0; i < listOfArrays.size(); i++) {
			result= listOfArrays.get(i);
			System.out.println(result);
			if (result<max) {
				
				continue;
				
			} else {
				max=result;

			}
			
		}
    	System.out.println(max);
    	
    }
}
