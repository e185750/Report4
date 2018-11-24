public class Main {
    public static void main(String[] args) {
        String str = null;
        try {
            int len = str.length();
            System.out.println(len);
        } catch (NullPointerException e) {
            System.out.println("例外が発生しました。");
            System.out.println(e.getMessage());
        }
    }


}
