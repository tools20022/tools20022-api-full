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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.RateAndAmountFormat3Choice;
import com.tools20022.repository.choice.RateFormat2Choice;
import com.tools20022.repository.choice.RateFormat3Choice;
import com.tools20022.repository.choice.RateFormat5Choice;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#mmInterest
 * CorporateActionRate3.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#mmPercentageSought
 * CorporateActionRate3.mmPercentageSought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#mmRelatedIndex
 * CorporateActionRate3.mmRelatedIndex}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRate3#mmSpread
 * CorporateActionRate3.mmSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#mmBidInterval
 * CorporateActionRate3.mmBidInterval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#mmPreviousFactor
 * CorporateActionRate3.mmPreviousFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#mmNextFactor
 * CorporateActionRate3.mmNextFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#mmReinvestmentDiscountRateToMarket
 * CorporateActionRate3.mmReinvestmentDiscountRateToMarket}</li>
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
 * "CorporateActionRate3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies rates of a corporate action."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionRate3", propOrder = {"interest", "percentageSought", "relatedIndex", "spread", "bidInterval", "previousFactor", "nextFactor", "reinvestmentDiscountRateToMarket"})
public class CorporateActionRate3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Intrst")
	protected RateAndAmountFormat3Choice interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat3Choice
	 * RateAndAmountFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmInterest
	 * CashProceedsDefinition.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3
	 * CorporateActionRate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::INTR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Annual rate of a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterest = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmInterest;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate3.mmObject();
			isDerived = false;
			xmlTag = "Intrst";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::INTR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Annual rate of a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "PctgSght")
	protected RateFormat5Choice percentageSought;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat5Choice
	 * RateFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmPercentageSought
	 * BiddingConditions.mmPercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3
	 * CorporateActionRate3}</li>
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
	 * "Percentage of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\"."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPercentageSought = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmPercentageSought;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate3.mmObject();
			isDerived = false;
			xmlTag = "PctgSght";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::PTSC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageSought";
			definition = "Percentage of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat5Choice.mmObject();
		}
	};
	@XmlElement(name = "RltdIndx")
	protected RateFormat2Choice relatedIndex;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat2Choice
	 * RateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRelatedIndex
	 * InterestCalculation.mmRelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3
	 * CorporateActionRate3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmRelatedIndex = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRelatedIndex;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate3.mmObject();
			isDerived = false;
			xmlTag = "RltdIndx";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::RINR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedIndex";
			definition = "Index rate related to the interest rate of the forthcoming interest payment.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "Sprd")
	protected RateFormat2Choice spread;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat2Choice
	 * RateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSpread
	 * Security.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3
	 * CorporateActionRate3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSpread = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmSpread;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate3.mmObject();
			isDerived = false;
			xmlTag = "Sprd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::RSPR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Spread";
			definition = "Margin allowed over or under a given rate.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "BidIntrvl")
	protected RateAndAmountFormat3Choice bidInterval;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat3Choice
	 * RateAndAmountFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBidInterval
	 * BiddingConditions.mmBidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3
	 * CorporateActionRate3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmBidInterval = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmBidInterval;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate3.mmObject();
			isDerived = false;
			xmlTag = "BidIntrvl";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::BIDI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidInterval";
			definition = "Acceptable price increment used for submitting a bid.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "PrvsFctr")
	protected RateFormat3Choice previousFactor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmFactor Debt.mmFactor}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3
	 * CorporateActionRate3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousFactor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate3.mmObject();
			isDerived = false;
			xmlTag = "PrvsFctr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::PRFC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousFactor";
			definition = "Factor used to calculate the value of the outstanding principal of the financial instrument (for factored securities) until the next redemption (factor) date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "NxtFctr")
	protected RateFormat3Choice nextFactor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmFactor Debt.mmFactor}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3
	 * CorporateActionRate3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextFactor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate3.mmObject();
			isDerived = false;
			xmlTag = "NxtFctr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::NWFC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextFactor";
			definition = "Factor used to calculate the value of the outstanding principal of the financial instrument (for factored securities) that will applicable after the redemption (factor) date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "RinvstmtDscntRateToMkt")
	protected RateFormat2Choice reinvestmentDiscountRateToMarket;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat2Choice
	 * RateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmReinvestmentDiscountToMarket
	 * SecuritiesProceedsDefinition.mmReinvestmentDiscountToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3
	 * CorporateActionRate3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmReinvestmentDiscountRateToMarket = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmReinvestmentDiscountToMarket;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate3.mmObject();
			isDerived = false;
			xmlTag = "RinvstmtDscntRateToMkt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::RDIS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentDiscountRateToMarket";
			definition = "Rate of discount for securities purchased through a reinvestment scheme as compared to the current market price of security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate3.mmInterest, com.tools20022.repository.msg.CorporateActionRate3.mmPercentageSought,
						com.tools20022.repository.msg.CorporateActionRate3.mmRelatedIndex, com.tools20022.repository.msg.CorporateActionRate3.mmSpread, com.tools20022.repository.msg.CorporateActionRate3.mmBidInterval,
						com.tools20022.repository.msg.CorporateActionRate3.mmPreviousFactor, com.tools20022.repository.msg.CorporateActionRate3.mmNextFactor,
						com.tools20022.repository.msg.CorporateActionRate3.mmReinvestmentDiscountRateToMarket);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionRate3";
				definition = "Specifies rates of a corporate action.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RateAndAmountFormat3Choice> getInterest() {
		return interest == null ? Optional.empty() : Optional.of(interest);
	}

	public CorporateActionRate3 setInterest(RateAndAmountFormat3Choice interest) {
		this.interest = interest;
		return this;
	}

	public Optional<RateFormat5Choice> getPercentageSought() {
		return percentageSought == null ? Optional.empty() : Optional.of(percentageSought);
	}

	public CorporateActionRate3 setPercentageSought(RateFormat5Choice percentageSought) {
		this.percentageSought = percentageSought;
		return this;
	}

	public Optional<RateFormat2Choice> getRelatedIndex() {
		return relatedIndex == null ? Optional.empty() : Optional.of(relatedIndex);
	}

	public CorporateActionRate3 setRelatedIndex(RateFormat2Choice relatedIndex) {
		this.relatedIndex = relatedIndex;
		return this;
	}

	public Optional<RateFormat2Choice> getSpread() {
		return spread == null ? Optional.empty() : Optional.of(spread);
	}

	public CorporateActionRate3 setSpread(RateFormat2Choice spread) {
		this.spread = spread;
		return this;
	}

	public Optional<RateAndAmountFormat3Choice> getBidInterval() {
		return bidInterval == null ? Optional.empty() : Optional.of(bidInterval);
	}

	public CorporateActionRate3 setBidInterval(RateAndAmountFormat3Choice bidInterval) {
		this.bidInterval = bidInterval;
		return this;
	}

	public Optional<RateFormat3Choice> getPreviousFactor() {
		return previousFactor == null ? Optional.empty() : Optional.of(previousFactor);
	}

	public CorporateActionRate3 setPreviousFactor(RateFormat3Choice previousFactor) {
		this.previousFactor = previousFactor;
		return this;
	}

	public Optional<RateFormat3Choice> getNextFactor() {
		return nextFactor == null ? Optional.empty() : Optional.of(nextFactor);
	}

	public CorporateActionRate3 setNextFactor(RateFormat3Choice nextFactor) {
		this.nextFactor = nextFactor;
		return this;
	}

	public Optional<RateFormat2Choice> getReinvestmentDiscountRateToMarket() {
		return reinvestmentDiscountRateToMarket == null ? Optional.empty() : Optional.of(reinvestmentDiscountRateToMarket);
	}

	public CorporateActionRate3 setReinvestmentDiscountRateToMarket(RateFormat2Choice reinvestmentDiscountRateToMarket) {
		this.reinvestmentDiscountRateToMarket = reinvestmentDiscountRateToMarket;
		return this;
	}
}