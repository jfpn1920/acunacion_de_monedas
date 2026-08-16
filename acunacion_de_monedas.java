import java.util.Scanner;
public class acunacion_de_monedas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] monedas = new String[10];
        String[] paises = new String[10];
        int[] anios = new int[10];
        String[] materiales = new String[10];
        int[] cantidades = new int[10];
        double[] valoresNominales = new double[10];
        String[] casasMoneda = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //-----------------------------------------//
        //--|menu_principal_acunacion_de_monedas|--//
        //-----------------------------------------//
        do {
            System.out.println("menu principal acunacion de monedas");
            System.out.println("1) Registrar acunacion");
            System.out.println("2) Editar acunacion");
            System.out.println("3) Listar acunaciones");
            System.out.println("4) Buscar acunacion");
            System.out.println("5) Eliminar acunacion");
            System.out.println("6) Mostrar produccion");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-------------------------//
                //--|registrar_acunacion|--//
                //-------------------------//
                case 1:
                    if (total >= monedas.length) {
                        System.out.println("No hay espacio para registrar mas acuñaciones.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro de acunacion");
                    System.out.println("id de la acunacion a registrar: " + id);
                    System.out.print("nombre o denominacion de la moneda: ");
                    monedas[total] = entrada.nextLine();
                    System.out.print("pais: ");
                    paises[total] = entrada.nextLine();
                    System.out.print("anio de acunacion: ");
                    anios[total] = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("material: ");
                    materiales[total] = entrada.nextLine();
                    System.out.print("cantidad de monedas producidas: ");
                    cantidades[total] = entrada.nextInt();
                    System.out.print("valor nominal: ");
                    valoresNominales[total] = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("casa de moneda: ");
                    casasMoneda[total] = entrada.nextLine();
                    System.out.print("estado del lote: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Acunacion registrada correctamente.");
                    total++;
                    break;
                //----------------------//
                //--|editar_acunacion|--//
                //----------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen acuñaciones registradas.");
                        break;
                    }
                    System.out.println("Datos de las acuñaciones");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Moneda: " + monedas[i] + " | Pais: " + paises[i] + " | Anio: " + anios[i] + " | Material: " + materiales[i] + " | Cantidad: " + cantidades[i] + " | Valor nominal: " + valoresNominales[i] + " | Casa de moneda: " + casasMoneda[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la acunacion: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato de la acunacion");
                        System.out.print("Nueva moneda o denominacion: ");
                        monedas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo pais: ");
                        paises[posicion] = entrada.nextLine();
                        System.out.print("Nuevo anio de acunacion: ");
                        anios[posicion] = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Nuevo material: ");
                        materiales[posicion] = entrada.nextLine();
                        System.out.print("Nueva cantidad de monedas producidas: ");
                        cantidades[posicion] = entrada.nextInt();
                        System.out.print("Nuevo valor nominal: ");
                        valoresNominales[posicion] = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.print("Nueva casa de moneda: ");
                        casasMoneda[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado del lote: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Acunacion actualizada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------//
                //--|listar_acunaciones|--//
                //------------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen acuñaciones registradas.");
                    } else {
                        System.out.println("Lista de acuñaciones");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Moneda: " + monedas[i] + " | Pais: " + paises[i] + " | Anio: " + anios[i] + " | Material: " + materiales[i] + " | Cantidad: " + cantidades[i] + " | Valor nominal: " + valoresNominales[i] + " | Casa de moneda: " + casasMoneda[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //----------------------//
                //--|buscar_acunacion|--//
                //----------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen acuñaciones registradas.");
                        break;
                    }
                    System.out.println("busqueda de acunacion");
                    System.out.print("ingresa la id para buscar acunacion: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos de la acunacion encontrada:");
                        System.out.println("ID: " + idBusqueda + " | Moneda: " + monedas[posicion] + " | Pais: " + paises[posicion] + " | Anio: " + anios[posicion] + " | Material: " + materiales[posicion] + " | Cantidad: " + cantidades[posicion] + " | Valor nominal: " + valoresNominales[posicion] + " | Casa de moneda: " + casasMoneda[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------//
                //--|eliminar_acunacion|--//
                //------------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen acuñaciones registradas.");
                        break;
                    }
                    System.out.println("Datos de las acuñaciones");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Moneda: " + monedas[i] + " | Pais: " + paises[i] + " | Anio: " + anios[i] + " | Material: " + materiales[i] + " | Cantidad: " + cantidades[i] + " | Valor nominal: " + valoresNominales[i] + " | Casa de moneda: " + casasMoneda[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la acunacion a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            monedas[i] = monedas[i + 1];
                            paises[i] = paises[i + 1];
                            anios[i] = anios[i + 1];
                            materiales[i] = materiales[i + 1];
                            cantidades[i] = cantidades[i + 1];
                            valoresNominales[i] = valoresNominales[i + 1];
                            casasMoneda[i] = casasMoneda[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Acunacion eliminada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------//
                //--|mostrar_produccion|--//
                //------------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen acuñaciones registradas.");
                        break;
                    }
                    int monedasAcunadas = 0;
                    double valorTotal = 0;
                    for (int i = 0; i < total; i++) {
                        monedasAcunadas += cantidades[i];
                        valorTotal += cantidades[i] * valoresNominales[i];
                    }
                    System.out.println("resumen de produccion");
                    System.out.println("Lotes registrados: " + total);
                    System.out.println("Monedas acunadas: " + monedasAcunadas);
                    System.out.println("Valor nominal producido: " + valorTotal);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Acunacion de Monedas.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}