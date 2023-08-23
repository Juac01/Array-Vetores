package desafio02;

public class Desafio02 {

    public static void main(String[] args) {
        //bigDiff([10, 3, 5, 6]) → 7
        //bigDiff([7, 2, 10, 9]) → 8
        //bigDiff([2, 10, 7, 2]) → 8
        int[] Array1 = {10,3,5,6};
        int[] Array2 = {7,2,10,9};
        int[] Array3 = {2,10,7,2};
        
        System.out.println(Valor(Array1));
        System.out.println(Valor(Array2));
        System.out.println(Valor(Array3));

    }
    public static int Valor( int[] b ){
        int min = b[0];
        int max = b[0];
        for(int i = 1; i < b.length; i++ ){
            min = Math.min(min,b[i]);
            max = Math.max(max,b[i] );
        } 
        return max - min;
    }

}
