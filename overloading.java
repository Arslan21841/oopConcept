// Example of method overloading
package oopconcept;
public class overloading {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
        public static void main(String args[])
        {
            overloading ol=new overloading();
            ol.add(2, 3);
            ol.add(20.25, 30);
        }
}


