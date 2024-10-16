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
    
}
