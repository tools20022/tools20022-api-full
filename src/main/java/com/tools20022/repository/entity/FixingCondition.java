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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.BusinessDayConventionCode;
import com.tools20022.repository.codeset.DisruptionFallbackCode;
import com.tools20022.repository.codeset.FinancialCenterCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CurrencyExchange;
import com.tools20022.repository.entity.NonDeliverableTrade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Set of parameters used to calculate a rate for instance the fixing rate to be
 * applied to a non-deliverable agreement.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="FixingCondition" src="doc-files/FixingCondition.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FixingCondition#mmFixingDateTime
 * FixingCondition.mmFixingDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FixingCondition#mmNonDeliverableTrade
 * FixingCondition.mmNonDeliverableTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FixingCondition#mmFixingRate
 * FixingCondition.mmFixingRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FixingCondition#mmSettlementRateOption
 * FixingCondition.mmSettlementRateOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FixingCondition#mmFinancialCenter
 * FixingCondition.mmFinancialCenter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FixingCondition#mmDisruptionFallback
 * FixingCondition.mmDisruptionFallback}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FixingCondition#mmBusinessDayConvention
 * FixingCondition.mmBusinessDayConvention}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmFixingConditions
 * CurrencyExchange.mmFixingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#mmFixingConditions
 * NonDeliverableTrade.mmFixingConditions}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClosingData1#mmValuationInformation
 * ClosingData1.mmValuationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClosingData2#mmValuationInformation
 * ClosingData2.mmValuationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardConditions2#mmOpeningConditions
 * NonDeliverableForwardConditions2.mmOpeningConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardConditions2#mmFixingConditions
 * NonDeliverableForwardConditions2.mmFixingConditions}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardValuationConditions1
 * NonDeliverableForwardValuationConditions1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardValuationConditions2
 * NonDeliverableForwardValuationConditions2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ValuationData1 ValuationData1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ValuationData2 ValuationData2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClosingData1 ClosingData1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClosingData2 ClosingData2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OpeningConditions1
 * OpeningConditions1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardConditions2
 * NonDeliverableForwardConditions2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FixingConditions1
 * FixingConditions1}</li>
 * </ul>
 * </li>
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
 * "FixingCondition"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of parameters used to calculate a rate for instance the fixing rate to be applied to a non-deliverable agreement."
 * </li>
 * </ul>
 */
