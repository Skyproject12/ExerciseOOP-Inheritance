/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmod4;

import java.util.ArrayList;

/**
 *
 * @author Praktikan
 */
public class Organizer {
//    ArrayList listKarnivora = new ArrayList<>();
//    ArrayList listHerbivora = new ArrayList<>();
//    ArrayList listOmnivora = new ArrayList<>();
//    ArrayList listTumbuhan = new ArrayList<>();
    private ArrayList<Karnivora> listKarnivora;
    private ArrayList<Herbivora> listHerbivora;
    private ArrayList<Omnivora> listOmnivora;
    private ArrayList<Tumbuhan> listTumbuhan;

    public Organizer() {
    }
    
    public void add(Karnivora karnivora){
        listKarnivora.add(karnivora);
    }
    public void add(Herbivora herbivora){
        listHerbivora.add(herbivora);
    }
    public void add(Omnivora omnivora){
        listOmnivora.add(omnivora);
    }
    public void add(Tumbuhan tumbuhan){
        listTumbuhan.add(tumbuhan);
    }

    public ArrayList getListKarnivora() {
        return listKarnivora;
    }

    public ArrayList getListHerbivora() {
        return listHerbivora;
    }

    public ArrayList getListOmnivora() {
        return listOmnivora;
    }

    public ArrayList getListTumbuhan() {
        return listTumbuhan;
    }
    public void displayOrganizer(){
        System.out.println("List Karnivora");
        for (int i = 0; i < listKarnivora.size(); i++) {
            listKarnivora.get(i).displayKarnivora(); 
        }
        System.out.println("List Herbivora");
        for (int i = 0; i < listHerbivora.size(); i++) {
            listHerbivora.get(i).displayHerbivora();
        }
        System.out.println("List Omnivora");
        for (int i = 0; i < listOmnivora.size(); i++) {
            listOmnivora.get(i).displayOmnivora();
        }
        System.out.println("List Tumbuhan");
        for (int i = 0; i < listTumbuhan.size(); i++) {
            listTumbuhan.get(i).displayTumbuhan();
        }
    }
}
