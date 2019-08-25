package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object snowball {
  type AddressId                  = String
  type AddressList                = js.Array[Address]
  type AmiId                      = String
  type ClusterId                  = String
  type ClusterListEntryList       = js.Array[ClusterListEntry]
  type ClusterState               = String
  type CompatibleImageList        = js.Array[CompatibleImage]
  type Ec2AmiResourceList         = js.Array[Ec2AmiResource]
  type EventTriggerDefinitionList = js.Array[EventTriggerDefinition]
  type JobId                      = String
  type JobListEntryList           = js.Array[JobListEntry]
  type JobMetadataList            = js.Array[JobMetadata]
  type JobState                   = String
  type JobStateList               = js.Array[JobState]
  type JobType                    = String
  type KmsKeyARN                  = String
  type LambdaResourceList         = js.Array[LambdaResource]
  type ListLimit                  = Int
  type ResourceARN                = String
  type RoleARN                    = String
  type S3ResourceList             = js.Array[S3Resource]
  type ShippingOption             = String
  type SnowballCapacity           = String
  type SnowballType               = String
  type SnsTopicARN                = String
  type Timestamp                  = js.Date

  implicit final class SnowballOps(val service: Snowball) extends AnyVal {

    def cancelClusterFuture(params: CancelClusterRequest): Future[CancelClusterResult] =
      service.cancelCluster(params).promise.toFuture
    def cancelJobFuture(params: CancelJobRequest): Future[CancelJobResult] = service.cancelJob(params).promise.toFuture
    def createAddressFuture(params: CreateAddressRequest): Future[CreateAddressResult] =
      service.createAddress(params).promise.toFuture
    def createClusterFuture(params: CreateClusterRequest): Future[CreateClusterResult] =
      service.createCluster(params).promise.toFuture
    def createJobFuture(params: CreateJobRequest): Future[CreateJobResult] = service.createJob(params).promise.toFuture
    def describeAddressFuture(params: DescribeAddressRequest): Future[DescribeAddressResult] =
      service.describeAddress(params).promise.toFuture
    def describeAddressesFuture(params: DescribeAddressesRequest): Future[DescribeAddressesResult] =
      service.describeAddresses(params).promise.toFuture
    def describeClusterFuture(params: DescribeClusterRequest): Future[DescribeClusterResult] =
      service.describeCluster(params).promise.toFuture
    def describeJobFuture(params: DescribeJobRequest): Future[DescribeJobResult] =
      service.describeJob(params).promise.toFuture
    def getJobManifestFuture(params: GetJobManifestRequest): Future[GetJobManifestResult] =
      service.getJobManifest(params).promise.toFuture
    def getJobUnlockCodeFuture(params: GetJobUnlockCodeRequest): Future[GetJobUnlockCodeResult] =
      service.getJobUnlockCode(params).promise.toFuture
    def getSnowballUsageFuture(params: GetSnowballUsageRequest): Future[GetSnowballUsageResult] =
      service.getSnowballUsage(params).promise.toFuture
    def listClusterJobsFuture(params: ListClusterJobsRequest): Future[ListClusterJobsResult] =
      service.listClusterJobs(params).promise.toFuture
    def listClustersFuture(params: ListClustersRequest): Future[ListClustersResult] =
      service.listClusters(params).promise.toFuture
    def listCompatibleImagesFuture(params: ListCompatibleImagesRequest): Future[ListCompatibleImagesResult] =
      service.listCompatibleImages(params).promise.toFuture
    def listJobsFuture(params: ListJobsRequest): Future[ListJobsResult] = service.listJobs(params).promise.toFuture
    def updateClusterFuture(params: UpdateClusterRequest): Future[UpdateClusterResult] =
      service.updateCluster(params).promise.toFuture
    def updateJobFuture(params: UpdateJobRequest): Future[UpdateJobResult] = service.updateJob(params).promise.toFuture
  }
}

