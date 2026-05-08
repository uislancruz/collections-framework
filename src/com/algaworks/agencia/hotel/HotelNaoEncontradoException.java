package com.algaworks.agencia.hotel;

public class HotelNaoEncontradoException extends RuntimeException{
    public HotelNaoEncontradoException(String message) {
        super(message);
    }
}
