
package ejemplosgit;

public class sobrecarga {
    public void test(){
        System.out.println("Metodo vacío.");
    }
    
    public void test (int a){
        System.out.println("El valor de a: " + a);
    }

    public void test (int a, int b){
        System.out.println("El valor de a: " + a + " y el valor de b: " + b);
    }
    
    public double test(double c){
        System.out.println("El double de a es: " + c);
        return c;
    }
}
