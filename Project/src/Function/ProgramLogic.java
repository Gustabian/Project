/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.Function;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import project.Model.ModelProgram;

/**
 *
 * @author Abner
 */
public class ProgramLogic extends ModelProgram{
     ModelProgram modelProgram = new ModelProgram();
    
    public String result(String health, String gender, 
            ModelProgram mp){
        
        String noun = modelProgram.returnGenderNoun(gender);
        String health_Status = modelProgram.returnHealth(health);
        
        return "Hallo " +mp.getName()+
                ".\n" + noun + " Terkena Penyakit " + health_Status;
    }
}