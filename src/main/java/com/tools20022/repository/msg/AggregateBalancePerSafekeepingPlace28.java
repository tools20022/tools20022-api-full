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
import com.tools20022.repository.choice.BalanceQuantity8Choice;
import com.tools20022.repository.choice.ExposureType16Choice;
import com.tools20022.repository.choice.MarketIdentification3Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
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
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace28.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmPlaceOfListing
 * AggregateBalancePerSafekeepingPlace28.mmPlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmPledgee
 * AggregateBalancePerSafekeepingPlace28.mmPledgee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace28.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmAvailableBalance
 * AggregateBalancePerSafekeepingPlace28.mmAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmNotAvailableBalance
 * AggregateBalancePerSafekeepingPlace28.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmPriceDetails
 * AggregateBalancePerSafekeepingPlace28.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmForeignExchangeDetails
 * AggregateBalancePerSafekeepingPlace28.mmForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmDaysAccrued
 * AggregateBalancePerSafekeepingPlace28.mmDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmAccountBaseCurrencyAmounts
 * AggregateBalancePerSafekeepingPlace28.mmAccountBaseCurrencyAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmInstrumentCurrencyAmounts
 * AggregateBalancePerSafekeepingPlace28.mmInstrumentCurrencyAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmQuantityBreakdown
 * AggregateBalancePerSafekeepingPlace28.mmQuantityBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmExposureType
 * AggregateBalancePerSafekeepingPlace28.mmExposureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmBalanceBreakdown
 * AggregateBalancePerSafekeepingPlace28.mmBalanceBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmAdditionalBalanceBreakdown
 * AggregateBalancePerSafekeepingPlace28.mmAdditionalBalanceBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmHoldingAdditionalDetails
 * AggregateBalancePerSafekeepingPlace28.mmHoldingAdditionalDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline#forAggregateBalancePerSafekeepingPlace28
 * ConstraintAggregateBalanceGuideline.forAggregateBalancePerSafekeepingPlace28}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule#forAggregateBalancePerSafekeepingPlace28
 * ConstraintHoldingAdditionalDetailsRule.
 * forAggregateBalancePerSafekeepingPlace28}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AggregateBalancePerSafekeepingPlace28"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Net position of a segregated holding, in a single security, within the overall position held in a securities account at a specified place of safekeeping."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24
 * AggregateBalancePerSafekeepingPlace24}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AggregateBalancePerSafekeepingPlace28", propOrder = {"safekeepingPlace", "placeOfListing", "pledgee", "aggregateBalance", "availableBalance", "notAvailableBalance", "priceDetails", "foreignExchangeDetails", "daysAccrued",
		"accountBaseCurrencyAmounts", "instrumentCurrencyAmounts", "quantityBreakdown", "exposureType", "balanceBreakdown", "additionalBalanceBreakdown", "holdingAdditionalDetails"})
