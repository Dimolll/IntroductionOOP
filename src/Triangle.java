public class Triangle {

    private double AB;
    private double BC;
    private double AC;

    public Triangle(double AB,double BC, double AC) {
        if (checkTriangle(AB, BC, AC)) {
            this.AB = AB;
            this.BC = BC;
            this.AC = AC;
        } else {
            System.out.println("Error. It's not triangle");
        }
    }

    private boolean checkTriangle(double AB,double BC, double AC){
        return ((AB+BC)>AC) && ((AB+AC)>BC) && ((BC+AC)>AB);
    }

    public double Square(){
        double p=(AB+BC+AC)/2;
        return Math.sqrt(p*(p-AB)*(p-BC)*(p-AC));
    }
}
