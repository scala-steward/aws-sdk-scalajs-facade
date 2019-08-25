package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object transcribeservice {
  type DateTime                  = js.Date
  type FailureReason             = String
  type LanguageCode              = String
  type MaxResults                = Int
  type MaxSpeakers               = Int
  type MediaFormat               = String
  type MediaSampleRateHertz      = Int
  type NextToken                 = String
  type OutputBucketName          = String
  type OutputLocationType        = String
  type Phrase                    = String
  type Phrases                   = js.Array[Phrase]
  type TranscriptionJobName      = String
  type TranscriptionJobStatus    = String
  type TranscriptionJobSummaries = js.Array[TranscriptionJobSummary]
  type Uri                       = String
  type Vocabularies              = js.Array[VocabularyInfo]
  type VocabularyName            = String
  type VocabularyState           = String

  implicit final class TranscribeServiceOps(val service: TranscribeService) extends AnyVal {

    def createVocabularyFuture(params: CreateVocabularyRequest): Future[CreateVocabularyResponse] =
      service.createVocabulary(params).promise.toFuture
    def deleteTranscriptionJobFuture(params: DeleteTranscriptionJobRequest): Future[js.Object] =
      service.deleteTranscriptionJob(params).promise.toFuture
    def deleteVocabularyFuture(params: DeleteVocabularyRequest): Future[js.Object] =
      service.deleteVocabulary(params).promise.toFuture
    def getTranscriptionJobFuture(params: GetTranscriptionJobRequest): Future[GetTranscriptionJobResponse] =
      service.getTranscriptionJob(params).promise.toFuture
    def getVocabularyFuture(params: GetVocabularyRequest): Future[GetVocabularyResponse] =
      service.getVocabulary(params).promise.toFuture
    def listTranscriptionJobsFuture(params: ListTranscriptionJobsRequest): Future[ListTranscriptionJobsResponse] =
      service.listTranscriptionJobs(params).promise.toFuture
    def listVocabulariesFuture(params: ListVocabulariesRequest): Future[ListVocabulariesResponse] =
      service.listVocabularies(params).promise.toFuture
    def startTranscriptionJobFuture(params: StartTranscriptionJobRequest): Future[StartTranscriptionJobResponse] =
      service.startTranscriptionJob(params).promise.toFuture
    def updateVocabularyFuture(params: UpdateVocabularyRequest): Future[UpdateVocabularyResponse] =
      service.updateVocabulary(params).promise.toFuture
  }
}

