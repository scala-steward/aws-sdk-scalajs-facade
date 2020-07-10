package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object resourcegroups {
  type GroupArn = String
  type GroupDescription = String
  type GroupFilterList = js.Array[GroupFilter]
  type GroupFilterValue = String
  type GroupFilterValues = js.Array[GroupFilterValue]
  type GroupIdentifierList = js.Array[GroupIdentifier]
  type GroupList = js.Array[Group]
  type GroupName = String
  type MaxResults = Int
  type NextToken = String
  type Query = String
  type QueryErrorList = js.Array[QueryError]
  type QueryErrorMessage = String
  type ResourceArn = String
  type ResourceFilterList = js.Array[ResourceFilter]
  type ResourceFilterValue = String
  type ResourceFilterValues = js.Array[ResourceFilterValue]
  type ResourceIdentifierList = js.Array[ResourceIdentifier]
  type ResourceType = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Dictionary[TagValue]

  implicit final class ResourceGroupsOps(private val service: ResourceGroups) extends AnyVal {

    @inline def createGroupFuture(params: CreateGroupInput): Future[CreateGroupOutput] =
      service.createGroup(params).promise().toFuture
    @inline def deleteGroupFuture(params: DeleteGroupInput): Future[DeleteGroupOutput] =
      service.deleteGroup(params).promise().toFuture
    @inline def getGroupFuture(params: GetGroupInput): Future[GetGroupOutput] =
      service.getGroup(params).promise().toFuture
    @inline def getGroupQueryFuture(params: GetGroupQueryInput): Future[GetGroupQueryOutput] =
      service.getGroupQuery(params).promise().toFuture
    @inline def getTagsFuture(params: GetTagsInput): Future[GetTagsOutput] = service.getTags(params).promise().toFuture
    @inline def listGroupResourcesFuture(params: ListGroupResourcesInput): Future[ListGroupResourcesOutput] =
      service.listGroupResources(params).promise().toFuture
    @inline def listGroupsFuture(params: ListGroupsInput): Future[ListGroupsOutput] =
      service.listGroups(params).promise().toFuture
    @inline def searchResourcesFuture(params: SearchResourcesInput): Future[SearchResourcesOutput] =
      service.searchResources(params).promise().toFuture
    @inline def tagFuture(params: TagInput): Future[TagOutput] = service.tag(params).promise().toFuture
    @inline def untagFuture(params: UntagInput): Future[UntagOutput] = service.untag(params).promise().toFuture
    @inline def updateGroupFuture(params: UpdateGroupInput): Future[UpdateGroupOutput] =
      service.updateGroup(params).promise().toFuture
    @inline def updateGroupQueryFuture(params: UpdateGroupQueryInput): Future[UpdateGroupQueryOutput] =
      service.updateGroupQuery(params).promise().toFuture
  }
}

