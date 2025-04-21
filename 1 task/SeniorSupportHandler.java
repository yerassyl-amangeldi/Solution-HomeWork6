 class SeniorSupportHandler extends SupportHandler {
    void handle(String issue) {
        if (issue.equals("account_ban") || issue.equals("data_loss")) {
            System.out.println("[SeniorSupport] Handled " + issue);
        } else if (nextHandler != null) {
            System.out.println("[SeniorSupport] Cannot handle " + issue + " — passing to next");
            nextHandler.handle(issue);
        } else {
            System.out.println("[SeniorSupport] Cannot handle " + issue + " — escalate manually");
        }
    }
}