package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object codepipeline {
  type AWSRegionName                          = String
  type AccessKeyId                            = String
  type AccountId                              = String
  type ActionCategory                         = String
  type ActionConfigurationKey                 = String
  type ActionConfigurationMap                 = js.Dictionary[ActionConfigurationValue]
  type ActionConfigurationPropertyList        = js.Array[ActionConfigurationProperty]
  type ActionConfigurationPropertyType        = String
  type ActionConfigurationQueryableValue      = String
  type ActionConfigurationValue               = String
  type ActionExecutionDetailList              = js.Array[ActionExecutionDetail]
  type ActionExecutionId                      = String
  type ActionExecutionStatus                  = String
  type ActionExecutionToken                   = String
  type ActionName                             = String
  type ActionOwner                            = String
  type ActionProvider                         = String
  type ActionRunOrder                         = Int
  type ActionStateList                        = js.Array[ActionState]
  type ActionTypeList                         = js.Array[ActionType]
  type ApprovalStatus                         = String
  type ApprovalSummary                        = String
  type ApprovalToken                          = String
  type ArtifactDetailList                     = js.Array[ArtifactDetail]
  type ArtifactList                           = js.Array[Artifact]
  type ArtifactLocationType                   = String
  type ArtifactName                           = String
  type ArtifactRevisionList                   = js.Array[ArtifactRevision]
  type ArtifactStoreLocation                  = String
  type ArtifactStoreMap                       = js.Dictionary[ArtifactStore]
  type ArtifactStoreType                      = String
  type BlockerName                            = String
  type BlockerType                            = String
  type ClientId                               = String
  type ClientRequestToken                     = String
  type ClientToken                            = String
  type Code                                   = String
  type ContinuationToken                      = String
  type Description                            = String
  type DisabledReason                         = String
  type Enabled                                = Boolean
  type EncryptionKeyId                        = String
  type EncryptionKeyType                      = String
  type ExecutionId                            = String
  type ExecutionSummary                       = String
  type ExternalExecutionId                    = String
  type ExternalExecutionSummary               = String
  type FailureType                            = String
  type InputArtifactList                      = js.Array[InputArtifact]
  type JobId                                  = String
  type JobList                                = js.Array[Job]
  type JobStatus                              = String
  type JsonPath                               = String
  type LastChangedAt                          = js.Date
  type LastChangedBy                          = String
  type LastUpdatedBy                          = String
  type MatchEquals                            = String
  type MaxBatchSize                           = Int
  type MaxResults                             = Int
  type MaximumArtifactCount                   = Int
  type Message                                = String
  type MinimumArtifactCount                   = Int
  type NextToken                              = String
  type Nonce                                  = String
  type OutputArtifactList                     = js.Array[OutputArtifact]
  type Percentage                             = Int
  type PipelineArn                            = String
  type PipelineExecutionId                    = String
  type PipelineExecutionStatus                = String
  type PipelineExecutionSummaryList           = js.Array[PipelineExecutionSummary]
  type PipelineList                           = js.Array[PipelineSummary]
  type PipelineName                           = String
  type PipelineStageDeclarationList           = js.Array[StageDeclaration]
  type PipelineVersion                        = Int
  type QueryParamMap                          = js.Dictionary[ActionConfigurationQueryableValue]
  type ResourceArn                            = String
  type Revision                               = String
  type RevisionChangeIdentifier               = String
  type RevisionSummary                        = String
  type RoleArn                                = String
  type S3Bucket                               = String
  type S3BucketName                           = String
  type S3Key                                  = String
  type S3ObjectKey                            = String
  type SecretAccessKey                        = String
  type SessionToken                           = String
  type SourceRevisionList                     = js.Array[SourceRevision]
  type StageActionDeclarationList             = js.Array[ActionDeclaration]
  type StageBlockerDeclarationList            = js.Array[BlockerDeclaration]
  type StageExecutionStatus                   = String
  type StageName                              = String
  type StageRetryMode                         = String
  type StageStateList                         = js.Array[StageState]
  type StageTransitionType                    = String
  type TagKey                                 = String
  type TagKeyList                             = js.Array[TagKey]
  type TagList                                = js.Array[Tag]
  type TagValue                               = String
  type ThirdPartyJobId                        = String
  type ThirdPartyJobList                      = js.Array[ThirdPartyJob]
  type Time                                   = js.Date
  type Timestamp                              = js.Date
  type Url                                    = String
  type UrlTemplate                            = String
  type Version                                = String
  type WebhookArn                             = String
  type WebhookAuthConfigurationAllowedIPRange = String
  type WebhookAuthConfigurationSecretToken    = String
  type WebhookAuthenticationType              = String
  type WebhookErrorCode                       = String
  type WebhookErrorMessage                    = String
  type WebhookFilters                         = js.Array[WebhookFilterRule]
  type WebhookLastTriggered                   = js.Date
  type WebhookList                            = js.Array[ListWebhookItem]
  type WebhookName                            = String
  type WebhookUrl                             = String

  implicit final class CodePipelineOps(val service: CodePipeline) extends AnyVal {

    def acknowledgeJobFuture(params: AcknowledgeJobInput): Future[AcknowledgeJobOutput] =
      service.acknowledgeJob(params).promise.toFuture
    def acknowledgeThirdPartyJobFuture(params: AcknowledgeThirdPartyJobInput): Future[AcknowledgeThirdPartyJobOutput] =
      service.acknowledgeThirdPartyJob(params).promise.toFuture
    def createCustomActionTypeFuture(params: CreateCustomActionTypeInput): Future[CreateCustomActionTypeOutput] =
      service.createCustomActionType(params).promise.toFuture
    def createPipelineFuture(params: CreatePipelineInput): Future[CreatePipelineOutput] =
      service.createPipeline(params).promise.toFuture
    def deleteCustomActionTypeFuture(params: DeleteCustomActionTypeInput): Future[js.Object] =
      service.deleteCustomActionType(params).promise.toFuture
    def deletePipelineFuture(params: DeletePipelineInput): Future[js.Object] =
      service.deletePipeline(params).promise.toFuture
    def deleteWebhookFuture(params: DeleteWebhookInput): Future[DeleteWebhookOutput] =
      service.deleteWebhook(params).promise.toFuture
    def deregisterWebhookWithThirdPartyFuture(
        params: DeregisterWebhookWithThirdPartyInput
    ): Future[DeregisterWebhookWithThirdPartyOutput] = service.deregisterWebhookWithThirdParty(params).promise.toFuture
    def disableStageTransitionFuture(params: DisableStageTransitionInput): Future[js.Object] =
      service.disableStageTransition(params).promise.toFuture
    def enableStageTransitionFuture(params: EnableStageTransitionInput): Future[js.Object] =
      service.enableStageTransition(params).promise.toFuture
    def getJobDetailsFuture(params: GetJobDetailsInput): Future[GetJobDetailsOutput] =
      service.getJobDetails(params).promise.toFuture
    def getPipelineExecutionFuture(params: GetPipelineExecutionInput): Future[GetPipelineExecutionOutput] =
      service.getPipelineExecution(params).promise.toFuture
    def getPipelineFuture(params: GetPipelineInput): Future[GetPipelineOutput] =
      service.getPipeline(params).promise.toFuture
    def getPipelineStateFuture(params: GetPipelineStateInput): Future[GetPipelineStateOutput] =
      service.getPipelineState(params).promise.toFuture
    def getThirdPartyJobDetailsFuture(params: GetThirdPartyJobDetailsInput): Future[GetThirdPartyJobDetailsOutput] =
      service.getThirdPartyJobDetails(params).promise.toFuture
    def listActionExecutionsFuture(params: ListActionExecutionsInput): Future[ListActionExecutionsOutput] =
      service.listActionExecutions(params).promise.toFuture
    def listActionTypesFuture(params: ListActionTypesInput): Future[ListActionTypesOutput] =
      service.listActionTypes(params).promise.toFuture
    def listPipelineExecutionsFuture(params: ListPipelineExecutionsInput): Future[ListPipelineExecutionsOutput] =
      service.listPipelineExecutions(params).promise.toFuture
    def listPipelinesFuture(params: ListPipelinesInput): Future[ListPipelinesOutput] =
      service.listPipelines(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] =
      service.listTagsForResource(params).promise.toFuture
    def listWebhooksFuture(params: ListWebhooksInput): Future[ListWebhooksOutput] =
      service.listWebhooks(params).promise.toFuture
    def pollForJobsFuture(params: PollForJobsInput): Future[PollForJobsOutput] =
      service.pollForJobs(params).promise.toFuture
    def pollForThirdPartyJobsFuture(params: PollForThirdPartyJobsInput): Future[PollForThirdPartyJobsOutput] =
      service.pollForThirdPartyJobs(params).promise.toFuture
    def putActionRevisionFuture(params: PutActionRevisionInput): Future[PutActionRevisionOutput] =
      service.putActionRevision(params).promise.toFuture
    def putApprovalResultFuture(params: PutApprovalResultInput): Future[PutApprovalResultOutput] =
      service.putApprovalResult(params).promise.toFuture
    def putJobFailureResultFuture(params: PutJobFailureResultInput): Future[js.Object] =
      service.putJobFailureResult(params).promise.toFuture
    def putJobSuccessResultFuture(params: PutJobSuccessResultInput): Future[js.Object] =
      service.putJobSuccessResult(params).promise.toFuture
    def putThirdPartyJobFailureResultFuture(params: PutThirdPartyJobFailureResultInput): Future[js.Object] =
      service.putThirdPartyJobFailureResult(params).promise.toFuture
    def putThirdPartyJobSuccessResultFuture(params: PutThirdPartyJobSuccessResultInput): Future[js.Object] =
      service.putThirdPartyJobSuccessResult(params).promise.toFuture
    def putWebhookFuture(params: PutWebhookInput): Future[PutWebhookOutput] =
      service.putWebhook(params).promise.toFuture
    def registerWebhookWithThirdPartyFuture(
        params: RegisterWebhookWithThirdPartyInput
    ): Future[RegisterWebhookWithThirdPartyOutput] = service.registerWebhookWithThirdParty(params).promise.toFuture
    def retryStageExecutionFuture(params: RetryStageExecutionInput): Future[RetryStageExecutionOutput] =
      service.retryStageExecution(params).promise.toFuture
    def startPipelineExecutionFuture(params: StartPipelineExecutionInput): Future[StartPipelineExecutionOutput] =
      service.startPipelineExecution(params).promise.toFuture
    def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] =
      service.untagResource(params).promise.toFuture
    def updatePipelineFuture(params: UpdatePipelineInput): Future[UpdatePipelineOutput] =
      service.updatePipeline(params).promise.toFuture
  }
}

