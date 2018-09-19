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
public class ClanKaKlijentuDTO extends AbstractDTO{
    private int clanKomisijeRb;
     private String ulogaClanaKomisije;
    private NastavnikDTO nastavnikIdFk;

    public ClanKaKlijentuDTO() {
    }

    public ClanKaKlijentuDTO(int clanKomisijeRb,String ulogaClanaKomisije, NastavnikDTO nastavnik) {
        this.ulogaClanaKomisije = ulogaClanaKomisije;
        this.nastavnikIdFk = nastavnik;
        this.clanKomisijeRb = clanKomisijeRb;
    }

    public String getUlogaClanaKomisije() {
        return ulogaClanaKomisije;
    }

    public void setUlogaClanaKomisije(String ulogaClanaKomisije) {
        this.ulogaClanaKomisije = ulogaClanaKomisije;
    }

    public NastavnikDTO getNastavnikIdFk() {
        return nastavnikIdFk;
    }

    public void setNastavnikIdFk(NastavnikDTO nastavnikIdFk) {
        this.nastavnikIdFk = nastavnikIdFk;
    }

    public int getClanKomisijeRb() {
        return clanKomisijeRb;
    }

    public void setClanKomisijeRb(int clanKomisijeRb) {
        this.clanKomisijeRb = clanKomisijeRb;
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
