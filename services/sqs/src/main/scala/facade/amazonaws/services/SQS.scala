package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object sqs {
  type AWSAccountIdList                             = js.Array[String]
  type ActionNameList                               = js.Array[String]
  type AttributeNameList                            = js.Array[QueueAttributeName]
  type BatchResultErrorEntryList                    = js.Array[BatchResultErrorEntry]
  type Binary                                       = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BinaryList                                   = js.Array[Binary]
  type ChangeMessageVisibilityBatchRequestEntryList = js.Array[ChangeMessageVisibilityBatchRequestEntry]
  type ChangeMessageVisibilityBatchResultEntryList  = js.Array[ChangeMessageVisibilityBatchResultEntry]
  type DeleteMessageBatchRequestEntryList           = js.Array[DeleteMessageBatchRequestEntry]
  type DeleteMessageBatchResultEntryList            = js.Array[DeleteMessageBatchResultEntry]
  type MessageAttributeName                         = String
  type MessageAttributeNameList                     = js.Array[MessageAttributeName]
  type MessageBodyAttributeMap                      = js.Dictionary[MessageAttributeValue]
  type MessageList                                  = js.Array[Message]
  type MessageSystemAttributeMap                    = js.Dictionary[String]
  type MessageSystemAttributeName                   = String
  type QueueAttributeMap                            = js.Dictionary[String]
  type QueueAttributeName                           = String
  type QueueUrlList                                 = js.Array[String]
  type SendMessageBatchRequestEntryList             = js.Array[SendMessageBatchRequestEntry]
  type SendMessageBatchResultEntryList              = js.Array[SendMessageBatchResultEntry]
  type StringList                                   = js.Array[String]
  type TagKey                                       = String
  type TagKeyList                                   = js.Array[TagKey]
  type TagMap                                       = js.Dictionary[TagValue]
  type TagValue                                     = String

  implicit final class SQSOps(val service: SQS) extends AnyVal {

    def addPermissionFuture(params: AddPermissionRequest): Future[js.Object] =
      service.addPermission(params).promise.toFuture
    def changeMessageVisibilityBatchFuture(
        params: ChangeMessageVisibilityBatchRequest
    ): Future[ChangeMessageVisibilityBatchResult] = service.changeMessageVisibilityBatch(params).promise.toFuture
    def changeMessageVisibilityFuture(params: ChangeMessageVisibilityRequest): Future[js.Object] =
      service.changeMessageVisibility(params).promise.toFuture
    def createQueueFuture(params: CreateQueueRequest): Future[CreateQueueResult] =
      service.createQueue(params).promise.toFuture
    def deleteMessageBatchFuture(params: DeleteMessageBatchRequest): Future[DeleteMessageBatchResult] =
      service.deleteMessageBatch(params).promise.toFuture
    def deleteMessageFuture(params: DeleteMessageRequest): Future[js.Object] =
      service.deleteMessage(params).promise.toFuture
    def deleteQueueFuture(params: DeleteQueueRequest): Future[js.Object] = service.deleteQueue(params).promise.toFuture
    def getQueueAttributesFuture(params: GetQueueAttributesRequest): Future[GetQueueAttributesResult] =
      service.getQueueAttributes(params).promise.toFuture
    def getQueueUrlFuture(params: GetQueueUrlRequest): Future[GetQueueUrlResult] =
      service.getQueueUrl(params).promise.toFuture
    def listDeadLetterSourceQueuesFuture(
        params: ListDeadLetterSourceQueuesRequest
    ): Future[ListDeadLetterSourceQueuesResult] = service.listDeadLetterSourceQueues(params).promise.toFuture
    def listQueueTagsFuture(params: ListQueueTagsRequest): Future[ListQueueTagsResult] =
      service.listQueueTags(params).promise.toFuture
    def listQueuesFuture(params: ListQueuesRequest): Future[ListQueuesResult] =
      service.listQueues(params).promise.toFuture
    def purgeQueueFuture(params: PurgeQueueRequest): Future[js.Object] = service.purgeQueue(params).promise.toFuture
    def receiveMessageFuture(params: ReceiveMessageRequest): Future[ReceiveMessageResult] =
      service.receiveMessage(params).promise.toFuture
    def removePermissionFuture(params: RemovePermissionRequest): Future[js.Object] =
      service.removePermission(params).promise.toFuture
    def sendMessageBatchFuture(params: SendMessageBatchRequest): Future[SendMessageBatchResult] =
      service.sendMessageBatch(params).promise.toFuture
    def sendMessageFuture(params: SendMessageRequest): Future[SendMessageResult] =
      service.sendMessage(params).promise.toFuture
    def setQueueAttributesFuture(params: SetQueueAttributesRequest): Future[js.Object] =
      service.setQueueAttributes(params).promise.toFuture
    def tagQueueFuture(params: TagQueueRequest): Future[js.Object]     = service.tagQueue(params).promise.toFuture
    def untagQueueFuture(params: UntagQueueRequest): Future[js.Object] = service.untagQueue(params).promise.toFuture
  }
}

