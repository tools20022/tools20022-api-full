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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateFormat34Choice;
import com.tools20022.repository.choice.DateFormat38Choice;
import com.tools20022.repository.entity.BiddingConditions;
import com.tools20022.repository.entity.CorporateActionDeadline;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.Deadline;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmEarlyResponseDeadline
 * CorporateActionDate55.mmEarlyResponseDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmCoverExpirationDate
 * CorporateActionDate55.mmCoverExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmProtectDate
 * CorporateActionDate55.mmProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmMarketDeadline
 * CorporateActionDate55.mmMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmResponseDeadline
 * CorporateActionDate55.mmResponseDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmExpiryDate
 * CorporateActionDate55.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmSubscriptionCostDebitDate
 * CorporateActionDate55.mmSubscriptionCostDebitDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmDepositoryCoverExpirationDate
 * CorporateActionDate55.mmDepositoryCoverExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmStockLendingDeadline
 * CorporateActionDate55.mmStockLendingDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmBorrowerStockLendingDeadline
 * CorporateActionDate55.mmBorrowerStockLendingDeadline}</li>
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
 * "CorporateActionDate55"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies corporate action dates."</li>
 * </ul>
 */
public class CorporateActionDate55 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DateFormat34Choice earlyResponseDeadline;
	/**
	 * Date/time that the account servicer has set as the deadline to respond,
	 * with instructions, to an outstanding event, giving the holder eligibility
	 * to incentives. This time is dependent on the reference time zone of the
	 * account servicer as specified in a Service Level Agreement (SLA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmEarlyResponseDeadline
	 * CorporateActionDeadline.mmEarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55
	 * CorporateActionDate55}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlyRspnDdln"</li>
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
	public static final MMMessageAssociationEnd mmEarlyResponseDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmEarlyResponseDeadline;
			componentContext_lazy = () -> CorporateActionDate55.mmObject();
			isDerived = false;
			xmlTag = "EarlyRspnDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyResponseDeadline";
			definition = "Date/time that the account servicer has set as the deadline to respond, with instructions, to an outstanding event, giving the holder eligibility to incentives. This time is dependent on the reference time zone of the account servicer as specified in a Service Level Agreement (SLA).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice coverExpirationDate;
	/**
	 * Last day a holder can deliver the securities that it had elected on
	 * and/or previously protected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmCoverExpirationDate
	 * CorporateActionDeadline.mmCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55
	 * CorporateActionDate55}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCoverExpirationDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmCoverExpirationDate;
			componentContext_lazy = () -> CorporateActionDate55.mmObject();
			isDerived = false;
			xmlTag = "CoverXprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverExpirationDate";
			definition = "Last day a holder can deliver the securities that it had elected on and/or previously protected.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice protectDate;
	/**
	 * Last date/time a holder can request to defer delivery of securities
	 * pursuant to a notice of guaranteed delivery or other required
	 * documentation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmProtectDate
	 * CorporateActionDeadline.mmProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55
	 * CorporateActionDate55}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmProtectDate;
			componentContext_lazy = () -> CorporateActionDate55.mmObject();
			isDerived = false;
			xmlTag = "PrtctDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDate";
			definition = "Last date/time a holder can request to defer delivery of securities pursuant to a notice of guaranteed delivery or other required documentation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice marketDeadline;
	/**
	 * Issuer or issuer's agent deadline to respond, with an instruction, to an
	 * outstanding offer or privilege.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55
	 * CorporateActionDate55}</li>
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
	public static final MMMessageAssociationEnd mmMarketDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> CorporateActionDate55.mmObject();
			isDerived = false;
			xmlTag = "MktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadline";
			definition = "Issuer or issuer's agent deadline to respond, with an instruction, to an outstanding offer or privilege.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat38Choice responseDeadline;
	/**
	 * Date/time at which the account servicer has set as the deadline to
	 * respond, with instructions, to an outstanding event. This time is
	 * dependent on the reference time zone of the account servicer as specified
	 * in a Service Level Agreement (SLA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat38Choice
	 * DateFormat38Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmResponseDeadline
	 * CorporateActionDeadline.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55
	 * CorporateActionDate55}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmResponseDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmResponseDeadline;
			componentContext_lazy = () -> CorporateActionDate55.mmObject();
			isDerived = false;
			xmlTag = "RspnDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseDeadline";
			definition = "Date/time at which the account servicer has set as the deadline to respond, with instructions, to an outstanding event. This time is dependent on the reference time zone of the account servicer as specified in a Service Level Agreement (SLA).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat38Choice.mmObject();
		}
	};
	protected DateFormat34Choice expiryDate;
	/**
	 * Date/time at which an order expires or on which a privilege or offer
	 * terminates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmExpiryDate
	 * CorporateActionDeadline.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55
	 * CorporateActionDate55}</li>
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
	public static final MMMessageAssociationEnd mmExpiryDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmExpiryDate;
			componentContext_lazy = () -> CorporateActionDate55.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date/time at which an order expires or on which a privilege or offer terminates.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice subscriptionCostDebitDate;
	/**
	 * Date/time by which cash must be in place in order to take part in the
	 * event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmSubscriptionCostDebitDate
	 * BiddingConditions.mmSubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55
	 * CorporateActionDate55}</li>
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
	public static final MMMessageAssociationEnd mmSubscriptionCostDebitDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmSubscriptionCostDebitDate;
			componentContext_lazy = () -> CorporateActionDate55.mmObject();
			isDerived = false;
			xmlTag = "SbcptCostDbtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionCostDebitDate";
			definition = "Date/time by which cash must be in place in order to take part in the event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice depositoryCoverExpirationDate;
	/**
	 * Last day that a participant of the depository can deliver securities that
	 * it had elected on and/or previously protected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmDepositoryCoverExpirationDate
	 * CorporateActionDeadline.mmDepositoryCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55
	 * CorporateActionDate55}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstryCoverXprtnDt"</li>
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
	public static final MMMessageAssociationEnd mmDepositoryCoverExpirationDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmDepositoryCoverExpirationDate;
			componentContext_lazy = () -> CorporateActionDate55.mmObject();
			isDerived = false;
			xmlTag = "DpstryCoverXprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryCoverExpirationDate";
			definition = "Last day that a participant of the depository can deliver securities that it had elected on and/or previously protected.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice stockLendingDeadline;
	/**
	 * Date/time set as the deadline to respond, with instructions, to an
	 * outstanding event, for which the underlying security is out on loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmStockLendingDeadline
	 * CorporateActionDeadline.mmStockLendingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55
	 * CorporateActionDate55}</li>
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
	public static final MMMessageAssociationEnd mmStockLendingDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmStockLendingDeadline;
			componentContext_lazy = () -> CorporateActionDate55.mmObject();
			isDerived = false;
			xmlTag = "StockLndgDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLendingDeadline";
			definition = "Date/time set as the deadline to respond, with instructions, to an outstanding event, for which the underlying security is out on loan.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.BorrowerLendingDeadline2> borrowerStockLendingDeadline;
	/**
	 * Specifies the party borrowing stocks and the associated stock lending
	 * deadline assigned to the borrower.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BorrowerLendingDeadline2
	 * BorrowerLendingDeadline2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55
	 * CorporateActionDate55}</li>
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
	public static final MMMessageAssociationEnd mmBorrowerStockLendingDeadline = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Deadline.mmObject();
			componentContext_lazy = () -> CorporateActionDate55.mmObject();
			isDerived = false;
			xmlTag = "BrrwrStockLndgDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowerStockLendingDeadline";
			definition = "Specifies the party borrowing stocks and the associated stock lending deadline assigned to the borrower.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BorrowerLendingDeadline2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionDate55.mmEarlyResponseDeadline, CorporateActionDate55.mmCoverExpirationDate, CorporateActionDate55.mmProtectDate, CorporateActionDate55.mmMarketDeadline,
						CorporateActionDate55.mmResponseDeadline, CorporateActionDate55.mmExpiryDate, CorporateActionDate55.mmSubscriptionCostDebitDate, CorporateActionDate55.mmDepositoryCoverExpirationDate,
						CorporateActionDate55.mmStockLendingDeadline, CorporateActionDate55.mmBorrowerStockLendingDeadline);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDate55";
				definition = "Specifies corporate action dates.";
			}
		});
		return mmObject_lazy.get();
	}

	public DateFormat34Choice getEarlyResponseDeadline() {
		return earlyResponseDeadline;
	}

	public void setEarlyResponseDeadline(DateFormat34Choice earlyResponseDeadline) {
		this.earlyResponseDeadline = earlyResponseDeadline;
	}

	public DateFormat34Choice getCoverExpirationDate() {
		return coverExpirationDate;
	}

	public void setCoverExpirationDate(DateFormat34Choice coverExpirationDate) {
		this.coverExpirationDate = coverExpirationDate;
	}

	public DateFormat34Choice getProtectDate() {
		return protectDate;
	}

	public void setProtectDate(DateFormat34Choice protectDate) {
		this.protectDate = protectDate;
	}

	public DateFormat34Choice getMarketDeadline() {
		return marketDeadline;
	}

	public void setMarketDeadline(DateFormat34Choice marketDeadline) {
		this.marketDeadline = marketDeadline;
	}

	public DateFormat38Choice getResponseDeadline() {
		return responseDeadline;
	}

	public void setResponseDeadline(DateFormat38Choice responseDeadline) {
		this.responseDeadline = responseDeadline;
	}

	public DateFormat34Choice getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(DateFormat34Choice expiryDate) {
		this.expiryDate = expiryDate;
	}

	public DateFormat34Choice getSubscriptionCostDebitDate() {
		return subscriptionCostDebitDate;
	}

	public void setSubscriptionCostDebitDate(DateFormat34Choice subscriptionCostDebitDate) {
		this.subscriptionCostDebitDate = subscriptionCostDebitDate;
	}

	public DateFormat34Choice getDepositoryCoverExpirationDate() {
		return depositoryCoverExpirationDate;
	}

	public void setDepositoryCoverExpirationDate(DateFormat34Choice depositoryCoverExpirationDate) {
		this.depositoryCoverExpirationDate = depositoryCoverExpirationDate;
	}

	public DateFormat34Choice getStockLendingDeadline() {
		return stockLendingDeadline;
	}

	public void setStockLendingDeadline(DateFormat34Choice stockLendingDeadline) {
		this.stockLendingDeadline = stockLendingDeadline;
	}

	public List<BorrowerLendingDeadline2> getBorrowerStockLendingDeadline() {
		return borrowerStockLendingDeadline;
	}

	public void setBorrowerStockLendingDeadline(List<com.tools20022.repository.msg.BorrowerLendingDeadline2> borrowerStockLendingDeadline) {
		this.borrowerStockLendingDeadline = borrowerStockLendingDeadline;
	}
}