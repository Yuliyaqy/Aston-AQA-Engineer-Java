public class Employee {

        String fullName;
        String position;
        String email;
        String phoneNumber;
        int salary;
        int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age){
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
    }

    public void info() {
        System.out.println("ФИО: " + fullName + "; должность: " + position + "; email: " + email +
                ";телефон: " + phoneNumber + "; зарплата: " + salary + "; возраст: " + age);
    }

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Petrov Igor", "doctor", "petrovivan@gmail.com", "877892546", 90000, 56);
        persArray[1] = new Employee("Ermak Artem", "manager", "ermakartem@gmail.com", "895634217", 60000, 32);
        persArray[2] = new Employee("Ivanov Petr", "engineer", "ivanovpetr@gmail.com", "897841253", 50000, 36);
        persArray[3] = new Employee("Moroz Alena", "director", "morozalena@mail.ru", "872581346", 120000, 41);
        persArray[4] = new Employee("Maslenchenko Aleksandr", "cook", "maslenchenkoaleksandr@mail.ru", "895897283", 80000, 46);
        for (Employee employee : persArray)
            System.out.println(employee);
    }


    @Override
    public String toString(){
        return String.format("Имя: %s \t Должность: %s \n Email: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                fullName, position, email, phoneNumber, salary, age);
    }

}
