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
import com.tools20022.repository.choice.BalanceQuantity12Choice;
import com.tools20022.repository.choice.ExposureType17Choice;
import com.tools20022.repository.choice.MarketIdentification4Choice;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.RestrictedFINXMax350Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace31.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmPlaceOfListing
 * AggregateBalancePerSafekeepingPlace31.mmPlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmPledgee
 * AggregateBalancePerSafekeepingPlace31.mmPledgee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace31.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmAvailableBalance
 * AggregateBalancePerSafekeepingPlace31.mmAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmNotAvailableBalance
 * AggregateBalancePerSafekeepingPlace31.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmPriceDetails
 * AggregateBalancePerSafekeepingPlace31.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmForeignExchangeDetails
 * AggregateBalancePerSafekeepingPlace31.mmForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmDaysAccrued
 * AggregateBalancePerSafekeepingPlace31.mmDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmAccountBaseCurrencyAmounts
 * AggregateBalancePerSafekeepingPlace31.mmAccountBaseCurrencyAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmInstrumentCurrencyAmounts
 * AggregateBalancePerSafekeepingPlace31.mmInstrumentCurrencyAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmQuantityBreakdown
 * AggregateBalancePerSafekeepingPlace31.mmQuantityBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmExposureType
 * AggregateBalancePerSafekeepingPlace31.mmExposureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmBalanceBreakdown
 * AggregateBalancePerSafekeepingPlace31.mmBalanceBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmAdditionalBalanceBreakdown
 * AggregateBalancePerSafekeepingPlace31.mmAdditionalBalanceBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmHoldingAdditionalDetails
 * AggregateBalancePerSafekeepingPlace31.mmHoldingAdditionalDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
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
 * "AggregateBalancePerSafekeepingPlace31"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Net position of a segregated holding, in a single security, within the overall position held in a securities account at a specified place of safekeeping."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AggregateBalancePerSafekeepingPlace31", propOrder = {"safekeepingPlace", "placeOfListing", "pledgee", "aggregateBalance", "availableBalance", "notAvailableBalance", "priceDetails", "foreignExchangeDetails", "daysAccrued",
		"accountBaseCurrencyAmounts", "instrumentCurrencyAmounts", "quantityBreakdown", "exposureType", "balanceBreakdown", "additionalBalanceBreakdown", "holdingAdditionalDetails"})
