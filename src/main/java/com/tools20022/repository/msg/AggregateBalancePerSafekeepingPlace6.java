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
import com.tools20022.repository.choice.BalanceQuantity2Choice;
import com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice;
import com.tools20022.repository.codeset.ShortLong1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace6.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmPlaceOfListing
 * AggregateBalancePerSafekeepingPlace6.mmPlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmShortLong
 * AggregateBalancePerSafekeepingPlace6.mmShortLong}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmQuantityBreakdown
 * AggregateBalancePerSafekeepingPlace6.mmQuantityBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmAggregateQuantity
 * AggregateBalancePerSafekeepingPlace6.mmAggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmPriceDetails
 * AggregateBalancePerSafekeepingPlace6.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmForeignExchangeDetails
 * AggregateBalancePerSafekeepingPlace6.mmForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmAccountBaseCurrencyAmounts
 * AggregateBalancePerSafekeepingPlace6.mmAccountBaseCurrencyAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmInstrumentCurrencyAmounts
 * AggregateBalancePerSafekeepingPlace6.mmInstrumentCurrencyAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmAlternateReportingCurrencyAmounts
 * AggregateBalancePerSafekeepingPlace6.mmAlternateReportingCurrencyAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmDaysAccrued
 * AggregateBalancePerSafekeepingPlace6.mmDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmBalanceBreakdownDetails
 * AggregateBalancePerSafekeepingPlace6.mmBalanceBreakdownDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmAdditionalBalanceBreakdownDetails
 * AggregateBalancePerSafekeepingPlace6.mmAdditionalBalanceBreakdownDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmHoldingAdditionalDetails
 * AggregateBalancePerSafekeepingPlace6.mmHoldingAdditionalDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline#forAggregateBalancePerSafekeepingPlace6
 * ConstraintAggregateBalanceGuideline.forAggregateBalancePerSafekeepingPlace6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule#forAggregateBalancePerSafekeepingPlace6
 * ConstraintHoldingAdditionalDetailsRule.
 * forAggregateBalancePerSafekeepingPlace6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AggregateBalancePerSafekeepingPlace6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Net position of a segregated holding, in a single security, within the overall position held in a securities account at a specified place of safekeeping."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AggregateBalancePerSafekeepingPlace6", propOrder = {"safekeepingPlace", "placeOfListing", "shortLong", "quantityBreakdown", "aggregateQuantity", "priceDetails", "foreignExchangeDetails", "accountBaseCurrencyAmounts",
		"instrumentCurrencyAmounts", "alternateReportingCurrencyAmounts", "daysAccrued", "balanceBreakdownDetails", "additionalBalanceBreakdownDetails", "holdingAdditionalDetails"})
