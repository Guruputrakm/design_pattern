package com.patterns.chainofresponsibality;

interface Handler2 {
    Handler2 setHandler(Handler2 handler);
    boolean handle(Req r);
}
abstract class BaseHandler2 implements Handler2 {
    Handler2 next;
    @Override
    public Handler2 setHandler(Handler2 handler) {
        this.next = handler;
        return handler;
    }

    @Override
    public boolean handle(Req r) {
        return next == null || next.handle(r);
    }
}
record Req(String user, int amount, String token) {}
class AuthHandler2 extends BaseHandler2 {
    @Override
    public boolean handle(Req r) {
        if (r.token() == null)
            return false;

        return super.handle(r);
    }
}
class LimitHandler2 extends BaseHandler2 {
    @Override
    public boolean handle(Req r) {
         if(r.amount() > 1000000)
             return false;
        return super.handle(r);
    }
}

public class DemoOfCOR {

    public static void main(String[] args) {
        Handler2 handler2 = new AuthHandler2();
        handler2.setHandler(new LimitHandler2());

        System.out.println(handler2.handle(new Req("u123", 5000, "t")) );
    }
}
