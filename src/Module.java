public class Module {
  private String name;
  private String[] classes = new String[]{};

  public String getName() {
    return this.name;
  }

  public String[] getClasses() {
    return this.classes;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setClasses(String[] classes) {
    this.classes = classes;
  }
}
