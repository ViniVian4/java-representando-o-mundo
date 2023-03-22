public class Guide {
  String name;
  Module[] modules = new Module[]{};
  Book[] books = new Book[]{};

  public String getName() {
    return this.name;
  }

  public Module[] getModules() {
    return this.modules;
  }

  public Book[] getBooks() {
    return this.books;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setModules(Module[] modules) {
    this.modules = modules;
  }

  public void setBooks(Book[] books) {
    this.books = books;
  }
}
