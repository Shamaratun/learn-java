package classTwentyFirst.SearchableInterface;

public interface Searchable {
    public static void main(String[] args) {
        // Create a Document object
        Document document = new Document("This is a sample document content. It contains some text.");

        // Create a WebPage object
        WebPage webPage = new WebPage("<html><body><h1>Welcome to my website</h1><p>This page contains useful information.</p></body></html>");

        // Test search on Document
        System.out.println("Searching 'sample' in Document: " + document.search("sample"));
        System.out.println("Searching 'text' in Document: " + document.search("text"));
        System.out.println("Searching 'hello' in Document: " + document.search("hello"));

        // Test search on WebPage
        System.out.println("Searching 'website' in WebPage: " + webPage.search("website"));
        System.out.println("Searching 'information' in WebPage: " + webPage.search("information"));
        System.out.println("Searching 'contact' in WebPage: " + webPage.search("contact"));
    }

    // Implementation of the search method for WebPage
    boolean search(String keyword);
}



