public class Fin02_412637141 {

    public static void main(String[] args) {  //學號412637141 姓名:陳柏安
        int[] list1 = {1, 4, 5, 8, 9};
        int[] list2 = {2, 4, 6, 8};

        int[] res = intersect(list1, list2);

        System.out.print("交集結果: ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
            if (i < res.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static int[] intersect(int[] list1, int[] list2) {
        int[] tmp = new int[list1.length];
        int index = 0;

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i] == list2[j]) {
                    tmp[index++] = list1[i];
                    break;
                }
            }
        }

        int[] res = new int[index];
        for (int k = 0; k < index; k++) {
            res[k] = tmp[k];
        }

        return res;
    }
}

