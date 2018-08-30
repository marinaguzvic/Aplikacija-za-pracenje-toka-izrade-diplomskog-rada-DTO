/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.diplomskiraddtos;

/**
 *
 * @author Marina Guzvic
 */
public class KatedraDTO extends AbstractDTO{
     private Long katedraId;
    private String nazivKatedre;

    public KatedraDTO() {
    }

    public KatedraDTO(Long katedraId, String nazivKatedre) {
        this.katedraId = katedraId;
        this.nazivKatedre = nazivKatedre;
    }

    public Long getKatedraId() {
        return katedraId;
    }

    public void setKatedraId(Long katedraId) {
        this.katedraId = katedraId;
    }

    public String getNazivKatedre() {
        return nazivKatedre;
    }

    public void setNazivKatedre(String nazivKatedre) {
        this.nazivKatedre = nazivKatedre;
    }
    
    
}
