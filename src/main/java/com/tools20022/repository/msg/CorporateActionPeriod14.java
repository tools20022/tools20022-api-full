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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.Period6Choice;
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
 * Specifies periods of a corporate action.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmPriceCalculationPeriod
 * CorporateActionPeriod14.mmPriceCalculationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmInterestPeriod
 * CorporateActionPeriod14.mmInterestPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmCompulsoryPurchasePeriod
 * CorporateActionPeriod14.mmCompulsoryPurchasePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmBlockingPeriod
 * CorporateActionPeriod14.mmBlockingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmClaimPeriod
 * CorporateActionPeriod14.mmClaimPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForBookEntryTransfer
 * CorporateActionPeriod14.mmDepositorySuspensionPeriodForBookEntryTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForDepositAtAgent
 * CorporateActionPeriod14.mmDepositorySuspensionPeriodForDepositAtAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForDeposit
 * CorporateActionPeriod14.mmDepositorySuspensionPeriodForDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForPledge
 * CorporateActionPeriod14.mmDepositorySuspensionPeriodForPledge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForSegregation
 * CorporateActionPeriod14.mmDepositorySuspensionPeriodForSegregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForWithdrawalAtAgent
 * CorporateActionPeriod14.mmDepositorySuspensionPeriodForWithdrawalAtAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForWithdrawalInNomineeName
 * CorporateActionPeriod14.
 * mmDepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForWithdrawalInStreetName
 * CorporateActionPeriod14.mmDepositorySuspensionPeriodForWithdrawalInStreetName
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmBookClosurePeriod
 * CorporateActionPeriod14.mmBookClosurePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmCoDepositoriesSuspensionPeriod
 * CorporateActionPeriod14.mmCoDepositoriesSuspensionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmSplitPeriod
 * CorporateActionPeriod14.mmSplitPeriod}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInterestPeriodRule#forCorporateActionPeriod14
 * ConstraintInterestPeriodRule.forCorporateActionPeriod14}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionPeriod14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies periods of a corporate action."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10
 * CorporateActionPeriod10}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionPeriod14", propOrder = {"priceCalculationPeriod", "interestPeriod", "compulsoryPurchasePeriod", "blockingPeriod", "claimPeriod", "depositorySuspensionPeriodForBookEntryTransfer",
		"depositorySuspensionPeriodForDepositAtAgent", "depositorySuspensionPeriodForDeposit", "depositorySuspensionPeriodForPledge", "depositorySuspensionPeriodForSegregation", "depositorySuspensionPeriodForWithdrawalAtAgent",
		"depositorySuspensionPeriodForWithdrawalInNomineeName", "depositorySuspensionPeriodForWithdrawalInStreetName", "bookClosurePeriod", "coDepositoriesSuspensionPeriod", "splitPeriod"})
