public class Main {
    public int result;
    Main(){
        result = 0;
    }

    //returns addition of two integers
    public int add(int a,int b){
        result = a+b;
        return result;
    }
    // Subtraction method
    public int sub(int a, int b){
        result = a-b;
        return result;
    }

    public int mult(int a, int b){
        result = a*b;
        return result;
    }

    public int div(int a, int b){
        result =a/b;
        return result;
    }

    public int setResult(int a){
        return a;
    }

    public int getResult(){
        result=0;
        return result;
    }


}

