/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.zaverecnyprojekt;

/**
 *
 * @author estra
 */
public class ZaverecnyProjekt {


    public static void main(String[] args) {
        SpravaPojisteni spravaPojisteni = new SpravaPojisteni();

        Poisteny poisteny1 = new Poisteny("Jan", "Novak", 30, "123456789");
        Poisteny poisteny2 = new Poisteny("Marie", "Svobodova", 25, "987654321");

        spravaPojisteni.pridatPoisteneho(poisteny1);
        spravaPojisteni.pridatPoisteneho(poisteny2);

        System.out.println("Seznam pojištěných:");
        for (Poisteny poisteny : spravaPojisteni.getSeznamPojistenych()) {
            System.out.println(poisteny);
        }

        String hledaneJmeno = "Jan";
        String hledanePrijmeni = "Novak";
        Poisteny nalezenyPoisteny = spravaPojisteni.najitPoisteneho(hledaneJmeno, hledanePrijmeni);
        if (nalezenyPoisteny != null) {
            System.out.println("Nalezený pojištěný: " + nalezenyPoisteny);
        } else {
            System.out.println("Pojištěný nenalezen.");
        }}}
