/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author dimmi
 */
public class DataGraphDumitru {
    private String nomTrader;
    private int nbActions;
    
    public DataGraphDumitru(String unNomTrader, int unNbActions){
        nomTrader = unNomTrader;
        nbActions = unNbActions;
    }

    /**
     * @return the nomTrader
     */
    public String getNomTrader() {
        return nomTrader;
    }

    /**
     * @return the nbActions
     */
    public int getNbActions() {
        return nbActions;
    }
}
