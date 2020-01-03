package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object connect {
  type ARN                             = String
  type AfterContactWorkTimeLimit       = Int
  type AgentFirstName                  = String
  type AgentLastName                   = String
  type AgentUsername                   = String
  type AttributeName                   = String
  type AttributeValue                  = String
  type Attributes                      = js.Dictionary[AttributeValue]
  type AutoAccept                      = Boolean
  type Channel                         = String
  type Channels                        = js.Array[Channel]
  type ChatContent                     = String
  type ChatContentType                 = String
  type ClientToken                     = String
  type Comparison                      = String
  type ContactFlowId                   = String
  type ContactFlowName                 = String
  type ContactFlowSummaryList          = js.Array[ContactFlowSummary]
  type ContactFlowType                 = String
  type ContactFlowTypes                = js.Array[ContactFlowType]
  type ContactId                       = String
  type CurrentMetricDataCollections    = js.Array[CurrentMetricData]
  type CurrentMetricName               = String
  type CurrentMetricResults            = js.Array[CurrentMetricResult]
  type CurrentMetrics                  = js.Array[CurrentMetric]
  type DirectoryUserId                 = String
  type DisplayName                     = String
  type Email                           = String
  type Grouping                        = String
  type Groupings                       = js.Array[Grouping]
  type HierarchyGroupId                = String
  type HierarchyGroupName              = String
  type HierarchyGroupSummaryList       = js.Array[HierarchyGroupSummary]
  type HierarchyLevelId                = String
  type HierarchyLevelName              = String
  type HistoricalMetricDataCollections = js.Array[HistoricalMetricData]
  type HistoricalMetricName            = String
  type HistoricalMetricResults         = js.Array[HistoricalMetricResult]
  type HistoricalMetrics               = js.Array[HistoricalMetric]
  type HoursOfOperationId              = String
  type HoursOfOperationName            = String
  type HoursOfOperationSummaryList     = js.Array[HoursOfOperationSummary]
  type InstanceId                      = String
  type MaxResult100                    = Int
  type MaxResult1000                   = Int
  type NextToken                       = String
  type ParticipantId                   = String
  type ParticipantToken                = String
  type Password                        = String
  type PhoneNumber                     = String
  type PhoneNumberCountryCode          = String
  type PhoneNumberCountryCodes         = js.Array[PhoneNumberCountryCode]
  type PhoneNumberId                   = String
  type PhoneNumberSummaryList          = js.Array[PhoneNumberSummary]
  type PhoneNumberType                 = String
  type PhoneNumberTypes                = js.Array[PhoneNumberType]
  type PhoneType                       = String
  type QueueId                         = String
  type QueueName                       = String
  type QueueSummaryList                = js.Array[QueueSummary]
  type QueueType                       = String
  type QueueTypes                      = js.Array[QueueType]
  type Queues                          = js.Array[QueueId]
  type RoutingProfileId                = String
  type RoutingProfileName              = String
  type RoutingProfileSummaryList       = js.Array[RoutingProfileSummary]
  type SecurityProfileId               = String
  type SecurityProfileIds              = js.Array[SecurityProfileId]
  type SecurityProfileName             = String
  type SecurityProfileSummaryList      = js.Array[SecurityProfileSummary]
  type SecurityToken                   = String
  type Statistic                       = String
  type TagKey                          = String
  type TagKeyList                      = js.Array[TagKey]
  type TagMap                          = js.Dictionary[TagValue]
  type TagValue                        = String
  type ThresholdValue                  = Double
  type Unit                            = String
  type UserId                          = String
  type UserSummaryList                 = js.Array[UserSummary]
  type Value                           = Double
  type timestamp                       = js.Date

  implicit final class ConnectOps(private val service: Connect) extends AnyVal {

    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] =
      service.createUser(params).promise.toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[js.Object] =
      service.deleteUser(params).promise.toFuture
    @inline def describeUserFuture(params: DescribeUserRequest): Future[DescribeUserResponse] =
      service.describeUser(params).promise.toFuture
    @inline def describeUserHierarchyGroupFuture(
        params: DescribeUserHierarchyGroupRequest
    ): Future[DescribeUserHierarchyGroupResponse] = service.describeUserHierarchyGroup(params).promise.toFuture
    @inline def describeUserHierarchyStructureFuture(
        params: DescribeUserHierarchyStructureRequest
    ): Future[DescribeUserHierarchyStructureResponse] = service.describeUserHierarchyStructure(params).promise.toFuture
    @inline def getContactAttributesFuture(params: GetContactAttributesRequest): Future[GetContactAttributesResponse] =
      service.getContactAttributes(params).promise.toFuture
    @inline def getCurrentMetricDataFuture(params: GetCurrentMetricDataRequest): Future[GetCurrentMetricDataResponse] =
      service.getCurrentMetricData(params).promise.toFuture
    @inline def getFederationTokenFuture(params: GetFederationTokenRequest): Future[GetFederationTokenResponse] =
      service.getFederationToken(params).promise.toFuture
    @inline def getMetricDataFuture(params: GetMetricDataRequest): Future[GetMetricDataResponse] =
      service.getMetricData(params).promise.toFuture
    @inline def listContactFlowsFuture(params: ListContactFlowsRequest): Future[ListContactFlowsResponse] =
      service.listContactFlows(params).promise.toFuture
    @inline def listHoursOfOperationsFuture(
        params: ListHoursOfOperationsRequest
    ): Future[ListHoursOfOperationsResponse] = service.listHoursOfOperations(params).promise.toFuture
    @inline def listPhoneNumbersFuture(params: ListPhoneNumbersRequest): Future[ListPhoneNumbersResponse] =
      service.listPhoneNumbers(params).promise.toFuture
    @inline def listQueuesFuture(params: ListQueuesRequest): Future[ListQueuesResponse] =
      service.listQueues(params).promise.toFuture
    @inline def listRoutingProfilesFuture(params: ListRoutingProfilesRequest): Future[ListRoutingProfilesResponse] =
      service.listRoutingProfiles(params).promise.toFuture
    @inline def listSecurityProfilesFuture(params: ListSecurityProfilesRequest): Future[ListSecurityProfilesResponse] =
      service.listSecurityProfiles(params).promise.toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    @inline def listUserHierarchyGroupsFuture(
        params: ListUserHierarchyGroupsRequest
    ): Future[ListUserHierarchyGroupsResponse] = service.listUserHierarchyGroups(params).promise.toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] =
      service.listUsers(params).promise.toFuture
    @inline def startChatContactFuture(params: StartChatContactRequest): Future[StartChatContactResponse] =
      service.startChatContact(params).promise.toFuture
    @inline def startOutboundVoiceContactFuture(
        params: StartOutboundVoiceContactRequest
    ): Future[StartOutboundVoiceContactResponse] = service.startOutboundVoiceContact(params).promise.toFuture
    @inline def stopContactFuture(params: StopContactRequest): Future[StopContactResponse] =
      service.stopContact(params).promise.toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise.toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise.toFuture
    @inline def updateContactAttributesFuture(
        params: UpdateContactAttributesRequest
    ): Future[UpdateContactAttributesResponse] = service.updateContactAttributes(params).promise.toFuture
    @inline def updateUserHierarchyFuture(params: UpdateUserHierarchyRequest): Future[js.Object] =
      service.updateUserHierarchy(params).promise.toFuture
    @inline def updateUserIdentityInfoFuture(params: UpdateUserIdentityInfoRequest): Future[js.Object] =
      service.updateUserIdentityInfo(params).promise.toFuture
    @inline def updateUserPhoneConfigFuture(params: UpdateUserPhoneConfigRequest): Future[js.Object] =
      service.updateUserPhoneConfig(params).promise.toFuture
    @inline def updateUserRoutingProfileFuture(params: UpdateUserRoutingProfileRequest): Future[js.Object] =
      service.updateUserRoutingProfile(params).promise.toFuture
    @inline def updateUserSecurityProfilesFuture(params: UpdateUserSecurityProfilesRequest): Future[js.Object] =
      service.updateUserSecurityProfiles(params).promise.toFuture
  }
}

