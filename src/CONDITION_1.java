//public class CONDITION_1 {
//    public static void main(String[] args) {
//        int salary = 25000;
//        if(salary > 5000){
//            salary = salary + 2000;
//        }
//        else
//            salary = salary+1000;
//        System.out.println(salary);
//    }
//}

public class CONDITION_1 {
    public static void main(String[] args) {
        int salary = 25000;
        if(salary > 55000){
            salary += 2000; //salary = salary + 2000;
        }else if(salary>20000){
            salary += 5000;
        }else{
            salary+=3000;
        }
        System.out.println(salary);
    }
}