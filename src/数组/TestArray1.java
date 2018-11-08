package 数组;

public class TestArray1 {
    public static void main(String[] args) {
        double[] myList = new double[]{1.9,2.9,3.4,3.5};
        //打印所有数组元素
        for (int i = 0;i<myList.length;i++){
            System.out.println(myList[i]);
        }
        //计算所有元素的总和
        double total = 0;
        for (int i = 0;i<myList.length;i++){
            total+=myList[0];
        }
        System.out.println("Total is"+total);
        //查找最大元素
        double max = myList[0];
        for (int i=0;i<myList.length;i++){
            if (myList[i]>max){
                max=myList[i];
            }
        }
        System.out.println("Max is"+max);
    }
}
