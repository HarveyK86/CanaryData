package cms.canary.generator;

import cms.canary.models.Category;
import cms.canary.models.Config;
import cms.canary.models.Controller;
import cms.canary.models.Footer;
import cms.canary.models.Header;
import cms.canary.models.Image;
import cms.canary.models.Page;
import cms.canary.models.Paginator;
import cms.canary.models.Post;
import cms.canary.models.Sidebar;
import cms.canary.models.Style;
import cms.canary.models.Template;
import cms.canary.models.User;
import cms.canary.models.Video;
import cms.canary.models.Widget;

public final class StandardGenerator {

	// Configs
	private static final String CONFIG_NAME = "Standard";

	// Headers
	private static final String HEADER_NAME = "Standard";

	// Sidebars
	private static final String RIGHT_SIDEBAR_NAME = "Standard";

	// Widgets - GitHub Link
	private static final String GITHUB_LINK_WIDGET_NAME = "GitHub Link";
	private static final String GITHUB_LINK_WIDGET_CONTENT =
		  "<div class=\\\"row\\\">\\r\\n"
		+ "  <div class=\\\"col-xs-4 col-xs-offset-4\\\">\\r\\n"
		+ "    <a href=\\\"https://goo.gl/qIKA1y\\\" class=\\\"thumbnail\\\">\\r\\n"
		+ "      <img src=\\\"https://goo.gl/NH6sWW\\\">\\r\\n"
		+ "    </a>\\r\\n"
		+ "  </div>\\r\\n"
		+ "</div>";
	private static final String GITHUB_LINK_WIDGET_PRIORITY = "1.00";

	// Widgets - TO\DO List
	private static final String TODO_LIST_WIDGET_NAME = "TODO List";
	private static final String TODO_LIST_WIDGET_CONTENT =
		  "<h4 class=\\\"text-center\\\">TODO List</h4>\\r\\n"
		+ "<ul class=\\\"list-group\\\">\\r\\n"
		+ "  <li class=\\\"list-group-item\\\">Write TODO List</li>\\r\\n"
		+ "  <li class=\\\"list-group-item\\\">Do TODO List</li>\\r\\n"
		+ "</ul>";
	private static final String TODO_LIST_WIDGET_PRIORITY = "2.00";

	// Pages - News
	private static final String NEWS_PAGE_NAME = "News";
	private static final boolean NEWS_PAGE_HIDDEN = false;
	private static final String NEWS_PAGE_PRIORITY = "1.00";

	// Pages - Images
	private static final String IMAGES_PAGE_NAME = "Images";
	private static final boolean IMAGES_PAGE_HIDDEN = false;
	private static final String IMAGES_PAGE_PRIORITY = "2.00";

	// Pages - Videos
	private static final String VIDEOS_PAGE_NAME = "Videos";
	private static final boolean VIDEOS_PAGE_HIDDEN = false;
	private static final String VIDEOS_PAGE_PRIORITY = "3.00";

	// Pages - /r/Test
	private static final String R_TEST_PAGE_NAME = "/r/test";
	private static final boolean R_TEST_PAGE_HIDDEN = false;
	private static final String R_TEST_PAGE_PRIORITY = "4.00";

	// Pages - Uncategorised
	private static final String UNCATEGORISED_HIDDEN_PAGE_NAME = "Uncategorised [Hidden]";
	private static final boolean UNCATEGORISED_HIDDEN_PAGE_HIDDEN = true;
	private static final String UNCATEGORISED_HIDDEN_PAGE_PRIORITY = null;

	// Posts - Default
	private static final String DEFAULT_POST_TITLE = "Example Default Post";
	private static final String DEFAULT_POST_CREATED_DATE_TIME = "2017-01-01T01:00:00Z";
	private static final String DEFAULT_POST_CONTENT = "This is an example 'Default' post.";

	// Posts - Primary
	private static final String PRIMARY_POST_TITLE = "Example Primary Post";
	private static final String PRIMARY_POST_CREATED_DATE_TIME = "2017-01-01T02:00:00Z";
	private static final String PRIMARY_POST_CONTENT = "This is an example 'Primary' post.";

	// Posts - Info
	private static final String INFO_POST_TITLE = "Example Info Post";
	private static final String INFO_POST_CREATED_DATE_TIME = "2017-01-01T03:00:00Z";
	private static final String INFO_POST_CONTENT = "This is an example 'Info' post.";

	// Posts - Success
	private static final String SUCCESS_POST_TITLE = "Example Success Post";
	private static final String SUCCESS_POST_CREATED_DATE_TIME = "2017-01-01T04:00:00Z";
	private static final String SUCCESS_POST_CONTENT = "This is an example 'Success' post.";

	// Posts - Warning
	private static final String WARNING_POST_TITLE = "Example Warning Post";
	private static final String WARNING_POST_CREATED_DATE_TIME = "2017-01-01T05:00:00Z";
	private static final String WARNING_POST_CONTENT =
		  "This is an example 'Warning' post.<br>\\r\\n"
		+ "<br>\\r\\n"
		+ "It also has an image.";

	// Posts - Danger
	private static final String DANGER_POST_TITLE = "Example Danger Post";
	private static final String DANGER_POST_CREATED_DATE_TIME = "2017-01-01T06:00:00Z";
	private static final String DANGER_POST_CONTENT =
		  "This is an example 'Danger' post.<br>\\r\\n"
		+ "<br>\\r\\n"
		+ "It also has a video.";

	// Posts - Uncategorised
	private static final String UNCATEGORISED_POST_TITLE = "Example Uncategorised Post";
	private static final String UNCATEGORISED_POST_CREATED_DATE_TIME = "2017-01-01T07:00:00Z";
	private static final String UNCATEGORISED_POST_CONTENT = "This is an example 'Uncategorised' post.";

	// Images
	private static final String TEST_IMAGE_TITLE = "Test Image";
	private static final String TEST_IMAGE_OWNER = "phif7651";
	private static final String TEST_IMAGE_CODE = "3q3kNGh";
	private static final String TEST_IMAGE_PRIORITY = "1.00";

	// Videos
	private static final String TEST_VIDEO_TITLE = "TEST VIDEO";
	private static final String TEST_VIDEO_OWNER = "Simon Yapp";
	private static final String TEST_VIDEO_CODE = "C0DPdy98e4c";
	private static final String TEST_VIDEO_PRIORITY = "1.00";

	// Categories - News
	private static final String NEWS_CATEGORY_NAME = "News";
	private static final String NEWS_CATEGORY_PRIORITY = "1.10";

	// Categories - Image
	private static final String IMAGE_CATEGORY_NAME = "Image";
	private static final String IMAGE_CATEGORY_PRIORITY = "1.20";

	// Categories - Video
	private static final String VIDEO_CATEGORY_NAME = "Video";
	private static final String VIDEO_CATEGORY_PRIORITY = "1.30";

	// Categories - Example
	private static final String EXAMPLE_CATEGORY_NAME = "Example";
	private static final String EXAMPLE_CATEGORY_PRIORITY = "2.00";

