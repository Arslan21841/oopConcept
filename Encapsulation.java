//Example Of Encapsulation
package oopconcept;
public class Encapsulation {
     private int privateVariable;
    public void setPrivateVariable(int value) {
        this.privateVariable = value;
    }
     public int getPrivateVariable() {
        return privateVariable;
    }

    public static void main(String[] args){  
//creating instance of the encapsulated class  
Encapsulation en=new Encapsulation();  
en.setPrivateVariable(10);  
System.out.println(en.getPrivateVariable());  
} 
    
}
