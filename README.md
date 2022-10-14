# consecutiveDucks (7 kyu)
## 14.10.2022
## представление числа в виде суммы последовательных чисел(истина если существует)
## [ссылка на задание]( https://www.codewars.com/kata/5dae2599a8f7d90025d2f15f)
## решение:
*public static boolean consecutiveDucks(int n) {
*       long A = n;
*        for (int k = 1; k <= 2 * A; k++) {
*            if (2 * A % (k + 1) == 0 && (-k + 2 * A / (k + 1)) % 2 == 0) {
*                System.out.println(k);
*                System.out.println((-k + 2 * A / (k + 1)) / 2);
*                return true;
*            }
*        }
*        return false;
*    }
## понравивщееся решение(автор clcraig):
    public static boolean consecutiveDucks(int n) {
        double log2n = Math.log(n) / Math.log(2);
        return log2n != (int)log2n;
    }