	// Categories - Default
	private static final String DEFAULT_CATEGORY_NAME = "Default";
	private static final String DEFAULT_CATEGORY_PRIORITY = "3.00";

	// Categories - Primary
	private static final String PRIMARY_CATEGORY_NAME = "Primary";
	private static final String PRIMARY_CATEGORY_PRIORITY = "3.00";

	// Categories - Info
	private static final String INFO_CATEGORY_NAME = "Info";
	private static final String INFO_CATEGORY_PRIORITY = "3.00";

	// Categories - Success
	private static final String SUCCESS_CATEGORY_NAME = "Success";
	private static final String SUCCESS_CATEGORY_PRIORITY = "3.00";

	// Categories - Warning
	private static final String WARNING_CATEGORY_NAME = "Warning";
	private static final String WARNING_CATEGORY_PRIORITY = "3.00";

	// Categories - Danger
	private static final String DANGER_CATEGORY_NAME = "Danger";
	private static final String DANGER_CATEGORY_PRIORITY = "3.00";

	// Paginators - Standard
	private static final String STANDARD_PAGINATOR_NAME = "Standard";

	// Paginators - Reddit
	private static final String REDDIT_PAGINATOR_NAME = "Reddit";

	// Footers
	private static final String FOOTER_NAME = "Standard";

	// Styles
	private static final String STYLE_NAME = "Standard";

	// Templates - Headers - Default
	private static final String HEADER_STANDARD_DEFAULT_NAME = "Header | Standard [Default]";
	private static final String HEADER_STANDARD_DEFAULT_DIRECTORY = "header/standard";
	private static final String HEADER_STANDARD_DEFAULT_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"navbar-default\\\"\\r\\n"
		+ "}";

	// Templates - Headers - Default | Fixed
	private static final String HEADER_STANDARD_DEFAULT_FIXED_NAME = "Header | Standard [Default | Fixed]";
	private static final String HEADER_STANDARD_DEFAULT_FIXED_DIRECTORY = "header/standard";
	private static final String HEADER_STANDARD_DEFAULT_FIXED_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"navbar-default\\\",\\r\\n"
		+ "  \\\"fixed\\\": true\\r\\n"
		+ "}";

	// Templates - Headers - Inverse
	private static final String HEADER_STANDARD_INVERSE_NAME = "Header | Standard [Inverse]";
	private static final String HEADER_STANDARD_INVERSE_DIRECTORY = "header/standard";
	private static final String HEADER_STANDARD_INVERSE_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"navbar-inverse\\\"\\r\\n"
		+ "}";

	// Templates - Headers - Inverse Fixed
	private static final String HEADER_STANDARD_INVERSE_FIXED_NAME = "Header | Standard [Inverse | Fixed]";
	private static final String HEADER_STANDARD_INVERSE_FIXED_DIRECTORY = "header/standard";
	private static final String HEADER_STANDARD_INVERSE_FIXED_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"navbar-inverse\\\",\\r\\n"
		+ "  \\\"fixed\\\": true\\r\\n"
		+ "}";

	// Templates - Sidebars
	private static final String SIDEBAR_STANDARD_NAME = "Sidebar | Standard";
	private static final String SIDEBAR_STANDARD_DIRECTORY = "sidebar/standard";
	private static final String SIDEBAR_STANDARD_PARAMETERS = null;

	// Templates - Widgets - Default
	private static final String WIDGET_STANDARD_DEFAULT_NAME = "Widget | Standard [Default]";
	private static final String WIDGET_STANDARD_DEFAULT_DIRECTORY = "widget/standard";
	private static final String WIDGET_STANDARD_DEFAULT_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"panel-default\\\"\\r\\n"
		+ "}";

	// Templates - Widgets - Primary
	private static final String WIDGET_STANDARD_PRIMARY_NAME = "Widget | Standard [Primary]";
	private static final String WIDGET_STANDARD_PRIMARY_DIRECTORY = "widget/standard";
	private static final String WIDGET_STANDARD_PRIMARY_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"panel-primary\\\"\\r\\n"
		+ "}";

	// Templates - Widgets - Info
	private static final String WIDGET_STANDARD_INFO_NAME = "Widget | Standard [Info]";
	private static final String WIDGET_STANDARD_INFO_DIRECTORY = "widget/standard";
	private static final String WIDGET_STANDARD_INFO_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"panel-info\\\"\\r\\n"
		+ "}";

	// Templates - Widgets - Success
	private static final String WIDGET_STANDARD_SUCCESS_NAME = "Widget | Standard [Success]";
	private static final String WIDGET_STANDARD_SUCCESS_DIRECTORY = "widget/standard";
	private static final String WIDGET_STANDARD_SUCCESS_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"panel-success\\\"\\r\\n"
		+ "}";

	// Templates - Widgets - Warning
	private static final String WIDGET_STANDARD_WARNING_NAME = "Widget | Standard [Warning]";
	private static final String WIDGET_STANDARD_WARNING_DIRECTORY = "widget/standard";
	private static final String WIDGET_STANDARD_WARNING_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"panel-warning\\\"\\r\\n"
		+ "}";

	// Templates - Widgets - Danger
	private static final String WIDGET_STANDARD_DANGER_NAME = "Widget | Standard [Danger]";
	private static final String WIDGET_STANDARD_DANGER_DIRECTORY = "widget/standard";
	private static final String WIDGET_STANDARD_DANGER_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"panel-danger\\\"\\r\\n"
		+ "}";

	// Templates - Pages - News
	private static final String PAGE_CATEGORY_NEWS_NAME = "Page | Category [News]";
	private static final String PAGE_CATEGORY_NEWS_DIRECTORY = "page/category";
	private static final String PAGE_CATEGORY_NEWS_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"categories\\\": [\\r\\n"
		+ "    \\\"News\\\"\\r\\n"
		+ "  ]\\r\\n"
		+ "}";

	// Templates - Pages - Image
	private static final String PAGE_CATEGORY_IMAGE_NAME = "Page | Category [Image]";
	private static final String PAGE_CATEGORY_IMAGE_DIRECTORY = "page/category";
	private static final String PAGE_CATEGORY_IMAGE_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"categories\\\": [\\r\\n"
		+ "    \\\"Image\\\"\\r\\n"
		+ "  ]\\r\\n"
		+ "}";

	// Templates - Pages - Video
	private static final String PAGE_CATEGORY_VIDEO_NAME = "Page | Category [Video]";
	private static final String PAGE_CATEGORY_VIDEO_DIRECTORY = "page/category";
	private static final String PAGE_CATEGORY_VIDEO_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"categories\\\": [\\r\\n"
		+ "    \\\"Video\\\"\\r\\n"
		+ "  ]\\r\\n"
		+ "}";

	// Templates - Pages - Uncategorised
	private static final String PAGE_CATEGORY_UNCATEGORISED_NAME = "Page | Category [Uncategorised]";
	private static final String PAGE_CATEGORY_UNCATEGORISED_DIRECTORY = "page/category";
	private static final String PAGE_CATEGORY_UNCATEGORISED_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"categories\\\": [\\r\\n"
		+ "  ]\\r\\n"
		+ "}";

