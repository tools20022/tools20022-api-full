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
import com.tools20022.repository.choice.MarketIdentification4Choice;
import com.tools20022.repository.choice.SafekeepingPlaceFormat4Choice;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.RestrictedFINXMax350Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Net position of a segregated holding, in a single security, within the
 * overall position held in a securities account at a specified place of
 * safekeeping.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace18.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmPlaceOfListing
 * AggregateBalancePerSafekeepingPlace18.mmPlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace18.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmPriceDetails
 * AggregateBalancePerSafekeepingPlace18.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmForeignExchangeDetails
 * AggregateBalancePerSafekeepingPlace18.mmForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmDaysAccrued
 * AggregateBalancePerSafekeepingPlace18.mmDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmAccountBaseCurrencyAmounts
 * AggregateBalancePerSafekeepingPlace18.mmAccountBaseCurrencyAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmInstrumentCurrencyAmounts
 * AggregateBalancePerSafekeepingPlace18.mmInstrumentCurrencyAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmAlternateReportingCurrencyAmounts
 * AggregateBalancePerSafekeepingPlace18.mmAlternateReportingCurrencyAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmQuantityBreakdown
 * AggregateBalancePerSafekeepingPlace18.mmQuantityBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmBalanceBreakdown
 * AggregateBalancePerSafekeepingPlace18.mmBalanceBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmAdditionalBalanceBreakdown
 * AggregateBalancePerSafekeepingPlace18.mmAdditionalBalanceBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmHoldingAdditionalDetails
 * AggregateBalancePerSafekeepingPlace18.mmHoldingAdditionalDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline#forAggregateBalancePerSafekeepingPlace18
 * ConstraintAggregateBalanceGuideline.forAggregateBalancePerSafekeepingPlace18}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule#forAggregateBalancePerSafekeepingPlace18
 * ConstraintHoldingAdditionalDetailsRule.
 * forAggregateBalancePerSafekeepingPlace18}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forAggregateBalancePerSafekeepingPlace18
 * ConstraintCoexistenceAmountRule.forAggregateBalancePerSafekeepingPlace18}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AggregateBalancePerSafekeepingPlace18"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Net position of a segregated holding, in a single security, within the overall position held in a securities account at a specified place of safekeeping."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AggregateBalancePerSafekeepingPlace18", propOrder = {"safekeepingPlace", "placeOfListing", "aggregateBalance", "priceDetails", "foreignExchangeDetails", "daysAccrued", "accountBaseCurrencyAmounts",
		"instrumentCurrencyAmounts", "alternateReportingCurrencyAmounts", "quantityBreakdown", "balanceBreakdown", "additionalBalanceBreakdown", "holdingAdditionalDetails"})
