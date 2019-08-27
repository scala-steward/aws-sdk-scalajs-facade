package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object servicediscovery {
  type Arn                     = String
  type AttrKey                 = String
  type AttrValue               = String
  type Attributes              = js.Dictionary[AttrValue]
  type Code                    = String
  type CustomHealthStatus      = String
  type DnsRecordList           = js.Array[DnsRecord]
  type FailureThreshold        = Int
  type FilterCondition         = String
  type FilterValue             = String
  type FilterValues            = js.Array[FilterValue]
  type HealthCheckType         = String
  type HealthStatus            = String
  type HealthStatusFilter      = String
  type HttpInstanceSummaryList = js.Array[HttpInstanceSummary]
  type InstanceHealthStatusMap = js.Dictionary[HealthStatus]
  type InstanceIdList          = js.Array[ResourceId]
  type InstanceSummaryList     = js.Array[InstanceSummary]
  type MaxResults              = Int
  type Message                 = String
  type NamespaceFilterName     = String
  type NamespaceFilters        = js.Array[NamespaceFilter]
  type NamespaceName           = String
  type NamespaceSummariesList  = js.Array[NamespaceSummary]
  type NamespaceType           = String
  type NextToken               = String
  type OperationFilterName     = String
  type OperationFilters        = js.Array[OperationFilter]
  type OperationId             = String
  type OperationStatus         = String
  type OperationSummaryList    = js.Array[OperationSummary]
  type OperationTargetType     = String
  type OperationTargetsMap     = js.Dictionary[ResourceId]
  type OperationType           = String
  type RecordTTL               = Double
  type RecordType              = String
  type ResourceCount           = Int
  type ResourceDescription     = String
  type ResourceId              = String
  type ResourcePath            = String
  type RoutingPolicy           = String
  type ServiceFilterName       = String
  type ServiceFilters          = js.Array[ServiceFilter]
  type ServiceName             = String
  type ServiceSummariesList    = js.Array[ServiceSummary]
  type Timestamp               = js.Date

  implicit final class ServiceDiscoveryOps(val service: ServiceDiscovery) extends AnyVal {

    def createHttpNamespaceFuture(params: CreateHttpNamespaceRequest): Future[CreateHttpNamespaceResponse] =
      service.createHttpNamespace(params).promise.toFuture
    def createPrivateDnsNamespaceFuture(
        params: CreatePrivateDnsNamespaceRequest
    ): Future[CreatePrivateDnsNamespaceResponse] = service.createPrivateDnsNamespace(params).promise.toFuture
    def createPublicDnsNamespaceFuture(
        params: CreatePublicDnsNamespaceRequest
    ): Future[CreatePublicDnsNamespaceResponse] = service.createPublicDnsNamespace(params).promise.toFuture
    def createServiceFuture(params: CreateServiceRequest): Future[CreateServiceResponse] =
      service.createService(params).promise.toFuture
    def deleteNamespaceFuture(params: DeleteNamespaceRequest): Future[DeleteNamespaceResponse] =
      service.deleteNamespace(params).promise.toFuture
    def deleteServiceFuture(params: DeleteServiceRequest): Future[DeleteServiceResponse] =
      service.deleteService(params).promise.toFuture
    def deregisterInstanceFuture(params: DeregisterInstanceRequest): Future[DeregisterInstanceResponse] =
      service.deregisterInstance(params).promise.toFuture
    def discoverInstancesFuture(params: DiscoverInstancesRequest): Future[DiscoverInstancesResponse] =
      service.discoverInstances(params).promise.toFuture
    def getInstanceFuture(params: GetInstanceRequest): Future[GetInstanceResponse] =
      service.getInstance(params).promise.toFuture
    def getInstancesHealthStatusFuture(
        params: GetInstancesHealthStatusRequest
    ): Future[GetInstancesHealthStatusResponse] = service.getInstancesHealthStatus(params).promise.toFuture
    def getNamespaceFuture(params: GetNamespaceRequest): Future[GetNamespaceResponse] =
      service.getNamespace(params).promise.toFuture
    def getOperationFuture(params: GetOperationRequest): Future[GetOperationResponse] =
      service.getOperation(params).promise.toFuture
    def getServiceFuture(params: GetServiceRequest): Future[GetServiceResponse] =
      service.getService(params).promise.toFuture
    def listInstancesFuture(params: ListInstancesRequest): Future[ListInstancesResponse] =
      service.listInstances(params).promise.toFuture
    def listNamespacesFuture(params: ListNamespacesRequest): Future[ListNamespacesResponse] =
      service.listNamespaces(params).promise.toFuture
    def listOperationsFuture(params: ListOperationsRequest): Future[ListOperationsResponse] =
      service.listOperations(params).promise.toFuture
    def listServicesFuture(params: ListServicesRequest): Future[ListServicesResponse] =
      service.listServices(params).promise.toFuture
    def registerInstanceFuture(params: RegisterInstanceRequest): Future[RegisterInstanceResponse] =
      service.registerInstance(params).promise.toFuture
    def updateInstanceCustomHealthStatusFuture(params: UpdateInstanceCustomHealthStatusRequest): Future[js.Object] =
      service.updateInstanceCustomHealthStatus(params).promise.toFuture
    def updateServiceFuture(params: UpdateServiceRequest): Future[UpdateServiceResponse] =
      service.updateService(params).promise.toFuture
  }
}

