package facade.amazonaws.services.cloudfront.signer

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk", "CloudFront.Signer")
class CloudFrontSigner protected () extends js.Object {
  def this(keyPairId: String, privateKey: String) = this()

  def getSignedCookie(options: SignerOptionsWithPolicy): CustomPolicy = js.native

  def getSignedCookie(options: SignerOptionsWithoutPolicy): CannedPolicy = js.native

  def getSignedUrl(options: SignerOptionsWithPolicy): String = js.native

  def getSignedUrl(options: SignerOptionsWithoutPolicy): String = js.native
}

@js.native
trait SignerOptionsWithPolicy extends js.Object {
  var policy: String = js.native
}

object SignerOptionsWithPolicy {
  def apply(
      policy: String
  ): SignerOptionsWithPolicy = {
    val _fields = IndexedSeq[(String, js.Any)](
      "policy" -> policy.asInstanceOf[js.Any]
    ).filter(_._2 != (js.undefined: js.Any))

    js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignerOptionsWithPolicy]
  }

  def apply(
      policy: PolicyStatements
  ): SignerOptionsWithPolicy = {
    apply(js.JSON.stringify(policy))
  }

  def createPolicy(policyStatements: js.Array[PolicyStatement]): SignerOptionsWithPolicy = {
    val tPolicy = new PolicyStatements(policyStatements)
    SignerOptionsWithPolicy(tPolicy)
  }
}

trait PolicyStatements extends js.Object {
  var Statement: js.Array[PolicyStatement]
}

object PolicyStatements {
  def apply(
             Statement: js.Array[PolicyStatement],
           ): PolicyStatements = {
    val _obj$ = js.Dynamic.literal(
      "Statement" -> Statement.asInstanceOf[js.Any],
    )
    _obj$.asInstanceOf[PolicyStatements]
  }
}

trait PolicyStatement extends js.Object {
  var Resource: String
  var Condition: PolicyStatementCondition
}

object PolicyStatement {
  def apply(
             Resource: String,
             Condition: PolicyStatementCondition,
           ): PolicyStatement = {
    val _obj$ = js.Dynamic.literal(
      "Resource" -> Resource.asInstanceOf[js.Any],
      "Condition" -> Condition.asInstanceOf[js.Any],
    )
    _obj$.asInstanceOf[PolicyStatement]
  }
}

trait PolicyStatementCondition extends js.Object {
  var DateLessThan: js.UndefOr[DateLessThan]
  var DateGreaterThan: js.UndefOr[DateGreaterThan]
  var IpAddress: js.UndefOr[IpAddress]
}

object PolicyStatementCondition {
  def apply(
             DateLessThan: js.UndefOr[DateLessThan] = js.undefined,
             DateGreaterThan: js.UndefOr[DateGreaterThan] = js.undefined,
             IpAddress: js.UndefOr[IpAddress] = js.undefined,
           ): PolicyStatementCondition = {
    val _obj$ = js.Dynamic.literal(
    )
    DateLessThan.foreach(_v => _obj$.updateDynamic("DateLessThan")(_v.asInstanceOf[js.Any]))
    DateGreaterThan.foreach(_v => _obj$.updateDynamic("DateGreaterThan")(_v.asInstanceOf[js.Any]))
    IpAddress.foreach(_v => _obj$.updateDynamic("IpAddress")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[PolicyStatementCondition]
  }
}

trait DateLessThan extends js.Object {
  var `AWS:EpochTime`: Int
}

object DateLessThan {

  def apply(
             `AWS:EpochTime`: Int,
           ): DateLessThan = {
    val _obj$ = js.Dynamic.literal(
      "AWS:EpochTime" -> `AWS:EpochTime`.asInstanceOf[js.Any],
    )
    _obj$.asInstanceOf[DateLessThan]
  }
}

trait DateGreaterThan extends js.Object {
  var `AWS:EpochTime`: Int
}

object DateGreaterThan {

  def apply(
             `AWS:EpochTime`: Int,
           ): DateGreaterThan = {
    val _obj$ = js.Dynamic.literal(
      "AWS:EpochTime" -> `AWS:EpochTime`.asInstanceOf[js.Any],
    )
    _obj$.asInstanceOf[DateGreaterThan]
  }
}

trait IpAddress extends js.Object {
  var `AWS:SourceIp`: String
}

object IpAddress {

  def apply(
             `AWS:SourceIp`: String,
           ): IpAddress = {
    val _obj$ = js.Dynamic.literal(
      "AWS:SourceIp" -> `AWS:SourceIp`.asInstanceOf[js.Any],
    )
    _obj$.asInstanceOf[IpAddress]
  }
}

@js.native
trait SignerOptionsWithoutPolicy extends js.Object {
  var url: String = js.native
  var expires: Int = js.native
}

object SignerOptionsWithoutPolicy {
  def apply(
      url: String,
      expires: Int
  ): SignerOptionsWithoutPolicy = {
    val _fields = IndexedSeq[(String, js.Any)](
      "url" -> url.asInstanceOf[js.Any],
      "expires" -> expires.asInstanceOf[js.Any]
    ).filter(_._2 != (js.undefined: js.Any))

    js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignerOptionsWithoutPolicy]
  }
}

@js.native
trait CustomPolicy extends js.Object {
  var `CloudFront-Policy`: String = js.native
  var `CloudFront-Key-Pair-Id`: String = js.native
  var `CloudFront-Signature`: String = js.native
}

object CustomPolicy {
  def apply(
      policy: String,
      keyPairId: String,
      signature: String
  ): CustomPolicy = {
    val _fields = IndexedSeq[(String, js.Any)](
      "CloudFront-Policy" -> policy.asInstanceOf[js.Any],
      "CloudFront-Key-Pair-Id" -> keyPairId.asInstanceOf[js.Any],
      "CloudFront-Signature" -> signature.asInstanceOf[js.Any]
    ).filter(_._2 != (js.undefined: js.Any))

    js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomPolicy]
  }
}

@js.native
trait CannedPolicy extends js.Object {
  var `CloudFront-Expires`: Int = js.native
  var `CloudFront-Key-Pair-Id`: String = js.native
  var `CloudFront-Signature`: String = js.native
}

object CannedPolicy {
  def apply(
      expires: Int,
      keyPairId: String,
      signature: String
  ): CannedPolicy = {
    val _fields = IndexedSeq[(String, js.Any)](
      "CloudFront-Expires" -> expires.asInstanceOf[js.Any],
      "CloudFront-Key-Pair-Id" -> keyPairId.asInstanceOf[js.Any],
      "CloudFront-Signature" -> signature.asInstanceOf[js.Any]
    ).filter(_._2 != (js.undefined: js.Any))

    js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CannedPolicy]
  }
}
