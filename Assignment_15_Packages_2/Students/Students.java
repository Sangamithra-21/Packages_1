package Assignment_15_Packages_2.Students;
import java.util.List;

public class Students {
    public String name;
    public String id;
    public static List<String> courses;

    public Students(String name,String id,List<String> s)
    {
        this.name=name;
        this.id=id;
        this.courses=s;
    }


}
