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
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmGeographics
 * FinancialInstrumentStipulations.mmGeographics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmYieldRange
 * FinancialInstrumentStipulations.mmYieldRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmRating
 * FinancialInstrumentStipulations.mmRating}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmCouponRange
 * FinancialInstrumentStipulations.mmCouponRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmAmortisableIndicator
 * FinancialInstrumentStipulations.mmAmortisableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmPurpose
 * FinancialInstrumentStipulations.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmAlternativeMinimumTaxIndicator
 * FinancialInstrumentStipulations.mmAlternativeMinimumTaxIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmAutoReinvestment
 * FinancialInstrumentStipulations.mmAutoReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmTransactionConditions
 * FinancialInstrumentStipulations.mmTransactionConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmCurrency
 * FinancialInstrumentStipulations.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmCustomDate
 * FinancialInstrumentStipulations.mmCustomDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmHaircut
 * FinancialInstrumentStipulations.mmHaircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmInsuredIndicator
 * FinancialInstrumentStipulations.mmInsuredIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmLookBack
 * FinancialInstrumentStipulations.mmLookBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmMaturityDate
 * FinancialInstrumentStipulations.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmIssueDate
 * FinancialInstrumentStipulations.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmIssuerIdentification
 * FinancialInstrumentStipulations.mmIssuerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmIssueSize
 * FinancialInstrumentStipulations.mmIssueSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmMinimumDenomination
 * FinancialInstrumentStipulations.mmMinimumDenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmMaximumSubstitution
 * FinancialInstrumentStipulations.mmMaximumSubstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmMinimumIncrement
 * FinancialInstrumentStipulations.mmMinimumIncrement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmPaymentFrequency
 * FinancialInstrumentStipulations.mmPaymentFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmMinimumQuantity
 * FinancialInstrumentStipulations.mmMinimumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmProduction
 * FinancialInstrumentStipulations.mmProduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmRestrictedIndicator
 * FinancialInstrumentStipulations.mmRestrictedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmPriceFrequency
 * FinancialInstrumentStipulations.mmPriceFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmSector
 * FinancialInstrumentStipulations.mmSector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmSubstitutionFrequency
 * FinancialInstrumentStipulations.mmSubstitutionFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmSubstitutionLeft
 * FinancialInstrumentStipulations.mmSubstitutionLeft}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmWholePoolIndicator
 * FinancialInstrumentStipulations.mmWholePoolIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmPriceSource
 * FinancialInstrumentStipulations.mmPriceSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmExpirationDate
 * FinancialInstrumentStipulations.mmExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmOverAllotmentAmount
 * FinancialInstrumentStipulations.mmOverAllotmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmOverAllotmentRate
 * FinancialInstrumentStipulations.mmOverAllotmentRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmPriceRange
 * FinancialInstrumentStipulations.mmPriceRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmCallableIndicator
 * FinancialInstrumentStipulations.mmCallableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmConvertibleIndicator
 * FinancialInstrumentStipulations.mmConvertibleIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmPutableIndicator
 * FinancialInstrumentStipulations.mmPutableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmPreFundedIndicator
 * FinancialInstrumentStipulations.mmPreFundedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmEscrowedIndicator
 * FinancialInstrumentStipulations.mmEscrowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmPerpetualIndicator
 * FinancialInstrumentStipulations.mmPerpetualIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentStipulations"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Additional restrictions on the financial instrument, related to the stipulation."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FinancialInstrumentStipulations", propOrder = {"geographics", "yieldRange", "rating", "couponRange", "amortisableIndicator", "purpose", "alternativeMinimumTaxIndicator", "autoReinvestment", "transactionConditions",
		"currency", "customDate", "haircut", "insuredIndicator", "lookBack", "maturityDate", "issueDate", "issuerIdentification", "issueSize", "minimumDenomination", "maximumSubstitution", "minimumIncrement", "paymentFrequency",
		"minimumQuantity", "production", "restrictedIndicator", "priceFrequency", "sector", "substitutionFrequency", "substitutionLeft", "wholePoolIndicator", "priceSource", "expirationDate", "overAllotmentAmount", "overAllotmentRate",
		"priceRange", "callableIndicator", "convertibleIndicator", "putableIndicator", "preFundedIndicator", "escrowedIndicator", "perpetualIndicator"})
