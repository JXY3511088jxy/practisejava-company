package Apachejmeter;

import org.apache.jmeter.config.Arguments;      //这个位置注意，可有可能自动导入的是jdk的同名类，导致脚本报错
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

public class TestNum extends AbstractJavaSamplerClient {
    // SampleResult类封装了从入口样本返回的各种信息
    private SampleResult results;
    // 输入的数字
    private String inNum;
    // 需要匹配的数字
    private String resultNum;

    // 用于设置传入的参数，可以设置多个，已设置的参数会显示到Jmeter参数列表中
    // Arguments类表示一组参数对象
    public Arguments getDefaultParameters() {
        // 声明定义Arguments类
        Arguments params = new Arguments();
        // 添加一个新参数
        params.addArgument("inNum", "");
        params.addArgument("resultNum", "66");
        return params;
    }

    // 初始化方法，用于初始化性能测试时的每个线程，实际运行时每个线程仅执行一次
    //
    // JavaSamplerContext类用于向JavaSamplerClient实现提供上下文信息
    // 这当前由在GUI中指定的初始化参数组成，其他数据将来可以通过JavaSamplerContext访问
    public void setupTest(JavaSamplerContext jsc) {
        // 定义SampleResult类
        results = new SampleResult();
        // 以String形式获取指定参数的值，或者如果未指定该值，则返回指定的默认值
        inNum = jsc.getParameter("inNum", "");
        resultNum = jsc.getParameter("resultNum", "");
        if (inNum != null && inNum.length() > 0) {
            // 设置采样器数据
            results.setSamplerData(inNum);
        }
        if (resultNum != null && resultNum.length() > 0) {
            results.setSamplerData(resultNum);
        }
    }

    // 性能测试时的线程运行体，即测试执行的循环体，根据线程数和循环次数的不同可执行多次
    public SampleResult runTest(JavaSamplerContext arg0) {
        boolean flag = false;
        // 定义一个事务，表示这是事务的起始点
        results.sampleStart();
        for (int i = inNum.length(); --i >= 0; ) {
            // 使用isDigit判断是否为数字，charAt方法用于返回指定索引处的字符
            if (!Character.isDigit(inNum.charAt(i))) {
                flag = false;
            } else {
                flag = true;
            }
        }
        for (int j = resultNum.length(); --j >= 0; ) {
            if (!Character.isDigit(resultNum.charAt(j))) {
                flag = false;
            } else {
                flag = true;
            }
        }
        // 定义一个事务，表示这是事务的结束点
        results.sampleEnd();
        if (flag) {
            Integer num = Integer.parseInt(inNum);
            Integer rsNum = Integer.parseInt(resultNum);
            if (num == rsNum) {
                // 设置SampleResult对象的编码和响应数据
                results.setResponseData("恭喜你，答对了O(∩_∩)O~\n答案是【" + resultNum + "】", "UTF-8");
                // 设置SampleResult对象的成功属性，即返回正确还是错误
                results.setSuccessful(true);
            } else if (num > rsNum) {
                results.setResponseData("好像大了点~~~~(>_<)~~~~ \n您输入的是【" + inNum + "】", "UTF-8");
                results.setSuccessful(false);
            } else {
                results.setResponseData("好像小了点~~~~(>_<)~~~~ \n您输入的是【" + inNum + "】", "UTF-8");
                results.setSuccessful(false);
            }
        } else {
            results.setResponseData("请输入数字：~~~~(>_<)~~~~ \n您输入的inNum是【" + inNum + "】，resultNum是【" + resultNum + "】", "UTF-8");
            results.setSuccessful(false);
        }
        return results;
    }

    // 测试结束方法，用于结束性能测试中的每个线程，实际运行时，每个线程仅执行一次，在测试方法运行结束后执行
    public void teardownTest(JavaSamplerContext arg0) {
    }
}