package Recursividad;

public class Potencia {
    
    public Multiplicar mult = new Multiplicar();
    
    public long elevado(long num, long exp){
        if(exp>=1){
            return mult.multiplicar(num, elevado(num,exp-1));
        } else {
            return 1;
        }
    }
    
    public static void main(String[] args) {
        Potencia p = new Potencia();
        System.out.println(p.elevado(9,3));
    }
    
    /* Los resultados de potencias mayores a 20.000 daran un error de compilacion
    por demasiadas llamadas de recursion a expecion de 1 ^ n*/
    
}
