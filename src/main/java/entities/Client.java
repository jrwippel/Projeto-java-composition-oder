package entities;

import java.util.Date;

public class Client {
    private String name;
    private String email;
    private Date dateBirth;

    public Client() {

    }

    public Client(String name, String email, Date dateBirth) {
        this.name = name;
        this.email = email;
        this.dateBirth = dateBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
}
