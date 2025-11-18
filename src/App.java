public class App {
    public static void main(String[] args) throws Exception {

        Estudiante estudiante1 = new Estudiante("Benjamin", "Eceiza", 23, "44480358", "Programador", 9.00);
        Estudiante estudiante2 = new Estudiante("Lucas", "Godoy", 20, "41123123", "Abogacia", 7.00);

        Profesor profesor1 = new Profesor("Sandra", "Funes", 42, "31123123", "Ingenieria", 10, null);
        Profesor profesor2 = new Profesor("Leandro", "Gonzales", 30, "42123123", "Ciencias Exactas", 5, null);
        Profesor profesor3 = new Profesor("Julian", "Alvarez", 25, "43434343", "Historia", 2, null);

        Materia m1 = new Materia("Matematica", profesor2, 9.00);
        Materia m2 = new Materia("Ciencias", profesor1, 8.00);
        Materia m3 = new Materia("Historia Argentina", profesor3, 8.00);

        estudiante1.setMateriaAlInicio(m1);
        estudiante1.setMateriaAlInicio(m2);

        estudiante2.setMateriaAlInicio(m1);
        estudiante2.setMateriaAlInicio(m3);

        // System.out.println("Pomedio: " + estudiante2.calcularPromedioRecursivo(null,
        // 0, 0));

        // CREAMOS LA LISTA UNIVERSIDAD
        Universidad listaMiembros = new Universidad();

        // AGREGAMOS 2 MIEMBROS AL INICIO
        listaMiembros.agregarMiembroInicio(estudiante1);
        listaMiembros.agregarMiembroInicio(profesor1);
        // AGREGAMOS 1 MIEMBRO AL FINAL
        listaMiembros.agregarMiembroFinal(profesor2);

        // AGREGAMOS 1 MIEMBRO AL MEDIO, SIGUENTE DE PROFESOR 1
        listaMiembros.agregarMiembroMedio(profesor3, profesor1);

        listaMiembros.listarMiembros();

        //MUESTRA RESULTADO DE BUSQUEDA BINARIA
        ListaEnlazadaMiembros encontrado = listaMiembros.convertirALista(listaMiembros.busquedaBinariaMiembro("eceiza"));
       
        System.out.println("\nPersona Econtrada!");
        encontrado.imprimirMiembros();

    }
}
