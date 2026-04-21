public class MetodoBurbuja {

    int [] arr;
    //constructor vacío
    //Instanciar una clase es ejecutar el Constructor
    public MetodoBurbuja(int[] arr){
        System.out.println("Se creo la clase Met Burbuja");
        //1RA FORMA
        //INSTANCIAR CON VALOR CREADO EL CONSTRUCTOR
        //this.arr = new int[]{10, 5, 8, 0, 7};

        //2DA FORMA
        //INSTANCIAR CON VALOR DESDE PARAMETRO
        this.arr = arr;
    }

    public void ordenarAscendente(){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }

    public void imprimirArreglo(){
        for(int num : arr){
            System.out.print(num + ", ");
        }
        System.out.println();
    }

    public void ordenarDescendente(){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }
}
