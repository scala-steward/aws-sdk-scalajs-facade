package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object dms {
  type AccountQuotaList      = js.Array[AccountQuota]
  type AuthMechanismValue    = String
  type AuthTypeValue         = String
  type AvailabilityZonesList = js.Array[String]
  type BooleanOptional       = Boolean
  type CertificateList       = js.Array[Certificate]
  type CertificateWallet =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CompressionTypeValue                    = String
  type ConnectionList                          = js.Array[Connection]
  type DataFormatValue                         = String
  type DmsSslModeValue                         = String
  type EncodingTypeValue                       = String
  type EncryptionModeValue                     = String
  type EndpointList                            = js.Array[Endpoint]
  type EventCategoriesList                     = js.Array[String]
  type EventCategoryGroupList                  = js.Array[EventCategoryGroup]
  type EventList                               = js.Array[Event]
  type EventSubscriptionsList                  = js.Array[EventSubscription]
  type FilterList                              = js.Array[Filter]
  type FilterValueList                         = js.Array[String]
  type IntegerOptional                         = Int
  type KeyList                                 = js.Array[String]
  type MessageFormatValue                      = String
  type MigrationTypeValue                      = String
  type NestingLevelValue                       = String
  type OrderableReplicationInstanceList        = js.Array[OrderableReplicationInstance]
  type ParquetVersionValue                     = String
  type PendingMaintenanceActionDetails         = js.Array[PendingMaintenanceAction]
  type PendingMaintenanceActions               = js.Array[ResourcePendingMaintenanceActions]
  type RefreshSchemasStatusTypeValue           = String
  type ReleaseStatusValues                     = String
  type ReloadOptionValue                       = String
  type ReplicationEndpointTypeValue            = String
  type ReplicationInstanceList                 = js.Array[ReplicationInstance]
  type ReplicationInstancePrivateIpAddressList = js.Array[String]
  type ReplicationInstancePublicIpAddressList  = js.Array[String]
  type ReplicationInstanceTaskLogsList         = js.Array[ReplicationInstanceTaskLog]
  type ReplicationSubnetGroups                 = js.Array[ReplicationSubnetGroup]
  type ReplicationTaskAssessmentResultList     = js.Array[ReplicationTaskAssessmentResult]
  type ReplicationTaskList                     = js.Array[ReplicationTask]
  type SchemaList                              = js.Array[String]
  type SecretString                            = String
  type SourceIdsList                           = js.Array[String]
  type SourceType                              = String
  type StartReplicationTaskTypeValue           = String
  type SubnetIdentifierList                    = js.Array[String]
  type SubnetList                              = js.Array[Subnet]
  type SupportedEndpointTypeList               = js.Array[SupportedEndpointType]
  type TStamp                                  = js.Date
  type TableListToReload                       = js.Array[TableToReload]
  type TableStatisticsList                     = js.Array[TableStatistics]
  type TagList                                 = js.Array[Tag]
  type VpcSecurityGroupIdList                  = js.Array[String]
  type VpcSecurityGroupMembershipList          = js.Array[VpcSecurityGroupMembership]

  implicit final class DMSOps(val service: DMS) extends AnyVal {

    def addTagsToResourceFuture(params: AddTagsToResourceMessage): Future[AddTagsToResourceResponse] =
      service.addTagsToResource(params).promise.toFuture
    def applyPendingMaintenanceActionFuture(
        params: ApplyPendingMaintenanceActionMessage
    ): Future[ApplyPendingMaintenanceActionResponse] = service.applyPendingMaintenanceAction(params).promise.toFuture
    def createEndpointFuture(params: CreateEndpointMessage): Future[CreateEndpointResponse] =
      service.createEndpoint(params).promise.toFuture
    def createEventSubscriptionFuture(params: CreateEventSubscriptionMessage): Future[CreateEventSubscriptionResponse] =
      service.createEventSubscription(params).promise.toFuture
    def createReplicationInstanceFuture(
        params: CreateReplicationInstanceMessage
    ): Future[CreateReplicationInstanceResponse] = service.createReplicationInstance(params).promise.toFuture
    def createReplicationSubnetGroupFuture(
        params: CreateReplicationSubnetGroupMessage
    ): Future[CreateReplicationSubnetGroupResponse] = service.createReplicationSubnetGroup(params).promise.toFuture
    def createReplicationTaskFuture(params: CreateReplicationTaskMessage): Future[CreateReplicationTaskResponse] =
      service.createReplicationTask(params).promise.toFuture
    def deleteCertificateFuture(params: DeleteCertificateMessage): Future[DeleteCertificateResponse] =
      service.deleteCertificate(params).promise.toFuture
    def deleteEndpointFuture(params: DeleteEndpointMessage): Future[DeleteEndpointResponse] =
      service.deleteEndpoint(params).promise.toFuture
    def deleteEventSubscriptionFuture(params: DeleteEventSubscriptionMessage): Future[DeleteEventSubscriptionResponse] =
      service.deleteEventSubscription(params).promise.toFuture
    def deleteReplicationInstanceFuture(
        params: DeleteReplicationInstanceMessage
    ): Future[DeleteReplicationInstanceResponse] = service.deleteReplicationInstance(params).promise.toFuture
    def deleteReplicationSubnetGroupFuture(
        params: DeleteReplicationSubnetGroupMessage
    ): Future[DeleteReplicationSubnetGroupResponse] = service.deleteReplicationSubnetGroup(params).promise.toFuture
    def deleteReplicationTaskFuture(params: DeleteReplicationTaskMessage): Future[DeleteReplicationTaskResponse] =
      service.deleteReplicationTask(params).promise.toFuture
    def describeAccountAttributesFuture(
        params: DescribeAccountAttributesMessage
    ): Future[DescribeAccountAttributesResponse] = service.describeAccountAttributes(params).promise.toFuture
    def describeCertificatesFuture(params: DescribeCertificatesMessage): Future[DescribeCertificatesResponse] =
      service.describeCertificates(params).promise.toFuture
    def describeConnectionsFuture(params: DescribeConnectionsMessage): Future[DescribeConnectionsResponse] =
      service.describeConnections(params).promise.toFuture
    def describeEndpointTypesFuture(params: DescribeEndpointTypesMessage): Future[DescribeEndpointTypesResponse] =
      service.describeEndpointTypes(params).promise.toFuture
    def describeEndpointsFuture(params: DescribeEndpointsMessage): Future[DescribeEndpointsResponse] =
      service.describeEndpoints(params).promise.toFuture
    def describeEventCategoriesFuture(params: DescribeEventCategoriesMessage): Future[DescribeEventCategoriesResponse] =
      service.describeEventCategories(params).promise.toFuture
    def describeEventSubscriptionsFuture(
        params: DescribeEventSubscriptionsMessage
    ): Future[DescribeEventSubscriptionsResponse] = service.describeEventSubscriptions(params).promise.toFuture
    def describeEventsFuture(params: DescribeEventsMessage): Future[DescribeEventsResponse] =
      service.describeEvents(params).promise.toFuture
    def describeOrderableReplicationInstancesFuture(
        params: DescribeOrderableReplicationInstancesMessage
    ): Future[DescribeOrderableReplicationInstancesResponse] =
      service.describeOrderableReplicationInstances(params).promise.toFuture
    def describePendingMaintenanceActionsFuture(
        params: DescribePendingMaintenanceActionsMessage
    ): Future[DescribePendingMaintenanceActionsResponse] =
      service.describePendingMaintenanceActions(params).promise.toFuture
    def describeRefreshSchemasStatusFuture(
        params: DescribeRefreshSchemasStatusMessage
    ): Future[DescribeRefreshSchemasStatusResponse] = service.describeRefreshSchemasStatus(params).promise.toFuture
    def describeReplicationInstanceTaskLogsFuture(
        params: DescribeReplicationInstanceTaskLogsMessage
    ): Future[DescribeReplicationInstanceTaskLogsResponse] =
      service.describeReplicationInstanceTaskLogs(params).promise.toFuture
    def describeReplicationInstancesFuture(
        params: DescribeReplicationInstancesMessage
    ): Future[DescribeReplicationInstancesResponse] = service.describeReplicationInstances(params).promise.toFuture
    def describeReplicationSubnetGroupsFuture(
        params: DescribeReplicationSubnetGroupsMessage
    ): Future[DescribeReplicationSubnetGroupsResponse] =
      service.describeReplicationSubnetGroups(params).promise.toFuture
    def describeReplicationTaskAssessmentResultsFuture(
        params: DescribeReplicationTaskAssessmentResultsMessage
    ): Future[DescribeReplicationTaskAssessmentResultsResponse] =
      service.describeReplicationTaskAssessmentResults(params).promise.toFuture
    def describeReplicationTasksFuture(
        params: DescribeReplicationTasksMessage
    ): Future[DescribeReplicationTasksResponse] = service.describeReplicationTasks(params).promise.toFuture
    def describeSchemasFuture(params: DescribeSchemasMessage): Future[DescribeSchemasResponse] =
      service.describeSchemas(params).promise.toFuture
    def describeTableStatisticsFuture(params: DescribeTableStatisticsMessage): Future[DescribeTableStatisticsResponse] =
      service.describeTableStatistics(params).promise.toFuture
    def importCertificateFuture(params: ImportCertificateMessage): Future[ImportCertificateResponse] =
      service.importCertificate(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceMessage): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def modifyEndpointFuture(params: ModifyEndpointMessage): Future[ModifyEndpointResponse] =
      service.modifyEndpoint(params).promise.toFuture
    def modifyEventSubscriptionFuture(params: ModifyEventSubscriptionMessage): Future[ModifyEventSubscriptionResponse] =
      service.modifyEventSubscription(params).promise.toFuture
    def modifyReplicationInstanceFuture(
        params: ModifyReplicationInstanceMessage
    ): Future[ModifyReplicationInstanceResponse] = service.modifyReplicationInstance(params).promise.toFuture
    def modifyReplicationSubnetGroupFuture(
        params: ModifyReplicationSubnetGroupMessage
    ): Future[ModifyReplicationSubnetGroupResponse] = service.modifyReplicationSubnetGroup(params).promise.toFuture
    def modifyReplicationTaskFuture(params: ModifyReplicationTaskMessage): Future[ModifyReplicationTaskResponse] =
      service.modifyReplicationTask(params).promise.toFuture
    def rebootReplicationInstanceFuture(
        params: RebootReplicationInstanceMessage
    ): Future[RebootReplicationInstanceResponse] = service.rebootReplicationInstance(params).promise.toFuture
    def refreshSchemasFuture(params: RefreshSchemasMessage): Future[RefreshSchemasResponse] =
      service.refreshSchemas(params).promise.toFuture
    def reloadTablesFuture(params: ReloadTablesMessage): Future[ReloadTablesResponse] =
      service.reloadTables(params).promise.toFuture
    def removeTagsFromResourceFuture(params: RemoveTagsFromResourceMessage): Future[RemoveTagsFromResourceResponse] =
      service.removeTagsFromResource(params).promise.toFuture
    def startReplicationTaskAssessmentFuture(
        params: StartReplicationTaskAssessmentMessage
    ): Future[StartReplicationTaskAssessmentResponse] = service.startReplicationTaskAssessment(params).promise.toFuture
    def startReplicationTaskFuture(params: StartReplicationTaskMessage): Future[StartReplicationTaskResponse] =
      service.startReplicationTask(params).promise.toFuture
    def stopReplicationTaskFuture(params: StopReplicationTaskMessage): Future[StopReplicationTaskResponse] =
      service.stopReplicationTask(params).promise.toFuture
    def testConnectionFuture(params: TestConnectionMessage): Future[TestConnectionResponse] =
      service.testConnection(params).promise.toFuture
  }
}

