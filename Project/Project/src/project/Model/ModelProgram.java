/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.Model;

/**
 *
 * @author Abner
 */
public class ModelProgram {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public String label = "Selamat Datang Di Program Kami"
            + ", Tolong Masukan Data Anda";
    
    public String returnGenderNoun(String gender){
        String noun = "Anda";
   
        if(gender.toLowerCase().equals("female")){
            noun = "Anda";
        }
        
        return noun;
    }
    
    public String returnHealth(String health){
        switch(health){
            case "Demam >38C, Batuk, Nafas Taknormal/Sesak, Dahak Kental, Lemas, Sinar X":
                return "Virus Corona";
            case "Demam, Batuk, Hidung Meler, Bersin, Muntah, Diare, Otot Nyeri":
                return "Influenza";
            case "Batuk, Hidung Tersumbat, Bersin, Radang":
                return "Flu Biasa";
            default:
                return "Lain";
        }
    }
}

        
    
       
    


