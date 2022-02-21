class addStringsSolution {

    public static String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int pointer_one = num1.length() - 1;
        int pointer_two = num2.length() - 1;
        int carry = 0;

        while (pointer_one >= 0 || pointer_two >= 0) {
            int sum = carry;
            if (pointer_one >= 0) {
                sum += num1.charAt(pointer_one--) - '0';
            }
            if (pointer_two >= 0) {
                sum += num2.charAt(pointer_two--) - '0';
            }

            res.append(sum % 10);
            carry = sum / 10;
        }

        if (carry != 0) {
            res.append(carry);
        }

        return res.reverse().toString();

    }

    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        System.out.println(addStrings(num1, num2));
    }
}
