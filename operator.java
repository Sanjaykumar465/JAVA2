// class A {
//    public static void main(String[] args) {
//       int x = 10;
//       int y = 20;
//       if (++x < 10 & ++y < 20) {
//          ++x;
//       } else {
//          ++y;

//       }
//       System.out.println(x);
//       System.out.println(y);
//    }
// }

// // Ternary
// class B {
//    public static void main(String[] args) {
//       System.out.println(10 < 20 ? 10 : 20);
//    }

// }

// class C {
//    public static void main(String[] args) {
//       int num = 12354555;
//       int num2 = num % 10;
//       int num1 = num / 10;
//       System.out.println(num1);
//    }
// }

// class Test {
//    public static void main(String[] args) {
//       final int a = 10;
//       a = 20;

//       System.out.println(true ^ true); // false
//       System.out.println(true ^ false); // true
//       System.out.println(false ^ true); // true
//       System.out.println(false ^ false); // false

//    }
// }

// class E {
//    public static void main(String[] args) {
//       char operator = '%';
//       int x = 10;
//       int y = 20;
//       if (operator == '+') {
//          System.out.println(" " +(x + y));
//       } else if (operator == '-') {
//          System.out.println(x - y);
//       } else if (operator == '*') {
//          System.out.println(x * y);
//       } else if (operator == '/') {
//          System.out.println(x / y);
//       } else {
//          System.out.println(x % y);
//       }
//    }
// }

// class sallery {
//       public static void main(String[] args) {
//             int sal = 1500000;
//             if (sal >= 0 & sal <= 400000) {
//                   System.out.println("No Need to Pay Tax");
//             } else if (sal > 400000 & sal < 800000) {
//                   System.out.println("Tax to be paid is : " + sal * 5 / 100);
//             } else if (sal > 800000 & sal < 1200000) {
//                   System.out.println("tax to be paid is : " + sal * 10 / 100);
//             } else if (sal > 1200000 & sal < 1600000) {
//                   System.out.println("Tax to be paid is : " + sal * 15 / 100);
//             } else if (sal > 1600000 & sal < 2000000) {
//                   System.out.println("Tax to be paid is : " + sal * 20 / 100);
//             } else if (sal > 2000000 & sal < 2500000) {
//                   System.out.println("Tax to be paid is : " + sal * 25 / 100);
//             } else {
//                   System.out.println("Tax to be paid is : " + sal * 30 / 100);
//             }
//       }
// }

//check 3 and 5 divisibi

// Homework

//  cla

class Week {
      public static void main(String[] args) {
            boolean weekend = true;
            int age = 54;
            if(age <= 10) {
                 if (weekend == true) {
                       System.out.println("100");
                 } else {
                       System.out.println("80");
                 }
            } 
            else if (age > 10 && age < 55) {
                  if(weekend == true) {
                        System.out.println("200");
                  } else {
                        System.out.println("180");
                  }
             }  else if(age > 55) {
                  if(weekend == true) {
                        System.out.println("300");
                  } else {
                        System.out.println("280");
                  }
             }

      }
}

class P {
      public static void main(String[] args) {
            int x = 97;
            switch (x) {
                  case 'x':
                        System.out.println("10");
                        break;
                  case 97:
                        System.out.println("20");
                        break;
                  case 30:
                        System.out.println("30");
                        break;
                  default:
                        System.out.println("default");
                        break;
            }
      }
}

class Q {
      public static void main(String[] args) {
            int week = 1;
            switch (week) {
                  case 1:
                        System.out.println("Sunday");
                        break;
                  case 2:
                        System.out.println("Monday");
                        break;
                  case 3:
                        System.out.println("Tuesday");
                        break;
                  default:
                        System.out.println("default");
                        break;
            }
      }
}

class Z {
      public static void main(String[] args) {
            int mark = 90;
            switch (mark) {
                  case 60:
                        System.out.println("Fail");
                        break;
                  case 70:
                        System.out.println("Good");
                        break;
                  case 80:
                        System.out.println("Very Good");
                        break;
                  case 90:
                        System.out.println("Excellent");
                        break;
                  default:
                        System.out.println("Invalid");
                        break;

            }
      }

}