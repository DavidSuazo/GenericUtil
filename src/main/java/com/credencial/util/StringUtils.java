package com.credencial.util;

import static com.credencial.util.Constantes.LETTER_A;
import static com.credencial.util.Constantes.LETTER_A_ACCENTUATED;
import static com.credencial.util.Constantes.LETTER_E;
import static com.credencial.util.Constantes.LETTER_E_ACCENTUATED;
import static com.credencial.util.Constantes.LETTER_I;
import static com.credencial.util.Constantes.LETTER_I_ACCENTUATED;
import static com.credencial.util.Constantes.LETTER_N;
import static com.credencial.util.Constantes.LETTER_N_;
import static com.credencial.util.Constantes.LETTER_O;
import static com.credencial.util.Constantes.LETTER_O_ACCENTUATED;
import static com.credencial.util.Constantes.LETTER_U;
import static com.credencial.util.Constantes.LETTER_U_ACCENTUATED;
import static com.credencial.util.Constantes.LETTER_U_DIERESIS_CAPITAL;
import static com.credencial.util.Constantes.LETTER_U_DIERESIS_LOWER;
import static com.credencial.util.Constantes.MASK_ZEROS;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author cj_sr
 */
public class StringUtils {

    private static String CHARACTER_PIPE = "|";
    public static SimpleDateFormat simpleFormat_dmy_hms = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    public static String FORMAT_DATE_YY_MM_DD_SSz = "yyyy-MM-dd'T'HH:mm:ssZ";
    public final static String EMPTY_STRING = "";
    public static DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
    public static DateFormat dateFormatTime = new SimpleDateFormat("HHmmss");       
    public static DateFormat dateFormatYY_MM_DD_ss = new SimpleDateFormat("yyyyMMddHHmmss");

    public static boolean validaMailAddress(String email) {

        Pattern pattern;
        Matcher matcher;

        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);

        return matcher.matches();

    }

    public static String infoObject(Object object) {
        LinkedHashMap<String, Object> unsortMap = null;

        StringBuilder singFinal = new StringBuilder(CHARACTER_PIPE);
        try {
            object.getClass();
            Field[] fields = object.getClass().getDeclaredFields();
            unsortMap = new LinkedHashMap<String, Object>();
            for (Field field : fields) {
                field.setAccessible(true);
                unsortMap.put(field.getName().toString(), field.get(object));
            }
        } catch (IllegalArgumentException e1) {
            e1.printStackTrace();
            unsortMap = null;
        } catch (IllegalAccessException e1) {
            unsortMap = null;
            e1.printStackTrace();
        }
        if (unsortMap == null) {
            throw new RuntimeException("Error en la generacion de la firma!");
        }
        for (Map.Entry<String, Object> entry : unsortMap.entrySet()) {
            singFinal.append(entry.getKey());
            singFinal.append("=");
            singFinal.append(entry.getValue());
            singFinal.append(CHARACTER_PIPE);

        }
        return singFinal.toString();

    }

    public static String clearValue(String value) {
        value = value.toUpperCase();
        value = value.replace(LETTER_A_ACCENTUATED, LETTER_A);
        value = value.replace(LETTER_E_ACCENTUATED, LETTER_E);
        value = value.replace(LETTER_I_ACCENTUATED, LETTER_I);
        value = value.replace(LETTER_O_ACCENTUATED, LETTER_O);
        value = value.replace(LETTER_U_ACCENTUATED, LETTER_U);
        value = value.replace(LETTER_U_DIERESIS_LOWER, LETTER_U);
        value = value.replace(LETTER_U_DIERESIS_CAPITAL, LETTER_U);
        value = value.replace(LETTER_N_, LETTER_N);
        value = value.trim();

        return value;
    }

    public String setAmountCreditCardTransaction(String p_initialAmount, String p_commissionPercentage) {
        Double amountInitial, finalAmount, commissionPercentage = 0.00;

        amountInitial = Double.parseDouble(p_initialAmount);
        commissionPercentage = Double.parseDouble(p_commissionPercentage);

        finalAmount = amountInitial * commissionPercentage;

        return finalAmount.toString();
    }

    public String getAmountCreditCardTransaction(String p_initialAmount, String p_dollarValue, String p_multiCommission) {
        Double amountInitial, finalAmount, dollarValue, multiCommission, y = 0.00;

        amountInitial = Double.parseDouble(p_initialAmount);
        dollarValue = Double.parseDouble(p_dollarValue);
        multiCommission = Double.parseDouble(p_multiCommission);

        y = amountInitial * multiCommission * dollarValue;
        finalAmount = y;

        return finalAmount.toString();
    }

    public static boolean validateNullMap(Map<String, String> parameters, String key) {
        if (parameters.containsKey(key) && !parameters.get(key).isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public static String clearHour(String data) {

        data = data.toUpperCase();
        data = data.replace(Constantes.POINT, Constantes.EMPTY_STRING);
        data = data.replace(Constantes.SIMPLE_LETTER_A, Constantes.EMPTY_STRING);
        data = data.replace(Constantes.SIMPLE_LETTER_M, Constantes.EMPTY_STRING);
        data = data.replace(Constantes.SIMPLE_LETTER_P, Constantes.EMPTY_STRING);
        data = data.replace(Constantes.SPACE, Constantes.EMPTY_STRING);
        data = data.trim();

        return data;
    }

    public static boolean isExpired(int timeSpam) {
        // Timestamp stamp = new Timestamp(timeSpam);
        Date fechaToken = new Date(timeSpam);
        Date fechaActual = new Date();

        //comprueba si es que inicio esta después que fecha actual       
        if (fechaActual.after(fechaToken)) {
            return false;
        } else {
            return true;
        }
    }

    public static String formatAmount(String parameter) {
        if (parameter != null && !parameter.equals(EMPTY_STRING)) {
            Double value = Double.parseDouble(parameter.trim());
            return String.format("%.2f", value);
        } else {
            return "0.00";
        }
    }

    public static String maskCard(String card) {
        StringBuilder sb = new StringBuilder();

        int cardLength = card.length();

        String x = card.substring(0, 6);
        String y = MASK_ZEROS;
        String z = card.substring(cardLength - 4);

        System.out.println("cardLength = " + cardLength);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        sb.append(x);
        sb.append(y);
        sb.append(z);

        return sb.toString();
    }

    public static int generateRandomIntIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
