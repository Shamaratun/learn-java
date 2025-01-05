package classTwentyFirst.SearchableInterface;

public class WebPage implements Searchable {
    private String htmlContent;

    public WebPage(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    // Implementation of the search method for WebPage
    @Override
    public boolean search(String keyword) {
        // Check if the keyword exists in the HTML content (case-insensitive search)
        return htmlContent.toLowerCase().contains(keyword.toLowerCase());
    }
}


