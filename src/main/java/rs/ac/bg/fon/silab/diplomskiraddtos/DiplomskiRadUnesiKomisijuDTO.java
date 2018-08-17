/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.diplomskiraddtos;

import java.util.List;

/**
 *
 * @author Marina Guzvic
 */
public class DiplomskiRadUnesiKomisijuDTO extends AbstractDTO {
        private List<ClanDTO> clans;

    public DiplomskiRadUnesiKomisijuDTO() {
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
        
        
}
