package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object mediaconvert {
  type AacAudioDescriptionBroadcasterMix           = String
  type AacCodecProfile                             = String
  type AacCodingMode                               = String
  type AacRateControlMode                          = String
  type AacRawFormat                                = String
  type AacSpecification                            = String
  type AacVbrQuality                               = String
  type Ac3BitstreamMode                            = String
  type Ac3CodingMode                               = String
  type Ac3DynamicRangeCompressionProfile           = String
  type Ac3LfeFilter                                = String
  type Ac3MetadataControl                          = String
  type AccelerationMode                            = String
  type AfdSignaling                                = String
  type AntiAlias                                   = String
  type AudioCodec                                  = String
  type AudioDefaultSelection                       = String
  type AudioLanguageCodeControl                    = String
  type AudioNormalizationAlgorithm                 = String
  type AudioNormalizationAlgorithmControl          = String
  type AudioNormalizationLoudnessLogging           = String
  type AudioNormalizationPeakCalculation           = String
  type AudioSelectorType                           = String
  type AudioTypeControl                            = String
  type BillingTagsSource                           = String
  type BurninSubtitleAlignment                     = String
  type BurninSubtitleBackgroundColor               = String
  type BurninSubtitleFontColor                     = String
  type BurninSubtitleOutlineColor                  = String
  type BurninSubtitleShadowColor                   = String
  type BurninSubtitleTeletextSpacing               = String
  type CaptionDestinationType                      = String
  type CaptionSourceType                           = String
  type CmafClientCache                             = String
  type CmafCodecSpecification                      = String
  type CmafEncryptionType                          = String
  type CmafInitializationVectorInManifest          = String
  type CmafKeyProviderType                         = String
  type CmafManifestCompression                     = String
  type CmafManifestDurationFormat                  = String
  type CmafSegmentControl                          = String
  type CmafStreamInfResolution                     = String
  type CmafWriteDASHManifest                       = String
  type CmafWriteHLSManifest                        = String
  type ColorMetadata                               = String
  type ColorSpace                                  = String
  type ColorSpaceConversion                        = String
  type ColorSpaceUsage                             = String
  type Commitment                                  = String
  type ContainerType                               = String
  type DashIsoHbbtvCompliance                      = String
  type DashIsoPlaybackDeviceCompatibility          = String
  type DashIsoSegmentControl                       = String
  type DashIsoWriteSegmentTimelineInRepresentation = String
  type DecryptionMode                              = String
  type DeinterlaceAlgorithm                        = String
  type DeinterlacerControl                         = String
  type DeinterlacerMode                            = String
  type DescribeEndpointsMode                       = String
  type DropFrameTimecode                           = String
  type DvbSubtitleAlignment                        = String
  type DvbSubtitleBackgroundColor                  = String
  type DvbSubtitleFontColor                        = String
  type DvbSubtitleOutlineColor                     = String
  type DvbSubtitleShadowColor                      = String
  type DvbSubtitleTeletextSpacing                  = String
  type Eac3AtmosBitstreamMode                      = String
  type Eac3AtmosCodingMode                         = String
  type Eac3AtmosDialogueIntelligence               = String
  type Eac3AtmosDynamicRangeCompressionLine        = String
  type Eac3AtmosDynamicRangeCompressionRf          = String
  type Eac3AtmosMeteringMode                       = String
  type Eac3AtmosStereoDownmix                      = String
  type Eac3AtmosSurroundExMode                     = String
  type Eac3AttenuationControl                      = String
  type Eac3BitstreamMode                           = String
  type Eac3CodingMode                              = String
  type Eac3DcFilter                                = String
  type Eac3DynamicRangeCompressionLine             = String
  type Eac3DynamicRangeCompressionRf               = String
  type Eac3LfeControl                              = String
  type Eac3LfeFilter                               = String
  type Eac3MetadataControl                         = String
  type Eac3PassthroughControl                      = String
  type Eac3PhaseControl                            = String
  type Eac3StereoDownmix                           = String
  type Eac3SurroundExMode                          = String
  type Eac3SurroundMode                            = String
  type EmbeddedConvert608To708                     = String
  type F4vMoovPlacement                            = String
  type FileSourceConvert608To708                   = String
  type FontScript                                  = String
  type H264AdaptiveQuantization                    = String
  type H264CodecLevel                              = String
  type H264CodecProfile                            = String
  type H264DynamicSubGop                           = String
  type H264EntropyEncoding                         = String
  type H264FieldEncoding                           = String
  type H264FlickerAdaptiveQuantization             = String
  type H264FramerateControl                        = String
  type H264FramerateConversionAlgorithm            = String
  type H264GopBReference                           = String
  type H264GopSizeUnits                            = String
  type H264InterlaceMode                           = String
  type H264ParControl                              = String
  type H264QualityTuningLevel                      = String
  type H264RateControlMode                         = String
  type H264RepeatPps                               = String
  type H264SceneChangeDetect                       = String
  type H264SlowPal                                 = String
  type H264SpatialAdaptiveQuantization             = String
  type H264Syntax                                  = String
  type H264Telecine                                = String
  type H264TemporalAdaptiveQuantization            = String
  type H264UnregisteredSeiTimecode                 = String
  type H265AdaptiveQuantization                    = String
  type H265AlternateTransferFunctionSei            = String
  type H265CodecLevel                              = String
  type H265CodecProfile                            = String
  type H265DynamicSubGop                           = String
  type H265FlickerAdaptiveQuantization             = String
  type H265FramerateControl                        = String
  type H265FramerateConversionAlgorithm            = String
  type H265GopBReference                           = String
  type H265GopSizeUnits                            = String
  type H265InterlaceMode                           = String
  type H265ParControl                              = String
  type H265QualityTuningLevel                      = String
  type H265RateControlMode                         = String
  type H265SampleAdaptiveOffsetFilterMode          = String
  type H265SceneChangeDetect                       = String
  type H265SlowPal                                 = String
  type H265SpatialAdaptiveQuantization             = String
  type H265Telecine                                = String
  type H265TemporalAdaptiveQuantization            = String
  type H265TemporalIds                             = String
  type H265Tiles                                   = String
  type H265UnregisteredSeiTimecode                 = String
  type H265WriteMp4PackagingType                   = String
  type HlsAdMarkers                                = String
  type HlsAudioOnlyContainer                       = String
  type HlsAudioTrackType                           = String
  type HlsCaptionLanguageSetting                   = String
  type HlsClientCache                              = String
  type HlsCodecSpecification                       = String
  type HlsDirectoryStructure                       = String
  type HlsEncryptionType                           = String
  type HlsIFrameOnlyManifest                       = String
  type HlsInitializationVectorInManifest           = String
  type HlsKeyProviderType                          = String
  type HlsManifestCompression                      = String
  type HlsManifestDurationFormat                   = String
  type HlsOfflineEncrypted                         = String
  type HlsOutputSelection                          = String
  type HlsProgramDateTime                          = String
  type HlsSegmentControl                           = String
  type HlsStreamInfResolution                      = String
  type HlsTimedMetadataId3Frame                    = String
  type InputDeblockFilter                          = String
  type InputDenoiseFilter                          = String
  type InputFilterEnable                           = String
  type InputPsiControl                             = String
  type InputRotate                                 = String
  type InputTimecodeSource                         = String
  type JobPhase                                    = String
  type JobStatus                                   = String
  type JobTemplateListBy                           = String
  type LanguageCode                                = String
  type M2tsAudioBufferModel                        = String
  type M2tsBufferModel                             = String
  type M2tsEbpAudioInterval                        = String
  type M2tsEbpPlacement                            = String
  type M2tsEsRateInPes                             = String
  type M2tsForceTsVideoEbpOrder                    = String
  type M2tsNielsenId3                              = String
  type M2tsPcrControl                              = String
  type M2tsRateMode                                = String
  type M2tsScte35Source                            = String
  type M2tsSegmentationMarkers                     = String
  type M2tsSegmentationStyle                       = String
  type M3u8NielsenId3                              = String
  type M3u8PcrControl                              = String
  type M3u8Scte35Source                            = String
  type MotionImageInsertionMode                    = String
  type MotionImagePlayback                         = String
  type MovClapAtom                                 = String
  type MovCslgAtom                                 = String
  type MovMpeg2FourCCControl                       = String
  type MovPaddingControl                           = String
  type MovReference                                = String
  type Mp4CslgAtom                                 = String
  type Mp4FreeSpaceBox                             = String
  type Mp4MoovPlacement                            = String
  type Mpeg2AdaptiveQuantization                   = String
  type Mpeg2CodecLevel                             = String
  type Mpeg2CodecProfile                           = String
  type Mpeg2DynamicSubGop                          = String
  type Mpeg2FramerateControl                       = String
  type Mpeg2FramerateConversionAlgorithm           = String
  type Mpeg2GopSizeUnits                           = String
  type Mpeg2InterlaceMode                          = String
  type Mpeg2IntraDcPrecision                       = String
  type Mpeg2ParControl                             = String
  type Mpeg2QualityTuningLevel                     = String
  type Mpeg2RateControlMode                        = String
  type Mpeg2SceneChangeDetect                      = String
  type Mpeg2SlowPal                                = String
  type Mpeg2SpatialAdaptiveQuantization            = String
  type Mpeg2Syntax                                 = String
  type Mpeg2Telecine                               = String
  type Mpeg2TemporalAdaptiveQuantization           = String
  type MsSmoothAudioDeduplication                  = String
  type MsSmoothManifestEncoding                    = String
  type NoiseReducerFilter                          = String
  type Order                                       = String
  type OutputGroupType                             = String
  type OutputSdt                                   = String
  type PresetListBy                                = String
  type PricingPlan                                 = String
  type ProresCodecProfile                          = String
  type ProresFramerateControl                      = String
  type ProresFramerateConversionAlgorithm          = String
  type ProresInterlaceMode                         = String
  type ProresParControl                            = String
  type ProresSlowPal                               = String
  type ProresTelecine                              = String
  type QueueListBy                                 = String
  type QueueStatus                                 = String
  type RenewalType                                 = String
  type ReservationPlanStatus                       = String
  type RespondToAfd                                = String
  type S3ServerSideEncryptionType                  = String
  type ScalingBehavior                             = String
  type SccDestinationFramerate                     = String
  type SimulateReservedQueue                       = String
  type StatusUpdateInterval                        = String
  type TeletextPageType                            = String
  type TimecodeBurninPosition                      = String
  type TimecodeSource                              = String
  type TimedMetadata                               = String
  type TtmlStylePassthrough                        = String
  type Type                                        = String
  type VideoCodec                                  = String
  type VideoTimecodeInsertion                      = String
  type WavFormat                                   = String
  type __doubleMin0                                = Double
  type __doubleMin0Max2147483647                   = Double
  type __doubleMinNegative59Max0                   = Double
  type __doubleMinNegative60Max3                   = Double
  type __doubleMinNegative60MaxNegative1           = Double
  type __doubleMinNegative6Max3                    = Double
  type __integer                                   = Int
  type __integerMin0Max0                           = Int
  type __integerMin0Max10                          = Int
  type __integerMin0Max100                         = Int
  type __integerMin0Max1000                        = Int
  type __integerMin0Max10000                       = Int
  type __integerMin0Max1152000000                  = Int
  type __integerMin0Max128                         = Int
  type __integerMin0Max1466400000                  = Int
  type __integerMin0Max15                          = Int
  type __integerMin0Max16                          = Int
  type __integerMin0Max2147483647                  = Int
  type __integerMin0Max255                         = Int
  type __integerMin0Max3                           = Int
  type __integerMin0Max30                          = Int
  type __integerMin0Max30000                       = Int
  type __integerMin0Max3600                        = Int
  type __integerMin0Max4                           = Int
  type __integerMin0Max47185920                    = Int
  type __integerMin0Max500                         = Int
  type __integerMin0Max50000                       = Int
  type __integerMin0Max65535                       = Int
  type __integerMin0Max7                           = Int
  type __integerMin0Max8                           = Int
  type __integerMin0Max96                          = Int
  type __integerMin0Max99                          = Int
  type __integerMin1000Max1152000000               = Int
  type __integerMin1000Max1466400000               = Int
  type __integerMin1000Max288000000                = Int
  type __integerMin1000Max30000                    = Int
  type __integerMin1000Max300000000                = Int
  type __integerMin10Max48                         = Int
  type __integerMin16Max24                         = Int
  type __integerMin1Max1                           = Int
  type __integerMin1Max10                          = Int
  type __integerMin1Max100                         = Int
  type __integerMin1Max10000000                    = Int
  type __integerMin1Max1001                        = Int
  type __integerMin1Max16                          = Int
  type __integerMin1Max17895697                    = Int
  type __integerMin1Max2                           = Int
  type __integerMin1Max20                          = Int
  type __integerMin1Max2147483640                  = Int
  type __integerMin1Max2147483647                  = Int
  type __integerMin1Max31                          = Int
  type __integerMin1Max32                          = Int
  type __integerMin1Max4                           = Int
  type __integerMin1Max6                           = Int
  type __integerMin1Max8                           = Int
  type __integerMin24Max60000                      = Int
  type __integerMin25Max10000                      = Int
  type __integerMin25Max2000                       = Int
  type __integerMin2Max2147483647                  = Int
  type __integerMin32000Max384000                  = Int
  type __integerMin32000Max48000                   = Int
  type __integerMin32Max2160                       = Int
  type __integerMin32Max4096                       = Int
  type __integerMin32Max8182                       = Int
  type __integerMin384000Max768000                 = Int
  type __integerMin48000Max48000                   = Int
  type __integerMin6000Max1024000                  = Int
  type __integerMin64000Max640000                  = Int
  type __integerMin8000Max192000                   = Int
  type __integerMin8000Max96000                    = Int
  type __integerMin96Max600                        = Int
  type __integerMinNegative1000Max1000             = Int
  type __integerMinNegative180Max180               = Int
  type __integerMinNegative1Max3                   = Int
  type __integerMinNegative2147483648Max2147483647 = Int
  type __integerMinNegative2Max3                   = Int
  type __integerMinNegative50Max50                 = Int
  type __integerMinNegative5Max5                   = Int
  type __integerMinNegative60Max6                  = Int
  type __integerMinNegative70Max0                  = Int
  type __listOfAudioDescription                    = js.Array[AudioDescription]
  type __listOfCaptionDescription                  = js.Array[CaptionDescription]
  type __listOfCaptionDescriptionPreset            = js.Array[CaptionDescriptionPreset]
  type __listOfEndpoint                            = js.Array[Endpoint]
  type __listOfHlsAdMarkers                        = js.Array[HlsAdMarkers]
  type __listOfHlsCaptionLanguageMapping           = js.Array[HlsCaptionLanguageMapping]
  type __listOfId3Insertion                        = js.Array[Id3Insertion]
  type __listOfInput                               = js.Array[Input]
  type __listOfInputClipping                       = js.Array[InputClipping]
  type __listOfInputTemplate                       = js.Array[InputTemplate]
  type __listOfInsertableImage                     = js.Array[InsertableImage]
  type __listOfJob                                 = js.Array[Job]
  type __listOfJobTemplate                         = js.Array[JobTemplate]
  type __listOfOutput                              = js.Array[Output]
  type __listOfOutputChannelMapping                = js.Array[OutputChannelMapping]
  type __listOfOutputDetail                        = js.Array[OutputDetail]
  type __listOfOutputGroup                         = js.Array[OutputGroup]
  type __listOfOutputGroupDetail                   = js.Array[OutputGroupDetail]
  type __listOfPreset                              = js.Array[Preset]
  type __listOfQueue                               = js.Array[Queue]
  type __listOfTeletextPageType                    = js.Array[TeletextPageType]
  type __listOf__integerMin1Max2147483647          = js.Array[__integerMin1Max2147483647]
  type __listOf__integerMin32Max8182               = js.Array[__integerMin32Max8182]
  type __listOf__integerMinNegative60Max6          = js.Array[__integerMinNegative60Max6]
  type __listOf__string                            = js.Array[__string]
  type __listOf__stringMin1                        = js.Array[__stringMin1]
  type __listOf__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12 =
    js.Array[__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12]
  type __listOf__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12 =
    js.Array[__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12]
  type __listOf__stringPatternS3ASSETMAPXml                              = js.Array[__stringPatternS3ASSETMAPXml]
  type __mapOfAudioSelector                                              = js.Dictionary[AudioSelector]
  type __mapOfAudioSelectorGroup                                         = js.Dictionary[AudioSelectorGroup]
  type __mapOfCaptionSelector                                            = js.Dictionary[CaptionSelector]
  type __mapOf__string                                                   = js.Dictionary[__string]
  type __string                                                          = String
  type __stringMin0                                                      = String
  type __stringMin1                                                      = String
  type __stringMin11Max11Pattern01D20305D205D                            = String
  type __stringMin14Max1285PatternS3Mov09Png                             = String
  type __stringMin14PatternS3BmpBMPPngPNG                                = String
  type __stringMin14PatternS3BmpBMPPngPNGTgaTGA                          = String
  type __stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTSmiSMI    = String
  type __stringMin16Max24PatternAZaZ0922AZaZ0916                         = String
  type __stringMin1Max256                                                = String
  type __stringMin24Max512PatternAZaZ0902                                = String
  type __stringMin32Max32Pattern09aFAF32                                 = String
  type __stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12     = String
  type __stringMin3Max3Pattern1809aFAF09aEAE                             = String
  type __stringMin3Max3PatternAZaZ3                                      = String
  type __stringMin9Max19PatternAZ26EastWestCentralNorthSouthEastWest1912 = String
  type __stringPattern                                                   = String
  type __stringPattern010920405090509092                                 = String
  type __stringPattern01D20305D205D                                      = String
  type __stringPattern0940191020191209301                                = String
  type __stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12               = String
  type __stringPatternAZaZ0902                                           = String
  type __stringPatternAZaZ0932                                           = String
  type __stringPatternArnAwsUsGovAcm                                     = String
  type __stringPatternArnAwsUsGovCnKmsAZ26EastWestCentralNorthSouthEastWest1912D12KeyAFAF098AFAF094AFAF094AFAF094AFAF0912 =
    String
  type __stringPatternDD = String
  type __stringPatternHttpHttpsS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLL =
    String
  type __stringPatternHttps                   = String
  type __stringPatternIdentityAZaZ26AZaZ09163 = String
  type __stringPatternS3                      = String
  type __stringPatternS3ASSETMAPXml           = String
  type __stringPatternS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEE =
    String
  type __stringPatternSNManifestConfirmConditionNotificationNS = String
  type __stringPatternSNSignalProcessingNotificationNS         = String
  type __stringPatternW                                        = String
  type __stringPatternWS                                       = String
  type __timestampUnix                                         = js.Date

  implicit final class MediaConvertOps(private val service: MediaConvert) extends AnyVal {
    @inline def associateCertificateFuture(params: AssociateCertificateRequest): Future[AssociateCertificateResponse] =
      service.associateCertificate(params).promise.toFuture
    @inline def cancelJobFuture(params: CancelJobRequest): Future[CancelJobResponse] =
      service.cancelJob(params).promise.toFuture
    @inline def createJobFuture(params: CreateJobRequest): Future[CreateJobResponse] =
      service.createJob(params).promise.toFuture
    @inline def createJobTemplateFuture(params: CreateJobTemplateRequest): Future[CreateJobTemplateResponse] =
      service.createJobTemplate(params).promise.toFuture
    @inline def createPresetFuture(params: CreatePresetRequest): Future[CreatePresetResponse] =
      service.createPreset(params).promise.toFuture
    @inline def createQueueFuture(params: CreateQueueRequest): Future[CreateQueueResponse] =
      service.createQueue(params).promise.toFuture
    @inline def deleteJobTemplateFuture(params: DeleteJobTemplateRequest): Future[DeleteJobTemplateResponse] =
      service.deleteJobTemplate(params).promise.toFuture
    @inline def deletePresetFuture(params: DeletePresetRequest): Future[DeletePresetResponse] =
      service.deletePreset(params).promise.toFuture
    @inline def deleteQueueFuture(params: DeleteQueueRequest): Future[DeleteQueueResponse] =
      service.deleteQueue(params).promise.toFuture
    @inline def describeEndpointsFuture(params: DescribeEndpointsRequest): Future[DescribeEndpointsResponse] =
      service.describeEndpoints(params).promise.toFuture
    @inline def disassociateCertificateFuture(
        params: DisassociateCertificateRequest
    ): Future[DisassociateCertificateResponse]                              = service.disassociateCertificate(params).promise.toFuture
    @inline def getJobFuture(params: GetJobRequest): Future[GetJobResponse] = service.getJob(params).promise.toFuture
    @inline def getJobTemplateFuture(params: GetJobTemplateRequest): Future[GetJobTemplateResponse] =
      service.getJobTemplate(params).promise.toFuture
    @inline def getPresetFuture(params: GetPresetRequest): Future[GetPresetResponse] =
      service.getPreset(params).promise.toFuture
    @inline def getQueueFuture(params: GetQueueRequest): Future[GetQueueResponse] =
      service.getQueue(params).promise.toFuture
    @inline def listJobTemplatesFuture(params: ListJobTemplatesRequest): Future[ListJobTemplatesResponse] =
      service.listJobTemplates(params).promise.toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResponse] =
      service.listJobs(params).promise.toFuture
    @inline def listPresetsFuture(params: ListPresetsRequest): Future[ListPresetsResponse] =
      service.listPresets(params).promise.toFuture
    @inline def listQueuesFuture(params: ListQueuesRequest): Future[ListQueuesResponse] =
      service.listQueues(params).promise.toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    @inline def updateJobTemplateFuture(params: UpdateJobTemplateRequest): Future[UpdateJobTemplateResponse] =
      service.updateJobTemplate(params).promise.toFuture
    @inline def updatePresetFuture(params: UpdatePresetRequest): Future[UpdatePresetResponse] =
      service.updatePreset(params).promise.toFuture
    @inline def updateQueueFuture(params: UpdateQueueRequest): Future[UpdateQueueResponse] =
      service.updateQueue(params).promise.toFuture
  }
}

package mediaconvert {
  @js.native
  @JSImport("aws-sdk", "MediaConvert")
  class MediaConvert() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateCertificate(params: AssociateCertificateRequest): Request[AssociateCertificateResponse] = js.native
    def cancelJob(params: CancelJobRequest): Request[CancelJobResponse]                                  = js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResponse]                                  = js.native
    def createJobTemplate(params: CreateJobTemplateRequest): Request[CreateJobTemplateResponse]          = js.native
    def createPreset(params: CreatePresetRequest): Request[CreatePresetResponse]                         = js.native
    def createQueue(params: CreateQueueRequest): Request[CreateQueueResponse]                            = js.native
    def deleteJobTemplate(params: DeleteJobTemplateRequest): Request[DeleteJobTemplateResponse]          = js.native
    def deletePreset(params: DeletePresetRequest): Request[DeletePresetResponse]                         = js.native
    def deleteQueue(params: DeleteQueueRequest): Request[DeleteQueueResponse]                            = js.native
    def describeEndpoints(params: DescribeEndpointsRequest): Request[DescribeEndpointsResponse]          = js.native
    def disassociateCertificate(params: DisassociateCertificateRequest): Request[DisassociateCertificateResponse] =
      js.native
    def getJob(params: GetJobRequest): Request[GetJobResponse]                                        = js.native
    def getJobTemplate(params: GetJobTemplateRequest): Request[GetJobTemplateResponse]                = js.native
    def getPreset(params: GetPresetRequest): Request[GetPresetResponse]                               = js.native
    def getQueue(params: GetQueueRequest): Request[GetQueueResponse]                                  = js.native
    def listJobTemplates(params: ListJobTemplatesRequest): Request[ListJobTemplatesResponse]          = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResponse]                                  = js.native
    def listPresets(params: ListPresetsRequest): Request[ListPresetsResponse]                         = js.native
    def listQueues(params: ListQueuesRequest): Request[ListQueuesResponse]                            = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                         = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                   = js.native
    def updateJobTemplate(params: UpdateJobTemplateRequest): Request[UpdateJobTemplateResponse]       = js.native
    def updatePreset(params: UpdatePresetRequest): Request[UpdatePresetResponse]                      = js.native
    def updateQueue(params: UpdateQueueRequest): Request[UpdateQueueResponse]                         = js.native
  }

  /**
    * Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio + audio description (AD) as a stereo pair. The value for AudioType will be set to 3, which signals to downstream systems that this stream contains "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does not perform the mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores any values you provide in AudioType and  FollowInputAudioType. Choose NORMAL when the input does not contain pre-mixed audio + audio description (AD). In this case, the encoder will use any values you provide for AudioType and FollowInputAudioType.
    */
  object AacAudioDescriptionBroadcasterMixEnum {
    val BROADCASTER_MIXED_AD = "BROADCASTER_MIXED_AD"
    val NORMAL               = "NORMAL"

    val values = js.Object.freeze(js.Array(BROADCASTER_MIXED_AD, NORMAL))
  }

  /**
    * AAC Profile.
    */
  object AacCodecProfileEnum {
    val LC   = "LC"
    val HEV1 = "HEV1"
    val HEV2 = "HEV2"

    val values = js.Object.freeze(js.Array(LC, HEV1, HEV2))
  }

  /**
    * Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. "1.0 - Audio Description (Receiver Mix)" setting receives a stereo description plus control track and emits a mono AAC encode of the description track, with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
    */
  object AacCodingModeEnum {
    val AD_RECEIVER_MIX = "AD_RECEIVER_MIX"
    val CODING_MODE_1_0 = "CODING_MODE_1_0"
    val CODING_MODE_1_1 = "CODING_MODE_1_1"
    val CODING_MODE_2_0 = "CODING_MODE_2_0"
    val CODING_MODE_5_1 = "CODING_MODE_5_1"

    val values =
      js.Object.freeze(js.Array(AD_RECEIVER_MIX, CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0, CODING_MODE_5_1))
  }

  /**
    * Rate Control Mode.
    */
  object AacRateControlModeEnum {
    val CBR = "CBR"
    val VBR = "VBR"

    val values = js.Object.freeze(js.Array(CBR, VBR))
  }

  /**
    * Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an output, you must choose "No container" for the output container.
    */
  object AacRawFormatEnum {
    val LATM_LOAS = "LATM_LOAS"
    val NONE      = "NONE"

    val values = js.Object.freeze(js.Array(LATM_LOAS, NONE))
  }

  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AAC. The service accepts one of two mutually exclusive groups of AAC settings--VBR and CBR. To select one of these modes, set the value of Bitrate control mode (rateControlMode) to "VBR" or "CBR".  In VBR mode, you control the audio quality with the setting VBR quality (vbrQuality). In CBR mode, you use the setting Bitrate (bitrate). Defaults and valid values depend on the rate control mode.
    */
  @js.native
  trait AacSettings extends js.Object {
    var AudioDescriptionBroadcasterMix: js.UndefOr[AacAudioDescriptionBroadcasterMix]
    var Bitrate: js.UndefOr[__integerMin6000Max1024000]
    var CodecProfile: js.UndefOr[AacCodecProfile]
    var CodingMode: js.UndefOr[AacCodingMode]
    var RateControlMode: js.UndefOr[AacRateControlMode]
    var RawFormat: js.UndefOr[AacRawFormat]
    var SampleRate: js.UndefOr[__integerMin8000Max96000]
    var Specification: js.UndefOr[AacSpecification]
    var VbrQuality: js.UndefOr[AacVbrQuality]
  }

  object AacSettings {
    @inline
    def apply(
        AudioDescriptionBroadcasterMix: js.UndefOr[AacAudioDescriptionBroadcasterMix] = js.undefined,
        Bitrate: js.UndefOr[__integerMin6000Max1024000] = js.undefined,
        CodecProfile: js.UndefOr[AacCodecProfile] = js.undefined,
        CodingMode: js.UndefOr[AacCodingMode] = js.undefined,
        RateControlMode: js.UndefOr[AacRateControlMode] = js.undefined,
        RawFormat: js.UndefOr[AacRawFormat] = js.undefined,
        SampleRate: js.UndefOr[__integerMin8000Max96000] = js.undefined,
        Specification: js.UndefOr[AacSpecification] = js.undefined,
        VbrQuality: js.UndefOr[AacVbrQuality] = js.undefined
    ): AacSettings = {
      val __obj = js.Dynamic.literal()
      AudioDescriptionBroadcasterMix.foreach(
        __v => __obj.updateDynamic("AudioDescriptionBroadcasterMix")(__v.asInstanceOf[js.Any])
      )
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      CodecProfile.foreach(__v => __obj.updateDynamic("CodecProfile")(__v.asInstanceOf[js.Any]))
      CodingMode.foreach(__v => __obj.updateDynamic("CodingMode")(__v.asInstanceOf[js.Any]))
      RateControlMode.foreach(__v => __obj.updateDynamic("RateControlMode")(__v.asInstanceOf[js.Any]))
      RawFormat.foreach(__v => __obj.updateDynamic("RawFormat")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      Specification.foreach(__v => __obj.updateDynamic("Specification")(__v.asInstanceOf[js.Any]))
      VbrQuality.foreach(__v => __obj.updateDynamic("VbrQuality")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AacSettings]
    }
  }

  /**
    * Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
    */
  object AacSpecificationEnum {
    val MPEG2 = "MPEG2"
    val MPEG4 = "MPEG4"

    val values = js.Object.freeze(js.Array(MPEG2, MPEG4))
  }

  /**
    * VBR Quality Level - Only used if rate_control_mode is VBR.
    */
  object AacVbrQualityEnum {
    val LOW         = "LOW"
    val MEDIUM_LOW  = "MEDIUM_LOW"
    val MEDIUM_HIGH = "MEDIUM_HIGH"
    val HIGH        = "HIGH"

    val values = js.Object.freeze(js.Array(LOW, MEDIUM_LOW, MEDIUM_HIGH, HIGH))
  }

  /**
    * Specify the bitstream mode for the AC-3 stream that the encoder emits. For more information about the AC3 bitstream mode, see ATSC A/52-2012 (Annex E).
    */
  object Ac3BitstreamModeEnum {
    val COMPLETE_MAIN     = "COMPLETE_MAIN"
    val COMMENTARY        = "COMMENTARY"
    val DIALOGUE          = "DIALOGUE"
    val EMERGENCY         = "EMERGENCY"
    val HEARING_IMPAIRED  = "HEARING_IMPAIRED"
    val MUSIC_AND_EFFECTS = "MUSIC_AND_EFFECTS"
    val VISUALLY_IMPAIRED = "VISUALLY_IMPAIRED"
    val VOICE_OVER        = "VOICE_OVER"

    val values = js.Object.freeze(
      js.Array(
        COMPLETE_MAIN,
        COMMENTARY,
        DIALOGUE,
        EMERGENCY,
        HEARING_IMPAIRED,
        MUSIC_AND_EFFECTS,
        VISUALLY_IMPAIRED,
        VOICE_OVER
      )
    )
  }

  /**
    * Dolby Digital coding mode. Determines number of channels.
    */
  object Ac3CodingModeEnum {
    val CODING_MODE_1_0     = "CODING_MODE_1_0"
    val CODING_MODE_1_1     = "CODING_MODE_1_1"
    val CODING_MODE_2_0     = "CODING_MODE_2_0"
    val CODING_MODE_3_2_LFE = "CODING_MODE_3_2_LFE"

    val values = js.Object.freeze(js.Array(CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0, CODING_MODE_3_2_LFE))
  }

  /**
    * If set to FILM_STANDARD, adds dynamic range compression signaling to the output bitstream as defined in the Dolby Digital specification.
    */
  object Ac3DynamicRangeCompressionProfileEnum {
    val FILM_STANDARD = "FILM_STANDARD"
    val NONE          = "NONE"

    val values = js.Object.freeze(js.Array(FILM_STANDARD, NONE))
  }

  /**
    * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
    */
  object Ac3LfeFilterEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
    */
  object Ac3MetadataControlEnum {
    val FOLLOW_INPUT   = "FOLLOW_INPUT"
    val USE_CONFIGURED = "USE_CONFIGURED"

    val values = js.Object.freeze(js.Array(FOLLOW_INPUT, USE_CONFIGURED))
  }

  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AC3.
    */
  @js.native
  trait Ac3Settings extends js.Object {
    var Bitrate: js.UndefOr[__integerMin64000Max640000]
    var BitstreamMode: js.UndefOr[Ac3BitstreamMode]
    var CodingMode: js.UndefOr[Ac3CodingMode]
    var Dialnorm: js.UndefOr[__integerMin1Max31]
    var DynamicRangeCompressionProfile: js.UndefOr[Ac3DynamicRangeCompressionProfile]
    var LfeFilter: js.UndefOr[Ac3LfeFilter]
    var MetadataControl: js.UndefOr[Ac3MetadataControl]
    var SampleRate: js.UndefOr[__integerMin48000Max48000]
  }

  object Ac3Settings {
    @inline
    def apply(
        Bitrate: js.UndefOr[__integerMin64000Max640000] = js.undefined,
        BitstreamMode: js.UndefOr[Ac3BitstreamMode] = js.undefined,
        CodingMode: js.UndefOr[Ac3CodingMode] = js.undefined,
        Dialnorm: js.UndefOr[__integerMin1Max31] = js.undefined,
        DynamicRangeCompressionProfile: js.UndefOr[Ac3DynamicRangeCompressionProfile] = js.undefined,
        LfeFilter: js.UndefOr[Ac3LfeFilter] = js.undefined,
        MetadataControl: js.UndefOr[Ac3MetadataControl] = js.undefined,
        SampleRate: js.UndefOr[__integerMin48000Max48000] = js.undefined
    ): Ac3Settings = {
      val __obj = js.Dynamic.literal()
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      BitstreamMode.foreach(__v => __obj.updateDynamic("BitstreamMode")(__v.asInstanceOf[js.Any]))
      CodingMode.foreach(__v => __obj.updateDynamic("CodingMode")(__v.asInstanceOf[js.Any]))
      Dialnorm.foreach(__v => __obj.updateDynamic("Dialnorm")(__v.asInstanceOf[js.Any]))
      DynamicRangeCompressionProfile.foreach(
        __v => __obj.updateDynamic("DynamicRangeCompressionProfile")(__v.asInstanceOf[js.Any])
      )
      LfeFilter.foreach(__v => __obj.updateDynamic("LfeFilter")(__v.asInstanceOf[js.Any]))
      MetadataControl.foreach(__v => __obj.updateDynamic("MetadataControl")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Ac3Settings]
    }
  }

  /**
    * Enable Acceleration (AccelerationMode) on any job that you want processed with accelerated transcoding.
    */
  object AccelerationModeEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Accelerated transcoding can significantly speed up jobs with long, visually complex content. Outputs that use this feature incur pro-tier pricing. For information about feature limitations, see the AWS Elemental MediaConvert User Guide.
    */
  @js.native
  trait AccelerationSettings extends js.Object {
    var Mode: AccelerationMode
  }

  object AccelerationSettings {
    @inline
    def apply(
        Mode: AccelerationMode
    ): AccelerationSettings = {
      val __obj = js.Dynamic.literal(
        "Mode" -> Mode.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AccelerationSettings]
    }
  }

  /**
    * This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert AFD signaling (AfdSignaling) to specify whether the service includes AFD values in the output video data and what those values are. * Choose None to remove all AFD values from this output. * Choose Fixed to ignore input AFD values and instead encode the value specified in the job. * Choose Auto to calculate output AFD values based on the input AFD scaler data.
    */
  object AfdSignalingEnum {
    val NONE  = "NONE"
    val AUTO  = "AUTO"
    val FIXED = "FIXED"

    val values = js.Object.freeze(js.Array(NONE, AUTO, FIXED))
  }

  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AIFF.
    */
  @js.native
  trait AiffSettings extends js.Object {
    var BitDepth: js.UndefOr[__integerMin16Max24]
    var Channels: js.UndefOr[__integerMin1Max2]
    var SampleRate: js.UndefOr[__integerMin8000Max192000]
  }

  object AiffSettings {
    @inline
    def apply(
        BitDepth: js.UndefOr[__integerMin16Max24] = js.undefined,
        Channels: js.UndefOr[__integerMin1Max2] = js.undefined,
        SampleRate: js.UndefOr[__integerMin8000Max192000] = js.undefined
    ): AiffSettings = {
      val __obj = js.Dynamic.literal()
      BitDepth.foreach(__v => __obj.updateDynamic("BitDepth")(__v.asInstanceOf[js.Any]))
      Channels.foreach(__v => __obj.updateDynamic("Channels")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AiffSettings]
    }
  }

  /**
    * Settings for ancillary captions source.
    */
  @js.native
  trait AncillarySourceSettings extends js.Object {
    var SourceAncillaryChannelNumber: js.UndefOr[__integerMin1Max4]
  }

  object AncillarySourceSettings {
    @inline
    def apply(
        SourceAncillaryChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined
    ): AncillarySourceSettings = {
      val __obj = js.Dynamic.literal()
      SourceAncillaryChannelNumber.foreach(
        __v => __obj.updateDynamic("SourceAncillaryChannelNumber")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[AncillarySourceSettings]
    }
  }

  /**
    * The anti-alias filter is automatically applied to all outputs. The service no longer accepts the value DISABLED for AntiAlias. If you specify that in your job, the service will ignore the setting.
    */
  object AntiAliasEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  @js.native
  trait AssociateCertificateRequest extends js.Object {
    var Arn: __string
  }

  object AssociateCertificateRequest {
    @inline
    def apply(
        Arn: __string
    ): AssociateCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateCertificateRequest]
    }
  }

  @js.native
  trait AssociateCertificateResponse extends js.Object {}

  object AssociateCertificateResponse {
    @inline
    def apply(
        ): AssociateCertificateResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateCertificateResponse]
    }
  }

  /**
    * Type of Audio codec.
    */
  object AudioCodecEnum {
    val AAC         = "AAC"
    val MP2         = "MP2"
    val WAV         = "WAV"
    val AIFF        = "AIFF"
    val AC3         = "AC3"
    val EAC3        = "EAC3"
    val EAC3_ATMOS  = "EAC3_ATMOS"
    val PASSTHROUGH = "PASSTHROUGH"

    val values = js.Object.freeze(js.Array(AAC, MP2, WAV, AIFF, AC3, EAC3, EAC3_ATMOS, PASSTHROUGH))
  }

  /**
    * Audio codec settings (CodecSettings) under (AudioDescriptions) contains the group of settings related to audio encoding. The settings in this group vary depending on the value that you choose for Audio codec (Codec). For each codec enum that you choose, define the corresponding settings object. The following lists the codec enum, settings object pairs. * AAC, AacSettings * MP2, Mp2Settings * WAV, WavSettings * AIFF, AiffSettings * AC3, Ac3Settings * EAC3, Eac3Settings * EAC3_ATMOS, Eac3AtmosSettings
    */
  @js.native
  trait AudioCodecSettings extends js.Object {
    var AacSettings: js.UndefOr[AacSettings]
    var Ac3Settings: js.UndefOr[Ac3Settings]
    var AiffSettings: js.UndefOr[AiffSettings]
    var Codec: js.UndefOr[AudioCodec]
    var Eac3AtmosSettings: js.UndefOr[Eac3AtmosSettings]
    var Eac3Settings: js.UndefOr[Eac3Settings]
    var Mp2Settings: js.UndefOr[Mp2Settings]
    var WavSettings: js.UndefOr[WavSettings]
  }

  object AudioCodecSettings {
    @inline
    def apply(
        AacSettings: js.UndefOr[AacSettings] = js.undefined,
        Ac3Settings: js.UndefOr[Ac3Settings] = js.undefined,
        AiffSettings: js.UndefOr[AiffSettings] = js.undefined,
        Codec: js.UndefOr[AudioCodec] = js.undefined,
        Eac3AtmosSettings: js.UndefOr[Eac3AtmosSettings] = js.undefined,
        Eac3Settings: js.UndefOr[Eac3Settings] = js.undefined,
        Mp2Settings: js.UndefOr[Mp2Settings] = js.undefined,
        WavSettings: js.UndefOr[WavSettings] = js.undefined
    ): AudioCodecSettings = {
      val __obj = js.Dynamic.literal()
      AacSettings.foreach(__v => __obj.updateDynamic("AacSettings")(__v.asInstanceOf[js.Any]))
      Ac3Settings.foreach(__v => __obj.updateDynamic("Ac3Settings")(__v.asInstanceOf[js.Any]))
      AiffSettings.foreach(__v => __obj.updateDynamic("AiffSettings")(__v.asInstanceOf[js.Any]))
      Codec.foreach(__v => __obj.updateDynamic("Codec")(__v.asInstanceOf[js.Any]))
      Eac3AtmosSettings.foreach(__v => __obj.updateDynamic("Eac3AtmosSettings")(__v.asInstanceOf[js.Any]))
      Eac3Settings.foreach(__v => __obj.updateDynamic("Eac3Settings")(__v.asInstanceOf[js.Any]))
      Mp2Settings.foreach(__v => __obj.updateDynamic("Mp2Settings")(__v.asInstanceOf[js.Any]))
      WavSettings.foreach(__v => __obj.updateDynamic("WavSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioCodecSettings]
    }
  }

  /**
    * Enable this setting on one audio selector to set it as the default for the job. The service uses this default for outputs where it can't find the specified input audio. If you don't set a default, those outputs have no audio.
    */
  object AudioDefaultSelectionEnum {
    val DEFAULT     = "DEFAULT"
    val NOT_DEFAULT = "NOT_DEFAULT"

    val values = js.Object.freeze(js.Array(DEFAULT, NOT_DEFAULT))
  }

  /**
    * Description of audio output
    */
  @js.native
  trait AudioDescription extends js.Object {
    var AudioNormalizationSettings: js.UndefOr[AudioNormalizationSettings]
    var AudioSourceName: js.UndefOr[__string]
    var AudioType: js.UndefOr[__integerMin0Max255]
    var AudioTypeControl: js.UndefOr[AudioTypeControl]
    var CodecSettings: js.UndefOr[AudioCodecSettings]
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LanguageCodeControl: js.UndefOr[AudioLanguageCodeControl]
    var RemixSettings: js.UndefOr[RemixSettings]
    var StreamName: js.UndefOr[__stringPatternWS]
  }

  object AudioDescription {
    @inline
    def apply(
        AudioNormalizationSettings: js.UndefOr[AudioNormalizationSettings] = js.undefined,
        AudioSourceName: js.UndefOr[__string] = js.undefined,
        AudioType: js.UndefOr[__integerMin0Max255] = js.undefined,
        AudioTypeControl: js.UndefOr[AudioTypeControl] = js.undefined,
        CodecSettings: js.UndefOr[AudioCodecSettings] = js.undefined,
        CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LanguageCodeControl: js.UndefOr[AudioLanguageCodeControl] = js.undefined,
        RemixSettings: js.UndefOr[RemixSettings] = js.undefined,
        StreamName: js.UndefOr[__stringPatternWS] = js.undefined
    ): AudioDescription = {
      val __obj = js.Dynamic.literal()
      AudioNormalizationSettings.foreach(
        __v => __obj.updateDynamic("AudioNormalizationSettings")(__v.asInstanceOf[js.Any])
      )
      AudioSourceName.foreach(__v => __obj.updateDynamic("AudioSourceName")(__v.asInstanceOf[js.Any]))
      AudioType.foreach(__v => __obj.updateDynamic("AudioType")(__v.asInstanceOf[js.Any]))
      AudioTypeControl.foreach(__v => __obj.updateDynamic("AudioTypeControl")(__v.asInstanceOf[js.Any]))
      CodecSettings.foreach(__v => __obj.updateDynamic("CodecSettings")(__v.asInstanceOf[js.Any]))
      CustomLanguageCode.foreach(__v => __obj.updateDynamic("CustomLanguageCode")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LanguageCodeControl.foreach(__v => __obj.updateDynamic("LanguageCodeControl")(__v.asInstanceOf[js.Any]))
      RemixSettings.foreach(__v => __obj.updateDynamic("RemixSettings")(__v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.updateDynamic("StreamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioDescription]
    }
  }

  /**
    * Choosing FOLLOW_INPUT will cause the ISO 639 language code of the output to follow the ISO 639 language code of the input. The language specified for languageCode' will be used when USE_CONFIGURED is selected or when FOLLOW_INPUT is selected but there is no ISO 639 language code specified by the input.
    */
  object AudioLanguageCodeControlEnum {
    val FOLLOW_INPUT   = "FOLLOW_INPUT"
    val USE_CONFIGURED = "USE_CONFIGURED"

    val values = js.Object.freeze(js.Array(FOLLOW_INPUT, USE_CONFIGURED))
  }

  /**
    * Choose one of the following audio normalization algorithms: ITU-R BS.1770-1: Ungated loudness. A measurement of ungated average loudness for an entire piece of content, suitable for measurement of short-form content under ATSC recommendation A/85. Supports up to 5.1 audio channels. ITU-R BS.1770-2: Gated loudness. A measurement of gated average loudness compliant with the requirements of EBU-R128. Supports up to 5.1 audio channels. ITU-R BS.1770-3: Modified peak. The same loudness measurement algorithm as 1770-2, with an updated true peak measurement. ITU-R BS.1770-4: Higher channel count. Allows for more audio channels than the other algorithms, including configurations such as 7.1.
    */
  object AudioNormalizationAlgorithmEnum {
    val ITU_BS_1770_1 = "ITU_BS_1770_1"
    val ITU_BS_1770_2 = "ITU_BS_1770_2"
    val ITU_BS_1770_3 = "ITU_BS_1770_3"
    val ITU_BS_1770_4 = "ITU_BS_1770_4"

    val values = js.Object.freeze(js.Array(ITU_BS_1770_1, ITU_BS_1770_2, ITU_BS_1770_3, ITU_BS_1770_4))
  }

  /**
    * When enabled the output audio is corrected using the chosen algorithm. If disabled, the audio will be measured but not adjusted.
    */
  object AudioNormalizationAlgorithmControlEnum {
    val CORRECT_AUDIO = "CORRECT_AUDIO"
    val MEASURE_ONLY  = "MEASURE_ONLY"

    val values = js.Object.freeze(js.Array(CORRECT_AUDIO, MEASURE_ONLY))
  }

  /**
    * If set to LOG, log each output's audio track loudness to a CSV file.
    */
  object AudioNormalizationLoudnessLoggingEnum {
    val LOG      = "LOG"
    val DONT_LOG = "DONT_LOG"

    val values = js.Object.freeze(js.Array(LOG, DONT_LOG))
  }

  /**
    * If set to TRUE_PEAK, calculate and log the TruePeak for each output's audio track loudness.
    */
  object AudioNormalizationPeakCalculationEnum {
    val TRUE_PEAK = "TRUE_PEAK"
    val NONE      = "NONE"

    val values = js.Object.freeze(js.Array(TRUE_PEAK, NONE))
  }

  /**
    * Advanced audio normalization settings. Ignore these settings unless you need to comply with a loudness standard.
    */
  @js.native
  trait AudioNormalizationSettings extends js.Object {
    var Algorithm: js.UndefOr[AudioNormalizationAlgorithm]
    var AlgorithmControl: js.UndefOr[AudioNormalizationAlgorithmControl]
    var CorrectionGateLevel: js.UndefOr[__integerMinNegative70Max0]
    var LoudnessLogging: js.UndefOr[AudioNormalizationLoudnessLogging]
    var PeakCalculation: js.UndefOr[AudioNormalizationPeakCalculation]
    var TargetLkfs: js.UndefOr[__doubleMinNegative59Max0]
  }

  object AudioNormalizationSettings {
    @inline
    def apply(
        Algorithm: js.UndefOr[AudioNormalizationAlgorithm] = js.undefined,
        AlgorithmControl: js.UndefOr[AudioNormalizationAlgorithmControl] = js.undefined,
        CorrectionGateLevel: js.UndefOr[__integerMinNegative70Max0] = js.undefined,
        LoudnessLogging: js.UndefOr[AudioNormalizationLoudnessLogging] = js.undefined,
        PeakCalculation: js.UndefOr[AudioNormalizationPeakCalculation] = js.undefined,
        TargetLkfs: js.UndefOr[__doubleMinNegative59Max0] = js.undefined
    ): AudioNormalizationSettings = {
      val __obj = js.Dynamic.literal()
      Algorithm.foreach(__v => __obj.updateDynamic("Algorithm")(__v.asInstanceOf[js.Any]))
      AlgorithmControl.foreach(__v => __obj.updateDynamic("AlgorithmControl")(__v.asInstanceOf[js.Any]))
      CorrectionGateLevel.foreach(__v => __obj.updateDynamic("CorrectionGateLevel")(__v.asInstanceOf[js.Any]))
      LoudnessLogging.foreach(__v => __obj.updateDynamic("LoudnessLogging")(__v.asInstanceOf[js.Any]))
      PeakCalculation.foreach(__v => __obj.updateDynamic("PeakCalculation")(__v.asInstanceOf[js.Any]))
      TargetLkfs.foreach(__v => __obj.updateDynamic("TargetLkfs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioNormalizationSettings]
    }
  }

  /**
    * Selector for Audio
    */
  @js.native
  trait AudioSelector extends js.Object {
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3]
    var DefaultSelection: js.UndefOr[AudioDefaultSelection]
    var ExternalAudioFileInput: js.UndefOr[
      __stringPatternS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEE
    ]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Offset: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var Pids: js.UndefOr[__listOf__integerMin1Max2147483647]
    var ProgramSelection: js.UndefOr[__integerMin0Max8]
    var RemixSettings: js.UndefOr[RemixSettings]
    var SelectorType: js.UndefOr[AudioSelectorType]
    var Tracks: js.UndefOr[__listOf__integerMin1Max2147483647]
  }

  object AudioSelector {
    @inline
    def apply(
        CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined,
        DefaultSelection: js.UndefOr[AudioDefaultSelection] = js.undefined,
        ExternalAudioFileInput: js.UndefOr[
          __stringPatternS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEE
        ] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Offset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        Pids: js.UndefOr[__listOf__integerMin1Max2147483647] = js.undefined,
        ProgramSelection: js.UndefOr[__integerMin0Max8] = js.undefined,
        RemixSettings: js.UndefOr[RemixSettings] = js.undefined,
        SelectorType: js.UndefOr[AudioSelectorType] = js.undefined,
        Tracks: js.UndefOr[__listOf__integerMin1Max2147483647] = js.undefined
    ): AudioSelector = {
      val __obj = js.Dynamic.literal()
      CustomLanguageCode.foreach(__v => __obj.updateDynamic("CustomLanguageCode")(__v.asInstanceOf[js.Any]))
      DefaultSelection.foreach(__v => __obj.updateDynamic("DefaultSelection")(__v.asInstanceOf[js.Any]))
      ExternalAudioFileInput.foreach(__v => __obj.updateDynamic("ExternalAudioFileInput")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      Offset.foreach(__v => __obj.updateDynamic("Offset")(__v.asInstanceOf[js.Any]))
      Pids.foreach(__v => __obj.updateDynamic("Pids")(__v.asInstanceOf[js.Any]))
      ProgramSelection.foreach(__v => __obj.updateDynamic("ProgramSelection")(__v.asInstanceOf[js.Any]))
      RemixSettings.foreach(__v => __obj.updateDynamic("RemixSettings")(__v.asInstanceOf[js.Any]))
      SelectorType.foreach(__v => __obj.updateDynamic("SelectorType")(__v.asInstanceOf[js.Any]))
      Tracks.foreach(__v => __obj.updateDynamic("Tracks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioSelector]
    }
  }

  /**
    * Group of Audio Selectors
    */
  @js.native
  trait AudioSelectorGroup extends js.Object {
    var AudioSelectorNames: js.UndefOr[__listOf__stringMin1]
  }

  object AudioSelectorGroup {
    @inline
    def apply(
        AudioSelectorNames: js.UndefOr[__listOf__stringMin1] = js.undefined
    ): AudioSelectorGroup = {
      val __obj = js.Dynamic.literal()
      AudioSelectorNames.foreach(__v => __obj.updateDynamic("AudioSelectorNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioSelectorGroup]
    }
  }

  /**
    * Specifies the type of the audio selector.
    */
  object AudioSelectorTypeEnum {
    val PID           = "PID"
    val TRACK         = "TRACK"
    val LANGUAGE_CODE = "LANGUAGE_CODE"

    val values = js.Object.freeze(js.Array(PID, TRACK, LANGUAGE_CODE))
  }

  /**
    * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through to the output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the output. Otherwise the value in Audio Type is included in the output. Note that this field and audioType are both ignored if audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
    */
  object AudioTypeControlEnum {
    val FOLLOW_INPUT   = "FOLLOW_INPUT"
    val USE_CONFIGURED = "USE_CONFIGURED"

    val values = js.Object.freeze(js.Array(FOLLOW_INPUT, USE_CONFIGURED))
  }

  /**
    * Settings for Avail Blanking
    */
  @js.native
  trait AvailBlanking extends js.Object {
    var AvailBlankingImage: js.UndefOr[__stringMin14PatternS3BmpBMPPngPNG]
  }

  object AvailBlanking {
    @inline
    def apply(
        AvailBlankingImage: js.UndefOr[__stringMin14PatternS3BmpBMPPngPNG] = js.undefined
    ): AvailBlanking = {
      val __obj = js.Dynamic.literal()
      AvailBlankingImage.foreach(__v => __obj.updateDynamic("AvailBlankingImage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvailBlanking]
    }
  }

  /**
    * Optional. Choose a tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs on any billing report that you set up. Any transcoding outputs that don't have an associated tag will appear in your billing report unsorted. If you don't choose a valid value for this field, your job outputs will appear on the billing report unsorted.
    */
  object BillingTagsSourceEnum {
    val QUEUE        = "QUEUE"
    val PRESET       = "PRESET"
    val JOB_TEMPLATE = "JOB_TEMPLATE"

    val values = js.Object.freeze(js.Array(QUEUE, PRESET, JOB_TEMPLATE))
  }

  /**
    * Burn-In Destination Settings.
    */
  @js.native
  trait BurninDestinationSettings extends js.Object {
    var Alignment: js.UndefOr[BurninSubtitleAlignment]
    var BackgroundColor: js.UndefOr[BurninSubtitleBackgroundColor]
    var BackgroundOpacity: js.UndefOr[__integerMin0Max255]
    var FontColor: js.UndefOr[BurninSubtitleFontColor]
    var FontOpacity: js.UndefOr[__integerMin0Max255]
    var FontResolution: js.UndefOr[__integerMin96Max600]
    var FontScript: js.UndefOr[FontScript]
    var FontSize: js.UndefOr[__integerMin0Max96]
    var OutlineColor: js.UndefOr[BurninSubtitleOutlineColor]
    var OutlineSize: js.UndefOr[__integerMin0Max10]
    var ShadowColor: js.UndefOr[BurninSubtitleShadowColor]
    var ShadowOpacity: js.UndefOr[__integerMin0Max255]
    var ShadowXOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var ShadowYOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var TeletextSpacing: js.UndefOr[BurninSubtitleTeletextSpacing]
    var XPosition: js.UndefOr[__integerMin0Max2147483647]
    var YPosition: js.UndefOr[__integerMin0Max2147483647]
  }

  object BurninDestinationSettings {
    @inline
    def apply(
        Alignment: js.UndefOr[BurninSubtitleAlignment] = js.undefined,
        BackgroundColor: js.UndefOr[BurninSubtitleBackgroundColor] = js.undefined,
        BackgroundOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        FontColor: js.UndefOr[BurninSubtitleFontColor] = js.undefined,
        FontOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        FontResolution: js.UndefOr[__integerMin96Max600] = js.undefined,
        FontScript: js.UndefOr[FontScript] = js.undefined,
        FontSize: js.UndefOr[__integerMin0Max96] = js.undefined,
        OutlineColor: js.UndefOr[BurninSubtitleOutlineColor] = js.undefined,
        OutlineSize: js.UndefOr[__integerMin0Max10] = js.undefined,
        ShadowColor: js.UndefOr[BurninSubtitleShadowColor] = js.undefined,
        ShadowOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        ShadowXOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        ShadowYOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        TeletextSpacing: js.UndefOr[BurninSubtitleTeletextSpacing] = js.undefined,
        XPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        YPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    ): BurninDestinationSettings = {
      val __obj = js.Dynamic.literal()
      Alignment.foreach(__v => __obj.updateDynamic("Alignment")(__v.asInstanceOf[js.Any]))
      BackgroundColor.foreach(__v => __obj.updateDynamic("BackgroundColor")(__v.asInstanceOf[js.Any]))
      BackgroundOpacity.foreach(__v => __obj.updateDynamic("BackgroundOpacity")(__v.asInstanceOf[js.Any]))
      FontColor.foreach(__v => __obj.updateDynamic("FontColor")(__v.asInstanceOf[js.Any]))
      FontOpacity.foreach(__v => __obj.updateDynamic("FontOpacity")(__v.asInstanceOf[js.Any]))
      FontResolution.foreach(__v => __obj.updateDynamic("FontResolution")(__v.asInstanceOf[js.Any]))
      FontScript.foreach(__v => __obj.updateDynamic("FontScript")(__v.asInstanceOf[js.Any]))
      FontSize.foreach(__v => __obj.updateDynamic("FontSize")(__v.asInstanceOf[js.Any]))
      OutlineColor.foreach(__v => __obj.updateDynamic("OutlineColor")(__v.asInstanceOf[js.Any]))
      OutlineSize.foreach(__v => __obj.updateDynamic("OutlineSize")(__v.asInstanceOf[js.Any]))
      ShadowColor.foreach(__v => __obj.updateDynamic("ShadowColor")(__v.asInstanceOf[js.Any]))
      ShadowOpacity.foreach(__v => __obj.updateDynamic("ShadowOpacity")(__v.asInstanceOf[js.Any]))
      ShadowXOffset.foreach(__v => __obj.updateDynamic("ShadowXOffset")(__v.asInstanceOf[js.Any]))
      ShadowYOffset.foreach(__v => __obj.updateDynamic("ShadowYOffset")(__v.asInstanceOf[js.Any]))
      TeletextSpacing.foreach(__v => __obj.updateDynamic("TeletextSpacing")(__v.asInstanceOf[js.Any]))
      XPosition.foreach(__v => __obj.updateDynamic("XPosition")(__v.asInstanceOf[js.Any]))
      YPosition.foreach(__v => __obj.updateDynamic("YPosition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BurninDestinationSettings]
    }
  }

  /**
    * If no explicit x_position or y_position is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  object BurninSubtitleAlignmentEnum {
    val CENTERED = "CENTERED"
    val LEFT     = "LEFT"

    val values = js.Object.freeze(js.Array(CENTERED, LEFT))
  }

  /**
    * Specifies the color of the rectangle behind the captions.
    * All burn-in and DVB-Sub font settings must match.
    */
  object BurninSubtitleBackgroundColorEnum {
    val NONE  = "NONE"
    val BLACK = "BLACK"
    val WHITE = "WHITE"

    val values = js.Object.freeze(js.Array(NONE, BLACK, WHITE))
  }

  /**
    * Specifies the color of the burned-in captions. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  object BurninSubtitleFontColorEnum {
    val WHITE  = "WHITE"
    val BLACK  = "BLACK"
    val YELLOW = "YELLOW"
    val RED    = "RED"
    val GREEN  = "GREEN"
    val BLUE   = "BLUE"

    val values = js.Object.freeze(js.Array(WHITE, BLACK, YELLOW, RED, GREEN, BLUE))
  }

  /**
    * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  object BurninSubtitleOutlineColorEnum {
    val BLACK  = "BLACK"
    val WHITE  = "WHITE"
    val YELLOW = "YELLOW"
    val RED    = "RED"
    val GREEN  = "GREEN"
    val BLUE   = "BLUE"

    val values = js.Object.freeze(js.Array(BLACK, WHITE, YELLOW, RED, GREEN, BLUE))
  }

  /**
    * Specifies the color of the shadow cast by the captions.
    * All burn-in and DVB-Sub font settings must match.
    */
  object BurninSubtitleShadowColorEnum {
    val NONE  = "NONE"
    val BLACK = "BLACK"
    val WHITE = "WHITE"

    val values = js.Object.freeze(js.Array(NONE, BLACK, WHITE))
  }

  /**
    * Only applies to jobs with input captions in Teletext or STL formats. Specify whether the spacing between letters in your captions is set by the captions grid or varies depending on letter width. Choose fixed grid to conform to the spacing specified in the captions file more accurately. Choose proportional to make the text easier to read if the captions are closed caption.
    */
  object BurninSubtitleTeletextSpacingEnum {
    val FIXED_GRID   = "FIXED_GRID"
    val PROPORTIONAL = "PROPORTIONAL"

    val values = js.Object.freeze(js.Array(FIXED_GRID, PROPORTIONAL))
  }

  @js.native
  trait CancelJobRequest extends js.Object {
    var Id: __string
  }

  object CancelJobRequest {
    @inline
    def apply(
        Id: __string
    ): CancelJobRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelJobRequest]
    }
  }

  @js.native
  trait CancelJobResponse extends js.Object {}

  object CancelJobResponse {
    @inline
    def apply(
        ): CancelJobResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CancelJobResponse]
    }
  }

  /**
    * Description of Caption output
    */
  @js.native
  trait CaptionDescription extends js.Object {
    var CaptionSelectorName: js.UndefOr[__stringMin1]
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3]
    var DestinationSettings: js.UndefOr[CaptionDestinationSettings]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LanguageDescription: js.UndefOr[__string]
  }

  object CaptionDescription {
    @inline
    def apply(
        CaptionSelectorName: js.UndefOr[__stringMin1] = js.undefined,
        CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined,
        DestinationSettings: js.UndefOr[CaptionDestinationSettings] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LanguageDescription: js.UndefOr[__string] = js.undefined
    ): CaptionDescription = {
      val __obj = js.Dynamic.literal()
      CaptionSelectorName.foreach(__v => __obj.updateDynamic("CaptionSelectorName")(__v.asInstanceOf[js.Any]))
      CustomLanguageCode.foreach(__v => __obj.updateDynamic("CustomLanguageCode")(__v.asInstanceOf[js.Any]))
      DestinationSettings.foreach(__v => __obj.updateDynamic("DestinationSettings")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LanguageDescription.foreach(__v => __obj.updateDynamic("LanguageDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptionDescription]
    }
  }

  /**
    * Caption Description for preset
    */
  @js.native
  trait CaptionDescriptionPreset extends js.Object {
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3]
    var DestinationSettings: js.UndefOr[CaptionDestinationSettings]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LanguageDescription: js.UndefOr[__string]
  }

  object CaptionDescriptionPreset {
    @inline
    def apply(
        CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined,
        DestinationSettings: js.UndefOr[CaptionDestinationSettings] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LanguageDescription: js.UndefOr[__string] = js.undefined
    ): CaptionDescriptionPreset = {
      val __obj = js.Dynamic.literal()
      CustomLanguageCode.foreach(__v => __obj.updateDynamic("CustomLanguageCode")(__v.asInstanceOf[js.Any]))
      DestinationSettings.foreach(__v => __obj.updateDynamic("DestinationSettings")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LanguageDescription.foreach(__v => __obj.updateDynamic("LanguageDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptionDescriptionPreset]
    }
  }

  /**
    * Specific settings required by destination type. Note that burnin_destination_settings are not available if the source of the caption data is Embedded or Teletext.
    */
  @js.native
  trait CaptionDestinationSettings extends js.Object {
    var BurninDestinationSettings: js.UndefOr[BurninDestinationSettings]
    var DestinationType: js.UndefOr[CaptionDestinationType]
    var DvbSubDestinationSettings: js.UndefOr[DvbSubDestinationSettings]
    var EmbeddedDestinationSettings: js.UndefOr[EmbeddedDestinationSettings]
    var SccDestinationSettings: js.UndefOr[SccDestinationSettings]
    var TeletextDestinationSettings: js.UndefOr[TeletextDestinationSettings]
    var TtmlDestinationSettings: js.UndefOr[TtmlDestinationSettings]
  }

  object CaptionDestinationSettings {
    @inline
    def apply(
        BurninDestinationSettings: js.UndefOr[BurninDestinationSettings] = js.undefined,
        DestinationType: js.UndefOr[CaptionDestinationType] = js.undefined,
        DvbSubDestinationSettings: js.UndefOr[DvbSubDestinationSettings] = js.undefined,
        EmbeddedDestinationSettings: js.UndefOr[EmbeddedDestinationSettings] = js.undefined,
        SccDestinationSettings: js.UndefOr[SccDestinationSettings] = js.undefined,
        TeletextDestinationSettings: js.UndefOr[TeletextDestinationSettings] = js.undefined,
        TtmlDestinationSettings: js.UndefOr[TtmlDestinationSettings] = js.undefined
    ): CaptionDestinationSettings = {
      val __obj = js.Dynamic.literal()
      BurninDestinationSettings.foreach(
        __v => __obj.updateDynamic("BurninDestinationSettings")(__v.asInstanceOf[js.Any])
      )
      DestinationType.foreach(__v => __obj.updateDynamic("DestinationType")(__v.asInstanceOf[js.Any]))
      DvbSubDestinationSettings.foreach(
        __v => __obj.updateDynamic("DvbSubDestinationSettings")(__v.asInstanceOf[js.Any])
      )
      EmbeddedDestinationSettings.foreach(
        __v => __obj.updateDynamic("EmbeddedDestinationSettings")(__v.asInstanceOf[js.Any])
      )
      SccDestinationSettings.foreach(__v => __obj.updateDynamic("SccDestinationSettings")(__v.asInstanceOf[js.Any]))
      TeletextDestinationSettings.foreach(
        __v => __obj.updateDynamic("TeletextDestinationSettings")(__v.asInstanceOf[js.Any])
      )
      TtmlDestinationSettings.foreach(__v => __obj.updateDynamic("TtmlDestinationSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptionDestinationSettings]
    }
  }

  /**
    * Specify the format for this set of captions on this output. The default format is embedded without SCTE-20. Other options are embedded with SCTE-20, burn-in, DVB-sub, SCC, SRT, teletext, TTML, and web-VTT. If you are using SCTE-20, choose SCTE-20 plus embedded (SCTE20_PLUS_EMBEDDED) to create an output that complies with the SCTE-43 spec. To create a non-compliant output where the embedded captions come first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
    */
  object CaptionDestinationTypeEnum {
    val BURN_IN              = "BURN_IN"
    val DVB_SUB              = "DVB_SUB"
    val EMBEDDED             = "EMBEDDED"
    val EMBEDDED_PLUS_SCTE20 = "EMBEDDED_PLUS_SCTE20"
    val SCTE20_PLUS_EMBEDDED = "SCTE20_PLUS_EMBEDDED"
    val SCC                  = "SCC"
    val SRT                  = "SRT"
    val SMI                  = "SMI"
    val TELETEXT             = "TELETEXT"
    val TTML                 = "TTML"
    val WEBVTT               = "WEBVTT"

    val values = js.Object.freeze(
      js.Array(
        BURN_IN,
        DVB_SUB,
        EMBEDDED,
        EMBEDDED_PLUS_SCTE20,
        SCTE20_PLUS_EMBEDDED,
        SCC,
        SRT,
        SMI,
        TELETEXT,
        TTML,
        WEBVTT
      )
    )
  }

  /**
    * Set up captions in your outputs by first selecting them from your input here.
    */
  @js.native
  trait CaptionSelector extends js.Object {
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3]
    var LanguageCode: js.UndefOr[LanguageCode]
    var SourceSettings: js.UndefOr[CaptionSourceSettings]
  }

  object CaptionSelector {
    @inline
    def apply(
        CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        SourceSettings: js.UndefOr[CaptionSourceSettings] = js.undefined
    ): CaptionSelector = {
      val __obj = js.Dynamic.literal()
      CustomLanguageCode.foreach(__v => __obj.updateDynamic("CustomLanguageCode")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      SourceSettings.foreach(__v => __obj.updateDynamic("SourceSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptionSelector]
    }
  }

  /**
    * Source settings (SourceSettings) contains the group of settings for captions in the input.
    */
  @js.native
  trait CaptionSourceSettings extends js.Object {
    var AncillarySourceSettings: js.UndefOr[AncillarySourceSettings]
    var DvbSubSourceSettings: js.UndefOr[DvbSubSourceSettings]
    var EmbeddedSourceSettings: js.UndefOr[EmbeddedSourceSettings]
    var FileSourceSettings: js.UndefOr[FileSourceSettings]
    var SourceType: js.UndefOr[CaptionSourceType]
    var TeletextSourceSettings: js.UndefOr[TeletextSourceSettings]
    var TrackSourceSettings: js.UndefOr[TrackSourceSettings]
  }

  object CaptionSourceSettings {
    @inline
    def apply(
        AncillarySourceSettings: js.UndefOr[AncillarySourceSettings] = js.undefined,
        DvbSubSourceSettings: js.UndefOr[DvbSubSourceSettings] = js.undefined,
        EmbeddedSourceSettings: js.UndefOr[EmbeddedSourceSettings] = js.undefined,
        FileSourceSettings: js.UndefOr[FileSourceSettings] = js.undefined,
        SourceType: js.UndefOr[CaptionSourceType] = js.undefined,
        TeletextSourceSettings: js.UndefOr[TeletextSourceSettings] = js.undefined,
        TrackSourceSettings: js.UndefOr[TrackSourceSettings] = js.undefined
    ): CaptionSourceSettings = {
      val __obj = js.Dynamic.literal()
      AncillarySourceSettings.foreach(__v => __obj.updateDynamic("AncillarySourceSettings")(__v.asInstanceOf[js.Any]))
      DvbSubSourceSettings.foreach(__v => __obj.updateDynamic("DvbSubSourceSettings")(__v.asInstanceOf[js.Any]))
      EmbeddedSourceSettings.foreach(__v => __obj.updateDynamic("EmbeddedSourceSettings")(__v.asInstanceOf[js.Any]))
      FileSourceSettings.foreach(__v => __obj.updateDynamic("FileSourceSettings")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      TeletextSourceSettings.foreach(__v => __obj.updateDynamic("TeletextSourceSettings")(__v.asInstanceOf[js.Any]))
      TrackSourceSettings.foreach(__v => __obj.updateDynamic("TrackSourceSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptionSourceSettings]
    }
  }

  /**
    * Use Source (SourceType) to identify the format of your input captions.  The service cannot auto-detect caption format.
    */
  object CaptionSourceTypeEnum {
    val ANCILLARY   = "ANCILLARY"
    val DVB_SUB     = "DVB_SUB"
    val EMBEDDED    = "EMBEDDED"
    val SCTE20      = "SCTE20"
    val SCC         = "SCC"
    val TTML        = "TTML"
    val STL         = "STL"
    val SRT         = "SRT"
    val SMI         = "SMI"
    val TELETEXT    = "TELETEXT"
    val NULL_SOURCE = "NULL_SOURCE"
    val IMSC        = "IMSC"

    val values = js.Object.freeze(
      js.Array(ANCILLARY, DVB_SUB, EMBEDDED, SCTE20, SCC, TTML, STL, SRT, SMI, TELETEXT, NULL_SOURCE, IMSC)
    )
  }

  /**
    * Channel mapping (ChannelMapping) contains the group of fields that hold the remixing value for each channel. Units are in dB. Acceptable values are within the range from -60 (mute) through 6. A setting of 0 passes the input channel unchanged to the output channel (no attenuation or amplification).
    */
  @js.native
  trait ChannelMapping extends js.Object {
    var OutputChannels: js.UndefOr[__listOfOutputChannelMapping]
  }

  object ChannelMapping {
    @inline
    def apply(
        OutputChannels: js.UndefOr[__listOfOutputChannelMapping] = js.undefined
    ): ChannelMapping = {
      val __obj = js.Dynamic.literal()
      OutputChannels.foreach(__v => __obj.updateDynamic("OutputChannels")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelMapping]
    }
  }

  /**
    * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for later replay.
    */
  object CmafClientCacheEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
    */
  object CmafCodecSpecificationEnum {
    val RFC_6381 = "RFC_6381"
    val RFC_4281 = "RFC_4281"

    val values = js.Object.freeze(js.Array(RFC_6381, RFC_4281))
  }

  /**
    * Settings for CMAF encryption
    */
  @js.native
  trait CmafEncryptionSettings extends js.Object {
    var ConstantInitializationVector: js.UndefOr[__stringMin32Max32Pattern09aFAF32]
    var EncryptionMethod: js.UndefOr[CmafEncryptionType]
    var InitializationVectorInManifest: js.UndefOr[CmafInitializationVectorInManifest]
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProviderCmaf]
    var StaticKeyProvider: js.UndefOr[StaticKeyProvider]
    var Type: js.UndefOr[CmafKeyProviderType]
  }

  object CmafEncryptionSettings {
    @inline
    def apply(
        ConstantInitializationVector: js.UndefOr[__stringMin32Max32Pattern09aFAF32] = js.undefined,
        EncryptionMethod: js.UndefOr[CmafEncryptionType] = js.undefined,
        InitializationVectorInManifest: js.UndefOr[CmafInitializationVectorInManifest] = js.undefined,
        SpekeKeyProvider: js.UndefOr[SpekeKeyProviderCmaf] = js.undefined,
        StaticKeyProvider: js.UndefOr[StaticKeyProvider] = js.undefined,
        Type: js.UndefOr[CmafKeyProviderType] = js.undefined
    ): CmafEncryptionSettings = {
      val __obj = js.Dynamic.literal()
      ConstantInitializationVector.foreach(
        __v => __obj.updateDynamic("ConstantInitializationVector")(__v.asInstanceOf[js.Any])
      )
      EncryptionMethod.foreach(__v => __obj.updateDynamic("EncryptionMethod")(__v.asInstanceOf[js.Any]))
      InitializationVectorInManifest.foreach(
        __v => __obj.updateDynamic("InitializationVectorInManifest")(__v.asInstanceOf[js.Any])
      )
      SpekeKeyProvider.foreach(__v => __obj.updateDynamic("SpekeKeyProvider")(__v.asInstanceOf[js.Any]))
      StaticKeyProvider.foreach(__v => __obj.updateDynamic("StaticKeyProvider")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CmafEncryptionSettings]
    }
  }

  /**
    * For DRM with CMAF, the encryption type is always sample AES.
    */
  object CmafEncryptionTypeEnum {
    val SAMPLE_AES = "SAMPLE_AES"

    val values = js.Object.freeze(js.Array(SAMPLE_AES))
  }

  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to CMAF_GROUP_SETTINGS. Each output in a CMAF Output Group may only contain a single video, audio, or caption output.
    */
  @js.native
  trait CmafGroupSettings extends js.Object {
    var BaseUrl: js.UndefOr[__string]
    var ClientCache: js.UndefOr[CmafClientCache]
    var CodecSpecification: js.UndefOr[CmafCodecSpecification]
    var Destination: js.UndefOr[__stringPatternS3]
    var DestinationSettings: js.UndefOr[DestinationSettings]
    var Encryption: js.UndefOr[CmafEncryptionSettings]
    var FragmentLength: js.UndefOr[__integerMin1Max2147483647]
    var ManifestCompression: js.UndefOr[CmafManifestCompression]
    var ManifestDurationFormat: js.UndefOr[CmafManifestDurationFormat]
    var MinBufferTime: js.UndefOr[__integerMin0Max2147483647]
    var MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647]
    var SegmentControl: js.UndefOr[CmafSegmentControl]
    var SegmentLength: js.UndefOr[__integerMin1Max2147483647]
    var StreamInfResolution: js.UndefOr[CmafStreamInfResolution]
    var WriteDashManifest: js.UndefOr[CmafWriteDASHManifest]
    var WriteHlsManifest: js.UndefOr[CmafWriteHLSManifest]
  }

  object CmafGroupSettings {
    @inline
    def apply(
        BaseUrl: js.UndefOr[__string] = js.undefined,
        ClientCache: js.UndefOr[CmafClientCache] = js.undefined,
        CodecSpecification: js.UndefOr[CmafCodecSpecification] = js.undefined,
        Destination: js.UndefOr[__stringPatternS3] = js.undefined,
        DestinationSettings: js.UndefOr[DestinationSettings] = js.undefined,
        Encryption: js.UndefOr[CmafEncryptionSettings] = js.undefined,
        FragmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        ManifestCompression: js.UndefOr[CmafManifestCompression] = js.undefined,
        ManifestDurationFormat: js.UndefOr[CmafManifestDurationFormat] = js.undefined,
        MinBufferTime: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647] = js.undefined,
        SegmentControl: js.UndefOr[CmafSegmentControl] = js.undefined,
        SegmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        StreamInfResolution: js.UndefOr[CmafStreamInfResolution] = js.undefined,
        WriteDashManifest: js.UndefOr[CmafWriteDASHManifest] = js.undefined,
        WriteHlsManifest: js.UndefOr[CmafWriteHLSManifest] = js.undefined
    ): CmafGroupSettings = {
      val __obj = js.Dynamic.literal()
      BaseUrl.foreach(__v => __obj.updateDynamic("BaseUrl")(__v.asInstanceOf[js.Any]))
      ClientCache.foreach(__v => __obj.updateDynamic("ClientCache")(__v.asInstanceOf[js.Any]))
      CodecSpecification.foreach(__v => __obj.updateDynamic("CodecSpecification")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      DestinationSettings.foreach(__v => __obj.updateDynamic("DestinationSettings")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      FragmentLength.foreach(__v => __obj.updateDynamic("FragmentLength")(__v.asInstanceOf[js.Any]))
      ManifestCompression.foreach(__v => __obj.updateDynamic("ManifestCompression")(__v.asInstanceOf[js.Any]))
      ManifestDurationFormat.foreach(__v => __obj.updateDynamic("ManifestDurationFormat")(__v.asInstanceOf[js.Any]))
      MinBufferTime.foreach(__v => __obj.updateDynamic("MinBufferTime")(__v.asInstanceOf[js.Any]))
      MinFinalSegmentLength.foreach(__v => __obj.updateDynamic("MinFinalSegmentLength")(__v.asInstanceOf[js.Any]))
      SegmentControl.foreach(__v => __obj.updateDynamic("SegmentControl")(__v.asInstanceOf[js.Any]))
      SegmentLength.foreach(__v => __obj.updateDynamic("SegmentLength")(__v.asInstanceOf[js.Any]))
      StreamInfResolution.foreach(__v => __obj.updateDynamic("StreamInfResolution")(__v.asInstanceOf[js.Any]))
      WriteDashManifest.foreach(__v => __obj.updateDynamic("WriteDashManifest")(__v.asInstanceOf[js.Any]))
      WriteHlsManifest.foreach(__v => __obj.updateDynamic("WriteHlsManifest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CmafGroupSettings]
    }
  }

  /**
    * When you use DRM with CMAF outputs, choose whether the service writes the 128-bit encryption initialization vector in the HLS and DASH manifests.
    */
  object CmafInitializationVectorInManifestEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
    */
  object CmafKeyProviderTypeEnum {
    val SPEKE      = "SPEKE"
    val STATIC_KEY = "STATIC_KEY"

    val values = js.Object.freeze(js.Array(SPEKE, STATIC_KEY))
  }

  /**
    * When set to GZIP, compresses HLS playlist.
    */
  object CmafManifestCompressionEnum {
    val GZIP = "GZIP"
    val NONE = "NONE"

    val values = js.Object.freeze(js.Array(GZIP, NONE))
  }

  /**
    * Indicates whether the output manifest should use floating point values for segment duration.
    */
  object CmafManifestDurationFormatEnum {
    val FLOATING_POINT = "FLOATING_POINT"
    val INTEGER        = "INTEGER"

    val values = js.Object.freeze(js.Array(FLOATING_POINT, INTEGER))
  }

  /**
    * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
    */
  object CmafSegmentControlEnum {
    val SINGLE_FILE     = "SINGLE_FILE"
    val SEGMENTED_FILES = "SEGMENTED_FILES"

    val values = js.Object.freeze(js.Array(SINGLE_FILE, SEGMENTED_FILES))
  }

  /**
    * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
    */
  object CmafStreamInfResolutionEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * When set to ENABLED, a DASH MPD manifest will be generated for this output.
    */
  object CmafWriteDASHManifestEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * When set to ENABLED, an Apple HLS manifest will be generated for this output.
    */
  object CmafWriteHLSManifestEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Settings for color correction.
    */
  @js.native
  trait ColorCorrector extends js.Object {
    var Brightness: js.UndefOr[__integerMin1Max100]
    var ColorSpaceConversion: js.UndefOr[ColorSpaceConversion]
    var Contrast: js.UndefOr[__integerMin1Max100]
    var Hdr10Metadata: js.UndefOr[Hdr10Metadata]
    var Hue: js.UndefOr[__integerMinNegative180Max180]
    var Saturation: js.UndefOr[__integerMin1Max100]
  }

  object ColorCorrector {
    @inline
    def apply(
        Brightness: js.UndefOr[__integerMin1Max100] = js.undefined,
        ColorSpaceConversion: js.UndefOr[ColorSpaceConversion] = js.undefined,
        Contrast: js.UndefOr[__integerMin1Max100] = js.undefined,
        Hdr10Metadata: js.UndefOr[Hdr10Metadata] = js.undefined,
        Hue: js.UndefOr[__integerMinNegative180Max180] = js.undefined,
        Saturation: js.UndefOr[__integerMin1Max100] = js.undefined
    ): ColorCorrector = {
      val __obj = js.Dynamic.literal()
      Brightness.foreach(__v => __obj.updateDynamic("Brightness")(__v.asInstanceOf[js.Any]))
      ColorSpaceConversion.foreach(__v => __obj.updateDynamic("ColorSpaceConversion")(__v.asInstanceOf[js.Any]))
      Contrast.foreach(__v => __obj.updateDynamic("Contrast")(__v.asInstanceOf[js.Any]))
      Hdr10Metadata.foreach(__v => __obj.updateDynamic("Hdr10Metadata")(__v.asInstanceOf[js.Any]))
      Hue.foreach(__v => __obj.updateDynamic("Hue")(__v.asInstanceOf[js.Any]))
      Saturation.foreach(__v => __obj.updateDynamic("Saturation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColorCorrector]
    }
  }

  /**
    * Choose Insert (INSERT) for this setting to include color metadata in this output. Choose Ignore (IGNORE) to exclude color metadata from this output. If you don't specify a value, the service sets this to Insert by default.
    */
  object ColorMetadataEnum {
    val IGNORE = "IGNORE"
    val INSERT = "INSERT"

    val values = js.Object.freeze(js.Array(IGNORE, INSERT))
  }

  /**
    * If your input video has accurate color space metadata, or if you don't know about color space, leave this set to the default value Follow (FOLLOW). The service will automatically detect your input color space. If your input video has metadata indicating the wrong color space, specify the accurate color space here. If your input video is HDR 10 and the SMPTE ST 2086 Mastering Display Color Volume static metadata isn't present in your video stream, or if that metadata is present but not accurate, choose Force HDR 10 (FORCE_HDR10) here and specify correct values in the input HDR 10 metadata (Hdr10Metadata) settings. For more information about MediaConvert HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr.
    */
  object ColorSpaceEnum {
    val FOLLOW   = "FOLLOW"
    val REC_601  = "REC_601"
    val REC_709  = "REC_709"
    val HDR10    = "HDR10"
    val HLG_2020 = "HLG_2020"

    val values = js.Object.freeze(js.Array(FOLLOW, REC_601, REC_709, HDR10, HLG_2020))
  }

  /**
    * Specify the color space you want for this output. The service supports conversion between HDR formats, between SDR formats, and from SDR to HDR. The service doesn't support conversion from HDR to SDR. SDR to HDR conversion doesn't upgrade the dynamic range. The converted video has an HDR format, but visually appears the same as an unconverted output.
    */
  object ColorSpaceConversionEnum {
    val NONE           = "NONE"
    val FORCE_601      = "FORCE_601"
    val FORCE_709      = "FORCE_709"
    val FORCE_HDR10    = "FORCE_HDR10"
    val FORCE_HLG_2020 = "FORCE_HLG_2020"

    val values = js.Object.freeze(js.Array(NONE, FORCE_601, FORCE_709, FORCE_HDR10, FORCE_HLG_2020))
  }

  /**
    * There are two sources for color metadata, the input file and the job input settings Color space (ColorSpace) and HDR master display information settings(Hdr10Metadata). The Color space usage setting determines which takes precedence. Choose Force (FORCE) to use color metadata from the input job settings. If you don't specify values for those settings, the service defaults to using metadata from your input. FALLBACK - Choose Fallback (FALLBACK) to use color metadata from the source when it is present. If there's no color metadata in your input file, the service defaults to using values you specify in the input settings.
    */
  object ColorSpaceUsageEnum {
    val FORCE    = "FORCE"
    val FALLBACK = "FALLBACK"

    val values = js.Object.freeze(js.Array(FORCE, FALLBACK))
  }

  /**
    * The length of the term of your reserved queue pricing plan commitment.
    */
  object CommitmentEnum {
    val ONE_YEAR = "ONE_YEAR"

    val values = js.Object.freeze(js.Array(ONE_YEAR))
  }

  /**
    * Container specific settings.
    */
  @js.native
  trait ContainerSettings extends js.Object {
    var Container: js.UndefOr[ContainerType]
    var F4vSettings: js.UndefOr[F4vSettings]
    var M2tsSettings: js.UndefOr[M2tsSettings]
    var M3u8Settings: js.UndefOr[M3u8Settings]
    var MovSettings: js.UndefOr[MovSettings]
    var Mp4Settings: js.UndefOr[Mp4Settings]
  }

  object ContainerSettings {
    @inline
    def apply(
        Container: js.UndefOr[ContainerType] = js.undefined,
        F4vSettings: js.UndefOr[F4vSettings] = js.undefined,
        M2tsSettings: js.UndefOr[M2tsSettings] = js.undefined,
        M3u8Settings: js.UndefOr[M3u8Settings] = js.undefined,
        MovSettings: js.UndefOr[MovSettings] = js.undefined,
        Mp4Settings: js.UndefOr[Mp4Settings] = js.undefined
    ): ContainerSettings = {
      val __obj = js.Dynamic.literal()
      Container.foreach(__v => __obj.updateDynamic("Container")(__v.asInstanceOf[js.Any]))
      F4vSettings.foreach(__v => __obj.updateDynamic("F4vSettings")(__v.asInstanceOf[js.Any]))
      M2tsSettings.foreach(__v => __obj.updateDynamic("M2tsSettings")(__v.asInstanceOf[js.Any]))
      M3u8Settings.foreach(__v => __obj.updateDynamic("M3u8Settings")(__v.asInstanceOf[js.Any]))
      MovSettings.foreach(__v => __obj.updateDynamic("MovSettings")(__v.asInstanceOf[js.Any]))
      Mp4Settings.foreach(__v => __obj.updateDynamic("Mp4Settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainerSettings]
    }
  }

  /**
    * Container for this output. Some containers require a container settings object. If not specified, the default object will be created.
    */
  object ContainerTypeEnum {
    val F4V  = "F4V"
    val ISMV = "ISMV"
    val M2TS = "M2TS"
    val M3U8 = "M3U8"
    val CMFC = "CMFC"
    val MOV  = "MOV"
    val MP4  = "MP4"
    val MPD  = "MPD"
    val MXF  = "MXF"
    val RAW  = "RAW"

    val values = js.Object.freeze(js.Array(F4V, ISMV, M2TS, M3U8, CMFC, MOV, MP4, MPD, MXF, RAW))
  }

  @js.native
  trait CreateJobRequest extends js.Object {
    var Role: __string
    var Settings: JobSettings
    var AccelerationSettings: js.UndefOr[AccelerationSettings]
    var BillingTagsSource: js.UndefOr[BillingTagsSource]
    var ClientRequestToken: js.UndefOr[__string]
    var JobTemplate: js.UndefOr[__string]
    var Priority: js.UndefOr[__integerMinNegative50Max50]
    var Queue: js.UndefOr[__string]
    var SimulateReservedQueue: js.UndefOr[SimulateReservedQueue]
    var StatusUpdateInterval: js.UndefOr[StatusUpdateInterval]
    var UserMetadata: js.UndefOr[__mapOf__string]
  }

  object CreateJobRequest {
    @inline
    def apply(
        Role: __string,
        Settings: JobSettings,
        AccelerationSettings: js.UndefOr[AccelerationSettings] = js.undefined,
        BillingTagsSource: js.UndefOr[BillingTagsSource] = js.undefined,
        ClientRequestToken: js.UndefOr[__string] = js.undefined,
        JobTemplate: js.UndefOr[__string] = js.undefined,
        Priority: js.UndefOr[__integerMinNegative50Max50] = js.undefined,
        Queue: js.UndefOr[__string] = js.undefined,
        SimulateReservedQueue: js.UndefOr[SimulateReservedQueue] = js.undefined,
        StatusUpdateInterval: js.UndefOr[StatusUpdateInterval] = js.undefined,
        UserMetadata: js.UndefOr[__mapOf__string] = js.undefined
    ): CreateJobRequest = {
      val __obj = js.Dynamic.literal(
        "Role"     -> Role.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any]
      )

      AccelerationSettings.foreach(__v => __obj.updateDynamic("AccelerationSettings")(__v.asInstanceOf[js.Any]))
      BillingTagsSource.foreach(__v => __obj.updateDynamic("BillingTagsSource")(__v.asInstanceOf[js.Any]))
      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      JobTemplate.foreach(__v => __obj.updateDynamic("JobTemplate")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      SimulateReservedQueue.foreach(__v => __obj.updateDynamic("SimulateReservedQueue")(__v.asInstanceOf[js.Any]))
      StatusUpdateInterval.foreach(__v => __obj.updateDynamic("StatusUpdateInterval")(__v.asInstanceOf[js.Any]))
      UserMetadata.foreach(__v => __obj.updateDynamic("UserMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobRequest]
    }
  }

  @js.native
  trait CreateJobResponse extends js.Object {
    var Job: js.UndefOr[Job]
  }

  object CreateJobResponse {
    @inline
    def apply(
        Job: js.UndefOr[Job] = js.undefined
    ): CreateJobResponse = {
      val __obj = js.Dynamic.literal()
      Job.foreach(__v => __obj.updateDynamic("Job")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobResponse]
    }
  }

  @js.native
  trait CreateJobTemplateRequest extends js.Object {
    var Name: __string
    var Settings: JobTemplateSettings
    var AccelerationSettings: js.UndefOr[AccelerationSettings]
    var Category: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var Priority: js.UndefOr[__integerMinNegative50Max50]
    var Queue: js.UndefOr[__string]
    var StatusUpdateInterval: js.UndefOr[StatusUpdateInterval]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object CreateJobTemplateRequest {
    @inline
    def apply(
        Name: __string,
        Settings: JobTemplateSettings,
        AccelerationSettings: js.UndefOr[AccelerationSettings] = js.undefined,
        Category: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        Priority: js.UndefOr[__integerMinNegative50Max50] = js.undefined,
        Queue: js.UndefOr[__string] = js.undefined,
        StatusUpdateInterval: js.UndefOr[StatusUpdateInterval] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): CreateJobTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "Name"     -> Name.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any]
      )

      AccelerationSettings.foreach(__v => __obj.updateDynamic("AccelerationSettings")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      StatusUpdateInterval.foreach(__v => __obj.updateDynamic("StatusUpdateInterval")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobTemplateRequest]
    }
  }

  @js.native
  trait CreateJobTemplateResponse extends js.Object {
    var JobTemplate: js.UndefOr[JobTemplate]
  }

  object CreateJobTemplateResponse {
    @inline
    def apply(
        JobTemplate: js.UndefOr[JobTemplate] = js.undefined
    ): CreateJobTemplateResponse = {
      val __obj = js.Dynamic.literal()
      JobTemplate.foreach(__v => __obj.updateDynamic("JobTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobTemplateResponse]
    }
  }

  @js.native
  trait CreatePresetRequest extends js.Object {
    var Name: __string
    var Settings: PresetSettings
    var Category: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object CreatePresetRequest {
    @inline
    def apply(
        Name: __string,
        Settings: PresetSettings,
        Category: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): CreatePresetRequest = {
      val __obj = js.Dynamic.literal(
        "Name"     -> Name.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any]
      )

      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePresetRequest]
    }
  }

  @js.native
  trait CreatePresetResponse extends js.Object {
    var Preset: js.UndefOr[Preset]
  }

  object CreatePresetResponse {
    @inline
    def apply(
        Preset: js.UndefOr[Preset] = js.undefined
    ): CreatePresetResponse = {
      val __obj = js.Dynamic.literal()
      Preset.foreach(__v => __obj.updateDynamic("Preset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePresetResponse]
    }
  }

  @js.native
  trait CreateQueueRequest extends js.Object {
    var Name: __string
    var Description: js.UndefOr[__string]
    var PricingPlan: js.UndefOr[PricingPlan]
    var ReservationPlanSettings: js.UndefOr[ReservationPlanSettings]
    var Status: js.UndefOr[QueueStatus]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object CreateQueueRequest {
    @inline
    def apply(
        Name: __string,
        Description: js.UndefOr[__string] = js.undefined,
        PricingPlan: js.UndefOr[PricingPlan] = js.undefined,
        ReservationPlanSettings: js.UndefOr[ReservationPlanSettings] = js.undefined,
        Status: js.UndefOr[QueueStatus] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): CreateQueueRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PricingPlan.foreach(__v => __obj.updateDynamic("PricingPlan")(__v.asInstanceOf[js.Any]))
      ReservationPlanSettings.foreach(__v => __obj.updateDynamic("ReservationPlanSettings")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateQueueRequest]
    }
  }

  @js.native
  trait CreateQueueResponse extends js.Object {
    var Queue: js.UndefOr[Queue]
  }

  object CreateQueueResponse {
    @inline
    def apply(
        Queue: js.UndefOr[Queue] = js.undefined
    ): CreateQueueResponse = {
      val __obj = js.Dynamic.literal()
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateQueueResponse]
    }
  }

  /**
    * Specifies DRM settings for DASH outputs.
    */
  @js.native
  trait DashIsoEncryptionSettings extends js.Object {
    var PlaybackDeviceCompatibility: js.UndefOr[DashIsoPlaybackDeviceCompatibility]
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProvider]
  }

  object DashIsoEncryptionSettings {
    @inline
    def apply(
        PlaybackDeviceCompatibility: js.UndefOr[DashIsoPlaybackDeviceCompatibility] = js.undefined,
        SpekeKeyProvider: js.UndefOr[SpekeKeyProvider] = js.undefined
    ): DashIsoEncryptionSettings = {
      val __obj = js.Dynamic.literal()
      PlaybackDeviceCompatibility.foreach(
        __v => __obj.updateDynamic("PlaybackDeviceCompatibility")(__v.asInstanceOf[js.Any])
      )
      SpekeKeyProvider.foreach(__v => __obj.updateDynamic("SpekeKeyProvider")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashIsoEncryptionSettings]
    }
  }

  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to DASH_ISO_GROUP_SETTINGS.
    */
  @js.native
  trait DashIsoGroupSettings extends js.Object {
    var BaseUrl: js.UndefOr[__string]
    var Destination: js.UndefOr[__stringPatternS3]
    var DestinationSettings: js.UndefOr[DestinationSettings]
    var Encryption: js.UndefOr[DashIsoEncryptionSettings]
    var FragmentLength: js.UndefOr[__integerMin1Max2147483647]
    var HbbtvCompliance: js.UndefOr[DashIsoHbbtvCompliance]
    var MinBufferTime: js.UndefOr[__integerMin0Max2147483647]
    var SegmentControl: js.UndefOr[DashIsoSegmentControl]
    var SegmentLength: js.UndefOr[__integerMin1Max2147483647]
    var WriteSegmentTimelineInRepresentation: js.UndefOr[DashIsoWriteSegmentTimelineInRepresentation]
  }

  object DashIsoGroupSettings {
    @inline
    def apply(
        BaseUrl: js.UndefOr[__string] = js.undefined,
        Destination: js.UndefOr[__stringPatternS3] = js.undefined,
        DestinationSettings: js.UndefOr[DestinationSettings] = js.undefined,
        Encryption: js.UndefOr[DashIsoEncryptionSettings] = js.undefined,
        FragmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        HbbtvCompliance: js.UndefOr[DashIsoHbbtvCompliance] = js.undefined,
        MinBufferTime: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        SegmentControl: js.UndefOr[DashIsoSegmentControl] = js.undefined,
        SegmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        WriteSegmentTimelineInRepresentation: js.UndefOr[DashIsoWriteSegmentTimelineInRepresentation] = js.undefined
    ): DashIsoGroupSettings = {
      val __obj = js.Dynamic.literal()
      BaseUrl.foreach(__v => __obj.updateDynamic("BaseUrl")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      DestinationSettings.foreach(__v => __obj.updateDynamic("DestinationSettings")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      FragmentLength.foreach(__v => __obj.updateDynamic("FragmentLength")(__v.asInstanceOf[js.Any]))
      HbbtvCompliance.foreach(__v => __obj.updateDynamic("HbbtvCompliance")(__v.asInstanceOf[js.Any]))
      MinBufferTime.foreach(__v => __obj.updateDynamic("MinBufferTime")(__v.asInstanceOf[js.Any]))
      SegmentControl.foreach(__v => __obj.updateDynamic("SegmentControl")(__v.asInstanceOf[js.Any]))
      SegmentLength.foreach(__v => __obj.updateDynamic("SegmentLength")(__v.asInstanceOf[js.Any]))
      WriteSegmentTimelineInRepresentation.foreach(
        __v => __obj.updateDynamic("WriteSegmentTimelineInRepresentation")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DashIsoGroupSettings]
    }
  }

  /**
    * Supports HbbTV specification as indicated
    */
  object DashIsoHbbtvComplianceEnum {
    val HBBTV_1_5 = "HBBTV_1_5"
    val NONE      = "NONE"

    val values = js.Object.freeze(js.Array(HBBTV_1_5, NONE))
  }

  /**
    * This setting can improve the compatibility of your output with video players on obsolete devices. It applies only to DASH H.264 outputs with DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to correct problems with playback on older devices. Otherwise, keep the default setting CENC v1 (CENC_V1). If you choose Unencrypted SEI, for that output, the service will exclude the access unit delimiter and will leave the SEI NAL units unencrypted.
    */
  object DashIsoPlaybackDeviceCompatibilityEnum {
    val CENC_V1         = "CENC_V1"
    val UNENCRYPTED_SEI = "UNENCRYPTED_SEI"

    val values = js.Object.freeze(js.Array(CENC_V1, UNENCRYPTED_SEI))
  }

  /**
    * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
    */
  object DashIsoSegmentControlEnum {
    val SINGLE_FILE     = "SINGLE_FILE"
    val SEGMENTED_FILES = "SEGMENTED_FILES"

    val values = js.Object.freeze(js.Array(SINGLE_FILE, SEGMENTED_FILES))
  }

  /**
    * When you enable Precise segment duration in manifests (writeSegmentTimelineInRepresentation), your DASH manifest shows precise segment durations. The segment duration information appears inside the SegmentTimeline element, inside SegmentTemplate at the Representation level. When this feature isn't enabled, the segment durations in your DASH manifest are approximate. The segment duration information appears in the duration attribute of the SegmentTemplate element.
    */
  object DashIsoWriteSegmentTimelineInRepresentationEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Specify the encryption mode that you used to encrypt your input files.
    */
  object DecryptionModeEnum {
    val AES_CTR = "AES_CTR"
    val AES_CBC = "AES_CBC"
    val AES_GCM = "AES_GCM"

    val values = js.Object.freeze(js.Array(AES_CTR, AES_CBC, AES_GCM))
  }

  /**
    * Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace (DEINTERLACE) or Adaptive (ADAPTIVE). Motion adaptive interpolate (INTERPOLATE) produces sharper pictures, while blend (BLEND) produces smoother motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your source file includes a ticker, such as a scrolling headline at the bottom of the frame.
    */
  object DeinterlaceAlgorithmEnum {
    val INTERPOLATE        = "INTERPOLATE"
    val INTERPOLATE_TICKER = "INTERPOLATE_TICKER"
    val BLEND              = "BLEND"
    val BLEND_TICKER       = "BLEND_TICKER"

    val values = js.Object.freeze(js.Array(INTERPOLATE, INTERPOLATE_TICKER, BLEND, BLEND_TICKER))
  }

  /**
    * Settings for deinterlacer
    */
  @js.native
  trait Deinterlacer extends js.Object {
    var Algorithm: js.UndefOr[DeinterlaceAlgorithm]
    var Control: js.UndefOr[DeinterlacerControl]
    var Mode: js.UndefOr[DeinterlacerMode]
  }

  object Deinterlacer {
    @inline
    def apply(
        Algorithm: js.UndefOr[DeinterlaceAlgorithm] = js.undefined,
        Control: js.UndefOr[DeinterlacerControl] = js.undefined,
        Mode: js.UndefOr[DeinterlacerMode] = js.undefined
    ): Deinterlacer = {
      val __obj = js.Dynamic.literal()
      Algorithm.foreach(__v => __obj.updateDynamic("Algorithm")(__v.asInstanceOf[js.Any]))
      Control.foreach(__v => __obj.updateDynamic("Control")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Deinterlacer]
    }
  }

  /**
    * - When set to NORMAL (default), the deinterlacer does not convert frames that are tagged  in metadata as progressive. It will only convert those that are tagged as some other type. - When set to FORCE_ALL_FRAMES, the deinterlacer converts every frame to progressive - even those that are already tagged as progressive. Turn Force mode on only if there is  a good chance that the metadata has tagged frames as progressive when they are not  progressive. Do not turn on otherwise; processing frames that are already progressive  into progressive will probably result in lower quality video.
    */
  object DeinterlacerControlEnum {
    val FORCE_ALL_FRAMES = "FORCE_ALL_FRAMES"
    val NORMAL           = "NORMAL"

    val values = js.Object.freeze(js.Array(FORCE_ALL_FRAMES, NORMAL))
  }

  /**
    * Use Deinterlacer (DeinterlaceMode) to choose how the service will do deinterlacing. Default is Deinterlace. - Deinterlace converts interlaced to progressive. - Inverse telecine converts Hard Telecine 29.97i to progressive 23.976p. - Adaptive auto-detects and converts to progressive.
    */
  object DeinterlacerModeEnum {
    val DEINTERLACE      = "DEINTERLACE"
    val INVERSE_TELECINE = "INVERSE_TELECINE"
    val ADAPTIVE         = "ADAPTIVE"

    val values = js.Object.freeze(js.Array(DEINTERLACE, INVERSE_TELECINE, ADAPTIVE))
  }

  @js.native
  trait DeleteJobTemplateRequest extends js.Object {
    var Name: __string
  }

  object DeleteJobTemplateRequest {
    @inline
    def apply(
        Name: __string
    ): DeleteJobTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteJobTemplateRequest]
    }
  }

  @js.native
  trait DeleteJobTemplateResponse extends js.Object {}

  object DeleteJobTemplateResponse {
    @inline
    def apply(
        ): DeleteJobTemplateResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteJobTemplateResponse]
    }
  }

  @js.native
  trait DeletePresetRequest extends js.Object {
    var Name: __string
  }

  object DeletePresetRequest {
    @inline
    def apply(
        Name: __string
    ): DeletePresetRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePresetRequest]
    }
  }

  @js.native
  trait DeletePresetResponse extends js.Object {}

  object DeletePresetResponse {
    @inline
    def apply(
        ): DeletePresetResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeletePresetResponse]
    }
  }

  @js.native
  trait DeleteQueueRequest extends js.Object {
    var Name: __string
  }

  object DeleteQueueRequest {
    @inline
    def apply(
        Name: __string
    ): DeleteQueueRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteQueueRequest]
    }
  }

  @js.native
  trait DeleteQueueResponse extends js.Object {}

  object DeleteQueueResponse {
    @inline
    def apply(
        ): DeleteQueueResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteQueueResponse]
    }
  }

  /**
    * Optional field, defaults to DEFAULT. Specify DEFAULT for this operation to return your endpoints if any exist, or to create an endpoint for you and return it if one doesn't already exist. Specify GET_ONLY to return your endpoints if any exist, or an empty list if none exist.
    */
  object DescribeEndpointsModeEnum {
    val DEFAULT  = "DEFAULT"
    val GET_ONLY = "GET_ONLY"

    val values = js.Object.freeze(js.Array(DEFAULT, GET_ONLY))
  }

  /**
    * DescribeEndpointsRequest
    */
  @js.native
  trait DescribeEndpointsRequest extends js.Object {
    var MaxResults: js.UndefOr[__integer]
    var Mode: js.UndefOr[DescribeEndpointsMode]
    var NextToken: js.UndefOr[__string]
  }

  object DescribeEndpointsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[__integer] = js.undefined,
        Mode: js.UndefOr[DescribeEndpointsMode] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): DescribeEndpointsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndpointsRequest]
    }
  }

  @js.native
  trait DescribeEndpointsResponse extends js.Object {
    var Endpoints: js.UndefOr[__listOfEndpoint]
    var NextToken: js.UndefOr[__string]
  }

  object DescribeEndpointsResponse {
    @inline
    def apply(
        Endpoints: js.UndefOr[__listOfEndpoint] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): DescribeEndpointsResponse = {
      val __obj = js.Dynamic.literal()
      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndpointsResponse]
    }
  }

  /**
    * Settings associated with the destination. Will vary based on the type of destination
    */
  @js.native
  trait DestinationSettings extends js.Object {
    var S3Settings: js.UndefOr[S3DestinationSettings]
  }

  object DestinationSettings {
    @inline
    def apply(
        S3Settings: js.UndefOr[S3DestinationSettings] = js.undefined
    ): DestinationSettings = {
      val __obj = js.Dynamic.literal()
      S3Settings.foreach(__v => __obj.updateDynamic("S3Settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DestinationSettings]
    }
  }

  @js.native
  trait DisassociateCertificateRequest extends js.Object {
    var Arn: __string
  }

  object DisassociateCertificateRequest {
    @inline
    def apply(
        Arn: __string
    ): DisassociateCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateCertificateRequest]
    }
  }

  @js.native
  trait DisassociateCertificateResponse extends js.Object {}

  object DisassociateCertificateResponse {
    @inline
    def apply(
        ): DisassociateCertificateResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateCertificateResponse]
    }
  }

  /**
    * Applies only to 29.97 fps outputs. When this feature is enabled, the service will use drop-frame timecode on outputs. If it is not possible to use drop-frame timecode, the system will fall back to non-drop-frame. This setting is enabled by default when Timecode insertion (TimecodeInsertion) is enabled.
    */
  object DropFrameTimecodeEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Inserts DVB Network Information Table (NIT) at the specified table repetition interval.
    */
  @js.native
  trait DvbNitSettings extends js.Object {
    var NetworkId: js.UndefOr[__integerMin0Max65535]
    var NetworkName: js.UndefOr[__stringMin1Max256]
    var NitInterval: js.UndefOr[__integerMin25Max10000]
  }

  object DvbNitSettings {
    @inline
    def apply(
        NetworkId: js.UndefOr[__integerMin0Max65535] = js.undefined,
        NetworkName: js.UndefOr[__stringMin1Max256] = js.undefined,
        NitInterval: js.UndefOr[__integerMin25Max10000] = js.undefined
    ): DvbNitSettings = {
      val __obj = js.Dynamic.literal()
      NetworkId.foreach(__v => __obj.updateDynamic("NetworkId")(__v.asInstanceOf[js.Any]))
      NetworkName.foreach(__v => __obj.updateDynamic("NetworkName")(__v.asInstanceOf[js.Any]))
      NitInterval.foreach(__v => __obj.updateDynamic("NitInterval")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DvbNitSettings]
    }
  }

  /**
    * Inserts DVB Service Description Table (NIT) at the specified table repetition interval.
    */
  @js.native
  trait DvbSdtSettings extends js.Object {
    var OutputSdt: js.UndefOr[OutputSdt]
    var SdtInterval: js.UndefOr[__integerMin25Max2000]
    var ServiceName: js.UndefOr[__stringMin1Max256]
    var ServiceProviderName: js.UndefOr[__stringMin1Max256]
  }

  object DvbSdtSettings {
    @inline
    def apply(
        OutputSdt: js.UndefOr[OutputSdt] = js.undefined,
        SdtInterval: js.UndefOr[__integerMin25Max2000] = js.undefined,
        ServiceName: js.UndefOr[__stringMin1Max256] = js.undefined,
        ServiceProviderName: js.UndefOr[__stringMin1Max256] = js.undefined
    ): DvbSdtSettings = {
      val __obj = js.Dynamic.literal()
      OutputSdt.foreach(__v => __obj.updateDynamic("OutputSdt")(__v.asInstanceOf[js.Any]))
      SdtInterval.foreach(__v => __obj.updateDynamic("SdtInterval")(__v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.updateDynamic("ServiceName")(__v.asInstanceOf[js.Any]))
      ServiceProviderName.foreach(__v => __obj.updateDynamic("ServiceProviderName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DvbSdtSettings]
    }
  }

  /**
    * DVB-Sub Destination Settings
    */
  @js.native
  trait DvbSubDestinationSettings extends js.Object {
    var Alignment: js.UndefOr[DvbSubtitleAlignment]
    var BackgroundColor: js.UndefOr[DvbSubtitleBackgroundColor]
    var BackgroundOpacity: js.UndefOr[__integerMin0Max255]
    var FontColor: js.UndefOr[DvbSubtitleFontColor]
    var FontOpacity: js.UndefOr[__integerMin0Max255]
    var FontResolution: js.UndefOr[__integerMin96Max600]
    var FontScript: js.UndefOr[FontScript]
    var FontSize: js.UndefOr[__integerMin0Max96]
    var OutlineColor: js.UndefOr[DvbSubtitleOutlineColor]
    var OutlineSize: js.UndefOr[__integerMin0Max10]
    var ShadowColor: js.UndefOr[DvbSubtitleShadowColor]
    var ShadowOpacity: js.UndefOr[__integerMin0Max255]
    var ShadowXOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var ShadowYOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var TeletextSpacing: js.UndefOr[DvbSubtitleTeletextSpacing]
    var XPosition: js.UndefOr[__integerMin0Max2147483647]
    var YPosition: js.UndefOr[__integerMin0Max2147483647]
  }

  object DvbSubDestinationSettings {
    @inline
    def apply(
        Alignment: js.UndefOr[DvbSubtitleAlignment] = js.undefined,
        BackgroundColor: js.UndefOr[DvbSubtitleBackgroundColor] = js.undefined,
        BackgroundOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        FontColor: js.UndefOr[DvbSubtitleFontColor] = js.undefined,
        FontOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        FontResolution: js.UndefOr[__integerMin96Max600] = js.undefined,
        FontScript: js.UndefOr[FontScript] = js.undefined,
        FontSize: js.UndefOr[__integerMin0Max96] = js.undefined,
        OutlineColor: js.UndefOr[DvbSubtitleOutlineColor] = js.undefined,
        OutlineSize: js.UndefOr[__integerMin0Max10] = js.undefined,
        ShadowColor: js.UndefOr[DvbSubtitleShadowColor] = js.undefined,
        ShadowOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        ShadowXOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        ShadowYOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        TeletextSpacing: js.UndefOr[DvbSubtitleTeletextSpacing] = js.undefined,
        XPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        YPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    ): DvbSubDestinationSettings = {
      val __obj = js.Dynamic.literal()
      Alignment.foreach(__v => __obj.updateDynamic("Alignment")(__v.asInstanceOf[js.Any]))
      BackgroundColor.foreach(__v => __obj.updateDynamic("BackgroundColor")(__v.asInstanceOf[js.Any]))
      BackgroundOpacity.foreach(__v => __obj.updateDynamic("BackgroundOpacity")(__v.asInstanceOf[js.Any]))
      FontColor.foreach(__v => __obj.updateDynamic("FontColor")(__v.asInstanceOf[js.Any]))
      FontOpacity.foreach(__v => __obj.updateDynamic("FontOpacity")(__v.asInstanceOf[js.Any]))
      FontResolution.foreach(__v => __obj.updateDynamic("FontResolution")(__v.asInstanceOf[js.Any]))
      FontScript.foreach(__v => __obj.updateDynamic("FontScript")(__v.asInstanceOf[js.Any]))
      FontSize.foreach(__v => __obj.updateDynamic("FontSize")(__v.asInstanceOf[js.Any]))
      OutlineColor.foreach(__v => __obj.updateDynamic("OutlineColor")(__v.asInstanceOf[js.Any]))
      OutlineSize.foreach(__v => __obj.updateDynamic("OutlineSize")(__v.asInstanceOf[js.Any]))
      ShadowColor.foreach(__v => __obj.updateDynamic("ShadowColor")(__v.asInstanceOf[js.Any]))
      ShadowOpacity.foreach(__v => __obj.updateDynamic("ShadowOpacity")(__v.asInstanceOf[js.Any]))
      ShadowXOffset.foreach(__v => __obj.updateDynamic("ShadowXOffset")(__v.asInstanceOf[js.Any]))
      ShadowYOffset.foreach(__v => __obj.updateDynamic("ShadowYOffset")(__v.asInstanceOf[js.Any]))
      TeletextSpacing.foreach(__v => __obj.updateDynamic("TeletextSpacing")(__v.asInstanceOf[js.Any]))
      XPosition.foreach(__v => __obj.updateDynamic("XPosition")(__v.asInstanceOf[js.Any]))
      YPosition.foreach(__v => __obj.updateDynamic("YPosition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DvbSubDestinationSettings]
    }
  }

  /**
    * DVB Sub Source Settings
    */
  @js.native
  trait DvbSubSourceSettings extends js.Object {
    var Pid: js.UndefOr[__integerMin1Max2147483647]
  }

  object DvbSubSourceSettings {
    @inline
    def apply(
        Pid: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    ): DvbSubSourceSettings = {
      val __obj = js.Dynamic.literal()
      Pid.foreach(__v => __obj.updateDynamic("Pid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DvbSubSourceSettings]
    }
  }

  /**
    * If no explicit x_position or y_position is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  object DvbSubtitleAlignmentEnum {
    val CENTERED = "CENTERED"
    val LEFT     = "LEFT"

    val values = js.Object.freeze(js.Array(CENTERED, LEFT))
  }

  /**
    * Specifies the color of the rectangle behind the captions.
    * All burn-in and DVB-Sub font settings must match.
    */
  object DvbSubtitleBackgroundColorEnum {
    val NONE  = "NONE"
    val BLACK = "BLACK"
    val WHITE = "WHITE"

    val values = js.Object.freeze(js.Array(NONE, BLACK, WHITE))
  }

  /**
    * Specifies the color of the burned-in captions. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  object DvbSubtitleFontColorEnum {
    val WHITE  = "WHITE"
    val BLACK  = "BLACK"
    val YELLOW = "YELLOW"
    val RED    = "RED"
    val GREEN  = "GREEN"
    val BLUE   = "BLUE"

    val values = js.Object.freeze(js.Array(WHITE, BLACK, YELLOW, RED, GREEN, BLUE))
  }

  /**
    * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  object DvbSubtitleOutlineColorEnum {
    val BLACK  = "BLACK"
    val WHITE  = "WHITE"
    val YELLOW = "YELLOW"
    val RED    = "RED"
    val GREEN  = "GREEN"
    val BLUE   = "BLUE"

    val values = js.Object.freeze(js.Array(BLACK, WHITE, YELLOW, RED, GREEN, BLUE))
  }

  /**
    * Specifies the color of the shadow cast by the captions.
    * All burn-in and DVB-Sub font settings must match.
    */
  object DvbSubtitleShadowColorEnum {
    val NONE  = "NONE"
    val BLACK = "BLACK"
    val WHITE = "WHITE"

    val values = js.Object.freeze(js.Array(NONE, BLACK, WHITE))
  }

  /**
    * Only applies to jobs with input captions in Teletext or STL formats. Specify whether the spacing between letters in your captions is set by the captions grid or varies depending on letter width. Choose fixed grid to conform to the spacing specified in the captions file more accurately. Choose proportional to make the text easier to read if the captions are closed caption.
    */
  object DvbSubtitleTeletextSpacingEnum {
    val FIXED_GRID   = "FIXED_GRID"
    val PROPORTIONAL = "PROPORTIONAL"

    val values = js.Object.freeze(js.Array(FIXED_GRID, PROPORTIONAL))
  }

  /**
    * Inserts DVB Time and Date Table (TDT) at the specified table repetition interval.
    */
  @js.native
  trait DvbTdtSettings extends js.Object {
    var TdtInterval: js.UndefOr[__integerMin1000Max30000]
  }

  object DvbTdtSettings {
    @inline
    def apply(
        TdtInterval: js.UndefOr[__integerMin1000Max30000] = js.undefined
    ): DvbTdtSettings = {
      val __obj = js.Dynamic.literal()
      TdtInterval.foreach(__v => __obj.updateDynamic("TdtInterval")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DvbTdtSettings]
    }
  }

  /**
    * Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
    */
  object Eac3AtmosBitstreamModeEnum {
    val COMPLETE_MAIN = "COMPLETE_MAIN"

    val values = js.Object.freeze(js.Array(COMPLETE_MAIN))
  }

  /**
    * The coding mode for Dolby Digital Plus JOC (Atmos) is always 9.1.6 (CODING_MODE_9_1_6).
    */
  object Eac3AtmosCodingModeEnum {
    val CODING_MODE_9_1_6 = "CODING_MODE_9_1_6"

    val values = js.Object.freeze(js.Array(CODING_MODE_9_1_6))
  }

  /**
    * Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue analysis.
    */
  object Eac3AtmosDialogueIntelligenceEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Specify the absolute peak level for a signal with dynamic range compression.
    */
  object Eac3AtmosDynamicRangeCompressionLineEnum {
    val NONE           = "NONE"
    val FILM_STANDARD  = "FILM_STANDARD"
    val FILM_LIGHT     = "FILM_LIGHT"
    val MUSIC_STANDARD = "MUSIC_STANDARD"
    val MUSIC_LIGHT    = "MUSIC_LIGHT"
    val SPEECH         = "SPEECH"

    val values = js.Object.freeze(js.Array(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH))
  }

  /**
    * Specify how the service limits the audio dynamic range when compressing the audio.
    */
  object Eac3AtmosDynamicRangeCompressionRfEnum {
    val NONE           = "NONE"
    val FILM_STANDARD  = "FILM_STANDARD"
    val FILM_LIGHT     = "FILM_LIGHT"
    val MUSIC_STANDARD = "MUSIC_STANDARD"
    val MUSIC_LIGHT    = "MUSIC_LIGHT"
    val SPEECH         = "SPEECH"

    val values = js.Object.freeze(js.Array(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH))
  }

  /**
    * Choose how the service meters the loudness of your audio.
    */
  object Eac3AtmosMeteringModeEnum {
    val LEQ_A         = "LEQ_A"
    val ITU_BS_1770_1 = "ITU_BS_1770_1"
    val ITU_BS_1770_2 = "ITU_BS_1770_2"
    val ITU_BS_1770_3 = "ITU_BS_1770_3"
    val ITU_BS_1770_4 = "ITU_BS_1770_4"

    val values = js.Object.freeze(js.Array(LEQ_A, ITU_BS_1770_1, ITU_BS_1770_2, ITU_BS_1770_3, ITU_BS_1770_4))
  }

  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value EAC3_ATMOS.
    */
  @js.native
  trait Eac3AtmosSettings extends js.Object {
    var Bitrate: js.UndefOr[__integerMin384000Max768000]
    var BitstreamMode: js.UndefOr[Eac3AtmosBitstreamMode]
    var CodingMode: js.UndefOr[Eac3AtmosCodingMode]
    var DialogueIntelligence: js.UndefOr[Eac3AtmosDialogueIntelligence]
    var DynamicRangeCompressionLine: js.UndefOr[Eac3AtmosDynamicRangeCompressionLine]
    var DynamicRangeCompressionRf: js.UndefOr[Eac3AtmosDynamicRangeCompressionRf]
    var LoRoCenterMixLevel: js.UndefOr[__doubleMinNegative6Max3]
    var LoRoSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1]
    var LtRtCenterMixLevel: js.UndefOr[__doubleMinNegative6Max3]
    var LtRtSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1]
    var MeteringMode: js.UndefOr[Eac3AtmosMeteringMode]
    var SampleRate: js.UndefOr[__integerMin48000Max48000]
    var SpeechThreshold: js.UndefOr[__integerMin1Max100]
    var StereoDownmix: js.UndefOr[Eac3AtmosStereoDownmix]
    var SurroundExMode: js.UndefOr[Eac3AtmosSurroundExMode]
  }

  object Eac3AtmosSettings {
    @inline
    def apply(
        Bitrate: js.UndefOr[__integerMin384000Max768000] = js.undefined,
        BitstreamMode: js.UndefOr[Eac3AtmosBitstreamMode] = js.undefined,
        CodingMode: js.UndefOr[Eac3AtmosCodingMode] = js.undefined,
        DialogueIntelligence: js.UndefOr[Eac3AtmosDialogueIntelligence] = js.undefined,
        DynamicRangeCompressionLine: js.UndefOr[Eac3AtmosDynamicRangeCompressionLine] = js.undefined,
        DynamicRangeCompressionRf: js.UndefOr[Eac3AtmosDynamicRangeCompressionRf] = js.undefined,
        LoRoCenterMixLevel: js.UndefOr[__doubleMinNegative6Max3] = js.undefined,
        LoRoSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1] = js.undefined,
        LtRtCenterMixLevel: js.UndefOr[__doubleMinNegative6Max3] = js.undefined,
        LtRtSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1] = js.undefined,
        MeteringMode: js.UndefOr[Eac3AtmosMeteringMode] = js.undefined,
        SampleRate: js.UndefOr[__integerMin48000Max48000] = js.undefined,
        SpeechThreshold: js.UndefOr[__integerMin1Max100] = js.undefined,
        StereoDownmix: js.UndefOr[Eac3AtmosStereoDownmix] = js.undefined,
        SurroundExMode: js.UndefOr[Eac3AtmosSurroundExMode] = js.undefined
    ): Eac3AtmosSettings = {
      val __obj = js.Dynamic.literal()
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      BitstreamMode.foreach(__v => __obj.updateDynamic("BitstreamMode")(__v.asInstanceOf[js.Any]))
      CodingMode.foreach(__v => __obj.updateDynamic("CodingMode")(__v.asInstanceOf[js.Any]))
      DialogueIntelligence.foreach(__v => __obj.updateDynamic("DialogueIntelligence")(__v.asInstanceOf[js.Any]))
      DynamicRangeCompressionLine.foreach(
        __v => __obj.updateDynamic("DynamicRangeCompressionLine")(__v.asInstanceOf[js.Any])
      )
      DynamicRangeCompressionRf.foreach(
        __v => __obj.updateDynamic("DynamicRangeCompressionRf")(__v.asInstanceOf[js.Any])
      )
      LoRoCenterMixLevel.foreach(__v => __obj.updateDynamic("LoRoCenterMixLevel")(__v.asInstanceOf[js.Any]))
      LoRoSurroundMixLevel.foreach(__v => __obj.updateDynamic("LoRoSurroundMixLevel")(__v.asInstanceOf[js.Any]))
      LtRtCenterMixLevel.foreach(__v => __obj.updateDynamic("LtRtCenterMixLevel")(__v.asInstanceOf[js.Any]))
      LtRtSurroundMixLevel.foreach(__v => __obj.updateDynamic("LtRtSurroundMixLevel")(__v.asInstanceOf[js.Any]))
      MeteringMode.foreach(__v => __obj.updateDynamic("MeteringMode")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      SpeechThreshold.foreach(__v => __obj.updateDynamic("SpeechThreshold")(__v.asInstanceOf[js.Any]))
      StereoDownmix.foreach(__v => __obj.updateDynamic("StereoDownmix")(__v.asInstanceOf[js.Any]))
      SurroundExMode.foreach(__v => __obj.updateDynamic("SurroundExMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Eac3AtmosSettings]
    }
  }

  /**
    * Choose how the service does stereo downmixing.
    */
  object Eac3AtmosStereoDownmixEnum {
    val NOT_INDICATED = "NOT_INDICATED"
    val STEREO        = "STEREO"
    val SURROUND      = "SURROUND"
    val DPL2          = "DPL2"

    val values = js.Object.freeze(js.Array(NOT_INDICATED, STEREO, SURROUND, DPL2))
  }

  /**
    * Specify whether your input audio has an additional center rear surround channel matrix encoded into your left and right surround channels.
    */
  object Eac3AtmosSurroundExModeEnum {
    val NOT_INDICATED = "NOT_INDICATED"
    val ENABLED       = "ENABLED"
    val DISABLED      = "DISABLED"

    val values = js.Object.freeze(js.Array(NOT_INDICATED, ENABLED, DISABLED))
  }

  /**
    * If set to ATTENUATE_3_DB, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding mode.
    */
  object Eac3AttenuationControlEnum {
    val ATTENUATE_3_DB = "ATTENUATE_3_DB"
    val NONE           = "NONE"

    val values = js.Object.freeze(js.Array(ATTENUATE_3_DB, NONE))
  }

  /**
    * Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
    */
  object Eac3BitstreamModeEnum {
    val COMPLETE_MAIN     = "COMPLETE_MAIN"
    val COMMENTARY        = "COMMENTARY"
    val EMERGENCY         = "EMERGENCY"
    val HEARING_IMPAIRED  = "HEARING_IMPAIRED"
    val VISUALLY_IMPAIRED = "VISUALLY_IMPAIRED"

    val values = js.Object.freeze(js.Array(COMPLETE_MAIN, COMMENTARY, EMERGENCY, HEARING_IMPAIRED, VISUALLY_IMPAIRED))
  }

  /**
    * Dolby Digital Plus coding mode. Determines number of channels.
    */
  object Eac3CodingModeEnum {
    val CODING_MODE_1_0 = "CODING_MODE_1_0"
    val CODING_MODE_2_0 = "CODING_MODE_2_0"
    val CODING_MODE_3_2 = "CODING_MODE_3_2"

    val values = js.Object.freeze(js.Array(CODING_MODE_1_0, CODING_MODE_2_0, CODING_MODE_3_2))
  }

  /**
    * Activates a DC highpass filter for all input channels.
    */
  object Eac3DcFilterEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Specify the absolute peak level for a signal with dynamic range compression.
    */
  object Eac3DynamicRangeCompressionLineEnum {
    val NONE           = "NONE"
    val FILM_STANDARD  = "FILM_STANDARD"
    val FILM_LIGHT     = "FILM_LIGHT"
    val MUSIC_STANDARD = "MUSIC_STANDARD"
    val MUSIC_LIGHT    = "MUSIC_LIGHT"
    val SPEECH         = "SPEECH"

    val values = js.Object.freeze(js.Array(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH))
  }

  /**
    * Specify how the service limits the audio dynamic range when compressing the audio.
    */
  object Eac3DynamicRangeCompressionRfEnum {
    val NONE           = "NONE"
    val FILM_STANDARD  = "FILM_STANDARD"
    val FILM_LIGHT     = "FILM_LIGHT"
    val MUSIC_STANDARD = "MUSIC_STANDARD"
    val MUSIC_LIGHT    = "MUSIC_LIGHT"
    val SPEECH         = "SPEECH"

    val values = js.Object.freeze(js.Array(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH))
  }

  /**
    * When encoding 3/2 audio, controls whether the LFE channel is enabled
    */
  object Eac3LfeControlEnum {
    val LFE    = "LFE"
    val NO_LFE = "NO_LFE"

    val values = js.Object.freeze(js.Array(LFE, NO_LFE))
  }

  /**
    * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
    */
  object Eac3LfeFilterEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
    */
  object Eac3MetadataControlEnum {
    val FOLLOW_INPUT   = "FOLLOW_INPUT"
    val USE_CONFIGURED = "USE_CONFIGURED"

    val values = js.Object.freeze(js.Array(FOLLOW_INPUT, USE_CONFIGURED))
  }

  /**
    * When set to WHEN_POSSIBLE, input DD+ audio will be passed through if it is present on the input. this detection is dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a consistent DD+ output as the system alternates between passthrough and encoding.
    */
  object Eac3PassthroughControlEnum {
    val WHEN_POSSIBLE  = "WHEN_POSSIBLE"
    val NO_PASSTHROUGH = "NO_PASSTHROUGH"

    val values = js.Object.freeze(js.Array(WHEN_POSSIBLE, NO_PASSTHROUGH))
  }

  /**
    * Controls the amount of phase-shift applied to the surround channels. Only used for 3/2 coding mode.
    */
  object Eac3PhaseControlEnum {
    val SHIFT_90_DEGREES = "SHIFT_90_DEGREES"
    val NO_SHIFT         = "NO_SHIFT"

    val values = js.Object.freeze(js.Array(SHIFT_90_DEGREES, NO_SHIFT))
  }

  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value EAC3.
    */
  @js.native
  trait Eac3Settings extends js.Object {
    var AttenuationControl: js.UndefOr[Eac3AttenuationControl]
    var Bitrate: js.UndefOr[__integerMin64000Max640000]
    var BitstreamMode: js.UndefOr[Eac3BitstreamMode]
    var CodingMode: js.UndefOr[Eac3CodingMode]
    var DcFilter: js.UndefOr[Eac3DcFilter]
    var Dialnorm: js.UndefOr[__integerMin1Max31]
    var DynamicRangeCompressionLine: js.UndefOr[Eac3DynamicRangeCompressionLine]
    var DynamicRangeCompressionRf: js.UndefOr[Eac3DynamicRangeCompressionRf]
    var LfeControl: js.UndefOr[Eac3LfeControl]
    var LfeFilter: js.UndefOr[Eac3LfeFilter]
    var LoRoCenterMixLevel: js.UndefOr[__doubleMinNegative60Max3]
    var LoRoSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1]
    var LtRtCenterMixLevel: js.UndefOr[__doubleMinNegative60Max3]
    var LtRtSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1]
    var MetadataControl: js.UndefOr[Eac3MetadataControl]
    var PassthroughControl: js.UndefOr[Eac3PassthroughControl]
    var PhaseControl: js.UndefOr[Eac3PhaseControl]
    var SampleRate: js.UndefOr[__integerMin48000Max48000]
    var StereoDownmix: js.UndefOr[Eac3StereoDownmix]
    var SurroundExMode: js.UndefOr[Eac3SurroundExMode]
    var SurroundMode: js.UndefOr[Eac3SurroundMode]
  }

  object Eac3Settings {
    @inline
    def apply(
        AttenuationControl: js.UndefOr[Eac3AttenuationControl] = js.undefined,
        Bitrate: js.UndefOr[__integerMin64000Max640000] = js.undefined,
        BitstreamMode: js.UndefOr[Eac3BitstreamMode] = js.undefined,
        CodingMode: js.UndefOr[Eac3CodingMode] = js.undefined,
        DcFilter: js.UndefOr[Eac3DcFilter] = js.undefined,
        Dialnorm: js.UndefOr[__integerMin1Max31] = js.undefined,
        DynamicRangeCompressionLine: js.UndefOr[Eac3DynamicRangeCompressionLine] = js.undefined,
        DynamicRangeCompressionRf: js.UndefOr[Eac3DynamicRangeCompressionRf] = js.undefined,
        LfeControl: js.UndefOr[Eac3LfeControl] = js.undefined,
        LfeFilter: js.UndefOr[Eac3LfeFilter] = js.undefined,
        LoRoCenterMixLevel: js.UndefOr[__doubleMinNegative60Max3] = js.undefined,
        LoRoSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1] = js.undefined,
        LtRtCenterMixLevel: js.UndefOr[__doubleMinNegative60Max3] = js.undefined,
        LtRtSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1] = js.undefined,
        MetadataControl: js.UndefOr[Eac3MetadataControl] = js.undefined,
        PassthroughControl: js.UndefOr[Eac3PassthroughControl] = js.undefined,
        PhaseControl: js.UndefOr[Eac3PhaseControl] = js.undefined,
        SampleRate: js.UndefOr[__integerMin48000Max48000] = js.undefined,
        StereoDownmix: js.UndefOr[Eac3StereoDownmix] = js.undefined,
        SurroundExMode: js.UndefOr[Eac3SurroundExMode] = js.undefined,
        SurroundMode: js.UndefOr[Eac3SurroundMode] = js.undefined
    ): Eac3Settings = {
      val __obj = js.Dynamic.literal()
      AttenuationControl.foreach(__v => __obj.updateDynamic("AttenuationControl")(__v.asInstanceOf[js.Any]))
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      BitstreamMode.foreach(__v => __obj.updateDynamic("BitstreamMode")(__v.asInstanceOf[js.Any]))
      CodingMode.foreach(__v => __obj.updateDynamic("CodingMode")(__v.asInstanceOf[js.Any]))
      DcFilter.foreach(__v => __obj.updateDynamic("DcFilter")(__v.asInstanceOf[js.Any]))
      Dialnorm.foreach(__v => __obj.updateDynamic("Dialnorm")(__v.asInstanceOf[js.Any]))
      DynamicRangeCompressionLine.foreach(
        __v => __obj.updateDynamic("DynamicRangeCompressionLine")(__v.asInstanceOf[js.Any])
      )
      DynamicRangeCompressionRf.foreach(
        __v => __obj.updateDynamic("DynamicRangeCompressionRf")(__v.asInstanceOf[js.Any])
      )
      LfeControl.foreach(__v => __obj.updateDynamic("LfeControl")(__v.asInstanceOf[js.Any]))
      LfeFilter.foreach(__v => __obj.updateDynamic("LfeFilter")(__v.asInstanceOf[js.Any]))
      LoRoCenterMixLevel.foreach(__v => __obj.updateDynamic("LoRoCenterMixLevel")(__v.asInstanceOf[js.Any]))
      LoRoSurroundMixLevel.foreach(__v => __obj.updateDynamic("LoRoSurroundMixLevel")(__v.asInstanceOf[js.Any]))
      LtRtCenterMixLevel.foreach(__v => __obj.updateDynamic("LtRtCenterMixLevel")(__v.asInstanceOf[js.Any]))
      LtRtSurroundMixLevel.foreach(__v => __obj.updateDynamic("LtRtSurroundMixLevel")(__v.asInstanceOf[js.Any]))
      MetadataControl.foreach(__v => __obj.updateDynamic("MetadataControl")(__v.asInstanceOf[js.Any]))
      PassthroughControl.foreach(__v => __obj.updateDynamic("PassthroughControl")(__v.asInstanceOf[js.Any]))
      PhaseControl.foreach(__v => __obj.updateDynamic("PhaseControl")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      StereoDownmix.foreach(__v => __obj.updateDynamic("StereoDownmix")(__v.asInstanceOf[js.Any]))
      SurroundExMode.foreach(__v => __obj.updateDynamic("SurroundExMode")(__v.asInstanceOf[js.Any]))
      SurroundMode.foreach(__v => __obj.updateDynamic("SurroundMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Eac3Settings]
    }
  }

  /**
    * Choose how the service does stereo downmixing. This setting only applies if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you choose a different value for Coding mode, the service ignores Stereo downmix (Eac3StereoDownmix).
    */
  object Eac3StereoDownmixEnum {
    val NOT_INDICATED = "NOT_INDICATED"
    val LO_RO         = "LO_RO"
    val LT_RT         = "LT_RT"
    val DPL2          = "DPL2"

    val values = js.Object.freeze(js.Array(NOT_INDICATED, LO_RO, LT_RT, DPL2))
  }

  /**
    * When encoding 3/2 audio, sets whether an extra center back surround channel is matrix encoded into the left and right surround channels.
    */
  object Eac3SurroundExModeEnum {
    val NOT_INDICATED = "NOT_INDICATED"
    val ENABLED       = "ENABLED"
    val DISABLED      = "DISABLED"

    val values = js.Object.freeze(js.Array(NOT_INDICATED, ENABLED, DISABLED))
  }

  /**
    * When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded into the two channels.
    */
  object Eac3SurroundModeEnum {
    val NOT_INDICATED = "NOT_INDICATED"
    val ENABLED       = "ENABLED"
    val DISABLED      = "DISABLED"

    val values = js.Object.freeze(js.Array(NOT_INDICATED, ENABLED, DISABLED))
  }

  /**
    * When set to UPCONVERT, 608 data is both passed through via the "608 compatibility bytes" fields of the 708 wrapper as well as translated into 708. 708 data present in the source content will be discarded.
    */
  object EmbeddedConvert608To708Enum {
    val UPCONVERT = "UPCONVERT"
    val DISABLED  = "DISABLED"

    val values = js.Object.freeze(js.Array(UPCONVERT, DISABLED))
  }

  /**
    * Settings specific to embedded/ancillary caption outputs, including 608/708 Channel destination number.
    */
  @js.native
  trait EmbeddedDestinationSettings extends js.Object {
    var Destination608ChannelNumber: js.UndefOr[__integerMin1Max4]
    var Destination708ServiceNumber: js.UndefOr[__integerMin1Max6]
  }

  object EmbeddedDestinationSettings {
    @inline
    def apply(
        Destination608ChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined,
        Destination708ServiceNumber: js.UndefOr[__integerMin1Max6] = js.undefined
    ): EmbeddedDestinationSettings = {
      val __obj = js.Dynamic.literal()
      Destination608ChannelNumber.foreach(
        __v => __obj.updateDynamic("Destination608ChannelNumber")(__v.asInstanceOf[js.Any])
      )
      Destination708ServiceNumber.foreach(
        __v => __obj.updateDynamic("Destination708ServiceNumber")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[EmbeddedDestinationSettings]
    }
  }

  /**
    * Settings for embedded captions Source
    */
  @js.native
  trait EmbeddedSourceSettings extends js.Object {
    var Convert608To708: js.UndefOr[EmbeddedConvert608To708]
    var Source608ChannelNumber: js.UndefOr[__integerMin1Max4]
    var Source608TrackNumber: js.UndefOr[__integerMin1Max1]
  }

  object EmbeddedSourceSettings {
    @inline
    def apply(
        Convert608To708: js.UndefOr[EmbeddedConvert608To708] = js.undefined,
        Source608ChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined,
        Source608TrackNumber: js.UndefOr[__integerMin1Max1] = js.undefined
    ): EmbeddedSourceSettings = {
      val __obj = js.Dynamic.literal()
      Convert608To708.foreach(__v => __obj.updateDynamic("Convert608To708")(__v.asInstanceOf[js.Any]))
      Source608ChannelNumber.foreach(__v => __obj.updateDynamic("Source608ChannelNumber")(__v.asInstanceOf[js.Any]))
      Source608TrackNumber.foreach(__v => __obj.updateDynamic("Source608TrackNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmbeddedSourceSettings]
    }
  }

  /**
    * Describes an account-specific API endpoint.
    */
  @js.native
  trait Endpoint extends js.Object {
    var Url: js.UndefOr[__string]
  }

  object Endpoint {
    @inline
    def apply(
        Url: js.UndefOr[__string] = js.undefined
    ): Endpoint = {
      val __obj = js.Dynamic.literal()
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Endpoint]
    }
  }

  /**
    * ESAM ManifestConfirmConditionNotification defined by OC-SP-ESAM-API-I03-131025.
    */
  @js.native
  trait EsamManifestConfirmConditionNotification extends js.Object {
    var MccXml: js.UndefOr[__stringPatternSNManifestConfirmConditionNotificationNS]
  }

  object EsamManifestConfirmConditionNotification {
    @inline
    def apply(
        MccXml: js.UndefOr[__stringPatternSNManifestConfirmConditionNotificationNS] = js.undefined
    ): EsamManifestConfirmConditionNotification = {
      val __obj = js.Dynamic.literal()
      MccXml.foreach(__v => __obj.updateDynamic("MccXml")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EsamManifestConfirmConditionNotification]
    }
  }

  /**
    * Settings for Event Signaling And Messaging (ESAM). If you don't do ad insertion, you can ignore these settings.
    */
  @js.native
  trait EsamSettings extends js.Object {
    var ManifestConfirmConditionNotification: js.UndefOr[EsamManifestConfirmConditionNotification]
    var ResponseSignalPreroll: js.UndefOr[__integerMin0Max30000]
    var SignalProcessingNotification: js.UndefOr[EsamSignalProcessingNotification]
  }

  object EsamSettings {
    @inline
    def apply(
        ManifestConfirmConditionNotification: js.UndefOr[EsamManifestConfirmConditionNotification] = js.undefined,
        ResponseSignalPreroll: js.UndefOr[__integerMin0Max30000] = js.undefined,
        SignalProcessingNotification: js.UndefOr[EsamSignalProcessingNotification] = js.undefined
    ): EsamSettings = {
      val __obj = js.Dynamic.literal()
      ManifestConfirmConditionNotification.foreach(
        __v => __obj.updateDynamic("ManifestConfirmConditionNotification")(__v.asInstanceOf[js.Any])
      )
      ResponseSignalPreroll.foreach(__v => __obj.updateDynamic("ResponseSignalPreroll")(__v.asInstanceOf[js.Any]))
      SignalProcessingNotification.foreach(
        __v => __obj.updateDynamic("SignalProcessingNotification")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[EsamSettings]
    }
  }

  /**
    * ESAM SignalProcessingNotification data defined by OC-SP-ESAM-API-I03-131025.
    */
  @js.native
  trait EsamSignalProcessingNotification extends js.Object {
    var SccXml: js.UndefOr[__stringPatternSNSignalProcessingNotificationNS]
  }

  object EsamSignalProcessingNotification {
    @inline
    def apply(
        SccXml: js.UndefOr[__stringPatternSNSignalProcessingNotificationNS] = js.undefined
    ): EsamSignalProcessingNotification = {
      val __obj = js.Dynamic.literal()
      SccXml.foreach(__v => __obj.updateDynamic("SccXml")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EsamSignalProcessingNotification]
    }
  }

  /**
    * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
    */
  object F4vMoovPlacementEnum {
    val PROGRESSIVE_DOWNLOAD = "PROGRESSIVE_DOWNLOAD"
    val NORMAL               = "NORMAL"

    val values = js.Object.freeze(js.Array(PROGRESSIVE_DOWNLOAD, NORMAL))
  }

  /**
    * Settings for F4v container
    */
  @js.native
  trait F4vSettings extends js.Object {
    var MoovPlacement: js.UndefOr[F4vMoovPlacement]
  }

  object F4vSettings {
    @inline
    def apply(
        MoovPlacement: js.UndefOr[F4vMoovPlacement] = js.undefined
    ): F4vSettings = {
      val __obj = js.Dynamic.literal()
      MoovPlacement.foreach(__v => __obj.updateDynamic("MoovPlacement")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[F4vSettings]
    }
  }

  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to FILE_GROUP_SETTINGS.
    */
  @js.native
  trait FileGroupSettings extends js.Object {
    var Destination: js.UndefOr[__stringPatternS3]
    var DestinationSettings: js.UndefOr[DestinationSettings]
  }

  object FileGroupSettings {
    @inline
    def apply(
        Destination: js.UndefOr[__stringPatternS3] = js.undefined,
        DestinationSettings: js.UndefOr[DestinationSettings] = js.undefined
    ): FileGroupSettings = {
      val __obj = js.Dynamic.literal()
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      DestinationSettings.foreach(__v => __obj.updateDynamic("DestinationSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileGroupSettings]
    }
  }

  /**
    * If set to UPCONVERT, 608 caption data is both passed through via the "608 compatibility bytes" fields of the 708 wrapper as well as translated into 708. 708 data present in the source content will be discarded.
    */
  object FileSourceConvert608To708Enum {
    val UPCONVERT = "UPCONVERT"
    val DISABLED  = "DISABLED"

    val values = js.Object.freeze(js.Array(UPCONVERT, DISABLED))
  }

  /**
    * Settings for File-based Captions in Source
    */
  @js.native
  trait FileSourceSettings extends js.Object {
    var Convert608To708: js.UndefOr[FileSourceConvert608To708]
    var SourceFile: js.UndefOr[__stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTSmiSMI]
    var TimeDelta: js.UndefOr[__integerMinNegative2147483648Max2147483647]
  }

  object FileSourceSettings {
    @inline
    def apply(
        Convert608To708: js.UndefOr[FileSourceConvert608To708] = js.undefined,
        SourceFile: js.UndefOr[__stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTSmiSMI] = js.undefined,
        TimeDelta: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
    ): FileSourceSettings = {
      val __obj = js.Dynamic.literal()
      Convert608To708.foreach(__v => __obj.updateDynamic("Convert608To708")(__v.asInstanceOf[js.Any]))
      SourceFile.foreach(__v => __obj.updateDynamic("SourceFile")(__v.asInstanceOf[js.Any]))
      TimeDelta.foreach(__v => __obj.updateDynamic("TimeDelta")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileSourceSettings]
    }
  }

  /**
    * Provide the font script, using an ISO 15924 script code, if the LanguageCode is not sufficient for determining the script type. Where LanguageCode or CustomLanguageCode is sufficient, use "AUTOMATIC" or leave unset.
    */
  object FontScriptEnum {
    val AUTOMATIC = "AUTOMATIC"
    val HANS      = "HANS"
    val HANT      = "HANT"

    val values = js.Object.freeze(js.Array(AUTOMATIC, HANS, HANT))
  }

  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value FRAME_CAPTURE.
    */
  @js.native
  trait FrameCaptureSettings extends js.Object {
    var FramerateDenominator: js.UndefOr[__integerMin1Max2147483647]
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483647]
    var MaxCaptures: js.UndefOr[__integerMin1Max10000000]
    var Quality: js.UndefOr[__integerMin1Max100]
  }

  object FrameCaptureSettings {
    @inline
    def apply(
        FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        MaxCaptures: js.UndefOr[__integerMin1Max10000000] = js.undefined,
        Quality: js.UndefOr[__integerMin1Max100] = js.undefined
    ): FrameCaptureSettings = {
      val __obj = js.Dynamic.literal()
      FramerateDenominator.foreach(__v => __obj.updateDynamic("FramerateDenominator")(__v.asInstanceOf[js.Any]))
      FramerateNumerator.foreach(__v => __obj.updateDynamic("FramerateNumerator")(__v.asInstanceOf[js.Any]))
      MaxCaptures.foreach(__v => __obj.updateDynamic("MaxCaptures")(__v.asInstanceOf[js.Any]))
      Quality.foreach(__v => __obj.updateDynamic("Quality")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FrameCaptureSettings]
    }
  }

  @js.native
  trait GetJobRequest extends js.Object {
    var Id: __string
  }

  object GetJobRequest {
    @inline
    def apply(
        Id: __string
    ): GetJobRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetJobRequest]
    }
  }

  @js.native
  trait GetJobResponse extends js.Object {
    var Job: js.UndefOr[Job]
  }

  object GetJobResponse {
    @inline
    def apply(
        Job: js.UndefOr[Job] = js.undefined
    ): GetJobResponse = {
      val __obj = js.Dynamic.literal()
      Job.foreach(__v => __obj.updateDynamic("Job")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobResponse]
    }
  }

  @js.native
  trait GetJobTemplateRequest extends js.Object {
    var Name: __string
  }

  object GetJobTemplateRequest {
    @inline
    def apply(
        Name: __string
    ): GetJobTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetJobTemplateRequest]
    }
  }

  @js.native
  trait GetJobTemplateResponse extends js.Object {
    var JobTemplate: js.UndefOr[JobTemplate]
  }

  object GetJobTemplateResponse {
    @inline
    def apply(
        JobTemplate: js.UndefOr[JobTemplate] = js.undefined
    ): GetJobTemplateResponse = {
      val __obj = js.Dynamic.literal()
      JobTemplate.foreach(__v => __obj.updateDynamic("JobTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobTemplateResponse]
    }
  }

  @js.native
  trait GetPresetRequest extends js.Object {
    var Name: __string
  }

  object GetPresetRequest {
    @inline
    def apply(
        Name: __string
    ): GetPresetRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetPresetRequest]
    }
  }

  @js.native
  trait GetPresetResponse extends js.Object {
    var Preset: js.UndefOr[Preset]
  }

  object GetPresetResponse {
    @inline
    def apply(
        Preset: js.UndefOr[Preset] = js.undefined
    ): GetPresetResponse = {
      val __obj = js.Dynamic.literal()
      Preset.foreach(__v => __obj.updateDynamic("Preset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPresetResponse]
    }
  }

  @js.native
  trait GetQueueRequest extends js.Object {
    var Name: __string
  }

  object GetQueueRequest {
    @inline
    def apply(
        Name: __string
    ): GetQueueRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetQueueRequest]
    }
  }

  @js.native
  trait GetQueueResponse extends js.Object {
    var Queue: js.UndefOr[Queue]
  }

  object GetQueueResponse {
    @inline
    def apply(
        Queue: js.UndefOr[Queue] = js.undefined
    ): GetQueueResponse = {
      val __obj = js.Dynamic.literal()
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQueueResponse]
    }
  }

  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
    */
  object H264AdaptiveQuantizationEnum {
    val OFF    = "OFF"
    val LOW    = "LOW"
    val MEDIUM = "MEDIUM"
    val HIGH   = "HIGH"
    val HIGHER = "HIGHER"
    val MAX    = "MAX"

    val values = js.Object.freeze(js.Array(OFF, LOW, MEDIUM, HIGH, HIGHER, MAX))
  }

  /**
    * Specify an H.264 level that is consistent with your output video settings. If you aren't sure what level to specify, choose Auto (AUTO).
    */
  object H264CodecLevelEnum {
    val AUTO      = "AUTO"
    val LEVEL_1   = "LEVEL_1"
    val LEVEL_1_1 = "LEVEL_1_1"
    val LEVEL_1_2 = "LEVEL_1_2"
    val LEVEL_1_3 = "LEVEL_1_3"
    val LEVEL_2   = "LEVEL_2"
    val LEVEL_2_1 = "LEVEL_2_1"
    val LEVEL_2_2 = "LEVEL_2_2"
    val LEVEL_3   = "LEVEL_3"
    val LEVEL_3_1 = "LEVEL_3_1"
    val LEVEL_3_2 = "LEVEL_3_2"
    val LEVEL_4   = "LEVEL_4"
    val LEVEL_4_1 = "LEVEL_4_1"
    val LEVEL_4_2 = "LEVEL_4_2"
    val LEVEL_5   = "LEVEL_5"
    val LEVEL_5_1 = "LEVEL_5_1"
    val LEVEL_5_2 = "LEVEL_5_2"

    val values = js.Object.freeze(
      js.Array(
        AUTO,
        LEVEL_1,
        LEVEL_1_1,
        LEVEL_1_2,
        LEVEL_1_3,
        LEVEL_2,
        LEVEL_2_1,
        LEVEL_2_2,
        LEVEL_3,
        LEVEL_3_1,
        LEVEL_3_2,
        LEVEL_4,
        LEVEL_4_1,
        LEVEL_4_2,
        LEVEL_5,
        LEVEL_5_1,
        LEVEL_5_2
      )
    )
  }

  /**
    * H.264 Profile. High 4:2:2 and 10-bit profiles are only available with the AVC-I License.
    */
  object H264CodecProfileEnum {
    val BASELINE       = "BASELINE"
    val HIGH           = "HIGH"
    val HIGH_10BIT     = "HIGH_10BIT"
    val HIGH_422       = "HIGH_422"
    val HIGH_422_10BIT = "HIGH_422_10BIT"
    val MAIN           = "MAIN"

    val values = js.Object.freeze(js.Array(BASELINE, HIGH, HIGH_10BIT, HIGH_422, HIGH_422_10BIT, MAIN))
  }

  /**
    * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
    */
  object H264DynamicSubGopEnum {
    val ADAPTIVE = "ADAPTIVE"
    val STATIC   = "STATIC"

    val values = js.Object.freeze(js.Array(ADAPTIVE, STATIC))
  }

  /**
    * Entropy encoding mode. Use CABAC (must be in Main or High profile) or CAVLC.
    */
  object H264EntropyEncodingEnum {
    val CABAC = "CABAC"
    val CAVLC = "CAVLC"

    val values = js.Object.freeze(js.Array(CABAC, CAVLC))
  }

  /**
    * Choosing FORCE_FIELD disables PAFF encoding for interlaced outputs.
    */
  object H264FieldEncodingEnum {
    val PAFF        = "PAFF"
    val FORCE_FIELD = "FORCE_FIELD"

    val values = js.Object.freeze(js.Array(PAFF, FORCE_FIELD))
  }

  /**
    * Adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
    */
  object H264FlickerAdaptiveQuantizationEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  object H264FramerateControlEnum {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE"
    val SPECIFIED              = "SPECIFIED"

    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
    */
  object H264FramerateConversionAlgorithmEnum {
    val DUPLICATE_DROP = "DUPLICATE_DROP"
    val INTERPOLATE    = "INTERPOLATE"

    val values = js.Object.freeze(js.Array(DUPLICATE_DROP, INTERPOLATE))
  }

  /**
    * If enable, use reference B frames for GOP structures that have B frames > 1.
    */
  object H264GopBReferenceEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Indicates if the GOP Size in H264 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
    */
  object H264GopSizeUnitsEnum {
    val FRAMES  = "FRAMES"
    val SECONDS = "SECONDS"

    val values = js.Object.freeze(js.Array(FRAMES, SECONDS))
  }

  /**
    * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior depends on the input scan type, as follows.
    *   - If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first".
    *   - If the source is progressive, the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose.
    */
  object H264InterlaceModeEnum {
    val PROGRESSIVE         = "PROGRESSIVE"
    val TOP_FIELD           = "TOP_FIELD"
    val BOTTOM_FIELD        = "BOTTOM_FIELD"
    val FOLLOW_TOP_FIELD    = "FOLLOW_TOP_FIELD"
    val FOLLOW_BOTTOM_FIELD = "FOLLOW_BOTTOM_FIELD"

    val values = js.Object.freeze(js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD))
  }

  /**
    * Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the input. Using the console, do this by choosing Follow source for Pixel aspect ratio.
    */
  object H264ParControlEnum {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE"
    val SPECIFIED              = "SPECIFIED"

    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * Use Quality tuning level (H264QualityTuningLevel) to specifiy whether to use fast single-pass, high-quality singlepass, or high-quality multipass video encoding.
    */
  object H264QualityTuningLevelEnum {
    val SINGLE_PASS    = "SINGLE_PASS"
    val SINGLE_PASS_HQ = "SINGLE_PASS_HQ"
    val MULTI_PASS_HQ  = "MULTI_PASS_HQ"

    val values = js.Object.freeze(js.Array(SINGLE_PASS, SINGLE_PASS_HQ, MULTI_PASS_HQ))
  }

  /**
    * Settings for quality-defined variable bitrate encoding with the H.264 codec. Required when you set Rate control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate control mode.
    */
  @js.native
  trait H264QvbrSettings extends js.Object {
    var MaxAverageBitrate: js.UndefOr[__integerMin1000Max1152000000]
    var QvbrQualityLevel: js.UndefOr[__integerMin1Max10]
  }

  object H264QvbrSettings {
    @inline
    def apply(
        MaxAverageBitrate: js.UndefOr[__integerMin1000Max1152000000] = js.undefined,
        QvbrQualityLevel: js.UndefOr[__integerMin1Max10] = js.undefined
    ): H264QvbrSettings = {
      val __obj = js.Dynamic.literal()
      MaxAverageBitrate.foreach(__v => __obj.updateDynamic("MaxAverageBitrate")(__v.asInstanceOf[js.Any]))
      QvbrQualityLevel.foreach(__v => __obj.updateDynamic("QvbrQualityLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[H264QvbrSettings]
    }
  }

  /**
    * Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
    */
  object H264RateControlModeEnum {
    val VBR  = "VBR"
    val CBR  = "CBR"
    val QVBR = "QVBR"

    val values = js.Object.freeze(js.Array(VBR, CBR, QVBR))
  }

  /**
    * Places a PPS header on each encoded picture, even if repeated.
    */
  object H264RepeatPpsEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default. If this output uses QVBR, choose Transition detection (TRANSITION_DETECTION) for further video quality improvement. For more information about QVBR, see https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
    */
  object H264SceneChangeDetectEnum {
    val DISABLED             = "DISABLED"
    val ENABLED              = "ENABLED"
    val TRANSITION_DETECTION = "TRANSITION_DETECTION"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED, TRANSITION_DETECTION))
  }

  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value H_264.
    */
  @js.native
  trait H264Settings extends js.Object {
    var AdaptiveQuantization: js.UndefOr[H264AdaptiveQuantization]
    var Bitrate: js.UndefOr[__integerMin1000Max1152000000]
    var CodecLevel: js.UndefOr[H264CodecLevel]
    var CodecProfile: js.UndefOr[H264CodecProfile]
    var DynamicSubGop: js.UndefOr[H264DynamicSubGop]
    var EntropyEncoding: js.UndefOr[H264EntropyEncoding]
    var FieldEncoding: js.UndefOr[H264FieldEncoding]
    var FlickerAdaptiveQuantization: js.UndefOr[H264FlickerAdaptiveQuantization]
    var FramerateControl: js.UndefOr[H264FramerateControl]
    var FramerateConversionAlgorithm: js.UndefOr[H264FramerateConversionAlgorithm]
    var FramerateDenominator: js.UndefOr[__integerMin1Max2147483647]
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483647]
    var GopBReference: js.UndefOr[H264GopBReference]
    var GopClosedCadence: js.UndefOr[__integerMin0Max2147483647]
    var GopSize: js.UndefOr[__doubleMin0]
    var GopSizeUnits: js.UndefOr[H264GopSizeUnits]
    var HrdBufferInitialFillPercentage: js.UndefOr[__integerMin0Max100]
    var HrdBufferSize: js.UndefOr[__integerMin0Max1152000000]
    var InterlaceMode: js.UndefOr[H264InterlaceMode]
    var MaxBitrate: js.UndefOr[__integerMin1000Max1152000000]
    var MinIInterval: js.UndefOr[__integerMin0Max30]
    var NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin0Max7]
    var NumberReferenceFrames: js.UndefOr[__integerMin1Max6]
    var ParControl: js.UndefOr[H264ParControl]
    var ParDenominator: js.UndefOr[__integerMin1Max2147483647]
    var ParNumerator: js.UndefOr[__integerMin1Max2147483647]
    var QualityTuningLevel: js.UndefOr[H264QualityTuningLevel]
    var QvbrSettings: js.UndefOr[H264QvbrSettings]
    var RateControlMode: js.UndefOr[H264RateControlMode]
    var RepeatPps: js.UndefOr[H264RepeatPps]
    var SceneChangeDetect: js.UndefOr[H264SceneChangeDetect]
    var Slices: js.UndefOr[__integerMin1Max32]
    var SlowPal: js.UndefOr[H264SlowPal]
    var Softness: js.UndefOr[__integerMin0Max128]
    var SpatialAdaptiveQuantization: js.UndefOr[H264SpatialAdaptiveQuantization]
    var Syntax: js.UndefOr[H264Syntax]
    var Telecine: js.UndefOr[H264Telecine]
    var TemporalAdaptiveQuantization: js.UndefOr[H264TemporalAdaptiveQuantization]
    var UnregisteredSeiTimecode: js.UndefOr[H264UnregisteredSeiTimecode]
  }

  object H264Settings {
    @inline
    def apply(
        AdaptiveQuantization: js.UndefOr[H264AdaptiveQuantization] = js.undefined,
        Bitrate: js.UndefOr[__integerMin1000Max1152000000] = js.undefined,
        CodecLevel: js.UndefOr[H264CodecLevel] = js.undefined,
        CodecProfile: js.UndefOr[H264CodecProfile] = js.undefined,
        DynamicSubGop: js.UndefOr[H264DynamicSubGop] = js.undefined,
        EntropyEncoding: js.UndefOr[H264EntropyEncoding] = js.undefined,
        FieldEncoding: js.UndefOr[H264FieldEncoding] = js.undefined,
        FlickerAdaptiveQuantization: js.UndefOr[H264FlickerAdaptiveQuantization] = js.undefined,
        FramerateControl: js.UndefOr[H264FramerateControl] = js.undefined,
        FramerateConversionAlgorithm: js.UndefOr[H264FramerateConversionAlgorithm] = js.undefined,
        FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        GopBReference: js.UndefOr[H264GopBReference] = js.undefined,
        GopClosedCadence: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        GopSize: js.UndefOr[__doubleMin0] = js.undefined,
        GopSizeUnits: js.UndefOr[H264GopSizeUnits] = js.undefined,
        HrdBufferInitialFillPercentage: js.UndefOr[__integerMin0Max100] = js.undefined,
        HrdBufferSize: js.UndefOr[__integerMin0Max1152000000] = js.undefined,
        InterlaceMode: js.UndefOr[H264InterlaceMode] = js.undefined,
        MaxBitrate: js.UndefOr[__integerMin1000Max1152000000] = js.undefined,
        MinIInterval: js.UndefOr[__integerMin0Max30] = js.undefined,
        NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin0Max7] = js.undefined,
        NumberReferenceFrames: js.UndefOr[__integerMin1Max6] = js.undefined,
        ParControl: js.UndefOr[H264ParControl] = js.undefined,
        ParDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        ParNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        QualityTuningLevel: js.UndefOr[H264QualityTuningLevel] = js.undefined,
        QvbrSettings: js.UndefOr[H264QvbrSettings] = js.undefined,
        RateControlMode: js.UndefOr[H264RateControlMode] = js.undefined,
        RepeatPps: js.UndefOr[H264RepeatPps] = js.undefined,
        SceneChangeDetect: js.UndefOr[H264SceneChangeDetect] = js.undefined,
        Slices: js.UndefOr[__integerMin1Max32] = js.undefined,
        SlowPal: js.UndefOr[H264SlowPal] = js.undefined,
        Softness: js.UndefOr[__integerMin0Max128] = js.undefined,
        SpatialAdaptiveQuantization: js.UndefOr[H264SpatialAdaptiveQuantization] = js.undefined,
        Syntax: js.UndefOr[H264Syntax] = js.undefined,
        Telecine: js.UndefOr[H264Telecine] = js.undefined,
        TemporalAdaptiveQuantization: js.UndefOr[H264TemporalAdaptiveQuantization] = js.undefined,
        UnregisteredSeiTimecode: js.UndefOr[H264UnregisteredSeiTimecode] = js.undefined
    ): H264Settings = {
      val __obj = js.Dynamic.literal()
      AdaptiveQuantization.foreach(__v => __obj.updateDynamic("AdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      CodecLevel.foreach(__v => __obj.updateDynamic("CodecLevel")(__v.asInstanceOf[js.Any]))
      CodecProfile.foreach(__v => __obj.updateDynamic("CodecProfile")(__v.asInstanceOf[js.Any]))
      DynamicSubGop.foreach(__v => __obj.updateDynamic("DynamicSubGop")(__v.asInstanceOf[js.Any]))
      EntropyEncoding.foreach(__v => __obj.updateDynamic("EntropyEncoding")(__v.asInstanceOf[js.Any]))
      FieldEncoding.foreach(__v => __obj.updateDynamic("FieldEncoding")(__v.asInstanceOf[js.Any]))
      FlickerAdaptiveQuantization.foreach(
        __v => __obj.updateDynamic("FlickerAdaptiveQuantization")(__v.asInstanceOf[js.Any])
      )
      FramerateControl.foreach(__v => __obj.updateDynamic("FramerateControl")(__v.asInstanceOf[js.Any]))
      FramerateConversionAlgorithm.foreach(
        __v => __obj.updateDynamic("FramerateConversionAlgorithm")(__v.asInstanceOf[js.Any])
      )
      FramerateDenominator.foreach(__v => __obj.updateDynamic("FramerateDenominator")(__v.asInstanceOf[js.Any]))
      FramerateNumerator.foreach(__v => __obj.updateDynamic("FramerateNumerator")(__v.asInstanceOf[js.Any]))
      GopBReference.foreach(__v => __obj.updateDynamic("GopBReference")(__v.asInstanceOf[js.Any]))
      GopClosedCadence.foreach(__v => __obj.updateDynamic("GopClosedCadence")(__v.asInstanceOf[js.Any]))
      GopSize.foreach(__v => __obj.updateDynamic("GopSize")(__v.asInstanceOf[js.Any]))
      GopSizeUnits.foreach(__v => __obj.updateDynamic("GopSizeUnits")(__v.asInstanceOf[js.Any]))
      HrdBufferInitialFillPercentage.foreach(
        __v => __obj.updateDynamic("HrdBufferInitialFillPercentage")(__v.asInstanceOf[js.Any])
      )
      HrdBufferSize.foreach(__v => __obj.updateDynamic("HrdBufferSize")(__v.asInstanceOf[js.Any]))
      InterlaceMode.foreach(__v => __obj.updateDynamic("InterlaceMode")(__v.asInstanceOf[js.Any]))
      MaxBitrate.foreach(__v => __obj.updateDynamic("MaxBitrate")(__v.asInstanceOf[js.Any]))
      MinIInterval.foreach(__v => __obj.updateDynamic("MinIInterval")(__v.asInstanceOf[js.Any]))
      NumberBFramesBetweenReferenceFrames.foreach(
        __v => __obj.updateDynamic("NumberBFramesBetweenReferenceFrames")(__v.asInstanceOf[js.Any])
      )
      NumberReferenceFrames.foreach(__v => __obj.updateDynamic("NumberReferenceFrames")(__v.asInstanceOf[js.Any]))
      ParControl.foreach(__v => __obj.updateDynamic("ParControl")(__v.asInstanceOf[js.Any]))
      ParDenominator.foreach(__v => __obj.updateDynamic("ParDenominator")(__v.asInstanceOf[js.Any]))
      ParNumerator.foreach(__v => __obj.updateDynamic("ParNumerator")(__v.asInstanceOf[js.Any]))
      QualityTuningLevel.foreach(__v => __obj.updateDynamic("QualityTuningLevel")(__v.asInstanceOf[js.Any]))
      QvbrSettings.foreach(__v => __obj.updateDynamic("QvbrSettings")(__v.asInstanceOf[js.Any]))
      RateControlMode.foreach(__v => __obj.updateDynamic("RateControlMode")(__v.asInstanceOf[js.Any]))
      RepeatPps.foreach(__v => __obj.updateDynamic("RepeatPps")(__v.asInstanceOf[js.Any]))
      SceneChangeDetect.foreach(__v => __obj.updateDynamic("SceneChangeDetect")(__v.asInstanceOf[js.Any]))
      Slices.foreach(__v => __obj.updateDynamic("Slices")(__v.asInstanceOf[js.Any]))
      SlowPal.foreach(__v => __obj.updateDynamic("SlowPal")(__v.asInstanceOf[js.Any]))
      Softness.foreach(__v => __obj.updateDynamic("Softness")(__v.asInstanceOf[js.Any]))
      SpatialAdaptiveQuantization.foreach(
        __v => __obj.updateDynamic("SpatialAdaptiveQuantization")(__v.asInstanceOf[js.Any])
      )
      Syntax.foreach(__v => __obj.updateDynamic("Syntax")(__v.asInstanceOf[js.Any]))
      Telecine.foreach(__v => __obj.updateDynamic("Telecine")(__v.asInstanceOf[js.Any]))
      TemporalAdaptiveQuantization.foreach(
        __v => __obj.updateDynamic("TemporalAdaptiveQuantization")(__v.asInstanceOf[js.Any])
      )
      UnregisteredSeiTimecode.foreach(__v => __obj.updateDynamic("UnregisteredSeiTimecode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[H264Settings]
    }
  }

  /**
    * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
    */
  object H264SlowPalEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Adjust quantization within each frame based on spatial variation of content complexity.
    */
  object H264SpatialAdaptiveQuantizationEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Produces a bitstream compliant with SMPTE RP-2027.
    */
  object H264SyntaxEnum {
    val DEFAULT = "DEFAULT"
    val RP2027  = "RP2027"

    val values = js.Object.freeze(js.Array(DEFAULT, RP2027))
  }

  /**
    * This field applies only if the Streams > Advanced > Framerate (framerate) field  is set to 29.970. This field works with the Streams > Advanced > Preprocessors > Deinterlacer  field (deinterlace_mode) and the Streams > Advanced > Interlaced Mode field (interlace_mode)  to identify the scan type for the output: Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces 23.976; the player converts this output to 29.97i.
    */
  object H264TelecineEnum {
    val NONE = "NONE"
    val SOFT = "SOFT"
    val HARD = "HARD"

    val values = js.Object.freeze(js.Array(NONE, SOFT, HARD))
  }

  /**
    * Adjust quantization within each frame based on temporal variation of content complexity.
    */
  object H264TemporalAdaptiveQuantizationEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
    */
  object H264UnregisteredSeiTimecodeEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
    */
  object H265AdaptiveQuantizationEnum {
    val OFF    = "OFF"
    val LOW    = "LOW"
    val MEDIUM = "MEDIUM"
    val HIGH   = "HIGH"
    val HIGHER = "HIGHER"
    val MAX    = "MAX"

    val values = js.Object.freeze(js.Array(OFF, LOW, MEDIUM, HIGH, HIGHER, MAX))
  }

  /**
    * Enables Alternate Transfer Function SEI message for outputs using Hybrid Log Gamma (HLG) Electro-Optical Transfer Function (EOTF).
    */
  object H265AlternateTransferFunctionSeiEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * H.265 Level.
    */
  object H265CodecLevelEnum {
    val AUTO      = "AUTO"
    val LEVEL_1   = "LEVEL_1"
    val LEVEL_2   = "LEVEL_2"
    val LEVEL_2_1 = "LEVEL_2_1"
    val LEVEL_3   = "LEVEL_3"
    val LEVEL_3_1 = "LEVEL_3_1"
    val LEVEL_4   = "LEVEL_4"
    val LEVEL_4_1 = "LEVEL_4_1"
    val LEVEL_5   = "LEVEL_5"
    val LEVEL_5_1 = "LEVEL_5_1"
    val LEVEL_5_2 = "LEVEL_5_2"
    val LEVEL_6   = "LEVEL_6"
    val LEVEL_6_1 = "LEVEL_6_1"
    val LEVEL_6_2 = "LEVEL_6_2"

    val values = js.Object.freeze(
      js.Array(
        AUTO,
        LEVEL_1,
        LEVEL_2,
        LEVEL_2_1,
        LEVEL_3,
        LEVEL_3_1,
        LEVEL_4,
        LEVEL_4_1,
        LEVEL_5,
        LEVEL_5_1,
        LEVEL_5_2,
        LEVEL_6,
        LEVEL_6_1,
        LEVEL_6_2
      )
    )
  }

  /**
    * Represents the Profile and Tier, per the HEVC (H.265) specification. Selections are grouped as [Profile] / [Tier], so "Main/High" represents Main Profile with High Tier. 4:2:2 profiles are only available with the HEVC 4:2:2 License.
    */
  object H265CodecProfileEnum {
    val MAIN_MAIN           = "MAIN_MAIN"
    val MAIN_HIGH           = "MAIN_HIGH"
    val MAIN10_MAIN         = "MAIN10_MAIN"
    val MAIN10_HIGH         = "MAIN10_HIGH"
    val MAIN_422_8BIT_MAIN  = "MAIN_422_8BIT_MAIN"
    val MAIN_422_8BIT_HIGH  = "MAIN_422_8BIT_HIGH"
    val MAIN_422_10BIT_MAIN = "MAIN_422_10BIT_MAIN"
    val MAIN_422_10BIT_HIGH = "MAIN_422_10BIT_HIGH"

    val values = js.Object.freeze(
      js.Array(
        MAIN_MAIN,
        MAIN_HIGH,
        MAIN10_MAIN,
        MAIN10_HIGH,
        MAIN_422_8BIT_MAIN,
        MAIN_422_8BIT_HIGH,
        MAIN_422_10BIT_MAIN,
        MAIN_422_10BIT_HIGH
      )
    )
  }

  /**
    * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
    */
  object H265DynamicSubGopEnum {
    val ADAPTIVE = "ADAPTIVE"
    val STATIC   = "STATIC"

    val values = js.Object.freeze(js.Array(ADAPTIVE, STATIC))
  }

  /**
    * Adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
    */
  object H265FlickerAdaptiveQuantizationEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job sepecification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  object H265FramerateControlEnum {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE"
    val SPECIFIED              = "SPECIFIED"

    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
    */
  object H265FramerateConversionAlgorithmEnum {
    val DUPLICATE_DROP = "DUPLICATE_DROP"
    val INTERPOLATE    = "INTERPOLATE"

    val values = js.Object.freeze(js.Array(DUPLICATE_DROP, INTERPOLATE))
  }

  /**
    * If enable, use reference B frames for GOP structures that have B frames > 1.
    */
  object H265GopBReferenceEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Indicates if the GOP Size in H265 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
    */
  object H265GopSizeUnitsEnum {
    val FRAMES  = "FRAMES"
    val SECONDS = "SECONDS"

    val values = js.Object.freeze(js.Array(FRAMES, SECONDS))
  }

  /**
    * Choose the scan line type for the output. Choose Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Choose Top Field First (TOP_FIELD) or Bottom Field First (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Choose Follow, Default Top (FOLLOW_TOP_FIELD) or Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) to create an interlaced output with the same field polarity as the source. If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first". If the source is progressive, your output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose. If you don't choose a value, the service will default to Progressive (PROGRESSIVE).
    */
  object H265InterlaceModeEnum {
    val PROGRESSIVE         = "PROGRESSIVE"
    val TOP_FIELD           = "TOP_FIELD"
    val BOTTOM_FIELD        = "BOTTOM_FIELD"
    val FOLLOW_TOP_FIELD    = "FOLLOW_TOP_FIELD"
    val FOLLOW_BOTTOM_FIELD = "FOLLOW_BOTTOM_FIELD"

    val values = js.Object.freeze(js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD))
  }

  /**
    * Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the input. Using the console, do this by choosing Follow source for Pixel aspect ratio.
    */
  object H265ParControlEnum {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE"
    val SPECIFIED              = "SPECIFIED"

    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * Use Quality tuning level (H265QualityTuningLevel) to specifiy whether to use fast single-pass, high-quality singlepass, or high-quality multipass video encoding.
    */
  object H265QualityTuningLevelEnum {
    val SINGLE_PASS    = "SINGLE_PASS"
    val SINGLE_PASS_HQ = "SINGLE_PASS_HQ"
    val MULTI_PASS_HQ  = "MULTI_PASS_HQ"

    val values = js.Object.freeze(js.Array(SINGLE_PASS, SINGLE_PASS_HQ, MULTI_PASS_HQ))
  }

  /**
    * Settings for quality-defined variable bitrate encoding with the H.265 codec. Required when you set Rate control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate control mode.
    */
  @js.native
  trait H265QvbrSettings extends js.Object {
    var MaxAverageBitrate: js.UndefOr[__integerMin1000Max1466400000]
    var QvbrQualityLevel: js.UndefOr[__integerMin1Max10]
  }

  object H265QvbrSettings {
    @inline
    def apply(
        MaxAverageBitrate: js.UndefOr[__integerMin1000Max1466400000] = js.undefined,
        QvbrQualityLevel: js.UndefOr[__integerMin1Max10] = js.undefined
    ): H265QvbrSettings = {
      val __obj = js.Dynamic.literal()
      MaxAverageBitrate.foreach(__v => __obj.updateDynamic("MaxAverageBitrate")(__v.asInstanceOf[js.Any]))
      QvbrQualityLevel.foreach(__v => __obj.updateDynamic("QvbrQualityLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[H265QvbrSettings]
    }
  }

  /**
    * Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
    */
  object H265RateControlModeEnum {
    val VBR  = "VBR"
    val CBR  = "CBR"
    val QVBR = "QVBR"

    val values = js.Object.freeze(js.Array(VBR, CBR, QVBR))
  }

  /**
    * Specify Sample Adaptive Offset (SAO) filter strength.  Adaptive mode dynamically selects best strength based on content
    */
  object H265SampleAdaptiveOffsetFilterModeEnum {
    val DEFAULT  = "DEFAULT"
    val ADAPTIVE = "ADAPTIVE"
    val OFF      = "OFF"

    val values = js.Object.freeze(js.Array(DEFAULT, ADAPTIVE, OFF))
  }

  /**
    * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default. If this output uses QVBR, choose Transition detection (TRANSITION_DETECTION) for further video quality improvement. For more information about QVBR, see https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
    */
  object H265SceneChangeDetectEnum {
    val DISABLED             = "DISABLED"
    val ENABLED              = "ENABLED"
    val TRANSITION_DETECTION = "TRANSITION_DETECTION"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED, TRANSITION_DETECTION))
  }

  /**
    * Settings for H265 codec
    */
  @js.native
  trait H265Settings extends js.Object {
    var AdaptiveQuantization: js.UndefOr[H265AdaptiveQuantization]
    var AlternateTransferFunctionSei: js.UndefOr[H265AlternateTransferFunctionSei]
    var Bitrate: js.UndefOr[__integerMin1000Max1466400000]
    var CodecLevel: js.UndefOr[H265CodecLevel]
    var CodecProfile: js.UndefOr[H265CodecProfile]
    var DynamicSubGop: js.UndefOr[H265DynamicSubGop]
    var FlickerAdaptiveQuantization: js.UndefOr[H265FlickerAdaptiveQuantization]
    var FramerateControl: js.UndefOr[H265FramerateControl]
    var FramerateConversionAlgorithm: js.UndefOr[H265FramerateConversionAlgorithm]
    var FramerateDenominator: js.UndefOr[__integerMin1Max2147483647]
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483647]
    var GopBReference: js.UndefOr[H265GopBReference]
    var GopClosedCadence: js.UndefOr[__integerMin0Max2147483647]
    var GopSize: js.UndefOr[__doubleMin0]
    var GopSizeUnits: js.UndefOr[H265GopSizeUnits]
    var HrdBufferInitialFillPercentage: js.UndefOr[__integerMin0Max100]
    var HrdBufferSize: js.UndefOr[__integerMin0Max1466400000]
    var InterlaceMode: js.UndefOr[H265InterlaceMode]
    var MaxBitrate: js.UndefOr[__integerMin1000Max1466400000]
    var MinIInterval: js.UndefOr[__integerMin0Max30]
    var NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin0Max7]
    var NumberReferenceFrames: js.UndefOr[__integerMin1Max6]
    var ParControl: js.UndefOr[H265ParControl]
    var ParDenominator: js.UndefOr[__integerMin1Max2147483647]
    var ParNumerator: js.UndefOr[__integerMin1Max2147483647]
    var QualityTuningLevel: js.UndefOr[H265QualityTuningLevel]
    var QvbrSettings: js.UndefOr[H265QvbrSettings]
    var RateControlMode: js.UndefOr[H265RateControlMode]
    var SampleAdaptiveOffsetFilterMode: js.UndefOr[H265SampleAdaptiveOffsetFilterMode]
    var SceneChangeDetect: js.UndefOr[H265SceneChangeDetect]
    var Slices: js.UndefOr[__integerMin1Max32]
    var SlowPal: js.UndefOr[H265SlowPal]
    var SpatialAdaptiveQuantization: js.UndefOr[H265SpatialAdaptiveQuantization]
    var Telecine: js.UndefOr[H265Telecine]
    var TemporalAdaptiveQuantization: js.UndefOr[H265TemporalAdaptiveQuantization]
    var TemporalIds: js.UndefOr[H265TemporalIds]
    var Tiles: js.UndefOr[H265Tiles]
    var UnregisteredSeiTimecode: js.UndefOr[H265UnregisteredSeiTimecode]
    var WriteMp4PackagingType: js.UndefOr[H265WriteMp4PackagingType]
  }

  object H265Settings {
    @inline
    def apply(
        AdaptiveQuantization: js.UndefOr[H265AdaptiveQuantization] = js.undefined,
        AlternateTransferFunctionSei: js.UndefOr[H265AlternateTransferFunctionSei] = js.undefined,
        Bitrate: js.UndefOr[__integerMin1000Max1466400000] = js.undefined,
        CodecLevel: js.UndefOr[H265CodecLevel] = js.undefined,
        CodecProfile: js.UndefOr[H265CodecProfile] = js.undefined,
        DynamicSubGop: js.UndefOr[H265DynamicSubGop] = js.undefined,
        FlickerAdaptiveQuantization: js.UndefOr[H265FlickerAdaptiveQuantization] = js.undefined,
        FramerateControl: js.UndefOr[H265FramerateControl] = js.undefined,
        FramerateConversionAlgorithm: js.UndefOr[H265FramerateConversionAlgorithm] = js.undefined,
        FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        GopBReference: js.UndefOr[H265GopBReference] = js.undefined,
        GopClosedCadence: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        GopSize: js.UndefOr[__doubleMin0] = js.undefined,
        GopSizeUnits: js.UndefOr[H265GopSizeUnits] = js.undefined,
        HrdBufferInitialFillPercentage: js.UndefOr[__integerMin0Max100] = js.undefined,
        HrdBufferSize: js.UndefOr[__integerMin0Max1466400000] = js.undefined,
        InterlaceMode: js.UndefOr[H265InterlaceMode] = js.undefined,
        MaxBitrate: js.UndefOr[__integerMin1000Max1466400000] = js.undefined,
        MinIInterval: js.UndefOr[__integerMin0Max30] = js.undefined,
        NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin0Max7] = js.undefined,
        NumberReferenceFrames: js.UndefOr[__integerMin1Max6] = js.undefined,
        ParControl: js.UndefOr[H265ParControl] = js.undefined,
        ParDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        ParNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        QualityTuningLevel: js.UndefOr[H265QualityTuningLevel] = js.undefined,
        QvbrSettings: js.UndefOr[H265QvbrSettings] = js.undefined,
        RateControlMode: js.UndefOr[H265RateControlMode] = js.undefined,
        SampleAdaptiveOffsetFilterMode: js.UndefOr[H265SampleAdaptiveOffsetFilterMode] = js.undefined,
        SceneChangeDetect: js.UndefOr[H265SceneChangeDetect] = js.undefined,
        Slices: js.UndefOr[__integerMin1Max32] = js.undefined,
        SlowPal: js.UndefOr[H265SlowPal] = js.undefined,
        SpatialAdaptiveQuantization: js.UndefOr[H265SpatialAdaptiveQuantization] = js.undefined,
        Telecine: js.UndefOr[H265Telecine] = js.undefined,
        TemporalAdaptiveQuantization: js.UndefOr[H265TemporalAdaptiveQuantization] = js.undefined,
        TemporalIds: js.UndefOr[H265TemporalIds] = js.undefined,
        Tiles: js.UndefOr[H265Tiles] = js.undefined,
        UnregisteredSeiTimecode: js.UndefOr[H265UnregisteredSeiTimecode] = js.undefined,
        WriteMp4PackagingType: js.UndefOr[H265WriteMp4PackagingType] = js.undefined
    ): H265Settings = {
      val __obj = js.Dynamic.literal()
      AdaptiveQuantization.foreach(__v => __obj.updateDynamic("AdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      AlternateTransferFunctionSei.foreach(
        __v => __obj.updateDynamic("AlternateTransferFunctionSei")(__v.asInstanceOf[js.Any])
      )
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      CodecLevel.foreach(__v => __obj.updateDynamic("CodecLevel")(__v.asInstanceOf[js.Any]))
      CodecProfile.foreach(__v => __obj.updateDynamic("CodecProfile")(__v.asInstanceOf[js.Any]))
      DynamicSubGop.foreach(__v => __obj.updateDynamic("DynamicSubGop")(__v.asInstanceOf[js.Any]))
      FlickerAdaptiveQuantization.foreach(
        __v => __obj.updateDynamic("FlickerAdaptiveQuantization")(__v.asInstanceOf[js.Any])
      )
      FramerateControl.foreach(__v => __obj.updateDynamic("FramerateControl")(__v.asInstanceOf[js.Any]))
      FramerateConversionAlgorithm.foreach(
        __v => __obj.updateDynamic("FramerateConversionAlgorithm")(__v.asInstanceOf[js.Any])
      )
      FramerateDenominator.foreach(__v => __obj.updateDynamic("FramerateDenominator")(__v.asInstanceOf[js.Any]))
      FramerateNumerator.foreach(__v => __obj.updateDynamic("FramerateNumerator")(__v.asInstanceOf[js.Any]))
      GopBReference.foreach(__v => __obj.updateDynamic("GopBReference")(__v.asInstanceOf[js.Any]))
      GopClosedCadence.foreach(__v => __obj.updateDynamic("GopClosedCadence")(__v.asInstanceOf[js.Any]))
      GopSize.foreach(__v => __obj.updateDynamic("GopSize")(__v.asInstanceOf[js.Any]))
      GopSizeUnits.foreach(__v => __obj.updateDynamic("GopSizeUnits")(__v.asInstanceOf[js.Any]))
      HrdBufferInitialFillPercentage.foreach(
        __v => __obj.updateDynamic("HrdBufferInitialFillPercentage")(__v.asInstanceOf[js.Any])
      )
      HrdBufferSize.foreach(__v => __obj.updateDynamic("HrdBufferSize")(__v.asInstanceOf[js.Any]))
      InterlaceMode.foreach(__v => __obj.updateDynamic("InterlaceMode")(__v.asInstanceOf[js.Any]))
      MaxBitrate.foreach(__v => __obj.updateDynamic("MaxBitrate")(__v.asInstanceOf[js.Any]))
      MinIInterval.foreach(__v => __obj.updateDynamic("MinIInterval")(__v.asInstanceOf[js.Any]))
      NumberBFramesBetweenReferenceFrames.foreach(
        __v => __obj.updateDynamic("NumberBFramesBetweenReferenceFrames")(__v.asInstanceOf[js.Any])
      )
      NumberReferenceFrames.foreach(__v => __obj.updateDynamic("NumberReferenceFrames")(__v.asInstanceOf[js.Any]))
      ParControl.foreach(__v => __obj.updateDynamic("ParControl")(__v.asInstanceOf[js.Any]))
      ParDenominator.foreach(__v => __obj.updateDynamic("ParDenominator")(__v.asInstanceOf[js.Any]))
      ParNumerator.foreach(__v => __obj.updateDynamic("ParNumerator")(__v.asInstanceOf[js.Any]))
      QualityTuningLevel.foreach(__v => __obj.updateDynamic("QualityTuningLevel")(__v.asInstanceOf[js.Any]))
      QvbrSettings.foreach(__v => __obj.updateDynamic("QvbrSettings")(__v.asInstanceOf[js.Any]))
      RateControlMode.foreach(__v => __obj.updateDynamic("RateControlMode")(__v.asInstanceOf[js.Any]))
      SampleAdaptiveOffsetFilterMode.foreach(
        __v => __obj.updateDynamic("SampleAdaptiveOffsetFilterMode")(__v.asInstanceOf[js.Any])
      )
      SceneChangeDetect.foreach(__v => __obj.updateDynamic("SceneChangeDetect")(__v.asInstanceOf[js.Any]))
      Slices.foreach(__v => __obj.updateDynamic("Slices")(__v.asInstanceOf[js.Any]))
      SlowPal.foreach(__v => __obj.updateDynamic("SlowPal")(__v.asInstanceOf[js.Any]))
      SpatialAdaptiveQuantization.foreach(
        __v => __obj.updateDynamic("SpatialAdaptiveQuantization")(__v.asInstanceOf[js.Any])
      )
      Telecine.foreach(__v => __obj.updateDynamic("Telecine")(__v.asInstanceOf[js.Any]))
      TemporalAdaptiveQuantization.foreach(
        __v => __obj.updateDynamic("TemporalAdaptiveQuantization")(__v.asInstanceOf[js.Any])
      )
      TemporalIds.foreach(__v => __obj.updateDynamic("TemporalIds")(__v.asInstanceOf[js.Any]))
      Tiles.foreach(__v => __obj.updateDynamic("Tiles")(__v.asInstanceOf[js.Any]))
      UnregisteredSeiTimecode.foreach(__v => __obj.updateDynamic("UnregisteredSeiTimecode")(__v.asInstanceOf[js.Any]))
      WriteMp4PackagingType.foreach(__v => __obj.updateDynamic("WriteMp4PackagingType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[H265Settings]
    }
  }

  /**
    * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
    */
  object H265SlowPalEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Adjust quantization within each frame based on spatial variation of content complexity.
    */
  object H265SpatialAdaptiveQuantizationEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * This field applies only if the Streams > Advanced > Framerate (framerate) field  is set to 29.970. This field works with the Streams > Advanced > Preprocessors > Deinterlacer  field (deinterlace_mode) and the Streams > Advanced > Interlaced Mode field (interlace_mode)  to identify the scan type for the output: Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces 23.976; the player converts this output to 29.97i.
    */
  object H265TelecineEnum {
    val NONE = "NONE"
    val SOFT = "SOFT"
    val HARD = "HARD"

    val values = js.Object.freeze(js.Array(NONE, SOFT, HARD))
  }

  /**
    * Adjust quantization within each frame based on temporal variation of content complexity.
    */
  object H265TemporalAdaptiveQuantizationEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Enables temporal layer identifiers in the encoded bitstream. Up to 3 layers are supported depending on GOP structure: I- and P-frames form one layer, reference B-frames can form a second layer and non-reference b-frames can form a third layer. Decoders can optionally decode only the lower temporal layers to generate a lower frame rate output. For example, given a bitstream with temporal IDs and with b-frames = 1 (i.e. IbPbPb display order), a decoder could decode all the frames for full frame rate output or only the I and P frames (lowest temporal layer) for a half frame rate output.
    */
  object H265TemporalIdsEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Enable use of tiles, allowing horizontal as well as vertical subdivision of the encoded pictures.
    */
  object H265TilesEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
    */
  object H265UnregisteredSeiTimecodeEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Use this setting only for outputs encoded with H.265 that are in CMAF or DASH output groups. If you include writeMp4PackagingType in your JSON job specification for other outputs, your video might not work properly with downstream systems and video players. If the location of parameter set NAL units don't matter in your workflow, ignore this setting. The service defaults to marking your output as HEV1. Choose HVC1 to mark your output as HVC1. This makes your output compliant with this specification: ISO IECJTC1 SC29 N13798 Text ISO/IEC FDIS 14496-15 3rd Edition. For these outputs, the service stores parameter set NAL units in the sample headers but not in the samples directly. Keep the default HEV1 to mark your output as HEV1. For these outputs, the service writes parameter set NAL units directly into the samples.
    */
  object H265WriteMp4PackagingTypeEnum {
    val HVC1 = "HVC1"
    val HEV1 = "HEV1"

    val values = js.Object.freeze(js.Array(HVC1, HEV1))
  }

  /**
    * Use these settings to specify static color calibration metadata, as defined by SMPTE ST 2086. These values don't affect the pixel values that are encoded in the video stream. They are intended to help the downstream video player display content in a way that reflects the intentions of the the content creator.
    */
  @js.native
  trait Hdr10Metadata extends js.Object {
    var BluePrimaryX: js.UndefOr[__integerMin0Max50000]
    var BluePrimaryY: js.UndefOr[__integerMin0Max50000]
    var GreenPrimaryX: js.UndefOr[__integerMin0Max50000]
    var GreenPrimaryY: js.UndefOr[__integerMin0Max50000]
    var MaxContentLightLevel: js.UndefOr[__integerMin0Max65535]
    var MaxFrameAverageLightLevel: js.UndefOr[__integerMin0Max65535]
    var MaxLuminance: js.UndefOr[__integerMin0Max2147483647]
    var MinLuminance: js.UndefOr[__integerMin0Max2147483647]
    var RedPrimaryX: js.UndefOr[__integerMin0Max50000]
    var RedPrimaryY: js.UndefOr[__integerMin0Max50000]
    var WhitePointX: js.UndefOr[__integerMin0Max50000]
    var WhitePointY: js.UndefOr[__integerMin0Max50000]
  }

  object Hdr10Metadata {
    @inline
    def apply(
        BluePrimaryX: js.UndefOr[__integerMin0Max50000] = js.undefined,
        BluePrimaryY: js.UndefOr[__integerMin0Max50000] = js.undefined,
        GreenPrimaryX: js.UndefOr[__integerMin0Max50000] = js.undefined,
        GreenPrimaryY: js.UndefOr[__integerMin0Max50000] = js.undefined,
        MaxContentLightLevel: js.UndefOr[__integerMin0Max65535] = js.undefined,
        MaxFrameAverageLightLevel: js.UndefOr[__integerMin0Max65535] = js.undefined,
        MaxLuminance: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        MinLuminance: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        RedPrimaryX: js.UndefOr[__integerMin0Max50000] = js.undefined,
        RedPrimaryY: js.UndefOr[__integerMin0Max50000] = js.undefined,
        WhitePointX: js.UndefOr[__integerMin0Max50000] = js.undefined,
        WhitePointY: js.UndefOr[__integerMin0Max50000] = js.undefined
    ): Hdr10Metadata = {
      val __obj = js.Dynamic.literal()
      BluePrimaryX.foreach(__v => __obj.updateDynamic("BluePrimaryX")(__v.asInstanceOf[js.Any]))
      BluePrimaryY.foreach(__v => __obj.updateDynamic("BluePrimaryY")(__v.asInstanceOf[js.Any]))
      GreenPrimaryX.foreach(__v => __obj.updateDynamic("GreenPrimaryX")(__v.asInstanceOf[js.Any]))
      GreenPrimaryY.foreach(__v => __obj.updateDynamic("GreenPrimaryY")(__v.asInstanceOf[js.Any]))
      MaxContentLightLevel.foreach(__v => __obj.updateDynamic("MaxContentLightLevel")(__v.asInstanceOf[js.Any]))
      MaxFrameAverageLightLevel.foreach(
        __v => __obj.updateDynamic("MaxFrameAverageLightLevel")(__v.asInstanceOf[js.Any])
      )
      MaxLuminance.foreach(__v => __obj.updateDynamic("MaxLuminance")(__v.asInstanceOf[js.Any]))
      MinLuminance.foreach(__v => __obj.updateDynamic("MinLuminance")(__v.asInstanceOf[js.Any]))
      RedPrimaryX.foreach(__v => __obj.updateDynamic("RedPrimaryX")(__v.asInstanceOf[js.Any]))
      RedPrimaryY.foreach(__v => __obj.updateDynamic("RedPrimaryY")(__v.asInstanceOf[js.Any]))
      WhitePointX.foreach(__v => __obj.updateDynamic("WhitePointX")(__v.asInstanceOf[js.Any]))
      WhitePointY.foreach(__v => __obj.updateDynamic("WhitePointY")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Hdr10Metadata]
    }
  }

  object HlsAdMarkersEnum {
    val ELEMENTAL        = "ELEMENTAL"
    val ELEMENTAL_SCTE35 = "ELEMENTAL_SCTE35"

    val values = js.Object.freeze(js.Array(ELEMENTAL, ELEMENTAL_SCTE35))
  }

  /**
    * Use this setting only in audio-only outputs. Choose MPEG-2 Transport Stream (M2TS) to create a file in an MPEG2-TS container. Keep the default value Automatic (AUTOMATIC) to create a raw audio-only file with no container. Regardless of the value that you specify here, if this output has video, the service will place outputs into an MPEG2-TS container.
    */
  object HlsAudioOnlyContainerEnum {
    val AUTOMATIC = "AUTOMATIC"
    val M2TS      = "M2TS"

    val values = js.Object.freeze(js.Array(AUTOMATIC, M2TS))
  }

  /**
    * Four types of audio-only tracks are supported: Audio-Only Variant Stream The client can play back this audio-only stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest. Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not Auto Select Alternate rendition that the client will not try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
    */
  object HlsAudioTrackTypeEnum {
    val ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT = "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT"
    val ALTERNATE_AUDIO_AUTO_SELECT         = "ALTERNATE_AUDIO_AUTO_SELECT"
    val ALTERNATE_AUDIO_NOT_AUTO_SELECT     = "ALTERNATE_AUDIO_NOT_AUTO_SELECT"
    val AUDIO_ONLY_VARIANT_STREAM           = "AUDIO_ONLY_VARIANT_STREAM"

    val values = js.Object.freeze(
      js.Array(
        ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT,
        ALTERNATE_AUDIO_AUTO_SELECT,
        ALTERNATE_AUDIO_NOT_AUTO_SELECT,
        AUDIO_ONLY_VARIANT_STREAM
      )
    )
  }

  /**
    * Caption Language Mapping
    */
  @js.native
  trait HlsCaptionLanguageMapping extends js.Object {
    var CaptionChannel: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LanguageDescription: js.UndefOr[__string]
  }

  object HlsCaptionLanguageMapping {
    @inline
    def apply(
        CaptionChannel: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LanguageDescription: js.UndefOr[__string] = js.undefined
    ): HlsCaptionLanguageMapping = {
      val __obj = js.Dynamic.literal()
      CaptionChannel.foreach(__v => __obj.updateDynamic("CaptionChannel")(__v.asInstanceOf[js.Any]))
      CustomLanguageCode.foreach(__v => __obj.updateDynamic("CustomLanguageCode")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LanguageDescription.foreach(__v => __obj.updateDynamic("LanguageDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsCaptionLanguageMapping]
    }
  }

  /**
    * Applies only to 608 Embedded output captions. Insert: Include CLOSED-CAPTIONS lines in the manifest. Specify at least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each Language Code you specify. Make sure to specify the languages in the order in which they appear in the original source (if the source is embedded format) or the order of the caption selectors (if the source is other than embedded). Otherwise, languages in the manifest will not match up properly with the output captions. None: Include CLOSED-CAPTIONS=NONE line in the manifest. Omit: Omit any CLOSED-CAPTIONS line from the manifest.
    */
  object HlsCaptionLanguageSettingEnum {
    val INSERT = "INSERT"
    val OMIT   = "OMIT"
    val NONE   = "NONE"

    val values = js.Object.freeze(js.Array(INSERT, OMIT, NONE))
  }

  /**
    * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for later replay.
    */
  object HlsClientCacheEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
    */
  object HlsCodecSpecificationEnum {
    val RFC_6381 = "RFC_6381"
    val RFC_4281 = "RFC_4281"

    val values = js.Object.freeze(js.Array(RFC_6381, RFC_4281))
  }

  /**
    * Indicates whether segments should be placed in subdirectories.
    */
  object HlsDirectoryStructureEnum {
    val SINGLE_DIRECTORY        = "SINGLE_DIRECTORY"
    val SUBDIRECTORY_PER_STREAM = "SUBDIRECTORY_PER_STREAM"

    val values = js.Object.freeze(js.Array(SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM))
  }

  /**
    * Settings for HLS encryption
    */
  @js.native
  trait HlsEncryptionSettings extends js.Object {
    var ConstantInitializationVector: js.UndefOr[__stringMin32Max32Pattern09aFAF32]
    var EncryptionMethod: js.UndefOr[HlsEncryptionType]
    var InitializationVectorInManifest: js.UndefOr[HlsInitializationVectorInManifest]
    var OfflineEncrypted: js.UndefOr[HlsOfflineEncrypted]
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProvider]
    var StaticKeyProvider: js.UndefOr[StaticKeyProvider]
    var Type: js.UndefOr[HlsKeyProviderType]
  }

  object HlsEncryptionSettings {
    @inline
    def apply(
        ConstantInitializationVector: js.UndefOr[__stringMin32Max32Pattern09aFAF32] = js.undefined,
        EncryptionMethod: js.UndefOr[HlsEncryptionType] = js.undefined,
        InitializationVectorInManifest: js.UndefOr[HlsInitializationVectorInManifest] = js.undefined,
        OfflineEncrypted: js.UndefOr[HlsOfflineEncrypted] = js.undefined,
        SpekeKeyProvider: js.UndefOr[SpekeKeyProvider] = js.undefined,
        StaticKeyProvider: js.UndefOr[StaticKeyProvider] = js.undefined,
        Type: js.UndefOr[HlsKeyProviderType] = js.undefined
    ): HlsEncryptionSettings = {
      val __obj = js.Dynamic.literal()
      ConstantInitializationVector.foreach(
        __v => __obj.updateDynamic("ConstantInitializationVector")(__v.asInstanceOf[js.Any])
      )
      EncryptionMethod.foreach(__v => __obj.updateDynamic("EncryptionMethod")(__v.asInstanceOf[js.Any]))
      InitializationVectorInManifest.foreach(
        __v => __obj.updateDynamic("InitializationVectorInManifest")(__v.asInstanceOf[js.Any])
      )
      OfflineEncrypted.foreach(__v => __obj.updateDynamic("OfflineEncrypted")(__v.asInstanceOf[js.Any]))
      SpekeKeyProvider.foreach(__v => __obj.updateDynamic("SpekeKeyProvider")(__v.asInstanceOf[js.Any]))
      StaticKeyProvider.foreach(__v => __obj.updateDynamic("StaticKeyProvider")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsEncryptionSettings]
    }
  }

  /**
    * Encrypts the segments with the given encryption scheme. Leave blank to disable. Selecting 'Disabled' in the web interface also disables encryption.
    */
  object HlsEncryptionTypeEnum {
    val AES128     = "AES128"
    val SAMPLE_AES = "SAMPLE_AES"

    val values = js.Object.freeze(js.Array(AES128, SAMPLE_AES))
  }

  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to HLS_GROUP_SETTINGS.
    */
  @js.native
  trait HlsGroupSettings extends js.Object {
    var AdMarkers: js.UndefOr[__listOfHlsAdMarkers]
    var BaseUrl: js.UndefOr[__string]
    var CaptionLanguageMappings: js.UndefOr[__listOfHlsCaptionLanguageMapping]
    var CaptionLanguageSetting: js.UndefOr[HlsCaptionLanguageSetting]
    var ClientCache: js.UndefOr[HlsClientCache]
    var CodecSpecification: js.UndefOr[HlsCodecSpecification]
    var Destination: js.UndefOr[__stringPatternS3]
    var DestinationSettings: js.UndefOr[DestinationSettings]
    var DirectoryStructure: js.UndefOr[HlsDirectoryStructure]
    var Encryption: js.UndefOr[HlsEncryptionSettings]
    var ManifestCompression: js.UndefOr[HlsManifestCompression]
    var ManifestDurationFormat: js.UndefOr[HlsManifestDurationFormat]
    var MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647]
    var MinSegmentLength: js.UndefOr[__integerMin0Max2147483647]
    var OutputSelection: js.UndefOr[HlsOutputSelection]
    var ProgramDateTime: js.UndefOr[HlsProgramDateTime]
    var ProgramDateTimePeriod: js.UndefOr[__integerMin0Max3600]
    var SegmentControl: js.UndefOr[HlsSegmentControl]
    var SegmentLength: js.UndefOr[__integerMin1Max2147483647]
    var SegmentsPerSubdirectory: js.UndefOr[__integerMin1Max2147483647]
    var StreamInfResolution: js.UndefOr[HlsStreamInfResolution]
    var TimedMetadataId3Frame: js.UndefOr[HlsTimedMetadataId3Frame]
    var TimedMetadataId3Period: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var TimestampDeltaMilliseconds: js.UndefOr[__integerMinNegative2147483648Max2147483647]
  }

  object HlsGroupSettings {
    @inline
    def apply(
        AdMarkers: js.UndefOr[__listOfHlsAdMarkers] = js.undefined,
        BaseUrl: js.UndefOr[__string] = js.undefined,
        CaptionLanguageMappings: js.UndefOr[__listOfHlsCaptionLanguageMapping] = js.undefined,
        CaptionLanguageSetting: js.UndefOr[HlsCaptionLanguageSetting] = js.undefined,
        ClientCache: js.UndefOr[HlsClientCache] = js.undefined,
        CodecSpecification: js.UndefOr[HlsCodecSpecification] = js.undefined,
        Destination: js.UndefOr[__stringPatternS3] = js.undefined,
        DestinationSettings: js.UndefOr[DestinationSettings] = js.undefined,
        DirectoryStructure: js.UndefOr[HlsDirectoryStructure] = js.undefined,
        Encryption: js.UndefOr[HlsEncryptionSettings] = js.undefined,
        ManifestCompression: js.UndefOr[HlsManifestCompression] = js.undefined,
        ManifestDurationFormat: js.UndefOr[HlsManifestDurationFormat] = js.undefined,
        MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647] = js.undefined,
        MinSegmentLength: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        OutputSelection: js.UndefOr[HlsOutputSelection] = js.undefined,
        ProgramDateTime: js.UndefOr[HlsProgramDateTime] = js.undefined,
        ProgramDateTimePeriod: js.UndefOr[__integerMin0Max3600] = js.undefined,
        SegmentControl: js.UndefOr[HlsSegmentControl] = js.undefined,
        SegmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        SegmentsPerSubdirectory: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        StreamInfResolution: js.UndefOr[HlsStreamInfResolution] = js.undefined,
        TimedMetadataId3Frame: js.UndefOr[HlsTimedMetadataId3Frame] = js.undefined,
        TimedMetadataId3Period: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        TimestampDeltaMilliseconds: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
    ): HlsGroupSettings = {
      val __obj = js.Dynamic.literal()
      AdMarkers.foreach(__v => __obj.updateDynamic("AdMarkers")(__v.asInstanceOf[js.Any]))
      BaseUrl.foreach(__v => __obj.updateDynamic("BaseUrl")(__v.asInstanceOf[js.Any]))
      CaptionLanguageMappings.foreach(__v => __obj.updateDynamic("CaptionLanguageMappings")(__v.asInstanceOf[js.Any]))
      CaptionLanguageSetting.foreach(__v => __obj.updateDynamic("CaptionLanguageSetting")(__v.asInstanceOf[js.Any]))
      ClientCache.foreach(__v => __obj.updateDynamic("ClientCache")(__v.asInstanceOf[js.Any]))
      CodecSpecification.foreach(__v => __obj.updateDynamic("CodecSpecification")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      DestinationSettings.foreach(__v => __obj.updateDynamic("DestinationSettings")(__v.asInstanceOf[js.Any]))
      DirectoryStructure.foreach(__v => __obj.updateDynamic("DirectoryStructure")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      ManifestCompression.foreach(__v => __obj.updateDynamic("ManifestCompression")(__v.asInstanceOf[js.Any]))
      ManifestDurationFormat.foreach(__v => __obj.updateDynamic("ManifestDurationFormat")(__v.asInstanceOf[js.Any]))
      MinFinalSegmentLength.foreach(__v => __obj.updateDynamic("MinFinalSegmentLength")(__v.asInstanceOf[js.Any]))
      MinSegmentLength.foreach(__v => __obj.updateDynamic("MinSegmentLength")(__v.asInstanceOf[js.Any]))
      OutputSelection.foreach(__v => __obj.updateDynamic("OutputSelection")(__v.asInstanceOf[js.Any]))
      ProgramDateTime.foreach(__v => __obj.updateDynamic("ProgramDateTime")(__v.asInstanceOf[js.Any]))
      ProgramDateTimePeriod.foreach(__v => __obj.updateDynamic("ProgramDateTimePeriod")(__v.asInstanceOf[js.Any]))
      SegmentControl.foreach(__v => __obj.updateDynamic("SegmentControl")(__v.asInstanceOf[js.Any]))
      SegmentLength.foreach(__v => __obj.updateDynamic("SegmentLength")(__v.asInstanceOf[js.Any]))
      SegmentsPerSubdirectory.foreach(__v => __obj.updateDynamic("SegmentsPerSubdirectory")(__v.asInstanceOf[js.Any]))
      StreamInfResolution.foreach(__v => __obj.updateDynamic("StreamInfResolution")(__v.asInstanceOf[js.Any]))
      TimedMetadataId3Frame.foreach(__v => __obj.updateDynamic("TimedMetadataId3Frame")(__v.asInstanceOf[js.Any]))
      TimedMetadataId3Period.foreach(__v => __obj.updateDynamic("TimedMetadataId3Period")(__v.asInstanceOf[js.Any]))
      TimestampDeltaMilliseconds.foreach(
        __v => __obj.updateDynamic("TimestampDeltaMilliseconds")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[HlsGroupSettings]
    }
  }

  /**
    * When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS manifest
    */
  object HlsIFrameOnlyManifestEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * The Initialization Vector is a 128-bit number used in conjunction with the key for encrypting blocks. If set to INCLUDE, Initialization Vector is listed in the manifest. Otherwise Initialization Vector is not in the manifest.
    */
  object HlsInitializationVectorInManifestEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
    */
  object HlsKeyProviderTypeEnum {
    val SPEKE      = "SPEKE"
    val STATIC_KEY = "STATIC_KEY"

    val values = js.Object.freeze(js.Array(SPEKE, STATIC_KEY))
  }

  /**
    * When set to GZIP, compresses HLS playlist.
    */
  object HlsManifestCompressionEnum {
    val GZIP = "GZIP"
    val NONE = "NONE"

    val values = js.Object.freeze(js.Array(GZIP, NONE))
  }

  /**
    * Indicates whether the output manifest should use floating point values for segment duration.
    */
  object HlsManifestDurationFormatEnum {
    val FLOATING_POINT = "FLOATING_POINT"
    val INTEGER        = "INTEGER"

    val values = js.Object.freeze(js.Array(FLOATING_POINT, INTEGER))
  }

  /**
    * Enable this setting to insert the EXT-X-SESSION-KEY element into the master playlist. This allows for offline Apple HLS FairPlay content protection.
    */
  object HlsOfflineEncryptedEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Indicates whether the .m3u8 manifest file should be generated for this HLS output group.
    */
  object HlsOutputSelectionEnum {
    val MANIFESTS_AND_SEGMENTS = "MANIFESTS_AND_SEGMENTS"
    val SEGMENTS_ONLY          = "SEGMENTS_ONLY"

    val values = js.Object.freeze(js.Array(MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY))
  }

  /**
    * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as follows: either the program date and time are initialized using the input timecode source, or the time is initialized using the input timecode source and the date is initialized using the timestamp_offset.
    */
  object HlsProgramDateTimeEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * When set to SINGLE_FILE, emits program as a single media resource (.ts) file, uses #EXT-X-BYTERANGE tags to index segment for playback.
    */
  object HlsSegmentControlEnum {
    val SINGLE_FILE     = "SINGLE_FILE"
    val SEGMENTED_FILES = "SEGMENTED_FILES"

    val values = js.Object.freeze(js.Array(SINGLE_FILE, SEGMENTED_FILES))
  }

  /**
    * Settings for HLS output groups
    */
  @js.native
  trait HlsSettings extends js.Object {
    var AudioGroupId: js.UndefOr[__string]
    var AudioOnlyContainer: js.UndefOr[HlsAudioOnlyContainer]
    var AudioRenditionSets: js.UndefOr[__string]
    var AudioTrackType: js.UndefOr[HlsAudioTrackType]
    var IFrameOnlyManifest: js.UndefOr[HlsIFrameOnlyManifest]
    var SegmentModifier: js.UndefOr[__string]
  }

  object HlsSettings {
    @inline
    def apply(
        AudioGroupId: js.UndefOr[__string] = js.undefined,
        AudioOnlyContainer: js.UndefOr[HlsAudioOnlyContainer] = js.undefined,
        AudioRenditionSets: js.UndefOr[__string] = js.undefined,
        AudioTrackType: js.UndefOr[HlsAudioTrackType] = js.undefined,
        IFrameOnlyManifest: js.UndefOr[HlsIFrameOnlyManifest] = js.undefined,
        SegmentModifier: js.UndefOr[__string] = js.undefined
    ): HlsSettings = {
      val __obj = js.Dynamic.literal()
      AudioGroupId.foreach(__v => __obj.updateDynamic("AudioGroupId")(__v.asInstanceOf[js.Any]))
      AudioOnlyContainer.foreach(__v => __obj.updateDynamic("AudioOnlyContainer")(__v.asInstanceOf[js.Any]))
      AudioRenditionSets.foreach(__v => __obj.updateDynamic("AudioRenditionSets")(__v.asInstanceOf[js.Any]))
      AudioTrackType.foreach(__v => __obj.updateDynamic("AudioTrackType")(__v.asInstanceOf[js.Any]))
      IFrameOnlyManifest.foreach(__v => __obj.updateDynamic("IFrameOnlyManifest")(__v.asInstanceOf[js.Any]))
      SegmentModifier.foreach(__v => __obj.updateDynamic("SegmentModifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsSettings]
    }
  }

  /**
    * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
    */
  object HlsStreamInfResolutionEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * Indicates ID3 frame that has the timecode.
    */
  object HlsTimedMetadataId3FrameEnum {
    val NONE = "NONE"
    val PRIV = "PRIV"
    val TDRL = "TDRL"

    val values = js.Object.freeze(js.Array(NONE, PRIV, TDRL))
  }

  /**
    * To insert ID3 tags in your output, specify two values. Use ID3 tag (Id3) to specify the base 64 encoded string and use Timecode (TimeCode) to specify the time when the tag should be inserted. To insert multiple ID3 tags in your output, create multiple instances of ID3 insertion (Id3Insertion).
    */
  @js.native
  trait Id3Insertion extends js.Object {
    var Id3: js.UndefOr[__stringPatternAZaZ0902]
    var Timecode: js.UndefOr[__stringPattern010920405090509092]
  }

  object Id3Insertion {
    @inline
    def apply(
        Id3: js.UndefOr[__stringPatternAZaZ0902] = js.undefined,
        Timecode: js.UndefOr[__stringPattern010920405090509092] = js.undefined
    ): Id3Insertion = {
      val __obj = js.Dynamic.literal()
      Id3.foreach(__v => __obj.updateDynamic("Id3")(__v.asInstanceOf[js.Any]))
      Timecode.foreach(__v => __obj.updateDynamic("Timecode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Id3Insertion]
    }
  }

  /**
    * Enable the image inserter feature to include a graphic overlay on your video. Enable or disable this feature for each input or output individually. This setting is disabled by default.
    */
  @js.native
  trait ImageInserter extends js.Object {
    var InsertableImages: js.UndefOr[__listOfInsertableImage]
  }

  object ImageInserter {
    @inline
    def apply(
        InsertableImages: js.UndefOr[__listOfInsertableImage] = js.undefined
    ): ImageInserter = {
      val __obj = js.Dynamic.literal()
      InsertableImages.foreach(__v => __obj.updateDynamic("InsertableImages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageInserter]
    }
  }

  /**
    * Specifies media input
    */
  @js.native
  trait Input extends js.Object {
    var AudioSelectorGroups: js.UndefOr[__mapOfAudioSelectorGroup]
    var AudioSelectors: js.UndefOr[__mapOfAudioSelector]
    var CaptionSelectors: js.UndefOr[__mapOfCaptionSelector]
    var Crop: js.UndefOr[Rectangle]
    var DeblockFilter: js.UndefOr[InputDeblockFilter]
    var DecryptionSettings: js.UndefOr[InputDecryptionSettings]
    var DenoiseFilter: js.UndefOr[InputDenoiseFilter]
    var FileInput: js.UndefOr[
      __stringPatternHttpHttpsS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLL
    ]
    var FilterEnable: js.UndefOr[InputFilterEnable]
    var FilterStrength: js.UndefOr[__integerMinNegative5Max5]
    var ImageInserter: js.UndefOr[ImageInserter]
    var InputClippings: js.UndefOr[__listOfInputClipping]
    var Position: js.UndefOr[Rectangle]
    var ProgramNumber: js.UndefOr[__integerMin1Max2147483647]
    var PsiControl: js.UndefOr[InputPsiControl]
    var SupplementalImps: js.UndefOr[__listOf__stringPatternS3ASSETMAPXml]
    var TimecodeSource: js.UndefOr[InputTimecodeSource]
    var VideoSelector: js.UndefOr[VideoSelector]
  }

  object Input {
    @inline
    def apply(
        AudioSelectorGroups: js.UndefOr[__mapOfAudioSelectorGroup] = js.undefined,
        AudioSelectors: js.UndefOr[__mapOfAudioSelector] = js.undefined,
        CaptionSelectors: js.UndefOr[__mapOfCaptionSelector] = js.undefined,
        Crop: js.UndefOr[Rectangle] = js.undefined,
        DeblockFilter: js.UndefOr[InputDeblockFilter] = js.undefined,
        DecryptionSettings: js.UndefOr[InputDecryptionSettings] = js.undefined,
        DenoiseFilter: js.UndefOr[InputDenoiseFilter] = js.undefined,
        FileInput: js.UndefOr[
          __stringPatternHttpHttpsS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLL
        ] = js.undefined,
        FilterEnable: js.UndefOr[InputFilterEnable] = js.undefined,
        FilterStrength: js.UndefOr[__integerMinNegative5Max5] = js.undefined,
        ImageInserter: js.UndefOr[ImageInserter] = js.undefined,
        InputClippings: js.UndefOr[__listOfInputClipping] = js.undefined,
        Position: js.UndefOr[Rectangle] = js.undefined,
        ProgramNumber: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        PsiControl: js.UndefOr[InputPsiControl] = js.undefined,
        SupplementalImps: js.UndefOr[__listOf__stringPatternS3ASSETMAPXml] = js.undefined,
        TimecodeSource: js.UndefOr[InputTimecodeSource] = js.undefined,
        VideoSelector: js.UndefOr[VideoSelector] = js.undefined
    ): Input = {
      val __obj = js.Dynamic.literal()
      AudioSelectorGroups.foreach(__v => __obj.updateDynamic("AudioSelectorGroups")(__v.asInstanceOf[js.Any]))
      AudioSelectors.foreach(__v => __obj.updateDynamic("AudioSelectors")(__v.asInstanceOf[js.Any]))
      CaptionSelectors.foreach(__v => __obj.updateDynamic("CaptionSelectors")(__v.asInstanceOf[js.Any]))
      Crop.foreach(__v => __obj.updateDynamic("Crop")(__v.asInstanceOf[js.Any]))
      DeblockFilter.foreach(__v => __obj.updateDynamic("DeblockFilter")(__v.asInstanceOf[js.Any]))
      DecryptionSettings.foreach(__v => __obj.updateDynamic("DecryptionSettings")(__v.asInstanceOf[js.Any]))
      DenoiseFilter.foreach(__v => __obj.updateDynamic("DenoiseFilter")(__v.asInstanceOf[js.Any]))
      FileInput.foreach(__v => __obj.updateDynamic("FileInput")(__v.asInstanceOf[js.Any]))
      FilterEnable.foreach(__v => __obj.updateDynamic("FilterEnable")(__v.asInstanceOf[js.Any]))
      FilterStrength.foreach(__v => __obj.updateDynamic("FilterStrength")(__v.asInstanceOf[js.Any]))
      ImageInserter.foreach(__v => __obj.updateDynamic("ImageInserter")(__v.asInstanceOf[js.Any]))
      InputClippings.foreach(__v => __obj.updateDynamic("InputClippings")(__v.asInstanceOf[js.Any]))
      Position.foreach(__v => __obj.updateDynamic("Position")(__v.asInstanceOf[js.Any]))
      ProgramNumber.foreach(__v => __obj.updateDynamic("ProgramNumber")(__v.asInstanceOf[js.Any]))
      PsiControl.foreach(__v => __obj.updateDynamic("PsiControl")(__v.asInstanceOf[js.Any]))
      SupplementalImps.foreach(__v => __obj.updateDynamic("SupplementalImps")(__v.asInstanceOf[js.Any]))
      TimecodeSource.foreach(__v => __obj.updateDynamic("TimecodeSource")(__v.asInstanceOf[js.Any]))
      VideoSelector.foreach(__v => __obj.updateDynamic("VideoSelector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Input]
    }
  }

  /**
    * To transcode only portions of your input (clips), include one Input clipping (one instance of InputClipping in the JSON job file) for each input clip. All input clips you specify will be included in every output of the job.
    */
  @js.native
  trait InputClipping extends js.Object {
    var EndTimecode: js.UndefOr[__stringPattern010920405090509092]
    var StartTimecode: js.UndefOr[__stringPattern010920405090509092]
  }

  object InputClipping {
    @inline
    def apply(
        EndTimecode: js.UndefOr[__stringPattern010920405090509092] = js.undefined,
        StartTimecode: js.UndefOr[__stringPattern010920405090509092] = js.undefined
    ): InputClipping = {
      val __obj = js.Dynamic.literal()
      EndTimecode.foreach(__v => __obj.updateDynamic("EndTimecode")(__v.asInstanceOf[js.Any]))
      StartTimecode.foreach(__v => __obj.updateDynamic("StartTimecode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputClipping]
    }
  }

  /**
    * Enable Deblock (InputDeblockFilter) to produce smoother motion in the output. Default is disabled. Only manaully controllable for MPEG2 and uncompressed video inputs.
    */
  object InputDeblockFilterEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Settings for decrypting any input files that you encrypt before you upload them to Amazon S3. MediaConvert can decrypt files only when you use AWS Key Management Service (KMS) to encrypt the data key that you use to encrypt your content.
    */
  @js.native
  trait InputDecryptionSettings extends js.Object {
    var DecryptionMode: js.UndefOr[DecryptionMode]
    var EncryptedDecryptionKey: js.UndefOr[__stringMin24Max512PatternAZaZ0902]
    var InitializationVector: js.UndefOr[__stringMin16Max24PatternAZaZ0922AZaZ0916]
    var KmsKeyRegion: js.UndefOr[__stringMin9Max19PatternAZ26EastWestCentralNorthSouthEastWest1912]
  }

  object InputDecryptionSettings {
    @inline
    def apply(
        DecryptionMode: js.UndefOr[DecryptionMode] = js.undefined,
        EncryptedDecryptionKey: js.UndefOr[__stringMin24Max512PatternAZaZ0902] = js.undefined,
        InitializationVector: js.UndefOr[__stringMin16Max24PatternAZaZ0922AZaZ0916] = js.undefined,
        KmsKeyRegion: js.UndefOr[__stringMin9Max19PatternAZ26EastWestCentralNorthSouthEastWest1912] = js.undefined
    ): InputDecryptionSettings = {
      val __obj = js.Dynamic.literal()
      DecryptionMode.foreach(__v => __obj.updateDynamic("DecryptionMode")(__v.asInstanceOf[js.Any]))
      EncryptedDecryptionKey.foreach(__v => __obj.updateDynamic("EncryptedDecryptionKey")(__v.asInstanceOf[js.Any]))
      InitializationVector.foreach(__v => __obj.updateDynamic("InitializationVector")(__v.asInstanceOf[js.Any]))
      KmsKeyRegion.foreach(__v => __obj.updateDynamic("KmsKeyRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputDecryptionSettings]
    }
  }

  /**
    * Enable Denoise (InputDenoiseFilter) to filter noise from the input.  Default is disabled. Only applicable to MPEG2, H.264, H.265, and uncompressed video inputs.
    */
  object InputDenoiseFilterEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Use Filter enable (InputFilterEnable) to specify how the transcoding service applies the denoise and deblock filters. You must also enable the filters separately, with Denoise (InputDenoiseFilter) and Deblock (InputDeblockFilter). * Auto - The transcoding service determines whether to apply filtering, depending on input type and quality. * Disable - The input is not filtered. This is true even if you use the API to enable them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The in put is filtered regardless of input type.
    */
  object InputFilterEnableEnum {
    val AUTO    = "AUTO"
    val DISABLE = "DISABLE"
    val FORCE   = "FORCE"

    val values = js.Object.freeze(js.Array(AUTO, DISABLE, FORCE))
  }

  /**
    * Set PSI control (InputPsiControl) for transport stream inputs to specify which data the demux process to scans. * Ignore PSI - Scan all PIDs for audio and video. * Use PSI - Scan only PSI data.
    */
  object InputPsiControlEnum {
    val IGNORE_PSI = "IGNORE_PSI"
    val USE_PSI    = "USE_PSI"

    val values = js.Object.freeze(js.Array(IGNORE_PSI, USE_PSI))
  }

  /**
    * Use Rotate (InputRotate) to specify how the service rotates your video. You can choose automatic rotation or specify a rotation. You can specify a clockwise rotation of 0, 90, 180, or 270 degrees. If your input video container is .mov or .mp4 and your input has rotation metadata, you can choose Automatic to have the service rotate your video according to the rotation specified in the metadata. The rotation must be within one degree of 90, 180, or 270 degrees. If the rotation metadata specifies any other rotation, the service will default to no rotation. By default, the service does no rotation, even if your input video has rotation metadata. The service doesn't pass through rotation metadata.
    */
  object InputRotateEnum {
    val DEGREE_0    = "DEGREE_0"
    val DEGREES_90  = "DEGREES_90"
    val DEGREES_180 = "DEGREES_180"
    val DEGREES_270 = "DEGREES_270"
    val AUTO        = "AUTO"

    val values = js.Object.freeze(js.Array(DEGREE_0, DEGREES_90, DEGREES_180, DEGREES_270, AUTO))
  }

  /**
    * Specified video input in a template.
    */
  @js.native
  trait InputTemplate extends js.Object {
    var AudioSelectorGroups: js.UndefOr[__mapOfAudioSelectorGroup]
    var AudioSelectors: js.UndefOr[__mapOfAudioSelector]
    var CaptionSelectors: js.UndefOr[__mapOfCaptionSelector]
    var Crop: js.UndefOr[Rectangle]
    var DeblockFilter: js.UndefOr[InputDeblockFilter]
    var DenoiseFilter: js.UndefOr[InputDenoiseFilter]
    var FilterEnable: js.UndefOr[InputFilterEnable]
    var FilterStrength: js.UndefOr[__integerMinNegative5Max5]
    var ImageInserter: js.UndefOr[ImageInserter]
    var InputClippings: js.UndefOr[__listOfInputClipping]
    var Position: js.UndefOr[Rectangle]
    var ProgramNumber: js.UndefOr[__integerMin1Max2147483647]
    var PsiControl: js.UndefOr[InputPsiControl]
    var TimecodeSource: js.UndefOr[InputTimecodeSource]
    var VideoSelector: js.UndefOr[VideoSelector]
  }

  object InputTemplate {
    @inline
    def apply(
        AudioSelectorGroups: js.UndefOr[__mapOfAudioSelectorGroup] = js.undefined,
        AudioSelectors: js.UndefOr[__mapOfAudioSelector] = js.undefined,
        CaptionSelectors: js.UndefOr[__mapOfCaptionSelector] = js.undefined,
        Crop: js.UndefOr[Rectangle] = js.undefined,
        DeblockFilter: js.UndefOr[InputDeblockFilter] = js.undefined,
        DenoiseFilter: js.UndefOr[InputDenoiseFilter] = js.undefined,
        FilterEnable: js.UndefOr[InputFilterEnable] = js.undefined,
        FilterStrength: js.UndefOr[__integerMinNegative5Max5] = js.undefined,
        ImageInserter: js.UndefOr[ImageInserter] = js.undefined,
        InputClippings: js.UndefOr[__listOfInputClipping] = js.undefined,
        Position: js.UndefOr[Rectangle] = js.undefined,
        ProgramNumber: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        PsiControl: js.UndefOr[InputPsiControl] = js.undefined,
        TimecodeSource: js.UndefOr[InputTimecodeSource] = js.undefined,
        VideoSelector: js.UndefOr[VideoSelector] = js.undefined
    ): InputTemplate = {
      val __obj = js.Dynamic.literal()
      AudioSelectorGroups.foreach(__v => __obj.updateDynamic("AudioSelectorGroups")(__v.asInstanceOf[js.Any]))
      AudioSelectors.foreach(__v => __obj.updateDynamic("AudioSelectors")(__v.asInstanceOf[js.Any]))
      CaptionSelectors.foreach(__v => __obj.updateDynamic("CaptionSelectors")(__v.asInstanceOf[js.Any]))
      Crop.foreach(__v => __obj.updateDynamic("Crop")(__v.asInstanceOf[js.Any]))
      DeblockFilter.foreach(__v => __obj.updateDynamic("DeblockFilter")(__v.asInstanceOf[js.Any]))
      DenoiseFilter.foreach(__v => __obj.updateDynamic("DenoiseFilter")(__v.asInstanceOf[js.Any]))
      FilterEnable.foreach(__v => __obj.updateDynamic("FilterEnable")(__v.asInstanceOf[js.Any]))
      FilterStrength.foreach(__v => __obj.updateDynamic("FilterStrength")(__v.asInstanceOf[js.Any]))
      ImageInserter.foreach(__v => __obj.updateDynamic("ImageInserter")(__v.asInstanceOf[js.Any]))
      InputClippings.foreach(__v => __obj.updateDynamic("InputClippings")(__v.asInstanceOf[js.Any]))
      Position.foreach(__v => __obj.updateDynamic("Position")(__v.asInstanceOf[js.Any]))
      ProgramNumber.foreach(__v => __obj.updateDynamic("ProgramNumber")(__v.asInstanceOf[js.Any]))
      PsiControl.foreach(__v => __obj.updateDynamic("PsiControl")(__v.asInstanceOf[js.Any]))
      TimecodeSource.foreach(__v => __obj.updateDynamic("TimecodeSource")(__v.asInstanceOf[js.Any]))
      VideoSelector.foreach(__v => __obj.updateDynamic("VideoSelector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputTemplate]
    }
  }

  /**
    * Timecode source under input settings (InputTimecodeSource) only affects the behavior of features that apply to a single input at a time, such as input clipping and synchronizing some captions formats. Use this setting to specify whether the service counts frames by timecodes embedded in the video (EMBEDDED) or by starting the first frame at zero (ZEROBASED). In both cases, the timecode format is HH:MM:SS:FF or HH:MM:SS;FF, where FF is the frame number. Only set this to EMBEDDED if your source video has embedded timecodes.
    */
  object InputTimecodeSourceEnum {
    val EMBEDDED       = "EMBEDDED"
    val ZEROBASED      = "ZEROBASED"
    val SPECIFIEDSTART = "SPECIFIEDSTART"

    val values = js.Object.freeze(js.Array(EMBEDDED, ZEROBASED, SPECIFIEDSTART))
  }

  /**
    * Settings that specify how your still graphic overlay appears.
    */
  @js.native
  trait InsertableImage extends js.Object {
    var Duration: js.UndefOr[__integerMin0Max2147483647]
    var FadeIn: js.UndefOr[__integerMin0Max2147483647]
    var FadeOut: js.UndefOr[__integerMin0Max2147483647]
    var Height: js.UndefOr[__integerMin0Max2147483647]
    var ImageInserterInput: js.UndefOr[__stringMin14PatternS3BmpBMPPngPNGTgaTGA]
    var ImageX: js.UndefOr[__integerMin0Max2147483647]
    var ImageY: js.UndefOr[__integerMin0Max2147483647]
    var Layer: js.UndefOr[__integerMin0Max99]
    var Opacity: js.UndefOr[__integerMin0Max100]
    var StartTime: js.UndefOr[__stringPattern01D20305D205D]
    var Width: js.UndefOr[__integerMin0Max2147483647]
  }

  object InsertableImage {
    @inline
    def apply(
        Duration: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        FadeIn: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        FadeOut: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        Height: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        ImageInserterInput: js.UndefOr[__stringMin14PatternS3BmpBMPPngPNGTgaTGA] = js.undefined,
        ImageX: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        ImageY: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        Layer: js.UndefOr[__integerMin0Max99] = js.undefined,
        Opacity: js.UndefOr[__integerMin0Max100] = js.undefined,
        StartTime: js.UndefOr[__stringPattern01D20305D205D] = js.undefined,
        Width: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    ): InsertableImage = {
      val __obj = js.Dynamic.literal()
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      FadeIn.foreach(__v => __obj.updateDynamic("FadeIn")(__v.asInstanceOf[js.Any]))
      FadeOut.foreach(__v => __obj.updateDynamic("FadeOut")(__v.asInstanceOf[js.Any]))
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      ImageInserterInput.foreach(__v => __obj.updateDynamic("ImageInserterInput")(__v.asInstanceOf[js.Any]))
      ImageX.foreach(__v => __obj.updateDynamic("ImageX")(__v.asInstanceOf[js.Any]))
      ImageY.foreach(__v => __obj.updateDynamic("ImageY")(__v.asInstanceOf[js.Any]))
      Layer.foreach(__v => __obj.updateDynamic("Layer")(__v.asInstanceOf[js.Any]))
      Opacity.foreach(__v => __obj.updateDynamic("Opacity")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InsertableImage]
    }
  }

  /**
    * Each job converts an input file into an output file or files. For more information, see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  @js.native
  trait Job extends js.Object {
    var Role: __string
    var Settings: JobSettings
    var AccelerationSettings: js.UndefOr[AccelerationSettings]
    var Arn: js.UndefOr[__string]
    var BillingTagsSource: js.UndefOr[BillingTagsSource]
    var CreatedAt: js.UndefOr[__timestampUnix]
    var CurrentPhase: js.UndefOr[JobPhase]
    var ErrorCode: js.UndefOr[__integer]
    var ErrorMessage: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var JobPercentComplete: js.UndefOr[__integer]
    var JobTemplate: js.UndefOr[__string]
    var OutputGroupDetails: js.UndefOr[__listOfOutputGroupDetail]
    var Priority: js.UndefOr[__integerMinNegative50Max50]
    var Queue: js.UndefOr[__string]
    var RetryCount: js.UndefOr[__integer]
    var SimulateReservedQueue: js.UndefOr[SimulateReservedQueue]
    var Status: js.UndefOr[JobStatus]
    var StatusUpdateInterval: js.UndefOr[StatusUpdateInterval]
    var Timing: js.UndefOr[Timing]
    var UserMetadata: js.UndefOr[__mapOf__string]
  }

  object Job {
    @inline
    def apply(
        Role: __string,
        Settings: JobSettings,
        AccelerationSettings: js.UndefOr[AccelerationSettings] = js.undefined,
        Arn: js.UndefOr[__string] = js.undefined,
        BillingTagsSource: js.UndefOr[BillingTagsSource] = js.undefined,
        CreatedAt: js.UndefOr[__timestampUnix] = js.undefined,
        CurrentPhase: js.UndefOr[JobPhase] = js.undefined,
        ErrorCode: js.UndefOr[__integer] = js.undefined,
        ErrorMessage: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        JobPercentComplete: js.UndefOr[__integer] = js.undefined,
        JobTemplate: js.UndefOr[__string] = js.undefined,
        OutputGroupDetails: js.UndefOr[__listOfOutputGroupDetail] = js.undefined,
        Priority: js.UndefOr[__integerMinNegative50Max50] = js.undefined,
        Queue: js.UndefOr[__string] = js.undefined,
        RetryCount: js.UndefOr[__integer] = js.undefined,
        SimulateReservedQueue: js.UndefOr[SimulateReservedQueue] = js.undefined,
        Status: js.UndefOr[JobStatus] = js.undefined,
        StatusUpdateInterval: js.UndefOr[StatusUpdateInterval] = js.undefined,
        Timing: js.UndefOr[Timing] = js.undefined,
        UserMetadata: js.UndefOr[__mapOf__string] = js.undefined
    ): Job = {
      val __obj = js.Dynamic.literal(
        "Role"     -> Role.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any]
      )

      AccelerationSettings.foreach(__v => __obj.updateDynamic("AccelerationSettings")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      BillingTagsSource.foreach(__v => __obj.updateDynamic("BillingTagsSource")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      CurrentPhase.foreach(__v => __obj.updateDynamic("CurrentPhase")(__v.asInstanceOf[js.Any]))
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      JobPercentComplete.foreach(__v => __obj.updateDynamic("JobPercentComplete")(__v.asInstanceOf[js.Any]))
      JobTemplate.foreach(__v => __obj.updateDynamic("JobTemplate")(__v.asInstanceOf[js.Any]))
      OutputGroupDetails.foreach(__v => __obj.updateDynamic("OutputGroupDetails")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      RetryCount.foreach(__v => __obj.updateDynamic("RetryCount")(__v.asInstanceOf[js.Any]))
      SimulateReservedQueue.foreach(__v => __obj.updateDynamic("SimulateReservedQueue")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusUpdateInterval.foreach(__v => __obj.updateDynamic("StatusUpdateInterval")(__v.asInstanceOf[js.Any]))
      Timing.foreach(__v => __obj.updateDynamic("Timing")(__v.asInstanceOf[js.Any]))
      UserMetadata.foreach(__v => __obj.updateDynamic("UserMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Job]
    }
  }

  /**
    * A job's phase can be PROBING, TRANSCODING OR UPLOADING
    */
  object JobPhaseEnum {
    val PROBING     = "PROBING"
    val TRANSCODING = "TRANSCODING"
    val UPLOADING   = "UPLOADING"

    val values = js.Object.freeze(js.Array(PROBING, TRANSCODING, UPLOADING))
  }

  /**
    * JobSettings contains all the transcode settings for a job.
    */
  @js.native
  trait JobSettings extends js.Object {
    var AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000]
    var AvailBlanking: js.UndefOr[AvailBlanking]
    var Esam: js.UndefOr[EsamSettings]
    var Inputs: js.UndefOr[__listOfInput]
    var MotionImageInserter: js.UndefOr[MotionImageInserter]
    var NielsenConfiguration: js.UndefOr[NielsenConfiguration]
    var OutputGroups: js.UndefOr[__listOfOutputGroup]
    var TimecodeConfig: js.UndefOr[TimecodeConfig]
    var TimedMetadataInsertion: js.UndefOr[TimedMetadataInsertion]
  }

  object JobSettings {
    @inline
    def apply(
        AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000] = js.undefined,
        AvailBlanking: js.UndefOr[AvailBlanking] = js.undefined,
        Esam: js.UndefOr[EsamSettings] = js.undefined,
        Inputs: js.UndefOr[__listOfInput] = js.undefined,
        MotionImageInserter: js.UndefOr[MotionImageInserter] = js.undefined,
        NielsenConfiguration: js.UndefOr[NielsenConfiguration] = js.undefined,
        OutputGroups: js.UndefOr[__listOfOutputGroup] = js.undefined,
        TimecodeConfig: js.UndefOr[TimecodeConfig] = js.undefined,
        TimedMetadataInsertion: js.UndefOr[TimedMetadataInsertion] = js.undefined
    ): JobSettings = {
      val __obj = js.Dynamic.literal()
      AdAvailOffset.foreach(__v => __obj.updateDynamic("AdAvailOffset")(__v.asInstanceOf[js.Any]))
      AvailBlanking.foreach(__v => __obj.updateDynamic("AvailBlanking")(__v.asInstanceOf[js.Any]))
      Esam.foreach(__v => __obj.updateDynamic("Esam")(__v.asInstanceOf[js.Any]))
      Inputs.foreach(__v => __obj.updateDynamic("Inputs")(__v.asInstanceOf[js.Any]))
      MotionImageInserter.foreach(__v => __obj.updateDynamic("MotionImageInserter")(__v.asInstanceOf[js.Any]))
      NielsenConfiguration.foreach(__v => __obj.updateDynamic("NielsenConfiguration")(__v.asInstanceOf[js.Any]))
      OutputGroups.foreach(__v => __obj.updateDynamic("OutputGroups")(__v.asInstanceOf[js.Any]))
      TimecodeConfig.foreach(__v => __obj.updateDynamic("TimecodeConfig")(__v.asInstanceOf[js.Any]))
      TimedMetadataInsertion.foreach(__v => __obj.updateDynamic("TimedMetadataInsertion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobSettings]
    }
  }

  /**
    * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
    */
  object JobStatusEnum {
    val SUBMITTED   = "SUBMITTED"
    val PROGRESSING = "PROGRESSING"
    val COMPLETE    = "COMPLETE"
    val CANCELED    = "CANCELED"
    val ERROR       = "ERROR"

    val values = js.Object.freeze(js.Array(SUBMITTED, PROGRESSING, COMPLETE, CANCELED, ERROR))
  }

  /**
    * A job template is a pre-made set of encoding instructions that you can use to quickly create a job.
    */
  @js.native
  trait JobTemplate extends js.Object {
    var Name: __string
    var Settings: JobTemplateSettings
    var AccelerationSettings: js.UndefOr[AccelerationSettings]
    var Arn: js.UndefOr[__string]
    var Category: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__timestampUnix]
    var Description: js.UndefOr[__string]
    var LastUpdated: js.UndefOr[__timestampUnix]
    var Priority: js.UndefOr[__integerMinNegative50Max50]
    var Queue: js.UndefOr[__string]
    var StatusUpdateInterval: js.UndefOr[StatusUpdateInterval]
    var Type: js.UndefOr[Type]
  }

  object JobTemplate {
    @inline
    def apply(
        Name: __string,
        Settings: JobTemplateSettings,
        AccelerationSettings: js.UndefOr[AccelerationSettings] = js.undefined,
        Arn: js.UndefOr[__string] = js.undefined,
        Category: js.UndefOr[__string] = js.undefined,
        CreatedAt: js.UndefOr[__timestampUnix] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        LastUpdated: js.UndefOr[__timestampUnix] = js.undefined,
        Priority: js.UndefOr[__integerMinNegative50Max50] = js.undefined,
        Queue: js.UndefOr[__string] = js.undefined,
        StatusUpdateInterval: js.UndefOr[StatusUpdateInterval] = js.undefined,
        Type: js.UndefOr[Type] = js.undefined
    ): JobTemplate = {
      val __obj = js.Dynamic.literal(
        "Name"     -> Name.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any]
      )

      AccelerationSettings.foreach(__v => __obj.updateDynamic("AccelerationSettings")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      StatusUpdateInterval.foreach(__v => __obj.updateDynamic("StatusUpdateInterval")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobTemplate]
    }
  }

  /**
    * Optional. When you request a list of job templates, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
    */
  object JobTemplateListByEnum {
    val NAME          = "NAME"
    val CREATION_DATE = "CREATION_DATE"
    val SYSTEM        = "SYSTEM"

    val values = js.Object.freeze(js.Array(NAME, CREATION_DATE, SYSTEM))
  }

  /**
    * JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs created from it.
    */
  @js.native
  trait JobTemplateSettings extends js.Object {
    var AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000]
    var AvailBlanking: js.UndefOr[AvailBlanking]
    var Esam: js.UndefOr[EsamSettings]
    var Inputs: js.UndefOr[__listOfInputTemplate]
    var MotionImageInserter: js.UndefOr[MotionImageInserter]
    var NielsenConfiguration: js.UndefOr[NielsenConfiguration]
    var OutputGroups: js.UndefOr[__listOfOutputGroup]
    var TimecodeConfig: js.UndefOr[TimecodeConfig]
    var TimedMetadataInsertion: js.UndefOr[TimedMetadataInsertion]
  }

  object JobTemplateSettings {
    @inline
    def apply(
        AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000] = js.undefined,
        AvailBlanking: js.UndefOr[AvailBlanking] = js.undefined,
        Esam: js.UndefOr[EsamSettings] = js.undefined,
        Inputs: js.UndefOr[__listOfInputTemplate] = js.undefined,
        MotionImageInserter: js.UndefOr[MotionImageInserter] = js.undefined,
        NielsenConfiguration: js.UndefOr[NielsenConfiguration] = js.undefined,
        OutputGroups: js.UndefOr[__listOfOutputGroup] = js.undefined,
        TimecodeConfig: js.UndefOr[TimecodeConfig] = js.undefined,
        TimedMetadataInsertion: js.UndefOr[TimedMetadataInsertion] = js.undefined
    ): JobTemplateSettings = {
      val __obj = js.Dynamic.literal()
      AdAvailOffset.foreach(__v => __obj.updateDynamic("AdAvailOffset")(__v.asInstanceOf[js.Any]))
      AvailBlanking.foreach(__v => __obj.updateDynamic("AvailBlanking")(__v.asInstanceOf[js.Any]))
      Esam.foreach(__v => __obj.updateDynamic("Esam")(__v.asInstanceOf[js.Any]))
      Inputs.foreach(__v => __obj.updateDynamic("Inputs")(__v.asInstanceOf[js.Any]))
      MotionImageInserter.foreach(__v => __obj.updateDynamic("MotionImageInserter")(__v.asInstanceOf[js.Any]))
      NielsenConfiguration.foreach(__v => __obj.updateDynamic("NielsenConfiguration")(__v.asInstanceOf[js.Any]))
      OutputGroups.foreach(__v => __obj.updateDynamic("OutputGroups")(__v.asInstanceOf[js.Any]))
      TimecodeConfig.foreach(__v => __obj.updateDynamic("TimecodeConfig")(__v.asInstanceOf[js.Any]))
      TimedMetadataInsertion.foreach(__v => __obj.updateDynamic("TimedMetadataInsertion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobTemplateSettings]
    }
  }

  /**
    * Specify the language, using the ISO 639-2 three-letter code listed at https://www.loc.gov/standards/iso639-2/php/code_list.php.
    */
  object LanguageCodeEnum {
    val ENG = "ENG"
    val SPA = "SPA"
    val FRA = "FRA"
    val DEU = "DEU"
    val GER = "GER"
    val ZHO = "ZHO"
    val ARA = "ARA"
    val HIN = "HIN"
    val JPN = "JPN"
    val RUS = "RUS"
    val POR = "POR"
    val ITA = "ITA"
    val URD = "URD"
    val VIE = "VIE"
    val KOR = "KOR"
    val PAN = "PAN"
    val ABK = "ABK"
    val AAR = "AAR"
    val AFR = "AFR"
    val AKA = "AKA"
    val SQI = "SQI"
    val AMH = "AMH"
    val ARG = "ARG"
    val HYE = "HYE"
    val ASM = "ASM"
    val AVA = "AVA"
    val AVE = "AVE"
    val AYM = "AYM"
    val AZE = "AZE"
    val BAM = "BAM"
    val BAK = "BAK"
    val EUS = "EUS"
    val BEL = "BEL"
    val BEN = "BEN"
    val BIH = "BIH"
    val BIS = "BIS"
    val BOS = "BOS"
    val BRE = "BRE"
    val BUL = "BUL"
    val MYA = "MYA"
    val CAT = "CAT"
    val KHM = "KHM"
    val CHA = "CHA"
    val CHE = "CHE"
    val NYA = "NYA"
    val CHU = "CHU"
    val CHV = "CHV"
    val COR = "COR"
    val COS = "COS"
    val CRE = "CRE"
    val HRV = "HRV"
    val CES = "CES"
    val DAN = "DAN"
    val DIV = "DIV"
    val NLD = "NLD"
    val DZO = "DZO"
    val ENM = "ENM"
    val EPO = "EPO"
    val EST = "EST"
    val EWE = "EWE"
    val FAO = "FAO"
    val FIJ = "FIJ"
    val FIN = "FIN"
    val FRM = "FRM"
    val FUL = "FUL"
    val GLA = "GLA"
    val GLG = "GLG"
    val LUG = "LUG"
    val KAT = "KAT"
    val ELL = "ELL"
    val GRN = "GRN"
    val GUJ = "GUJ"
    val HAT = "HAT"
    val HAU = "HAU"
    val HEB = "HEB"
    val HER = "HER"
    val HMO = "HMO"
    val HUN = "HUN"
    val ISL = "ISL"
    val IDO = "IDO"
    val IBO = "IBO"
    val IND = "IND"
    val INA = "INA"
    val ILE = "ILE"
    val IKU = "IKU"
    val IPK = "IPK"
    val GLE = "GLE"
    val JAV = "JAV"
    val KAL = "KAL"
    val KAN = "KAN"
    val KAU = "KAU"
    val KAS = "KAS"
    val KAZ = "KAZ"
    val KIK = "KIK"
    val KIN = "KIN"
    val KIR = "KIR"
    val KOM = "KOM"
    val KON = "KON"
    val KUA = "KUA"
    val KUR = "KUR"
    val LAO = "LAO"
    val LAT = "LAT"
    val LAV = "LAV"
    val LIM = "LIM"
    val LIN = "LIN"
    val LIT = "LIT"
    val LUB = "LUB"
    val LTZ = "LTZ"
    val MKD = "MKD"
    val MLG = "MLG"
    val MSA = "MSA"
    val MAL = "MAL"
    val MLT = "MLT"
    val GLV = "GLV"
    val MRI = "MRI"
    val MAR = "MAR"
    val MAH = "MAH"
    val MON = "MON"
    val NAU = "NAU"
    val NAV = "NAV"
    val NDE = "NDE"
    val NBL = "NBL"
    val NDO = "NDO"
    val NEP = "NEP"
    val SME = "SME"
    val NOR = "NOR"
    val NOB = "NOB"
    val NNO = "NNO"
    val OCI = "OCI"
    val OJI = "OJI"
    val ORI = "ORI"
    val ORM = "ORM"
    val OSS = "OSS"
    val PLI = "PLI"
    val FAS = "FAS"
    val POL = "POL"
    val PUS = "PUS"
    val QUE = "QUE"
    val QAA = "QAA"
    val RON = "RON"
    val ROH = "ROH"
    val RUN = "RUN"
    val SMO = "SMO"
    val SAG = "SAG"
    val SAN = "SAN"
    val SRD = "SRD"
    val SRB = "SRB"
    val SNA = "SNA"
    val III = "III"
    val SND = "SND"
    val SIN = "SIN"
    val SLK = "SLK"
    val SLV = "SLV"
    val SOM = "SOM"
    val SOT = "SOT"
    val SUN = "SUN"
    val SWA = "SWA"
    val SSW = "SSW"
    val SWE = "SWE"
    val TGL = "TGL"
    val TAH = "TAH"
    val TGK = "TGK"
    val TAM = "TAM"
    val TAT = "TAT"
    val TEL = "TEL"
    val THA = "THA"
    val BOD = "BOD"
    val TIR = "TIR"
    val TON = "TON"
    val TSO = "TSO"
    val TSN = "TSN"
    val TUR = "TUR"
    val TUK = "TUK"
    val TWI = "TWI"
    val UIG = "UIG"
    val UKR = "UKR"
    val UZB = "UZB"
    val VEN = "VEN"
    val VOL = "VOL"
    val WLN = "WLN"
    val CYM = "CYM"
    val FRY = "FRY"
    val WOL = "WOL"
    val XHO = "XHO"
    val YID = "YID"
    val YOR = "YOR"
    val ZHA = "ZHA"
    val ZUL = "ZUL"
    val ORJ = "ORJ"
    val QPC = "QPC"
    val TNG = "TNG"

    val values = js.Object.freeze(
      js.Array(
        ENG,
        SPA,
        FRA,
        DEU,
        GER,
        ZHO,
        ARA,
        HIN,
        JPN,
        RUS,
        POR,
        ITA,
        URD,
        VIE,
        KOR,
        PAN,
        ABK,
        AAR,
        AFR,
        AKA,
        SQI,
        AMH,
        ARG,
        HYE,
        ASM,
        AVA,
        AVE,
        AYM,
        AZE,
        BAM,
        BAK,
        EUS,
        BEL,
        BEN,
        BIH,
        BIS,
        BOS,
        BRE,
        BUL,
        MYA,
        CAT,
        KHM,
        CHA,
        CHE,
        NYA,
        CHU,
        CHV,
        COR,
        COS,
        CRE,
        HRV,
        CES,
        DAN,
        DIV,
        NLD,
        DZO,
        ENM,
        EPO,
        EST,
        EWE,
        FAO,
        FIJ,
        FIN,
        FRM,
        FUL,
        GLA,
        GLG,
        LUG,
        KAT,
        ELL,
        GRN,
        GUJ,
        HAT,
        HAU,
        HEB,
        HER,
        HMO,
        HUN,
        ISL,
        IDO,
        IBO,
        IND,
        INA,
        ILE,
        IKU,
        IPK,
        GLE,
        JAV,
        KAL,
        KAN,
        KAU,
        KAS,
        KAZ,
        KIK,
        KIN,
        KIR,
        KOM,
        KON,
        KUA,
        KUR,
        LAO,
        LAT,
        LAV,
        LIM,
        LIN,
        LIT,
        LUB,
        LTZ,
        MKD,
        MLG,
        MSA,
        MAL,
        MLT,
        GLV,
        MRI,
        MAR,
        MAH,
        MON,
        NAU,
        NAV,
        NDE,
        NBL,
        NDO,
        NEP,
        SME,
        NOR,
        NOB,
        NNO,
        OCI,
        OJI,
        ORI,
        ORM,
        OSS,
        PLI,
        FAS,
        POL,
        PUS,
        QUE,
        QAA,
        RON,
        ROH,
        RUN,
        SMO,
        SAG,
        SAN,
        SRD,
        SRB,
        SNA,
        III,
        SND,
        SIN,
        SLK,
        SLV,
        SOM,
        SOT,
        SUN,
        SWA,
        SSW,
        SWE,
        TGL,
        TAH,
        TGK,
        TAM,
        TAT,
        TEL,
        THA,
        BOD,
        TIR,
        TON,
        TSO,
        TSN,
        TUR,
        TUK,
        TWI,
        UIG,
        UKR,
        UZB,
        VEN,
        VOL,
        WLN,
        CYM,
        FRY,
        WOL,
        XHO,
        YID,
        YOR,
        ZHA,
        ZUL,
        ORJ,
        QPC,
        TNG
      )
    )
  }

  @js.native
  trait ListJobTemplatesRequest extends js.Object {
    var Category: js.UndefOr[__string]
    var ListBy: js.UndefOr[JobTemplateListBy]
    var MaxResults: js.UndefOr[__integerMin1Max20]
    var NextToken: js.UndefOr[__string]
    var Order: js.UndefOr[Order]
  }

  object ListJobTemplatesRequest {
    @inline
    def apply(
        Category: js.UndefOr[__string] = js.undefined,
        ListBy: js.UndefOr[JobTemplateListBy] = js.undefined,
        MaxResults: js.UndefOr[__integerMin1Max20] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Order: js.UndefOr[Order] = js.undefined
    ): ListJobTemplatesRequest = {
      val __obj = js.Dynamic.literal()
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      ListBy.foreach(__v => __obj.updateDynamic("ListBy")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Order.foreach(__v => __obj.updateDynamic("Order")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobTemplatesRequest]
    }
  }

  @js.native
  trait ListJobTemplatesResponse extends js.Object {
    var JobTemplates: js.UndefOr[__listOfJobTemplate]
    var NextToken: js.UndefOr[__string]
  }

  object ListJobTemplatesResponse {
    @inline
    def apply(
        JobTemplates: js.UndefOr[__listOfJobTemplate] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListJobTemplatesResponse = {
      val __obj = js.Dynamic.literal()
      JobTemplates.foreach(__v => __obj.updateDynamic("JobTemplates")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobTemplatesResponse]
    }
  }

  @js.native
  trait ListJobsRequest extends js.Object {
    var MaxResults: js.UndefOr[__integerMin1Max20]
    var NextToken: js.UndefOr[__string]
    var Order: js.UndefOr[Order]
    var Queue: js.UndefOr[__string]
    var Status: js.UndefOr[JobStatus]
  }

  object ListJobsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[__integerMin1Max20] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Order: js.UndefOr[Order] = js.undefined,
        Queue: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[JobStatus] = js.undefined
    ): ListJobsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Order.foreach(__v => __obj.updateDynamic("Order")(__v.asInstanceOf[js.Any]))
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsRequest]
    }
  }

  @js.native
  trait ListJobsResponse extends js.Object {
    var Jobs: js.UndefOr[__listOfJob]
    var NextToken: js.UndefOr[__string]
  }

  object ListJobsResponse {
    @inline
    def apply(
        Jobs: js.UndefOr[__listOfJob] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListJobsResponse = {
      val __obj = js.Dynamic.literal()
      Jobs.foreach(__v => __obj.updateDynamic("Jobs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsResponse]
    }
  }

  @js.native
  trait ListPresetsRequest extends js.Object {
    var Category: js.UndefOr[__string]
    var ListBy: js.UndefOr[PresetListBy]
    var MaxResults: js.UndefOr[__integerMin1Max20]
    var NextToken: js.UndefOr[__string]
    var Order: js.UndefOr[Order]
  }

  object ListPresetsRequest {
    @inline
    def apply(
        Category: js.UndefOr[__string] = js.undefined,
        ListBy: js.UndefOr[PresetListBy] = js.undefined,
        MaxResults: js.UndefOr[__integerMin1Max20] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Order: js.UndefOr[Order] = js.undefined
    ): ListPresetsRequest = {
      val __obj = js.Dynamic.literal()
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      ListBy.foreach(__v => __obj.updateDynamic("ListBy")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Order.foreach(__v => __obj.updateDynamic("Order")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPresetsRequest]
    }
  }

  @js.native
  trait ListPresetsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Presets: js.UndefOr[__listOfPreset]
  }

  object ListPresetsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Presets: js.UndefOr[__listOfPreset] = js.undefined
    ): ListPresetsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Presets.foreach(__v => __obj.updateDynamic("Presets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPresetsResponse]
    }
  }

  @js.native
  trait ListQueuesRequest extends js.Object {
    var ListBy: js.UndefOr[QueueListBy]
    var MaxResults: js.UndefOr[__integerMin1Max20]
    var NextToken: js.UndefOr[__string]
    var Order: js.UndefOr[Order]
  }

  object ListQueuesRequest {
    @inline
    def apply(
        ListBy: js.UndefOr[QueueListBy] = js.undefined,
        MaxResults: js.UndefOr[__integerMin1Max20] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Order: js.UndefOr[Order] = js.undefined
    ): ListQueuesRequest = {
      val __obj = js.Dynamic.literal()
      ListBy.foreach(__v => __obj.updateDynamic("ListBy")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Order.foreach(__v => __obj.updateDynamic("Order")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueuesRequest]
    }
  }

  @js.native
  trait ListQueuesResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Queues: js.UndefOr[__listOfQueue]
  }

  object ListQueuesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Queues: js.UndefOr[__listOfQueue] = js.undefined
    ): ListQueuesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Queues.foreach(__v => __obj.updateDynamic("Queues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueuesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var Arn: __string
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        Arn: __string
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var ResourceTags: js.UndefOr[ResourceTags]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        ResourceTags: js.UndefOr[ResourceTags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      ResourceTags.foreach(__v => __obj.updateDynamic("ResourceTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * Selects between the DVB and ATSC buffer models for Dolby Digital audio.
    */
  object M2tsAudioBufferModelEnum {
    val DVB  = "DVB"
    val ATSC = "ATSC"

    val values = js.Object.freeze(js.Array(DVB, ATSC))
  }

  /**
    * Controls what buffer model to use for accurate interleaving. If set to MULTIPLEX, use multiplex  buffer model. If set to NONE, this can lead to lower latency, but low-memory devices may not be able to play back the stream without interruptions.
    */
  object M2tsBufferModelEnum {
    val MULTIPLEX = "MULTIPLEX"
    val NONE      = "NONE"

    val values = js.Object.freeze(js.Array(MULTIPLEX, NONE))
  }

  /**
    * When set to VIDEO_AND_FIXED_INTERVALS, audio EBP markers will be added to partitions 3 and 4. The interval between these additional markers will be fixed, and will be slightly shorter than the video EBP marker interval. When set to VIDEO_INTERVAL, these additional markers will not be inserted. Only applicable when EBP segmentation markers are is selected (segmentationMarkers is EBP or EBP_LEGACY).
    */
  object M2tsEbpAudioIntervalEnum {
    val VIDEO_AND_FIXED_INTERVALS = "VIDEO_AND_FIXED_INTERVALS"
    val VIDEO_INTERVAL            = "VIDEO_INTERVAL"

    val values = js.Object.freeze(js.Array(VIDEO_AND_FIXED_INTERVALS, VIDEO_INTERVAL))
  }

  /**
    * Selects which PIDs to place EBP markers on. They can either be placed only on the video PID, or on both the video PID and all audio PIDs. Only applicable when EBP segmentation markers are is selected (segmentationMarkers is EBP or EBP_LEGACY).
    */
  object M2tsEbpPlacementEnum {
    val VIDEO_AND_AUDIO_PIDS = "VIDEO_AND_AUDIO_PIDS"
    val VIDEO_PID            = "VIDEO_PID"

    val values = js.Object.freeze(js.Array(VIDEO_AND_AUDIO_PIDS, VIDEO_PID))
  }

  /**
    * Controls whether to include the ES Rate field in the PES header.
    */
  object M2tsEsRateInPesEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * Keep the default value (DEFAULT) unless you know that your audio EBP markers are incorrectly appearing before your video EBP markers. To correct this problem, set this value to Force (FORCE).
    */
  object M2tsForceTsVideoEbpOrderEnum {
    val FORCE   = "FORCE"
    val DEFAULT = "DEFAULT"

    val values = js.Object.freeze(js.Array(FORCE, DEFAULT))
  }

  /**
    * If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  object M2tsNielsenId3Enum {
    val INSERT = "INSERT"
    val NONE   = "NONE"

    val values = js.Object.freeze(js.Array(INSERT, NONE))
  }

  /**
    * When set to PCR_EVERY_PES_PACKET, a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  object M2tsPcrControlEnum {
    val PCR_EVERY_PES_PACKET  = "PCR_EVERY_PES_PACKET"
    val CONFIGURED_PCR_PERIOD = "CONFIGURED_PCR_PERIOD"

    val values = js.Object.freeze(js.Array(PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD))
  }

  /**
    * When set to CBR, inserts null packets into transport stream to fill specified bitrate. When set to VBR, the bitrate setting acts as the maximum bitrate, but the output will not be padded up to that bitrate.
    */
  object M2tsRateModeEnum {
    val VBR = "VBR"
    val CBR = "CBR"

    val values = js.Object.freeze(js.Array(VBR, CBR))
  }

  /**
    * Settings for SCTE-35 signals from ESAM. Include this in your job settings to put SCTE-35 markers in your HLS and transport stream outputs at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
    */
  @js.native
  trait M2tsScte35Esam extends js.Object {
    var Scte35EsamPid: js.UndefOr[__integerMin32Max8182]
  }

  object M2tsScte35Esam {
    @inline
    def apply(
        Scte35EsamPid: js.UndefOr[__integerMin32Max8182] = js.undefined
    ): M2tsScte35Esam = {
      val __obj = js.Dynamic.literal()
      Scte35EsamPid.foreach(__v => __obj.updateDynamic("Scte35EsamPid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[M2tsScte35Esam]
    }
  }

  /**
    * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want SCTE-35 markers in this output. For SCTE-35 markers from an ESAM XML document-- Choose None (NONE). Also provide the ESAM XML as a string in the setting Signal processing notification XML (sccXml). Also enable ESAM SCTE-35 (include the property scte35Esam).
    */
  object M2tsScte35SourceEnum {
    val PASSTHROUGH = "PASSTHROUGH"
    val NONE        = "NONE"

    val values = js.Object.freeze(js.Array(PASSTHROUGH, NONE))
  }

  /**
    * Inserts segmentation markers at each segmentation_time period. rai_segstart sets the Random Access Indicator bit in the adaptation field. rai_adapt sets the RAI bit and adds the current timecode in the private data bytes. psi_segstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebp_legacy adds Encoder Boundary Point information to the adaptation field using a legacy proprietary format.
    */
  object M2tsSegmentationMarkersEnum {
    val NONE         = "NONE"
    val RAI_SEGSTART = "RAI_SEGSTART"
    val RAI_ADAPT    = "RAI_ADAPT"
    val PSI_SEGSTART = "PSI_SEGSTART"
    val EBP          = "EBP"
    val EBP_LEGACY   = "EBP_LEGACY"

    val values = js.Object.freeze(js.Array(NONE, RAI_SEGSTART, RAI_ADAPT, PSI_SEGSTART, EBP, EBP_LEGACY))
  }

  /**
    * The segmentation style parameter controls how segmentation markers are inserted into the transport stream. With avails, it is possible that segments may be truncated, which can influence where future segmentation markers are inserted. When a segmentation style of "reset_cadence" is selected and a segment is truncated due to an avail, we will reset the segmentation cadence. This means the subsequent segment will have a duration of of segmentation_time seconds. When a segmentation style of "maintain_cadence" is selected and a segment is truncated due to an avail, we will not reset the segmentation cadence. This means the subsequent segment will likely be truncated as well. However, all segments after that will have a duration of segmentation_time seconds. Note that EBP lookahead is a slight exception to this rule.
    */
  object M2tsSegmentationStyleEnum {
    val MAINTAIN_CADENCE = "MAINTAIN_CADENCE"
    val RESET_CADENCE    = "RESET_CADENCE"

    val values = js.Object.freeze(js.Array(MAINTAIN_CADENCE, RESET_CADENCE))
  }

  /**
    * MPEG-2 TS container settings. These apply to outputs in a File output group when the output's container (ContainerType) is MPEG-2 Transport Stream (M2TS). In these assets, data is organized by the program map table (PMT). Each transport stream program contains subsets of data, including audio, video, and metadata. Each of these subsets of data has a numerical label called a packet identifier (PID). Each transport stream program corresponds to one MediaConvert output. The PMT lists the types of data in a program along with their PID. Downstream systems and players use the program map table to look up the PID for each type of data it accesses and then uses the PIDs to locate specific data within the asset.
    */
  @js.native
  trait M2tsSettings extends js.Object {
    var AudioBufferModel: js.UndefOr[M2tsAudioBufferModel]
    var AudioFramesPerPes: js.UndefOr[__integerMin0Max2147483647]
    var AudioPids: js.UndefOr[__listOf__integerMin32Max8182]
    var Bitrate: js.UndefOr[__integerMin0Max2147483647]
    var BufferModel: js.UndefOr[M2tsBufferModel]
    var DvbNitSettings: js.UndefOr[DvbNitSettings]
    var DvbSdtSettings: js.UndefOr[DvbSdtSettings]
    var DvbSubPids: js.UndefOr[__listOf__integerMin32Max8182]
    var DvbTdtSettings: js.UndefOr[DvbTdtSettings]
    var DvbTeletextPid: js.UndefOr[__integerMin32Max8182]
    var EbpAudioInterval: js.UndefOr[M2tsEbpAudioInterval]
    var EbpPlacement: js.UndefOr[M2tsEbpPlacement]
    var EsRateInPes: js.UndefOr[M2tsEsRateInPes]
    var ForceTsVideoEbpOrder: js.UndefOr[M2tsForceTsVideoEbpOrder]
    var FragmentTime: js.UndefOr[__doubleMin0]
    var MaxPcrInterval: js.UndefOr[__integerMin0Max500]
    var MinEbpInterval: js.UndefOr[__integerMin0Max10000]
    var NielsenId3: js.UndefOr[M2tsNielsenId3]
    var NullPacketBitrate: js.UndefOr[__doubleMin0]
    var PatInterval: js.UndefOr[__integerMin0Max1000]
    var PcrControl: js.UndefOr[M2tsPcrControl]
    var PcrPid: js.UndefOr[__integerMin32Max8182]
    var PmtInterval: js.UndefOr[__integerMin0Max1000]
    var PmtPid: js.UndefOr[__integerMin32Max8182]
    var PrivateMetadataPid: js.UndefOr[__integerMin32Max8182]
    var ProgramNumber: js.UndefOr[__integerMin0Max65535]
    var RateMode: js.UndefOr[M2tsRateMode]
    var Scte35Esam: js.UndefOr[M2tsScte35Esam]
    var Scte35Pid: js.UndefOr[__integerMin32Max8182]
    var Scte35Source: js.UndefOr[M2tsScte35Source]
    var SegmentationMarkers: js.UndefOr[M2tsSegmentationMarkers]
    var SegmentationStyle: js.UndefOr[M2tsSegmentationStyle]
    var SegmentationTime: js.UndefOr[__doubleMin0]
    var TimedMetadataPid: js.UndefOr[__integerMin32Max8182]
    var TransportStreamId: js.UndefOr[__integerMin0Max65535]
    var VideoPid: js.UndefOr[__integerMin32Max8182]
  }

  object M2tsSettings {
    @inline
    def apply(
        AudioBufferModel: js.UndefOr[M2tsAudioBufferModel] = js.undefined,
        AudioFramesPerPes: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        AudioPids: js.UndefOr[__listOf__integerMin32Max8182] = js.undefined,
        Bitrate: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        BufferModel: js.UndefOr[M2tsBufferModel] = js.undefined,
        DvbNitSettings: js.UndefOr[DvbNitSettings] = js.undefined,
        DvbSdtSettings: js.UndefOr[DvbSdtSettings] = js.undefined,
        DvbSubPids: js.UndefOr[__listOf__integerMin32Max8182] = js.undefined,
        DvbTdtSettings: js.UndefOr[DvbTdtSettings] = js.undefined,
        DvbTeletextPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
        EbpAudioInterval: js.UndefOr[M2tsEbpAudioInterval] = js.undefined,
        EbpPlacement: js.UndefOr[M2tsEbpPlacement] = js.undefined,
        EsRateInPes: js.UndefOr[M2tsEsRateInPes] = js.undefined,
        ForceTsVideoEbpOrder: js.UndefOr[M2tsForceTsVideoEbpOrder] = js.undefined,
        FragmentTime: js.UndefOr[__doubleMin0] = js.undefined,
        MaxPcrInterval: js.UndefOr[__integerMin0Max500] = js.undefined,
        MinEbpInterval: js.UndefOr[__integerMin0Max10000] = js.undefined,
        NielsenId3: js.UndefOr[M2tsNielsenId3] = js.undefined,
        NullPacketBitrate: js.UndefOr[__doubleMin0] = js.undefined,
        PatInterval: js.UndefOr[__integerMin0Max1000] = js.undefined,
        PcrControl: js.UndefOr[M2tsPcrControl] = js.undefined,
        PcrPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
        PmtInterval: js.UndefOr[__integerMin0Max1000] = js.undefined,
        PmtPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
        PrivateMetadataPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
        ProgramNumber: js.UndefOr[__integerMin0Max65535] = js.undefined,
        RateMode: js.UndefOr[M2tsRateMode] = js.undefined,
        Scte35Esam: js.UndefOr[M2tsScte35Esam] = js.undefined,
        Scte35Pid: js.UndefOr[__integerMin32Max8182] = js.undefined,
        Scte35Source: js.UndefOr[M2tsScte35Source] = js.undefined,
        SegmentationMarkers: js.UndefOr[M2tsSegmentationMarkers] = js.undefined,
        SegmentationStyle: js.UndefOr[M2tsSegmentationStyle] = js.undefined,
        SegmentationTime: js.UndefOr[__doubleMin0] = js.undefined,
        TimedMetadataPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
        TransportStreamId: js.UndefOr[__integerMin0Max65535] = js.undefined,
        VideoPid: js.UndefOr[__integerMin32Max8182] = js.undefined
    ): M2tsSettings = {
      val __obj = js.Dynamic.literal()
      AudioBufferModel.foreach(__v => __obj.updateDynamic("AudioBufferModel")(__v.asInstanceOf[js.Any]))
      AudioFramesPerPes.foreach(__v => __obj.updateDynamic("AudioFramesPerPes")(__v.asInstanceOf[js.Any]))
      AudioPids.foreach(__v => __obj.updateDynamic("AudioPids")(__v.asInstanceOf[js.Any]))
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      BufferModel.foreach(__v => __obj.updateDynamic("BufferModel")(__v.asInstanceOf[js.Any]))
      DvbNitSettings.foreach(__v => __obj.updateDynamic("DvbNitSettings")(__v.asInstanceOf[js.Any]))
      DvbSdtSettings.foreach(__v => __obj.updateDynamic("DvbSdtSettings")(__v.asInstanceOf[js.Any]))
      DvbSubPids.foreach(__v => __obj.updateDynamic("DvbSubPids")(__v.asInstanceOf[js.Any]))
      DvbTdtSettings.foreach(__v => __obj.updateDynamic("DvbTdtSettings")(__v.asInstanceOf[js.Any]))
      DvbTeletextPid.foreach(__v => __obj.updateDynamic("DvbTeletextPid")(__v.asInstanceOf[js.Any]))
      EbpAudioInterval.foreach(__v => __obj.updateDynamic("EbpAudioInterval")(__v.asInstanceOf[js.Any]))
      EbpPlacement.foreach(__v => __obj.updateDynamic("EbpPlacement")(__v.asInstanceOf[js.Any]))
      EsRateInPes.foreach(__v => __obj.updateDynamic("EsRateInPes")(__v.asInstanceOf[js.Any]))
      ForceTsVideoEbpOrder.foreach(__v => __obj.updateDynamic("ForceTsVideoEbpOrder")(__v.asInstanceOf[js.Any]))
      FragmentTime.foreach(__v => __obj.updateDynamic("FragmentTime")(__v.asInstanceOf[js.Any]))
      MaxPcrInterval.foreach(__v => __obj.updateDynamic("MaxPcrInterval")(__v.asInstanceOf[js.Any]))
      MinEbpInterval.foreach(__v => __obj.updateDynamic("MinEbpInterval")(__v.asInstanceOf[js.Any]))
      NielsenId3.foreach(__v => __obj.updateDynamic("NielsenId3")(__v.asInstanceOf[js.Any]))
      NullPacketBitrate.foreach(__v => __obj.updateDynamic("NullPacketBitrate")(__v.asInstanceOf[js.Any]))
      PatInterval.foreach(__v => __obj.updateDynamic("PatInterval")(__v.asInstanceOf[js.Any]))
      PcrControl.foreach(__v => __obj.updateDynamic("PcrControl")(__v.asInstanceOf[js.Any]))
      PcrPid.foreach(__v => __obj.updateDynamic("PcrPid")(__v.asInstanceOf[js.Any]))
      PmtInterval.foreach(__v => __obj.updateDynamic("PmtInterval")(__v.asInstanceOf[js.Any]))
      PmtPid.foreach(__v => __obj.updateDynamic("PmtPid")(__v.asInstanceOf[js.Any]))
      PrivateMetadataPid.foreach(__v => __obj.updateDynamic("PrivateMetadataPid")(__v.asInstanceOf[js.Any]))
      ProgramNumber.foreach(__v => __obj.updateDynamic("ProgramNumber")(__v.asInstanceOf[js.Any]))
      RateMode.foreach(__v => __obj.updateDynamic("RateMode")(__v.asInstanceOf[js.Any]))
      Scte35Esam.foreach(__v => __obj.updateDynamic("Scte35Esam")(__v.asInstanceOf[js.Any]))
      Scte35Pid.foreach(__v => __obj.updateDynamic("Scte35Pid")(__v.asInstanceOf[js.Any]))
      Scte35Source.foreach(__v => __obj.updateDynamic("Scte35Source")(__v.asInstanceOf[js.Any]))
      SegmentationMarkers.foreach(__v => __obj.updateDynamic("SegmentationMarkers")(__v.asInstanceOf[js.Any]))
      SegmentationStyle.foreach(__v => __obj.updateDynamic("SegmentationStyle")(__v.asInstanceOf[js.Any]))
      SegmentationTime.foreach(__v => __obj.updateDynamic("SegmentationTime")(__v.asInstanceOf[js.Any]))
      TimedMetadataPid.foreach(__v => __obj.updateDynamic("TimedMetadataPid")(__v.asInstanceOf[js.Any]))
      TransportStreamId.foreach(__v => __obj.updateDynamic("TransportStreamId")(__v.asInstanceOf[js.Any]))
      VideoPid.foreach(__v => __obj.updateDynamic("VideoPid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[M2tsSettings]
    }
  }

  /**
    * If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  object M3u8NielsenId3Enum {
    val INSERT = "INSERT"
    val NONE   = "NONE"

    val values = js.Object.freeze(js.Array(INSERT, NONE))
  }

  /**
    * When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  object M3u8PcrControlEnum {
    val PCR_EVERY_PES_PACKET  = "PCR_EVERY_PES_PACKET"
    val CONFIGURED_PCR_PERIOD = "CONFIGURED_PCR_PERIOD"

    val values = js.Object.freeze(js.Array(PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD))
  }

  /**
    * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want SCTE-35 markers in this output. For SCTE-35 markers from an ESAM XML document-- Choose None (NONE) if you don't want manifest conditioning. Choose Passthrough (PASSTHROUGH) and choose Ad markers (adMarkers) if you do want manifest conditioning. In both cases, also provide the ESAM XML as a string in the setting Signal processing notification XML (sccXml).
    */
  object M3u8Scte35SourceEnum {
    val PASSTHROUGH = "PASSTHROUGH"
    val NONE        = "NONE"

    val values = js.Object.freeze(js.Array(PASSTHROUGH, NONE))
  }

  /**
    * Settings for TS segments in HLS
    */
  @js.native
  trait M3u8Settings extends js.Object {
    var AudioFramesPerPes: js.UndefOr[__integerMin0Max2147483647]
    var AudioPids: js.UndefOr[__listOf__integerMin32Max8182]
    var NielsenId3: js.UndefOr[M3u8NielsenId3]
    var PatInterval: js.UndefOr[__integerMin0Max1000]
    var PcrControl: js.UndefOr[M3u8PcrControl]
    var PcrPid: js.UndefOr[__integerMin32Max8182]
    var PmtInterval: js.UndefOr[__integerMin0Max1000]
    var PmtPid: js.UndefOr[__integerMin32Max8182]
    var PrivateMetadataPid: js.UndefOr[__integerMin32Max8182]
    var ProgramNumber: js.UndefOr[__integerMin0Max65535]
    var Scte35Pid: js.UndefOr[__integerMin32Max8182]
    var Scte35Source: js.UndefOr[M3u8Scte35Source]
    var TimedMetadata: js.UndefOr[TimedMetadata]
    var TimedMetadataPid: js.UndefOr[__integerMin32Max8182]
    var TransportStreamId: js.UndefOr[__integerMin0Max65535]
    var VideoPid: js.UndefOr[__integerMin32Max8182]
  }

  object M3u8Settings {
    @inline
    def apply(
        AudioFramesPerPes: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        AudioPids: js.UndefOr[__listOf__integerMin32Max8182] = js.undefined,
        NielsenId3: js.UndefOr[M3u8NielsenId3] = js.undefined,
        PatInterval: js.UndefOr[__integerMin0Max1000] = js.undefined,
        PcrControl: js.UndefOr[M3u8PcrControl] = js.undefined,
        PcrPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
        PmtInterval: js.UndefOr[__integerMin0Max1000] = js.undefined,
        PmtPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
        PrivateMetadataPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
        ProgramNumber: js.UndefOr[__integerMin0Max65535] = js.undefined,
        Scte35Pid: js.UndefOr[__integerMin32Max8182] = js.undefined,
        Scte35Source: js.UndefOr[M3u8Scte35Source] = js.undefined,
        TimedMetadata: js.UndefOr[TimedMetadata] = js.undefined,
        TimedMetadataPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
        TransportStreamId: js.UndefOr[__integerMin0Max65535] = js.undefined,
        VideoPid: js.UndefOr[__integerMin32Max8182] = js.undefined
    ): M3u8Settings = {
      val __obj = js.Dynamic.literal()
      AudioFramesPerPes.foreach(__v => __obj.updateDynamic("AudioFramesPerPes")(__v.asInstanceOf[js.Any]))
      AudioPids.foreach(__v => __obj.updateDynamic("AudioPids")(__v.asInstanceOf[js.Any]))
      NielsenId3.foreach(__v => __obj.updateDynamic("NielsenId3")(__v.asInstanceOf[js.Any]))
      PatInterval.foreach(__v => __obj.updateDynamic("PatInterval")(__v.asInstanceOf[js.Any]))
      PcrControl.foreach(__v => __obj.updateDynamic("PcrControl")(__v.asInstanceOf[js.Any]))
      PcrPid.foreach(__v => __obj.updateDynamic("PcrPid")(__v.asInstanceOf[js.Any]))
      PmtInterval.foreach(__v => __obj.updateDynamic("PmtInterval")(__v.asInstanceOf[js.Any]))
      PmtPid.foreach(__v => __obj.updateDynamic("PmtPid")(__v.asInstanceOf[js.Any]))
      PrivateMetadataPid.foreach(__v => __obj.updateDynamic("PrivateMetadataPid")(__v.asInstanceOf[js.Any]))
      ProgramNumber.foreach(__v => __obj.updateDynamic("ProgramNumber")(__v.asInstanceOf[js.Any]))
      Scte35Pid.foreach(__v => __obj.updateDynamic("Scte35Pid")(__v.asInstanceOf[js.Any]))
      Scte35Source.foreach(__v => __obj.updateDynamic("Scte35Source")(__v.asInstanceOf[js.Any]))
      TimedMetadata.foreach(__v => __obj.updateDynamic("TimedMetadata")(__v.asInstanceOf[js.Any]))
      TimedMetadataPid.foreach(__v => __obj.updateDynamic("TimedMetadataPid")(__v.asInstanceOf[js.Any]))
      TransportStreamId.foreach(__v => __obj.updateDynamic("TransportStreamId")(__v.asInstanceOf[js.Any]))
      VideoPid.foreach(__v => __obj.updateDynamic("VideoPid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[M3u8Settings]
    }
  }

  /**
    * Overlay motion graphics on top of your video at the time that you specify.
    */
  @js.native
  trait MotionImageInserter extends js.Object {
    var Framerate: js.UndefOr[MotionImageInsertionFramerate]
    var Input: js.UndefOr[__stringMin14Max1285PatternS3Mov09Png]
    var InsertionMode: js.UndefOr[MotionImageInsertionMode]
    var Offset: js.UndefOr[MotionImageInsertionOffset]
    var Playback: js.UndefOr[MotionImagePlayback]
    var StartTime: js.UndefOr[__stringMin11Max11Pattern01D20305D205D]
  }

  object MotionImageInserter {
    @inline
    def apply(
        Framerate: js.UndefOr[MotionImageInsertionFramerate] = js.undefined,
        Input: js.UndefOr[__stringMin14Max1285PatternS3Mov09Png] = js.undefined,
        InsertionMode: js.UndefOr[MotionImageInsertionMode] = js.undefined,
        Offset: js.UndefOr[MotionImageInsertionOffset] = js.undefined,
        Playback: js.UndefOr[MotionImagePlayback] = js.undefined,
        StartTime: js.UndefOr[__stringMin11Max11Pattern01D20305D205D] = js.undefined
    ): MotionImageInserter = {
      val __obj = js.Dynamic.literal()
      Framerate.foreach(__v => __obj.updateDynamic("Framerate")(__v.asInstanceOf[js.Any]))
      Input.foreach(__v => __obj.updateDynamic("Input")(__v.asInstanceOf[js.Any]))
      InsertionMode.foreach(__v => __obj.updateDynamic("InsertionMode")(__v.asInstanceOf[js.Any]))
      Offset.foreach(__v => __obj.updateDynamic("Offset")(__v.asInstanceOf[js.Any]))
      Playback.foreach(__v => __obj.updateDynamic("Playback")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MotionImageInserter]
    }
  }

  /**
    * For motion overlays that don't have a built-in frame rate, specify the frame rate of the overlay in frames per second, as a fraction. For example, specify 24 fps as 24/1. The overlay frame rate doesn't need to match the frame rate of the underlying video.
    */
  @js.native
  trait MotionImageInsertionFramerate extends js.Object {
    var FramerateDenominator: js.UndefOr[__integerMin1Max17895697]
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483640]
  }

  object MotionImageInsertionFramerate {
    @inline
    def apply(
        FramerateDenominator: js.UndefOr[__integerMin1Max17895697] = js.undefined,
        FramerateNumerator: js.UndefOr[__integerMin1Max2147483640] = js.undefined
    ): MotionImageInsertionFramerate = {
      val __obj = js.Dynamic.literal()
      FramerateDenominator.foreach(__v => __obj.updateDynamic("FramerateDenominator")(__v.asInstanceOf[js.Any]))
      FramerateNumerator.foreach(__v => __obj.updateDynamic("FramerateNumerator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MotionImageInsertionFramerate]
    }
  }

  /**
    * Choose the type of motion graphic asset that you are providing for your overlay. You can choose either a .mov file or a series of .png files.
    */
  object MotionImageInsertionModeEnum {
    val MOV = "MOV"
    val PNG = "PNG"

    val values = js.Object.freeze(js.Array(MOV, PNG))
  }

  /**
    * Specify the offset between the upper-left corner of the video frame and the top left corner of the overlay.
    */
  @js.native
  trait MotionImageInsertionOffset extends js.Object {
    var ImageX: js.UndefOr[__integerMin0Max2147483647]
    var ImageY: js.UndefOr[__integerMin0Max2147483647]
  }

  object MotionImageInsertionOffset {
    @inline
    def apply(
        ImageX: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        ImageY: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    ): MotionImageInsertionOffset = {
      val __obj = js.Dynamic.literal()
      ImageX.foreach(__v => __obj.updateDynamic("ImageX")(__v.asInstanceOf[js.Any]))
      ImageY.foreach(__v => __obj.updateDynamic("ImageY")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MotionImageInsertionOffset]
    }
  }

  /**
    * Specify whether your motion graphic overlay repeats on a loop or plays only once.
    */
  object MotionImagePlaybackEnum {
    val ONCE   = "ONCE"
    val REPEAT = "REPEAT"

    val values = js.Object.freeze(js.Array(ONCE, REPEAT))
  }

  /**
    * When enabled, include 'clap' atom if appropriate for the video output settings.
    */
  object MovClapAtomEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
    */
  object MovCslgAtomEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * When set to XDCAM, writes MPEG2 video streams into the QuickTime file using XDCAM fourcc codes. This increases compatibility with Apple editors and players, but may decrease compatibility with other players. Only applicable when the video codec is MPEG2.
    */
  object MovMpeg2FourCCControlEnum {
    val XDCAM = "XDCAM"
    val MPEG  = "MPEG"

    val values = js.Object.freeze(js.Array(XDCAM, MPEG))
  }

  /**
    * If set to OMNEON, inserts Omneon-compatible padding
    */
  object MovPaddingControlEnum {
    val OMNEON = "OMNEON"
    val NONE   = "NONE"

    val values = js.Object.freeze(js.Array(OMNEON, NONE))
  }

  /**
    * Always keep the default value (SELF_CONTAINED) for this setting.
    */
  object MovReferenceEnum {
    val SELF_CONTAINED = "SELF_CONTAINED"
    val EXTERNAL       = "EXTERNAL"

    val values = js.Object.freeze(js.Array(SELF_CONTAINED, EXTERNAL))
  }

  /**
    * Settings for MOV Container.
    */
  @js.native
  trait MovSettings extends js.Object {
    var ClapAtom: js.UndefOr[MovClapAtom]
    var CslgAtom: js.UndefOr[MovCslgAtom]
    var Mpeg2FourCCControl: js.UndefOr[MovMpeg2FourCCControl]
    var PaddingControl: js.UndefOr[MovPaddingControl]
    var Reference: js.UndefOr[MovReference]
  }

  object MovSettings {
    @inline
    def apply(
        ClapAtom: js.UndefOr[MovClapAtom] = js.undefined,
        CslgAtom: js.UndefOr[MovCslgAtom] = js.undefined,
        Mpeg2FourCCControl: js.UndefOr[MovMpeg2FourCCControl] = js.undefined,
        PaddingControl: js.UndefOr[MovPaddingControl] = js.undefined,
        Reference: js.UndefOr[MovReference] = js.undefined
    ): MovSettings = {
      val __obj = js.Dynamic.literal()
      ClapAtom.foreach(__v => __obj.updateDynamic("ClapAtom")(__v.asInstanceOf[js.Any]))
      CslgAtom.foreach(__v => __obj.updateDynamic("CslgAtom")(__v.asInstanceOf[js.Any]))
      Mpeg2FourCCControl.foreach(__v => __obj.updateDynamic("Mpeg2FourCCControl")(__v.asInstanceOf[js.Any]))
      PaddingControl.foreach(__v => __obj.updateDynamic("PaddingControl")(__v.asInstanceOf[js.Any]))
      Reference.foreach(__v => __obj.updateDynamic("Reference")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MovSettings]
    }
  }

  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value MP2.
    */
  @js.native
  trait Mp2Settings extends js.Object {
    var Bitrate: js.UndefOr[__integerMin32000Max384000]
    var Channels: js.UndefOr[__integerMin1Max2]
    var SampleRate: js.UndefOr[__integerMin32000Max48000]
  }

  object Mp2Settings {
    @inline
    def apply(
        Bitrate: js.UndefOr[__integerMin32000Max384000] = js.undefined,
        Channels: js.UndefOr[__integerMin1Max2] = js.undefined,
        SampleRate: js.UndefOr[__integerMin32000Max48000] = js.undefined
    ): Mp2Settings = {
      val __obj = js.Dynamic.literal()
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      Channels.foreach(__v => __obj.updateDynamic("Channels")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Mp2Settings]
    }
  }

  /**
    * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
    */
  object Mp4CslgAtomEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * Inserts a free-space box immediately after the moov box.
    */
  object Mp4FreeSpaceBoxEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
    */
  object Mp4MoovPlacementEnum {
    val PROGRESSIVE_DOWNLOAD = "PROGRESSIVE_DOWNLOAD"
    val NORMAL               = "NORMAL"

    val values = js.Object.freeze(js.Array(PROGRESSIVE_DOWNLOAD, NORMAL))
  }

  /**
    * Settings for MP4 container. You can create audio-only AAC outputs with this container.
    */
  @js.native
  trait Mp4Settings extends js.Object {
    var CslgAtom: js.UndefOr[Mp4CslgAtom]
    var FreeSpaceBox: js.UndefOr[Mp4FreeSpaceBox]
    var MoovPlacement: js.UndefOr[Mp4MoovPlacement]
    var Mp4MajorBrand: js.UndefOr[__string]
  }

  object Mp4Settings {
    @inline
    def apply(
        CslgAtom: js.UndefOr[Mp4CslgAtom] = js.undefined,
        FreeSpaceBox: js.UndefOr[Mp4FreeSpaceBox] = js.undefined,
        MoovPlacement: js.UndefOr[Mp4MoovPlacement] = js.undefined,
        Mp4MajorBrand: js.UndefOr[__string] = js.undefined
    ): Mp4Settings = {
      val __obj = js.Dynamic.literal()
      CslgAtom.foreach(__v => __obj.updateDynamic("CslgAtom")(__v.asInstanceOf[js.Any]))
      FreeSpaceBox.foreach(__v => __obj.updateDynamic("FreeSpaceBox")(__v.asInstanceOf[js.Any]))
      MoovPlacement.foreach(__v => __obj.updateDynamic("MoovPlacement")(__v.asInstanceOf[js.Any]))
      Mp4MajorBrand.foreach(__v => __obj.updateDynamic("Mp4MajorBrand")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Mp4Settings]
    }
  }

  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
    */
  object Mpeg2AdaptiveQuantizationEnum {
    val OFF    = "OFF"
    val LOW    = "LOW"
    val MEDIUM = "MEDIUM"
    val HIGH   = "HIGH"

    val values = js.Object.freeze(js.Array(OFF, LOW, MEDIUM, HIGH))
  }

  /**
    * Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
    */
  object Mpeg2CodecLevelEnum {
    val AUTO     = "AUTO"
    val LOW      = "LOW"
    val MAIN     = "MAIN"
    val HIGH1440 = "HIGH1440"
    val HIGH     = "HIGH"

    val values = js.Object.freeze(js.Array(AUTO, LOW, MAIN, HIGH1440, HIGH))
  }

  /**
    * Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video output.
    */
  object Mpeg2CodecProfileEnum {
    val MAIN        = "MAIN"
    val PROFILE_422 = "PROFILE_422"

    val values = js.Object.freeze(js.Array(MAIN, PROFILE_422))
  }

  /**
    * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
    */
  object Mpeg2DynamicSubGopEnum {
    val ADAPTIVE = "ADAPTIVE"
    val STATIC   = "STATIC"

    val values = js.Object.freeze(js.Array(ADAPTIVE, STATIC))
  }

  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job sepecification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  object Mpeg2FramerateControlEnum {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE"
    val SPECIFIED              = "SPECIFIED"

    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
    */
  object Mpeg2FramerateConversionAlgorithmEnum {
    val DUPLICATE_DROP = "DUPLICATE_DROP"
    val INTERPOLATE    = "INTERPOLATE"

    val values = js.Object.freeze(js.Array(DUPLICATE_DROP, INTERPOLATE))
  }

  /**
    * Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
    */
  object Mpeg2GopSizeUnitsEnum {
    val FRAMES  = "FRAMES"
    val SECONDS = "SECONDS"

    val values = js.Object.freeze(js.Array(FRAMES, SECONDS))
  }

  /**
    * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior depends on the input scan type.
    *   - If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first".
    *   - If the source is progressive, the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose.
    */
  object Mpeg2InterlaceModeEnum {
    val PROGRESSIVE         = "PROGRESSIVE"
    val TOP_FIELD           = "TOP_FIELD"
    val BOTTOM_FIELD        = "BOTTOM_FIELD"
    val FOLLOW_TOP_FIELD    = "FOLLOW_TOP_FIELD"
    val FOLLOW_BOTTOM_FIELD = "FOLLOW_BOTTOM_FIELD"

    val values = js.Object.freeze(js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD))
  }

  /**
    * Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization precision for intra-block DC coefficients. If you choose the value auto, the service will automatically select the precision based on the per-frame compression ratio.
    */
  object Mpeg2IntraDcPrecisionEnum {
    val AUTO                  = "AUTO"
    val INTRA_DC_PRECISION_8  = "INTRA_DC_PRECISION_8"
    val INTRA_DC_PRECISION_9  = "INTRA_DC_PRECISION_9"
    val INTRA_DC_PRECISION_10 = "INTRA_DC_PRECISION_10"
    val INTRA_DC_PRECISION_11 = "INTRA_DC_PRECISION_11"

    val values = js.Object.freeze(
      js.Array(AUTO, INTRA_DC_PRECISION_8, INTRA_DC_PRECISION_9, INTRA_DC_PRECISION_10, INTRA_DC_PRECISION_11)
    )
  }

  /**
    * Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the input. Using the console, do this by choosing Follow source for Pixel aspect ratio.
    */
  object Mpeg2ParControlEnum {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE"
    val SPECIFIED              = "SPECIFIED"

    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * Use Quality tuning level (Mpeg2QualityTuningLevel) to specifiy whether to use single-pass or multipass video encoding.
    */
  object Mpeg2QualityTuningLevelEnum {
    val SINGLE_PASS = "SINGLE_PASS"
    val MULTI_PASS  = "MULTI_PASS"

    val values = js.Object.freeze(js.Array(SINGLE_PASS, MULTI_PASS))
  }

  /**
    * Use Rate control mode (Mpeg2RateControlMode) to specifiy whether the bitrate is variable (vbr) or constant (cbr).
    */
  object Mpeg2RateControlModeEnum {
    val VBR = "VBR"
    val CBR = "CBR"

    val values = js.Object.freeze(js.Array(VBR, CBR))
  }

  /**
    * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default.
    */
  object Mpeg2SceneChangeDetectEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value MPEG2.
    */
  @js.native
  trait Mpeg2Settings extends js.Object {
    var AdaptiveQuantization: js.UndefOr[Mpeg2AdaptiveQuantization]
    var Bitrate: js.UndefOr[__integerMin1000Max288000000]
    var CodecLevel: js.UndefOr[Mpeg2CodecLevel]
    var CodecProfile: js.UndefOr[Mpeg2CodecProfile]
    var DynamicSubGop: js.UndefOr[Mpeg2DynamicSubGop]
    var FramerateControl: js.UndefOr[Mpeg2FramerateControl]
    var FramerateConversionAlgorithm: js.UndefOr[Mpeg2FramerateConversionAlgorithm]
    var FramerateDenominator: js.UndefOr[__integerMin1Max1001]
    var FramerateNumerator: js.UndefOr[__integerMin24Max60000]
    var GopClosedCadence: js.UndefOr[__integerMin0Max2147483647]
    var GopSize: js.UndefOr[__doubleMin0]
    var GopSizeUnits: js.UndefOr[Mpeg2GopSizeUnits]
    var HrdBufferInitialFillPercentage: js.UndefOr[__integerMin0Max100]
    var HrdBufferSize: js.UndefOr[__integerMin0Max47185920]
    var InterlaceMode: js.UndefOr[Mpeg2InterlaceMode]
    var IntraDcPrecision: js.UndefOr[Mpeg2IntraDcPrecision]
    var MaxBitrate: js.UndefOr[__integerMin1000Max300000000]
    var MinIInterval: js.UndefOr[__integerMin0Max30]
    var NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin0Max7]
    var ParControl: js.UndefOr[Mpeg2ParControl]
    var ParDenominator: js.UndefOr[__integerMin1Max2147483647]
    var ParNumerator: js.UndefOr[__integerMin1Max2147483647]
    var QualityTuningLevel: js.UndefOr[Mpeg2QualityTuningLevel]
    var RateControlMode: js.UndefOr[Mpeg2RateControlMode]
    var SceneChangeDetect: js.UndefOr[Mpeg2SceneChangeDetect]
    var SlowPal: js.UndefOr[Mpeg2SlowPal]
    var Softness: js.UndefOr[__integerMin0Max128]
    var SpatialAdaptiveQuantization: js.UndefOr[Mpeg2SpatialAdaptiveQuantization]
    var Syntax: js.UndefOr[Mpeg2Syntax]
    var Telecine: js.UndefOr[Mpeg2Telecine]
    var TemporalAdaptiveQuantization: js.UndefOr[Mpeg2TemporalAdaptiveQuantization]
  }

  object Mpeg2Settings {
    @inline
    def apply(
        AdaptiveQuantization: js.UndefOr[Mpeg2AdaptiveQuantization] = js.undefined,
        Bitrate: js.UndefOr[__integerMin1000Max288000000] = js.undefined,
        CodecLevel: js.UndefOr[Mpeg2CodecLevel] = js.undefined,
        CodecProfile: js.UndefOr[Mpeg2CodecProfile] = js.undefined,
        DynamicSubGop: js.UndefOr[Mpeg2DynamicSubGop] = js.undefined,
        FramerateControl: js.UndefOr[Mpeg2FramerateControl] = js.undefined,
        FramerateConversionAlgorithm: js.UndefOr[Mpeg2FramerateConversionAlgorithm] = js.undefined,
        FramerateDenominator: js.UndefOr[__integerMin1Max1001] = js.undefined,
        FramerateNumerator: js.UndefOr[__integerMin24Max60000] = js.undefined,
        GopClosedCadence: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        GopSize: js.UndefOr[__doubleMin0] = js.undefined,
        GopSizeUnits: js.UndefOr[Mpeg2GopSizeUnits] = js.undefined,
        HrdBufferInitialFillPercentage: js.UndefOr[__integerMin0Max100] = js.undefined,
        HrdBufferSize: js.UndefOr[__integerMin0Max47185920] = js.undefined,
        InterlaceMode: js.UndefOr[Mpeg2InterlaceMode] = js.undefined,
        IntraDcPrecision: js.UndefOr[Mpeg2IntraDcPrecision] = js.undefined,
        MaxBitrate: js.UndefOr[__integerMin1000Max300000000] = js.undefined,
        MinIInterval: js.UndefOr[__integerMin0Max30] = js.undefined,
        NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin0Max7] = js.undefined,
        ParControl: js.UndefOr[Mpeg2ParControl] = js.undefined,
        ParDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        ParNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        QualityTuningLevel: js.UndefOr[Mpeg2QualityTuningLevel] = js.undefined,
        RateControlMode: js.UndefOr[Mpeg2RateControlMode] = js.undefined,
        SceneChangeDetect: js.UndefOr[Mpeg2SceneChangeDetect] = js.undefined,
        SlowPal: js.UndefOr[Mpeg2SlowPal] = js.undefined,
        Softness: js.UndefOr[__integerMin0Max128] = js.undefined,
        SpatialAdaptiveQuantization: js.UndefOr[Mpeg2SpatialAdaptiveQuantization] = js.undefined,
        Syntax: js.UndefOr[Mpeg2Syntax] = js.undefined,
        Telecine: js.UndefOr[Mpeg2Telecine] = js.undefined,
        TemporalAdaptiveQuantization: js.UndefOr[Mpeg2TemporalAdaptiveQuantization] = js.undefined
    ): Mpeg2Settings = {
      val __obj = js.Dynamic.literal()
      AdaptiveQuantization.foreach(__v => __obj.updateDynamic("AdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      CodecLevel.foreach(__v => __obj.updateDynamic("CodecLevel")(__v.asInstanceOf[js.Any]))
      CodecProfile.foreach(__v => __obj.updateDynamic("CodecProfile")(__v.asInstanceOf[js.Any]))
      DynamicSubGop.foreach(__v => __obj.updateDynamic("DynamicSubGop")(__v.asInstanceOf[js.Any]))
      FramerateControl.foreach(__v => __obj.updateDynamic("FramerateControl")(__v.asInstanceOf[js.Any]))
      FramerateConversionAlgorithm.foreach(
        __v => __obj.updateDynamic("FramerateConversionAlgorithm")(__v.asInstanceOf[js.Any])
      )
      FramerateDenominator.foreach(__v => __obj.updateDynamic("FramerateDenominator")(__v.asInstanceOf[js.Any]))
      FramerateNumerator.foreach(__v => __obj.updateDynamic("FramerateNumerator")(__v.asInstanceOf[js.Any]))
      GopClosedCadence.foreach(__v => __obj.updateDynamic("GopClosedCadence")(__v.asInstanceOf[js.Any]))
      GopSize.foreach(__v => __obj.updateDynamic("GopSize")(__v.asInstanceOf[js.Any]))
      GopSizeUnits.foreach(__v => __obj.updateDynamic("GopSizeUnits")(__v.asInstanceOf[js.Any]))
      HrdBufferInitialFillPercentage.foreach(
        __v => __obj.updateDynamic("HrdBufferInitialFillPercentage")(__v.asInstanceOf[js.Any])
      )
      HrdBufferSize.foreach(__v => __obj.updateDynamic("HrdBufferSize")(__v.asInstanceOf[js.Any]))
      InterlaceMode.foreach(__v => __obj.updateDynamic("InterlaceMode")(__v.asInstanceOf[js.Any]))
      IntraDcPrecision.foreach(__v => __obj.updateDynamic("IntraDcPrecision")(__v.asInstanceOf[js.Any]))
      MaxBitrate.foreach(__v => __obj.updateDynamic("MaxBitrate")(__v.asInstanceOf[js.Any]))
      MinIInterval.foreach(__v => __obj.updateDynamic("MinIInterval")(__v.asInstanceOf[js.Any]))
      NumberBFramesBetweenReferenceFrames.foreach(
        __v => __obj.updateDynamic("NumberBFramesBetweenReferenceFrames")(__v.asInstanceOf[js.Any])
      )
      ParControl.foreach(__v => __obj.updateDynamic("ParControl")(__v.asInstanceOf[js.Any]))
      ParDenominator.foreach(__v => __obj.updateDynamic("ParDenominator")(__v.asInstanceOf[js.Any]))
      ParNumerator.foreach(__v => __obj.updateDynamic("ParNumerator")(__v.asInstanceOf[js.Any]))
      QualityTuningLevel.foreach(__v => __obj.updateDynamic("QualityTuningLevel")(__v.asInstanceOf[js.Any]))
      RateControlMode.foreach(__v => __obj.updateDynamic("RateControlMode")(__v.asInstanceOf[js.Any]))
      SceneChangeDetect.foreach(__v => __obj.updateDynamic("SceneChangeDetect")(__v.asInstanceOf[js.Any]))
      SlowPal.foreach(__v => __obj.updateDynamic("SlowPal")(__v.asInstanceOf[js.Any]))
      Softness.foreach(__v => __obj.updateDynamic("Softness")(__v.asInstanceOf[js.Any]))
      SpatialAdaptiveQuantization.foreach(
        __v => __obj.updateDynamic("SpatialAdaptiveQuantization")(__v.asInstanceOf[js.Any])
      )
      Syntax.foreach(__v => __obj.updateDynamic("Syntax")(__v.asInstanceOf[js.Any]))
      Telecine.foreach(__v => __obj.updateDynamic("Telecine")(__v.asInstanceOf[js.Any]))
      TemporalAdaptiveQuantization.foreach(
        __v => __obj.updateDynamic("TemporalAdaptiveQuantization")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[Mpeg2Settings]
    }
  }

  /**
    * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
    */
  object Mpeg2SlowPalEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Adjust quantization within each frame based on spatial variation of content complexity.
    */
  object Mpeg2SpatialAdaptiveQuantizationEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Produces a Type D-10 compatible bitstream (SMPTE 356M-2001).
    */
  object Mpeg2SyntaxEnum {
    val DEFAULT = "DEFAULT"
    val D_10    = "D_10"

    val values = js.Object.freeze(js.Array(DEFAULT, D_10))
  }

  /**
    * Only use Telecine (Mpeg2Telecine) when you set Framerate (Framerate) to 29.970. Set Telecine (Mpeg2Telecine) to Hard (hard) to produce a 29.97i output from a 23.976 input. Set it to Soft (soft) to produce 23.976 output and leave converstion to the player.
    */
  object Mpeg2TelecineEnum {
    val NONE = "NONE"
    val SOFT = "SOFT"
    val HARD = "HARD"

    val values = js.Object.freeze(js.Array(NONE, SOFT, HARD))
  }

  /**
    * Adjust quantization within each frame based on temporal variation of content complexity.
    */
  object Mpeg2TemporalAdaptiveQuantizationEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings across a Microsoft Smooth output group into a single audio stream.
    */
  object MsSmoothAudioDeduplicationEnum {
    val COMBINE_DUPLICATE_STREAMS = "COMBINE_DUPLICATE_STREAMS"
    val NONE                      = "NONE"

    val values = js.Object.freeze(js.Array(COMBINE_DUPLICATE_STREAMS, NONE))
  }

  /**
    * If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to specify the value SpekeKeyProvider.
    */
  @js.native
  trait MsSmoothEncryptionSettings extends js.Object {
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProvider]
  }

  object MsSmoothEncryptionSettings {
    @inline
    def apply(
        SpekeKeyProvider: js.UndefOr[SpekeKeyProvider] = js.undefined
    ): MsSmoothEncryptionSettings = {
      val __obj = js.Dynamic.literal()
      SpekeKeyProvider.foreach(__v => __obj.updateDynamic("SpekeKeyProvider")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MsSmoothEncryptionSettings]
    }
  }

  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to MS_SMOOTH_GROUP_SETTINGS.
    */
  @js.native
  trait MsSmoothGroupSettings extends js.Object {
    var AudioDeduplication: js.UndefOr[MsSmoothAudioDeduplication]
    var Destination: js.UndefOr[__stringPatternS3]
    var DestinationSettings: js.UndefOr[DestinationSettings]
    var Encryption: js.UndefOr[MsSmoothEncryptionSettings]
    var FragmentLength: js.UndefOr[__integerMin1Max2147483647]
    var ManifestEncoding: js.UndefOr[MsSmoothManifestEncoding]
  }

  object MsSmoothGroupSettings {
    @inline
    def apply(
        AudioDeduplication: js.UndefOr[MsSmoothAudioDeduplication] = js.undefined,
        Destination: js.UndefOr[__stringPatternS3] = js.undefined,
        DestinationSettings: js.UndefOr[DestinationSettings] = js.undefined,
        Encryption: js.UndefOr[MsSmoothEncryptionSettings] = js.undefined,
        FragmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        ManifestEncoding: js.UndefOr[MsSmoothManifestEncoding] = js.undefined
    ): MsSmoothGroupSettings = {
      val __obj = js.Dynamic.literal()
      AudioDeduplication.foreach(__v => __obj.updateDynamic("AudioDeduplication")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      DestinationSettings.foreach(__v => __obj.updateDynamic("DestinationSettings")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      FragmentLength.foreach(__v => __obj.updateDynamic("FragmentLength")(__v.asInstanceOf[js.Any]))
      ManifestEncoding.foreach(__v => __obj.updateDynamic("ManifestEncoding")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MsSmoothGroupSettings]
    }
  }

  /**
    * Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding format for the server and client manifest. Valid options are utf8 and utf16.
    */
  object MsSmoothManifestEncodingEnum {
    val UTF8  = "UTF8"
    val UTF16 = "UTF16"

    val values = js.Object.freeze(js.Array(UTF8, UTF16))
  }

  /**
    * Settings for your Nielsen configuration. If you don't do Nielsen measurement and analytics, ignore these settings. When you enable Nielsen configuration (nielsenConfiguration), MediaConvert enables PCM to ID3 tagging for all outputs in the job. To enable Nielsen configuration programmatically, include an instance of nielsenConfiguration in your JSON job specification. Even if you don't include any children of nielsenConfiguration, you still enable the setting.
    */
  @js.native
  trait NielsenConfiguration extends js.Object {
    var BreakoutCode: js.UndefOr[__integerMin0Max0]
    var DistributorId: js.UndefOr[__string]
  }

  object NielsenConfiguration {
    @inline
    def apply(
        BreakoutCode: js.UndefOr[__integerMin0Max0] = js.undefined,
        DistributorId: js.UndefOr[__string] = js.undefined
    ): NielsenConfiguration = {
      val __obj = js.Dynamic.literal()
      BreakoutCode.foreach(__v => __obj.updateDynamic("BreakoutCode")(__v.asInstanceOf[js.Any]))
      DistributorId.foreach(__v => __obj.updateDynamic("DistributorId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NielsenConfiguration]
    }
  }

  /**
    * Enable the Noise reducer (NoiseReducer) feature to remove noise from your video output if necessary. Enable or disable this feature for each output individually. This setting is disabled by default. When you enable Noise reducer (NoiseReducer), you must also select a value for Noise reducer filter (NoiseReducerFilter).
    */
  @js.native
  trait NoiseReducer extends js.Object {
    var Filter: js.UndefOr[NoiseReducerFilter]
    var FilterSettings: js.UndefOr[NoiseReducerFilterSettings]
    var SpatialFilterSettings: js.UndefOr[NoiseReducerSpatialFilterSettings]
    var TemporalFilterSettings: js.UndefOr[NoiseReducerTemporalFilterSettings]
  }

  object NoiseReducer {
    @inline
    def apply(
        Filter: js.UndefOr[NoiseReducerFilter] = js.undefined,
        FilterSettings: js.UndefOr[NoiseReducerFilterSettings] = js.undefined,
        SpatialFilterSettings: js.UndefOr[NoiseReducerSpatialFilterSettings] = js.undefined,
        TemporalFilterSettings: js.UndefOr[NoiseReducerTemporalFilterSettings] = js.undefined
    ): NoiseReducer = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      FilterSettings.foreach(__v => __obj.updateDynamic("FilterSettings")(__v.asInstanceOf[js.Any]))
      SpatialFilterSettings.foreach(__v => __obj.updateDynamic("SpatialFilterSettings")(__v.asInstanceOf[js.Any]))
      TemporalFilterSettings.foreach(__v => __obj.updateDynamic("TemporalFilterSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NoiseReducer]
    }
  }

  /**
    * Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering functions. To use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral preserves edges while reducing noise. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) do convolution filtering. * Conserve does min/max noise reduction. * Spatial does frequency-domain filtering based on JND principles. * Temporal optimizes video quality for complex motion.
    */
  object NoiseReducerFilterEnum {
    val BILATERAL = "BILATERAL"
    val MEAN      = "MEAN"
    val GAUSSIAN  = "GAUSSIAN"
    val LANCZOS   = "LANCZOS"
    val SHARPEN   = "SHARPEN"
    val CONSERVE  = "CONSERVE"
    val SPATIAL   = "SPATIAL"
    val TEMPORAL  = "TEMPORAL"

    val values = js.Object.freeze(js.Array(BILATERAL, MEAN, GAUSSIAN, LANCZOS, SHARPEN, CONSERVE, SPATIAL, TEMPORAL))
  }

  /**
    * Settings for a noise reducer filter
    */
  @js.native
  trait NoiseReducerFilterSettings extends js.Object {
    var Strength: js.UndefOr[__integerMin0Max3]
  }

  object NoiseReducerFilterSettings {
    @inline
    def apply(
        Strength: js.UndefOr[__integerMin0Max3] = js.undefined
    ): NoiseReducerFilterSettings = {
      val __obj = js.Dynamic.literal()
      Strength.foreach(__v => __obj.updateDynamic("Strength")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NoiseReducerFilterSettings]
    }
  }

  /**
    * Noise reducer filter settings for spatial filter.
    */
  @js.native
  trait NoiseReducerSpatialFilterSettings extends js.Object {
    var PostFilterSharpenStrength: js.UndefOr[__integerMin0Max3]
    var Speed: js.UndefOr[__integerMinNegative2Max3]
    var Strength: js.UndefOr[__integerMin0Max16]
  }

  object NoiseReducerSpatialFilterSettings {
    @inline
    def apply(
        PostFilterSharpenStrength: js.UndefOr[__integerMin0Max3] = js.undefined,
        Speed: js.UndefOr[__integerMinNegative2Max3] = js.undefined,
        Strength: js.UndefOr[__integerMin0Max16] = js.undefined
    ): NoiseReducerSpatialFilterSettings = {
      val __obj = js.Dynamic.literal()
      PostFilterSharpenStrength.foreach(
        __v => __obj.updateDynamic("PostFilterSharpenStrength")(__v.asInstanceOf[js.Any])
      )
      Speed.foreach(__v => __obj.updateDynamic("Speed")(__v.asInstanceOf[js.Any]))
      Strength.foreach(__v => __obj.updateDynamic("Strength")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NoiseReducerSpatialFilterSettings]
    }
  }

  /**
    * Noise reducer filter settings for temporal filter.
    */
  @js.native
  trait NoiseReducerTemporalFilterSettings extends js.Object {
    var AggressiveMode: js.UndefOr[__integerMin0Max4]
    var Speed: js.UndefOr[__integerMinNegative1Max3]
    var Strength: js.UndefOr[__integerMin0Max16]
  }

  object NoiseReducerTemporalFilterSettings {
    @inline
    def apply(
        AggressiveMode: js.UndefOr[__integerMin0Max4] = js.undefined,
        Speed: js.UndefOr[__integerMinNegative1Max3] = js.undefined,
        Strength: js.UndefOr[__integerMin0Max16] = js.undefined
    ): NoiseReducerTemporalFilterSettings = {
      val __obj = js.Dynamic.literal()
      AggressiveMode.foreach(__v => __obj.updateDynamic("AggressiveMode")(__v.asInstanceOf[js.Any]))
      Speed.foreach(__v => __obj.updateDynamic("Speed")(__v.asInstanceOf[js.Any]))
      Strength.foreach(__v => __obj.updateDynamic("Strength")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NoiseReducerTemporalFilterSettings]
    }
  }

  /**
    * When you request lists of resources, you can optionally specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource.
    */
  object OrderEnum {
    val ASCENDING  = "ASCENDING"
    val DESCENDING = "DESCENDING"

    val values = js.Object.freeze(js.Array(ASCENDING, DESCENDING))
  }

  /**
    * An output object describes the settings for a single output file or stream in an output group.
    */
  @js.native
  trait Output extends js.Object {
    var AudioDescriptions: js.UndefOr[__listOfAudioDescription]
    var CaptionDescriptions: js.UndefOr[__listOfCaptionDescription]
    var ContainerSettings: js.UndefOr[ContainerSettings]
    var Extension: js.UndefOr[__string]
    var NameModifier: js.UndefOr[__stringMin1]
    var OutputSettings: js.UndefOr[OutputSettings]
    var Preset: js.UndefOr[__stringMin0]
    var VideoDescription: js.UndefOr[VideoDescription]
  }

  object Output {
    @inline
    def apply(
        AudioDescriptions: js.UndefOr[__listOfAudioDescription] = js.undefined,
        CaptionDescriptions: js.UndefOr[__listOfCaptionDescription] = js.undefined,
        ContainerSettings: js.UndefOr[ContainerSettings] = js.undefined,
        Extension: js.UndefOr[__string] = js.undefined,
        NameModifier: js.UndefOr[__stringMin1] = js.undefined,
        OutputSettings: js.UndefOr[OutputSettings] = js.undefined,
        Preset: js.UndefOr[__stringMin0] = js.undefined,
        VideoDescription: js.UndefOr[VideoDescription] = js.undefined
    ): Output = {
      val __obj = js.Dynamic.literal()
      AudioDescriptions.foreach(__v => __obj.updateDynamic("AudioDescriptions")(__v.asInstanceOf[js.Any]))
      CaptionDescriptions.foreach(__v => __obj.updateDynamic("CaptionDescriptions")(__v.asInstanceOf[js.Any]))
      ContainerSettings.foreach(__v => __obj.updateDynamic("ContainerSettings")(__v.asInstanceOf[js.Any]))
      Extension.foreach(__v => __obj.updateDynamic("Extension")(__v.asInstanceOf[js.Any]))
      NameModifier.foreach(__v => __obj.updateDynamic("NameModifier")(__v.asInstanceOf[js.Any]))
      OutputSettings.foreach(__v => __obj.updateDynamic("OutputSettings")(__v.asInstanceOf[js.Any]))
      Preset.foreach(__v => __obj.updateDynamic("Preset")(__v.asInstanceOf[js.Any]))
      VideoDescription.foreach(__v => __obj.updateDynamic("VideoDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Output]
    }
  }

  /**
    * OutputChannel mapping settings.
    */
  @js.native
  trait OutputChannelMapping extends js.Object {
    var InputChannels: js.UndefOr[__listOf__integerMinNegative60Max6]
  }

  object OutputChannelMapping {
    @inline
    def apply(
        InputChannels: js.UndefOr[__listOf__integerMinNegative60Max6] = js.undefined
    ): OutputChannelMapping = {
      val __obj = js.Dynamic.literal()
      InputChannels.foreach(__v => __obj.updateDynamic("InputChannels")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputChannelMapping]
    }
  }

  /**
    * Details regarding output
    */
  @js.native
  trait OutputDetail extends js.Object {
    var DurationInMs: js.UndefOr[__integer]
    var VideoDetails: js.UndefOr[VideoDetail]
  }

  object OutputDetail {
    @inline
    def apply(
        DurationInMs: js.UndefOr[__integer] = js.undefined,
        VideoDetails: js.UndefOr[VideoDetail] = js.undefined
    ): OutputDetail = {
      val __obj = js.Dynamic.literal()
      DurationInMs.foreach(__v => __obj.updateDynamic("DurationInMs")(__v.asInstanceOf[js.Any]))
      VideoDetails.foreach(__v => __obj.updateDynamic("VideoDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputDetail]
    }
  }

  /**
    * Group of outputs
    */
  @js.native
  trait OutputGroup extends js.Object {
    var CustomName: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var OutputGroupSettings: js.UndefOr[OutputGroupSettings]
    var Outputs: js.UndefOr[__listOfOutput]
  }

  object OutputGroup {
    @inline
    def apply(
        CustomName: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        OutputGroupSettings: js.UndefOr[OutputGroupSettings] = js.undefined,
        Outputs: js.UndefOr[__listOfOutput] = js.undefined
    ): OutputGroup = {
      val __obj = js.Dynamic.literal()
      CustomName.foreach(__v => __obj.updateDynamic("CustomName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OutputGroupSettings.foreach(__v => __obj.updateDynamic("OutputGroupSettings")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputGroup]
    }
  }

  /**
    * Contains details about the output groups specified in the job settings.
    */
  @js.native
  trait OutputGroupDetail extends js.Object {
    var OutputDetails: js.UndefOr[__listOfOutputDetail]
  }

  object OutputGroupDetail {
    @inline
    def apply(
        OutputDetails: js.UndefOr[__listOfOutputDetail] = js.undefined
    ): OutputGroupDetail = {
      val __obj = js.Dynamic.literal()
      OutputDetails.foreach(__v => __obj.updateDynamic("OutputDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputGroupDetail]
    }
  }

  /**
    * Output Group settings, including type
    */
  @js.native
  trait OutputGroupSettings extends js.Object {
    var CmafGroupSettings: js.UndefOr[CmafGroupSettings]
    var DashIsoGroupSettings: js.UndefOr[DashIsoGroupSettings]
    var FileGroupSettings: js.UndefOr[FileGroupSettings]
    var HlsGroupSettings: js.UndefOr[HlsGroupSettings]
    var MsSmoothGroupSettings: js.UndefOr[MsSmoothGroupSettings]
    var Type: js.UndefOr[OutputGroupType]
  }

  object OutputGroupSettings {
    @inline
    def apply(
        CmafGroupSettings: js.UndefOr[CmafGroupSettings] = js.undefined,
        DashIsoGroupSettings: js.UndefOr[DashIsoGroupSettings] = js.undefined,
        FileGroupSettings: js.UndefOr[FileGroupSettings] = js.undefined,
        HlsGroupSettings: js.UndefOr[HlsGroupSettings] = js.undefined,
        MsSmoothGroupSettings: js.UndefOr[MsSmoothGroupSettings] = js.undefined,
        Type: js.UndefOr[OutputGroupType] = js.undefined
    ): OutputGroupSettings = {
      val __obj = js.Dynamic.literal()
      CmafGroupSettings.foreach(__v => __obj.updateDynamic("CmafGroupSettings")(__v.asInstanceOf[js.Any]))
      DashIsoGroupSettings.foreach(__v => __obj.updateDynamic("DashIsoGroupSettings")(__v.asInstanceOf[js.Any]))
      FileGroupSettings.foreach(__v => __obj.updateDynamic("FileGroupSettings")(__v.asInstanceOf[js.Any]))
      HlsGroupSettings.foreach(__v => __obj.updateDynamic("HlsGroupSettings")(__v.asInstanceOf[js.Any]))
      MsSmoothGroupSettings.foreach(__v => __obj.updateDynamic("MsSmoothGroupSettings")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputGroupSettings]
    }
  }

  /**
    * Type of output group (File group, Apple HLS, DASH ISO, Microsoft Smooth Streaming, CMAF)
    */
  object OutputGroupTypeEnum {
    val HLS_GROUP_SETTINGS       = "HLS_GROUP_SETTINGS"
    val DASH_ISO_GROUP_SETTINGS  = "DASH_ISO_GROUP_SETTINGS"
    val FILE_GROUP_SETTINGS      = "FILE_GROUP_SETTINGS"
    val MS_SMOOTH_GROUP_SETTINGS = "MS_SMOOTH_GROUP_SETTINGS"
    val CMAF_GROUP_SETTINGS      = "CMAF_GROUP_SETTINGS"

    val values = js.Object.freeze(
      js.Array(
        HLS_GROUP_SETTINGS,
        DASH_ISO_GROUP_SETTINGS,
        FILE_GROUP_SETTINGS,
        MS_SMOOTH_GROUP_SETTINGS,
        CMAF_GROUP_SETTINGS
      )
    )
  }

  /**
    * Selects method of inserting SDT information into output stream.  "Follow input SDT" copies SDT information from input stream to  output stream. "Follow input SDT if present" copies SDT information from  input stream to output stream if SDT information is present in the input, otherwise it will fall back on the user-defined values. Enter "SDT  Manually" means user will enter the SDT information. "No SDT" means output  stream will not contain SDT information.
    */
  object OutputSdtEnum {
    val SDT_FOLLOW            = "SDT_FOLLOW"
    val SDT_FOLLOW_IF_PRESENT = "SDT_FOLLOW_IF_PRESENT"
    val SDT_MANUAL            = "SDT_MANUAL"
    val SDT_NONE              = "SDT_NONE"

    val values = js.Object.freeze(js.Array(SDT_FOLLOW, SDT_FOLLOW_IF_PRESENT, SDT_MANUAL, SDT_NONE))
  }

  /**
    * Specific settings for this type of output.
    */
  @js.native
  trait OutputSettings extends js.Object {
    var HlsSettings: js.UndefOr[HlsSettings]
  }

  object OutputSettings {
    @inline
    def apply(
        HlsSettings: js.UndefOr[HlsSettings] = js.undefined
    ): OutputSettings = {
      val __obj = js.Dynamic.literal()
      HlsSettings.foreach(__v => __obj.updateDynamic("HlsSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputSettings]
    }
  }

  /**
    * A preset is a collection of preconfigured media conversion settings that you want MediaConvert to apply to the output during the conversion process.
    */
  @js.native
  trait Preset extends js.Object {
    var Name: __string
    var Settings: PresetSettings
    var Arn: js.UndefOr[__string]
    var Category: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__timestampUnix]
    var Description: js.UndefOr[__string]
    var LastUpdated: js.UndefOr[__timestampUnix]
    var Type: js.UndefOr[Type]
  }

  object Preset {
    @inline
    def apply(
        Name: __string,
        Settings: PresetSettings,
        Arn: js.UndefOr[__string] = js.undefined,
        Category: js.UndefOr[__string] = js.undefined,
        CreatedAt: js.UndefOr[__timestampUnix] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        LastUpdated: js.UndefOr[__timestampUnix] = js.undefined,
        Type: js.UndefOr[Type] = js.undefined
    ): Preset = {
      val __obj = js.Dynamic.literal(
        "Name"     -> Name.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any]
      )

      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Preset]
    }
  }

  /**
    * Optional. When you request a list of presets, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
    */
  object PresetListByEnum {
    val NAME          = "NAME"
    val CREATION_DATE = "CREATION_DATE"
    val SYSTEM        = "SYSTEM"

    val values = js.Object.freeze(js.Array(NAME, CREATION_DATE, SYSTEM))
  }

  /**
    * Settings for preset
    */
  @js.native
  trait PresetSettings extends js.Object {
    var AudioDescriptions: js.UndefOr[__listOfAudioDescription]
    var CaptionDescriptions: js.UndefOr[__listOfCaptionDescriptionPreset]
    var ContainerSettings: js.UndefOr[ContainerSettings]
    var VideoDescription: js.UndefOr[VideoDescription]
  }

  object PresetSettings {
    @inline
    def apply(
        AudioDescriptions: js.UndefOr[__listOfAudioDescription] = js.undefined,
        CaptionDescriptions: js.UndefOr[__listOfCaptionDescriptionPreset] = js.undefined,
        ContainerSettings: js.UndefOr[ContainerSettings] = js.undefined,
        VideoDescription: js.UndefOr[VideoDescription] = js.undefined
    ): PresetSettings = {
      val __obj = js.Dynamic.literal()
      AudioDescriptions.foreach(__v => __obj.updateDynamic("AudioDescriptions")(__v.asInstanceOf[js.Any]))
      CaptionDescriptions.foreach(__v => __obj.updateDynamic("CaptionDescriptions")(__v.asInstanceOf[js.Any]))
      ContainerSettings.foreach(__v => __obj.updateDynamic("ContainerSettings")(__v.asInstanceOf[js.Any]))
      VideoDescription.foreach(__v => __obj.updateDynamic("VideoDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PresetSettings]
    }
  }

  /**
    * Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment.
    */
  object PricingPlanEnum {
    val ON_DEMAND = "ON_DEMAND"
    val RESERVED  = "RESERVED"

    val values = js.Object.freeze(js.Array(ON_DEMAND, RESERVED))
  }

  /**
    * Use Profile (ProResCodecProfile) to specifiy the type of Apple ProRes codec to use for this output.
    */
  object ProresCodecProfileEnum {
    val APPLE_PRORES_422       = "APPLE_PRORES_422"
    val APPLE_PRORES_422_HQ    = "APPLE_PRORES_422_HQ"
    val APPLE_PRORES_422_LT    = "APPLE_PRORES_422_LT"
    val APPLE_PRORES_422_PROXY = "APPLE_PRORES_422_PROXY"

    val values =
      js.Object.freeze(js.Array(APPLE_PRORES_422, APPLE_PRORES_422_HQ, APPLE_PRORES_422_LT, APPLE_PRORES_422_PROXY))
  }

  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job sepecification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  object ProresFramerateControlEnum {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE"
    val SPECIFIED              = "SPECIFIED"

    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
    */
  object ProresFramerateConversionAlgorithmEnum {
    val DUPLICATE_DROP = "DUPLICATE_DROP"
    val INTERPOLATE    = "INTERPOLATE"

    val values = js.Object.freeze(js.Array(DUPLICATE_DROP, INTERPOLATE))
  }

  /**
    * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior depends on the input scan type.
    *   - If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first".
    *   - If the source is progressive, the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose.
    */
  object ProresInterlaceModeEnum {
    val PROGRESSIVE         = "PROGRESSIVE"
    val TOP_FIELD           = "TOP_FIELD"
    val BOTTOM_FIELD        = "BOTTOM_FIELD"
    val FOLLOW_TOP_FIELD    = "FOLLOW_TOP_FIELD"
    val FOLLOW_BOTTOM_FIELD = "FOLLOW_BOTTOM_FIELD"

    val values = js.Object.freeze(js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD))
  }

  /**
    * Use (ProresParControl) to specify how the service determines the pixel aspect ratio. Set to Follow source (INITIALIZE_FROM_SOURCE) to use the pixel aspect ratio from the input.  To specify a different pixel aspect ratio: Using the console, choose it from the dropdown menu. Using the API, set ProresParControl to (SPECIFIED) and provide  for (ParNumerator) and (ParDenominator).
    */
  object ProresParControlEnum {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE"
    val SPECIFIED              = "SPECIFIED"

    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value PRORES.
    */
  @js.native
  trait ProresSettings extends js.Object {
    var CodecProfile: js.UndefOr[ProresCodecProfile]
    var FramerateControl: js.UndefOr[ProresFramerateControl]
    var FramerateConversionAlgorithm: js.UndefOr[ProresFramerateConversionAlgorithm]
    var FramerateDenominator: js.UndefOr[__integerMin1Max2147483647]
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483647]
    var InterlaceMode: js.UndefOr[ProresInterlaceMode]
    var ParControl: js.UndefOr[ProresParControl]
    var ParDenominator: js.UndefOr[__integerMin1Max2147483647]
    var ParNumerator: js.UndefOr[__integerMin1Max2147483647]
    var SlowPal: js.UndefOr[ProresSlowPal]
    var Telecine: js.UndefOr[ProresTelecine]
  }

  object ProresSettings {
    @inline
    def apply(
        CodecProfile: js.UndefOr[ProresCodecProfile] = js.undefined,
        FramerateControl: js.UndefOr[ProresFramerateControl] = js.undefined,
        FramerateConversionAlgorithm: js.UndefOr[ProresFramerateConversionAlgorithm] = js.undefined,
        FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        InterlaceMode: js.UndefOr[ProresInterlaceMode] = js.undefined,
        ParControl: js.UndefOr[ProresParControl] = js.undefined,
        ParDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        ParNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        SlowPal: js.UndefOr[ProresSlowPal] = js.undefined,
        Telecine: js.UndefOr[ProresTelecine] = js.undefined
    ): ProresSettings = {
      val __obj = js.Dynamic.literal()
      CodecProfile.foreach(__v => __obj.updateDynamic("CodecProfile")(__v.asInstanceOf[js.Any]))
      FramerateControl.foreach(__v => __obj.updateDynamic("FramerateControl")(__v.asInstanceOf[js.Any]))
      FramerateConversionAlgorithm.foreach(
        __v => __obj.updateDynamic("FramerateConversionAlgorithm")(__v.asInstanceOf[js.Any])
      )
      FramerateDenominator.foreach(__v => __obj.updateDynamic("FramerateDenominator")(__v.asInstanceOf[js.Any]))
      FramerateNumerator.foreach(__v => __obj.updateDynamic("FramerateNumerator")(__v.asInstanceOf[js.Any]))
      InterlaceMode.foreach(__v => __obj.updateDynamic("InterlaceMode")(__v.asInstanceOf[js.Any]))
      ParControl.foreach(__v => __obj.updateDynamic("ParControl")(__v.asInstanceOf[js.Any]))
      ParDenominator.foreach(__v => __obj.updateDynamic("ParDenominator")(__v.asInstanceOf[js.Any]))
      ParNumerator.foreach(__v => __obj.updateDynamic("ParNumerator")(__v.asInstanceOf[js.Any]))
      SlowPal.foreach(__v => __obj.updateDynamic("SlowPal")(__v.asInstanceOf[js.Any]))
      Telecine.foreach(__v => __obj.updateDynamic("Telecine")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProresSettings]
    }
  }

  /**
    * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
    */
  object ProresSlowPalEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Only use Telecine (ProresTelecine) when you set Framerate (Framerate) to 29.970. Set Telecine (ProresTelecine) to Hard (hard) to produce a 29.97i output from a 23.976 input. Set it to Soft (soft) to produce 23.976 output and leave converstion to the player.
    */
  object ProresTelecineEnum {
    val NONE = "NONE"
    val HARD = "HARD"

    val values = js.Object.freeze(js.Array(NONE, HARD))
  }

  /**
    * You can use queues to manage the resources that are available to your AWS account for running multiple transcoding jobs at the same time. If you don't specify a queue, the service sends all jobs through the default queue. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html.
    */
  @js.native
  trait Queue extends js.Object {
    var Name: __string
    var Arn: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__timestampUnix]
    var Description: js.UndefOr[__string]
    var LastUpdated: js.UndefOr[__timestampUnix]
    var PricingPlan: js.UndefOr[PricingPlan]
    var ProgressingJobsCount: js.UndefOr[__integer]
    var ReservationPlan: js.UndefOr[ReservationPlan]
    var Status: js.UndefOr[QueueStatus]
    var SubmittedJobsCount: js.UndefOr[__integer]
    var Type: js.UndefOr[Type]
  }

  object Queue {
    @inline
    def apply(
        Name: __string,
        Arn: js.UndefOr[__string] = js.undefined,
        CreatedAt: js.UndefOr[__timestampUnix] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        LastUpdated: js.UndefOr[__timestampUnix] = js.undefined,
        PricingPlan: js.UndefOr[PricingPlan] = js.undefined,
        ProgressingJobsCount: js.UndefOr[__integer] = js.undefined,
        ReservationPlan: js.UndefOr[ReservationPlan] = js.undefined,
        Status: js.UndefOr[QueueStatus] = js.undefined,
        SubmittedJobsCount: js.UndefOr[__integer] = js.undefined,
        Type: js.UndefOr[Type] = js.undefined
    ): Queue = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      PricingPlan.foreach(__v => __obj.updateDynamic("PricingPlan")(__v.asInstanceOf[js.Any]))
      ProgressingJobsCount.foreach(__v => __obj.updateDynamic("ProgressingJobsCount")(__v.asInstanceOf[js.Any]))
      ReservationPlan.foreach(__v => __obj.updateDynamic("ReservationPlan")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SubmittedJobsCount.foreach(__v => __obj.updateDynamic("SubmittedJobsCount")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Queue]
    }
  }

  /**
    * Optional. When you request a list of queues, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by creation date.
    */
  object QueueListByEnum {
    val NAME          = "NAME"
    val CREATION_DATE = "CREATION_DATE"

    val values = js.Object.freeze(js.Array(NAME, CREATION_DATE))
  }

  /**
    * Queues can be ACTIVE or PAUSED. If you pause a queue, jobs in that queue won't begin. Jobs that are running when you pause a queue continue to run until they finish or result in an error.
    */
  object QueueStatusEnum {
    val ACTIVE = "ACTIVE"
    val PAUSED = "PAUSED"

    val values = js.Object.freeze(js.Array(ACTIVE, PAUSED))
  }

  /**
    * Use Rectangle to identify a specific area of the video frame.
    */
  @js.native
  trait Rectangle extends js.Object {
    var Height: js.UndefOr[__integerMin2Max2147483647]
    var Width: js.UndefOr[__integerMin2Max2147483647]
    var X: js.UndefOr[__integerMin0Max2147483647]
    var Y: js.UndefOr[__integerMin0Max2147483647]
  }

  object Rectangle {
    @inline
    def apply(
        Height: js.UndefOr[__integerMin2Max2147483647] = js.undefined,
        Width: js.UndefOr[__integerMin2Max2147483647] = js.undefined,
        X: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        Y: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    ): Rectangle = {
      val __obj = js.Dynamic.literal()
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      X.foreach(__v => __obj.updateDynamic("X")(__v.asInstanceOf[js.Any]))
      Y.foreach(__v => __obj.updateDynamic("Y")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Rectangle]
    }
  }

  /**
    * Use Manual audio remixing (RemixSettings) to adjust audio levels for each audio channel in each output of your job. With audio remixing, you can output more or fewer audio channels than your input audio source provides.
    */
  @js.native
  trait RemixSettings extends js.Object {
    var ChannelMapping: js.UndefOr[ChannelMapping]
    var ChannelsIn: js.UndefOr[__integerMin1Max16]
    var ChannelsOut: js.UndefOr[__integerMin1Max8]
  }

  object RemixSettings {
    @inline
    def apply(
        ChannelMapping: js.UndefOr[ChannelMapping] = js.undefined,
        ChannelsIn: js.UndefOr[__integerMin1Max16] = js.undefined,
        ChannelsOut: js.UndefOr[__integerMin1Max8] = js.undefined
    ): RemixSettings = {
      val __obj = js.Dynamic.literal()
      ChannelMapping.foreach(__v => __obj.updateDynamic("ChannelMapping")(__v.asInstanceOf[js.Any]))
      ChannelsIn.foreach(__v => __obj.updateDynamic("ChannelsIn")(__v.asInstanceOf[js.Any]))
      ChannelsOut.foreach(__v => __obj.updateDynamic("ChannelsOut")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemixSettings]
    }
  }

  /**
    * Specifies whether the term of your reserved queue pricing plan is automatically extended (AUTO_RENEW) or expires (EXPIRE) at the end of the term.
    */
  object RenewalTypeEnum {
    val AUTO_RENEW = "AUTO_RENEW"
    val EXPIRE     = "EXPIRE"

    val values = js.Object.freeze(js.Array(AUTO_RENEW, EXPIRE))
  }

  /**
    * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to on-demand queues.
    */
  @js.native
  trait ReservationPlan extends js.Object {
    var Commitment: js.UndefOr[Commitment]
    var ExpiresAt: js.UndefOr[__timestampUnix]
    var PurchasedAt: js.UndefOr[__timestampUnix]
    var RenewalType: js.UndefOr[RenewalType]
    var ReservedSlots: js.UndefOr[__integer]
    var Status: js.UndefOr[ReservationPlanStatus]
  }

  object ReservationPlan {
    @inline
    def apply(
        Commitment: js.UndefOr[Commitment] = js.undefined,
        ExpiresAt: js.UndefOr[__timestampUnix] = js.undefined,
        PurchasedAt: js.UndefOr[__timestampUnix] = js.undefined,
        RenewalType: js.UndefOr[RenewalType] = js.undefined,
        ReservedSlots: js.UndefOr[__integer] = js.undefined,
        Status: js.UndefOr[ReservationPlanStatus] = js.undefined
    ): ReservationPlan = {
      val __obj = js.Dynamic.literal()
      Commitment.foreach(__v => __obj.updateDynamic("Commitment")(__v.asInstanceOf[js.Any]))
      ExpiresAt.foreach(__v => __obj.updateDynamic("ExpiresAt")(__v.asInstanceOf[js.Any]))
      PurchasedAt.foreach(__v => __obj.updateDynamic("PurchasedAt")(__v.asInstanceOf[js.Any]))
      RenewalType.foreach(__v => __obj.updateDynamic("RenewalType")(__v.asInstanceOf[js.Any]))
      ReservedSlots.foreach(__v => __obj.updateDynamic("ReservedSlots")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservationPlan]
    }
  }

  /**
    * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to on-demand queues.
    */
  @js.native
  trait ReservationPlanSettings extends js.Object {
    var Commitment: Commitment
    var RenewalType: RenewalType
    var ReservedSlots: __integer
  }

  object ReservationPlanSettings {
    @inline
    def apply(
        Commitment: Commitment,
        RenewalType: RenewalType,
        ReservedSlots: __integer
    ): ReservationPlanSettings = {
      val __obj = js.Dynamic.literal(
        "Commitment"    -> Commitment.asInstanceOf[js.Any],
        "RenewalType"   -> RenewalType.asInstanceOf[js.Any],
        "ReservedSlots" -> ReservedSlots.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ReservationPlanSettings]
    }
  }

  /**
    * Specifies whether the pricing plan for your reserved queue is ACTIVE or EXPIRED.
    */
  object ReservationPlanStatusEnum {
    val ACTIVE  = "ACTIVE"
    val EXPIRED = "EXPIRED"

    val values = js.Object.freeze(js.Array(ACTIVE, EXPIRED))
  }

  /**
    * The Amazon Resource Name (ARN) and tags for an AWS Elemental MediaConvert resource.
    */
  @js.native
  trait ResourceTags extends js.Object {
    var Arn: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object ResourceTags {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): ResourceTags = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceTags]
    }
  }

  /**
    * Use Respond to AFD (RespondToAfd) to specify how the service changes the video itself in response to AFD values in the input. * Choose Respond to clip the input video frame according to the AFD value, input display aspect ratio, and output display aspect ratio. * Choose Passthrough to include the input AFD values. Do not choose this when AfdSignaling is set to (NONE). A preferred implementation of this workflow is to set RespondToAfd to (NONE) and set AfdSignaling to (AUTO). * Choose None to remove all input AFD values from this output.
    */
  object RespondToAfdEnum {
    val NONE        = "NONE"
    val RESPOND     = "RESPOND"
    val PASSTHROUGH = "PASSTHROUGH"

    val values = js.Object.freeze(js.Array(NONE, RESPOND, PASSTHROUGH))
  }

  /**
    * Settings associated with S3 destination
    */
  @js.native
  trait S3DestinationSettings extends js.Object {
    var Encryption: js.UndefOr[S3EncryptionSettings]
  }

  object S3DestinationSettings {
    @inline
    def apply(
        Encryption: js.UndefOr[S3EncryptionSettings] = js.undefined
    ): S3DestinationSettings = {
      val __obj = js.Dynamic.literal()
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3DestinationSettings]
    }
  }

  /**
    * Settings for how your job outputs are encrypted as they are uploaded to Amazon S3.
    */
  @js.native
  trait S3EncryptionSettings extends js.Object {
    var EncryptionType: js.UndefOr[S3ServerSideEncryptionType]
    var KmsKeyArn: js.UndefOr[
      __stringPatternArnAwsUsGovCnKmsAZ26EastWestCentralNorthSouthEastWest1912D12KeyAFAF098AFAF094AFAF094AFAF094AFAF0912
    ]
  }

  object S3EncryptionSettings {
    @inline
    def apply(
        EncryptionType: js.UndefOr[S3ServerSideEncryptionType] = js.undefined,
        KmsKeyArn: js.UndefOr[
          __stringPatternArnAwsUsGovCnKmsAZ26EastWestCentralNorthSouthEastWest1912D12KeyAFAF098AFAF094AFAF094AFAF094AFAF0912
        ] = js.undefined
    ): S3EncryptionSettings = {
      val __obj = js.Dynamic.literal()
      EncryptionType.foreach(__v => __obj.updateDynamic("EncryptionType")(__v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3EncryptionSettings]
    }
  }

  /**
    * Specify how you want your data keys managed. AWS uses data keys to encrypt your content. AWS also encrypts the data keys themselves, using a customer master key (CMK), and then stores the encrypted data keys alongside your encrypted content. Use this setting to specify which AWS service manages the CMK. For simplest set up, choose Amazon S3 (SERVER_SIDE_ENCRYPTION_S3). If you want your master key to be managed by AWS Key Management Service (KMS), choose AWS KMS (SERVER_SIDE_ENCRYPTION_KMS). By default, when you choose AWS KMS, KMS uses the AWS managed customer master key (CMK) associated with Amazon S3 to encrypt your data keys. You can optionally choose to specify a different, customer managed CMK. Do so by specifying the Amazon Resource Name (ARN) of the key for the setting  KMS ARN (kmsKeyArn).
    */
  object S3ServerSideEncryptionTypeEnum {
    val SERVER_SIDE_ENCRYPTION_S3  = "SERVER_SIDE_ENCRYPTION_S3"
    val SERVER_SIDE_ENCRYPTION_KMS = "SERVER_SIDE_ENCRYPTION_KMS"

    val values = js.Object.freeze(js.Array(SERVER_SIDE_ENCRYPTION_S3, SERVER_SIDE_ENCRYPTION_KMS))
  }

  /**
    * Specify how the service handles outputs that have a different aspect ratio from the input aspect ratio. Choose Stretch to output (STRETCH_TO_OUTPUT) to have the service stretch your video image to fit. Keep the setting Default (DEFAULT) to have the service letterbox your video instead. This setting overrides any value that you specify for the setting Selection placement (position) in this output.
    */
  object ScalingBehaviorEnum {
    val DEFAULT           = "DEFAULT"
    val STRETCH_TO_OUTPUT = "STRETCH_TO_OUTPUT"

    val values = js.Object.freeze(js.Array(DEFAULT, STRETCH_TO_OUTPUT))
  }

  /**
    * Set Framerate (SccDestinationFramerate) to make sure that the captions and the video are synchronized in the output. Specify a frame rate that matches the frame rate of the associated video. If the video frame rate is 29.97, choose 29.97 dropframe (FRAMERATE_29_97_DROPFRAME) only if the video has video_insertion=true and drop_frame_timecode=true; otherwise, choose 29.97 non-dropframe (FRAMERATE_29_97_NON_DROPFRAME).
    */
  object SccDestinationFramerateEnum {
    val FRAMERATE_23_97               = "FRAMERATE_23_97"
    val FRAMERATE_24                  = "FRAMERATE_24"
    val FRAMERATE_29_97_DROPFRAME     = "FRAMERATE_29_97_DROPFRAME"
    val FRAMERATE_29_97_NON_DROPFRAME = "FRAMERATE_29_97_NON_DROPFRAME"

    val values = js.Object.freeze(
      js.Array(FRAMERATE_23_97, FRAMERATE_24, FRAMERATE_29_97_DROPFRAME, FRAMERATE_29_97_NON_DROPFRAME)
    )
  }

  /**
    * Settings for SCC caption output.
    */
  @js.native
  trait SccDestinationSettings extends js.Object {
    var Framerate: js.UndefOr[SccDestinationFramerate]
  }

  object SccDestinationSettings {
    @inline
    def apply(
        Framerate: js.UndefOr[SccDestinationFramerate] = js.undefined
    ): SccDestinationSettings = {
      val __obj = js.Dynamic.literal()
      Framerate.foreach(__v => __obj.updateDynamic("Framerate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SccDestinationSettings]
    }
  }

  /**
    * Enable this setting when you run a test job to estimate how many reserved transcoding slots (RTS) you need. When this is enabled, MediaConvert runs your job from an on-demand queue with similar performance to what you will see with one RTS in a reserved queue. This setting is disabled by default.
    */
  object SimulateReservedQueueEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Use these settings when doing DRM encryption with a SPEKE-compliant key provider, if your output group type is HLS, MS Smooth, or DASH. If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
    */
  @js.native
  trait SpekeKeyProvider extends js.Object {
    var CertificateArn: js.UndefOr[__stringPatternArnAwsUsGovAcm]
    var ResourceId: js.UndefOr[__string]
    var SystemIds: js.UndefOr[__listOf__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12]
    var Url: js.UndefOr[__stringPatternHttps]
  }

  object SpekeKeyProvider {
    @inline
    def apply(
        CertificateArn: js.UndefOr[__stringPatternArnAwsUsGovAcm] = js.undefined,
        ResourceId: js.UndefOr[__string] = js.undefined,
        SystemIds: js.UndefOr[__listOf__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12] = js.undefined,
        Url: js.UndefOr[__stringPatternHttps] = js.undefined
    ): SpekeKeyProvider = {
      val __obj = js.Dynamic.literal()
      CertificateArn.foreach(__v => __obj.updateDynamic("CertificateArn")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      SystemIds.foreach(__v => __obj.updateDynamic("SystemIds")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SpekeKeyProvider]
    }
  }

  /**
    * Use these settings when doing DRM encryption with a SPEKE-compliant key provider, if your output group type is CMAF. If your output group type is HLS, MS Smooth, or DASH, use the SpekeKeyProvider settings instead.
    */
  @js.native
  trait SpekeKeyProviderCmaf extends js.Object {
    var CertificateArn: js.UndefOr[__stringPatternArnAwsUsGovAcm]
    var DashSignaledSystemIds: js.UndefOr[__listOf__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12]
    var HlsSignaledSystemIds: js.UndefOr[__listOf__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12]
    var ResourceId: js.UndefOr[__stringPatternW]
    var Url: js.UndefOr[__stringPatternHttps]
  }

  object SpekeKeyProviderCmaf {
    @inline
    def apply(
        CertificateArn: js.UndefOr[__stringPatternArnAwsUsGovAcm] = js.undefined,
        DashSignaledSystemIds: js.UndefOr[__listOf__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12] =
          js.undefined,
        HlsSignaledSystemIds: js.UndefOr[__listOf__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12] =
          js.undefined,
        ResourceId: js.UndefOr[__stringPatternW] = js.undefined,
        Url: js.UndefOr[__stringPatternHttps] = js.undefined
    ): SpekeKeyProviderCmaf = {
      val __obj = js.Dynamic.literal()
      CertificateArn.foreach(__v => __obj.updateDynamic("CertificateArn")(__v.asInstanceOf[js.Any]))
      DashSignaledSystemIds.foreach(__v => __obj.updateDynamic("DashSignaledSystemIds")(__v.asInstanceOf[js.Any]))
      HlsSignaledSystemIds.foreach(__v => __obj.updateDynamic("HlsSignaledSystemIds")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SpekeKeyProviderCmaf]
    }
  }

  /**
    * Use these settings to set up encryption with a static key provider.
    */
  @js.native
  trait StaticKeyProvider extends js.Object {
    var KeyFormat: js.UndefOr[__stringPatternIdentityAZaZ26AZaZ09163]
    var KeyFormatVersions: js.UndefOr[__stringPatternDD]
    var StaticKeyValue: js.UndefOr[__stringPatternAZaZ0932]
    var Url: js.UndefOr[__string]
  }

  object StaticKeyProvider {
    @inline
    def apply(
        KeyFormat: js.UndefOr[__stringPatternIdentityAZaZ26AZaZ09163] = js.undefined,
        KeyFormatVersions: js.UndefOr[__stringPatternDD] = js.undefined,
        StaticKeyValue: js.UndefOr[__stringPatternAZaZ0932] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined
    ): StaticKeyProvider = {
      val __obj = js.Dynamic.literal()
      KeyFormat.foreach(__v => __obj.updateDynamic("KeyFormat")(__v.asInstanceOf[js.Any]))
      KeyFormatVersions.foreach(__v => __obj.updateDynamic("KeyFormatVersions")(__v.asInstanceOf[js.Any]))
      StaticKeyValue.foreach(__v => __obj.updateDynamic("StaticKeyValue")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StaticKeyProvider]
    }
  }

  /**
    * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error.
    */
  object StatusUpdateIntervalEnum {
    val SECONDS_10  = "SECONDS_10"
    val SECONDS_12  = "SECONDS_12"
    val SECONDS_15  = "SECONDS_15"
    val SECONDS_20  = "SECONDS_20"
    val SECONDS_30  = "SECONDS_30"
    val SECONDS_60  = "SECONDS_60"
    val SECONDS_120 = "SECONDS_120"
    val SECONDS_180 = "SECONDS_180"
    val SECONDS_240 = "SECONDS_240"
    val SECONDS_300 = "SECONDS_300"
    val SECONDS_360 = "SECONDS_360"
    val SECONDS_420 = "SECONDS_420"
    val SECONDS_480 = "SECONDS_480"
    val SECONDS_540 = "SECONDS_540"
    val SECONDS_600 = "SECONDS_600"

    val values = js.Object.freeze(
      js.Array(
        SECONDS_10,
        SECONDS_12,
        SECONDS_15,
        SECONDS_20,
        SECONDS_30,
        SECONDS_60,
        SECONDS_120,
        SECONDS_180,
        SECONDS_240,
        SECONDS_300,
        SECONDS_360,
        SECONDS_420,
        SECONDS_480,
        SECONDS_540,
        SECONDS_600
      )
    )
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var Arn: __string
    var Tags: __mapOf__string
  }

  object TagResourceRequest {
    @inline
    def apply(
        Arn: __string,
        Tags: __mapOf__string
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "Arn"  -> Arn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

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
    * Settings for Teletext caption output
    */
  @js.native
  trait TeletextDestinationSettings extends js.Object {
    var PageNumber: js.UndefOr[__stringMin3Max3Pattern1809aFAF09aEAE]
    var PageTypes: js.UndefOr[__listOfTeletextPageType]
  }

  object TeletextDestinationSettings {
    @inline
    def apply(
        PageNumber: js.UndefOr[__stringMin3Max3Pattern1809aFAF09aEAE] = js.undefined,
        PageTypes: js.UndefOr[__listOfTeletextPageType] = js.undefined
    ): TeletextDestinationSettings = {
      val __obj = js.Dynamic.literal()
      PageNumber.foreach(__v => __obj.updateDynamic("PageNumber")(__v.asInstanceOf[js.Any]))
      PageTypes.foreach(__v => __obj.updateDynamic("PageTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TeletextDestinationSettings]
    }
  }

  /**
    * A page type as defined in the standard ETSI EN 300 468, Table 94
    */
  object TeletextPageTypeEnum {
    val PAGE_TYPE_INITIAL                   = "PAGE_TYPE_INITIAL"
    val PAGE_TYPE_SUBTITLE                  = "PAGE_TYPE_SUBTITLE"
    val PAGE_TYPE_ADDL_INFO                 = "PAGE_TYPE_ADDL_INFO"
    val PAGE_TYPE_PROGRAM_SCHEDULE          = "PAGE_TYPE_PROGRAM_SCHEDULE"
    val PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE = "PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE"

    val values = js.Object.freeze(
      js.Array(
        PAGE_TYPE_INITIAL,
        PAGE_TYPE_SUBTITLE,
        PAGE_TYPE_ADDL_INFO,
        PAGE_TYPE_PROGRAM_SCHEDULE,
        PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE
      )
    )
  }

  /**
    * Settings specific to Teletext caption sources, including Page number.
    */
  @js.native
  trait TeletextSourceSettings extends js.Object {
    var PageNumber: js.UndefOr[__stringMin3Max3Pattern1809aFAF09aEAE]
  }

  object TeletextSourceSettings {
    @inline
    def apply(
        PageNumber: js.UndefOr[__stringMin3Max3Pattern1809aFAF09aEAE] = js.undefined
    ): TeletextSourceSettings = {
      val __obj = js.Dynamic.literal()
      PageNumber.foreach(__v => __obj.updateDynamic("PageNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TeletextSourceSettings]
    }
  }

  /**
    * Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and specified prefix into the output.
    */
  @js.native
  trait TimecodeBurnin extends js.Object {
    var FontSize: js.UndefOr[__integerMin10Max48]
    var Position: js.UndefOr[TimecodeBurninPosition]
    var Prefix: js.UndefOr[__stringPattern]
  }

  object TimecodeBurnin {
    @inline
    def apply(
        FontSize: js.UndefOr[__integerMin10Max48] = js.undefined,
        Position: js.UndefOr[TimecodeBurninPosition] = js.undefined,
        Prefix: js.UndefOr[__stringPattern] = js.undefined
    ): TimecodeBurnin = {
      val __obj = js.Dynamic.literal()
      FontSize.foreach(__v => __obj.updateDynamic("FontSize")(__v.asInstanceOf[js.Any]))
      Position.foreach(__v => __obj.updateDynamic("Position")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimecodeBurnin]
    }
  }

  /**
    * Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to specify the location the burned-in timecode on output video.
    */
  object TimecodeBurninPositionEnum {
    val TOP_CENTER    = "TOP_CENTER"
    val TOP_LEFT      = "TOP_LEFT"
    val TOP_RIGHT     = "TOP_RIGHT"
    val MIDDLE_LEFT   = "MIDDLE_LEFT"
    val MIDDLE_CENTER = "MIDDLE_CENTER"
    val MIDDLE_RIGHT  = "MIDDLE_RIGHT"
    val BOTTOM_LEFT   = "BOTTOM_LEFT"
    val BOTTOM_CENTER = "BOTTOM_CENTER"
    val BOTTOM_RIGHT  = "BOTTOM_RIGHT"

    val values = js.Object.freeze(
      js.Array(
        TOP_CENTER,
        TOP_LEFT,
        TOP_RIGHT,
        MIDDLE_LEFT,
        MIDDLE_CENTER,
        MIDDLE_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_CENTER,
        BOTTOM_RIGHT
      )
    )
  }

  /**
    * These settings control how the service handles timecodes throughout the job. These settings don't affect input clipping.
    */
  @js.native
  trait TimecodeConfig extends js.Object {
    var Anchor: js.UndefOr[__stringPattern010920405090509092]
    var Source: js.UndefOr[TimecodeSource]
    var Start: js.UndefOr[__stringPattern010920405090509092]
    var TimestampOffset: js.UndefOr[__stringPattern0940191020191209301]
  }

  object TimecodeConfig {
    @inline
    def apply(
        Anchor: js.UndefOr[__stringPattern010920405090509092] = js.undefined,
        Source: js.UndefOr[TimecodeSource] = js.undefined,
        Start: js.UndefOr[__stringPattern010920405090509092] = js.undefined,
        TimestampOffset: js.UndefOr[__stringPattern0940191020191209301] = js.undefined
    ): TimecodeConfig = {
      val __obj = js.Dynamic.literal()
      Anchor.foreach(__v => __obj.updateDynamic("Anchor")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Start.foreach(__v => __obj.updateDynamic("Start")(__v.asInstanceOf[js.Any]))
      TimestampOffset.foreach(__v => __obj.updateDynamic("TimestampOffset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimecodeConfig]
    }
  }

  /**
    * Use Source (TimecodeSource) to set how timecodes are handled within this job. To make sure that your video, audio, captions, and markers are synchronized and that time-based features, such as image inserter, work correctly, choose the Timecode source option that matches your assets. All timecodes are in a 24-hour format with frame number (HH:MM:SS:FF). * Embedded (EMBEDDED) - Use the timecode that is in the input video. If no embedded timecode is in the source, the service will use Start at 0 (ZEROBASED) instead. * Start at 0 (ZEROBASED) - Set the timecode of the initial frame to 00:00:00:00. * Specified Start (SPECIFIEDSTART) - Set the timecode of the initial frame to a value other than zero. You use Start timecode (Start) to provide this value.
    */
  object TimecodeSourceEnum {
    val EMBEDDED       = "EMBEDDED"
    val ZEROBASED      = "ZEROBASED"
    val SPECIFIEDSTART = "SPECIFIEDSTART"

    val values = js.Object.freeze(js.Array(EMBEDDED, ZEROBASED, SPECIFIEDSTART))
  }

  /**
    * Applies only to HLS outputs. Use this setting to specify whether the service inserts the ID3 timed metadata from the input in this output.
    */
  object TimedMetadataEnum {
    val PASSTHROUGH = "PASSTHROUGH"
    val NONE        = "NONE"

    val values = js.Object.freeze(js.Array(PASSTHROUGH, NONE))
  }

  /**
    * Enable Timed metadata insertion (TimedMetadataInsertion) to include ID3 tags in your job. To include timed metadata, you must enable it here, enable it in each output container, and specify tags and timecodes in ID3 insertion (Id3Insertion) objects.
    */
  @js.native
  trait TimedMetadataInsertion extends js.Object {
    var Id3Insertions: js.UndefOr[__listOfId3Insertion]
  }

  object TimedMetadataInsertion {
    @inline
    def apply(
        Id3Insertions: js.UndefOr[__listOfId3Insertion] = js.undefined
    ): TimedMetadataInsertion = {
      val __obj = js.Dynamic.literal()
      Id3Insertions.foreach(__v => __obj.updateDynamic("Id3Insertions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimedMetadataInsertion]
    }
  }

  /**
    * Information about when jobs are submitted, started, and finished is specified in Unix epoch format in seconds.
    */
  @js.native
  trait Timing extends js.Object {
    var FinishTime: js.UndefOr[__timestampUnix]
    var StartTime: js.UndefOr[__timestampUnix]
    var SubmitTime: js.UndefOr[__timestampUnix]
  }

  object Timing {
    @inline
    def apply(
        FinishTime: js.UndefOr[__timestampUnix] = js.undefined,
        StartTime: js.UndefOr[__timestampUnix] = js.undefined,
        SubmitTime: js.UndefOr[__timestampUnix] = js.undefined
    ): Timing = {
      val __obj = js.Dynamic.literal()
      FinishTime.foreach(__v => __obj.updateDynamic("FinishTime")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.updateDynamic("SubmitTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Timing]
    }
  }

  /**
    * Settings specific to caption sources that are specfied by track number. Sources include IMSC in IMF.
    */
  @js.native
  trait TrackSourceSettings extends js.Object {
    var TrackNumber: js.UndefOr[__integerMin1Max2147483647]
  }

  object TrackSourceSettings {
    @inline
    def apply(
        TrackNumber: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    ): TrackSourceSettings = {
      val __obj = js.Dynamic.literal()
      TrackNumber.foreach(__v => __obj.updateDynamic("TrackNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrackSourceSettings]
    }
  }

  /**
    * Settings specific to TTML caption outputs, including Pass style information (TtmlStylePassthrough).
    */
  @js.native
  trait TtmlDestinationSettings extends js.Object {
    var StylePassthrough: js.UndefOr[TtmlStylePassthrough]
  }

  object TtmlDestinationSettings {
    @inline
    def apply(
        StylePassthrough: js.UndefOr[TtmlStylePassthrough] = js.undefined
    ): TtmlDestinationSettings = {
      val __obj = js.Dynamic.literal()
      StylePassthrough.foreach(__v => __obj.updateDynamic("StylePassthrough")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TtmlDestinationSettings]
    }
  }

  /**
    * Pass through style and position information from a TTML-like input source (TTML, SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
    */
  object TtmlStylePassthroughEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  object TypeEnum {
    val SYSTEM = "SYSTEM"
    val CUSTOM = "CUSTOM"

    val values = js.Object.freeze(js.Array(SYSTEM, CUSTOM))
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var Arn: __string
    var TagKeys: js.UndefOr[__listOf__string]
  }

  object UntagResourceRequest {
    @inline
    def apply(
        Arn: __string,
        TagKeys: js.UndefOr[__listOf__string] = js.undefined
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      TagKeys.foreach(__v => __obj.updateDynamic("TagKeys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

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

  @js.native
  trait UpdateJobTemplateRequest extends js.Object {
    var Name: __string
    var AccelerationSettings: js.UndefOr[AccelerationSettings]
    var Category: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var Priority: js.UndefOr[__integerMinNegative50Max50]
    var Queue: js.UndefOr[__string]
    var Settings: js.UndefOr[JobTemplateSettings]
    var StatusUpdateInterval: js.UndefOr[StatusUpdateInterval]
  }

  object UpdateJobTemplateRequest {
    @inline
    def apply(
        Name: __string,
        AccelerationSettings: js.UndefOr[AccelerationSettings] = js.undefined,
        Category: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        Priority: js.UndefOr[__integerMinNegative50Max50] = js.undefined,
        Queue: js.UndefOr[__string] = js.undefined,
        Settings: js.UndefOr[JobTemplateSettings] = js.undefined,
        StatusUpdateInterval: js.UndefOr[StatusUpdateInterval] = js.undefined
    ): UpdateJobTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AccelerationSettings.foreach(__v => __obj.updateDynamic("AccelerationSettings")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      Settings.foreach(__v => __obj.updateDynamic("Settings")(__v.asInstanceOf[js.Any]))
      StatusUpdateInterval.foreach(__v => __obj.updateDynamic("StatusUpdateInterval")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateJobTemplateRequest]
    }
  }

  @js.native
  trait UpdateJobTemplateResponse extends js.Object {
    var JobTemplate: js.UndefOr[JobTemplate]
  }

  object UpdateJobTemplateResponse {
    @inline
    def apply(
        JobTemplate: js.UndefOr[JobTemplate] = js.undefined
    ): UpdateJobTemplateResponse = {
      val __obj = js.Dynamic.literal()
      JobTemplate.foreach(__v => __obj.updateDynamic("JobTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateJobTemplateResponse]
    }
  }

  @js.native
  trait UpdatePresetRequest extends js.Object {
    var Name: __string
    var Category: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var Settings: js.UndefOr[PresetSettings]
  }

  object UpdatePresetRequest {
    @inline
    def apply(
        Name: __string,
        Category: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        Settings: js.UndefOr[PresetSettings] = js.undefined
    ): UpdatePresetRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Settings.foreach(__v => __obj.updateDynamic("Settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePresetRequest]
    }
  }

  @js.native
  trait UpdatePresetResponse extends js.Object {
    var Preset: js.UndefOr[Preset]
  }

  object UpdatePresetResponse {
    @inline
    def apply(
        Preset: js.UndefOr[Preset] = js.undefined
    ): UpdatePresetResponse = {
      val __obj = js.Dynamic.literal()
      Preset.foreach(__v => __obj.updateDynamic("Preset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePresetResponse]
    }
  }

  @js.native
  trait UpdateQueueRequest extends js.Object {
    var Name: __string
    var Description: js.UndefOr[__string]
    var ReservationPlanSettings: js.UndefOr[ReservationPlanSettings]
    var Status: js.UndefOr[QueueStatus]
  }

  object UpdateQueueRequest {
    @inline
    def apply(
        Name: __string,
        Description: js.UndefOr[__string] = js.undefined,
        ReservationPlanSettings: js.UndefOr[ReservationPlanSettings] = js.undefined,
        Status: js.UndefOr[QueueStatus] = js.undefined
    ): UpdateQueueRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ReservationPlanSettings.foreach(__v => __obj.updateDynamic("ReservationPlanSettings")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateQueueRequest]
    }
  }

  @js.native
  trait UpdateQueueResponse extends js.Object {
    var Queue: js.UndefOr[Queue]
  }

  object UpdateQueueResponse {
    @inline
    def apply(
        Queue: js.UndefOr[Queue] = js.undefined
    ): UpdateQueueResponse = {
      val __obj = js.Dynamic.literal()
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateQueueResponse]
    }
  }

  /**
    * Type of video codec
    */
  object VideoCodecEnum {
    val FRAME_CAPTURE = "FRAME_CAPTURE"
    val H_264         = "H_264"
    val H_265         = "H_265"
    val MPEG2         = "MPEG2"
    val PRORES        = "PRORES"

    val values = js.Object.freeze(js.Array(FRAME_CAPTURE, H_264, H_265, MPEG2, PRORES))
  }

  /**
    * Video codec settings, (CodecSettings) under (VideoDescription), contains the group of settings related to video encoding. The settings in this group vary depending on the value that you choose for Video codec (Codec). For each codec enum that you choose, define the corresponding settings object. The following lists the codec enum, settings object pairs. * H_264, H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES, ProresSettings * FRAME_CAPTURE, FrameCaptureSettings
    */
  @js.native
  trait VideoCodecSettings extends js.Object {
    var Codec: js.UndefOr[VideoCodec]
    var FrameCaptureSettings: js.UndefOr[FrameCaptureSettings]
    var H264Settings: js.UndefOr[H264Settings]
    var H265Settings: js.UndefOr[H265Settings]
    var Mpeg2Settings: js.UndefOr[Mpeg2Settings]
    var ProresSettings: js.UndefOr[ProresSettings]
  }

  object VideoCodecSettings {
    @inline
    def apply(
        Codec: js.UndefOr[VideoCodec] = js.undefined,
        FrameCaptureSettings: js.UndefOr[FrameCaptureSettings] = js.undefined,
        H264Settings: js.UndefOr[H264Settings] = js.undefined,
        H265Settings: js.UndefOr[H265Settings] = js.undefined,
        Mpeg2Settings: js.UndefOr[Mpeg2Settings] = js.undefined,
        ProresSettings: js.UndefOr[ProresSettings] = js.undefined
    ): VideoCodecSettings = {
      val __obj = js.Dynamic.literal()
      Codec.foreach(__v => __obj.updateDynamic("Codec")(__v.asInstanceOf[js.Any]))
      FrameCaptureSettings.foreach(__v => __obj.updateDynamic("FrameCaptureSettings")(__v.asInstanceOf[js.Any]))
      H264Settings.foreach(__v => __obj.updateDynamic("H264Settings")(__v.asInstanceOf[js.Any]))
      H265Settings.foreach(__v => __obj.updateDynamic("H265Settings")(__v.asInstanceOf[js.Any]))
      Mpeg2Settings.foreach(__v => __obj.updateDynamic("Mpeg2Settings")(__v.asInstanceOf[js.Any]))
      ProresSettings.foreach(__v => __obj.updateDynamic("ProresSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoCodecSettings]
    }
  }

  /**
    * Settings for video outputs
    */
  @js.native
  trait VideoDescription extends js.Object {
    var AfdSignaling: js.UndefOr[AfdSignaling]
    var AntiAlias: js.UndefOr[AntiAlias]
    var CodecSettings: js.UndefOr[VideoCodecSettings]
    var ColorMetadata: js.UndefOr[ColorMetadata]
    var Crop: js.UndefOr[Rectangle]
    var DropFrameTimecode: js.UndefOr[DropFrameTimecode]
    var FixedAfd: js.UndefOr[__integerMin0Max15]
    var Height: js.UndefOr[__integerMin32Max2160]
    var Position: js.UndefOr[Rectangle]
    var RespondToAfd: js.UndefOr[RespondToAfd]
    var ScalingBehavior: js.UndefOr[ScalingBehavior]
    var Sharpness: js.UndefOr[__integerMin0Max100]
    var TimecodeInsertion: js.UndefOr[VideoTimecodeInsertion]
    var VideoPreprocessors: js.UndefOr[VideoPreprocessor]
    var Width: js.UndefOr[__integerMin32Max4096]
  }

  object VideoDescription {
    @inline
    def apply(
        AfdSignaling: js.UndefOr[AfdSignaling] = js.undefined,
        AntiAlias: js.UndefOr[AntiAlias] = js.undefined,
        CodecSettings: js.UndefOr[VideoCodecSettings] = js.undefined,
        ColorMetadata: js.UndefOr[ColorMetadata] = js.undefined,
        Crop: js.UndefOr[Rectangle] = js.undefined,
        DropFrameTimecode: js.UndefOr[DropFrameTimecode] = js.undefined,
        FixedAfd: js.UndefOr[__integerMin0Max15] = js.undefined,
        Height: js.UndefOr[__integerMin32Max2160] = js.undefined,
        Position: js.UndefOr[Rectangle] = js.undefined,
        RespondToAfd: js.UndefOr[RespondToAfd] = js.undefined,
        ScalingBehavior: js.UndefOr[ScalingBehavior] = js.undefined,
        Sharpness: js.UndefOr[__integerMin0Max100] = js.undefined,
        TimecodeInsertion: js.UndefOr[VideoTimecodeInsertion] = js.undefined,
        VideoPreprocessors: js.UndefOr[VideoPreprocessor] = js.undefined,
        Width: js.UndefOr[__integerMin32Max4096] = js.undefined
    ): VideoDescription = {
      val __obj = js.Dynamic.literal()
      AfdSignaling.foreach(__v => __obj.updateDynamic("AfdSignaling")(__v.asInstanceOf[js.Any]))
      AntiAlias.foreach(__v => __obj.updateDynamic("AntiAlias")(__v.asInstanceOf[js.Any]))
      CodecSettings.foreach(__v => __obj.updateDynamic("CodecSettings")(__v.asInstanceOf[js.Any]))
      ColorMetadata.foreach(__v => __obj.updateDynamic("ColorMetadata")(__v.asInstanceOf[js.Any]))
      Crop.foreach(__v => __obj.updateDynamic("Crop")(__v.asInstanceOf[js.Any]))
      DropFrameTimecode.foreach(__v => __obj.updateDynamic("DropFrameTimecode")(__v.asInstanceOf[js.Any]))
      FixedAfd.foreach(__v => __obj.updateDynamic("FixedAfd")(__v.asInstanceOf[js.Any]))
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      Position.foreach(__v => __obj.updateDynamic("Position")(__v.asInstanceOf[js.Any]))
      RespondToAfd.foreach(__v => __obj.updateDynamic("RespondToAfd")(__v.asInstanceOf[js.Any]))
      ScalingBehavior.foreach(__v => __obj.updateDynamic("ScalingBehavior")(__v.asInstanceOf[js.Any]))
      Sharpness.foreach(__v => __obj.updateDynamic("Sharpness")(__v.asInstanceOf[js.Any]))
      TimecodeInsertion.foreach(__v => __obj.updateDynamic("TimecodeInsertion")(__v.asInstanceOf[js.Any]))
      VideoPreprocessors.foreach(__v => __obj.updateDynamic("VideoPreprocessors")(__v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoDescription]
    }
  }

  /**
    * Contains details about the output's video stream
    */
  @js.native
  trait VideoDetail extends js.Object {
    var HeightInPx: js.UndefOr[__integer]
    var WidthInPx: js.UndefOr[__integer]
  }

  object VideoDetail {
    @inline
    def apply(
        HeightInPx: js.UndefOr[__integer] = js.undefined,
        WidthInPx: js.UndefOr[__integer] = js.undefined
    ): VideoDetail = {
      val __obj = js.Dynamic.literal()
      HeightInPx.foreach(__v => __obj.updateDynamic("HeightInPx")(__v.asInstanceOf[js.Any]))
      WidthInPx.foreach(__v => __obj.updateDynamic("WidthInPx")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoDetail]
    }
  }

  /**
    * Find additional transcoding features under Preprocessors (VideoPreprocessors). Enable the features at each output individually. These features are disabled by default.
    */
  @js.native
  trait VideoPreprocessor extends js.Object {
    var ColorCorrector: js.UndefOr[ColorCorrector]
    var Deinterlacer: js.UndefOr[Deinterlacer]
    var ImageInserter: js.UndefOr[ImageInserter]
    var NoiseReducer: js.UndefOr[NoiseReducer]
    var TimecodeBurnin: js.UndefOr[TimecodeBurnin]
  }

  object VideoPreprocessor {
    @inline
    def apply(
        ColorCorrector: js.UndefOr[ColorCorrector] = js.undefined,
        Deinterlacer: js.UndefOr[Deinterlacer] = js.undefined,
        ImageInserter: js.UndefOr[ImageInserter] = js.undefined,
        NoiseReducer: js.UndefOr[NoiseReducer] = js.undefined,
        TimecodeBurnin: js.UndefOr[TimecodeBurnin] = js.undefined
    ): VideoPreprocessor = {
      val __obj = js.Dynamic.literal()
      ColorCorrector.foreach(__v => __obj.updateDynamic("ColorCorrector")(__v.asInstanceOf[js.Any]))
      Deinterlacer.foreach(__v => __obj.updateDynamic("Deinterlacer")(__v.asInstanceOf[js.Any]))
      ImageInserter.foreach(__v => __obj.updateDynamic("ImageInserter")(__v.asInstanceOf[js.Any]))
      NoiseReducer.foreach(__v => __obj.updateDynamic("NoiseReducer")(__v.asInstanceOf[js.Any]))
      TimecodeBurnin.foreach(__v => __obj.updateDynamic("TimecodeBurnin")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoPreprocessor]
    }
  }

  /**
    * Selector for video.
    */
  @js.native
  trait VideoSelector extends js.Object {
    var ColorSpace: js.UndefOr[ColorSpace]
    var ColorSpaceUsage: js.UndefOr[ColorSpaceUsage]
    var Hdr10Metadata: js.UndefOr[Hdr10Metadata]
    var Pid: js.UndefOr[__integerMin1Max2147483647]
    var ProgramNumber: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var Rotate: js.UndefOr[InputRotate]
  }

  object VideoSelector {
    @inline
    def apply(
        ColorSpace: js.UndefOr[ColorSpace] = js.undefined,
        ColorSpaceUsage: js.UndefOr[ColorSpaceUsage] = js.undefined,
        Hdr10Metadata: js.UndefOr[Hdr10Metadata] = js.undefined,
        Pid: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        ProgramNumber: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        Rotate: js.UndefOr[InputRotate] = js.undefined
    ): VideoSelector = {
      val __obj = js.Dynamic.literal()
      ColorSpace.foreach(__v => __obj.updateDynamic("ColorSpace")(__v.asInstanceOf[js.Any]))
      ColorSpaceUsage.foreach(__v => __obj.updateDynamic("ColorSpaceUsage")(__v.asInstanceOf[js.Any]))
      Hdr10Metadata.foreach(__v => __obj.updateDynamic("Hdr10Metadata")(__v.asInstanceOf[js.Any]))
      Pid.foreach(__v => __obj.updateDynamic("Pid")(__v.asInstanceOf[js.Any]))
      ProgramNumber.foreach(__v => __obj.updateDynamic("ProgramNumber")(__v.asInstanceOf[js.Any]))
      Rotate.foreach(__v => __obj.updateDynamic("Rotate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoSelector]
    }
  }

  /**
    * Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable Timecode insertion when the input frame rate is identical to the output frame rate. To include timecodes in this output, set Timecode insertion (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to DISABLED. Default is DISABLED. When the service inserts timecodes in an output, by default, it uses any embedded timecodes from the input. If none are present, the service will set the timecode for the first output frame to zero. To change this default behavior, adjust the settings under Timecode configuration (TimecodeConfig). In the console, these settings are located under Job > Job settings > Timecode configuration. Note - Timecode source under input settings (InputTimecodeSource) does not affect the timecodes that are inserted in the output. Source under Job settings > Timecode configuration (TimecodeSource) does.
    */
  object VideoTimecodeInsertionEnum {
    val DISABLED       = "DISABLED"
    val PIC_TIMING_SEI = "PIC_TIMING_SEI"

    val values = js.Object.freeze(js.Array(DISABLED, PIC_TIMING_SEI))
  }

  /**
    * The service defaults to using RIFF for WAV outputs. If your output audio is likely to exceed 4 GB in file size, or if you otherwise need the extended support of the RF64 format, set your output WAV file format to RF64.
    */
  object WavFormatEnum {
    val RIFF = "RIFF"
    val RF64 = "RF64"

    val values = js.Object.freeze(js.Array(RIFF, RF64))
  }

  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value WAV.
    */
  @js.native
  trait WavSettings extends js.Object {
    var BitDepth: js.UndefOr[__integerMin16Max24]
    var Channels: js.UndefOr[__integerMin1Max8]
    var Format: js.UndefOr[WavFormat]
    var SampleRate: js.UndefOr[__integerMin8000Max192000]
  }

  object WavSettings {
    @inline
    def apply(
        BitDepth: js.UndefOr[__integerMin16Max24] = js.undefined,
        Channels: js.UndefOr[__integerMin1Max8] = js.undefined,
        Format: js.UndefOr[WavFormat] = js.undefined,
        SampleRate: js.UndefOr[__integerMin8000Max192000] = js.undefined
    ): WavSettings = {
      val __obj = js.Dynamic.literal()
      BitDepth.foreach(__v => __obj.updateDynamic("BitDepth")(__v.asInstanceOf[js.Any]))
      Channels.foreach(__v => __obj.updateDynamic("Channels")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WavSettings]
    }
  }
}
