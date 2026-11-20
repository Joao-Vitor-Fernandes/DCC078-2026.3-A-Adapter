package padroesestruturais.adapter;

public class AltitudeAdapter extends AltitudeMetros {

    private IAltitude altitudePes;

    public AltitudeAdapter(IAltitude altitudePes) {
        this.altitudePes = altitudePes;
    }

    // Pés -> metros
    public void salvarAltitude() {
        this.setMetros(altitudePes.getAltitude() * 0.3048);
    }

    // Metros -> pés
    public double recuperarAltitude() {
        altitudePes.setAltitude(this.getMetros() / 0.3048);
        return altitudePes.getAltitude();
    }
}