public class FinancialInstrumentStipulations {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text geographics;
	/**
	 * Type of stipulation expressing geographical constraints on a fixed income
	 * instrument. It is expressed with a state or country abbreviation and a
	 * minimum or maximum percentage. Example: CA 0-80 (minimum of 80 percent in
	 * Californian assests).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Geogcs"</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
			isDerived = false;
			xmlTag = "Geogcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Geographics";
			definition = "Type of stipulation expressing geographical constraints on a fixed income instrument. It is expressed with a state or country abbreviation and a minimum or maximum percentage. Example: CA 0-80 (minimum of 80 percent in Californian assests).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected AmountOrPercentageRange yieldRange;
	/**
	 * Range of allowed yield.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected Rating1 rating;
	/**
	 * Range of assessment of securities credit and investment risk.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected AmountOrPercentageRange couponRange;
	/**
	 * Identification of a range of coupon numbers attached to its related
	 * financial instrument.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected YesNoIndicator amortisableIndicator;
	/**
	 * Indicates whether the financial instrument repays the principal amount in
	 * parts during the life cycle of the security.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected Max256Text purpose;
	/**
	 * Reason for which money is raised through the issuance of a security.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected YesNoIndicator alternativeMinimumTaxIndicator;
	/**
	 * Identifies whether the issue is subject to alternative minimum taxation
	 * (used for municipal bonds).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			businessElementTrace_lazy = () -> Debt.mmAmortisableIndicator;
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected PercentageRate autoReinvestment;
	/**
	 * Indicates an instruction to reinvest dividends in the underlying security
	 * (or proceeds at maturity in a similar instrument) if the current rate is
	 * &lt;rate&gt; or better.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected TradeTransactionCondition2Code transactionConditions;
	/**
	 * Indicates the conditions under which the order/trade is to be/was
	 * executed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected CurrencyCode currency;
	/**
	 * Currency in which a security is issued or redenominated.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected DateTimePeriodDetails1 customDate;
	/**
	 * Indicates an instruction to override an investment's default start and/or
	 * end date with a custom date.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected PercentageRate haircut;
	/**
	 * Haircut or valuation factor on the security expressed as a percentage.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmHaircut
	 * AssetHolding.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			businessElementTrace_lazy = () -> AssetHolding.mmHaircut;
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected YesNoIndicator insuredIndicator;
	/**
	 * Identifies whether the lender is assured partial or full payment by a
	 * third party if the borrower defaults.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected Number lookBack;
	/**
	 * Indicates an instruction or attribute giving the number of days to be
	 * included in the look-back period for the investment. E.g. some options
	 * allow exercise based on the underlying asset's optimal value over the
	 * look-back period.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LookBck"</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
			isDerived = false;
			xmlTag = "LookBck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LookBack";
			definition = "Indicates an instruction or attribute giving the number of days to be included in the look-back period for the investment. E.g. some options allow exercise based on the underlying asset's optimal value over the look-back period.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ISOYearMonth maturityDate;
	/**
	 * Indicates the maturity date.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected ISOYearMonth issueDate;
	/**
	 * Indicates the issue date.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected IBEIIdentifier issuerIdentification;
	/**
	 * Identification of the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.IBEIIdentifier
	 * IBEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICNonFI
	 * OrganisationIdentification.mmBICNonFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
			isDerived = false;
			xmlTag = "IssrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerIdentification";
			definition = "Identification of the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IBEIIdentifier.mmObject();
		}
	};
	protected Number issueSize;
	/**
	 * Identifies the issue size range.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected FinancialInstrumentQuantityChoice minimumDenomination;
	/**
	 * Indicates the minimum denomination of a security.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected Number maximumSubstitution;
	/**
	 * Maximum number of time the collateral can be substitute.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected FinancialInstrumentQuantityChoice minimumIncrement;
	/**
	 * Indicates the minimum tradable increments of a security.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected Frequency1Code paymentFrequency;
	/**
	 * Indicates the periodic or regular cycle of interest payments.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected FinancialInstrumentQuantityChoice minimumQuantity;
	/**
	 * Indicates the minimum tradable quantity of a security.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected Max35Text production;
	/**
	 * Indicates a search criterion used when looking to buy a bond,
	 * particularly an MBS, issued in a particular year.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected YesNoIndicator restrictedIndicator;
	/**
	 * Identifies if the securities is restricted or not (as per Rule 144).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected Frequency1Code priceFrequency;
	/**
	 * Indicates the frequency at which the bond is re-rated and therefore
	 * re-priced (bond attribute, particularly of floating rate and index linked
	 * instruments).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected Max35Text sector;
	/**
	 * Indicates the market sector the security is classified as. E.g.
	 * pharmacuticals, automobile, housing, etc.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
	 * "Indicates the market sector the security is classified as.  E.g. pharmacuticals, automobile, housing, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSector = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmSector;
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
			isDerived = false;
			xmlTag = "Sctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sector";
			definition = "Indicates the market sector the security is classified as.  E.g. pharmacuticals, automobile, housing, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Frequency1Code substitutionFrequency;
	/**
	 * Indicates the maximum number of times collateral can be substituted.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected Number substitutionLeft;
	/**
	 * Number of remaining times the collateral can be substitute.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected YesNoIndicator wholePoolIndicator;
	/**
	 * Indicates a search criterion when looking to buy an MBS that either is
	 * [yes] or is not [no] an entire pool.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected Max35Text priceSource;
	/**
	 * Identifies the Benchmark source price (eg. BB Generic, BB Fairvalue,
	 * Brokertec..).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
	 * "Identifies the Benchmark source price (eg. BB Generic, BB Fairvalue, Brokertec..)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceSource = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
			isDerived = false;
			xmlTag = "PricSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceSource";
			definition = "Identifies the Benchmark source price (eg. BB Generic, BB Fairvalue, Brokertec..).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODateTime expirationDate;
	/**
	 * Date/time at which an interest bearing security becomes due and assets
	 * are to be repaid.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected ActiveCurrencyAndAmount overAllotmentAmount;
	/**
	 * Amount for which a security can be overalloted (as in greenshoe option).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected PercentageRate overAllotmentRate;
	/**
	 * Percentage for which a security can be overalloted (as in greenshoe
	 * option).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected AmountOrPercentageRange priceRange;
	/**
	 * Indicates a search criterion used when looking to buy a bond within a
	 * particular price range.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected YesNoIndicator callableIndicator;
	/**
	 * Indicates whether the issuer has the right to pay the security prior to
	 * maturity. Also called RetractableIndicator.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected YesNoIndicator convertibleIndicator;
	/**
	 * Indicates whether the interest bearing security is convertible into
	 * another type of security.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected YesNoIndicator putableIndicator;
	/**
	 * Indicates whether the holder has the right to ask for redemption of the
	 * security prior to final maturity. Also called RedeemableIndicator.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected YesNoIndicator preFundedIndicator;
	/**
	 * Indicates whether an interest bearing instrument is deposited in a fund
	 * that will be used to pay debt service on refunded securities.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected YesNoIndicator escrowedIndicator;
	/**
	 * Indicates whether an interest bearing instrument is being escrowed or
	 * collateralized either by direct obligations guaranteed by the US
	 * government, or by other types of securities. The maturity schedules of
	 * the securities in the escrow fund are determined in such a way to pay the
	 * maturity value, coupon, and premium payments (if any) of the refunded
	 * bonds.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
	protected YesNoIndicator perpetualIndicator;
	/**
	 * Indicates whether the security has no maturity date.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
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
			componentContext_lazy = () -> FinancialInstrumentStipulations.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(FinancialInstrumentStipulations.mmGeographics, FinancialInstrumentStipulations.mmYieldRange, FinancialInstrumentStipulations.mmRating, FinancialInstrumentStipulations.mmCouponRange,
						FinancialInstrumentStipulations.mmAmortisableIndicator, FinancialInstrumentStipulations.mmPurpose, FinancialInstrumentStipulations.mmAlternativeMinimumTaxIndicator,
						FinancialInstrumentStipulations.mmAutoReinvestment, FinancialInstrumentStipulations.mmTransactionConditions, FinancialInstrumentStipulations.mmCurrency, FinancialInstrumentStipulations.mmCustomDate,
						FinancialInstrumentStipulations.mmHaircut, FinancialInstrumentStipulations.mmInsuredIndicator, FinancialInstrumentStipulations.mmLookBack, FinancialInstrumentStipulations.mmMaturityDate,
						FinancialInstrumentStipulations.mmIssueDate, FinancialInstrumentStipulations.mmIssuerIdentification, FinancialInstrumentStipulations.mmIssueSize, FinancialInstrumentStipulations.mmMinimumDenomination,
						FinancialInstrumentStipulations.mmMaximumSubstitution, FinancialInstrumentStipulations.mmMinimumIncrement, FinancialInstrumentStipulations.mmPaymentFrequency, FinancialInstrumentStipulations.mmMinimumQuantity,
						FinancialInstrumentStipulations.mmProduction, FinancialInstrumentStipulations.mmRestrictedIndicator, FinancialInstrumentStipulations.mmPriceFrequency, FinancialInstrumentStipulations.mmSector,
						FinancialInstrumentStipulations.mmSubstitutionFrequency, FinancialInstrumentStipulations.mmSubstitutionLeft, FinancialInstrumentStipulations.mmWholePoolIndicator, FinancialInstrumentStipulations.mmPriceSource,
						FinancialInstrumentStipulations.mmExpirationDate, FinancialInstrumentStipulations.mmOverAllotmentAmount, FinancialInstrumentStipulations.mmOverAllotmentRate, FinancialInstrumentStipulations.mmPriceRange,
						FinancialInstrumentStipulations.mmCallableIndicator, FinancialInstrumentStipulations.mmConvertibleIndicator, FinancialInstrumentStipulations.mmPutableIndicator, FinancialInstrumentStipulations.mmPreFundedIndicator,
						FinancialInstrumentStipulations.mmEscrowedIndicator, FinancialInstrumentStipulations.mmPerpetualIndicator);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "FinancialInstrumentStipulations";
				definition = "Additional restrictions on the financial instrument, related to the stipulation.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Geogcs")
	public Max35Text getGeographics() {
		return geographics;
	}

	public void setGeographics(Max35Text geographics) {
		this.geographics = geographics;
	}

	@XmlElement(name = "YldRg")
	public AmountOrPercentageRange getYieldRange() {
		return yieldRange;
	}

	public void setYieldRange(com.tools20022.repository.msg.AmountOrPercentageRange yieldRange) {
		this.yieldRange = yieldRange;
	}

	@XmlElement(name = "Ratg")
	public Rating1 getRating() {
		return rating;
	}

	public void setRating(com.tools20022.repository.msg.Rating1 rating) {
		this.rating = rating;
	}

	@XmlElement(name = "CpnRg")
	public AmountOrPercentageRange getCouponRange() {
		return couponRange;
	}

	public void setCouponRange(com.tools20022.repository.msg.AmountOrPercentageRange couponRange) {
		this.couponRange = couponRange;
	}

	@XmlElement(name = "AmtsblInd")
	public YesNoIndicator getAmortisableIndicator() {
		return amortisableIndicator;
	}

	public void setAmortisableIndicator(YesNoIndicator amortisableIndicator) {
		this.amortisableIndicator = amortisableIndicator;
	}

	@XmlElement(name = "Purp")
	public Max256Text getPurpose() {
		return purpose;
	}

	public void setPurpose(Max256Text purpose) {
		this.purpose = purpose;
	}

	@XmlElement(name = "AltrntvMinTaxInd")
	public YesNoIndicator getAlternativeMinimumTaxIndicator() {
		return alternativeMinimumTaxIndicator;
	}

	public void setAlternativeMinimumTaxIndicator(YesNoIndicator alternativeMinimumTaxIndicator) {
		this.alternativeMinimumTaxIndicator = alternativeMinimumTaxIndicator;
	}

	@XmlElement(name = "AutoRinvstmt")
	public PercentageRate getAutoReinvestment() {
		return autoReinvestment;
	}

	public void setAutoReinvestment(PercentageRate autoReinvestment) {
		this.autoReinvestment = autoReinvestment;
	}

	@XmlElement(name = "TxConds")
	public TradeTransactionCondition2Code getTransactionConditions() {
		return transactionConditions;
	}

	public void setTransactionConditions(TradeTransactionCondition2Code transactionConditions) {
		this.transactionConditions = transactionConditions;
	}

	@XmlElement(name = "Ccy")
	public CurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyCode currency) {
		this.currency = currency;
	}

	@XmlElement(name = "CstmDt")
	public DateTimePeriodDetails1 getCustomDate() {
		return customDate;
	}

	public void setCustomDate(com.tools20022.repository.msg.DateTimePeriodDetails1 customDate) {
		this.customDate = customDate;
	}

	@XmlElement(name = "Hrcut")
	public PercentageRate getHaircut() {
		return haircut;
	}

	public void setHaircut(PercentageRate haircut) {
		this.haircut = haircut;
	}

	@XmlElement(name = "InsrdInd")
	public YesNoIndicator getInsuredIndicator() {
		return insuredIndicator;
	}

	public void setInsuredIndicator(YesNoIndicator insuredIndicator) {
		this.insuredIndicator = insuredIndicator;
	}

	@XmlElement(name = "LookBck")
	public Number getLookBack() {
		return lookBack;
	}

	public void setLookBack(Number lookBack) {
		this.lookBack = lookBack;
	}

	@XmlElement(name = "MtrtyDt")
	public ISOYearMonth getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(ISOYearMonth maturityDate) {
		this.maturityDate = maturityDate;
	}

	@XmlElement(name = "IsseDt")
	public ISOYearMonth getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(ISOYearMonth issueDate) {
		this.issueDate = issueDate;
	}

	@XmlElement(name = "IssrId")
	public IBEIIdentifier getIssuerIdentification() {
		return issuerIdentification;
	}

	public void setIssuerIdentification(IBEIIdentifier issuerIdentification) {
		this.issuerIdentification = issuerIdentification;
	}

	@XmlElement(name = "IsseSz")
	public Number getIssueSize() {
		return issueSize;
	}

	public void setIssueSize(Number issueSize) {
		this.issueSize = issueSize;
	}

	@XmlElement(name = "MinDnmtn")
	public FinancialInstrumentQuantityChoice getMinimumDenomination() {
		return minimumDenomination;
	}

	public void setMinimumDenomination(FinancialInstrumentQuantityChoice minimumDenomination) {
		this.minimumDenomination = minimumDenomination;
	}

	@XmlElement(name = "MaxSbstitn")
	public Number getMaximumSubstitution() {
		return maximumSubstitution;
	}

	public void setMaximumSubstitution(Number maximumSubstitution) {
		this.maximumSubstitution = maximumSubstitution;
	}

	@XmlElement(name = "MinIncrmt")
	public FinancialInstrumentQuantityChoice getMinimumIncrement() {
		return minimumIncrement;
	}

	public void setMinimumIncrement(FinancialInstrumentQuantityChoice minimumIncrement) {
		this.minimumIncrement = minimumIncrement;
	}

	@XmlElement(name = "PmtFrqcy")
	public Frequency1Code getPaymentFrequency() {
		return paymentFrequency;
	}

	public void setPaymentFrequency(Frequency1Code paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}

	@XmlElement(name = "MinQty")
	public FinancialInstrumentQuantityChoice getMinimumQuantity() {
		return minimumQuantity;
	}

	public void setMinimumQuantity(FinancialInstrumentQuantityChoice minimumQuantity) {
		this.minimumQuantity = minimumQuantity;
	}

	@XmlElement(name = "Pdctn")
	public Max35Text getProduction() {
		return production;
	}

	public void setProduction(Max35Text production) {
		this.production = production;
	}

	@XmlElement(name = "RstrctdInd")
	public YesNoIndicator getRestrictedIndicator() {
		return restrictedIndicator;
	}

	public void setRestrictedIndicator(YesNoIndicator restrictedIndicator) {
		this.restrictedIndicator = restrictedIndicator;
	}

	@XmlElement(name = "PricFrqcy")
	public Frequency1Code getPriceFrequency() {
		return priceFrequency;
	}

	public void setPriceFrequency(Frequency1Code priceFrequency) {
		this.priceFrequency = priceFrequency;
	}

	@XmlElement(name = "Sctr")
	public Max35Text getSector() {
		return sector;
	}

	public void setSector(Max35Text sector) {
		this.sector = sector;
	}

	@XmlElement(name = "SbstitnFrqcy")
	public Frequency1Code getSubstitutionFrequency() {
		return substitutionFrequency;
	}

	public void setSubstitutionFrequency(Frequency1Code substitutionFrequency) {
		this.substitutionFrequency = substitutionFrequency;
	}

	@XmlElement(name = "SbstitnLft")
	public Number getSubstitutionLeft() {
		return substitutionLeft;
	}

	public void setSubstitutionLeft(Number substitutionLeft) {
		this.substitutionLeft = substitutionLeft;
	}

	@XmlElement(name = "WhlPoolInd")
	public YesNoIndicator getWholePoolIndicator() {
		return wholePoolIndicator;
	}

	public void setWholePoolIndicator(YesNoIndicator wholePoolIndicator) {
		this.wholePoolIndicator = wholePoolIndicator;
	}

	@XmlElement(name = "PricSrc")
	public Max35Text getPriceSource() {
		return priceSource;
	}

	public void setPriceSource(Max35Text priceSource) {
		this.priceSource = priceSource;
	}

	@XmlElement(name = "XprtnDt")
	public ISODateTime getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(ISODateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	@XmlElement(name = "OverAlltmtAmt")
	public ActiveCurrencyAndAmount getOverAllotmentAmount() {
		return overAllotmentAmount;
	}

	public void setOverAllotmentAmount(ActiveCurrencyAndAmount overAllotmentAmount) {
		this.overAllotmentAmount = overAllotmentAmount;
	}

	@XmlElement(name = "OverAlltmtRate")
	public PercentageRate getOverAllotmentRate() {
		return overAllotmentRate;
	}

	public void setOverAllotmentRate(PercentageRate overAllotmentRate) {
		this.overAllotmentRate = overAllotmentRate;
	}

	@XmlElement(name = "PricRg")
	public AmountOrPercentageRange getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(com.tools20022.repository.msg.AmountOrPercentageRange priceRange) {
		this.priceRange = priceRange;
	}

	@XmlElement(name = "CllblInd")
	public YesNoIndicator getCallableIndicator() {
		return callableIndicator;
	}

	public void setCallableIndicator(YesNoIndicator callableIndicator) {
		this.callableIndicator = callableIndicator;
	}

	@XmlElement(name = "ConvtblInd")
	public YesNoIndicator getConvertibleIndicator() {
		return convertibleIndicator;
	}

	public void setConvertibleIndicator(YesNoIndicator convertibleIndicator) {
		this.convertibleIndicator = convertibleIndicator;
	}

	@XmlElement(name = "PutblInd")
	public YesNoIndicator getPutableIndicator() {
		return putableIndicator;
	}

	public void setPutableIndicator(YesNoIndicator putableIndicator) {
		this.putableIndicator = putableIndicator;
	}

	@XmlElement(name = "PreFnddInd")
	public YesNoIndicator getPreFundedIndicator() {
		return preFundedIndicator;
	}

	public void setPreFundedIndicator(YesNoIndicator preFundedIndicator) {
		this.preFundedIndicator = preFundedIndicator;
	}

	@XmlElement(name = "EscrwdInd")
	public YesNoIndicator getEscrowedIndicator() {
		return escrowedIndicator;
	}

	public void setEscrowedIndicator(YesNoIndicator escrowedIndicator) {
		this.escrowedIndicator = escrowedIndicator;
	}

	@XmlElement(name = "PerptlInd")
	public YesNoIndicator getPerpetualIndicator() {
		return perpetualIndicator;
	}

	public void setPerpetualIndicator(YesNoIndicator perpetualIndicator) {
		this.perpetualIndicator = perpetualIndicator;
	}
}