package cms.canary.models;

public final class Config {

    private final int id = nextId++;
    private final String name;
    private final Header header;
    private final Sidebar leftSidebar;
    private final Sidebar rightSidebar;
    private final Footer footer;
    private final Style style;

    private static int nextId = 1;

    public Config(final String name, final Header header, final Sidebar leftSidebar, final Sidebar rightSidebar,
	    final Footer footer, final Style style) {
	super();
	this.name = name;
	this.header = header;
	this.leftSidebar = leftSidebar;
	this.rightSidebar = rightSidebar;
	this.footer = footer;
	this.style = style;
    }

    public int getId() {
	return this.id;
    }

    @Override
    public String toString() {
	return String.format(
		"{\n"//
			+ "\t\"fields\": {\n"//
			+ "\t\t\"name\": \"%s\",\n"//
			+ "\t\t\"header\": %d,\n"//
			+ "\t\t\"left_sidebar\": %d,\n"//
			+ "\t\t\"right_sidebar\": %d,\n"//
			+ "\t\t\"footer\": %d,\n"//
			+ "\t\t\"style\": %d\n"//
			+ "\t},\n"//
			+ "\t\"model\": \"core.config\",\n"//
			+ "\t\"pk\": %d\n"//
			+ "}",
		name, header == null ? null : header.getId(), leftSidebar == null ? null : leftSidebar.getId(),
		rightSidebar == null ? null : rightSidebar.getId(), footer == null ? null : footer.getId(),
		style == null ? null : style.getId(), getId()).replaceAll("\t", "    ");
    }

}
