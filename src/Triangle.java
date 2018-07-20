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

    private boolean checkTriangle(double ab,double bc, double ac){
        return ((ab+bc)>ac) && ((ab+ac)>bc) && ((bc+ac)>ab);
    }

    public double square(){
        double p=(ab + bc + ac)/2;
        return Math.sqrt(p*(p- ab)*(p- bc)*(p- ac));
    }

    public double getAb() {
        return ab;
    }

    public void setAb(double ab) {
        this.ab = ab;
    }

    public double getBc() {
        return bc;
    }

    public void setBc(double bc) {
        this.bc = bc;
    }

    public double getAc() {
        return ac;
    }

    public void setAc(double ac) {
        this.ac = ac;
    }
}
