package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object opsworks {
  type AgentVersions                        = js.Array[AgentVersion]
  type AppAttributes                        = js.Dictionary[String]
  type AppAttributesKeys                    = String
  type AppType                              = String
  type Apps                                 = js.Array[App]
  type Architecture                         = String
  type AutoScalingType                      = String
  type BlockDeviceMappings                  = js.Array[BlockDeviceMapping]
  type CloudWatchLogsEncoding               = String
  type CloudWatchLogsInitialPosition        = String
  type CloudWatchLogsLogStreams             = js.Array[CloudWatchLogsLogStream]
  type CloudWatchLogsTimeZone               = String
  type Commands                             = js.Array[Command]
  type DailyAutoScalingSchedule             = js.Dictionary[Switch]
  type DataSources                          = js.Array[DataSource]
  type DateTime                             = String
  type DeploymentCommandArgs                = js.Dictionary[Strings]
  type DeploymentCommandName                = String
  type Deployments                          = js.Array[Deployment]
  type EcsClusters                          = js.Array[EcsCluster]
  type ElasticIps                           = js.Array[ElasticIp]
  type ElasticLoadBalancers                 = js.Array[ElasticLoadBalancer]
  type EnvironmentVariables                 = js.Array[EnvironmentVariable]
  type Hour                                 = String
  type Instances                            = js.Array[Instance]
  type LayerAttributes                      = js.Dictionary[String]
  type LayerAttributesKeys                  = String
  type LayerType                            = String
  type Layers                               = js.Array[Layer]
  type LoadBasedAutoScalingConfigurations   = js.Array[LoadBasedAutoScalingConfiguration]
  type MaxResults                           = Int
  type Minute                               = Int
  type NextToken                            = String
  type OperatingSystemConfigurationManagers = js.Array[OperatingSystemConfigurationManager]
  type OperatingSystems                     = js.Array[OperatingSystem]
  type Parameters                           = js.Dictionary[String]
  type Permissions                          = js.Array[Permission]
  type RaidArrays                           = js.Array[RaidArray]
  type RdsDbInstances                       = js.Array[RdsDbInstance]
  type ResourceArn                          = String
  type RootDeviceType                       = String
  type ServiceErrors                        = js.Array[ServiceError]
  type SourceType                           = String
  type StackAttributes                      = js.Dictionary[String]
  type StackAttributesKeys                  = String
  type Stacks                               = js.Array[Stack]
  type Strings                              = js.Array[String]
  type Switch                               = String
  type TagKey                               = String
  type TagKeys                              = js.Array[TagKey]
  type TagValue                             = String
  type Tags                                 = js.Dictionary[TagValue]
  type TimeBasedAutoScalingConfigurations   = js.Array[TimeBasedAutoScalingConfiguration]
  type UserProfiles                         = js.Array[UserProfile]
  type ValidForInMinutes                    = Int
  type VirtualizationType                   = String
  type VolumeConfigurations                 = js.Array[VolumeConfiguration]
  type VolumeType                           = String
  type Volumes                              = js.Array[Volume]

  implicit final class OpsWorksOps(private val service: OpsWorks) extends AnyVal {

    def assignInstanceFuture(params: AssignInstanceRequest): Future[js.Object] =
      service.assignInstance(params).promise.toFuture
    def assignVolumeFuture(params: AssignVolumeRequest): Future[js.Object] =
      service.assignVolume(params).promise.toFuture
    def associateElasticIpFuture(params: AssociateElasticIpRequest): Future[js.Object] =
      service.associateElasticIp(params).promise.toFuture
    def attachElasticLoadBalancerFuture(params: AttachElasticLoadBalancerRequest): Future[js.Object] =
      service.attachElasticLoadBalancer(params).promise.toFuture
    def cloneStackFuture(params: CloneStackRequest): Future[CloneStackResult] =
      service.cloneStack(params).promise.toFuture
    def createAppFuture(params: CreateAppRequest): Future[CreateAppResult] = service.createApp(params).promise.toFuture
    def createDeploymentFuture(params: CreateDeploymentRequest): Future[CreateDeploymentResult] =
      service.createDeployment(params).promise.toFuture
    def createInstanceFuture(params: CreateInstanceRequest): Future[CreateInstanceResult] =
      service.createInstance(params).promise.toFuture
    def createLayerFuture(params: CreateLayerRequest): Future[CreateLayerResult] =
      service.createLayer(params).promise.toFuture
    def createStackFuture(params: CreateStackRequest): Future[CreateStackResult] =
      service.createStack(params).promise.toFuture
    def createUserProfileFuture(params: CreateUserProfileRequest): Future[CreateUserProfileResult] =
      service.createUserProfile(params).promise.toFuture
    def deleteAppFuture(params: DeleteAppRequest): Future[js.Object] = service.deleteApp(params).promise.toFuture
    def deleteInstanceFuture(params: DeleteInstanceRequest): Future[js.Object] =
      service.deleteInstance(params).promise.toFuture
    def deleteLayerFuture(params: DeleteLayerRequest): Future[js.Object] = service.deleteLayer(params).promise.toFuture
    def deleteStackFuture(params: DeleteStackRequest): Future[js.Object] = service.deleteStack(params).promise.toFuture
    def deleteUserProfileFuture(params: DeleteUserProfileRequest): Future[js.Object] =
      service.deleteUserProfile(params).promise.toFuture
    def deregisterEcsClusterFuture(params: DeregisterEcsClusterRequest): Future[js.Object] =
      service.deregisterEcsCluster(params).promise.toFuture
    def deregisterElasticIpFuture(params: DeregisterElasticIpRequest): Future[js.Object] =
      service.deregisterElasticIp(params).promise.toFuture
    def deregisterInstanceFuture(params: DeregisterInstanceRequest): Future[js.Object] =
      service.deregisterInstance(params).promise.toFuture
    def deregisterRdsDbInstanceFuture(params: DeregisterRdsDbInstanceRequest): Future[js.Object] =
      service.deregisterRdsDbInstance(params).promise.toFuture
    def deregisterVolumeFuture(params: DeregisterVolumeRequest): Future[js.Object] =
      service.deregisterVolume(params).promise.toFuture
    def describeAgentVersionsFuture(params: DescribeAgentVersionsRequest): Future[DescribeAgentVersionsResult] =
      service.describeAgentVersions(params).promise.toFuture
    def describeAppsFuture(params: DescribeAppsRequest): Future[DescribeAppsResult] =
      service.describeApps(params).promise.toFuture
    def describeCommandsFuture(params: DescribeCommandsRequest): Future[DescribeCommandsResult] =
      service.describeCommands(params).promise.toFuture
    def describeDeploymentsFuture(params: DescribeDeploymentsRequest): Future[DescribeDeploymentsResult] =
      service.describeDeployments(params).promise.toFuture
    def describeEcsClustersFuture(params: DescribeEcsClustersRequest): Future[DescribeEcsClustersResult] =
      service.describeEcsClusters(params).promise.toFuture
    def describeElasticIpsFuture(params: DescribeElasticIpsRequest): Future[DescribeElasticIpsResult] =
      service.describeElasticIps(params).promise.toFuture
    def describeElasticLoadBalancersFuture(
        params: DescribeElasticLoadBalancersRequest
    ): Future[DescribeElasticLoadBalancersResult] = service.describeElasticLoadBalancers(params).promise.toFuture
    def describeInstancesFuture(params: DescribeInstancesRequest): Future[DescribeInstancesResult] =
      service.describeInstances(params).promise.toFuture
    def describeLayersFuture(params: DescribeLayersRequest): Future[DescribeLayersResult] =
      service.describeLayers(params).promise.toFuture
    def describeLoadBasedAutoScalingFuture(
        params: DescribeLoadBasedAutoScalingRequest
    ): Future[DescribeLoadBasedAutoScalingResult] = service.describeLoadBasedAutoScaling(params).promise.toFuture
    def describeMyUserProfileFuture(): Future[DescribeMyUserProfileResult] =
      service.describeMyUserProfile().promise.toFuture
    def describeOperatingSystemsFuture(): Future[DescribeOperatingSystemsResponse] =
      service.describeOperatingSystems().promise.toFuture
    def describePermissionsFuture(params: DescribePermissionsRequest): Future[DescribePermissionsResult] =
      service.describePermissions(params).promise.toFuture
    def describeRaidArraysFuture(params: DescribeRaidArraysRequest): Future[DescribeRaidArraysResult] =
      service.describeRaidArrays(params).promise.toFuture
    def describeRdsDbInstancesFuture(params: DescribeRdsDbInstancesRequest): Future[DescribeRdsDbInstancesResult] =
      service.describeRdsDbInstances(params).promise.toFuture
    def describeServiceErrorsFuture(params: DescribeServiceErrorsRequest): Future[DescribeServiceErrorsResult] =
      service.describeServiceErrors(params).promise.toFuture
    def describeStackProvisioningParametersFuture(
        params: DescribeStackProvisioningParametersRequest
    ): Future[DescribeStackProvisioningParametersResult] =
      service.describeStackProvisioningParameters(params).promise.toFuture
    def describeStackSummaryFuture(params: DescribeStackSummaryRequest): Future[DescribeStackSummaryResult] =
      service.describeStackSummary(params).promise.toFuture
    def describeStacksFuture(params: DescribeStacksRequest): Future[DescribeStacksResult] =
      service.describeStacks(params).promise.toFuture
    def describeTimeBasedAutoScalingFuture(
        params: DescribeTimeBasedAutoScalingRequest
    ): Future[DescribeTimeBasedAutoScalingResult] = service.describeTimeBasedAutoScaling(params).promise.toFuture
    def describeUserProfilesFuture(params: DescribeUserProfilesRequest): Future[DescribeUserProfilesResult] =
      service.describeUserProfiles(params).promise.toFuture
    def describeVolumesFuture(params: DescribeVolumesRequest): Future[DescribeVolumesResult] =
      service.describeVolumes(params).promise.toFuture
    def detachElasticLoadBalancerFuture(params: DetachElasticLoadBalancerRequest): Future[js.Object] =
      service.detachElasticLoadBalancer(params).promise.toFuture
    def disassociateElasticIpFuture(params: DisassociateElasticIpRequest): Future[js.Object] =
      service.disassociateElasticIp(params).promise.toFuture
    def getHostnameSuggestionFuture(params: GetHostnameSuggestionRequest): Future[GetHostnameSuggestionResult] =
      service.getHostnameSuggestion(params).promise.toFuture
    def grantAccessFuture(params: GrantAccessRequest): Future[GrantAccessResult] =
      service.grantAccess(params).promise.toFuture
    def listTagsFuture(params: ListTagsRequest): Future[ListTagsResult] = service.listTags(params).promise.toFuture
    def rebootInstanceFuture(params: RebootInstanceRequest): Future[js.Object] =
      service.rebootInstance(params).promise.toFuture
    def registerEcsClusterFuture(params: RegisterEcsClusterRequest): Future[RegisterEcsClusterResult] =
      service.registerEcsCluster(params).promise.toFuture
    def registerElasticIpFuture(params: RegisterElasticIpRequest): Future[RegisterElasticIpResult] =
      service.registerElasticIp(params).promise.toFuture
    def registerInstanceFuture(params: RegisterInstanceRequest): Future[RegisterInstanceResult] =
      service.registerInstance(params).promise.toFuture
    def registerRdsDbInstanceFuture(params: RegisterRdsDbInstanceRequest): Future[js.Object] =
      service.registerRdsDbInstance(params).promise.toFuture
    def registerVolumeFuture(params: RegisterVolumeRequest): Future[RegisterVolumeResult] =
      service.registerVolume(params).promise.toFuture
    def setLoadBasedAutoScalingFuture(params: SetLoadBasedAutoScalingRequest): Future[js.Object] =
      service.setLoadBasedAutoScaling(params).promise.toFuture
    def setPermissionFuture(params: SetPermissionRequest): Future[js.Object] =
      service.setPermission(params).promise.toFuture
    def setTimeBasedAutoScalingFuture(params: SetTimeBasedAutoScalingRequest): Future[js.Object] =
      service.setTimeBasedAutoScaling(params).promise.toFuture
    def startInstanceFuture(params: StartInstanceRequest): Future[js.Object] =
      service.startInstance(params).promise.toFuture
    def startStackFuture(params: StartStackRequest): Future[js.Object] = service.startStack(params).promise.toFuture
    def stopInstanceFuture(params: StopInstanceRequest): Future[js.Object] =
      service.stopInstance(params).promise.toFuture
    def stopStackFuture(params: StopStackRequest): Future[js.Object]     = service.stopStack(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise.toFuture
    def unassignInstanceFuture(params: UnassignInstanceRequest): Future[js.Object] =
      service.unassignInstance(params).promise.toFuture
    def unassignVolumeFuture(params: UnassignVolumeRequest): Future[js.Object] =
      service.unassignVolume(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise.toFuture
    def updateAppFuture(params: UpdateAppRequest): Future[js.Object] = service.updateApp(params).promise.toFuture
    def updateElasticIpFuture(params: UpdateElasticIpRequest): Future[js.Object] =
      service.updateElasticIp(params).promise.toFuture
    def updateInstanceFuture(params: UpdateInstanceRequest): Future[js.Object] =
      service.updateInstance(params).promise.toFuture
    def updateLayerFuture(params: UpdateLayerRequest): Future[js.Object] = service.updateLayer(params).promise.toFuture
    def updateMyUserProfileFuture(params: UpdateMyUserProfileRequest): Future[js.Object] =
      service.updateMyUserProfile(params).promise.toFuture
    def updateRdsDbInstanceFuture(params: UpdateRdsDbInstanceRequest): Future[js.Object] =
      service.updateRdsDbInstance(params).promise.toFuture
    def updateStackFuture(params: UpdateStackRequest): Future[js.Object] = service.updateStack(params).promise.toFuture
    def updateUserProfileFuture(params: UpdateUserProfileRequest): Future[js.Object] =
      service.updateUserProfile(params).promise.toFuture
    def updateVolumeFuture(params: UpdateVolumeRequest): Future[js.Object] =
      service.updateVolume(params).promise.toFuture
  }
}

package opsworks {
  @js.native
  @JSImport("aws-sdk", "OpsWorks")
  class OpsWorks() extends js.Object {
    def this(config: AWSConfig) = this()

    def assignInstance(params: AssignInstanceRequest): Request[js.Object]                                 = js.native
    def assignVolume(params: AssignVolumeRequest): Request[js.Object]                                     = js.native
    def associateElasticIp(params: AssociateElasticIpRequest): Request[js.Object]                         = js.native
    def attachElasticLoadBalancer(params: AttachElasticLoadBalancerRequest): Request[js.Object]           = js.native
    def cloneStack(params: CloneStackRequest): Request[CloneStackResult]                                  = js.native
    def createApp(params: CreateAppRequest): Request[CreateAppResult]                                     = js.native
    def createDeployment(params: CreateDeploymentRequest): Request[CreateDeploymentResult]                = js.native
    def createInstance(params: CreateInstanceRequest): Request[CreateInstanceResult]                      = js.native
    def createLayer(params: CreateLayerRequest): Request[CreateLayerResult]                               = js.native
    def createStack(params: CreateStackRequest): Request[CreateStackResult]                               = js.native
    def createUserProfile(params: CreateUserProfileRequest): Request[CreateUserProfileResult]             = js.native
    def deleteApp(params: DeleteAppRequest): Request[js.Object]                                           = js.native
    def deleteInstance(params: DeleteInstanceRequest): Request[js.Object]                                 = js.native
    def deleteLayer(params: DeleteLayerRequest): Request[js.Object]                                       = js.native
    def deleteStack(params: DeleteStackRequest): Request[js.Object]                                       = js.native
    def deleteUserProfile(params: DeleteUserProfileRequest): Request[js.Object]                           = js.native
    def deregisterEcsCluster(params: DeregisterEcsClusterRequest): Request[js.Object]                     = js.native
    def deregisterElasticIp(params: DeregisterElasticIpRequest): Request[js.Object]                       = js.native
    def deregisterInstance(params: DeregisterInstanceRequest): Request[js.Object]                         = js.native
    def deregisterRdsDbInstance(params: DeregisterRdsDbInstanceRequest): Request[js.Object]               = js.native
    def deregisterVolume(params: DeregisterVolumeRequest): Request[js.Object]                             = js.native
    def describeAgentVersions(params: DescribeAgentVersionsRequest): Request[DescribeAgentVersionsResult] = js.native
    def describeApps(params: DescribeAppsRequest): Request[DescribeAppsResult]                            = js.native
    def describeCommands(params: DescribeCommandsRequest): Request[DescribeCommandsResult]                = js.native
    def describeDeployments(params: DescribeDeploymentsRequest): Request[DescribeDeploymentsResult]       = js.native
    def describeEcsClusters(params: DescribeEcsClustersRequest): Request[DescribeEcsClustersResult]       = js.native
    def describeElasticIps(params: DescribeElasticIpsRequest): Request[DescribeElasticIpsResult]          = js.native
    def describeElasticLoadBalancers(
        params: DescribeElasticLoadBalancersRequest
    ): Request[DescribeElasticLoadBalancersResult]                                            = js.native
    def describeInstances(params: DescribeInstancesRequest): Request[DescribeInstancesResult] = js.native
    def describeLayers(params: DescribeLayersRequest): Request[DescribeLayersResult]          = js.native
    def describeLoadBasedAutoScaling(
        params: DescribeLoadBasedAutoScalingRequest
    ): Request[DescribeLoadBasedAutoScalingResult]                                                           = js.native
    def describeMyUserProfile(): Request[DescribeMyUserProfileResult]                                        = js.native
    def describeOperatingSystems(): Request[DescribeOperatingSystemsResponse]                                = js.native
    def describePermissions(params: DescribePermissionsRequest): Request[DescribePermissionsResult]          = js.native
    def describeRaidArrays(params: DescribeRaidArraysRequest): Request[DescribeRaidArraysResult]             = js.native
    def describeRdsDbInstances(params: DescribeRdsDbInstancesRequest): Request[DescribeRdsDbInstancesResult] = js.native
    def describeServiceErrors(params: DescribeServiceErrorsRequest): Request[DescribeServiceErrorsResult]    = js.native
    def describeStackProvisioningParameters(
        params: DescribeStackProvisioningParametersRequest
    ): Request[DescribeStackProvisioningParametersResult]                                              = js.native
    def describeStackSummary(params: DescribeStackSummaryRequest): Request[DescribeStackSummaryResult] = js.native
    def describeStacks(params: DescribeStacksRequest): Request[DescribeStacksResult]                   = js.native
    def describeTimeBasedAutoScaling(
        params: DescribeTimeBasedAutoScalingRequest
    ): Request[DescribeTimeBasedAutoScalingResult]                                                        = js.native
    def describeUserProfiles(params: DescribeUserProfilesRequest): Request[DescribeUserProfilesResult]    = js.native
    def describeVolumes(params: DescribeVolumesRequest): Request[DescribeVolumesResult]                   = js.native
    def detachElasticLoadBalancer(params: DetachElasticLoadBalancerRequest): Request[js.Object]           = js.native
    def disassociateElasticIp(params: DisassociateElasticIpRequest): Request[js.Object]                   = js.native
    def getHostnameSuggestion(params: GetHostnameSuggestionRequest): Request[GetHostnameSuggestionResult] = js.native
    def grantAccess(params: GrantAccessRequest): Request[GrantAccessResult]                               = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResult]                                        = js.native
    def rebootInstance(params: RebootInstanceRequest): Request[js.Object]                                 = js.native
    def registerEcsCluster(params: RegisterEcsClusterRequest): Request[RegisterEcsClusterResult]          = js.native
    def registerElasticIp(params: RegisterElasticIpRequest): Request[RegisterElasticIpResult]             = js.native
    def registerInstance(params: RegisterInstanceRequest): Request[RegisterInstanceResult]                = js.native
    def registerRdsDbInstance(params: RegisterRdsDbInstanceRequest): Request[js.Object]                   = js.native
    def registerVolume(params: RegisterVolumeRequest): Request[RegisterVolumeResult]                      = js.native
    def setLoadBasedAutoScaling(params: SetLoadBasedAutoScalingRequest): Request[js.Object]               = js.native
    def setPermission(params: SetPermissionRequest): Request[js.Object]                                   = js.native
    def setTimeBasedAutoScaling(params: SetTimeBasedAutoScalingRequest): Request[js.Object]               = js.native
    def startInstance(params: StartInstanceRequest): Request[js.Object]                                   = js.native
    def startStack(params: StartStackRequest): Request[js.Object]                                         = js.native
    def stopInstance(params: StopInstanceRequest): Request[js.Object]                                     = js.native
    def stopStack(params: StopStackRequest): Request[js.Object]                                           = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                       = js.native
    def unassignInstance(params: UnassignInstanceRequest): Request[js.Object]                             = js.native
    def unassignVolume(params: UnassignVolumeRequest): Request[js.Object]                                 = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                                   = js.native
    def updateApp(params: UpdateAppRequest): Request[js.Object]                                           = js.native
    def updateElasticIp(params: UpdateElasticIpRequest): Request[js.Object]                               = js.native
    def updateInstance(params: UpdateInstanceRequest): Request[js.Object]                                 = js.native
    def updateLayer(params: UpdateLayerRequest): Request[js.Object]                                       = js.native
    def updateMyUserProfile(params: UpdateMyUserProfileRequest): Request[js.Object]                       = js.native
    def updateRdsDbInstance(params: UpdateRdsDbInstanceRequest): Request[js.Object]                       = js.native
    def updateStack(params: UpdateStackRequest): Request[js.Object]                                       = js.native
    def updateUserProfile(params: UpdateUserProfileRequest): Request[js.Object]                           = js.native
    def updateVolume(params: UpdateVolumeRequest): Request[js.Object]                                     = js.native
  }

  /**
    * Describes an agent version.
    */
  @js.native
  trait AgentVersion extends js.Object {
    var ConfigurationManager: js.UndefOr[StackConfigurationManager]
    var Version: js.UndefOr[String]
  }

  object AgentVersion {
    def apply(
        ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined,
        Version: js.UndefOr[String] = js.undefined
    ): AgentVersion = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigurationManager.foreach(__v => __obj.update("ConfigurationManager", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AgentVersion]
    }
  }

  /**
    * A description of the app.
    */
  @js.native
  trait App extends js.Object {
    var AppId: js.UndefOr[String]
    var AppSource: js.UndefOr[Source]
    var Attributes: js.UndefOr[AppAttributes]
    var CreatedAt: js.UndefOr[String]
    var DataSources: js.UndefOr[DataSources]
    var Description: js.UndefOr[String]
    var Domains: js.UndefOr[Strings]
    var EnableSsl: js.UndefOr[Boolean]
    var Environment: js.UndefOr[EnvironmentVariables]
    var Name: js.UndefOr[String]
    var Shortname: js.UndefOr[String]
    var SslConfiguration: js.UndefOr[SslConfiguration]
    var StackId: js.UndefOr[String]
    var Type: js.UndefOr[AppType]
  }

  object App {
    def apply(
        AppId: js.UndefOr[String] = js.undefined,
        AppSource: js.UndefOr[Source] = js.undefined,
        Attributes: js.UndefOr[AppAttributes] = js.undefined,
        CreatedAt: js.UndefOr[String] = js.undefined,
        DataSources: js.UndefOr[DataSources] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        Domains: js.UndefOr[Strings] = js.undefined,
        EnableSsl: js.UndefOr[Boolean] = js.undefined,
        Environment: js.UndefOr[EnvironmentVariables] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Shortname: js.UndefOr[String] = js.undefined,
        SslConfiguration: js.UndefOr[SslConfiguration] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[AppType] = js.undefined
    ): App = {
      val __obj = js.Dictionary.empty[js.Any]
      AppId.foreach(__v => __obj.update("AppId", __v.asInstanceOf[js.Any]))
      AppSource.foreach(__v => __obj.update("AppSource", __v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.update("CreatedAt", __v.asInstanceOf[js.Any]))
      DataSources.foreach(__v => __obj.update("DataSources", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Domains.foreach(__v => __obj.update("Domains", __v.asInstanceOf[js.Any]))
      EnableSsl.foreach(__v => __obj.update("EnableSsl", __v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.update("Environment", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Shortname.foreach(__v => __obj.update("Shortname", __v.asInstanceOf[js.Any]))
      SslConfiguration.foreach(__v => __obj.update("SslConfiguration", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[App]
    }
  }

  object AppAttributesKeysEnum {
    val DocumentRoot        = "DocumentRoot"
    val RailsEnv            = "RailsEnv"
    val AutoBundleOnDeploy  = "AutoBundleOnDeploy"
    val AwsFlowRubySettings = "AwsFlowRubySettings"

    val values = js.Object.freeze(js.Array(DocumentRoot, RailsEnv, AutoBundleOnDeploy, AwsFlowRubySettings))
  }

  object AppTypeEnum {
    val `aws-flow-ruby` = "aws-flow-ruby"
    val java            = "java"
    val rails           = "rails"
    val php             = "php"
    val nodejs          = "nodejs"
    val static          = "static"
    val other           = "other"

    val values = js.Object.freeze(js.Array(`aws-flow-ruby`, java, rails, php, nodejs, static, other))
  }

  object ArchitectureEnum {
    val x86_64 = "x86_64"
    val i386   = "i386"

    val values = js.Object.freeze(js.Array(x86_64, i386))
  }

  @js.native
  trait AssignInstanceRequest extends js.Object {
    var InstanceId: String
    var LayerIds: Strings
  }

  object AssignInstanceRequest {
    def apply(
        InstanceId: String,
        LayerIds: Strings
    ): AssignInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "LayerIds"   -> LayerIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssignInstanceRequest]
    }
  }

  @js.native
  trait AssignVolumeRequest extends js.Object {
    var VolumeId: String
    var InstanceId: js.UndefOr[String]
  }

  object AssignVolumeRequest {
    def apply(
        VolumeId: String,
        InstanceId: js.UndefOr[String] = js.undefined
    ): AssignVolumeRequest = {
      val __obj = js.Dictionary[js.Any](
        "VolumeId" -> VolumeId.asInstanceOf[js.Any]
      )

      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssignVolumeRequest]
    }
  }

  @js.native
  trait AssociateElasticIpRequest extends js.Object {
    var ElasticIp: String
    var InstanceId: js.UndefOr[String]
  }

  object AssociateElasticIpRequest {
    def apply(
        ElasticIp: String,
        InstanceId: js.UndefOr[String] = js.undefined
    ): AssociateElasticIpRequest = {
      val __obj = js.Dictionary[js.Any](
        "ElasticIp" -> ElasticIp.asInstanceOf[js.Any]
      )

      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateElasticIpRequest]
    }
  }

  @js.native
  trait AttachElasticLoadBalancerRequest extends js.Object {
    var ElasticLoadBalancerName: String
    var LayerId: String
  }

  object AttachElasticLoadBalancerRequest {
    def apply(
        ElasticLoadBalancerName: String,
        LayerId: String
    ): AttachElasticLoadBalancerRequest = {
      val __obj = js.Dictionary[js.Any](
        "ElasticLoadBalancerName" -> ElasticLoadBalancerName.asInstanceOf[js.Any],
        "LayerId"                 -> LayerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttachElasticLoadBalancerRequest]
    }
  }

  /**
    * Describes a load-based auto scaling upscaling or downscaling threshold configuration, which specifies when AWS OpsWorks Stacks starts or stops load-based instances.
    */
  @js.native
  trait AutoScalingThresholds extends js.Object {
    var Alarms: js.UndefOr[Strings]
    var CpuThreshold: js.UndefOr[Double]
    var IgnoreMetricsTime: js.UndefOr[Minute]
    var InstanceCount: js.UndefOr[Int]
    var LoadThreshold: js.UndefOr[Double]
    var MemoryThreshold: js.UndefOr[Double]
    var ThresholdsWaitTime: js.UndefOr[Minute]
  }

  object AutoScalingThresholds {
    def apply(
        Alarms: js.UndefOr[Strings] = js.undefined,
        CpuThreshold: js.UndefOr[Double] = js.undefined,
        IgnoreMetricsTime: js.UndefOr[Minute] = js.undefined,
        InstanceCount: js.UndefOr[Int] = js.undefined,
        LoadThreshold: js.UndefOr[Double] = js.undefined,
        MemoryThreshold: js.UndefOr[Double] = js.undefined,
        ThresholdsWaitTime: js.UndefOr[Minute] = js.undefined
    ): AutoScalingThresholds = {
      val __obj = js.Dictionary.empty[js.Any]
      Alarms.foreach(__v => __obj.update("Alarms", __v.asInstanceOf[js.Any]))
      CpuThreshold.foreach(__v => __obj.update("CpuThreshold", __v.asInstanceOf[js.Any]))
      IgnoreMetricsTime.foreach(__v => __obj.update("IgnoreMetricsTime", __v.asInstanceOf[js.Any]))
      InstanceCount.foreach(__v => __obj.update("InstanceCount", __v.asInstanceOf[js.Any]))
      LoadThreshold.foreach(__v => __obj.update("LoadThreshold", __v.asInstanceOf[js.Any]))
      MemoryThreshold.foreach(__v => __obj.update("MemoryThreshold", __v.asInstanceOf[js.Any]))
      ThresholdsWaitTime.foreach(__v => __obj.update("ThresholdsWaitTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingThresholds]
    }
  }

  object AutoScalingTypeEnum {
    val load  = "load"
    val timer = "timer"

    val values = js.Object.freeze(js.Array(load, timer))
  }

  /**
    * Describes a block device mapping. This data type maps directly to the Amazon EC2 [[https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html|BlockDeviceMapping]] data type.
    */
  @js.native
  trait BlockDeviceMapping extends js.Object {
    var DeviceName: js.UndefOr[String]
    var Ebs: js.UndefOr[EbsBlockDevice]
    var NoDevice: js.UndefOr[String]
    var VirtualName: js.UndefOr[String]
  }

  object BlockDeviceMapping {
    def apply(
        DeviceName: js.UndefOr[String] = js.undefined,
        Ebs: js.UndefOr[EbsBlockDevice] = js.undefined,
        NoDevice: js.UndefOr[String] = js.undefined,
        VirtualName: js.UndefOr[String] = js.undefined
    ): BlockDeviceMapping = {
      val __obj = js.Dictionary.empty[js.Any]
      DeviceName.foreach(__v => __obj.update("DeviceName", __v.asInstanceOf[js.Any]))
      Ebs.foreach(__v => __obj.update("Ebs", __v.asInstanceOf[js.Any]))
      NoDevice.foreach(__v => __obj.update("NoDevice", __v.asInstanceOf[js.Any]))
      VirtualName.foreach(__v => __obj.update("VirtualName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BlockDeviceMapping]
    }
  }

  /**
    * Describes the Chef configuration.
    */
  @js.native
  trait ChefConfiguration extends js.Object {
    var BerkshelfVersion: js.UndefOr[String]
    var ManageBerkshelf: js.UndefOr[Boolean]
  }

  object ChefConfiguration {
    def apply(
        BerkshelfVersion: js.UndefOr[String] = js.undefined,
        ManageBerkshelf: js.UndefOr[Boolean] = js.undefined
    ): ChefConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      BerkshelfVersion.foreach(__v => __obj.update("BerkshelfVersion", __v.asInstanceOf[js.Any]))
      ManageBerkshelf.foreach(__v => __obj.update("ManageBerkshelf", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChefConfiguration]
    }
  }

  @js.native
  trait CloneStackRequest extends js.Object {
    var ServiceRoleArn: String
    var SourceStackId: String
    var AgentVersion: js.UndefOr[String]
    var Attributes: js.UndefOr[StackAttributes]
    var ChefConfiguration: js.UndefOr[ChefConfiguration]
    var CloneAppIds: js.UndefOr[Strings]
    var ClonePermissions: js.UndefOr[Boolean]
    var ConfigurationManager: js.UndefOr[StackConfigurationManager]
    var CustomCookbooksSource: js.UndefOr[Source]
    var CustomJson: js.UndefOr[String]
    var DefaultAvailabilityZone: js.UndefOr[String]
    var DefaultInstanceProfileArn: js.UndefOr[String]
    var DefaultOs: js.UndefOr[String]
    var DefaultRootDeviceType: js.UndefOr[RootDeviceType]
    var DefaultSshKeyName: js.UndefOr[String]
    var DefaultSubnetId: js.UndefOr[String]
    var HostnameTheme: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Region: js.UndefOr[String]
    var UseCustomCookbooks: js.UndefOr[Boolean]
    var UseOpsworksSecurityGroups: js.UndefOr[Boolean]
    var VpcId: js.UndefOr[String]
  }

  object CloneStackRequest {
    def apply(
        ServiceRoleArn: String,
        SourceStackId: String,
        AgentVersion: js.UndefOr[String] = js.undefined,
        Attributes: js.UndefOr[StackAttributes] = js.undefined,
        ChefConfiguration: js.UndefOr[ChefConfiguration] = js.undefined,
        CloneAppIds: js.UndefOr[Strings] = js.undefined,
        ClonePermissions: js.UndefOr[Boolean] = js.undefined,
        ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined,
        CustomCookbooksSource: js.UndefOr[Source] = js.undefined,
        CustomJson: js.UndefOr[String] = js.undefined,
        DefaultAvailabilityZone: js.UndefOr[String] = js.undefined,
        DefaultInstanceProfileArn: js.UndefOr[String] = js.undefined,
        DefaultOs: js.UndefOr[String] = js.undefined,
        DefaultRootDeviceType: js.UndefOr[RootDeviceType] = js.undefined,
        DefaultSshKeyName: js.UndefOr[String] = js.undefined,
        DefaultSubnetId: js.UndefOr[String] = js.undefined,
        HostnameTheme: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Region: js.UndefOr[String] = js.undefined,
        UseCustomCookbooks: js.UndefOr[Boolean] = js.undefined,
        UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): CloneStackRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServiceRoleArn" -> ServiceRoleArn.asInstanceOf[js.Any],
        "SourceStackId"  -> SourceStackId.asInstanceOf[js.Any]
      )

      AgentVersion.foreach(__v => __obj.update("AgentVersion", __v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      ChefConfiguration.foreach(__v => __obj.update("ChefConfiguration", __v.asInstanceOf[js.Any]))
      CloneAppIds.foreach(__v => __obj.update("CloneAppIds", __v.asInstanceOf[js.Any]))
      ClonePermissions.foreach(__v => __obj.update("ClonePermissions", __v.asInstanceOf[js.Any]))
      ConfigurationManager.foreach(__v => __obj.update("ConfigurationManager", __v.asInstanceOf[js.Any]))
      CustomCookbooksSource.foreach(__v => __obj.update("CustomCookbooksSource", __v.asInstanceOf[js.Any]))
      CustomJson.foreach(__v => __obj.update("CustomJson", __v.asInstanceOf[js.Any]))
      DefaultAvailabilityZone.foreach(__v => __obj.update("DefaultAvailabilityZone", __v.asInstanceOf[js.Any]))
      DefaultInstanceProfileArn.foreach(__v => __obj.update("DefaultInstanceProfileArn", __v.asInstanceOf[js.Any]))
      DefaultOs.foreach(__v => __obj.update("DefaultOs", __v.asInstanceOf[js.Any]))
      DefaultRootDeviceType.foreach(__v => __obj.update("DefaultRootDeviceType", __v.asInstanceOf[js.Any]))
      DefaultSshKeyName.foreach(__v => __obj.update("DefaultSshKeyName", __v.asInstanceOf[js.Any]))
      DefaultSubnetId.foreach(__v => __obj.update("DefaultSubnetId", __v.asInstanceOf[js.Any]))
      HostnameTheme.foreach(__v => __obj.update("HostnameTheme", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.update("Region", __v.asInstanceOf[js.Any]))
      UseCustomCookbooks.foreach(__v => __obj.update("UseCustomCookbooks", __v.asInstanceOf[js.Any]))
      UseOpsworksSecurityGroups.foreach(__v => __obj.update("UseOpsworksSecurityGroups", __v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.update("VpcId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloneStackRequest]
    }
  }

  /**
    * Contains the response to a <code>CloneStack</code> request.
    */
  @js.native
  trait CloneStackResult extends js.Object {
    var StackId: js.UndefOr[String]
  }

  object CloneStackResult {
    def apply(
        StackId: js.UndefOr[String] = js.undefined
    ): CloneStackResult = {
      val __obj = js.Dictionary.empty[js.Any]
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloneStackResult]
    }
  }

  /**
    * Describes the Amazon CloudWatch logs configuration for a layer.
    */
  @js.native
  trait CloudWatchLogsConfiguration extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var LogStreams: js.UndefOr[CloudWatchLogsLogStreams]
  }

  object CloudWatchLogsConfiguration {
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined,
        LogStreams: js.UndefOr[CloudWatchLogsLogStreams] = js.undefined
    ): CloudWatchLogsConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      LogStreams.foreach(__v => __obj.update("LogStreams", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchLogsConfiguration]
    }
  }

  /**
    * Specifies the encoding of the log file so that the file can be read correctly. The default is <code>utf_8</code>. Encodings supported by Python <code>codecs.decode()</code> can be used here.
    */
  object CloudWatchLogsEncodingEnum {
    val ascii           = "ascii"
    val big5            = "big5"
    val big5hkscs       = "big5hkscs"
    val cp037           = "cp037"
    val cp424           = "cp424"
    val cp437           = "cp437"
    val cp500           = "cp500"
    val cp720           = "cp720"
    val cp737           = "cp737"
    val cp775           = "cp775"
    val cp850           = "cp850"
    val cp852           = "cp852"
    val cp855           = "cp855"
    val cp856           = "cp856"
    val cp857           = "cp857"
    val cp858           = "cp858"
    val cp860           = "cp860"
    val cp861           = "cp861"
    val cp862           = "cp862"
    val cp863           = "cp863"
    val cp864           = "cp864"
    val cp865           = "cp865"
    val cp866           = "cp866"
    val cp869           = "cp869"
    val cp874           = "cp874"
    val cp875           = "cp875"
    val cp932           = "cp932"
    val cp949           = "cp949"
    val cp950           = "cp950"
    val cp1006          = "cp1006"
    val cp1026          = "cp1026"
    val cp1140          = "cp1140"
    val cp1250          = "cp1250"
    val cp1251          = "cp1251"
    val cp1252          = "cp1252"
    val cp1253          = "cp1253"
    val cp1254          = "cp1254"
    val cp1255          = "cp1255"
    val cp1256          = "cp1256"
    val cp1257          = "cp1257"
    val cp1258          = "cp1258"
    val euc_jp          = "euc_jp"
    val euc_jis_2004    = "euc_jis_2004"
    val euc_jisx0213    = "euc_jisx0213"
    val euc_kr          = "euc_kr"
    val gb2312          = "gb2312"
    val gbk             = "gbk"
    val gb18030         = "gb18030"
    val hz              = "hz"
    val iso2022_jp      = "iso2022_jp"
    val iso2022_jp_1    = "iso2022_jp_1"
    val iso2022_jp_2    = "iso2022_jp_2"
    val iso2022_jp_2004 = "iso2022_jp_2004"
    val iso2022_jp_3    = "iso2022_jp_3"
    val iso2022_jp_ext  = "iso2022_jp_ext"
    val iso2022_kr      = "iso2022_kr"
    val latin_1         = "latin_1"
    val iso8859_2       = "iso8859_2"
    val iso8859_3       = "iso8859_3"
    val iso8859_4       = "iso8859_4"
    val iso8859_5       = "iso8859_5"
    val iso8859_6       = "iso8859_6"
    val iso8859_7       = "iso8859_7"
    val iso8859_8       = "iso8859_8"
    val iso8859_9       = "iso8859_9"
    val iso8859_10      = "iso8859_10"
    val iso8859_13      = "iso8859_13"
    val iso8859_14      = "iso8859_14"
    val iso8859_15      = "iso8859_15"
    val iso8859_16      = "iso8859_16"
    val johab           = "johab"
    val koi8_r          = "koi8_r"
    val koi8_u          = "koi8_u"
    val mac_cyrillic    = "mac_cyrillic"
    val mac_greek       = "mac_greek"
    val mac_iceland     = "mac_iceland"
    val mac_latin2      = "mac_latin2"
    val mac_roman       = "mac_roman"
    val mac_turkish     = "mac_turkish"
    val ptcp154         = "ptcp154"
    val shift_jis       = "shift_jis"
    val shift_jis_2004  = "shift_jis_2004"
    val shift_jisx0213  = "shift_jisx0213"
    val utf_32          = "utf_32"
    val utf_32_be       = "utf_32_be"
    val utf_32_le       = "utf_32_le"
    val utf_16          = "utf_16"
    val utf_16_be       = "utf_16_be"
    val utf_16_le       = "utf_16_le"
    val utf_7           = "utf_7"
    val utf_8           = "utf_8"
    val utf_8_sig       = "utf_8_sig"

    val values = js.Object.freeze(
      js.Array(
        ascii,
        big5,
        big5hkscs,
        cp037,
        cp424,
        cp437,
        cp500,
        cp720,
        cp737,
        cp775,
        cp850,
        cp852,
        cp855,
        cp856,
        cp857,
        cp858,
        cp860,
        cp861,
        cp862,
        cp863,
        cp864,
        cp865,
        cp866,
        cp869,
        cp874,
        cp875,
        cp932,
        cp949,
        cp950,
        cp1006,
        cp1026,
        cp1140,
        cp1250,
        cp1251,
        cp1252,
        cp1253,
        cp1254,
        cp1255,
        cp1256,
        cp1257,
        cp1258,
        euc_jp,
        euc_jis_2004,
        euc_jisx0213,
        euc_kr,
        gb2312,
        gbk,
        gb18030,
        hz,
        iso2022_jp,
        iso2022_jp_1,
        iso2022_jp_2,
        iso2022_jp_2004,
        iso2022_jp_3,
        iso2022_jp_ext,
        iso2022_kr,
        latin_1,
        iso8859_2,
        iso8859_3,
        iso8859_4,
        iso8859_5,
        iso8859_6,
        iso8859_7,
        iso8859_8,
        iso8859_9,
        iso8859_10,
        iso8859_13,
        iso8859_14,
        iso8859_15,
        iso8859_16,
        johab,
        koi8_r,
        koi8_u,
        mac_cyrillic,
        mac_greek,
        mac_iceland,
        mac_latin2,
        mac_roman,
        mac_turkish,
        ptcp154,
        shift_jis,
        shift_jis_2004,
        shift_jisx0213,
        utf_32,
        utf_32_be,
        utf_32_le,
        utf_16,
        utf_16_be,
        utf_16_le,
        utf_7,
        utf_8,
        utf_8_sig
      )
    )
  }

  /**
    * Specifies where to start to read data (start_of_file or end_of_file). The default is start_of_file. It's only used if there is no state persisted for that log stream.
    */
  object CloudWatchLogsInitialPositionEnum {
    val start_of_file = "start_of_file"
    val end_of_file   = "end_of_file"

    val values = js.Object.freeze(js.Array(start_of_file, end_of_file))
  }

  /**
    * Describes the Amazon CloudWatch logs configuration for a layer. For detailed information about members of this data type, see the [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AgentReference.html|CloudWatch Logs Agent Reference]].
    */
  @js.native
  trait CloudWatchLogsLogStream extends js.Object {
    var BatchCount: js.UndefOr[Int]
    var BatchSize: js.UndefOr[Int]
    var BufferDuration: js.UndefOr[Int]
    var DatetimeFormat: js.UndefOr[String]
    var Encoding: js.UndefOr[CloudWatchLogsEncoding]
    var File: js.UndefOr[String]
    var FileFingerprintLines: js.UndefOr[String]
    var InitialPosition: js.UndefOr[CloudWatchLogsInitialPosition]
    var LogGroupName: js.UndefOr[String]
    var MultiLineStartPattern: js.UndefOr[String]
    var TimeZone: js.UndefOr[CloudWatchLogsTimeZone]
  }

  object CloudWatchLogsLogStream {
    def apply(
        BatchCount: js.UndefOr[Int] = js.undefined,
        BatchSize: js.UndefOr[Int] = js.undefined,
        BufferDuration: js.UndefOr[Int] = js.undefined,
        DatetimeFormat: js.UndefOr[String] = js.undefined,
        Encoding: js.UndefOr[CloudWatchLogsEncoding] = js.undefined,
        File: js.UndefOr[String] = js.undefined,
        FileFingerprintLines: js.UndefOr[String] = js.undefined,
        InitialPosition: js.UndefOr[CloudWatchLogsInitialPosition] = js.undefined,
        LogGroupName: js.UndefOr[String] = js.undefined,
        MultiLineStartPattern: js.UndefOr[String] = js.undefined,
        TimeZone: js.UndefOr[CloudWatchLogsTimeZone] = js.undefined
    ): CloudWatchLogsLogStream = {
      val __obj = js.Dictionary.empty[js.Any]
      BatchCount.foreach(__v => __obj.update("BatchCount", __v.asInstanceOf[js.Any]))
      BatchSize.foreach(__v => __obj.update("BatchSize", __v.asInstanceOf[js.Any]))
      BufferDuration.foreach(__v => __obj.update("BufferDuration", __v.asInstanceOf[js.Any]))
      DatetimeFormat.foreach(__v => __obj.update("DatetimeFormat", __v.asInstanceOf[js.Any]))
      Encoding.foreach(__v => __obj.update("Encoding", __v.asInstanceOf[js.Any]))
      File.foreach(__v => __obj.update("File", __v.asInstanceOf[js.Any]))
      FileFingerprintLines.foreach(__v => __obj.update("FileFingerprintLines", __v.asInstanceOf[js.Any]))
      InitialPosition.foreach(__v => __obj.update("InitialPosition", __v.asInstanceOf[js.Any]))
      LogGroupName.foreach(__v => __obj.update("LogGroupName", __v.asInstanceOf[js.Any]))
      MultiLineStartPattern.foreach(__v => __obj.update("MultiLineStartPattern", __v.asInstanceOf[js.Any]))
      TimeZone.foreach(__v => __obj.update("TimeZone", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchLogsLogStream]
    }
  }

  /**
    * The preferred time zone for logs streamed to CloudWatch Logs. Valid values are <code>LOCAL</code> and <code>UTC</code>, for Coordinated Universal Time.
    */
  object CloudWatchLogsTimeZoneEnum {
    val LOCAL = "LOCAL"
    val UTC   = "UTC"

    val values = js.Object.freeze(js.Array(LOCAL, UTC))
  }

  /**
    * Describes a command.
    */
  @js.native
  trait Command extends js.Object {
    var AcknowledgedAt: js.UndefOr[DateTime]
    var CommandId: js.UndefOr[String]
    var CompletedAt: js.UndefOr[DateTime]
    var CreatedAt: js.UndefOr[DateTime]
    var DeploymentId: js.UndefOr[String]
    var ExitCode: js.UndefOr[Int]
    var InstanceId: js.UndefOr[String]
    var LogUrl: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  object Command {
    def apply(
        AcknowledgedAt: js.UndefOr[DateTime] = js.undefined,
        CommandId: js.UndefOr[String] = js.undefined,
        CompletedAt: js.UndefOr[DateTime] = js.undefined,
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        DeploymentId: js.UndefOr[String] = js.undefined,
        ExitCode: js.UndefOr[Int] = js.undefined,
        InstanceId: js.UndefOr[String] = js.undefined,
        LogUrl: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): Command = {
      val __obj = js.Dictionary.empty[js.Any]
      AcknowledgedAt.foreach(__v => __obj.update("AcknowledgedAt", __v.asInstanceOf[js.Any]))
      CommandId.foreach(__v => __obj.update("CommandId", __v.asInstanceOf[js.Any]))
      CompletedAt.foreach(__v => __obj.update("CompletedAt", __v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.update("CreatedAt", __v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.update("DeploymentId", __v.asInstanceOf[js.Any]))
      ExitCode.foreach(__v => __obj.update("ExitCode", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      LogUrl.foreach(__v => __obj.update("LogUrl", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Command]
    }
  }

  @js.native
  trait CreateAppRequest extends js.Object {
    var Name: String
    var StackId: String
    var Type: AppType
    var AppSource: js.UndefOr[Source]
    var Attributes: js.UndefOr[AppAttributes]
    var DataSources: js.UndefOr[DataSources]
    var Description: js.UndefOr[String]
    var Domains: js.UndefOr[Strings]
    var EnableSsl: js.UndefOr[Boolean]
    var Environment: js.UndefOr[EnvironmentVariables]
    var Shortname: js.UndefOr[String]
    var SslConfiguration: js.UndefOr[SslConfiguration]
  }

  object CreateAppRequest {
    def apply(
        Name: String,
        StackId: String,
        Type: AppType,
        AppSource: js.UndefOr[Source] = js.undefined,
        Attributes: js.UndefOr[AppAttributes] = js.undefined,
        DataSources: js.UndefOr[DataSources] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        Domains: js.UndefOr[Strings] = js.undefined,
        EnableSsl: js.UndefOr[Boolean] = js.undefined,
        Environment: js.UndefOr[EnvironmentVariables] = js.undefined,
        Shortname: js.UndefOr[String] = js.undefined,
        SslConfiguration: js.UndefOr[SslConfiguration] = js.undefined
    ): CreateAppRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name"    -> Name.asInstanceOf[js.Any],
        "StackId" -> StackId.asInstanceOf[js.Any],
        "Type"    -> Type.asInstanceOf[js.Any]
      )

      AppSource.foreach(__v => __obj.update("AppSource", __v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      DataSources.foreach(__v => __obj.update("DataSources", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Domains.foreach(__v => __obj.update("Domains", __v.asInstanceOf[js.Any]))
      EnableSsl.foreach(__v => __obj.update("EnableSsl", __v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.update("Environment", __v.asInstanceOf[js.Any]))
      Shortname.foreach(__v => __obj.update("Shortname", __v.asInstanceOf[js.Any]))
      SslConfiguration.foreach(__v => __obj.update("SslConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppRequest]
    }
  }

  /**
    * Contains the response to a <code>CreateApp</code> request.
    */
  @js.native
  trait CreateAppResult extends js.Object {
    var AppId: js.UndefOr[String]
  }

  object CreateAppResult {
    def apply(
        AppId: js.UndefOr[String] = js.undefined
    ): CreateAppResult = {
      val __obj = js.Dictionary.empty[js.Any]
      AppId.foreach(__v => __obj.update("AppId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppResult]
    }
  }

  @js.native
  trait CreateDeploymentRequest extends js.Object {
    var Command: DeploymentCommand
    var StackId: String
    var AppId: js.UndefOr[String]
    var Comment: js.UndefOr[String]
    var CustomJson: js.UndefOr[String]
    var InstanceIds: js.UndefOr[Strings]
    var LayerIds: js.UndefOr[Strings]
  }

  object CreateDeploymentRequest {
    def apply(
        Command: DeploymentCommand,
        StackId: String,
        AppId: js.UndefOr[String] = js.undefined,
        Comment: js.UndefOr[String] = js.undefined,
        CustomJson: js.UndefOr[String] = js.undefined,
        InstanceIds: js.UndefOr[Strings] = js.undefined,
        LayerIds: js.UndefOr[Strings] = js.undefined
    ): CreateDeploymentRequest = {
      val __obj = js.Dictionary[js.Any](
        "Command" -> Command.asInstanceOf[js.Any],
        "StackId" -> StackId.asInstanceOf[js.Any]
      )

      AppId.foreach(__v => __obj.update("AppId", __v.asInstanceOf[js.Any]))
      Comment.foreach(__v => __obj.update("Comment", __v.asInstanceOf[js.Any]))
      CustomJson.foreach(__v => __obj.update("CustomJson", __v.asInstanceOf[js.Any]))
      InstanceIds.foreach(__v => __obj.update("InstanceIds", __v.asInstanceOf[js.Any]))
      LayerIds.foreach(__v => __obj.update("LayerIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentRequest]
    }
  }

  /**
    * Contains the response to a <code>CreateDeployment</code> request.
    */
  @js.native
  trait CreateDeploymentResult extends js.Object {
    var DeploymentId: js.UndefOr[String]
  }

  object CreateDeploymentResult {
    def apply(
        DeploymentId: js.UndefOr[String] = js.undefined
    ): CreateDeploymentResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DeploymentId.foreach(__v => __obj.update("DeploymentId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentResult]
    }
  }

  @js.native
  trait CreateInstanceRequest extends js.Object {
    var InstanceType: String
    var LayerIds: Strings
    var StackId: String
    var AgentVersion: js.UndefOr[String]
    var AmiId: js.UndefOr[String]
    var Architecture: js.UndefOr[Architecture]
    var AutoScalingType: js.UndefOr[AutoScalingType]
    var AvailabilityZone: js.UndefOr[String]
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappings]
    var EbsOptimized: js.UndefOr[Boolean]
    var Hostname: js.UndefOr[String]
    var InstallUpdatesOnBoot: js.UndefOr[Boolean]
    var Os: js.UndefOr[String]
    var RootDeviceType: js.UndefOr[RootDeviceType]
    var SshKeyName: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
    var Tenancy: js.UndefOr[String]
    var VirtualizationType: js.UndefOr[String]
  }

  object CreateInstanceRequest {
    def apply(
        InstanceType: String,
        LayerIds: Strings,
        StackId: String,
        AgentVersion: js.UndefOr[String] = js.undefined,
        AmiId: js.UndefOr[String] = js.undefined,
        Architecture: js.UndefOr[Architecture] = js.undefined,
        AutoScalingType: js.UndefOr[AutoScalingType] = js.undefined,
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        BlockDeviceMappings: js.UndefOr[BlockDeviceMappings] = js.undefined,
        EbsOptimized: js.UndefOr[Boolean] = js.undefined,
        Hostname: js.UndefOr[String] = js.undefined,
        InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined,
        Os: js.UndefOr[String] = js.undefined,
        RootDeviceType: js.UndefOr[RootDeviceType] = js.undefined,
        SshKeyName: js.UndefOr[String] = js.undefined,
        SubnetId: js.UndefOr[String] = js.undefined,
        Tenancy: js.UndefOr[String] = js.undefined,
        VirtualizationType: js.UndefOr[String] = js.undefined
    ): CreateInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceType" -> InstanceType.asInstanceOf[js.Any],
        "LayerIds"     -> LayerIds.asInstanceOf[js.Any],
        "StackId"      -> StackId.asInstanceOf[js.Any]
      )

      AgentVersion.foreach(__v => __obj.update("AgentVersion", __v.asInstanceOf[js.Any]))
      AmiId.foreach(__v => __obj.update("AmiId", __v.asInstanceOf[js.Any]))
      Architecture.foreach(__v => __obj.update("Architecture", __v.asInstanceOf[js.Any]))
      AutoScalingType.foreach(__v => __obj.update("AutoScalingType", __v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.update("AvailabilityZone", __v.asInstanceOf[js.Any]))
      BlockDeviceMappings.foreach(__v => __obj.update("BlockDeviceMappings", __v.asInstanceOf[js.Any]))
      EbsOptimized.foreach(__v => __obj.update("EbsOptimized", __v.asInstanceOf[js.Any]))
      Hostname.foreach(__v => __obj.update("Hostname", __v.asInstanceOf[js.Any]))
      InstallUpdatesOnBoot.foreach(__v => __obj.update("InstallUpdatesOnBoot", __v.asInstanceOf[js.Any]))
      Os.foreach(__v => __obj.update("Os", __v.asInstanceOf[js.Any]))
      RootDeviceType.foreach(__v => __obj.update("RootDeviceType", __v.asInstanceOf[js.Any]))
      SshKeyName.foreach(__v => __obj.update("SshKeyName", __v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.update("SubnetId", __v.asInstanceOf[js.Any]))
      Tenancy.foreach(__v => __obj.update("Tenancy", __v.asInstanceOf[js.Any]))
      VirtualizationType.foreach(__v => __obj.update("VirtualizationType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInstanceRequest]
    }
  }

  /**
    * Contains the response to a <code>CreateInstance</code> request.
    */
  @js.native
  trait CreateInstanceResult extends js.Object {
    var InstanceId: js.UndefOr[String]
  }

  object CreateInstanceResult {
    def apply(
        InstanceId: js.UndefOr[String] = js.undefined
    ): CreateInstanceResult = {
      val __obj = js.Dictionary.empty[js.Any]
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInstanceResult]
    }
  }

  @js.native
  trait CreateLayerRequest extends js.Object {
    var Name: String
    var Shortname: String
    var StackId: String
    var Type: LayerType
    var Attributes: js.UndefOr[LayerAttributes]
    var AutoAssignElasticIps: js.UndefOr[Boolean]
    var AutoAssignPublicIps: js.UndefOr[Boolean]
    var CloudWatchLogsConfiguration: js.UndefOr[CloudWatchLogsConfiguration]
    var CustomInstanceProfileArn: js.UndefOr[String]
    var CustomJson: js.UndefOr[String]
    var CustomRecipes: js.UndefOr[Recipes]
    var CustomSecurityGroupIds: js.UndefOr[Strings]
    var EnableAutoHealing: js.UndefOr[Boolean]
    var InstallUpdatesOnBoot: js.UndefOr[Boolean]
    var LifecycleEventConfiguration: js.UndefOr[LifecycleEventConfiguration]
    var Packages: js.UndefOr[Strings]
    var UseEbsOptimizedInstances: js.UndefOr[Boolean]
    var VolumeConfigurations: js.UndefOr[VolumeConfigurations]
  }

  object CreateLayerRequest {
    def apply(
        Name: String,
        Shortname: String,
        StackId: String,
        Type: LayerType,
        Attributes: js.UndefOr[LayerAttributes] = js.undefined,
        AutoAssignElasticIps: js.UndefOr[Boolean] = js.undefined,
        AutoAssignPublicIps: js.UndefOr[Boolean] = js.undefined,
        CloudWatchLogsConfiguration: js.UndefOr[CloudWatchLogsConfiguration] = js.undefined,
        CustomInstanceProfileArn: js.UndefOr[String] = js.undefined,
        CustomJson: js.UndefOr[String] = js.undefined,
        CustomRecipes: js.UndefOr[Recipes] = js.undefined,
        CustomSecurityGroupIds: js.UndefOr[Strings] = js.undefined,
        EnableAutoHealing: js.UndefOr[Boolean] = js.undefined,
        InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined,
        LifecycleEventConfiguration: js.UndefOr[LifecycleEventConfiguration] = js.undefined,
        Packages: js.UndefOr[Strings] = js.undefined,
        UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.undefined,
        VolumeConfigurations: js.UndefOr[VolumeConfigurations] = js.undefined
    ): CreateLayerRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name"      -> Name.asInstanceOf[js.Any],
        "Shortname" -> Shortname.asInstanceOf[js.Any],
        "StackId"   -> StackId.asInstanceOf[js.Any],
        "Type"      -> Type.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      AutoAssignElasticIps.foreach(__v => __obj.update("AutoAssignElasticIps", __v.asInstanceOf[js.Any]))
      AutoAssignPublicIps.foreach(__v => __obj.update("AutoAssignPublicIps", __v.asInstanceOf[js.Any]))
      CloudWatchLogsConfiguration.foreach(__v => __obj.update("CloudWatchLogsConfiguration", __v.asInstanceOf[js.Any]))
      CustomInstanceProfileArn.foreach(__v => __obj.update("CustomInstanceProfileArn", __v.asInstanceOf[js.Any]))
      CustomJson.foreach(__v => __obj.update("CustomJson", __v.asInstanceOf[js.Any]))
      CustomRecipes.foreach(__v => __obj.update("CustomRecipes", __v.asInstanceOf[js.Any]))
      CustomSecurityGroupIds.foreach(__v => __obj.update("CustomSecurityGroupIds", __v.asInstanceOf[js.Any]))
      EnableAutoHealing.foreach(__v => __obj.update("EnableAutoHealing", __v.asInstanceOf[js.Any]))
      InstallUpdatesOnBoot.foreach(__v => __obj.update("InstallUpdatesOnBoot", __v.asInstanceOf[js.Any]))
      LifecycleEventConfiguration.foreach(__v => __obj.update("LifecycleEventConfiguration", __v.asInstanceOf[js.Any]))
      Packages.foreach(__v => __obj.update("Packages", __v.asInstanceOf[js.Any]))
      UseEbsOptimizedInstances.foreach(__v => __obj.update("UseEbsOptimizedInstances", __v.asInstanceOf[js.Any]))
      VolumeConfigurations.foreach(__v => __obj.update("VolumeConfigurations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLayerRequest]
    }
  }

  /**
    * Contains the response to a <code>CreateLayer</code> request.
    */
  @js.native
  trait CreateLayerResult extends js.Object {
    var LayerId: js.UndefOr[String]
  }

  object CreateLayerResult {
    def apply(
        LayerId: js.UndefOr[String] = js.undefined
    ): CreateLayerResult = {
      val __obj = js.Dictionary.empty[js.Any]
      LayerId.foreach(__v => __obj.update("LayerId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLayerResult]
    }
  }

  @js.native
  trait CreateStackRequest extends js.Object {
    var DefaultInstanceProfileArn: String
    var Name: String
    var Region: String
    var ServiceRoleArn: String
    var AgentVersion: js.UndefOr[String]
    var Attributes: js.UndefOr[StackAttributes]
    var ChefConfiguration: js.UndefOr[ChefConfiguration]
    var ConfigurationManager: js.UndefOr[StackConfigurationManager]
    var CustomCookbooksSource: js.UndefOr[Source]
    var CustomJson: js.UndefOr[String]
    var DefaultAvailabilityZone: js.UndefOr[String]
    var DefaultOs: js.UndefOr[String]
    var DefaultRootDeviceType: js.UndefOr[RootDeviceType]
    var DefaultSshKeyName: js.UndefOr[String]
    var DefaultSubnetId: js.UndefOr[String]
    var HostnameTheme: js.UndefOr[String]
    var UseCustomCookbooks: js.UndefOr[Boolean]
    var UseOpsworksSecurityGroups: js.UndefOr[Boolean]
    var VpcId: js.UndefOr[String]
  }

  object CreateStackRequest {
    def apply(
        DefaultInstanceProfileArn: String,
        Name: String,
        Region: String,
        ServiceRoleArn: String,
        AgentVersion: js.UndefOr[String] = js.undefined,
        Attributes: js.UndefOr[StackAttributes] = js.undefined,
        ChefConfiguration: js.UndefOr[ChefConfiguration] = js.undefined,
        ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined,
        CustomCookbooksSource: js.UndefOr[Source] = js.undefined,
        CustomJson: js.UndefOr[String] = js.undefined,
        DefaultAvailabilityZone: js.UndefOr[String] = js.undefined,
        DefaultOs: js.UndefOr[String] = js.undefined,
        DefaultRootDeviceType: js.UndefOr[RootDeviceType] = js.undefined,
        DefaultSshKeyName: js.UndefOr[String] = js.undefined,
        DefaultSubnetId: js.UndefOr[String] = js.undefined,
        HostnameTheme: js.UndefOr[String] = js.undefined,
        UseCustomCookbooks: js.UndefOr[Boolean] = js.undefined,
        UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): CreateStackRequest = {
      val __obj = js.Dictionary[js.Any](
        "DefaultInstanceProfileArn" -> DefaultInstanceProfileArn.asInstanceOf[js.Any],
        "Name"                      -> Name.asInstanceOf[js.Any],
        "Region"                    -> Region.asInstanceOf[js.Any],
        "ServiceRoleArn"            -> ServiceRoleArn.asInstanceOf[js.Any]
      )

      AgentVersion.foreach(__v => __obj.update("AgentVersion", __v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      ChefConfiguration.foreach(__v => __obj.update("ChefConfiguration", __v.asInstanceOf[js.Any]))
      ConfigurationManager.foreach(__v => __obj.update("ConfigurationManager", __v.asInstanceOf[js.Any]))
      CustomCookbooksSource.foreach(__v => __obj.update("CustomCookbooksSource", __v.asInstanceOf[js.Any]))
      CustomJson.foreach(__v => __obj.update("CustomJson", __v.asInstanceOf[js.Any]))
      DefaultAvailabilityZone.foreach(__v => __obj.update("DefaultAvailabilityZone", __v.asInstanceOf[js.Any]))
      DefaultOs.foreach(__v => __obj.update("DefaultOs", __v.asInstanceOf[js.Any]))
      DefaultRootDeviceType.foreach(__v => __obj.update("DefaultRootDeviceType", __v.asInstanceOf[js.Any]))
      DefaultSshKeyName.foreach(__v => __obj.update("DefaultSshKeyName", __v.asInstanceOf[js.Any]))
      DefaultSubnetId.foreach(__v => __obj.update("DefaultSubnetId", __v.asInstanceOf[js.Any]))
      HostnameTheme.foreach(__v => __obj.update("HostnameTheme", __v.asInstanceOf[js.Any]))
      UseCustomCookbooks.foreach(__v => __obj.update("UseCustomCookbooks", __v.asInstanceOf[js.Any]))
      UseOpsworksSecurityGroups.foreach(__v => __obj.update("UseOpsworksSecurityGroups", __v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.update("VpcId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStackRequest]
    }
  }

  /**
    * Contains the response to a <code>CreateStack</code> request.
    */
  @js.native
  trait CreateStackResult extends js.Object {
    var StackId: js.UndefOr[String]
  }

  object CreateStackResult {
    def apply(
        StackId: js.UndefOr[String] = js.undefined
    ): CreateStackResult = {
      val __obj = js.Dictionary.empty[js.Any]
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStackResult]
    }
  }

  @js.native
  trait CreateUserProfileRequest extends js.Object {
    var IamUserArn: String
    var AllowSelfManagement: js.UndefOr[Boolean]
    var SshPublicKey: js.UndefOr[String]
    var SshUsername: js.UndefOr[String]
  }

  object CreateUserProfileRequest {
    def apply(
        IamUserArn: String,
        AllowSelfManagement: js.UndefOr[Boolean] = js.undefined,
        SshPublicKey: js.UndefOr[String] = js.undefined,
        SshUsername: js.UndefOr[String] = js.undefined
    ): CreateUserProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "IamUserArn" -> IamUserArn.asInstanceOf[js.Any]
      )

      AllowSelfManagement.foreach(__v => __obj.update("AllowSelfManagement", __v.asInstanceOf[js.Any]))
      SshPublicKey.foreach(__v => __obj.update("SshPublicKey", __v.asInstanceOf[js.Any]))
      SshUsername.foreach(__v => __obj.update("SshUsername", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserProfileRequest]
    }
  }

  /**
    * Contains the response to a <code>CreateUserProfile</code> request.
    */
  @js.native
  trait CreateUserProfileResult extends js.Object {
    var IamUserArn: js.UndefOr[String]
  }

  object CreateUserProfileResult {
    def apply(
        IamUserArn: js.UndefOr[String] = js.undefined
    ): CreateUserProfileResult = {
      val __obj = js.Dictionary.empty[js.Any]
      IamUserArn.foreach(__v => __obj.update("IamUserArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserProfileResult]
    }
  }

  /**
    * Describes an app's data source.
    */
  @js.native
  trait DataSource extends js.Object {
    var Arn: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  object DataSource {
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): DataSource = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.update("DatabaseName", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSource]
    }
  }

  @js.native
  trait DeleteAppRequest extends js.Object {
    var AppId: String
  }

  object DeleteAppRequest {
    def apply(
        AppId: String
    ): DeleteAppRequest = {
      val __obj = js.Dictionary[js.Any](
        "AppId" -> AppId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAppRequest]
    }
  }

  @js.native
  trait DeleteInstanceRequest extends js.Object {
    var InstanceId: String
    var DeleteElasticIp: js.UndefOr[Boolean]
    var DeleteVolumes: js.UndefOr[Boolean]
  }

  object DeleteInstanceRequest {
    def apply(
        InstanceId: String,
        DeleteElasticIp: js.UndefOr[Boolean] = js.undefined,
        DeleteVolumes: js.UndefOr[Boolean] = js.undefined
    ): DeleteInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      DeleteElasticIp.foreach(__v => __obj.update("DeleteElasticIp", __v.asInstanceOf[js.Any]))
      DeleteVolumes.foreach(__v => __obj.update("DeleteVolumes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteInstanceRequest]
    }
  }

  @js.native
  trait DeleteLayerRequest extends js.Object {
    var LayerId: String
  }

  object DeleteLayerRequest {
    def apply(
        LayerId: String
    ): DeleteLayerRequest = {
      val __obj = js.Dictionary[js.Any](
        "LayerId" -> LayerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteLayerRequest]
    }
  }

  @js.native
  trait DeleteStackRequest extends js.Object {
    var StackId: String
  }

  object DeleteStackRequest {
    def apply(
        StackId: String
    ): DeleteStackRequest = {
      val __obj = js.Dictionary[js.Any](
        "StackId" -> StackId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteStackRequest]
    }
  }

  @js.native
  trait DeleteUserProfileRequest extends js.Object {
    var IamUserArn: String
  }

  object DeleteUserProfileRequest {
    def apply(
        IamUserArn: String
    ): DeleteUserProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "IamUserArn" -> IamUserArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteUserProfileRequest]
    }
  }

  /**
    * Describes a deployment of a stack or app.
    */
  @js.native
  trait Deployment extends js.Object {
    var AppId: js.UndefOr[String]
    var Command: js.UndefOr[DeploymentCommand]
    var Comment: js.UndefOr[String]
    var CompletedAt: js.UndefOr[DateTime]
    var CreatedAt: js.UndefOr[DateTime]
    var CustomJson: js.UndefOr[String]
    var DeploymentId: js.UndefOr[String]
    var Duration: js.UndefOr[Int]
    var IamUserArn: js.UndefOr[String]
    var InstanceIds: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object Deployment {
    def apply(
        AppId: js.UndefOr[String] = js.undefined,
        Command: js.UndefOr[DeploymentCommand] = js.undefined,
        Comment: js.UndefOr[String] = js.undefined,
        CompletedAt: js.UndefOr[DateTime] = js.undefined,
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        CustomJson: js.UndefOr[String] = js.undefined,
        DeploymentId: js.UndefOr[String] = js.undefined,
        Duration: js.UndefOr[Int] = js.undefined,
        IamUserArn: js.UndefOr[String] = js.undefined,
        InstanceIds: js.UndefOr[Strings] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): Deployment = {
      val __obj = js.Dictionary.empty[js.Any]
      AppId.foreach(__v => __obj.update("AppId", __v.asInstanceOf[js.Any]))
      Command.foreach(__v => __obj.update("Command", __v.asInstanceOf[js.Any]))
      Comment.foreach(__v => __obj.update("Comment", __v.asInstanceOf[js.Any]))
      CompletedAt.foreach(__v => __obj.update("CompletedAt", __v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.update("CreatedAt", __v.asInstanceOf[js.Any]))
      CustomJson.foreach(__v => __obj.update("CustomJson", __v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.update("DeploymentId", __v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.update("Duration", __v.asInstanceOf[js.Any]))
      IamUserArn.foreach(__v => __obj.update("IamUserArn", __v.asInstanceOf[js.Any]))
      InstanceIds.foreach(__v => __obj.update("InstanceIds", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Deployment]
    }
  }

  /**
    * Used to specify a stack or deployment command.
    */
  @js.native
  trait DeploymentCommand extends js.Object {
    var Name: DeploymentCommandName
    var Args: js.UndefOr[DeploymentCommandArgs]
  }

  object DeploymentCommand {
    def apply(
        Name: DeploymentCommandName,
        Args: js.UndefOr[DeploymentCommandArgs] = js.undefined
    ): DeploymentCommand = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Args.foreach(__v => __obj.update("Args", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentCommand]
    }
  }

  object DeploymentCommandNameEnum {
    val install_dependencies    = "install_dependencies"
    val update_dependencies     = "update_dependencies"
    val update_custom_cookbooks = "update_custom_cookbooks"
    val execute_recipes         = "execute_recipes"
    val configure               = "configure"
    val setup                   = "setup"
    val deploy                  = "deploy"
    val rollback                = "rollback"
    val start                   = "start"
    val stop                    = "stop"
    val restart                 = "restart"
    val undeploy                = "undeploy"

    val values = js.Object.freeze(
      js.Array(
        install_dependencies,
        update_dependencies,
        update_custom_cookbooks,
        execute_recipes,
        configure,
        setup,
        deploy,
        rollback,
        start,
        stop,
        restart,
        undeploy
      )
    )
  }

  @js.native
  trait DeregisterEcsClusterRequest extends js.Object {
    var EcsClusterArn: String
  }

  object DeregisterEcsClusterRequest {
    def apply(
        EcsClusterArn: String
    ): DeregisterEcsClusterRequest = {
      val __obj = js.Dictionary[js.Any](
        "EcsClusterArn" -> EcsClusterArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeregisterEcsClusterRequest]
    }
  }

  @js.native
  trait DeregisterElasticIpRequest extends js.Object {
    var ElasticIp: String
  }

  object DeregisterElasticIpRequest {
    def apply(
        ElasticIp: String
    ): DeregisterElasticIpRequest = {
      val __obj = js.Dictionary[js.Any](
        "ElasticIp" -> ElasticIp.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeregisterElasticIpRequest]
    }
  }

  @js.native
  trait DeregisterInstanceRequest extends js.Object {
    var InstanceId: String
  }

  object DeregisterInstanceRequest {
    def apply(
        InstanceId: String
    ): DeregisterInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeregisterInstanceRequest]
    }
  }

  @js.native
  trait DeregisterRdsDbInstanceRequest extends js.Object {
    var RdsDbInstanceArn: String
  }

  object DeregisterRdsDbInstanceRequest {
    def apply(
        RdsDbInstanceArn: String
    ): DeregisterRdsDbInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "RdsDbInstanceArn" -> RdsDbInstanceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeregisterRdsDbInstanceRequest]
    }
  }

  @js.native
  trait DeregisterVolumeRequest extends js.Object {
    var VolumeId: String
  }

  object DeregisterVolumeRequest {
    def apply(
        VolumeId: String
    ): DeregisterVolumeRequest = {
      val __obj = js.Dictionary[js.Any](
        "VolumeId" -> VolumeId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeregisterVolumeRequest]
    }
  }

  @js.native
  trait DescribeAgentVersionsRequest extends js.Object {
    var ConfigurationManager: js.UndefOr[StackConfigurationManager]
    var StackId: js.UndefOr[String]
  }

  object DescribeAgentVersionsRequest {
    def apply(
        ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined
    ): DescribeAgentVersionsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigurationManager.foreach(__v => __obj.update("ConfigurationManager", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAgentVersionsRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeAgentVersions</code> request.
    */
  @js.native
  trait DescribeAgentVersionsResult extends js.Object {
    var AgentVersions: js.UndefOr[AgentVersions]
  }

  object DescribeAgentVersionsResult {
    def apply(
        AgentVersions: js.UndefOr[AgentVersions] = js.undefined
    ): DescribeAgentVersionsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      AgentVersions.foreach(__v => __obj.update("AgentVersions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAgentVersionsResult]
    }
  }

  @js.native
  trait DescribeAppsRequest extends js.Object {
    var AppIds: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
  }

  object DescribeAppsRequest {
    def apply(
        AppIds: js.UndefOr[Strings] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined
    ): DescribeAppsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      AppIds.foreach(__v => __obj.update("AppIds", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAppsRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeApps</code> request.
    */
  @js.native
  trait DescribeAppsResult extends js.Object {
    var Apps: js.UndefOr[Apps]
  }

  object DescribeAppsResult {
    def apply(
        Apps: js.UndefOr[Apps] = js.undefined
    ): DescribeAppsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Apps.foreach(__v => __obj.update("Apps", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAppsResult]
    }
  }

  @js.native
  trait DescribeCommandsRequest extends js.Object {
    var CommandIds: js.UndefOr[Strings]
    var DeploymentId: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
  }

  object DescribeCommandsRequest {
    def apply(
        CommandIds: js.UndefOr[Strings] = js.undefined,
        DeploymentId: js.UndefOr[String] = js.undefined,
        InstanceId: js.UndefOr[String] = js.undefined
    ): DescribeCommandsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      CommandIds.foreach(__v => __obj.update("CommandIds", __v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.update("DeploymentId", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCommandsRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeCommands</code> request.
    */
  @js.native
  trait DescribeCommandsResult extends js.Object {
    var Commands: js.UndefOr[Commands]
  }

  object DescribeCommandsResult {
    def apply(
        Commands: js.UndefOr[Commands] = js.undefined
    ): DescribeCommandsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Commands.foreach(__v => __obj.update("Commands", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCommandsResult]
    }
  }

  @js.native
  trait DescribeDeploymentsRequest extends js.Object {
    var AppId: js.UndefOr[String]
    var DeploymentIds: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
  }

  object DescribeDeploymentsRequest {
    def apply(
        AppId: js.UndefOr[String] = js.undefined,
        DeploymentIds: js.UndefOr[Strings] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined
    ): DescribeDeploymentsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      AppId.foreach(__v => __obj.update("AppId", __v.asInstanceOf[js.Any]))
      DeploymentIds.foreach(__v => __obj.update("DeploymentIds", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDeploymentsRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeDeployments</code> request.
    */
  @js.native
  trait DescribeDeploymentsResult extends js.Object {
    var Deployments: js.UndefOr[Deployments]
  }

  object DescribeDeploymentsResult {
    def apply(
        Deployments: js.UndefOr[Deployments] = js.undefined
    ): DescribeDeploymentsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Deployments.foreach(__v => __obj.update("Deployments", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDeploymentsResult]
    }
  }

  @js.native
  trait DescribeEcsClustersRequest extends js.Object {
    var EcsClusterArns: js.UndefOr[Strings]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
    var StackId: js.UndefOr[String]
  }

  object DescribeEcsClustersRequest {
    def apply(
        EcsClusterArns: js.UndefOr[Strings] = js.undefined,
        MaxResults: js.UndefOr[Int] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined
    ): DescribeEcsClustersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      EcsClusterArns.foreach(__v => __obj.update("EcsClusterArns", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEcsClustersRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeEcsClusters</code> request.
    */
  @js.native
  trait DescribeEcsClustersResult extends js.Object {
    var EcsClusters: js.UndefOr[EcsClusters]
    var NextToken: js.UndefOr[String]
  }

  object DescribeEcsClustersResult {
    def apply(
        EcsClusters: js.UndefOr[EcsClusters] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeEcsClustersResult = {
      val __obj = js.Dictionary.empty[js.Any]
      EcsClusters.foreach(__v => __obj.update("EcsClusters", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEcsClustersResult]
    }
  }

  @js.native
  trait DescribeElasticIpsRequest extends js.Object {
    var InstanceId: js.UndefOr[String]
    var Ips: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
  }

  object DescribeElasticIpsRequest {
    def apply(
        InstanceId: js.UndefOr[String] = js.undefined,
        Ips: js.UndefOr[Strings] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined
    ): DescribeElasticIpsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      Ips.foreach(__v => __obj.update("Ips", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeElasticIpsRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeElasticIps</code> request.
    */
  @js.native
  trait DescribeElasticIpsResult extends js.Object {
    var ElasticIps: js.UndefOr[ElasticIps]
  }

  object DescribeElasticIpsResult {
    def apply(
        ElasticIps: js.UndefOr[ElasticIps] = js.undefined
    ): DescribeElasticIpsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ElasticIps.foreach(__v => __obj.update("ElasticIps", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeElasticIpsResult]
    }
  }

  @js.native
  trait DescribeElasticLoadBalancersRequest extends js.Object {
    var LayerIds: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
  }

  object DescribeElasticLoadBalancersRequest {
    def apply(
        LayerIds: js.UndefOr[Strings] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined
    ): DescribeElasticLoadBalancersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      LayerIds.foreach(__v => __obj.update("LayerIds", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeElasticLoadBalancersRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeElasticLoadBalancers</code> request.
    */
  @js.native
  trait DescribeElasticLoadBalancersResult extends js.Object {
    var ElasticLoadBalancers: js.UndefOr[ElasticLoadBalancers]
  }

  object DescribeElasticLoadBalancersResult {
    def apply(
        ElasticLoadBalancers: js.UndefOr[ElasticLoadBalancers] = js.undefined
    ): DescribeElasticLoadBalancersResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ElasticLoadBalancers.foreach(__v => __obj.update("ElasticLoadBalancers", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeElasticLoadBalancersResult]
    }
  }

  @js.native
  trait DescribeInstancesRequest extends js.Object {
    var InstanceIds: js.UndefOr[Strings]
    var LayerId: js.UndefOr[String]
    var StackId: js.UndefOr[String]
  }

  object DescribeInstancesRequest {
    def apply(
        InstanceIds: js.UndefOr[Strings] = js.undefined,
        LayerId: js.UndefOr[String] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined
    ): DescribeInstancesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      InstanceIds.foreach(__v => __obj.update("InstanceIds", __v.asInstanceOf[js.Any]))
      LayerId.foreach(__v => __obj.update("LayerId", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstancesRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeInstances</code> request.
    */
  @js.native
  trait DescribeInstancesResult extends js.Object {
    var Instances: js.UndefOr[Instances]
  }

  object DescribeInstancesResult {
    def apply(
        Instances: js.UndefOr[Instances] = js.undefined
    ): DescribeInstancesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Instances.foreach(__v => __obj.update("Instances", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstancesResult]
    }
  }

  @js.native
  trait DescribeLayersRequest extends js.Object {
    var LayerIds: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
  }

  object DescribeLayersRequest {
    def apply(
        LayerIds: js.UndefOr[Strings] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined
    ): DescribeLayersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      LayerIds.foreach(__v => __obj.update("LayerIds", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLayersRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeLayers</code> request.
    */
  @js.native
  trait DescribeLayersResult extends js.Object {
    var Layers: js.UndefOr[Layers]
  }

  object DescribeLayersResult {
    def apply(
        Layers: js.UndefOr[Layers] = js.undefined
    ): DescribeLayersResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Layers.foreach(__v => __obj.update("Layers", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLayersResult]
    }
  }

  @js.native
  trait DescribeLoadBasedAutoScalingRequest extends js.Object {
    var LayerIds: Strings
  }

  object DescribeLoadBasedAutoScalingRequest {
    def apply(
        LayerIds: Strings
    ): DescribeLoadBasedAutoScalingRequest = {
      val __obj = js.Dictionary[js.Any](
        "LayerIds" -> LayerIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeLoadBasedAutoScalingRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeLoadBasedAutoScaling</code> request.
    */
  @js.native
  trait DescribeLoadBasedAutoScalingResult extends js.Object {
    var LoadBasedAutoScalingConfigurations: js.UndefOr[LoadBasedAutoScalingConfigurations]
  }

  object DescribeLoadBasedAutoScalingResult {
    def apply(
        LoadBasedAutoScalingConfigurations: js.UndefOr[LoadBasedAutoScalingConfigurations] = js.undefined
    ): DescribeLoadBasedAutoScalingResult = {
      val __obj = js.Dictionary.empty[js.Any]
      LoadBasedAutoScalingConfigurations.foreach(
        __v => __obj.update("LoadBasedAutoScalingConfigurations", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeLoadBasedAutoScalingResult]
    }
  }

  /**
    * Contains the response to a <code>DescribeMyUserProfile</code> request.
    */
  @js.native
  trait DescribeMyUserProfileResult extends js.Object {
    var UserProfile: js.UndefOr[SelfUserProfile]
  }

  object DescribeMyUserProfileResult {
    def apply(
        UserProfile: js.UndefOr[SelfUserProfile] = js.undefined
    ): DescribeMyUserProfileResult = {
      val __obj = js.Dictionary.empty[js.Any]
      UserProfile.foreach(__v => __obj.update("UserProfile", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMyUserProfileResult]
    }
  }

  /**
    * The response to a <code>DescribeOperatingSystems</code> request.
    */
  @js.native
  trait DescribeOperatingSystemsResponse extends js.Object {
    var OperatingSystems: js.UndefOr[OperatingSystems]
  }

  object DescribeOperatingSystemsResponse {
    def apply(
        OperatingSystems: js.UndefOr[OperatingSystems] = js.undefined
    ): DescribeOperatingSystemsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      OperatingSystems.foreach(__v => __obj.update("OperatingSystems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOperatingSystemsResponse]
    }
  }

  @js.native
  trait DescribePermissionsRequest extends js.Object {
    var IamUserArn: js.UndefOr[String]
    var StackId: js.UndefOr[String]
  }

  object DescribePermissionsRequest {
    def apply(
        IamUserArn: js.UndefOr[String] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined
    ): DescribePermissionsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      IamUserArn.foreach(__v => __obj.update("IamUserArn", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePermissionsRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribePermissions</code> request.
    */
  @js.native
  trait DescribePermissionsResult extends js.Object {
    var Permissions: js.UndefOr[Permissions]
  }

  object DescribePermissionsResult {
    def apply(
        Permissions: js.UndefOr[Permissions] = js.undefined
    ): DescribePermissionsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Permissions.foreach(__v => __obj.update("Permissions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePermissionsResult]
    }
  }

  @js.native
  trait DescribeRaidArraysRequest extends js.Object {
    var InstanceId: js.UndefOr[String]
    var RaidArrayIds: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
  }

  object DescribeRaidArraysRequest {
    def apply(
        InstanceId: js.UndefOr[String] = js.undefined,
        RaidArrayIds: js.UndefOr[Strings] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined
    ): DescribeRaidArraysRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      RaidArrayIds.foreach(__v => __obj.update("RaidArrayIds", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRaidArraysRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeRaidArrays</code> request.
    */
  @js.native
  trait DescribeRaidArraysResult extends js.Object {
    var RaidArrays: js.UndefOr[RaidArrays]
  }

  object DescribeRaidArraysResult {
    def apply(
        RaidArrays: js.UndefOr[RaidArrays] = js.undefined
    ): DescribeRaidArraysResult = {
      val __obj = js.Dictionary.empty[js.Any]
      RaidArrays.foreach(__v => __obj.update("RaidArrays", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRaidArraysResult]
    }
  }

  @js.native
  trait DescribeRdsDbInstancesRequest extends js.Object {
    var StackId: String
    var RdsDbInstanceArns: js.UndefOr[Strings]
  }

  object DescribeRdsDbInstancesRequest {
    def apply(
        StackId: String,
        RdsDbInstanceArns: js.UndefOr[Strings] = js.undefined
    ): DescribeRdsDbInstancesRequest = {
      val __obj = js.Dictionary[js.Any](
        "StackId" -> StackId.asInstanceOf[js.Any]
      )

      RdsDbInstanceArns.foreach(__v => __obj.update("RdsDbInstanceArns", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRdsDbInstancesRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeRdsDbInstances</code> request.
    */
  @js.native
  trait DescribeRdsDbInstancesResult extends js.Object {
    var RdsDbInstances: js.UndefOr[RdsDbInstances]
  }

  object DescribeRdsDbInstancesResult {
    def apply(
        RdsDbInstances: js.UndefOr[RdsDbInstances] = js.undefined
    ): DescribeRdsDbInstancesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      RdsDbInstances.foreach(__v => __obj.update("RdsDbInstances", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRdsDbInstancesResult]
    }
  }

  @js.native
  trait DescribeServiceErrorsRequest extends js.Object {
    var InstanceId: js.UndefOr[String]
    var ServiceErrorIds: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
  }

  object DescribeServiceErrorsRequest {
    def apply(
        InstanceId: js.UndefOr[String] = js.undefined,
        ServiceErrorIds: js.UndefOr[Strings] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined
    ): DescribeServiceErrorsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      ServiceErrorIds.foreach(__v => __obj.update("ServiceErrorIds", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServiceErrorsRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeServiceErrors</code> request.
    */
  @js.native
  trait DescribeServiceErrorsResult extends js.Object {
    var ServiceErrors: js.UndefOr[ServiceErrors]
  }

  object DescribeServiceErrorsResult {
    def apply(
        ServiceErrors: js.UndefOr[ServiceErrors] = js.undefined
    ): DescribeServiceErrorsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ServiceErrors.foreach(__v => __obj.update("ServiceErrors", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServiceErrorsResult]
    }
  }

  @js.native
  trait DescribeStackProvisioningParametersRequest extends js.Object {
    var StackId: String
  }

  object DescribeStackProvisioningParametersRequest {
    def apply(
        StackId: String
    ): DescribeStackProvisioningParametersRequest = {
      val __obj = js.Dictionary[js.Any](
        "StackId" -> StackId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeStackProvisioningParametersRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeStackProvisioningParameters</code> request.
    */
  @js.native
  trait DescribeStackProvisioningParametersResult extends js.Object {
    var AgentInstallerUrl: js.UndefOr[String]
    var Parameters: js.UndefOr[Parameters]
  }

  object DescribeStackProvisioningParametersResult {
    def apply(
        AgentInstallerUrl: js.UndefOr[String] = js.undefined,
        Parameters: js.UndefOr[Parameters] = js.undefined
    ): DescribeStackProvisioningParametersResult = {
      val __obj = js.Dictionary.empty[js.Any]
      AgentInstallerUrl.foreach(__v => __obj.update("AgentInstallerUrl", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStackProvisioningParametersResult]
    }
  }

  @js.native
  trait DescribeStackSummaryRequest extends js.Object {
    var StackId: String
  }

  object DescribeStackSummaryRequest {
    def apply(
        StackId: String
    ): DescribeStackSummaryRequest = {
      val __obj = js.Dictionary[js.Any](
        "StackId" -> StackId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeStackSummaryRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeStackSummary</code> request.
    */
  @js.native
  trait DescribeStackSummaryResult extends js.Object {
    var StackSummary: js.UndefOr[StackSummary]
  }

  object DescribeStackSummaryResult {
    def apply(
        StackSummary: js.UndefOr[StackSummary] = js.undefined
    ): DescribeStackSummaryResult = {
      val __obj = js.Dictionary.empty[js.Any]
      StackSummary.foreach(__v => __obj.update("StackSummary", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStackSummaryResult]
    }
  }

  @js.native
  trait DescribeStacksRequest extends js.Object {
    var StackIds: js.UndefOr[Strings]
  }

  object DescribeStacksRequest {
    def apply(
        StackIds: js.UndefOr[Strings] = js.undefined
    ): DescribeStacksRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      StackIds.foreach(__v => __obj.update("StackIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStacksRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeStacks</code> request.
    */
  @js.native
  trait DescribeStacksResult extends js.Object {
    var Stacks: js.UndefOr[Stacks]
  }

  object DescribeStacksResult {
    def apply(
        Stacks: js.UndefOr[Stacks] = js.undefined
    ): DescribeStacksResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Stacks.foreach(__v => __obj.update("Stacks", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStacksResult]
    }
  }

  @js.native
  trait DescribeTimeBasedAutoScalingRequest extends js.Object {
    var InstanceIds: Strings
  }

  object DescribeTimeBasedAutoScalingRequest {
    def apply(
        InstanceIds: Strings
    ): DescribeTimeBasedAutoScalingRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceIds" -> InstanceIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeTimeBasedAutoScalingRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeTimeBasedAutoScaling</code> request.
    */
  @js.native
  trait DescribeTimeBasedAutoScalingResult extends js.Object {
    var TimeBasedAutoScalingConfigurations: js.UndefOr[TimeBasedAutoScalingConfigurations]
  }

  object DescribeTimeBasedAutoScalingResult {
    def apply(
        TimeBasedAutoScalingConfigurations: js.UndefOr[TimeBasedAutoScalingConfigurations] = js.undefined
    ): DescribeTimeBasedAutoScalingResult = {
      val __obj = js.Dictionary.empty[js.Any]
      TimeBasedAutoScalingConfigurations.foreach(
        __v => __obj.update("TimeBasedAutoScalingConfigurations", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeTimeBasedAutoScalingResult]
    }
  }

  @js.native
  trait DescribeUserProfilesRequest extends js.Object {
    var IamUserArns: js.UndefOr[Strings]
  }

  object DescribeUserProfilesRequest {
    def apply(
        IamUserArns: js.UndefOr[Strings] = js.undefined
    ): DescribeUserProfilesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      IamUserArns.foreach(__v => __obj.update("IamUserArns", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserProfilesRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeUserProfiles</code> request.
    */
  @js.native
  trait DescribeUserProfilesResult extends js.Object {
    var UserProfiles: js.UndefOr[UserProfiles]
  }

  object DescribeUserProfilesResult {
    def apply(
        UserProfiles: js.UndefOr[UserProfiles] = js.undefined
    ): DescribeUserProfilesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      UserProfiles.foreach(__v => __obj.update("UserProfiles", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserProfilesResult]
    }
  }

  @js.native
  trait DescribeVolumesRequest extends js.Object {
    var InstanceId: js.UndefOr[String]
    var RaidArrayId: js.UndefOr[String]
    var StackId: js.UndefOr[String]
    var VolumeIds: js.UndefOr[Strings]
  }

  object DescribeVolumesRequest {
    def apply(
        InstanceId: js.UndefOr[String] = js.undefined,
        RaidArrayId: js.UndefOr[String] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined,
        VolumeIds: js.UndefOr[Strings] = js.undefined
    ): DescribeVolumesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      RaidArrayId.foreach(__v => __obj.update("RaidArrayId", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      VolumeIds.foreach(__v => __obj.update("VolumeIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVolumesRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeVolumes</code> request.
    */
  @js.native
  trait DescribeVolumesResult extends js.Object {
    var Volumes: js.UndefOr[Volumes]
  }

  object DescribeVolumesResult {
    def apply(
        Volumes: js.UndefOr[Volumes] = js.undefined
    ): DescribeVolumesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Volumes.foreach(__v => __obj.update("Volumes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVolumesResult]
    }
  }

  @js.native
  trait DetachElasticLoadBalancerRequest extends js.Object {
    var ElasticLoadBalancerName: String
    var LayerId: String
  }

  object DetachElasticLoadBalancerRequest {
    def apply(
        ElasticLoadBalancerName: String,
        LayerId: String
    ): DetachElasticLoadBalancerRequest = {
      val __obj = js.Dictionary[js.Any](
        "ElasticLoadBalancerName" -> ElasticLoadBalancerName.asInstanceOf[js.Any],
        "LayerId"                 -> LayerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetachElasticLoadBalancerRequest]
    }
  }

  @js.native
  trait DisassociateElasticIpRequest extends js.Object {
    var ElasticIp: String
  }

  object DisassociateElasticIpRequest {
    def apply(
        ElasticIp: String
    ): DisassociateElasticIpRequest = {
      val __obj = js.Dictionary[js.Any](
        "ElasticIp" -> ElasticIp.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateElasticIpRequest]
    }
  }

  /**
    * Describes an Amazon EBS volume. This data type maps directly to the Amazon EC2 [[https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html|EbsBlockDevice]] data type.
    */
  @js.native
  trait EbsBlockDevice extends js.Object {
    var DeleteOnTermination: js.UndefOr[Boolean]
    var Iops: js.UndefOr[Int]
    var SnapshotId: js.UndefOr[String]
    var VolumeSize: js.UndefOr[Int]
    var VolumeType: js.UndefOr[VolumeType]
  }

  object EbsBlockDevice {
    def apply(
        DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
        Iops: js.UndefOr[Int] = js.undefined,
        SnapshotId: js.UndefOr[String] = js.undefined,
        VolumeSize: js.UndefOr[Int] = js.undefined,
        VolumeType: js.UndefOr[VolumeType] = js.undefined
    ): EbsBlockDevice = {
      val __obj = js.Dictionary.empty[js.Any]
      DeleteOnTermination.foreach(__v => __obj.update("DeleteOnTermination", __v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.update("Iops", __v.asInstanceOf[js.Any]))
      SnapshotId.foreach(__v => __obj.update("SnapshotId", __v.asInstanceOf[js.Any]))
      VolumeSize.foreach(__v => __obj.update("VolumeSize", __v.asInstanceOf[js.Any]))
      VolumeType.foreach(__v => __obj.update("VolumeType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EbsBlockDevice]
    }
  }

  /**
    * Describes a registered Amazon ECS cluster.
    */
  @js.native
  trait EcsCluster extends js.Object {
    var EcsClusterArn: js.UndefOr[String]
    var EcsClusterName: js.UndefOr[String]
    var RegisteredAt: js.UndefOr[DateTime]
    var StackId: js.UndefOr[String]
  }

  object EcsCluster {
    def apply(
        EcsClusterArn: js.UndefOr[String] = js.undefined,
        EcsClusterName: js.UndefOr[String] = js.undefined,
        RegisteredAt: js.UndefOr[DateTime] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined
    ): EcsCluster = {
      val __obj = js.Dictionary.empty[js.Any]
      EcsClusterArn.foreach(__v => __obj.update("EcsClusterArn", __v.asInstanceOf[js.Any]))
      EcsClusterName.foreach(__v => __obj.update("EcsClusterName", __v.asInstanceOf[js.Any]))
      RegisteredAt.foreach(__v => __obj.update("RegisteredAt", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EcsCluster]
    }
  }

  /**
    * Describes an Elastic IP address.
    */
  @js.native
  trait ElasticIp extends js.Object {
    var Domain: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var Ip: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Region: js.UndefOr[String]
  }

  object ElasticIp {
    def apply(
        Domain: js.UndefOr[String] = js.undefined,
        InstanceId: js.UndefOr[String] = js.undefined,
        Ip: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Region: js.UndefOr[String] = js.undefined
    ): ElasticIp = {
      val __obj = js.Dictionary.empty[js.Any]
      Domain.foreach(__v => __obj.update("Domain", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      Ip.foreach(__v => __obj.update("Ip", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.update("Region", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ElasticIp]
    }
  }

  /**
    * Describes an Elastic Load Balancing instance.
    */
  @js.native
  trait ElasticLoadBalancer extends js.Object {
    var AvailabilityZones: js.UndefOr[Strings]
    var DnsName: js.UndefOr[String]
    var Ec2InstanceIds: js.UndefOr[Strings]
    var ElasticLoadBalancerName: js.UndefOr[String]
    var LayerId: js.UndefOr[String]
    var Region: js.UndefOr[String]
    var StackId: js.UndefOr[String]
    var SubnetIds: js.UndefOr[Strings]
    var VpcId: js.UndefOr[String]
  }

  object ElasticLoadBalancer {
    def apply(
        AvailabilityZones: js.UndefOr[Strings] = js.undefined,
        DnsName: js.UndefOr[String] = js.undefined,
        Ec2InstanceIds: js.UndefOr[Strings] = js.undefined,
        ElasticLoadBalancerName: js.UndefOr[String] = js.undefined,
        LayerId: js.UndefOr[String] = js.undefined,
        Region: js.UndefOr[String] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined,
        SubnetIds: js.UndefOr[Strings] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): ElasticLoadBalancer = {
      val __obj = js.Dictionary.empty[js.Any]
      AvailabilityZones.foreach(__v => __obj.update("AvailabilityZones", __v.asInstanceOf[js.Any]))
      DnsName.foreach(__v => __obj.update("DnsName", __v.asInstanceOf[js.Any]))
      Ec2InstanceIds.foreach(__v => __obj.update("Ec2InstanceIds", __v.asInstanceOf[js.Any]))
      ElasticLoadBalancerName.foreach(__v => __obj.update("ElasticLoadBalancerName", __v.asInstanceOf[js.Any]))
      LayerId.foreach(__v => __obj.update("LayerId", __v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.update("Region", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.update("SubnetIds", __v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.update("VpcId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ElasticLoadBalancer]
    }
  }

  /**
    * Represents an app's environment variable.
    */
  @js.native
  trait EnvironmentVariable extends js.Object {
    var Key: String
    var Value: String
    var Secure: js.UndefOr[Boolean]
  }

  object EnvironmentVariable {
    def apply(
        Key: String,
        Value: String,
        Secure: js.UndefOr[Boolean] = js.undefined
    ): EnvironmentVariable = {
      val __obj = js.Dictionary[js.Any](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      Secure.foreach(__v => __obj.update("Secure", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentVariable]
    }
  }

  @js.native
  trait GetHostnameSuggestionRequest extends js.Object {
    var LayerId: String
  }

  object GetHostnameSuggestionRequest {
    def apply(
        LayerId: String
    ): GetHostnameSuggestionRequest = {
      val __obj = js.Dictionary[js.Any](
        "LayerId" -> LayerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetHostnameSuggestionRequest]
    }
  }

  /**
    * Contains the response to a <code>GetHostnameSuggestion</code> request.
    */
  @js.native
  trait GetHostnameSuggestionResult extends js.Object {
    var Hostname: js.UndefOr[String]
    var LayerId: js.UndefOr[String]
  }

  object GetHostnameSuggestionResult {
    def apply(
        Hostname: js.UndefOr[String] = js.undefined,
        LayerId: js.UndefOr[String] = js.undefined
    ): GetHostnameSuggestionResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Hostname.foreach(__v => __obj.update("Hostname", __v.asInstanceOf[js.Any]))
      LayerId.foreach(__v => __obj.update("LayerId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetHostnameSuggestionResult]
    }
  }

  @js.native
  trait GrantAccessRequest extends js.Object {
    var InstanceId: String
    var ValidForInMinutes: js.UndefOr[ValidForInMinutes]
  }

  object GrantAccessRequest {
    def apply(
        InstanceId: String,
        ValidForInMinutes: js.UndefOr[ValidForInMinutes] = js.undefined
    ): GrantAccessRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      ValidForInMinutes.foreach(__v => __obj.update("ValidForInMinutes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrantAccessRequest]
    }
  }

  /**
    * Contains the response to a <code>GrantAccess</code> request.
    */
  @js.native
  trait GrantAccessResult extends js.Object {
    var TemporaryCredential: js.UndefOr[TemporaryCredential]
  }

  object GrantAccessResult {
    def apply(
        TemporaryCredential: js.UndefOr[TemporaryCredential] = js.undefined
    ): GrantAccessResult = {
      val __obj = js.Dictionary.empty[js.Any]
      TemporaryCredential.foreach(__v => __obj.update("TemporaryCredential", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrantAccessResult]
    }
  }

  /**
    * Describes an instance.
    */
  @js.native
  trait Instance extends js.Object {
    var AgentVersion: js.UndefOr[String]
    var AmiId: js.UndefOr[String]
    var Architecture: js.UndefOr[Architecture]
    var Arn: js.UndefOr[String]
    var AutoScalingType: js.UndefOr[AutoScalingType]
    var AvailabilityZone: js.UndefOr[String]
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappings]
    var CreatedAt: js.UndefOr[DateTime]
    var EbsOptimized: js.UndefOr[Boolean]
    var Ec2InstanceId: js.UndefOr[String]
    var EcsClusterArn: js.UndefOr[String]
    var EcsContainerInstanceArn: js.UndefOr[String]
    var ElasticIp: js.UndefOr[String]
    var Hostname: js.UndefOr[String]
    var InfrastructureClass: js.UndefOr[String]
    var InstallUpdatesOnBoot: js.UndefOr[Boolean]
    var InstanceId: js.UndefOr[String]
    var InstanceProfileArn: js.UndefOr[String]
    var InstanceType: js.UndefOr[String]
    var LastServiceErrorId: js.UndefOr[String]
    var LayerIds: js.UndefOr[Strings]
    var Os: js.UndefOr[String]
    var Platform: js.UndefOr[String]
    var PrivateDns: js.UndefOr[String]
    var PrivateIp: js.UndefOr[String]
    var PublicDns: js.UndefOr[String]
    var PublicIp: js.UndefOr[String]
    var RegisteredBy: js.UndefOr[String]
    var ReportedAgentVersion: js.UndefOr[String]
    var ReportedOs: js.UndefOr[ReportedOs]
    var RootDeviceType: js.UndefOr[RootDeviceType]
    var RootDeviceVolumeId: js.UndefOr[String]
    var SecurityGroupIds: js.UndefOr[Strings]
    var SshHostDsaKeyFingerprint: js.UndefOr[String]
    var SshHostRsaKeyFingerprint: js.UndefOr[String]
    var SshKeyName: js.UndefOr[String]
    var StackId: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
    var Tenancy: js.UndefOr[String]
    var VirtualizationType: js.UndefOr[VirtualizationType]
  }

  object Instance {
    def apply(
        AgentVersion: js.UndefOr[String] = js.undefined,
        AmiId: js.UndefOr[String] = js.undefined,
        Architecture: js.UndefOr[Architecture] = js.undefined,
        Arn: js.UndefOr[String] = js.undefined,
        AutoScalingType: js.UndefOr[AutoScalingType] = js.undefined,
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        BlockDeviceMappings: js.UndefOr[BlockDeviceMappings] = js.undefined,
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        EbsOptimized: js.UndefOr[Boolean] = js.undefined,
        Ec2InstanceId: js.UndefOr[String] = js.undefined,
        EcsClusterArn: js.UndefOr[String] = js.undefined,
        EcsContainerInstanceArn: js.UndefOr[String] = js.undefined,
        ElasticIp: js.UndefOr[String] = js.undefined,
        Hostname: js.UndefOr[String] = js.undefined,
        InfrastructureClass: js.UndefOr[String] = js.undefined,
        InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined,
        InstanceId: js.UndefOr[String] = js.undefined,
        InstanceProfileArn: js.UndefOr[String] = js.undefined,
        InstanceType: js.UndefOr[String] = js.undefined,
        LastServiceErrorId: js.UndefOr[String] = js.undefined,
        LayerIds: js.UndefOr[Strings] = js.undefined,
        Os: js.UndefOr[String] = js.undefined,
        Platform: js.UndefOr[String] = js.undefined,
        PrivateDns: js.UndefOr[String] = js.undefined,
        PrivateIp: js.UndefOr[String] = js.undefined,
        PublicDns: js.UndefOr[String] = js.undefined,
        PublicIp: js.UndefOr[String] = js.undefined,
        RegisteredBy: js.UndefOr[String] = js.undefined,
        ReportedAgentVersion: js.UndefOr[String] = js.undefined,
        ReportedOs: js.UndefOr[ReportedOs] = js.undefined,
        RootDeviceType: js.UndefOr[RootDeviceType] = js.undefined,
        RootDeviceVolumeId: js.UndefOr[String] = js.undefined,
        SecurityGroupIds: js.UndefOr[Strings] = js.undefined,
        SshHostDsaKeyFingerprint: js.UndefOr[String] = js.undefined,
        SshHostRsaKeyFingerprint: js.UndefOr[String] = js.undefined,
        SshKeyName: js.UndefOr[String] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        SubnetId: js.UndefOr[String] = js.undefined,
        Tenancy: js.UndefOr[String] = js.undefined,
        VirtualizationType: js.UndefOr[VirtualizationType] = js.undefined
    ): Instance = {
      val __obj = js.Dictionary.empty[js.Any]
      AgentVersion.foreach(__v => __obj.update("AgentVersion", __v.asInstanceOf[js.Any]))
      AmiId.foreach(__v => __obj.update("AmiId", __v.asInstanceOf[js.Any]))
      Architecture.foreach(__v => __obj.update("Architecture", __v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      AutoScalingType.foreach(__v => __obj.update("AutoScalingType", __v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.update("AvailabilityZone", __v.asInstanceOf[js.Any]))
      BlockDeviceMappings.foreach(__v => __obj.update("BlockDeviceMappings", __v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.update("CreatedAt", __v.asInstanceOf[js.Any]))
      EbsOptimized.foreach(__v => __obj.update("EbsOptimized", __v.asInstanceOf[js.Any]))
      Ec2InstanceId.foreach(__v => __obj.update("Ec2InstanceId", __v.asInstanceOf[js.Any]))
      EcsClusterArn.foreach(__v => __obj.update("EcsClusterArn", __v.asInstanceOf[js.Any]))
      EcsContainerInstanceArn.foreach(__v => __obj.update("EcsContainerInstanceArn", __v.asInstanceOf[js.Any]))
      ElasticIp.foreach(__v => __obj.update("ElasticIp", __v.asInstanceOf[js.Any]))
      Hostname.foreach(__v => __obj.update("Hostname", __v.asInstanceOf[js.Any]))
      InfrastructureClass.foreach(__v => __obj.update("InfrastructureClass", __v.asInstanceOf[js.Any]))
      InstallUpdatesOnBoot.foreach(__v => __obj.update("InstallUpdatesOnBoot", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      InstanceProfileArn.foreach(__v => __obj.update("InstanceProfileArn", __v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.update("InstanceType", __v.asInstanceOf[js.Any]))
      LastServiceErrorId.foreach(__v => __obj.update("LastServiceErrorId", __v.asInstanceOf[js.Any]))
      LayerIds.foreach(__v => __obj.update("LayerIds", __v.asInstanceOf[js.Any]))
      Os.foreach(__v => __obj.update("Os", __v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.update("Platform", __v.asInstanceOf[js.Any]))
      PrivateDns.foreach(__v => __obj.update("PrivateDns", __v.asInstanceOf[js.Any]))
      PrivateIp.foreach(__v => __obj.update("PrivateIp", __v.asInstanceOf[js.Any]))
      PublicDns.foreach(__v => __obj.update("PublicDns", __v.asInstanceOf[js.Any]))
      PublicIp.foreach(__v => __obj.update("PublicIp", __v.asInstanceOf[js.Any]))
      RegisteredBy.foreach(__v => __obj.update("RegisteredBy", __v.asInstanceOf[js.Any]))
      ReportedAgentVersion.foreach(__v => __obj.update("ReportedAgentVersion", __v.asInstanceOf[js.Any]))
      ReportedOs.foreach(__v => __obj.update("ReportedOs", __v.asInstanceOf[js.Any]))
      RootDeviceType.foreach(__v => __obj.update("RootDeviceType", __v.asInstanceOf[js.Any]))
      RootDeviceVolumeId.foreach(__v => __obj.update("RootDeviceVolumeId", __v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.update("SecurityGroupIds", __v.asInstanceOf[js.Any]))
      SshHostDsaKeyFingerprint.foreach(__v => __obj.update("SshHostDsaKeyFingerprint", __v.asInstanceOf[js.Any]))
      SshHostRsaKeyFingerprint.foreach(__v => __obj.update("SshHostRsaKeyFingerprint", __v.asInstanceOf[js.Any]))
      SshKeyName.foreach(__v => __obj.update("SshKeyName", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.update("SubnetId", __v.asInstanceOf[js.Any]))
      Tenancy.foreach(__v => __obj.update("Tenancy", __v.asInstanceOf[js.Any]))
      VirtualizationType.foreach(__v => __obj.update("VirtualizationType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Instance]
    }
  }

  /**
    * Contains a description of an Amazon EC2 instance from the Amazon EC2 metadata service. For more information, see [[https://docs.aws.amazon.com/sdkfornet/latest/apidocs/Index.html|Instance Metadata and User Data]].
    */
  @js.native
  trait InstanceIdentity extends js.Object {
    var Document: js.UndefOr[String]
    var Signature: js.UndefOr[String]
  }

  object InstanceIdentity {
    def apply(
        Document: js.UndefOr[String] = js.undefined,
        Signature: js.UndefOr[String] = js.undefined
    ): InstanceIdentity = {
      val __obj = js.Dictionary.empty[js.Any]
      Document.foreach(__v => __obj.update("Document", __v.asInstanceOf[js.Any]))
      Signature.foreach(__v => __obj.update("Signature", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceIdentity]
    }
  }

  /**
    * Describes how many instances a stack has for each status.
    */
  @js.native
  trait InstancesCount extends js.Object {
    var Assigning: js.UndefOr[Int]
    var Booting: js.UndefOr[Int]
    var ConnectionLost: js.UndefOr[Int]
    var Deregistering: js.UndefOr[Int]
    var Online: js.UndefOr[Int]
    var Pending: js.UndefOr[Int]
    var Rebooting: js.UndefOr[Int]
    var Registered: js.UndefOr[Int]
    var Registering: js.UndefOr[Int]
    var Requested: js.UndefOr[Int]
    var RunningSetup: js.UndefOr[Int]
    var SetupFailed: js.UndefOr[Int]
    var ShuttingDown: js.UndefOr[Int]
    var StartFailed: js.UndefOr[Int]
    var StopFailed: js.UndefOr[Int]
    var Stopped: js.UndefOr[Int]
    var Stopping: js.UndefOr[Int]
    var Terminated: js.UndefOr[Int]
    var Terminating: js.UndefOr[Int]
    var Unassigning: js.UndefOr[Int]
  }

  object InstancesCount {
    def apply(
        Assigning: js.UndefOr[Int] = js.undefined,
        Booting: js.UndefOr[Int] = js.undefined,
        ConnectionLost: js.UndefOr[Int] = js.undefined,
        Deregistering: js.UndefOr[Int] = js.undefined,
        Online: js.UndefOr[Int] = js.undefined,
        Pending: js.UndefOr[Int] = js.undefined,
        Rebooting: js.UndefOr[Int] = js.undefined,
        Registered: js.UndefOr[Int] = js.undefined,
        Registering: js.UndefOr[Int] = js.undefined,
        Requested: js.UndefOr[Int] = js.undefined,
        RunningSetup: js.UndefOr[Int] = js.undefined,
        SetupFailed: js.UndefOr[Int] = js.undefined,
        ShuttingDown: js.UndefOr[Int] = js.undefined,
        StartFailed: js.UndefOr[Int] = js.undefined,
        StopFailed: js.UndefOr[Int] = js.undefined,
        Stopped: js.UndefOr[Int] = js.undefined,
        Stopping: js.UndefOr[Int] = js.undefined,
        Terminated: js.UndefOr[Int] = js.undefined,
        Terminating: js.UndefOr[Int] = js.undefined,
        Unassigning: js.UndefOr[Int] = js.undefined
    ): InstancesCount = {
      val __obj = js.Dictionary.empty[js.Any]
      Assigning.foreach(__v => __obj.update("Assigning", __v.asInstanceOf[js.Any]))
      Booting.foreach(__v => __obj.update("Booting", __v.asInstanceOf[js.Any]))
      ConnectionLost.foreach(__v => __obj.update("ConnectionLost", __v.asInstanceOf[js.Any]))
      Deregistering.foreach(__v => __obj.update("Deregistering", __v.asInstanceOf[js.Any]))
      Online.foreach(__v => __obj.update("Online", __v.asInstanceOf[js.Any]))
      Pending.foreach(__v => __obj.update("Pending", __v.asInstanceOf[js.Any]))
      Rebooting.foreach(__v => __obj.update("Rebooting", __v.asInstanceOf[js.Any]))
      Registered.foreach(__v => __obj.update("Registered", __v.asInstanceOf[js.Any]))
      Registering.foreach(__v => __obj.update("Registering", __v.asInstanceOf[js.Any]))
      Requested.foreach(__v => __obj.update("Requested", __v.asInstanceOf[js.Any]))
      RunningSetup.foreach(__v => __obj.update("RunningSetup", __v.asInstanceOf[js.Any]))
      SetupFailed.foreach(__v => __obj.update("SetupFailed", __v.asInstanceOf[js.Any]))
      ShuttingDown.foreach(__v => __obj.update("ShuttingDown", __v.asInstanceOf[js.Any]))
      StartFailed.foreach(__v => __obj.update("StartFailed", __v.asInstanceOf[js.Any]))
      StopFailed.foreach(__v => __obj.update("StopFailed", __v.asInstanceOf[js.Any]))
      Stopped.foreach(__v => __obj.update("Stopped", __v.asInstanceOf[js.Any]))
      Stopping.foreach(__v => __obj.update("Stopping", __v.asInstanceOf[js.Any]))
      Terminated.foreach(__v => __obj.update("Terminated", __v.asInstanceOf[js.Any]))
      Terminating.foreach(__v => __obj.update("Terminating", __v.asInstanceOf[js.Any]))
      Unassigning.foreach(__v => __obj.update("Unassigning", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstancesCount]
    }
  }

  /**
    * Describes a layer.
    */
  @js.native
  trait Layer extends js.Object {
    var Arn: js.UndefOr[String]
    var Attributes: js.UndefOr[LayerAttributes]
    var AutoAssignElasticIps: js.UndefOr[Boolean]
    var AutoAssignPublicIps: js.UndefOr[Boolean]
    var CloudWatchLogsConfiguration: js.UndefOr[CloudWatchLogsConfiguration]
    var CreatedAt: js.UndefOr[DateTime]
    var CustomInstanceProfileArn: js.UndefOr[String]
    var CustomJson: js.UndefOr[String]
    var CustomRecipes: js.UndefOr[Recipes]
    var CustomSecurityGroupIds: js.UndefOr[Strings]
    var DefaultRecipes: js.UndefOr[Recipes]
    var DefaultSecurityGroupNames: js.UndefOr[Strings]
    var EnableAutoHealing: js.UndefOr[Boolean]
    var InstallUpdatesOnBoot: js.UndefOr[Boolean]
    var LayerId: js.UndefOr[String]
    var LifecycleEventConfiguration: js.UndefOr[LifecycleEventConfiguration]
    var Name: js.UndefOr[String]
    var Packages: js.UndefOr[Strings]
    var Shortname: js.UndefOr[String]
    var StackId: js.UndefOr[String]
    var Type: js.UndefOr[LayerType]
    var UseEbsOptimizedInstances: js.UndefOr[Boolean]
    var VolumeConfigurations: js.UndefOr[VolumeConfigurations]
  }

  object Layer {
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Attributes: js.UndefOr[LayerAttributes] = js.undefined,
        AutoAssignElasticIps: js.UndefOr[Boolean] = js.undefined,
        AutoAssignPublicIps: js.UndefOr[Boolean] = js.undefined,
        CloudWatchLogsConfiguration: js.UndefOr[CloudWatchLogsConfiguration] = js.undefined,
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        CustomInstanceProfileArn: js.UndefOr[String] = js.undefined,
        CustomJson: js.UndefOr[String] = js.undefined,
        CustomRecipes: js.UndefOr[Recipes] = js.undefined,
        CustomSecurityGroupIds: js.UndefOr[Strings] = js.undefined,
        DefaultRecipes: js.UndefOr[Recipes] = js.undefined,
        DefaultSecurityGroupNames: js.UndefOr[Strings] = js.undefined,
        EnableAutoHealing: js.UndefOr[Boolean] = js.undefined,
        InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined,
        LayerId: js.UndefOr[String] = js.undefined,
        LifecycleEventConfiguration: js.UndefOr[LifecycleEventConfiguration] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Packages: js.UndefOr[Strings] = js.undefined,
        Shortname: js.UndefOr[String] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[LayerType] = js.undefined,
        UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.undefined,
        VolumeConfigurations: js.UndefOr[VolumeConfigurations] = js.undefined
    ): Layer = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      AutoAssignElasticIps.foreach(__v => __obj.update("AutoAssignElasticIps", __v.asInstanceOf[js.Any]))
      AutoAssignPublicIps.foreach(__v => __obj.update("AutoAssignPublicIps", __v.asInstanceOf[js.Any]))
      CloudWatchLogsConfiguration.foreach(__v => __obj.update("CloudWatchLogsConfiguration", __v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.update("CreatedAt", __v.asInstanceOf[js.Any]))
      CustomInstanceProfileArn.foreach(__v => __obj.update("CustomInstanceProfileArn", __v.asInstanceOf[js.Any]))
      CustomJson.foreach(__v => __obj.update("CustomJson", __v.asInstanceOf[js.Any]))
      CustomRecipes.foreach(__v => __obj.update("CustomRecipes", __v.asInstanceOf[js.Any]))
      CustomSecurityGroupIds.foreach(__v => __obj.update("CustomSecurityGroupIds", __v.asInstanceOf[js.Any]))
      DefaultRecipes.foreach(__v => __obj.update("DefaultRecipes", __v.asInstanceOf[js.Any]))
      DefaultSecurityGroupNames.foreach(__v => __obj.update("DefaultSecurityGroupNames", __v.asInstanceOf[js.Any]))
      EnableAutoHealing.foreach(__v => __obj.update("EnableAutoHealing", __v.asInstanceOf[js.Any]))
      InstallUpdatesOnBoot.foreach(__v => __obj.update("InstallUpdatesOnBoot", __v.asInstanceOf[js.Any]))
      LayerId.foreach(__v => __obj.update("LayerId", __v.asInstanceOf[js.Any]))
      LifecycleEventConfiguration.foreach(__v => __obj.update("LifecycleEventConfiguration", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Packages.foreach(__v => __obj.update("Packages", __v.asInstanceOf[js.Any]))
      Shortname.foreach(__v => __obj.update("Shortname", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      UseEbsOptimizedInstances.foreach(__v => __obj.update("UseEbsOptimizedInstances", __v.asInstanceOf[js.Any]))
      VolumeConfigurations.foreach(__v => __obj.update("VolumeConfigurations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Layer]
    }
  }

  object LayerAttributesKeysEnum {
    val EcsClusterArn               = "EcsClusterArn"
    val EnableHaproxyStats          = "EnableHaproxyStats"
    val HaproxyStatsUrl             = "HaproxyStatsUrl"
    val HaproxyStatsUser            = "HaproxyStatsUser"
    val HaproxyStatsPassword        = "HaproxyStatsPassword"
    val HaproxyHealthCheckUrl       = "HaproxyHealthCheckUrl"
    val HaproxyHealthCheckMethod    = "HaproxyHealthCheckMethod"
    val MysqlRootPassword           = "MysqlRootPassword"
    val MysqlRootPasswordUbiquitous = "MysqlRootPasswordUbiquitous"
    val GangliaUrl                  = "GangliaUrl"
    val GangliaUser                 = "GangliaUser"
    val GangliaPassword             = "GangliaPassword"
    val MemcachedMemory             = "MemcachedMemory"
    val NodejsVersion               = "NodejsVersion"
    val RubyVersion                 = "RubyVersion"
    val RubygemsVersion             = "RubygemsVersion"
    val ManageBundler               = "ManageBundler"
    val BundlerVersion              = "BundlerVersion"
    val RailsStack                  = "RailsStack"
    val PassengerVersion            = "PassengerVersion"
    val Jvm                         = "Jvm"
    val JvmVersion                  = "JvmVersion"
    val JvmOptions                  = "JvmOptions"
    val JavaAppServer               = "JavaAppServer"
    val JavaAppServerVersion        = "JavaAppServerVersion"

    val values = js.Object.freeze(
      js.Array(
        EcsClusterArn,
        EnableHaproxyStats,
        HaproxyStatsUrl,
        HaproxyStatsUser,
        HaproxyStatsPassword,
        HaproxyHealthCheckUrl,
        HaproxyHealthCheckMethod,
        MysqlRootPassword,
        MysqlRootPasswordUbiquitous,
        GangliaUrl,
        GangliaUser,
        GangliaPassword,
        MemcachedMemory,
        NodejsVersion,
        RubyVersion,
        RubygemsVersion,
        ManageBundler,
        BundlerVersion,
        RailsStack,
        PassengerVersion,
        Jvm,
        JvmVersion,
        JvmOptions,
        JavaAppServer,
        JavaAppServerVersion
      )
    )
  }

  object LayerTypeEnum {
    val `aws-flow-ruby`     = "aws-flow-ruby"
    val `ecs-cluster`       = "ecs-cluster"
    val `java-app`          = "java-app"
    val lb                  = "lb"
    val web                 = "web"
    val `php-app`           = "php-app"
    val `rails-app`         = "rails-app"
    val `nodejs-app`        = "nodejs-app"
    val memcached           = "memcached"
    val `db-master`         = "db-master"
    val `monitoring-master` = "monitoring-master"
    val custom              = "custom"

    val values = js.Object.freeze(
      js.Array(
        `aws-flow-ruby`,
        `ecs-cluster`,
        `java-app`,
        lb,
        web,
        `php-app`,
        `rails-app`,
        `nodejs-app`,
        memcached,
        `db-master`,
        `monitoring-master`,
        custom
      )
    )
  }

  /**
    * Specifies the lifecycle event configuration
    */
  @js.native
  trait LifecycleEventConfiguration extends js.Object {
    var Shutdown: js.UndefOr[ShutdownEventConfiguration]
  }

  object LifecycleEventConfiguration {
    def apply(
        Shutdown: js.UndefOr[ShutdownEventConfiguration] = js.undefined
    ): LifecycleEventConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      Shutdown.foreach(__v => __obj.update("Shutdown", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecycleEventConfiguration]
    }
  }

  @js.native
  trait ListTagsRequest extends js.Object {
    var ResourceArn: ResourceArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsRequest {
    def apply(
        ResourceArn: ResourceArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsRequest]
    }
  }

  /**
    * Contains the response to a <code>ListTags</code> request.
    */
  @js.native
  trait ListTagsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsResult {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsResult]
    }
  }

  /**
    * Describes a layer's load-based auto scaling configuration.
    */
  @js.native
  trait LoadBasedAutoScalingConfiguration extends js.Object {
    var DownScaling: js.UndefOr[AutoScalingThresholds]
    var Enable: js.UndefOr[Boolean]
    var LayerId: js.UndefOr[String]
    var UpScaling: js.UndefOr[AutoScalingThresholds]
  }

  object LoadBasedAutoScalingConfiguration {
    def apply(
        DownScaling: js.UndefOr[AutoScalingThresholds] = js.undefined,
        Enable: js.UndefOr[Boolean] = js.undefined,
        LayerId: js.UndefOr[String] = js.undefined,
        UpScaling: js.UndefOr[AutoScalingThresholds] = js.undefined
    ): LoadBasedAutoScalingConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      DownScaling.foreach(__v => __obj.update("DownScaling", __v.asInstanceOf[js.Any]))
      Enable.foreach(__v => __obj.update("Enable", __v.asInstanceOf[js.Any]))
      LayerId.foreach(__v => __obj.update("LayerId", __v.asInstanceOf[js.Any]))
      UpScaling.foreach(__v => __obj.update("UpScaling", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBasedAutoScalingConfiguration]
    }
  }

  /**
    * Describes supported operating systems in AWS OpsWorks Stacks.
    */
  @js.native
  trait OperatingSystem extends js.Object {
    var ConfigurationManagers: js.UndefOr[OperatingSystemConfigurationManagers]
    var Id: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var ReportedName: js.UndefOr[String]
    var ReportedVersion: js.UndefOr[String]
    var Supported: js.UndefOr[Boolean]
    var Type: js.UndefOr[String]
  }

  object OperatingSystem {
    def apply(
        ConfigurationManagers: js.UndefOr[OperatingSystemConfigurationManagers] = js.undefined,
        Id: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        ReportedName: js.UndefOr[String] = js.undefined,
        ReportedVersion: js.UndefOr[String] = js.undefined,
        Supported: js.UndefOr[Boolean] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): OperatingSystem = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigurationManagers.foreach(__v => __obj.update("ConfigurationManagers", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      ReportedName.foreach(__v => __obj.update("ReportedName", __v.asInstanceOf[js.Any]))
      ReportedVersion.foreach(__v => __obj.update("ReportedVersion", __v.asInstanceOf[js.Any]))
      Supported.foreach(__v => __obj.update("Supported", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OperatingSystem]
    }
  }

  /**
    * A block that contains information about the configuration manager (Chef) and the versions of the configuration manager that are supported for an operating system.
    */
  @js.native
  trait OperatingSystemConfigurationManager extends js.Object {
    var Name: js.UndefOr[String]
    var Version: js.UndefOr[String]
  }

  object OperatingSystemConfigurationManager {
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        Version: js.UndefOr[String] = js.undefined
    ): OperatingSystemConfigurationManager = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OperatingSystemConfigurationManager]
    }
  }

  /**
    * Describes stack or user permissions.
    */
  @js.native
  trait Permission extends js.Object {
    var AllowSsh: js.UndefOr[Boolean]
    var AllowSudo: js.UndefOr[Boolean]
    var IamUserArn: js.UndefOr[String]
    var Level: js.UndefOr[String]
    var StackId: js.UndefOr[String]
  }

  object Permission {
    def apply(
        AllowSsh: js.UndefOr[Boolean] = js.undefined,
        AllowSudo: js.UndefOr[Boolean] = js.undefined,
        IamUserArn: js.UndefOr[String] = js.undefined,
        Level: js.UndefOr[String] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined
    ): Permission = {
      val __obj = js.Dictionary.empty[js.Any]
      AllowSsh.foreach(__v => __obj.update("AllowSsh", __v.asInstanceOf[js.Any]))
      AllowSudo.foreach(__v => __obj.update("AllowSudo", __v.asInstanceOf[js.Any]))
      IamUserArn.foreach(__v => __obj.update("IamUserArn", __v.asInstanceOf[js.Any]))
      Level.foreach(__v => __obj.update("Level", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Permission]
    }
  }

  /**
    * Describes an instance's RAID array.
    */
  @js.native
  trait RaidArray extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var CreatedAt: js.UndefOr[DateTime]
    var Device: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var Iops: js.UndefOr[Int]
    var MountPoint: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var NumberOfDisks: js.UndefOr[Int]
    var RaidArrayId: js.UndefOr[String]
    var RaidLevel: js.UndefOr[Int]
    var Size: js.UndefOr[Int]
    var StackId: js.UndefOr[String]
    var VolumeType: js.UndefOr[String]
  }

  object RaidArray {
    def apply(
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        Device: js.UndefOr[String] = js.undefined,
        InstanceId: js.UndefOr[String] = js.undefined,
        Iops: js.UndefOr[Int] = js.undefined,
        MountPoint: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        NumberOfDisks: js.UndefOr[Int] = js.undefined,
        RaidArrayId: js.UndefOr[String] = js.undefined,
        RaidLevel: js.UndefOr[Int] = js.undefined,
        Size: js.UndefOr[Int] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined,
        VolumeType: js.UndefOr[String] = js.undefined
    ): RaidArray = {
      val __obj = js.Dictionary.empty[js.Any]
      AvailabilityZone.foreach(__v => __obj.update("AvailabilityZone", __v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.update("CreatedAt", __v.asInstanceOf[js.Any]))
      Device.foreach(__v => __obj.update("Device", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.update("Iops", __v.asInstanceOf[js.Any]))
      MountPoint.foreach(__v => __obj.update("MountPoint", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      NumberOfDisks.foreach(__v => __obj.update("NumberOfDisks", __v.asInstanceOf[js.Any]))
      RaidArrayId.foreach(__v => __obj.update("RaidArrayId", __v.asInstanceOf[js.Any]))
      RaidLevel.foreach(__v => __obj.update("RaidLevel", __v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.update("Size", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      VolumeType.foreach(__v => __obj.update("VolumeType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RaidArray]
    }
  }

  /**
    * Describes an Amazon RDS instance.
    */
  @js.native
  trait RdsDbInstance extends js.Object {
    var Address: js.UndefOr[String]
    var DbInstanceIdentifier: js.UndefOr[String]
    var DbPassword: js.UndefOr[String]
    var DbUser: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var MissingOnRds: js.UndefOr[Boolean]
    var RdsDbInstanceArn: js.UndefOr[String]
    var Region: js.UndefOr[String]
    var StackId: js.UndefOr[String]
  }

  object RdsDbInstance {
    def apply(
        Address: js.UndefOr[String] = js.undefined,
        DbInstanceIdentifier: js.UndefOr[String] = js.undefined,
        DbPassword: js.UndefOr[String] = js.undefined,
        DbUser: js.UndefOr[String] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        MissingOnRds: js.UndefOr[Boolean] = js.undefined,
        RdsDbInstanceArn: js.UndefOr[String] = js.undefined,
        Region: js.UndefOr[String] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined
    ): RdsDbInstance = {
      val __obj = js.Dictionary.empty[js.Any]
      Address.foreach(__v => __obj.update("Address", __v.asInstanceOf[js.Any]))
      DbInstanceIdentifier.foreach(__v => __obj.update("DbInstanceIdentifier", __v.asInstanceOf[js.Any]))
      DbPassword.foreach(__v => __obj.update("DbPassword", __v.asInstanceOf[js.Any]))
      DbUser.foreach(__v => __obj.update("DbUser", __v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.update("Engine", __v.asInstanceOf[js.Any]))
      MissingOnRds.foreach(__v => __obj.update("MissingOnRds", __v.asInstanceOf[js.Any]))
      RdsDbInstanceArn.foreach(__v => __obj.update("RdsDbInstanceArn", __v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.update("Region", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RdsDbInstance]
    }
  }

  @js.native
  trait RebootInstanceRequest extends js.Object {
    var InstanceId: String
  }

  object RebootInstanceRequest {
    def apply(
        InstanceId: String
    ): RebootInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RebootInstanceRequest]
    }
  }

  /**
    * AWS OpsWorks Stacks supports five lifecycle events: ```setup```, ```configuration```, ```deploy```, ```undeploy```, and ```shutdown```. For each layer, AWS OpsWorks Stacks runs a set of standard recipes for each event. In addition, you can provide custom recipes for any or all layers and events. AWS OpsWorks Stacks runs custom event recipes after the standard recipes. <code>LayerCustomRecipes</code> specifies the custom recipes for a particular layer to be run in response to each of the five events.
    *  To specify a recipe, use the cookbook's directory name in the repository followed by two colons and the recipe name, which is the recipe's file name without the .rb extension. For example: phpapp2::dbsetup specifies the dbsetup.rb recipe in the repository's phpapp2 folder.
    */
  @js.native
  trait Recipes extends js.Object {
    var Configure: js.UndefOr[Strings]
    var Deploy: js.UndefOr[Strings]
    var Setup: js.UndefOr[Strings]
    var Shutdown: js.UndefOr[Strings]
    var Undeploy: js.UndefOr[Strings]
  }

  object Recipes {
    def apply(
        Configure: js.UndefOr[Strings] = js.undefined,
        Deploy: js.UndefOr[Strings] = js.undefined,
        Setup: js.UndefOr[Strings] = js.undefined,
        Shutdown: js.UndefOr[Strings] = js.undefined,
        Undeploy: js.UndefOr[Strings] = js.undefined
    ): Recipes = {
      val __obj = js.Dictionary.empty[js.Any]
      Configure.foreach(__v => __obj.update("Configure", __v.asInstanceOf[js.Any]))
      Deploy.foreach(__v => __obj.update("Deploy", __v.asInstanceOf[js.Any]))
      Setup.foreach(__v => __obj.update("Setup", __v.asInstanceOf[js.Any]))
      Shutdown.foreach(__v => __obj.update("Shutdown", __v.asInstanceOf[js.Any]))
      Undeploy.foreach(__v => __obj.update("Undeploy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Recipes]
    }
  }

  @js.native
  trait RegisterEcsClusterRequest extends js.Object {
    var EcsClusterArn: String
    var StackId: String
  }

  object RegisterEcsClusterRequest {
    def apply(
        EcsClusterArn: String,
        StackId: String
    ): RegisterEcsClusterRequest = {
      val __obj = js.Dictionary[js.Any](
        "EcsClusterArn" -> EcsClusterArn.asInstanceOf[js.Any],
        "StackId"       -> StackId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RegisterEcsClusterRequest]
    }
  }

  /**
    * Contains the response to a <code>RegisterEcsCluster</code> request.
    */
  @js.native
  trait RegisterEcsClusterResult extends js.Object {
    var EcsClusterArn: js.UndefOr[String]
  }

  object RegisterEcsClusterResult {
    def apply(
        EcsClusterArn: js.UndefOr[String] = js.undefined
    ): RegisterEcsClusterResult = {
      val __obj = js.Dictionary.empty[js.Any]
      EcsClusterArn.foreach(__v => __obj.update("EcsClusterArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterEcsClusterResult]
    }
  }

  @js.native
  trait RegisterElasticIpRequest extends js.Object {
    var ElasticIp: String
    var StackId: String
  }

  object RegisterElasticIpRequest {
    def apply(
        ElasticIp: String,
        StackId: String
    ): RegisterElasticIpRequest = {
      val __obj = js.Dictionary[js.Any](
        "ElasticIp" -> ElasticIp.asInstanceOf[js.Any],
        "StackId"   -> StackId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RegisterElasticIpRequest]
    }
  }

  /**
    * Contains the response to a <code>RegisterElasticIp</code> request.
    */
  @js.native
  trait RegisterElasticIpResult extends js.Object {
    var ElasticIp: js.UndefOr[String]
  }

  object RegisterElasticIpResult {
    def apply(
        ElasticIp: js.UndefOr[String] = js.undefined
    ): RegisterElasticIpResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ElasticIp.foreach(__v => __obj.update("ElasticIp", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterElasticIpResult]
    }
  }

  @js.native
  trait RegisterInstanceRequest extends js.Object {
    var StackId: String
    var Hostname: js.UndefOr[String]
    var InstanceIdentity: js.UndefOr[InstanceIdentity]
    var PrivateIp: js.UndefOr[String]
    var PublicIp: js.UndefOr[String]
    var RsaPublicKey: js.UndefOr[String]
    var RsaPublicKeyFingerprint: js.UndefOr[String]
  }

  object RegisterInstanceRequest {
    def apply(
        StackId: String,
        Hostname: js.UndefOr[String] = js.undefined,
        InstanceIdentity: js.UndefOr[InstanceIdentity] = js.undefined,
        PrivateIp: js.UndefOr[String] = js.undefined,
        PublicIp: js.UndefOr[String] = js.undefined,
        RsaPublicKey: js.UndefOr[String] = js.undefined,
        RsaPublicKeyFingerprint: js.UndefOr[String] = js.undefined
    ): RegisterInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "StackId" -> StackId.asInstanceOf[js.Any]
      )

      Hostname.foreach(__v => __obj.update("Hostname", __v.asInstanceOf[js.Any]))
      InstanceIdentity.foreach(__v => __obj.update("InstanceIdentity", __v.asInstanceOf[js.Any]))
      PrivateIp.foreach(__v => __obj.update("PrivateIp", __v.asInstanceOf[js.Any]))
      PublicIp.foreach(__v => __obj.update("PublicIp", __v.asInstanceOf[js.Any]))
      RsaPublicKey.foreach(__v => __obj.update("RsaPublicKey", __v.asInstanceOf[js.Any]))
      RsaPublicKeyFingerprint.foreach(__v => __obj.update("RsaPublicKeyFingerprint", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterInstanceRequest]
    }
  }

  /**
    * Contains the response to a <code>RegisterInstanceResult</code> request.
    */
  @js.native
  trait RegisterInstanceResult extends js.Object {
    var InstanceId: js.UndefOr[String]
  }

  object RegisterInstanceResult {
    def apply(
        InstanceId: js.UndefOr[String] = js.undefined
    ): RegisterInstanceResult = {
      val __obj = js.Dictionary.empty[js.Any]
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterInstanceResult]
    }
  }

  @js.native
  trait RegisterRdsDbInstanceRequest extends js.Object {
    var DbPassword: String
    var DbUser: String
    var RdsDbInstanceArn: String
    var StackId: String
  }

  object RegisterRdsDbInstanceRequest {
    def apply(
        DbPassword: String,
        DbUser: String,
        RdsDbInstanceArn: String,
        StackId: String
    ): RegisterRdsDbInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "DbPassword"       -> DbPassword.asInstanceOf[js.Any],
        "DbUser"           -> DbUser.asInstanceOf[js.Any],
        "RdsDbInstanceArn" -> RdsDbInstanceArn.asInstanceOf[js.Any],
        "StackId"          -> StackId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RegisterRdsDbInstanceRequest]
    }
  }

  @js.native
  trait RegisterVolumeRequest extends js.Object {
    var StackId: String
    var Ec2VolumeId: js.UndefOr[String]
  }

  object RegisterVolumeRequest {
    def apply(
        StackId: String,
        Ec2VolumeId: js.UndefOr[String] = js.undefined
    ): RegisterVolumeRequest = {
      val __obj = js.Dictionary[js.Any](
        "StackId" -> StackId.asInstanceOf[js.Any]
      )

      Ec2VolumeId.foreach(__v => __obj.update("Ec2VolumeId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterVolumeRequest]
    }
  }

  /**
    * Contains the response to a <code>RegisterVolume</code> request.
    */
  @js.native
  trait RegisterVolumeResult extends js.Object {
    var VolumeId: js.UndefOr[String]
  }

  object RegisterVolumeResult {
    def apply(
        VolumeId: js.UndefOr[String] = js.undefined
    ): RegisterVolumeResult = {
      val __obj = js.Dictionary.empty[js.Any]
      VolumeId.foreach(__v => __obj.update("VolumeId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterVolumeResult]
    }
  }

  /**
    * A registered instance's reported operating system.
    */
  @js.native
  trait ReportedOs extends js.Object {
    var Family: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Version: js.UndefOr[String]
  }

  object ReportedOs {
    def apply(
        Family: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Version: js.UndefOr[String] = js.undefined
    ): ReportedOs = {
      val __obj = js.Dictionary.empty[js.Any]
      Family.foreach(__v => __obj.update("Family", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReportedOs]
    }
  }

  object RootDeviceTypeEnum {
    val ebs              = "ebs"
    val `instance-store` = "instance-store"

    val values = js.Object.freeze(js.Array(ebs, `instance-store`))
  }

  /**
    * Describes a user's SSH information.
    */
  @js.native
  trait SelfUserProfile extends js.Object {
    var IamUserArn: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var SshPublicKey: js.UndefOr[String]
    var SshUsername: js.UndefOr[String]
  }

  object SelfUserProfile {
    def apply(
        IamUserArn: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        SshPublicKey: js.UndefOr[String] = js.undefined,
        SshUsername: js.UndefOr[String] = js.undefined
    ): SelfUserProfile = {
      val __obj = js.Dictionary.empty[js.Any]
      IamUserArn.foreach(__v => __obj.update("IamUserArn", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      SshPublicKey.foreach(__v => __obj.update("SshPublicKey", __v.asInstanceOf[js.Any]))
      SshUsername.foreach(__v => __obj.update("SshUsername", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelfUserProfile]
    }
  }

  /**
    * Describes an AWS OpsWorks Stacks service error.
    */
  @js.native
  trait ServiceError extends js.Object {
    var CreatedAt: js.UndefOr[DateTime]
    var InstanceId: js.UndefOr[String]
    var Message: js.UndefOr[String]
    var ServiceErrorId: js.UndefOr[String]
    var StackId: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  object ServiceError {
    def apply(
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        InstanceId: js.UndefOr[String] = js.undefined,
        Message: js.UndefOr[String] = js.undefined,
        ServiceErrorId: js.UndefOr[String] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): ServiceError = {
      val __obj = js.Dictionary.empty[js.Any]
      CreatedAt.foreach(__v => __obj.update("CreatedAt", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      ServiceErrorId.foreach(__v => __obj.update("ServiceErrorId", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceError]
    }
  }

  @js.native
  trait SetLoadBasedAutoScalingRequest extends js.Object {
    var LayerId: String
    var DownScaling: js.UndefOr[AutoScalingThresholds]
    var Enable: js.UndefOr[Boolean]
    var UpScaling: js.UndefOr[AutoScalingThresholds]
  }

  object SetLoadBasedAutoScalingRequest {
    def apply(
        LayerId: String,
        DownScaling: js.UndefOr[AutoScalingThresholds] = js.undefined,
        Enable: js.UndefOr[Boolean] = js.undefined,
        UpScaling: js.UndefOr[AutoScalingThresholds] = js.undefined
    ): SetLoadBasedAutoScalingRequest = {
      val __obj = js.Dictionary[js.Any](
        "LayerId" -> LayerId.asInstanceOf[js.Any]
      )

      DownScaling.foreach(__v => __obj.update("DownScaling", __v.asInstanceOf[js.Any]))
      Enable.foreach(__v => __obj.update("Enable", __v.asInstanceOf[js.Any]))
      UpScaling.foreach(__v => __obj.update("UpScaling", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetLoadBasedAutoScalingRequest]
    }
  }

  @js.native
  trait SetPermissionRequest extends js.Object {
    var IamUserArn: String
    var StackId: String
    var AllowSsh: js.UndefOr[Boolean]
    var AllowSudo: js.UndefOr[Boolean]
    var Level: js.UndefOr[String]
  }

  object SetPermissionRequest {
    def apply(
        IamUserArn: String,
        StackId: String,
        AllowSsh: js.UndefOr[Boolean] = js.undefined,
        AllowSudo: js.UndefOr[Boolean] = js.undefined,
        Level: js.UndefOr[String] = js.undefined
    ): SetPermissionRequest = {
      val __obj = js.Dictionary[js.Any](
        "IamUserArn" -> IamUserArn.asInstanceOf[js.Any],
        "StackId"    -> StackId.asInstanceOf[js.Any]
      )

      AllowSsh.foreach(__v => __obj.update("AllowSsh", __v.asInstanceOf[js.Any]))
      AllowSudo.foreach(__v => __obj.update("AllowSudo", __v.asInstanceOf[js.Any]))
      Level.foreach(__v => __obj.update("Level", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetPermissionRequest]
    }
  }

  @js.native
  trait SetTimeBasedAutoScalingRequest extends js.Object {
    var InstanceId: String
    var AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule]
  }

  object SetTimeBasedAutoScalingRequest {
    def apply(
        InstanceId: String,
        AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule] = js.undefined
    ): SetTimeBasedAutoScalingRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      AutoScalingSchedule.foreach(__v => __obj.update("AutoScalingSchedule", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetTimeBasedAutoScalingRequest]
    }
  }

  /**
    * The Shutdown event configuration.
    */
  @js.native
  trait ShutdownEventConfiguration extends js.Object {
    var DelayUntilElbConnectionsDrained: js.UndefOr[Boolean]
    var ExecutionTimeout: js.UndefOr[Int]
  }

  object ShutdownEventConfiguration {
    def apply(
        DelayUntilElbConnectionsDrained: js.UndefOr[Boolean] = js.undefined,
        ExecutionTimeout: js.UndefOr[Int] = js.undefined
    ): ShutdownEventConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      DelayUntilElbConnectionsDrained.foreach(
        __v => __obj.update("DelayUntilElbConnectionsDrained", __v.asInstanceOf[js.Any])
      )
      ExecutionTimeout.foreach(__v => __obj.update("ExecutionTimeout", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShutdownEventConfiguration]
    }
  }

  /**
    * Contains the information required to retrieve an app or cookbook from a repository. For more information, see [[https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html|Creating Apps]] or [[https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html|Custom Recipes and Cookbooks]].
    */
  @js.native
  trait Source extends js.Object {
    var Password: js.UndefOr[String]
    var Revision: js.UndefOr[String]
    var SshKey: js.UndefOr[String]
    var Type: js.UndefOr[SourceType]
    var Url: js.UndefOr[String]
    var Username: js.UndefOr[String]
  }

  object Source {
    def apply(
        Password: js.UndefOr[String] = js.undefined,
        Revision: js.UndefOr[String] = js.undefined,
        SshKey: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[SourceType] = js.undefined,
        Url: js.UndefOr[String] = js.undefined,
        Username: js.UndefOr[String] = js.undefined
    ): Source = {
      val __obj = js.Dictionary.empty[js.Any]
      Password.foreach(__v => __obj.update("Password", __v.asInstanceOf[js.Any]))
      Revision.foreach(__v => __obj.update("Revision", __v.asInstanceOf[js.Any]))
      SshKey.foreach(__v => __obj.update("SshKey", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.update("Url", __v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.update("Username", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Source]
    }
  }

  object SourceTypeEnum {
    val git     = "git"
    val svn     = "svn"
    val archive = "archive"
    val s3      = "s3"

    val values = js.Object.freeze(js.Array(git, svn, archive, s3))
  }

  /**
    * Describes an app's SSL configuration.
    */
  @js.native
  trait SslConfiguration extends js.Object {
    var Certificate: String
    var PrivateKey: String
    var Chain: js.UndefOr[String]
  }

  object SslConfiguration {
    def apply(
        Certificate: String,
        PrivateKey: String,
        Chain: js.UndefOr[String] = js.undefined
    ): SslConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "Certificate" -> Certificate.asInstanceOf[js.Any],
        "PrivateKey"  -> PrivateKey.asInstanceOf[js.Any]
      )

      Chain.foreach(__v => __obj.update("Chain", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SslConfiguration]
    }
  }

  /**
    * Describes a stack.
    */
  @js.native
  trait Stack extends js.Object {
    var AgentVersion: js.UndefOr[String]
    var Arn: js.UndefOr[String]
    var Attributes: js.UndefOr[StackAttributes]
    var ChefConfiguration: js.UndefOr[ChefConfiguration]
    var ConfigurationManager: js.UndefOr[StackConfigurationManager]
    var CreatedAt: js.UndefOr[DateTime]
    var CustomCookbooksSource: js.UndefOr[Source]
    var CustomJson: js.UndefOr[String]
    var DefaultAvailabilityZone: js.UndefOr[String]
    var DefaultInstanceProfileArn: js.UndefOr[String]
    var DefaultOs: js.UndefOr[String]
    var DefaultRootDeviceType: js.UndefOr[RootDeviceType]
    var DefaultSshKeyName: js.UndefOr[String]
    var DefaultSubnetId: js.UndefOr[String]
    var HostnameTheme: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Region: js.UndefOr[String]
    var ServiceRoleArn: js.UndefOr[String]
    var StackId: js.UndefOr[String]
    var UseCustomCookbooks: js.UndefOr[Boolean]
    var UseOpsworksSecurityGroups: js.UndefOr[Boolean]
    var VpcId: js.UndefOr[String]
  }

  object Stack {
    def apply(
        AgentVersion: js.UndefOr[String] = js.undefined,
        Arn: js.UndefOr[String] = js.undefined,
        Attributes: js.UndefOr[StackAttributes] = js.undefined,
        ChefConfiguration: js.UndefOr[ChefConfiguration] = js.undefined,
        ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined,
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        CustomCookbooksSource: js.UndefOr[Source] = js.undefined,
        CustomJson: js.UndefOr[String] = js.undefined,
        DefaultAvailabilityZone: js.UndefOr[String] = js.undefined,
        DefaultInstanceProfileArn: js.UndefOr[String] = js.undefined,
        DefaultOs: js.UndefOr[String] = js.undefined,
        DefaultRootDeviceType: js.UndefOr[RootDeviceType] = js.undefined,
        DefaultSshKeyName: js.UndefOr[String] = js.undefined,
        DefaultSubnetId: js.UndefOr[String] = js.undefined,
        HostnameTheme: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Region: js.UndefOr[String] = js.undefined,
        ServiceRoleArn: js.UndefOr[String] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined,
        UseCustomCookbooks: js.UndefOr[Boolean] = js.undefined,
        UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): Stack = {
      val __obj = js.Dictionary.empty[js.Any]
      AgentVersion.foreach(__v => __obj.update("AgentVersion", __v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      ChefConfiguration.foreach(__v => __obj.update("ChefConfiguration", __v.asInstanceOf[js.Any]))
      ConfigurationManager.foreach(__v => __obj.update("ConfigurationManager", __v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.update("CreatedAt", __v.asInstanceOf[js.Any]))
      CustomCookbooksSource.foreach(__v => __obj.update("CustomCookbooksSource", __v.asInstanceOf[js.Any]))
      CustomJson.foreach(__v => __obj.update("CustomJson", __v.asInstanceOf[js.Any]))
      DefaultAvailabilityZone.foreach(__v => __obj.update("DefaultAvailabilityZone", __v.asInstanceOf[js.Any]))
      DefaultInstanceProfileArn.foreach(__v => __obj.update("DefaultInstanceProfileArn", __v.asInstanceOf[js.Any]))
      DefaultOs.foreach(__v => __obj.update("DefaultOs", __v.asInstanceOf[js.Any]))
      DefaultRootDeviceType.foreach(__v => __obj.update("DefaultRootDeviceType", __v.asInstanceOf[js.Any]))
      DefaultSshKeyName.foreach(__v => __obj.update("DefaultSshKeyName", __v.asInstanceOf[js.Any]))
      DefaultSubnetId.foreach(__v => __obj.update("DefaultSubnetId", __v.asInstanceOf[js.Any]))
      HostnameTheme.foreach(__v => __obj.update("HostnameTheme", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.update("Region", __v.asInstanceOf[js.Any]))
      ServiceRoleArn.foreach(__v => __obj.update("ServiceRoleArn", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      UseCustomCookbooks.foreach(__v => __obj.update("UseCustomCookbooks", __v.asInstanceOf[js.Any]))
      UseOpsworksSecurityGroups.foreach(__v => __obj.update("UseOpsworksSecurityGroups", __v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.update("VpcId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Stack]
    }
  }

  object StackAttributesKeysEnum {
    val Color = "Color"

    val values = js.Object.freeze(js.Array(Color))
  }

  /**
    * Describes the configuration manager.
    */
  @js.native
  trait StackConfigurationManager extends js.Object {
    var Name: js.UndefOr[String]
    var Version: js.UndefOr[String]
  }

  object StackConfigurationManager {
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        Version: js.UndefOr[String] = js.undefined
    ): StackConfigurationManager = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackConfigurationManager]
    }
  }

  /**
    * Summarizes the number of layers, instances, and apps in a stack.
    */
  @js.native
  trait StackSummary extends js.Object {
    var AppsCount: js.UndefOr[Int]
    var Arn: js.UndefOr[String]
    var InstancesCount: js.UndefOr[InstancesCount]
    var LayersCount: js.UndefOr[Int]
    var Name: js.UndefOr[String]
    var StackId: js.UndefOr[String]
  }

  object StackSummary {
    def apply(
        AppsCount: js.UndefOr[Int] = js.undefined,
        Arn: js.UndefOr[String] = js.undefined,
        InstancesCount: js.UndefOr[InstancesCount] = js.undefined,
        LayersCount: js.UndefOr[Int] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        StackId: js.UndefOr[String] = js.undefined
    ): StackSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      AppsCount.foreach(__v => __obj.update("AppsCount", __v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      InstancesCount.foreach(__v => __obj.update("InstancesCount", __v.asInstanceOf[js.Any]))
      LayersCount.foreach(__v => __obj.update("LayersCount", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackSummary]
    }
  }

  @js.native
  trait StartInstanceRequest extends js.Object {
    var InstanceId: String
  }

  object StartInstanceRequest {
    def apply(
        InstanceId: String
    ): StartInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartInstanceRequest]
    }
  }

  @js.native
  trait StartStackRequest extends js.Object {
    var StackId: String
  }

  object StartStackRequest {
    def apply(
        StackId: String
    ): StartStackRequest = {
      val __obj = js.Dictionary[js.Any](
        "StackId" -> StackId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartStackRequest]
    }
  }

  @js.native
  trait StopInstanceRequest extends js.Object {
    var InstanceId: String
    var Force: js.UndefOr[Boolean]
  }

  object StopInstanceRequest {
    def apply(
        InstanceId: String,
        Force: js.UndefOr[Boolean] = js.undefined
    ): StopInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      Force.foreach(__v => __obj.update("Force", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopInstanceRequest]
    }
  }

  @js.native
  trait StopStackRequest extends js.Object {
    var StackId: String
  }

  object StopStackRequest {
    def apply(
        StackId: String
    ): StopStackRequest = {
      val __obj = js.Dictionary[js.Any](
        "StackId" -> StackId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopStackRequest]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var Tags: Tags
  }

  object TagResourceRequest {
    def apply(
        ResourceArn: ResourceArn,
        Tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  /**
    * Contains the data needed by RDP clients such as the Microsoft Remote Desktop Connection to log in to the instance.
    */
  @js.native
  trait TemporaryCredential extends js.Object {
    var InstanceId: js.UndefOr[String]
    var Password: js.UndefOr[String]
    var Username: js.UndefOr[String]
    var ValidForInMinutes: js.UndefOr[Int]
  }

  object TemporaryCredential {
    def apply(
        InstanceId: js.UndefOr[String] = js.undefined,
        Password: js.UndefOr[String] = js.undefined,
        Username: js.UndefOr[String] = js.undefined,
        ValidForInMinutes: js.UndefOr[Int] = js.undefined
    ): TemporaryCredential = {
      val __obj = js.Dictionary.empty[js.Any]
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.update("Password", __v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.update("Username", __v.asInstanceOf[js.Any]))
      ValidForInMinutes.foreach(__v => __obj.update("ValidForInMinutes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemporaryCredential]
    }
  }

  /**
    * Describes an instance's time-based auto scaling configuration.
    */
  @js.native
  trait TimeBasedAutoScalingConfiguration extends js.Object {
    var AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule]
    var InstanceId: js.UndefOr[String]
  }

  object TimeBasedAutoScalingConfiguration {
    def apply(
        AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule] = js.undefined,
        InstanceId: js.UndefOr[String] = js.undefined
    ): TimeBasedAutoScalingConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      AutoScalingSchedule.foreach(__v => __obj.update("AutoScalingSchedule", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeBasedAutoScalingConfiguration]
    }
  }

  @js.native
  trait UnassignInstanceRequest extends js.Object {
    var InstanceId: String
  }

  object UnassignInstanceRequest {
    def apply(
        InstanceId: String
    ): UnassignInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UnassignInstanceRequest]
    }
  }

  @js.native
  trait UnassignVolumeRequest extends js.Object {
    var VolumeId: String
  }

  object UnassignVolumeRequest {
    def apply(
        VolumeId: String
    ): UnassignVolumeRequest = {
      val __obj = js.Dictionary[js.Any](
        "VolumeId" -> VolumeId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UnassignVolumeRequest]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var TagKeys: TagKeys
  }

  object UntagResourceRequest {
    def apply(
        ResourceArn: ResourceArn,
        TagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateAppRequest extends js.Object {
    var AppId: String
    var AppSource: js.UndefOr[Source]
    var Attributes: js.UndefOr[AppAttributes]
    var DataSources: js.UndefOr[DataSources]
    var Description: js.UndefOr[String]
    var Domains: js.UndefOr[Strings]
    var EnableSsl: js.UndefOr[Boolean]
    var Environment: js.UndefOr[EnvironmentVariables]
    var Name: js.UndefOr[String]
    var SslConfiguration: js.UndefOr[SslConfiguration]
    var Type: js.UndefOr[AppType]
  }

  object UpdateAppRequest {
    def apply(
        AppId: String,
        AppSource: js.UndefOr[Source] = js.undefined,
        Attributes: js.UndefOr[AppAttributes] = js.undefined,
        DataSources: js.UndefOr[DataSources] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        Domains: js.UndefOr[Strings] = js.undefined,
        EnableSsl: js.UndefOr[Boolean] = js.undefined,
        Environment: js.UndefOr[EnvironmentVariables] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        SslConfiguration: js.UndefOr[SslConfiguration] = js.undefined,
        Type: js.UndefOr[AppType] = js.undefined
    ): UpdateAppRequest = {
      val __obj = js.Dictionary[js.Any](
        "AppId" -> AppId.asInstanceOf[js.Any]
      )

      AppSource.foreach(__v => __obj.update("AppSource", __v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      DataSources.foreach(__v => __obj.update("DataSources", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Domains.foreach(__v => __obj.update("Domains", __v.asInstanceOf[js.Any]))
      EnableSsl.foreach(__v => __obj.update("EnableSsl", __v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.update("Environment", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      SslConfiguration.foreach(__v => __obj.update("SslConfiguration", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAppRequest]
    }
  }

  @js.native
  trait UpdateElasticIpRequest extends js.Object {
    var ElasticIp: String
    var Name: js.UndefOr[String]
  }

  object UpdateElasticIpRequest {
    def apply(
        ElasticIp: String,
        Name: js.UndefOr[String] = js.undefined
    ): UpdateElasticIpRequest = {
      val __obj = js.Dictionary[js.Any](
        "ElasticIp" -> ElasticIp.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateElasticIpRequest]
    }
  }

  @js.native
  trait UpdateInstanceRequest extends js.Object {
    var InstanceId: String
    var AgentVersion: js.UndefOr[String]
    var AmiId: js.UndefOr[String]
    var Architecture: js.UndefOr[Architecture]
    var AutoScalingType: js.UndefOr[AutoScalingType]
    var EbsOptimized: js.UndefOr[Boolean]
    var Hostname: js.UndefOr[String]
    var InstallUpdatesOnBoot: js.UndefOr[Boolean]
    var InstanceType: js.UndefOr[String]
    var LayerIds: js.UndefOr[Strings]
    var Os: js.UndefOr[String]
    var SshKeyName: js.UndefOr[String]
  }

  object UpdateInstanceRequest {
    def apply(
        InstanceId: String,
        AgentVersion: js.UndefOr[String] = js.undefined,
        AmiId: js.UndefOr[String] = js.undefined,
        Architecture: js.UndefOr[Architecture] = js.undefined,
        AutoScalingType: js.UndefOr[AutoScalingType] = js.undefined,
        EbsOptimized: js.UndefOr[Boolean] = js.undefined,
        Hostname: js.UndefOr[String] = js.undefined,
        InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined,
        InstanceType: js.UndefOr[String] = js.undefined,
        LayerIds: js.UndefOr[Strings] = js.undefined,
        Os: js.UndefOr[String] = js.undefined,
        SshKeyName: js.UndefOr[String] = js.undefined
    ): UpdateInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      AgentVersion.foreach(__v => __obj.update("AgentVersion", __v.asInstanceOf[js.Any]))
      AmiId.foreach(__v => __obj.update("AmiId", __v.asInstanceOf[js.Any]))
      Architecture.foreach(__v => __obj.update("Architecture", __v.asInstanceOf[js.Any]))
      AutoScalingType.foreach(__v => __obj.update("AutoScalingType", __v.asInstanceOf[js.Any]))
      EbsOptimized.foreach(__v => __obj.update("EbsOptimized", __v.asInstanceOf[js.Any]))
      Hostname.foreach(__v => __obj.update("Hostname", __v.asInstanceOf[js.Any]))
      InstallUpdatesOnBoot.foreach(__v => __obj.update("InstallUpdatesOnBoot", __v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.update("InstanceType", __v.asInstanceOf[js.Any]))
      LayerIds.foreach(__v => __obj.update("LayerIds", __v.asInstanceOf[js.Any]))
      Os.foreach(__v => __obj.update("Os", __v.asInstanceOf[js.Any]))
      SshKeyName.foreach(__v => __obj.update("SshKeyName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateInstanceRequest]
    }
  }

  @js.native
  trait UpdateLayerRequest extends js.Object {
    var LayerId: String
    var Attributes: js.UndefOr[LayerAttributes]
    var AutoAssignElasticIps: js.UndefOr[Boolean]
    var AutoAssignPublicIps: js.UndefOr[Boolean]
    var CloudWatchLogsConfiguration: js.UndefOr[CloudWatchLogsConfiguration]
    var CustomInstanceProfileArn: js.UndefOr[String]
    var CustomJson: js.UndefOr[String]
    var CustomRecipes: js.UndefOr[Recipes]
    var CustomSecurityGroupIds: js.UndefOr[Strings]
    var EnableAutoHealing: js.UndefOr[Boolean]
    var InstallUpdatesOnBoot: js.UndefOr[Boolean]
    var LifecycleEventConfiguration: js.UndefOr[LifecycleEventConfiguration]
    var Name: js.UndefOr[String]
    var Packages: js.UndefOr[Strings]
    var Shortname: js.UndefOr[String]
    var UseEbsOptimizedInstances: js.UndefOr[Boolean]
    var VolumeConfigurations: js.UndefOr[VolumeConfigurations]
  }

  object UpdateLayerRequest {
    def apply(
        LayerId: String,
        Attributes: js.UndefOr[LayerAttributes] = js.undefined,
        AutoAssignElasticIps: js.UndefOr[Boolean] = js.undefined,
        AutoAssignPublicIps: js.UndefOr[Boolean] = js.undefined,
        CloudWatchLogsConfiguration: js.UndefOr[CloudWatchLogsConfiguration] = js.undefined,
        CustomInstanceProfileArn: js.UndefOr[String] = js.undefined,
        CustomJson: js.UndefOr[String] = js.undefined,
        CustomRecipes: js.UndefOr[Recipes] = js.undefined,
        CustomSecurityGroupIds: js.UndefOr[Strings] = js.undefined,
        EnableAutoHealing: js.UndefOr[Boolean] = js.undefined,
        InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined,
        LifecycleEventConfiguration: js.UndefOr[LifecycleEventConfiguration] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Packages: js.UndefOr[Strings] = js.undefined,
        Shortname: js.UndefOr[String] = js.undefined,
        UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.undefined,
        VolumeConfigurations: js.UndefOr[VolumeConfigurations] = js.undefined
    ): UpdateLayerRequest = {
      val __obj = js.Dictionary[js.Any](
        "LayerId" -> LayerId.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      AutoAssignElasticIps.foreach(__v => __obj.update("AutoAssignElasticIps", __v.asInstanceOf[js.Any]))
      AutoAssignPublicIps.foreach(__v => __obj.update("AutoAssignPublicIps", __v.asInstanceOf[js.Any]))
      CloudWatchLogsConfiguration.foreach(__v => __obj.update("CloudWatchLogsConfiguration", __v.asInstanceOf[js.Any]))
      CustomInstanceProfileArn.foreach(__v => __obj.update("CustomInstanceProfileArn", __v.asInstanceOf[js.Any]))
      CustomJson.foreach(__v => __obj.update("CustomJson", __v.asInstanceOf[js.Any]))
      CustomRecipes.foreach(__v => __obj.update("CustomRecipes", __v.asInstanceOf[js.Any]))
      CustomSecurityGroupIds.foreach(__v => __obj.update("CustomSecurityGroupIds", __v.asInstanceOf[js.Any]))
      EnableAutoHealing.foreach(__v => __obj.update("EnableAutoHealing", __v.asInstanceOf[js.Any]))
      InstallUpdatesOnBoot.foreach(__v => __obj.update("InstallUpdatesOnBoot", __v.asInstanceOf[js.Any]))
      LifecycleEventConfiguration.foreach(__v => __obj.update("LifecycleEventConfiguration", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Packages.foreach(__v => __obj.update("Packages", __v.asInstanceOf[js.Any]))
      Shortname.foreach(__v => __obj.update("Shortname", __v.asInstanceOf[js.Any]))
      UseEbsOptimizedInstances.foreach(__v => __obj.update("UseEbsOptimizedInstances", __v.asInstanceOf[js.Any]))
      VolumeConfigurations.foreach(__v => __obj.update("VolumeConfigurations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLayerRequest]
    }
  }

  @js.native
  trait UpdateMyUserProfileRequest extends js.Object {
    var SshPublicKey: js.UndefOr[String]
  }

  object UpdateMyUserProfileRequest {
    def apply(
        SshPublicKey: js.UndefOr[String] = js.undefined
    ): UpdateMyUserProfileRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      SshPublicKey.foreach(__v => __obj.update("SshPublicKey", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMyUserProfileRequest]
    }
  }

  @js.native
  trait UpdateRdsDbInstanceRequest extends js.Object {
    var RdsDbInstanceArn: String
    var DbPassword: js.UndefOr[String]
    var DbUser: js.UndefOr[String]
  }

  object UpdateRdsDbInstanceRequest {
    def apply(
        RdsDbInstanceArn: String,
        DbPassword: js.UndefOr[String] = js.undefined,
        DbUser: js.UndefOr[String] = js.undefined
    ): UpdateRdsDbInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "RdsDbInstanceArn" -> RdsDbInstanceArn.asInstanceOf[js.Any]
      )

      DbPassword.foreach(__v => __obj.update("DbPassword", __v.asInstanceOf[js.Any]))
      DbUser.foreach(__v => __obj.update("DbUser", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRdsDbInstanceRequest]
    }
  }

  @js.native
  trait UpdateStackRequest extends js.Object {
    var StackId: String
    var AgentVersion: js.UndefOr[String]
    var Attributes: js.UndefOr[StackAttributes]
    var ChefConfiguration: js.UndefOr[ChefConfiguration]
    var ConfigurationManager: js.UndefOr[StackConfigurationManager]
    var CustomCookbooksSource: js.UndefOr[Source]
    var CustomJson: js.UndefOr[String]
    var DefaultAvailabilityZone: js.UndefOr[String]
    var DefaultInstanceProfileArn: js.UndefOr[String]
    var DefaultOs: js.UndefOr[String]
    var DefaultRootDeviceType: js.UndefOr[RootDeviceType]
    var DefaultSshKeyName: js.UndefOr[String]
    var DefaultSubnetId: js.UndefOr[String]
    var HostnameTheme: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var ServiceRoleArn: js.UndefOr[String]
    var UseCustomCookbooks: js.UndefOr[Boolean]
    var UseOpsworksSecurityGroups: js.UndefOr[Boolean]
  }

  object UpdateStackRequest {
    def apply(
        StackId: String,
        AgentVersion: js.UndefOr[String] = js.undefined,
        Attributes: js.UndefOr[StackAttributes] = js.undefined,
        ChefConfiguration: js.UndefOr[ChefConfiguration] = js.undefined,
        ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined,
        CustomCookbooksSource: js.UndefOr[Source] = js.undefined,
        CustomJson: js.UndefOr[String] = js.undefined,
        DefaultAvailabilityZone: js.UndefOr[String] = js.undefined,
        DefaultInstanceProfileArn: js.UndefOr[String] = js.undefined,
        DefaultOs: js.UndefOr[String] = js.undefined,
        DefaultRootDeviceType: js.UndefOr[RootDeviceType] = js.undefined,
        DefaultSshKeyName: js.UndefOr[String] = js.undefined,
        DefaultSubnetId: js.UndefOr[String] = js.undefined,
        HostnameTheme: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        ServiceRoleArn: js.UndefOr[String] = js.undefined,
        UseCustomCookbooks: js.UndefOr[Boolean] = js.undefined,
        UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.undefined
    ): UpdateStackRequest = {
      val __obj = js.Dictionary[js.Any](
        "StackId" -> StackId.asInstanceOf[js.Any]
      )

      AgentVersion.foreach(__v => __obj.update("AgentVersion", __v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      ChefConfiguration.foreach(__v => __obj.update("ChefConfiguration", __v.asInstanceOf[js.Any]))
      ConfigurationManager.foreach(__v => __obj.update("ConfigurationManager", __v.asInstanceOf[js.Any]))
      CustomCookbooksSource.foreach(__v => __obj.update("CustomCookbooksSource", __v.asInstanceOf[js.Any]))
      CustomJson.foreach(__v => __obj.update("CustomJson", __v.asInstanceOf[js.Any]))
      DefaultAvailabilityZone.foreach(__v => __obj.update("DefaultAvailabilityZone", __v.asInstanceOf[js.Any]))
      DefaultInstanceProfileArn.foreach(__v => __obj.update("DefaultInstanceProfileArn", __v.asInstanceOf[js.Any]))
      DefaultOs.foreach(__v => __obj.update("DefaultOs", __v.asInstanceOf[js.Any]))
      DefaultRootDeviceType.foreach(__v => __obj.update("DefaultRootDeviceType", __v.asInstanceOf[js.Any]))
      DefaultSshKeyName.foreach(__v => __obj.update("DefaultSshKeyName", __v.asInstanceOf[js.Any]))
      DefaultSubnetId.foreach(__v => __obj.update("DefaultSubnetId", __v.asInstanceOf[js.Any]))
      HostnameTheme.foreach(__v => __obj.update("HostnameTheme", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      ServiceRoleArn.foreach(__v => __obj.update("ServiceRoleArn", __v.asInstanceOf[js.Any]))
      UseCustomCookbooks.foreach(__v => __obj.update("UseCustomCookbooks", __v.asInstanceOf[js.Any]))
      UseOpsworksSecurityGroups.foreach(__v => __obj.update("UseOpsworksSecurityGroups", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStackRequest]
    }
  }

  @js.native
  trait UpdateUserProfileRequest extends js.Object {
    var IamUserArn: String
    var AllowSelfManagement: js.UndefOr[Boolean]
    var SshPublicKey: js.UndefOr[String]
    var SshUsername: js.UndefOr[String]
  }

  object UpdateUserProfileRequest {
    def apply(
        IamUserArn: String,
        AllowSelfManagement: js.UndefOr[Boolean] = js.undefined,
        SshPublicKey: js.UndefOr[String] = js.undefined,
        SshUsername: js.UndefOr[String] = js.undefined
    ): UpdateUserProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "IamUserArn" -> IamUserArn.asInstanceOf[js.Any]
      )

      AllowSelfManagement.foreach(__v => __obj.update("AllowSelfManagement", __v.asInstanceOf[js.Any]))
      SshPublicKey.foreach(__v => __obj.update("SshPublicKey", __v.asInstanceOf[js.Any]))
      SshUsername.foreach(__v => __obj.update("SshUsername", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserProfileRequest]
    }
  }

  @js.native
  trait UpdateVolumeRequest extends js.Object {
    var VolumeId: String
    var MountPoint: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  object UpdateVolumeRequest {
    def apply(
        VolumeId: String,
        MountPoint: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined
    ): UpdateVolumeRequest = {
      val __obj = js.Dictionary[js.Any](
        "VolumeId" -> VolumeId.asInstanceOf[js.Any]
      )

      MountPoint.foreach(__v => __obj.update("MountPoint", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVolumeRequest]
    }
  }

  /**
    * Describes a user's SSH information.
    */
  @js.native
  trait UserProfile extends js.Object {
    var AllowSelfManagement: js.UndefOr[Boolean]
    var IamUserArn: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var SshPublicKey: js.UndefOr[String]
    var SshUsername: js.UndefOr[String]
  }

  object UserProfile {
    def apply(
        AllowSelfManagement: js.UndefOr[Boolean] = js.undefined,
        IamUserArn: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        SshPublicKey: js.UndefOr[String] = js.undefined,
        SshUsername: js.UndefOr[String] = js.undefined
    ): UserProfile = {
      val __obj = js.Dictionary.empty[js.Any]
      AllowSelfManagement.foreach(__v => __obj.update("AllowSelfManagement", __v.asInstanceOf[js.Any]))
      IamUserArn.foreach(__v => __obj.update("IamUserArn", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      SshPublicKey.foreach(__v => __obj.update("SshPublicKey", __v.asInstanceOf[js.Any]))
      SshUsername.foreach(__v => __obj.update("SshUsername", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserProfile]
    }
  }

  object VirtualizationTypeEnum {
    val paravirtual = "paravirtual"
    val hvm         = "hvm"

    val values = js.Object.freeze(js.Array(paravirtual, hvm))
  }

  /**
    * Describes an instance's Amazon EBS volume.
    */
  @js.native
  trait Volume extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var Device: js.UndefOr[String]
    var Ec2VolumeId: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
    var InstanceId: js.UndefOr[String]
    var Iops: js.UndefOr[Int]
    var MountPoint: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var RaidArrayId: js.UndefOr[String]
    var Region: js.UndefOr[String]
    var Size: js.UndefOr[Int]
    var Status: js.UndefOr[String]
    var VolumeId: js.UndefOr[String]
    var VolumeType: js.UndefOr[String]
  }

  object Volume {
    def apply(
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        Device: js.UndefOr[String] = js.undefined,
        Ec2VolumeId: js.UndefOr[String] = js.undefined,
        Encrypted: js.UndefOr[Boolean] = js.undefined,
        InstanceId: js.UndefOr[String] = js.undefined,
        Iops: js.UndefOr[Int] = js.undefined,
        MountPoint: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        RaidArrayId: js.UndefOr[String] = js.undefined,
        Region: js.UndefOr[String] = js.undefined,
        Size: js.UndefOr[Int] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        VolumeId: js.UndefOr[String] = js.undefined,
        VolumeType: js.UndefOr[String] = js.undefined
    ): Volume = {
      val __obj = js.Dictionary.empty[js.Any]
      AvailabilityZone.foreach(__v => __obj.update("AvailabilityZone", __v.asInstanceOf[js.Any]))
      Device.foreach(__v => __obj.update("Device", __v.asInstanceOf[js.Any]))
      Ec2VolumeId.foreach(__v => __obj.update("Ec2VolumeId", __v.asInstanceOf[js.Any]))
      Encrypted.foreach(__v => __obj.update("Encrypted", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.update("Iops", __v.asInstanceOf[js.Any]))
      MountPoint.foreach(__v => __obj.update("MountPoint", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      RaidArrayId.foreach(__v => __obj.update("RaidArrayId", __v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.update("Region", __v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.update("Size", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      VolumeId.foreach(__v => __obj.update("VolumeId", __v.asInstanceOf[js.Any]))
      VolumeType.foreach(__v => __obj.update("VolumeType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Volume]
    }
  }

  /**
    * Describes an Amazon EBS volume configuration.
    */
  @js.native
  trait VolumeConfiguration extends js.Object {
    var MountPoint: String
    var NumberOfDisks: Int
    var Size: Int
    var Encrypted: js.UndefOr[Boolean]
    var Iops: js.UndefOr[Int]
    var RaidLevel: js.UndefOr[Int]
    var VolumeType: js.UndefOr[String]
  }

  object VolumeConfiguration {
    def apply(
        MountPoint: String,
        NumberOfDisks: Int,
        Size: Int,
        Encrypted: js.UndefOr[Boolean] = js.undefined,
        Iops: js.UndefOr[Int] = js.undefined,
        RaidLevel: js.UndefOr[Int] = js.undefined,
        VolumeType: js.UndefOr[String] = js.undefined
    ): VolumeConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "MountPoint"    -> MountPoint.asInstanceOf[js.Any],
        "NumberOfDisks" -> NumberOfDisks.asInstanceOf[js.Any],
        "Size"          -> Size.asInstanceOf[js.Any]
      )

      Encrypted.foreach(__v => __obj.update("Encrypted", __v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.update("Iops", __v.asInstanceOf[js.Any]))
      RaidLevel.foreach(__v => __obj.update("RaidLevel", __v.asInstanceOf[js.Any]))
      VolumeType.foreach(__v => __obj.update("VolumeType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VolumeConfiguration]
    }
  }

  object VolumeTypeEnum {
    val gp2      = "gp2"
    val io1      = "io1"
    val standard = "standard"

    val values = js.Object.freeze(js.Array(gp2, io1, standard))
  }

  /**
    * Describes a time-based instance's auto scaling schedule. The schedule consists of a set of key-value pairs.
    * * The key is the time period (a UTC hour) and must be an integer from 0 - 23.
    *  * The value indicates whether the instance should be online or offline for the specified period, and must be set to "on" or "off"
    * The default setting for all time periods is off, so you use the following parameters primarily to specify the online periods. You don't have to explicitly specify offline periods unless you want to change an online period to an offline period.
    *  The following example specifies that the instance should be online for four hours, from UTC 1200 - 1600. It will be off for the remainder of the day.
    *  <code> { "12":"on", "13":"on", "14":"on", "15":"on" } </code>
    */
  @js.native
  trait WeeklyAutoScalingSchedule extends js.Object {
    var Friday: js.UndefOr[DailyAutoScalingSchedule]
    var Monday: js.UndefOr[DailyAutoScalingSchedule]
    var Saturday: js.UndefOr[DailyAutoScalingSchedule]
    var Sunday: js.UndefOr[DailyAutoScalingSchedule]
    var Thursday: js.UndefOr[DailyAutoScalingSchedule]
    var Tuesday: js.UndefOr[DailyAutoScalingSchedule]
    var Wednesday: js.UndefOr[DailyAutoScalingSchedule]
  }

  object WeeklyAutoScalingSchedule {
    def apply(
        Friday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined,
        Monday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined,
        Saturday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined,
        Sunday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined,
        Thursday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined,
        Tuesday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined,
        Wednesday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
    ): WeeklyAutoScalingSchedule = {
      val __obj = js.Dictionary.empty[js.Any]
      Friday.foreach(__v => __obj.update("Friday", __v.asInstanceOf[js.Any]))
      Monday.foreach(__v => __obj.update("Monday", __v.asInstanceOf[js.Any]))
      Saturday.foreach(__v => __obj.update("Saturday", __v.asInstanceOf[js.Any]))
      Sunday.foreach(__v => __obj.update("Sunday", __v.asInstanceOf[js.Any]))
      Thursday.foreach(__v => __obj.update("Thursday", __v.asInstanceOf[js.Any]))
      Tuesday.foreach(__v => __obj.update("Tuesday", __v.asInstanceOf[js.Any]))
      Wednesday.foreach(__v => __obj.update("Wednesday", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WeeklyAutoScalingSchedule]
    }
  }
}
