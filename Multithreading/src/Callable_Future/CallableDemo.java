package Callable_Future;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<Integer> {
    int input;

    public CallableDemo(int input) {
        this.input = input;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for(int i=0;i<=input;i++){
            sum = sum+i;
        }


        return sum;

    }
}
