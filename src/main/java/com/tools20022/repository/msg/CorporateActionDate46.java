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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.DateFormat31Choice;
import com.tools20022.repository.entity.CorporateActionEvent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies corporate action date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#ResponseDeadline
 * CorporateActionDate46.ResponseDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#SubscriptionCostDebitDate
 * CorporateActionDate46.SubscriptionCostDebitDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#MarketDeadline
 * CorporateActionDate46.MarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#ExpiryDate
 * CorporateActionDate46.ExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#CoverExpirationDate
 * CorporateActionDate46.CoverExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#ProtectDate
 * CorporateActionDate46.ProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#TradingDate
 * CorporateActionDate46.TradingDate}</li>
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
 * "CorporateActionDate46"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies corporate action date."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18
 * CorporateActionDate18}</li>
 * </ul>
 */
public class CorporateActionDate46 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date/time at which the account servicer has set as the deadline to
	 * respond, with instructions, to an outstanding event. This time is
	 * dependent on the reference time zone of the account servicer as specified
	 * in a Service Level Agreement (SLA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#ResponseDeadline
	 * CorporateActionDeadline.ResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46
	 * CorporateActionDate46}</li>
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
	 * "Date/time at which the account servicer has set as the deadline to respond, with instructions, to an outstanding event. This time is dependent on the reference time zone of the account servicer as specified in a Service Level Agreement (SLA)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#ResponseDeadline
	 * CorporateActionDate18.ResponseDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ResponseDeadline = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionDate46.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.ResponseDeadline;
			isDerived = false;
			xmlTag = "RspnDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseDeadline";
			definition = "Date/time at which the account servicer has set as the deadline to respond, with instructions, to an outstanding event. This time is dependent on the reference time zone of the account servicer as specified in a Service Level Agreement (SLA).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionDate18.ResponseDeadline;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateFormat31Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Date/time by which cash must be in place in order to take part in the
	 * event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#SubscriptionCostDebitDate
	 * BiddingConditions.SubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46
	 * CorporateActionDate46}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#SubscriptionCostDebitDate
	 * CorporateActionDate18.SubscriptionCostDebitDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd SubscriptionCostDebitDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionDate46.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.BiddingConditions.SubscriptionCostDebitDate;
			isDerived = false;
			xmlTag = "SbcptCostDbtDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionCostDebitDate";
			definition = "Date/time by which cash must be in place in order to take part in the event.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionDate18.SubscriptionCostDebitDate;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateFormat31Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Issuer or issuer's agent deadline to respond, with an instruction, to an
	 * outstanding offer or privilege.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#MarketDeadline
	 * Deadline.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46
	 * CorporateActionDate46}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#MarketDeadline
	 * CorporateActionDate18.MarketDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd MarketDeadline = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionDate46.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Deadline.MarketDeadline;
			isDerived = false;
			xmlTag = "MktDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadline";
			definition = "Issuer or issuer's agent deadline to respond, with an instruction, to an outstanding offer or privilege.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionDate18.MarketDeadline;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateFormat31Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Date/time at which an order expires or on which a privilege or offer
	 * terminates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#ExpiryDate
	 * CorporateActionDeadline.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46
	 * CorporateActionDate46}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#ExpiryDate
	 * CorporateActionDate18.ExpiryDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ExpiryDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionDate46.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.ExpiryDate;
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date/time at which an order expires or on which a privilege or offer terminates.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionDate18.ExpiryDate;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateFormat31Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Last day a holder can deliver the securities that it had elected on
	 * and/or previously protected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#CoverExpirationDate
	 * CorporateActionDeadline.CoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46
	 * CorporateActionDate46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CoverXprtnDt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#CoverExpirationDate
	 * CorporateActionDate18.CoverExpirationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CoverExpirationDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionDate46.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.CoverExpirationDate;
			isDerived = false;
			xmlTag = "CoverXprtnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverExpirationDate";
			definition = "Last day a holder can deliver the securities that it had elected on and/or previously protected.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionDate18.CoverExpirationDate;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateFormat31Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Last date/time a holder can request to defer delivery of securities
	 * pursuant to a notice of guaranteed delivery or other required
	 * documentation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#ProtectDate
	 * CorporateActionDeadline.ProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46
	 * CorporateActionDate46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctDt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#ProtectDate
	 * CorporateActionDate18.ProtectDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ProtectDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionDate46.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.ProtectDate;
			isDerived = false;
			xmlTag = "PrtctDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDate";
			definition = "Last date/time a holder can request to defer delivery of securities pursuant to a notice of guaranteed delivery or other required documentation.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionDate18.ProtectDate;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateFormat31Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Date/time at which the deal (rights) was agreed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#TradingDate
	 * CorporateActionEvent.TradingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46
	 * CorporateActionDate46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the deal (rights) was agreed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#TradingDate
	 * CorporateActionDate18.TradingDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TradingDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionDate46.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.TradingDate;
			isDerived = false;
			xmlTag = "TradgDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingDate";
			definition = "Date/time at which the deal (rights) was agreed.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionDate18.TradingDate;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateFormat31Choice.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate46.ResponseDeadline, com.tools20022.repository.msg.CorporateActionDate46.SubscriptionCostDebitDate,
						com.tools20022.repository.msg.CorporateActionDate46.MarketDeadline, com.tools20022.repository.msg.CorporateActionDate46.ExpiryDate, com.tools20022.repository.msg.CorporateActionDate46.CoverExpirationDate,
						com.tools20022.repository.msg.CorporateActionDate46.ProtectDate, com.tools20022.repository.msg.CorporateActionDate46.TradingDate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDate46";
				definition = "Specifies corporate action date.";
				previousVersion_lazy = () -> CorporateActionDate18.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}