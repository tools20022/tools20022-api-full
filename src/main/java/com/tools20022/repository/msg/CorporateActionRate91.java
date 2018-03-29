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
import com.tools20022.repository.choice.*;
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
 * Specifies rates of a corporate action.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91#mmInterestRate
 * CorporateActionRate91.mmInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91#mmPercentageSought
 * CorporateActionRate91.mmPercentageSought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91#mmRelatedIndex
 * CorporateActionRate91.mmRelatedIndex}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRate91#mmSpread
 * CorporateActionRate91.mmSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91#mmBidInterval
 * CorporateActionRate91.mmBidInterval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91#mmPreviousFactor
 * CorporateActionRate91.mmPreviousFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91#mmNextFactor
 * CorporateActionRate91.mmNextFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91#mmReinvestmentDiscountRateToMarket
 * CorporateActionRate91.mmReinvestmentDiscountRateToMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91#mmInterestShortfall
 * CorporateActionRate91.mmInterestShortfall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91#mmRealisedLoss
 * CorporateActionRate91.mmRealisedLoss}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91#mmDeclaredRate
 * CorporateActionRate91.mmDeclaredRate}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#forCorporateActionRate91
 * ConstraintDeclaredRateRule.forCorporateActionRate91}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionRate91"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies rates of a corporate action."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66
 * CorporateActionRate66}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionRate91", propOrder = {"interestRate", "percentageSought", "relatedIndex", "spread", "bidInterval", "previousFactor", "nextFactor", "reinvestmentDiscountRateToMarket", "interestShortfall", "realisedLoss",
		"declaredRate"})
