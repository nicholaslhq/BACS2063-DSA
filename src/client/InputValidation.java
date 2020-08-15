package client;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;

public class InputValidation {
    Scanner input = new Scanner(System.in);
    
    public int enterSelection(String prompt, int min, int max){
        int selection = 0;
        boolean validInput = false;
        
        do{
            try{
                System.out.print(prompt);
                selection = input.nextInt();
                
                if(selection < min || selection > max){
                    System.out.println("\n* Please enter a valid selection [" + min + " - " + max + "] *");
                    selection = enterSelection(prompt, min, max);
                }
                validInput = true;
            }catch(Exception ex){
                System.out.println("\n* Please enter a valid selection [" + min + " - " + max + "] *");
                input.nextLine();
            }
        }while(!validInput);
        
        return selection;
    }
    
    public String enterName(String prompt){
        System.out.print(prompt);
        String name = input.next();
        boolean validInput = Pattern.compile("^[a-zA-Z0-9]+$").matcher(name).matches();
        
        if (!validInput){
            System.out.println("\n* Please enter only alphanumeric *");
            name = enterName(prompt);
        }
        
        return name;
    }
    
    public void enterToContinue(){
        input.nextLine();
    }
}
