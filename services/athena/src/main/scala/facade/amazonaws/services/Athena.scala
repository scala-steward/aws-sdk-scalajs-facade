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
    @inline def batchGetNamedQueryFuture(params: BatchGetNamedQueryInput): Future[BatchGetNamedQueryOutput] =
      service.batchGetNamedQuery(params).promise.toFuture
    @inline def batchGetQueryExecutionFuture(
        params: BatchGetQueryExecutionInput
    ): Future[BatchGetQueryExecutionOutput] = service.batchGetQueryExecution(params).promise.toFuture
    @inline def createNamedQueryFuture(params: CreateNamedQueryInput): Future[CreateNamedQueryOutput] =
      service.createNamedQuery(params).promise.toFuture
    @inline def createWorkGroupFuture(params: CreateWorkGroupInput): Future[CreateWorkGroupOutput] =
      service.createWorkGroup(params).promise.toFuture
    @inline def deleteNamedQueryFuture(params: DeleteNamedQueryInput): Future[DeleteNamedQueryOutput] =
      service.deleteNamedQuery(params).promise.toFuture
    @inline def deleteWorkGroupFuture(params: DeleteWorkGroupInput): Future[DeleteWorkGroupOutput] =
      service.deleteWorkGroup(params).promise.toFuture
    @inline def getNamedQueryFuture(params: GetNamedQueryInput): Future[GetNamedQueryOutput] =
      service.getNamedQuery(params).promise.toFuture
    @inline def getQueryExecutionFuture(params: GetQueryExecutionInput): Future[GetQueryExecutionOutput] =
      service.getQueryExecution(params).promise.toFuture
    @inline def getQueryResultsFuture(params: GetQueryResultsInput): Future[GetQueryResultsOutput] =
      service.getQueryResults(params).promise.toFuture
    @inline def getWorkGroupFuture(params: GetWorkGroupInput): Future[GetWorkGroupOutput] =
      service.getWorkGroup(params).promise.toFuture
    @inline def listNamedQueriesFuture(params: ListNamedQueriesInput): Future[ListNamedQueriesOutput] =
      service.listNamedQueries(params).promise.toFuture
    @inline def listQueryExecutionsFuture(params: ListQueryExecutionsInput): Future[ListQueryExecutionsOutput] =
      service.listQueryExecutions(params).promise.toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] =
      service.listTagsForResource(params).promise.toFuture
    @inline def listWorkGroupsFuture(params: ListWorkGroupsInput): Future[ListWorkGroupsOutput] =
      service.listWorkGroups(params).promise.toFuture
    @inline def startQueryExecutionFuture(params: StartQueryExecutionInput): Future[StartQueryExecutionOutput] =
      service.startQueryExecution(params).promise.toFuture
    @inline def stopQueryExecutionFuture(params: StopQueryExecutionInput): Future[StopQueryExecutionOutput] =
      service.stopQueryExecution(params).promise.toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] =
      service.tagResource(params).promise.toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] =
      service.untagResource(params).promise.toFuture
    @inline def updateWorkGroupFuture(params: UpdateWorkGroupInput): Future[UpdateWorkGroupOutput] =
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
    @inline
    def apply(
        NamedQueryIds: NamedQueryIdList
    ): BatchGetNamedQueryInput = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        NamedQueries: js.UndefOr[NamedQueryList] = js.undefined,
        UnprocessedNamedQueryIds: js.UndefOr[UnprocessedNamedQueryIdList] = js.undefined
    ): BatchGetNamedQueryOutput = {
      val __obj = js.Dynamic.literal()
      NamedQueries.foreach(__v => __obj.updateDynamic("NamedQueries")(__v.asInstanceOf[js.Any]))
      UnprocessedNamedQueryIds.foreach(__v => __obj.updateDynamic("UnprocessedNamedQueryIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetNamedQueryOutput]
    }
  }

  @js.native
  trait BatchGetQueryExecutionInput extends js.Object {
    var QueryExecutionIds: QueryExecutionIdList
  }

  object BatchGetQueryExecutionInput {
    @inline
    def apply(
        QueryExecutionIds: QueryExecutionIdList
    ): BatchGetQueryExecutionInput = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        QueryExecutions: js.UndefOr[QueryExecutionList] = js.undefined,
        UnprocessedQueryExecutionIds: js.UndefOr[UnprocessedQueryExecutionIdList] = js.undefined
    ): BatchGetQueryExecutionOutput = {
      val __obj = js.Dynamic.literal()
      QueryExecutions.foreach(__v => __obj.updateDynamic("QueryExecutions")(__v.asInstanceOf[js.Any]))
      UnprocessedQueryExecutionIds.foreach(
        __v => __obj.updateDynamic("UnprocessedQueryExecutionIds")(__v.asInstanceOf[js.Any])
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      CaseSensitive.foreach(__v => __obj.updateDynamic("CaseSensitive")(__v.asInstanceOf[js.Any]))
      CatalogName.foreach(__v => __obj.updateDynamic("CatalogName")(__v.asInstanceOf[js.Any]))
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      Nullable.foreach(__v => __obj.updateDynamic("Nullable")(__v.asInstanceOf[js.Any]))
      Precision.foreach(__v => __obj.updateDynamic("Precision")(__v.asInstanceOf[js.Any]))
      Scale.foreach(__v => __obj.updateDynamic("Scale")(__v.asInstanceOf[js.Any]))
      SchemaName.foreach(__v => __obj.updateDynamic("SchemaName")(__v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.updateDynamic("TableName")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Database: DatabaseString,
        Name: NameString,
        QueryString: QueryString,
        ClientRequestToken: js.UndefOr[IdempotencyToken] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): CreateNamedQueryInput = {
      val __obj = js.Dynamic.literal(
        "Database"    -> Database.asInstanceOf[js.Any],
        "Name"        -> Name.asInstanceOf[js.Any],
        "QueryString" -> QueryString.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      WorkGroup.foreach(__v => __obj.updateDynamic("WorkGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNamedQueryInput]
    }
  }

  @js.native
  trait CreateNamedQueryOutput extends js.Object {
    var NamedQueryId: js.UndefOr[NamedQueryId]
  }

  object CreateNamedQueryOutput {
    @inline
    def apply(
        NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined
    ): CreateNamedQueryOutput = {
      val __obj = js.Dynamic.literal()
      NamedQueryId.foreach(__v => __obj.updateDynamic("NamedQueryId")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Name: WorkGroupName,
        Configuration: js.UndefOr[WorkGroupConfiguration] = js.undefined,
        Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateWorkGroupInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkGroupInput]
    }
  }

  @js.native
  trait CreateWorkGroupOutput extends js.Object {}

  object CreateWorkGroupOutput {
    @inline
    def apply(
        ): CreateWorkGroupOutput = {
      val __obj = js.Dynamic.literal()

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
    @inline
    def apply(
        VarCharValue: js.UndefOr[datumString] = js.undefined
    ): Datum = {
      val __obj = js.Dynamic.literal()
      VarCharValue.foreach(__v => __obj.updateDynamic("VarCharValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Datum]
    }
  }

  @js.native
  trait DeleteNamedQueryInput extends js.Object {
    var NamedQueryId: NamedQueryId
  }

  object DeleteNamedQueryInput {
    @inline
    def apply(
        NamedQueryId: NamedQueryId
    ): DeleteNamedQueryInput = {
      val __obj = js.Dynamic.literal(
        "NamedQueryId" -> NamedQueryId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteNamedQueryInput]
    }
  }

  @js.native
  trait DeleteNamedQueryOutput extends js.Object {}

  object DeleteNamedQueryOutput {
    @inline
    def apply(
        ): DeleteNamedQueryOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteNamedQueryOutput]
    }
  }

  @js.native
  trait DeleteWorkGroupInput extends js.Object {
    var WorkGroup: WorkGroupName
    var RecursiveDeleteOption: js.UndefOr[BoxedBoolean]
  }

  object DeleteWorkGroupInput {
    @inline
    def apply(
        WorkGroup: WorkGroupName,
        RecursiveDeleteOption: js.UndefOr[BoxedBoolean] = js.undefined
    ): DeleteWorkGroupInput = {
      val __obj = js.Dynamic.literal(
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any]
      )

      RecursiveDeleteOption.foreach(__v => __obj.updateDynamic("RecursiveDeleteOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteWorkGroupInput]
    }
  }

  @js.native
  trait DeleteWorkGroupOutput extends js.Object {}

  object DeleteWorkGroupOutput {
    @inline
    def apply(
        ): DeleteWorkGroupOutput = {
      val __obj = js.Dynamic.literal()

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
    @inline
    def apply(
        EncryptionOption: EncryptionOption,
        KmsKey: js.UndefOr[String] = js.undefined
    ): EncryptionConfiguration = {
      val __obj = js.Dynamic.literal(
        "EncryptionOption" -> EncryptionOption.asInstanceOf[js.Any]
      )

      KmsKey.foreach(__v => __obj.updateDynamic("KmsKey")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        NamedQueryId: NamedQueryId
    ): GetNamedQueryInput = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        NamedQuery: js.UndefOr[NamedQuery] = js.undefined
    ): GetNamedQueryOutput = {
      val __obj = js.Dynamic.literal()
      NamedQuery.foreach(__v => __obj.updateDynamic("NamedQuery")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNamedQueryOutput]
    }
  }

  @js.native
  trait GetQueryExecutionInput extends js.Object {
    var QueryExecutionId: QueryExecutionId
  }

  object GetQueryExecutionInput {
    @inline
    def apply(
        QueryExecutionId: QueryExecutionId
    ): GetQueryExecutionInput = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        QueryExecution: js.UndefOr[QueryExecution] = js.undefined
    ): GetQueryExecutionOutput = {
      val __obj = js.Dynamic.literal()
      QueryExecution.foreach(__v => __obj.updateDynamic("QueryExecution")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        QueryExecutionId: QueryExecutionId,
        MaxResults: js.UndefOr[MaxQueryResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetQueryResultsInput = {
      val __obj = js.Dynamic.literal(
        "QueryExecutionId" -> QueryExecutionId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        ResultSet: js.UndefOr[ResultSet] = js.undefined,
        UpdateCount: js.UndefOr[Double] = js.undefined
    ): GetQueryResultsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResultSet.foreach(__v => __obj.updateDynamic("ResultSet")(__v.asInstanceOf[js.Any]))
      UpdateCount.foreach(__v => __obj.updateDynamic("UpdateCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQueryResultsOutput]
    }
  }

  @js.native
  trait GetWorkGroupInput extends js.Object {
    var WorkGroup: WorkGroupName
  }

  object GetWorkGroupInput {
    @inline
    def apply(
        WorkGroup: WorkGroupName
    ): GetWorkGroupInput = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        WorkGroup: js.UndefOr[WorkGroup] = js.undefined
    ): GetWorkGroupOutput = {
      val __obj = js.Dynamic.literal()
      WorkGroup.foreach(__v => __obj.updateDynamic("WorkGroup")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxNamedQueriesCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): ListNamedQueriesInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WorkGroup.foreach(__v => __obj.updateDynamic("WorkGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNamedQueriesInput]
    }
  }

  @js.native
  trait ListNamedQueriesOutput extends js.Object {
    var NamedQueryIds: js.UndefOr[NamedQueryIdList]
    var NextToken: js.UndefOr[Token]
  }

  object ListNamedQueriesOutput {
    @inline
    def apply(
        NamedQueryIds: js.UndefOr[NamedQueryIdList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListNamedQueriesOutput = {
      val __obj = js.Dynamic.literal()
      NamedQueryIds.foreach(__v => __obj.updateDynamic("NamedQueryIds")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxQueryExecutionsCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): ListQueryExecutionsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WorkGroup.foreach(__v => __obj.updateDynamic("WorkGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueryExecutionsInput]
    }
  }

  @js.native
  trait ListQueryExecutionsOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var QueryExecutionIds: js.UndefOr[QueryExecutionIdList]
  }

  object ListQueryExecutionsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        QueryExecutionIds: js.UndefOr[QueryExecutionIdList] = js.undefined
    ): ListQueryExecutionsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      QueryExecutionIds.foreach(__v => __obj.updateDynamic("QueryExecutionIds")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        MaxResults: js.UndefOr[MaxTagsCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListTagsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
    }
  }

  @js.native
  trait ListWorkGroupsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxWorkGroupsCount]
    var NextToken: js.UndefOr[Token]
  }

  object ListWorkGroupsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxWorkGroupsCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListWorkGroupsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkGroupsInput]
    }
  }

  @js.native
  trait ListWorkGroupsOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var WorkGroups: js.UndefOr[WorkGroupsList]
  }

  object ListWorkGroupsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        WorkGroups: js.UndefOr[WorkGroupsList] = js.undefined
    ): ListWorkGroupsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WorkGroups.foreach(__v => __obj.updateDynamic("WorkGroups")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Database: DatabaseString,
        Name: NameString,
        QueryString: QueryString,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): NamedQuery = {
      val __obj = js.Dynamic.literal(
        "Database"    -> Database.asInstanceOf[js.Any],
        "Name"        -> Name.asInstanceOf[js.Any],
        "QueryString" -> QueryString.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      NamedQueryId.foreach(__v => __obj.updateDynamic("NamedQueryId")(__v.asInstanceOf[js.Any]))
      WorkGroup.foreach(__v => __obj.updateDynamic("WorkGroup")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal()
      Query.foreach(__v => __obj.updateDynamic("Query")(__v.asInstanceOf[js.Any]))
      QueryExecutionContext.foreach(__v => __obj.updateDynamic("QueryExecutionContext")(__v.asInstanceOf[js.Any]))
      QueryExecutionId.foreach(__v => __obj.updateDynamic("QueryExecutionId")(__v.asInstanceOf[js.Any]))
      ResultConfiguration.foreach(__v => __obj.updateDynamic("ResultConfiguration")(__v.asInstanceOf[js.Any]))
      StatementType.foreach(__v => __obj.updateDynamic("StatementType")(__v.asInstanceOf[js.Any]))
      Statistics.foreach(__v => __obj.updateDynamic("Statistics")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      WorkGroup.foreach(__v => __obj.updateDynamic("WorkGroup")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Database: js.UndefOr[DatabaseString] = js.undefined
    ): QueryExecutionContext = {
      val __obj = js.Dynamic.literal()
      Database.foreach(__v => __obj.updateDynamic("Database")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DataScannedInBytes: js.UndefOr[Double] = js.undefined,
        EngineExecutionTimeInMillis: js.UndefOr[Double] = js.undefined
    ): QueryExecutionStatistics = {
      val __obj = js.Dynamic.literal()
      DataScannedInBytes.foreach(__v => __obj.updateDynamic("DataScannedInBytes")(__v.asInstanceOf[js.Any]))
      EngineExecutionTimeInMillis.foreach(
        __v => __obj.updateDynamic("EngineExecutionTimeInMillis")(__v.asInstanceOf[js.Any])
      )
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
    @inline
    def apply(
        CompletionDateTime: js.UndefOr[Date] = js.undefined,
        State: js.UndefOr[QueryExecutionState] = js.undefined,
        StateChangeReason: js.UndefOr[String] = js.undefined,
        SubmissionDateTime: js.UndefOr[Date] = js.undefined
    ): QueryExecutionStatus = {
      val __obj = js.Dynamic.literal()
      CompletionDateTime.foreach(__v => __obj.updateDynamic("CompletionDateTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateChangeReason.foreach(__v => __obj.updateDynamic("StateChangeReason")(__v.asInstanceOf[js.Any]))
      SubmissionDateTime.foreach(__v => __obj.updateDynamic("SubmissionDateTime")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        OutputLocation: js.UndefOr[String] = js.undefined
    ): ResultConfiguration = {
      val __obj = js.Dynamic.literal()
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      OutputLocation.foreach(__v => __obj.updateDynamic("OutputLocation")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        OutputLocation: js.UndefOr[String] = js.undefined,
        RemoveEncryptionConfiguration: js.UndefOr[BoxedBoolean] = js.undefined,
        RemoveOutputLocation: js.UndefOr[BoxedBoolean] = js.undefined
    ): ResultConfigurationUpdates = {
      val __obj = js.Dynamic.literal()
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      OutputLocation.foreach(__v => __obj.updateDynamic("OutputLocation")(__v.asInstanceOf[js.Any]))
      RemoveEncryptionConfiguration.foreach(
        __v => __obj.updateDynamic("RemoveEncryptionConfiguration")(__v.asInstanceOf[js.Any])
      )
      RemoveOutputLocation.foreach(__v => __obj.updateDynamic("RemoveOutputLocation")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ResultSetMetadata: js.UndefOr[ResultSetMetadata] = js.undefined,
        Rows: js.UndefOr[RowList] = js.undefined
    ): ResultSet = {
      val __obj = js.Dynamic.literal()
      ResultSetMetadata.foreach(__v => __obj.updateDynamic("ResultSetMetadata")(__v.asInstanceOf[js.Any]))
      Rows.foreach(__v => __obj.updateDynamic("Rows")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ColumnInfo: js.UndefOr[ColumnInfoList] = js.undefined
    ): ResultSetMetadata = {
      val __obj = js.Dynamic.literal()
      ColumnInfo.foreach(__v => __obj.updateDynamic("ColumnInfo")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Data: js.UndefOr[datumList] = js.undefined
    ): Row = {
      val __obj = js.Dynamic.literal()
      Data.foreach(__v => __obj.updateDynamic("Data")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        QueryString: QueryString,
        ClientRequestToken: js.UndefOr[IdempotencyToken] = js.undefined,
        QueryExecutionContext: js.UndefOr[QueryExecutionContext] = js.undefined,
        ResultConfiguration: js.UndefOr[ResultConfiguration] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): StartQueryExecutionInput = {
      val __obj = js.Dynamic.literal(
        "QueryString" -> QueryString.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      QueryExecutionContext.foreach(__v => __obj.updateDynamic("QueryExecutionContext")(__v.asInstanceOf[js.Any]))
      ResultConfiguration.foreach(__v => __obj.updateDynamic("ResultConfiguration")(__v.asInstanceOf[js.Any]))
      WorkGroup.foreach(__v => __obj.updateDynamic("WorkGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartQueryExecutionInput]
    }
  }

  @js.native
  trait StartQueryExecutionOutput extends js.Object {
    var QueryExecutionId: js.UndefOr[QueryExecutionId]
  }

  object StartQueryExecutionOutput {
    @inline
    def apply(
        QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined
    ): StartQueryExecutionOutput = {
      val __obj = js.Dynamic.literal()
      QueryExecutionId.foreach(__v => __obj.updateDynamic("QueryExecutionId")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        QueryExecutionId: QueryExecutionId
    ): StopQueryExecutionInput = {
      val __obj = js.Dynamic.literal(
        "QueryExecutionId" -> QueryExecutionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopQueryExecutionInput]
    }
  }

  @js.native
  trait StopQueryExecutionOutput extends js.Object {}

  object StopQueryExecutionOutput {
    @inline
    def apply(
        ): StopQueryExecutionOutput = {
      val __obj = js.Dynamic.literal()

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
    @inline
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceInput {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        Tags: TagList
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceOutput extends js.Object {}

  object TagResourceOutput {
    @inline
    def apply(
        ): TagResourceOutput = {
      val __obj = js.Dynamic.literal()

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
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined
    ): UnprocessedNamedQueryId = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      NamedQueryId.foreach(__v => __obj.updateDynamic("NamedQueryId")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined
    ): UnprocessedQueryExecutionId = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      QueryExecutionId.foreach(__v => __obj.updateDynamic("QueryExecutionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnprocessedQueryExecutionId]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceInput {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceOutput extends js.Object {}

  object UntagResourceOutput {
    @inline
    def apply(
        ): UntagResourceOutput = {
      val __obj = js.Dynamic.literal()

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
    @inline
    def apply(
        WorkGroup: WorkGroupName,
        ConfigurationUpdates: js.UndefOr[WorkGroupConfigurationUpdates] = js.undefined,
        Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined,
        State: js.UndefOr[WorkGroupState] = js.undefined
    ): UpdateWorkGroupInput = {
      val __obj = js.Dynamic.literal(
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any]
      )

      ConfigurationUpdates.foreach(__v => __obj.updateDynamic("ConfigurationUpdates")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkGroupInput]
    }
  }

  @js.native
  trait UpdateWorkGroupOutput extends js.Object {}

  object UpdateWorkGroupOutput {
    @inline
    def apply(
        ): UpdateWorkGroupOutput = {
      val __obj = js.Dynamic.literal()

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
    @inline
    def apply(
        Name: WorkGroupName,
        Configuration: js.UndefOr[WorkGroupConfiguration] = js.undefined,
        CreationTime: js.UndefOr[Date] = js.undefined,
        Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined,
        State: js.UndefOr[WorkGroupState] = js.undefined
    ): WorkGroup = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.undefined,
        EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.undefined,
        PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.undefined,
        RequesterPaysEnabled: js.UndefOr[BoxedBoolean] = js.undefined,
        ResultConfiguration: js.UndefOr[ResultConfiguration] = js.undefined
    ): WorkGroupConfiguration = {
      val __obj = js.Dynamic.literal()
      BytesScannedCutoffPerQuery.foreach(
        __v => __obj.updateDynamic("BytesScannedCutoffPerQuery")(__v.asInstanceOf[js.Any])
      )
      EnforceWorkGroupConfiguration.foreach(
        __v => __obj.updateDynamic("EnforceWorkGroupConfiguration")(__v.asInstanceOf[js.Any])
      )
      PublishCloudWatchMetricsEnabled.foreach(
        __v => __obj.updateDynamic("PublishCloudWatchMetricsEnabled")(__v.asInstanceOf[js.Any])
      )
      RequesterPaysEnabled.foreach(__v => __obj.updateDynamic("RequesterPaysEnabled")(__v.asInstanceOf[js.Any]))
      ResultConfiguration.foreach(__v => __obj.updateDynamic("ResultConfiguration")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.undefined,
        EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.undefined,
        PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.undefined,
        RemoveBytesScannedCutoffPerQuery: js.UndefOr[BoxedBoolean] = js.undefined,
        RequesterPaysEnabled: js.UndefOr[BoxedBoolean] = js.undefined,
        ResultConfigurationUpdates: js.UndefOr[ResultConfigurationUpdates] = js.undefined
    ): WorkGroupConfigurationUpdates = {
      val __obj = js.Dynamic.literal()
      BytesScannedCutoffPerQuery.foreach(
        __v => __obj.updateDynamic("BytesScannedCutoffPerQuery")(__v.asInstanceOf[js.Any])
      )
      EnforceWorkGroupConfiguration.foreach(
        __v => __obj.updateDynamic("EnforceWorkGroupConfiguration")(__v.asInstanceOf[js.Any])
      )
      PublishCloudWatchMetricsEnabled.foreach(
        __v => __obj.updateDynamic("PublishCloudWatchMetricsEnabled")(__v.asInstanceOf[js.Any])
      )
      RemoveBytesScannedCutoffPerQuery.foreach(
        __v => __obj.updateDynamic("RemoveBytesScannedCutoffPerQuery")(__v.asInstanceOf[js.Any])
      )
      RequesterPaysEnabled.foreach(__v => __obj.updateDynamic("RequesterPaysEnabled")(__v.asInstanceOf[js.Any]))
      ResultConfigurationUpdates.foreach(
        __v => __obj.updateDynamic("ResultConfigurationUpdates")(__v.asInstanceOf[js.Any])
      )
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
    @inline
    def apply(
        CreationTime: js.UndefOr[Date] = js.undefined,
        Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined,
        Name: js.UndefOr[WorkGroupName] = js.undefined,
        State: js.UndefOr[WorkGroupState] = js.undefined
    ): WorkGroupSummary = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkGroupSummary]
    }
  }
}