package dms {
  @js.native
  @JSImport("aws-sdk", "DMS")
  class DMS() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTagsToResource(params: AddTagsToResourceMessage): Request[AddTagsToResourceResponse] = js.native
    def applyPendingMaintenanceAction(
        params: ApplyPendingMaintenanceActionMessage
    ): Request[ApplyPendingMaintenanceActionResponse]                                  = js.native
    def createEndpoint(params: CreateEndpointMessage): Request[CreateEndpointResponse] = js.native
    def createEventSubscription(params: CreateEventSubscriptionMessage): Request[CreateEventSubscriptionResponse] =
      js.native
    def createReplicationInstance(
        params: CreateReplicationInstanceMessage
    ): Request[CreateReplicationInstanceResponse] = js.native
    def createReplicationSubnetGroup(
        params: CreateReplicationSubnetGroupMessage
    ): Request[CreateReplicationSubnetGroupResponse]                                                        = js.native
    def createReplicationTask(params: CreateReplicationTaskMessage): Request[CreateReplicationTaskResponse] = js.native
    def deleteCertificate(params: DeleteCertificateMessage): Request[DeleteCertificateResponse]             = js.native
    def deleteEndpoint(params: DeleteEndpointMessage): Request[DeleteEndpointResponse]                      = js.native
    def deleteEventSubscription(params: DeleteEventSubscriptionMessage): Request[DeleteEventSubscriptionResponse] =
      js.native
    def deleteReplicationInstance(
        params: DeleteReplicationInstanceMessage
    ): Request[DeleteReplicationInstanceResponse] = js.native
    def deleteReplicationSubnetGroup(
        params: DeleteReplicationSubnetGroupMessage
    ): Request[DeleteReplicationSubnetGroupResponse]                                                        = js.native
    def deleteReplicationTask(params: DeleteReplicationTaskMessage): Request[DeleteReplicationTaskResponse] = js.native
    def describeAccountAttributes(
        params: DescribeAccountAttributesMessage
    ): Request[DescribeAccountAttributesResponse]                                                           = js.native
    def describeCertificates(params: DescribeCertificatesMessage): Request[DescribeCertificatesResponse]    = js.native
    def describeConnections(params: DescribeConnectionsMessage): Request[DescribeConnectionsResponse]       = js.native
    def describeEndpointTypes(params: DescribeEndpointTypesMessage): Request[DescribeEndpointTypesResponse] = js.native
    def describeEndpoints(params: DescribeEndpointsMessage): Request[DescribeEndpointsResponse]             = js.native
    def describeEventCategories(params: DescribeEventCategoriesMessage): Request[DescribeEventCategoriesResponse] =
      js.native
    def describeEventSubscriptions(
        params: DescribeEventSubscriptionsMessage
    ): Request[DescribeEventSubscriptionsResponse]                                     = js.native
    def describeEvents(params: DescribeEventsMessage): Request[DescribeEventsResponse] = js.native
    def describeOrderableReplicationInstances(
        params: DescribeOrderableReplicationInstancesMessage
    ): Request[DescribeOrderableReplicationInstancesResponse] = js.native
    def describePendingMaintenanceActions(
        params: DescribePendingMaintenanceActionsMessage
    ): Request[DescribePendingMaintenanceActionsResponse] = js.native
    def describeRefreshSchemasStatus(
        params: DescribeRefreshSchemasStatusMessage
    ): Request[DescribeRefreshSchemasStatusResponse] = js.native
    def describeReplicationInstanceTaskLogs(
        params: DescribeReplicationInstanceTaskLogsMessage
    ): Request[DescribeReplicationInstanceTaskLogsResponse] = js.native
    def describeReplicationInstances(
        params: DescribeReplicationInstancesMessage
    ): Request[DescribeReplicationInstancesResponse] = js.native
    def describeReplicationSubnetGroups(
        params: DescribeReplicationSubnetGroupsMessage
    ): Request[DescribeReplicationSubnetGroupsResponse] = js.native
    def describeReplicationTaskAssessmentResults(
        params: DescribeReplicationTaskAssessmentResultsMessage
    ): Request[DescribeReplicationTaskAssessmentResultsResponse] = js.native
    def describeReplicationTasks(params: DescribeReplicationTasksMessage): Request[DescribeReplicationTasksResponse] =
      js.native
    def describeSchemas(params: DescribeSchemasMessage): Request[DescribeSchemasResponse] = js.native
    def describeTableStatistics(params: DescribeTableStatisticsMessage): Request[DescribeTableStatisticsResponse] =
      js.native
    def importCertificate(params: ImportCertificateMessage): Request[ImportCertificateResponse]       = js.native
    def listTagsForResource(params: ListTagsForResourceMessage): Request[ListTagsForResourceResponse] = js.native
    def modifyEndpoint(params: ModifyEndpointMessage): Request[ModifyEndpointResponse]                = js.native
    def modifyEventSubscription(params: ModifyEventSubscriptionMessage): Request[ModifyEventSubscriptionResponse] =
      js.native
    def modifyReplicationInstance(
        params: ModifyReplicationInstanceMessage
    ): Request[ModifyReplicationInstanceResponse] = js.native
    def modifyReplicationSubnetGroup(
        params: ModifyReplicationSubnetGroupMessage
    ): Request[ModifyReplicationSubnetGroupResponse]                                                        = js.native
    def modifyReplicationTask(params: ModifyReplicationTaskMessage): Request[ModifyReplicationTaskResponse] = js.native
    def rebootReplicationInstance(
        params: RebootReplicationInstanceMessage
    ): Request[RebootReplicationInstanceResponse]                                      = js.native
    def refreshSchemas(params: RefreshSchemasMessage): Request[RefreshSchemasResponse] = js.native
    def reloadTables(params: ReloadTablesMessage): Request[ReloadTablesResponse]       = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceMessage): Request[RemoveTagsFromResourceResponse] =
      js.native
    def startReplicationTask(params: StartReplicationTaskMessage): Request[StartReplicationTaskResponse] = js.native
    def startReplicationTaskAssessment(
        params: StartReplicationTaskAssessmentMessage
    ): Request[StartReplicationTaskAssessmentResponse]                                                = js.native
    def stopReplicationTask(params: StopReplicationTaskMessage): Request[StopReplicationTaskResponse] = js.native
    def testConnection(params: TestConnectionMessage): Request[TestConnectionResponse]                = js.native
  }

  /**
    * Describes a quota for an AWS account, for example, the number of replication instances allowed.
    */
  @js.native
  trait AccountQuota extends js.Object {
    var AccountQuotaName: js.UndefOr[String]
    var Max: js.UndefOr[Double]
    var Used: js.UndefOr[Double]
  }

  object AccountQuota {
    def apply(
        AccountQuotaName: js.UndefOr[String] = js.undefined,
        Max: js.UndefOr[Double] = js.undefined,
        Used: js.UndefOr[Double] = js.undefined
    ): AccountQuota = {
      val __obj = js.Dictionary.empty[js.Any]
      AccountQuotaName.foreach(__v => __obj.update("AccountQuotaName", __v.asInstanceOf[js.Any]))
      Max.foreach(__v => __obj.update("Max", __v.asInstanceOf[js.Any]))
      Used.foreach(__v => __obj.update("Used", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountQuota]
    }
  }

  /**
    * Associates a set of tags with an AWS DMS resource.
    */
  @js.native
  trait AddTagsToResourceMessage extends js.Object {
    var ResourceArn: String
    var Tags: TagList
  }

  object AddTagsToResourceMessage {
    def apply(
        ResourceArn: String,
        Tags: TagList
    ): AddTagsToResourceMessage = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddTagsToResourceMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait AddTagsToResourceResponse extends js.Object {}

  object AddTagsToResourceResponse {
    def apply(
        ): AddTagsToResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[AddTagsToResourceResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ApplyPendingMaintenanceActionMessage extends js.Object {
    var ApplyAction: String
    var OptInType: String
    var ReplicationInstanceArn: String
  }

  object ApplyPendingMaintenanceActionMessage {
    def apply(
        ApplyAction: String,
        OptInType: String,
        ReplicationInstanceArn: String
    ): ApplyPendingMaintenanceActionMessage = {
      val __obj = js.Dictionary[js.Any](
        "ApplyAction"            -> ApplyAction.asInstanceOf[js.Any],
        "OptInType"              -> OptInType.asInstanceOf[js.Any],
        "ReplicationInstanceArn" -> ReplicationInstanceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ApplyPendingMaintenanceActionMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ApplyPendingMaintenanceActionResponse extends js.Object {
    var ResourcePendingMaintenanceActions: js.UndefOr[ResourcePendingMaintenanceActions]
  }

  object ApplyPendingMaintenanceActionResponse {
    def apply(
        ResourcePendingMaintenanceActions: js.UndefOr[ResourcePendingMaintenanceActions] = js.undefined
    ): ApplyPendingMaintenanceActionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ResourcePendingMaintenanceActions.foreach(
        __v => __obj.update("ResourcePendingMaintenanceActions", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ApplyPendingMaintenanceActionResponse]
    }
  }

  object AuthMechanismValueEnum {
    val default     = "default"
    val mongodb_cr  = "mongodb_cr"
    val scram_sha_1 = "scram_sha_1"

    val values = js.Object.freeze(js.Array(default, mongodb_cr, scram_sha_1))
  }

  object AuthTypeValueEnum {
    val no       = "no"
    val password = "password"

    val values = js.Object.freeze(js.Array(no, password))
  }

  /**
    * <p/>
    */
  @js.native
  trait AvailabilityZone extends js.Object {
    var Name: js.UndefOr[String]
  }

  object AvailabilityZone {
    def apply(
        Name: js.UndefOr[String] = js.undefined
    ): AvailabilityZone = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvailabilityZone]
    }
  }

  /**
    * The SSL certificate that can be used to encrypt connections between the endpoints and the replication instance.
    */
  @js.native
  trait Certificate extends js.Object {
    var CertificateArn: js.UndefOr[String]
    var CertificateCreationDate: js.UndefOr[TStamp]
    var CertificateIdentifier: js.UndefOr[String]
    var CertificateOwner: js.UndefOr[String]
    var CertificatePem: js.UndefOr[String]
    var CertificateWallet: js.UndefOr[CertificateWallet]
    var KeyLength: js.UndefOr[IntegerOptional]
    var SigningAlgorithm: js.UndefOr[String]
    var ValidFromDate: js.UndefOr[TStamp]
    var ValidToDate: js.UndefOr[TStamp]
  }

  object Certificate {
    def apply(
        CertificateArn: js.UndefOr[String] = js.undefined,
        CertificateCreationDate: js.UndefOr[TStamp] = js.undefined,
        CertificateIdentifier: js.UndefOr[String] = js.undefined,
        CertificateOwner: js.UndefOr[String] = js.undefined,
        CertificatePem: js.UndefOr[String] = js.undefined,
        CertificateWallet: js.UndefOr[CertificateWallet] = js.undefined,
        KeyLength: js.UndefOr[IntegerOptional] = js.undefined,
        SigningAlgorithm: js.UndefOr[String] = js.undefined,
        ValidFromDate: js.UndefOr[TStamp] = js.undefined,
        ValidToDate: js.UndefOr[TStamp] = js.undefined
    ): Certificate = {
      val __obj = js.Dictionary.empty[js.Any]
      CertificateArn.foreach(__v => __obj.update("CertificateArn", __v.asInstanceOf[js.Any]))
      CertificateCreationDate.foreach(__v => __obj.update("CertificateCreationDate", __v.asInstanceOf[js.Any]))
      CertificateIdentifier.foreach(__v => __obj.update("CertificateIdentifier", __v.asInstanceOf[js.Any]))
      CertificateOwner.foreach(__v => __obj.update("CertificateOwner", __v.asInstanceOf[js.Any]))
      CertificatePem.foreach(__v => __obj.update("CertificatePem", __v.asInstanceOf[js.Any]))
      CertificateWallet.foreach(__v => __obj.update("CertificateWallet", __v.asInstanceOf[js.Any]))
      KeyLength.foreach(__v => __obj.update("KeyLength", __v.asInstanceOf[js.Any]))
      SigningAlgorithm.foreach(__v => __obj.update("SigningAlgorithm", __v.asInstanceOf[js.Any]))
      ValidFromDate.foreach(__v => __obj.update("ValidFromDate", __v.asInstanceOf[js.Any]))
      ValidToDate.foreach(__v => __obj.update("ValidToDate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Certificate]
    }
  }

  object CompressionTypeValueEnum {
    val none = "none"
    val gzip = "gzip"

    val values = js.Object.freeze(js.Array(none, gzip))
  }

  /**
    * <p/>
    */
  @js.native
  trait Connection extends js.Object {
    var EndpointArn: js.UndefOr[String]
    var EndpointIdentifier: js.UndefOr[String]
    var LastFailureMessage: js.UndefOr[String]
    var ReplicationInstanceArn: js.UndefOr[String]
    var ReplicationInstanceIdentifier: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object Connection {
    def apply(
        EndpointArn: js.UndefOr[String] = js.undefined,
        EndpointIdentifier: js.UndefOr[String] = js.undefined,
        LastFailureMessage: js.UndefOr[String] = js.undefined,
        ReplicationInstanceArn: js.UndefOr[String] = js.undefined,
        ReplicationInstanceIdentifier: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): Connection = {
      val __obj = js.Dictionary.empty[js.Any]
      EndpointArn.foreach(__v => __obj.update("EndpointArn", __v.asInstanceOf[js.Any]))
      EndpointIdentifier.foreach(__v => __obj.update("EndpointIdentifier", __v.asInstanceOf[js.Any]))
      LastFailureMessage.foreach(__v => __obj.update("LastFailureMessage", __v.asInstanceOf[js.Any]))
      ReplicationInstanceArn.foreach(__v => __obj.update("ReplicationInstanceArn", __v.asInstanceOf[js.Any]))
      ReplicationInstanceIdentifier.foreach(
        __v => __obj.update("ReplicationInstanceIdentifier", __v.asInstanceOf[js.Any])
      )
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Connection]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateEndpointMessage extends js.Object {
    var EndpointIdentifier: String
    var EndpointType: ReplicationEndpointTypeValue
    var EngineName: String
    var CertificateArn: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DmsTransferSettings: js.UndefOr[DmsTransferSettings]
    var DynamoDbSettings: js.UndefOr[DynamoDbSettings]
    var ElasticsearchSettings: js.UndefOr[ElasticsearchSettings]
    var ExternalTableDefinition: js.UndefOr[String]
    var ExtraConnectionAttributes: js.UndefOr[String]
    var KinesisSettings: js.UndefOr[KinesisSettings]
    var KmsKeyId: js.UndefOr[String]
    var MongoDbSettings: js.UndefOr[MongoDbSettings]
    var Password: js.UndefOr[SecretString]
    var Port: js.UndefOr[IntegerOptional]
    var RedshiftSettings: js.UndefOr[RedshiftSettings]
    var S3Settings: js.UndefOr[S3Settings]
    var ServerName: js.UndefOr[String]
    var ServiceAccessRoleArn: js.UndefOr[String]
    var SslMode: js.UndefOr[DmsSslModeValue]
    var Tags: js.UndefOr[TagList]
    var Username: js.UndefOr[String]
  }

  object CreateEndpointMessage {
    def apply(
        EndpointIdentifier: String,
        EndpointType: ReplicationEndpointTypeValue,
        EngineName: String,
        CertificateArn: js.UndefOr[String] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        DmsTransferSettings: js.UndefOr[DmsTransferSettings] = js.undefined,
        DynamoDbSettings: js.UndefOr[DynamoDbSettings] = js.undefined,
        ElasticsearchSettings: js.UndefOr[ElasticsearchSettings] = js.undefined,
        ExternalTableDefinition: js.UndefOr[String] = js.undefined,
        ExtraConnectionAttributes: js.UndefOr[String] = js.undefined,
        KinesisSettings: js.UndefOr[KinesisSettings] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        MongoDbSettings: js.UndefOr[MongoDbSettings] = js.undefined,
        Password: js.UndefOr[SecretString] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        RedshiftSettings: js.UndefOr[RedshiftSettings] = js.undefined,
        S3Settings: js.UndefOr[S3Settings] = js.undefined,
        ServerName: js.UndefOr[String] = js.undefined,
        ServiceAccessRoleArn: js.UndefOr[String] = js.undefined,
        SslMode: js.UndefOr[DmsSslModeValue] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Username: js.UndefOr[String] = js.undefined
    ): CreateEndpointMessage = {
      val __obj = js.Dictionary[js.Any](
        "EndpointIdentifier" -> EndpointIdentifier.asInstanceOf[js.Any],
        "EndpointType"       -> EndpointType.asInstanceOf[js.Any],
        "EngineName"         -> EngineName.asInstanceOf[js.Any]
      )

      CertificateArn.foreach(__v => __obj.update("CertificateArn", __v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.update("DatabaseName", __v.asInstanceOf[js.Any]))
      DmsTransferSettings.foreach(__v => __obj.update("DmsTransferSettings", __v.asInstanceOf[js.Any]))
      DynamoDbSettings.foreach(__v => __obj.update("DynamoDbSettings", __v.asInstanceOf[js.Any]))
      ElasticsearchSettings.foreach(__v => __obj.update("ElasticsearchSettings", __v.asInstanceOf[js.Any]))
      ExternalTableDefinition.foreach(__v => __obj.update("ExternalTableDefinition", __v.asInstanceOf[js.Any]))
      ExtraConnectionAttributes.foreach(__v => __obj.update("ExtraConnectionAttributes", __v.asInstanceOf[js.Any]))
      KinesisSettings.foreach(__v => __obj.update("KinesisSettings", __v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.update("KmsKeyId", __v.asInstanceOf[js.Any]))
      MongoDbSettings.foreach(__v => __obj.update("MongoDbSettings", __v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.update("Password", __v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.update("Port", __v.asInstanceOf[js.Any]))
      RedshiftSettings.foreach(__v => __obj.update("RedshiftSettings", __v.asInstanceOf[js.Any]))
      S3Settings.foreach(__v => __obj.update("S3Settings", __v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.update("ServerName", __v.asInstanceOf[js.Any]))
      ServiceAccessRoleArn.foreach(__v => __obj.update("ServiceAccessRoleArn", __v.asInstanceOf[js.Any]))
      SslMode.foreach(__v => __obj.update("SslMode", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.update("Username", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEndpointMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateEndpointResponse extends js.Object {
    var Endpoint: js.UndefOr[Endpoint]
  }

  object CreateEndpointResponse {
    def apply(
        Endpoint: js.UndefOr[Endpoint] = js.undefined
    ): CreateEndpointResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Endpoint.foreach(__v => __obj.update("Endpoint", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEndpointResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateEventSubscriptionMessage extends js.Object {
    var SnsTopicArn: String
    var SubscriptionName: String
    var Enabled: js.UndefOr[BooleanOptional]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SourceIds: js.UndefOr[SourceIdsList]
    var SourceType: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateEventSubscriptionMessage {
    def apply(
        SnsTopicArn: String,
        SubscriptionName: String,
        Enabled: js.UndefOr[BooleanOptional] = js.undefined,
        EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
        SourceIds: js.UndefOr[SourceIdsList] = js.undefined,
        SourceType: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateEventSubscriptionMessage = {
      val __obj = js.Dictionary[js.Any](
        "SnsTopicArn"      -> SnsTopicArn.asInstanceOf[js.Any],
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any]
      )

      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      EventCategories.foreach(__v => __obj.update("EventCategories", __v.asInstanceOf[js.Any]))
      SourceIds.foreach(__v => __obj.update("SourceIds", __v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.update("SourceType", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEventSubscriptionMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateEventSubscriptionResponse extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object CreateEventSubscriptionResponse {
    def apply(
        EventSubscription: js.UndefOr[EventSubscription] = js.undefined
    ): CreateEventSubscriptionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EventSubscription.foreach(__v => __obj.update("EventSubscription", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEventSubscriptionResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateReplicationInstanceMessage extends js.Object {
    var ReplicationInstanceClass: String
    var ReplicationInstanceIdentifier: String
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var AvailabilityZone: js.UndefOr[String]
    var DnsNameServers: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var ReplicationSubnetGroupIdentifier: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  object CreateReplicationInstanceMessage {
    def apply(
        ReplicationInstanceClass: String,
        ReplicationInstanceIdentifier: String,
        AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
        AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        DnsNameServers: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
        ReplicationSubnetGroupIdentifier: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): CreateReplicationInstanceMessage = {
      val __obj = js.Dictionary[js.Any](
        "ReplicationInstanceClass"      -> ReplicationInstanceClass.asInstanceOf[js.Any],
        "ReplicationInstanceIdentifier" -> ReplicationInstanceIdentifier.asInstanceOf[js.Any]
      )

      AllocatedStorage.foreach(__v => __obj.update("AllocatedStorage", __v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.update("AutoMinorVersionUpgrade", __v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.update("AvailabilityZone", __v.asInstanceOf[js.Any]))
      DnsNameServers.foreach(__v => __obj.update("DnsNameServers", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.update("KmsKeyId", __v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.update("MultiAZ", __v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.update("PreferredMaintenanceWindow", __v.asInstanceOf[js.Any]))
      PubliclyAccessible.foreach(__v => __obj.update("PubliclyAccessible", __v.asInstanceOf[js.Any]))
      ReplicationSubnetGroupIdentifier.foreach(
        __v => __obj.update("ReplicationSubnetGroupIdentifier", __v.asInstanceOf[js.Any])
      )
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      VpcSecurityGroupIds.foreach(__v => __obj.update("VpcSecurityGroupIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReplicationInstanceMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateReplicationInstanceResponse extends js.Object {
    var ReplicationInstance: js.UndefOr[ReplicationInstance]
  }

  object CreateReplicationInstanceResponse {
    def apply(
        ReplicationInstance: js.UndefOr[ReplicationInstance] = js.undefined
    ): CreateReplicationInstanceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationInstance.foreach(__v => __obj.update("ReplicationInstance", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReplicationInstanceResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateReplicationSubnetGroupMessage extends js.Object {
    var ReplicationSubnetGroupDescription: String
    var ReplicationSubnetGroupIdentifier: String
    var SubnetIds: SubnetIdentifierList
    var Tags: js.UndefOr[TagList]
  }

  object CreateReplicationSubnetGroupMessage {
    def apply(
        ReplicationSubnetGroupDescription: String,
        ReplicationSubnetGroupIdentifier: String,
        SubnetIds: SubnetIdentifierList,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateReplicationSubnetGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "ReplicationSubnetGroupDescription" -> ReplicationSubnetGroupDescription.asInstanceOf[js.Any],
        "ReplicationSubnetGroupIdentifier"  -> ReplicationSubnetGroupIdentifier.asInstanceOf[js.Any],
        "SubnetIds"                         -> SubnetIds.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReplicationSubnetGroupMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateReplicationSubnetGroupResponse extends js.Object {
    var ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup]
  }

  object CreateReplicationSubnetGroupResponse {
    def apply(
        ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup] = js.undefined
    ): CreateReplicationSubnetGroupResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationSubnetGroup.foreach(__v => __obj.update("ReplicationSubnetGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReplicationSubnetGroupResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateReplicationTaskMessage extends js.Object {
    var MigrationType: MigrationTypeValue
    var ReplicationInstanceArn: String
    var ReplicationTaskIdentifier: String
    var SourceEndpointArn: String
    var TableMappings: String
    var TargetEndpointArn: String
    var CdcStartPosition: js.UndefOr[String]
    var CdcStartTime: js.UndefOr[TStamp]
    var CdcStopPosition: js.UndefOr[String]
    var ReplicationTaskSettings: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateReplicationTaskMessage {
    def apply(
        MigrationType: MigrationTypeValue,
        ReplicationInstanceArn: String,
        ReplicationTaskIdentifier: String,
        SourceEndpointArn: String,
        TableMappings: String,
        TargetEndpointArn: String,
        CdcStartPosition: js.UndefOr[String] = js.undefined,
        CdcStartTime: js.UndefOr[TStamp] = js.undefined,
        CdcStopPosition: js.UndefOr[String] = js.undefined,
        ReplicationTaskSettings: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateReplicationTaskMessage = {
      val __obj = js.Dictionary[js.Any](
        "MigrationType"             -> MigrationType.asInstanceOf[js.Any],
        "ReplicationInstanceArn"    -> ReplicationInstanceArn.asInstanceOf[js.Any],
        "ReplicationTaskIdentifier" -> ReplicationTaskIdentifier.asInstanceOf[js.Any],
        "SourceEndpointArn"         -> SourceEndpointArn.asInstanceOf[js.Any],
        "TableMappings"             -> TableMappings.asInstanceOf[js.Any],
        "TargetEndpointArn"         -> TargetEndpointArn.asInstanceOf[js.Any]
      )

      CdcStartPosition.foreach(__v => __obj.update("CdcStartPosition", __v.asInstanceOf[js.Any]))
      CdcStartTime.foreach(__v => __obj.update("CdcStartTime", __v.asInstanceOf[js.Any]))
      CdcStopPosition.foreach(__v => __obj.update("CdcStopPosition", __v.asInstanceOf[js.Any]))
      ReplicationTaskSettings.foreach(__v => __obj.update("ReplicationTaskSettings", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReplicationTaskMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateReplicationTaskResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  object CreateReplicationTaskResponse {
    def apply(
        ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
    ): CreateReplicationTaskResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationTask.foreach(__v => __obj.update("ReplicationTask", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReplicationTaskResponse]
    }
  }

  object DataFormatValueEnum {
    val csv     = "csv"
    val parquet = "parquet"

    val values = js.Object.freeze(js.Array(csv, parquet))
  }

  @js.native
  trait DeleteCertificateMessage extends js.Object {
    var CertificateArn: String
  }

  object DeleteCertificateMessage {
    def apply(
        CertificateArn: String
    ): DeleteCertificateMessage = {
      val __obj = js.Dictionary[js.Any](
        "CertificateArn" -> CertificateArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteCertificateMessage]
    }
  }

  @js.native
  trait DeleteCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[Certificate]
  }

  object DeleteCertificateResponse {
    def apply(
        Certificate: js.UndefOr[Certificate] = js.undefined
    ): DeleteCertificateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Certificate.foreach(__v => __obj.update("Certificate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCertificateResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteEndpointMessage extends js.Object {
    var EndpointArn: String
  }

  object DeleteEndpointMessage {
    def apply(
        EndpointArn: String
    ): DeleteEndpointMessage = {
      val __obj = js.Dictionary[js.Any](
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEndpointMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteEndpointResponse extends js.Object {
    var Endpoint: js.UndefOr[Endpoint]
  }

  object DeleteEndpointResponse {
    def apply(
        Endpoint: js.UndefOr[Endpoint] = js.undefined
    ): DeleteEndpointResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Endpoint.foreach(__v => __obj.update("Endpoint", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteEndpointResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteEventSubscriptionMessage extends js.Object {
    var SubscriptionName: String
  }

  object DeleteEventSubscriptionMessage {
    def apply(
        SubscriptionName: String
    ): DeleteEventSubscriptionMessage = {
      val __obj = js.Dictionary[js.Any](
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEventSubscriptionMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteEventSubscriptionResponse extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object DeleteEventSubscriptionResponse {
    def apply(
        EventSubscription: js.UndefOr[EventSubscription] = js.undefined
    ): DeleteEventSubscriptionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EventSubscription.foreach(__v => __obj.update("EventSubscription", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteEventSubscriptionResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteReplicationInstanceMessage extends js.Object {
    var ReplicationInstanceArn: String
  }

  object DeleteReplicationInstanceMessage {
    def apply(
        ReplicationInstanceArn: String
    ): DeleteReplicationInstanceMessage = {
      val __obj = js.Dictionary[js.Any](
        "ReplicationInstanceArn" -> ReplicationInstanceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteReplicationInstanceMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteReplicationInstanceResponse extends js.Object {
    var ReplicationInstance: js.UndefOr[ReplicationInstance]
  }

  object DeleteReplicationInstanceResponse {
    def apply(
        ReplicationInstance: js.UndefOr[ReplicationInstance] = js.undefined
    ): DeleteReplicationInstanceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationInstance.foreach(__v => __obj.update("ReplicationInstance", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteReplicationInstanceResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteReplicationSubnetGroupMessage extends js.Object {
    var ReplicationSubnetGroupIdentifier: String
  }

  object DeleteReplicationSubnetGroupMessage {
    def apply(
        ReplicationSubnetGroupIdentifier: String
    ): DeleteReplicationSubnetGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "ReplicationSubnetGroupIdentifier" -> ReplicationSubnetGroupIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteReplicationSubnetGroupMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteReplicationSubnetGroupResponse extends js.Object {}

  object DeleteReplicationSubnetGroupResponse {
    def apply(
        ): DeleteReplicationSubnetGroupResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteReplicationSubnetGroupResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteReplicationTaskMessage extends js.Object {
    var ReplicationTaskArn: String
  }

  object DeleteReplicationTaskMessage {
    def apply(
        ReplicationTaskArn: String
    ): DeleteReplicationTaskMessage = {
      val __obj = js.Dictionary[js.Any](
        "ReplicationTaskArn" -> ReplicationTaskArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteReplicationTaskMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteReplicationTaskResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  object DeleteReplicationTaskResponse {
    def apply(
        ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
    ): DeleteReplicationTaskResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationTask.foreach(__v => __obj.update("ReplicationTask", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteReplicationTaskResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeAccountAttributesMessage extends js.Object {}

  object DescribeAccountAttributesMessage {
    def apply(
        ): DescribeAccountAttributesMessage = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DescribeAccountAttributesMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeAccountAttributesResponse extends js.Object {
    var AccountQuotas: js.UndefOr[AccountQuotaList]
    var UniqueAccountIdentifier: js.UndefOr[String]
  }

  object DescribeAccountAttributesResponse {
    def apply(
        AccountQuotas: js.UndefOr[AccountQuotaList] = js.undefined,
        UniqueAccountIdentifier: js.UndefOr[String] = js.undefined
    ): DescribeAccountAttributesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AccountQuotas.foreach(__v => __obj.update("AccountQuotas", __v.asInstanceOf[js.Any]))
      UniqueAccountIdentifier.foreach(__v => __obj.update("UniqueAccountIdentifier", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountAttributesResponse]
    }
  }

  @js.native
  trait DescribeCertificatesMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeCertificatesMessage {
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeCertificatesMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCertificatesMessage]
    }
  }

  @js.native
  trait DescribeCertificatesResponse extends js.Object {
    var Certificates: js.UndefOr[CertificateList]
    var Marker: js.UndefOr[String]
  }

  object DescribeCertificatesResponse {
    def apply(
        Certificates: js.UndefOr[CertificateList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DescribeCertificatesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Certificates.foreach(__v => __obj.update("Certificates", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCertificatesResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeConnectionsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeConnectionsMessage {
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeConnectionsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConnectionsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeConnectionsResponse extends js.Object {
    var Connections: js.UndefOr[ConnectionList]
    var Marker: js.UndefOr[String]
  }

  object DescribeConnectionsResponse {
    def apply(
        Connections: js.UndefOr[ConnectionList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DescribeConnectionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Connections.foreach(__v => __obj.update("Connections", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConnectionsResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeEndpointTypesMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeEndpointTypesMessage {
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeEndpointTypesMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndpointTypesMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeEndpointTypesResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var SupportedEndpointTypes: js.UndefOr[SupportedEndpointTypeList]
  }

  object DescribeEndpointTypesResponse {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        SupportedEndpointTypes: js.UndefOr[SupportedEndpointTypeList] = js.undefined
    ): DescribeEndpointTypesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      SupportedEndpointTypes.foreach(__v => __obj.update("SupportedEndpointTypes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndpointTypesResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeEndpointsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeEndpointsMessage {
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeEndpointsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndpointsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeEndpointsResponse extends js.Object {
    var Endpoints: js.UndefOr[EndpointList]
    var Marker: js.UndefOr[String]
  }

  object DescribeEndpointsResponse {
    def apply(
        Endpoints: js.UndefOr[EndpointList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DescribeEndpointsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Endpoints.foreach(__v => __obj.update("Endpoints", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndpointsResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeEventCategoriesMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var SourceType: js.UndefOr[String]
  }

  object DescribeEventCategoriesMessage {
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        SourceType: js.UndefOr[String] = js.undefined
    ): DescribeEventCategoriesMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.update("SourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventCategoriesMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeEventCategoriesResponse extends js.Object {
    var EventCategoryGroupList: js.UndefOr[EventCategoryGroupList]
  }

  object DescribeEventCategoriesResponse {
    def apply(
        EventCategoryGroupList: js.UndefOr[EventCategoryGroupList] = js.undefined
    ): DescribeEventCategoriesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EventCategoryGroupList.foreach(__v => __obj.update("EventCategoryGroupList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventCategoriesResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeEventSubscriptionsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var SubscriptionName: js.UndefOr[String]
  }

  object DescribeEventSubscriptionsMessage {
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        SubscriptionName: js.UndefOr[String] = js.undefined
    ): DescribeEventSubscriptionsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      SubscriptionName.foreach(__v => __obj.update("SubscriptionName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventSubscriptionsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeEventSubscriptionsResponse extends js.Object {
    var EventSubscriptionsList: js.UndefOr[EventSubscriptionsList]
    var Marker: js.UndefOr[String]
  }

  object DescribeEventSubscriptionsResponse {
    def apply(
        EventSubscriptionsList: js.UndefOr[EventSubscriptionsList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DescribeEventSubscriptionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EventSubscriptionsList.foreach(__v => __obj.update("EventSubscriptionsList", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventSubscriptionsResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeEventsMessage extends js.Object {
    var Duration: js.UndefOr[IntegerOptional]
    var EndTime: js.UndefOr[TStamp]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var SourceIdentifier: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
    var StartTime: js.UndefOr[TStamp]
  }

  object DescribeEventsMessage {
    def apply(
        Duration: js.UndefOr[IntegerOptional] = js.undefined,
        EndTime: js.UndefOr[TStamp] = js.undefined,
        EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        SourceIdentifier: js.UndefOr[String] = js.undefined,
        SourceType: js.UndefOr[SourceType] = js.undefined,
        StartTime: js.UndefOr[TStamp] = js.undefined
    ): DescribeEventsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Duration.foreach(__v => __obj.update("Duration", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      EventCategories.foreach(__v => __obj.update("EventCategories", __v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      SourceIdentifier.foreach(__v => __obj.update("SourceIdentifier", __v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.update("SourceType", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeEventsResponse extends js.Object {
    var Events: js.UndefOr[EventList]
    var Marker: js.UndefOr[String]
  }

  object DescribeEventsResponse {
    def apply(
        Events: js.UndefOr[EventList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DescribeEventsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Events.foreach(__v => __obj.update("Events", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventsResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeOrderableReplicationInstancesMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeOrderableReplicationInstancesMessage {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeOrderableReplicationInstancesMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOrderableReplicationInstancesMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeOrderableReplicationInstancesResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var OrderableReplicationInstances: js.UndefOr[OrderableReplicationInstanceList]
  }

  object DescribeOrderableReplicationInstancesResponse {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        OrderableReplicationInstances: js.UndefOr[OrderableReplicationInstanceList] = js.undefined
    ): DescribeOrderableReplicationInstancesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      OrderableReplicationInstances.foreach(
        __v => __obj.update("OrderableReplicationInstances", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeOrderableReplicationInstancesResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribePendingMaintenanceActionsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ReplicationInstanceArn: js.UndefOr[String]
  }

  object DescribePendingMaintenanceActionsMessage {
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        ReplicationInstanceArn: js.UndefOr[String] = js.undefined
    ): DescribePendingMaintenanceActionsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      ReplicationInstanceArn.foreach(__v => __obj.update("ReplicationInstanceArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePendingMaintenanceActionsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribePendingMaintenanceActionsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var PendingMaintenanceActions: js.UndefOr[PendingMaintenanceActions]
  }

  object DescribePendingMaintenanceActionsResponse {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        PendingMaintenanceActions: js.UndefOr[PendingMaintenanceActions] = js.undefined
    ): DescribePendingMaintenanceActionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      PendingMaintenanceActions.foreach(__v => __obj.update("PendingMaintenanceActions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePendingMaintenanceActionsResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeRefreshSchemasStatusMessage extends js.Object {
    var EndpointArn: String
  }

  object DescribeRefreshSchemasStatusMessage {
    def apply(
        EndpointArn: String
    ): DescribeRefreshSchemasStatusMessage = {
      val __obj = js.Dictionary[js.Any](
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeRefreshSchemasStatusMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeRefreshSchemasStatusResponse extends js.Object {
    var RefreshSchemasStatus: js.UndefOr[RefreshSchemasStatus]
  }

  object DescribeRefreshSchemasStatusResponse {
    def apply(
        RefreshSchemasStatus: js.UndefOr[RefreshSchemasStatus] = js.undefined
    ): DescribeRefreshSchemasStatusResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      RefreshSchemasStatus.foreach(__v => __obj.update("RefreshSchemasStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRefreshSchemasStatusResponse]
    }
  }

  @js.native
  trait DescribeReplicationInstanceTaskLogsMessage extends js.Object {
    var ReplicationInstanceArn: String
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeReplicationInstanceTaskLogsMessage {
    def apply(
        ReplicationInstanceArn: String,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeReplicationInstanceTaskLogsMessage = {
      val __obj = js.Dictionary[js.Any](
        "ReplicationInstanceArn" -> ReplicationInstanceArn.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationInstanceTaskLogsMessage]
    }
  }

  @js.native
  trait DescribeReplicationInstanceTaskLogsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationInstanceArn: js.UndefOr[String]
    var ReplicationInstanceTaskLogs: js.UndefOr[ReplicationInstanceTaskLogsList]
  }

  object DescribeReplicationInstanceTaskLogsResponse {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReplicationInstanceArn: js.UndefOr[String] = js.undefined,
        ReplicationInstanceTaskLogs: js.UndefOr[ReplicationInstanceTaskLogsList] = js.undefined
    ): DescribeReplicationInstanceTaskLogsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      ReplicationInstanceArn.foreach(__v => __obj.update("ReplicationInstanceArn", __v.asInstanceOf[js.Any]))
      ReplicationInstanceTaskLogs.foreach(__v => __obj.update("ReplicationInstanceTaskLogs", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationInstanceTaskLogsResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeReplicationInstancesMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeReplicationInstancesMessage {
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeReplicationInstancesMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationInstancesMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeReplicationInstancesResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationInstances: js.UndefOr[ReplicationInstanceList]
  }

  object DescribeReplicationInstancesResponse {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReplicationInstances: js.UndefOr[ReplicationInstanceList] = js.undefined
    ): DescribeReplicationInstancesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      ReplicationInstances.foreach(__v => __obj.update("ReplicationInstances", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationInstancesResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeReplicationSubnetGroupsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeReplicationSubnetGroupsMessage {
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeReplicationSubnetGroupsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationSubnetGroupsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeReplicationSubnetGroupsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationSubnetGroups: js.UndefOr[ReplicationSubnetGroups]
  }

  object DescribeReplicationSubnetGroupsResponse {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReplicationSubnetGroups: js.UndefOr[ReplicationSubnetGroups] = js.undefined
    ): DescribeReplicationSubnetGroupsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      ReplicationSubnetGroups.foreach(__v => __obj.update("ReplicationSubnetGroups", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationSubnetGroupsResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeReplicationTaskAssessmentResultsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ReplicationTaskArn: js.UndefOr[String]
  }

  object DescribeReplicationTaskAssessmentResultsMessage {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        ReplicationTaskArn: js.UndefOr[String] = js.undefined
    ): DescribeReplicationTaskAssessmentResultsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      ReplicationTaskArn.foreach(__v => __obj.update("ReplicationTaskArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationTaskAssessmentResultsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeReplicationTaskAssessmentResultsResponse extends js.Object {
    var BucketName: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var ReplicationTaskAssessmentResults: js.UndefOr[ReplicationTaskAssessmentResultList]
  }

  object DescribeReplicationTaskAssessmentResultsResponse {
    def apply(
        BucketName: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        ReplicationTaskAssessmentResults: js.UndefOr[ReplicationTaskAssessmentResultList] = js.undefined
    ): DescribeReplicationTaskAssessmentResultsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      BucketName.foreach(__v => __obj.update("BucketName", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      ReplicationTaskAssessmentResults.foreach(
        __v => __obj.update("ReplicationTaskAssessmentResults", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeReplicationTaskAssessmentResultsResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeReplicationTasksMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var WithoutSettings: js.UndefOr[BooleanOptional]
  }

  object DescribeReplicationTasksMessage {
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        WithoutSettings: js.UndefOr[BooleanOptional] = js.undefined
    ): DescribeReplicationTasksMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      WithoutSettings.foreach(__v => __obj.update("WithoutSettings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationTasksMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeReplicationTasksResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationTasks: js.UndefOr[ReplicationTaskList]
  }

  object DescribeReplicationTasksResponse {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReplicationTasks: js.UndefOr[ReplicationTaskList] = js.undefined
    ): DescribeReplicationTasksResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      ReplicationTasks.foreach(__v => __obj.update("ReplicationTasks", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationTasksResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeSchemasMessage extends js.Object {
    var EndpointArn: String
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeSchemasMessage {
    def apply(
        EndpointArn: String,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeSchemasMessage = {
      val __obj = js.Dictionary[js.Any](
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSchemasMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeSchemasResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var Schemas: js.UndefOr[SchemaList]
  }

  object DescribeSchemasResponse {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        Schemas: js.UndefOr[SchemaList] = js.undefined
    ): DescribeSchemasResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      Schemas.foreach(__v => __obj.update("Schemas", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSchemasResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeTableStatisticsMessage extends js.Object {
    var ReplicationTaskArn: String
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeTableStatisticsMessage {
    def apply(
        ReplicationTaskArn: String,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeTableStatisticsMessage = {
      val __obj = js.Dictionary[js.Any](
        "ReplicationTaskArn" -> ReplicationTaskArn.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTableStatisticsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeTableStatisticsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationTaskArn: js.UndefOr[String]
    var TableStatistics: js.UndefOr[TableStatisticsList]
  }

  object DescribeTableStatisticsResponse {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReplicationTaskArn: js.UndefOr[String] = js.undefined,
        TableStatistics: js.UndefOr[TableStatisticsList] = js.undefined
    ): DescribeTableStatisticsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      ReplicationTaskArn.foreach(__v => __obj.update("ReplicationTaskArn", __v.asInstanceOf[js.Any]))
      TableStatistics.foreach(__v => __obj.update("TableStatistics", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTableStatisticsResponse]
    }
  }

  object DmsSslModeValueEnum {
    val none          = "none"
    val require       = "require"
    val `verify-ca`   = "verify-ca"
    val `verify-full` = "verify-full"

    val values = js.Object.freeze(js.Array(none, require, `verify-ca`, `verify-full`))
  }

  /**
    * The settings in JSON format for the DMS Transfer type source endpoint.
    */
  @js.native
  trait DmsTransferSettings extends js.Object {
    var BucketName: js.UndefOr[String]
    var ServiceAccessRoleArn: js.UndefOr[String]
  }

  object DmsTransferSettings {
    def apply(
        BucketName: js.UndefOr[String] = js.undefined,
        ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
    ): DmsTransferSettings = {
      val __obj = js.Dictionary.empty[js.Any]
      BucketName.foreach(__v => __obj.update("BucketName", __v.asInstanceOf[js.Any]))
      ServiceAccessRoleArn.foreach(__v => __obj.update("ServiceAccessRoleArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DmsTransferSettings]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DynamoDbSettings extends js.Object {
    var ServiceAccessRoleArn: String
  }

  object DynamoDbSettings {
    def apply(
        ServiceAccessRoleArn: String
    ): DynamoDbSettings = {
      val __obj = js.Dictionary[js.Any](
        "ServiceAccessRoleArn" -> ServiceAccessRoleArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DynamoDbSettings]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ElasticsearchSettings extends js.Object {
    var EndpointUri: String
    var ServiceAccessRoleArn: String
    var ErrorRetryDuration: js.UndefOr[IntegerOptional]
    var FullLoadErrorPercentage: js.UndefOr[IntegerOptional]
  }

  object ElasticsearchSettings {
    def apply(
        EndpointUri: String,
        ServiceAccessRoleArn: String,
        ErrorRetryDuration: js.UndefOr[IntegerOptional] = js.undefined,
        FullLoadErrorPercentage: js.UndefOr[IntegerOptional] = js.undefined
    ): ElasticsearchSettings = {
      val __obj = js.Dictionary[js.Any](
        "EndpointUri"          -> EndpointUri.asInstanceOf[js.Any],
        "ServiceAccessRoleArn" -> ServiceAccessRoleArn.asInstanceOf[js.Any]
      )

      ErrorRetryDuration.foreach(__v => __obj.update("ErrorRetryDuration", __v.asInstanceOf[js.Any]))
      FullLoadErrorPercentage.foreach(__v => __obj.update("FullLoadErrorPercentage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ElasticsearchSettings]
    }
  }

  object EncodingTypeValueEnum {
    val plain              = "plain"
    val `plain-dictionary` = "plain-dictionary"
    val `rle-dictionary`   = "rle-dictionary"

    val values = js.Object.freeze(js.Array(plain, `plain-dictionary`, `rle-dictionary`))
  }

  object EncryptionModeValueEnum {
    val `sse-s3`  = "sse-s3"
    val `sse-kms` = "sse-kms"

    val values = js.Object.freeze(js.Array(`sse-s3`, `sse-kms`))
  }

  /**
    * <p/>
    */
  @js.native
  trait Endpoint extends js.Object {
    var CertificateArn: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DmsTransferSettings: js.UndefOr[DmsTransferSettings]
    var DynamoDbSettings: js.UndefOr[DynamoDbSettings]
    var ElasticsearchSettings: js.UndefOr[ElasticsearchSettings]
    var EndpointArn: js.UndefOr[String]
    var EndpointIdentifier: js.UndefOr[String]
    var EndpointType: js.UndefOr[ReplicationEndpointTypeValue]
    var EngineDisplayName: js.UndefOr[String]
    var EngineName: js.UndefOr[String]
    var ExternalId: js.UndefOr[String]
    var ExternalTableDefinition: js.UndefOr[String]
    var ExtraConnectionAttributes: js.UndefOr[String]
    var KinesisSettings: js.UndefOr[KinesisSettings]
    var KmsKeyId: js.UndefOr[String]
    var MongoDbSettings: js.UndefOr[MongoDbSettings]
    var Port: js.UndefOr[IntegerOptional]
    var RedshiftSettings: js.UndefOr[RedshiftSettings]
    var S3Settings: js.UndefOr[S3Settings]
    var ServerName: js.UndefOr[String]
    var ServiceAccessRoleArn: js.UndefOr[String]
    var SslMode: js.UndefOr[DmsSslModeValue]
    var Status: js.UndefOr[String]
    var Username: js.UndefOr[String]
  }

  object Endpoint {
    def apply(
        CertificateArn: js.UndefOr[String] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        DmsTransferSettings: js.UndefOr[DmsTransferSettings] = js.undefined,
        DynamoDbSettings: js.UndefOr[DynamoDbSettings] = js.undefined,
        ElasticsearchSettings: js.UndefOr[ElasticsearchSettings] = js.undefined,
        EndpointArn: js.UndefOr[String] = js.undefined,
        EndpointIdentifier: js.UndefOr[String] = js.undefined,
        EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.undefined,
        EngineDisplayName: js.UndefOr[String] = js.undefined,
        EngineName: js.UndefOr[String] = js.undefined,
        ExternalId: js.UndefOr[String] = js.undefined,
        ExternalTableDefinition: js.UndefOr[String] = js.undefined,
        ExtraConnectionAttributes: js.UndefOr[String] = js.undefined,
        KinesisSettings: js.UndefOr[KinesisSettings] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        MongoDbSettings: js.UndefOr[MongoDbSettings] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        RedshiftSettings: js.UndefOr[RedshiftSettings] = js.undefined,
        S3Settings: js.UndefOr[S3Settings] = js.undefined,
        ServerName: js.UndefOr[String] = js.undefined,
        ServiceAccessRoleArn: js.UndefOr[String] = js.undefined,
        SslMode: js.UndefOr[DmsSslModeValue] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        Username: js.UndefOr[String] = js.undefined
    ): Endpoint = {
      val __obj = js.Dictionary.empty[js.Any]
      CertificateArn.foreach(__v => __obj.update("CertificateArn", __v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.update("DatabaseName", __v.asInstanceOf[js.Any]))
      DmsTransferSettings.foreach(__v => __obj.update("DmsTransferSettings", __v.asInstanceOf[js.Any]))
      DynamoDbSettings.foreach(__v => __obj.update("DynamoDbSettings", __v.asInstanceOf[js.Any]))
      ElasticsearchSettings.foreach(__v => __obj.update("ElasticsearchSettings", __v.asInstanceOf[js.Any]))
      EndpointArn.foreach(__v => __obj.update("EndpointArn", __v.asInstanceOf[js.Any]))
      EndpointIdentifier.foreach(__v => __obj.update("EndpointIdentifier", __v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.update("EndpointType", __v.asInstanceOf[js.Any]))
      EngineDisplayName.foreach(__v => __obj.update("EngineDisplayName", __v.asInstanceOf[js.Any]))
      EngineName.foreach(__v => __obj.update("EngineName", __v.asInstanceOf[js.Any]))
      ExternalId.foreach(__v => __obj.update("ExternalId", __v.asInstanceOf[js.Any]))
      ExternalTableDefinition.foreach(__v => __obj.update("ExternalTableDefinition", __v.asInstanceOf[js.Any]))
      ExtraConnectionAttributes.foreach(__v => __obj.update("ExtraConnectionAttributes", __v.asInstanceOf[js.Any]))
      KinesisSettings.foreach(__v => __obj.update("KinesisSettings", __v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.update("KmsKeyId", __v.asInstanceOf[js.Any]))
      MongoDbSettings.foreach(__v => __obj.update("MongoDbSettings", __v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.update("Port", __v.asInstanceOf[js.Any]))
      RedshiftSettings.foreach(__v => __obj.update("RedshiftSettings", __v.asInstanceOf[js.Any]))
      S3Settings.foreach(__v => __obj.update("S3Settings", __v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.update("ServerName", __v.asInstanceOf[js.Any]))
      ServiceAccessRoleArn.foreach(__v => __obj.update("ServiceAccessRoleArn", __v.asInstanceOf[js.Any]))
      SslMode.foreach(__v => __obj.update("SslMode", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.update("Username", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Endpoint]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait Event extends js.Object {
    var Date: js.UndefOr[TStamp]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var Message: js.UndefOr[String]
    var SourceIdentifier: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
  }

  object Event {
    def apply(
        Date: js.UndefOr[TStamp] = js.undefined,
        EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
        Message: js.UndefOr[String] = js.undefined,
        SourceIdentifier: js.UndefOr[String] = js.undefined,
        SourceType: js.UndefOr[SourceType] = js.undefined
    ): Event = {
      val __obj = js.Dictionary.empty[js.Any]
      Date.foreach(__v => __obj.update("Date", __v.asInstanceOf[js.Any]))
      EventCategories.foreach(__v => __obj.update("EventCategories", __v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      SourceIdentifier.foreach(__v => __obj.update("SourceIdentifier", __v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.update("SourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Event]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait EventCategoryGroup extends js.Object {
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SourceType: js.UndefOr[String]
  }

  object EventCategoryGroup {
    def apply(
        EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
        SourceType: js.UndefOr[String] = js.undefined
    ): EventCategoryGroup = {
      val __obj = js.Dictionary.empty[js.Any]
      EventCategories.foreach(__v => __obj.update("EventCategories", __v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.update("SourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventCategoryGroup]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait EventSubscription extends js.Object {
    var CustSubscriptionId: js.UndefOr[String]
    var CustomerAwsId: js.UndefOr[String]
    var Enabled: js.UndefOr[Boolean]
    var EventCategoriesList: js.UndefOr[EventCategoriesList]
    var SnsTopicArn: js.UndefOr[String]
    var SourceIdsList: js.UndefOr[SourceIdsList]
    var SourceType: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var SubscriptionCreationTime: js.UndefOr[String]
  }

  object EventSubscription {
    def apply(
        CustSubscriptionId: js.UndefOr[String] = js.undefined,
        CustomerAwsId: js.UndefOr[String] = js.undefined,
        Enabled: js.UndefOr[Boolean] = js.undefined,
        EventCategoriesList: js.UndefOr[EventCategoriesList] = js.undefined,
        SnsTopicArn: js.UndefOr[String] = js.undefined,
        SourceIdsList: js.UndefOr[SourceIdsList] = js.undefined,
        SourceType: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        SubscriptionCreationTime: js.UndefOr[String] = js.undefined
    ): EventSubscription = {
      val __obj = js.Dictionary.empty[js.Any]
      CustSubscriptionId.foreach(__v => __obj.update("CustSubscriptionId", __v.asInstanceOf[js.Any]))
      CustomerAwsId.foreach(__v => __obj.update("CustomerAwsId", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      EventCategoriesList.foreach(__v => __obj.update("EventCategoriesList", __v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.update("SnsTopicArn", __v.asInstanceOf[js.Any]))
      SourceIdsList.foreach(__v => __obj.update("SourceIdsList", __v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.update("SourceType", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      SubscriptionCreationTime.foreach(__v => __obj.update("SubscriptionCreationTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventSubscription]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait Filter extends js.Object {
    var Name: String
    var Values: FilterValueList
  }

  object Filter {
    def apply(
        Name: String,
        Values: FilterValueList
    ): Filter = {
      val __obj = js.Dictionary[js.Any](
        "Name"   -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Filter]
    }
  }

  @js.native
  trait ImportCertificateMessage extends js.Object {
    var CertificateIdentifier: String
    var CertificatePem: js.UndefOr[String]
    var CertificateWallet: js.UndefOr[CertificateWallet]
    var Tags: js.UndefOr[TagList]
  }

  object ImportCertificateMessage {
    def apply(
        CertificateIdentifier: String,
        CertificatePem: js.UndefOr[String] = js.undefined,
        CertificateWallet: js.UndefOr[CertificateWallet] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ImportCertificateMessage = {
      val __obj = js.Dictionary[js.Any](
        "CertificateIdentifier" -> CertificateIdentifier.asInstanceOf[js.Any]
      )

      CertificatePem.foreach(__v => __obj.update("CertificatePem", __v.asInstanceOf[js.Any]))
      CertificateWallet.foreach(__v => __obj.update("CertificateWallet", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportCertificateMessage]
    }
  }

  @js.native
  trait ImportCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[Certificate]
  }

  object ImportCertificateResponse {
    def apply(
        Certificate: js.UndefOr[Certificate] = js.undefined
    ): ImportCertificateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Certificate.foreach(__v => __obj.update("Certificate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportCertificateResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait KinesisSettings extends js.Object {
    var MessageFormat: js.UndefOr[MessageFormatValue]
    var ServiceAccessRoleArn: js.UndefOr[String]
    var StreamArn: js.UndefOr[String]
  }

  object KinesisSettings {
    def apply(
        MessageFormat: js.UndefOr[MessageFormatValue] = js.undefined,
        ServiceAccessRoleArn: js.UndefOr[String] = js.undefined,
        StreamArn: js.UndefOr[String] = js.undefined
    ): KinesisSettings = {
      val __obj = js.Dictionary.empty[js.Any]
      MessageFormat.foreach(__v => __obj.update("MessageFormat", __v.asInstanceOf[js.Any]))
      ServiceAccessRoleArn.foreach(__v => __obj.update("ServiceAccessRoleArn", __v.asInstanceOf[js.Any]))
      StreamArn.foreach(__v => __obj.update("StreamArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KinesisSettings]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ListTagsForResourceMessage extends js.Object {
    var ResourceArn: String
  }

  object ListTagsForResourceMessage {
    def apply(
        ResourceArn: String
    ): ListTagsForResourceMessage = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    def apply(
        TagList: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      TagList.foreach(__v => __obj.update("TagList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  object MessageFormatValueEnum {
    val json = "json"

    val values = js.Object.freeze(js.Array(json))
  }

  object MigrationTypeValueEnum {
    val `full-load`         = "full-load"
    val cdc                 = "cdc"
    val `full-load-and-cdc` = "full-load-and-cdc"

    val values = js.Object.freeze(js.Array(`full-load`, cdc, `full-load-and-cdc`))
  }

  /**
    * <p/>
    */
  @js.native
  trait ModifyEndpointMessage extends js.Object {
    var EndpointArn: String
    var CertificateArn: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DmsTransferSettings: js.UndefOr[DmsTransferSettings]
    var DynamoDbSettings: js.UndefOr[DynamoDbSettings]
    var ElasticsearchSettings: js.UndefOr[ElasticsearchSettings]
    var EndpointIdentifier: js.UndefOr[String]
    var EndpointType: js.UndefOr[ReplicationEndpointTypeValue]
    var EngineName: js.UndefOr[String]
    var ExternalTableDefinition: js.UndefOr[String]
    var ExtraConnectionAttributes: js.UndefOr[String]
    var KinesisSettings: js.UndefOr[KinesisSettings]
    var MongoDbSettings: js.UndefOr[MongoDbSettings]
    var Password: js.UndefOr[SecretString]
    var Port: js.UndefOr[IntegerOptional]
    var RedshiftSettings: js.UndefOr[RedshiftSettings]
    var S3Settings: js.UndefOr[S3Settings]
    var ServerName: js.UndefOr[String]
    var ServiceAccessRoleArn: js.UndefOr[String]
    var SslMode: js.UndefOr[DmsSslModeValue]
    var Username: js.UndefOr[String]
  }

  object ModifyEndpointMessage {
    def apply(
        EndpointArn: String,
        CertificateArn: js.UndefOr[String] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        DmsTransferSettings: js.UndefOr[DmsTransferSettings] = js.undefined,
        DynamoDbSettings: js.UndefOr[DynamoDbSettings] = js.undefined,
        ElasticsearchSettings: js.UndefOr[ElasticsearchSettings] = js.undefined,
        EndpointIdentifier: js.UndefOr[String] = js.undefined,
        EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.undefined,
        EngineName: js.UndefOr[String] = js.undefined,
        ExternalTableDefinition: js.UndefOr[String] = js.undefined,
        ExtraConnectionAttributes: js.UndefOr[String] = js.undefined,
        KinesisSettings: js.UndefOr[KinesisSettings] = js.undefined,
        MongoDbSettings: js.UndefOr[MongoDbSettings] = js.undefined,
        Password: js.UndefOr[SecretString] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        RedshiftSettings: js.UndefOr[RedshiftSettings] = js.undefined,
        S3Settings: js.UndefOr[S3Settings] = js.undefined,
        ServerName: js.UndefOr[String] = js.undefined,
        ServiceAccessRoleArn: js.UndefOr[String] = js.undefined,
        SslMode: js.UndefOr[DmsSslModeValue] = js.undefined,
        Username: js.UndefOr[String] = js.undefined
    ): ModifyEndpointMessage = {
      val __obj = js.Dictionary[js.Any](
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      )

      CertificateArn.foreach(__v => __obj.update("CertificateArn", __v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.update("DatabaseName", __v.asInstanceOf[js.Any]))
      DmsTransferSettings.foreach(__v => __obj.update("DmsTransferSettings", __v.asInstanceOf[js.Any]))
      DynamoDbSettings.foreach(__v => __obj.update("DynamoDbSettings", __v.asInstanceOf[js.Any]))
      ElasticsearchSettings.foreach(__v => __obj.update("ElasticsearchSettings", __v.asInstanceOf[js.Any]))
      EndpointIdentifier.foreach(__v => __obj.update("EndpointIdentifier", __v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.update("EndpointType", __v.asInstanceOf[js.Any]))
      EngineName.foreach(__v => __obj.update("EngineName", __v.asInstanceOf[js.Any]))
      ExternalTableDefinition.foreach(__v => __obj.update("ExternalTableDefinition", __v.asInstanceOf[js.Any]))
      ExtraConnectionAttributes.foreach(__v => __obj.update("ExtraConnectionAttributes", __v.asInstanceOf[js.Any]))
      KinesisSettings.foreach(__v => __obj.update("KinesisSettings", __v.asInstanceOf[js.Any]))
      MongoDbSettings.foreach(__v => __obj.update("MongoDbSettings", __v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.update("Password", __v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.update("Port", __v.asInstanceOf[js.Any]))
      RedshiftSettings.foreach(__v => __obj.update("RedshiftSettings", __v.asInstanceOf[js.Any]))
      S3Settings.foreach(__v => __obj.update("S3Settings", __v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.update("ServerName", __v.asInstanceOf[js.Any]))
      ServiceAccessRoleArn.foreach(__v => __obj.update("ServiceAccessRoleArn", __v.asInstanceOf[js.Any]))
      SslMode.foreach(__v => __obj.update("SslMode", __v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.update("Username", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyEndpointMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ModifyEndpointResponse extends js.Object {
    var Endpoint: js.UndefOr[Endpoint]
  }

  object ModifyEndpointResponse {
    def apply(
        Endpoint: js.UndefOr[Endpoint] = js.undefined
    ): ModifyEndpointResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Endpoint.foreach(__v => __obj.update("Endpoint", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyEndpointResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ModifyEventSubscriptionMessage extends js.Object {
    var SubscriptionName: String
    var Enabled: js.UndefOr[BooleanOptional]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SnsTopicArn: js.UndefOr[String]
    var SourceType: js.UndefOr[String]
  }

  object ModifyEventSubscriptionMessage {
    def apply(
        SubscriptionName: String,
        Enabled: js.UndefOr[BooleanOptional] = js.undefined,
        EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
        SnsTopicArn: js.UndefOr[String] = js.undefined,
        SourceType: js.UndefOr[String] = js.undefined
    ): ModifyEventSubscriptionMessage = {
      val __obj = js.Dictionary[js.Any](
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any]
      )

      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      EventCategories.foreach(__v => __obj.update("EventCategories", __v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.update("SnsTopicArn", __v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.update("SourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyEventSubscriptionMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ModifyEventSubscriptionResponse extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object ModifyEventSubscriptionResponse {
    def apply(
        EventSubscription: js.UndefOr[EventSubscription] = js.undefined
    ): ModifyEventSubscriptionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EventSubscription.foreach(__v => __obj.update("EventSubscription", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyEventSubscriptionResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ModifyReplicationInstanceMessage extends js.Object {
    var ReplicationInstanceArn: String
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var AllowMajorVersionUpgrade: js.UndefOr[Boolean]
    var ApplyImmediately: js.UndefOr[Boolean]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var EngineVersion: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var ReplicationInstanceClass: js.UndefOr[String]
    var ReplicationInstanceIdentifier: js.UndefOr[String]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  object ModifyReplicationInstanceMessage {
    def apply(
        ReplicationInstanceArn: String,
        AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
        AllowMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
        ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
        AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        ReplicationInstanceClass: js.UndefOr[String] = js.undefined,
        ReplicationInstanceIdentifier: js.UndefOr[String] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): ModifyReplicationInstanceMessage = {
      val __obj = js.Dictionary[js.Any](
        "ReplicationInstanceArn" -> ReplicationInstanceArn.asInstanceOf[js.Any]
      )

      AllocatedStorage.foreach(__v => __obj.update("AllocatedStorage", __v.asInstanceOf[js.Any]))
      AllowMajorVersionUpgrade.foreach(__v => __obj.update("AllowMajorVersionUpgrade", __v.asInstanceOf[js.Any]))
      ApplyImmediately.foreach(__v => __obj.update("ApplyImmediately", __v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.update("AutoMinorVersionUpgrade", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.update("MultiAZ", __v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.update("PreferredMaintenanceWindow", __v.asInstanceOf[js.Any]))
      ReplicationInstanceClass.foreach(__v => __obj.update("ReplicationInstanceClass", __v.asInstanceOf[js.Any]))
      ReplicationInstanceIdentifier.foreach(
        __v => __obj.update("ReplicationInstanceIdentifier", __v.asInstanceOf[js.Any])
      )
      VpcSecurityGroupIds.foreach(__v => __obj.update("VpcSecurityGroupIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyReplicationInstanceMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ModifyReplicationInstanceResponse extends js.Object {
    var ReplicationInstance: js.UndefOr[ReplicationInstance]
  }

  object ModifyReplicationInstanceResponse {
    def apply(
        ReplicationInstance: js.UndefOr[ReplicationInstance] = js.undefined
    ): ModifyReplicationInstanceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationInstance.foreach(__v => __obj.update("ReplicationInstance", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyReplicationInstanceResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ModifyReplicationSubnetGroupMessage extends js.Object {
    var ReplicationSubnetGroupIdentifier: String
    var SubnetIds: SubnetIdentifierList
    var ReplicationSubnetGroupDescription: js.UndefOr[String]
  }

  object ModifyReplicationSubnetGroupMessage {
    def apply(
        ReplicationSubnetGroupIdentifier: String,
        SubnetIds: SubnetIdentifierList,
        ReplicationSubnetGroupDescription: js.UndefOr[String] = js.undefined
    ): ModifyReplicationSubnetGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "ReplicationSubnetGroupIdentifier" -> ReplicationSubnetGroupIdentifier.asInstanceOf[js.Any],
        "SubnetIds"                        -> SubnetIds.asInstanceOf[js.Any]
      )

      ReplicationSubnetGroupDescription.foreach(
        __v => __obj.update("ReplicationSubnetGroupDescription", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ModifyReplicationSubnetGroupMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ModifyReplicationSubnetGroupResponse extends js.Object {
    var ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup]
  }

  object ModifyReplicationSubnetGroupResponse {
    def apply(
        ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup] = js.undefined
    ): ModifyReplicationSubnetGroupResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationSubnetGroup.foreach(__v => __obj.update("ReplicationSubnetGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyReplicationSubnetGroupResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ModifyReplicationTaskMessage extends js.Object {
    var ReplicationTaskArn: String
    var CdcStartPosition: js.UndefOr[String]
    var CdcStartTime: js.UndefOr[TStamp]
    var CdcStopPosition: js.UndefOr[String]
    var MigrationType: js.UndefOr[MigrationTypeValue]
    var ReplicationTaskIdentifier: js.UndefOr[String]
    var ReplicationTaskSettings: js.UndefOr[String]
    var TableMappings: js.UndefOr[String]
  }

  object ModifyReplicationTaskMessage {
    def apply(
        ReplicationTaskArn: String,
        CdcStartPosition: js.UndefOr[String] = js.undefined,
        CdcStartTime: js.UndefOr[TStamp] = js.undefined,
        CdcStopPosition: js.UndefOr[String] = js.undefined,
        MigrationType: js.UndefOr[MigrationTypeValue] = js.undefined,
        ReplicationTaskIdentifier: js.UndefOr[String] = js.undefined,
        ReplicationTaskSettings: js.UndefOr[String] = js.undefined,
        TableMappings: js.UndefOr[String] = js.undefined
    ): ModifyReplicationTaskMessage = {
      val __obj = js.Dictionary[js.Any](
        "ReplicationTaskArn" -> ReplicationTaskArn.asInstanceOf[js.Any]
      )

      CdcStartPosition.foreach(__v => __obj.update("CdcStartPosition", __v.asInstanceOf[js.Any]))
      CdcStartTime.foreach(__v => __obj.update("CdcStartTime", __v.asInstanceOf[js.Any]))
      CdcStopPosition.foreach(__v => __obj.update("CdcStopPosition", __v.asInstanceOf[js.Any]))
      MigrationType.foreach(__v => __obj.update("MigrationType", __v.asInstanceOf[js.Any]))
      ReplicationTaskIdentifier.foreach(__v => __obj.update("ReplicationTaskIdentifier", __v.asInstanceOf[js.Any]))
      ReplicationTaskSettings.foreach(__v => __obj.update("ReplicationTaskSettings", __v.asInstanceOf[js.Any]))
      TableMappings.foreach(__v => __obj.update("TableMappings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyReplicationTaskMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ModifyReplicationTaskResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  object ModifyReplicationTaskResponse {
    def apply(
        ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
    ): ModifyReplicationTaskResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationTask.foreach(__v => __obj.update("ReplicationTask", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyReplicationTaskResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait MongoDbSettings extends js.Object {
    var AuthMechanism: js.UndefOr[AuthMechanismValue]
    var AuthSource: js.UndefOr[String]
    var AuthType: js.UndefOr[AuthTypeValue]
    var DatabaseName: js.UndefOr[String]
    var DocsToInvestigate: js.UndefOr[String]
    var ExtractDocId: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var NestingLevel: js.UndefOr[NestingLevelValue]
    var Password: js.UndefOr[SecretString]
    var Port: js.UndefOr[IntegerOptional]
    var ServerName: js.UndefOr[String]
    var Username: js.UndefOr[String]
  }

  object MongoDbSettings {
    def apply(
        AuthMechanism: js.UndefOr[AuthMechanismValue] = js.undefined,
        AuthSource: js.UndefOr[String] = js.undefined,
        AuthType: js.UndefOr[AuthTypeValue] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        DocsToInvestigate: js.UndefOr[String] = js.undefined,
        ExtractDocId: js.UndefOr[String] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        NestingLevel: js.UndefOr[NestingLevelValue] = js.undefined,
        Password: js.UndefOr[SecretString] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        ServerName: js.UndefOr[String] = js.undefined,
        Username: js.UndefOr[String] = js.undefined
    ): MongoDbSettings = {
      val __obj = js.Dictionary.empty[js.Any]
      AuthMechanism.foreach(__v => __obj.update("AuthMechanism", __v.asInstanceOf[js.Any]))
      AuthSource.foreach(__v => __obj.update("AuthSource", __v.asInstanceOf[js.Any]))
      AuthType.foreach(__v => __obj.update("AuthType", __v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.update("DatabaseName", __v.asInstanceOf[js.Any]))
      DocsToInvestigate.foreach(__v => __obj.update("DocsToInvestigate", __v.asInstanceOf[js.Any]))
      ExtractDocId.foreach(__v => __obj.update("ExtractDocId", __v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.update("KmsKeyId", __v.asInstanceOf[js.Any]))
      NestingLevel.foreach(__v => __obj.update("NestingLevel", __v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.update("Password", __v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.update("Port", __v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.update("ServerName", __v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.update("Username", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MongoDbSettings]
    }
  }

  object NestingLevelValueEnum {
    val none = "none"
    val one  = "one"

    val values = js.Object.freeze(js.Array(none, one))
  }

  /**
    * <p/>
    */
  @js.native
  trait OrderableReplicationInstance extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZonesList]
    var DefaultAllocatedStorage: js.UndefOr[Int]
    var EngineVersion: js.UndefOr[String]
    var IncludedAllocatedStorage: js.UndefOr[Int]
    var MaxAllocatedStorage: js.UndefOr[Int]
    var MinAllocatedStorage: js.UndefOr[Int]
    var ReleaseStatus: js.UndefOr[ReleaseStatusValues]
    var ReplicationInstanceClass: js.UndefOr[String]
    var StorageType: js.UndefOr[String]
  }

  object OrderableReplicationInstance {
    def apply(
        AvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.undefined,
        DefaultAllocatedStorage: js.UndefOr[Int] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        IncludedAllocatedStorage: js.UndefOr[Int] = js.undefined,
        MaxAllocatedStorage: js.UndefOr[Int] = js.undefined,
        MinAllocatedStorage: js.UndefOr[Int] = js.undefined,
        ReleaseStatus: js.UndefOr[ReleaseStatusValues] = js.undefined,
        ReplicationInstanceClass: js.UndefOr[String] = js.undefined,
        StorageType: js.UndefOr[String] = js.undefined
    ): OrderableReplicationInstance = {
      val __obj = js.Dictionary.empty[js.Any]
      AvailabilityZones.foreach(__v => __obj.update("AvailabilityZones", __v.asInstanceOf[js.Any]))
      DefaultAllocatedStorage.foreach(__v => __obj.update("DefaultAllocatedStorage", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      IncludedAllocatedStorage.foreach(__v => __obj.update("IncludedAllocatedStorage", __v.asInstanceOf[js.Any]))
      MaxAllocatedStorage.foreach(__v => __obj.update("MaxAllocatedStorage", __v.asInstanceOf[js.Any]))
      MinAllocatedStorage.foreach(__v => __obj.update("MinAllocatedStorage", __v.asInstanceOf[js.Any]))
      ReleaseStatus.foreach(__v => __obj.update("ReleaseStatus", __v.asInstanceOf[js.Any]))
      ReplicationInstanceClass.foreach(__v => __obj.update("ReplicationInstanceClass", __v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.update("StorageType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrderableReplicationInstance]
    }
  }

  object ParquetVersionValueEnum {
    val `parquet-1-0` = "parquet-1-0"
    val `parquet-2-0` = "parquet-2-0"

    val values = js.Object.freeze(js.Array(`parquet-1-0`, `parquet-2-0`))
  }

  /**
    * <p/>
    */
  @js.native
  trait PendingMaintenanceAction extends js.Object {
    var Action: js.UndefOr[String]
    var AutoAppliedAfterDate: js.UndefOr[TStamp]
    var CurrentApplyDate: js.UndefOr[TStamp]
    var Description: js.UndefOr[String]
    var ForcedApplyDate: js.UndefOr[TStamp]
    var OptInStatus: js.UndefOr[String]
  }

  object PendingMaintenanceAction {
    def apply(
        Action: js.UndefOr[String] = js.undefined,
        AutoAppliedAfterDate: js.UndefOr[TStamp] = js.undefined,
        CurrentApplyDate: js.UndefOr[TStamp] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        ForcedApplyDate: js.UndefOr[TStamp] = js.undefined,
        OptInStatus: js.UndefOr[String] = js.undefined
    ): PendingMaintenanceAction = {
      val __obj = js.Dictionary.empty[js.Any]
      Action.foreach(__v => __obj.update("Action", __v.asInstanceOf[js.Any]))
      AutoAppliedAfterDate.foreach(__v => __obj.update("AutoAppliedAfterDate", __v.asInstanceOf[js.Any]))
      CurrentApplyDate.foreach(__v => __obj.update("CurrentApplyDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ForcedApplyDate.foreach(__v => __obj.update("ForcedApplyDate", __v.asInstanceOf[js.Any]))
      OptInStatus.foreach(__v => __obj.update("OptInStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PendingMaintenanceAction]
    }
  }

  @js.native
  trait RebootReplicationInstanceMessage extends js.Object {
    var ReplicationInstanceArn: String
    var ForceFailover: js.UndefOr[BooleanOptional]
  }

  object RebootReplicationInstanceMessage {
    def apply(
        ReplicationInstanceArn: String,
        ForceFailover: js.UndefOr[BooleanOptional] = js.undefined
    ): RebootReplicationInstanceMessage = {
      val __obj = js.Dictionary[js.Any](
        "ReplicationInstanceArn" -> ReplicationInstanceArn.asInstanceOf[js.Any]
      )

      ForceFailover.foreach(__v => __obj.update("ForceFailover", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RebootReplicationInstanceMessage]
    }
  }

  @js.native
  trait RebootReplicationInstanceResponse extends js.Object {
    var ReplicationInstance: js.UndefOr[ReplicationInstance]
  }

  object RebootReplicationInstanceResponse {
    def apply(
        ReplicationInstance: js.UndefOr[ReplicationInstance] = js.undefined
    ): RebootReplicationInstanceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationInstance.foreach(__v => __obj.update("ReplicationInstance", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RebootReplicationInstanceResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait RedshiftSettings extends js.Object {
    var AcceptAnyDate: js.UndefOr[BooleanOptional]
    var AfterConnectScript: js.UndefOr[String]
    var BucketFolder: js.UndefOr[String]
    var BucketName: js.UndefOr[String]
    var ConnectionTimeout: js.UndefOr[IntegerOptional]
    var DatabaseName: js.UndefOr[String]
    var DateFormat: js.UndefOr[String]
    var EmptyAsNull: js.UndefOr[BooleanOptional]
    var EncryptionMode: js.UndefOr[EncryptionModeValue]
    var FileTransferUploadStreams: js.UndefOr[IntegerOptional]
    var LoadTimeout: js.UndefOr[IntegerOptional]
    var MaxFileSize: js.UndefOr[IntegerOptional]
    var Password: js.UndefOr[SecretString]
    var Port: js.UndefOr[IntegerOptional]
    var RemoveQuotes: js.UndefOr[BooleanOptional]
    var ReplaceChars: js.UndefOr[String]
    var ReplaceInvalidChars: js.UndefOr[String]
    var ServerName: js.UndefOr[String]
    var ServerSideEncryptionKmsKeyId: js.UndefOr[String]
    var ServiceAccessRoleArn: js.UndefOr[String]
    var TimeFormat: js.UndefOr[String]
    var TrimBlanks: js.UndefOr[BooleanOptional]
    var TruncateColumns: js.UndefOr[BooleanOptional]
    var Username: js.UndefOr[String]
    var WriteBufferSize: js.UndefOr[IntegerOptional]
  }

  object RedshiftSettings {
    def apply(
        AcceptAnyDate: js.UndefOr[BooleanOptional] = js.undefined,
        AfterConnectScript: js.UndefOr[String] = js.undefined,
        BucketFolder: js.UndefOr[String] = js.undefined,
        BucketName: js.UndefOr[String] = js.undefined,
        ConnectionTimeout: js.UndefOr[IntegerOptional] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        DateFormat: js.UndefOr[String] = js.undefined,
        EmptyAsNull: js.UndefOr[BooleanOptional] = js.undefined,
        EncryptionMode: js.UndefOr[EncryptionModeValue] = js.undefined,
        FileTransferUploadStreams: js.UndefOr[IntegerOptional] = js.undefined,
        LoadTimeout: js.UndefOr[IntegerOptional] = js.undefined,
        MaxFileSize: js.UndefOr[IntegerOptional] = js.undefined,
        Password: js.UndefOr[SecretString] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        RemoveQuotes: js.UndefOr[BooleanOptional] = js.undefined,
        ReplaceChars: js.UndefOr[String] = js.undefined,
        ReplaceInvalidChars: js.UndefOr[String] = js.undefined,
        ServerName: js.UndefOr[String] = js.undefined,
        ServerSideEncryptionKmsKeyId: js.UndefOr[String] = js.undefined,
        ServiceAccessRoleArn: js.UndefOr[String] = js.undefined,
        TimeFormat: js.UndefOr[String] = js.undefined,
        TrimBlanks: js.UndefOr[BooleanOptional] = js.undefined,
        TruncateColumns: js.UndefOr[BooleanOptional] = js.undefined,
        Username: js.UndefOr[String] = js.undefined,
        WriteBufferSize: js.UndefOr[IntegerOptional] = js.undefined
    ): RedshiftSettings = {
      val __obj = js.Dictionary.empty[js.Any]
      AcceptAnyDate.foreach(__v => __obj.update("AcceptAnyDate", __v.asInstanceOf[js.Any]))
      AfterConnectScript.foreach(__v => __obj.update("AfterConnectScript", __v.asInstanceOf[js.Any]))
      BucketFolder.foreach(__v => __obj.update("BucketFolder", __v.asInstanceOf[js.Any]))
      BucketName.foreach(__v => __obj.update("BucketName", __v.asInstanceOf[js.Any]))
      ConnectionTimeout.foreach(__v => __obj.update("ConnectionTimeout", __v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.update("DatabaseName", __v.asInstanceOf[js.Any]))
      DateFormat.foreach(__v => __obj.update("DateFormat", __v.asInstanceOf[js.Any]))
      EmptyAsNull.foreach(__v => __obj.update("EmptyAsNull", __v.asInstanceOf[js.Any]))
      EncryptionMode.foreach(__v => __obj.update("EncryptionMode", __v.asInstanceOf[js.Any]))
      FileTransferUploadStreams.foreach(__v => __obj.update("FileTransferUploadStreams", __v.asInstanceOf[js.Any]))
      LoadTimeout.foreach(__v => __obj.update("LoadTimeout", __v.asInstanceOf[js.Any]))
      MaxFileSize.foreach(__v => __obj.update("MaxFileSize", __v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.update("Password", __v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.update("Port", __v.asInstanceOf[js.Any]))
      RemoveQuotes.foreach(__v => __obj.update("RemoveQuotes", __v.asInstanceOf[js.Any]))
      ReplaceChars.foreach(__v => __obj.update("ReplaceChars", __v.asInstanceOf[js.Any]))
      ReplaceInvalidChars.foreach(__v => __obj.update("ReplaceInvalidChars", __v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.update("ServerName", __v.asInstanceOf[js.Any]))
      ServerSideEncryptionKmsKeyId.foreach(
        __v => __obj.update("ServerSideEncryptionKmsKeyId", __v.asInstanceOf[js.Any])
      )
      ServiceAccessRoleArn.foreach(__v => __obj.update("ServiceAccessRoleArn", __v.asInstanceOf[js.Any]))
      TimeFormat.foreach(__v => __obj.update("TimeFormat", __v.asInstanceOf[js.Any]))
      TrimBlanks.foreach(__v => __obj.update("TrimBlanks", __v.asInstanceOf[js.Any]))
      TruncateColumns.foreach(__v => __obj.update("TruncateColumns", __v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.update("Username", __v.asInstanceOf[js.Any]))
      WriteBufferSize.foreach(__v => __obj.update("WriteBufferSize", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RedshiftSettings]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait RefreshSchemasMessage extends js.Object {
    var EndpointArn: String
    var ReplicationInstanceArn: String
  }

  object RefreshSchemasMessage {
    def apply(
        EndpointArn: String,
        ReplicationInstanceArn: String
    ): RefreshSchemasMessage = {
      val __obj = js.Dictionary[js.Any](
        "EndpointArn"            -> EndpointArn.asInstanceOf[js.Any],
        "ReplicationInstanceArn" -> ReplicationInstanceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RefreshSchemasMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait RefreshSchemasResponse extends js.Object {
    var RefreshSchemasStatus: js.UndefOr[RefreshSchemasStatus]
  }

  object RefreshSchemasResponse {
    def apply(
        RefreshSchemasStatus: js.UndefOr[RefreshSchemasStatus] = js.undefined
    ): RefreshSchemasResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      RefreshSchemasStatus.foreach(__v => __obj.update("RefreshSchemasStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RefreshSchemasResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait RefreshSchemasStatus extends js.Object {
    var EndpointArn: js.UndefOr[String]
    var LastFailureMessage: js.UndefOr[String]
    var LastRefreshDate: js.UndefOr[TStamp]
    var ReplicationInstanceArn: js.UndefOr[String]
    var Status: js.UndefOr[RefreshSchemasStatusTypeValue]
  }

  object RefreshSchemasStatus {
    def apply(
        EndpointArn: js.UndefOr[String] = js.undefined,
        LastFailureMessage: js.UndefOr[String] = js.undefined,
        LastRefreshDate: js.UndefOr[TStamp] = js.undefined,
        ReplicationInstanceArn: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[RefreshSchemasStatusTypeValue] = js.undefined
    ): RefreshSchemasStatus = {
      val __obj = js.Dictionary.empty[js.Any]
      EndpointArn.foreach(__v => __obj.update("EndpointArn", __v.asInstanceOf[js.Any]))
      LastFailureMessage.foreach(__v => __obj.update("LastFailureMessage", __v.asInstanceOf[js.Any]))
      LastRefreshDate.foreach(__v => __obj.update("LastRefreshDate", __v.asInstanceOf[js.Any]))
      ReplicationInstanceArn.foreach(__v => __obj.update("ReplicationInstanceArn", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RefreshSchemasStatus]
    }
  }

  object RefreshSchemasStatusTypeValueEnum {
    val successful = "successful"
    val failed     = "failed"
    val refreshing = "refreshing"

    val values = js.Object.freeze(js.Array(successful, failed, refreshing))
  }

  object ReleaseStatusValuesEnum {
    val beta = "beta"

    val values = js.Object.freeze(js.Array(beta))
  }

  object ReloadOptionValueEnum {
    val `data-reload`   = "data-reload"
    val `validate-only` = "validate-only"

    val values = js.Object.freeze(js.Array(`data-reload`, `validate-only`))
  }

  @js.native
  trait ReloadTablesMessage extends js.Object {
    var ReplicationTaskArn: String
    var TablesToReload: TableListToReload
    var ReloadOption: js.UndefOr[ReloadOptionValue]
  }

  object ReloadTablesMessage {
    def apply(
        ReplicationTaskArn: String,
        TablesToReload: TableListToReload,
        ReloadOption: js.UndefOr[ReloadOptionValue] = js.undefined
    ): ReloadTablesMessage = {
      val __obj = js.Dictionary[js.Any](
        "ReplicationTaskArn" -> ReplicationTaskArn.asInstanceOf[js.Any],
        "TablesToReload"     -> TablesToReload.asInstanceOf[js.Any]
      )

      ReloadOption.foreach(__v => __obj.update("ReloadOption", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReloadTablesMessage]
    }
  }

  @js.native
  trait ReloadTablesResponse extends js.Object {
    var ReplicationTaskArn: js.UndefOr[String]
  }

  object ReloadTablesResponse {
    def apply(
        ReplicationTaskArn: js.UndefOr[String] = js.undefined
    ): ReloadTablesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationTaskArn.foreach(__v => __obj.update("ReplicationTaskArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReloadTablesResponse]
    }
  }

  /**
    * Removes one or more tags from an AWS DMS resource.
    */
  @js.native
  trait RemoveTagsFromResourceMessage extends js.Object {
    var ResourceArn: String
    var TagKeys: KeyList
  }

  object RemoveTagsFromResourceMessage {
    def apply(
        ResourceArn: String,
        TagKeys: KeyList
    ): RemoveTagsFromResourceMessage = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveTagsFromResourceMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait RemoveTagsFromResourceResponse extends js.Object {}

  object RemoveTagsFromResourceResponse {
    def apply(
        ): RemoveTagsFromResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[RemoveTagsFromResourceResponse]
    }
  }

  object ReplicationEndpointTypeValueEnum {
    val source = "source"
    val target = "target"

    val values = js.Object.freeze(js.Array(source, target))
  }

  /**
    * <p/>
    */
  @js.native
  trait ReplicationInstance extends js.Object {
    var AllocatedStorage: js.UndefOr[Int]
    var AutoMinorVersionUpgrade: js.UndefOr[Boolean]
    var AvailabilityZone: js.UndefOr[String]
    var DnsNameServers: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var FreeUntil: js.UndefOr[TStamp]
    var InstanceCreateTime: js.UndefOr[TStamp]
    var KmsKeyId: js.UndefOr[String]
    var MultiAZ: js.UndefOr[Boolean]
    var PendingModifiedValues: js.UndefOr[ReplicationPendingModifiedValues]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var PubliclyAccessible: js.UndefOr[Boolean]
    var ReplicationInstanceArn: js.UndefOr[String]
    var ReplicationInstanceClass: js.UndefOr[String]
    var ReplicationInstanceIdentifier: js.UndefOr[String]
    var ReplicationInstancePrivateIpAddress: js.UndefOr[String]
    var ReplicationInstancePrivateIpAddresses: js.UndefOr[ReplicationInstancePrivateIpAddressList]
    var ReplicationInstancePublicIpAddress: js.UndefOr[String]
    var ReplicationInstancePublicIpAddresses: js.UndefOr[ReplicationInstancePublicIpAddressList]
    var ReplicationInstanceStatus: js.UndefOr[String]
    var ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup]
    var SecondaryAvailabilityZone: js.UndefOr[String]
    var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList]
  }

  object ReplicationInstance {
    def apply(
        AllocatedStorage: js.UndefOr[Int] = js.undefined,
        AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        DnsNameServers: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        FreeUntil: js.UndefOr[TStamp] = js.undefined,
        InstanceCreateTime: js.UndefOr[TStamp] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        MultiAZ: js.UndefOr[Boolean] = js.undefined,
        PendingModifiedValues: js.UndefOr[ReplicationPendingModifiedValues] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        PubliclyAccessible: js.UndefOr[Boolean] = js.undefined,
        ReplicationInstanceArn: js.UndefOr[String] = js.undefined,
        ReplicationInstanceClass: js.UndefOr[String] = js.undefined,
        ReplicationInstanceIdentifier: js.UndefOr[String] = js.undefined,
        ReplicationInstancePrivateIpAddress: js.UndefOr[String] = js.undefined,
        ReplicationInstancePrivateIpAddresses: js.UndefOr[ReplicationInstancePrivateIpAddressList] = js.undefined,
        ReplicationInstancePublicIpAddress: js.UndefOr[String] = js.undefined,
        ReplicationInstancePublicIpAddresses: js.UndefOr[ReplicationInstancePublicIpAddressList] = js.undefined,
        ReplicationInstanceStatus: js.UndefOr[String] = js.undefined,
        ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup] = js.undefined,
        SecondaryAvailabilityZone: js.UndefOr[String] = js.undefined,
        VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
    ): ReplicationInstance = {
      val __obj = js.Dictionary.empty[js.Any]
      AllocatedStorage.foreach(__v => __obj.update("AllocatedStorage", __v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.update("AutoMinorVersionUpgrade", __v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.update("AvailabilityZone", __v.asInstanceOf[js.Any]))
      DnsNameServers.foreach(__v => __obj.update("DnsNameServers", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      FreeUntil.foreach(__v => __obj.update("FreeUntil", __v.asInstanceOf[js.Any]))
      InstanceCreateTime.foreach(__v => __obj.update("InstanceCreateTime", __v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.update("KmsKeyId", __v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.update("MultiAZ", __v.asInstanceOf[js.Any]))
      PendingModifiedValues.foreach(__v => __obj.update("PendingModifiedValues", __v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.update("PreferredMaintenanceWindow", __v.asInstanceOf[js.Any]))
      PubliclyAccessible.foreach(__v => __obj.update("PubliclyAccessible", __v.asInstanceOf[js.Any]))
      ReplicationInstanceArn.foreach(__v => __obj.update("ReplicationInstanceArn", __v.asInstanceOf[js.Any]))
      ReplicationInstanceClass.foreach(__v => __obj.update("ReplicationInstanceClass", __v.asInstanceOf[js.Any]))
      ReplicationInstanceIdentifier.foreach(
        __v => __obj.update("ReplicationInstanceIdentifier", __v.asInstanceOf[js.Any])
      )
      ReplicationInstancePrivateIpAddress.foreach(
        __v => __obj.update("ReplicationInstancePrivateIpAddress", __v.asInstanceOf[js.Any])
      )
      ReplicationInstancePrivateIpAddresses.foreach(
        __v => __obj.update("ReplicationInstancePrivateIpAddresses", __v.asInstanceOf[js.Any])
      )
      ReplicationInstancePublicIpAddress.foreach(
        __v => __obj.update("ReplicationInstancePublicIpAddress", __v.asInstanceOf[js.Any])
      )
      ReplicationInstancePublicIpAddresses.foreach(
        __v => __obj.update("ReplicationInstancePublicIpAddresses", __v.asInstanceOf[js.Any])
      )
      ReplicationInstanceStatus.foreach(__v => __obj.update("ReplicationInstanceStatus", __v.asInstanceOf[js.Any]))
      ReplicationSubnetGroup.foreach(__v => __obj.update("ReplicationSubnetGroup", __v.asInstanceOf[js.Any]))
      SecondaryAvailabilityZone.foreach(__v => __obj.update("SecondaryAvailabilityZone", __v.asInstanceOf[js.Any]))
      VpcSecurityGroups.foreach(__v => __obj.update("VpcSecurityGroups", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationInstance]
    }
  }

  /**
    * Contains metadata for a replication instance task log.
    */
  @js.native
  trait ReplicationInstanceTaskLog extends js.Object {
    var ReplicationInstanceTaskLogSize: js.UndefOr[Double]
    var ReplicationTaskArn: js.UndefOr[String]
    var ReplicationTaskName: js.UndefOr[String]
  }

  object ReplicationInstanceTaskLog {
    def apply(
        ReplicationInstanceTaskLogSize: js.UndefOr[Double] = js.undefined,
        ReplicationTaskArn: js.UndefOr[String] = js.undefined,
        ReplicationTaskName: js.UndefOr[String] = js.undefined
    ): ReplicationInstanceTaskLog = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationInstanceTaskLogSize.foreach(
        __v => __obj.update("ReplicationInstanceTaskLogSize", __v.asInstanceOf[js.Any])
      )
      ReplicationTaskArn.foreach(__v => __obj.update("ReplicationTaskArn", __v.asInstanceOf[js.Any]))
      ReplicationTaskName.foreach(__v => __obj.update("ReplicationTaskName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationInstanceTaskLog]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ReplicationPendingModifiedValues extends js.Object {
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var EngineVersion: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var ReplicationInstanceClass: js.UndefOr[String]
  }

  object ReplicationPendingModifiedValues {
    def apply(
        AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
        ReplicationInstanceClass: js.UndefOr[String] = js.undefined
    ): ReplicationPendingModifiedValues = {
      val __obj = js.Dictionary.empty[js.Any]
      AllocatedStorage.foreach(__v => __obj.update("AllocatedStorage", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.update("MultiAZ", __v.asInstanceOf[js.Any]))
      ReplicationInstanceClass.foreach(__v => __obj.update("ReplicationInstanceClass", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationPendingModifiedValues]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ReplicationSubnetGroup extends js.Object {
    var ReplicationSubnetGroupDescription: js.UndefOr[String]
    var ReplicationSubnetGroupIdentifier: js.UndefOr[String]
    var SubnetGroupStatus: js.UndefOr[String]
    var Subnets: js.UndefOr[SubnetList]
    var VpcId: js.UndefOr[String]
  }

  object ReplicationSubnetGroup {
    def apply(
        ReplicationSubnetGroupDescription: js.UndefOr[String] = js.undefined,
        ReplicationSubnetGroupIdentifier: js.UndefOr[String] = js.undefined,
        SubnetGroupStatus: js.UndefOr[String] = js.undefined,
        Subnets: js.UndefOr[SubnetList] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): ReplicationSubnetGroup = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationSubnetGroupDescription.foreach(
        __v => __obj.update("ReplicationSubnetGroupDescription", __v.asInstanceOf[js.Any])
      )
      ReplicationSubnetGroupIdentifier.foreach(
        __v => __obj.update("ReplicationSubnetGroupIdentifier", __v.asInstanceOf[js.Any])
      )
      SubnetGroupStatus.foreach(__v => __obj.update("SubnetGroupStatus", __v.asInstanceOf[js.Any]))
      Subnets.foreach(__v => __obj.update("Subnets", __v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.update("VpcId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationSubnetGroup]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ReplicationTask extends js.Object {
    var CdcStartPosition: js.UndefOr[String]
    var CdcStopPosition: js.UndefOr[String]
    var LastFailureMessage: js.UndefOr[String]
    var MigrationType: js.UndefOr[MigrationTypeValue]
    var RecoveryCheckpoint: js.UndefOr[String]
    var ReplicationInstanceArn: js.UndefOr[String]
    var ReplicationTaskArn: js.UndefOr[String]
    var ReplicationTaskCreationDate: js.UndefOr[TStamp]
    var ReplicationTaskIdentifier: js.UndefOr[String]
    var ReplicationTaskSettings: js.UndefOr[String]
    var ReplicationTaskStartDate: js.UndefOr[TStamp]
    var ReplicationTaskStats: js.UndefOr[ReplicationTaskStats]
    var SourceEndpointArn: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var StopReason: js.UndefOr[String]
    var TableMappings: js.UndefOr[String]
    var TargetEndpointArn: js.UndefOr[String]
  }

  object ReplicationTask {
    def apply(
        CdcStartPosition: js.UndefOr[String] = js.undefined,
        CdcStopPosition: js.UndefOr[String] = js.undefined,
        LastFailureMessage: js.UndefOr[String] = js.undefined,
        MigrationType: js.UndefOr[MigrationTypeValue] = js.undefined,
        RecoveryCheckpoint: js.UndefOr[String] = js.undefined,
        ReplicationInstanceArn: js.UndefOr[String] = js.undefined,
        ReplicationTaskArn: js.UndefOr[String] = js.undefined,
        ReplicationTaskCreationDate: js.UndefOr[TStamp] = js.undefined,
        ReplicationTaskIdentifier: js.UndefOr[String] = js.undefined,
        ReplicationTaskSettings: js.UndefOr[String] = js.undefined,
        ReplicationTaskStartDate: js.UndefOr[TStamp] = js.undefined,
        ReplicationTaskStats: js.UndefOr[ReplicationTaskStats] = js.undefined,
        SourceEndpointArn: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        StopReason: js.UndefOr[String] = js.undefined,
        TableMappings: js.UndefOr[String] = js.undefined,
        TargetEndpointArn: js.UndefOr[String] = js.undefined
    ): ReplicationTask = {
      val __obj = js.Dictionary.empty[js.Any]
      CdcStartPosition.foreach(__v => __obj.update("CdcStartPosition", __v.asInstanceOf[js.Any]))
      CdcStopPosition.foreach(__v => __obj.update("CdcStopPosition", __v.asInstanceOf[js.Any]))
      LastFailureMessage.foreach(__v => __obj.update("LastFailureMessage", __v.asInstanceOf[js.Any]))
      MigrationType.foreach(__v => __obj.update("MigrationType", __v.asInstanceOf[js.Any]))
      RecoveryCheckpoint.foreach(__v => __obj.update("RecoveryCheckpoint", __v.asInstanceOf[js.Any]))
      ReplicationInstanceArn.foreach(__v => __obj.update("ReplicationInstanceArn", __v.asInstanceOf[js.Any]))
      ReplicationTaskArn.foreach(__v => __obj.update("ReplicationTaskArn", __v.asInstanceOf[js.Any]))
      ReplicationTaskCreationDate.foreach(__v => __obj.update("ReplicationTaskCreationDate", __v.asInstanceOf[js.Any]))
      ReplicationTaskIdentifier.foreach(__v => __obj.update("ReplicationTaskIdentifier", __v.asInstanceOf[js.Any]))
      ReplicationTaskSettings.foreach(__v => __obj.update("ReplicationTaskSettings", __v.asInstanceOf[js.Any]))
      ReplicationTaskStartDate.foreach(__v => __obj.update("ReplicationTaskStartDate", __v.asInstanceOf[js.Any]))
      ReplicationTaskStats.foreach(__v => __obj.update("ReplicationTaskStats", __v.asInstanceOf[js.Any]))
      SourceEndpointArn.foreach(__v => __obj.update("SourceEndpointArn", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StopReason.foreach(__v => __obj.update("StopReason", __v.asInstanceOf[js.Any]))
      TableMappings.foreach(__v => __obj.update("TableMappings", __v.asInstanceOf[js.Any]))
      TargetEndpointArn.foreach(__v => __obj.update("TargetEndpointArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationTask]
    }
  }

  /**
    * The task assessment report in JSON format.
    */
  @js.native
  trait ReplicationTaskAssessmentResult extends js.Object {
    var AssessmentResults: js.UndefOr[String]
    var AssessmentResultsFile: js.UndefOr[String]
    var AssessmentStatus: js.UndefOr[String]
    var ReplicationTaskArn: js.UndefOr[String]
    var ReplicationTaskIdentifier: js.UndefOr[String]
    var ReplicationTaskLastAssessmentDate: js.UndefOr[TStamp]
    var S3ObjectUrl: js.UndefOr[String]
  }

  object ReplicationTaskAssessmentResult {
    def apply(
        AssessmentResults: js.UndefOr[String] = js.undefined,
        AssessmentResultsFile: js.UndefOr[String] = js.undefined,
        AssessmentStatus: js.UndefOr[String] = js.undefined,
        ReplicationTaskArn: js.UndefOr[String] = js.undefined,
        ReplicationTaskIdentifier: js.UndefOr[String] = js.undefined,
        ReplicationTaskLastAssessmentDate: js.UndefOr[TStamp] = js.undefined,
        S3ObjectUrl: js.UndefOr[String] = js.undefined
    ): ReplicationTaskAssessmentResult = {
      val __obj = js.Dictionary.empty[js.Any]
      AssessmentResults.foreach(__v => __obj.update("AssessmentResults", __v.asInstanceOf[js.Any]))
      AssessmentResultsFile.foreach(__v => __obj.update("AssessmentResultsFile", __v.asInstanceOf[js.Any]))
      AssessmentStatus.foreach(__v => __obj.update("AssessmentStatus", __v.asInstanceOf[js.Any]))
      ReplicationTaskArn.foreach(__v => __obj.update("ReplicationTaskArn", __v.asInstanceOf[js.Any]))
      ReplicationTaskIdentifier.foreach(__v => __obj.update("ReplicationTaskIdentifier", __v.asInstanceOf[js.Any]))
      ReplicationTaskLastAssessmentDate.foreach(
        __v => __obj.update("ReplicationTaskLastAssessmentDate", __v.asInstanceOf[js.Any])
      )
      S3ObjectUrl.foreach(__v => __obj.update("S3ObjectUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationTaskAssessmentResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ReplicationTaskStats extends js.Object {
    var ElapsedTimeMillis: js.UndefOr[Double]
    var FullLoadProgressPercent: js.UndefOr[Int]
    var TablesErrored: js.UndefOr[Int]
    var TablesLoaded: js.UndefOr[Int]
    var TablesLoading: js.UndefOr[Int]
    var TablesQueued: js.UndefOr[Int]
  }

  object ReplicationTaskStats {
    def apply(
        ElapsedTimeMillis: js.UndefOr[Double] = js.undefined,
        FullLoadProgressPercent: js.UndefOr[Int] = js.undefined,
        TablesErrored: js.UndefOr[Int] = js.undefined,
        TablesLoaded: js.UndefOr[Int] = js.undefined,
        TablesLoading: js.UndefOr[Int] = js.undefined,
        TablesQueued: js.UndefOr[Int] = js.undefined
    ): ReplicationTaskStats = {
      val __obj = js.Dictionary.empty[js.Any]
      ElapsedTimeMillis.foreach(__v => __obj.update("ElapsedTimeMillis", __v.asInstanceOf[js.Any]))
      FullLoadProgressPercent.foreach(__v => __obj.update("FullLoadProgressPercent", __v.asInstanceOf[js.Any]))
      TablesErrored.foreach(__v => __obj.update("TablesErrored", __v.asInstanceOf[js.Any]))
      TablesLoaded.foreach(__v => __obj.update("TablesLoaded", __v.asInstanceOf[js.Any]))
      TablesLoading.foreach(__v => __obj.update("TablesLoading", __v.asInstanceOf[js.Any]))
      TablesQueued.foreach(__v => __obj.update("TablesQueued", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationTaskStats]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ResourcePendingMaintenanceActions extends js.Object {
    var PendingMaintenanceActionDetails: js.UndefOr[PendingMaintenanceActionDetails]
    var ResourceIdentifier: js.UndefOr[String]
  }

  object ResourcePendingMaintenanceActions {
    def apply(
        PendingMaintenanceActionDetails: js.UndefOr[PendingMaintenanceActionDetails] = js.undefined,
        ResourceIdentifier: js.UndefOr[String] = js.undefined
    ): ResourcePendingMaintenanceActions = {
      val __obj = js.Dictionary.empty[js.Any]
      PendingMaintenanceActionDetails.foreach(
        __v => __obj.update("PendingMaintenanceActionDetails", __v.asInstanceOf[js.Any])
      )
      ResourceIdentifier.foreach(__v => __obj.update("ResourceIdentifier", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourcePendingMaintenanceActions]
    }
  }

  /**
    * Settings for exporting data to Amazon S3.
    */
  @js.native
  trait S3Settings extends js.Object {
    var BucketFolder: js.UndefOr[String]
    var BucketName: js.UndefOr[String]
    var CdcInsertsOnly: js.UndefOr[BooleanOptional]
    var CompressionType: js.UndefOr[CompressionTypeValue]
    var CsvDelimiter: js.UndefOr[String]
    var CsvRowDelimiter: js.UndefOr[String]
    var DataFormat: js.UndefOr[DataFormatValue]
    var DataPageSize: js.UndefOr[IntegerOptional]
    var DictPageSizeLimit: js.UndefOr[IntegerOptional]
    var EnableStatistics: js.UndefOr[BooleanOptional]
    var EncodingType: js.UndefOr[EncodingTypeValue]
    var EncryptionMode: js.UndefOr[EncryptionModeValue]
    var ExternalTableDefinition: js.UndefOr[String]
    var IncludeOpForFullLoad: js.UndefOr[BooleanOptional]
    var ParquetVersion: js.UndefOr[ParquetVersionValue]
    var RowGroupLength: js.UndefOr[IntegerOptional]
    var ServerSideEncryptionKmsKeyId: js.UndefOr[String]
    var ServiceAccessRoleArn: js.UndefOr[String]
    var TimestampColumnName: js.UndefOr[String]
  }

  object S3Settings {
    def apply(
        BucketFolder: js.UndefOr[String] = js.undefined,
        BucketName: js.UndefOr[String] = js.undefined,
        CdcInsertsOnly: js.UndefOr[BooleanOptional] = js.undefined,
        CompressionType: js.UndefOr[CompressionTypeValue] = js.undefined,
        CsvDelimiter: js.UndefOr[String] = js.undefined,
        CsvRowDelimiter: js.UndefOr[String] = js.undefined,
        DataFormat: js.UndefOr[DataFormatValue] = js.undefined,
        DataPageSize: js.UndefOr[IntegerOptional] = js.undefined,
        DictPageSizeLimit: js.UndefOr[IntegerOptional] = js.undefined,
        EnableStatistics: js.UndefOr[BooleanOptional] = js.undefined,
        EncodingType: js.UndefOr[EncodingTypeValue] = js.undefined,
        EncryptionMode: js.UndefOr[EncryptionModeValue] = js.undefined,
        ExternalTableDefinition: js.UndefOr[String] = js.undefined,
        IncludeOpForFullLoad: js.UndefOr[BooleanOptional] = js.undefined,
        ParquetVersion: js.UndefOr[ParquetVersionValue] = js.undefined,
        RowGroupLength: js.UndefOr[IntegerOptional] = js.undefined,
        ServerSideEncryptionKmsKeyId: js.UndefOr[String] = js.undefined,
        ServiceAccessRoleArn: js.UndefOr[String] = js.undefined,
        TimestampColumnName: js.UndefOr[String] = js.undefined
    ): S3Settings = {
      val __obj = js.Dictionary.empty[js.Any]
      BucketFolder.foreach(__v => __obj.update("BucketFolder", __v.asInstanceOf[js.Any]))
      BucketName.foreach(__v => __obj.update("BucketName", __v.asInstanceOf[js.Any]))
      CdcInsertsOnly.foreach(__v => __obj.update("CdcInsertsOnly", __v.asInstanceOf[js.Any]))
      CompressionType.foreach(__v => __obj.update("CompressionType", __v.asInstanceOf[js.Any]))
      CsvDelimiter.foreach(__v => __obj.update("CsvDelimiter", __v.asInstanceOf[js.Any]))
      CsvRowDelimiter.foreach(__v => __obj.update("CsvRowDelimiter", __v.asInstanceOf[js.Any]))
      DataFormat.foreach(__v => __obj.update("DataFormat", __v.asInstanceOf[js.Any]))
      DataPageSize.foreach(__v => __obj.update("DataPageSize", __v.asInstanceOf[js.Any]))
      DictPageSizeLimit.foreach(__v => __obj.update("DictPageSizeLimit", __v.asInstanceOf[js.Any]))
      EnableStatistics.foreach(__v => __obj.update("EnableStatistics", __v.asInstanceOf[js.Any]))
      EncodingType.foreach(__v => __obj.update("EncodingType", __v.asInstanceOf[js.Any]))
      EncryptionMode.foreach(__v => __obj.update("EncryptionMode", __v.asInstanceOf[js.Any]))
      ExternalTableDefinition.foreach(__v => __obj.update("ExternalTableDefinition", __v.asInstanceOf[js.Any]))
      IncludeOpForFullLoad.foreach(__v => __obj.update("IncludeOpForFullLoad", __v.asInstanceOf[js.Any]))
      ParquetVersion.foreach(__v => __obj.update("ParquetVersion", __v.asInstanceOf[js.Any]))
      RowGroupLength.foreach(__v => __obj.update("RowGroupLength", __v.asInstanceOf[js.Any]))
      ServerSideEncryptionKmsKeyId.foreach(
        __v => __obj.update("ServerSideEncryptionKmsKeyId", __v.asInstanceOf[js.Any])
      )
      ServiceAccessRoleArn.foreach(__v => __obj.update("ServiceAccessRoleArn", __v.asInstanceOf[js.Any]))
      TimestampColumnName.foreach(__v => __obj.update("TimestampColumnName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Settings]
    }
  }

  object SourceTypeEnum {
    val `replication-instance` = "replication-instance"

    val values = js.Object.freeze(js.Array(`replication-instance`))
  }

  /**
    * <p/>
    */
  @js.native
  trait StartReplicationTaskAssessmentMessage extends js.Object {
    var ReplicationTaskArn: String
  }

  object StartReplicationTaskAssessmentMessage {
    def apply(
        ReplicationTaskArn: String
    ): StartReplicationTaskAssessmentMessage = {
      val __obj = js.Dictionary[js.Any](
        "ReplicationTaskArn" -> ReplicationTaskArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartReplicationTaskAssessmentMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait StartReplicationTaskAssessmentResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  object StartReplicationTaskAssessmentResponse {
    def apply(
        ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
    ): StartReplicationTaskAssessmentResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationTask.foreach(__v => __obj.update("ReplicationTask", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartReplicationTaskAssessmentResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait StartReplicationTaskMessage extends js.Object {
    var ReplicationTaskArn: String
    var StartReplicationTaskType: StartReplicationTaskTypeValue
    var CdcStartPosition: js.UndefOr[String]
    var CdcStartTime: js.UndefOr[TStamp]
    var CdcStopPosition: js.UndefOr[String]
  }

  object StartReplicationTaskMessage {
    def apply(
        ReplicationTaskArn: String,
        StartReplicationTaskType: StartReplicationTaskTypeValue,
        CdcStartPosition: js.UndefOr[String] = js.undefined,
        CdcStartTime: js.UndefOr[TStamp] = js.undefined,
        CdcStopPosition: js.UndefOr[String] = js.undefined
    ): StartReplicationTaskMessage = {
      val __obj = js.Dictionary[js.Any](
        "ReplicationTaskArn"       -> ReplicationTaskArn.asInstanceOf[js.Any],
        "StartReplicationTaskType" -> StartReplicationTaskType.asInstanceOf[js.Any]
      )

      CdcStartPosition.foreach(__v => __obj.update("CdcStartPosition", __v.asInstanceOf[js.Any]))
      CdcStartTime.foreach(__v => __obj.update("CdcStartTime", __v.asInstanceOf[js.Any]))
      CdcStopPosition.foreach(__v => __obj.update("CdcStopPosition", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartReplicationTaskMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait StartReplicationTaskResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  object StartReplicationTaskResponse {
    def apply(
        ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
    ): StartReplicationTaskResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationTask.foreach(__v => __obj.update("ReplicationTask", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartReplicationTaskResponse]
    }
  }

  object StartReplicationTaskTypeValueEnum {
    val `start-replication` = "start-replication"
    val `resume-processing` = "resume-processing"
    val `reload-target`     = "reload-target"

    val values = js.Object.freeze(js.Array(`start-replication`, `resume-processing`, `reload-target`))
  }

  /**
    * <p/>
    */
  @js.native
  trait StopReplicationTaskMessage extends js.Object {
    var ReplicationTaskArn: String
  }

  object StopReplicationTaskMessage {
    def apply(
        ReplicationTaskArn: String
    ): StopReplicationTaskMessage = {
      val __obj = js.Dictionary[js.Any](
        "ReplicationTaskArn" -> ReplicationTaskArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopReplicationTaskMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait StopReplicationTaskResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  object StopReplicationTaskResponse {
    def apply(
        ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
    ): StopReplicationTaskResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationTask.foreach(__v => __obj.update("ReplicationTask", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopReplicationTaskResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait Subnet extends js.Object {
    var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone]
    var SubnetIdentifier: js.UndefOr[String]
    var SubnetStatus: js.UndefOr[String]
  }

  object Subnet {
    def apply(
        SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
        SubnetIdentifier: js.UndefOr[String] = js.undefined,
        SubnetStatus: js.UndefOr[String] = js.undefined
    ): Subnet = {
      val __obj = js.Dictionary.empty[js.Any]
      SubnetAvailabilityZone.foreach(__v => __obj.update("SubnetAvailabilityZone", __v.asInstanceOf[js.Any]))
      SubnetIdentifier.foreach(__v => __obj.update("SubnetIdentifier", __v.asInstanceOf[js.Any]))
      SubnetStatus.foreach(__v => __obj.update("SubnetStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Subnet]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait SupportedEndpointType extends js.Object {
    var EndpointType: js.UndefOr[ReplicationEndpointTypeValue]
    var EngineDisplayName: js.UndefOr[String]
    var EngineName: js.UndefOr[String]
    var SupportsCDC: js.UndefOr[Boolean]
  }

  object SupportedEndpointType {
    def apply(
        EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.undefined,
        EngineDisplayName: js.UndefOr[String] = js.undefined,
        EngineName: js.UndefOr[String] = js.undefined,
        SupportsCDC: js.UndefOr[Boolean] = js.undefined
    ): SupportedEndpointType = {
      val __obj = js.Dictionary.empty[js.Any]
      EndpointType.foreach(__v => __obj.update("EndpointType", __v.asInstanceOf[js.Any]))
      EngineDisplayName.foreach(__v => __obj.update("EngineDisplayName", __v.asInstanceOf[js.Any]))
      EngineName.foreach(__v => __obj.update("EngineName", __v.asInstanceOf[js.Any]))
      SupportsCDC.foreach(__v => __obj.update("SupportsCDC", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SupportedEndpointType]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait TableStatistics extends js.Object {
    var Ddls: js.UndefOr[Double]
    var Deletes: js.UndefOr[Double]
    var FullLoadCondtnlChkFailedRows: js.UndefOr[Double]
    var FullLoadErrorRows: js.UndefOr[Double]
    var FullLoadRows: js.UndefOr[Double]
    var Inserts: js.UndefOr[Double]
    var LastUpdateTime: js.UndefOr[TStamp]
    var SchemaName: js.UndefOr[String]
    var TableName: js.UndefOr[String]
    var TableState: js.UndefOr[String]
    var Updates: js.UndefOr[Double]
    var ValidationFailedRecords: js.UndefOr[Double]
    var ValidationPendingRecords: js.UndefOr[Double]
    var ValidationState: js.UndefOr[String]
    var ValidationStateDetails: js.UndefOr[String]
    var ValidationSuspendedRecords: js.UndefOr[Double]
  }

  object TableStatistics {
    def apply(
        Ddls: js.UndefOr[Double] = js.undefined,
        Deletes: js.UndefOr[Double] = js.undefined,
        FullLoadCondtnlChkFailedRows: js.UndefOr[Double] = js.undefined,
        FullLoadErrorRows: js.UndefOr[Double] = js.undefined,
        FullLoadRows: js.UndefOr[Double] = js.undefined,
        Inserts: js.UndefOr[Double] = js.undefined,
        LastUpdateTime: js.UndefOr[TStamp] = js.undefined,
        SchemaName: js.UndefOr[String] = js.undefined,
        TableName: js.UndefOr[String] = js.undefined,
        TableState: js.UndefOr[String] = js.undefined,
        Updates: js.UndefOr[Double] = js.undefined,
        ValidationFailedRecords: js.UndefOr[Double] = js.undefined,
        ValidationPendingRecords: js.UndefOr[Double] = js.undefined,
        ValidationState: js.UndefOr[String] = js.undefined,
        ValidationStateDetails: js.UndefOr[String] = js.undefined,
        ValidationSuspendedRecords: js.UndefOr[Double] = js.undefined
    ): TableStatistics = {
      val __obj = js.Dictionary.empty[js.Any]
      Ddls.foreach(__v => __obj.update("Ddls", __v.asInstanceOf[js.Any]))
      Deletes.foreach(__v => __obj.update("Deletes", __v.asInstanceOf[js.Any]))
      FullLoadCondtnlChkFailedRows.foreach(
        __v => __obj.update("FullLoadCondtnlChkFailedRows", __v.asInstanceOf[js.Any])
      )
      FullLoadErrorRows.foreach(__v => __obj.update("FullLoadErrorRows", __v.asInstanceOf[js.Any]))
      FullLoadRows.foreach(__v => __obj.update("FullLoadRows", __v.asInstanceOf[js.Any]))
      Inserts.foreach(__v => __obj.update("Inserts", __v.asInstanceOf[js.Any]))
      LastUpdateTime.foreach(__v => __obj.update("LastUpdateTime", __v.asInstanceOf[js.Any]))
      SchemaName.foreach(__v => __obj.update("SchemaName", __v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.update("TableName", __v.asInstanceOf[js.Any]))
      TableState.foreach(__v => __obj.update("TableState", __v.asInstanceOf[js.Any]))
      Updates.foreach(__v => __obj.update("Updates", __v.asInstanceOf[js.Any]))
      ValidationFailedRecords.foreach(__v => __obj.update("ValidationFailedRecords", __v.asInstanceOf[js.Any]))
      ValidationPendingRecords.foreach(__v => __obj.update("ValidationPendingRecords", __v.asInstanceOf[js.Any]))
      ValidationState.foreach(__v => __obj.update("ValidationState", __v.asInstanceOf[js.Any]))
      ValidationStateDetails.foreach(__v => __obj.update("ValidationStateDetails", __v.asInstanceOf[js.Any]))
      ValidationSuspendedRecords.foreach(__v => __obj.update("ValidationSuspendedRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableStatistics]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait TableToReload extends js.Object {
    var SchemaName: js.UndefOr[String]
    var TableName: js.UndefOr[String]
  }

  object TableToReload {
    def apply(
        SchemaName: js.UndefOr[String] = js.undefined,
        TableName: js.UndefOr[String] = js.undefined
    ): TableToReload = {
      val __obj = js.Dictionary.empty[js.Any]
      SchemaName.foreach(__v => __obj.update("SchemaName", __v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.update("TableName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableToReload]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Tag {
    def apply(
        Key: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): Tag = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait TestConnectionMessage extends js.Object {
    var EndpointArn: String
    var ReplicationInstanceArn: String
  }

  object TestConnectionMessage {
    def apply(
        EndpointArn: String,
        ReplicationInstanceArn: String
    ): TestConnectionMessage = {
      val __obj = js.Dictionary[js.Any](
        "EndpointArn"            -> EndpointArn.asInstanceOf[js.Any],
        "ReplicationInstanceArn" -> ReplicationInstanceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TestConnectionMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait TestConnectionResponse extends js.Object {
    var Connection: js.UndefOr[Connection]
  }

  object TestConnectionResponse {
    def apply(
        Connection: js.UndefOr[Connection] = js.undefined
    ): TestConnectionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Connection.foreach(__v => __obj.update("Connection", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestConnectionResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait VpcSecurityGroupMembership extends js.Object {
    var Status: js.UndefOr[String]
    var VpcSecurityGroupId: js.UndefOr[String]
  }

  object VpcSecurityGroupMembership {
    def apply(
        Status: js.UndefOr[String] = js.undefined,
        VpcSecurityGroupId: js.UndefOr[String] = js.undefined
    ): VpcSecurityGroupMembership = {
      val __obj = js.Dictionary.empty[js.Any]
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      VpcSecurityGroupId.foreach(__v => __obj.update("VpcSecurityGroupId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcSecurityGroupMembership]
    }
  }
}
