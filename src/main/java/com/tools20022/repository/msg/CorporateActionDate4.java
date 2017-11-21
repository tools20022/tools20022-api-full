/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateFormat4Choice;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies corporate action dates.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmCouponClippingDate
 * CorporateActionDate4.mmCouponClippingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmConsentExpirationDate
 * CorporateActionDate4.mmConsentExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmConsentRecordDate
 * CorporateActionDate4.mmConsentRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmPaymentDate
 * CorporateActionDate4.mmPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmEarliestPaymentDate
 * CorporateActionDate4.mmEarliestPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmMarketDeadline
 * CorporateActionDate4.mmMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmResponseDeadline
 * CorporateActionDate4.mmResponseDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmDeadlineToSplit
 * CorporateActionDate4.mmDeadlineToSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmExpiryDate
 * CorporateActionDate4.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmQuotationSettingDate
 * CorporateActionDate4.mmQuotationSettingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmSubscriptionCostDebitDate
 * CorporateActionDate4.mmSubscriptionCostDebitDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionDate4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies corporate action dates."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionDate4", propOrder = {"couponClippingDate", "consentExpirationDate", "consentRecordDate", "paymentDate", "earliestPaymentDate", "marketDeadline", "responseDeadline", "deadlineToSplit", "expiryDate",
		"quotationSettingDate", "subscriptionCostDebitDate"})
