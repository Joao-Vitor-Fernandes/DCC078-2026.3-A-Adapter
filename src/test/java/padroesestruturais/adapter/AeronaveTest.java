package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AeronaveTest {

    @Test
    void deveRetornarAltitudeEmPes() {
        Aeronave aeronave = new Aeronave();
        aeronave.setAltitude(35000);

        assertEquals(35000, aeronave.getAltitude(), 0.001);
    }

    @Test
    void deveConverterAltitudeParaMetros() {
        Aeronave aeronave = new Aeronave();
        aeronave.setAltitude(35000);

        assertEquals(10668.0, aeronave.getAltitudeEmMetros(), 0.001);
    }

}