package test;

public class loop_demo {

    public static void main(String[] args) {
//        while loop
        int i=10;
        while(i<=10){
            System.out.println(i);
            i++;
        }

//        do while loop
        int j=20;
        do{
            System.out.println(j);
            j++;
        }while(j>30);

//        for loop
        for(int x=0; x<10; x=x+3){
            if(x==9){
                System.out.println("X value is equal to 9");
            } else {
                System.out.println("I didn't find value");
            }
        }
    }
}
