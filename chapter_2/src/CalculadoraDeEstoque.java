public class CalculadoraDeEstoque {
    public static void main(String[] args){
        double soma = 0;
        
        for(double i = 0; i < 35; i++){
            soma += 59.90;
        }
        
        System.out.println("O total em estoque é " + soma);

        if(soma < 150){
            System.out.println("Seu estoque está muito baixo!");
        } else if(soma >= 2000){
            System.out.println("Seu estoque está muito alto!");
        } else {
            System.out.println("Seu estoque está bom");
        }
    }
}

/*  TIPOS PRIMITIVOS

    boolean -> 1 bit
    byte    -> 1 byte
    short   -> 2 byte
    char    -> 2 byte
    int     -> 4 byte
    float   -> 4 byte
    long    -> 8 byte
    double  -> 8 byte

*/  

/*  CASTING

    int numeroInteiro = (int) livroJava8;
 
 */

 /* OPERADOR TERNÁRIO

    double valor = 0
    if(v1 > v2){
        valor = 100;
    } else {
        valor = 0;
    }


    double valor = v1 > v2 ? 100 : 0

  */