public class App {
    public static void main(String[] args) throws Exception {
        metodoBurbuja();

        
    }
    public static void metodoBurbuja(){
        System.out.println("Metodo Burbuja");
        int[] arr = {10, -5, 0, 2, 7};
        //Instancia de la clase MetodoBrubuja y ()-> esto hace que se ejecute el constructor
        MetodoBurbuja metodoBurbuja = new MetodoBurbuja(arr);
        System.out.println("Arreglo sin ordenar");
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarAscendente();
        System.out.println("Arreglo ordenaro Ascendentemente:");
        metodoBurbuja.imprimirArreglo();

        System.out.println("Arreglo sin ordenar");
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarDescendente();
        System.out.println("Arreglo ordenado Descententemente:");
        metodoBurbuja.imprimirArreglo();
    }
}
