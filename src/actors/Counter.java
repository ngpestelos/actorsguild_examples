package actors;

import org.actorsguildframework.Actor;
import org.actorsguildframework.AsyncResult;
import org.actorsguildframework.annotations.Message;


public class Counter extends Actor {

    private int count;

    @Message
    public AsyncResult<Integer> getCount() {
        return result(count);
    }

    @Message
    public AsyncResult<Void> add(int a) {
        count = count + a;
        return noResult();
    }

}
