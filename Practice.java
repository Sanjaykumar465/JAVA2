class A {
    public static void main(String[] args) {
        int amount = 1000;
        if (amount / 10 == 0) {
            System.out.println("You can withdraw");
        } else {
            System.out.println("You cannot withdraw");
        }
    }
}

// switch case simple calculator

class R {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        char operator = '*';
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}

class P {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}

class B {
    public static void main(String[] args) {
        int num = 12545;
        int count = 0;
        for (int i = num; i > 0; i = i / 10) {
            count++;
        }
        System.out.println(count);
    }
}

// to find the sum of each digit
class C {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        int rem = 0;
        for (int i = num; i != 0; i = i / 10) {
            rem = i % 10;
            sum = sum + rem;
        }
        System.out.println(sum);

    }
}

// To find the product of the number
class D {
    public static void main(String[] args) {
        int num = 12345;
        int prod = 1;
        int rem = 0;
        for (int i = num; i != 0; i = i / 10) {
            rem = i % 10;
            prod = prod * rem;
        }
        System.out.println(prod);
    }
}

// spi number : if the sum of the each digit of a number is equal to the product
// of a number then thjat number is known as spy number

class E {
    public static void main(String[] args) {
        int num = 22;
        int sum = 0;
        int prod = 1;
        int rem = 1;

        for (int i = num; i != 0; i = i / 10) {
            rem = i % 10;
            sum = sum + rem;
            prod = prod * rem;
        }
        if (sum == prod) {
            System.out.println("Spy sunmber");
        } else {
            System.out.println("not spy number");
        }
    }

}

// Neon Number : if the sum of digit of a square root of a number is

class F {
    public static void main(String[] args) {
        int num = 9;
        int sqrt = num * num;
        int sum = 0;
        int rem = 1;
        for (int i = sqrt; i != 0; i = i / 10) {
            rem = i % 10;
            sum = sum + rem;

        }
        if (sum == num) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not Neon Number");
        }
    }
}

// while loop

// count digit

class G {
    public static void main(String[] args) {
        int num = 123;
        // int temp = 0;
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;

        }
        System.out.println(count);

    }
}

// addition of digit ofnumber

class H {
    public static void main(String[] args) {
        int num = 123568;
        int rem = 0;
        int sum = 0;

        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;

        }

        System.out.println(sum);

    }
}

// prod
class I {
    public static void main(String[] args) {
        int num = 223;
        int prod = 1;
        int rem = 0;
        while (num > 0) {
            rem = num % 10;
            prod = prod * rem;
            num = num / 10;
        }
        System.out.println(prod);
    }
}

// spy number

class J {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        int prod = 1;
        int rem = 0;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            prod = prod * rem;
            num = num / 10;
        }
        if (sum == prod) {
            System.out.println("spy");
        } else {
            System.out.println("not spy");
        }
    }
}

// neon Number

class K {
    public static void main(String[] args) {
        int num = 9;
        int sqrt = num * num;
        int sum = 0;
        int rem = 0;
        while (sqrt > 0) {
            rem = sqrt % 10;
            sum = sum + rem;
            sqrt = sqrt / 10;
        }
        if (sum == num) {
            System.out.println("Neon");
        } else {
            System.out.println("not");
        }
    }
}

// Niven Nuber

class L {
    public static void main(String[] args) {
        int num = 153;
        int num1 = num;
        int sum = 0;
        int rem = 0;
        while (num1 > 0) {
            rem = num1 % 10;
            sum = sum + rem;
            num1 = num1 / 10;
        }

        if (num % sum == 0) {
            System.out.println("Niven");
        } else {
            System.out.println("not niven");
        }

    }
}

// Reverse a number

class M {
    public static void main(String[] args) {
        int num = 123;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println(rev);
    }

}

// check a simgle number is Prime nunber or not
class N {
    public static void main(String[] args) {
        int num = 12;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}

// range between prime number from 3 to 9

class O {
    public static void main(String[] args) {
        int num = 9;
        for (int i = 3; i <= num; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}

//
class Q {
    public static void main(String[] args) {
        int num = 6;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime Nmber");
        } else {
            System.out.println("Not Prime");
        }
    }
}

class S {
    public static void main(String[] args) {
        int num = 9;
        for (int i = 3; i <= num; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}