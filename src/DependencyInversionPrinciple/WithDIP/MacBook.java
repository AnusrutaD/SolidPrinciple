package DependencyInversionPrinciple.WithDIP;

import DependencyInversionPrinciple.WithoutDIP.Keyboard;

public class MacBook {
    private final Keyboard keyboard;
    private final Mouse mouse;

    // dynamically get the object
    public MacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}