public class AggregateBalancePerSafekeepingPlace31 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SafeKeepingPlace2 safekeepingPlace;
	/**
	 * Place where the securities are safe-kept, physically or notionally. This
	 * place can be, for example, a local custodian, a Central Securities
	 * Depository (CSD) or an International Central Securities Depository
	 * (ICSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SafeKeepingPlace2
	 * SafeKeepingPlace2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31
	 * AggregateBalancePerSafekeepingPlace31}</li>
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
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace31.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SafeKeepingPlace2.mmObject();
		}
	};
	protected MarketIdentification4Choice placeOfListing;
	/**
	 * Market(s) on which the security is listed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31
	 * AggregateBalancePerSafekeepingPlace31}</li>
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
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace31.mmObject();
			isDerived = false;
			xmlTag = "PlcOfListg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Market(s) on which the security is listed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketIdentification4Choice.mmObject();
		}
	};
	protected Pledgee2 pledgee;
	/**
	 * Specify the entity to which the financial instruments are pledged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Pledgee2 Pledgee2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmPledgee
	 * SecuritiesBalance.mmPledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31
	 * AggregateBalancePerSafekeepingPlace31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pldgee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pledgee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specify the entity to which the financial instruments are pledged."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPledgee = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmPledgee;
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace31.mmObject();
			isDerived = false;
			xmlTag = "Pldgee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledgee";
			definition = "Specify the entity to which the financial instruments are pledged.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Pledgee2.mmObject();
		}
	};
	protected Balance10 aggregateBalance;
	/**
	 * Total quantity of financial instruments of the balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Balance10 Balance10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31
	 * AggregateBalancePerSafekeepingPlace31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AggtBal"</li>
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
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace31.mmObject();
			isDerived = false;
			xmlTag = "AggtBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalance";
			definition = "Total quantity of financial instruments of the balance.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Balance10.mmObject();
		}
	};
	protected Balance12 availableBalance;
	/**
	 * Total quantity of financial instruments of the balance that is available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Balance12 Balance12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAvailableQuantity
	 * SecuritiesBalance.mmAvailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31
	 * AggregateBalancePerSafekeepingPlace31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvlblBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total quantity of financial instruments of the balance that is available."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAvailableBalance = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmAvailableQuantity;
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace31.mmObject();
			isDerived = false;
			xmlTag = "AvlblBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableBalance";
			definition = "Total quantity of financial instruments of the balance that is available.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Balance12.mmObject();
		}
	};
	protected BalanceQuantity12Choice notAvailableBalance;
	/**
	 * Total quantity of financial instruments of the balance that is not
	 * available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity12Choice
	 * BalanceQuantity12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31
	 * AggregateBalancePerSafekeepingPlace31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotAvlblBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAvailableBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total quantity of financial instruments of the balance that is not available."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNotAvailableBalance = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace31.mmObject();
			isDerived = false;
			xmlTag = "NotAvlblBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAvailableBalance";
			definition = "Total quantity of financial instruments of the balance that is not available.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BalanceQuantity12Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PriceInformation14> priceDetails;
	/**
	 * Price of the financial instrument in one or more currencies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PriceInformation14
	 * PriceInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPricing
	 * Security.mmPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31
	 * AggregateBalancePerSafekeepingPlace31}</li>
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
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace31.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Price of the financial instrument in one or more currencies.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PriceInformation14.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ForeignExchangeTerms31> foreignExchangeDetails;
	/**
	 * Information needed to process a currency exchange or conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms31
	 * ForeignExchangeTerms31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmExchangeRate
	 * SecuritiesBalance.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31
	 * AggregateBalancePerSafekeepingPlace31}</li>
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
	 * definition} =
	 * "Information needed to process a currency exchange or conversion."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmForeignExchangeDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmExchangeRate;
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace31.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Information needed to process a currency exchange or conversion.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms31.mmObject();
		}
	};
	protected Number daysAccrued;
	/**
	 * Specifies the number of days used for calculating the accrued interest
	 * amount.
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
	 * DateTimePeriod.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31
	 * AggregateBalancePerSafekeepingPlace31}</li>
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
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace31.mmObject();
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
	protected BalanceAmounts4 accountBaseCurrencyAmounts;
	/**
	 * Valuation amounts provided in the base currency of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceAmounts4
	 * BalanceAmounts4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAssetHolding
	 * Balance.mmAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31
	 * AggregateBalancePerSafekeepingPlace31}</li>
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
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace31.mmObject();
			isDerived = false;
			xmlTag = "AcctBaseCcyAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBaseCurrencyAmounts";
			definition = "Valuation amounts provided in the base currency of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BalanceAmounts4.mmObject();
		}
	};
	protected BalanceAmounts4 instrumentCurrencyAmounts;
	/**
	 * Valuation amounts provided in the currency of the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceAmounts4
	 * BalanceAmounts4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAssetHolding
	 * Balance.mmAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31
	 * AggregateBalancePerSafekeepingPlace31}</li>
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
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace31.mmObject();
			isDerived = false;
			xmlTag = "InstrmCcyAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentCurrencyAmounts";
			definition = "Valuation amounts provided in the currency of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BalanceAmounts4.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QuantityBreakdown40> quantityBreakdown;
	/**
	 * Breakdown of the aggregate quantity reported into significant lots, for
	 * example, tax lots.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuantityBreakdown40
	 * QuantityBreakdown40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLotBreakdown
	 * SecuritiesQuantity.mmLotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31
	 * AggregateBalancePerSafekeepingPlace31}</li>
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
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace31.mmObject();
			isDerived = false;
			xmlTag = "QtyBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityBreakdown";
			definition = "Breakdown of the aggregate quantity reported into significant lots, for example, tax lots.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QuantityBreakdown40.mmObject();
		}
	};
	protected ExposureType17Choice exposureType;
	/**
	 * Specifies the underlying business area/type of trade causing the
	 * collateral movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ExposureType17Choice
	 * ExposureType17Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmExposureType
	 * Obligation.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31
	 * AggregateBalancePerSafekeepingPlace31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpsrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the underlying business area/type of trade causing the collateral movement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExposureType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Obligation.mmExposureType;
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace31.mmObject();
			isDerived = false;
			xmlTag = "XpsrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureType";
			definition = "Specifies the underlying business area/type of trade causing the collateral movement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExposureType17Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SubBalanceInformation17> balanceBreakdown;
	/**
	 * Breakdown of the aggregate balance per meaningful sub-balances and
	 * availability.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation17
	 * SubBalanceInformation17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31
	 * AggregateBalancePerSafekeepingPlace31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalBrkdwn"</li>
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
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace31.mmObject();
			isDerived = false;
			xmlTag = "BalBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceBreakdown";
			definition = "Breakdown of the aggregate balance per meaningful sub-balances and availability.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SubBalanceInformation17.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AdditionalBalanceInformation17> additionalBalanceBreakdown;
	/**
	 * Provides additional instrument sub-balance information on all or parts of
	 * the reported financial instrument (unregistered, tax exempt, etc.).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation17
	 * AdditionalBalanceInformation17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31
	 * AggregateBalancePerSafekeepingPlace31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlBalBrkdwn"</li>
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
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace31.mmObject();
			isDerived = false;
			xmlTag = "AddtlBalBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalBalanceBreakdown";
			definition = "Provides additional instrument sub-balance information on all or parts of the reported financial instrument (unregistered, tax exempt, etc.).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AdditionalBalanceInformation17.mmObject();
		}
	};
	protected RestrictedFINXMax350Text holdingAdditionalDetails;
	/**
	 * Provides additional information on the holding.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31
	 * AggregateBalancePerSafekeepingPlace31}</li>
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
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace31.mmObject();
			isDerived = false;
			xmlTag = "HldgAddtlDtls";
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
				messageElement_lazy = () -> Arrays.asList(AggregateBalancePerSafekeepingPlace31.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace31.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace31.mmPledgee,
						AggregateBalancePerSafekeepingPlace31.mmAggregateBalance, AggregateBalancePerSafekeepingPlace31.mmAvailableBalance, AggregateBalancePerSafekeepingPlace31.mmNotAvailableBalance,
						AggregateBalancePerSafekeepingPlace31.mmPriceDetails, AggregateBalancePerSafekeepingPlace31.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace31.mmDaysAccrued,
						AggregateBalancePerSafekeepingPlace31.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace31.mmInstrumentCurrencyAmounts, AggregateBalancePerSafekeepingPlace31.mmQuantityBreakdown,
						AggregateBalancePerSafekeepingPlace31.mmExposureType, AggregateBalancePerSafekeepingPlace31.mmBalanceBreakdown, AggregateBalancePerSafekeepingPlace31.mmAdditionalBalanceBreakdown,
						AggregateBalancePerSafekeepingPlace31.mmHoldingAdditionalDetails);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AggregateBalancePerSafekeepingPlace31";
				definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account at a specified place of safekeeping.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SfkpgPlc", required = true)
	public SafeKeepingPlace2 getSafekeepingPlace() {
		return safekeepingPlace;
	}

	public void setSafekeepingPlace(com.tools20022.repository.msg.SafeKeepingPlace2 safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
	}

	@XmlElement(name = "PlcOfListg")
	public MarketIdentification4Choice getPlaceOfListing() {
		return placeOfListing;
	}

	public void setPlaceOfListing(MarketIdentification4Choice placeOfListing) {
		this.placeOfListing = placeOfListing;
	}

	@XmlElement(name = "Pldgee")
	public Pledgee2 getPledgee() {
		return pledgee;
	}

	public void setPledgee(com.tools20022.repository.msg.Pledgee2 pledgee) {
		this.pledgee = pledgee;
	}

	@XmlElement(name = "AggtBal", required = true)
	public Balance10 getAggregateBalance() {
		return aggregateBalance;
	}

	public void setAggregateBalance(com.tools20022.repository.msg.Balance10 aggregateBalance) {
		this.aggregateBalance = aggregateBalance;
	}

	@XmlElement(name = "AvlblBal")
	public Balance12 getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(com.tools20022.repository.msg.Balance12 availableBalance) {
		this.availableBalance = availableBalance;
	}

	@XmlElement(name = "NotAvlblBal")
	public BalanceQuantity12Choice getNotAvailableBalance() {
		return notAvailableBalance;
	}

	public void setNotAvailableBalance(BalanceQuantity12Choice notAvailableBalance) {
		this.notAvailableBalance = notAvailableBalance;
	}

	@XmlElement(name = "PricDtls")
	public List<PriceInformation14> getPriceDetails() {
		return priceDetails;
	}

	public void setPriceDetails(List<com.tools20022.repository.msg.PriceInformation14> priceDetails) {
		this.priceDetails = priceDetails;
	}

	@XmlElement(name = "FXDtls")
	public List<ForeignExchangeTerms31> getForeignExchangeDetails() {
		return foreignExchangeDetails;
	}

	public void setForeignExchangeDetails(List<com.tools20022.repository.msg.ForeignExchangeTerms31> foreignExchangeDetails) {
		this.foreignExchangeDetails = foreignExchangeDetails;
	}

	@XmlElement(name = "DaysAcrd")
	public Number getDaysAccrued() {
		return daysAccrued;
	}

	public void setDaysAccrued(Number daysAccrued) {
		this.daysAccrued = daysAccrued;
	}

	@XmlElement(name = "AcctBaseCcyAmts")
	public BalanceAmounts4 getAccountBaseCurrencyAmounts() {
		return accountBaseCurrencyAmounts;
	}

	public void setAccountBaseCurrencyAmounts(com.tools20022.repository.msg.BalanceAmounts4 accountBaseCurrencyAmounts) {
		this.accountBaseCurrencyAmounts = accountBaseCurrencyAmounts;
	}

	@XmlElement(name = "InstrmCcyAmts")
	public BalanceAmounts4 getInstrumentCurrencyAmounts() {
		return instrumentCurrencyAmounts;
	}

	public void setInstrumentCurrencyAmounts(com.tools20022.repository.msg.BalanceAmounts4 instrumentCurrencyAmounts) {
		this.instrumentCurrencyAmounts = instrumentCurrencyAmounts;
	}

	@XmlElement(name = "QtyBrkdwn")
	public List<QuantityBreakdown40> getQuantityBreakdown() {
		return quantityBreakdown;
	}

	public void setQuantityBreakdown(List<com.tools20022.repository.msg.QuantityBreakdown40> quantityBreakdown) {
		this.quantityBreakdown = quantityBreakdown;
	}

	@XmlElement(name = "XpsrTp")
	public ExposureType17Choice getExposureType() {
		return exposureType;
	}

	public void setExposureType(ExposureType17Choice exposureType) {
		this.exposureType = exposureType;
	}

	@XmlElement(name = "BalBrkdwn")
	public List<SubBalanceInformation17> getBalanceBreakdown() {
		return balanceBreakdown;
	}

	public void setBalanceBreakdown(List<com.tools20022.repository.msg.SubBalanceInformation17> balanceBreakdown) {
		this.balanceBreakdown = balanceBreakdown;
	}

	@XmlElement(name = "AddtlBalBrkdwn")
	public List<AdditionalBalanceInformation17> getAdditionalBalanceBreakdown() {
		return additionalBalanceBreakdown;
	}

	public void setAdditionalBalanceBreakdown(List<com.tools20022.repository.msg.AdditionalBalanceInformation17> additionalBalanceBreakdown) {
		this.additionalBalanceBreakdown = additionalBalanceBreakdown;
	}

	@XmlElement(name = "HldgAddtlDtls")
	public RestrictedFINXMax350Text getHoldingAdditionalDetails() {
		return holdingAdditionalDetails;
	}

	public void setHoldingAdditionalDetails(RestrictedFINXMax350Text holdingAdditionalDetails) {
		this.holdingAdditionalDetails = holdingAdditionalDetails;
	}
}