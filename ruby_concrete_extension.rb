require_relative "ruby_mixin"

class RubyConcreteExtension < Java::Foo::JavaSuperclass
  include RubyMixin

  def snake_case
    puts "Call Ruby version of getSnakeCase()"
    1
  end

  def getCamelCase
    puts "Call Ruby version of getCamelCase()"
    1
  end

  def snake_case_alias
    puts "Call Ruby version of getSnakeCaseAlias()"
    1
  end
  alias getSnakeCaseAlias snake_case_alias

  def getCamelCaseAlias
    puts "Call Ruby version of getCamelCaseAlias()"
    1
  end
  alias camel_case_alias getCamelCaseAlias
  alias get_camel_case_alias getCamelCaseAlias

  def snake_case_alias_method
    puts "Call Ruby version of getSnakeCaseAliasMethod()"
    1
  end
  alias_method :getSnakeCaseAliasMethod, :snake_case_alias_method

  def getCamelCaseAliasMethod
    puts "Call Ruby version of getCamelCaseAliasMethod()"
    1
  end
  alias_method :camel_case_alias_method, :getCamelCaseAliasMethod
  alias_method :get_camel_case_alias_method, :getCamelCaseAliasMethod
end