public class FixingCondition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime fixingDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate7#mmForeignExchangeRateFixingDate
	 * CorporateActionDate7.mmForeignExchangeRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate24#mmForeignExchangeRateFixingDate
	 * CorporateActionDate24.mmForeignExchangeRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate9#mmForeignExchangeRateFixingDate
	 * CorporateActionDate9.mmForeignExchangeRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate12#mmForeignExchangeRateFixingDate
	 * CorporateActionDate12.mmForeignExchangeRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate17#mmForeignExchangeRateFixingDate
	 * CorporateActionDate17.mmForeignExchangeRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate20#mmForeignExchangeRateFixingDate
	 * CorporateActionDate20.mmForeignExchangeRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate23#mmForeignExchangeRateFixingDate
	 * CorporateActionDate23.mmForeignExchangeRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate26#mmForeignExchangeRateFixingDate
	 * CorporateActionDate26.mmForeignExchangeRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate5#mmForeignExchangeRateFixingDate
	 * CorporateActionDate5.mmForeignExchangeRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardValuationConditions1#mmValuationDate
	 * NonDeliverableForwardValuationConditions1.mmValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardValuationConditions2#mmValuationDate
	 * NonDeliverableForwardValuationConditions2.mmValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate47#mmForeignExchangeRateFixingDate
	 * CorporateActionDate47.mmForeignExchangeRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate56#mmForeignExchangeRateFixingDate
	 * CorporateActionDate56.mmForeignExchangeRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningConditions1#mmValuationDate
	 * OpeningConditions1.mmValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate62#mmForeignExchangeRateFixingDate
	 * CorporateActionDate62.mmForeignExchangeRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate65#mmForeignExchangeRateFixingDate
	 * CorporateActionDate65.mmForeignExchangeRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate72#mmForeignExchangeRateFixingDate
	 * CorporateActionDate72.mmForeignExchangeRateFixingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition
	 * FixingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixingDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which a rate is observed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<FixingCondition, ISODateTime> mmFixingDateTime = new MMBusinessAttribute<FixingCondition, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate7.mmForeignExchangeRateFixingDate, CorporateActionDate24.mmForeignExchangeRateFixingDate, CorporateActionDate9.mmForeignExchangeRateFixingDate,
					CorporateActionDate12.mmForeignExchangeRateFixingDate, CorporateActionDate17.mmForeignExchangeRateFixingDate, CorporateActionDate20.mmForeignExchangeRateFixingDate, CorporateActionDate23.mmForeignExchangeRateFixingDate,
					CorporateActionDate26.mmForeignExchangeRateFixingDate, CorporateActionDate5.mmForeignExchangeRateFixingDate, NonDeliverableForwardValuationConditions1.mmValuationDate,
					NonDeliverableForwardValuationConditions2.mmValuationDate, CorporateActionDate47.mmForeignExchangeRateFixingDate, CorporateActionDate56.mmForeignExchangeRateFixingDate, OpeningConditions1.mmValuationDate,
					CorporateActionDate62.mmForeignExchangeRateFixingDate, CorporateActionDate65.mmForeignExchangeRateFixingDate, CorporateActionDate72.mmForeignExchangeRateFixingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FixingCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FixingDateTime";
			definition = "Date and time at which a rate is observed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(FixingCondition obj) {
			return obj.getFixingDateTime();
		}

		@Override
		public void setValue(FixingCondition obj, ISODateTime value) {
			obj.setFixingDateTime(value);
		}
	};
	protected NonDeliverableTrade nonDeliverableTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#mmFixingConditions
	 * NonDeliverableTrade.mmFixingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.NonDeliverableTrade
	 * NonDeliverableTrade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosingData1#mmTradeAmounts
	 * ClosingData1.mmTradeAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosingData2#mmTradeAmounts
	 * ClosingData2.mmTradeAmounts}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition
	 * FixingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDeliverableTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Non Deliverable trade for which fixing conditions are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<FixingCondition, Optional<NonDeliverableTrade>> mmNonDeliverableTrade = new MMBusinessAssociationEnd<FixingCondition, Optional<NonDeliverableTrade>>() {
		{
			derivation_lazy = () -> Arrays.asList(ClosingData1.mmTradeAmounts, ClosingData2.mmTradeAmounts);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FixingCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonDeliverableTrade";
			definition = "Non Deliverable trade for which fixing conditions are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> NonDeliverableTrade.mmFixingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> NonDeliverableTrade.mmObject();
		}

		@Override
		public Optional<NonDeliverableTrade> getValue(FixingCondition obj) {
			return obj.getNonDeliverableTrade();
		}

		@Override
		public void setValue(FixingCondition obj, Optional<NonDeliverableTrade> value) {
			obj.setNonDeliverableTrade(value.orElse(null));
		}
	};
	protected CurrencyExchange fixingRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmFixingConditions
	 * CurrencyExchange.mmFixingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosingData1#mmValuationRate
	 * ClosingData1.mmValuationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosingData2#mmValuationRate
	 * ClosingData2.mmValuationRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition
	 * FixingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixingRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate obtained at fixing time by following the fixing conditions (agreed upon by the trading parties)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<FixingCondition, Optional<CurrencyExchange>> mmFixingRate = new MMBusinessAssociationEnd<FixingCondition, Optional<CurrencyExchange>>() {
		{
			derivation_lazy = () -> Arrays.asList(ClosingData1.mmValuationRate, ClosingData2.mmValuationRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FixingCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FixingRate";
			definition = "Rate obtained at fixing time by following the fixing conditions (agreed upon by the trading parties).";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CurrencyExchange.mmFixingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CurrencyExchange.mmObject();
		}

		@Override
		public Optional<CurrencyExchange> getValue(FixingCondition obj) {
			return obj.getFixingRate();
		}

		@Override
		public void setValue(FixingCondition obj, Optional<CurrencyExchange> value) {
			obj.setFixingRate(value.orElse(null));
		}
	};
	protected Max35Text settlementRateOption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningConditions1#mmSettlementRateSource
	 * OpeningConditions1.mmSettlementRateSource}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition
	 * FixingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementRateOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Source used for determining the fixing rate, as provided by various financial publishing organisations."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<FixingCondition, Max35Text> mmSettlementRateOption = new MMBusinessAttribute<FixingCondition, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(OpeningConditions1.mmSettlementRateSource);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FixingCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementRateOption";
			definition = "Source used for determining the fixing rate, as provided by various financial publishing organisations.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(FixingCondition obj) {
			return obj.getSettlementRateOption();
		}

		@Override
		public void setValue(FixingCondition obj, Max35Text value) {
			obj.setSettlementRateOption(value);
		}
	};
	protected FinancialCenterCode financialCenter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition
	 * FixingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCenter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial place taken into account to adjust the date and time, as defined within the business day convention."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<FixingCondition, FinancialCenterCode> mmFinancialCenter = new MMBusinessAttribute<FixingCondition, FinancialCenterCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FixingCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialCenter";
			definition = "Financial place taken into account to adjust the date and time, as defined within the business day convention.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialCenterCode.mmObject();
		}

		@Override
		public FinancialCenterCode getValue(FixingCondition obj) {
			return obj.getFinancialCenter();
		}

		@Override
		public void setValue(FixingCondition obj, FinancialCenterCode value) {
			obj.setFinancialCenter(value);
		}
	};
	protected DisruptionFallbackCode disruptionFallback;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode
	 * DisruptionFallbackCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition
	 * FixingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisruptionFallback"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method that gives rise to either an alternative basis for determining the settlement rate, or an alternative basis for settling a transaction when a disruption event has occurred."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<FixingCondition, DisruptionFallbackCode> mmDisruptionFallback = new MMBusinessAttribute<FixingCondition, DisruptionFallbackCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FixingCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisruptionFallback";
			definition = "Method that gives rise to either an alternative basis for determining the settlement rate, or an alternative basis for settling a transaction when a disruption event has occurred.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DisruptionFallbackCode.mmObject();
		}

		@Override
		public DisruptionFallbackCode getValue(FixingCondition obj) {
			return obj.getDisruptionFallback();
		}

		@Override
		public void setValue(FixingCondition obj, DisruptionFallbackCode value) {
			obj.setDisruptionFallback(value);
		}
	};
	protected BusinessDayConventionCode businessDayConvention;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessDayConventionCode
	 * BusinessDayConventionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition
	 * FixingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessDayConvention"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Convention used for adjusting a date when it is not a business day."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<FixingCondition, BusinessDayConventionCode> mmBusinessDayConvention = new MMBusinessAttribute<FixingCondition, BusinessDayConventionCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FixingCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BusinessDayConvention";
			definition = "Convention used for adjusting a date when it is not a business day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BusinessDayConventionCode.mmObject();
		}

		@Override
		public BusinessDayConventionCode getValue(FixingCondition obj) {
			return obj.getBusinessDayConvention();
		}

		@Override
		public void setValue(FixingCondition obj, BusinessDayConventionCode value) {
			obj.setBusinessDayConvention(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FixingCondition";
				definition = "Set of parameters used to calculate a rate for instance the fixing rate to be applied to a non-deliverable agreement.";
				associationDomain_lazy = () -> Arrays.asList(CurrencyExchange.mmFixingConditions, NonDeliverableTrade.mmFixingConditions);
				derivationElement_lazy = () -> Arrays.asList(ClosingData1.mmValuationInformation, ClosingData2.mmValuationInformation, NonDeliverableForwardConditions2.mmOpeningConditions,
						NonDeliverableForwardConditions2.mmFixingConditions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FixingCondition.mmFixingDateTime, com.tools20022.repository.entity.FixingCondition.mmNonDeliverableTrade,
						com.tools20022.repository.entity.FixingCondition.mmFixingRate, com.tools20022.repository.entity.FixingCondition.mmSettlementRateOption, com.tools20022.repository.entity.FixingCondition.mmFinancialCenter,
						com.tools20022.repository.entity.FixingCondition.mmDisruptionFallback, com.tools20022.repository.entity.FixingCondition.mmBusinessDayConvention);
				derivationComponent_lazy = () -> Arrays.asList(NonDeliverableForwardValuationConditions1.mmObject(), NonDeliverableForwardValuationConditions2.mmObject(), ValuationData1.mmObject(), ValuationData2.mmObject(),
						ClosingData1.mmObject(), ClosingData2.mmObject(), OpeningConditions1.mmObject(), NonDeliverableForwardConditions2.mmObject(), FixingConditions1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return FixingCondition.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getFixingDateTime() {
		return fixingDateTime;
	}

	public FixingCondition setFixingDateTime(ISODateTime fixingDateTime) {
		this.fixingDateTime = Objects.requireNonNull(fixingDateTime);
		return this;
	}

	public Optional<NonDeliverableTrade> getNonDeliverableTrade() {
		return nonDeliverableTrade == null ? Optional.empty() : Optional.of(nonDeliverableTrade);
	}

	public FixingCondition setNonDeliverableTrade(NonDeliverableTrade nonDeliverableTrade) {
		this.nonDeliverableTrade = nonDeliverableTrade;
		return this;
	}

	public Optional<CurrencyExchange> getFixingRate() {
		return fixingRate == null ? Optional.empty() : Optional.of(fixingRate);
	}

	public FixingCondition setFixingRate(CurrencyExchange fixingRate) {
		this.fixingRate = fixingRate;
		return this;
	}

	public Max35Text getSettlementRateOption() {
		return settlementRateOption;
	}

	public FixingCondition setSettlementRateOption(Max35Text settlementRateOption) {
		this.settlementRateOption = Objects.requireNonNull(settlementRateOption);
		return this;
	}

	public FinancialCenterCode getFinancialCenter() {
		return financialCenter;
	}

	public FixingCondition setFinancialCenter(FinancialCenterCode financialCenter) {
		this.financialCenter = Objects.requireNonNull(financialCenter);
		return this;
	}

	public DisruptionFallbackCode getDisruptionFallback() {
		return disruptionFallback;
	}

	public FixingCondition setDisruptionFallback(DisruptionFallbackCode disruptionFallback) {
		this.disruptionFallback = Objects.requireNonNull(disruptionFallback);
		return this;
	}

	public BusinessDayConventionCode getBusinessDayConvention() {
		return businessDayConvention;
	}

	public FixingCondition setBusinessDayConvention(BusinessDayConventionCode businessDayConvention) {
		this.businessDayConvention = Objects.requireNonNull(businessDayConvention);
		return this;
	}
}