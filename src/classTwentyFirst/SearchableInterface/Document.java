package classTwentyFirst.SearchableInterface;


// Document Class that implements the Searchable interface
class Document implements Searchable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    // Implementation of the search method for Document
    @Override
    public boolean search(String keyword) {
        // Check if the keyword exists in the content (case-insensitive search)
        return content!=null&&
                content.toLowerCase().contains(keyword.toLowerCase());
    }
}



