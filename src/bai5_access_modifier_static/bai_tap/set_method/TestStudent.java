package bai5_access_modifier_static.bai_tap.set_method;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Wiz");
        student.setClasses("C0921G1");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
