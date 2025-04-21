class JuniorSupportHandler extends SupportHandler {
    void handle(String issue) {
        if (issue.equals("refund_request") || issue.equals("billing_issue")) {
            System.out.println("[JuniorSupport] Handled " + issue);
        } else if (nextHandler != null) {
            System.out.println("[JuniorSupport] Cannot handle " + issue + " — passing to next");
            nextHandler.handle(issue);
        } else {
            System.out.println("[JuniorSupport] Cannot handle " + issue + " — no one else in chain");
        }
    }
}