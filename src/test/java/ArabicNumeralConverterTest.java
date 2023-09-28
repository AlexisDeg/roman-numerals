import org.junit.Assert;
import org.junit.Test;

public class ArabicNumeralConverterTest {

    @Test
    public void should_throw_illegal_argument_exception_if_roman_numeral_is_incorrect() {
        try {
            NumeralConverter.convertToArabicNumeral("XXXXIIII");
            Assert.fail("IllegalArgumentException should have been thrown");
        } catch (IllegalArgumentException iae) {
            Assert.assertNotNull(iae);
        }
    }

    @Test
    public void should_convert_I_to_1() {
        int result = NumeralConverter.convertToArabicNumeral("I");
        Assert.assertEquals(1, result);
    }

    @Test
    public void should_convert_II_to_2() {
        int result = NumeralConverter.convertToArabicNumeral("II");
        Assert.assertEquals(2, result);
    }

    @Test
    public void should_convert_III_to_3() {
        int result = NumeralConverter.convertToArabicNumeral("III");
        Assert.assertEquals(3, result);
    }

    @Test
    public void should_convert_IV_to_4() {
        int result = NumeralConverter.convertToArabicNumeral("IV");
        Assert.assertEquals(4, result);
    }

    @Test
    public void should_convert_V_to_5() {
        int result = NumeralConverter.convertToArabicNumeral("V");
        Assert.assertEquals(5, result);
    }

    @Test
    public void should_convert_VI_to_6() {
        int result = NumeralConverter.convertToArabicNumeral("VI");
        Assert.assertEquals(6, result);
    }

    @Test
    public void should_convert_VII_to_7() {
        int result = NumeralConverter.convertToArabicNumeral("VII");
        Assert.assertEquals(7, result);
    }

    @Test
    public void should_convert_VIII_to_8() {
        int result = NumeralConverter.convertToArabicNumeral("VIII");
        Assert.assertEquals(8, result);
    }

    @Test
    public void should_convert_IX_to_9() {
        int result = NumeralConverter.convertToArabicNumeral("IX");
        Assert.assertEquals(9, result);
    }

    @Test
    public void should_convert_X_to_10() {
        int result = NumeralConverter.convertToArabicNumeral("X");
        Assert.assertEquals(10, result);
    }

    @Test
    public void should_convert_XIII_to_13() {
        int result = NumeralConverter.convertToArabicNumeral("XIII");
        Assert.assertEquals(13, result);
    }

    @Test
    public void should_convert_XIV_to_14() {
        int result = NumeralConverter.convertToArabicNumeral("XIV");
        Assert.assertEquals(14, result);
    }

    @Test
    public void should_convert_XVII_to_17() {
        int result = NumeralConverter.convertToArabicNumeral("XVII");
        Assert.assertEquals(17, result);
    }

    @Test
    public void should_convert_XVIII_to_18() {
        int result = NumeralConverter.convertToArabicNumeral("XVIII");
        Assert.assertEquals(18, result);
    }

    @Test
    public void should_convert_XXIV_to_24() {
        int result = NumeralConverter.convertToArabicNumeral("XXIV");
        Assert.assertEquals(24, result);
    }

    @Test
    public void should_convert_XXX_to_30() {
        int result = NumeralConverter.convertToArabicNumeral("XXX");
        Assert.assertEquals(30, result);
    }

    @Test
    public void should_convert_XXXII_to_32() {
        int result = NumeralConverter.convertToArabicNumeral("XXXII");
        Assert.assertEquals(32, result);
    }

    @Test
    public void should_convert_XXXVII_to_37() {
        int result = NumeralConverter.convertToArabicNumeral("XXXVII");
        Assert.assertEquals(37, result);
    }

    @Test
    public void should_convert_XXXIX_to_39() {
        int result = NumeralConverter.convertToArabicNumeral("XXXIX");
        Assert.assertEquals(39, result);
    }

    @Test
    public void should_convert_XL_to_40() {
        int result = NumeralConverter.convertToArabicNumeral("XL");
        Assert.assertEquals(40, result);
    }

    @Test
    public void should_convert_L_to_50() {
        int result = NumeralConverter.convertToArabicNumeral("L");
        Assert.assertEquals(50, result);
    }

    @Test
    public void should_convert_LXIV_to_64() {
        int result = NumeralConverter.convertToArabicNumeral("LXIV");
        Assert.assertEquals(64, result);
    }

    @Test
    public void should_convert_LXXXIX_to_89() {
        int result = NumeralConverter.convertToArabicNumeral("LXXXIX");
        Assert.assertEquals(89, result);
    }

    @Test
    public void should_convert_CCXLIV_to_244() {
        int result = NumeralConverter.convertToArabicNumeral("CCXLIV");
        Assert.assertEquals(244, result);
    }

    @Test
    public void should_convert_CDLXXXIII_to_483() {
        int result = NumeralConverter.convertToArabicNumeral("CDLXXXIII");
        Assert.assertEquals(483, result);
    }

    @Test
    public void should_convert_DCXCIX_to_699() {
        int result = NumeralConverter.convertToArabicNumeral("DCXCIX");
        Assert.assertEquals(699, result);
    }

    @Test
    public void should_convert_MCCCXCIV_to_1394() {
        int result = NumeralConverter.convertToArabicNumeral("MCCCXCIV");
        Assert.assertEquals(1394, result);
    }

    @Test
    public void should_convert_MMCDXC_to_2490() {
        int result = NumeralConverter.convertToArabicNumeral("MMCDXC");
        Assert.assertEquals(2490, result);
    }

}
