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
public abstract class AbstractDTO {
    public abstract List<String> findProperties();
    public abstract List<String> findCrucialProperties();
    public abstract String findPropertyByName(String property);
}
