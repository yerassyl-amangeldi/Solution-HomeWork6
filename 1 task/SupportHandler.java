public abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public SupportHandler set_next(SupportHandler handler) {
        this.nextHandler = handler;
        return handler;
    }

    abstract void handle(String issue);
}