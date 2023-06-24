public class Main {
    public static void main(String[] args) {

        System.out.println("----Condicional if------.");

        var numero = 5;

        if (numero > 0) {
            System.out.println(" El numero es: Positivo ");
        } else {

            System.out.println(" El numero es: Negativo");
        }

        System.out.println("------------------------.");
        System.out.println("------Bucle While-------.");
       var numeroWhile = 0;

        while (numeroWhile <=3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;

        }
        System.out.println("------------------------.");
        System.out.println("------Bucle Do While----.");


        var numeroDoWhile = 2;

        do {
            System.out.println( numeroDoWhile);
            numeroDoWhile = numeroDoWhile -1;
        } while ( numeroDoWhile > 0);
        System.out.println("------------------------.");
        System.out.println("------Ciclo For---------.");


        var numeroFor = 0;

        for (numeroFor =1; numeroFor <= 3; numeroFor ++) {
            System.out.println(numeroFor);
        }
        System.out.println("------------------------.");
        System.out.println("------Switch Case-------.");

        var estacion = "verano";

        switch (estacion) {
            case "otoño":
                System.out.println(" Es la Estacion de: Otoño");

                break;

            case "invierno":
                System.out.println(" Es la Estacion de: Invierno");

                break;
            case "verano":
                System.out.println("Es la Estacion de: Verano");

                break;
            case "primavera":

                System.out.println(" Es la Estacion de: Primavera");
                break;

            default:
                System.out.println(" No es una Estacion del año");
                break;
        }
        System.out.println("------------------------.");

    }
}