package j07_STATICMethodsInterface_interfacestaticmethods.schoolcild;

public interface PrimarySchoolChild {
    static PrimarySchoolChild of(int age){
        if(6<=age && age<=14){
            if(6<=age && age<=10){
                return new LowerClassSchoolChild(age);
            }
            else{
                return new UpperClassSchoolChild(age);
            }
        }
        else{
            throw new IllegalArgumentException("It's not a schoolchild with this age!");
        }
    }
}
