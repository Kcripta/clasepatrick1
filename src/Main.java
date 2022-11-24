public class Main {
    Import java.util.Scanner;
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc=new Scanner(System.in);

        int opcion;
        String frase;
        String frase2;
        char letra;
        do
        {
            System.out.println("------------------------------"
                    + "\n1. Elimina espacios en blanco."
                    + "\n2. Invierte cadena."
                    + "\n3. Concatena dos cadenas."
                    + "\n4. Busca una subcadena."
                    + "\n5. Mayúsculas."
                    + "\n6. Minúsculas."
                    + "\n7. Salir"
                    + "\n------------------------------");
            opcion=sc.nextInt();


        }
        while(!(opcion==7));
    }
}