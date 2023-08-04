public class Main {
    public static void main(String[] args) {

        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();
        customArrayList.add(10); // 0
        customArrayList.add(11); // 1
        customArrayList.add(12); // 2
        customArrayList.add(13); // 3
        customArrayList.add(14); // 4

        System.out.println(customArrayList.get(2));
        System.out.println();
        System.out.println("삭제한 값 확인 : " + customArrayList.remove(2));
        System.out.println("삭제된 위치 확인 : " + customArrayList.get(2));
    }
}
