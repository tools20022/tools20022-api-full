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
import com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReport002V09;
import com.tools20022.repository.choice.BalanceQuantity12Choice;
import com.tools20022.repository.codeset.CorporateActionOption5Code;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.RestrictedFINXMax350Text;
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
 * Overall position, in a single security, held in a securities account at a
 * specified place of safekeeping.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmFinancialInstrumentIdentification
 * AggregateBalanceInformation33.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmFinancialInstrumentAttributes
 * AggregateBalanceInformation33.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation33.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmValuationHaircutDetails
 * AggregateBalanceInformation33.mmValuationHaircutDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmAggregateBalance
 * AggregateBalanceInformation33.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmAvailableBalance
 * AggregateBalanceInformation33.mmAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmNotAvailableBalance
 * AggregateBalanceInformation33.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmSafekeepingPlace
 * AggregateBalanceInformation33.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmCorporateActionOptionType
 * AggregateBalanceInformation33.mmCorporateActionOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmPriceDetails
 * AggregateBalanceInformation33.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmForeignExchangeDetails
 * AggregateBalanceInformation33.mmForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmDaysAccrued
 * AggregateBalanceInformation33.mmDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmAccountBaseCurrencyAmounts
 * AggregateBalanceInformation33.mmAccountBaseCurrencyAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmInstrumentCurrencyAmounts
 * AggregateBalanceInformation33.mmInstrumentCurrencyAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmQuantityBreakdown
 * AggregateBalanceInformation33.mmQuantityBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmBalanceBreakdown
 * AggregateBalanceInformation33.mmBalanceBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmAdditionalBalanceBreakdown
 * AggregateBalanceInformation33.mmAdditionalBalanceBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmBalanceAtSafekeepingPlace
 * AggregateBalanceInformation33.mmBalanceAtSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmHoldingAdditionalDetails
 * AggregateBalanceInformation33.mmHoldingAdditionalDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmSupplementaryData
 * AggregateBalanceInformation33.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReport002V09#mmBalanceForAccount
 * SecuritiesBalanceCustodyReport002V09.mmBalanceForAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceAtSafekeepingPlaceRule#forAggregateBalanceInformation33
 * ConstraintBalanceAtSafekeepingPlaceRule.forAggregateBalanceInformation33}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline#forAggregateBalanceInformation33
 * ConstraintAggregateBalanceGuideline.forAggregateBalanceInformation33}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule#forAggregateBalanceInformation33
 * ConstraintHoldingAdditionalDetailsRule.forAggregateBalanceInformation33}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentAttributesRule#forAggregateBalanceInformation33
 * ConstraintFinancialInstrumentAttributesRule.forAggregateBalanceInformation33}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AggregateBalanceInformation33"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Overall position, in a single security, held in a securities account at a specified place of safekeeping."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AggregateBalanceInformation33", propOrder = {"financialInstrumentIdentification", "financialInstrumentAttributes", "investmentFundsFinancialInstrumentAttributes", "valuationHaircutDetails", "aggregateBalance",
		"availableBalance", "notAvailableBalance", "safekeepingPlace", "corporateActionOptionType", "priceDetails", "foreignExchangeDetails", "daysAccrued", "accountBaseCurrencyAmounts", "instrumentCurrencyAmounts", "quantityBreakdown",
		"balanceBreakdown", "additionalBalanceBreakdown", "balanceAtSafekeepingPlace", "holdingAdditionalDetails", "supplementaryData"})
