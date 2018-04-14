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
import com.tools20022.repository.choice.Period3Choice;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmPriceCalculationPeriod
 * CorporateActionPeriod10.mmPriceCalculationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmInterestPeriod
 * CorporateActionPeriod10.mmInterestPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmCompulsoryPurchasePeriod
 * CorporateActionPeriod10.mmCompulsoryPurchasePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmBlockingPeriod
 * CorporateActionPeriod10.mmBlockingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmClaimPeriod
 * CorporateActionPeriod10.mmClaimPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForBookEntryTransfer
 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForBookEntryTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForDepositAtAgent
 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForDepositAtAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForDeposit
 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForPledge
 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForPledge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForSegregation
 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForSegregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForWithdrawalAtAgent
 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForWithdrawalAtAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForWithdrawalInNomineeName
 * CorporateActionPeriod10.
 * mmDepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForWithdrawalInStreetName
 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForWithdrawalInStreetName
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmBookClosurePeriod
 * CorporateActionPeriod10.mmBookClosurePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmCoDepositoriesSuspensionPeriod
 * CorporateActionPeriod10.mmCoDepositoriesSuspensionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmSplitPeriod
 * CorporateActionPeriod10.mmSplitPeriod}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionPeriod10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies periods of a corporate action."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInterestPeriodRule#forCorporateActionPeriod10
 * ConstraintInterestPeriodRule.forCorporateActionPeriod10}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPeriod14
 * CorporateActionPeriod14}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8
 * CorporateActionPeriod8}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionPeriod10", propOrder = {"priceCalculationPeriod", "interestPeriod", "compulsoryPurchasePeriod", "blockingPeriod", "claimPeriod", "depositorySuspensionPeriodForBookEntryTransfer",
		"depositorySuspensionPeriodForDepositAtAgent", "depositorySuspensionPeriodForDeposit", "depositorySuspensionPeriodForPledge", "depositorySuspensionPeriodForSegregation", "depositorySuspensionPeriodForWithdrawalAtAgent",
		"depositorySuspensionPeriodForWithdrawalInNomineeName", "depositorySuspensionPeriodForWithdrawalInStreetName", "bookClosurePeriod", "coDepositoriesSuspensionPeriod", "splitPeriod"})
