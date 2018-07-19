
public class Network {

    private Phone[]phones;
    private int length;

    public Network(int size){
        phones = new Phone[size];
        length=0;
    }

    public Network(){}

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Phone[] getPhones() {
        return phones;
    }

    public void setPhones(Phone[] phones) {
        this.phones = phones;
    }

    public  void setPhoneNumber(Phone phone){
        phones[length]=phone;
        length++;
    }
}
