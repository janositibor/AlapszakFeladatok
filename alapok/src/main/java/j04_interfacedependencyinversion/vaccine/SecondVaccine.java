package j04_interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine{
    private List<Person> vaccinationList=new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        List<Person> listPrioNo2=new ArrayList<>();
        for(Person person:registrated) {
            if (person.getPregnant() == Pregnancy.NO && person.getChronic() == ChronicDisease.NO) {
                System.out.println(person.getName());
                if (person.getAge() <= 65) {
                    vaccinationList.add(person);
                }
                else {
                    listPrioNo2.add(person);
                }
            }
        }
        for(Person person:listPrioNo2){
            vaccinationList.add(person);
        }
    }
}