package snowball {
  @js.native
  @JSImport("aws-sdk", "Snowball")
  class Snowball() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelCluster(params: CancelClusterRequest): Request[CancelClusterResult]                      = js.native
    def cancelJob(params: CancelJobRequest): Request[CancelJobResult]                                  = js.native
    def createAddress(params: CreateAddressRequest): Request[CreateAddressResult]                      = js.native
    def createCluster(params: CreateClusterRequest): Request[CreateClusterResult]                      = js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResult]                                  = js.native
    def describeAddress(params: DescribeAddressRequest): Request[DescribeAddressResult]                = js.native
    def describeAddresses(params: DescribeAddressesRequest): Request[DescribeAddressesResult]          = js.native
    def describeCluster(params: DescribeClusterRequest): Request[DescribeClusterResult]                = js.native
    def describeJob(params: DescribeJobRequest): Request[DescribeJobResult]                            = js.native
    def getJobManifest(params: GetJobManifestRequest): Request[GetJobManifestResult]                   = js.native
    def getJobUnlockCode(params: GetJobUnlockCodeRequest): Request[GetJobUnlockCodeResult]             = js.native
    def getSnowballUsage(params: GetSnowballUsageRequest): Request[GetSnowballUsageResult]             = js.native
    def listClusterJobs(params: ListClusterJobsRequest): Request[ListClusterJobsResult]                = js.native
    def listClusters(params: ListClustersRequest): Request[ListClustersResult]                         = js.native
    def listCompatibleImages(params: ListCompatibleImagesRequest): Request[ListCompatibleImagesResult] = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResult]                                     = js.native
    def updateCluster(params: UpdateClusterRequest): Request[UpdateClusterResult]                      = js.native
    def updateJob(params: UpdateJobRequest): Request[UpdateJobResult]                                  = js.native
  }

  /**
    * The address that you want the Snowball or Snowballs associated with a specific job to be shipped to. Addresses are validated at the time of creation. The address you provide must be located within the serviceable area of your region. Although no individual elements of the <code>Address</code> are required, if the address is invalid or unsupported, then an exception is thrown.
    */
  @js.native
  trait Address extends js.Object {
    var AddressId: js.UndefOr[AddressId]
    var City: js.UndefOr[String]
    var Company: js.UndefOr[String]
    var Country: js.UndefOr[String]
    var IsRestricted: js.UndefOr[Boolean]
    var Landmark: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var PhoneNumber: js.UndefOr[String]
    var PostalCode: js.UndefOr[String]
    var PrefectureOrDistrict: js.UndefOr[String]
    var StateOrProvince: js.UndefOr[String]
    var Street1: js.UndefOr[String]
    var Street2: js.UndefOr[String]
    var Street3: js.UndefOr[String]
  }

  object Address {
    def apply(
        AddressId: js.UndefOr[AddressId] = js.undefined,
        City: js.UndefOr[String] = js.undefined,
        Company: js.UndefOr[String] = js.undefined,
        Country: js.UndefOr[String] = js.undefined,
        IsRestricted: js.UndefOr[Boolean] = js.undefined,
        Landmark: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        PhoneNumber: js.UndefOr[String] = js.undefined,
        PostalCode: js.UndefOr[String] = js.undefined,
        PrefectureOrDistrict: js.UndefOr[String] = js.undefined,
        StateOrProvince: js.UndefOr[String] = js.undefined,
        Street1: js.UndefOr[String] = js.undefined,
        Street2: js.UndefOr[String] = js.undefined,
        Street3: js.UndefOr[String] = js.undefined
    ): Address = {
      val __obj = js.Dictionary.empty[js.Any]
      AddressId.foreach(__v => __obj.update("AddressId", __v.asInstanceOf[js.Any]))
      City.foreach(__v => __obj.update("City", __v.asInstanceOf[js.Any]))
      Company.foreach(__v => __obj.update("Company", __v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.update("Country", __v.asInstanceOf[js.Any]))
      IsRestricted.foreach(__v => __obj.update("IsRestricted", __v.asInstanceOf[js.Any]))
      Landmark.foreach(__v => __obj.update("Landmark", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.update("PhoneNumber", __v.asInstanceOf[js.Any]))
      PostalCode.foreach(__v => __obj.update("PostalCode", __v.asInstanceOf[js.Any]))
      PrefectureOrDistrict.foreach(__v => __obj.update("PrefectureOrDistrict", __v.asInstanceOf[js.Any]))
      StateOrProvince.foreach(__v => __obj.update("StateOrProvince", __v.asInstanceOf[js.Any]))
      Street1.foreach(__v => __obj.update("Street1", __v.asInstanceOf[js.Any]))
      Street2.foreach(__v => __obj.update("Street2", __v.asInstanceOf[js.Any]))
      Street3.foreach(__v => __obj.update("Street3", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Address]
    }
  }

  @js.native
  trait CancelClusterRequest extends js.Object {
    var ClusterId: ClusterId
  }

  object CancelClusterRequest {
    def apply(
        ClusterId: ClusterId
    ): CancelClusterRequest = {
      val __obj = js.Dictionary[js.Any](
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelClusterRequest]
    }
  }

  @js.native
  trait CancelClusterResult extends js.Object {}

  object CancelClusterResult {
    def apply(
        ): CancelClusterResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CancelClusterResult]
    }
  }

  @js.native
  trait CancelJobRequest extends js.Object {
    var JobId: JobId
  }

  object CancelJobRequest {
    def apply(
        JobId: JobId
    ): CancelJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelJobRequest]
    }
  }

  @js.native
  trait CancelJobResult extends js.Object {}

  object CancelJobResult {
    def apply(
        ): CancelJobResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CancelJobResult]
    }
  }

  /**
    * Contains a cluster's state, a cluster's ID, and other important information.
    */
  @js.native
  trait ClusterListEntry extends js.Object {
    var ClusterId: js.UndefOr[String]
    var ClusterState: js.UndefOr[ClusterState]
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[String]
  }

  object ClusterListEntry {
    def apply(
        ClusterId: js.UndefOr[String] = js.undefined,
        ClusterState: js.UndefOr[ClusterState] = js.undefined,
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[String] = js.undefined
    ): ClusterListEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      ClusterId.foreach(__v => __obj.update("ClusterId", __v.asInstanceOf[js.Any]))
      ClusterState.foreach(__v => __obj.update("ClusterState", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterListEntry]
    }
  }

  /**
    * Contains metadata about a specific cluster.
    */
  @js.native
  trait ClusterMetadata extends js.Object {
    var AddressId: js.UndefOr[AddressId]
    var ClusterId: js.UndefOr[String]
    var ClusterState: js.UndefOr[ClusterState]
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[String]
    var ForwardingAddressId: js.UndefOr[AddressId]
    var JobType: js.UndefOr[JobType]
    var KmsKeyARN: js.UndefOr[KmsKeyARN]
    var Notification: js.UndefOr[Notification]
    var Resources: js.UndefOr[JobResource]
    var RoleARN: js.UndefOr[RoleARN]
    var ShippingOption: js.UndefOr[ShippingOption]
    var SnowballType: js.UndefOr[SnowballType]
  }

  object ClusterMetadata {
    def apply(
        AddressId: js.UndefOr[AddressId] = js.undefined,
        ClusterId: js.UndefOr[String] = js.undefined,
        ClusterState: js.UndefOr[ClusterState] = js.undefined,
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        ForwardingAddressId: js.UndefOr[AddressId] = js.undefined,
        JobType: js.UndefOr[JobType] = js.undefined,
        KmsKeyARN: js.UndefOr[KmsKeyARN] = js.undefined,
        Notification: js.UndefOr[Notification] = js.undefined,
        Resources: js.UndefOr[JobResource] = js.undefined,
        RoleARN: js.UndefOr[RoleARN] = js.undefined,
        ShippingOption: js.UndefOr[ShippingOption] = js.undefined,
        SnowballType: js.UndefOr[SnowballType] = js.undefined
    ): ClusterMetadata = {
      val __obj = js.Dictionary.empty[js.Any]
      AddressId.foreach(__v => __obj.update("AddressId", __v.asInstanceOf[js.Any]))
      ClusterId.foreach(__v => __obj.update("ClusterId", __v.asInstanceOf[js.Any]))
      ClusterState.foreach(__v => __obj.update("ClusterState", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ForwardingAddressId.foreach(__v => __obj.update("ForwardingAddressId", __v.asInstanceOf[js.Any]))
      JobType.foreach(__v => __obj.update("JobType", __v.asInstanceOf[js.Any]))
      KmsKeyARN.foreach(__v => __obj.update("KmsKeyARN", __v.asInstanceOf[js.Any]))
      Notification.foreach(__v => __obj.update("Notification", __v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.update("Resources", __v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.update("RoleARN", __v.asInstanceOf[js.Any]))
      ShippingOption.foreach(__v => __obj.update("ShippingOption", __v.asInstanceOf[js.Any]))
      SnowballType.foreach(__v => __obj.update("SnowballType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterMetadata]
    }
  }

  object ClusterStateEnum {
    val AwaitingQuorum = "AwaitingQuorum"
    val Pending        = "Pending"
    val InUse          = "InUse"
    val Complete       = "Complete"
    val Cancelled      = "Cancelled"

    val values = IndexedSeq(AwaitingQuorum, Pending, InUse, Complete, Cancelled)
  }

  /**
    * A JSON-formatted object that describes a compatible Amazon Machine Image (AMI). For more information on compatible AMIs, see [[http://docs.aws.amazon.com/snowball/latest/developer-guide/using-ec2.html|Using Amazon EC2 Compute Instances]] in the <i>AWS Snowball Developer Guide</i>.
    */
  @js.native
  trait CompatibleImage extends js.Object {
    var AmiId: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  object CompatibleImage {
    def apply(
        AmiId: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined
    ): CompatibleImage = {
      val __obj = js.Dictionary.empty[js.Any]
      AmiId.foreach(__v => __obj.update("AmiId", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompatibleImage]
    }
  }

  @js.native
  trait CreateAddressRequest extends js.Object {
    var Address: Address
  }

  object CreateAddressRequest {
    def apply(
        Address: Address
    ): CreateAddressRequest = {
      val __obj = js.Dictionary[js.Any](
        "Address" -> Address.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateAddressRequest]
    }
  }

  @js.native
  trait CreateAddressResult extends js.Object {
    var AddressId: js.UndefOr[String]
  }

  object CreateAddressResult {
    def apply(
        AddressId: js.UndefOr[String] = js.undefined
    ): CreateAddressResult = {
      val __obj = js.Dictionary.empty[js.Any]
      AddressId.foreach(__v => __obj.update("AddressId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAddressResult]
    }
  }

  @js.native
  trait CreateClusterRequest extends js.Object {
    var AddressId: AddressId
    var JobType: JobType
    var Resources: JobResource
    var RoleARN: RoleARN
    var ShippingOption: ShippingOption
    var Description: js.UndefOr[String]
    var ForwardingAddressId: js.UndefOr[AddressId]
    var KmsKeyARN: js.UndefOr[KmsKeyARN]
    var Notification: js.UndefOr[Notification]
    var SnowballType: js.UndefOr[SnowballType]
  }

  object CreateClusterRequest {
    def apply(
        AddressId: AddressId,
        JobType: JobType,
        Resources: JobResource,
        RoleARN: RoleARN,
        ShippingOption: ShippingOption,
        Description: js.UndefOr[String] = js.undefined,
        ForwardingAddressId: js.UndefOr[AddressId] = js.undefined,
        KmsKeyARN: js.UndefOr[KmsKeyARN] = js.undefined,
        Notification: js.UndefOr[Notification] = js.undefined,
        SnowballType: js.UndefOr[SnowballType] = js.undefined
    ): CreateClusterRequest = {
      val __obj = js.Dictionary[js.Any](
        "AddressId"      -> AddressId.asInstanceOf[js.Any],
        "JobType"        -> JobType.asInstanceOf[js.Any],
        "Resources"      -> Resources.asInstanceOf[js.Any],
        "RoleARN"        -> RoleARN.asInstanceOf[js.Any],
        "ShippingOption" -> ShippingOption.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ForwardingAddressId.foreach(__v => __obj.update("ForwardingAddressId", __v.asInstanceOf[js.Any]))
      KmsKeyARN.foreach(__v => __obj.update("KmsKeyARN", __v.asInstanceOf[js.Any]))
      Notification.foreach(__v => __obj.update("Notification", __v.asInstanceOf[js.Any]))
      SnowballType.foreach(__v => __obj.update("SnowballType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterRequest]
    }
  }

  @js.native
  trait CreateClusterResult extends js.Object {
    var ClusterId: js.UndefOr[ClusterId]
  }

  object CreateClusterResult {
    def apply(
        ClusterId: js.UndefOr[ClusterId] = js.undefined
    ): CreateClusterResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ClusterId.foreach(__v => __obj.update("ClusterId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterResult]
    }
  }

  @js.native
  trait CreateJobRequest extends js.Object {
    var AddressId: js.UndefOr[AddressId]
    var ClusterId: js.UndefOr[ClusterId]
    var Description: js.UndefOr[String]
    var ForwardingAddressId: js.UndefOr[AddressId]
    var JobType: js.UndefOr[JobType]
    var KmsKeyARN: js.UndefOr[KmsKeyARN]
    var Notification: js.UndefOr[Notification]
    var Resources: js.UndefOr[JobResource]
    var RoleARN: js.UndefOr[RoleARN]
    var ShippingOption: js.UndefOr[ShippingOption]
    var SnowballCapacityPreference: js.UndefOr[SnowballCapacity]
    var SnowballType: js.UndefOr[SnowballType]
  }

  object CreateJobRequest {
    def apply(
        AddressId: js.UndefOr[AddressId] = js.undefined,
        ClusterId: js.UndefOr[ClusterId] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        ForwardingAddressId: js.UndefOr[AddressId] = js.undefined,
        JobType: js.UndefOr[JobType] = js.undefined,
        KmsKeyARN: js.UndefOr[KmsKeyARN] = js.undefined,
        Notification: js.UndefOr[Notification] = js.undefined,
        Resources: js.UndefOr[JobResource] = js.undefined,
        RoleARN: js.UndefOr[RoleARN] = js.undefined,
        ShippingOption: js.UndefOr[ShippingOption] = js.undefined,
        SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.undefined,
        SnowballType: js.UndefOr[SnowballType] = js.undefined
    ): CreateJobRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      AddressId.foreach(__v => __obj.update("AddressId", __v.asInstanceOf[js.Any]))
      ClusterId.foreach(__v => __obj.update("ClusterId", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ForwardingAddressId.foreach(__v => __obj.update("ForwardingAddressId", __v.asInstanceOf[js.Any]))
      JobType.foreach(__v => __obj.update("JobType", __v.asInstanceOf[js.Any]))
      KmsKeyARN.foreach(__v => __obj.update("KmsKeyARN", __v.asInstanceOf[js.Any]))
      Notification.foreach(__v => __obj.update("Notification", __v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.update("Resources", __v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.update("RoleARN", __v.asInstanceOf[js.Any]))
      ShippingOption.foreach(__v => __obj.update("ShippingOption", __v.asInstanceOf[js.Any]))
      SnowballCapacityPreference.foreach(__v => __obj.update("SnowballCapacityPreference", __v.asInstanceOf[js.Any]))
      SnowballType.foreach(__v => __obj.update("SnowballType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobRequest]
    }
  }

  @js.native
  trait CreateJobResult extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object CreateJobResult {
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): CreateJobResult = {
      val __obj = js.Dictionary.empty[js.Any]
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobResult]
    }
  }

  /**
    * Defines the real-time status of a Snowball's data transfer while the device is at AWS. This data is only available while a job has a <code>JobState</code> value of <code>InProgress</code>, for both import and export jobs.
    */
  @js.native
  trait DataTransfer extends js.Object {
    var BytesTransferred: js.UndefOr[Double]
    var ObjectsTransferred: js.UndefOr[Double]
    var TotalBytes: js.UndefOr[Double]
    var TotalObjects: js.UndefOr[Double]
  }

  object DataTransfer {
    def apply(
        BytesTransferred: js.UndefOr[Double] = js.undefined,
        ObjectsTransferred: js.UndefOr[Double] = js.undefined,
        TotalBytes: js.UndefOr[Double] = js.undefined,
        TotalObjects: js.UndefOr[Double] = js.undefined
    ): DataTransfer = {
      val __obj = js.Dictionary.empty[js.Any]
      BytesTransferred.foreach(__v => __obj.update("BytesTransferred", __v.asInstanceOf[js.Any]))
      ObjectsTransferred.foreach(__v => __obj.update("ObjectsTransferred", __v.asInstanceOf[js.Any]))
      TotalBytes.foreach(__v => __obj.update("TotalBytes", __v.asInstanceOf[js.Any]))
      TotalObjects.foreach(__v => __obj.update("TotalObjects", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataTransfer]
    }
  }

  @js.native
  trait DescribeAddressRequest extends js.Object {
    var AddressId: AddressId
  }

  object DescribeAddressRequest {
    def apply(
        AddressId: AddressId
    ): DescribeAddressRequest = {
      val __obj = js.Dictionary[js.Any](
        "AddressId" -> AddressId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeAddressRequest]
    }
  }

  @js.native
  trait DescribeAddressResult extends js.Object {
    var Address: js.UndefOr[Address]
  }

  object DescribeAddressResult {
    def apply(
        Address: js.UndefOr[Address] = js.undefined
    ): DescribeAddressResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Address.foreach(__v => __obj.update("Address", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAddressResult]
    }
  }

  @js.native
  trait DescribeAddressesRequest extends js.Object {
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[String]
  }

  object DescribeAddressesRequest {
    def apply(
        MaxResults: js.UndefOr[ListLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeAddressesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAddressesRequest]
    }
  }

  @js.native
  trait DescribeAddressesResult extends js.Object {
    var Addresses: js.UndefOr[AddressList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeAddressesResult {
    def apply(
        Addresses: js.UndefOr[AddressList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeAddressesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Addresses.foreach(__v => __obj.update("Addresses", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAddressesResult]
    }
  }

  @js.native
  trait DescribeClusterRequest extends js.Object {
    var ClusterId: ClusterId
  }

  object DescribeClusterRequest {
    def apply(
        ClusterId: ClusterId
    ): DescribeClusterRequest = {
      val __obj = js.Dictionary[js.Any](
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeClusterRequest]
    }
  }

  @js.native
  trait DescribeClusterResult extends js.Object {
    var ClusterMetadata: js.UndefOr[ClusterMetadata]
  }

  object DescribeClusterResult {
    def apply(
        ClusterMetadata: js.UndefOr[ClusterMetadata] = js.undefined
    ): DescribeClusterResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ClusterMetadata.foreach(__v => __obj.update("ClusterMetadata", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClusterResult]
    }
  }

  @js.native
  trait DescribeJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeJobRequest {
    def apply(
        JobId: JobId
    ): DescribeJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeJobRequest]
    }
  }

  @js.native
  trait DescribeJobResult extends js.Object {
    var JobMetadata: js.UndefOr[JobMetadata]
    var SubJobMetadata: js.UndefOr[JobMetadataList]
  }

  object DescribeJobResult {
    def apply(
        JobMetadata: js.UndefOr[JobMetadata] = js.undefined,
        SubJobMetadata: js.UndefOr[JobMetadataList] = js.undefined
    ): DescribeJobResult = {
      val __obj = js.Dictionary.empty[js.Any]
      JobMetadata.foreach(__v => __obj.update("JobMetadata", __v.asInstanceOf[js.Any]))
      SubJobMetadata.foreach(__v => __obj.update("SubJobMetadata", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobResult]
    }
  }

  /**
    * A JSON-formatted object that contains the IDs for an Amazon Machine Image (AMI), including the Amazon EC2 AMI ID and the Snowball Edge AMI ID. Each AMI has these two IDs to simplify identifying the AMI in both the AWS Cloud and on the device.
    */
  @js.native
  trait Ec2AmiResource extends js.Object {
    var AmiId: AmiId
    var SnowballAmiId: js.UndefOr[String]
  }

  object Ec2AmiResource {
    def apply(
        AmiId: AmiId,
        SnowballAmiId: js.UndefOr[String] = js.undefined
    ): Ec2AmiResource = {
      val __obj = js.Dictionary[js.Any](
        "AmiId" -> AmiId.asInstanceOf[js.Any]
      )

      SnowballAmiId.foreach(__v => __obj.update("SnowballAmiId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Ec2AmiResource]
    }
  }

  /**
    * The container for the EventResourceARN.
    */
  @js.native
  trait EventTriggerDefinition extends js.Object {
    var EventResourceARN: js.UndefOr[ResourceARN]
  }

  object EventTriggerDefinition {
    def apply(
        EventResourceARN: js.UndefOr[ResourceARN] = js.undefined
    ): EventTriggerDefinition = {
      val __obj = js.Dictionary.empty[js.Any]
      EventResourceARN.foreach(__v => __obj.update("EventResourceARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventTriggerDefinition]
    }
  }

  @js.native
  trait GetJobManifestRequest extends js.Object {
    var JobId: JobId
  }

  object GetJobManifestRequest {
    def apply(
        JobId: JobId
    ): GetJobManifestRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetJobManifestRequest]
    }
  }

  @js.native
  trait GetJobManifestResult extends js.Object {
    var ManifestURI: js.UndefOr[String]
  }

  object GetJobManifestResult {
    def apply(
        ManifestURI: js.UndefOr[String] = js.undefined
    ): GetJobManifestResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ManifestURI.foreach(__v => __obj.update("ManifestURI", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobManifestResult]
    }
  }

  @js.native
  trait GetJobUnlockCodeRequest extends js.Object {
    var JobId: JobId
  }

  object GetJobUnlockCodeRequest {
    def apply(
        JobId: JobId
    ): GetJobUnlockCodeRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetJobUnlockCodeRequest]
    }
  }

  @js.native
  trait GetJobUnlockCodeResult extends js.Object {
    var UnlockCode: js.UndefOr[String]
  }

  object GetJobUnlockCodeResult {
    def apply(
        UnlockCode: js.UndefOr[String] = js.undefined
    ): GetJobUnlockCodeResult = {
      val __obj = js.Dictionary.empty[js.Any]
      UnlockCode.foreach(__v => __obj.update("UnlockCode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobUnlockCodeResult]
    }
  }

  @js.native
  trait GetSnowballUsageRequest extends js.Object {}

  object GetSnowballUsageRequest {
    def apply(
        ): GetSnowballUsageRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[GetSnowballUsageRequest]
    }
  }

  @js.native
  trait GetSnowballUsageResult extends js.Object {
    var SnowballLimit: js.UndefOr[Int]
    var SnowballsInUse: js.UndefOr[Int]
  }

  object GetSnowballUsageResult {
    def apply(
        SnowballLimit: js.UndefOr[Int] = js.undefined,
        SnowballsInUse: js.UndefOr[Int] = js.undefined
    ): GetSnowballUsageResult = {
      val __obj = js.Dictionary.empty[js.Any]
      SnowballLimit.foreach(__v => __obj.update("SnowballLimit", __v.asInstanceOf[js.Any]))
      SnowballsInUse.foreach(__v => __obj.update("SnowballsInUse", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSnowballUsageResult]
    }
  }

  /**
    * Each <code>JobListEntry</code> object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of an export job.
    */
  @js.native
  trait JobListEntry extends js.Object {
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[String]
    var IsMaster: js.UndefOr[Boolean]
    var JobId: js.UndefOr[String]
    var JobState: js.UndefOr[JobState]
    var JobType: js.UndefOr[JobType]
    var SnowballType: js.UndefOr[SnowballType]
  }

  object JobListEntry {
    def apply(
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        IsMaster: js.UndefOr[Boolean] = js.undefined,
        JobId: js.UndefOr[String] = js.undefined,
        JobState: js.UndefOr[JobState] = js.undefined,
        JobType: js.UndefOr[JobType] = js.undefined,
        SnowballType: js.UndefOr[SnowballType] = js.undefined
    ): JobListEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      IsMaster.foreach(__v => __obj.update("IsMaster", __v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      JobState.foreach(__v => __obj.update("JobState", __v.asInstanceOf[js.Any]))
      JobType.foreach(__v => __obj.update("JobType", __v.asInstanceOf[js.Any]))
      SnowballType.foreach(__v => __obj.update("SnowballType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobListEntry]
    }
  }

  /**
    * Contains job logs. Whenever Snowball is used to import data into or export data out of Amazon S3, you'll have the option of downloading a PDF job report. Job logs are returned as a part of the response syntax of the <code>DescribeJob</code> action in the <code>JobMetadata</code> data type. The job logs can be accessed for up to 60 minutes after this request has been made. To access any of the job logs after 60 minutes have passed, you'll have to make another call to the <code>DescribeJob</code> action.
    *  For import jobs, the PDF job report becomes available at the end of the import process. For export jobs, your job report typically becomes available while the Snowball for your job part is being delivered to you.
    *  The job report provides you insight into the state of your Amazon S3 data transfer. The report includes details about your job or job part for your records.
    *  For deeper visibility into the status of your transferred objects, you can look at the two associated logs: a success log and a failure log. The logs are saved in comma-separated value (CSV) format, and the name of each log includes the ID of the job or job part that the log describes.
    */
  @js.native
  trait JobLogs extends js.Object {
    var JobCompletionReportURI: js.UndefOr[String]
    var JobFailureLogURI: js.UndefOr[String]
    var JobSuccessLogURI: js.UndefOr[String]
  }

  object JobLogs {
    def apply(
        JobCompletionReportURI: js.UndefOr[String] = js.undefined,
        JobFailureLogURI: js.UndefOr[String] = js.undefined,
        JobSuccessLogURI: js.UndefOr[String] = js.undefined
    ): JobLogs = {
      val __obj = js.Dictionary.empty[js.Any]
      JobCompletionReportURI.foreach(__v => __obj.update("JobCompletionReportURI", __v.asInstanceOf[js.Any]))
      JobFailureLogURI.foreach(__v => __obj.update("JobFailureLogURI", __v.asInstanceOf[js.Any]))
      JobSuccessLogURI.foreach(__v => __obj.update("JobSuccessLogURI", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobLogs]
    }
  }

  /**
    * Contains information about a specific job including shipping information, job status, and other important metadata. This information is returned as a part of the response syntax of the <code>DescribeJob</code> action.
    */
  @js.native
  trait JobMetadata extends js.Object {
    var AddressId: js.UndefOr[AddressId]
    var ClusterId: js.UndefOr[String]
    var CreationDate: js.UndefOr[Timestamp]
    var DataTransferProgress: js.UndefOr[DataTransfer]
    var Description: js.UndefOr[String]
    var ForwardingAddressId: js.UndefOr[AddressId]
    var JobId: js.UndefOr[String]
    var JobLogInfo: js.UndefOr[JobLogs]
    var JobState: js.UndefOr[JobState]
    var JobType: js.UndefOr[JobType]
    var KmsKeyARN: js.UndefOr[KmsKeyARN]
    var Notification: js.UndefOr[Notification]
    var Resources: js.UndefOr[JobResource]
    var RoleARN: js.UndefOr[RoleARN]
    var ShippingDetails: js.UndefOr[ShippingDetails]
    var SnowballCapacityPreference: js.UndefOr[SnowballCapacity]
    var SnowballType: js.UndefOr[SnowballType]
  }

  object JobMetadata {
    def apply(
        AddressId: js.UndefOr[AddressId] = js.undefined,
        ClusterId: js.UndefOr[String] = js.undefined,
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        DataTransferProgress: js.UndefOr[DataTransfer] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        ForwardingAddressId: js.UndefOr[AddressId] = js.undefined,
        JobId: js.UndefOr[String] = js.undefined,
        JobLogInfo: js.UndefOr[JobLogs] = js.undefined,
        JobState: js.UndefOr[JobState] = js.undefined,
        JobType: js.UndefOr[JobType] = js.undefined,
        KmsKeyARN: js.UndefOr[KmsKeyARN] = js.undefined,
        Notification: js.UndefOr[Notification] = js.undefined,
        Resources: js.UndefOr[JobResource] = js.undefined,
        RoleARN: js.UndefOr[RoleARN] = js.undefined,
        ShippingDetails: js.UndefOr[ShippingDetails] = js.undefined,
        SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.undefined,
        SnowballType: js.UndefOr[SnowballType] = js.undefined
    ): JobMetadata = {
      val __obj = js.Dictionary.empty[js.Any]
      AddressId.foreach(__v => __obj.update("AddressId", __v.asInstanceOf[js.Any]))
      ClusterId.foreach(__v => __obj.update("ClusterId", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      DataTransferProgress.foreach(__v => __obj.update("DataTransferProgress", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ForwardingAddressId.foreach(__v => __obj.update("ForwardingAddressId", __v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      JobLogInfo.foreach(__v => __obj.update("JobLogInfo", __v.asInstanceOf[js.Any]))
      JobState.foreach(__v => __obj.update("JobState", __v.asInstanceOf[js.Any]))
      JobType.foreach(__v => __obj.update("JobType", __v.asInstanceOf[js.Any]))
      KmsKeyARN.foreach(__v => __obj.update("KmsKeyARN", __v.asInstanceOf[js.Any]))
      Notification.foreach(__v => __obj.update("Notification", __v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.update("Resources", __v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.update("RoleARN", __v.asInstanceOf[js.Any]))
      ShippingDetails.foreach(__v => __obj.update("ShippingDetails", __v.asInstanceOf[js.Any]))
      SnowballCapacityPreference.foreach(__v => __obj.update("SnowballCapacityPreference", __v.asInstanceOf[js.Any]))
      SnowballType.foreach(__v => __obj.update("SnowballType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobMetadata]
    }
  }

  /**
    * Contains an array of AWS resource objects. Each object represents an Amazon S3 bucket, an AWS Lambda function, or an Amazon Machine Image (AMI) based on Amazon EC2 that is associated with a particular job.
    */
  @js.native
  trait JobResource extends js.Object {
    var Ec2AmiResources: js.UndefOr[Ec2AmiResourceList]
    var LambdaResources: js.UndefOr[LambdaResourceList]
    var S3Resources: js.UndefOr[S3ResourceList]
  }

  object JobResource {
    def apply(
        Ec2AmiResources: js.UndefOr[Ec2AmiResourceList] = js.undefined,
        LambdaResources: js.UndefOr[LambdaResourceList] = js.undefined,
        S3Resources: js.UndefOr[S3ResourceList] = js.undefined
    ): JobResource = {
      val __obj = js.Dictionary.empty[js.Any]
      Ec2AmiResources.foreach(__v => __obj.update("Ec2AmiResources", __v.asInstanceOf[js.Any]))
      LambdaResources.foreach(__v => __obj.update("LambdaResources", __v.asInstanceOf[js.Any]))
      S3Resources.foreach(__v => __obj.update("S3Resources", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobResource]
    }
  }

  object JobStateEnum {
    val New                    = "New"
    val PreparingAppliance     = "PreparingAppliance"
    val PreparingShipment      = "PreparingShipment"
    val InTransitToCustomer    = "InTransitToCustomer"
    val WithCustomer           = "WithCustomer"
    val InTransitToAWS         = "InTransitToAWS"
    val WithAWSSortingFacility = "WithAWSSortingFacility"
    val WithAWS                = "WithAWS"
    val InProgress             = "InProgress"
    val Complete               = "Complete"
    val Cancelled              = "Cancelled"
    val Listing                = "Listing"
    val Pending                = "Pending"

    val values = IndexedSeq(
      New,
      PreparingAppliance,
      PreparingShipment,
      InTransitToCustomer,
      WithCustomer,
      InTransitToAWS,
      WithAWSSortingFacility,
      WithAWS,
      InProgress,
      Complete,
      Cancelled,
      Listing,
      Pending
    )
  }

  object JobTypeEnum {
    val IMPORT    = "IMPORT"
    val EXPORT    = "EXPORT"
    val LOCAL_USE = "LOCAL_USE"

    val values = IndexedSeq(IMPORT, EXPORT, LOCAL_USE)
  }

  /**
    * Contains a key range. For export jobs, a <code>S3Resource</code> object can have an optional <code>KeyRange</code> value. The length of the range is defined at job creation, and has either an inclusive <code>BeginMarker</code>, an inclusive <code>EndMarker</code>, or both. Ranges are UTF-8 binary sorted.
    */
  @js.native
  trait KeyRange extends js.Object {
    var BeginMarker: js.UndefOr[String]
    var EndMarker: js.UndefOr[String]
  }

  object KeyRange {
    def apply(
        BeginMarker: js.UndefOr[String] = js.undefined,
        EndMarker: js.UndefOr[String] = js.undefined
    ): KeyRange = {
      val __obj = js.Dictionary.empty[js.Any]
      BeginMarker.foreach(__v => __obj.update("BeginMarker", __v.asInstanceOf[js.Any]))
      EndMarker.foreach(__v => __obj.update("EndMarker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyRange]
    }
  }

  /**
    * Identifies
    */
  @js.native
  trait LambdaResource extends js.Object {
    var EventTriggers: js.UndefOr[EventTriggerDefinitionList]
    var LambdaArn: js.UndefOr[ResourceARN]
  }

  object LambdaResource {
    def apply(
        EventTriggers: js.UndefOr[EventTriggerDefinitionList] = js.undefined,
        LambdaArn: js.UndefOr[ResourceARN] = js.undefined
    ): LambdaResource = {
      val __obj = js.Dictionary.empty[js.Any]
      EventTriggers.foreach(__v => __obj.update("EventTriggers", __v.asInstanceOf[js.Any]))
      LambdaArn.foreach(__v => __obj.update("LambdaArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaResource]
    }
  }

  @js.native
  trait ListClusterJobsRequest extends js.Object {
    var ClusterId: ClusterId
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[String]
  }

  object ListClusterJobsRequest {
    def apply(
        ClusterId: ClusterId,
        MaxResults: js.UndefOr[ListLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListClusterJobsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClusterJobsRequest]
    }
  }

  @js.native
  trait ListClusterJobsResult extends js.Object {
    var JobListEntries: js.UndefOr[JobListEntryList]
    var NextToken: js.UndefOr[String]
  }

  object ListClusterJobsResult {
    def apply(
        JobListEntries: js.UndefOr[JobListEntryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListClusterJobsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      JobListEntries.foreach(__v => __obj.update("JobListEntries", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClusterJobsResult]
    }
  }

  @js.native
  trait ListClustersRequest extends js.Object {
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[String]
  }

  object ListClustersRequest {
    def apply(
        MaxResults: js.UndefOr[ListLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListClustersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersRequest]
    }
  }

  @js.native
  trait ListClustersResult extends js.Object {
    var ClusterListEntries: js.UndefOr[ClusterListEntryList]
    var NextToken: js.UndefOr[String]
  }

  object ListClustersResult {
    def apply(
        ClusterListEntries: js.UndefOr[ClusterListEntryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListClustersResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ClusterListEntries.foreach(__v => __obj.update("ClusterListEntries", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersResult]
    }
  }

  @js.native
  trait ListCompatibleImagesRequest extends js.Object {
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[String]
  }

  object ListCompatibleImagesRequest {
    def apply(
        MaxResults: js.UndefOr[ListLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListCompatibleImagesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCompatibleImagesRequest]
    }
  }

  @js.native
  trait ListCompatibleImagesResult extends js.Object {
    var CompatibleImages: js.UndefOr[CompatibleImageList]
    var NextToken: js.UndefOr[String]
  }

  object ListCompatibleImagesResult {
    def apply(
        CompatibleImages: js.UndefOr[CompatibleImageList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListCompatibleImagesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      CompatibleImages.foreach(__v => __obj.update("CompatibleImages", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCompatibleImagesResult]
    }
  }

  @js.native
  trait ListJobsRequest extends js.Object {
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[String]
  }

  object ListJobsRequest {
    def apply(
        MaxResults: js.UndefOr[ListLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListJobsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsRequest]
    }
  }

  @js.native
  trait ListJobsResult extends js.Object {
    var JobListEntries: js.UndefOr[JobListEntryList]
    var NextToken: js.UndefOr[String]
  }

  object ListJobsResult {
    def apply(
        JobListEntries: js.UndefOr[JobListEntryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListJobsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      JobListEntries.foreach(__v => __obj.update("JobListEntries", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsResult]
    }
  }

  /**
    * The Amazon Simple Notification Service (Amazon SNS) notification settings associated with a specific job. The <code>Notification</code> object is returned as a part of the response syntax of the <code>DescribeJob</code> action in the <code>JobMetadata</code> data type.
    *  When the notification settings are defined during job creation, you can choose to notify based on a specific set of job states using the <code>JobStatesToNotify</code> array of strings, or you can specify that you want to have Amazon SNS notifications sent out for all job states with <code>NotifyAll</code> set to true.
    */
  @js.native
  trait Notification extends js.Object {
    var JobStatesToNotify: js.UndefOr[JobStateList]
    var NotifyAll: js.UndefOr[Boolean]
    var SnsTopicARN: js.UndefOr[SnsTopicARN]
  }

  object Notification {
    def apply(
        JobStatesToNotify: js.UndefOr[JobStateList] = js.undefined,
        NotifyAll: js.UndefOr[Boolean] = js.undefined,
        SnsTopicARN: js.UndefOr[SnsTopicARN] = js.undefined
    ): Notification = {
      val __obj = js.Dictionary.empty[js.Any]
      JobStatesToNotify.foreach(__v => __obj.update("JobStatesToNotify", __v.asInstanceOf[js.Any]))
      NotifyAll.foreach(__v => __obj.update("NotifyAll", __v.asInstanceOf[js.Any]))
      SnsTopicARN.foreach(__v => __obj.update("SnsTopicARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Notification]
    }
  }

  /**
    * Each <code>S3Resource</code> object represents an Amazon S3 bucket that your transferred data will be exported from or imported into. For export jobs, this object can have an optional <code>KeyRange</code> value. The length of the range is defined at job creation, and has either an inclusive <code>BeginMarker</code>, an inclusive <code>EndMarker</code>, or both. Ranges are UTF-8 binary sorted.
    */
  @js.native
  trait S3Resource extends js.Object {
    var BucketArn: js.UndefOr[ResourceARN]
    var KeyRange: js.UndefOr[KeyRange]
  }

  object S3Resource {
    def apply(
        BucketArn: js.UndefOr[ResourceARN] = js.undefined,
        KeyRange: js.UndefOr[KeyRange] = js.undefined
    ): S3Resource = {
      val __obj = js.Dictionary.empty[js.Any]
      BucketArn.foreach(__v => __obj.update("BucketArn", __v.asInstanceOf[js.Any]))
      KeyRange.foreach(__v => __obj.update("KeyRange", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Resource]
    }
  }

  /**
    * The <code>Status</code> and <code>TrackingNumber</code> information for an inbound or outbound shipment.
    */
  @js.native
  trait Shipment extends js.Object {
    var Status: js.UndefOr[String]
    var TrackingNumber: js.UndefOr[String]
  }

  object Shipment {
    def apply(
        Status: js.UndefOr[String] = js.undefined,
        TrackingNumber: js.UndefOr[String] = js.undefined
    ): Shipment = {
      val __obj = js.Dictionary.empty[js.Any]
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      TrackingNumber.foreach(__v => __obj.update("TrackingNumber", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Shipment]
    }
  }

  /**
    * A job's shipping information, including inbound and outbound tracking numbers and shipping speed options.
    */
  @js.native
  trait ShippingDetails extends js.Object {
    var InboundShipment: js.UndefOr[Shipment]
    var OutboundShipment: js.UndefOr[Shipment]
    var ShippingOption: js.UndefOr[ShippingOption]
  }

  object ShippingDetails {
    def apply(
        InboundShipment: js.UndefOr[Shipment] = js.undefined,
        OutboundShipment: js.UndefOr[Shipment] = js.undefined,
        ShippingOption: js.UndefOr[ShippingOption] = js.undefined
    ): ShippingDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      InboundShipment.foreach(__v => __obj.update("InboundShipment", __v.asInstanceOf[js.Any]))
      OutboundShipment.foreach(__v => __obj.update("OutboundShipment", __v.asInstanceOf[js.Any]))
      ShippingOption.foreach(__v => __obj.update("ShippingOption", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShippingDetails]
    }
  }

  object ShippingOptionEnum {
    val SECOND_DAY = "SECOND_DAY"
    val NEXT_DAY   = "NEXT_DAY"
    val EXPRESS    = "EXPRESS"
    val STANDARD   = "STANDARD"

    val values = IndexedSeq(SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD)
  }

  object SnowballCapacityEnum {
    val T50          = "T50"
    val T80          = "T80"
    val T100         = "T100"
    val T42          = "T42"
    val NoPreference = "NoPreference"

    val values = IndexedSeq(T50, T80, T100, T42, NoPreference)
  }

  object SnowballTypeEnum {
    val STANDARD = "STANDARD"
    val EDGE     = "EDGE"
    val EDGE_C   = "EDGE_C"
    val EDGE_CG  = "EDGE_CG"

    val values = IndexedSeq(STANDARD, EDGE, EDGE_C, EDGE_CG)
  }

  @js.native
  trait UpdateClusterRequest extends js.Object {
    var ClusterId: ClusterId
    var AddressId: js.UndefOr[AddressId]
    var Description: js.UndefOr[String]
    var ForwardingAddressId: js.UndefOr[AddressId]
    var Notification: js.UndefOr[Notification]
    var Resources: js.UndefOr[JobResource]
    var RoleARN: js.UndefOr[RoleARN]
    var ShippingOption: js.UndefOr[ShippingOption]
  }

  object UpdateClusterRequest {
    def apply(
        ClusterId: ClusterId,
        AddressId: js.UndefOr[AddressId] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        ForwardingAddressId: js.UndefOr[AddressId] = js.undefined,
        Notification: js.UndefOr[Notification] = js.undefined,
        Resources: js.UndefOr[JobResource] = js.undefined,
        RoleARN: js.UndefOr[RoleARN] = js.undefined,
        ShippingOption: js.UndefOr[ShippingOption] = js.undefined
    ): UpdateClusterRequest = {
      val __obj = js.Dictionary[js.Any](
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]
      )

      AddressId.foreach(__v => __obj.update("AddressId", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ForwardingAddressId.foreach(__v => __obj.update("ForwardingAddressId", __v.asInstanceOf[js.Any]))
      Notification.foreach(__v => __obj.update("Notification", __v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.update("Resources", __v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.update("RoleARN", __v.asInstanceOf[js.Any]))
      ShippingOption.foreach(__v => __obj.update("ShippingOption", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateClusterRequest]
    }
  }

  @js.native
  trait UpdateClusterResult extends js.Object {}

  object UpdateClusterResult {
    def apply(
        ): UpdateClusterResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateClusterResult]
    }
  }

  @js.native
  trait UpdateJobRequest extends js.Object {
    var JobId: JobId
    var AddressId: js.UndefOr[AddressId]
    var Description: js.UndefOr[String]
    var ForwardingAddressId: js.UndefOr[AddressId]
    var Notification: js.UndefOr[Notification]
    var Resources: js.UndefOr[JobResource]
    var RoleARN: js.UndefOr[RoleARN]
    var ShippingOption: js.UndefOr[ShippingOption]
    var SnowballCapacityPreference: js.UndefOr[SnowballCapacity]
  }

  object UpdateJobRequest {
    def apply(
        JobId: JobId,
        AddressId: js.UndefOr[AddressId] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        ForwardingAddressId: js.UndefOr[AddressId] = js.undefined,
        Notification: js.UndefOr[Notification] = js.undefined,
        Resources: js.UndefOr[JobResource] = js.undefined,
        RoleARN: js.UndefOr[RoleARN] = js.undefined,
        ShippingOption: js.UndefOr[ShippingOption] = js.undefined,
        SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.undefined
    ): UpdateJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      AddressId.foreach(__v => __obj.update("AddressId", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ForwardingAddressId.foreach(__v => __obj.update("ForwardingAddressId", __v.asInstanceOf[js.Any]))
      Notification.foreach(__v => __obj.update("Notification", __v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.update("Resources", __v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.update("RoleARN", __v.asInstanceOf[js.Any]))
      ShippingOption.foreach(__v => __obj.update("ShippingOption", __v.asInstanceOf[js.Any]))
      SnowballCapacityPreference.foreach(__v => __obj.update("SnowballCapacityPreference", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateJobRequest]
    }
  }

  @js.native
  trait UpdateJobResult extends js.Object {}

  object UpdateJobResult {
    def apply(
        ): UpdateJobResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateJobResult]
    }
  }
}
