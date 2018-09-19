/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.diplomskiraddtos;

import java.util.Date;
import java.util.List;

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

    @Override
    public List<String> findProperties() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> findCrucialProperties() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String findPropertyByName(String property) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
