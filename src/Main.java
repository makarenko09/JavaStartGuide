import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //Exercise one
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog =" + dog + "\ncat =" + cat + "\npaper =" + paper);
        //Exercise two - Увеличение значений переменных на 4
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        // Вывод новых значений переменных в консоль
        System.out.println("Новое значение переменной dog: " + dog);
        System.out.println("Новое значение переменной cat: " + cat);
        System.out.println("Новое значение переменной paper: " + paper);


        String text = JOptionPane.showInputDialog(null, "Введите сообщение:");
        System.out.println("Получено сообщение : " + text);
    }
}