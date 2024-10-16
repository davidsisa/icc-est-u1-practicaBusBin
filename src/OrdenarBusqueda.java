public class OrdenarBusqueda {
    public int[] sortByBubbleAsc(int[] arreglo){
        int tamanio = arreglo.length;
        for (int i = 0; i < tamanio; i++) {
            for (int a = i + 1; a < tamanio; a++) {
                if (arreglo[i] > arreglo[a]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo [a];
                    arreglo[a] = aux;
                }
            }
        }
        return arreglo;
    }
    public  Persona[] ordenarLista(Persona[] personas){
        int tamanio = personas.length;
        Persona temp;
        for (int i = 0; i < tamanio; i++) {
            for (int a = i + 1; a < tamanio; a++) {
                if (personas[i].getEdad() > personas[a].getEdad()) {
                     temp = personas[i];
                     personas[i] = personas[a];
                     personas[a] = temp;
                }
            }
        }
        return personas;
    }
    public int busquedaBinaria(int[] array, int valorBuscado) {
        int inicio = 0;
        int fin = array.length - 1;
        //int cont = 0;
        
        while (inicio <= fin) { 
            int medio = inicio + (fin - inicio) /2;
            //cont ++;
            //System.out.println("Comparaciones Binaria: " + cont);
            if(array[medio] == valorBuscado){
                return medio;
            }
            if (array[medio] < valorBuscado){
                inicio = medio + 1; //Buscar en la mitad de la derecha
            }else{
                fin = medio - 1; //Buscar en la mitad de la izquierda
            }

        }
        return -1;
    }
    public Persona buscarUsuario(Persona[] personas, int buscar){
       
        int inicio = 0;
        int fin = personas.length - 1;
        while (inicio <= fin) { 
          
            int medio = inicio + (fin - inicio) /2;
            //cont ++;
            //System.out.println("Comparaciones Binaria: " + cont);
            if(personas[medio].getEdad() == buscar){
                return personas[medio];
            }
            if (personas[medio].getEdad() < buscar){
                inicio = medio + 1; //Buscar en la mitad de la derecha
            }else{
                fin = medio - 1; //Buscar en la mitad de la izquierda
            }

        }
        return null;
    }
}