	// Templates - Pages - /r/Test - Default
	private static final String PAGE_REDDIT_R_TEST_DEFAULT_NAME = "Page | Reddit [/r/test | Default]";
	private static final String PAGE_REDDIT_R_TEST_DEFAULT_DIRECTORY = "page/reddit";
	private static final String PAGE_REDDIT_R_TEST_DEFAULT_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"subreddit\\\": \\\"test\\\",\\r\\n"
		+ "  \\\"class\\\": \\\"panel-default\\\"\\r\\n"
		+ "}";

	// Templates - Pages - /r/Test - Primary
	private static final String PAGE_REDDIT_R_TEST_PRIMARY_NAME = "Page | Reddit [/r/test | Primary]";
	private static final String PAGE_REDDIT_R_TEST_PRIMARY_DIRECTORY = "page/reddit";
	private static final String PAGE_REDDIT_R_TEST_PRIMARY_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"subreddit\\\": \\\"test\\\",\\r\\n"
		+ "  \\\"class\\\": \\\"panel-primary\\\"\\r\\n"
		+ "}";

	// Templates - Pages - /r/Test - Info
	private static final String PAGE_REDDIT_R_TEST_INFO_NAME = "Page | Reddit [/r/test | Info]";
	private static final String PAGE_REDDIT_R_TEST_INFO_DIRECTORY = "page/reddit";
	private static final String PAGE_REDDIT_R_TEST_INFO_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"subreddit\\\": \\\"test\\\",\\r\\n"
		+ "  \\\"class\\\": \\\"panel-info\\\"\\r\\n"
		+ "}";

	// Templates - Pages - /r/Test - Success
	private static final String PAGE_REDDIT_R_TEST_SUCCESS_NAME = "Page | Reddit [/r/test | Success]";
	private static final String PAGE_REDDIT_R_TEST_SUCCESS_DIRECTORY = "page/reddit";
	private static final String PAGE_REDDIT_R_TEST_SUCCESS_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"subreddit\\\": \\\"test\\\",\\r\\n"
		+ "  \\\"class\\\": \\\"panel-success\\\"\\r\\n"
		+ "}";

	// Templates - Pages - /r/Test - Warning
	private static final String PAGE_REDDIT_R_TEST_WARNING_NAME = "Page | Reddit [/r/test | Warning]";
	private static final String PAGE_REDDIT_R_TEST_WARNING_DIRECTORY = "page/reddit";
	private static final String PAGE_REDDIT_R_TEST_WARNING_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"subreddit\\\": \\\"test\\\",\\r\\n"
		+ "  \\\"class\\\": \\\"panel-warning\\\"\\r\\n"
		+ "}";

	// Templates - Pages - /r/Test - Danger
	private static final String PAGE_REDDIT_R_TEST_DANGER_NAME = "Page | Reddit [/r/test | Danger]";
	private static final String PAGE_REDDIT_R_TEST_DANGER_DIRECTORY = "page/reddit";
	private static final String PAGE_REDDIT_R_TEST_DANGER_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"subreddit\\\": \\\"test\\\",\\r\\n"
		+ "  \\\"class\\\": \\\"panel-danger\\\"\\r\\n"
		+ "}";

	// Templates - Posts - Default
	private static final String POST_STANDARD_DEFAULT_NAME = "Post | Standard [Default]";
	private static final String POST_STANDARD_DEFAULT_DIRECTORY = "post/standard";
	private static final String POST_STANDARD_DEFAULT_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"panel-default\\\"\\r\\n"
		+ "}";

	// Templates - Posts - Primary
	private static final String POST_STANDARD_PRIMARY_NAME = "Post | Standard [Primary]";
	private static final String POST_STANDARD_PRIMARY_DIRECTORY = "post/standard";
	private static final String POST_STANDARD_PRIMARY_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"panel-primary\\\"\\r\\n"
		+ "}";

	// Templates - Posts - Info
	private static final String POST_STANDARD_INFO_NAME = "Post | Standard [Info]";
	private static final String POST_STANDARD_INFO_DIRECTORY = "post/standard";
	private static final String POST_STANDARD_INFO_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"panel-info\\\"\\r\\n"
		+ "}";

	// Templates - Posts - Success
	private static final String POST_STANDARD_SUCCESS_NAME = "Post | Standard [Success]";
	private static final String POST_STANDARD_SUCCESS_DIRECTORY = "post/standard";
	private static final String POST_STANDARD_SUCCESS_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"panel-success\\\"\\r\\n"
		+ "}";

	// Templates - Posts - Warning
	private static final String POST_STANDARD_WARNING_NAME = "Post | Standard [Warning]";
	private static final String POST_STANDARD_WARNING_DIRECTORY = "post/standard";
	private static final String POST_STANDARD_WARNING_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"panel-warning\\\"\\r\\n"
		+ "}";

	// Templates - Posts - Danger
	private static final String POST_STANDARD_DANGER_NAME = "Post | Standard [Danger]";
	private static final String POST_STANDARD_DANGER_DIRECTORY = "post/standard";
	private static final String POST_STANDARD_DANGER_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"panel-danger\\\"\\r\\n"
		+ "}";

	// Template - Images
	private static final String IMAGE_STANDARD_NAME = "Image | Standard";
	private static final String IMAGE_STANDARD_DIRECTORY = "image/standard";
	private static final String IMAGE_STANDARD_PARAMETERS = null;

	// Templates - Videos - 16by9
	private static final String VIDEO_STANDARD_16_BY_9_NAME = "Video | Standard [16by9]";
	private static final String VIDEO_STANDARD_16_BY_9_DIRECTORY = "video/standard";
	private static final String VIDEO_STANDARD_16_BY_9_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"embed-responsive-16by9\\\"\\r\\n"
		+ "}";

	// Templates - Videos - 4by3
	private static final String VIDEO_STANDARD_4_BY_3_NAME = "Video | Standard [4by3]";
	private static final String VIDEO_STANDARD_4_BY_3_DIRECTORY = "video/standard";
	private static final String VIDEO_STANDARD_4_BY_3_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"embed-responsive-4by3\\\"\\r\\n"
		+ "}";

	// Templates - Categories - Default
	private static final String CATEGORY_STANDARD_DEFAULT_NAME = "Category | Standrd [Default]";
	private static final String CATEGORY_STANDARD_DEFAULT_DIRECTORY = "category/standard";
	private static final String CATEGORY_STANDARD_DEFAULT_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"label-default\\\"\\r\\n"
		+ "}";

	// Templates - Categories - Primary
	private static final String CATEGORY_STANDARD_PRIMARY_NAME = "Category | Standrd [Primary]";
	private static final String CATEGORY_STANDARD_PRIMARY_DIRECTORY = "category/standard";
	private static final String CATEGORY_STANDARD_PRIMARY_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"label-primary\\\"\\r\\n"
		+ "}";

