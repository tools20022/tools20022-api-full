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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.SecuritiesBalance;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

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
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace24.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#PlaceOfListing
 * AggregateBalancePerSafekeepingPlace24.PlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#Pledgee
 * AggregateBalancePerSafekeepingPlace24.Pledgee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#AggregateBalance
 * AggregateBalancePerSafekeepingPlace24.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#AvailableBalance
 * AggregateBalancePerSafekeepingPlace24.AvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#NotAvailableBalance
 * AggregateBalancePerSafekeepingPlace24.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#PriceDetails
 * AggregateBalancePerSafekeepingPlace24.PriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#ForeignExchangeDetails
 * AggregateBalancePerSafekeepingPlace24.ForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#DaysAccrued
 * AggregateBalancePerSafekeepingPlace24.DaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#AccountBaseCurrencyAmounts
 * AggregateBalancePerSafekeepingPlace24.AccountBaseCurrencyAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#InstrumentCurrencyAmounts
 * AggregateBalancePerSafekeepingPlace24.InstrumentCurrencyAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#QuantityBreakdown
 * AggregateBalancePerSafekeepingPlace24.QuantityBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#ExposureType
 * AggregateBalancePerSafekeepingPlace24.ExposureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#BalanceBreakdown
 * AggregateBalancePerSafekeepingPlace24.BalanceBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#AdditionalBalanceBreakdown
 * AggregateBalancePerSafekeepingPlace24.AdditionalBalanceBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#HoldingAdditionalDetails
 * AggregateBalancePerSafekeepingPlace24.HoldingAdditionalDetails}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AggregateBalancePerSafekeepingPlace24"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Net position of a segregated holding, in a single security, within the overall position held in a securities account at a specified place of safekeeping."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28
 * AggregateBalancePerSafekeepingPlace28}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20
 * AggregateBalancePerSafekeepingPlace20}</li>
 * </ul>
 */
