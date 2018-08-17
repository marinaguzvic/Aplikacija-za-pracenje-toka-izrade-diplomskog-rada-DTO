/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.diplomskiraddtos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Marina Guzvic
 */
public class ClanSistemaDTO extends AbstractDTO{

    protected Long clanSistemaId;
    protected String brojTelefona;
    protected String ime;
    protected String prezime;
    protected String jmbg;
    protected String datumRodjenja;
    protected char tipClana;

    public ClanSistemaDTO() {
    }

    public ClanSistemaDTO(Long clanSistemaId, String brojTelefona, String ime, String prezime, String jmbg, String datumRodjenja, char tipClana) {
        this.clanSistemaId = clanSistemaId;
        this.brojTelefona = brojTelefona;
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.datumRodjenja = datumRodjenja;
        this.tipClana = tipClana;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Long getClanSistemaId() {
        return clanSistemaId;
    }

    public void setClanSistemaId(Long clanSistemaId) {
        this.clanSistemaId = clanSistemaId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(String datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public char getTipClana() {
        return tipClana;
    }

    public void setTipClana(char tipClana) {
        this.tipClana = tipClana;
    }

    public String getPropertyByName(String property) {

        switch (property) {
            case "Ime":
                return ime;
            case "Prezime":
                return prezime;

            case "Datum rođenja":
                return datumRodjenja == null? "":datumRodjenja.toString();
            case "JMBG":
                return jmbg;
            case "Broj telefona":
                return brojTelefona;
            default:
                return null;

        }
    }
    
    public List<String> getProperties(){
        List<String> list = new ArrayList<>();
        list.add("Ime");
        list.add("Prezime");
        list.add("Datum rođenja");
        list.add("JMBG");
        list.add("Broj telefona");
        return list;
    }
    
    public String getNazivTipaClana(){
        switch(tipClana){
            case 'S':return "Student";
            case 'N': return "Nastavnik";
            case 'R': return "Radnik u studentskoj službi";
            default: return "";
        }
    }
    
    public String getPotpisClana(){
        return getNazivTipaClana() + ": " + getIme() + " " + getPrezime();
    }
}
