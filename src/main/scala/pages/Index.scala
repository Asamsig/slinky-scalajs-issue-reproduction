package pages

import components.{Layout, UtilStyles}
import slinky.core.{FunctionalComponent, ReactComponentClass}
import slinky.web.html._

import scala.scalajs.js.annotation.{JSExportTopLevel, JSImport}

object Index {
  @JSExportTopLevel(JSImport.Default, "Index")
  val component: ReactComponentClass[Unit] = FunctionalComponent[Unit] { _ =>
    Layout(home = true)(
      section(className := UtilStyles.headingMd)(
        p("Hi there!"),
        p(
          "This is a sample website - you’ll be building a site like this on ",
          a(href := "https://nextjs.org/learn")("our Next.js tutorial"),
          "."
        )
      )
    )
  }
}
