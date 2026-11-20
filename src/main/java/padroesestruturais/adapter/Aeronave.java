package padroesestruturais.adapter;

public class Aeronave {

    IAltitude altitude;
    AltitudeAdapter persistencia;

    public Aeronave() {
        altitude = new AltitudePes();
        persistencia = new AltitudeAdapter(altitude);
    }

    public void setAltitude(double pes) {
        altitude.setAltitude(pes);
        persistencia.salvarAltitude();
    }

    public double getAltitude() {
        return persistencia.recuperarAltitude();
    }

    // Metodo apenas para mostrar que está convertendo pés para metros através do adaptador
    public double getAltitudeEmMetros() {
        return persistencia.getMetros();
    }
}