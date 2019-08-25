package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object kms {
  type AWSAccountIdType = String
  type AlgorithmSpec    = String
  type AliasList        = js.Array[AliasListEntry]
  type AliasNameType    = String
  type ArnType          = String
  type BooleanType      = Boolean
  type CiphertextType =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CloudHsmClusterIdType   = String
  type ConnectionErrorCodeType = String
  type ConnectionStateType     = String
  type CustomKeyStoreIdType    = String
  type CustomKeyStoreNameType  = String
  type CustomKeyStoresList     = js.Array[CustomKeyStoresListEntry]
  type DataKeySpec             = String
  type DateType                = js.Date
  type DescriptionType         = String
  type EncryptionContextKey    = String
  type EncryptionContextType   = js.Dictionary[EncryptionContextValue]
  type EncryptionContextValue  = String
  type ExpirationModelType     = String
  type GrantIdType             = String
  type GrantList               = js.Array[GrantListEntry]
  type GrantNameType           = String
  type GrantOperation          = String
  type GrantOperationList      = js.Array[GrantOperation]
  type GrantTokenList          = js.Array[GrantTokenType]
  type GrantTokenType          = String
  type KeyIdType               = String
  type KeyList                 = js.Array[KeyListEntry]
  type KeyManagerType          = String
  type KeyState                = String
  type KeyStorePasswordType    = String
  type KeyUsageType            = String
  type LimitType               = Int
  type MarkerType              = String
  type NumberOfBytesType       = Int
  type OriginType              = String
  type PendingWindowInDaysType = Int
  type PlaintextType =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type PolicyNameList             = js.Array[PolicyNameType]
  type PolicyNameType             = String
  type PolicyType                 = String
  type PrincipalIdType            = String
  type TagKeyList                 = js.Array[TagKeyType]
  type TagKeyType                 = String
  type TagList                    = js.Array[Tag]
  type TagValueType               = String
  type TrustAnchorCertificateType = String
  type WrappingKeySpec            = String

  implicit final class KMSOps(val service: KMS) extends AnyVal {

    def cancelKeyDeletionFuture(params: CancelKeyDeletionRequest): Future[CancelKeyDeletionResponse] =
      service.cancelKeyDeletion(params).promise.toFuture
    def connectCustomKeyStoreFuture(params: ConnectCustomKeyStoreRequest): Future[ConnectCustomKeyStoreResponse] =
      service.connectCustomKeyStore(params).promise.toFuture
    def createAliasFuture(params: CreateAliasRequest): Future[js.Object] = service.createAlias(params).promise.toFuture
    def createCustomKeyStoreFuture(params: CreateCustomKeyStoreRequest): Future[CreateCustomKeyStoreResponse] =
      service.createCustomKeyStore(params).promise.toFuture
    def createGrantFuture(params: CreateGrantRequest): Future[CreateGrantResponse] =
      service.createGrant(params).promise.toFuture
    def createKeyFuture(params: CreateKeyRequest): Future[CreateKeyResponse] =
      service.createKey(params).promise.toFuture
    def decryptFuture(params: DecryptRequest): Future[DecryptResponse]   = service.decrypt(params).promise.toFuture
    def deleteAliasFuture(params: DeleteAliasRequest): Future[js.Object] = service.deleteAlias(params).promise.toFuture
    def deleteCustomKeyStoreFuture(params: DeleteCustomKeyStoreRequest): Future[DeleteCustomKeyStoreResponse] =
      service.deleteCustomKeyStore(params).promise.toFuture
    def deleteImportedKeyMaterialFuture(params: DeleteImportedKeyMaterialRequest): Future[js.Object] =
      service.deleteImportedKeyMaterial(params).promise.toFuture
    def describeCustomKeyStoresFuture(params: DescribeCustomKeyStoresRequest): Future[DescribeCustomKeyStoresResponse] =
      service.describeCustomKeyStores(params).promise.toFuture
    def describeKeyFuture(params: DescribeKeyRequest): Future[DescribeKeyResponse] =
      service.describeKey(params).promise.toFuture
    def disableKeyFuture(params: DisableKeyRequest): Future[js.Object] = service.disableKey(params).promise.toFuture
    def disableKeyRotationFuture(params: DisableKeyRotationRequest): Future[js.Object] =
      service.disableKeyRotation(params).promise.toFuture
    def disconnectCustomKeyStoreFuture(
        params: DisconnectCustomKeyStoreRequest
    ): Future[DisconnectCustomKeyStoreResponse]                      = service.disconnectCustomKeyStore(params).promise.toFuture
    def enableKeyFuture(params: EnableKeyRequest): Future[js.Object] = service.enableKey(params).promise.toFuture
    def enableKeyRotationFuture(params: EnableKeyRotationRequest): Future[js.Object] =
      service.enableKeyRotation(params).promise.toFuture
    def encryptFuture(params: EncryptRequest): Future[EncryptResponse] = service.encrypt(params).promise.toFuture
    def generateDataKeyFuture(params: GenerateDataKeyRequest): Future[GenerateDataKeyResponse] =
      service.generateDataKey(params).promise.toFuture
    def generateDataKeyWithoutPlaintextFuture(
        params: GenerateDataKeyWithoutPlaintextRequest
    ): Future[GenerateDataKeyWithoutPlaintextResponse] =
      service.generateDataKeyWithoutPlaintext(params).promise.toFuture
    def generateRandomFuture(params: GenerateRandomRequest): Future[GenerateRandomResponse] =
      service.generateRandom(params).promise.toFuture
    def getKeyPolicyFuture(params: GetKeyPolicyRequest): Future[GetKeyPolicyResponse] =
      service.getKeyPolicy(params).promise.toFuture
    def getKeyRotationStatusFuture(params: GetKeyRotationStatusRequest): Future[GetKeyRotationStatusResponse] =
      service.getKeyRotationStatus(params).promise.toFuture
    def getParametersForImportFuture(params: GetParametersForImportRequest): Future[GetParametersForImportResponse] =
      service.getParametersForImport(params).promise.toFuture
    def importKeyMaterialFuture(params: ImportKeyMaterialRequest): Future[ImportKeyMaterialResponse] =
      service.importKeyMaterial(params).promise.toFuture
    def listAliasesFuture(params: ListAliasesRequest): Future[ListAliasesResponse] =
      service.listAliases(params).promise.toFuture
    def listGrantsFuture(params: ListGrantsRequest): Future[ListGrantsResponse] =
      service.listGrants(params).promise.toFuture
    def listKeyPoliciesFuture(params: ListKeyPoliciesRequest): Future[ListKeyPoliciesResponse] =
      service.listKeyPolicies(params).promise.toFuture
    def listKeysFuture(params: ListKeysRequest): Future[ListKeysResponse] = service.listKeys(params).promise.toFuture
    def listResourceTagsFuture(params: ListResourceTagsRequest): Future[ListResourceTagsResponse] =
      service.listResourceTags(params).promise.toFuture
    def listRetirableGrantsFuture(params: ListRetirableGrantsRequest): Future[ListGrantsResponse] =
      service.listRetirableGrants(params).promise.toFuture
    def putKeyPolicyFuture(params: PutKeyPolicyRequest): Future[js.Object] =
      service.putKeyPolicy(params).promise.toFuture
    def reEncryptFuture(params: ReEncryptRequest): Future[ReEncryptResponse] =
      service.reEncrypt(params).promise.toFuture
    def retireGrantFuture(params: RetireGrantRequest): Future[js.Object] = service.retireGrant(params).promise.toFuture
    def revokeGrantFuture(params: RevokeGrantRequest): Future[js.Object] = service.revokeGrant(params).promise.toFuture
    def scheduleKeyDeletionFuture(params: ScheduleKeyDeletionRequest): Future[ScheduleKeyDeletionResponse] =
      service.scheduleKeyDeletion(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise.toFuture
    def updateAliasFuture(params: UpdateAliasRequest): Future[js.Object] = service.updateAlias(params).promise.toFuture
    def updateCustomKeyStoreFuture(params: UpdateCustomKeyStoreRequest): Future[UpdateCustomKeyStoreResponse] =
      service.updateCustomKeyStore(params).promise.toFuture
    def updateKeyDescriptionFuture(params: UpdateKeyDescriptionRequest): Future[js.Object] =
      service.updateKeyDescription(params).promise.toFuture
  }
}

package kms {
  @js.native
  @JSImport("aws-sdk", "KMS")
  class KMS() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelKeyDeletion(params: CancelKeyDeletionRequest): Request[CancelKeyDeletionResponse]             = js.native
    def connectCustomKeyStore(params: ConnectCustomKeyStoreRequest): Request[ConnectCustomKeyStoreResponse] = js.native
    def createAlias(params: CreateAliasRequest): Request[js.Object]                                         = js.native
    def createCustomKeyStore(params: CreateCustomKeyStoreRequest): Request[CreateCustomKeyStoreResponse]    = js.native
    def createGrant(params: CreateGrantRequest): Request[CreateGrantResponse]                               = js.native
    def createKey(params: CreateKeyRequest): Request[CreateKeyResponse]                                     = js.native
    def decrypt(params: DecryptRequest): Request[DecryptResponse]                                           = js.native
    def deleteAlias(params: DeleteAliasRequest): Request[js.Object]                                         = js.native
    def deleteCustomKeyStore(params: DeleteCustomKeyStoreRequest): Request[DeleteCustomKeyStoreResponse]    = js.native
    def deleteImportedKeyMaterial(params: DeleteImportedKeyMaterialRequest): Request[js.Object]             = js.native
    def describeCustomKeyStores(params: DescribeCustomKeyStoresRequest): Request[DescribeCustomKeyStoresResponse] =
      js.native
    def describeKey(params: DescribeKeyRequest): Request[DescribeKeyResponse]     = js.native
    def disableKey(params: DisableKeyRequest): Request[js.Object]                 = js.native
    def disableKeyRotation(params: DisableKeyRotationRequest): Request[js.Object] = js.native
    def disconnectCustomKeyStore(params: DisconnectCustomKeyStoreRequest): Request[DisconnectCustomKeyStoreResponse] =
      js.native
    def enableKey(params: EnableKeyRequest): Request[js.Object]                           = js.native
    def enableKeyRotation(params: EnableKeyRotationRequest): Request[js.Object]           = js.native
    def encrypt(params: EncryptRequest): Request[EncryptResponse]                         = js.native
    def generateDataKey(params: GenerateDataKeyRequest): Request[GenerateDataKeyResponse] = js.native
    def generateDataKeyWithoutPlaintext(
        params: GenerateDataKeyWithoutPlaintextRequest
    ): Request[GenerateDataKeyWithoutPlaintextResponse]                                                  = js.native
    def generateRandom(params: GenerateRandomRequest): Request[GenerateRandomResponse]                   = js.native
    def getKeyPolicy(params: GetKeyPolicyRequest): Request[GetKeyPolicyResponse]                         = js.native
    def getKeyRotationStatus(params: GetKeyRotationStatusRequest): Request[GetKeyRotationStatusResponse] = js.native
    def getParametersForImport(params: GetParametersForImportRequest): Request[GetParametersForImportResponse] =
      js.native
    def importKeyMaterial(params: ImportKeyMaterialRequest): Request[ImportKeyMaterialResponse]          = js.native
    def listAliases(params: ListAliasesRequest): Request[ListAliasesResponse]                            = js.native
    def listGrants(params: ListGrantsRequest): Request[ListGrantsResponse]                               = js.native
    def listKeyPolicies(params: ListKeyPoliciesRequest): Request[ListKeyPoliciesResponse]                = js.native
    def listKeys(params: ListKeysRequest): Request[ListKeysResponse]                                     = js.native
    def listResourceTags(params: ListResourceTagsRequest): Request[ListResourceTagsResponse]             = js.native
    def listRetirableGrants(params: ListRetirableGrantsRequest): Request[ListGrantsResponse]             = js.native
    def putKeyPolicy(params: PutKeyPolicyRequest): Request[js.Object]                                    = js.native
    def reEncrypt(params: ReEncryptRequest): Request[ReEncryptResponse]                                  = js.native
    def retireGrant(params: RetireGrantRequest): Request[js.Object]                                      = js.native
    def revokeGrant(params: RevokeGrantRequest): Request[js.Object]                                      = js.native
    def scheduleKeyDeletion(params: ScheduleKeyDeletionRequest): Request[ScheduleKeyDeletionResponse]    = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                      = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                                  = js.native
    def updateAlias(params: UpdateAliasRequest): Request[js.Object]                                      = js.native
    def updateCustomKeyStore(params: UpdateCustomKeyStoreRequest): Request[UpdateCustomKeyStoreResponse] = js.native
    def updateKeyDescription(params: UpdateKeyDescriptionRequest): Request[js.Object]                    = js.native
  }

  object AlgorithmSpecEnum {
    val RSAES_PKCS1_V1_5   = "RSAES_PKCS1_V1_5"
    val RSAES_OAEP_SHA_1   = "RSAES_OAEP_SHA_1"
    val RSAES_OAEP_SHA_256 = "RSAES_OAEP_SHA_256"

    val values = IndexedSeq(RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1, RSAES_OAEP_SHA_256)
  }

  /**
    * Contains information about an alias.
    */
  @js.native
  trait AliasListEntry extends js.Object {
    var AliasArn: js.UndefOr[ArnType]
    var AliasName: js.UndefOr[AliasNameType]
    var TargetKeyId: js.UndefOr[KeyIdType]
  }

  object AliasListEntry {
    def apply(
        AliasArn: js.UndefOr[ArnType] = js.undefined,
        AliasName: js.UndefOr[AliasNameType] = js.undefined,
        TargetKeyId: js.UndefOr[KeyIdType] = js.undefined
    ): AliasListEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      AliasArn.foreach(__v => __obj.update("AliasArn", __v.asInstanceOf[js.Any]))
      AliasName.foreach(__v => __obj.update("AliasName", __v.asInstanceOf[js.Any]))
      TargetKeyId.foreach(__v => __obj.update("TargetKeyId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AliasListEntry]
    }
  }

  @js.native
  trait CancelKeyDeletionRequest extends js.Object {
    var KeyId: KeyIdType
  }

  object CancelKeyDeletionRequest {
    def apply(
        KeyId: KeyIdType
    ): CancelKeyDeletionRequest = {
      val __obj = js.Dictionary[js.Any](
        "KeyId" -> KeyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelKeyDeletionRequest]
    }
  }

  @js.native
  trait CancelKeyDeletionResponse extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
  }

  object CancelKeyDeletionResponse {
    def apply(
        KeyId: js.UndefOr[KeyIdType] = js.undefined
    ): CancelKeyDeletionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      KeyId.foreach(__v => __obj.update("KeyId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelKeyDeletionResponse]
    }
  }

  @js.native
  trait ConnectCustomKeyStoreRequest extends js.Object {
    var CustomKeyStoreId: CustomKeyStoreIdType
  }

  object ConnectCustomKeyStoreRequest {
    def apply(
        CustomKeyStoreId: CustomKeyStoreIdType
    ): ConnectCustomKeyStoreRequest = {
      val __obj = js.Dictionary[js.Any](
        "CustomKeyStoreId" -> CustomKeyStoreId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ConnectCustomKeyStoreRequest]
    }
  }

  @js.native
  trait ConnectCustomKeyStoreResponse extends js.Object {}

  object ConnectCustomKeyStoreResponse {
    def apply(
        ): ConnectCustomKeyStoreResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[ConnectCustomKeyStoreResponse]
    }
  }

  object ConnectionErrorCodeTypeEnum {
    val INVALID_CREDENTIALS        = "INVALID_CREDENTIALS"
    val CLUSTER_NOT_FOUND          = "CLUSTER_NOT_FOUND"
    val NETWORK_ERRORS             = "NETWORK_ERRORS"
    val INSUFFICIENT_CLOUDHSM_HSMS = "INSUFFICIENT_CLOUDHSM_HSMS"
    val USER_LOCKED_OUT            = "USER_LOCKED_OUT"

    val values =
      IndexedSeq(INVALID_CREDENTIALS, CLUSTER_NOT_FOUND, NETWORK_ERRORS, INSUFFICIENT_CLOUDHSM_HSMS, USER_LOCKED_OUT)
  }

  object ConnectionStateTypeEnum {
    val CONNECTED     = "CONNECTED"
    val CONNECTING    = "CONNECTING"
    val FAILED        = "FAILED"
    val DISCONNECTED  = "DISCONNECTED"
    val DISCONNECTING = "DISCONNECTING"

    val values = IndexedSeq(CONNECTED, CONNECTING, FAILED, DISCONNECTED, DISCONNECTING)
  }

  @js.native
  trait CreateAliasRequest extends js.Object {
    var AliasName: AliasNameType
    var TargetKeyId: KeyIdType
  }

  object CreateAliasRequest {
    def apply(
        AliasName: AliasNameType,
        TargetKeyId: KeyIdType
    ): CreateAliasRequest = {
      val __obj = js.Dictionary[js.Any](
        "AliasName"   -> AliasName.asInstanceOf[js.Any],
        "TargetKeyId" -> TargetKeyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateAliasRequest]
    }
  }

  @js.native
  trait CreateCustomKeyStoreRequest extends js.Object {
    var CloudHsmClusterId: CloudHsmClusterIdType
    var CustomKeyStoreName: CustomKeyStoreNameType
    var KeyStorePassword: KeyStorePasswordType
    var TrustAnchorCertificate: TrustAnchorCertificateType
  }

  object CreateCustomKeyStoreRequest {
    def apply(
        CloudHsmClusterId: CloudHsmClusterIdType,
        CustomKeyStoreName: CustomKeyStoreNameType,
        KeyStorePassword: KeyStorePasswordType,
        TrustAnchorCertificate: TrustAnchorCertificateType
    ): CreateCustomKeyStoreRequest = {
      val __obj = js.Dictionary[js.Any](
        "CloudHsmClusterId"      -> CloudHsmClusterId.asInstanceOf[js.Any],
        "CustomKeyStoreName"     -> CustomKeyStoreName.asInstanceOf[js.Any],
        "KeyStorePassword"       -> KeyStorePassword.asInstanceOf[js.Any],
        "TrustAnchorCertificate" -> TrustAnchorCertificate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateCustomKeyStoreRequest]
    }
  }

  @js.native
  trait CreateCustomKeyStoreResponse extends js.Object {
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
  }

  object CreateCustomKeyStoreResponse {
    def apply(
        CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined
    ): CreateCustomKeyStoreResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CustomKeyStoreId.foreach(__v => __obj.update("CustomKeyStoreId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCustomKeyStoreResponse]
    }
  }

  @js.native
  trait CreateGrantRequest extends js.Object {
    var GranteePrincipal: PrincipalIdType
    var KeyId: KeyIdType
    var Operations: GrantOperationList
    var Constraints: js.UndefOr[GrantConstraints]
    var GrantTokens: js.UndefOr[GrantTokenList]
    var Name: js.UndefOr[GrantNameType]
    var RetiringPrincipal: js.UndefOr[PrincipalIdType]
  }

  object CreateGrantRequest {
    def apply(
        GranteePrincipal: PrincipalIdType,
        KeyId: KeyIdType,
        Operations: GrantOperationList,
        Constraints: js.UndefOr[GrantConstraints] = js.undefined,
        GrantTokens: js.UndefOr[GrantTokenList] = js.undefined,
        Name: js.UndefOr[GrantNameType] = js.undefined,
        RetiringPrincipal: js.UndefOr[PrincipalIdType] = js.undefined
    ): CreateGrantRequest = {
      val __obj = js.Dictionary[js.Any](
        "GranteePrincipal" -> GranteePrincipal.asInstanceOf[js.Any],
        "KeyId"            -> KeyId.asInstanceOf[js.Any],
        "Operations"       -> Operations.asInstanceOf[js.Any]
      )

      Constraints.foreach(__v => __obj.update("Constraints", __v.asInstanceOf[js.Any]))
      GrantTokens.foreach(__v => __obj.update("GrantTokens", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      RetiringPrincipal.foreach(__v => __obj.update("RetiringPrincipal", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGrantRequest]
    }
  }

  @js.native
  trait CreateGrantResponse extends js.Object {
    var GrantId: js.UndefOr[GrantIdType]
    var GrantToken: js.UndefOr[GrantTokenType]
  }

  object CreateGrantResponse {
    def apply(
        GrantId: js.UndefOr[GrantIdType] = js.undefined,
        GrantToken: js.UndefOr[GrantTokenType] = js.undefined
    ): CreateGrantResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      GrantId.foreach(__v => __obj.update("GrantId", __v.asInstanceOf[js.Any]))
      GrantToken.foreach(__v => __obj.update("GrantToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGrantResponse]
    }
  }

  @js.native
  trait CreateKeyRequest extends js.Object {
    var BypassPolicyLockoutSafetyCheck: js.UndefOr[BooleanType]
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
    var Description: js.UndefOr[DescriptionType]
    var KeyUsage: js.UndefOr[KeyUsageType]
    var Origin: js.UndefOr[OriginType]
    var Policy: js.UndefOr[PolicyType]
    var Tags: js.UndefOr[TagList]
  }

  object CreateKeyRequest {
    def apply(
        BypassPolicyLockoutSafetyCheck: js.UndefOr[BooleanType] = js.undefined,
        CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined,
        Description: js.UndefOr[DescriptionType] = js.undefined,
        KeyUsage: js.UndefOr[KeyUsageType] = js.undefined,
        Origin: js.UndefOr[OriginType] = js.undefined,
        Policy: js.UndefOr[PolicyType] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateKeyRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      BypassPolicyLockoutSafetyCheck.foreach(
        __v => __obj.update("BypassPolicyLockoutSafetyCheck", __v.asInstanceOf[js.Any])
      )
      CustomKeyStoreId.foreach(__v => __obj.update("CustomKeyStoreId", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      KeyUsage.foreach(__v => __obj.update("KeyUsage", __v.asInstanceOf[js.Any]))
      Origin.foreach(__v => __obj.update("Origin", __v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.update("Policy", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateKeyRequest]
    }
  }

  @js.native
  trait CreateKeyResponse extends js.Object {
    var KeyMetadata: js.UndefOr[KeyMetadata]
  }

  object CreateKeyResponse {
    def apply(
        KeyMetadata: js.UndefOr[KeyMetadata] = js.undefined
    ): CreateKeyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      KeyMetadata.foreach(__v => __obj.update("KeyMetadata", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateKeyResponse]
    }
  }

  /**
    * Contains information about each custom key store in the custom key store list.
    */
  @js.native
  trait CustomKeyStoresListEntry extends js.Object {
    var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType]
    var ConnectionErrorCode: js.UndefOr[ConnectionErrorCodeType]
    var ConnectionState: js.UndefOr[ConnectionStateType]
    var CreationDate: js.UndefOr[DateType]
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
    var CustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType]
    var TrustAnchorCertificate: js.UndefOr[TrustAnchorCertificateType]
  }

  object CustomKeyStoresListEntry {
    def apply(
        CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.undefined,
        ConnectionErrorCode: js.UndefOr[ConnectionErrorCodeType] = js.undefined,
        ConnectionState: js.UndefOr[ConnectionStateType] = js.undefined,
        CreationDate: js.UndefOr[DateType] = js.undefined,
        CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined,
        CustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType] = js.undefined,
        TrustAnchorCertificate: js.UndefOr[TrustAnchorCertificateType] = js.undefined
    ): CustomKeyStoresListEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      CloudHsmClusterId.foreach(__v => __obj.update("CloudHsmClusterId", __v.asInstanceOf[js.Any]))
      ConnectionErrorCode.foreach(__v => __obj.update("ConnectionErrorCode", __v.asInstanceOf[js.Any]))
      ConnectionState.foreach(__v => __obj.update("ConnectionState", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      CustomKeyStoreId.foreach(__v => __obj.update("CustomKeyStoreId", __v.asInstanceOf[js.Any]))
      CustomKeyStoreName.foreach(__v => __obj.update("CustomKeyStoreName", __v.asInstanceOf[js.Any]))
      TrustAnchorCertificate.foreach(__v => __obj.update("TrustAnchorCertificate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomKeyStoresListEntry]
    }
  }

  object DataKeySpecEnum {
    val AES_256 = "AES_256"
    val AES_128 = "AES_128"

    val values = IndexedSeq(AES_256, AES_128)
  }

  @js.native
  trait DecryptRequest extends js.Object {
    var CiphertextBlob: CiphertextType
    var EncryptionContext: js.UndefOr[EncryptionContextType]
    var GrantTokens: js.UndefOr[GrantTokenList]
  }

  object DecryptRequest {
    def apply(
        CiphertextBlob: CiphertextType,
        EncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined,
        GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
    ): DecryptRequest = {
      val __obj = js.Dictionary[js.Any](
        "CiphertextBlob" -> CiphertextBlob.asInstanceOf[js.Any]
      )

      EncryptionContext.foreach(__v => __obj.update("EncryptionContext", __v.asInstanceOf[js.Any]))
      GrantTokens.foreach(__v => __obj.update("GrantTokens", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DecryptRequest]
    }
  }

  @js.native
  trait DecryptResponse extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var Plaintext: js.UndefOr[PlaintextType]
  }

  object DecryptResponse {
    def apply(
        KeyId: js.UndefOr[KeyIdType] = js.undefined,
        Plaintext: js.UndefOr[PlaintextType] = js.undefined
    ): DecryptResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      KeyId.foreach(__v => __obj.update("KeyId", __v.asInstanceOf[js.Any]))
      Plaintext.foreach(__v => __obj.update("Plaintext", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DecryptResponse]
    }
  }

  @js.native
  trait DeleteAliasRequest extends js.Object {
    var AliasName: AliasNameType
  }

  object DeleteAliasRequest {
    def apply(
        AliasName: AliasNameType
    ): DeleteAliasRequest = {
      val __obj = js.Dictionary[js.Any](
        "AliasName" -> AliasName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAliasRequest]
    }
  }

  @js.native
  trait DeleteCustomKeyStoreRequest extends js.Object {
    var CustomKeyStoreId: CustomKeyStoreIdType
  }

  object DeleteCustomKeyStoreRequest {
    def apply(
        CustomKeyStoreId: CustomKeyStoreIdType
    ): DeleteCustomKeyStoreRequest = {
      val __obj = js.Dictionary[js.Any](
        "CustomKeyStoreId" -> CustomKeyStoreId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteCustomKeyStoreRequest]
    }
  }

  @js.native
  trait DeleteCustomKeyStoreResponse extends js.Object {}

  object DeleteCustomKeyStoreResponse {
    def apply(
        ): DeleteCustomKeyStoreResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteCustomKeyStoreResponse]
    }
  }

  @js.native
  trait DeleteImportedKeyMaterialRequest extends js.Object {
    var KeyId: KeyIdType
  }

  object DeleteImportedKeyMaterialRequest {
    def apply(
        KeyId: KeyIdType
    ): DeleteImportedKeyMaterialRequest = {
      val __obj = js.Dictionary[js.Any](
        "KeyId" -> KeyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteImportedKeyMaterialRequest]
    }
  }

  @js.native
  trait DescribeCustomKeyStoresRequest extends js.Object {
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
    var CustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
  }

  object DescribeCustomKeyStoresRequest {
    def apply(
        CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined,
        CustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType] = js.undefined,
        Limit: js.UndefOr[LimitType] = js.undefined,
        Marker: js.UndefOr[MarkerType] = js.undefined
    ): DescribeCustomKeyStoresRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      CustomKeyStoreId.foreach(__v => __obj.update("CustomKeyStoreId", __v.asInstanceOf[js.Any]))
      CustomKeyStoreName.foreach(__v => __obj.update("CustomKeyStoreName", __v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCustomKeyStoresRequest]
    }
  }

  @js.native
  trait DescribeCustomKeyStoresResponse extends js.Object {
    var CustomKeyStores: js.UndefOr[CustomKeyStoresList]
    var NextMarker: js.UndefOr[MarkerType]
    var Truncated: js.UndefOr[BooleanType]
  }

  object DescribeCustomKeyStoresResponse {
    def apply(
        CustomKeyStores: js.UndefOr[CustomKeyStoresList] = js.undefined,
        NextMarker: js.UndefOr[MarkerType] = js.undefined,
        Truncated: js.UndefOr[BooleanType] = js.undefined
    ): DescribeCustomKeyStoresResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CustomKeyStores.foreach(__v => __obj.update("CustomKeyStores", __v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
      Truncated.foreach(__v => __obj.update("Truncated", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCustomKeyStoresResponse]
    }
  }

  @js.native
  trait DescribeKeyRequest extends js.Object {
    var KeyId: KeyIdType
    var GrantTokens: js.UndefOr[GrantTokenList]
  }

  object DescribeKeyRequest {
    def apply(
        KeyId: KeyIdType,
        GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
    ): DescribeKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "KeyId" -> KeyId.asInstanceOf[js.Any]
      )

      GrantTokens.foreach(__v => __obj.update("GrantTokens", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeKeyRequest]
    }
  }

  @js.native
  trait DescribeKeyResponse extends js.Object {
    var KeyMetadata: js.UndefOr[KeyMetadata]
  }

  object DescribeKeyResponse {
    def apply(
        KeyMetadata: js.UndefOr[KeyMetadata] = js.undefined
    ): DescribeKeyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      KeyMetadata.foreach(__v => __obj.update("KeyMetadata", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeKeyResponse]
    }
  }

  @js.native
  trait DisableKeyRequest extends js.Object {
    var KeyId: KeyIdType
  }

  object DisableKeyRequest {
    def apply(
        KeyId: KeyIdType
    ): DisableKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "KeyId" -> KeyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisableKeyRequest]
    }
  }

  @js.native
  trait DisableKeyRotationRequest extends js.Object {
    var KeyId: KeyIdType
  }

  object DisableKeyRotationRequest {
    def apply(
        KeyId: KeyIdType
    ): DisableKeyRotationRequest = {
      val __obj = js.Dictionary[js.Any](
        "KeyId" -> KeyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisableKeyRotationRequest]
    }
  }

  @js.native
  trait DisconnectCustomKeyStoreRequest extends js.Object {
    var CustomKeyStoreId: CustomKeyStoreIdType
  }

  object DisconnectCustomKeyStoreRequest {
    def apply(
        CustomKeyStoreId: CustomKeyStoreIdType
    ): DisconnectCustomKeyStoreRequest = {
      val __obj = js.Dictionary[js.Any](
        "CustomKeyStoreId" -> CustomKeyStoreId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisconnectCustomKeyStoreRequest]
    }
  }

  @js.native
  trait DisconnectCustomKeyStoreResponse extends js.Object {}

  object DisconnectCustomKeyStoreResponse {
    def apply(
        ): DisconnectCustomKeyStoreResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DisconnectCustomKeyStoreResponse]
    }
  }

  @js.native
  trait EnableKeyRequest extends js.Object {
    var KeyId: KeyIdType
  }

  object EnableKeyRequest {
    def apply(
        KeyId: KeyIdType
    ): EnableKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "KeyId" -> KeyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EnableKeyRequest]
    }
  }

  @js.native
  trait EnableKeyRotationRequest extends js.Object {
    var KeyId: KeyIdType
  }

  object EnableKeyRotationRequest {
    def apply(
        KeyId: KeyIdType
    ): EnableKeyRotationRequest = {
      val __obj = js.Dictionary[js.Any](
        "KeyId" -> KeyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EnableKeyRotationRequest]
    }
  }

  @js.native
  trait EncryptRequest extends js.Object {
    var KeyId: KeyIdType
    var Plaintext: PlaintextType
    var EncryptionContext: js.UndefOr[EncryptionContextType]
    var GrantTokens: js.UndefOr[GrantTokenList]
  }

  object EncryptRequest {
    def apply(
        KeyId: KeyIdType,
        Plaintext: PlaintextType,
        EncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined,
        GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
    ): EncryptRequest = {
      val __obj = js.Dictionary[js.Any](
        "KeyId"     -> KeyId.asInstanceOf[js.Any],
        "Plaintext" -> Plaintext.asInstanceOf[js.Any]
      )

      EncryptionContext.foreach(__v => __obj.update("EncryptionContext", __v.asInstanceOf[js.Any]))
      GrantTokens.foreach(__v => __obj.update("GrantTokens", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptRequest]
    }
  }

  @js.native
  trait EncryptResponse extends js.Object {
    var CiphertextBlob: js.UndefOr[CiphertextType]
    var KeyId: js.UndefOr[KeyIdType]
  }

  object EncryptResponse {
    def apply(
        CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined,
        KeyId: js.UndefOr[KeyIdType] = js.undefined
    ): EncryptResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CiphertextBlob.foreach(__v => __obj.update("CiphertextBlob", __v.asInstanceOf[js.Any]))
      KeyId.foreach(__v => __obj.update("KeyId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptResponse]
    }
  }

  object ExpirationModelTypeEnum {
    val KEY_MATERIAL_EXPIRES         = "KEY_MATERIAL_EXPIRES"
    val KEY_MATERIAL_DOES_NOT_EXPIRE = "KEY_MATERIAL_DOES_NOT_EXPIRE"

    val values = IndexedSeq(KEY_MATERIAL_EXPIRES, KEY_MATERIAL_DOES_NOT_EXPIRE)
  }

  @js.native
  trait GenerateDataKeyRequest extends js.Object {
    var KeyId: KeyIdType
    var EncryptionContext: js.UndefOr[EncryptionContextType]
    var GrantTokens: js.UndefOr[GrantTokenList]
    var KeySpec: js.UndefOr[DataKeySpec]
    var NumberOfBytes: js.UndefOr[NumberOfBytesType]
  }

  object GenerateDataKeyRequest {
    def apply(
        KeyId: KeyIdType,
        EncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined,
        GrantTokens: js.UndefOr[GrantTokenList] = js.undefined,
        KeySpec: js.UndefOr[DataKeySpec] = js.undefined,
        NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.undefined
    ): GenerateDataKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "KeyId" -> KeyId.asInstanceOf[js.Any]
      )

      EncryptionContext.foreach(__v => __obj.update("EncryptionContext", __v.asInstanceOf[js.Any]))
      GrantTokens.foreach(__v => __obj.update("GrantTokens", __v.asInstanceOf[js.Any]))
      KeySpec.foreach(__v => __obj.update("KeySpec", __v.asInstanceOf[js.Any]))
      NumberOfBytes.foreach(__v => __obj.update("NumberOfBytes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateDataKeyRequest]
    }
  }

  @js.native
  trait GenerateDataKeyResponse extends js.Object {
    var CiphertextBlob: js.UndefOr[CiphertextType]
    var KeyId: js.UndefOr[KeyIdType]
    var Plaintext: js.UndefOr[PlaintextType]
  }

  object GenerateDataKeyResponse {
    def apply(
        CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined,
        KeyId: js.UndefOr[KeyIdType] = js.undefined,
        Plaintext: js.UndefOr[PlaintextType] = js.undefined
    ): GenerateDataKeyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CiphertextBlob.foreach(__v => __obj.update("CiphertextBlob", __v.asInstanceOf[js.Any]))
      KeyId.foreach(__v => __obj.update("KeyId", __v.asInstanceOf[js.Any]))
      Plaintext.foreach(__v => __obj.update("Plaintext", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateDataKeyResponse]
    }
  }

  @js.native
  trait GenerateDataKeyWithoutPlaintextRequest extends js.Object {
    var KeyId: KeyIdType
    var EncryptionContext: js.UndefOr[EncryptionContextType]
    var GrantTokens: js.UndefOr[GrantTokenList]
    var KeySpec: js.UndefOr[DataKeySpec]
    var NumberOfBytes: js.UndefOr[NumberOfBytesType]
  }

  object GenerateDataKeyWithoutPlaintextRequest {
    def apply(
        KeyId: KeyIdType,
        EncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined,
        GrantTokens: js.UndefOr[GrantTokenList] = js.undefined,
        KeySpec: js.UndefOr[DataKeySpec] = js.undefined,
        NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.undefined
    ): GenerateDataKeyWithoutPlaintextRequest = {
      val __obj = js.Dictionary[js.Any](
        "KeyId" -> KeyId.asInstanceOf[js.Any]
      )

      EncryptionContext.foreach(__v => __obj.update("EncryptionContext", __v.asInstanceOf[js.Any]))
      GrantTokens.foreach(__v => __obj.update("GrantTokens", __v.asInstanceOf[js.Any]))
      KeySpec.foreach(__v => __obj.update("KeySpec", __v.asInstanceOf[js.Any]))
      NumberOfBytes.foreach(__v => __obj.update("NumberOfBytes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateDataKeyWithoutPlaintextRequest]
    }
  }

  @js.native
  trait GenerateDataKeyWithoutPlaintextResponse extends js.Object {
    var CiphertextBlob: js.UndefOr[CiphertextType]
    var KeyId: js.UndefOr[KeyIdType]
  }

  object GenerateDataKeyWithoutPlaintextResponse {
    def apply(
        CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined,
        KeyId: js.UndefOr[KeyIdType] = js.undefined
    ): GenerateDataKeyWithoutPlaintextResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CiphertextBlob.foreach(__v => __obj.update("CiphertextBlob", __v.asInstanceOf[js.Any]))
      KeyId.foreach(__v => __obj.update("KeyId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateDataKeyWithoutPlaintextResponse]
    }
  }

  @js.native
  trait GenerateRandomRequest extends js.Object {
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
    var NumberOfBytes: js.UndefOr[NumberOfBytesType]
  }

  object GenerateRandomRequest {
    def apply(
        CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined,
        NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.undefined
    ): GenerateRandomRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      CustomKeyStoreId.foreach(__v => __obj.update("CustomKeyStoreId", __v.asInstanceOf[js.Any]))
      NumberOfBytes.foreach(__v => __obj.update("NumberOfBytes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateRandomRequest]
    }
  }

  @js.native
  trait GenerateRandomResponse extends js.Object {
    var Plaintext: js.UndefOr[PlaintextType]
  }

  object GenerateRandomResponse {
    def apply(
        Plaintext: js.UndefOr[PlaintextType] = js.undefined
    ): GenerateRandomResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Plaintext.foreach(__v => __obj.update("Plaintext", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateRandomResponse]
    }
  }

  @js.native
  trait GetKeyPolicyRequest extends js.Object {
    var KeyId: KeyIdType
    var PolicyName: PolicyNameType
  }

  object GetKeyPolicyRequest {
    def apply(
        KeyId: KeyIdType,
        PolicyName: PolicyNameType
    ): GetKeyPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "KeyId"      -> KeyId.asInstanceOf[js.Any],
        "PolicyName" -> PolicyName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetKeyPolicyRequest]
    }
  }

  @js.native
  trait GetKeyPolicyResponse extends js.Object {
    var Policy: js.UndefOr[PolicyType]
  }

  object GetKeyPolicyResponse {
    def apply(
        Policy: js.UndefOr[PolicyType] = js.undefined
    ): GetKeyPolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Policy.foreach(__v => __obj.update("Policy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetKeyPolicyResponse]
    }
  }

  @js.native
  trait GetKeyRotationStatusRequest extends js.Object {
    var KeyId: KeyIdType
  }

  object GetKeyRotationStatusRequest {
    def apply(
        KeyId: KeyIdType
    ): GetKeyRotationStatusRequest = {
      val __obj = js.Dictionary[js.Any](
        "KeyId" -> KeyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetKeyRotationStatusRequest]
    }
  }

  @js.native
  trait GetKeyRotationStatusResponse extends js.Object {
    var KeyRotationEnabled: js.UndefOr[BooleanType]
  }

  object GetKeyRotationStatusResponse {
    def apply(
        KeyRotationEnabled: js.UndefOr[BooleanType] = js.undefined
    ): GetKeyRotationStatusResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      KeyRotationEnabled.foreach(__v => __obj.update("KeyRotationEnabled", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetKeyRotationStatusResponse]
    }
  }

  @js.native
  trait GetParametersForImportRequest extends js.Object {
    var KeyId: KeyIdType
    var WrappingAlgorithm: AlgorithmSpec
    var WrappingKeySpec: WrappingKeySpec
  }

  object GetParametersForImportRequest {
    def apply(
        KeyId: KeyIdType,
        WrappingAlgorithm: AlgorithmSpec,
        WrappingKeySpec: WrappingKeySpec
    ): GetParametersForImportRequest = {
      val __obj = js.Dictionary[js.Any](
        "KeyId"             -> KeyId.asInstanceOf[js.Any],
        "WrappingAlgorithm" -> WrappingAlgorithm.asInstanceOf[js.Any],
        "WrappingKeySpec"   -> WrappingKeySpec.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetParametersForImportRequest]
    }
  }

  @js.native
  trait GetParametersForImportResponse extends js.Object {
    var ImportToken: js.UndefOr[CiphertextType]
    var KeyId: js.UndefOr[KeyIdType]
    var ParametersValidTo: js.UndefOr[DateType]
    var PublicKey: js.UndefOr[PlaintextType]
  }

  object GetParametersForImportResponse {
    def apply(
        ImportToken: js.UndefOr[CiphertextType] = js.undefined,
        KeyId: js.UndefOr[KeyIdType] = js.undefined,
        ParametersValidTo: js.UndefOr[DateType] = js.undefined,
        PublicKey: js.UndefOr[PlaintextType] = js.undefined
    ): GetParametersForImportResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ImportToken.foreach(__v => __obj.update("ImportToken", __v.asInstanceOf[js.Any]))
      KeyId.foreach(__v => __obj.update("KeyId", __v.asInstanceOf[js.Any]))
      ParametersValidTo.foreach(__v => __obj.update("ParametersValidTo", __v.asInstanceOf[js.Any]))
      PublicKey.foreach(__v => __obj.update("PublicKey", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetParametersForImportResponse]
    }
  }

  /**
    * A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [[http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html|Encryption Context]] in the <i>AWS Key Management Service Developer Guide</i>.
    *  Grant constraints apply only to operations that accept encryption context as input. For example, the <code> <a>DescribeKey</a> </code> operation does not accept encryption context as input. A grant that allows the <code>DescribeKey</code> operation does so regardless of the grant constraints. In constrast, the <code> <a>Encrypt</a> </code> operation accepts encryption context as input. A grant that allows the <code>Encrypt</code> operation does so only when the encryption context of the <code>Encrypt</code> operation satisfies the grant constraints.
    */
  @js.native
  trait GrantConstraints extends js.Object {
    var EncryptionContextEquals: js.UndefOr[EncryptionContextType]
    var EncryptionContextSubset: js.UndefOr[EncryptionContextType]
  }

  object GrantConstraints {
    def apply(
        EncryptionContextEquals: js.UndefOr[EncryptionContextType] = js.undefined,
        EncryptionContextSubset: js.UndefOr[EncryptionContextType] = js.undefined
    ): GrantConstraints = {
      val __obj = js.Dictionary.empty[js.Any]
      EncryptionContextEquals.foreach(__v => __obj.update("EncryptionContextEquals", __v.asInstanceOf[js.Any]))
      EncryptionContextSubset.foreach(__v => __obj.update("EncryptionContextSubset", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrantConstraints]
    }
  }

  /**
    * Contains information about an entry in a list of grants.
    */
  @js.native
  trait GrantListEntry extends js.Object {
    var Constraints: js.UndefOr[GrantConstraints]
    var CreationDate: js.UndefOr[DateType]
    var GrantId: js.UndefOr[GrantIdType]
    var GranteePrincipal: js.UndefOr[PrincipalIdType]
    var IssuingAccount: js.UndefOr[PrincipalIdType]
    var KeyId: js.UndefOr[KeyIdType]
    var Name: js.UndefOr[GrantNameType]
    var Operations: js.UndefOr[GrantOperationList]
    var RetiringPrincipal: js.UndefOr[PrincipalIdType]
  }

  object GrantListEntry {
    def apply(
        Constraints: js.UndefOr[GrantConstraints] = js.undefined,
        CreationDate: js.UndefOr[DateType] = js.undefined,
        GrantId: js.UndefOr[GrantIdType] = js.undefined,
        GranteePrincipal: js.UndefOr[PrincipalIdType] = js.undefined,
        IssuingAccount: js.UndefOr[PrincipalIdType] = js.undefined,
        KeyId: js.UndefOr[KeyIdType] = js.undefined,
        Name: js.UndefOr[GrantNameType] = js.undefined,
        Operations: js.UndefOr[GrantOperationList] = js.undefined,
        RetiringPrincipal: js.UndefOr[PrincipalIdType] = js.undefined
    ): GrantListEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      Constraints.foreach(__v => __obj.update("Constraints", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      GrantId.foreach(__v => __obj.update("GrantId", __v.asInstanceOf[js.Any]))
      GranteePrincipal.foreach(__v => __obj.update("GranteePrincipal", __v.asInstanceOf[js.Any]))
      IssuingAccount.foreach(__v => __obj.update("IssuingAccount", __v.asInstanceOf[js.Any]))
      KeyId.foreach(__v => __obj.update("KeyId", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Operations.foreach(__v => __obj.update("Operations", __v.asInstanceOf[js.Any]))
      RetiringPrincipal.foreach(__v => __obj.update("RetiringPrincipal", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrantListEntry]
    }
  }

  object GrantOperationEnum {
    val Decrypt                         = "Decrypt"
    val Encrypt                         = "Encrypt"
    val GenerateDataKey                 = "GenerateDataKey"
    val GenerateDataKeyWithoutPlaintext = "GenerateDataKeyWithoutPlaintext"
    val ReEncryptFrom                   = "ReEncryptFrom"
    val ReEncryptTo                     = "ReEncryptTo"
    val CreateGrant                     = "CreateGrant"
    val RetireGrant                     = "RetireGrant"
    val DescribeKey                     = "DescribeKey"

    val values = IndexedSeq(
      Decrypt,
      Encrypt,
      GenerateDataKey,
      GenerateDataKeyWithoutPlaintext,
      ReEncryptFrom,
      ReEncryptTo,
      CreateGrant,
      RetireGrant,
      DescribeKey
    )
  }

  @js.native
  trait ImportKeyMaterialRequest extends js.Object {
    var EncryptedKeyMaterial: CiphertextType
    var ImportToken: CiphertextType
    var KeyId: KeyIdType
    var ExpirationModel: js.UndefOr[ExpirationModelType]
    var ValidTo: js.UndefOr[DateType]
  }

  object ImportKeyMaterialRequest {
    def apply(
        EncryptedKeyMaterial: CiphertextType,
        ImportToken: CiphertextType,
        KeyId: KeyIdType,
        ExpirationModel: js.UndefOr[ExpirationModelType] = js.undefined,
        ValidTo: js.UndefOr[DateType] = js.undefined
    ): ImportKeyMaterialRequest = {
      val __obj = js.Dictionary[js.Any](
        "EncryptedKeyMaterial" -> EncryptedKeyMaterial.asInstanceOf[js.Any],
        "ImportToken"          -> ImportToken.asInstanceOf[js.Any],
        "KeyId"                -> KeyId.asInstanceOf[js.Any]
      )

      ExpirationModel.foreach(__v => __obj.update("ExpirationModel", __v.asInstanceOf[js.Any]))
      ValidTo.foreach(__v => __obj.update("ValidTo", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportKeyMaterialRequest]
    }
  }

  @js.native
  trait ImportKeyMaterialResponse extends js.Object {}

  object ImportKeyMaterialResponse {
    def apply(
        ): ImportKeyMaterialResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[ImportKeyMaterialResponse]
    }
  }

  /**
    * Contains information about each entry in the key list.
    */
  @js.native
  trait KeyListEntry extends js.Object {
    var KeyArn: js.UndefOr[ArnType]
    var KeyId: js.UndefOr[KeyIdType]
  }

  object KeyListEntry {
    def apply(
        KeyArn: js.UndefOr[ArnType] = js.undefined,
        KeyId: js.UndefOr[KeyIdType] = js.undefined
    ): KeyListEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      KeyArn.foreach(__v => __obj.update("KeyArn", __v.asInstanceOf[js.Any]))
      KeyId.foreach(__v => __obj.update("KeyId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyListEntry]
    }
  }

  object KeyManagerTypeEnum {
    val AWS      = "AWS"
    val CUSTOMER = "CUSTOMER"

    val values = IndexedSeq(AWS, CUSTOMER)
  }

  /**
    * Contains metadata about a customer master key (CMK).
    *  This data type is used as a response element for the <a>CreateKey</a> and <a>DescribeKey</a> operations.
    */
  @js.native
  trait KeyMetadata extends js.Object {
    var KeyId: KeyIdType
    var AWSAccountId: js.UndefOr[AWSAccountIdType]
    var Arn: js.UndefOr[ArnType]
    var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType]
    var CreationDate: js.UndefOr[DateType]
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
    var DeletionDate: js.UndefOr[DateType]
    var Description: js.UndefOr[DescriptionType]
    var Enabled: js.UndefOr[BooleanType]
    var ExpirationModel: js.UndefOr[ExpirationModelType]
    var KeyManager: js.UndefOr[KeyManagerType]
    var KeyState: js.UndefOr[KeyState]
    var KeyUsage: js.UndefOr[KeyUsageType]
    var Origin: js.UndefOr[OriginType]
    var ValidTo: js.UndefOr[DateType]
  }

  object KeyMetadata {
    def apply(
        KeyId: KeyIdType,
        AWSAccountId: js.UndefOr[AWSAccountIdType] = js.undefined,
        Arn: js.UndefOr[ArnType] = js.undefined,
        CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.undefined,
        CreationDate: js.UndefOr[DateType] = js.undefined,
        CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined,
        DeletionDate: js.UndefOr[DateType] = js.undefined,
        Description: js.UndefOr[DescriptionType] = js.undefined,
        Enabled: js.UndefOr[BooleanType] = js.undefined,
        ExpirationModel: js.UndefOr[ExpirationModelType] = js.undefined,
        KeyManager: js.UndefOr[KeyManagerType] = js.undefined,
        KeyState: js.UndefOr[KeyState] = js.undefined,
        KeyUsage: js.UndefOr[KeyUsageType] = js.undefined,
        Origin: js.UndefOr[OriginType] = js.undefined,
        ValidTo: js.UndefOr[DateType] = js.undefined
    ): KeyMetadata = {
      val __obj = js.Dictionary[js.Any](
        "KeyId" -> KeyId.asInstanceOf[js.Any]
      )

      AWSAccountId.foreach(__v => __obj.update("AWSAccountId", __v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      CloudHsmClusterId.foreach(__v => __obj.update("CloudHsmClusterId", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      CustomKeyStoreId.foreach(__v => __obj.update("CustomKeyStoreId", __v.asInstanceOf[js.Any]))
      DeletionDate.foreach(__v => __obj.update("DeletionDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      ExpirationModel.foreach(__v => __obj.update("ExpirationModel", __v.asInstanceOf[js.Any]))
      KeyManager.foreach(__v => __obj.update("KeyManager", __v.asInstanceOf[js.Any]))
      KeyState.foreach(__v => __obj.update("KeyState", __v.asInstanceOf[js.Any]))
      KeyUsage.foreach(__v => __obj.update("KeyUsage", __v.asInstanceOf[js.Any]))
      Origin.foreach(__v => __obj.update("Origin", __v.asInstanceOf[js.Any]))
      ValidTo.foreach(__v => __obj.update("ValidTo", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyMetadata]
    }
  }

  object KeyStateEnum {
    val Enabled         = "Enabled"
    val Disabled        = "Disabled"
    val PendingDeletion = "PendingDeletion"
    val PendingImport   = "PendingImport"
    val Unavailable     = "Unavailable"

    val values = IndexedSeq(Enabled, Disabled, PendingDeletion, PendingImport, Unavailable)
  }

  object KeyUsageTypeEnum {
    val ENCRYPT_DECRYPT = "ENCRYPT_DECRYPT"

    val values = IndexedSeq(ENCRYPT_DECRYPT)
  }

  @js.native
  trait ListAliasesRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
  }

  object ListAliasesRequest {
    def apply(
        KeyId: js.UndefOr[KeyIdType] = js.undefined,
        Limit: js.UndefOr[LimitType] = js.undefined,
        Marker: js.UndefOr[MarkerType] = js.undefined
    ): ListAliasesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      KeyId.foreach(__v => __obj.update("KeyId", __v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAliasesRequest]
    }
  }

  @js.native
  trait ListAliasesResponse extends js.Object {
    var Aliases: js.UndefOr[AliasList]
    var NextMarker: js.UndefOr[MarkerType]
    var Truncated: js.UndefOr[BooleanType]
  }

  object ListAliasesResponse {
    def apply(
        Aliases: js.UndefOr[AliasList] = js.undefined,
        NextMarker: js.UndefOr[MarkerType] = js.undefined,
        Truncated: js.UndefOr[BooleanType] = js.undefined
    ): ListAliasesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Aliases.foreach(__v => __obj.update("Aliases", __v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
      Truncated.foreach(__v => __obj.update("Truncated", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAliasesResponse]
    }
  }

  @js.native
  trait ListGrantsRequest extends js.Object {
    var KeyId: KeyIdType
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
  }

  object ListGrantsRequest {
    def apply(
        KeyId: KeyIdType,
        Limit: js.UndefOr[LimitType] = js.undefined,
        Marker: js.UndefOr[MarkerType] = js.undefined
    ): ListGrantsRequest = {
      val __obj = js.Dictionary[js.Any](
        "KeyId" -> KeyId.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGrantsRequest]
    }
  }

  @js.native
  trait ListGrantsResponse extends js.Object {
    var Grants: js.UndefOr[GrantList]
    var NextMarker: js.UndefOr[MarkerType]
    var Truncated: js.UndefOr[BooleanType]
  }

  object ListGrantsResponse {
    def apply(
        Grants: js.UndefOr[GrantList] = js.undefined,
        NextMarker: js.UndefOr[MarkerType] = js.undefined,
        Truncated: js.UndefOr[BooleanType] = js.undefined
    ): ListGrantsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Grants.foreach(__v => __obj.update("Grants", __v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
      Truncated.foreach(__v => __obj.update("Truncated", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGrantsResponse]
    }
  }

  @js.native
  trait ListKeyPoliciesRequest extends js.Object {
    var KeyId: KeyIdType
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
  }

  object ListKeyPoliciesRequest {
    def apply(
        KeyId: KeyIdType,
        Limit: js.UndefOr[LimitType] = js.undefined,
        Marker: js.UndefOr[MarkerType] = js.undefined
    ): ListKeyPoliciesRequest = {
      val __obj = js.Dictionary[js.Any](
        "KeyId" -> KeyId.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListKeyPoliciesRequest]
    }
  }

  @js.native
  trait ListKeyPoliciesResponse extends js.Object {
    var NextMarker: js.UndefOr[MarkerType]
    var PolicyNames: js.UndefOr[PolicyNameList]
    var Truncated: js.UndefOr[BooleanType]
  }

  object ListKeyPoliciesResponse {
    def apply(
        NextMarker: js.UndefOr[MarkerType] = js.undefined,
        PolicyNames: js.UndefOr[PolicyNameList] = js.undefined,
        Truncated: js.UndefOr[BooleanType] = js.undefined
    ): ListKeyPoliciesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
      PolicyNames.foreach(__v => __obj.update("PolicyNames", __v.asInstanceOf[js.Any]))
      Truncated.foreach(__v => __obj.update("Truncated", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListKeyPoliciesResponse]
    }
  }

  @js.native
  trait ListKeysRequest extends js.Object {
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
  }

  object ListKeysRequest {
    def apply(
        Limit: js.UndefOr[LimitType] = js.undefined,
        Marker: js.UndefOr[MarkerType] = js.undefined
    ): ListKeysRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListKeysRequest]
    }
  }

  @js.native
  trait ListKeysResponse extends js.Object {
    var Keys: js.UndefOr[KeyList]
    var NextMarker: js.UndefOr[MarkerType]
    var Truncated: js.UndefOr[BooleanType]
  }

  object ListKeysResponse {
    def apply(
        Keys: js.UndefOr[KeyList] = js.undefined,
        NextMarker: js.UndefOr[MarkerType] = js.undefined,
        Truncated: js.UndefOr[BooleanType] = js.undefined
    ): ListKeysResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Keys.foreach(__v => __obj.update("Keys", __v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
      Truncated.foreach(__v => __obj.update("Truncated", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListKeysResponse]
    }
  }

  @js.native
  trait ListResourceTagsRequest extends js.Object {
    var KeyId: KeyIdType
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
  }

  object ListResourceTagsRequest {
    def apply(
        KeyId: KeyIdType,
        Limit: js.UndefOr[LimitType] = js.undefined,
        Marker: js.UndefOr[MarkerType] = js.undefined
    ): ListResourceTagsRequest = {
      val __obj = js.Dictionary[js.Any](
        "KeyId" -> KeyId.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceTagsRequest]
    }
  }

  @js.native
  trait ListResourceTagsResponse extends js.Object {
    var NextMarker: js.UndefOr[MarkerType]
    var Tags: js.UndefOr[TagList]
    var Truncated: js.UndefOr[BooleanType]
  }

  object ListResourceTagsResponse {
    def apply(
        NextMarker: js.UndefOr[MarkerType] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Truncated: js.UndefOr[BooleanType] = js.undefined
    ): ListResourceTagsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      Truncated.foreach(__v => __obj.update("Truncated", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceTagsResponse]
    }
  }

  @js.native
  trait ListRetirableGrantsRequest extends js.Object {
    var RetiringPrincipal: PrincipalIdType
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
  }

  object ListRetirableGrantsRequest {
    def apply(
        RetiringPrincipal: PrincipalIdType,
        Limit: js.UndefOr[LimitType] = js.undefined,
        Marker: js.UndefOr[MarkerType] = js.undefined
    ): ListRetirableGrantsRequest = {
      val __obj = js.Dictionary[js.Any](
        "RetiringPrincipal" -> RetiringPrincipal.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRetirableGrantsRequest]
    }
  }

  object OriginTypeEnum {
    val AWS_KMS      = "AWS_KMS"
    val EXTERNAL     = "EXTERNAL"
    val AWS_CLOUDHSM = "AWS_CLOUDHSM"

    val values = IndexedSeq(AWS_KMS, EXTERNAL, AWS_CLOUDHSM)
  }

  @js.native
  trait PutKeyPolicyRequest extends js.Object {
    var KeyId: KeyIdType
    var Policy: PolicyType
    var PolicyName: PolicyNameType
    var BypassPolicyLockoutSafetyCheck: js.UndefOr[BooleanType]
  }

  object PutKeyPolicyRequest {
    def apply(
        KeyId: KeyIdType,
        Policy: PolicyType,
        PolicyName: PolicyNameType,
        BypassPolicyLockoutSafetyCheck: js.UndefOr[BooleanType] = js.undefined
    ): PutKeyPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "KeyId"      -> KeyId.asInstanceOf[js.Any],
        "Policy"     -> Policy.asInstanceOf[js.Any],
        "PolicyName" -> PolicyName.asInstanceOf[js.Any]
      )

      BypassPolicyLockoutSafetyCheck.foreach(
        __v => __obj.update("BypassPolicyLockoutSafetyCheck", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[PutKeyPolicyRequest]
    }
  }

  @js.native
  trait ReEncryptRequest extends js.Object {
    var CiphertextBlob: CiphertextType
    var DestinationKeyId: KeyIdType
    var DestinationEncryptionContext: js.UndefOr[EncryptionContextType]
    var GrantTokens: js.UndefOr[GrantTokenList]
    var SourceEncryptionContext: js.UndefOr[EncryptionContextType]
  }

  object ReEncryptRequest {
    def apply(
        CiphertextBlob: CiphertextType,
        DestinationKeyId: KeyIdType,
        DestinationEncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined,
        GrantTokens: js.UndefOr[GrantTokenList] = js.undefined,
        SourceEncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined
    ): ReEncryptRequest = {
      val __obj = js.Dictionary[js.Any](
        "CiphertextBlob"   -> CiphertextBlob.asInstanceOf[js.Any],
        "DestinationKeyId" -> DestinationKeyId.asInstanceOf[js.Any]
      )

      DestinationEncryptionContext.foreach(
        __v => __obj.update("DestinationEncryptionContext", __v.asInstanceOf[js.Any])
      )
      GrantTokens.foreach(__v => __obj.update("GrantTokens", __v.asInstanceOf[js.Any]))
      SourceEncryptionContext.foreach(__v => __obj.update("SourceEncryptionContext", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReEncryptRequest]
    }
  }

  @js.native
  trait ReEncryptResponse extends js.Object {
    var CiphertextBlob: js.UndefOr[CiphertextType]
    var KeyId: js.UndefOr[KeyIdType]
    var SourceKeyId: js.UndefOr[KeyIdType]
  }

  object ReEncryptResponse {
    def apply(
        CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined,
        KeyId: js.UndefOr[KeyIdType] = js.undefined,
        SourceKeyId: js.UndefOr[KeyIdType] = js.undefined
    ): ReEncryptResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CiphertextBlob.foreach(__v => __obj.update("CiphertextBlob", __v.asInstanceOf[js.Any]))
      KeyId.foreach(__v => __obj.update("KeyId", __v.asInstanceOf[js.Any]))
      SourceKeyId.foreach(__v => __obj.update("SourceKeyId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReEncryptResponse]
    }
  }

  @js.native
  trait RetireGrantRequest extends js.Object {
    var GrantId: js.UndefOr[GrantIdType]
    var GrantToken: js.UndefOr[GrantTokenType]
    var KeyId: js.UndefOr[KeyIdType]
  }

  object RetireGrantRequest {
    def apply(
        GrantId: js.UndefOr[GrantIdType] = js.undefined,
        GrantToken: js.UndefOr[GrantTokenType] = js.undefined,
        KeyId: js.UndefOr[KeyIdType] = js.undefined
    ): RetireGrantRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      GrantId.foreach(__v => __obj.update("GrantId", __v.asInstanceOf[js.Any]))
      GrantToken.foreach(__v => __obj.update("GrantToken", __v.asInstanceOf[js.Any]))
      KeyId.foreach(__v => __obj.update("KeyId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetireGrantRequest]
    }
  }

  @js.native
  trait RevokeGrantRequest extends js.Object {
    var GrantId: GrantIdType
    var KeyId: KeyIdType
  }

  object RevokeGrantRequest {
    def apply(
        GrantId: GrantIdType,
        KeyId: KeyIdType
    ): RevokeGrantRequest = {
      val __obj = js.Dictionary[js.Any](
        "GrantId" -> GrantId.asInstanceOf[js.Any],
        "KeyId"   -> KeyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RevokeGrantRequest]
    }
  }

  @js.native
  trait ScheduleKeyDeletionRequest extends js.Object {
    var KeyId: KeyIdType
    var PendingWindowInDays: js.UndefOr[PendingWindowInDaysType]
  }

  object ScheduleKeyDeletionRequest {
    def apply(
        KeyId: KeyIdType,
        PendingWindowInDays: js.UndefOr[PendingWindowInDaysType] = js.undefined
    ): ScheduleKeyDeletionRequest = {
      val __obj = js.Dictionary[js.Any](
        "KeyId" -> KeyId.asInstanceOf[js.Any]
      )

      PendingWindowInDays.foreach(__v => __obj.update("PendingWindowInDays", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduleKeyDeletionRequest]
    }
  }

  @js.native
  trait ScheduleKeyDeletionResponse extends js.Object {
    var DeletionDate: js.UndefOr[DateType]
    var KeyId: js.UndefOr[KeyIdType]
  }

  object ScheduleKeyDeletionResponse {
    def apply(
        DeletionDate: js.UndefOr[DateType] = js.undefined,
        KeyId: js.UndefOr[KeyIdType] = js.undefined
    ): ScheduleKeyDeletionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DeletionDate.foreach(__v => __obj.update("DeletionDate", __v.asInstanceOf[js.Any]))
      KeyId.foreach(__v => __obj.update("KeyId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduleKeyDeletionResponse]
    }
  }

  /**
    * A key-value pair. A tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be empty (null) strings.
    *  For information about the rules that apply to tag keys and tag values, see [[http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html|User-Defined Tag Restrictions]] in the <i>AWS Billing and Cost Management User Guide</i>.
    */
  @js.native
  trait Tag extends js.Object {
    var TagKey: TagKeyType
    var TagValue: TagValueType
  }

  object Tag {
    def apply(
        TagKey: TagKeyType,
        TagValue: TagValueType
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
        "TagKey"   -> TagKey.asInstanceOf[js.Any],
        "TagValue" -> TagValue.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var KeyId: KeyIdType
    var Tags: TagList
  }

  object TagResourceRequest {
    def apply(
        KeyId: KeyIdType,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "KeyId" -> KeyId.asInstanceOf[js.Any],
        "Tags"  -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var KeyId: KeyIdType
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    def apply(
        KeyId: KeyIdType,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "KeyId"   -> KeyId.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateAliasRequest extends js.Object {
    var AliasName: AliasNameType
    var TargetKeyId: KeyIdType
  }

  object UpdateAliasRequest {
    def apply(
        AliasName: AliasNameType,
        TargetKeyId: KeyIdType
    ): UpdateAliasRequest = {
      val __obj = js.Dictionary[js.Any](
        "AliasName"   -> AliasName.asInstanceOf[js.Any],
        "TargetKeyId" -> TargetKeyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateAliasRequest]
    }
  }

  @js.native
  trait UpdateCustomKeyStoreRequest extends js.Object {
    var CustomKeyStoreId: CustomKeyStoreIdType
    var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType]
    var KeyStorePassword: js.UndefOr[KeyStorePasswordType]
    var NewCustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType]
  }

  object UpdateCustomKeyStoreRequest {
    def apply(
        CustomKeyStoreId: CustomKeyStoreIdType,
        CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.undefined,
        KeyStorePassword: js.UndefOr[KeyStorePasswordType] = js.undefined,
        NewCustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType] = js.undefined
    ): UpdateCustomKeyStoreRequest = {
      val __obj = js.Dictionary[js.Any](
        "CustomKeyStoreId" -> CustomKeyStoreId.asInstanceOf[js.Any]
      )

      CloudHsmClusterId.foreach(__v => __obj.update("CloudHsmClusterId", __v.asInstanceOf[js.Any]))
      KeyStorePassword.foreach(__v => __obj.update("KeyStorePassword", __v.asInstanceOf[js.Any]))
      NewCustomKeyStoreName.foreach(__v => __obj.update("NewCustomKeyStoreName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCustomKeyStoreRequest]
    }
  }

  @js.native
  trait UpdateCustomKeyStoreResponse extends js.Object {}

  object UpdateCustomKeyStoreResponse {
    def apply(
        ): UpdateCustomKeyStoreResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateCustomKeyStoreResponse]
    }
  }

  @js.native
  trait UpdateKeyDescriptionRequest extends js.Object {
    var Description: DescriptionType
    var KeyId: KeyIdType
  }

  object UpdateKeyDescriptionRequest {
    def apply(
        Description: DescriptionType,
        KeyId: KeyIdType
    ): UpdateKeyDescriptionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Description" -> Description.asInstanceOf[js.Any],
        "KeyId"       -> KeyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateKeyDescriptionRequest]
    }
  }

  object WrappingKeySpecEnum {
    val RSA_2048 = "RSA_2048"

    val values = IndexedSeq(RSA_2048)
  }
}