public class CorporateActionPeriod14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PricClctnPrd")
	protected Period6Choice priceCalculationPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceCalculationPeriod
	 * SecuritiesPricing.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14
	 * CorporateActionPeriod14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricClctnPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a:PRIC</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmPriceCalculationPeriod
	 * CorporateActionPeriod10.mmPriceCalculationPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPriceCalculationPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceCalculationPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod14.mmObject();
			isDerived = false;
			xmlTag = "PricClctnPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a:PRIC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceCalculationPeriod";
			definition = "Period during which the price of a security is determined.";
			previousVersion_lazy = () -> CorporateActionPeriod10.mmPriceCalculationPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}
	};
	@XmlElement(name = "IntrstPrd")
	protected Period6Choice interestPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestPeriod
	 * InterestCalculation.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14
	 * CorporateActionPeriod14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a:INPE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the interest rate has been applied."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmInterestPeriod
	 * CorporateActionPeriod10.mmInterestPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInterestPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmInterestPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod14.mmObject();
			isDerived = false;
			xmlTag = "IntrstPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a:INPE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPeriod";
			definition = "Period during which the interest rate has been applied.";
			previousVersion_lazy = () -> CorporateActionPeriod10.mmInterestPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}
	};
	@XmlElement(name = "CmplsryPurchsPrd")
	protected Period6Choice compulsoryPurchasePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmCompulsoryPurchasePeriod
	 * BiddingConditions.mmCompulsoryPurchasePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14
	 * CorporateActionPeriod14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmplsryPurchsPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::CSPD</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmCompulsoryPurchasePeriod
	 * CorporateActionPeriod10.mmCompulsoryPurchasePeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCompulsoryPurchasePeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmCompulsoryPurchasePeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod14.mmObject();
			isDerived = false;
			xmlTag = "CmplsryPurchsPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::CSPD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompulsoryPurchasePeriod";
			definition = "Period during a take-over where any outstanding equity must be purchased by the take-over company.";
			previousVersion_lazy = () -> CorporateActionPeriod10.mmCompulsoryPurchasePeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}
	};
	@XmlElement(name = "BlckgPrd")
	protected Period6Choice blockingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBlockingDeadline#mmBlockingPeriod
	 * SecuritiesBlockingDeadline.mmBlockingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14
	 * CorporateActionPeriod14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::BLOK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the security is blocked."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmBlockingPeriod
	 * CorporateActionPeriod10.mmBlockingPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBlockingPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBlockingDeadline.mmBlockingPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod14.mmObject();
			isDerived = false;
			xmlTag = "BlckgPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::BLOK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockingPeriod";
			definition = "Period during which the security is blocked.";
			previousVersion_lazy = () -> CorporateActionPeriod10.mmBlockingPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}
	};
	@XmlElement(name = "ClmPrd")
	protected Period6Choice claimPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmClaimPeriod
	 * ClassAction.mmClaimPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14
	 * CorporateActionPeriod14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClmPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::CLCP</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmClaimPeriod
	 * CorporateActionPeriod10.mmClaimPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClaimPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ClassAction.mmClaimPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod14.mmObject();
			isDerived = false;
			xmlTag = "ClmPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::CLCP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClaimPeriod";
			definition = "Period assigned by the court in a class action. It determines the client's eligible transactions that will be included in the class action and used to determine the resulting entitlement.";
			previousVersion_lazy = () -> CorporateActionPeriod10.mmClaimPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}
	};
	@XmlElement(name = "DpstrySspnsnPrdForBookNtryTrf")
	protected Period6Choice depositorySuspensionPeriodForBookEntryTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForBookEntryTransfer
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForBookEntryTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14
	 * CorporateActionPeriod14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForBookNtryTrf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::DSBT</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForBookEntryTransfer
	 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForBookEntryTransfer}
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepositorySuspensionPeriodForBookEntryTransfer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForBookEntryTransfer;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod14.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForBookNtryTrf";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSBT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForBookEntryTransfer";
			definition = "Period defining the last date for which book entry transfers will be accepted and the date on which the suspension will be released and book entry transfer processing will resume.";
			previousVersion_lazy = () -> CorporateActionPeriod10.mmDepositorySuspensionPeriodForBookEntryTransfer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}
	};
	@XmlElement(name = "DpstrySspnsnPrdForDpstAtAgt")
	protected Period6Choice depositorySuspensionPeriodForDepositAtAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForDepositAtAgent
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForDepositAtAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14
	 * CorporateActionPeriod14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForDpstAtAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::DSDA</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForDepositAtAgent
	 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForDepositAtAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepositorySuspensionPeriodForDepositAtAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForDepositAtAgent;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod14.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForDpstAtAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSDA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForDepositAtAgent";
			definition = "Period defining the last date for which deposits, into nominee name, at the agent will be accepted and the date on which the suspension will be released and deposits at agent will resume.";
			previousVersion_lazy = () -> CorporateActionPeriod10.mmDepositorySuspensionPeriodForDepositAtAgent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}
	};
	@XmlElement(name = "DpstrySspnsnPrdForDpst")
	protected Period6Choice depositorySuspensionPeriodForDeposit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForDeposit
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14
	 * CorporateActionPeriod14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForDpst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::DSDE</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForDeposit
	 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForDeposit}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepositorySuspensionPeriodForDeposit = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForDeposit;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod14.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForDpst";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSDE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForDeposit";
			definition = "Period defining the last date for which deposits will be accepted and the date on which the suspension will be released and deposits will resume.";
			previousVersion_lazy = () -> CorporateActionPeriod10.mmDepositorySuspensionPeriodForDeposit;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}
	};
	@XmlElement(name = "DpstrySspnsnPrdForPldg")
	protected Period6Choice depositorySuspensionPeriodForPledge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForPledge
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForPledge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14
	 * CorporateActionPeriod14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForPldg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::DSPL</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForPledge
	 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForPledge}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepositorySuspensionPeriodForPledge = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForPledge;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod14.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForPldg";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSPL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForPledge";
			definition = "Period defining the last date for which pledges will be accepted and the date on which the suspension will be released and pledge processing will resume.";
			previousVersion_lazy = () -> CorporateActionPeriod10.mmDepositorySuspensionPeriodForPledge;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}
	};
	@XmlElement(name = "DpstrySspnsnPrdForSgrtn")
	protected Period6Choice depositorySuspensionPeriodForSegregation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForSegregation
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForSegregation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14
	 * CorporateActionPeriod14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForSgrtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::DSSE</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForSegregation
	 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForSegregation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepositorySuspensionPeriodForSegregation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForSegregation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod14.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForSgrtn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSSE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForSegregation";
			definition = "Period defining the last date for which intra-position balances can be segregated and the date on which the suspension will be released and the ability to segregate intra-position balances will resume.";
			previousVersion_lazy = () -> CorporateActionPeriod10.mmDepositorySuspensionPeriodForSegregation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}
	};
	@XmlElement(name = "DpstrySspnsnPrdForWdrwlAtAgt")
	protected Period6Choice depositorySuspensionPeriodForWithdrawalAtAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalAtAgent
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalAtAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14
	 * CorporateActionPeriod14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForWdrwlAtAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::DSWA</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForWithdrawalAtAgent
	 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForWithdrawalAtAgent}
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepositorySuspensionPeriodForWithdrawalAtAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalAtAgent;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod14.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForWdrwlAtAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSWA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalAtAgent";
			definition = "Period defining the last date for which withdrawals, from nominee name at the agent will be accepted and the date on which the suspension will be released and withdrawals at agent processing will resume.";
			previousVersion_lazy = () -> CorporateActionPeriod10.mmDepositorySuspensionPeriodForWithdrawalAtAgent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}
	};
	@XmlElement(name = "DpstrySspnsnPrdForWdrwlInNmneeNm")
	protected Period6Choice depositorySuspensionPeriodForWithdrawalInNomineeName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalInNomineeName
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14
	 * CorporateActionPeriod14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForWdrwlInNmneeNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::DSWN</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForWithdrawalInNomineeName
	 * CorporateActionPeriod10.
	 * mmDepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepositorySuspensionPeriodForWithdrawalInNomineeName = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInNomineeName;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod14.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForWdrwlInNmneeNm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSWN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalInNomineeName";
			definition = "Period defining the last date for which physical withdrawals in the nominee's name will be accepted and the date on which the suspension will be released and physical withdrawals in the nominee's name will resume.";
			previousVersion_lazy = () -> CorporateActionPeriod10.mmDepositorySuspensionPeriodForWithdrawalInNomineeName;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}
	};
	@XmlElement(name = "DpstrySspnsnPrdForWdrwlInStrtNm")
	protected Period6Choice depositorySuspensionPeriodForWithdrawalInStreetName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalInStreetName
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14
	 * CorporateActionPeriod14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForWdrwlInStrtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::DSWS</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForWithdrawalInStreetName
	 * CorporateActionPeriod10.
	 * mmDepositorySuspensionPeriodForWithdrawalInStreetName}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepositorySuspensionPeriodForWithdrawalInStreetName = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInStreetName;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod14.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForWdrwlInStrtNm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSWS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalInStreetName";
			definition = "Period defining the last date on which withdrawal requests in street name's will be accepted on the event security and the date on which the suspension will be released and withdrawal in street name's processing on the event security will resume.";
			previousVersion_lazy = () -> CorporateActionPeriod10.mmDepositorySuspensionPeriodForWithdrawalInStreetName;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}
	};
	@XmlElement(name = "BookClsrPrd")
	protected Period6Choice bookClosurePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBookClosurePeriod
	 * CorporateActionEvent.mmBookClosurePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14
	 * CorporateActionPeriod14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BookClsrPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::BOCL</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmBookClosurePeriod
	 * CorporateActionPeriod10.mmBookClosurePeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBookClosurePeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmBookClosurePeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod14.mmObject();
			isDerived = false;
			xmlTag = "BookClsrPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::BOCL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookClosurePeriod";
			definition = "Period defining the last date on which shareholder registration will be accepted by the issuer and the date on which shareholder registration will resume.";
			previousVersion_lazy = () -> CorporateActionPeriod10.mmBookClosurePeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}
	};
	@XmlElement(name = "CoDpstriesSspnsnPrd")
	protected Period6Choice coDepositoriesSuspensionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Period6Choice Period6Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmCoDepositoriesSuspensionPeriod
	 * SuspensionPeriod.mmCoDepositoriesSuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14
	 * CorporateActionPeriod14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmCoDepositoriesSuspensionPeriod
	 * CorporateActionPeriod10.mmCoDepositoriesSuspensionPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCoDepositoriesSuspensionPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmCoDepositoriesSuspensionPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod14.mmObject();
			isDerived = false;
			xmlTag = "CoDpstriesSspnsnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoDepositoriesSuspensionPeriod";
			definition = "Period during which the settlement activities at the co-depositories are suspended in order to stabilise the holdings at the CSD.";
			previousVersion_lazy = () -> CorporateActionPeriod10.mmCoDepositoriesSuspensionPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period6Choice.mmObject();
		}
	};
	@XmlElement(name = "SpltPrd")
	protected Period6Choice splitPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSplitPeriod
	 * BasicSecuritiesRegistration.mmSplitPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14
	 * CorporateActionPeriod14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpltPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which a physical certificate can be split."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmSplitPeriod
	 * CorporateActionPeriod10.mmSplitPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSplitPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BasicSecuritiesRegistration.mmSplitPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod14.mmObject();
			isDerived = false;
			xmlTag = "SpltPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitPeriod";
			definition = "Period during which a physical certificate can be split.";
			previousVersion_lazy = () -> CorporateActionPeriod10.mmSplitPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriod14.mmPriceCalculationPeriod, com.tools20022.repository.msg.CorporateActionPeriod14.mmInterestPeriod,
						com.tools20022.repository.msg.CorporateActionPeriod14.mmCompulsoryPurchasePeriod, com.tools20022.repository.msg.CorporateActionPeriod14.mmBlockingPeriod,
						com.tools20022.repository.msg.CorporateActionPeriod14.mmClaimPeriod, com.tools20022.repository.msg.CorporateActionPeriod14.mmDepositorySuspensionPeriodForBookEntryTransfer,
						com.tools20022.repository.msg.CorporateActionPeriod14.mmDepositorySuspensionPeriodForDepositAtAgent, com.tools20022.repository.msg.CorporateActionPeriod14.mmDepositorySuspensionPeriodForDeposit,
						com.tools20022.repository.msg.CorporateActionPeriod14.mmDepositorySuspensionPeriodForPledge, com.tools20022.repository.msg.CorporateActionPeriod14.mmDepositorySuspensionPeriodForSegregation,
						com.tools20022.repository.msg.CorporateActionPeriod14.mmDepositorySuspensionPeriodForWithdrawalAtAgent, com.tools20022.repository.msg.CorporateActionPeriod14.mmDepositorySuspensionPeriodForWithdrawalInNomineeName,
						com.tools20022.repository.msg.CorporateActionPeriod14.mmDepositorySuspensionPeriodForWithdrawalInStreetName, com.tools20022.repository.msg.CorporateActionPeriod14.mmBookClosurePeriod,
						com.tools20022.repository.msg.CorporateActionPeriod14.mmCoDepositoriesSuspensionPeriod, com.tools20022.repository.msg.CorporateActionPeriod14.mmSplitPeriod);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInterestPeriodRule.forCorporateActionPeriod14);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPeriod14";
				definition = "Specifies periods of a corporate action.";
				previousVersion_lazy = () -> CorporateActionPeriod10.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Period6Choice> getPriceCalculationPeriod() {
		return priceCalculationPeriod == null ? Optional.empty() : Optional.of(priceCalculationPeriod);
	}

	public CorporateActionPeriod14 setPriceCalculationPeriod(Period6Choice priceCalculationPeriod) {
		this.priceCalculationPeriod = priceCalculationPeriod;
		return this;
	}

	public Optional<Period6Choice> getInterestPeriod() {
		return interestPeriod == null ? Optional.empty() : Optional.of(interestPeriod);
	}

	public CorporateActionPeriod14 setInterestPeriod(Period6Choice interestPeriod) {
		this.interestPeriod = interestPeriod;
		return this;
	}

	public Optional<Period6Choice> getCompulsoryPurchasePeriod() {
		return compulsoryPurchasePeriod == null ? Optional.empty() : Optional.of(compulsoryPurchasePeriod);
	}

	public CorporateActionPeriod14 setCompulsoryPurchasePeriod(Period6Choice compulsoryPurchasePeriod) {
		this.compulsoryPurchasePeriod = compulsoryPurchasePeriod;
		return this;
	}

	public Optional<Period6Choice> getBlockingPeriod() {
		return blockingPeriod == null ? Optional.empty() : Optional.of(blockingPeriod);
	}

	public CorporateActionPeriod14 setBlockingPeriod(Period6Choice blockingPeriod) {
		this.blockingPeriod = blockingPeriod;
		return this;
	}

	public Optional<Period6Choice> getClaimPeriod() {
		return claimPeriod == null ? Optional.empty() : Optional.of(claimPeriod);
	}

	public CorporateActionPeriod14 setClaimPeriod(Period6Choice claimPeriod) {
		this.claimPeriod = claimPeriod;
		return this;
	}

	public Optional<Period6Choice> getDepositorySuspensionPeriodForBookEntryTransfer() {
		return depositorySuspensionPeriodForBookEntryTransfer == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForBookEntryTransfer);
	}

	public CorporateActionPeriod14 setDepositorySuspensionPeriodForBookEntryTransfer(Period6Choice depositorySuspensionPeriodForBookEntryTransfer) {
		this.depositorySuspensionPeriodForBookEntryTransfer = depositorySuspensionPeriodForBookEntryTransfer;
		return this;
	}

	public Optional<Period6Choice> getDepositorySuspensionPeriodForDepositAtAgent() {
		return depositorySuspensionPeriodForDepositAtAgent == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForDepositAtAgent);
	}

	public CorporateActionPeriod14 setDepositorySuspensionPeriodForDepositAtAgent(Period6Choice depositorySuspensionPeriodForDepositAtAgent) {
		this.depositorySuspensionPeriodForDepositAtAgent = depositorySuspensionPeriodForDepositAtAgent;
		return this;
	}

	public Optional<Period6Choice> getDepositorySuspensionPeriodForDeposit() {
		return depositorySuspensionPeriodForDeposit == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForDeposit);
	}

	public CorporateActionPeriod14 setDepositorySuspensionPeriodForDeposit(Period6Choice depositorySuspensionPeriodForDeposit) {
		this.depositorySuspensionPeriodForDeposit = depositorySuspensionPeriodForDeposit;
		return this;
	}

	public Optional<Period6Choice> getDepositorySuspensionPeriodForPledge() {
		return depositorySuspensionPeriodForPledge == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForPledge);
	}

	public CorporateActionPeriod14 setDepositorySuspensionPeriodForPledge(Period6Choice depositorySuspensionPeriodForPledge) {
		this.depositorySuspensionPeriodForPledge = depositorySuspensionPeriodForPledge;
		return this;
	}

	public Optional<Period6Choice> getDepositorySuspensionPeriodForSegregation() {
		return depositorySuspensionPeriodForSegregation == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForSegregation);
	}

	public CorporateActionPeriod14 setDepositorySuspensionPeriodForSegregation(Period6Choice depositorySuspensionPeriodForSegregation) {
		this.depositorySuspensionPeriodForSegregation = depositorySuspensionPeriodForSegregation;
		return this;
	}

	public Optional<Period6Choice> getDepositorySuspensionPeriodForWithdrawalAtAgent() {
		return depositorySuspensionPeriodForWithdrawalAtAgent == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForWithdrawalAtAgent);
	}

	public CorporateActionPeriod14 setDepositorySuspensionPeriodForWithdrawalAtAgent(Period6Choice depositorySuspensionPeriodForWithdrawalAtAgent) {
		this.depositorySuspensionPeriodForWithdrawalAtAgent = depositorySuspensionPeriodForWithdrawalAtAgent;
		return this;
	}

	public Optional<Period6Choice> getDepositorySuspensionPeriodForWithdrawalInNomineeName() {
		return depositorySuspensionPeriodForWithdrawalInNomineeName == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForWithdrawalInNomineeName);
	}

	public CorporateActionPeriod14 setDepositorySuspensionPeriodForWithdrawalInNomineeName(Period6Choice depositorySuspensionPeriodForWithdrawalInNomineeName) {
		this.depositorySuspensionPeriodForWithdrawalInNomineeName = depositorySuspensionPeriodForWithdrawalInNomineeName;
		return this;
	}

	public Optional<Period6Choice> getDepositorySuspensionPeriodForWithdrawalInStreetName() {
		return depositorySuspensionPeriodForWithdrawalInStreetName == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForWithdrawalInStreetName);
	}

	public CorporateActionPeriod14 setDepositorySuspensionPeriodForWithdrawalInStreetName(Period6Choice depositorySuspensionPeriodForWithdrawalInStreetName) {
		this.depositorySuspensionPeriodForWithdrawalInStreetName = depositorySuspensionPeriodForWithdrawalInStreetName;
		return this;
	}

	public Optional<Period6Choice> getBookClosurePeriod() {
		return bookClosurePeriod == null ? Optional.empty() : Optional.of(bookClosurePeriod);
	}

	public CorporateActionPeriod14 setBookClosurePeriod(Period6Choice bookClosurePeriod) {
		this.bookClosurePeriod = bookClosurePeriod;
		return this;
	}

	public Optional<Period6Choice> getCoDepositoriesSuspensionPeriod() {
		return coDepositoriesSuspensionPeriod == null ? Optional.empty() : Optional.of(coDepositoriesSuspensionPeriod);
	}

	public CorporateActionPeriod14 setCoDepositoriesSuspensionPeriod(Period6Choice coDepositoriesSuspensionPeriod) {
		this.coDepositoriesSuspensionPeriod = coDepositoriesSuspensionPeriod;
		return this;
	}

	public Optional<Period6Choice> getSplitPeriod() {
		return splitPeriod == null ? Optional.empty() : Optional.of(splitPeriod);
	}

	public CorporateActionPeriod14 setSplitPeriod(Period6Choice splitPeriod) {
		this.splitPeriod = splitPeriod;
		return this;
	}
}