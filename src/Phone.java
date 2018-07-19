public class Phone {

    private String number;

    public String getNumber() {
        return number;
    }

    public Phone(String number){
        this.number=number;
    }

    public Phone(){}

    public void setNumber(String number) {
        this.number = number;
    }

    private String registration(){
        return number;
    }

    public void call(String otherNumber, Network network){
        boolean result=false;
        for(Phone num:network.getPhones()) {
            if (num.getNumber().equals(otherNumber)) {
                result = true;
                break;
            }
        }
        if(result)
            System.out.println("Call to " + otherNumber);
        else
            System.out.println("Error. This number is not on the network");
    }
}
