package n04_Rendezes_sorting;

import java.util.ArrayList;
import java.util.List;

public class MedicalSurgery {
    private List<Patient> patientsList;

    public MedicalSurgery(List<Patient> patientsList) {
        this.patientsList = patientsList;
    }

    public List<Patient> getPatientsInTimeOrder(){
        List<Patient> orderedList=new ArrayList<>(patientsList);
        orderedList.sort(new PatientComparator());
        return orderedList;
    }
}
