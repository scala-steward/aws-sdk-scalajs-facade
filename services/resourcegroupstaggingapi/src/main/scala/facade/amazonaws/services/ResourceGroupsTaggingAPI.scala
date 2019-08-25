package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object resourcegroupstaggingapi {
  type AmazonResourceType     = String
  type ErrorCode              = String
  type ErrorMessage           = String
  type ExceptionMessage       = String
  type FailedResourcesMap     = js.Dictionary[FailureInfo]
  type PaginationToken        = String
  type ResourceARN            = String
  type ResourceARNList        = js.Array[ResourceARN]
  type ResourceTagMappingList = js.Array[ResourceTagMapping]
  type ResourceTypeFilterList = js.Array[AmazonResourceType]
  type ResourcesPerPage       = Int
  type StatusCode             = Int
  type TagFilterList          = js.Array[TagFilter]
  type TagKey                 = String
  type TagKeyList             = js.Array[TagKey]
  type TagKeyListForUntag     = js.Array[TagKey]
  type TagList                = js.Array[Tag]
  type TagMap                 = js.Dictionary[TagValue]
  type TagValue               = String
  type TagValueList           = js.Array[TagValue]
  type TagValuesOutputList    = js.Array[TagValue]
  type TagsPerPage            = Int

  implicit final class ResourceGroupsTaggingAPIOps(val service: ResourceGroupsTaggingAPI) extends AnyVal {

    def getResourcesFuture(params: GetResourcesInput): Future[GetResourcesOutput] =
      service.getResources(params).promise.toFuture
    def getTagKeysFuture(params: GetTagKeysInput): Future[GetTagKeysOutput] =
      service.getTagKeys(params).promise.toFuture
    def getTagValuesFuture(params: GetTagValuesInput): Future[GetTagValuesOutput] =
      service.getTagValues(params).promise.toFuture
    def tagResourcesFuture(params: TagResourcesInput): Future[TagResourcesOutput] =
      service.tagResources(params).promise.toFuture
    def untagResourcesFuture(params: UntagResourcesInput): Future[UntagResourcesOutput] =
      service.untagResources(params).promise.toFuture
  }
}

