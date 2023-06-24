package Clases;

public class SmartWatch extends SmartDevice{
    public String duracionBat;
    public String tipoCorrea;
    public String tiempoGarantia;



    public SmartWatch (){
        }

    @Override
    public String toString() {
        return "SmartWatch: " +'\n'+
                "duracionBat = " + duracionBat + '\n' +
                "tipoCorrea = " + tipoCorrea + '\n' +
                "tiempoGarantia = " + tiempoGarantia + '\n' +
                "puertoCarga = " + puertoCarga + '\n' +
                "sistemaOperativo = " + sistemaOperativo + '\n' +
                "resistenteAgua = " + resistenteAgua +'\n'+
                "marca = " + marca + '\n' ;
    }
}
