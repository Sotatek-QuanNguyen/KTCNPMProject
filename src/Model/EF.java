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
public class EF {
    private int gtxhRUP;
    private int gtxhUDTT;
    private int gtxhHDT;
    private int gtxhLDN;
    private int gtxhTCND;
    private int gtxhODYC;
    private int gtxhNVBTG;
    private int gtxhNNLTK;
    private float EFWval;
    private float EFval;
    
    public static final float RUP = 1.5f;
    public static final float UDTT = 0.5f;
    public static final float HDT = 1f;
    public static final float LDN = 0.5f;
    public static final float TCND = 1f;
    public static final float ODYC = 2f;
    public static final float NVBTG = -1f;
    public static final float NNLTK = -1f;

    public EF(int gtxhRUP, int gtxhUDTT, int gtxhHDT, int gtxhLDN, int gtxhTCND, int gtxhODYC, int gtxhNVBTG, int gtxhNNLTK) {
        this.gtxhRUP = gtxhRUP;
        this.gtxhUDTT = gtxhUDTT;
        this.gtxhHDT = gtxhHDT;
        this.gtxhLDN = gtxhLDN;
        this.gtxhTCND = gtxhTCND;
        this.gtxhODYC = gtxhODYC;
        this.gtxhNVBTG = gtxhNVBTG;
        this.gtxhNNLTK = gtxhNNLTK;

        //calculated value
        this.EFWval = gtxhRUP*RUP + gtxhUDTT*UDTT + gtxhHDT*HDT + gtxhLDN*LDN + gtxhTCND*TCND + gtxhODYC*ODYC + gtxhNVBTG*NVBTG + gtxhNNLTK*NNLTK;
        this.EFval = 1.4f + (-0.03f*EFWval);
    }

    public int getGtxhRUP() {
        return gtxhRUP;
    }

    public void setGtxhRUP(int gtxhRUP) {
        this.gtxhRUP = gtxhRUP;
    }

    public int getGtxhUDTT() {
        return gtxhUDTT;
    }

    public void setGtxhUDTT(int gtxhUDTT) {
        this.gtxhUDTT = gtxhUDTT;
    }

    public int getGtxhHDT() {
        return gtxhHDT;
    }

    public void setGtxhHDT(int gtxhHDT) {
        this.gtxhHDT = gtxhHDT;
    }

    public int getGtxhLDN() {
        return gtxhLDN;
    }

    public void setGtxhLDN(int gtxhLDN) {
        this.gtxhLDN = gtxhLDN;
    }

    public int getGtxhTCND() {
        return gtxhTCND;
    }

    public void setGtxhTCND(int gtxhTCND) {
        this.gtxhTCND = gtxhTCND;
    }

    public int getGtxhODYC() {
        return gtxhODYC;
    }

    public void setGtxhODYC(int gtxhODYC) {
        this.gtxhODYC = gtxhODYC;
    }

    public int getGtxhNVBTG() {
        return gtxhNVBTG;
    }

    public void setGtxhNVBTG(int gtxhNVBTG) {
        this.gtxhNVBTG = gtxhNVBTG;
    }

    public int getGtxhNNLTK() {
        return gtxhNNLTK;
    }

    public void setGtxhNNLTK(int gtxhNNLTK) {
        this.gtxhNNLTK = gtxhNNLTK;
    }

    //return the results
    public float getEFWval() {
        this.EFWval = gtxhRUP*RUP + gtxhUDTT*UDTT + gtxhHDT*HDT + gtxhLDN*LDN + gtxhTCND*TCND + gtxhODYC*ODYC + gtxhNVBTG*NVBTG + gtxhNNLTK*NNLTK;
        return EFWval;
    }

    public float getEFval() {
        this.EFval = 1.4f + (-0.03f*this.getEFWval());
        return EFval;
    }

    public static void main(String[] args) {
        EF test = new EF(1,2,3,4,5,1,2,3);
        System.out.println(test.getEFWval());
    }
}
