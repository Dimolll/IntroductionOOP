import java.util.LinkedList;
import java.util.List;

public class Network {
    private List<Phone> phoneList = new LinkedList<>();

    public List<Phone> getPhoneList(){return phoneList;}

    public void setPhoneList(Phone newPhone){ phoneList.add(newPhone);}
}
