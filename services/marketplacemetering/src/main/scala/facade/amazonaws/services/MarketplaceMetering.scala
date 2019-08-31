package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object marketplacemetering {
  type CustomerIdentifier      = String
  type NonEmptyString          = String
  type Nonce                   = String
  type ProductCode             = String
  type Timestamp               = js.Date
  type UsageDimension          = String
  type UsageQuantity           = Int
  type UsageRecordList         = js.Array[UsageRecord]
  type UsageRecordResultList   = js.Array[UsageRecordResult]
  type UsageRecordResultStatus = String
  type VersionInteger          = Int

  implicit final class MarketplaceMeteringOps(private val service: MarketplaceMetering) extends AnyVal {

    def batchMeterUsageFuture(params: BatchMeterUsageRequest): Future[BatchMeterUsageResult] =
      service.batchMeterUsage(params).promise.toFuture
    def meterUsageFuture(params: MeterUsageRequest): Future[MeterUsageResult] =
      service.meterUsage(params).promise.toFuture
    def registerUsageFuture(params: RegisterUsageRequest): Future[RegisterUsageResult] =
      service.registerUsage(params).promise.toFuture
    def resolveCustomerFuture(params: ResolveCustomerRequest): Future[ResolveCustomerResult] =
      service.resolveCustomer(params).promise.toFuture
  }
}

