package components

import slinky.core.FunctionalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import slinky.web.html._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("resources/layout.module.css", JSImport.Default)
@js.native
object Styles extends js.Object {
  val container: String = js.native
  val header: String = js.native
  val backToHome: String = js.native
}
@JSImport("resources/utils.module.css", JSImport.Default)
@js.native
object UtilStyles extends js.Object {
  val borderCircle: String = js.native
  val heading2Xl: String = js.native
  val headingLg: String = js.native
  val colorInherit: String = js.native
  val headingMd: String = js.native
}

@react object Layout {
  case class Props(home: Boolean, children: ReactElement*)
  val component = FunctionalComponent[Props] { props =>
    div(className := Styles.container)(
      main(props.children)
    )
  }
}
