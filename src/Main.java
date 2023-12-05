public class Main {
    public static void main(String[] args) {

/*  Task 1
Создать класс Temperature (температура), содержащий метод для перевода
градусов по фаренгейту в градусы цельсия ( celsius = 5*(farenheit - 32)/9)
 В классе Main создать несколько обьектов класса Temperature
 (значение температуры по фаренгейту должно задаваться через конструктор)
и вывести результат перевода на экран
 */
       Temperature temp1 = new Temperature();
       temp1.farenheit = 98;
       System.out.println(temp1.farenheit + " Farenheit = " + (String.format("%.2f", temp1.celsius())) + " Celsius");

       Temperature temp2 = new Temperature();
       temp2.farenheit = 76;
       System.out.println(temp2.farenheit + " Farenheit = " + (String.format("%.2f", temp2.celsius())) + " Celsius");

       Temperature temp3 = new Temperature();
       temp3.farenheit = -35;
       System.out.println(temp3.farenheit + " Farenheit = " + (String.format("%.2f", temp3.celsius())) + " Celsius");

    }



}