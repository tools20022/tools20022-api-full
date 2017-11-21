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
import com.tools20022.metamodel.MMMessageAttribute;
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
 * Specifies periods of a corporate action.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmPriceCalculationPeriod
 * CorporateActionPeriod8.mmPriceCalculationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmInterestPeriod
 * CorporateActionPeriod8.mmInterestPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmCompulsoryPurchasePeriod
 * CorporateActionPeriod8.mmCompulsoryPurchasePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmBlockingPeriod
 * CorporateActionPeriod8.mmBlockingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmClaimPeriod
 * CorporateActionPeriod8.mmClaimPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForBookEntryTransfer
 * CorporateActionPeriod8.mmDepositorySuspensionPeriodForBookEntryTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForDepositAtAgent
 * CorporateActionPeriod8.mmDepositorySuspensionPeriodForDepositAtAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForDeposit
 * CorporateActionPeriod8.mmDepositorySuspensionPeriodForDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForPledge
 * CorporateActionPeriod8.mmDepositorySuspensionPeriodForPledge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForSegregation
 * CorporateActionPeriod8.mmDepositorySuspensionPeriodForSegregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForWithdrawalAtAgent
 * CorporateActionPeriod8.mmDepositorySuspensionPeriodForWithdrawalAtAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForWithdrawalInNomineeName
 * CorporateActionPeriod8.mmDepositorySuspensionPeriodForWithdrawalInNomineeName
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForWithdrawalInStreetName
 * CorporateActionPeriod8.mmDepositorySuspensionPeriodForWithdrawalInStreetName}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmBookClosurePeriod
 * CorporateActionPeriod8.mmBookClosurePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmCoDepositoriesSuspensionPeriod
 * CorporateActionPeriod8.mmCoDepositoriesSuspensionPeriod}</li>
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
 * "CorporateActionPeriod8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies periods of a corporate action."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPeriod10
 * CorporateActionPeriod10}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6
 * CorporateActionPeriod6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionPeriod8", propOrder = {"priceCalculationPeriod", "interestPeriod", "compulsoryPurchasePeriod", "blockingPeriod", "claimPeriod", "depositorySuspensionPeriodForBookEntryTransfer",
		"depositorySuspensionPeriodForDepositAtAgent", "depositorySuspensionPeriodForDeposit", "depositorySuspensionPeriodForPledge", "depositorySuspensionPeriodForSegregation", "depositorySuspensionPeriodForWithdrawalAtAgent",
		"depositorySuspensionPeriodForWithdrawalInNomineeName", "depositorySuspensionPeriodForWithdrawalInStreetName", "bookClosurePeriod", "coDepositoriesSuspensionPeriod"})
