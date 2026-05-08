package com.algaworks.agencia;

import com.algaworks.agencia.megasena.Sorteador;

import java.util.Iterator;

public class PrincipalMegaSena {
    static void main(String[] args) {
        Sorteador sorteador = new Sorteador();

        for (Integer i : sorteador) {
            System.out.println(i);
        }

    }
}
