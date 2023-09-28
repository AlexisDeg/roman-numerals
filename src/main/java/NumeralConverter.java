import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumeralConverter {

    public final static int MIN_ROMAN_NUMERAL = 1;
    public final static int MAX_ROMAN_NUMERAL = 3000;
    public final static String ROMAN_NUMERAL_REGEXP = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";

    public static String convertToRomanNumeral(final int arabicNumeral) {
        StringBuilder romanNumeral = new StringBuilder();

        if (arabicNumeral < MIN_ROMAN_NUMERAL || arabicNumeral > MAX_ROMAN_NUMERAL) {
            throw new IllegalArgumentException("Roman numeral conversion available for numbers from" + MIN_ROMAN_NUMERAL + " to " + MAX_ROMAN_NUMERAL + " Unable to convert " + arabicNumeral);
        }

        int remainder = arabicNumeral;

        for (RomanNumeralCategory romanNumeralCategory : RomanNumeralCategory.values()) {
            romanNumeral.append(calculateRomanNumeral(remainder / romanNumeralCategory.getValue(), romanNumeralCategory));
            remainder %= romanNumeralCategory.getValue();
        }

        return romanNumeral.toString();
    }

    private static StringBuilder calculateRomanNumeral(final int arabicNumeral, final RomanNumeralCategory romanNumeralCategory) {
        StringBuilder romanNumeral = new StringBuilder();
        if (arabicNumeral == 4) {
            romanNumeral.append(romanNumeralCategory.getOneCharacter()).append(romanNumeralCategory.getFiveCharacter());
        } else if (arabicNumeral == 9) {
            romanNumeral.append(romanNumeralCategory.getOneCharacter()).append(romanNumeralCategory.getTenCharacter());
        } else {
            int remainder = arabicNumeral;
            if (remainder >= 5) {
                romanNumeral.append(romanNumeralCategory.getFiveCharacter());
                remainder -= 5;
            }
            romanNumeral.append(String.valueOf(romanNumeralCategory.getOneCharacter()).repeat(Math.max(0, remainder)));
        }
        return romanNumeral;
    }


    public static int convertToArabicNumeral(final String romanNumeral) {
        int arabicNumeral = 0;
        String str = romanNumeral;

        Pattern p = Pattern.compile(ROMAN_NUMERAL_REGEXP);
        Matcher m = p.matcher(romanNumeral);

        if (m.find()) {
            for (RomanNumeralCategory romanNumeralCategory : RomanNumeralCategory.values()) {
                if (str.startsWith(romanNumeralCategory.getOneCharacter().concat(romanNumeralCategory.getTenCharacter()))) {
                    arabicNumeral += (9 * romanNumeralCategory.getValue());
                    str = str.substring(2);
                } else if (str.startsWith(romanNumeralCategory.getFiveCharacter())) {
                    arabicNumeral += (5 * romanNumeralCategory.getValue());
                    str = str.substring(1);
                } else if (str.startsWith(romanNumeralCategory.getOneCharacter().concat(romanNumeralCategory.getFiveCharacter()))) {
                    arabicNumeral += (4 * romanNumeralCategory.getValue());
                    str = str.substring(2);
                }
                while (StringUtils.startsWith(str, romanNumeralCategory.getOneCharacter())) {
                    arabicNumeral += romanNumeralCategory.getValue();
                    str = str.substring(1);
                }
            }
        } else {
            throw new IllegalArgumentException("Incorrect roman numeral format. Unable to convert " + romanNumeral);
        }

        return arabicNumeral;
    }

}
