package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object cloudwatchlogs {
  type AccessPolicy                = String
  type Arn                         = String
  type Days                        = Int
  type DefaultValue                = Double
  type Descending                  = Boolean
  type DescribeLimit               = Int
  type DescribeQueriesMaxResults   = Int
  type DestinationArn              = String
  type DestinationName             = String
  type Destinations                = js.Array[Destination]
  type Distribution                = String
  type EventId                     = String
  type EventMessage                = String
  type EventNumber                 = Double
  type EventsLimit                 = Int
  type ExportDestinationBucket     = String
  type ExportDestinationPrefix     = String
  type ExportTaskId                = String
  type ExportTaskName              = String
  type ExportTaskStatusCode        = String
  type ExportTaskStatusMessage     = String
  type ExportTasks                 = js.Array[ExportTask]
  type ExtractedValues             = js.Dictionary[Value]
  type Field                       = String
  type FilterCount                 = Int
  type FilterName                  = String
  type FilterPattern               = String
  type FilteredLogEvents           = js.Array[FilteredLogEvent]
  type InputLogEvents              = js.Array[InputLogEvent]
  type InputLogStreamNames         = js.Array[LogStreamName]
  type Interleaved                 = Boolean
  type KmsKeyId                    = String
  type LogEventIndex               = Int
  type LogGroupFieldList           = js.Array[LogGroupField]
  type LogGroupName                = String
  type LogGroups                   = js.Array[LogGroup]
  type LogRecord                   = js.Dictionary[Value]
  type LogRecordPointer            = String
  type LogStreamName               = String
  type LogStreamSearchedCompletely = Boolean
  type LogStreams                  = js.Array[LogStream]
  type MetricFilterMatches         = js.Array[MetricFilterMatchRecord]
  type MetricFilters               = js.Array[MetricFilter]
  type MetricName                  = String
  type MetricNamespace             = String
  type MetricTransformations       = js.Array[MetricTransformation]
  type MetricValue                 = String
  type NextToken                   = String
  type OrderBy                     = String
  type OutputLogEvents             = js.Array[OutputLogEvent]
  type Percentage                  = Int
  type PolicyDocument              = String
  type PolicyName                  = String
  type QueryId                     = String
  type QueryInfoList               = js.Array[QueryInfo]
  type QueryResults                = js.Array[ResultRows]
  type QueryStatus                 = String
  type QueryString                 = String
  type ResourcePolicies            = js.Array[ResourcePolicy]
  type ResultRows                  = js.Array[ResultField]
  type RoleArn                     = String
  type SearchedLogStreams          = js.Array[SearchedLogStream]
  type SequenceToken               = String
  type StartFromHead               = Boolean
  type StatsValue                  = Double
  type StoredBytes                 = Double
  type SubscriptionFilters         = js.Array[SubscriptionFilter]
  type Success                     = Boolean
  type TagKey                      = String
  type TagList                     = js.Array[TagKey]
  type TagValue                    = String
  type Tags                        = js.Dictionary[TagValue]
  type TargetArn                   = String
  type TestEventMessages           = js.Array[EventMessage]
  type Timestamp                   = Double
  type Token                       = String
  type Value                       = String

  implicit final class CloudWatchLogsOps(val service: CloudWatchLogs) extends AnyVal {

    def associateKmsKeyFuture(params: AssociateKmsKeyRequest): Future[js.Object] =
      service.associateKmsKey(params).promise.toFuture
    def cancelExportTaskFuture(params: CancelExportTaskRequest): Future[js.Object] =
      service.cancelExportTask(params).promise.toFuture
    def createExportTaskFuture(params: CreateExportTaskRequest): Future[CreateExportTaskResponse] =
      service.createExportTask(params).promise.toFuture
    def createLogGroupFuture(params: CreateLogGroupRequest): Future[js.Object] =
      service.createLogGroup(params).promise.toFuture
    def createLogStreamFuture(params: CreateLogStreamRequest): Future[js.Object] =
      service.createLogStream(params).promise.toFuture
    def deleteDestinationFuture(params: DeleteDestinationRequest): Future[js.Object] =
      service.deleteDestination(params).promise.toFuture
    def deleteLogGroupFuture(params: DeleteLogGroupRequest): Future[js.Object] =
      service.deleteLogGroup(params).promise.toFuture
    def deleteLogStreamFuture(params: DeleteLogStreamRequest): Future[js.Object] =
      service.deleteLogStream(params).promise.toFuture
    def deleteMetricFilterFuture(params: DeleteMetricFilterRequest): Future[js.Object] =
      service.deleteMetricFilter(params).promise.toFuture
    def deleteResourcePolicyFuture(params: DeleteResourcePolicyRequest): Future[js.Object] =
      service.deleteResourcePolicy(params).promise.toFuture
    def deleteRetentionPolicyFuture(params: DeleteRetentionPolicyRequest): Future[js.Object] =
      service.deleteRetentionPolicy(params).promise.toFuture
    def deleteSubscriptionFilterFuture(params: DeleteSubscriptionFilterRequest): Future[js.Object] =
      service.deleteSubscriptionFilter(params).promise.toFuture
    def describeDestinationsFuture(params: DescribeDestinationsRequest): Future[DescribeDestinationsResponse] =
      service.describeDestinations(params).promise.toFuture
    def describeExportTasksFuture(params: DescribeExportTasksRequest): Future[DescribeExportTasksResponse] =
      service.describeExportTasks(params).promise.toFuture
    def describeLogGroupsFuture(params: DescribeLogGroupsRequest): Future[DescribeLogGroupsResponse] =
      service.describeLogGroups(params).promise.toFuture
    def describeLogStreamsFuture(params: DescribeLogStreamsRequest): Future[DescribeLogStreamsResponse] =
      service.describeLogStreams(params).promise.toFuture
    def describeMetricFiltersFuture(params: DescribeMetricFiltersRequest): Future[DescribeMetricFiltersResponse] =
      service.describeMetricFilters(params).promise.toFuture
    def describeQueriesFuture(params: DescribeQueriesRequest): Future[DescribeQueriesResponse] =
      service.describeQueries(params).promise.toFuture
    def describeResourcePoliciesFuture(
        params: DescribeResourcePoliciesRequest
    ): Future[DescribeResourcePoliciesResponse] = service.describeResourcePolicies(params).promise.toFuture
    def describeSubscriptionFiltersFuture(
        params: DescribeSubscriptionFiltersRequest
    ): Future[DescribeSubscriptionFiltersResponse] = service.describeSubscriptionFilters(params).promise.toFuture
    def disassociateKmsKeyFuture(params: DisassociateKmsKeyRequest): Future[js.Object] =
      service.disassociateKmsKey(params).promise.toFuture
    def filterLogEventsFuture(params: FilterLogEventsRequest): Future[FilterLogEventsResponse] =
      service.filterLogEvents(params).promise.toFuture
    def getLogEventsFuture(params: GetLogEventsRequest): Future[GetLogEventsResponse] =
      service.getLogEvents(params).promise.toFuture
    def getLogGroupFieldsFuture(params: GetLogGroupFieldsRequest): Future[GetLogGroupFieldsResponse] =
      service.getLogGroupFields(params).promise.toFuture
    def getLogRecordFuture(params: GetLogRecordRequest): Future[GetLogRecordResponse] =
      service.getLogRecord(params).promise.toFuture
    def getQueryResultsFuture(params: GetQueryResultsRequest): Future[GetQueryResultsResponse] =
      service.getQueryResults(params).promise.toFuture
    def listTagsLogGroupFuture(params: ListTagsLogGroupRequest): Future[ListTagsLogGroupResponse] =
      service.listTagsLogGroup(params).promise.toFuture
    def putDestinationFuture(params: PutDestinationRequest): Future[PutDestinationResponse] =
      service.putDestination(params).promise.toFuture
    def putDestinationPolicyFuture(params: PutDestinationPolicyRequest): Future[js.Object] =
      service.putDestinationPolicy(params).promise.toFuture
    def putLogEventsFuture(params: PutLogEventsRequest): Future[PutLogEventsResponse] =
      service.putLogEvents(params).promise.toFuture
    def putMetricFilterFuture(params: PutMetricFilterRequest): Future[js.Object] =
      service.putMetricFilter(params).promise.toFuture
    def putResourcePolicyFuture(params: PutResourcePolicyRequest): Future[PutResourcePolicyResponse] =
      service.putResourcePolicy(params).promise.toFuture
    def putRetentionPolicyFuture(params: PutRetentionPolicyRequest): Future[js.Object] =
      service.putRetentionPolicy(params).promise.toFuture
    def putSubscriptionFilterFuture(params: PutSubscriptionFilterRequest): Future[js.Object] =
      service.putSubscriptionFilter(params).promise.toFuture
    def startQueryFuture(params: StartQueryRequest): Future[StartQueryResponse] =
      service.startQuery(params).promise.toFuture
    def stopQueryFuture(params: StopQueryRequest): Future[StopQueryResponse] =
      service.stopQuery(params).promise.toFuture
    def tagLogGroupFuture(params: TagLogGroupRequest): Future[js.Object] = service.tagLogGroup(params).promise.toFuture
    def testMetricFilterFuture(params: TestMetricFilterRequest): Future[TestMetricFilterResponse] =
      service.testMetricFilter(params).promise.toFuture
    def untagLogGroupFuture(params: UntagLogGroupRequest): Future[js.Object] =
      service.untagLogGroup(params).promise.toFuture
  }
}

