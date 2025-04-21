 class FAQBotHandler extends SupportHandler {
    void handle(String issue) {
        if (issue.equals("password_reset")) {
            System.out.println("[FAQBot] Handled " + issue);
        } else if (nextHandler != null) {
            System.out.println("[FAQBot] Cannot handle " + issue + " — passing to next");
            nextHandler.handle(issue);
        } else {
            System.out.println("[FAQBot] Cannot handle " + issue + " — no one else in chain");
        }
    }
}