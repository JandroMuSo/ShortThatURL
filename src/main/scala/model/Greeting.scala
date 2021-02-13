package dev.jandromuso
package model

import scala.beans.BeanProperty

case class Greeting(@BeanProperty var body: String)
