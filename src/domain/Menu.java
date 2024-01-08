package domain;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private String description;


    public Menu(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }


    public String toString() {
        return name + "\t\t\t| "+
                description;
    }
}
