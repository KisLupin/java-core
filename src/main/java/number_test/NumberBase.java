package number_test;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberBase {
    public void init(){
        NumberFormat currentLocale = NumberFormat.getInstance();
        //của khu vực mặc định của máy ảo JVM
        // sử dụng phương thức format()
        double doubleNumber = 10.08d;
        String str = currentLocale.format(doubleNumber);
        System.out.println("Số " + doubleNumber + " sau khi định dạng = " + str);

        // tạo 1 NumberFormat để định dạng số theo tiêu chuẩn của nước Anh
        Locale localeEN = new Locale("en", "EN");
        NumberFormat en = NumberFormat.getInstance(localeEN);

        // đối với số có kiểu long được định dạng theo chuẩn của nước Anh
        // thì phần ngàn của số được phân cách bằng dấu phẩy
        long longNumber = 12345678L;
        String str1 = en.format(longNumber);
        System.out.println("Số " + longNumber + " sau khi định dạng = " + str1);

        // tạo 1 NumberFormat để định dạng số theo tiêu chuẩn của Việt Nam
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat vn = NumberFormat.getInstance(localeVN);

        // đối với số float được định dạng theo chuẩn của Việt am
        // thì phần thập phân của số được phân cách bằng dấu phẩy
        double doubleNumber1 = 10.17d;
        String str2 = vn.format(doubleNumber1);
        System.out.println("Số " + doubleNumber1 + " sau khi định dạng = " + str2);
    }

    public void getLocateDetail(){
        Locale currentLocale = Locale.getDefault();

        // getDisplayLanguage() trả về tên ngôn ngữ của currentLocale
        // getDislayCountry() trả về tên quốc gia của currentLocale
        System.out.println(currentLocale.getDisplayLanguage());
        System.out.println(currentLocale.getDisplayCountry());

        // getLanguage() trả về mã ngôn ngữ của currentLocale
        // getCountry() trả về mã quốc gia của currentLocale
        System.out.println(currentLocale.getLanguage());
        System.out.println(currentLocale.getCountry());

        // getProperty() trả về chuỗi bao gồm các thông tin của hệ thống
        // user.country là quốc gia
        // user.language là ngôn ngữ
        System.out.println(System.getProperty("user.country"));
        System.out.println(System.getProperty("user.language"));
    }

    public void formatCurrency(){
        double currency = 101.99;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        String str = currencyFormat.format(currency);
        System.out.println("Số " + currency + " sau khi định dạng = " + str);

        long vnd = 100000L;

   // tạo 1 NumberFormat để định dạng tiền tệ theo tiêu chuẩn của Việt Nam
 // đơn vị tiền tệ của Việt Nam là đồng
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String str1 = currencyVN.format(vnd);
        System.out.println("Số " + vnd + " sau khi định dạng = " + str1);
    }

    public void setCurrency(){
        double doubleNumber = 6.32d;

        Locale locale = new Locale("de", "DE");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String str1 = numberFormat.format(doubleNumber);
        System.out.println("Số " + doubleNumber + " sau khi định dạng = " + str1);

        // thay đổi từ định dạng tiền tệ theo tiêu chuẩn của Đức
        // sang định dạng tiền tệ theo tiêu chuẩn của Việt Nam
        // sử dụng phương thức setCurrency()
        // Currency.getInstance() sẽ trả về tiền tệ cho 1 quốc gia nào đó (ở đây là Việt Nam)
        Locale localeVN = new Locale("vi", "VN");
        numberFormat.setCurrency(Currency.getInstance(localeVN));
        String str2 = numberFormat.format(doubleNumber);
        System.out.println("Số " + doubleNumber + " sau khi định dạng = " + str2);
    }

    public void percentNum(){
        double percentageDoubleNumber = 0.758d;

        // định dạng số percentageDoubleNumber ở dạng phần trăm
        // theo khu vực mặc định của máy ảo JVM
        // khu vực mặc định này là nước Mỹ
        // lưu ý là phần trăm của số sẽ được làm tròn
        NumberFormat numEN = NumberFormat.getPercentInstance();
        String percentageEN = numEN.format(percentageDoubleNumber);
        System.out.println("Số " + percentageDoubleNumber + " ở dạng phần trăm = " + percentageEN);
    }

    public void roundingMode(){
        NumberFormat numf = NumberFormat.getNumberInstance();
        numf.setMaximumFractionDigits(2);   // làm tròn đến 2 chữ số phần thập phân

        // RoundingMode.UP: làm tròn lên
        numf.setRoundingMode(RoundingMode.UP);
        System.out.println("Chế độ làm tròn: " + numf.getRoundingMode());
        System.out.println("523.454 sau khi làm tròn = " + numf.format(523.454));
        System.out.println("733.455 sau khi làm tròn = " + numf.format(733.455));
        System.out.println("823.456 sau khi làm tròn = " + numf.format(823.456));

        // RoundingMode.DOWN: làm tròn xuống
        numf.setRoundingMode(RoundingMode.DOWN);
        System.out.println("\nChế độ làm tròn: " + numf.getRoundingMode());
        System.out.println("523.454 sau khi làm tròn = " + numf.format(523.454));
        System.out.println("733.455 sau khi làm tròn = " + numf.format(733.455));
        System.out.println("823.456 sau khi làm tròn = " + numf.format(823.455));
    }

    public void decimalFormat(){
        double doubleNumber = 1.223d;

        // khai báo 1 DecimalFormat có tên là dcf
        // để định dạng số doubleNumber theo mẫu "#.##"
        // tức là phần thập phân của số doubleNumber sau khi định dạng sẽ có 2 chữ số
        DecimalFormat dcf = new DecimalFormat("#.####");
        System.out.println("Số " + doubleNumber + " sau khi định dạng = " +
                dcf.format(doubleNumber));
    }

    public void decimalFormatLocate(){
        double floatNumber = 232323.1523545d;

        // tạo 1 DecimalFormat để định dạng số theo tiêu chuẩn của nước Anh
        Locale locale = new Locale("en", "EN");

        // khai báo 1 DecimalFormat có tên là dcf
        // để định dạng số floatNumber theo mẫu "####,###.##"
        // tức là phần thập phân của số floatNumber sau khi định dạng sẽ có 2 chữ số
        // và phần ngàn của số sẽ được phân cách bằng dấu phẩy
        // lưu ý: trong pattern chúng ta nhận thấy phần đứng trước dấu thập phân có 7 chữ số
        // trong khi số floatNumber của chúng ta có 6 chữ số ở phần nguyên
        // vì vậy đối với DecimalFormat thì tất cả các chữ số ở phần nguyên
        // là bất kỳ và không phụ thuộc vào số chữ số phần nguyên được khai báo trong pattern
        // nhưng phần thập phân của số phải bằng với phần thập phân của pattern
        String pattern = "###,###.####";
        DecimalFormat dcf = (DecimalFormat) NumberFormat.getNumberInstance(locale);
        dcf.applyPattern(pattern);  // áp dụng mẫu pattern = "###.##" cho dcf
        System.out.println("Số " + floatNumber + " sau khi định dạng = " +
                dcf.format(floatNumber));
    }

    public void currencyAndPercent(){
        long currency = 25000L;
        String patternCurrency = "$###";    // khi hiển thị sẽ có ký tự "$" đứng đầu
        DecimalFormat dcfCurrency = new DecimalFormat(patternCurrency);
        String strCurrency = dcfCurrency.format(currency);
        System.out.println("Số " + currency + " sau khi định dạng ở dạng tiền tệ = " + strCurrency);

        // định dạng số ở dạng phần trăm
        double percent = 0.082d;

        // định dạng số với 2 chữ số ở phần thập phân
        // còn phần nguyên không phụ thuộc vào phần nguyên được khai báo trong pattern
        String patternPercent = "###.##%";  // khi hiển thị sẽ có ký tự "%" đứng cuối
        DecimalFormat dcfPercent = new DecimalFormat(patternPercent);
        String strPercent = dcfPercent.format(percent);
        System.out.println("Số " + percent + " sau khi định dạng ở dạng phần trăm = " + strPercent);
    }


}
