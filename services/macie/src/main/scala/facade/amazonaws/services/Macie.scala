package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object macie {
  type AWSAccountId                    = String
  type BucketName                      = String
  type ErrorCode                       = String
  type ExceptionMessage                = String
  type FailedS3Resources               = js.Array[FailedS3Resource]
  type FieldName                       = String
  type MaxResults                      = Int
  type MemberAccounts                  = js.Array[MemberAccount]
  type NextToken                       = String
  type Prefix                          = String
  type ResourceType                    = String
  type S3ContinuousClassificationType  = String
  type S3OneTimeClassificationType     = String
  type S3Resources                     = js.Array[S3Resource]
  type S3ResourcesClassification       = js.Array[S3ResourceClassification]
  type S3ResourcesClassificationUpdate = js.Array[S3ResourceClassificationUpdate]

  implicit final class MacieOps(private val service: Macie) extends AnyVal {

    def associateMemberAccountFuture(params: AssociateMemberAccountRequest): Future[js.Object] =
      service.associateMemberAccount(params).promise.toFuture
    def associateS3ResourcesFuture(params: AssociateS3ResourcesRequest): Future[AssociateS3ResourcesResult] =
      service.associateS3Resources(params).promise.toFuture
    def disassociateMemberAccountFuture(params: DisassociateMemberAccountRequest): Future[js.Object] =
      service.disassociateMemberAccount(params).promise.toFuture
    def disassociateS3ResourcesFuture(params: DisassociateS3ResourcesRequest): Future[DisassociateS3ResourcesResult] =
      service.disassociateS3Resources(params).promise.toFuture
    def listMemberAccountsFuture(params: ListMemberAccountsRequest): Future[ListMemberAccountsResult] =
      service.listMemberAccounts(params).promise.toFuture
    def listS3ResourcesFuture(params: ListS3ResourcesRequest): Future[ListS3ResourcesResult] =
      service.listS3Resources(params).promise.toFuture
    def updateS3ResourcesFuture(params: UpdateS3ResourcesRequest): Future[UpdateS3ResourcesResult] =
      service.updateS3Resources(params).promise.toFuture
  }
}