package transcribeservice {
  @js.native
  @JSImport("aws-sdk", "TranscribeService")
  class TranscribeService() extends js.Object {
    def this(config: AWSConfig) = this()

    def createVocabulary(params: CreateVocabularyRequest): Request[CreateVocabularyResponse]                = js.native
    def deleteTranscriptionJob(params: DeleteTranscriptionJobRequest): Request[js.Object]                   = js.native
    def deleteVocabulary(params: DeleteVocabularyRequest): Request[js.Object]                               = js.native
    def getTranscriptionJob(params: GetTranscriptionJobRequest): Request[GetTranscriptionJobResponse]       = js.native
    def getVocabulary(params: GetVocabularyRequest): Request[GetVocabularyResponse]                         = js.native
    def listTranscriptionJobs(params: ListTranscriptionJobsRequest): Request[ListTranscriptionJobsResponse] = js.native
    def listVocabularies(params: ListVocabulariesRequest): Request[ListVocabulariesResponse]                = js.native
    def startTranscriptionJob(params: StartTranscriptionJobRequest): Request[StartTranscriptionJobResponse] = js.native
    def updateVocabulary(params: UpdateVocabularyRequest): Request[UpdateVocabularyResponse]                = js.native
  }

  @js.native
  trait CreateVocabularyRequest extends js.Object {
    var LanguageCode: LanguageCode
    var VocabularyName: VocabularyName
    var Phrases: js.UndefOr[Phrases]
    var VocabularyFileUri: js.UndefOr[Uri]
  }

  object CreateVocabularyRequest {
    def apply(
        LanguageCode: LanguageCode,
        VocabularyName: VocabularyName,
        Phrases: js.UndefOr[Phrases] = js.undefined,
        VocabularyFileUri: js.UndefOr[Uri] = js.undefined
    ): CreateVocabularyRequest = {
      val __obj = js.Dictionary[js.Any](
        "LanguageCode"   -> LanguageCode.asInstanceOf[js.Any],
        "VocabularyName" -> VocabularyName.asInstanceOf[js.Any]
      )

      Phrases.foreach(__v => __obj.update("Phrases", __v.asInstanceOf[js.Any]))
      VocabularyFileUri.foreach(__v => __obj.update("VocabularyFileUri", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVocabularyRequest]
    }
  }

  @js.native
  trait CreateVocabularyResponse extends js.Object {
    var FailureReason: js.UndefOr[FailureReason]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyName: js.UndefOr[VocabularyName]
    var VocabularyState: js.UndefOr[VocabularyState]
  }

  object CreateVocabularyResponse {
    def apply(
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LastModifiedTime: js.UndefOr[DateTime] = js.undefined,
        VocabularyName: js.UndefOr[VocabularyName] = js.undefined,
        VocabularyState: js.UndefOr[VocabularyState] = js.undefined
    ): CreateVocabularyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      FailureReason.foreach(__v => __obj.update("FailureReason", __v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.update("LanguageCode", __v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.update("LastModifiedTime", __v.asInstanceOf[js.Any]))
      VocabularyName.foreach(__v => __obj.update("VocabularyName", __v.asInstanceOf[js.Any]))
      VocabularyState.foreach(__v => __obj.update("VocabularyState", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVocabularyResponse]
    }
  }

  @js.native
  trait DeleteTranscriptionJobRequest extends js.Object {
    var TranscriptionJobName: TranscriptionJobName
  }

  object DeleteTranscriptionJobRequest {
    def apply(
        TranscriptionJobName: TranscriptionJobName
    ): DeleteTranscriptionJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "TranscriptionJobName" -> TranscriptionJobName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTranscriptionJobRequest]
    }
  }

  @js.native
  trait DeleteVocabularyRequest extends js.Object {
    var VocabularyName: VocabularyName
  }

  object DeleteVocabularyRequest {
    def apply(
        VocabularyName: VocabularyName
    ): DeleteVocabularyRequest = {
      val __obj = js.Dictionary[js.Any](
        "VocabularyName" -> VocabularyName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVocabularyRequest]
    }
  }

  @js.native
  trait GetTranscriptionJobRequest extends js.Object {
    var TranscriptionJobName: TranscriptionJobName
  }

  object GetTranscriptionJobRequest {
    def apply(
        TranscriptionJobName: TranscriptionJobName
    ): GetTranscriptionJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "TranscriptionJobName" -> TranscriptionJobName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTranscriptionJobRequest]
    }
  }

  @js.native
  trait GetTranscriptionJobResponse extends js.Object {
    var TranscriptionJob: js.UndefOr[TranscriptionJob]
  }

  object GetTranscriptionJobResponse {
    def apply(
        TranscriptionJob: js.UndefOr[TranscriptionJob] = js.undefined
    ): GetTranscriptionJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      TranscriptionJob.foreach(__v => __obj.update("TranscriptionJob", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTranscriptionJobResponse]
    }
  }

  @js.native
  trait GetVocabularyRequest extends js.Object {
    var VocabularyName: VocabularyName
  }

  object GetVocabularyRequest {
    def apply(
        VocabularyName: VocabularyName
    ): GetVocabularyRequest = {
      val __obj = js.Dictionary[js.Any](
        "VocabularyName" -> VocabularyName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetVocabularyRequest]
    }
  }

  @js.native
  trait GetVocabularyResponse extends js.Object {
    var DownloadUri: js.UndefOr[Uri]
    var FailureReason: js.UndefOr[FailureReason]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyName: js.UndefOr[VocabularyName]
    var VocabularyState: js.UndefOr[VocabularyState]
  }

  object GetVocabularyResponse {
    def apply(
        DownloadUri: js.UndefOr[Uri] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LastModifiedTime: js.UndefOr[DateTime] = js.undefined,
        VocabularyName: js.UndefOr[VocabularyName] = js.undefined,
        VocabularyState: js.UndefOr[VocabularyState] = js.undefined
    ): GetVocabularyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DownloadUri.foreach(__v => __obj.update("DownloadUri", __v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.update("FailureReason", __v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.update("LanguageCode", __v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.update("LastModifiedTime", __v.asInstanceOf[js.Any]))
      VocabularyName.foreach(__v => __obj.update("VocabularyName", __v.asInstanceOf[js.Any]))
      VocabularyState.foreach(__v => __obj.update("VocabularyState", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVocabularyResponse]
    }
  }

  object LanguageCodeEnum {
    val `en-US` = "en-US"
    val `es-US` = "es-US"
    val `en-AU` = "en-AU"
    val `fr-CA` = "fr-CA"
    val `en-GB` = "en-GB"
    val `de-DE` = "de-DE"
    val `pt-BR` = "pt-BR"
    val `fr-FR` = "fr-FR"
    val `it-IT` = "it-IT"
    val `ko-KR` = "ko-KR"

    val values = IndexedSeq(`en-US`, `es-US`, `en-AU`, `fr-CA`, `en-GB`, `de-DE`, `pt-BR`, `fr-FR`, `it-IT`, `ko-KR`)
  }

  @js.native
  trait ListTranscriptionJobsRequest extends js.Object {
    var JobNameContains: js.UndefOr[TranscriptionJobName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[TranscriptionJobStatus]
  }

  object ListTranscriptionJobsRequest {
    def apply(
        JobNameContains: js.UndefOr[TranscriptionJobName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Status: js.UndefOr[TranscriptionJobStatus] = js.undefined
    ): ListTranscriptionJobsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      JobNameContains.foreach(__v => __obj.update("JobNameContains", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTranscriptionJobsRequest]
    }
  }

  @js.native
  trait ListTranscriptionJobsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[TranscriptionJobStatus]
    var TranscriptionJobSummaries: js.UndefOr[TranscriptionJobSummaries]
  }

  object ListTranscriptionJobsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Status: js.UndefOr[TranscriptionJobStatus] = js.undefined,
        TranscriptionJobSummaries: js.UndefOr[TranscriptionJobSummaries] = js.undefined
    ): ListTranscriptionJobsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      TranscriptionJobSummaries.foreach(__v => __obj.update("TranscriptionJobSummaries", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTranscriptionJobsResponse]
    }
  }

  @js.native
  trait ListVocabulariesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[VocabularyName]
    var NextToken: js.UndefOr[NextToken]
    var StateEquals: js.UndefOr[VocabularyState]
  }

  object ListVocabulariesRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[VocabularyName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StateEquals: js.UndefOr[VocabularyState] = js.undefined
    ): ListVocabulariesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.update("NameContains", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      StateEquals.foreach(__v => __obj.update("StateEquals", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVocabulariesRequest]
    }
  }

  @js.native
  trait ListVocabulariesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[TranscriptionJobStatus]
    var Vocabularies: js.UndefOr[Vocabularies]
  }

  object ListVocabulariesResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Status: js.UndefOr[TranscriptionJobStatus] = js.undefined,
        Vocabularies: js.UndefOr[Vocabularies] = js.undefined
    ): ListVocabulariesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      Vocabularies.foreach(__v => __obj.update("Vocabularies", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVocabulariesResponse]
    }
  }

  /**
    * Describes the input media file in a transcription request.
    */
  @js.native
  trait Media extends js.Object {
    var MediaFileUri: js.UndefOr[Uri]
  }

  object Media {
    def apply(
        MediaFileUri: js.UndefOr[Uri] = js.undefined
    ): Media = {
      val __obj = js.Dictionary.empty[js.Any]
      MediaFileUri.foreach(__v => __obj.update("MediaFileUri", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Media]
    }
  }

  object MediaFormatEnum {
    val mp3  = "mp3"
    val mp4  = "mp4"
    val wav  = "wav"
    val flac = "flac"

    val values = IndexedSeq(mp3, mp4, wav, flac)
  }

  object OutputLocationTypeEnum {
    val CUSTOMER_BUCKET = "CUSTOMER_BUCKET"
    val SERVICE_BUCKET  = "SERVICE_BUCKET"

    val values = IndexedSeq(CUSTOMER_BUCKET, SERVICE_BUCKET)
  }

  /**
    * Provides optional settings for the <code>StartTranscriptionJob</code> operation.
    */
  @js.native
  trait Settings extends js.Object {
    var ChannelIdentification: js.UndefOr[Boolean]
    var MaxSpeakerLabels: js.UndefOr[MaxSpeakers]
    var ShowSpeakerLabels: js.UndefOr[Boolean]
    var VocabularyName: js.UndefOr[VocabularyName]
  }

  object Settings {
    def apply(
        ChannelIdentification: js.UndefOr[Boolean] = js.undefined,
        MaxSpeakerLabels: js.UndefOr[MaxSpeakers] = js.undefined,
        ShowSpeakerLabels: js.UndefOr[Boolean] = js.undefined,
        VocabularyName: js.UndefOr[VocabularyName] = js.undefined
    ): Settings = {
      val __obj = js.Dictionary.empty[js.Any]
      ChannelIdentification.foreach(__v => __obj.update("ChannelIdentification", __v.asInstanceOf[js.Any]))
      MaxSpeakerLabels.foreach(__v => __obj.update("MaxSpeakerLabels", __v.asInstanceOf[js.Any]))
      ShowSpeakerLabels.foreach(__v => __obj.update("ShowSpeakerLabels", __v.asInstanceOf[js.Any]))
      VocabularyName.foreach(__v => __obj.update("VocabularyName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Settings]
    }
  }

  @js.native
  trait StartTranscriptionJobRequest extends js.Object {
    var LanguageCode: LanguageCode
    var Media: Media
    var MediaFormat: MediaFormat
    var TranscriptionJobName: TranscriptionJobName
    var MediaSampleRateHertz: js.UndefOr[MediaSampleRateHertz]
    var OutputBucketName: js.UndefOr[OutputBucketName]
    var Settings: js.UndefOr[Settings]
  }

  object StartTranscriptionJobRequest {
    def apply(
        LanguageCode: LanguageCode,
        Media: Media,
        MediaFormat: MediaFormat,
        TranscriptionJobName: TranscriptionJobName,
        MediaSampleRateHertz: js.UndefOr[MediaSampleRateHertz] = js.undefined,
        OutputBucketName: js.UndefOr[OutputBucketName] = js.undefined,
        Settings: js.UndefOr[Settings] = js.undefined
    ): StartTranscriptionJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "LanguageCode"         -> LanguageCode.asInstanceOf[js.Any],
        "Media"                -> Media.asInstanceOf[js.Any],
        "MediaFormat"          -> MediaFormat.asInstanceOf[js.Any],
        "TranscriptionJobName" -> TranscriptionJobName.asInstanceOf[js.Any]
      )

      MediaSampleRateHertz.foreach(__v => __obj.update("MediaSampleRateHertz", __v.asInstanceOf[js.Any]))
      OutputBucketName.foreach(__v => __obj.update("OutputBucketName", __v.asInstanceOf[js.Any]))
      Settings.foreach(__v => __obj.update("Settings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTranscriptionJobRequest]
    }
  }

  @js.native
  trait StartTranscriptionJobResponse extends js.Object {
    var TranscriptionJob: js.UndefOr[TranscriptionJob]
  }

  object StartTranscriptionJobResponse {
    def apply(
        TranscriptionJob: js.UndefOr[TranscriptionJob] = js.undefined
    ): StartTranscriptionJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      TranscriptionJob.foreach(__v => __obj.update("TranscriptionJob", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTranscriptionJobResponse]
    }
  }

  /**
    * Identifies the location of a transcription.
    */
  @js.native
  trait Transcript extends js.Object {
    var TranscriptFileUri: js.UndefOr[Uri]
  }

  object Transcript {
    def apply(
        TranscriptFileUri: js.UndefOr[Uri] = js.undefined
    ): Transcript = {
      val __obj = js.Dictionary.empty[js.Any]
      TranscriptFileUri.foreach(__v => __obj.update("TranscriptFileUri", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Transcript]
    }
  }

  /**
    * Describes an asynchronous transcription job that was created with the <code>StartTranscriptionJob</code> operation.
    */
  @js.native
  trait TranscriptionJob extends js.Object {
    var CompletionTime: js.UndefOr[DateTime]
    var CreationTime: js.UndefOr[DateTime]
    var FailureReason: js.UndefOr[FailureReason]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Media: js.UndefOr[Media]
    var MediaFormat: js.UndefOr[MediaFormat]
    var MediaSampleRateHertz: js.UndefOr[MediaSampleRateHertz]
    var Settings: js.UndefOr[Settings]
    var Transcript: js.UndefOr[Transcript]
    var TranscriptionJobName: js.UndefOr[TranscriptionJobName]
    var TranscriptionJobStatus: js.UndefOr[TranscriptionJobStatus]
  }

  object TranscriptionJob {
    def apply(
        CompletionTime: js.UndefOr[DateTime] = js.undefined,
        CreationTime: js.UndefOr[DateTime] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Media: js.UndefOr[Media] = js.undefined,
        MediaFormat: js.UndefOr[MediaFormat] = js.undefined,
        MediaSampleRateHertz: js.UndefOr[MediaSampleRateHertz] = js.undefined,
        Settings: js.UndefOr[Settings] = js.undefined,
        Transcript: js.UndefOr[Transcript] = js.undefined,
        TranscriptionJobName: js.UndefOr[TranscriptionJobName] = js.undefined,
        TranscriptionJobStatus: js.UndefOr[TranscriptionJobStatus] = js.undefined
    ): TranscriptionJob = {
      val __obj = js.Dictionary.empty[js.Any]
      CompletionTime.foreach(__v => __obj.update("CompletionTime", __v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.update("FailureReason", __v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.update("LanguageCode", __v.asInstanceOf[js.Any]))
      Media.foreach(__v => __obj.update("Media", __v.asInstanceOf[js.Any]))
      MediaFormat.foreach(__v => __obj.update("MediaFormat", __v.asInstanceOf[js.Any]))
      MediaSampleRateHertz.foreach(__v => __obj.update("MediaSampleRateHertz", __v.asInstanceOf[js.Any]))
      Settings.foreach(__v => __obj.update("Settings", __v.asInstanceOf[js.Any]))
      Transcript.foreach(__v => __obj.update("Transcript", __v.asInstanceOf[js.Any]))
      TranscriptionJobName.foreach(__v => __obj.update("TranscriptionJobName", __v.asInstanceOf[js.Any]))
      TranscriptionJobStatus.foreach(__v => __obj.update("TranscriptionJobStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TranscriptionJob]
    }
  }

  object TranscriptionJobStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val FAILED      = "FAILED"
    val COMPLETED   = "COMPLETED"

    val values = IndexedSeq(IN_PROGRESS, FAILED, COMPLETED)
  }

  /**
    * Provides a summary of information about a transcription job. .
    */
  @js.native
  trait TranscriptionJobSummary extends js.Object {
    var CompletionTime: js.UndefOr[DateTime]
    var CreationTime: js.UndefOr[DateTime]
    var FailureReason: js.UndefOr[FailureReason]
    var LanguageCode: js.UndefOr[LanguageCode]
    var OutputLocationType: js.UndefOr[OutputLocationType]
    var TranscriptionJobName: js.UndefOr[TranscriptionJobName]
    var TranscriptionJobStatus: js.UndefOr[TranscriptionJobStatus]
  }

  object TranscriptionJobSummary {
    def apply(
        CompletionTime: js.UndefOr[DateTime] = js.undefined,
        CreationTime: js.UndefOr[DateTime] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        OutputLocationType: js.UndefOr[OutputLocationType] = js.undefined,
        TranscriptionJobName: js.UndefOr[TranscriptionJobName] = js.undefined,
        TranscriptionJobStatus: js.UndefOr[TranscriptionJobStatus] = js.undefined
    ): TranscriptionJobSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      CompletionTime.foreach(__v => __obj.update("CompletionTime", __v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.update("FailureReason", __v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.update("LanguageCode", __v.asInstanceOf[js.Any]))
      OutputLocationType.foreach(__v => __obj.update("OutputLocationType", __v.asInstanceOf[js.Any]))
      TranscriptionJobName.foreach(__v => __obj.update("TranscriptionJobName", __v.asInstanceOf[js.Any]))
      TranscriptionJobStatus.foreach(__v => __obj.update("TranscriptionJobStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TranscriptionJobSummary]
    }
  }

  @js.native
  trait UpdateVocabularyRequest extends js.Object {
    var LanguageCode: LanguageCode
    var VocabularyName: VocabularyName
    var Phrases: js.UndefOr[Phrases]
    var VocabularyFileUri: js.UndefOr[Uri]
  }

  object UpdateVocabularyRequest {
    def apply(
        LanguageCode: LanguageCode,
        VocabularyName: VocabularyName,
        Phrases: js.UndefOr[Phrases] = js.undefined,
        VocabularyFileUri: js.UndefOr[Uri] = js.undefined
    ): UpdateVocabularyRequest = {
      val __obj = js.Dictionary[js.Any](
        "LanguageCode"   -> LanguageCode.asInstanceOf[js.Any],
        "VocabularyName" -> VocabularyName.asInstanceOf[js.Any]
      )

      Phrases.foreach(__v => __obj.update("Phrases", __v.asInstanceOf[js.Any]))
      VocabularyFileUri.foreach(__v => __obj.update("VocabularyFileUri", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVocabularyRequest]
    }
  }

  @js.native
  trait UpdateVocabularyResponse extends js.Object {
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyName: js.UndefOr[VocabularyName]
    var VocabularyState: js.UndefOr[VocabularyState]
  }

  object UpdateVocabularyResponse {
    def apply(
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LastModifiedTime: js.UndefOr[DateTime] = js.undefined,
        VocabularyName: js.UndefOr[VocabularyName] = js.undefined,
        VocabularyState: js.UndefOr[VocabularyState] = js.undefined
    ): UpdateVocabularyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      LanguageCode.foreach(__v => __obj.update("LanguageCode", __v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.update("LastModifiedTime", __v.asInstanceOf[js.Any]))
      VocabularyName.foreach(__v => __obj.update("VocabularyName", __v.asInstanceOf[js.Any]))
      VocabularyState.foreach(__v => __obj.update("VocabularyState", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVocabularyResponse]
    }
  }

  /**
    * Provides information about a custom vocabulary.
    */
  @js.native
  trait VocabularyInfo extends js.Object {
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyName: js.UndefOr[VocabularyName]
    var VocabularyState: js.UndefOr[VocabularyState]
  }

  object VocabularyInfo {
    def apply(
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LastModifiedTime: js.UndefOr[DateTime] = js.undefined,
        VocabularyName: js.UndefOr[VocabularyName] = js.undefined,
        VocabularyState: js.UndefOr[VocabularyState] = js.undefined
    ): VocabularyInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      LanguageCode.foreach(__v => __obj.update("LanguageCode", __v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.update("LastModifiedTime", __v.asInstanceOf[js.Any]))
      VocabularyName.foreach(__v => __obj.update("VocabularyName", __v.asInstanceOf[js.Any]))
      VocabularyState.foreach(__v => __obj.update("VocabularyState", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VocabularyInfo]
    }
  }

  object VocabularyStateEnum {
    val PENDING = "PENDING"
    val READY   = "READY"
    val FAILED  = "FAILED"

    val values = IndexedSeq(PENDING, READY, FAILED)
  }
}
