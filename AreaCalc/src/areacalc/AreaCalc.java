/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacalc;

/**
 *
 * @author DESTINY
 */
public class AreaCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        rectangle rc = new rectangle();
        rc.area(12, 14);
        
        circle c = new circle();
        c.area(14, 12);
        
    }
    
}


abstract class figure{
    abstract void area(int dim1, int dim2);
}


class rectangle extends figure{
    @Override
    void area(int dim1, int dim2){
        System.out.println("Area"+(dim1*dim2));
    }
}


class circle extends figure{
    @Override
    void area(int dim1, int dim2){
        System.out.println("Area"+(dim1*dim2/2));
    }
}


