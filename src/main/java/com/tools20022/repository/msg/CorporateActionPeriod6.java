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
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmPriceCalculationPeriod
 * CorporateActionPeriod6.mmPriceCalculationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmInterestPeriod
 * CorporateActionPeriod6.mmInterestPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmCompulsoryPurchasePeriod
 * CorporateActionPeriod6.mmCompulsoryPurchasePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmBlockingPeriod
 * CorporateActionPeriod6.mmBlockingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmClaimPeriod
 * CorporateActionPeriod6.mmClaimPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmDepositorySuspensionPeriodForBookEntryTransfer
 * CorporateActionPeriod6.mmDepositorySuspensionPeriodForBookEntryTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmDepositorySuspensionPeriodForDepositAtAgent
 * CorporateActionPeriod6.mmDepositorySuspensionPeriodForDepositAtAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmDepositorySuspensionPeriodForDeposit
 * CorporateActionPeriod6.mmDepositorySuspensionPeriodForDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmDepositorySuspensionPeriodForPledge
 * CorporateActionPeriod6.mmDepositorySuspensionPeriodForPledge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmDepositorySuspensionPeriodForSegregation
 * CorporateActionPeriod6.mmDepositorySuspensionPeriodForSegregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmDepositorySuspensionPeriodForWithdrawalAtAgent
 * CorporateActionPeriod6.mmDepositorySuspensionPeriodForWithdrawalAtAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmDepositorySuspensionPeriodForWithdrawalInNomineeName
 * CorporateActionPeriod6.mmDepositorySuspensionPeriodForWithdrawalInNomineeName
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmDepositorySuspensionPeriodForWithdrawalInStreetName
 * CorporateActionPeriod6.mmDepositorySuspensionPeriodForWithdrawalInStreetName}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmBookClosurePeriod
 * CorporateActionPeriod6.mmBookClosurePeriod}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintInterestPeriodRule#forCorporateActionPeriod6
 * ConstraintInterestPeriodRule.forCorporateActionPeriod6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionPeriod6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies periods of a corporate action."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPeriod8
 * CorporateActionPeriod8}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionPeriod6", propOrder = {"priceCalculationPeriod", "interestPeriod", "compulsoryPurchasePeriod", "blockingPeriod", "claimPeriod", "depositorySuspensionPeriodForBookEntryTransfer",
		"depositorySuspensionPeriodForDepositAtAgent", "depositorySuspensionPeriodForDeposit", "depositorySuspensionPeriodForPledge", "depositorySuspensionPeriodForSegregation", "depositorySuspensionPeriodForWithdrawalAtAgent",
		"depositorySuspensionPeriodForWithdrawalInNomineeName", "depositorySuspensionPeriodForWithdrawalInStreetName", "bookClosurePeriod"})
