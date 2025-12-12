public class Sign {
    static void main() {
        Sign sign = new Sign("ABC222DE", 3);
        Sign sign2 = new Sign("ABCD", 10);
        Sign sign3 = new Sign("ABCDEF", 6);
        Sign sign4 = new Sign("", 4);
        Sign sign5 = new Sign("AB_CD_EF", 2);
        Sign sign6 = new Sign("ABCDEFGHIJK", 3);
        System.out.println(sign.numberOfLines());
        System.out.println(sign2.numberOfLines());
        System.out.println(sign3.numberOfLines());
        System.out.println(sign4.numberOfLines());
        System.out.println(sign5.numberOfLines());
        System.out.println(sign6.numberOfLines());
        System.out.println(sign.getlines());
        System.out.println(sign2.getlines());
        System.out.println(sign3.getlines());
        System.out.println(sign4.getlines());
        System.out.println(sign5.getlines());
        System.out.println(sign6.getlines());
    }
    private String message;
    private int width;
    public Sign(String message, int width){
        this.message = message;
        this.width = width;
    }
    public String getlines() {
         String ans = "";
        int counter = 0;
        if (message == null || message.isEmpty()) {
            return null;
        }
        for (int i = 0; i < message.length(); i++) {
            ans = ans + message.charAt(i);
            counter++;
            if (counter == width) {
                ans = ans + ";";
                counter = 0;
            }
        }
        return ans;
    }
    public int numberOfLines () {
        if (message == null || message.isEmpty()){
            return 0;
        }
        return (message.length() + width - 1) / width;
    }
}
