package jv.in.thinking.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder(), new Snow());
        /*
         Incompatible types.
         Found: 'java.util.List<jv.in.thinking.holding.Powder>',
         required: 'java.util.List<jv.in.thinking.holding.Snow>'
         */
         // List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());

        // Collections.addAll() does not get confused
         List<Snow> snow3 = new ArrayList<Snow>();
         Collections.addAll(snow3, new Light(), new Heavy());

         // Give a hint an explicit type argument specification
         List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
    }
}

class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}