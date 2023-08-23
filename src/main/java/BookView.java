import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class BookView {
    public void DisplayBookInfo(String bookName, int bookReleaseDate, int bookId) {
        System.out.println("Book info: ");
        System.out.println("Name: " + bookName);
        System.out.println("Release Date: " + bookReleaseDate );
        System.out.println("Id: " + bookId);
    }

    public String runView(String bookName, int bookReleaseDate, int bookId) {
        var resolver = new ClassLoaderTemplateResolver();
        resolver.setTemplateMode(TemplateMode.HTML);
        resolver.setCharacterEncoding("UTF-8");
        resolver.setPrefix("/templates/");
        resolver.setSuffix(".html");

        var context = new Context();
        context.setVariable("name", bookName);
        context.setVariable("date", bookReleaseDate);
        context.setVariable("id", bookId);

        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(resolver);

        return templateEngine.process("index", context);
    }
}
