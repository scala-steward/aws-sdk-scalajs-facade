package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object groundstation {
  type AngleUnits                = String
  type BandwidthUnits            = String
  type ConfigArn                 = String
  type ConfigCapabilityType      = String
  type ConfigList                = js.Array[ConfigListItem]
  type ContactList               = js.Array[ContactData]
  type ContactStatus             = String
  type Criticality               = String
  type DataflowEdge              = js.Array[ConfigArn]
  type DataflowEdgeList          = js.Array[DataflowEdge]
  type DataflowEndpointGroupArn  = String
  type DataflowEndpointGroupList = js.Array[DataflowEndpointListItem]
  type DurationInSeconds         = Int
  type EirpUnits                 = String
  type EndpointDetailsList       = js.Array[EndpointDetails]
  type EndpointStatus            = String
  type FrequencyUnits            = String
  type GroundStationList         = js.Array[GroundStationData]
  type JsonString                = String
  type MissionProfileArn         = String
  type MissionProfileList        = js.Array[MissionProfileListItem]
  type Polarization              = String
  type RoleArn                   = String
  type SafeName                  = String
  type SatelliteList             = js.Array[SatelliteListItem]
  type SecurityGroupIdList       = js.Array[String]
  type StatusList                = js.Array[ContactStatus]
  type SubnetList                = js.Array[String]
  type TagKeys                   = js.Array[String]
  type TagsMap                   = js.Dictionary[String]
  type Timestamp                 = js.Date
  type Uuid                      = String
  type noradSatelliteID          = Int
  type satelliteArn              = String

  implicit final class GroundStationOps(private val service: GroundStation) extends AnyVal {

    @inline def cancelContactFuture(params: CancelContactRequest): Future[ContactIdResponse] =
      service.cancelContact(params).promise.toFuture
    @inline def createConfigFuture(params: CreateConfigRequest): Future[ConfigIdResponse] =
      service.createConfig(params).promise.toFuture
    @inline def createDataflowEndpointGroupFuture(
        params: CreateDataflowEndpointGroupRequest
    ): Future[DataflowEndpointGroupIdResponse] = service.createDataflowEndpointGroup(params).promise.toFuture
    @inline def createMissionProfileFuture(params: CreateMissionProfileRequest): Future[MissionProfileIdResponse] =
      service.createMissionProfile(params).promise.toFuture
    @inline def deleteConfigFuture(params: DeleteConfigRequest): Future[ConfigIdResponse] =
      service.deleteConfig(params).promise.toFuture
    @inline def deleteDataflowEndpointGroupFuture(
        params: DeleteDataflowEndpointGroupRequest
    ): Future[DataflowEndpointGroupIdResponse] = service.deleteDataflowEndpointGroup(params).promise.toFuture
    @inline def deleteMissionProfileFuture(params: DeleteMissionProfileRequest): Future[MissionProfileIdResponse] =
      service.deleteMissionProfile(params).promise.toFuture
    @inline def describeContactFuture(params: DescribeContactRequest): Future[DescribeContactResponse] =
      service.describeContact(params).promise.toFuture
    @inline def getConfigFuture(params: GetConfigRequest): Future[GetConfigResponse] =
      service.getConfig(params).promise.toFuture
    @inline def getDataflowEndpointGroupFuture(
        params: GetDataflowEndpointGroupRequest
    ): Future[GetDataflowEndpointGroupResponse] = service.getDataflowEndpointGroup(params).promise.toFuture
    @inline def getMinuteUsageFuture(params: GetMinuteUsageRequest): Future[GetMinuteUsageResponse] =
      service.getMinuteUsage(params).promise.toFuture
    @inline def getMissionProfileFuture(params: GetMissionProfileRequest): Future[GetMissionProfileResponse] =
      service.getMissionProfile(params).promise.toFuture
    @inline def getSatelliteFuture(params: GetSatelliteRequest): Future[GetSatelliteResponse] =
      service.getSatellite(params).promise.toFuture
    @inline def listConfigsFuture(params: ListConfigsRequest): Future[ListConfigsResponse] =
      service.listConfigs(params).promise.toFuture
    @inline def listContactsFuture(params: ListContactsRequest): Future[ListContactsResponse] =
      service.listContacts(params).promise.toFuture
    @inline def listDataflowEndpointGroupsFuture(
        params: ListDataflowEndpointGroupsRequest
    ): Future[ListDataflowEndpointGroupsResponse] = service.listDataflowEndpointGroups(params).promise.toFuture
    @inline def listGroundStationsFuture(params: ListGroundStationsRequest): Future[ListGroundStationsResponse] =
      service.listGroundStations(params).promise.toFuture
    @inline def listMissionProfilesFuture(params: ListMissionProfilesRequest): Future[ListMissionProfilesResponse] =
      service.listMissionProfiles(params).promise.toFuture
    @inline def listSatellitesFuture(params: ListSatellitesRequest): Future[ListSatellitesResponse] =
      service.listSatellites(params).promise.toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    @inline def reserveContactFuture(params: ReserveContactRequest): Future[ContactIdResponse] =
      service.reserveContact(params).promise.toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    @inline def updateConfigFuture(params: UpdateConfigRequest): Future[ConfigIdResponse] =
      service.updateConfig(params).promise.toFuture
    @inline def updateMissionProfileFuture(params: UpdateMissionProfileRequest): Future[MissionProfileIdResponse] =
      service.updateMissionProfile(params).promise.toFuture
  }
}

