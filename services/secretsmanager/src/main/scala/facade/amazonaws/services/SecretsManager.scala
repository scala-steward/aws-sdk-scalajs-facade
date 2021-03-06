package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object secretsmanager {
  type AddReplicaRegionListType = js.Array[ReplicaRegionType]
  type AutomaticallyRotateAfterDaysType = Double
  type BooleanType = Boolean
  type ClientRequestTokenType = String
  type CreatedDateType = js.Date
  type DeletedDateType = js.Date
  type DeletionDateType = js.Date
  type DescriptionType = String
  type ErrorMessage = String
  type ExcludeCharactersType = String
  type ExcludeLowercaseType = Boolean
  type ExcludeNumbersType = Boolean
  type ExcludePunctuationType = Boolean
  type ExcludeUppercaseType = Boolean
  type FilterValueStringType = String
  type FilterValuesStringList = js.Array[FilterValueStringType]
  type FiltersListType = js.Array[Filter]
  type IncludeSpaceType = Boolean
  type KmsKeyIdType = String
  type LastAccessedDateType = js.Date
  type LastChangedDateType = js.Date
  type LastRotatedDateType = js.Date
  type MaxResultsType = Int
  type NameType = String
  type NextTokenType = String
  type NonEmptyResourcePolicyType = String
  type OwningServiceType = String
  type PasswordLengthType = Double
  type RandomPasswordType = String
  type RecoveryWindowInDaysType = Double
  type RegionType = String
  type RemoveReplicaRegionListType = js.Array[RegionType]
  type ReplicationStatusListType = js.Array[ReplicationStatusType]
  type RequireEachIncludedTypeType = Boolean
  type RotationEnabledType = Boolean
  type RotationLambdaARNType = String
  type SecretARNType = String
  type SecretBinaryType = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type SecretIdType = String
  type SecretListType = js.Array[SecretListEntry]
  type SecretNameType = String
  type SecretStringType = String
  type SecretVersionIdType = String
  type SecretVersionStageType = String
  type SecretVersionStagesType = js.Array[SecretVersionStageType]
  type SecretVersionsListType = js.Array[SecretVersionsListEntry]
  type SecretVersionsToStagesMapType = js.Dictionary[SecretVersionStagesType]
  type StatusMessageType = String
  type TagKeyListType = js.Array[TagKeyType]
  type TagKeyType = String
  type TagListType = js.Array[Tag]
  type TagValueType = String
  type TimestampType = js.Date
  type ValidationErrorsType = js.Array[ValidationErrorsEntry]

  implicit final class SecretsManagerOps(private val service: SecretsManager) extends AnyVal {

    @inline def cancelRotateSecretFuture(params: CancelRotateSecretRequest): Future[CancelRotateSecretResponse] = service.cancelRotateSecret(params).promise().toFuture
    @inline def createSecretFuture(params: CreateSecretRequest): Future[CreateSecretResponse] = service.createSecret(params).promise().toFuture
    @inline def deleteResourcePolicyFuture(params: DeleteResourcePolicyRequest): Future[DeleteResourcePolicyResponse] = service.deleteResourcePolicy(params).promise().toFuture
    @inline def deleteSecretFuture(params: DeleteSecretRequest): Future[DeleteSecretResponse] = service.deleteSecret(params).promise().toFuture
    @inline def describeSecretFuture(params: DescribeSecretRequest): Future[DescribeSecretResponse] = service.describeSecret(params).promise().toFuture
    @inline def getRandomPasswordFuture(params: GetRandomPasswordRequest): Future[GetRandomPasswordResponse] = service.getRandomPassword(params).promise().toFuture
    @inline def getResourcePolicyFuture(params: GetResourcePolicyRequest): Future[GetResourcePolicyResponse] = service.getResourcePolicy(params).promise().toFuture
    @inline def getSecretValueFuture(params: GetSecretValueRequest): Future[GetSecretValueResponse] = service.getSecretValue(params).promise().toFuture
    @inline def listSecretVersionIdsFuture(params: ListSecretVersionIdsRequest): Future[ListSecretVersionIdsResponse] = service.listSecretVersionIds(params).promise().toFuture
    @inline def listSecretsFuture(params: ListSecretsRequest): Future[ListSecretsResponse] = service.listSecrets(params).promise().toFuture
    @inline def putResourcePolicyFuture(params: PutResourcePolicyRequest): Future[PutResourcePolicyResponse] = service.putResourcePolicy(params).promise().toFuture
    @inline def putSecretValueFuture(params: PutSecretValueRequest): Future[PutSecretValueResponse] = service.putSecretValue(params).promise().toFuture
    @inline def removeRegionsFromReplicationFuture(params: RemoveRegionsFromReplicationRequest): Future[RemoveRegionsFromReplicationResponse] = service.removeRegionsFromReplication(params).promise().toFuture
    @inline def replicateSecretToRegionsFuture(params: ReplicateSecretToRegionsRequest): Future[ReplicateSecretToRegionsResponse] = service.replicateSecretToRegions(params).promise().toFuture
    @inline def restoreSecretFuture(params: RestoreSecretRequest): Future[RestoreSecretResponse] = service.restoreSecret(params).promise().toFuture
    @inline def rotateSecretFuture(params: RotateSecretRequest): Future[RotateSecretResponse] = service.rotateSecret(params).promise().toFuture
    @inline def stopReplicationToReplicaFuture(params: StopReplicationToReplicaRequest): Future[StopReplicationToReplicaResponse] = service.stopReplicationToReplica(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateSecretFuture(params: UpdateSecretRequest): Future[UpdateSecretResponse] = service.updateSecret(params).promise().toFuture
    @inline def updateSecretVersionStageFuture(params: UpdateSecretVersionStageRequest): Future[UpdateSecretVersionStageResponse] = service.updateSecretVersionStage(params).promise().toFuture
    @inline def validateResourcePolicyFuture(params: ValidateResourcePolicyRequest): Future[ValidateResourcePolicyResponse] = service.validateResourcePolicy(params).promise().toFuture

  }
}

package secretsmanager {
  @js.native
  @JSImport("aws-sdk/clients/secretsmanager", JSImport.Namespace, "AWS.SecretsManager")
  class SecretsManager() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelRotateSecret(params: CancelRotateSecretRequest): Request[CancelRotateSecretResponse] = js.native
    def createSecret(params: CreateSecretRequest): Request[CreateSecretResponse] = js.native
    def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[DeleteResourcePolicyResponse] = js.native
    def deleteSecret(params: DeleteSecretRequest): Request[DeleteSecretResponse] = js.native
    def describeSecret(params: DescribeSecretRequest): Request[DescribeSecretResponse] = js.native
    def getRandomPassword(params: GetRandomPasswordRequest): Request[GetRandomPasswordResponse] = js.native
    def getResourcePolicy(params: GetResourcePolicyRequest): Request[GetResourcePolicyResponse] = js.native
    def getSecretValue(params: GetSecretValueRequest): Request[GetSecretValueResponse] = js.native
    def listSecretVersionIds(params: ListSecretVersionIdsRequest): Request[ListSecretVersionIdsResponse] = js.native
    def listSecrets(params: ListSecretsRequest): Request[ListSecretsResponse] = js.native
    def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse] = js.native
    def putSecretValue(params: PutSecretValueRequest): Request[PutSecretValueResponse] = js.native
    def removeRegionsFromReplication(params: RemoveRegionsFromReplicationRequest): Request[RemoveRegionsFromReplicationResponse] = js.native
    def replicateSecretToRegions(params: ReplicateSecretToRegionsRequest): Request[ReplicateSecretToRegionsResponse] = js.native
    def restoreSecret(params: RestoreSecretRequest): Request[RestoreSecretResponse] = js.native
    def rotateSecret(params: RotateSecretRequest): Request[RotateSecretResponse] = js.native
    def stopReplicationToReplica(params: StopReplicationToReplicaRequest): Request[StopReplicationToReplicaResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateSecret(params: UpdateSecretRequest): Request[UpdateSecretResponse] = js.native
    def updateSecretVersionStage(params: UpdateSecretVersionStageRequest): Request[UpdateSecretVersionStageResponse] = js.native
    def validateResourcePolicy(params: ValidateResourcePolicyRequest): Request[ValidateResourcePolicyResponse] = js.native
  }

  @js.native
  trait CancelRotateSecretRequest extends js.Object {
    var SecretId: SecretIdType
  }

  object CancelRotateSecretRequest {
    @inline
    def apply(
        SecretId: SecretIdType
    ): CancelRotateSecretRequest = {
      val __obj = js.Dynamic.literal(
        "SecretId" -> SecretId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelRotateSecretRequest]
    }
  }

  @js.native
  trait CancelRotateSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var VersionId: js.UndefOr[SecretVersionIdType]
  }

  object CancelRotateSecretResponse {
    @inline
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        Name: js.UndefOr[SecretNameType] = js.undefined,
        VersionId: js.UndefOr[SecretVersionIdType] = js.undefined
    ): CancelRotateSecretResponse = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelRotateSecretResponse]
    }
  }

  @js.native
  trait CreateSecretRequest extends js.Object {
    var Name: NameType
    var AddReplicaRegions: js.UndefOr[AddReplicaRegionListType]
    var ClientRequestToken: js.UndefOr[ClientRequestTokenType]
    var Description: js.UndefOr[DescriptionType]
    var ForceOverwriteReplicaSecret: js.UndefOr[BooleanType]
    var KmsKeyId: js.UndefOr[KmsKeyIdType]
    var SecretBinary: js.UndefOr[SecretBinaryType]
    var SecretString: js.UndefOr[SecretStringType]
    var Tags: js.UndefOr[TagListType]
  }

  object CreateSecretRequest {
    @inline
    def apply(
        Name: NameType,
        AddReplicaRegions: js.UndefOr[AddReplicaRegionListType] = js.undefined,
        ClientRequestToken: js.UndefOr[ClientRequestTokenType] = js.undefined,
        Description: js.UndefOr[DescriptionType] = js.undefined,
        ForceOverwriteReplicaSecret: js.UndefOr[BooleanType] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyIdType] = js.undefined,
        SecretBinary: js.UndefOr[SecretBinaryType] = js.undefined,
        SecretString: js.UndefOr[SecretStringType] = js.undefined,
        Tags: js.UndefOr[TagListType] = js.undefined
    ): CreateSecretRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AddReplicaRegions.foreach(__v => __obj.updateDynamic("AddReplicaRegions")(__v.asInstanceOf[js.Any]))
      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ForceOverwriteReplicaSecret.foreach(__v => __obj.updateDynamic("ForceOverwriteReplicaSecret")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      SecretBinary.foreach(__v => __obj.updateDynamic("SecretBinary")(__v.asInstanceOf[js.Any]))
      SecretString.foreach(__v => __obj.updateDynamic("SecretString")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSecretRequest]
    }
  }

  @js.native
  trait CreateSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var ReplicationStatus: js.UndefOr[ReplicationStatusListType]
    var VersionId: js.UndefOr[SecretVersionIdType]
  }

  object CreateSecretResponse {
    @inline
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        Name: js.UndefOr[SecretNameType] = js.undefined,
        ReplicationStatus: js.UndefOr[ReplicationStatusListType] = js.undefined,
        VersionId: js.UndefOr[SecretVersionIdType] = js.undefined
    ): CreateSecretResponse = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ReplicationStatus.foreach(__v => __obj.updateDynamic("ReplicationStatus")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSecretResponse]
    }
  }

  @js.native
  trait DeleteResourcePolicyRequest extends js.Object {
    var SecretId: SecretIdType
  }

  object DeleteResourcePolicyRequest {
    @inline
    def apply(
        SecretId: SecretIdType
    ): DeleteResourcePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "SecretId" -> SecretId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteResourcePolicyRequest]
    }
  }

  @js.native
  trait DeleteResourcePolicyResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[NameType]
  }

  object DeleteResourcePolicyResponse {
    @inline
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        Name: js.UndefOr[NameType] = js.undefined
    ): DeleteResourcePolicyResponse = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteResourcePolicyResponse]
    }
  }

  @js.native
  trait DeleteSecretRequest extends js.Object {
    var SecretId: SecretIdType
    var ForceDeleteWithoutRecovery: js.UndefOr[BooleanType]
    var RecoveryWindowInDays: js.UndefOr[RecoveryWindowInDaysType]
  }

  object DeleteSecretRequest {
    @inline
    def apply(
        SecretId: SecretIdType,
        ForceDeleteWithoutRecovery: js.UndefOr[BooleanType] = js.undefined,
        RecoveryWindowInDays: js.UndefOr[RecoveryWindowInDaysType] = js.undefined
    ): DeleteSecretRequest = {
      val __obj = js.Dynamic.literal(
        "SecretId" -> SecretId.asInstanceOf[js.Any]
      )

      ForceDeleteWithoutRecovery.foreach(__v => __obj.updateDynamic("ForceDeleteWithoutRecovery")(__v.asInstanceOf[js.Any]))
      RecoveryWindowInDays.foreach(__v => __obj.updateDynamic("RecoveryWindowInDays")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSecretRequest]
    }
  }

  @js.native
  trait DeleteSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var DeletionDate: js.UndefOr[DeletionDateType]
    var Name: js.UndefOr[SecretNameType]
  }

  object DeleteSecretResponse {
    @inline
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        DeletionDate: js.UndefOr[DeletionDateType] = js.undefined,
        Name: js.UndefOr[SecretNameType] = js.undefined
    ): DeleteSecretResponse = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      DeletionDate.foreach(__v => __obj.updateDynamic("DeletionDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSecretResponse]
    }
  }

  @js.native
  trait DescribeSecretRequest extends js.Object {
    var SecretId: SecretIdType
  }

  object DescribeSecretRequest {
    @inline
    def apply(
        SecretId: SecretIdType
    ): DescribeSecretRequest = {
      val __obj = js.Dynamic.literal(
        "SecretId" -> SecretId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeSecretRequest]
    }
  }

  @js.native
  trait DescribeSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var CreatedDate: js.UndefOr[TimestampType]
    var DeletedDate: js.UndefOr[DeletedDateType]
    var Description: js.UndefOr[DescriptionType]
    var KmsKeyId: js.UndefOr[KmsKeyIdType]
    var LastAccessedDate: js.UndefOr[LastAccessedDateType]
    var LastChangedDate: js.UndefOr[LastChangedDateType]
    var LastRotatedDate: js.UndefOr[LastRotatedDateType]
    var Name: js.UndefOr[SecretNameType]
    var OwningService: js.UndefOr[OwningServiceType]
    var PrimaryRegion: js.UndefOr[RegionType]
    var ReplicationStatus: js.UndefOr[ReplicationStatusListType]
    var RotationEnabled: js.UndefOr[RotationEnabledType]
    var RotationLambdaARN: js.UndefOr[RotationLambdaARNType]
    var RotationRules: js.UndefOr[RotationRulesType]
    var Tags: js.UndefOr[TagListType]
    var VersionIdsToStages: js.UndefOr[SecretVersionsToStagesMapType]
  }

  object DescribeSecretResponse {
    @inline
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        CreatedDate: js.UndefOr[TimestampType] = js.undefined,
        DeletedDate: js.UndefOr[DeletedDateType] = js.undefined,
        Description: js.UndefOr[DescriptionType] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyIdType] = js.undefined,
        LastAccessedDate: js.UndefOr[LastAccessedDateType] = js.undefined,
        LastChangedDate: js.UndefOr[LastChangedDateType] = js.undefined,
        LastRotatedDate: js.UndefOr[LastRotatedDateType] = js.undefined,
        Name: js.UndefOr[SecretNameType] = js.undefined,
        OwningService: js.UndefOr[OwningServiceType] = js.undefined,
        PrimaryRegion: js.UndefOr[RegionType] = js.undefined,
        ReplicationStatus: js.UndefOr[ReplicationStatusListType] = js.undefined,
        RotationEnabled: js.UndefOr[RotationEnabledType] = js.undefined,
        RotationLambdaARN: js.UndefOr[RotationLambdaARNType] = js.undefined,
        RotationRules: js.UndefOr[RotationRulesType] = js.undefined,
        Tags: js.UndefOr[TagListType] = js.undefined,
        VersionIdsToStages: js.UndefOr[SecretVersionsToStagesMapType] = js.undefined
    ): DescribeSecretResponse = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      DeletedDate.foreach(__v => __obj.updateDynamic("DeletedDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LastAccessedDate.foreach(__v => __obj.updateDynamic("LastAccessedDate")(__v.asInstanceOf[js.Any]))
      LastChangedDate.foreach(__v => __obj.updateDynamic("LastChangedDate")(__v.asInstanceOf[js.Any]))
      LastRotatedDate.foreach(__v => __obj.updateDynamic("LastRotatedDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwningService.foreach(__v => __obj.updateDynamic("OwningService")(__v.asInstanceOf[js.Any]))
      PrimaryRegion.foreach(__v => __obj.updateDynamic("PrimaryRegion")(__v.asInstanceOf[js.Any]))
      ReplicationStatus.foreach(__v => __obj.updateDynamic("ReplicationStatus")(__v.asInstanceOf[js.Any]))
      RotationEnabled.foreach(__v => __obj.updateDynamic("RotationEnabled")(__v.asInstanceOf[js.Any]))
      RotationLambdaARN.foreach(__v => __obj.updateDynamic("RotationLambdaARN")(__v.asInstanceOf[js.Any]))
      RotationRules.foreach(__v => __obj.updateDynamic("RotationRules")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VersionIdsToStages.foreach(__v => __obj.updateDynamic("VersionIdsToStages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSecretResponse]
    }
  }

  /** Allows you to add filters when you use the search function in Secrets Manager.
    */
  @js.native
  trait Filter extends js.Object {
    var Key: js.UndefOr[FilterNameStringType]
    var Values: js.UndefOr[FilterValuesStringList]
  }

  object Filter {
    @inline
    def apply(
        Key: js.UndefOr[FilterNameStringType] = js.undefined,
        Values: js.UndefOr[FilterValuesStringList] = js.undefined
    ): Filter = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
    }
  }

  @js.native
  sealed trait FilterNameStringType extends js.Any
  object FilterNameStringType {
    val description = "description".asInstanceOf[FilterNameStringType]
    val name = "name".asInstanceOf[FilterNameStringType]
    val `tag-key` = "tag-key".asInstanceOf[FilterNameStringType]
    val `tag-value` = "tag-value".asInstanceOf[FilterNameStringType]
    val `primary-region` = "primary-region".asInstanceOf[FilterNameStringType]
    val all = "all".asInstanceOf[FilterNameStringType]

    @inline def values = js.Array(description, name, `tag-key`, `tag-value`, `primary-region`, all)
  }

  @js.native
  trait GetRandomPasswordRequest extends js.Object {
    var ExcludeCharacters: js.UndefOr[ExcludeCharactersType]
    var ExcludeLowercase: js.UndefOr[ExcludeLowercaseType]
    var ExcludeNumbers: js.UndefOr[ExcludeNumbersType]
    var ExcludePunctuation: js.UndefOr[ExcludePunctuationType]
    var ExcludeUppercase: js.UndefOr[ExcludeUppercaseType]
    var IncludeSpace: js.UndefOr[IncludeSpaceType]
    var PasswordLength: js.UndefOr[PasswordLengthType]
    var RequireEachIncludedType: js.UndefOr[RequireEachIncludedTypeType]
  }

  object GetRandomPasswordRequest {
    @inline
    def apply(
        ExcludeCharacters: js.UndefOr[ExcludeCharactersType] = js.undefined,
        ExcludeLowercase: js.UndefOr[ExcludeLowercaseType] = js.undefined,
        ExcludeNumbers: js.UndefOr[ExcludeNumbersType] = js.undefined,
        ExcludePunctuation: js.UndefOr[ExcludePunctuationType] = js.undefined,
        ExcludeUppercase: js.UndefOr[ExcludeUppercaseType] = js.undefined,
        IncludeSpace: js.UndefOr[IncludeSpaceType] = js.undefined,
        PasswordLength: js.UndefOr[PasswordLengthType] = js.undefined,
        RequireEachIncludedType: js.UndefOr[RequireEachIncludedTypeType] = js.undefined
    ): GetRandomPasswordRequest = {
      val __obj = js.Dynamic.literal()
      ExcludeCharacters.foreach(__v => __obj.updateDynamic("ExcludeCharacters")(__v.asInstanceOf[js.Any]))
      ExcludeLowercase.foreach(__v => __obj.updateDynamic("ExcludeLowercase")(__v.asInstanceOf[js.Any]))
      ExcludeNumbers.foreach(__v => __obj.updateDynamic("ExcludeNumbers")(__v.asInstanceOf[js.Any]))
      ExcludePunctuation.foreach(__v => __obj.updateDynamic("ExcludePunctuation")(__v.asInstanceOf[js.Any]))
      ExcludeUppercase.foreach(__v => __obj.updateDynamic("ExcludeUppercase")(__v.asInstanceOf[js.Any]))
      IncludeSpace.foreach(__v => __obj.updateDynamic("IncludeSpace")(__v.asInstanceOf[js.Any]))
      PasswordLength.foreach(__v => __obj.updateDynamic("PasswordLength")(__v.asInstanceOf[js.Any]))
      RequireEachIncludedType.foreach(__v => __obj.updateDynamic("RequireEachIncludedType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRandomPasswordRequest]
    }
  }

  @js.native
  trait GetRandomPasswordResponse extends js.Object {
    var RandomPassword: js.UndefOr[RandomPasswordType]
  }

  object GetRandomPasswordResponse {
    @inline
    def apply(
        RandomPassword: js.UndefOr[RandomPasswordType] = js.undefined
    ): GetRandomPasswordResponse = {
      val __obj = js.Dynamic.literal()
      RandomPassword.foreach(__v => __obj.updateDynamic("RandomPassword")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRandomPasswordResponse]
    }
  }

  @js.native
  trait GetResourcePolicyRequest extends js.Object {
    var SecretId: SecretIdType
  }

  object GetResourcePolicyRequest {
    @inline
    def apply(
        SecretId: SecretIdType
    ): GetResourcePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "SecretId" -> SecretId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetResourcePolicyRequest]
    }
  }

  @js.native
  trait GetResourcePolicyResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[NameType]
    var ResourcePolicy: js.UndefOr[NonEmptyResourcePolicyType]
  }

  object GetResourcePolicyResponse {
    @inline
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        Name: js.UndefOr[NameType] = js.undefined,
        ResourcePolicy: js.UndefOr[NonEmptyResourcePolicyType] = js.undefined
    ): GetResourcePolicyResponse = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ResourcePolicy.foreach(__v => __obj.updateDynamic("ResourcePolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcePolicyResponse]
    }
  }

  @js.native
  trait GetSecretValueRequest extends js.Object {
    var SecretId: SecretIdType
    var VersionId: js.UndefOr[SecretVersionIdType]
    var VersionStage: js.UndefOr[SecretVersionStageType]
  }

  object GetSecretValueRequest {
    @inline
    def apply(
        SecretId: SecretIdType,
        VersionId: js.UndefOr[SecretVersionIdType] = js.undefined,
        VersionStage: js.UndefOr[SecretVersionStageType] = js.undefined
    ): GetSecretValueRequest = {
      val __obj = js.Dynamic.literal(
        "SecretId" -> SecretId.asInstanceOf[js.Any]
      )

      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      VersionStage.foreach(__v => __obj.updateDynamic("VersionStage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSecretValueRequest]
    }
  }

  @js.native
  trait GetSecretValueResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var CreatedDate: js.UndefOr[CreatedDateType]
    var Name: js.UndefOr[SecretNameType]
    var SecretBinary: js.UndefOr[SecretBinaryType]
    var SecretString: js.UndefOr[SecretStringType]
    var VersionId: js.UndefOr[SecretVersionIdType]
    var VersionStages: js.UndefOr[SecretVersionStagesType]
  }

  object GetSecretValueResponse {
    @inline
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        CreatedDate: js.UndefOr[CreatedDateType] = js.undefined,
        Name: js.UndefOr[SecretNameType] = js.undefined,
        SecretBinary: js.UndefOr[SecretBinaryType] = js.undefined,
        SecretString: js.UndefOr[SecretStringType] = js.undefined,
        VersionId: js.UndefOr[SecretVersionIdType] = js.undefined,
        VersionStages: js.UndefOr[SecretVersionStagesType] = js.undefined
    ): GetSecretValueResponse = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SecretBinary.foreach(__v => __obj.updateDynamic("SecretBinary")(__v.asInstanceOf[js.Any]))
      SecretString.foreach(__v => __obj.updateDynamic("SecretString")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      VersionStages.foreach(__v => __obj.updateDynamic("VersionStages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSecretValueResponse]
    }
  }

  @js.native
  trait ListSecretVersionIdsRequest extends js.Object {
    var SecretId: SecretIdType
    var IncludeDeprecated: js.UndefOr[BooleanType]
    var MaxResults: js.UndefOr[MaxResultsType]
    var NextToken: js.UndefOr[NextTokenType]
  }

  object ListSecretVersionIdsRequest {
    @inline
    def apply(
        SecretId: SecretIdType,
        IncludeDeprecated: js.UndefOr[BooleanType] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsType] = js.undefined,
        NextToken: js.UndefOr[NextTokenType] = js.undefined
    ): ListSecretVersionIdsRequest = {
      val __obj = js.Dynamic.literal(
        "SecretId" -> SecretId.asInstanceOf[js.Any]
      )

      IncludeDeprecated.foreach(__v => __obj.updateDynamic("IncludeDeprecated")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecretVersionIdsRequest]
    }
  }

  @js.native
  trait ListSecretVersionIdsResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var NextToken: js.UndefOr[NextTokenType]
    var Versions: js.UndefOr[SecretVersionsListType]
  }

  object ListSecretVersionIdsResponse {
    @inline
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        Name: js.UndefOr[SecretNameType] = js.undefined,
        NextToken: js.UndefOr[NextTokenType] = js.undefined,
        Versions: js.UndefOr[SecretVersionsListType] = js.undefined
    ): ListSecretVersionIdsResponse = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Versions.foreach(__v => __obj.updateDynamic("Versions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecretVersionIdsResponse]
    }
  }

  @js.native
  trait ListSecretsRequest extends js.Object {
    var Filters: js.UndefOr[FiltersListType]
    var MaxResults: js.UndefOr[MaxResultsType]
    var NextToken: js.UndefOr[NextTokenType]
    var SortOrder: js.UndefOr[SortOrderType]
  }

  object ListSecretsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[FiltersListType] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsType] = js.undefined,
        NextToken: js.UndefOr[NextTokenType] = js.undefined,
        SortOrder: js.UndefOr[SortOrderType] = js.undefined
    ): ListSecretsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecretsRequest]
    }
  }

  @js.native
  trait ListSecretsResponse extends js.Object {
    var NextToken: js.UndefOr[NextTokenType]
    var SecretList: js.UndefOr[SecretListType]
  }

  object ListSecretsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextTokenType] = js.undefined,
        SecretList: js.UndefOr[SecretListType] = js.undefined
    ): ListSecretsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SecretList.foreach(__v => __obj.updateDynamic("SecretList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecretsResponse]
    }
  }

  @js.native
  trait PutResourcePolicyRequest extends js.Object {
    var ResourcePolicy: NonEmptyResourcePolicyType
    var SecretId: SecretIdType
    var BlockPublicPolicy: js.UndefOr[BooleanType]
  }

  object PutResourcePolicyRequest {
    @inline
    def apply(
        ResourcePolicy: NonEmptyResourcePolicyType,
        SecretId: SecretIdType,
        BlockPublicPolicy: js.UndefOr[BooleanType] = js.undefined
    ): PutResourcePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "ResourcePolicy" -> ResourcePolicy.asInstanceOf[js.Any],
        "SecretId" -> SecretId.asInstanceOf[js.Any]
      )

      BlockPublicPolicy.foreach(__v => __obj.updateDynamic("BlockPublicPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutResourcePolicyRequest]
    }
  }

  @js.native
  trait PutResourcePolicyResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[NameType]
  }

  object PutResourcePolicyResponse {
    @inline
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        Name: js.UndefOr[NameType] = js.undefined
    ): PutResourcePolicyResponse = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutResourcePolicyResponse]
    }
  }

  @js.native
  trait PutSecretValueRequest extends js.Object {
    var SecretId: SecretIdType
    var ClientRequestToken: js.UndefOr[ClientRequestTokenType]
    var SecretBinary: js.UndefOr[SecretBinaryType]
    var SecretString: js.UndefOr[SecretStringType]
    var VersionStages: js.UndefOr[SecretVersionStagesType]
  }

  object PutSecretValueRequest {
    @inline
    def apply(
        SecretId: SecretIdType,
        ClientRequestToken: js.UndefOr[ClientRequestTokenType] = js.undefined,
        SecretBinary: js.UndefOr[SecretBinaryType] = js.undefined,
        SecretString: js.UndefOr[SecretStringType] = js.undefined,
        VersionStages: js.UndefOr[SecretVersionStagesType] = js.undefined
    ): PutSecretValueRequest = {
      val __obj = js.Dynamic.literal(
        "SecretId" -> SecretId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      SecretBinary.foreach(__v => __obj.updateDynamic("SecretBinary")(__v.asInstanceOf[js.Any]))
      SecretString.foreach(__v => __obj.updateDynamic("SecretString")(__v.asInstanceOf[js.Any]))
      VersionStages.foreach(__v => __obj.updateDynamic("VersionStages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSecretValueRequest]
    }
  }

  @js.native
  trait PutSecretValueResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var VersionId: js.UndefOr[SecretVersionIdType]
    var VersionStages: js.UndefOr[SecretVersionStagesType]
  }

  object PutSecretValueResponse {
    @inline
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        Name: js.UndefOr[SecretNameType] = js.undefined,
        VersionId: js.UndefOr[SecretVersionIdType] = js.undefined,
        VersionStages: js.UndefOr[SecretVersionStagesType] = js.undefined
    ): PutSecretValueResponse = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      VersionStages.foreach(__v => __obj.updateDynamic("VersionStages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSecretValueResponse]
    }
  }

  @js.native
  trait RemoveRegionsFromReplicationRequest extends js.Object {
    var RemoveReplicaRegions: RemoveReplicaRegionListType
    var SecretId: SecretIdType
  }

  object RemoveRegionsFromReplicationRequest {
    @inline
    def apply(
        RemoveReplicaRegions: RemoveReplicaRegionListType,
        SecretId: SecretIdType
    ): RemoveRegionsFromReplicationRequest = {
      val __obj = js.Dynamic.literal(
        "RemoveReplicaRegions" -> RemoveReplicaRegions.asInstanceOf[js.Any],
        "SecretId" -> SecretId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RemoveRegionsFromReplicationRequest]
    }
  }

  @js.native
  trait RemoveRegionsFromReplicationResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var ReplicationStatus: js.UndefOr[ReplicationStatusListType]
  }

  object RemoveRegionsFromReplicationResponse {
    @inline
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        ReplicationStatus: js.UndefOr[ReplicationStatusListType] = js.undefined
    ): RemoveRegionsFromReplicationResponse = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      ReplicationStatus.foreach(__v => __obj.updateDynamic("ReplicationStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveRegionsFromReplicationResponse]
    }
  }

  /** (Optional) Custom type consisting of a <code>Region</code> (required) and the <code>KmsKeyId</code> which can be an <code>ARN</code>, <code>Key ID</code>, or <code>Alias</code>.
    */
  @js.native
  trait ReplicaRegionType extends js.Object {
    var KmsKeyId: js.UndefOr[KmsKeyIdType]
    var Region: js.UndefOr[RegionType]
  }

  object ReplicaRegionType {
    @inline
    def apply(
        KmsKeyId: js.UndefOr[KmsKeyIdType] = js.undefined,
        Region: js.UndefOr[RegionType] = js.undefined
    ): ReplicaRegionType = {
      val __obj = js.Dynamic.literal()
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicaRegionType]
    }
  }

  @js.native
  trait ReplicateSecretToRegionsRequest extends js.Object {
    var AddReplicaRegions: AddReplicaRegionListType
    var SecretId: SecretIdType
    var ForceOverwriteReplicaSecret: js.UndefOr[BooleanType]
  }

  object ReplicateSecretToRegionsRequest {
    @inline
    def apply(
        AddReplicaRegions: AddReplicaRegionListType,
        SecretId: SecretIdType,
        ForceOverwriteReplicaSecret: js.UndefOr[BooleanType] = js.undefined
    ): ReplicateSecretToRegionsRequest = {
      val __obj = js.Dynamic.literal(
        "AddReplicaRegions" -> AddReplicaRegions.asInstanceOf[js.Any],
        "SecretId" -> SecretId.asInstanceOf[js.Any]
      )

      ForceOverwriteReplicaSecret.foreach(__v => __obj.updateDynamic("ForceOverwriteReplicaSecret")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicateSecretToRegionsRequest]
    }
  }

  @js.native
  trait ReplicateSecretToRegionsResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var ReplicationStatus: js.UndefOr[ReplicationStatusListType]
  }

  object ReplicateSecretToRegionsResponse {
    @inline
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        ReplicationStatus: js.UndefOr[ReplicationStatusListType] = js.undefined
    ): ReplicateSecretToRegionsResponse = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      ReplicationStatus.foreach(__v => __obj.updateDynamic("ReplicationStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicateSecretToRegionsResponse]
    }
  }

  /** A replication object consisting of a <code>RegionReplicationStatus</code> object and includes a Region, KMSKeyId, status, and status message.
    */
  @js.native
  trait ReplicationStatusType extends js.Object {
    var KmsKeyId: js.UndefOr[KmsKeyIdType]
    var LastAccessedDate: js.UndefOr[LastAccessedDateType]
    var Region: js.UndefOr[RegionType]
    var Status: js.UndefOr[StatusType]
    var StatusMessage: js.UndefOr[StatusMessageType]
  }

  object ReplicationStatusType {
    @inline
    def apply(
        KmsKeyId: js.UndefOr[KmsKeyIdType] = js.undefined,
        LastAccessedDate: js.UndefOr[LastAccessedDateType] = js.undefined,
        Region: js.UndefOr[RegionType] = js.undefined,
        Status: js.UndefOr[StatusType] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessageType] = js.undefined
    ): ReplicationStatusType = {
      val __obj = js.Dynamic.literal()
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LastAccessedDate.foreach(__v => __obj.updateDynamic("LastAccessedDate")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationStatusType]
    }
  }

  @js.native
  trait RestoreSecretRequest extends js.Object {
    var SecretId: SecretIdType
  }

  object RestoreSecretRequest {
    @inline
    def apply(
        SecretId: SecretIdType
    ): RestoreSecretRequest = {
      val __obj = js.Dynamic.literal(
        "SecretId" -> SecretId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RestoreSecretRequest]
    }
  }

  @js.native
  trait RestoreSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
  }

  object RestoreSecretResponse {
    @inline
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        Name: js.UndefOr[SecretNameType] = js.undefined
    ): RestoreSecretResponse = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreSecretResponse]
    }
  }

  @js.native
  trait RotateSecretRequest extends js.Object {
    var SecretId: SecretIdType
    var ClientRequestToken: js.UndefOr[ClientRequestTokenType]
    var RotationLambdaARN: js.UndefOr[RotationLambdaARNType]
    var RotationRules: js.UndefOr[RotationRulesType]
  }

  object RotateSecretRequest {
    @inline
    def apply(
        SecretId: SecretIdType,
        ClientRequestToken: js.UndefOr[ClientRequestTokenType] = js.undefined,
        RotationLambdaARN: js.UndefOr[RotationLambdaARNType] = js.undefined,
        RotationRules: js.UndefOr[RotationRulesType] = js.undefined
    ): RotateSecretRequest = {
      val __obj = js.Dynamic.literal(
        "SecretId" -> SecretId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      RotationLambdaARN.foreach(__v => __obj.updateDynamic("RotationLambdaARN")(__v.asInstanceOf[js.Any]))
      RotationRules.foreach(__v => __obj.updateDynamic("RotationRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RotateSecretRequest]
    }
  }

  @js.native
  trait RotateSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var VersionId: js.UndefOr[SecretVersionIdType]
  }

  object RotateSecretResponse {
    @inline
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        Name: js.UndefOr[SecretNameType] = js.undefined,
        VersionId: js.UndefOr[SecretVersionIdType] = js.undefined
    ): RotateSecretResponse = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RotateSecretResponse]
    }
  }

  /** A structure that defines the rotation configuration for the secret.
    */
  @js.native
  trait RotationRulesType extends js.Object {
    var AutomaticallyAfterDays: js.UndefOr[AutomaticallyRotateAfterDaysType]
  }

  object RotationRulesType {
    @inline
    def apply(
        AutomaticallyAfterDays: js.UndefOr[AutomaticallyRotateAfterDaysType] = js.undefined
    ): RotationRulesType = {
      val __obj = js.Dynamic.literal()
      AutomaticallyAfterDays.foreach(__v => __obj.updateDynamic("AutomaticallyAfterDays")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RotationRulesType]
    }
  }

  /** A structure that contains the details about a secret. It does not include the encrypted <code>SecretString</code> and <code>SecretBinary</code> values. To get those values, use the <a>GetSecretValue</a> operation.
    */
  @js.native
  trait SecretListEntry extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var CreatedDate: js.UndefOr[TimestampType]
    var DeletedDate: js.UndefOr[DeletedDateType]
    var Description: js.UndefOr[DescriptionType]
    var KmsKeyId: js.UndefOr[KmsKeyIdType]
    var LastAccessedDate: js.UndefOr[LastAccessedDateType]
    var LastChangedDate: js.UndefOr[LastChangedDateType]
    var LastRotatedDate: js.UndefOr[LastRotatedDateType]
    var Name: js.UndefOr[SecretNameType]
    var OwningService: js.UndefOr[OwningServiceType]
    var PrimaryRegion: js.UndefOr[RegionType]
    var RotationEnabled: js.UndefOr[RotationEnabledType]
    var RotationLambdaARN: js.UndefOr[RotationLambdaARNType]
    var RotationRules: js.UndefOr[RotationRulesType]
    var SecretVersionsToStages: js.UndefOr[SecretVersionsToStagesMapType]
    var Tags: js.UndefOr[TagListType]
  }

  object SecretListEntry {
    @inline
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        CreatedDate: js.UndefOr[TimestampType] = js.undefined,
        DeletedDate: js.UndefOr[DeletedDateType] = js.undefined,
        Description: js.UndefOr[DescriptionType] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyIdType] = js.undefined,
        LastAccessedDate: js.UndefOr[LastAccessedDateType] = js.undefined,
        LastChangedDate: js.UndefOr[LastChangedDateType] = js.undefined,
        LastRotatedDate: js.UndefOr[LastRotatedDateType] = js.undefined,
        Name: js.UndefOr[SecretNameType] = js.undefined,
        OwningService: js.UndefOr[OwningServiceType] = js.undefined,
        PrimaryRegion: js.UndefOr[RegionType] = js.undefined,
        RotationEnabled: js.UndefOr[RotationEnabledType] = js.undefined,
        RotationLambdaARN: js.UndefOr[RotationLambdaARNType] = js.undefined,
        RotationRules: js.UndefOr[RotationRulesType] = js.undefined,
        SecretVersionsToStages: js.UndefOr[SecretVersionsToStagesMapType] = js.undefined,
        Tags: js.UndefOr[TagListType] = js.undefined
    ): SecretListEntry = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      DeletedDate.foreach(__v => __obj.updateDynamic("DeletedDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LastAccessedDate.foreach(__v => __obj.updateDynamic("LastAccessedDate")(__v.asInstanceOf[js.Any]))
      LastChangedDate.foreach(__v => __obj.updateDynamic("LastChangedDate")(__v.asInstanceOf[js.Any]))
      LastRotatedDate.foreach(__v => __obj.updateDynamic("LastRotatedDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwningService.foreach(__v => __obj.updateDynamic("OwningService")(__v.asInstanceOf[js.Any]))
      PrimaryRegion.foreach(__v => __obj.updateDynamic("PrimaryRegion")(__v.asInstanceOf[js.Any]))
      RotationEnabled.foreach(__v => __obj.updateDynamic("RotationEnabled")(__v.asInstanceOf[js.Any]))
      RotationLambdaARN.foreach(__v => __obj.updateDynamic("RotationLambdaARN")(__v.asInstanceOf[js.Any]))
      RotationRules.foreach(__v => __obj.updateDynamic("RotationRules")(__v.asInstanceOf[js.Any]))
      SecretVersionsToStages.foreach(__v => __obj.updateDynamic("SecretVersionsToStages")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecretListEntry]
    }
  }

  /** A structure that contains information about one version of a secret.
    */
  @js.native
  trait SecretVersionsListEntry extends js.Object {
    var CreatedDate: js.UndefOr[CreatedDateType]
    var LastAccessedDate: js.UndefOr[LastAccessedDateType]
    var VersionId: js.UndefOr[SecretVersionIdType]
    var VersionStages: js.UndefOr[SecretVersionStagesType]
  }

  object SecretVersionsListEntry {
    @inline
    def apply(
        CreatedDate: js.UndefOr[CreatedDateType] = js.undefined,
        LastAccessedDate: js.UndefOr[LastAccessedDateType] = js.undefined,
        VersionId: js.UndefOr[SecretVersionIdType] = js.undefined,
        VersionStages: js.UndefOr[SecretVersionStagesType] = js.undefined
    ): SecretVersionsListEntry = {
      val __obj = js.Dynamic.literal()
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      LastAccessedDate.foreach(__v => __obj.updateDynamic("LastAccessedDate")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      VersionStages.foreach(__v => __obj.updateDynamic("VersionStages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecretVersionsListEntry]
    }
  }

  @js.native
  sealed trait SortOrderType extends js.Any
  object SortOrderType {
    val asc = "asc".asInstanceOf[SortOrderType]
    val desc = "desc".asInstanceOf[SortOrderType]

    @inline def values = js.Array(asc, desc)
  }

  @js.native
  sealed trait StatusType extends js.Any
  object StatusType {
    val InSync = "InSync".asInstanceOf[StatusType]
    val Failed = "Failed".asInstanceOf[StatusType]
    val InProgress = "InProgress".asInstanceOf[StatusType]

    @inline def values = js.Array(InSync, Failed, InProgress)
  }

  @js.native
  trait StopReplicationToReplicaRequest extends js.Object {
    var SecretId: SecretIdType
  }

  object StopReplicationToReplicaRequest {
    @inline
    def apply(
        SecretId: SecretIdType
    ): StopReplicationToReplicaRequest = {
      val __obj = js.Dynamic.literal(
        "SecretId" -> SecretId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopReplicationToReplicaRequest]
    }
  }

  @js.native
  trait StopReplicationToReplicaResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
  }

  object StopReplicationToReplicaResponse {
    @inline
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined
    ): StopReplicationToReplicaResponse = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopReplicationToReplicaResponse]
    }
  }

  /** A structure that contains information about a tag.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKeyType]
    var Value: js.UndefOr[TagValueType]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[TagKeyType] = js.undefined,
        Value: js.UndefOr[TagValueType] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var SecretId: SecretIdType
    var Tags: TagListType
  }

  object TagResourceRequest {
    @inline
    def apply(
        SecretId: SecretIdType,
        Tags: TagListType
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "SecretId" -> SecretId.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var SecretId: SecretIdType
    var TagKeys: TagKeyListType
  }

  object UntagResourceRequest {
    @inline
    def apply(
        SecretId: SecretIdType,
        TagKeys: TagKeyListType
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "SecretId" -> SecretId.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateSecretRequest extends js.Object {
    var SecretId: SecretIdType
    var ClientRequestToken: js.UndefOr[ClientRequestTokenType]
    var Description: js.UndefOr[DescriptionType]
    var KmsKeyId: js.UndefOr[KmsKeyIdType]
    var SecretBinary: js.UndefOr[SecretBinaryType]
    var SecretString: js.UndefOr[SecretStringType]
  }

  object UpdateSecretRequest {
    @inline
    def apply(
        SecretId: SecretIdType,
        ClientRequestToken: js.UndefOr[ClientRequestTokenType] = js.undefined,
        Description: js.UndefOr[DescriptionType] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyIdType] = js.undefined,
        SecretBinary: js.UndefOr[SecretBinaryType] = js.undefined,
        SecretString: js.UndefOr[SecretStringType] = js.undefined
    ): UpdateSecretRequest = {
      val __obj = js.Dynamic.literal(
        "SecretId" -> SecretId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      SecretBinary.foreach(__v => __obj.updateDynamic("SecretBinary")(__v.asInstanceOf[js.Any]))
      SecretString.foreach(__v => __obj.updateDynamic("SecretString")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSecretRequest]
    }
  }

  @js.native
  trait UpdateSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var VersionId: js.UndefOr[SecretVersionIdType]
  }

  object UpdateSecretResponse {
    @inline
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        Name: js.UndefOr[SecretNameType] = js.undefined,
        VersionId: js.UndefOr[SecretVersionIdType] = js.undefined
    ): UpdateSecretResponse = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSecretResponse]
    }
  }

  @js.native
  trait UpdateSecretVersionStageRequest extends js.Object {
    var SecretId: SecretIdType
    var VersionStage: SecretVersionStageType
    var MoveToVersionId: js.UndefOr[SecretVersionIdType]
    var RemoveFromVersionId: js.UndefOr[SecretVersionIdType]
  }

  object UpdateSecretVersionStageRequest {
    @inline
    def apply(
        SecretId: SecretIdType,
        VersionStage: SecretVersionStageType,
        MoveToVersionId: js.UndefOr[SecretVersionIdType] = js.undefined,
        RemoveFromVersionId: js.UndefOr[SecretVersionIdType] = js.undefined
    ): UpdateSecretVersionStageRequest = {
      val __obj = js.Dynamic.literal(
        "SecretId" -> SecretId.asInstanceOf[js.Any],
        "VersionStage" -> VersionStage.asInstanceOf[js.Any]
      )

      MoveToVersionId.foreach(__v => __obj.updateDynamic("MoveToVersionId")(__v.asInstanceOf[js.Any]))
      RemoveFromVersionId.foreach(__v => __obj.updateDynamic("RemoveFromVersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSecretVersionStageRequest]
    }
  }

  @js.native
  trait UpdateSecretVersionStageResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
  }

  object UpdateSecretVersionStageResponse {
    @inline
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        Name: js.UndefOr[SecretNameType] = js.undefined
    ): UpdateSecretVersionStageResponse = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSecretVersionStageResponse]
    }
  }

  @js.native
  trait ValidateResourcePolicyRequest extends js.Object {
    var ResourcePolicy: NonEmptyResourcePolicyType
    var SecretId: js.UndefOr[SecretIdType]
  }

  object ValidateResourcePolicyRequest {
    @inline
    def apply(
        ResourcePolicy: NonEmptyResourcePolicyType,
        SecretId: js.UndefOr[SecretIdType] = js.undefined
    ): ValidateResourcePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "ResourcePolicy" -> ResourcePolicy.asInstanceOf[js.Any]
      )

      SecretId.foreach(__v => __obj.updateDynamic("SecretId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidateResourcePolicyRequest]
    }
  }

  @js.native
  trait ValidateResourcePolicyResponse extends js.Object {
    var PolicyValidationPassed: js.UndefOr[BooleanType]
    var ValidationErrors: js.UndefOr[ValidationErrorsType]
  }

  object ValidateResourcePolicyResponse {
    @inline
    def apply(
        PolicyValidationPassed: js.UndefOr[BooleanType] = js.undefined,
        ValidationErrors: js.UndefOr[ValidationErrorsType] = js.undefined
    ): ValidateResourcePolicyResponse = {
      val __obj = js.Dynamic.literal()
      PolicyValidationPassed.foreach(__v => __obj.updateDynamic("PolicyValidationPassed")(__v.asInstanceOf[js.Any]))
      ValidationErrors.foreach(__v => __obj.updateDynamic("ValidationErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidateResourcePolicyResponse]
    }
  }

  /** Displays errors that occurred during validation of the resource policy.
    */
  @js.native
  trait ValidationErrorsEntry extends js.Object {
    var CheckName: js.UndefOr[NameType]
    var ErrorMessage: js.UndefOr[ErrorMessage]
  }

  object ValidationErrorsEntry {
    @inline
    def apply(
        CheckName: js.UndefOr[NameType] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined
    ): ValidationErrorsEntry = {
      val __obj = js.Dynamic.literal()
      CheckName.foreach(__v => __obj.updateDynamic("CheckName")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidationErrorsEntry]
    }
  }
}
