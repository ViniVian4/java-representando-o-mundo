public class Subject {
  String name;
  Guide[] guides = new Guide[]{};

  public String getName() {
    return this.name;
  }

  public Guide[] getGuides() {
    return this.guides;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setGuides(Guide[] guides) {
    this.guides = guides;
  }
}
