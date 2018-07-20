public class Phone {

    private String number;

    public Phone(String number){
        this.number=number;
    }

    public Phone(){}

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Network registration(Network network){
        network.setPhoneNumber(this);
        return network;
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