package macie {
  @js.native
  @JSImport("aws-sdk", "Macie")
  class Macie() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateMemberAccount(params: AssociateMemberAccountRequest): Request[js.Object]              = js.native
    def associateS3Resources(params: AssociateS3ResourcesRequest): Request[AssociateS3ResourcesResult] = js.native
    def disassociateMemberAccount(params: DisassociateMemberAccountRequest): Request[js.Object]        = js.native
    def disassociateS3Resources(params: DisassociateS3ResourcesRequest): Request[DisassociateS3ResourcesResult] =
      js.native
    def listMemberAccounts(params: ListMemberAccountsRequest): Request[ListMemberAccountsResult] = js.native
    def listS3Resources(params: ListS3ResourcesRequest): Request[ListS3ResourcesResult]          = js.native
    def updateS3Resources(params: UpdateS3ResourcesRequest): Request[UpdateS3ResourcesResult]    = js.native
  }

  /**
    * You do not have required permissions to access the requested resource.
    */
  @js.native
  trait AccessDeniedExceptionException extends js.Object {
    val message: ExceptionMessage
    val resourceType: ResourceType
  }

  @js.native
  trait AssociateMemberAccountRequest extends js.Object {
    var memberAccountId: AWSAccountId
  }

  object AssociateMemberAccountRequest {
    def apply(
        memberAccountId: AWSAccountId
    ): AssociateMemberAccountRequest = {
      val __obj = js.Dictionary[js.Any](
        "memberAccountId" -> memberAccountId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateMemberAccountRequest]
    }
  }

  @js.native
  trait AssociateS3ResourcesRequest extends js.Object {
    var s3Resources: S3ResourcesClassification
    var memberAccountId: js.UndefOr[AWSAccountId]
  }

  object AssociateS3ResourcesRequest {
    def apply(
        s3Resources: S3ResourcesClassification,
        memberAccountId: js.UndefOr[AWSAccountId] = js.undefined
    ): AssociateS3ResourcesRequest = {
      val __obj = js.Dictionary[js.Any](
        "s3Resources" -> s3Resources.asInstanceOf[js.Any]
      )

      memberAccountId.foreach(__v => __obj.update("memberAccountId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateS3ResourcesRequest]
    }
  }

  @js.native
  trait AssociateS3ResourcesResult extends js.Object {
    var failedS3Resources: js.UndefOr[FailedS3Resources]
  }

  object AssociateS3ResourcesResult {
    def apply(
        failedS3Resources: js.UndefOr[FailedS3Resources] = js.undefined
    ): AssociateS3ResourcesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      failedS3Resources.foreach(__v => __obj.update("failedS3Resources", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateS3ResourcesResult]
    }
  }

  /**
    * The classification type that Amazon Macie applies to the associated S3 resources.
    */
  @js.native
  trait ClassificationType extends js.Object {
    var continuous: S3ContinuousClassificationType
    var oneTime: S3OneTimeClassificationType
  }

  object ClassificationType {
    def apply(
        continuous: S3ContinuousClassificationType,
        oneTime: S3OneTimeClassificationType
    ): ClassificationType = {
      val __obj = js.Dictionary[js.Any](
        "continuous" -> continuous.asInstanceOf[js.Any],
        "oneTime"    -> oneTime.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ClassificationType]
    }
  }

  /**
    * The classification type that Amazon Macie applies to the associated S3 resources. At least one of the classification types (oneTime or continuous) must be specified.
    */
  @js.native
  trait ClassificationTypeUpdate extends js.Object {
    var continuous: js.UndefOr[S3ContinuousClassificationType]
    var oneTime: js.UndefOr[S3OneTimeClassificationType]
  }

  object ClassificationTypeUpdate {
    def apply(
        continuous: js.UndefOr[S3ContinuousClassificationType] = js.undefined,
        oneTime: js.UndefOr[S3OneTimeClassificationType] = js.undefined
    ): ClassificationTypeUpdate = {
      val __obj = js.Dictionary.empty[js.Any]
      continuous.foreach(__v => __obj.update("continuous", __v.asInstanceOf[js.Any]))
      oneTime.foreach(__v => __obj.update("oneTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClassificationTypeUpdate]
    }
  }

  @js.native
  trait DisassociateMemberAccountRequest extends js.Object {
    var memberAccountId: AWSAccountId
  }

  object DisassociateMemberAccountRequest {
    def apply(
        memberAccountId: AWSAccountId
    ): DisassociateMemberAccountRequest = {
      val __obj = js.Dictionary[js.Any](
        "memberAccountId" -> memberAccountId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateMemberAccountRequest]
    }
  }

  @js.native
  trait DisassociateS3ResourcesRequest extends js.Object {
    var associatedS3Resources: S3Resources
    var memberAccountId: js.UndefOr[AWSAccountId]
  }

  object DisassociateS3ResourcesRequest {
    def apply(
        associatedS3Resources: S3Resources,
        memberAccountId: js.UndefOr[AWSAccountId] = js.undefined
    ): DisassociateS3ResourcesRequest = {
      val __obj = js.Dictionary[js.Any](
        "associatedS3Resources" -> associatedS3Resources.asInstanceOf[js.Any]
      )

      memberAccountId.foreach(__v => __obj.update("memberAccountId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateS3ResourcesRequest]
    }
  }

  @js.native
  trait DisassociateS3ResourcesResult extends js.Object {
    var failedS3Resources: js.UndefOr[FailedS3Resources]
  }

  object DisassociateS3ResourcesResult {
    def apply(
        failedS3Resources: js.UndefOr[FailedS3Resources] = js.undefined
    ): DisassociateS3ResourcesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      failedS3Resources.foreach(__v => __obj.update("failedS3Resources", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateS3ResourcesResult]
    }
  }

  /**
    * Includes details about the failed S3 resources.
    */
  @js.native
  trait FailedS3Resource extends js.Object {
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ExceptionMessage]
    var failedItem: js.UndefOr[S3Resource]
  }

  object FailedS3Resource {
    def apply(
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        errorMessage: js.UndefOr[ExceptionMessage] = js.undefined,
        failedItem: js.UndefOr[S3Resource] = js.undefined
    ): FailedS3Resource = {
      val __obj = js.Dictionary.empty[js.Any]
      errorCode.foreach(__v => __obj.update("errorCode", __v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.update("errorMessage", __v.asInstanceOf[js.Any]))
      failedItem.foreach(__v => __obj.update("failedItem", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailedS3Resource]
    }
  }

  /**
    * Internal server error.
    */
  @js.native
  trait InternalExceptionException extends js.Object {
    val errorCode: ErrorCode
    val message: ExceptionMessage
  }

  /**
    * The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
    */
  @js.native
  trait InvalidInputExceptionException extends js.Object {
    val errorCode: ErrorCode
    val message: ExceptionMessage
    val fieldName: FieldName
  }

  /**
    * The request was rejected because it attempted to create resources beyond the current AWS account limits. The error code describes the limit exceeded.
    */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val errorCode: ErrorCode
    val message: ExceptionMessage
    val resourceType: ResourceType
  }

  @js.native
  trait ListMemberAccountsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListMemberAccountsRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMemberAccountsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMemberAccountsRequest]
    }
  }

  @js.native
  trait ListMemberAccountsResult extends js.Object {
    var memberAccounts: js.UndefOr[MemberAccounts]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListMemberAccountsResult {
    def apply(
        memberAccounts: js.UndefOr[MemberAccounts] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMemberAccountsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      memberAccounts.foreach(__v => __obj.update("memberAccounts", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMemberAccountsResult]
    }
  }

  @js.native
  trait ListS3ResourcesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var memberAccountId: js.UndefOr[AWSAccountId]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListS3ResourcesRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        memberAccountId: js.UndefOr[AWSAccountId] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListS3ResourcesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      memberAccountId.foreach(__v => __obj.update("memberAccountId", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListS3ResourcesRequest]
    }
  }

  @js.native
  trait ListS3ResourcesResult extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var s3Resources: js.UndefOr[S3ResourcesClassification]
  }

  object ListS3ResourcesResult {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        s3Resources: js.UndefOr[S3ResourcesClassification] = js.undefined
    ): ListS3ResourcesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      s3Resources.foreach(__v => __obj.update("s3Resources", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListS3ResourcesResult]
    }
  }

  /**
    * Contains information about the Amazon Macie member account.
    */
  @js.native
  trait MemberAccount extends js.Object {
    var accountId: js.UndefOr[AWSAccountId]
  }

  object MemberAccount {
    def apply(
        accountId: js.UndefOr[AWSAccountId] = js.undefined
    ): MemberAccount = {
      val __obj = js.Dictionary.empty[js.Any]
      accountId.foreach(__v => __obj.update("accountId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberAccount]
    }
  }

  object S3ContinuousClassificationTypeEnum {
    val FULL = "FULL"

    val values = js.Object.freeze(js.Array(FULL))
  }

  object S3OneTimeClassificationTypeEnum {
    val FULL = "FULL"
    val NONE = "NONE"

    val values = js.Object.freeze(js.Array(FULL, NONE))
  }

  /**
    * Contains information about the S3 resource. This data type is used as a request parameter in the DisassociateS3Resources action and can be used as a response parameter in the AssociateS3Resources and UpdateS3Resources actions.
    */
  @js.native
  trait S3Resource extends js.Object {
    var bucketName: BucketName
    var prefix: js.UndefOr[Prefix]
  }

  object S3Resource {
    def apply(
        bucketName: BucketName,
        prefix: js.UndefOr[Prefix] = js.undefined
    ): S3Resource = {
      val __obj = js.Dictionary[js.Any](
        "bucketName" -> bucketName.asInstanceOf[js.Any]
      )

      prefix.foreach(__v => __obj.update("prefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Resource]
    }
  }

  /**
    * The S3 resources that you want to associate with Amazon Macie for monitoring and data classification. This data type is used as a request parameter in the AssociateS3Resources action and a response parameter in the ListS3Resources action.
    */
  @js.native
  trait S3ResourceClassification extends js.Object {
    var bucketName: BucketName
    var classificationType: ClassificationType
    var prefix: js.UndefOr[Prefix]
  }

  object S3ResourceClassification {
    def apply(
        bucketName: BucketName,
        classificationType: ClassificationType,
        prefix: js.UndefOr[Prefix] = js.undefined
    ): S3ResourceClassification = {
      val __obj = js.Dictionary[js.Any](
        "bucketName"         -> bucketName.asInstanceOf[js.Any],
        "classificationType" -> classificationType.asInstanceOf[js.Any]
      )

      prefix.foreach(__v => __obj.update("prefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3ResourceClassification]
    }
  }

  /**
    * The S3 resources whose classification types you want to update. This data type is used as a request parameter in the UpdateS3Resources action.
    */
  @js.native
  trait S3ResourceClassificationUpdate extends js.Object {
    var bucketName: BucketName
    var classificationTypeUpdate: ClassificationTypeUpdate
    var prefix: js.UndefOr[Prefix]
  }

  object S3ResourceClassificationUpdate {
    def apply(
        bucketName: BucketName,
        classificationTypeUpdate: ClassificationTypeUpdate,
        prefix: js.UndefOr[Prefix] = js.undefined
    ): S3ResourceClassificationUpdate = {
      val __obj = js.Dictionary[js.Any](
        "bucketName"               -> bucketName.asInstanceOf[js.Any],
        "classificationTypeUpdate" -> classificationTypeUpdate.asInstanceOf[js.Any]
      )

      prefix.foreach(__v => __obj.update("prefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3ResourceClassificationUpdate]
    }
  }

  @js.native
  trait UpdateS3ResourcesRequest extends js.Object {
    var s3ResourcesUpdate: S3ResourcesClassificationUpdate
    var memberAccountId: js.UndefOr[AWSAccountId]
  }

  object UpdateS3ResourcesRequest {
    def apply(
        s3ResourcesUpdate: S3ResourcesClassificationUpdate,
        memberAccountId: js.UndefOr[AWSAccountId] = js.undefined
    ): UpdateS3ResourcesRequest = {
      val __obj = js.Dictionary[js.Any](
        "s3ResourcesUpdate" -> s3ResourcesUpdate.asInstanceOf[js.Any]
      )

      memberAccountId.foreach(__v => __obj.update("memberAccountId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateS3ResourcesRequest]
    }
  }

  @js.native
  trait UpdateS3ResourcesResult extends js.Object {
    var failedS3Resources: js.UndefOr[FailedS3Resources]
  }

  object UpdateS3ResourcesResult {
    def apply(
        failedS3Resources: js.UndefOr[FailedS3Resources] = js.undefined
    ): UpdateS3ResourcesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      failedS3Resources.foreach(__v => __obj.update("failedS3Resources", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateS3ResourcesResult]
    }
  }
}
