import java.util.Stack;

public class 力扣20 {
    public boolean isVaid(String s){
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(char ch:chars){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch); // ch => Character 装箱 自动装箱
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char left = stack.pop();//Character => ch 拆箱 自动拆箱
                if(left == '(' && ch == ')'){

                }else if(left == '[' && ch == ']'){

                }else if(left == '{' && ch == '}'){

                }else {
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }
}
