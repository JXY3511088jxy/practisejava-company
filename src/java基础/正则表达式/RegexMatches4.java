package java基础.正则表达式;
/**
 * appendReplacement 和 appendTail 方法
 * Matcher 类也提供了appendReplacement 和 appendTail 方法用于文本替换
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches4 {
    private static String REGEX = "a*b";
    private static String INPUT = "aabfooaabfooabfoobkkk";
    private static String REPLACE = "-";
    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        // 获取 matcher 对象
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while(m.find()){
            m.appendReplacement(sb,REPLACE);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}
