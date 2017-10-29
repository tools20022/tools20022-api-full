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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.entity.TreasuryTrade;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Right to buy (call) or sell (put) an underlying amount in one currency
 * against another amount in another currency at a predetermined exchange rate,
 * within a specified period of time or at a specified date and time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CurrencyOption" src="doc-files/CurrencyOption.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyOption#CallAmount
 * CurrencyOption.CallAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyOption#PutAmount
 * CurrencyOption.PutAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#PremiumCalculation
 * CurrencyOption.PremiumCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#OptionDefinition
 * CurrencyOption.OptionDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#PremiumSettlement
 * CurrencyOption.PremiumSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#ExercisedOption
 * CurrencyOption.ExercisedOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#OptionSettlementCurrency
 * CurrencyOption.OptionSettlementCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyOption#StrikeRate
 * CurrencyOption.StrikeRate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentSourceCurrencyOption
 * PaymentObligation.PaymentSourceCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#RelatedOption
 * ForeignExchangeTrade.RelatedOption}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#CurrencyOption
 * Option.CurrencyOption}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PremiumCalculation#Option
 * PremiumCalculation.Option}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Option2#OptionAmounts
 * Option2.OptionAmounts}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option3#OptionAmounts
 * Option3.OptionAmounts}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OptionData1#Option
 * OptionData1.Option}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OptionData2#Option
 * OptionData2.Option}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option4#OptionAmounts
 * Option4.OptionAmounts}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option5#OptionAmounts
 * Option5.OptionAmounts}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option6#OptionAmounts
 * Option6.OptionAmounts}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OptionData3#Option
 * OptionData3.Option}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OptionData4#Option
 * OptionData4.Option}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.TreasuryTrade
 * TreasuryTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AmountsAndValueDate2
 * AmountsAndValueDate2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option2 Option2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option3 Option3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OptionData1 OptionData1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OptionData2 OptionData2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountsAndValueDate3
 * AmountsAndValueDate3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option4 Option4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountsAndValueDate4
 * AmountsAndValueDate4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option5 Option5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountsAndValueDate5
 * AmountsAndValueDate5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option6 Option6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OptionData3 OptionData3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OptionData4 OptionData4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option10 Option10}</li>
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
 * "CurrencyOption"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Right to buy (call) or sell (put) an underlying amount in one currency against another amount in another currency at a predetermined exchange rate, within a specified period of time or at a specified date and time."
 * </li>
 * </ul>
 */
