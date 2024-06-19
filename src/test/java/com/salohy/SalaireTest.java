package com.salohy;

import org.junit.Test;
import org.junit.Assert;
public class SalaireTest {
    @Test
    public void salaire_net_de_1_000_000_ariary(){
        var salaire = new Salaire(1_000_000);
        Assert.assertEquals(800_000, salaire.getNet());
    }

}
