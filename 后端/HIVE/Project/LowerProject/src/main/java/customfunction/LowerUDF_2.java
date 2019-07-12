package customfunction;

import org.apache.hadoop.hive.ql.exec.UDF;

/**
 * 自定义函数
 */
public class LowerUDF_2 extends UDF {
    public String evaluate(final String s) {
        if (s == null) {
            return null;
        }
        String returnString  = s+ "__测试函数";
        return returnString.toLowerCase();
    }
}
