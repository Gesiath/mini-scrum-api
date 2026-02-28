package com.gesiath.miniscrumapi.service;

import com.gesiath.miniscrumapi.exception.CustomDataNotFoundException;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValidatorService {

    public void notNullObject(Object value, String name){

        if(value == null){

            throw new CustomDataNotFoundException(name + " can't be null.");

        }

    }



    public void notNullObjects(@NonNull List<Object> values, List<String> names) {
        for(int i = 0; i < values.size(); i++) {
            if(values.get(i) == null)
                throw new CustomDataNotFoundException(names.get(i) + " can't be null");
        }

    }

}
