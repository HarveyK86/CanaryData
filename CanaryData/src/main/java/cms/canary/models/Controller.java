package cms.canary.models;

public final class Controller {

    private final int id = nextId++;
    private final String name;
    private final String file;

    private static int nextId = 1;

    public Controller(final String name, final String file) {
	super();
	this.name = name;
	this.file = file;
    }

    public Controller() {
	this.name = null;
	this.file = null;
    }

    public int getId() {
	return this.id;
    }

    @Override
    public String toString() {
	return String.format("{\n"//
		+ "\t\"fields\": {\n"//
		+ "\t\t\"name\": \"%s\",\n"//
		+ "\t\t\"file\": \"%s\"\n"//
		+ "\t},\n"//
		+ "\t\"model\": \"core.controller\",\n"//
		+ "\t\"pk\": %d\n"//
		+ "}", name, file, getId()).replaceAll("\t", "    ");
    }

}
