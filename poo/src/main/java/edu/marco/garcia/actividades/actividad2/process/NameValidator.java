package edu.marco.garcia.actividades.actividad2.process;

import edu.marco.garcia.actividades.actividad2.data.Data;

public class NameValidator {
    public static boolean validateName(String name){
        String storedName = name.toLowerCase();
        boolean isValid = false;
        for(String nameToValidate: Data.nombres){
            if(nameToValidate.toLowerCase().equals(storedName)){
                isValid = true;
                break;
            }
        }
        return isValid;
    }
}
