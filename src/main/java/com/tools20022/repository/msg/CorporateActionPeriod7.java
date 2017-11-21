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
import com.tools20022.repository.choice.Period3Choice;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies periods related to a corporate action option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmPriceCalculationPeriod
 * CorporateActionPeriod7.mmPriceCalculationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmParallelTradingPeriod
 * CorporateActionPeriod7.mmParallelTradingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmActionPeriod
 * CorporateActionPeriod7.mmActionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmRevocabilityPeriod
 * CorporateActionPeriod7.mmRevocabilityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmPrivilegeSuspensionPeriod
 * CorporateActionPeriod7.mmPrivilegeSuspensionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmAccountServicerRevocabilityPeriod
 * CorporateActionPeriod7.mmAccountServicerRevocabilityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmDepositorySuspensionPeriodForWithdrawal
 * CorporateActionPeriod7.mmDepositorySuspensionPeriodForWithdrawal}</li>
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
 * "CorporateActionPeriod7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies periods related to a corporate action option."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionPeriod7", propOrder = {"priceCalculationPeriod", "parallelTradingPeriod", "actionPeriod", "revocabilityPeriod", "privilegeSuspensionPeriod", "accountServicerRevocabilityPeriod",
		"depositorySuspensionPeriodForWithdrawal"})
public class CorporateActionPeriod7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Period3Choice priceCalculationPeriod;
	/**
	 * Period during which the price of a security is determined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceCalculationPeriod
	 * SecuritiesPricing.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7
	 * CorporateActionPeriod7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricClctnPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceCalculationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the price of a security is determined."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPriceCalculationPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceCalculationPeriod;
			componentContext_lazy = () -> CorporateActionPeriod7.mmObject();
			isDerived = false;
			xmlTag = "PricClctnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceCalculationPeriod";
			definition = "Period during which the price of a security is determined.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};
	protected Period3Choice parallelTradingPeriod;
	/**
	 * Period during which both old and new equity may be traded simultaneously,
	 * for example, consolidation of equity or splitting of equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmParallelTradingPeriod
	 * SecuritiesProceedsDefinition.mmParallelTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7
	 * CorporateActionPeriod7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ParllTradgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParallelTradingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which both old and new equity may be traded simultaneously, for example, consolidation of equity or splitting of equity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParallelTradingPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmParallelTradingPeriod;
			componentContext_lazy = () -> CorporateActionPeriod7.mmObject();
			isDerived = false;
			xmlTag = "ParllTradgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParallelTradingPeriod";
			definition = "Period during which both old and new equity may be traded simultaneously, for example, consolidation of equity or splitting of equity.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};
	protected Period3Choice actionPeriod;
	/**
	 * Period during which the specified option, or all options of the event,
	 * remains valid, for example, offer period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmActionPeriod
	 * CorporateActionOption.mmActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7
	 * CorporateActionPeriod7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the specified option, or all options of the event, remains valid, for example, offer period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmActionPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmActionPeriod;
			componentContext_lazy = () -> CorporateActionPeriod7.mmObject();
			isDerived = false;
			xmlTag = "ActnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionPeriod";
			definition = "Period during which the specified option, or all options of the event, remains valid, for example, offer period.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};
	protected Period3Choice revocabilityPeriod;
	/**
	 * Period during which the shareholder can revoke, change or withdraw its
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRevocabilityPeriod
	 * CorporateActionDeadline.mmRevocabilityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7
	 * CorporateActionPeriod7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvcbltyPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the shareholder can revoke, change or withdraw its instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRevocabilityPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmRevocabilityPeriod;
			componentContext_lazy = () -> CorporateActionPeriod7.mmObject();
			isDerived = false;
			xmlTag = "RvcbltyPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriod";
			definition = "Period during which the shareholder can revoke, change or withdraw its instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};
	protected Period3Choice privilegeSuspensionPeriod;
	/**
	 * Period during which the privilege is not available, for example, this can
	 * happen whenever a meeting takes place or whenever a coupon payment is
	 * due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmPrivilegeSuspensionPeriod
	 * SuspensionPeriod.mmPrivilegeSuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7
	 * CorporateActionPeriod7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvlgSspnsnPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivilegeSuspensionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the privilege is not available, for example, this can happen whenever a meeting takes place or whenever a coupon payment is due."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPrivilegeSuspensionPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmPrivilegeSuspensionPeriod;
			componentContext_lazy = () -> CorporateActionPeriod7.mmObject();
			isDerived = false;
			xmlTag = "PrvlgSspnsnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrivilegeSuspensionPeriod";
			definition = "Period during which the privilege is not available, for example, this can happen whenever a meeting takes place or whenever a coupon payment is due.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};
	protected Period3Choice accountServicerRevocabilityPeriod;
	/**
	 * Period during which the participant of the account servicer can revoke
	 * change or withdraw its instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRevocabilityPeriod
	 * CorporateActionDeadline.mmRevocabilityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7
	 * CorporateActionPeriod7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrRvcbltyPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerRevocabilityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the participant of the account servicer can revoke change or withdraw its instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountServicerRevocabilityPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmRevocabilityPeriod;
			componentContext_lazy = () -> CorporateActionPeriod7.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrRvcbltyPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerRevocabilityPeriod";
			definition = "Period during which the participant of the account servicer can revoke change or withdraw its instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};
	protected Period3Choice depositorySuspensionPeriodForWithdrawal;
	/**
	 * Period defining the last date on which withdrawal in street name requests
	 * on the outturn security will be accepted and the date on which the
	 * suspension will be released and withdrawal by transfer processing on the
	 * outturn security will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawal
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7
	 * CorporateActionPeriod7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForWdrwl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date on which withdrawal in street name requests on the outturn security will be accepted and the date on which the suspension will be released and withdrawal by transfer processing on the outturn security will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepositorySuspensionPeriodForWithdrawal = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawal;
			componentContext_lazy = () -> CorporateActionPeriod7.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForWdrwl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawal";
			definition = "Period defining the last date on which withdrawal in street name requests on the outturn security will be accepted and the date on which the suspension will be released and withdrawal by transfer processing on the outturn security will resume.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionPeriod7.mmPriceCalculationPeriod, CorporateActionPeriod7.mmParallelTradingPeriod, CorporateActionPeriod7.mmActionPeriod, CorporateActionPeriod7.mmRevocabilityPeriod,
						CorporateActionPeriod7.mmPrivilegeSuspensionPeriod, CorporateActionPeriod7.mmAccountServicerRevocabilityPeriod, CorporateActionPeriod7.mmDepositorySuspensionPeriodForWithdrawal);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPeriod7";
				definition = "Specifies periods related to a corporate action option.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PricClctnPrd")
	public Period3Choice getPriceCalculationPeriod() {
		return priceCalculationPeriod;
	}

	public void setPriceCalculationPeriod(Period3Choice priceCalculationPeriod) {
		this.priceCalculationPeriod = priceCalculationPeriod;
	}

	@XmlElement(name = "ParllTradgPrd")
	public Period3Choice getParallelTradingPeriod() {
		return parallelTradingPeriod;
	}

	public void setParallelTradingPeriod(Period3Choice parallelTradingPeriod) {
		this.parallelTradingPeriod = parallelTradingPeriod;
	}

	@XmlElement(name = "ActnPrd")
	public Period3Choice getActionPeriod() {
		return actionPeriod;
	}

	public void setActionPeriod(Period3Choice actionPeriod) {
		this.actionPeriod = actionPeriod;
	}

	@XmlElement(name = "RvcbltyPrd")
	public Period3Choice getRevocabilityPeriod() {
		return revocabilityPeriod;
	}

	public void setRevocabilityPeriod(Period3Choice revocabilityPeriod) {
		this.revocabilityPeriod = revocabilityPeriod;
	}

	@XmlElement(name = "PrvlgSspnsnPrd")
	public Period3Choice getPrivilegeSuspensionPeriod() {
		return privilegeSuspensionPeriod;
	}

	public void setPrivilegeSuspensionPeriod(Period3Choice privilegeSuspensionPeriod) {
		this.privilegeSuspensionPeriod = privilegeSuspensionPeriod;
	}

	@XmlElement(name = "AcctSvcrRvcbltyPrd")
	public Period3Choice getAccountServicerRevocabilityPeriod() {
		return accountServicerRevocabilityPeriod;
	}

	public void setAccountServicerRevocabilityPeriod(Period3Choice accountServicerRevocabilityPeriod) {
		this.accountServicerRevocabilityPeriod = accountServicerRevocabilityPeriod;
	}

	@XmlElement(name = "DpstrySspnsnPrdForWdrwl")
	public Period3Choice getDepositorySuspensionPeriodForWithdrawal() {
		return depositorySuspensionPeriodForWithdrawal;
	}

	public void setDepositorySuspensionPeriodForWithdrawal(Period3Choice depositorySuspensionPeriodForWithdrawal) {
		this.depositorySuspensionPeriodForWithdrawal = depositorySuspensionPeriodForWithdrawal;
	}
}