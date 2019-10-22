public class Student {
//        properties
        public int rollNo; // declare
        public String name;
//        constructor
        Student(int roll_no, String name){
            this.rollNo= roll_no;
            this.name= name;
        }
    public static void main(String[] args){
        Student[] std; // declaration of Student object array
        std = new Student[2]; // Instiatiation-> memory allocation
        std[0] = new Student(1,"shilpa");
        std[1] = new Student(2,"surbhi");
        for (int i=0;i<std.length;i++){
            System.out.println("student array"+std[i]);
        }
    }
}
