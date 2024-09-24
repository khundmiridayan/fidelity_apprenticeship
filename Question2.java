public class Question2 {
    public static void main(String[] args) {
        for (int i=1; i<=4; i++){
            System.out.println(generatePatternElement(i));
        }
    }
    public static String generatePatternElement(int n){
        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=n; i++){
            sb.append(i);
        }
        return sb.toString();
    }
}