public class AggregateBalancePerSafekeepingPlace24 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Place where the securities are safe-kept, physically or notionally. This
	 * place can be, for example, a local custodian, a Central Securities
	 * Depository (CSD) or an International Central Securities Depository
	 * (ICSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice
	 * SafekeepingPlaceFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24
	 * AggregateBalancePerSafekeepingPlace24}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#SafekeepingPlace
	 * AggregateBalancePerSafekeepingPlace28.SafekeepingPlace}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#SafekeepingPlace
	 * AggregateBalancePerSafekeepingPlace20.SafekeepingPlace}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd SafekeepingPlace = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmObject();
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.SafekeepingPlace;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.SafekeepingPlace);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SafekeepingPlaceFormat3Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Market(s) on which the security is listed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification3Choice
	 * MarketIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#PlaceOfListing
	 * Security.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24
	 * AggregateBalancePerSafekeepingPlace24}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace28.PlaceOfListing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace20.PlaceOfListing}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PlaceOfListing = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.PlaceOfListing;
			isDerived = false;
			xmlTag = "PlcOfListg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Market(s) on which the security is listed.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.PlaceOfListing;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.PlaceOfListing);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> MarketIdentification3Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Choice between formats for the entity to which the financial instruments
	 * are pledged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PledgeeFormat1Choice
	 * PledgeeFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#Pledgee
	 * SecuritiesBalance.Pledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24
	 * AggregateBalancePerSafekeepingPlace24}</li>
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
	 * "Choice between formats for the entity to which the financial instruments are pledged."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#Pledgee
	 * AggregateBalancePerSafekeepingPlace28.Pledgee}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Pledgee = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.Pledgee;
			isDerived = false;
			xmlTag = "Pldgee";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledgee";
			definition = "Choice between formats for the entity to which the financial instruments are pledged.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.Pledgee);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PledgeeFormat1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Total quantity of financial instruments of the balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Balance1 Balance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24
	 * AggregateBalancePerSafekeepingPlace24}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#AggregateBalance
	 * AggregateBalancePerSafekeepingPlace28.AggregateBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#AggregateBalance
	 * AggregateBalancePerSafekeepingPlace20.AggregateBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AggregateBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmObject();
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			xmlTag = "AggtBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalance";
			definition = "Total quantity of financial instruments of the balance.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.AggregateBalance;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.AggregateBalance);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Balance1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Total quantity of financial instruments of the balance that is available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity5Choice
	 * BalanceQuantity5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#AvailableQuantity
	 * SecuritiesBalance.AvailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24
	 * AggregateBalancePerSafekeepingPlace24}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#AvailableBalance
	 * AggregateBalancePerSafekeepingPlace28.AvailableBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#AvailableBalance
	 * AggregateBalancePerSafekeepingPlace20.AvailableBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AvailableBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.AvailableQuantity;
			isDerived = false;
			xmlTag = "AvlblBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableBalance";
			definition = "Total quantity of financial instruments of the balance that is available.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.AvailableBalance;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.AvailableBalance);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BalanceQuantity5Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Total quantity of financial instruments of the balance that is not
	 * available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity5Choice
	 * BalanceQuantity5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24
	 * AggregateBalancePerSafekeepingPlace24}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#NotAvailableBalance
	 * AggregateBalancePerSafekeepingPlace28.NotAvailableBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#NotAvailableBalance
	 * AggregateBalancePerSafekeepingPlace20.NotAvailableBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd NotAvailableBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmObject();
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			xmlTag = "NotAvlblBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAvailableBalance";
			definition = "Total quantity of financial instruments of the balance that is not available.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.NotAvailableBalance;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.NotAvailableBalance);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BalanceQuantity5Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Price of the financial instrument in one or more currencies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PriceInformation5
	 * PriceInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#Pricing
	 * Security.Pricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24
	 * AggregateBalancePerSafekeepingPlace24}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#PriceDetails
	 * AggregateBalancePerSafekeepingPlace28.PriceDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#PriceDetails
	 * AggregateBalancePerSafekeepingPlace20.PriceDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PriceDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.Pricing;
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Price of the financial instrument in one or more currencies.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.PriceDetails;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.PriceDetails);
			minOccurs = 0;
			type_lazy = () -> PriceInformation5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Information needed to process a currency exchange or conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms14
	 * ForeignExchangeTerms14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#ExchangeRate
	 * SecuritiesBalance.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24
	 * AggregateBalancePerSafekeepingPlace24}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace28.ForeignExchangeDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace20.ForeignExchangeDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ForeignExchangeDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.ExchangeRate;
			isDerived = false;
			xmlTag = "FXDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Information needed to process a currency exchange or conversion.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.ForeignExchangeDetails;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.ForeignExchangeDetails);
			minOccurs = 0;
			type_lazy = () -> ForeignExchangeTerms14.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#NumberOfDays
	 * DateTimePeriod.NumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24
	 * AggregateBalancePerSafekeepingPlace24}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#DaysAccrued
	 * AggregateBalancePerSafekeepingPlace28.DaysAccrued}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#DaysAccrued
	 * AggregateBalancePerSafekeepingPlace20.DaysAccrued}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute DaysAccrued = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.NumberOfDays;
			isDerived = false;
			xmlTag = "DaysAcrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DaysAccrued";
			definition = "Specifies the number of days used for calculating the accrued interest amount.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.DaysAccrued;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.DaysAccrued);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Valuation amounts provided in the base currency of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceAmounts3
	 * BalanceAmounts3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#AssetHolding
	 * Balance.AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24
	 * AggregateBalancePerSafekeepingPlace24}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace28.AccountBaseCurrencyAmounts}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace20.AccountBaseCurrencyAmounts}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AccountBaseCurrencyAmounts = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Balance.AssetHolding;
			isDerived = false;
			xmlTag = "AcctBaseCcyAmts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBaseCurrencyAmounts";
			definition = "Valuation amounts provided in the base currency of the account.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.AccountBaseCurrencyAmounts;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.AccountBaseCurrencyAmounts);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BalanceAmounts3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Valuation amounts provided in the currency of the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceAmounts3
	 * BalanceAmounts3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#AssetHolding
	 * Balance.AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24
	 * AggregateBalancePerSafekeepingPlace24}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace28.InstrumentCurrencyAmounts}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace20.InstrumentCurrencyAmounts}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd InstrumentCurrencyAmounts = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Balance.AssetHolding;
			isDerived = false;
			xmlTag = "InstrmCcyAmts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentCurrencyAmounts";
			definition = "Valuation amounts provided in the currency of the financial instrument.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.InstrumentCurrencyAmounts;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.InstrumentCurrencyAmounts);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BalanceAmounts3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Breakdown of the aggregate quantity reported into significant lots, for
	 * example, tax lots.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuantityBreakdown23
	 * QuantityBreakdown23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#LotBreakdown
	 * SecuritiesQuantity.LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24
	 * AggregateBalancePerSafekeepingPlace24}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace28.QuantityBreakdown}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace20.QuantityBreakdown}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd QuantityBreakdown = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.LotBreakdown;
			isDerived = false;
			xmlTag = "QtyBrkdwn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityBreakdown";
			definition = "Breakdown of the aggregate quantity reported into significant lots, for example, tax lots.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.QuantityBreakdown;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.QuantityBreakdown);
			minOccurs = 0;
			type_lazy = () -> QuantityBreakdown23.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies the underlying business area/type of trade causing the
	 * collateral movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ExposureType12Choice
	 * ExposureType12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#ExposureType
	 * Obligation.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24
	 * AggregateBalancePerSafekeepingPlace24}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#ExposureType
	 * AggregateBalancePerSafekeepingPlace28.ExposureType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ExposureType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Obligation.ExposureType;
			isDerived = false;
			xmlTag = "XpsrTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureType";
			definition = "Specifies the underlying business area/type of trade causing the collateral movement.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.ExposureType);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ExposureType12Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Breakdown of the aggregate balance per meaningful sub-balances and
	 * availability.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation11
	 * SubBalanceInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SecuritiesSubBalance
	 * SecuritiesBalance.SecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24
	 * AggregateBalancePerSafekeepingPlace24}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace28.BalanceBreakdown}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace20.BalanceBreakdown}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd BalanceBreakdown = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.SecuritiesSubBalance;
			isDerived = false;
			xmlTag = "BalBrkdwn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceBreakdown";
			definition = "Breakdown of the aggregate balance per meaningful sub-balances and availability.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.BalanceBreakdown;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.BalanceBreakdown);
			minOccurs = 0;
			type_lazy = () -> SubBalanceInformation11.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides additional instrument sub-balance information on all or parts of
	 * the reported financial instrument (unregistered, tax exempt, etc.).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation11
	 * AdditionalBalanceInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SecuritiesSubBalance
	 * SecuritiesBalance.SecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24
	 * AggregateBalancePerSafekeepingPlace24}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace28.AdditionalBalanceBreakdown}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace20.AdditionalBalanceBreakdown}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AdditionalBalanceBreakdown = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.SecuritiesSubBalance;
			isDerived = false;
			xmlTag = "AddtlBalBrkdwn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalBalanceBreakdown";
			definition = "Provides additional instrument sub-balance information on all or parts of the reported financial instrument (unregistered, tax exempt, etc.).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.AdditionalBalanceBreakdown;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.AdditionalBalanceBreakdown);
			minOccurs = 0;
			type_lazy = () -> AdditionalBalanceInformation11.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides additional information on the holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24
	 * AggregateBalancePerSafekeepingPlace24}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#HoldingAdditionalDetails
	 * AggregateBalancePerSafekeepingPlace28.HoldingAdditionalDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#HoldingAdditionalDetails
	 * AggregateBalancePerSafekeepingPlace20.HoldingAdditionalDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute HoldingAdditionalDetails = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmObject();
			isDerived = false;
			xmlTag = "HldgAddtlDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetails";
			definition = "Provides additional information on the holding.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.HoldingAdditionalDetails;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.HoldingAdditionalDetails);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.PlaceOfListing,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.Pledgee, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.AvailableBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.NotAvailableBalance,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.ForeignExchangeDetails,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.DaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.AccountBaseCurrencyAmounts,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.InstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.QuantityBreakdown,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.ExposureType, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.BalanceBreakdown,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.AdditionalBalanceBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.HoldingAdditionalDetails);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "AggregateBalancePerSafekeepingPlace24";
				definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account at a specified place of safekeeping.";
				previousVersion_lazy = () -> AggregateBalancePerSafekeepingPlace20.mmObject();
				nextVersions_lazy = () -> Arrays.asList(AggregateBalancePerSafekeepingPlace28.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}