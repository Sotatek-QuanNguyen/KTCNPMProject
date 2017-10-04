/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author nguye
 */
public class TBF {
    private int slB1;
    private int slB2;
    private int slB3;
    private int slM1;
    private int slM2;
    private int slM3;
    private int slT1;
    private int slT2;
    private int slT3;
    private float TBFval;
    
    public static final float B1 = 5; 
    public static final float B2 = 10; 
    public static final float B3 = 15; 
    public static final float M1 = 5*1.2f; 
    public static final float M2 = 10*1.2f; 
    public static final float M3 = 15*1.2f; 
    public static final float T1 = 5*1.5f; 
    public static final float T2 = 10*1.5f; 
    public static final float T3 = 15*1.5f;

    public TBF(int slB1, int slB2, int slB3, int slM1, int slM2, int slM3, int slT1, int slT2, int slT3) {
        this.slB1 = slB1;
        this.slB2 = slB2;
        this.slB3 = slB3;
        this.slM1 = slM1;
        this.slM2 = slM2;
        this.slM3 = slM3;
        this.slT1 = slT1;
        this.slT2 = slT2;
        this.slT3 = slT3;
        
        //calculated value
        this.TBFval = B1*slB1 + B2*slB2 + B3*slB3 + M1*slM1 + M2*slM2 + M3*slM3 + T1*slT1 + T2*slT2 + T3*slT3;
    }

    public int getSlB1() {
        return slB1;
    }

    public void setSlB1(int slB1) {
        this.slB1 = slB1;
    }

    public int getSlB2() {
        return slB2;
    }

    public void setSlB2(int slB2) {
        this.slB2 = slB2;
    }

    public int getSlB3() {
        return slB3;
    }

    public void setSlB3(int slB3) {
        this.slB3 = slB3;
    }

    public int getSlM1() {
        return slM1;
    }

    public void setSlM1(int slM1) {
        this.slM1 = slM1;
    }

    public int getSlM2() {
        return slM2;
    }

    public void setSlM2(int slM2) {
        this.slM2 = slM2;
    }

    public int getSlM3() {
        return slM3;
    }

    public void setSlM3(int slM3) {
        this.slM3 = slM3;
    }

    public int getSlT1() {
        return slT1;
    }

    public void setSlT1(int slT1) {
        this.slT1 = slT1;
    }

    public int getSlT2() {
        return slT2;
    }

    public void setSlT2(int slT2) {
        this.slT2 = slT2;
    }

    public int getSlT3() {
        return slT3;
    }

    public void setSlT3(int slT3) {
        this.slT3 = slT3;
    }
    
    //return the results
    public float getTBFval() {
        this.TBFval = B1*slB1 + B2*slB2 + B3*slB3 + M1*slM1 + M2*slM2 + M3*slM3 + T1*slT1 + T2*slT2 + T3*slT3;
        return TBFval;
    }
    
}
