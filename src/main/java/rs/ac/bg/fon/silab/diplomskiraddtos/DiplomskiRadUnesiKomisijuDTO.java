/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.diplomskiraddtos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marina Guzvic
 */
public class DiplomskiRadUnesiKomisijuDTO extends AbstractDTO {
        private List<ClanDTO> clans;

    public DiplomskiRadUnesiKomisijuDTO() {
        clans = new ArrayList<>();
    }

    public DiplomskiRadUnesiKomisijuDTO(List<ClanDTO> clans) {
        this.clans = clans;
    }



    public List<ClanDTO> getClans() {
        return clans;
    }

    public void setClans(List<ClanDTO> clans) {
        this.clans = clans;
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