package resourcegroupstaggingapi {
  @js.native
  @JSImport("aws-sdk", "ResourceGroupsTaggingAPI")
  class ResourceGroupsTaggingAPI() extends js.Object {
    def this(config: AWSConfig) = this()

    def getResources(params: GetResourcesInput): Request[GetResourcesOutput]       = js.native
    def getTagKeys(params: GetTagKeysInput): Request[GetTagKeysOutput]             = js.native
    def getTagValues(params: GetTagValuesInput): Request[GetTagValuesOutput]       = js.native
    def tagResources(params: TagResourcesInput): Request[TagResourcesOutput]       = js.native
    def untagResources(params: UntagResourcesInput): Request[UntagResourcesOutput] = js.native
  }

  object ErrorCodeEnum {
    val InternalServiceException  = "InternalServiceException"
    val InvalidParameterException = "InvalidParameterException"

    val values = IndexedSeq(InternalServiceException, InvalidParameterException)
  }

  /**
    * Details of the common errors that all actions return.
    */
  @js.native
  trait FailureInfo extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var StatusCode: js.UndefOr[StatusCode]
  }

  object FailureInfo {
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        StatusCode: js.UndefOr[StatusCode] = js.undefined
    ): FailureInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorCode.foreach(__v => __obj.update("ErrorCode", __v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.update("ErrorMessage", __v.asInstanceOf[js.Any]))
      StatusCode.foreach(__v => __obj.update("StatusCode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailureInfo]
    }
  }

  @js.native
  trait GetResourcesInput extends js.Object {
    var PaginationToken: js.UndefOr[PaginationToken]
    var ResourceTypeFilters: js.UndefOr[ResourceTypeFilterList]
    var ResourcesPerPage: js.UndefOr[ResourcesPerPage]
    var TagFilters: js.UndefOr[TagFilterList]
    var TagsPerPage: js.UndefOr[TagsPerPage]
  }

  object GetResourcesInput {
    def apply(
        PaginationToken: js.UndefOr[PaginationToken] = js.undefined,
        ResourceTypeFilters: js.UndefOr[ResourceTypeFilterList] = js.undefined,
        ResourcesPerPage: js.UndefOr[ResourcesPerPage] = js.undefined,
        TagFilters: js.UndefOr[TagFilterList] = js.undefined,
        TagsPerPage: js.UndefOr[TagsPerPage] = js.undefined
    ): GetResourcesInput = {
      val __obj = js.Dictionary.empty[js.Any]
      PaginationToken.foreach(__v => __obj.update("PaginationToken", __v.asInstanceOf[js.Any]))
      ResourceTypeFilters.foreach(__v => __obj.update("ResourceTypeFilters", __v.asInstanceOf[js.Any]))
      ResourcesPerPage.foreach(__v => __obj.update("ResourcesPerPage", __v.asInstanceOf[js.Any]))
      TagFilters.foreach(__v => __obj.update("TagFilters", __v.asInstanceOf[js.Any]))
      TagsPerPage.foreach(__v => __obj.update("TagsPerPage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcesInput]
    }
  }

  @js.native
  trait GetResourcesOutput extends js.Object {
    var PaginationToken: js.UndefOr[PaginationToken]
    var ResourceTagMappingList: js.UndefOr[ResourceTagMappingList]
  }

  object GetResourcesOutput {
    def apply(
        PaginationToken: js.UndefOr[PaginationToken] = js.undefined,
        ResourceTagMappingList: js.UndefOr[ResourceTagMappingList] = js.undefined
    ): GetResourcesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      PaginationToken.foreach(__v => __obj.update("PaginationToken", __v.asInstanceOf[js.Any]))
      ResourceTagMappingList.foreach(__v => __obj.update("ResourceTagMappingList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcesOutput]
    }
  }

  @js.native
  trait GetTagKeysInput extends js.Object {
    var PaginationToken: js.UndefOr[PaginationToken]
  }

  object GetTagKeysInput {
    def apply(
        PaginationToken: js.UndefOr[PaginationToken] = js.undefined
    ): GetTagKeysInput = {
      val __obj = js.Dictionary.empty[js.Any]
      PaginationToken.foreach(__v => __obj.update("PaginationToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTagKeysInput]
    }
  }

  @js.native
  trait GetTagKeysOutput extends js.Object {
    var PaginationToken: js.UndefOr[PaginationToken]
    var TagKeys: js.UndefOr[TagKeyList]
  }

  object GetTagKeysOutput {
    def apply(
        PaginationToken: js.UndefOr[PaginationToken] = js.undefined,
        TagKeys: js.UndefOr[TagKeyList] = js.undefined
    ): GetTagKeysOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      PaginationToken.foreach(__v => __obj.update("PaginationToken", __v.asInstanceOf[js.Any]))
      TagKeys.foreach(__v => __obj.update("TagKeys", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTagKeysOutput]
    }
  }

  @js.native
  trait GetTagValuesInput extends js.Object {
    var Key: TagKey
    var PaginationToken: js.UndefOr[PaginationToken]
  }

  object GetTagValuesInput {
    def apply(
        Key: TagKey,
        PaginationToken: js.UndefOr[PaginationToken] = js.undefined
    ): GetTagValuesInput = {
      val __obj = js.Dictionary[js.Any](
        "Key" -> Key.asInstanceOf[js.Any]
      )

      PaginationToken.foreach(__v => __obj.update("PaginationToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTagValuesInput]
    }
  }

  @js.native
  trait GetTagValuesOutput extends js.Object {
    var PaginationToken: js.UndefOr[PaginationToken]
    var TagValues: js.UndefOr[TagValuesOutputList]
  }

  object GetTagValuesOutput {
    def apply(
        PaginationToken: js.UndefOr[PaginationToken] = js.undefined,
        TagValues: js.UndefOr[TagValuesOutputList] = js.undefined
    ): GetTagValuesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      PaginationToken.foreach(__v => __obj.update("PaginationToken", __v.asInstanceOf[js.Any]))
      TagValues.foreach(__v => __obj.update("TagValues", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTagValuesOutput]
    }
  }

  /**
    * The request processing failed because of an unknown error, exception, or failure. You can retry the request.
    */
  @js.native
  trait InternalServiceExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
    * A parameter is missing or a malformed string or invalid or out-of-range value was supplied for the request parameter.
    */
  @js.native
  trait InvalidParameterExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
    * A <code>PaginationToken</code> is valid for a maximum of 15 minutes. Your request was denied because the specified <code>PaginationToken</code> has expired.
    */
  @js.native
  trait PaginationTokenExpiredExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
    * A list of resource ARNs and the tags (keys and values) that are associated with each.
    */
  @js.native
  trait ResourceTagMapping extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var Tags: js.UndefOr[TagList]
  }

  object ResourceTagMapping {
    def apply(
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ResourceTagMapping = {
      val __obj = js.Dictionary.empty[js.Any]
      ResourceARN.foreach(__v => __obj.update("ResourceARN", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceTagMapping]
    }
  }

  /**
    * The metadata that you apply to AWS resources to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. For more information, see [[http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-basics|Tag Basics]] in the <i>Amazon EC2 User Guide for Linux Instances</i>.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  /**
    * A list of tags (keys and values) that are used to specify the associated resources.
    */
  @js.native
  trait TagFilter extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Values: js.UndefOr[TagValueList]
  }

  object TagFilter {
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Values: js.UndefOr[TagValueList] = js.undefined
    ): TagFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.update("Values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagFilter]
    }
  }

  @js.native
  trait TagResourcesInput extends js.Object {
    var ResourceARNList: ResourceARNList
    var Tags: TagMap
  }

  object TagResourcesInput {
    def apply(
        ResourceARNList: ResourceARNList,
        Tags: TagMap
    ): TagResourcesInput = {
      val __obj = js.Dictionary[js.Any](
        "ResourceARNList" -> ResourceARNList.asInstanceOf[js.Any],
        "Tags"            -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourcesInput]
    }
  }

  @js.native
  trait TagResourcesOutput extends js.Object {
    var FailedResourcesMap: js.UndefOr[FailedResourcesMap]
  }

  object TagResourcesOutput {
    def apply(
        FailedResourcesMap: js.UndefOr[FailedResourcesMap] = js.undefined
    ): TagResourcesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      FailedResourcesMap.foreach(__v => __obj.update("FailedResourcesMap", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagResourcesOutput]
    }
  }

  /**
    * The request was denied to limit the frequency of submitted requests.
    */
  @js.native
  trait ThrottledExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  @js.native
  trait UntagResourcesInput extends js.Object {
    var ResourceARNList: ResourceARNList
    var TagKeys: TagKeyListForUntag
  }

  object UntagResourcesInput {
    def apply(
        ResourceARNList: ResourceARNList,
        TagKeys: TagKeyListForUntag
    ): UntagResourcesInput = {
      val __obj = js.Dictionary[js.Any](
        "ResourceARNList" -> ResourceARNList.asInstanceOf[js.Any],
        "TagKeys"         -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourcesInput]
    }
  }

  @js.native
  trait UntagResourcesOutput extends js.Object {
    var FailedResourcesMap: js.UndefOr[FailedResourcesMap]
  }

  object UntagResourcesOutput {
    def apply(
        FailedResourcesMap: js.UndefOr[FailedResourcesMap] = js.undefined
    ): UntagResourcesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      FailedResourcesMap.foreach(__v => __obj.update("FailedResourcesMap", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UntagResourcesOutput]
    }
  }
}