package codepipeline {
  @js.native
  @JSImport("aws-sdk", "CodePipeline")
  class CodePipeline() extends js.Object {
    def this(config: AWSConfig) = this()

    def acknowledgeJob(params: AcknowledgeJobInput): Request[AcknowledgeJobOutput] = js.native
    def acknowledgeThirdPartyJob(params: AcknowledgeThirdPartyJobInput): Request[AcknowledgeThirdPartyJobOutput] =
      js.native
    def createCustomActionType(params: CreateCustomActionTypeInput): Request[CreateCustomActionTypeOutput] = js.native
    def createPipeline(params: CreatePipelineInput): Request[CreatePipelineOutput]                         = js.native
    def deleteCustomActionType(params: DeleteCustomActionTypeInput): Request[js.Object]                    = js.native
    def deletePipeline(params: DeletePipelineInput): Request[js.Object]                                    = js.native
    def deleteWebhook(params: DeleteWebhookInput): Request[DeleteWebhookOutput]                            = js.native
    def deregisterWebhookWithThirdParty(
        params: DeregisterWebhookWithThirdPartyInput
    ): Request[DeregisterWebhookWithThirdPartyOutput]                                                = js.native
    def disableStageTransition(params: DisableStageTransitionInput): Request[js.Object]              = js.native
    def enableStageTransition(params: EnableStageTransitionInput): Request[js.Object]                = js.native
    def getJobDetails(params: GetJobDetailsInput): Request[GetJobDetailsOutput]                      = js.native
    def getPipeline(params: GetPipelineInput): Request[GetPipelineOutput]                            = js.native
    def getPipelineExecution(params: GetPipelineExecutionInput): Request[GetPipelineExecutionOutput] = js.native
    def getPipelineState(params: GetPipelineStateInput): Request[GetPipelineStateOutput]             = js.native
    def getThirdPartyJobDetails(params: GetThirdPartyJobDetailsInput): Request[GetThirdPartyJobDetailsOutput] =
      js.native
    def listActionExecutions(params: ListActionExecutionsInput): Request[ListActionExecutionsOutput]       = js.native
    def listActionTypes(params: ListActionTypesInput): Request[ListActionTypesOutput]                      = js.native
    def listPipelineExecutions(params: ListPipelineExecutionsInput): Request[ListPipelineExecutionsOutput] = js.native
    def listPipelines(params: ListPipelinesInput): Request[ListPipelinesOutput]                            = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput]          = js.native
    def listWebhooks(params: ListWebhooksInput): Request[ListWebhooksOutput]                               = js.native
    def pollForJobs(params: PollForJobsInput): Request[PollForJobsOutput]                                  = js.native
    def pollForThirdPartyJobs(params: PollForThirdPartyJobsInput): Request[PollForThirdPartyJobsOutput]    = js.native
    def putActionRevision(params: PutActionRevisionInput): Request[PutActionRevisionOutput]                = js.native
    def putApprovalResult(params: PutApprovalResultInput): Request[PutApprovalResultOutput]                = js.native
    def putJobFailureResult(params: PutJobFailureResultInput): Request[js.Object]                          = js.native
    def putJobSuccessResult(params: PutJobSuccessResultInput): Request[js.Object]                          = js.native
    def putThirdPartyJobFailureResult(params: PutThirdPartyJobFailureResultInput): Request[js.Object]      = js.native
    def putThirdPartyJobSuccessResult(params: PutThirdPartyJobSuccessResultInput): Request[js.Object]      = js.native
    def putWebhook(params: PutWebhookInput): Request[PutWebhookOutput]                                     = js.native
    def registerWebhookWithThirdParty(
        params: RegisterWebhookWithThirdPartyInput
    ): Request[RegisterWebhookWithThirdPartyOutput]                                                        = js.native
    def retryStageExecution(params: RetryStageExecutionInput): Request[RetryStageExecutionOutput]          = js.native
    def startPipelineExecution(params: StartPipelineExecutionInput): Request[StartPipelineExecutionOutput] = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput]                                  = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput]                            = js.native
    def updatePipeline(params: UpdatePipelineInput): Request[UpdatePipelineOutput]                         = js.native
  }

  /**
    * Represents an AWS session credentials object. These credentials are temporary credentials that are issued by AWS Secure Token Service (STS). They can be used to access input and output artifacts in the Amazon S3 bucket used to store artifact for the pipeline in AWS CodePipeline.
    */
  @js.native
  trait AWSSessionCredentials extends js.Object {
    var accessKeyId: AccessKeyId
    var secretAccessKey: SecretAccessKey
    var sessionToken: SessionToken
  }

  object AWSSessionCredentials {
    def apply(
        accessKeyId: AccessKeyId,
        secretAccessKey: SecretAccessKey,
        sessionToken: SessionToken
    ): AWSSessionCredentials = {
      val __obj = js.Dictionary[js.Any](
        "accessKeyId"     -> accessKeyId.asInstanceOf[js.Any],
        "secretAccessKey" -> secretAccessKey.asInstanceOf[js.Any],
        "sessionToken"    -> sessionToken.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AWSSessionCredentials]
    }
  }

  /**
    * Represents the input of an AcknowledgeJob action.
    */
  @js.native
  trait AcknowledgeJobInput extends js.Object {
    var jobId: JobId
    var nonce: Nonce
  }

  object AcknowledgeJobInput {
    def apply(
        jobId: JobId,
        nonce: Nonce
    ): AcknowledgeJobInput = {
      val __obj = js.Dictionary[js.Any](
        "jobId" -> jobId.asInstanceOf[js.Any],
        "nonce" -> nonce.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AcknowledgeJobInput]
    }
  }

  /**
    * Represents the output of an AcknowledgeJob action.
    */
  @js.native
  trait AcknowledgeJobOutput extends js.Object {
    var status: js.UndefOr[JobStatus]
  }

  object AcknowledgeJobOutput {
    def apply(
        status: js.UndefOr[JobStatus] = js.undefined
    ): AcknowledgeJobOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcknowledgeJobOutput]
    }
  }

  /**
    * Represents the input of an AcknowledgeThirdPartyJob action.
    */
  @js.native
  trait AcknowledgeThirdPartyJobInput extends js.Object {
    var clientToken: ClientToken
    var jobId: ThirdPartyJobId
    var nonce: Nonce
  }

  object AcknowledgeThirdPartyJobInput {
    def apply(
        clientToken: ClientToken,
        jobId: ThirdPartyJobId,
        nonce: Nonce
    ): AcknowledgeThirdPartyJobInput = {
      val __obj = js.Dictionary[js.Any](
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "jobId"       -> jobId.asInstanceOf[js.Any],
        "nonce"       -> nonce.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AcknowledgeThirdPartyJobInput]
    }
  }

  /**
    * Represents the output of an AcknowledgeThirdPartyJob action.
    */
  @js.native
  trait AcknowledgeThirdPartyJobOutput extends js.Object {
    var status: js.UndefOr[JobStatus]
  }

  object AcknowledgeThirdPartyJobOutput {
    def apply(
        status: js.UndefOr[JobStatus] = js.undefined
    ): AcknowledgeThirdPartyJobOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcknowledgeThirdPartyJobOutput]
    }
  }

  object ActionCategoryEnum {
    val Source   = "Source"
    val Build    = "Build"
    val Deploy   = "Deploy"
    val Test     = "Test"
    val Invoke   = "Invoke"
    val Approval = "Approval"

    val values = IndexedSeq(Source, Build, Deploy, Test, Invoke, Approval)
  }

  /**
    * Represents information about an action configuration.
    */
  @js.native
  trait ActionConfiguration extends js.Object {
    var configuration: js.UndefOr[ActionConfigurationMap]
  }

  object ActionConfiguration {
    def apply(
        configuration: js.UndefOr[ActionConfigurationMap] = js.undefined
    ): ActionConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      configuration.foreach(__v => __obj.update("configuration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionConfiguration]
    }
  }

  /**
    * Represents information about an action configuration property.
    */
  @js.native
  trait ActionConfigurationProperty extends js.Object {
    var key: Boolean
    var name: ActionConfigurationKey
    var required: Boolean
    var secret: Boolean
    var description: js.UndefOr[Description]
    var queryable: js.UndefOr[Boolean]
    var `type`: js.UndefOr[ActionConfigurationPropertyType]
  }

  object ActionConfigurationProperty {
    def apply(
        key: Boolean,
        name: ActionConfigurationKey,
        required: Boolean,
        secret: Boolean,
        description: js.UndefOr[Description] = js.undefined,
        queryable: js.UndefOr[Boolean] = js.undefined,
        `type`: js.UndefOr[ActionConfigurationPropertyType] = js.undefined
    ): ActionConfigurationProperty = {
      val __obj = js.Dictionary[js.Any](
        "key"      -> key.asInstanceOf[js.Any],
        "name"     -> name.asInstanceOf[js.Any],
        "required" -> required.asInstanceOf[js.Any],
        "secret"   -> secret.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      queryable.foreach(__v => __obj.update("queryable", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionConfigurationProperty]
    }
  }

  object ActionConfigurationPropertyTypeEnum {
    val String  = "String"
    val Number  = "Number"
    val Boolean = "Boolean"

    val values = IndexedSeq(String, Number, Boolean)
  }

  /**
    * Represents the context of an action within the stage of a pipeline to a job worker.
    */
  @js.native
  trait ActionContext extends js.Object {
    var actionExecutionId: js.UndefOr[ActionExecutionId]
    var name: js.UndefOr[ActionName]
  }

  object ActionContext {
    def apply(
        actionExecutionId: js.UndefOr[ActionExecutionId] = js.undefined,
        name: js.UndefOr[ActionName] = js.undefined
    ): ActionContext = {
      val __obj = js.Dictionary.empty[js.Any]
      actionExecutionId.foreach(__v => __obj.update("actionExecutionId", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionContext]
    }
  }

  /**
    * Represents information about an action declaration.
    */
  @js.native
  trait ActionDeclaration extends js.Object {
    var actionTypeId: ActionTypeId
    var name: ActionName
    var configuration: js.UndefOr[ActionConfigurationMap]
    var inputArtifacts: js.UndefOr[InputArtifactList]
    var outputArtifacts: js.UndefOr[OutputArtifactList]
    var region: js.UndefOr[AWSRegionName]
    var roleArn: js.UndefOr[RoleArn]
    var runOrder: js.UndefOr[ActionRunOrder]
  }

  object ActionDeclaration {
    def apply(
        actionTypeId: ActionTypeId,
        name: ActionName,
        configuration: js.UndefOr[ActionConfigurationMap] = js.undefined,
        inputArtifacts: js.UndefOr[InputArtifactList] = js.undefined,
        outputArtifacts: js.UndefOr[OutputArtifactList] = js.undefined,
        region: js.UndefOr[AWSRegionName] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined,
        runOrder: js.UndefOr[ActionRunOrder] = js.undefined
    ): ActionDeclaration = {
      val __obj = js.Dictionary[js.Any](
        "actionTypeId" -> actionTypeId.asInstanceOf[js.Any],
        "name"         -> name.asInstanceOf[js.Any]
      )

      configuration.foreach(__v => __obj.update("configuration", __v.asInstanceOf[js.Any]))
      inputArtifacts.foreach(__v => __obj.update("inputArtifacts", __v.asInstanceOf[js.Any]))
      outputArtifacts.foreach(__v => __obj.update("outputArtifacts", __v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.update("region", __v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.update("roleArn", __v.asInstanceOf[js.Any]))
      runOrder.foreach(__v => __obj.update("runOrder", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionDeclaration]
    }
  }

  /**
    * Represents information about the run of an action.
    */
  @js.native
  trait ActionExecution extends js.Object {
    var errorDetails: js.UndefOr[ErrorDetails]
    var externalExecutionId: js.UndefOr[ExecutionId]
    var externalExecutionUrl: js.UndefOr[Url]
    var lastStatusChange: js.UndefOr[Timestamp]
    var lastUpdatedBy: js.UndefOr[LastUpdatedBy]
    var percentComplete: js.UndefOr[Percentage]
    var status: js.UndefOr[ActionExecutionStatus]
    var summary: js.UndefOr[ExecutionSummary]
    var token: js.UndefOr[ActionExecutionToken]
  }

  object ActionExecution {
    def apply(
        errorDetails: js.UndefOr[ErrorDetails] = js.undefined,
        externalExecutionId: js.UndefOr[ExecutionId] = js.undefined,
        externalExecutionUrl: js.UndefOr[Url] = js.undefined,
        lastStatusChange: js.UndefOr[Timestamp] = js.undefined,
        lastUpdatedBy: js.UndefOr[LastUpdatedBy] = js.undefined,
        percentComplete: js.UndefOr[Percentage] = js.undefined,
        status: js.UndefOr[ActionExecutionStatus] = js.undefined,
        summary: js.UndefOr[ExecutionSummary] = js.undefined,
        token: js.UndefOr[ActionExecutionToken] = js.undefined
    ): ActionExecution = {
      val __obj = js.Dictionary.empty[js.Any]
      errorDetails.foreach(__v => __obj.update("errorDetails", __v.asInstanceOf[js.Any]))
      externalExecutionId.foreach(__v => __obj.update("externalExecutionId", __v.asInstanceOf[js.Any]))
      externalExecutionUrl.foreach(__v => __obj.update("externalExecutionUrl", __v.asInstanceOf[js.Any]))
      lastStatusChange.foreach(__v => __obj.update("lastStatusChange", __v.asInstanceOf[js.Any]))
      lastUpdatedBy.foreach(__v => __obj.update("lastUpdatedBy", __v.asInstanceOf[js.Any]))
      percentComplete.foreach(__v => __obj.update("percentComplete", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      summary.foreach(__v => __obj.update("summary", __v.asInstanceOf[js.Any]))
      token.foreach(__v => __obj.update("token", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionExecution]
    }
  }

  /**
    * Returns information about an execution of an action, including the action execution ID, and the name, version, and timing of the action.
    */
  @js.native
  trait ActionExecutionDetail extends js.Object {
    var actionExecutionId: js.UndefOr[ActionExecutionId]
    var actionName: js.UndefOr[ActionName]
    var input: js.UndefOr[ActionExecutionInput]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var output: js.UndefOr[ActionExecutionOutput]
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
    var pipelineVersion: js.UndefOr[PipelineVersion]
    var stageName: js.UndefOr[StageName]
    var startTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[ActionExecutionStatus]
  }

  object ActionExecutionDetail {
    def apply(
        actionExecutionId: js.UndefOr[ActionExecutionId] = js.undefined,
        actionName: js.UndefOr[ActionName] = js.undefined,
        input: js.UndefOr[ActionExecutionInput] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        output: js.UndefOr[ActionExecutionOutput] = js.undefined,
        pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined,
        pipelineVersion: js.UndefOr[PipelineVersion] = js.undefined,
        stageName: js.UndefOr[StageName] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[ActionExecutionStatus] = js.undefined
    ): ActionExecutionDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      actionExecutionId.foreach(__v => __obj.update("actionExecutionId", __v.asInstanceOf[js.Any]))
      actionName.foreach(__v => __obj.update("actionName", __v.asInstanceOf[js.Any]))
      input.foreach(__v => __obj.update("input", __v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.update("lastUpdateTime", __v.asInstanceOf[js.Any]))
      output.foreach(__v => __obj.update("output", __v.asInstanceOf[js.Any]))
      pipelineExecutionId.foreach(__v => __obj.update("pipelineExecutionId", __v.asInstanceOf[js.Any]))
      pipelineVersion.foreach(__v => __obj.update("pipelineVersion", __v.asInstanceOf[js.Any]))
      stageName.foreach(__v => __obj.update("stageName", __v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.update("startTime", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionExecutionDetail]
    }
  }

  /**
    * Filter values for the action execution.
    */
  @js.native
  trait ActionExecutionFilter extends js.Object {
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
  }

  object ActionExecutionFilter {
    def apply(
        pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
    ): ActionExecutionFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      pipelineExecutionId.foreach(__v => __obj.update("pipelineExecutionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionExecutionFilter]
    }
  }

  /**
    * Input information used for an action execution.
    */
  @js.native
  trait ActionExecutionInput extends js.Object {
    var actionTypeId: js.UndefOr[ActionTypeId]
    var configuration: js.UndefOr[ActionConfigurationMap]
    var inputArtifacts: js.UndefOr[ArtifactDetailList]
    var region: js.UndefOr[AWSRegionName]
    var roleArn: js.UndefOr[RoleArn]
  }

  object ActionExecutionInput {
    def apply(
        actionTypeId: js.UndefOr[ActionTypeId] = js.undefined,
        configuration: js.UndefOr[ActionConfigurationMap] = js.undefined,
        inputArtifacts: js.UndefOr[ArtifactDetailList] = js.undefined,
        region: js.UndefOr[AWSRegionName] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): ActionExecutionInput = {
      val __obj = js.Dictionary.empty[js.Any]
      actionTypeId.foreach(__v => __obj.update("actionTypeId", __v.asInstanceOf[js.Any]))
      configuration.foreach(__v => __obj.update("configuration", __v.asInstanceOf[js.Any]))
      inputArtifacts.foreach(__v => __obj.update("inputArtifacts", __v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.update("region", __v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.update("roleArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionExecutionInput]
    }
  }

  /**
    * Output details listed for an action execution, such as the action execution result.
    */
  @js.native
  trait ActionExecutionOutput extends js.Object {
    var executionResult: js.UndefOr[ActionExecutionResult]
    var outputArtifacts: js.UndefOr[ArtifactDetailList]
  }

  object ActionExecutionOutput {
    def apply(
        executionResult: js.UndefOr[ActionExecutionResult] = js.undefined,
        outputArtifacts: js.UndefOr[ArtifactDetailList] = js.undefined
    ): ActionExecutionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      executionResult.foreach(__v => __obj.update("executionResult", __v.asInstanceOf[js.Any]))
      outputArtifacts.foreach(__v => __obj.update("outputArtifacts", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionExecutionOutput]
    }
  }

  /**
    * Execution result information, such as the external execution ID.
    */
  @js.native
  trait ActionExecutionResult extends js.Object {
    var externalExecutionId: js.UndefOr[ExternalExecutionId]
    var externalExecutionSummary: js.UndefOr[ExternalExecutionSummary]
    var externalExecutionUrl: js.UndefOr[Url]
  }

  object ActionExecutionResult {
    def apply(
        externalExecutionId: js.UndefOr[ExternalExecutionId] = js.undefined,
        externalExecutionSummary: js.UndefOr[ExternalExecutionSummary] = js.undefined,
        externalExecutionUrl: js.UndefOr[Url] = js.undefined
    ): ActionExecutionResult = {
      val __obj = js.Dictionary.empty[js.Any]
      externalExecutionId.foreach(__v => __obj.update("externalExecutionId", __v.asInstanceOf[js.Any]))
      externalExecutionSummary.foreach(__v => __obj.update("externalExecutionSummary", __v.asInstanceOf[js.Any]))
      externalExecutionUrl.foreach(__v => __obj.update("externalExecutionUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionExecutionResult]
    }
  }

  object ActionExecutionStatusEnum {
    val InProgress = "InProgress"
    val Succeeded  = "Succeeded"
    val Failed     = "Failed"

    val values = IndexedSeq(InProgress, Succeeded, Failed)
  }

  object ActionOwnerEnum {
    val AWS        = "AWS"
    val ThirdParty = "ThirdParty"
    val Custom     = "Custom"

    val values = IndexedSeq(AWS, ThirdParty, Custom)
  }

  /**
    * Represents information about the version (or revision) of an action.
    */
  @js.native
  trait ActionRevision extends js.Object {
    var created: Timestamp
    var revisionChangeId: RevisionChangeIdentifier
    var revisionId: Revision
  }

  object ActionRevision {
    def apply(
        created: Timestamp,
        revisionChangeId: RevisionChangeIdentifier,
        revisionId: Revision
    ): ActionRevision = {
      val __obj = js.Dictionary[js.Any](
        "created"          -> created.asInstanceOf[js.Any],
        "revisionChangeId" -> revisionChangeId.asInstanceOf[js.Any],
        "revisionId"       -> revisionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ActionRevision]
    }
  }

  /**
    * Represents information about the state of an action.
    */
  @js.native
  trait ActionState extends js.Object {
    var actionName: js.UndefOr[ActionName]
    var currentRevision: js.UndefOr[ActionRevision]
    var entityUrl: js.UndefOr[Url]
    var latestExecution: js.UndefOr[ActionExecution]
    var revisionUrl: js.UndefOr[Url]
  }

  object ActionState {
    def apply(
        actionName: js.UndefOr[ActionName] = js.undefined,
        currentRevision: js.UndefOr[ActionRevision] = js.undefined,
        entityUrl: js.UndefOr[Url] = js.undefined,
        latestExecution: js.UndefOr[ActionExecution] = js.undefined,
        revisionUrl: js.UndefOr[Url] = js.undefined
    ): ActionState = {
      val __obj = js.Dictionary.empty[js.Any]
      actionName.foreach(__v => __obj.update("actionName", __v.asInstanceOf[js.Any]))
      currentRevision.foreach(__v => __obj.update("currentRevision", __v.asInstanceOf[js.Any]))
      entityUrl.foreach(__v => __obj.update("entityUrl", __v.asInstanceOf[js.Any]))
      latestExecution.foreach(__v => __obj.update("latestExecution", __v.asInstanceOf[js.Any]))
      revisionUrl.foreach(__v => __obj.update("revisionUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionState]
    }
  }

  /**
    * Returns information about the details of an action type.
    */
  @js.native
  trait ActionType extends js.Object {
    var id: ActionTypeId
    var inputArtifactDetails: ArtifactDetails
    var outputArtifactDetails: ArtifactDetails
    var actionConfigurationProperties: js.UndefOr[ActionConfigurationPropertyList]
    var settings: js.UndefOr[ActionTypeSettings]
  }

  object ActionType {
    def apply(
        id: ActionTypeId,
        inputArtifactDetails: ArtifactDetails,
        outputArtifactDetails: ArtifactDetails,
        actionConfigurationProperties: js.UndefOr[ActionConfigurationPropertyList] = js.undefined,
        settings: js.UndefOr[ActionTypeSettings] = js.undefined
    ): ActionType = {
      val __obj = js.Dictionary[js.Any](
        "id"                    -> id.asInstanceOf[js.Any],
        "inputArtifactDetails"  -> inputArtifactDetails.asInstanceOf[js.Any],
        "outputArtifactDetails" -> outputArtifactDetails.asInstanceOf[js.Any]
      )

      actionConfigurationProperties.foreach(
        __v => __obj.update("actionConfigurationProperties", __v.asInstanceOf[js.Any])
      )
      settings.foreach(__v => __obj.update("settings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionType]
    }
  }

  /**
    * Represents information about an action type.
    */
  @js.native
  trait ActionTypeId extends js.Object {
    var category: ActionCategory
    var owner: ActionOwner
    var provider: ActionProvider
    var version: Version
  }

  object ActionTypeId {
    def apply(
        category: ActionCategory,
        owner: ActionOwner,
        provider: ActionProvider,
        version: Version
    ): ActionTypeId = {
      val __obj = js.Dictionary[js.Any](
        "category" -> category.asInstanceOf[js.Any],
        "owner"    -> owner.asInstanceOf[js.Any],
        "provider" -> provider.asInstanceOf[js.Any],
        "version"  -> version.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ActionTypeId]
    }
  }

  /**
    * Returns information about the settings for an action type.
    */
  @js.native
  trait ActionTypeSettings extends js.Object {
    var entityUrlTemplate: js.UndefOr[UrlTemplate]
    var executionUrlTemplate: js.UndefOr[UrlTemplate]
    var revisionUrlTemplate: js.UndefOr[UrlTemplate]
    var thirdPartyConfigurationUrl: js.UndefOr[Url]
  }

  object ActionTypeSettings {
    def apply(
        entityUrlTemplate: js.UndefOr[UrlTemplate] = js.undefined,
        executionUrlTemplate: js.UndefOr[UrlTemplate] = js.undefined,
        revisionUrlTemplate: js.UndefOr[UrlTemplate] = js.undefined,
        thirdPartyConfigurationUrl: js.UndefOr[Url] = js.undefined
    ): ActionTypeSettings = {
      val __obj = js.Dictionary.empty[js.Any]
      entityUrlTemplate.foreach(__v => __obj.update("entityUrlTemplate", __v.asInstanceOf[js.Any]))
      executionUrlTemplate.foreach(__v => __obj.update("executionUrlTemplate", __v.asInstanceOf[js.Any]))
      revisionUrlTemplate.foreach(__v => __obj.update("revisionUrlTemplate", __v.asInstanceOf[js.Any]))
      thirdPartyConfigurationUrl.foreach(__v => __obj.update("thirdPartyConfigurationUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionTypeSettings]
    }
  }

  /**
    * Represents information about the result of an approval request.
    */
  @js.native
  trait ApprovalResult extends js.Object {
    var status: ApprovalStatus
    var summary: ApprovalSummary
  }

  object ApprovalResult {
    def apply(
        status: ApprovalStatus,
        summary: ApprovalSummary
    ): ApprovalResult = {
      val __obj = js.Dictionary[js.Any](
        "status"  -> status.asInstanceOf[js.Any],
        "summary" -> summary.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ApprovalResult]
    }
  }

  object ApprovalStatusEnum {
    val Approved = "Approved"
    val Rejected = "Rejected"

    val values = IndexedSeq(Approved, Rejected)
  }

  /**
    * Represents information about an artifact that will be worked upon by actions in the pipeline.
    */
  @js.native
  trait Artifact extends js.Object {
    var location: js.UndefOr[ArtifactLocation]
    var name: js.UndefOr[ArtifactName]
    var revision: js.UndefOr[Revision]
  }

  object Artifact {
    def apply(
        location: js.UndefOr[ArtifactLocation] = js.undefined,
        name: js.UndefOr[ArtifactName] = js.undefined,
        revision: js.UndefOr[Revision] = js.undefined
    ): Artifact = {
      val __obj = js.Dictionary.empty[js.Any]
      location.foreach(__v => __obj.update("location", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      revision.foreach(__v => __obj.update("revision", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Artifact]
    }
  }

  /**
    * Artifact details for the action execution, such as the artifact location.
    */
  @js.native
  trait ArtifactDetail extends js.Object {
    var name: js.UndefOr[ArtifactName]
    var s3location: js.UndefOr[S3Location]
  }

  object ArtifactDetail {
    def apply(
        name: js.UndefOr[ArtifactName] = js.undefined,
        s3location: js.UndefOr[S3Location] = js.undefined
    ): ArtifactDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      s3location.foreach(__v => __obj.update("s3location", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArtifactDetail]
    }
  }

  /**
    * Returns information about the details of an artifact.
    */
  @js.native
  trait ArtifactDetails extends js.Object {
    var maximumCount: MaximumArtifactCount
    var minimumCount: MinimumArtifactCount
  }

  object ArtifactDetails {
    def apply(
        maximumCount: MaximumArtifactCount,
        minimumCount: MinimumArtifactCount
    ): ArtifactDetails = {
      val __obj = js.Dictionary[js.Any](
        "maximumCount" -> maximumCount.asInstanceOf[js.Any],
        "minimumCount" -> minimumCount.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ArtifactDetails]
    }
  }

  /**
    * Represents information about the location of an artifact.
    */
  @js.native
  trait ArtifactLocation extends js.Object {
    var s3Location: js.UndefOr[S3ArtifactLocation]
    var `type`: js.UndefOr[ArtifactLocationType]
  }

  object ArtifactLocation {
    def apply(
        s3Location: js.UndefOr[S3ArtifactLocation] = js.undefined,
        `type`: js.UndefOr[ArtifactLocationType] = js.undefined
    ): ArtifactLocation = {
      val __obj = js.Dictionary.empty[js.Any]
      s3Location.foreach(__v => __obj.update("s3Location", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArtifactLocation]
    }
  }

  object ArtifactLocationTypeEnum {
    val S3 = "S3"

    val values = IndexedSeq(S3)
  }

  /**
    * Represents revision details of an artifact.
    */
  @js.native
  trait ArtifactRevision extends js.Object {
    var created: js.UndefOr[Timestamp]
    var name: js.UndefOr[ArtifactName]
    var revisionChangeIdentifier: js.UndefOr[RevisionChangeIdentifier]
    var revisionId: js.UndefOr[Revision]
    var revisionSummary: js.UndefOr[RevisionSummary]
    var revisionUrl: js.UndefOr[Url]
  }

  object ArtifactRevision {
    def apply(
        created: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[ArtifactName] = js.undefined,
        revisionChangeIdentifier: js.UndefOr[RevisionChangeIdentifier] = js.undefined,
        revisionId: js.UndefOr[Revision] = js.undefined,
        revisionSummary: js.UndefOr[RevisionSummary] = js.undefined,
        revisionUrl: js.UndefOr[Url] = js.undefined
    ): ArtifactRevision = {
      val __obj = js.Dictionary.empty[js.Any]
      created.foreach(__v => __obj.update("created", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      revisionChangeIdentifier.foreach(__v => __obj.update("revisionChangeIdentifier", __v.asInstanceOf[js.Any]))
      revisionId.foreach(__v => __obj.update("revisionId", __v.asInstanceOf[js.Any]))
      revisionSummary.foreach(__v => __obj.update("revisionSummary", __v.asInstanceOf[js.Any]))
      revisionUrl.foreach(__v => __obj.update("revisionUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArtifactRevision]
    }
  }

  /**
    * The Amazon S3 bucket where artifacts are stored for the pipeline.
    */
  @js.native
  trait ArtifactStore extends js.Object {
    var location: ArtifactStoreLocation
    var `type`: ArtifactStoreType
    var encryptionKey: js.UndefOr[EncryptionKey]
  }

  object ArtifactStore {
    def apply(
        location: ArtifactStoreLocation,
        `type`: ArtifactStoreType,
        encryptionKey: js.UndefOr[EncryptionKey] = js.undefined
    ): ArtifactStore = {
      val __obj = js.Dictionary[js.Any](
        "location" -> location.asInstanceOf[js.Any],
        "type"     -> `type`.asInstanceOf[js.Any]
      )

      encryptionKey.foreach(__v => __obj.update("encryptionKey", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArtifactStore]
    }
  }

  object ArtifactStoreTypeEnum {
    val S3 = "S3"

    val values = IndexedSeq(S3)
  }

  /**
    * Reserved for future use.
    */
  @js.native
  trait BlockerDeclaration extends js.Object {
    var name: BlockerName
    var `type`: BlockerType
  }

  object BlockerDeclaration {
    def apply(
        name: BlockerName,
        `type`: BlockerType
    ): BlockerDeclaration = {
      val __obj = js.Dictionary[js.Any](
        "name" -> name.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BlockerDeclaration]
    }
  }

  object BlockerTypeEnum {
    val Schedule = "Schedule"

    val values = IndexedSeq(Schedule)
  }

  /**
    * Represents the input of a CreateCustomActionType operation.
    */
  @js.native
  trait CreateCustomActionTypeInput extends js.Object {
    var category: ActionCategory
    var inputArtifactDetails: ArtifactDetails
    var outputArtifactDetails: ArtifactDetails
    var provider: ActionProvider
    var version: Version
    var configurationProperties: js.UndefOr[ActionConfigurationPropertyList]
    var settings: js.UndefOr[ActionTypeSettings]
    var tags: js.UndefOr[TagList]
  }

  object CreateCustomActionTypeInput {
    def apply(
        category: ActionCategory,
        inputArtifactDetails: ArtifactDetails,
        outputArtifactDetails: ArtifactDetails,
        provider: ActionProvider,
        version: Version,
        configurationProperties: js.UndefOr[ActionConfigurationPropertyList] = js.undefined,
        settings: js.UndefOr[ActionTypeSettings] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateCustomActionTypeInput = {
      val __obj = js.Dictionary[js.Any](
        "category"              -> category.asInstanceOf[js.Any],
        "inputArtifactDetails"  -> inputArtifactDetails.asInstanceOf[js.Any],
        "outputArtifactDetails" -> outputArtifactDetails.asInstanceOf[js.Any],
        "provider"              -> provider.asInstanceOf[js.Any],
        "version"               -> version.asInstanceOf[js.Any]
      )

      configurationProperties.foreach(__v => __obj.update("configurationProperties", __v.asInstanceOf[js.Any]))
      settings.foreach(__v => __obj.update("settings", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCustomActionTypeInput]
    }
  }

  /**
    * Represents the output of a <code>CreateCustomActionType</code> operation.
    */
  @js.native
  trait CreateCustomActionTypeOutput extends js.Object {
    var actionType: ActionType
    var tags: js.UndefOr[TagList]
  }

  object CreateCustomActionTypeOutput {
    def apply(
        actionType: ActionType,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateCustomActionTypeOutput = {
      val __obj = js.Dictionary[js.Any](
        "actionType" -> actionType.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCustomActionTypeOutput]
    }
  }

  /**
    * Represents the input of a <code>CreatePipeline</code> action.
    */
  @js.native
  trait CreatePipelineInput extends js.Object {
    var pipeline: PipelineDeclaration
    var tags: js.UndefOr[TagList]
  }

  object CreatePipelineInput {
    def apply(
        pipeline: PipelineDeclaration,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreatePipelineInput = {
      val __obj = js.Dictionary[js.Any](
        "pipeline" -> pipeline.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePipelineInput]
    }
  }

  /**
    * Represents the output of a <code>CreatePipeline</code> action.
    */
  @js.native
  trait CreatePipelineOutput extends js.Object {
    var pipeline: js.UndefOr[PipelineDeclaration]
    var tags: js.UndefOr[TagList]
  }

  object CreatePipelineOutput {
    def apply(
        pipeline: js.UndefOr[PipelineDeclaration] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreatePipelineOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      pipeline.foreach(__v => __obj.update("pipeline", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePipelineOutput]
    }
  }

  /**
    * Represents information about a current revision.
    */
  @js.native
  trait CurrentRevision extends js.Object {
    var changeIdentifier: RevisionChangeIdentifier
    var revision: Revision
    var created: js.UndefOr[Time]
    var revisionSummary: js.UndefOr[RevisionSummary]
  }

  object CurrentRevision {
    def apply(
        changeIdentifier: RevisionChangeIdentifier,
        revision: Revision,
        created: js.UndefOr[Time] = js.undefined,
        revisionSummary: js.UndefOr[RevisionSummary] = js.undefined
    ): CurrentRevision = {
      val __obj = js.Dictionary[js.Any](
        "changeIdentifier" -> changeIdentifier.asInstanceOf[js.Any],
        "revision"         -> revision.asInstanceOf[js.Any]
      )

      created.foreach(__v => __obj.update("created", __v.asInstanceOf[js.Any]))
      revisionSummary.foreach(__v => __obj.update("revisionSummary", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CurrentRevision]
    }
  }

  /**
    * Represents the input of a <code>DeleteCustomActionType</code> operation. The custom action will be marked as deleted.
    */
  @js.native
  trait DeleteCustomActionTypeInput extends js.Object {
    var category: ActionCategory
    var provider: ActionProvider
    var version: Version
  }

  object DeleteCustomActionTypeInput {
    def apply(
        category: ActionCategory,
        provider: ActionProvider,
        version: Version
    ): DeleteCustomActionTypeInput = {
      val __obj = js.Dictionary[js.Any](
        "category" -> category.asInstanceOf[js.Any],
        "provider" -> provider.asInstanceOf[js.Any],
        "version"  -> version.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteCustomActionTypeInput]
    }
  }

  /**
    * Represents the input of a <code>DeletePipeline</code> action.
    */
  @js.native
  trait DeletePipelineInput extends js.Object {
    var name: PipelineName
  }

  object DeletePipelineInput {
    def apply(
        name: PipelineName
    ): DeletePipelineInput = {
      val __obj = js.Dictionary[js.Any](
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePipelineInput]
    }
  }

  @js.native
  trait DeleteWebhookInput extends js.Object {
    var name: WebhookName
  }

  object DeleteWebhookInput {
    def apply(
        name: WebhookName
    ): DeleteWebhookInput = {
      val __obj = js.Dictionary[js.Any](
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteWebhookInput]
    }
  }

  @js.native
  trait DeleteWebhookOutput extends js.Object {}

  object DeleteWebhookOutput {
    def apply(
        ): DeleteWebhookOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteWebhookOutput]
    }
  }

  @js.native
  trait DeregisterWebhookWithThirdPartyInput extends js.Object {
    var webhookName: js.UndefOr[WebhookName]
  }

  object DeregisterWebhookWithThirdPartyInput {
    def apply(
        webhookName: js.UndefOr[WebhookName] = js.undefined
    ): DeregisterWebhookWithThirdPartyInput = {
      val __obj = js.Dictionary.empty[js.Any]
      webhookName.foreach(__v => __obj.update("webhookName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterWebhookWithThirdPartyInput]
    }
  }

  @js.native
  trait DeregisterWebhookWithThirdPartyOutput extends js.Object {}

  object DeregisterWebhookWithThirdPartyOutput {
    def apply(
        ): DeregisterWebhookWithThirdPartyOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeregisterWebhookWithThirdPartyOutput]
    }
  }

  /**
    * Represents the input of a <code>DisableStageTransition</code> action.
    */
  @js.native
  trait DisableStageTransitionInput extends js.Object {
    var pipelineName: PipelineName
    var reason: DisabledReason
    var stageName: StageName
    var transitionType: StageTransitionType
  }

  object DisableStageTransitionInput {
    def apply(
        pipelineName: PipelineName,
        reason: DisabledReason,
        stageName: StageName,
        transitionType: StageTransitionType
    ): DisableStageTransitionInput = {
      val __obj = js.Dictionary[js.Any](
        "pipelineName"   -> pipelineName.asInstanceOf[js.Any],
        "reason"         -> reason.asInstanceOf[js.Any],
        "stageName"      -> stageName.asInstanceOf[js.Any],
        "transitionType" -> transitionType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisableStageTransitionInput]
    }
  }

  /**
    * Represents the input of an <code>EnableStageTransition</code> action.
    */
  @js.native
  trait EnableStageTransitionInput extends js.Object {
    var pipelineName: PipelineName
    var stageName: StageName
    var transitionType: StageTransitionType
  }

  object EnableStageTransitionInput {
    def apply(
        pipelineName: PipelineName,
        stageName: StageName,
        transitionType: StageTransitionType
    ): EnableStageTransitionInput = {
      val __obj = js.Dictionary[js.Any](
        "pipelineName"   -> pipelineName.asInstanceOf[js.Any],
        "stageName"      -> stageName.asInstanceOf[js.Any],
        "transitionType" -> transitionType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EnableStageTransitionInput]
    }
  }

  /**
    * Represents information about the key used to encrypt data in the artifact store, such as an AWS Key Management Service (AWS KMS) key.
    */
  @js.native
  trait EncryptionKey extends js.Object {
    var id: EncryptionKeyId
    var `type`: EncryptionKeyType
  }

  object EncryptionKey {
    def apply(
        id: EncryptionKeyId,
        `type`: EncryptionKeyType
    ): EncryptionKey = {
      val __obj = js.Dictionary[js.Any](
        "id"   -> id.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EncryptionKey]
    }
  }

  object EncryptionKeyTypeEnum {
    val KMS = "KMS"

    val values = IndexedSeq(KMS)
  }

  /**
    * Represents information about an error in AWS CodePipeline.
    */
  @js.native
  trait ErrorDetails extends js.Object {
    var code: js.UndefOr[Code]
    var message: js.UndefOr[Message]
  }

  object ErrorDetails {
    def apply(
        code: js.UndefOr[Code] = js.undefined,
        message: js.UndefOr[Message] = js.undefined
    ): ErrorDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      code.foreach(__v => __obj.update("code", __v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.update("message", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorDetails]
    }
  }

  /**
    * The details of the actions taken and results produced on an artifact as it passes through stages in the pipeline.
    */
  @js.native
  trait ExecutionDetails extends js.Object {
    var externalExecutionId: js.UndefOr[ExecutionId]
    var percentComplete: js.UndefOr[Percentage]
    var summary: js.UndefOr[ExecutionSummary]
  }

  object ExecutionDetails {
    def apply(
        externalExecutionId: js.UndefOr[ExecutionId] = js.undefined,
        percentComplete: js.UndefOr[Percentage] = js.undefined,
        summary: js.UndefOr[ExecutionSummary] = js.undefined
    ): ExecutionDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      externalExecutionId.foreach(__v => __obj.update("externalExecutionId", __v.asInstanceOf[js.Any]))
      percentComplete.foreach(__v => __obj.update("percentComplete", __v.asInstanceOf[js.Any]))
      summary.foreach(__v => __obj.update("summary", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionDetails]
    }
  }

  /**
    * Represents information about failure details.
    */
  @js.native
  trait FailureDetails extends js.Object {
    var message: Message
    var `type`: FailureType
    var externalExecutionId: js.UndefOr[ExecutionId]
  }

  object FailureDetails {
    def apply(
        message: Message,
        `type`: FailureType,
        externalExecutionId: js.UndefOr[ExecutionId] = js.undefined
    ): FailureDetails = {
      val __obj = js.Dictionary[js.Any](
        "message" -> message.asInstanceOf[js.Any],
        "type"    -> `type`.asInstanceOf[js.Any]
      )

      externalExecutionId.foreach(__v => __obj.update("externalExecutionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailureDetails]
    }
  }

  object FailureTypeEnum {
    val JobFailed           = "JobFailed"
    val ConfigurationError  = "ConfigurationError"
    val PermissionError     = "PermissionError"
    val RevisionOutOfSync   = "RevisionOutOfSync"
    val RevisionUnavailable = "RevisionUnavailable"
    val SystemUnavailable   = "SystemUnavailable"

    val values = IndexedSeq(
      JobFailed,
      ConfigurationError,
      PermissionError,
      RevisionOutOfSync,
      RevisionUnavailable,
      SystemUnavailable
    )
  }

  /**
    * Represents the input of a <code>GetJobDetails</code> action.
    */
  @js.native
  trait GetJobDetailsInput extends js.Object {
    var jobId: JobId
  }

  object GetJobDetailsInput {
    def apply(
        jobId: JobId
    ): GetJobDetailsInput = {
      val __obj = js.Dictionary[js.Any](
        "jobId" -> jobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetJobDetailsInput]
    }
  }

  /**
    * Represents the output of a <code>GetJobDetails</code> action.
    */
  @js.native
  trait GetJobDetailsOutput extends js.Object {
    var jobDetails: js.UndefOr[JobDetails]
  }

  object GetJobDetailsOutput {
    def apply(
        jobDetails: js.UndefOr[JobDetails] = js.undefined
    ): GetJobDetailsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      jobDetails.foreach(__v => __obj.update("jobDetails", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobDetailsOutput]
    }
  }

  /**
    * Represents the input of a <code>GetPipelineExecution</code> action.
    */
  @js.native
  trait GetPipelineExecutionInput extends js.Object {
    var pipelineExecutionId: PipelineExecutionId
    var pipelineName: PipelineName
  }

  object GetPipelineExecutionInput {
    def apply(
        pipelineExecutionId: PipelineExecutionId,
        pipelineName: PipelineName
    ): GetPipelineExecutionInput = {
      val __obj = js.Dictionary[js.Any](
        "pipelineExecutionId" -> pipelineExecutionId.asInstanceOf[js.Any],
        "pipelineName"        -> pipelineName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetPipelineExecutionInput]
    }
  }

  /**
    * Represents the output of a <code>GetPipelineExecution</code> action.
    */
  @js.native
  trait GetPipelineExecutionOutput extends js.Object {
    var pipelineExecution: js.UndefOr[PipelineExecution]
  }

  object GetPipelineExecutionOutput {
    def apply(
        pipelineExecution: js.UndefOr[PipelineExecution] = js.undefined
    ): GetPipelineExecutionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      pipelineExecution.foreach(__v => __obj.update("pipelineExecution", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPipelineExecutionOutput]
    }
  }

  /**
    * Represents the input of a <code>GetPipeline</code> action.
    */
  @js.native
  trait GetPipelineInput extends js.Object {
    var name: PipelineName
    var version: js.UndefOr[PipelineVersion]
  }

  object GetPipelineInput {
    def apply(
        name: PipelineName,
        version: js.UndefOr[PipelineVersion] = js.undefined
    ): GetPipelineInput = {
      val __obj = js.Dictionary[js.Any](
        "name" -> name.asInstanceOf[js.Any]
      )

      version.foreach(__v => __obj.update("version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPipelineInput]
    }
  }

  /**
    * Represents the output of a <code>GetPipeline</code> action.
    */
  @js.native
  trait GetPipelineOutput extends js.Object {
    var metadata: js.UndefOr[PipelineMetadata]
    var pipeline: js.UndefOr[PipelineDeclaration]
  }

  object GetPipelineOutput {
    def apply(
        metadata: js.UndefOr[PipelineMetadata] = js.undefined,
        pipeline: js.UndefOr[PipelineDeclaration] = js.undefined
    ): GetPipelineOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      metadata.foreach(__v => __obj.update("metadata", __v.asInstanceOf[js.Any]))
      pipeline.foreach(__v => __obj.update("pipeline", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPipelineOutput]
    }
  }

  /**
    * Represents the input of a <code>GetPipelineState</code> action.
    */
  @js.native
  trait GetPipelineStateInput extends js.Object {
    var name: PipelineName
  }

  object GetPipelineStateInput {
    def apply(
        name: PipelineName
    ): GetPipelineStateInput = {
      val __obj = js.Dictionary[js.Any](
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetPipelineStateInput]
    }
  }

  /**
    * Represents the output of a <code>GetPipelineState</code> action.
    */
  @js.native
  trait GetPipelineStateOutput extends js.Object {
    var created: js.UndefOr[Timestamp]
    var pipelineName: js.UndefOr[PipelineName]
    var pipelineVersion: js.UndefOr[PipelineVersion]
    var stageStates: js.UndefOr[StageStateList]
    var updated: js.UndefOr[Timestamp]
  }

  object GetPipelineStateOutput {
    def apply(
        created: js.UndefOr[Timestamp] = js.undefined,
        pipelineName: js.UndefOr[PipelineName] = js.undefined,
        pipelineVersion: js.UndefOr[PipelineVersion] = js.undefined,
        stageStates: js.UndefOr[StageStateList] = js.undefined,
        updated: js.UndefOr[Timestamp] = js.undefined
    ): GetPipelineStateOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      created.foreach(__v => __obj.update("created", __v.asInstanceOf[js.Any]))
      pipelineName.foreach(__v => __obj.update("pipelineName", __v.asInstanceOf[js.Any]))
      pipelineVersion.foreach(__v => __obj.update("pipelineVersion", __v.asInstanceOf[js.Any]))
      stageStates.foreach(__v => __obj.update("stageStates", __v.asInstanceOf[js.Any]))
      updated.foreach(__v => __obj.update("updated", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPipelineStateOutput]
    }
  }

  /**
    * Represents the input of a <code>GetThirdPartyJobDetails</code> action.
    */
  @js.native
  trait GetThirdPartyJobDetailsInput extends js.Object {
    var clientToken: ClientToken
    var jobId: ThirdPartyJobId
  }

  object GetThirdPartyJobDetailsInput {
    def apply(
        clientToken: ClientToken,
        jobId: ThirdPartyJobId
    ): GetThirdPartyJobDetailsInput = {
      val __obj = js.Dictionary[js.Any](
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "jobId"       -> jobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetThirdPartyJobDetailsInput]
    }
  }

  /**
    * Represents the output of a <code>GetThirdPartyJobDetails</code> action.
    */
  @js.native
  trait GetThirdPartyJobDetailsOutput extends js.Object {
    var jobDetails: js.UndefOr[ThirdPartyJobDetails]
  }

  object GetThirdPartyJobDetailsOutput {
    def apply(
        jobDetails: js.UndefOr[ThirdPartyJobDetails] = js.undefined
    ): GetThirdPartyJobDetailsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      jobDetails.foreach(__v => __obj.update("jobDetails", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetThirdPartyJobDetailsOutput]
    }
  }

  /**
    * Represents information about an artifact to be worked on, such as a test or build artifact.
    */
  @js.native
  trait InputArtifact extends js.Object {
    var name: ArtifactName
  }

  object InputArtifact {
    def apply(
        name: ArtifactName
    ): InputArtifact = {
      val __obj = js.Dictionary[js.Any](
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InputArtifact]
    }
  }

  /**
    * Represents information about a job.
    */
  @js.native
  trait Job extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var data: js.UndefOr[JobData]
    var id: js.UndefOr[JobId]
    var nonce: js.UndefOr[Nonce]
  }

  object Job {
    def apply(
        accountId: js.UndefOr[AccountId] = js.undefined,
        data: js.UndefOr[JobData] = js.undefined,
        id: js.UndefOr[JobId] = js.undefined,
        nonce: js.UndefOr[Nonce] = js.undefined
    ): Job = {
      val __obj = js.Dictionary.empty[js.Any]
      accountId.foreach(__v => __obj.update("accountId", __v.asInstanceOf[js.Any]))
      data.foreach(__v => __obj.update("data", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      nonce.foreach(__v => __obj.update("nonce", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Job]
    }
  }

  /**
    * Represents additional information about a job required for a job worker to complete the job.
    */
  @js.native
  trait JobData extends js.Object {
    var actionConfiguration: js.UndefOr[ActionConfiguration]
    var actionTypeId: js.UndefOr[ActionTypeId]
    var artifactCredentials: js.UndefOr[AWSSessionCredentials]
    var continuationToken: js.UndefOr[ContinuationToken]
    var encryptionKey: js.UndefOr[EncryptionKey]
    var inputArtifacts: js.UndefOr[ArtifactList]
    var outputArtifacts: js.UndefOr[ArtifactList]
    var pipelineContext: js.UndefOr[PipelineContext]
  }

  object JobData {
    def apply(
        actionConfiguration: js.UndefOr[ActionConfiguration] = js.undefined,
        actionTypeId: js.UndefOr[ActionTypeId] = js.undefined,
        artifactCredentials: js.UndefOr[AWSSessionCredentials] = js.undefined,
        continuationToken: js.UndefOr[ContinuationToken] = js.undefined,
        encryptionKey: js.UndefOr[EncryptionKey] = js.undefined,
        inputArtifacts: js.UndefOr[ArtifactList] = js.undefined,
        outputArtifacts: js.UndefOr[ArtifactList] = js.undefined,
        pipelineContext: js.UndefOr[PipelineContext] = js.undefined
    ): JobData = {
      val __obj = js.Dictionary.empty[js.Any]
      actionConfiguration.foreach(__v => __obj.update("actionConfiguration", __v.asInstanceOf[js.Any]))
      actionTypeId.foreach(__v => __obj.update("actionTypeId", __v.asInstanceOf[js.Any]))
      artifactCredentials.foreach(__v => __obj.update("artifactCredentials", __v.asInstanceOf[js.Any]))
      continuationToken.foreach(__v => __obj.update("continuationToken", __v.asInstanceOf[js.Any]))
      encryptionKey.foreach(__v => __obj.update("encryptionKey", __v.asInstanceOf[js.Any]))
      inputArtifacts.foreach(__v => __obj.update("inputArtifacts", __v.asInstanceOf[js.Any]))
      outputArtifacts.foreach(__v => __obj.update("outputArtifacts", __v.asInstanceOf[js.Any]))
      pipelineContext.foreach(__v => __obj.update("pipelineContext", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobData]
    }
  }

  /**
    * Represents information about the details of a job.
    */
  @js.native
  trait JobDetails extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var data: js.UndefOr[JobData]
    var id: js.UndefOr[JobId]
  }

  object JobDetails {
    def apply(
        accountId: js.UndefOr[AccountId] = js.undefined,
        data: js.UndefOr[JobData] = js.undefined,
        id: js.UndefOr[JobId] = js.undefined
    ): JobDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      accountId.foreach(__v => __obj.update("accountId", __v.asInstanceOf[js.Any]))
      data.foreach(__v => __obj.update("data", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobDetails]
    }
  }

  object JobStatusEnum {
    val Created    = "Created"
    val Queued     = "Queued"
    val Dispatched = "Dispatched"
    val InProgress = "InProgress"
    val TimedOut   = "TimedOut"
    val Succeeded  = "Succeeded"
    val Failed     = "Failed"

    val values = IndexedSeq(Created, Queued, Dispatched, InProgress, TimedOut, Succeeded, Failed)
  }

  @js.native
  trait ListActionExecutionsInput extends js.Object {
    var pipelineName: PipelineName
    var filter: js.UndefOr[ActionExecutionFilter]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListActionExecutionsInput {
    def apply(
        pipelineName: PipelineName,
        filter: js.UndefOr[ActionExecutionFilter] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListActionExecutionsInput = {
      val __obj = js.Dictionary[js.Any](
        "pipelineName" -> pipelineName.asInstanceOf[js.Any]
      )

      filter.foreach(__v => __obj.update("filter", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListActionExecutionsInput]
    }
  }

  @js.native
  trait ListActionExecutionsOutput extends js.Object {
    var actionExecutionDetails: js.UndefOr[ActionExecutionDetailList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListActionExecutionsOutput {
    def apply(
        actionExecutionDetails: js.UndefOr[ActionExecutionDetailList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListActionExecutionsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      actionExecutionDetails.foreach(__v => __obj.update("actionExecutionDetails", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListActionExecutionsOutput]
    }
  }

  /**
    * Represents the input of a <code>ListActionTypes</code> action.
    */
  @js.native
  trait ListActionTypesInput extends js.Object {
    var actionOwnerFilter: js.UndefOr[ActionOwner]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListActionTypesInput {
    def apply(
        actionOwnerFilter: js.UndefOr[ActionOwner] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListActionTypesInput = {
      val __obj = js.Dictionary.empty[js.Any]
      actionOwnerFilter.foreach(__v => __obj.update("actionOwnerFilter", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListActionTypesInput]
    }
  }

  /**
    * Represents the output of a <code>ListActionTypes</code> action.
    */
  @js.native
  trait ListActionTypesOutput extends js.Object {
    var actionTypes: ActionTypeList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListActionTypesOutput {
    def apply(
        actionTypes: ActionTypeList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListActionTypesOutput = {
      val __obj = js.Dictionary[js.Any](
        "actionTypes" -> actionTypes.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListActionTypesOutput]
    }
  }

  /**
    * Represents the input of a <code>ListPipelineExecutions</code> action.
    */
  @js.native
  trait ListPipelineExecutionsInput extends js.Object {
    var pipelineName: PipelineName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListPipelineExecutionsInput {
    def apply(
        pipelineName: PipelineName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPipelineExecutionsInput = {
      val __obj = js.Dictionary[js.Any](
        "pipelineName" -> pipelineName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelineExecutionsInput]
    }
  }

  /**
    * Represents the output of a <code>ListPipelineExecutions</code> action.
    */
  @js.native
  trait ListPipelineExecutionsOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var pipelineExecutionSummaries: js.UndefOr[PipelineExecutionSummaryList]
  }

  object ListPipelineExecutionsOutput {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        pipelineExecutionSummaries: js.UndefOr[PipelineExecutionSummaryList] = js.undefined
    ): ListPipelineExecutionsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      pipelineExecutionSummaries.foreach(__v => __obj.update("pipelineExecutionSummaries", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelineExecutionsOutput]
    }
  }

  /**
    * Represents the input of a <code>ListPipelines</code> action.
    */
  @js.native
  trait ListPipelinesInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
  }

  object ListPipelinesInput {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPipelinesInput = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelinesInput]
    }
  }

  /**
    * Represents the output of a <code>ListPipelines</code> action.
    */
  @js.native
  trait ListPipelinesOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var pipelines: js.UndefOr[PipelineList]
  }

  object ListPipelinesOutput {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        pipelines: js.UndefOr[PipelineList] = js.undefined
    ): ListPipelinesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      pipelines.foreach(__v => __obj.update("pipelines", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelinesOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var resourceArn: ResourceArn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceInput {
    def apply(
        resourceArn: ResourceArn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceInput = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceOutput {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
    }
  }

  /**
    * The detail returned for each webhook after listing webhooks, such as the webhook URL, the webhook name, and the webhook ARN.
    */
  @js.native
  trait ListWebhookItem extends js.Object {
    var definition: WebhookDefinition
    var url: WebhookUrl
    var arn: js.UndefOr[WebhookArn]
    var errorCode: js.UndefOr[WebhookErrorCode]
    var errorMessage: js.UndefOr[WebhookErrorMessage]
    var lastTriggered: js.UndefOr[WebhookLastTriggered]
    var tags: js.UndefOr[TagList]
  }

  object ListWebhookItem {
    def apply(
        definition: WebhookDefinition,
        url: WebhookUrl,
        arn: js.UndefOr[WebhookArn] = js.undefined,
        errorCode: js.UndefOr[WebhookErrorCode] = js.undefined,
        errorMessage: js.UndefOr[WebhookErrorMessage] = js.undefined,
        lastTriggered: js.UndefOr[WebhookLastTriggered] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): ListWebhookItem = {
      val __obj = js.Dictionary[js.Any](
        "definition" -> definition.asInstanceOf[js.Any],
        "url"        -> url.asInstanceOf[js.Any]
      )

      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      errorCode.foreach(__v => __obj.update("errorCode", __v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.update("errorMessage", __v.asInstanceOf[js.Any]))
      lastTriggered.foreach(__v => __obj.update("lastTriggered", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWebhookItem]
    }
  }

  @js.native
  trait ListWebhooksInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListWebhooksInput {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListWebhooksInput = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWebhooksInput]
    }
  }

  @js.native
  trait ListWebhooksOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var webhooks: js.UndefOr[WebhookList]
  }

  object ListWebhooksOutput {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        webhooks: js.UndefOr[WebhookList] = js.undefined
    ): ListWebhooksOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      webhooks.foreach(__v => __obj.update("webhooks", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWebhooksOutput]
    }
  }

  /**
    * Represents information about the output of an action.
    */
  @js.native
  trait OutputArtifact extends js.Object {
    var name: ArtifactName
  }

  object OutputArtifact {
    def apply(
        name: ArtifactName
    ): OutputArtifact = {
      val __obj = js.Dictionary[js.Any](
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[OutputArtifact]
    }
  }

  /**
    * Represents information about a pipeline to a job worker.
    *
    * '''Note:'''PipelineContext contains <code>pipelineArn</code> and <code>pipelineExecutionId</code> for custom action jobs. The <code>pipelineArn</code> and <code>pipelineExecutionId</code> fields are not populated for ThirdParty action jobs.
    */
  @js.native
  trait PipelineContext extends js.Object {
    var action: js.UndefOr[ActionContext]
    var pipelineArn: js.UndefOr[PipelineArn]
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
    var pipelineName: js.UndefOr[PipelineName]
    var stage: js.UndefOr[StageContext]
  }

  object PipelineContext {
    def apply(
        action: js.UndefOr[ActionContext] = js.undefined,
        pipelineArn: js.UndefOr[PipelineArn] = js.undefined,
        pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined,
        pipelineName: js.UndefOr[PipelineName] = js.undefined,
        stage: js.UndefOr[StageContext] = js.undefined
    ): PipelineContext = {
      val __obj = js.Dictionary.empty[js.Any]
      action.foreach(__v => __obj.update("action", __v.asInstanceOf[js.Any]))
      pipelineArn.foreach(__v => __obj.update("pipelineArn", __v.asInstanceOf[js.Any]))
      pipelineExecutionId.foreach(__v => __obj.update("pipelineExecutionId", __v.asInstanceOf[js.Any]))
      pipelineName.foreach(__v => __obj.update("pipelineName", __v.asInstanceOf[js.Any]))
      stage.foreach(__v => __obj.update("stage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineContext]
    }
  }

  /**
    * Represents the structure of actions and stages to be performed in the pipeline.
    */
  @js.native
  trait PipelineDeclaration extends js.Object {
    var name: PipelineName
    var roleArn: RoleArn
    var stages: PipelineStageDeclarationList
    var artifactStore: js.UndefOr[ArtifactStore]
    var artifactStores: js.UndefOr[ArtifactStoreMap]
    var version: js.UndefOr[PipelineVersion]
  }

  object PipelineDeclaration {
    def apply(
        name: PipelineName,
        roleArn: RoleArn,
        stages: PipelineStageDeclarationList,
        artifactStore: js.UndefOr[ArtifactStore] = js.undefined,
        artifactStores: js.UndefOr[ArtifactStoreMap] = js.undefined,
        version: js.UndefOr[PipelineVersion] = js.undefined
    ): PipelineDeclaration = {
      val __obj = js.Dictionary[js.Any](
        "name"    -> name.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "stages"  -> stages.asInstanceOf[js.Any]
      )

      artifactStore.foreach(__v => __obj.update("artifactStore", __v.asInstanceOf[js.Any]))
      artifactStores.foreach(__v => __obj.update("artifactStores", __v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.update("version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineDeclaration]
    }
  }

  /**
    * Represents information about an execution of a pipeline.
    */
  @js.native
  trait PipelineExecution extends js.Object {
    var artifactRevisions: js.UndefOr[ArtifactRevisionList]
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
    var pipelineName: js.UndefOr[PipelineName]
    var pipelineVersion: js.UndefOr[PipelineVersion]
    var status: js.UndefOr[PipelineExecutionStatus]
  }

  object PipelineExecution {
    def apply(
        artifactRevisions: js.UndefOr[ArtifactRevisionList] = js.undefined,
        pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined,
        pipelineName: js.UndefOr[PipelineName] = js.undefined,
        pipelineVersion: js.UndefOr[PipelineVersion] = js.undefined,
        status: js.UndefOr[PipelineExecutionStatus] = js.undefined
    ): PipelineExecution = {
      val __obj = js.Dictionary.empty[js.Any]
      artifactRevisions.foreach(__v => __obj.update("artifactRevisions", __v.asInstanceOf[js.Any]))
      pipelineExecutionId.foreach(__v => __obj.update("pipelineExecutionId", __v.asInstanceOf[js.Any]))
      pipelineName.foreach(__v => __obj.update("pipelineName", __v.asInstanceOf[js.Any]))
      pipelineVersion.foreach(__v => __obj.update("pipelineVersion", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineExecution]
    }
  }

  object PipelineExecutionStatusEnum {
    val InProgress = "InProgress"
    val Succeeded  = "Succeeded"
    val Superseded = "Superseded"
    val Failed     = "Failed"

    val values = IndexedSeq(InProgress, Succeeded, Superseded, Failed)
  }

  /**
    * Summary information about a pipeline execution.
    */
  @js.native
  trait PipelineExecutionSummary extends js.Object {
    var lastUpdateTime: js.UndefOr[Timestamp]
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
    var sourceRevisions: js.UndefOr[SourceRevisionList]
    var startTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[PipelineExecutionStatus]
  }

  object PipelineExecutionSummary {
    def apply(
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined,
        sourceRevisions: js.UndefOr[SourceRevisionList] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[PipelineExecutionStatus] = js.undefined
    ): PipelineExecutionSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      lastUpdateTime.foreach(__v => __obj.update("lastUpdateTime", __v.asInstanceOf[js.Any]))
      pipelineExecutionId.foreach(__v => __obj.update("pipelineExecutionId", __v.asInstanceOf[js.Any]))
      sourceRevisions.foreach(__v => __obj.update("sourceRevisions", __v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.update("startTime", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineExecutionSummary]
    }
  }

  /**
    * Information about a pipeline.
    */
  @js.native
  trait PipelineMetadata extends js.Object {
    var created: js.UndefOr[Timestamp]
    var pipelineArn: js.UndefOr[PipelineArn]
    var updated: js.UndefOr[Timestamp]
  }

  object PipelineMetadata {
    def apply(
        created: js.UndefOr[Timestamp] = js.undefined,
        pipelineArn: js.UndefOr[PipelineArn] = js.undefined,
        updated: js.UndefOr[Timestamp] = js.undefined
    ): PipelineMetadata = {
      val __obj = js.Dictionary.empty[js.Any]
      created.foreach(__v => __obj.update("created", __v.asInstanceOf[js.Any]))
      pipelineArn.foreach(__v => __obj.update("pipelineArn", __v.asInstanceOf[js.Any]))
      updated.foreach(__v => __obj.update("updated", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineMetadata]
    }
  }

  /**
    * Returns a summary of a pipeline.
    */
  @js.native
  trait PipelineSummary extends js.Object {
    var created: js.UndefOr[Timestamp]
    var name: js.UndefOr[PipelineName]
    var updated: js.UndefOr[Timestamp]
    var version: js.UndefOr[PipelineVersion]
  }

  object PipelineSummary {
    def apply(
        created: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[PipelineName] = js.undefined,
        updated: js.UndefOr[Timestamp] = js.undefined,
        version: js.UndefOr[PipelineVersion] = js.undefined
    ): PipelineSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      created.foreach(__v => __obj.update("created", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      updated.foreach(__v => __obj.update("updated", __v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.update("version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineSummary]
    }
  }

  /**
    * Represents the input of a <code>PollForJobs</code> action.
    */
  @js.native
  trait PollForJobsInput extends js.Object {
    var actionTypeId: ActionTypeId
    var maxBatchSize: js.UndefOr[MaxBatchSize]
    var queryParam: js.UndefOr[QueryParamMap]
  }

  object PollForJobsInput {
    def apply(
        actionTypeId: ActionTypeId,
        maxBatchSize: js.UndefOr[MaxBatchSize] = js.undefined,
        queryParam: js.UndefOr[QueryParamMap] = js.undefined
    ): PollForJobsInput = {
      val __obj = js.Dictionary[js.Any](
        "actionTypeId" -> actionTypeId.asInstanceOf[js.Any]
      )

      maxBatchSize.foreach(__v => __obj.update("maxBatchSize", __v.asInstanceOf[js.Any]))
      queryParam.foreach(__v => __obj.update("queryParam", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PollForJobsInput]
    }
  }

  /**
    * Represents the output of a <code>PollForJobs</code> action.
    */
  @js.native
  trait PollForJobsOutput extends js.Object {
    var jobs: js.UndefOr[JobList]
  }

  object PollForJobsOutput {
    def apply(
        jobs: js.UndefOr[JobList] = js.undefined
    ): PollForJobsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      jobs.foreach(__v => __obj.update("jobs", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PollForJobsOutput]
    }
  }

  /**
    * Represents the input of a <code>PollForThirdPartyJobs</code> action.
    */
  @js.native
  trait PollForThirdPartyJobsInput extends js.Object {
    var actionTypeId: ActionTypeId
    var maxBatchSize: js.UndefOr[MaxBatchSize]
  }

  object PollForThirdPartyJobsInput {
    def apply(
        actionTypeId: ActionTypeId,
        maxBatchSize: js.UndefOr[MaxBatchSize] = js.undefined
    ): PollForThirdPartyJobsInput = {
      val __obj = js.Dictionary[js.Any](
        "actionTypeId" -> actionTypeId.asInstanceOf[js.Any]
      )

      maxBatchSize.foreach(__v => __obj.update("maxBatchSize", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PollForThirdPartyJobsInput]
    }
  }

  /**
    * Represents the output of a <code>PollForThirdPartyJobs</code> action.
    */
  @js.native
  trait PollForThirdPartyJobsOutput extends js.Object {
    var jobs: js.UndefOr[ThirdPartyJobList]
  }

  object PollForThirdPartyJobsOutput {
    def apply(
        jobs: js.UndefOr[ThirdPartyJobList] = js.undefined
    ): PollForThirdPartyJobsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      jobs.foreach(__v => __obj.update("jobs", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PollForThirdPartyJobsOutput]
    }
  }

  /**
    * Represents the input of a <code>PutActionRevision</code> action.
    */
  @js.native
  trait PutActionRevisionInput extends js.Object {
    var actionName: ActionName
    var actionRevision: ActionRevision
    var pipelineName: PipelineName
    var stageName: StageName
  }

  object PutActionRevisionInput {
    def apply(
        actionName: ActionName,
        actionRevision: ActionRevision,
        pipelineName: PipelineName,
        stageName: StageName
    ): PutActionRevisionInput = {
      val __obj = js.Dictionary[js.Any](
        "actionName"     -> actionName.asInstanceOf[js.Any],
        "actionRevision" -> actionRevision.asInstanceOf[js.Any],
        "pipelineName"   -> pipelineName.asInstanceOf[js.Any],
        "stageName"      -> stageName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutActionRevisionInput]
    }
  }

  /**
    * Represents the output of a <code>PutActionRevision</code> action.
    */
  @js.native
  trait PutActionRevisionOutput extends js.Object {
    var newRevision: js.UndefOr[Boolean]
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
  }

  object PutActionRevisionOutput {
    def apply(
        newRevision: js.UndefOr[Boolean] = js.undefined,
        pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
    ): PutActionRevisionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      newRevision.foreach(__v => __obj.update("newRevision", __v.asInstanceOf[js.Any]))
      pipelineExecutionId.foreach(__v => __obj.update("pipelineExecutionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutActionRevisionOutput]
    }
  }

  /**
    * Represents the input of a <code>PutApprovalResult</code> action.
    */
  @js.native
  trait PutApprovalResultInput extends js.Object {
    var actionName: ActionName
    var pipelineName: PipelineName
    var result: ApprovalResult
    var stageName: StageName
    var token: ApprovalToken
  }

  object PutApprovalResultInput {
    def apply(
        actionName: ActionName,
        pipelineName: PipelineName,
        result: ApprovalResult,
        stageName: StageName,
        token: ApprovalToken
    ): PutApprovalResultInput = {
      val __obj = js.Dictionary[js.Any](
        "actionName"   -> actionName.asInstanceOf[js.Any],
        "pipelineName" -> pipelineName.asInstanceOf[js.Any],
        "result"       -> result.asInstanceOf[js.Any],
        "stageName"    -> stageName.asInstanceOf[js.Any],
        "token"        -> token.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutApprovalResultInput]
    }
  }

  /**
    * Represents the output of a <code>PutApprovalResult</code> action.
    */
  @js.native
  trait PutApprovalResultOutput extends js.Object {
    var approvedAt: js.UndefOr[Timestamp]
  }

  object PutApprovalResultOutput {
    def apply(
        approvedAt: js.UndefOr[Timestamp] = js.undefined
    ): PutApprovalResultOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      approvedAt.foreach(__v => __obj.update("approvedAt", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutApprovalResultOutput]
    }
  }

  /**
    * Represents the input of a <code>PutJobFailureResult</code> action.
    */
  @js.native
  trait PutJobFailureResultInput extends js.Object {
    var failureDetails: FailureDetails
    var jobId: JobId
  }

  object PutJobFailureResultInput {
    def apply(
        failureDetails: FailureDetails,
        jobId: JobId
    ): PutJobFailureResultInput = {
      val __obj = js.Dictionary[js.Any](
        "failureDetails" -> failureDetails.asInstanceOf[js.Any],
        "jobId"          -> jobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutJobFailureResultInput]
    }
  }

  /**
    * Represents the input of a <code>PutJobSuccessResult</code> action.
    */
  @js.native
  trait PutJobSuccessResultInput extends js.Object {
    var jobId: JobId
    var continuationToken: js.UndefOr[ContinuationToken]
    var currentRevision: js.UndefOr[CurrentRevision]
    var executionDetails: js.UndefOr[ExecutionDetails]
  }

  object PutJobSuccessResultInput {
    def apply(
        jobId: JobId,
        continuationToken: js.UndefOr[ContinuationToken] = js.undefined,
        currentRevision: js.UndefOr[CurrentRevision] = js.undefined,
        executionDetails: js.UndefOr[ExecutionDetails] = js.undefined
    ): PutJobSuccessResultInput = {
      val __obj = js.Dictionary[js.Any](
        "jobId" -> jobId.asInstanceOf[js.Any]
      )

      continuationToken.foreach(__v => __obj.update("continuationToken", __v.asInstanceOf[js.Any]))
      currentRevision.foreach(__v => __obj.update("currentRevision", __v.asInstanceOf[js.Any]))
      executionDetails.foreach(__v => __obj.update("executionDetails", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutJobSuccessResultInput]
    }
  }

  /**
    * Represents the input of a <code>PutThirdPartyJobFailureResult</code> action.
    */
  @js.native
  trait PutThirdPartyJobFailureResultInput extends js.Object {
    var clientToken: ClientToken
    var failureDetails: FailureDetails
    var jobId: ThirdPartyJobId
  }

  object PutThirdPartyJobFailureResultInput {
    def apply(
        clientToken: ClientToken,
        failureDetails: FailureDetails,
        jobId: ThirdPartyJobId
    ): PutThirdPartyJobFailureResultInput = {
      val __obj = js.Dictionary[js.Any](
        "clientToken"    -> clientToken.asInstanceOf[js.Any],
        "failureDetails" -> failureDetails.asInstanceOf[js.Any],
        "jobId"          -> jobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutThirdPartyJobFailureResultInput]
    }
  }

  /**
    * Represents the input of a <code>PutThirdPartyJobSuccessResult</code> action.
    */
  @js.native
  trait PutThirdPartyJobSuccessResultInput extends js.Object {
    var clientToken: ClientToken
    var jobId: ThirdPartyJobId
    var continuationToken: js.UndefOr[ContinuationToken]
    var currentRevision: js.UndefOr[CurrentRevision]
    var executionDetails: js.UndefOr[ExecutionDetails]
  }

  object PutThirdPartyJobSuccessResultInput {
    def apply(
        clientToken: ClientToken,
        jobId: ThirdPartyJobId,
        continuationToken: js.UndefOr[ContinuationToken] = js.undefined,
        currentRevision: js.UndefOr[CurrentRevision] = js.undefined,
        executionDetails: js.UndefOr[ExecutionDetails] = js.undefined
    ): PutThirdPartyJobSuccessResultInput = {
      val __obj = js.Dictionary[js.Any](
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "jobId"       -> jobId.asInstanceOf[js.Any]
      )

      continuationToken.foreach(__v => __obj.update("continuationToken", __v.asInstanceOf[js.Any]))
      currentRevision.foreach(__v => __obj.update("currentRevision", __v.asInstanceOf[js.Any]))
      executionDetails.foreach(__v => __obj.update("executionDetails", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutThirdPartyJobSuccessResultInput]
    }
  }

  @js.native
  trait PutWebhookInput extends js.Object {
    var webhook: WebhookDefinition
    var tags: js.UndefOr[TagList]
  }

  object PutWebhookInput {
    def apply(
        webhook: WebhookDefinition,
        tags: js.UndefOr[TagList] = js.undefined
    ): PutWebhookInput = {
      val __obj = js.Dictionary[js.Any](
        "webhook" -> webhook.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutWebhookInput]
    }
  }

  @js.native
  trait PutWebhookOutput extends js.Object {
    var webhook: js.UndefOr[ListWebhookItem]
  }

  object PutWebhookOutput {
    def apply(
        webhook: js.UndefOr[ListWebhookItem] = js.undefined
    ): PutWebhookOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      webhook.foreach(__v => __obj.update("webhook", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutWebhookOutput]
    }
  }

  @js.native
  trait RegisterWebhookWithThirdPartyInput extends js.Object {
    var webhookName: js.UndefOr[WebhookName]
  }

  object RegisterWebhookWithThirdPartyInput {
    def apply(
        webhookName: js.UndefOr[WebhookName] = js.undefined
    ): RegisterWebhookWithThirdPartyInput = {
      val __obj = js.Dictionary.empty[js.Any]
      webhookName.foreach(__v => __obj.update("webhookName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterWebhookWithThirdPartyInput]
    }
  }

  @js.native
  trait RegisterWebhookWithThirdPartyOutput extends js.Object {}

  object RegisterWebhookWithThirdPartyOutput {
    def apply(
        ): RegisterWebhookWithThirdPartyOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[RegisterWebhookWithThirdPartyOutput]
    }
  }

  /**
    * Represents the input of a <code>RetryStageExecution</code> action.
    */
  @js.native
  trait RetryStageExecutionInput extends js.Object {
    var pipelineExecutionId: PipelineExecutionId
    var pipelineName: PipelineName
    var retryMode: StageRetryMode
    var stageName: StageName
  }

  object RetryStageExecutionInput {
    def apply(
        pipelineExecutionId: PipelineExecutionId,
        pipelineName: PipelineName,
        retryMode: StageRetryMode,
        stageName: StageName
    ): RetryStageExecutionInput = {
      val __obj = js.Dictionary[js.Any](
        "pipelineExecutionId" -> pipelineExecutionId.asInstanceOf[js.Any],
        "pipelineName"        -> pipelineName.asInstanceOf[js.Any],
        "retryMode"           -> retryMode.asInstanceOf[js.Any],
        "stageName"           -> stageName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RetryStageExecutionInput]
    }
  }

  /**
    * Represents the output of a <code>RetryStageExecution</code> action.
    */
  @js.native
  trait RetryStageExecutionOutput extends js.Object {
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
  }

  object RetryStageExecutionOutput {
    def apply(
        pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
    ): RetryStageExecutionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      pipelineExecutionId.foreach(__v => __obj.update("pipelineExecutionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetryStageExecutionOutput]
    }
  }

  /**
    * The location of the Amazon S3 bucket that contains a revision.
    */
  @js.native
  trait S3ArtifactLocation extends js.Object {
    var bucketName: S3BucketName
    var objectKey: S3ObjectKey
  }

  object S3ArtifactLocation {
    def apply(
        bucketName: S3BucketName,
        objectKey: S3ObjectKey
    ): S3ArtifactLocation = {
      val __obj = js.Dictionary[js.Any](
        "bucketName" -> bucketName.asInstanceOf[js.Any],
        "objectKey"  -> objectKey.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[S3ArtifactLocation]
    }
  }

  /**
    * The Amazon S3 artifact location for an action's artifacts.
    */
  @js.native
  trait S3Location extends js.Object {
    var bucket: js.UndefOr[S3Bucket]
    var key: js.UndefOr[S3Key]
  }

  object S3Location {
    def apply(
        bucket: js.UndefOr[S3Bucket] = js.undefined,
        key: js.UndefOr[S3Key] = js.undefined
    ): S3Location = {
      val __obj = js.Dictionary.empty[js.Any]
      bucket.foreach(__v => __obj.update("bucket", __v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.update("key", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Location]
    }
  }

  /**
    * Information about the version (or revision) of a source artifact that initiated a pipeline execution.
    */
  @js.native
  trait SourceRevision extends js.Object {
    var actionName: ActionName
    var revisionId: js.UndefOr[Revision]
    var revisionSummary: js.UndefOr[RevisionSummary]
    var revisionUrl: js.UndefOr[Url]
  }

  object SourceRevision {
    def apply(
        actionName: ActionName,
        revisionId: js.UndefOr[Revision] = js.undefined,
        revisionSummary: js.UndefOr[RevisionSummary] = js.undefined,
        revisionUrl: js.UndefOr[Url] = js.undefined
    ): SourceRevision = {
      val __obj = js.Dictionary[js.Any](
        "actionName" -> actionName.asInstanceOf[js.Any]
      )

      revisionId.foreach(__v => __obj.update("revisionId", __v.asInstanceOf[js.Any]))
      revisionSummary.foreach(__v => __obj.update("revisionSummary", __v.asInstanceOf[js.Any]))
      revisionUrl.foreach(__v => __obj.update("revisionUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceRevision]
    }
  }

  /**
    * Represents information about a stage to a job worker.
    */
  @js.native
  trait StageContext extends js.Object {
    var name: js.UndefOr[StageName]
  }

  object StageContext {
    def apply(
        name: js.UndefOr[StageName] = js.undefined
    ): StageContext = {
      val __obj = js.Dictionary.empty[js.Any]
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StageContext]
    }
  }

  /**
    * Represents information about a stage and its definition.
    */
  @js.native
  trait StageDeclaration extends js.Object {
    var actions: StageActionDeclarationList
    var name: StageName
    var blockers: js.UndefOr[StageBlockerDeclarationList]
  }

  object StageDeclaration {
    def apply(
        actions: StageActionDeclarationList,
        name: StageName,
        blockers: js.UndefOr[StageBlockerDeclarationList] = js.undefined
    ): StageDeclaration = {
      val __obj = js.Dictionary[js.Any](
        "actions" -> actions.asInstanceOf[js.Any],
        "name"    -> name.asInstanceOf[js.Any]
      )

      blockers.foreach(__v => __obj.update("blockers", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StageDeclaration]
    }
  }

  /**
    * Represents information about the run of a stage.
    */
  @js.native
  trait StageExecution extends js.Object {
    var pipelineExecutionId: PipelineExecutionId
    var status: StageExecutionStatus
  }

  object StageExecution {
    def apply(
        pipelineExecutionId: PipelineExecutionId,
        status: StageExecutionStatus
    ): StageExecution = {
      val __obj = js.Dictionary[js.Any](
        "pipelineExecutionId" -> pipelineExecutionId.asInstanceOf[js.Any],
        "status"              -> status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StageExecution]
    }
  }

  object StageExecutionStatusEnum {
    val InProgress = "InProgress"
    val Failed     = "Failed"
    val Succeeded  = "Succeeded"

    val values = IndexedSeq(InProgress, Failed, Succeeded)
  }

  object StageRetryModeEnum {
    val FAILED_ACTIONS = "FAILED_ACTIONS"

    val values = IndexedSeq(FAILED_ACTIONS)
  }

  /**
    * Represents information about the state of the stage.
    */
  @js.native
  trait StageState extends js.Object {
    var actionStates: js.UndefOr[ActionStateList]
    var inboundTransitionState: js.UndefOr[TransitionState]
    var latestExecution: js.UndefOr[StageExecution]
    var stageName: js.UndefOr[StageName]
  }

  object StageState {
    def apply(
        actionStates: js.UndefOr[ActionStateList] = js.undefined,
        inboundTransitionState: js.UndefOr[TransitionState] = js.undefined,
        latestExecution: js.UndefOr[StageExecution] = js.undefined,
        stageName: js.UndefOr[StageName] = js.undefined
    ): StageState = {
      val __obj = js.Dictionary.empty[js.Any]
      actionStates.foreach(__v => __obj.update("actionStates", __v.asInstanceOf[js.Any]))
      inboundTransitionState.foreach(__v => __obj.update("inboundTransitionState", __v.asInstanceOf[js.Any]))
      latestExecution.foreach(__v => __obj.update("latestExecution", __v.asInstanceOf[js.Any]))
      stageName.foreach(__v => __obj.update("stageName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StageState]
    }
  }

  object StageTransitionTypeEnum {
    val Inbound  = "Inbound"
    val Outbound = "Outbound"

    val values = IndexedSeq(Inbound, Outbound)
  }

  /**
    * Represents the input of a <code>StartPipelineExecution</code> action.
    */
  @js.native
  trait StartPipelineExecutionInput extends js.Object {
    var name: PipelineName
    var clientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object StartPipelineExecutionInput {
    def apply(
        name: PipelineName,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): StartPipelineExecutionInput = {
      val __obj = js.Dictionary[js.Any](
        "name" -> name.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.update("clientRequestToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartPipelineExecutionInput]
    }
  }

  /**
    * Represents the output of a <code>StartPipelineExecution</code> action.
    */
  @js.native
  trait StartPipelineExecutionOutput extends js.Object {
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
  }

  object StartPipelineExecutionOutput {
    def apply(
        pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
    ): StartPipelineExecutionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      pipelineExecutionId.foreach(__v => __obj.update("pipelineExecutionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartPipelineExecutionOutput]
    }
  }

  /**
    * A tag is a key/value pair that is used to manage the resource.
    */
  @js.native
  trait Tag extends js.Object {
    var key: TagKey
    var value: TagValue
  }

  object Tag {
    def apply(
        key: TagKey,
        value: TagValue
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
        "key"   -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagList
  }

  object TagResourceInput {
    def apply(
        resourceArn: ResourceArn,
        tags: TagList
    ): TagResourceInput = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags"        -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceOutput extends js.Object {}

  object TagResourceOutput {
    def apply(
        ): TagResourceOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[TagResourceOutput]
    }
  }

  /**
    * A response to a <code>PollForThirdPartyJobs </code>request returned by AWS CodePipeline when there is a job to be worked upon by a partner action.
    */
  @js.native
  trait ThirdPartyJob extends js.Object {
    var clientId: js.UndefOr[ClientId]
    var jobId: js.UndefOr[JobId]
  }

  object ThirdPartyJob {
    def apply(
        clientId: js.UndefOr[ClientId] = js.undefined,
        jobId: js.UndefOr[JobId] = js.undefined
    ): ThirdPartyJob = {
      val __obj = js.Dictionary.empty[js.Any]
      clientId.foreach(__v => __obj.update("clientId", __v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.update("jobId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThirdPartyJob]
    }
  }

  /**
    * Represents information about the job data for a partner action.
    */
  @js.native
  trait ThirdPartyJobData extends js.Object {
    var actionConfiguration: js.UndefOr[ActionConfiguration]
    var actionTypeId: js.UndefOr[ActionTypeId]
    var artifactCredentials: js.UndefOr[AWSSessionCredentials]
    var continuationToken: js.UndefOr[ContinuationToken]
    var encryptionKey: js.UndefOr[EncryptionKey]
    var inputArtifacts: js.UndefOr[ArtifactList]
    var outputArtifacts: js.UndefOr[ArtifactList]
    var pipelineContext: js.UndefOr[PipelineContext]
  }

  object ThirdPartyJobData {
    def apply(
        actionConfiguration: js.UndefOr[ActionConfiguration] = js.undefined,
        actionTypeId: js.UndefOr[ActionTypeId] = js.undefined,
        artifactCredentials: js.UndefOr[AWSSessionCredentials] = js.undefined,
        continuationToken: js.UndefOr[ContinuationToken] = js.undefined,
        encryptionKey: js.UndefOr[EncryptionKey] = js.undefined,
        inputArtifacts: js.UndefOr[ArtifactList] = js.undefined,
        outputArtifacts: js.UndefOr[ArtifactList] = js.undefined,
        pipelineContext: js.UndefOr[PipelineContext] = js.undefined
    ): ThirdPartyJobData = {
      val __obj = js.Dictionary.empty[js.Any]
      actionConfiguration.foreach(__v => __obj.update("actionConfiguration", __v.asInstanceOf[js.Any]))
      actionTypeId.foreach(__v => __obj.update("actionTypeId", __v.asInstanceOf[js.Any]))
      artifactCredentials.foreach(__v => __obj.update("artifactCredentials", __v.asInstanceOf[js.Any]))
      continuationToken.foreach(__v => __obj.update("continuationToken", __v.asInstanceOf[js.Any]))
      encryptionKey.foreach(__v => __obj.update("encryptionKey", __v.asInstanceOf[js.Any]))
      inputArtifacts.foreach(__v => __obj.update("inputArtifacts", __v.asInstanceOf[js.Any]))
      outputArtifacts.foreach(__v => __obj.update("outputArtifacts", __v.asInstanceOf[js.Any]))
      pipelineContext.foreach(__v => __obj.update("pipelineContext", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThirdPartyJobData]
    }
  }

  /**
    * The details of a job sent in response to a <code>GetThirdPartyJobDetails</code> request.
    */
  @js.native
  trait ThirdPartyJobDetails extends js.Object {
    var data: js.UndefOr[ThirdPartyJobData]
    var id: js.UndefOr[ThirdPartyJobId]
    var nonce: js.UndefOr[Nonce]
  }

  object ThirdPartyJobDetails {
    def apply(
        data: js.UndefOr[ThirdPartyJobData] = js.undefined,
        id: js.UndefOr[ThirdPartyJobId] = js.undefined,
        nonce: js.UndefOr[Nonce] = js.undefined
    ): ThirdPartyJobDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      data.foreach(__v => __obj.update("data", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      nonce.foreach(__v => __obj.update("nonce", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThirdPartyJobDetails]
    }
  }

  /**
    * Represents information about the state of transitions between one stage and another stage.
    */
  @js.native
  trait TransitionState extends js.Object {
    var disabledReason: js.UndefOr[DisabledReason]
    var enabled: js.UndefOr[Enabled]
    var lastChangedAt: js.UndefOr[LastChangedAt]
    var lastChangedBy: js.UndefOr[LastChangedBy]
  }

  object TransitionState {
    def apply(
        disabledReason: js.UndefOr[DisabledReason] = js.undefined,
        enabled: js.UndefOr[Enabled] = js.undefined,
        lastChangedAt: js.UndefOr[LastChangedAt] = js.undefined,
        lastChangedBy: js.UndefOr[LastChangedBy] = js.undefined
    ): TransitionState = {
      val __obj = js.Dictionary.empty[js.Any]
      disabledReason.foreach(__v => __obj.update("disabledReason", __v.asInstanceOf[js.Any]))
      enabled.foreach(__v => __obj.update("enabled", __v.asInstanceOf[js.Any]))
      lastChangedAt.foreach(__v => __obj.update("lastChangedAt", __v.asInstanceOf[js.Any]))
      lastChangedBy.foreach(__v => __obj.update("lastChangedBy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransitionState]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  object UntagResourceInput {
    def apply(
        resourceArn: ResourceArn,
        tagKeys: TagKeyList
    ): UntagResourceInput = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceOutput extends js.Object {}

  object UntagResourceOutput {
    def apply(
        ): UntagResourceOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UntagResourceOutput]
    }
  }

  /**
    * Represents the input of an <code>UpdatePipeline</code> action.
    */
  @js.native
  trait UpdatePipelineInput extends js.Object {
    var pipeline: PipelineDeclaration
  }

  object UpdatePipelineInput {
    def apply(
        pipeline: PipelineDeclaration
    ): UpdatePipelineInput = {
      val __obj = js.Dictionary[js.Any](
        "pipeline" -> pipeline.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdatePipelineInput]
    }
  }

  /**
    * Represents the output of an <code>UpdatePipeline</code> action.
    */
  @js.native
  trait UpdatePipelineOutput extends js.Object {
    var pipeline: js.UndefOr[PipelineDeclaration]
  }

  object UpdatePipelineOutput {
    def apply(
        pipeline: js.UndefOr[PipelineDeclaration] = js.undefined
    ): UpdatePipelineOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      pipeline.foreach(__v => __obj.update("pipeline", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePipelineOutput]
    }
  }

  /**
    * The authentication applied to incoming webhook trigger requests.
    */
  @js.native
  trait WebhookAuthConfiguration extends js.Object {
    var AllowedIPRange: js.UndefOr[WebhookAuthConfigurationAllowedIPRange]
    var SecretToken: js.UndefOr[WebhookAuthConfigurationSecretToken]
  }

  object WebhookAuthConfiguration {
    def apply(
        AllowedIPRange: js.UndefOr[WebhookAuthConfigurationAllowedIPRange] = js.undefined,
        SecretToken: js.UndefOr[WebhookAuthConfigurationSecretToken] = js.undefined
    ): WebhookAuthConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      AllowedIPRange.foreach(__v => __obj.update("AllowedIPRange", __v.asInstanceOf[js.Any]))
      SecretToken.foreach(__v => __obj.update("SecretToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WebhookAuthConfiguration]
    }
  }

  object WebhookAuthenticationTypeEnum {
    val GITHUB_HMAC     = "GITHUB_HMAC"
    val IP              = "IP"
    val UNAUTHENTICATED = "UNAUTHENTICATED"

    val values = IndexedSeq(GITHUB_HMAC, IP, UNAUTHENTICATED)
  }

  /**
    * Represents information about a webhook and its definition.
    */
  @js.native
  trait WebhookDefinition extends js.Object {
    var authentication: WebhookAuthenticationType
    var authenticationConfiguration: WebhookAuthConfiguration
    var filters: WebhookFilters
    var name: WebhookName
    var targetAction: ActionName
    var targetPipeline: PipelineName
  }

  object WebhookDefinition {
    def apply(
        authentication: WebhookAuthenticationType,
        authenticationConfiguration: WebhookAuthConfiguration,
        filters: WebhookFilters,
        name: WebhookName,
        targetAction: ActionName,
        targetPipeline: PipelineName
    ): WebhookDefinition = {
      val __obj = js.Dictionary[js.Any](
        "authentication"              -> authentication.asInstanceOf[js.Any],
        "authenticationConfiguration" -> authenticationConfiguration.asInstanceOf[js.Any],
        "filters"                     -> filters.asInstanceOf[js.Any],
        "name"                        -> name.asInstanceOf[js.Any],
        "targetAction"                -> targetAction.asInstanceOf[js.Any],
        "targetPipeline"              -> targetPipeline.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[WebhookDefinition]
    }
  }

  /**
    * The event criteria that specify when a webhook notification is sent to your URL.
    */
  @js.native
  trait WebhookFilterRule extends js.Object {
    var jsonPath: JsonPath
    var matchEquals: js.UndefOr[MatchEquals]
  }

  object WebhookFilterRule {
    def apply(
        jsonPath: JsonPath,
        matchEquals: js.UndefOr[MatchEquals] = js.undefined
    ): WebhookFilterRule = {
      val __obj = js.Dictionary[js.Any](
        "jsonPath" -> jsonPath.asInstanceOf[js.Any]
      )

      matchEquals.foreach(__v => __obj.update("matchEquals", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WebhookFilterRule]
    }
  }
}