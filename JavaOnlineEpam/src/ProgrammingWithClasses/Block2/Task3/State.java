package ProgrammingWithClasses.Block2.Task3;

import java.util.Arrays;

public class State {
    private String name;
    private int population;
    private Region[] regions;

    public State(String name, Region[] regions) {
        this.name = name;
        int population = 0;
        for (int i = 0; i < regions.length; i++) {
            population += regions[i].getPopulation();
        }
        this.population = population;
        this.regions = regions;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", regions=" + Arrays.toString(regions) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    public void printCapital() {
        for (int i = 0; i < regions.length; i++) {
            for (int j = 0; j < regions[i].getDistricts().length; j++) {
                for (int k = 0; k < regions[i].getDistricts()[j].getCities().length; k++) {
                    if (regions[i].getDistricts()[j].getCities()[k].isСapital() == true) {
                        System.out.println("The capital of " + name + " is " + regions[i].getDistricts()[j].getCities()[k]);
                    }
                }
            }
        }
    }

    public void printCountRegions() {
        System.out.println("Count regions " + regions.length);
    }

    public void printArea() {
        int s = 0;
        for (int i = 0; i < regions.length; i++) {
            s += regions[i].getArea();
        }
        System.out.println("area: " + s);
    }

    public void printRegionalCenter() {
        for (int i = 0; i < regions.length; i++) {
            for (int j = 0; j < regions[i].getDistricts().length; j++) {
                for (int k = 0; k < regions[i].getDistricts()[j].getCities().length; k++) {
                    if (regions[i].getDistricts()[j].getCities()[k].isRegionalCenter() == true) {
                        System.out.println(regions[i].getDistricts()[j].getCities()[k]);
                    }
                }
            }
        }
    }
}
