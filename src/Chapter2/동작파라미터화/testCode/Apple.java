package Chapter2.동작파라미터화.testCode;

public class Apple{
    private String name;
    private Color color;
    private int weight;

    public Apple(String name, Color color, int weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }
    public Color getColor(){
        return this.color;
    }
    public int getWeight(){ return this.weight;}
}
