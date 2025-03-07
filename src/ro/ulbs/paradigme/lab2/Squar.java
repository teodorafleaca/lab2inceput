package ro.ulbs.paradigme.lab2;

public class Squar extends Form {

    private float side;

    public Squar(){

        super();
        this.side=0;
    }
    public Squar(String color, float side){
        super(color);
        this.side=side;
    }
    @Override
    public float getArea(){
        return side*side;
    }
    @Override
    public String toString(){
        return super.toString()+"\nSide "+side;
    }

}
