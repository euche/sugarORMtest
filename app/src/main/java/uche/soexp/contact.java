package uche.soexp;

import com.orm.SugarRecord;

public class contact extends SugarRecord {

    private String name;
    private String phonno;

    public contact(String name, String phonno) {

        this.name = name;
        this.phonno = phonno;

    }


    public contact() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonno() {
        return phonno;
    }

    public void setPhonno(String phonno) {
        this.phonno = phonno;
    }



}
