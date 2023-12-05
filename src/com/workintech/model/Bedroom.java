package com.workintech.model;

public class Bedroom extends Room {

    private Wardrope wardrope ;
    private Carpet carpet;
    private Bed bed;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp, Wardrope wardrope, Carpet carpet, Bed bed) {
        super(name, wall1, wall2, wall3, wall4, ceiling, lamp);
        this.wardrope = wardrope;
        this.carpet = carpet;
        this.bed = bed;
    }

    public Wardrope getWardrope() {
        return wardrope;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Bed getBed() {
        return bed;
    }
}

    //Boilerplate code

}
