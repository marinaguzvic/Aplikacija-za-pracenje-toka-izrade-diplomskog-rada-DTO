/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.diplomskiraddtos;

import java.util.Date;

/**
 *
 * @author Marina Guzvic
 */
public class DiplomskiRadDatumOdbraneDTO extends AbstractDTO {
    private String datumOdbrane;

    public DiplomskiRadDatumOdbraneDTO() {
    }

    public DiplomskiRadDatumOdbraneDTO(String datumOdbrane) {
        this.datumOdbrane = datumOdbrane;
    }
    
    public String getDatumOdbrane() {
        return datumOdbrane;
    }

    public void setDatumOdbrane(String datumOdbrane) {
        this.datumOdbrane = datumOdbrane;
    }
    
}
