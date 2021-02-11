package dev

import scala.beans.BeanProperty

package object model {
  case class Greeting(@BeanProperty var body: String)
}
