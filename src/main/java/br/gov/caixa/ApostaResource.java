package br.gov.caixa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/apostas")
public class ApostaResource {

    @GET
    @Path("efetivar")
    @Produces(MediaType.TEXT_PLAIN)
    public List<Integer> methodname() {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 600; i++) {
            numeros.add(random.nextInt(1000));
            numeros.sort(Comparator.naturalOrder());
        }
        int ate = random.nextInt(100000000);
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            Math.pow(Math.PI+ate, ate+100000000);
        }
        return numeros;
    }

    private int fibo(int nextInt) {
        if(nextInt == 1 || nextInt == 0) {
            return nextInt;
        }
        return nextInt + fibo(nextInt-1);
    }
}