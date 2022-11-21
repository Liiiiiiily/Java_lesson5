public class Workers {
    public static void main(String[] args) {
// Создать массив из 5 сотрудников.
        Person[] iSys = new Person[5];
        iSys[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        iSys[1] = new Person("Mariynova Maria", "Developer", "marymary@mailbox.com", "892222222",40000,44);
        iSys[2] = new Person("Voronov Genadiy", "Secretary", "cheburator@mailbox.com", "893333333",10000,50);
        iSys[3] = new Person("Chinov Alexey", "Cliner", "chinchin@mailbox.com", "894444444",10000,19);
        iSys[4] = new Person("Lena Golovach", "Defense minister", "ugonnadie@mailbox.com", "892555555",3000,22);
// С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (Person person : iSys)
            if (person.getAge()>40)
                System.out.println(person);
    }
}
// Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
class Person {
    private String fullname;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String fullname, String post, String email, String phone, int salary, int age) {
        this.fullname = fullname;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
//     (доп.настройка для вывода столбцом)
    public String toString(){
        return(fullname+ "\n-"
                +post+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}