public class AggregateBalanceInformation33 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification20 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20
	 * SecurityIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :35B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalanceInformation33, SecurityIdentification20> mmFinancialInstrumentIdentification = new MMMessageAssociationEnd<AggregateBalanceInformation33, SecurityIdentification20>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalanceInformation33.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":35B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityIdentification20.mmObject();
		}

		@Override
		public SecurityIdentification20 getValue(AggregateBalanceInformation33 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(AggregateBalanceInformation33 obj, SecurityIdentification20 value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected FinancialInstrumentAttributes78 financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78
	 * FinancialInstrumentAttributes78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecurity
	 * SecuritiesBalance.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:FIA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements characterising a financial instrument other than a investment funds."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalanceInformation33, Optional<FinancialInstrumentAttributes78>> mmFinancialInstrumentAttributes = new MMMessageAssociationEnd<AggregateBalanceInformation33, Optional<FinancialInstrumentAttributes78>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalanceInformation33.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAttrbts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:FIA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument other than a investment funds.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAttributes78.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentAttributes78> getValue(AggregateBalanceInformation33 obj) {
			return obj.getFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(AggregateBalanceInformation33 obj, Optional<FinancialInstrumentAttributes78> value) {
			obj.setFinancialInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtFndsFinInstrmAttrbts")
	protected FinancialInstrument22 investmentFundsFinancialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument22
	 * FinancialInstrument22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtFndsFinInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundsFinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements characterising an investment funds financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalanceInformation33, Optional<FinancialInstrument22>> mmInvestmentFundsFinancialInstrumentAttributes = new MMMessageAssociationEnd<AggregateBalanceInformation33, Optional<FinancialInstrument22>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalanceInformation33.mmObject();
			isDerived = false;
			xmlTag = "InvstmtFndsFinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFundsFinancialInstrumentAttributes";
			definition = "Elements characterising an investment funds financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrument22.mmObject();
		}

		@Override
		public Optional<FinancialInstrument22> getValue(AggregateBalanceInformation33 obj) {
			return obj.getInvestmentFundsFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(AggregateBalanceInformation33 obj, Optional<FinancialInstrument22> value) {
			obj.setInvestmentFundsFinancialInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "ValtnHrcutDtls")
	protected BasicCollateralValuation1Details valuationHaircutDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BasicCollateralValuation1Details
	 * BasicCollateralValuation1Details}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmHaircut
	 * AssetHolding.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnHrcutDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:FIA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationHaircutDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Elements used to calculate the valuation haircut."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalanceInformation33, Optional<BasicCollateralValuation1Details>> mmValuationHaircutDetails = new MMMessageAssociationEnd<AggregateBalanceInformation33, Optional<BasicCollateralValuation1Details>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmHaircut;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalanceInformation33.mmObject();
			isDerived = false;
			xmlTag = "ValtnHrcutDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:FIA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationHaircutDetails";
			definition = "Elements used to calculate the valuation haircut.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BasicCollateralValuation1Details.mmObject();
		}

		@Override
		public Optional<BasicCollateralValuation1Details> getValue(AggregateBalanceInformation33 obj) {
			return obj.getValuationHaircutDetails();
		}

		@Override
		public void setValue(AggregateBalanceInformation33 obj, Optional<BasicCollateralValuation1Details> value) {
			obj.setValuationHaircutDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "AggtBal", required = true)
	protected Balance10 aggregateBalance;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
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
	public static final MMMessageAssociationEnd<AggregateBalanceInformation33, Balance10> mmAggregateBalance = new MMMessageAssociationEnd<AggregateBalanceInformation33, Balance10>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalanceInformation33.mmObject();
			isDerived = false;
			xmlTag = "AggtBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::AGGR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalance";
			definition = "Total quantity of financial instruments of the balance.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Balance10.mmObject();
		}

		@Override
		public Balance10 getValue(AggregateBalanceInformation33 obj) {
			return obj.getAggregateBalance();
		}

		@Override
		public void setValue(AggregateBalanceInformation33 obj, Balance10 value) {
			obj.setAggregateBalance(value);
		}
	};
	@XmlElement(name = "AvlblBal")
	protected Balance12 availableBalance;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalanceInformation33, Optional<Balance12>> mmAvailableBalance = new MMMessageAssociationEnd<AggregateBalanceInformation33, Optional<Balance12>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmAvailableQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalanceInformation33.mmObject();
			isDerived = false;
			xmlTag = "AvlblBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::AVAI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableBalance";
			definition = "Total quantity of financial instruments of the balance that is available.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Balance12.mmObject();
		}

		@Override
		public Optional<Balance12> getValue(AggregateBalanceInformation33 obj) {
			return obj.getAvailableBalance();
		}

		@Override
		public void setValue(AggregateBalanceInformation33 obj, Optional<Balance12> value) {
			obj.setAvailableBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "NotAvlblBal")
	protected BalanceQuantity12Choice notAvailableBalance;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalanceInformation33, Optional<BalanceQuantity12Choice>> mmNotAvailableBalance = new MMMessageAssociationEnd<AggregateBalanceInformation33, Optional<BalanceQuantity12Choice>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalanceInformation33.mmObject();
			isDerived = false;
			xmlTag = "NotAvlblBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::NAVL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAvailableBalance";
			definition = "Total quantity of financial instruments of the balance that is not available.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BalanceQuantity12Choice.mmObject();
		}

		@Override
		public Optional<BalanceQuantity12Choice> getValue(AggregateBalanceInformation33 obj) {
			return obj.getNotAvailableBalance();
		}

		@Override
		public void setValue(AggregateBalanceInformation33 obj, Optional<BalanceQuantity12Choice> value) {
			obj.setNotAvailableBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgPlc")
	protected SafeKeepingPlace2 safekeepingPlace;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalanceInformation33, Optional<SafeKeepingPlace2>> mmSafekeepingPlace = new MMMessageAssociationEnd<AggregateBalanceInformation33, Optional<SafeKeepingPlace2>>() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalanceInformation33.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94a::SAFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SafeKeepingPlace2.mmObject();
		}

		@Override
		public Optional<SafeKeepingPlace2> getValue(AggregateBalanceInformation33 obj) {
			return obj.getSafekeepingPlace();
		}

		@Override
		public void setValue(AggregateBalanceInformation33 obj, Optional<SafeKeepingPlace2> value) {
			obj.setSafekeepingPlace(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnOptnTp")
	protected CorporateActionOption5Code corporateActionOptionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption5Code
	 * CorporateActionOption5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionType
	 * CorporateActionOption.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnOptnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H::CAOP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionOptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the corporate action options available to the account owner."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AggregateBalanceInformation33, Optional<CorporateActionOption5Code>> mmCorporateActionOptionType = new MMMessageAttribute<AggregateBalanceInformation33, Optional<CorporateActionOption5Code>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalanceInformation33.mmObject();
			isDerived = false;
			xmlTag = "CorpActnOptnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::CAOP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionOptionType";
			definition = "Specifies the corporate action options available to the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CorporateActionOption5Code.mmObject();
		}

		@Override
		public Optional<CorporateActionOption5Code> getValue(AggregateBalanceInformation33 obj) {
			return obj.getCorporateActionOptionType();
		}

		@Override
		public void setValue(AggregateBalanceInformation33 obj, Optional<CorporateActionOption5Code> value) {
			obj.setCorporateActionOptionType(value.orElse(null));
		}
	};
	@XmlElement(name = "PricDtls")
	protected List<PriceInformation14> priceDetails;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
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
	public static final MMMessageAssociationEnd<AggregateBalanceInformation33, List<PriceInformation14>> mmPriceDetails = new MMMessageAssociationEnd<AggregateBalanceInformation33, List<PriceInformation14>>() {
		{
			businessElementTrace_lazy = () -> Security.mmPricing;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalanceInformation33.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Price of the financial instrument in one or more currencies.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceInformation14.mmObject();
		}

		@Override
		public List<PriceInformation14> getValue(AggregateBalanceInformation33 obj) {
			return obj.getPriceDetails();
		}

		@Override
		public void setValue(AggregateBalanceInformation33 obj, List<PriceInformation14> value) {
			obj.setPriceDetails(value);
		}
	};
	@XmlElement(name = "FXDtls")
	protected List<ForeignExchangeTerms31> foreignExchangeDetails;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
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
	public static final MMMessageAssociationEnd<AggregateBalanceInformation33, List<ForeignExchangeTerms31>> mmForeignExchangeDetails = new MMMessageAssociationEnd<AggregateBalanceInformation33, List<ForeignExchangeTerms31>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalanceInformation33.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92B::EXCH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Information needed to process a currency exchange or conversion.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ForeignExchangeTerms31.mmObject();
		}

		@Override
		public List<ForeignExchangeTerms31> getValue(AggregateBalanceInformation33 obj) {
			return obj.getForeignExchangeDetails();
		}

		@Override
		public void setValue(AggregateBalanceInformation33 obj, List<ForeignExchangeTerms31> value) {
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
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
	public static final MMMessageAttribute<AggregateBalanceInformation33, Optional<Number>> mmDaysAccrued = new MMMessageAttribute<AggregateBalanceInformation33, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalanceInformation33.mmObject();
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

		@Override
		public Optional<Number> getValue(AggregateBalanceInformation33 obj) {
			return obj.getDaysAccrued();
		}

		@Override
		public void setValue(AggregateBalanceInformation33 obj, Optional<Number> value) {
			obj.setDaysAccrued(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctBaseCcyAmts")
	protected BalanceAmounts4 accountBaseCurrencyAmounts;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
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
	public static final MMMessageAssociationEnd<AggregateBalanceInformation33, Optional<BalanceAmounts4>> mmAccountBaseCurrencyAmounts = new MMMessageAssociationEnd<AggregateBalanceInformation33, Optional<BalanceAmounts4>>() {
		{
			businessElementTrace_lazy = () -> Balance.mmAssetHolding;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalanceInformation33.mmObject();
			isDerived = false;
			xmlTag = "AcctBaseCcyAmts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBaseCurrencyAmounts";
			definition = "Valuation amounts provided in the base currency of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BalanceAmounts4.mmObject();
		}

		@Override
		public Optional<BalanceAmounts4> getValue(AggregateBalanceInformation33 obj) {
			return obj.getAccountBaseCurrencyAmounts();
		}

		@Override
		public void setValue(AggregateBalanceInformation33 obj, Optional<BalanceAmounts4> value) {
			obj.setAccountBaseCurrencyAmounts(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrmCcyAmts")
	protected BalanceAmounts4 instrumentCurrencyAmounts;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
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
	public static final MMMessageAssociationEnd<AggregateBalanceInformation33, Optional<BalanceAmounts4>> mmInstrumentCurrencyAmounts = new MMMessageAssociationEnd<AggregateBalanceInformation33, Optional<BalanceAmounts4>>() {
		{
			businessElementTrace_lazy = () -> Balance.mmAssetHolding;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalanceInformation33.mmObject();
			isDerived = false;
			xmlTag = "InstrmCcyAmts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentCurrencyAmounts";
			definition = "Valuation amounts provided in the currency of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BalanceAmounts4.mmObject();
		}

		@Override
		public Optional<BalanceAmounts4> getValue(AggregateBalanceInformation33 obj) {
			return obj.getInstrumentCurrencyAmounts();
		}

		@Override
		public void setValue(AggregateBalanceInformation33 obj, Optional<BalanceAmounts4> value) {
			obj.setInstrumentCurrencyAmounts(value.orElse(null));
		}
	};
	@XmlElement(name = "QtyBrkdwn")
	protected List<QuantityBreakdown40> quantityBreakdown;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
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
	public static final MMMessageAssociationEnd<AggregateBalanceInformation33, List<QuantityBreakdown40>> mmQuantityBreakdown = new MMMessageAssociationEnd<AggregateBalanceInformation33, List<QuantityBreakdown40>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmLotBreakdown;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalanceInformation33.mmObject();
			isDerived = false;
			xmlTag = "QtyBrkdwn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:BREAK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityBreakdown";
			definition = "Breakdown of the aggregate quantity reported into significant lots, for example, tax lots.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> QuantityBreakdown40.mmObject();
		}

		@Override
		public List<QuantityBreakdown40> getValue(AggregateBalanceInformation33 obj) {
			return obj.getQuantityBreakdown();
		}

		@Override
		public void setValue(AggregateBalanceInformation33 obj, List<QuantityBreakdown40> value) {
			obj.setQuantityBreakdown(value);
		}
	};
	@XmlElement(name = "BalBrkdwn")
	protected List<SubBalanceInformation17> balanceBreakdown;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
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
	public static final MMMessageAssociationEnd<AggregateBalanceInformation33, List<SubBalanceInformation17>> mmBalanceBreakdown = new MMMessageAssociationEnd<AggregateBalanceInformation33, List<SubBalanceInformation17>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesSubBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalanceInformation33.mmObject();
			isDerived = false;
			xmlTag = "BalBrkdwn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:SUBBAL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceBreakdown";
			definition = "Breakdown of the aggregate balance per meaningful sub-balances and availability.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SubBalanceInformation17.mmObject();
		}

		@Override
		public List<SubBalanceInformation17> getValue(AggregateBalanceInformation33 obj) {
			return obj.getBalanceBreakdown();
		}

		@Override
		public void setValue(AggregateBalanceInformation33 obj, List<SubBalanceInformation17> value) {
			obj.setBalanceBreakdown(value);
		}
	};
	@XmlElement(name = "AddtlBalBrkdwn")
	protected List<AdditionalBalanceInformation17> additionalBalanceBreakdown;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
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
	public static final MMMessageAssociationEnd<AggregateBalanceInformation33, List<AdditionalBalanceInformation17>> mmAdditionalBalanceBreakdown = new MMMessageAssociationEnd<AggregateBalanceInformation33, List<AdditionalBalanceInformation17>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesSubBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalanceInformation33.mmObject();
			isDerived = false;
			xmlTag = "AddtlBalBrkdwn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:SUBBAL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalBalanceBreakdown";
			definition = "Provides additional instrument sub-balance information on all or parts of the reported financial instrument (unregistered, tax exempt, etc.).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AdditionalBalanceInformation17.mmObject();
		}

		@Override
		public List<AdditionalBalanceInformation17> getValue(AggregateBalanceInformation33 obj) {
			return obj.getAdditionalBalanceBreakdown();
		}

		@Override
		public void setValue(AggregateBalanceInformation33 obj, List<AdditionalBalanceInformation17> value) {
			obj.setAdditionalBalanceBreakdown(value);
		}
	};
	@XmlElement(name = "BalAtSfkpgPlc")
	protected List<AggregateBalancePerSafekeepingPlace31> balanceAtSafekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31
	 * AggregateBalancePerSafekeepingPlace31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalAtSfkpgPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:SUBBAL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceAtSafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Breakdown of positions per place of safekeeping (and optionally per place of listing)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalanceInformation33, List<AggregateBalancePerSafekeepingPlace31>> mmBalanceAtSafekeepingPlace = new MMMessageAssociationEnd<AggregateBalanceInformation33, List<AggregateBalancePerSafekeepingPlace31>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesSubBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalanceInformation33.mmObject();
			isDerived = false;
			xmlTag = "BalAtSfkpgPlc";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:SUBBAL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceAtSafekeepingPlace";
			definition = "Breakdown of positions per place of safekeeping (and optionally per place of listing).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AggregateBalancePerSafekeepingPlace31.mmObject();
		}

		@Override
		public List<AggregateBalancePerSafekeepingPlace31> getValue(AggregateBalanceInformation33 obj) {
			return obj.getBalanceAtSafekeepingPlace();
		}

		@Override
		public void setValue(AggregateBalanceInformation33 obj, List<AggregateBalancePerSafekeepingPlace31> value) {
			obj.setBalanceAtSafekeepingPlace(value);
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
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
	public static final MMMessageAttribute<AggregateBalanceInformation33, Optional<RestrictedFINXMax350Text>> mmHoldingAdditionalDetails = new MMMessageAttribute<AggregateBalanceInformation33, Optional<RestrictedFINXMax350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalanceInformation33.mmObject();
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

		@Override
		public Optional<RestrictedFINXMax350Text> getValue(AggregateBalanceInformation33 obj) {
			return obj.getHoldingAdditionalDetails();
		}

		@Override
		public void setValue(AggregateBalanceInformation33 obj, Optional<RestrictedFINXMax350Text> value) {
			obj.setHoldingAdditionalDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalanceInformation33, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<AggregateBalanceInformation33, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalanceInformation33.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(AggregateBalanceInformation33 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(AggregateBalanceInformation33 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalanceInformation33.mmFinancialInstrumentIdentification,
						com.tools20022.repository.msg.AggregateBalanceInformation33.mmFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation33.mmInvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.AggregateBalanceInformation33.mmValuationHaircutDetails, com.tools20022.repository.msg.AggregateBalanceInformation33.mmAggregateBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation33.mmAvailableBalance, com.tools20022.repository.msg.AggregateBalanceInformation33.mmNotAvailableBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation33.mmSafekeepingPlace, com.tools20022.repository.msg.AggregateBalanceInformation33.mmCorporateActionOptionType,
						com.tools20022.repository.msg.AggregateBalanceInformation33.mmPriceDetails, com.tools20022.repository.msg.AggregateBalanceInformation33.mmForeignExchangeDetails,
						com.tools20022.repository.msg.AggregateBalanceInformation33.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalanceInformation33.mmAccountBaseCurrencyAmounts,
						com.tools20022.repository.msg.AggregateBalanceInformation33.mmInstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation33.mmQuantityBreakdown,
						com.tools20022.repository.msg.AggregateBalanceInformation33.mmBalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation33.mmAdditionalBalanceBreakdown,
						com.tools20022.repository.msg.AggregateBalanceInformation33.mmBalanceAtSafekeepingPlace, com.tools20022.repository.msg.AggregateBalanceInformation33.mmHoldingAdditionalDetails,
						com.tools20022.repository.msg.AggregateBalanceInformation33.mmSupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesBalanceCustodyReport002V09.mmBalanceForAccount);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceAtSafekeepingPlaceRule.forAggregateBalanceInformation33,
						com.tools20022.repository.constraints.ConstraintAggregateBalanceGuideline.forAggregateBalanceInformation33,
						com.tools20022.repository.constraints.ConstraintHoldingAdditionalDetailsRule.forAggregateBalanceInformation33,
						com.tools20022.repository.constraints.ConstraintFinancialInstrumentAttributesRule.forAggregateBalanceInformation33);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AggregateBalanceInformation33";
				definition = "Overall position, in a single security, held in a securities account at a specified place of safekeeping.";
			}
		});
		return mmObject_lazy.get();
	}

	public SecurityIdentification20 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public AggregateBalanceInformation33 setFinancialInstrumentIdentification(SecurityIdentification20 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<FinancialInstrumentAttributes78> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public AggregateBalanceInformation33 setFinancialInstrumentAttributes(FinancialInstrumentAttributes78 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public Optional<FinancialInstrument22> getInvestmentFundsFinancialInstrumentAttributes() {
		return investmentFundsFinancialInstrumentAttributes == null ? Optional.empty() : Optional.of(investmentFundsFinancialInstrumentAttributes);
	}

	public AggregateBalanceInformation33 setInvestmentFundsFinancialInstrumentAttributes(FinancialInstrument22 investmentFundsFinancialInstrumentAttributes) {
		this.investmentFundsFinancialInstrumentAttributes = investmentFundsFinancialInstrumentAttributes;
		return this;
	}

	public Optional<BasicCollateralValuation1Details> getValuationHaircutDetails() {
		return valuationHaircutDetails == null ? Optional.empty() : Optional.of(valuationHaircutDetails);
	}

	public AggregateBalanceInformation33 setValuationHaircutDetails(BasicCollateralValuation1Details valuationHaircutDetails) {
		this.valuationHaircutDetails = valuationHaircutDetails;
		return this;
	}

	public Balance10 getAggregateBalance() {
		return aggregateBalance;
	}

	public AggregateBalanceInformation33 setAggregateBalance(Balance10 aggregateBalance) {
		this.aggregateBalance = Objects.requireNonNull(aggregateBalance);
		return this;
	}

	public Optional<Balance12> getAvailableBalance() {
		return availableBalance == null ? Optional.empty() : Optional.of(availableBalance);
	}

	public AggregateBalanceInformation33 setAvailableBalance(Balance12 availableBalance) {
		this.availableBalance = availableBalance;
		return this;
	}

	public Optional<BalanceQuantity12Choice> getNotAvailableBalance() {
		return notAvailableBalance == null ? Optional.empty() : Optional.of(notAvailableBalance);
	}

	public AggregateBalanceInformation33 setNotAvailableBalance(BalanceQuantity12Choice notAvailableBalance) {
		this.notAvailableBalance = notAvailableBalance;
		return this;
	}

	public Optional<SafeKeepingPlace2> getSafekeepingPlace() {
		return safekeepingPlace == null ? Optional.empty() : Optional.of(safekeepingPlace);
	}

	public AggregateBalanceInformation33 setSafekeepingPlace(SafeKeepingPlace2 safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
		return this;
	}

	public Optional<CorporateActionOption5Code> getCorporateActionOptionType() {
		return corporateActionOptionType == null ? Optional.empty() : Optional.of(corporateActionOptionType);
	}

	public AggregateBalanceInformation33 setCorporateActionOptionType(CorporateActionOption5Code corporateActionOptionType) {
		this.corporateActionOptionType = corporateActionOptionType;
		return this;
	}

	public List<PriceInformation14> getPriceDetails() {
		return priceDetails == null ? priceDetails = new ArrayList<>() : priceDetails;
	}

	public AggregateBalanceInformation33 setPriceDetails(List<PriceInformation14> priceDetails) {
		this.priceDetails = Objects.requireNonNull(priceDetails);
		return this;
	}

	public List<ForeignExchangeTerms31> getForeignExchangeDetails() {
		return foreignExchangeDetails == null ? foreignExchangeDetails = new ArrayList<>() : foreignExchangeDetails;
	}

	public AggregateBalanceInformation33 setForeignExchangeDetails(List<ForeignExchangeTerms31> foreignExchangeDetails) {
		this.foreignExchangeDetails = Objects.requireNonNull(foreignExchangeDetails);
		return this;
	}

	public Optional<Number> getDaysAccrued() {
		return daysAccrued == null ? Optional.empty() : Optional.of(daysAccrued);
	}

	public AggregateBalanceInformation33 setDaysAccrued(Number daysAccrued) {
		this.daysAccrued = daysAccrued;
		return this;
	}

	public Optional<BalanceAmounts4> getAccountBaseCurrencyAmounts() {
		return accountBaseCurrencyAmounts == null ? Optional.empty() : Optional.of(accountBaseCurrencyAmounts);
	}

	public AggregateBalanceInformation33 setAccountBaseCurrencyAmounts(BalanceAmounts4 accountBaseCurrencyAmounts) {
		this.accountBaseCurrencyAmounts = accountBaseCurrencyAmounts;
		return this;
	}

	public Optional<BalanceAmounts4> getInstrumentCurrencyAmounts() {
		return instrumentCurrencyAmounts == null ? Optional.empty() : Optional.of(instrumentCurrencyAmounts);
	}

	public AggregateBalanceInformation33 setInstrumentCurrencyAmounts(BalanceAmounts4 instrumentCurrencyAmounts) {
		this.instrumentCurrencyAmounts = instrumentCurrencyAmounts;
		return this;
	}

	public List<QuantityBreakdown40> getQuantityBreakdown() {
		return quantityBreakdown == null ? quantityBreakdown = new ArrayList<>() : quantityBreakdown;
	}

	public AggregateBalanceInformation33 setQuantityBreakdown(List<QuantityBreakdown40> quantityBreakdown) {
		this.quantityBreakdown = Objects.requireNonNull(quantityBreakdown);
		return this;
	}

	public List<SubBalanceInformation17> getBalanceBreakdown() {
		return balanceBreakdown == null ? balanceBreakdown = new ArrayList<>() : balanceBreakdown;
	}

	public AggregateBalanceInformation33 setBalanceBreakdown(List<SubBalanceInformation17> balanceBreakdown) {
		this.balanceBreakdown = Objects.requireNonNull(balanceBreakdown);
		return this;
	}

	public List<AdditionalBalanceInformation17> getAdditionalBalanceBreakdown() {
		return additionalBalanceBreakdown == null ? additionalBalanceBreakdown = new ArrayList<>() : additionalBalanceBreakdown;
	}

	public AggregateBalanceInformation33 setAdditionalBalanceBreakdown(List<AdditionalBalanceInformation17> additionalBalanceBreakdown) {
		this.additionalBalanceBreakdown = Objects.requireNonNull(additionalBalanceBreakdown);
		return this;
	}

	public List<AggregateBalancePerSafekeepingPlace31> getBalanceAtSafekeepingPlace() {
		return balanceAtSafekeepingPlace == null ? balanceAtSafekeepingPlace = new ArrayList<>() : balanceAtSafekeepingPlace;
	}

	public AggregateBalanceInformation33 setBalanceAtSafekeepingPlace(List<AggregateBalancePerSafekeepingPlace31> balanceAtSafekeepingPlace) {
		this.balanceAtSafekeepingPlace = Objects.requireNonNull(balanceAtSafekeepingPlace);
		return this;
	}

	public Optional<RestrictedFINXMax350Text> getHoldingAdditionalDetails() {
		return holdingAdditionalDetails == null ? Optional.empty() : Optional.of(holdingAdditionalDetails);
	}

	public AggregateBalanceInformation33 setHoldingAdditionalDetails(RestrictedFINXMax350Text holdingAdditionalDetails) {
		this.holdingAdditionalDetails = holdingAdditionalDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public AggregateBalanceInformation33 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}