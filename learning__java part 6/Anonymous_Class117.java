package com.mycompany.java__part.six;

public class Anonymous_Class117 {

    public static void main(String[] args) {
        
        // this is anonymous class exxx
        
        Passons p = new Passons(){
            
            @Override
            void display(){
                System.out.println("This overriden class ! ..");
            }
        };
        
        p.display();
    }

}
