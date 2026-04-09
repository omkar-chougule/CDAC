package DatabaseConnectivity;

public class User {
    private int id;
    private String uname;
    private int age;
    private String geneder;
    private String nationality;

    public User(){

    }
    public User(int id, String uname, int age, String geneder, String nationality) {
        super();
        this.id = id;
        this.uname = uname;
        this.age = age;
        this.geneder = geneder;
        this.nationality = nationality;
    }

    public int getUid() {
        return id;
    }

    public void setUid(int uid) {
        this.id = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGeneder() {
        return geneder;
    }

    public void setGeneder(String geneder) {
        this.geneder = geneder;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + id +
                ", uname='" + uname + '\'' +
                ", age=" + age +
                ", geneder='" + geneder + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }

}
