class Student {
    int studentId;
    String studentname;
    String grade;


    public Student() {
        this(0, "Unknown", "Not Graded");
    }

    
    public Student(int studentId, String studentname, String grade) {
        this.studentId = studentId;
        this.studentname = studentname;
        this.grade = grade;
        System.out.println("Student details initialized.");
    }


    void display() {
        System.out.println("Name: " + studentname);
        System.out.println("Id: " + studentId);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    public static void main(String[] args) {
        Student st = new Student(1, "Sidharth", "E");
        Student st1 = new Student(2, "Yogi", "E");
        Student st2 = new Student(); 

        st.display();
        st1.display();
        st2.display();
    }
}

