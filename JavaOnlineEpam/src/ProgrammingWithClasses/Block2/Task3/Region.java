package ProgrammingWithClasses.Block2.Task3;

import java.util.Arrays;

public class Region {
    private String name;
    private int area;
    private int population;
    private District[] districts;

    public Region(String name, District[] districts) {
        this.name = name;
        int area = 0;
        for (int i = 0; i < districts.length; i++) {
            area += districts[i].getArea();
        }
        this.area = area;
        int population = 0;
        for (int i = 0; i < districts.length; i++) {
            population += districts[i].getPopulation();
        }
        this.population = population;
        this.districts = districts;
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", population=" + population +
                ", districts=" + Arrays.toString(districts) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }
}