public class AggregateBalancePerSafekeepingPlace28 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SfkpgPlc", required = true)
	protected SafeKeepingPlace1 safekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SafeKeepingPlace1
	 * SafeKeepingPlace1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28
	 * AggregateBalancePerSafekeepingPlace28}</li>
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
	 * "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmSafekeepingPlace
	 * AggregateBalancePerSafekeepingPlace24.mmSafekeepingPlace}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, SafeKeepingPlace1> mmSafekeepingPlace = new MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, SafeKeepingPlace1>() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94a::SAFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			previousVersion_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmSafekeepingPlace;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SafeKeepingPlace1.mmObject();
		}

		@Override
		public SafeKeepingPlace1 getValue(AggregateBalancePerSafekeepingPlace28 obj) {
			return obj.getSafekeepingPlace();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace28 obj, SafeKeepingPlace1 value) {
			obj.setSafekeepingPlace(value);
		}
	};
	@XmlElement(name = "PlcOfListg")
	protected MarketIdentification3Choice placeOfListing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification3Choice
	 * MarketIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
	 * Security.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28
	 * AggregateBalancePerSafekeepingPlace28}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace24.mmPlaceOfListing}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, Optional<MarketIdentification3Choice>> mmPlaceOfListing = new MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, Optional<MarketIdentification3Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmObject();
			isDerived = false;
			xmlTag = "PlcOfListg";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94B::PLIS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Market(s) on which the security is listed.";
			previousVersion_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmPlaceOfListing;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketIdentification3Choice.mmObject();
		}

		@Override
		public Optional<MarketIdentification3Choice> getValue(AggregateBalancePerSafekeepingPlace28 obj) {
			return obj.getPlaceOfListing();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace28 obj, Optional<MarketIdentification3Choice> value) {
			obj.setPlaceOfListing(value.orElse(null));
		}
	};
	@XmlElement(name = "Pldgee")
	protected Pledgee1 pledgee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Pledgee1 Pledgee1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmPledgee
	 * SecuritiesBalance.mmPledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28
	 * AggregateBalancePerSafekeepingPlace28}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmPledgee
	 * AggregateBalancePerSafekeepingPlace24.mmPledgee}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, Optional<Pledgee1>> mmPledgee = new MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, Optional<Pledgee1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmPledgee;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmObject();
			isDerived = false;
			xmlTag = "Pldgee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledgee";
			definition = "Specify the entity to which the financial instruments are pledged.";
			previousVersion_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmPledgee;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Pledgee1.mmObject();
		}

		@Override
		public Optional<Pledgee1> getValue(AggregateBalancePerSafekeepingPlace28 obj) {
			return obj.getPledgee();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace28 obj, Optional<Pledgee1> value) {
			obj.setPledgee(value.orElse(null));
		}
	};
	@XmlElement(name = "AggtBal", required = true)
	protected Balance6 aggregateBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Balance6 Balance6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28
	 * AggregateBalancePerSafekeepingPlace28}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmAggregateBalance
	 * AggregateBalancePerSafekeepingPlace24.mmAggregateBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, Balance6> mmAggregateBalance = new MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, Balance6>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmObject();
			isDerived = false;
			xmlTag = "AggtBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::AGGR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalance";
			definition = "Total quantity of financial instruments of the balance.";
			previousVersion_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmAggregateBalance;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Balance6.mmObject();
		}

		@Override
		public Balance6 getValue(AggregateBalancePerSafekeepingPlace28 obj) {
			return obj.getAggregateBalance();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace28 obj, Balance6 value) {
			obj.setAggregateBalance(value);
		}
	};
	@XmlElement(name = "AvlblBal")
	protected Balance8 availableBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Balance8 Balance8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAvailableQuantity
	 * SecuritiesBalance.mmAvailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28
	 * AggregateBalancePerSafekeepingPlace28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvlblBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93B::AVAI</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmAvailableBalance
	 * AggregateBalancePerSafekeepingPlace24.mmAvailableBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, Optional<Balance8>> mmAvailableBalance = new MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, Optional<Balance8>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmAvailableQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmObject();
			isDerived = false;
			xmlTag = "AvlblBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::AVAI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableBalance";
			definition = "Total quantity of financial instruments of the balance that is available.";
			previousVersion_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmAvailableBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Balance8.mmObject();
		}

		@Override
		public Optional<Balance8> getValue(AggregateBalancePerSafekeepingPlace28 obj) {
			return obj.getAvailableBalance();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace28 obj, Optional<Balance8> value) {
			obj.setAvailableBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "NotAvlblBal")
	protected BalanceQuantity8Choice notAvailableBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity8Choice
	 * BalanceQuantity8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28
	 * AggregateBalancePerSafekeepingPlace28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotAvlblBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93B::NAVL</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmNotAvailableBalance
	 * AggregateBalancePerSafekeepingPlace24.mmNotAvailableBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, Optional<BalanceQuantity8Choice>> mmNotAvailableBalance = new MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, Optional<BalanceQuantity8Choice>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmObject();
			isDerived = false;
			xmlTag = "NotAvlblBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::NAVL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAvailableBalance";
			definition = "Total quantity of financial instruments of the balance that is not available.";
			previousVersion_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmNotAvailableBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BalanceQuantity8Choice.mmObject();
		}

		@Override
		public Optional<BalanceQuantity8Choice> getValue(AggregateBalancePerSafekeepingPlace28 obj) {
			return obj.getNotAvailableBalance();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace28 obj, Optional<BalanceQuantity8Choice> value) {
			obj.setNotAvailableBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "PricDtls")
	protected List<PriceInformation12> priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PriceInformation12
	 * PriceInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPricing
	 * Security.mmPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28
	 * AggregateBalancePerSafekeepingPlace28}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace24.mmPriceDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, List<PriceInformation12>> mmPriceDetails = new MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, List<PriceInformation12>>() {
		{
			businessElementTrace_lazy = () -> Security.mmPricing;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Price of the financial instrument in one or more currencies.";
			previousVersion_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmPriceDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceInformation12.mmObject();
		}

		@Override
		public List<PriceInformation12> getValue(AggregateBalancePerSafekeepingPlace28 obj) {
			return obj.getPriceDetails();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace28 obj, List<PriceInformation12> value) {
			obj.setPriceDetails(value);
		}
	};
	@XmlElement(name = "FXDtls")
	protected List<ForeignExchangeTerms22> foreignExchangeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms22
	 * ForeignExchangeTerms22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmExchangeRate
	 * SecuritiesBalance.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28
	 * AggregateBalancePerSafekeepingPlace28}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace24.mmForeignExchangeDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, List<ForeignExchangeTerms22>> mmForeignExchangeDetails = new MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, List<ForeignExchangeTerms22>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92B::EXCH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Information needed to process a currency exchange or conversion.";
			previousVersion_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmForeignExchangeDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ForeignExchangeTerms22.mmObject();
		}

		@Override
		public List<ForeignExchangeTerms22> getValue(AggregateBalancePerSafekeepingPlace28 obj) {
			return obj.getForeignExchangeDetails();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace28 obj, List<ForeignExchangeTerms22> value) {
			obj.setForeignExchangeDetails(value);
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28
	 * AggregateBalancePerSafekeepingPlace28}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace24.mmDaysAccrued}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AggregateBalancePerSafekeepingPlace28, Optional<Number>> mmDaysAccrued = new MMMessageAttribute<AggregateBalancePerSafekeepingPlace28, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmObject();
			isDerived = false;
			xmlTag = "DaysAcrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":99A::DAAC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DaysAccrued";
			definition = "Specifies the number of days used for calculating the accrued interest amount.";
			previousVersion_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmDaysAccrued;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(AggregateBalancePerSafekeepingPlace28 obj) {
			return obj.getDaysAccrued();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace28 obj, Optional<Number> value) {
			obj.setDaysAccrued(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctBaseCcyAmts")
	protected BalanceAmounts3 accountBaseCurrencyAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceAmounts3
	 * BalanceAmounts3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAssetHolding
	 * Balance.mmAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28
	 * AggregateBalancePerSafekeepingPlace28}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace24.mmAccountBaseCurrencyAmounts}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, Optional<BalanceAmounts3>> mmAccountBaseCurrencyAmounts = new MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, Optional<BalanceAmounts3>>() {
		{
			businessElementTrace_lazy = () -> Balance.mmAssetHolding;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmObject();
			isDerived = false;
			xmlTag = "AcctBaseCcyAmts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBaseCurrencyAmounts";
			definition = "Valuation amounts provided in the base currency of the account.";
			previousVersion_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmAccountBaseCurrencyAmounts;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BalanceAmounts3.mmObject();
		}

		@Override
		public Optional<BalanceAmounts3> getValue(AggregateBalancePerSafekeepingPlace28 obj) {
			return obj.getAccountBaseCurrencyAmounts();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace28 obj, Optional<BalanceAmounts3> value) {
			obj.setAccountBaseCurrencyAmounts(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrmCcyAmts")
	protected BalanceAmounts3 instrumentCurrencyAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceAmounts3
	 * BalanceAmounts3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAssetHolding
	 * Balance.mmAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28
	 * AggregateBalancePerSafekeepingPlace28}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace24.mmInstrumentCurrencyAmounts}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, Optional<BalanceAmounts3>> mmInstrumentCurrencyAmounts = new MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, Optional<BalanceAmounts3>>() {
		{
			businessElementTrace_lazy = () -> Balance.mmAssetHolding;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmObject();
			isDerived = false;
			xmlTag = "InstrmCcyAmts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentCurrencyAmounts";
			definition = "Valuation amounts provided in the currency of the financial instrument.";
			previousVersion_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmInstrumentCurrencyAmounts;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BalanceAmounts3.mmObject();
		}

		@Override
		public Optional<BalanceAmounts3> getValue(AggregateBalancePerSafekeepingPlace28 obj) {
			return obj.getInstrumentCurrencyAmounts();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace28 obj, Optional<BalanceAmounts3> value) {
			obj.setInstrumentCurrencyAmounts(value.orElse(null));
		}
	};
	@XmlElement(name = "QtyBrkdwn")
	protected List<QuantityBreakdown27> quantityBreakdown;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuantityBreakdown27
	 * QuantityBreakdown27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLotBreakdown
	 * SecuritiesQuantity.mmLotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28
	 * AggregateBalancePerSafekeepingPlace28}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace24.mmQuantityBreakdown}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, List<QuantityBreakdown27>> mmQuantityBreakdown = new MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, List<QuantityBreakdown27>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmLotBreakdown;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmObject();
			isDerived = false;
			xmlTag = "QtyBrkdwn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:BREAK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityBreakdown";
			definition = "Breakdown of the aggregate quantity reported into significant lots, for example, tax lots.";
			previousVersion_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmQuantityBreakdown;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> QuantityBreakdown27.mmObject();
		}

		@Override
		public List<QuantityBreakdown27> getValue(AggregateBalancePerSafekeepingPlace28 obj) {
			return obj.getQuantityBreakdown();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace28 obj, List<QuantityBreakdown27> value) {
			obj.setQuantityBreakdown(value);
		}
	};
	@XmlElement(name = "XpsrTp")
	protected ExposureType16Choice exposureType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ExposureType16Choice
	 * ExposureType16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmExposureType
	 * Obligation.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28
	 * AggregateBalancePerSafekeepingPlace28}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmExposureType
	 * AggregateBalancePerSafekeepingPlace24.mmExposureType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, Optional<ExposureType16Choice>> mmExposureType = new MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, Optional<ExposureType16Choice>>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmExposureType;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmObject();
			isDerived = false;
			xmlTag = "XpsrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureType";
			definition = "Specifies the underlying business area/type of trade causing the collateral movement.";
			previousVersion_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmExposureType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExposureType16Choice.mmObject();
		}

		@Override
		public Optional<ExposureType16Choice> getValue(AggregateBalancePerSafekeepingPlace28 obj) {
			return obj.getExposureType();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace28 obj, Optional<ExposureType16Choice> value) {
			obj.setExposureType(value.orElse(null));
		}
	};
	@XmlElement(name = "BalBrkdwn")
	protected List<SubBalanceInformation15> balanceBreakdown;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation15
	 * SubBalanceInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28
	 * AggregateBalancePerSafekeepingPlace28}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace24.mmBalanceBreakdown}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, List<SubBalanceInformation15>> mmBalanceBreakdown = new MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, List<SubBalanceInformation15>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesSubBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmObject();
			isDerived = false;
			xmlTag = "BalBrkdwn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:SUBBAL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceBreakdown";
			definition = "Breakdown of the aggregate balance per meaningful sub-balances and availability.";
			previousVersion_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmBalanceBreakdown;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SubBalanceInformation15.mmObject();
		}

		@Override
		public List<SubBalanceInformation15> getValue(AggregateBalancePerSafekeepingPlace28 obj) {
			return obj.getBalanceBreakdown();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace28 obj, List<SubBalanceInformation15> value) {
			obj.setBalanceBreakdown(value);
		}
	};
	@XmlElement(name = "AddtlBalBrkdwn")
	protected List<AdditionalBalanceInformation15> additionalBalanceBreakdown;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15
	 * AdditionalBalanceInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28
	 * AggregateBalancePerSafekeepingPlace28}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace24.mmAdditionalBalanceBreakdown}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, List<AdditionalBalanceInformation15>> mmAdditionalBalanceBreakdown = new MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace28, List<AdditionalBalanceInformation15>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesSubBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmObject();
			isDerived = false;
			xmlTag = "AddtlBalBrkdwn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:SUBBAL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalBalanceBreakdown";
			definition = "Provides additional instrument sub-balance information on all or parts of the reported financial instrument (unregistered, tax exempt, etc.).";
			previousVersion_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmAdditionalBalanceBreakdown;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AdditionalBalanceInformation15.mmObject();
		}

		@Override
		public List<AdditionalBalanceInformation15> getValue(AggregateBalancePerSafekeepingPlace28 obj) {
			return obj.getAdditionalBalanceBreakdown();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace28 obj, List<AdditionalBalanceInformation15> value) {
			obj.setAdditionalBalanceBreakdown(value);
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28
	 * AggregateBalancePerSafekeepingPlace28}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmHoldingAdditionalDetails
	 * AggregateBalancePerSafekeepingPlace24.mmHoldingAdditionalDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AggregateBalancePerSafekeepingPlace28, Optional<Max350Text>> mmHoldingAdditionalDetails = new MMMessageAttribute<AggregateBalancePerSafekeepingPlace28, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmObject();
			isDerived = false;
			xmlTag = "HldgAddtlDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::HOLD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetails";
			definition = "Provides additional information on the holding.";
			previousVersion_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmHoldingAdditionalDetails;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(AggregateBalancePerSafekeepingPlace28 obj) {
			return obj.getHoldingAdditionalDetails();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace28 obj, Optional<Max350Text> value) {
			obj.setHoldingAdditionalDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmSafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmPlaceOfListing,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmPledgee, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmAggregateBalance,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmAvailableBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmNotAvailableBalance,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmPriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmForeignExchangeDetails,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmAccountBaseCurrencyAmounts,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmInstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmQuantityBreakdown,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmExposureType, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmBalanceBreakdown,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmAdditionalBalanceBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmHoldingAdditionalDetails);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline.forAggregateBalancePerSafekeepingPlace28,
						com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule.forAggregateBalancePerSafekeepingPlace28);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AggregateBalancePerSafekeepingPlace28";
				definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account at a specified place of safekeeping.";
				previousVersion_lazy = () -> AggregateBalancePerSafekeepingPlace24.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SafeKeepingPlace1 getSafekeepingPlace() {
		return safekeepingPlace;
	}

	public AggregateBalancePerSafekeepingPlace28 setSafekeepingPlace(SafeKeepingPlace1 safekeepingPlace) {
		this.safekeepingPlace = Objects.requireNonNull(safekeepingPlace);
		return this;
	}

	public Optional<MarketIdentification3Choice> getPlaceOfListing() {
		return placeOfListing == null ? Optional.empty() : Optional.of(placeOfListing);
	}

	public AggregateBalancePerSafekeepingPlace28 setPlaceOfListing(MarketIdentification3Choice placeOfListing) {
		this.placeOfListing = placeOfListing;
		return this;
	}

	public Optional<Pledgee1> getPledgee() {
		return pledgee == null ? Optional.empty() : Optional.of(pledgee);
	}

	public AggregateBalancePerSafekeepingPlace28 setPledgee(Pledgee1 pledgee) {
		this.pledgee = pledgee;
		return this;
	}

	public Balance6 getAggregateBalance() {
		return aggregateBalance;
	}

	public AggregateBalancePerSafekeepingPlace28 setAggregateBalance(Balance6 aggregateBalance) {
		this.aggregateBalance = Objects.requireNonNull(aggregateBalance);
		return this;
	}

	public Optional<Balance8> getAvailableBalance() {
		return availableBalance == null ? Optional.empty() : Optional.of(availableBalance);
	}

	public AggregateBalancePerSafekeepingPlace28 setAvailableBalance(Balance8 availableBalance) {
		this.availableBalance = availableBalance;
		return this;
	}

	public Optional<BalanceQuantity8Choice> getNotAvailableBalance() {
		return notAvailableBalance == null ? Optional.empty() : Optional.of(notAvailableBalance);
	}

	public AggregateBalancePerSafekeepingPlace28 setNotAvailableBalance(BalanceQuantity8Choice notAvailableBalance) {
		this.notAvailableBalance = notAvailableBalance;
		return this;
	}

	public List<PriceInformation12> getPriceDetails() {
		return priceDetails == null ? priceDetails = new ArrayList<>() : priceDetails;
	}

	public AggregateBalancePerSafekeepingPlace28 setPriceDetails(List<PriceInformation12> priceDetails) {
		this.priceDetails = Objects.requireNonNull(priceDetails);
		return this;
	}

	public List<ForeignExchangeTerms22> getForeignExchangeDetails() {
		return foreignExchangeDetails == null ? foreignExchangeDetails = new ArrayList<>() : foreignExchangeDetails;
	}

	public AggregateBalancePerSafekeepingPlace28 setForeignExchangeDetails(List<ForeignExchangeTerms22> foreignExchangeDetails) {
		this.foreignExchangeDetails = Objects.requireNonNull(foreignExchangeDetails);
		return this;
	}

	public Optional<Number> getDaysAccrued() {
		return daysAccrued == null ? Optional.empty() : Optional.of(daysAccrued);
	}

	public AggregateBalancePerSafekeepingPlace28 setDaysAccrued(Number daysAccrued) {
		this.daysAccrued = daysAccrued;
		return this;
	}

	public Optional<BalanceAmounts3> getAccountBaseCurrencyAmounts() {
		return accountBaseCurrencyAmounts == null ? Optional.empty() : Optional.of(accountBaseCurrencyAmounts);
	}

	public AggregateBalancePerSafekeepingPlace28 setAccountBaseCurrencyAmounts(BalanceAmounts3 accountBaseCurrencyAmounts) {
		this.accountBaseCurrencyAmounts = accountBaseCurrencyAmounts;
		return this;
	}

	public Optional<BalanceAmounts3> getInstrumentCurrencyAmounts() {
		return instrumentCurrencyAmounts == null ? Optional.empty() : Optional.of(instrumentCurrencyAmounts);
	}

	public AggregateBalancePerSafekeepingPlace28 setInstrumentCurrencyAmounts(BalanceAmounts3 instrumentCurrencyAmounts) {
		this.instrumentCurrencyAmounts = instrumentCurrencyAmounts;
		return this;
	}

	public List<QuantityBreakdown27> getQuantityBreakdown() {
		return quantityBreakdown == null ? quantityBreakdown = new ArrayList<>() : quantityBreakdown;
	}

	public AggregateBalancePerSafekeepingPlace28 setQuantityBreakdown(List<QuantityBreakdown27> quantityBreakdown) {
		this.quantityBreakdown = Objects.requireNonNull(quantityBreakdown);
		return this;
	}

	public Optional<ExposureType16Choice> getExposureType() {
		return exposureType == null ? Optional.empty() : Optional.of(exposureType);
	}

	public AggregateBalancePerSafekeepingPlace28 setExposureType(ExposureType16Choice exposureType) {
		this.exposureType = exposureType;
		return this;
	}

	public List<SubBalanceInformation15> getBalanceBreakdown() {
		return balanceBreakdown == null ? balanceBreakdown = new ArrayList<>() : balanceBreakdown;
	}

	public AggregateBalancePerSafekeepingPlace28 setBalanceBreakdown(List<SubBalanceInformation15> balanceBreakdown) {
		this.balanceBreakdown = Objects.requireNonNull(balanceBreakdown);
		return this;
	}

	public List<AdditionalBalanceInformation15> getAdditionalBalanceBreakdown() {
		return additionalBalanceBreakdown == null ? additionalBalanceBreakdown = new ArrayList<>() : additionalBalanceBreakdown;
	}

	public AggregateBalancePerSafekeepingPlace28 setAdditionalBalanceBreakdown(List<AdditionalBalanceInformation15> additionalBalanceBreakdown) {
		this.additionalBalanceBreakdown = Objects.requireNonNull(additionalBalanceBreakdown);
		return this;
	}

	public Optional<Max350Text> getHoldingAdditionalDetails() {
		return holdingAdditionalDetails == null ? Optional.empty() : Optional.of(holdingAdditionalDetails);
	}

	public AggregateBalancePerSafekeepingPlace28 setHoldingAdditionalDetails(Max350Text holdingAdditionalDetails) {
		this.holdingAdditionalDetails = holdingAdditionalDetails;
		return this;
	}
}