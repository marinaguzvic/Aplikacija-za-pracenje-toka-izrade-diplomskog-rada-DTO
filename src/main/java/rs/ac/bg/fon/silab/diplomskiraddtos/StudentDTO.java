/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.diplomskiraddtos;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import jdk.nashorn.internal.runtime.arrays.ArrayData;

/**
 *
 * @author Marina Guzvic
 */
public class StudentDTO extends ClanSistemaDTO {

    private String brojIndeksa;
    private Integer godinaStudija;

    public StudentDTO() {
    }

    public StudentDTO(Long clanSistemaId, String brojTelefona, String ime, String prezime, String jmbg, String datumRodjenja, String brojIndeksa, Integer godinaStudija) {
        this.clanSistemaId = clanSistemaId;
        this.brojTelefona = brojTelefona;
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.datumRodjenja = datumRodjenja;
        this.brojIndeksa = brojIndeksa;
        this.godinaStudija = godinaStudija;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public Integer getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(Integer godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    @Override
    public List<String> getProperties() {
        List<String> list = super.getProperties();
        list.add("Broj indeksa");
        list.add("Godina studija");
        return list;
    }
    
    @Override
    public List<String> getCrucialProperties() {
        List<String> list = super.getCrucialProperties();
        list.add("Broj indeksa");
        return list;
    }

    @Override
    public String getPropertyByName(String property) {
        String prop = super.getPropertyByName(property);
        if (prop != null) {
            return prop;
        } else {
            switch (property) {
                case "Broj indeksa":
                    return brojIndeksa;
                case "Godina studija":
                    return godinaStudija + "";
                default:
                    return null;

            }
        }
    }
}
