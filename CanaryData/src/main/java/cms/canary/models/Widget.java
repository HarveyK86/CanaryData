package cms.canary.models;

public final class Widget {

    private final int id = nextId++;
    private final String name;
    private final String content;
    private final String priority;
    private final Template template;
    private final Controller controller;

    private static int nextId = 1;

    public Widget(final String name, final String content, final String priority, final Template template,
	    final Controller controller) {
	super();
	this.name = name;
	this.content = content;
	this.priority = priority;
	this.template = template;
	this.controller = controller;
    }

    public int getId() {
	return this.id;
    }

    @Override
    public String toString() {
	return String.format(//
		"{\n"//
			+ "\t\"fields\": {\n"//
			+ "\t\t\"name\": \"%s\",\n"//
			+ "\t\t\"content\": \"%s\",\n"//
			+ "\t\t\"priority\": \"%s\",\n"//
			+ "\t\t\"template\": %d,\n"//
			+ "\t\t\"controller\": %d\n"//
			+ "\t},\n"//
			+ "\t\"model\": \"core.widget\",\n"//
			+ "\t\"pk\": %d\n"//
			+ "}",
		name, content, priority, template == null ? null : template.getId(),
		controller == null ? null : controller.getId(), getId()).replaceAll("\t", "    ");
    }

}
