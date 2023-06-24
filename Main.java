import Clases.SmartPhone;
import Clases.SmartWatch;

public class Main {
    public static void main(String[] args) {


        SmartPhone smartPhone = new SmartPhone();
        smartPhone.marca = "Samsung";
        smartPhone.modelo = "A 71";
        smartPhone.bateria = "5200 Mha";
        smartPhone.pantalla = "LCD";
        smartPhone.puertoCarga = "Tipo C";
        smartPhone.sistemaOperativo = "Android 11";
        smartPhone.peso = 163d;
        smartPhone.tamano = 6.5d;

        System.out.println(smartPhone + smartPhone.marca);


        SmartWatch smartWatch = new SmartWatch();
        smartWatch.duracionBat = "9 Horas";
        smartWatch.tipoCorrea = "Cuero";
        smartWatch.tiempoGarantia = "12 Meses";
        smartWatch.puertoCarga = "Micro";
        smartWatch.sistemaOperativo = "Android 10";
        smartWatch.resistenteAgua = true;
        smartWatch.marca = "LG";

        System.out.println(smartWatch);


    }
}