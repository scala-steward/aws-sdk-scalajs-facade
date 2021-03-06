package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object amplify {
  type AccessToken = String
  type ActiveJobId = String
  type AppArn = String
  type AppId = String
  type Apps = js.Array[App]
  type ArtifactFileName = String
  type ArtifactId = String
  type ArtifactUrl = String
  type Artifacts = js.Array[Artifact]
  type ArtifactsUrl = String
  type AssociatedResource = String
  type AssociatedResources = js.Array[AssociatedResource]
  type AutoBranchCreationPattern = String
  type AutoBranchCreationPatterns = js.Array[AutoBranchCreationPattern]
  type AutoSubDomainCreationPattern = String
  type AutoSubDomainCreationPatterns = js.Array[AutoSubDomainCreationPattern]
  type AutoSubDomainIAMRole = String
  type BackendEnvironmentArn = String
  type BackendEnvironments = js.Array[BackendEnvironment]
  type BasicAuthCredentials = String
  type BranchArn = String
  type BranchName = String
  type Branches = js.Array[Branch]
  type BuildSpec = String
  type CertificateVerificationDNSRecord = String
  type CommitId = String
  type CommitMessage = String
  type CommitTime = js.Date
  type Condition = String
  type Context = String
  type CreateTime = js.Date
  type CustomDomain = String
  type CustomDomains = js.Array[CustomDomain]
  type CustomHeaders = String
  type CustomRules = js.Array[CustomRule]
  type DNSRecord = String
  type DefaultDomain = String
  type DeploymentArtifacts = String
  type Description = String
  type DisplayName = String
  type DomainAssociationArn = String
  type DomainAssociations = js.Array[DomainAssociation]
  type DomainName = String
  type DomainPrefix = String
  type EnableAutoBranchCreation = Boolean
  type EnableAutoBuild = Boolean
  type EnableAutoSubDomain = Boolean
  type EnableBasicAuth = Boolean
  type EnableBranchAutoBuild = Boolean
  type EnableBranchAutoDeletion = Boolean
  type EnableNotification = Boolean
  type EnablePerformanceMode = Boolean
  type EnablePullRequestPreview = Boolean
  type EndTime = js.Date
  type EnvKey = String
  type EnvValue = String
  type EnvironmentName = String
  type EnvironmentVariables = js.Dictionary[EnvValue]
  type FileMap = js.Dictionary[MD5Hash]
  type FileName = String
  type FileUploadUrls = js.Dictionary[UploadUrl]
  type Framework = String
  type JobArn = String
  type JobId = String
  type JobReason = String
  type JobSummaries = js.Array[JobSummary]
  type LastDeployTime = js.Date
  type LogUrl = String
  type MD5Hash = String
  type MaxResults = Int
  type Name = String
  type NextToken = String
  type OauthToken = String
  type PullRequestEnvironmentName = String
  type Repository = String
  type ResourceArn = String
  type Screenshots = js.Dictionary[ThumbnailUrl]
  type ServiceRoleArn = String
  type Source = String
  type SourceUrl = String
  type StackName = String
  type StartTime = js.Date
  type Status = String
  type StatusReason = String
  type StepName = String
  type Steps = js.Array[Step]
  type SubDomainSettings = js.Array[SubDomainSetting]
  type SubDomains = js.Array[SubDomain]
  type TTL = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Target = String
  type TestArtifactsUrl = String
  type TestConfigUrl = String
  type ThumbnailName = String
  type ThumbnailUrl = String
  type TotalNumberOfJobs = String
  type UpdateTime = js.Date
  type UploadUrl = String
  type Verified = Boolean
  type WebhookArn = String
  type WebhookId = String
  type WebhookUrl = String
  type Webhooks = js.Array[Webhook]

  implicit final class AmplifyOps(private val service: Amplify) extends AnyVal {

    @inline def createAppFuture(params: CreateAppRequest): Future[CreateAppResult] = service.createApp(params).promise().toFuture
    @inline def createBackendEnvironmentFuture(params: CreateBackendEnvironmentRequest): Future[CreateBackendEnvironmentResult] = service.createBackendEnvironment(params).promise().toFuture
    @inline def createBranchFuture(params: CreateBranchRequest): Future[CreateBranchResult] = service.createBranch(params).promise().toFuture
    @inline def createDeploymentFuture(params: CreateDeploymentRequest): Future[CreateDeploymentResult] = service.createDeployment(params).promise().toFuture
    @inline def createDomainAssociationFuture(params: CreateDomainAssociationRequest): Future[CreateDomainAssociationResult] = service.createDomainAssociation(params).promise().toFuture
    @inline def createWebhookFuture(params: CreateWebhookRequest): Future[CreateWebhookResult] = service.createWebhook(params).promise().toFuture
    @inline def deleteAppFuture(params: DeleteAppRequest): Future[DeleteAppResult] = service.deleteApp(params).promise().toFuture
    @inline def deleteBackendEnvironmentFuture(params: DeleteBackendEnvironmentRequest): Future[DeleteBackendEnvironmentResult] = service.deleteBackendEnvironment(params).promise().toFuture
    @inline def deleteBranchFuture(params: DeleteBranchRequest): Future[DeleteBranchResult] = service.deleteBranch(params).promise().toFuture
    @inline def deleteDomainAssociationFuture(params: DeleteDomainAssociationRequest): Future[DeleteDomainAssociationResult] = service.deleteDomainAssociation(params).promise().toFuture
    @inline def deleteJobFuture(params: DeleteJobRequest): Future[DeleteJobResult] = service.deleteJob(params).promise().toFuture
    @inline def deleteWebhookFuture(params: DeleteWebhookRequest): Future[DeleteWebhookResult] = service.deleteWebhook(params).promise().toFuture
    @inline def generateAccessLogsFuture(params: GenerateAccessLogsRequest): Future[GenerateAccessLogsResult] = service.generateAccessLogs(params).promise().toFuture
    @inline def getAppFuture(params: GetAppRequest): Future[GetAppResult] = service.getApp(params).promise().toFuture
    @inline def getArtifactUrlFuture(params: GetArtifactUrlRequest): Future[GetArtifactUrlResult] = service.getArtifactUrl(params).promise().toFuture
    @inline def getBackendEnvironmentFuture(params: GetBackendEnvironmentRequest): Future[GetBackendEnvironmentResult] = service.getBackendEnvironment(params).promise().toFuture
    @inline def getBranchFuture(params: GetBranchRequest): Future[GetBranchResult] = service.getBranch(params).promise().toFuture
    @inline def getDomainAssociationFuture(params: GetDomainAssociationRequest): Future[GetDomainAssociationResult] = service.getDomainAssociation(params).promise().toFuture
    @inline def getJobFuture(params: GetJobRequest): Future[GetJobResult] = service.getJob(params).promise().toFuture
    @inline def getWebhookFuture(params: GetWebhookRequest): Future[GetWebhookResult] = service.getWebhook(params).promise().toFuture
    @inline def listAppsFuture(params: ListAppsRequest): Future[ListAppsResult] = service.listApps(params).promise().toFuture
    @inline def listArtifactsFuture(params: ListArtifactsRequest): Future[ListArtifactsResult] = service.listArtifacts(params).promise().toFuture
    @inline def listBackendEnvironmentsFuture(params: ListBackendEnvironmentsRequest): Future[ListBackendEnvironmentsResult] = service.listBackendEnvironments(params).promise().toFuture
    @inline def listBranchesFuture(params: ListBranchesRequest): Future[ListBranchesResult] = service.listBranches(params).promise().toFuture
    @inline def listDomainAssociationsFuture(params: ListDomainAssociationsRequest): Future[ListDomainAssociationsResult] = service.listDomainAssociations(params).promise().toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResult] = service.listJobs(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listWebhooksFuture(params: ListWebhooksRequest): Future[ListWebhooksResult] = service.listWebhooks(params).promise().toFuture
    @inline def startDeploymentFuture(params: StartDeploymentRequest): Future[StartDeploymentResult] = service.startDeployment(params).promise().toFuture
    @inline def startJobFuture(params: StartJobRequest): Future[StartJobResult] = service.startJob(params).promise().toFuture
    @inline def stopJobFuture(params: StopJobRequest): Future[StopJobResult] = service.stopJob(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateAppFuture(params: UpdateAppRequest): Future[UpdateAppResult] = service.updateApp(params).promise().toFuture
    @inline def updateBranchFuture(params: UpdateBranchRequest): Future[UpdateBranchResult] = service.updateBranch(params).promise().toFuture
    @inline def updateDomainAssociationFuture(params: UpdateDomainAssociationRequest): Future[UpdateDomainAssociationResult] = service.updateDomainAssociation(params).promise().toFuture
    @inline def updateWebhookFuture(params: UpdateWebhookRequest): Future[UpdateWebhookResult] = service.updateWebhook(params).promise().toFuture

  }
}

package amplify {
  @js.native
  @JSImport("aws-sdk/clients/amplify", JSImport.Namespace, "AWS.Amplify")
  class Amplify() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApp(params: CreateAppRequest): Request[CreateAppResult] = js.native
    def createBackendEnvironment(params: CreateBackendEnvironmentRequest): Request[CreateBackendEnvironmentResult] = js.native
    def createBranch(params: CreateBranchRequest): Request[CreateBranchResult] = js.native
    def createDeployment(params: CreateDeploymentRequest): Request[CreateDeploymentResult] = js.native
    def createDomainAssociation(params: CreateDomainAssociationRequest): Request[CreateDomainAssociationResult] = js.native
    def createWebhook(params: CreateWebhookRequest): Request[CreateWebhookResult] = js.native
    def deleteApp(params: DeleteAppRequest): Request[DeleteAppResult] = js.native
    def deleteBackendEnvironment(params: DeleteBackendEnvironmentRequest): Request[DeleteBackendEnvironmentResult] = js.native
    def deleteBranch(params: DeleteBranchRequest): Request[DeleteBranchResult] = js.native
    def deleteDomainAssociation(params: DeleteDomainAssociationRequest): Request[DeleteDomainAssociationResult] = js.native
    def deleteJob(params: DeleteJobRequest): Request[DeleteJobResult] = js.native
    def deleteWebhook(params: DeleteWebhookRequest): Request[DeleteWebhookResult] = js.native
    def generateAccessLogs(params: GenerateAccessLogsRequest): Request[GenerateAccessLogsResult] = js.native
    def getApp(params: GetAppRequest): Request[GetAppResult] = js.native
    def getArtifactUrl(params: GetArtifactUrlRequest): Request[GetArtifactUrlResult] = js.native
    def getBackendEnvironment(params: GetBackendEnvironmentRequest): Request[GetBackendEnvironmentResult] = js.native
    def getBranch(params: GetBranchRequest): Request[GetBranchResult] = js.native
    def getDomainAssociation(params: GetDomainAssociationRequest): Request[GetDomainAssociationResult] = js.native
    def getJob(params: GetJobRequest): Request[GetJobResult] = js.native
    def getWebhook(params: GetWebhookRequest): Request[GetWebhookResult] = js.native
    def listApps(params: ListAppsRequest): Request[ListAppsResult] = js.native
    def listArtifacts(params: ListArtifactsRequest): Request[ListArtifactsResult] = js.native
    def listBackendEnvironments(params: ListBackendEnvironmentsRequest): Request[ListBackendEnvironmentsResult] = js.native
    def listBranches(params: ListBranchesRequest): Request[ListBranchesResult] = js.native
    def listDomainAssociations(params: ListDomainAssociationsRequest): Request[ListDomainAssociationsResult] = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResult] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listWebhooks(params: ListWebhooksRequest): Request[ListWebhooksResult] = js.native
    def startDeployment(params: StartDeploymentRequest): Request[StartDeploymentResult] = js.native
    def startJob(params: StartJobRequest): Request[StartJobResult] = js.native
    def stopJob(params: StopJobRequest): Request[StopJobResult] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateApp(params: UpdateAppRequest): Request[UpdateAppResult] = js.native
    def updateBranch(params: UpdateBranchRequest): Request[UpdateBranchResult] = js.native
    def updateDomainAssociation(params: UpdateDomainAssociationRequest): Request[UpdateDomainAssociationResult] = js.native
    def updateWebhook(params: UpdateWebhookRequest): Request[UpdateWebhookResult] = js.native
  }

  /** Represents the different branches of a repository for building, deploying, and hosting an Amplify app.
    */
  @js.native
  trait App extends js.Object {
    var appArn: AppArn
    var appId: AppId
    var createTime: CreateTime
    var defaultDomain: DefaultDomain
    var description: Description
    var enableBasicAuth: EnableBasicAuth
    var enableBranchAutoBuild: EnableBranchAutoBuild
    var environmentVariables: EnvironmentVariables
    var name: Name
    var platform: Platform
    var repository: Repository
    var updateTime: UpdateTime
    var autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig]
    var autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns]
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var customHeaders: js.UndefOr[CustomHeaders]
    var customRules: js.UndefOr[CustomRules]
    var enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation]
    var enableBranchAutoDeletion: js.UndefOr[EnableBranchAutoDeletion]
    var iamServiceRoleArn: js.UndefOr[ServiceRoleArn]
    var productionBranch: js.UndefOr[ProductionBranch]
    var tags: js.UndefOr[TagMap]
  }

  object App {
    @inline
    def apply(
        appArn: AppArn,
        appId: AppId,
        createTime: CreateTime,
        defaultDomain: DefaultDomain,
        description: Description,
        enableBasicAuth: EnableBasicAuth,
        enableBranchAutoBuild: EnableBranchAutoBuild,
        environmentVariables: EnvironmentVariables,
        name: Name,
        platform: Platform,
        repository: Repository,
        updateTime: UpdateTime,
        autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig] = js.undefined,
        autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns] = js.undefined,
        basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
        buildSpec: js.UndefOr[BuildSpec] = js.undefined,
        customHeaders: js.UndefOr[CustomHeaders] = js.undefined,
        customRules: js.UndefOr[CustomRules] = js.undefined,
        enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation] = js.undefined,
        enableBranchAutoDeletion: js.UndefOr[EnableBranchAutoDeletion] = js.undefined,
        iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.undefined,
        productionBranch: js.UndefOr[ProductionBranch] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): App = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any],
        "appId" -> appId.asInstanceOf[js.Any],
        "createTime" -> createTime.asInstanceOf[js.Any],
        "defaultDomain" -> defaultDomain.asInstanceOf[js.Any],
        "description" -> description.asInstanceOf[js.Any],
        "enableBasicAuth" -> enableBasicAuth.asInstanceOf[js.Any],
        "enableBranchAutoBuild" -> enableBranchAutoBuild.asInstanceOf[js.Any],
        "environmentVariables" -> environmentVariables.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "platform" -> platform.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any],
        "updateTime" -> updateTime.asInstanceOf[js.Any]
      )

      autoBranchCreationConfig.foreach(__v => __obj.updateDynamic("autoBranchCreationConfig")(__v.asInstanceOf[js.Any]))
      autoBranchCreationPatterns.foreach(__v => __obj.updateDynamic("autoBranchCreationPatterns")(__v.asInstanceOf[js.Any]))
      basicAuthCredentials.foreach(__v => __obj.updateDynamic("basicAuthCredentials")(__v.asInstanceOf[js.Any]))
      buildSpec.foreach(__v => __obj.updateDynamic("buildSpec")(__v.asInstanceOf[js.Any]))
      customHeaders.foreach(__v => __obj.updateDynamic("customHeaders")(__v.asInstanceOf[js.Any]))
      customRules.foreach(__v => __obj.updateDynamic("customRules")(__v.asInstanceOf[js.Any]))
      enableAutoBranchCreation.foreach(__v => __obj.updateDynamic("enableAutoBranchCreation")(__v.asInstanceOf[js.Any]))
      enableBranchAutoDeletion.foreach(__v => __obj.updateDynamic("enableBranchAutoDeletion")(__v.asInstanceOf[js.Any]))
      iamServiceRoleArn.foreach(__v => __obj.updateDynamic("iamServiceRoleArn")(__v.asInstanceOf[js.Any]))
      productionBranch.foreach(__v => __obj.updateDynamic("productionBranch")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[App]
    }
  }

  /** Describes an artifact.
    */
  @js.native
  trait Artifact extends js.Object {
    var artifactFileName: ArtifactFileName
    var artifactId: ArtifactId
  }

  object Artifact {
    @inline
    def apply(
        artifactFileName: ArtifactFileName,
        artifactId: ArtifactId
    ): Artifact = {
      val __obj = js.Dynamic.literal(
        "artifactFileName" -> artifactFileName.asInstanceOf[js.Any],
        "artifactId" -> artifactId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Artifact]
    }
  }

  /** Describes the automated branch creation configuration.
    */
  @js.native
  trait AutoBranchCreationConfig extends js.Object {
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var enableAutoBuild: js.UndefOr[EnableAutoBuild]
    var enableBasicAuth: js.UndefOr[EnableBasicAuth]
    var enablePerformanceMode: js.UndefOr[EnablePerformanceMode]
    var enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var framework: js.UndefOr[Framework]
    var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName]
    var stage: js.UndefOr[Stage]
  }

  object AutoBranchCreationConfig {
    @inline
    def apply(
        basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
        buildSpec: js.UndefOr[BuildSpec] = js.undefined,
        enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined,
        enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
        enablePerformanceMode: js.UndefOr[EnablePerformanceMode] = js.undefined,
        enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview] = js.undefined,
        environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined,
        framework: js.UndefOr[Framework] = js.undefined,
        pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName] = js.undefined,
        stage: js.UndefOr[Stage] = js.undefined
    ): AutoBranchCreationConfig = {
      val __obj = js.Dynamic.literal()
      basicAuthCredentials.foreach(__v => __obj.updateDynamic("basicAuthCredentials")(__v.asInstanceOf[js.Any]))
      buildSpec.foreach(__v => __obj.updateDynamic("buildSpec")(__v.asInstanceOf[js.Any]))
      enableAutoBuild.foreach(__v => __obj.updateDynamic("enableAutoBuild")(__v.asInstanceOf[js.Any]))
      enableBasicAuth.foreach(__v => __obj.updateDynamic("enableBasicAuth")(__v.asInstanceOf[js.Any]))
      enablePerformanceMode.foreach(__v => __obj.updateDynamic("enablePerformanceMode")(__v.asInstanceOf[js.Any]))
      enablePullRequestPreview.foreach(__v => __obj.updateDynamic("enablePullRequestPreview")(__v.asInstanceOf[js.Any]))
      environmentVariables.foreach(__v => __obj.updateDynamic("environmentVariables")(__v.asInstanceOf[js.Any]))
      framework.foreach(__v => __obj.updateDynamic("framework")(__v.asInstanceOf[js.Any]))
      pullRequestEnvironmentName.foreach(__v => __obj.updateDynamic("pullRequestEnvironmentName")(__v.asInstanceOf[js.Any]))
      stage.foreach(__v => __obj.updateDynamic("stage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoBranchCreationConfig]
    }
  }

  /** Describes the backend environment for an Amplify app.
    */
  @js.native
  trait BackendEnvironment extends js.Object {
    var backendEnvironmentArn: BackendEnvironmentArn
    var createTime: CreateTime
    var environmentName: EnvironmentName
    var updateTime: UpdateTime
    var deploymentArtifacts: js.UndefOr[DeploymentArtifacts]
    var stackName: js.UndefOr[StackName]
  }

  object BackendEnvironment {
    @inline
    def apply(
        backendEnvironmentArn: BackendEnvironmentArn,
        createTime: CreateTime,
        environmentName: EnvironmentName,
        updateTime: UpdateTime,
        deploymentArtifacts: js.UndefOr[DeploymentArtifacts] = js.undefined,
        stackName: js.UndefOr[StackName] = js.undefined
    ): BackendEnvironment = {
      val __obj = js.Dynamic.literal(
        "backendEnvironmentArn" -> backendEnvironmentArn.asInstanceOf[js.Any],
        "createTime" -> createTime.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any],
        "updateTime" -> updateTime.asInstanceOf[js.Any]
      )

      deploymentArtifacts.foreach(__v => __obj.updateDynamic("deploymentArtifacts")(__v.asInstanceOf[js.Any]))
      stackName.foreach(__v => __obj.updateDynamic("stackName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackendEnvironment]
    }
  }

  /** The branch for an Amplify app, which maps to a third-party repository branch.
    */
  @js.native
  trait Branch extends js.Object {
    var activeJobId: ActiveJobId
    var branchArn: BranchArn
    var branchName: BranchName
    var createTime: CreateTime
    var customDomains: CustomDomains
    var description: Description
    var displayName: DisplayName
    var enableAutoBuild: EnableAutoBuild
    var enableBasicAuth: EnableBasicAuth
    var enableNotification: EnableNotification
    var enablePullRequestPreview: EnablePullRequestPreview
    var environmentVariables: EnvironmentVariables
    var framework: Framework
    var stage: Stage
    var totalNumberOfJobs: TotalNumberOfJobs
    var ttl: TTL
    var updateTime: UpdateTime
    var associatedResources: js.UndefOr[AssociatedResources]
    var backendEnvironmentArn: js.UndefOr[BackendEnvironmentArn]
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var destinationBranch: js.UndefOr[BranchName]
    var enablePerformanceMode: js.UndefOr[EnablePerformanceMode]
    var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName]
    var sourceBranch: js.UndefOr[BranchName]
    var tags: js.UndefOr[TagMap]
    var thumbnailUrl: js.UndefOr[ThumbnailUrl]
  }

  object Branch {
    @inline
    def apply(
        activeJobId: ActiveJobId,
        branchArn: BranchArn,
        branchName: BranchName,
        createTime: CreateTime,
        customDomains: CustomDomains,
        description: Description,
        displayName: DisplayName,
        enableAutoBuild: EnableAutoBuild,
        enableBasicAuth: EnableBasicAuth,
        enableNotification: EnableNotification,
        enablePullRequestPreview: EnablePullRequestPreview,
        environmentVariables: EnvironmentVariables,
        framework: Framework,
        stage: Stage,
        totalNumberOfJobs: TotalNumberOfJobs,
        ttl: TTL,
        updateTime: UpdateTime,
        associatedResources: js.UndefOr[AssociatedResources] = js.undefined,
        backendEnvironmentArn: js.UndefOr[BackendEnvironmentArn] = js.undefined,
        basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
        buildSpec: js.UndefOr[BuildSpec] = js.undefined,
        destinationBranch: js.UndefOr[BranchName] = js.undefined,
        enablePerformanceMode: js.UndefOr[EnablePerformanceMode] = js.undefined,
        pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName] = js.undefined,
        sourceBranch: js.UndefOr[BranchName] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        thumbnailUrl: js.UndefOr[ThumbnailUrl] = js.undefined
    ): Branch = {
      val __obj = js.Dynamic.literal(
        "activeJobId" -> activeJobId.asInstanceOf[js.Any],
        "branchArn" -> branchArn.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any],
        "createTime" -> createTime.asInstanceOf[js.Any],
        "customDomains" -> customDomains.asInstanceOf[js.Any],
        "description" -> description.asInstanceOf[js.Any],
        "displayName" -> displayName.asInstanceOf[js.Any],
        "enableAutoBuild" -> enableAutoBuild.asInstanceOf[js.Any],
        "enableBasicAuth" -> enableBasicAuth.asInstanceOf[js.Any],
        "enableNotification" -> enableNotification.asInstanceOf[js.Any],
        "enablePullRequestPreview" -> enablePullRequestPreview.asInstanceOf[js.Any],
        "environmentVariables" -> environmentVariables.asInstanceOf[js.Any],
        "framework" -> framework.asInstanceOf[js.Any],
        "stage" -> stage.asInstanceOf[js.Any],
        "totalNumberOfJobs" -> totalNumberOfJobs.asInstanceOf[js.Any],
        "ttl" -> ttl.asInstanceOf[js.Any],
        "updateTime" -> updateTime.asInstanceOf[js.Any]
      )

      associatedResources.foreach(__v => __obj.updateDynamic("associatedResources")(__v.asInstanceOf[js.Any]))
      backendEnvironmentArn.foreach(__v => __obj.updateDynamic("backendEnvironmentArn")(__v.asInstanceOf[js.Any]))
      basicAuthCredentials.foreach(__v => __obj.updateDynamic("basicAuthCredentials")(__v.asInstanceOf[js.Any]))
      buildSpec.foreach(__v => __obj.updateDynamic("buildSpec")(__v.asInstanceOf[js.Any]))
      destinationBranch.foreach(__v => __obj.updateDynamic("destinationBranch")(__v.asInstanceOf[js.Any]))
      enablePerformanceMode.foreach(__v => __obj.updateDynamic("enablePerformanceMode")(__v.asInstanceOf[js.Any]))
      pullRequestEnvironmentName.foreach(__v => __obj.updateDynamic("pullRequestEnvironmentName")(__v.asInstanceOf[js.Any]))
      sourceBranch.foreach(__v => __obj.updateDynamic("sourceBranch")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      thumbnailUrl.foreach(__v => __obj.updateDynamic("thumbnailUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Branch]
    }
  }

  /** The request structure used to create apps in Amplify.
    */
  @js.native
  trait CreateAppRequest extends js.Object {
    var name: Name
    var accessToken: js.UndefOr[AccessToken]
    var autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig]
    var autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns]
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var customHeaders: js.UndefOr[CustomHeaders]
    var customRules: js.UndefOr[CustomRules]
    var description: js.UndefOr[Description]
    var enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation]
    var enableBasicAuth: js.UndefOr[EnableBasicAuth]
    var enableBranchAutoBuild: js.UndefOr[EnableBranchAutoBuild]
    var enableBranchAutoDeletion: js.UndefOr[EnableBranchAutoDeletion]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var iamServiceRoleArn: js.UndefOr[ServiceRoleArn]
    var oauthToken: js.UndefOr[OauthToken]
    var platform: js.UndefOr[Platform]
    var repository: js.UndefOr[Repository]
    var tags: js.UndefOr[TagMap]
  }

  object CreateAppRequest {
    @inline
    def apply(
        name: Name,
        accessToken: js.UndefOr[AccessToken] = js.undefined,
        autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig] = js.undefined,
        autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns] = js.undefined,
        basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
        buildSpec: js.UndefOr[BuildSpec] = js.undefined,
        customHeaders: js.UndefOr[CustomHeaders] = js.undefined,
        customRules: js.UndefOr[CustomRules] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation] = js.undefined,
        enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
        enableBranchAutoBuild: js.UndefOr[EnableBranchAutoBuild] = js.undefined,
        enableBranchAutoDeletion: js.UndefOr[EnableBranchAutoDeletion] = js.undefined,
        environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined,
        iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.undefined,
        oauthToken: js.UndefOr[OauthToken] = js.undefined,
        platform: js.UndefOr[Platform] = js.undefined,
        repository: js.UndefOr[Repository] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateAppRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      accessToken.foreach(__v => __obj.updateDynamic("accessToken")(__v.asInstanceOf[js.Any]))
      autoBranchCreationConfig.foreach(__v => __obj.updateDynamic("autoBranchCreationConfig")(__v.asInstanceOf[js.Any]))
      autoBranchCreationPatterns.foreach(__v => __obj.updateDynamic("autoBranchCreationPatterns")(__v.asInstanceOf[js.Any]))
      basicAuthCredentials.foreach(__v => __obj.updateDynamic("basicAuthCredentials")(__v.asInstanceOf[js.Any]))
      buildSpec.foreach(__v => __obj.updateDynamic("buildSpec")(__v.asInstanceOf[js.Any]))
      customHeaders.foreach(__v => __obj.updateDynamic("customHeaders")(__v.asInstanceOf[js.Any]))
      customRules.foreach(__v => __obj.updateDynamic("customRules")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      enableAutoBranchCreation.foreach(__v => __obj.updateDynamic("enableAutoBranchCreation")(__v.asInstanceOf[js.Any]))
      enableBasicAuth.foreach(__v => __obj.updateDynamic("enableBasicAuth")(__v.asInstanceOf[js.Any]))
      enableBranchAutoBuild.foreach(__v => __obj.updateDynamic("enableBranchAutoBuild")(__v.asInstanceOf[js.Any]))
      enableBranchAutoDeletion.foreach(__v => __obj.updateDynamic("enableBranchAutoDeletion")(__v.asInstanceOf[js.Any]))
      environmentVariables.foreach(__v => __obj.updateDynamic("environmentVariables")(__v.asInstanceOf[js.Any]))
      iamServiceRoleArn.foreach(__v => __obj.updateDynamic("iamServiceRoleArn")(__v.asInstanceOf[js.Any]))
      oauthToken.foreach(__v => __obj.updateDynamic("oauthToken")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      repository.foreach(__v => __obj.updateDynamic("repository")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppRequest]
    }
  }

  @js.native
  trait CreateAppResult extends js.Object {
    var app: App
  }

  object CreateAppResult {
    @inline
    def apply(
        app: App
    ): CreateAppResult = {
      val __obj = js.Dynamic.literal(
        "app" -> app.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAppResult]
    }
  }

  /** The request structure for the backend environment create request.
    */
  @js.native
  trait CreateBackendEnvironmentRequest extends js.Object {
    var appId: AppId
    var environmentName: EnvironmentName
    var deploymentArtifacts: js.UndefOr[DeploymentArtifacts]
    var stackName: js.UndefOr[StackName]
  }

  object CreateBackendEnvironmentRequest {
    @inline
    def apply(
        appId: AppId,
        environmentName: EnvironmentName,
        deploymentArtifacts: js.UndefOr[DeploymentArtifacts] = js.undefined,
        stackName: js.UndefOr[StackName] = js.undefined
    ): CreateBackendEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any]
      )

      deploymentArtifacts.foreach(__v => __obj.updateDynamic("deploymentArtifacts")(__v.asInstanceOf[js.Any]))
      stackName.foreach(__v => __obj.updateDynamic("stackName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackendEnvironmentRequest]
    }
  }

  /** The result structure for the create backend environment request.
    */
  @js.native
  trait CreateBackendEnvironmentResult extends js.Object {
    var backendEnvironment: BackendEnvironment
  }

  object CreateBackendEnvironmentResult {
    @inline
    def apply(
        backendEnvironment: BackendEnvironment
    ): CreateBackendEnvironmentResult = {
      val __obj = js.Dynamic.literal(
        "backendEnvironment" -> backendEnvironment.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateBackendEnvironmentResult]
    }
  }

  /** The request structure for the create branch request.
    */
  @js.native
  trait CreateBranchRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var backendEnvironmentArn: js.UndefOr[BackendEnvironmentArn]
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var description: js.UndefOr[Description]
    var displayName: js.UndefOr[DisplayName]
    var enableAutoBuild: js.UndefOr[EnableAutoBuild]
    var enableBasicAuth: js.UndefOr[EnableBasicAuth]
    var enableNotification: js.UndefOr[EnableNotification]
    var enablePerformanceMode: js.UndefOr[EnablePerformanceMode]
    var enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var framework: js.UndefOr[Framework]
    var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName]
    var stage: js.UndefOr[Stage]
    var tags: js.UndefOr[TagMap]
    var ttl: js.UndefOr[TTL]
  }

  object CreateBranchRequest {
    @inline
    def apply(
        appId: AppId,
        branchName: BranchName,
        backendEnvironmentArn: js.UndefOr[BackendEnvironmentArn] = js.undefined,
        basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
        buildSpec: js.UndefOr[BuildSpec] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        displayName: js.UndefOr[DisplayName] = js.undefined,
        enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined,
        enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
        enableNotification: js.UndefOr[EnableNotification] = js.undefined,
        enablePerformanceMode: js.UndefOr[EnablePerformanceMode] = js.undefined,
        enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview] = js.undefined,
        environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined,
        framework: js.UndefOr[Framework] = js.undefined,
        pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName] = js.undefined,
        stage: js.UndefOr[Stage] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        ttl: js.UndefOr[TTL] = js.undefined
    ): CreateBranchRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any]
      )

      backendEnvironmentArn.foreach(__v => __obj.updateDynamic("backendEnvironmentArn")(__v.asInstanceOf[js.Any]))
      basicAuthCredentials.foreach(__v => __obj.updateDynamic("basicAuthCredentials")(__v.asInstanceOf[js.Any]))
      buildSpec.foreach(__v => __obj.updateDynamic("buildSpec")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      enableAutoBuild.foreach(__v => __obj.updateDynamic("enableAutoBuild")(__v.asInstanceOf[js.Any]))
      enableBasicAuth.foreach(__v => __obj.updateDynamic("enableBasicAuth")(__v.asInstanceOf[js.Any]))
      enableNotification.foreach(__v => __obj.updateDynamic("enableNotification")(__v.asInstanceOf[js.Any]))
      enablePerformanceMode.foreach(__v => __obj.updateDynamic("enablePerformanceMode")(__v.asInstanceOf[js.Any]))
      enablePullRequestPreview.foreach(__v => __obj.updateDynamic("enablePullRequestPreview")(__v.asInstanceOf[js.Any]))
      environmentVariables.foreach(__v => __obj.updateDynamic("environmentVariables")(__v.asInstanceOf[js.Any]))
      framework.foreach(__v => __obj.updateDynamic("framework")(__v.asInstanceOf[js.Any]))
      pullRequestEnvironmentName.foreach(__v => __obj.updateDynamic("pullRequestEnvironmentName")(__v.asInstanceOf[js.Any]))
      stage.foreach(__v => __obj.updateDynamic("stage")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      ttl.foreach(__v => __obj.updateDynamic("ttl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBranchRequest]
    }
  }

  /** The result structure for create branch request.
    */
  @js.native
  trait CreateBranchResult extends js.Object {
    var branch: Branch
  }

  object CreateBranchResult {
    @inline
    def apply(
        branch: Branch
    ): CreateBranchResult = {
      val __obj = js.Dynamic.literal(
        "branch" -> branch.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateBranchResult]
    }
  }

  /** The request structure for the create a new deployment request.
    */
  @js.native
  trait CreateDeploymentRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var fileMap: js.UndefOr[FileMap]
  }

  object CreateDeploymentRequest {
    @inline
    def apply(
        appId: AppId,
        branchName: BranchName,
        fileMap: js.UndefOr[FileMap] = js.undefined
    ): CreateDeploymentRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any]
      )

      fileMap.foreach(__v => __obj.updateDynamic("fileMap")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentRequest]
    }
  }

  /** The result structure for the create a new deployment request.
    */
  @js.native
  trait CreateDeploymentResult extends js.Object {
    var fileUploadUrls: FileUploadUrls
    var zipUploadUrl: UploadUrl
    var jobId: js.UndefOr[JobId]
  }

  object CreateDeploymentResult {
    @inline
    def apply(
        fileUploadUrls: FileUploadUrls,
        zipUploadUrl: UploadUrl,
        jobId: js.UndefOr[JobId] = js.undefined
    ): CreateDeploymentResult = {
      val __obj = js.Dynamic.literal(
        "fileUploadUrls" -> fileUploadUrls.asInstanceOf[js.Any],
        "zipUploadUrl" -> zipUploadUrl.asInstanceOf[js.Any]
      )

      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentResult]
    }
  }

  /** The request structure for the create domain association request.
    */
  @js.native
  trait CreateDomainAssociationRequest extends js.Object {
    var appId: AppId
    var domainName: DomainName
    var subDomainSettings: SubDomainSettings
    var autoSubDomainCreationPatterns: js.UndefOr[AutoSubDomainCreationPatterns]
    var autoSubDomainIAMRole: js.UndefOr[AutoSubDomainIAMRole]
    var enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain]
  }

  object CreateDomainAssociationRequest {
    @inline
    def apply(
        appId: AppId,
        domainName: DomainName,
        subDomainSettings: SubDomainSettings,
        autoSubDomainCreationPatterns: js.UndefOr[AutoSubDomainCreationPatterns] = js.undefined,
        autoSubDomainIAMRole: js.UndefOr[AutoSubDomainIAMRole] = js.undefined,
        enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain] = js.undefined
    ): CreateDomainAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "domainName" -> domainName.asInstanceOf[js.Any],
        "subDomainSettings" -> subDomainSettings.asInstanceOf[js.Any]
      )

      autoSubDomainCreationPatterns.foreach(__v => __obj.updateDynamic("autoSubDomainCreationPatterns")(__v.asInstanceOf[js.Any]))
      autoSubDomainIAMRole.foreach(__v => __obj.updateDynamic("autoSubDomainIAMRole")(__v.asInstanceOf[js.Any]))
      enableAutoSubDomain.foreach(__v => __obj.updateDynamic("enableAutoSubDomain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainAssociationRequest]
    }
  }

  /** The result structure for the create domain association request.
    */
  @js.native
  trait CreateDomainAssociationResult extends js.Object {
    var domainAssociation: DomainAssociation
  }

  object CreateDomainAssociationResult {
    @inline
    def apply(
        domainAssociation: DomainAssociation
    ): CreateDomainAssociationResult = {
      val __obj = js.Dynamic.literal(
        "domainAssociation" -> domainAssociation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateDomainAssociationResult]
    }
  }

  /** The request structure for the create webhook request.
    */
  @js.native
  trait CreateWebhookRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var description: js.UndefOr[Description]
  }

  object CreateWebhookRequest {
    @inline
    def apply(
        appId: AppId,
        branchName: BranchName,
        description: js.UndefOr[Description] = js.undefined
    ): CreateWebhookRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWebhookRequest]
    }
  }

  /** The result structure for the create webhook request.
    */
  @js.native
  trait CreateWebhookResult extends js.Object {
    var webhook: Webhook
  }

  object CreateWebhookResult {
    @inline
    def apply(
        webhook: Webhook
    ): CreateWebhookResult = {
      val __obj = js.Dynamic.literal(
        "webhook" -> webhook.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateWebhookResult]
    }
  }

  /** Describes a custom rewrite or redirect rule.
    */
  @js.native
  trait CustomRule extends js.Object {
    var source: Source
    var target: Target
    var condition: js.UndefOr[Condition]
    var status: js.UndefOr[Status]
  }

  object CustomRule {
    @inline
    def apply(
        source: Source,
        target: Target,
        condition: js.UndefOr[Condition] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): CustomRule = {
      val __obj = js.Dynamic.literal(
        "source" -> source.asInstanceOf[js.Any],
        "target" -> target.asInstanceOf[js.Any]
      )

      condition.foreach(__v => __obj.updateDynamic("condition")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomRule]
    }
  }

  /** Describes the request structure for the delete app request.
    */
  @js.native
  trait DeleteAppRequest extends js.Object {
    var appId: AppId
  }

  object DeleteAppRequest {
    @inline
    def apply(
        appId: AppId
    ): DeleteAppRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAppRequest]
    }
  }

  /** The result structure for the delete app request.
    */
  @js.native
  trait DeleteAppResult extends js.Object {
    var app: App
  }

  object DeleteAppResult {
    @inline
    def apply(
        app: App
    ): DeleteAppResult = {
      val __obj = js.Dynamic.literal(
        "app" -> app.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAppResult]
    }
  }

  /** The request structure for the delete backend environment request.
    */
  @js.native
  trait DeleteBackendEnvironmentRequest extends js.Object {
    var appId: AppId
    var environmentName: EnvironmentName
  }

  object DeleteBackendEnvironmentRequest {
    @inline
    def apply(
        appId: AppId,
        environmentName: EnvironmentName
    ): DeleteBackendEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteBackendEnvironmentRequest]
    }
  }

  /** The result structure of the delete backend environment result.
    */
  @js.native
  trait DeleteBackendEnvironmentResult extends js.Object {
    var backendEnvironment: BackendEnvironment
  }

  object DeleteBackendEnvironmentResult {
    @inline
    def apply(
        backendEnvironment: BackendEnvironment
    ): DeleteBackendEnvironmentResult = {
      val __obj = js.Dynamic.literal(
        "backendEnvironment" -> backendEnvironment.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteBackendEnvironmentResult]
    }
  }

  /** The request structure for the delete branch request.
    */
  @js.native
  trait DeleteBranchRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
  }

  object DeleteBranchRequest {
    @inline
    def apply(
        appId: AppId,
        branchName: BranchName
    ): DeleteBranchRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteBranchRequest]
    }
  }

  /** The result structure for the delete branch request.
    */
  @js.native
  trait DeleteBranchResult extends js.Object {
    var branch: Branch
  }

  object DeleteBranchResult {
    @inline
    def apply(
        branch: Branch
    ): DeleteBranchResult = {
      val __obj = js.Dynamic.literal(
        "branch" -> branch.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteBranchResult]
    }
  }

  /** The request structure for the delete domain association request.
    */
  @js.native
  trait DeleteDomainAssociationRequest extends js.Object {
    var appId: AppId
    var domainName: DomainName
  }

  object DeleteDomainAssociationRequest {
    @inline
    def apply(
        appId: AppId,
        domainName: DomainName
    ): DeleteDomainAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "domainName" -> domainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDomainAssociationRequest]
    }
  }

  @js.native
  trait DeleteDomainAssociationResult extends js.Object {
    var domainAssociation: DomainAssociation
  }

  object DeleteDomainAssociationResult {
    @inline
    def apply(
        domainAssociation: DomainAssociation
    ): DeleteDomainAssociationResult = {
      val __obj = js.Dynamic.literal(
        "domainAssociation" -> domainAssociation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDomainAssociationResult]
    }
  }

  /** The request structure for the delete job request.
    */
  @js.native
  trait DeleteJobRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var jobId: JobId
  }

  object DeleteJobRequest {
    @inline
    def apply(
        appId: AppId,
        branchName: BranchName,
        jobId: JobId
    ): DeleteJobRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any],
        "jobId" -> jobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteJobRequest]
    }
  }

  /** The result structure for the delete job request.
    */
  @js.native
  trait DeleteJobResult extends js.Object {
    var jobSummary: JobSummary
  }

  object DeleteJobResult {
    @inline
    def apply(
        jobSummary: JobSummary
    ): DeleteJobResult = {
      val __obj = js.Dynamic.literal(
        "jobSummary" -> jobSummary.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteJobResult]
    }
  }

  /** The request structure for the delete webhook request.
    */
  @js.native
  trait DeleteWebhookRequest extends js.Object {
    var webhookId: WebhookId
  }

  object DeleteWebhookRequest {
    @inline
    def apply(
        webhookId: WebhookId
    ): DeleteWebhookRequest = {
      val __obj = js.Dynamic.literal(
        "webhookId" -> webhookId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWebhookRequest]
    }
  }

  /** The result structure for the delete webhook request.
    */
  @js.native
  trait DeleteWebhookResult extends js.Object {
    var webhook: Webhook
  }

  object DeleteWebhookResult {
    @inline
    def apply(
        webhook: Webhook
    ): DeleteWebhookResult = {
      val __obj = js.Dynamic.literal(
        "webhook" -> webhook.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWebhookResult]
    }
  }

  /** Describes a domain association that associates a custom domain with an Amplify app.
    */
  @js.native
  trait DomainAssociation extends js.Object {
    var domainAssociationArn: DomainAssociationArn
    var domainName: DomainName
    var domainStatus: DomainStatus
    var enableAutoSubDomain: EnableAutoSubDomain
    var statusReason: StatusReason
    var subDomains: SubDomains
    var autoSubDomainCreationPatterns: js.UndefOr[AutoSubDomainCreationPatterns]
    var autoSubDomainIAMRole: js.UndefOr[AutoSubDomainIAMRole]
    var certificateVerificationDNSRecord: js.UndefOr[CertificateVerificationDNSRecord]
  }

  object DomainAssociation {
    @inline
    def apply(
        domainAssociationArn: DomainAssociationArn,
        domainName: DomainName,
        domainStatus: DomainStatus,
        enableAutoSubDomain: EnableAutoSubDomain,
        statusReason: StatusReason,
        subDomains: SubDomains,
        autoSubDomainCreationPatterns: js.UndefOr[AutoSubDomainCreationPatterns] = js.undefined,
        autoSubDomainIAMRole: js.UndefOr[AutoSubDomainIAMRole] = js.undefined,
        certificateVerificationDNSRecord: js.UndefOr[CertificateVerificationDNSRecord] = js.undefined
    ): DomainAssociation = {
      val __obj = js.Dynamic.literal(
        "domainAssociationArn" -> domainAssociationArn.asInstanceOf[js.Any],
        "domainName" -> domainName.asInstanceOf[js.Any],
        "domainStatus" -> domainStatus.asInstanceOf[js.Any],
        "enableAutoSubDomain" -> enableAutoSubDomain.asInstanceOf[js.Any],
        "statusReason" -> statusReason.asInstanceOf[js.Any],
        "subDomains" -> subDomains.asInstanceOf[js.Any]
      )

      autoSubDomainCreationPatterns.foreach(__v => __obj.updateDynamic("autoSubDomainCreationPatterns")(__v.asInstanceOf[js.Any]))
      autoSubDomainIAMRole.foreach(__v => __obj.updateDynamic("autoSubDomainIAMRole")(__v.asInstanceOf[js.Any]))
      certificateVerificationDNSRecord.foreach(__v => __obj.updateDynamic("certificateVerificationDNSRecord")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainAssociation]
    }
  }

  @js.native
  sealed trait DomainStatus extends js.Any
  object DomainStatus {
    val PENDING_VERIFICATION = "PENDING_VERIFICATION".asInstanceOf[DomainStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[DomainStatus]
    val AVAILABLE = "AVAILABLE".asInstanceOf[DomainStatus]
    val PENDING_DEPLOYMENT = "PENDING_DEPLOYMENT".asInstanceOf[DomainStatus]
    val FAILED = "FAILED".asInstanceOf[DomainStatus]
    val CREATING = "CREATING".asInstanceOf[DomainStatus]
    val REQUESTING_CERTIFICATE = "REQUESTING_CERTIFICATE".asInstanceOf[DomainStatus]
    val UPDATING = "UPDATING".asInstanceOf[DomainStatus]

    @inline def values = js.Array(PENDING_VERIFICATION, IN_PROGRESS, AVAILABLE, PENDING_DEPLOYMENT, FAILED, CREATING, REQUESTING_CERTIFICATE, UPDATING)
  }

  /** The request structure for the generate access logs request.
    */
  @js.native
  trait GenerateAccessLogsRequest extends js.Object {
    var appId: AppId
    var domainName: DomainName
    var endTime: js.UndefOr[EndTime]
    var startTime: js.UndefOr[StartTime]
  }

  object GenerateAccessLogsRequest {
    @inline
    def apply(
        appId: AppId,
        domainName: DomainName,
        endTime: js.UndefOr[EndTime] = js.undefined,
        startTime: js.UndefOr[StartTime] = js.undefined
    ): GenerateAccessLogsRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "domainName" -> domainName.asInstanceOf[js.Any]
      )

      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateAccessLogsRequest]
    }
  }

  /** The result structure for the generate access logs request.
    */
  @js.native
  trait GenerateAccessLogsResult extends js.Object {
    var logUrl: js.UndefOr[LogUrl]
  }

  object GenerateAccessLogsResult {
    @inline
    def apply(
        logUrl: js.UndefOr[LogUrl] = js.undefined
    ): GenerateAccessLogsResult = {
      val __obj = js.Dynamic.literal()
      logUrl.foreach(__v => __obj.updateDynamic("logUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateAccessLogsResult]
    }
  }

  /** The request structure for the get app request.
    */
  @js.native
  trait GetAppRequest extends js.Object {
    var appId: AppId
  }

  object GetAppRequest {
    @inline
    def apply(
        appId: AppId
    ): GetAppRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAppRequest]
    }
  }

  @js.native
  trait GetAppResult extends js.Object {
    var app: App
  }

  object GetAppResult {
    @inline
    def apply(
        app: App
    ): GetAppResult = {
      val __obj = js.Dynamic.literal(
        "app" -> app.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAppResult]
    }
  }

  /** Returns the request structure for the get artifact request.
    */
  @js.native
  trait GetArtifactUrlRequest extends js.Object {
    var artifactId: ArtifactId
  }

  object GetArtifactUrlRequest {
    @inline
    def apply(
        artifactId: ArtifactId
    ): GetArtifactUrlRequest = {
      val __obj = js.Dynamic.literal(
        "artifactId" -> artifactId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetArtifactUrlRequest]
    }
  }

  /** Returns the result structure for the get artifact request.
    */
  @js.native
  trait GetArtifactUrlResult extends js.Object {
    var artifactId: ArtifactId
    var artifactUrl: ArtifactUrl
  }

  object GetArtifactUrlResult {
    @inline
    def apply(
        artifactId: ArtifactId,
        artifactUrl: ArtifactUrl
    ): GetArtifactUrlResult = {
      val __obj = js.Dynamic.literal(
        "artifactId" -> artifactId.asInstanceOf[js.Any],
        "artifactUrl" -> artifactUrl.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetArtifactUrlResult]
    }
  }

  /** The request structure for the get backend environment request.
    */
  @js.native
  trait GetBackendEnvironmentRequest extends js.Object {
    var appId: AppId
    var environmentName: EnvironmentName
  }

  object GetBackendEnvironmentRequest {
    @inline
    def apply(
        appId: AppId,
        environmentName: EnvironmentName
    ): GetBackendEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetBackendEnvironmentRequest]
    }
  }

  /** The result structure for the get backend environment result.
    */
  @js.native
  trait GetBackendEnvironmentResult extends js.Object {
    var backendEnvironment: BackendEnvironment
  }

  object GetBackendEnvironmentResult {
    @inline
    def apply(
        backendEnvironment: BackendEnvironment
    ): GetBackendEnvironmentResult = {
      val __obj = js.Dynamic.literal(
        "backendEnvironment" -> backendEnvironment.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetBackendEnvironmentResult]
    }
  }

  /** The request structure for the get branch request.
    */
  @js.native
  trait GetBranchRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
  }

  object GetBranchRequest {
    @inline
    def apply(
        appId: AppId,
        branchName: BranchName
    ): GetBranchRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetBranchRequest]
    }
  }

  @js.native
  trait GetBranchResult extends js.Object {
    var branch: Branch
  }

  object GetBranchResult {
    @inline
    def apply(
        branch: Branch
    ): GetBranchResult = {
      val __obj = js.Dynamic.literal(
        "branch" -> branch.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetBranchResult]
    }
  }

  /** The request structure for the get domain association request.
    */
  @js.native
  trait GetDomainAssociationRequest extends js.Object {
    var appId: AppId
    var domainName: DomainName
  }

  object GetDomainAssociationRequest {
    @inline
    def apply(
        appId: AppId,
        domainName: DomainName
    ): GetDomainAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "domainName" -> domainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDomainAssociationRequest]
    }
  }

  /** The result structure for the get domain association request.
    */
  @js.native
  trait GetDomainAssociationResult extends js.Object {
    var domainAssociation: DomainAssociation
  }

  object GetDomainAssociationResult {
    @inline
    def apply(
        domainAssociation: DomainAssociation
    ): GetDomainAssociationResult = {
      val __obj = js.Dynamic.literal(
        "domainAssociation" -> domainAssociation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDomainAssociationResult]
    }
  }

  /** The request structure for the get job request.
    */
  @js.native
  trait GetJobRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var jobId: JobId
  }

  object GetJobRequest {
    @inline
    def apply(
        appId: AppId,
        branchName: BranchName,
        jobId: JobId
    ): GetJobRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any],
        "jobId" -> jobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetJobRequest]
    }
  }

  @js.native
  trait GetJobResult extends js.Object {
    var job: Job
  }

  object GetJobResult {
    @inline
    def apply(
        job: Job
    ): GetJobResult = {
      val __obj = js.Dynamic.literal(
        "job" -> job.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetJobResult]
    }
  }

  /** The request structure for the get webhook request.
    */
  @js.native
  trait GetWebhookRequest extends js.Object {
    var webhookId: WebhookId
  }

  object GetWebhookRequest {
    @inline
    def apply(
        webhookId: WebhookId
    ): GetWebhookRequest = {
      val __obj = js.Dynamic.literal(
        "webhookId" -> webhookId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWebhookRequest]
    }
  }

  /** The result structure for the get webhook request.
    */
  @js.native
  trait GetWebhookResult extends js.Object {
    var webhook: Webhook
  }

  object GetWebhookResult {
    @inline
    def apply(
        webhook: Webhook
    ): GetWebhookResult = {
      val __obj = js.Dynamic.literal(
        "webhook" -> webhook.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWebhookResult]
    }
  }

  /** Describes an execution job for an Amplify app.
    */
  @js.native
  trait Job extends js.Object {
    var steps: Steps
    var summary: JobSummary
  }

  object Job {
    @inline
    def apply(
        steps: Steps,
        summary: JobSummary
    ): Job = {
      val __obj = js.Dynamic.literal(
        "steps" -> steps.asInstanceOf[js.Any],
        "summary" -> summary.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Job]
    }
  }

  @js.native
  sealed trait JobStatus extends js.Any
  object JobStatus {
    val PENDING = "PENDING".asInstanceOf[JobStatus]
    val PROVISIONING = "PROVISIONING".asInstanceOf[JobStatus]
    val RUNNING = "RUNNING".asInstanceOf[JobStatus]
    val FAILED = "FAILED".asInstanceOf[JobStatus]
    val SUCCEED = "SUCCEED".asInstanceOf[JobStatus]
    val CANCELLING = "CANCELLING".asInstanceOf[JobStatus]
    val CANCELLED = "CANCELLED".asInstanceOf[JobStatus]

    @inline def values = js.Array(PENDING, PROVISIONING, RUNNING, FAILED, SUCCEED, CANCELLING, CANCELLED)
  }

  /** Describes the summary for an execution job for an Amplify app.
    */
  @js.native
  trait JobSummary extends js.Object {
    var commitId: CommitId
    var commitMessage: CommitMessage
    var commitTime: CommitTime
    var jobArn: JobArn
    var jobId: JobId
    var jobType: JobType
    var startTime: StartTime
    var status: JobStatus
    var endTime: js.UndefOr[EndTime]
  }

  object JobSummary {
    @inline
    def apply(
        commitId: CommitId,
        commitMessage: CommitMessage,
        commitTime: CommitTime,
        jobArn: JobArn,
        jobId: JobId,
        jobType: JobType,
        startTime: StartTime,
        status: JobStatus,
        endTime: js.UndefOr[EndTime] = js.undefined
    ): JobSummary = {
      val __obj = js.Dynamic.literal(
        "commitId" -> commitId.asInstanceOf[js.Any],
        "commitMessage" -> commitMessage.asInstanceOf[js.Any],
        "commitTime" -> commitTime.asInstanceOf[js.Any],
        "jobArn" -> jobArn.asInstanceOf[js.Any],
        "jobId" -> jobId.asInstanceOf[js.Any],
        "jobType" -> jobType.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobSummary]
    }
  }

  @js.native
  sealed trait JobType extends js.Any
  object JobType {
    val RELEASE = "RELEASE".asInstanceOf[JobType]
    val RETRY = "RETRY".asInstanceOf[JobType]
    val MANUAL = "MANUAL".asInstanceOf[JobType]
    val WEB_HOOK = "WEB_HOOK".asInstanceOf[JobType]

    @inline def values = js.Array(RELEASE, RETRY, MANUAL, WEB_HOOK)
  }

  /** The request structure for the list apps request.
    */
  @js.native
  trait ListAppsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppsRequest]
    }
  }

  /** The result structure for an Amplify app list request.
    */
  @js.native
  trait ListAppsResult extends js.Object {
    var apps: Apps
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppsResult {
    @inline
    def apply(
        apps: Apps,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppsResult = {
      val __obj = js.Dynamic.literal(
        "apps" -> apps.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppsResult]
    }
  }

  /** Describes the request structure for the list artifacts request.
    */
  @js.native
  trait ListArtifactsRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var jobId: JobId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListArtifactsRequest {
    @inline
    def apply(
        appId: AppId,
        branchName: BranchName,
        jobId: JobId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListArtifactsRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any],
        "jobId" -> jobId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListArtifactsRequest]
    }
  }

  /** The result structure for the list artifacts request.
    */
  @js.native
  trait ListArtifactsResult extends js.Object {
    var artifacts: Artifacts
    var nextToken: js.UndefOr[NextToken]
  }

  object ListArtifactsResult {
    @inline
    def apply(
        artifacts: Artifacts,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListArtifactsResult = {
      val __obj = js.Dynamic.literal(
        "artifacts" -> artifacts.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListArtifactsResult]
    }
  }

  /** The request structure for the list backend environments request.
    */
  @js.native
  trait ListBackendEnvironmentsRequest extends js.Object {
    var appId: AppId
    var environmentName: js.UndefOr[EnvironmentName]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBackendEnvironmentsRequest {
    @inline
    def apply(
        appId: AppId,
        environmentName: js.UndefOr[EnvironmentName] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBackendEnvironmentsRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any]
      )

      environmentName.foreach(__v => __obj.updateDynamic("environmentName")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBackendEnvironmentsRequest]
    }
  }

  /** The result structure for the list backend environments result.
    */
  @js.native
  trait ListBackendEnvironmentsResult extends js.Object {
    var backendEnvironments: BackendEnvironments
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBackendEnvironmentsResult {
    @inline
    def apply(
        backendEnvironments: BackendEnvironments,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBackendEnvironmentsResult = {
      val __obj = js.Dynamic.literal(
        "backendEnvironments" -> backendEnvironments.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBackendEnvironmentsResult]
    }
  }

  /** The request structure for the list branches request.
    */
  @js.native
  trait ListBranchesRequest extends js.Object {
    var appId: AppId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBranchesRequest {
    @inline
    def apply(
        appId: AppId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBranchesRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBranchesRequest]
    }
  }

  /** The result structure for the list branches request.
    */
  @js.native
  trait ListBranchesResult extends js.Object {
    var branches: Branches
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBranchesResult {
    @inline
    def apply(
        branches: Branches,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBranchesResult = {
      val __obj = js.Dynamic.literal(
        "branches" -> branches.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBranchesResult]
    }
  }

  /** The request structure for the list domain associations request.
    */
  @js.native
  trait ListDomainAssociationsRequest extends js.Object {
    var appId: AppId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDomainAssociationsRequest {
    @inline
    def apply(
        appId: AppId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDomainAssociationsRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainAssociationsRequest]
    }
  }

  /** The result structure for the list domain association request.
    */
  @js.native
  trait ListDomainAssociationsResult extends js.Object {
    var domainAssociations: DomainAssociations
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDomainAssociationsResult {
    @inline
    def apply(
        domainAssociations: DomainAssociations,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDomainAssociationsResult = {
      val __obj = js.Dynamic.literal(
        "domainAssociations" -> domainAssociations.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainAssociationsResult]
    }
  }

  /** The request structure for the list jobs request.
    */
  @js.native
  trait ListJobsRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListJobsRequest {
    @inline
    def apply(
        appId: AppId,
        branchName: BranchName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListJobsRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsRequest]
    }
  }

  /** The maximum number of records to list in a single response.
    */
  @js.native
  trait ListJobsResult extends js.Object {
    var jobSummaries: JobSummaries
    var nextToken: js.UndefOr[NextToken]
  }

  object ListJobsResult {
    @inline
    def apply(
        jobSummaries: JobSummaries,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListJobsResult = {
      val __obj = js.Dynamic.literal(
        "jobSummaries" -> jobSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsResult]
    }
  }

  /** The request structure to use to list tags for a resource.
    */
  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  /** The response for the list tags for resource request.
    */
  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** The request structure for the list webhooks request.
    */
  @js.native
  trait ListWebhooksRequest extends js.Object {
    var appId: AppId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListWebhooksRequest {
    @inline
    def apply(
        appId: AppId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListWebhooksRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWebhooksRequest]
    }
  }

  /** The result structure for the list webhooks request.
    */
  @js.native
  trait ListWebhooksResult extends js.Object {
    var webhooks: Webhooks
    var nextToken: js.UndefOr[NextToken]
  }

  object ListWebhooksResult {
    @inline
    def apply(
        webhooks: Webhooks,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListWebhooksResult = {
      val __obj = js.Dynamic.literal(
        "webhooks" -> webhooks.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWebhooksResult]
    }
  }

  @js.native
  sealed trait Platform extends js.Any
  object Platform {
    val WEB = "WEB".asInstanceOf[Platform]

    @inline def values = js.Array(WEB)
  }

  /** Describes the information about a production branch for an Amplify app.
    */
  @js.native
  trait ProductionBranch extends js.Object {
    var branchName: js.UndefOr[BranchName]
    var lastDeployTime: js.UndefOr[LastDeployTime]
    var status: js.UndefOr[Status]
    var thumbnailUrl: js.UndefOr[ThumbnailUrl]
  }

  object ProductionBranch {
    @inline
    def apply(
        branchName: js.UndefOr[BranchName] = js.undefined,
        lastDeployTime: js.UndefOr[LastDeployTime] = js.undefined,
        status: js.UndefOr[Status] = js.undefined,
        thumbnailUrl: js.UndefOr[ThumbnailUrl] = js.undefined
    ): ProductionBranch = {
      val __obj = js.Dynamic.literal()
      branchName.foreach(__v => __obj.updateDynamic("branchName")(__v.asInstanceOf[js.Any]))
      lastDeployTime.foreach(__v => __obj.updateDynamic("lastDeployTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      thumbnailUrl.foreach(__v => __obj.updateDynamic("thumbnailUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProductionBranch]
    }
  }

  @js.native
  sealed trait Stage extends js.Any
  object Stage {
    val PRODUCTION = "PRODUCTION".asInstanceOf[Stage]
    val BETA = "BETA".asInstanceOf[Stage]
    val DEVELOPMENT = "DEVELOPMENT".asInstanceOf[Stage]
    val EXPERIMENTAL = "EXPERIMENTAL".asInstanceOf[Stage]
    val PULL_REQUEST = "PULL_REQUEST".asInstanceOf[Stage]

    @inline def values = js.Array(PRODUCTION, BETA, DEVELOPMENT, EXPERIMENTAL, PULL_REQUEST)
  }

  /** The request structure for the start a deployment request.
    */
  @js.native
  trait StartDeploymentRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var jobId: js.UndefOr[JobId]
    var sourceUrl: js.UndefOr[SourceUrl]
  }

  object StartDeploymentRequest {
    @inline
    def apply(
        appId: AppId,
        branchName: BranchName,
        jobId: js.UndefOr[JobId] = js.undefined,
        sourceUrl: js.UndefOr[SourceUrl] = js.undefined
    ): StartDeploymentRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any]
      )

      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      sourceUrl.foreach(__v => __obj.updateDynamic("sourceUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDeploymentRequest]
    }
  }

  /** The result structure for the start a deployment request.
    */
  @js.native
  trait StartDeploymentResult extends js.Object {
    var jobSummary: JobSummary
  }

  object StartDeploymentResult {
    @inline
    def apply(
        jobSummary: JobSummary
    ): StartDeploymentResult = {
      val __obj = js.Dynamic.literal(
        "jobSummary" -> jobSummary.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartDeploymentResult]
    }
  }

  /** The request structure for the start job request.
    */
  @js.native
  trait StartJobRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var jobType: JobType
    var commitId: js.UndefOr[CommitId]
    var commitMessage: js.UndefOr[CommitMessage]
    var commitTime: js.UndefOr[CommitTime]
    var jobId: js.UndefOr[JobId]
    var jobReason: js.UndefOr[JobReason]
  }

  object StartJobRequest {
    @inline
    def apply(
        appId: AppId,
        branchName: BranchName,
        jobType: JobType,
        commitId: js.UndefOr[CommitId] = js.undefined,
        commitMessage: js.UndefOr[CommitMessage] = js.undefined,
        commitTime: js.UndefOr[CommitTime] = js.undefined,
        jobId: js.UndefOr[JobId] = js.undefined,
        jobReason: js.UndefOr[JobReason] = js.undefined
    ): StartJobRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any],
        "jobType" -> jobType.asInstanceOf[js.Any]
      )

      commitId.foreach(__v => __obj.updateDynamic("commitId")(__v.asInstanceOf[js.Any]))
      commitMessage.foreach(__v => __obj.updateDynamic("commitMessage")(__v.asInstanceOf[js.Any]))
      commitTime.foreach(__v => __obj.updateDynamic("commitTime")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      jobReason.foreach(__v => __obj.updateDynamic("jobReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartJobRequest]
    }
  }

  /** The result structure for the run job request.
    */
  @js.native
  trait StartJobResult extends js.Object {
    var jobSummary: JobSummary
  }

  object StartJobResult {
    @inline
    def apply(
        jobSummary: JobSummary
    ): StartJobResult = {
      val __obj = js.Dynamic.literal(
        "jobSummary" -> jobSummary.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartJobResult]
    }
  }

  /** Describes an execution step, for an execution job, for an Amplify app.
    */
  @js.native
  trait Step extends js.Object {
    var endTime: EndTime
    var startTime: StartTime
    var status: JobStatus
    var stepName: StepName
    var artifactsUrl: js.UndefOr[ArtifactsUrl]
    var context: js.UndefOr[Context]
    var logUrl: js.UndefOr[LogUrl]
    var screenshots: js.UndefOr[Screenshots]
    var statusReason: js.UndefOr[StatusReason]
    var testArtifactsUrl: js.UndefOr[TestArtifactsUrl]
    var testConfigUrl: js.UndefOr[TestConfigUrl]
  }

  object Step {
    @inline
    def apply(
        endTime: EndTime,
        startTime: StartTime,
        status: JobStatus,
        stepName: StepName,
        artifactsUrl: js.UndefOr[ArtifactsUrl] = js.undefined,
        context: js.UndefOr[Context] = js.undefined,
        logUrl: js.UndefOr[LogUrl] = js.undefined,
        screenshots: js.UndefOr[Screenshots] = js.undefined,
        statusReason: js.UndefOr[StatusReason] = js.undefined,
        testArtifactsUrl: js.UndefOr[TestArtifactsUrl] = js.undefined,
        testConfigUrl: js.UndefOr[TestConfigUrl] = js.undefined
    ): Step = {
      val __obj = js.Dynamic.literal(
        "endTime" -> endTime.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "stepName" -> stepName.asInstanceOf[js.Any]
      )

      artifactsUrl.foreach(__v => __obj.updateDynamic("artifactsUrl")(__v.asInstanceOf[js.Any]))
      context.foreach(__v => __obj.updateDynamic("context")(__v.asInstanceOf[js.Any]))
      logUrl.foreach(__v => __obj.updateDynamic("logUrl")(__v.asInstanceOf[js.Any]))
      screenshots.foreach(__v => __obj.updateDynamic("screenshots")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      testArtifactsUrl.foreach(__v => __obj.updateDynamic("testArtifactsUrl")(__v.asInstanceOf[js.Any]))
      testConfigUrl.foreach(__v => __obj.updateDynamic("testConfigUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Step]
    }
  }

  /** The request structure for the stop job request.
    */
  @js.native
  trait StopJobRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var jobId: JobId
  }

  object StopJobRequest {
    @inline
    def apply(
        appId: AppId,
        branchName: BranchName,
        jobId: JobId
    ): StopJobRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any],
        "jobId" -> jobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopJobRequest]
    }
  }

  /** The result structure for the stop job request.
    */
  @js.native
  trait StopJobResult extends js.Object {
    var jobSummary: JobSummary
  }

  object StopJobResult {
    @inline
    def apply(
        jobSummary: JobSummary
    ): StopJobResult = {
      val __obj = js.Dynamic.literal(
        "jobSummary" -> jobSummary.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopJobResult]
    }
  }

  /** The subdomain for the domain association.
    */
  @js.native
  trait SubDomain extends js.Object {
    var dnsRecord: DNSRecord
    var subDomainSetting: SubDomainSetting
    var verified: Verified
  }

  object SubDomain {
    @inline
    def apply(
        dnsRecord: DNSRecord,
        subDomainSetting: SubDomainSetting,
        verified: Verified
    ): SubDomain = {
      val __obj = js.Dynamic.literal(
        "dnsRecord" -> dnsRecord.asInstanceOf[js.Any],
        "subDomainSetting" -> subDomainSetting.asInstanceOf[js.Any],
        "verified" -> verified.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SubDomain]
    }
  }

  /** Describes the settings for the subdomain.
    */
  @js.native
  trait SubDomainSetting extends js.Object {
    var branchName: BranchName
    var prefix: DomainPrefix
  }

  object SubDomainSetting {
    @inline
    def apply(
        branchName: BranchName,
        prefix: DomainPrefix
    ): SubDomainSetting = {
      val __obj = js.Dynamic.literal(
        "branchName" -> branchName.asInstanceOf[js.Any],
        "prefix" -> prefix.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SubDomainSetting]
    }
  }

  /** The request structure to tag a resource with a tag key and value.
    */
  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  /** The response for the tag resource request.
    */
  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** The request structure for the untag resource request.
    */
  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  /** The response for the untag resource request.
    */
  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  /** The request structure for the update app request.
    */
  @js.native
  trait UpdateAppRequest extends js.Object {
    var appId: AppId
    var accessToken: js.UndefOr[AccessToken]
    var autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig]
    var autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns]
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var customHeaders: js.UndefOr[CustomHeaders]
    var customRules: js.UndefOr[CustomRules]
    var description: js.UndefOr[Description]
    var enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation]
    var enableBasicAuth: js.UndefOr[EnableBasicAuth]
    var enableBranchAutoBuild: js.UndefOr[EnableAutoBuild]
    var enableBranchAutoDeletion: js.UndefOr[EnableBranchAutoDeletion]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var iamServiceRoleArn: js.UndefOr[ServiceRoleArn]
    var name: js.UndefOr[Name]
    var oauthToken: js.UndefOr[OauthToken]
    var platform: js.UndefOr[Platform]
    var repository: js.UndefOr[Repository]
  }

  object UpdateAppRequest {
    @inline
    def apply(
        appId: AppId,
        accessToken: js.UndefOr[AccessToken] = js.undefined,
        autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig] = js.undefined,
        autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns] = js.undefined,
        basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
        buildSpec: js.UndefOr[BuildSpec] = js.undefined,
        customHeaders: js.UndefOr[CustomHeaders] = js.undefined,
        customRules: js.UndefOr[CustomRules] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation] = js.undefined,
        enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
        enableBranchAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined,
        enableBranchAutoDeletion: js.UndefOr[EnableBranchAutoDeletion] = js.undefined,
        environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined,
        iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        oauthToken: js.UndefOr[OauthToken] = js.undefined,
        platform: js.UndefOr[Platform] = js.undefined,
        repository: js.UndefOr[Repository] = js.undefined
    ): UpdateAppRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any]
      )

      accessToken.foreach(__v => __obj.updateDynamic("accessToken")(__v.asInstanceOf[js.Any]))
      autoBranchCreationConfig.foreach(__v => __obj.updateDynamic("autoBranchCreationConfig")(__v.asInstanceOf[js.Any]))
      autoBranchCreationPatterns.foreach(__v => __obj.updateDynamic("autoBranchCreationPatterns")(__v.asInstanceOf[js.Any]))
      basicAuthCredentials.foreach(__v => __obj.updateDynamic("basicAuthCredentials")(__v.asInstanceOf[js.Any]))
      buildSpec.foreach(__v => __obj.updateDynamic("buildSpec")(__v.asInstanceOf[js.Any]))
      customHeaders.foreach(__v => __obj.updateDynamic("customHeaders")(__v.asInstanceOf[js.Any]))
      customRules.foreach(__v => __obj.updateDynamic("customRules")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      enableAutoBranchCreation.foreach(__v => __obj.updateDynamic("enableAutoBranchCreation")(__v.asInstanceOf[js.Any]))
      enableBasicAuth.foreach(__v => __obj.updateDynamic("enableBasicAuth")(__v.asInstanceOf[js.Any]))
      enableBranchAutoBuild.foreach(__v => __obj.updateDynamic("enableBranchAutoBuild")(__v.asInstanceOf[js.Any]))
      enableBranchAutoDeletion.foreach(__v => __obj.updateDynamic("enableBranchAutoDeletion")(__v.asInstanceOf[js.Any]))
      environmentVariables.foreach(__v => __obj.updateDynamic("environmentVariables")(__v.asInstanceOf[js.Any]))
      iamServiceRoleArn.foreach(__v => __obj.updateDynamic("iamServiceRoleArn")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      oauthToken.foreach(__v => __obj.updateDynamic("oauthToken")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      repository.foreach(__v => __obj.updateDynamic("repository")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAppRequest]
    }
  }

  /** The result structure for an Amplify app update request.
    */
  @js.native
  trait UpdateAppResult extends js.Object {
    var app: App
  }

  object UpdateAppResult {
    @inline
    def apply(
        app: App
    ): UpdateAppResult = {
      val __obj = js.Dynamic.literal(
        "app" -> app.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateAppResult]
    }
  }

  /** The request structure for the update branch request.
    */
  @js.native
  trait UpdateBranchRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var backendEnvironmentArn: js.UndefOr[BackendEnvironmentArn]
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var description: js.UndefOr[Description]
    var displayName: js.UndefOr[DisplayName]
    var enableAutoBuild: js.UndefOr[EnableAutoBuild]
    var enableBasicAuth: js.UndefOr[EnableBasicAuth]
    var enableNotification: js.UndefOr[EnableNotification]
    var enablePerformanceMode: js.UndefOr[EnablePerformanceMode]
    var enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var framework: js.UndefOr[Framework]
    var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName]
    var stage: js.UndefOr[Stage]
    var ttl: js.UndefOr[TTL]
  }

  object UpdateBranchRequest {
    @inline
    def apply(
        appId: AppId,
        branchName: BranchName,
        backendEnvironmentArn: js.UndefOr[BackendEnvironmentArn] = js.undefined,
        basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
        buildSpec: js.UndefOr[BuildSpec] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        displayName: js.UndefOr[DisplayName] = js.undefined,
        enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined,
        enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
        enableNotification: js.UndefOr[EnableNotification] = js.undefined,
        enablePerformanceMode: js.UndefOr[EnablePerformanceMode] = js.undefined,
        enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview] = js.undefined,
        environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined,
        framework: js.UndefOr[Framework] = js.undefined,
        pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName] = js.undefined,
        stage: js.UndefOr[Stage] = js.undefined,
        ttl: js.UndefOr[TTL] = js.undefined
    ): UpdateBranchRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any]
      )

      backendEnvironmentArn.foreach(__v => __obj.updateDynamic("backendEnvironmentArn")(__v.asInstanceOf[js.Any]))
      basicAuthCredentials.foreach(__v => __obj.updateDynamic("basicAuthCredentials")(__v.asInstanceOf[js.Any]))
      buildSpec.foreach(__v => __obj.updateDynamic("buildSpec")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      enableAutoBuild.foreach(__v => __obj.updateDynamic("enableAutoBuild")(__v.asInstanceOf[js.Any]))
      enableBasicAuth.foreach(__v => __obj.updateDynamic("enableBasicAuth")(__v.asInstanceOf[js.Any]))
      enableNotification.foreach(__v => __obj.updateDynamic("enableNotification")(__v.asInstanceOf[js.Any]))
      enablePerformanceMode.foreach(__v => __obj.updateDynamic("enablePerformanceMode")(__v.asInstanceOf[js.Any]))
      enablePullRequestPreview.foreach(__v => __obj.updateDynamic("enablePullRequestPreview")(__v.asInstanceOf[js.Any]))
      environmentVariables.foreach(__v => __obj.updateDynamic("environmentVariables")(__v.asInstanceOf[js.Any]))
      framework.foreach(__v => __obj.updateDynamic("framework")(__v.asInstanceOf[js.Any]))
      pullRequestEnvironmentName.foreach(__v => __obj.updateDynamic("pullRequestEnvironmentName")(__v.asInstanceOf[js.Any]))
      stage.foreach(__v => __obj.updateDynamic("stage")(__v.asInstanceOf[js.Any]))
      ttl.foreach(__v => __obj.updateDynamic("ttl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBranchRequest]
    }
  }

  /** The result structure for the update branch request.
    */
  @js.native
  trait UpdateBranchResult extends js.Object {
    var branch: Branch
  }

  object UpdateBranchResult {
    @inline
    def apply(
        branch: Branch
    ): UpdateBranchResult = {
      val __obj = js.Dynamic.literal(
        "branch" -> branch.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateBranchResult]
    }
  }

  /** The request structure for the update domain association request.
    */
  @js.native
  trait UpdateDomainAssociationRequest extends js.Object {
    var appId: AppId
    var domainName: DomainName
    var subDomainSettings: SubDomainSettings
    var autoSubDomainCreationPatterns: js.UndefOr[AutoSubDomainCreationPatterns]
    var autoSubDomainIAMRole: js.UndefOr[AutoSubDomainIAMRole]
    var enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain]
  }

  object UpdateDomainAssociationRequest {
    @inline
    def apply(
        appId: AppId,
        domainName: DomainName,
        subDomainSettings: SubDomainSettings,
        autoSubDomainCreationPatterns: js.UndefOr[AutoSubDomainCreationPatterns] = js.undefined,
        autoSubDomainIAMRole: js.UndefOr[AutoSubDomainIAMRole] = js.undefined,
        enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain] = js.undefined
    ): UpdateDomainAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "domainName" -> domainName.asInstanceOf[js.Any],
        "subDomainSettings" -> subDomainSettings.asInstanceOf[js.Any]
      )

      autoSubDomainCreationPatterns.foreach(__v => __obj.updateDynamic("autoSubDomainCreationPatterns")(__v.asInstanceOf[js.Any]))
      autoSubDomainIAMRole.foreach(__v => __obj.updateDynamic("autoSubDomainIAMRole")(__v.asInstanceOf[js.Any]))
      enableAutoSubDomain.foreach(__v => __obj.updateDynamic("enableAutoSubDomain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainAssociationRequest]
    }
  }

  /** The result structure for the update domain association request.
    */
  @js.native
  trait UpdateDomainAssociationResult extends js.Object {
    var domainAssociation: DomainAssociation
  }

  object UpdateDomainAssociationResult {
    @inline
    def apply(
        domainAssociation: DomainAssociation
    ): UpdateDomainAssociationResult = {
      val __obj = js.Dynamic.literal(
        "domainAssociation" -> domainAssociation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDomainAssociationResult]
    }
  }

  /** The request structure for the update webhook request.
    */
  @js.native
  trait UpdateWebhookRequest extends js.Object {
    var webhookId: WebhookId
    var branchName: js.UndefOr[BranchName]
    var description: js.UndefOr[Description]
  }

  object UpdateWebhookRequest {
    @inline
    def apply(
        webhookId: WebhookId,
        branchName: js.UndefOr[BranchName] = js.undefined,
        description: js.UndefOr[Description] = js.undefined
    ): UpdateWebhookRequest = {
      val __obj = js.Dynamic.literal(
        "webhookId" -> webhookId.asInstanceOf[js.Any]
      )

      branchName.foreach(__v => __obj.updateDynamic("branchName")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWebhookRequest]
    }
  }

  /** The result structure for the update webhook request.
    */
  @js.native
  trait UpdateWebhookResult extends js.Object {
    var webhook: Webhook
  }

  object UpdateWebhookResult {
    @inline
    def apply(
        webhook: Webhook
    ): UpdateWebhookResult = {
      val __obj = js.Dynamic.literal(
        "webhook" -> webhook.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateWebhookResult]
    }
  }

  /** Describes a webhook that connects repository events to an Amplify app.
    */
  @js.native
  trait Webhook extends js.Object {
    var branchName: BranchName
    var createTime: CreateTime
    var description: Description
    var updateTime: UpdateTime
    var webhookArn: WebhookArn
    var webhookId: WebhookId
    var webhookUrl: WebhookUrl
  }

  object Webhook {
    @inline
    def apply(
        branchName: BranchName,
        createTime: CreateTime,
        description: Description,
        updateTime: UpdateTime,
        webhookArn: WebhookArn,
        webhookId: WebhookId,
        webhookUrl: WebhookUrl
    ): Webhook = {
      val __obj = js.Dynamic.literal(
        "branchName" -> branchName.asInstanceOf[js.Any],
        "createTime" -> createTime.asInstanceOf[js.Any],
        "description" -> description.asInstanceOf[js.Any],
        "updateTime" -> updateTime.asInstanceOf[js.Any],
        "webhookArn" -> webhookArn.asInstanceOf[js.Any],
        "webhookId" -> webhookId.asInstanceOf[js.Any],
        "webhookUrl" -> webhookUrl.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Webhook]
    }
  }
}
