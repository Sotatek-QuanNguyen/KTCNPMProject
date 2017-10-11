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
    private float gtxhRUP;
    private float gtxhUDTT;
    private float gtxhHDT;
    private float gtxhLDN;
    private float gtxhTCND;
    private float gtxhODYC;
    private float gtxhNVBTG;
    private float gtxhNNLTK;
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

    public EF(float gtxhRUP, float gtxhUDTT, float gtxhHDT, float gtxhLDN, float gtxhTCND, float gtxhODYC, float gtxhNVBTG, float gtxhNNLTK) {
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

    public float getGtxhRUP() {
        return gtxhRUP;
    }

    public void setGtxhRUP(float gtxhRUP) {
        this.gtxhRUP = gtxhRUP;
    }

    public float getGtxhUDTT() {
        return gtxhUDTT;
    }

    public void setGtxhUDTT(float gtxhUDTT) {
        this.gtxhUDTT = gtxhUDTT;
    }

    public float getGtxhHDT() {
        return gtxhHDT;
    }

    public void setGtxhHDT(float gtxhHDT) {
        this.gtxhHDT = gtxhHDT;
    }

    public float getGtxhLDN() {
        return gtxhLDN;
    }

    public void setGtxhLDN(float gtxhLDN) {
        this.gtxhLDN = gtxhLDN;
    }

    public float getGtxhTCND() {
        return gtxhTCND;
    }

    public void setGtxhTCND(float gtxhTCND) {
        this.gtxhTCND = gtxhTCND;
    }

    public float getGtxhODYC() {
        return gtxhODYC;
    }

    public void setGtxhODYC(float gtxhODYC) {
        this.gtxhODYC = gtxhODYC;
    }

    public float getGtxhNVBTG() {
        return gtxhNVBTG;
    }

    public void setGtxhNVBTG(float gtxhNVBTG) {
        this.gtxhNVBTG = gtxhNVBTG;
    }

    public float getGtxhNNLTK() {
        return gtxhNNLTK;
    }

    public void setGtxhNNLTK(float gtxhNNLTK) {
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
    }
}
