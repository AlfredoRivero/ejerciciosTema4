package Clases;

public class SmartDevice {

    public String pantalla;
    public String bateria;
    public String puertoCarga;
    public  String sistemaOperativo;
    public boolean resistenteAgua;
    public double peso;
    public double tamano;
    public String marca;

    public SmartDevice() {
    }

    public SmartDevice(String pantalla, String puertoCarga,
                       String sistemaOperativo, boolean resistenteAgua,
                       String marca) {
        this.pantalla = pantalla;
        this.puertoCarga = puertoCarga;
        this.sistemaOperativo = sistemaOperativo;
        this.resistenteAgua = resistenteAgua;
        this.marca = marca;
    }

    public SmartDevice(String pantalla, String bateria,
                       String puertoCarga, String sistemaOperativo,
                       boolean resistenteAgua, int peso, double tamano,
                       String marca) {
        this.pantalla = pantalla;
        this.bateria = bateria;
        this.puertoCarga = puertoCarga;
        this.sistemaOperativo = sistemaOperativo;
        this.resistenteAgua = resistenteAgua;
        this.peso = peso;
        this.tamano = tamano;
        this.marca = marca;
    }
}