package connect {
  @js.native
  @JSImport("aws-sdk", "Connect")
  class Connect() extends js.Object {
    def this(config: AWSConfig) = this()

    def createUser(params: CreateUserRequest): Request[CreateUserResponse]       = js.native
    def deleteUser(params: DeleteUserRequest): Request[js.Object]                = js.native
    def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse] = js.native
    def describeUserHierarchyGroup(
        params: DescribeUserHierarchyGroupRequest
    ): Request[DescribeUserHierarchyGroupResponse] = js.native
    def describeUserHierarchyStructure(
        params: DescribeUserHierarchyStructureRequest
    ): Request[DescribeUserHierarchyStructureResponse]                                                      = js.native
    def getContactAttributes(params: GetContactAttributesRequest): Request[GetContactAttributesResponse]    = js.native
    def getCurrentMetricData(params: GetCurrentMetricDataRequest): Request[GetCurrentMetricDataResponse]    = js.native
    def getFederationToken(params: GetFederationTokenRequest): Request[GetFederationTokenResponse]          = js.native
    def getMetricData(params: GetMetricDataRequest): Request[GetMetricDataResponse]                         = js.native
    def listContactFlows(params: ListContactFlowsRequest): Request[ListContactFlowsResponse]                = js.native
    def listHoursOfOperations(params: ListHoursOfOperationsRequest): Request[ListHoursOfOperationsResponse] = js.native
    def listPhoneNumbers(params: ListPhoneNumbersRequest): Request[ListPhoneNumbersResponse]                = js.native
    def listQueues(params: ListQueuesRequest): Request[ListQueuesResponse]                                  = js.native
    def listRoutingProfiles(params: ListRoutingProfilesRequest): Request[ListRoutingProfilesResponse]       = js.native
    def listSecurityProfiles(params: ListSecurityProfilesRequest): Request[ListSecurityProfilesResponse]    = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def listUserHierarchyGroups(params: ListUserHierarchyGroupsRequest): Request[ListUserHierarchyGroupsResponse] =
      js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse]                      = js.native
    def startChatContact(params: StartChatContactRequest): Request[StartChatContactResponse] = js.native
    def startOutboundVoiceContact(
        params: StartOutboundVoiceContactRequest
    ): Request[StartOutboundVoiceContactResponse]                             = js.native
    def stopContact(params: StopContactRequest): Request[StopContactResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]           = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]       = js.native
    def updateContactAttributes(params: UpdateContactAttributesRequest): Request[UpdateContactAttributesResponse] =
      js.native
    def updateUserHierarchy(params: UpdateUserHierarchyRequest): Request[js.Object]               = js.native
    def updateUserIdentityInfo(params: UpdateUserIdentityInfoRequest): Request[js.Object]         = js.native
    def updateUserPhoneConfig(params: UpdateUserPhoneConfigRequest): Request[js.Object]           = js.native
    def updateUserRoutingProfile(params: UpdateUserRoutingProfileRequest): Request[js.Object]     = js.native
    def updateUserSecurityProfiles(params: UpdateUserSecurityProfilesRequest): Request[js.Object] = js.native
  }

  object ChannelEnum {
    val VOICE = "VOICE"
    val CHAT  = "CHAT"

    val values = js.Object.freeze(js.Array(VOICE, CHAT))
  }

  /**
    * A chat message.
    */
  @js.native
  trait ChatMessage extends js.Object {
    var Content: ChatContent
    var ContentType: ChatContentType
  }

  object ChatMessage {
    @inline
    def apply(
        Content: ChatContent,
        ContentType: ChatContentType
    ): ChatMessage = {
      val __obj = js.Dynamic.literal(
        "Content"     -> Content.asInstanceOf[js.Any],
        "ContentType" -> ContentType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ChatMessage]
    }
  }

  object ComparisonEnum {
    val LT = "LT"

    val values = js.Object.freeze(js.Array(LT))
  }

  /**
    * Contains summary information about a contact flow.
    */
  @js.native
  trait ContactFlowSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var ContactFlowType: js.UndefOr[ContactFlowType]
    var Id: js.UndefOr[ContactFlowId]
    var Name: js.UndefOr[ContactFlowName]
  }

  object ContactFlowSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        ContactFlowType: js.UndefOr[ContactFlowType] = js.undefined,
        Id: js.UndefOr[ContactFlowId] = js.undefined,
        Name: js.UndefOr[ContactFlowName] = js.undefined
    ): ContactFlowSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ContactFlowType.foreach(__v => __obj.updateDynamic("ContactFlowType")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContactFlowSummary]
    }
  }

  object ContactFlowTypeEnum {
    val CONTACT_FLOW     = "CONTACT_FLOW"
    val CUSTOMER_QUEUE   = "CUSTOMER_QUEUE"
    val CUSTOMER_HOLD    = "CUSTOMER_HOLD"
    val CUSTOMER_WHISPER = "CUSTOMER_WHISPER"
    val AGENT_HOLD       = "AGENT_HOLD"
    val AGENT_WHISPER    = "AGENT_WHISPER"
    val OUTBOUND_WHISPER = "OUTBOUND_WHISPER"
    val AGENT_TRANSFER   = "AGENT_TRANSFER"
    val QUEUE_TRANSFER   = "QUEUE_TRANSFER"

    val values = js.Object.freeze(
      js.Array(
        CONTACT_FLOW,
        CUSTOMER_QUEUE,
        CUSTOMER_HOLD,
        CUSTOMER_WHISPER,
        AGENT_HOLD,
        AGENT_WHISPER,
        OUTBOUND_WHISPER,
        AGENT_TRANSFER,
        QUEUE_TRANSFER
      )
    )
  }

  @js.native
  trait CreateUserRequest extends js.Object {
    var InstanceId: InstanceId
    var PhoneConfig: UserPhoneConfig
    var RoutingProfileId: RoutingProfileId
    var SecurityProfileIds: SecurityProfileIds
    var Username: AgentUsername
    var DirectoryUserId: js.UndefOr[DirectoryUserId]
    var HierarchyGroupId: js.UndefOr[HierarchyGroupId]
    var IdentityInfo: js.UndefOr[UserIdentityInfo]
    var Password: js.UndefOr[Password]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateUserRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        PhoneConfig: UserPhoneConfig,
        RoutingProfileId: RoutingProfileId,
        SecurityProfileIds: SecurityProfileIds,
        Username: AgentUsername,
        DirectoryUserId: js.UndefOr[DirectoryUserId] = js.undefined,
        HierarchyGroupId: js.UndefOr[HierarchyGroupId] = js.undefined,
        IdentityInfo: js.UndefOr[UserIdentityInfo] = js.undefined,
        Password: js.UndefOr[Password] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateUserRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId"         -> InstanceId.asInstanceOf[js.Any],
        "PhoneConfig"        -> PhoneConfig.asInstanceOf[js.Any],
        "RoutingProfileId"   -> RoutingProfileId.asInstanceOf[js.Any],
        "SecurityProfileIds" -> SecurityProfileIds.asInstanceOf[js.Any],
        "Username"           -> Username.asInstanceOf[js.Any]
      )

      DirectoryUserId.foreach(__v => __obj.updateDynamic("DirectoryUserId")(__v.asInstanceOf[js.Any]))
      HierarchyGroupId.foreach(__v => __obj.updateDynamic("HierarchyGroupId")(__v.asInstanceOf[js.Any]))
      IdentityInfo.foreach(__v => __obj.updateDynamic("IdentityInfo")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResponse extends js.Object {
    var UserArn: js.UndefOr[ARN]
    var UserId: js.UndefOr[UserId]
  }

  object CreateUserResponse {
    @inline
    def apply(
        UserArn: js.UndefOr[ARN] = js.undefined,
        UserId: js.UndefOr[UserId] = js.undefined
    ): CreateUserResponse = {
      val __obj = js.Dynamic.literal()
      UserArn.foreach(__v => __obj.updateDynamic("UserArn")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserResponse]
    }
  }

  /**
    * Contains credentials to use for federation.
    */
  @js.native
  trait Credentials extends js.Object {
    var AccessToken: js.UndefOr[SecurityToken]
    var AccessTokenExpiration: js.UndefOr[timestamp]
    var RefreshToken: js.UndefOr[SecurityToken]
    var RefreshTokenExpiration: js.UndefOr[timestamp]
  }

  object Credentials {
    @inline
    def apply(
        AccessToken: js.UndefOr[SecurityToken] = js.undefined,
        AccessTokenExpiration: js.UndefOr[timestamp] = js.undefined,
        RefreshToken: js.UndefOr[SecurityToken] = js.undefined,
        RefreshTokenExpiration: js.UndefOr[timestamp] = js.undefined
    ): Credentials = {
      val __obj = js.Dynamic.literal()
      AccessToken.foreach(__v => __obj.updateDynamic("AccessToken")(__v.asInstanceOf[js.Any]))
      AccessTokenExpiration.foreach(__v => __obj.updateDynamic("AccessTokenExpiration")(__v.asInstanceOf[js.Any]))
      RefreshToken.foreach(__v => __obj.updateDynamic("RefreshToken")(__v.asInstanceOf[js.Any]))
      RefreshTokenExpiration.foreach(__v => __obj.updateDynamic("RefreshTokenExpiration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Credentials]
    }
  }

  /**
    * Contains information about a real-time metric.
    */
  @js.native
  trait CurrentMetric extends js.Object {
    var Name: js.UndefOr[CurrentMetricName]
    var Unit: js.UndefOr[Unit]
  }

  object CurrentMetric {
    @inline
    def apply(
        Name: js.UndefOr[CurrentMetricName] = js.undefined,
        Unit: js.UndefOr[Unit] = js.undefined
    ): CurrentMetric = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CurrentMetric]
    }
  }

  /**
    * Contains the data for a real-time metric.
    */
  @js.native
  trait CurrentMetricData extends js.Object {
    var Metric: js.UndefOr[CurrentMetric]
    var Value: js.UndefOr[Value]
  }

  object CurrentMetricData {
    @inline
    def apply(
        Metric: js.UndefOr[CurrentMetric] = js.undefined,
        Value: js.UndefOr[Value] = js.undefined
    ): CurrentMetricData = {
      val __obj = js.Dynamic.literal()
      Metric.foreach(__v => __obj.updateDynamic("Metric")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CurrentMetricData]
    }
  }

  /**
    * The current metric names.
    */
  object CurrentMetricNameEnum {
    val AGENTS_ONLINE             = "AGENTS_ONLINE"
    val AGENTS_AVAILABLE          = "AGENTS_AVAILABLE"
    val AGENTS_ON_CALL            = "AGENTS_ON_CALL"
    val AGENTS_NON_PRODUCTIVE     = "AGENTS_NON_PRODUCTIVE"
    val AGENTS_AFTER_CONTACT_WORK = "AGENTS_AFTER_CONTACT_WORK"
    val AGENTS_ERROR              = "AGENTS_ERROR"
    val AGENTS_STAFFED            = "AGENTS_STAFFED"
    val CONTACTS_IN_QUEUE         = "CONTACTS_IN_QUEUE"
    val OLDEST_CONTACT_AGE        = "OLDEST_CONTACT_AGE"
    val CONTACTS_SCHEDULED        = "CONTACTS_SCHEDULED"
    val AGENTS_ON_CONTACT         = "AGENTS_ON_CONTACT"
    val SLOTS_ACTIVE              = "SLOTS_ACTIVE"
    val SLOTS_AVAILABLE           = "SLOTS_AVAILABLE"

    val values = js.Object.freeze(
      js.Array(
        AGENTS_ONLINE,
        AGENTS_AVAILABLE,
        AGENTS_ON_CALL,
        AGENTS_NON_PRODUCTIVE,
        AGENTS_AFTER_CONTACT_WORK,
        AGENTS_ERROR,
        AGENTS_STAFFED,
        CONTACTS_IN_QUEUE,
        OLDEST_CONTACT_AGE,
        CONTACTS_SCHEDULED,
        AGENTS_ON_CONTACT,
        SLOTS_ACTIVE,
        SLOTS_AVAILABLE
      )
    )
  }

  /**
    * Contains information about a set of real-time metrics.
    */
  @js.native
  trait CurrentMetricResult extends js.Object {
    var Collections: js.UndefOr[CurrentMetricDataCollections]
    var Dimensions: js.UndefOr[Dimensions]
  }

  object CurrentMetricResult {
    @inline
    def apply(
        Collections: js.UndefOr[CurrentMetricDataCollections] = js.undefined,
        Dimensions: js.UndefOr[Dimensions] = js.undefined
    ): CurrentMetricResult = {
      val __obj = js.Dynamic.literal()
      Collections.foreach(__v => __obj.updateDynamic("Collections")(__v.asInstanceOf[js.Any]))
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CurrentMetricResult]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var InstanceId: InstanceId
    var UserId: UserId
  }

  object DeleteUserRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        UserId: UserId
    ): DeleteUserRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "UserId"     -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DescribeUserHierarchyGroupRequest extends js.Object {
    var HierarchyGroupId: HierarchyGroupId
    var InstanceId: InstanceId
  }

  object DescribeUserHierarchyGroupRequest {
    @inline
    def apply(
        HierarchyGroupId: HierarchyGroupId,
        InstanceId: InstanceId
    ): DescribeUserHierarchyGroupRequest = {
      val __obj = js.Dynamic.literal(
        "HierarchyGroupId" -> HierarchyGroupId.asInstanceOf[js.Any],
        "InstanceId"       -> InstanceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeUserHierarchyGroupRequest]
    }
  }

  @js.native
  trait DescribeUserHierarchyGroupResponse extends js.Object {
    var HierarchyGroup: js.UndefOr[HierarchyGroup]
  }

  object DescribeUserHierarchyGroupResponse {
    @inline
    def apply(
        HierarchyGroup: js.UndefOr[HierarchyGroup] = js.undefined
    ): DescribeUserHierarchyGroupResponse = {
      val __obj = js.Dynamic.literal()
      HierarchyGroup.foreach(__v => __obj.updateDynamic("HierarchyGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserHierarchyGroupResponse]
    }
  }

  @js.native
  trait DescribeUserHierarchyStructureRequest extends js.Object {
    var InstanceId: InstanceId
  }

  object DescribeUserHierarchyStructureRequest {
    @inline
    def apply(
        InstanceId: InstanceId
    ): DescribeUserHierarchyStructureRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeUserHierarchyStructureRequest]
    }
  }

  @js.native
  trait DescribeUserHierarchyStructureResponse extends js.Object {
    var HierarchyStructure: js.UndefOr[HierarchyStructure]
  }

  object DescribeUserHierarchyStructureResponse {
    @inline
    def apply(
        HierarchyStructure: js.UndefOr[HierarchyStructure] = js.undefined
    ): DescribeUserHierarchyStructureResponse = {
      val __obj = js.Dynamic.literal()
      HierarchyStructure.foreach(__v => __obj.updateDynamic("HierarchyStructure")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserHierarchyStructureResponse]
    }
  }

  @js.native
  trait DescribeUserRequest extends js.Object {
    var InstanceId: InstanceId
    var UserId: UserId
  }

  object DescribeUserRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        UserId: UserId
    ): DescribeUserRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "UserId"     -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeUserRequest]
    }
  }

  @js.native
  trait DescribeUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object DescribeUserResponse {
    @inline
    def apply(
        User: js.UndefOr[User] = js.undefined
    ): DescribeUserResponse = {
      val __obj = js.Dynamic.literal()
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserResponse]
    }
  }

  /**
    * Contains information about the dimensions for a set of metrics.
    */
  @js.native
  trait Dimensions extends js.Object {
    var Channel: js.UndefOr[Channel]
    var Queue: js.UndefOr[QueueReference]
  }

  object Dimensions {
    @inline
    def apply(
        Channel: js.UndefOr[Channel] = js.undefined,
        Queue: js.UndefOr[QueueReference] = js.undefined
    ): Dimensions = {
      val __obj = js.Dynamic.literal()
      Channel.foreach(__v => __obj.updateDynamic("Channel")(__v.asInstanceOf[js.Any]))
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Dimensions]
    }
  }

  /**
    * Contains the filter to apply when retrieving metrics.
    */
  @js.native
  trait Filters extends js.Object {
    var Channels: js.UndefOr[Channels]
    var Queues: js.UndefOr[Queues]
  }

  object Filters {
    @inline
    def apply(
        Channels: js.UndefOr[Channels] = js.undefined,
        Queues: js.UndefOr[Queues] = js.undefined
    ): Filters = {
      val __obj = js.Dynamic.literal()
      Channels.foreach(__v => __obj.updateDynamic("Channels")(__v.asInstanceOf[js.Any]))
      Queues.foreach(__v => __obj.updateDynamic("Queues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filters]
    }
  }

  @js.native
  trait GetContactAttributesRequest extends js.Object {
    var InitialContactId: ContactId
    var InstanceId: InstanceId
  }

  object GetContactAttributesRequest {
    @inline
    def apply(
        InitialContactId: ContactId,
        InstanceId: InstanceId
    ): GetContactAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "InitialContactId" -> InitialContactId.asInstanceOf[js.Any],
        "InstanceId"       -> InstanceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetContactAttributesRequest]
    }
  }

  @js.native
  trait GetContactAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[Attributes]
  }

  object GetContactAttributesResponse {
    @inline
    def apply(
        Attributes: js.UndefOr[Attributes] = js.undefined
    ): GetContactAttributesResponse = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetContactAttributesResponse]
    }
  }

  @js.native
  trait GetCurrentMetricDataRequest extends js.Object {
    var CurrentMetrics: CurrentMetrics
    var Filters: Filters
    var InstanceId: InstanceId
    var Groupings: js.UndefOr[Groupings]
    var MaxResults: js.UndefOr[MaxResult100]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetCurrentMetricDataRequest {
    @inline
    def apply(
        CurrentMetrics: CurrentMetrics,
        Filters: Filters,
        InstanceId: InstanceId,
        Groupings: js.UndefOr[Groupings] = js.undefined,
        MaxResults: js.UndefOr[MaxResult100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetCurrentMetricDataRequest = {
      val __obj = js.Dynamic.literal(
        "CurrentMetrics" -> CurrentMetrics.asInstanceOf[js.Any],
        "Filters"        -> Filters.asInstanceOf[js.Any],
        "InstanceId"     -> InstanceId.asInstanceOf[js.Any]
      )

      Groupings.foreach(__v => __obj.updateDynamic("Groupings")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCurrentMetricDataRequest]
    }
  }

  @js.native
  trait GetCurrentMetricDataResponse extends js.Object {
    var DataSnapshotTime: js.UndefOr[timestamp]
    var MetricResults: js.UndefOr[CurrentMetricResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetCurrentMetricDataResponse {
    @inline
    def apply(
        DataSnapshotTime: js.UndefOr[timestamp] = js.undefined,
        MetricResults: js.UndefOr[CurrentMetricResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetCurrentMetricDataResponse = {
      val __obj = js.Dynamic.literal()
      DataSnapshotTime.foreach(__v => __obj.updateDynamic("DataSnapshotTime")(__v.asInstanceOf[js.Any]))
      MetricResults.foreach(__v => __obj.updateDynamic("MetricResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCurrentMetricDataResponse]
    }
  }

  @js.native
  trait GetFederationTokenRequest extends js.Object {
    var InstanceId: InstanceId
  }

  object GetFederationTokenRequest {
    @inline
    def apply(
        InstanceId: InstanceId
    ): GetFederationTokenRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetFederationTokenRequest]
    }
  }

  @js.native
  trait GetFederationTokenResponse extends js.Object {
    var Credentials: js.UndefOr[Credentials]
  }

  object GetFederationTokenResponse {
    @inline
    def apply(
        Credentials: js.UndefOr[Credentials] = js.undefined
    ): GetFederationTokenResponse = {
      val __obj = js.Dynamic.literal()
      Credentials.foreach(__v => __obj.updateDynamic("Credentials")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFederationTokenResponse]
    }
  }

  @js.native
  trait GetMetricDataRequest extends js.Object {
    var EndTime: timestamp
    var Filters: Filters
    var HistoricalMetrics: HistoricalMetrics
    var InstanceId: InstanceId
    var StartTime: timestamp
    var Groupings: js.UndefOr[Groupings]
    var MaxResults: js.UndefOr[MaxResult100]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetMetricDataRequest {
    @inline
    def apply(
        EndTime: timestamp,
        Filters: Filters,
        HistoricalMetrics: HistoricalMetrics,
        InstanceId: InstanceId,
        StartTime: timestamp,
        Groupings: js.UndefOr[Groupings] = js.undefined,
        MaxResults: js.UndefOr[MaxResult100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetMetricDataRequest = {
      val __obj = js.Dynamic.literal(
        "EndTime"           -> EndTime.asInstanceOf[js.Any],
        "Filters"           -> Filters.asInstanceOf[js.Any],
        "HistoricalMetrics" -> HistoricalMetrics.asInstanceOf[js.Any],
        "InstanceId"        -> InstanceId.asInstanceOf[js.Any],
        "StartTime"         -> StartTime.asInstanceOf[js.Any]
      )

      Groupings.foreach(__v => __obj.updateDynamic("Groupings")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMetricDataRequest]
    }
  }

  @js.native
  trait GetMetricDataResponse extends js.Object {
    var MetricResults: js.UndefOr[HistoricalMetricResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetMetricDataResponse {
    @inline
    def apply(
        MetricResults: js.UndefOr[HistoricalMetricResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetMetricDataResponse = {
      val __obj = js.Dynamic.literal()
      MetricResults.foreach(__v => __obj.updateDynamic("MetricResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMetricDataResponse]
    }
  }

  object GroupingEnum {
    val QUEUE   = "QUEUE"
    val CHANNEL = "CHANNEL"

    val values = js.Object.freeze(js.Array(QUEUE, CHANNEL))
  }

  /**
    * Contains information about a hierarchy group.
    */
  @js.native
  trait HierarchyGroup extends js.Object {
    var Arn: js.UndefOr[ARN]
    var HierarchyPath: js.UndefOr[HierarchyPath]
    var Id: js.UndefOr[HierarchyGroupId]
    var LevelId: js.UndefOr[HierarchyLevelId]
    var Name: js.UndefOr[HierarchyGroupName]
  }

  object HierarchyGroup {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        HierarchyPath: js.UndefOr[HierarchyPath] = js.undefined,
        Id: js.UndefOr[HierarchyGroupId] = js.undefined,
        LevelId: js.UndefOr[HierarchyLevelId] = js.undefined,
        Name: js.UndefOr[HierarchyGroupName] = js.undefined
    ): HierarchyGroup = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      HierarchyPath.foreach(__v => __obj.updateDynamic("HierarchyPath")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LevelId.foreach(__v => __obj.updateDynamic("LevelId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HierarchyGroup]
    }
  }

  /**
    * Contains summary information about a hierarchy group.
    */
  @js.native
  trait HierarchyGroupSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[HierarchyGroupId]
    var Name: js.UndefOr[HierarchyGroupName]
  }

  object HierarchyGroupSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[HierarchyGroupId] = js.undefined,
        Name: js.UndefOr[HierarchyGroupName] = js.undefined
    ): HierarchyGroupSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HierarchyGroupSummary]
    }
  }

  /**
    * Contains information about a hierarchy level.
    */
  @js.native
  trait HierarchyLevel extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[HierarchyLevelId]
    var Name: js.UndefOr[HierarchyLevelName]
  }

  object HierarchyLevel {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[HierarchyLevelId] = js.undefined,
        Name: js.UndefOr[HierarchyLevelName] = js.undefined
    ): HierarchyLevel = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HierarchyLevel]
    }
  }

  /**
    * Contains information about the levels of a hierarchy group.
    */
  @js.native
  trait HierarchyPath extends js.Object {
    var LevelFive: js.UndefOr[HierarchyGroupSummary]
    var LevelFour: js.UndefOr[HierarchyGroupSummary]
    var LevelOne: js.UndefOr[HierarchyGroupSummary]
    var LevelThree: js.UndefOr[HierarchyGroupSummary]
    var LevelTwo: js.UndefOr[HierarchyGroupSummary]
  }

  object HierarchyPath {
    @inline
    def apply(
        LevelFive: js.UndefOr[HierarchyGroupSummary] = js.undefined,
        LevelFour: js.UndefOr[HierarchyGroupSummary] = js.undefined,
        LevelOne: js.UndefOr[HierarchyGroupSummary] = js.undefined,
        LevelThree: js.UndefOr[HierarchyGroupSummary] = js.undefined,
        LevelTwo: js.UndefOr[HierarchyGroupSummary] = js.undefined
    ): HierarchyPath = {
      val __obj = js.Dynamic.literal()
      LevelFive.foreach(__v => __obj.updateDynamic("LevelFive")(__v.asInstanceOf[js.Any]))
      LevelFour.foreach(__v => __obj.updateDynamic("LevelFour")(__v.asInstanceOf[js.Any]))
      LevelOne.foreach(__v => __obj.updateDynamic("LevelOne")(__v.asInstanceOf[js.Any]))
      LevelThree.foreach(__v => __obj.updateDynamic("LevelThree")(__v.asInstanceOf[js.Any]))
      LevelTwo.foreach(__v => __obj.updateDynamic("LevelTwo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HierarchyPath]
    }
  }

  /**
    * Contains information about a hierarchy structure.
    */
  @js.native
  trait HierarchyStructure extends js.Object {
    var LevelFive: js.UndefOr[HierarchyLevel]
    var LevelFour: js.UndefOr[HierarchyLevel]
    var LevelOne: js.UndefOr[HierarchyLevel]
    var LevelThree: js.UndefOr[HierarchyLevel]
    var LevelTwo: js.UndefOr[HierarchyLevel]
  }

  object HierarchyStructure {
    @inline
    def apply(
        LevelFive: js.UndefOr[HierarchyLevel] = js.undefined,
        LevelFour: js.UndefOr[HierarchyLevel] = js.undefined,
        LevelOne: js.UndefOr[HierarchyLevel] = js.undefined,
        LevelThree: js.UndefOr[HierarchyLevel] = js.undefined,
        LevelTwo: js.UndefOr[HierarchyLevel] = js.undefined
    ): HierarchyStructure = {
      val __obj = js.Dynamic.literal()
      LevelFive.foreach(__v => __obj.updateDynamic("LevelFive")(__v.asInstanceOf[js.Any]))
      LevelFour.foreach(__v => __obj.updateDynamic("LevelFour")(__v.asInstanceOf[js.Any]))
      LevelOne.foreach(__v => __obj.updateDynamic("LevelOne")(__v.asInstanceOf[js.Any]))
      LevelThree.foreach(__v => __obj.updateDynamic("LevelThree")(__v.asInstanceOf[js.Any]))
      LevelTwo.foreach(__v => __obj.updateDynamic("LevelTwo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HierarchyStructure]
    }
  }

  /**
    * Contains information about a historical metric.
    */
  @js.native
  trait HistoricalMetric extends js.Object {
    var Name: js.UndefOr[HistoricalMetricName]
    var Statistic: js.UndefOr[Statistic]
    var Threshold: js.UndefOr[Threshold]
    var Unit: js.UndefOr[Unit]
  }

  object HistoricalMetric {
    @inline
    def apply(
        Name: js.UndefOr[HistoricalMetricName] = js.undefined,
        Statistic: js.UndefOr[Statistic] = js.undefined,
        Threshold: js.UndefOr[Threshold] = js.undefined,
        Unit: js.UndefOr[Unit] = js.undefined
    ): HistoricalMetric = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Statistic.foreach(__v => __obj.updateDynamic("Statistic")(__v.asInstanceOf[js.Any]))
      Threshold.foreach(__v => __obj.updateDynamic("Threshold")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HistoricalMetric]
    }
  }

  /**
    * Contains the data for a historical metric.
    */
  @js.native
  trait HistoricalMetricData extends js.Object {
    var Metric: js.UndefOr[HistoricalMetric]
    var Value: js.UndefOr[Value]
  }

  object HistoricalMetricData {
    @inline
    def apply(
        Metric: js.UndefOr[HistoricalMetric] = js.undefined,
        Value: js.UndefOr[Value] = js.undefined
    ): HistoricalMetricData = {
      val __obj = js.Dynamic.literal()
      Metric.foreach(__v => __obj.updateDynamic("Metric")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HistoricalMetricData]
    }
  }

  /**
    * The historical metric names.
    */
  object HistoricalMetricNameEnum {
    val CONTACTS_QUEUED                     = "CONTACTS_QUEUED"
    val CONTACTS_HANDLED                    = "CONTACTS_HANDLED"
    val CONTACTS_ABANDONED                  = "CONTACTS_ABANDONED"
    val CONTACTS_CONSULTED                  = "CONTACTS_CONSULTED"
    val CONTACTS_AGENT_HUNG_UP_FIRST        = "CONTACTS_AGENT_HUNG_UP_FIRST"
    val CONTACTS_HANDLED_INCOMING           = "CONTACTS_HANDLED_INCOMING"
    val CONTACTS_HANDLED_OUTBOUND           = "CONTACTS_HANDLED_OUTBOUND"
    val CONTACTS_HOLD_ABANDONS              = "CONTACTS_HOLD_ABANDONS"
    val CONTACTS_TRANSFERRED_IN             = "CONTACTS_TRANSFERRED_IN"
    val CONTACTS_TRANSFERRED_OUT            = "CONTACTS_TRANSFERRED_OUT"
    val CONTACTS_TRANSFERRED_IN_FROM_QUEUE  = "CONTACTS_TRANSFERRED_IN_FROM_QUEUE"
    val CONTACTS_TRANSFERRED_OUT_FROM_QUEUE = "CONTACTS_TRANSFERRED_OUT_FROM_QUEUE"
    val CONTACTS_MISSED                     = "CONTACTS_MISSED"
    val CALLBACK_CONTACTS_HANDLED           = "CALLBACK_CONTACTS_HANDLED"
    val API_CONTACTS_HANDLED                = "API_CONTACTS_HANDLED"
    val OCCUPANCY                           = "OCCUPANCY"
    val HANDLE_TIME                         = "HANDLE_TIME"
    val AFTER_CONTACT_WORK_TIME             = "AFTER_CONTACT_WORK_TIME"
    val QUEUED_TIME                         = "QUEUED_TIME"
    val ABANDON_TIME                        = "ABANDON_TIME"
    val QUEUE_ANSWER_TIME                   = "QUEUE_ANSWER_TIME"
    val HOLD_TIME                           = "HOLD_TIME"
    val INTERACTION_TIME                    = "INTERACTION_TIME"
    val INTERACTION_AND_HOLD_TIME           = "INTERACTION_AND_HOLD_TIME"
    val SERVICE_LEVEL                       = "SERVICE_LEVEL"

    val values = js.Object.freeze(
      js.Array(
        CONTACTS_QUEUED,
        CONTACTS_HANDLED,
        CONTACTS_ABANDONED,
        CONTACTS_CONSULTED,
        CONTACTS_AGENT_HUNG_UP_FIRST,
        CONTACTS_HANDLED_INCOMING,
        CONTACTS_HANDLED_OUTBOUND,
        CONTACTS_HOLD_ABANDONS,
        CONTACTS_TRANSFERRED_IN,
        CONTACTS_TRANSFERRED_OUT,
        CONTACTS_TRANSFERRED_IN_FROM_QUEUE,
        CONTACTS_TRANSFERRED_OUT_FROM_QUEUE,
        CONTACTS_MISSED,
        CALLBACK_CONTACTS_HANDLED,
        API_CONTACTS_HANDLED,
        OCCUPANCY,
        HANDLE_TIME,
        AFTER_CONTACT_WORK_TIME,
        QUEUED_TIME,
        ABANDON_TIME,
        QUEUE_ANSWER_TIME,
        HOLD_TIME,
        INTERACTION_TIME,
        INTERACTION_AND_HOLD_TIME,
        SERVICE_LEVEL
      )
    )
  }

  /**
    * Contains information about the historical metrics retrieved.
    */
  @js.native
  trait HistoricalMetricResult extends js.Object {
    var Collections: js.UndefOr[HistoricalMetricDataCollections]
    var Dimensions: js.UndefOr[Dimensions]
  }

  object HistoricalMetricResult {
    @inline
    def apply(
        Collections: js.UndefOr[HistoricalMetricDataCollections] = js.undefined,
        Dimensions: js.UndefOr[Dimensions] = js.undefined
    ): HistoricalMetricResult = {
      val __obj = js.Dynamic.literal()
      Collections.foreach(__v => __obj.updateDynamic("Collections")(__v.asInstanceOf[js.Any]))
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HistoricalMetricResult]
    }
  }

  /**
    * Contains summary information about hours of operation for a contact center.
    */
  @js.native
  trait HoursOfOperationSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[HoursOfOperationId]
    var Name: js.UndefOr[HoursOfOperationName]
  }

  object HoursOfOperationSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[HoursOfOperationId] = js.undefined,
        Name: js.UndefOr[HoursOfOperationName] = js.undefined
    ): HoursOfOperationSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HoursOfOperationSummary]
    }
  }

  @js.native
  trait ListContactFlowsRequest extends js.Object {
    var InstanceId: InstanceId
    var ContactFlowTypes: js.UndefOr[ContactFlowTypes]
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListContactFlowsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        ContactFlowTypes: js.UndefOr[ContactFlowTypes] = js.undefined,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListContactFlowsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      ContactFlowTypes.foreach(__v => __obj.updateDynamic("ContactFlowTypes")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContactFlowsRequest]
    }
  }

  @js.native
  trait ListContactFlowsResponse extends js.Object {
    var ContactFlowSummaryList: js.UndefOr[ContactFlowSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListContactFlowsResponse {
    @inline
    def apply(
        ContactFlowSummaryList: js.UndefOr[ContactFlowSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListContactFlowsResponse = {
      val __obj = js.Dynamic.literal()
      ContactFlowSummaryList.foreach(__v => __obj.updateDynamic("ContactFlowSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContactFlowsResponse]
    }
  }

  @js.native
  trait ListHoursOfOperationsRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHoursOfOperationsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHoursOfOperationsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHoursOfOperationsRequest]
    }
  }

  @js.native
  trait ListHoursOfOperationsResponse extends js.Object {
    var HoursOfOperationSummaryList: js.UndefOr[HoursOfOperationSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHoursOfOperationsResponse {
    @inline
    def apply(
        HoursOfOperationSummaryList: js.UndefOr[HoursOfOperationSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHoursOfOperationsResponse = {
      val __obj = js.Dynamic.literal()
      HoursOfOperationSummaryList.foreach(__v =>
        __obj.updateDynamic("HoursOfOperationSummaryList")(__v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHoursOfOperationsResponse]
    }
  }

  @js.native
  trait ListPhoneNumbersRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
    var PhoneNumberCountryCodes: js.UndefOr[PhoneNumberCountryCodes]
    var PhoneNumberTypes: js.UndefOr[PhoneNumberTypes]
  }

  object ListPhoneNumbersRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PhoneNumberCountryCodes: js.UndefOr[PhoneNumberCountryCodes] = js.undefined,
        PhoneNumberTypes: js.UndefOr[PhoneNumberTypes] = js.undefined
    ): ListPhoneNumbersRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PhoneNumberCountryCodes.foreach(__v => __obj.updateDynamic("PhoneNumberCountryCodes")(__v.asInstanceOf[js.Any]))
      PhoneNumberTypes.foreach(__v => __obj.updateDynamic("PhoneNumberTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumbersRequest]
    }
  }

  @js.native
  trait ListPhoneNumbersResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PhoneNumberSummaryList: js.UndefOr[PhoneNumberSummaryList]
  }

  object ListPhoneNumbersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PhoneNumberSummaryList: js.UndefOr[PhoneNumberSummaryList] = js.undefined
    ): ListPhoneNumbersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PhoneNumberSummaryList.foreach(__v => __obj.updateDynamic("PhoneNumberSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumbersResponse]
    }
  }

  @js.native
  trait ListQueuesRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
    var QueueTypes: js.UndefOr[QueueTypes]
  }

  object ListQueuesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        QueueTypes: js.UndefOr[QueueTypes] = js.undefined
    ): ListQueuesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      QueueTypes.foreach(__v => __obj.updateDynamic("QueueTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueuesRequest]
    }
  }

  @js.native
  trait ListQueuesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var QueueSummaryList: js.UndefOr[QueueSummaryList]
  }

  object ListQueuesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        QueueSummaryList: js.UndefOr[QueueSummaryList] = js.undefined
    ): ListQueuesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      QueueSummaryList.foreach(__v => __obj.updateDynamic("QueueSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueuesResponse]
    }
  }

  @js.native
  trait ListRoutingProfilesRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRoutingProfilesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRoutingProfilesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoutingProfilesRequest]
    }
  }

  @js.native
  trait ListRoutingProfilesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RoutingProfileSummaryList: js.UndefOr[RoutingProfileSummaryList]
  }

  object ListRoutingProfilesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RoutingProfileSummaryList: js.UndefOr[RoutingProfileSummaryList] = js.undefined
    ): ListRoutingProfilesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RoutingProfileSummaryList.foreach(__v =>
        __obj.updateDynamic("RoutingProfileSummaryList")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListRoutingProfilesResponse]
    }
  }

  @js.native
  trait ListSecurityProfilesRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSecurityProfilesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSecurityProfilesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecurityProfilesRequest]
    }
  }

  @js.native
  trait ListSecurityProfilesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SecurityProfileSummaryList: js.UndefOr[SecurityProfileSummaryList]
  }

  object ListSecurityProfilesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SecurityProfileSummaryList: js.UndefOr[SecurityProfileSummaryList] = js.undefined
    ): ListSecurityProfilesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SecurityProfileSummaryList.foreach(__v =>
        __obj.updateDynamic("SecurityProfileSummaryList")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListSecurityProfilesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ARN
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: ARN
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

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

  @js.native
  trait ListUserHierarchyGroupsRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListUserHierarchyGroupsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListUserHierarchyGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserHierarchyGroupsRequest]
    }
  }

  @js.native
  trait ListUserHierarchyGroupsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var UserHierarchyGroupSummaryList: js.UndefOr[HierarchyGroupSummaryList]
  }

  object ListUserHierarchyGroupsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        UserHierarchyGroupSummaryList: js.UndefOr[HierarchyGroupSummaryList] = js.undefined
    ): ListUserHierarchyGroupsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UserHierarchyGroupSummaryList.foreach(__v =>
        __obj.updateDynamic("UserHierarchyGroupSummaryList")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListUserHierarchyGroupsResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListUsersRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListUsersRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersRequest]
    }
  }

  @js.native
  trait ListUsersResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var UserSummaryList: js.UndefOr[UserSummaryList]
  }

  object ListUsersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        UserSummaryList: js.UndefOr[UserSummaryList] = js.undefined
    ): ListUsersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UserSummaryList.foreach(__v => __obj.updateDynamic("UserSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersResponse]
    }
  }

  /**
    * The customer's details.
    */
  @js.native
  trait ParticipantDetails extends js.Object {
    var DisplayName: DisplayName
  }

  object ParticipantDetails {
    @inline
    def apply(
        DisplayName: DisplayName
    ): ParticipantDetails = {
      val __obj = js.Dynamic.literal(
        "DisplayName" -> DisplayName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ParticipantDetails]
    }
  }

  object PhoneNumberCountryCodeEnum {
    val AF = "AF"
    val AL = "AL"
    val DZ = "DZ"
    val AS = "AS"
    val AD = "AD"
    val AO = "AO"
    val AI = "AI"
    val AQ = "AQ"
    val AG = "AG"
    val AR = "AR"
    val AM = "AM"
    val AW = "AW"
    val AU = "AU"
    val AT = "AT"
    val AZ = "AZ"
    val BS = "BS"
    val BH = "BH"
    val BD = "BD"
    val BB = "BB"
    val BY = "BY"
    val BE = "BE"
    val BZ = "BZ"
    val BJ = "BJ"
    val BM = "BM"
    val BT = "BT"
    val BO = "BO"
    val BA = "BA"
    val BW = "BW"
    val BR = "BR"
    val IO = "IO"
    val VG = "VG"
    val BN = "BN"
    val BG = "BG"
    val BF = "BF"
    val BI = "BI"
    val KH = "KH"
    val CM = "CM"
    val CA = "CA"
    val CV = "CV"
    val KY = "KY"
    val CF = "CF"
    val TD = "TD"
    val CL = "CL"
    val CN = "CN"
    val CX = "CX"
    val CC = "CC"
    val CO = "CO"
    val KM = "KM"
    val CK = "CK"
    val CR = "CR"
    val HR = "HR"
    val CU = "CU"
    val CW = "CW"
    val CY = "CY"
    val CZ = "CZ"
    val CD = "CD"
    val DK = "DK"
    val DJ = "DJ"
    val DM = "DM"
    val DO = "DO"
    val TL = "TL"
    val EC = "EC"
    val EG = "EG"
    val SV = "SV"
    val GQ = "GQ"
    val ER = "ER"
    val EE = "EE"
    val ET = "ET"
    val FK = "FK"
    val FO = "FO"
    val FJ = "FJ"
    val FI = "FI"
    val FR = "FR"
    val PF = "PF"
    val GA = "GA"
    val GM = "GM"
    val GE = "GE"
    val DE = "DE"
    val GH = "GH"
    val GI = "GI"
    val GR = "GR"
    val GL = "GL"
    val GD = "GD"
    val GU = "GU"
    val GT = "GT"
    val GG = "GG"
    val GN = "GN"
    val GW = "GW"
    val GY = "GY"
    val HT = "HT"
    val HN = "HN"
    val HK = "HK"
    val HU = "HU"
    val IS = "IS"
    val IN = "IN"
    val ID = "ID"
    val IR = "IR"
    val IQ = "IQ"
    val IE = "IE"
    val IM = "IM"
    val IL = "IL"
    val IT = "IT"
    val CI = "CI"
    val JM = "JM"
    val JP = "JP"
    val JE = "JE"
    val JO = "JO"
    val KZ = "KZ"
    val KE = "KE"
    val KI = "KI"
    val KW = "KW"
    val KG = "KG"
    val LA = "LA"
    val LV = "LV"
    val LB = "LB"
    val LS = "LS"
    val LR = "LR"
    val LY = "LY"
    val LI = "LI"
    val LT = "LT"
    val LU = "LU"
    val MO = "MO"
    val MK = "MK"
    val MG = "MG"
    val MW = "MW"
    val MY = "MY"
    val MV = "MV"
    val ML = "ML"
    val MT = "MT"
    val MH = "MH"
    val MR = "MR"
    val MU = "MU"
    val YT = "YT"
    val MX = "MX"
    val FM = "FM"
    val MD = "MD"
    val MC = "MC"
    val MN = "MN"
    val ME = "ME"
    val MS = "MS"
    val MA = "MA"
    val MZ = "MZ"
    val MM = "MM"
    val NA = "NA"
    val NR = "NR"
    val NP = "NP"
    val NL = "NL"
    val AN = "AN"
    val NC = "NC"
    val NZ = "NZ"
    val NI = "NI"
    val NE = "NE"
    val NG = "NG"
    val NU = "NU"
    val KP = "KP"
    val MP = "MP"
    val NO = "NO"
    val OM = "OM"
    val PK = "PK"
    val PW = "PW"
    val PA = "PA"
    val PG = "PG"
    val PY = "PY"
    val PE = "PE"
    val PH = "PH"
    val PN = "PN"
    val PL = "PL"
    val PT = "PT"
    val PR = "PR"
    val QA = "QA"
    val CG = "CG"
    val RE = "RE"
    val RO = "RO"
    val RU = "RU"
    val RW = "RW"
    val BL = "BL"
    val SH = "SH"
    val KN = "KN"
    val LC = "LC"
    val MF = "MF"
    val PM = "PM"
    val VC = "VC"
    val WS = "WS"
    val SM = "SM"
    val ST = "ST"
    val SA = "SA"
    val SN = "SN"
    val RS = "RS"
    val SC = "SC"
    val SL = "SL"
    val SG = "SG"
    val SX = "SX"
    val SK = "SK"
    val SI = "SI"
    val SB = "SB"
    val SO = "SO"
    val ZA = "ZA"
    val KR = "KR"
    val ES = "ES"
    val LK = "LK"
    val SD = "SD"
    val SR = "SR"
    val SJ = "SJ"
    val SZ = "SZ"
    val SE = "SE"
    val CH = "CH"
    val SY = "SY"
    val TW = "TW"
    val TJ = "TJ"
    val TZ = "TZ"
    val TH = "TH"
    val TG = "TG"
    val TK = "TK"
    val TO = "TO"
    val TT = "TT"
    val TN = "TN"
    val TR = "TR"
    val TM = "TM"
    val TC = "TC"
    val TV = "TV"
    val VI = "VI"
    val UG = "UG"
    val UA = "UA"
    val AE = "AE"
    val GB = "GB"
    val US = "US"
    val UY = "UY"
    val UZ = "UZ"
    val VU = "VU"
    val VA = "VA"
    val VE = "VE"
    val VN = "VN"
    val WF = "WF"
    val EH = "EH"
    val YE = "YE"
    val ZM = "ZM"
    val ZW = "ZW"

    val values = js.Object.freeze(
      js.Array(
        AF,
        AL,
        DZ,
        AS,
        AD,
        AO,
        AI,
        AQ,
        AG,
        AR,
        AM,
        AW,
        AU,
        AT,
        AZ,
        BS,
        BH,
        BD,
        BB,
        BY,
        BE,
        BZ,
        BJ,
        BM,
        BT,
        BO,
        BA,
        BW,
        BR,
        IO,
        VG,
        BN,
        BG,
        BF,
        BI,
        KH,
        CM,
        CA,
        CV,
        KY,
        CF,
        TD,
        CL,
        CN,
        CX,
        CC,
        CO,
        KM,
        CK,
        CR,
        HR,
        CU,
        CW,
        CY,
        CZ,
        CD,
        DK,
        DJ,
        DM,
        DO,
        TL,
        EC,
        EG,
        SV,
        GQ,
        ER,
        EE,
        ET,
        FK,
        FO,
        FJ,
        FI,
        FR,
        PF,
        GA,
        GM,
        GE,
        DE,
        GH,
        GI,
        GR,
        GL,
        GD,
        GU,
        GT,
        GG,
        GN,
        GW,
        GY,
        HT,
        HN,
        HK,
        HU,
        IS,
        IN,
        ID,
        IR,
        IQ,
        IE,
        IM,
        IL,
        IT,
        CI,
        JM,
        JP,
        JE,
        JO,
        KZ,
        KE,
        KI,
        KW,
        KG,
        LA,
        LV,
        LB,
        LS,
        LR,
        LY,
        LI,
        LT,
        LU,
        MO,
        MK,
        MG,
        MW,
        MY,
        MV,
        ML,
        MT,
        MH,
        MR,
        MU,
        YT,
        MX,
        FM,
        MD,
        MC,
        MN,
        ME,
        MS,
        MA,
        MZ,
        MM,
        NA,
        NR,
        NP,
        NL,
        AN,
        NC,
        NZ,
        NI,
        NE,
        NG,
        NU,
        KP,
        MP,
        NO,
        OM,
        PK,
        PW,
        PA,
        PG,
        PY,
        PE,
        PH,
        PN,
        PL,
        PT,
        PR,
        QA,
        CG,
        RE,
        RO,
        RU,
        RW,
        BL,
        SH,
        KN,
        LC,
        MF,
        PM,
        VC,
        WS,
        SM,
        ST,
        SA,
        SN,
        RS,
        SC,
        SL,
        SG,
        SX,
        SK,
        SI,
        SB,
        SO,
        ZA,
        KR,
        ES,
        LK,
        SD,
        SR,
        SJ,
        SZ,
        SE,
        CH,
        SY,
        TW,
        TJ,
        TZ,
        TH,
        TG,
        TK,
        TO,
        TT,
        TN,
        TR,
        TM,
        TC,
        TV,
        VI,
        UG,
        UA,
        AE,
        GB,
        US,
        UY,
        UZ,
        VU,
        VA,
        VE,
        VN,
        WF,
        EH,
        YE,
        ZM,
        ZW
      )
    )
  }

  /**
    * Contains summary information about a phone number for a contact center.
    */
  @js.native
  trait PhoneNumberSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[PhoneNumberId]
    var PhoneNumber: js.UndefOr[PhoneNumber]
    var PhoneNumberCountryCode: js.UndefOr[PhoneNumberCountryCode]
    var PhoneNumberType: js.UndefOr[PhoneNumberType]
  }

  object PhoneNumberSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[PhoneNumberId] = js.undefined,
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined,
        PhoneNumberCountryCode: js.UndefOr[PhoneNumberCountryCode] = js.undefined,
        PhoneNumberType: js.UndefOr[PhoneNumberType] = js.undefined
    ): PhoneNumberSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      PhoneNumberCountryCode.foreach(__v => __obj.updateDynamic("PhoneNumberCountryCode")(__v.asInstanceOf[js.Any]))
      PhoneNumberType.foreach(__v => __obj.updateDynamic("PhoneNumberType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumberSummary]
    }
  }

  object PhoneNumberTypeEnum {
    val TOLL_FREE = "TOLL_FREE"
    val DID       = "DID"

    val values = js.Object.freeze(js.Array(TOLL_FREE, DID))
  }

  object PhoneTypeEnum {
    val SOFT_PHONE = "SOFT_PHONE"
    val DESK_PHONE = "DESK_PHONE"

    val values = js.Object.freeze(js.Array(SOFT_PHONE, DESK_PHONE))
  }

  /**
    * Contains information about a queue resource for which metrics are returned.
    */
  @js.native
  trait QueueReference extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[QueueId]
  }

  object QueueReference {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[QueueId] = js.undefined
    ): QueueReference = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueueReference]
    }
  }

  /**
    * Contains summary information about a queue.
    */
  @js.native
  trait QueueSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[QueueId]
    var Name: js.UndefOr[QueueName]
    var QueueType: js.UndefOr[QueueType]
  }

  object QueueSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[QueueId] = js.undefined,
        Name: js.UndefOr[QueueName] = js.undefined,
        QueueType: js.UndefOr[QueueType] = js.undefined
    ): QueueSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      QueueType.foreach(__v => __obj.updateDynamic("QueueType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueueSummary]
    }
  }

  object QueueTypeEnum {
    val STANDARD = "STANDARD"
    val AGENT    = "AGENT"

    val values = js.Object.freeze(js.Array(STANDARD, AGENT))
  }

  /**
    * Contains summary information about a routing profile.
    */
  @js.native
  trait RoutingProfileSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[RoutingProfileId]
    var Name: js.UndefOr[RoutingProfileName]
  }

  object RoutingProfileSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[RoutingProfileId] = js.undefined,
        Name: js.UndefOr[RoutingProfileName] = js.undefined
    ): RoutingProfileSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoutingProfileSummary]
    }
  }

  /**
    * Contains information about a security profile.
    */
  @js.native
  trait SecurityProfileSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[SecurityProfileId]
    var Name: js.UndefOr[SecurityProfileName]
  }

  object SecurityProfileSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[SecurityProfileId] = js.undefined,
        Name: js.UndefOr[SecurityProfileName] = js.undefined
    ): SecurityProfileSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityProfileSummary]
    }
  }

  @js.native
  trait StartChatContactRequest extends js.Object {
    var ContactFlowId: ContactFlowId
    var InstanceId: InstanceId
    var ParticipantDetails: ParticipantDetails
    var Attributes: js.UndefOr[Attributes]
    var ClientToken: js.UndefOr[ClientToken]
    var InitialMessage: js.UndefOr[ChatMessage]
  }

  object StartChatContactRequest {
    @inline
    def apply(
        ContactFlowId: ContactFlowId,
        InstanceId: InstanceId,
        ParticipantDetails: ParticipantDetails,
        Attributes: js.UndefOr[Attributes] = js.undefined,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        InitialMessage: js.UndefOr[ChatMessage] = js.undefined
    ): StartChatContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactFlowId"      -> ContactFlowId.asInstanceOf[js.Any],
        "InstanceId"         -> InstanceId.asInstanceOf[js.Any],
        "ParticipantDetails" -> ParticipantDetails.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      InitialMessage.foreach(__v => __obj.updateDynamic("InitialMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartChatContactRequest]
    }
  }

  @js.native
  trait StartChatContactResponse extends js.Object {
    var ContactId: js.UndefOr[ContactId]
    var ParticipantId: js.UndefOr[ParticipantId]
    var ParticipantToken: js.UndefOr[ParticipantToken]
  }

  object StartChatContactResponse {
    @inline
    def apply(
        ContactId: js.UndefOr[ContactId] = js.undefined,
        ParticipantId: js.UndefOr[ParticipantId] = js.undefined,
        ParticipantToken: js.UndefOr[ParticipantToken] = js.undefined
    ): StartChatContactResponse = {
      val __obj = js.Dynamic.literal()
      ContactId.foreach(__v => __obj.updateDynamic("ContactId")(__v.asInstanceOf[js.Any]))
      ParticipantId.foreach(__v => __obj.updateDynamic("ParticipantId")(__v.asInstanceOf[js.Any]))
      ParticipantToken.foreach(__v => __obj.updateDynamic("ParticipantToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartChatContactResponse]
    }
  }

  @js.native
  trait StartOutboundVoiceContactRequest extends js.Object {
    var ContactFlowId: ContactFlowId
    var DestinationPhoneNumber: PhoneNumber
    var InstanceId: InstanceId
    var Attributes: js.UndefOr[Attributes]
    var ClientToken: js.UndefOr[ClientToken]
    var QueueId: js.UndefOr[QueueId]
    var SourcePhoneNumber: js.UndefOr[PhoneNumber]
  }

  object StartOutboundVoiceContactRequest {
    @inline
    def apply(
        ContactFlowId: ContactFlowId,
        DestinationPhoneNumber: PhoneNumber,
        InstanceId: InstanceId,
        Attributes: js.UndefOr[Attributes] = js.undefined,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        QueueId: js.UndefOr[QueueId] = js.undefined,
        SourcePhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): StartOutboundVoiceContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactFlowId"          -> ContactFlowId.asInstanceOf[js.Any],
        "DestinationPhoneNumber" -> DestinationPhoneNumber.asInstanceOf[js.Any],
        "InstanceId"             -> InstanceId.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      QueueId.foreach(__v => __obj.updateDynamic("QueueId")(__v.asInstanceOf[js.Any]))
      SourcePhoneNumber.foreach(__v => __obj.updateDynamic("SourcePhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartOutboundVoiceContactRequest]
    }
  }

  @js.native
  trait StartOutboundVoiceContactResponse extends js.Object {
    var ContactId: js.UndefOr[ContactId]
  }

  object StartOutboundVoiceContactResponse {
    @inline
    def apply(
        ContactId: js.UndefOr[ContactId] = js.undefined
    ): StartOutboundVoiceContactResponse = {
      val __obj = js.Dynamic.literal()
      ContactId.foreach(__v => __obj.updateDynamic("ContactId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartOutboundVoiceContactResponse]
    }
  }

  object StatisticEnum {
    val SUM = "SUM"
    val MAX = "MAX"
    val AVG = "AVG"

    val values = js.Object.freeze(js.Array(SUM, MAX, AVG))
  }

  @js.native
  trait StopContactRequest extends js.Object {
    var ContactId: ContactId
    var InstanceId: InstanceId
  }

  object StopContactRequest {
    @inline
    def apply(
        ContactId: ContactId,
        InstanceId: InstanceId
    ): StopContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactId"  -> ContactId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopContactRequest]
    }
  }

  @js.native
  trait StopContactResponse extends js.Object {}

  object StopContactResponse {
    @inline
    def apply(
        ): StopContactResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[StopContactResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ARN
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ARN,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags"        -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  /**
    * Contains information about the threshold for service level metrics.
    */
  @js.native
  trait Threshold extends js.Object {
    var Comparison: js.UndefOr[Comparison]
    var ThresholdValue: js.UndefOr[ThresholdValue]
  }

  object Threshold {
    @inline
    def apply(
        Comparison: js.UndefOr[Comparison] = js.undefined,
        ThresholdValue: js.UndefOr[ThresholdValue] = js.undefined
    ): Threshold = {
      val __obj = js.Dynamic.literal()
      Comparison.foreach(__v => __obj.updateDynamic("Comparison")(__v.asInstanceOf[js.Any]))
      ThresholdValue.foreach(__v => __obj.updateDynamic("ThresholdValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Threshold]
    }
  }

  object UnitEnum {
    val SECONDS = "SECONDS"
    val COUNT   = "COUNT"
    val PERCENT = "PERCENT"

    val values = js.Object.freeze(js.Array(SECONDS, COUNT, PERCENT))
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ARN
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: ARN,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateContactAttributesRequest extends js.Object {
    var Attributes: Attributes
    var InitialContactId: ContactId
    var InstanceId: InstanceId
  }

  object UpdateContactAttributesRequest {
    @inline
    def apply(
        Attributes: Attributes,
        InitialContactId: ContactId,
        InstanceId: InstanceId
    ): UpdateContactAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "Attributes"       -> Attributes.asInstanceOf[js.Any],
        "InitialContactId" -> InitialContactId.asInstanceOf[js.Any],
        "InstanceId"       -> InstanceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateContactAttributesRequest]
    }
  }

  @js.native
  trait UpdateContactAttributesResponse extends js.Object {}

  object UpdateContactAttributesResponse {
    @inline
    def apply(
        ): UpdateContactAttributesResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateContactAttributesResponse]
    }
  }

  @js.native
  trait UpdateUserHierarchyRequest extends js.Object {
    var InstanceId: InstanceId
    var UserId: UserId
    var HierarchyGroupId: js.UndefOr[HierarchyGroupId]
  }

  object UpdateUserHierarchyRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        UserId: UserId,
        HierarchyGroupId: js.UndefOr[HierarchyGroupId] = js.undefined
    ): UpdateUserHierarchyRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "UserId"     -> UserId.asInstanceOf[js.Any]
      )

      HierarchyGroupId.foreach(__v => __obj.updateDynamic("HierarchyGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserHierarchyRequest]
    }
  }

  @js.native
  trait UpdateUserIdentityInfoRequest extends js.Object {
    var IdentityInfo: UserIdentityInfo
    var InstanceId: InstanceId
    var UserId: UserId
  }

  object UpdateUserIdentityInfoRequest {
    @inline
    def apply(
        IdentityInfo: UserIdentityInfo,
        InstanceId: InstanceId,
        UserId: UserId
    ): UpdateUserIdentityInfoRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityInfo" -> IdentityInfo.asInstanceOf[js.Any],
        "InstanceId"   -> InstanceId.asInstanceOf[js.Any],
        "UserId"       -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateUserIdentityInfoRequest]
    }
  }

  @js.native
  trait UpdateUserPhoneConfigRequest extends js.Object {
    var InstanceId: InstanceId
    var PhoneConfig: UserPhoneConfig
    var UserId: UserId
  }

  object UpdateUserPhoneConfigRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        PhoneConfig: UserPhoneConfig,
        UserId: UserId
    ): UpdateUserPhoneConfigRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId"  -> InstanceId.asInstanceOf[js.Any],
        "PhoneConfig" -> PhoneConfig.asInstanceOf[js.Any],
        "UserId"      -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateUserPhoneConfigRequest]
    }
  }

  @js.native
  trait UpdateUserRoutingProfileRequest extends js.Object {
    var InstanceId: InstanceId
    var RoutingProfileId: RoutingProfileId
    var UserId: UserId
  }

  object UpdateUserRoutingProfileRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        RoutingProfileId: RoutingProfileId,
        UserId: UserId
    ): UpdateUserRoutingProfileRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId"       -> InstanceId.asInstanceOf[js.Any],
        "RoutingProfileId" -> RoutingProfileId.asInstanceOf[js.Any],
        "UserId"           -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateUserRoutingProfileRequest]
    }
  }

  @js.native
  trait UpdateUserSecurityProfilesRequest extends js.Object {
    var InstanceId: InstanceId
    var SecurityProfileIds: SecurityProfileIds
    var UserId: UserId
  }

  object UpdateUserSecurityProfilesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        SecurityProfileIds: SecurityProfileIds,
        UserId: UserId
    ): UpdateUserSecurityProfilesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId"         -> InstanceId.asInstanceOf[js.Any],
        "SecurityProfileIds" -> SecurityProfileIds.asInstanceOf[js.Any],
        "UserId"             -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateUserSecurityProfilesRequest]
    }
  }

  /**
    * Contains information about a user account for a Amazon Connect instance.
    */
  @js.native
  trait User extends js.Object {
    var Arn: js.UndefOr[ARN]
    var DirectoryUserId: js.UndefOr[DirectoryUserId]
    var HierarchyGroupId: js.UndefOr[HierarchyGroupId]
    var Id: js.UndefOr[UserId]
    var IdentityInfo: js.UndefOr[UserIdentityInfo]
    var PhoneConfig: js.UndefOr[UserPhoneConfig]
    var RoutingProfileId: js.UndefOr[RoutingProfileId]
    var SecurityProfileIds: js.UndefOr[SecurityProfileIds]
    var Tags: js.UndefOr[TagMap]
    var Username: js.UndefOr[AgentUsername]
  }

  object User {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        DirectoryUserId: js.UndefOr[DirectoryUserId] = js.undefined,
        HierarchyGroupId: js.UndefOr[HierarchyGroupId] = js.undefined,
        Id: js.UndefOr[UserId] = js.undefined,
        IdentityInfo: js.UndefOr[UserIdentityInfo] = js.undefined,
        PhoneConfig: js.UndefOr[UserPhoneConfig] = js.undefined,
        RoutingProfileId: js.UndefOr[RoutingProfileId] = js.undefined,
        SecurityProfileIds: js.UndefOr[SecurityProfileIds] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        Username: js.UndefOr[AgentUsername] = js.undefined
    ): User = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      DirectoryUserId.foreach(__v => __obj.updateDynamic("DirectoryUserId")(__v.asInstanceOf[js.Any]))
      HierarchyGroupId.foreach(__v => __obj.updateDynamic("HierarchyGroupId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IdentityInfo.foreach(__v => __obj.updateDynamic("IdentityInfo")(__v.asInstanceOf[js.Any]))
      PhoneConfig.foreach(__v => __obj.updateDynamic("PhoneConfig")(__v.asInstanceOf[js.Any]))
      RoutingProfileId.foreach(__v => __obj.updateDynamic("RoutingProfileId")(__v.asInstanceOf[js.Any]))
      SecurityProfileIds.foreach(__v => __obj.updateDynamic("SecurityProfileIds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[User]
    }
  }

  /**
    * Contains information about the identity of a user.
    */
  @js.native
  trait UserIdentityInfo extends js.Object {
    var Email: js.UndefOr[Email]
    var FirstName: js.UndefOr[AgentFirstName]
    var LastName: js.UndefOr[AgentLastName]
  }

  object UserIdentityInfo {
    @inline
    def apply(
        Email: js.UndefOr[Email] = js.undefined,
        FirstName: js.UndefOr[AgentFirstName] = js.undefined,
        LastName: js.UndefOr[AgentLastName] = js.undefined
    ): UserIdentityInfo = {
      val __obj = js.Dynamic.literal()
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      FirstName.foreach(__v => __obj.updateDynamic("FirstName")(__v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.updateDynamic("LastName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserIdentityInfo]
    }
  }

  /**
    * Contains information about the phone configuration settings for a user.
    */
  @js.native
  trait UserPhoneConfig extends js.Object {
    var PhoneType: PhoneType
    var AfterContactWorkTimeLimit: js.UndefOr[AfterContactWorkTimeLimit]
    var AutoAccept: js.UndefOr[AutoAccept]
    var DeskPhoneNumber: js.UndefOr[PhoneNumber]
  }

  object UserPhoneConfig {
    @inline
    def apply(
        PhoneType: PhoneType,
        AfterContactWorkTimeLimit: js.UndefOr[AfterContactWorkTimeLimit] = js.undefined,
        AutoAccept: js.UndefOr[AutoAccept] = js.undefined,
        DeskPhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): UserPhoneConfig = {
      val __obj = js.Dynamic.literal(
        "PhoneType" -> PhoneType.asInstanceOf[js.Any]
      )

      AfterContactWorkTimeLimit.foreach(__v =>
        __obj.updateDynamic("AfterContactWorkTimeLimit")(__v.asInstanceOf[js.Any])
      )
      AutoAccept.foreach(__v => __obj.updateDynamic("AutoAccept")(__v.asInstanceOf[js.Any]))
      DeskPhoneNumber.foreach(__v => __obj.updateDynamic("DeskPhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserPhoneConfig]
    }
  }

  /**
    * Contains summary information about a user.
    */
  @js.native
  trait UserSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[UserId]
    var Username: js.UndefOr[AgentUsername]
  }

  object UserSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[UserId] = js.undefined,
        Username: js.UndefOr[AgentUsername] = js.undefined
    ): UserSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserSummary]
    }
  }
}
