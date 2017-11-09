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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.choice.UnitOrFaceAmountChoice;
import com.tools20022.repository.datatype.MICIdentifier;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.entity.TradingMarket;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Place at which the security is traded.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradingParameters1#mmMarketIdentification
 * TradingParameters1.mmMarketIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradingParameters1#mmRoundLot
 * TradingParameters1.mmRoundLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradingParameters1#mmTradeLotSize
 * TradingParameters1.mmTradeLotSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradingParameters1#mmSecondaryPlaceOfListing
 * TradingParameters1.mmSecondaryPlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradingParameters1#mmMinimumTradedNominalQuantity
 * TradingParameters1.mmMinimumTradedNominalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradingParameters1#mmMaximumTradedNominalQuantity
 * TradingParameters1.mmMaximumTradedNominalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradingParameters1#mmMinimumTradingPricingIncrement
 * TradingParameters1.mmMinimumTradingPricingIncrement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradingParameters1#mmPrimaryPlaceOfListingIdentification
 * TradingParameters1.mmPrimaryPlaceOfListingIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradingMarket
 * TradingMarket}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradingParameters1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Place at which the security is traded."</li>
 * </ul>
 */
public class TradingParameters1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected MICIdentifier marketIdentification;
	/**
	 * Code allocated to places of trade, ie, stock exchanges, regulated
	 * markets, for example, Electronic Trading Platforms (ECN), and unregulated
	 * markets, for example, Automated Trading Systems (ATS) (MIC - ISO 3166).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmMIC
	 * OrganisationIdentification.mmMIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1
	 * TradingParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to places of trade, ie, stock exchanges, regulated markets, for example, Electronic Trading Platforms (ECN), and unregulated markets, for example, Automated Trading Systems (ATS) (MIC - ISO 3166)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMarketIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmMIC;
			componentContext_lazy = () -> TradingParameters1.mmObject();
			isDerived = false;
			xmlTag = "MktId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketIdentification";
			definition = "Code allocated to places of trade, ie, stock exchanges, regulated markets, for example, Electronic Trading Platforms (ECN), and unregulated markets, for example, Automated Trading Systems (ATS) (MIC - ISO 3166).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice roundLot;
	/**
	 * Minimum quantity of securities that can be purchased without incurring a
	 * larger fee. For example, if the round lot size is 100 and the trade is
	 * for 125 shares, then 100 will be processed without a fee and the
	 * remaining 25 will incur a service fee for being an odd lot size.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmRoundLot
	 * TradingMarket.mmRoundLot}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1
	 * TradingParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RndLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities that can be purchased without incurring a larger fee. For example, if the round lot size is 100 and the trade is for 125  shares, then 100 will be processed without a fee and the remaining 25 will incur a service fee for being an odd lot size."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRoundLot = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradingMarket.mmRoundLot;
			componentContext_lazy = () -> TradingParameters1.mmObject();
			isDerived = false;
			xmlTag = "RndLot";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundLot";
			definition = "Minimum quantity of securities that can be purchased without incurring a larger fee. For example, if the round lot size is 100 and the trade is for 125  shares, then 100 will be processed without a fee and the remaining 25 will incur a service fee for being an odd lot size.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice tradeLotSize;
	/**
	 * Minimum number of securities that can be traded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradeLotSize
	 * TradingMarket.mmTradeLotSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1
	 * TradingParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradLotSz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeLotSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum number of securities that can be traded."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeLotSize = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradingMarket.mmTradeLotSize;
			componentContext_lazy = () -> TradingParameters1.mmObject();
			isDerived = false;
			xmlTag = "TradLotSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeLotSize";
			definition = "Minimum number of securities that can be traded.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected List<MICIdentifier> secondaryPlaceOfListing;
	/**
	 * Market(s) on which the security is listed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
	 * Security.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1
	 * TradingParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryPlcOfListg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryPlaceOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market(s) on which the security is listed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecondaryPlaceOfListing = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> TradingParameters1.mmObject();
			isDerived = false;
			xmlTag = "ScndryPlcOfListg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryPlaceOfListing";
			definition = "Market(s) on which the security is listed.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};
	protected UnitOrFaceAmountChoice minimumTradedNominalQuantity;
	/**
	 * Minimum number of securities that can be traded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountChoice
	 * UnitOrFaceAmountChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmMinimumTradedNominalQuantity
	 * TradingMarket.mmMinimumTradedNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1
	 * TradingParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinTraddNmnlQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumTradedNominalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum number of securities that can be traded."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumTradedNominalQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradingMarket.mmMinimumTradedNominalQuantity;
			componentContext_lazy = () -> TradingParameters1.mmObject();
			isDerived = false;
			xmlTag = "MinTraddNmnlQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumTradedNominalQuantity";
			definition = "Minimum number of securities that can be traded.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmountChoice.mmObject();
		}
	};
	protected UnitOrFaceAmountChoice maximumTradedNominalQuantity;
	/**
	 * Maximum number of securities that can be traded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountChoice
	 * UnitOrFaceAmountChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmMaximumTradedNominalQuantity
	 * TradingMarket.mmMaximumTradedNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1
	 * TradingParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxTraddNmnlQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumTradedNominalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum number of securities that can be traded."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumTradedNominalQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradingMarket.mmMaximumTradedNominalQuantity;
			componentContext_lazy = () -> TradingParameters1.mmObject();
			isDerived = false;
			xmlTag = "MaxTraddNmnlQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumTradedNominalQuantity";
			definition = "Maximum number of securities that can be traded.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmountChoice.mmObject();
		}
	};
	protected Number minimumTradingPricingIncrement;
	/**
	 * Indicates the minimum or smallest movement (up or down) in the price
	 * allowed for the security.
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
	 * {@linkplain com.tools20022.repository.entity.Security#mmMinimumTradingPricingIncrement
	 * Security.mmMinimumTradingPricingIncrement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1
	 * TradingParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinTradgPricgIncrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumTradingPricingIncrement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the minimum or smallest movement (up or down) in the price allowed for the security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumTradingPricingIncrement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmMinimumTradingPricingIncrement;
			componentContext_lazy = () -> TradingParameters1.mmObject();
			isDerived = false;
			xmlTag = "MinTradgPricgIncrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumTradingPricingIncrement";
			definition = "Indicates the minimum or smallest movement (up or down) in the price allowed for the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected MICIdentifier primaryPlaceOfListingIdentification;
	/**
	 * Market(s) on which the security is listed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
	 * Security.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1
	 * TradingParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryPlcOfListgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryPlaceOfListingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market(s) on which the security is listed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPrimaryPlaceOfListingIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> TradingParameters1.mmObject();
			isDerived = false;
			xmlTag = "PmryPlcOfListgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryPlaceOfListingIdentification";
			definition = "Market(s) on which the security is listed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TradingParameters1.mmMarketIdentification, TradingParameters1.mmRoundLot, TradingParameters1.mmTradeLotSize, TradingParameters1.mmSecondaryPlaceOfListing,
						TradingParameters1.mmMinimumTradedNominalQuantity, TradingParameters1.mmMaximumTradedNominalQuantity, TradingParameters1.mmMinimumTradingPricingIncrement, TradingParameters1.mmPrimaryPlaceOfListingIdentification);
				trace_lazy = () -> TradingMarket.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradingParameters1";
				definition = "Place at which the security is traded.";
			}
		});
		return mmObject_lazy.get();
	}

	public MICIdentifier getMarketIdentification() {
		return marketIdentification;
	}

	public void setMarketIdentification(MICIdentifier marketIdentification) {
		this.marketIdentification = marketIdentification;
	}

	public FinancialInstrumentQuantity1Choice getRoundLot() {
		return roundLot;
	}

	public void setRoundLot(FinancialInstrumentQuantity1Choice roundLot) {
		this.roundLot = roundLot;
	}

	public FinancialInstrumentQuantity1Choice getTradeLotSize() {
		return tradeLotSize;
	}

	public void setTradeLotSize(FinancialInstrumentQuantity1Choice tradeLotSize) {
		this.tradeLotSize = tradeLotSize;
	}

	public List<MICIdentifier> getSecondaryPlaceOfListing() {
		return secondaryPlaceOfListing;
	}

	public void setSecondaryPlaceOfListing(List<MICIdentifier> secondaryPlaceOfListing) {
		this.secondaryPlaceOfListing = secondaryPlaceOfListing;
	}

	public UnitOrFaceAmountChoice getMinimumTradedNominalQuantity() {
		return minimumTradedNominalQuantity;
	}

	public void setMinimumTradedNominalQuantity(UnitOrFaceAmountChoice minimumTradedNominalQuantity) {
		this.minimumTradedNominalQuantity = minimumTradedNominalQuantity;
	}

	public UnitOrFaceAmountChoice getMaximumTradedNominalQuantity() {
		return maximumTradedNominalQuantity;
	}

	public void setMaximumTradedNominalQuantity(UnitOrFaceAmountChoice maximumTradedNominalQuantity) {
		this.maximumTradedNominalQuantity = maximumTradedNominalQuantity;
	}

	public Number getMinimumTradingPricingIncrement() {
		return minimumTradingPricingIncrement;
	}

	public void setMinimumTradingPricingIncrement(Number minimumTradingPricingIncrement) {
		this.minimumTradingPricingIncrement = minimumTradingPricingIncrement;
	}

	public MICIdentifier getPrimaryPlaceOfListingIdentification() {
		return primaryPlaceOfListingIdentification;
	}

	public void setPrimaryPlaceOfListingIdentification(MICIdentifier primaryPlaceOfListingIdentification) {
		this.primaryPlaceOfListingIdentification = primaryPlaceOfListingIdentification;
	}
}