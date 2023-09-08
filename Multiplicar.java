package Recursividad;

public class Multiplicar {
    
    public long multiplicar(long num1, long num2){
        if(num2>=1){
            return multiplicar(num1, num2-1)+num1;
        } else {
            return 0;  
        }
    }
    public static void main(String[] args) {
        Multiplicar m = new Multiplicar();
        System.out.println(m.multiplicar(3,5));
    }
}
