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
public class DokumentDownloadDTO extends AbstractDTO{
    private String nazivDokumenta;
    private String tipDokumenta;
    private byte[] sadrzajDokumenta;

    public DokumentDownloadDTO() {
    }

    public DokumentDownloadDTO(String nazivDokumenta, String tipDokumenta, byte[] sadrzajDokumenta) {
        this.nazivDokumenta = nazivDokumenta;
        this.tipDokumenta = tipDokumenta;
        this.sadrzajDokumenta = sadrzajDokumenta;
    }

    public String getNazivDokumenta() {
        return nazivDokumenta;
    }

    public void setNazivDokumenta(String nazivDokumenta) {
        this.nazivDokumenta = nazivDokumenta;
    }

    public String getTipDokumenta() {
        return tipDokumenta;
    }

    public void setTipDokumenta(String tipDokumenta) {
        this.tipDokumenta = tipDokumenta;
    }

    public byte[] getSadrzajDokumenta() {
        return sadrzajDokumenta;
    }

    public void setSadrzajDokumenta(byte[] sadrzajDokumenta) {
        this.sadrzajDokumenta = sadrzajDokumenta;
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
