package com.patterns.chainofresponsibality;

interface Handler {
  Handler setNext(Handler next);
  boolean handle(Request req);
}
class BaseHandler implements Handler {
  private Handler next;
  public Handler setNext(Handler n){
    this.next = n;
    return n;
  }
  public boolean handle(Request req){
    return next == null || next.handle(req);
  }
}
record Request(String user, int amount, String token) {}

// Concrete steps
final class AuthHandler extends BaseHandler {
  public boolean handle(Request r){
    if (r.token() == null) return false; return super.handle(r);
  }
}
final class LimitHandler extends BaseHandler {
  public boolean handle(Request r){
    if (r.amount() > 100_000) return false; return super.handle(r);
  }
}
final class RiskHandler extends BaseHandler {
  public boolean handle(Request r){ if (r.user().startsWith("blk_")) return false; return super.handle(r); }
}

// Build chain
public class DemoChain {
  public static void main(String[] args) {
    Handler chain = new AuthHandler();
    chain.setNext(new LimitHandler()).setNext(new RiskHandler());

    System.out.println(chain.handle(new Request("u123", 5000, "t")));
    System.out.println(chain.handle(new Request("blk_X", 5000, "t")));
  }
}
