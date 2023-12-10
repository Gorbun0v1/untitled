public class Main {
    public static void main(String[] args) {

            // Строка для разделения
            String st1 = " Напишите код, с помощью которого можно разделить строку на части. ";
            // Разделение строки по пробелу через foreach
            String[] st2 = st1.split(" ");
            // Цикл foreach
            System.out.println("Разделение строки: ");
            for(String st3: st2) {
                System.out.println(st3);
            }

    }
}