package groundstation {
  @js.native
  @JSImport("aws-sdk", "GroundStation")
  class GroundStation() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelContact(params: CancelContactRequest): Request[ContactIdResponse] = js.native
    def createConfig(params: CreateConfigRequest): Request[ConfigIdResponse]    = js.native
    def createDataflowEndpointGroup(
        params: CreateDataflowEndpointGroupRequest
    ): Request[DataflowEndpointGroupIdResponse]                                                      = js.native
    def createMissionProfile(params: CreateMissionProfileRequest): Request[MissionProfileIdResponse] = js.native
    def deleteConfig(params: DeleteConfigRequest): Request[ConfigIdResponse]                         = js.native
    def deleteDataflowEndpointGroup(
        params: DeleteDataflowEndpointGroupRequest
    ): Request[DataflowEndpointGroupIdResponse]                                                      = js.native
    def deleteMissionProfile(params: DeleteMissionProfileRequest): Request[MissionProfileIdResponse] = js.native
    def describeContact(params: DescribeContactRequest): Request[DescribeContactResponse]            = js.native
    def getConfig(params: GetConfigRequest): Request[GetConfigResponse]                              = js.native
    def getDataflowEndpointGroup(params: GetDataflowEndpointGroupRequest): Request[GetDataflowEndpointGroupResponse] =
      js.native
    def getMinuteUsage(params: GetMinuteUsageRequest): Request[GetMinuteUsageResponse]          = js.native
    def getMissionProfile(params: GetMissionProfileRequest): Request[GetMissionProfileResponse] = js.native
    def getSatellite(params: GetSatelliteRequest): Request[GetSatelliteResponse]                = js.native
    def listConfigs(params: ListConfigsRequest): Request[ListConfigsResponse]                   = js.native
    def listContacts(params: ListContactsRequest): Request[ListContactsResponse]                = js.native
    def listDataflowEndpointGroups(
        params: ListDataflowEndpointGroupsRequest
    ): Request[ListDataflowEndpointGroupsResponse]                                                    = js.native
    def listGroundStations(params: ListGroundStationsRequest): Request[ListGroundStationsResponse]    = js.native
    def listMissionProfiles(params: ListMissionProfilesRequest): Request[ListMissionProfilesResponse] = js.native
    def listSatellites(params: ListSatellitesRequest): Request[ListSatellitesResponse]                = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def reserveContact(params: ReserveContactRequest): Request[ContactIdResponse]                     = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                         = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                   = js.native
    def updateConfig(params: UpdateConfigRequest): Request[ConfigIdResponse]                          = js.native
    def updateMissionProfile(params: UpdateMissionProfileRequest): Request[MissionProfileIdResponse]  = js.native
  }

  object AngleUnitsEnum {
    val DEGREE_ANGLE = "DEGREE_ANGLE"
    val RADIAN       = "RADIAN"

    val values = js.Object.freeze(js.Array(DEGREE_ANGLE, RADIAN))
  }

  /**
    * <p>Information about how AWS Ground Station should configure an
    *          antenna for downlink during a contact.</p>
    */
  @js.native
  trait AntennaDownlinkConfig extends js.Object {
    var spectrumConfig: SpectrumConfig
  }

  object AntennaDownlinkConfig {
    @inline
    def apply(
        spectrumConfig: SpectrumConfig
    ): AntennaDownlinkConfig = {
      val __obj = js.Dynamic.literal(
        "spectrumConfig" -> spectrumConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AntennaDownlinkConfig]
    }
  }

  /**
    * Information about how AWS Ground Station should conﬁgure an antenna for downlink demod decode during a contact.
    */
  @js.native
  trait AntennaDownlinkDemodDecodeConfig extends js.Object {
    var decodeConfig: DecodeConfig
    var demodulationConfig: DemodulationConfig
    var spectrumConfig: SpectrumConfig
  }

  object AntennaDownlinkDemodDecodeConfig {
    @inline
    def apply(
        decodeConfig: DecodeConfig,
        demodulationConfig: DemodulationConfig,
        spectrumConfig: SpectrumConfig
    ): AntennaDownlinkDemodDecodeConfig = {
      val __obj = js.Dynamic.literal(
        "decodeConfig"       -> decodeConfig.asInstanceOf[js.Any],
        "demodulationConfig" -> demodulationConfig.asInstanceOf[js.Any],
        "spectrumConfig"     -> spectrumConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AntennaDownlinkDemodDecodeConfig]
    }
  }

  /**
    * Information about the uplink <code>Config</code> of an antenna.
    */
  @js.native
  trait AntennaUplinkConfig extends js.Object {
    var spectrumConfig: UplinkSpectrumConfig
    var targetEirp: Eirp
  }

  object AntennaUplinkConfig {
    @inline
    def apply(
        spectrumConfig: UplinkSpectrumConfig,
        targetEirp: Eirp
    ): AntennaUplinkConfig = {
      val __obj = js.Dynamic.literal(
        "spectrumConfig" -> spectrumConfig.asInstanceOf[js.Any],
        "targetEirp"     -> targetEirp.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AntennaUplinkConfig]
    }
  }

  object BandwidthUnitsEnum {
    val GHz = "GHz"
    val MHz = "MHz"
    val kHz = "kHz"

    val values = js.Object.freeze(js.Array(GHz, MHz, kHz))
  }

  /**
    * <p/>
    */
  @js.native
  trait CancelContactRequest extends js.Object {
    var contactId: String
  }

  object CancelContactRequest {
    @inline
    def apply(
        contactId: String
    ): CancelContactRequest = {
      val __obj = js.Dynamic.literal(
        "contactId" -> contactId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelContactRequest]
    }
  }

  object ConfigCapabilityTypeEnum {
    val `antenna-downlink`              = "antenna-downlink"
    val `antenna-downlink-demod-decode` = "antenna-downlink-demod-decode"
    val `antenna-uplink`                = "antenna-uplink"
    val `dataflow-endpoint`             = "dataflow-endpoint"
    val tracking                        = "tracking"
    val `uplink-echo`                   = "uplink-echo"

    val values = js.Object.freeze(
      js.Array(
        `antenna-downlink`,
        `antenna-downlink-demod-decode`,
        `antenna-uplink`,
        `dataflow-endpoint`,
        tracking,
        `uplink-echo`
      )
    )
  }

  /**
    * <p/>
    */
  @js.native
  trait ConfigIdResponse extends js.Object {
    var configArn: js.UndefOr[ConfigArn]
    var configId: js.UndefOr[String]
    var configType: js.UndefOr[ConfigCapabilityType]
  }

  object ConfigIdResponse {
    @inline
    def apply(
        configArn: js.UndefOr[ConfigArn] = js.undefined,
        configId: js.UndefOr[String] = js.undefined,
        configType: js.UndefOr[ConfigCapabilityType] = js.undefined
    ): ConfigIdResponse = {
      val __obj = js.Dynamic.literal()
      configArn.foreach(__v => __obj.updateDynamic("configArn")(__v.asInstanceOf[js.Any]))
      configId.foreach(__v => __obj.updateDynamic("configId")(__v.asInstanceOf[js.Any]))
      configType.foreach(__v => __obj.updateDynamic("configType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigIdResponse]
    }
  }

  /**
    * An item in a list of <code>Config</code> objects.
    */
  @js.native
  trait ConfigListItem extends js.Object {
    var configArn: js.UndefOr[ConfigArn]
    var configId: js.UndefOr[String]
    var configType: js.UndefOr[ConfigCapabilityType]
    var name: js.UndefOr[String]
  }

  object ConfigListItem {
    @inline
    def apply(
        configArn: js.UndefOr[ConfigArn] = js.undefined,
        configId: js.UndefOr[String] = js.undefined,
        configType: js.UndefOr[ConfigCapabilityType] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): ConfigListItem = {
      val __obj = js.Dynamic.literal()
      configArn.foreach(__v => __obj.updateDynamic("configArn")(__v.asInstanceOf[js.Any]))
      configId.foreach(__v => __obj.updateDynamic("configId")(__v.asInstanceOf[js.Any]))
      configType.foreach(__v => __obj.updateDynamic("configType")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigListItem]
    }
  }

  /**
    * Object containing the parameters for a <code>Config</code>.
    *          See the subtype definitions for what each type of <code>Config</code> contains.
    */
  @js.native
  trait ConfigTypeData extends js.Object {
    var antennaDownlinkConfig: js.UndefOr[AntennaDownlinkConfig]
    var antennaDownlinkDemodDecodeConfig: js.UndefOr[AntennaDownlinkDemodDecodeConfig]
    var antennaUplinkConfig: js.UndefOr[AntennaUplinkConfig]
    var dataflowEndpointConfig: js.UndefOr[DataflowEndpointConfig]
    var trackingConfig: js.UndefOr[TrackingConfig]
    var uplinkEchoConfig: js.UndefOr[UplinkEchoConfig]
  }

  object ConfigTypeData {
    @inline
    def apply(
        antennaDownlinkConfig: js.UndefOr[AntennaDownlinkConfig] = js.undefined,
        antennaDownlinkDemodDecodeConfig: js.UndefOr[AntennaDownlinkDemodDecodeConfig] = js.undefined,
        antennaUplinkConfig: js.UndefOr[AntennaUplinkConfig] = js.undefined,
        dataflowEndpointConfig: js.UndefOr[DataflowEndpointConfig] = js.undefined,
        trackingConfig: js.UndefOr[TrackingConfig] = js.undefined,
        uplinkEchoConfig: js.UndefOr[UplinkEchoConfig] = js.undefined
    ): ConfigTypeData = {
      val __obj = js.Dynamic.literal()
      antennaDownlinkConfig.foreach(__v => __obj.updateDynamic("antennaDownlinkConfig")(__v.asInstanceOf[js.Any]))
      antennaDownlinkDemodDecodeConfig.foreach(__v =>
        __obj.updateDynamic("antennaDownlinkDemodDecodeConfig")(__v.asInstanceOf[js.Any])
      )
      antennaUplinkConfig.foreach(__v => __obj.updateDynamic("antennaUplinkConfig")(__v.asInstanceOf[js.Any]))
      dataflowEndpointConfig.foreach(__v => __obj.updateDynamic("dataflowEndpointConfig")(__v.asInstanceOf[js.Any]))
      trackingConfig.foreach(__v => __obj.updateDynamic("trackingConfig")(__v.asInstanceOf[js.Any]))
      uplinkEchoConfig.foreach(__v => __obj.updateDynamic("uplinkEchoConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigTypeData]
    }
  }

  /**
    * Data describing a contact.
    */
  @js.native
  trait ContactData extends js.Object {
    var contactId: js.UndefOr[String]
    var contactStatus: js.UndefOr[ContactStatus]
    var endTime: js.UndefOr[Timestamp]
    var errorMessage: js.UndefOr[String]
    var groundStation: js.UndefOr[String]
    var maximumElevation: js.UndefOr[Elevation]
    var missionProfileArn: js.UndefOr[MissionProfileArn]
    var postPassEndTime: js.UndefOr[Timestamp]
    var prePassStartTime: js.UndefOr[Timestamp]
    var satelliteArn: js.UndefOr[satelliteArn]
    var startTime: js.UndefOr[Timestamp]
    var tags: js.UndefOr[TagsMap]
  }

  object ContactData {
    @inline
    def apply(
        contactId: js.UndefOr[String] = js.undefined,
        contactStatus: js.UndefOr[ContactStatus] = js.undefined,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        errorMessage: js.UndefOr[String] = js.undefined,
        groundStation: js.UndefOr[String] = js.undefined,
        maximumElevation: js.UndefOr[Elevation] = js.undefined,
        missionProfileArn: js.UndefOr[MissionProfileArn] = js.undefined,
        postPassEndTime: js.UndefOr[Timestamp] = js.undefined,
        prePassStartTime: js.UndefOr[Timestamp] = js.undefined,
        satelliteArn: js.UndefOr[satelliteArn] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): ContactData = {
      val __obj = js.Dynamic.literal()
      contactId.foreach(__v => __obj.updateDynamic("contactId")(__v.asInstanceOf[js.Any]))
      contactStatus.foreach(__v => __obj.updateDynamic("contactStatus")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      groundStation.foreach(__v => __obj.updateDynamic("groundStation")(__v.asInstanceOf[js.Any]))
      maximumElevation.foreach(__v => __obj.updateDynamic("maximumElevation")(__v.asInstanceOf[js.Any]))
      missionProfileArn.foreach(__v => __obj.updateDynamic("missionProfileArn")(__v.asInstanceOf[js.Any]))
      postPassEndTime.foreach(__v => __obj.updateDynamic("postPassEndTime")(__v.asInstanceOf[js.Any]))
      prePassStartTime.foreach(__v => __obj.updateDynamic("prePassStartTime")(__v.asInstanceOf[js.Any]))
      satelliteArn.foreach(__v => __obj.updateDynamic("satelliteArn")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContactData]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ContactIdResponse extends js.Object {
    var contactId: js.UndefOr[String]
  }

  object ContactIdResponse {
    @inline
    def apply(
        contactId: js.UndefOr[String] = js.undefined
    ): ContactIdResponse = {
      val __obj = js.Dynamic.literal()
      contactId.foreach(__v => __obj.updateDynamic("contactId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContactIdResponse]
    }
  }

  object ContactStatusEnum {
    val AVAILABLE          = "AVAILABLE"
    val AWS_CANCELLED      = "AWS_CANCELLED"
    val CANCELLED          = "CANCELLED"
    val COMPLETED          = "COMPLETED"
    val FAILED             = "FAILED"
    val FAILED_TO_SCHEDULE = "FAILED_TO_SCHEDULE"
    val PASS               = "PASS"
    val POSTPASS           = "POSTPASS"
    val PREPASS            = "PREPASS"
    val SCHEDULED          = "SCHEDULED"
    val SCHEDULING         = "SCHEDULING"

    val values = js.Object.freeze(
      js.Array(
        AVAILABLE,
        AWS_CANCELLED,
        CANCELLED,
        COMPLETED,
        FAILED,
        FAILED_TO_SCHEDULE,
        PASS,
        POSTPASS,
        PREPASS,
        SCHEDULED,
        SCHEDULING
      )
    )
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateConfigRequest extends js.Object {
    var configData: ConfigTypeData
    var name: SafeName
    var tags: js.UndefOr[TagsMap]
  }

  object CreateConfigRequest {
    @inline
    def apply(
        configData: ConfigTypeData,
        name: SafeName,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateConfigRequest = {
      val __obj = js.Dynamic.literal(
        "configData" -> configData.asInstanceOf[js.Any],
        "name"       -> name.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConfigRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateDataflowEndpointGroupRequest extends js.Object {
    var endpointDetails: EndpointDetailsList
    var tags: js.UndefOr[TagsMap]
  }

  object CreateDataflowEndpointGroupRequest {
    @inline
    def apply(
        endpointDetails: EndpointDetailsList,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateDataflowEndpointGroupRequest = {
      val __obj = js.Dynamic.literal(
        "endpointDetails" -> endpointDetails.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataflowEndpointGroupRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateMissionProfileRequest extends js.Object {
    var dataflowEdges: DataflowEdgeList
    var minimumViableContactDurationSeconds: DurationInSeconds
    var name: SafeName
    var trackingConfigArn: ConfigArn
    var contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds]
    var contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds]
    var tags: js.UndefOr[TagsMap]
  }

  object CreateMissionProfileRequest {
    @inline
    def apply(
        dataflowEdges: DataflowEdgeList,
        minimumViableContactDurationSeconds: DurationInSeconds,
        name: SafeName,
        trackingConfigArn: ConfigArn,
        contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined,
        contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateMissionProfileRequest = {
      val __obj = js.Dynamic.literal(
        "dataflowEdges"                       -> dataflowEdges.asInstanceOf[js.Any],
        "minimumViableContactDurationSeconds" -> minimumViableContactDurationSeconds.asInstanceOf[js.Any],
        "name"                                -> name.asInstanceOf[js.Any],
        "trackingConfigArn"                   -> trackingConfigArn.asInstanceOf[js.Any]
      )

      contactPostPassDurationSeconds.foreach(__v =>
        __obj.updateDynamic("contactPostPassDurationSeconds")(__v.asInstanceOf[js.Any])
      )
      contactPrePassDurationSeconds.foreach(__v =>
        __obj.updateDynamic("contactPrePassDurationSeconds")(__v.asInstanceOf[js.Any])
      )
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMissionProfileRequest]
    }
  }

  object CriticalityEnum {
    val PREFERRED = "PREFERRED"
    val REMOVED   = "REMOVED"
    val REQUIRED  = "REQUIRED"

    val values = js.Object.freeze(js.Array(PREFERRED, REMOVED, REQUIRED))
  }

  /**
    * Information about a dataflow endpoint.
    */
  @js.native
  trait DataflowEndpoint extends js.Object {
    var address: js.UndefOr[SocketAddress]
    var name: js.UndefOr[SafeName]
    var status: js.UndefOr[EndpointStatus]
  }

  object DataflowEndpoint {
    @inline
    def apply(
        address: js.UndefOr[SocketAddress] = js.undefined,
        name: js.UndefOr[SafeName] = js.undefined,
        status: js.UndefOr[EndpointStatus] = js.undefined
    ): DataflowEndpoint = {
      val __obj = js.Dynamic.literal()
      address.foreach(__v => __obj.updateDynamic("address")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataflowEndpoint]
    }
  }

  /**
    * Information about the dataflow endpoint <code>Config</code>.
    */
  @js.native
  trait DataflowEndpointConfig extends js.Object {
    var dataflowEndpointName: String
  }

  object DataflowEndpointConfig {
    @inline
    def apply(
        dataflowEndpointName: String
    ): DataflowEndpointConfig = {
      val __obj = js.Dynamic.literal(
        "dataflowEndpointName" -> dataflowEndpointName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DataflowEndpointConfig]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DataflowEndpointGroupIdResponse extends js.Object {
    var dataflowEndpointGroupId: js.UndefOr[String]
  }

  object DataflowEndpointGroupIdResponse {
    @inline
    def apply(
        dataflowEndpointGroupId: js.UndefOr[String] = js.undefined
    ): DataflowEndpointGroupIdResponse = {
      val __obj = js.Dynamic.literal()
      dataflowEndpointGroupId.foreach(__v => __obj.updateDynamic("dataflowEndpointGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataflowEndpointGroupIdResponse]
    }
  }

  /**
    * Item in a list of <code>DataflowEndpoint</code> groups.
    */
  @js.native
  trait DataflowEndpointListItem extends js.Object {
    var dataflowEndpointGroupArn: js.UndefOr[DataflowEndpointGroupArn]
    var dataflowEndpointGroupId: js.UndefOr[String]
  }

  object DataflowEndpointListItem {
    @inline
    def apply(
        dataflowEndpointGroupArn: js.UndefOr[DataflowEndpointGroupArn] = js.undefined,
        dataflowEndpointGroupId: js.UndefOr[String] = js.undefined
    ): DataflowEndpointListItem = {
      val __obj = js.Dynamic.literal()
      dataflowEndpointGroupArn.foreach(__v => __obj.updateDynamic("dataflowEndpointGroupArn")(__v.asInstanceOf[js.Any]))
      dataflowEndpointGroupId.foreach(__v => __obj.updateDynamic("dataflowEndpointGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataflowEndpointListItem]
    }
  }

  /**
    * Information about the decode <code>Config</code>.
    */
  @js.native
  trait DecodeConfig extends js.Object {
    var unvalidatedJSON: JsonString
  }

  object DecodeConfig {
    @inline
    def apply(
        unvalidatedJSON: JsonString
    ): DecodeConfig = {
      val __obj = js.Dynamic.literal(
        "unvalidatedJSON" -> unvalidatedJSON.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DecodeConfig]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteConfigRequest extends js.Object {
    var configId: String
    var configType: ConfigCapabilityType
  }

  object DeleteConfigRequest {
    @inline
    def apply(
        configId: String,
        configType: ConfigCapabilityType
    ): DeleteConfigRequest = {
      val __obj = js.Dynamic.literal(
        "configId"   -> configId.asInstanceOf[js.Any],
        "configType" -> configType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteConfigRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteDataflowEndpointGroupRequest extends js.Object {
    var dataflowEndpointGroupId: String
  }

  object DeleteDataflowEndpointGroupRequest {
    @inline
    def apply(
        dataflowEndpointGroupId: String
    ): DeleteDataflowEndpointGroupRequest = {
      val __obj = js.Dynamic.literal(
        "dataflowEndpointGroupId" -> dataflowEndpointGroupId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDataflowEndpointGroupRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteMissionProfileRequest extends js.Object {
    var missionProfileId: String
  }

  object DeleteMissionProfileRequest {
    @inline
    def apply(
        missionProfileId: String
    ): DeleteMissionProfileRequest = {
      val __obj = js.Dynamic.literal(
        "missionProfileId" -> missionProfileId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteMissionProfileRequest]
    }
  }

  /**
    * Information about the demodulation <code>Config</code>.
    */
  @js.native
  trait DemodulationConfig extends js.Object {
    var unvalidatedJSON: JsonString
  }

  object DemodulationConfig {
    @inline
    def apply(
        unvalidatedJSON: JsonString
    ): DemodulationConfig = {
      val __obj = js.Dynamic.literal(
        "unvalidatedJSON" -> unvalidatedJSON.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DemodulationConfig]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeContactRequest extends js.Object {
    var contactId: String
  }

  object DescribeContactRequest {
    @inline
    def apply(
        contactId: String
    ): DescribeContactRequest = {
      val __obj = js.Dynamic.literal(
        "contactId" -> contactId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeContactRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeContactResponse extends js.Object {
    var contactId: js.UndefOr[String]
    var contactStatus: js.UndefOr[ContactStatus]
    var endTime: js.UndefOr[Timestamp]
    var errorMessage: js.UndefOr[String]
    var groundStation: js.UndefOr[String]
    var maximumElevation: js.UndefOr[Elevation]
    var missionProfileArn: js.UndefOr[MissionProfileArn]
    var postPassEndTime: js.UndefOr[Timestamp]
    var prePassStartTime: js.UndefOr[Timestamp]
    var satelliteArn: js.UndefOr[satelliteArn]
    var startTime: js.UndefOr[Timestamp]
    var tags: js.UndefOr[TagsMap]
  }

  object DescribeContactResponse {
    @inline
    def apply(
        contactId: js.UndefOr[String] = js.undefined,
        contactStatus: js.UndefOr[ContactStatus] = js.undefined,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        errorMessage: js.UndefOr[String] = js.undefined,
        groundStation: js.UndefOr[String] = js.undefined,
        maximumElevation: js.UndefOr[Elevation] = js.undefined,
        missionProfileArn: js.UndefOr[MissionProfileArn] = js.undefined,
        postPassEndTime: js.UndefOr[Timestamp] = js.undefined,
        prePassStartTime: js.UndefOr[Timestamp] = js.undefined,
        satelliteArn: js.UndefOr[satelliteArn] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): DescribeContactResponse = {
      val __obj = js.Dynamic.literal()
      contactId.foreach(__v => __obj.updateDynamic("contactId")(__v.asInstanceOf[js.Any]))
      contactStatus.foreach(__v => __obj.updateDynamic("contactStatus")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      groundStation.foreach(__v => __obj.updateDynamic("groundStation")(__v.asInstanceOf[js.Any]))
      maximumElevation.foreach(__v => __obj.updateDynamic("maximumElevation")(__v.asInstanceOf[js.Any]))
      missionProfileArn.foreach(__v => __obj.updateDynamic("missionProfileArn")(__v.asInstanceOf[js.Any]))
      postPassEndTime.foreach(__v => __obj.updateDynamic("postPassEndTime")(__v.asInstanceOf[js.Any]))
      prePassStartTime.foreach(__v => __obj.updateDynamic("prePassStartTime")(__v.asInstanceOf[js.Any]))
      satelliteArn.foreach(__v => __obj.updateDynamic("satelliteArn")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeContactResponse]
    }
  }

  /**
    * Object that represents EIRP.
    */
  @js.native
  trait Eirp extends js.Object {
    var units: EirpUnits
    var value: Double
  }

  object Eirp {
    @inline
    def apply(
        units: EirpUnits,
        value: Double
    ): Eirp = {
      val __obj = js.Dynamic.literal(
        "units" -> units.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Eirp]
    }
  }

  object EirpUnitsEnum {
    val dBW = "dBW"

    val values = js.Object.freeze(js.Array(dBW))
  }

  /**
    * Elevation angle of the satellite in the sky during a contact.
    */
  @js.native
  trait Elevation extends js.Object {
    var unit: AngleUnits
    var value: Double
  }

  object Elevation {
    @inline
    def apply(
        unit: AngleUnits,
        value: Double
    ): Elevation = {
      val __obj = js.Dynamic.literal(
        "unit"  -> unit.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Elevation]
    }
  }

  /**
    * Information about the endpoint details.
    */
  @js.native
  trait EndpointDetails extends js.Object {
    var endpoint: js.UndefOr[DataflowEndpoint]
    var securityDetails: js.UndefOr[SecurityDetails]
  }

  object EndpointDetails {
    @inline
    def apply(
        endpoint: js.UndefOr[DataflowEndpoint] = js.undefined,
        securityDetails: js.UndefOr[SecurityDetails] = js.undefined
    ): EndpointDetails = {
      val __obj = js.Dynamic.literal()
      endpoint.foreach(__v => __obj.updateDynamic("endpoint")(__v.asInstanceOf[js.Any]))
      securityDetails.foreach(__v => __obj.updateDynamic("securityDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointDetails]
    }
  }

  object EndpointStatusEnum {
    val created  = "created"
    val creating = "creating"
    val deleted  = "deleted"
    val deleting = "deleting"
    val failed   = "failed"

    val values = js.Object.freeze(js.Array(created, creating, deleted, deleting, failed))
  }

  /**
    * Object that describes the frequency.
    */
  @js.native
  trait Frequency extends js.Object {
    var units: FrequencyUnits
    var value: Double
  }

  object Frequency {
    @inline
    def apply(
        units: FrequencyUnits,
        value: Double
    ): Frequency = {
      val __obj = js.Dynamic.literal(
        "units" -> units.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Frequency]
    }
  }

  /**
    * Object that describes the frequency bandwidth.
    */
  @js.native
  trait FrequencyBandwidth extends js.Object {
    var units: BandwidthUnits
    var value: Double
  }

  object FrequencyBandwidth {
    @inline
    def apply(
        units: BandwidthUnits,
        value: Double
    ): FrequencyBandwidth = {
      val __obj = js.Dynamic.literal(
        "units" -> units.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FrequencyBandwidth]
    }
  }

  object FrequencyUnitsEnum {
    val GHz = "GHz"
    val MHz = "MHz"
    val kHz = "kHz"

    val values = js.Object.freeze(js.Array(GHz, MHz, kHz))
  }

  /**
    * <p/>
    */
  @js.native
  trait GetConfigRequest extends js.Object {
    var configId: String
    var configType: ConfigCapabilityType
  }

  object GetConfigRequest {
    @inline
    def apply(
        configId: String,
        configType: ConfigCapabilityType
    ): GetConfigRequest = {
      val __obj = js.Dynamic.literal(
        "configId"   -> configId.asInstanceOf[js.Any],
        "configType" -> configType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetConfigRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait GetConfigResponse extends js.Object {
    var configArn: ConfigArn
    var configData: ConfigTypeData
    var configId: String
    var name: String
    var configType: js.UndefOr[ConfigCapabilityType]
    var tags: js.UndefOr[TagsMap]
  }

  object GetConfigResponse {
    @inline
    def apply(
        configArn: ConfigArn,
        configData: ConfigTypeData,
        configId: String,
        name: String,
        configType: js.UndefOr[ConfigCapabilityType] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): GetConfigResponse = {
      val __obj = js.Dynamic.literal(
        "configArn"  -> configArn.asInstanceOf[js.Any],
        "configData" -> configData.asInstanceOf[js.Any],
        "configId"   -> configId.asInstanceOf[js.Any],
        "name"       -> name.asInstanceOf[js.Any]
      )

      configType.foreach(__v => __obj.updateDynamic("configType")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConfigResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait GetDataflowEndpointGroupRequest extends js.Object {
    var dataflowEndpointGroupId: String
  }

  object GetDataflowEndpointGroupRequest {
    @inline
    def apply(
        dataflowEndpointGroupId: String
    ): GetDataflowEndpointGroupRequest = {
      val __obj = js.Dynamic.literal(
        "dataflowEndpointGroupId" -> dataflowEndpointGroupId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDataflowEndpointGroupRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait GetDataflowEndpointGroupResponse extends js.Object {
    var dataflowEndpointGroupArn: js.UndefOr[DataflowEndpointGroupArn]
    var dataflowEndpointGroupId: js.UndefOr[String]
    var endpointsDetails: js.UndefOr[EndpointDetailsList]
    var tags: js.UndefOr[TagsMap]
  }

  object GetDataflowEndpointGroupResponse {
    @inline
    def apply(
        dataflowEndpointGroupArn: js.UndefOr[DataflowEndpointGroupArn] = js.undefined,
        dataflowEndpointGroupId: js.UndefOr[String] = js.undefined,
        endpointsDetails: js.UndefOr[EndpointDetailsList] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): GetDataflowEndpointGroupResponse = {
      val __obj = js.Dynamic.literal()
      dataflowEndpointGroupArn.foreach(__v => __obj.updateDynamic("dataflowEndpointGroupArn")(__v.asInstanceOf[js.Any]))
      dataflowEndpointGroupId.foreach(__v => __obj.updateDynamic("dataflowEndpointGroupId")(__v.asInstanceOf[js.Any]))
      endpointsDetails.foreach(__v => __obj.updateDynamic("endpointsDetails")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataflowEndpointGroupResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait GetMinuteUsageRequest extends js.Object {
    var month: Int
    var year: Int
  }

  object GetMinuteUsageRequest {
    @inline
    def apply(
        month: Int,
        year: Int
    ): GetMinuteUsageRequest = {
      val __obj = js.Dynamic.literal(
        "month" -> month.asInstanceOf[js.Any],
        "year"  -> year.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetMinuteUsageRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait GetMinuteUsageResponse extends js.Object {
    var estimatedMinutesRemaining: js.UndefOr[Int]
    var isReservedMinutesCustomer: js.UndefOr[Boolean]
    var totalReservedMinuteAllocation: js.UndefOr[Int]
    var totalScheduledMinutes: js.UndefOr[Int]
    var upcomingMinutesScheduled: js.UndefOr[Int]
  }

  object GetMinuteUsageResponse {
    @inline
    def apply(
        estimatedMinutesRemaining: js.UndefOr[Int] = js.undefined,
        isReservedMinutesCustomer: js.UndefOr[Boolean] = js.undefined,
        totalReservedMinuteAllocation: js.UndefOr[Int] = js.undefined,
        totalScheduledMinutes: js.UndefOr[Int] = js.undefined,
        upcomingMinutesScheduled: js.UndefOr[Int] = js.undefined
    ): GetMinuteUsageResponse = {
      val __obj = js.Dynamic.literal()
      estimatedMinutesRemaining.foreach(__v =>
        __obj.updateDynamic("estimatedMinutesRemaining")(__v.asInstanceOf[js.Any])
      )
      isReservedMinutesCustomer.foreach(__v =>
        __obj.updateDynamic("isReservedMinutesCustomer")(__v.asInstanceOf[js.Any])
      )
      totalReservedMinuteAllocation.foreach(__v =>
        __obj.updateDynamic("totalReservedMinuteAllocation")(__v.asInstanceOf[js.Any])
      )
      totalScheduledMinutes.foreach(__v => __obj.updateDynamic("totalScheduledMinutes")(__v.asInstanceOf[js.Any]))
      upcomingMinutesScheduled.foreach(__v => __obj.updateDynamic("upcomingMinutesScheduled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMinuteUsageResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait GetMissionProfileRequest extends js.Object {
    var missionProfileId: String
  }

  object GetMissionProfileRequest {
    @inline
    def apply(
        missionProfileId: String
    ): GetMissionProfileRequest = {
      val __obj = js.Dynamic.literal(
        "missionProfileId" -> missionProfileId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetMissionProfileRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait GetMissionProfileResponse extends js.Object {
    var contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds]
    var contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds]
    var dataflowEdges: js.UndefOr[DataflowEdgeList]
    var minimumViableContactDurationSeconds: js.UndefOr[DurationInSeconds]
    var missionProfileArn: js.UndefOr[MissionProfileArn]
    var missionProfileId: js.UndefOr[String]
    var name: js.UndefOr[String]
    var region: js.UndefOr[String]
    var tags: js.UndefOr[TagsMap]
    var trackingConfigArn: js.UndefOr[ConfigArn]
  }

  object GetMissionProfileResponse {
    @inline
    def apply(
        contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined,
        contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined,
        dataflowEdges: js.UndefOr[DataflowEdgeList] = js.undefined,
        minimumViableContactDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined,
        missionProfileArn: js.UndefOr[MissionProfileArn] = js.undefined,
        missionProfileId: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        region: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined,
        trackingConfigArn: js.UndefOr[ConfigArn] = js.undefined
    ): GetMissionProfileResponse = {
      val __obj = js.Dynamic.literal()
      contactPostPassDurationSeconds.foreach(__v =>
        __obj.updateDynamic("contactPostPassDurationSeconds")(__v.asInstanceOf[js.Any])
      )
      contactPrePassDurationSeconds.foreach(__v =>
        __obj.updateDynamic("contactPrePassDurationSeconds")(__v.asInstanceOf[js.Any])
      )
      dataflowEdges.foreach(__v => __obj.updateDynamic("dataflowEdges")(__v.asInstanceOf[js.Any]))
      minimumViableContactDurationSeconds.foreach(__v =>
        __obj.updateDynamic("minimumViableContactDurationSeconds")(__v.asInstanceOf[js.Any])
      )
      missionProfileArn.foreach(__v => __obj.updateDynamic("missionProfileArn")(__v.asInstanceOf[js.Any]))
      missionProfileId.foreach(__v => __obj.updateDynamic("missionProfileId")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      trackingConfigArn.foreach(__v => __obj.updateDynamic("trackingConfigArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMissionProfileResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait GetSatelliteRequest extends js.Object {
    var satelliteId: String
  }

  object GetSatelliteRequest {
    @inline
    def apply(
        satelliteId: String
    ): GetSatelliteRequest = {
      val __obj = js.Dynamic.literal(
        "satelliteId" -> satelliteId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSatelliteRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait GetSatelliteResponse extends js.Object {
    var dateCreated: js.UndefOr[Timestamp]
    var lastUpdated: js.UndefOr[Timestamp]
    var noradSatelliteID: js.UndefOr[noradSatelliteID]
    var satelliteArn: js.UndefOr[satelliteArn]
    var satelliteId: js.UndefOr[Uuid]
    var tags: js.UndefOr[TagsMap]
  }

  object GetSatelliteResponse {
    @inline
    def apply(
        dateCreated: js.UndefOr[Timestamp] = js.undefined,
        lastUpdated: js.UndefOr[Timestamp] = js.undefined,
        noradSatelliteID: js.UndefOr[noradSatelliteID] = js.undefined,
        satelliteArn: js.UndefOr[satelliteArn] = js.undefined,
        satelliteId: js.UndefOr[Uuid] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): GetSatelliteResponse = {
      val __obj = js.Dynamic.literal()
      dateCreated.foreach(__v => __obj.updateDynamic("dateCreated")(__v.asInstanceOf[js.Any]))
      lastUpdated.foreach(__v => __obj.updateDynamic("lastUpdated")(__v.asInstanceOf[js.Any]))
      noradSatelliteID.foreach(__v => __obj.updateDynamic("noradSatelliteID")(__v.asInstanceOf[js.Any]))
      satelliteArn.foreach(__v => __obj.updateDynamic("satelliteArn")(__v.asInstanceOf[js.Any]))
      satelliteId.foreach(__v => __obj.updateDynamic("satelliteId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSatelliteResponse]
    }
  }

  /**
    * Information about the ground station data.
    */
  @js.native
  trait GroundStationData extends js.Object {
    var groundStationId: js.UndefOr[String]
    var groundStationName: js.UndefOr[String]
    var region: js.UndefOr[String]
  }

  object GroundStationData {
    @inline
    def apply(
        groundStationId: js.UndefOr[String] = js.undefined,
        groundStationName: js.UndefOr[String] = js.undefined,
        region: js.UndefOr[String] = js.undefined
    ): GroundStationData = {
      val __obj = js.Dynamic.literal()
      groundStationId.foreach(__v => __obj.updateDynamic("groundStationId")(__v.asInstanceOf[js.Any]))
      groundStationName.foreach(__v => __obj.updateDynamic("groundStationName")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroundStationData]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ListConfigsRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[String]
  }

  object ListConfigsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListConfigsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigsRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ListConfigsResponse extends js.Object {
    var configList: js.UndefOr[ConfigList]
    var nextToken: js.UndefOr[String]
  }

  object ListConfigsResponse {
    @inline
    def apply(
        configList: js.UndefOr[ConfigList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListConfigsResponse = {
      val __obj = js.Dynamic.literal()
      configList.foreach(__v => __obj.updateDynamic("configList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigsResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ListContactsRequest extends js.Object {
    var endTime: Timestamp
    var startTime: Timestamp
    var statusList: StatusList
    var groundStation: js.UndefOr[String]
    var maxResults: js.UndefOr[Int]
    var missionProfileArn: js.UndefOr[MissionProfileArn]
    var nextToken: js.UndefOr[String]
    var satelliteArn: js.UndefOr[satelliteArn]
  }

  object ListContactsRequest {
    @inline
    def apply(
        endTime: Timestamp,
        startTime: Timestamp,
        statusList: StatusList,
        groundStation: js.UndefOr[String] = js.undefined,
        maxResults: js.UndefOr[Int] = js.undefined,
        missionProfileArn: js.UndefOr[MissionProfileArn] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        satelliteArn: js.UndefOr[satelliteArn] = js.undefined
    ): ListContactsRequest = {
      val __obj = js.Dynamic.literal(
        "endTime"    -> endTime.asInstanceOf[js.Any],
        "startTime"  -> startTime.asInstanceOf[js.Any],
        "statusList" -> statusList.asInstanceOf[js.Any]
      )

      groundStation.foreach(__v => __obj.updateDynamic("groundStation")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      missionProfileArn.foreach(__v => __obj.updateDynamic("missionProfileArn")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      satelliteArn.foreach(__v => __obj.updateDynamic("satelliteArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContactsRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ListContactsResponse extends js.Object {
    var contactList: js.UndefOr[ContactList]
    var nextToken: js.UndefOr[String]
  }

  object ListContactsResponse {
    @inline
    def apply(
        contactList: js.UndefOr[ContactList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListContactsResponse = {
      val __obj = js.Dynamic.literal()
      contactList.foreach(__v => __obj.updateDynamic("contactList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContactsResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ListDataflowEndpointGroupsRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[String]
  }

  object ListDataflowEndpointGroupsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListDataflowEndpointGroupsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataflowEndpointGroupsRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ListDataflowEndpointGroupsResponse extends js.Object {
    var dataflowEndpointGroupList: js.UndefOr[DataflowEndpointGroupList]
    var nextToken: js.UndefOr[String]
  }

  object ListDataflowEndpointGroupsResponse {
    @inline
    def apply(
        dataflowEndpointGroupList: js.UndefOr[DataflowEndpointGroupList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListDataflowEndpointGroupsResponse = {
      val __obj = js.Dynamic.literal()
      dataflowEndpointGroupList.foreach(__v =>
        __obj.updateDynamic("dataflowEndpointGroupList")(__v.asInstanceOf[js.Any])
      )
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataflowEndpointGroupsResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ListGroundStationsRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[String]
  }

  object ListGroundStationsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListGroundStationsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroundStationsRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ListGroundStationsResponse extends js.Object {
    var groundStationList: js.UndefOr[GroundStationList]
    var nextToken: js.UndefOr[String]
  }

  object ListGroundStationsResponse {
    @inline
    def apply(
        groundStationList: js.UndefOr[GroundStationList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListGroundStationsResponse = {
      val __obj = js.Dynamic.literal()
      groundStationList.foreach(__v => __obj.updateDynamic("groundStationList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroundStationsResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ListMissionProfilesRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[String]
  }

  object ListMissionProfilesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListMissionProfilesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMissionProfilesRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ListMissionProfilesResponse extends js.Object {
    var missionProfileList: js.UndefOr[MissionProfileList]
    var nextToken: js.UndefOr[String]
  }

  object ListMissionProfilesResponse {
    @inline
    def apply(
        missionProfileList: js.UndefOr[MissionProfileList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListMissionProfilesResponse = {
      val __obj = js.Dynamic.literal()
      missionProfileList.foreach(__v => __obj.updateDynamic("missionProfileList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMissionProfilesResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ListSatellitesRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[String]
  }

  object ListSatellitesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListSatellitesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSatellitesRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ListSatellitesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var satellites: js.UndefOr[SatelliteList]
  }

  object ListSatellitesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        satellites: js.UndefOr[SatelliteList] = js.undefined
    ): ListSatellitesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      satellites.foreach(__v => __obj.updateDynamic("satellites")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSatellitesResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: String
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: String
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagsMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagsMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait MissionProfileIdResponse extends js.Object {
    var missionProfileId: js.UndefOr[String]
  }

  object MissionProfileIdResponse {
    @inline
    def apply(
        missionProfileId: js.UndefOr[String] = js.undefined
    ): MissionProfileIdResponse = {
      val __obj = js.Dynamic.literal()
      missionProfileId.foreach(__v => __obj.updateDynamic("missionProfileId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MissionProfileIdResponse]
    }
  }

  /**
    * Item in a list of mission profiles.
    */
  @js.native
  trait MissionProfileListItem extends js.Object {
    var missionProfileArn: js.UndefOr[MissionProfileArn]
    var missionProfileId: js.UndefOr[String]
    var name: js.UndefOr[String]
    var region: js.UndefOr[String]
  }

  object MissionProfileListItem {
    @inline
    def apply(
        missionProfileArn: js.UndefOr[MissionProfileArn] = js.undefined,
        missionProfileId: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        region: js.UndefOr[String] = js.undefined
    ): MissionProfileListItem = {
      val __obj = js.Dynamic.literal()
      missionProfileArn.foreach(__v => __obj.updateDynamic("missionProfileArn")(__v.asInstanceOf[js.Any]))
      missionProfileId.foreach(__v => __obj.updateDynamic("missionProfileId")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MissionProfileListItem]
    }
  }

  object PolarizationEnum {
    val LEFT_HAND  = "LEFT_HAND"
    val NONE       = "NONE"
    val RIGHT_HAND = "RIGHT_HAND"

    val values = js.Object.freeze(js.Array(LEFT_HAND, NONE, RIGHT_HAND))
  }

  /**
    * <p/>
    */
  @js.native
  trait ReserveContactRequest extends js.Object {
    var endTime: Timestamp
    var groundStation: String
    var missionProfileArn: MissionProfileArn
    var satelliteArn: satelliteArn
    var startTime: Timestamp
    var tags: js.UndefOr[TagsMap]
  }

  object ReserveContactRequest {
    @inline
    def apply(
        endTime: Timestamp,
        groundStation: String,
        missionProfileArn: MissionProfileArn,
        satelliteArn: satelliteArn,
        startTime: Timestamp,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): ReserveContactRequest = {
      val __obj = js.Dynamic.literal(
        "endTime"           -> endTime.asInstanceOf[js.Any],
        "groundStation"     -> groundStation.asInstanceOf[js.Any],
        "missionProfileArn" -> missionProfileArn.asInstanceOf[js.Any],
        "satelliteArn"      -> satelliteArn.asInstanceOf[js.Any],
        "startTime"         -> startTime.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReserveContactRequest]
    }
  }

  /**
    * Item in a list of satellites.
    */
  @js.native
  trait SatelliteListItem extends js.Object {
    var noradSatelliteID: js.UndefOr[noradSatelliteID]
    var satelliteArn: js.UndefOr[satelliteArn]
    var satelliteId: js.UndefOr[Uuid]
  }

  object SatelliteListItem {
    @inline
    def apply(
        noradSatelliteID: js.UndefOr[noradSatelliteID] = js.undefined,
        satelliteArn: js.UndefOr[satelliteArn] = js.undefined,
        satelliteId: js.UndefOr[Uuid] = js.undefined
    ): SatelliteListItem = {
      val __obj = js.Dynamic.literal()
      noradSatelliteID.foreach(__v => __obj.updateDynamic("noradSatelliteID")(__v.asInstanceOf[js.Any]))
      satelliteArn.foreach(__v => __obj.updateDynamic("satelliteArn")(__v.asInstanceOf[js.Any]))
      satelliteId.foreach(__v => __obj.updateDynamic("satelliteId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SatelliteListItem]
    }
  }

  /**
    * Information about endpoints.
    */
  @js.native
  trait SecurityDetails extends js.Object {
    var roleArn: RoleArn
    var securityGroupIds: SecurityGroupIdList
    var subnetIds: SubnetList
  }

  object SecurityDetails {
    @inline
    def apply(
        roleArn: RoleArn,
        securityGroupIds: SecurityGroupIdList,
        subnetIds: SubnetList
    ): SecurityDetails = {
      val __obj = js.Dynamic.literal(
        "roleArn"          -> roleArn.asInstanceOf[js.Any],
        "securityGroupIds" -> securityGroupIds.asInstanceOf[js.Any],
        "subnetIds"        -> subnetIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SecurityDetails]
    }
  }

  /**
    * Information about the socket address.
    */
  @js.native
  trait SocketAddress extends js.Object {
    var name: String
    var port: Int
  }

  object SocketAddress {
    @inline
    def apply(
        name: String,
        port: Int
    ): SocketAddress = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "port" -> port.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SocketAddress]
    }
  }

  /**
    * Object that describes a spectral <code>Config</code>.
    */
  @js.native
  trait SpectrumConfig extends js.Object {
    var bandwidth: FrequencyBandwidth
    var centerFrequency: Frequency
    var polarization: js.UndefOr[Polarization]
  }

  object SpectrumConfig {
    @inline
    def apply(
        bandwidth: FrequencyBandwidth,
        centerFrequency: Frequency,
        polarization: js.UndefOr[Polarization] = js.undefined
    ): SpectrumConfig = {
      val __obj = js.Dynamic.literal(
        "bandwidth"       -> bandwidth.asInstanceOf[js.Any],
        "centerFrequency" -> centerFrequency.asInstanceOf[js.Any]
      )

      polarization.foreach(__v => __obj.updateDynamic("polarization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SpectrumConfig]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: String
    var tags: js.UndefOr[TagsMap]
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /**
    * <p>Object that determines whether tracking should be used during a contact
    *          executed with this <code>Config</code> in the mission profile.</p>
    */
  @js.native
  trait TrackingConfig extends js.Object {
    var autotrack: Criticality
  }

  object TrackingConfig {
    @inline
    def apply(
        autotrack: Criticality
    ): TrackingConfig = {
      val __obj = js.Dynamic.literal(
        "autotrack" -> autotrack.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TrackingConfig]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: String
    var tagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
        tagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait UpdateConfigRequest extends js.Object {
    var configData: ConfigTypeData
    var configId: String
    var configType: ConfigCapabilityType
    var name: SafeName
  }

  object UpdateConfigRequest {
    @inline
    def apply(
        configData: ConfigTypeData,
        configId: String,
        configType: ConfigCapabilityType,
        name: SafeName
    ): UpdateConfigRequest = {
      val __obj = js.Dynamic.literal(
        "configData" -> configData.asInstanceOf[js.Any],
        "configId"   -> configId.asInstanceOf[js.Any],
        "configType" -> configType.asInstanceOf[js.Any],
        "name"       -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateConfigRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait UpdateMissionProfileRequest extends js.Object {
    var missionProfileId: String
    var contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds]
    var contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds]
    var dataflowEdges: js.UndefOr[DataflowEdgeList]
    var minimumViableContactDurationSeconds: js.UndefOr[DurationInSeconds]
    var name: js.UndefOr[SafeName]
    var trackingConfigArn: js.UndefOr[ConfigArn]
  }

  object UpdateMissionProfileRequest {
    @inline
    def apply(
        missionProfileId: String,
        contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined,
        contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined,
        dataflowEdges: js.UndefOr[DataflowEdgeList] = js.undefined,
        minimumViableContactDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined,
        name: js.UndefOr[SafeName] = js.undefined,
        trackingConfigArn: js.UndefOr[ConfigArn] = js.undefined
    ): UpdateMissionProfileRequest = {
      val __obj = js.Dynamic.literal(
        "missionProfileId" -> missionProfileId.asInstanceOf[js.Any]
      )

      contactPostPassDurationSeconds.foreach(__v =>
        __obj.updateDynamic("contactPostPassDurationSeconds")(__v.asInstanceOf[js.Any])
      )
      contactPrePassDurationSeconds.foreach(__v =>
        __obj.updateDynamic("contactPrePassDurationSeconds")(__v.asInstanceOf[js.Any])
      )
      dataflowEdges.foreach(__v => __obj.updateDynamic("dataflowEdges")(__v.asInstanceOf[js.Any]))
      minimumViableContactDurationSeconds.foreach(__v =>
        __obj.updateDynamic("minimumViableContactDurationSeconds")(__v.asInstanceOf[js.Any])
      )
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      trackingConfigArn.foreach(__v => __obj.updateDynamic("trackingConfigArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMissionProfileRequest]
    }
  }

  /**
    * Information about an uplink echo <code>Config</code>.
    *          <p>Parameters from the <code>AntennaUplinkConfig</code>, corresponding to the
    *          specified <code>AntennaUplinkConfigArn</code>, are used when this <code>UplinkEchoConfig</code>
    *          is used in a contact.</p>
    */
  @js.native
  trait UplinkEchoConfig extends js.Object {
    var antennaUplinkConfigArn: ConfigArn
    var enabled: Boolean
  }

  object UplinkEchoConfig {
    @inline
    def apply(
        antennaUplinkConfigArn: ConfigArn,
        enabled: Boolean
    ): UplinkEchoConfig = {
      val __obj = js.Dynamic.literal(
        "antennaUplinkConfigArn" -> antennaUplinkConfigArn.asInstanceOf[js.Any],
        "enabled"                -> enabled.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UplinkEchoConfig]
    }
  }

  /**
    * Information about the uplink spectral <code>Config</code>.
    */
  @js.native
  trait UplinkSpectrumConfig extends js.Object {
    var centerFrequency: Frequency
    var polarization: js.UndefOr[Polarization]
  }

  object UplinkSpectrumConfig {
    @inline
    def apply(
        centerFrequency: Frequency,
        polarization: js.UndefOr[Polarization] = js.undefined
    ): UplinkSpectrumConfig = {
      val __obj = js.Dynamic.literal(
        "centerFrequency" -> centerFrequency.asInstanceOf[js.Any]
      )

      polarization.foreach(__v => __obj.updateDynamic("polarization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UplinkSpectrumConfig]
    }
  }
}
