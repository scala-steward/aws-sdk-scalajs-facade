package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object sagemakerruntime {
  type BodyBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CustomAttributesHeader = String
  type EndpointName = String
  type Header = String
  type InferenceId = String
  type TargetContainerHostnameHeader = String
  type TargetModelHeader = String
  type TargetVariantHeader = String

  implicit final class SageMakerRuntimeOps(private val service: SageMakerRuntime) extends AnyVal {

    @inline def invokeEndpointFuture(params: InvokeEndpointInput): Future[InvokeEndpointOutput] = service.invokeEndpoint(params).promise().toFuture

  }
}

package sagemakerruntime {
  @js.native
  @JSImport("aws-sdk/clients/sagemakerruntime", JSImport.Namespace, "AWS.SageMakerRuntime")
  class SageMakerRuntime() extends js.Object {
    def this(config: AWSConfig) = this()

    def invokeEndpoint(params: InvokeEndpointInput): Request[InvokeEndpointOutput] = js.native
  }

  @js.native
  trait InvokeEndpointInput extends js.Object {
    var Body: BodyBlob
    var EndpointName: EndpointName
    var Accept: js.UndefOr[Header]
    var ContentType: js.UndefOr[Header]
    var CustomAttributes: js.UndefOr[CustomAttributesHeader]
    var InferenceId: js.UndefOr[InferenceId]
    var TargetContainerHostname: js.UndefOr[TargetContainerHostnameHeader]
    var TargetModel: js.UndefOr[TargetModelHeader]
    var TargetVariant: js.UndefOr[TargetVariantHeader]
  }

  object InvokeEndpointInput {
    @inline
    def apply(
        Body: BodyBlob,
        EndpointName: EndpointName,
        Accept: js.UndefOr[Header] = js.undefined,
        ContentType: js.UndefOr[Header] = js.undefined,
        CustomAttributes: js.UndefOr[CustomAttributesHeader] = js.undefined,
        InferenceId: js.UndefOr[InferenceId] = js.undefined,
        TargetContainerHostname: js.UndefOr[TargetContainerHostnameHeader] = js.undefined,
        TargetModel: js.UndefOr[TargetModelHeader] = js.undefined,
        TargetVariant: js.UndefOr[TargetVariantHeader] = js.undefined
    ): InvokeEndpointInput = {
      val __obj = js.Dynamic.literal(
        "Body" -> Body.asInstanceOf[js.Any],
        "EndpointName" -> EndpointName.asInstanceOf[js.Any]
      )

      Accept.foreach(__v => __obj.updateDynamic("Accept")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      CustomAttributes.foreach(__v => __obj.updateDynamic("CustomAttributes")(__v.asInstanceOf[js.Any]))
      InferenceId.foreach(__v => __obj.updateDynamic("InferenceId")(__v.asInstanceOf[js.Any]))
      TargetContainerHostname.foreach(__v => __obj.updateDynamic("TargetContainerHostname")(__v.asInstanceOf[js.Any]))
      TargetModel.foreach(__v => __obj.updateDynamic("TargetModel")(__v.asInstanceOf[js.Any]))
      TargetVariant.foreach(__v => __obj.updateDynamic("TargetVariant")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InvokeEndpointInput]
    }
  }

  @js.native
  trait InvokeEndpointOutput extends js.Object {
    var Body: BodyBlob
    var ContentType: js.UndefOr[Header]
    var CustomAttributes: js.UndefOr[CustomAttributesHeader]
    var InvokedProductionVariant: js.UndefOr[Header]
  }

  object InvokeEndpointOutput {
    @inline
    def apply(
        Body: BodyBlob,
        ContentType: js.UndefOr[Header] = js.undefined,
        CustomAttributes: js.UndefOr[CustomAttributesHeader] = js.undefined,
        InvokedProductionVariant: js.UndefOr[Header] = js.undefined
    ): InvokeEndpointOutput = {
      val __obj = js.Dynamic.literal(
        "Body" -> Body.asInstanceOf[js.Any]
      )

      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      CustomAttributes.foreach(__v => __obj.updateDynamic("CustomAttributes")(__v.asInstanceOf[js.Any]))
      InvokedProductionVariant.foreach(__v => __obj.updateDynamic("InvokedProductionVariant")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InvokeEndpointOutput]
    }
  }
}
