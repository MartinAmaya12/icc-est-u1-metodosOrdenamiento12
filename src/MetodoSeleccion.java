public class MetodoSeleccion {
    
    public void sort(int[]arr){
        int tam = arr.length;
        for(int i = 0; i < tam - 1;i++ ){
            int indMenor = i;
            for(int j = i + 1; j < tam; j++){
                if(arr[indMenor] > arr[j]){
                    indMenor = j;  //ACTUALIZO EL INDICE MENOR
                }
            }
            if(i != indMenor){ //INTERCAMBIO
                int aux = arr[i];
                arr[i] = arr[indMenor];
                arr[indMenor] = aux;
            }
        }
    }

        public void sortDesc(int[]arr){
        int tam = arr.length;
        for(int i = 0; i < tam - 1;i++ ){
            int indMayor = i;
            for(int j = i + 1; j < tam; j++){
                if(arr[indMayor] < arr[j]){
                    indMayor = j;  //ACTUALIZO EL INDICE MAYOR
                }
            }
            if(i != indMayor){ //INTERCAMBIO
                int aux = arr[i];
                arr[i] = arr[indMayor];
                arr[indMayor] = aux;
            }
        }
    }


    public void imprimirArreglo(int[]arr){
        for(int num : arr){
            System.out.print(num + ", ");
        }
        System.out.println();
    }

    
}
