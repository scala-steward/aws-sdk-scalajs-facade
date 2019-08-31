package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object athena {
  type AmazonResourceName              = String
  type BoxedBoolean                    = Boolean
  type BytesScannedCutoffValue         = Double
  type ColumnInfoList                  = js.Array[ColumnInfo]
  type ColumnNullable                  = String
  type DatabaseString                  = String
  type Date                            = js.Date
  type DescriptionString               = String
  type EncryptionOption                = String
  type ErrorCode                       = String
  type ErrorMessage                    = String
  type IdempotencyToken                = String
  type MaxNamedQueriesCount            = Int
  type MaxQueryExecutionsCount         = Int
  type MaxQueryResults                 = Int
  type MaxTagsCount                    = Int
  type MaxWorkGroupsCount              = Int
  type NameString                      = String
  type NamedQueryId                    = String
  type NamedQueryIdList                = js.Array[NamedQueryId]
  type NamedQueryList                  = js.Array[NamedQuery]
  type QueryExecutionId                = String
  type QueryExecutionIdList            = js.Array[QueryExecutionId]
  type QueryExecutionList              = js.Array[QueryExecution]
  type QueryExecutionState             = String
  type QueryString                     = String
  type RowList                         = js.Array[Row]
  type StatementType                   = String
  type TagKey                          = String
  type TagKeyList                      = js.Array[TagKey]
  type TagList                         = js.Array[Tag]
  type TagValue                        = String
  type Token                           = String
  type UnprocessedNamedQueryIdList     = js.Array[UnprocessedNamedQueryId]
  type UnprocessedQueryExecutionIdList = js.Array[UnprocessedQueryExecutionId]
  type WorkGroupDescriptionString      = String
  type WorkGroupName                   = String
  type WorkGroupState                  = String
  type WorkGroupsList                  = js.Array[WorkGroupSummary]
  type datumList                       = js.Array[Datum]
  type datumString                     = String

  implicit final class AthenaOps(private val service: Athena) extends AnyVal {

    def batchGetNamedQueryFuture(params: BatchGetNamedQueryInput): Future[BatchGetNamedQueryOutput] =
      service.batchGetNamedQuery(params).promise.toFuture
    def batchGetQueryExecutionFuture(params: BatchGetQueryExecutionInput): Future[BatchGetQueryExecutionOutput] =
      service.batchGetQueryExecution(params).promise.toFuture
    def createNamedQueryFuture(params: CreateNamedQueryInput): Future[CreateNamedQueryOutput] =
      service.createNamedQuery(params).promise.toFuture
    def createWorkGroupFuture(params: CreateWorkGroupInput): Future[CreateWorkGroupOutput] =
      service.createWorkGroup(params).promise.toFuture
    def deleteNamedQueryFuture(params: DeleteNamedQueryInput): Future[DeleteNamedQueryOutput] =
      service.deleteNamedQuery(params).promise.toFuture
    def deleteWorkGroupFuture(params: DeleteWorkGroupInput): Future[DeleteWorkGroupOutput] =
      service.deleteWorkGroup(params).promise.toFuture
    def getNamedQueryFuture(params: GetNamedQueryInput): Future[GetNamedQueryOutput] =
      service.getNamedQuery(params).promise.toFuture
    def getQueryExecutionFuture(params: GetQueryExecutionInput): Future[GetQueryExecutionOutput] =
      service.getQueryExecution(params).promise.toFuture
    def getQueryResultsFuture(params: GetQueryResultsInput): Future[GetQueryResultsOutput] =
      service.getQueryResults(params).promise.toFuture
    def getWorkGroupFuture(params: GetWorkGroupInput): Future[GetWorkGroupOutput] =
      service.getWorkGroup(params).promise.toFuture
    def listNamedQueriesFuture(params: ListNamedQueriesInput): Future[ListNamedQueriesOutput] =
      service.listNamedQueries(params).promise.toFuture
    def listQueryExecutionsFuture(params: ListQueryExecutionsInput): Future[ListQueryExecutionsOutput] =
      service.listQueryExecutions(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] =
      service.listTagsForResource(params).promise.toFuture
    def listWorkGroupsFuture(params: ListWorkGroupsInput): Future[ListWorkGroupsOutput] =
      service.listWorkGroups(params).promise.toFuture
    def startQueryExecutionFuture(params: StartQueryExecutionInput): Future[StartQueryExecutionOutput] =
      service.startQueryExecution(params).promise.toFuture
    def stopQueryExecutionFuture(params: StopQueryExecutionInput): Future[StopQueryExecutionOutput] =
      service.stopQueryExecution(params).promise.toFuture
    def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] =
      service.untagResource(params).promise.toFuture
    def updateWorkGroupFuture(params: UpdateWorkGroupInput): Future[UpdateWorkGroupOutput] =
      service.updateWorkGroup(params).promise.toFuture
  }
}

