package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object iam {
  type AccessDetails      = js.Array[AccessDetail]
  type ActionNameListType = js.Array[ActionNameType]
  type ActionNameType     = String
  type ArnListType        = js.Array[arnType]
  type BootstrapDatum =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ColumnNumber                      = Int
  type ContextEntryListType              = js.Array[ContextEntry]
  type ContextKeyNameType                = String
  type ContextKeyNamesResultListType     = js.Array[ContextKeyNameType]
  type ContextKeyTypeEnum                = String
  type ContextKeyValueListType           = js.Array[ContextKeyValueType]
  type ContextKeyValueType               = String
  type DeletionTaskIdType                = String
  type DeletionTaskStatusType            = String
  type EntityType                        = String
  type EvalDecisionDetailsType           = js.Dictionary[PolicyEvaluationDecisionType]
  type EvalDecisionSourceType            = String
  type EvaluationResultsListType         = js.Array[EvaluationResult]
  type LineNumber                        = Int
  type ManagedPolicyDetailListType       = js.Array[ManagedPolicyDetail]
  type OpenIDConnectProviderListType     = js.Array[OpenIDConnectProviderListEntry]
  type OpenIDConnectProviderUrlType      = String
  type PermissionsBoundaryAttachmentType = String
  type PolicyEvaluationDecisionType      = String
  type PolicyGroupListType               = js.Array[PolicyGroup]
  type PolicyIdentifierType              = String
  type PolicyRoleListType                = js.Array[PolicyRole]
  type PolicySourceType                  = String
  type PolicyUsageType                   = String
  type PolicyUserListType                = js.Array[PolicyUser]
  type ReasonType                        = String
  type RegionNameType                    = String
  type ReportContentType =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ReportFormatType                                = String
  type ReportStateDescriptionType                      = String
  type ReportStateType                                 = String
  type ResourceHandlingOptionType                      = String
  type ResourceNameListType                            = js.Array[ResourceNameType]
  type ResourceNameType                                = String
  type ResourceSpecificResultListType                  = js.Array[ResourceSpecificResult]
  type RoleUsageListType                               = js.Array[RoleUsageType]
  type SAMLMetadataDocumentType                        = String
  type SAMLProviderListType                            = js.Array[SAMLProviderListEntry]
  type SAMLProviderNameType                            = String
  type SSHPublicKeyListType                            = js.Array[SSHPublicKeyMetadata]
  type ServiceSpecificCredentialsListType              = js.Array[ServiceSpecificCredentialMetadata]
  type ServicesLastAccessed                            = js.Array[ServiceLastAccessed]
  type SimulationPolicyListType                        = js.Array[policyDocumentType]
  type StatementListType                               = js.Array[Statement]
  type accessKeyIdType                                 = String
  type accessKeyMetadataListType                       = js.Array[AccessKeyMetadata]
  type accessKeySecretType                             = String
  type accountAliasListType                            = js.Array[accountAliasType]
  type accountAliasType                                = String
  type arnType                                         = String
  type assignmentStatusType                            = String
  type attachedPoliciesListType                        = js.Array[AttachedPolicy]
  type attachmentCountType                             = Int
  type authenticationCodeType                          = String
  type booleanObjectType                               = Boolean
  type booleanType                                     = Boolean
  type certificateBodyType                             = String
  type certificateChainType                            = String
  type certificateIdType                               = String
  type certificateListType                             = js.Array[SigningCertificate]
  type clientIDListType                                = js.Array[clientIDType]
  type clientIDType                                    = String
  type customSuffixType                                = String
  type dateType                                        = js.Date
  type encodingType                                    = String
  type entityDetailsListType                           = js.Array[EntityDetails]
  type entityListType                                  = js.Array[EntityType]
  type entityNameType                                  = String
  type existingUserNameType                            = String
  type globalEndpointTokenVersion                      = String
  type groupDetailListType                             = js.Array[GroupDetail]
  type groupListType                                   = js.Array[Group]
  type groupNameListType                               = js.Array[groupNameType]
  type groupNameType                                   = String
  type idType                                          = String
  type instanceProfileListType                         = js.Array[InstanceProfile]
  type instanceProfileNameType                         = String
  type integerType                                     = Int
  type jobIDType                                       = String
  type jobStatusType                                   = String
  type listPolicyGrantingServiceAccessResponseListType = js.Array[ListPoliciesGrantingServiceAccessEntry]
  type markerType                                      = String
  type maxItemsType                                    = Int
  type maxPasswordAgeType                              = Int
  type mfaDeviceListType                               = js.Array[MFADevice]
  type minimumPasswordLengthType                       = Int
  type organizationsEntityPathType                     = String
  type organizationsPolicyIdType                       = String
  type passwordReusePreventionType                     = Int
  type passwordType                                    = String
  type pathPrefixType                                  = String
  type pathType                                        = String
  type policyDescriptionType                           = String
  type policyDetailListType                            = js.Array[PolicyDetail]
  type policyDocumentType                              = String
  type policyDocumentVersionListType                   = js.Array[PolicyVersion]
  type policyGrantingServiceAccessListType             = js.Array[PolicyGrantingServiceAccess]
  type policyListType                                  = js.Array[Policy]
  type policyNameListType                              = js.Array[policyNameType]
  type policyNameType                                  = String
  type policyOwnerEntityType                           = String
  type policyPathType                                  = String
  type policyScopeType                                 = String
  type policyType                                      = String
  type policyVersionIdType                             = String
  type privateKeyType                                  = String
  type publicKeyFingerprintType                        = String
  type publicKeyIdType                                 = String
  type publicKeyMaterialType                           = String
  type responseMarkerType                              = String
  type roleDescriptionType                             = String
  type roleDetailListType                              = js.Array[RoleDetail]
  type roleListType                                    = js.Array[Role]
  type roleMaxSessionDurationType                      = Int
  type roleNameType                                    = String
  type serialNumberType                                = String
  type serverCertificateMetadataListType               = js.Array[ServerCertificateMetadata]
  type serverCertificateNameType                       = String
  type serviceName                                     = String
  type serviceNameType                                 = String
  type serviceNamespaceListType                        = js.Array[serviceNamespaceType]
  type serviceNamespaceType                            = String
  type servicePassword                                 = String
  type serviceSpecificCredentialId                     = String
  type serviceUserName                                 = String
  type sortKeyType                                     = String
  type statusType                                      = String
  type stringType                                      = String
  type summaryKeyType                                  = String
  type summaryMapType                                  = js.Dictionary[summaryValueType]
  type summaryValueType                                = Int
  type tagKeyListType                                  = js.Array[tagKeyType]
  type tagKeyType                                      = String
  type tagListType                                     = js.Array[Tag]
  type tagValueType                                    = String
  type thumbprintListType                              = js.Array[thumbprintType]
  type thumbprintType                                  = String
  type userDetailListType                              = js.Array[UserDetail]
  type userListType                                    = js.Array[User]
  type userNameType                                    = String
  type virtualMFADeviceListType                        = js.Array[VirtualMFADevice]
  type virtualMFADeviceName                            = String

  implicit final class IAMOps(val service: IAM) extends AnyVal {

    def addClientIDToOpenIDConnectProviderFuture(params: AddClientIDToOpenIDConnectProviderRequest): Future[js.Object] =
      service.addClientIDToOpenIDConnectProvider(params).promise.toFuture
    def addRoleToInstanceProfileFuture(params: AddRoleToInstanceProfileRequest): Future[js.Object] =
      service.addRoleToInstanceProfile(params).promise.toFuture
    def addUserToGroupFuture(params: AddUserToGroupRequest): Future[js.Object] =
      service.addUserToGroup(params).promise.toFuture
    def attachGroupPolicyFuture(params: AttachGroupPolicyRequest): Future[js.Object] =
      service.attachGroupPolicy(params).promise.toFuture
    def attachRolePolicyFuture(params: AttachRolePolicyRequest): Future[js.Object] =
      service.attachRolePolicy(params).promise.toFuture
    def attachUserPolicyFuture(params: AttachUserPolicyRequest): Future[js.Object] =
      service.attachUserPolicy(params).promise.toFuture
    def changePasswordFuture(params: ChangePasswordRequest): Future[js.Object] =
      service.changePassword(params).promise.toFuture
    def createAccessKeyFuture(params: CreateAccessKeyRequest): Future[CreateAccessKeyResponse] =
      service.createAccessKey(params).promise.toFuture
    def createAccountAliasFuture(params: CreateAccountAliasRequest): Future[js.Object] =
      service.createAccountAlias(params).promise.toFuture
    def createGroupFuture(params: CreateGroupRequest): Future[CreateGroupResponse] =
      service.createGroup(params).promise.toFuture
    def createInstanceProfileFuture(params: CreateInstanceProfileRequest): Future[CreateInstanceProfileResponse] =
      service.createInstanceProfile(params).promise.toFuture
    def createLoginProfileFuture(params: CreateLoginProfileRequest): Future[CreateLoginProfileResponse] =
      service.createLoginProfile(params).promise.toFuture
    def createOpenIDConnectProviderFuture(
        params: CreateOpenIDConnectProviderRequest
    ): Future[CreateOpenIDConnectProviderResponse] = service.createOpenIDConnectProvider(params).promise.toFuture
    def createPolicyFuture(params: CreatePolicyRequest): Future[CreatePolicyResponse] =
      service.createPolicy(params).promise.toFuture
    def createPolicyVersionFuture(params: CreatePolicyVersionRequest): Future[CreatePolicyVersionResponse] =
      service.createPolicyVersion(params).promise.toFuture
    def createRoleFuture(params: CreateRoleRequest): Future[CreateRoleResponse] =
      service.createRole(params).promise.toFuture
    def createSAMLProviderFuture(params: CreateSAMLProviderRequest): Future[CreateSAMLProviderResponse] =
      service.createSAMLProvider(params).promise.toFuture
    def createServiceLinkedRoleFuture(params: CreateServiceLinkedRoleRequest): Future[CreateServiceLinkedRoleResponse] =
      service.createServiceLinkedRole(params).promise.toFuture
    def createServiceSpecificCredentialFuture(
        params: CreateServiceSpecificCredentialRequest
    ): Future[CreateServiceSpecificCredentialResponse] =
      service.createServiceSpecificCredential(params).promise.toFuture
    def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] =
      service.createUser(params).promise.toFuture
    def createVirtualMFADeviceFuture(params: CreateVirtualMFADeviceRequest): Future[CreateVirtualMFADeviceResponse] =
      service.createVirtualMFADevice(params).promise.toFuture
    def deactivateMFADeviceFuture(params: DeactivateMFADeviceRequest): Future[js.Object] =
      service.deactivateMFADevice(params).promise.toFuture
    def deleteAccessKeyFuture(params: DeleteAccessKeyRequest): Future[js.Object] =
      service.deleteAccessKey(params).promise.toFuture
    def deleteAccountAliasFuture(params: DeleteAccountAliasRequest): Future[js.Object] =
      service.deleteAccountAlias(params).promise.toFuture
    def deleteAccountPasswordPolicyFuture(): Future[js.Object]           = service.deleteAccountPasswordPolicy().promise.toFuture
    def deleteGroupFuture(params: DeleteGroupRequest): Future[js.Object] = service.deleteGroup(params).promise.toFuture
    def deleteGroupPolicyFuture(params: DeleteGroupPolicyRequest): Future[js.Object] =
      service.deleteGroupPolicy(params).promise.toFuture
    def deleteInstanceProfileFuture(params: DeleteInstanceProfileRequest): Future[js.Object] =
      service.deleteInstanceProfile(params).promise.toFuture
    def deleteLoginProfileFuture(params: DeleteLoginProfileRequest): Future[js.Object] =
      service.deleteLoginProfile(params).promise.toFuture
    def deleteOpenIDConnectProviderFuture(params: DeleteOpenIDConnectProviderRequest): Future[js.Object] =
      service.deleteOpenIDConnectProvider(params).promise.toFuture
    def deletePolicyFuture(params: DeletePolicyRequest): Future[js.Object] =
      service.deletePolicy(params).promise.toFuture
    def deletePolicyVersionFuture(params: DeletePolicyVersionRequest): Future[js.Object] =
      service.deletePolicyVersion(params).promise.toFuture
    def deleteRoleFuture(params: DeleteRoleRequest): Future[js.Object] = service.deleteRole(params).promise.toFuture
    def deleteRolePermissionsBoundaryFuture(params: DeleteRolePermissionsBoundaryRequest): Future[js.Object] =
      service.deleteRolePermissionsBoundary(params).promise.toFuture
    def deleteRolePolicyFuture(params: DeleteRolePolicyRequest): Future[js.Object] =
      service.deleteRolePolicy(params).promise.toFuture
    def deleteSAMLProviderFuture(params: DeleteSAMLProviderRequest): Future[js.Object] =
      service.deleteSAMLProvider(params).promise.toFuture
    def deleteSSHPublicKeyFuture(params: DeleteSSHPublicKeyRequest): Future[js.Object] =
      service.deleteSSHPublicKey(params).promise.toFuture
    def deleteServerCertificateFuture(params: DeleteServerCertificateRequest): Future[js.Object] =
      service.deleteServerCertificate(params).promise.toFuture
    def deleteServiceLinkedRoleFuture(params: DeleteServiceLinkedRoleRequest): Future[DeleteServiceLinkedRoleResponse] =
      service.deleteServiceLinkedRole(params).promise.toFuture
    def deleteServiceSpecificCredentialFuture(params: DeleteServiceSpecificCredentialRequest): Future[js.Object] =
      service.deleteServiceSpecificCredential(params).promise.toFuture
    def deleteSigningCertificateFuture(params: DeleteSigningCertificateRequest): Future[js.Object] =
      service.deleteSigningCertificate(params).promise.toFuture
    def deleteUserFuture(params: DeleteUserRequest): Future[js.Object] = service.deleteUser(params).promise.toFuture
    def deleteUserPermissionsBoundaryFuture(params: DeleteUserPermissionsBoundaryRequest): Future[js.Object] =
      service.deleteUserPermissionsBoundary(params).promise.toFuture
    def deleteUserPolicyFuture(params: DeleteUserPolicyRequest): Future[js.Object] =
      service.deleteUserPolicy(params).promise.toFuture
    def deleteVirtualMFADeviceFuture(params: DeleteVirtualMFADeviceRequest): Future[js.Object] =
      service.deleteVirtualMFADevice(params).promise.toFuture
    def detachGroupPolicyFuture(params: DetachGroupPolicyRequest): Future[js.Object] =
      service.detachGroupPolicy(params).promise.toFuture
    def detachRolePolicyFuture(params: DetachRolePolicyRequest): Future[js.Object] =
      service.detachRolePolicy(params).promise.toFuture
    def detachUserPolicyFuture(params: DetachUserPolicyRequest): Future[js.Object] =
      service.detachUserPolicy(params).promise.toFuture
    def enableMFADeviceFuture(params: EnableMFADeviceRequest): Future[js.Object] =
      service.enableMFADevice(params).promise.toFuture
    def generateCredentialReportFuture(): Future[GenerateCredentialReportResponse] =
      service.generateCredentialReport().promise.toFuture
    def generateOrganizationsAccessReportFuture(
        params: GenerateOrganizationsAccessReportRequest
    ): Future[GenerateOrganizationsAccessReportResponse] =
      service.generateOrganizationsAccessReport(params).promise.toFuture
    def generateServiceLastAccessedDetailsFuture(
        params: GenerateServiceLastAccessedDetailsRequest
    ): Future[GenerateServiceLastAccessedDetailsResponse] =
      service.generateServiceLastAccessedDetails(params).promise.toFuture
    def getAccessKeyLastUsedFuture(params: GetAccessKeyLastUsedRequest): Future[GetAccessKeyLastUsedResponse] =
      service.getAccessKeyLastUsed(params).promise.toFuture
    def getAccountAuthorizationDetailsFuture(
        params: GetAccountAuthorizationDetailsRequest
    ): Future[GetAccountAuthorizationDetailsResponse] = service.getAccountAuthorizationDetails(params).promise.toFuture
    def getAccountPasswordPolicyFuture(): Future[GetAccountPasswordPolicyResponse] =
      service.getAccountPasswordPolicy().promise.toFuture
    def getAccountSummaryFuture(): Future[GetAccountSummaryResponse] = service.getAccountSummary().promise.toFuture
    def getContextKeysForCustomPolicyFuture(
        params: GetContextKeysForCustomPolicyRequest
    ): Future[GetContextKeysForPolicyResponse] = service.getContextKeysForCustomPolicy(params).promise.toFuture
    def getContextKeysForPrincipalPolicyFuture(
        params: GetContextKeysForPrincipalPolicyRequest
    ): Future[GetContextKeysForPolicyResponse] = service.getContextKeysForPrincipalPolicy(params).promise.toFuture
    def getCredentialReportFuture(): Future[GetCredentialReportResponse] =
      service.getCredentialReport().promise.toFuture
    def getGroupFuture(params: GetGroupRequest): Future[GetGroupResponse] = service.getGroup(params).promise.toFuture
    def getGroupPolicyFuture(params: GetGroupPolicyRequest): Future[GetGroupPolicyResponse] =
      service.getGroupPolicy(params).promise.toFuture
    def getInstanceProfileFuture(params: GetInstanceProfileRequest): Future[GetInstanceProfileResponse] =
      service.getInstanceProfile(params).promise.toFuture
    def getLoginProfileFuture(params: GetLoginProfileRequest): Future[GetLoginProfileResponse] =
      service.getLoginProfile(params).promise.toFuture
    def getOpenIDConnectProviderFuture(
        params: GetOpenIDConnectProviderRequest
    ): Future[GetOpenIDConnectProviderResponse] = service.getOpenIDConnectProvider(params).promise.toFuture
    def getOrganizationsAccessReportFuture(
        params: GetOrganizationsAccessReportRequest
    ): Future[GetOrganizationsAccessReportResponse] = service.getOrganizationsAccessReport(params).promise.toFuture
    def getPolicyFuture(params: GetPolicyRequest): Future[GetPolicyResponse] =
      service.getPolicy(params).promise.toFuture
    def getPolicyVersionFuture(params: GetPolicyVersionRequest): Future[GetPolicyVersionResponse] =
      service.getPolicyVersion(params).promise.toFuture
    def getRoleFuture(params: GetRoleRequest): Future[GetRoleResponse] = service.getRole(params).promise.toFuture
    def getRolePolicyFuture(params: GetRolePolicyRequest): Future[GetRolePolicyResponse] =
      service.getRolePolicy(params).promise.toFuture
    def getSAMLProviderFuture(params: GetSAMLProviderRequest): Future[GetSAMLProviderResponse] =
      service.getSAMLProvider(params).promise.toFuture
    def getSSHPublicKeyFuture(params: GetSSHPublicKeyRequest): Future[GetSSHPublicKeyResponse] =
      service.getSSHPublicKey(params).promise.toFuture
    def getServerCertificateFuture(params: GetServerCertificateRequest): Future[GetServerCertificateResponse] =
      service.getServerCertificate(params).promise.toFuture
    def getServiceLastAccessedDetailsFuture(
        params: GetServiceLastAccessedDetailsRequest
    ): Future[GetServiceLastAccessedDetailsResponse] = service.getServiceLastAccessedDetails(params).promise.toFuture
    def getServiceLastAccessedDetailsWithEntitiesFuture(
        params: GetServiceLastAccessedDetailsWithEntitiesRequest
    ): Future[GetServiceLastAccessedDetailsWithEntitiesResponse] =
      service.getServiceLastAccessedDetailsWithEntities(params).promise.toFuture
    def getServiceLinkedRoleDeletionStatusFuture(
        params: GetServiceLinkedRoleDeletionStatusRequest
    ): Future[GetServiceLinkedRoleDeletionStatusResponse] =
      service.getServiceLinkedRoleDeletionStatus(params).promise.toFuture
    def getUserFuture(params: GetUserRequest): Future[GetUserResponse] = service.getUser(params).promise.toFuture
    def getUserPolicyFuture(params: GetUserPolicyRequest): Future[GetUserPolicyResponse] =
      service.getUserPolicy(params).promise.toFuture
    def listAccessKeysFuture(params: ListAccessKeysRequest): Future[ListAccessKeysResponse] =
      service.listAccessKeys(params).promise.toFuture
    def listAccountAliasesFuture(params: ListAccountAliasesRequest): Future[ListAccountAliasesResponse] =
      service.listAccountAliases(params).promise.toFuture
    def listAttachedGroupPoliciesFuture(
        params: ListAttachedGroupPoliciesRequest
    ): Future[ListAttachedGroupPoliciesResponse] = service.listAttachedGroupPolicies(params).promise.toFuture
    def listAttachedRolePoliciesFuture(
        params: ListAttachedRolePoliciesRequest
    ): Future[ListAttachedRolePoliciesResponse] = service.listAttachedRolePolicies(params).promise.toFuture
    def listAttachedUserPoliciesFuture(
        params: ListAttachedUserPoliciesRequest
    ): Future[ListAttachedUserPoliciesResponse] = service.listAttachedUserPolicies(params).promise.toFuture
    def listEntitiesForPolicyFuture(params: ListEntitiesForPolicyRequest): Future[ListEntitiesForPolicyResponse] =
      service.listEntitiesForPolicy(params).promise.toFuture
    def listGroupPoliciesFuture(params: ListGroupPoliciesRequest): Future[ListGroupPoliciesResponse] =
      service.listGroupPolicies(params).promise.toFuture
    def listGroupsForUserFuture(params: ListGroupsForUserRequest): Future[ListGroupsForUserResponse] =
      service.listGroupsForUser(params).promise.toFuture
    def listGroupsFuture(params: ListGroupsRequest): Future[ListGroupsResponse] =
      service.listGroups(params).promise.toFuture
    def listInstanceProfilesForRoleFuture(
        params: ListInstanceProfilesForRoleRequest
    ): Future[ListInstanceProfilesForRoleResponse] = service.listInstanceProfilesForRole(params).promise.toFuture
    def listInstanceProfilesFuture(params: ListInstanceProfilesRequest): Future[ListInstanceProfilesResponse] =
      service.listInstanceProfiles(params).promise.toFuture
    def listMFADevicesFuture(params: ListMFADevicesRequest): Future[ListMFADevicesResponse] =
      service.listMFADevices(params).promise.toFuture
    def listOpenIDConnectProvidersFuture(
        params: ListOpenIDConnectProvidersRequest
    ): Future[ListOpenIDConnectProvidersResponse] = service.listOpenIDConnectProviders(params).promise.toFuture
    def listPoliciesFuture(params: ListPoliciesRequest): Future[ListPoliciesResponse] =
      service.listPolicies(params).promise.toFuture
    def listPoliciesGrantingServiceAccessFuture(
        params: ListPoliciesGrantingServiceAccessRequest
    ): Future[ListPoliciesGrantingServiceAccessResponse] =
      service.listPoliciesGrantingServiceAccess(params).promise.toFuture
    def listPolicyVersionsFuture(params: ListPolicyVersionsRequest): Future[ListPolicyVersionsResponse] =
      service.listPolicyVersions(params).promise.toFuture
    def listRolePoliciesFuture(params: ListRolePoliciesRequest): Future[ListRolePoliciesResponse] =
      service.listRolePolicies(params).promise.toFuture
    def listRoleTagsFuture(params: ListRoleTagsRequest): Future[ListRoleTagsResponse] =
      service.listRoleTags(params).promise.toFuture
    def listRolesFuture(params: ListRolesRequest): Future[ListRolesResponse] =
      service.listRoles(params).promise.toFuture
    def listSAMLProvidersFuture(params: ListSAMLProvidersRequest): Future[ListSAMLProvidersResponse] =
      service.listSAMLProviders(params).promise.toFuture
    def listSSHPublicKeysFuture(params: ListSSHPublicKeysRequest): Future[ListSSHPublicKeysResponse] =
      service.listSSHPublicKeys(params).promise.toFuture
    def listServerCertificatesFuture(params: ListServerCertificatesRequest): Future[ListServerCertificatesResponse] =
      service.listServerCertificates(params).promise.toFuture
    def listServiceSpecificCredentialsFuture(
        params: ListServiceSpecificCredentialsRequest
    ): Future[ListServiceSpecificCredentialsResponse] = service.listServiceSpecificCredentials(params).promise.toFuture
    def listSigningCertificatesFuture(params: ListSigningCertificatesRequest): Future[ListSigningCertificatesResponse] =
      service.listSigningCertificates(params).promise.toFuture
    def listUserPoliciesFuture(params: ListUserPoliciesRequest): Future[ListUserPoliciesResponse] =
      service.listUserPolicies(params).promise.toFuture
    def listUserTagsFuture(params: ListUserTagsRequest): Future[ListUserTagsResponse] =
      service.listUserTags(params).promise.toFuture
    def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] =
      service.listUsers(params).promise.toFuture
    def listVirtualMFADevicesFuture(params: ListVirtualMFADevicesRequest): Future[ListVirtualMFADevicesResponse] =
      service.listVirtualMFADevices(params).promise.toFuture
    def putGroupPolicyFuture(params: PutGroupPolicyRequest): Future[js.Object] =
      service.putGroupPolicy(params).promise.toFuture
    def putRolePermissionsBoundaryFuture(params: PutRolePermissionsBoundaryRequest): Future[js.Object] =
      service.putRolePermissionsBoundary(params).promise.toFuture
    def putRolePolicyFuture(params: PutRolePolicyRequest): Future[js.Object] =
      service.putRolePolicy(params).promise.toFuture
    def putUserPermissionsBoundaryFuture(params: PutUserPermissionsBoundaryRequest): Future[js.Object] =
      service.putUserPermissionsBoundary(params).promise.toFuture
    def putUserPolicyFuture(params: PutUserPolicyRequest): Future[js.Object] =
      service.putUserPolicy(params).promise.toFuture
    def removeClientIDFromOpenIDConnectProviderFuture(
        params: RemoveClientIDFromOpenIDConnectProviderRequest
    ): Future[js.Object] = service.removeClientIDFromOpenIDConnectProvider(params).promise.toFuture
    def removeRoleFromInstanceProfileFuture(params: RemoveRoleFromInstanceProfileRequest): Future[js.Object] =
      service.removeRoleFromInstanceProfile(params).promise.toFuture
    def removeUserFromGroupFuture(params: RemoveUserFromGroupRequest): Future[js.Object] =
      service.removeUserFromGroup(params).promise.toFuture
    def resetServiceSpecificCredentialFuture(
        params: ResetServiceSpecificCredentialRequest
    ): Future[ResetServiceSpecificCredentialResponse] = service.resetServiceSpecificCredential(params).promise.toFuture
    def resyncMFADeviceFuture(params: ResyncMFADeviceRequest): Future[js.Object] =
      service.resyncMFADevice(params).promise.toFuture
    def setDefaultPolicyVersionFuture(params: SetDefaultPolicyVersionRequest): Future[js.Object] =
      service.setDefaultPolicyVersion(params).promise.toFuture
    def setSecurityTokenServicePreferencesFuture(params: SetSecurityTokenServicePreferencesRequest): Future[js.Object] =
      service.setSecurityTokenServicePreferences(params).promise.toFuture
    def simulateCustomPolicyFuture(params: SimulateCustomPolicyRequest): Future[SimulatePolicyResponse] =
      service.simulateCustomPolicy(params).promise.toFuture
    def simulatePrincipalPolicyFuture(params: SimulatePrincipalPolicyRequest): Future[SimulatePolicyResponse] =
      service.simulatePrincipalPolicy(params).promise.toFuture
    def tagRoleFuture(params: TagRoleRequest): Future[js.Object]     = service.tagRole(params).promise.toFuture
    def tagUserFuture(params: TagUserRequest): Future[js.Object]     = service.tagUser(params).promise.toFuture
    def untagRoleFuture(params: UntagRoleRequest): Future[js.Object] = service.untagRole(params).promise.toFuture
    def untagUserFuture(params: UntagUserRequest): Future[js.Object] = service.untagUser(params).promise.toFuture
    def updateAccessKeyFuture(params: UpdateAccessKeyRequest): Future[js.Object] =
      service.updateAccessKey(params).promise.toFuture
    def updateAccountPasswordPolicyFuture(params: UpdateAccountPasswordPolicyRequest): Future[js.Object] =
      service.updateAccountPasswordPolicy(params).promise.toFuture
    def updateAssumeRolePolicyFuture(params: UpdateAssumeRolePolicyRequest): Future[js.Object] =
      service.updateAssumeRolePolicy(params).promise.toFuture
    def updateGroupFuture(params: UpdateGroupRequest): Future[js.Object] = service.updateGroup(params).promise.toFuture
    def updateLoginProfileFuture(params: UpdateLoginProfileRequest): Future[js.Object] =
      service.updateLoginProfile(params).promise.toFuture
    def updateOpenIDConnectProviderThumbprintFuture(
        params: UpdateOpenIDConnectProviderThumbprintRequest
    ): Future[js.Object] = service.updateOpenIDConnectProviderThumbprint(params).promise.toFuture
    def updateRoleDescriptionFuture(params: UpdateRoleDescriptionRequest): Future[UpdateRoleDescriptionResponse] =
      service.updateRoleDescription(params).promise.toFuture
    def updateRoleFuture(params: UpdateRoleRequest): Future[UpdateRoleResponse] =
      service.updateRole(params).promise.toFuture
    def updateSAMLProviderFuture(params: UpdateSAMLProviderRequest): Future[UpdateSAMLProviderResponse] =
      service.updateSAMLProvider(params).promise.toFuture
    def updateSSHPublicKeyFuture(params: UpdateSSHPublicKeyRequest): Future[js.Object] =
      service.updateSSHPublicKey(params).promise.toFuture
    def updateServerCertificateFuture(params: UpdateServerCertificateRequest): Future[js.Object] =
      service.updateServerCertificate(params).promise.toFuture
    def updateServiceSpecificCredentialFuture(params: UpdateServiceSpecificCredentialRequest): Future[js.Object] =
      service.updateServiceSpecificCredential(params).promise.toFuture
    def updateSigningCertificateFuture(params: UpdateSigningCertificateRequest): Future[js.Object] =
      service.updateSigningCertificate(params).promise.toFuture
    def updateUserFuture(params: UpdateUserRequest): Future[js.Object] = service.updateUser(params).promise.toFuture
    def uploadSSHPublicKeyFuture(params: UploadSSHPublicKeyRequest): Future[UploadSSHPublicKeyResponse] =
      service.uploadSSHPublicKey(params).promise.toFuture
    def uploadServerCertificateFuture(params: UploadServerCertificateRequest): Future[UploadServerCertificateResponse] =
      service.uploadServerCertificate(params).promise.toFuture
    def uploadSigningCertificateFuture(
        params: UploadSigningCertificateRequest
    ): Future[UploadSigningCertificateResponse] = service.uploadSigningCertificate(params).promise.toFuture
  }
}

