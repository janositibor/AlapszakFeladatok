package j04_interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine{
    private List<Person> vaccinationList=new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        List<Person> listPrioNo2=new ArrayList<>();
        List<Person> listPrioNo3=new ArrayList<>();
        for(Person person:registrated){
            if(person.getPregnant()==Pregnancy.YES){
                vaccinationList.add(person);
            }
            else if(person.getAge()>65){
                listPrioNo2.add(person);
            }
            else{
                listPrioNo3.add(person);
            }
        }
        for(Person person:listPrioNo2){
            vaccinationList.add(person);
        }
        for(Person person:listPrioNo3){
            vaccinationList.add(person);
        }
    }
}
