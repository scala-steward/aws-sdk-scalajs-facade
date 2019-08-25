package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object transfer {
  type Arn                  = String
  type DateImported         = js.Date
  type EndpointType         = String
  type HomeDirectory        = String
  type IdentityProviderType = String
  type ListedServers        = js.Array[ListedServer]
  type ListedUsers          = js.Array[ListedUser]
  type MaxResults           = Int
  type Message              = String
  type NextToken            = String
  type NullableRole         = String
  type Policy               = String
  type Role                 = String
  type ServerId             = String
  type SshPublicKeyBody     = String
  type SshPublicKeyCount    = Int
  type SshPublicKeyId       = String
  type SshPublicKeys        = js.Array[SshPublicKey]
  type State                = String
  type StatusCode           = Int
  type TagKey               = String
  type TagKeys              = js.Array[TagKey]
  type TagValue             = String
  type Tags                 = js.Array[Tag]
  type Url                  = String
  type UserCount            = Int
  type UserName             = String
  type UserPassword         = String
  type VpcEndpointId        = String

  implicit final class TransferOps(val service: Transfer) extends AnyVal {

    def createServerFuture(params: CreateServerRequest): Future[CreateServerResponse] =
      service.createServer(params).promise.toFuture
    def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] =
      service.createUser(params).promise.toFuture
    def deleteServerFuture(params: DeleteServerRequest): Future[js.Object] =
      service.deleteServer(params).promise.toFuture
    def deleteSshPublicKeyFuture(params: DeleteSshPublicKeyRequest): Future[js.Object] =
      service.deleteSshPublicKey(params).promise.toFuture
    def deleteUserFuture(params: DeleteUserRequest): Future[js.Object] = service.deleteUser(params).promise.toFuture
    def describeServerFuture(params: DescribeServerRequest): Future[DescribeServerResponse] =
      service.describeServer(params).promise.toFuture
    def describeUserFuture(params: DescribeUserRequest): Future[DescribeUserResponse] =
      service.describeUser(params).promise.toFuture
    def importSshPublicKeyFuture(params: ImportSshPublicKeyRequest): Future[ImportSshPublicKeyResponse] =
      service.importSshPublicKey(params).promise.toFuture
    def listServersFuture(params: ListServersRequest): Future[ListServersResponse] =
      service.listServers(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] =
      service.listUsers(params).promise.toFuture
    def startServerFuture(params: StartServerRequest): Future[js.Object] = service.startServer(params).promise.toFuture
    def stopServerFuture(params: StopServerRequest): Future[js.Object]   = service.stopServer(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise.toFuture
    def testIdentityProviderFuture(params: TestIdentityProviderRequest): Future[TestIdentityProviderResponse] =
      service.testIdentityProvider(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise.toFuture
    def updateServerFuture(params: UpdateServerRequest): Future[UpdateServerResponse] =
      service.updateServer(params).promise.toFuture
    def updateUserFuture(params: UpdateUserRequest): Future[UpdateUserResponse] =
      service.updateUser(params).promise.toFuture
  }
}

package transfer {
  @js.native
  @JSImport("aws-sdk", "Transfer")
  class Transfer() extends js.Object {
    def this(config: AWSConfig) = this()

    def createServer(params: CreateServerRequest): Request[CreateServerResponse]                         = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse]                               = js.native
    def deleteServer(params: DeleteServerRequest): Request[js.Object]                                    = js.native
    def deleteSshPublicKey(params: DeleteSshPublicKeyRequest): Request[js.Object]                        = js.native
    def deleteUser(params: DeleteUserRequest): Request[js.Object]                                        = js.native
    def describeServer(params: DescribeServerRequest): Request[DescribeServerResponse]                   = js.native
    def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse]                         = js.native
    def importSshPublicKey(params: ImportSshPublicKeyRequest): Request[ImportSshPublicKeyResponse]       = js.native
    def listServers(params: ListServersRequest): Request[ListServersResponse]                            = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]    = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse]                                  = js.native
    def startServer(params: StartServerRequest): Request[js.Object]                                      = js.native
    def stopServer(params: StopServerRequest): Request[js.Object]                                        = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                      = js.native
    def testIdentityProvider(params: TestIdentityProviderRequest): Request[TestIdentityProviderResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                                  = js.native
    def updateServer(params: UpdateServerRequest): Request[UpdateServerResponse]                         = js.native
    def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse]                               = js.native
  }

  @js.native
  trait CreateServerRequest extends js.Object {
    var EndpointDetails: js.UndefOr[EndpointDetails]
    var EndpointType: js.UndefOr[EndpointType]
    var IdentityProviderDetails: js.UndefOr[IdentityProviderDetails]
    var IdentityProviderType: js.UndefOr[IdentityProviderType]
    var LoggingRole: js.UndefOr[Role]
    var Tags: js.UndefOr[Tags]
  }

  object CreateServerRequest {
    def apply(
        EndpointDetails: js.UndefOr[EndpointDetails] = js.undefined,
        EndpointType: js.UndefOr[EndpointType] = js.undefined,
        IdentityProviderDetails: js.UndefOr[IdentityProviderDetails] = js.undefined,
        IdentityProviderType: js.UndefOr[IdentityProviderType] = js.undefined,
        LoggingRole: js.UndefOr[Role] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateServerRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      EndpointDetails.foreach(__v => __obj.update("EndpointDetails", __v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.update("EndpointType", __v.asInstanceOf[js.Any]))
      IdentityProviderDetails.foreach(__v => __obj.update("IdentityProviderDetails", __v.asInstanceOf[js.Any]))
      IdentityProviderType.foreach(__v => __obj.update("IdentityProviderType", __v.asInstanceOf[js.Any]))
      LoggingRole.foreach(__v => __obj.update("LoggingRole", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServerRequest]
    }
  }

  @js.native
  trait CreateServerResponse extends js.Object {
    var ServerId: ServerId
  }

  object CreateServerResponse {
    def apply(
        ServerId: ServerId
    ): CreateServerResponse = {
      val __obj = js.Dictionary[js.Any](
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateServerResponse]
    }
  }

  @js.native
  trait CreateUserRequest extends js.Object {
    var Role: Role
    var ServerId: ServerId
    var UserName: UserName
    var HomeDirectory: js.UndefOr[HomeDirectory]
    var Policy: js.UndefOr[Policy]
    var SshPublicKeyBody: js.UndefOr[SshPublicKeyBody]
    var Tags: js.UndefOr[Tags]
  }

  object CreateUserRequest {
    def apply(
        Role: Role,
        ServerId: ServerId,
        UserName: UserName,
        HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined,
        Policy: js.UndefOr[Policy] = js.undefined,
        SshPublicKeyBody: js.UndefOr[SshPublicKeyBody] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateUserRequest = {
      val __obj = js.Dictionary[js.Any](
        "Role"     -> Role.asInstanceOf[js.Any],
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      HomeDirectory.foreach(__v => __obj.update("HomeDirectory", __v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.update("Policy", __v.asInstanceOf[js.Any]))
      SshPublicKeyBody.foreach(__v => __obj.update("SshPublicKeyBody", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResponse extends js.Object {
    var ServerId: ServerId
    var UserName: UserName
  }

  object CreateUserResponse {
    def apply(
        ServerId: ServerId,
        UserName: UserName
    ): CreateUserResponse = {
      val __obj = js.Dictionary[js.Any](
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateUserResponse]
    }
  }

  @js.native
  trait DeleteServerRequest extends js.Object {
    var ServerId: ServerId
  }

  object DeleteServerRequest {
    def apply(
        ServerId: ServerId
    ): DeleteServerRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteServerRequest]
    }
  }

  @js.native
  trait DeleteSshPublicKeyRequest extends js.Object {
    var ServerId: ServerId
    var SshPublicKeyId: SshPublicKeyId
    var UserName: UserName
  }

  object DeleteSshPublicKeyRequest {
    def apply(
        ServerId: ServerId,
        SshPublicKeyId: SshPublicKeyId,
        UserName: UserName
    ): DeleteSshPublicKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServerId"       -> ServerId.asInstanceOf[js.Any],
        "SshPublicKeyId" -> SshPublicKeyId.asInstanceOf[js.Any],
        "UserName"       -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSshPublicKeyRequest]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var ServerId: ServerId
    var UserName: UserName
  }

  object DeleteUserRequest {
    def apply(
        ServerId: ServerId,
        UserName: UserName
    ): DeleteUserRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DescribeServerRequest extends js.Object {
    var ServerId: ServerId
  }

  object DescribeServerRequest {
    def apply(
        ServerId: ServerId
    ): DescribeServerRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeServerRequest]
    }
  }

  @js.native
  trait DescribeServerResponse extends js.Object {
    var Server: DescribedServer
  }

  object DescribeServerResponse {
    def apply(
        Server: DescribedServer
    ): DescribeServerResponse = {
      val __obj = js.Dictionary[js.Any](
        "Server" -> Server.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeServerResponse]
    }
  }

  @js.native
  trait DescribeUserRequest extends js.Object {
    var ServerId: ServerId
    var UserName: UserName
  }

  object DescribeUserRequest {
    def apply(
        ServerId: ServerId,
        UserName: UserName
    ): DescribeUserRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeUserRequest]
    }
  }

  @js.native
  trait DescribeUserResponse extends js.Object {
    var ServerId: ServerId
    var User: DescribedUser
  }

  object DescribeUserResponse {
    def apply(
        ServerId: ServerId,
        User: DescribedUser
    ): DescribeUserResponse = {
      val __obj = js.Dictionary[js.Any](
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "User"     -> User.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeUserResponse]
    }
  }

  /**
    * Describe the properties of the server that was specified. Information returned includes: the server Amazon Resource Name (ARN), the authentication configuration and type, the logging role, server Id and state, and assigned tags or metadata.
    */
  @js.native
  trait DescribedServer extends js.Object {
    var Arn: Arn
    var EndpointDetails: js.UndefOr[EndpointDetails]
    var EndpointType: js.UndefOr[EndpointType]
    var IdentityProviderDetails: js.UndefOr[IdentityProviderDetails]
    var IdentityProviderType: js.UndefOr[IdentityProviderType]
    var LoggingRole: js.UndefOr[Role]
    var ServerId: js.UndefOr[ServerId]
    var State: js.UndefOr[State]
    var Tags: js.UndefOr[Tags]
    var UserCount: js.UndefOr[UserCount]
  }

  object DescribedServer {
    def apply(
        Arn: Arn,
        EndpointDetails: js.UndefOr[EndpointDetails] = js.undefined,
        EndpointType: js.UndefOr[EndpointType] = js.undefined,
        IdentityProviderDetails: js.UndefOr[IdentityProviderDetails] = js.undefined,
        IdentityProviderType: js.UndefOr[IdentityProviderType] = js.undefined,
        LoggingRole: js.UndefOr[Role] = js.undefined,
        ServerId: js.UndefOr[ServerId] = js.undefined,
        State: js.UndefOr[State] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        UserCount: js.UndefOr[UserCount] = js.undefined
    ): DescribedServer = {
      val __obj = js.Dictionary[js.Any](
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      EndpointDetails.foreach(__v => __obj.update("EndpointDetails", __v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.update("EndpointType", __v.asInstanceOf[js.Any]))
      IdentityProviderDetails.foreach(__v => __obj.update("IdentityProviderDetails", __v.asInstanceOf[js.Any]))
      IdentityProviderType.foreach(__v => __obj.update("IdentityProviderType", __v.asInstanceOf[js.Any]))
      LoggingRole.foreach(__v => __obj.update("LoggingRole", __v.asInstanceOf[js.Any]))
      ServerId.foreach(__v => __obj.update("ServerId", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      UserCount.foreach(__v => __obj.update("UserCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribedServer]
    }
  }

  /**
    * Returns properties of the user that you wish to describe.
    */
  @js.native
  trait DescribedUser extends js.Object {
    var Arn: Arn
    var HomeDirectory: js.UndefOr[HomeDirectory]
    var Policy: js.UndefOr[Policy]
    var Role: js.UndefOr[Role]
    var SshPublicKeys: js.UndefOr[SshPublicKeys]
    var Tags: js.UndefOr[Tags]
    var UserName: js.UndefOr[UserName]
  }

  object DescribedUser {
    def apply(
        Arn: Arn,
        HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined,
        Policy: js.UndefOr[Policy] = js.undefined,
        Role: js.UndefOr[Role] = js.undefined,
        SshPublicKeys: js.UndefOr[SshPublicKeys] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        UserName: js.UndefOr[UserName] = js.undefined
    ): DescribedUser = {
      val __obj = js.Dictionary[js.Any](
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      HomeDirectory.foreach(__v => __obj.update("HomeDirectory", __v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.update("Policy", __v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.update("Role", __v.asInstanceOf[js.Any]))
      SshPublicKeys.foreach(__v => __obj.update("SshPublicKeys", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribedUser]
    }
  }

  @js.native
  trait EndpointDetails extends js.Object {
    var VpcEndpointId: js.UndefOr[VpcEndpointId]
  }

  object EndpointDetails {
    def apply(
        VpcEndpointId: js.UndefOr[VpcEndpointId] = js.undefined
    ): EndpointDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      VpcEndpointId.foreach(__v => __obj.update("VpcEndpointId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointDetails]
    }
  }

  object EndpointTypeEnum {
    val PUBLIC       = "PUBLIC"
    val VPC_ENDPOINT = "VPC_ENDPOINT"

    val values = IndexedSeq(PUBLIC, VPC_ENDPOINT)
  }

  /**
    * Returns information related to the type of user authentication that is in use for a server's users. A server can only have one method of authentication.
    */
  @js.native
  trait IdentityProviderDetails extends js.Object {
    var InvocationRole: js.UndefOr[Role]
    var Url: js.UndefOr[Url]
  }

  object IdentityProviderDetails {
    def apply(
        InvocationRole: js.UndefOr[Role] = js.undefined,
        Url: js.UndefOr[Url] = js.undefined
    ): IdentityProviderDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      InvocationRole.foreach(__v => __obj.update("InvocationRole", __v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.update("Url", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdentityProviderDetails]
    }
  }

  /**
    * Returns information related to the type of user authentication that is in use for a server's users. For <code>SERVICE_MANAGED</code> authentication, the Secure Shell (SSH) public keys are stored with a user on an SFTP server instance. For <code>API_GATEWAY</code> authentication, your custom authentication method is implemented by using an API call. A server can only have one method of authentication.
    */
  object IdentityProviderTypeEnum {
    val SERVICE_MANAGED = "SERVICE_MANAGED"
    val API_GATEWAY     = "API_GATEWAY"

    val values = IndexedSeq(SERVICE_MANAGED, API_GATEWAY)
  }

  @js.native
  trait ImportSshPublicKeyRequest extends js.Object {
    var ServerId: ServerId
    var SshPublicKeyBody: SshPublicKeyBody
    var UserName: UserName
  }

  object ImportSshPublicKeyRequest {
    def apply(
        ServerId: ServerId,
        SshPublicKeyBody: SshPublicKeyBody,
        UserName: UserName
    ): ImportSshPublicKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServerId"         -> ServerId.asInstanceOf[js.Any],
        "SshPublicKeyBody" -> SshPublicKeyBody.asInstanceOf[js.Any],
        "UserName"         -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ImportSshPublicKeyRequest]
    }
  }

  /**
    * This response identifies the user, server they belong to, and the identifier of the SSH public key associated with that user. A user can have more than one key on each server that they are associate with.
    */
  @js.native
  trait ImportSshPublicKeyResponse extends js.Object {
    var ServerId: ServerId
    var SshPublicKeyId: SshPublicKeyId
    var UserName: UserName
  }

  object ImportSshPublicKeyResponse {
    def apply(
        ServerId: ServerId,
        SshPublicKeyId: SshPublicKeyId,
        UserName: UserName
    ): ImportSshPublicKeyResponse = {
      val __obj = js.Dictionary[js.Any](
        "ServerId"       -> ServerId.asInstanceOf[js.Any],
        "SshPublicKeyId" -> SshPublicKeyId.asInstanceOf[js.Any],
        "UserName"       -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ImportSshPublicKeyResponse]
    }
  }

  @js.native
  trait ListServersRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListServersRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListServersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServersRequest]
    }
  }

  @js.native
  trait ListServersResponse extends js.Object {
    var Servers: ListedServers
    var NextToken: js.UndefOr[NextToken]
  }

  object ListServersResponse {
    def apply(
        Servers: ListedServers,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListServersResponse = {
      val __obj = js.Dictionary[js.Any](
        "Servers" -> Servers.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServersResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var Arn: Arn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    def apply(
        Arn: Arn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var ServerId: ServerId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListUsersRequest {
    def apply(
        ServerId: ServerId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListUsersRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersRequest]
    }
  }

  @js.native
  trait ListUsersResponse extends js.Object {
    var ServerId: ServerId
    var Users: ListedUsers
    var NextToken: js.UndefOr[NextToken]
  }

  object ListUsersResponse {
    def apply(
        ServerId: ServerId,
        Users: ListedUsers,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListUsersResponse = {
      val __obj = js.Dictionary[js.Any](
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "Users"    -> Users.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersResponse]
    }
  }

  /**
    * Returns properties of the server that was specified.
    */
  @js.native
  trait ListedServer extends js.Object {
    var Arn: Arn
    var EndpointType: js.UndefOr[EndpointType]
    var IdentityProviderType: js.UndefOr[IdentityProviderType]
    var LoggingRole: js.UndefOr[Role]
    var ServerId: js.UndefOr[ServerId]
    var State: js.UndefOr[State]
    var UserCount: js.UndefOr[UserCount]
  }

  object ListedServer {
    def apply(
        Arn: Arn,
        EndpointType: js.UndefOr[EndpointType] = js.undefined,
        IdentityProviderType: js.UndefOr[IdentityProviderType] = js.undefined,
        LoggingRole: js.UndefOr[Role] = js.undefined,
        ServerId: js.UndefOr[ServerId] = js.undefined,
        State: js.UndefOr[State] = js.undefined,
        UserCount: js.UndefOr[UserCount] = js.undefined
    ): ListedServer = {
      val __obj = js.Dictionary[js.Any](
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      EndpointType.foreach(__v => __obj.update("EndpointType", __v.asInstanceOf[js.Any]))
      IdentityProviderType.foreach(__v => __obj.update("IdentityProviderType", __v.asInstanceOf[js.Any]))
      LoggingRole.foreach(__v => __obj.update("LoggingRole", __v.asInstanceOf[js.Any]))
      ServerId.foreach(__v => __obj.update("ServerId", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      UserCount.foreach(__v => __obj.update("UserCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListedServer]
    }
  }

  /**
    * Returns properties of the user that you specify.
    */
  @js.native
  trait ListedUser extends js.Object {
    var Arn: Arn
    var HomeDirectory: js.UndefOr[HomeDirectory]
    var Role: js.UndefOr[Role]
    var SshPublicKeyCount: js.UndefOr[SshPublicKeyCount]
    var UserName: js.UndefOr[UserName]
  }

  object ListedUser {
    def apply(
        Arn: Arn,
        HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined,
        Role: js.UndefOr[Role] = js.undefined,
        SshPublicKeyCount: js.UndefOr[SshPublicKeyCount] = js.undefined,
        UserName: js.UndefOr[UserName] = js.undefined
    ): ListedUser = {
      val __obj = js.Dictionary[js.Any](
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      HomeDirectory.foreach(__v => __obj.update("HomeDirectory", __v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.update("Role", __v.asInstanceOf[js.Any]))
      SshPublicKeyCount.foreach(__v => __obj.update("SshPublicKeyCount", __v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListedUser]
    }
  }

  /**
    * Provides information about the public Secure Shell (SSH) key that is associated with a user account for a specific server (as identified by <code>ServerId</code>). The information returned includes the date the key was imported, the public key contents, and the public key ID. A user can store more than one SSH public key associated with their user name on a specific SFTP server.
    */
  @js.native
  trait SshPublicKey extends js.Object {
    var DateImported: DateImported
    var SshPublicKeyBody: SshPublicKeyBody
    var SshPublicKeyId: SshPublicKeyId
  }

  object SshPublicKey {
    def apply(
        DateImported: DateImported,
        SshPublicKeyBody: SshPublicKeyBody,
        SshPublicKeyId: SshPublicKeyId
    ): SshPublicKey = {
      val __obj = js.Dictionary[js.Any](
        "DateImported"     -> DateImported.asInstanceOf[js.Any],
        "SshPublicKeyBody" -> SshPublicKeyBody.asInstanceOf[js.Any],
        "SshPublicKeyId"   -> SshPublicKeyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SshPublicKey]
    }
  }

  @js.native
  trait StartServerRequest extends js.Object {
    var ServerId: ServerId
  }

  object StartServerRequest {
    def apply(
        ServerId: ServerId
    ): StartServerRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartServerRequest]
    }
  }

  /**
    * Describes the condition of the SFTP server with respect to its ability to perform file operations. There are six possible states: <code>OFFLINE</code>, <code>ONLINE</code>, <code>STARTING</code>, <code>STOPPING</code>, <code>START_FAILED</code>, and <code>STOP_FAILED</code>.
    *  <code>OFFLINE</code> indicates that the SFTP server exists, but that it is not available for file operations. <code>ONLINE</code> indicates that the SFTP server is available to perform file operations. <code>STARTING</code> indicates that the SFTP server's was instantiated, but the server is not yet available to perform file operations. Under normal conditions, it can take a couple of minutes for an SFTP server to be completely operational. Both <code>START_FAILED</code> and <code>STOP_FAILED</code> are error conditions.
    */
  object StateEnum {
    val OFFLINE      = "OFFLINE"
    val ONLINE       = "ONLINE"
    val STARTING     = "STARTING"
    val STOPPING     = "STOPPING"
    val START_FAILED = "START_FAILED"
    val STOP_FAILED  = "STOP_FAILED"

    val values = IndexedSeq(OFFLINE, ONLINE, STARTING, STOPPING, START_FAILED, STOP_FAILED)
  }

  @js.native
  trait StopServerRequest extends js.Object {
    var ServerId: ServerId
  }

  object StopServerRequest {
    def apply(
        ServerId: ServerId
    ): StopServerRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopServerRequest]
    }
  }

  /**
    * Creates a key-value pair for a specific resource. Tags are metadata that you can use to search for and group a resource for various purposes. You can apply tags to servers, users, and roles. A tag key can take more than one value. For example, to group servers for accounting purposes, you might create a tag called <code>Group</code> and assign the values <code>Research</code> and <code>Accounting</code> to that group.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var Arn: Arn
    var Tags: Tags
  }

  object TagResourceRequest {
    def apply(
        Arn: Arn,
        Tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Arn"  -> Arn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TestIdentityProviderRequest extends js.Object {
    var ServerId: ServerId
    var UserName: UserName
    var UserPassword: js.UndefOr[UserPassword]
  }

  object TestIdentityProviderRequest {
    def apply(
        ServerId: ServerId,
        UserName: UserName,
        UserPassword: js.UndefOr[UserPassword] = js.undefined
    ): TestIdentityProviderRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      UserPassword.foreach(__v => __obj.update("UserPassword", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestIdentityProviderRequest]
    }
  }

  @js.native
  trait TestIdentityProviderResponse extends js.Object {
    var StatusCode: StatusCode
    var Url: Url
    var Message: js.UndefOr[Message]
  }

  object TestIdentityProviderResponse {
    def apply(
        StatusCode: StatusCode,
        Url: Url,
        Message: js.UndefOr[Message] = js.undefined
    ): TestIdentityProviderResponse = {
      val __obj = js.Dictionary[js.Any](
        "StatusCode" -> StatusCode.asInstanceOf[js.Any],
        "Url"        -> Url.asInstanceOf[js.Any]
      )

      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestIdentityProviderResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var Arn: Arn
    var TagKeys: TagKeys
  }

  object UntagResourceRequest {
    def apply(
        Arn: Arn,
        TagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Arn"     -> Arn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateServerRequest extends js.Object {
    var ServerId: ServerId
    var EndpointDetails: js.UndefOr[EndpointDetails]
    var EndpointType: js.UndefOr[EndpointType]
    var IdentityProviderDetails: js.UndefOr[IdentityProviderDetails]
    var LoggingRole: js.UndefOr[NullableRole]
  }

  object UpdateServerRequest {
    def apply(
        ServerId: ServerId,
        EndpointDetails: js.UndefOr[EndpointDetails] = js.undefined,
        EndpointType: js.UndefOr[EndpointType] = js.undefined,
        IdentityProviderDetails: js.UndefOr[IdentityProviderDetails] = js.undefined,
        LoggingRole: js.UndefOr[NullableRole] = js.undefined
    ): UpdateServerRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )

      EndpointDetails.foreach(__v => __obj.update("EndpointDetails", __v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.update("EndpointType", __v.asInstanceOf[js.Any]))
      IdentityProviderDetails.foreach(__v => __obj.update("IdentityProviderDetails", __v.asInstanceOf[js.Any]))
      LoggingRole.foreach(__v => __obj.update("LoggingRole", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServerRequest]
    }
  }

  @js.native
  trait UpdateServerResponse extends js.Object {
    var ServerId: ServerId
  }

  object UpdateServerResponse {
    def apply(
        ServerId: ServerId
    ): UpdateServerResponse = {
      val __obj = js.Dictionary[js.Any](
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateServerResponse]
    }
  }

  @js.native
  trait UpdateUserRequest extends js.Object {
    var ServerId: ServerId
    var UserName: UserName
    var HomeDirectory: js.UndefOr[HomeDirectory]
    var Policy: js.UndefOr[Policy]
    var Role: js.UndefOr[Role]
  }

  object UpdateUserRequest {
    def apply(
        ServerId: ServerId,
        UserName: UserName,
        HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined,
        Policy: js.UndefOr[Policy] = js.undefined,
        Role: js.UndefOr[Role] = js.undefined
    ): UpdateUserRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      HomeDirectory.foreach(__v => __obj.update("HomeDirectory", __v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.update("Policy", __v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.update("Role", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserRequest]
    }
  }

  /**
    * <code>UpdateUserResponse</code> returns the user name and server identifier for the request to update a user's properties.
    */
  @js.native
  trait UpdateUserResponse extends js.Object {
    var ServerId: ServerId
    var UserName: UserName
  }

  object UpdateUserResponse {
    def apply(
        ServerId: ServerId,
        UserName: UserName
    ): UpdateUserResponse = {
      val __obj = js.Dictionary[js.Any](
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateUserResponse]
    }
  }
}