public class CurrencyOption extends TreasuryTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Call amount and currency of a foreign exchange option trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate2#CallAmount
	 * AmountsAndValueDate2.CallAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate3#CallAmount
	 * AmountsAndValueDate3.CallAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate4#CallAmount
	 * AmountsAndValueDate4.CallAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate5#CallAmount
	 * AmountsAndValueDate5.CallAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Call amount and currency of a foreign exchange option trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CallAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountsAndValueDate2.CallAmount, com.tools20022.repository.msg.AmountsAndValueDate3.CallAmount, com.tools20022.repository.msg.AmountsAndValueDate4.CallAmount,
					com.tools20022.repository.msg.AmountsAndValueDate5.CallAmount);
			elementContext_lazy = () -> CurrencyOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CallAmount";
			definition = "Call amount and currency of a foreign exchange option trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Put amount and currency of a foreign exchange option trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate2#PutAmount
	 * AmountsAndValueDate2.PutAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate3#PutAmount
	 * AmountsAndValueDate3.PutAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate4#PutAmount
	 * AmountsAndValueDate4.PutAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate5#PutAmount
	 * AmountsAndValueDate5.PutAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Put amount and currency of a foreign exchange option trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PutAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountsAndValueDate2.PutAmount, com.tools20022.repository.msg.AmountsAndValueDate3.PutAmount, com.tools20022.repository.msg.AmountsAndValueDate4.PutAmount,
					com.tools20022.repository.msg.AmountsAndValueDate5.PutAmount);
			elementContext_lazy = () -> CurrencyOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PutAmount";
			definition = "Put amount and currency of a foreign exchange option trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the way the premium is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PremiumCalculation#Option
	 * PremiumCalculation.Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PremiumCalculation
	 * PremiumCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Option2#Premium
	 * Option2.Premium}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option4#Premium
	 * Option4.Premium}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option5#Premium
	 * Option5.Premium}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option6#Premium
	 * Option6.Premium}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the way the premium is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PremiumCalculation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option2.Premium, com.tools20022.repository.msg.Option4.Premium, com.tools20022.repository.msg.Option5.Premium, com.tools20022.repository.msg.Option6.Premium);
			elementContext_lazy = () -> CurrencyOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PremiumCalculation";
			definition = "Specifies the way the premium is calculated.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PremiumCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PremiumCalculation.Option;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the different parameters used to define an option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Option#CurrencyOption
	 * Option.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Option Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different parameters used to define an option."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OptionDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionDefinition";
			definition = "Specifies the different parameters used to define an option.";
			minOccurs = 0;
			type_lazy = () -> Option.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Option.CurrencyOption;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the amount of the premium paid by the buyer of the option and
	 * its settlement place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentSourceCurrencyOption
	 * PaymentObligation.PaymentSourceCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Option3#Premium
	 * Option3.Premium}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount of the premium paid by the buyer of the option and its settlement place."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PremiumSettlement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option3.Premium);
			elementContext_lazy = () -> CurrencyOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PremiumSettlement";
			definition = "Specifies the amount of the premium paid by the buyer of the option and its settlement place.";
			minOccurs = 0;
			type_lazy = () -> PaymentObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.PaymentSourceCurrencyOption;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the trade that may take place to exercise the option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#RelatedOption
	 * ForeignExchangeTrade.RelatedOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExercisedOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trade that may take place to exercise the option."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExercisedOption = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExercisedOption";
			definition = "Specifies the trade that may take place to exercise the option.";
			minOccurs = 0;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.RelatedOption;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency that must be used to settle the option when it is netted off.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate4#OptionSettlementCurrency
	 * AmountsAndValueDate4.OptionSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate5#OptionSettlementCurrency
	 * AmountsAndValueDate5.OptionSettlementCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionSettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency that must be used to settle the option when it is netted off."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OptionSettlementCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountsAndValueDate4.OptionSettlementCurrency, com.tools20022.repository.msg.AmountsAndValueDate5.OptionSettlementCurrency);
			elementContext_lazy = () -> CurrencyOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionSettlementCurrency";
			definition = "Currency that must be used to settle the option when it is netted off.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	/**
	 * Fixed exchange rate at which the option contract can be exercised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Option2#StrikePrice
	 * Option2.StrikePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option3#StrikePrice
	 * Option3.StrikePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option4#StrikePrice
	 * Option4.StrikePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option5#StrikePrice
	 * Option5.StrikePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option6#StrikePrice
	 * Option6.StrikePrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fixed exchange rate at which the option contract can be exercised."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StrikeRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option2.StrikePrice, com.tools20022.repository.msg.Option3.StrikePrice, com.tools20022.repository.msg.Option4.StrikePrice,
					com.tools20022.repository.msg.Option5.StrikePrice, com.tools20022.repository.msg.Option6.StrikePrice);
			elementContext_lazy = () -> CurrencyOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrikeRate";
			definition = "Fixed exchange rate at which the option contract can be exercised.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CurrencyOption";
				definition = "Right to buy (call) or sell (put) an underlying amount in one currency against another amount in another currency at a predetermined exchange rate, within a specified period of time or at a specified date and time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.PaymentSourceCurrencyOption, com.tools20022.repository.entity.ForeignExchangeTrade.RelatedOption,
						com.tools20022.repository.entity.Option.CurrencyOption, com.tools20022.repository.entity.PremiumCalculation.Option);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option2.OptionAmounts, com.tools20022.repository.msg.Option3.OptionAmounts, com.tools20022.repository.msg.OptionData1.Option,
						com.tools20022.repository.msg.OptionData2.Option, com.tools20022.repository.msg.Option4.OptionAmounts, com.tools20022.repository.msg.Option5.OptionAmounts, com.tools20022.repository.msg.Option6.OptionAmounts,
						com.tools20022.repository.msg.OptionData3.Option, com.tools20022.repository.msg.OptionData4.Option);
				superType_lazy = () -> TreasuryTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CurrencyOption.CallAmount, com.tools20022.repository.entity.CurrencyOption.PutAmount, com.tools20022.repository.entity.CurrencyOption.PremiumCalculation,
						com.tools20022.repository.entity.CurrencyOption.OptionDefinition, com.tools20022.repository.entity.CurrencyOption.PremiumSettlement, com.tools20022.repository.entity.CurrencyOption.ExercisedOption,
						com.tools20022.repository.entity.CurrencyOption.OptionSettlementCurrency, com.tools20022.repository.entity.CurrencyOption.StrikeRate);
				derivationComponent_lazy = () -> Arrays.asList(AmountsAndValueDate2.mmObject(), Option2.mmObject(), Option3.mmObject(), OptionData1.mmObject(), OptionData2.mmObject(), AmountsAndValueDate3.mmObject(), Option4.mmObject(),
						AmountsAndValueDate4.mmObject(), Option5.mmObject(), AmountsAndValueDate5.mmObject(), Option6.mmObject(), OptionData3.mmObject(), OptionData4.mmObject(), Option10.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}