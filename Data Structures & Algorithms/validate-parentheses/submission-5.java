class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char current = s.charAt(i);

            if(current == '(' || current == '{' || current == '['){
                brackets.push(current);
            } else {
                if (brackets.isEmpty()){
                    return false;
                }
                char top = brackets.pop();

                if (current == ')' && top != '('){
                    return false;
                }
                if (current == ']' && top != '['){
                    return false;
                }
                if (current == '}' && top != '{'){
                    return false;
                }

            }
        }

        return brackets.isEmpty();
        
    }
}
