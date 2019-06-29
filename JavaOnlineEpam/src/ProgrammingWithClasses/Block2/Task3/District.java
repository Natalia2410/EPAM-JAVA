package ProgrammingWithClasses.Block2.Task3;

import java.util.Arrays;

public class District {
    private String name;
    private int area;
    private int population;
    private City[] cities;

    public District(String name, City[] cities) {
        this.name = name;
        int area = 0;
        for (int i = 0; i < cities.length; i++) {
            area += cities[i].getArea();
        }
        this.area = area;
        int population = 0;
        for (int i = 0; i < cities.length; i++) {
            population += cities[i].getPopulation();
        }

        this.population = population;
        this.cities = cities;
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

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", population=" + population +
                ", cities=" + Arrays.toString(cities) +
                '}';
    }
}
