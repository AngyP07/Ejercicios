package Semana1;

public class Ejercicio4 {
    public static String invertir(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

   public static boolean esPalindromo(String s) {
        s = s.toLowerCase().replaceAll("\\s+", "");// TODO: limpiar (toLowerCase, replaceAll espacios)
       String invertido = new StringBuilder(s)
               .reverse()
               .toString();
       // TODO: comparar con su version invertida
        return s.equals(invertido);
    }

    public static int contarVocales(String s) {
        int count = 0;
        String vocales = "aeiouAEIOU";
        for (int i =0; i < s.length(); i++){
            char letra = Character.toLowerCase(s.charAt(i));

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                count ++;
            }

        }
        return count;
    }

    public static String construirPiramide(int niveles) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= niveles; i++) {
            sb.append(" ".repeat(niveles - i));
            sb.append("*".repeat(2 * i - 1));
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Invertir 'Hola Mundo': "
                + invertir("Hola Mundo"));
        System.out.println("'Anita lava la tina' es palindromo: "
                + esPalindromo("Anita lava la tina"));
        System.out.println("Vocales en 'Murcielago': "
                + contarVocales("Murcielago"));
        System.out.println("Piramide de 5 niveles:");
        System.out.println(construirPiramide(5));
    }
}
