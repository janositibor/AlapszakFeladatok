package f01_StringAlapok_stringbasic;

public class Student {
    private Person person;
    private String neptunCode;
    private String educationID;
    private String entryCardNo;

    public Student(Person person, String neptunCode, String educationID) {
        this.person = person;
        this.neptunCode = neptunCode;
        this.educationID = educationID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public void setNeptunCode(String neptunCode) {
        this.neptunCode = neptunCode;
    }

    public String getEducationID() {
        return educationID;
    }

    public void setEducationID(String educationID) {
        this.educationID = educationID;
    }

    public String getEntryCardNo() {
        return entryCardNo;
    }

    public void setEntryCardNo(String entryCardNo) {
        this.entryCardNo = entryCardNo;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "person=" + person +
                ", neptunCode='" + neptunCode + '\'' +
                ", educationID='" + educationID + '\'' +
                ", entryCardNo='" + entryCardNo + '\'' +
                "}";
    }
}