package iam {
  @js.native
  @JSImport("aws-sdk", "IAM")
  class IAM() extends js.Object {
    def this(config: AWSConfig) = this()

    def addClientIDToOpenIDConnectProvider(params: AddClientIDToOpenIDConnectProviderRequest): Request[js.Object] =
      js.native
    def addRoleToInstanceProfile(params: AddRoleToInstanceProfileRequest): Request[js.Object]               = js.native
    def addUserToGroup(params: AddUserToGroupRequest): Request[js.Object]                                   = js.native
    def attachGroupPolicy(params: AttachGroupPolicyRequest): Request[js.Object]                             = js.native
    def attachRolePolicy(params: AttachRolePolicyRequest): Request[js.Object]                               = js.native
    def attachUserPolicy(params: AttachUserPolicyRequest): Request[js.Object]                               = js.native
    def changePassword(params: ChangePasswordRequest): Request[js.Object]                                   = js.native
    def createAccessKey(params: CreateAccessKeyRequest): Request[CreateAccessKeyResponse]                   = js.native
    def createAccountAlias(params: CreateAccountAliasRequest): Request[js.Object]                           = js.native
    def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse]                               = js.native
    def createInstanceProfile(params: CreateInstanceProfileRequest): Request[CreateInstanceProfileResponse] = js.native
    def createLoginProfile(params: CreateLoginProfileRequest): Request[CreateLoginProfileResponse]          = js.native
    def createOpenIDConnectProvider(
        params: CreateOpenIDConnectProviderRequest
    ): Request[CreateOpenIDConnectProviderResponse]                                                   = js.native
    def createPolicy(params: CreatePolicyRequest): Request[CreatePolicyResponse]                      = js.native
    def createPolicyVersion(params: CreatePolicyVersionRequest): Request[CreatePolicyVersionResponse] = js.native
    def createRole(params: CreateRoleRequest): Request[CreateRoleResponse]                            = js.native
    def createSAMLProvider(params: CreateSAMLProviderRequest): Request[CreateSAMLProviderResponse]    = js.native
    def createServiceLinkedRole(params: CreateServiceLinkedRoleRequest): Request[CreateServiceLinkedRoleResponse] =
      js.native
    def createServiceSpecificCredential(
        params: CreateServiceSpecificCredentialRequest
    ): Request[CreateServiceSpecificCredentialResponse]                    = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse] = js.native
    def createVirtualMFADevice(params: CreateVirtualMFADeviceRequest): Request[CreateVirtualMFADeviceResponse] =
      js.native
    def deactivateMFADevice(params: DeactivateMFADeviceRequest): Request[js.Object]                     = js.native
    def deleteAccessKey(params: DeleteAccessKeyRequest): Request[js.Object]                             = js.native
    def deleteAccountAlias(params: DeleteAccountAliasRequest): Request[js.Object]                       = js.native
    def deleteAccountPasswordPolicy(): Request[js.Object]                                               = js.native
    def deleteGroup(params: DeleteGroupRequest): Request[js.Object]                                     = js.native
    def deleteGroupPolicy(params: DeleteGroupPolicyRequest): Request[js.Object]                         = js.native
    def deleteInstanceProfile(params: DeleteInstanceProfileRequest): Request[js.Object]                 = js.native
    def deleteLoginProfile(params: DeleteLoginProfileRequest): Request[js.Object]                       = js.native
    def deleteOpenIDConnectProvider(params: DeleteOpenIDConnectProviderRequest): Request[js.Object]     = js.native
    def deletePolicy(params: DeletePolicyRequest): Request[js.Object]                                   = js.native
    def deletePolicyVersion(params: DeletePolicyVersionRequest): Request[js.Object]                     = js.native
    def deleteRole(params: DeleteRoleRequest): Request[js.Object]                                       = js.native
    def deleteRolePermissionsBoundary(params: DeleteRolePermissionsBoundaryRequest): Request[js.Object] = js.native
    def deleteRolePolicy(params: DeleteRolePolicyRequest): Request[js.Object]                           = js.native
    def deleteSAMLProvider(params: DeleteSAMLProviderRequest): Request[js.Object]                       = js.native
    def deleteSSHPublicKey(params: DeleteSSHPublicKeyRequest): Request[js.Object]                       = js.native
    def deleteServerCertificate(params: DeleteServerCertificateRequest): Request[js.Object]             = js.native
    def deleteServiceLinkedRole(params: DeleteServiceLinkedRoleRequest): Request[DeleteServiceLinkedRoleResponse] =
      js.native
    def deleteServiceSpecificCredential(params: DeleteServiceSpecificCredentialRequest): Request[js.Object] = js.native
    def deleteSigningCertificate(params: DeleteSigningCertificateRequest): Request[js.Object]               = js.native
    def deleteUser(params: DeleteUserRequest): Request[js.Object]                                           = js.native
    def deleteUserPermissionsBoundary(params: DeleteUserPermissionsBoundaryRequest): Request[js.Object]     = js.native
    def deleteUserPolicy(params: DeleteUserPolicyRequest): Request[js.Object]                               = js.native
    def deleteVirtualMFADevice(params: DeleteVirtualMFADeviceRequest): Request[js.Object]                   = js.native
    def detachGroupPolicy(params: DetachGroupPolicyRequest): Request[js.Object]                             = js.native
    def detachRolePolicy(params: DetachRolePolicyRequest): Request[js.Object]                               = js.native
    def detachUserPolicy(params: DetachUserPolicyRequest): Request[js.Object]                               = js.native
    def enableMFADevice(params: EnableMFADeviceRequest): Request[js.Object]                                 = js.native
    def generateCredentialReport(): Request[GenerateCredentialReportResponse]                               = js.native
    def generateOrganizationsAccessReport(
        params: GenerateOrganizationsAccessReportRequest
    ): Request[GenerateOrganizationsAccessReportResponse] = js.native
    def generateServiceLastAccessedDetails(
        params: GenerateServiceLastAccessedDetailsRequest
    ): Request[GenerateServiceLastAccessedDetailsResponse]                                               = js.native
    def getAccessKeyLastUsed(params: GetAccessKeyLastUsedRequest): Request[GetAccessKeyLastUsedResponse] = js.native
    def getAccountAuthorizationDetails(
        params: GetAccountAuthorizationDetailsRequest
    ): Request[GetAccountAuthorizationDetailsResponse]                        = js.native
    def getAccountPasswordPolicy(): Request[GetAccountPasswordPolicyResponse] = js.native
    def getAccountSummary(): Request[GetAccountSummaryResponse]               = js.native
    def getContextKeysForCustomPolicy(
        params: GetContextKeysForCustomPolicyRequest
    ): Request[GetContextKeysForPolicyResponse] = js.native
    def getContextKeysForPrincipalPolicy(
        params: GetContextKeysForPrincipalPolicyRequest
    ): Request[GetContextKeysForPolicyResponse]                                                    = js.native
    def getCredentialReport(): Request[GetCredentialReportResponse]                                = js.native
    def getGroup(params: GetGroupRequest): Request[GetGroupResponse]                               = js.native
    def getGroupPolicy(params: GetGroupPolicyRequest): Request[GetGroupPolicyResponse]             = js.native
    def getInstanceProfile(params: GetInstanceProfileRequest): Request[GetInstanceProfileResponse] = js.native
    def getLoginProfile(params: GetLoginProfileRequest): Request[GetLoginProfileResponse]          = js.native
    def getOpenIDConnectProvider(params: GetOpenIDConnectProviderRequest): Request[GetOpenIDConnectProviderResponse] =
      js.native
    def getOrganizationsAccessReport(
        params: GetOrganizationsAccessReportRequest
    ): Request[GetOrganizationsAccessReportResponse]                                                     = js.native
    def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse]                                  = js.native
    def getPolicyVersion(params: GetPolicyVersionRequest): Request[GetPolicyVersionResponse]             = js.native
    def getRole(params: GetRoleRequest): Request[GetRoleResponse]                                        = js.native
    def getRolePolicy(params: GetRolePolicyRequest): Request[GetRolePolicyResponse]                      = js.native
    def getSAMLProvider(params: GetSAMLProviderRequest): Request[GetSAMLProviderResponse]                = js.native
    def getSSHPublicKey(params: GetSSHPublicKeyRequest): Request[GetSSHPublicKeyResponse]                = js.native
    def getServerCertificate(params: GetServerCertificateRequest): Request[GetServerCertificateResponse] = js.native
    def getServiceLastAccessedDetails(
        params: GetServiceLastAccessedDetailsRequest
    ): Request[GetServiceLastAccessedDetailsResponse] = js.native
    def getServiceLastAccessedDetailsWithEntities(
        params: GetServiceLastAccessedDetailsWithEntitiesRequest
    ): Request[GetServiceLastAccessedDetailsWithEntitiesResponse] = js.native
    def getServiceLinkedRoleDeletionStatus(
        params: GetServiceLinkedRoleDeletionStatusRequest
    ): Request[GetServiceLinkedRoleDeletionStatusResponse]                                         = js.native
    def getUser(params: GetUserRequest): Request[GetUserResponse]                                  = js.native
    def getUserPolicy(params: GetUserPolicyRequest): Request[GetUserPolicyResponse]                = js.native
    def listAccessKeys(params: ListAccessKeysRequest): Request[ListAccessKeysResponse]             = js.native
    def listAccountAliases(params: ListAccountAliasesRequest): Request[ListAccountAliasesResponse] = js.native
    def listAttachedGroupPolicies(
        params: ListAttachedGroupPoliciesRequest
    ): Request[ListAttachedGroupPoliciesResponse] = js.native
    def listAttachedRolePolicies(params: ListAttachedRolePoliciesRequest): Request[ListAttachedRolePoliciesResponse] =
      js.native
    def listAttachedUserPolicies(params: ListAttachedUserPoliciesRequest): Request[ListAttachedUserPoliciesResponse] =
      js.native
    def listEntitiesForPolicy(params: ListEntitiesForPolicyRequest): Request[ListEntitiesForPolicyResponse] = js.native
    def listGroupPolicies(params: ListGroupPoliciesRequest): Request[ListGroupPoliciesResponse]             = js.native
    def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse]                                  = js.native
    def listGroupsForUser(params: ListGroupsForUserRequest): Request[ListGroupsForUserResponse]             = js.native
    def listInstanceProfiles(params: ListInstanceProfilesRequest): Request[ListInstanceProfilesResponse]    = js.native
    def listInstanceProfilesForRole(
        params: ListInstanceProfilesForRoleRequest
    ): Request[ListInstanceProfilesForRoleResponse]                                    = js.native
    def listMFADevices(params: ListMFADevicesRequest): Request[ListMFADevicesResponse] = js.native
    def listOpenIDConnectProviders(
        params: ListOpenIDConnectProvidersRequest
    ): Request[ListOpenIDConnectProvidersResponse]                               = js.native
    def listPolicies(params: ListPoliciesRequest): Request[ListPoliciesResponse] = js.native
    def listPoliciesGrantingServiceAccess(
        params: ListPoliciesGrantingServiceAccessRequest
    ): Request[ListPoliciesGrantingServiceAccessResponse]                                          = js.native
    def listPolicyVersions(params: ListPolicyVersionsRequest): Request[ListPolicyVersionsResponse] = js.native
    def listRolePolicies(params: ListRolePoliciesRequest): Request[ListRolePoliciesResponse]       = js.native
    def listRoleTags(params: ListRoleTagsRequest): Request[ListRoleTagsResponse]                   = js.native
    def listRoles(params: ListRolesRequest): Request[ListRolesResponse]                            = js.native
    def listSAMLProviders(params: ListSAMLProvidersRequest): Request[ListSAMLProvidersResponse]    = js.native
    def listSSHPublicKeys(params: ListSSHPublicKeysRequest): Request[ListSSHPublicKeysResponse]    = js.native
    def listServerCertificates(params: ListServerCertificatesRequest): Request[ListServerCertificatesResponse] =
      js.native
    def listServiceSpecificCredentials(
        params: ListServiceSpecificCredentialsRequest
    ): Request[ListServiceSpecificCredentialsResponse] = js.native
    def listSigningCertificates(params: ListSigningCertificatesRequest): Request[ListSigningCertificatesResponse] =
      js.native
    def listUserPolicies(params: ListUserPoliciesRequest): Request[ListUserPoliciesResponse]                = js.native
    def listUserTags(params: ListUserTagsRequest): Request[ListUserTagsResponse]                            = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse]                                     = js.native
    def listVirtualMFADevices(params: ListVirtualMFADevicesRequest): Request[ListVirtualMFADevicesResponse] = js.native
    def putGroupPolicy(params: PutGroupPolicyRequest): Request[js.Object]                                   = js.native
    def putRolePermissionsBoundary(params: PutRolePermissionsBoundaryRequest): Request[js.Object]           = js.native
    def putRolePolicy(params: PutRolePolicyRequest): Request[js.Object]                                     = js.native
    def putUserPermissionsBoundary(params: PutUserPermissionsBoundaryRequest): Request[js.Object]           = js.native
    def putUserPolicy(params: PutUserPolicyRequest): Request[js.Object]                                     = js.native
    def removeClientIDFromOpenIDConnectProvider(
        params: RemoveClientIDFromOpenIDConnectProviderRequest
    ): Request[js.Object]                                                                               = js.native
    def removeRoleFromInstanceProfile(params: RemoveRoleFromInstanceProfileRequest): Request[js.Object] = js.native
    def removeUserFromGroup(params: RemoveUserFromGroupRequest): Request[js.Object]                     = js.native
    def resetServiceSpecificCredential(
        params: ResetServiceSpecificCredentialRequest
    ): Request[ResetServiceSpecificCredentialResponse]                                      = js.native
    def resyncMFADevice(params: ResyncMFADeviceRequest): Request[js.Object]                 = js.native
    def setDefaultPolicyVersion(params: SetDefaultPolicyVersionRequest): Request[js.Object] = js.native
    def setSecurityTokenServicePreferences(params: SetSecurityTokenServicePreferencesRequest): Request[js.Object] =
      js.native
    def simulateCustomPolicy(params: SimulateCustomPolicyRequest): Request[SimulatePolicyResponse]       = js.native
    def simulatePrincipalPolicy(params: SimulatePrincipalPolicyRequest): Request[SimulatePolicyResponse] = js.native
    def tagRole(params: TagRoleRequest): Request[js.Object]                                              = js.native
    def tagUser(params: TagUserRequest): Request[js.Object]                                              = js.native
    def untagRole(params: UntagRoleRequest): Request[js.Object]                                          = js.native
    def untagUser(params: UntagUserRequest): Request[js.Object]                                          = js.native
    def updateAccessKey(params: UpdateAccessKeyRequest): Request[js.Object]                              = js.native
    def updateAccountPasswordPolicy(params: UpdateAccountPasswordPolicyRequest): Request[js.Object]      = js.native
    def updateAssumeRolePolicy(params: UpdateAssumeRolePolicyRequest): Request[js.Object]                = js.native
    def updateGroup(params: UpdateGroupRequest): Request[js.Object]                                      = js.native
    def updateLoginProfile(params: UpdateLoginProfileRequest): Request[js.Object]                        = js.native
    def updateOpenIDConnectProviderThumbprint(
        params: UpdateOpenIDConnectProviderThumbprintRequest
    ): Request[js.Object]                                                                                   = js.native
    def updateRole(params: UpdateRoleRequest): Request[UpdateRoleResponse]                                  = js.native
    def updateRoleDescription(params: UpdateRoleDescriptionRequest): Request[UpdateRoleDescriptionResponse] = js.native
    def updateSAMLProvider(params: UpdateSAMLProviderRequest): Request[UpdateSAMLProviderResponse]          = js.native
    def updateSSHPublicKey(params: UpdateSSHPublicKeyRequest): Request[js.Object]                           = js.native
    def updateServerCertificate(params: UpdateServerCertificateRequest): Request[js.Object]                 = js.native
    def updateServiceSpecificCredential(params: UpdateServiceSpecificCredentialRequest): Request[js.Object] = js.native
    def updateSigningCertificate(params: UpdateSigningCertificateRequest): Request[js.Object]               = js.native
    def updateUser(params: UpdateUserRequest): Request[js.Object]                                           = js.native
    def uploadSSHPublicKey(params: UploadSSHPublicKeyRequest): Request[UploadSSHPublicKeyResponse]          = js.native
    def uploadServerCertificate(params: UploadServerCertificateRequest): Request[UploadServerCertificateResponse] =
      js.native
    def uploadSigningCertificate(params: UploadSigningCertificateRequest): Request[UploadSigningCertificateResponse] =
      js.native
  }

  /**
    * An object that contains details about when a principal in the reported AWS Organizations entity last attempted to access an AWS service. A principal can be an IAM user, an IAM role, or the AWS account root user within the reported Organizations entity.
    *  This data type is a response element in the <a>GetOrganizationsAccessReport</a> operation.
    */
  @js.native
  trait AccessDetail extends js.Object {
    var ServiceName: serviceNameType
    var ServiceNamespace: serviceNamespaceType
    var EntityPath: js.UndefOr[organizationsEntityPathType]
    var LastAuthenticatedTime: js.UndefOr[dateType]
    var Region: js.UndefOr[stringType]
    var TotalAuthenticatedEntities: js.UndefOr[integerType]
  }

  object AccessDetail {
    def apply(
        ServiceName: serviceNameType,
        ServiceNamespace: serviceNamespaceType,
        EntityPath: js.UndefOr[organizationsEntityPathType] = js.undefined,
        LastAuthenticatedTime: js.UndefOr[dateType] = js.undefined,
        Region: js.UndefOr[stringType] = js.undefined,
        TotalAuthenticatedEntities: js.UndefOr[integerType] = js.undefined
    ): AccessDetail = {
      val __obj = js.Dictionary[js.Any](
        "ServiceName"      -> ServiceName.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any]
      )

      EntityPath.foreach(__v => __obj.update("EntityPath", __v.asInstanceOf[js.Any]))
      LastAuthenticatedTime.foreach(__v => __obj.update("LastAuthenticatedTime", __v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.update("Region", __v.asInstanceOf[js.Any]))
      TotalAuthenticatedEntities.foreach(__v => __obj.update("TotalAuthenticatedEntities", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessDetail]
    }
  }

  /**
    * Contains information about an AWS access key.
    *  This data type is used as a response element in the <a>CreateAccessKey</a> and <a>ListAccessKeys</a> operations.
    *
    * '''Note:'''The <code>SecretAccessKey</code> value is returned only in response to <a>CreateAccessKey</a>. You can get a secret access key only when you first create an access key; you cannot recover the secret access key later. If you lose a secret access key, you must create a new access key.
    */
  @js.native
  trait AccessKey extends js.Object {
    var AccessKeyId: accessKeyIdType
    var SecretAccessKey: accessKeySecretType
    var Status: statusType
    var UserName: userNameType
    var CreateDate: js.UndefOr[dateType]
  }

  object AccessKey {
    def apply(
        AccessKeyId: accessKeyIdType,
        SecretAccessKey: accessKeySecretType,
        Status: statusType,
        UserName: userNameType,
        CreateDate: js.UndefOr[dateType] = js.undefined
    ): AccessKey = {
      val __obj = js.Dictionary[js.Any](
        "AccessKeyId"     -> AccessKeyId.asInstanceOf[js.Any],
        "SecretAccessKey" -> SecretAccessKey.asInstanceOf[js.Any],
        "Status"          -> Status.asInstanceOf[js.Any],
        "UserName"        -> UserName.asInstanceOf[js.Any]
      )

      CreateDate.foreach(__v => __obj.update("CreateDate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessKey]
    }
  }

  /**
    * Contains information about the last time an AWS access key was used since IAM began tracking this information on April 22, 2015.
    *  This data type is used as a response element in the <a>GetAccessKeyLastUsed</a> operation.
    */
  @js.native
  trait AccessKeyLastUsed extends js.Object {
    var LastUsedDate: dateType
    var Region: stringType
    var ServiceName: stringType
  }

  object AccessKeyLastUsed {
    def apply(
        LastUsedDate: dateType,
        Region: stringType,
        ServiceName: stringType
    ): AccessKeyLastUsed = {
      val __obj = js.Dictionary[js.Any](
        "LastUsedDate" -> LastUsedDate.asInstanceOf[js.Any],
        "Region"       -> Region.asInstanceOf[js.Any],
        "ServiceName"  -> ServiceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AccessKeyLastUsed]
    }
  }

  /**
    * Contains information about an AWS access key, without its secret key.
    *  This data type is used as a response element in the <a>ListAccessKeys</a> operation.
    */
  @js.native
  trait AccessKeyMetadata extends js.Object {
    var AccessKeyId: js.UndefOr[accessKeyIdType]
    var CreateDate: js.UndefOr[dateType]
    var Status: js.UndefOr[statusType]
    var UserName: js.UndefOr[userNameType]
  }

  object AccessKeyMetadata {
    def apply(
        AccessKeyId: js.UndefOr[accessKeyIdType] = js.undefined,
        CreateDate: js.UndefOr[dateType] = js.undefined,
        Status: js.UndefOr[statusType] = js.undefined,
        UserName: js.UndefOr[userNameType] = js.undefined
    ): AccessKeyMetadata = {
      val __obj = js.Dictionary.empty[js.Any]
      AccessKeyId.foreach(__v => __obj.update("AccessKeyId", __v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.update("CreateDate", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessKeyMetadata]
    }
  }

  @js.native
  trait AddClientIDToOpenIDConnectProviderRequest extends js.Object {
    var ClientID: clientIDType
    var OpenIDConnectProviderArn: arnType
  }

  object AddClientIDToOpenIDConnectProviderRequest {
    def apply(
        ClientID: clientIDType,
        OpenIDConnectProviderArn: arnType
    ): AddClientIDToOpenIDConnectProviderRequest = {
      val __obj = js.Dictionary[js.Any](
        "ClientID"                 -> ClientID.asInstanceOf[js.Any],
        "OpenIDConnectProviderArn" -> OpenIDConnectProviderArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddClientIDToOpenIDConnectProviderRequest]
    }
  }

  @js.native
  trait AddRoleToInstanceProfileRequest extends js.Object {
    var InstanceProfileName: instanceProfileNameType
    var RoleName: roleNameType
  }

  object AddRoleToInstanceProfileRequest {
    def apply(
        InstanceProfileName: instanceProfileNameType,
        RoleName: roleNameType
    ): AddRoleToInstanceProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceProfileName" -> InstanceProfileName.asInstanceOf[js.Any],
        "RoleName"            -> RoleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddRoleToInstanceProfileRequest]
    }
  }

  @js.native
  trait AddUserToGroupRequest extends js.Object {
    var GroupName: groupNameType
    var UserName: existingUserNameType
  }

  object AddUserToGroupRequest {
    def apply(
        GroupName: groupNameType,
        UserName: existingUserNameType
    ): AddUserToGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "UserName"  -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddUserToGroupRequest]
    }
  }

  @js.native
  trait AttachGroupPolicyRequest extends js.Object {
    var GroupName: groupNameType
    var PolicyArn: arnType
  }

  object AttachGroupPolicyRequest {
    def apply(
        GroupName: groupNameType,
        PolicyArn: arnType
    ): AttachGroupPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "PolicyArn" -> PolicyArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttachGroupPolicyRequest]
    }
  }

  @js.native
  trait AttachRolePolicyRequest extends js.Object {
    var PolicyArn: arnType
    var RoleName: roleNameType
  }

  object AttachRolePolicyRequest {
    def apply(
        PolicyArn: arnType,
        RoleName: roleNameType
    ): AttachRolePolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyArn" -> PolicyArn.asInstanceOf[js.Any],
        "RoleName"  -> RoleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttachRolePolicyRequest]
    }
  }

  @js.native
  trait AttachUserPolicyRequest extends js.Object {
    var PolicyArn: arnType
    var UserName: userNameType
  }

  object AttachUserPolicyRequest {
    def apply(
        PolicyArn: arnType,
        UserName: userNameType
    ): AttachUserPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyArn" -> PolicyArn.asInstanceOf[js.Any],
        "UserName"  -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttachUserPolicyRequest]
    }
  }

  /**
    * Contains information about an attached permissions boundary.
    *  An attached permissions boundary is a managed policy that has been attached to a user or role to set the permissions boundary.
    *  For more information about permissions boundaries, see [[https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html|Permissions Boundaries for IAM Identities ]] in the <i>IAM User Guide</i>.
    */
  @js.native
  trait AttachedPermissionsBoundary extends js.Object {
    var PermissionsBoundaryArn: js.UndefOr[arnType]
    var PermissionsBoundaryType: js.UndefOr[PermissionsBoundaryAttachmentType]
  }

  object AttachedPermissionsBoundary {
    def apply(
        PermissionsBoundaryArn: js.UndefOr[arnType] = js.undefined,
        PermissionsBoundaryType: js.UndefOr[PermissionsBoundaryAttachmentType] = js.undefined
    ): AttachedPermissionsBoundary = {
      val __obj = js.Dictionary.empty[js.Any]
      PermissionsBoundaryArn.foreach(__v => __obj.update("PermissionsBoundaryArn", __v.asInstanceOf[js.Any]))
      PermissionsBoundaryType.foreach(__v => __obj.update("PermissionsBoundaryType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachedPermissionsBoundary]
    }
  }

  /**
    * Contains information about an attached policy.
    *  An attached policy is a managed policy that has been attached to a user, group, or role. This data type is used as a response element in the <a>ListAttachedGroupPolicies</a>, <a>ListAttachedRolePolicies</a>, <a>ListAttachedUserPolicies</a>, and <a>GetAccountAuthorizationDetails</a> operations.
    *  For more information about managed policies, refer to [[https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html|Managed Policies and Inline Policies]] in the <i>Using IAM</i> guide.
    */
  @js.native
  trait AttachedPolicy extends js.Object {
    var PolicyArn: js.UndefOr[arnType]
    var PolicyName: js.UndefOr[policyNameType]
  }

  object AttachedPolicy {
    def apply(
        PolicyArn: js.UndefOr[arnType] = js.undefined,
        PolicyName: js.UndefOr[policyNameType] = js.undefined
    ): AttachedPolicy = {
      val __obj = js.Dictionary.empty[js.Any]
      PolicyArn.foreach(__v => __obj.update("PolicyArn", __v.asInstanceOf[js.Any]))
      PolicyName.foreach(__v => __obj.update("PolicyName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachedPolicy]
    }
  }

  @js.native
  trait ChangePasswordRequest extends js.Object {
    var NewPassword: passwordType
    var OldPassword: passwordType
  }

  object ChangePasswordRequest {
    def apply(
        NewPassword: passwordType,
        OldPassword: passwordType
    ): ChangePasswordRequest = {
      val __obj = js.Dictionary[js.Any](
        "NewPassword" -> NewPassword.asInstanceOf[js.Any],
        "OldPassword" -> OldPassword.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ChangePasswordRequest]
    }
  }

  /**
    * Contains information about a condition context key. It includes the name of the key and specifies the value (or values, if the context key supports multiple values) to use in the simulation. This information is used when evaluating the <code>Condition</code> elements of the input policies.
    *  This data type is used as an input parameter to <code> <a>SimulateCustomPolicy</a> </code> and <code> <a>SimulateCustomPolicy</a> </code>.
    */
  @js.native
  trait ContextEntry extends js.Object {
    var ContextKeyName: js.UndefOr[ContextKeyNameType]
    var ContextKeyType: js.UndefOr[ContextKeyTypeEnum]
    var ContextKeyValues: js.UndefOr[ContextKeyValueListType]
  }

  object ContextEntry {
    def apply(
        ContextKeyName: js.UndefOr[ContextKeyNameType] = js.undefined,
        ContextKeyType: js.UndefOr[ContextKeyTypeEnum] = js.undefined,
        ContextKeyValues: js.UndefOr[ContextKeyValueListType] = js.undefined
    ): ContextEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      ContextKeyName.foreach(__v => __obj.update("ContextKeyName", __v.asInstanceOf[js.Any]))
      ContextKeyType.foreach(__v => __obj.update("ContextKeyType", __v.asInstanceOf[js.Any]))
      ContextKeyValues.foreach(__v => __obj.update("ContextKeyValues", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContextEntry]
    }
  }

  object ContextKeyTypeEnumEnum {
    val string      = "string"
    val stringList  = "stringList"
    val numeric     = "numeric"
    val numericList = "numericList"
    val boolean     = "boolean"
    val booleanList = "booleanList"
    val ip          = "ip"
    val ipList      = "ipList"
    val binary      = "binary"
    val binaryList  = "binaryList"
    val date        = "date"
    val dateList    = "dateList"

    val values = js.Object.freeze(
      js.Array(
        string,
        stringList,
        numeric,
        numericList,
        boolean,
        booleanList,
        ip,
        ipList,
        binary,
        binaryList,
        date,
        dateList
      )
    )
  }

  @js.native
  trait CreateAccessKeyRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
  }

  object CreateAccessKeyRequest {
    def apply(
        UserName: js.UndefOr[existingUserNameType] = js.undefined
    ): CreateAccessKeyRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccessKeyRequest]
    }
  }

  /**
    * Contains the response to a successful <a>CreateAccessKey</a> request.
    */
  @js.native
  trait CreateAccessKeyResponse extends js.Object {
    var AccessKey: AccessKey
  }

  object CreateAccessKeyResponse {
    def apply(
        AccessKey: AccessKey
    ): CreateAccessKeyResponse = {
      val __obj = js.Dictionary[js.Any](
        "AccessKey" -> AccessKey.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateAccessKeyResponse]
    }
  }

  @js.native
  trait CreateAccountAliasRequest extends js.Object {
    var AccountAlias: accountAliasType
  }

  object CreateAccountAliasRequest {
    def apply(
        AccountAlias: accountAliasType
    ): CreateAccountAliasRequest = {
      val __obj = js.Dictionary[js.Any](
        "AccountAlias" -> AccountAlias.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateAccountAliasRequest]
    }
  }

  @js.native
  trait CreateGroupRequest extends js.Object {
    var GroupName: groupNameType
    var Path: js.UndefOr[pathType]
  }

  object CreateGroupRequest {
    def apply(
        GroupName: groupNameType,
        Path: js.UndefOr[pathType] = js.undefined
    ): CreateGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "GroupName" -> GroupName.asInstanceOf[js.Any]
      )

      Path.foreach(__v => __obj.update("Path", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupRequest]
    }
  }

  /**
    * Contains the response to a successful <a>CreateGroup</a> request.
    */
  @js.native
  trait CreateGroupResponse extends js.Object {
    var Group: Group
  }

  object CreateGroupResponse {
    def apply(
        Group: Group
    ): CreateGroupResponse = {
      val __obj = js.Dictionary[js.Any](
        "Group" -> Group.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateGroupResponse]
    }
  }

  @js.native
  trait CreateInstanceProfileRequest extends js.Object {
    var InstanceProfileName: instanceProfileNameType
    var Path: js.UndefOr[pathType]
  }

  object CreateInstanceProfileRequest {
    def apply(
        InstanceProfileName: instanceProfileNameType,
        Path: js.UndefOr[pathType] = js.undefined
    ): CreateInstanceProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceProfileName" -> InstanceProfileName.asInstanceOf[js.Any]
      )

      Path.foreach(__v => __obj.update("Path", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInstanceProfileRequest]
    }
  }

  /**
    * Contains the response to a successful <a>CreateInstanceProfile</a> request.
    */
  @js.native
  trait CreateInstanceProfileResponse extends js.Object {
    var InstanceProfile: InstanceProfile
  }

  object CreateInstanceProfileResponse {
    def apply(
        InstanceProfile: InstanceProfile
    ): CreateInstanceProfileResponse = {
      val __obj = js.Dictionary[js.Any](
        "InstanceProfile" -> InstanceProfile.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateInstanceProfileResponse]
    }
  }

  @js.native
  trait CreateLoginProfileRequest extends js.Object {
    var Password: passwordType
    var UserName: userNameType
    var PasswordResetRequired: js.UndefOr[booleanType]
  }

  object CreateLoginProfileRequest {
    def apply(
        Password: passwordType,
        UserName: userNameType,
        PasswordResetRequired: js.UndefOr[booleanType] = js.undefined
    ): CreateLoginProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "Password" -> Password.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      PasswordResetRequired.foreach(__v => __obj.update("PasswordResetRequired", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLoginProfileRequest]
    }
  }

  /**
    * Contains the response to a successful <a>CreateLoginProfile</a> request.
    */
  @js.native
  trait CreateLoginProfileResponse extends js.Object {
    var LoginProfile: LoginProfile
  }

  object CreateLoginProfileResponse {
    def apply(
        LoginProfile: LoginProfile
    ): CreateLoginProfileResponse = {
      val __obj = js.Dictionary[js.Any](
        "LoginProfile" -> LoginProfile.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateLoginProfileResponse]
    }
  }

  @js.native
  trait CreateOpenIDConnectProviderRequest extends js.Object {
    var ThumbprintList: thumbprintListType
    var Url: OpenIDConnectProviderUrlType
    var ClientIDList: js.UndefOr[clientIDListType]
  }

  object CreateOpenIDConnectProviderRequest {
    def apply(
        ThumbprintList: thumbprintListType,
        Url: OpenIDConnectProviderUrlType,
        ClientIDList: js.UndefOr[clientIDListType] = js.undefined
    ): CreateOpenIDConnectProviderRequest = {
      val __obj = js.Dictionary[js.Any](
        "ThumbprintList" -> ThumbprintList.asInstanceOf[js.Any],
        "Url"            -> Url.asInstanceOf[js.Any]
      )

      ClientIDList.foreach(__v => __obj.update("ClientIDList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOpenIDConnectProviderRequest]
    }
  }

  /**
    * Contains the response to a successful <a>CreateOpenIDConnectProvider</a> request.
    */
  @js.native
  trait CreateOpenIDConnectProviderResponse extends js.Object {
    var OpenIDConnectProviderArn: js.UndefOr[arnType]
  }

  object CreateOpenIDConnectProviderResponse {
    def apply(
        OpenIDConnectProviderArn: js.UndefOr[arnType] = js.undefined
    ): CreateOpenIDConnectProviderResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      OpenIDConnectProviderArn.foreach(__v => __obj.update("OpenIDConnectProviderArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOpenIDConnectProviderResponse]
    }
  }

  @js.native
  trait CreatePolicyRequest extends js.Object {
    var PolicyDocument: policyDocumentType
    var PolicyName: policyNameType
    var Description: js.UndefOr[policyDescriptionType]
    var Path: js.UndefOr[policyPathType]
  }

  object CreatePolicyRequest {
    def apply(
        PolicyDocument: policyDocumentType,
        PolicyName: policyNameType,
        Description: js.UndefOr[policyDescriptionType] = js.undefined,
        Path: js.UndefOr[policyPathType] = js.undefined
    ): CreatePolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyDocument" -> PolicyDocument.asInstanceOf[js.Any],
        "PolicyName"     -> PolicyName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.update("Path", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePolicyRequest]
    }
  }

  /**
    * Contains the response to a successful <a>CreatePolicy</a> request.
    */
  @js.native
  trait CreatePolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  object CreatePolicyResponse {
    def apply(
        Policy: js.UndefOr[Policy] = js.undefined
    ): CreatePolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Policy.foreach(__v => __obj.update("Policy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePolicyResponse]
    }
  }

  @js.native
  trait CreatePolicyVersionRequest extends js.Object {
    var PolicyArn: arnType
    var PolicyDocument: policyDocumentType
    var SetAsDefault: js.UndefOr[booleanType]
  }

  object CreatePolicyVersionRequest {
    def apply(
        PolicyArn: arnType,
        PolicyDocument: policyDocumentType,
        SetAsDefault: js.UndefOr[booleanType] = js.undefined
    ): CreatePolicyVersionRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyArn"      -> PolicyArn.asInstanceOf[js.Any],
        "PolicyDocument" -> PolicyDocument.asInstanceOf[js.Any]
      )

      SetAsDefault.foreach(__v => __obj.update("SetAsDefault", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePolicyVersionRequest]
    }
  }

  /**
    * Contains the response to a successful <a>CreatePolicyVersion</a> request.
    */
  @js.native
  trait CreatePolicyVersionResponse extends js.Object {
    var PolicyVersion: js.UndefOr[PolicyVersion]
  }

  object CreatePolicyVersionResponse {
    def apply(
        PolicyVersion: js.UndefOr[PolicyVersion] = js.undefined
    ): CreatePolicyVersionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      PolicyVersion.foreach(__v => __obj.update("PolicyVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePolicyVersionResponse]
    }
  }

  @js.native
  trait CreateRoleRequest extends js.Object {
    var AssumeRolePolicyDocument: policyDocumentType
    var RoleName: roleNameType
    var Description: js.UndefOr[roleDescriptionType]
    var MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType]
    var Path: js.UndefOr[pathType]
    var PermissionsBoundary: js.UndefOr[arnType]
    var Tags: js.UndefOr[tagListType]
  }

  object CreateRoleRequest {
    def apply(
        AssumeRolePolicyDocument: policyDocumentType,
        RoleName: roleNameType,
        Description: js.UndefOr[roleDescriptionType] = js.undefined,
        MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType] = js.undefined,
        Path: js.UndefOr[pathType] = js.undefined,
        PermissionsBoundary: js.UndefOr[arnType] = js.undefined,
        Tags: js.UndefOr[tagListType] = js.undefined
    ): CreateRoleRequest = {
      val __obj = js.Dictionary[js.Any](
        "AssumeRolePolicyDocument" -> AssumeRolePolicyDocument.asInstanceOf[js.Any],
        "RoleName"                 -> RoleName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      MaxSessionDuration.foreach(__v => __obj.update("MaxSessionDuration", __v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.update("Path", __v.asInstanceOf[js.Any]))
      PermissionsBoundary.foreach(__v => __obj.update("PermissionsBoundary", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRoleRequest]
    }
  }

  /**
    * Contains the response to a successful <a>CreateRole</a> request.
    */
  @js.native
  trait CreateRoleResponse extends js.Object {
    var Role: Role
  }

  object CreateRoleResponse {
    def apply(
        Role: Role
    ): CreateRoleResponse = {
      val __obj = js.Dictionary[js.Any](
        "Role" -> Role.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateRoleResponse]
    }
  }

  @js.native
  trait CreateSAMLProviderRequest extends js.Object {
    var Name: SAMLProviderNameType
    var SAMLMetadataDocument: SAMLMetadataDocumentType
  }

  object CreateSAMLProviderRequest {
    def apply(
        Name: SAMLProviderNameType,
        SAMLMetadataDocument: SAMLMetadataDocumentType
    ): CreateSAMLProviderRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name"                 -> Name.asInstanceOf[js.Any],
        "SAMLMetadataDocument" -> SAMLMetadataDocument.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateSAMLProviderRequest]
    }
  }

  /**
    * Contains the response to a successful <a>CreateSAMLProvider</a> request.
    */
  @js.native
  trait CreateSAMLProviderResponse extends js.Object {
    var SAMLProviderArn: js.UndefOr[arnType]
  }

  object CreateSAMLProviderResponse {
    def apply(
        SAMLProviderArn: js.UndefOr[arnType] = js.undefined
    ): CreateSAMLProviderResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      SAMLProviderArn.foreach(__v => __obj.update("SAMLProviderArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSAMLProviderResponse]
    }
  }

  @js.native
  trait CreateServiceLinkedRoleRequest extends js.Object {
    var AWSServiceName: groupNameType
    var CustomSuffix: js.UndefOr[customSuffixType]
    var Description: js.UndefOr[roleDescriptionType]
  }

  object CreateServiceLinkedRoleRequest {
    def apply(
        AWSServiceName: groupNameType,
        CustomSuffix: js.UndefOr[customSuffixType] = js.undefined,
        Description: js.UndefOr[roleDescriptionType] = js.undefined
    ): CreateServiceLinkedRoleRequest = {
      val __obj = js.Dictionary[js.Any](
        "AWSServiceName" -> AWSServiceName.asInstanceOf[js.Any]
      )

      CustomSuffix.foreach(__v => __obj.update("CustomSuffix", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServiceLinkedRoleRequest]
    }
  }

  @js.native
  trait CreateServiceLinkedRoleResponse extends js.Object {
    var Role: js.UndefOr[Role]
  }

  object CreateServiceLinkedRoleResponse {
    def apply(
        Role: js.UndefOr[Role] = js.undefined
    ): CreateServiceLinkedRoleResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Role.foreach(__v => __obj.update("Role", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServiceLinkedRoleResponse]
    }
  }

  @js.native
  trait CreateServiceSpecificCredentialRequest extends js.Object {
    var ServiceName: serviceName
    var UserName: userNameType
  }

  object CreateServiceSpecificCredentialRequest {
    def apply(
        ServiceName: serviceName,
        UserName: userNameType
    ): CreateServiceSpecificCredentialRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServiceName" -> ServiceName.asInstanceOf[js.Any],
        "UserName"    -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateServiceSpecificCredentialRequest]
    }
  }

  @js.native
  trait CreateServiceSpecificCredentialResponse extends js.Object {
    var ServiceSpecificCredential: js.UndefOr[ServiceSpecificCredential]
  }

  object CreateServiceSpecificCredentialResponse {
    def apply(
        ServiceSpecificCredential: js.UndefOr[ServiceSpecificCredential] = js.undefined
    ): CreateServiceSpecificCredentialResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ServiceSpecificCredential.foreach(__v => __obj.update("ServiceSpecificCredential", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServiceSpecificCredentialResponse]
    }
  }

  @js.native
  trait CreateUserRequest extends js.Object {
    var UserName: userNameType
    var Path: js.UndefOr[pathType]
    var PermissionsBoundary: js.UndefOr[arnType]
    var Tags: js.UndefOr[tagListType]
  }

  object CreateUserRequest {
    def apply(
        UserName: userNameType,
        Path: js.UndefOr[pathType] = js.undefined,
        PermissionsBoundary: js.UndefOr[arnType] = js.undefined,
        Tags: js.UndefOr[tagListType] = js.undefined
    ): CreateUserRequest = {
      val __obj = js.Dictionary[js.Any](
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      Path.foreach(__v => __obj.update("Path", __v.asInstanceOf[js.Any]))
      PermissionsBoundary.foreach(__v => __obj.update("PermissionsBoundary", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserRequest]
    }
  }

  /**
    * Contains the response to a successful <a>CreateUser</a> request.
    */
  @js.native
  trait CreateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object CreateUserResponse {
    def apply(
        User: js.UndefOr[User] = js.undefined
    ): CreateUserResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      User.foreach(__v => __obj.update("User", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserResponse]
    }
  }

  @js.native
  trait CreateVirtualMFADeviceRequest extends js.Object {
    var VirtualMFADeviceName: virtualMFADeviceName
    var Path: js.UndefOr[pathType]
  }

  object CreateVirtualMFADeviceRequest {
    def apply(
        VirtualMFADeviceName: virtualMFADeviceName,
        Path: js.UndefOr[pathType] = js.undefined
    ): CreateVirtualMFADeviceRequest = {
      val __obj = js.Dictionary[js.Any](
        "VirtualMFADeviceName" -> VirtualMFADeviceName.asInstanceOf[js.Any]
      )

      Path.foreach(__v => __obj.update("Path", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVirtualMFADeviceRequest]
    }
  }

  /**
    * Contains the response to a successful <a>CreateVirtualMFADevice</a> request.
    */
  @js.native
  trait CreateVirtualMFADeviceResponse extends js.Object {
    var VirtualMFADevice: VirtualMFADevice
  }

  object CreateVirtualMFADeviceResponse {
    def apply(
        VirtualMFADevice: VirtualMFADevice
    ): CreateVirtualMFADeviceResponse = {
      val __obj = js.Dictionary[js.Any](
        "VirtualMFADevice" -> VirtualMFADevice.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateVirtualMFADeviceResponse]
    }
  }

  @js.native
  trait DeactivateMFADeviceRequest extends js.Object {
    var SerialNumber: serialNumberType
    var UserName: existingUserNameType
  }

  object DeactivateMFADeviceRequest {
    def apply(
        SerialNumber: serialNumberType,
        UserName: existingUserNameType
    ): DeactivateMFADeviceRequest = {
      val __obj = js.Dictionary[js.Any](
        "SerialNumber" -> SerialNumber.asInstanceOf[js.Any],
        "UserName"     -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeactivateMFADeviceRequest]
    }
  }

  @js.native
  trait DeleteAccessKeyRequest extends js.Object {
    var AccessKeyId: accessKeyIdType
    var UserName: js.UndefOr[existingUserNameType]
  }

  object DeleteAccessKeyRequest {
    def apply(
        AccessKeyId: accessKeyIdType,
        UserName: js.UndefOr[existingUserNameType] = js.undefined
    ): DeleteAccessKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "AccessKeyId" -> AccessKeyId.asInstanceOf[js.Any]
      )

      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAccessKeyRequest]
    }
  }

  @js.native
  trait DeleteAccountAliasRequest extends js.Object {
    var AccountAlias: accountAliasType
  }

  object DeleteAccountAliasRequest {
    def apply(
        AccountAlias: accountAliasType
    ): DeleteAccountAliasRequest = {
      val __obj = js.Dictionary[js.Any](
        "AccountAlias" -> AccountAlias.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAccountAliasRequest]
    }
  }

  @js.native
  trait DeleteGroupPolicyRequest extends js.Object {
    var GroupName: groupNameType
    var PolicyName: policyNameType
  }

  object DeleteGroupPolicyRequest {
    def apply(
        GroupName: groupNameType,
        PolicyName: policyNameType
    ): DeleteGroupPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "GroupName"  -> GroupName.asInstanceOf[js.Any],
        "PolicyName" -> PolicyName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteGroupPolicyRequest]
    }
  }

  @js.native
  trait DeleteGroupRequest extends js.Object {
    var GroupName: groupNameType
  }

  object DeleteGroupRequest {
    def apply(
        GroupName: groupNameType
    ): DeleteGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "GroupName" -> GroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteGroupRequest]
    }
  }

  @js.native
  trait DeleteInstanceProfileRequest extends js.Object {
    var InstanceProfileName: instanceProfileNameType
  }

  object DeleteInstanceProfileRequest {
    def apply(
        InstanceProfileName: instanceProfileNameType
    ): DeleteInstanceProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceProfileName" -> InstanceProfileName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteInstanceProfileRequest]
    }
  }

  @js.native
  trait DeleteLoginProfileRequest extends js.Object {
    var UserName: userNameType
  }

  object DeleteLoginProfileRequest {
    def apply(
        UserName: userNameType
    ): DeleteLoginProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteLoginProfileRequest]
    }
  }

  @js.native
  trait DeleteOpenIDConnectProviderRequest extends js.Object {
    var OpenIDConnectProviderArn: arnType
  }

  object DeleteOpenIDConnectProviderRequest {
    def apply(
        OpenIDConnectProviderArn: arnType
    ): DeleteOpenIDConnectProviderRequest = {
      val __obj = js.Dictionary[js.Any](
        "OpenIDConnectProviderArn" -> OpenIDConnectProviderArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteOpenIDConnectProviderRequest]
    }
  }

  @js.native
  trait DeletePolicyRequest extends js.Object {
    var PolicyArn: arnType
  }

  object DeletePolicyRequest {
    def apply(
        PolicyArn: arnType
    ): DeletePolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyArn" -> PolicyArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePolicyRequest]
    }
  }

  @js.native
  trait DeletePolicyVersionRequest extends js.Object {
    var PolicyArn: arnType
    var VersionId: policyVersionIdType
  }

  object DeletePolicyVersionRequest {
    def apply(
        PolicyArn: arnType,
        VersionId: policyVersionIdType
    ): DeletePolicyVersionRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyArn" -> PolicyArn.asInstanceOf[js.Any],
        "VersionId" -> VersionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePolicyVersionRequest]
    }
  }

  @js.native
  trait DeleteRolePermissionsBoundaryRequest extends js.Object {
    var RoleName: roleNameType
  }

  object DeleteRolePermissionsBoundaryRequest {
    def apply(
        RoleName: roleNameType
    ): DeleteRolePermissionsBoundaryRequest = {
      val __obj = js.Dictionary[js.Any](
        "RoleName" -> RoleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRolePermissionsBoundaryRequest]
    }
  }

  @js.native
  trait DeleteRolePolicyRequest extends js.Object {
    var PolicyName: policyNameType
    var RoleName: roleNameType
  }

  object DeleteRolePolicyRequest {
    def apply(
        PolicyName: policyNameType,
        RoleName: roleNameType
    ): DeleteRolePolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "RoleName"   -> RoleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRolePolicyRequest]
    }
  }

  @js.native
  trait DeleteRoleRequest extends js.Object {
    var RoleName: roleNameType
  }

  object DeleteRoleRequest {
    def apply(
        RoleName: roleNameType
    ): DeleteRoleRequest = {
      val __obj = js.Dictionary[js.Any](
        "RoleName" -> RoleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRoleRequest]
    }
  }

  @js.native
  trait DeleteSAMLProviderRequest extends js.Object {
    var SAMLProviderArn: arnType
  }

  object DeleteSAMLProviderRequest {
    def apply(
        SAMLProviderArn: arnType
    ): DeleteSAMLProviderRequest = {
      val __obj = js.Dictionary[js.Any](
        "SAMLProviderArn" -> SAMLProviderArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSAMLProviderRequest]
    }
  }

  @js.native
  trait DeleteSSHPublicKeyRequest extends js.Object {
    var SSHPublicKeyId: publicKeyIdType
    var UserName: userNameType
  }

  object DeleteSSHPublicKeyRequest {
    def apply(
        SSHPublicKeyId: publicKeyIdType,
        UserName: userNameType
    ): DeleteSSHPublicKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "SSHPublicKeyId" -> SSHPublicKeyId.asInstanceOf[js.Any],
        "UserName"       -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSSHPublicKeyRequest]
    }
  }

  @js.native
  trait DeleteServerCertificateRequest extends js.Object {
    var ServerCertificateName: serverCertificateNameType
  }

  object DeleteServerCertificateRequest {
    def apply(
        ServerCertificateName: serverCertificateNameType
    ): DeleteServerCertificateRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServerCertificateName" -> ServerCertificateName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteServerCertificateRequest]
    }
  }

  @js.native
  trait DeleteServiceLinkedRoleRequest extends js.Object {
    var RoleName: roleNameType
  }

  object DeleteServiceLinkedRoleRequest {
    def apply(
        RoleName: roleNameType
    ): DeleteServiceLinkedRoleRequest = {
      val __obj = js.Dictionary[js.Any](
        "RoleName" -> RoleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteServiceLinkedRoleRequest]
    }
  }

  @js.native
  trait DeleteServiceLinkedRoleResponse extends js.Object {
    var DeletionTaskId: DeletionTaskIdType
  }

  object DeleteServiceLinkedRoleResponse {
    def apply(
        DeletionTaskId: DeletionTaskIdType
    ): DeleteServiceLinkedRoleResponse = {
      val __obj = js.Dictionary[js.Any](
        "DeletionTaskId" -> DeletionTaskId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteServiceLinkedRoleResponse]
    }
  }

  @js.native
  trait DeleteServiceSpecificCredentialRequest extends js.Object {
    var ServiceSpecificCredentialId: serviceSpecificCredentialId
    var UserName: js.UndefOr[userNameType]
  }

  object DeleteServiceSpecificCredentialRequest {
    def apply(
        ServiceSpecificCredentialId: serviceSpecificCredentialId,
        UserName: js.UndefOr[userNameType] = js.undefined
    ): DeleteServiceSpecificCredentialRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServiceSpecificCredentialId" -> ServiceSpecificCredentialId.asInstanceOf[js.Any]
      )

      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteServiceSpecificCredentialRequest]
    }
  }

  @js.native
  trait DeleteSigningCertificateRequest extends js.Object {
    var CertificateId: certificateIdType
    var UserName: js.UndefOr[existingUserNameType]
  }

  object DeleteSigningCertificateRequest {
    def apply(
        CertificateId: certificateIdType,
        UserName: js.UndefOr[existingUserNameType] = js.undefined
    ): DeleteSigningCertificateRequest = {
      val __obj = js.Dictionary[js.Any](
        "CertificateId" -> CertificateId.asInstanceOf[js.Any]
      )

      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSigningCertificateRequest]
    }
  }

  @js.native
  trait DeleteUserPermissionsBoundaryRequest extends js.Object {
    var UserName: userNameType
  }

  object DeleteUserPermissionsBoundaryRequest {
    def apply(
        UserName: userNameType
    ): DeleteUserPermissionsBoundaryRequest = {
      val __obj = js.Dictionary[js.Any](
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteUserPermissionsBoundaryRequest]
    }
  }

  @js.native
  trait DeleteUserPolicyRequest extends js.Object {
    var PolicyName: policyNameType
    var UserName: existingUserNameType
  }

  object DeleteUserPolicyRequest {
    def apply(
        PolicyName: policyNameType,
        UserName: existingUserNameType
    ): DeleteUserPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "UserName"   -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteUserPolicyRequest]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var UserName: existingUserNameType
  }

  object DeleteUserRequest {
    def apply(
        UserName: existingUserNameType
    ): DeleteUserRequest = {
      val __obj = js.Dictionary[js.Any](
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DeleteVirtualMFADeviceRequest extends js.Object {
    var SerialNumber: serialNumberType
  }

  object DeleteVirtualMFADeviceRequest {
    def apply(
        SerialNumber: serialNumberType
    ): DeleteVirtualMFADeviceRequest = {
      val __obj = js.Dictionary[js.Any](
        "SerialNumber" -> SerialNumber.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVirtualMFADeviceRequest]
    }
  }

  /**
    * The reason that the service-linked role deletion failed.
    *  This data type is used as a response element in the <a>GetServiceLinkedRoleDeletionStatus</a> operation.
    */
  @js.native
  trait DeletionTaskFailureReasonType extends js.Object {
    var Reason: js.UndefOr[ReasonType]
    var RoleUsageList: js.UndefOr[RoleUsageListType]
  }

  object DeletionTaskFailureReasonType {
    def apply(
        Reason: js.UndefOr[ReasonType] = js.undefined,
        RoleUsageList: js.UndefOr[RoleUsageListType] = js.undefined
    ): DeletionTaskFailureReasonType = {
      val __obj = js.Dictionary.empty[js.Any]
      Reason.foreach(__v => __obj.update("Reason", __v.asInstanceOf[js.Any]))
      RoleUsageList.foreach(__v => __obj.update("RoleUsageList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletionTaskFailureReasonType]
    }
  }

  object DeletionTaskStatusTypeEnum {
    val SUCCEEDED   = "SUCCEEDED"
    val IN_PROGRESS = "IN_PROGRESS"
    val FAILED      = "FAILED"
    val NOT_STARTED = "NOT_STARTED"

    val values = js.Object.freeze(js.Array(SUCCEEDED, IN_PROGRESS, FAILED, NOT_STARTED))
  }

  @js.native
  trait DetachGroupPolicyRequest extends js.Object {
    var GroupName: groupNameType
    var PolicyArn: arnType
  }

  object DetachGroupPolicyRequest {
    def apply(
        GroupName: groupNameType,
        PolicyArn: arnType
    ): DetachGroupPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "PolicyArn" -> PolicyArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetachGroupPolicyRequest]
    }
  }

  @js.native
  trait DetachRolePolicyRequest extends js.Object {
    var PolicyArn: arnType
    var RoleName: roleNameType
  }

  object DetachRolePolicyRequest {
    def apply(
        PolicyArn: arnType,
        RoleName: roleNameType
    ): DetachRolePolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyArn" -> PolicyArn.asInstanceOf[js.Any],
        "RoleName"  -> RoleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetachRolePolicyRequest]
    }
  }

  @js.native
  trait DetachUserPolicyRequest extends js.Object {
    var PolicyArn: arnType
    var UserName: userNameType
  }

  object DetachUserPolicyRequest {
    def apply(
        PolicyArn: arnType,
        UserName: userNameType
    ): DetachUserPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyArn" -> PolicyArn.asInstanceOf[js.Any],
        "UserName"  -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetachUserPolicyRequest]
    }
  }

  @js.native
  trait EnableMFADeviceRequest extends js.Object {
    var AuthenticationCode1: authenticationCodeType
    var AuthenticationCode2: authenticationCodeType
    var SerialNumber: serialNumberType
    var UserName: existingUserNameType
  }

  object EnableMFADeviceRequest {
    def apply(
        AuthenticationCode1: authenticationCodeType,
        AuthenticationCode2: authenticationCodeType,
        SerialNumber: serialNumberType,
        UserName: existingUserNameType
    ): EnableMFADeviceRequest = {
      val __obj = js.Dictionary[js.Any](
        "AuthenticationCode1" -> AuthenticationCode1.asInstanceOf[js.Any],
        "AuthenticationCode2" -> AuthenticationCode2.asInstanceOf[js.Any],
        "SerialNumber"        -> SerialNumber.asInstanceOf[js.Any],
        "UserName"            -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EnableMFADeviceRequest]
    }
  }

  /**
    * An object that contains details about when the IAM entities (users or roles) were last used in an attempt to access the specified AWS service.
    *  This data type is a response element in the <a>GetServiceLastAccessedDetailsWithEntities</a> operation.
    */
  @js.native
  trait EntityDetails extends js.Object {
    var EntityInfo: EntityInfo
    var LastAuthenticated: js.UndefOr[dateType]
  }

  object EntityDetails {
    def apply(
        EntityInfo: EntityInfo,
        LastAuthenticated: js.UndefOr[dateType] = js.undefined
    ): EntityDetails = {
      val __obj = js.Dictionary[js.Any](
        "EntityInfo" -> EntityInfo.asInstanceOf[js.Any]
      )

      LastAuthenticated.foreach(__v => __obj.update("LastAuthenticated", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityDetails]
    }
  }

  /**
    * Contains details about the specified entity (user or role).
    *  This data type is an element of the <a>EntityDetails</a> object.
    */
  @js.native
  trait EntityInfo extends js.Object {
    var Arn: arnType
    var Id: idType
    var Name: userNameType
    var Type: policyOwnerEntityType
    var Path: js.UndefOr[pathType]
  }

  object EntityInfo {
    def apply(
        Arn: arnType,
        Id: idType,
        Name: userNameType,
        Type: policyOwnerEntityType,
        Path: js.UndefOr[pathType] = js.undefined
    ): EntityInfo = {
      val __obj = js.Dictionary[js.Any](
        "Arn"  -> Arn.asInstanceOf[js.Any],
        "Id"   -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Path.foreach(__v => __obj.update("Path", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityInfo]
    }
  }

  object EntityTypeEnum {
    val User               = "User"
    val Role               = "Role"
    val Group              = "Group"
    val LocalManagedPolicy = "LocalManagedPolicy"
    val AWSManagedPolicy   = "AWSManagedPolicy"

    val values = js.Object.freeze(js.Array(User, Role, Group, LocalManagedPolicy, AWSManagedPolicy))
  }

  /**
    * Contains information about the reason that the operation failed.
    *  This data type is used as a response element in the <a>GetOrganizationsAccessReport</a>, <a>GetServiceLastAccessedDetails</a>, and <a>GetServiceLastAccessedDetailsWithEntities</a> operations.
    */
  @js.native
  trait ErrorDetails extends js.Object {
    var Code: stringType
    var Message: stringType
  }

  object ErrorDetails {
    def apply(
        Code: stringType,
        Message: stringType
    ): ErrorDetails = {
      val __obj = js.Dictionary[js.Any](
        "Code"    -> Code.asInstanceOf[js.Any],
        "Message" -> Message.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ErrorDetails]
    }
  }

  /**
    * Contains the results of a simulation.
    *  This data type is used by the return parameter of <code> <a>SimulateCustomPolicy</a> </code> and <code> <a>SimulatePrincipalPolicy</a> </code>.
    */
  @js.native
  trait EvaluationResult extends js.Object {
    var EvalActionName: ActionNameType
    var EvalDecision: PolicyEvaluationDecisionType
    var EvalDecisionDetails: js.UndefOr[EvalDecisionDetailsType]
    var EvalResourceName: js.UndefOr[ResourceNameType]
    var MatchedStatements: js.UndefOr[StatementListType]
    var MissingContextValues: js.UndefOr[ContextKeyNamesResultListType]
    var OrganizationsDecisionDetail: js.UndefOr[OrganizationsDecisionDetail]
    var ResourceSpecificResults: js.UndefOr[ResourceSpecificResultListType]
  }

  object EvaluationResult {
    def apply(
        EvalActionName: ActionNameType,
        EvalDecision: PolicyEvaluationDecisionType,
        EvalDecisionDetails: js.UndefOr[EvalDecisionDetailsType] = js.undefined,
        EvalResourceName: js.UndefOr[ResourceNameType] = js.undefined,
        MatchedStatements: js.UndefOr[StatementListType] = js.undefined,
        MissingContextValues: js.UndefOr[ContextKeyNamesResultListType] = js.undefined,
        OrganizationsDecisionDetail: js.UndefOr[OrganizationsDecisionDetail] = js.undefined,
        ResourceSpecificResults: js.UndefOr[ResourceSpecificResultListType] = js.undefined
    ): EvaluationResult = {
      val __obj = js.Dictionary[js.Any](
        "EvalActionName" -> EvalActionName.asInstanceOf[js.Any],
        "EvalDecision"   -> EvalDecision.asInstanceOf[js.Any]
      )

      EvalDecisionDetails.foreach(__v => __obj.update("EvalDecisionDetails", __v.asInstanceOf[js.Any]))
      EvalResourceName.foreach(__v => __obj.update("EvalResourceName", __v.asInstanceOf[js.Any]))
      MatchedStatements.foreach(__v => __obj.update("MatchedStatements", __v.asInstanceOf[js.Any]))
      MissingContextValues.foreach(__v => __obj.update("MissingContextValues", __v.asInstanceOf[js.Any]))
      OrganizationsDecisionDetail.foreach(__v => __obj.update("OrganizationsDecisionDetail", __v.asInstanceOf[js.Any]))
      ResourceSpecificResults.foreach(__v => __obj.update("ResourceSpecificResults", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EvaluationResult]
    }
  }

  /**
    * Contains the response to a successful <a>GenerateCredentialReport</a> request.
    */
  @js.native
  trait GenerateCredentialReportResponse extends js.Object {
    var Description: js.UndefOr[ReportStateDescriptionType]
    var State: js.UndefOr[ReportStateType]
  }

  object GenerateCredentialReportResponse {
    def apply(
        Description: js.UndefOr[ReportStateDescriptionType] = js.undefined,
        State: js.UndefOr[ReportStateType] = js.undefined
    ): GenerateCredentialReportResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateCredentialReportResponse]
    }
  }

  @js.native
  trait GenerateOrganizationsAccessReportRequest extends js.Object {
    var EntityPath: organizationsEntityPathType
    var OrganizationsPolicyId: js.UndefOr[organizationsPolicyIdType]
  }

  object GenerateOrganizationsAccessReportRequest {
    def apply(
        EntityPath: organizationsEntityPathType,
        OrganizationsPolicyId: js.UndefOr[organizationsPolicyIdType] = js.undefined
    ): GenerateOrganizationsAccessReportRequest = {
      val __obj = js.Dictionary[js.Any](
        "EntityPath" -> EntityPath.asInstanceOf[js.Any]
      )

      OrganizationsPolicyId.foreach(__v => __obj.update("OrganizationsPolicyId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateOrganizationsAccessReportRequest]
    }
  }

  @js.native
  trait GenerateOrganizationsAccessReportResponse extends js.Object {
    var JobId: js.UndefOr[jobIDType]
  }

  object GenerateOrganizationsAccessReportResponse {
    def apply(
        JobId: js.UndefOr[jobIDType] = js.undefined
    ): GenerateOrganizationsAccessReportResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateOrganizationsAccessReportResponse]
    }
  }

  @js.native
  trait GenerateServiceLastAccessedDetailsRequest extends js.Object {
    var Arn: arnType
  }

  object GenerateServiceLastAccessedDetailsRequest {
    def apply(
        Arn: arnType
    ): GenerateServiceLastAccessedDetailsRequest = {
      val __obj = js.Dictionary[js.Any](
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GenerateServiceLastAccessedDetailsRequest]
    }
  }

  @js.native
  trait GenerateServiceLastAccessedDetailsResponse extends js.Object {
    var JobId: js.UndefOr[jobIDType]
  }

  object GenerateServiceLastAccessedDetailsResponse {
    def apply(
        JobId: js.UndefOr[jobIDType] = js.undefined
    ): GenerateServiceLastAccessedDetailsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateServiceLastAccessedDetailsResponse]
    }
  }

  @js.native
  trait GetAccessKeyLastUsedRequest extends js.Object {
    var AccessKeyId: accessKeyIdType
  }

  object GetAccessKeyLastUsedRequest {
    def apply(
        AccessKeyId: accessKeyIdType
    ): GetAccessKeyLastUsedRequest = {
      val __obj = js.Dictionary[js.Any](
        "AccessKeyId" -> AccessKeyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAccessKeyLastUsedRequest]
    }
  }

  /**
    * Contains the response to a successful <a>GetAccessKeyLastUsed</a> request. It is also returned as a member of the <a>AccessKeyMetaData</a> structure returned by the <a>ListAccessKeys</a> action.
    */
  @js.native
  trait GetAccessKeyLastUsedResponse extends js.Object {
    var AccessKeyLastUsed: js.UndefOr[AccessKeyLastUsed]
    var UserName: js.UndefOr[existingUserNameType]
  }

  object GetAccessKeyLastUsedResponse {
    def apply(
        AccessKeyLastUsed: js.UndefOr[AccessKeyLastUsed] = js.undefined,
        UserName: js.UndefOr[existingUserNameType] = js.undefined
    ): GetAccessKeyLastUsedResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AccessKeyLastUsed.foreach(__v => __obj.update("AccessKeyLastUsed", __v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccessKeyLastUsedResponse]
    }
  }

  @js.native
  trait GetAccountAuthorizationDetailsRequest extends js.Object {
    var Filter: js.UndefOr[entityListType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object GetAccountAuthorizationDetailsRequest {
    def apply(
        Filter: js.UndefOr[entityListType] = js.undefined,
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): GetAccountAuthorizationDetailsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filter.foreach(__v => __obj.update("Filter", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccountAuthorizationDetailsRequest]
    }
  }

  /**
    * Contains the response to a successful <a>GetAccountAuthorizationDetails</a> request.
    */
  @js.native
  trait GetAccountAuthorizationDetailsResponse extends js.Object {
    var GroupDetailList: js.UndefOr[groupDetailListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
    var Policies: js.UndefOr[ManagedPolicyDetailListType]
    var RoleDetailList: js.UndefOr[roleDetailListType]
    var UserDetailList: js.UndefOr[userDetailListType]
  }

  object GetAccountAuthorizationDetailsResponse {
    def apply(
        GroupDetailList: js.UndefOr[groupDetailListType] = js.undefined,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined,
        Policies: js.UndefOr[ManagedPolicyDetailListType] = js.undefined,
        RoleDetailList: js.UndefOr[roleDetailListType] = js.undefined,
        UserDetailList: js.UndefOr[userDetailListType] = js.undefined
    ): GetAccountAuthorizationDetailsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      GroupDetailList.foreach(__v => __obj.update("GroupDetailList", __v.asInstanceOf[js.Any]))
      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      Policies.foreach(__v => __obj.update("Policies", __v.asInstanceOf[js.Any]))
      RoleDetailList.foreach(__v => __obj.update("RoleDetailList", __v.asInstanceOf[js.Any]))
      UserDetailList.foreach(__v => __obj.update("UserDetailList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccountAuthorizationDetailsResponse]
    }
  }

  /**
    * Contains the response to a successful <a>GetAccountPasswordPolicy</a> request.
    */
  @js.native
  trait GetAccountPasswordPolicyResponse extends js.Object {
    var PasswordPolicy: PasswordPolicy
  }

  object GetAccountPasswordPolicyResponse {
    def apply(
        PasswordPolicy: PasswordPolicy
    ): GetAccountPasswordPolicyResponse = {
      val __obj = js.Dictionary[js.Any](
        "PasswordPolicy" -> PasswordPolicy.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAccountPasswordPolicyResponse]
    }
  }

  /**
    * Contains the response to a successful <a>GetAccountSummary</a> request.
    */
  @js.native
  trait GetAccountSummaryResponse extends js.Object {
    var SummaryMap: js.UndefOr[summaryMapType]
  }

  object GetAccountSummaryResponse {
    def apply(
        SummaryMap: js.UndefOr[summaryMapType] = js.undefined
    ): GetAccountSummaryResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      SummaryMap.foreach(__v => __obj.update("SummaryMap", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccountSummaryResponse]
    }
  }

  @js.native
  trait GetContextKeysForCustomPolicyRequest extends js.Object {
    var PolicyInputList: SimulationPolicyListType
  }

  object GetContextKeysForCustomPolicyRequest {
    def apply(
        PolicyInputList: SimulationPolicyListType
    ): GetContextKeysForCustomPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyInputList" -> PolicyInputList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetContextKeysForCustomPolicyRequest]
    }
  }

  /**
    * Contains the response to a successful <a>GetContextKeysForPrincipalPolicy</a> or <a>GetContextKeysForCustomPolicy</a> request.
    */
  @js.native
  trait GetContextKeysForPolicyResponse extends js.Object {
    var ContextKeyNames: js.UndefOr[ContextKeyNamesResultListType]
  }

  object GetContextKeysForPolicyResponse {
    def apply(
        ContextKeyNames: js.UndefOr[ContextKeyNamesResultListType] = js.undefined
    ): GetContextKeysForPolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ContextKeyNames.foreach(__v => __obj.update("ContextKeyNames", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetContextKeysForPolicyResponse]
    }
  }

  @js.native
  trait GetContextKeysForPrincipalPolicyRequest extends js.Object {
    var PolicySourceArn: arnType
    var PolicyInputList: js.UndefOr[SimulationPolicyListType]
  }

  object GetContextKeysForPrincipalPolicyRequest {
    def apply(
        PolicySourceArn: arnType,
        PolicyInputList: js.UndefOr[SimulationPolicyListType] = js.undefined
    ): GetContextKeysForPrincipalPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicySourceArn" -> PolicySourceArn.asInstanceOf[js.Any]
      )

      PolicyInputList.foreach(__v => __obj.update("PolicyInputList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetContextKeysForPrincipalPolicyRequest]
    }
  }

  /**
    * Contains the response to a successful <a>GetCredentialReport</a> request.
    */
  @js.native
  trait GetCredentialReportResponse extends js.Object {
    var Content: js.UndefOr[ReportContentType]
    var GeneratedTime: js.UndefOr[dateType]
    var ReportFormat: js.UndefOr[ReportFormatType]
  }

  object GetCredentialReportResponse {
    def apply(
        Content: js.UndefOr[ReportContentType] = js.undefined,
        GeneratedTime: js.UndefOr[dateType] = js.undefined,
        ReportFormat: js.UndefOr[ReportFormatType] = js.undefined
    ): GetCredentialReportResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Content.foreach(__v => __obj.update("Content", __v.asInstanceOf[js.Any]))
      GeneratedTime.foreach(__v => __obj.update("GeneratedTime", __v.asInstanceOf[js.Any]))
      ReportFormat.foreach(__v => __obj.update("ReportFormat", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCredentialReportResponse]
    }
  }

  @js.native
  trait GetGroupPolicyRequest extends js.Object {
    var GroupName: groupNameType
    var PolicyName: policyNameType
  }

  object GetGroupPolicyRequest {
    def apply(
        GroupName: groupNameType,
        PolicyName: policyNameType
    ): GetGroupPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "GroupName"  -> GroupName.asInstanceOf[js.Any],
        "PolicyName" -> PolicyName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetGroupPolicyRequest]
    }
  }

  /**
    * Contains the response to a successful <a>GetGroupPolicy</a> request.
    */
  @js.native
  trait GetGroupPolicyResponse extends js.Object {
    var GroupName: groupNameType
    var PolicyDocument: policyDocumentType
    var PolicyName: policyNameType
  }

  object GetGroupPolicyResponse {
    def apply(
        GroupName: groupNameType,
        PolicyDocument: policyDocumentType,
        PolicyName: policyNameType
    ): GetGroupPolicyResponse = {
      val __obj = js.Dictionary[js.Any](
        "GroupName"      -> GroupName.asInstanceOf[js.Any],
        "PolicyDocument" -> PolicyDocument.asInstanceOf[js.Any],
        "PolicyName"     -> PolicyName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetGroupPolicyResponse]
    }
  }

  @js.native
  trait GetGroupRequest extends js.Object {
    var GroupName: groupNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object GetGroupRequest {
    def apply(
        GroupName: groupNameType,
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): GetGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "GroupName" -> GroupName.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupRequest]
    }
  }

  /**
    * Contains the response to a successful <a>GetGroup</a> request.
    */
  @js.native
  trait GetGroupResponse extends js.Object {
    var Group: Group
    var Users: userListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object GetGroupResponse {
    def apply(
        Group: Group,
        Users: userListType,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): GetGroupResponse = {
      val __obj = js.Dictionary[js.Any](
        "Group" -> Group.asInstanceOf[js.Any],
        "Users" -> Users.asInstanceOf[js.Any]
      )

      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupResponse]
    }
  }

  @js.native
  trait GetInstanceProfileRequest extends js.Object {
    var InstanceProfileName: instanceProfileNameType
  }

  object GetInstanceProfileRequest {
    def apply(
        InstanceProfileName: instanceProfileNameType
    ): GetInstanceProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceProfileName" -> InstanceProfileName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetInstanceProfileRequest]
    }
  }

  /**
    * Contains the response to a successful <a>GetInstanceProfile</a> request.
    */
  @js.native
  trait GetInstanceProfileResponse extends js.Object {
    var InstanceProfile: InstanceProfile
  }

  object GetInstanceProfileResponse {
    def apply(
        InstanceProfile: InstanceProfile
    ): GetInstanceProfileResponse = {
      val __obj = js.Dictionary[js.Any](
        "InstanceProfile" -> InstanceProfile.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetInstanceProfileResponse]
    }
  }

  @js.native
  trait GetLoginProfileRequest extends js.Object {
    var UserName: userNameType
  }

  object GetLoginProfileRequest {
    def apply(
        UserName: userNameType
    ): GetLoginProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetLoginProfileRequest]
    }
  }

  /**
    * Contains the response to a successful <a>GetLoginProfile</a> request.
    */
  @js.native
  trait GetLoginProfileResponse extends js.Object {
    var LoginProfile: LoginProfile
  }

  object GetLoginProfileResponse {
    def apply(
        LoginProfile: LoginProfile
    ): GetLoginProfileResponse = {
      val __obj = js.Dictionary[js.Any](
        "LoginProfile" -> LoginProfile.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetLoginProfileResponse]
    }
  }

  @js.native
  trait GetOpenIDConnectProviderRequest extends js.Object {
    var OpenIDConnectProviderArn: arnType
  }

  object GetOpenIDConnectProviderRequest {
    def apply(
        OpenIDConnectProviderArn: arnType
    ): GetOpenIDConnectProviderRequest = {
      val __obj = js.Dictionary[js.Any](
        "OpenIDConnectProviderArn" -> OpenIDConnectProviderArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetOpenIDConnectProviderRequest]
    }
  }

  /**
    * Contains the response to a successful <a>GetOpenIDConnectProvider</a> request.
    */
  @js.native
  trait GetOpenIDConnectProviderResponse extends js.Object {
    var ClientIDList: js.UndefOr[clientIDListType]
    var CreateDate: js.UndefOr[dateType]
    var ThumbprintList: js.UndefOr[thumbprintListType]
    var Url: js.UndefOr[OpenIDConnectProviderUrlType]
  }

  object GetOpenIDConnectProviderResponse {
    def apply(
        ClientIDList: js.UndefOr[clientIDListType] = js.undefined,
        CreateDate: js.UndefOr[dateType] = js.undefined,
        ThumbprintList: js.UndefOr[thumbprintListType] = js.undefined,
        Url: js.UndefOr[OpenIDConnectProviderUrlType] = js.undefined
    ): GetOpenIDConnectProviderResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ClientIDList.foreach(__v => __obj.update("ClientIDList", __v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.update("CreateDate", __v.asInstanceOf[js.Any]))
      ThumbprintList.foreach(__v => __obj.update("ThumbprintList", __v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.update("Url", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOpenIDConnectProviderResponse]
    }
  }

  @js.native
  trait GetOrganizationsAccessReportRequest extends js.Object {
    var JobId: jobIDType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var SortKey: js.UndefOr[sortKeyType]
  }

  object GetOrganizationsAccessReportRequest {
    def apply(
        JobId: jobIDType,
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined,
        SortKey: js.UndefOr[sortKeyType] = js.undefined
    ): GetOrganizationsAccessReportRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      SortKey.foreach(__v => __obj.update("SortKey", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOrganizationsAccessReportRequest]
    }
  }

  @js.native
  trait GetOrganizationsAccessReportResponse extends js.Object {
    var JobCreationDate: dateType
    var JobStatus: jobStatusType
    var AccessDetails: js.UndefOr[AccessDetails]
    var ErrorDetails: js.UndefOr[ErrorDetails]
    var IsTruncated: js.UndefOr[booleanType]
    var JobCompletionDate: js.UndefOr[dateType]
    var Marker: js.UndefOr[markerType]
    var NumberOfServicesAccessible: js.UndefOr[integerType]
    var NumberOfServicesNotAccessed: js.UndefOr[integerType]
  }

  object GetOrganizationsAccessReportResponse {
    def apply(
        JobCreationDate: dateType,
        JobStatus: jobStatusType,
        AccessDetails: js.UndefOr[AccessDetails] = js.undefined,
        ErrorDetails: js.UndefOr[ErrorDetails] = js.undefined,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        JobCompletionDate: js.UndefOr[dateType] = js.undefined,
        Marker: js.UndefOr[markerType] = js.undefined,
        NumberOfServicesAccessible: js.UndefOr[integerType] = js.undefined,
        NumberOfServicesNotAccessed: js.UndefOr[integerType] = js.undefined
    ): GetOrganizationsAccessReportResponse = {
      val __obj = js.Dictionary[js.Any](
        "JobCreationDate" -> JobCreationDate.asInstanceOf[js.Any],
        "JobStatus"       -> JobStatus.asInstanceOf[js.Any]
      )

      AccessDetails.foreach(__v => __obj.update("AccessDetails", __v.asInstanceOf[js.Any]))
      ErrorDetails.foreach(__v => __obj.update("ErrorDetails", __v.asInstanceOf[js.Any]))
      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      JobCompletionDate.foreach(__v => __obj.update("JobCompletionDate", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      NumberOfServicesAccessible.foreach(__v => __obj.update("NumberOfServicesAccessible", __v.asInstanceOf[js.Any]))
      NumberOfServicesNotAccessed.foreach(__v => __obj.update("NumberOfServicesNotAccessed", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOrganizationsAccessReportResponse]
    }
  }

  @js.native
  trait GetPolicyRequest extends js.Object {
    var PolicyArn: arnType
  }

  object GetPolicyRequest {
    def apply(
        PolicyArn: arnType
    ): GetPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyArn" -> PolicyArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetPolicyRequest]
    }
  }

  /**
    * Contains the response to a successful <a>GetPolicy</a> request.
    */
  @js.native
  trait GetPolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  object GetPolicyResponse {
    def apply(
        Policy: js.UndefOr[Policy] = js.undefined
    ): GetPolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Policy.foreach(__v => __obj.update("Policy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPolicyResponse]
    }
  }

  @js.native
  trait GetPolicyVersionRequest extends js.Object {
    var PolicyArn: arnType
    var VersionId: policyVersionIdType
  }

  object GetPolicyVersionRequest {
    def apply(
        PolicyArn: arnType,
        VersionId: policyVersionIdType
    ): GetPolicyVersionRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyArn" -> PolicyArn.asInstanceOf[js.Any],
        "VersionId" -> VersionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetPolicyVersionRequest]
    }
  }

  /**
    * Contains the response to a successful <a>GetPolicyVersion</a> request.
    */
  @js.native
  trait GetPolicyVersionResponse extends js.Object {
    var PolicyVersion: js.UndefOr[PolicyVersion]
  }

  object GetPolicyVersionResponse {
    def apply(
        PolicyVersion: js.UndefOr[PolicyVersion] = js.undefined
    ): GetPolicyVersionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      PolicyVersion.foreach(__v => __obj.update("PolicyVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPolicyVersionResponse]
    }
  }

  @js.native
  trait GetRolePolicyRequest extends js.Object {
    var PolicyName: policyNameType
    var RoleName: roleNameType
  }

  object GetRolePolicyRequest {
    def apply(
        PolicyName: policyNameType,
        RoleName: roleNameType
    ): GetRolePolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "RoleName"   -> RoleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRolePolicyRequest]
    }
  }

  /**
    * Contains the response to a successful <a>GetRolePolicy</a> request.
    */
  @js.native
  trait GetRolePolicyResponse extends js.Object {
    var PolicyDocument: policyDocumentType
    var PolicyName: policyNameType
    var RoleName: roleNameType
  }

  object GetRolePolicyResponse {
    def apply(
        PolicyDocument: policyDocumentType,
        PolicyName: policyNameType,
        RoleName: roleNameType
    ): GetRolePolicyResponse = {
      val __obj = js.Dictionary[js.Any](
        "PolicyDocument" -> PolicyDocument.asInstanceOf[js.Any],
        "PolicyName"     -> PolicyName.asInstanceOf[js.Any],
        "RoleName"       -> RoleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRolePolicyResponse]
    }
  }

  @js.native
  trait GetRoleRequest extends js.Object {
    var RoleName: roleNameType
  }

  object GetRoleRequest {
    def apply(
        RoleName: roleNameType
    ): GetRoleRequest = {
      val __obj = js.Dictionary[js.Any](
        "RoleName" -> RoleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRoleRequest]
    }
  }

  /**
    * Contains the response to a successful <a>GetRole</a> request.
    */
  @js.native
  trait GetRoleResponse extends js.Object {
    var Role: Role
  }

  object GetRoleResponse {
    def apply(
        Role: Role
    ): GetRoleResponse = {
      val __obj = js.Dictionary[js.Any](
        "Role" -> Role.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRoleResponse]
    }
  }

  @js.native
  trait GetSAMLProviderRequest extends js.Object {
    var SAMLProviderArn: arnType
  }

  object GetSAMLProviderRequest {
    def apply(
        SAMLProviderArn: arnType
    ): GetSAMLProviderRequest = {
      val __obj = js.Dictionary[js.Any](
        "SAMLProviderArn" -> SAMLProviderArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSAMLProviderRequest]
    }
  }

  /**
    * Contains the response to a successful <a>GetSAMLProvider</a> request.
    */
  @js.native
  trait GetSAMLProviderResponse extends js.Object {
    var CreateDate: js.UndefOr[dateType]
    var SAMLMetadataDocument: js.UndefOr[SAMLMetadataDocumentType]
    var ValidUntil: js.UndefOr[dateType]
  }

  object GetSAMLProviderResponse {
    def apply(
        CreateDate: js.UndefOr[dateType] = js.undefined,
        SAMLMetadataDocument: js.UndefOr[SAMLMetadataDocumentType] = js.undefined,
        ValidUntil: js.UndefOr[dateType] = js.undefined
    ): GetSAMLProviderResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CreateDate.foreach(__v => __obj.update("CreateDate", __v.asInstanceOf[js.Any]))
      SAMLMetadataDocument.foreach(__v => __obj.update("SAMLMetadataDocument", __v.asInstanceOf[js.Any]))
      ValidUntil.foreach(__v => __obj.update("ValidUntil", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSAMLProviderResponse]
    }
  }

  @js.native
  trait GetSSHPublicKeyRequest extends js.Object {
    var Encoding: encodingType
    var SSHPublicKeyId: publicKeyIdType
    var UserName: userNameType
  }

  object GetSSHPublicKeyRequest {
    def apply(
        Encoding: encodingType,
        SSHPublicKeyId: publicKeyIdType,
        UserName: userNameType
    ): GetSSHPublicKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "Encoding"       -> Encoding.asInstanceOf[js.Any],
        "SSHPublicKeyId" -> SSHPublicKeyId.asInstanceOf[js.Any],
        "UserName"       -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSSHPublicKeyRequest]
    }
  }

  /**
    * Contains the response to a successful <a>GetSSHPublicKey</a> request.
    */
  @js.native
  trait GetSSHPublicKeyResponse extends js.Object {
    var SSHPublicKey: js.UndefOr[SSHPublicKey]
  }

  object GetSSHPublicKeyResponse {
    def apply(
        SSHPublicKey: js.UndefOr[SSHPublicKey] = js.undefined
    ): GetSSHPublicKeyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      SSHPublicKey.foreach(__v => __obj.update("SSHPublicKey", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSSHPublicKeyResponse]
    }
  }

  @js.native
  trait GetServerCertificateRequest extends js.Object {
    var ServerCertificateName: serverCertificateNameType
  }

  object GetServerCertificateRequest {
    def apply(
        ServerCertificateName: serverCertificateNameType
    ): GetServerCertificateRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServerCertificateName" -> ServerCertificateName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetServerCertificateRequest]
    }
  }

  /**
    * Contains the response to a successful <a>GetServerCertificate</a> request.
    */
  @js.native
  trait GetServerCertificateResponse extends js.Object {
    var ServerCertificate: ServerCertificate
  }

  object GetServerCertificateResponse {
    def apply(
        ServerCertificate: ServerCertificate
    ): GetServerCertificateResponse = {
      val __obj = js.Dictionary[js.Any](
        "ServerCertificate" -> ServerCertificate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetServerCertificateResponse]
    }
  }

  @js.native
  trait GetServiceLastAccessedDetailsRequest extends js.Object {
    var JobId: jobIDType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object GetServiceLastAccessedDetailsRequest {
    def apply(
        JobId: jobIDType,
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): GetServiceLastAccessedDetailsRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceLastAccessedDetailsRequest]
    }
  }

  @js.native
  trait GetServiceLastAccessedDetailsResponse extends js.Object {
    var JobCompletionDate: dateType
    var JobCreationDate: dateType
    var JobStatus: jobStatusType
    var ServicesLastAccessed: ServicesLastAccessed
    var Error: js.UndefOr[ErrorDetails]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object GetServiceLastAccessedDetailsResponse {
    def apply(
        JobCompletionDate: dateType,
        JobCreationDate: dateType,
        JobStatus: jobStatusType,
        ServicesLastAccessed: ServicesLastAccessed,
        Error: js.UndefOr[ErrorDetails] = js.undefined,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): GetServiceLastAccessedDetailsResponse = {
      val __obj = js.Dictionary[js.Any](
        "JobCompletionDate"    -> JobCompletionDate.asInstanceOf[js.Any],
        "JobCreationDate"      -> JobCreationDate.asInstanceOf[js.Any],
        "JobStatus"            -> JobStatus.asInstanceOf[js.Any],
        "ServicesLastAccessed" -> ServicesLastAccessed.asInstanceOf[js.Any]
      )

      Error.foreach(__v => __obj.update("Error", __v.asInstanceOf[js.Any]))
      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceLastAccessedDetailsResponse]
    }
  }

  @js.native
  trait GetServiceLastAccessedDetailsWithEntitiesRequest extends js.Object {
    var JobId: jobIDType
    var ServiceNamespace: serviceNamespaceType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object GetServiceLastAccessedDetailsWithEntitiesRequest {
    def apply(
        JobId: jobIDType,
        ServiceNamespace: serviceNamespaceType,
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): GetServiceLastAccessedDetailsWithEntitiesRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobId"            -> JobId.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceLastAccessedDetailsWithEntitiesRequest]
    }
  }

  @js.native
  trait GetServiceLastAccessedDetailsWithEntitiesResponse extends js.Object {
    var EntityDetailsList: entityDetailsListType
    var JobCompletionDate: dateType
    var JobCreationDate: dateType
    var JobStatus: jobStatusType
    var Error: js.UndefOr[ErrorDetails]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object GetServiceLastAccessedDetailsWithEntitiesResponse {
    def apply(
        EntityDetailsList: entityDetailsListType,
        JobCompletionDate: dateType,
        JobCreationDate: dateType,
        JobStatus: jobStatusType,
        Error: js.UndefOr[ErrorDetails] = js.undefined,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): GetServiceLastAccessedDetailsWithEntitiesResponse = {
      val __obj = js.Dictionary[js.Any](
        "EntityDetailsList" -> EntityDetailsList.asInstanceOf[js.Any],
        "JobCompletionDate" -> JobCompletionDate.asInstanceOf[js.Any],
        "JobCreationDate"   -> JobCreationDate.asInstanceOf[js.Any],
        "JobStatus"         -> JobStatus.asInstanceOf[js.Any]
      )

      Error.foreach(__v => __obj.update("Error", __v.asInstanceOf[js.Any]))
      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceLastAccessedDetailsWithEntitiesResponse]
    }
  }

  @js.native
  trait GetServiceLinkedRoleDeletionStatusRequest extends js.Object {
    var DeletionTaskId: DeletionTaskIdType
  }

  object GetServiceLinkedRoleDeletionStatusRequest {
    def apply(
        DeletionTaskId: DeletionTaskIdType
    ): GetServiceLinkedRoleDeletionStatusRequest = {
      val __obj = js.Dictionary[js.Any](
        "DeletionTaskId" -> DeletionTaskId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetServiceLinkedRoleDeletionStatusRequest]
    }
  }

  @js.native
  trait GetServiceLinkedRoleDeletionStatusResponse extends js.Object {
    var Status: DeletionTaskStatusType
    var Reason: js.UndefOr[DeletionTaskFailureReasonType]
  }

  object GetServiceLinkedRoleDeletionStatusResponse {
    def apply(
        Status: DeletionTaskStatusType,
        Reason: js.UndefOr[DeletionTaskFailureReasonType] = js.undefined
    ): GetServiceLinkedRoleDeletionStatusResponse = {
      val __obj = js.Dictionary[js.Any](
        "Status" -> Status.asInstanceOf[js.Any]
      )

      Reason.foreach(__v => __obj.update("Reason", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceLinkedRoleDeletionStatusResponse]
    }
  }

  @js.native
  trait GetUserPolicyRequest extends js.Object {
    var PolicyName: policyNameType
    var UserName: existingUserNameType
  }

  object GetUserPolicyRequest {
    def apply(
        PolicyName: policyNameType,
        UserName: existingUserNameType
    ): GetUserPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "UserName"   -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetUserPolicyRequest]
    }
  }

  /**
    * Contains the response to a successful <a>GetUserPolicy</a> request.
    */
  @js.native
  trait GetUserPolicyResponse extends js.Object {
    var PolicyDocument: policyDocumentType
    var PolicyName: policyNameType
    var UserName: existingUserNameType
  }

  object GetUserPolicyResponse {
    def apply(
        PolicyDocument: policyDocumentType,
        PolicyName: policyNameType,
        UserName: existingUserNameType
    ): GetUserPolicyResponse = {
      val __obj = js.Dictionary[js.Any](
        "PolicyDocument" -> PolicyDocument.asInstanceOf[js.Any],
        "PolicyName"     -> PolicyName.asInstanceOf[js.Any],
        "UserName"       -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetUserPolicyResponse]
    }
  }

  @js.native
  trait GetUserRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
  }

  object GetUserRequest {
    def apply(
        UserName: js.UndefOr[existingUserNameType] = js.undefined
    ): GetUserRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserRequest]
    }
  }

  /**
    * Contains the response to a successful <a>GetUser</a> request.
    */
  @js.native
  trait GetUserResponse extends js.Object {
    var User: User
  }

  object GetUserResponse {
    def apply(
        User: User
    ): GetUserResponse = {
      val __obj = js.Dictionary[js.Any](
        "User" -> User.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetUserResponse]
    }
  }

  /**
    * Contains information about an IAM group entity.
    *  This data type is used as a response element in the following operations:
    * * <a>CreateGroup</a>
    *  * <a>GetGroup</a>
    *  * <a>ListGroups</a>
    */
  @js.native
  trait Group extends js.Object {
    var Arn: arnType
    var CreateDate: dateType
    var GroupId: idType
    var GroupName: groupNameType
    var Path: pathType
  }

  object Group {
    def apply(
        Arn: arnType,
        CreateDate: dateType,
        GroupId: idType,
        GroupName: groupNameType,
        Path: pathType
    ): Group = {
      val __obj = js.Dictionary[js.Any](
        "Arn"        -> Arn.asInstanceOf[js.Any],
        "CreateDate" -> CreateDate.asInstanceOf[js.Any],
        "GroupId"    -> GroupId.asInstanceOf[js.Any],
        "GroupName"  -> GroupName.asInstanceOf[js.Any],
        "Path"       -> Path.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Group]
    }
  }

  /**
    * Contains information about an IAM group, including all of the group's policies.
    *  This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.
    */
  @js.native
  trait GroupDetail extends js.Object {
    var Arn: js.UndefOr[arnType]
    var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType]
    var CreateDate: js.UndefOr[dateType]
    var GroupId: js.UndefOr[idType]
    var GroupName: js.UndefOr[groupNameType]
    var GroupPolicyList: js.UndefOr[policyDetailListType]
    var Path: js.UndefOr[pathType]
  }

  object GroupDetail {
    def apply(
        Arn: js.UndefOr[arnType] = js.undefined,
        AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined,
        CreateDate: js.UndefOr[dateType] = js.undefined,
        GroupId: js.UndefOr[idType] = js.undefined,
        GroupName: js.UndefOr[groupNameType] = js.undefined,
        GroupPolicyList: js.UndefOr[policyDetailListType] = js.undefined,
        Path: js.UndefOr[pathType] = js.undefined
    ): GroupDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      AttachedManagedPolicies.foreach(__v => __obj.update("AttachedManagedPolicies", __v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.update("CreateDate", __v.asInstanceOf[js.Any]))
      GroupId.foreach(__v => __obj.update("GroupId", __v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.update("GroupName", __v.asInstanceOf[js.Any]))
      GroupPolicyList.foreach(__v => __obj.update("GroupPolicyList", __v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.update("Path", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupDetail]
    }
  }

  /**
    * Contains information about an instance profile.
    *  This data type is used as a response element in the following operations:
    * * <a>CreateInstanceProfile</a>
    *  * <a>GetInstanceProfile</a>
    *  * <a>ListInstanceProfiles</a>
    *  * <a>ListInstanceProfilesForRole</a>
    */
  @js.native
  trait InstanceProfile extends js.Object {
    var Arn: arnType
    var CreateDate: dateType
    var InstanceProfileId: idType
    var InstanceProfileName: instanceProfileNameType
    var Path: pathType
    var Roles: roleListType
  }

  object InstanceProfile {
    def apply(
        Arn: arnType,
        CreateDate: dateType,
        InstanceProfileId: idType,
        InstanceProfileName: instanceProfileNameType,
        Path: pathType,
        Roles: roleListType
    ): InstanceProfile = {
      val __obj = js.Dictionary[js.Any](
        "Arn"                 -> Arn.asInstanceOf[js.Any],
        "CreateDate"          -> CreateDate.asInstanceOf[js.Any],
        "InstanceProfileId"   -> InstanceProfileId.asInstanceOf[js.Any],
        "InstanceProfileName" -> InstanceProfileName.asInstanceOf[js.Any],
        "Path"                -> Path.asInstanceOf[js.Any],
        "Roles"               -> Roles.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InstanceProfile]
    }
  }

  @js.native
  trait ListAccessKeysRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var UserName: js.UndefOr[existingUserNameType]
  }

  object ListAccessKeysRequest {
    def apply(
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined,
        UserName: js.UndefOr[existingUserNameType] = js.undefined
    ): ListAccessKeysRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccessKeysRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListAccessKeys</a> request.
    */
  @js.native
  trait ListAccessKeysResponse extends js.Object {
    var AccessKeyMetadata: accessKeyMetadataListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object ListAccessKeysResponse {
    def apply(
        AccessKeyMetadata: accessKeyMetadataListType,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): ListAccessKeysResponse = {
      val __obj = js.Dictionary[js.Any](
        "AccessKeyMetadata" -> AccessKeyMetadata.asInstanceOf[js.Any]
      )

      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccessKeysResponse]
    }
  }

  @js.native
  trait ListAccountAliasesRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListAccountAliasesRequest {
    def apply(
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListAccountAliasesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountAliasesRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListAccountAliases</a> request.
    */
  @js.native
  trait ListAccountAliasesResponse extends js.Object {
    var AccountAliases: accountAliasListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object ListAccountAliasesResponse {
    def apply(
        AccountAliases: accountAliasListType,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): ListAccountAliasesResponse = {
      val __obj = js.Dictionary[js.Any](
        "AccountAliases" -> AccountAliases.asInstanceOf[js.Any]
      )

      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountAliasesResponse]
    }
  }

  @js.native
  trait ListAttachedGroupPoliciesRequest extends js.Object {
    var GroupName: groupNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var PathPrefix: js.UndefOr[policyPathType]
  }

  object ListAttachedGroupPoliciesRequest {
    def apply(
        GroupName: groupNameType,
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined,
        PathPrefix: js.UndefOr[policyPathType] = js.undefined
    ): ListAttachedGroupPoliciesRequest = {
      val __obj = js.Dictionary[js.Any](
        "GroupName" -> GroupName.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      PathPrefix.foreach(__v => __obj.update("PathPrefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttachedGroupPoliciesRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListAttachedGroupPolicies</a> request.
    */
  @js.native
  trait ListAttachedGroupPoliciesResponse extends js.Object {
    var AttachedPolicies: js.UndefOr[attachedPoliciesListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object ListAttachedGroupPoliciesResponse {
    def apply(
        AttachedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): ListAttachedGroupPoliciesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AttachedPolicies.foreach(__v => __obj.update("AttachedPolicies", __v.asInstanceOf[js.Any]))
      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttachedGroupPoliciesResponse]
    }
  }

  @js.native
  trait ListAttachedRolePoliciesRequest extends js.Object {
    var RoleName: roleNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var PathPrefix: js.UndefOr[policyPathType]
  }

  object ListAttachedRolePoliciesRequest {
    def apply(
        RoleName: roleNameType,
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined,
        PathPrefix: js.UndefOr[policyPathType] = js.undefined
    ): ListAttachedRolePoliciesRequest = {
      val __obj = js.Dictionary[js.Any](
        "RoleName" -> RoleName.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      PathPrefix.foreach(__v => __obj.update("PathPrefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttachedRolePoliciesRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListAttachedRolePolicies</a> request.
    */
  @js.native
  trait ListAttachedRolePoliciesResponse extends js.Object {
    var AttachedPolicies: js.UndefOr[attachedPoliciesListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object ListAttachedRolePoliciesResponse {
    def apply(
        AttachedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): ListAttachedRolePoliciesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AttachedPolicies.foreach(__v => __obj.update("AttachedPolicies", __v.asInstanceOf[js.Any]))
      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttachedRolePoliciesResponse]
    }
  }

  @js.native
  trait ListAttachedUserPoliciesRequest extends js.Object {
    var UserName: userNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var PathPrefix: js.UndefOr[policyPathType]
  }

  object ListAttachedUserPoliciesRequest {
    def apply(
        UserName: userNameType,
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined,
        PathPrefix: js.UndefOr[policyPathType] = js.undefined
    ): ListAttachedUserPoliciesRequest = {
      val __obj = js.Dictionary[js.Any](
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      PathPrefix.foreach(__v => __obj.update("PathPrefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttachedUserPoliciesRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListAttachedUserPolicies</a> request.
    */
  @js.native
  trait ListAttachedUserPoliciesResponse extends js.Object {
    var AttachedPolicies: js.UndefOr[attachedPoliciesListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object ListAttachedUserPoliciesResponse {
    def apply(
        AttachedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): ListAttachedUserPoliciesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AttachedPolicies.foreach(__v => __obj.update("AttachedPolicies", __v.asInstanceOf[js.Any]))
      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttachedUserPoliciesResponse]
    }
  }

  @js.native
  trait ListEntitiesForPolicyRequest extends js.Object {
    var PolicyArn: arnType
    var EntityFilter: js.UndefOr[EntityType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var PathPrefix: js.UndefOr[pathType]
    var PolicyUsageFilter: js.UndefOr[PolicyUsageType]
  }

  object ListEntitiesForPolicyRequest {
    def apply(
        PolicyArn: arnType,
        EntityFilter: js.UndefOr[EntityType] = js.undefined,
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined,
        PathPrefix: js.UndefOr[pathType] = js.undefined,
        PolicyUsageFilter: js.UndefOr[PolicyUsageType] = js.undefined
    ): ListEntitiesForPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyArn" -> PolicyArn.asInstanceOf[js.Any]
      )

      EntityFilter.foreach(__v => __obj.update("EntityFilter", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      PathPrefix.foreach(__v => __obj.update("PathPrefix", __v.asInstanceOf[js.Any]))
      PolicyUsageFilter.foreach(__v => __obj.update("PolicyUsageFilter", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntitiesForPolicyRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListEntitiesForPolicy</a> request.
    */
  @js.native
  trait ListEntitiesForPolicyResponse extends js.Object {
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
    var PolicyGroups: js.UndefOr[PolicyGroupListType]
    var PolicyRoles: js.UndefOr[PolicyRoleListType]
    var PolicyUsers: js.UndefOr[PolicyUserListType]
  }

  object ListEntitiesForPolicyResponse {
    def apply(
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined,
        PolicyGroups: js.UndefOr[PolicyGroupListType] = js.undefined,
        PolicyRoles: js.UndefOr[PolicyRoleListType] = js.undefined,
        PolicyUsers: js.UndefOr[PolicyUserListType] = js.undefined
    ): ListEntitiesForPolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      PolicyGroups.foreach(__v => __obj.update("PolicyGroups", __v.asInstanceOf[js.Any]))
      PolicyRoles.foreach(__v => __obj.update("PolicyRoles", __v.asInstanceOf[js.Any]))
      PolicyUsers.foreach(__v => __obj.update("PolicyUsers", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntitiesForPolicyResponse]
    }
  }

  @js.native
  trait ListGroupPoliciesRequest extends js.Object {
    var GroupName: groupNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListGroupPoliciesRequest {
    def apply(
        GroupName: groupNameType,
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListGroupPoliciesRequest = {
      val __obj = js.Dictionary[js.Any](
        "GroupName" -> GroupName.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupPoliciesRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListGroupPolicies</a> request.
    */
  @js.native
  trait ListGroupPoliciesResponse extends js.Object {
    var PolicyNames: policyNameListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object ListGroupPoliciesResponse {
    def apply(
        PolicyNames: policyNameListType,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): ListGroupPoliciesResponse = {
      val __obj = js.Dictionary[js.Any](
        "PolicyNames" -> PolicyNames.asInstanceOf[js.Any]
      )

      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupPoliciesResponse]
    }
  }

  @js.native
  trait ListGroupsForUserRequest extends js.Object {
    var UserName: existingUserNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListGroupsForUserRequest {
    def apply(
        UserName: existingUserNameType,
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListGroupsForUserRequest = {
      val __obj = js.Dictionary[js.Any](
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsForUserRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListGroupsForUser</a> request.
    */
  @js.native
  trait ListGroupsForUserResponse extends js.Object {
    var Groups: groupListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object ListGroupsForUserResponse {
    def apply(
        Groups: groupListType,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): ListGroupsForUserResponse = {
      val __obj = js.Dictionary[js.Any](
        "Groups" -> Groups.asInstanceOf[js.Any]
      )

      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsForUserResponse]
    }
  }

  @js.native
  trait ListGroupsRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var PathPrefix: js.UndefOr[pathPrefixType]
  }

  object ListGroupsRequest {
    def apply(
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined,
        PathPrefix: js.UndefOr[pathPrefixType] = js.undefined
    ): ListGroupsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      PathPrefix.foreach(__v => __obj.update("PathPrefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListGroups</a> request.
    */
  @js.native
  trait ListGroupsResponse extends js.Object {
    var Groups: groupListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object ListGroupsResponse {
    def apply(
        Groups: groupListType,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): ListGroupsResponse = {
      val __obj = js.Dictionary[js.Any](
        "Groups" -> Groups.asInstanceOf[js.Any]
      )

      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsResponse]
    }
  }

  @js.native
  trait ListInstanceProfilesForRoleRequest extends js.Object {
    var RoleName: roleNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListInstanceProfilesForRoleRequest {
    def apply(
        RoleName: roleNameType,
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListInstanceProfilesForRoleRequest = {
      val __obj = js.Dictionary[js.Any](
        "RoleName" -> RoleName.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstanceProfilesForRoleRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListInstanceProfilesForRole</a> request.
    */
  @js.native
  trait ListInstanceProfilesForRoleResponse extends js.Object {
    var InstanceProfiles: instanceProfileListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object ListInstanceProfilesForRoleResponse {
    def apply(
        InstanceProfiles: instanceProfileListType,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): ListInstanceProfilesForRoleResponse = {
      val __obj = js.Dictionary[js.Any](
        "InstanceProfiles" -> InstanceProfiles.asInstanceOf[js.Any]
      )

      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstanceProfilesForRoleResponse]
    }
  }

  @js.native
  trait ListInstanceProfilesRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var PathPrefix: js.UndefOr[pathPrefixType]
  }

  object ListInstanceProfilesRequest {
    def apply(
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined,
        PathPrefix: js.UndefOr[pathPrefixType] = js.undefined
    ): ListInstanceProfilesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      PathPrefix.foreach(__v => __obj.update("PathPrefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstanceProfilesRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListInstanceProfiles</a> request.
    */
  @js.native
  trait ListInstanceProfilesResponse extends js.Object {
    var InstanceProfiles: instanceProfileListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object ListInstanceProfilesResponse {
    def apply(
        InstanceProfiles: instanceProfileListType,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): ListInstanceProfilesResponse = {
      val __obj = js.Dictionary[js.Any](
        "InstanceProfiles" -> InstanceProfiles.asInstanceOf[js.Any]
      )

      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstanceProfilesResponse]
    }
  }

  @js.native
  trait ListMFADevicesRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var UserName: js.UndefOr[existingUserNameType]
  }

  object ListMFADevicesRequest {
    def apply(
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined,
        UserName: js.UndefOr[existingUserNameType] = js.undefined
    ): ListMFADevicesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMFADevicesRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListMFADevices</a> request.
    */
  @js.native
  trait ListMFADevicesResponse extends js.Object {
    var MFADevices: mfaDeviceListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object ListMFADevicesResponse {
    def apply(
        MFADevices: mfaDeviceListType,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): ListMFADevicesResponse = {
      val __obj = js.Dictionary[js.Any](
        "MFADevices" -> MFADevices.asInstanceOf[js.Any]
      )

      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMFADevicesResponse]
    }
  }

  @js.native
  trait ListOpenIDConnectProvidersRequest extends js.Object {}

  object ListOpenIDConnectProvidersRequest {
    def apply(
        ): ListOpenIDConnectProvidersRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[ListOpenIDConnectProvidersRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListOpenIDConnectProviders</a> request.
    */
  @js.native
  trait ListOpenIDConnectProvidersResponse extends js.Object {
    var OpenIDConnectProviderList: js.UndefOr[OpenIDConnectProviderListType]
  }

  object ListOpenIDConnectProvidersResponse {
    def apply(
        OpenIDConnectProviderList: js.UndefOr[OpenIDConnectProviderListType] = js.undefined
    ): ListOpenIDConnectProvidersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      OpenIDConnectProviderList.foreach(__v => __obj.update("OpenIDConnectProviderList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOpenIDConnectProvidersResponse]
    }
  }

  /**
    * Contains details about the permissions policies that are attached to the specified identity (user, group, or role).
    *  This data type is used as a response element in the <a>ListPoliciesGrantingServiceAccess</a> operation.
    */
  @js.native
  trait ListPoliciesGrantingServiceAccessEntry extends js.Object {
    var Policies: js.UndefOr[policyGrantingServiceAccessListType]
    var ServiceNamespace: js.UndefOr[serviceNamespaceType]
  }

  object ListPoliciesGrantingServiceAccessEntry {
    def apply(
        Policies: js.UndefOr[policyGrantingServiceAccessListType] = js.undefined,
        ServiceNamespace: js.UndefOr[serviceNamespaceType] = js.undefined
    ): ListPoliciesGrantingServiceAccessEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      Policies.foreach(__v => __obj.update("Policies", __v.asInstanceOf[js.Any]))
      ServiceNamespace.foreach(__v => __obj.update("ServiceNamespace", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPoliciesGrantingServiceAccessEntry]
    }
  }

  @js.native
  trait ListPoliciesGrantingServiceAccessRequest extends js.Object {
    var Arn: arnType
    var ServiceNamespaces: serviceNamespaceListType
    var Marker: js.UndefOr[markerType]
  }

  object ListPoliciesGrantingServiceAccessRequest {
    def apply(
        Arn: arnType,
        ServiceNamespaces: serviceNamespaceListType,
        Marker: js.UndefOr[markerType] = js.undefined
    ): ListPoliciesGrantingServiceAccessRequest = {
      val __obj = js.Dictionary[js.Any](
        "Arn"               -> Arn.asInstanceOf[js.Any],
        "ServiceNamespaces" -> ServiceNamespaces.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPoliciesGrantingServiceAccessRequest]
    }
  }

  @js.native
  trait ListPoliciesGrantingServiceAccessResponse extends js.Object {
    var PoliciesGrantingServiceAccess: listPolicyGrantingServiceAccessResponseListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object ListPoliciesGrantingServiceAccessResponse {
    def apply(
        PoliciesGrantingServiceAccess: listPolicyGrantingServiceAccessResponseListType,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): ListPoliciesGrantingServiceAccessResponse = {
      val __obj = js.Dictionary[js.Any](
        "PoliciesGrantingServiceAccess" -> PoliciesGrantingServiceAccess.asInstanceOf[js.Any]
      )

      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPoliciesGrantingServiceAccessResponse]
    }
  }

  @js.native
  trait ListPoliciesRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var OnlyAttached: js.UndefOr[booleanType]
    var PathPrefix: js.UndefOr[policyPathType]
    var PolicyUsageFilter: js.UndefOr[PolicyUsageType]
    var Scope: js.UndefOr[policyScopeType]
  }

  object ListPoliciesRequest {
    def apply(
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined,
        OnlyAttached: js.UndefOr[booleanType] = js.undefined,
        PathPrefix: js.UndefOr[policyPathType] = js.undefined,
        PolicyUsageFilter: js.UndefOr[PolicyUsageType] = js.undefined,
        Scope: js.UndefOr[policyScopeType] = js.undefined
    ): ListPoliciesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      OnlyAttached.foreach(__v => __obj.update("OnlyAttached", __v.asInstanceOf[js.Any]))
      PathPrefix.foreach(__v => __obj.update("PathPrefix", __v.asInstanceOf[js.Any]))
      PolicyUsageFilter.foreach(__v => __obj.update("PolicyUsageFilter", __v.asInstanceOf[js.Any]))
      Scope.foreach(__v => __obj.update("Scope", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPoliciesRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListPolicies</a> request.
    */
  @js.native
  trait ListPoliciesResponse extends js.Object {
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
    var Policies: js.UndefOr[policyListType]
  }

  object ListPoliciesResponse {
    def apply(
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined,
        Policies: js.UndefOr[policyListType] = js.undefined
    ): ListPoliciesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      Policies.foreach(__v => __obj.update("Policies", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPoliciesResponse]
    }
  }

  @js.native
  trait ListPolicyVersionsRequest extends js.Object {
    var PolicyArn: arnType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListPolicyVersionsRequest {
    def apply(
        PolicyArn: arnType,
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListPolicyVersionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyArn" -> PolicyArn.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPolicyVersionsRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListPolicyVersions</a> request.
    */
  @js.native
  trait ListPolicyVersionsResponse extends js.Object {
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
    var Versions: js.UndefOr[policyDocumentVersionListType]
  }

  object ListPolicyVersionsResponse {
    def apply(
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined,
        Versions: js.UndefOr[policyDocumentVersionListType] = js.undefined
    ): ListPolicyVersionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      Versions.foreach(__v => __obj.update("Versions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPolicyVersionsResponse]
    }
  }

  @js.native
  trait ListRolePoliciesRequest extends js.Object {
    var RoleName: roleNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListRolePoliciesRequest {
    def apply(
        RoleName: roleNameType,
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListRolePoliciesRequest = {
      val __obj = js.Dictionary[js.Any](
        "RoleName" -> RoleName.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRolePoliciesRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListRolePolicies</a> request.
    */
  @js.native
  trait ListRolePoliciesResponse extends js.Object {
    var PolicyNames: policyNameListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object ListRolePoliciesResponse {
    def apply(
        PolicyNames: policyNameListType,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): ListRolePoliciesResponse = {
      val __obj = js.Dictionary[js.Any](
        "PolicyNames" -> PolicyNames.asInstanceOf[js.Any]
      )

      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRolePoliciesResponse]
    }
  }

  @js.native
  trait ListRoleTagsRequest extends js.Object {
    var RoleName: roleNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListRoleTagsRequest {
    def apply(
        RoleName: roleNameType,
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListRoleTagsRequest = {
      val __obj = js.Dictionary[js.Any](
        "RoleName" -> RoleName.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoleTagsRequest]
    }
  }

  @js.native
  trait ListRoleTagsResponse extends js.Object {
    var Tags: tagListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object ListRoleTagsResponse {
    def apply(
        Tags: tagListType,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): ListRoleTagsResponse = {
      val __obj = js.Dictionary[js.Any](
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoleTagsResponse]
    }
  }

  @js.native
  trait ListRolesRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var PathPrefix: js.UndefOr[pathPrefixType]
  }

  object ListRolesRequest {
    def apply(
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined,
        PathPrefix: js.UndefOr[pathPrefixType] = js.undefined
    ): ListRolesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      PathPrefix.foreach(__v => __obj.update("PathPrefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRolesRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListRoles</a> request.
    */
  @js.native
  trait ListRolesResponse extends js.Object {
    var Roles: roleListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object ListRolesResponse {
    def apply(
        Roles: roleListType,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): ListRolesResponse = {
      val __obj = js.Dictionary[js.Any](
        "Roles" -> Roles.asInstanceOf[js.Any]
      )

      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRolesResponse]
    }
  }

  @js.native
  trait ListSAMLProvidersRequest extends js.Object {}

  object ListSAMLProvidersRequest {
    def apply(
        ): ListSAMLProvidersRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[ListSAMLProvidersRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListSAMLProviders</a> request.
    */
  @js.native
  trait ListSAMLProvidersResponse extends js.Object {
    var SAMLProviderList: js.UndefOr[SAMLProviderListType]
  }

  object ListSAMLProvidersResponse {
    def apply(
        SAMLProviderList: js.UndefOr[SAMLProviderListType] = js.undefined
    ): ListSAMLProvidersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      SAMLProviderList.foreach(__v => __obj.update("SAMLProviderList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSAMLProvidersResponse]
    }
  }

  @js.native
  trait ListSSHPublicKeysRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var UserName: js.UndefOr[userNameType]
  }

  object ListSSHPublicKeysRequest {
    def apply(
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined,
        UserName: js.UndefOr[userNameType] = js.undefined
    ): ListSSHPublicKeysRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSSHPublicKeysRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListSSHPublicKeys</a> request.
    */
  @js.native
  trait ListSSHPublicKeysResponse extends js.Object {
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
    var SSHPublicKeys: js.UndefOr[SSHPublicKeyListType]
  }

  object ListSSHPublicKeysResponse {
    def apply(
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined,
        SSHPublicKeys: js.UndefOr[SSHPublicKeyListType] = js.undefined
    ): ListSSHPublicKeysResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      SSHPublicKeys.foreach(__v => __obj.update("SSHPublicKeys", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSSHPublicKeysResponse]
    }
  }

  @js.native
  trait ListServerCertificatesRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var PathPrefix: js.UndefOr[pathPrefixType]
  }

  object ListServerCertificatesRequest {
    def apply(
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined,
        PathPrefix: js.UndefOr[pathPrefixType] = js.undefined
    ): ListServerCertificatesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      PathPrefix.foreach(__v => __obj.update("PathPrefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServerCertificatesRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListServerCertificates</a> request.
    */
  @js.native
  trait ListServerCertificatesResponse extends js.Object {
    var ServerCertificateMetadataList: serverCertificateMetadataListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object ListServerCertificatesResponse {
    def apply(
        ServerCertificateMetadataList: serverCertificateMetadataListType,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): ListServerCertificatesResponse = {
      val __obj = js.Dictionary[js.Any](
        "ServerCertificateMetadataList" -> ServerCertificateMetadataList.asInstanceOf[js.Any]
      )

      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServerCertificatesResponse]
    }
  }

  @js.native
  trait ListServiceSpecificCredentialsRequest extends js.Object {
    var ServiceName: js.UndefOr[serviceName]
    var UserName: js.UndefOr[userNameType]
  }

  object ListServiceSpecificCredentialsRequest {
    def apply(
        ServiceName: js.UndefOr[serviceName] = js.undefined,
        UserName: js.UndefOr[userNameType] = js.undefined
    ): ListServiceSpecificCredentialsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      ServiceName.foreach(__v => __obj.update("ServiceName", __v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceSpecificCredentialsRequest]
    }
  }

  @js.native
  trait ListServiceSpecificCredentialsResponse extends js.Object {
    var ServiceSpecificCredentials: js.UndefOr[ServiceSpecificCredentialsListType]
  }

  object ListServiceSpecificCredentialsResponse {
    def apply(
        ServiceSpecificCredentials: js.UndefOr[ServiceSpecificCredentialsListType] = js.undefined
    ): ListServiceSpecificCredentialsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ServiceSpecificCredentials.foreach(__v => __obj.update("ServiceSpecificCredentials", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceSpecificCredentialsResponse]
    }
  }

  @js.native
  trait ListSigningCertificatesRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var UserName: js.UndefOr[existingUserNameType]
  }

  object ListSigningCertificatesRequest {
    def apply(
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined,
        UserName: js.UndefOr[existingUserNameType] = js.undefined
    ): ListSigningCertificatesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSigningCertificatesRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListSigningCertificates</a> request.
    */
  @js.native
  trait ListSigningCertificatesResponse extends js.Object {
    var Certificates: certificateListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object ListSigningCertificatesResponse {
    def apply(
        Certificates: certificateListType,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): ListSigningCertificatesResponse = {
      val __obj = js.Dictionary[js.Any](
        "Certificates" -> Certificates.asInstanceOf[js.Any]
      )

      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSigningCertificatesResponse]
    }
  }

  @js.native
  trait ListUserPoliciesRequest extends js.Object {
    var UserName: existingUserNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListUserPoliciesRequest {
    def apply(
        UserName: existingUserNameType,
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListUserPoliciesRequest = {
      val __obj = js.Dictionary[js.Any](
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserPoliciesRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListUserPolicies</a> request.
    */
  @js.native
  trait ListUserPoliciesResponse extends js.Object {
    var PolicyNames: policyNameListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object ListUserPoliciesResponse {
    def apply(
        PolicyNames: policyNameListType,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): ListUserPoliciesResponse = {
      val __obj = js.Dictionary[js.Any](
        "PolicyNames" -> PolicyNames.asInstanceOf[js.Any]
      )

      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserPoliciesResponse]
    }
  }

  @js.native
  trait ListUserTagsRequest extends js.Object {
    var UserName: existingUserNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListUserTagsRequest {
    def apply(
        UserName: existingUserNameType,
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListUserTagsRequest = {
      val __obj = js.Dictionary[js.Any](
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserTagsRequest]
    }
  }

  @js.native
  trait ListUserTagsResponse extends js.Object {
    var Tags: tagListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object ListUserTagsResponse {
    def apply(
        Tags: tagListType,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): ListUserTagsResponse = {
      val __obj = js.Dictionary[js.Any](
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserTagsResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var PathPrefix: js.UndefOr[pathPrefixType]
  }

  object ListUsersRequest {
    def apply(
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined,
        PathPrefix: js.UndefOr[pathPrefixType] = js.undefined
    ): ListUsersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      PathPrefix.foreach(__v => __obj.update("PathPrefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListUsers</a> request.
    */
  @js.native
  trait ListUsersResponse extends js.Object {
    var Users: userListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object ListUsersResponse {
    def apply(
        Users: userListType,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): ListUsersResponse = {
      val __obj = js.Dictionary[js.Any](
        "Users" -> Users.asInstanceOf[js.Any]
      )

      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersResponse]
    }
  }

  @js.native
  trait ListVirtualMFADevicesRequest extends js.Object {
    var AssignmentStatus: js.UndefOr[assignmentStatusType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListVirtualMFADevicesRequest {
    def apply(
        AssignmentStatus: js.UndefOr[assignmentStatusType] = js.undefined,
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListVirtualMFADevicesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      AssignmentStatus.foreach(__v => __obj.update("AssignmentStatus", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVirtualMFADevicesRequest]
    }
  }

  /**
    * Contains the response to a successful <a>ListVirtualMFADevices</a> request.
    */
  @js.native
  trait ListVirtualMFADevicesResponse extends js.Object {
    var VirtualMFADevices: virtualMFADeviceListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object ListVirtualMFADevicesResponse {
    def apply(
        VirtualMFADevices: virtualMFADeviceListType,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): ListVirtualMFADevicesResponse = {
      val __obj = js.Dictionary[js.Any](
        "VirtualMFADevices" -> VirtualMFADevices.asInstanceOf[js.Any]
      )

      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVirtualMFADevicesResponse]
    }
  }

  /**
    * Contains the user name and password create date for a user.
    *  This data type is used as a response element in the <a>CreateLoginProfile</a> and <a>GetLoginProfile</a> operations.
    */
  @js.native
  trait LoginProfile extends js.Object {
    var CreateDate: dateType
    var UserName: userNameType
    var PasswordResetRequired: js.UndefOr[booleanType]
  }

  object LoginProfile {
    def apply(
        CreateDate: dateType,
        UserName: userNameType,
        PasswordResetRequired: js.UndefOr[booleanType] = js.undefined
    ): LoginProfile = {
      val __obj = js.Dictionary[js.Any](
        "CreateDate" -> CreateDate.asInstanceOf[js.Any],
        "UserName"   -> UserName.asInstanceOf[js.Any]
      )

      PasswordResetRequired.foreach(__v => __obj.update("PasswordResetRequired", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoginProfile]
    }
  }

  /**
    * Contains information about an MFA device.
    *  This data type is used as a response element in the <a>ListMFADevices</a> operation.
    */
  @js.native
  trait MFADevice extends js.Object {
    var EnableDate: dateType
    var SerialNumber: serialNumberType
    var UserName: userNameType
  }

  object MFADevice {
    def apply(
        EnableDate: dateType,
        SerialNumber: serialNumberType,
        UserName: userNameType
    ): MFADevice = {
      val __obj = js.Dictionary[js.Any](
        "EnableDate"   -> EnableDate.asInstanceOf[js.Any],
        "SerialNumber" -> SerialNumber.asInstanceOf[js.Any],
        "UserName"     -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MFADevice]
    }
  }

  /**
    * Contains information about a managed policy, including the policy's ARN, versions, and the number of principal entities (users, groups, and roles) that the policy is attached to.
    *  This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.
    *  For more information about managed policies, see [[https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html|Managed Policies and Inline Policies]] in the <i>Using IAM</i> guide.
    */
  @js.native
  trait ManagedPolicyDetail extends js.Object {
    var Arn: js.UndefOr[arnType]
    var AttachmentCount: js.UndefOr[attachmentCountType]
    var CreateDate: js.UndefOr[dateType]
    var DefaultVersionId: js.UndefOr[policyVersionIdType]
    var Description: js.UndefOr[policyDescriptionType]
    var IsAttachable: js.UndefOr[booleanType]
    var Path: js.UndefOr[policyPathType]
    var PermissionsBoundaryUsageCount: js.UndefOr[attachmentCountType]
    var PolicyId: js.UndefOr[idType]
    var PolicyName: js.UndefOr[policyNameType]
    var PolicyVersionList: js.UndefOr[policyDocumentVersionListType]
    var UpdateDate: js.UndefOr[dateType]
  }

  object ManagedPolicyDetail {
    def apply(
        Arn: js.UndefOr[arnType] = js.undefined,
        AttachmentCount: js.UndefOr[attachmentCountType] = js.undefined,
        CreateDate: js.UndefOr[dateType] = js.undefined,
        DefaultVersionId: js.UndefOr[policyVersionIdType] = js.undefined,
        Description: js.UndefOr[policyDescriptionType] = js.undefined,
        IsAttachable: js.UndefOr[booleanType] = js.undefined,
        Path: js.UndefOr[policyPathType] = js.undefined,
        PermissionsBoundaryUsageCount: js.UndefOr[attachmentCountType] = js.undefined,
        PolicyId: js.UndefOr[idType] = js.undefined,
        PolicyName: js.UndefOr[policyNameType] = js.undefined,
        PolicyVersionList: js.UndefOr[policyDocumentVersionListType] = js.undefined,
        UpdateDate: js.UndefOr[dateType] = js.undefined
    ): ManagedPolicyDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      AttachmentCount.foreach(__v => __obj.update("AttachmentCount", __v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.update("CreateDate", __v.asInstanceOf[js.Any]))
      DefaultVersionId.foreach(__v => __obj.update("DefaultVersionId", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      IsAttachable.foreach(__v => __obj.update("IsAttachable", __v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.update("Path", __v.asInstanceOf[js.Any]))
      PermissionsBoundaryUsageCount.foreach(
        __v => __obj.update("PermissionsBoundaryUsageCount", __v.asInstanceOf[js.Any])
      )
      PolicyId.foreach(__v => __obj.update("PolicyId", __v.asInstanceOf[js.Any]))
      PolicyName.foreach(__v => __obj.update("PolicyName", __v.asInstanceOf[js.Any]))
      PolicyVersionList.foreach(__v => __obj.update("PolicyVersionList", __v.asInstanceOf[js.Any]))
      UpdateDate.foreach(__v => __obj.update("UpdateDate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManagedPolicyDetail]
    }
  }

  /**
    * Contains the Amazon Resource Name (ARN) for an IAM OpenID Connect provider.
    */
  @js.native
  trait OpenIDConnectProviderListEntry extends js.Object {
    var Arn: js.UndefOr[arnType]
  }

  object OpenIDConnectProviderListEntry {
    def apply(
        Arn: js.UndefOr[arnType] = js.undefined
    ): OpenIDConnectProviderListEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpenIDConnectProviderListEntry]
    }
  }

  /**
    * Contains information about the effect that Organizations has on a policy simulation.
    */
  @js.native
  trait OrganizationsDecisionDetail extends js.Object {
    var AllowedByOrganizations: js.UndefOr[booleanType]
  }

  object OrganizationsDecisionDetail {
    def apply(
        AllowedByOrganizations: js.UndefOr[booleanType] = js.undefined
    ): OrganizationsDecisionDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      AllowedByOrganizations.foreach(__v => __obj.update("AllowedByOrganizations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrganizationsDecisionDetail]
    }
  }

  /**
    * Contains information about the account password policy.
    *  This data type is used as a response element in the <a>GetAccountPasswordPolicy</a> operation.
    */
  @js.native
  trait PasswordPolicy extends js.Object {
    var AllowUsersToChangePassword: js.UndefOr[booleanType]
    var ExpirePasswords: js.UndefOr[booleanType]
    var HardExpiry: js.UndefOr[booleanObjectType]
    var MaxPasswordAge: js.UndefOr[maxPasswordAgeType]
    var MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType]
    var PasswordReusePrevention: js.UndefOr[passwordReusePreventionType]
    var RequireLowercaseCharacters: js.UndefOr[booleanType]
    var RequireNumbers: js.UndefOr[booleanType]
    var RequireSymbols: js.UndefOr[booleanType]
    var RequireUppercaseCharacters: js.UndefOr[booleanType]
  }

  object PasswordPolicy {
    def apply(
        AllowUsersToChangePassword: js.UndefOr[booleanType] = js.undefined,
        ExpirePasswords: js.UndefOr[booleanType] = js.undefined,
        HardExpiry: js.UndefOr[booleanObjectType] = js.undefined,
        MaxPasswordAge: js.UndefOr[maxPasswordAgeType] = js.undefined,
        MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType] = js.undefined,
        PasswordReusePrevention: js.UndefOr[passwordReusePreventionType] = js.undefined,
        RequireLowercaseCharacters: js.UndefOr[booleanType] = js.undefined,
        RequireNumbers: js.UndefOr[booleanType] = js.undefined,
        RequireSymbols: js.UndefOr[booleanType] = js.undefined,
        RequireUppercaseCharacters: js.UndefOr[booleanType] = js.undefined
    ): PasswordPolicy = {
      val __obj = js.Dictionary.empty[js.Any]
      AllowUsersToChangePassword.foreach(__v => __obj.update("AllowUsersToChangePassword", __v.asInstanceOf[js.Any]))
      ExpirePasswords.foreach(__v => __obj.update("ExpirePasswords", __v.asInstanceOf[js.Any]))
      HardExpiry.foreach(__v => __obj.update("HardExpiry", __v.asInstanceOf[js.Any]))
      MaxPasswordAge.foreach(__v => __obj.update("MaxPasswordAge", __v.asInstanceOf[js.Any]))
      MinimumPasswordLength.foreach(__v => __obj.update("MinimumPasswordLength", __v.asInstanceOf[js.Any]))
      PasswordReusePrevention.foreach(__v => __obj.update("PasswordReusePrevention", __v.asInstanceOf[js.Any]))
      RequireLowercaseCharacters.foreach(__v => __obj.update("RequireLowercaseCharacters", __v.asInstanceOf[js.Any]))
      RequireNumbers.foreach(__v => __obj.update("RequireNumbers", __v.asInstanceOf[js.Any]))
      RequireSymbols.foreach(__v => __obj.update("RequireSymbols", __v.asInstanceOf[js.Any]))
      RequireUppercaseCharacters.foreach(__v => __obj.update("RequireUppercaseCharacters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PasswordPolicy]
    }
  }

  object PermissionsBoundaryAttachmentTypeEnum {
    val PermissionsBoundaryPolicy = "PermissionsBoundaryPolicy"

    val values = js.Object.freeze(js.Array(PermissionsBoundaryPolicy))
  }

  /**
    * Contains information about a managed policy.
    *  This data type is used as a response element in the <a>CreatePolicy</a>, <a>GetPolicy</a>, and <a>ListPolicies</a> operations.
    *  For more information about managed policies, refer to [[https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html|Managed Policies and Inline Policies]] in the <i>Using IAM</i> guide.
    */
  @js.native
  trait Policy extends js.Object {
    var Arn: js.UndefOr[arnType]
    var AttachmentCount: js.UndefOr[attachmentCountType]
    var CreateDate: js.UndefOr[dateType]
    var DefaultVersionId: js.UndefOr[policyVersionIdType]
    var Description: js.UndefOr[policyDescriptionType]
    var IsAttachable: js.UndefOr[booleanType]
    var Path: js.UndefOr[policyPathType]
    var PermissionsBoundaryUsageCount: js.UndefOr[attachmentCountType]
    var PolicyId: js.UndefOr[idType]
    var PolicyName: js.UndefOr[policyNameType]
    var UpdateDate: js.UndefOr[dateType]
  }

  object Policy {
    def apply(
        Arn: js.UndefOr[arnType] = js.undefined,
        AttachmentCount: js.UndefOr[attachmentCountType] = js.undefined,
        CreateDate: js.UndefOr[dateType] = js.undefined,
        DefaultVersionId: js.UndefOr[policyVersionIdType] = js.undefined,
        Description: js.UndefOr[policyDescriptionType] = js.undefined,
        IsAttachable: js.UndefOr[booleanType] = js.undefined,
        Path: js.UndefOr[policyPathType] = js.undefined,
        PermissionsBoundaryUsageCount: js.UndefOr[attachmentCountType] = js.undefined,
        PolicyId: js.UndefOr[idType] = js.undefined,
        PolicyName: js.UndefOr[policyNameType] = js.undefined,
        UpdateDate: js.UndefOr[dateType] = js.undefined
    ): Policy = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      AttachmentCount.foreach(__v => __obj.update("AttachmentCount", __v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.update("CreateDate", __v.asInstanceOf[js.Any]))
      DefaultVersionId.foreach(__v => __obj.update("DefaultVersionId", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      IsAttachable.foreach(__v => __obj.update("IsAttachable", __v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.update("Path", __v.asInstanceOf[js.Any]))
      PermissionsBoundaryUsageCount.foreach(
        __v => __obj.update("PermissionsBoundaryUsageCount", __v.asInstanceOf[js.Any])
      )
      PolicyId.foreach(__v => __obj.update("PolicyId", __v.asInstanceOf[js.Any]))
      PolicyName.foreach(__v => __obj.update("PolicyName", __v.asInstanceOf[js.Any]))
      UpdateDate.foreach(__v => __obj.update("UpdateDate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Policy]
    }
  }

  /**
    * Contains information about an IAM policy, including the policy document.
    *  This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.
    */
  @js.native
  trait PolicyDetail extends js.Object {
    var PolicyDocument: js.UndefOr[policyDocumentType]
    var PolicyName: js.UndefOr[policyNameType]
  }

  object PolicyDetail {
    def apply(
        PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined,
        PolicyName: js.UndefOr[policyNameType] = js.undefined
    ): PolicyDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      PolicyDocument.foreach(__v => __obj.update("PolicyDocument", __v.asInstanceOf[js.Any]))
      PolicyName.foreach(__v => __obj.update("PolicyName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyDetail]
    }
  }

  object PolicyEvaluationDecisionTypeEnum {
    val allowed      = "allowed"
    val explicitDeny = "explicitDeny"
    val implicitDeny = "implicitDeny"

    val values = js.Object.freeze(js.Array(allowed, explicitDeny, implicitDeny))
  }

  /**
    * Contains details about the permissions policies that are attached to the specified identity (user, group, or role).
    *  This data type is an element of the <a>ListPoliciesGrantingServiceAccessEntry</a> object.
    */
  @js.native
  trait PolicyGrantingServiceAccess extends js.Object {
    var PolicyName: policyNameType
    var PolicyType: policyType
    var EntityName: js.UndefOr[entityNameType]
    var EntityType: js.UndefOr[policyOwnerEntityType]
    var PolicyArn: js.UndefOr[arnType]
  }

  object PolicyGrantingServiceAccess {
    def apply(
        PolicyName: policyNameType,
        PolicyType: policyType,
        EntityName: js.UndefOr[entityNameType] = js.undefined,
        EntityType: js.UndefOr[policyOwnerEntityType] = js.undefined,
        PolicyArn: js.UndefOr[arnType] = js.undefined
    ): PolicyGrantingServiceAccess = {
      val __obj = js.Dictionary[js.Any](
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "PolicyType" -> PolicyType.asInstanceOf[js.Any]
      )

      EntityName.foreach(__v => __obj.update("EntityName", __v.asInstanceOf[js.Any]))
      EntityType.foreach(__v => __obj.update("EntityType", __v.asInstanceOf[js.Any]))
      PolicyArn.foreach(__v => __obj.update("PolicyArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyGrantingServiceAccess]
    }
  }

  /**
    * Contains information about a group that a managed policy is attached to.
    *  This data type is used as a response element in the <a>ListEntitiesForPolicy</a> operation.
    *  For more information about managed policies, refer to [[https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html|Managed Policies and Inline Policies]] in the <i>Using IAM</i> guide.
    */
  @js.native
  trait PolicyGroup extends js.Object {
    var GroupId: js.UndefOr[idType]
    var GroupName: js.UndefOr[groupNameType]
  }

  object PolicyGroup {
    def apply(
        GroupId: js.UndefOr[idType] = js.undefined,
        GroupName: js.UndefOr[groupNameType] = js.undefined
    ): PolicyGroup = {
      val __obj = js.Dictionary.empty[js.Any]
      GroupId.foreach(__v => __obj.update("GroupId", __v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.update("GroupName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyGroup]
    }
  }

  /**
    * Contains information about a role that a managed policy is attached to.
    *  This data type is used as a response element in the <a>ListEntitiesForPolicy</a> operation.
    *  For more information about managed policies, refer to [[https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html|Managed Policies and Inline Policies]] in the <i>Using IAM</i> guide.
    */
  @js.native
  trait PolicyRole extends js.Object {
    var RoleId: js.UndefOr[idType]
    var RoleName: js.UndefOr[roleNameType]
  }

  object PolicyRole {
    def apply(
        RoleId: js.UndefOr[idType] = js.undefined,
        RoleName: js.UndefOr[roleNameType] = js.undefined
    ): PolicyRole = {
      val __obj = js.Dictionary.empty[js.Any]
      RoleId.foreach(__v => __obj.update("RoleId", __v.asInstanceOf[js.Any]))
      RoleName.foreach(__v => __obj.update("RoleName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyRole]
    }
  }

  object PolicySourceTypeEnum {
    val user           = "user"
    val group          = "group"
    val role           = "role"
    val `aws-managed`  = "aws-managed"
    val `user-managed` = "user-managed"
    val resource       = "resource"
    val none           = "none"

    val values = js.Object.freeze(js.Array(user, group, role, `aws-managed`, `user-managed`, resource, none))
  }

  /**
    * The policy usage type that indicates whether the policy is used as a permissions policy or as the permissions boundary for an entity.
    *  For more information about permissions boundaries, see [[https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html|Permissions Boundaries for IAM Identities ]] in the <i>IAM User Guide</i>.
    */
  object PolicyUsageTypeEnum {
    val PermissionsPolicy   = "PermissionsPolicy"
    val PermissionsBoundary = "PermissionsBoundary"

    val values = js.Object.freeze(js.Array(PermissionsPolicy, PermissionsBoundary))
  }

  /**
    * Contains information about a user that a managed policy is attached to.
    *  This data type is used as a response element in the <a>ListEntitiesForPolicy</a> operation.
    *  For more information about managed policies, refer to [[https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html|Managed Policies and Inline Policies]] in the <i>Using IAM</i> guide.
    */
  @js.native
  trait PolicyUser extends js.Object {
    var UserId: js.UndefOr[idType]
    var UserName: js.UndefOr[userNameType]
  }

  object PolicyUser {
    def apply(
        UserId: js.UndefOr[idType] = js.undefined,
        UserName: js.UndefOr[userNameType] = js.undefined
    ): PolicyUser = {
      val __obj = js.Dictionary.empty[js.Any]
      UserId.foreach(__v => __obj.update("UserId", __v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyUser]
    }
  }

  /**
    * Contains information about a version of a managed policy.
    *  This data type is used as a response element in the <a>CreatePolicyVersion</a>, <a>GetPolicyVersion</a>, <a>ListPolicyVersions</a>, and <a>GetAccountAuthorizationDetails</a> operations.
    *  For more information about managed policies, refer to [[https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html|Managed Policies and Inline Policies]] in the <i>Using IAM</i> guide.
    */
  @js.native
  trait PolicyVersion extends js.Object {
    var CreateDate: js.UndefOr[dateType]
    var Document: js.UndefOr[policyDocumentType]
    var IsDefaultVersion: js.UndefOr[booleanType]
    var VersionId: js.UndefOr[policyVersionIdType]
  }

  object PolicyVersion {
    def apply(
        CreateDate: js.UndefOr[dateType] = js.undefined,
        Document: js.UndefOr[policyDocumentType] = js.undefined,
        IsDefaultVersion: js.UndefOr[booleanType] = js.undefined,
        VersionId: js.UndefOr[policyVersionIdType] = js.undefined
    ): PolicyVersion = {
      val __obj = js.Dictionary.empty[js.Any]
      CreateDate.foreach(__v => __obj.update("CreateDate", __v.asInstanceOf[js.Any]))
      Document.foreach(__v => __obj.update("Document", __v.asInstanceOf[js.Any]))
      IsDefaultVersion.foreach(__v => __obj.update("IsDefaultVersion", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyVersion]
    }
  }

  /**
    * Contains the row and column of a location of a <code>Statement</code> element in a policy document.
    *  This data type is used as a member of the <code> <a>Statement</a> </code> type.
    */
  @js.native
  trait Position extends js.Object {
    var Column: js.UndefOr[ColumnNumber]
    var Line: js.UndefOr[LineNumber]
  }

  object Position {
    def apply(
        Column: js.UndefOr[ColumnNumber] = js.undefined,
        Line: js.UndefOr[LineNumber] = js.undefined
    ): Position = {
      val __obj = js.Dictionary.empty[js.Any]
      Column.foreach(__v => __obj.update("Column", __v.asInstanceOf[js.Any]))
      Line.foreach(__v => __obj.update("Line", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Position]
    }
  }

  @js.native
  trait PutGroupPolicyRequest extends js.Object {
    var GroupName: groupNameType
    var PolicyDocument: policyDocumentType
    var PolicyName: policyNameType
  }

  object PutGroupPolicyRequest {
    def apply(
        GroupName: groupNameType,
        PolicyDocument: policyDocumentType,
        PolicyName: policyNameType
    ): PutGroupPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "GroupName"      -> GroupName.asInstanceOf[js.Any],
        "PolicyDocument" -> PolicyDocument.asInstanceOf[js.Any],
        "PolicyName"     -> PolicyName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutGroupPolicyRequest]
    }
  }

  @js.native
  trait PutRolePermissionsBoundaryRequest extends js.Object {
    var PermissionsBoundary: arnType
    var RoleName: roleNameType
  }

  object PutRolePermissionsBoundaryRequest {
    def apply(
        PermissionsBoundary: arnType,
        RoleName: roleNameType
    ): PutRolePermissionsBoundaryRequest = {
      val __obj = js.Dictionary[js.Any](
        "PermissionsBoundary" -> PermissionsBoundary.asInstanceOf[js.Any],
        "RoleName"            -> RoleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutRolePermissionsBoundaryRequest]
    }
  }

  @js.native
  trait PutRolePolicyRequest extends js.Object {
    var PolicyDocument: policyDocumentType
    var PolicyName: policyNameType
    var RoleName: roleNameType
  }

  object PutRolePolicyRequest {
    def apply(
        PolicyDocument: policyDocumentType,
        PolicyName: policyNameType,
        RoleName: roleNameType
    ): PutRolePolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyDocument" -> PolicyDocument.asInstanceOf[js.Any],
        "PolicyName"     -> PolicyName.asInstanceOf[js.Any],
        "RoleName"       -> RoleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutRolePolicyRequest]
    }
  }

  @js.native
  trait PutUserPermissionsBoundaryRequest extends js.Object {
    var PermissionsBoundary: arnType
    var UserName: userNameType
  }

  object PutUserPermissionsBoundaryRequest {
    def apply(
        PermissionsBoundary: arnType,
        UserName: userNameType
    ): PutUserPermissionsBoundaryRequest = {
      val __obj = js.Dictionary[js.Any](
        "PermissionsBoundary" -> PermissionsBoundary.asInstanceOf[js.Any],
        "UserName"            -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutUserPermissionsBoundaryRequest]
    }
  }

  @js.native
  trait PutUserPolicyRequest extends js.Object {
    var PolicyDocument: policyDocumentType
    var PolicyName: policyNameType
    var UserName: existingUserNameType
  }

  object PutUserPolicyRequest {
    def apply(
        PolicyDocument: policyDocumentType,
        PolicyName: policyNameType,
        UserName: existingUserNameType
    ): PutUserPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyDocument" -> PolicyDocument.asInstanceOf[js.Any],
        "PolicyName"     -> PolicyName.asInstanceOf[js.Any],
        "UserName"       -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutUserPolicyRequest]
    }
  }

  @js.native
  trait RemoveClientIDFromOpenIDConnectProviderRequest extends js.Object {
    var ClientID: clientIDType
    var OpenIDConnectProviderArn: arnType
  }

  object RemoveClientIDFromOpenIDConnectProviderRequest {
    def apply(
        ClientID: clientIDType,
        OpenIDConnectProviderArn: arnType
    ): RemoveClientIDFromOpenIDConnectProviderRequest = {
      val __obj = js.Dictionary[js.Any](
        "ClientID"                 -> ClientID.asInstanceOf[js.Any],
        "OpenIDConnectProviderArn" -> OpenIDConnectProviderArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveClientIDFromOpenIDConnectProviderRequest]
    }
  }

  @js.native
  trait RemoveRoleFromInstanceProfileRequest extends js.Object {
    var InstanceProfileName: instanceProfileNameType
    var RoleName: roleNameType
  }

  object RemoveRoleFromInstanceProfileRequest {
    def apply(
        InstanceProfileName: instanceProfileNameType,
        RoleName: roleNameType
    ): RemoveRoleFromInstanceProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceProfileName" -> InstanceProfileName.asInstanceOf[js.Any],
        "RoleName"            -> RoleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveRoleFromInstanceProfileRequest]
    }
  }

  @js.native
  trait RemoveUserFromGroupRequest extends js.Object {
    var GroupName: groupNameType
    var UserName: existingUserNameType
  }

  object RemoveUserFromGroupRequest {
    def apply(
        GroupName: groupNameType,
        UserName: existingUserNameType
    ): RemoveUserFromGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "UserName"  -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveUserFromGroupRequest]
    }
  }

  object ReportFormatTypeEnum {
    val `text/csv` = "text/csv"

    val values = js.Object.freeze(js.Array(`text/csv`))
  }

  object ReportStateTypeEnum {
    val STARTED    = "STARTED"
    val INPROGRESS = "INPROGRESS"
    val COMPLETE   = "COMPLETE"

    val values = js.Object.freeze(js.Array(STARTED, INPROGRESS, COMPLETE))
  }

  @js.native
  trait ResetServiceSpecificCredentialRequest extends js.Object {
    var ServiceSpecificCredentialId: serviceSpecificCredentialId
    var UserName: js.UndefOr[userNameType]
  }

  object ResetServiceSpecificCredentialRequest {
    def apply(
        ServiceSpecificCredentialId: serviceSpecificCredentialId,
        UserName: js.UndefOr[userNameType] = js.undefined
    ): ResetServiceSpecificCredentialRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServiceSpecificCredentialId" -> ServiceSpecificCredentialId.asInstanceOf[js.Any]
      )

      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetServiceSpecificCredentialRequest]
    }
  }

  @js.native
  trait ResetServiceSpecificCredentialResponse extends js.Object {
    var ServiceSpecificCredential: js.UndefOr[ServiceSpecificCredential]
  }

  object ResetServiceSpecificCredentialResponse {
    def apply(
        ServiceSpecificCredential: js.UndefOr[ServiceSpecificCredential] = js.undefined
    ): ResetServiceSpecificCredentialResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ServiceSpecificCredential.foreach(__v => __obj.update("ServiceSpecificCredential", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetServiceSpecificCredentialResponse]
    }
  }

  /**
    * Contains the result of the simulation of a single API operation call on a single resource.
    *  This data type is used by a member of the <a>EvaluationResult</a> data type.
    */
  @js.native
  trait ResourceSpecificResult extends js.Object {
    var EvalResourceDecision: PolicyEvaluationDecisionType
    var EvalResourceName: ResourceNameType
    var EvalDecisionDetails: js.UndefOr[EvalDecisionDetailsType]
    var MatchedStatements: js.UndefOr[StatementListType]
    var MissingContextValues: js.UndefOr[ContextKeyNamesResultListType]
  }

  object ResourceSpecificResult {
    def apply(
        EvalResourceDecision: PolicyEvaluationDecisionType,
        EvalResourceName: ResourceNameType,
        EvalDecisionDetails: js.UndefOr[EvalDecisionDetailsType] = js.undefined,
        MatchedStatements: js.UndefOr[StatementListType] = js.undefined,
        MissingContextValues: js.UndefOr[ContextKeyNamesResultListType] = js.undefined
    ): ResourceSpecificResult = {
      val __obj = js.Dictionary[js.Any](
        "EvalResourceDecision" -> EvalResourceDecision.asInstanceOf[js.Any],
        "EvalResourceName"     -> EvalResourceName.asInstanceOf[js.Any]
      )

      EvalDecisionDetails.foreach(__v => __obj.update("EvalDecisionDetails", __v.asInstanceOf[js.Any]))
      MatchedStatements.foreach(__v => __obj.update("MatchedStatements", __v.asInstanceOf[js.Any]))
      MissingContextValues.foreach(__v => __obj.update("MissingContextValues", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceSpecificResult]
    }
  }

  @js.native
  trait ResyncMFADeviceRequest extends js.Object {
    var AuthenticationCode1: authenticationCodeType
    var AuthenticationCode2: authenticationCodeType
    var SerialNumber: serialNumberType
    var UserName: existingUserNameType
  }

  object ResyncMFADeviceRequest {
    def apply(
        AuthenticationCode1: authenticationCodeType,
        AuthenticationCode2: authenticationCodeType,
        SerialNumber: serialNumberType,
        UserName: existingUserNameType
    ): ResyncMFADeviceRequest = {
      val __obj = js.Dictionary[js.Any](
        "AuthenticationCode1" -> AuthenticationCode1.asInstanceOf[js.Any],
        "AuthenticationCode2" -> AuthenticationCode2.asInstanceOf[js.Any],
        "SerialNumber"        -> SerialNumber.asInstanceOf[js.Any],
        "UserName"            -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResyncMFADeviceRequest]
    }
  }

  /**
    * Contains information about an IAM role. This structure is returned as a response element in several API operations that interact with roles.
    */
  @js.native
  trait Role extends js.Object {
    var Arn: arnType
    var CreateDate: dateType
    var Path: pathType
    var RoleId: idType
    var RoleName: roleNameType
    var AssumeRolePolicyDocument: js.UndefOr[policyDocumentType]
    var Description: js.UndefOr[roleDescriptionType]
    var MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType]
    var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary]
    var Tags: js.UndefOr[tagListType]
  }

  object Role {
    def apply(
        Arn: arnType,
        CreateDate: dateType,
        Path: pathType,
        RoleId: idType,
        RoleName: roleNameType,
        AssumeRolePolicyDocument: js.UndefOr[policyDocumentType] = js.undefined,
        Description: js.UndefOr[roleDescriptionType] = js.undefined,
        MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType] = js.undefined,
        PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.undefined,
        Tags: js.UndefOr[tagListType] = js.undefined
    ): Role = {
      val __obj = js.Dictionary[js.Any](
        "Arn"        -> Arn.asInstanceOf[js.Any],
        "CreateDate" -> CreateDate.asInstanceOf[js.Any],
        "Path"       -> Path.asInstanceOf[js.Any],
        "RoleId"     -> RoleId.asInstanceOf[js.Any],
        "RoleName"   -> RoleName.asInstanceOf[js.Any]
      )

      AssumeRolePolicyDocument.foreach(__v => __obj.update("AssumeRolePolicyDocument", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      MaxSessionDuration.foreach(__v => __obj.update("MaxSessionDuration", __v.asInstanceOf[js.Any]))
      PermissionsBoundary.foreach(__v => __obj.update("PermissionsBoundary", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Role]
    }
  }

  /**
    * Contains information about an IAM role, including all of the role's policies.
    *  This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.
    */
  @js.native
  trait RoleDetail extends js.Object {
    var Arn: js.UndefOr[arnType]
    var AssumeRolePolicyDocument: js.UndefOr[policyDocumentType]
    var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType]
    var CreateDate: js.UndefOr[dateType]
    var InstanceProfileList: js.UndefOr[instanceProfileListType]
    var Path: js.UndefOr[pathType]
    var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary]
    var RoleId: js.UndefOr[idType]
    var RoleName: js.UndefOr[roleNameType]
    var RolePolicyList: js.UndefOr[policyDetailListType]
    var Tags: js.UndefOr[tagListType]
  }

  object RoleDetail {
    def apply(
        Arn: js.UndefOr[arnType] = js.undefined,
        AssumeRolePolicyDocument: js.UndefOr[policyDocumentType] = js.undefined,
        AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined,
        CreateDate: js.UndefOr[dateType] = js.undefined,
        InstanceProfileList: js.UndefOr[instanceProfileListType] = js.undefined,
        Path: js.UndefOr[pathType] = js.undefined,
        PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.undefined,
        RoleId: js.UndefOr[idType] = js.undefined,
        RoleName: js.UndefOr[roleNameType] = js.undefined,
        RolePolicyList: js.UndefOr[policyDetailListType] = js.undefined,
        Tags: js.UndefOr[tagListType] = js.undefined
    ): RoleDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      AssumeRolePolicyDocument.foreach(__v => __obj.update("AssumeRolePolicyDocument", __v.asInstanceOf[js.Any]))
      AttachedManagedPolicies.foreach(__v => __obj.update("AttachedManagedPolicies", __v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.update("CreateDate", __v.asInstanceOf[js.Any]))
      InstanceProfileList.foreach(__v => __obj.update("InstanceProfileList", __v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.update("Path", __v.asInstanceOf[js.Any]))
      PermissionsBoundary.foreach(__v => __obj.update("PermissionsBoundary", __v.asInstanceOf[js.Any]))
      RoleId.foreach(__v => __obj.update("RoleId", __v.asInstanceOf[js.Any]))
      RoleName.foreach(__v => __obj.update("RoleName", __v.asInstanceOf[js.Any]))
      RolePolicyList.foreach(__v => __obj.update("RolePolicyList", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoleDetail]
    }
  }

  /**
    * An object that contains details about how a service-linked role is used, if that information is returned by the service.
    *  This data type is used as a response element in the <a>GetServiceLinkedRoleDeletionStatus</a> operation.
    */
  @js.native
  trait RoleUsageType extends js.Object {
    var Region: js.UndefOr[RegionNameType]
    var Resources: js.UndefOr[ArnListType]
  }

  object RoleUsageType {
    def apply(
        Region: js.UndefOr[RegionNameType] = js.undefined,
        Resources: js.UndefOr[ArnListType] = js.undefined
    ): RoleUsageType = {
      val __obj = js.Dictionary.empty[js.Any]
      Region.foreach(__v => __obj.update("Region", __v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.update("Resources", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoleUsageType]
    }
  }

  /**
    * Contains the list of SAML providers for this account.
    */
  @js.native
  trait SAMLProviderListEntry extends js.Object {
    var Arn: js.UndefOr[arnType]
    var CreateDate: js.UndefOr[dateType]
    var ValidUntil: js.UndefOr[dateType]
  }

  object SAMLProviderListEntry {
    def apply(
        Arn: js.UndefOr[arnType] = js.undefined,
        CreateDate: js.UndefOr[dateType] = js.undefined,
        ValidUntil: js.UndefOr[dateType] = js.undefined
    ): SAMLProviderListEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.update("CreateDate", __v.asInstanceOf[js.Any]))
      ValidUntil.foreach(__v => __obj.update("ValidUntil", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SAMLProviderListEntry]
    }
  }

  /**
    * Contains information about an SSH public key.
    *  This data type is used as a response element in the <a>GetSSHPublicKey</a> and <a>UploadSSHPublicKey</a> operations.
    */
  @js.native
  trait SSHPublicKey extends js.Object {
    var Fingerprint: publicKeyFingerprintType
    var SSHPublicKeyBody: publicKeyMaterialType
    var SSHPublicKeyId: publicKeyIdType
    var Status: statusType
    var UserName: userNameType
    var UploadDate: js.UndefOr[dateType]
  }

  object SSHPublicKey {
    def apply(
        Fingerprint: publicKeyFingerprintType,
        SSHPublicKeyBody: publicKeyMaterialType,
        SSHPublicKeyId: publicKeyIdType,
        Status: statusType,
        UserName: userNameType,
        UploadDate: js.UndefOr[dateType] = js.undefined
    ): SSHPublicKey = {
      val __obj = js.Dictionary[js.Any](
        "Fingerprint"      -> Fingerprint.asInstanceOf[js.Any],
        "SSHPublicKeyBody" -> SSHPublicKeyBody.asInstanceOf[js.Any],
        "SSHPublicKeyId"   -> SSHPublicKeyId.asInstanceOf[js.Any],
        "Status"           -> Status.asInstanceOf[js.Any],
        "UserName"         -> UserName.asInstanceOf[js.Any]
      )

      UploadDate.foreach(__v => __obj.update("UploadDate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SSHPublicKey]
    }
  }

  /**
    * Contains information about an SSH public key, without the key's body or fingerprint.
    *  This data type is used as a response element in the <a>ListSSHPublicKeys</a> operation.
    */
  @js.native
  trait SSHPublicKeyMetadata extends js.Object {
    var SSHPublicKeyId: publicKeyIdType
    var Status: statusType
    var UploadDate: dateType
    var UserName: userNameType
  }

  object SSHPublicKeyMetadata {
    def apply(
        SSHPublicKeyId: publicKeyIdType,
        Status: statusType,
        UploadDate: dateType,
        UserName: userNameType
    ): SSHPublicKeyMetadata = {
      val __obj = js.Dictionary[js.Any](
        "SSHPublicKeyId" -> SSHPublicKeyId.asInstanceOf[js.Any],
        "Status"         -> Status.asInstanceOf[js.Any],
        "UploadDate"     -> UploadDate.asInstanceOf[js.Any],
        "UserName"       -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SSHPublicKeyMetadata]
    }
  }

  /**
    * Contains information about a server certificate.
    *  This data type is used as a response element in the <a>GetServerCertificate</a> operation.
    */
  @js.native
  trait ServerCertificate extends js.Object {
    var CertificateBody: certificateBodyType
    var ServerCertificateMetadata: ServerCertificateMetadata
    var CertificateChain: js.UndefOr[certificateChainType]
  }

  object ServerCertificate {
    def apply(
        CertificateBody: certificateBodyType,
        ServerCertificateMetadata: ServerCertificateMetadata,
        CertificateChain: js.UndefOr[certificateChainType] = js.undefined
    ): ServerCertificate = {
      val __obj = js.Dictionary[js.Any](
        "CertificateBody"           -> CertificateBody.asInstanceOf[js.Any],
        "ServerCertificateMetadata" -> ServerCertificateMetadata.asInstanceOf[js.Any]
      )

      CertificateChain.foreach(__v => __obj.update("CertificateChain", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerCertificate]
    }
  }

  /**
    * Contains information about a server certificate without its certificate body, certificate chain, and private key.
    *  This data type is used as a response element in the <a>UploadServerCertificate</a> and <a>ListServerCertificates</a> operations.
    */
  @js.native
  trait ServerCertificateMetadata extends js.Object {
    var Arn: arnType
    var Path: pathType
    var ServerCertificateId: idType
    var ServerCertificateName: serverCertificateNameType
    var Expiration: js.UndefOr[dateType]
    var UploadDate: js.UndefOr[dateType]
  }

  object ServerCertificateMetadata {
    def apply(
        Arn: arnType,
        Path: pathType,
        ServerCertificateId: idType,
        ServerCertificateName: serverCertificateNameType,
        Expiration: js.UndefOr[dateType] = js.undefined,
        UploadDate: js.UndefOr[dateType] = js.undefined
    ): ServerCertificateMetadata = {
      val __obj = js.Dictionary[js.Any](
        "Arn"                   -> Arn.asInstanceOf[js.Any],
        "Path"                  -> Path.asInstanceOf[js.Any],
        "ServerCertificateId"   -> ServerCertificateId.asInstanceOf[js.Any],
        "ServerCertificateName" -> ServerCertificateName.asInstanceOf[js.Any]
      )

      Expiration.foreach(__v => __obj.update("Expiration", __v.asInstanceOf[js.Any]))
      UploadDate.foreach(__v => __obj.update("UploadDate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerCertificateMetadata]
    }
  }

  /**
    * Contains details about the most recent attempt to access the service.
    *  This data type is used as a response element in the <a>GetServiceLastAccessedDetails</a> operation.
    */
  @js.native
  trait ServiceLastAccessed extends js.Object {
    var ServiceName: serviceNameType
    var ServiceNamespace: serviceNamespaceType
    var LastAuthenticated: js.UndefOr[dateType]
    var LastAuthenticatedEntity: js.UndefOr[arnType]
    var TotalAuthenticatedEntities: js.UndefOr[integerType]
  }

  object ServiceLastAccessed {
    def apply(
        ServiceName: serviceNameType,
        ServiceNamespace: serviceNamespaceType,
        LastAuthenticated: js.UndefOr[dateType] = js.undefined,
        LastAuthenticatedEntity: js.UndefOr[arnType] = js.undefined,
        TotalAuthenticatedEntities: js.UndefOr[integerType] = js.undefined
    ): ServiceLastAccessed = {
      val __obj = js.Dictionary[js.Any](
        "ServiceName"      -> ServiceName.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any]
      )

      LastAuthenticated.foreach(__v => __obj.update("LastAuthenticated", __v.asInstanceOf[js.Any]))
      LastAuthenticatedEntity.foreach(__v => __obj.update("LastAuthenticatedEntity", __v.asInstanceOf[js.Any]))
      TotalAuthenticatedEntities.foreach(__v => __obj.update("TotalAuthenticatedEntities", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceLastAccessed]
    }
  }

  /**
    * Contains the details of a service-specific credential.
    */
  @js.native
  trait ServiceSpecificCredential extends js.Object {
    var CreateDate: dateType
    var ServiceName: serviceName
    var ServicePassword: servicePassword
    var ServiceSpecificCredentialId: serviceSpecificCredentialId
    var ServiceUserName: serviceUserName
    var Status: statusType
    var UserName: userNameType
  }

  object ServiceSpecificCredential {
    def apply(
        CreateDate: dateType,
        ServiceName: serviceName,
        ServicePassword: servicePassword,
        ServiceSpecificCredentialId: serviceSpecificCredentialId,
        ServiceUserName: serviceUserName,
        Status: statusType,
        UserName: userNameType
    ): ServiceSpecificCredential = {
      val __obj = js.Dictionary[js.Any](
        "CreateDate"                  -> CreateDate.asInstanceOf[js.Any],
        "ServiceName"                 -> ServiceName.asInstanceOf[js.Any],
        "ServicePassword"             -> ServicePassword.asInstanceOf[js.Any],
        "ServiceSpecificCredentialId" -> ServiceSpecificCredentialId.asInstanceOf[js.Any],
        "ServiceUserName"             -> ServiceUserName.asInstanceOf[js.Any],
        "Status"                      -> Status.asInstanceOf[js.Any],
        "UserName"                    -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ServiceSpecificCredential]
    }
  }

  /**
    * Contains additional details about a service-specific credential.
    */
  @js.native
  trait ServiceSpecificCredentialMetadata extends js.Object {
    var CreateDate: dateType
    var ServiceName: serviceName
    var ServiceSpecificCredentialId: serviceSpecificCredentialId
    var ServiceUserName: serviceUserName
    var Status: statusType
    var UserName: userNameType
  }

  object ServiceSpecificCredentialMetadata {
    def apply(
        CreateDate: dateType,
        ServiceName: serviceName,
        ServiceSpecificCredentialId: serviceSpecificCredentialId,
        ServiceUserName: serviceUserName,
        Status: statusType,
        UserName: userNameType
    ): ServiceSpecificCredentialMetadata = {
      val __obj = js.Dictionary[js.Any](
        "CreateDate"                  -> CreateDate.asInstanceOf[js.Any],
        "ServiceName"                 -> ServiceName.asInstanceOf[js.Any],
        "ServiceSpecificCredentialId" -> ServiceSpecificCredentialId.asInstanceOf[js.Any],
        "ServiceUserName"             -> ServiceUserName.asInstanceOf[js.Any],
        "Status"                      -> Status.asInstanceOf[js.Any],
        "UserName"                    -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ServiceSpecificCredentialMetadata]
    }
  }

  @js.native
  trait SetDefaultPolicyVersionRequest extends js.Object {
    var PolicyArn: arnType
    var VersionId: policyVersionIdType
  }

  object SetDefaultPolicyVersionRequest {
    def apply(
        PolicyArn: arnType,
        VersionId: policyVersionIdType
    ): SetDefaultPolicyVersionRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyArn" -> PolicyArn.asInstanceOf[js.Any],
        "VersionId" -> VersionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetDefaultPolicyVersionRequest]
    }
  }

  @js.native
  trait SetSecurityTokenServicePreferencesRequest extends js.Object {
    var GlobalEndpointTokenVersion: globalEndpointTokenVersion
  }

  object SetSecurityTokenServicePreferencesRequest {
    def apply(
        GlobalEndpointTokenVersion: globalEndpointTokenVersion
    ): SetSecurityTokenServicePreferencesRequest = {
      val __obj = js.Dictionary[js.Any](
        "GlobalEndpointTokenVersion" -> GlobalEndpointTokenVersion.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetSecurityTokenServicePreferencesRequest]
    }
  }

  /**
    * Contains information about an X.509 signing certificate.
    *  This data type is used as a response element in the <a>UploadSigningCertificate</a> and <a>ListSigningCertificates</a> operations.
    */
  @js.native
  trait SigningCertificate extends js.Object {
    var CertificateBody: certificateBodyType
    var CertificateId: certificateIdType
    var Status: statusType
    var UserName: userNameType
    var UploadDate: js.UndefOr[dateType]
  }

  object SigningCertificate {
    def apply(
        CertificateBody: certificateBodyType,
        CertificateId: certificateIdType,
        Status: statusType,
        UserName: userNameType,
        UploadDate: js.UndefOr[dateType] = js.undefined
    ): SigningCertificate = {
      val __obj = js.Dictionary[js.Any](
        "CertificateBody" -> CertificateBody.asInstanceOf[js.Any],
        "CertificateId"   -> CertificateId.asInstanceOf[js.Any],
        "Status"          -> Status.asInstanceOf[js.Any],
        "UserName"        -> UserName.asInstanceOf[js.Any]
      )

      UploadDate.foreach(__v => __obj.update("UploadDate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SigningCertificate]
    }
  }

  @js.native
  trait SimulateCustomPolicyRequest extends js.Object {
    var ActionNames: ActionNameListType
    var PolicyInputList: SimulationPolicyListType
    var CallerArn: js.UndefOr[ResourceNameType]
    var ContextEntries: js.UndefOr[ContextEntryListType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var ResourceArns: js.UndefOr[ResourceNameListType]
    var ResourceHandlingOption: js.UndefOr[ResourceHandlingOptionType]
    var ResourceOwner: js.UndefOr[ResourceNameType]
    var ResourcePolicy: js.UndefOr[policyDocumentType]
  }

  object SimulateCustomPolicyRequest {
    def apply(
        ActionNames: ActionNameListType,
        PolicyInputList: SimulationPolicyListType,
        CallerArn: js.UndefOr[ResourceNameType] = js.undefined,
        ContextEntries: js.UndefOr[ContextEntryListType] = js.undefined,
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined,
        ResourceArns: js.UndefOr[ResourceNameListType] = js.undefined,
        ResourceHandlingOption: js.UndefOr[ResourceHandlingOptionType] = js.undefined,
        ResourceOwner: js.UndefOr[ResourceNameType] = js.undefined,
        ResourcePolicy: js.UndefOr[policyDocumentType] = js.undefined
    ): SimulateCustomPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "ActionNames"     -> ActionNames.asInstanceOf[js.Any],
        "PolicyInputList" -> PolicyInputList.asInstanceOf[js.Any]
      )

      CallerArn.foreach(__v => __obj.update("CallerArn", __v.asInstanceOf[js.Any]))
      ContextEntries.foreach(__v => __obj.update("ContextEntries", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      ResourceArns.foreach(__v => __obj.update("ResourceArns", __v.asInstanceOf[js.Any]))
      ResourceHandlingOption.foreach(__v => __obj.update("ResourceHandlingOption", __v.asInstanceOf[js.Any]))
      ResourceOwner.foreach(__v => __obj.update("ResourceOwner", __v.asInstanceOf[js.Any]))
      ResourcePolicy.foreach(__v => __obj.update("ResourcePolicy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimulateCustomPolicyRequest]
    }
  }

  /**
    * Contains the response to a successful <a>SimulatePrincipalPolicy</a> or <a>SimulateCustomPolicy</a> request.
    */
  @js.native
  trait SimulatePolicyResponse extends js.Object {
    var EvaluationResults: js.UndefOr[EvaluationResultsListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  object SimulatePolicyResponse {
    def apply(
        EvaluationResults: js.UndefOr[EvaluationResultsListType] = js.undefined,
        IsTruncated: js.UndefOr[booleanType] = js.undefined,
        Marker: js.UndefOr[responseMarkerType] = js.undefined
    ): SimulatePolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EvaluationResults.foreach(__v => __obj.update("EvaluationResults", __v.asInstanceOf[js.Any]))
      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimulatePolicyResponse]
    }
  }

  @js.native
  trait SimulatePrincipalPolicyRequest extends js.Object {
    var ActionNames: ActionNameListType
    var PolicySourceArn: arnType
    var CallerArn: js.UndefOr[ResourceNameType]
    var ContextEntries: js.UndefOr[ContextEntryListType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var PolicyInputList: js.UndefOr[SimulationPolicyListType]
    var ResourceArns: js.UndefOr[ResourceNameListType]
    var ResourceHandlingOption: js.UndefOr[ResourceHandlingOptionType]
    var ResourceOwner: js.UndefOr[ResourceNameType]
    var ResourcePolicy: js.UndefOr[policyDocumentType]
  }

  object SimulatePrincipalPolicyRequest {
    def apply(
        ActionNames: ActionNameListType,
        PolicySourceArn: arnType,
        CallerArn: js.UndefOr[ResourceNameType] = js.undefined,
        ContextEntries: js.UndefOr[ContextEntryListType] = js.undefined,
        Marker: js.UndefOr[markerType] = js.undefined,
        MaxItems: js.UndefOr[maxItemsType] = js.undefined,
        PolicyInputList: js.UndefOr[SimulationPolicyListType] = js.undefined,
        ResourceArns: js.UndefOr[ResourceNameListType] = js.undefined,
        ResourceHandlingOption: js.UndefOr[ResourceHandlingOptionType] = js.undefined,
        ResourceOwner: js.UndefOr[ResourceNameType] = js.undefined,
        ResourcePolicy: js.UndefOr[policyDocumentType] = js.undefined
    ): SimulatePrincipalPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "ActionNames"     -> ActionNames.asInstanceOf[js.Any],
        "PolicySourceArn" -> PolicySourceArn.asInstanceOf[js.Any]
      )

      CallerArn.foreach(__v => __obj.update("CallerArn", __v.asInstanceOf[js.Any]))
      ContextEntries.foreach(__v => __obj.update("ContextEntries", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      PolicyInputList.foreach(__v => __obj.update("PolicyInputList", __v.asInstanceOf[js.Any]))
      ResourceArns.foreach(__v => __obj.update("ResourceArns", __v.asInstanceOf[js.Any]))
      ResourceHandlingOption.foreach(__v => __obj.update("ResourceHandlingOption", __v.asInstanceOf[js.Any]))
      ResourceOwner.foreach(__v => __obj.update("ResourceOwner", __v.asInstanceOf[js.Any]))
      ResourcePolicy.foreach(__v => __obj.update("ResourcePolicy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimulatePrincipalPolicyRequest]
    }
  }

  /**
    * Contains a reference to a <code>Statement</code> element in a policy document that determines the result of the simulation.
    *  This data type is used by the <code>MatchedStatements</code> member of the <code> <a>EvaluationResult</a> </code> type.
    */
  @js.native
  trait Statement extends js.Object {
    var EndPosition: js.UndefOr[Position]
    var SourcePolicyId: js.UndefOr[PolicyIdentifierType]
    var SourcePolicyType: js.UndefOr[PolicySourceType]
    var StartPosition: js.UndefOr[Position]
  }

  object Statement {
    def apply(
        EndPosition: js.UndefOr[Position] = js.undefined,
        SourcePolicyId: js.UndefOr[PolicyIdentifierType] = js.undefined,
        SourcePolicyType: js.UndefOr[PolicySourceType] = js.undefined,
        StartPosition: js.UndefOr[Position] = js.undefined
    ): Statement = {
      val __obj = js.Dictionary.empty[js.Any]
      EndPosition.foreach(__v => __obj.update("EndPosition", __v.asInstanceOf[js.Any]))
      SourcePolicyId.foreach(__v => __obj.update("SourcePolicyId", __v.asInstanceOf[js.Any]))
      SourcePolicyType.foreach(__v => __obj.update("SourcePolicyType", __v.asInstanceOf[js.Any]))
      StartPosition.foreach(__v => __obj.update("StartPosition", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Statement]
    }
  }

  /**
    * A structure that represents user-provided metadata that can be associated with a resource such as an IAM user or role. For more information about tagging, see [[https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html|Tagging IAM Identities]] in the <i>IAM User Guide</i>.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: tagKeyType
    var Value: tagValueType
  }

  object Tag {
    def apply(
        Key: tagKeyType,
        Value: tagValueType
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagRoleRequest extends js.Object {
    var RoleName: roleNameType
    var Tags: tagListType
  }

  object TagRoleRequest {
    def apply(
        RoleName: roleNameType,
        Tags: tagListType
    ): TagRoleRequest = {
      val __obj = js.Dictionary[js.Any](
        "RoleName" -> RoleName.asInstanceOf[js.Any],
        "Tags"     -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagRoleRequest]
    }
  }

  @js.native
  trait TagUserRequest extends js.Object {
    var Tags: tagListType
    var UserName: existingUserNameType
  }

  object TagUserRequest {
    def apply(
        Tags: tagListType,
        UserName: existingUserNameType
    ): TagUserRequest = {
      val __obj = js.Dictionary[js.Any](
        "Tags"     -> Tags.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagUserRequest]
    }
  }

  @js.native
  trait UntagRoleRequest extends js.Object {
    var RoleName: roleNameType
    var TagKeys: tagKeyListType
  }

  object UntagRoleRequest {
    def apply(
        RoleName: roleNameType,
        TagKeys: tagKeyListType
    ): UntagRoleRequest = {
      val __obj = js.Dictionary[js.Any](
        "RoleName" -> RoleName.asInstanceOf[js.Any],
        "TagKeys"  -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagRoleRequest]
    }
  }

  @js.native
  trait UntagUserRequest extends js.Object {
    var TagKeys: tagKeyListType
    var UserName: existingUserNameType
  }

  object UntagUserRequest {
    def apply(
        TagKeys: tagKeyListType,
        UserName: existingUserNameType
    ): UntagUserRequest = {
      val __obj = js.Dictionary[js.Any](
        "TagKeys"  -> TagKeys.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagUserRequest]
    }
  }

  @js.native
  trait UpdateAccessKeyRequest extends js.Object {
    var AccessKeyId: accessKeyIdType
    var Status: statusType
    var UserName: js.UndefOr[existingUserNameType]
  }

  object UpdateAccessKeyRequest {
    def apply(
        AccessKeyId: accessKeyIdType,
        Status: statusType,
        UserName: js.UndefOr[existingUserNameType] = js.undefined
    ): UpdateAccessKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "AccessKeyId" -> AccessKeyId.asInstanceOf[js.Any],
        "Status"      -> Status.asInstanceOf[js.Any]
      )

      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAccessKeyRequest]
    }
  }

  @js.native
  trait UpdateAccountPasswordPolicyRequest extends js.Object {
    var AllowUsersToChangePassword: js.UndefOr[booleanType]
    var HardExpiry: js.UndefOr[booleanObjectType]
    var MaxPasswordAge: js.UndefOr[maxPasswordAgeType]
    var MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType]
    var PasswordReusePrevention: js.UndefOr[passwordReusePreventionType]
    var RequireLowercaseCharacters: js.UndefOr[booleanType]
    var RequireNumbers: js.UndefOr[booleanType]
    var RequireSymbols: js.UndefOr[booleanType]
    var RequireUppercaseCharacters: js.UndefOr[booleanType]
  }

  object UpdateAccountPasswordPolicyRequest {
    def apply(
        AllowUsersToChangePassword: js.UndefOr[booleanType] = js.undefined,
        HardExpiry: js.UndefOr[booleanObjectType] = js.undefined,
        MaxPasswordAge: js.UndefOr[maxPasswordAgeType] = js.undefined,
        MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType] = js.undefined,
        PasswordReusePrevention: js.UndefOr[passwordReusePreventionType] = js.undefined,
        RequireLowercaseCharacters: js.UndefOr[booleanType] = js.undefined,
        RequireNumbers: js.UndefOr[booleanType] = js.undefined,
        RequireSymbols: js.UndefOr[booleanType] = js.undefined,
        RequireUppercaseCharacters: js.UndefOr[booleanType] = js.undefined
    ): UpdateAccountPasswordPolicyRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      AllowUsersToChangePassword.foreach(__v => __obj.update("AllowUsersToChangePassword", __v.asInstanceOf[js.Any]))
      HardExpiry.foreach(__v => __obj.update("HardExpiry", __v.asInstanceOf[js.Any]))
      MaxPasswordAge.foreach(__v => __obj.update("MaxPasswordAge", __v.asInstanceOf[js.Any]))
      MinimumPasswordLength.foreach(__v => __obj.update("MinimumPasswordLength", __v.asInstanceOf[js.Any]))
      PasswordReusePrevention.foreach(__v => __obj.update("PasswordReusePrevention", __v.asInstanceOf[js.Any]))
      RequireLowercaseCharacters.foreach(__v => __obj.update("RequireLowercaseCharacters", __v.asInstanceOf[js.Any]))
      RequireNumbers.foreach(__v => __obj.update("RequireNumbers", __v.asInstanceOf[js.Any]))
      RequireSymbols.foreach(__v => __obj.update("RequireSymbols", __v.asInstanceOf[js.Any]))
      RequireUppercaseCharacters.foreach(__v => __obj.update("RequireUppercaseCharacters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAccountPasswordPolicyRequest]
    }
  }

  @js.native
  trait UpdateAssumeRolePolicyRequest extends js.Object {
    var PolicyDocument: policyDocumentType
    var RoleName: roleNameType
  }

  object UpdateAssumeRolePolicyRequest {
    def apply(
        PolicyDocument: policyDocumentType,
        RoleName: roleNameType
    ): UpdateAssumeRolePolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyDocument" -> PolicyDocument.asInstanceOf[js.Any],
        "RoleName"       -> RoleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateAssumeRolePolicyRequest]
    }
  }

  @js.native
  trait UpdateGroupRequest extends js.Object {
    var GroupName: groupNameType
    var NewGroupName: js.UndefOr[groupNameType]
    var NewPath: js.UndefOr[pathType]
  }

  object UpdateGroupRequest {
    def apply(
        GroupName: groupNameType,
        NewGroupName: js.UndefOr[groupNameType] = js.undefined,
        NewPath: js.UndefOr[pathType] = js.undefined
    ): UpdateGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "GroupName" -> GroupName.asInstanceOf[js.Any]
      )

      NewGroupName.foreach(__v => __obj.update("NewGroupName", __v.asInstanceOf[js.Any]))
      NewPath.foreach(__v => __obj.update("NewPath", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGroupRequest]
    }
  }

  @js.native
  trait UpdateLoginProfileRequest extends js.Object {
    var UserName: userNameType
    var Password: js.UndefOr[passwordType]
    var PasswordResetRequired: js.UndefOr[booleanObjectType]
  }

  object UpdateLoginProfileRequest {
    def apply(
        UserName: userNameType,
        Password: js.UndefOr[passwordType] = js.undefined,
        PasswordResetRequired: js.UndefOr[booleanObjectType] = js.undefined
    ): UpdateLoginProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      Password.foreach(__v => __obj.update("Password", __v.asInstanceOf[js.Any]))
      PasswordResetRequired.foreach(__v => __obj.update("PasswordResetRequired", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLoginProfileRequest]
    }
  }

  @js.native
  trait UpdateOpenIDConnectProviderThumbprintRequest extends js.Object {
    var OpenIDConnectProviderArn: arnType
    var ThumbprintList: thumbprintListType
  }

  object UpdateOpenIDConnectProviderThumbprintRequest {
    def apply(
        OpenIDConnectProviderArn: arnType,
        ThumbprintList: thumbprintListType
    ): UpdateOpenIDConnectProviderThumbprintRequest = {
      val __obj = js.Dictionary[js.Any](
        "OpenIDConnectProviderArn" -> OpenIDConnectProviderArn.asInstanceOf[js.Any],
        "ThumbprintList"           -> ThumbprintList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateOpenIDConnectProviderThumbprintRequest]
    }
  }

  @js.native
  trait UpdateRoleDescriptionRequest extends js.Object {
    var Description: roleDescriptionType
    var RoleName: roleNameType
  }

  object UpdateRoleDescriptionRequest {
    def apply(
        Description: roleDescriptionType,
        RoleName: roleNameType
    ): UpdateRoleDescriptionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Description" -> Description.asInstanceOf[js.Any],
        "RoleName"    -> RoleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateRoleDescriptionRequest]
    }
  }

  @js.native
  trait UpdateRoleDescriptionResponse extends js.Object {
    var Role: js.UndefOr[Role]
  }

  object UpdateRoleDescriptionResponse {
    def apply(
        Role: js.UndefOr[Role] = js.undefined
    ): UpdateRoleDescriptionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Role.foreach(__v => __obj.update("Role", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRoleDescriptionResponse]
    }
  }

  @js.native
  trait UpdateRoleRequest extends js.Object {
    var RoleName: roleNameType
    var Description: js.UndefOr[roleDescriptionType]
    var MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType]
  }

  object UpdateRoleRequest {
    def apply(
        RoleName: roleNameType,
        Description: js.UndefOr[roleDescriptionType] = js.undefined,
        MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType] = js.undefined
    ): UpdateRoleRequest = {
      val __obj = js.Dictionary[js.Any](
        "RoleName" -> RoleName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      MaxSessionDuration.foreach(__v => __obj.update("MaxSessionDuration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRoleRequest]
    }
  }

  @js.native
  trait UpdateRoleResponse extends js.Object {}

  object UpdateRoleResponse {
    def apply(
        ): UpdateRoleResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateRoleResponse]
    }
  }

  @js.native
  trait UpdateSAMLProviderRequest extends js.Object {
    var SAMLMetadataDocument: SAMLMetadataDocumentType
    var SAMLProviderArn: arnType
  }

  object UpdateSAMLProviderRequest {
    def apply(
        SAMLMetadataDocument: SAMLMetadataDocumentType,
        SAMLProviderArn: arnType
    ): UpdateSAMLProviderRequest = {
      val __obj = js.Dictionary[js.Any](
        "SAMLMetadataDocument" -> SAMLMetadataDocument.asInstanceOf[js.Any],
        "SAMLProviderArn"      -> SAMLProviderArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateSAMLProviderRequest]
    }
  }

  /**
    * Contains the response to a successful <a>UpdateSAMLProvider</a> request.
    */
  @js.native
  trait UpdateSAMLProviderResponse extends js.Object {
    var SAMLProviderArn: js.UndefOr[arnType]
  }

  object UpdateSAMLProviderResponse {
    def apply(
        SAMLProviderArn: js.UndefOr[arnType] = js.undefined
    ): UpdateSAMLProviderResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      SAMLProviderArn.foreach(__v => __obj.update("SAMLProviderArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSAMLProviderResponse]
    }
  }

  @js.native
  trait UpdateSSHPublicKeyRequest extends js.Object {
    var SSHPublicKeyId: publicKeyIdType
    var Status: statusType
    var UserName: userNameType
  }

  object UpdateSSHPublicKeyRequest {
    def apply(
        SSHPublicKeyId: publicKeyIdType,
        Status: statusType,
        UserName: userNameType
    ): UpdateSSHPublicKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "SSHPublicKeyId" -> SSHPublicKeyId.asInstanceOf[js.Any],
        "Status"         -> Status.asInstanceOf[js.Any],
        "UserName"       -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateSSHPublicKeyRequest]
    }
  }

  @js.native
  trait UpdateServerCertificateRequest extends js.Object {
    var ServerCertificateName: serverCertificateNameType
    var NewPath: js.UndefOr[pathType]
    var NewServerCertificateName: js.UndefOr[serverCertificateNameType]
  }

  object UpdateServerCertificateRequest {
    def apply(
        ServerCertificateName: serverCertificateNameType,
        NewPath: js.UndefOr[pathType] = js.undefined,
        NewServerCertificateName: js.UndefOr[serverCertificateNameType] = js.undefined
    ): UpdateServerCertificateRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServerCertificateName" -> ServerCertificateName.asInstanceOf[js.Any]
      )

      NewPath.foreach(__v => __obj.update("NewPath", __v.asInstanceOf[js.Any]))
      NewServerCertificateName.foreach(__v => __obj.update("NewServerCertificateName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServerCertificateRequest]
    }
  }

  @js.native
  trait UpdateServiceSpecificCredentialRequest extends js.Object {
    var ServiceSpecificCredentialId: serviceSpecificCredentialId
    var Status: statusType
    var UserName: js.UndefOr[userNameType]
  }

  object UpdateServiceSpecificCredentialRequest {
    def apply(
        ServiceSpecificCredentialId: serviceSpecificCredentialId,
        Status: statusType,
        UserName: js.UndefOr[userNameType] = js.undefined
    ): UpdateServiceSpecificCredentialRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServiceSpecificCredentialId" -> ServiceSpecificCredentialId.asInstanceOf[js.Any],
        "Status"                      -> Status.asInstanceOf[js.Any]
      )

      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServiceSpecificCredentialRequest]
    }
  }

  @js.native
  trait UpdateSigningCertificateRequest extends js.Object {
    var CertificateId: certificateIdType
    var Status: statusType
    var UserName: js.UndefOr[existingUserNameType]
  }

  object UpdateSigningCertificateRequest {
    def apply(
        CertificateId: certificateIdType,
        Status: statusType,
        UserName: js.UndefOr[existingUserNameType] = js.undefined
    ): UpdateSigningCertificateRequest = {
      val __obj = js.Dictionary[js.Any](
        "CertificateId" -> CertificateId.asInstanceOf[js.Any],
        "Status"        -> Status.asInstanceOf[js.Any]
      )

      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSigningCertificateRequest]
    }
  }

  @js.native
  trait UpdateUserRequest extends js.Object {
    var UserName: existingUserNameType
    var NewPath: js.UndefOr[pathType]
    var NewUserName: js.UndefOr[userNameType]
  }

  object UpdateUserRequest {
    def apply(
        UserName: existingUserNameType,
        NewPath: js.UndefOr[pathType] = js.undefined,
        NewUserName: js.UndefOr[userNameType] = js.undefined
    ): UpdateUserRequest = {
      val __obj = js.Dictionary[js.Any](
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      NewPath.foreach(__v => __obj.update("NewPath", __v.asInstanceOf[js.Any]))
      NewUserName.foreach(__v => __obj.update("NewUserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserRequest]
    }
  }

  @js.native
  trait UploadSSHPublicKeyRequest extends js.Object {
    var SSHPublicKeyBody: publicKeyMaterialType
    var UserName: userNameType
  }

  object UploadSSHPublicKeyRequest {
    def apply(
        SSHPublicKeyBody: publicKeyMaterialType,
        UserName: userNameType
    ): UploadSSHPublicKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "SSHPublicKeyBody" -> SSHPublicKeyBody.asInstanceOf[js.Any],
        "UserName"         -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UploadSSHPublicKeyRequest]
    }
  }

  /**
    * Contains the response to a successful <a>UploadSSHPublicKey</a> request.
    */
  @js.native
  trait UploadSSHPublicKeyResponse extends js.Object {
    var SSHPublicKey: js.UndefOr[SSHPublicKey]
  }

  object UploadSSHPublicKeyResponse {
    def apply(
        SSHPublicKey: js.UndefOr[SSHPublicKey] = js.undefined
    ): UploadSSHPublicKeyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      SSHPublicKey.foreach(__v => __obj.update("SSHPublicKey", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UploadSSHPublicKeyResponse]
    }
  }

  @js.native
  trait UploadServerCertificateRequest extends js.Object {
    var CertificateBody: certificateBodyType
    var PrivateKey: privateKeyType
    var ServerCertificateName: serverCertificateNameType
    var CertificateChain: js.UndefOr[certificateChainType]
    var Path: js.UndefOr[pathType]
  }

  object UploadServerCertificateRequest {
    def apply(
        CertificateBody: certificateBodyType,
        PrivateKey: privateKeyType,
        ServerCertificateName: serverCertificateNameType,
        CertificateChain: js.UndefOr[certificateChainType] = js.undefined,
        Path: js.UndefOr[pathType] = js.undefined
    ): UploadServerCertificateRequest = {
      val __obj = js.Dictionary[js.Any](
        "CertificateBody"       -> CertificateBody.asInstanceOf[js.Any],
        "PrivateKey"            -> PrivateKey.asInstanceOf[js.Any],
        "ServerCertificateName" -> ServerCertificateName.asInstanceOf[js.Any]
      )

      CertificateChain.foreach(__v => __obj.update("CertificateChain", __v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.update("Path", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UploadServerCertificateRequest]
    }
  }

  /**
    * Contains the response to a successful <a>UploadServerCertificate</a> request.
    */
  @js.native
  trait UploadServerCertificateResponse extends js.Object {
    var ServerCertificateMetadata: js.UndefOr[ServerCertificateMetadata]
  }

  object UploadServerCertificateResponse {
    def apply(
        ServerCertificateMetadata: js.UndefOr[ServerCertificateMetadata] = js.undefined
    ): UploadServerCertificateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ServerCertificateMetadata.foreach(__v => __obj.update("ServerCertificateMetadata", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UploadServerCertificateResponse]
    }
  }

  @js.native
  trait UploadSigningCertificateRequest extends js.Object {
    var CertificateBody: certificateBodyType
    var UserName: js.UndefOr[existingUserNameType]
  }

  object UploadSigningCertificateRequest {
    def apply(
        CertificateBody: certificateBodyType,
        UserName: js.UndefOr[existingUserNameType] = js.undefined
    ): UploadSigningCertificateRequest = {
      val __obj = js.Dictionary[js.Any](
        "CertificateBody" -> CertificateBody.asInstanceOf[js.Any]
      )

      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UploadSigningCertificateRequest]
    }
  }

  /**
    * Contains the response to a successful <a>UploadSigningCertificate</a> request.
    */
  @js.native
  trait UploadSigningCertificateResponse extends js.Object {
    var Certificate: SigningCertificate
  }

  object UploadSigningCertificateResponse {
    def apply(
        Certificate: SigningCertificate
    ): UploadSigningCertificateResponse = {
      val __obj = js.Dictionary[js.Any](
        "Certificate" -> Certificate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UploadSigningCertificateResponse]
    }
  }

  /**
    * Contains information about an IAM user entity.
    *  This data type is used as a response element in the following operations:
    * * <a>CreateUser</a>
    *  * <a>GetUser</a>
    *  * <a>ListUsers</a>
    */
  @js.native
  trait User extends js.Object {
    var Arn: arnType
    var CreateDate: dateType
    var Path: pathType
    var UserId: idType
    var UserName: userNameType
    var PasswordLastUsed: js.UndefOr[dateType]
    var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary]
    var Tags: js.UndefOr[tagListType]
  }

  object User {
    def apply(
        Arn: arnType,
        CreateDate: dateType,
        Path: pathType,
        UserId: idType,
        UserName: userNameType,
        PasswordLastUsed: js.UndefOr[dateType] = js.undefined,
        PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.undefined,
        Tags: js.UndefOr[tagListType] = js.undefined
    ): User = {
      val __obj = js.Dictionary[js.Any](
        "Arn"        -> Arn.asInstanceOf[js.Any],
        "CreateDate" -> CreateDate.asInstanceOf[js.Any],
        "Path"       -> Path.asInstanceOf[js.Any],
        "UserId"     -> UserId.asInstanceOf[js.Any],
        "UserName"   -> UserName.asInstanceOf[js.Any]
      )

      PasswordLastUsed.foreach(__v => __obj.update("PasswordLastUsed", __v.asInstanceOf[js.Any]))
      PermissionsBoundary.foreach(__v => __obj.update("PermissionsBoundary", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[User]
    }
  }

  /**
    * Contains information about an IAM user, including all the user's policies and all the IAM groups the user is in.
    *  This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.
    */
  @js.native
  trait UserDetail extends js.Object {
    var Arn: js.UndefOr[arnType]
    var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType]
    var CreateDate: js.UndefOr[dateType]
    var GroupList: js.UndefOr[groupNameListType]
    var Path: js.UndefOr[pathType]
    var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary]
    var Tags: js.UndefOr[tagListType]
    var UserId: js.UndefOr[idType]
    var UserName: js.UndefOr[userNameType]
    var UserPolicyList: js.UndefOr[policyDetailListType]
  }

  object UserDetail {
    def apply(
        Arn: js.UndefOr[arnType] = js.undefined,
        AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined,
        CreateDate: js.UndefOr[dateType] = js.undefined,
        GroupList: js.UndefOr[groupNameListType] = js.undefined,
        Path: js.UndefOr[pathType] = js.undefined,
        PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.undefined,
        Tags: js.UndefOr[tagListType] = js.undefined,
        UserId: js.UndefOr[idType] = js.undefined,
        UserName: js.UndefOr[userNameType] = js.undefined,
        UserPolicyList: js.UndefOr[policyDetailListType] = js.undefined
    ): UserDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      AttachedManagedPolicies.foreach(__v => __obj.update("AttachedManagedPolicies", __v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.update("CreateDate", __v.asInstanceOf[js.Any]))
      GroupList.foreach(__v => __obj.update("GroupList", __v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.update("Path", __v.asInstanceOf[js.Any]))
      PermissionsBoundary.foreach(__v => __obj.update("PermissionsBoundary", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.update("UserId", __v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      UserPolicyList.foreach(__v => __obj.update("UserPolicyList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserDetail]
    }
  }

  /**
    * Contains information about a virtual MFA device.
    */
  @js.native
  trait VirtualMFADevice extends js.Object {
    var SerialNumber: serialNumberType
    var Base32StringSeed: js.UndefOr[BootstrapDatum]
    var EnableDate: js.UndefOr[dateType]
    var QRCodePNG: js.UndefOr[BootstrapDatum]
    var User: js.UndefOr[User]
  }

  object VirtualMFADevice {
    def apply(
        SerialNumber: serialNumberType,
        Base32StringSeed: js.UndefOr[BootstrapDatum] = js.undefined,
        EnableDate: js.UndefOr[dateType] = js.undefined,
        QRCodePNG: js.UndefOr[BootstrapDatum] = js.undefined,
        User: js.UndefOr[User] = js.undefined
    ): VirtualMFADevice = {
      val __obj = js.Dictionary[js.Any](
        "SerialNumber" -> SerialNumber.asInstanceOf[js.Any]
      )

      Base32StringSeed.foreach(__v => __obj.update("Base32StringSeed", __v.asInstanceOf[js.Any]))
      EnableDate.foreach(__v => __obj.update("EnableDate", __v.asInstanceOf[js.Any]))
      QRCodePNG.foreach(__v => __obj.update("QRCodePNG", __v.asInstanceOf[js.Any]))
      User.foreach(__v => __obj.update("User", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualMFADevice]
    }
  }

  object assignmentStatusTypeEnum {
    val Assigned   = "Assigned"
    val Unassigned = "Unassigned"
    val Any        = "Any"

    val values = js.Object.freeze(js.Array(Assigned, Unassigned, Any))
  }

  object encodingTypeEnum {
    val SSH = "SSH"
    val PEM = "PEM"

    val values = js.Object.freeze(js.Array(SSH, PEM))
  }

  object globalEndpointTokenVersionEnum {
    val v1Token = "v1Token"
    val v2Token = "v2Token"

    val values = js.Object.freeze(js.Array(v1Token, v2Token))
  }

  object jobStatusTypeEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val COMPLETED   = "COMPLETED"
    val FAILED      = "FAILED"

    val values = js.Object.freeze(js.Array(IN_PROGRESS, COMPLETED, FAILED))
  }

  object policyOwnerEntityTypeEnum {
    val USER  = "USER"
    val ROLE  = "ROLE"
    val GROUP = "GROUP"

    val values = js.Object.freeze(js.Array(USER, ROLE, GROUP))
  }

  object policyScopeTypeEnum {
    val All   = "All"
    val AWS   = "AWS"
    val Local = "Local"

    val values = js.Object.freeze(js.Array(All, AWS, Local))
  }

  object policyTypeEnum {
    val INLINE  = "INLINE"
    val MANAGED = "MANAGED"

    val values = js.Object.freeze(js.Array(INLINE, MANAGED))
  }

  object sortKeyTypeEnum {
    val SERVICE_NAMESPACE_ASCENDING        = "SERVICE_NAMESPACE_ASCENDING"
    val SERVICE_NAMESPACE_DESCENDING       = "SERVICE_NAMESPACE_DESCENDING"
    val LAST_AUTHENTICATED_TIME_ASCENDING  = "LAST_AUTHENTICATED_TIME_ASCENDING"
    val LAST_AUTHENTICATED_TIME_DESCENDING = "LAST_AUTHENTICATED_TIME_DESCENDING"

    val values = js.Object.freeze(
      js.Array(
        SERVICE_NAMESPACE_ASCENDING,
        SERVICE_NAMESPACE_DESCENDING,
        LAST_AUTHENTICATED_TIME_ASCENDING,
        LAST_AUTHENTICATED_TIME_DESCENDING
      )
    )
  }

  object statusTypeEnum {
    val Active   = "Active"
    val Inactive = "Inactive"

    val values = js.Object.freeze(js.Array(Active, Inactive))
  }

  object summaryKeyTypeEnum {
    val Users                             = "Users"
    val UsersQuota                        = "UsersQuota"
    val Groups                            = "Groups"
    val GroupsQuota                       = "GroupsQuota"
    val ServerCertificates                = "ServerCertificates"
    val ServerCertificatesQuota           = "ServerCertificatesQuota"
    val UserPolicySizeQuota               = "UserPolicySizeQuota"
    val GroupPolicySizeQuota              = "GroupPolicySizeQuota"
    val GroupsPerUserQuota                = "GroupsPerUserQuota"
    val SigningCertificatesPerUserQuota   = "SigningCertificatesPerUserQuota"
    val AccessKeysPerUserQuota            = "AccessKeysPerUserQuota"
    val MFADevices                        = "MFADevices"
    val MFADevicesInUse                   = "MFADevicesInUse"
    val AccountMFAEnabled                 = "AccountMFAEnabled"
    val AccountAccessKeysPresent          = "AccountAccessKeysPresent"
    val AccountSigningCertificatesPresent = "AccountSigningCertificatesPresent"
    val AttachedPoliciesPerGroupQuota     = "AttachedPoliciesPerGroupQuota"
    val AttachedPoliciesPerRoleQuota      = "AttachedPoliciesPerRoleQuota"
    val AttachedPoliciesPerUserQuota      = "AttachedPoliciesPerUserQuota"
    val Policies                          = "Policies"
    val PoliciesQuota                     = "PoliciesQuota"
    val PolicySizeQuota                   = "PolicySizeQuota"
    val PolicyVersionsInUse               = "PolicyVersionsInUse"
    val PolicyVersionsInUseQuota          = "PolicyVersionsInUseQuota"
    val VersionsPerPolicyQuota            = "VersionsPerPolicyQuota"
    val GlobalEndpointTokenVersion        = "GlobalEndpointTokenVersion"

    val values = js.Object.freeze(
      js.Array(
        Users,
        UsersQuota,
        Groups,
        GroupsQuota,
        ServerCertificates,
        ServerCertificatesQuota,
        UserPolicySizeQuota,
        GroupPolicySizeQuota,
        GroupsPerUserQuota,
        SigningCertificatesPerUserQuota,
        AccessKeysPerUserQuota,
        MFADevices,
        MFADevicesInUse,
        AccountMFAEnabled,
        AccountAccessKeysPresent,
        AccountSigningCertificatesPresent,
        AttachedPoliciesPerGroupQuota,
        AttachedPoliciesPerRoleQuota,
        AttachedPoliciesPerUserQuota,
        Policies,
        PoliciesQuota,
        PolicySizeQuota,
        PolicyVersionsInUse,
        PolicyVersionsInUseQuota,
        VersionsPerPolicyQuota,
        GlobalEndpointTokenVersion
      )
    )
  }
}