	// Templates - Categories - Info
	private static final String CATEGORY_STANDARD_INFO_NAME = "Category | Standrd [Info]";
	private static final String CATEGORY_STANDARD_INFO_DIRECTORY = "category/standard";
	private static final String CATEGORY_STANDARD_INFO_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"label-info\\\"\\r\\n"
		+ "}";

	// Templates - Categories - Success
	private static final String CATEGORY_STANDARD_SUCCESS_NAME = "Category | Standrd [Success]";
	private static final String CATEGORY_STANDARD_SUCCESS_DIRECTORY = "category/standard";
	private static final String CATEGORY_STANDARD_SUCCESS_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"label-success\\\"\\r\\n"
		+ "}";

	// Templates - Categories - Warning
	private static final String CATEGORY_STANDARD_WARNING_NAME = "Category | Standrd [Warning]";
	private static final String CATEGORY_STANDARD_WARNING_DIRECTORY = "category/standard";
	private static final String CATEGORY_STANDARD_WARNING_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"label-warning\\\"\\r\\n"
		+ "}";

	// Templates - Categories - Danger
	private static final String CATEGORY_STANDARD_DANGER_NAME = "Category | Standrd [Danger]";
	private static final String CATEGORY_STANDARD_DANGER_DIRECTORY = "category/standard";
	private static final String CATEGORY_STANDARD_DANGER_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"label-danger\\\"\\r\\n"
		+ "}";

	// Templates - Paginators - Standard
	private static final String PAGINATOR_STANDARD_NAME = "Paginator | Standard";
	private static final String PAGINATOR_STANDARD_DIRECTORY = "paginator/standard";
	private static final String PAGINATOR_STANDARD_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"\\\"\\r\\n"
		+ "}";

	// Templates - Paginators - Standard Sm
	private static final String PAGINATOR_STANDARD_SM_NAME = "Paginator | Standard [Sm]";
	private static final String PAGINATOR_STANDARD_SM_DIRECTORY = "paginator/standard";
	private static final String PAGINATOR_STANDARD_SM_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"pagination-sm\\\"\\r\\n"
		+ "}";

	// Templates - Paginators - Standard Lg
	private static final String PAGINATOR_STANDARD_LG_NAME = "Paginator | Standard [Lg]";
	private static final String PAGINATOR_STANDARD_LG_DIRECTORY = "paginator/standard";
	private static final String PAGINATOR_STANDARD_LG_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"pagination-lg\\\"\\r\\n"
		+ "}";

	// Templates - Paginators - Reddit
	private static final String PAGINATOR_REDDIT_NAME = "Paginator | Reddit";
	private static final String PAGINATOR_REDDIT_DIRECTORY = "paginator/reddit";
	private static final String PAGINATOR_REDDIT_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"\\\"\\r\\n"
		+ "}";

	// Templates - Paginators - Reddit Sm
	private static final String PAGINATOR_REDDIT_SM_NAME = "Paginator | Reddit [Sm]";
	private static final String PAGINATOR_REDDIT_SM_DIRECTORY = "paginator/reddit";
	private static final String PAGINATOR_REDDIT_SM_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"pagination-sm\\\"\\r\\n"
		+ "}";

	// Templates - Paginators - Reddit Lg
	private static final String PAGINATOR_REDDIT_LG_NAME = "Paginator | Reddit [Lg]";
	private static final String PAGINATOR_REDDIT_LG_DIRECTORY = "paginator/reddit";
	private static final String PAGINATOR_REDDIT_LG_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"pagination-lg\\\"\\r\\n"
		+ "}";

	// Templates - Footers - Default
	private static final String FOOTER_STANDARD_DEFAULT_NAME = "Footer | Standard [Default]";
	private static final String FOOTER_STANDARD_DEFAULT_DIRECTORY = "footer/standard";
	private static final String FOOTER_STANDARD_DEFAULT_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"panel-default\\\"\\r\\n"
		+ "}";

	// Templates - Footers - Primary
	private static final String FOOTER_STANDARD_PRIMARY_NAME = "Footer | Standard [Primary]";
	private static final String FOOTER_STANDARD_PRIMARY_DIRECTORY = "footer/standard";
	private static final String FOOTER_STANDARD_PRIMARY_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"panel-primary\\\"\\r\\n"
		+ "}";

	// Templates - Footers - Info
	private static final String FOOTER_STANDARD_INFO_NAME = "Footer | Standard [Info]";
	private static final String FOOTER_STANDARD_INFO_DIRECTORY = "footer/standard";
	private static final String FOOTER_STANDARD_INFO_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"panel-info\\\"\\r\\n"
		+ "}";

	// Templates - Footers - Success
	private static final String FOOTER_STANDARD_SUCCESS_NAME = "Footer | Standard [Success]";
	private static final String FOOTER_STANDARD_SUCCESS_DIRECTORY = "footer/standard";
	private static final String FOOTER_STANDARD_SUCCESS_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"panel-success\\\"\\r\\n"
		+ "}";

	// Templates - Footers - Warning
	private static final String FOOTER_STANDARD_WARNING_NAME = "Footer | Standard [Warning]";
	private static final String FOOTER_STANDARD_WARNING_DIRECTORY = "footer/standard";
	private static final String FOOTER_STANDARD_WARNING_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"panel-warning\\\"\\r\\n"
		+ "}";

	// Templates - Footers - Danger
	private static final String FOOTER_STANDARD_DANGER_NAME = "Footer | Standard [Danger]";
	private static final String FOOTER_STANDARD_DANGER_DIRECTORY = "footer/standard";
	private static final String FOOTER_STANDARD_DANGER_PARAMETERS =
		  "{\\r\\n"
		+ "  \\\"class\\\": \\\"panel-danger\\\"\\r\\n"
		+ "}";

	// Templates - Styles
	private static final String STYLE_STANDARD_NAME = "Style | Standard";
	private static final String STYLE_STANDARD_DIRECTORY = "style/standard";
	private static final String STYLE_STANDARD_PARAMETERS = null;

	// Controllers - Headers
	private static final String HEADER_DEFAULT_NAME = "Header | Default";
	private static final String HEADER_DEFAULT_FILE = "header/default-controller";

	// Controllers - Sidebars
	private static final String SIDEBAR_DEFAULT_NAME = "Sidebar | Default";
	private static final String SIDEBAR_DEFAULT_FILE = "sidebar/default-controller";

	// Controllers - Widgets
	private static final String WIDGET_DEFAULT_NAME = "Widget | Default";
	private static final String WIDGET_DEFAULT_FILE = "widget/default-controller";

	// Controllers - Pages - Category
	private static final String PAGE_CATEGORY_NAME = "Page | Category";
	private static final String PAGE_CATEGORY_FILE = "page/category/controller";

	// Controllers - Pages - Reddit
	private static final String PAGE_REDDIT_NAME = "Page | Reddit";
	private static final String PAGE_REDDIT_FILE = "page/reddit/controller";

	// Controllers - Posts
	private static final String POST_DEFAULT_NAME = "Post | Default";
	private static final String POST_DEFAULT_FILE = "post/default-controller";

