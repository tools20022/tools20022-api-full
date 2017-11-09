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
import com.tools20022.repository.choice.DateFormat10Choice;
import com.tools20022.repository.choice.DateFormat9Choice;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#mmEarlyResponseDeadline
 * CorporateActionDate11.mmEarlyResponseDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#mmCoverExpirationDate
 * CorporateActionDate11.mmCoverExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#mmProtectDate
 * CorporateActionDate11.mmProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#mmMarketDeadline
 * CorporateActionDate11.mmMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#mmResponseDeadline
 * CorporateActionDate11.mmResponseDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#mmExpiryDate
 * CorporateActionDate11.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#mmSubscriptionCostDebitDate
 * CorporateActionDate11.mmSubscriptionCostDebitDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#mmDepositoryCoverExpirationDate
 * CorporateActionDate11.mmDepositoryCoverExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#mmLeadPlaintiffDeadline
 * CorporateActionDate11.mmLeadPlaintiffDeadline}</li>
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
 * "CorporateActionDate11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies corporate action dates."</li>
 * </ul>
 */
public class CorporateActionDate11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DateFormat9Choice earlyResponseDeadline;
	/**
	 * Date/time that the account servicer has set as the deadline to respond,
	 * with instructions, to an outstanding event, giving the holder eligibility
	 * to incentives. This time is dependent on the reference time zone of the
	 * account servicer as specified in a Service Level Agreement (SLA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat9Choice
	 * DateFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmEarlyResponseDeadline
	 * CorporateActionDeadline.mmEarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11
	 * CorporateActionDate11}</li>
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
			componentContext_lazy = () -> CorporateActionDate11.mmObject();
			isDerived = false;
			xmlTag = "EarlyRspnDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyResponseDeadline";
			definition = "Date/time that the account servicer has set as the deadline to respond, with instructions, to an outstanding event, giving the holder eligibility to incentives. This time is dependent on the reference time zone of the account servicer as specified in a Service Level Agreement (SLA).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat9Choice.mmObject();
		}
	};
	protected DateFormat9Choice coverExpirationDate;
	/**
	 * Last day a holder can deliver the securities that it had elected on
	 * and/or previously protected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat9Choice
	 * DateFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmCoverExpirationDate
	 * CorporateActionDeadline.mmCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11
	 * CorporateActionDate11}</li>
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
			componentContext_lazy = () -> CorporateActionDate11.mmObject();
			isDerived = false;
			xmlTag = "CoverXprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverExpirationDate";
			definition = "Last day a holder can deliver the securities that it had elected on and/or previously protected.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat9Choice.mmObject();
		}
	};
	protected DateFormat9Choice protectDate;
	/**
	 * Last date/time a holder can request to defer delivery of securities
	 * pursuant to a notice of guaranteed delivery or other required
	 * documentation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat9Choice
	 * DateFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmProtectDate
	 * CorporateActionDeadline.mmProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11
	 * CorporateActionDate11}</li>
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
			componentContext_lazy = () -> CorporateActionDate11.mmObject();
			isDerived = false;
			xmlTag = "PrtctDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDate";
			definition = "Last date/time a holder can request to defer delivery of securities pursuant to a notice of guaranteed delivery or other required documentation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat9Choice.mmObject();
		}
	};
	protected DateFormat9Choice marketDeadline;
	/**
	 * Issuer or issuer's agent deadline to respond, with an instruction, to an
	 * outstanding offer or privilege.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat9Choice
	 * DateFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11
	 * CorporateActionDate11}</li>
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
			componentContext_lazy = () -> CorporateActionDate11.mmObject();
			isDerived = false;
			xmlTag = "MktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadline";
			definition = "Issuer or issuer's agent deadline to respond, with an instruction, to an outstanding offer or privilege.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat9Choice.mmObject();
		}
	};
	protected DateFormat10Choice responseDeadline;
	/**
	 * Date/time at which the account servicer has set as the deadline to
	 * respond, with instructions, to an outstanding event. This time is
	 * dependent on the reference time zone of the account servicer as specified
	 * in a Service Level Agreement (SLA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat10Choice
	 * DateFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmResponseDeadline
	 * CorporateActionDeadline.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11
	 * CorporateActionDate11}</li>
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
			componentContext_lazy = () -> CorporateActionDate11.mmObject();
			isDerived = false;
			xmlTag = "RspnDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseDeadline";
			definition = "Date/time at which the account servicer has set as the deadline to respond, with instructions, to an outstanding event. This time is dependent on the reference time zone of the account servicer as specified in a Service Level Agreement (SLA).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat10Choice.mmObject();
		}
	};
	protected DateFormat9Choice expiryDate;
	/**
	 * Date/time at which an order expires or on which a privilege or offer
	 * terminates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat9Choice
	 * DateFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmExpiryDate
	 * CorporateActionDeadline.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11
	 * CorporateActionDate11}</li>
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
			componentContext_lazy = () -> CorporateActionDate11.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date/time at which an order expires or on which a privilege or offer terminates.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat9Choice.mmObject();
		}
	};
	protected DateFormat9Choice subscriptionCostDebitDate;
	/**
	 * Date/time by which cash must be in place in order to take part in the
	 * event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat9Choice
	 * DateFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmSubscriptionCostDebitDate
	 * BiddingConditions.mmSubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11
	 * CorporateActionDate11}</li>
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
			componentContext_lazy = () -> CorporateActionDate11.mmObject();
			isDerived = false;
			xmlTag = "SbcptCostDbtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionCostDebitDate";
			definition = "Date/time by which cash must be in place in order to take part in the event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat9Choice.mmObject();
		}
	};
	protected DateFormat9Choice depositoryCoverExpirationDate;
	/**
	 * Last day that a participant of the depository can deliver securities that
	 * it had elected on and/or previously protected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat9Choice
	 * DateFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmDepositoryCoverExpirationDate
	 * CorporateActionDeadline.mmDepositoryCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11
	 * CorporateActionDate11}</li>
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
			componentContext_lazy = () -> CorporateActionDate11.mmObject();
			isDerived = false;
			xmlTag = "DpstryCoverXprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryCoverExpirationDate";
			definition = "Last day that a participant of the depository can deliver securities that it had elected on and/or previously protected.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat9Choice.mmObject();
		}
	};
	protected DateFormat9Choice leadPlaintiffDeadline;
	/**
	 * Last day an investor can become a lead plaintiff.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat9Choice
	 * DateFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmLeadPlaintiffDeadline
	 * ClassAction.mmLeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11
	 * CorporateActionDate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LeadPlntffDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LeadPlaintiffDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Last day an investor can become a lead plaintiff."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLeadPlaintiffDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ClassAction.mmLeadPlaintiffDeadline;
			componentContext_lazy = () -> CorporateActionDate11.mmObject();
			isDerived = false;
			xmlTag = "LeadPlntffDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LeadPlaintiffDeadline";
			definition = "Last day an investor can become a lead plaintiff.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat9Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionDate11.mmEarlyResponseDeadline, CorporateActionDate11.mmCoverExpirationDate, CorporateActionDate11.mmProtectDate, CorporateActionDate11.mmMarketDeadline,
						CorporateActionDate11.mmResponseDeadline, CorporateActionDate11.mmExpiryDate, CorporateActionDate11.mmSubscriptionCostDebitDate, CorporateActionDate11.mmDepositoryCoverExpirationDate,
						CorporateActionDate11.mmLeadPlaintiffDeadline);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDate11";
				definition = "Specifies corporate action dates.";
			}
		});
		return mmObject_lazy.get();
	}

	public DateFormat9Choice getEarlyResponseDeadline() {
		return earlyResponseDeadline;
	}

	public void setEarlyResponseDeadline(DateFormat9Choice earlyResponseDeadline) {
		this.earlyResponseDeadline = earlyResponseDeadline;
	}

	public DateFormat9Choice getCoverExpirationDate() {
		return coverExpirationDate;
	}

	public void setCoverExpirationDate(DateFormat9Choice coverExpirationDate) {
		this.coverExpirationDate = coverExpirationDate;
	}

	public DateFormat9Choice getProtectDate() {
		return protectDate;
	}

	public void setProtectDate(DateFormat9Choice protectDate) {
		this.protectDate = protectDate;
	}

	public DateFormat9Choice getMarketDeadline() {
		return marketDeadline;
	}

	public void setMarketDeadline(DateFormat9Choice marketDeadline) {
		this.marketDeadline = marketDeadline;
	}

	public DateFormat10Choice getResponseDeadline() {
		return responseDeadline;
	}

	public void setResponseDeadline(DateFormat10Choice responseDeadline) {
		this.responseDeadline = responseDeadline;
	}

	public DateFormat9Choice getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(DateFormat9Choice expiryDate) {
		this.expiryDate = expiryDate;
	}

	public DateFormat9Choice getSubscriptionCostDebitDate() {
		return subscriptionCostDebitDate;
	}

	public void setSubscriptionCostDebitDate(DateFormat9Choice subscriptionCostDebitDate) {
		this.subscriptionCostDebitDate = subscriptionCostDebitDate;
	}

	public DateFormat9Choice getDepositoryCoverExpirationDate() {
		return depositoryCoverExpirationDate;
	}

	public void setDepositoryCoverExpirationDate(DateFormat9Choice depositoryCoverExpirationDate) {
		this.depositoryCoverExpirationDate = depositoryCoverExpirationDate;
	}

	public DateFormat9Choice getLeadPlaintiffDeadline() {
		return leadPlaintiffDeadline;
	}

	public void setLeadPlaintiffDeadline(DateFormat9Choice leadPlaintiffDeadline) {
		this.leadPlaintiffDeadline = leadPlaintiffDeadline;
	}
}