package cms.canary.models;

public final class Header {

    private final int id = nextId++;
    private final String name;
    private final Page[] pages;
    private final Template template;
    private final Controller controller;

    private static int nextId = 1;

    public Header(final String name, final Page[] pages, final Template template, final Controller controller) {
	super();
	this.name = name;
	this.pages = pages;
	this.template = template;
	this.controller = controller;
    }

    public int getId() {
	return this.id;
    }

    @Override
    public String toString() {
	String pagesStr = "[]";
	if (pages != null) {
	    pagesStr = "[\n";
	    for (int i = 0; i < pages.length; i++) {
		Page page = pages[i];
		pagesStr += "\t\t\t" + page.getId() + (i == pages.length - 1 ? "" : ",") + "\n";
	    }
	    pagesStr += "\t\t]";
	}
	return String.format(
		"{\n"//
			+ "\t\"fields\": {\n"//
			+ "\t\t\"name\": \"%s\",\n"//
			+ "\t\t\"pages\": %s,\n"//
			+ "\t\t\"template\": %d,\n"//
			+ "\t\t\"controller\": %d\n"//
			+ "\t},\n"//
			+ "\t\"model\": \"core.header\",\n"//
			+ "\t\"pk\": %d\n"//
			+ "}",
		name, pagesStr, template == null ? null : template.getId(),
		controller == null ? null : controller.getId(), getId()).replaceAll("\t", "    ");
    }

}