package cloudwatchlogs {
  @js.native
  @JSImport("aws-sdk", "CloudWatchLogs")
  class CloudWatchLogs() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateKmsKey(params: AssociateKmsKeyRequest): Request[js.Object]                                 = js.native
    def cancelExportTask(params: CancelExportTaskRequest): Request[js.Object]                               = js.native
    def createExportTask(params: CreateExportTaskRequest): Request[CreateExportTaskResponse]                = js.native
    def createLogGroup(params: CreateLogGroupRequest): Request[js.Object]                                   = js.native
    def createLogStream(params: CreateLogStreamRequest): Request[js.Object]                                 = js.native
    def deleteDestination(params: DeleteDestinationRequest): Request[js.Object]                             = js.native
    def deleteLogGroup(params: DeleteLogGroupRequest): Request[js.Object]                                   = js.native
    def deleteLogStream(params: DeleteLogStreamRequest): Request[js.Object]                                 = js.native
    def deleteMetricFilter(params: DeleteMetricFilterRequest): Request[js.Object]                           = js.native
    def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[js.Object]                       = js.native
    def deleteRetentionPolicy(params: DeleteRetentionPolicyRequest): Request[js.Object]                     = js.native
    def deleteSubscriptionFilter(params: DeleteSubscriptionFilterRequest): Request[js.Object]               = js.native
    def describeDestinations(params: DescribeDestinationsRequest): Request[DescribeDestinationsResponse]    = js.native
    def describeExportTasks(params: DescribeExportTasksRequest): Request[DescribeExportTasksResponse]       = js.native
    def describeLogGroups(params: DescribeLogGroupsRequest): Request[DescribeLogGroupsResponse]             = js.native
    def describeLogStreams(params: DescribeLogStreamsRequest): Request[DescribeLogStreamsResponse]          = js.native
    def describeMetricFilters(params: DescribeMetricFiltersRequest): Request[DescribeMetricFiltersResponse] = js.native
    def describeQueries(params: DescribeQueriesRequest): Request[DescribeQueriesResponse]                   = js.native
    def describeResourcePolicies(params: DescribeResourcePoliciesRequest): Request[DescribeResourcePoliciesResponse] =
      js.native
    def describeSubscriptionFilters(
        params: DescribeSubscriptionFiltersRequest
    ): Request[DescribeSubscriptionFiltersResponse]                                             = js.native
    def disassociateKmsKey(params: DisassociateKmsKeyRequest): Request[js.Object]               = js.native
    def filterLogEvents(params: FilterLogEventsRequest): Request[FilterLogEventsResponse]       = js.native
    def getLogEvents(params: GetLogEventsRequest): Request[GetLogEventsResponse]                = js.native
    def getLogGroupFields(params: GetLogGroupFieldsRequest): Request[GetLogGroupFieldsResponse] = js.native
    def getLogRecord(params: GetLogRecordRequest): Request[GetLogRecordResponse]                = js.native
    def getQueryResults(params: GetQueryResultsRequest): Request[GetQueryResultsResponse]       = js.native
    def listTagsLogGroup(params: ListTagsLogGroupRequest): Request[ListTagsLogGroupResponse]    = js.native
    def putDestination(params: PutDestinationRequest): Request[PutDestinationResponse]          = js.native
    def putDestinationPolicy(params: PutDestinationPolicyRequest): Request[js.Object]           = js.native
    def putLogEvents(params: PutLogEventsRequest): Request[PutLogEventsResponse]                = js.native
    def putMetricFilter(params: PutMetricFilterRequest): Request[js.Object]                     = js.native
    def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse] = js.native
    def putRetentionPolicy(params: PutRetentionPolicyRequest): Request[js.Object]               = js.native
    def putSubscriptionFilter(params: PutSubscriptionFilterRequest): Request[js.Object]         = js.native
    def startQuery(params: StartQueryRequest): Request[StartQueryResponse]                      = js.native
    def stopQuery(params: StopQueryRequest): Request[StopQueryResponse]                         = js.native
    def tagLogGroup(params: TagLogGroupRequest): Request[js.Object]                             = js.native
    def testMetricFilter(params: TestMetricFilterRequest): Request[TestMetricFilterResponse]    = js.native
    def untagLogGroup(params: UntagLogGroupRequest): Request[js.Object]                         = js.native
  }

  @js.native
  trait AssociateKmsKeyRequest extends js.Object {
    var kmsKeyId: KmsKeyId
    var logGroupName: LogGroupName
  }

  object AssociateKmsKeyRequest {
    def apply(
        kmsKeyId: KmsKeyId,
        logGroupName: LogGroupName
    ): AssociateKmsKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "kmsKeyId"     -> kmsKeyId.asInstanceOf[js.Any],
        "logGroupName" -> logGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateKmsKeyRequest]
    }
  }

  @js.native
  trait CancelExportTaskRequest extends js.Object {
    var taskId: ExportTaskId
  }

  object CancelExportTaskRequest {
    def apply(
        taskId: ExportTaskId
    ): CancelExportTaskRequest = {
      val __obj = js.Dictionary[js.Any](
        "taskId" -> taskId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelExportTaskRequest]
    }
  }

  @js.native
  trait CreateExportTaskRequest extends js.Object {
    var destination: ExportDestinationBucket
    var from: Timestamp
    var logGroupName: LogGroupName
    var to: Timestamp
    var destinationPrefix: js.UndefOr[ExportDestinationPrefix]
    var logStreamNamePrefix: js.UndefOr[LogStreamName]
    var taskName: js.UndefOr[ExportTaskName]
  }

  object CreateExportTaskRequest {
    def apply(
        destination: ExportDestinationBucket,
        from: Timestamp,
        logGroupName: LogGroupName,
        to: Timestamp,
        destinationPrefix: js.UndefOr[ExportDestinationPrefix] = js.undefined,
        logStreamNamePrefix: js.UndefOr[LogStreamName] = js.undefined,
        taskName: js.UndefOr[ExportTaskName] = js.undefined
    ): CreateExportTaskRequest = {
      val __obj = js.Dictionary[js.Any](
        "destination"  -> destination.asInstanceOf[js.Any],
        "from"         -> from.asInstanceOf[js.Any],
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "to"           -> to.asInstanceOf[js.Any]
      )

      destinationPrefix.foreach(__v => __obj.update("destinationPrefix", __v.asInstanceOf[js.Any]))
      logStreamNamePrefix.foreach(__v => __obj.update("logStreamNamePrefix", __v.asInstanceOf[js.Any]))
      taskName.foreach(__v => __obj.update("taskName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateExportTaskRequest]
    }
  }

  @js.native
  trait CreateExportTaskResponse extends js.Object {
    var taskId: js.UndefOr[ExportTaskId]
  }

  object CreateExportTaskResponse {
    def apply(
        taskId: js.UndefOr[ExportTaskId] = js.undefined
    ): CreateExportTaskResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      taskId.foreach(__v => __obj.update("taskId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateExportTaskResponse]
    }
  }

  @js.native
  trait CreateLogGroupRequest extends js.Object {
    var logGroupName: LogGroupName
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var tags: js.UndefOr[Tags]
  }

  object CreateLogGroupRequest {
    def apply(
        logGroupName: LogGroupName,
        kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateLogGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any]
      )

      kmsKeyId.foreach(__v => __obj.update("kmsKeyId", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLogGroupRequest]
    }
  }

  @js.native
  trait CreateLogStreamRequest extends js.Object {
    var logGroupName: LogGroupName
    var logStreamName: LogStreamName
  }

  object CreateLogStreamRequest {
    def apply(
        logGroupName: LogGroupName,
        logStreamName: LogStreamName
    ): CreateLogStreamRequest = {
      val __obj = js.Dictionary[js.Any](
        "logGroupName"  -> logGroupName.asInstanceOf[js.Any],
        "logStreamName" -> logStreamName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateLogStreamRequest]
    }
  }

  @js.native
  trait DeleteDestinationRequest extends js.Object {
    var destinationName: DestinationName
  }

  object DeleteDestinationRequest {
    def apply(
        destinationName: DestinationName
    ): DeleteDestinationRequest = {
      val __obj = js.Dictionary[js.Any](
        "destinationName" -> destinationName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDestinationRequest]
    }
  }

  @js.native
  trait DeleteLogGroupRequest extends js.Object {
    var logGroupName: LogGroupName
  }

  object DeleteLogGroupRequest {
    def apply(
        logGroupName: LogGroupName
    ): DeleteLogGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteLogGroupRequest]
    }
  }

  @js.native
  trait DeleteLogStreamRequest extends js.Object {
    var logGroupName: LogGroupName
    var logStreamName: LogStreamName
  }

  object DeleteLogStreamRequest {
    def apply(
        logGroupName: LogGroupName,
        logStreamName: LogStreamName
    ): DeleteLogStreamRequest = {
      val __obj = js.Dictionary[js.Any](
        "logGroupName"  -> logGroupName.asInstanceOf[js.Any],
        "logStreamName" -> logStreamName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteLogStreamRequest]
    }
  }

  @js.native
  trait DeleteMetricFilterRequest extends js.Object {
    var filterName: FilterName
    var logGroupName: LogGroupName
  }

  object DeleteMetricFilterRequest {
    def apply(
        filterName: FilterName,
        logGroupName: LogGroupName
    ): DeleteMetricFilterRequest = {
      val __obj = js.Dictionary[js.Any](
        "filterName"   -> filterName.asInstanceOf[js.Any],
        "logGroupName" -> logGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteMetricFilterRequest]
    }
  }

  @js.native
  trait DeleteResourcePolicyRequest extends js.Object {
    var policyName: js.UndefOr[PolicyName]
  }

  object DeleteResourcePolicyRequest {
    def apply(
        policyName: js.UndefOr[PolicyName] = js.undefined
    ): DeleteResourcePolicyRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      policyName.foreach(__v => __obj.update("policyName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteResourcePolicyRequest]
    }
  }

  @js.native
  trait DeleteRetentionPolicyRequest extends js.Object {
    var logGroupName: LogGroupName
  }

  object DeleteRetentionPolicyRequest {
    def apply(
        logGroupName: LogGroupName
    ): DeleteRetentionPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRetentionPolicyRequest]
    }
  }

  @js.native
  trait DeleteSubscriptionFilterRequest extends js.Object {
    var filterName: FilterName
    var logGroupName: LogGroupName
  }

  object DeleteSubscriptionFilterRequest {
    def apply(
        filterName: FilterName,
        logGroupName: LogGroupName
    ): DeleteSubscriptionFilterRequest = {
      val __obj = js.Dictionary[js.Any](
        "filterName"   -> filterName.asInstanceOf[js.Any],
        "logGroupName" -> logGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSubscriptionFilterRequest]
    }
  }

  @js.native
  trait DescribeDestinationsRequest extends js.Object {
    var DestinationNamePrefix: js.UndefOr[DestinationName]
    var limit: js.UndefOr[DescribeLimit]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeDestinationsRequest {
    def apply(
        DestinationNamePrefix: js.UndefOr[DestinationName] = js.undefined,
        limit: js.UndefOr[DescribeLimit] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeDestinationsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      DestinationNamePrefix.foreach(__v => __obj.update("DestinationNamePrefix", __v.asInstanceOf[js.Any]))
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDestinationsRequest]
    }
  }

  @js.native
  trait DescribeDestinationsResponse extends js.Object {
    var destinations: js.UndefOr[Destinations]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeDestinationsResponse {
    def apply(
        destinations: js.UndefOr[Destinations] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeDestinationsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      destinations.foreach(__v => __obj.update("destinations", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDestinationsResponse]
    }
  }

  @js.native
  trait DescribeExportTasksRequest extends js.Object {
    var limit: js.UndefOr[DescribeLimit]
    var nextToken: js.UndefOr[NextToken]
    var statusCode: js.UndefOr[ExportTaskStatusCode]
    var taskId: js.UndefOr[ExportTaskId]
  }

  object DescribeExportTasksRequest {
    def apply(
        limit: js.UndefOr[DescribeLimit] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        statusCode: js.UndefOr[ExportTaskStatusCode] = js.undefined,
        taskId: js.UndefOr[ExportTaskId] = js.undefined
    ): DescribeExportTasksRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      statusCode.foreach(__v => __obj.update("statusCode", __v.asInstanceOf[js.Any]))
      taskId.foreach(__v => __obj.update("taskId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeExportTasksRequest]
    }
  }

  @js.native
  trait DescribeExportTasksResponse extends js.Object {
    var exportTasks: js.UndefOr[ExportTasks]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeExportTasksResponse {
    def apply(
        exportTasks: js.UndefOr[ExportTasks] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeExportTasksResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      exportTasks.foreach(__v => __obj.update("exportTasks", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeExportTasksResponse]
    }
  }

  @js.native
  trait DescribeLogGroupsRequest extends js.Object {
    var limit: js.UndefOr[DescribeLimit]
    var logGroupNamePrefix: js.UndefOr[LogGroupName]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeLogGroupsRequest {
    def apply(
        limit: js.UndefOr[DescribeLimit] = js.undefined,
        logGroupNamePrefix: js.UndefOr[LogGroupName] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeLogGroupsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      logGroupNamePrefix.foreach(__v => __obj.update("logGroupNamePrefix", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLogGroupsRequest]
    }
  }

  @js.native
  trait DescribeLogGroupsResponse extends js.Object {
    var logGroups: js.UndefOr[LogGroups]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeLogGroupsResponse {
    def apply(
        logGroups: js.UndefOr[LogGroups] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeLogGroupsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      logGroups.foreach(__v => __obj.update("logGroups", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLogGroupsResponse]
    }
  }

  @js.native
  trait DescribeLogStreamsRequest extends js.Object {
    var logGroupName: LogGroupName
    var descending: js.UndefOr[Descending]
    var limit: js.UndefOr[DescribeLimit]
    var logStreamNamePrefix: js.UndefOr[LogStreamName]
    var nextToken: js.UndefOr[NextToken]
    var orderBy: js.UndefOr[OrderBy]
  }

  object DescribeLogStreamsRequest {
    def apply(
        logGroupName: LogGroupName,
        descending: js.UndefOr[Descending] = js.undefined,
        limit: js.UndefOr[DescribeLimit] = js.undefined,
        logStreamNamePrefix: js.UndefOr[LogStreamName] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        orderBy: js.UndefOr[OrderBy] = js.undefined
    ): DescribeLogStreamsRequest = {
      val __obj = js.Dictionary[js.Any](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any]
      )

      descending.foreach(__v => __obj.update("descending", __v.asInstanceOf[js.Any]))
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      logStreamNamePrefix.foreach(__v => __obj.update("logStreamNamePrefix", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      orderBy.foreach(__v => __obj.update("orderBy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLogStreamsRequest]
    }
  }

  @js.native
  trait DescribeLogStreamsResponse extends js.Object {
    var logStreams: js.UndefOr[LogStreams]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeLogStreamsResponse {
    def apply(
        logStreams: js.UndefOr[LogStreams] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeLogStreamsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      logStreams.foreach(__v => __obj.update("logStreams", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLogStreamsResponse]
    }
  }

  @js.native
  trait DescribeMetricFiltersRequest extends js.Object {
    var filterNamePrefix: js.UndefOr[FilterName]
    var limit: js.UndefOr[DescribeLimit]
    var logGroupName: js.UndefOr[LogGroupName]
    var metricName: js.UndefOr[MetricName]
    var metricNamespace: js.UndefOr[MetricNamespace]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeMetricFiltersRequest {
    def apply(
        filterNamePrefix: js.UndefOr[FilterName] = js.undefined,
        limit: js.UndefOr[DescribeLimit] = js.undefined,
        logGroupName: js.UndefOr[LogGroupName] = js.undefined,
        metricName: js.UndefOr[MetricName] = js.undefined,
        metricNamespace: js.UndefOr[MetricNamespace] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMetricFiltersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      filterNamePrefix.foreach(__v => __obj.update("filterNamePrefix", __v.asInstanceOf[js.Any]))
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      logGroupName.foreach(__v => __obj.update("logGroupName", __v.asInstanceOf[js.Any]))
      metricName.foreach(__v => __obj.update("metricName", __v.asInstanceOf[js.Any]))
      metricNamespace.foreach(__v => __obj.update("metricNamespace", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMetricFiltersRequest]
    }
  }

  @js.native
  trait DescribeMetricFiltersResponse extends js.Object {
    var metricFilters: js.UndefOr[MetricFilters]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeMetricFiltersResponse {
    def apply(
        metricFilters: js.UndefOr[MetricFilters] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMetricFiltersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      metricFilters.foreach(__v => __obj.update("metricFilters", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMetricFiltersResponse]
    }
  }

  @js.native
  trait DescribeQueriesRequest extends js.Object {
    var logGroupName: js.UndefOr[LogGroupName]
    var maxResults: js.UndefOr[DescribeQueriesMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var status: js.UndefOr[QueryStatus]
  }

  object DescribeQueriesRequest {
    def apply(
        logGroupName: js.UndefOr[LogGroupName] = js.undefined,
        maxResults: js.UndefOr[DescribeQueriesMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        status: js.UndefOr[QueryStatus] = js.undefined
    ): DescribeQueriesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      logGroupName.foreach(__v => __obj.update("logGroupName", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeQueriesRequest]
    }
  }

  @js.native
  trait DescribeQueriesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var queries: js.UndefOr[QueryInfoList]
  }

  object DescribeQueriesResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        queries: js.UndefOr[QueryInfoList] = js.undefined
    ): DescribeQueriesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      queries.foreach(__v => __obj.update("queries", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeQueriesResponse]
    }
  }

  @js.native
  trait DescribeResourcePoliciesRequest extends js.Object {
    var limit: js.UndefOr[DescribeLimit]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeResourcePoliciesRequest {
    def apply(
        limit: js.UndefOr[DescribeLimit] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeResourcePoliciesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeResourcePoliciesRequest]
    }
  }

  @js.native
  trait DescribeResourcePoliciesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var resourcePolicies: js.UndefOr[ResourcePolicies]
  }

  object DescribeResourcePoliciesResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        resourcePolicies: js.UndefOr[ResourcePolicies] = js.undefined
    ): DescribeResourcePoliciesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      resourcePolicies.foreach(__v => __obj.update("resourcePolicies", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeResourcePoliciesResponse]
    }
  }

  @js.native
  trait DescribeSubscriptionFiltersRequest extends js.Object {
    var logGroupName: LogGroupName
    var filterNamePrefix: js.UndefOr[FilterName]
    var limit: js.UndefOr[DescribeLimit]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeSubscriptionFiltersRequest {
    def apply(
        logGroupName: LogGroupName,
        filterNamePrefix: js.UndefOr[FilterName] = js.undefined,
        limit: js.UndefOr[DescribeLimit] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeSubscriptionFiltersRequest = {
      val __obj = js.Dictionary[js.Any](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any]
      )

      filterNamePrefix.foreach(__v => __obj.update("filterNamePrefix", __v.asInstanceOf[js.Any]))
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSubscriptionFiltersRequest]
    }
  }

  @js.native
  trait DescribeSubscriptionFiltersResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var subscriptionFilters: js.UndefOr[SubscriptionFilters]
  }

  object DescribeSubscriptionFiltersResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        subscriptionFilters: js.UndefOr[SubscriptionFilters] = js.undefined
    ): DescribeSubscriptionFiltersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      subscriptionFilters.foreach(__v => __obj.update("subscriptionFilters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSubscriptionFiltersResponse]
    }
  }

  /**
    * Represents a cross-account destination that receives subscription log events.
    */
  @js.native
  trait Destination extends js.Object {
    var accessPolicy: js.UndefOr[AccessPolicy]
    var arn: js.UndefOr[Arn]
    var creationTime: js.UndefOr[Timestamp]
    var destinationName: js.UndefOr[DestinationName]
    var roleArn: js.UndefOr[RoleArn]
    var targetArn: js.UndefOr[TargetArn]
  }

  object Destination {
    def apply(
        accessPolicy: js.UndefOr[AccessPolicy] = js.undefined,
        arn: js.UndefOr[Arn] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        destinationName: js.UndefOr[DestinationName] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined,
        targetArn: js.UndefOr[TargetArn] = js.undefined
    ): Destination = {
      val __obj = js.Dictionary.empty[js.Any]
      accessPolicy.foreach(__v => __obj.update("accessPolicy", __v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      destinationName.foreach(__v => __obj.update("destinationName", __v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.update("roleArn", __v.asInstanceOf[js.Any]))
      targetArn.foreach(__v => __obj.update("targetArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Destination]
    }
  }

  @js.native
  trait DisassociateKmsKeyRequest extends js.Object {
    var logGroupName: LogGroupName
  }

  object DisassociateKmsKeyRequest {
    def apply(
        logGroupName: LogGroupName
    ): DisassociateKmsKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateKmsKeyRequest]
    }
  }

  /**
    * The method used to distribute log data to the destination, which can be either random or grouped by log stream.
    */
  object DistributionEnum {
    val Random      = "Random"
    val ByLogStream = "ByLogStream"

    val values = IndexedSeq(Random, ByLogStream)
  }

  /**
    * Represents an export task.
    */
  @js.native
  trait ExportTask extends js.Object {
    var destination: js.UndefOr[ExportDestinationBucket]
    var destinationPrefix: js.UndefOr[ExportDestinationPrefix]
    var executionInfo: js.UndefOr[ExportTaskExecutionInfo]
    var from: js.UndefOr[Timestamp]
    var logGroupName: js.UndefOr[LogGroupName]
    var status: js.UndefOr[ExportTaskStatus]
    var taskId: js.UndefOr[ExportTaskId]
    var taskName: js.UndefOr[ExportTaskName]
    var to: js.UndefOr[Timestamp]
  }

  object ExportTask {
    def apply(
        destination: js.UndefOr[ExportDestinationBucket] = js.undefined,
        destinationPrefix: js.UndefOr[ExportDestinationPrefix] = js.undefined,
        executionInfo: js.UndefOr[ExportTaskExecutionInfo] = js.undefined,
        from: js.UndefOr[Timestamp] = js.undefined,
        logGroupName: js.UndefOr[LogGroupName] = js.undefined,
        status: js.UndefOr[ExportTaskStatus] = js.undefined,
        taskId: js.UndefOr[ExportTaskId] = js.undefined,
        taskName: js.UndefOr[ExportTaskName] = js.undefined,
        to: js.UndefOr[Timestamp] = js.undefined
    ): ExportTask = {
      val __obj = js.Dictionary.empty[js.Any]
      destination.foreach(__v => __obj.update("destination", __v.asInstanceOf[js.Any]))
      destinationPrefix.foreach(__v => __obj.update("destinationPrefix", __v.asInstanceOf[js.Any]))
      executionInfo.foreach(__v => __obj.update("executionInfo", __v.asInstanceOf[js.Any]))
      from.foreach(__v => __obj.update("from", __v.asInstanceOf[js.Any]))
      logGroupName.foreach(__v => __obj.update("logGroupName", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      taskId.foreach(__v => __obj.update("taskId", __v.asInstanceOf[js.Any]))
      taskName.foreach(__v => __obj.update("taskName", __v.asInstanceOf[js.Any]))
      to.foreach(__v => __obj.update("to", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportTask]
    }
  }

  /**
    * Represents the status of an export task.
    */
  @js.native
  trait ExportTaskExecutionInfo extends js.Object {
    var completionTime: js.UndefOr[Timestamp]
    var creationTime: js.UndefOr[Timestamp]
  }

  object ExportTaskExecutionInfo {
    def apply(
        completionTime: js.UndefOr[Timestamp] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined
    ): ExportTaskExecutionInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      completionTime.foreach(__v => __obj.update("completionTime", __v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportTaskExecutionInfo]
    }
  }

  /**
    * Represents the status of an export task.
    */
  @js.native
  trait ExportTaskStatus extends js.Object {
    var code: js.UndefOr[ExportTaskStatusCode]
    var message: js.UndefOr[ExportTaskStatusMessage]
  }

  object ExportTaskStatus {
    def apply(
        code: js.UndefOr[ExportTaskStatusCode] = js.undefined,
        message: js.UndefOr[ExportTaskStatusMessage] = js.undefined
    ): ExportTaskStatus = {
      val __obj = js.Dictionary.empty[js.Any]
      code.foreach(__v => __obj.update("code", __v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.update("message", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportTaskStatus]
    }
  }

  object ExportTaskStatusCodeEnum {
    val CANCELLED      = "CANCELLED"
    val COMPLETED      = "COMPLETED"
    val FAILED         = "FAILED"
    val PENDING        = "PENDING"
    val PENDING_CANCEL = "PENDING_CANCEL"
    val RUNNING        = "RUNNING"

    val values = IndexedSeq(CANCELLED, COMPLETED, FAILED, PENDING, PENDING_CANCEL, RUNNING)
  }

  @js.native
  trait FilterLogEventsRequest extends js.Object {
    var logGroupName: LogGroupName
    var endTime: js.UndefOr[Timestamp]
    var filterPattern: js.UndefOr[FilterPattern]
    var interleaved: js.UndefOr[Interleaved]
    var limit: js.UndefOr[EventsLimit]
    var logStreamNamePrefix: js.UndefOr[LogStreamName]
    var logStreamNames: js.UndefOr[InputLogStreamNames]
    var nextToken: js.UndefOr[NextToken]
    var startTime: js.UndefOr[Timestamp]
  }

  object FilterLogEventsRequest {
    def apply(
        logGroupName: LogGroupName,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        filterPattern: js.UndefOr[FilterPattern] = js.undefined,
        interleaved: js.UndefOr[Interleaved] = js.undefined,
        limit: js.UndefOr[EventsLimit] = js.undefined,
        logStreamNamePrefix: js.UndefOr[LogStreamName] = js.undefined,
        logStreamNames: js.UndefOr[InputLogStreamNames] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined
    ): FilterLogEventsRequest = {
      val __obj = js.Dictionary[js.Any](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any]
      )

      endTime.foreach(__v => __obj.update("endTime", __v.asInstanceOf[js.Any]))
      filterPattern.foreach(__v => __obj.update("filterPattern", __v.asInstanceOf[js.Any]))
      interleaved.foreach(__v => __obj.update("interleaved", __v.asInstanceOf[js.Any]))
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      logStreamNamePrefix.foreach(__v => __obj.update("logStreamNamePrefix", __v.asInstanceOf[js.Any]))
      logStreamNames.foreach(__v => __obj.update("logStreamNames", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.update("startTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterLogEventsRequest]
    }
  }

  @js.native
  trait FilterLogEventsResponse extends js.Object {
    var events: js.UndefOr[FilteredLogEvents]
    var nextToken: js.UndefOr[NextToken]
    var searchedLogStreams: js.UndefOr[SearchedLogStreams]
  }

  object FilterLogEventsResponse {
    def apply(
        events: js.UndefOr[FilteredLogEvents] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        searchedLogStreams: js.UndefOr[SearchedLogStreams] = js.undefined
    ): FilterLogEventsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      events.foreach(__v => __obj.update("events", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      searchedLogStreams.foreach(__v => __obj.update("searchedLogStreams", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterLogEventsResponse]
    }
  }

  /**
    * Represents a matched event.
    */
  @js.native
  trait FilteredLogEvent extends js.Object {
    var eventId: js.UndefOr[EventId]
    var ingestionTime: js.UndefOr[Timestamp]
    var logStreamName: js.UndefOr[LogStreamName]
    var message: js.UndefOr[EventMessage]
    var timestamp: js.UndefOr[Timestamp]
  }

  object FilteredLogEvent {
    def apply(
        eventId: js.UndefOr[EventId] = js.undefined,
        ingestionTime: js.UndefOr[Timestamp] = js.undefined,
        logStreamName: js.UndefOr[LogStreamName] = js.undefined,
        message: js.UndefOr[EventMessage] = js.undefined,
        timestamp: js.UndefOr[Timestamp] = js.undefined
    ): FilteredLogEvent = {
      val __obj = js.Dictionary.empty[js.Any]
      eventId.foreach(__v => __obj.update("eventId", __v.asInstanceOf[js.Any]))
      ingestionTime.foreach(__v => __obj.update("ingestionTime", __v.asInstanceOf[js.Any]))
      logStreamName.foreach(__v => __obj.update("logStreamName", __v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.update("message", __v.asInstanceOf[js.Any]))
      timestamp.foreach(__v => __obj.update("timestamp", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilteredLogEvent]
    }
  }

  @js.native
  trait GetLogEventsRequest extends js.Object {
    var logGroupName: LogGroupName
    var logStreamName: LogStreamName
    var endTime: js.UndefOr[Timestamp]
    var limit: js.UndefOr[EventsLimit]
    var nextToken: js.UndefOr[NextToken]
    var startFromHead: js.UndefOr[StartFromHead]
    var startTime: js.UndefOr[Timestamp]
  }

  object GetLogEventsRequest {
    def apply(
        logGroupName: LogGroupName,
        logStreamName: LogStreamName,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        limit: js.UndefOr[EventsLimit] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        startFromHead: js.UndefOr[StartFromHead] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined
    ): GetLogEventsRequest = {
      val __obj = js.Dictionary[js.Any](
        "logGroupName"  -> logGroupName.asInstanceOf[js.Any],
        "logStreamName" -> logStreamName.asInstanceOf[js.Any]
      )

      endTime.foreach(__v => __obj.update("endTime", __v.asInstanceOf[js.Any]))
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      startFromHead.foreach(__v => __obj.update("startFromHead", __v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.update("startTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLogEventsRequest]
    }
  }

  @js.native
  trait GetLogEventsResponse extends js.Object {
    var events: js.UndefOr[OutputLogEvents]
    var nextBackwardToken: js.UndefOr[NextToken]
    var nextForwardToken: js.UndefOr[NextToken]
  }

  object GetLogEventsResponse {
    def apply(
        events: js.UndefOr[OutputLogEvents] = js.undefined,
        nextBackwardToken: js.UndefOr[NextToken] = js.undefined,
        nextForwardToken: js.UndefOr[NextToken] = js.undefined
    ): GetLogEventsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      events.foreach(__v => __obj.update("events", __v.asInstanceOf[js.Any]))
      nextBackwardToken.foreach(__v => __obj.update("nextBackwardToken", __v.asInstanceOf[js.Any]))
      nextForwardToken.foreach(__v => __obj.update("nextForwardToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLogEventsResponse]
    }
  }

  @js.native
  trait GetLogGroupFieldsRequest extends js.Object {
    var logGroupName: LogGroupName
    var time: js.UndefOr[Timestamp]
  }

  object GetLogGroupFieldsRequest {
    def apply(
        logGroupName: LogGroupName,
        time: js.UndefOr[Timestamp] = js.undefined
    ): GetLogGroupFieldsRequest = {
      val __obj = js.Dictionary[js.Any](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any]
      )

      time.foreach(__v => __obj.update("time", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLogGroupFieldsRequest]
    }
  }

  @js.native
  trait GetLogGroupFieldsResponse extends js.Object {
    var logGroupFields: js.UndefOr[LogGroupFieldList]
  }

  object GetLogGroupFieldsResponse {
    def apply(
        logGroupFields: js.UndefOr[LogGroupFieldList] = js.undefined
    ): GetLogGroupFieldsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      logGroupFields.foreach(__v => __obj.update("logGroupFields", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLogGroupFieldsResponse]
    }
  }

  @js.native
  trait GetLogRecordRequest extends js.Object {
    var logRecordPointer: LogRecordPointer
  }

  object GetLogRecordRequest {
    def apply(
        logRecordPointer: LogRecordPointer
    ): GetLogRecordRequest = {
      val __obj = js.Dictionary[js.Any](
        "logRecordPointer" -> logRecordPointer.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetLogRecordRequest]
    }
  }

  @js.native
  trait GetLogRecordResponse extends js.Object {
    var logRecord: js.UndefOr[LogRecord]
  }

  object GetLogRecordResponse {
    def apply(
        logRecord: js.UndefOr[LogRecord] = js.undefined
    ): GetLogRecordResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      logRecord.foreach(__v => __obj.update("logRecord", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLogRecordResponse]
    }
  }

  @js.native
  trait GetQueryResultsRequest extends js.Object {
    var queryId: QueryId
  }

  object GetQueryResultsRequest {
    def apply(
        queryId: QueryId
    ): GetQueryResultsRequest = {
      val __obj = js.Dictionary[js.Any](
        "queryId" -> queryId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetQueryResultsRequest]
    }
  }

  @js.native
  trait GetQueryResultsResponse extends js.Object {
    var results: js.UndefOr[QueryResults]
    var statistics: js.UndefOr[QueryStatistics]
    var status: js.UndefOr[QueryStatus]
  }

  object GetQueryResultsResponse {
    def apply(
        results: js.UndefOr[QueryResults] = js.undefined,
        statistics: js.UndefOr[QueryStatistics] = js.undefined,
        status: js.UndefOr[QueryStatus] = js.undefined
    ): GetQueryResultsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      results.foreach(__v => __obj.update("results", __v.asInstanceOf[js.Any]))
      statistics.foreach(__v => __obj.update("statistics", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQueryResultsResponse]
    }
  }

  /**
    * Represents a log event, which is a record of activity that was recorded by the application or resource being monitored.
    */
  @js.native
  trait InputLogEvent extends js.Object {
    var message: EventMessage
    var timestamp: Timestamp
  }

  object InputLogEvent {
    def apply(
        message: EventMessage,
        timestamp: Timestamp
    ): InputLogEvent = {
      val __obj = js.Dictionary[js.Any](
        "message"   -> message.asInstanceOf[js.Any],
        "timestamp" -> timestamp.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InputLogEvent]
    }
  }

  @js.native
  trait ListTagsLogGroupRequest extends js.Object {
    var logGroupName: LogGroupName
  }

  object ListTagsLogGroupRequest {
    def apply(
        logGroupName: LogGroupName
    ): ListTagsLogGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsLogGroupRequest]
    }
  }

  @js.native
  trait ListTagsLogGroupResponse extends js.Object {
    var tags: js.UndefOr[Tags]
  }

  object ListTagsLogGroupResponse {
    def apply(
        tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsLogGroupResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsLogGroupResponse]
    }
  }

  /**
    * Represents a log group.
    */
  @js.native
  trait LogGroup extends js.Object {
    var arn: js.UndefOr[Arn]
    var creationTime: js.UndefOr[Timestamp]
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var logGroupName: js.UndefOr[LogGroupName]
    var metricFilterCount: js.UndefOr[FilterCount]
    var retentionInDays: js.UndefOr[Days]
    var storedBytes: js.UndefOr[StoredBytes]
  }

  object LogGroup {
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        logGroupName: js.UndefOr[LogGroupName] = js.undefined,
        metricFilterCount: js.UndefOr[FilterCount] = js.undefined,
        retentionInDays: js.UndefOr[Days] = js.undefined,
        storedBytes: js.UndefOr[StoredBytes] = js.undefined
    ): LogGroup = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.update("kmsKeyId", __v.asInstanceOf[js.Any]))
      logGroupName.foreach(__v => __obj.update("logGroupName", __v.asInstanceOf[js.Any]))
      metricFilterCount.foreach(__v => __obj.update("metricFilterCount", __v.asInstanceOf[js.Any]))
      retentionInDays.foreach(__v => __obj.update("retentionInDays", __v.asInstanceOf[js.Any]))
      storedBytes.foreach(__v => __obj.update("storedBytes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogGroup]
    }
  }

  /**
    * The fields contained in log events found by a <code>GetLogGroupFields</code> operation, along with the percentage of queried log events in which each field appears.
    */
  @js.native
  trait LogGroupField extends js.Object {
    var name: js.UndefOr[Field]
    var percent: js.UndefOr[Percentage]
  }

  object LogGroupField {
    def apply(
        name: js.UndefOr[Field] = js.undefined,
        percent: js.UndefOr[Percentage] = js.undefined
    ): LogGroupField = {
      val __obj = js.Dictionary.empty[js.Any]
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      percent.foreach(__v => __obj.update("percent", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogGroupField]
    }
  }

  /**
    * Represents a log stream, which is a sequence of log events from a single emitter of logs.
    */
  @js.native
  trait LogStream extends js.Object {
    var arn: js.UndefOr[Arn]
    var creationTime: js.UndefOr[Timestamp]
    var firstEventTimestamp: js.UndefOr[Timestamp]
    var lastEventTimestamp: js.UndefOr[Timestamp]
    var lastIngestionTime: js.UndefOr[Timestamp]
    var logStreamName: js.UndefOr[LogStreamName]
    var storedBytes: js.UndefOr[StoredBytes]
    var uploadSequenceToken: js.UndefOr[SequenceToken]
  }

  object LogStream {
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        firstEventTimestamp: js.UndefOr[Timestamp] = js.undefined,
        lastEventTimestamp: js.UndefOr[Timestamp] = js.undefined,
        lastIngestionTime: js.UndefOr[Timestamp] = js.undefined,
        logStreamName: js.UndefOr[LogStreamName] = js.undefined,
        storedBytes: js.UndefOr[StoredBytes] = js.undefined,
        uploadSequenceToken: js.UndefOr[SequenceToken] = js.undefined
    ): LogStream = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      firstEventTimestamp.foreach(__v => __obj.update("firstEventTimestamp", __v.asInstanceOf[js.Any]))
      lastEventTimestamp.foreach(__v => __obj.update("lastEventTimestamp", __v.asInstanceOf[js.Any]))
      lastIngestionTime.foreach(__v => __obj.update("lastIngestionTime", __v.asInstanceOf[js.Any]))
      logStreamName.foreach(__v => __obj.update("logStreamName", __v.asInstanceOf[js.Any]))
      storedBytes.foreach(__v => __obj.update("storedBytes", __v.asInstanceOf[js.Any]))
      uploadSequenceToken.foreach(__v => __obj.update("uploadSequenceToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogStream]
    }
  }

  /**
    * Metric filters express how CloudWatch Logs would extract metric observations from ingested log events and transform them into metric data in a CloudWatch metric.
    */
  @js.native
  trait MetricFilter extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var filterName: js.UndefOr[FilterName]
    var filterPattern: js.UndefOr[FilterPattern]
    var logGroupName: js.UndefOr[LogGroupName]
    var metricTransformations: js.UndefOr[MetricTransformations]
  }

  object MetricFilter {
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        filterName: js.UndefOr[FilterName] = js.undefined,
        filterPattern: js.UndefOr[FilterPattern] = js.undefined,
        logGroupName: js.UndefOr[LogGroupName] = js.undefined,
        metricTransformations: js.UndefOr[MetricTransformations] = js.undefined
    ): MetricFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      filterName.foreach(__v => __obj.update("filterName", __v.asInstanceOf[js.Any]))
      filterPattern.foreach(__v => __obj.update("filterPattern", __v.asInstanceOf[js.Any]))
      logGroupName.foreach(__v => __obj.update("logGroupName", __v.asInstanceOf[js.Any]))
      metricTransformations.foreach(__v => __obj.update("metricTransformations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricFilter]
    }
  }

  /**
    * Represents a matched event.
    */
  @js.native
  trait MetricFilterMatchRecord extends js.Object {
    var eventMessage: js.UndefOr[EventMessage]
    var eventNumber: js.UndefOr[EventNumber]
    var extractedValues: js.UndefOr[ExtractedValues]
  }

  object MetricFilterMatchRecord {
    def apply(
        eventMessage: js.UndefOr[EventMessage] = js.undefined,
        eventNumber: js.UndefOr[EventNumber] = js.undefined,
        extractedValues: js.UndefOr[ExtractedValues] = js.undefined
    ): MetricFilterMatchRecord = {
      val __obj = js.Dictionary.empty[js.Any]
      eventMessage.foreach(__v => __obj.update("eventMessage", __v.asInstanceOf[js.Any]))
      eventNumber.foreach(__v => __obj.update("eventNumber", __v.asInstanceOf[js.Any]))
      extractedValues.foreach(__v => __obj.update("extractedValues", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricFilterMatchRecord]
    }
  }

  /**
    * Indicates how to transform ingested log eventsto metric data in a CloudWatch metric.
    */
  @js.native
  trait MetricTransformation extends js.Object {
    var metricName: MetricName
    var metricNamespace: MetricNamespace
    var metricValue: MetricValue
    var defaultValue: js.UndefOr[DefaultValue]
  }

  object MetricTransformation {
    def apply(
        metricName: MetricName,
        metricNamespace: MetricNamespace,
        metricValue: MetricValue,
        defaultValue: js.UndefOr[DefaultValue] = js.undefined
    ): MetricTransformation = {
      val __obj = js.Dictionary[js.Any](
        "metricName"      -> metricName.asInstanceOf[js.Any],
        "metricNamespace" -> metricNamespace.asInstanceOf[js.Any],
        "metricValue"     -> metricValue.asInstanceOf[js.Any]
      )

      defaultValue.foreach(__v => __obj.update("defaultValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricTransformation]
    }
  }

  object OrderByEnum {
    val LogStreamName = "LogStreamName"
    val LastEventTime = "LastEventTime"

    val values = IndexedSeq(LogStreamName, LastEventTime)
  }

  /**
    * Represents a log event.
    */
  @js.native
  trait OutputLogEvent extends js.Object {
    var ingestionTime: js.UndefOr[Timestamp]
    var message: js.UndefOr[EventMessage]
    var timestamp: js.UndefOr[Timestamp]
  }

  object OutputLogEvent {
    def apply(
        ingestionTime: js.UndefOr[Timestamp] = js.undefined,
        message: js.UndefOr[EventMessage] = js.undefined,
        timestamp: js.UndefOr[Timestamp] = js.undefined
    ): OutputLogEvent = {
      val __obj = js.Dictionary.empty[js.Any]
      ingestionTime.foreach(__v => __obj.update("ingestionTime", __v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.update("message", __v.asInstanceOf[js.Any]))
      timestamp.foreach(__v => __obj.update("timestamp", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputLogEvent]
    }
  }

  @js.native
  trait PutDestinationPolicyRequest extends js.Object {
    var accessPolicy: AccessPolicy
    var destinationName: DestinationName
  }

  object PutDestinationPolicyRequest {
    def apply(
        accessPolicy: AccessPolicy,
        destinationName: DestinationName
    ): PutDestinationPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "accessPolicy"    -> accessPolicy.asInstanceOf[js.Any],
        "destinationName" -> destinationName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutDestinationPolicyRequest]
    }
  }

  @js.native
  trait PutDestinationRequest extends js.Object {
    var destinationName: DestinationName
    var roleArn: RoleArn
    var targetArn: TargetArn
  }

  object PutDestinationRequest {
    def apply(
        destinationName: DestinationName,
        roleArn: RoleArn,
        targetArn: TargetArn
    ): PutDestinationRequest = {
      val __obj = js.Dictionary[js.Any](
        "destinationName" -> destinationName.asInstanceOf[js.Any],
        "roleArn"         -> roleArn.asInstanceOf[js.Any],
        "targetArn"       -> targetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutDestinationRequest]
    }
  }

  @js.native
  trait PutDestinationResponse extends js.Object {
    var destination: js.UndefOr[Destination]
  }

  object PutDestinationResponse {
    def apply(
        destination: js.UndefOr[Destination] = js.undefined
    ): PutDestinationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      destination.foreach(__v => __obj.update("destination", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutDestinationResponse]
    }
  }

  @js.native
  trait PutLogEventsRequest extends js.Object {
    var logEvents: InputLogEvents
    var logGroupName: LogGroupName
    var logStreamName: LogStreamName
    var sequenceToken: js.UndefOr[SequenceToken]
  }

  object PutLogEventsRequest {
    def apply(
        logEvents: InputLogEvents,
        logGroupName: LogGroupName,
        logStreamName: LogStreamName,
        sequenceToken: js.UndefOr[SequenceToken] = js.undefined
    ): PutLogEventsRequest = {
      val __obj = js.Dictionary[js.Any](
        "logEvents"     -> logEvents.asInstanceOf[js.Any],
        "logGroupName"  -> logGroupName.asInstanceOf[js.Any],
        "logStreamName" -> logStreamName.asInstanceOf[js.Any]
      )

      sequenceToken.foreach(__v => __obj.update("sequenceToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutLogEventsRequest]
    }
  }

  @js.native
  trait PutLogEventsResponse extends js.Object {
    var nextSequenceToken: js.UndefOr[SequenceToken]
    var rejectedLogEventsInfo: js.UndefOr[RejectedLogEventsInfo]
  }

  object PutLogEventsResponse {
    def apply(
        nextSequenceToken: js.UndefOr[SequenceToken] = js.undefined,
        rejectedLogEventsInfo: js.UndefOr[RejectedLogEventsInfo] = js.undefined
    ): PutLogEventsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextSequenceToken.foreach(__v => __obj.update("nextSequenceToken", __v.asInstanceOf[js.Any]))
      rejectedLogEventsInfo.foreach(__v => __obj.update("rejectedLogEventsInfo", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutLogEventsResponse]
    }
  }

  @js.native
  trait PutMetricFilterRequest extends js.Object {
    var filterName: FilterName
    var filterPattern: FilterPattern
    var logGroupName: LogGroupName
    var metricTransformations: MetricTransformations
  }

  object PutMetricFilterRequest {
    def apply(
        filterName: FilterName,
        filterPattern: FilterPattern,
        logGroupName: LogGroupName,
        metricTransformations: MetricTransformations
    ): PutMetricFilterRequest = {
      val __obj = js.Dictionary[js.Any](
        "filterName"            -> filterName.asInstanceOf[js.Any],
        "filterPattern"         -> filterPattern.asInstanceOf[js.Any],
        "logGroupName"          -> logGroupName.asInstanceOf[js.Any],
        "metricTransformations" -> metricTransformations.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutMetricFilterRequest]
    }
  }

  @js.native
  trait PutResourcePolicyRequest extends js.Object {
    var policyDocument: js.UndefOr[PolicyDocument]
    var policyName: js.UndefOr[PolicyName]
  }

  object PutResourcePolicyRequest {
    def apply(
        policyDocument: js.UndefOr[PolicyDocument] = js.undefined,
        policyName: js.UndefOr[PolicyName] = js.undefined
    ): PutResourcePolicyRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      policyDocument.foreach(__v => __obj.update("policyDocument", __v.asInstanceOf[js.Any]))
      policyName.foreach(__v => __obj.update("policyName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutResourcePolicyRequest]
    }
  }

  @js.native
  trait PutResourcePolicyResponse extends js.Object {
    var resourcePolicy: js.UndefOr[ResourcePolicy]
  }

  object PutResourcePolicyResponse {
    def apply(
        resourcePolicy: js.UndefOr[ResourcePolicy] = js.undefined
    ): PutResourcePolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      resourcePolicy.foreach(__v => __obj.update("resourcePolicy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutResourcePolicyResponse]
    }
  }

  @js.native
  trait PutRetentionPolicyRequest extends js.Object {
    var logGroupName: LogGroupName
    var retentionInDays: Days
  }

  object PutRetentionPolicyRequest {
    def apply(
        logGroupName: LogGroupName,
        retentionInDays: Days
    ): PutRetentionPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "logGroupName"    -> logGroupName.asInstanceOf[js.Any],
        "retentionInDays" -> retentionInDays.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutRetentionPolicyRequest]
    }
  }

  @js.native
  trait PutSubscriptionFilterRequest extends js.Object {
    var destinationArn: DestinationArn
    var filterName: FilterName
    var filterPattern: FilterPattern
    var logGroupName: LogGroupName
    var distribution: js.UndefOr[Distribution]
    var roleArn: js.UndefOr[RoleArn]
  }

  object PutSubscriptionFilterRequest {
    def apply(
        destinationArn: DestinationArn,
        filterName: FilterName,
        filterPattern: FilterPattern,
        logGroupName: LogGroupName,
        distribution: js.UndefOr[Distribution] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): PutSubscriptionFilterRequest = {
      val __obj = js.Dictionary[js.Any](
        "destinationArn" -> destinationArn.asInstanceOf[js.Any],
        "filterName"     -> filterName.asInstanceOf[js.Any],
        "filterPattern"  -> filterPattern.asInstanceOf[js.Any],
        "logGroupName"   -> logGroupName.asInstanceOf[js.Any]
      )

      distribution.foreach(__v => __obj.update("distribution", __v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.update("roleArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSubscriptionFilterRequest]
    }
  }

  /**
    * Information about one CloudWatch Logs Insights query that matches the request in a <code>DescribeQueries</code> operation.
    */
  @js.native
  trait QueryInfo extends js.Object {
    var createTime: js.UndefOr[Timestamp]
    var logGroupName: js.UndefOr[LogGroupName]
    var queryId: js.UndefOr[QueryId]
    var queryString: js.UndefOr[QueryString]
    var status: js.UndefOr[QueryStatus]
  }

  object QueryInfo {
    def apply(
        createTime: js.UndefOr[Timestamp] = js.undefined,
        logGroupName: js.UndefOr[LogGroupName] = js.undefined,
        queryId: js.UndefOr[QueryId] = js.undefined,
        queryString: js.UndefOr[QueryString] = js.undefined,
        status: js.UndefOr[QueryStatus] = js.undefined
    ): QueryInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      createTime.foreach(__v => __obj.update("createTime", __v.asInstanceOf[js.Any]))
      logGroupName.foreach(__v => __obj.update("logGroupName", __v.asInstanceOf[js.Any]))
      queryId.foreach(__v => __obj.update("queryId", __v.asInstanceOf[js.Any]))
      queryString.foreach(__v => __obj.update("queryString", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryInfo]
    }
  }

  /**
    * Contains the number of log events scanned by the query, the number of log events that matched the query criteria, and the total number of bytes in the log events that were scanned.
    */
  @js.native
  trait QueryStatistics extends js.Object {
    var bytesScanned: js.UndefOr[StatsValue]
    var recordsMatched: js.UndefOr[StatsValue]
    var recordsScanned: js.UndefOr[StatsValue]
  }

  object QueryStatistics {
    def apply(
        bytesScanned: js.UndefOr[StatsValue] = js.undefined,
        recordsMatched: js.UndefOr[StatsValue] = js.undefined,
        recordsScanned: js.UndefOr[StatsValue] = js.undefined
    ): QueryStatistics = {
      val __obj = js.Dictionary.empty[js.Any]
      bytesScanned.foreach(__v => __obj.update("bytesScanned", __v.asInstanceOf[js.Any]))
      recordsMatched.foreach(__v => __obj.update("recordsMatched", __v.asInstanceOf[js.Any]))
      recordsScanned.foreach(__v => __obj.update("recordsScanned", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryStatistics]
    }
  }

  object QueryStatusEnum {
    val Scheduled = "Scheduled"
    val Running   = "Running"
    val Complete  = "Complete"
    val Failed    = "Failed"
    val Cancelled = "Cancelled"

    val values = IndexedSeq(Scheduled, Running, Complete, Failed, Cancelled)
  }

  /**
    * Represents the rejected events.
    */
  @js.native
  trait RejectedLogEventsInfo extends js.Object {
    var expiredLogEventEndIndex: js.UndefOr[LogEventIndex]
    var tooNewLogEventStartIndex: js.UndefOr[LogEventIndex]
    var tooOldLogEventEndIndex: js.UndefOr[LogEventIndex]
  }

  object RejectedLogEventsInfo {
    def apply(
        expiredLogEventEndIndex: js.UndefOr[LogEventIndex] = js.undefined,
        tooNewLogEventStartIndex: js.UndefOr[LogEventIndex] = js.undefined,
        tooOldLogEventEndIndex: js.UndefOr[LogEventIndex] = js.undefined
    ): RejectedLogEventsInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      expiredLogEventEndIndex.foreach(__v => __obj.update("expiredLogEventEndIndex", __v.asInstanceOf[js.Any]))
      tooNewLogEventStartIndex.foreach(__v => __obj.update("tooNewLogEventStartIndex", __v.asInstanceOf[js.Any]))
      tooOldLogEventEndIndex.foreach(__v => __obj.update("tooOldLogEventEndIndex", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RejectedLogEventsInfo]
    }
  }

  /**
    * A policy enabling one or more entities to put logs to a log group in this account.
    */
  @js.native
  trait ResourcePolicy extends js.Object {
    var lastUpdatedTime: js.UndefOr[Timestamp]
    var policyDocument: js.UndefOr[PolicyDocument]
    var policyName: js.UndefOr[PolicyName]
  }

  object ResourcePolicy {
    def apply(
        lastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        policyDocument: js.UndefOr[PolicyDocument] = js.undefined,
        policyName: js.UndefOr[PolicyName] = js.undefined
    ): ResourcePolicy = {
      val __obj = js.Dictionary.empty[js.Any]
      lastUpdatedTime.foreach(__v => __obj.update("lastUpdatedTime", __v.asInstanceOf[js.Any]))
      policyDocument.foreach(__v => __obj.update("policyDocument", __v.asInstanceOf[js.Any]))
      policyName.foreach(__v => __obj.update("policyName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourcePolicy]
    }
  }

  /**
    * Contains one field from one log event returned by a CloudWatch Logs Insights query, along with the value of that field.
    */
  @js.native
  trait ResultField extends js.Object {
    var field: js.UndefOr[Field]
    var value: js.UndefOr[Value]
  }

  object ResultField {
    def apply(
        field: js.UndefOr[Field] = js.undefined,
        value: js.UndefOr[Value] = js.undefined
    ): ResultField = {
      val __obj = js.Dictionary.empty[js.Any]
      field.foreach(__v => __obj.update("field", __v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.update("value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResultField]
    }
  }

  /**
    * Represents the search status of a log stream.
    */
  @js.native
  trait SearchedLogStream extends js.Object {
    var logStreamName: js.UndefOr[LogStreamName]
    var searchedCompletely: js.UndefOr[LogStreamSearchedCompletely]
  }

  object SearchedLogStream {
    def apply(
        logStreamName: js.UndefOr[LogStreamName] = js.undefined,
        searchedCompletely: js.UndefOr[LogStreamSearchedCompletely] = js.undefined
    ): SearchedLogStream = {
      val __obj = js.Dictionary.empty[js.Any]
      logStreamName.foreach(__v => __obj.update("logStreamName", __v.asInstanceOf[js.Any]))
      searchedCompletely.foreach(__v => __obj.update("searchedCompletely", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchedLogStream]
    }
  }

  @js.native
  trait StartQueryRequest extends js.Object {
    var endTime: Timestamp
    var logGroupName: LogGroupName
    var queryString: QueryString
    var startTime: Timestamp
    var limit: js.UndefOr[EventsLimit]
  }

  object StartQueryRequest {
    def apply(
        endTime: Timestamp,
        logGroupName: LogGroupName,
        queryString: QueryString,
        startTime: Timestamp,
        limit: js.UndefOr[EventsLimit] = js.undefined
    ): StartQueryRequest = {
      val __obj = js.Dictionary[js.Any](
        "endTime"      -> endTime.asInstanceOf[js.Any],
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "queryString"  -> queryString.asInstanceOf[js.Any],
        "startTime"    -> startTime.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartQueryRequest]
    }
  }

  @js.native
  trait StartQueryResponse extends js.Object {
    var queryId: js.UndefOr[QueryId]
  }

  object StartQueryResponse {
    def apply(
        queryId: js.UndefOr[QueryId] = js.undefined
    ): StartQueryResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      queryId.foreach(__v => __obj.update("queryId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartQueryResponse]
    }
  }

  @js.native
  trait StopQueryRequest extends js.Object {
    var queryId: QueryId
  }

  object StopQueryRequest {
    def apply(
        queryId: QueryId
    ): StopQueryRequest = {
      val __obj = js.Dictionary[js.Any](
        "queryId" -> queryId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopQueryRequest]
    }
  }

  @js.native
  trait StopQueryResponse extends js.Object {
    var success: js.UndefOr[Success]
  }

  object StopQueryResponse {
    def apply(
        success: js.UndefOr[Success] = js.undefined
    ): StopQueryResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      success.foreach(__v => __obj.update("success", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopQueryResponse]
    }
  }

  /**
    * Represents a subscription filter.
    */
  @js.native
  trait SubscriptionFilter extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var destinationArn: js.UndefOr[DestinationArn]
    var distribution: js.UndefOr[Distribution]
    var filterName: js.UndefOr[FilterName]
    var filterPattern: js.UndefOr[FilterPattern]
    var logGroupName: js.UndefOr[LogGroupName]
    var roleArn: js.UndefOr[RoleArn]
  }

  object SubscriptionFilter {
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        destinationArn: js.UndefOr[DestinationArn] = js.undefined,
        distribution: js.UndefOr[Distribution] = js.undefined,
        filterName: js.UndefOr[FilterName] = js.undefined,
        filterPattern: js.UndefOr[FilterPattern] = js.undefined,
        logGroupName: js.UndefOr[LogGroupName] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): SubscriptionFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      destinationArn.foreach(__v => __obj.update("destinationArn", __v.asInstanceOf[js.Any]))
      distribution.foreach(__v => __obj.update("distribution", __v.asInstanceOf[js.Any]))
      filterName.foreach(__v => __obj.update("filterName", __v.asInstanceOf[js.Any]))
      filterPattern.foreach(__v => __obj.update("filterPattern", __v.asInstanceOf[js.Any]))
      logGroupName.foreach(__v => __obj.update("logGroupName", __v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.update("roleArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubscriptionFilter]
    }
  }

  @js.native
  trait TagLogGroupRequest extends js.Object {
    var logGroupName: LogGroupName
    var tags: Tags
  }

  object TagLogGroupRequest {
    def apply(
        logGroupName: LogGroupName,
        tags: Tags
    ): TagLogGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "tags"         -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagLogGroupRequest]
    }
  }

  @js.native
  trait TestMetricFilterRequest extends js.Object {
    var filterPattern: FilterPattern
    var logEventMessages: TestEventMessages
  }

  object TestMetricFilterRequest {
    def apply(
        filterPattern: FilterPattern,
        logEventMessages: TestEventMessages
    ): TestMetricFilterRequest = {
      val __obj = js.Dictionary[js.Any](
        "filterPattern"    -> filterPattern.asInstanceOf[js.Any],
        "logEventMessages" -> logEventMessages.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TestMetricFilterRequest]
    }
  }

  @js.native
  trait TestMetricFilterResponse extends js.Object {
    var matches: js.UndefOr[MetricFilterMatches]
  }

  object TestMetricFilterResponse {
    def apply(
        matches: js.UndefOr[MetricFilterMatches] = js.undefined
    ): TestMetricFilterResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      matches.foreach(__v => __obj.update("matches", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestMetricFilterResponse]
    }
  }

  @js.native
  trait UntagLogGroupRequest extends js.Object {
    var logGroupName: LogGroupName
    var tags: TagList
  }

  object UntagLogGroupRequest {
    def apply(
        logGroupName: LogGroupName,
        tags: TagList
    ): UntagLogGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "tags"         -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagLogGroupRequest]
    }
  }
}
