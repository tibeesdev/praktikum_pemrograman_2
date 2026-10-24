package modul5.soal1;

public class Sphere extends Shape{
    private double radius;
    public Sphere(Double r){
        super("Sphere");
        this.radius = r;
    }

    @Override
    public double area(){
        return 4*Math.PI*(radius*radius);
    }

    @Override
    public String tostring() {
        return super.tostring() + " of radius " + radius;
    }
}
