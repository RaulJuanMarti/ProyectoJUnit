import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestEnt {
    @Test
    void suma(){
        Suma suma = new Suma(10,10);
        suma.incrementar();
        assertEquals(100,suma.getSuma());
    }
    @Test
    void resta(){
        Resta resta = new Resta(12,11);
        resta.decrementar();
        assertEquals(100,resta.getDiferencia());
    }

}