package marketplacemetering {
  @js.native
  @JSImport("aws-sdk", "MarketplaceMetering")
  class MarketplaceMetering() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchMeterUsage(params: BatchMeterUsageRequest): Request[BatchMeterUsageResult] = js.native
    def meterUsage(params: MeterUsageRequest): Request[MeterUsageResult]                = js.native
    def registerUsage(params: RegisterUsageRequest): Request[RegisterUsageResult]       = js.native
    def resolveCustomer(params: ResolveCustomerRequest): Request[ResolveCustomerResult] = js.native
  }

  /**
    * A BatchMeterUsageRequest contains UsageRecords, which indicate quantities of usage within your application.
    */
  @js.native
  trait BatchMeterUsageRequest extends js.Object {
    var ProductCode: ProductCode
    var UsageRecords: UsageRecordList
  }

  object BatchMeterUsageRequest {
    def apply(
        ProductCode: ProductCode,
        UsageRecords: UsageRecordList
    ): BatchMeterUsageRequest = {
      val __obj = js.Dictionary[js.Any](
        "ProductCode"  -> ProductCode.asInstanceOf[js.Any],
        "UsageRecords" -> UsageRecords.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchMeterUsageRequest]
    }
  }

  /**
    * Contains the UsageRecords processed by BatchMeterUsage and any records that have failed due to transient error.
    */
  @js.native
  trait BatchMeterUsageResult extends js.Object {
    var Results: js.UndefOr[UsageRecordResultList]
    var UnprocessedRecords: js.UndefOr[UsageRecordList]
  }

  object BatchMeterUsageResult {
    def apply(
        Results: js.UndefOr[UsageRecordResultList] = js.undefined,
        UnprocessedRecords: js.UndefOr[UsageRecordList] = js.undefined
    ): BatchMeterUsageResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Results.foreach(__v => __obj.update("Results", __v.asInstanceOf[js.Any]))
      UnprocessedRecords.foreach(__v => __obj.update("UnprocessedRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchMeterUsageResult]
    }
  }

  @js.native
  trait MeterUsageRequest extends js.Object {
    var ProductCode: ProductCode
    var Timestamp: Timestamp
    var UsageDimension: UsageDimension
    var DryRun: js.UndefOr[Boolean]
    var UsageQuantity: js.UndefOr[UsageQuantity]
  }

  object MeterUsageRequest {
    def apply(
        ProductCode: ProductCode,
        Timestamp: Timestamp,
        UsageDimension: UsageDimension,
        DryRun: js.UndefOr[Boolean] = js.undefined,
        UsageQuantity: js.UndefOr[UsageQuantity] = js.undefined
    ): MeterUsageRequest = {
      val __obj = js.Dictionary[js.Any](
        "ProductCode"    -> ProductCode.asInstanceOf[js.Any],
        "Timestamp"      -> Timestamp.asInstanceOf[js.Any],
        "UsageDimension" -> UsageDimension.asInstanceOf[js.Any]
      )

      DryRun.foreach(__v => __obj.update("DryRun", __v.asInstanceOf[js.Any]))
      UsageQuantity.foreach(__v => __obj.update("UsageQuantity", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MeterUsageRequest]
    }
  }

  @js.native
  trait MeterUsageResult extends js.Object {
    var MeteringRecordId: js.UndefOr[String]
  }

  object MeterUsageResult {
    def apply(
        MeteringRecordId: js.UndefOr[String] = js.undefined
    ): MeterUsageResult = {
      val __obj = js.Dictionary.empty[js.Any]
      MeteringRecordId.foreach(__v => __obj.update("MeteringRecordId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MeterUsageResult]
    }
  }

  @js.native
  trait RegisterUsageRequest extends js.Object {
    var ProductCode: ProductCode
    var PublicKeyVersion: VersionInteger
    var Nonce: js.UndefOr[Nonce]
  }

  object RegisterUsageRequest {
    def apply(
        ProductCode: ProductCode,
        PublicKeyVersion: VersionInteger,
        Nonce: js.UndefOr[Nonce] = js.undefined
    ): RegisterUsageRequest = {
      val __obj = js.Dictionary[js.Any](
        "ProductCode"      -> ProductCode.asInstanceOf[js.Any],
        "PublicKeyVersion" -> PublicKeyVersion.asInstanceOf[js.Any]
      )

      Nonce.foreach(__v => __obj.update("Nonce", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterUsageRequest]
    }
  }

  @js.native
  trait RegisterUsageResult extends js.Object {
    var PublicKeyRotationTimestamp: js.UndefOr[Timestamp]
    var Signature: js.UndefOr[NonEmptyString]
  }

  object RegisterUsageResult {
    def apply(
        PublicKeyRotationTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Signature: js.UndefOr[NonEmptyString] = js.undefined
    ): RegisterUsageResult = {
      val __obj = js.Dictionary.empty[js.Any]
      PublicKeyRotationTimestamp.foreach(__v => __obj.update("PublicKeyRotationTimestamp", __v.asInstanceOf[js.Any]))
      Signature.foreach(__v => __obj.update("Signature", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterUsageResult]
    }
  }

  /**
    * Contains input to the ResolveCustomer operation.
    */
  @js.native
  trait ResolveCustomerRequest extends js.Object {
    var RegistrationToken: NonEmptyString
  }

  object ResolveCustomerRequest {
    def apply(
        RegistrationToken: NonEmptyString
    ): ResolveCustomerRequest = {
      val __obj = js.Dictionary[js.Any](
        "RegistrationToken" -> RegistrationToken.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResolveCustomerRequest]
    }
  }

  /**
    * The result of the ResolveCustomer operation. Contains the CustomerIdentifier and product code.
    */
  @js.native
  trait ResolveCustomerResult extends js.Object {
    var CustomerIdentifier: js.UndefOr[CustomerIdentifier]
    var ProductCode: js.UndefOr[ProductCode]
  }

  object ResolveCustomerResult {
    def apply(
        CustomerIdentifier: js.UndefOr[CustomerIdentifier] = js.undefined,
        ProductCode: js.UndefOr[ProductCode] = js.undefined
    ): ResolveCustomerResult = {
      val __obj = js.Dictionary.empty[js.Any]
      CustomerIdentifier.foreach(__v => __obj.update("CustomerIdentifier", __v.asInstanceOf[js.Any]))
      ProductCode.foreach(__v => __obj.update("ProductCode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResolveCustomerResult]
    }
  }

  /**
    * A UsageRecord indicates a quantity of usage for a given product, customer, dimension and time.
    *  Multiple requests with the same UsageRecords as input will be deduplicated to prevent double charges.
    */
  @js.native
  trait UsageRecord extends js.Object {
    var CustomerIdentifier: CustomerIdentifier
    var Dimension: UsageDimension
    var Timestamp: Timestamp
    var Quantity: js.UndefOr[UsageQuantity]
  }

  object UsageRecord {
    def apply(
        CustomerIdentifier: CustomerIdentifier,
        Dimension: UsageDimension,
        Timestamp: Timestamp,
        Quantity: js.UndefOr[UsageQuantity] = js.undefined
    ): UsageRecord = {
      val __obj = js.Dictionary[js.Any](
        "CustomerIdentifier" -> CustomerIdentifier.asInstanceOf[js.Any],
        "Dimension"          -> Dimension.asInstanceOf[js.Any],
        "Timestamp"          -> Timestamp.asInstanceOf[js.Any]
      )

      Quantity.foreach(__v => __obj.update("Quantity", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsageRecord]
    }
  }

  /**
    * A UsageRecordResult indicates the status of a given UsageRecord processed by BatchMeterUsage.
    */
  @js.native
  trait UsageRecordResult extends js.Object {
    var MeteringRecordId: js.UndefOr[String]
    var Status: js.UndefOr[UsageRecordResultStatus]
    var UsageRecord: js.UndefOr[UsageRecord]
  }

  object UsageRecordResult {
    def apply(
        MeteringRecordId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[UsageRecordResultStatus] = js.undefined,
        UsageRecord: js.UndefOr[UsageRecord] = js.undefined
    ): UsageRecordResult = {
      val __obj = js.Dictionary.empty[js.Any]
      MeteringRecordId.foreach(__v => __obj.update("MeteringRecordId", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      UsageRecord.foreach(__v => __obj.update("UsageRecord", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsageRecordResult]
    }
  }

  object UsageRecordResultStatusEnum {
    val Success               = "Success"
    val CustomerNotSubscribed = "CustomerNotSubscribed"
    val DuplicateRecord       = "DuplicateRecord"

    val values = js.Object.freeze(js.Array(Success, CustomerNotSubscribed, DuplicateRecord))
  }
}