public class AggregateBalancePerSafekeepingPlace18 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SfkpgPlc", required = true)
	protected SafekeepingPlaceFormat4Choice safekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat4Choice
	 * SafekeepingPlaceFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18
	 * AggregateBalancePerSafekeepingPlace18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94a::SAFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSafekeepingPlace = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94a::SAFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SafekeepingPlaceFormat4Choice.mmObject();
		}
	};
	@XmlElement(name = "PlcOfListg")
	protected MarketIdentification4Choice placeOfListing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification4Choice
	 * MarketIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
	 * Security.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18
	 * AggregateBalancePerSafekeepingPlace18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfListg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94B::PLIS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market(s) on which the security is listed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlaceOfListing = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmObject();
			isDerived = false;
			xmlTag = "PlcOfListg";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94B::PLIS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Market(s) on which the security is listed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketIdentification4Choice.mmObject();
		}
	};
	@XmlElement(name = "AggtBal", required = true)
	protected Balance2 aggregateBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Balance2 Balance2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18
	 * AggregateBalancePerSafekeepingPlace18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AggtBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93B::AGGR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregateBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of financial instruments of the balance."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAggregateBalance = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmObject();
			isDerived = false;
			xmlTag = "AggtBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::AGGR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalance";
			definition = "Total quantity of financial instruments of the balance.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Balance2.mmObject();
		}
	};
	@XmlElement(name = "PricDtls", required = true)
	protected List<com.tools20022.repository.msg.PriceInformation7> priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PriceInformation7
	 * PriceInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPricing
	 * Security.mmPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18
	 * AggregateBalancePerSafekeepingPlace18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price of the financial instrument in one or more currencies."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPriceDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmPricing;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Price of the financial instrument in one or more currencies.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PriceInformation7.mmObject();
		}
	};
	@XmlElement(name = "FXDtls")
	protected List<com.tools20022.repository.msg.ForeignExchangeTerms16> foreignExchangeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms16
	 * ForeignExchangeTerms16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmExchangeRate
	 * SecuritiesBalance.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18
	 * AggregateBalancePerSafekeepingPlace18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92B::EXCH</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information needed to process a currency exchange or conversion."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmForeignExchangeDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92B::EXCH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Information needed to process a currency exchange or conversion.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms16.mmObject();
		}
	};
	@XmlElement(name = "DaysAcrd")
	protected Number daysAccrued;
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
	 * DateTimePeriod.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18
	 * AggregateBalancePerSafekeepingPlace18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DaysAcrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :99A::DAAC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DaysAccrued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of days used for calculating the accrued interest amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDaysAccrued = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmObject();
			isDerived = false;
			xmlTag = "DaysAcrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":99A::DAAC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DaysAccrued";
			definition = "Specifies the number of days used for calculating the accrued interest amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "AcctBaseCcyAmts", required = true)
	protected BalanceAmounts5 accountBaseCurrencyAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceAmounts5
	 * BalanceAmounts5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAssetHolding
	 * Balance.mmAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18
	 * AggregateBalancePerSafekeepingPlace18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctBaseCcyAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBaseCurrencyAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation amounts provided in the base currency of the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountBaseCurrencyAmounts = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Balance.mmAssetHolding;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmObject();
			isDerived = false;
			xmlTag = "AcctBaseCcyAmts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBaseCurrencyAmounts";
			definition = "Valuation amounts provided in the base currency of the account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BalanceAmounts5.mmObject();
		}
	};
	@XmlElement(name = "InstrmCcyAmts")
	protected BalanceAmounts5 instrumentCurrencyAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceAmounts5
	 * BalanceAmounts5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAssetHolding
	 * Balance.mmAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18
	 * AggregateBalancePerSafekeepingPlace18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrmCcyAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstrumentCurrencyAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation amounts provided in the currency of the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstrumentCurrencyAmounts = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Balance.mmAssetHolding;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmObject();
			isDerived = false;
			xmlTag = "InstrmCcyAmts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentCurrencyAmounts";
			definition = "Valuation amounts provided in the currency of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BalanceAmounts5.mmObject();
		}
	};
	@XmlElement(name = "AltrnRptgCcyAmts")
	protected BalanceAmounts5 alternateReportingCurrencyAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceAmounts5
	 * BalanceAmounts5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAssetHolding
	 * Balance.mmAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18
	 * AggregateBalancePerSafekeepingPlace18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AltrnRptgCcyAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternateReportingCurrencyAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation amounts provided in another currency than the base currency of the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAlternateReportingCurrencyAmounts = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Balance.mmAssetHolding;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmObject();
			isDerived = false;
			xmlTag = "AltrnRptgCcyAmts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternateReportingCurrencyAmounts";
			definition = "Valuation amounts provided in another currency than the base currency of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BalanceAmounts5.mmObject();
		}
	};
	@XmlElement(name = "QtyBrkdwn")
	protected List<com.tools20022.repository.msg.QuantityBreakdown19> quantityBreakdown;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuantityBreakdown19
	 * QuantityBreakdown19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLotBreakdown
	 * SecuritiesQuantity.mmLotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18
	 * AggregateBalancePerSafekeepingPlace18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyBrkdwn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:BREAK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Breakdown of the aggregate quantity reported into significant lots, for example, tax lots."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQuantityBreakdown = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmLotBreakdown;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmObject();
			isDerived = false;
			xmlTag = "QtyBrkdwn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:BREAK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityBreakdown";
			definition = "Breakdown of the aggregate quantity reported into significant lots, for example, tax lots.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QuantityBreakdown19.mmObject();
		}
	};
	@XmlElement(name = "BalBrkdwn")
	protected List<com.tools20022.repository.msg.SubBalanceInformation7> balanceBreakdown;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SubBalanceInformation7
	 * SubBalanceInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18
	 * AggregateBalancePerSafekeepingPlace18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalBrkdwn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:SUBBAL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Breakdown of the aggregate balance per meaningful sub-balances and availability."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalanceBreakdown = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesSubBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmObject();
			isDerived = false;
			xmlTag = "BalBrkdwn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:SUBBAL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceBreakdown";
			definition = "Breakdown of the aggregate balance per meaningful sub-balances and availability.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SubBalanceInformation7.mmObject();
		}
	};
	@XmlElement(name = "AddtlBalBrkdwn")
	protected List<com.tools20022.repository.msg.AdditionalBalanceInformation7> additionalBalanceBreakdown;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation7
	 * AdditionalBalanceInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18
	 * AggregateBalancePerSafekeepingPlace18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlBalBrkdwn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:SUBBAL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalBalanceBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional instrument sub-balance information on all or parts of the reported financial instrument (unregistered, tax exempt, etc.)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalBalanceBreakdown = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesSubBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmObject();
			isDerived = false;
			xmlTag = "AddtlBalBrkdwn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:SUBBAL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalBalanceBreakdown";
			definition = "Provides additional instrument sub-balance information on all or parts of the reported financial instrument (unregistered, tax exempt, etc.).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AdditionalBalanceInformation7.mmObject();
		}
	};
	@XmlElement(name = "HldgAddtlDtls")
	protected RestrictedFINXMax350Text holdingAdditionalDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18
	 * AggregateBalancePerSafekeepingPlace18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgAddtlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::HOLD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional information on the holding."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHoldingAdditionalDetails = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmObject();
			isDerived = false;
			xmlTag = "HldgAddtlDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::HOLD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetails";
			definition = "Provides additional information on the holding.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmSafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmPlaceOfListing,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmAggregateBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmPriceDetails,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmDaysAccrued,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmAccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmInstrumentCurrencyAmounts,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmAlternateReportingCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmQuantityBreakdown,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmBalanceBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmAdditionalBalanceBreakdown,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmHoldingAdditionalDetails);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline.forAggregateBalancePerSafekeepingPlace18,
						com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule.forAggregateBalancePerSafekeepingPlace18,
						com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forAggregateBalancePerSafekeepingPlace18);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "AggregateBalancePerSafekeepingPlace18";
				definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account at a specified place of safekeeping.";
			}
		});
		return mmObject_lazy.get();
	}

	public SafekeepingPlaceFormat4Choice getSafekeepingPlace() {
		return safekeepingPlace;
	}

	public AggregateBalancePerSafekeepingPlace18 setSafekeepingPlace(SafekeepingPlaceFormat4Choice safekeepingPlace) {
		this.safekeepingPlace = Objects.requireNonNull(safekeepingPlace);
		return this;
	}

	public Optional<MarketIdentification4Choice> getPlaceOfListing() {
		return placeOfListing == null ? Optional.empty() : Optional.of(placeOfListing);
	}

	public AggregateBalancePerSafekeepingPlace18 setPlaceOfListing(MarketIdentification4Choice placeOfListing) {
		this.placeOfListing = placeOfListing;
		return this;
	}

	public Balance2 getAggregateBalance() {
		return aggregateBalance;
	}

	public AggregateBalancePerSafekeepingPlace18 setAggregateBalance(com.tools20022.repository.msg.Balance2 aggregateBalance) {
		this.aggregateBalance = Objects.requireNonNull(aggregateBalance);
		return this;
	}

	public List<PriceInformation7> getPriceDetails() {
		return priceDetails == null ? priceDetails = new ArrayList<>() : priceDetails;
	}

	public AggregateBalancePerSafekeepingPlace18 setPriceDetails(List<com.tools20022.repository.msg.PriceInformation7> priceDetails) {
		this.priceDetails = Objects.requireNonNull(priceDetails);
		return this;
	}

	public List<ForeignExchangeTerms16> getForeignExchangeDetails() {
		return foreignExchangeDetails == null ? foreignExchangeDetails = new ArrayList<>() : foreignExchangeDetails;
	}

	public AggregateBalancePerSafekeepingPlace18 setForeignExchangeDetails(List<com.tools20022.repository.msg.ForeignExchangeTerms16> foreignExchangeDetails) {
		this.foreignExchangeDetails = Objects.requireNonNull(foreignExchangeDetails);
		return this;
	}

	public Optional<Number> getDaysAccrued() {
		return daysAccrued == null ? Optional.empty() : Optional.of(daysAccrued);
	}

	public AggregateBalancePerSafekeepingPlace18 setDaysAccrued(Number daysAccrued) {
		this.daysAccrued = daysAccrued;
		return this;
	}

	public BalanceAmounts5 getAccountBaseCurrencyAmounts() {
		return accountBaseCurrencyAmounts;
	}

	public AggregateBalancePerSafekeepingPlace18 setAccountBaseCurrencyAmounts(com.tools20022.repository.msg.BalanceAmounts5 accountBaseCurrencyAmounts) {
		this.accountBaseCurrencyAmounts = Objects.requireNonNull(accountBaseCurrencyAmounts);
		return this;
	}

	public Optional<BalanceAmounts5> getInstrumentCurrencyAmounts() {
		return instrumentCurrencyAmounts == null ? Optional.empty() : Optional.of(instrumentCurrencyAmounts);
	}

	public AggregateBalancePerSafekeepingPlace18 setInstrumentCurrencyAmounts(com.tools20022.repository.msg.BalanceAmounts5 instrumentCurrencyAmounts) {
		this.instrumentCurrencyAmounts = instrumentCurrencyAmounts;
		return this;
	}

	public Optional<BalanceAmounts5> getAlternateReportingCurrencyAmounts() {
		return alternateReportingCurrencyAmounts == null ? Optional.empty() : Optional.of(alternateReportingCurrencyAmounts);
	}

	public AggregateBalancePerSafekeepingPlace18 setAlternateReportingCurrencyAmounts(com.tools20022.repository.msg.BalanceAmounts5 alternateReportingCurrencyAmounts) {
		this.alternateReportingCurrencyAmounts = alternateReportingCurrencyAmounts;
		return this;
	}

	public List<QuantityBreakdown19> getQuantityBreakdown() {
		return quantityBreakdown == null ? quantityBreakdown = new ArrayList<>() : quantityBreakdown;
	}

	public AggregateBalancePerSafekeepingPlace18 setQuantityBreakdown(List<com.tools20022.repository.msg.QuantityBreakdown19> quantityBreakdown) {
		this.quantityBreakdown = Objects.requireNonNull(quantityBreakdown);
		return this;
	}

	public List<SubBalanceInformation7> getBalanceBreakdown() {
		return balanceBreakdown == null ? balanceBreakdown = new ArrayList<>() : balanceBreakdown;
	}

	public AggregateBalancePerSafekeepingPlace18 setBalanceBreakdown(List<com.tools20022.repository.msg.SubBalanceInformation7> balanceBreakdown) {
		this.balanceBreakdown = Objects.requireNonNull(balanceBreakdown);
		return this;
	}

	public List<AdditionalBalanceInformation7> getAdditionalBalanceBreakdown() {
		return additionalBalanceBreakdown == null ? additionalBalanceBreakdown = new ArrayList<>() : additionalBalanceBreakdown;
	}

	public AggregateBalancePerSafekeepingPlace18 setAdditionalBalanceBreakdown(List<com.tools20022.repository.msg.AdditionalBalanceInformation7> additionalBalanceBreakdown) {
		this.additionalBalanceBreakdown = Objects.requireNonNull(additionalBalanceBreakdown);
		return this;
	}

	public Optional<RestrictedFINXMax350Text> getHoldingAdditionalDetails() {
		return holdingAdditionalDetails == null ? Optional.empty() : Optional.of(holdingAdditionalDetails);
	}

	public AggregateBalancePerSafekeepingPlace18 setHoldingAdditionalDetails(RestrictedFINXMax350Text holdingAdditionalDetails) {
		this.holdingAdditionalDetails = holdingAdditionalDetails;
		return this;
	}
}