package athena {
  @js.native
  @JSImport("aws-sdk", "Athena")
  class Athena() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchGetNamedQuery(params: BatchGetNamedQueryInput): Request[BatchGetNamedQueryOutput]             = js.native
    def batchGetQueryExecution(params: BatchGetQueryExecutionInput): Request[BatchGetQueryExecutionOutput] = js.native
    def createNamedQuery(params: CreateNamedQueryInput): Request[CreateNamedQueryOutput]                   = js.native
    def createWorkGroup(params: CreateWorkGroupInput): Request[CreateWorkGroupOutput]                      = js.native
    def deleteNamedQuery(params: DeleteNamedQueryInput): Request[DeleteNamedQueryOutput]                   = js.native
    def deleteWorkGroup(params: DeleteWorkGroupInput): Request[DeleteWorkGroupOutput]                      = js.native
    def getNamedQuery(params: GetNamedQueryInput): Request[GetNamedQueryOutput]                            = js.native
    def getQueryExecution(params: GetQueryExecutionInput): Request[GetQueryExecutionOutput]                = js.native
    def getQueryResults(params: GetQueryResultsInput): Request[GetQueryResultsOutput]                      = js.native
    def getWorkGroup(params: GetWorkGroupInput): Request[GetWorkGroupOutput]                               = js.native
    def listNamedQueries(params: ListNamedQueriesInput): Request[ListNamedQueriesOutput]                   = js.native
    def listQueryExecutions(params: ListQueryExecutionsInput): Request[ListQueryExecutionsOutput]          = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput]          = js.native
    def listWorkGroups(params: ListWorkGroupsInput): Request[ListWorkGroupsOutput]                         = js.native
    def startQueryExecution(params: StartQueryExecutionInput): Request[StartQueryExecutionOutput]          = js.native
    def stopQueryExecution(params: StopQueryExecutionInput): Request[StopQueryExecutionOutput]             = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput]                                  = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput]                            = js.native
    def updateWorkGroup(params: UpdateWorkGroupInput): Request[UpdateWorkGroupOutput]                      = js.native
  }

  @js.native
  trait BatchGetNamedQueryInput extends js.Object {
    var NamedQueryIds: NamedQueryIdList
  }

  object BatchGetNamedQueryInput {
    def apply(
        NamedQueryIds: NamedQueryIdList
    ): BatchGetNamedQueryInput = {
      val __obj = js.Dictionary[js.Any](
        "NamedQueryIds" -> NamedQueryIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchGetNamedQueryInput]
    }
  }

  @js.native
  trait BatchGetNamedQueryOutput extends js.Object {
    var NamedQueries: js.UndefOr[NamedQueryList]
    var UnprocessedNamedQueryIds: js.UndefOr[UnprocessedNamedQueryIdList]
  }

  object BatchGetNamedQueryOutput {
    def apply(
        NamedQueries: js.UndefOr[NamedQueryList] = js.undefined,
        UnprocessedNamedQueryIds: js.UndefOr[UnprocessedNamedQueryIdList] = js.undefined
    ): BatchGetNamedQueryOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NamedQueries.foreach(__v => __obj.update("NamedQueries", __v.asInstanceOf[js.Any]))
      UnprocessedNamedQueryIds.foreach(__v => __obj.update("UnprocessedNamedQueryIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetNamedQueryOutput]
    }
  }

  @js.native
  trait BatchGetQueryExecutionInput extends js.Object {
    var QueryExecutionIds: QueryExecutionIdList
  }

  object BatchGetQueryExecutionInput {
    def apply(
        QueryExecutionIds: QueryExecutionIdList
    ): BatchGetQueryExecutionInput = {
      val __obj = js.Dictionary[js.Any](
        "QueryExecutionIds" -> QueryExecutionIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchGetQueryExecutionInput]
    }
  }

  @js.native
  trait BatchGetQueryExecutionOutput extends js.Object {
    var QueryExecutions: js.UndefOr[QueryExecutionList]
    var UnprocessedQueryExecutionIds: js.UndefOr[UnprocessedQueryExecutionIdList]
  }

  object BatchGetQueryExecutionOutput {
    def apply(
        QueryExecutions: js.UndefOr[QueryExecutionList] = js.undefined,
        UnprocessedQueryExecutionIds: js.UndefOr[UnprocessedQueryExecutionIdList] = js.undefined
    ): BatchGetQueryExecutionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      QueryExecutions.foreach(__v => __obj.update("QueryExecutions", __v.asInstanceOf[js.Any]))
      UnprocessedQueryExecutionIds.foreach(
        __v => __obj.update("UnprocessedQueryExecutionIds", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[BatchGetQueryExecutionOutput]
    }
  }

  /**
    * Information about the columns in a query execution result.
    */
  @js.native
  trait ColumnInfo extends js.Object {
    var Name: String
    var Type: String
    var CaseSensitive: js.UndefOr[Boolean]
    var CatalogName: js.UndefOr[String]
    var Label: js.UndefOr[String]
    var Nullable: js.UndefOr[ColumnNullable]
    var Precision: js.UndefOr[Int]
    var Scale: js.UndefOr[Int]
    var SchemaName: js.UndefOr[String]
    var TableName: js.UndefOr[String]
  }

  object ColumnInfo {
    def apply(
        Name: String,
        Type: String,
        CaseSensitive: js.UndefOr[Boolean] = js.undefined,
        CatalogName: js.UndefOr[String] = js.undefined,
        Label: js.UndefOr[String] = js.undefined,
        Nullable: js.UndefOr[ColumnNullable] = js.undefined,
        Precision: js.UndefOr[Int] = js.undefined,
        Scale: js.UndefOr[Int] = js.undefined,
        SchemaName: js.UndefOr[String] = js.undefined,
        TableName: js.UndefOr[String] = js.undefined
    ): ColumnInfo = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      CaseSensitive.foreach(__v => __obj.update("CaseSensitive", __v.asInstanceOf[js.Any]))
      CatalogName.foreach(__v => __obj.update("CatalogName", __v.asInstanceOf[js.Any]))
      Label.foreach(__v => __obj.update("Label", __v.asInstanceOf[js.Any]))
      Nullable.foreach(__v => __obj.update("Nullable", __v.asInstanceOf[js.Any]))
      Precision.foreach(__v => __obj.update("Precision", __v.asInstanceOf[js.Any]))
      Scale.foreach(__v => __obj.update("Scale", __v.asInstanceOf[js.Any]))
      SchemaName.foreach(__v => __obj.update("SchemaName", __v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.update("TableName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnInfo]
    }
  }

  object ColumnNullableEnum {
    val NOT_NULL = "NOT_NULL"
    val NULLABLE = "NULLABLE"
    val UNKNOWN  = "UNKNOWN"

    val values = js.Object.freeze(js.Array(NOT_NULL, NULLABLE, UNKNOWN))
  }

  @js.native
  trait CreateNamedQueryInput extends js.Object {
    var Database: DatabaseString
    var Name: NameString
    var QueryString: QueryString
    var ClientRequestToken: js.UndefOr[IdempotencyToken]
    var Description: js.UndefOr[DescriptionString]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  object CreateNamedQueryInput {
    def apply(
        Database: DatabaseString,
        Name: NameString,
        QueryString: QueryString,
        ClientRequestToken: js.UndefOr[IdempotencyToken] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): CreateNamedQueryInput = {
      val __obj = js.Dictionary[js.Any](
        "Database"    -> Database.asInstanceOf[js.Any],
        "Name"        -> Name.asInstanceOf[js.Any],
        "QueryString" -> QueryString.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.update("ClientRequestToken", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      WorkGroup.foreach(__v => __obj.update("WorkGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNamedQueryInput]
    }
  }

  @js.native
  trait CreateNamedQueryOutput extends js.Object {
    var NamedQueryId: js.UndefOr[NamedQueryId]
  }

  object CreateNamedQueryOutput {
    def apply(
        NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined
    ): CreateNamedQueryOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NamedQueryId.foreach(__v => __obj.update("NamedQueryId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNamedQueryOutput]
    }
  }

  @js.native
  trait CreateWorkGroupInput extends js.Object {
    var Name: WorkGroupName
    var Configuration: js.UndefOr[WorkGroupConfiguration]
    var Description: js.UndefOr[WorkGroupDescriptionString]
    var Tags: js.UndefOr[TagList]
  }

  object CreateWorkGroupInput {
    def apply(
        Name: WorkGroupName,
        Configuration: js.UndefOr[WorkGroupConfiguration] = js.undefined,
        Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateWorkGroupInput = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Configuration.foreach(__v => __obj.update("Configuration", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkGroupInput]
    }
  }

  @js.native
  trait CreateWorkGroupOutput extends js.Object {}

  object CreateWorkGroupOutput {
    def apply(
        ): CreateWorkGroupOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreateWorkGroupOutput]
    }
  }

  /**
    * A piece of data (a field in the table).
    */
  @js.native
  trait Datum extends js.Object {
    var VarCharValue: js.UndefOr[datumString]
  }

  object Datum {
    def apply(
        VarCharValue: js.UndefOr[datumString] = js.undefined
    ): Datum = {
      val __obj = js.Dictionary.empty[js.Any]
      VarCharValue.foreach(__v => __obj.update("VarCharValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Datum]
    }
  }

  @js.native
  trait DeleteNamedQueryInput extends js.Object {
    var NamedQueryId: NamedQueryId
  }

  object DeleteNamedQueryInput {
    def apply(
        NamedQueryId: NamedQueryId
    ): DeleteNamedQueryInput = {
      val __obj = js.Dictionary[js.Any](
        "NamedQueryId" -> NamedQueryId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteNamedQueryInput]
    }
  }

  @js.native
  trait DeleteNamedQueryOutput extends js.Object {}

  object DeleteNamedQueryOutput {
    def apply(
        ): DeleteNamedQueryOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteNamedQueryOutput]
    }
  }

  @js.native
  trait DeleteWorkGroupInput extends js.Object {
    var WorkGroup: WorkGroupName
    var RecursiveDeleteOption: js.UndefOr[BoxedBoolean]
  }

  object DeleteWorkGroupInput {
    def apply(
        WorkGroup: WorkGroupName,
        RecursiveDeleteOption: js.UndefOr[BoxedBoolean] = js.undefined
    ): DeleteWorkGroupInput = {
      val __obj = js.Dictionary[js.Any](
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any]
      )

      RecursiveDeleteOption.foreach(__v => __obj.update("RecursiveDeleteOption", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteWorkGroupInput]
    }
  }

  @js.native
  trait DeleteWorkGroupOutput extends js.Object {}

  object DeleteWorkGroupOutput {
    def apply(
        ): DeleteWorkGroupOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteWorkGroupOutput]
    }
  }

  /**
    * If query results are encrypted in Amazon S3, indicates the encryption option used (for example, <code>SSE-KMS</code> or <code>CSE-KMS</code>) and key information.
    */
  @js.native
  trait EncryptionConfiguration extends js.Object {
    var EncryptionOption: EncryptionOption
    var KmsKey: js.UndefOr[String]
  }

  object EncryptionConfiguration {
    def apply(
        EncryptionOption: EncryptionOption,
        KmsKey: js.UndefOr[String] = js.undefined
    ): EncryptionConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "EncryptionOption" -> EncryptionOption.asInstanceOf[js.Any]
      )

      KmsKey.foreach(__v => __obj.update("KmsKey", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionConfiguration]
    }
  }

  object EncryptionOptionEnum {
    val SSE_S3  = "SSE_S3"
    val SSE_KMS = "SSE_KMS"
    val CSE_KMS = "CSE_KMS"

    val values = js.Object.freeze(js.Array(SSE_S3, SSE_KMS, CSE_KMS))
  }

  @js.native
  trait GetNamedQueryInput extends js.Object {
    var NamedQueryId: NamedQueryId
  }

  object GetNamedQueryInput {
    def apply(
        NamedQueryId: NamedQueryId
    ): GetNamedQueryInput = {
      val __obj = js.Dictionary[js.Any](
        "NamedQueryId" -> NamedQueryId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetNamedQueryInput]
    }
  }

  @js.native
  trait GetNamedQueryOutput extends js.Object {
    var NamedQuery: js.UndefOr[NamedQuery]
  }

  object GetNamedQueryOutput {
    def apply(
        NamedQuery: js.UndefOr[NamedQuery] = js.undefined
    ): GetNamedQueryOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NamedQuery.foreach(__v => __obj.update("NamedQuery", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNamedQueryOutput]
    }
  }

  @js.native
  trait GetQueryExecutionInput extends js.Object {
    var QueryExecutionId: QueryExecutionId
  }

  object GetQueryExecutionInput {
    def apply(
        QueryExecutionId: QueryExecutionId
    ): GetQueryExecutionInput = {
      val __obj = js.Dictionary[js.Any](
        "QueryExecutionId" -> QueryExecutionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetQueryExecutionInput]
    }
  }

  @js.native
  trait GetQueryExecutionOutput extends js.Object {
    var QueryExecution: js.UndefOr[QueryExecution]
  }

  object GetQueryExecutionOutput {
    def apply(
        QueryExecution: js.UndefOr[QueryExecution] = js.undefined
    ): GetQueryExecutionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      QueryExecution.foreach(__v => __obj.update("QueryExecution", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQueryExecutionOutput]
    }
  }

  @js.native
  trait GetQueryResultsInput extends js.Object {
    var QueryExecutionId: QueryExecutionId
    var MaxResults: js.UndefOr[MaxQueryResults]
    var NextToken: js.UndefOr[Token]
  }

  object GetQueryResultsInput {
    def apply(
        QueryExecutionId: QueryExecutionId,
        MaxResults: js.UndefOr[MaxQueryResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetQueryResultsInput = {
      val __obj = js.Dictionary[js.Any](
        "QueryExecutionId" -> QueryExecutionId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQueryResultsInput]
    }
  }

  @js.native
  trait GetQueryResultsOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var ResultSet: js.UndefOr[ResultSet]
    var UpdateCount: js.UndefOr[Double]
  }

  object GetQueryResultsOutput {
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        ResultSet: js.UndefOr[ResultSet] = js.undefined,
        UpdateCount: js.UndefOr[Double] = js.undefined
    ): GetQueryResultsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ResultSet.foreach(__v => __obj.update("ResultSet", __v.asInstanceOf[js.Any]))
      UpdateCount.foreach(__v => __obj.update("UpdateCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQueryResultsOutput]
    }
  }

  @js.native
  trait GetWorkGroupInput extends js.Object {
    var WorkGroup: WorkGroupName
  }

  object GetWorkGroupInput {
    def apply(
        WorkGroup: WorkGroupName
    ): GetWorkGroupInput = {
      val __obj = js.Dictionary[js.Any](
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetWorkGroupInput]
    }
  }

  @js.native
  trait GetWorkGroupOutput extends js.Object {
    var WorkGroup: js.UndefOr[WorkGroup]
  }

  object GetWorkGroupOutput {
    def apply(
        WorkGroup: js.UndefOr[WorkGroup] = js.undefined
    ): GetWorkGroupOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      WorkGroup.foreach(__v => __obj.update("WorkGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkGroupOutput]
    }
  }

  @js.native
  trait ListNamedQueriesInput extends js.Object {
    var MaxResults: js.UndefOr[MaxNamedQueriesCount]
    var NextToken: js.UndefOr[Token]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  object ListNamedQueriesInput {
    def apply(
        MaxResults: js.UndefOr[MaxNamedQueriesCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): ListNamedQueriesInput = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      WorkGroup.foreach(__v => __obj.update("WorkGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNamedQueriesInput]
    }
  }

  @js.native
  trait ListNamedQueriesOutput extends js.Object {
    var NamedQueryIds: js.UndefOr[NamedQueryIdList]
    var NextToken: js.UndefOr[Token]
  }

  object ListNamedQueriesOutput {
    def apply(
        NamedQueryIds: js.UndefOr[NamedQueryIdList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListNamedQueriesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NamedQueryIds.foreach(__v => __obj.update("NamedQueryIds", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNamedQueriesOutput]
    }
  }

  @js.native
  trait ListQueryExecutionsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxQueryExecutionsCount]
    var NextToken: js.UndefOr[Token]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  object ListQueryExecutionsInput {
    def apply(
        MaxResults: js.UndefOr[MaxQueryExecutionsCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): ListQueryExecutionsInput = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      WorkGroup.foreach(__v => __obj.update("WorkGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueryExecutionsInput]
    }
  }

  @js.native
  trait ListQueryExecutionsOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var QueryExecutionIds: js.UndefOr[QueryExecutionIdList]
  }

  object ListQueryExecutionsOutput {
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        QueryExecutionIds: js.UndefOr[QueryExecutionIdList] = js.undefined
    ): ListQueryExecutionsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      QueryExecutionIds.foreach(__v => __obj.update("QueryExecutionIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueryExecutionsOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var ResourceARN: AmazonResourceName
    var MaxResults: js.UndefOr[MaxTagsCount]
    var NextToken: js.UndefOr[Token]
  }

  object ListTagsForResourceInput {
    def apply(
        ResourceARN: AmazonResourceName,
        MaxResults: js.UndefOr[MaxTagsCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListTagsForResourceInput = {
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceOutput {
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
    }
  }

  @js.native
  trait ListWorkGroupsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxWorkGroupsCount]
    var NextToken: js.UndefOr[Token]
  }

  object ListWorkGroupsInput {
    def apply(
        MaxResults: js.UndefOr[MaxWorkGroupsCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListWorkGroupsInput = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkGroupsInput]
    }
  }

  @js.native
  trait ListWorkGroupsOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var WorkGroups: js.UndefOr[WorkGroupsList]
  }

  object ListWorkGroupsOutput {
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        WorkGroups: js.UndefOr[WorkGroupsList] = js.undefined
    ): ListWorkGroupsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      WorkGroups.foreach(__v => __obj.update("WorkGroups", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkGroupsOutput]
    }
  }

  /**
    * A query, where <code>QueryString</code> is the list of SQL query statements that comprise the query.
    */
  @js.native
  trait NamedQuery extends js.Object {
    var Database: DatabaseString
    var Name: NameString
    var QueryString: QueryString
    var Description: js.UndefOr[DescriptionString]
    var NamedQueryId: js.UndefOr[NamedQueryId]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  object NamedQuery {
    def apply(
        Database: DatabaseString,
        Name: NameString,
        QueryString: QueryString,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): NamedQuery = {
      val __obj = js.Dictionary[js.Any](
        "Database"    -> Database.asInstanceOf[js.Any],
        "Name"        -> Name.asInstanceOf[js.Any],
        "QueryString" -> QueryString.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      NamedQueryId.foreach(__v => __obj.update("NamedQueryId", __v.asInstanceOf[js.Any]))
      WorkGroup.foreach(__v => __obj.update("WorkGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NamedQuery]
    }
  }

  /**
    * Information about a single instance of a query execution.
    */
  @js.native
  trait QueryExecution extends js.Object {
    var Query: js.UndefOr[QueryString]
    var QueryExecutionContext: js.UndefOr[QueryExecutionContext]
    var QueryExecutionId: js.UndefOr[QueryExecutionId]
    var ResultConfiguration: js.UndefOr[ResultConfiguration]
    var StatementType: js.UndefOr[StatementType]
    var Statistics: js.UndefOr[QueryExecutionStatistics]
    var Status: js.UndefOr[QueryExecutionStatus]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  object QueryExecution {
    def apply(
        Query: js.UndefOr[QueryString] = js.undefined,
        QueryExecutionContext: js.UndefOr[QueryExecutionContext] = js.undefined,
        QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined,
        ResultConfiguration: js.UndefOr[ResultConfiguration] = js.undefined,
        StatementType: js.UndefOr[StatementType] = js.undefined,
        Statistics: js.UndefOr[QueryExecutionStatistics] = js.undefined,
        Status: js.UndefOr[QueryExecutionStatus] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): QueryExecution = {
      val __obj = js.Dictionary.empty[js.Any]
      Query.foreach(__v => __obj.update("Query", __v.asInstanceOf[js.Any]))
      QueryExecutionContext.foreach(__v => __obj.update("QueryExecutionContext", __v.asInstanceOf[js.Any]))
      QueryExecutionId.foreach(__v => __obj.update("QueryExecutionId", __v.asInstanceOf[js.Any]))
      ResultConfiguration.foreach(__v => __obj.update("ResultConfiguration", __v.asInstanceOf[js.Any]))
      StatementType.foreach(__v => __obj.update("StatementType", __v.asInstanceOf[js.Any]))
      Statistics.foreach(__v => __obj.update("Statistics", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      WorkGroup.foreach(__v => __obj.update("WorkGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryExecution]
    }
  }

  /**
    * The database in which the query execution occurs.
    */
  @js.native
  trait QueryExecutionContext extends js.Object {
    var Database: js.UndefOr[DatabaseString]
  }

  object QueryExecutionContext {
    def apply(
        Database: js.UndefOr[DatabaseString] = js.undefined
    ): QueryExecutionContext = {
      val __obj = js.Dictionary.empty[js.Any]
      Database.foreach(__v => __obj.update("Database", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryExecutionContext]
    }
  }

  object QueryExecutionStateEnum {
    val QUEUED    = "QUEUED"
    val RUNNING   = "RUNNING"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED    = "FAILED"
    val CANCELLED = "CANCELLED"

    val values = js.Object.freeze(js.Array(QUEUED, RUNNING, SUCCEEDED, FAILED, CANCELLED))
  }

  /**
    * The amount of data scanned during the query execution and the amount of time that it took to execute, and the type of statement that was run.
    */
  @js.native
  trait QueryExecutionStatistics extends js.Object {
    var DataScannedInBytes: js.UndefOr[Double]
    var EngineExecutionTimeInMillis: js.UndefOr[Double]
  }

  object QueryExecutionStatistics {
    def apply(
        DataScannedInBytes: js.UndefOr[Double] = js.undefined,
        EngineExecutionTimeInMillis: js.UndefOr[Double] = js.undefined
    ): QueryExecutionStatistics = {
      val __obj = js.Dictionary.empty[js.Any]
      DataScannedInBytes.foreach(__v => __obj.update("DataScannedInBytes", __v.asInstanceOf[js.Any]))
      EngineExecutionTimeInMillis.foreach(__v => __obj.update("EngineExecutionTimeInMillis", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryExecutionStatistics]
    }
  }

  /**
    * The completion date, current state, submission time, and state change reason (if applicable) for the query execution.
    */
  @js.native
  trait QueryExecutionStatus extends js.Object {
    var CompletionDateTime: js.UndefOr[Date]
    var State: js.UndefOr[QueryExecutionState]
    var StateChangeReason: js.UndefOr[String]
    var SubmissionDateTime: js.UndefOr[Date]
  }

  object QueryExecutionStatus {
    def apply(
        CompletionDateTime: js.UndefOr[Date] = js.undefined,
        State: js.UndefOr[QueryExecutionState] = js.undefined,
        StateChangeReason: js.UndefOr[String] = js.undefined,
        SubmissionDateTime: js.UndefOr[Date] = js.undefined
    ): QueryExecutionStatus = {
      val __obj = js.Dictionary.empty[js.Any]
      CompletionDateTime.foreach(__v => __obj.update("CompletionDateTime", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      StateChangeReason.foreach(__v => __obj.update("StateChangeReason", __v.asInstanceOf[js.Any]))
      SubmissionDateTime.foreach(__v => __obj.update("SubmissionDateTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryExecutionStatus]
    }
  }

  /**
    * The location in Amazon S3 where query results are stored and the encryption option, if any, used for query results. These are known as "client-side settings". If workgroup settings override client-side settings, then the query uses the workgroup settings.
    */
  @js.native
  trait ResultConfiguration extends js.Object {
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var OutputLocation: js.UndefOr[String]
  }

  object ResultConfiguration {
    def apply(
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        OutputLocation: js.UndefOr[String] = js.undefined
    ): ResultConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      EncryptionConfiguration.foreach(__v => __obj.update("EncryptionConfiguration", __v.asInstanceOf[js.Any]))
      OutputLocation.foreach(__v => __obj.update("OutputLocation", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResultConfiguration]
    }
  }

  /**
    * The information about the updates in the query results, such as output location and encryption configuration for the query results.
    */
  @js.native
  trait ResultConfigurationUpdates extends js.Object {
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var OutputLocation: js.UndefOr[String]
    var RemoveEncryptionConfiguration: js.UndefOr[BoxedBoolean]
    var RemoveOutputLocation: js.UndefOr[BoxedBoolean]
  }

  object ResultConfigurationUpdates {
    def apply(
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        OutputLocation: js.UndefOr[String] = js.undefined,
        RemoveEncryptionConfiguration: js.UndefOr[BoxedBoolean] = js.undefined,
        RemoveOutputLocation: js.UndefOr[BoxedBoolean] = js.undefined
    ): ResultConfigurationUpdates = {
      val __obj = js.Dictionary.empty[js.Any]
      EncryptionConfiguration.foreach(__v => __obj.update("EncryptionConfiguration", __v.asInstanceOf[js.Any]))
      OutputLocation.foreach(__v => __obj.update("OutputLocation", __v.asInstanceOf[js.Any]))
      RemoveEncryptionConfiguration.foreach(
        __v => __obj.update("RemoveEncryptionConfiguration", __v.asInstanceOf[js.Any])
      )
      RemoveOutputLocation.foreach(__v => __obj.update("RemoveOutputLocation", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResultConfigurationUpdates]
    }
  }

  /**
    * The metadata and rows that comprise a query result set. The metadata describes the column structure and data types.
    */
  @js.native
  trait ResultSet extends js.Object {
    var ResultSetMetadata: js.UndefOr[ResultSetMetadata]
    var Rows: js.UndefOr[RowList]
  }

  object ResultSet {
    def apply(
        ResultSetMetadata: js.UndefOr[ResultSetMetadata] = js.undefined,
        Rows: js.UndefOr[RowList] = js.undefined
    ): ResultSet = {
      val __obj = js.Dictionary.empty[js.Any]
      ResultSetMetadata.foreach(__v => __obj.update("ResultSetMetadata", __v.asInstanceOf[js.Any]))
      Rows.foreach(__v => __obj.update("Rows", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResultSet]
    }
  }

  /**
    * The metadata that describes the column structure and data types of a table of query results.
    */
  @js.native
  trait ResultSetMetadata extends js.Object {
    var ColumnInfo: js.UndefOr[ColumnInfoList]
  }

  object ResultSetMetadata {
    def apply(
        ColumnInfo: js.UndefOr[ColumnInfoList] = js.undefined
    ): ResultSetMetadata = {
      val __obj = js.Dictionary.empty[js.Any]
      ColumnInfo.foreach(__v => __obj.update("ColumnInfo", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResultSetMetadata]
    }
  }

  /**
    * The rows that comprise a query result table.
    */
  @js.native
  trait Row extends js.Object {
    var Data: js.UndefOr[datumList]
  }

  object Row {
    def apply(
        Data: js.UndefOr[datumList] = js.undefined
    ): Row = {
      val __obj = js.Dictionary.empty[js.Any]
      Data.foreach(__v => __obj.update("Data", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Row]
    }
  }

  @js.native
  trait StartQueryExecutionInput extends js.Object {
    var QueryString: QueryString
    var ClientRequestToken: js.UndefOr[IdempotencyToken]
    var QueryExecutionContext: js.UndefOr[QueryExecutionContext]
    var ResultConfiguration: js.UndefOr[ResultConfiguration]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  object StartQueryExecutionInput {
    def apply(
        QueryString: QueryString,
        ClientRequestToken: js.UndefOr[IdempotencyToken] = js.undefined,
        QueryExecutionContext: js.UndefOr[QueryExecutionContext] = js.undefined,
        ResultConfiguration: js.UndefOr[ResultConfiguration] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): StartQueryExecutionInput = {
      val __obj = js.Dictionary[js.Any](
        "QueryString" -> QueryString.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.update("ClientRequestToken", __v.asInstanceOf[js.Any]))
      QueryExecutionContext.foreach(__v => __obj.update("QueryExecutionContext", __v.asInstanceOf[js.Any]))
      ResultConfiguration.foreach(__v => __obj.update("ResultConfiguration", __v.asInstanceOf[js.Any]))
      WorkGroup.foreach(__v => __obj.update("WorkGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartQueryExecutionInput]
    }
  }

  @js.native
  trait StartQueryExecutionOutput extends js.Object {
    var QueryExecutionId: js.UndefOr[QueryExecutionId]
  }

  object StartQueryExecutionOutput {
    def apply(
        QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined
    ): StartQueryExecutionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      QueryExecutionId.foreach(__v => __obj.update("QueryExecutionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartQueryExecutionOutput]
    }
  }

  object StatementTypeEnum {
    val DDL     = "DDL"
    val DML     = "DML"
    val UTILITY = "UTILITY"

    val values = js.Object.freeze(js.Array(DDL, DML, UTILITY))
  }

  @js.native
  trait StopQueryExecutionInput extends js.Object {
    var QueryExecutionId: QueryExecutionId
  }

  object StopQueryExecutionInput {
    def apply(
        QueryExecutionId: QueryExecutionId
    ): StopQueryExecutionInput = {
      val __obj = js.Dictionary[js.Any](
        "QueryExecutionId" -> QueryExecutionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopQueryExecutionInput]
    }
  }

  @js.native
  trait StopQueryExecutionOutput extends js.Object {}

  object StopQueryExecutionOutput {
    def apply(
        ): StopQueryExecutionOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[StopQueryExecutionOutput]
    }
  }

  /**
    * A tag that you can add to a resource. A tag is a label that you assign to an AWS Athena resource (a workgroup). Each tag consists of a key and an optional value, both of which you define. Tags enable you to categorize workgroups in Athena, for example, by purpose, owner, or environment. Use a consistent set of tag keys to make it easier to search and filter workgroups in your account. The maximum tag key length is 128 Unicode characters in UTF-8. The maximum tag value length is 256 Unicode characters in UTF-8. You can use letters and numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys and values are case-sensitive. Tag keys must be unique per resource.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceInput {
    def apply(
        ResourceARN: AmazonResourceName,
        Tags: TagList
    ): TagResourceInput = {
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
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
    * Information about a named query ID that could not be processed.
    */
  @js.native
  trait UnprocessedNamedQueryId extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var NamedQueryId: js.UndefOr[NamedQueryId]
  }

  object UnprocessedNamedQueryId {
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined
    ): UnprocessedNamedQueryId = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorCode.foreach(__v => __obj.update("ErrorCode", __v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.update("ErrorMessage", __v.asInstanceOf[js.Any]))
      NamedQueryId.foreach(__v => __obj.update("NamedQueryId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnprocessedNamedQueryId]
    }
  }

  /**
    * Describes a query execution that failed to process.
    */
  @js.native
  trait UnprocessedQueryExecutionId extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var QueryExecutionId: js.UndefOr[QueryExecutionId]
  }

  object UnprocessedQueryExecutionId {
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined
    ): UnprocessedQueryExecutionId = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorCode.foreach(__v => __obj.update("ErrorCode", __v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.update("ErrorMessage", __v.asInstanceOf[js.Any]))
      QueryExecutionId.foreach(__v => __obj.update("QueryExecutionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnprocessedQueryExecutionId]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceInput {
    def apply(
        ResourceARN: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceInput = {
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
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

  @js.native
  trait UpdateWorkGroupInput extends js.Object {
    var WorkGroup: WorkGroupName
    var ConfigurationUpdates: js.UndefOr[WorkGroupConfigurationUpdates]
    var Description: js.UndefOr[WorkGroupDescriptionString]
    var State: js.UndefOr[WorkGroupState]
  }

  object UpdateWorkGroupInput {
    def apply(
        WorkGroup: WorkGroupName,
        ConfigurationUpdates: js.UndefOr[WorkGroupConfigurationUpdates] = js.undefined,
        Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined,
        State: js.UndefOr[WorkGroupState] = js.undefined
    ): UpdateWorkGroupInput = {
      val __obj = js.Dictionary[js.Any](
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any]
      )

      ConfigurationUpdates.foreach(__v => __obj.update("ConfigurationUpdates", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkGroupInput]
    }
  }

  @js.native
  trait UpdateWorkGroupOutput extends js.Object {}

  object UpdateWorkGroupOutput {
    def apply(
        ): UpdateWorkGroupOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateWorkGroupOutput]
    }
  }

  /**
    * A workgroup, which contains a name, description, creation time, state, and other configuration, listed under Configuration. Each workgroup enables you to isolate queries for you or your group of users from other queries in the same account, to configure the query results location and the encryption configuration (known as workgroup settings), to enable sending query metrics to Amazon CloudWatch, and to establish per-query data usage control limits for all queries in a workgroup. The workgroup settings override is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See [[WorkGroupConfiguration.EnforceWorkGroupConfiguration]].
    */
  @js.native
  trait WorkGroup extends js.Object {
    var Name: WorkGroupName
    var Configuration: js.UndefOr[WorkGroupConfiguration]
    var CreationTime: js.UndefOr[Date]
    var Description: js.UndefOr[WorkGroupDescriptionString]
    var State: js.UndefOr[WorkGroupState]
  }

  object WorkGroup {
    def apply(
        Name: WorkGroupName,
        Configuration: js.UndefOr[WorkGroupConfiguration] = js.undefined,
        CreationTime: js.UndefOr[Date] = js.undefined,
        Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined,
        State: js.UndefOr[WorkGroupState] = js.undefined
    ): WorkGroup = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Configuration.foreach(__v => __obj.update("Configuration", __v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkGroup]
    }
  }

  /**
    * The configuration of the workgroup, which includes the location in Amazon S3 where query results are stored, the encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup and whether workgroup settings override query settings, and the data usage limits for the amount of data scanned per query or per workgroup. The workgroup settings override is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See EnforceWorkGroupConfiguration.
    */
  @js.native
  trait WorkGroupConfiguration extends js.Object {
    var BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue]
    var EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean]
    var PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean]
    var RequesterPaysEnabled: js.UndefOr[BoxedBoolean]
    var ResultConfiguration: js.UndefOr[ResultConfiguration]
  }

  object WorkGroupConfiguration {
    def apply(
        BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.undefined,
        EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.undefined,
        PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.undefined,
        RequesterPaysEnabled: js.UndefOr[BoxedBoolean] = js.undefined,
        ResultConfiguration: js.UndefOr[ResultConfiguration] = js.undefined
    ): WorkGroupConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      BytesScannedCutoffPerQuery.foreach(__v => __obj.update("BytesScannedCutoffPerQuery", __v.asInstanceOf[js.Any]))
      EnforceWorkGroupConfiguration.foreach(
        __v => __obj.update("EnforceWorkGroupConfiguration", __v.asInstanceOf[js.Any])
      )
      PublishCloudWatchMetricsEnabled.foreach(
        __v => __obj.update("PublishCloudWatchMetricsEnabled", __v.asInstanceOf[js.Any])
      )
      RequesterPaysEnabled.foreach(__v => __obj.update("RequesterPaysEnabled", __v.asInstanceOf[js.Any]))
      ResultConfiguration.foreach(__v => __obj.update("ResultConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkGroupConfiguration]
    }
  }

  /**
    * The configuration information that will be updated for this workgroup, which includes the location in Amazon S3 where query results are stored, the encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup, whether the workgroup settings override the client-side settings, and the data usage limit for the amount of bytes scanned per query, if it is specified.
    */
  @js.native
  trait WorkGroupConfigurationUpdates extends js.Object {
    var BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue]
    var EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean]
    var PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean]
    var RemoveBytesScannedCutoffPerQuery: js.UndefOr[BoxedBoolean]
    var RequesterPaysEnabled: js.UndefOr[BoxedBoolean]
    var ResultConfigurationUpdates: js.UndefOr[ResultConfigurationUpdates]
  }

  object WorkGroupConfigurationUpdates {
    def apply(
        BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.undefined,
        EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.undefined,
        PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.undefined,
        RemoveBytesScannedCutoffPerQuery: js.UndefOr[BoxedBoolean] = js.undefined,
        RequesterPaysEnabled: js.UndefOr[BoxedBoolean] = js.undefined,
        ResultConfigurationUpdates: js.UndefOr[ResultConfigurationUpdates] = js.undefined
    ): WorkGroupConfigurationUpdates = {
      val __obj = js.Dictionary.empty[js.Any]
      BytesScannedCutoffPerQuery.foreach(__v => __obj.update("BytesScannedCutoffPerQuery", __v.asInstanceOf[js.Any]))
      EnforceWorkGroupConfiguration.foreach(
        __v => __obj.update("EnforceWorkGroupConfiguration", __v.asInstanceOf[js.Any])
      )
      PublishCloudWatchMetricsEnabled.foreach(
        __v => __obj.update("PublishCloudWatchMetricsEnabled", __v.asInstanceOf[js.Any])
      )
      RemoveBytesScannedCutoffPerQuery.foreach(
        __v => __obj.update("RemoveBytesScannedCutoffPerQuery", __v.asInstanceOf[js.Any])
      )
      RequesterPaysEnabled.foreach(__v => __obj.update("RequesterPaysEnabled", __v.asInstanceOf[js.Any]))
      ResultConfigurationUpdates.foreach(__v => __obj.update("ResultConfigurationUpdates", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkGroupConfigurationUpdates]
    }
  }

  object WorkGroupStateEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * The summary information for the workgroup, which includes its name, state, description, and the date and time it was created.
    */
  @js.native
  trait WorkGroupSummary extends js.Object {
    var CreationTime: js.UndefOr[Date]
    var Description: js.UndefOr[WorkGroupDescriptionString]
    var Name: js.UndefOr[WorkGroupName]
    var State: js.UndefOr[WorkGroupState]
  }

  object WorkGroupSummary {
    def apply(
        CreationTime: js.UndefOr[Date] = js.undefined,
        Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined,
        Name: js.UndefOr[WorkGroupName] = js.undefined,
        State: js.UndefOr[WorkGroupState] = js.undefined
    ): WorkGroupSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkGroupSummary]
    }
  }
}
