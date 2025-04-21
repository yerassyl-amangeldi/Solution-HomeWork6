public class TechSupportChain {
    public static void main(String[] args) {
        FAQBotHandler faq = new FAQBotHandler();
        JuniorSupportHandler junior = new JuniorSupportHandler();
        SeniorSupportHandler senior = new SeniorSupportHandler();

        faq.set_next(junior).set_next(senior);

        String[] issues = {"password_reset", "refund_request", "account_ban", "unknown_bug"};
        for (String issue : issues) {
            System.out.println("\nProcessing issue: " + issue);
            faq.handle(issue);
        }
    }
}