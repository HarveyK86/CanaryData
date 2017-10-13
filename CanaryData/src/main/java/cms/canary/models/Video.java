package cms.canary.models;

public final class Video {

    private final int id = nextId++;
    private final String title;
    private final String owner;
    private final String code;
    private final String priority;
    private final Template template;
    private final Controller controller;

    private static int nextId = 1;

    public Video(final String title, final String owner, final String code, final String priority,
	    final Template template, final Controller controller) {
	super();
	this.title = title;
	this.owner = owner;
	this.code = code;
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
			+ "\t\t\"title\": \"%s\",\n"//
			+ "\t\t\"owner\": \"%s\",\n"//
			+ "\t\t\"code\": \"%s\",\n"//
			+ "\t\t\"priority\": \"%s\",\n"//
			+ "\t\t\"template\": %d,\n"//
			+ "\t\t\"controller\": %d\n"//
			+ "\t},\n"//
			+ "\t\"model\": \"core.video\",\n"//
			+ "\t\"pk\": %d\n"//
			+ "}",
		title, owner, code, priority, template == null ? null : template.getId(),
		controller == null ? null : controller.getId(), getId()).replaceAll("\t", "    ");
    }

}
