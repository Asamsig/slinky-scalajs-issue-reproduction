package pages

import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import slinky.core.{ReactComponentClass, StatelessComponent}
import slinky.web.html.p

import scala.scalajs.js.annotation.{JSExportTopLevel, JSImport}

object HomeComponent {

  @react class Home extends StatelessComponent {
    def render(): ReactElement = p("Hello World from a Class Component!")
    type Props = Unit
  }
  @JSExportTopLevel(JSImport.Default, "Home")
  val component: ReactComponentClass[_] = Home

}
