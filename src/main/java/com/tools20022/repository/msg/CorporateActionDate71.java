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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateFormat49Choice;
import com.tools20022.repository.choice.DateFormat54Choice;
import com.tools20022.repository.entity.BiddingConditions;
import com.tools20022.repository.entity.CorporateActionDeadline;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.Deadline;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BorrowerLendingDeadline4;
import java.util.*;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71#mmEarlyResponseDeadline
 * CorporateActionDate71.mmEarlyResponseDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71#mmCoverExpirationDate
 * CorporateActionDate71.mmCoverExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71#mmProtectDate
 * CorporateActionDate71.mmProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71#mmMarketDeadline
 * CorporateActionDate71.mmMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71#mmResponseDeadline
 * CorporateActionDate71.mmResponseDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71#mmExpiryDate
 * CorporateActionDate71.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71#mmSubscriptionCostDebitDate
 * CorporateActionDate71.mmSubscriptionCostDebitDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71#mmDepositoryCoverExpirationDate
 * CorporateActionDate71.mmDepositoryCoverExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71#mmStockLendingDeadline
 * CorporateActionDate71.mmStockLendingDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71#mmBorrowerStockLendingDeadline
 * CorporateActionDate71.mmBorrowerStockLendingDeadline}</li>
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
 * "CorporateActionDate71"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies corporate action dates."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionDate71", propOrder = {"earlyResponseDeadline", "coverExpirationDate", "protectDate", "marketDeadline", "responseDeadline", "expiryDate", "subscriptionCostDebitDate", "depositoryCoverExpirationDate",
		"stockLendingDeadline", "borrowerStockLendingDeadline"})
