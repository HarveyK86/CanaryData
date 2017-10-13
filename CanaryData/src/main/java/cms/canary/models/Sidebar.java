package cms.canary.models;

public final class Sidebar {

    private final int id = nextId++;
    private final String name;
    private final Widget[] widgets;
    private final Template template;
    private final Controller controller;

    private static int nextId = 1;

    public Sidebar(final String name, final Widget[] widgets, final Template template, final Controller controller) {
	super();
	this.name = name;
	this.widgets = widgets;
	this.template = template;
	this.controller = controller;
    }

    public int getId() {
	return this.id;
    }

    @Override
    public String toString() {
	String widgetsStr = "[]";
	if (widgets != null) {
	    widgetsStr = "[\n";
	    for (int i = 0; i < widgets.length; i++) {
		Widget widget = widgets[i];
		widgetsStr += "\t\t\t" + widget.getId() + (i == widgets.length - 1 ? "" : ",") + "\n";
	    }
	    widgetsStr += "\t\t]";
	}
	return String.format(
		"{\n"//
			+ "\t\"fields\": {\n"//
			+ "\t\t\"name\": \"%s\",\n"//
			+ "\t\t\"widgets\": %s,\n"//
			+ "\t\t\"template\": %d,\n"//
			+ "\t\t\"controller\": %d\n"//
			+ "\t},\n"//
			+ "\t\"model\": \"core.sidebar\",\n"//
			+ "\t\"pk\": %d\n"//
			+ "}",
		name, widgetsStr, template == null ? null : template.getId(),
		controller == null ? null : controller.getId(), getId()).replaceAll("\t", "    ");
    }

}