package resourcegroups {
  @js.native
  @JSImport("aws-sdk", "ResourceGroups", "AWS.ResourceGroups")
  class ResourceGroups() extends js.Object {
    def this(config: AWSConfig) = this()

    def createGroup(params: CreateGroupInput): Request[CreateGroupOutput] = js.native
    def deleteGroup(params: DeleteGroupInput): Request[DeleteGroupOutput] = js.native
    def getGroup(params: GetGroupInput): Request[GetGroupOutput] = js.native
    def getGroupQuery(params: GetGroupQueryInput): Request[GetGroupQueryOutput] = js.native
    def getTags(params: GetTagsInput): Request[GetTagsOutput] = js.native
    def listGroupResources(params: ListGroupResourcesInput): Request[ListGroupResourcesOutput] = js.native
    def listGroups(params: ListGroupsInput): Request[ListGroupsOutput] = js.native
    def searchResources(params: SearchResourcesInput): Request[SearchResourcesOutput] = js.native
    def tag(params: TagInput): Request[TagOutput] = js.native
    def untag(params: UntagInput): Request[UntagOutput] = js.native
    def updateGroup(params: UpdateGroupInput): Request[UpdateGroupOutput] = js.native
    def updateGroupQuery(params: UpdateGroupQueryInput): Request[UpdateGroupQueryOutput] = js.native
  }

  @js.native
  trait CreateGroupInput extends js.Object {
    var Name: GroupName
    var ResourceQuery: ResourceQuery
    var Description: js.UndefOr[GroupDescription]
    var Tags: js.UndefOr[Tags]
  }

  object CreateGroupInput {
    @inline
    def apply(
        Name: GroupName,
        ResourceQuery: ResourceQuery,
        Description: js.UndefOr[GroupDescription] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateGroupInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "ResourceQuery" -> ResourceQuery.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupInput]
    }
  }

  @js.native
  trait CreateGroupOutput extends js.Object {
    var Group: js.UndefOr[Group]
    var ResourceQuery: js.UndefOr[ResourceQuery]
    var Tags: js.UndefOr[Tags]
  }

  object CreateGroupOutput {
    @inline
    def apply(
        Group: js.UndefOr[Group] = js.undefined,
        ResourceQuery: js.UndefOr[ResourceQuery] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateGroupOutput = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      ResourceQuery.foreach(__v => __obj.updateDynamic("ResourceQuery")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupOutput]
    }
  }

  @js.native
  trait DeleteGroupInput extends js.Object {
    var GroupName: GroupName
  }

  object DeleteGroupInput {
    @inline
    def apply(
        GroupName: GroupName
    ): DeleteGroupInput = {
      val __obj = js.Dynamic.literal(
        "GroupName" -> GroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteGroupInput]
    }
  }

  @js.native
  trait DeleteGroupOutput extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object DeleteGroupOutput {
    @inline
    def apply(
        Group: js.UndefOr[Group] = js.undefined
    ): DeleteGroupOutput = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteGroupOutput]
    }
  }

  @js.native
  trait GetGroupInput extends js.Object {
    var GroupName: GroupName
  }

  object GetGroupInput {
    @inline
    def apply(
        GroupName: GroupName
    ): GetGroupInput = {
      val __obj = js.Dynamic.literal(
        "GroupName" -> GroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetGroupInput]
    }
  }

  @js.native
  trait GetGroupOutput extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object GetGroupOutput {
    @inline
    def apply(
        Group: js.UndefOr[Group] = js.undefined
    ): GetGroupOutput = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupOutput]
    }
  }

  @js.native
  trait GetGroupQueryInput extends js.Object {
    var GroupName: GroupName
  }

  object GetGroupQueryInput {
    @inline
    def apply(
        GroupName: GroupName
    ): GetGroupQueryInput = {
      val __obj = js.Dynamic.literal(
        "GroupName" -> GroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetGroupQueryInput]
    }
  }

  @js.native
  trait GetGroupQueryOutput extends js.Object {
    var GroupQuery: js.UndefOr[GroupQuery]
  }

  object GetGroupQueryOutput {
    @inline
    def apply(
        GroupQuery: js.UndefOr[GroupQuery] = js.undefined
    ): GetGroupQueryOutput = {
      val __obj = js.Dynamic.literal()
      GroupQuery.foreach(__v => __obj.updateDynamic("GroupQuery")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupQueryOutput]
    }
  }

  @js.native
  trait GetTagsInput extends js.Object {
    var Arn: GroupArn
  }

  object GetTagsInput {
    @inline
    def apply(
        Arn: GroupArn
    ): GetTagsInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTagsInput]
    }
  }

  @js.native
  trait GetTagsOutput extends js.Object {
    var Arn: js.UndefOr[GroupArn]
    var Tags: js.UndefOr[Tags]
  }

  object GetTagsOutput {
    @inline
    def apply(
        Arn: js.UndefOr[GroupArn] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): GetTagsOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTagsOutput]
    }
  }

  /**
    * A resource group.
    */
  @js.native
  trait Group extends js.Object {
    var GroupArn: GroupArn
    var Name: GroupName
    var Description: js.UndefOr[GroupDescription]
  }

  object Group {
    @inline
    def apply(
        GroupArn: GroupArn,
        Name: GroupName,
        Description: js.UndefOr[GroupDescription] = js.undefined
    ): Group = {
      val __obj = js.Dynamic.literal(
        "GroupArn" -> GroupArn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Group]
    }
  }

  /**
    * A filter name and value pair that is used to obtain more specific results from a list of groups.
    */
  @js.native
  trait GroupFilter extends js.Object {
    var Name: GroupFilterName
    var Values: GroupFilterValues
  }

  object GroupFilter {
    @inline
    def apply(
        Name: GroupFilterName,
        Values: GroupFilterValues
    ): GroupFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GroupFilter]
    }
  }

  @js.native
  sealed trait GroupFilterName extends js.Any
  object GroupFilterName extends js.Object {
    val `resource-type` = "resource-type".asInstanceOf[GroupFilterName]

    val values = js.Object.freeze(js.Array(`resource-type`))
  }

  /**
    * The ARN and group name of a group.
    */
  @js.native
  trait GroupIdentifier extends js.Object {
    var GroupArn: js.UndefOr[GroupArn]
    var GroupName: js.UndefOr[GroupName]
  }

  object GroupIdentifier {
    @inline
    def apply(
        GroupArn: js.UndefOr[GroupArn] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined
    ): GroupIdentifier = {
      val __obj = js.Dynamic.literal()
      GroupArn.foreach(__v => __obj.updateDynamic("GroupArn")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupIdentifier]
    }
  }

  /**
    * The underlying resource query of a resource group. Resources that match query results are part of the group.
    */
  @js.native
  trait GroupQuery extends js.Object {
    var GroupName: GroupName
    var ResourceQuery: ResourceQuery
  }

  object GroupQuery {
    @inline
    def apply(
        GroupName: GroupName,
        ResourceQuery: ResourceQuery
    ): GroupQuery = {
      val __obj = js.Dynamic.literal(
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "ResourceQuery" -> ResourceQuery.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GroupQuery]
    }
  }

  @js.native
  trait ListGroupResourcesInput extends js.Object {
    var GroupName: GroupName
    var Filters: js.UndefOr[ResourceFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupResourcesInput {
    @inline
    def apply(
        GroupName: GroupName,
        Filters: js.UndefOr[ResourceFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupResourcesInput = {
      val __obj = js.Dynamic.literal(
        "GroupName" -> GroupName.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupResourcesInput]
    }
  }

  @js.native
  trait ListGroupResourcesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var QueryErrors: js.UndefOr[QueryErrorList]
    var ResourceIdentifiers: js.UndefOr[ResourceIdentifierList]
  }

  object ListGroupResourcesOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        QueryErrors: js.UndefOr[QueryErrorList] = js.undefined,
        ResourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.undefined
    ): ListGroupResourcesOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      QueryErrors.foreach(__v => __obj.updateDynamic("QueryErrors")(__v.asInstanceOf[js.Any]))
      ResourceIdentifiers.foreach(__v => __obj.updateDynamic("ResourceIdentifiers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupResourcesOutput]
    }
  }

  @js.native
  trait ListGroupsInput extends js.Object {
    var Filters: js.UndefOr[GroupFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupsInput {
    @inline
    def apply(
        Filters: js.UndefOr[GroupFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupsInput = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsInput]
    }
  }

  @js.native
  trait ListGroupsOutput extends js.Object {
    var GroupIdentifiers: js.UndefOr[GroupIdentifierList]
    var Groups: js.UndefOr[GroupList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupsOutput {
    @inline
    def apply(
        GroupIdentifiers: js.UndefOr[GroupIdentifierList] = js.undefined,
        Groups: js.UndefOr[GroupList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupsOutput = {
      val __obj = js.Dynamic.literal()
      GroupIdentifiers.foreach(__v => __obj.updateDynamic("GroupIdentifiers")(__v.asInstanceOf[js.Any]))
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsOutput]
    }
  }

  /**
    * A two-part error structure that can occur in <code>ListGroupResources</code> or <code>SearchResources</code> operations on CloudFormation stack-based queries. The error occurs if the CloudFormation stack on which the query is based either does not exist, or has a status that renders the stack inactive. A <code>QueryError</code> occurrence does not necessarily mean that AWS Resource Groups could not complete the operation, but the resulting group might have no member resources.
    */
  @js.native
  trait QueryError extends js.Object {
    var ErrorCode: js.UndefOr[QueryErrorCode]
    var Message: js.UndefOr[QueryErrorMessage]
  }

  object QueryError {
    @inline
    def apply(
        ErrorCode: js.UndefOr[QueryErrorCode] = js.undefined,
        Message: js.UndefOr[QueryErrorMessage] = js.undefined
    ): QueryError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryError]
    }
  }

  @js.native
  sealed trait QueryErrorCode extends js.Any
  object QueryErrorCode extends js.Object {
    val CLOUDFORMATION_STACK_INACTIVE = "CLOUDFORMATION_STACK_INACTIVE".asInstanceOf[QueryErrorCode]
    val CLOUDFORMATION_STACK_NOT_EXISTING = "CLOUDFORMATION_STACK_NOT_EXISTING".asInstanceOf[QueryErrorCode]

    val values = js.Object.freeze(js.Array(CLOUDFORMATION_STACK_INACTIVE, CLOUDFORMATION_STACK_NOT_EXISTING))
  }

  @js.native
  sealed trait QueryType extends js.Any
  object QueryType extends js.Object {
    val TAG_FILTERS_1_0 = "TAG_FILTERS_1_0".asInstanceOf[QueryType]
    val CLOUDFORMATION_STACK_1_0 = "CLOUDFORMATION_STACK_1_0".asInstanceOf[QueryType]

    val values = js.Object.freeze(js.Array(TAG_FILTERS_1_0, CLOUDFORMATION_STACK_1_0))
  }

  /**
    * A filter name and value pair that is used to obtain more specific results from a list of resources.
    */
  @js.native
  trait ResourceFilter extends js.Object {
    var Name: ResourceFilterName
    var Values: ResourceFilterValues
  }

  object ResourceFilter {
    @inline
    def apply(
        Name: ResourceFilterName,
        Values: ResourceFilterValues
    ): ResourceFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResourceFilter]
    }
  }

  @js.native
  sealed trait ResourceFilterName extends js.Any
  object ResourceFilterName extends js.Object {
    val `resource-type` = "resource-type".asInstanceOf[ResourceFilterName]

    val values = js.Object.freeze(js.Array(`resource-type`))
  }

  /**
    * The ARN of a resource, and its resource type.
    */
  @js.native
  trait ResourceIdentifier extends js.Object {
    var ResourceArn: js.UndefOr[ResourceArn]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object ResourceIdentifier {
    @inline
    def apply(
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): ResourceIdentifier = {
      val __obj = js.Dynamic.literal()
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceIdentifier]
    }
  }

  /**
    * The query that is used to define a resource group or a search for resources.
    */
  @js.native
  trait ResourceQuery extends js.Object {
    var Query: Query
    var Type: QueryType
  }

  object ResourceQuery {
    @inline
    def apply(
        Query: Query,
        Type: QueryType
    ): ResourceQuery = {
      val __obj = js.Dynamic.literal(
        "Query" -> Query.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResourceQuery]
    }
  }

  @js.native
  trait SearchResourcesInput extends js.Object {
    var ResourceQuery: ResourceQuery
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object SearchResourcesInput {
    @inline
    def apply(
        ResourceQuery: ResourceQuery,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchResourcesInput = {
      val __obj = js.Dynamic.literal(
        "ResourceQuery" -> ResourceQuery.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchResourcesInput]
    }
  }

  @js.native
  trait SearchResourcesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var QueryErrors: js.UndefOr[QueryErrorList]
    var ResourceIdentifiers: js.UndefOr[ResourceIdentifierList]
  }

  object SearchResourcesOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        QueryErrors: js.UndefOr[QueryErrorList] = js.undefined,
        ResourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.undefined
    ): SearchResourcesOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      QueryErrors.foreach(__v => __obj.updateDynamic("QueryErrors")(__v.asInstanceOf[js.Any]))
      ResourceIdentifiers.foreach(__v => __obj.updateDynamic("ResourceIdentifiers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchResourcesOutput]
    }
  }

  @js.native
  trait TagInput extends js.Object {
    var Arn: GroupArn
    var Tags: Tags
  }

  object TagInput {
    @inline
    def apply(
        Arn: GroupArn,
        Tags: Tags
    ): TagInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagInput]
    }
  }

  @js.native
  trait TagOutput extends js.Object {
    var Arn: js.UndefOr[GroupArn]
    var Tags: js.UndefOr[Tags]
  }

  object TagOutput {
    @inline
    def apply(
        Arn: js.UndefOr[GroupArn] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): TagOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagOutput]
    }
  }

  @js.native
  trait UntagInput extends js.Object {
    var Arn: GroupArn
    var Keys: TagKeyList
  }

  object UntagInput {
    @inline
    def apply(
        Arn: GroupArn,
        Keys: TagKeyList
    ): UntagInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Keys" -> Keys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagInput]
    }
  }

  @js.native
  trait UntagOutput extends js.Object {
    var Arn: js.UndefOr[GroupArn]
    var Keys: js.UndefOr[TagKeyList]
  }

  object UntagOutput {
    @inline
    def apply(
        Arn: js.UndefOr[GroupArn] = js.undefined,
        Keys: js.UndefOr[TagKeyList] = js.undefined
    ): UntagOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Keys.foreach(__v => __obj.updateDynamic("Keys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UntagOutput]
    }
  }

  @js.native
  trait UpdateGroupInput extends js.Object {
    var GroupName: GroupName
    var Description: js.UndefOr[GroupDescription]
  }

  object UpdateGroupInput {
    @inline
    def apply(
        GroupName: GroupName,
        Description: js.UndefOr[GroupDescription] = js.undefined
    ): UpdateGroupInput = {
      val __obj = js.Dynamic.literal(
        "GroupName" -> GroupName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGroupInput]
    }
  }

  @js.native
  trait UpdateGroupOutput extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object UpdateGroupOutput {
    @inline
    def apply(
        Group: js.UndefOr[Group] = js.undefined
    ): UpdateGroupOutput = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGroupOutput]
    }
  }

  @js.native
  trait UpdateGroupQueryInput extends js.Object {
    var GroupName: GroupName
    var ResourceQuery: ResourceQuery
  }

  object UpdateGroupQueryInput {
    @inline
    def apply(
        GroupName: GroupName,
        ResourceQuery: ResourceQuery
    ): UpdateGroupQueryInput = {
      val __obj = js.Dynamic.literal(
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "ResourceQuery" -> ResourceQuery.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateGroupQueryInput]
    }
  }

  @js.native
  trait UpdateGroupQueryOutput extends js.Object {
    var GroupQuery: js.UndefOr[GroupQuery]
  }

  object UpdateGroupQueryOutput {
    @inline
    def apply(
        GroupQuery: js.UndefOr[GroupQuery] = js.undefined
    ): UpdateGroupQueryOutput = {
      val __obj = js.Dynamic.literal()
      GroupQuery.foreach(__v => __obj.updateDynamic("GroupQuery")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGroupQueryOutput]
    }
  }
}
