package com.gesiath.miniscrumapi.exception;

import java.io.Serial;

public class CustomDataNotFoundException  extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 4403621136597115729L;

    public  CustomDataNotFoundException(){

        super();

    }

    public CustomDataNotFoundException(String message){

        super(message);

    }

}