public class CorporateActionDate4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DateFormat4Choice couponClippingDate;
	/**
	 * Date/time at which the coupons are to be/were submitted for payment of
	 * interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached#mmCouponClippingDate
	 * CouponAttached.mmCouponClippingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4
	 * CorporateActionDate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpnClpngDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponClippingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the coupons are to be/were submitted for payment of interest."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCouponClippingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CouponAttached.mmCouponClippingDate;
			componentContext_lazy = () -> CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "CpnClpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponClippingDate";
			definition = "Date/time at which the coupons are to be/were submitted for payment of interest.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};
	protected DateFormat4Choice consentExpirationDate;
	/**
	 * Last date/time at which a holder can consent to the changes sought by the
	 * corporation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmConsentExpirationDate
	 * CorporateActionDeadline.mmConsentExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4
	 * CorporateActionDate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnsntXprtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date/time at which a holder can consent to the changes sought by the corporation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConsentExpirationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmConsentExpirationDate;
			componentContext_lazy = () -> CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "CnsntXprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsentExpirationDate";
			definition = "Last date/time at which a holder can consent to the changes sought by the corporation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};
	protected DateFormat4Choice consentRecordDate;
	/**
	 * Date/time used by the offeror to determine the beneficiary eligible to
	 * participate in a consent based on the registered owner of the securities,
	 * eg, beneficial owner of consent record. The consent record date qualifier
	 * is used to indicate that a record date only applies to a certain part of
	 * the offer, not the entire offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmConsentRecordDate
	 * CorporateActionDeadline.mmConsentRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4
	 * CorporateActionDate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnsntRcrdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentRecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time used by the offeror to determine the beneficiary eligible to participate in a consent based on the registered owner of the securities, eg, beneficial owner of consent record. The consent record date qualifier is used to indicate that a record date only applies to a certain part of the offer, not the entire offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConsentRecordDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmConsentRecordDate;
			componentContext_lazy = () -> CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "CnsntRcrdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsentRecordDate";
			definition = "Date/time used by the offeror to determine the beneficiary eligible to participate in a consent based on the registered owner of the securities, eg, beneficial owner of consent record. The consent record date qualifier is used to indicate that a record date only applies to a certain part of the offer, not the entire offer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};
	protected DateFormat4Choice paymentDate;
	/**
	 * Date/time at which the distribution is due to take place (cash and/or
	 * securities).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmMovementDate
	 * CorporateActionDistribution.mmMovementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4
	 * CorporateActionDate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the distribution is due to take place (cash and/or securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmMovementDate;
			componentContext_lazy = () -> CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "PmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDate";
			definition = "Date/time at which the distribution is due to take place (cash and/or securities).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};
	protected DateFormat4Choice earliestPaymentDate;
	/**
	 * Date/time at which a payment can be made, eg, if payment date is a
	 * non-business day or to indicate the first payment date of an offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmEarliestPaymentDate
	 * ProceedsDefinition.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4
	 * CorporateActionDate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlstPmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which a payment can be made, eg, if payment date is a non-business day or to indicate the first payment date of an offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEarliestPaymentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmEarliestPaymentDate;
			componentContext_lazy = () -> CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "EarlstPmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPaymentDate";
			definition = "Date/time at which a payment can be made, eg, if payment date is a non-business day or to indicate the first payment date of an offer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};
	protected DateFormat4Choice marketDeadline;
	/**
	 * Issuer or issuer's agent deadline to respond, with an instruction, to an
	 * outstanding offer or privilege.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4
	 * CorporateActionDate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuer or issuer's agent deadline to respond, with an instruction, to an outstanding offer or privilege."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMarketDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "MktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadline";
			definition = "Issuer or issuer's agent deadline to respond, with an instruction, to an outstanding offer or privilege.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};
	protected DateFormat4Choice responseDeadline;
	/**
	 * Date/time at which the account servicer has set as the deadline to
	 * respond, with instructions, to an outstanding event. This time is
	 * dependent on the reference time zone of the account servicer as specified
	 * in an SLA.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmResponseDeadline
	 * CorporateActionDeadline.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4
	 * CorporateActionDate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the account servicer has set as the deadline to respond, with instructions, to an outstanding event. This time is dependent on the reference time zone of the account servicer as specified in an SLA."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResponseDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmResponseDeadline;
			componentContext_lazy = () -> CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "RspnDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseDeadline";
			definition = "Date/time at which the account servicer has set as the deadline to respond, with instructions, to an outstanding event. This time is dependent on the reference time zone of the account servicer as specified in an SLA.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};
	protected DateFormat4Choice deadlineToSplit;
	/**
	 * Deadline by which instructions must be received to split securities, eg,
	 * of physical certificates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmDeadlineToSplit
	 * CorporateActionDeadline.mmDeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4
	 * CorporateActionDate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DdlnToSplt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeadlineToSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which instructions must be received to split securities, eg, of physical certificates."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeadlineToSplit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmDeadlineToSplit;
			componentContext_lazy = () -> CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "DdlnToSplt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeadlineToSplit";
			definition = "Deadline by which instructions must be received to split securities, eg, of physical certificates.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};
	protected DateFormat4Choice expiryDate;
	/**
	 * Date/time at which an order expires or on which a privilege or offer
	 * terminates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmExpiryDate
	 * CorporateActionDeadline.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4
	 * CorporateActionDate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an order expires or on which a privilege or offer terminates."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpiryDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmExpiryDate;
			componentContext_lazy = () -> CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date/time at which an order expires or on which a privilege or offer terminates.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};
	protected DateFormat4Choice quotationSettingDate;
	/**
	 * Date/time at which the price of a security is determined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmQuotationDate
	 * SecuritiesPricing.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4
	 * CorporateActionDate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtnSetngDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotationSettingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the price of a security is determined."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuotationSettingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmQuotationDate;
			componentContext_lazy = () -> CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "QtnSetngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotationSettingDate";
			definition = "Date/time at which the price of a security is determined.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};
	protected DateFormat4Choice subscriptionCostDebitDate;
	/**
	 * Date/time by which cash must be in place in order to take part in the
	 * event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmSubscriptionCostDebitDate
	 * BiddingConditions.mmSubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4
	 * CorporateActionDate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptCostDbtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionCostDebitDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time by which cash must be in place in order to take part in the event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubscriptionCostDebitDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmSubscriptionCostDebitDate;
			componentContext_lazy = () -> CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "SbcptCostDbtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionCostDebitDate";
			definition = "Date/time by which cash must be in place in order to take part in the event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionDate4.mmCouponClippingDate, CorporateActionDate4.mmConsentExpirationDate, CorporateActionDate4.mmConsentRecordDate, CorporateActionDate4.mmPaymentDate,
						CorporateActionDate4.mmEarliestPaymentDate, CorporateActionDate4.mmMarketDeadline, CorporateActionDate4.mmResponseDeadline, CorporateActionDate4.mmDeadlineToSplit, CorporateActionDate4.mmExpiryDate,
						CorporateActionDate4.mmQuotationSettingDate, CorporateActionDate4.mmSubscriptionCostDebitDate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDate4";
				definition = "Specifies corporate action dates.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CpnClpngDt")
	public DateFormat4Choice getCouponClippingDate() {
		return couponClippingDate;
	}

	public void setCouponClippingDate(DateFormat4Choice couponClippingDate) {
		this.couponClippingDate = couponClippingDate;
	}

	@XmlElement(name = "CnsntXprtnDt")
	public DateFormat4Choice getConsentExpirationDate() {
		return consentExpirationDate;
	}

	public void setConsentExpirationDate(DateFormat4Choice consentExpirationDate) {
		this.consentExpirationDate = consentExpirationDate;
	}

	@XmlElement(name = "CnsntRcrdDt")
	public DateFormat4Choice getConsentRecordDate() {
		return consentRecordDate;
	}

	public void setConsentRecordDate(DateFormat4Choice consentRecordDate) {
		this.consentRecordDate = consentRecordDate;
	}

	@XmlElement(name = "PmtDt")
	public DateFormat4Choice getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(DateFormat4Choice paymentDate) {
		this.paymentDate = paymentDate;
	}

	@XmlElement(name = "EarlstPmtDt")
	public DateFormat4Choice getEarliestPaymentDate() {
		return earliestPaymentDate;
	}

	public void setEarliestPaymentDate(DateFormat4Choice earliestPaymentDate) {
		this.earliestPaymentDate = earliestPaymentDate;
	}

	@XmlElement(name = "MktDdln")
	public DateFormat4Choice getMarketDeadline() {
		return marketDeadline;
	}

	public void setMarketDeadline(DateFormat4Choice marketDeadline) {
		this.marketDeadline = marketDeadline;
	}

	@XmlElement(name = "RspnDdln")
	public DateFormat4Choice getResponseDeadline() {
		return responseDeadline;
	}

	public void setResponseDeadline(DateFormat4Choice responseDeadline) {
		this.responseDeadline = responseDeadline;
	}

	@XmlElement(name = "DdlnToSplt")
	public DateFormat4Choice getDeadlineToSplit() {
		return deadlineToSplit;
	}

	public void setDeadlineToSplit(DateFormat4Choice deadlineToSplit) {
		this.deadlineToSplit = deadlineToSplit;
	}

	@XmlElement(name = "XpryDt")
	public DateFormat4Choice getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(DateFormat4Choice expiryDate) {
		this.expiryDate = expiryDate;
	}

	@XmlElement(name = "QtnSetngDt")
	public DateFormat4Choice getQuotationSettingDate() {
		return quotationSettingDate;
	}

	public void setQuotationSettingDate(DateFormat4Choice quotationSettingDate) {
		this.quotationSettingDate = quotationSettingDate;
	}

	@XmlElement(name = "SbcptCostDbtDt")
	public DateFormat4Choice getSubscriptionCostDebitDate() {
		return subscriptionCostDebitDate;
	}

	public void setSubscriptionCostDebitDate(DateFormat4Choice subscriptionCostDebitDate) {
		this.subscriptionCostDebitDate = subscriptionCostDebitDate;
	}
}