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
public class ClanDTO extends AbstractDTO{
    private String ulogaClanaKomisije;
    private NastavnikDTO nastavnik;

    public ClanDTO() {
    }

    public ClanDTO(String ulogaClanaKomisije, NastavnikDTO nastavnik) {
        this.ulogaClanaKomisije = ulogaClanaKomisije;
        this.nastavnik = nastavnik;
    }

    



    public NastavnikDTO getNastavnik() {
        return nastavnik;
    }

    public void setNastavnik(NastavnikDTO nastavnik) {
        this.nastavnik = nastavnik;
    }

    public String getUlogaClanaKomisije() {
        return ulogaClanaKomisije;
    }

    public void setUlogaClanaKomisije(String ulogaClanaKomisije) {
        this.ulogaClanaKomisije = ulogaClanaKomisije;
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
