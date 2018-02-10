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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03;
import com.tools20022.repository.choice.FinancialInstrumentQuantityChoice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.Frequency1Code;
import com.tools20022.repository.codeset.TradeTransactionCondition2Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Additional restrictions on the financial instrument, related to the
 * stipulation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmGeographics
 * FinancialInstrumentStipulations2.mmGeographics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmYieldRange
 * FinancialInstrumentStipulations2.mmYieldRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmRating
 * FinancialInstrumentStipulations2.mmRating}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmCouponRange
 * FinancialInstrumentStipulations2.mmCouponRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmAmortisableIndicator
 * FinancialInstrumentStipulations2.mmAmortisableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmPurpose
 * FinancialInstrumentStipulations2.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmAlternativeMinimumTaxIndicator
 * FinancialInstrumentStipulations2.mmAlternativeMinimumTaxIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmAutoReinvestment
 * FinancialInstrumentStipulations2.mmAutoReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmTransactionConditions
 * FinancialInstrumentStipulations2.mmTransactionConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmCurrency
 * FinancialInstrumentStipulations2.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmCustomDate
 * FinancialInstrumentStipulations2.mmCustomDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmHaircut
 * FinancialInstrumentStipulations2.mmHaircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmInsuredIndicator
 * FinancialInstrumentStipulations2.mmInsuredIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmLookBack
 * FinancialInstrumentStipulations2.mmLookBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmMaturityDate
 * FinancialInstrumentStipulations2.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmIssueDate
 * FinancialInstrumentStipulations2.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmIssuerIdentification
 * FinancialInstrumentStipulations2.mmIssuerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmIssueSize
 * FinancialInstrumentStipulations2.mmIssueSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmMinimumDenomination
 * FinancialInstrumentStipulations2.mmMinimumDenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmMaximumSubstitution
 * FinancialInstrumentStipulations2.mmMaximumSubstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmMinimumIncrement
 * FinancialInstrumentStipulations2.mmMinimumIncrement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmPaymentFrequency
 * FinancialInstrumentStipulations2.mmPaymentFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmMinimumQuantity
 * FinancialInstrumentStipulations2.mmMinimumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmProduction
 * FinancialInstrumentStipulations2.mmProduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmRestrictedIndicator
 * FinancialInstrumentStipulations2.mmRestrictedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmPriceFrequency
 * FinancialInstrumentStipulations2.mmPriceFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmSector
 * FinancialInstrumentStipulations2.mmSector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmSubstitutionFrequency
 * FinancialInstrumentStipulations2.mmSubstitutionFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmSubstitutionLeft
 * FinancialInstrumentStipulations2.mmSubstitutionLeft}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmWholePoolIndicator
 * FinancialInstrumentStipulations2.mmWholePoolIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmPriceSource
 * FinancialInstrumentStipulations2.mmPriceSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmExpirationDate
 * FinancialInstrumentStipulations2.mmExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmOverAllotmentAmount
 * FinancialInstrumentStipulations2.mmOverAllotmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmOverAllotmentRate
 * FinancialInstrumentStipulations2.mmOverAllotmentRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmPriceRange
 * FinancialInstrumentStipulations2.mmPriceRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmCallableIndicator
 * FinancialInstrumentStipulations2.mmCallableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmConvertibleIndicator
 * FinancialInstrumentStipulations2.mmConvertibleIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmPutableIndicator
 * FinancialInstrumentStipulations2.mmPutableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmPreFundedIndicator
 * FinancialInstrumentStipulations2.mmPreFundedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmEscrowedIndicator
 * FinancialInstrumentStipulations2.mmEscrowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmPerpetualIndicator
 * FinancialInstrumentStipulations2.mmPerpetualIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmStipulations
 * SecuritiesTradeConfirmationV01.mmStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02#mmStipulations
 * SecuritiesTradeConfirmationV02.mmStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmStipulations
 * SecuritiesTradeConfirmationV03.mmStipulations}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = FIXSynonym: 233, 234</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentStipulations2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Additional restrictions on the financial instrument, related to the stipulation."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentStipulations2", propOrder = {"geographics", "yieldRange", "rating", "couponRange", "amortisableIndicator", "purpose", "alternativeMinimumTaxIndicator", "autoReinvestment", "transactionConditions",
		"currency", "customDate", "haircut", "insuredIndicator", "lookBack", "maturityDate", "issueDate", "issuerIdentification", "issueSize", "minimumDenomination", "maximumSubstitution", "minimumIncrement", "paymentFrequency",
		"minimumQuantity", "production", "restrictedIndicator", "priceFrequency", "sector", "substitutionFrequency", "substitutionLeft", "wholePoolIndicator", "priceSource", "expirationDate", "overAllotmentAmount", "overAllotmentRate",
		"priceRange", "callableIndicator", "convertibleIndicator", "putableIndicator", "preFundedIndicator", "escrowedIndicator", "perpetualIndicator"})
