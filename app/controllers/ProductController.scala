package controllers


import javax.inject.{Inject, Singleton}

import play.api._
import play.api.data.Form
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc._
import play.api.mvc.Controller


/**
  * Created by Administrador on 9/2/2017.
  */
@Singleton
class ProductController @Inject()(val messageApi: MessagesApi, val service: IProductService) extends Controller with I18nSupport
{
  val productForm: Form.type = Form(
    "id" -> optional(longNumber),

  )()()

}
