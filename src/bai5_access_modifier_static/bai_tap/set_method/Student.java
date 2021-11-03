package bai5_access_modifier_static.bai_tap.set_method;

public class Student {
    String name;
    String classes;

    public Student(){

    }

    public String getName(){
        return this.name;
    }

    public String getClasses(){
        return this.classes;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setClasses(String classes){
        this.classes = classes;
    }
}
