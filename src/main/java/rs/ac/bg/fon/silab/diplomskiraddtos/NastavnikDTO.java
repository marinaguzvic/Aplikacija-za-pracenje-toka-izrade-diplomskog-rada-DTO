/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.diplomskiraddtos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Marina Guzvic
 */
public class NastavnikDTO extends ClanSistemaDTO{
   
    private String zvanje;
    private String titula;
    private String katedra;

    public NastavnikDTO() {
    }
    
        public NastavnikDTO(Long clanSistemaId) {
            this.clanSistemaId = clanSistemaId;
    }

    public NastavnikDTO(Long clanSistemaId, String brojTelefona, String ime, String prezime, String jmbg, String datumRodjenja, String zvanje, String titula, String katedra) {
        this.clanSistemaId = clanSistemaId;
        this.brojTelefona = brojTelefona;
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.datumRodjenja = datumRodjenja;
        this.zvanje = zvanje;
        this.titula = titula;
        this.katedra = katedra;
    }

    

    

    

    public String getZvanje() {
        return zvanje;
    }

    public void setZvanje(String zvanje) {
        this.zvanje = zvanje;
    }

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    public String getKatedra() {
        return katedra;
    }

    public void setKatedra(String katedra) {
        this.katedra = katedra;
    }

    
        @Override
    public List<String> findProperties() {
        List<String> list = super.findProperties();
        list.add("Titula");
        list.add("Zvanje");
        list.add("Katedra");
        return list;
    }

    @Override
    public String findPropertyByName(String property) {
        String prop = super.findPropertyByName(property);
        if (prop != null) {
            return prop;
        } else {
            switch (property) {
                case "Titula":
                    return titula;
                case "Zvanje":
                    return zvanje;
                case "Katedra":
                    return katedra;
                default:
                    return null;

            }
        }
    }
    
    public boolean amongClanovi(List<ClanKaKlijentuDTO> clans){
        return clans.stream().anyMatch((clan) -> (Objects.equals(clan.getNastavnikIdFk().getClanSistemaId(), clanSistemaId)));
    }
}
