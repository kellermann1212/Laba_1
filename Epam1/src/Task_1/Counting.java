package Task_1;

public class Counting {
    public static void printArray(char[] input){
        for (char value : input){
            System.out.print(value);
        }
        System.out.println();
    }

    public static char[] toBinary(int input){
        char[] result = new char[getLength(2,input)];
        int tempIndex = result.length - 1;
        int temp;
        while (input != 0){
            temp = input%2;
            result[tempIndex] = (char)(temp + 48);
            tempIndex--;
            input = input / 2;
        }
        return result;
    }

    public static char[] toBinary8(int input){ //порешать с ноликом
        char[] result = new char[getLength(8,input)];
        int tempIndex = result.length - 1;
        int temp;
        while (input != 0){
            temp = input%8;
            result[tempIndex] = (char)(temp + 48);
            tempIndex--;
            input = input / 8;
        }
        return result;
    }

    public static char[] toHex(int input){ //порешать с ноликом
        char[] result = new char[getLength(16,input)];
        int tempIndex = result.length - 1;
        int temp;
        while (input != 0){
            temp = input%16;
            switch (temp){
                case 10: {
                    result[tempIndex] = 'A';
                    tempIndex--;
                    break;
                }
                case 11: {
                    result[tempIndex] = 'B';
                    tempIndex--;
                    break;
                }
                case 12: {
                    result[tempIndex] = 'C';
                    tempIndex--;
                    break;
                }
                case 13: {
                    result[tempIndex] = 'D';
                    tempIndex--;
                    break;
                }
                case 14: {
                    result[tempIndex] = 'E';
                    tempIndex--;
                    break;
                }
                case 15: {
                    result[tempIndex] = 'F';
                    tempIndex--;
                    break;
                }
                default: {
                    result[tempIndex] = (char)(temp + 48);
                    tempIndex--;
                }
            }
            input = input / 16;
        }
        return result;
    }

    public static int getLength(int pow, int input){
        int result = 0;
        while (input != 0){
            input = input / pow;
            result++;
        }
        return result;
    }
}
