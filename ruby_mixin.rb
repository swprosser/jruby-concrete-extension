module RubyMixin
  def snake_case_mixin
    super()
    puts "Call Ruby version of getSnakeCaseMixin()"
    1
  end

  def getCamelCaseMixin
    super()
    puts "Call Ruby version of getCamelCaseMixin()"
    1
  end

  def snake_case_alias_mixin
    super()
    puts "Call Ruby version of getSnakeCaseAliasMixin()"
    1
  end
  alias getSnakeCaseAliasMixin snake_case_alias_mixin

  def getCamelCaseAliasMixin
    super()
    puts "Call Ruby version of getCamelCaseAliasMixin()"
    1
  end
  alias camel_case_alias_mixin getCamelCaseAliasMixin
  alias get_camel_case_alias_mixin getCamelCaseAliasMixin

  def snake_case_alias_method_mixin
    super()
    puts "Call Ruby version of getSnakeCaseAliasMethodMixin()"
    1
  end
  alias_method :getSnakeCaseAliasMethodMixin, :snake_case_alias_method_mixin

  def getCamelCaseAliasMethodMixin
    super()
    puts "Call Ruby version of getCamelCaseAliasMethodMixin()"
    1
  end
  alias_method :camel_case_alias_method_mixin, :getCamelCaseAliasMethodMixin
  alias_method :get_camel_case_alias_method_mixin, :getCamelCaseAliasMethodMixin
end
