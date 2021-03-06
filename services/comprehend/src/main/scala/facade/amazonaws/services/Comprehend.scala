package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object comprehend {
  type AnyLengthString = String
  type AttributeNamesList = js.Array[AttributeNamesListItem]
  type AttributeNamesListItem = String
  type BatchItemErrorList = js.Array[BatchItemError]
  type ClientRequestTokenString = String
  type ComprehendArn = String
  type ComprehendArnName = String
  type ComprehendEndpointArn = String
  type ComprehendEndpointName = String
  type ComprehendModelArn = String
  type CustomerInputString = String
  type CustomerInputStringList = js.Array[CustomerInputString]
  type DocumentClassificationJobPropertiesList = js.Array[DocumentClassificationJobProperties]
  type DocumentClassifierArn = String
  type DocumentClassifierAugmentedManifestsList = js.Array[AugmentedManifestsListItem]
  type DocumentClassifierEndpointArn = String
  type DocumentClassifierPropertiesList = js.Array[DocumentClassifierProperties]
  type DominantLanguageDetectionJobPropertiesList = js.Array[DominantLanguageDetectionJobProperties]
  type EndpointPropertiesList = js.Array[EndpointProperties]
  type EntitiesDetectionJobPropertiesList = js.Array[EntitiesDetectionJobProperties]
  type EntityRecognizerArn = String
  type EntityRecognizerAugmentedManifestsList = js.Array[AugmentedManifestsListItem]
  type EntityRecognizerEndpointArn = String
  type EntityRecognizerMetadataEntityTypesList = js.Array[EntityRecognizerMetadataEntityTypesListItem]
  type EntityRecognizerPropertiesList = js.Array[EntityRecognizerProperties]
  type EntityTypeName = String
  type EntityTypesList = js.Array[EntityTypesListItem]
  type EventTypeString = String
  type EventsDetectionJobPropertiesList = js.Array[EventsDetectionJobProperties]
  type IamRoleArn = String
  type InferenceUnitsInteger = Int
  type JobId = String
  type JobName = String
  type KeyPhrasesDetectionJobPropertiesList = js.Array[KeyPhrasesDetectionJobProperties]
  type KmsKeyId = String
  type LabelDelimiter = String
  type ListOfClasses = js.Array[DocumentClass]
  type ListOfDetectDominantLanguageResult = js.Array[BatchDetectDominantLanguageItemResult]
  type ListOfDetectEntitiesResult = js.Array[BatchDetectEntitiesItemResult]
  type ListOfDetectKeyPhrasesResult = js.Array[BatchDetectKeyPhrasesItemResult]
  type ListOfDetectSentimentResult = js.Array[BatchDetectSentimentItemResult]
  type ListOfDetectSyntaxResult = js.Array[BatchDetectSyntaxItemResult]
  type ListOfDominantLanguages = js.Array[DominantLanguage]
  type ListOfEntities = js.Array[Entity]
  type ListOfEntityLabels = js.Array[EntityLabel]
  type ListOfKeyPhrases = js.Array[KeyPhrase]
  type ListOfLabels = js.Array[DocumentLabel]
  type ListOfPiiEntities = js.Array[PiiEntity]
  type ListOfPiiEntityTypes = js.Array[PiiEntityType]
  type ListOfSyntaxTokens = js.Array[SyntaxToken]
  type MaskCharacter = String
  type MaxResultsInteger = Int
  type NumberOfTopicsInteger = Int
  type PiiEntitiesDetectionJobPropertiesList = js.Array[PiiEntitiesDetectionJobProperties]
  type S3Uri = String
  type SecurityGroupId = String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type SentimentDetectionJobPropertiesList = js.Array[SentimentDetectionJobProperties]
  type SubnetId = String
  type Subnets = js.Array[SubnetId]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TargetEventTypes = js.Array[EventTypeString]
  type Timestamp = js.Date
  type TopicsDetectionJobPropertiesList = js.Array[TopicsDetectionJobProperties]

  implicit final class ComprehendOps(private val service: Comprehend) extends AnyVal {

    @inline def batchDetectDominantLanguageFuture(params: BatchDetectDominantLanguageRequest): Future[BatchDetectDominantLanguageResponse] = service.batchDetectDominantLanguage(params).promise().toFuture
    @inline def batchDetectEntitiesFuture(params: BatchDetectEntitiesRequest): Future[BatchDetectEntitiesResponse] = service.batchDetectEntities(params).promise().toFuture
    @inline def batchDetectKeyPhrasesFuture(params: BatchDetectKeyPhrasesRequest): Future[BatchDetectKeyPhrasesResponse] = service.batchDetectKeyPhrases(params).promise().toFuture
    @inline def batchDetectSentimentFuture(params: BatchDetectSentimentRequest): Future[BatchDetectSentimentResponse] = service.batchDetectSentiment(params).promise().toFuture
    @inline def batchDetectSyntaxFuture(params: BatchDetectSyntaxRequest): Future[BatchDetectSyntaxResponse] = service.batchDetectSyntax(params).promise().toFuture
    @inline def classifyDocumentFuture(params: ClassifyDocumentRequest): Future[ClassifyDocumentResponse] = service.classifyDocument(params).promise().toFuture
    @inline def containsPiiEntitiesFuture(params: ContainsPiiEntitiesRequest): Future[ContainsPiiEntitiesResponse] = service.containsPiiEntities(params).promise().toFuture
    @inline def createDocumentClassifierFuture(params: CreateDocumentClassifierRequest): Future[CreateDocumentClassifierResponse] = service.createDocumentClassifier(params).promise().toFuture
    @inline def createEndpointFuture(params: CreateEndpointRequest): Future[CreateEndpointResponse] = service.createEndpoint(params).promise().toFuture
    @inline def createEntityRecognizerFuture(params: CreateEntityRecognizerRequest): Future[CreateEntityRecognizerResponse] = service.createEntityRecognizer(params).promise().toFuture
    @inline def deleteDocumentClassifierFuture(params: DeleteDocumentClassifierRequest): Future[DeleteDocumentClassifierResponse] = service.deleteDocumentClassifier(params).promise().toFuture
    @inline def deleteEndpointFuture(params: DeleteEndpointRequest): Future[DeleteEndpointResponse] = service.deleteEndpoint(params).promise().toFuture
    @inline def deleteEntityRecognizerFuture(params: DeleteEntityRecognizerRequest): Future[DeleteEntityRecognizerResponse] = service.deleteEntityRecognizer(params).promise().toFuture
    @inline def describeDocumentClassificationJobFuture(params: DescribeDocumentClassificationJobRequest): Future[DescribeDocumentClassificationJobResponse] = service.describeDocumentClassificationJob(params).promise().toFuture
    @inline def describeDocumentClassifierFuture(params: DescribeDocumentClassifierRequest): Future[DescribeDocumentClassifierResponse] = service.describeDocumentClassifier(params).promise().toFuture
    @inline def describeDominantLanguageDetectionJobFuture(params: DescribeDominantLanguageDetectionJobRequest): Future[DescribeDominantLanguageDetectionJobResponse] = service.describeDominantLanguageDetectionJob(params).promise().toFuture
    @inline def describeEndpointFuture(params: DescribeEndpointRequest): Future[DescribeEndpointResponse] = service.describeEndpoint(params).promise().toFuture
    @inline def describeEntitiesDetectionJobFuture(params: DescribeEntitiesDetectionJobRequest): Future[DescribeEntitiesDetectionJobResponse] = service.describeEntitiesDetectionJob(params).promise().toFuture
    @inline def describeEntityRecognizerFuture(params: DescribeEntityRecognizerRequest): Future[DescribeEntityRecognizerResponse] = service.describeEntityRecognizer(params).promise().toFuture
    @inline def describeEventsDetectionJobFuture(params: DescribeEventsDetectionJobRequest): Future[DescribeEventsDetectionJobResponse] = service.describeEventsDetectionJob(params).promise().toFuture
    @inline def describeKeyPhrasesDetectionJobFuture(params: DescribeKeyPhrasesDetectionJobRequest): Future[DescribeKeyPhrasesDetectionJobResponse] = service.describeKeyPhrasesDetectionJob(params).promise().toFuture
    @inline def describePiiEntitiesDetectionJobFuture(params: DescribePiiEntitiesDetectionJobRequest): Future[DescribePiiEntitiesDetectionJobResponse] = service.describePiiEntitiesDetectionJob(params).promise().toFuture
    @inline def describeSentimentDetectionJobFuture(params: DescribeSentimentDetectionJobRequest): Future[DescribeSentimentDetectionJobResponse] = service.describeSentimentDetectionJob(params).promise().toFuture
    @inline def describeTopicsDetectionJobFuture(params: DescribeTopicsDetectionJobRequest): Future[DescribeTopicsDetectionJobResponse] = service.describeTopicsDetectionJob(params).promise().toFuture
    @inline def detectDominantLanguageFuture(params: DetectDominantLanguageRequest): Future[DetectDominantLanguageResponse] = service.detectDominantLanguage(params).promise().toFuture
    @inline def detectEntitiesFuture(params: DetectEntitiesRequest): Future[DetectEntitiesResponse] = service.detectEntities(params).promise().toFuture
    @inline def detectKeyPhrasesFuture(params: DetectKeyPhrasesRequest): Future[DetectKeyPhrasesResponse] = service.detectKeyPhrases(params).promise().toFuture
    @inline def detectPiiEntitiesFuture(params: DetectPiiEntitiesRequest): Future[DetectPiiEntitiesResponse] = service.detectPiiEntities(params).promise().toFuture
    @inline def detectSentimentFuture(params: DetectSentimentRequest): Future[DetectSentimentResponse] = service.detectSentiment(params).promise().toFuture
    @inline def detectSyntaxFuture(params: DetectSyntaxRequest): Future[DetectSyntaxResponse] = service.detectSyntax(params).promise().toFuture
    @inline def listDocumentClassificationJobsFuture(params: ListDocumentClassificationJobsRequest): Future[ListDocumentClassificationJobsResponse] = service.listDocumentClassificationJobs(params).promise().toFuture
    @inline def listDocumentClassifiersFuture(params: ListDocumentClassifiersRequest): Future[ListDocumentClassifiersResponse] = service.listDocumentClassifiers(params).promise().toFuture
    @inline def listDominantLanguageDetectionJobsFuture(params: ListDominantLanguageDetectionJobsRequest): Future[ListDominantLanguageDetectionJobsResponse] = service.listDominantLanguageDetectionJobs(params).promise().toFuture
    @inline def listEndpointsFuture(params: ListEndpointsRequest): Future[ListEndpointsResponse] = service.listEndpoints(params).promise().toFuture
    @inline def listEntitiesDetectionJobsFuture(params: ListEntitiesDetectionJobsRequest): Future[ListEntitiesDetectionJobsResponse] = service.listEntitiesDetectionJobs(params).promise().toFuture
    @inline def listEntityRecognizersFuture(params: ListEntityRecognizersRequest): Future[ListEntityRecognizersResponse] = service.listEntityRecognizers(params).promise().toFuture
    @inline def listEventsDetectionJobsFuture(params: ListEventsDetectionJobsRequest): Future[ListEventsDetectionJobsResponse] = service.listEventsDetectionJobs(params).promise().toFuture
    @inline def listKeyPhrasesDetectionJobsFuture(params: ListKeyPhrasesDetectionJobsRequest): Future[ListKeyPhrasesDetectionJobsResponse] = service.listKeyPhrasesDetectionJobs(params).promise().toFuture
    @inline def listPiiEntitiesDetectionJobsFuture(params: ListPiiEntitiesDetectionJobsRequest): Future[ListPiiEntitiesDetectionJobsResponse] = service.listPiiEntitiesDetectionJobs(params).promise().toFuture
    @inline def listSentimentDetectionJobsFuture(params: ListSentimentDetectionJobsRequest): Future[ListSentimentDetectionJobsResponse] = service.listSentimentDetectionJobs(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTopicsDetectionJobsFuture(params: ListTopicsDetectionJobsRequest): Future[ListTopicsDetectionJobsResponse] = service.listTopicsDetectionJobs(params).promise().toFuture
    @inline def startDocumentClassificationJobFuture(params: StartDocumentClassificationJobRequest): Future[StartDocumentClassificationJobResponse] = service.startDocumentClassificationJob(params).promise().toFuture
    @inline def startDominantLanguageDetectionJobFuture(params: StartDominantLanguageDetectionJobRequest): Future[StartDominantLanguageDetectionJobResponse] = service.startDominantLanguageDetectionJob(params).promise().toFuture
    @inline def startEntitiesDetectionJobFuture(params: StartEntitiesDetectionJobRequest): Future[StartEntitiesDetectionJobResponse] = service.startEntitiesDetectionJob(params).promise().toFuture
    @inline def startEventsDetectionJobFuture(params: StartEventsDetectionJobRequest): Future[StartEventsDetectionJobResponse] = service.startEventsDetectionJob(params).promise().toFuture
    @inline def startKeyPhrasesDetectionJobFuture(params: StartKeyPhrasesDetectionJobRequest): Future[StartKeyPhrasesDetectionJobResponse] = service.startKeyPhrasesDetectionJob(params).promise().toFuture
    @inline def startPiiEntitiesDetectionJobFuture(params: StartPiiEntitiesDetectionJobRequest): Future[StartPiiEntitiesDetectionJobResponse] = service.startPiiEntitiesDetectionJob(params).promise().toFuture
    @inline def startSentimentDetectionJobFuture(params: StartSentimentDetectionJobRequest): Future[StartSentimentDetectionJobResponse] = service.startSentimentDetectionJob(params).promise().toFuture
    @inline def startTopicsDetectionJobFuture(params: StartTopicsDetectionJobRequest): Future[StartTopicsDetectionJobResponse] = service.startTopicsDetectionJob(params).promise().toFuture
    @inline def stopDominantLanguageDetectionJobFuture(params: StopDominantLanguageDetectionJobRequest): Future[StopDominantLanguageDetectionJobResponse] = service.stopDominantLanguageDetectionJob(params).promise().toFuture
    @inline def stopEntitiesDetectionJobFuture(params: StopEntitiesDetectionJobRequest): Future[StopEntitiesDetectionJobResponse] = service.stopEntitiesDetectionJob(params).promise().toFuture
    @inline def stopEventsDetectionJobFuture(params: StopEventsDetectionJobRequest): Future[StopEventsDetectionJobResponse] = service.stopEventsDetectionJob(params).promise().toFuture
    @inline def stopKeyPhrasesDetectionJobFuture(params: StopKeyPhrasesDetectionJobRequest): Future[StopKeyPhrasesDetectionJobResponse] = service.stopKeyPhrasesDetectionJob(params).promise().toFuture
    @inline def stopPiiEntitiesDetectionJobFuture(params: StopPiiEntitiesDetectionJobRequest): Future[StopPiiEntitiesDetectionJobResponse] = service.stopPiiEntitiesDetectionJob(params).promise().toFuture
    @inline def stopSentimentDetectionJobFuture(params: StopSentimentDetectionJobRequest): Future[StopSentimentDetectionJobResponse] = service.stopSentimentDetectionJob(params).promise().toFuture
    @inline def stopTrainingDocumentClassifierFuture(params: StopTrainingDocumentClassifierRequest): Future[StopTrainingDocumentClassifierResponse] = service.stopTrainingDocumentClassifier(params).promise().toFuture
    @inline def stopTrainingEntityRecognizerFuture(params: StopTrainingEntityRecognizerRequest): Future[StopTrainingEntityRecognizerResponse] = service.stopTrainingEntityRecognizer(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateEndpointFuture(params: UpdateEndpointRequest): Future[UpdateEndpointResponse] = service.updateEndpoint(params).promise().toFuture

  }
}

package comprehend {
  @js.native
  @JSImport("aws-sdk/clients/comprehend", JSImport.Namespace, "AWS.Comprehend")
  class Comprehend() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchDetectDominantLanguage(params: BatchDetectDominantLanguageRequest): Request[BatchDetectDominantLanguageResponse] = js.native
    def batchDetectEntities(params: BatchDetectEntitiesRequest): Request[BatchDetectEntitiesResponse] = js.native
    def batchDetectKeyPhrases(params: BatchDetectKeyPhrasesRequest): Request[BatchDetectKeyPhrasesResponse] = js.native
    def batchDetectSentiment(params: BatchDetectSentimentRequest): Request[BatchDetectSentimentResponse] = js.native
    def batchDetectSyntax(params: BatchDetectSyntaxRequest): Request[BatchDetectSyntaxResponse] = js.native
    def classifyDocument(params: ClassifyDocumentRequest): Request[ClassifyDocumentResponse] = js.native
    def containsPiiEntities(params: ContainsPiiEntitiesRequest): Request[ContainsPiiEntitiesResponse] = js.native
    def createDocumentClassifier(params: CreateDocumentClassifierRequest): Request[CreateDocumentClassifierResponse] = js.native
    def createEndpoint(params: CreateEndpointRequest): Request[CreateEndpointResponse] = js.native
    def createEntityRecognizer(params: CreateEntityRecognizerRequest): Request[CreateEntityRecognizerResponse] = js.native
    def deleteDocumentClassifier(params: DeleteDocumentClassifierRequest): Request[DeleteDocumentClassifierResponse] = js.native
    def deleteEndpoint(params: DeleteEndpointRequest): Request[DeleteEndpointResponse] = js.native
    def deleteEntityRecognizer(params: DeleteEntityRecognizerRequest): Request[DeleteEntityRecognizerResponse] = js.native
    def describeDocumentClassificationJob(params: DescribeDocumentClassificationJobRequest): Request[DescribeDocumentClassificationJobResponse] = js.native
    def describeDocumentClassifier(params: DescribeDocumentClassifierRequest): Request[DescribeDocumentClassifierResponse] = js.native
    def describeDominantLanguageDetectionJob(params: DescribeDominantLanguageDetectionJobRequest): Request[DescribeDominantLanguageDetectionJobResponse] = js.native
    def describeEndpoint(params: DescribeEndpointRequest): Request[DescribeEndpointResponse] = js.native
    def describeEntitiesDetectionJob(params: DescribeEntitiesDetectionJobRequest): Request[DescribeEntitiesDetectionJobResponse] = js.native
    def describeEntityRecognizer(params: DescribeEntityRecognizerRequest): Request[DescribeEntityRecognizerResponse] = js.native
    def describeEventsDetectionJob(params: DescribeEventsDetectionJobRequest): Request[DescribeEventsDetectionJobResponse] = js.native
    def describeKeyPhrasesDetectionJob(params: DescribeKeyPhrasesDetectionJobRequest): Request[DescribeKeyPhrasesDetectionJobResponse] = js.native
    def describePiiEntitiesDetectionJob(params: DescribePiiEntitiesDetectionJobRequest): Request[DescribePiiEntitiesDetectionJobResponse] = js.native
    def describeSentimentDetectionJob(params: DescribeSentimentDetectionJobRequest): Request[DescribeSentimentDetectionJobResponse] = js.native
    def describeTopicsDetectionJob(params: DescribeTopicsDetectionJobRequest): Request[DescribeTopicsDetectionJobResponse] = js.native
    def detectDominantLanguage(params: DetectDominantLanguageRequest): Request[DetectDominantLanguageResponse] = js.native
    def detectEntities(params: DetectEntitiesRequest): Request[DetectEntitiesResponse] = js.native
    def detectKeyPhrases(params: DetectKeyPhrasesRequest): Request[DetectKeyPhrasesResponse] = js.native
    def detectPiiEntities(params: DetectPiiEntitiesRequest): Request[DetectPiiEntitiesResponse] = js.native
    def detectSentiment(params: DetectSentimentRequest): Request[DetectSentimentResponse] = js.native
    def detectSyntax(params: DetectSyntaxRequest): Request[DetectSyntaxResponse] = js.native
    def listDocumentClassificationJobs(params: ListDocumentClassificationJobsRequest): Request[ListDocumentClassificationJobsResponse] = js.native
    def listDocumentClassifiers(params: ListDocumentClassifiersRequest): Request[ListDocumentClassifiersResponse] = js.native
    def listDominantLanguageDetectionJobs(params: ListDominantLanguageDetectionJobsRequest): Request[ListDominantLanguageDetectionJobsResponse] = js.native
    def listEndpoints(params: ListEndpointsRequest): Request[ListEndpointsResponse] = js.native
    def listEntitiesDetectionJobs(params: ListEntitiesDetectionJobsRequest): Request[ListEntitiesDetectionJobsResponse] = js.native
    def listEntityRecognizers(params: ListEntityRecognizersRequest): Request[ListEntityRecognizersResponse] = js.native
    def listEventsDetectionJobs(params: ListEventsDetectionJobsRequest): Request[ListEventsDetectionJobsResponse] = js.native
    def listKeyPhrasesDetectionJobs(params: ListKeyPhrasesDetectionJobsRequest): Request[ListKeyPhrasesDetectionJobsResponse] = js.native
    def listPiiEntitiesDetectionJobs(params: ListPiiEntitiesDetectionJobsRequest): Request[ListPiiEntitiesDetectionJobsResponse] = js.native
    def listSentimentDetectionJobs(params: ListSentimentDetectionJobsRequest): Request[ListSentimentDetectionJobsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTopicsDetectionJobs(params: ListTopicsDetectionJobsRequest): Request[ListTopicsDetectionJobsResponse] = js.native
    def startDocumentClassificationJob(params: StartDocumentClassificationJobRequest): Request[StartDocumentClassificationJobResponse] = js.native
    def startDominantLanguageDetectionJob(params: StartDominantLanguageDetectionJobRequest): Request[StartDominantLanguageDetectionJobResponse] = js.native
    def startEntitiesDetectionJob(params: StartEntitiesDetectionJobRequest): Request[StartEntitiesDetectionJobResponse] = js.native
    def startEventsDetectionJob(params: StartEventsDetectionJobRequest): Request[StartEventsDetectionJobResponse] = js.native
    def startKeyPhrasesDetectionJob(params: StartKeyPhrasesDetectionJobRequest): Request[StartKeyPhrasesDetectionJobResponse] = js.native
    def startPiiEntitiesDetectionJob(params: StartPiiEntitiesDetectionJobRequest): Request[StartPiiEntitiesDetectionJobResponse] = js.native
    def startSentimentDetectionJob(params: StartSentimentDetectionJobRequest): Request[StartSentimentDetectionJobResponse] = js.native
    def startTopicsDetectionJob(params: StartTopicsDetectionJobRequest): Request[StartTopicsDetectionJobResponse] = js.native
    def stopDominantLanguageDetectionJob(params: StopDominantLanguageDetectionJobRequest): Request[StopDominantLanguageDetectionJobResponse] = js.native
    def stopEntitiesDetectionJob(params: StopEntitiesDetectionJobRequest): Request[StopEntitiesDetectionJobResponse] = js.native
    def stopEventsDetectionJob(params: StopEventsDetectionJobRequest): Request[StopEventsDetectionJobResponse] = js.native
    def stopKeyPhrasesDetectionJob(params: StopKeyPhrasesDetectionJobRequest): Request[StopKeyPhrasesDetectionJobResponse] = js.native
    def stopPiiEntitiesDetectionJob(params: StopPiiEntitiesDetectionJobRequest): Request[StopPiiEntitiesDetectionJobResponse] = js.native
    def stopSentimentDetectionJob(params: StopSentimentDetectionJobRequest): Request[StopSentimentDetectionJobResponse] = js.native
    def stopTrainingDocumentClassifier(params: StopTrainingDocumentClassifierRequest): Request[StopTrainingDocumentClassifierResponse] = js.native
    def stopTrainingEntityRecognizer(params: StopTrainingEntityRecognizerRequest): Request[StopTrainingEntityRecognizerResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateEndpoint(params: UpdateEndpointRequest): Request[UpdateEndpointResponse] = js.native
  }

  /** An augmented manifest file that provides training data for your custom model. An augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground Truth.
    */
  @js.native
  trait AugmentedManifestsListItem extends js.Object {
    var AttributeNames: AttributeNamesList
    var S3Uri: S3Uri
  }

  object AugmentedManifestsListItem {
    @inline
    def apply(
        AttributeNames: AttributeNamesList,
        S3Uri: S3Uri
    ): AugmentedManifestsListItem = {
      val __obj = js.Dynamic.literal(
        "AttributeNames" -> AttributeNames.asInstanceOf[js.Any],
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AugmentedManifestsListItem]
    }
  }

  /** The result of calling the operation. The operation returns one object for each document that is successfully processed by the operation.
    */
  @js.native
  trait BatchDetectDominantLanguageItemResult extends js.Object {
    var Index: js.UndefOr[Int]
    var Languages: js.UndefOr[ListOfDominantLanguages]
  }

  object BatchDetectDominantLanguageItemResult {
    @inline
    def apply(
        Index: js.UndefOr[Int] = js.undefined,
        Languages: js.UndefOr[ListOfDominantLanguages] = js.undefined
    ): BatchDetectDominantLanguageItemResult = {
      val __obj = js.Dynamic.literal()
      Index.foreach(__v => __obj.updateDynamic("Index")(__v.asInstanceOf[js.Any]))
      Languages.foreach(__v => __obj.updateDynamic("Languages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDetectDominantLanguageItemResult]
    }
  }

  @js.native
  trait BatchDetectDominantLanguageRequest extends js.Object {
    var TextList: CustomerInputStringList
  }

  object BatchDetectDominantLanguageRequest {
    @inline
    def apply(
        TextList: CustomerInputStringList
    ): BatchDetectDominantLanguageRequest = {
      val __obj = js.Dynamic.literal(
        "TextList" -> TextList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDetectDominantLanguageRequest]
    }
  }

  @js.native
  trait BatchDetectDominantLanguageResponse extends js.Object {
    var ErrorList: BatchItemErrorList
    var ResultList: ListOfDetectDominantLanguageResult
  }

  object BatchDetectDominantLanguageResponse {
    @inline
    def apply(
        ErrorList: BatchItemErrorList,
        ResultList: ListOfDetectDominantLanguageResult
    ): BatchDetectDominantLanguageResponse = {
      val __obj = js.Dynamic.literal(
        "ErrorList" -> ErrorList.asInstanceOf[js.Any],
        "ResultList" -> ResultList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDetectDominantLanguageResponse]
    }
  }

  /** The result of calling the operation. The operation returns one object for each document that is successfully processed by the operation.
    */
  @js.native
  trait BatchDetectEntitiesItemResult extends js.Object {
    var Entities: js.UndefOr[ListOfEntities]
    var Index: js.UndefOr[Int]
  }

  object BatchDetectEntitiesItemResult {
    @inline
    def apply(
        Entities: js.UndefOr[ListOfEntities] = js.undefined,
        Index: js.UndefOr[Int] = js.undefined
    ): BatchDetectEntitiesItemResult = {
      val __obj = js.Dynamic.literal()
      Entities.foreach(__v => __obj.updateDynamic("Entities")(__v.asInstanceOf[js.Any]))
      Index.foreach(__v => __obj.updateDynamic("Index")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDetectEntitiesItemResult]
    }
  }

  @js.native
  trait BatchDetectEntitiesRequest extends js.Object {
    var LanguageCode: LanguageCode
    var TextList: CustomerInputStringList
  }

  object BatchDetectEntitiesRequest {
    @inline
    def apply(
        LanguageCode: LanguageCode,
        TextList: CustomerInputStringList
    ): BatchDetectEntitiesRequest = {
      val __obj = js.Dynamic.literal(
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "TextList" -> TextList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDetectEntitiesRequest]
    }
  }

  @js.native
  trait BatchDetectEntitiesResponse extends js.Object {
    var ErrorList: BatchItemErrorList
    var ResultList: ListOfDetectEntitiesResult
  }

  object BatchDetectEntitiesResponse {
    @inline
    def apply(
        ErrorList: BatchItemErrorList,
        ResultList: ListOfDetectEntitiesResult
    ): BatchDetectEntitiesResponse = {
      val __obj = js.Dynamic.literal(
        "ErrorList" -> ErrorList.asInstanceOf[js.Any],
        "ResultList" -> ResultList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDetectEntitiesResponse]
    }
  }

  /** The result of calling the operation. The operation returns one object for each document that is successfully processed by the operation.
    */
  @js.native
  trait BatchDetectKeyPhrasesItemResult extends js.Object {
    var Index: js.UndefOr[Int]
    var KeyPhrases: js.UndefOr[ListOfKeyPhrases]
  }

  object BatchDetectKeyPhrasesItemResult {
    @inline
    def apply(
        Index: js.UndefOr[Int] = js.undefined,
        KeyPhrases: js.UndefOr[ListOfKeyPhrases] = js.undefined
    ): BatchDetectKeyPhrasesItemResult = {
      val __obj = js.Dynamic.literal()
      Index.foreach(__v => __obj.updateDynamic("Index")(__v.asInstanceOf[js.Any]))
      KeyPhrases.foreach(__v => __obj.updateDynamic("KeyPhrases")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDetectKeyPhrasesItemResult]
    }
  }

  @js.native
  trait BatchDetectKeyPhrasesRequest extends js.Object {
    var LanguageCode: LanguageCode
    var TextList: CustomerInputStringList
  }

  object BatchDetectKeyPhrasesRequest {
    @inline
    def apply(
        LanguageCode: LanguageCode,
        TextList: CustomerInputStringList
    ): BatchDetectKeyPhrasesRequest = {
      val __obj = js.Dynamic.literal(
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "TextList" -> TextList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDetectKeyPhrasesRequest]
    }
  }

  @js.native
  trait BatchDetectKeyPhrasesResponse extends js.Object {
    var ErrorList: BatchItemErrorList
    var ResultList: ListOfDetectKeyPhrasesResult
  }

  object BatchDetectKeyPhrasesResponse {
    @inline
    def apply(
        ErrorList: BatchItemErrorList,
        ResultList: ListOfDetectKeyPhrasesResult
    ): BatchDetectKeyPhrasesResponse = {
      val __obj = js.Dynamic.literal(
        "ErrorList" -> ErrorList.asInstanceOf[js.Any],
        "ResultList" -> ResultList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDetectKeyPhrasesResponse]
    }
  }

  /** The result of calling the operation. The operation returns one object for each document that is successfully processed by the operation.
    */
  @js.native
  trait BatchDetectSentimentItemResult extends js.Object {
    var Index: js.UndefOr[Int]
    var Sentiment: js.UndefOr[SentimentType]
    var SentimentScore: js.UndefOr[SentimentScore]
  }

  object BatchDetectSentimentItemResult {
    @inline
    def apply(
        Index: js.UndefOr[Int] = js.undefined,
        Sentiment: js.UndefOr[SentimentType] = js.undefined,
        SentimentScore: js.UndefOr[SentimentScore] = js.undefined
    ): BatchDetectSentimentItemResult = {
      val __obj = js.Dynamic.literal()
      Index.foreach(__v => __obj.updateDynamic("Index")(__v.asInstanceOf[js.Any]))
      Sentiment.foreach(__v => __obj.updateDynamic("Sentiment")(__v.asInstanceOf[js.Any]))
      SentimentScore.foreach(__v => __obj.updateDynamic("SentimentScore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDetectSentimentItemResult]
    }
  }

  @js.native
  trait BatchDetectSentimentRequest extends js.Object {
    var LanguageCode: LanguageCode
    var TextList: CustomerInputStringList
  }

  object BatchDetectSentimentRequest {
    @inline
    def apply(
        LanguageCode: LanguageCode,
        TextList: CustomerInputStringList
    ): BatchDetectSentimentRequest = {
      val __obj = js.Dynamic.literal(
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "TextList" -> TextList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDetectSentimentRequest]
    }
  }

  @js.native
  trait BatchDetectSentimentResponse extends js.Object {
    var ErrorList: BatchItemErrorList
    var ResultList: ListOfDetectSentimentResult
  }

  object BatchDetectSentimentResponse {
    @inline
    def apply(
        ErrorList: BatchItemErrorList,
        ResultList: ListOfDetectSentimentResult
    ): BatchDetectSentimentResponse = {
      val __obj = js.Dynamic.literal(
        "ErrorList" -> ErrorList.asInstanceOf[js.Any],
        "ResultList" -> ResultList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDetectSentimentResponse]
    }
  }

  /** The result of calling the operation. The operation returns one object that is successfully processed by the operation.
    */
  @js.native
  trait BatchDetectSyntaxItemResult extends js.Object {
    var Index: js.UndefOr[Int]
    var SyntaxTokens: js.UndefOr[ListOfSyntaxTokens]
  }

  object BatchDetectSyntaxItemResult {
    @inline
    def apply(
        Index: js.UndefOr[Int] = js.undefined,
        SyntaxTokens: js.UndefOr[ListOfSyntaxTokens] = js.undefined
    ): BatchDetectSyntaxItemResult = {
      val __obj = js.Dynamic.literal()
      Index.foreach(__v => __obj.updateDynamic("Index")(__v.asInstanceOf[js.Any]))
      SyntaxTokens.foreach(__v => __obj.updateDynamic("SyntaxTokens")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDetectSyntaxItemResult]
    }
  }

  @js.native
  trait BatchDetectSyntaxRequest extends js.Object {
    var LanguageCode: SyntaxLanguageCode
    var TextList: CustomerInputStringList
  }

  object BatchDetectSyntaxRequest {
    @inline
    def apply(
        LanguageCode: SyntaxLanguageCode,
        TextList: CustomerInputStringList
    ): BatchDetectSyntaxRequest = {
      val __obj = js.Dynamic.literal(
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "TextList" -> TextList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDetectSyntaxRequest]
    }
  }

  @js.native
  trait BatchDetectSyntaxResponse extends js.Object {
    var ErrorList: BatchItemErrorList
    var ResultList: ListOfDetectSyntaxResult
  }

  object BatchDetectSyntaxResponse {
    @inline
    def apply(
        ErrorList: BatchItemErrorList,
        ResultList: ListOfDetectSyntaxResult
    ): BatchDetectSyntaxResponse = {
      val __obj = js.Dynamic.literal(
        "ErrorList" -> ErrorList.asInstanceOf[js.Any],
        "ResultList" -> ResultList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDetectSyntaxResponse]
    }
  }

  /** Describes an error that occurred while processing a document in a batch. The operation returns on <code>BatchItemError</code> object for each document that contained an error.
    */
  @js.native
  trait BatchItemError extends js.Object {
    var ErrorCode: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
    var Index: js.UndefOr[Int]
  }

  object BatchItemError {
    @inline
    def apply(
        ErrorCode: js.UndefOr[String] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        Index: js.UndefOr[Int] = js.undefined
    ): BatchItemError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      Index.foreach(__v => __obj.updateDynamic("Index")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchItemError]
    }
  }

  /** Describes the result metrics for the test data associated with an documentation classifier.
    */
  @js.native
  trait ClassifierEvaluationMetrics extends js.Object {
    var Accuracy: js.UndefOr[Double]
    var F1Score: js.UndefOr[Double]
    var HammingLoss: js.UndefOr[Double]
    var MicroF1Score: js.UndefOr[Double]
    var MicroPrecision: js.UndefOr[Double]
    var MicroRecall: js.UndefOr[Double]
    var Precision: js.UndefOr[Double]
    var Recall: js.UndefOr[Double]
  }

  object ClassifierEvaluationMetrics {
    @inline
    def apply(
        Accuracy: js.UndefOr[Double] = js.undefined,
        F1Score: js.UndefOr[Double] = js.undefined,
        HammingLoss: js.UndefOr[Double] = js.undefined,
        MicroF1Score: js.UndefOr[Double] = js.undefined,
        MicroPrecision: js.UndefOr[Double] = js.undefined,
        MicroRecall: js.UndefOr[Double] = js.undefined,
        Precision: js.UndefOr[Double] = js.undefined,
        Recall: js.UndefOr[Double] = js.undefined
    ): ClassifierEvaluationMetrics = {
      val __obj = js.Dynamic.literal()
      Accuracy.foreach(__v => __obj.updateDynamic("Accuracy")(__v.asInstanceOf[js.Any]))
      F1Score.foreach(__v => __obj.updateDynamic("F1Score")(__v.asInstanceOf[js.Any]))
      HammingLoss.foreach(__v => __obj.updateDynamic("HammingLoss")(__v.asInstanceOf[js.Any]))
      MicroF1Score.foreach(__v => __obj.updateDynamic("MicroF1Score")(__v.asInstanceOf[js.Any]))
      MicroPrecision.foreach(__v => __obj.updateDynamic("MicroPrecision")(__v.asInstanceOf[js.Any]))
      MicroRecall.foreach(__v => __obj.updateDynamic("MicroRecall")(__v.asInstanceOf[js.Any]))
      Precision.foreach(__v => __obj.updateDynamic("Precision")(__v.asInstanceOf[js.Any]))
      Recall.foreach(__v => __obj.updateDynamic("Recall")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClassifierEvaluationMetrics]
    }
  }

  /** Provides information about a document classifier.
    */
  @js.native
  trait ClassifierMetadata extends js.Object {
    var EvaluationMetrics: js.UndefOr[ClassifierEvaluationMetrics]
    var NumberOfLabels: js.UndefOr[Int]
    var NumberOfTestDocuments: js.UndefOr[Int]
    var NumberOfTrainedDocuments: js.UndefOr[Int]
  }

  object ClassifierMetadata {
    @inline
    def apply(
        EvaluationMetrics: js.UndefOr[ClassifierEvaluationMetrics] = js.undefined,
        NumberOfLabels: js.UndefOr[Int] = js.undefined,
        NumberOfTestDocuments: js.UndefOr[Int] = js.undefined,
        NumberOfTrainedDocuments: js.UndefOr[Int] = js.undefined
    ): ClassifierMetadata = {
      val __obj = js.Dynamic.literal()
      EvaluationMetrics.foreach(__v => __obj.updateDynamic("EvaluationMetrics")(__v.asInstanceOf[js.Any]))
      NumberOfLabels.foreach(__v => __obj.updateDynamic("NumberOfLabels")(__v.asInstanceOf[js.Any]))
      NumberOfTestDocuments.foreach(__v => __obj.updateDynamic("NumberOfTestDocuments")(__v.asInstanceOf[js.Any]))
      NumberOfTrainedDocuments.foreach(__v => __obj.updateDynamic("NumberOfTrainedDocuments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClassifierMetadata]
    }
  }

  @js.native
  trait ClassifyDocumentRequest extends js.Object {
    var EndpointArn: DocumentClassifierEndpointArn
    var Text: CustomerInputString
  }

  object ClassifyDocumentRequest {
    @inline
    def apply(
        EndpointArn: DocumentClassifierEndpointArn,
        Text: CustomerInputString
    ): ClassifyDocumentRequest = {
      val __obj = js.Dynamic.literal(
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any],
        "Text" -> Text.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ClassifyDocumentRequest]
    }
  }

  @js.native
  trait ClassifyDocumentResponse extends js.Object {
    var Classes: js.UndefOr[ListOfClasses]
    var Labels: js.UndefOr[ListOfLabels]
  }

  object ClassifyDocumentResponse {
    @inline
    def apply(
        Classes: js.UndefOr[ListOfClasses] = js.undefined,
        Labels: js.UndefOr[ListOfLabels] = js.undefined
    ): ClassifyDocumentResponse = {
      val __obj = js.Dynamic.literal()
      Classes.foreach(__v => __obj.updateDynamic("Classes")(__v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.updateDynamic("Labels")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClassifyDocumentResponse]
    }
  }

  @js.native
  trait ContainsPiiEntitiesRequest extends js.Object {
    var LanguageCode: LanguageCode
    var Text: String
  }

  object ContainsPiiEntitiesRequest {
    @inline
    def apply(
        LanguageCode: LanguageCode,
        Text: String
    ): ContainsPiiEntitiesRequest = {
      val __obj = js.Dynamic.literal(
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "Text" -> Text.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ContainsPiiEntitiesRequest]
    }
  }

  @js.native
  trait ContainsPiiEntitiesResponse extends js.Object {
    var Labels: js.UndefOr[ListOfEntityLabels]
  }

  object ContainsPiiEntitiesResponse {
    @inline
    def apply(
        Labels: js.UndefOr[ListOfEntityLabels] = js.undefined
    ): ContainsPiiEntitiesResponse = {
      val __obj = js.Dynamic.literal()
      Labels.foreach(__v => __obj.updateDynamic("Labels")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainsPiiEntitiesResponse]
    }
  }

  @js.native
  trait CreateDocumentClassifierRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var DocumentClassifierName: ComprehendArnName
    var InputDataConfig: DocumentClassifierInputDataConfig
    var LanguageCode: LanguageCode
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var Mode: js.UndefOr[DocumentClassifierMode]
    var ModelKmsKeyId: js.UndefOr[KmsKeyId]
    var OutputDataConfig: js.UndefOr[DocumentClassifierOutputDataConfig]
    var Tags: js.UndefOr[TagList]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object CreateDocumentClassifierRequest {
    @inline
    def apply(
        DataAccessRoleArn: IamRoleArn,
        DocumentClassifierName: ComprehendArnName,
        InputDataConfig: DocumentClassifierInputDataConfig,
        LanguageCode: LanguageCode,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        Mode: js.UndefOr[DocumentClassifierMode] = js.undefined,
        ModelKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        OutputDataConfig: js.UndefOr[DocumentClassifierOutputDataConfig] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): CreateDocumentClassifierRequest = {
      val __obj = js.Dynamic.literal(
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "DocumentClassifierName" -> DocumentClassifierName.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      ModelKmsKeyId.foreach(__v => __obj.updateDynamic("ModelKmsKeyId")(__v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.updateDynamic("OutputDataConfig")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDocumentClassifierRequest]
    }
  }

  @js.native
  trait CreateDocumentClassifierResponse extends js.Object {
    var DocumentClassifierArn: js.UndefOr[DocumentClassifierArn]
  }

  object CreateDocumentClassifierResponse {
    @inline
    def apply(
        DocumentClassifierArn: js.UndefOr[DocumentClassifierArn] = js.undefined
    ): CreateDocumentClassifierResponse = {
      val __obj = js.Dynamic.literal()
      DocumentClassifierArn.foreach(__v => __obj.updateDynamic("DocumentClassifierArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDocumentClassifierResponse]
    }
  }

  @js.native
  trait CreateEndpointRequest extends js.Object {
    var DesiredInferenceUnits: InferenceUnitsInteger
    var EndpointName: ComprehendEndpointName
    var ModelArn: ComprehendModelArn
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var Tags: js.UndefOr[TagList]
  }

  object CreateEndpointRequest {
    @inline
    def apply(
        DesiredInferenceUnits: InferenceUnitsInteger,
        EndpointName: ComprehendEndpointName,
        ModelArn: ComprehendModelArn,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "DesiredInferenceUnits" -> DesiredInferenceUnits.asInstanceOf[js.Any],
        "EndpointName" -> EndpointName.asInstanceOf[js.Any],
        "ModelArn" -> ModelArn.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      DataAccessRoleArn.foreach(__v => __obj.updateDynamic("DataAccessRoleArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEndpointRequest]
    }
  }

  @js.native
  trait CreateEndpointResponse extends js.Object {
    var EndpointArn: js.UndefOr[ComprehendEndpointArn]
  }

  object CreateEndpointResponse {
    @inline
    def apply(
        EndpointArn: js.UndefOr[ComprehendEndpointArn] = js.undefined
    ): CreateEndpointResponse = {
      val __obj = js.Dynamic.literal()
      EndpointArn.foreach(__v => __obj.updateDynamic("EndpointArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEndpointResponse]
    }
  }

  @js.native
  trait CreateEntityRecognizerRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: EntityRecognizerInputDataConfig
    var LanguageCode: LanguageCode
    var RecognizerName: ComprehendArnName
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var ModelKmsKeyId: js.UndefOr[KmsKeyId]
    var Tags: js.UndefOr[TagList]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object CreateEntityRecognizerRequest {
    @inline
    def apply(
        DataAccessRoleArn: IamRoleArn,
        InputDataConfig: EntityRecognizerInputDataConfig,
        LanguageCode: LanguageCode,
        RecognizerName: ComprehendArnName,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        ModelKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): CreateEntityRecognizerRequest = {
      val __obj = js.Dynamic.literal(
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "RecognizerName" -> RecognizerName.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      ModelKmsKeyId.foreach(__v => __obj.updateDynamic("ModelKmsKeyId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEntityRecognizerRequest]
    }
  }

  @js.native
  trait CreateEntityRecognizerResponse extends js.Object {
    var EntityRecognizerArn: js.UndefOr[EntityRecognizerArn]
  }

  object CreateEntityRecognizerResponse {
    @inline
    def apply(
        EntityRecognizerArn: js.UndefOr[EntityRecognizerArn] = js.undefined
    ): CreateEntityRecognizerResponse = {
      val __obj = js.Dynamic.literal()
      EntityRecognizerArn.foreach(__v => __obj.updateDynamic("EntityRecognizerArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEntityRecognizerResponse]
    }
  }

  @js.native
  trait DeleteDocumentClassifierRequest extends js.Object {
    var DocumentClassifierArn: DocumentClassifierArn
  }

  object DeleteDocumentClassifierRequest {
    @inline
    def apply(
        DocumentClassifierArn: DocumentClassifierArn
    ): DeleteDocumentClassifierRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentClassifierArn" -> DocumentClassifierArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDocumentClassifierRequest]
    }
  }

  @js.native
  trait DeleteDocumentClassifierResponse extends js.Object

  object DeleteDocumentClassifierResponse {
    @inline
    def apply(): DeleteDocumentClassifierResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDocumentClassifierResponse]
    }
  }

  @js.native
  trait DeleteEndpointRequest extends js.Object {
    var EndpointArn: ComprehendEndpointArn
  }

  object DeleteEndpointRequest {
    @inline
    def apply(
        EndpointArn: ComprehendEndpointArn
    ): DeleteEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEndpointRequest]
    }
  }

  @js.native
  trait DeleteEndpointResponse extends js.Object

  object DeleteEndpointResponse {
    @inline
    def apply(): DeleteEndpointResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteEndpointResponse]
    }
  }

  @js.native
  trait DeleteEntityRecognizerRequest extends js.Object {
    var EntityRecognizerArn: EntityRecognizerArn
  }

  object DeleteEntityRecognizerRequest {
    @inline
    def apply(
        EntityRecognizerArn: EntityRecognizerArn
    ): DeleteEntityRecognizerRequest = {
      val __obj = js.Dynamic.literal(
        "EntityRecognizerArn" -> EntityRecognizerArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEntityRecognizerRequest]
    }
  }

  @js.native
  trait DeleteEntityRecognizerResponse extends js.Object

  object DeleteEntityRecognizerResponse {
    @inline
    def apply(): DeleteEntityRecognizerResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteEntityRecognizerResponse]
    }
  }

  @js.native
  trait DescribeDocumentClassificationJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeDocumentClassificationJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): DescribeDocumentClassificationJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDocumentClassificationJobRequest]
    }
  }

  @js.native
  trait DescribeDocumentClassificationJobResponse extends js.Object {
    var DocumentClassificationJobProperties: js.UndefOr[DocumentClassificationJobProperties]
  }

  object DescribeDocumentClassificationJobResponse {
    @inline
    def apply(
        DocumentClassificationJobProperties: js.UndefOr[DocumentClassificationJobProperties] = js.undefined
    ): DescribeDocumentClassificationJobResponse = {
      val __obj = js.Dynamic.literal()
      DocumentClassificationJobProperties.foreach(__v => __obj.updateDynamic("DocumentClassificationJobProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDocumentClassificationJobResponse]
    }
  }

  @js.native
  trait DescribeDocumentClassifierRequest extends js.Object {
    var DocumentClassifierArn: DocumentClassifierArn
  }

  object DescribeDocumentClassifierRequest {
    @inline
    def apply(
        DocumentClassifierArn: DocumentClassifierArn
    ): DescribeDocumentClassifierRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentClassifierArn" -> DocumentClassifierArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDocumentClassifierRequest]
    }
  }

  @js.native
  trait DescribeDocumentClassifierResponse extends js.Object {
    var DocumentClassifierProperties: js.UndefOr[DocumentClassifierProperties]
  }

  object DescribeDocumentClassifierResponse {
    @inline
    def apply(
        DocumentClassifierProperties: js.UndefOr[DocumentClassifierProperties] = js.undefined
    ): DescribeDocumentClassifierResponse = {
      val __obj = js.Dynamic.literal()
      DocumentClassifierProperties.foreach(__v => __obj.updateDynamic("DocumentClassifierProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDocumentClassifierResponse]
    }
  }

  @js.native
  trait DescribeDominantLanguageDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeDominantLanguageDetectionJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): DescribeDominantLanguageDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDominantLanguageDetectionJobRequest]
    }
  }

  @js.native
  trait DescribeDominantLanguageDetectionJobResponse extends js.Object {
    var DominantLanguageDetectionJobProperties: js.UndefOr[DominantLanguageDetectionJobProperties]
  }

  object DescribeDominantLanguageDetectionJobResponse {
    @inline
    def apply(
        DominantLanguageDetectionJobProperties: js.UndefOr[DominantLanguageDetectionJobProperties] = js.undefined
    ): DescribeDominantLanguageDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      DominantLanguageDetectionJobProperties.foreach(__v => __obj.updateDynamic("DominantLanguageDetectionJobProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDominantLanguageDetectionJobResponse]
    }
  }

  @js.native
  trait DescribeEndpointRequest extends js.Object {
    var EndpointArn: ComprehendEndpointArn
  }

  object DescribeEndpointRequest {
    @inline
    def apply(
        EndpointArn: ComprehendEndpointArn
    ): DescribeEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeEndpointRequest]
    }
  }

  @js.native
  trait DescribeEndpointResponse extends js.Object {
    var EndpointProperties: js.UndefOr[EndpointProperties]
  }

  object DescribeEndpointResponse {
    @inline
    def apply(
        EndpointProperties: js.UndefOr[EndpointProperties] = js.undefined
    ): DescribeEndpointResponse = {
      val __obj = js.Dynamic.literal()
      EndpointProperties.foreach(__v => __obj.updateDynamic("EndpointProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndpointResponse]
    }
  }

  @js.native
  trait DescribeEntitiesDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeEntitiesDetectionJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): DescribeEntitiesDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeEntitiesDetectionJobRequest]
    }
  }

  @js.native
  trait DescribeEntitiesDetectionJobResponse extends js.Object {
    var EntitiesDetectionJobProperties: js.UndefOr[EntitiesDetectionJobProperties]
  }

  object DescribeEntitiesDetectionJobResponse {
    @inline
    def apply(
        EntitiesDetectionJobProperties: js.UndefOr[EntitiesDetectionJobProperties] = js.undefined
    ): DescribeEntitiesDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      EntitiesDetectionJobProperties.foreach(__v => __obj.updateDynamic("EntitiesDetectionJobProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEntitiesDetectionJobResponse]
    }
  }

  @js.native
  trait DescribeEntityRecognizerRequest extends js.Object {
    var EntityRecognizerArn: EntityRecognizerArn
  }

  object DescribeEntityRecognizerRequest {
    @inline
    def apply(
        EntityRecognizerArn: EntityRecognizerArn
    ): DescribeEntityRecognizerRequest = {
      val __obj = js.Dynamic.literal(
        "EntityRecognizerArn" -> EntityRecognizerArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeEntityRecognizerRequest]
    }
  }

  @js.native
  trait DescribeEntityRecognizerResponse extends js.Object {
    var EntityRecognizerProperties: js.UndefOr[EntityRecognizerProperties]
  }

  object DescribeEntityRecognizerResponse {
    @inline
    def apply(
        EntityRecognizerProperties: js.UndefOr[EntityRecognizerProperties] = js.undefined
    ): DescribeEntityRecognizerResponse = {
      val __obj = js.Dynamic.literal()
      EntityRecognizerProperties.foreach(__v => __obj.updateDynamic("EntityRecognizerProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEntityRecognizerResponse]
    }
  }

  @js.native
  trait DescribeEventsDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeEventsDetectionJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): DescribeEventsDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeEventsDetectionJobRequest]
    }
  }

  @js.native
  trait DescribeEventsDetectionJobResponse extends js.Object {
    var EventsDetectionJobProperties: js.UndefOr[EventsDetectionJobProperties]
  }

  object DescribeEventsDetectionJobResponse {
    @inline
    def apply(
        EventsDetectionJobProperties: js.UndefOr[EventsDetectionJobProperties] = js.undefined
    ): DescribeEventsDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      EventsDetectionJobProperties.foreach(__v => __obj.updateDynamic("EventsDetectionJobProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventsDetectionJobResponse]
    }
  }

  @js.native
  trait DescribeKeyPhrasesDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeKeyPhrasesDetectionJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): DescribeKeyPhrasesDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeKeyPhrasesDetectionJobRequest]
    }
  }

  @js.native
  trait DescribeKeyPhrasesDetectionJobResponse extends js.Object {
    var KeyPhrasesDetectionJobProperties: js.UndefOr[KeyPhrasesDetectionJobProperties]
  }

  object DescribeKeyPhrasesDetectionJobResponse {
    @inline
    def apply(
        KeyPhrasesDetectionJobProperties: js.UndefOr[KeyPhrasesDetectionJobProperties] = js.undefined
    ): DescribeKeyPhrasesDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      KeyPhrasesDetectionJobProperties.foreach(__v => __obj.updateDynamic("KeyPhrasesDetectionJobProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeKeyPhrasesDetectionJobResponse]
    }
  }

  @js.native
  trait DescribePiiEntitiesDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribePiiEntitiesDetectionJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): DescribePiiEntitiesDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePiiEntitiesDetectionJobRequest]
    }
  }

  @js.native
  trait DescribePiiEntitiesDetectionJobResponse extends js.Object {
    var PiiEntitiesDetectionJobProperties: js.UndefOr[PiiEntitiesDetectionJobProperties]
  }

  object DescribePiiEntitiesDetectionJobResponse {
    @inline
    def apply(
        PiiEntitiesDetectionJobProperties: js.UndefOr[PiiEntitiesDetectionJobProperties] = js.undefined
    ): DescribePiiEntitiesDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      PiiEntitiesDetectionJobProperties.foreach(__v => __obj.updateDynamic("PiiEntitiesDetectionJobProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePiiEntitiesDetectionJobResponse]
    }
  }

  @js.native
  trait DescribeSentimentDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeSentimentDetectionJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): DescribeSentimentDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeSentimentDetectionJobRequest]
    }
  }

  @js.native
  trait DescribeSentimentDetectionJobResponse extends js.Object {
    var SentimentDetectionJobProperties: js.UndefOr[SentimentDetectionJobProperties]
  }

  object DescribeSentimentDetectionJobResponse {
    @inline
    def apply(
        SentimentDetectionJobProperties: js.UndefOr[SentimentDetectionJobProperties] = js.undefined
    ): DescribeSentimentDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      SentimentDetectionJobProperties.foreach(__v => __obj.updateDynamic("SentimentDetectionJobProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSentimentDetectionJobResponse]
    }
  }

  @js.native
  trait DescribeTopicsDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeTopicsDetectionJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): DescribeTopicsDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeTopicsDetectionJobRequest]
    }
  }

  @js.native
  trait DescribeTopicsDetectionJobResponse extends js.Object {
    var TopicsDetectionJobProperties: js.UndefOr[TopicsDetectionJobProperties]
  }

  object DescribeTopicsDetectionJobResponse {
    @inline
    def apply(
        TopicsDetectionJobProperties: js.UndefOr[TopicsDetectionJobProperties] = js.undefined
    ): DescribeTopicsDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      TopicsDetectionJobProperties.foreach(__v => __obj.updateDynamic("TopicsDetectionJobProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTopicsDetectionJobResponse]
    }
  }

  @js.native
  trait DetectDominantLanguageRequest extends js.Object {
    var Text: CustomerInputString
  }

  object DetectDominantLanguageRequest {
    @inline
    def apply(
        Text: CustomerInputString
    ): DetectDominantLanguageRequest = {
      val __obj = js.Dynamic.literal(
        "Text" -> Text.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DetectDominantLanguageRequest]
    }
  }

  @js.native
  trait DetectDominantLanguageResponse extends js.Object {
    var Languages: js.UndefOr[ListOfDominantLanguages]
  }

  object DetectDominantLanguageResponse {
    @inline
    def apply(
        Languages: js.UndefOr[ListOfDominantLanguages] = js.undefined
    ): DetectDominantLanguageResponse = {
      val __obj = js.Dynamic.literal()
      Languages.foreach(__v => __obj.updateDynamic("Languages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectDominantLanguageResponse]
    }
  }

  @js.native
  trait DetectEntitiesRequest extends js.Object {
    var Text: CustomerInputString
    var EndpointArn: js.UndefOr[EntityRecognizerEndpointArn]
    var LanguageCode: js.UndefOr[LanguageCode]
  }

  object DetectEntitiesRequest {
    @inline
    def apply(
        Text: CustomerInputString,
        EndpointArn: js.UndefOr[EntityRecognizerEndpointArn] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    ): DetectEntitiesRequest = {
      val __obj = js.Dynamic.literal(
        "Text" -> Text.asInstanceOf[js.Any]
      )

      EndpointArn.foreach(__v => __obj.updateDynamic("EndpointArn")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectEntitiesRequest]
    }
  }

  @js.native
  trait DetectEntitiesResponse extends js.Object {
    var Entities: js.UndefOr[ListOfEntities]
  }

  object DetectEntitiesResponse {
    @inline
    def apply(
        Entities: js.UndefOr[ListOfEntities] = js.undefined
    ): DetectEntitiesResponse = {
      val __obj = js.Dynamic.literal()
      Entities.foreach(__v => __obj.updateDynamic("Entities")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectEntitiesResponse]
    }
  }

  @js.native
  trait DetectKeyPhrasesRequest extends js.Object {
    var LanguageCode: LanguageCode
    var Text: CustomerInputString
  }

  object DetectKeyPhrasesRequest {
    @inline
    def apply(
        LanguageCode: LanguageCode,
        Text: CustomerInputString
    ): DetectKeyPhrasesRequest = {
      val __obj = js.Dynamic.literal(
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "Text" -> Text.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DetectKeyPhrasesRequest]
    }
  }

  @js.native
  trait DetectKeyPhrasesResponse extends js.Object {
    var KeyPhrases: js.UndefOr[ListOfKeyPhrases]
  }

  object DetectKeyPhrasesResponse {
    @inline
    def apply(
        KeyPhrases: js.UndefOr[ListOfKeyPhrases] = js.undefined
    ): DetectKeyPhrasesResponse = {
      val __obj = js.Dynamic.literal()
      KeyPhrases.foreach(__v => __obj.updateDynamic("KeyPhrases")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectKeyPhrasesResponse]
    }
  }

  @js.native
  trait DetectPiiEntitiesRequest extends js.Object {
    var LanguageCode: LanguageCode
    var Text: String
  }

  object DetectPiiEntitiesRequest {
    @inline
    def apply(
        LanguageCode: LanguageCode,
        Text: String
    ): DetectPiiEntitiesRequest = {
      val __obj = js.Dynamic.literal(
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "Text" -> Text.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DetectPiiEntitiesRequest]
    }
  }

  @js.native
  trait DetectPiiEntitiesResponse extends js.Object {
    var Entities: js.UndefOr[ListOfPiiEntities]
  }

  object DetectPiiEntitiesResponse {
    @inline
    def apply(
        Entities: js.UndefOr[ListOfPiiEntities] = js.undefined
    ): DetectPiiEntitiesResponse = {
      val __obj = js.Dynamic.literal()
      Entities.foreach(__v => __obj.updateDynamic("Entities")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectPiiEntitiesResponse]
    }
  }

  @js.native
  trait DetectSentimentRequest extends js.Object {
    var LanguageCode: LanguageCode
    var Text: CustomerInputString
  }

  object DetectSentimentRequest {
    @inline
    def apply(
        LanguageCode: LanguageCode,
        Text: CustomerInputString
    ): DetectSentimentRequest = {
      val __obj = js.Dynamic.literal(
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "Text" -> Text.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DetectSentimentRequest]
    }
  }

  @js.native
  trait DetectSentimentResponse extends js.Object {
    var Sentiment: js.UndefOr[SentimentType]
    var SentimentScore: js.UndefOr[SentimentScore]
  }

  object DetectSentimentResponse {
    @inline
    def apply(
        Sentiment: js.UndefOr[SentimentType] = js.undefined,
        SentimentScore: js.UndefOr[SentimentScore] = js.undefined
    ): DetectSentimentResponse = {
      val __obj = js.Dynamic.literal()
      Sentiment.foreach(__v => __obj.updateDynamic("Sentiment")(__v.asInstanceOf[js.Any]))
      SentimentScore.foreach(__v => __obj.updateDynamic("SentimentScore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectSentimentResponse]
    }
  }

  @js.native
  trait DetectSyntaxRequest extends js.Object {
    var LanguageCode: SyntaxLanguageCode
    var Text: CustomerInputString
  }

  object DetectSyntaxRequest {
    @inline
    def apply(
        LanguageCode: SyntaxLanguageCode,
        Text: CustomerInputString
    ): DetectSyntaxRequest = {
      val __obj = js.Dynamic.literal(
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "Text" -> Text.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DetectSyntaxRequest]
    }
  }

  @js.native
  trait DetectSyntaxResponse extends js.Object {
    var SyntaxTokens: js.UndefOr[ListOfSyntaxTokens]
  }

  object DetectSyntaxResponse {
    @inline
    def apply(
        SyntaxTokens: js.UndefOr[ListOfSyntaxTokens] = js.undefined
    ): DetectSyntaxResponse = {
      val __obj = js.Dynamic.literal()
      SyntaxTokens.foreach(__v => __obj.updateDynamic("SyntaxTokens")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectSyntaxResponse]
    }
  }

  /** Specifies the class that categorizes the document being analyzed
    */
  @js.native
  trait DocumentClass extends js.Object {
    var Name: js.UndefOr[String]
    var Score: js.UndefOr[Float]
  }

  object DocumentClass {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined
    ): DocumentClass = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentClass]
    }
  }

  /** Provides information for filtering a list of document classification jobs. For more information, see the operation. You can provide only one filter parameter in each request.
    */
  @js.native
  trait DocumentClassificationJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  object DocumentClassificationJobFilter {
    @inline
    def apply(
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
    ): DocumentClassificationJobFilter = {
      val __obj = js.Dynamic.literal()
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      SubmitTimeAfter.foreach(__v => __obj.updateDynamic("SubmitTimeAfter")(__v.asInstanceOf[js.Any]))
      SubmitTimeBefore.foreach(__v => __obj.updateDynamic("SubmitTimeBefore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentClassificationJobFilter]
    }
  }

  /** Provides information about a document classification job.
    */
  @js.native
  trait DocumentClassificationJobProperties extends js.Object {
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var DocumentClassifierArn: js.UndefOr[DocumentClassifierArn]
    var EndTime: js.UndefOr[Timestamp]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var Message: js.UndefOr[AnyLengthString]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var SubmitTime: js.UndefOr[Timestamp]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object DocumentClassificationJobProperties {
    @inline
    def apply(
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        DocumentClassifierArn: js.UndefOr[DocumentClassifierArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        Message: js.UndefOr[AnyLengthString] = js.undefined,
        OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
        SubmitTime: js.UndefOr[Timestamp] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): DocumentClassificationJobProperties = {
      val __obj = js.Dynamic.literal()
      DataAccessRoleArn.foreach(__v => __obj.updateDynamic("DataAccessRoleArn")(__v.asInstanceOf[js.Any]))
      DocumentClassifierArn.foreach(__v => __obj.updateDynamic("DocumentClassifierArn")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.updateDynamic("OutputDataConfig")(__v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.updateDynamic("SubmitTime")(__v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentClassificationJobProperties]
    }
  }

  @js.native
  sealed trait DocumentClassifierDataFormat extends js.Any
  object DocumentClassifierDataFormat {
    val COMPREHEND_CSV = "COMPREHEND_CSV".asInstanceOf[DocumentClassifierDataFormat]
    val AUGMENTED_MANIFEST = "AUGMENTED_MANIFEST".asInstanceOf[DocumentClassifierDataFormat]

    @inline def values = js.Array(COMPREHEND_CSV, AUGMENTED_MANIFEST)
  }

  /** Provides information for filtering a list of document classifiers. You can only specify one filtering parameter in a request. For more information, see the operation.
    */
  @js.native
  trait DocumentClassifierFilter extends js.Object {
    var Status: js.UndefOr[ModelStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  object DocumentClassifierFilter {
    @inline
    def apply(
        Status: js.UndefOr[ModelStatus] = js.undefined,
        SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
    ): DocumentClassifierFilter = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SubmitTimeAfter.foreach(__v => __obj.updateDynamic("SubmitTimeAfter")(__v.asInstanceOf[js.Any]))
      SubmitTimeBefore.foreach(__v => __obj.updateDynamic("SubmitTimeBefore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentClassifierFilter]
    }
  }

  /** The input properties for training a document classifier.
    * For more information on how the input file is formatted, see <a>how-document-classification-training-data</a>.
    */
  @js.native
  trait DocumentClassifierInputDataConfig extends js.Object {
    var AugmentedManifests: js.UndefOr[DocumentClassifierAugmentedManifestsList]
    var DataFormat: js.UndefOr[DocumentClassifierDataFormat]
    var LabelDelimiter: js.UndefOr[LabelDelimiter]
    var S3Uri: js.UndefOr[S3Uri]
  }

  object DocumentClassifierInputDataConfig {
    @inline
    def apply(
        AugmentedManifests: js.UndefOr[DocumentClassifierAugmentedManifestsList] = js.undefined,
        DataFormat: js.UndefOr[DocumentClassifierDataFormat] = js.undefined,
        LabelDelimiter: js.UndefOr[LabelDelimiter] = js.undefined,
        S3Uri: js.UndefOr[S3Uri] = js.undefined
    ): DocumentClassifierInputDataConfig = {
      val __obj = js.Dynamic.literal()
      AugmentedManifests.foreach(__v => __obj.updateDynamic("AugmentedManifests")(__v.asInstanceOf[js.Any]))
      DataFormat.foreach(__v => __obj.updateDynamic("DataFormat")(__v.asInstanceOf[js.Any]))
      LabelDelimiter.foreach(__v => __obj.updateDynamic("LabelDelimiter")(__v.asInstanceOf[js.Any]))
      S3Uri.foreach(__v => __obj.updateDynamic("S3Uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentClassifierInputDataConfig]
    }
  }

  @js.native
  sealed trait DocumentClassifierMode extends js.Any
  object DocumentClassifierMode {
    val MULTI_CLASS = "MULTI_CLASS".asInstanceOf[DocumentClassifierMode]
    val MULTI_LABEL = "MULTI_LABEL".asInstanceOf[DocumentClassifierMode]

    @inline def values = js.Array(MULTI_CLASS, MULTI_LABEL)
  }

  /** Provides output results configuration parameters for custom classifier jobs.
    */
  @js.native
  trait DocumentClassifierOutputDataConfig extends js.Object {
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var S3Uri: js.UndefOr[S3Uri]
  }

  object DocumentClassifierOutputDataConfig {
    @inline
    def apply(
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        S3Uri: js.UndefOr[S3Uri] = js.undefined
    ): DocumentClassifierOutputDataConfig = {
      val __obj = js.Dynamic.literal()
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      S3Uri.foreach(__v => __obj.updateDynamic("S3Uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentClassifierOutputDataConfig]
    }
  }

  /** Provides information about a document classifier.
    */
  @js.native
  trait DocumentClassifierProperties extends js.Object {
    var ClassifierMetadata: js.UndefOr[ClassifierMetadata]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var DocumentClassifierArn: js.UndefOr[DocumentClassifierArn]
    var EndTime: js.UndefOr[Timestamp]
    var InputDataConfig: js.UndefOr[DocumentClassifierInputDataConfig]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Message: js.UndefOr[AnyLengthString]
    var Mode: js.UndefOr[DocumentClassifierMode]
    var ModelKmsKeyId: js.UndefOr[KmsKeyId]
    var OutputDataConfig: js.UndefOr[DocumentClassifierOutputDataConfig]
    var Status: js.UndefOr[ModelStatus]
    var SubmitTime: js.UndefOr[Timestamp]
    var TrainingEndTime: js.UndefOr[Timestamp]
    var TrainingStartTime: js.UndefOr[Timestamp]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object DocumentClassifierProperties {
    @inline
    def apply(
        ClassifierMetadata: js.UndefOr[ClassifierMetadata] = js.undefined,
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        DocumentClassifierArn: js.UndefOr[DocumentClassifierArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        InputDataConfig: js.UndefOr[DocumentClassifierInputDataConfig] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Message: js.UndefOr[AnyLengthString] = js.undefined,
        Mode: js.UndefOr[DocumentClassifierMode] = js.undefined,
        ModelKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        OutputDataConfig: js.UndefOr[DocumentClassifierOutputDataConfig] = js.undefined,
        Status: js.UndefOr[ModelStatus] = js.undefined,
        SubmitTime: js.UndefOr[Timestamp] = js.undefined,
        TrainingEndTime: js.UndefOr[Timestamp] = js.undefined,
        TrainingStartTime: js.UndefOr[Timestamp] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): DocumentClassifierProperties = {
      val __obj = js.Dynamic.literal()
      ClassifierMetadata.foreach(__v => __obj.updateDynamic("ClassifierMetadata")(__v.asInstanceOf[js.Any]))
      DataAccessRoleArn.foreach(__v => __obj.updateDynamic("DataAccessRoleArn")(__v.asInstanceOf[js.Any]))
      DocumentClassifierArn.foreach(__v => __obj.updateDynamic("DocumentClassifierArn")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      ModelKmsKeyId.foreach(__v => __obj.updateDynamic("ModelKmsKeyId")(__v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.updateDynamic("OutputDataConfig")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.updateDynamic("SubmitTime")(__v.asInstanceOf[js.Any]))
      TrainingEndTime.foreach(__v => __obj.updateDynamic("TrainingEndTime")(__v.asInstanceOf[js.Any]))
      TrainingStartTime.foreach(__v => __obj.updateDynamic("TrainingStartTime")(__v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentClassifierProperties]
    }
  }

  /** Specifies one of the label or labels that categorize the document being analyzed.
    */
  @js.native
  trait DocumentLabel extends js.Object {
    var Name: js.UndefOr[String]
    var Score: js.UndefOr[Float]
  }

  object DocumentLabel {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined
    ): DocumentLabel = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentLabel]
    }
  }

  /** Returns the code for the dominant language in the input text and the level of confidence that Amazon Comprehend has in the accuracy of the detection.
    */
  @js.native
  trait DominantLanguage extends js.Object {
    var LanguageCode: js.UndefOr[String]
    var Score: js.UndefOr[Float]
  }

  object DominantLanguage {
    @inline
    def apply(
        LanguageCode: js.UndefOr[String] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined
    ): DominantLanguage = {
      val __obj = js.Dynamic.literal()
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DominantLanguage]
    }
  }

  /** Provides information for filtering a list of dominant language detection jobs. For more information, see the operation.
    */
  @js.native
  trait DominantLanguageDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  object DominantLanguageDetectionJobFilter {
    @inline
    def apply(
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
    ): DominantLanguageDetectionJobFilter = {
      val __obj = js.Dynamic.literal()
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      SubmitTimeAfter.foreach(__v => __obj.updateDynamic("SubmitTimeAfter")(__v.asInstanceOf[js.Any]))
      SubmitTimeBefore.foreach(__v => __obj.updateDynamic("SubmitTimeBefore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DominantLanguageDetectionJobFilter]
    }
  }

  /** Provides information about a dominant language detection job.
    */
  @js.native
  trait DominantLanguageDetectionJobProperties extends js.Object {
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var EndTime: js.UndefOr[Timestamp]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var Message: js.UndefOr[AnyLengthString]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var SubmitTime: js.UndefOr[Timestamp]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object DominantLanguageDetectionJobProperties {
    @inline
    def apply(
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        Message: js.UndefOr[AnyLengthString] = js.undefined,
        OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
        SubmitTime: js.UndefOr[Timestamp] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): DominantLanguageDetectionJobProperties = {
      val __obj = js.Dynamic.literal()
      DataAccessRoleArn.foreach(__v => __obj.updateDynamic("DataAccessRoleArn")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.updateDynamic("OutputDataConfig")(__v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.updateDynamic("SubmitTime")(__v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DominantLanguageDetectionJobProperties]
    }
  }

  /** The filter used to determine which endpoints are returned. You can filter jobs on their name, model, status, or the date and time that they were created. You can only set one filter at a time.
    */
  @js.native
  trait EndpointFilter extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var ModelArn: js.UndefOr[ComprehendModelArn]
    var Status: js.UndefOr[EndpointStatus]
  }

  object EndpointFilter {
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        ModelArn: js.UndefOr[ComprehendModelArn] = js.undefined,
        Status: js.UndefOr[EndpointStatus] = js.undefined
    ): EndpointFilter = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      ModelArn.foreach(__v => __obj.updateDynamic("ModelArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointFilter]
    }
  }

  /** Specifies information about the specified endpoint.
    */
  @js.native
  trait EndpointProperties extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var CurrentInferenceUnits: js.UndefOr[InferenceUnitsInteger]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var DesiredInferenceUnits: js.UndefOr[InferenceUnitsInteger]
    var EndpointArn: js.UndefOr[ComprehendEndpointArn]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[AnyLengthString]
    var ModelArn: js.UndefOr[ComprehendModelArn]
    var Status: js.UndefOr[EndpointStatus]
  }

  object EndpointProperties {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        CurrentInferenceUnits: js.UndefOr[InferenceUnitsInteger] = js.undefined,
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        DesiredInferenceUnits: js.UndefOr[InferenceUnitsInteger] = js.undefined,
        EndpointArn: js.UndefOr[ComprehendEndpointArn] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[AnyLengthString] = js.undefined,
        ModelArn: js.UndefOr[ComprehendModelArn] = js.undefined,
        Status: js.UndefOr[EndpointStatus] = js.undefined
    ): EndpointProperties = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CurrentInferenceUnits.foreach(__v => __obj.updateDynamic("CurrentInferenceUnits")(__v.asInstanceOf[js.Any]))
      DataAccessRoleArn.foreach(__v => __obj.updateDynamic("DataAccessRoleArn")(__v.asInstanceOf[js.Any]))
      DesiredInferenceUnits.foreach(__v => __obj.updateDynamic("DesiredInferenceUnits")(__v.asInstanceOf[js.Any]))
      EndpointArn.foreach(__v => __obj.updateDynamic("EndpointArn")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      ModelArn.foreach(__v => __obj.updateDynamic("ModelArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointProperties]
    }
  }

  @js.native
  sealed trait EndpointStatus extends js.Any
  object EndpointStatus {
    val CREATING = "CREATING".asInstanceOf[EndpointStatus]
    val DELETING = "DELETING".asInstanceOf[EndpointStatus]
    val FAILED = "FAILED".asInstanceOf[EndpointStatus]
    val IN_SERVICE = "IN_SERVICE".asInstanceOf[EndpointStatus]
    val UPDATING = "UPDATING".asInstanceOf[EndpointStatus]

    @inline def values = js.Array(CREATING, DELETING, FAILED, IN_SERVICE, UPDATING)
  }

  /** Provides information for filtering a list of dominant language detection jobs. For more information, see the operation.
    */
  @js.native
  trait EntitiesDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  object EntitiesDetectionJobFilter {
    @inline
    def apply(
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
    ): EntitiesDetectionJobFilter = {
      val __obj = js.Dynamic.literal()
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      SubmitTimeAfter.foreach(__v => __obj.updateDynamic("SubmitTimeAfter")(__v.asInstanceOf[js.Any]))
      SubmitTimeBefore.foreach(__v => __obj.updateDynamic("SubmitTimeBefore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntitiesDetectionJobFilter]
    }
  }

  /** Provides information about an entities detection job.
    */
  @js.native
  trait EntitiesDetectionJobProperties extends js.Object {
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var EndTime: js.UndefOr[Timestamp]
    var EntityRecognizerArn: js.UndefOr[EntityRecognizerArn]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Message: js.UndefOr[AnyLengthString]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var SubmitTime: js.UndefOr[Timestamp]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object EntitiesDetectionJobProperties {
    @inline
    def apply(
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        EntityRecognizerArn: js.UndefOr[EntityRecognizerArn] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Message: js.UndefOr[AnyLengthString] = js.undefined,
        OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
        SubmitTime: js.UndefOr[Timestamp] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): EntitiesDetectionJobProperties = {
      val __obj = js.Dynamic.literal()
      DataAccessRoleArn.foreach(__v => __obj.updateDynamic("DataAccessRoleArn")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      EntityRecognizerArn.foreach(__v => __obj.updateDynamic("EntityRecognizerArn")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.updateDynamic("OutputDataConfig")(__v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.updateDynamic("SubmitTime")(__v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntitiesDetectionJobProperties]
    }
  }

  /** Provides information about an entity.
    */
  @js.native
  trait Entity extends js.Object {
    var BeginOffset: js.UndefOr[Int]
    var EndOffset: js.UndefOr[Int]
    var Score: js.UndefOr[Float]
    var Text: js.UndefOr[String]
    var Type: js.UndefOr[EntityType]
  }

  object Entity {
    @inline
    def apply(
        BeginOffset: js.UndefOr[Int] = js.undefined,
        EndOffset: js.UndefOr[Int] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined,
        Text: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[EntityType] = js.undefined
    ): Entity = {
      val __obj = js.Dynamic.literal()
      BeginOffset.foreach(__v => __obj.updateDynamic("BeginOffset")(__v.asInstanceOf[js.Any]))
      EndOffset.foreach(__v => __obj.updateDynamic("EndOffset")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Entity]
    }
  }

  /** Specifies one of the label or labels that categorize the personally identifiable information (PII) entity being analyzed.
    */
  @js.native
  trait EntityLabel extends js.Object {
    var Name: js.UndefOr[PiiEntityType]
    var Score: js.UndefOr[Float]
  }

  object EntityLabel {
    @inline
    def apply(
        Name: js.UndefOr[PiiEntityType] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined
    ): EntityLabel = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityLabel]
    }
  }

  /** Describes the annotations associated with a entity recognizer.
    */
  @js.native
  trait EntityRecognizerAnnotations extends js.Object {
    var S3Uri: S3Uri
  }

  object EntityRecognizerAnnotations {
    @inline
    def apply(
        S3Uri: S3Uri
    ): EntityRecognizerAnnotations = {
      val __obj = js.Dynamic.literal(
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EntityRecognizerAnnotations]
    }
  }

  @js.native
  sealed trait EntityRecognizerDataFormat extends js.Any
  object EntityRecognizerDataFormat {
    val COMPREHEND_CSV = "COMPREHEND_CSV".asInstanceOf[EntityRecognizerDataFormat]
    val AUGMENTED_MANIFEST = "AUGMENTED_MANIFEST".asInstanceOf[EntityRecognizerDataFormat]

    @inline def values = js.Array(COMPREHEND_CSV, AUGMENTED_MANIFEST)
  }

  /** Describes the training documents submitted with an entity recognizer.
    */
  @js.native
  trait EntityRecognizerDocuments extends js.Object {
    var S3Uri: S3Uri
  }

  object EntityRecognizerDocuments {
    @inline
    def apply(
        S3Uri: S3Uri
    ): EntityRecognizerDocuments = {
      val __obj = js.Dynamic.literal(
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EntityRecognizerDocuments]
    }
  }

  /** Describes the entity recognizer submitted with an entity recognizer.
    */
  @js.native
  trait EntityRecognizerEntityList extends js.Object {
    var S3Uri: S3Uri
  }

  object EntityRecognizerEntityList {
    @inline
    def apply(
        S3Uri: S3Uri
    ): EntityRecognizerEntityList = {
      val __obj = js.Dynamic.literal(
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EntityRecognizerEntityList]
    }
  }

  /** Detailed information about the accuracy of an entity recognizer.
    */
  @js.native
  trait EntityRecognizerEvaluationMetrics extends js.Object {
    var F1Score: js.UndefOr[Double]
    var Precision: js.UndefOr[Double]
    var Recall: js.UndefOr[Double]
  }

  object EntityRecognizerEvaluationMetrics {
    @inline
    def apply(
        F1Score: js.UndefOr[Double] = js.undefined,
        Precision: js.UndefOr[Double] = js.undefined,
        Recall: js.UndefOr[Double] = js.undefined
    ): EntityRecognizerEvaluationMetrics = {
      val __obj = js.Dynamic.literal()
      F1Score.foreach(__v => __obj.updateDynamic("F1Score")(__v.asInstanceOf[js.Any]))
      Precision.foreach(__v => __obj.updateDynamic("Precision")(__v.asInstanceOf[js.Any]))
      Recall.foreach(__v => __obj.updateDynamic("Recall")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityRecognizerEvaluationMetrics]
    }
  }

  /** Provides information for filtering a list of entity recognizers. You can only specify one filtering parameter in a request. For more information, see the operation./&gt;
    */
  @js.native
  trait EntityRecognizerFilter extends js.Object {
    var Status: js.UndefOr[ModelStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  object EntityRecognizerFilter {
    @inline
    def apply(
        Status: js.UndefOr[ModelStatus] = js.undefined,
        SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
    ): EntityRecognizerFilter = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SubmitTimeAfter.foreach(__v => __obj.updateDynamic("SubmitTimeAfter")(__v.asInstanceOf[js.Any]))
      SubmitTimeBefore.foreach(__v => __obj.updateDynamic("SubmitTimeBefore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityRecognizerFilter]
    }
  }

  /** Specifies the format and location of the input data.
    */
  @js.native
  trait EntityRecognizerInputDataConfig extends js.Object {
    var EntityTypes: EntityTypesList
    var Annotations: js.UndefOr[EntityRecognizerAnnotations]
    var AugmentedManifests: js.UndefOr[EntityRecognizerAugmentedManifestsList]
    var DataFormat: js.UndefOr[EntityRecognizerDataFormat]
    var Documents: js.UndefOr[EntityRecognizerDocuments]
    var EntityList: js.UndefOr[EntityRecognizerEntityList]
  }

  object EntityRecognizerInputDataConfig {
    @inline
    def apply(
        EntityTypes: EntityTypesList,
        Annotations: js.UndefOr[EntityRecognizerAnnotations] = js.undefined,
        AugmentedManifests: js.UndefOr[EntityRecognizerAugmentedManifestsList] = js.undefined,
        DataFormat: js.UndefOr[EntityRecognizerDataFormat] = js.undefined,
        Documents: js.UndefOr[EntityRecognizerDocuments] = js.undefined,
        EntityList: js.UndefOr[EntityRecognizerEntityList] = js.undefined
    ): EntityRecognizerInputDataConfig = {
      val __obj = js.Dynamic.literal(
        "EntityTypes" -> EntityTypes.asInstanceOf[js.Any]
      )

      Annotations.foreach(__v => __obj.updateDynamic("Annotations")(__v.asInstanceOf[js.Any]))
      AugmentedManifests.foreach(__v => __obj.updateDynamic("AugmentedManifests")(__v.asInstanceOf[js.Any]))
      DataFormat.foreach(__v => __obj.updateDynamic("DataFormat")(__v.asInstanceOf[js.Any]))
      Documents.foreach(__v => __obj.updateDynamic("Documents")(__v.asInstanceOf[js.Any]))
      EntityList.foreach(__v => __obj.updateDynamic("EntityList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityRecognizerInputDataConfig]
    }
  }

  /** Detailed information about an entity recognizer.
    */
  @js.native
  trait EntityRecognizerMetadata extends js.Object {
    var EntityTypes: js.UndefOr[EntityRecognizerMetadataEntityTypesList]
    var EvaluationMetrics: js.UndefOr[EntityRecognizerEvaluationMetrics]
    var NumberOfTestDocuments: js.UndefOr[Int]
    var NumberOfTrainedDocuments: js.UndefOr[Int]
  }

  object EntityRecognizerMetadata {
    @inline
    def apply(
        EntityTypes: js.UndefOr[EntityRecognizerMetadataEntityTypesList] = js.undefined,
        EvaluationMetrics: js.UndefOr[EntityRecognizerEvaluationMetrics] = js.undefined,
        NumberOfTestDocuments: js.UndefOr[Int] = js.undefined,
        NumberOfTrainedDocuments: js.UndefOr[Int] = js.undefined
    ): EntityRecognizerMetadata = {
      val __obj = js.Dynamic.literal()
      EntityTypes.foreach(__v => __obj.updateDynamic("EntityTypes")(__v.asInstanceOf[js.Any]))
      EvaluationMetrics.foreach(__v => __obj.updateDynamic("EvaluationMetrics")(__v.asInstanceOf[js.Any]))
      NumberOfTestDocuments.foreach(__v => __obj.updateDynamic("NumberOfTestDocuments")(__v.asInstanceOf[js.Any]))
      NumberOfTrainedDocuments.foreach(__v => __obj.updateDynamic("NumberOfTrainedDocuments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityRecognizerMetadata]
    }
  }

  /** Individual item from the list of entity types in the metadata of an entity recognizer.
    */
  @js.native
  trait EntityRecognizerMetadataEntityTypesListItem extends js.Object {
    var EvaluationMetrics: js.UndefOr[EntityTypesEvaluationMetrics]
    var NumberOfTrainMentions: js.UndefOr[Int]
    var Type: js.UndefOr[AnyLengthString]
  }

  object EntityRecognizerMetadataEntityTypesListItem {
    @inline
    def apply(
        EvaluationMetrics: js.UndefOr[EntityTypesEvaluationMetrics] = js.undefined,
        NumberOfTrainMentions: js.UndefOr[Int] = js.undefined,
        Type: js.UndefOr[AnyLengthString] = js.undefined
    ): EntityRecognizerMetadataEntityTypesListItem = {
      val __obj = js.Dynamic.literal()
      EvaluationMetrics.foreach(__v => __obj.updateDynamic("EvaluationMetrics")(__v.asInstanceOf[js.Any]))
      NumberOfTrainMentions.foreach(__v => __obj.updateDynamic("NumberOfTrainMentions")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityRecognizerMetadataEntityTypesListItem]
    }
  }

  /** Describes information about an entity recognizer.
    */
  @js.native
  trait EntityRecognizerProperties extends js.Object {
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var EndTime: js.UndefOr[Timestamp]
    var EntityRecognizerArn: js.UndefOr[EntityRecognizerArn]
    var InputDataConfig: js.UndefOr[EntityRecognizerInputDataConfig]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Message: js.UndefOr[AnyLengthString]
    var ModelKmsKeyId: js.UndefOr[KmsKeyId]
    var RecognizerMetadata: js.UndefOr[EntityRecognizerMetadata]
    var Status: js.UndefOr[ModelStatus]
    var SubmitTime: js.UndefOr[Timestamp]
    var TrainingEndTime: js.UndefOr[Timestamp]
    var TrainingStartTime: js.UndefOr[Timestamp]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object EntityRecognizerProperties {
    @inline
    def apply(
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        EntityRecognizerArn: js.UndefOr[EntityRecognizerArn] = js.undefined,
        InputDataConfig: js.UndefOr[EntityRecognizerInputDataConfig] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Message: js.UndefOr[AnyLengthString] = js.undefined,
        ModelKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        RecognizerMetadata: js.UndefOr[EntityRecognizerMetadata] = js.undefined,
        Status: js.UndefOr[ModelStatus] = js.undefined,
        SubmitTime: js.UndefOr[Timestamp] = js.undefined,
        TrainingEndTime: js.UndefOr[Timestamp] = js.undefined,
        TrainingStartTime: js.UndefOr[Timestamp] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): EntityRecognizerProperties = {
      val __obj = js.Dynamic.literal()
      DataAccessRoleArn.foreach(__v => __obj.updateDynamic("DataAccessRoleArn")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      EntityRecognizerArn.foreach(__v => __obj.updateDynamic("EntityRecognizerArn")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      ModelKmsKeyId.foreach(__v => __obj.updateDynamic("ModelKmsKeyId")(__v.asInstanceOf[js.Any]))
      RecognizerMetadata.foreach(__v => __obj.updateDynamic("RecognizerMetadata")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.updateDynamic("SubmitTime")(__v.asInstanceOf[js.Any]))
      TrainingEndTime.foreach(__v => __obj.updateDynamic("TrainingEndTime")(__v.asInstanceOf[js.Any]))
      TrainingStartTime.foreach(__v => __obj.updateDynamic("TrainingStartTime")(__v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityRecognizerProperties]
    }
  }

  @js.native
  sealed trait EntityType extends js.Any
  object EntityType {
    val PERSON = "PERSON".asInstanceOf[EntityType]
    val LOCATION = "LOCATION".asInstanceOf[EntityType]
    val ORGANIZATION = "ORGANIZATION".asInstanceOf[EntityType]
    val COMMERCIAL_ITEM = "COMMERCIAL_ITEM".asInstanceOf[EntityType]
    val EVENT = "EVENT".asInstanceOf[EntityType]
    val DATE = "DATE".asInstanceOf[EntityType]
    val QUANTITY = "QUANTITY".asInstanceOf[EntityType]
    val TITLE = "TITLE".asInstanceOf[EntityType]
    val OTHER = "OTHER".asInstanceOf[EntityType]

    @inline def values = js.Array(PERSON, LOCATION, ORGANIZATION, COMMERCIAL_ITEM, EVENT, DATE, QUANTITY, TITLE, OTHER)
  }

  /** Detailed information about the accuracy of an entity recognizer for a specific entity type.
    */
  @js.native
  trait EntityTypesEvaluationMetrics extends js.Object {
    var F1Score: js.UndefOr[Double]
    var Precision: js.UndefOr[Double]
    var Recall: js.UndefOr[Double]
  }

  object EntityTypesEvaluationMetrics {
    @inline
    def apply(
        F1Score: js.UndefOr[Double] = js.undefined,
        Precision: js.UndefOr[Double] = js.undefined,
        Recall: js.UndefOr[Double] = js.undefined
    ): EntityTypesEvaluationMetrics = {
      val __obj = js.Dynamic.literal()
      F1Score.foreach(__v => __obj.updateDynamic("F1Score")(__v.asInstanceOf[js.Any]))
      Precision.foreach(__v => __obj.updateDynamic("Precision")(__v.asInstanceOf[js.Any]))
      Recall.foreach(__v => __obj.updateDynamic("Recall")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityTypesEvaluationMetrics]
    }
  }

  /** An entity type within a labeled training dataset that Amazon Comprehend uses to train a custom entity recognizer.
    */
  @js.native
  trait EntityTypesListItem extends js.Object {
    var Type: EntityTypeName
  }

  object EntityTypesListItem {
    @inline
    def apply(
        Type: EntityTypeName
    ): EntityTypesListItem = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EntityTypesListItem]
    }
  }

  /** Provides information for filtering a list of event detection jobs.
    */
  @js.native
  trait EventsDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  object EventsDetectionJobFilter {
    @inline
    def apply(
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
    ): EventsDetectionJobFilter = {
      val __obj = js.Dynamic.literal()
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      SubmitTimeAfter.foreach(__v => __obj.updateDynamic("SubmitTimeAfter")(__v.asInstanceOf[js.Any]))
      SubmitTimeBefore.foreach(__v => __obj.updateDynamic("SubmitTimeBefore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventsDetectionJobFilter]
    }
  }

  /** Provides information about an events detection job.
    */
  @js.native
  trait EventsDetectionJobProperties extends js.Object {
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var EndTime: js.UndefOr[Timestamp]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Message: js.UndefOr[AnyLengthString]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var SubmitTime: js.UndefOr[Timestamp]
    var TargetEventTypes: js.UndefOr[TargetEventTypes]
  }

  object EventsDetectionJobProperties {
    @inline
    def apply(
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Message: js.UndefOr[AnyLengthString] = js.undefined,
        OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
        SubmitTime: js.UndefOr[Timestamp] = js.undefined,
        TargetEventTypes: js.UndefOr[TargetEventTypes] = js.undefined
    ): EventsDetectionJobProperties = {
      val __obj = js.Dynamic.literal()
      DataAccessRoleArn.foreach(__v => __obj.updateDynamic("DataAccessRoleArn")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.updateDynamic("OutputDataConfig")(__v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.updateDynamic("SubmitTime")(__v.asInstanceOf[js.Any]))
      TargetEventTypes.foreach(__v => __obj.updateDynamic("TargetEventTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventsDetectionJobProperties]
    }
  }

  /** The input properties for a topic detection job.
    */
  @js.native
  trait InputDataConfig extends js.Object {
    var S3Uri: S3Uri
    var InputFormat: js.UndefOr[InputFormat]
  }

  object InputDataConfig {
    @inline
    def apply(
        S3Uri: S3Uri,
        InputFormat: js.UndefOr[InputFormat] = js.undefined
    ): InputDataConfig = {
      val __obj = js.Dynamic.literal(
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )

      InputFormat.foreach(__v => __obj.updateDynamic("InputFormat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputDataConfig]
    }
  }

  @js.native
  sealed trait InputFormat extends js.Any
  object InputFormat {
    val ONE_DOC_PER_FILE = "ONE_DOC_PER_FILE".asInstanceOf[InputFormat]
    val ONE_DOC_PER_LINE = "ONE_DOC_PER_LINE".asInstanceOf[InputFormat]

    @inline def values = js.Array(ONE_DOC_PER_FILE, ONE_DOC_PER_LINE)
  }

  @js.native
  sealed trait JobStatus extends js.Any
  object JobStatus {
    val SUBMITTED = "SUBMITTED".asInstanceOf[JobStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[JobStatus]
    val COMPLETED = "COMPLETED".asInstanceOf[JobStatus]
    val FAILED = "FAILED".asInstanceOf[JobStatus]
    val STOP_REQUESTED = "STOP_REQUESTED".asInstanceOf[JobStatus]
    val STOPPED = "STOPPED".asInstanceOf[JobStatus]

    @inline def values = js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, FAILED, STOP_REQUESTED, STOPPED)
  }

  /** Describes a key noun phrase.
    */
  @js.native
  trait KeyPhrase extends js.Object {
    var BeginOffset: js.UndefOr[Int]
    var EndOffset: js.UndefOr[Int]
    var Score: js.UndefOr[Float]
    var Text: js.UndefOr[String]
  }

  object KeyPhrase {
    @inline
    def apply(
        BeginOffset: js.UndefOr[Int] = js.undefined,
        EndOffset: js.UndefOr[Int] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined,
        Text: js.UndefOr[String] = js.undefined
    ): KeyPhrase = {
      val __obj = js.Dynamic.literal()
      BeginOffset.foreach(__v => __obj.updateDynamic("BeginOffset")(__v.asInstanceOf[js.Any]))
      EndOffset.foreach(__v => __obj.updateDynamic("EndOffset")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyPhrase]
    }
  }

  /** Provides information for filtering a list of dominant language detection jobs. For more information, see the operation.
    */
  @js.native
  trait KeyPhrasesDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  object KeyPhrasesDetectionJobFilter {
    @inline
    def apply(
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
    ): KeyPhrasesDetectionJobFilter = {
      val __obj = js.Dynamic.literal()
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      SubmitTimeAfter.foreach(__v => __obj.updateDynamic("SubmitTimeAfter")(__v.asInstanceOf[js.Any]))
      SubmitTimeBefore.foreach(__v => __obj.updateDynamic("SubmitTimeBefore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyPhrasesDetectionJobFilter]
    }
  }

  /** Provides information about a key phrases detection job.
    */
  @js.native
  trait KeyPhrasesDetectionJobProperties extends js.Object {
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var EndTime: js.UndefOr[Timestamp]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Message: js.UndefOr[AnyLengthString]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var SubmitTime: js.UndefOr[Timestamp]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object KeyPhrasesDetectionJobProperties {
    @inline
    def apply(
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Message: js.UndefOr[AnyLengthString] = js.undefined,
        OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
        SubmitTime: js.UndefOr[Timestamp] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): KeyPhrasesDetectionJobProperties = {
      val __obj = js.Dynamic.literal()
      DataAccessRoleArn.foreach(__v => __obj.updateDynamic("DataAccessRoleArn")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.updateDynamic("OutputDataConfig")(__v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.updateDynamic("SubmitTime")(__v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyPhrasesDetectionJobProperties]
    }
  }

  @js.native
  sealed trait LanguageCode extends js.Any
  object LanguageCode {
    val en = "en".asInstanceOf[LanguageCode]
    val es = "es".asInstanceOf[LanguageCode]
    val fr = "fr".asInstanceOf[LanguageCode]
    val de = "de".asInstanceOf[LanguageCode]
    val it = "it".asInstanceOf[LanguageCode]
    val pt = "pt".asInstanceOf[LanguageCode]
    val ar = "ar".asInstanceOf[LanguageCode]
    val hi = "hi".asInstanceOf[LanguageCode]
    val ja = "ja".asInstanceOf[LanguageCode]
    val ko = "ko".asInstanceOf[LanguageCode]
    val zh = "zh".asInstanceOf[LanguageCode]
    val `zh-TW` = "zh-TW".asInstanceOf[LanguageCode]

    @inline def values = js.Array(en, es, fr, de, it, pt, ar, hi, ja, ko, zh, `zh-TW`)
  }

  @js.native
  trait ListDocumentClassificationJobsRequest extends js.Object {
    var Filter: js.UndefOr[DocumentClassificationJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListDocumentClassificationJobsRequest {
    @inline
    def apply(
        Filter: js.UndefOr[DocumentClassificationJobFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDocumentClassificationJobsRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDocumentClassificationJobsRequest]
    }
  }

  @js.native
  trait ListDocumentClassificationJobsResponse extends js.Object {
    var DocumentClassificationJobPropertiesList: js.UndefOr[DocumentClassificationJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListDocumentClassificationJobsResponse {
    @inline
    def apply(
        DocumentClassificationJobPropertiesList: js.UndefOr[DocumentClassificationJobPropertiesList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDocumentClassificationJobsResponse = {
      val __obj = js.Dynamic.literal()
      DocumentClassificationJobPropertiesList.foreach(__v => __obj.updateDynamic("DocumentClassificationJobPropertiesList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDocumentClassificationJobsResponse]
    }
  }

  @js.native
  trait ListDocumentClassifiersRequest extends js.Object {
    var Filter: js.UndefOr[DocumentClassifierFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListDocumentClassifiersRequest {
    @inline
    def apply(
        Filter: js.UndefOr[DocumentClassifierFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDocumentClassifiersRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDocumentClassifiersRequest]
    }
  }

  @js.native
  trait ListDocumentClassifiersResponse extends js.Object {
    var DocumentClassifierPropertiesList: js.UndefOr[DocumentClassifierPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListDocumentClassifiersResponse {
    @inline
    def apply(
        DocumentClassifierPropertiesList: js.UndefOr[DocumentClassifierPropertiesList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDocumentClassifiersResponse = {
      val __obj = js.Dynamic.literal()
      DocumentClassifierPropertiesList.foreach(__v => __obj.updateDynamic("DocumentClassifierPropertiesList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDocumentClassifiersResponse]
    }
  }

  @js.native
  trait ListDominantLanguageDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[DominantLanguageDetectionJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListDominantLanguageDetectionJobsRequest {
    @inline
    def apply(
        Filter: js.UndefOr[DominantLanguageDetectionJobFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDominantLanguageDetectionJobsRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDominantLanguageDetectionJobsRequest]
    }
  }

  @js.native
  trait ListDominantLanguageDetectionJobsResponse extends js.Object {
    var DominantLanguageDetectionJobPropertiesList: js.UndefOr[DominantLanguageDetectionJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListDominantLanguageDetectionJobsResponse {
    @inline
    def apply(
        DominantLanguageDetectionJobPropertiesList: js.UndefOr[DominantLanguageDetectionJobPropertiesList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDominantLanguageDetectionJobsResponse = {
      val __obj = js.Dynamic.literal()
      DominantLanguageDetectionJobPropertiesList.foreach(__v => __obj.updateDynamic("DominantLanguageDetectionJobPropertiesList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDominantLanguageDetectionJobsResponse]
    }
  }

  @js.native
  trait ListEndpointsRequest extends js.Object {
    var Filter: js.UndefOr[EndpointFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListEndpointsRequest {
    @inline
    def apply(
        Filter: js.UndefOr[EndpointFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListEndpointsRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEndpointsRequest]
    }
  }

  @js.native
  trait ListEndpointsResponse extends js.Object {
    var EndpointPropertiesList: js.UndefOr[EndpointPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListEndpointsResponse {
    @inline
    def apply(
        EndpointPropertiesList: js.UndefOr[EndpointPropertiesList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListEndpointsResponse = {
      val __obj = js.Dynamic.literal()
      EndpointPropertiesList.foreach(__v => __obj.updateDynamic("EndpointPropertiesList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEndpointsResponse]
    }
  }

  @js.native
  trait ListEntitiesDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[EntitiesDetectionJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListEntitiesDetectionJobsRequest {
    @inline
    def apply(
        Filter: js.UndefOr[EntitiesDetectionJobFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListEntitiesDetectionJobsRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntitiesDetectionJobsRequest]
    }
  }

  @js.native
  trait ListEntitiesDetectionJobsResponse extends js.Object {
    var EntitiesDetectionJobPropertiesList: js.UndefOr[EntitiesDetectionJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListEntitiesDetectionJobsResponse {
    @inline
    def apply(
        EntitiesDetectionJobPropertiesList: js.UndefOr[EntitiesDetectionJobPropertiesList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListEntitiesDetectionJobsResponse = {
      val __obj = js.Dynamic.literal()
      EntitiesDetectionJobPropertiesList.foreach(__v => __obj.updateDynamic("EntitiesDetectionJobPropertiesList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntitiesDetectionJobsResponse]
    }
  }

  @js.native
  trait ListEntityRecognizersRequest extends js.Object {
    var Filter: js.UndefOr[EntityRecognizerFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListEntityRecognizersRequest {
    @inline
    def apply(
        Filter: js.UndefOr[EntityRecognizerFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListEntityRecognizersRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntityRecognizersRequest]
    }
  }

  @js.native
  trait ListEntityRecognizersResponse extends js.Object {
    var EntityRecognizerPropertiesList: js.UndefOr[EntityRecognizerPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListEntityRecognizersResponse {
    @inline
    def apply(
        EntityRecognizerPropertiesList: js.UndefOr[EntityRecognizerPropertiesList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListEntityRecognizersResponse = {
      val __obj = js.Dynamic.literal()
      EntityRecognizerPropertiesList.foreach(__v => __obj.updateDynamic("EntityRecognizerPropertiesList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntityRecognizersResponse]
    }
  }

  @js.native
  trait ListEventsDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[EventsDetectionJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListEventsDetectionJobsRequest {
    @inline
    def apply(
        Filter: js.UndefOr[EventsDetectionJobFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListEventsDetectionJobsRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventsDetectionJobsRequest]
    }
  }

  @js.native
  trait ListEventsDetectionJobsResponse extends js.Object {
    var EventsDetectionJobPropertiesList: js.UndefOr[EventsDetectionJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListEventsDetectionJobsResponse {
    @inline
    def apply(
        EventsDetectionJobPropertiesList: js.UndefOr[EventsDetectionJobPropertiesList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListEventsDetectionJobsResponse = {
      val __obj = js.Dynamic.literal()
      EventsDetectionJobPropertiesList.foreach(__v => __obj.updateDynamic("EventsDetectionJobPropertiesList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventsDetectionJobsResponse]
    }
  }

  @js.native
  trait ListKeyPhrasesDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[KeyPhrasesDetectionJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListKeyPhrasesDetectionJobsRequest {
    @inline
    def apply(
        Filter: js.UndefOr[KeyPhrasesDetectionJobFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListKeyPhrasesDetectionJobsRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListKeyPhrasesDetectionJobsRequest]
    }
  }

  @js.native
  trait ListKeyPhrasesDetectionJobsResponse extends js.Object {
    var KeyPhrasesDetectionJobPropertiesList: js.UndefOr[KeyPhrasesDetectionJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListKeyPhrasesDetectionJobsResponse {
    @inline
    def apply(
        KeyPhrasesDetectionJobPropertiesList: js.UndefOr[KeyPhrasesDetectionJobPropertiesList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListKeyPhrasesDetectionJobsResponse = {
      val __obj = js.Dynamic.literal()
      KeyPhrasesDetectionJobPropertiesList.foreach(__v => __obj.updateDynamic("KeyPhrasesDetectionJobPropertiesList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListKeyPhrasesDetectionJobsResponse]
    }
  }

  @js.native
  trait ListPiiEntitiesDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[PiiEntitiesDetectionJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListPiiEntitiesDetectionJobsRequest {
    @inline
    def apply(
        Filter: js.UndefOr[PiiEntitiesDetectionJobFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListPiiEntitiesDetectionJobsRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPiiEntitiesDetectionJobsRequest]
    }
  }

  @js.native
  trait ListPiiEntitiesDetectionJobsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PiiEntitiesDetectionJobPropertiesList: js.UndefOr[PiiEntitiesDetectionJobPropertiesList]
  }

  object ListPiiEntitiesDetectionJobsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        PiiEntitiesDetectionJobPropertiesList: js.UndefOr[PiiEntitiesDetectionJobPropertiesList] = js.undefined
    ): ListPiiEntitiesDetectionJobsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PiiEntitiesDetectionJobPropertiesList.foreach(__v => __obj.updateDynamic("PiiEntitiesDetectionJobPropertiesList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPiiEntitiesDetectionJobsResponse]
    }
  }

  @js.native
  trait ListSentimentDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[SentimentDetectionJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListSentimentDetectionJobsRequest {
    @inline
    def apply(
        Filter: js.UndefOr[SentimentDetectionJobFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListSentimentDetectionJobsRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSentimentDetectionJobsRequest]
    }
  }

  @js.native
  trait ListSentimentDetectionJobsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var SentimentDetectionJobPropertiesList: js.UndefOr[SentimentDetectionJobPropertiesList]
  }

  object ListSentimentDetectionJobsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        SentimentDetectionJobPropertiesList: js.UndefOr[SentimentDetectionJobPropertiesList] = js.undefined
    ): ListSentimentDetectionJobsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SentimentDetectionJobPropertiesList.foreach(__v => __obj.updateDynamic("SentimentDetectionJobPropertiesList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSentimentDetectionJobsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: ComprehendArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: ComprehendArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var ResourceArn: js.UndefOr[ComprehendArn]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        ResourceArn: js.UndefOr[ComprehendArn] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTopicsDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[TopicsDetectionJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListTopicsDetectionJobsRequest {
    @inline
    def apply(
        Filter: js.UndefOr[TopicsDetectionJobFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListTopicsDetectionJobsRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTopicsDetectionJobsRequest]
    }
  }

  @js.native
  trait ListTopicsDetectionJobsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var TopicsDetectionJobPropertiesList: js.UndefOr[TopicsDetectionJobPropertiesList]
  }

  object ListTopicsDetectionJobsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        TopicsDetectionJobPropertiesList: js.UndefOr[TopicsDetectionJobPropertiesList] = js.undefined
    ): ListTopicsDetectionJobsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TopicsDetectionJobPropertiesList.foreach(__v => __obj.updateDynamic("TopicsDetectionJobPropertiesList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTopicsDetectionJobsResponse]
    }
  }

  @js.native
  sealed trait ModelStatus extends js.Any
  object ModelStatus {
    val SUBMITTED = "SUBMITTED".asInstanceOf[ModelStatus]
    val TRAINING = "TRAINING".asInstanceOf[ModelStatus]
    val DELETING = "DELETING".asInstanceOf[ModelStatus]
    val STOP_REQUESTED = "STOP_REQUESTED".asInstanceOf[ModelStatus]
    val STOPPED = "STOPPED".asInstanceOf[ModelStatus]
    val IN_ERROR = "IN_ERROR".asInstanceOf[ModelStatus]
    val TRAINED = "TRAINED".asInstanceOf[ModelStatus]

    @inline def values = js.Array(SUBMITTED, TRAINING, DELETING, STOP_REQUESTED, STOPPED, IN_ERROR, TRAINED)
  }

  /** Provides configuration parameters for the output of topic detection jobs.
    * <p/>
    */
  @js.native
  trait OutputDataConfig extends js.Object {
    var S3Uri: S3Uri
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object OutputDataConfig {
    @inline
    def apply(
        S3Uri: S3Uri,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): OutputDataConfig = {
      val __obj = js.Dynamic.literal(
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputDataConfig]
    }
  }

  /** Identifies the part of speech represented by the token and gives the confidence that Amazon Comprehend has that the part of speech was correctly identified. For more information about the parts of speech that Amazon Comprehend can identify, see <a>how-syntax</a>.
    */
  @js.native
  trait PartOfSpeechTag extends js.Object {
    var Score: js.UndefOr[Float]
    var Tag: js.UndefOr[PartOfSpeechTagType]
  }

  object PartOfSpeechTag {
    @inline
    def apply(
        Score: js.UndefOr[Float] = js.undefined,
        Tag: js.UndefOr[PartOfSpeechTagType] = js.undefined
    ): PartOfSpeechTag = {
      val __obj = js.Dynamic.literal()
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      Tag.foreach(__v => __obj.updateDynamic("Tag")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PartOfSpeechTag]
    }
  }

  @js.native
  sealed trait PartOfSpeechTagType extends js.Any
  object PartOfSpeechTagType {
    val ADJ = "ADJ".asInstanceOf[PartOfSpeechTagType]
    val ADP = "ADP".asInstanceOf[PartOfSpeechTagType]
    val ADV = "ADV".asInstanceOf[PartOfSpeechTagType]
    val AUX = "AUX".asInstanceOf[PartOfSpeechTagType]
    val CONJ = "CONJ".asInstanceOf[PartOfSpeechTagType]
    val CCONJ = "CCONJ".asInstanceOf[PartOfSpeechTagType]
    val DET = "DET".asInstanceOf[PartOfSpeechTagType]
    val INTJ = "INTJ".asInstanceOf[PartOfSpeechTagType]
    val NOUN = "NOUN".asInstanceOf[PartOfSpeechTagType]
    val NUM = "NUM".asInstanceOf[PartOfSpeechTagType]
    val O = "O".asInstanceOf[PartOfSpeechTagType]
    val PART = "PART".asInstanceOf[PartOfSpeechTagType]
    val PRON = "PRON".asInstanceOf[PartOfSpeechTagType]
    val PROPN = "PROPN".asInstanceOf[PartOfSpeechTagType]
    val PUNCT = "PUNCT".asInstanceOf[PartOfSpeechTagType]
    val SCONJ = "SCONJ".asInstanceOf[PartOfSpeechTagType]
    val SYM = "SYM".asInstanceOf[PartOfSpeechTagType]
    val VERB = "VERB".asInstanceOf[PartOfSpeechTagType]

    @inline def values = js.Array(ADJ, ADP, ADV, AUX, CONJ, CCONJ, DET, INTJ, NOUN, NUM, O, PART, PRON, PROPN, PUNCT, SCONJ, SYM, VERB)
  }

  /** Provides information for filtering a list of PII entity detection jobs.
    */
  @js.native
  trait PiiEntitiesDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  object PiiEntitiesDetectionJobFilter {
    @inline
    def apply(
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
    ): PiiEntitiesDetectionJobFilter = {
      val __obj = js.Dynamic.literal()
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      SubmitTimeAfter.foreach(__v => __obj.updateDynamic("SubmitTimeAfter")(__v.asInstanceOf[js.Any]))
      SubmitTimeBefore.foreach(__v => __obj.updateDynamic("SubmitTimeBefore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PiiEntitiesDetectionJobFilter]
    }
  }

  /** Provides information about a PII entities detection job.
    */
  @js.native
  trait PiiEntitiesDetectionJobProperties extends js.Object {
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var EndTime: js.UndefOr[Timestamp]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Message: js.UndefOr[AnyLengthString]
    var Mode: js.UndefOr[PiiEntitiesDetectionMode]
    var OutputDataConfig: js.UndefOr[PiiOutputDataConfig]
    var RedactionConfig: js.UndefOr[RedactionConfig]
    var SubmitTime: js.UndefOr[Timestamp]
  }

  object PiiEntitiesDetectionJobProperties {
    @inline
    def apply(
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Message: js.UndefOr[AnyLengthString] = js.undefined,
        Mode: js.UndefOr[PiiEntitiesDetectionMode] = js.undefined,
        OutputDataConfig: js.UndefOr[PiiOutputDataConfig] = js.undefined,
        RedactionConfig: js.UndefOr[RedactionConfig] = js.undefined,
        SubmitTime: js.UndefOr[Timestamp] = js.undefined
    ): PiiEntitiesDetectionJobProperties = {
      val __obj = js.Dynamic.literal()
      DataAccessRoleArn.foreach(__v => __obj.updateDynamic("DataAccessRoleArn")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.updateDynamic("OutputDataConfig")(__v.asInstanceOf[js.Any]))
      RedactionConfig.foreach(__v => __obj.updateDynamic("RedactionConfig")(__v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.updateDynamic("SubmitTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PiiEntitiesDetectionJobProperties]
    }
  }

  @js.native
  sealed trait PiiEntitiesDetectionMaskMode extends js.Any
  object PiiEntitiesDetectionMaskMode {
    val MASK = "MASK".asInstanceOf[PiiEntitiesDetectionMaskMode]
    val REPLACE_WITH_PII_ENTITY_TYPE = "REPLACE_WITH_PII_ENTITY_TYPE".asInstanceOf[PiiEntitiesDetectionMaskMode]

    @inline def values = js.Array(MASK, REPLACE_WITH_PII_ENTITY_TYPE)
  }

  @js.native
  sealed trait PiiEntitiesDetectionMode extends js.Any
  object PiiEntitiesDetectionMode {
    val ONLY_REDACTION = "ONLY_REDACTION".asInstanceOf[PiiEntitiesDetectionMode]
    val ONLY_OFFSETS = "ONLY_OFFSETS".asInstanceOf[PiiEntitiesDetectionMode]

    @inline def values = js.Array(ONLY_REDACTION, ONLY_OFFSETS)
  }

  /** Provides information about a PII entity.
    */
  @js.native
  trait PiiEntity extends js.Object {
    var BeginOffset: js.UndefOr[Int]
    var EndOffset: js.UndefOr[Int]
    var Score: js.UndefOr[Float]
    var Type: js.UndefOr[PiiEntityType]
  }

  object PiiEntity {
    @inline
    def apply(
        BeginOffset: js.UndefOr[Int] = js.undefined,
        EndOffset: js.UndefOr[Int] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined,
        Type: js.UndefOr[PiiEntityType] = js.undefined
    ): PiiEntity = {
      val __obj = js.Dynamic.literal()
      BeginOffset.foreach(__v => __obj.updateDynamic("BeginOffset")(__v.asInstanceOf[js.Any]))
      EndOffset.foreach(__v => __obj.updateDynamic("EndOffset")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PiiEntity]
    }
  }

  @js.native
  sealed trait PiiEntityType extends js.Any
  object PiiEntityType {
    val BANK_ACCOUNT_NUMBER = "BANK_ACCOUNT_NUMBER".asInstanceOf[PiiEntityType]
    val BANK_ROUTING = "BANK_ROUTING".asInstanceOf[PiiEntityType]
    val CREDIT_DEBIT_NUMBER = "CREDIT_DEBIT_NUMBER".asInstanceOf[PiiEntityType]
    val CREDIT_DEBIT_CVV = "CREDIT_DEBIT_CVV".asInstanceOf[PiiEntityType]
    val CREDIT_DEBIT_EXPIRY = "CREDIT_DEBIT_EXPIRY".asInstanceOf[PiiEntityType]
    val PIN = "PIN".asInstanceOf[PiiEntityType]
    val EMAIL = "EMAIL".asInstanceOf[PiiEntityType]
    val ADDRESS = "ADDRESS".asInstanceOf[PiiEntityType]
    val NAME = "NAME".asInstanceOf[PiiEntityType]
    val PHONE = "PHONE".asInstanceOf[PiiEntityType]
    val SSN = "SSN".asInstanceOf[PiiEntityType]
    val DATE_TIME = "DATE_TIME".asInstanceOf[PiiEntityType]
    val PASSPORT_NUMBER = "PASSPORT_NUMBER".asInstanceOf[PiiEntityType]
    val DRIVER_ID = "DRIVER_ID".asInstanceOf[PiiEntityType]
    val URL = "URL".asInstanceOf[PiiEntityType]
    val AGE = "AGE".asInstanceOf[PiiEntityType]
    val USERNAME = "USERNAME".asInstanceOf[PiiEntityType]
    val PASSWORD = "PASSWORD".asInstanceOf[PiiEntityType]
    val AWS_ACCESS_KEY = "AWS_ACCESS_KEY".asInstanceOf[PiiEntityType]
    val AWS_SECRET_KEY = "AWS_SECRET_KEY".asInstanceOf[PiiEntityType]
    val IP_ADDRESS = "IP_ADDRESS".asInstanceOf[PiiEntityType]
    val MAC_ADDRESS = "MAC_ADDRESS".asInstanceOf[PiiEntityType]
    val ALL = "ALL".asInstanceOf[PiiEntityType]

    @inline def values = js.Array(
      BANK_ACCOUNT_NUMBER,
      BANK_ROUTING,
      CREDIT_DEBIT_NUMBER,
      CREDIT_DEBIT_CVV,
      CREDIT_DEBIT_EXPIRY,
      PIN,
      EMAIL,
      ADDRESS,
      NAME,
      PHONE,
      SSN,
      DATE_TIME,
      PASSPORT_NUMBER,
      DRIVER_ID,
      URL,
      AGE,
      USERNAME,
      PASSWORD,
      AWS_ACCESS_KEY,
      AWS_SECRET_KEY,
      IP_ADDRESS,
      MAC_ADDRESS,
      ALL
    )
  }

  /** Provides configuration parameters for the output of PII entity detection jobs.
    */
  @js.native
  trait PiiOutputDataConfig extends js.Object {
    var S3Uri: S3Uri
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object PiiOutputDataConfig {
    @inline
    def apply(
        S3Uri: S3Uri,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): PiiOutputDataConfig = {
      val __obj = js.Dynamic.literal(
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PiiOutputDataConfig]
    }
  }

  /** Provides configuration parameters for PII entity redaction.
    */
  @js.native
  trait RedactionConfig extends js.Object {
    var MaskCharacter: js.UndefOr[MaskCharacter]
    var MaskMode: js.UndefOr[PiiEntitiesDetectionMaskMode]
    var PiiEntityTypes: js.UndefOr[ListOfPiiEntityTypes]
  }

  object RedactionConfig {
    @inline
    def apply(
        MaskCharacter: js.UndefOr[MaskCharacter] = js.undefined,
        MaskMode: js.UndefOr[PiiEntitiesDetectionMaskMode] = js.undefined,
        PiiEntityTypes: js.UndefOr[ListOfPiiEntityTypes] = js.undefined
    ): RedactionConfig = {
      val __obj = js.Dynamic.literal()
      MaskCharacter.foreach(__v => __obj.updateDynamic("MaskCharacter")(__v.asInstanceOf[js.Any]))
      MaskMode.foreach(__v => __obj.updateDynamic("MaskMode")(__v.asInstanceOf[js.Any]))
      PiiEntityTypes.foreach(__v => __obj.updateDynamic("PiiEntityTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RedactionConfig]
    }
  }

  /** Provides information for filtering a list of dominant language detection jobs. For more information, see the operation.
    */
  @js.native
  trait SentimentDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  object SentimentDetectionJobFilter {
    @inline
    def apply(
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
    ): SentimentDetectionJobFilter = {
      val __obj = js.Dynamic.literal()
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      SubmitTimeAfter.foreach(__v => __obj.updateDynamic("SubmitTimeAfter")(__v.asInstanceOf[js.Any]))
      SubmitTimeBefore.foreach(__v => __obj.updateDynamic("SubmitTimeBefore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SentimentDetectionJobFilter]
    }
  }

  /** Provides information about a sentiment detection job.
    */
  @js.native
  trait SentimentDetectionJobProperties extends js.Object {
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var EndTime: js.UndefOr[Timestamp]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Message: js.UndefOr[AnyLengthString]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var SubmitTime: js.UndefOr[Timestamp]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object SentimentDetectionJobProperties {
    @inline
    def apply(
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Message: js.UndefOr[AnyLengthString] = js.undefined,
        OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
        SubmitTime: js.UndefOr[Timestamp] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): SentimentDetectionJobProperties = {
      val __obj = js.Dynamic.literal()
      DataAccessRoleArn.foreach(__v => __obj.updateDynamic("DataAccessRoleArn")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.updateDynamic("OutputDataConfig")(__v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.updateDynamic("SubmitTime")(__v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SentimentDetectionJobProperties]
    }
  }

  /** Describes the level of confidence that Amazon Comprehend has in the accuracy of its detection of sentiments.
    */
  @js.native
  trait SentimentScore extends js.Object {
    var Mixed: js.UndefOr[Float]
    var Negative: js.UndefOr[Float]
    var Neutral: js.UndefOr[Float]
    var Positive: js.UndefOr[Float]
  }

  object SentimentScore {
    @inline
    def apply(
        Mixed: js.UndefOr[Float] = js.undefined,
        Negative: js.UndefOr[Float] = js.undefined,
        Neutral: js.UndefOr[Float] = js.undefined,
        Positive: js.UndefOr[Float] = js.undefined
    ): SentimentScore = {
      val __obj = js.Dynamic.literal()
      Mixed.foreach(__v => __obj.updateDynamic("Mixed")(__v.asInstanceOf[js.Any]))
      Negative.foreach(__v => __obj.updateDynamic("Negative")(__v.asInstanceOf[js.Any]))
      Neutral.foreach(__v => __obj.updateDynamic("Neutral")(__v.asInstanceOf[js.Any]))
      Positive.foreach(__v => __obj.updateDynamic("Positive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SentimentScore]
    }
  }

  @js.native
  sealed trait SentimentType extends js.Any
  object SentimentType {
    val POSITIVE = "POSITIVE".asInstanceOf[SentimentType]
    val NEGATIVE = "NEGATIVE".asInstanceOf[SentimentType]
    val NEUTRAL = "NEUTRAL".asInstanceOf[SentimentType]
    val MIXED = "MIXED".asInstanceOf[SentimentType]

    @inline def values = js.Array(POSITIVE, NEGATIVE, NEUTRAL, MIXED)
  }

  @js.native
  trait StartDocumentClassificationJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var DocumentClassifierArn: DocumentClassifierArn
    var InputDataConfig: InputDataConfig
    var OutputDataConfig: OutputDataConfig
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var JobName: js.UndefOr[JobName]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object StartDocumentClassificationJobRequest {
    @inline
    def apply(
        DataAccessRoleArn: IamRoleArn,
        DocumentClassifierArn: DocumentClassifierArn,
        InputDataConfig: InputDataConfig,
        OutputDataConfig: OutputDataConfig,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): StartDocumentClassificationJobRequest = {
      val __obj = js.Dynamic.literal(
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "DocumentClassifierArn" -> DocumentClassifierArn.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDocumentClassificationJobRequest]
    }
  }

  @js.native
  trait StartDocumentClassificationJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StartDocumentClassificationJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StartDocumentClassificationJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDocumentClassificationJobResponse]
    }
  }

  @js.native
  trait StartDominantLanguageDetectionJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var OutputDataConfig: OutputDataConfig
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var JobName: js.UndefOr[JobName]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object StartDominantLanguageDetectionJobRequest {
    @inline
    def apply(
        DataAccessRoleArn: IamRoleArn,
        InputDataConfig: InputDataConfig,
        OutputDataConfig: OutputDataConfig,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): StartDominantLanguageDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDominantLanguageDetectionJobRequest]
    }
  }

  @js.native
  trait StartDominantLanguageDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StartDominantLanguageDetectionJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StartDominantLanguageDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDominantLanguageDetectionJobResponse]
    }
  }

  @js.native
  trait StartEntitiesDetectionJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var LanguageCode: LanguageCode
    var OutputDataConfig: OutputDataConfig
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var EntityRecognizerArn: js.UndefOr[EntityRecognizerArn]
    var JobName: js.UndefOr[JobName]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object StartEntitiesDetectionJobRequest {
    @inline
    def apply(
        DataAccessRoleArn: IamRoleArn,
        InputDataConfig: InputDataConfig,
        LanguageCode: LanguageCode,
        OutputDataConfig: OutputDataConfig,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        EntityRecognizerArn: js.UndefOr[EntityRecognizerArn] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): StartEntitiesDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      EntityRecognizerArn.foreach(__v => __obj.updateDynamic("EntityRecognizerArn")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartEntitiesDetectionJobRequest]
    }
  }

  @js.native
  trait StartEntitiesDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StartEntitiesDetectionJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StartEntitiesDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartEntitiesDetectionJobResponse]
    }
  }

  @js.native
  trait StartEventsDetectionJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var LanguageCode: LanguageCode
    var OutputDataConfig: OutputDataConfig
    var TargetEventTypes: TargetEventTypes
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var JobName: js.UndefOr[JobName]
  }

  object StartEventsDetectionJobRequest {
    @inline
    def apply(
        DataAccessRoleArn: IamRoleArn,
        InputDataConfig: InputDataConfig,
        LanguageCode: LanguageCode,
        OutputDataConfig: OutputDataConfig,
        TargetEventTypes: TargetEventTypes,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined
    ): StartEventsDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any],
        "TargetEventTypes" -> TargetEventTypes.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartEventsDetectionJobRequest]
    }
  }

  @js.native
  trait StartEventsDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StartEventsDetectionJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StartEventsDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartEventsDetectionJobResponse]
    }
  }

  @js.native
  trait StartKeyPhrasesDetectionJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var LanguageCode: LanguageCode
    var OutputDataConfig: OutputDataConfig
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var JobName: js.UndefOr[JobName]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object StartKeyPhrasesDetectionJobRequest {
    @inline
    def apply(
        DataAccessRoleArn: IamRoleArn,
        InputDataConfig: InputDataConfig,
        LanguageCode: LanguageCode,
        OutputDataConfig: OutputDataConfig,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): StartKeyPhrasesDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartKeyPhrasesDetectionJobRequest]
    }
  }

  @js.native
  trait StartKeyPhrasesDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StartKeyPhrasesDetectionJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StartKeyPhrasesDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartKeyPhrasesDetectionJobResponse]
    }
  }

  @js.native
  trait StartPiiEntitiesDetectionJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var LanguageCode: LanguageCode
    var Mode: PiiEntitiesDetectionMode
    var OutputDataConfig: OutputDataConfig
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var JobName: js.UndefOr[JobName]
    var RedactionConfig: js.UndefOr[RedactionConfig]
  }

  object StartPiiEntitiesDetectionJobRequest {
    @inline
    def apply(
        DataAccessRoleArn: IamRoleArn,
        InputDataConfig: InputDataConfig,
        LanguageCode: LanguageCode,
        Mode: PiiEntitiesDetectionMode,
        OutputDataConfig: OutputDataConfig,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        RedactionConfig: js.UndefOr[RedactionConfig] = js.undefined
    ): StartPiiEntitiesDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "Mode" -> Mode.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      RedactionConfig.foreach(__v => __obj.updateDynamic("RedactionConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartPiiEntitiesDetectionJobRequest]
    }
  }

  @js.native
  trait StartPiiEntitiesDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StartPiiEntitiesDetectionJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StartPiiEntitiesDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartPiiEntitiesDetectionJobResponse]
    }
  }

  @js.native
  trait StartSentimentDetectionJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var LanguageCode: LanguageCode
    var OutputDataConfig: OutputDataConfig
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var JobName: js.UndefOr[JobName]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object StartSentimentDetectionJobRequest {
    @inline
    def apply(
        DataAccessRoleArn: IamRoleArn,
        InputDataConfig: InputDataConfig,
        LanguageCode: LanguageCode,
        OutputDataConfig: OutputDataConfig,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): StartSentimentDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSentimentDetectionJobRequest]
    }
  }

  @js.native
  trait StartSentimentDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StartSentimentDetectionJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StartSentimentDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSentimentDetectionJobResponse]
    }
  }

  @js.native
  trait StartTopicsDetectionJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var OutputDataConfig: OutputDataConfig
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var JobName: js.UndefOr[JobName]
    var NumberOfTopics: js.UndefOr[NumberOfTopicsInteger]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object StartTopicsDetectionJobRequest {
    @inline
    def apply(
        DataAccessRoleArn: IamRoleArn,
        InputDataConfig: InputDataConfig,
        OutputDataConfig: OutputDataConfig,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        NumberOfTopics: js.UndefOr[NumberOfTopicsInteger] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): StartTopicsDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      NumberOfTopics.foreach(__v => __obj.updateDynamic("NumberOfTopics")(__v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTopicsDetectionJobRequest]
    }
  }

  @js.native
  trait StartTopicsDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StartTopicsDetectionJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StartTopicsDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTopicsDetectionJobResponse]
    }
  }

  @js.native
  trait StopDominantLanguageDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object StopDominantLanguageDetectionJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): StopDominantLanguageDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopDominantLanguageDetectionJobRequest]
    }
  }

  @js.native
  trait StopDominantLanguageDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StopDominantLanguageDetectionJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StopDominantLanguageDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopDominantLanguageDetectionJobResponse]
    }
  }

  @js.native
  trait StopEntitiesDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object StopEntitiesDetectionJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): StopEntitiesDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopEntitiesDetectionJobRequest]
    }
  }

  @js.native
  trait StopEntitiesDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StopEntitiesDetectionJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StopEntitiesDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopEntitiesDetectionJobResponse]
    }
  }

  @js.native
  trait StopEventsDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object StopEventsDetectionJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): StopEventsDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopEventsDetectionJobRequest]
    }
  }

  @js.native
  trait StopEventsDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StopEventsDetectionJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StopEventsDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopEventsDetectionJobResponse]
    }
  }

  @js.native
  trait StopKeyPhrasesDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object StopKeyPhrasesDetectionJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): StopKeyPhrasesDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopKeyPhrasesDetectionJobRequest]
    }
  }

  @js.native
  trait StopKeyPhrasesDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StopKeyPhrasesDetectionJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StopKeyPhrasesDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopKeyPhrasesDetectionJobResponse]
    }
  }

  @js.native
  trait StopPiiEntitiesDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object StopPiiEntitiesDetectionJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): StopPiiEntitiesDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopPiiEntitiesDetectionJobRequest]
    }
  }

  @js.native
  trait StopPiiEntitiesDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StopPiiEntitiesDetectionJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StopPiiEntitiesDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopPiiEntitiesDetectionJobResponse]
    }
  }

  @js.native
  trait StopSentimentDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object StopSentimentDetectionJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): StopSentimentDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopSentimentDetectionJobRequest]
    }
  }

  @js.native
  trait StopSentimentDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StopSentimentDetectionJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StopSentimentDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopSentimentDetectionJobResponse]
    }
  }

  @js.native
  trait StopTrainingDocumentClassifierRequest extends js.Object {
    var DocumentClassifierArn: DocumentClassifierArn
  }

  object StopTrainingDocumentClassifierRequest {
    @inline
    def apply(
        DocumentClassifierArn: DocumentClassifierArn
    ): StopTrainingDocumentClassifierRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentClassifierArn" -> DocumentClassifierArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopTrainingDocumentClassifierRequest]
    }
  }

  @js.native
  trait StopTrainingDocumentClassifierResponse extends js.Object

  object StopTrainingDocumentClassifierResponse {
    @inline
    def apply(): StopTrainingDocumentClassifierResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopTrainingDocumentClassifierResponse]
    }
  }

  @js.native
  trait StopTrainingEntityRecognizerRequest extends js.Object {
    var EntityRecognizerArn: EntityRecognizerArn
  }

  object StopTrainingEntityRecognizerRequest {
    @inline
    def apply(
        EntityRecognizerArn: EntityRecognizerArn
    ): StopTrainingEntityRecognizerRequest = {
      val __obj = js.Dynamic.literal(
        "EntityRecognizerArn" -> EntityRecognizerArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopTrainingEntityRecognizerRequest]
    }
  }

  @js.native
  trait StopTrainingEntityRecognizerResponse extends js.Object

  object StopTrainingEntityRecognizerResponse {
    @inline
    def apply(): StopTrainingEntityRecognizerResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopTrainingEntityRecognizerResponse]
    }
  }

  @js.native
  sealed trait SyntaxLanguageCode extends js.Any
  object SyntaxLanguageCode {
    val en = "en".asInstanceOf[SyntaxLanguageCode]
    val es = "es".asInstanceOf[SyntaxLanguageCode]
    val fr = "fr".asInstanceOf[SyntaxLanguageCode]
    val de = "de".asInstanceOf[SyntaxLanguageCode]
    val it = "it".asInstanceOf[SyntaxLanguageCode]
    val pt = "pt".asInstanceOf[SyntaxLanguageCode]

    @inline def values = js.Array(en, es, fr, de, it, pt)
  }

  /** Represents a work in the input text that was recognized and assigned a part of speech. There is one syntax token record for each word in the source text.
    */
  @js.native
  trait SyntaxToken extends js.Object {
    var BeginOffset: js.UndefOr[Int]
    var EndOffset: js.UndefOr[Int]
    var PartOfSpeech: js.UndefOr[PartOfSpeechTag]
    var Text: js.UndefOr[String]
    var TokenId: js.UndefOr[Int]
  }

  object SyntaxToken {
    @inline
    def apply(
        BeginOffset: js.UndefOr[Int] = js.undefined,
        EndOffset: js.UndefOr[Int] = js.undefined,
        PartOfSpeech: js.UndefOr[PartOfSpeechTag] = js.undefined,
        Text: js.UndefOr[String] = js.undefined,
        TokenId: js.UndefOr[Int] = js.undefined
    ): SyntaxToken = {
      val __obj = js.Dynamic.literal()
      BeginOffset.foreach(__v => __obj.updateDynamic("BeginOffset")(__v.asInstanceOf[js.Any]))
      EndOffset.foreach(__v => __obj.updateDynamic("EndOffset")(__v.asInstanceOf[js.Any]))
      PartOfSpeech.foreach(__v => __obj.updateDynamic("PartOfSpeech")(__v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      TokenId.foreach(__v => __obj.updateDynamic("TokenId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SyntaxToken]
    }
  }

  /** A key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with the key-value pair ‘Department’:’Sales’ might be added to a resource to indicate its use by a particular department.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: ComprehendArn
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: ComprehendArn,
        Tags: TagList
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

  /** Provides information for filtering topic detection jobs. For more information, see .
    */
  @js.native
  trait TopicsDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  object TopicsDetectionJobFilter {
    @inline
    def apply(
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
    ): TopicsDetectionJobFilter = {
      val __obj = js.Dynamic.literal()
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      SubmitTimeAfter.foreach(__v => __obj.updateDynamic("SubmitTimeAfter")(__v.asInstanceOf[js.Any]))
      SubmitTimeBefore.foreach(__v => __obj.updateDynamic("SubmitTimeBefore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TopicsDetectionJobFilter]
    }
  }

  /** Provides information about a topic detection job.
    */
  @js.native
  trait TopicsDetectionJobProperties extends js.Object {
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var EndTime: js.UndefOr[Timestamp]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var Message: js.UndefOr[AnyLengthString]
    var NumberOfTopics: js.UndefOr[Int]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var SubmitTime: js.UndefOr[Timestamp]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object TopicsDetectionJobProperties {
    @inline
    def apply(
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        Message: js.UndefOr[AnyLengthString] = js.undefined,
        NumberOfTopics: js.UndefOr[Int] = js.undefined,
        OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
        SubmitTime: js.UndefOr[Timestamp] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): TopicsDetectionJobProperties = {
      val __obj = js.Dynamic.literal()
      DataAccessRoleArn.foreach(__v => __obj.updateDynamic("DataAccessRoleArn")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      NumberOfTopics.foreach(__v => __obj.updateDynamic("NumberOfTopics")(__v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.updateDynamic("OutputDataConfig")(__v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.updateDynamic("SubmitTime")(__v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TopicsDetectionJobProperties]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: ComprehendArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: ComprehendArn,
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

  @js.native
  trait UpdateEndpointRequest extends js.Object {
    var DesiredInferenceUnits: InferenceUnitsInteger
    var EndpointArn: ComprehendEndpointArn
  }

  object UpdateEndpointRequest {
    @inline
    def apply(
        DesiredInferenceUnits: InferenceUnitsInteger,
        EndpointArn: ComprehendEndpointArn
    ): UpdateEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "DesiredInferenceUnits" -> DesiredInferenceUnits.asInstanceOf[js.Any],
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateEndpointRequest]
    }
  }

  @js.native
  trait UpdateEndpointResponse extends js.Object

  object UpdateEndpointResponse {
    @inline
    def apply(): UpdateEndpointResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateEndpointResponse]
    }
  }

  /** Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the resources you are using for the job. For more information, see [[https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html|Amazon VPC]].
    */
  @js.native
  trait VpcConfig extends js.Object {
    var SecurityGroupIds: SecurityGroupIds
    var Subnets: Subnets
  }

  object VpcConfig {
    @inline
    def apply(
        SecurityGroupIds: SecurityGroupIds,
        Subnets: Subnets
    ): VpcConfig = {
      val __obj = js.Dynamic.literal(
        "SecurityGroupIds" -> SecurityGroupIds.asInstanceOf[js.Any],
        "Subnets" -> Subnets.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VpcConfig]
    }
  }
}