	// Controllers - Images
	private static final String IMAGE_DEFAULT_NAME = "Image | Default";
	private static final String IMAGE_DEFAULT_FILE = "image/default-controller";

	// Controllers - Videos
	private static final String VIDEO_DEFAULT_NAME = "Video | Default";
	private static final String VIDEO_DEFAULT_FILE = "video/default-controller";

	// Controllers - Categories
	private static final String CATEGORY_DEFAULT_NAME = "Category | Default";
	private static final String CATEGORY_DEFAULT_FILE = "category/default-controller";

	// Controllers - Paginators - Standard
	private static final String PAGINATOR_STANDARD_CONTROLLER_NAME = "Paginator | Standard";
	private static final String PAGINATOR_STANDARD_FILE = "paginator/standard/controller";

	// Controllers - Paginators - Reddit
	private static final String PAGINATOR_REDDIT_CONTROLLER_NAME = "Paginator | Reddit";
	private static final String PAGINATOR_REDDIT_FILE = "paginator/reddit/controller";

	// Controllers - Footers
	private static final String FOOTER_DEFAULT_NAME = "Footer | Default";
	private static final String FOOTER_DEFAULT_FILE = "footer/default-controller";

	// Controllers - Styles
	private static final String STYLE_DEFAULT_NAME = "Style | Default";
	private static final String STYLE_DEFAULT_FILE = "style/default-controller";