public class FinancialInstrumentStipulations2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Geogcs")
	protected Max35Text geographics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Geogcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 233 value GEOG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Geographics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of stipulation expressing geographical constraints on a fixed income instrument. It is expressed with a state or country abbreviation and a minimum or maximum percentage. Example: CA 0-80 (minimum of 80 percent in Californian assests)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGeographics = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "Geogcs";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "233 value GEOG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Geographics";
			definition = "Type of stipulation expressing geographical constraints on a fixed income instrument. It is expressed with a state or country abbreviation and a minimum or maximum percentage. Example: CA 0-80 (minimum of 80 percent in Californian assests).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "YldRg")
	protected AmountOrPercentageRange yieldRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountOrPercentageRange
	 * AmountOrPercentageRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmYieldCalculation
	 * SecuritiesPricing.mmYieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "YldRg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Range of allowed yield."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmYieldRange = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmYieldCalculation;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "YldRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YieldRange";
			definition = "Range of allowed yield.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountOrPercentageRange.mmObject();
		}
	};
	@XmlElement(name = "Ratg")
	protected Rating1 rating;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Rating1 Rating1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRating
	 * Security.mmRating}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ratg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rating"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Range of assessment of securities credit and investment risk."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRating = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmRating;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "Ratg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rating";
			definition = "Range of assessment of securities credit and investment risk.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Rating1.mmObject();
		}
	};
	@XmlElement(name = "CpnRg")
	protected AmountOrPercentageRange couponRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountOrPercentageRange
	 * AmountOrPercentageRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmCouponAttached
	 * Security.mmCouponAttached}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpnRg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a range of coupon numbers attached to its related financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCouponRange = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmCouponAttached;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "CpnRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponRange";
			definition = "Identification of a range of coupon numbers attached to its related financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountOrPercentageRange.mmObject();
		}
	};
	@XmlElement(name = "AmtsblInd")
	protected YesNoIndicator amortisableIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmAmortisableIndicator
	 * Debt.mmAmortisableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtsblInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmortisableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the financial instrument repays the principal amount in parts during the life cycle of the security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmortisableIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmAmortisableIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "AmtsblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmortisableIndicator";
			definition = "Indicates whether the financial instrument repays the principal amount in parts during the life cycle of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "Purp")
	protected Max256Text purpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmPurpose
	 * Issuance.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for which money is raised through the issuance of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPurpose = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Issuance.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Reason for which money is raised through the issuance of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	@XmlElement(name = "AltrntvMinTaxInd")
	protected YesNoIndicator alternativeMinimumTaxIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmAlternativeMinimumTax
	 * Debt.mmAlternativeMinimumTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AltrntvMinTaxInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternativeMinimumTaxIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the issue is subject to alternative minimum taxation (used for municipal bonds)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAlternativeMinimumTaxIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmAlternativeMinimumTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "AltrntvMinTaxInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternativeMinimumTaxIndicator";
			definition = "Identifies whether the issue is subject to alternative minimum taxation (used for municipal bonds).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "AutoRinvstmt")
	protected PercentageRate autoReinvestment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmAutoReinvestment
	 * Debt.mmAutoReinvestment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AutoRinvstmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an instruction to reinvest dividends in the underlying security (or proceeds at maturity in a similar instrument) if the current rate is &lt;rate&gt; or better."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAutoReinvestment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmAutoReinvestment;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "AutoRinvstmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoReinvestment";
			definition = "Indicates an instruction to reinvest dividends in the underlying security (or proceeds at maturity in a similar instrument) if the current rate is <rate> or better.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "TxConds")
	protected TradeTransactionCondition2Code transactionConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition2Code
	 * TradeTransactionCondition2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeTransactionCondition
	 * SecuritiesTrade.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the conditions under which the order/trade is to be/was executed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionConditions = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeTransactionCondition;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "TxConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionConditions";
			definition = "Indicates the conditions under which the order/trade is to be/was executed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradeTransactionCondition2Code.mmObject();
		}
	};
	@XmlElement(name = "Ccy")
	protected CurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmDenominationCurrency
	 * Security.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which a security is issued or redenominated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmDenominationCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency in which a security is issued or redenominated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "CstmDt")
	protected DateTimePeriodDetails1 customDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails1
	 * DateTimePeriodDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmCustomDate
	 * Debt.mmCustomDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an instruction to override an investment's default start and/or end date with a custom date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCustomDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Debt.mmCustomDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "CstmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomDate";
			definition = "Indicates an instruction to override an investment's default start and/or end date with a custom date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DateTimePeriodDetails1.mmObject();
		}
	};
	@XmlElement(name = "Hrcut")
	protected PercentageRate haircut;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.HaircutValuation#mmHaircut
	 * HaircutValuation.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hrcut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Haircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Haircut or valuation factor on the security expressed as a percentage."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHaircut = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> HaircutValuation.mmHaircut;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "Hrcut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Haircut";
			definition = "Haircut or valuation factor on the security expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "InsrdInd")
	protected YesNoIndicator insuredIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmInsuredIndicator
	 * Debt.mmInsuredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InsrdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuredIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the lender is assured partial or full payment by a third party if the borrower defaults."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInsuredIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmInsuredIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "InsrdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuredIndicator";
			definition = "Identifies whether the lender is assured partial or full payment by a third party if the borrower defaults.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "LookBck")
	protected Number lookBack;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmLookBack
	 * Debt.mmLookBack}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LookBck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TTCO//GTDL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LookBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an instruction or attribute giving the number of days to be included in the look-back period for the investment. E.g. some options allow exercise based on the underlying asset's optimal value over the look-back period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLookBack = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmLookBack;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "LookBck";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TTCO//GTDL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LookBack";
			definition = "Indicates an instruction or attribute giving the number of days to be included in the look-back period for the investment. E.g. some options allow exercise based on the underlying asset's optimal value over the look-back period.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "MtrtyDt")
	protected ISOYearMonth maturityDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the maturity date."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaturityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Indicates the maturity date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}
	};
	@XmlElement(name = "IsseDt")
	protected ISOYearMonth issueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueDate
	 * Issuance.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the issue date."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Indicates the issue date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}
	};
	@XmlElement(name = "IssrId")
	protected BICNonFIIdentifier issuerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICNonFIIdentifier
	 * BICNonFIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICNonFI
	 * OrganisationIdentification.mmBICNonFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the issuer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuerIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICNonFI;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "IssrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerIdentification";
			definition = "Identification of the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICNonFIIdentifier.mmObject();
		}
	};
	@XmlElement(name = "IsseSz")
	protected Number issueSize;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueSize
	 * Issuance.mmIssueSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseSz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the issue size range."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssueSize = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueSize;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "IsseSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueSize";
			definition = "Identifies the issue size range.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "MinDnmtn")
	protected FinancialInstrumentQuantityChoice minimumDenomination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmMinimumDenomination
	 * Debt.mmMinimumDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinDnmtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumDenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the minimum denomination of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumDenomination = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmMinimumDenomination;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "MinDnmtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumDenomination";
			definition = "Indicates the minimum denomination of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	@XmlElement(name = "MaxSbstitn")
	protected Number maximumSubstitution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmMaximumSubstitution
	 * Debt.mmMaximumSubstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxSbstitn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumSubstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum number of time the collateral can be substitute."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumSubstitution = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmMaximumSubstitution;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "MaxSbstitn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumSubstitution";
			definition = "Maximum number of time the collateral can be substitute.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "MinIncrmt")
	protected FinancialInstrumentQuantityChoice minimumIncrement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmMinimumIncrement
	 * Debt.mmMinimumIncrement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinIncrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumIncrement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the minimum tradable increments of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumIncrement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmMinimumIncrement;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "MinIncrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumIncrement";
			definition = "Indicates the minimum tradable increments of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	@XmlElement(name = "PmtFrqcy")
	protected Frequency1Code paymentFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency1Code
	 * Frequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmPaymentFrequency
	 * InterestCalculation.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the periodic or regular cycle of interest payments."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmPaymentFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "PmtFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentFrequency";
			definition = "Indicates the periodic or regular cycle of interest payments.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency1Code.mmObject();
		}
	};
	@XmlElement(name = "MinQty")
	protected FinancialInstrumentQuantityChoice minimumQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmMinimumQuantity
	 * Security.mmMinimumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the minimum tradable quantity of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmMinimumQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "MinQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumQuantity";
			definition = "Indicates the minimum tradable quantity of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	@XmlElement(name = "Pdctn")
	protected Max35Text production;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmProduction
	 * Debt.mmProduction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pdctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Production"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a search criterion used when looking to buy a bond, particularly an MBS, issued in a particular year."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProduction = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmProduction;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "Pdctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Production";
			definition = "Indicates a search criterion used when looking to buy a bond, particularly an MBS, issued in a particular year.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "RstrctdInd")
	protected YesNoIndicator restrictedIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmRestricted
	 * Debt.mmRestricted}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RstrctdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies if the securities is restricted or not (as per Rule 144)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRestrictedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmRestricted;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "RstrctdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictedIndicator";
			definition = "Identifies if the securities is restricted or not (as per Rule 144).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "PricFrqcy")
	protected Frequency1Code priceFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency1Code
	 * Frequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPriceFrequency
	 * Debt.mmPriceFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the frequency at which the bond is re-rated and therefore re-priced (bond attribute, particularly of floating rate and index linked instruments)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPriceFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "PricFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceFrequency";
			definition = "Indicates the frequency at which the bond is re-rated and therefore re-priced (bond attribute, particularly of floating rate and index linked instruments).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency1Code.mmObject();
		}
	};
	@XmlElement(name = "Sctr")
	protected Max35Text sector;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSector
	 * Security.mmSector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the market sector the security is classified as. E.g. pharmacuticals, automobile, housing, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSector = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmSector;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "Sctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sector";
			definition = "Indicates the market sector the security is classified as. E.g. pharmacuticals, automobile, housing, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "SbstitnFrqcy")
	protected Frequency1Code substitutionFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency1Code
	 * Frequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmSubstitutionFrequency
	 * Debt.mmSubstitutionFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbstitnFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstitutionFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the maximum number of times collateral can be substituted."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubstitutionFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmSubstitutionFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "SbstitnFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubstitutionFrequency";
			definition = "Indicates the maximum number of times collateral can be substituted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency1Code.mmObject();
		}
	};
	@XmlElement(name = "SbstitnLft")
	protected Number substitutionLeft;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmSubstitutionLeft
	 * Debt.mmSubstitutionLeft}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbstitnLft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstitutionLeft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of remaining times the collateral can be substitute."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubstitutionLeft = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmSubstitutionLeft;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "SbstitnLft";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubstitutionLeft";
			definition = "Number of remaining times the collateral can be substitute.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "WhlPoolInd")
	protected YesNoIndicator wholePoolIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmWholePool
	 * Debt.mmWholePool}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhlPoolInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WholePoolIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a search criterion when looking to buy an MBS that either is [yes] or is not [no] an entire pool."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWholePoolIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmWholePool;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "WhlPoolInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WholePoolIndicator";
			definition = "Indicates a search criterion when looking to buy an MBS that either is [yes] or is not [no] an entire pool.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "PricSrc")
	protected Max35Text priceSource;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricSrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the Benchmark source price (eg. BB Generic, BB Fairvalue, Brokertec.)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceSource = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "PricSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceSource";
			definition = "Identifies the Benchmark source price (eg. BB Generic, BB Fairvalue, Brokertec.).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "XprtnDt")
	protected ISODateTime expirationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmExpiryDate
	 * Asset.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XprtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an interest bearing security becomes due and assets are to be repaid."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpirationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmExpiryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "XprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpirationDate";
			definition = "Date/time at which an interest bearing security becomes due and assets are to be repaid.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "OverAlltmtAmt")
	protected ActiveCurrencyAndAmount overAllotmentAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmOverAllotmentAmount
	 * Debt.mmOverAllotmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OverAlltmtAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAllotmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount for which a security can be overalloted (as in greenshoe option)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOverAllotmentAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmOverAllotmentAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "OverAlltmtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverAllotmentAmount";
			definition = "Amount for which a security can be overalloted (as in greenshoe option).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "OverAlltmtRate")
	protected PercentageRate overAllotmentRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmOverAllotmentRate
	 * Debt.mmOverAllotmentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OverAlltmtRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAllotmentRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage for which a security can be overalloted (as in greenshoe option)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOverAllotmentRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmOverAllotmentRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "OverAlltmtRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverAllotmentRate";
			definition = "Percentage for which a security can be overalloted (as in greenshoe option).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "PricRg")
	protected AmountOrPercentageRange priceRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountOrPercentageRange
	 * AmountOrPercentageRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPricing
	 * Security.mmPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricRg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a search criterion used when looking to buy a bond within a particular price range."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceRange = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmPricing;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "PricRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceRange";
			definition = "Indicates a search criterion used when looking to buy a bond within a particular price range.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountOrPercentageRange.mmObject();
		}
	};
	@XmlElement(name = "CllblInd")
	protected YesNoIndicator callableIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmCallableIndicator
	 * Debt.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CllblInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the issuer has the right to pay the security prior to maturity. Also called RetractableIndicator."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCallableIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmCallableIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "CllblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallableIndicator";
			definition = "Indicates whether the issuer has the right to pay the security prior to maturity. Also called RetractableIndicator.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "ConvtblInd")
	protected YesNoIndicator convertibleIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmConvertibleIndicator
	 * Debt.mmConvertibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvtblInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest bearing security is convertible into another type of security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConvertibleIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmConvertibleIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "ConvtblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleIndicator";
			definition = "Indicates whether the interest bearing security is convertible into another type of security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "PutblInd")
	protected YesNoIndicator putableIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPutableIndicator
	 * Debt.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PutblInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the holder has the right to ask for redemption of the security prior to final maturity. Also called RedeemableIndicator."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPutableIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPutableIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "PutblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutableIndicator";
			definition = "Indicates whether the holder has the right to ask for redemption of the security prior to final maturity. Also called RedeemableIndicator.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "PreFnddInd")
	protected YesNoIndicator preFundedIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPreFundedIndicator
	 * Debt.mmPreFundedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PreFnddInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreFundedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an interest bearing instrument is deposited in a fund that will be used to pay debt service on refunded securities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreFundedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPreFundedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "PreFnddInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreFundedIndicator";
			definition = "Indicates whether an interest bearing instrument is deposited in a fund that will be used to pay debt service on refunded securities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "EscrwdInd")
	protected YesNoIndicator escrowedIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmEscrowedIndicator
	 * Debt.mmEscrowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EscrwdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EscrowedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an interest bearing instrument is being escrowed or collateralized either by direct obligations guaranteed by the US government, or by other types of securities. The maturity schedules of the securities in the escrow fund are determined in such a way to pay the maturity value, coupon, and premium payments (if any) of the refunded bonds."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEscrowedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmEscrowedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "EscrwdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EscrowedIndicator";
			definition = "Indicates whether an interest bearing instrument is being escrowed or collateralized either by direct obligations guaranteed by the US government, or by other types of securities. The maturity schedules of the securities in the escrow fund are determined in such a way to pay the maturity value, coupon, and premium payments (if any) of the refunded bonds.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "PerptlInd")
	protected YesNoIndicator perpetualIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPerpetualIndicator
	 * Debt.mmPerpetualIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PerptlInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerpetualIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the security has no maturity date."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPerpetualIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPerpetualIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmObject();
			isDerived = false;
			xmlTag = "PerptlInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerpetualIndicator";
			definition = "Indicates whether the security has no maturity date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmGeographics, com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmYieldRange,
						com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmRating, com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmCouponRange,
						com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmAmortisableIndicator, com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmPurpose,
						com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmAlternativeMinimumTaxIndicator, com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmAutoReinvestment,
						com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmTransactionConditions, com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmCurrency,
						com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmCustomDate, com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmHaircut,
						com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmInsuredIndicator, com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmLookBack,
						com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmMaturityDate, com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmIssueDate,
						com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmIssuerIdentification, com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmIssueSize,
						com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmMinimumDenomination, com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmMaximumSubstitution,
						com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmMinimumIncrement, com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmPaymentFrequency,
						com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmMinimumQuantity, com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmProduction,
						com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmRestrictedIndicator, com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmPriceFrequency,
						com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmSector, com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmSubstitutionFrequency,
						com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmSubstitutionLeft, com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmWholePoolIndicator,
						com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmPriceSource, com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmExpirationDate,
						com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmOverAllotmentAmount, com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmOverAllotmentRate,
						com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmPriceRange, com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmCallableIndicator,
						com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmConvertibleIndicator, com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmPutableIndicator,
						com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmPreFundedIndicator, com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmEscrowedIndicator,
						com.tools20022.repository.msg.FinancialInstrumentStipulations2.mmPerpetualIndicator);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationV01.mmStipulations, SecuritiesTradeConfirmationV02.mmStipulations, SecuritiesTradeConfirmationV03.mmStipulations);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "233, 234"));
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "FinancialInstrumentStipulations2";
				definition = "Additional restrictions on the financial instrument, related to the stipulation.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getGeographics() {
		return geographics == null ? Optional.empty() : Optional.of(geographics);
	}

	public FinancialInstrumentStipulations2 setGeographics(Max35Text geographics) {
		this.geographics = geographics;
		return this;
	}

	public Optional<AmountOrPercentageRange> getYieldRange() {
		return yieldRange == null ? Optional.empty() : Optional.of(yieldRange);
	}

	public FinancialInstrumentStipulations2 setYieldRange(com.tools20022.repository.msg.AmountOrPercentageRange yieldRange) {
		this.yieldRange = yieldRange;
		return this;
	}

	public Optional<Rating1> getRating() {
		return rating == null ? Optional.empty() : Optional.of(rating);
	}

	public FinancialInstrumentStipulations2 setRating(com.tools20022.repository.msg.Rating1 rating) {
		this.rating = rating;
		return this;
	}

	public Optional<AmountOrPercentageRange> getCouponRange() {
		return couponRange == null ? Optional.empty() : Optional.of(couponRange);
	}

	public FinancialInstrumentStipulations2 setCouponRange(com.tools20022.repository.msg.AmountOrPercentageRange couponRange) {
		this.couponRange = couponRange;
		return this;
	}

	public Optional<YesNoIndicator> getAmortisableIndicator() {
		return amortisableIndicator == null ? Optional.empty() : Optional.of(amortisableIndicator);
	}

	public FinancialInstrumentStipulations2 setAmortisableIndicator(YesNoIndicator amortisableIndicator) {
		this.amortisableIndicator = amortisableIndicator;
		return this;
	}

	public Optional<Max256Text> getPurpose() {
		return purpose == null ? Optional.empty() : Optional.of(purpose);
	}

	public FinancialInstrumentStipulations2 setPurpose(Max256Text purpose) {
		this.purpose = purpose;
		return this;
	}

	public Optional<YesNoIndicator> getAlternativeMinimumTaxIndicator() {
		return alternativeMinimumTaxIndicator == null ? Optional.empty() : Optional.of(alternativeMinimumTaxIndicator);
	}

	public FinancialInstrumentStipulations2 setAlternativeMinimumTaxIndicator(YesNoIndicator alternativeMinimumTaxIndicator) {
		this.alternativeMinimumTaxIndicator = alternativeMinimumTaxIndicator;
		return this;
	}

	public Optional<PercentageRate> getAutoReinvestment() {
		return autoReinvestment == null ? Optional.empty() : Optional.of(autoReinvestment);
	}

	public FinancialInstrumentStipulations2 setAutoReinvestment(PercentageRate autoReinvestment) {
		this.autoReinvestment = autoReinvestment;
		return this;
	}

	public Optional<TradeTransactionCondition2Code> getTransactionConditions() {
		return transactionConditions == null ? Optional.empty() : Optional.of(transactionConditions);
	}

	public FinancialInstrumentStipulations2 setTransactionConditions(TradeTransactionCondition2Code transactionConditions) {
		this.transactionConditions = transactionConditions;
		return this;
	}

	public Optional<CurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public FinancialInstrumentStipulations2 setCurrency(CurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<DateTimePeriodDetails1> getCustomDate() {
		return customDate == null ? Optional.empty() : Optional.of(customDate);
	}

	public FinancialInstrumentStipulations2 setCustomDate(com.tools20022.repository.msg.DateTimePeriodDetails1 customDate) {
		this.customDate = customDate;
		return this;
	}

	public Optional<PercentageRate> getHaircut() {
		return haircut == null ? Optional.empty() : Optional.of(haircut);
	}

	public FinancialInstrumentStipulations2 setHaircut(PercentageRate haircut) {
		this.haircut = haircut;
		return this;
	}

	public Optional<YesNoIndicator> getInsuredIndicator() {
		return insuredIndicator == null ? Optional.empty() : Optional.of(insuredIndicator);
	}

	public FinancialInstrumentStipulations2 setInsuredIndicator(YesNoIndicator insuredIndicator) {
		this.insuredIndicator = insuredIndicator;
		return this;
	}

	public Optional<Number> getLookBack() {
		return lookBack == null ? Optional.empty() : Optional.of(lookBack);
	}

	public FinancialInstrumentStipulations2 setLookBack(Number lookBack) {
		this.lookBack = lookBack;
		return this;
	}

	public Optional<ISOYearMonth> getMaturityDate() {
		return maturityDate == null ? Optional.empty() : Optional.of(maturityDate);
	}

	public FinancialInstrumentStipulations2 setMaturityDate(ISOYearMonth maturityDate) {
		this.maturityDate = maturityDate;
		return this;
	}

	public Optional<ISOYearMonth> getIssueDate() {
		return issueDate == null ? Optional.empty() : Optional.of(issueDate);
	}

	public FinancialInstrumentStipulations2 setIssueDate(ISOYearMonth issueDate) {
		this.issueDate = issueDate;
		return this;
	}

	public Optional<BICNonFIIdentifier> getIssuerIdentification() {
		return issuerIdentification == null ? Optional.empty() : Optional.of(issuerIdentification);
	}

	public FinancialInstrumentStipulations2 setIssuerIdentification(BICNonFIIdentifier issuerIdentification) {
		this.issuerIdentification = issuerIdentification;
		return this;
	}

	public Optional<Number> getIssueSize() {
		return issueSize == null ? Optional.empty() : Optional.of(issueSize);
	}

	public FinancialInstrumentStipulations2 setIssueSize(Number issueSize) {
		this.issueSize = issueSize;
		return this;
	}

	public Optional<FinancialInstrumentQuantityChoice> getMinimumDenomination() {
		return minimumDenomination == null ? Optional.empty() : Optional.of(minimumDenomination);
	}

	public FinancialInstrumentStipulations2 setMinimumDenomination(FinancialInstrumentQuantityChoice minimumDenomination) {
		this.minimumDenomination = minimumDenomination;
		return this;
	}

	public Optional<Number> getMaximumSubstitution() {
		return maximumSubstitution == null ? Optional.empty() : Optional.of(maximumSubstitution);
	}

	public FinancialInstrumentStipulations2 setMaximumSubstitution(Number maximumSubstitution) {
		this.maximumSubstitution = maximumSubstitution;
		return this;
	}

	public Optional<FinancialInstrumentQuantityChoice> getMinimumIncrement() {
		return minimumIncrement == null ? Optional.empty() : Optional.of(minimumIncrement);
	}

	public FinancialInstrumentStipulations2 setMinimumIncrement(FinancialInstrumentQuantityChoice minimumIncrement) {
		this.minimumIncrement = minimumIncrement;
		return this;
	}

	public Optional<Frequency1Code> getPaymentFrequency() {
		return paymentFrequency == null ? Optional.empty() : Optional.of(paymentFrequency);
	}

	public FinancialInstrumentStipulations2 setPaymentFrequency(Frequency1Code paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
		return this;
	}

	public Optional<FinancialInstrumentQuantityChoice> getMinimumQuantity() {
		return minimumQuantity == null ? Optional.empty() : Optional.of(minimumQuantity);
	}

	public FinancialInstrumentStipulations2 setMinimumQuantity(FinancialInstrumentQuantityChoice minimumQuantity) {
		this.minimumQuantity = minimumQuantity;
		return this;
	}

	public Optional<Max35Text> getProduction() {
		return production == null ? Optional.empty() : Optional.of(production);
	}

	public FinancialInstrumentStipulations2 setProduction(Max35Text production) {
		this.production = production;
		return this;
	}

	public Optional<YesNoIndicator> getRestrictedIndicator() {
		return restrictedIndicator == null ? Optional.empty() : Optional.of(restrictedIndicator);
	}

	public FinancialInstrumentStipulations2 setRestrictedIndicator(YesNoIndicator restrictedIndicator) {
		this.restrictedIndicator = restrictedIndicator;
		return this;
	}

	public Optional<Frequency1Code> getPriceFrequency() {
		return priceFrequency == null ? Optional.empty() : Optional.of(priceFrequency);
	}

	public FinancialInstrumentStipulations2 setPriceFrequency(Frequency1Code priceFrequency) {
		this.priceFrequency = priceFrequency;
		return this;
	}

	public Optional<Max35Text> getSector() {
		return sector == null ? Optional.empty() : Optional.of(sector);
	}

	public FinancialInstrumentStipulations2 setSector(Max35Text sector) {
		this.sector = sector;
		return this;
	}

	public Optional<Frequency1Code> getSubstitutionFrequency() {
		return substitutionFrequency == null ? Optional.empty() : Optional.of(substitutionFrequency);
	}

	public FinancialInstrumentStipulations2 setSubstitutionFrequency(Frequency1Code substitutionFrequency) {
		this.substitutionFrequency = substitutionFrequency;
		return this;
	}

	public Optional<Number> getSubstitutionLeft() {
		return substitutionLeft == null ? Optional.empty() : Optional.of(substitutionLeft);
	}

	public FinancialInstrumentStipulations2 setSubstitutionLeft(Number substitutionLeft) {
		this.substitutionLeft = substitutionLeft;
		return this;
	}

	public Optional<YesNoIndicator> getWholePoolIndicator() {
		return wholePoolIndicator == null ? Optional.empty() : Optional.of(wholePoolIndicator);
	}

	public FinancialInstrumentStipulations2 setWholePoolIndicator(YesNoIndicator wholePoolIndicator) {
		this.wholePoolIndicator = wholePoolIndicator;
		return this;
	}

	public Optional<Max35Text> getPriceSource() {
		return priceSource == null ? Optional.empty() : Optional.of(priceSource);
	}

	public FinancialInstrumentStipulations2 setPriceSource(Max35Text priceSource) {
		this.priceSource = priceSource;
		return this;
	}

	public Optional<ISODateTime> getExpirationDate() {
		return expirationDate == null ? Optional.empty() : Optional.of(expirationDate);
	}

	public FinancialInstrumentStipulations2 setExpirationDate(ISODateTime expirationDate) {
		this.expirationDate = expirationDate;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getOverAllotmentAmount() {
		return overAllotmentAmount == null ? Optional.empty() : Optional.of(overAllotmentAmount);
	}

	public FinancialInstrumentStipulations2 setOverAllotmentAmount(ActiveCurrencyAndAmount overAllotmentAmount) {
		this.overAllotmentAmount = overAllotmentAmount;
		return this;
	}

	public Optional<PercentageRate> getOverAllotmentRate() {
		return overAllotmentRate == null ? Optional.empty() : Optional.of(overAllotmentRate);
	}

	public FinancialInstrumentStipulations2 setOverAllotmentRate(PercentageRate overAllotmentRate) {
		this.overAllotmentRate = overAllotmentRate;
		return this;
	}

	public Optional<AmountOrPercentageRange> getPriceRange() {
		return priceRange == null ? Optional.empty() : Optional.of(priceRange);
	}

	public FinancialInstrumentStipulations2 setPriceRange(com.tools20022.repository.msg.AmountOrPercentageRange priceRange) {
		this.priceRange = priceRange;
		return this;
	}

	public Optional<YesNoIndicator> getCallableIndicator() {
		return callableIndicator == null ? Optional.empty() : Optional.of(callableIndicator);
	}

	public FinancialInstrumentStipulations2 setCallableIndicator(YesNoIndicator callableIndicator) {
		this.callableIndicator = callableIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getConvertibleIndicator() {
		return convertibleIndicator == null ? Optional.empty() : Optional.of(convertibleIndicator);
	}

	public FinancialInstrumentStipulations2 setConvertibleIndicator(YesNoIndicator convertibleIndicator) {
		this.convertibleIndicator = convertibleIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getPutableIndicator() {
		return putableIndicator == null ? Optional.empty() : Optional.of(putableIndicator);
	}

	public FinancialInstrumentStipulations2 setPutableIndicator(YesNoIndicator putableIndicator) {
		this.putableIndicator = putableIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getPreFundedIndicator() {
		return preFundedIndicator == null ? Optional.empty() : Optional.of(preFundedIndicator);
	}

	public FinancialInstrumentStipulations2 setPreFundedIndicator(YesNoIndicator preFundedIndicator) {
		this.preFundedIndicator = preFundedIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getEscrowedIndicator() {
		return escrowedIndicator == null ? Optional.empty() : Optional.of(escrowedIndicator);
	}

	public FinancialInstrumentStipulations2 setEscrowedIndicator(YesNoIndicator escrowedIndicator) {
		this.escrowedIndicator = escrowedIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getPerpetualIndicator() {
		return perpetualIndicator == null ? Optional.empty() : Optional.of(perpetualIndicator);
	}

	public FinancialInstrumentStipulations2 setPerpetualIndicator(YesNoIndicator perpetualIndicator) {
		this.perpetualIndicator = perpetualIndicator;
		return this;
	}
}