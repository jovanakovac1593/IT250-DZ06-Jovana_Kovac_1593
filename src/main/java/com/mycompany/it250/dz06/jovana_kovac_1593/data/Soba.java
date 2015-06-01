package com.mycompany.it250.dz06.jovana_kovac_1593.data;


import org.apache.tapestry5.ioc.annotations.Inject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Soba {
    
    private String imeSobe;
    private int sprat;
    private String internet;
    private String tv;
    private String djakuzi;
    
    @Inject
    public Soba(){
    }
    public Soba(String imeSobe, int sprat) {
        this.imeSobe = imeSobe;
        this.sprat = sprat;
        this.djakuzi = djakuzi;
        this.internet = internet;
        this.tv = tv;
    }

    /**
     * @return the imeSobe
     */
    public String getImeSobe() {
        return imeSobe;
    }

    /**
     * @param imeSobe the imeSobe to set
     */
    public void setImeSobe(String imeSobe) {
        this.imeSobe = imeSobe;
    }

    /**
     * @return the sprat
     */
    public int getSprat() {
        return sprat;
    }

    /**
     * @param sprat the sprat to set
     */
    public void setSprat(int sprat) {
        this.sprat = sprat;
    }

    /**
     * @return the internet
     */
    public String getInternet() {
        return internet;
    }

    /**
     * @param internet the internet to set
     */
    public void setInternet(String internet) {
        this.internet = internet;
    }

    /**
     * @return the tv
     */
    public String getTv() {
        return tv;
    }

    /**
     * @param tv the tv to set
     */
    public void setTv(String tv) {
        this.tv = tv;
    }

    /**
     * @return the djakuzi
     */
    public String getDjakuzi() {
        return djakuzi;
    }

    /**
     * @param djakuzi the djakuzi to set
     */
    public void setDjakuzi(String djakuzi) {
        this.djakuzi = djakuzi;
    }
    
}
