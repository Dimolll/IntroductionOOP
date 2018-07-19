public class Triangle {

    private double ab;
    private double bc;
    private double ac;

    public Triangle(double ab, double bc, double ac) {
        if (checkTriangle(ab, bc, ac)) {
            this.ab = ab;
            this.bc = bc;
            this.ac = ac;
        } else {
            System.out.println("Error. It's not triangle");
        }
    }

    public Triangle(){}

    private boolean checkTriangle(double AB,double BC, double AC){
        return ((AB+BC)>AC) && ((AB+AC)>BC) && ((BC+AC)>AB);
    }

    public double square(){
        double p=(ab + bc + ac)/2;
        return Math.sqrt(p*(p- ab)*(p- bc)*(p- ac));
    }
}
