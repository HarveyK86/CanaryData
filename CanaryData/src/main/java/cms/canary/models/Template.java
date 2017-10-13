package cms.canary.models;

public final class Template {

    private final int id = nextId++;
    private final String name;
    private final String directory;
    private final String parameters;

    private static int nextId = 1;

    public Template(final String name, final String directory, final String parameters) {
	super();
	this.name = name;
	this.directory = directory;
	this.parameters = parameters;
    }

    public int getId() {
	return this.id;
    }

    @Override
    public String toString() {
	return String
		.format("{\n"//
			+ "\t\"fields\": {\n"//
			+ "\t\t\"name\": \"%s\",\n"//
			+ "\t\t\"directory\": \"%s\",\n"//
			+ "\t\t\"parameters\": %s\n"//
			+ "\t},\n"//
			+ "\t\"model\": \"core.template\",\n"//
			+ "\t\"pk\": %d\n"//
			+ "}", name, directory, parameters == null ? null : "\"" + parameters + "\"", getId())
		.replaceAll("\t", "    ");
    }

}
