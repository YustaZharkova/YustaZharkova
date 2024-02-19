package lesson1;

public class ConditionAppLocation {
    public static void main(String[] args) {
        int studyTime = 5;

        if (studyTime == 100) {
            System.out.println("Кажется ты уже в чём то да разбираешься, и даже получаешь удовольствие");
        } else if (studyTime >= 0 && studyTime <= 5) {
            System.out.println("Конечно ты ничего не понимаешь, а как ты хотела"); // Else if может быть много блоков, главное запомнить:
            //Начинаем блок с if продолжаем с else if (можно несколько) и закрываем с помощью else
        } else if (studyTime >= 5 && studyTime <= 20) {
            System.out.println("Думаю теперь понятно ещё меньше, не сдавайся");
        } else if (studyTime >= 20 && studyTime <= 50) {
            System.out.println("Так держать, старайся ещё");
        } else if (studyTime >= 50 && studyTime <= 70) {
            System.out.println("Ты такая молодчина, я горжусь тобой");
        } else if (studyTime >= 70 && studyTime <= 100)
            System.out.println("Поднажми, я в тебя верю");
        else {
            System.out.println("Увау. Не могу поверить! Вот это ты крутышка!");

        }
    }
}
//Ctrl Alt L