public class CorporateActionPeriod8 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8
	 * CorporateActionPeriod8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmPriceCalculationPeriod
	 * CorporateActionPeriod10.mmPriceCalculationPeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPriceCalculationPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceCalculationPeriod;
			componentContext_lazy = () -> CorporateActionPeriod8.mmObject();
			isDerived = false;
			xmlTag = "PricClctnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceCalculationPeriod";
			definition = "Period during which the price of a security is determined.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod10.mmPriceCalculationPeriod);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};
	protected Period3Choice interestPeriod;
	/**
	 * Period during which the interest rate has been applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestPeriod
	 * InterestCalculation.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8
	 * CorporateActionPeriod8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the interest rate has been applied."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmInterestPeriod
	 * CorporateActionPeriod10.mmInterestPeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInterestPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmInterestPeriod;
			componentContext_lazy = () -> CorporateActionPeriod8.mmObject();
			isDerived = false;
			xmlTag = "IntrstPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPeriod";
			definition = "Period during which the interest rate has been applied.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod10.mmInterestPeriod);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};
	protected Period3Choice compulsoryPurchasePeriod;
	/**
	 * Period during a take-over where any outstanding equity must be purchased
	 * by the take-over company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmCompulsoryPurchasePeriod
	 * BiddingConditions.mmCompulsoryPurchasePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8
	 * CorporateActionPeriod8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmplsryPurchsPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompulsoryPurchasePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during a take-over where any outstanding equity must be purchased by the take-over company."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmCompulsoryPurchasePeriod
	 * CorporateActionPeriod10.mmCompulsoryPurchasePeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCompulsoryPurchasePeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmCompulsoryPurchasePeriod;
			componentContext_lazy = () -> CorporateActionPeriod8.mmObject();
			isDerived = false;
			xmlTag = "CmplsryPurchsPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompulsoryPurchasePeriod";
			definition = "Period during a take-over where any outstanding equity must be purchased by the take-over company.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod10.mmCompulsoryPurchasePeriod);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};
	protected Period3Choice blockingPeriod;
	/**
	 * Period during which the security is blocked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBlockingDeadline#mmBlockingPeriod
	 * SecuritiesBlockingDeadline.mmBlockingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8
	 * CorporateActionPeriod8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the security is blocked."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmBlockingPeriod
	 * CorporateActionPeriod10.mmBlockingPeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBlockingPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBlockingDeadline.mmBlockingPeriod;
			componentContext_lazy = () -> CorporateActionPeriod8.mmObject();
			isDerived = false;
			xmlTag = "BlckgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockingPeriod";
			definition = "Period during which the security is blocked.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod10.mmBlockingPeriod);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};
	protected Period3Choice claimPeriod;
	/**
	 * Period assigned by the court in a class action. It determines the
	 * client's eligible transactions that will be included in the class action
	 * and used to determine the resulting entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmClaimPeriod
	 * ClassAction.mmClaimPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8
	 * CorporateActionPeriod8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClmPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClaimPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period assigned by the court in a class action. It determines the client's eligible transactions that will be included in the class action and used to determine the resulting entitlement."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmClaimPeriod
	 * CorporateActionPeriod10.mmClaimPeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClaimPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ClassAction.mmClaimPeriod;
			componentContext_lazy = () -> CorporateActionPeriod8.mmObject();
			isDerived = false;
			xmlTag = "ClmPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClaimPeriod";
			definition = "Period assigned by the court in a class action. It determines the client's eligible transactions that will be included in the class action and used to determine the resulting entitlement.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod10.mmClaimPeriod);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};
	protected Period3Choice depositorySuspensionPeriodForBookEntryTransfer;
	/**
	 * Period defining the last date for which book entry transfers will be
	 * accepted and the date on which the suspension will be released and book
	 * entry transfer processing will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForBookEntryTransfer
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForBookEntryTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8
	 * CorporateActionPeriod8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForBookNtryTrf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForBookEntryTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which book entry transfers will be accepted and the date on which the suspension will be released and book entry transfer processing will resume."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForBookEntryTransfer
	 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForBookEntryTransfer}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepositorySuspensionPeriodForBookEntryTransfer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForBookEntryTransfer;
			componentContext_lazy = () -> CorporateActionPeriod8.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForBookNtryTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForBookEntryTransfer";
			definition = "Period defining the last date for which book entry transfers will be accepted and the date on which the suspension will be released and book entry transfer processing will resume.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod10.mmDepositorySuspensionPeriodForBookEntryTransfer);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};
	protected Period3Choice depositorySuspensionPeriodForDepositAtAgent;
	/**
	 * Period defining the last date for which deposits, into nominee name, at
	 * the agent will be accepted and the date on which the suspension will be
	 * released and deposits at agent will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForDepositAtAgent
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForDepositAtAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8
	 * CorporateActionPeriod8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForDpstAtAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForDepositAtAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which deposits, into nominee name, at the agent will be accepted and the date on which the suspension will be released and deposits at agent will resume."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForDepositAtAgent
	 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForDepositAtAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepositorySuspensionPeriodForDepositAtAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForDepositAtAgent;
			componentContext_lazy = () -> CorporateActionPeriod8.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForDpstAtAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForDepositAtAgent";
			definition = "Period defining the last date for which deposits, into nominee name, at the agent will be accepted and the date on which the suspension will be released and deposits at agent will resume.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod10.mmDepositorySuspensionPeriodForDepositAtAgent);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};
	protected Period3Choice depositorySuspensionPeriodForDeposit;
	/**
	 * Period defining the last date for which deposits will be accepted and the
	 * date on which the suspension will be released and deposits will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForDeposit
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8
	 * CorporateActionPeriod8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForDpst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which deposits will be accepted and the date on which the suspension will be released and deposits will resume."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForDeposit
	 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForDeposit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepositorySuspensionPeriodForDeposit = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForDeposit;
			componentContext_lazy = () -> CorporateActionPeriod8.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForDpst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForDeposit";
			definition = "Period defining the last date for which deposits will be accepted and the date on which the suspension will be released and deposits will resume.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod10.mmDepositorySuspensionPeriodForDeposit);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};
	protected Period3Choice depositorySuspensionPeriodForPledge;
	/**
	 * Period defining the last date for which pledges will be accepted and the
	 * date on which the suspension will be released and pledge processing will
	 * resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForPledge
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForPledge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8
	 * CorporateActionPeriod8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForPldg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForPledge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which pledges will be accepted and the date on which the suspension will be released and pledge processing will resume."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForPledge
	 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForPledge}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepositorySuspensionPeriodForPledge = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForPledge;
			componentContext_lazy = () -> CorporateActionPeriod8.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForPldg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForPledge";
			definition = "Period defining the last date for which pledges will be accepted and the date on which the suspension will be released and pledge processing will resume.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod10.mmDepositorySuspensionPeriodForPledge);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};
	protected Period3Choice depositorySuspensionPeriodForSegregation;
	/**
	 * Period defining the last date for which intra-position balances can be
	 * segregated and the date on which the suspension will be released and the
	 * ability to segregate intra-position balances will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForSegregation
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForSegregation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8
	 * CorporateActionPeriod8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForSgrtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForSegregation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which intra-position balances can be segregated and the date on which the suspension will be released and the ability to segregate intra-position balances will resume."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForSegregation
	 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForSegregation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepositorySuspensionPeriodForSegregation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForSegregation;
			componentContext_lazy = () -> CorporateActionPeriod8.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForSgrtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForSegregation";
			definition = "Period defining the last date for which intra-position balances can be segregated and the date on which the suspension will be released and the ability to segregate intra-position balances will resume.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod10.mmDepositorySuspensionPeriodForSegregation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};
	protected Period3Choice depositorySuspensionPeriodForWithdrawalAtAgent;
	/**
	 * Period defining the last date for which withdrawals, from nominee name at
	 * the agent will be accepted and the date on which the suspension will be
	 * released and withdrawals at agent processing will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalAtAgent
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalAtAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8
	 * CorporateActionPeriod8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForWdrwlAtAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForWithdrawalAtAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which withdrawals, from nominee name at the agent will be accepted and the date on which the suspension will be released and withdrawals at agent processing will resume."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForWithdrawalAtAgent
	 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForWithdrawalAtAgent}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepositorySuspensionPeriodForWithdrawalAtAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalAtAgent;
			componentContext_lazy = () -> CorporateActionPeriod8.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForWdrwlAtAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalAtAgent";
			definition = "Period defining the last date for which withdrawals, from nominee name at the agent will be accepted and the date on which the suspension will be released and withdrawals at agent processing will resume.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod10.mmDepositorySuspensionPeriodForWithdrawalAtAgent);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};
	protected Period3Choice depositorySuspensionPeriodForWithdrawalInNomineeName;
	/**
	 * Period defining the last date for which physical withdrawals in the
	 * nominee's name will be accepted and the date on which the suspension will
	 * be released and physical withdrawals in the nominee's name will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalInNomineeName
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8
	 * CorporateActionPeriod8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForWdrwlInNmneeNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForWithdrawalInNomineeName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which physical withdrawals in the nominee's name will be accepted and the date on which the suspension will be released and physical withdrawals in the nominee's name will resume."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForWithdrawalInNomineeName
	 * CorporateActionPeriod10.
	 * mmDepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepositorySuspensionPeriodForWithdrawalInNomineeName = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInNomineeName;
			componentContext_lazy = () -> CorporateActionPeriod8.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForWdrwlInNmneeNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalInNomineeName";
			definition = "Period defining the last date for which physical withdrawals in the nominee's name will be accepted and the date on which the suspension will be released and physical withdrawals in the nominee's name will resume.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod10.mmDepositorySuspensionPeriodForWithdrawalInNomineeName);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};
	protected Period3Choice depositorySuspensionPeriodForWithdrawalInStreetName;
	/**
	 * Period defining the last date on which withdrawal requests in street
	 * name's will be accepted on the event security and the date on which the
	 * suspension will be released and withdrawal in street name's processing on
	 * the event security will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalInStreetName
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8
	 * CorporateActionPeriod8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForWdrwlInStrtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForWithdrawalInStreetName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date on which withdrawal requests in street name's will be accepted on the event security and the date on which the suspension will be released and withdrawal in street name's processing on the event security will resume."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForWithdrawalInStreetName
	 * CorporateActionPeriod10.
	 * mmDepositorySuspensionPeriodForWithdrawalInStreetName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepositorySuspensionPeriodForWithdrawalInStreetName = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInStreetName;
			componentContext_lazy = () -> CorporateActionPeriod8.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForWdrwlInStrtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalInStreetName";
			definition = "Period defining the last date on which withdrawal requests in street name's will be accepted on the event security and the date on which the suspension will be released and withdrawal in street name's processing on the event security will resume.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod10.mmDepositorySuspensionPeriodForWithdrawalInStreetName);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};
	protected Period3Choice bookClosurePeriod;
	/**
	 * Period defining the last date on which shareholder registration will be
	 * accepted by the issuer and the date on which shareholder registration
	 * will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBookClosurePeriod
	 * CorporateActionEvent.mmBookClosurePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8
	 * CorporateActionPeriod8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BookClsrPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookClosurePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date on which shareholder registration will be accepted by the issuer and the date on which shareholder registration will resume."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmBookClosurePeriod
	 * CorporateActionPeriod10.mmBookClosurePeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBookClosurePeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmBookClosurePeriod;
			componentContext_lazy = () -> CorporateActionPeriod8.mmObject();
			isDerived = false;
			xmlTag = "BookClsrPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookClosurePeriod";
			definition = "Period defining the last date on which shareholder registration will be accepted by the issuer and the date on which shareholder registration will resume.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod10.mmBookClosurePeriod);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};
	protected Period3Choice coDepositoriesSuspensionPeriod;
	/**
	 * Period during which the settlement activities at the co-depositories are
	 * suspended in order to stabilise the holdings at the CSD.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Period3Choice Period3Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmCoDepositoriesSuspensionPeriod
	 * SuspensionPeriod.mmCoDepositoriesSuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8
	 * CorporateActionPeriod8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CoDpstriesSspnsnPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoDepositoriesSuspensionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the settlement activities at the co-depositories are suspended in order to stabilise the holdings at the CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmCoDepositoriesSuspensionPeriod
	 * CorporateActionPeriod10.mmCoDepositoriesSuspensionPeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCoDepositoriesSuspensionPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmCoDepositoriesSuspensionPeriod;
			componentContext_lazy = () -> CorporateActionPeriod8.mmObject();
			isDerived = false;
			xmlTag = "CoDpstriesSspnsnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoDepositoriesSuspensionPeriod";
			definition = "Period during which the settlement activities at the co-depositories are suspended in order to stabilise the holdings at the CSD.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod10.mmCoDepositoriesSuspensionPeriod);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period3Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionPeriod8.mmPriceCalculationPeriod, CorporateActionPeriod8.mmInterestPeriod, CorporateActionPeriod8.mmCompulsoryPurchasePeriod, CorporateActionPeriod8.mmBlockingPeriod,
						CorporateActionPeriod8.mmClaimPeriod, CorporateActionPeriod8.mmDepositorySuspensionPeriodForBookEntryTransfer, CorporateActionPeriod8.mmDepositorySuspensionPeriodForDepositAtAgent,
						CorporateActionPeriod8.mmDepositorySuspensionPeriodForDeposit, CorporateActionPeriod8.mmDepositorySuspensionPeriodForPledge, CorporateActionPeriod8.mmDepositorySuspensionPeriodForSegregation,
						CorporateActionPeriod8.mmDepositorySuspensionPeriodForWithdrawalAtAgent, CorporateActionPeriod8.mmDepositorySuspensionPeriodForWithdrawalInNomineeName,
						CorporateActionPeriod8.mmDepositorySuspensionPeriodForWithdrawalInStreetName, CorporateActionPeriod8.mmBookClosurePeriod, CorporateActionPeriod8.mmCoDepositoriesSuspensionPeriod);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPeriod8";
				definition = "Specifies periods of a corporate action.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod10.mmObject());
				previousVersion_lazy = () -> CorporateActionPeriod6.mmObject();
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

	@XmlElement(name = "IntrstPrd")
	public Period3Choice getInterestPeriod() {
		return interestPeriod;
	}

	public void setInterestPeriod(Period3Choice interestPeriod) {
		this.interestPeriod = interestPeriod;
	}

	@XmlElement(name = "CmplsryPurchsPrd")
	public Period3Choice getCompulsoryPurchasePeriod() {
		return compulsoryPurchasePeriod;
	}

	public void setCompulsoryPurchasePeriod(Period3Choice compulsoryPurchasePeriod) {
		this.compulsoryPurchasePeriod = compulsoryPurchasePeriod;
	}

	@XmlElement(name = "BlckgPrd")
	public Period3Choice getBlockingPeriod() {
		return blockingPeriod;
	}

	public void setBlockingPeriod(Period3Choice blockingPeriod) {
		this.blockingPeriod = blockingPeriod;
	}

	@XmlElement(name = "ClmPrd")
	public Period3Choice getClaimPeriod() {
		return claimPeriod;
	}

	public void setClaimPeriod(Period3Choice claimPeriod) {
		this.claimPeriod = claimPeriod;
	}

	@XmlElement(name = "DpstrySspnsnPrdForBookNtryTrf")
	public Period3Choice getDepositorySuspensionPeriodForBookEntryTransfer() {
		return depositorySuspensionPeriodForBookEntryTransfer;
	}

	public void setDepositorySuspensionPeriodForBookEntryTransfer(Period3Choice depositorySuspensionPeriodForBookEntryTransfer) {
		this.depositorySuspensionPeriodForBookEntryTransfer = depositorySuspensionPeriodForBookEntryTransfer;
	}

	@XmlElement(name = "DpstrySspnsnPrdForDpstAtAgt")
	public Period3Choice getDepositorySuspensionPeriodForDepositAtAgent() {
		return depositorySuspensionPeriodForDepositAtAgent;
	}

	public void setDepositorySuspensionPeriodForDepositAtAgent(Period3Choice depositorySuspensionPeriodForDepositAtAgent) {
		this.depositorySuspensionPeriodForDepositAtAgent = depositorySuspensionPeriodForDepositAtAgent;
	}

	@XmlElement(name = "DpstrySspnsnPrdForDpst")
	public Period3Choice getDepositorySuspensionPeriodForDeposit() {
		return depositorySuspensionPeriodForDeposit;
	}

	public void setDepositorySuspensionPeriodForDeposit(Period3Choice depositorySuspensionPeriodForDeposit) {
		this.depositorySuspensionPeriodForDeposit = depositorySuspensionPeriodForDeposit;
	}

	@XmlElement(name = "DpstrySspnsnPrdForPldg")
	public Period3Choice getDepositorySuspensionPeriodForPledge() {
		return depositorySuspensionPeriodForPledge;
	}

	public void setDepositorySuspensionPeriodForPledge(Period3Choice depositorySuspensionPeriodForPledge) {
		this.depositorySuspensionPeriodForPledge = depositorySuspensionPeriodForPledge;
	}

	@XmlElement(name = "DpstrySspnsnPrdForSgrtn")
	public Period3Choice getDepositorySuspensionPeriodForSegregation() {
		return depositorySuspensionPeriodForSegregation;
	}

	public void setDepositorySuspensionPeriodForSegregation(Period3Choice depositorySuspensionPeriodForSegregation) {
		this.depositorySuspensionPeriodForSegregation = depositorySuspensionPeriodForSegregation;
	}

	@XmlElement(name = "DpstrySspnsnPrdForWdrwlAtAgt")
	public Period3Choice getDepositorySuspensionPeriodForWithdrawalAtAgent() {
		return depositorySuspensionPeriodForWithdrawalAtAgent;
	}

	public void setDepositorySuspensionPeriodForWithdrawalAtAgent(Period3Choice depositorySuspensionPeriodForWithdrawalAtAgent) {
		this.depositorySuspensionPeriodForWithdrawalAtAgent = depositorySuspensionPeriodForWithdrawalAtAgent;
	}

	@XmlElement(name = "DpstrySspnsnPrdForWdrwlInNmneeNm")
	public Period3Choice getDepositorySuspensionPeriodForWithdrawalInNomineeName() {
		return depositorySuspensionPeriodForWithdrawalInNomineeName;
	}

	public void setDepositorySuspensionPeriodForWithdrawalInNomineeName(Period3Choice depositorySuspensionPeriodForWithdrawalInNomineeName) {
		this.depositorySuspensionPeriodForWithdrawalInNomineeName = depositorySuspensionPeriodForWithdrawalInNomineeName;
	}

	@XmlElement(name = "DpstrySspnsnPrdForWdrwlInStrtNm")
	public Period3Choice getDepositorySuspensionPeriodForWithdrawalInStreetName() {
		return depositorySuspensionPeriodForWithdrawalInStreetName;
	}

	public void setDepositorySuspensionPeriodForWithdrawalInStreetName(Period3Choice depositorySuspensionPeriodForWithdrawalInStreetName) {
		this.depositorySuspensionPeriodForWithdrawalInStreetName = depositorySuspensionPeriodForWithdrawalInStreetName;
	}

	@XmlElement(name = "BookClsrPrd")
	public Period3Choice getBookClosurePeriod() {
		return bookClosurePeriod;
	}

	public void setBookClosurePeriod(Period3Choice bookClosurePeriod) {
		this.bookClosurePeriod = bookClosurePeriod;
	}

	@XmlElement(name = "CoDpstriesSspnsnPrd")
	public Period3Choice getCoDepositoriesSuspensionPeriod() {
		return coDepositoriesSuspensionPeriod;
	}

	public void setCoDepositoriesSuspensionPeriod(Period3Choice coDepositoriesSuspensionPeriod) {
		this.coDepositoriesSuspensionPeriod = coDepositoriesSuspensionPeriod;
	}
}