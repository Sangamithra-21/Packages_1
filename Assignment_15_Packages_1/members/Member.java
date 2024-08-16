package Assignment_15_Packages_1.members;

public class Member {
    String name;
    String id;

    public Member(String name,String id)
    {
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
