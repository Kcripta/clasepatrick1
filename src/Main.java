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
            switch(opcion)
            {
                case 1:
                    System.out.println("Introduce una frase o palabra");
                    frase = sc.nextLine();
                    frase = sc.nextLine();

                    String fraseCambiado = frase.replace(" ", "");
                    System.out.println(fraseCambiado);
                    break;
                case 2:
                    System.out.println("Introduce una frase o palabra");
                    frase=sc.nextLine();
                    frase=sc.nextLine();

                    int longitud = frase.length()-1;
                    for(;longitud>=0;)
                    {
                        letra= frase.charAt(longitud);
                        System.out.print(letra);
                        longitud--;
                    }
                    break;
                case 3:
                    System.out.println("Introduce una frase o palabra");
                    frase=sc.nextLine();
                    frase=sc.nextLine();
                    System.out.println("Introduce otra frase o palabra");
                    frase2=sc.nextLine();
                    System.out.println(frase+frase2);
                    break;
            }

        }
        while(!(opcion==7));

    }
}