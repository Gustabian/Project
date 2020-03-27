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
    public String result(ModelProgram mp){
        return "Hallo " +mp.getName();
    }
    
    public String result(ModelProgram mp, String health){
        String health_status = modelProgram.returnHealth(health);
        
        return "Hallo " +mp.getName()+ " \n Terkena Penyakit "
                + health_status;
    }
    public Boolean checkName(String name){
        Pattern pattern = Pattern.compile("^([a-zA-Z0-9\\-\\.]+)@([a-zA-Z0-9-"
                + "\\-\\.]+)\\.([a-zA-Z]{2,5})$");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}

