public class Main {

    public static char[] columns = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
    public static char[] whiteOrBlack1 = new char[8];


    public static void main(String[] args) {

        System.out.println();
        System.out.println("W = white Field!" + "\nB = black field!");
        System.out.println();
        print(whiteOrBlack1);
        System.out.println();
    }

    public static char[][] chessboard(){
        return new char[8][8];
    }

    public static void columnName(char[] chars){
        System.out.print("   ");
        for (char value : chars) {

            System.out.print("  " + value);
        }
    }

    public static void print(char[] columns2) {
        columnName(columns);
        System.out.println();
        System.out.print("   --------------------------");
        System.out.println();

        for (int i = 0; i < chessboard().length; i++) {
            int columname = i + 1;
            System.out.print(columname + " |");

            for (int j = 0; j < columns2.length; j++) {
                if (i % 2 == 0 && j % 2 != 0){
                    columns2[j] = 'B';
                } else if (i % 2 == 0) {
                    columns2[j] = 'W';
                } else if (j % 2 == 0) {
                    columns2[j] = 'B';
                }else {
                    columns2[j] = 'W';
                }

                System.out.print("  " + columns2[j]);
            }
            System.out.print("  | " + columname );
            System.out.println();
        }
        System.out.print("   --------------------------");
        System.out.println();
        columnName(columns);

    }
}