public class CorporateActionPeriod6 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6
	 * CorporateActionPeriod6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>> mmPriceCalculationPeriod = new MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceCalculationPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod6.mmObject();
			isDerived = false;
			xmlTag = "PricClctnPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a:PRIC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceCalculationPeriod";
			definition = "Period during which the price of a security is determined.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod6 obj) {
			return obj.getPriceCalculationPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod6 obj, Optional<Period3Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6
	 * CorporateActionPeriod6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>> mmInterestPeriod = new MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmInterestPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod6.mmObject();
			isDerived = false;
			xmlTag = "IntrstPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a:INPE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPeriod";
			definition = "Period during which the interest rate has been applied.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod6 obj) {
			return obj.getInterestPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod6 obj, Optional<Period3Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6
	 * CorporateActionPeriod6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>> mmCompulsoryPurchasePeriod = new MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmCompulsoryPurchasePeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod6.mmObject();
			isDerived = false;
			xmlTag = "CmplsryPurchsPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::CSPD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompulsoryPurchasePeriod";
			definition = "Period during a take-over where any outstanding equity must be purchased by the take-over company.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod6 obj) {
			return obj.getCompulsoryPurchasePeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod6 obj, Optional<Period3Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6
	 * CorporateActionPeriod6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>> mmBlockingPeriod = new MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBlockingDeadline.mmBlockingPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod6.mmObject();
			isDerived = false;
			xmlTag = "BlckgPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::BLOK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockingPeriod";
			definition = "Period during which the security is blocked.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod6 obj) {
			return obj.getBlockingPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod6 obj, Optional<Period3Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6
	 * CorporateActionPeriod6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>> mmClaimPeriod = new MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> ClassAction.mmClaimPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod6.mmObject();
			isDerived = false;
			xmlTag = "ClmPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::CLCP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClaimPeriod";
			definition = "Period assigned by the court in a class action. It determines the client's eligible transactions that will be included in the class action and used to determine the resulting entitlement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod6 obj) {
			return obj.getClaimPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod6 obj, Optional<Period3Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6
	 * CorporateActionPeriod6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>> mmDepositorySuspensionPeriodForBookEntryTransfer = new MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForBookEntryTransfer;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod6.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForBookNtryTrf";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSBT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForBookEntryTransfer";
			definition = "Period defining the last date for which book entry transfers will be accepted and the date on which the suspension will be released and book entry transfer processing will resume.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod6 obj) {
			return obj.getDepositorySuspensionPeriodForBookEntryTransfer();
		}

		@Override
		public void setValue(CorporateActionPeriod6 obj, Optional<Period3Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6
	 * CorporateActionPeriod6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>> mmDepositorySuspensionPeriodForDepositAtAgent = new MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForDepositAtAgent;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod6.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForDpstAtAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSDA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForDepositAtAgent";
			definition = "Period defining the last date for which deposits, into nominee name, at the agent will be accepted and the date on which the suspension will be released and deposits at agent will resume.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod6 obj) {
			return obj.getDepositorySuspensionPeriodForDepositAtAgent();
		}

		@Override
		public void setValue(CorporateActionPeriod6 obj, Optional<Period3Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6
	 * CorporateActionPeriod6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>> mmDepositorySuspensionPeriodForDeposit = new MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForDeposit;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod6.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForDpst";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSDE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForDeposit";
			definition = "Period defining the last date for which deposits will be accepted and the date on which the suspension will be released and deposits will resume.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod6 obj) {
			return obj.getDepositorySuspensionPeriodForDeposit();
		}

		@Override
		public void setValue(CorporateActionPeriod6 obj, Optional<Period3Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6
	 * CorporateActionPeriod6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>> mmDepositorySuspensionPeriodForPledge = new MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForPledge;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod6.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForPldg";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSPL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForPledge";
			definition = "Period defining the last date for which pledges will be accepted and the date on which the suspension will be released and pledge processing will resume.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod6 obj) {
			return obj.getDepositorySuspensionPeriodForPledge();
		}

		@Override
		public void setValue(CorporateActionPeriod6 obj, Optional<Period3Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6
	 * CorporateActionPeriod6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>> mmDepositorySuspensionPeriodForSegregation = new MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForSegregation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod6.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForSgrtn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSSE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForSegregation";
			definition = "Period defining the last date for which intra-position balances can be segregated and the date on which the suspension will be released and the ability to segregate intra-position balances will resume.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod6 obj) {
			return obj.getDepositorySuspensionPeriodForSegregation();
		}

		@Override
		public void setValue(CorporateActionPeriod6 obj, Optional<Period3Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6
	 * CorporateActionPeriod6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>> mmDepositorySuspensionPeriodForWithdrawalAtAgent = new MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalAtAgent;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod6.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForWdrwlAtAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSWA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalAtAgent";
			definition = "Period defining the last date for which withdrawals, from nominee name at the agent will be accepted and the date on which the suspension will be released and withdrawals at agent processing will resume.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod6 obj) {
			return obj.getDepositorySuspensionPeriodForWithdrawalAtAgent();
		}

		@Override
		public void setValue(CorporateActionPeriod6 obj, Optional<Period3Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6
	 * CorporateActionPeriod6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>> mmDepositorySuspensionPeriodForWithdrawalInNomineeName = new MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInNomineeName;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod6.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForWdrwlInNmneeNm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSWN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalInNomineeName";
			definition = "Period defining the last date for which physical withdrawals in the nominee's name will be accepted and the date on which the suspension will be released and physical withdrawals in the nominee's name will resume.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod6 obj) {
			return obj.getDepositorySuspensionPeriodForWithdrawalInNomineeName();
		}

		@Override
		public void setValue(CorporateActionPeriod6 obj, Optional<Period3Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6
	 * CorporateActionPeriod6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>> mmDepositorySuspensionPeriodForWithdrawalInStreetName = new MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInStreetName;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod6.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForWdrwlInStrtNm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSWS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalInStreetName";
			definition = "Period defining the last date on which withdrawal requests in street name's will be accepted on the event security and the date on which the suspension will be released and withdrawal in street name's processing on the event security will resume.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod6 obj) {
			return obj.getDepositorySuspensionPeriodForWithdrawalInStreetName();
		}

		@Override
		public void setValue(CorporateActionPeriod6 obj, Optional<Period3Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6
	 * CorporateActionPeriod6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>> mmBookClosurePeriod = new MMMessageAssociationEnd<CorporateActionPeriod6, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmBookClosurePeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod6.mmObject();
			isDerived = false;
			xmlTag = "BookClsrPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::BOCL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookClosurePeriod";
			definition = "Period defining the last date on which shareholder registration will be accepted by the issuer and the date on which shareholder registration will resume.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(CorporateActionPeriod6 obj) {
			return obj.getBookClosurePeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod6 obj, Optional<Period3Choice> value) {
			obj.setBookClosurePeriod(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriod6.mmPriceCalculationPeriod, com.tools20022.repository.msg.CorporateActionPeriod6.mmInterestPeriod,
						com.tools20022.repository.msg.CorporateActionPeriod6.mmCompulsoryPurchasePeriod, com.tools20022.repository.msg.CorporateActionPeriod6.mmBlockingPeriod,
						com.tools20022.repository.msg.CorporateActionPeriod6.mmClaimPeriod, com.tools20022.repository.msg.CorporateActionPeriod6.mmDepositorySuspensionPeriodForBookEntryTransfer,
						com.tools20022.repository.msg.CorporateActionPeriod6.mmDepositorySuspensionPeriodForDepositAtAgent, com.tools20022.repository.msg.CorporateActionPeriod6.mmDepositorySuspensionPeriodForDeposit,
						com.tools20022.repository.msg.CorporateActionPeriod6.mmDepositorySuspensionPeriodForPledge, com.tools20022.repository.msg.CorporateActionPeriod6.mmDepositorySuspensionPeriodForSegregation,
						com.tools20022.repository.msg.CorporateActionPeriod6.mmDepositorySuspensionPeriodForWithdrawalAtAgent, com.tools20022.repository.msg.CorporateActionPeriod6.mmDepositorySuspensionPeriodForWithdrawalInNomineeName,
						com.tools20022.repository.msg.CorporateActionPeriod6.mmDepositorySuspensionPeriodForWithdrawalInStreetName, com.tools20022.repository.msg.CorporateActionPeriod6.mmBookClosurePeriod);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInterestPeriodRule.forCorporateActionPeriod6);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPeriod6";
				definition = "Specifies periods of a corporate action.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Period3Choice> getPriceCalculationPeriod() {
		return priceCalculationPeriod == null ? Optional.empty() : Optional.of(priceCalculationPeriod);
	}

	public CorporateActionPeriod6 setPriceCalculationPeriod(Period3Choice priceCalculationPeriod) {
		this.priceCalculationPeriod = priceCalculationPeriod;
		return this;
	}

	public Optional<Period3Choice> getInterestPeriod() {
		return interestPeriod == null ? Optional.empty() : Optional.of(interestPeriod);
	}

	public CorporateActionPeriod6 setInterestPeriod(Period3Choice interestPeriod) {
		this.interestPeriod = interestPeriod;
		return this;
	}

	public Optional<Period3Choice> getCompulsoryPurchasePeriod() {
		return compulsoryPurchasePeriod == null ? Optional.empty() : Optional.of(compulsoryPurchasePeriod);
	}

	public CorporateActionPeriod6 setCompulsoryPurchasePeriod(Period3Choice compulsoryPurchasePeriod) {
		this.compulsoryPurchasePeriod = compulsoryPurchasePeriod;
		return this;
	}

	public Optional<Period3Choice> getBlockingPeriod() {
		return blockingPeriod == null ? Optional.empty() : Optional.of(blockingPeriod);
	}

	public CorporateActionPeriod6 setBlockingPeriod(Period3Choice blockingPeriod) {
		this.blockingPeriod = blockingPeriod;
		return this;
	}

	public Optional<Period3Choice> getClaimPeriod() {
		return claimPeriod == null ? Optional.empty() : Optional.of(claimPeriod);
	}

	public CorporateActionPeriod6 setClaimPeriod(Period3Choice claimPeriod) {
		this.claimPeriod = claimPeriod;
		return this;
	}

	public Optional<Period3Choice> getDepositorySuspensionPeriodForBookEntryTransfer() {
		return depositorySuspensionPeriodForBookEntryTransfer == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForBookEntryTransfer);
	}

	public CorporateActionPeriod6 setDepositorySuspensionPeriodForBookEntryTransfer(Period3Choice depositorySuspensionPeriodForBookEntryTransfer) {
		this.depositorySuspensionPeriodForBookEntryTransfer = depositorySuspensionPeriodForBookEntryTransfer;
		return this;
	}

	public Optional<Period3Choice> getDepositorySuspensionPeriodForDepositAtAgent() {
		return depositorySuspensionPeriodForDepositAtAgent == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForDepositAtAgent);
	}

	public CorporateActionPeriod6 setDepositorySuspensionPeriodForDepositAtAgent(Period3Choice depositorySuspensionPeriodForDepositAtAgent) {
		this.depositorySuspensionPeriodForDepositAtAgent = depositorySuspensionPeriodForDepositAtAgent;
		return this;
	}

	public Optional<Period3Choice> getDepositorySuspensionPeriodForDeposit() {
		return depositorySuspensionPeriodForDeposit == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForDeposit);
	}

	public CorporateActionPeriod6 setDepositorySuspensionPeriodForDeposit(Period3Choice depositorySuspensionPeriodForDeposit) {
		this.depositorySuspensionPeriodForDeposit = depositorySuspensionPeriodForDeposit;
		return this;
	}

	public Optional<Period3Choice> getDepositorySuspensionPeriodForPledge() {
		return depositorySuspensionPeriodForPledge == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForPledge);
	}

	public CorporateActionPeriod6 setDepositorySuspensionPeriodForPledge(Period3Choice depositorySuspensionPeriodForPledge) {
		this.depositorySuspensionPeriodForPledge = depositorySuspensionPeriodForPledge;
		return this;
	}

	public Optional<Period3Choice> getDepositorySuspensionPeriodForSegregation() {
		return depositorySuspensionPeriodForSegregation == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForSegregation);
	}

	public CorporateActionPeriod6 setDepositorySuspensionPeriodForSegregation(Period3Choice depositorySuspensionPeriodForSegregation) {
		this.depositorySuspensionPeriodForSegregation = depositorySuspensionPeriodForSegregation;
		return this;
	}

	public Optional<Period3Choice> getDepositorySuspensionPeriodForWithdrawalAtAgent() {
		return depositorySuspensionPeriodForWithdrawalAtAgent == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForWithdrawalAtAgent);
	}

	public CorporateActionPeriod6 setDepositorySuspensionPeriodForWithdrawalAtAgent(Period3Choice depositorySuspensionPeriodForWithdrawalAtAgent) {
		this.depositorySuspensionPeriodForWithdrawalAtAgent = depositorySuspensionPeriodForWithdrawalAtAgent;
		return this;
	}

	public Optional<Period3Choice> getDepositorySuspensionPeriodForWithdrawalInNomineeName() {
		return depositorySuspensionPeriodForWithdrawalInNomineeName == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForWithdrawalInNomineeName);
	}

	public CorporateActionPeriod6 setDepositorySuspensionPeriodForWithdrawalInNomineeName(Period3Choice depositorySuspensionPeriodForWithdrawalInNomineeName) {
		this.depositorySuspensionPeriodForWithdrawalInNomineeName = depositorySuspensionPeriodForWithdrawalInNomineeName;
		return this;
	}

	public Optional<Period3Choice> getDepositorySuspensionPeriodForWithdrawalInStreetName() {
		return depositorySuspensionPeriodForWithdrawalInStreetName == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForWithdrawalInStreetName);
	}

	public CorporateActionPeriod6 setDepositorySuspensionPeriodForWithdrawalInStreetName(Period3Choice depositorySuspensionPeriodForWithdrawalInStreetName) {
		this.depositorySuspensionPeriodForWithdrawalInStreetName = depositorySuspensionPeriodForWithdrawalInStreetName;
		return this;
	}

	public Optional<Period3Choice> getBookClosurePeriod() {
		return bookClosurePeriod == null ? Optional.empty() : Optional.of(bookClosurePeriod);
	}

	public CorporateActionPeriod6 setBookClosurePeriod(Period3Choice bookClosurePeriod) {
		this.bookClosurePeriod = bookClosurePeriod;
		return this;
	}
}