public class CorporateActionPeriod10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PricClctnPrd")
	protected Period3Choice priceCalculationPeriod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10
	 * CorporateActionPeriod10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricClctnPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceCalculationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the price of a security is determined."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a:PRIC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmPriceCalculationPeriod
	 * CorporateActionPeriod14.mmPriceCalculationPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmPriceCalculationPeriod
	 * CorporateActionPeriod8.mmPriceCalculationPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>> mmPriceCalculationPeriod = new MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceCalculationPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod10.mmObject();
			isDerived = false;
			xmlTag = "PricClctnPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a:PRIC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceCalculationPeriod";
			definition = "Period during which the price of a security is determined.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod14.mmPriceCalculationPeriod);
			previousVersion_lazy = () -> CorporateActionPeriod8.mmPriceCalculationPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod10 obj) {
			return obj.getPriceCalculationPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod10 obj, Optional<Period3Choice> value) {
			obj.setPriceCalculationPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstPrd")
	protected Period3Choice interestPeriod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10
	 * CorporateActionPeriod10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the interest rate has been applied."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a:INPE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmInterestPeriod
	 * CorporateActionPeriod14.mmInterestPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmInterestPeriod
	 * CorporateActionPeriod8.mmInterestPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>> mmInterestPeriod = new MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmInterestPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod10.mmObject();
			isDerived = false;
			xmlTag = "IntrstPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a:INPE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPeriod";
			definition = "Period during which the interest rate has been applied.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod14.mmInterestPeriod);
			previousVersion_lazy = () -> CorporateActionPeriod8.mmInterestPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod10 obj) {
			return obj.getInterestPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod10 obj, Optional<Period3Choice> value) {
			obj.setInterestPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "CmplsryPurchsPrd")
	protected Period3Choice compulsoryPurchasePeriod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10
	 * CorporateActionPeriod10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmplsryPurchsPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompulsoryPurchasePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during a take-over where any outstanding equity must be purchased by the take-over company."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::CSPD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmCompulsoryPurchasePeriod
	 * CorporateActionPeriod14.mmCompulsoryPurchasePeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmCompulsoryPurchasePeriod
	 * CorporateActionPeriod8.mmCompulsoryPurchasePeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>> mmCompulsoryPurchasePeriod = new MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmCompulsoryPurchasePeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod10.mmObject();
			isDerived = false;
			xmlTag = "CmplsryPurchsPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::CSPD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompulsoryPurchasePeriod";
			definition = "Period during a take-over where any outstanding equity must be purchased by the take-over company.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod14.mmCompulsoryPurchasePeriod);
			previousVersion_lazy = () -> CorporateActionPeriod8.mmCompulsoryPurchasePeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod10 obj) {
			return obj.getCompulsoryPurchasePeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod10 obj, Optional<Period3Choice> value) {
			obj.setCompulsoryPurchasePeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "BlckgPrd")
	protected Period3Choice blockingPeriod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10
	 * CorporateActionPeriod10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckgPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the security is blocked."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::BLOK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmBlockingPeriod
	 * CorporateActionPeriod14.mmBlockingPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmBlockingPeriod
	 * CorporateActionPeriod8.mmBlockingPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>> mmBlockingPeriod = new MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBlockingDeadline.mmBlockingPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod10.mmObject();
			isDerived = false;
			xmlTag = "BlckgPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::BLOK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockingPeriod";
			definition = "Period during which the security is blocked.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod14.mmBlockingPeriod);
			previousVersion_lazy = () -> CorporateActionPeriod8.mmBlockingPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod10 obj) {
			return obj.getBlockingPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod10 obj, Optional<Period3Choice> value) {
			obj.setBlockingPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "ClmPrd")
	protected Period3Choice claimPeriod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10
	 * CorporateActionPeriod10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClmPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClaimPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period assigned by the court in a class action. It determines the client's eligible transactions that will be included in the class action and used to determine the resulting entitlement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::CLCP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmClaimPeriod
	 * CorporateActionPeriod14.mmClaimPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmClaimPeriod
	 * CorporateActionPeriod8.mmClaimPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>> mmClaimPeriod = new MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> ClassAction.mmClaimPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod10.mmObject();
			isDerived = false;
			xmlTag = "ClmPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::CLCP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClaimPeriod";
			definition = "Period assigned by the court in a class action. It determines the client's eligible transactions that will be included in the class action and used to determine the resulting entitlement.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod14.mmClaimPeriod);
			previousVersion_lazy = () -> CorporateActionPeriod8.mmClaimPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod10 obj) {
			return obj.getClaimPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod10 obj, Optional<Period3Choice> value) {
			obj.setClaimPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "DpstrySspnsnPrdForBookNtryTrf")
	protected Period3Choice depositorySuspensionPeriodForBookEntryTransfer;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10
	 * CorporateActionPeriod10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForBookNtryTrf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForBookEntryTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which book entry transfers will be accepted and the date on which the suspension will be released and book entry transfer processing will resume."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::DSBT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForBookEntryTransfer
	 * CorporateActionPeriod14.mmDepositorySuspensionPeriodForBookEntryTransfer}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForBookEntryTransfer
	 * CorporateActionPeriod8.mmDepositorySuspensionPeriodForBookEntryTransfer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>> mmDepositorySuspensionPeriodForBookEntryTransfer = new MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForBookEntryTransfer;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod10.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForBookNtryTrf";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSBT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForBookEntryTransfer";
			definition = "Period defining the last date for which book entry transfers will be accepted and the date on which the suspension will be released and book entry transfer processing will resume.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod14.mmDepositorySuspensionPeriodForBookEntryTransfer);
			previousVersion_lazy = () -> CorporateActionPeriod8.mmDepositorySuspensionPeriodForBookEntryTransfer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod10 obj) {
			return obj.getDepositorySuspensionPeriodForBookEntryTransfer();
		}

		@Override
		public void setValue(CorporateActionPeriod10 obj, Optional<Period3Choice> value) {
			obj.setDepositorySuspensionPeriodForBookEntryTransfer(value.orElse(null));
		}
	};
	@XmlElement(name = "DpstrySspnsnPrdForDpstAtAgt")
	protected Period3Choice depositorySuspensionPeriodForDepositAtAgent;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10
	 * CorporateActionPeriod10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForDpstAtAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForDepositAtAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which deposits, into nominee name, at the agent will be accepted and the date on which the suspension will be released and deposits at agent will resume."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::DSDA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForDepositAtAgent
	 * CorporateActionPeriod14.mmDepositorySuspensionPeriodForDepositAtAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForDepositAtAgent
	 * CorporateActionPeriod8.mmDepositorySuspensionPeriodForDepositAtAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>> mmDepositorySuspensionPeriodForDepositAtAgent = new MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForDepositAtAgent;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod10.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForDpstAtAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSDA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForDepositAtAgent";
			definition = "Period defining the last date for which deposits, into nominee name, at the agent will be accepted and the date on which the suspension will be released and deposits at agent will resume.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod14.mmDepositorySuspensionPeriodForDepositAtAgent);
			previousVersion_lazy = () -> CorporateActionPeriod8.mmDepositorySuspensionPeriodForDepositAtAgent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod10 obj) {
			return obj.getDepositorySuspensionPeriodForDepositAtAgent();
		}

		@Override
		public void setValue(CorporateActionPeriod10 obj, Optional<Period3Choice> value) {
			obj.setDepositorySuspensionPeriodForDepositAtAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "DpstrySspnsnPrdForDpst")
	protected Period3Choice depositorySuspensionPeriodForDeposit;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10
	 * CorporateActionPeriod10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForDpst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which deposits will be accepted and the date on which the suspension will be released and deposits will resume."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::DSDE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForDeposit
	 * CorporateActionPeriod14.mmDepositorySuspensionPeriodForDeposit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForDeposit
	 * CorporateActionPeriod8.mmDepositorySuspensionPeriodForDeposit}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>> mmDepositorySuspensionPeriodForDeposit = new MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForDeposit;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod10.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForDpst";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSDE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForDeposit";
			definition = "Period defining the last date for which deposits will be accepted and the date on which the suspension will be released and deposits will resume.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod14.mmDepositorySuspensionPeriodForDeposit);
			previousVersion_lazy = () -> CorporateActionPeriod8.mmDepositorySuspensionPeriodForDeposit;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod10 obj) {
			return obj.getDepositorySuspensionPeriodForDeposit();
		}

		@Override
		public void setValue(CorporateActionPeriod10 obj, Optional<Period3Choice> value) {
			obj.setDepositorySuspensionPeriodForDeposit(value.orElse(null));
		}
	};
	@XmlElement(name = "DpstrySspnsnPrdForPldg")
	protected Period3Choice depositorySuspensionPeriodForPledge;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10
	 * CorporateActionPeriod10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForPldg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForPledge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which pledges will be accepted and the date on which the suspension will be released and pledge processing will resume."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::DSPL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForPledge
	 * CorporateActionPeriod14.mmDepositorySuspensionPeriodForPledge}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForPledge
	 * CorporateActionPeriod8.mmDepositorySuspensionPeriodForPledge}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>> mmDepositorySuspensionPeriodForPledge = new MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForPledge;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod10.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForPldg";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSPL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForPledge";
			definition = "Period defining the last date for which pledges will be accepted and the date on which the suspension will be released and pledge processing will resume.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod14.mmDepositorySuspensionPeriodForPledge);
			previousVersion_lazy = () -> CorporateActionPeriod8.mmDepositorySuspensionPeriodForPledge;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod10 obj) {
			return obj.getDepositorySuspensionPeriodForPledge();
		}

		@Override
		public void setValue(CorporateActionPeriod10 obj, Optional<Period3Choice> value) {
			obj.setDepositorySuspensionPeriodForPledge(value.orElse(null));
		}
	};
	@XmlElement(name = "DpstrySspnsnPrdForSgrtn")
	protected Period3Choice depositorySuspensionPeriodForSegregation;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10
	 * CorporateActionPeriod10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForSgrtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForSegregation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which intra-position balances can be segregated and the date on which the suspension will be released and the ability to segregate intra-position balances will resume."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::DSSE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForSegregation
	 * CorporateActionPeriod14.mmDepositorySuspensionPeriodForSegregation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForSegregation
	 * CorporateActionPeriod8.mmDepositorySuspensionPeriodForSegregation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>> mmDepositorySuspensionPeriodForSegregation = new MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForSegregation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod10.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForSgrtn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSSE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForSegregation";
			definition = "Period defining the last date for which intra-position balances can be segregated and the date on which the suspension will be released and the ability to segregate intra-position balances will resume.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod14.mmDepositorySuspensionPeriodForSegregation);
			previousVersion_lazy = () -> CorporateActionPeriod8.mmDepositorySuspensionPeriodForSegregation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod10 obj) {
			return obj.getDepositorySuspensionPeriodForSegregation();
		}

		@Override
		public void setValue(CorporateActionPeriod10 obj, Optional<Period3Choice> value) {
			obj.setDepositorySuspensionPeriodForSegregation(value.orElse(null));
		}
	};
	@XmlElement(name = "DpstrySspnsnPrdForWdrwlAtAgt")
	protected Period3Choice depositorySuspensionPeriodForWithdrawalAtAgent;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10
	 * CorporateActionPeriod10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForWdrwlAtAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForWithdrawalAtAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which withdrawals, from nominee name at the agent will be accepted and the date on which the suspension will be released and withdrawals at agent processing will resume."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::DSWA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForWithdrawalAtAgent
	 * CorporateActionPeriod14.mmDepositorySuspensionPeriodForWithdrawalAtAgent}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForWithdrawalAtAgent
	 * CorporateActionPeriod8.mmDepositorySuspensionPeriodForWithdrawalAtAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>> mmDepositorySuspensionPeriodForWithdrawalAtAgent = new MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalAtAgent;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod10.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForWdrwlAtAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSWA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalAtAgent";
			definition = "Period defining the last date for which withdrawals, from nominee name at the agent will be accepted and the date on which the suspension will be released and withdrawals at agent processing will resume.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod14.mmDepositorySuspensionPeriodForWithdrawalAtAgent);
			previousVersion_lazy = () -> CorporateActionPeriod8.mmDepositorySuspensionPeriodForWithdrawalAtAgent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod10 obj) {
			return obj.getDepositorySuspensionPeriodForWithdrawalAtAgent();
		}

		@Override
		public void setValue(CorporateActionPeriod10 obj, Optional<Period3Choice> value) {
			obj.setDepositorySuspensionPeriodForWithdrawalAtAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "DpstrySspnsnPrdForWdrwlInNmneeNm")
	protected Period3Choice depositorySuspensionPeriodForWithdrawalInNomineeName;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10
	 * CorporateActionPeriod10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForWdrwlInNmneeNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForWithdrawalInNomineeName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which physical withdrawals in the nominee's name will be accepted and the date on which the suspension will be released and physical withdrawals in the nominee's name will resume."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::DSWN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForWithdrawalInNomineeName
	 * CorporateActionPeriod14.
	 * mmDepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForWithdrawalInNomineeName
	 * CorporateActionPeriod8.
	 * mmDepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>> mmDepositorySuspensionPeriodForWithdrawalInNomineeName = new MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInNomineeName;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod10.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForWdrwlInNmneeNm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSWN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalInNomineeName";
			definition = "Period defining the last date for which physical withdrawals in the nominee's name will be accepted and the date on which the suspension will be released and physical withdrawals in the nominee's name will resume.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod14.mmDepositorySuspensionPeriodForWithdrawalInNomineeName);
			previousVersion_lazy = () -> CorporateActionPeriod8.mmDepositorySuspensionPeriodForWithdrawalInNomineeName;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod10 obj) {
			return obj.getDepositorySuspensionPeriodForWithdrawalInNomineeName();
		}

		@Override
		public void setValue(CorporateActionPeriod10 obj, Optional<Period3Choice> value) {
			obj.setDepositorySuspensionPeriodForWithdrawalInNomineeName(value.orElse(null));
		}
	};
	@XmlElement(name = "DpstrySspnsnPrdForWdrwlInStrtNm")
	protected Period3Choice depositorySuspensionPeriodForWithdrawalInStreetName;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10
	 * CorporateActionPeriod10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForWdrwlInStrtNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForWithdrawalInStreetName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date on which withdrawal requests in street name's will be accepted on the event security and the date on which the suspension will be released and withdrawal in street name's processing on the event security will resume."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::DSWS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForWithdrawalInStreetName
	 * CorporateActionPeriod14.
	 * mmDepositorySuspensionPeriodForWithdrawalInStreetName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForWithdrawalInStreetName
	 * CorporateActionPeriod8.
	 * mmDepositorySuspensionPeriodForWithdrawalInStreetName}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>> mmDepositorySuspensionPeriodForWithdrawalInStreetName = new MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInStreetName;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod10.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForWdrwlInStrtNm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSWS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalInStreetName";
			definition = "Period defining the last date on which withdrawal requests in street name's will be accepted on the event security and the date on which the suspension will be released and withdrawal in street name's processing on the event security will resume.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod14.mmDepositorySuspensionPeriodForWithdrawalInStreetName);
			previousVersion_lazy = () -> CorporateActionPeriod8.mmDepositorySuspensionPeriodForWithdrawalInStreetName;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod10 obj) {
			return obj.getDepositorySuspensionPeriodForWithdrawalInStreetName();
		}

		@Override
		public void setValue(CorporateActionPeriod10 obj, Optional<Period3Choice> value) {
			obj.setDepositorySuspensionPeriodForWithdrawalInStreetName(value.orElse(null));
		}
	};
	@XmlElement(name = "BookClsrPrd")
	protected Period3Choice bookClosurePeriod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10
	 * CorporateActionPeriod10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BookClsrPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookClosurePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date on which shareholder registration will be accepted by the issuer and the date on which shareholder registration will resume."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::BOCL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmBookClosurePeriod
	 * CorporateActionPeriod14.mmBookClosurePeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmBookClosurePeriod
	 * CorporateActionPeriod8.mmBookClosurePeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>> mmBookClosurePeriod = new MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmBookClosurePeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod10.mmObject();
			isDerived = false;
			xmlTag = "BookClsrPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::BOCL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookClosurePeriod";
			definition = "Period defining the last date on which shareholder registration will be accepted by the issuer and the date on which shareholder registration will resume.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod14.mmBookClosurePeriod);
			previousVersion_lazy = () -> CorporateActionPeriod8.mmBookClosurePeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod10 obj) {
			return obj.getBookClosurePeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod10 obj, Optional<Period3Choice> value) {
			obj.setBookClosurePeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "CoDpstriesSspnsnPrd")
	protected Period3Choice coDepositoriesSuspensionPeriod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10
	 * CorporateActionPeriod10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CoDpstriesSspnsnPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoDepositoriesSuspensionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the settlement activities at the co-depositories are suspended in order to stabilise the holdings at the CSD."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmCoDepositoriesSuspensionPeriod
	 * CorporateActionPeriod14.mmCoDepositoriesSuspensionPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmCoDepositoriesSuspensionPeriod
	 * CorporateActionPeriod8.mmCoDepositoriesSuspensionPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionPeriod10, Optional<Period3Choice>> mmCoDepositoriesSuspensionPeriod = new MMMessageAttribute<CorporateActionPeriod10, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmCoDepositoriesSuspensionPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod10.mmObject();
			isDerived = false;
			xmlTag = "CoDpstriesSspnsnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoDepositoriesSuspensionPeriod";
			definition = "Period during which the settlement activities at the co-depositories are suspended in order to stabilise the holdings at the CSD.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod14.mmCoDepositoriesSuspensionPeriod);
			previousVersion_lazy = () -> CorporateActionPeriod8.mmCoDepositoriesSuspensionPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod10 obj) {
			return obj.getCoDepositoriesSuspensionPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod10 obj, Optional<Period3Choice> value) {
			obj.setCoDepositoriesSuspensionPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "SpltPrd")
	protected Period3Choice splitPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSplitPeriod
	 * BasicSecuritiesRegistration.mmSplitPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10
	 * CorporateActionPeriod10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpltPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which a physical certificate can be split."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmSplitPeriod
	 * CorporateActionPeriod14.mmSplitPeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>> mmSplitPeriod = new MMMessageAssociationEnd<CorporateActionPeriod10, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> BasicSecuritiesRegistration.mmSplitPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod10.mmObject();
			isDerived = false;
			xmlTag = "SpltPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitPeriod";
			definition = "Period during which a physical certificate can be split.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod14.mmSplitPeriod);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod10 obj) {
			return obj.getSplitPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod10 obj, Optional<Period3Choice> value) {
			obj.setSplitPeriod(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriod10.mmPriceCalculationPeriod, com.tools20022.repository.msg.CorporateActionPeriod10.mmInterestPeriod,
						com.tools20022.repository.msg.CorporateActionPeriod10.mmCompulsoryPurchasePeriod, com.tools20022.repository.msg.CorporateActionPeriod10.mmBlockingPeriod,
						com.tools20022.repository.msg.CorporateActionPeriod10.mmClaimPeriod, com.tools20022.repository.msg.CorporateActionPeriod10.mmDepositorySuspensionPeriodForBookEntryTransfer,
						com.tools20022.repository.msg.CorporateActionPeriod10.mmDepositorySuspensionPeriodForDepositAtAgent, com.tools20022.repository.msg.CorporateActionPeriod10.mmDepositorySuspensionPeriodForDeposit,
						com.tools20022.repository.msg.CorporateActionPeriod10.mmDepositorySuspensionPeriodForPledge, com.tools20022.repository.msg.CorporateActionPeriod10.mmDepositorySuspensionPeriodForSegregation,
						com.tools20022.repository.msg.CorporateActionPeriod10.mmDepositorySuspensionPeriodForWithdrawalAtAgent, com.tools20022.repository.msg.CorporateActionPeriod10.mmDepositorySuspensionPeriodForWithdrawalInNomineeName,
						com.tools20022.repository.msg.CorporateActionPeriod10.mmDepositorySuspensionPeriodForWithdrawalInStreetName, com.tools20022.repository.msg.CorporateActionPeriod10.mmBookClosurePeriod,
						com.tools20022.repository.msg.CorporateActionPeriod10.mmCoDepositoriesSuspensionPeriod, com.tools20022.repository.msg.CorporateActionPeriod10.mmSplitPeriod);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInterestPeriodRule.forCorporateActionPeriod10);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPeriod10";
				definition = "Specifies periods of a corporate action.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod14.mmObject());
				previousVersion_lazy = () -> CorporateActionPeriod8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Period3Choice> getPriceCalculationPeriod() {
		return priceCalculationPeriod == null ? Optional.empty() : Optional.of(priceCalculationPeriod);
	}

	public CorporateActionPeriod10 setPriceCalculationPeriod(Period3Choice priceCalculationPeriod) {
		this.priceCalculationPeriod = priceCalculationPeriod;
		return this;
	}

	public Optional<Period3Choice> getInterestPeriod() {
		return interestPeriod == null ? Optional.empty() : Optional.of(interestPeriod);
	}

	public CorporateActionPeriod10 setInterestPeriod(Period3Choice interestPeriod) {
		this.interestPeriod = interestPeriod;
		return this;
	}

	public Optional<Period3Choice> getCompulsoryPurchasePeriod() {
		return compulsoryPurchasePeriod == null ? Optional.empty() : Optional.of(compulsoryPurchasePeriod);
	}

	public CorporateActionPeriod10 setCompulsoryPurchasePeriod(Period3Choice compulsoryPurchasePeriod) {
		this.compulsoryPurchasePeriod = compulsoryPurchasePeriod;
		return this;
	}

	public Optional<Period3Choice> getBlockingPeriod() {
		return blockingPeriod == null ? Optional.empty() : Optional.of(blockingPeriod);
	}

	public CorporateActionPeriod10 setBlockingPeriod(Period3Choice blockingPeriod) {
		this.blockingPeriod = blockingPeriod;
		return this;
	}

	public Optional<Period3Choice> getClaimPeriod() {
		return claimPeriod == null ? Optional.empty() : Optional.of(claimPeriod);
	}

	public CorporateActionPeriod10 setClaimPeriod(Period3Choice claimPeriod) {
		this.claimPeriod = claimPeriod;
		return this;
	}

	public Optional<Period3Choice> getDepositorySuspensionPeriodForBookEntryTransfer() {
		return depositorySuspensionPeriodForBookEntryTransfer == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForBookEntryTransfer);
	}

	public CorporateActionPeriod10 setDepositorySuspensionPeriodForBookEntryTransfer(Period3Choice depositorySuspensionPeriodForBookEntryTransfer) {
		this.depositorySuspensionPeriodForBookEntryTransfer = depositorySuspensionPeriodForBookEntryTransfer;
		return this;
	}

	public Optional<Period3Choice> getDepositorySuspensionPeriodForDepositAtAgent() {
		return depositorySuspensionPeriodForDepositAtAgent == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForDepositAtAgent);
	}

	public CorporateActionPeriod10 setDepositorySuspensionPeriodForDepositAtAgent(Period3Choice depositorySuspensionPeriodForDepositAtAgent) {
		this.depositorySuspensionPeriodForDepositAtAgent = depositorySuspensionPeriodForDepositAtAgent;
		return this;
	}

	public Optional<Period3Choice> getDepositorySuspensionPeriodForDeposit() {
		return depositorySuspensionPeriodForDeposit == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForDeposit);
	}

	public CorporateActionPeriod10 setDepositorySuspensionPeriodForDeposit(Period3Choice depositorySuspensionPeriodForDeposit) {
		this.depositorySuspensionPeriodForDeposit = depositorySuspensionPeriodForDeposit;
		return this;
	}

	public Optional<Period3Choice> getDepositorySuspensionPeriodForPledge() {
		return depositorySuspensionPeriodForPledge == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForPledge);
	}

	public CorporateActionPeriod10 setDepositorySuspensionPeriodForPledge(Period3Choice depositorySuspensionPeriodForPledge) {
		this.depositorySuspensionPeriodForPledge = depositorySuspensionPeriodForPledge;
		return this;
	}

	public Optional<Period3Choice> getDepositorySuspensionPeriodForSegregation() {
		return depositorySuspensionPeriodForSegregation == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForSegregation);
	}

	public CorporateActionPeriod10 setDepositorySuspensionPeriodForSegregation(Period3Choice depositorySuspensionPeriodForSegregation) {
		this.depositorySuspensionPeriodForSegregation = depositorySuspensionPeriodForSegregation;
		return this;
	}

	public Optional<Period3Choice> getDepositorySuspensionPeriodForWithdrawalAtAgent() {
		return depositorySuspensionPeriodForWithdrawalAtAgent == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForWithdrawalAtAgent);
	}

	public CorporateActionPeriod10 setDepositorySuspensionPeriodForWithdrawalAtAgent(Period3Choice depositorySuspensionPeriodForWithdrawalAtAgent) {
		this.depositorySuspensionPeriodForWithdrawalAtAgent = depositorySuspensionPeriodForWithdrawalAtAgent;
		return this;
	}

	public Optional<Period3Choice> getDepositorySuspensionPeriodForWithdrawalInNomineeName() {
		return depositorySuspensionPeriodForWithdrawalInNomineeName == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForWithdrawalInNomineeName);
	}

	public CorporateActionPeriod10 setDepositorySuspensionPeriodForWithdrawalInNomineeName(Period3Choice depositorySuspensionPeriodForWithdrawalInNomineeName) {
		this.depositorySuspensionPeriodForWithdrawalInNomineeName = depositorySuspensionPeriodForWithdrawalInNomineeName;
		return this;
	}

	public Optional<Period3Choice> getDepositorySuspensionPeriodForWithdrawalInStreetName() {
		return depositorySuspensionPeriodForWithdrawalInStreetName == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForWithdrawalInStreetName);
	}

	public CorporateActionPeriod10 setDepositorySuspensionPeriodForWithdrawalInStreetName(Period3Choice depositorySuspensionPeriodForWithdrawalInStreetName) {
		this.depositorySuspensionPeriodForWithdrawalInStreetName = depositorySuspensionPeriodForWithdrawalInStreetName;
		return this;
	}

	public Optional<Period3Choice> getBookClosurePeriod() {
		return bookClosurePeriod == null ? Optional.empty() : Optional.of(bookClosurePeriod);
	}

	public CorporateActionPeriod10 setBookClosurePeriod(Period3Choice bookClosurePeriod) {
		this.bookClosurePeriod = bookClosurePeriod;
		return this;
	}

	public Optional<Period3Choice> getCoDepositoriesSuspensionPeriod() {
		return coDepositoriesSuspensionPeriod == null ? Optional.empty() : Optional.of(coDepositoriesSuspensionPeriod);
	}

	public CorporateActionPeriod10 setCoDepositoriesSuspensionPeriod(Period3Choice coDepositoriesSuspensionPeriod) {
		this.coDepositoriesSuspensionPeriod = coDepositoriesSuspensionPeriod;
		return this;
	}

	public Optional<Period3Choice> getSplitPeriod() {
		return splitPeriod == null ? Optional.empty() : Optional.of(splitPeriod);
	}

	public CorporateActionPeriod10 setSplitPeriod(Period3Choice splitPeriod) {
		this.splitPeriod = splitPeriod;
		return this;
	}
}