package sqs {
  @js.native
  @JSImport("aws-sdk", "SQS")
  class SQS() extends js.Object {
    def this(config: AWSConfig) = this()

    def addPermission(params: AddPermissionRequest): Request[js.Object]                     = js.native
    def changeMessageVisibility(params: ChangeMessageVisibilityRequest): Request[js.Object] = js.native
    def changeMessageVisibilityBatch(
        params: ChangeMessageVisibilityBatchRequest
    ): Request[ChangeMessageVisibilityBatchResult]                                               = js.native
    def createQueue(params: CreateQueueRequest): Request[CreateQueueResult]                      = js.native
    def deleteMessage(params: DeleteMessageRequest): Request[js.Object]                          = js.native
    def deleteMessageBatch(params: DeleteMessageBatchRequest): Request[DeleteMessageBatchResult] = js.native
    def deleteQueue(params: DeleteQueueRequest): Request[js.Object]                              = js.native
    def getQueueAttributes(params: GetQueueAttributesRequest): Request[GetQueueAttributesResult] = js.native
    def getQueueUrl(params: GetQueueUrlRequest): Request[GetQueueUrlResult]                      = js.native
    def listDeadLetterSourceQueues(
        params: ListDeadLetterSourceQueuesRequest
    ): Request[ListDeadLetterSourceQueuesResult]                                           = js.native
    def listQueueTags(params: ListQueueTagsRequest): Request[ListQueueTagsResult]          = js.native
    def listQueues(params: ListQueuesRequest): Request[ListQueuesResult]                   = js.native
    def purgeQueue(params: PurgeQueueRequest): Request[js.Object]                          = js.native
    def receiveMessage(params: ReceiveMessageRequest): Request[ReceiveMessageResult]       = js.native
    def removePermission(params: RemovePermissionRequest): Request[js.Object]              = js.native
    def sendMessage(params: SendMessageRequest): Request[SendMessageResult]                = js.native
    def sendMessageBatch(params: SendMessageBatchRequest): Request[SendMessageBatchResult] = js.native
    def setQueueAttributes(params: SetQueueAttributesRequest): Request[js.Object]          = js.native
    def tagQueue(params: TagQueueRequest): Request[js.Object]                              = js.native
    def untagQueue(params: UntagQueueRequest): Request[js.Object]                          = js.native
  }

  /**
    * <p/>
    */
  @js.native
  trait AddPermissionRequest extends js.Object {
    var AWSAccountIds: AWSAccountIdList
    var Actions: ActionNameList
    var Label: String
    var QueueUrl: String
  }

  object AddPermissionRequest {
    def apply(
        AWSAccountIds: AWSAccountIdList,
        Actions: ActionNameList,
        Label: String,
        QueueUrl: String
    ): AddPermissionRequest = {
      val __obj = js.Dictionary[js.Any](
        "AWSAccountIds" -> AWSAccountIds.asInstanceOf[js.Any],
        "Actions"       -> Actions.asInstanceOf[js.Any],
        "Label"         -> Label.asInstanceOf[js.Any],
        "QueueUrl"      -> QueueUrl.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddPermissionRequest]
    }
  }

  /**
    * Gives a detailed description of the result of an action on each entry in the request.
    */
  @js.native
  trait BatchResultErrorEntry extends js.Object {
    var Code: String
    var Id: String
    var SenderFault: Boolean
    var Message: js.UndefOr[String]
  }

  object BatchResultErrorEntry {
    def apply(
        Code: String,
        Id: String,
        SenderFault: Boolean,
        Message: js.UndefOr[String] = js.undefined
    ): BatchResultErrorEntry = {
      val __obj = js.Dictionary[js.Any](
        "Code"        -> Code.asInstanceOf[js.Any],
        "Id"          -> Id.asInstanceOf[js.Any],
        "SenderFault" -> SenderFault.asInstanceOf[js.Any]
      )

      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchResultErrorEntry]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ChangeMessageVisibilityBatchRequest extends js.Object {
    var Entries: ChangeMessageVisibilityBatchRequestEntryList
    var QueueUrl: String
  }

  object ChangeMessageVisibilityBatchRequest {
    def apply(
        Entries: ChangeMessageVisibilityBatchRequestEntryList,
        QueueUrl: String
    ): ChangeMessageVisibilityBatchRequest = {
      val __obj = js.Dictionary[js.Any](
        "Entries"  -> Entries.asInstanceOf[js.Any],
        "QueueUrl" -> QueueUrl.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ChangeMessageVisibilityBatchRequest]
    }
  }

  /**
    * Encloses a receipt handle and an entry id for each message in <code> <a>ChangeMessageVisibilityBatch</a>.</code>
    *  <important> All of the following list parameters must be prefixed with <code>ChangeMessageVisibilityBatchRequestEntry.n</code>, where <code>n</code> is an integer value starting with <code>1</code>. For example, a parameter list for this action might look like this:
    *  </important> <code>&amp;ChangeMessageVisibilityBatchRequestEntry.1.Id=change_visibility_msg_2</code>
    *  <code>&amp;ChangeMessageVisibilityBatchRequestEntry.1.ReceiptHandle=your_receipt_handle</code>
    *  <code>&amp;ChangeMessageVisibilityBatchRequestEntry.1.VisibilityTimeout=45</code>
    */
  @js.native
  trait ChangeMessageVisibilityBatchRequestEntry extends js.Object {
    var Id: String
    var ReceiptHandle: String
    var VisibilityTimeout: js.UndefOr[Int]
  }

  object ChangeMessageVisibilityBatchRequestEntry {
    def apply(
        Id: String,
        ReceiptHandle: String,
        VisibilityTimeout: js.UndefOr[Int] = js.undefined
    ): ChangeMessageVisibilityBatchRequestEntry = {
      val __obj = js.Dictionary[js.Any](
        "Id"            -> Id.asInstanceOf[js.Any],
        "ReceiptHandle" -> ReceiptHandle.asInstanceOf[js.Any]
      )

      VisibilityTimeout.foreach(__v => __obj.update("VisibilityTimeout", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChangeMessageVisibilityBatchRequestEntry]
    }
  }

  /**
    * For each message in the batch, the response contains a <code> <a>ChangeMessageVisibilityBatchResultEntry</a> </code> tag if the message succeeds or a <code> <a>BatchResultErrorEntry</a> </code> tag if the message fails.
    */
  @js.native
  trait ChangeMessageVisibilityBatchResult extends js.Object {
    var Failed: BatchResultErrorEntryList
    var Successful: ChangeMessageVisibilityBatchResultEntryList
  }

  object ChangeMessageVisibilityBatchResult {
    def apply(
        Failed: BatchResultErrorEntryList,
        Successful: ChangeMessageVisibilityBatchResultEntryList
    ): ChangeMessageVisibilityBatchResult = {
      val __obj = js.Dictionary[js.Any](
        "Failed"     -> Failed.asInstanceOf[js.Any],
        "Successful" -> Successful.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ChangeMessageVisibilityBatchResult]
    }
  }

  /**
    * Encloses the <code>Id</code> of an entry in <code> <a>ChangeMessageVisibilityBatch</a>.</code>
    */
  @js.native
  trait ChangeMessageVisibilityBatchResultEntry extends js.Object {
    var Id: String
  }

  object ChangeMessageVisibilityBatchResultEntry {
    def apply(
        Id: String
    ): ChangeMessageVisibilityBatchResultEntry = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ChangeMessageVisibilityBatchResultEntry]
    }
  }

  @js.native
  trait ChangeMessageVisibilityRequest extends js.Object {
    var QueueUrl: String
    var ReceiptHandle: String
    var VisibilityTimeout: Int
  }

  object ChangeMessageVisibilityRequest {
    def apply(
        QueueUrl: String,
        ReceiptHandle: String,
        VisibilityTimeout: Int
    ): ChangeMessageVisibilityRequest = {
      val __obj = js.Dictionary[js.Any](
        "QueueUrl"          -> QueueUrl.asInstanceOf[js.Any],
        "ReceiptHandle"     -> ReceiptHandle.asInstanceOf[js.Any],
        "VisibilityTimeout" -> VisibilityTimeout.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ChangeMessageVisibilityRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateQueueRequest extends js.Object {
    var QueueName: String
    var Attributes: js.UndefOr[QueueAttributeMap]
    var tags: js.UndefOr[TagMap]
  }

  object CreateQueueRequest {
    def apply(
        QueueName: String,
        Attributes: js.UndefOr[QueueAttributeMap] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateQueueRequest = {
      val __obj = js.Dictionary[js.Any](
        "QueueName" -> QueueName.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateQueueRequest]
    }
  }

  /**
    * Returns the <code>QueueUrl</code> attribute of the created queue.
    */
  @js.native
  trait CreateQueueResult extends js.Object {
    var QueueUrl: js.UndefOr[String]
  }

  object CreateQueueResult {
    def apply(
        QueueUrl: js.UndefOr[String] = js.undefined
    ): CreateQueueResult = {
      val __obj = js.Dictionary.empty[js.Any]
      QueueUrl.foreach(__v => __obj.update("QueueUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateQueueResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteMessageBatchRequest extends js.Object {
    var Entries: DeleteMessageBatchRequestEntryList
    var QueueUrl: String
  }

  object DeleteMessageBatchRequest {
    def apply(
        Entries: DeleteMessageBatchRequestEntryList,
        QueueUrl: String
    ): DeleteMessageBatchRequest = {
      val __obj = js.Dictionary[js.Any](
        "Entries"  -> Entries.asInstanceOf[js.Any],
        "QueueUrl" -> QueueUrl.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteMessageBatchRequest]
    }
  }

  /**
    * Encloses a receipt handle and an identifier for it.
    */
  @js.native
  trait DeleteMessageBatchRequestEntry extends js.Object {
    var Id: String
    var ReceiptHandle: String
  }

  object DeleteMessageBatchRequestEntry {
    def apply(
        Id: String,
        ReceiptHandle: String
    ): DeleteMessageBatchRequestEntry = {
      val __obj = js.Dictionary[js.Any](
        "Id"            -> Id.asInstanceOf[js.Any],
        "ReceiptHandle" -> ReceiptHandle.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteMessageBatchRequestEntry]
    }
  }

  /**
    * For each message in the batch, the response contains a <code> <a>DeleteMessageBatchResultEntry</a> </code> tag if the message is deleted or a <code> <a>BatchResultErrorEntry</a> </code> tag if the message can't be deleted.
    */
  @js.native
  trait DeleteMessageBatchResult extends js.Object {
    var Failed: BatchResultErrorEntryList
    var Successful: DeleteMessageBatchResultEntryList
  }

  object DeleteMessageBatchResult {
    def apply(
        Failed: BatchResultErrorEntryList,
        Successful: DeleteMessageBatchResultEntryList
    ): DeleteMessageBatchResult = {
      val __obj = js.Dictionary[js.Any](
        "Failed"     -> Failed.asInstanceOf[js.Any],
        "Successful" -> Successful.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteMessageBatchResult]
    }
  }

  /**
    * Encloses the <code>Id</code> of an entry in <code> <a>DeleteMessageBatch</a>.</code>
    */
  @js.native
  trait DeleteMessageBatchResultEntry extends js.Object {
    var Id: String
  }

  object DeleteMessageBatchResultEntry {
    def apply(
        Id: String
    ): DeleteMessageBatchResultEntry = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteMessageBatchResultEntry]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteMessageRequest extends js.Object {
    var QueueUrl: String
    var ReceiptHandle: String
  }

  object DeleteMessageRequest {
    def apply(
        QueueUrl: String,
        ReceiptHandle: String
    ): DeleteMessageRequest = {
      val __obj = js.Dictionary[js.Any](
        "QueueUrl"      -> QueueUrl.asInstanceOf[js.Any],
        "ReceiptHandle" -> ReceiptHandle.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteMessageRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteQueueRequest extends js.Object {
    var QueueUrl: String
  }

  object DeleteQueueRequest {
    def apply(
        QueueUrl: String
    ): DeleteQueueRequest = {
      val __obj = js.Dictionary[js.Any](
        "QueueUrl" -> QueueUrl.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteQueueRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait GetQueueAttributesRequest extends js.Object {
    var QueueUrl: String
    var AttributeNames: js.UndefOr[AttributeNameList]
  }

  object GetQueueAttributesRequest {
    def apply(
        QueueUrl: String,
        AttributeNames: js.UndefOr[AttributeNameList] = js.undefined
    ): GetQueueAttributesRequest = {
      val __obj = js.Dictionary[js.Any](
        "QueueUrl" -> QueueUrl.asInstanceOf[js.Any]
      )

      AttributeNames.foreach(__v => __obj.update("AttributeNames", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQueueAttributesRequest]
    }
  }

  /**
    * A list of returned queue attributes.
    */
  @js.native
  trait GetQueueAttributesResult extends js.Object {
    var Attributes: js.UndefOr[QueueAttributeMap]
  }

  object GetQueueAttributesResult {
    def apply(
        Attributes: js.UndefOr[QueueAttributeMap] = js.undefined
    ): GetQueueAttributesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQueueAttributesResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait GetQueueUrlRequest extends js.Object {
    var QueueName: String
    var QueueOwnerAWSAccountId: js.UndefOr[String]
  }

  object GetQueueUrlRequest {
    def apply(
        QueueName: String,
        QueueOwnerAWSAccountId: js.UndefOr[String] = js.undefined
    ): GetQueueUrlRequest = {
      val __obj = js.Dictionary[js.Any](
        "QueueName" -> QueueName.asInstanceOf[js.Any]
      )

      QueueOwnerAWSAccountId.foreach(__v => __obj.update("QueueOwnerAWSAccountId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQueueUrlRequest]
    }
  }

  /**
    * For more information, see [[https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-api-responses.html|Interpreting Responses]] in the <i>Amazon Simple Queue Service Developer Guide</i>.
    */
  @js.native
  trait GetQueueUrlResult extends js.Object {
    var QueueUrl: js.UndefOr[String]
  }

  object GetQueueUrlResult {
    def apply(
        QueueUrl: js.UndefOr[String] = js.undefined
    ): GetQueueUrlResult = {
      val __obj = js.Dictionary.empty[js.Any]
      QueueUrl.foreach(__v => __obj.update("QueueUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQueueUrlResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ListDeadLetterSourceQueuesRequest extends js.Object {
    var QueueUrl: String
  }

  object ListDeadLetterSourceQueuesRequest {
    def apply(
        QueueUrl: String
    ): ListDeadLetterSourceQueuesRequest = {
      val __obj = js.Dictionary[js.Any](
        "QueueUrl" -> QueueUrl.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListDeadLetterSourceQueuesRequest]
    }
  }

  /**
    * A list of your dead letter source queues.
    */
  @js.native
  trait ListDeadLetterSourceQueuesResult extends js.Object {
    var queueUrls: QueueUrlList
  }

  object ListDeadLetterSourceQueuesResult {
    def apply(
        queueUrls: QueueUrlList
    ): ListDeadLetterSourceQueuesResult = {
      val __obj = js.Dictionary[js.Any](
        "queueUrls" -> queueUrls.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListDeadLetterSourceQueuesResult]
    }
  }

  @js.native
  trait ListQueueTagsRequest extends js.Object {
    var QueueUrl: String
  }

  object ListQueueTagsRequest {
    def apply(
        QueueUrl: String
    ): ListQueueTagsRequest = {
      val __obj = js.Dictionary[js.Any](
        "QueueUrl" -> QueueUrl.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListQueueTagsRequest]
    }
  }

  @js.native
  trait ListQueueTagsResult extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListQueueTagsResult {
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListQueueTagsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueueTagsResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ListQueuesRequest extends js.Object {
    var QueueNamePrefix: js.UndefOr[String]
  }

  object ListQueuesRequest {
    def apply(
        QueueNamePrefix: js.UndefOr[String] = js.undefined
    ): ListQueuesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      QueueNamePrefix.foreach(__v => __obj.update("QueueNamePrefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueuesRequest]
    }
  }

  /**
    * A list of your queues.
    */
  @js.native
  trait ListQueuesResult extends js.Object {
    var QueueUrls: js.UndefOr[QueueUrlList]
  }

  object ListQueuesResult {
    def apply(
        QueueUrls: js.UndefOr[QueueUrlList] = js.undefined
    ): ListQueuesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      QueueUrls.foreach(__v => __obj.update("QueueUrls", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueuesResult]
    }
  }

  /**
    * An Amazon SQS message.
    */
  @js.native
  trait Message extends js.Object {
    var Attributes: js.UndefOr[MessageSystemAttributeMap]
    var Body: js.UndefOr[String]
    var MD5OfBody: js.UndefOr[String]
    var MD5OfMessageAttributes: js.UndefOr[String]
    var MessageAttributes: js.UndefOr[MessageBodyAttributeMap]
    var MessageId: js.UndefOr[String]
    var ReceiptHandle: js.UndefOr[String]
  }

  object Message {
    def apply(
        Attributes: js.UndefOr[MessageSystemAttributeMap] = js.undefined,
        Body: js.UndefOr[String] = js.undefined,
        MD5OfBody: js.UndefOr[String] = js.undefined,
        MD5OfMessageAttributes: js.UndefOr[String] = js.undefined,
        MessageAttributes: js.UndefOr[MessageBodyAttributeMap] = js.undefined,
        MessageId: js.UndefOr[String] = js.undefined,
        ReceiptHandle: js.UndefOr[String] = js.undefined
    ): Message = {
      val __obj = js.Dictionary.empty[js.Any]
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.update("Body", __v.asInstanceOf[js.Any]))
      MD5OfBody.foreach(__v => __obj.update("MD5OfBody", __v.asInstanceOf[js.Any]))
      MD5OfMessageAttributes.foreach(__v => __obj.update("MD5OfMessageAttributes", __v.asInstanceOf[js.Any]))
      MessageAttributes.foreach(__v => __obj.update("MessageAttributes", __v.asInstanceOf[js.Any]))
      MessageId.foreach(__v => __obj.update("MessageId", __v.asInstanceOf[js.Any]))
      ReceiptHandle.foreach(__v => __obj.update("ReceiptHandle", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Message]
    }
  }

  /**
    * The user-specified message attribute value. For string data types, the <code>Value</code> attribute has the same restrictions on the content as the message body. For more information, see <code> <a>SendMessage</a>.</code>
    *  <code>Name</code>, <code>type</code>, <code>value</code> and the message body must not be empty or null. All parts of the message attribute, including <code>Name</code>, <code>Type</code>, and <code>Value</code>, are part of the message size restriction (256 KB or 262,144 bytes).
    */
  @js.native
  trait MessageAttributeValue extends js.Object {
    var DataType: String
    var BinaryListValues: js.UndefOr[BinaryList]
    var BinaryValue: js.UndefOr[Binary]
    var StringListValues: js.UndefOr[StringList]
    var StringValue: js.UndefOr[String]
  }

  object MessageAttributeValue {
    def apply(
        DataType: String,
        BinaryListValues: js.UndefOr[BinaryList] = js.undefined,
        BinaryValue: js.UndefOr[Binary] = js.undefined,
        StringListValues: js.UndefOr[StringList] = js.undefined,
        StringValue: js.UndefOr[String] = js.undefined
    ): MessageAttributeValue = {
      val __obj = js.Dictionary[js.Any](
        "DataType" -> DataType.asInstanceOf[js.Any]
      )

      BinaryListValues.foreach(__v => __obj.update("BinaryListValues", __v.asInstanceOf[js.Any]))
      BinaryValue.foreach(__v => __obj.update("BinaryValue", __v.asInstanceOf[js.Any]))
      StringListValues.foreach(__v => __obj.update("StringListValues", __v.asInstanceOf[js.Any]))
      StringValue.foreach(__v => __obj.update("StringValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessageAttributeValue]
    }
  }

  object MessageSystemAttributeNameEnum {
    val SenderId                         = "SenderId"
    val SentTimestamp                    = "SentTimestamp"
    val ApproximateReceiveCount          = "ApproximateReceiveCount"
    val ApproximateFirstReceiveTimestamp = "ApproximateFirstReceiveTimestamp"
    val SequenceNumber                   = "SequenceNumber"
    val MessageDeduplicationId           = "MessageDeduplicationId"
    val MessageGroupId                   = "MessageGroupId"

    val values = js.Object.freeze(
      js.Array(
        SenderId,
        SentTimestamp,
        ApproximateReceiveCount,
        ApproximateFirstReceiveTimestamp,
        SequenceNumber,
        MessageDeduplicationId,
        MessageGroupId
      )
    )
  }

  /**
    * <p/>
    */
  @js.native
  trait PurgeQueueRequest extends js.Object {
    var QueueUrl: String
  }

  object PurgeQueueRequest {
    def apply(
        QueueUrl: String
    ): PurgeQueueRequest = {
      val __obj = js.Dictionary[js.Any](
        "QueueUrl" -> QueueUrl.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PurgeQueueRequest]
    }
  }

  object QueueAttributeNameEnum {
    val All                                   = "All"
    val Policy                                = "Policy"
    val VisibilityTimeout                     = "VisibilityTimeout"
    val MaximumMessageSize                    = "MaximumMessageSize"
    val MessageRetentionPeriod                = "MessageRetentionPeriod"
    val ApproximateNumberOfMessages           = "ApproximateNumberOfMessages"
    val ApproximateNumberOfMessagesNotVisible = "ApproximateNumberOfMessagesNotVisible"
    val CreatedTimestamp                      = "CreatedTimestamp"
    val LastModifiedTimestamp                 = "LastModifiedTimestamp"
    val QueueArn                              = "QueueArn"
    val ApproximateNumberOfMessagesDelayed    = "ApproximateNumberOfMessagesDelayed"
    val DelaySeconds                          = "DelaySeconds"
    val ReceiveMessageWaitTimeSeconds         = "ReceiveMessageWaitTimeSeconds"
    val RedrivePolicy                         = "RedrivePolicy"
    val FifoQueue                             = "FifoQueue"
    val ContentBasedDeduplication             = "ContentBasedDeduplication"
    val KmsMasterKeyId                        = "KmsMasterKeyId"
    val KmsDataKeyReusePeriodSeconds          = "KmsDataKeyReusePeriodSeconds"

    val values = js.Object.freeze(
      js.Array(
        All,
        Policy,
        VisibilityTimeout,
        MaximumMessageSize,
        MessageRetentionPeriod,
        ApproximateNumberOfMessages,
        ApproximateNumberOfMessagesNotVisible,
        CreatedTimestamp,
        LastModifiedTimestamp,
        QueueArn,
        ApproximateNumberOfMessagesDelayed,
        DelaySeconds,
        ReceiveMessageWaitTimeSeconds,
        RedrivePolicy,
        FifoQueue,
        ContentBasedDeduplication,
        KmsMasterKeyId,
        KmsDataKeyReusePeriodSeconds
      )
    )
  }

  /**
    * <p/>
    */
  @js.native
  trait ReceiveMessageRequest extends js.Object {
    var QueueUrl: String
    var AttributeNames: js.UndefOr[AttributeNameList]
    var MaxNumberOfMessages: js.UndefOr[Int]
    var MessageAttributeNames: js.UndefOr[MessageAttributeNameList]
    var ReceiveRequestAttemptId: js.UndefOr[String]
    var VisibilityTimeout: js.UndefOr[Int]
    var WaitTimeSeconds: js.UndefOr[Int]
  }

  object ReceiveMessageRequest {
    def apply(
        QueueUrl: String,
        AttributeNames: js.UndefOr[AttributeNameList] = js.undefined,
        MaxNumberOfMessages: js.UndefOr[Int] = js.undefined,
        MessageAttributeNames: js.UndefOr[MessageAttributeNameList] = js.undefined,
        ReceiveRequestAttemptId: js.UndefOr[String] = js.undefined,
        VisibilityTimeout: js.UndefOr[Int] = js.undefined,
        WaitTimeSeconds: js.UndefOr[Int] = js.undefined
    ): ReceiveMessageRequest = {
      val __obj = js.Dictionary[js.Any](
        "QueueUrl" -> QueueUrl.asInstanceOf[js.Any]
      )

      AttributeNames.foreach(__v => __obj.update("AttributeNames", __v.asInstanceOf[js.Any]))
      MaxNumberOfMessages.foreach(__v => __obj.update("MaxNumberOfMessages", __v.asInstanceOf[js.Any]))
      MessageAttributeNames.foreach(__v => __obj.update("MessageAttributeNames", __v.asInstanceOf[js.Any]))
      ReceiveRequestAttemptId.foreach(__v => __obj.update("ReceiveRequestAttemptId", __v.asInstanceOf[js.Any]))
      VisibilityTimeout.foreach(__v => __obj.update("VisibilityTimeout", __v.asInstanceOf[js.Any]))
      WaitTimeSeconds.foreach(__v => __obj.update("WaitTimeSeconds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReceiveMessageRequest]
    }
  }

  /**
    * A list of received messages.
    */
  @js.native
  trait ReceiveMessageResult extends js.Object {
    var Messages: js.UndefOr[MessageList]
  }

  object ReceiveMessageResult {
    def apply(
        Messages: js.UndefOr[MessageList] = js.undefined
    ): ReceiveMessageResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Messages.foreach(__v => __obj.update("Messages", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReceiveMessageResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait RemovePermissionRequest extends js.Object {
    var Label: String
    var QueueUrl: String
  }

  object RemovePermissionRequest {
    def apply(
        Label: String,
        QueueUrl: String
    ): RemovePermissionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Label"    -> Label.asInstanceOf[js.Any],
        "QueueUrl" -> QueueUrl.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemovePermissionRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait SendMessageBatchRequest extends js.Object {
    var Entries: SendMessageBatchRequestEntryList
    var QueueUrl: String
  }

  object SendMessageBatchRequest {
    def apply(
        Entries: SendMessageBatchRequestEntryList,
        QueueUrl: String
    ): SendMessageBatchRequest = {
      val __obj = js.Dictionary[js.Any](
        "Entries"  -> Entries.asInstanceOf[js.Any],
        "QueueUrl" -> QueueUrl.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SendMessageBatchRequest]
    }
  }

  /**
    * Contains the details of a single Amazon SQS message along with an <code>Id</code>.
    */
  @js.native
  trait SendMessageBatchRequestEntry extends js.Object {
    var Id: String
    var MessageBody: String
    var DelaySeconds: js.UndefOr[Int]
    var MessageAttributes: js.UndefOr[MessageBodyAttributeMap]
    var MessageDeduplicationId: js.UndefOr[String]
    var MessageGroupId: js.UndefOr[String]
  }

  object SendMessageBatchRequestEntry {
    def apply(
        Id: String,
        MessageBody: String,
        DelaySeconds: js.UndefOr[Int] = js.undefined,
        MessageAttributes: js.UndefOr[MessageBodyAttributeMap] = js.undefined,
        MessageDeduplicationId: js.UndefOr[String] = js.undefined,
        MessageGroupId: js.UndefOr[String] = js.undefined
    ): SendMessageBatchRequestEntry = {
      val __obj = js.Dictionary[js.Any](
        "Id"          -> Id.asInstanceOf[js.Any],
        "MessageBody" -> MessageBody.asInstanceOf[js.Any]
      )

      DelaySeconds.foreach(__v => __obj.update("DelaySeconds", __v.asInstanceOf[js.Any]))
      MessageAttributes.foreach(__v => __obj.update("MessageAttributes", __v.asInstanceOf[js.Any]))
      MessageDeduplicationId.foreach(__v => __obj.update("MessageDeduplicationId", __v.asInstanceOf[js.Any]))
      MessageGroupId.foreach(__v => __obj.update("MessageGroupId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendMessageBatchRequestEntry]
    }
  }

  /**
    * For each message in the batch, the response contains a <code> <a>SendMessageBatchResultEntry</a> </code> tag if the message succeeds or a <code> <a>BatchResultErrorEntry</a> </code> tag if the message fails.
    */
  @js.native
  trait SendMessageBatchResult extends js.Object {
    var Failed: BatchResultErrorEntryList
    var Successful: SendMessageBatchResultEntryList
  }

  object SendMessageBatchResult {
    def apply(
        Failed: BatchResultErrorEntryList,
        Successful: SendMessageBatchResultEntryList
    ): SendMessageBatchResult = {
      val __obj = js.Dictionary[js.Any](
        "Failed"     -> Failed.asInstanceOf[js.Any],
        "Successful" -> Successful.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SendMessageBatchResult]
    }
  }

  /**
    * Encloses a <code>MessageId</code> for a successfully-enqueued message in a <code> <a>SendMessageBatch</a>.</code>
    */
  @js.native
  trait SendMessageBatchResultEntry extends js.Object {
    var Id: String
    var MD5OfMessageBody: String
    var MessageId: String
    var MD5OfMessageAttributes: js.UndefOr[String]
    var SequenceNumber: js.UndefOr[String]
  }

  object SendMessageBatchResultEntry {
    def apply(
        Id: String,
        MD5OfMessageBody: String,
        MessageId: String,
        MD5OfMessageAttributes: js.UndefOr[String] = js.undefined,
        SequenceNumber: js.UndefOr[String] = js.undefined
    ): SendMessageBatchResultEntry = {
      val __obj = js.Dictionary[js.Any](
        "Id"               -> Id.asInstanceOf[js.Any],
        "MD5OfMessageBody" -> MD5OfMessageBody.asInstanceOf[js.Any],
        "MessageId"        -> MessageId.asInstanceOf[js.Any]
      )

      MD5OfMessageAttributes.foreach(__v => __obj.update("MD5OfMessageAttributes", __v.asInstanceOf[js.Any]))
      SequenceNumber.foreach(__v => __obj.update("SequenceNumber", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendMessageBatchResultEntry]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait SendMessageRequest extends js.Object {
    var MessageBody: String
    var QueueUrl: String
    var DelaySeconds: js.UndefOr[Int]
    var MessageAttributes: js.UndefOr[MessageBodyAttributeMap]
    var MessageDeduplicationId: js.UndefOr[String]
    var MessageGroupId: js.UndefOr[String]
  }

  object SendMessageRequest {
    def apply(
        MessageBody: String,
        QueueUrl: String,
        DelaySeconds: js.UndefOr[Int] = js.undefined,
        MessageAttributes: js.UndefOr[MessageBodyAttributeMap] = js.undefined,
        MessageDeduplicationId: js.UndefOr[String] = js.undefined,
        MessageGroupId: js.UndefOr[String] = js.undefined
    ): SendMessageRequest = {
      val __obj = js.Dictionary[js.Any](
        "MessageBody" -> MessageBody.asInstanceOf[js.Any],
        "QueueUrl"    -> QueueUrl.asInstanceOf[js.Any]
      )

      DelaySeconds.foreach(__v => __obj.update("DelaySeconds", __v.asInstanceOf[js.Any]))
      MessageAttributes.foreach(__v => __obj.update("MessageAttributes", __v.asInstanceOf[js.Any]))
      MessageDeduplicationId.foreach(__v => __obj.update("MessageDeduplicationId", __v.asInstanceOf[js.Any]))
      MessageGroupId.foreach(__v => __obj.update("MessageGroupId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendMessageRequest]
    }
  }

  /**
    * The <code>MD5OfMessageBody</code> and <code>MessageId</code> elements.
    */
  @js.native
  trait SendMessageResult extends js.Object {
    var MD5OfMessageAttributes: js.UndefOr[String]
    var MD5OfMessageBody: js.UndefOr[String]
    var MessageId: js.UndefOr[String]
    var SequenceNumber: js.UndefOr[String]
  }

  object SendMessageResult {
    def apply(
        MD5OfMessageAttributes: js.UndefOr[String] = js.undefined,
        MD5OfMessageBody: js.UndefOr[String] = js.undefined,
        MessageId: js.UndefOr[String] = js.undefined,
        SequenceNumber: js.UndefOr[String] = js.undefined
    ): SendMessageResult = {
      val __obj = js.Dictionary.empty[js.Any]
      MD5OfMessageAttributes.foreach(__v => __obj.update("MD5OfMessageAttributes", __v.asInstanceOf[js.Any]))
      MD5OfMessageBody.foreach(__v => __obj.update("MD5OfMessageBody", __v.asInstanceOf[js.Any]))
      MessageId.foreach(__v => __obj.update("MessageId", __v.asInstanceOf[js.Any]))
      SequenceNumber.foreach(__v => __obj.update("SequenceNumber", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendMessageResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait SetQueueAttributesRequest extends js.Object {
    var Attributes: QueueAttributeMap
    var QueueUrl: String
  }

  object SetQueueAttributesRequest {
    def apply(
        Attributes: QueueAttributeMap,
        QueueUrl: String
    ): SetQueueAttributesRequest = {
      val __obj = js.Dictionary[js.Any](
        "Attributes" -> Attributes.asInstanceOf[js.Any],
        "QueueUrl"   -> QueueUrl.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetQueueAttributesRequest]
    }
  }

  @js.native
  trait TagQueueRequest extends js.Object {
    var QueueUrl: String
    var Tags: TagMap
  }

  object TagQueueRequest {
    def apply(
        QueueUrl: String,
        Tags: TagMap
    ): TagQueueRequest = {
      val __obj = js.Dictionary[js.Any](
        "QueueUrl" -> QueueUrl.asInstanceOf[js.Any],
        "Tags"     -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagQueueRequest]
    }
  }

  @js.native
  trait UntagQueueRequest extends js.Object {
    var QueueUrl: String
    var TagKeys: TagKeyList
  }

  object UntagQueueRequest {
    def apply(
        QueueUrl: String,
        TagKeys: TagKeyList
    ): UntagQueueRequest = {
      val __obj = js.Dictionary[js.Any](
        "QueueUrl" -> QueueUrl.asInstanceOf[js.Any],
        "TagKeys"  -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagQueueRequest]
    }
  }
}
