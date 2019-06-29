package ProgrammingWithClasses.Block2.Task3;

public class City {
    private String name;
    private int population;
    private int area;
    private boolean isСapital;
    private boolean regionalCenter;

    public City(String name, int population, int area, boolean isСapital, boolean regionalCenter) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.isСapital = isСapital;
        this.regionalCenter = regionalCenter;
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

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public boolean isСapital() {
        return isСapital;
    }

    public void setСapital(boolean сapital) {
        isСapital = сapital;
    }

    public boolean isRegionalCenter() {
        return regionalCenter;
    }

    public void setRegionalCenter(boolean regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", area=" + area +
                '}';
    }
}
