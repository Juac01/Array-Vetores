package desafio04;

public class Desafio04 {

    public static void main(String[] args) {
        // Criar uma função que receba como parâmetro um vetor de inteiros e
        // inverte os elementos deste vetor.

        int vetorInt[] = {1, 2, 3, 4, 5, 6, 7,8,9,10,11,12,13};
        System.out.printf("Vetor Original: \n");
        original(vetorInt);
       
        System.out.printf("Vetor Invertido: \n");
        invertido(vetorInt);
        
    }

    public static void original(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+ " ");                  
        }
        System.out.println();
    }
    
    public static int []invertido (int [] nums){
        int aux;
        for(int i = 0; i < nums.length ; i++){
            aux = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = aux;
            System.out.print(aux+" ");
        }
    return nums;
    }
    
}