package servicediscovery {
  @js.native
  @JSImport("aws-sdk", "ServiceDiscovery")
  class ServiceDiscovery() extends js.Object {
    def this(config: AWSConfig) = this()

    def createHttpNamespace(params: CreateHttpNamespaceRequest): Request[CreateHttpNamespaceResponse] = js.native
    def createPrivateDnsNamespace(
        params: CreatePrivateDnsNamespaceRequest
    ): Request[CreatePrivateDnsNamespaceResponse] = js.native
    def createPublicDnsNamespace(params: CreatePublicDnsNamespaceRequest): Request[CreatePublicDnsNamespaceResponse] =
      js.native
    def createService(params: CreateServiceRequest): Request[CreateServiceResponse]                = js.native
    def deleteNamespace(params: DeleteNamespaceRequest): Request[DeleteNamespaceResponse]          = js.native
    def deleteService(params: DeleteServiceRequest): Request[DeleteServiceResponse]                = js.native
    def deregisterInstance(params: DeregisterInstanceRequest): Request[DeregisterInstanceResponse] = js.native
    def discoverInstances(params: DiscoverInstancesRequest): Request[DiscoverInstancesResponse]    = js.native
    def getInstance(params: GetInstanceRequest): Request[GetInstanceResponse]                      = js.native
    def getInstancesHealthStatus(params: GetInstancesHealthStatusRequest): Request[GetInstancesHealthStatusResponse] =
      js.native
    def getNamespace(params: GetNamespaceRequest): Request[GetNamespaceResponse]             = js.native
    def getOperation(params: GetOperationRequest): Request[GetOperationResponse]             = js.native
    def getService(params: GetServiceRequest): Request[GetServiceResponse]                   = js.native
    def listInstances(params: ListInstancesRequest): Request[ListInstancesResponse]          = js.native
    def listNamespaces(params: ListNamespacesRequest): Request[ListNamespacesResponse]       = js.native
    def listOperations(params: ListOperationsRequest): Request[ListOperationsResponse]       = js.native
    def listServices(params: ListServicesRequest): Request[ListServicesResponse]             = js.native
    def registerInstance(params: RegisterInstanceRequest): Request[RegisterInstanceResponse] = js.native
    def updateInstanceCustomHealthStatus(params: UpdateInstanceCustomHealthStatusRequest): Request[js.Object] =
      js.native
    def updateService(params: UpdateServiceRequest): Request[UpdateServiceResponse] = js.native
  }

  @js.native
  trait CreateHttpNamespaceRequest extends js.Object {
    var Name: NamespaceName
    var CreatorRequestId: js.UndefOr[ResourceId]
    var Description: js.UndefOr[ResourceDescription]
  }

  object CreateHttpNamespaceRequest {
    def apply(
        Name: NamespaceName,
        CreatorRequestId: js.UndefOr[ResourceId] = js.undefined,
        Description: js.UndefOr[ResourceDescription] = js.undefined
    ): CreateHttpNamespaceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CreatorRequestId.foreach(__v => __obj.update("CreatorRequestId", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHttpNamespaceRequest]
    }
  }

  @js.native
  trait CreateHttpNamespaceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object CreateHttpNamespaceResponse {
    def apply(
        OperationId: js.UndefOr[OperationId] = js.undefined
    ): CreateHttpNamespaceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      OperationId.foreach(__v => __obj.update("OperationId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHttpNamespaceResponse]
    }
  }

  @js.native
  trait CreatePrivateDnsNamespaceRequest extends js.Object {
    var Name: NamespaceName
    var Vpc: ResourceId
    var CreatorRequestId: js.UndefOr[ResourceId]
    var Description: js.UndefOr[ResourceDescription]
  }

  object CreatePrivateDnsNamespaceRequest {
    def apply(
        Name: NamespaceName,
        Vpc: ResourceId,
        CreatorRequestId: js.UndefOr[ResourceId] = js.undefined,
        Description: js.UndefOr[ResourceDescription] = js.undefined
    ): CreatePrivateDnsNamespaceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any],
        "Vpc"  -> Vpc.asInstanceOf[js.Any]
      )

      CreatorRequestId.foreach(__v => __obj.update("CreatorRequestId", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePrivateDnsNamespaceRequest]
    }
  }

  @js.native
  trait CreatePrivateDnsNamespaceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object CreatePrivateDnsNamespaceResponse {
    def apply(
        OperationId: js.UndefOr[OperationId] = js.undefined
    ): CreatePrivateDnsNamespaceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      OperationId.foreach(__v => __obj.update("OperationId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePrivateDnsNamespaceResponse]
    }
  }

  @js.native
  trait CreatePublicDnsNamespaceRequest extends js.Object {
    var Name: NamespaceName
    var CreatorRequestId: js.UndefOr[ResourceId]
    var Description: js.UndefOr[ResourceDescription]
  }

  object CreatePublicDnsNamespaceRequest {
    def apply(
        Name: NamespaceName,
        CreatorRequestId: js.UndefOr[ResourceId] = js.undefined,
        Description: js.UndefOr[ResourceDescription] = js.undefined
    ): CreatePublicDnsNamespaceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CreatorRequestId.foreach(__v => __obj.update("CreatorRequestId", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePublicDnsNamespaceRequest]
    }
  }

  @js.native
  trait CreatePublicDnsNamespaceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object CreatePublicDnsNamespaceResponse {
    def apply(
        OperationId: js.UndefOr[OperationId] = js.undefined
    ): CreatePublicDnsNamespaceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      OperationId.foreach(__v => __obj.update("OperationId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePublicDnsNamespaceResponse]
    }
  }

  @js.native
  trait CreateServiceRequest extends js.Object {
    var Name: ServiceName
    var CreatorRequestId: js.UndefOr[ResourceId]
    var Description: js.UndefOr[ResourceDescription]
    var DnsConfig: js.UndefOr[DnsConfig]
    var HealthCheckConfig: js.UndefOr[HealthCheckConfig]
    var HealthCheckCustomConfig: js.UndefOr[HealthCheckCustomConfig]
    var NamespaceId: js.UndefOr[ResourceId]
  }

  object CreateServiceRequest {
    def apply(
        Name: ServiceName,
        CreatorRequestId: js.UndefOr[ResourceId] = js.undefined,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        DnsConfig: js.UndefOr[DnsConfig] = js.undefined,
        HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined,
        HealthCheckCustomConfig: js.UndefOr[HealthCheckCustomConfig] = js.undefined,
        NamespaceId: js.UndefOr[ResourceId] = js.undefined
    ): CreateServiceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CreatorRequestId.foreach(__v => __obj.update("CreatorRequestId", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      DnsConfig.foreach(__v => __obj.update("DnsConfig", __v.asInstanceOf[js.Any]))
      HealthCheckConfig.foreach(__v => __obj.update("HealthCheckConfig", __v.asInstanceOf[js.Any]))
      HealthCheckCustomConfig.foreach(__v => __obj.update("HealthCheckCustomConfig", __v.asInstanceOf[js.Any]))
      NamespaceId.foreach(__v => __obj.update("NamespaceId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServiceRequest]
    }
  }

  @js.native
  trait CreateServiceResponse extends js.Object {
    var Service: js.UndefOr[Service]
  }

  object CreateServiceResponse {
    def apply(
        Service: js.UndefOr[Service] = js.undefined
    ): CreateServiceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Service.foreach(__v => __obj.update("Service", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServiceResponse]
    }
  }

  object CustomHealthStatusEnum {
    val HEALTHY   = "HEALTHY"
    val UNHEALTHY = "UNHEALTHY"

    val values = js.Object.freeze(js.Array(HEALTHY, UNHEALTHY))
  }

  @js.native
  trait DeleteNamespaceRequest extends js.Object {
    var Id: ResourceId
  }

  object DeleteNamespaceRequest {
    def apply(
        Id: ResourceId
    ): DeleteNamespaceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteNamespaceRequest]
    }
  }

  @js.native
  trait DeleteNamespaceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object DeleteNamespaceResponse {
    def apply(
        OperationId: js.UndefOr[OperationId] = js.undefined
    ): DeleteNamespaceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      OperationId.foreach(__v => __obj.update("OperationId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteNamespaceResponse]
    }
  }

  @js.native
  trait DeleteServiceRequest extends js.Object {
    var Id: ResourceId
  }

  object DeleteServiceRequest {
    def apply(
        Id: ResourceId
    ): DeleteServiceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteServiceRequest]
    }
  }

  @js.native
  trait DeleteServiceResponse extends js.Object {}

  object DeleteServiceResponse {
    def apply(
        ): DeleteServiceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteServiceResponse]
    }
  }

  @js.native
  trait DeregisterInstanceRequest extends js.Object {
    var InstanceId: ResourceId
    var ServiceId: ResourceId
  }

  object DeregisterInstanceRequest {
    def apply(
        InstanceId: ResourceId,
        ServiceId: ResourceId
    ): DeregisterInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ServiceId"  -> ServiceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeregisterInstanceRequest]
    }
  }

  @js.native
  trait DeregisterInstanceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object DeregisterInstanceResponse {
    def apply(
        OperationId: js.UndefOr[OperationId] = js.undefined
    ): DeregisterInstanceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      OperationId.foreach(__v => __obj.update("OperationId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterInstanceResponse]
    }
  }

  @js.native
  trait DiscoverInstancesRequest extends js.Object {
    var NamespaceName: NamespaceName
    var ServiceName: ServiceName
    var HealthStatus: js.UndefOr[HealthStatusFilter]
    var MaxResults: js.UndefOr[MaxResults]
    var QueryParameters: js.UndefOr[Attributes]
  }

  object DiscoverInstancesRequest {
    def apply(
        NamespaceName: NamespaceName,
        ServiceName: ServiceName,
        HealthStatus: js.UndefOr[HealthStatusFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        QueryParameters: js.UndefOr[Attributes] = js.undefined
    ): DiscoverInstancesRequest = {
      val __obj = js.Dictionary[js.Any](
        "NamespaceName" -> NamespaceName.asInstanceOf[js.Any],
        "ServiceName"   -> ServiceName.asInstanceOf[js.Any]
      )

      HealthStatus.foreach(__v => __obj.update("HealthStatus", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      QueryParameters.foreach(__v => __obj.update("QueryParameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DiscoverInstancesRequest]
    }
  }

  @js.native
  trait DiscoverInstancesResponse extends js.Object {
    var Instances: js.UndefOr[HttpInstanceSummaryList]
  }

  object DiscoverInstancesResponse {
    def apply(
        Instances: js.UndefOr[HttpInstanceSummaryList] = js.undefined
    ): DiscoverInstancesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Instances.foreach(__v => __obj.update("Instances", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DiscoverInstancesResponse]
    }
  }

  /**
    * A complex type that contains information about the Amazon Route 53 DNS records that you want AWS Cloud Map to create when you register an instance.
    */
  @js.native
  trait DnsConfig extends js.Object {
    var DnsRecords: DnsRecordList
    var NamespaceId: js.UndefOr[ResourceId]
    var RoutingPolicy: js.UndefOr[RoutingPolicy]
  }

  object DnsConfig {
    def apply(
        DnsRecords: DnsRecordList,
        NamespaceId: js.UndefOr[ResourceId] = js.undefined,
        RoutingPolicy: js.UndefOr[RoutingPolicy] = js.undefined
    ): DnsConfig = {
      val __obj = js.Dictionary[js.Any](
        "DnsRecords" -> DnsRecords.asInstanceOf[js.Any]
      )

      NamespaceId.foreach(__v => __obj.update("NamespaceId", __v.asInstanceOf[js.Any]))
      RoutingPolicy.foreach(__v => __obj.update("RoutingPolicy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DnsConfig]
    }
  }

  /**
    * A complex type that contains information about changes to the Route 53 DNS records that AWS Cloud Map creates when you register an instance.
    */
  @js.native
  trait DnsConfigChange extends js.Object {
    var DnsRecords: DnsRecordList
  }

  object DnsConfigChange {
    def apply(
        DnsRecords: DnsRecordList
    ): DnsConfigChange = {
      val __obj = js.Dictionary[js.Any](
        "DnsRecords" -> DnsRecords.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DnsConfigChange]
    }
  }

  /**
    * A complex type that contains the ID for the Route 53 hosted zone that AWS Cloud Map creates when you create a namespace.
    */
  @js.native
  trait DnsProperties extends js.Object {
    var HostedZoneId: js.UndefOr[ResourceId]
  }

  object DnsProperties {
    def apply(
        HostedZoneId: js.UndefOr[ResourceId] = js.undefined
    ): DnsProperties = {
      val __obj = js.Dictionary.empty[js.Any]
      HostedZoneId.foreach(__v => __obj.update("HostedZoneId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DnsProperties]
    }
  }

  /**
    * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud Map to create when you register an instance.
    */
  @js.native
  trait DnsRecord extends js.Object {
    var TTL: RecordTTL
    var Type: RecordType
  }

  object DnsRecord {
    def apply(
        TTL: RecordTTL,
        Type: RecordType
    ): DnsRecord = {
      val __obj = js.Dictionary[js.Any](
        "TTL"  -> TTL.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DnsRecord]
    }
  }

  object FilterConditionEnum {
    val EQ      = "EQ"
    val IN      = "IN"
    val BETWEEN = "BETWEEN"

    val values = js.Object.freeze(js.Array(EQ, IN, BETWEEN))
  }

  @js.native
  trait GetInstanceRequest extends js.Object {
    var InstanceId: ResourceId
    var ServiceId: ResourceId
  }

  object GetInstanceRequest {
    def apply(
        InstanceId: ResourceId,
        ServiceId: ResourceId
    ): GetInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ServiceId"  -> ServiceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetInstanceRequest]
    }
  }

  @js.native
  trait GetInstanceResponse extends js.Object {
    var Instance: js.UndefOr[Instance]
  }

  object GetInstanceResponse {
    def apply(
        Instance: js.UndefOr[Instance] = js.undefined
    ): GetInstanceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Instance.foreach(__v => __obj.update("Instance", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInstanceResponse]
    }
  }

  @js.native
  trait GetInstancesHealthStatusRequest extends js.Object {
    var ServiceId: ResourceId
    var Instances: js.UndefOr[InstanceIdList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetInstancesHealthStatusRequest {
    def apply(
        ServiceId: ResourceId,
        Instances: js.UndefOr[InstanceIdList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetInstancesHealthStatusRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServiceId" -> ServiceId.asInstanceOf[js.Any]
      )

      Instances.foreach(__v => __obj.update("Instances", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInstancesHealthStatusRequest]
    }
  }

  @js.native
  trait GetInstancesHealthStatusResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[InstanceHealthStatusMap]
  }

  object GetInstancesHealthStatusResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Status: js.UndefOr[InstanceHealthStatusMap] = js.undefined
    ): GetInstancesHealthStatusResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInstancesHealthStatusResponse]
    }
  }

  @js.native
  trait GetNamespaceRequest extends js.Object {
    var Id: ResourceId
  }

  object GetNamespaceRequest {
    def apply(
        Id: ResourceId
    ): GetNamespaceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetNamespaceRequest]
    }
  }

  @js.native
  trait GetNamespaceResponse extends js.Object {
    var Namespace: js.UndefOr[Namespace]
  }

  object GetNamespaceResponse {
    def apply(
        Namespace: js.UndefOr[Namespace] = js.undefined
    ): GetNamespaceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Namespace.foreach(__v => __obj.update("Namespace", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNamespaceResponse]
    }
  }

  @js.native
  trait GetOperationRequest extends js.Object {
    var OperationId: ResourceId
  }

  object GetOperationRequest {
    def apply(
        OperationId: ResourceId
    ): GetOperationRequest = {
      val __obj = js.Dictionary[js.Any](
        "OperationId" -> OperationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetOperationRequest]
    }
  }

  @js.native
  trait GetOperationResponse extends js.Object {
    var Operation: js.UndefOr[Operation]
  }

  object GetOperationResponse {
    def apply(
        Operation: js.UndefOr[Operation] = js.undefined
    ): GetOperationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Operation.foreach(__v => __obj.update("Operation", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOperationResponse]
    }
  }

  @js.native
  trait GetServiceRequest extends js.Object {
    var Id: ResourceId
  }

  object GetServiceRequest {
    def apply(
        Id: ResourceId
    ): GetServiceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetServiceRequest]
    }
  }

  @js.native
  trait GetServiceResponse extends js.Object {
    var Service: js.UndefOr[Service]
  }

  object GetServiceResponse {
    def apply(
        Service: js.UndefOr[Service] = js.undefined
    ): GetServiceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Service.foreach(__v => __obj.update("Service", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceResponse]
    }
  }

  /**
    * <i>Public DNS namespaces only.</i> A complex type that contains settings for an optional health check. If you specify settings for a health check, AWS Cloud Map associates the health check with the records that you specify in <code>DnsConfig</code>.
    *  <important> If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code> but not both.
    *  </important> Health checks are basic Route 53 health checks that monitor an AWS endpoint. For information about pricing for health checks, see [[http://aws.amazon.com/route53/pricing/|Amazon Route 53 Pricing]].
    *  Note the following about configuring health checks.
    *  ```A and AAAA records```
    *  If <code>DnsConfig</code> includes configurations for both A and AAAA records, AWS Cloud Map creates a health check that uses the IPv4 address to check the health of the resource. If the endpoint that is specified by the IPv4 address is unhealthy, Route 53 considers both the A and AAAA records to be unhealthy.
    *  ```CNAME records```
    *  You can't specify settings for <code>HealthCheckConfig</code> when the <code>DNSConfig</code> includes <code>CNAME</code> for the value of <code>Type</code>. If you do, the <code>CreateService</code> request will fail with an <code>InvalidInput</code> error.
    *  ```Request interval```
    *  A Route 53 health checker in each health-checking region sends a health check request to an endpoint every 30 seconds. On average, your endpoint receives a health check request about every two seconds. However, health checkers don't coordinate with one another, so you'll sometimes see several requests per second followed by a few seconds with no health checks at all.
    *  ```Health checking regions```
    *  Health checkers perform checks from all Route 53 health-checking regions. For a list of the current regions, see [[http://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html#Route53-Type-HealthCheckConfig-Regions|Regions]].
    *  ```Alias records```
    *  When you register an instance, if you include the <code>AWS_ALIAS_DNS_NAME</code> attribute, AWS Cloud Map creates a Route 53 alias record. Note the following:
    * * Route 53 automatically sets <code>EvaluateTargetHealth</code> to true for alias records. When <code>EvaluateTargetHealth</code> is true, the alias record inherits the health of the referenced AWS resource. such as an ELB load balancer. For more information, see [[http://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html#Route53-Type-AliasTarget-EvaluateTargetHealth|EvaluateTargetHealth]].
    *  * If you include <code>HealthCheckConfig</code> and then use the service to register an instance that creates an alias record, Route 53 doesn't create the health check.
    * ```Charges for health checks```
    *  Health checks are basic Route 53 health checks that monitor an AWS endpoint. For information about pricing for health checks, see [[http://aws.amazon.com/route53/pricing/|Amazon Route 53 Pricing]].
    */
  @js.native
  trait HealthCheckConfig extends js.Object {
    var Type: HealthCheckType
    var FailureThreshold: js.UndefOr[FailureThreshold]
    var ResourcePath: js.UndefOr[ResourcePath]
  }

  object HealthCheckConfig {
    def apply(
        Type: HealthCheckType,
        FailureThreshold: js.UndefOr[FailureThreshold] = js.undefined,
        ResourcePath: js.UndefOr[ResourcePath] = js.undefined
    ): HealthCheckConfig = {
      val __obj = js.Dictionary[js.Any](
        "Type" -> Type.asInstanceOf[js.Any]
      )

      FailureThreshold.foreach(__v => __obj.update("FailureThreshold", __v.asInstanceOf[js.Any]))
      ResourcePath.foreach(__v => __obj.update("ResourcePath", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HealthCheckConfig]
    }
  }

  /**
    * A complex type that contains information about an optional custom health check. A custom health check, which requires that you use a third-party health checker to evaluate the health of your resources, is useful in the following circumstances:
    * * You can't use a health check that is defined by <code>HealthCheckConfig</code> because the resource isn't available over the internet. For example, you can use a custom health check when the instance is in an Amazon VPC. (To check the health of resources in a VPC, the health checker must also be in the VPC.)
    *  * You want to use a third-party health checker regardless of where your resources are.
    * <important> If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code> but not both.
    *  </important> To change the status of a custom health check, submit an <code>UpdateInstanceCustomHealthStatus</code> request. Cloud Map doesn't monitor the status of the resource, it just keeps a record of the status specified in the most recent <code>UpdateInstanceCustomHealthStatus</code> request.
    *  Here's how custom health checks work:
    *  <ol> * You create a service and specify a value for <code>FailureThreshold</code>.
    *  The failure threshold indicates the number of 30-second intervals you want AWS Cloud Map to wait between the time that your application sends an <a>UpdateInstanceCustomHealthStatus</a> request and the time that AWS Cloud Map stops routing internet traffic to the corresponding resource.
    *  * You register an instance.
    *  <li> You configure a third-party health checker to monitor the resource that is associated with the new instance.
    *
    * '''Note:'''AWS Cloud Map doesn't check the health of the resource directly.
    * </li> * The third-party health-checker determines that the resource is unhealthy and notifies your application.
    *  * Your application submits an <code>UpdateInstanceCustomHealthStatus</code> request.
    *  * AWS Cloud Map waits for (<code>FailureThreshold</code> x 30) seconds.
    *  * If another <code>UpdateInstanceCustomHealthStatus</code> request doesn't arrive during that time to change the status back to healthy, AWS Cloud Map stops routing traffic to the resource.
    *  </ol> Note the following about configuring custom health checks.
    */
  @js.native
  trait HealthCheckCustomConfig extends js.Object {
    var FailureThreshold: js.UndefOr[FailureThreshold]
  }

  object HealthCheckCustomConfig {
    def apply(
        FailureThreshold: js.UndefOr[FailureThreshold] = js.undefined
    ): HealthCheckCustomConfig = {
      val __obj = js.Dictionary.empty[js.Any]
      FailureThreshold.foreach(__v => __obj.update("FailureThreshold", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HealthCheckCustomConfig]
    }
  }

  object HealthCheckTypeEnum {
    val HTTP  = "HTTP"
    val HTTPS = "HTTPS"
    val TCP   = "TCP"

    val values = js.Object.freeze(js.Array(HTTP, HTTPS, TCP))
  }

  object HealthStatusEnum {
    val HEALTHY   = "HEALTHY"
    val UNHEALTHY = "UNHEALTHY"
    val UNKNOWN   = "UNKNOWN"

    val values = js.Object.freeze(js.Array(HEALTHY, UNHEALTHY, UNKNOWN))
  }

  object HealthStatusFilterEnum {
    val HEALTHY   = "HEALTHY"
    val UNHEALTHY = "UNHEALTHY"
    val ALL       = "ALL"

    val values = js.Object.freeze(js.Array(HEALTHY, UNHEALTHY, ALL))
  }

  /**
    * In a response to a <a>DiscoverInstance</a> request, <code>HttpInstanceSummary</code> contains information about one instance that matches the values that you specified in the request.
    */
  @js.native
  trait HttpInstanceSummary extends js.Object {
    var Attributes: js.UndefOr[Attributes]
    var HealthStatus: js.UndefOr[HealthStatus]
    var InstanceId: js.UndefOr[ResourceId]
    var NamespaceName: js.UndefOr[NamespaceName]
    var ServiceName: js.UndefOr[ServiceName]
  }

  object HttpInstanceSummary {
    def apply(
        Attributes: js.UndefOr[Attributes] = js.undefined,
        HealthStatus: js.UndefOr[HealthStatus] = js.undefined,
        InstanceId: js.UndefOr[ResourceId] = js.undefined,
        NamespaceName: js.UndefOr[NamespaceName] = js.undefined,
        ServiceName: js.UndefOr[ServiceName] = js.undefined
    ): HttpInstanceSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      HealthStatus.foreach(__v => __obj.update("HealthStatus", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      NamespaceName.foreach(__v => __obj.update("NamespaceName", __v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.update("ServiceName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpInstanceSummary]
    }
  }

  /**
    * A complex type that contains the name of an HTTP namespace.
    */
  @js.native
  trait HttpProperties extends js.Object {
    var HttpName: js.UndefOr[NamespaceName]
  }

  object HttpProperties {
    def apply(
        HttpName: js.UndefOr[NamespaceName] = js.undefined
    ): HttpProperties = {
      val __obj = js.Dictionary.empty[js.Any]
      HttpName.foreach(__v => __obj.update("HttpName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpProperties]
    }
  }

  /**
    * A complex type that contains information about an instance that AWS Cloud Map creates when you submit a <code>RegisterInstance</code> request.
    */
  @js.native
  trait Instance extends js.Object {
    var Id: ResourceId
    var Attributes: js.UndefOr[Attributes]
    var CreatorRequestId: js.UndefOr[ResourceId]
  }

  object Instance {
    def apply(
        Id: ResourceId,
        Attributes: js.UndefOr[Attributes] = js.undefined,
        CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
    ): Instance = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.update("CreatorRequestId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Instance]
    }
  }

  /**
    * A complex type that contains information about the instances that you registered by using a specified service.
    */
  @js.native
  trait InstanceSummary extends js.Object {
    var Attributes: js.UndefOr[Attributes]
    var Id: js.UndefOr[ResourceId]
  }

  object InstanceSummary {
    def apply(
        Attributes: js.UndefOr[Attributes] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined
    ): InstanceSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceSummary]
    }
  }

  @js.native
  trait ListInstancesRequest extends js.Object {
    var ServiceId: ResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInstancesRequest {
    def apply(
        ServiceId: ResourceId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInstancesRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServiceId" -> ServiceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstancesRequest]
    }
  }

  @js.native
  trait ListInstancesResponse extends js.Object {
    var Instances: js.UndefOr[InstanceSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInstancesResponse {
    def apply(
        Instances: js.UndefOr[InstanceSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInstancesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Instances.foreach(__v => __obj.update("Instances", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstancesResponse]
    }
  }

  @js.native
  trait ListNamespacesRequest extends js.Object {
    var Filters: js.UndefOr[NamespaceFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListNamespacesRequest {
    def apply(
        Filters: js.UndefOr[NamespaceFilters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListNamespacesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNamespacesRequest]
    }
  }

  @js.native
  trait ListNamespacesResponse extends js.Object {
    var Namespaces: js.UndefOr[NamespaceSummariesList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListNamespacesResponse {
    def apply(
        Namespaces: js.UndefOr[NamespaceSummariesList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListNamespacesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Namespaces.foreach(__v => __obj.update("Namespaces", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNamespacesResponse]
    }
  }

  @js.native
  trait ListOperationsRequest extends js.Object {
    var Filters: js.UndefOr[OperationFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListOperationsRequest {
    def apply(
        Filters: js.UndefOr[OperationFilters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListOperationsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOperationsRequest]
    }
  }

  @js.native
  trait ListOperationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Operations: js.UndefOr[OperationSummaryList]
  }

  object ListOperationsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Operations: js.UndefOr[OperationSummaryList] = js.undefined
    ): ListOperationsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Operations.foreach(__v => __obj.update("Operations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOperationsResponse]
    }
  }

  @js.native
  trait ListServicesRequest extends js.Object {
    var Filters: js.UndefOr[ServiceFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListServicesRequest {
    def apply(
        Filters: js.UndefOr[ServiceFilters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListServicesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServicesRequest]
    }
  }

  @js.native
  trait ListServicesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Services: js.UndefOr[ServiceSummariesList]
  }

  object ListServicesResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Services: js.UndefOr[ServiceSummariesList] = js.undefined
    ): ListServicesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Services.foreach(__v => __obj.update("Services", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServicesResponse]
    }
  }

  /**
    * A complex type that contains information about a specified namespace.
    */
  @js.native
  trait Namespace extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreateDate: js.UndefOr[Timestamp]
    var CreatorRequestId: js.UndefOr[ResourceId]
    var Description: js.UndefOr[ResourceDescription]
    var Id: js.UndefOr[ResourceId]
    var Name: js.UndefOr[NamespaceName]
    var Properties: js.UndefOr[NamespaceProperties]
    var ServiceCount: js.UndefOr[ResourceCount]
    var Type: js.UndefOr[NamespaceType]
  }

  object Namespace {
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreateDate: js.UndefOr[Timestamp] = js.undefined,
        CreatorRequestId: js.UndefOr[ResourceId] = js.undefined,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined,
        Name: js.UndefOr[NamespaceName] = js.undefined,
        Properties: js.UndefOr[NamespaceProperties] = js.undefined,
        ServiceCount: js.UndefOr[ResourceCount] = js.undefined,
        Type: js.UndefOr[NamespaceType] = js.undefined
    ): Namespace = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.update("CreateDate", __v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.update("CreatorRequestId", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.update("Properties", __v.asInstanceOf[js.Any]))
      ServiceCount.foreach(__v => __obj.update("ServiceCount", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Namespace]
    }
  }

  /**
    * A complex type that identifies the namespaces that you want to list. You can choose to list public or private namespaces.
    */
  @js.native
  trait NamespaceFilter extends js.Object {
    var Name: NamespaceFilterName
    var Values: FilterValues
    var Condition: js.UndefOr[FilterCondition]
  }

  object NamespaceFilter {
    def apply(
        Name: NamespaceFilterName,
        Values: FilterValues,
        Condition: js.UndefOr[FilterCondition] = js.undefined
    ): NamespaceFilter = {
      val __obj = js.Dictionary[js.Any](
        "Name"   -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      Condition.foreach(__v => __obj.update("Condition", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NamespaceFilter]
    }
  }

  object NamespaceFilterNameEnum {
    val TYPE = "TYPE"

    val values = js.Object.freeze(js.Array(TYPE))
  }

  /**
    * A complex type that contains information that is specific to the namespace type.
    */
  @js.native
  trait NamespaceProperties extends js.Object {
    var DnsProperties: js.UndefOr[DnsProperties]
    var HttpProperties: js.UndefOr[HttpProperties]
  }

  object NamespaceProperties {
    def apply(
        DnsProperties: js.UndefOr[DnsProperties] = js.undefined,
        HttpProperties: js.UndefOr[HttpProperties] = js.undefined
    ): NamespaceProperties = {
      val __obj = js.Dictionary.empty[js.Any]
      DnsProperties.foreach(__v => __obj.update("DnsProperties", __v.asInstanceOf[js.Any]))
      HttpProperties.foreach(__v => __obj.update("HttpProperties", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NamespaceProperties]
    }
  }

  /**
    * A complex type that contains information about a namespace.
    */
  @js.native
  trait NamespaceSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreateDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[ResourceDescription]
    var Id: js.UndefOr[ResourceId]
    var Name: js.UndefOr[NamespaceName]
    var Properties: js.UndefOr[NamespaceProperties]
    var ServiceCount: js.UndefOr[ResourceCount]
    var Type: js.UndefOr[NamespaceType]
  }

  object NamespaceSummary {
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreateDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined,
        Name: js.UndefOr[NamespaceName] = js.undefined,
        Properties: js.UndefOr[NamespaceProperties] = js.undefined,
        ServiceCount: js.UndefOr[ResourceCount] = js.undefined,
        Type: js.UndefOr[NamespaceType] = js.undefined
    ): NamespaceSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.update("CreateDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.update("Properties", __v.asInstanceOf[js.Any]))
      ServiceCount.foreach(__v => __obj.update("ServiceCount", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NamespaceSummary]
    }
  }

  object NamespaceTypeEnum {
    val DNS_PUBLIC  = "DNS_PUBLIC"
    val DNS_PRIVATE = "DNS_PRIVATE"
    val HTTP        = "HTTP"

    val values = js.Object.freeze(js.Array(DNS_PUBLIC, DNS_PRIVATE, HTTP))
  }

  /**
    * A complex type that contains information about a specified operation.
    */
  @js.native
  trait Operation extends js.Object {
    var CreateDate: js.UndefOr[Timestamp]
    var ErrorCode: js.UndefOr[Code]
    var ErrorMessage: js.UndefOr[Message]
    var Id: js.UndefOr[OperationId]
    var Status: js.UndefOr[OperationStatus]
    var Targets: js.UndefOr[OperationTargetsMap]
    var Type: js.UndefOr[OperationType]
    var UpdateDate: js.UndefOr[Timestamp]
  }

  object Operation {
    def apply(
        CreateDate: js.UndefOr[Timestamp] = js.undefined,
        ErrorCode: js.UndefOr[Code] = js.undefined,
        ErrorMessage: js.UndefOr[Message] = js.undefined,
        Id: js.UndefOr[OperationId] = js.undefined,
        Status: js.UndefOr[OperationStatus] = js.undefined,
        Targets: js.UndefOr[OperationTargetsMap] = js.undefined,
        Type: js.UndefOr[OperationType] = js.undefined,
        UpdateDate: js.UndefOr[Timestamp] = js.undefined
    ): Operation = {
      val __obj = js.Dictionary.empty[js.Any]
      CreateDate.foreach(__v => __obj.update("CreateDate", __v.asInstanceOf[js.Any]))
      ErrorCode.foreach(__v => __obj.update("ErrorCode", __v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.update("ErrorMessage", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      UpdateDate.foreach(__v => __obj.update("UpdateDate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Operation]
    }
  }

  /**
    * A complex type that lets you select the operations that you want to list.
    */
  @js.native
  trait OperationFilter extends js.Object {
    var Name: OperationFilterName
    var Values: FilterValues
    var Condition: js.UndefOr[FilterCondition]
  }

  object OperationFilter {
    def apply(
        Name: OperationFilterName,
        Values: FilterValues,
        Condition: js.UndefOr[FilterCondition] = js.undefined
    ): OperationFilter = {
      val __obj = js.Dictionary[js.Any](
        "Name"   -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      Condition.foreach(__v => __obj.update("Condition", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OperationFilter]
    }
  }

  object OperationFilterNameEnum {
    val NAMESPACE_ID = "NAMESPACE_ID"
    val SERVICE_ID   = "SERVICE_ID"
    val STATUS       = "STATUS"
    val TYPE         = "TYPE"
    val UPDATE_DATE  = "UPDATE_DATE"

    val values = js.Object.freeze(js.Array(NAMESPACE_ID, SERVICE_ID, STATUS, TYPE, UPDATE_DATE))
  }

  object OperationStatusEnum {
    val SUBMITTED = "SUBMITTED"
    val PENDING   = "PENDING"
    val SUCCESS   = "SUCCESS"
    val FAIL      = "FAIL"

    val values = js.Object.freeze(js.Array(SUBMITTED, PENDING, SUCCESS, FAIL))
  }

  /**
    * A complex type that contains information about an operation that matches the criteria that you specified in a <a>ListOperations</a> request.
    */
  @js.native
  trait OperationSummary extends js.Object {
    var Id: js.UndefOr[OperationId]
    var Status: js.UndefOr[OperationStatus]
  }

  object OperationSummary {
    def apply(
        Id: js.UndefOr[OperationId] = js.undefined,
        Status: js.UndefOr[OperationStatus] = js.undefined
    ): OperationSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OperationSummary]
    }
  }

  object OperationTargetTypeEnum {
    val NAMESPACE = "NAMESPACE"
    val SERVICE   = "SERVICE"
    val INSTANCE  = "INSTANCE"

    val values = js.Object.freeze(js.Array(NAMESPACE, SERVICE, INSTANCE))
  }

  object OperationTypeEnum {
    val CREATE_NAMESPACE    = "CREATE_NAMESPACE"
    val DELETE_NAMESPACE    = "DELETE_NAMESPACE"
    val UPDATE_SERVICE      = "UPDATE_SERVICE"
    val REGISTER_INSTANCE   = "REGISTER_INSTANCE"
    val DEREGISTER_INSTANCE = "DEREGISTER_INSTANCE"

    val values = js.Object.freeze(
      js.Array(CREATE_NAMESPACE, DELETE_NAMESPACE, UPDATE_SERVICE, REGISTER_INSTANCE, DEREGISTER_INSTANCE)
    )
  }

  object RecordTypeEnum {
    val SRV   = "SRV"
    val A     = "A"
    val AAAA  = "AAAA"
    val CNAME = "CNAME"

    val values = js.Object.freeze(js.Array(SRV, A, AAAA, CNAME))
  }

  @js.native
  trait RegisterInstanceRequest extends js.Object {
    var Attributes: Attributes
    var InstanceId: ResourceId
    var ServiceId: ResourceId
    var CreatorRequestId: js.UndefOr[ResourceId]
  }

  object RegisterInstanceRequest {
    def apply(
        Attributes: Attributes,
        InstanceId: ResourceId,
        ServiceId: ResourceId,
        CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
    ): RegisterInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Attributes" -> Attributes.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ServiceId"  -> ServiceId.asInstanceOf[js.Any]
      )

      CreatorRequestId.foreach(__v => __obj.update("CreatorRequestId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterInstanceRequest]
    }
  }

  @js.native
  trait RegisterInstanceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object RegisterInstanceResponse {
    def apply(
        OperationId: js.UndefOr[OperationId] = js.undefined
    ): RegisterInstanceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      OperationId.foreach(__v => __obj.update("OperationId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterInstanceResponse]
    }
  }

  object RoutingPolicyEnum {
    val MULTIVALUE = "MULTIVALUE"
    val WEIGHTED   = "WEIGHTED"

    val values = js.Object.freeze(js.Array(MULTIVALUE, WEIGHTED))
  }

  /**
    * A complex type that contains information about the specified service.
    */
  @js.native
  trait Service extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreateDate: js.UndefOr[Timestamp]
    var CreatorRequestId: js.UndefOr[ResourceId]
    var Description: js.UndefOr[ResourceDescription]
    var DnsConfig: js.UndefOr[DnsConfig]
    var HealthCheckConfig: js.UndefOr[HealthCheckConfig]
    var HealthCheckCustomConfig: js.UndefOr[HealthCheckCustomConfig]
    var Id: js.UndefOr[ResourceId]
    var InstanceCount: js.UndefOr[ResourceCount]
    var Name: js.UndefOr[ServiceName]
    var NamespaceId: js.UndefOr[ResourceId]
  }

  object Service {
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreateDate: js.UndefOr[Timestamp] = js.undefined,
        CreatorRequestId: js.UndefOr[ResourceId] = js.undefined,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        DnsConfig: js.UndefOr[DnsConfig] = js.undefined,
        HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined,
        HealthCheckCustomConfig: js.UndefOr[HealthCheckCustomConfig] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined,
        InstanceCount: js.UndefOr[ResourceCount] = js.undefined,
        Name: js.UndefOr[ServiceName] = js.undefined,
        NamespaceId: js.UndefOr[ResourceId] = js.undefined
    ): Service = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.update("CreateDate", __v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.update("CreatorRequestId", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      DnsConfig.foreach(__v => __obj.update("DnsConfig", __v.asInstanceOf[js.Any]))
      HealthCheckConfig.foreach(__v => __obj.update("HealthCheckConfig", __v.asInstanceOf[js.Any]))
      HealthCheckCustomConfig.foreach(__v => __obj.update("HealthCheckCustomConfig", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      InstanceCount.foreach(__v => __obj.update("InstanceCount", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      NamespaceId.foreach(__v => __obj.update("NamespaceId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Service]
    }
  }

  /**
    * A complex type that contains changes to an existing service.
    */
  @js.native
  trait ServiceChange extends js.Object {
    var DnsConfig: DnsConfigChange
    var Description: js.UndefOr[ResourceDescription]
    var HealthCheckConfig: js.UndefOr[HealthCheckConfig]
  }

  object ServiceChange {
    def apply(
        DnsConfig: DnsConfigChange,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined
    ): ServiceChange = {
      val __obj = js.Dictionary[js.Any](
        "DnsConfig" -> DnsConfig.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      HealthCheckConfig.foreach(__v => __obj.update("HealthCheckConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceChange]
    }
  }

  /**
    * A complex type that lets you specify the namespaces that you want to list services for.
    */
  @js.native
  trait ServiceFilter extends js.Object {
    var Name: ServiceFilterName
    var Values: FilterValues
    var Condition: js.UndefOr[FilterCondition]
  }

  object ServiceFilter {
    def apply(
        Name: ServiceFilterName,
        Values: FilterValues,
        Condition: js.UndefOr[FilterCondition] = js.undefined
    ): ServiceFilter = {
      val __obj = js.Dictionary[js.Any](
        "Name"   -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      Condition.foreach(__v => __obj.update("Condition", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceFilter]
    }
  }

  object ServiceFilterNameEnum {
    val NAMESPACE_ID = "NAMESPACE_ID"

    val values = js.Object.freeze(js.Array(NAMESPACE_ID))
  }

  /**
    * A complex type that contains information about a specified service.
    */
  @js.native
  trait ServiceSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreateDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[ResourceDescription]
    var DnsConfig: js.UndefOr[DnsConfig]
    var HealthCheckConfig: js.UndefOr[HealthCheckConfig]
    var HealthCheckCustomConfig: js.UndefOr[HealthCheckCustomConfig]
    var Id: js.UndefOr[ResourceId]
    var InstanceCount: js.UndefOr[ResourceCount]
    var Name: js.UndefOr[ServiceName]
  }

  object ServiceSummary {
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreateDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        DnsConfig: js.UndefOr[DnsConfig] = js.undefined,
        HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined,
        HealthCheckCustomConfig: js.UndefOr[HealthCheckCustomConfig] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined,
        InstanceCount: js.UndefOr[ResourceCount] = js.undefined,
        Name: js.UndefOr[ServiceName] = js.undefined
    ): ServiceSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.update("CreateDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      DnsConfig.foreach(__v => __obj.update("DnsConfig", __v.asInstanceOf[js.Any]))
      HealthCheckConfig.foreach(__v => __obj.update("HealthCheckConfig", __v.asInstanceOf[js.Any]))
      HealthCheckCustomConfig.foreach(__v => __obj.update("HealthCheckCustomConfig", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      InstanceCount.foreach(__v => __obj.update("InstanceCount", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceSummary]
    }
  }

  @js.native
  trait UpdateInstanceCustomHealthStatusRequest extends js.Object {
    var InstanceId: ResourceId
    var ServiceId: ResourceId
    var Status: CustomHealthStatus
  }

  object UpdateInstanceCustomHealthStatusRequest {
    def apply(
        InstanceId: ResourceId,
        ServiceId: ResourceId,
        Status: CustomHealthStatus
    ): UpdateInstanceCustomHealthStatusRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ServiceId"  -> ServiceId.asInstanceOf[js.Any],
        "Status"     -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateInstanceCustomHealthStatusRequest]
    }
  }

  @js.native
  trait UpdateServiceRequest extends js.Object {
    var Id: ResourceId
    var Service: ServiceChange
  }

  object UpdateServiceRequest {
    def apply(
        Id: ResourceId,
        Service: ServiceChange
    ): UpdateServiceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id"      -> Id.asInstanceOf[js.Any],
        "Service" -> Service.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateServiceRequest]
    }
  }

  @js.native
  trait UpdateServiceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object UpdateServiceResponse {
    def apply(
        OperationId: js.UndefOr[OperationId] = js.undefined
    ): UpdateServiceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      OperationId.foreach(__v => __obj.update("OperationId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServiceResponse]
    }
  }
}
