
package desafio03;

import java.util.Arrays;

public class Desafio03 {

   
    public static void main(String[] args) {
       //swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
       //swapEnds([1, 2, 3]) → [3, 2, 1]
       //swapEnds([8, 6, 7, 9 , 5]) → [5, 6, 7, 9, 8]
       
       int [] Array1 = {1,2,3,4};
       int [] Array2 = {1,2,3};
       int [] Array3 = {8,6,7,9,5};
       
        System.out.println(Arrays.toString(TrocaValor(Array1))); 
        System.out.println(Arrays.toString(TrocaValor(Array2)));
        System.out.println(Arrays.toString(TrocaValor(Array3)));
    }
    
    public static int [] TrocaValor(int[]nums){
        int auxiliar = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = auxiliar;
       
        return nums;
    }
   
    
    
}
