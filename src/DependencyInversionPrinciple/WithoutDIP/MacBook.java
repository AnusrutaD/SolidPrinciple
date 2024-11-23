package DependencyInversionPrinciple.WithoutDIP;

public class MacBook {
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    // assigned the Objects of concrete class
    public MacBook() {
        this.keyboard = new WiredKeyboard();
        this.mouse = new WiredMouse();
    }
}
