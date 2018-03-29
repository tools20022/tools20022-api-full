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
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionDate4", propOrder = {"couponClippingDate", "consentExpirationDate", "consentRecordDate", "paymentDate", "earliestPaymentDate", "marketDeadline", "responseDeadline", "deadlineToSplit", "expiryDate",
		"quotationSettingDate", "subscriptionCostDebitDate"})
public class CorporateActionDate4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CpnClpngDt")
	protected DateFormat4Choice couponClippingDate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>> mmCouponClippingDate = new MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CouponAttached.mmCouponClippingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "CpnClpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponClippingDate";
			definition = "Date/time at which the coupons are to be/were submitted for payment of interest.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate4 obj) {
			return obj.getCouponClippingDate();
		}

		@Override
		public void setValue(CorporateActionDate4 obj, Optional<DateFormat4Choice> value) {
			obj.setCouponClippingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CnsntXprtnDt")
	protected DateFormat4Choice consentExpirationDate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>> mmConsentExpirationDate = new MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmConsentExpirationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "CnsntXprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsentExpirationDate";
			definition = "Last date/time at which a holder can consent to the changes sought by the corporation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate4 obj) {
			return obj.getConsentExpirationDate();
		}

		@Override
		public void setValue(CorporateActionDate4 obj, Optional<DateFormat4Choice> value) {
			obj.setConsentExpirationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CnsntRcrdDt")
	protected DateFormat4Choice consentRecordDate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>> mmConsentRecordDate = new MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmConsentRecordDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "CnsntRcrdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsentRecordDate";
			definition = "Date/time used by the offeror to determine the beneficiary eligible to participate in a consent based on the registered owner of the securities, eg, beneficial owner of consent record. The consent record date qualifier is used to indicate that a record date only applies to a certain part of the offer, not the entire offer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate4 obj) {
			return obj.getConsentRecordDate();
		}

		@Override
		public void setValue(CorporateActionDate4 obj, Optional<DateFormat4Choice> value) {
			obj.setConsentRecordDate(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtDt")
	protected DateFormat4Choice paymentDate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>> mmPaymentDate = new MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmMovementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "PmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDate";
			definition = "Date/time at which the distribution is due to take place (cash and/or securities).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate4 obj) {
			return obj.getPaymentDate();
		}

		@Override
		public void setValue(CorporateActionDate4 obj, Optional<DateFormat4Choice> value) {
			obj.setPaymentDate(value.orElse(null));
		}
	};
	@XmlElement(name = "EarlstPmtDt")
	protected DateFormat4Choice earliestPaymentDate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>> mmEarliestPaymentDate = new MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmEarliestPaymentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "EarlstPmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPaymentDate";
			definition = "Date/time at which a payment can be made, eg, if payment date is a non-business day or to indicate the first payment date of an offer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate4 obj) {
			return obj.getEarliestPaymentDate();
		}

		@Override
		public void setValue(CorporateActionDate4 obj, Optional<DateFormat4Choice> value) {
			obj.setEarliestPaymentDate(value.orElse(null));
		}
	};
	@XmlElement(name = "MktDdln")
	protected DateFormat4Choice marketDeadline;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>> mmMarketDeadline = new MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "MktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadline";
			definition = "Issuer or issuer's agent deadline to respond, with an instruction, to an outstanding offer or privilege.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate4 obj) {
			return obj.getMarketDeadline();
		}

		@Override
		public void setValue(CorporateActionDate4 obj, Optional<DateFormat4Choice> value) {
			obj.setMarketDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "RspnDdln")
	protected DateFormat4Choice responseDeadline;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>> mmResponseDeadline = new MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmResponseDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "RspnDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseDeadline";
			definition = "Date/time at which the account servicer has set as the deadline to respond, with instructions, to an outstanding event. This time is dependent on the reference time zone of the account servicer as specified in an SLA.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate4 obj) {
			return obj.getResponseDeadline();
		}

		@Override
		public void setValue(CorporateActionDate4 obj, Optional<DateFormat4Choice> value) {
			obj.setResponseDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "DdlnToSplt")
	protected DateFormat4Choice deadlineToSplit;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>> mmDeadlineToSplit = new MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmDeadlineToSplit;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "DdlnToSplt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeadlineToSplit";
			definition = "Deadline by which instructions must be received to split securities, eg, of physical certificates.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate4 obj) {
			return obj.getDeadlineToSplit();
		}

		@Override
		public void setValue(CorporateActionDate4 obj, Optional<DateFormat4Choice> value) {
			obj.setDeadlineToSplit(value.orElse(null));
		}
	};
	@XmlElement(name = "XpryDt")
	protected DateFormat4Choice expiryDate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>> mmExpiryDate = new MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmExpiryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date/time at which an order expires or on which a privilege or offer terminates.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate4 obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(CorporateActionDate4 obj, Optional<DateFormat4Choice> value) {
			obj.setExpiryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "QtnSetngDt")
	protected DateFormat4Choice quotationSettingDate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>> mmQuotationSettingDate = new MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmQuotationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "QtnSetngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotationSettingDate";
			definition = "Date/time at which the price of a security is determined.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate4 obj) {
			return obj.getQuotationSettingDate();
		}

		@Override
		public void setValue(CorporateActionDate4 obj, Optional<DateFormat4Choice> value) {
			obj.setQuotationSettingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SbcptCostDbtDt")
	protected DateFormat4Choice subscriptionCostDebitDate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>> mmSubscriptionCostDebitDate = new MMMessageAttribute<CorporateActionDate4, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmSubscriptionCostDebitDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate4.mmObject();
			isDerived = false;
			xmlTag = "SbcptCostDbtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionCostDebitDate";
			definition = "Date/time by which cash must be in place in order to take part in the event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate4 obj) {
			return obj.getSubscriptionCostDebitDate();
		}

		@Override
		public void setValue(CorporateActionDate4 obj, Optional<DateFormat4Choice> value) {
			obj.setSubscriptionCostDebitDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate4.mmCouponClippingDate, com.tools20022.repository.msg.CorporateActionDate4.mmConsentExpirationDate,
						com.tools20022.repository.msg.CorporateActionDate4.mmConsentRecordDate, com.tools20022.repository.msg.CorporateActionDate4.mmPaymentDate, com.tools20022.repository.msg.CorporateActionDate4.mmEarliestPaymentDate,
						com.tools20022.repository.msg.CorporateActionDate4.mmMarketDeadline, com.tools20022.repository.msg.CorporateActionDate4.mmResponseDeadline, com.tools20022.repository.msg.CorporateActionDate4.mmDeadlineToSplit,
						com.tools20022.repository.msg.CorporateActionDate4.mmExpiryDate, com.tools20022.repository.msg.CorporateActionDate4.mmQuotationSettingDate,
						com.tools20022.repository.msg.CorporateActionDate4.mmSubscriptionCostDebitDate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDate4";
				definition = "Specifies corporate action dates.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DateFormat4Choice> getCouponClippingDate() {
		return couponClippingDate == null ? Optional.empty() : Optional.of(couponClippingDate);
	}

	public CorporateActionDate4 setCouponClippingDate(DateFormat4Choice couponClippingDate) {
		this.couponClippingDate = couponClippingDate;
		return this;
	}

	public Optional<DateFormat4Choice> getConsentExpirationDate() {
		return consentExpirationDate == null ? Optional.empty() : Optional.of(consentExpirationDate);
	}

	public CorporateActionDate4 setConsentExpirationDate(DateFormat4Choice consentExpirationDate) {
		this.consentExpirationDate = consentExpirationDate;
		return this;
	}

	public Optional<DateFormat4Choice> getConsentRecordDate() {
		return consentRecordDate == null ? Optional.empty() : Optional.of(consentRecordDate);
	}

	public CorporateActionDate4 setConsentRecordDate(DateFormat4Choice consentRecordDate) {
		this.consentRecordDate = consentRecordDate;
		return this;
	}

	public Optional<DateFormat4Choice> getPaymentDate() {
		return paymentDate == null ? Optional.empty() : Optional.of(paymentDate);
	}

	public CorporateActionDate4 setPaymentDate(DateFormat4Choice paymentDate) {
		this.paymentDate = paymentDate;
		return this;
	}

	public Optional<DateFormat4Choice> getEarliestPaymentDate() {
		return earliestPaymentDate == null ? Optional.empty() : Optional.of(earliestPaymentDate);
	}

	public CorporateActionDate4 setEarliestPaymentDate(DateFormat4Choice earliestPaymentDate) {
		this.earliestPaymentDate = earliestPaymentDate;
		return this;
	}

	public Optional<DateFormat4Choice> getMarketDeadline() {
		return marketDeadline == null ? Optional.empty() : Optional.of(marketDeadline);
	}

	public CorporateActionDate4 setMarketDeadline(DateFormat4Choice marketDeadline) {
		this.marketDeadline = marketDeadline;
		return this;
	}

	public Optional<DateFormat4Choice> getResponseDeadline() {
		return responseDeadline == null ? Optional.empty() : Optional.of(responseDeadline);
	}

	public CorporateActionDate4 setResponseDeadline(DateFormat4Choice responseDeadline) {
		this.responseDeadline = responseDeadline;
		return this;
	}

	public Optional<DateFormat4Choice> getDeadlineToSplit() {
		return deadlineToSplit == null ? Optional.empty() : Optional.of(deadlineToSplit);
	}

	public CorporateActionDate4 setDeadlineToSplit(DateFormat4Choice deadlineToSplit) {
		this.deadlineToSplit = deadlineToSplit;
		return this;
	}

	public Optional<DateFormat4Choice> getExpiryDate() {
		return expiryDate == null ? Optional.empty() : Optional.of(expiryDate);
	}

	public CorporateActionDate4 setExpiryDate(DateFormat4Choice expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}

	public Optional<DateFormat4Choice> getQuotationSettingDate() {
		return quotationSettingDate == null ? Optional.empty() : Optional.of(quotationSettingDate);
	}

	public CorporateActionDate4 setQuotationSettingDate(DateFormat4Choice quotationSettingDate) {
		this.quotationSettingDate = quotationSettingDate;
		return this;
	}

	public Optional<DateFormat4Choice> getSubscriptionCostDebitDate() {
		return subscriptionCostDebitDate == null ? Optional.empty() : Optional.of(subscriptionCostDebitDate);
	}

	public CorporateActionDate4 setSubscriptionCostDebitDate(DateFormat4Choice subscriptionCostDebitDate) {
		this.subscriptionCostDebitDate = subscriptionCostDebitDate;
		return this;
	}
}