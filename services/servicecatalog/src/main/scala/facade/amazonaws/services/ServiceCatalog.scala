package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object servicecatalog {
  type AcceptLanguage                          = String
  type AccessLevelFilterKey                    = String
  type AccessLevelFilterValue                  = String
  type AccessStatus                            = String
  type AccountId                               = String
  type AccountIds                              = js.Array[AccountId]
  type AddTags                                 = js.Array[Tag]
  type AllowedValue                            = String
  type AllowedValues                           = js.Array[AllowedValue]
  type ApproximateCount                        = Int
  type AttributeValue                          = String
  type CausingEntity                           = String
  type ChangeAction                            = String
  type CloudWatchDashboardName                 = String
  type CloudWatchDashboards                    = js.Array[CloudWatchDashboard]
  type ConstraintDescription                   = String
  type ConstraintDetails                       = js.Array[ConstraintDetail]
  type ConstraintParameters                    = String
  type ConstraintSummaries                     = js.Array[ConstraintSummary]
  type ConstraintType                          = String
  type CopyOption                              = String
  type CopyOptions                             = js.Array[CopyOption]
  type CopyProductStatus                       = String
  type CreatedTime                             = js.Date
  type CreationTime                            = js.Date
  type DefaultValue                            = String
  type Description                             = String
  type Error                                   = String
  type ErrorCode                               = String
  type ErrorDescription                        = String
  type EvaluationType                          = String
  type FailedServiceActionAssociations         = js.Array[FailedServiceActionAssociation]
  type HasDefaultPath                          = Boolean
  type Id                                      = String
  type IdempotencyToken                        = String
  type IgnoreErrors                            = Boolean
  type InstructionType                         = String
  type InstructionValue                        = String
  type LastRequestId                           = String
  type LaunchPathSummaries                     = js.Array[LaunchPathSummary]
  type LogicalResourceId                       = String
  type Message                                 = String
  type Namespaces                              = js.Array[AccountId]
  type NoEcho                                  = Boolean
  type NotificationArn                         = String
  type NotificationArns                        = js.Array[NotificationArn]
  type OrganizationNodeType                    = String
  type OrganizationNodeValue                   = String
  type OrganizationNodes                       = js.Array[OrganizationNode]
  type OutputKey                               = String
  type OutputValue                             = String
  type PageSize                                = Int
  type PageToken                               = String
  type ParameterKey                            = String
  type ParameterType                           = String
  type ParameterValue                          = String
  type PhysicalId                              = String
  type PhysicalResourceId                      = String
  type PlanResourceType                        = String
  type PortfolioDescription                    = String
  type PortfolioDetails                        = js.Array[PortfolioDetail]
  type PortfolioDisplayName                    = String
  type PortfolioName                           = String
  type PortfolioShareToken                     = String
  type PortfolioShareType                      = String
  type PrincipalARN                            = String
  type PrincipalType                           = String
  type Principals                              = js.Array[Principal]
  type ProductArn                              = String
  type ProductSource                           = String
  type ProductType                             = String
  type ProductViewAggregationType              = String
  type ProductViewAggregationValues            = js.Array[ProductViewAggregationValue]
  type ProductViewAggregations                 = js.Dictionary[ProductViewAggregationValues]
  type ProductViewDetails                      = js.Array[ProductViewDetail]
  type ProductViewDistributor                  = String
  type ProductViewFilterBy                     = String
  type ProductViewFilterValue                  = String
  type ProductViewFilterValues                 = js.Array[ProductViewFilterValue]
  type ProductViewFilters                      = js.Dictionary[ProductViewFilterValues]
  type ProductViewName                         = String
  type ProductViewOwner                        = String
  type ProductViewShortDescription             = String
  type ProductViewSortBy                       = String
  type ProductViewSummaries                    = js.Array[ProductViewSummary]
  type PropertyName                            = String
  type ProviderName                            = String
  type ProvisionedProductAttributes            = js.Array[ProvisionedProductAttribute]
  type ProvisionedProductDetails               = js.Array[ProvisionedProductDetail]
  type ProvisionedProductFilters               = js.Dictionary[ProvisionedProductViewFilterValues]
  type ProvisionedProductId                    = String
  type ProvisionedProductName                  = String
  type ProvisionedProductNameOrArn             = String
  type ProvisionedProductPlanName              = String
  type ProvisionedProductPlanStatus            = String
  type ProvisionedProductPlanType              = String
  type ProvisionedProductPlans                 = js.Array[ProvisionedProductPlanSummary]
  type ProvisionedProductStatus                = String
  type ProvisionedProductStatusMessage         = String
  type ProvisionedProductType                  = String
  type ProvisionedProductViewFilterBy          = String
  type ProvisionedProductViewFilterValue       = String
  type ProvisionedProductViewFilterValues      = js.Array[ProvisionedProductViewFilterValue]
  type ProvisioningArtifactActive              = Boolean
  type ProvisioningArtifactCreatedTime         = js.Date
  type ProvisioningArtifactDescription         = String
  type ProvisioningArtifactDetails             = js.Array[ProvisioningArtifactDetail]
  type ProvisioningArtifactInfo                = js.Dictionary[ProvisioningArtifactInfoValue]
  type ProvisioningArtifactInfoKey             = String
  type ProvisioningArtifactInfoValue           = String
  type ProvisioningArtifactName                = String
  type ProvisioningArtifactParameters          = js.Array[ProvisioningArtifactParameter]
  type ProvisioningArtifactPropertyName        = String
  type ProvisioningArtifactPropertyValue       = String
  type ProvisioningArtifactSummaries           = js.Array[ProvisioningArtifactSummary]
  type ProvisioningArtifactType                = String
  type ProvisioningArtifactViews               = js.Array[ProvisioningArtifactView]
  type ProvisioningArtifacts                   = js.Array[ProvisioningArtifact]
  type ProvisioningParameters                  = js.Array[ProvisioningParameter]
  type RecordDetails                           = js.Array[RecordDetail]
  type RecordErrors                            = js.Array[RecordError]
  type RecordOutputs                           = js.Array[RecordOutput]
  type RecordStatus                            = String
  type RecordTagKey                            = String
  type RecordTagValue                          = String
  type RecordTags                              = js.Array[RecordTag]
  type RecordType                              = String
  type Region                                  = String
  type Replacement                             = String
  type RequiresRecreation                      = String
  type ResourceARN                             = String
  type ResourceAttribute                       = String
  type ResourceChangeDetails                   = js.Array[ResourceChangeDetail]
  type ResourceChanges                         = js.Array[ResourceChange]
  type ResourceDetailARN                       = String
  type ResourceDetailCreatedTime               = js.Date
  type ResourceDetailDescription               = String
  type ResourceDetailId                        = String
  type ResourceDetailName                      = String
  type ResourceDetails                         = js.Array[ResourceDetail]
  type ResourceId                              = String
  type ResourceType                            = String
  type Scope                                   = js.Array[ResourceAttribute]
  type SearchFilterKey                         = String
  type SearchFilterValue                       = String
  type SearchProvisionedProductsPageSize       = Int
  type ServiceActionAssociationErrorCode       = String
  type ServiceActionAssociationErrorMessage    = String
  type ServiceActionAssociations               = js.Array[ServiceActionAssociation]
  type ServiceActionDefinitionKey              = String
  type ServiceActionDefinitionMap              = js.Dictionary[ServiceActionDefinitionValue]
  type ServiceActionDefinitionType             = String
  type ServiceActionDefinitionValue            = String
  type ServiceActionDescription                = String
  type ServiceActionName                       = String
  type ServiceActionSummaries                  = js.Array[ServiceActionSummary]
  type ShareErrors                             = js.Array[ShareError]
  type ShareStatus                             = String
  type SortField                               = String
  type SortOrder                               = String
  type SourceProvisioningArtifactProperties    = js.Array[SourceProvisioningArtifactPropertiesMap]
  type SourceProvisioningArtifactPropertiesMap = js.Dictionary[ProvisioningArtifactPropertyValue]
  type StackSetAccounts                        = js.Array[AccountId]
  type StackSetFailureToleranceCount           = Int
  type StackSetFailureTolerancePercentage      = Int
  type StackSetMaxConcurrencyCount             = Int
  type StackSetMaxConcurrencyPercentage        = Int
  type StackSetOperationType                   = String
  type StackSetRegions                         = js.Array[Region]
  type Status                                  = String
  type StatusDetail                            = String
  type StatusMessage                           = String
  type SuccessfulShares                        = js.Array[AccountId]
  type SupportDescription                      = String
  type SupportEmail                            = String
  type SupportUrl                              = String
  type TagKey                                  = String
  type TagKeys                                 = js.Array[TagKey]
  type TagOptionActive                         = Boolean
  type TagOptionDetails                        = js.Array[TagOptionDetail]
  type TagOptionId                             = String
  type TagOptionKey                            = String
  type TagOptionSummaries                      = js.Array[TagOptionSummary]
  type TagOptionValue                          = String
  type TagOptionValues                         = js.Array[TagOptionValue]
  type TagValue                                = String
  type Tags                                    = js.Array[Tag]
  type TotalResultsCount                       = Int
  type UpdateProvisioningParameters            = js.Array[UpdateProvisioningParameter]
  type UpdatedTime                             = js.Date
  type UsageInstructions                       = js.Array[UsageInstruction]
  type UsePreviousValue                        = Boolean
  type UserArn                                 = String
  type UserArnSession                          = String
  type Verbose                                 = Boolean

  implicit final class ServiceCatalogOps(val service: ServiceCatalog) extends AnyVal {

    def acceptPortfolioShareFuture(params: AcceptPortfolioShareInput): Future[AcceptPortfolioShareOutput] =
      service.acceptPortfolioShare(params).promise.toFuture
    def associatePrincipalWithPortfolioFuture(
        params: AssociatePrincipalWithPortfolioInput
    ): Future[AssociatePrincipalWithPortfolioOutput] = service.associatePrincipalWithPortfolio(params).promise.toFuture
    def associateProductWithPortfolioFuture(
        params: AssociateProductWithPortfolioInput
    ): Future[AssociateProductWithPortfolioOutput] = service.associateProductWithPortfolio(params).promise.toFuture
    def associateServiceActionWithProvisioningArtifactFuture(
        params: AssociateServiceActionWithProvisioningArtifactInput
    ): Future[AssociateServiceActionWithProvisioningArtifactOutput] =
      service.associateServiceActionWithProvisioningArtifact(params).promise.toFuture
    def associateTagOptionWithResourceFuture(
        params: AssociateTagOptionWithResourceInput
    ): Future[AssociateTagOptionWithResourceOutput] = service.associateTagOptionWithResource(params).promise.toFuture
    def batchAssociateServiceActionWithProvisioningArtifactFuture(
        params: BatchAssociateServiceActionWithProvisioningArtifactInput
    ): Future[BatchAssociateServiceActionWithProvisioningArtifactOutput] =
      service.batchAssociateServiceActionWithProvisioningArtifact(params).promise.toFuture
    def batchDisassociateServiceActionFromProvisioningArtifactFuture(
        params: BatchDisassociateServiceActionFromProvisioningArtifactInput
    ): Future[BatchDisassociateServiceActionFromProvisioningArtifactOutput] =
      service.batchDisassociateServiceActionFromProvisioningArtifact(params).promise.toFuture
    def copyProductFuture(params: CopyProductInput): Future[CopyProductOutput] =
      service.copyProduct(params).promise.toFuture
    def createConstraintFuture(params: CreateConstraintInput): Future[CreateConstraintOutput] =
      service.createConstraint(params).promise.toFuture
    def createPortfolioFuture(params: CreatePortfolioInput): Future[CreatePortfolioOutput] =
      service.createPortfolio(params).promise.toFuture
    def createPortfolioShareFuture(params: CreatePortfolioShareInput): Future[CreatePortfolioShareOutput] =
      service.createPortfolioShare(params).promise.toFuture
    def createProductFuture(params: CreateProductInput): Future[CreateProductOutput] =
      service.createProduct(params).promise.toFuture
    def createProvisionedProductPlanFuture(
        params: CreateProvisionedProductPlanInput
    ): Future[CreateProvisionedProductPlanOutput] = service.createProvisionedProductPlan(params).promise.toFuture
    def createProvisioningArtifactFuture(
        params: CreateProvisioningArtifactInput
    ): Future[CreateProvisioningArtifactOutput] = service.createProvisioningArtifact(params).promise.toFuture
    def createServiceActionFuture(params: CreateServiceActionInput): Future[CreateServiceActionOutput] =
      service.createServiceAction(params).promise.toFuture
    def createTagOptionFuture(params: CreateTagOptionInput): Future[CreateTagOptionOutput] =
      service.createTagOption(params).promise.toFuture
    def deleteConstraintFuture(params: DeleteConstraintInput): Future[DeleteConstraintOutput] =
      service.deleteConstraint(params).promise.toFuture
    def deletePortfolioFuture(params: DeletePortfolioInput): Future[DeletePortfolioOutput] =
      service.deletePortfolio(params).promise.toFuture
    def deletePortfolioShareFuture(params: DeletePortfolioShareInput): Future[DeletePortfolioShareOutput] =
      service.deletePortfolioShare(params).promise.toFuture
    def deleteProductFuture(params: DeleteProductInput): Future[DeleteProductOutput] =
      service.deleteProduct(params).promise.toFuture
    def deleteProvisionedProductPlanFuture(
        params: DeleteProvisionedProductPlanInput
    ): Future[DeleteProvisionedProductPlanOutput] = service.deleteProvisionedProductPlan(params).promise.toFuture
    def deleteProvisioningArtifactFuture(
        params: DeleteProvisioningArtifactInput
    ): Future[DeleteProvisioningArtifactOutput] = service.deleteProvisioningArtifact(params).promise.toFuture
    def deleteServiceActionFuture(params: DeleteServiceActionInput): Future[DeleteServiceActionOutput] =
      service.deleteServiceAction(params).promise.toFuture
    def deleteTagOptionFuture(params: DeleteTagOptionInput): Future[DeleteTagOptionOutput] =
      service.deleteTagOption(params).promise.toFuture
    def describeConstraintFuture(params: DescribeConstraintInput): Future[DescribeConstraintOutput] =
      service.describeConstraint(params).promise.toFuture
    def describeCopyProductStatusFuture(
        params: DescribeCopyProductStatusInput
    ): Future[DescribeCopyProductStatusOutput] = service.describeCopyProductStatus(params).promise.toFuture
    def describePortfolioFuture(params: DescribePortfolioInput): Future[DescribePortfolioOutput] =
      service.describePortfolio(params).promise.toFuture
    def describePortfolioShareStatusFuture(
        params: DescribePortfolioShareStatusInput
    ): Future[DescribePortfolioShareStatusOutput] = service.describePortfolioShareStatus(params).promise.toFuture
    def describeProductAsAdminFuture(params: DescribeProductAsAdminInput): Future[DescribeProductAsAdminOutput] =
      service.describeProductAsAdmin(params).promise.toFuture
    def describeProductFuture(params: DescribeProductInput): Future[DescribeProductOutput] =
      service.describeProduct(params).promise.toFuture
    def describeProductViewFuture(params: DescribeProductViewInput): Future[DescribeProductViewOutput] =
      service.describeProductView(params).promise.toFuture
    def describeProvisionedProductFuture(
        params: DescribeProvisionedProductInput
    ): Future[DescribeProvisionedProductOutput] = service.describeProvisionedProduct(params).promise.toFuture
    def describeProvisionedProductPlanFuture(
        params: DescribeProvisionedProductPlanInput
    ): Future[DescribeProvisionedProductPlanOutput] = service.describeProvisionedProductPlan(params).promise.toFuture
    def describeProvisioningArtifactFuture(
        params: DescribeProvisioningArtifactInput
    ): Future[DescribeProvisioningArtifactOutput] = service.describeProvisioningArtifact(params).promise.toFuture
    def describeProvisioningParametersFuture(
        params: DescribeProvisioningParametersInput
    ): Future[DescribeProvisioningParametersOutput] = service.describeProvisioningParameters(params).promise.toFuture
    def describeRecordFuture(params: DescribeRecordInput): Future[DescribeRecordOutput] =
      service.describeRecord(params).promise.toFuture
    def describeServiceActionFuture(params: DescribeServiceActionInput): Future[DescribeServiceActionOutput] =
      service.describeServiceAction(params).promise.toFuture
    def describeTagOptionFuture(params: DescribeTagOptionInput): Future[DescribeTagOptionOutput] =
      service.describeTagOption(params).promise.toFuture
    def disableAWSOrganizationsAccessFuture(
        params: DisableAWSOrganizationsAccessInput
    ): Future[DisableAWSOrganizationsAccessOutput] = service.disableAWSOrganizationsAccess(params).promise.toFuture
    def disassociatePrincipalFromPortfolioFuture(
        params: DisassociatePrincipalFromPortfolioInput
    ): Future[DisassociatePrincipalFromPortfolioOutput] =
      service.disassociatePrincipalFromPortfolio(params).promise.toFuture
    def disassociateProductFromPortfolioFuture(
        params: DisassociateProductFromPortfolioInput
    ): Future[DisassociateProductFromPortfolioOutput] =
      service.disassociateProductFromPortfolio(params).promise.toFuture
    def disassociateServiceActionFromProvisioningArtifactFuture(
        params: DisassociateServiceActionFromProvisioningArtifactInput
    ): Future[DisassociateServiceActionFromProvisioningArtifactOutput] =
      service.disassociateServiceActionFromProvisioningArtifact(params).promise.toFuture
    def disassociateTagOptionFromResourceFuture(
        params: DisassociateTagOptionFromResourceInput
    ): Future[DisassociateTagOptionFromResourceOutput] =
      service.disassociateTagOptionFromResource(params).promise.toFuture
    def enableAWSOrganizationsAccessFuture(
        params: EnableAWSOrganizationsAccessInput
    ): Future[EnableAWSOrganizationsAccessOutput] = service.enableAWSOrganizationsAccess(params).promise.toFuture
    def executeProvisionedProductPlanFuture(
        params: ExecuteProvisionedProductPlanInput
    ): Future[ExecuteProvisionedProductPlanOutput] = service.executeProvisionedProductPlan(params).promise.toFuture
    def executeProvisionedProductServiceActionFuture(
        params: ExecuteProvisionedProductServiceActionInput
    ): Future[ExecuteProvisionedProductServiceActionOutput] =
      service.executeProvisionedProductServiceAction(params).promise.toFuture
    def getAWSOrganizationsAccessStatusFuture(
        params: GetAWSOrganizationsAccessStatusInput
    ): Future[GetAWSOrganizationsAccessStatusOutput] = service.getAWSOrganizationsAccessStatus(params).promise.toFuture
    def listAcceptedPortfolioSharesFuture(
        params: ListAcceptedPortfolioSharesInput
    ): Future[ListAcceptedPortfolioSharesOutput] = service.listAcceptedPortfolioShares(params).promise.toFuture
    def listConstraintsForPortfolioFuture(
        params: ListConstraintsForPortfolioInput
    ): Future[ListConstraintsForPortfolioOutput] = service.listConstraintsForPortfolio(params).promise.toFuture
    def listLaunchPathsFuture(params: ListLaunchPathsInput): Future[ListLaunchPathsOutput] =
      service.listLaunchPaths(params).promise.toFuture
    def listOrganizationPortfolioAccessFuture(
        params: ListOrganizationPortfolioAccessInput
    ): Future[ListOrganizationPortfolioAccessOutput] = service.listOrganizationPortfolioAccess(params).promise.toFuture
    def listPortfolioAccessFuture(params: ListPortfolioAccessInput): Future[ListPortfolioAccessOutput] =
      service.listPortfolioAccess(params).promise.toFuture
    def listPortfoliosForProductFuture(params: ListPortfoliosForProductInput): Future[ListPortfoliosForProductOutput] =
      service.listPortfoliosForProduct(params).promise.toFuture
    def listPortfoliosFuture(params: ListPortfoliosInput): Future[ListPortfoliosOutput] =
      service.listPortfolios(params).promise.toFuture
    def listPrincipalsForPortfolioFuture(
        params: ListPrincipalsForPortfolioInput
    ): Future[ListPrincipalsForPortfolioOutput] = service.listPrincipalsForPortfolio(params).promise.toFuture
    def listProvisionedProductPlansFuture(
        params: ListProvisionedProductPlansInput
    ): Future[ListProvisionedProductPlansOutput] = service.listProvisionedProductPlans(params).promise.toFuture
    def listProvisioningArtifactsForServiceActionFuture(
        params: ListProvisioningArtifactsForServiceActionInput
    ): Future[ListProvisioningArtifactsForServiceActionOutput] =
      service.listProvisioningArtifactsForServiceAction(params).promise.toFuture
    def listProvisioningArtifactsFuture(
        params: ListProvisioningArtifactsInput
    ): Future[ListProvisioningArtifactsOutput] = service.listProvisioningArtifacts(params).promise.toFuture
    def listRecordHistoryFuture(params: ListRecordHistoryInput): Future[ListRecordHistoryOutput] =
      service.listRecordHistory(params).promise.toFuture
    def listResourcesForTagOptionFuture(
        params: ListResourcesForTagOptionInput
    ): Future[ListResourcesForTagOptionOutput] = service.listResourcesForTagOption(params).promise.toFuture
    def listServiceActionsForProvisioningArtifactFuture(
        params: ListServiceActionsForProvisioningArtifactInput
    ): Future[ListServiceActionsForProvisioningArtifactOutput] =
      service.listServiceActionsForProvisioningArtifact(params).promise.toFuture
    def listServiceActionsFuture(params: ListServiceActionsInput): Future[ListServiceActionsOutput] =
      service.listServiceActions(params).promise.toFuture
    def listTagOptionsFuture(params: ListTagOptionsInput): Future[ListTagOptionsOutput] =
      service.listTagOptions(params).promise.toFuture
    def provisionProductFuture(params: ProvisionProductInput): Future[ProvisionProductOutput] =
      service.provisionProduct(params).promise.toFuture
    def rejectPortfolioShareFuture(params: RejectPortfolioShareInput): Future[RejectPortfolioShareOutput] =
      service.rejectPortfolioShare(params).promise.toFuture
    def scanProvisionedProductsFuture(params: ScanProvisionedProductsInput): Future[ScanProvisionedProductsOutput] =
      service.scanProvisionedProducts(params).promise.toFuture
    def searchProductsAsAdminFuture(params: SearchProductsAsAdminInput): Future[SearchProductsAsAdminOutput] =
      service.searchProductsAsAdmin(params).promise.toFuture
    def searchProductsFuture(params: SearchProductsInput): Future[SearchProductsOutput] =
      service.searchProducts(params).promise.toFuture
    def searchProvisionedProductsFuture(
        params: SearchProvisionedProductsInput
    ): Future[SearchProvisionedProductsOutput] = service.searchProvisionedProducts(params).promise.toFuture
    def terminateProvisionedProductFuture(
        params: TerminateProvisionedProductInput
    ): Future[TerminateProvisionedProductOutput] = service.terminateProvisionedProduct(params).promise.toFuture
    def updateConstraintFuture(params: UpdateConstraintInput): Future[UpdateConstraintOutput] =
      service.updateConstraint(params).promise.toFuture
    def updatePortfolioFuture(params: UpdatePortfolioInput): Future[UpdatePortfolioOutput] =
      service.updatePortfolio(params).promise.toFuture
    def updateProductFuture(params: UpdateProductInput): Future[UpdateProductOutput] =
      service.updateProduct(params).promise.toFuture
    def updateProvisionedProductFuture(params: UpdateProvisionedProductInput): Future[UpdateProvisionedProductOutput] =
      service.updateProvisionedProduct(params).promise.toFuture
    def updateProvisioningArtifactFuture(
        params: UpdateProvisioningArtifactInput
    ): Future[UpdateProvisioningArtifactOutput] = service.updateProvisioningArtifact(params).promise.toFuture
    def updateServiceActionFuture(params: UpdateServiceActionInput): Future[UpdateServiceActionOutput] =
      service.updateServiceAction(params).promise.toFuture
    def updateTagOptionFuture(params: UpdateTagOptionInput): Future[UpdateTagOptionOutput] =
      service.updateTagOption(params).promise.toFuture
  }
}

