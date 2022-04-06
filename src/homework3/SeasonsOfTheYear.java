package homework3;
import java.util.Scanner;

// 3. Написать метод, который в зависимости от сезона, выводит на экран сумму дней в этом сезоне.
// Входной параметр ввести с клавиатуры.

   public class SeasonsOfTheYear {
        public static void main(String[] args) {
            Seasons season;
            System.out.print("Season (1..4) = ");
            Scanner inStr = new Scanner(System.in);
            int numSeason = inStr.nextInt();

            switch (numSeason) {
                case 1:
                    season = Seasons.Spring;
                    break;
                case 2:
                    season = Seasons.Summer;
                    break;
                case 3:
                    season = Seasons.Autumn;
                    break;
                case 4:
                    season = Seasons.Winter;
                    break;
                default:
                    System.out.println("Incorrect input.");
                    return;
            }
            System.out.println("season = " + season);
            int nDays = 0;

            switch (season) {
                case Spring:
                    nDays = 92;
                    break;
                case Summer:
                    nDays = 92;
                    break;
                case Autumn:
                    nDays = 91;
                    break;
                case Winter:
                    nDays = 90;
                    break;
            }
            System.out.println("Number of days = " + nDays);

            // 2. Написать метод, который выводит следующий сезон от заданного во входном параметре.
            // Входной параметр ввести с клавиатуры.

            Seasons ns = Seasons.Winter;
            System.out.print("Next Season = ");
            Scanner inSes = new Scanner(System.in);
            int nextSeason = inSes.nextInt();
            switch (nextSeason) {
                case 1:
                    ns = Seasons.Summer;
                    break;
                case 2:
                    ns = Seasons.Autumn;
                    break;
                case 3:
                    ns = Seasons.Winter;
                    break;
                case 4:
                    ns = Seasons.Spring;
                    break;
                default:
                    System.out.println("Incorrect input");
                    return;
            }
                System.out.println(ns);
            }
        }

