public class Student {
    private String studName;
    private int idNum;
    private String facName;

    public Student(String sN,int id, String facNm)
    {
        studName = sN;
        idNum = id;
        facName = facNm;
    }

    @Override
    public String toString() {
        return "Student :" +
                "\nStudent Name ='" + studName + '\'' +
                "\nID Number =" + idNum +
                "\nFaculty Name ='" + facName + '\'';
    }
}
