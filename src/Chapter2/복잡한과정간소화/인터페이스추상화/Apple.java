package Chapter2.복잡한과정간소화.인터페이스추상화;

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
