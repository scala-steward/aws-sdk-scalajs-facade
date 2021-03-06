package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object outposts {
  type AccountId = String
  type Arn = String
  type AvailabilityZone = String
  type AvailabilityZoneId = String
  type InstanceType = String
  type InstanceTypeListDefinition = js.Array[InstanceTypeItem]
  type LifeCycleStatus = String
  type MaxResults1000 = Int
  type OutpostArn = String
  type OutpostDescription = String
  type OutpostId = String
  type OutpostName = String
  type OwnerId = String
  type SiteDescription = String
  type SiteId = String
  type SiteName = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Token = String
  type outpostListDefinition = js.Array[Outpost]
  type siteListDefinition = js.Array[Site]

  implicit final class OutpostsOps(private val service: Outposts) extends AnyVal {

    @inline def createOutpostFuture(params: CreateOutpostInput): Future[CreateOutpostOutput] = service.createOutpost(params).promise().toFuture
    @inline def deleteOutpostFuture(params: DeleteOutpostInput): Future[DeleteOutpostOutput] = service.deleteOutpost(params).promise().toFuture
    @inline def deleteSiteFuture(params: DeleteSiteInput): Future[DeleteSiteOutput] = service.deleteSite(params).promise().toFuture
    @inline def getOutpostFuture(params: GetOutpostInput): Future[GetOutpostOutput] = service.getOutpost(params).promise().toFuture
    @inline def getOutpostInstanceTypesFuture(params: GetOutpostInstanceTypesInput): Future[GetOutpostInstanceTypesOutput] = service.getOutpostInstanceTypes(params).promise().toFuture
    @inline def listOutpostsFuture(params: ListOutpostsInput): Future[ListOutpostsOutput] = service.listOutposts(params).promise().toFuture
    @inline def listSitesFuture(params: ListSitesInput): Future[ListSitesOutput] = service.listSites(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture

  }
}

package outposts {
  @js.native
  @JSImport("aws-sdk/clients/outposts", JSImport.Namespace, "AWS.Outposts")
  class Outposts() extends js.Object {
    def this(config: AWSConfig) = this()

    def createOutpost(params: CreateOutpostInput): Request[CreateOutpostOutput] = js.native
    def deleteOutpost(params: DeleteOutpostInput): Request[DeleteOutpostOutput] = js.native
    def deleteSite(params: DeleteSiteInput): Request[DeleteSiteOutput] = js.native
    def getOutpost(params: GetOutpostInput): Request[GetOutpostOutput] = js.native
    def getOutpostInstanceTypes(params: GetOutpostInstanceTypesInput): Request[GetOutpostInstanceTypesOutput] = js.native
    def listOutposts(params: ListOutpostsInput): Request[ListOutpostsOutput] = js.native
    def listSites(params: ListSitesInput): Request[ListSitesOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
  }

  @js.native
  trait CreateOutpostInput extends js.Object {
    var Name: OutpostName
    var SiteId: SiteId
    var AvailabilityZone: js.UndefOr[AvailabilityZone]
    var AvailabilityZoneId: js.UndefOr[AvailabilityZoneId]
    var Description: js.UndefOr[OutpostDescription]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateOutpostInput {
    @inline
    def apply(
        Name: OutpostName,
        SiteId: SiteId,
        AvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
        AvailabilityZoneId: js.UndefOr[AvailabilityZoneId] = js.undefined,
        Description: js.UndefOr[OutpostDescription] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateOutpostInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "SiteId" -> SiteId.asInstanceOf[js.Any]
      )

      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      AvailabilityZoneId.foreach(__v => __obj.updateDynamic("AvailabilityZoneId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOutpostInput]
    }
  }

  @js.native
  trait CreateOutpostOutput extends js.Object {
    var Outpost: js.UndefOr[Outpost]
  }

  object CreateOutpostOutput {
    @inline
    def apply(
        Outpost: js.UndefOr[Outpost] = js.undefined
    ): CreateOutpostOutput = {
      val __obj = js.Dynamic.literal()
      Outpost.foreach(__v => __obj.updateDynamic("Outpost")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOutpostOutput]
    }
  }

  @js.native
  trait DeleteOutpostInput extends js.Object {
    var OutpostId: OutpostId
  }

  object DeleteOutpostInput {
    @inline
    def apply(
        OutpostId: OutpostId
    ): DeleteOutpostInput = {
      val __obj = js.Dynamic.literal(
        "OutpostId" -> OutpostId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteOutpostInput]
    }
  }

  @js.native
  trait DeleteOutpostOutput extends js.Object

  object DeleteOutpostOutput {
    @inline
    def apply(): DeleteOutpostOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteOutpostOutput]
    }
  }

  @js.native
  trait DeleteSiteInput extends js.Object {
    var SiteId: SiteId
  }

  object DeleteSiteInput {
    @inline
    def apply(
        SiteId: SiteId
    ): DeleteSiteInput = {
      val __obj = js.Dynamic.literal(
        "SiteId" -> SiteId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSiteInput]
    }
  }

  @js.native
  trait DeleteSiteOutput extends js.Object

  object DeleteSiteOutput {
    @inline
    def apply(): DeleteSiteOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSiteOutput]
    }
  }

  @js.native
  trait GetOutpostInput extends js.Object {
    var OutpostId: OutpostId
  }

  object GetOutpostInput {
    @inline
    def apply(
        OutpostId: OutpostId
    ): GetOutpostInput = {
      val __obj = js.Dynamic.literal(
        "OutpostId" -> OutpostId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetOutpostInput]
    }
  }

  @js.native
  trait GetOutpostInstanceTypesInput extends js.Object {
    var OutpostId: OutpostId
    var MaxResults: js.UndefOr[MaxResults1000]
    var NextToken: js.UndefOr[Token]
  }

  object GetOutpostInstanceTypesInput {
    @inline
    def apply(
        OutpostId: OutpostId,
        MaxResults: js.UndefOr[MaxResults1000] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetOutpostInstanceTypesInput = {
      val __obj = js.Dynamic.literal(
        "OutpostId" -> OutpostId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOutpostInstanceTypesInput]
    }
  }

  @js.native
  trait GetOutpostInstanceTypesOutput extends js.Object {
    var InstanceTypes: js.UndefOr[InstanceTypeListDefinition]
    var NextToken: js.UndefOr[Token]
    var OutpostArn: js.UndefOr[OutpostArn]
    var OutpostId: js.UndefOr[OutpostId]
  }

  object GetOutpostInstanceTypesOutput {
    @inline
    def apply(
        InstanceTypes: js.UndefOr[InstanceTypeListDefinition] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        OutpostArn: js.UndefOr[OutpostArn] = js.undefined,
        OutpostId: js.UndefOr[OutpostId] = js.undefined
    ): GetOutpostInstanceTypesOutput = {
      val __obj = js.Dynamic.literal()
      InstanceTypes.foreach(__v => __obj.updateDynamic("InstanceTypes")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OutpostArn.foreach(__v => __obj.updateDynamic("OutpostArn")(__v.asInstanceOf[js.Any]))
      OutpostId.foreach(__v => __obj.updateDynamic("OutpostId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOutpostInstanceTypesOutput]
    }
  }

  @js.native
  trait GetOutpostOutput extends js.Object {
    var Outpost: js.UndefOr[Outpost]
  }

  object GetOutpostOutput {
    @inline
    def apply(
        Outpost: js.UndefOr[Outpost] = js.undefined
    ): GetOutpostOutput = {
      val __obj = js.Dynamic.literal()
      Outpost.foreach(__v => __obj.updateDynamic("Outpost")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOutpostOutput]
    }
  }

  /** Information about an instance type.
    */
  @js.native
  trait InstanceTypeItem extends js.Object {
    var InstanceType: js.UndefOr[InstanceType]
  }

  object InstanceTypeItem {
    @inline
    def apply(
        InstanceType: js.UndefOr[InstanceType] = js.undefined
    ): InstanceTypeItem = {
      val __obj = js.Dynamic.literal()
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceTypeItem]
    }
  }

  @js.native
  trait ListOutpostsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults1000]
    var NextToken: js.UndefOr[Token]
  }

  object ListOutpostsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults1000] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListOutpostsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOutpostsInput]
    }
  }

  @js.native
  trait ListOutpostsOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Outposts: js.UndefOr[outpostListDefinition]
  }

  object ListOutpostsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        Outposts: js.UndefOr[outpostListDefinition] = js.undefined
    ): ListOutpostsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Outposts.foreach(__v => __obj.updateDynamic("Outposts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOutpostsOutput]
    }
  }

  @js.native
  trait ListSitesInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults1000]
    var NextToken: js.UndefOr[Token]
  }

  object ListSitesInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults1000] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListSitesInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSitesInput]
    }
  }

  @js.native
  trait ListSitesOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Sites: js.UndefOr[siteListDefinition]
  }

  object ListSitesOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        Sites: js.UndefOr[siteListDefinition] = js.undefined
    ): ListSitesOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Sites.foreach(__v => __obj.updateDynamic("Sites")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSitesOutput]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Information about an Outpost.
    */
  @js.native
  trait Outpost extends js.Object {
    var AvailabilityZone: js.UndefOr[AvailabilityZone]
    var AvailabilityZoneId: js.UndefOr[AvailabilityZoneId]
    var Description: js.UndefOr[OutpostDescription]
    var LifeCycleStatus: js.UndefOr[LifeCycleStatus]
    var Name: js.UndefOr[OutpostName]
    var OutpostArn: js.UndefOr[OutpostArn]
    var OutpostId: js.UndefOr[OutpostId]
    var OwnerId: js.UndefOr[OwnerId]
    var SiteId: js.UndefOr[SiteId]
    var Tags: js.UndefOr[TagMap]
  }

  object Outpost {
    @inline
    def apply(
        AvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
        AvailabilityZoneId: js.UndefOr[AvailabilityZoneId] = js.undefined,
        Description: js.UndefOr[OutpostDescription] = js.undefined,
        LifeCycleStatus: js.UndefOr[LifeCycleStatus] = js.undefined,
        Name: js.UndefOr[OutpostName] = js.undefined,
        OutpostArn: js.UndefOr[OutpostArn] = js.undefined,
        OutpostId: js.UndefOr[OutpostId] = js.undefined,
        OwnerId: js.UndefOr[OwnerId] = js.undefined,
        SiteId: js.UndefOr[SiteId] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): Outpost = {
      val __obj = js.Dynamic.literal()
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      AvailabilityZoneId.foreach(__v => __obj.updateDynamic("AvailabilityZoneId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LifeCycleStatus.foreach(__v => __obj.updateDynamic("LifeCycleStatus")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OutpostArn.foreach(__v => __obj.updateDynamic("OutpostArn")(__v.asInstanceOf[js.Any]))
      OutpostId.foreach(__v => __obj.updateDynamic("OutpostId")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      SiteId.foreach(__v => __obj.updateDynamic("SiteId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Outpost]
    }
  }

  /** Information about a site.
    */
  @js.native
  trait Site extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var Description: js.UndefOr[SiteDescription]
    var Name: js.UndefOr[SiteName]
    var SiteId: js.UndefOr[SiteId]
    var Tags: js.UndefOr[TagMap]
  }

  object Site {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        Description: js.UndefOr[SiteDescription] = js.undefined,
        Name: js.UndefOr[SiteName] = js.undefined,
        SiteId: js.UndefOr[SiteId] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): Site = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SiteId.foreach(__v => __obj.updateDynamic("SiteId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Site]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        Tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }
}
