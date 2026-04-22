public class MetodoBurbujaAvanzado {

    int[] arr;

    public MetodoBurbujaAvanzado(int[] arr) {
        this.arr =arr;
    }

    public void sort(boolean asc){
        int tam = arr.length;

        int contComparaciones = 0;
        int contCambios = 0;
        boolean huboIntercambios;
        
        //Comparacion
        
        if(asc){
            //true ascendente
            for(int i = 0; i < tam - 1; i++){
                huboIntercambios = false;
                for(int j = 0; j < tam - 1 - i; j++){
                    contComparaciones ++;
                    if(arr[j] > arr[j+1]){
                        contCambios++;
                        huboIntercambios = true;
                        int aux = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = aux;
                    }
                }
            }
        }else{
            // false descendente
            for(int i = 0; i < tam - 1; i++){
                huboIntercambios = false;
                for(int j = 0; j < tam - 1 - i; j++){
                    contComparaciones ++;
                    if(arr[j] < arr[j+1]){
                        contCambios++;
                        huboIntercambios = true;
                        int aux = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = aux;
                    }
                }
                if(!huboIntercambios){
                    break;
                }
            }
            
        }
        
        System.out.println("Comparaciones: " + contComparaciones);
        System.out.println("Cambios: " + contCambios);
    }

    public void imprimirArreglo(){
        for(int num : arr){
            System.out.print(num + ", ");
        }
        System.out.println();
    }

    
}
