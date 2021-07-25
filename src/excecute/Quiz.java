package excecute;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        char chooseToStop;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("ជ្រើសរើសលេខ 1 សម្រាប់លេខល្បែងផលបូក");
            System.out.println("ជ្រើសរើសលេខ 2 សម្រាប់លេខល្បែងផលដក");
            System.out.println("ជ្រើសរើសលេខ 3 សម្រាប់លេខល្បែងផលគុណ");
            System.out.println("ជ្រើសរើសលេខ 4 សម្រាប់លេខល្បែងផលចែក");
            System.out.print("ជ្រើសរើស៖ ");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    menuLevelSum();
                    break;
                case 2:
                    menuLevelSub();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
            }
            System.out.println("ចុច Y សម្រាប់បន្ត, N ដើម្បីបញ្ចបើ");
            chooseToStop = input.next().charAt(0);
        } while (chooseToStop != 'n' && chooseToStop != 'N');
    }

    public static void menuLevelSum() {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 10; i++)
            System.out.println("ជ្រើសរើសលេខ " + i + " សម្រាប់លេខល្បែងផលបូកកម្រិតទី " + i);
        System.out.print("ជ្រើសរើស៖");
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                sumQuizLevel1();
                break;
            case 2:
                sumQuizLevel2();
                break;
            case 3:
                sumQuizLevel3();
                break;
            case 4:
                sumQuizLevel4();
                break;
            case 5:
                sumQuizLevel5();
                break;
            case 6:
                sumQuizLevel6();
                break;
            case 7:
                sumQuizLevel7();
                break;
            case 8:
                sumQuizLevel8();
                break;
            case 9:
                sumQuizLevel9();
                break;
            case 10:
                sumQuizLevel10();
                break;
            default:
        }
    }

    public static void sumQuizLevel1() {
        int start = (int) System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        int countCorrectAnswers = 0;
        int i = 0;
        while (i < 10) {
            int number1, number2;
            number1 = (int) (Math.random() * 11);
            number2 = (int) (Math.random() * 11);
            System.out.print("តើ " + number1 + " + " + number2 + " = ");
            int answer = input.nextInt();
            int result = number1 + number2;
            if (answer == result) {
                System.out.println("ចម្លើយរបស់អ្នកត្រឹមត្រូវ.");
                countCorrectAnswers++;
            } else {
                System.out.println("ចម្លើយរបស់អ្នកមិនត្រឹមត្រូវទេ ចម្លើយត្រឹមត្រូវគឺ " + result);
            }
            i++;
        }
        int stop = (int) System.currentTimeMillis();
        int calculateTime = stop - start;  // Miliseconde
        int totalSecond = calculateTime / 1000;
        int minute = totalSecond / 60;
        int second = totalSecond % 60;
        System.out.println("***ប្អូនឆ្លើយត្រូវចំនួន " + countCorrectAnswers +
                " សំណួរ\n***និងឆ្លើយខុសចំនួន " + (10 - countCorrectAnswers) + "សំណួរ");
        System.out.println("ប្អូនប្រើរយៈពេល " + ((0 == minute) ? "" : minute + " នាទី") + second + " វិនាទី");
    }

    public static void sumQuizLevel2() {
        int start = (int) System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        int countCorrectAnswers = 0;
        int i = 0;
        while (i < 10) {
            int number1, number2;
            number1 = (int) (Math.random() * 21);
            number2 = (int) (Math.random() * 21);
            System.out.print("តើ " + number1 + " + " + number2 + " = ");
            int answer = input.nextInt();
            int result = number1 + number2;
            if (answer == result) {
                System.out.println("ចម្លើយរបស់អ្នកត្រឹមត្រូវ.");
                countCorrectAnswers++;
            } else {
                System.out.println("ចម្លើយរបស់អ្នកមិនត្រឹមត្រូវទេ ចម្លើយត្រឹមត្រូវគឺ " + result);
            }
            i++;
        }
        int stop = (int) System.currentTimeMillis();
        int calculateTime = stop - start;  // Miliseconde
        int totalSecond = calculateTime / 1000;
        int minute = totalSecond / 60;
        int second = totalSecond % 60;
        System.out.println("***ប្អូនឆ្លើយត្រូវចំនួន " + countCorrectAnswers +
                " សំណួរ\n***និងឆ្លើយខុសចំនួន " + (10 - countCorrectAnswers) + "សំណួរ");
        System.out.println("ប្អូនប្រើរយៈពេល " + ((0 == minute) ? "" : minute + " នាទី") + second + " វិនាទី");
    }

    public static void sumQuizLevel3() {
        int start = (int) System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        int countCorrectAnswers = 0;
        int i = 0;
        while (i < 10) {
            int number1, number2;
            number1 = (int) (Math.random() * 31);
            number2 = (int) (Math.random() * 31);
            System.out.print("តើ " + number1 + " + " + number2 + " = ");
            int answer = input.nextInt();
            int result = number1 + number2;
            if (answer == result) {
                System.out.println("ចម្លើយរបស់អ្នកត្រឹមត្រូវ.");
                countCorrectAnswers++;
            } else {
                System.out.println("ចម្លើយរបស់អ្នកមិនត្រឹមត្រូវទេ ចម្លើយត្រឹមត្រូវគឺ " + result);
            }
            i++;
        }
        int stop = (int) System.currentTimeMillis();
        int calculateTime = stop - start;  // Miliseconde
        int totalSecond = calculateTime / 1000;
        int minute = totalSecond / 60;
        int second = totalSecond % 60;
        System.out.println("***ប្អូនឆ្លើយត្រូវចំនួន " + countCorrectAnswers +
                " សំណួរ\n***និងឆ្លើយខុសចំនួន " + (10 - countCorrectAnswers) + "សំណួរ");
        System.out.println("ប្អូនប្រើរយៈពេល " + ((0 == minute) ? "" : minute + " នាទី") + second + " វិនាទី");
    }

    public static void sumQuizLevel4() {
        int start = (int) System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        int countCorrectAnswers = 0;
        int i = 0;
        while (i < 10) {
            int number1, number2;
            number1 = (int) (Math.random() * 41);
            number2 = (int) (Math.random() * 41);
            System.out.print("តើ " + number1 + " + " + number2 + " = ");
            int answer = input.nextInt();
            int result = number1 + number2;
            if (answer == result) {
                System.out.println("ចម្លើយរបស់អ្នកត្រឹមត្រូវ.");
                countCorrectAnswers++;
            } else {
                System.out.println("ចម្លើយរបស់អ្នកមិនត្រឹមត្រូវទេ ចម្លើយត្រឹមត្រូវគឺ " + result);
            }
            i++;
        }
        int stop = (int) System.currentTimeMillis();
        int calculateTime = stop - start;  // Miliseconde
        int totalSecond = calculateTime / 1000;
        int minute = totalSecond / 60;
        int second = totalSecond % 60;
        System.out.println("***ប្អូនឆ្លើយត្រូវចំនួន " + countCorrectAnswers +
                " សំណួរ\n***និងឆ្លើយខុសចំនួន " + (10 - countCorrectAnswers) + "សំណួរ");
        System.out.println("ប្អូនប្រើរយៈពេល " + ((0 == minute) ? "" : minute + " នាទី") + second + " វិនាទី");
    }

    public static void sumQuizLevel5() {
        int start = (int) System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        int countCorrectAnswers = 0;
        int i = 0;
        while (i < 10) {
            int number1, number2;
            number1 = (int) (Math.random() * 51);
            number2 = (int) (Math.random() * 51);
            System.out.print("តើ " + number1 + " + " + number2 + " = ");
            int answer = input.nextInt();
            int result = number1 + number2;
            if (answer == result) {
                System.out.println("ចម្លើយរបស់អ្នកត្រឹមត្រូវ.");
                countCorrectAnswers++;
            } else {
                System.out.println("ចម្លើយរបស់អ្នកមិនត្រឹមត្រូវទេ ចម្លើយត្រឹមត្រូវគឺ " + result);
            }
            i++;
        }
        int stop = (int) System.currentTimeMillis();
        int calculateTime = stop - start;  // Miliseconde
        int totalSecond = calculateTime / 1000;
        int minute = totalSecond / 60;
        int second = totalSecond % 60;
        System.out.println("***ប្អូនឆ្លើយត្រូវចំនួន " + countCorrectAnswers +
                " សំណួរ\n***និងឆ្លើយខុសចំនួន " + (10 - countCorrectAnswers) + "សំណួរ");
        System.out.println("ប្អូនប្រើរយៈពេល " + ((0 == minute) ? "" : minute + " នាទី") + second + " វិនាទី");
    }

    public static void sumQuizLevel6() {
        int start = (int) System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        int countCorrectAnswers = 0;
        int i = 0;
        while (i < 10) {
            int number1, number2;
            number1 = (int) (Math.random() * 61);
            number2 = (int) (Math.random() * 61);
            System.out.print("តើ " + number1 + " + " + number2 + " = ");
            int answer = input.nextInt();
            int result = number1 + number2;
            if (answer == result) {
                System.out.println("ចម្លើយរបស់អ្នកត្រឹមត្រូវ.");
                countCorrectAnswers++;
            } else {
                System.out.println("ចម្លើយរបស់អ្នកមិនត្រឹមត្រូវទេ ចម្លើយត្រឹមត្រូវគឺ " + result);
            }
            i++;
        }
        int stop = (int) System.currentTimeMillis();
        int calculateTime = stop - start;  // Miliseconde
        int totalSecond = calculateTime / 1000;
        int minute = totalSecond / 60;
        int second = totalSecond % 60;
        System.out.println("***ប្អូនឆ្លើយត្រូវចំនួន " + countCorrectAnswers +
                " សំណួរ\n***និងឆ្លើយខុសចំនួន " + (10 - countCorrectAnswers) + "សំណួរ");
        System.out.println("ប្អូនប្រើរយៈពេល " + ((0 == minute) ? "" : minute + " នាទី") + second + " វិនាទី");
    }

    public static void sumQuizLevel7() {
        int start = (int) System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        int countCorrectAnswers = 0;
        int i = 0;
        while (i < 10) {
            int number1, number2;
            number1 = (int) (Math.random() * 71);
            number2 = (int) (Math.random() * 71);
            System.out.print("តើ " + number1 + " + " + number2 + " = ");
            int answer = input.nextInt();
            int result = number1 + number2;
            if (answer == result) {
                System.out.println("ចម្លើយរបស់អ្នកត្រឹមត្រូវ.");
                countCorrectAnswers++;
            } else {
                System.out.println("ចម្លើយរបស់អ្នកមិនត្រឹមត្រូវទេ ចម្លើយត្រឹមត្រូវគឺ " + result);
            }
            i++;
        }
        int stop = (int) System.currentTimeMillis();
        int calculateTime = stop - start;  // Miliseconde
        int totalSecond = calculateTime / 1000;
        int minute = totalSecond / 60;
        int second = totalSecond % 60;
        System.out.println("***ប្អូនឆ្លើយត្រូវចំនួន " + countCorrectAnswers +
                " សំណួរ\n***និងឆ្លើយខុសចំនួន " + (10 - countCorrectAnswers) + "សំណួរ");
        System.out.println("ប្អូនប្រើរយៈពេល " + ((0 == minute) ? "" : minute + " នាទី") + second + " វិនាទី");
    }

    public static void sumQuizLevel8() {
        int start = (int) System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        int countCorrectAnswers = 0;
        int i = 0;
        while (i < 10) {
            int number1, number2;
            number1 = (int) (Math.random() * 81);
            number2 = (int) (Math.random() * 81);
            System.out.print("តើ " + number1 + " + " + number2 + " = ");
            int answer = input.nextInt();
            int result = number1 + number2;
            if (answer == result) {
                System.out.println("ចម្លើយរបស់អ្នកត្រឹមត្រូវ.");
                countCorrectAnswers++;
            } else {
                System.out.println("ចម្លើយរបស់អ្នកមិនត្រឹមត្រូវទេ ចម្លើយត្រឹមត្រូវគឺ " + result);
            }
            i++;
        }
        int stop = (int) System.currentTimeMillis();
        int calculateTime = stop - start;  // Miliseconde
        int totalSecond = calculateTime / 1000;
        int minute = totalSecond / 60;
        int second = totalSecond % 60;
        System.out.println("***ប្អូនឆ្លើយត្រូវចំនួន " + countCorrectAnswers +
                " សំណួរ\n***និងឆ្លើយខុសចំនួន " + (10 - countCorrectAnswers) + "សំណួរ");
        System.out.println("ប្អូនប្រើរយៈពេល " + ((0 == minute) ? "" : minute + " នាទី") + second + " វិនាទី");
    }

    public static void sumQuizLevel9() {
        int start = (int) System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        int countCorrectAnswers = 0;
        int i = 0;
        while (i < 10) {
            int number1, number2;
            number1 = (int) (Math.random() * 91);
            number2 = (int) (Math.random() * 91);
            System.out.print("តើ " + number1 + " + " + number2 + " = ");
            int answer = input.nextInt();
            int result = number1 + number2;
            if (answer == result) {
                System.out.println("ចម្លើយរបស់អ្នកត្រឹមត្រូវ.");
                countCorrectAnswers++;
            } else {
                System.out.println("ចម្លើយរបស់អ្នកមិនត្រឹមត្រូវទេ ចម្លើយត្រឹមត្រូវគឺ " + result);
            }
            i++;
        }
        int stop = (int) System.currentTimeMillis();
        int calculateTime = stop - start;  // Miliseconde
        int totalSecond = calculateTime / 1000;
        int minute = totalSecond / 60;
        int second = totalSecond % 60;
        System.out.println("***ប្អូនឆ្លើយត្រូវចំនួន " + countCorrectAnswers +
                " សំណួរ\n***និងឆ្លើយខុសចំនួន " + (10 - countCorrectAnswers) + "សំណួរ");
        System.out.println("ប្អូនប្រើរយៈពេល " + ((0 == minute) ? "" : minute + " នាទី") + second + " វិនាទី");
    }

    public static void sumQuizLevel10() {
        int start = (int) System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        int countCorrectAnswers = 0;
        int i = 0;
        while (i < 10) {
            int number1, number2;
            number1 = (int) (Math.random() * 101);
            number2 = (int) (Math.random() * 101);
            System.out.print("តើ " + number1 + " + " + number2 + " = ");
            int answer = input.nextInt();
            int result = number1 + number2;
            if (answer == result) {
                System.out.println("ចម្លើយរបស់អ្នកត្រឹមត្រូវ.");
                countCorrectAnswers++;
            } else {
                System.out.println("ចម្លើយរបស់អ្នកមិនត្រឹមត្រូវទេ ចម្លើយត្រឹមត្រូវគឺ " + result);
            }
            i++;
        }
        int stop = (int) System.currentTimeMillis();
        int calculateTime = stop - start;  // Miliseconde
        int totalSecond = calculateTime / 1000;
        int minute = totalSecond / 60;
        int second = totalSecond % 60;
        System.out.println("***ប្អូនឆ្លើយត្រូវចំនួន " + countCorrectAnswers +
                " សំណួរ\n***និងឆ្លើយខុសចំនួន " + (10 - countCorrectAnswers) + "សំណួរ");
        System.out.println("ប្អូនប្រើរយៈពេល " + ((0 == minute) ? "" : minute + " នាទី") + second + " វិនាទី");
    }

    public static void menuLevelSub() {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 10; i++)
            System.out.println("ជ្រើសរើសលេខ " + i + " សម្រាប់លេខល្បែងផលដកកម្រិតទី " + i);
        System.out.print("ជ្រើសរើស៖");
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                subQuizLevel1();
                break;
            case 2:
                subQuizLevel2();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            default:
        }
    }

    public static void subQuizLevel1() {
        int start = (int) System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        int countCorrectAnswers = 0;
        int i = 0;
        while (i < 10) {
            int number1, number2;
            number1 = (int) (Math.random() * 11);
            number2 = (int) (Math.random() * 11);
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.print("តើ " + number1 + " - " + number2 + " = ");
            int answer = input.nextInt();
            int result = number1 - number2;
            if (answer == result) {
                System.out.println("ចម្លើយរបស់អ្នកត្រឹមត្រូវ.");
                countCorrectAnswers++;
            } else {
                System.out.println("ចម្លើយរបស់អ្នកមិនត្រឹមត្រូវទេ ចម្លើយត្រឹមត្រូវគឺ " + result);
            }
            i++;
        }
        int stop = (int) System.currentTimeMillis();
        int calculateTime = stop - start;  // Miliseconde
        int totalSecond = calculateTime / 1000;
        int minute = totalSecond / 60;
        int second = totalSecond % 60;
        System.out.println("***ប្អូនឆ្លើយត្រូវចំនួន " + countCorrectAnswers +
                " សំណួរ\n***និងឆ្លើយខុសចំនួន " + (10 - countCorrectAnswers) + "សំណួរ");
        System.out.println("ប្អូនប្រើរយៈពេល " + ((0 == minute) ? "" : minute + " នាទី") + second + " វិនាទី");
    }

    public static void subQuizLevel2() {
        int start = (int) System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        int countCorrectAnswers = 0;
        int i = 0;
        while (i < 10) {
            int number1, number2;
            number1 = (int) (Math.random() * 21);
            number2 = (int) (Math.random() * 21);
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.print("តើ " + number1 + " - " + number2 + " = ");
            int answer = input.nextInt();
            int result = number1 - number2;
            if (answer == result) {
                System.out.println("ចម្លើយរបស់អ្នកត្រឹមត្រូវ.");
                countCorrectAnswers++;
            } else {
                System.out.println("ចម្លើយរបស់អ្នកមិនត្រឹមត្រូវទេ ចម្លើយត្រឹមត្រូវគឺ " + result);
            }
            i++;
        }
        int stop = (int) System.currentTimeMillis();
        int calculateTime = stop - start;  // Miliseconde
        int totalSecond = calculateTime / 1000;
        int minute = totalSecond / 60;
        int second = totalSecond % 60;
        System.out.println("***ប្អូនឆ្លើយត្រូវចំនួន " + countCorrectAnswers +
                " សំណួរ\n***និងឆ្លើយខុសចំនួន " + (10 - countCorrectAnswers) + "សំណួរ");
        System.out.println("ប្អូនប្រើរយៈពេល " + ((0 == minute) ? "" : minute + " នាទី") + second + " វិនាទី");
    }
}
