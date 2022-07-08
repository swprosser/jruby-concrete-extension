package foo;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import org.jruby.Ruby;
import org.jruby.RubyClass;
import org.jruby.RubyKernel;
import org.jruby.RubyString;
import org.jruby.runtime.ThreadContext;
import static org.jruby.runtime.Block.NULL_BLOCK;

public class JavaSuperclass {
    public JavaSuperclass() {
    }

    public static void main(String[] args) {
        Ruby ruby = Ruby.newInstance();
        ThreadContext threadContext = ThreadContext.newContext(ruby);
        Path path = FileSystems.getDefault().getPath("ruby_concrete_extension");
        RubyKernel.require(threadContext, null, RubyString.newString(ruby, path.toAbsolutePath().toString()), NULL_BLOCK);
        RubyClass rubyClass = ruby.fetchGlobalConstant("RubyConcreteExtension").toJava(RubyClass.class);
        JavaSuperclass obj = rubyClass.callMethod(threadContext, "new").toJava(JavaSuperclass.class);

        obj.getSnakeCase();
        obj.getCamelCase();
        obj.getSnakeCaseAlias();
        obj.getCamelCaseAlias();
        obj.getSnakeCaseAliasMethod();
        obj.getCamelCaseAliasMethod();
        obj.getSnakeCaseMixin();
        obj.getCamelCaseMixin();
        obj.getSnakeCaseAliasMixin();
        obj.getCamelCaseAliasMixin();
        obj.getSnakeCaseAliasMethodMixin();
        obj.getCamelCaseAliasMethodMixin();
    }

    public int getSnakeCase() {
        System.out.println("Call Java version of getSnakeCase()");
        return 0;
    }

    public int getCamelCase() {
        System.out.println("Call Java version of getCamelCase()");
        return 0;
    }

    public int getSnakeCaseAlias() {
        System.out.println("Call Java version of getSnakeCaseAlias()");
        return 0;
    }

    public int getCamelCaseAlias() {
        System.out.println("Call Java version of getCamelCaseAlias()");
        return 0;
    }

    public int getSnakeCaseAliasMethod() {
        System.out.println("Call Java version of getSnakeCaseAliasMethod()");
        return 0;
    }

    public int getCamelCaseAliasMethod() {
        System.out.println("Call Java version of getCamelCaseAliasMethod()");
        return 0;
    }

    public int getSnakeCaseMixin() {
        System.out.println("Call Java version of getSnakeCaseMixin()");
        return 0;
    }

    public int getCamelCaseMixin() {
        System.out.println("Call Java version of getCamelCaseMixin()");
        return 0;
    }

    public int getSnakeCaseAliasMixin() {
        System.out.println("Call Java version of getSnakeCaseAliasMixin()");
        return 0;
    }

    public int getCamelCaseAliasMixin() {
        System.out.println("Call Java version of getCamelCaseAliasMixin()");
        return 0;
    }

    public int getSnakeCaseAliasMethodMixin() {
        System.out.println("Call Java version of getSnakeCaseAliasMethodMixin()");
        return 0;
    }

    public int getCamelCaseAliasMethodMixin() {
        System.out.println("Call Java version of getCamelCaseAliasMethodMixin()");
        return 0;
    }
}
