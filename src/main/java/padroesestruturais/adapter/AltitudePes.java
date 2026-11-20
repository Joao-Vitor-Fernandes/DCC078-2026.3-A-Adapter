package padroesestruturais.adapter;

public class AltitudePes implements IAltitude {

    private double pes;

    @Override
    public double getAltitude() {
        return this.pes;
    }

    @Override
    public void setAltitude(double pes) {
        if (pes < 0)
            throw new IllegalArgumentException("A altitude em pés não pode ser negativa.");
        this.pes = pes;
    }
}