public class GoalParser {
    public static String interpret(String command){
        String text;
        char[] array = new char[command.length()];
        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == '('){
                if(command.charAt(i + 1) == ')'){
                    array[i] = 'o';
                }
            }
            array[i] = command.charAt(i);
        }
        text = array.toString();
        return text;
    }
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command));
    }
}
