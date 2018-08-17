/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.diplomskiraddtos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Marina Guzvic
 */
public class RadnikDTO extends ClanSistemaDTO {

    private String radnoMesto;

    public String getRadnoMesto() {
        return radnoMesto;
    }

    public void setRadnoMesto(String radnoMesto) {
        this.radnoMesto = radnoMesto;
    }

    @Override
    public List<String> getProperties() {
        List<String> list = super.getProperties();
        list.add("Radno mesto");
        return list;
    }

    @Override
    public String getPropertyByName(String property) {
        String prop = super.getPropertyByName(property);
        if (prop != null) {
            return prop;
        } else {
            switch (property) {
                case "Radno mesto":
                    return radnoMesto;
                default:
                    return null;

            }
        }
    }
}