public class AggregateBalancePerSafekeepingPlace6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SfkpgPlc", required = true)
	protected SafekeepingPlaceFormat1Choice safekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice
	 * SafekeepingPlaceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6
	 * AggregateBalancePerSafekeepingPlace6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SafekeepingPlaceFormat1Choice.mmObject();
		}
	};
	@XmlElement(name = "PlcOfListg")
	protected MarketIdentification3 placeOfListing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarketIdentification3
	 * MarketIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
	 * Security.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6
	 * AggregateBalancePerSafekeepingPlace6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfListg"</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmObject();
			isDerived = false;
			xmlTag = "PlcOfListg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Market(s) on which the security is listed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MarketIdentification3.mmObject();
		}
	};
	@XmlElement(name = "ShrtLng")
	protected ShortLong1Code shortLong;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ShortLong1Code
	 * ShortLong1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmShortLong
	 * SecuritiesBalance.mmShortLong}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6
	 * AggregateBalancePerSafekeepingPlace6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtLng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLong"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication that the position is short or long."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShortLong = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmShortLong;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmObject();
			isDerived = false;
			xmlTag = "ShrtLng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLong";
			definition = "Indication that the position is short or long.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ShortLong1Code.mmObject();
		}
	};
	@XmlElement(name = "QtyBrkdwn")
	protected List<com.tools20022.repository.msg.QuantityBreakDown2> quantityBreakdown;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuantityBreakDown2
	 * QuantityBreakDown2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLotBreakdown
	 * SecuritiesQuantity.mmLotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6
	 * AggregateBalancePerSafekeepingPlace6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyBrkdwn"</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmObject();
			isDerived = false;
			xmlTag = "QtyBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityBreakdown";
			definition = "Breakdown of the aggregate quantity reported into significant lots, for example, tax lots.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QuantityBreakDown2.mmObject();
		}
	};
	@XmlElement(name = "AggtQty", required = true)
	protected BalanceQuantity2Choice aggregateQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity2Choice
	 * BalanceQuantity2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6
	 * AggregateBalancePerSafekeepingPlace6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AggtQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregateQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total quantity of financial instrument for the referenced holding."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAggregateQuantity = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmObject();
			isDerived = false;
			xmlTag = "AggtQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateQuantity";
			definition = "Total quantity of financial instrument for the referenced holding.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BalanceQuantity2Choice.mmObject();
		}
	};
	@XmlElement(name = "PricDtls", required = true)
	protected List<com.tools20022.repository.msg.PriceInformation4> priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PriceInformation4
	 * PriceInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPricing
	 * Security.mmPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6
	 * AggregateBalancePerSafekeepingPlace6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Price of the financial instrument in one or more currencies.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PriceInformation4.mmObject();
		}
	};
	@XmlElement(name = "FXDtls")
	protected List<com.tools20022.repository.msg.ForeignExchangeTerms6> foreignExchangeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms6
	 * ForeignExchangeTerms6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmExchangeRate
	 * SecuritiesBalance.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6
	 * AggregateBalancePerSafekeepingPlace6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency exchange related to a securities order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmForeignExchangeDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Currency exchange related to a securities order.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms6.mmObject();
		}
	};
	@XmlElement(name = "AcctBaseCcyAmts", required = true)
	protected BalanceAmounts1 accountBaseCurrencyAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceAmounts1
	 * BalanceAmounts1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAssetHolding
	 * Balance.mmAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6
	 * AggregateBalancePerSafekeepingPlace6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctBaseCcyAmts"</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmObject();
			isDerived = false;
			xmlTag = "AcctBaseCcyAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBaseCurrencyAmounts";
			definition = "Valuation amounts provided in the base currency of the account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BalanceAmounts1.mmObject();
		}
	};
	@XmlElement(name = "InstrmCcyAmts")
	protected BalanceAmounts1 instrumentCurrencyAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceAmounts1
	 * BalanceAmounts1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAssetHolding
	 * Balance.mmAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6
	 * AggregateBalancePerSafekeepingPlace6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrmCcyAmts"</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmObject();
			isDerived = false;
			xmlTag = "InstrmCcyAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentCurrencyAmounts";
			definition = "Valuation amounts provided in the currency of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BalanceAmounts1.mmObject();
		}
	};
	@XmlElement(name = "AltrnRptgCcyAmts")
	protected BalanceAmounts1 alternateReportingCurrencyAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceAmounts1
	 * BalanceAmounts1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAssetHolding
	 * Balance.mmAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6
	 * AggregateBalancePerSafekeepingPlace6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AltrnRptgCcyAmts"</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmObject();
			isDerived = false;
			xmlTag = "AltrnRptgCcyAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternateReportingCurrencyAmounts";
			definition = "Valuation amounts provided in another currency than the base currency of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BalanceAmounts1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6
	 * AggregateBalancePerSafekeepingPlace6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DaysAcrd"</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmObject();
			isDerived = false;
			xmlTag = "DaysAcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DaysAccrued";
			definition = "Specifies the number of days used for calculating the accrued interest amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "BalBrkdwnDtls")
	protected List<com.tools20022.repository.msg.SubBalanceInformation4> balanceBreakdownDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SubBalanceInformation4
	 * SubBalanceInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6
	 * AggregateBalancePerSafekeepingPlace6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalBrkdwnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceBreakdownDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net position of a segregated holding of a single security within the overall position held in a securities account, eg, sub-balance per status."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalanceBreakdownDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesSubBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmObject();
			isDerived = false;
			xmlTag = "BalBrkdwnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceBreakdownDetails";
			definition = "Net position of a segregated holding of a single security within the overall position held in a securities account, eg, sub-balance per status.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SubBalanceInformation4.mmObject();
		}
	};
	@XmlElement(name = "AddtlBalBrkdwnDtls")
	protected List<com.tools20022.repository.msg.AdditionalBalanceInformation4> additionalBalanceBreakdownDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation4
	 * AdditionalBalanceInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6
	 * AggregateBalancePerSafekeepingPlace6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlBalBrkdwnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalBalanceBreakdownDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net position of a segregated holding of a single security within the overall position held in a securities account, eg, sub-balance per status."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalBalanceBreakdownDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesSubBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmObject();
			isDerived = false;
			xmlTag = "AddtlBalBrkdwnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalBalanceBreakdownDetails";
			definition = "Net position of a segregated holding of a single security within the overall position held in a securities account, eg, sub-balance per status.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AdditionalBalanceInformation4.mmObject();
		}
	};
	@XmlElement(name = "HldgAddtlDtls")
	protected Max350Text holdingAdditionalDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6
	 * AggregateBalancePerSafekeepingPlace6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgAddtlDtls"</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmObject();
			isDerived = false;
			xmlTag = "HldgAddtlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetails";
			definition = "Provides additional information on the holding.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmSafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmPlaceOfListing,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmShortLong, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmQuantityBreakdown,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmAggregateQuantity, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmPriceDetails,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmAccountBaseCurrencyAmounts,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmInstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmAlternateReportingCurrencyAmounts,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmBalanceBreakdownDetails,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmAdditionalBalanceBreakdownDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmHoldingAdditionalDetails);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline.forAggregateBalancePerSafekeepingPlace6,
						com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule.forAggregateBalancePerSafekeepingPlace6);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AggregateBalancePerSafekeepingPlace6";
				definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account at a specified place of safekeeping.";
			}
		});
		return mmObject_lazy.get();
	}

	public SafekeepingPlaceFormat1Choice getSafekeepingPlace() {
		return safekeepingPlace;
	}

	public AggregateBalancePerSafekeepingPlace6 setSafekeepingPlace(SafekeepingPlaceFormat1Choice safekeepingPlace) {
		this.safekeepingPlace = Objects.requireNonNull(safekeepingPlace);
		return this;
	}

	public Optional<MarketIdentification3> getPlaceOfListing() {
		return placeOfListing == null ? Optional.empty() : Optional.of(placeOfListing);
	}

	public AggregateBalancePerSafekeepingPlace6 setPlaceOfListing(com.tools20022.repository.msg.MarketIdentification3 placeOfListing) {
		this.placeOfListing = placeOfListing;
		return this;
	}

	public Optional<ShortLong1Code> getShortLong() {
		return shortLong == null ? Optional.empty() : Optional.of(shortLong);
	}

	public AggregateBalancePerSafekeepingPlace6 setShortLong(ShortLong1Code shortLong) {
		this.shortLong = shortLong;
		return this;
	}

	public List<QuantityBreakDown2> getQuantityBreakdown() {
		return quantityBreakdown == null ? quantityBreakdown = new ArrayList<>() : quantityBreakdown;
	}

	public AggregateBalancePerSafekeepingPlace6 setQuantityBreakdown(List<com.tools20022.repository.msg.QuantityBreakDown2> quantityBreakdown) {
		this.quantityBreakdown = Objects.requireNonNull(quantityBreakdown);
		return this;
	}

	public BalanceQuantity2Choice getAggregateQuantity() {
		return aggregateQuantity;
	}

	public AggregateBalancePerSafekeepingPlace6 setAggregateQuantity(BalanceQuantity2Choice aggregateQuantity) {
		this.aggregateQuantity = Objects.requireNonNull(aggregateQuantity);
		return this;
	}

	public List<PriceInformation4> getPriceDetails() {
		return priceDetails == null ? priceDetails = new ArrayList<>() : priceDetails;
	}

	public AggregateBalancePerSafekeepingPlace6 setPriceDetails(List<com.tools20022.repository.msg.PriceInformation4> priceDetails) {
		this.priceDetails = Objects.requireNonNull(priceDetails);
		return this;
	}

	public List<ForeignExchangeTerms6> getForeignExchangeDetails() {
		return foreignExchangeDetails == null ? foreignExchangeDetails = new ArrayList<>() : foreignExchangeDetails;
	}

	public AggregateBalancePerSafekeepingPlace6 setForeignExchangeDetails(List<com.tools20022.repository.msg.ForeignExchangeTerms6> foreignExchangeDetails) {
		this.foreignExchangeDetails = Objects.requireNonNull(foreignExchangeDetails);
		return this;
	}

	public BalanceAmounts1 getAccountBaseCurrencyAmounts() {
		return accountBaseCurrencyAmounts;
	}

	public AggregateBalancePerSafekeepingPlace6 setAccountBaseCurrencyAmounts(com.tools20022.repository.msg.BalanceAmounts1 accountBaseCurrencyAmounts) {
		this.accountBaseCurrencyAmounts = Objects.requireNonNull(accountBaseCurrencyAmounts);
		return this;
	}

	public Optional<BalanceAmounts1> getInstrumentCurrencyAmounts() {
		return instrumentCurrencyAmounts == null ? Optional.empty() : Optional.of(instrumentCurrencyAmounts);
	}

	public AggregateBalancePerSafekeepingPlace6 setInstrumentCurrencyAmounts(com.tools20022.repository.msg.BalanceAmounts1 instrumentCurrencyAmounts) {
		this.instrumentCurrencyAmounts = instrumentCurrencyAmounts;
		return this;
	}

	public Optional<BalanceAmounts1> getAlternateReportingCurrencyAmounts() {
		return alternateReportingCurrencyAmounts == null ? Optional.empty() : Optional.of(alternateReportingCurrencyAmounts);
	}

	public AggregateBalancePerSafekeepingPlace6 setAlternateReportingCurrencyAmounts(com.tools20022.repository.msg.BalanceAmounts1 alternateReportingCurrencyAmounts) {
		this.alternateReportingCurrencyAmounts = alternateReportingCurrencyAmounts;
		return this;
	}

	public Optional<Number> getDaysAccrued() {
		return daysAccrued == null ? Optional.empty() : Optional.of(daysAccrued);
	}

	public AggregateBalancePerSafekeepingPlace6 setDaysAccrued(Number daysAccrued) {
		this.daysAccrued = daysAccrued;
		return this;
	}

	public List<SubBalanceInformation4> getBalanceBreakdownDetails() {
		return balanceBreakdownDetails == null ? balanceBreakdownDetails = new ArrayList<>() : balanceBreakdownDetails;
	}

	public AggregateBalancePerSafekeepingPlace6 setBalanceBreakdownDetails(List<com.tools20022.repository.msg.SubBalanceInformation4> balanceBreakdownDetails) {
		this.balanceBreakdownDetails = Objects.requireNonNull(balanceBreakdownDetails);
		return this;
	}

	public List<AdditionalBalanceInformation4> getAdditionalBalanceBreakdownDetails() {
		return additionalBalanceBreakdownDetails == null ? additionalBalanceBreakdownDetails = new ArrayList<>() : additionalBalanceBreakdownDetails;
	}

	public AggregateBalancePerSafekeepingPlace6 setAdditionalBalanceBreakdownDetails(List<com.tools20022.repository.msg.AdditionalBalanceInformation4> additionalBalanceBreakdownDetails) {
		this.additionalBalanceBreakdownDetails = Objects.requireNonNull(additionalBalanceBreakdownDetails);
		return this;
	}

	public Optional<Max350Text> getHoldingAdditionalDetails() {
		return holdingAdditionalDetails == null ? Optional.empty() : Optional.of(holdingAdditionalDetails);
	}

	public AggregateBalancePerSafekeepingPlace6 setHoldingAdditionalDetails(Max350Text holdingAdditionalDetails) {
		this.holdingAdditionalDetails = holdingAdditionalDetails;
		return this;
	}
}