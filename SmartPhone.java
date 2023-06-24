package Clases;

public class SmartPhone extends SmartDevice {

    public String radio;
    public boolean audifono;
    public boolean bluetooth;
    public String modelo;

       public SmartPhone() {
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "SmartPhone: " +'\n'+
                "modelo = " + modelo + '\n'+
                "pantalla = " + pantalla + '\n' +
                "bateria = " + bateria + '\n' +
                "puertoCarga = " + puertoCarga + '\n' +
                "sistemaOperativo = " + sistemaOperativo + '\n' +
                "peso = " + peso +'\n'+
                "tamano = " + tamano +'\n';
    }
}
