import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Задание 1.
        System.out.println("Задание 1.");
        //Напишите четыре строки:
        //первая с именем firstName — для хранения имени;
        //вторая с именем middleName — для хранения отчества;
        //третья с именем lastName — для хранения фамилии;
        //четвертая с именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
        //Выведите в консоль фразу: “ФИО сотрудника — ….”
        //В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника —" + fullName);

        //Задание 2.
        System.out.println("Задание 2");
        //Напишите программу, которая изменит написание Ф. И. О. сотрудника с
        // “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
        //В качестве строки с исходными данными используйте строку fullName.
        //Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase(Locale.ROOT));

        //Задание 3.
        System.out.println("Задание 3");
        //Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
        //В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
        //Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”

        fullName = "Иванов Семён Семёнович";

         fullName = fullName.replace('ё', 'е');
         System.out.println("Данные ФИО сотрудника — " + fullName);


        }
    }
