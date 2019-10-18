import javax.xml.crypto.Data;

public class Client {
    private int id;
    private int name;
    private String surname;
    private Data birthday;

    public int getId() {
        return id;
    }

    public int getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public Data getBirthday()
    {
        return birthday;
    }

    public Client(int id, int name, String surname, Data birthday) {
        this.id = id;
        this.name = name;
        this.surname=surname;
        this.birthday=birthday;
    }
}