	public static void main(final String[] args) {

		final User superUser = new User();

		// Controllers
		final Controller headerDefaultController = new Controller(HEADER_DEFAULT_NAME, HEADER_DEFAULT_FILE);
		final Controller sidebarDefaultController = new Controller(SIDEBAR_DEFAULT_NAME, SIDEBAR_DEFAULT_FILE);
		final Controller widgetDefaultController = new Controller(WIDGET_DEFAULT_NAME, WIDGET_DEFAULT_FILE);
		final Controller pageCategoryController = new Controller(PAGE_CATEGORY_NAME, PAGE_CATEGORY_FILE);
		final Controller pageRedditController = new Controller(PAGE_REDDIT_NAME, PAGE_REDDIT_FILE);
		final Controller postDefaultController = new Controller(POST_DEFAULT_NAME, POST_DEFAULT_FILE);
		final Controller imageDefaultController = new Controller(IMAGE_DEFAULT_NAME, IMAGE_DEFAULT_FILE);
		final Controller videoDefaultController = new Controller(VIDEO_DEFAULT_NAME, VIDEO_DEFAULT_FILE);
		final Controller categoryDefaultController = new Controller(CATEGORY_DEFAULT_NAME, CATEGORY_DEFAULT_FILE);
		final Controller paginatorStandardController = new Controller(PAGINATOR_STANDARD_CONTROLLER_NAME, PAGINATOR_STANDARD_FILE);
		final Controller paginatorRedditController = new Controller(PAGINATOR_REDDIT_CONTROLLER_NAME, PAGINATOR_REDDIT_FILE);
		final Controller footerDefaultController = new Controller(FOOTER_DEFAULT_NAME, FOOTER_DEFAULT_FILE);
		final Controller styleDefaultController = new Controller(STYLE_DEFAULT_NAME, STYLE_DEFAULT_FILE);

		// Templates - Headers
		final Template headerStandardDefaultTemplate = new Template(HEADER_STANDARD_DEFAULT_NAME, HEADER_STANDARD_DEFAULT_DIRECTORY, HEADER_STANDARD_DEFAULT_PARAMETERS);
		final Template headerStandardDefaultFixedTemplate = new Template(HEADER_STANDARD_DEFAULT_FIXED_NAME, HEADER_STANDARD_DEFAULT_FIXED_DIRECTORY, HEADER_STANDARD_DEFAULT_FIXED_PARAMETERS);
		final Template headerStandardInverseTemplate = new Template(HEADER_STANDARD_INVERSE_NAME, HEADER_STANDARD_INVERSE_DIRECTORY, HEADER_STANDARD_INVERSE_PARAMETERS);
		final Template headerStandardInverseFixedTemplate = new Template(HEADER_STANDARD_INVERSE_FIXED_NAME, HEADER_STANDARD_INVERSE_FIXED_DIRECTORY, HEADER_STANDARD_INVERSE_FIXED_PARAMETERS);

		// Templates - Sidebars
		final Template sidebarStandardTemplate = new Template(SIDEBAR_STANDARD_NAME, SIDEBAR_STANDARD_DIRECTORY, SIDEBAR_STANDARD_PARAMETERS);

		// Templates - Widgets
		final Template widgetStandardDefault = new Template(WIDGET_STANDARD_DEFAULT_NAME, WIDGET_STANDARD_DEFAULT_DIRECTORY, WIDGET_STANDARD_DEFAULT_PARAMETERS);
		final Template widgetStandardPrimary = new Template(WIDGET_STANDARD_PRIMARY_NAME, WIDGET_STANDARD_PRIMARY_DIRECTORY, WIDGET_STANDARD_PRIMARY_PARAMETERS);
		final Template widgetStandardInfo = new Template(WIDGET_STANDARD_INFO_NAME, WIDGET_STANDARD_INFO_DIRECTORY, WIDGET_STANDARD_INFO_PARAMETERS);
		final Template widgetStandardSuccess = new Template(WIDGET_STANDARD_SUCCESS_NAME, WIDGET_STANDARD_SUCCESS_DIRECTORY, WIDGET_STANDARD_SUCCESS_PARAMETERS);
		final Template widgetStandardWarning = new Template(WIDGET_STANDARD_WARNING_NAME, WIDGET_STANDARD_WARNING_DIRECTORY, WIDGET_STANDARD_WARNING_PARAMETERS);
		final Template widgetStandardDanger = new Template(WIDGET_STANDARD_DANGER_NAME, WIDGET_STANDARD_DANGER_DIRECTORY, WIDGET_STANDARD_DANGER_PARAMETERS);

		// Templates - Pages - Category
		final Template pageCategoryNewsTemplate = new Template(PAGE_CATEGORY_NEWS_NAME, PAGE_CATEGORY_NEWS_DIRECTORY, PAGE_CATEGORY_NEWS_PARAMETERS);
		final Template pageCategoryImageTemplate = new Template(PAGE_CATEGORY_IMAGE_NAME, PAGE_CATEGORY_IMAGE_DIRECTORY, PAGE_CATEGORY_IMAGE_PARAMETERS);
		final Template pageCategoryVideoTemplate = new Template(PAGE_CATEGORY_VIDEO_NAME, PAGE_CATEGORY_VIDEO_DIRECTORY, PAGE_CATEGORY_VIDEO_PARAMETERS);
		final Template pageCategoryUncategorisedTemplate = new Template(PAGE_CATEGORY_UNCATEGORISED_NAME, PAGE_CATEGORY_UNCATEGORISED_DIRECTORY, PAGE_CATEGORY_UNCATEGORISED_PARAMETERS);

		// Templates - Pages - Reddit
		final Template pageRedditRTestDefaultTemplate = new Template(PAGE_REDDIT_R_TEST_DEFAULT_NAME, PAGE_REDDIT_R_TEST_DEFAULT_DIRECTORY, PAGE_REDDIT_R_TEST_DEFAULT_PARAMETERS);
		final Template pageRedditRTestPrimaryTemplate = new Template(PAGE_REDDIT_R_TEST_PRIMARY_NAME, PAGE_REDDIT_R_TEST_PRIMARY_DIRECTORY, PAGE_REDDIT_R_TEST_PRIMARY_PARAMETERS);
		final Template pageRedditRTestInfoTemplate = new Template(PAGE_REDDIT_R_TEST_INFO_NAME, PAGE_REDDIT_R_TEST_INFO_DIRECTORY, PAGE_REDDIT_R_TEST_INFO_PARAMETERS);
		final Template pageRedditRTestSuccessTemplate = new Template(PAGE_REDDIT_R_TEST_SUCCESS_NAME, PAGE_REDDIT_R_TEST_SUCCESS_DIRECTORY, PAGE_REDDIT_R_TEST_SUCCESS_PARAMETERS);
		final Template pageRedditRTestWarningTemplate = new Template(PAGE_REDDIT_R_TEST_WARNING_NAME, PAGE_REDDIT_R_TEST_WARNING_DIRECTORY, PAGE_REDDIT_R_TEST_WARNING_PARAMETERS);
		final Template pageRedditRTestDangerTemplate = new Template(PAGE_REDDIT_R_TEST_DANGER_NAME, PAGE_REDDIT_R_TEST_DANGER_DIRECTORY, PAGE_REDDIT_R_TEST_DANGER_PARAMETERS);

		// Templates - Posts
		final Template postStandardDefaultTemplate = new Template(POST_STANDARD_DEFAULT_NAME, POST_STANDARD_DEFAULT_DIRECTORY, POST_STANDARD_DEFAULT_PARAMETERS);
		final Template postStandardPrimaryTemplate = new Template(POST_STANDARD_PRIMARY_NAME, POST_STANDARD_PRIMARY_DIRECTORY, POST_STANDARD_PRIMARY_PARAMETERS);
		final Template postStandardInfoTemplate = new Template(POST_STANDARD_INFO_NAME, POST_STANDARD_INFO_DIRECTORY, POST_STANDARD_INFO_PARAMETERS);
		final Template postStandardSuccessTemplate = new Template(POST_STANDARD_SUCCESS_NAME, POST_STANDARD_SUCCESS_DIRECTORY, POST_STANDARD_SUCCESS_PARAMETERS);
		final Template postStandardWarningTemplate = new Template(POST_STANDARD_WARNING_NAME, POST_STANDARD_WARNING_DIRECTORY, POST_STANDARD_WARNING_PARAMETERS);
		final Template postStandardDangerTemplate = new Template(POST_STANDARD_DANGER_NAME, POST_STANDARD_DANGER_DIRECTORY, POST_STANDARD_DANGER_PARAMETERS);

		// Templates - Images
		final Template imageStandardTemplate = new Template(IMAGE_STANDARD_NAME, IMAGE_STANDARD_DIRECTORY, IMAGE_STANDARD_PARAMETERS);

		// Templates - Videos
		final Template videoStandard16By9Template = new Template(VIDEO_STANDARD_16_BY_9_NAME, VIDEO_STANDARD_16_BY_9_DIRECTORY, VIDEO_STANDARD_16_BY_9_PARAMETERS);
		final Template videoStandard4By3Template = new Template(VIDEO_STANDARD_4_BY_3_NAME, VIDEO_STANDARD_4_BY_3_DIRECTORY, VIDEO_STANDARD_4_BY_3_PARAMETERS);

		// Templates - Categories
		final Template categoryStandardDefaultTemplate = new Template(CATEGORY_STANDARD_DEFAULT_NAME, CATEGORY_STANDARD_DEFAULT_DIRECTORY, CATEGORY_STANDARD_DEFAULT_PARAMETERS);
		final Template categoryStandardPrimaryTemplate = new Template(CATEGORY_STANDARD_PRIMARY_NAME, CATEGORY_STANDARD_PRIMARY_DIRECTORY, CATEGORY_STANDARD_PRIMARY_PARAMETERS);
		final Template categoryStandardInfoTemplate = new Template(CATEGORY_STANDARD_INFO_NAME, CATEGORY_STANDARD_INFO_DIRECTORY, CATEGORY_STANDARD_INFO_PARAMETERS);
		final Template categoryStandardSuccessTemplate = new Template(CATEGORY_STANDARD_SUCCESS_NAME, CATEGORY_STANDARD_SUCCESS_DIRECTORY, CATEGORY_STANDARD_SUCCESS_PARAMETERS);
		final Template categoryStandardWarningTemplate = new Template(CATEGORY_STANDARD_WARNING_NAME, CATEGORY_STANDARD_WARNING_DIRECTORY, CATEGORY_STANDARD_WARNING_PARAMETERS);
		final Template categoryStandardDangerTemplate = new Template(CATEGORY_STANDARD_DANGER_NAME, CATEGORY_STANDARD_DANGER_DIRECTORY, CATEGORY_STANDARD_DANGER_PARAMETERS);

		// Templates - Paginators - Standard
		final Template paginatorStandardTemplate = new Template(PAGINATOR_STANDARD_NAME, PAGINATOR_STANDARD_DIRECTORY, PAGINATOR_STANDARD_PARAMETERS);
		final Template paginatorStandardSmTemplate = new Template(PAGINATOR_STANDARD_SM_NAME, PAGINATOR_STANDARD_SM_DIRECTORY, PAGINATOR_STANDARD_SM_PARAMETERS);
		final Template paginatorStandardLgTemplate = new Template(PAGINATOR_STANDARD_LG_NAME, PAGINATOR_STANDARD_LG_DIRECTORY, PAGINATOR_STANDARD_LG_PARAMETERS);

		// Templates - Paginators - Reddit
		final Template paginatorRedditTemplate = new Template(PAGINATOR_REDDIT_NAME, PAGINATOR_REDDIT_DIRECTORY, PAGINATOR_REDDIT_PARAMETERS);
		final Template paginatorRedditSmTemplate = new Template(PAGINATOR_REDDIT_SM_NAME, PAGINATOR_REDDIT_SM_DIRECTORY, PAGINATOR_REDDIT_SM_PARAMETERS);
		final Template paginatorRedditLgTemplate = new Template(PAGINATOR_REDDIT_LG_NAME, PAGINATOR_REDDIT_LG_DIRECTORY, PAGINATOR_REDDIT_LG_PARAMETERS);

		// Templates - Footers
		final Template footerStandardDefaultTemplate = new Template(FOOTER_STANDARD_DEFAULT_NAME, FOOTER_STANDARD_DEFAULT_DIRECTORY, FOOTER_STANDARD_DEFAULT_PARAMETERS);
		final Template footerStandardPrimaryTemplate = new Template(FOOTER_STANDARD_PRIMARY_NAME, FOOTER_STANDARD_PRIMARY_DIRECTORY, FOOTER_STANDARD_PRIMARY_PARAMETERS);
		final Template footerStandardInfoTemplate = new Template(FOOTER_STANDARD_INFO_NAME, FOOTER_STANDARD_INFO_DIRECTORY, FOOTER_STANDARD_INFO_PARAMETERS);
		final Template footerStandardSuccessTemplate = new Template(FOOTER_STANDARD_SUCCESS_NAME, FOOTER_STANDARD_SUCCESS_DIRECTORY, FOOTER_STANDARD_SUCCESS_PARAMETERS);
		final Template footerStandardWarningTemplate = new Template(FOOTER_STANDARD_WARNING_NAME, FOOTER_STANDARD_WARNING_DIRECTORY, FOOTER_STANDARD_WARNING_PARAMETERS);
		final Template footerStandardDangerTemplate = new Template(FOOTER_STANDARD_DANGER_NAME, FOOTER_STANDARD_DANGER_DIRECTORY, FOOTER_STANDARD_DANGER_PARAMETERS);

		// Templates - Styles
		final Template styleStandardTemplate = new Template(STYLE_STANDARD_NAME, STYLE_STANDARD_DIRECTORY, STYLE_STANDARD_PARAMETERS);

		// Styles
		final Style style = new Style(STYLE_NAME, styleStandardTemplate, styleDefaultController);

		// Footers
		final Footer footer = new Footer(FOOTER_NAME, footerStandardDefaultTemplate, footerDefaultController);

		// Paginators
		final Paginator standardPaginator = new Paginator(STANDARD_PAGINATOR_NAME, paginatorStandardTemplate, paginatorStandardController);
		final Paginator redditPaginator = new Paginator(REDDIT_PAGINATOR_NAME, paginatorRedditTemplate, paginatorRedditController);

		// Categories
		final Category newsCategory = new Category(NEWS_CATEGORY_NAME, NEWS_CATEGORY_PRIORITY, categoryStandardDefaultTemplate, categoryDefaultController);
		final Category imagesCategory = new Category(IMAGE_CATEGORY_NAME, IMAGE_CATEGORY_PRIORITY, categoryStandardDefaultTemplate, categoryDefaultController);
		final Category videosCategory = new Category(VIDEO_CATEGORY_NAME, VIDEO_CATEGORY_PRIORITY, categoryStandardDefaultTemplate, categoryDefaultController);
		final Category exampleCategory = new Category(EXAMPLE_CATEGORY_NAME, EXAMPLE_CATEGORY_PRIORITY, categoryStandardDefaultTemplate, categoryDefaultController);
		final Category defaultCategory = new Category(DEFAULT_CATEGORY_NAME, DEFAULT_CATEGORY_PRIORITY, categoryStandardDefaultTemplate, categoryDefaultController);
		final Category primaryCategory = new Category(PRIMARY_CATEGORY_NAME, PRIMARY_CATEGORY_PRIORITY, categoryStandardPrimaryTemplate, categoryDefaultController);
		final Category infoCategory = new Category(INFO_CATEGORY_NAME, INFO_CATEGORY_PRIORITY, categoryStandardInfoTemplate, categoryDefaultController);
		final Category successCategory = new Category(SUCCESS_CATEGORY_NAME, SUCCESS_CATEGORY_PRIORITY, categoryStandardSuccessTemplate, categoryDefaultController);
		final Category warningCategory = new Category(WARNING_CATEGORY_NAME, WARNING_CATEGORY_PRIORITY, categoryStandardWarningTemplate, categoryDefaultController);
		final Category dangerCategory = new Category(DANGER_CATEGORY_NAME, DANGER_CATEGORY_PRIORITY, categoryStandardDangerTemplate, categoryDefaultController);

		// Videos
		final Video testVideo = new Video(TEST_VIDEO_TITLE, TEST_VIDEO_OWNER, TEST_VIDEO_CODE, TEST_VIDEO_PRIORITY, videoStandard16By9Template, videoDefaultController);

		// Images
		final Image testImage = new Image(TEST_IMAGE_TITLE, TEST_IMAGE_OWNER, TEST_IMAGE_CODE, TEST_IMAGE_PRIORITY, imageStandardTemplate, imageDefaultController);

		// Posts - Default
		final Image[] defaultPostImages = new Image[] {};
		final Video[] defaultPostVideos = new Video[] {};
		final Category[] defaultPostCategories = new Category[] {
			newsCategory,
			exampleCategory,
			defaultCategory
		};
		final Post defaultPost = new Post(DEFAULT_POST_TITLE, superUser, DEFAULT_POST_CREATED_DATE_TIME, DEFAULT_POST_CONTENT, defaultPostImages, defaultPostVideos, defaultPostCategories, postStandardDefaultTemplate, postDefaultController);

		// Posts - Primary
		final Image[] primaryPostImages = new Image[] {};
		final Video[] primaryPostVideos = new Video[] {};
		final Category[] primaryPostCategories = new Category[] {
			newsCategory,
			exampleCategory,
			primaryCategory
		};
		final Post primaryPost = new Post(PRIMARY_POST_TITLE, superUser, PRIMARY_POST_CREATED_DATE_TIME, PRIMARY_POST_CONTENT, primaryPostImages, primaryPostVideos, primaryPostCategories, postStandardPrimaryTemplate, postDefaultController);

		// Posts - Info
		final Image[] infoPostImages = new Image[] {};
		final Video[] infoPostVideos = new Video[] {};
		final Category[] infoPostCategories = new Category[] {
			newsCategory,
			exampleCategory,
			infoCategory
		};
		final Post infoPost = new Post(INFO_POST_TITLE, superUser, INFO_POST_CREATED_DATE_TIME, INFO_POST_CONTENT, infoPostImages, infoPostVideos, infoPostCategories, postStandardInfoTemplate, postDefaultController);

		// Posts - Success
		final Category[] successPostCategories = new Category[] {
			newsCategory,
			exampleCategory,
			successCategory
		};
		final Post successPost = new Post(SUCCESS_POST_TITLE, superUser, SUCCESS_POST_CREATED_DATE_TIME, SUCCESS_POST_CONTENT, null, null, successPostCategories, postStandardSuccessTemplate, postDefaultController);

		// Posts - Warning
		final Image[] warningPostImages = new Image[] {
			testImage
		};
		final Video[] warningPostVideos = new Video[] {};
		final Category[] warningPostCategories = new Category[] {
			newsCategory,
			imagesCategory,
			exampleCategory,
			warningCategory
		};
		final Post warningPost = new Post(WARNING_POST_TITLE, superUser, WARNING_POST_CREATED_DATE_TIME, WARNING_POST_CONTENT, warningPostImages, warningPostVideos, warningPostCategories, postStandardWarningTemplate, postDefaultController);

		// Posts - Danger
		final Image[] dangerPostImages = new Image[] {};
		final Video[] dangerPostVideos = new Video[] {
			testVideo
		};
		final Category[] dangerPostCategories = new Category[] {
			newsCategory,
			videosCategory,
			exampleCategory,
			dangerCategory
		};
		final Post dangerPost = new Post(DANGER_POST_TITLE, superUser, DANGER_POST_CREATED_DATE_TIME, DANGER_POST_CONTENT, dangerPostImages, dangerPostVideos, dangerPostCategories, postStandardDangerTemplate, postDefaultController);

		// Posts - Uncategorised
		final Image[] uncategorisedPostImages = new Image[] {};
		final Video[] uncategorisedPostVideos = new Video[] {};
		final Category[] uncategorisedPostCategories = new Category[] {};
		final Post uncategorisedPost = new Post(UNCATEGORISED_POST_TITLE, superUser, UNCATEGORISED_POST_CREATED_DATE_TIME, UNCATEGORISED_POST_CONTENT, uncategorisedPostImages, uncategorisedPostVideos, uncategorisedPostCategories, postStandardDefaultTemplate, postDefaultController);

		// Pages
		final Page newsPage = new Page(NEWS_PAGE_NAME, NEWS_PAGE_HIDDEN, standardPaginator, NEWS_PAGE_PRIORITY, pageCategoryNewsTemplate, pageCategoryController);
		final Page imagesPage = new Page(IMAGES_PAGE_NAME, IMAGES_PAGE_HIDDEN, standardPaginator, IMAGES_PAGE_PRIORITY, pageCategoryImageTemplate, pageCategoryController);
		final Page videosPage = new Page(VIDEOS_PAGE_NAME, VIDEOS_PAGE_HIDDEN, standardPaginator, VIDEOS_PAGE_PRIORITY, pageCategoryVideoTemplate, pageCategoryController);
		final Page rTestPage = new Page(R_TEST_PAGE_NAME, R_TEST_PAGE_HIDDEN, redditPaginator, R_TEST_PAGE_PRIORITY, pageRedditRTestDefaultTemplate, pageRedditController);
		final Page uncategorisedHiddenPage = new Page(UNCATEGORISED_HIDDEN_PAGE_NAME, UNCATEGORISED_HIDDEN_PAGE_HIDDEN, standardPaginator, UNCATEGORISED_HIDDEN_PAGE_PRIORITY, pageCategoryUncategorisedTemplate, pageCategoryController);

		// Widgets
		final Widget githubLinkWidget = new Widget(GITHUB_LINK_WIDGET_NAME, GITHUB_LINK_WIDGET_CONTENT, GITHUB_LINK_WIDGET_PRIORITY, widgetStandardDefault, widgetDefaultController);
		final Widget todoListWidget = new Widget(TODO_LIST_WIDGET_NAME, TODO_LIST_WIDGET_CONTENT, TODO_LIST_WIDGET_PRIORITY, widgetStandardDefault, widgetDefaultController);

		// Sidebars
		final Widget[] rightSidebarWidgets = new Widget[] {
			githubLinkWidget,
			todoListWidget
		};
		final Sidebar rightSidebar = new Sidebar(RIGHT_SIDEBAR_NAME, rightSidebarWidgets, sidebarStandardTemplate, sidebarDefaultController);

		// Headers
		final Page[] headerPages = new Page[] {
			newsPage,
			imagesPage,
			videosPage,
			rTestPage,
			uncategorisedHiddenPage
		};
		final Header header = new Header(HEADER_NAME, headerPages, headerStandardDefaultFixedTemplate, headerDefaultController);

		// Configs
		final Config config = new Config(CONFIG_NAME, header, null, rightSidebar, footer, style);

		Object[] objects = new Object[] {

			// Configs
			config,

			// Headers
			header,

			// Sidebars
			rightSidebar,

			// Widgets
			githubLinkWidget, todoListWidget,

			// Pages
			newsPage, imagesPage, videosPage, rTestPage, uncategorisedHiddenPage,

			// Posts
			defaultPost, primaryPost, infoPost, successPost, warningPost, dangerPost, uncategorisedPost,

			// Images
			testImage,

			// Videos
			testVideo,

			// Categories
			newsCategory, imagesCategory, videosCategory, exampleCategory, defaultCategory, primaryCategory, infoCategory, successCategory, warningCategory, dangerCategory,

			// Paginators
			standardPaginator, redditPaginator,

			// Footers
			footer,

			// Styles
			style,

			// Templates - Headers
			headerStandardDefaultTemplate, headerStandardDefaultFixedTemplate, headerStandardInverseTemplate, headerStandardInverseFixedTemplate,

			// Templates - Sidebars
			sidebarStandardTemplate,

			// Templates - Widgets
			widgetStandardDefault, widgetStandardPrimary, widgetStandardInfo, widgetStandardSuccess, widgetStandardWarning, widgetStandardDanger,

			// Templates - Pages - Category
			pageCategoryNewsTemplate, pageCategoryImageTemplate, pageCategoryVideoTemplate, pageCategoryUncategorisedTemplate,

			// Templates - Pages - Reddit
			pageRedditRTestDefaultTemplate, pageRedditRTestPrimaryTemplate, pageRedditRTestInfoTemplate, pageRedditRTestSuccessTemplate, pageRedditRTestWarningTemplate, pageRedditRTestDangerTemplate,

			// Templates - Posts
			postStandardDefaultTemplate, postStandardPrimaryTemplate, postStandardInfoTemplate, postStandardSuccessTemplate, postStandardWarningTemplate, postStandardDangerTemplate,

			// Templates - Images
			imageStandardTemplate,

			// Templates - Videos
			videoStandard16By9Template, videoStandard4By3Template,

			// Templates - Categories
			categoryStandardDefaultTemplate, categoryStandardPrimaryTemplate, categoryStandardInfoTemplate, categoryStandardSuccessTemplate, categoryStandardWarningTemplate, categoryStandardDangerTemplate,

			// Templates - Paginators - Standard
			paginatorStandardTemplate, paginatorStandardSmTemplate, paginatorStandardLgTemplate,

			// Templates - Paginators - Reddit
			paginatorRedditTemplate, paginatorRedditSmTemplate, paginatorRedditLgTemplate,

			// Templates - Footers
			footerStandardDefaultTemplate, footerStandardPrimaryTemplate, footerStandardInfoTemplate, footerStandardSuccessTemplate, footerStandardWarningTemplate, footerStandardDangerTemplate,

			// Templates - Styles
			styleStandardTemplate,

			// Controllers
			headerDefaultController, sidebarDefaultController, widgetDefaultController, pageCategoryController, pageRedditController, postDefaultController, imageDefaultController, videoDefaultController, categoryDefaultController, paginatorStandardController, paginatorRedditController, footerDefaultController, styleDefaultController

		};

		String objectsStr = "";
		for (int i = 0; i < objects.length; i++) {
			objectsStr += objects[i] + (i < objects.length - 1 ? ",\n" : "");
		}
		System.out.println("[\n    " + objectsStr.replaceAll("\n", "\n    ") + "\n]");

	}

}
