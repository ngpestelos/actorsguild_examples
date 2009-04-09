package actors;

import org.actorsguildframework.Agent;
import org.actorsguildframework.DefaultAgent;

public class Main {

    public static void main(String[] args) {
        Agent a = new DefaultAgent();
        Counter c = a.create(Counter.class);
        //c.add(10).await();
        c.add(10);
        System.out.println("Counter value: " + c.getCount().get());
    }

}
