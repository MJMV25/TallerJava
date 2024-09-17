package tarea1;

    public class TiposPrimitivos {
        byte miByte = 100;
        short miShort = 32000;
        int miInt = 123456789;
        long miLong = 123456789L;
        float miFloat = 3.14f;
        double miDouble = 3.14159;
        boolean miBoolean = true;
        char miChar = 'A';

        public void mostrarValores() {
            System.out.println("Valor de byte: " + miByte);
            System.out.println("Valor de short: " + miShort);
            System.out.println("Valor de int: " + miInt);
            System.out.println("Valor de long: " + miLong);
            System.out.println("Valor de float: " + miFloat);
            System.out.println("Valor de double: " + miDouble);
            System.out.println("Valor de boolean: " + miBoolean);
            System.out.println("Valor de char: " + miChar);
        }

        public static void main(String[] args) {
            TiposPrimitivos tipos = new TiposPrimitivos();
            tipos.mostrarValores();
        }
    }


