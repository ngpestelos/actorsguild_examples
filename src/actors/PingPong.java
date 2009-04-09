package actors;

import org.actorsguildframework.Actor;
import org.actorsguildframework.Agent;
import org.actorsguildframework.AsyncResult;
import org.actorsguildframework.DefaultAgent;
import org.actorsguildframework.annotations.Message;

public class PingPong {

    public static void main(String[] args) {
        Agent agent = new DefaultAgent();
        Ping ping = agent.create(Ping.class);
        Pong pong = agent.create(Pong.class);
        System.out.println(pong.start(ping).get());
        System.exit(0);
    }

}

class Pong extends Actor {

    @Message
    public AsyncResult<String> start(Ping p) {
        return p.ping();
    }

}

class Ping extends Actor {

    @Message
    public AsyncResult<String> ping() {
        return result("Pong!");
    }
}
