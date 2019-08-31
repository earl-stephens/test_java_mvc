// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/earltstephens/turing/1903_4module/playground/test_java_mvc/conf/routes
// @DATE:Sat Aug 31 08:24:08 MDT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
