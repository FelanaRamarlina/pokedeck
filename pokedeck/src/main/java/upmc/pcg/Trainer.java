/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg;

/**
 *
 * @author adminRAF
 */
public class Trainer extends Card
{
    private String trainerType;
    private String trainerTextBox;
    private String trainerRule;

    public Trainer(String trainerType, String trainerTextBox, String trainerRule, int number, String name) 
    {
        super(number, name);
        this.trainerType = trainerType;
        this.trainerTextBox = trainerTextBox;
        this.trainerRule = trainerRule;
    }

    public Trainer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public String toString()
    {
        return "Trainer : "+this.trainerType+"\n\nTextBox : \n"+this.toString()+this.trainerTextBox+"\n\n Trainer rule :\n"+this.trainerRule+"\n\n";
    }
         
}
