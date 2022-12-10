package conversor;

public class Tempconv {

    // AbsoluteZeroC representa a temperatura zero absoluto em Celsius
    private static double absoluteZeroC = -273.15;

    // FreezingC representa a temperatura de congelamento da água em Celsius
    private static double freezingC = 0;

    // BoilingC representa a temperatura de ebulição da água em Celsius
    private static double boilingC = 100;

    /* Construtor */
    public Tempconv(){}

    /* Getters da classe */
    public static double getAbsoluteZeroC() { return absoluteZeroC; }
    public static double getFreezingC() { return freezingC; }
    public static double getBoilingC() { return boilingC; }

    /* String retorna temperatura constante formatada */
    public static String absoluteZeroC() { return printTempCelsius(getAbsoluteZeroC()); }
    public static String freezingC() { return printTempCelsius(getFreezingC()); }
    public static String boilingC() { return printTempCelsius(getBoilingC()); }


    // String retorna uma temperatura 'n' em Celsius no formato n°C
    public static String printTempCelsius(double f) { return Double.toString(f) + " °C"; }

    // String retorna uma temperatura 'n' em Fahrenheit no formato n°F
    public static String printTempFahrenheit(double c) { return Double.toString(c) + " °F"; }

    // CToF converte uma temperatura em Celsius para Fahrenheit
    public static String CToF(double c) { return printTempFahrenheit((c*9)/5 + 32); }

    // FToC converte uma temperatura em Fahrenheit para Celsius
    public static String FToC(double f)  { return printTempCelsius((f - 32) * 5 / 9); }
}