package servicecatalog {
  @js.native
  @JSImport("aws-sdk", "ServiceCatalog")
  class ServiceCatalog() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptPortfolioShare(params: AcceptPortfolioShareInput): Request[AcceptPortfolioShareOutput] = js.native
    def associatePrincipalWithPortfolio(
        params: AssociatePrincipalWithPortfolioInput
    ): Request[AssociatePrincipalWithPortfolioOutput] = js.native
    def associateProductWithPortfolio(
        params: AssociateProductWithPortfolioInput
    ): Request[AssociateProductWithPortfolioOutput] = js.native
    def associateServiceActionWithProvisioningArtifact(
        params: AssociateServiceActionWithProvisioningArtifactInput
    ): Request[AssociateServiceActionWithProvisioningArtifactOutput] = js.native
    def associateTagOptionWithResource(
        params: AssociateTagOptionWithResourceInput
    ): Request[AssociateTagOptionWithResourceOutput] = js.native
    def batchAssociateServiceActionWithProvisioningArtifact(
        params: BatchAssociateServiceActionWithProvisioningArtifactInput
    ): Request[BatchAssociateServiceActionWithProvisioningArtifactOutput] = js.native
    def batchDisassociateServiceActionFromProvisioningArtifact(
        params: BatchDisassociateServiceActionFromProvisioningArtifactInput
    ): Request[BatchDisassociateServiceActionFromProvisioningArtifactOutput]                         = js.native
    def copyProduct(params: CopyProductInput): Request[CopyProductOutput]                            = js.native
    def createConstraint(params: CreateConstraintInput): Request[CreateConstraintOutput]             = js.native
    def createPortfolio(params: CreatePortfolioInput): Request[CreatePortfolioOutput]                = js.native
    def createPortfolioShare(params: CreatePortfolioShareInput): Request[CreatePortfolioShareOutput] = js.native
    def createProduct(params: CreateProductInput): Request[CreateProductOutput]                      = js.native
    def createProvisionedProductPlan(
        params: CreateProvisionedProductPlanInput
    ): Request[CreateProvisionedProductPlanOutput] = js.native
    def createProvisioningArtifact(params: CreateProvisioningArtifactInput): Request[CreateProvisioningArtifactOutput] =
      js.native
    def createServiceAction(params: CreateServiceActionInput): Request[CreateServiceActionOutput]    = js.native
    def createTagOption(params: CreateTagOptionInput): Request[CreateTagOptionOutput]                = js.native
    def deleteConstraint(params: DeleteConstraintInput): Request[DeleteConstraintOutput]             = js.native
    def deletePortfolio(params: DeletePortfolioInput): Request[DeletePortfolioOutput]                = js.native
    def deletePortfolioShare(params: DeletePortfolioShareInput): Request[DeletePortfolioShareOutput] = js.native
    def deleteProduct(params: DeleteProductInput): Request[DeleteProductOutput]                      = js.native
    def deleteProvisionedProductPlan(
        params: DeleteProvisionedProductPlanInput
    ): Request[DeleteProvisionedProductPlanOutput] = js.native
    def deleteProvisioningArtifact(params: DeleteProvisioningArtifactInput): Request[DeleteProvisioningArtifactOutput] =
      js.native
    def deleteServiceAction(params: DeleteServiceActionInput): Request[DeleteServiceActionOutput] = js.native
    def deleteTagOption(params: DeleteTagOptionInput): Request[DeleteTagOptionOutput]             = js.native
    def describeConstraint(params: DescribeConstraintInput): Request[DescribeConstraintOutput]    = js.native
    def describeCopyProductStatus(params: DescribeCopyProductStatusInput): Request[DescribeCopyProductStatusOutput] =
      js.native
    def describePortfolio(params: DescribePortfolioInput): Request[DescribePortfolioOutput] = js.native
    def describePortfolioShareStatus(
        params: DescribePortfolioShareStatusInput
    ): Request[DescribePortfolioShareStatusOutput]                                                         = js.native
    def describeProduct(params: DescribeProductInput): Request[DescribeProductOutput]                      = js.native
    def describeProductAsAdmin(params: DescribeProductAsAdminInput): Request[DescribeProductAsAdminOutput] = js.native
    def describeProductView(params: DescribeProductViewInput): Request[DescribeProductViewOutput]          = js.native
    def describeProvisionedProduct(params: DescribeProvisionedProductInput): Request[DescribeProvisionedProductOutput] =
      js.native
    def describeProvisionedProductPlan(
        params: DescribeProvisionedProductPlanInput
    ): Request[DescribeProvisionedProductPlanOutput] = js.native
    def describeProvisioningArtifact(
        params: DescribeProvisioningArtifactInput
    ): Request[DescribeProvisioningArtifactOutput] = js.native
    def describeProvisioningParameters(
        params: DescribeProvisioningParametersInput
    ): Request[DescribeProvisioningParametersOutput]                                                    = js.native
    def describeRecord(params: DescribeRecordInput): Request[DescribeRecordOutput]                      = js.native
    def describeServiceAction(params: DescribeServiceActionInput): Request[DescribeServiceActionOutput] = js.native
    def describeTagOption(params: DescribeTagOptionInput): Request[DescribeTagOptionOutput]             = js.native
    def disableAWSOrganizationsAccess(
        params: DisableAWSOrganizationsAccessInput
    ): Request[DisableAWSOrganizationsAccessOutput] = js.native
    def disassociatePrincipalFromPortfolio(
        params: DisassociatePrincipalFromPortfolioInput
    ): Request[DisassociatePrincipalFromPortfolioOutput] = js.native
    def disassociateProductFromPortfolio(
        params: DisassociateProductFromPortfolioInput
    ): Request[DisassociateProductFromPortfolioOutput] = js.native
    def disassociateServiceActionFromProvisioningArtifact(
        params: DisassociateServiceActionFromProvisioningArtifactInput
    ): Request[DisassociateServiceActionFromProvisioningArtifactOutput] = js.native
    def disassociateTagOptionFromResource(
        params: DisassociateTagOptionFromResourceInput
    ): Request[DisassociateTagOptionFromResourceOutput] = js.native
    def enableAWSOrganizationsAccess(
        params: EnableAWSOrganizationsAccessInput
    ): Request[EnableAWSOrganizationsAccessOutput] = js.native
    def executeProvisionedProductPlan(
        params: ExecuteProvisionedProductPlanInput
    ): Request[ExecuteProvisionedProductPlanOutput] = js.native
    def executeProvisionedProductServiceAction(
        params: ExecuteProvisionedProductServiceActionInput
    ): Request[ExecuteProvisionedProductServiceActionOutput] = js.native
    def getAWSOrganizationsAccessStatus(
        params: GetAWSOrganizationsAccessStatusInput
    ): Request[GetAWSOrganizationsAccessStatusOutput] = js.native
    def listAcceptedPortfolioShares(
        params: ListAcceptedPortfolioSharesInput
    ): Request[ListAcceptedPortfolioSharesOutput] = js.native
    def listConstraintsForPortfolio(
        params: ListConstraintsForPortfolioInput
    ): Request[ListConstraintsForPortfolioOutput]                                     = js.native
    def listLaunchPaths(params: ListLaunchPathsInput): Request[ListLaunchPathsOutput] = js.native
    def listOrganizationPortfolioAccess(
        params: ListOrganizationPortfolioAccessInput
    ): Request[ListOrganizationPortfolioAccessOutput]                                             = js.native
    def listPortfolioAccess(params: ListPortfolioAccessInput): Request[ListPortfolioAccessOutput] = js.native
    def listPortfolios(params: ListPortfoliosInput): Request[ListPortfoliosOutput]                = js.native
    def listPortfoliosForProduct(params: ListPortfoliosForProductInput): Request[ListPortfoliosForProductOutput] =
      js.native
    def listPrincipalsForPortfolio(params: ListPrincipalsForPortfolioInput): Request[ListPrincipalsForPortfolioOutput] =
      js.native
    def listProvisionedProductPlans(
        params: ListProvisionedProductPlansInput
    ): Request[ListProvisionedProductPlansOutput] = js.native
    def listProvisioningArtifacts(params: ListProvisioningArtifactsInput): Request[ListProvisioningArtifactsOutput] =
      js.native
    def listProvisioningArtifactsForServiceAction(
        params: ListProvisioningArtifactsForServiceActionInput
    ): Request[ListProvisioningArtifactsForServiceActionOutput]                             = js.native
    def listRecordHistory(params: ListRecordHistoryInput): Request[ListRecordHistoryOutput] = js.native
    def listResourcesForTagOption(params: ListResourcesForTagOptionInput): Request[ListResourcesForTagOptionOutput] =
      js.native
    def listServiceActions(params: ListServiceActionsInput): Request[ListServiceActionsOutput] = js.native
    def listServiceActionsForProvisioningArtifact(
        params: ListServiceActionsForProvisioningArtifactInput
    ): Request[ListServiceActionsForProvisioningArtifactOutput]                                      = js.native
    def listTagOptions(params: ListTagOptionsInput): Request[ListTagOptionsOutput]                   = js.native
    def provisionProduct(params: ProvisionProductInput): Request[ProvisionProductOutput]             = js.native
    def rejectPortfolioShare(params: RejectPortfolioShareInput): Request[RejectPortfolioShareOutput] = js.native
    def scanProvisionedProducts(params: ScanProvisionedProductsInput): Request[ScanProvisionedProductsOutput] =
      js.native
    def searchProducts(params: SearchProductsInput): Request[SearchProductsOutput]                      = js.native
    def searchProductsAsAdmin(params: SearchProductsAsAdminInput): Request[SearchProductsAsAdminOutput] = js.native
    def searchProvisionedProducts(params: SearchProvisionedProductsInput): Request[SearchProvisionedProductsOutput] =
      js.native
    def terminateProvisionedProduct(
        params: TerminateProvisionedProductInput
    ): Request[TerminateProvisionedProductOutput]                                        = js.native
    def updateConstraint(params: UpdateConstraintInput): Request[UpdateConstraintOutput] = js.native
    def updatePortfolio(params: UpdatePortfolioInput): Request[UpdatePortfolioOutput]    = js.native
    def updateProduct(params: UpdateProductInput): Request[UpdateProductOutput]          = js.native
    def updateProvisionedProduct(params: UpdateProvisionedProductInput): Request[UpdateProvisionedProductOutput] =
      js.native
    def updateProvisioningArtifact(params: UpdateProvisioningArtifactInput): Request[UpdateProvisioningArtifactOutput] =
      js.native
    def updateServiceAction(params: UpdateServiceActionInput): Request[UpdateServiceActionOutput] = js.native
    def updateTagOption(params: UpdateTagOptionInput): Request[UpdateTagOptionOutput]             = js.native
  }

  @js.native
  trait AcceptPortfolioShareInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PortfolioShareType: js.UndefOr[PortfolioShareType]
  }

  object AcceptPortfolioShareInput {
    def apply(
        PortfolioId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PortfolioShareType: js.UndefOr[PortfolioShareType] = js.undefined
    ): AcceptPortfolioShareInput = {
      val __obj = js.Dictionary[js.Any](
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      PortfolioShareType.foreach(__v => __obj.update("PortfolioShareType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceptPortfolioShareInput]
    }
  }

  @js.native
  trait AcceptPortfolioShareOutput extends js.Object {}

  object AcceptPortfolioShareOutput {
    def apply(
        ): AcceptPortfolioShareOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[AcceptPortfolioShareOutput]
    }
  }

  /**
    * The access level to use to filter results.
    */
  @js.native
  trait AccessLevelFilter extends js.Object {
    var Key: js.UndefOr[AccessLevelFilterKey]
    var Value: js.UndefOr[AccessLevelFilterValue]
  }

  object AccessLevelFilter {
    def apply(
        Key: js.UndefOr[AccessLevelFilterKey] = js.undefined,
        Value: js.UndefOr[AccessLevelFilterValue] = js.undefined
    ): AccessLevelFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessLevelFilter]
    }
  }

  object AccessLevelFilterKeyEnum {
    val Account = "Account"
    val Role    = "Role"
    val User    = "User"

    val values = IndexedSeq(Account, Role, User)
  }

  object AccessStatusEnum {
    val ENABLED      = "ENABLED"
    val UNDER_CHANGE = "UNDER_CHANGE"
    val DISABLED     = "DISABLED"

    val values = IndexedSeq(ENABLED, UNDER_CHANGE, DISABLED)
  }

  @js.native
  trait AssociatePrincipalWithPortfolioInput extends js.Object {
    var PortfolioId: Id
    var PrincipalARN: PrincipalARN
    var PrincipalType: PrincipalType
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object AssociatePrincipalWithPortfolioInput {
    def apply(
        PortfolioId: Id,
        PrincipalARN: PrincipalARN,
        PrincipalType: PrincipalType,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): AssociatePrincipalWithPortfolioInput = {
      val __obj = js.Dictionary[js.Any](
        "PortfolioId"   -> PortfolioId.asInstanceOf[js.Any],
        "PrincipalARN"  -> PrincipalARN.asInstanceOf[js.Any],
        "PrincipalType" -> PrincipalType.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociatePrincipalWithPortfolioInput]
    }
  }

  @js.native
  trait AssociatePrincipalWithPortfolioOutput extends js.Object {}

  object AssociatePrincipalWithPortfolioOutput {
    def apply(
        ): AssociatePrincipalWithPortfolioOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[AssociatePrincipalWithPortfolioOutput]
    }
  }

  @js.native
  trait AssociateProductWithPortfolioInput extends js.Object {
    var PortfolioId: Id
    var ProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var SourcePortfolioId: js.UndefOr[Id]
  }

  object AssociateProductWithPortfolioInput {
    def apply(
        PortfolioId: Id,
        ProductId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        SourcePortfolioId: js.UndefOr[Id] = js.undefined
    ): AssociateProductWithPortfolioInput = {
      val __obj = js.Dictionary[js.Any](
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any],
        "ProductId"   -> ProductId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      SourcePortfolioId.foreach(__v => __obj.update("SourcePortfolioId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateProductWithPortfolioInput]
    }
  }

  @js.native
  trait AssociateProductWithPortfolioOutput extends js.Object {}

  object AssociateProductWithPortfolioOutput {
    def apply(
        ): AssociateProductWithPortfolioOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[AssociateProductWithPortfolioOutput]
    }
  }

  @js.native
  trait AssociateServiceActionWithProvisioningArtifactInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var ServiceActionId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object AssociateServiceActionWithProvisioningArtifactInput {
    def apply(
        ProductId: Id,
        ProvisioningArtifactId: Id,
        ServiceActionId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): AssociateServiceActionWithProvisioningArtifactInput = {
      val __obj = js.Dictionary[js.Any](
        "ProductId"              -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any],
        "ServiceActionId"        -> ServiceActionId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateServiceActionWithProvisioningArtifactInput]
    }
  }

  @js.native
  trait AssociateServiceActionWithProvisioningArtifactOutput extends js.Object {}

  object AssociateServiceActionWithProvisioningArtifactOutput {
    def apply(
        ): AssociateServiceActionWithProvisioningArtifactOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[AssociateServiceActionWithProvisioningArtifactOutput]
    }
  }

  @js.native
  trait AssociateTagOptionWithResourceInput extends js.Object {
    var ResourceId: ResourceId
    var TagOptionId: TagOptionId
  }

  object AssociateTagOptionWithResourceInput {
    def apply(
        ResourceId: ResourceId,
        TagOptionId: TagOptionId
    ): AssociateTagOptionWithResourceInput = {
      val __obj = js.Dictionary[js.Any](
        "ResourceId"  -> ResourceId.asInstanceOf[js.Any],
        "TagOptionId" -> TagOptionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateTagOptionWithResourceInput]
    }
  }

  @js.native
  trait AssociateTagOptionWithResourceOutput extends js.Object {}

  object AssociateTagOptionWithResourceOutput {
    def apply(
        ): AssociateTagOptionWithResourceOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[AssociateTagOptionWithResourceOutput]
    }
  }

  @js.native
  trait BatchAssociateServiceActionWithProvisioningArtifactInput extends js.Object {
    var ServiceActionAssociations: ServiceActionAssociations
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object BatchAssociateServiceActionWithProvisioningArtifactInput {
    def apply(
        ServiceActionAssociations: ServiceActionAssociations,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): BatchAssociateServiceActionWithProvisioningArtifactInput = {
      val __obj = js.Dictionary[js.Any](
        "ServiceActionAssociations" -> ServiceActionAssociations.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchAssociateServiceActionWithProvisioningArtifactInput]
    }
  }

  @js.native
  trait BatchAssociateServiceActionWithProvisioningArtifactOutput extends js.Object {
    var FailedServiceActionAssociations: js.UndefOr[FailedServiceActionAssociations]
  }

  object BatchAssociateServiceActionWithProvisioningArtifactOutput {
    def apply(
        FailedServiceActionAssociations: js.UndefOr[FailedServiceActionAssociations] = js.undefined
    ): BatchAssociateServiceActionWithProvisioningArtifactOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      FailedServiceActionAssociations.foreach(
        __v => __obj.update("FailedServiceActionAssociations", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[BatchAssociateServiceActionWithProvisioningArtifactOutput]
    }
  }

  @js.native
  trait BatchDisassociateServiceActionFromProvisioningArtifactInput extends js.Object {
    var ServiceActionAssociations: ServiceActionAssociations
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object BatchDisassociateServiceActionFromProvisioningArtifactInput {
    def apply(
        ServiceActionAssociations: ServiceActionAssociations,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): BatchDisassociateServiceActionFromProvisioningArtifactInput = {
      val __obj = js.Dictionary[js.Any](
        "ServiceActionAssociations" -> ServiceActionAssociations.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDisassociateServiceActionFromProvisioningArtifactInput]
    }
  }

  @js.native
  trait BatchDisassociateServiceActionFromProvisioningArtifactOutput extends js.Object {
    var FailedServiceActionAssociations: js.UndefOr[FailedServiceActionAssociations]
  }

  object BatchDisassociateServiceActionFromProvisioningArtifactOutput {
    def apply(
        FailedServiceActionAssociations: js.UndefOr[FailedServiceActionAssociations] = js.undefined
    ): BatchDisassociateServiceActionFromProvisioningArtifactOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      FailedServiceActionAssociations.foreach(
        __v => __obj.update("FailedServiceActionAssociations", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[BatchDisassociateServiceActionFromProvisioningArtifactOutput]
    }
  }

  object ChangeActionEnum {
    val ADD    = "ADD"
    val MODIFY = "MODIFY"
    val REMOVE = "REMOVE"

    val values = IndexedSeq(ADD, MODIFY, REMOVE)
  }

  /**
    * Information about a CloudWatch dashboard.
    */
  @js.native
  trait CloudWatchDashboard extends js.Object {
    var Name: js.UndefOr[CloudWatchDashboardName]
  }

  object CloudWatchDashboard {
    def apply(
        Name: js.UndefOr[CloudWatchDashboardName] = js.undefined
    ): CloudWatchDashboard = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchDashboard]
    }
  }

  /**
    * Information about a constraint.
    */
  @js.native
  trait ConstraintDetail extends js.Object {
    var ConstraintId: js.UndefOr[Id]
    var Description: js.UndefOr[ConstraintDescription]
    var Owner: js.UndefOr[AccountId]
    var Type: js.UndefOr[ConstraintType]
  }

  object ConstraintDetail {
    def apply(
        ConstraintId: js.UndefOr[Id] = js.undefined,
        Description: js.UndefOr[ConstraintDescription] = js.undefined,
        Owner: js.UndefOr[AccountId] = js.undefined,
        Type: js.UndefOr[ConstraintType] = js.undefined
    ): ConstraintDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      ConstraintId.foreach(__v => __obj.update("ConstraintId", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.update("Owner", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConstraintDetail]
    }
  }

  /**
    * Summary information about a constraint.
    */
  @js.native
  trait ConstraintSummary extends js.Object {
    var Description: js.UndefOr[ConstraintDescription]
    var Type: js.UndefOr[ConstraintType]
  }

  object ConstraintSummary {
    def apply(
        Description: js.UndefOr[ConstraintDescription] = js.undefined,
        Type: js.UndefOr[ConstraintType] = js.undefined
    ): ConstraintSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConstraintSummary]
    }
  }

  object CopyOptionEnum {
    val CopyTags = "CopyTags"

    val values = IndexedSeq(CopyTags)
  }

  @js.native
  trait CopyProductInput extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var SourceProductArn: ProductArn
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var CopyOptions: js.UndefOr[CopyOptions]
    var SourceProvisioningArtifactIdentifiers: js.UndefOr[SourceProvisioningArtifactProperties]
    var TargetProductId: js.UndefOr[Id]
    var TargetProductName: js.UndefOr[ProductViewName]
  }

  object CopyProductInput {
    def apply(
        IdempotencyToken: IdempotencyToken,
        SourceProductArn: ProductArn,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        CopyOptions: js.UndefOr[CopyOptions] = js.undefined,
        SourceProvisioningArtifactIdentifiers: js.UndefOr[SourceProvisioningArtifactProperties] = js.undefined,
        TargetProductId: js.UndefOr[Id] = js.undefined,
        TargetProductName: js.UndefOr[ProductViewName] = js.undefined
    ): CopyProductInput = {
      val __obj = js.Dictionary[js.Any](
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "SourceProductArn" -> SourceProductArn.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      CopyOptions.foreach(__v => __obj.update("CopyOptions", __v.asInstanceOf[js.Any]))
      SourceProvisioningArtifactIdentifiers.foreach(
        __v => __obj.update("SourceProvisioningArtifactIdentifiers", __v.asInstanceOf[js.Any])
      )
      TargetProductId.foreach(__v => __obj.update("TargetProductId", __v.asInstanceOf[js.Any]))
      TargetProductName.foreach(__v => __obj.update("TargetProductName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyProductInput]
    }
  }

  @js.native
  trait CopyProductOutput extends js.Object {
    var CopyProductToken: js.UndefOr[Id]
  }

  object CopyProductOutput {
    def apply(
        CopyProductToken: js.UndefOr[Id] = js.undefined
    ): CopyProductOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      CopyProductToken.foreach(__v => __obj.update("CopyProductToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyProductOutput]
    }
  }

  object CopyProductStatusEnum {
    val SUCCEEDED   = "SUCCEEDED"
    val IN_PROGRESS = "IN_PROGRESS"
    val FAILED      = "FAILED"

    val values = IndexedSeq(SUCCEEDED, IN_PROGRESS, FAILED)
  }

  @js.native
  trait CreateConstraintInput extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var Parameters: ConstraintParameters
    var PortfolioId: Id
    var ProductId: Id
    var Type: ConstraintType
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Description: js.UndefOr[ConstraintDescription]
  }

  object CreateConstraintInput {
    def apply(
        IdempotencyToken: IdempotencyToken,
        Parameters: ConstraintParameters,
        PortfolioId: Id,
        ProductId: Id,
        Type: ConstraintType,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Description: js.UndefOr[ConstraintDescription] = js.undefined
    ): CreateConstraintInput = {
      val __obj = js.Dictionary[js.Any](
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "Parameters"       -> Parameters.asInstanceOf[js.Any],
        "PortfolioId"      -> PortfolioId.asInstanceOf[js.Any],
        "ProductId"        -> ProductId.asInstanceOf[js.Any],
        "Type"             -> Type.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConstraintInput]
    }
  }

  @js.native
  trait CreateConstraintOutput extends js.Object {
    var ConstraintDetail: js.UndefOr[ConstraintDetail]
    var ConstraintParameters: js.UndefOr[ConstraintParameters]
    var Status: js.UndefOr[Status]
  }

  object CreateConstraintOutput {
    def apply(
        ConstraintDetail: js.UndefOr[ConstraintDetail] = js.undefined,
        ConstraintParameters: js.UndefOr[ConstraintParameters] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): CreateConstraintOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ConstraintDetail.foreach(__v => __obj.update("ConstraintDetail", __v.asInstanceOf[js.Any]))
      ConstraintParameters.foreach(__v => __obj.update("ConstraintParameters", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConstraintOutput]
    }
  }

  @js.native
  trait CreatePortfolioInput extends js.Object {
    var DisplayName: PortfolioDisplayName
    var IdempotencyToken: IdempotencyToken
    var ProviderName: ProviderName
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Description: js.UndefOr[PortfolioDescription]
    var Tags: js.UndefOr[AddTags]
  }

  object CreatePortfolioInput {
    def apply(
        DisplayName: PortfolioDisplayName,
        IdempotencyToken: IdempotencyToken,
        ProviderName: ProviderName,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Description: js.UndefOr[PortfolioDescription] = js.undefined,
        Tags: js.UndefOr[AddTags] = js.undefined
    ): CreatePortfolioInput = {
      val __obj = js.Dictionary[js.Any](
        "DisplayName"      -> DisplayName.asInstanceOf[js.Any],
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "ProviderName"     -> ProviderName.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePortfolioInput]
    }
  }

  @js.native
  trait CreatePortfolioOutput extends js.Object {
    var PortfolioDetail: js.UndefOr[PortfolioDetail]
    var Tags: js.UndefOr[Tags]
  }

  object CreatePortfolioOutput {
    def apply(
        PortfolioDetail: js.UndefOr[PortfolioDetail] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreatePortfolioOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      PortfolioDetail.foreach(__v => __obj.update("PortfolioDetail", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePortfolioOutput]
    }
  }

  @js.native
  trait CreatePortfolioShareInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AccountId: js.UndefOr[AccountId]
    var OrganizationNode: js.UndefOr[OrganizationNode]
  }

  object CreatePortfolioShareInput {
    def apply(
        PortfolioId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        AccountId: js.UndefOr[AccountId] = js.undefined,
        OrganizationNode: js.UndefOr[OrganizationNode] = js.undefined
    ): CreatePortfolioShareInput = {
      val __obj = js.Dictionary[js.Any](
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      AccountId.foreach(__v => __obj.update("AccountId", __v.asInstanceOf[js.Any]))
      OrganizationNode.foreach(__v => __obj.update("OrganizationNode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePortfolioShareInput]
    }
  }

  @js.native
  trait CreatePortfolioShareOutput extends js.Object {
    var PortfolioShareToken: js.UndefOr[PortfolioShareToken]
  }

  object CreatePortfolioShareOutput {
    def apply(
        PortfolioShareToken: js.UndefOr[PortfolioShareToken] = js.undefined
    ): CreatePortfolioShareOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      PortfolioShareToken.foreach(__v => __obj.update("PortfolioShareToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePortfolioShareOutput]
    }
  }

  @js.native
  trait CreateProductInput extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var Name: ProductViewName
    var Owner: ProductViewOwner
    var ProductType: ProductType
    var ProvisioningArtifactParameters: ProvisioningArtifactProperties
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Description: js.UndefOr[ProductViewShortDescription]
    var Distributor: js.UndefOr[ProductViewOwner]
    var SupportDescription: js.UndefOr[SupportDescription]
    var SupportEmail: js.UndefOr[SupportEmail]
    var SupportUrl: js.UndefOr[SupportUrl]
    var Tags: js.UndefOr[AddTags]
  }

  object CreateProductInput {
    def apply(
        IdempotencyToken: IdempotencyToken,
        Name: ProductViewName,
        Owner: ProductViewOwner,
        ProductType: ProductType,
        ProvisioningArtifactParameters: ProvisioningArtifactProperties,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Description: js.UndefOr[ProductViewShortDescription] = js.undefined,
        Distributor: js.UndefOr[ProductViewOwner] = js.undefined,
        SupportDescription: js.UndefOr[SupportDescription] = js.undefined,
        SupportEmail: js.UndefOr[SupportEmail] = js.undefined,
        SupportUrl: js.UndefOr[SupportUrl] = js.undefined,
        Tags: js.UndefOr[AddTags] = js.undefined
    ): CreateProductInput = {
      val __obj = js.Dictionary[js.Any](
        "IdempotencyToken"               -> IdempotencyToken.asInstanceOf[js.Any],
        "Name"                           -> Name.asInstanceOf[js.Any],
        "Owner"                          -> Owner.asInstanceOf[js.Any],
        "ProductType"                    -> ProductType.asInstanceOf[js.Any],
        "ProvisioningArtifactParameters" -> ProvisioningArtifactParameters.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Distributor.foreach(__v => __obj.update("Distributor", __v.asInstanceOf[js.Any]))
      SupportDescription.foreach(__v => __obj.update("SupportDescription", __v.asInstanceOf[js.Any]))
      SupportEmail.foreach(__v => __obj.update("SupportEmail", __v.asInstanceOf[js.Any]))
      SupportUrl.foreach(__v => __obj.update("SupportUrl", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProductInput]
    }
  }

  @js.native
  trait CreateProductOutput extends js.Object {
    var ProductViewDetail: js.UndefOr[ProductViewDetail]
    var ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail]
    var Tags: js.UndefOr[Tags]
  }

  object CreateProductOutput {
    def apply(
        ProductViewDetail: js.UndefOr[ProductViewDetail] = js.undefined,
        ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateProductOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ProductViewDetail.foreach(__v => __obj.update("ProductViewDetail", __v.asInstanceOf[js.Any]))
      ProvisioningArtifactDetail.foreach(__v => __obj.update("ProvisioningArtifactDetail", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProductOutput]
    }
  }

  @js.native
  trait CreateProvisionedProductPlanInput extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var PlanName: ProvisionedProductPlanName
    var PlanType: ProvisionedProductPlanType
    var ProductId: Id
    var ProvisionedProductName: ProvisionedProductName
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var NotificationArns: js.UndefOr[NotificationArns]
    var PathId: js.UndefOr[Id]
    var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters]
    var Tags: js.UndefOr[Tags]
  }

  object CreateProvisionedProductPlanInput {
    def apply(
        IdempotencyToken: IdempotencyToken,
        PlanName: ProvisionedProductPlanName,
        PlanType: ProvisionedProductPlanType,
        ProductId: Id,
        ProvisionedProductName: ProvisionedProductName,
        ProvisioningArtifactId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        NotificationArns: js.UndefOr[NotificationArns] = js.undefined,
        PathId: js.UndefOr[Id] = js.undefined,
        ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateProvisionedProductPlanInput = {
      val __obj = js.Dictionary[js.Any](
        "IdempotencyToken"       -> IdempotencyToken.asInstanceOf[js.Any],
        "PlanName"               -> PlanName.asInstanceOf[js.Any],
        "PlanType"               -> PlanType.asInstanceOf[js.Any],
        "ProductId"              -> ProductId.asInstanceOf[js.Any],
        "ProvisionedProductName" -> ProvisionedProductName.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      NotificationArns.foreach(__v => __obj.update("NotificationArns", __v.asInstanceOf[js.Any]))
      PathId.foreach(__v => __obj.update("PathId", __v.asInstanceOf[js.Any]))
      ProvisioningParameters.foreach(__v => __obj.update("ProvisioningParameters", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProvisionedProductPlanInput]
    }
  }

  @js.native
  trait CreateProvisionedProductPlanOutput extends js.Object {
    var PlanId: js.UndefOr[Id]
    var PlanName: js.UndefOr[ProvisionedProductPlanName]
    var ProvisionProductId: js.UndefOr[Id]
    var ProvisionedProductName: js.UndefOr[ProvisionedProductName]
    var ProvisioningArtifactId: js.UndefOr[Id]
  }

  object CreateProvisionedProductPlanOutput {
    def apply(
        PlanId: js.UndefOr[Id] = js.undefined,
        PlanName: js.UndefOr[ProvisionedProductPlanName] = js.undefined,
        ProvisionProductId: js.UndefOr[Id] = js.undefined,
        ProvisionedProductName: js.UndefOr[ProvisionedProductName] = js.undefined,
        ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
    ): CreateProvisionedProductPlanOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      PlanId.foreach(__v => __obj.update("PlanId", __v.asInstanceOf[js.Any]))
      PlanName.foreach(__v => __obj.update("PlanName", __v.asInstanceOf[js.Any]))
      ProvisionProductId.foreach(__v => __obj.update("ProvisionProductId", __v.asInstanceOf[js.Any]))
      ProvisionedProductName.foreach(__v => __obj.update("ProvisionedProductName", __v.asInstanceOf[js.Any]))
      ProvisioningArtifactId.foreach(__v => __obj.update("ProvisioningArtifactId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProvisionedProductPlanOutput]
    }
  }

  @js.native
  trait CreateProvisioningArtifactInput extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var Parameters: ProvisioningArtifactProperties
    var ProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object CreateProvisioningArtifactInput {
    def apply(
        IdempotencyToken: IdempotencyToken,
        Parameters: ProvisioningArtifactProperties,
        ProductId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): CreateProvisioningArtifactInput = {
      val __obj = js.Dictionary[js.Any](
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "Parameters"       -> Parameters.asInstanceOf[js.Any],
        "ProductId"        -> ProductId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProvisioningArtifactInput]
    }
  }

  @js.native
  trait CreateProvisioningArtifactOutput extends js.Object {
    var Info: js.UndefOr[ProvisioningArtifactInfo]
    var ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail]
    var Status: js.UndefOr[Status]
  }

  object CreateProvisioningArtifactOutput {
    def apply(
        Info: js.UndefOr[ProvisioningArtifactInfo] = js.undefined,
        ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): CreateProvisioningArtifactOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Info.foreach(__v => __obj.update("Info", __v.asInstanceOf[js.Any]))
      ProvisioningArtifactDetail.foreach(__v => __obj.update("ProvisioningArtifactDetail", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProvisioningArtifactOutput]
    }
  }

  @js.native
  trait CreateServiceActionInput extends js.Object {
    var Definition: ServiceActionDefinitionMap
    var DefinitionType: ServiceActionDefinitionType
    var IdempotencyToken: IdempotencyToken
    var Name: ServiceActionName
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Description: js.UndefOr[ServiceActionDescription]
  }

  object CreateServiceActionInput {
    def apply(
        Definition: ServiceActionDefinitionMap,
        DefinitionType: ServiceActionDefinitionType,
        IdempotencyToken: IdempotencyToken,
        Name: ServiceActionName,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Description: js.UndefOr[ServiceActionDescription] = js.undefined
    ): CreateServiceActionInput = {
      val __obj = js.Dictionary[js.Any](
        "Definition"       -> Definition.asInstanceOf[js.Any],
        "DefinitionType"   -> DefinitionType.asInstanceOf[js.Any],
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "Name"             -> Name.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServiceActionInput]
    }
  }

  @js.native
  trait CreateServiceActionOutput extends js.Object {
    var ServiceActionDetail: js.UndefOr[ServiceActionDetail]
  }

  object CreateServiceActionOutput {
    def apply(
        ServiceActionDetail: js.UndefOr[ServiceActionDetail] = js.undefined
    ): CreateServiceActionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ServiceActionDetail.foreach(__v => __obj.update("ServiceActionDetail", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServiceActionOutput]
    }
  }

  @js.native
  trait CreateTagOptionInput extends js.Object {
    var Key: TagOptionKey
    var Value: TagOptionValue
  }

  object CreateTagOptionInput {
    def apply(
        Key: TagOptionKey,
        Value: TagOptionValue
    ): CreateTagOptionInput = {
      val __obj = js.Dictionary[js.Any](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateTagOptionInput]
    }
  }

  @js.native
  trait CreateTagOptionOutput extends js.Object {
    var TagOptionDetail: js.UndefOr[TagOptionDetail]
  }

  object CreateTagOptionOutput {
    def apply(
        TagOptionDetail: js.UndefOr[TagOptionDetail] = js.undefined
    ): CreateTagOptionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      TagOptionDetail.foreach(__v => __obj.update("TagOptionDetail", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTagOptionOutput]
    }
  }

  @js.native
  trait DeleteConstraintInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DeleteConstraintInput {
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DeleteConstraintInput = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteConstraintInput]
    }
  }

  @js.native
  trait DeleteConstraintOutput extends js.Object {}

  object DeleteConstraintOutput {
    def apply(
        ): DeleteConstraintOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteConstraintOutput]
    }
  }

  @js.native
  trait DeletePortfolioInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DeletePortfolioInput {
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DeletePortfolioInput = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePortfolioInput]
    }
  }

  @js.native
  trait DeletePortfolioOutput extends js.Object {}

  object DeletePortfolioOutput {
    def apply(
        ): DeletePortfolioOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeletePortfolioOutput]
    }
  }

  @js.native
  trait DeletePortfolioShareInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AccountId: js.UndefOr[AccountId]
    var OrganizationNode: js.UndefOr[OrganizationNode]
  }

  object DeletePortfolioShareInput {
    def apply(
        PortfolioId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        AccountId: js.UndefOr[AccountId] = js.undefined,
        OrganizationNode: js.UndefOr[OrganizationNode] = js.undefined
    ): DeletePortfolioShareInput = {
      val __obj = js.Dictionary[js.Any](
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      AccountId.foreach(__v => __obj.update("AccountId", __v.asInstanceOf[js.Any]))
      OrganizationNode.foreach(__v => __obj.update("OrganizationNode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePortfolioShareInput]
    }
  }

  @js.native
  trait DeletePortfolioShareOutput extends js.Object {
    var PortfolioShareToken: js.UndefOr[PortfolioShareToken]
  }

  object DeletePortfolioShareOutput {
    def apply(
        PortfolioShareToken: js.UndefOr[PortfolioShareToken] = js.undefined
    ): DeletePortfolioShareOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      PortfolioShareToken.foreach(__v => __obj.update("PortfolioShareToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePortfolioShareOutput]
    }
  }

  @js.native
  trait DeleteProductInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DeleteProductInput {
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DeleteProductInput = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteProductInput]
    }
  }

  @js.native
  trait DeleteProductOutput extends js.Object {}

  object DeleteProductOutput {
    def apply(
        ): DeleteProductOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteProductOutput]
    }
  }

  @js.native
  trait DeleteProvisionedProductPlanInput extends js.Object {
    var PlanId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var IgnoreErrors: js.UndefOr[IgnoreErrors]
  }

  object DeleteProvisionedProductPlanInput {
    def apply(
        PlanId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        IgnoreErrors: js.UndefOr[IgnoreErrors] = js.undefined
    ): DeleteProvisionedProductPlanInput = {
      val __obj = js.Dictionary[js.Any](
        "PlanId" -> PlanId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      IgnoreErrors.foreach(__v => __obj.update("IgnoreErrors", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteProvisionedProductPlanInput]
    }
  }

  @js.native
  trait DeleteProvisionedProductPlanOutput extends js.Object {}

  object DeleteProvisionedProductPlanOutput {
    def apply(
        ): DeleteProvisionedProductPlanOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteProvisionedProductPlanOutput]
    }
  }

  @js.native
  trait DeleteProvisioningArtifactInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DeleteProvisioningArtifactInput {
    def apply(
        ProductId: Id,
        ProvisioningArtifactId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DeleteProvisioningArtifactInput = {
      val __obj = js.Dictionary[js.Any](
        "ProductId"              -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteProvisioningArtifactInput]
    }
  }

  @js.native
  trait DeleteProvisioningArtifactOutput extends js.Object {}

  object DeleteProvisioningArtifactOutput {
    def apply(
        ): DeleteProvisioningArtifactOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteProvisioningArtifactOutput]
    }
  }

  @js.native
  trait DeleteServiceActionInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DeleteServiceActionInput {
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DeleteServiceActionInput = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteServiceActionInput]
    }
  }

  @js.native
  trait DeleteServiceActionOutput extends js.Object {}

  object DeleteServiceActionOutput {
    def apply(
        ): DeleteServiceActionOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteServiceActionOutput]
    }
  }

  @js.native
  trait DeleteTagOptionInput extends js.Object {
    var Id: TagOptionId
  }

  object DeleteTagOptionInput {
    def apply(
        Id: TagOptionId
    ): DeleteTagOptionInput = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTagOptionInput]
    }
  }

  @js.native
  trait DeleteTagOptionOutput extends js.Object {}

  object DeleteTagOptionOutput {
    def apply(
        ): DeleteTagOptionOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteTagOptionOutput]
    }
  }

  @js.native
  trait DescribeConstraintInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribeConstraintInput {
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DescribeConstraintInput = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConstraintInput]
    }
  }

  @js.native
  trait DescribeConstraintOutput extends js.Object {
    var ConstraintDetail: js.UndefOr[ConstraintDetail]
    var ConstraintParameters: js.UndefOr[ConstraintParameters]
    var Status: js.UndefOr[Status]
  }

  object DescribeConstraintOutput {
    def apply(
        ConstraintDetail: js.UndefOr[ConstraintDetail] = js.undefined,
        ConstraintParameters: js.UndefOr[ConstraintParameters] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): DescribeConstraintOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ConstraintDetail.foreach(__v => __obj.update("ConstraintDetail", __v.asInstanceOf[js.Any]))
      ConstraintParameters.foreach(__v => __obj.update("ConstraintParameters", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConstraintOutput]
    }
  }

  @js.native
  trait DescribeCopyProductStatusInput extends js.Object {
    var CopyProductToken: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribeCopyProductStatusInput {
    def apply(
        CopyProductToken: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DescribeCopyProductStatusInput = {
      val __obj = js.Dictionary[js.Any](
        "CopyProductToken" -> CopyProductToken.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCopyProductStatusInput]
    }
  }

  @js.native
  trait DescribeCopyProductStatusOutput extends js.Object {
    var CopyProductStatus: js.UndefOr[CopyProductStatus]
    var StatusDetail: js.UndefOr[StatusDetail]
    var TargetProductId: js.UndefOr[Id]
  }

  object DescribeCopyProductStatusOutput {
    def apply(
        CopyProductStatus: js.UndefOr[CopyProductStatus] = js.undefined,
        StatusDetail: js.UndefOr[StatusDetail] = js.undefined,
        TargetProductId: js.UndefOr[Id] = js.undefined
    ): DescribeCopyProductStatusOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      CopyProductStatus.foreach(__v => __obj.update("CopyProductStatus", __v.asInstanceOf[js.Any]))
      StatusDetail.foreach(__v => __obj.update("StatusDetail", __v.asInstanceOf[js.Any]))
      TargetProductId.foreach(__v => __obj.update("TargetProductId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCopyProductStatusOutput]
    }
  }

  @js.native
  trait DescribePortfolioInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribePortfolioInput {
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DescribePortfolioInput = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePortfolioInput]
    }
  }

  @js.native
  trait DescribePortfolioOutput extends js.Object {
    var PortfolioDetail: js.UndefOr[PortfolioDetail]
    var TagOptions: js.UndefOr[TagOptionDetails]
    var Tags: js.UndefOr[Tags]
  }

  object DescribePortfolioOutput {
    def apply(
        PortfolioDetail: js.UndefOr[PortfolioDetail] = js.undefined,
        TagOptions: js.UndefOr[TagOptionDetails] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DescribePortfolioOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      PortfolioDetail.foreach(__v => __obj.update("PortfolioDetail", __v.asInstanceOf[js.Any]))
      TagOptions.foreach(__v => __obj.update("TagOptions", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePortfolioOutput]
    }
  }

  @js.native
  trait DescribePortfolioShareStatusInput extends js.Object {
    var PortfolioShareToken: PortfolioShareToken
  }

  object DescribePortfolioShareStatusInput {
    def apply(
        PortfolioShareToken: PortfolioShareToken
    ): DescribePortfolioShareStatusInput = {
      val __obj = js.Dictionary[js.Any](
        "PortfolioShareToken" -> PortfolioShareToken.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribePortfolioShareStatusInput]
    }
  }

  @js.native
  trait DescribePortfolioShareStatusOutput extends js.Object {
    var OrganizationNodeValue: js.UndefOr[OrganizationNodeValue]
    var PortfolioId: js.UndefOr[Id]
    var PortfolioShareToken: js.UndefOr[PortfolioShareToken]
    var ShareDetails: js.UndefOr[ShareDetails]
    var Status: js.UndefOr[ShareStatus]
  }

  object DescribePortfolioShareStatusOutput {
    def apply(
        OrganizationNodeValue: js.UndefOr[OrganizationNodeValue] = js.undefined,
        PortfolioId: js.UndefOr[Id] = js.undefined,
        PortfolioShareToken: js.UndefOr[PortfolioShareToken] = js.undefined,
        ShareDetails: js.UndefOr[ShareDetails] = js.undefined,
        Status: js.UndefOr[ShareStatus] = js.undefined
    ): DescribePortfolioShareStatusOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      OrganizationNodeValue.foreach(__v => __obj.update("OrganizationNodeValue", __v.asInstanceOf[js.Any]))
      PortfolioId.foreach(__v => __obj.update("PortfolioId", __v.asInstanceOf[js.Any]))
      PortfolioShareToken.foreach(__v => __obj.update("PortfolioShareToken", __v.asInstanceOf[js.Any]))
      ShareDetails.foreach(__v => __obj.update("ShareDetails", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePortfolioShareStatusOutput]
    }
  }

  @js.native
  trait DescribeProductAsAdminInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribeProductAsAdminInput {
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DescribeProductAsAdminInput = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProductAsAdminInput]
    }
  }

  @js.native
  trait DescribeProductAsAdminOutput extends js.Object {
    var ProductViewDetail: js.UndefOr[ProductViewDetail]
    var ProvisioningArtifactSummaries: js.UndefOr[ProvisioningArtifactSummaries]
    var TagOptions: js.UndefOr[TagOptionDetails]
    var Tags: js.UndefOr[Tags]
  }

  object DescribeProductAsAdminOutput {
    def apply(
        ProductViewDetail: js.UndefOr[ProductViewDetail] = js.undefined,
        ProvisioningArtifactSummaries: js.UndefOr[ProvisioningArtifactSummaries] = js.undefined,
        TagOptions: js.UndefOr[TagOptionDetails] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DescribeProductAsAdminOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ProductViewDetail.foreach(__v => __obj.update("ProductViewDetail", __v.asInstanceOf[js.Any]))
      ProvisioningArtifactSummaries.foreach(
        __v => __obj.update("ProvisioningArtifactSummaries", __v.asInstanceOf[js.Any])
      )
      TagOptions.foreach(__v => __obj.update("TagOptions", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProductAsAdminOutput]
    }
  }

  @js.native
  trait DescribeProductInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribeProductInput {
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DescribeProductInput = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProductInput]
    }
  }

  @js.native
  trait DescribeProductOutput extends js.Object {
    var ProductViewSummary: js.UndefOr[ProductViewSummary]
    var ProvisioningArtifacts: js.UndefOr[ProvisioningArtifacts]
  }

  object DescribeProductOutput {
    def apply(
        ProductViewSummary: js.UndefOr[ProductViewSummary] = js.undefined,
        ProvisioningArtifacts: js.UndefOr[ProvisioningArtifacts] = js.undefined
    ): DescribeProductOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ProductViewSummary.foreach(__v => __obj.update("ProductViewSummary", __v.asInstanceOf[js.Any]))
      ProvisioningArtifacts.foreach(__v => __obj.update("ProvisioningArtifacts", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProductOutput]
    }
  }

  @js.native
  trait DescribeProductViewInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribeProductViewInput {
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DescribeProductViewInput = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProductViewInput]
    }
  }

  @js.native
  trait DescribeProductViewOutput extends js.Object {
    var ProductViewSummary: js.UndefOr[ProductViewSummary]
    var ProvisioningArtifacts: js.UndefOr[ProvisioningArtifacts]
  }

  object DescribeProductViewOutput {
    def apply(
        ProductViewSummary: js.UndefOr[ProductViewSummary] = js.undefined,
        ProvisioningArtifacts: js.UndefOr[ProvisioningArtifacts] = js.undefined
    ): DescribeProductViewOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ProductViewSummary.foreach(__v => __obj.update("ProductViewSummary", __v.asInstanceOf[js.Any]))
      ProvisioningArtifacts.foreach(__v => __obj.update("ProvisioningArtifacts", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProductViewOutput]
    }
  }

  @js.native
  trait DescribeProvisionedProductInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribeProvisionedProductInput {
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DescribeProvisionedProductInput = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProvisionedProductInput]
    }
  }

  @js.native
  trait DescribeProvisionedProductOutput extends js.Object {
    var CloudWatchDashboards: js.UndefOr[CloudWatchDashboards]
    var ProvisionedProductDetail: js.UndefOr[ProvisionedProductDetail]
  }

  object DescribeProvisionedProductOutput {
    def apply(
        CloudWatchDashboards: js.UndefOr[CloudWatchDashboards] = js.undefined,
        ProvisionedProductDetail: js.UndefOr[ProvisionedProductDetail] = js.undefined
    ): DescribeProvisionedProductOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      CloudWatchDashboards.foreach(__v => __obj.update("CloudWatchDashboards", __v.asInstanceOf[js.Any]))
      ProvisionedProductDetail.foreach(__v => __obj.update("ProvisionedProductDetail", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProvisionedProductOutput]
    }
  }

  @js.native
  trait DescribeProvisionedProductPlanInput extends js.Object {
    var PlanId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object DescribeProvisionedProductPlanInput {
    def apply(
        PlanId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): DescribeProvisionedProductPlanInput = {
      val __obj = js.Dictionary[js.Any](
        "PlanId" -> PlanId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProvisionedProductPlanInput]
    }
  }

  @js.native
  trait DescribeProvisionedProductPlanOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisionedProductPlanDetails: js.UndefOr[ProvisionedProductPlanDetails]
    var ResourceChanges: js.UndefOr[ResourceChanges]
  }

  object DescribeProvisionedProductPlanOutput {
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        ProvisionedProductPlanDetails: js.UndefOr[ProvisionedProductPlanDetails] = js.undefined,
        ResourceChanges: js.UndefOr[ResourceChanges] = js.undefined
    ): DescribeProvisionedProductPlanOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextPageToken.foreach(__v => __obj.update("NextPageToken", __v.asInstanceOf[js.Any]))
      ProvisionedProductPlanDetails.foreach(
        __v => __obj.update("ProvisionedProductPlanDetails", __v.asInstanceOf[js.Any])
      )
      ResourceChanges.foreach(__v => __obj.update("ResourceChanges", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProvisionedProductPlanOutput]
    }
  }

  @js.native
  trait DescribeProvisioningArtifactInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Verbose: js.UndefOr[Verbose]
  }

  object DescribeProvisioningArtifactInput {
    def apply(
        ProductId: Id,
        ProvisioningArtifactId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Verbose: js.UndefOr[Verbose] = js.undefined
    ): DescribeProvisioningArtifactInput = {
      val __obj = js.Dictionary[js.Any](
        "ProductId"              -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      Verbose.foreach(__v => __obj.update("Verbose", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProvisioningArtifactInput]
    }
  }

  @js.native
  trait DescribeProvisioningArtifactOutput extends js.Object {
    var Info: js.UndefOr[ProvisioningArtifactInfo]
    var ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail]
    var Status: js.UndefOr[Status]
  }

  object DescribeProvisioningArtifactOutput {
    def apply(
        Info: js.UndefOr[ProvisioningArtifactInfo] = js.undefined,
        ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): DescribeProvisioningArtifactOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Info.foreach(__v => __obj.update("Info", __v.asInstanceOf[js.Any]))
      ProvisioningArtifactDetail.foreach(__v => __obj.update("ProvisioningArtifactDetail", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProvisioningArtifactOutput]
    }
  }

  @js.native
  trait DescribeProvisioningParametersInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PathId: js.UndefOr[Id]
  }

  object DescribeProvisioningParametersInput {
    def apply(
        ProductId: Id,
        ProvisioningArtifactId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PathId: js.UndefOr[Id] = js.undefined
    ): DescribeProvisioningParametersInput = {
      val __obj = js.Dictionary[js.Any](
        "ProductId"              -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      PathId.foreach(__v => __obj.update("PathId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProvisioningParametersInput]
    }
  }

  @js.native
  trait DescribeProvisioningParametersOutput extends js.Object {
    var ConstraintSummaries: js.UndefOr[ConstraintSummaries]
    var ProvisioningArtifactParameters: js.UndefOr[ProvisioningArtifactParameters]
    var ProvisioningArtifactPreferences: js.UndefOr[ProvisioningArtifactPreferences]
    var TagOptions: js.UndefOr[TagOptionSummaries]
    var UsageInstructions: js.UndefOr[UsageInstructions]
  }

  object DescribeProvisioningParametersOutput {
    def apply(
        ConstraintSummaries: js.UndefOr[ConstraintSummaries] = js.undefined,
        ProvisioningArtifactParameters: js.UndefOr[ProvisioningArtifactParameters] = js.undefined,
        ProvisioningArtifactPreferences: js.UndefOr[ProvisioningArtifactPreferences] = js.undefined,
        TagOptions: js.UndefOr[TagOptionSummaries] = js.undefined,
        UsageInstructions: js.UndefOr[UsageInstructions] = js.undefined
    ): DescribeProvisioningParametersOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ConstraintSummaries.foreach(__v => __obj.update("ConstraintSummaries", __v.asInstanceOf[js.Any]))
      ProvisioningArtifactParameters.foreach(
        __v => __obj.update("ProvisioningArtifactParameters", __v.asInstanceOf[js.Any])
      )
      ProvisioningArtifactPreferences.foreach(
        __v => __obj.update("ProvisioningArtifactPreferences", __v.asInstanceOf[js.Any])
      )
      TagOptions.foreach(__v => __obj.update("TagOptions", __v.asInstanceOf[js.Any]))
      UsageInstructions.foreach(__v => __obj.update("UsageInstructions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProvisioningParametersOutput]
    }
  }

  @js.native
  trait DescribeRecordInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object DescribeRecordInput {
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): DescribeRecordInput = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRecordInput]
    }
  }

  @js.native
  trait DescribeRecordOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var RecordDetail: js.UndefOr[RecordDetail]
    var RecordOutputs: js.UndefOr[RecordOutputs]
  }

  object DescribeRecordOutput {
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        RecordDetail: js.UndefOr[RecordDetail] = js.undefined,
        RecordOutputs: js.UndefOr[RecordOutputs] = js.undefined
    ): DescribeRecordOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextPageToken.foreach(__v => __obj.update("NextPageToken", __v.asInstanceOf[js.Any]))
      RecordDetail.foreach(__v => __obj.update("RecordDetail", __v.asInstanceOf[js.Any]))
      RecordOutputs.foreach(__v => __obj.update("RecordOutputs", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRecordOutput]
    }
  }

  @js.native
  trait DescribeServiceActionInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribeServiceActionInput {
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DescribeServiceActionInput = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServiceActionInput]
    }
  }

  @js.native
  trait DescribeServiceActionOutput extends js.Object {
    var ServiceActionDetail: js.UndefOr[ServiceActionDetail]
  }

  object DescribeServiceActionOutput {
    def apply(
        ServiceActionDetail: js.UndefOr[ServiceActionDetail] = js.undefined
    ): DescribeServiceActionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ServiceActionDetail.foreach(__v => __obj.update("ServiceActionDetail", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServiceActionOutput]
    }
  }

  @js.native
  trait DescribeTagOptionInput extends js.Object {
    var Id: TagOptionId
  }

  object DescribeTagOptionInput {
    def apply(
        Id: TagOptionId
    ): DescribeTagOptionInput = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeTagOptionInput]
    }
  }

  @js.native
  trait DescribeTagOptionOutput extends js.Object {
    var TagOptionDetail: js.UndefOr[TagOptionDetail]
  }

  object DescribeTagOptionOutput {
    def apply(
        TagOptionDetail: js.UndefOr[TagOptionDetail] = js.undefined
    ): DescribeTagOptionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      TagOptionDetail.foreach(__v => __obj.update("TagOptionDetail", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTagOptionOutput]
    }
  }

  @js.native
  trait DisableAWSOrganizationsAccessInput extends js.Object {}

  object DisableAWSOrganizationsAccessInput {
    def apply(
        ): DisableAWSOrganizationsAccessInput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DisableAWSOrganizationsAccessInput]
    }
  }

  @js.native
  trait DisableAWSOrganizationsAccessOutput extends js.Object {}

  object DisableAWSOrganizationsAccessOutput {
    def apply(
        ): DisableAWSOrganizationsAccessOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DisableAWSOrganizationsAccessOutput]
    }
  }

  @js.native
  trait DisassociatePrincipalFromPortfolioInput extends js.Object {
    var PortfolioId: Id
    var PrincipalARN: PrincipalARN
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DisassociatePrincipalFromPortfolioInput {
    def apply(
        PortfolioId: Id,
        PrincipalARN: PrincipalARN,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DisassociatePrincipalFromPortfolioInput = {
      val __obj = js.Dictionary[js.Any](
        "PortfolioId"  -> PortfolioId.asInstanceOf[js.Any],
        "PrincipalARN" -> PrincipalARN.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociatePrincipalFromPortfolioInput]
    }
  }

  @js.native
  trait DisassociatePrincipalFromPortfolioOutput extends js.Object {}

  object DisassociatePrincipalFromPortfolioOutput {
    def apply(
        ): DisassociatePrincipalFromPortfolioOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DisassociatePrincipalFromPortfolioOutput]
    }
  }

  @js.native
  trait DisassociateProductFromPortfolioInput extends js.Object {
    var PortfolioId: Id
    var ProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DisassociateProductFromPortfolioInput {
    def apply(
        PortfolioId: Id,
        ProductId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DisassociateProductFromPortfolioInput = {
      val __obj = js.Dictionary[js.Any](
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any],
        "ProductId"   -> ProductId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateProductFromPortfolioInput]
    }
  }

  @js.native
  trait DisassociateProductFromPortfolioOutput extends js.Object {}

  object DisassociateProductFromPortfolioOutput {
    def apply(
        ): DisassociateProductFromPortfolioOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DisassociateProductFromPortfolioOutput]
    }
  }

  @js.native
  trait DisassociateServiceActionFromProvisioningArtifactInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var ServiceActionId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DisassociateServiceActionFromProvisioningArtifactInput {
    def apply(
        ProductId: Id,
        ProvisioningArtifactId: Id,
        ServiceActionId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DisassociateServiceActionFromProvisioningArtifactInput = {
      val __obj = js.Dictionary[js.Any](
        "ProductId"              -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any],
        "ServiceActionId"        -> ServiceActionId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateServiceActionFromProvisioningArtifactInput]
    }
  }

  @js.native
  trait DisassociateServiceActionFromProvisioningArtifactOutput extends js.Object {}

  object DisassociateServiceActionFromProvisioningArtifactOutput {
    def apply(
        ): DisassociateServiceActionFromProvisioningArtifactOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DisassociateServiceActionFromProvisioningArtifactOutput]
    }
  }

  @js.native
  trait DisassociateTagOptionFromResourceInput extends js.Object {
    var ResourceId: ResourceId
    var TagOptionId: TagOptionId
  }

  object DisassociateTagOptionFromResourceInput {
    def apply(
        ResourceId: ResourceId,
        TagOptionId: TagOptionId
    ): DisassociateTagOptionFromResourceInput = {
      val __obj = js.Dictionary[js.Any](
        "ResourceId"  -> ResourceId.asInstanceOf[js.Any],
        "TagOptionId" -> TagOptionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateTagOptionFromResourceInput]
    }
  }

  @js.native
  trait DisassociateTagOptionFromResourceOutput extends js.Object {}

  object DisassociateTagOptionFromResourceOutput {
    def apply(
        ): DisassociateTagOptionFromResourceOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DisassociateTagOptionFromResourceOutput]
    }
  }

  @js.native
  trait EnableAWSOrganizationsAccessInput extends js.Object {}

  object EnableAWSOrganizationsAccessInput {
    def apply(
        ): EnableAWSOrganizationsAccessInput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[EnableAWSOrganizationsAccessInput]
    }
  }

  @js.native
  trait EnableAWSOrganizationsAccessOutput extends js.Object {}

  object EnableAWSOrganizationsAccessOutput {
    def apply(
        ): EnableAWSOrganizationsAccessOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[EnableAWSOrganizationsAccessOutput]
    }
  }

  object EvaluationTypeEnum {
    val STATIC  = "STATIC"
    val DYNAMIC = "DYNAMIC"

    val values = IndexedSeq(STATIC, DYNAMIC)
  }

  @js.native
  trait ExecuteProvisionedProductPlanInput extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var PlanId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object ExecuteProvisionedProductPlanInput {
    def apply(
        IdempotencyToken: IdempotencyToken,
        PlanId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): ExecuteProvisionedProductPlanInput = {
      val __obj = js.Dictionary[js.Any](
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "PlanId"           -> PlanId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteProvisionedProductPlanInput]
    }
  }

  @js.native
  trait ExecuteProvisionedProductPlanOutput extends js.Object {
    var RecordDetail: js.UndefOr[RecordDetail]
  }

  object ExecuteProvisionedProductPlanOutput {
    def apply(
        RecordDetail: js.UndefOr[RecordDetail] = js.undefined
    ): ExecuteProvisionedProductPlanOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      RecordDetail.foreach(__v => __obj.update("RecordDetail", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteProvisionedProductPlanOutput]
    }
  }

  @js.native
  trait ExecuteProvisionedProductServiceActionInput extends js.Object {
    var ExecuteToken: IdempotencyToken
    var ProvisionedProductId: Id
    var ServiceActionId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object ExecuteProvisionedProductServiceActionInput {
    def apply(
        ExecuteToken: IdempotencyToken,
        ProvisionedProductId: Id,
        ServiceActionId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): ExecuteProvisionedProductServiceActionInput = {
      val __obj = js.Dictionary[js.Any](
        "ExecuteToken"         -> ExecuteToken.asInstanceOf[js.Any],
        "ProvisionedProductId" -> ProvisionedProductId.asInstanceOf[js.Any],
        "ServiceActionId"      -> ServiceActionId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteProvisionedProductServiceActionInput]
    }
  }

  @js.native
  trait ExecuteProvisionedProductServiceActionOutput extends js.Object {
    var RecordDetail: js.UndefOr[RecordDetail]
  }

  object ExecuteProvisionedProductServiceActionOutput {
    def apply(
        RecordDetail: js.UndefOr[RecordDetail] = js.undefined
    ): ExecuteProvisionedProductServiceActionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      RecordDetail.foreach(__v => __obj.update("RecordDetail", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteProvisionedProductServiceActionOutput]
    }
  }

  /**
    * An object containing information about the error, along with identifying information about the self-service action and its associations.
    */
  @js.native
  trait FailedServiceActionAssociation extends js.Object {
    var ErrorCode: js.UndefOr[ServiceActionAssociationErrorCode]
    var ErrorMessage: js.UndefOr[ServiceActionAssociationErrorMessage]
    var ProductId: js.UndefOr[Id]
    var ProvisioningArtifactId: js.UndefOr[Id]
    var ServiceActionId: js.UndefOr[Id]
  }

  object FailedServiceActionAssociation {
    def apply(
        ErrorCode: js.UndefOr[ServiceActionAssociationErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ServiceActionAssociationErrorMessage] = js.undefined,
        ProductId: js.UndefOr[Id] = js.undefined,
        ProvisioningArtifactId: js.UndefOr[Id] = js.undefined,
        ServiceActionId: js.UndefOr[Id] = js.undefined
    ): FailedServiceActionAssociation = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorCode.foreach(__v => __obj.update("ErrorCode", __v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.update("ErrorMessage", __v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.update("ProductId", __v.asInstanceOf[js.Any]))
      ProvisioningArtifactId.foreach(__v => __obj.update("ProvisioningArtifactId", __v.asInstanceOf[js.Any]))
      ServiceActionId.foreach(__v => __obj.update("ServiceActionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailedServiceActionAssociation]
    }
  }

  @js.native
  trait GetAWSOrganizationsAccessStatusInput extends js.Object {}

  object GetAWSOrganizationsAccessStatusInput {
    def apply(
        ): GetAWSOrganizationsAccessStatusInput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[GetAWSOrganizationsAccessStatusInput]
    }
  }

  @js.native
  trait GetAWSOrganizationsAccessStatusOutput extends js.Object {
    var AccessStatus: js.UndefOr[AccessStatus]
  }

  object GetAWSOrganizationsAccessStatusOutput {
    def apply(
        AccessStatus: js.UndefOr[AccessStatus] = js.undefined
    ): GetAWSOrganizationsAccessStatusOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      AccessStatus.foreach(__v => __obj.update("AccessStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAWSOrganizationsAccessStatusOutput]
    }
  }

  /**
    * Summary information about a product path for a user.
    */
  @js.native
  trait LaunchPathSummary extends js.Object {
    var ConstraintSummaries: js.UndefOr[ConstraintSummaries]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[PortfolioName]
    var Tags: js.UndefOr[Tags]
  }

  object LaunchPathSummary {
    def apply(
        ConstraintSummaries: js.UndefOr[ConstraintSummaries] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[PortfolioName] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): LaunchPathSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      ConstraintSummaries.foreach(__v => __obj.update("ConstraintSummaries", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchPathSummary]
    }
  }

  @js.native
  trait ListAcceptedPortfolioSharesInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
    var PortfolioShareType: js.UndefOr[PortfolioShareType]
  }

  object ListAcceptedPortfolioSharesInput {
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined,
        PortfolioShareType: js.UndefOr[PortfolioShareType] = js.undefined
    ): ListAcceptedPortfolioSharesInput = {
      val __obj = js.Dictionary.empty[js.Any]
      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      PortfolioShareType.foreach(__v => __obj.update("PortfolioShareType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAcceptedPortfolioSharesInput]
    }
  }

  @js.native
  trait ListAcceptedPortfolioSharesOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var PortfolioDetails: js.UndefOr[PortfolioDetails]
  }

  object ListAcceptedPortfolioSharesOutput {
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        PortfolioDetails: js.UndefOr[PortfolioDetails] = js.undefined
    ): ListAcceptedPortfolioSharesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextPageToken.foreach(__v => __obj.update("NextPageToken", __v.asInstanceOf[js.Any]))
      PortfolioDetails.foreach(__v => __obj.update("PortfolioDetails", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAcceptedPortfolioSharesOutput]
    }
  }

  @js.native
  trait ListConstraintsForPortfolioInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
    var ProductId: js.UndefOr[Id]
  }

  object ListConstraintsForPortfolioInput {
    def apply(
        PortfolioId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined,
        ProductId: js.UndefOr[Id] = js.undefined
    ): ListConstraintsForPortfolioInput = {
      val __obj = js.Dictionary[js.Any](
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.update("ProductId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConstraintsForPortfolioInput]
    }
  }

  @js.native
  trait ListConstraintsForPortfolioOutput extends js.Object {
    var ConstraintDetails: js.UndefOr[ConstraintDetails]
    var NextPageToken: js.UndefOr[PageToken]
  }

  object ListConstraintsForPortfolioOutput {
    def apply(
        ConstraintDetails: js.UndefOr[ConstraintDetails] = js.undefined,
        NextPageToken: js.UndefOr[PageToken] = js.undefined
    ): ListConstraintsForPortfolioOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ConstraintDetails.foreach(__v => __obj.update("ConstraintDetails", __v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.update("NextPageToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConstraintsForPortfolioOutput]
    }
  }

  @js.native
  trait ListLaunchPathsInput extends js.Object {
    var ProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListLaunchPathsInput {
    def apply(
        ProductId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ListLaunchPathsInput = {
      val __obj = js.Dictionary[js.Any](
        "ProductId" -> ProductId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLaunchPathsInput]
    }
  }

  @js.native
  trait ListLaunchPathsOutput extends js.Object {
    var LaunchPathSummaries: js.UndefOr[LaunchPathSummaries]
    var NextPageToken: js.UndefOr[PageToken]
  }

  object ListLaunchPathsOutput {
    def apply(
        LaunchPathSummaries: js.UndefOr[LaunchPathSummaries] = js.undefined,
        NextPageToken: js.UndefOr[PageToken] = js.undefined
    ): ListLaunchPathsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      LaunchPathSummaries.foreach(__v => __obj.update("LaunchPathSummaries", __v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.update("NextPageToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLaunchPathsOutput]
    }
  }

  @js.native
  trait ListOrganizationPortfolioAccessInput extends js.Object {
    var OrganizationNodeType: OrganizationNodeType
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListOrganizationPortfolioAccessInput {
    def apply(
        OrganizationNodeType: OrganizationNodeType,
        PortfolioId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ListOrganizationPortfolioAccessInput = {
      val __obj = js.Dictionary[js.Any](
        "OrganizationNodeType" -> OrganizationNodeType.asInstanceOf[js.Any],
        "PortfolioId"          -> PortfolioId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrganizationPortfolioAccessInput]
    }
  }

  @js.native
  trait ListOrganizationPortfolioAccessOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var OrganizationNodes: js.UndefOr[OrganizationNodes]
  }

  object ListOrganizationPortfolioAccessOutput {
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        OrganizationNodes: js.UndefOr[OrganizationNodes] = js.undefined
    ): ListOrganizationPortfolioAccessOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextPageToken.foreach(__v => __obj.update("NextPageToken", __v.asInstanceOf[js.Any]))
      OrganizationNodes.foreach(__v => __obj.update("OrganizationNodes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrganizationPortfolioAccessOutput]
    }
  }

  @js.native
  trait ListPortfolioAccessInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object ListPortfolioAccessInput {
    def apply(
        PortfolioId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): ListPortfolioAccessInput = {
      val __obj = js.Dictionary[js.Any](
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPortfolioAccessInput]
    }
  }

  @js.native
  trait ListPortfolioAccessOutput extends js.Object {
    var AccountIds: js.UndefOr[AccountIds]
    var NextPageToken: js.UndefOr[PageToken]
  }

  object ListPortfolioAccessOutput {
    def apply(
        AccountIds: js.UndefOr[AccountIds] = js.undefined,
        NextPageToken: js.UndefOr[PageToken] = js.undefined
    ): ListPortfolioAccessOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      AccountIds.foreach(__v => __obj.update("AccountIds", __v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.update("NextPageToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPortfolioAccessOutput]
    }
  }

  @js.native
  trait ListPortfoliosForProductInput extends js.Object {
    var ProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListPortfoliosForProductInput {
    def apply(
        ProductId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ListPortfoliosForProductInput = {
      val __obj = js.Dictionary[js.Any](
        "ProductId" -> ProductId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPortfoliosForProductInput]
    }
  }

  @js.native
  trait ListPortfoliosForProductOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var PortfolioDetails: js.UndefOr[PortfolioDetails]
  }

  object ListPortfoliosForProductOutput {
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        PortfolioDetails: js.UndefOr[PortfolioDetails] = js.undefined
    ): ListPortfoliosForProductOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextPageToken.foreach(__v => __obj.update("NextPageToken", __v.asInstanceOf[js.Any]))
      PortfolioDetails.foreach(__v => __obj.update("PortfolioDetails", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPortfoliosForProductOutput]
    }
  }

  @js.native
  trait ListPortfoliosInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListPortfoliosInput {
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ListPortfoliosInput = {
      val __obj = js.Dictionary.empty[js.Any]
      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPortfoliosInput]
    }
  }

  @js.native
  trait ListPortfoliosOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var PortfolioDetails: js.UndefOr[PortfolioDetails]
  }

  object ListPortfoliosOutput {
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        PortfolioDetails: js.UndefOr[PortfolioDetails] = js.undefined
    ): ListPortfoliosOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextPageToken.foreach(__v => __obj.update("NextPageToken", __v.asInstanceOf[js.Any]))
      PortfolioDetails.foreach(__v => __obj.update("PortfolioDetails", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPortfoliosOutput]
    }
  }

  @js.native
  trait ListPrincipalsForPortfolioInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListPrincipalsForPortfolioInput {
    def apply(
        PortfolioId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ListPrincipalsForPortfolioInput = {
      val __obj = js.Dictionary[js.Any](
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPrincipalsForPortfolioInput]
    }
  }

  @js.native
  trait ListPrincipalsForPortfolioOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var Principals: js.UndefOr[Principals]
  }

  object ListPrincipalsForPortfolioOutput {
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        Principals: js.UndefOr[Principals] = js.undefined
    ): ListPrincipalsForPortfolioOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextPageToken.foreach(__v => __obj.update("NextPageToken", __v.asInstanceOf[js.Any]))
      Principals.foreach(__v => __obj.update("Principals", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPrincipalsForPortfolioOutput]
    }
  }

  @js.native
  trait ListProvisionedProductPlansInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AccessLevelFilter: js.UndefOr[AccessLevelFilter]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
    var ProvisionProductId: js.UndefOr[Id]
  }

  object ListProvisionedProductPlansInput {
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        AccessLevelFilter: js.UndefOr[AccessLevelFilter] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined,
        ProvisionProductId: js.UndefOr[Id] = js.undefined
    ): ListProvisionedProductPlansInput = {
      val __obj = js.Dictionary.empty[js.Any]
      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      AccessLevelFilter.foreach(__v => __obj.update("AccessLevelFilter", __v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      ProvisionProductId.foreach(__v => __obj.update("ProvisionProductId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProvisionedProductPlansInput]
    }
  }

  @js.native
  trait ListProvisionedProductPlansOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisionedProductPlans: js.UndefOr[ProvisionedProductPlans]
  }

  object ListProvisionedProductPlansOutput {
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        ProvisionedProductPlans: js.UndefOr[ProvisionedProductPlans] = js.undefined
    ): ListProvisionedProductPlansOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextPageToken.foreach(__v => __obj.update("NextPageToken", __v.asInstanceOf[js.Any]))
      ProvisionedProductPlans.foreach(__v => __obj.update("ProvisionedProductPlans", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProvisionedProductPlansOutput]
    }
  }

  @js.native
  trait ListProvisioningArtifactsForServiceActionInput extends js.Object {
    var ServiceActionId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListProvisioningArtifactsForServiceActionInput {
    def apply(
        ServiceActionId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ListProvisioningArtifactsForServiceActionInput = {
      val __obj = js.Dictionary[js.Any](
        "ServiceActionId" -> ServiceActionId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProvisioningArtifactsForServiceActionInput]
    }
  }

  @js.native
  trait ListProvisioningArtifactsForServiceActionOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisioningArtifactViews: js.UndefOr[ProvisioningArtifactViews]
  }

  object ListProvisioningArtifactsForServiceActionOutput {
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        ProvisioningArtifactViews: js.UndefOr[ProvisioningArtifactViews] = js.undefined
    ): ListProvisioningArtifactsForServiceActionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextPageToken.foreach(__v => __obj.update("NextPageToken", __v.asInstanceOf[js.Any]))
      ProvisioningArtifactViews.foreach(__v => __obj.update("ProvisioningArtifactViews", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProvisioningArtifactsForServiceActionOutput]
    }
  }

  @js.native
  trait ListProvisioningArtifactsInput extends js.Object {
    var ProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object ListProvisioningArtifactsInput {
    def apply(
        ProductId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): ListProvisioningArtifactsInput = {
      val __obj = js.Dictionary[js.Any](
        "ProductId" -> ProductId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProvisioningArtifactsInput]
    }
  }

  @js.native
  trait ListProvisioningArtifactsOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisioningArtifactDetails: js.UndefOr[ProvisioningArtifactDetails]
  }

  object ListProvisioningArtifactsOutput {
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        ProvisioningArtifactDetails: js.UndefOr[ProvisioningArtifactDetails] = js.undefined
    ): ListProvisioningArtifactsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextPageToken.foreach(__v => __obj.update("NextPageToken", __v.asInstanceOf[js.Any]))
      ProvisioningArtifactDetails.foreach(__v => __obj.update("ProvisioningArtifactDetails", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProvisioningArtifactsOutput]
    }
  }

  @js.native
  trait ListRecordHistoryInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AccessLevelFilter: js.UndefOr[AccessLevelFilter]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
    var SearchFilter: js.UndefOr[ListRecordHistorySearchFilter]
  }

  object ListRecordHistoryInput {
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        AccessLevelFilter: js.UndefOr[AccessLevelFilter] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined,
        SearchFilter: js.UndefOr[ListRecordHistorySearchFilter] = js.undefined
    ): ListRecordHistoryInput = {
      val __obj = js.Dictionary.empty[js.Any]
      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      AccessLevelFilter.foreach(__v => __obj.update("AccessLevelFilter", __v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      SearchFilter.foreach(__v => __obj.update("SearchFilter", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecordHistoryInput]
    }
  }

  @js.native
  trait ListRecordHistoryOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var RecordDetails: js.UndefOr[RecordDetails]
  }

  object ListRecordHistoryOutput {
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        RecordDetails: js.UndefOr[RecordDetails] = js.undefined
    ): ListRecordHistoryOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextPageToken.foreach(__v => __obj.update("NextPageToken", __v.asInstanceOf[js.Any]))
      RecordDetails.foreach(__v => __obj.update("RecordDetails", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecordHistoryOutput]
    }
  }

  /**
    * The search filter to use when listing history records.
    */
  @js.native
  trait ListRecordHistorySearchFilter extends js.Object {
    var Key: js.UndefOr[SearchFilterKey]
    var Value: js.UndefOr[SearchFilterValue]
  }

  object ListRecordHistorySearchFilter {
    def apply(
        Key: js.UndefOr[SearchFilterKey] = js.undefined,
        Value: js.UndefOr[SearchFilterValue] = js.undefined
    ): ListRecordHistorySearchFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecordHistorySearchFilter]
    }
  }

  @js.native
  trait ListResourcesForTagOptionInput extends js.Object {
    var TagOptionId: TagOptionId
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object ListResourcesForTagOptionInput {
    def apply(
        TagOptionId: TagOptionId,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): ListResourcesForTagOptionInput = {
      val __obj = js.Dictionary[js.Any](
        "TagOptionId" -> TagOptionId.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesForTagOptionInput]
    }
  }

  @js.native
  trait ListResourcesForTagOptionOutput extends js.Object {
    var PageToken: js.UndefOr[PageToken]
    var ResourceDetails: js.UndefOr[ResourceDetails]
  }

  object ListResourcesForTagOptionOutput {
    def apply(
        PageToken: js.UndefOr[PageToken] = js.undefined,
        ResourceDetails: js.UndefOr[ResourceDetails] = js.undefined
    ): ListResourcesForTagOptionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      ResourceDetails.foreach(__v => __obj.update("ResourceDetails", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesForTagOptionOutput]
    }
  }

  @js.native
  trait ListServiceActionsForProvisioningArtifactInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListServiceActionsForProvisioningArtifactInput {
    def apply(
        ProductId: Id,
        ProvisioningArtifactId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ListServiceActionsForProvisioningArtifactInput = {
      val __obj = js.Dictionary[js.Any](
        "ProductId"              -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceActionsForProvisioningArtifactInput]
    }
  }

  @js.native
  trait ListServiceActionsForProvisioningArtifactOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ServiceActionSummaries: js.UndefOr[ServiceActionSummaries]
  }

  object ListServiceActionsForProvisioningArtifactOutput {
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        ServiceActionSummaries: js.UndefOr[ServiceActionSummaries] = js.undefined
    ): ListServiceActionsForProvisioningArtifactOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextPageToken.foreach(__v => __obj.update("NextPageToken", __v.asInstanceOf[js.Any]))
      ServiceActionSummaries.foreach(__v => __obj.update("ServiceActionSummaries", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceActionsForProvisioningArtifactOutput]
    }
  }

  @js.native
  trait ListServiceActionsInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListServiceActionsInput {
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ListServiceActionsInput = {
      val __obj = js.Dictionary.empty[js.Any]
      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceActionsInput]
    }
  }

  @js.native
  trait ListServiceActionsOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ServiceActionSummaries: js.UndefOr[ServiceActionSummaries]
  }

  object ListServiceActionsOutput {
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        ServiceActionSummaries: js.UndefOr[ServiceActionSummaries] = js.undefined
    ): ListServiceActionsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextPageToken.foreach(__v => __obj.update("NextPageToken", __v.asInstanceOf[js.Any]))
      ServiceActionSummaries.foreach(__v => __obj.update("ServiceActionSummaries", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceActionsOutput]
    }
  }

  /**
    * Filters to use when listing TagOptions.
    */
  @js.native
  trait ListTagOptionsFilters extends js.Object {
    var Active: js.UndefOr[TagOptionActive]
    var Key: js.UndefOr[TagOptionKey]
    var Value: js.UndefOr[TagOptionValue]
  }

  object ListTagOptionsFilters {
    def apply(
        Active: js.UndefOr[TagOptionActive] = js.undefined,
        Key: js.UndefOr[TagOptionKey] = js.undefined,
        Value: js.UndefOr[TagOptionValue] = js.undefined
    ): ListTagOptionsFilters = {
      val __obj = js.Dictionary.empty[js.Any]
      Active.foreach(__v => __obj.update("Active", __v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagOptionsFilters]
    }
  }

  @js.native
  trait ListTagOptionsInput extends js.Object {
    var Filters: js.UndefOr[ListTagOptionsFilters]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListTagOptionsInput {
    def apply(
        Filters: js.UndefOr[ListTagOptionsFilters] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ListTagOptionsInput = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagOptionsInput]
    }
  }

  @js.native
  trait ListTagOptionsOutput extends js.Object {
    var PageToken: js.UndefOr[PageToken]
    var TagOptionDetails: js.UndefOr[TagOptionDetails]
  }

  object ListTagOptionsOutput {
    def apply(
        PageToken: js.UndefOr[PageToken] = js.undefined,
        TagOptionDetails: js.UndefOr[TagOptionDetails] = js.undefined
    ): ListTagOptionsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      TagOptionDetails.foreach(__v => __obj.update("TagOptionDetails", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagOptionsOutput]
    }
  }

  /**
    * Information about the organization node.
    */
  @js.native
  trait OrganizationNode extends js.Object {
    var Type: js.UndefOr[OrganizationNodeType]
    var Value: js.UndefOr[OrganizationNodeValue]
  }

  object OrganizationNode {
    def apply(
        Type: js.UndefOr[OrganizationNodeType] = js.undefined,
        Value: js.UndefOr[OrganizationNodeValue] = js.undefined
    ): OrganizationNode = {
      val __obj = js.Dictionary.empty[js.Any]
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrganizationNode]
    }
  }

  object OrganizationNodeTypeEnum {
    val ORGANIZATION        = "ORGANIZATION"
    val ORGANIZATIONAL_UNIT = "ORGANIZATIONAL_UNIT"
    val ACCOUNT             = "ACCOUNT"

    val values = IndexedSeq(ORGANIZATION, ORGANIZATIONAL_UNIT, ACCOUNT)
  }

  /**
    * The constraints that the administrator has put on the parameter.
    */
  @js.native
  trait ParameterConstraints extends js.Object {
    var AllowedValues: js.UndefOr[AllowedValues]
  }

  object ParameterConstraints {
    def apply(
        AllowedValues: js.UndefOr[AllowedValues] = js.undefined
    ): ParameterConstraints = {
      val __obj = js.Dictionary.empty[js.Any]
      AllowedValues.foreach(__v => __obj.update("AllowedValues", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterConstraints]
    }
  }

  /**
    * Information about a portfolio.
    */
  @js.native
  trait PortfolioDetail extends js.Object {
    var ARN: js.UndefOr[ResourceARN]
    var CreatedTime: js.UndefOr[CreationTime]
    var Description: js.UndefOr[PortfolioDescription]
    var DisplayName: js.UndefOr[PortfolioDisplayName]
    var Id: js.UndefOr[Id]
    var ProviderName: js.UndefOr[ProviderName]
  }

  object PortfolioDetail {
    def apply(
        ARN: js.UndefOr[ResourceARN] = js.undefined,
        CreatedTime: js.UndefOr[CreationTime] = js.undefined,
        Description: js.UndefOr[PortfolioDescription] = js.undefined,
        DisplayName: js.UndefOr[PortfolioDisplayName] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        ProviderName: js.UndefOr[ProviderName] = js.undefined
    ): PortfolioDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      ARN.foreach(__v => __obj.update("ARN", __v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.update("CreatedTime", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.update("DisplayName", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      ProviderName.foreach(__v => __obj.update("ProviderName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortfolioDetail]
    }
  }

  object PortfolioShareTypeEnum {
    val IMPORTED           = "IMPORTED"
    val AWS_SERVICECATALOG = "AWS_SERVICECATALOG"
    val AWS_ORGANIZATIONS  = "AWS_ORGANIZATIONS"

    val values = IndexedSeq(IMPORTED, AWS_SERVICECATALOG, AWS_ORGANIZATIONS)
  }

  /**
    * Information about a principal.
    */
  @js.native
  trait Principal extends js.Object {
    var PrincipalARN: js.UndefOr[PrincipalARN]
    var PrincipalType: js.UndefOr[PrincipalType]
  }

  object Principal {
    def apply(
        PrincipalARN: js.UndefOr[PrincipalARN] = js.undefined,
        PrincipalType: js.UndefOr[PrincipalType] = js.undefined
    ): Principal = {
      val __obj = js.Dictionary.empty[js.Any]
      PrincipalARN.foreach(__v => __obj.update("PrincipalARN", __v.asInstanceOf[js.Any]))
      PrincipalType.foreach(__v => __obj.update("PrincipalType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Principal]
    }
  }

  object PrincipalTypeEnum {
    val IAM = "IAM"

    val values = IndexedSeq(IAM)
  }

  object ProductSourceEnum {
    val ACCOUNT = "ACCOUNT"

    val values = IndexedSeq(ACCOUNT)
  }

  object ProductTypeEnum {
    val CLOUD_FORMATION_TEMPLATE = "CLOUD_FORMATION_TEMPLATE"
    val MARKETPLACE              = "MARKETPLACE"

    val values = IndexedSeq(CLOUD_FORMATION_TEMPLATE, MARKETPLACE)
  }

  /**
    * A single product view aggregation value/count pair, containing metadata about each product to which the calling user has access.
    */
  @js.native
  trait ProductViewAggregationValue extends js.Object {
    var ApproximateCount: js.UndefOr[ApproximateCount]
    var Value: js.UndefOr[AttributeValue]
  }

  object ProductViewAggregationValue {
    def apply(
        ApproximateCount: js.UndefOr[ApproximateCount] = js.undefined,
        Value: js.UndefOr[AttributeValue] = js.undefined
    ): ProductViewAggregationValue = {
      val __obj = js.Dictionary.empty[js.Any]
      ApproximateCount.foreach(__v => __obj.update("ApproximateCount", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProductViewAggregationValue]
    }
  }

  /**
    * Information about a product view.
    */
  @js.native
  trait ProductViewDetail extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTime]
    var ProductARN: js.UndefOr[ResourceARN]
    var ProductViewSummary: js.UndefOr[ProductViewSummary]
    var Status: js.UndefOr[Status]
  }

  object ProductViewDetail {
    def apply(
        CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
        ProductARN: js.UndefOr[ResourceARN] = js.undefined,
        ProductViewSummary: js.UndefOr[ProductViewSummary] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): ProductViewDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      CreatedTime.foreach(__v => __obj.update("CreatedTime", __v.asInstanceOf[js.Any]))
      ProductARN.foreach(__v => __obj.update("ProductARN", __v.asInstanceOf[js.Any]))
      ProductViewSummary.foreach(__v => __obj.update("ProductViewSummary", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProductViewDetail]
    }
  }

  object ProductViewFilterByEnum {
    val FullTextSearch  = "FullTextSearch"
    val Owner           = "Owner"
    val ProductType     = "ProductType"
    val SourceProductId = "SourceProductId"

    val values = IndexedSeq(FullTextSearch, Owner, ProductType, SourceProductId)
  }

  object ProductViewSortByEnum {
    val Title        = "Title"
    val VersionCount = "VersionCount"
    val CreationDate = "CreationDate"

    val values = IndexedSeq(Title, VersionCount, CreationDate)
  }

  /**
    * Summary information about a product view.
    */
  @js.native
  trait ProductViewSummary extends js.Object {
    var Distributor: js.UndefOr[ProductViewDistributor]
    var HasDefaultPath: js.UndefOr[HasDefaultPath]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[ProductViewName]
    var Owner: js.UndefOr[ProductViewOwner]
    var ProductId: js.UndefOr[Id]
    var ShortDescription: js.UndefOr[ProductViewShortDescription]
    var SupportDescription: js.UndefOr[SupportDescription]
    var SupportEmail: js.UndefOr[SupportEmail]
    var SupportUrl: js.UndefOr[SupportUrl]
    var Type: js.UndefOr[ProductType]
  }

  object ProductViewSummary {
    def apply(
        Distributor: js.UndefOr[ProductViewDistributor] = js.undefined,
        HasDefaultPath: js.UndefOr[HasDefaultPath] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[ProductViewName] = js.undefined,
        Owner: js.UndefOr[ProductViewOwner] = js.undefined,
        ProductId: js.UndefOr[Id] = js.undefined,
        ShortDescription: js.UndefOr[ProductViewShortDescription] = js.undefined,
        SupportDescription: js.UndefOr[SupportDescription] = js.undefined,
        SupportEmail: js.UndefOr[SupportEmail] = js.undefined,
        SupportUrl: js.UndefOr[SupportUrl] = js.undefined,
        Type: js.UndefOr[ProductType] = js.undefined
    ): ProductViewSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      Distributor.foreach(__v => __obj.update("Distributor", __v.asInstanceOf[js.Any]))
      HasDefaultPath.foreach(__v => __obj.update("HasDefaultPath", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.update("Owner", __v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.update("ProductId", __v.asInstanceOf[js.Any]))
      ShortDescription.foreach(__v => __obj.update("ShortDescription", __v.asInstanceOf[js.Any]))
      SupportDescription.foreach(__v => __obj.update("SupportDescription", __v.asInstanceOf[js.Any]))
      SupportEmail.foreach(__v => __obj.update("SupportEmail", __v.asInstanceOf[js.Any]))
      SupportUrl.foreach(__v => __obj.update("SupportUrl", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProductViewSummary]
    }
  }

  @js.native
  trait ProvisionProductInput extends js.Object {
    var ProductId: Id
    var ProvisionToken: IdempotencyToken
    var ProvisionedProductName: ProvisionedProductName
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var NotificationArns: js.UndefOr[NotificationArns]
    var PathId: js.UndefOr[Id]
    var ProvisioningParameters: js.UndefOr[ProvisioningParameters]
    var ProvisioningPreferences: js.UndefOr[ProvisioningPreferences]
    var Tags: js.UndefOr[Tags]
  }

  object ProvisionProductInput {
    def apply(
        ProductId: Id,
        ProvisionToken: IdempotencyToken,
        ProvisionedProductName: ProvisionedProductName,
        ProvisioningArtifactId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        NotificationArns: js.UndefOr[NotificationArns] = js.undefined,
        PathId: js.UndefOr[Id] = js.undefined,
        ProvisioningParameters: js.UndefOr[ProvisioningParameters] = js.undefined,
        ProvisioningPreferences: js.UndefOr[ProvisioningPreferences] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): ProvisionProductInput = {
      val __obj = js.Dictionary[js.Any](
        "ProductId"              -> ProductId.asInstanceOf[js.Any],
        "ProvisionToken"         -> ProvisionToken.asInstanceOf[js.Any],
        "ProvisionedProductName" -> ProvisionedProductName.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      NotificationArns.foreach(__v => __obj.update("NotificationArns", __v.asInstanceOf[js.Any]))
      PathId.foreach(__v => __obj.update("PathId", __v.asInstanceOf[js.Any]))
      ProvisioningParameters.foreach(__v => __obj.update("ProvisioningParameters", __v.asInstanceOf[js.Any]))
      ProvisioningPreferences.foreach(__v => __obj.update("ProvisioningPreferences", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionProductInput]
    }
  }

  @js.native
  trait ProvisionProductOutput extends js.Object {
    var RecordDetail: js.UndefOr[RecordDetail]
  }

  object ProvisionProductOutput {
    def apply(
        RecordDetail: js.UndefOr[RecordDetail] = js.undefined
    ): ProvisionProductOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      RecordDetail.foreach(__v => __obj.update("RecordDetail", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionProductOutput]
    }
  }

  /**
    * Information about a provisioned product.
    */
  @js.native
  trait ProvisionedProductAttribute extends js.Object {
    var Arn: js.UndefOr[ProvisionedProductNameOrArn]
    var CreatedTime: js.UndefOr[CreatedTime]
    var Id: js.UndefOr[Id]
    var IdempotencyToken: js.UndefOr[IdempotencyToken]
    var LastRecordId: js.UndefOr[Id]
    var Name: js.UndefOr[ProvisionedProductNameOrArn]
    var PhysicalId: js.UndefOr[PhysicalId]
    var ProductId: js.UndefOr[Id]
    var ProvisioningArtifactId: js.UndefOr[Id]
    var Status: js.UndefOr[ProvisionedProductStatus]
    var StatusMessage: js.UndefOr[ProvisionedProductStatusMessage]
    var Tags: js.UndefOr[Tags]
    var Type: js.UndefOr[ProvisionedProductType]
    var UserArn: js.UndefOr[UserArn]
    var UserArnSession: js.UndefOr[UserArnSession]
  }

  object ProvisionedProductAttribute {
    def apply(
        Arn: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined,
        CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined,
        LastRecordId: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined,
        PhysicalId: js.UndefOr[PhysicalId] = js.undefined,
        ProductId: js.UndefOr[Id] = js.undefined,
        ProvisioningArtifactId: js.UndefOr[Id] = js.undefined,
        Status: js.UndefOr[ProvisionedProductStatus] = js.undefined,
        StatusMessage: js.UndefOr[ProvisionedProductStatusMessage] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Type: js.UndefOr[ProvisionedProductType] = js.undefined,
        UserArn: js.UndefOr[UserArn] = js.undefined,
        UserArnSession: js.UndefOr[UserArnSession] = js.undefined
    ): ProvisionedProductAttribute = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.update("CreatedTime", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      IdempotencyToken.foreach(__v => __obj.update("IdempotencyToken", __v.asInstanceOf[js.Any]))
      LastRecordId.foreach(__v => __obj.update("LastRecordId", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      PhysicalId.foreach(__v => __obj.update("PhysicalId", __v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.update("ProductId", __v.asInstanceOf[js.Any]))
      ProvisioningArtifactId.foreach(__v => __obj.update("ProvisioningArtifactId", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.update("StatusMessage", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      UserArn.foreach(__v => __obj.update("UserArn", __v.asInstanceOf[js.Any]))
      UserArnSession.foreach(__v => __obj.update("UserArnSession", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionedProductAttribute]
    }
  }

  /**
    * Information about a provisioned product.
    */
  @js.native
  trait ProvisionedProductDetail extends js.Object {
    var Arn: js.UndefOr[ProvisionedProductNameOrArn]
    var CreatedTime: js.UndefOr[CreatedTime]
    var Id: js.UndefOr[ProvisionedProductId]
    var IdempotencyToken: js.UndefOr[IdempotencyToken]
    var LastRecordId: js.UndefOr[LastRequestId]
    var Name: js.UndefOr[ProvisionedProductNameOrArn]
    var ProductId: js.UndefOr[Id]
    var ProvisioningArtifactId: js.UndefOr[Id]
    var Status: js.UndefOr[ProvisionedProductStatus]
    var StatusMessage: js.UndefOr[ProvisionedProductStatusMessage]
    var Type: js.UndefOr[ProvisionedProductType]
  }

  object ProvisionedProductDetail {
    def apply(
        Arn: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined,
        CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
        Id: js.UndefOr[ProvisionedProductId] = js.undefined,
        IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined,
        LastRecordId: js.UndefOr[LastRequestId] = js.undefined,
        Name: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined,
        ProductId: js.UndefOr[Id] = js.undefined,
        ProvisioningArtifactId: js.UndefOr[Id] = js.undefined,
        Status: js.UndefOr[ProvisionedProductStatus] = js.undefined,
        StatusMessage: js.UndefOr[ProvisionedProductStatusMessage] = js.undefined,
        Type: js.UndefOr[ProvisionedProductType] = js.undefined
    ): ProvisionedProductDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.update("CreatedTime", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      IdempotencyToken.foreach(__v => __obj.update("IdempotencyToken", __v.asInstanceOf[js.Any]))
      LastRecordId.foreach(__v => __obj.update("LastRecordId", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.update("ProductId", __v.asInstanceOf[js.Any]))
      ProvisioningArtifactId.foreach(__v => __obj.update("ProvisioningArtifactId", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.update("StatusMessage", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionedProductDetail]
    }
  }

  /**
    * Information about a plan.
    */
  @js.native
  trait ProvisionedProductPlanDetails extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTime]
    var NotificationArns: js.UndefOr[NotificationArns]
    var PathId: js.UndefOr[Id]
    var PlanId: js.UndefOr[Id]
    var PlanName: js.UndefOr[ProvisionedProductPlanName]
    var PlanType: js.UndefOr[ProvisionedProductPlanType]
    var ProductId: js.UndefOr[Id]
    var ProvisionProductId: js.UndefOr[Id]
    var ProvisionProductName: js.UndefOr[ProvisionedProductName]
    var ProvisioningArtifactId: js.UndefOr[Id]
    var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters]
    var Status: js.UndefOr[ProvisionedProductPlanStatus]
    var StatusMessage: js.UndefOr[StatusMessage]
    var Tags: js.UndefOr[Tags]
    var UpdatedTime: js.UndefOr[UpdatedTime]
  }

  object ProvisionedProductPlanDetails {
    def apply(
        CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
        NotificationArns: js.UndefOr[NotificationArns] = js.undefined,
        PathId: js.UndefOr[Id] = js.undefined,
        PlanId: js.UndefOr[Id] = js.undefined,
        PlanName: js.UndefOr[ProvisionedProductPlanName] = js.undefined,
        PlanType: js.UndefOr[ProvisionedProductPlanType] = js.undefined,
        ProductId: js.UndefOr[Id] = js.undefined,
        ProvisionProductId: js.UndefOr[Id] = js.undefined,
        ProvisionProductName: js.UndefOr[ProvisionedProductName] = js.undefined,
        ProvisioningArtifactId: js.UndefOr[Id] = js.undefined,
        ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.undefined,
        Status: js.UndefOr[ProvisionedProductPlanStatus] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        UpdatedTime: js.UndefOr[UpdatedTime] = js.undefined
    ): ProvisionedProductPlanDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      CreatedTime.foreach(__v => __obj.update("CreatedTime", __v.asInstanceOf[js.Any]))
      NotificationArns.foreach(__v => __obj.update("NotificationArns", __v.asInstanceOf[js.Any]))
      PathId.foreach(__v => __obj.update("PathId", __v.asInstanceOf[js.Any]))
      PlanId.foreach(__v => __obj.update("PlanId", __v.asInstanceOf[js.Any]))
      PlanName.foreach(__v => __obj.update("PlanName", __v.asInstanceOf[js.Any]))
      PlanType.foreach(__v => __obj.update("PlanType", __v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.update("ProductId", __v.asInstanceOf[js.Any]))
      ProvisionProductId.foreach(__v => __obj.update("ProvisionProductId", __v.asInstanceOf[js.Any]))
      ProvisionProductName.foreach(__v => __obj.update("ProvisionProductName", __v.asInstanceOf[js.Any]))
      ProvisioningArtifactId.foreach(__v => __obj.update("ProvisioningArtifactId", __v.asInstanceOf[js.Any]))
      ProvisioningParameters.foreach(__v => __obj.update("ProvisioningParameters", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.update("StatusMessage", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      UpdatedTime.foreach(__v => __obj.update("UpdatedTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionedProductPlanDetails]
    }
  }

  object ProvisionedProductPlanStatusEnum {
    val CREATE_IN_PROGRESS  = "CREATE_IN_PROGRESS"
    val CREATE_SUCCESS      = "CREATE_SUCCESS"
    val CREATE_FAILED       = "CREATE_FAILED"
    val EXECUTE_IN_PROGRESS = "EXECUTE_IN_PROGRESS"
    val EXECUTE_SUCCESS     = "EXECUTE_SUCCESS"
    val EXECUTE_FAILED      = "EXECUTE_FAILED"

    val values = IndexedSeq(
      CREATE_IN_PROGRESS,
      CREATE_SUCCESS,
      CREATE_FAILED,
      EXECUTE_IN_PROGRESS,
      EXECUTE_SUCCESS,
      EXECUTE_FAILED
    )
  }

  /**
    * Summary information about a plan.
    */
  @js.native
  trait ProvisionedProductPlanSummary extends js.Object {
    var PlanId: js.UndefOr[Id]
    var PlanName: js.UndefOr[ProvisionedProductPlanName]
    var PlanType: js.UndefOr[ProvisionedProductPlanType]
    var ProvisionProductId: js.UndefOr[Id]
    var ProvisionProductName: js.UndefOr[ProvisionedProductName]
    var ProvisioningArtifactId: js.UndefOr[Id]
  }

  object ProvisionedProductPlanSummary {
    def apply(
        PlanId: js.UndefOr[Id] = js.undefined,
        PlanName: js.UndefOr[ProvisionedProductPlanName] = js.undefined,
        PlanType: js.UndefOr[ProvisionedProductPlanType] = js.undefined,
        ProvisionProductId: js.UndefOr[Id] = js.undefined,
        ProvisionProductName: js.UndefOr[ProvisionedProductName] = js.undefined,
        ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
    ): ProvisionedProductPlanSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      PlanId.foreach(__v => __obj.update("PlanId", __v.asInstanceOf[js.Any]))
      PlanName.foreach(__v => __obj.update("PlanName", __v.asInstanceOf[js.Any]))
      PlanType.foreach(__v => __obj.update("PlanType", __v.asInstanceOf[js.Any]))
      ProvisionProductId.foreach(__v => __obj.update("ProvisionProductId", __v.asInstanceOf[js.Any]))
      ProvisionProductName.foreach(__v => __obj.update("ProvisionProductName", __v.asInstanceOf[js.Any]))
      ProvisioningArtifactId.foreach(__v => __obj.update("ProvisioningArtifactId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionedProductPlanSummary]
    }
  }

  object ProvisionedProductPlanTypeEnum {
    val CLOUDFORMATION = "CLOUDFORMATION"

    val values = IndexedSeq(CLOUDFORMATION)
  }

  object ProvisionedProductStatusEnum {
    val AVAILABLE        = "AVAILABLE"
    val UNDER_CHANGE     = "UNDER_CHANGE"
    val TAINTED          = "TAINTED"
    val ERROR            = "ERROR"
    val PLAN_IN_PROGRESS = "PLAN_IN_PROGRESS"

    val values = IndexedSeq(AVAILABLE, UNDER_CHANGE, TAINTED, ERROR, PLAN_IN_PROGRESS)
  }

  object ProvisionedProductViewFilterByEnum {
    val SearchQuery = "SearchQuery"

    val values = IndexedSeq(SearchQuery)
  }

  /**
    * Information about a provisioning artifact. A provisioning artifact is also known as a product version.
    */
  @js.native
  trait ProvisioningArtifact extends js.Object {
    var CreatedTime: js.UndefOr[ProvisioningArtifactCreatedTime]
    var Description: js.UndefOr[ProvisioningArtifactDescription]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[ProvisioningArtifactName]
  }

  object ProvisioningArtifact {
    def apply(
        CreatedTime: js.UndefOr[ProvisioningArtifactCreatedTime] = js.undefined,
        Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[ProvisioningArtifactName] = js.undefined
    ): ProvisioningArtifact = {
      val __obj = js.Dictionary.empty[js.Any]
      CreatedTime.foreach(__v => __obj.update("CreatedTime", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningArtifact]
    }
  }

  /**
    * Information about a provisioning artifact (also known as a version) for a product.
    */
  @js.native
  trait ProvisioningArtifactDetail extends js.Object {
    var Active: js.UndefOr[ProvisioningArtifactActive]
    var CreatedTime: js.UndefOr[CreationTime]
    var Description: js.UndefOr[ProvisioningArtifactName]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[ProvisioningArtifactName]
    var Type: js.UndefOr[ProvisioningArtifactType]
  }

  object ProvisioningArtifactDetail {
    def apply(
        Active: js.UndefOr[ProvisioningArtifactActive] = js.undefined,
        CreatedTime: js.UndefOr[CreationTime] = js.undefined,
        Description: js.UndefOr[ProvisioningArtifactName] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[ProvisioningArtifactName] = js.undefined,
        Type: js.UndefOr[ProvisioningArtifactType] = js.undefined
    ): ProvisioningArtifactDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      Active.foreach(__v => __obj.update("Active", __v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.update("CreatedTime", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningArtifactDetail]
    }
  }

  /**
    * Information about a parameter used to provision a product.
    */
  @js.native
  trait ProvisioningArtifactParameter extends js.Object {
    var DefaultValue: js.UndefOr[DefaultValue]
    var Description: js.UndefOr[Description]
    var IsNoEcho: js.UndefOr[NoEcho]
    var ParameterConstraints: js.UndefOr[ParameterConstraints]
    var ParameterKey: js.UndefOr[ParameterKey]
    var ParameterType: js.UndefOr[ParameterType]
  }

  object ProvisioningArtifactParameter {
    def apply(
        DefaultValue: js.UndefOr[DefaultValue] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        IsNoEcho: js.UndefOr[NoEcho] = js.undefined,
        ParameterConstraints: js.UndefOr[ParameterConstraints] = js.undefined,
        ParameterKey: js.UndefOr[ParameterKey] = js.undefined,
        ParameterType: js.UndefOr[ParameterType] = js.undefined
    ): ProvisioningArtifactParameter = {
      val __obj = js.Dictionary.empty[js.Any]
      DefaultValue.foreach(__v => __obj.update("DefaultValue", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      IsNoEcho.foreach(__v => __obj.update("IsNoEcho", __v.asInstanceOf[js.Any]))
      ParameterConstraints.foreach(__v => __obj.update("ParameterConstraints", __v.asInstanceOf[js.Any]))
      ParameterKey.foreach(__v => __obj.update("ParameterKey", __v.asInstanceOf[js.Any]))
      ParameterType.foreach(__v => __obj.update("ParameterType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningArtifactParameter]
    }
  }

  /**
    * The user-defined preferences that will be applied during product provisioning, unless overridden by <code>ProvisioningPreferences</code> or <code>UpdateProvisioningPreferences</code>.
    *  For more information on maximum concurrent accounts and failure tolerance, see [[https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options|Stack set operation options]] in the <i>AWS CloudFormation User Guide</i>.
    */
  @js.native
  trait ProvisioningArtifactPreferences extends js.Object {
    var StackSetAccounts: js.UndefOr[StackSetAccounts]
    var StackSetRegions: js.UndefOr[StackSetRegions]
  }

  object ProvisioningArtifactPreferences {
    def apply(
        StackSetAccounts: js.UndefOr[StackSetAccounts] = js.undefined,
        StackSetRegions: js.UndefOr[StackSetRegions] = js.undefined
    ): ProvisioningArtifactPreferences = {
      val __obj = js.Dictionary.empty[js.Any]
      StackSetAccounts.foreach(__v => __obj.update("StackSetAccounts", __v.asInstanceOf[js.Any]))
      StackSetRegions.foreach(__v => __obj.update("StackSetRegions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningArtifactPreferences]
    }
  }

  /**
    * Information about a provisioning artifact (also known as a version) for a product.
    */
  @js.native
  trait ProvisioningArtifactProperties extends js.Object {
    var Info: ProvisioningArtifactInfo
    var Description: js.UndefOr[ProvisioningArtifactDescription]
    var Name: js.UndefOr[ProvisioningArtifactName]
    var Type: js.UndefOr[ProvisioningArtifactType]
  }

  object ProvisioningArtifactProperties {
    def apply(
        Info: ProvisioningArtifactInfo,
        Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined,
        Name: js.UndefOr[ProvisioningArtifactName] = js.undefined,
        Type: js.UndefOr[ProvisioningArtifactType] = js.undefined
    ): ProvisioningArtifactProperties = {
      val __obj = js.Dictionary[js.Any](
        "Info" -> Info.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningArtifactProperties]
    }
  }

  object ProvisioningArtifactPropertyNameEnum {
    val Id = "Id"

    val values = IndexedSeq(Id)
  }

  /**
    * Summary information about a provisioning artifact (also known as a version) for a product.
    */
  @js.native
  trait ProvisioningArtifactSummary extends js.Object {
    var CreatedTime: js.UndefOr[ProvisioningArtifactCreatedTime]
    var Description: js.UndefOr[ProvisioningArtifactDescription]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[ProvisioningArtifactName]
    var ProvisioningArtifactMetadata: js.UndefOr[ProvisioningArtifactInfo]
  }

  object ProvisioningArtifactSummary {
    def apply(
        CreatedTime: js.UndefOr[ProvisioningArtifactCreatedTime] = js.undefined,
        Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[ProvisioningArtifactName] = js.undefined,
        ProvisioningArtifactMetadata: js.UndefOr[ProvisioningArtifactInfo] = js.undefined
    ): ProvisioningArtifactSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      CreatedTime.foreach(__v => __obj.update("CreatedTime", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      ProvisioningArtifactMetadata.foreach(
        __v => __obj.update("ProvisioningArtifactMetadata", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ProvisioningArtifactSummary]
    }
  }

  object ProvisioningArtifactTypeEnum {
    val CLOUD_FORMATION_TEMPLATE = "CLOUD_FORMATION_TEMPLATE"
    val MARKETPLACE_AMI          = "MARKETPLACE_AMI"
    val MARKETPLACE_CAR          = "MARKETPLACE_CAR"

    val values = IndexedSeq(CLOUD_FORMATION_TEMPLATE, MARKETPLACE_AMI, MARKETPLACE_CAR)
  }

  /**
    * An object that contains summary information about a product view and a provisioning artifact.
    */
  @js.native
  trait ProvisioningArtifactView extends js.Object {
    var ProductViewSummary: js.UndefOr[ProductViewSummary]
    var ProvisioningArtifact: js.UndefOr[ProvisioningArtifact]
  }

  object ProvisioningArtifactView {
    def apply(
        ProductViewSummary: js.UndefOr[ProductViewSummary] = js.undefined,
        ProvisioningArtifact: js.UndefOr[ProvisioningArtifact] = js.undefined
    ): ProvisioningArtifactView = {
      val __obj = js.Dictionary.empty[js.Any]
      ProductViewSummary.foreach(__v => __obj.update("ProductViewSummary", __v.asInstanceOf[js.Any]))
      ProvisioningArtifact.foreach(__v => __obj.update("ProvisioningArtifact", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningArtifactView]
    }
  }

  /**
    * Information about a parameter used to provision a product.
    */
  @js.native
  trait ProvisioningParameter extends js.Object {
    var Key: js.UndefOr[ParameterKey]
    var Value: js.UndefOr[ParameterValue]
  }

  object ProvisioningParameter {
    def apply(
        Key: js.UndefOr[ParameterKey] = js.undefined,
        Value: js.UndefOr[ParameterValue] = js.undefined
    ): ProvisioningParameter = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningParameter]
    }
  }

  /**
    * The user-defined preferences that will be applied when updating a provisioned product. Not all preferences are applicable to all provisioned product types.
    */
  @js.native
  trait ProvisioningPreferences extends js.Object {
    var StackSetAccounts: js.UndefOr[StackSetAccounts]
    var StackSetFailureToleranceCount: js.UndefOr[StackSetFailureToleranceCount]
    var StackSetFailureTolerancePercentage: js.UndefOr[StackSetFailureTolerancePercentage]
    var StackSetMaxConcurrencyCount: js.UndefOr[StackSetMaxConcurrencyCount]
    var StackSetMaxConcurrencyPercentage: js.UndefOr[StackSetMaxConcurrencyPercentage]
    var StackSetRegions: js.UndefOr[StackSetRegions]
  }

  object ProvisioningPreferences {
    def apply(
        StackSetAccounts: js.UndefOr[StackSetAccounts] = js.undefined,
        StackSetFailureToleranceCount: js.UndefOr[StackSetFailureToleranceCount] = js.undefined,
        StackSetFailureTolerancePercentage: js.UndefOr[StackSetFailureTolerancePercentage] = js.undefined,
        StackSetMaxConcurrencyCount: js.UndefOr[StackSetMaxConcurrencyCount] = js.undefined,
        StackSetMaxConcurrencyPercentage: js.UndefOr[StackSetMaxConcurrencyPercentage] = js.undefined,
        StackSetRegions: js.UndefOr[StackSetRegions] = js.undefined
    ): ProvisioningPreferences = {
      val __obj = js.Dictionary.empty[js.Any]
      StackSetAccounts.foreach(__v => __obj.update("StackSetAccounts", __v.asInstanceOf[js.Any]))
      StackSetFailureToleranceCount.foreach(
        __v => __obj.update("StackSetFailureToleranceCount", __v.asInstanceOf[js.Any])
      )
      StackSetFailureTolerancePercentage.foreach(
        __v => __obj.update("StackSetFailureTolerancePercentage", __v.asInstanceOf[js.Any])
      )
      StackSetMaxConcurrencyCount.foreach(__v => __obj.update("StackSetMaxConcurrencyCount", __v.asInstanceOf[js.Any]))
      StackSetMaxConcurrencyPercentage.foreach(
        __v => __obj.update("StackSetMaxConcurrencyPercentage", __v.asInstanceOf[js.Any])
      )
      StackSetRegions.foreach(__v => __obj.update("StackSetRegions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningPreferences]
    }
  }

  /**
    * Information about a request operation.
    */
  @js.native
  trait RecordDetail extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTime]
    var PathId: js.UndefOr[Id]
    var ProductId: js.UndefOr[Id]
    var ProvisionedProductId: js.UndefOr[Id]
    var ProvisionedProductName: js.UndefOr[ProvisionedProductName]
    var ProvisionedProductType: js.UndefOr[ProvisionedProductType]
    var ProvisioningArtifactId: js.UndefOr[Id]
    var RecordErrors: js.UndefOr[RecordErrors]
    var RecordId: js.UndefOr[Id]
    var RecordTags: js.UndefOr[RecordTags]
    var RecordType: js.UndefOr[RecordType]
    var Status: js.UndefOr[RecordStatus]
    var UpdatedTime: js.UndefOr[UpdatedTime]
  }

  object RecordDetail {
    def apply(
        CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
        PathId: js.UndefOr[Id] = js.undefined,
        ProductId: js.UndefOr[Id] = js.undefined,
        ProvisionedProductId: js.UndefOr[Id] = js.undefined,
        ProvisionedProductName: js.UndefOr[ProvisionedProductName] = js.undefined,
        ProvisionedProductType: js.UndefOr[ProvisionedProductType] = js.undefined,
        ProvisioningArtifactId: js.UndefOr[Id] = js.undefined,
        RecordErrors: js.UndefOr[RecordErrors] = js.undefined,
        RecordId: js.UndefOr[Id] = js.undefined,
        RecordTags: js.UndefOr[RecordTags] = js.undefined,
        RecordType: js.UndefOr[RecordType] = js.undefined,
        Status: js.UndefOr[RecordStatus] = js.undefined,
        UpdatedTime: js.UndefOr[UpdatedTime] = js.undefined
    ): RecordDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      CreatedTime.foreach(__v => __obj.update("CreatedTime", __v.asInstanceOf[js.Any]))
      PathId.foreach(__v => __obj.update("PathId", __v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.update("ProductId", __v.asInstanceOf[js.Any]))
      ProvisionedProductId.foreach(__v => __obj.update("ProvisionedProductId", __v.asInstanceOf[js.Any]))
      ProvisionedProductName.foreach(__v => __obj.update("ProvisionedProductName", __v.asInstanceOf[js.Any]))
      ProvisionedProductType.foreach(__v => __obj.update("ProvisionedProductType", __v.asInstanceOf[js.Any]))
      ProvisioningArtifactId.foreach(__v => __obj.update("ProvisioningArtifactId", __v.asInstanceOf[js.Any]))
      RecordErrors.foreach(__v => __obj.update("RecordErrors", __v.asInstanceOf[js.Any]))
      RecordId.foreach(__v => __obj.update("RecordId", __v.asInstanceOf[js.Any]))
      RecordTags.foreach(__v => __obj.update("RecordTags", __v.asInstanceOf[js.Any]))
      RecordType.foreach(__v => __obj.update("RecordType", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      UpdatedTime.foreach(__v => __obj.update("UpdatedTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordDetail]
    }
  }

  /**
    * The error code and description resulting from an operation.
    */
  @js.native
  trait RecordError extends js.Object {
    var Code: js.UndefOr[ErrorCode]
    var Description: js.UndefOr[ErrorDescription]
  }

  object RecordError {
    def apply(
        Code: js.UndefOr[ErrorCode] = js.undefined,
        Description: js.UndefOr[ErrorDescription] = js.undefined
    ): RecordError = {
      val __obj = js.Dictionary.empty[js.Any]
      Code.foreach(__v => __obj.update("Code", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordError]
    }
  }

  /**
    * The output for the product created as the result of a request. For example, the output for a CloudFormation-backed product that creates an S3 bucket would include the S3 bucket URL.
    */
  @js.native
  trait RecordOutput extends js.Object {
    var Description: js.UndefOr[Description]
    var OutputKey: js.UndefOr[OutputKey]
    var OutputValue: js.UndefOr[OutputValue]
  }

  object RecordOutput {
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        OutputKey: js.UndefOr[OutputKey] = js.undefined,
        OutputValue: js.UndefOr[OutputValue] = js.undefined
    ): RecordOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      OutputKey.foreach(__v => __obj.update("OutputKey", __v.asInstanceOf[js.Any]))
      OutputValue.foreach(__v => __obj.update("OutputValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordOutput]
    }
  }

  object RecordStatusEnum {
    val CREATED              = "CREATED"
    val IN_PROGRESS          = "IN_PROGRESS"
    val IN_PROGRESS_IN_ERROR = "IN_PROGRESS_IN_ERROR"
    val SUCCEEDED            = "SUCCEEDED"
    val FAILED               = "FAILED"

    val values = IndexedSeq(CREATED, IN_PROGRESS, IN_PROGRESS_IN_ERROR, SUCCEEDED, FAILED)
  }

  /**
    * Information about a tag, which is a key-value pair.
    */
  @js.native
  trait RecordTag extends js.Object {
    var Key: js.UndefOr[RecordTagKey]
    var Value: js.UndefOr[RecordTagValue]
  }

  object RecordTag {
    def apply(
        Key: js.UndefOr[RecordTagKey] = js.undefined,
        Value: js.UndefOr[RecordTagValue] = js.undefined
    ): RecordTag = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordTag]
    }
  }

  @js.native
  trait RejectPortfolioShareInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PortfolioShareType: js.UndefOr[PortfolioShareType]
  }

  object RejectPortfolioShareInput {
    def apply(
        PortfolioId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PortfolioShareType: js.UndefOr[PortfolioShareType] = js.undefined
    ): RejectPortfolioShareInput = {
      val __obj = js.Dictionary[js.Any](
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      PortfolioShareType.foreach(__v => __obj.update("PortfolioShareType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RejectPortfolioShareInput]
    }
  }

  @js.native
  trait RejectPortfolioShareOutput extends js.Object {}

  object RejectPortfolioShareOutput {
    def apply(
        ): RejectPortfolioShareOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[RejectPortfolioShareOutput]
    }
  }

  object ReplacementEnum {
    val TRUE        = "TRUE"
    val FALSE       = "FALSE"
    val CONDITIONAL = "CONDITIONAL"

    val values = IndexedSeq(TRUE, FALSE, CONDITIONAL)
  }

  object RequiresRecreationEnum {
    val NEVER         = "NEVER"
    val CONDITIONALLY = "CONDITIONALLY"
    val ALWAYS        = "ALWAYS"

    val values = IndexedSeq(NEVER, CONDITIONALLY, ALWAYS)
  }

  object ResourceAttributeEnum {
    val PROPERTIES     = "PROPERTIES"
    val METADATA       = "METADATA"
    val CREATIONPOLICY = "CREATIONPOLICY"
    val UPDATEPOLICY   = "UPDATEPOLICY"
    val DELETIONPOLICY = "DELETIONPOLICY"
    val TAGS           = "TAGS"

    val values = IndexedSeq(PROPERTIES, METADATA, CREATIONPOLICY, UPDATEPOLICY, DELETIONPOLICY, TAGS)
  }

  /**
    * Information about a resource change that will occur when a plan is executed.
    */
  @js.native
  trait ResourceChange extends js.Object {
    var Action: js.UndefOr[ChangeAction]
    var Details: js.UndefOr[ResourceChangeDetails]
    var LogicalResourceId: js.UndefOr[LogicalResourceId]
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId]
    var Replacement: js.UndefOr[Replacement]
    var ResourceType: js.UndefOr[PlanResourceType]
    var Scope: js.UndefOr[Scope]
  }

  object ResourceChange {
    def apply(
        Action: js.UndefOr[ChangeAction] = js.undefined,
        Details: js.UndefOr[ResourceChangeDetails] = js.undefined,
        LogicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined,
        PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined,
        Replacement: js.UndefOr[Replacement] = js.undefined,
        ResourceType: js.UndefOr[PlanResourceType] = js.undefined,
        Scope: js.UndefOr[Scope] = js.undefined
    ): ResourceChange = {
      val __obj = js.Dictionary.empty[js.Any]
      Action.foreach(__v => __obj.update("Action", __v.asInstanceOf[js.Any]))
      Details.foreach(__v => __obj.update("Details", __v.asInstanceOf[js.Any]))
      LogicalResourceId.foreach(__v => __obj.update("LogicalResourceId", __v.asInstanceOf[js.Any]))
      PhysicalResourceId.foreach(__v => __obj.update("PhysicalResourceId", __v.asInstanceOf[js.Any]))
      Replacement.foreach(__v => __obj.update("Replacement", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      Scope.foreach(__v => __obj.update("Scope", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceChange]
    }
  }

  /**
    * Information about a change to a resource attribute.
    */
  @js.native
  trait ResourceChangeDetail extends js.Object {
    var CausingEntity: js.UndefOr[CausingEntity]
    var Evaluation: js.UndefOr[EvaluationType]
    var Target: js.UndefOr[ResourceTargetDefinition]
  }

  object ResourceChangeDetail {
    def apply(
        CausingEntity: js.UndefOr[CausingEntity] = js.undefined,
        Evaluation: js.UndefOr[EvaluationType] = js.undefined,
        Target: js.UndefOr[ResourceTargetDefinition] = js.undefined
    ): ResourceChangeDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      CausingEntity.foreach(__v => __obj.update("CausingEntity", __v.asInstanceOf[js.Any]))
      Evaluation.foreach(__v => __obj.update("Evaluation", __v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.update("Target", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceChangeDetail]
    }
  }

  /**
    * Information about a resource.
    */
  @js.native
  trait ResourceDetail extends js.Object {
    var ARN: js.UndefOr[ResourceDetailARN]
    var CreatedTime: js.UndefOr[ResourceDetailCreatedTime]
    var Description: js.UndefOr[ResourceDetailDescription]
    var Id: js.UndefOr[ResourceDetailId]
    var Name: js.UndefOr[ResourceDetailName]
  }

  object ResourceDetail {
    def apply(
        ARN: js.UndefOr[ResourceDetailARN] = js.undefined,
        CreatedTime: js.UndefOr[ResourceDetailCreatedTime] = js.undefined,
        Description: js.UndefOr[ResourceDetailDescription] = js.undefined,
        Id: js.UndefOr[ResourceDetailId] = js.undefined,
        Name: js.UndefOr[ResourceDetailName] = js.undefined
    ): ResourceDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      ARN.foreach(__v => __obj.update("ARN", __v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.update("CreatedTime", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceDetail]
    }
  }

  /**
    * Information about a change to a resource attribute.
    */
  @js.native
  trait ResourceTargetDefinition extends js.Object {
    var Attribute: js.UndefOr[ResourceAttribute]
    var Name: js.UndefOr[PropertyName]
    var RequiresRecreation: js.UndefOr[RequiresRecreation]
  }

  object ResourceTargetDefinition {
    def apply(
        Attribute: js.UndefOr[ResourceAttribute] = js.undefined,
        Name: js.UndefOr[PropertyName] = js.undefined,
        RequiresRecreation: js.UndefOr[RequiresRecreation] = js.undefined
    ): ResourceTargetDefinition = {
      val __obj = js.Dictionary.empty[js.Any]
      Attribute.foreach(__v => __obj.update("Attribute", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      RequiresRecreation.foreach(__v => __obj.update("RequiresRecreation", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceTargetDefinition]
    }
  }

  @js.native
  trait ScanProvisionedProductsInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AccessLevelFilter: js.UndefOr[AccessLevelFilter]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ScanProvisionedProductsInput {
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        AccessLevelFilter: js.UndefOr[AccessLevelFilter] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ScanProvisionedProductsInput = {
      val __obj = js.Dictionary.empty[js.Any]
      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      AccessLevelFilter.foreach(__v => __obj.update("AccessLevelFilter", __v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScanProvisionedProductsInput]
    }
  }

  @js.native
  trait ScanProvisionedProductsOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisionedProducts: js.UndefOr[ProvisionedProductDetails]
  }

  object ScanProvisionedProductsOutput {
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        ProvisionedProducts: js.UndefOr[ProvisionedProductDetails] = js.undefined
    ): ScanProvisionedProductsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextPageToken.foreach(__v => __obj.update("NextPageToken", __v.asInstanceOf[js.Any]))
      ProvisionedProducts.foreach(__v => __obj.update("ProvisionedProducts", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScanProvisionedProductsOutput]
    }
  }

  @js.native
  trait SearchProductsAsAdminInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Filters: js.UndefOr[ProductViewFilters]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
    var PortfolioId: js.UndefOr[Id]
    var ProductSource: js.UndefOr[ProductSource]
    var SortBy: js.UndefOr[ProductViewSortBy]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object SearchProductsAsAdminInput {
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Filters: js.UndefOr[ProductViewFilters] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined,
        PortfolioId: js.UndefOr[Id] = js.undefined,
        ProductSource: js.UndefOr[ProductSource] = js.undefined,
        SortBy: js.UndefOr[ProductViewSortBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): SearchProductsAsAdminInput = {
      val __obj = js.Dictionary.empty[js.Any]
      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      PortfolioId.foreach(__v => __obj.update("PortfolioId", __v.asInstanceOf[js.Any]))
      ProductSource.foreach(__v => __obj.update("ProductSource", __v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.update("SortBy", __v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.update("SortOrder", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchProductsAsAdminInput]
    }
  }

  @js.native
  trait SearchProductsAsAdminOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProductViewDetails: js.UndefOr[ProductViewDetails]
  }

  object SearchProductsAsAdminOutput {
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        ProductViewDetails: js.UndefOr[ProductViewDetails] = js.undefined
    ): SearchProductsAsAdminOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextPageToken.foreach(__v => __obj.update("NextPageToken", __v.asInstanceOf[js.Any]))
      ProductViewDetails.foreach(__v => __obj.update("ProductViewDetails", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchProductsAsAdminOutput]
    }
  }

  @js.native
  trait SearchProductsInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Filters: js.UndefOr[ProductViewFilters]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
    var SortBy: js.UndefOr[ProductViewSortBy]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object SearchProductsInput {
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Filters: js.UndefOr[ProductViewFilters] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined,
        SortBy: js.UndefOr[ProductViewSortBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): SearchProductsInput = {
      val __obj = js.Dictionary.empty[js.Any]
      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.update("SortBy", __v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.update("SortOrder", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchProductsInput]
    }
  }

  @js.native
  trait SearchProductsOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProductViewAggregations: js.UndefOr[ProductViewAggregations]
    var ProductViewSummaries: js.UndefOr[ProductViewSummaries]
  }

  object SearchProductsOutput {
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        ProductViewAggregations: js.UndefOr[ProductViewAggregations] = js.undefined,
        ProductViewSummaries: js.UndefOr[ProductViewSummaries] = js.undefined
    ): SearchProductsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextPageToken.foreach(__v => __obj.update("NextPageToken", __v.asInstanceOf[js.Any]))
      ProductViewAggregations.foreach(__v => __obj.update("ProductViewAggregations", __v.asInstanceOf[js.Any]))
      ProductViewSummaries.foreach(__v => __obj.update("ProductViewSummaries", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchProductsOutput]
    }
  }

  @js.native
  trait SearchProvisionedProductsInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AccessLevelFilter: js.UndefOr[AccessLevelFilter]
    var Filters: js.UndefOr[ProvisionedProductFilters]
    var PageSize: js.UndefOr[SearchProvisionedProductsPageSize]
    var PageToken: js.UndefOr[PageToken]
    var SortBy: js.UndefOr[SortField]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object SearchProvisionedProductsInput {
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        AccessLevelFilter: js.UndefOr[AccessLevelFilter] = js.undefined,
        Filters: js.UndefOr[ProvisionedProductFilters] = js.undefined,
        PageSize: js.UndefOr[SearchProvisionedProductsPageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined,
        SortBy: js.UndefOr[SortField] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): SearchProvisionedProductsInput = {
      val __obj = js.Dictionary.empty[js.Any]
      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      AccessLevelFilter.foreach(__v => __obj.update("AccessLevelFilter", __v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.update("PageToken", __v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.update("SortBy", __v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.update("SortOrder", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchProvisionedProductsInput]
    }
  }

  @js.native
  trait SearchProvisionedProductsOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisionedProducts: js.UndefOr[ProvisionedProductAttributes]
    var TotalResultsCount: js.UndefOr[TotalResultsCount]
  }

  object SearchProvisionedProductsOutput {
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        ProvisionedProducts: js.UndefOr[ProvisionedProductAttributes] = js.undefined,
        TotalResultsCount: js.UndefOr[TotalResultsCount] = js.undefined
    ): SearchProvisionedProductsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextPageToken.foreach(__v => __obj.update("NextPageToken", __v.asInstanceOf[js.Any]))
      ProvisionedProducts.foreach(__v => __obj.update("ProvisionedProducts", __v.asInstanceOf[js.Any]))
      TotalResultsCount.foreach(__v => __obj.update("TotalResultsCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchProvisionedProductsOutput]
    }
  }

  /**
    * A self-service action association consisting of the Action ID, the Product ID, and the Provisioning Artifact ID.
    */
  @js.native
  trait ServiceActionAssociation extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var ServiceActionId: Id
  }

  object ServiceActionAssociation {
    def apply(
        ProductId: Id,
        ProvisioningArtifactId: Id,
        ServiceActionId: Id
    ): ServiceActionAssociation = {
      val __obj = js.Dictionary[js.Any](
        "ProductId"              -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any],
        "ServiceActionId"        -> ServiceActionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ServiceActionAssociation]
    }
  }

  object ServiceActionAssociationErrorCodeEnum {
    val DUPLICATE_RESOURCE = "DUPLICATE_RESOURCE"
    val INTERNAL_FAILURE   = "INTERNAL_FAILURE"
    val LIMIT_EXCEEDED     = "LIMIT_EXCEEDED"
    val RESOURCE_NOT_FOUND = "RESOURCE_NOT_FOUND"
    val THROTTLING         = "THROTTLING"

    val values = IndexedSeq(DUPLICATE_RESOURCE, INTERNAL_FAILURE, LIMIT_EXCEEDED, RESOURCE_NOT_FOUND, THROTTLING)
  }

  object ServiceActionDefinitionKeyEnum {
    val Name       = "Name"
    val Version    = "Version"
    val AssumeRole = "AssumeRole"
    val Parameters = "Parameters"

    val values = IndexedSeq(Name, Version, AssumeRole, Parameters)
  }

  object ServiceActionDefinitionTypeEnum {
    val SSM_AUTOMATION = "SSM_AUTOMATION"

    val values = IndexedSeq(SSM_AUTOMATION)
  }

  /**
    * An object containing detailed information about the self-service action.
    */
  @js.native
  trait ServiceActionDetail extends js.Object {
    var Definition: js.UndefOr[ServiceActionDefinitionMap]
    var ServiceActionSummary: js.UndefOr[ServiceActionSummary]
  }

  object ServiceActionDetail {
    def apply(
        Definition: js.UndefOr[ServiceActionDefinitionMap] = js.undefined,
        ServiceActionSummary: js.UndefOr[ServiceActionSummary] = js.undefined
    ): ServiceActionDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      Definition.foreach(__v => __obj.update("Definition", __v.asInstanceOf[js.Any]))
      ServiceActionSummary.foreach(__v => __obj.update("ServiceActionSummary", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceActionDetail]
    }
  }

  /**
    * Detailed information about the self-service action.
    */
  @js.native
  trait ServiceActionSummary extends js.Object {
    var DefinitionType: js.UndefOr[ServiceActionDefinitionType]
    var Description: js.UndefOr[ServiceActionDescription]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[ServiceActionName]
  }

  object ServiceActionSummary {
    def apply(
        DefinitionType: js.UndefOr[ServiceActionDefinitionType] = js.undefined,
        Description: js.UndefOr[ServiceActionDescription] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[ServiceActionName] = js.undefined
    ): ServiceActionSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      DefinitionType.foreach(__v => __obj.update("DefinitionType", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceActionSummary]
    }
  }

  /**
    * Information about the portfolio share operation.
    */
  @js.native
  trait ShareDetails extends js.Object {
    var ShareErrors: js.UndefOr[ShareErrors]
    var SuccessfulShares: js.UndefOr[SuccessfulShares]
  }

  object ShareDetails {
    def apply(
        ShareErrors: js.UndefOr[ShareErrors] = js.undefined,
        SuccessfulShares: js.UndefOr[SuccessfulShares] = js.undefined
    ): ShareDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      ShareErrors.foreach(__v => __obj.update("ShareErrors", __v.asInstanceOf[js.Any]))
      SuccessfulShares.foreach(__v => __obj.update("SuccessfulShares", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShareDetails]
    }
  }

  /**
    * Errors that occurred during the portfolio share operation.
    */
  @js.native
  trait ShareError extends js.Object {
    var Accounts: js.UndefOr[Namespaces]
    var Error: js.UndefOr[Error]
    var Message: js.UndefOr[Message]
  }

  object ShareError {
    def apply(
        Accounts: js.UndefOr[Namespaces] = js.undefined,
        Error: js.UndefOr[Error] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined
    ): ShareError = {
      val __obj = js.Dictionary.empty[js.Any]
      Accounts.foreach(__v => __obj.update("Accounts", __v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.update("Error", __v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShareError]
    }
  }

  object ShareStatusEnum {
    val NOT_STARTED           = "NOT_STARTED"
    val IN_PROGRESS           = "IN_PROGRESS"
    val COMPLETED             = "COMPLETED"
    val COMPLETED_WITH_ERRORS = "COMPLETED_WITH_ERRORS"
    val ERROR                 = "ERROR"

    val values = IndexedSeq(NOT_STARTED, IN_PROGRESS, COMPLETED, COMPLETED_WITH_ERRORS, ERROR)
  }

  object SortOrderEnum {
    val ASCENDING  = "ASCENDING"
    val DESCENDING = "DESCENDING"

    val values = IndexedSeq(ASCENDING, DESCENDING)
  }

  object StackSetOperationTypeEnum {
    val CREATE = "CREATE"
    val UPDATE = "UPDATE"
    val DELETE = "DELETE"

    val values = IndexedSeq(CREATE, UPDATE, DELETE)
  }

  object StatusEnum {
    val AVAILABLE = "AVAILABLE"
    val CREATING  = "CREATING"
    val FAILED    = "FAILED"

    val values = IndexedSeq(AVAILABLE, CREATING, FAILED)
  }

  /**
    * Information about a tag. A tag is a key-value pair. Tags are propagated to the resources created when provisioning a product.
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

  /**
    * Information about a TagOption.
    */
  @js.native
  trait TagOptionDetail extends js.Object {
    var Active: js.UndefOr[TagOptionActive]
    var Id: js.UndefOr[TagOptionId]
    var Key: js.UndefOr[TagOptionKey]
    var Value: js.UndefOr[TagOptionValue]
  }

  object TagOptionDetail {
    def apply(
        Active: js.UndefOr[TagOptionActive] = js.undefined,
        Id: js.UndefOr[TagOptionId] = js.undefined,
        Key: js.UndefOr[TagOptionKey] = js.undefined,
        Value: js.UndefOr[TagOptionValue] = js.undefined
    ): TagOptionDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      Active.foreach(__v => __obj.update("Active", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagOptionDetail]
    }
  }

  /**
    * Summary information about a TagOption.
    */
  @js.native
  trait TagOptionSummary extends js.Object {
    var Key: js.UndefOr[TagOptionKey]
    var Values: js.UndefOr[TagOptionValues]
  }

  object TagOptionSummary {
    def apply(
        Key: js.UndefOr[TagOptionKey] = js.undefined,
        Values: js.UndefOr[TagOptionValues] = js.undefined
    ): TagOptionSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.update("Values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagOptionSummary]
    }
  }

  @js.native
  trait TerminateProvisionedProductInput extends js.Object {
    var TerminateToken: IdempotencyToken
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var IgnoreErrors: js.UndefOr[IgnoreErrors]
    var ProvisionedProductId: js.UndefOr[Id]
    var ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn]
  }

  object TerminateProvisionedProductInput {
    def apply(
        TerminateToken: IdempotencyToken,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        IgnoreErrors: js.UndefOr[IgnoreErrors] = js.undefined,
        ProvisionedProductId: js.UndefOr[Id] = js.undefined,
        ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined
    ): TerminateProvisionedProductInput = {
      val __obj = js.Dictionary[js.Any](
        "TerminateToken" -> TerminateToken.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      IgnoreErrors.foreach(__v => __obj.update("IgnoreErrors", __v.asInstanceOf[js.Any]))
      ProvisionedProductId.foreach(__v => __obj.update("ProvisionedProductId", __v.asInstanceOf[js.Any]))
      ProvisionedProductName.foreach(__v => __obj.update("ProvisionedProductName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TerminateProvisionedProductInput]
    }
  }

  @js.native
  trait TerminateProvisionedProductOutput extends js.Object {
    var RecordDetail: js.UndefOr[RecordDetail]
  }

  object TerminateProvisionedProductOutput {
    def apply(
        RecordDetail: js.UndefOr[RecordDetail] = js.undefined
    ): TerminateProvisionedProductOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      RecordDetail.foreach(__v => __obj.update("RecordDetail", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TerminateProvisionedProductOutput]
    }
  }

  @js.native
  trait UpdateConstraintInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Description: js.UndefOr[ConstraintDescription]
  }

  object UpdateConstraintInput {
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Description: js.UndefOr[ConstraintDescription] = js.undefined
    ): UpdateConstraintInput = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConstraintInput]
    }
  }

  @js.native
  trait UpdateConstraintOutput extends js.Object {
    var ConstraintDetail: js.UndefOr[ConstraintDetail]
    var ConstraintParameters: js.UndefOr[ConstraintParameters]
    var Status: js.UndefOr[Status]
  }

  object UpdateConstraintOutput {
    def apply(
        ConstraintDetail: js.UndefOr[ConstraintDetail] = js.undefined,
        ConstraintParameters: js.UndefOr[ConstraintParameters] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): UpdateConstraintOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ConstraintDetail.foreach(__v => __obj.update("ConstraintDetail", __v.asInstanceOf[js.Any]))
      ConstraintParameters.foreach(__v => __obj.update("ConstraintParameters", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConstraintOutput]
    }
  }

  @js.native
  trait UpdatePortfolioInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AddTags: js.UndefOr[AddTags]
    var Description: js.UndefOr[PortfolioDescription]
    var DisplayName: js.UndefOr[PortfolioDisplayName]
    var ProviderName: js.UndefOr[ProviderName]
    var RemoveTags: js.UndefOr[TagKeys]
  }

  object UpdatePortfolioInput {
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        AddTags: js.UndefOr[AddTags] = js.undefined,
        Description: js.UndefOr[PortfolioDescription] = js.undefined,
        DisplayName: js.UndefOr[PortfolioDisplayName] = js.undefined,
        ProviderName: js.UndefOr[ProviderName] = js.undefined,
        RemoveTags: js.UndefOr[TagKeys] = js.undefined
    ): UpdatePortfolioInput = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      AddTags.foreach(__v => __obj.update("AddTags", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.update("DisplayName", __v.asInstanceOf[js.Any]))
      ProviderName.foreach(__v => __obj.update("ProviderName", __v.asInstanceOf[js.Any]))
      RemoveTags.foreach(__v => __obj.update("RemoveTags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePortfolioInput]
    }
  }

  @js.native
  trait UpdatePortfolioOutput extends js.Object {
    var PortfolioDetail: js.UndefOr[PortfolioDetail]
    var Tags: js.UndefOr[Tags]
  }

  object UpdatePortfolioOutput {
    def apply(
        PortfolioDetail: js.UndefOr[PortfolioDetail] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): UpdatePortfolioOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      PortfolioDetail.foreach(__v => __obj.update("PortfolioDetail", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePortfolioOutput]
    }
  }

  @js.native
  trait UpdateProductInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AddTags: js.UndefOr[AddTags]
    var Description: js.UndefOr[ProductViewShortDescription]
    var Distributor: js.UndefOr[ProductViewOwner]
    var Name: js.UndefOr[ProductViewName]
    var Owner: js.UndefOr[ProductViewOwner]
    var RemoveTags: js.UndefOr[TagKeys]
    var SupportDescription: js.UndefOr[SupportDescription]
    var SupportEmail: js.UndefOr[SupportEmail]
    var SupportUrl: js.UndefOr[SupportUrl]
  }

  object UpdateProductInput {
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        AddTags: js.UndefOr[AddTags] = js.undefined,
        Description: js.UndefOr[ProductViewShortDescription] = js.undefined,
        Distributor: js.UndefOr[ProductViewOwner] = js.undefined,
        Name: js.UndefOr[ProductViewName] = js.undefined,
        Owner: js.UndefOr[ProductViewOwner] = js.undefined,
        RemoveTags: js.UndefOr[TagKeys] = js.undefined,
        SupportDescription: js.UndefOr[SupportDescription] = js.undefined,
        SupportEmail: js.UndefOr[SupportEmail] = js.undefined,
        SupportUrl: js.UndefOr[SupportUrl] = js.undefined
    ): UpdateProductInput = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      AddTags.foreach(__v => __obj.update("AddTags", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Distributor.foreach(__v => __obj.update("Distributor", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.update("Owner", __v.asInstanceOf[js.Any]))
      RemoveTags.foreach(__v => __obj.update("RemoveTags", __v.asInstanceOf[js.Any]))
      SupportDescription.foreach(__v => __obj.update("SupportDescription", __v.asInstanceOf[js.Any]))
      SupportEmail.foreach(__v => __obj.update("SupportEmail", __v.asInstanceOf[js.Any]))
      SupportUrl.foreach(__v => __obj.update("SupportUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProductInput]
    }
  }

  @js.native
  trait UpdateProductOutput extends js.Object {
    var ProductViewDetail: js.UndefOr[ProductViewDetail]
    var Tags: js.UndefOr[Tags]
  }

  object UpdateProductOutput {
    def apply(
        ProductViewDetail: js.UndefOr[ProductViewDetail] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): UpdateProductOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ProductViewDetail.foreach(__v => __obj.update("ProductViewDetail", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProductOutput]
    }
  }

  @js.native
  trait UpdateProvisionedProductInput extends js.Object {
    var UpdateToken: IdempotencyToken
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PathId: js.UndefOr[Id]
    var ProductId: js.UndefOr[Id]
    var ProvisionedProductId: js.UndefOr[Id]
    var ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn]
    var ProvisioningArtifactId: js.UndefOr[Id]
    var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters]
    var ProvisioningPreferences: js.UndefOr[UpdateProvisioningPreferences]
    var Tags: js.UndefOr[Tags]
  }

  object UpdateProvisionedProductInput {
    def apply(
        UpdateToken: IdempotencyToken,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PathId: js.UndefOr[Id] = js.undefined,
        ProductId: js.UndefOr[Id] = js.undefined,
        ProvisionedProductId: js.UndefOr[Id] = js.undefined,
        ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined,
        ProvisioningArtifactId: js.UndefOr[Id] = js.undefined,
        ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.undefined,
        ProvisioningPreferences: js.UndefOr[UpdateProvisioningPreferences] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): UpdateProvisionedProductInput = {
      val __obj = js.Dictionary[js.Any](
        "UpdateToken" -> UpdateToken.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      PathId.foreach(__v => __obj.update("PathId", __v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.update("ProductId", __v.asInstanceOf[js.Any]))
      ProvisionedProductId.foreach(__v => __obj.update("ProvisionedProductId", __v.asInstanceOf[js.Any]))
      ProvisionedProductName.foreach(__v => __obj.update("ProvisionedProductName", __v.asInstanceOf[js.Any]))
      ProvisioningArtifactId.foreach(__v => __obj.update("ProvisioningArtifactId", __v.asInstanceOf[js.Any]))
      ProvisioningParameters.foreach(__v => __obj.update("ProvisioningParameters", __v.asInstanceOf[js.Any]))
      ProvisioningPreferences.foreach(__v => __obj.update("ProvisioningPreferences", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProvisionedProductInput]
    }
  }

  @js.native
  trait UpdateProvisionedProductOutput extends js.Object {
    var RecordDetail: js.UndefOr[RecordDetail]
  }

  object UpdateProvisionedProductOutput {
    def apply(
        RecordDetail: js.UndefOr[RecordDetail] = js.undefined
    ): UpdateProvisionedProductOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      RecordDetail.foreach(__v => __obj.update("RecordDetail", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProvisionedProductOutput]
    }
  }

  @js.native
  trait UpdateProvisioningArtifactInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Active: js.UndefOr[ProvisioningArtifactActive]
    var Description: js.UndefOr[ProvisioningArtifactDescription]
    var Name: js.UndefOr[ProvisioningArtifactName]
  }

  object UpdateProvisioningArtifactInput {
    def apply(
        ProductId: Id,
        ProvisioningArtifactId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Active: js.UndefOr[ProvisioningArtifactActive] = js.undefined,
        Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined,
        Name: js.UndefOr[ProvisioningArtifactName] = js.undefined
    ): UpdateProvisioningArtifactInput = {
      val __obj = js.Dictionary[js.Any](
        "ProductId"              -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      Active.foreach(__v => __obj.update("Active", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProvisioningArtifactInput]
    }
  }

  @js.native
  trait UpdateProvisioningArtifactOutput extends js.Object {
    var Info: js.UndefOr[ProvisioningArtifactInfo]
    var ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail]
    var Status: js.UndefOr[Status]
  }

  object UpdateProvisioningArtifactOutput {
    def apply(
        Info: js.UndefOr[ProvisioningArtifactInfo] = js.undefined,
        ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): UpdateProvisioningArtifactOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Info.foreach(__v => __obj.update("Info", __v.asInstanceOf[js.Any]))
      ProvisioningArtifactDetail.foreach(__v => __obj.update("ProvisioningArtifactDetail", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProvisioningArtifactOutput]
    }
  }

  /**
    * The parameter key-value pair used to update a provisioned product.
    */
  @js.native
  trait UpdateProvisioningParameter extends js.Object {
    var Key: js.UndefOr[ParameterKey]
    var UsePreviousValue: js.UndefOr[UsePreviousValue]
    var Value: js.UndefOr[ParameterValue]
  }

  object UpdateProvisioningParameter {
    def apply(
        Key: js.UndefOr[ParameterKey] = js.undefined,
        UsePreviousValue: js.UndefOr[UsePreviousValue] = js.undefined,
        Value: js.UndefOr[ParameterValue] = js.undefined
    ): UpdateProvisioningParameter = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      UsePreviousValue.foreach(__v => __obj.update("UsePreviousValue", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProvisioningParameter]
    }
  }

  /**
    * The user-defined preferences that will be applied when updating a provisioned product. Not all preferences are applicable to all provisioned product types.
    */
  @js.native
  trait UpdateProvisioningPreferences extends js.Object {
    var StackSetAccounts: js.UndefOr[StackSetAccounts]
    var StackSetFailureToleranceCount: js.UndefOr[StackSetFailureToleranceCount]
    var StackSetFailureTolerancePercentage: js.UndefOr[StackSetFailureTolerancePercentage]
    var StackSetMaxConcurrencyCount: js.UndefOr[StackSetMaxConcurrencyCount]
    var StackSetMaxConcurrencyPercentage: js.UndefOr[StackSetMaxConcurrencyPercentage]
    var StackSetOperationType: js.UndefOr[StackSetOperationType]
    var StackSetRegions: js.UndefOr[StackSetRegions]
  }

  object UpdateProvisioningPreferences {
    def apply(
        StackSetAccounts: js.UndefOr[StackSetAccounts] = js.undefined,
        StackSetFailureToleranceCount: js.UndefOr[StackSetFailureToleranceCount] = js.undefined,
        StackSetFailureTolerancePercentage: js.UndefOr[StackSetFailureTolerancePercentage] = js.undefined,
        StackSetMaxConcurrencyCount: js.UndefOr[StackSetMaxConcurrencyCount] = js.undefined,
        StackSetMaxConcurrencyPercentage: js.UndefOr[StackSetMaxConcurrencyPercentage] = js.undefined,
        StackSetOperationType: js.UndefOr[StackSetOperationType] = js.undefined,
        StackSetRegions: js.UndefOr[StackSetRegions] = js.undefined
    ): UpdateProvisioningPreferences = {
      val __obj = js.Dictionary.empty[js.Any]
      StackSetAccounts.foreach(__v => __obj.update("StackSetAccounts", __v.asInstanceOf[js.Any]))
      StackSetFailureToleranceCount.foreach(
        __v => __obj.update("StackSetFailureToleranceCount", __v.asInstanceOf[js.Any])
      )
      StackSetFailureTolerancePercentage.foreach(
        __v => __obj.update("StackSetFailureTolerancePercentage", __v.asInstanceOf[js.Any])
      )
      StackSetMaxConcurrencyCount.foreach(__v => __obj.update("StackSetMaxConcurrencyCount", __v.asInstanceOf[js.Any]))
      StackSetMaxConcurrencyPercentage.foreach(
        __v => __obj.update("StackSetMaxConcurrencyPercentage", __v.asInstanceOf[js.Any])
      )
      StackSetOperationType.foreach(__v => __obj.update("StackSetOperationType", __v.asInstanceOf[js.Any]))
      StackSetRegions.foreach(__v => __obj.update("StackSetRegions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProvisioningPreferences]
    }
  }

  @js.native
  trait UpdateServiceActionInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Definition: js.UndefOr[ServiceActionDefinitionMap]
    var Description: js.UndefOr[ServiceActionDescription]
    var Name: js.UndefOr[ServiceActionName]
  }

  object UpdateServiceActionInput {
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Definition: js.UndefOr[ServiceActionDefinitionMap] = js.undefined,
        Description: js.UndefOr[ServiceActionDescription] = js.undefined,
        Name: js.UndefOr[ServiceActionName] = js.undefined
    ): UpdateServiceActionInput = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.update("AcceptLanguage", __v.asInstanceOf[js.Any]))
      Definition.foreach(__v => __obj.update("Definition", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServiceActionInput]
    }
  }

  @js.native
  trait UpdateServiceActionOutput extends js.Object {
    var ServiceActionDetail: js.UndefOr[ServiceActionDetail]
  }

  object UpdateServiceActionOutput {
    def apply(
        ServiceActionDetail: js.UndefOr[ServiceActionDetail] = js.undefined
    ): UpdateServiceActionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ServiceActionDetail.foreach(__v => __obj.update("ServiceActionDetail", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServiceActionOutput]
    }
  }

  @js.native
  trait UpdateTagOptionInput extends js.Object {
    var Id: TagOptionId
    var Active: js.UndefOr[TagOptionActive]
    var Value: js.UndefOr[TagOptionValue]
  }

  object UpdateTagOptionInput {
    def apply(
        Id: TagOptionId,
        Active: js.UndefOr[TagOptionActive] = js.undefined,
        Value: js.UndefOr[TagOptionValue] = js.undefined
    ): UpdateTagOptionInput = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Active.foreach(__v => __obj.update("Active", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTagOptionInput]
    }
  }

  @js.native
  trait UpdateTagOptionOutput extends js.Object {
    var TagOptionDetail: js.UndefOr[TagOptionDetail]
  }

  object UpdateTagOptionOutput {
    def apply(
        TagOptionDetail: js.UndefOr[TagOptionDetail] = js.undefined
    ): UpdateTagOptionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      TagOptionDetail.foreach(__v => __obj.update("TagOptionDetail", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTagOptionOutput]
    }
  }

  /**
    * Additional information provided by the administrator.
    */
  @js.native
  trait UsageInstruction extends js.Object {
    var Type: js.UndefOr[InstructionType]
    var Value: js.UndefOr[InstructionValue]
  }

  object UsageInstruction {
    def apply(
        Type: js.UndefOr[InstructionType] = js.undefined,
        Value: js.UndefOr[InstructionValue] = js.undefined
    ): UsageInstruction = {
      val __obj = js.Dictionary.empty[js.Any]
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsageInstruction]
    }
  }
}
