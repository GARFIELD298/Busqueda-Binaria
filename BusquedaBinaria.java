import java.io.*;
import java.util.*;

public class BusquedaBinaria {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        int numeroBuscado = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("bin.txt"))) {
            String linea;
            numeroBuscado = Integer.parseInt(br.readLine().trim());

            while ((linea = br.readLine()) != null) {
                lista.add(Integer.parseInt(linea.trim()));
            }
        } catch (Exception e) {
            System.out.println("Error al leer entrada.txt: " + e.getMessage());
            return;
        }

        int[] arr = lista.stream().mapToInt(i -> i).toArray();
        int resultado = busquedaBinaria(arr, numeroBuscado);
        try (PrintWriter pw = new PrintWriter(new FileWriter("salida.txt"))) {
            if (resultado != -1) {
                pw.println("Número encontrado en la posición: " + resultado);
            } else {
                pw.println("El número NO se encontró.");
            }
        } catch (Exception e) {
            System.out.println("Error al escribir salida.txt: " + e.getMessage());
        }
        System.out.println("Búsqueda completada. Revisa salida.txt.");
    }

    public static int busquedaBinaria(int[] arr, int objetivo) {
        int inicio = 0;
        int fin = arr.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (arr[medio] == objetivo)
                return medio;
            if (arr[medio] < objetivo)
                inicio = medio + 1;
            else
                fin = medio - 1;
        }
        return -1;
    }
}