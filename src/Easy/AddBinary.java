package Easy;

public class AddBinary {
    public static String addBinary(String a, String b) {
        StringBuilder answer = new StringBuilder();

        int carry = 0;
        int a_pointer = a.length() - 1;
        int b_pointer = b.length() - 1;
        while(a_pointer >= 0 || b_pointer >= 0) {
            int sum;

            if(a_pointer < 0) {
                sum = Integer.parseInt(String.valueOf(b.charAt(b_pointer))) + carry;
            } else if(b_pointer < 0) {
                sum = Integer.parseInt(String.valueOf(a.charAt(a_pointer))) + carry;
            } else {
                sum = Integer.parseInt(String.valueOf(a.charAt(a_pointer))) + Integer.parseInt(String.valueOf(b.charAt(b_pointer))) + carry;
            }

            switch (sum) {
                case 0:
                    answer.insert(0, 0);
                    carry = 0;
                    break;
                case 1:
                    answer.insert(0, 1);
                    carry = 0;
                    break;
                case 2:
                    answer.insert(0, 0);
                    carry = 1;
                    break;
                case 3:
                    answer.insert(0, 1);
                    carry = 1;
                    break;
            }

            a_pointer--;
            b_pointer--;
        }

        if(carry == 1) {
            answer.insert(0, 1);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("0",  "0"));
    }
}
