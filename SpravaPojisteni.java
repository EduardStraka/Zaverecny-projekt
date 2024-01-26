/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnyprojekt;
import java.util.ArrayList;
import java.util.List;

public class SpravaPojisteni {
    private List<Poisteny> seznamPojistenych;

    public SpravaPojisteni() {
        seznamPojistenych = new ArrayList<>();
    }

    public void pridatPoisteneho(Poisteny poisteny) {
        seznamPojistenych.add(poisteny);
    }

    public List<Poisteny> getSeznamPojistenych() {
        return seznamPojistenych;
    }

    public Poisteny najitPoisteneho(String jmeno, String prijmeni) {
        for (Poisteny poisteny : seznamPojistenych) {
            if (poisteny.getJmeno().equals(jmeno) && poisteny.getPrijmeni().equals(prijmeni)) {
                return poisteny;
            }
        }
        return null;
    }
}
