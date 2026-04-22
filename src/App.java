public class App {
    public static void main(String[] args) throws Exception {
        //metodoBurbuja();
        runBurbujaAvanzado();
        
    }
    /*public static void metodoBurbuja(){
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

    }*/

    public static void runBurbujaAvanzado(){
        int [] arr = new int[]{50, 5, 20, 30, 0, -10, 15};

        MetodoBurbujaAvanzado metodoBurbujaAvanzado = new MetodoBurbujaAvanzado(arr);
        System.out.println("Arreglo sin ordenar");
        metodoBurbujaAvanzado.imprimirArreglo();
        metodoBurbujaAvanzado.sort(true);
        
        metodoBurbujaAvanzado.imprimirArreglo();
        metodoBurbujaAvanzado.sort(false);
        
        metodoBurbujaAvanzado.imprimirArreglo();
    }
}
