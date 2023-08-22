public class One {
    public static void main(String[] args) {
        System.out.println("Статік");
        Person you = new Person();
        Person.personInfoStatic("Will Smith", "New York", 46673892);
        Person.personInfoStatic("Jackie chan", "Shanghai", 412231231);
        Person.personInfoStatic("Sherlock Holmes", "London", 43534511);
        System.out.println("Не статік");
        Person will = new Person();
        Person jackie = new Person();
        Person sherlock = new Person();
        will.personInfo("Will Smith", "New York", 46673892);
        jackie.personInfo("Jackie chan", "Shanghai", 412231231);
        sherlock.personInfo("Sherlock Holmes", "London", 43534511);
        System.out.println("Спроба реєстрації");
        you.personNew();
    }
}
