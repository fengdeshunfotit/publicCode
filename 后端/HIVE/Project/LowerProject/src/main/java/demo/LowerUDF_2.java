package demo;

import org.apache.hadoop.hive.ql.exec.UDF;

public class LowerUDF_2 extends UDF {
    public String evaluate(final String s) {
        if (s == null) {
            return null;
        }
        String returnString  = s+ "__测试函数";
        return returnString.toLowerCase();
    }
}