public class CorporateActionDate71 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "EarlyRspnDdln")
	protected DateFormat49Choice earlyResponseDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmEarlyResponseDeadline
	 * CorporateActionDeadline.mmEarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71
	 * CorporateActionDate71}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlyRspnDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::EARD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyResponseDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time that the account servicer has set as the deadline to respond, with instructions, to an outstanding event, giving the holder eligibility to incentives. This time is dependent on the reference time zone of the account servicer as specified in a Service Level Agreement (SLA)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate71, Optional<DateFormat49Choice>> mmEarlyResponseDeadline = new MMMessageAssociationEnd<CorporateActionDate71, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmEarlyResponseDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate71.mmObject();
			isDerived = false;
			xmlTag = "EarlyRspnDdln";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::EARD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyResponseDeadline";
			definition = "Date/time that the account servicer has set as the deadline to respond, with instructions, to an outstanding event, giving the holder eligibility to incentives. This time is dependent on the reference time zone of the account servicer as specified in a Service Level Agreement (SLA).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate71 obj) {
			return obj.getEarlyResponseDeadline();
		}

		@Override
		public void setValue(CorporateActionDate71 obj, Optional<DateFormat49Choice> value) {
			obj.setEarlyResponseDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "CoverXprtnDt")
	protected DateFormat49Choice coverExpirationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmCoverExpirationDate
	 * CorporateActionDeadline.mmCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71
	 * CorporateActionDate71}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CoverXprtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::CVPR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day a holder can deliver the securities that it had elected on and/or previously protected."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate71, Optional<DateFormat49Choice>> mmCoverExpirationDate = new MMMessageAssociationEnd<CorporateActionDate71, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmCoverExpirationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate71.mmObject();
			isDerived = false;
			xmlTag = "CoverXprtnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::CVPR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverExpirationDate";
			definition = "Last day a holder can deliver the securities that it had elected on and/or previously protected.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate71 obj) {
			return obj.getCoverExpirationDate();
		}

		@Override
		public void setValue(CorporateActionDate71 obj, Optional<DateFormat49Choice> value) {
			obj.setCoverExpirationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtctDt")
	protected DateFormat49Choice protectDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmProtectDate
	 * CorporateActionDeadline.mmProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71
	 * CorporateActionDate71}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::PODT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date/time a holder can request to defer delivery of securities pursuant to a notice of guaranteed delivery or other required documentation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate71, Optional<DateFormat49Choice>> mmProtectDate = new MMMessageAssociationEnd<CorporateActionDate71, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmProtectDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate71.mmObject();
			isDerived = false;
			xmlTag = "PrtctDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::PODT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDate";
			definition = "Last date/time a holder can request to defer delivery of securities pursuant to a notice of guaranteed delivery or other required documentation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate71 obj) {
			return obj.getProtectDate();
		}

		@Override
		public void setValue(CorporateActionDate71 obj, Optional<DateFormat49Choice> value) {
			obj.setProtectDate(value.orElse(null));
		}
	};
	@XmlElement(name = "MktDdln")
	protected DateFormat49Choice marketDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71
	 * CorporateActionDate71}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::MKDT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuer or issuer's agent deadline to respond with an instruction to an outstanding offer or privilege."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate71, Optional<DateFormat49Choice>> mmMarketDeadline = new MMMessageAssociationEnd<CorporateActionDate71, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate71.mmObject();
			isDerived = false;
			xmlTag = "MktDdln";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::MKDT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadline";
			definition = "Issuer or issuer's agent deadline to respond with an instruction to an outstanding offer or privilege.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate71 obj) {
			return obj.getMarketDeadline();
		}

		@Override
		public void setValue(CorporateActionDate71 obj, Optional<DateFormat49Choice> value) {
			obj.setMarketDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "RspnDdln")
	protected DateFormat54Choice responseDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat54Choice
	 * DateFormat54Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmResponseDeadline
	 * CorporateActionDeadline.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71
	 * CorporateActionDate71}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::RDDT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the account servicer has set as the deadline to respond, with instructions, to an outstanding event. This time is dependent on the reference time zone of the account servicer as specified in a Service Level Agreement (SLA)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate71, Optional<DateFormat54Choice>> mmResponseDeadline = new MMMessageAssociationEnd<CorporateActionDate71, Optional<DateFormat54Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmResponseDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate71.mmObject();
			isDerived = false;
			xmlTag = "RspnDdln";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::RDDT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseDeadline";
			definition = "Date/time at which the account servicer has set as the deadline to respond, with instructions, to an outstanding event. This time is dependent on the reference time zone of the account servicer as specified in a Service Level Agreement (SLA).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat54Choice.mmObject();
		}

		@Override
		public Optional<DateFormat54Choice> getValue(CorporateActionDate71 obj) {
			return obj.getResponseDeadline();
		}

		@Override
		public void setValue(CorporateActionDate71 obj, Optional<DateFormat54Choice> value) {
			obj.setResponseDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "XpryDt")
	protected DateFormat49Choice expiryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmExpiryDate
	 * CorporateActionDeadline.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71
	 * CorporateActionDate71}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::EXPI</li>
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
	public static final MMMessageAssociationEnd<CorporateActionDate71, Optional<DateFormat49Choice>> mmExpiryDate = new MMMessageAssociationEnd<CorporateActionDate71, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmExpiryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate71.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::EXPI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date/time at which an order expires or on which a privilege or offer terminates.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate71 obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(CorporateActionDate71 obj, Optional<DateFormat49Choice> value) {
			obj.setExpiryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SbcptCostDbtDt")
	protected DateFormat49Choice subscriptionCostDebitDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmSubscriptionCostDebitDate
	 * BiddingConditions.mmSubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71
	 * CorporateActionDate71}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptCostDbtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::SUBS</li>
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
	public static final MMMessageAssociationEnd<CorporateActionDate71, Optional<DateFormat49Choice>> mmSubscriptionCostDebitDate = new MMMessageAssociationEnd<CorporateActionDate71, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmSubscriptionCostDebitDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate71.mmObject();
			isDerived = false;
			xmlTag = "SbcptCostDbtDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SUBS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionCostDebitDate";
			definition = "Date/time by which cash must be in place in order to take part in the event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate71 obj) {
			return obj.getSubscriptionCostDebitDate();
		}

		@Override
		public void setValue(CorporateActionDate71 obj, Optional<DateFormat49Choice> value) {
			obj.setSubscriptionCostDebitDate(value.orElse(null));
		}
	};
	@XmlElement(name = "DpstryCoverXprtnDt")
	protected DateFormat49Choice depositoryCoverExpirationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmDepositoryCoverExpirationDate
	 * CorporateActionDeadline.mmDepositoryCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71
	 * CorporateActionDate71}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstryCoverXprtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::DVCP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryCoverExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day that a participant of the depository can deliver securities that it had elected on and/or previously protected."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate71, Optional<DateFormat49Choice>> mmDepositoryCoverExpirationDate = new MMMessageAssociationEnd<CorporateActionDate71, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmDepositoryCoverExpirationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate71.mmObject();
			isDerived = false;
			xmlTag = "DpstryCoverXprtnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::DVCP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryCoverExpirationDate";
			definition = "Last day that a participant of the depository can deliver securities that it had elected on and/or previously protected.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate71 obj) {
			return obj.getDepositoryCoverExpirationDate();
		}

		@Override
		public void setValue(CorporateActionDate71 obj, Optional<DateFormat49Choice> value) {
			obj.setDepositoryCoverExpirationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "StockLndgDdln")
	protected DateFormat49Choice stockLendingDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmStockLendingDeadline
	 * CorporateActionDeadline.mmStockLendingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71
	 * CorporateActionDate71}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StockLndgDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLendingDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time set as the deadline to respond, with instructions, to an outstanding event, for which the underlying security is out on loan."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate71, Optional<DateFormat49Choice>> mmStockLendingDeadline = new MMMessageAssociationEnd<CorporateActionDate71, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmStockLendingDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate71.mmObject();
			isDerived = false;
			xmlTag = "StockLndgDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLendingDeadline";
			definition = "Date/time set as the deadline to respond, with instructions, to an outstanding event, for which the underlying security is out on loan.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate71 obj) {
			return obj.getStockLendingDeadline();
		}

		@Override
		public void setValue(CorporateActionDate71 obj, Optional<DateFormat49Choice> value) {
			obj.setStockLendingDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "BrrwrStockLndgDdln")
	protected List<BorrowerLendingDeadline4> borrowerStockLendingDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BorrowerLendingDeadline4
	 * BorrowerLendingDeadline4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71
	 * CorporateActionDate71}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrrwrStockLndgDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowerStockLendingDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the party borrowing stocks and the associated stock lending deadline assigned to the borrower."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate71, List<BorrowerLendingDeadline4>> mmBorrowerStockLendingDeadline = new MMMessageAssociationEnd<CorporateActionDate71, List<BorrowerLendingDeadline4>>() {
		{
			businessComponentTrace_lazy = () -> Deadline.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate71.mmObject();
			isDerived = false;
			xmlTag = "BrrwrStockLndgDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowerStockLendingDeadline";
			definition = "Specifies the party borrowing stocks and the associated stock lending deadline assigned to the borrower.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BorrowerLendingDeadline4.mmObject();
		}

		@Override
		public List<BorrowerLendingDeadline4> getValue(CorporateActionDate71 obj) {
			return obj.getBorrowerStockLendingDeadline();
		}

		@Override
		public void setValue(CorporateActionDate71 obj, List<BorrowerLendingDeadline4> value) {
			obj.setBorrowerStockLendingDeadline(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate71.mmEarlyResponseDeadline, com.tools20022.repository.msg.CorporateActionDate71.mmCoverExpirationDate,
						com.tools20022.repository.msg.CorporateActionDate71.mmProtectDate, com.tools20022.repository.msg.CorporateActionDate71.mmMarketDeadline, com.tools20022.repository.msg.CorporateActionDate71.mmResponseDeadline,
						com.tools20022.repository.msg.CorporateActionDate71.mmExpiryDate, com.tools20022.repository.msg.CorporateActionDate71.mmSubscriptionCostDebitDate,
						com.tools20022.repository.msg.CorporateActionDate71.mmDepositoryCoverExpirationDate, com.tools20022.repository.msg.CorporateActionDate71.mmStockLendingDeadline,
						com.tools20022.repository.msg.CorporateActionDate71.mmBorrowerStockLendingDeadline);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDate71";
				definition = "Specifies corporate action dates.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DateFormat49Choice> getEarlyResponseDeadline() {
		return earlyResponseDeadline == null ? Optional.empty() : Optional.of(earlyResponseDeadline);
	}

	public CorporateActionDate71 setEarlyResponseDeadline(DateFormat49Choice earlyResponseDeadline) {
		this.earlyResponseDeadline = earlyResponseDeadline;
		return this;
	}

	public Optional<DateFormat49Choice> getCoverExpirationDate() {
		return coverExpirationDate == null ? Optional.empty() : Optional.of(coverExpirationDate);
	}

	public CorporateActionDate71 setCoverExpirationDate(DateFormat49Choice coverExpirationDate) {
		this.coverExpirationDate = coverExpirationDate;
		return this;
	}

	public Optional<DateFormat49Choice> getProtectDate() {
		return protectDate == null ? Optional.empty() : Optional.of(protectDate);
	}

	public CorporateActionDate71 setProtectDate(DateFormat49Choice protectDate) {
		this.protectDate = protectDate;
		return this;
	}

	public Optional<DateFormat49Choice> getMarketDeadline() {
		return marketDeadline == null ? Optional.empty() : Optional.of(marketDeadline);
	}

	public CorporateActionDate71 setMarketDeadline(DateFormat49Choice marketDeadline) {
		this.marketDeadline = marketDeadline;
		return this;
	}

	public Optional<DateFormat54Choice> getResponseDeadline() {
		return responseDeadline == null ? Optional.empty() : Optional.of(responseDeadline);
	}

	public CorporateActionDate71 setResponseDeadline(DateFormat54Choice responseDeadline) {
		this.responseDeadline = responseDeadline;
		return this;
	}

	public Optional<DateFormat49Choice> getExpiryDate() {
		return expiryDate == null ? Optional.empty() : Optional.of(expiryDate);
	}

	public CorporateActionDate71 setExpiryDate(DateFormat49Choice expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}

	public Optional<DateFormat49Choice> getSubscriptionCostDebitDate() {
		return subscriptionCostDebitDate == null ? Optional.empty() : Optional.of(subscriptionCostDebitDate);
	}

	public CorporateActionDate71 setSubscriptionCostDebitDate(DateFormat49Choice subscriptionCostDebitDate) {
		this.subscriptionCostDebitDate = subscriptionCostDebitDate;
		return this;
	}

	public Optional<DateFormat49Choice> getDepositoryCoverExpirationDate() {
		return depositoryCoverExpirationDate == null ? Optional.empty() : Optional.of(depositoryCoverExpirationDate);
	}

	public CorporateActionDate71 setDepositoryCoverExpirationDate(DateFormat49Choice depositoryCoverExpirationDate) {
		this.depositoryCoverExpirationDate = depositoryCoverExpirationDate;
		return this;
	}

	public Optional<DateFormat49Choice> getStockLendingDeadline() {
		return stockLendingDeadline == null ? Optional.empty() : Optional.of(stockLendingDeadline);
	}

	public CorporateActionDate71 setStockLendingDeadline(DateFormat49Choice stockLendingDeadline) {
		this.stockLendingDeadline = stockLendingDeadline;
		return this;
	}

	public List<BorrowerLendingDeadline4> getBorrowerStockLendingDeadline() {
		return borrowerStockLendingDeadline == null ? borrowerStockLendingDeadline = new ArrayList<>() : borrowerStockLendingDeadline;
	}

	public CorporateActionDate71 setBorrowerStockLendingDeadline(List<BorrowerLendingDeadline4> borrowerStockLendingDeadline) {
		this.borrowerStockLendingDeadline = Objects.requireNonNull(borrowerStockLendingDeadline);
		return this;
	}
}