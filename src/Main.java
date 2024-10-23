import javax.swing.*;


public class Main {

    public static void main(String[] args) {
        int response = JOptionPane.showConfirmDialog(null,
                "Начать выполнение Задачи 1?",
                "Подтверждение",
                JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {
            //Exercise one
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
            System.out.println("dog =" + dog + "\ncat =" + cat + "\npaper =" + paper);

            // Переход к диалоговому окну для задачи 2
            response = JOptionPane.showConfirmDialog(null,
                    "Хотите перейти к выполнению Задачи 2?",
                    "Подтверждение",
                    JOptionPane.YES_NO_OPTION);

            if (response == JOptionPane.YES_OPTION) {
                //Exercise two - Увеличение значений переменных на 4
                dog += 4;
                cat = cat + 4;
                paper = paper + 4;

                // Вывод новых значений переменных в консоль
                System.out.println("Новое значение переменной dog: " + dog);
                System.out.println("Новое значение переменной cat: " + cat);
                System.out.println("Новое значение переменной paper: " + paper);
                // Переход Переход к диалоговому окну подсказки
                String input = JOptionPane.showInputDialog(null, "<html><body><h1>Сумма значений box:</h1><p>Введите в сообщении значение подсказки <br>переменной box, чтобы <br>понять как работает Задача 2.</p></body></html>", "0");
                int box = Integer.parseInt(input);
                int sumBox = box + 4;
                System.out.println("Новое значение переменной box: " + sumBox);

                //Exercise tree - уменьшение
                response = JOptionPane.showConfirmDialog(null,
                        "Хотите перейти к выполнению Задачи 3?",
                        "Подтверждение",
                        JOptionPane.YES_NO_OPTION);

                if (response == JOptionPane.YES_OPTION) {
                    dog = dog - 3.5;
                    cat = cat - 1.6;
                    paper = paper - 7639;

                    // Вывод новых значений переменных в консоль
                    System.out.println("Новое значение переменной dog: " + dog);
                    System.out.println("Новое значение переменной cat: " + cat);
                    System.out.println("Новое значение переменной paper: " + paper);

                    // Переход к диалоговому окну для задачи 4
                    response = JOptionPane.showConfirmDialog(null,
                            "Хотите перейти к выполнению Задачи 4?",
                            "Подтверждение",
                            JOptionPane.YES_NO_OPTION);

                    if (response == JOptionPane.YES_OPTION) {
                        //Exercise four
                        var friend = 19;
                        friend = friend + 2;
                        System.out.println("После увеличения значение переменной friend: " + friend);
                        friend = friend / 7;
                        System.out.println("После деления значение переменной friend: " + friend);

                        response = JOptionPane.showConfirmDialog(null,
                                "Хотите перейти к выполнению Задачи 6 и 7?",
                                "Подтверждение",
                                JOptionPane.YES_NO_OPTION);

                        if (response == JOptionPane.YES_OPTION) {
                            // Exercise six and seven
                            var boxer1Weight = 78.2;
                            var boxer2Weight = 82.7;
                            var totalWeight = boxer1Weight + boxer2Weight;
                            var weightDifference = Math.abs(boxer1Weight - boxer2Weight);


                            System.out.println("Общая масса двух бойцов: " + totalWeight + " кг");
                            System.out.println("Разница в массе бойцов: " + weightDifference + " кг");
                            var difference = boxer2Weight % boxer1Weight;
                            System.out.println("Остаток от деления: " + difference + " кг");


                            // Переход к диалоговому окну для задачи 8
                            response = JOptionPane.showConfirmDialog(null,
                                    "Хотите перейти к выполнению части Задачи 8?",
                                    "Подтверждение",
                                    JOptionPane.YES_NO_OPTION);
                            if (response == JOptionPane.YES_OPTION) {
                                                                var totalHours = 640;
                                var hoursPerEmployee = 8;
                                var numberOfEmployees = totalHours / hoursPerEmployee;
                                System.out.println("Всего работников в компании — " + numberOfEmployees + " человек.");
                                JOptionPane.showMessageDialog(null, "Завершен переход - part one of exercise 8!", "", JOptionPane.INFORMATION_MESSAGE);
                                var additionalEmployees = 94; // количество дополнительных сотрудников

                                // Общее количество сотрудников в компании
                                var currentEmployees = numberOfEmployees + additionalEmployees;

                                // Общее количество часов работы, которое может быть поделено между сотрудниками
                                var totalWorkHours = currentEmployees * hoursPerEmployee;

                                System.out.println("Если в компании работает " + currentEmployees + " человек, то всего " + totalWorkHours + " часов работы может быть поделено между сотрудниками.");
                                JOptionPane.showMessageDialog(null, "Завершен переход - part two of exercise 8!", "", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                }
            }
        }
    }
}