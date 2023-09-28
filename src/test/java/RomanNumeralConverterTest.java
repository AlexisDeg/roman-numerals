import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralConverterTest {

    @Test
    public void should_throw_illegal_argument_exception_if_arabic_number_is_negative() {
        try {
            NumeralConverter.convertToRomanNumeral(-1);
            Assert.fail("IllegalArgumentException should have been thrown");
        } catch (IllegalArgumentException iae) {
            Assert.assertNotNull(iae);
        }
    }

    @Test
    public void should_throw_illegal_argument_exception_if_arabic_number_is_greater_than_3000() {
        try {
            NumeralConverter.convertToRomanNumeral(3001);
            Assert.fail("IllegalArgumentException should have been thrown");
        } catch (IllegalArgumentException iae) {
            Assert.assertNotNull(iae);
        }
    }

    @Test
    public void should_convert_1_to_I() {
        String result = NumeralConverter.convertToRomanNumeral(1);
        Assert.assertEquals("I", result);
    }

    @Test
    public void should_convert_2_to_II() {
        String result = NumeralConverter.convertToRomanNumeral(2);
        Assert.assertEquals("II", result);
    }

    @Test
    public void should_convert_3_to_III() {
        String result = NumeralConverter.convertToRomanNumeral(3);
        Assert.assertEquals("III", result);
    }

    @Test
    public void should_convert_4_to_IV() {
        String result = NumeralConverter.convertToRomanNumeral(4);
        Assert.assertEquals("IV", result);
    }

    @Test
    public void should_convert_5_to_V() {
        String result = NumeralConverter.convertToRomanNumeral(5);
        Assert.assertEquals("V", result);
    }

    @Test
    public void should_convert_6_to_VI() {
        String result = NumeralConverter.convertToRomanNumeral(6);
        Assert.assertEquals("VI", result);
    }

    @Test
    public void should_convert_7_to_VII() {
        String result = NumeralConverter.convertToRomanNumeral(7);
        Assert.assertEquals("VII", result);
    }

    @Test
    public void should_convert_8_to_VIII() {
        String result = NumeralConverter.convertToRomanNumeral(8);
        Assert.assertEquals("VIII", result);
    }

    @Test
    public void should_convert_9_to_IX() {
        String result = NumeralConverter.convertToRomanNumeral(9);
        Assert.assertEquals("IX", result);
    }

    @Test
    public void should_convert_10_to_X() {
        String result = NumeralConverter.convertToRomanNumeral(10);
        Assert.assertEquals("X", result);
    }

    @Test
    public void should_convert_13_to_XIII() {
        String result = NumeralConverter.convertToRomanNumeral(13);
        Assert.assertEquals("XIII", result);
    }

    @Test
    public void should_convert_14_to_XIV() {
        String result = NumeralConverter.convertToRomanNumeral(14);
        Assert.assertEquals("XIV", result);
    }

    @Test
    public void should_convert_17_to_XVII() {
        String result = NumeralConverter.convertToRomanNumeral(17);
        Assert.assertEquals("XVII", result);
    }

    @Test
    public void should_convert_18_to_XVIII() {
        String result = NumeralConverter.convertToRomanNumeral(18);
        Assert.assertEquals("XVIII", result);
    }

    @Test
    public void should_convert_24_to_XXIV() {
        String result = NumeralConverter.convertToRomanNumeral(24);
        Assert.assertEquals("XXIV", result);
    }

    @Test
    public void should_convert_30_to_XXX() {
        String result = NumeralConverter.convertToRomanNumeral(30);
        Assert.assertEquals("XXX", result);
    }

    @Test
    public void should_convert_32_to_XXXII() {
        String result = NumeralConverter.convertToRomanNumeral(32);
        Assert.assertEquals("XXXII", result);
    }

    @Test
    public void should_convert_37_to_XXXVII() {
        String result = NumeralConverter.convertToRomanNumeral(37);
        Assert.assertEquals("XXXVII", result);
    }

    @Test
    public void should_convert_39_to_XXXIX() {
        String result = NumeralConverter.convertToRomanNumeral(39);
        Assert.assertEquals("XXXIX", result);
    }

    @Test
    public void should_convert_40_to_XL() {
        String result = NumeralConverter.convertToRomanNumeral(40);
        Assert.assertEquals("XL", result);
    }

    @Test
    public void should_convert_50_to_L() {
        String result = NumeralConverter.convertToRomanNumeral(50);
        Assert.assertEquals("L", result);
    }

    @Test
    public void should_convert_64_to_LXIV() {
        String result = NumeralConverter.convertToRomanNumeral(64);
        Assert.assertEquals("LXIV", result);
    }

    @Test
    public void should_convert_89_to_LXXXIX() {
        String result = NumeralConverter.convertToRomanNumeral(89);
        Assert.assertEquals("LXXXIX", result);
    }

    @Test
    public void should_convert_244_to_LXXXIX() {
        String result = NumeralConverter.convertToRomanNumeral(244);
        Assert.assertEquals("CCXLIV", result);
    }

    @Test
    public void should_convert_483_to_CDLXXXIII() {
        String result = NumeralConverter.convertToRomanNumeral(483);
        Assert.assertEquals("CDLXXXIII", result);
    }

    @Test
    public void should_convert_699_to_DCXCIX() {
        String result = NumeralConverter.convertToRomanNumeral(699);
        Assert.assertEquals("DCXCIX", result);
    }

    @Test
    public void should_convert_1394_to_MCCCXCIV() {
        String result = NumeralConverter.convertToRomanNumeral(1394);
        Assert.assertEquals("MCCCXCIV", result);
    }

    @Test
    public void should_convert_2490_to_MMCDXC() {
        String result = NumeralConverter.convertToRomanNumeral(2490);
        Assert.assertEquals("MMCDXC", result);
    }

}
