package cms.canary.models;

public class Page {

    private final int id = nextId++;
    private final String name;
    private final boolean hidden;
    private final Paginator paginator;
    private final String priority;
    private final Template template;
    private final Controller controller;

    private static int nextId = 1;

    public Page(final String name, final boolean hidden, final Paginator paginator, final String priority,
	    final Template template, final Controller controller) {
	super();
	this.name = name;
	this.hidden = hidden;
	this.paginator = paginator;
	this.priority = priority;
	this.template = template;
	this.controller = controller;
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
			+ "\t\t\"hidden\": %b,\n"//
			+ "\t\t\"paginator\": %d,\n"//
			+ "\t\t\"priority\": %s,\n"//
			+ "\t\t\"template\": %d,\n"//
			+ "\t\t\"controller\": %d\n"//
			+ "\t},\n"//
			+ "\t\"model\": \"core.page\",\n"//
			+ "\t\"pk\": %d\n"//
			+ "}",
		name, hidden, paginator == null ? null : paginator.getId(),
		priority == null ? null : "\"" + priority + "\"", template == null ? null : template.getId(),
		controller == null ? null : controller.getId(), getId()).replaceAll("\t", "    ");
    }

}
