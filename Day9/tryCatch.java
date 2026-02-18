public class tryCatch {
public static void main(String[] args) {
    int age=5;
    try{
        if(age<18){
            throw new ArithmeticException("Age is not valid to vote");
        }
        else{
            System.out.println("You are eligible to vote");
        }
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}    
}
