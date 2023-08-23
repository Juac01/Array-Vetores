
package desafio01;

public class Desafio01 {

    public static void main(String[] args) {
        int [] Array1 = {2,1,2,3,4};
        int [] Array2 = {2,2,0};
        int [] Array3 = {1,3,5};
        
        System.out.println(countEvens(Array1));
        System.out.println(countEvens(Array2));
        System.out.println(countEvens(Array3));

    }
    
    public static int countEvens(int[] nums) {
        int count = 0;
        
        for (int num : nums) {
            if (num % 2 == 0) { // Verifica se o número é par
                count++;
            }
        }
        
        return count;
    }
  
    
}
