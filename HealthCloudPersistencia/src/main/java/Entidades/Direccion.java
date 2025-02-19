/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author jrasc
 */
public class Direccion {
    
    private int id;
    private String calleYNum;
    private String colonia;
    private String municipio;

    public Direccion() {
    }

    public Direccion(String calleYNum, String colonia, String municipio) {
        this.calleYNum = calleYNum;
        this.colonia = colonia;
        this.municipio = municipio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalleYNum() {
        return calleYNum;
    }

    public void setCalleYNum(String calleYNum) {
        this.calleYNum = calleYNum;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }


}
