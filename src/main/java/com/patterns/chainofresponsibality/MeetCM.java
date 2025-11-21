package com.patterns.chainofresponsibality;

record Result( boolean status, String reason) {};
record Input(String name, int id,boolean appointMentLatter) {};

interface Checks {
    Checks nextCheck(Checks checks) ;
    Result handleCheck(Input input);
}
abstract class BaseCheck implements Checks {
    Checks next;
    @Override
    public Checks nextCheck(Checks checks) {
        this.next = checks;
        return checks;
    }

    @Override
    public Result handleCheck(Input input) {
        return next == null ? new Result(true, "Ok") : next.handleCheck(input);
    }
}

class SecurityDesk extends BaseCheck {
    @Override
    public Result handleCheck(Input input) {

        if(input == null) return new Result(false, "SecurityCheck: no input");
        boolean hasName = input.name() != null && !input.name().isEmpty();
        boolean hasId = input.id() > 0;

        if( hasId && hasName) {
            return super.handleCheck(input);
        }
        return new Result(false, "SecurityCheck Failed");
    }
}

class AppointmentCommission extends  BaseCheck {
    @Override
    public Result handleCheck(Input input) {
        if(input.appointMentLatter())
            return super.handleCheck(input);
        else return new Result(false, "Don't have appointment latter");
    }
}

class FinalGreenSingal extends BaseCheck {
    @Override
    public Result handleCheck(Input input) {
        return super.handleCheck(input);

    }
}
class ChainBuilder {
    private Checks head, tail;
    public ChainBuilder add(Checks h) {
        if(head == null) head = tail = h;
        else tail = tail.nextCheck(h);
        return this;
    }

    public Checks build(){
        return head;
    }

}
public class MeetCM {

    public static void main(String[] args) {
        ChainBuilder builder = new ChainBuilder().add(new SecurityDesk()).add(new AppointmentCommission()).add(new FinalGreenSingal());
        Checks build = builder.build();
      /*  Checks checks = new SecurityDesk();
        checks.nextCheck(new AppointmentCommission()).nextCheck(new FinalGreenSingal());*/
        Result guru = build.handleCheck(new Input("Guru", 2, true));
        System.out.println(guru.status()+" ---"+guru.reason());

        Result r2 = build.handleCheck(new Input("", 0, true));
        System.out.println(r2.status() + " --- " + r2.reason());
    }
}
