package models

/**
  * Created by Administrador on 9/2/2017.
  */
case class Image
(var id: Option[Long],
 var productId: Option[Long],
 var url: String)
{
  override def toString: String = {
    "Image { productId: " + productId.getOrElse(0) + ", url: " + url + "}"
  }
}
