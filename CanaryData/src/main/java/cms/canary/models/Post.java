package cms.canary.models;

public final class Post {

    private final int id = nextId++;
    private final String title;
    private final User user;
    private final String createdDateTime;
    private final String content;
    private final Image[] images;
    private final Video[] videos;
    private final Category[] categories;
    private final Template template;
    private final Controller controller;

    private static int nextId = 1;

    public Post(final String title, final User user, final String createdDateTime, final String content,
	    final Image[] images, final Video[] videos, final Category[] categories, final Template template,
	    final Controller controller) {
	super();
	this.title = title;
	this.user = user;
	this.createdDateTime = createdDateTime;
	this.content = content;
	this.images = images;
	this.videos = videos;
	this.categories = categories;
	this.template = template;
	this.controller = controller;
    }

    public int getId() {
	return this.id;
    }

    @Override
    public String toString() {
	String imagesStr = "[]";
	if (images != null) {
	    imagesStr = "[\n";
	    for (int i = 0; i < images.length; i++) {
		Image image = images[i];
		imagesStr += "\t\t\t" + image.getId() + (i == images.length - 1 ? "" : ",") + "\n";
	    }
	    imagesStr += "\t\t]";
	}
	String videosStr = "[]";
	if (videos != null) {
	    videosStr = "[\n";
	    for (int i = 0; i < videos.length; i++) {
		Video video = videos[i];
		videosStr += "\t\t\t" + video.getId() + (i == videos.length - 1 ? "" : ",") + "\n";
	    }
	    videosStr += "\t\t]";
	}
	String categoriesStr = "[]";
	if (categories != null) {
	    categoriesStr = "[\n";
	    for (int i = 0; i < categories.length; i++) {
		Category category = categories[i];
		categoriesStr += "\t\t\t" + category.getId() + (i == categories.length - 1 ? "" : ",") + "\n";
	    }
	    categoriesStr += "\t\t]";
	}
	return String.format(
		"{\n"//
			+ "\t\"fields\": {\n"//
			+ "\t\t\"title\": \"%s\",\n"//
			+ "\t\t\"user\": %d,\n"//
			+ "\t\t\"created_datetime\": \"%s\",\n"//
			+ "\t\t\"content\": \"%s\",\n"//
			+ "\t\t\"images\": %s,\n"//
			+ "\t\t\"videos\": %s,\n"//
			+ "\t\t\"categories\": %s,\n"//
			+ "\t\t\"template\": %d,\n"//
			+ "\t\t\"controller\": %d\n"//
			+ "\t},\n"//
			+ "\t\"model\": \"core.post\",\n"//
			+ "\t\"pk\": %d\n"//
			+ "}",
		title, user == null ? null : user.getId(), createdDateTime, content, imagesStr, videosStr,
		categoriesStr, template == null ? null : template.getId(),
		controller == null ? null : controller.getId(), getId()).replaceAll("\t", "    ");
    }

}
