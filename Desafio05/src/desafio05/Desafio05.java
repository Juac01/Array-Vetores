package desafio05;

public class Desafio05 {

    public static void main(String[] args) {
        // Escreva uma função que recebe dois vetores inteiros A[] e B[], em seguida, a sua
        //função efetua a INTERSECÇÃO entre os vetores, ou seja, os elementos em comum
        //entre os dois vetores, ao final sua função retorna uma String com a resposta. Os
        //vetores dados não possuem valores duplicados e não estão ordenados.
        //Exemplos
        //A[] = {7, 2, 5, 8, 4} e B[] = {4, 2, 9, 5} então A ∩ B = {2, 5, 4}
        //A[] = {3, 9, 11} e B[] = {2, 6, 1} então A ∩ B = {}
          
        int A[] = {7,2,5,8,4};
        int B[] = {4,2,9,5};
        
        System.out.println(Resultado(A, B));
    }
    
    public static String Resultado(int []A,int []B){
        String res = "";
       
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                if(A[i] == B[j]){
                res =  res + A[i] + " " ;
                }
            }
        }
        return res;
    }
}


