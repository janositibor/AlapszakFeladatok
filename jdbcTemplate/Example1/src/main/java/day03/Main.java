package day03;

import org.mariadb.jdbc.MariaDbDataSource;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DBSource dbSource= new DBSource("/people.properties");
        MariaDbDataSource dataSource= dbSource.getDataSource();

        PersonDao personDao=new PersonDao(dataSource);
        Person person1=new Person("Kis Rozália", LocalDate.of(1989, 12, 30),160,59.1);
        personDao.savePerson(person1);

        Person person2=new Person("Nagy Róbert", LocalDate.of(1979, 1, 3),170,89.3);
        Person person3=new Person("Kék Virág", LocalDate.of(1999, 2, 25),171,55.4);
        List<Person> peopleToSave= Arrays.asList(person2,person3);
        personDao.savePeople(peopleToSave);

        Person person4=new Person("Telek Elek", LocalDate.of(2001, 3, 15),169,65.4);
        System.out.println(personDao.savePersonAndGetId(person4));

        Person person5=new Person("Kardos Tibor", LocalDate.of(1976, 3, 8),182,89.9);
        personDao.savePerson(person5);
        System.out.println(personDao.findPeopleByNameStartWith("K"));
        System.out.println(personDao.findPeopleByNameStartWith("Gö"));

        System.out.println(personDao.listPeopleNames());

        System.out.println(personDao.findPersonById(4));
        System.out.println(personDao.findAllPeople());
        System.out.println(personDao.findPersonNameById(1));
        System.out.println(personDao.findPersonNameById2(11));
        System.out.println(personDao.findPersonNameByIdOptional(2));
//        System.out.println(personDao.findPersonNameByIdOptional(22));

        personDao.increaseWeight(3,10.1);
        System.out.println(personDao.findPersonById(3));
        personDao.deletePersonById(4);
        System.out.println(personDao.findAllPeople());

        Person person6=new Person("Karda Beáta", LocalDate.of(1970, 3, 8),182,89.9);

        System.out.println(personDao.savePersonAndGetId(person6));

    }
}
