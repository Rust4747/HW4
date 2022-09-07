public class Main {
    public static void main(String[] args) {
        {
            //Задание 1
            System.out.println("Задание 1");

            int age = 27;
            if (age >= 18) {
                System.out.println("Ты совершеннолетний");
            } else {
                System.out.println("Возраст совершенолетия пока не наступил");
            }
        }
        {

            int years = 5;
            if (years >= 7) {
                System.out.println("Идет в школу");
            } else {
                System.out.println("Пока ходит, радостный, в детский сад");
            }
            int age = 22;
            if (age >= 18)
                System.out.println("Идет грызть гранит науки в универ");
            else
                System.out.println("дальше готовится к сдаче ЕГЭ для универа");
        }
        {

            int age = 25;
            if (age >= 25)
                System.out.println("Может попробовать найти работу");
            else
                System.out.println("Сидя на парах думает о работе");
        }

        int totalSeats = 102;
        int seats = 60;
        int standingPlaces = totalSeats - seats;
        System.out.println("Стоячие места " + standingPlaces);

        if (totalSeats <= 102)
            System.out.println("Всего мест в вагоне");
        else if(totalSeats>102)
            System.out.println("Уже не помещается");
        if (seats <= 60)
            System.out.println("Всего сидячих мест");
        else if(seats>60)
            System.out.println("Остальные стоят");
        if (standingPlaces <= 42)
            System.out.println("Стоячие места есть");
        else if(standingPlaces>42)
            System.out.println("Ждем другой поезд");

        {
            int age = 4;
            if (age >= 2 && age <= 6)
                System.out.println("Идет в ltncrbq cfl");
            else if(age<2 || age>6)
                System.out.println("Не идет в детский сад, или идет в школу");
        }

        {
            int age=19;
            if(age >= 7 && age <= 18)
                System.out.println("Идет в школу");
            else
                System.out.println("Еще в детском саду, или идет в универ");
        }
        {
            int age=23;
            if(age >= 18 && age <= 24)
                System.out.println("учится в универе");
            else if(age<18 || age>24)
                System.out.println("Еще в школе, или ищет работу");

        }
        {
            int age=47;
            if(age >= 24)
                System.out.println("Работает");
            else if(age<24)
                System.out.println("Еще учится основам труда в универе");
        }
        {
            int age=3;
            if(age < 5)
                System.out.println("аттракционы запрещены");

        }
        {
            int age=11;
            if(age > 5 && age < 14)
                System.out.println("аттракционы разрещены в сопровождении взрослых");
            else
                System.out.println("без взрослых аттракционы запрещены");

        }
        {
            int age=21;
            if(age > 14)
                System.out.println("аттракционы разрещены");

        }
        {
        }
        {
            int one=11;
            int two=7;
            int three=4;
            if(one>two || one>three)
                System.out.println("самое большое число "+one);
            else if(two>one || two>three)
                System.out.println("самое большое число "+two);
            else if(three>one || three>two)
                System.out.println("самое большое число "+three);
        }

        }








    }



