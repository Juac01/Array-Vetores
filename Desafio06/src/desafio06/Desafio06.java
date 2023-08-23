
package desafio06;

public class Desafio06 {

    public static void main(String[] args) {
        // Repita o exercício anterior, agora deve ser retornado em uma String os elementos
        //que estão em A[] mas não estão em B[], ou seja, a DIFERENÇA de A – B.
        //Exemplos
        //A[] = {7, 2, 5, 8, 4} e B[] = {4, 2, 9, 5} então A - B = {7, 8}
        //A[] = {3, 9, 11} e B[] = {2, 6, 1} então A - B = {3, 9, 11}
        int A[] = {7,2,5,8,4};
        int B[] = {4,2,9,5};
        System.out.println(Diferenca(A, B));
   
        
    }
     public static String Diferenca (int A[], int B[]){
         String dif = "";
         for(int i = 0; i < A.length; i++){
             boolean naoB = false;
             for(int j = 0; j < B.length; j++){
                 if(A[i] == B[j]){
                     naoB = true;
                     break;
                 } 
             }
             if(!naoB){
                 dif = dif + A[i] + " ";
             }
         }
         return dif;
         
     }
}
    

