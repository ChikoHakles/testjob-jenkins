public class Kata1 {
    public static void main(String[] args) {
        System.out.println(solution("samurai", "rai"));
    }
    public static boolean solution(String str, String ending) {
        if(ending.length() > str.length()) {
            return false;
        }
        return str.endsWith(ending);
    }
}
