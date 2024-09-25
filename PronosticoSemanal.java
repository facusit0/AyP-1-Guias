/**
 * Clase representa el pronósticos de temperaturas para la próxima semana.
 */
public class PronosticoSemanal {

    private double[] temperaturas = new double[7];

    /**
     * post: deja inicializadas las temperaturas del pronóstico en 25 ºC.
     */
    public PronosticoSemanal() {

        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = 25.0;
        }
    }

    /**
     * pre : recibe el número de día de la semana comprendido entre 1 y 7,
     * siendo 1 lunes y 7 domingo.
     * post: devuelve la temperatura pronosticada para el día indicado.
     */
    public double obtenerTemperatura(int dia) {
        if (dia < 1 || dia > temperaturas.length) {
            System.out.println("Dia inválido, elija un día entre 1 y 7");
        }

        return temperaturas[dia - 1];
    }

    /**
     * pre : recibe el número de día de la semana comprendido entre 1 y 7,
     * siendo 1 lunes y 7 domingo.
     * post: cambia la temperatura pronosticada para el día indicado.
     */
    public void pronosticarTemperatura(int dia, double temperatura) {
        if (dia < 1 || dia > temperaturas.length) {
            System.out.println("El dia debe estar entre 1 y 7");
        }
        temperaturas[dia - 1] = temperatura;
    }

    /**
     * post: devuelve el promedio de las temperaturas pronosticadas.
     */
    public double calcularPromedioDeTemperaturas() {
        double suma = 0;

        for (int i = 0; i < temperaturas.length; i++) {

            suma += temperaturas[i];

        }

        return suma / temperaturas.length;
    }

    /**
     * post: devuelve la máxima temperatura pronosticada.
     */
    public double buscarMaximaTemperatura() {

        double aux = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > aux) {
                aux = temperaturas[i];
            }

        }
        return aux;
    }

    /**
     * post: devuelve el día de máxima temperatura pronosticada.
     * (Para intrépidos: En caso de repetirse, devolver todos.)
     */
    public int buscarDiaDeMaximaTemperatura() {
        double maxTemp = temperaturas[0];
        int dia = 0;
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maxTemp) {
                maxTemp = temperaturas[i];
                dia = i;
            }
        }

        return dia + 1;
    }

    /**
     * post: devuelve la mínima temperatura pronosticada.
     */
    public double buscarMinimaTemperatura() {
        double minTemp = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] < minTemp) {
                minTemp = temperaturas[i];

            }
        }

        return minTemp;
    }

}