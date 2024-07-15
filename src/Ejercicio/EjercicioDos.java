package Ejercicio;
import java.util.ArrayList;
import java.util.List;
/*
 * Dados n pares de paréntesis, implementa un algoritmo para generar todas las combinaciones
 * válidas de paréntesis.
 *
 * Ejemplo 1:
 *  Input:
 *    n: 1
 *  Output:
 *    ["()"]
 *
 * Ejemplo 2:
 *  Input:
 *    n: 3
 *  Output:
 *    ["((()))","(()())","(())()","()(())","()()()"]
 *
 * Ecoja la mejor estructura de datos para que sea mas eficiente
 * Se debe usar StringBuilder
 */
public class EjercicioDos {

    public List<String> generateParenthesis(int n) {
        List<List<String>> lista = new ArrayList<>();
        lista.add(new ArrayList<>());
        lista.get(0).add("");

        for (int i = 1; i <= n; i++) {
            List<String> lista2 = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                List<String> first = lista.get(j);
                List<String> second = lista.get(i - 1 - j);
                for (String x : first) {
                    for (String y : second) {
                        lista2.add("(" + x + ")" + y);
                    }
                }
            }
            lista.add(lista2);
        }
        return lista.get(n);

    }

}
