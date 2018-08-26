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
public class DokumentDTO {
    private int rb;
    private String nazivDokumenta;
    private String tipDokumenta;

    public DokumentDTO() {
    }

    public DokumentDTO(int rb, String nazivDokumenta, String tipDokumenta) {
        this.rb = rb;
        this.nazivDokumenta = nazivDokumenta;
        this.tipDokumenta = tipDokumenta;
    }

    public String getTipDokumenta() {
        return tipDokumenta;
    }

    public void setTipDokumenta(String tipDokumenta) {
        this.tipDokumenta = tipDokumenta;
    }

    public int getRb() {
        return rb;
    }

    public void setRb(int rb) {
        this.rb = rb;
    }

    public String getNazivDokumenta() {
        return nazivDokumenta;
    }

    public void setNazivDokumenta(String nazivDokumenta) {
        this.nazivDokumenta = nazivDokumenta;
    }
    
    public String generateUrl(){
        return "dokuments/" + getRb();
    }
}