public class CorporateActionRate91 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IntrstRate")
	protected RateAndAmountFormat37Choice interestRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat37Choice
	 * RateAndAmountFormat37Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmInterest
	 * CashProceedsDefinition.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91
	 * CorporateActionRate91}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::INTR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Annualised interest rate of a financial instrument used to calculate the actual interest rate of the coupon or the accrued interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmInterest
	 * CorporateActionRate66.mmInterest}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate91, Optional<RateAndAmountFormat37Choice>> mmInterestRate = new MMMessageAssociationEnd<CorporateActionRate91, Optional<RateAndAmountFormat37Choice>>() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmInterest;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate91.mmObject();
			isDerived = false;
			xmlTag = "IntrstRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::INTR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Annualised interest rate of a financial instrument used to calculate the actual interest rate of the coupon or the accrued interest.";
			previousVersion_lazy = () -> CorporateActionRate66.mmInterest;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat37Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat37Choice> getValue(CorporateActionRate91 obj) {
			return obj.getInterestRate();
		}

		@Override
		public void setValue(CorporateActionRate91 obj, Optional<RateAndAmountFormat37Choice> value) {
			obj.setInterestRate(value.orElse(null));
		}
	};
	@XmlElement(name = "PctgSght")
	protected RateFormat7Choice percentageSought;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat7Choice
	 * RateFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmPercentageSought
	 * BiddingConditions.mmPercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91
	 * CorporateActionRate91}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PctgSght"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::PTSC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageSought"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of securities the offeror/issuer will purchase or redeem under the terms of the event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmPercentageSought
	 * CorporateActionRate66.mmPercentageSought}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate91, Optional<RateFormat7Choice>> mmPercentageSought = new MMMessageAssociationEnd<CorporateActionRate91, Optional<RateFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmPercentageSought;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate91.mmObject();
			isDerived = false;
			xmlTag = "PctgSght";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::PTSC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageSought";
			definition = "Percentage of securities the offeror/issuer will purchase or redeem under the terms of the event.";
			previousVersion_lazy = () -> CorporateActionRate66.mmPercentageSought;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat7Choice.mmObject();
		}

		@Override
		public Optional<RateFormat7Choice> getValue(CorporateActionRate91 obj) {
			return obj.getPercentageSought();
		}

		@Override
		public void setValue(CorporateActionRate91 obj, Optional<RateFormat7Choice> value) {
			obj.setPercentageSought(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdIndx")
	protected RateFormat3Choice relatedIndex;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRelatedIndex
	 * InterestCalculation.mmRelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91
	 * CorporateActionRate91}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdIndx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::RINR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Index rate related to the interest rate of the forthcoming interest payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmRelatedIndex
	 * CorporateActionRate66.mmRelatedIndex}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate91, Optional<RateFormat3Choice>> mmRelatedIndex = new MMMessageAssociationEnd<CorporateActionRate91, Optional<RateFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRelatedIndex;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate91.mmObject();
			isDerived = false;
			xmlTag = "RltdIndx";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::RINR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedIndex";
			definition = "Index rate related to the interest rate of the forthcoming interest payment.";
			previousVersion_lazy = () -> CorporateActionRate66.mmRelatedIndex;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}

		@Override
		public Optional<RateFormat3Choice> getValue(CorporateActionRate91 obj) {
			return obj.getRelatedIndex();
		}

		@Override
		public void setValue(CorporateActionRate91 obj, Optional<RateFormat3Choice> value) {
			obj.setRelatedIndex(value.orElse(null));
		}
	};
	@XmlElement(name = "Sprd")
	protected RateFormat3Choice spread;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSpread
	 * Security.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91
	 * CorporateActionRate91}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sprd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::RSPR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Margin allowed over or under a given rate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmSpread
	 * CorporateActionRate66.mmSpread}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate91, Optional<RateFormat3Choice>> mmSpread = new MMMessageAssociationEnd<CorporateActionRate91, Optional<RateFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmSpread;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate91.mmObject();
			isDerived = false;
			xmlTag = "Sprd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::RSPR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Spread";
			definition = "Margin allowed over or under a given rate.";
			previousVersion_lazy = () -> CorporateActionRate66.mmSpread;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}

		@Override
		public Optional<RateFormat3Choice> getValue(CorporateActionRate91 obj) {
			return obj.getSpread();
		}

		@Override
		public void setValue(CorporateActionRate91 obj, Optional<RateFormat3Choice> value) {
			obj.setSpread(value.orElse(null));
		}
	};
	@XmlElement(name = "BidIntrvl")
	protected RateAndAmountFormat38Choice bidInterval;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat38Choice
	 * RateAndAmountFormat38Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBidInterval
	 * BiddingConditions.mmBidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91
	 * CorporateActionRate91}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BidIntrvl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::BIDI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidInterval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acceptable price increment used for submitting a bid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmBidInterval
	 * CorporateActionRate66.mmBidInterval}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate91, Optional<RateAndAmountFormat38Choice>> mmBidInterval = new MMMessageAssociationEnd<CorporateActionRate91, Optional<RateAndAmountFormat38Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmBidInterval;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate91.mmObject();
			isDerived = false;
			xmlTag = "BidIntrvl";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::BIDI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidInterval";
			definition = "Acceptable price increment used for submitting a bid.";
			previousVersion_lazy = () -> CorporateActionRate66.mmBidInterval;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat38Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat38Choice> getValue(CorporateActionRate91 obj) {
			return obj.getBidInterval();
		}

		@Override
		public void setValue(CorporateActionRate91 obj, Optional<RateAndAmountFormat38Choice> value) {
			obj.setBidInterval(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsFctr")
	protected RateFormat12Choice previousFactor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat12Choice
	 * RateFormat12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmFactor Debt.mmFactor}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91
	 * CorporateActionRate91}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsFctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::PRFC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Factor used to calculate the value of the outstanding principal of the financial instrument (for factored securities) until the next redemption (factor) date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmPreviousFactor
	 * CorporateActionRate66.mmPreviousFactor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate91, Optional<RateFormat12Choice>> mmPreviousFactor = new MMMessageAssociationEnd<CorporateActionRate91, Optional<RateFormat12Choice>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate91.mmObject();
			isDerived = false;
			xmlTag = "PrvsFctr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::PRFC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousFactor";
			definition = "Factor used to calculate the value of the outstanding principal of the financial instrument (for factored securities) until the next redemption (factor) date.";
			previousVersion_lazy = () -> CorporateActionRate66.mmPreviousFactor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat12Choice.mmObject();
		}

		@Override
		public Optional<RateFormat12Choice> getValue(CorporateActionRate91 obj) {
			return obj.getPreviousFactor();
		}

		@Override
		public void setValue(CorporateActionRate91 obj, Optional<RateFormat12Choice> value) {
			obj.setPreviousFactor(value.orElse(null));
		}
	};
	@XmlElement(name = "NxtFctr")
	protected RateFormat12Choice nextFactor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat12Choice
	 * RateFormat12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmFactor Debt.mmFactor}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91
	 * CorporateActionRate91}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtFctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::NWFC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Factor used to calculate the value of the outstanding principal of the financial instrument (for factored securities) that will applicable after the redemption (factor) date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmNextFactor
	 * CorporateActionRate66.mmNextFactor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate91, Optional<RateFormat12Choice>> mmNextFactor = new MMMessageAssociationEnd<CorporateActionRate91, Optional<RateFormat12Choice>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate91.mmObject();
			isDerived = false;
			xmlTag = "NxtFctr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::NWFC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextFactor";
			definition = "Factor used to calculate the value of the outstanding principal of the financial instrument (for factored securities) that will applicable after the redemption (factor) date.";
			previousVersion_lazy = () -> CorporateActionRate66.mmNextFactor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat12Choice.mmObject();
		}

		@Override
		public Optional<RateFormat12Choice> getValue(CorporateActionRate91 obj) {
			return obj.getNextFactor();
		}

		@Override
		public void setValue(CorporateActionRate91 obj, Optional<RateFormat12Choice> value) {
			obj.setNextFactor(value.orElse(null));
		}
	};
	@XmlElement(name = "RinvstmtDscntRateToMkt")
	protected RateFormat3Choice reinvestmentDiscountRateToMarket;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmReinvestmentDiscountToMarket
	 * SecuritiesProceedsDefinition.mmReinvestmentDiscountToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91
	 * CorporateActionRate91}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RinvstmtDscntRateToMkt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::RDIS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentDiscountRateToMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of discount for securities purchased through a reinvestment scheme as compared to the current market price of security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmReinvestmentDiscountRateToMarket
	 * CorporateActionRate66.mmReinvestmentDiscountRateToMarket}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate91, Optional<RateFormat3Choice>> mmReinvestmentDiscountRateToMarket = new MMMessageAssociationEnd<CorporateActionRate91, Optional<RateFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmReinvestmentDiscountToMarket;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate91.mmObject();
			isDerived = false;
			xmlTag = "RinvstmtDscntRateToMkt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::RDIS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentDiscountRateToMarket";
			definition = "Rate of discount for securities purchased through a reinvestment scheme as compared to the current market price of security.";
			previousVersion_lazy = () -> CorporateActionRate66.mmReinvestmentDiscountRateToMarket;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}

		@Override
		public Optional<RateFormat3Choice> getValue(CorporateActionRate91 obj) {
			return obj.getReinvestmentDiscountRateToMarket();
		}

		@Override
		public void setValue(CorporateActionRate91 obj, Optional<RateFormat3Choice> value) {
			obj.setReinvestmentDiscountRateToMarket(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstShrtfll")
	protected RateAndAmountFormat39Choice interestShortfall;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat39Choice
	 * RateAndAmountFormat39Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmInterestShortfall
	 * Issuance.mmInterestShortfall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91
	 * CorporateActionRate91}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstShrtfll"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestShortfall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For structured security issues where there is a set schedule of principal and interest payments for the life of the issue, this is the difference between the actual rate of the interest payment and the expected or scheduled rate of the interest payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmInterestShortfall
	 * CorporateActionRate66.mmInterestShortfall}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRate91, Optional<RateAndAmountFormat39Choice>> mmInterestShortfall = new MMMessageAttribute<CorporateActionRate91, Optional<RateAndAmountFormat39Choice>>() {
		{
			businessElementTrace_lazy = () -> Issuance.mmInterestShortfall;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate91.mmObject();
			isDerived = false;
			xmlTag = "IntrstShrtfll";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestShortfall";
			definition = "For structured security issues where there is a set schedule of principal and interest payments for the life of the issue, this is the difference between the actual rate of the interest payment and the expected or scheduled rate of the interest payment.";
			previousVersion_lazy = () -> CorporateActionRate66.mmInterestShortfall;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat39Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat39Choice> getValue(CorporateActionRate91 obj) {
			return obj.getInterestShortfall();
		}

		@Override
		public void setValue(CorporateActionRate91 obj, Optional<RateAndAmountFormat39Choice> value) {
			obj.setInterestShortfall(value.orElse(null));
		}
	};
	@XmlElement(name = "RealsdLoss")
	protected RateAndAmountFormat39Choice realisedLoss;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat39Choice
	 * RateAndAmountFormat39Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmRealisedLoss
	 * Issuance.mmRealisedLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91
	 * CorporateActionRate91}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RealsdLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealisedLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For structured security issues where there is a set schedule of principal and interest payments for the life of the issue, this is the difference between the actual rate of the capital or principal repayment and the scheduled capital repayment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmRealisedLoss
	 * CorporateActionRate66.mmRealisedLoss}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRate91, Optional<RateAndAmountFormat39Choice>> mmRealisedLoss = new MMMessageAttribute<CorporateActionRate91, Optional<RateAndAmountFormat39Choice>>() {
		{
			businessElementTrace_lazy = () -> Issuance.mmRealisedLoss;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate91.mmObject();
			isDerived = false;
			xmlTag = "RealsdLoss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealisedLoss";
			definition = "For structured security issues where there is a set schedule of principal and interest payments for the life of the issue, this is the difference between the actual rate of the capital or principal repayment and the scheduled capital repayment.";
			previousVersion_lazy = () -> CorporateActionRate66.mmRealisedLoss;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat39Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat39Choice> getValue(CorporateActionRate91 obj) {
			return obj.getRealisedLoss();
		}

		@Override
		public void setValue(CorporateActionRate91 obj, Optional<RateAndAmountFormat39Choice> value) {
			obj.setRealisedLoss(value.orElse(null));
		}
	};
	@XmlElement(name = "DclrdRate")
	protected RateAndAmountFormat39Choice declaredRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat39Choice
	 * RateAndAmountFormat39Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91
	 * CorporateActionRate91}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend or interest rate declared by the issuer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmDeclaredRate
	 * CorporateActionRate66.mmDeclaredRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRate91, Optional<RateAndAmountFormat39Choice>> mmDeclaredRate = new MMMessageAttribute<CorporateActionRate91, Optional<RateAndAmountFormat39Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate91.mmObject();
			isDerived = false;
			xmlTag = "DclrdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRate";
			definition = "Dividend or interest rate declared by the issuer.";
			previousVersion_lazy = () -> CorporateActionRate66.mmDeclaredRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat39Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat39Choice> getValue(CorporateActionRate91 obj) {
			return obj.getDeclaredRate();
		}

		@Override
		public void setValue(CorporateActionRate91 obj, Optional<RateAndAmountFormat39Choice> value) {
			obj.setDeclaredRate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate91.mmInterestRate, com.tools20022.repository.msg.CorporateActionRate91.mmPercentageSought,
						com.tools20022.repository.msg.CorporateActionRate91.mmRelatedIndex, com.tools20022.repository.msg.CorporateActionRate91.mmSpread, com.tools20022.repository.msg.CorporateActionRate91.mmBidInterval,
						com.tools20022.repository.msg.CorporateActionRate91.mmPreviousFactor, com.tools20022.repository.msg.CorporateActionRate91.mmNextFactor,
						com.tools20022.repository.msg.CorporateActionRate91.mmReinvestmentDiscountRateToMarket, com.tools20022.repository.msg.CorporateActionRate91.mmInterestShortfall,
						com.tools20022.repository.msg.CorporateActionRate91.mmRealisedLoss, com.tools20022.repository.msg.CorporateActionRate91.mmDeclaredRate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeclaredRateRule.forCorporateActionRate91);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionRate91";
				definition = "Specifies rates of a corporate action.";
				previousVersion_lazy = () -> CorporateActionRate66.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RateAndAmountFormat37Choice> getInterestRate() {
		return interestRate == null ? Optional.empty() : Optional.of(interestRate);
	}

	public CorporateActionRate91 setInterestRate(RateAndAmountFormat37Choice interestRate) {
		this.interestRate = interestRate;
		return this;
	}

	public Optional<RateFormat7Choice> getPercentageSought() {
		return percentageSought == null ? Optional.empty() : Optional.of(percentageSought);
	}

	public CorporateActionRate91 setPercentageSought(RateFormat7Choice percentageSought) {
		this.percentageSought = percentageSought;
		return this;
	}

	public Optional<RateFormat3Choice> getRelatedIndex() {
		return relatedIndex == null ? Optional.empty() : Optional.of(relatedIndex);
	}

	public CorporateActionRate91 setRelatedIndex(RateFormat3Choice relatedIndex) {
		this.relatedIndex = relatedIndex;
		return this;
	}

	public Optional<RateFormat3Choice> getSpread() {
		return spread == null ? Optional.empty() : Optional.of(spread);
	}

	public CorporateActionRate91 setSpread(RateFormat3Choice spread) {
		this.spread = spread;
		return this;
	}

	public Optional<RateAndAmountFormat38Choice> getBidInterval() {
		return bidInterval == null ? Optional.empty() : Optional.of(bidInterval);
	}

	public CorporateActionRate91 setBidInterval(RateAndAmountFormat38Choice bidInterval) {
		this.bidInterval = bidInterval;
		return this;
	}

	public Optional<RateFormat12Choice> getPreviousFactor() {
		return previousFactor == null ? Optional.empty() : Optional.of(previousFactor);
	}

	public CorporateActionRate91 setPreviousFactor(RateFormat12Choice previousFactor) {
		this.previousFactor = previousFactor;
		return this;
	}

	public Optional<RateFormat12Choice> getNextFactor() {
		return nextFactor == null ? Optional.empty() : Optional.of(nextFactor);
	}

	public CorporateActionRate91 setNextFactor(RateFormat12Choice nextFactor) {
		this.nextFactor = nextFactor;
		return this;
	}

	public Optional<RateFormat3Choice> getReinvestmentDiscountRateToMarket() {
		return reinvestmentDiscountRateToMarket == null ? Optional.empty() : Optional.of(reinvestmentDiscountRateToMarket);
	}

	public CorporateActionRate91 setReinvestmentDiscountRateToMarket(RateFormat3Choice reinvestmentDiscountRateToMarket) {
		this.reinvestmentDiscountRateToMarket = reinvestmentDiscountRateToMarket;
		return this;
	}

	public Optional<RateAndAmountFormat39Choice> getInterestShortfall() {
		return interestShortfall == null ? Optional.empty() : Optional.of(interestShortfall);
	}

	public CorporateActionRate91 setInterestShortfall(RateAndAmountFormat39Choice interestShortfall) {
		this.interestShortfall = interestShortfall;
		return this;
	}

	public Optional<RateAndAmountFormat39Choice> getRealisedLoss() {
		return realisedLoss == null ? Optional.empty() : Optional.of(realisedLoss);
	}

	public CorporateActionRate91 setRealisedLoss(RateAndAmountFormat39Choice realisedLoss) {
		this.realisedLoss = realisedLoss;
		return this;
	}

	public Optional<RateAndAmountFormat39Choice> getDeclaredRate() {
		return declaredRate == null ? Optional.empty() : Optional.of(declaredRate);
	}

	public CorporateActionRate91 setDeclaredRate(RateAndAmountFormat39Choice declaredRate) {
		this.declaredRate = declaredRate;
		return this;
	}
}