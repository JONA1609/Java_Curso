public class OPeradoresComparacion {
    public static void main(String[] args) {
        System.out.println("**** OPeradores de Comparacion ****");
        int a=3,  b=2;
        var resultado = a==b;
        System.out.println("Resultado de comparar a y b = "+ resultado);
        //OPerador de distinto de
        resultado = a!=b;
        System.out.println("Resultado de a es distinto que b = "+resultado);
        resultado = a>b;
        System.out.println("Resultado de a es mayor que b= "+resultado);
        resultado = a<b;
        System.out.println("Resultado de a es menor que b= "+resultado);
        resultado = a>=b;
        System.out.println("Resultado de a es mayor o igual que b = "+resultado);

    }
}
