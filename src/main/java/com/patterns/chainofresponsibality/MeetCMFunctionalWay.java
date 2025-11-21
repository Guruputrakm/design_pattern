package com.patterns.chainofresponsibality;

import java.util.List;
import java.util.function.Function;

public class MeetCMFunctionalWay {

    record Res(boolean status, String details) {
        public static Res ok() {return new Res(true, "OK");}
        public static Res fail(String reason) {return new Res(false, reason);}
    }

    record Inp(String name, int id, boolean appointment){};


    static final Function<Inp, Res> securityCheck = inp -> {
        if (inp == null) return Res.fail("No inforamtion is holding");
        if ( (inp.name == null && inp.name.isEmpty() ) || inp.id <=0) return Res.fail("No either name/Id is present");
        return Res.ok();
    };

    static final Function<Inp, Res> appointMentCheck = inp -> {
        if(inp == null) return Res.fail("No iffo is holding");
        if(!inp.appointment) return Res.fail("He Don't have appointment");
        return Res.ok();
    };

    static final Function<Inp, Res> finalGreenSignal = inp -> {
        return Res.ok();
    };

    static Res runChain(Inp inp, List<Function<Inp, Res>> chains) {
        return chains.stream().map(fn -> fn.apply(inp))
                .filter(r ->!r.status)
                .findFirst()
                .orElse(Res.ok());
    }

    public static void main(String[] args) {
        Res guru = runChain(new Inp("Guru", 2, true), List.of(securityCheck, appointMentCheck, finalGreenSignal));
        System.out.println(guru);

        Res res = runChain(new Inp("", 0, true), List.of(securityCheck, appointMentCheck, finalGreenSignal));
        System.out.println(res);

        Res guru1 = runChain(new Inp("Guru", 2, false), List.of(securityCheck, appointMentCheck, finalGreenSignal));
        System.out.println(guru1);
    }

}
