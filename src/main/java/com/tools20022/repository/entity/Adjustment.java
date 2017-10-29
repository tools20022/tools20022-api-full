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
import com.tools20022.repository.choice.AdjustmentType1Choice;
import com.tools20022.repository.choice.ChargeBasisType1Choice;
import com.tools20022.repository.choice.ChargeTaxBasisType1Choice;
import com.tools20022.repository.choice.DiscountOrChargeType1Choice;
import com.tools20022.repository.codeset.AdjustmentDirectionCode;
import com.tools20022.repository.codeset.AdjustmentTypeCode;
import com.tools20022.repository.codeset.TaxationBasisCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Modification on the value of goods and / or services. For example: rebate,
 * discount.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Adjustment" src="doc-files/Adjustment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#Amount
 * Adjustment.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#ChargeRate
 * Adjustment.ChargeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#CalculationMethod
 * Adjustment.CalculationMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#Payment
 * Adjustment.Payment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#Direction
 * Adjustment.Direction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#Reason
 * Adjustment.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#RelatedLineItem
 * Adjustment.RelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#AllowanceChargeIndicator
 * Adjustment.AllowanceChargeIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#Price
 * Adjustment.Price}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#ChargeIndicator
 * Adjustment.ChargeIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#Type
 * Adjustment.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#CollateralManagement
 * Adjustment.CollateralManagement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#AdjustedBalance
 * Adjustment.AdjustedBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#ChargesPartyRole
 * Adjustment.ChargesPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#EffectivePeriod
 * Adjustment.EffectivePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#CurrencyExchange
 * Adjustment.CurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#SecuritiesOrder
 * Adjustment.SecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#Tax
 * Adjustment.Tax}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedAdjustment
 * DateTimePeriod.RelatedAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Adjustment
 * Tax.Adjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#Adjustments
 * Payment.Adjustments}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#Adjustment
 * Balance.Adjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#PriceAdjustment
 * Price.PriceAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyExchange#Adjustment
 * CurrencyExchange.Adjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#Adjustments
 * SecuritiesOrder.Adjustments}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChargePartyRole#Adjustment
 * ChargePartyRole.Adjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#FinancialAdjustment
 * LineItem.FinancialAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#FeesAndCommissions
 * CollateralManagement.FeesAndCommissions}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#AdjustmentAmountAndReason
 * RemittanceAmount3.AdjustmentAmountAndReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Commission Commission}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges Charges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discount Discount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Allowance Allowance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Penalty Penalty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ChargeTaxBasisType1Choice
 * ChargeTaxBasisType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentAdjustment1
 * DocumentAdjustment1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Adjustment5 Adjustment5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DiscountOrChargeType1Choice
 * DiscountOrChargeType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentAdjustment2
 * DocumentAdjustment2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge1
 * LineItemAllowanceCharge1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Adjustment4 Adjustment4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Adjustment3 Adjustment3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Adjustment6 Adjustment6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Adjustment7 Adjustment7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AdjustmentType1Choice
 * AdjustmentType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ChargeBasisType1Choice
 * ChargeBasisType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge2
 * LineItemAllowanceCharge2}</li>
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
 * "Adjustment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Modification on the value of goods and / or services. For example: rebate, discount."
 * </li>
 * </ul>
 */
public class Adjustment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of money that results from the application of an adjustment
	 * (charges. fees, discount or allowance) to the amount due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge9#Amount
	 * Charge9.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge15#Amount
	 * Charge15.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge4#Amount
	 * Charge4.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge20#Amount
	 * Charge20.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission12#Amount
	 * Commission12.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts12#ChargesFees
	 * OtherAmounts12.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#ExecutingBrokerAmount
	 * OtherAmounts12.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#LocalBrokerCommission
	 * OtherAmounts12.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts14#ChargesFees
	 * OtherAmounts14.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts14#ExecutingBrokerAmount
	 * OtherAmounts14.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts14#LocalBrokerCommission
	 * OtherAmounts14.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts20#ChargesFees
	 * OtherAmounts20.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts20#ExecutingBrokerAmount
	 * OtherAmounts20.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts20#LocalBrokerCommission
	 * OtherAmounts20.LocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#ExecutingBrokerAmount
	 * CorporateActionAmounts2.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#PayingAgentCommissionAmount
	 * CorporateActionAmounts2.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#LocalBrokerCommissionAmount
	 * CorporateActionAmounts2.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#ChargesAmount
	 * CorporateActionAmounts2.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#ExecutingBrokerAmount
	 * CorporateActionAmounts5.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#PayingAgentCommissionAmount
	 * CorporateActionAmounts5.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#LocalBrokerCommissionAmount
	 * CorporateActionAmounts5.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#ChargesAmount
	 * CorporateActionAmounts5.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#ExecutingBrokerAmount
	 * CorporateActionAmounts11.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#PayingAgentCommissionAmount
	 * CorporateActionAmounts11.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#LocalBrokerCommissionAmount
	 * CorporateActionAmounts11.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#ChargesAmount
	 * CorporateActionAmounts11.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#ExecutingBrokerAmount
	 * CorporateActionAmounts12.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#PayingAgentCommissionAmount
	 * CorporateActionAmounts12.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#LocalBrokerCommissionAmount
	 * CorporateActionAmounts12.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#ChargesAmount
	 * CorporateActionAmounts12.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#ExecutingBrokerAmount
	 * CorporateActionAmounts17.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#PayingAgentCommissionAmount
	 * CorporateActionAmounts17.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#LocalBrokerCommissionAmount
	 * CorporateActionAmounts17.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#ChargesAmount
	 * CorporateActionAmounts17.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#ExecutingBrokerAmount
	 * CorporateActionAmounts20.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#PayingAgentCommissionAmount
	 * CorporateActionAmounts20.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#LocalBrokerCommissionAmount
	 * CorporateActionAmounts20.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#ChargesAmount
	 * CorporateActionAmounts20.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#ExecutingBrokerAmount
	 * CorporateActionAmounts23.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#PayingAgentCommissionAmount
	 * CorporateActionAmounts23.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#LocalBrokerCommissionAmount
	 * CorporateActionAmounts23.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#ChargesAmount
	 * CorporateActionAmounts23.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#ExecutingBrokerAmount
	 * CorporateActionAmounts24.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#PayingAgentCommissionAmount
	 * CorporateActionAmounts24.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#LocalBrokerCommissionAmount
	 * CorporateActionAmounts24.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#ChargesAmount
	 * CorporateActionAmounts24.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#ExecutingBrokerAmount
	 * CorporateActionAmounts3.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#PayingAgentCommissionAmount
	 * CorporateActionAmounts3.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#LocalBrokerCommissionAmount
	 * CorporateActionAmounts3.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#ChargesAmount
	 * CorporateActionAmounts3.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#ExecutingBrokerAmount
	 * CorporateActionAmounts6.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#PayingAgentCommissionAmount
	 * CorporateActionAmounts6.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#LocalBrokerCommissionAmount
	 * CorporateActionAmounts6.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#ChargesAmount
	 * CorporateActionAmounts6.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#ExecutingBrokerAmount
	 * CorporateActionAmounts9.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#PayingAgentCommissionAmount
	 * CorporateActionAmounts9.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#LocalBrokerCommissionAmount
	 * CorporateActionAmounts9.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#ChargesAmount
	 * CorporateActionAmounts9.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#ExecutingBrokerAmount
	 * CorporateActionAmounts13.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#PayingAgentCommissionAmount
	 * CorporateActionAmounts13.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#LocalBrokerCommissionAmount
	 * CorporateActionAmounts13.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#ChargesAmount
	 * CorporateActionAmounts13.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#ExecutingBrokerAmount
	 * CorporateActionAmounts16.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#PayingAgentCommissionAmount
	 * CorporateActionAmounts16.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#LocalBrokerCommissionAmount
	 * CorporateActionAmounts16.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#ChargesAmount
	 * CorporateActionAmounts16.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#ExecutingBrokerAmount
	 * CorporateActionAmounts19.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#PayingAgentCommissionAmount
	 * CorporateActionAmounts19.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#LocalBrokerCommissionAmount
	 * CorporateActionAmounts19.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#ChargesAmount
	 * CorporateActionAmounts19.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#ExecutingBrokerAmount
	 * CorporateActionAmounts22.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#PayingAgentCommissionAmount
	 * CorporateActionAmounts22.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#LocalBrokerCommissionAmount
	 * CorporateActionAmounts22.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#ChargesAmount
	 * CorporateActionAmounts22.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#ExecutingBrokerAmount
	 * CorporateActionAmounts25.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#PayingAgentCommissionAmount
	 * CorporateActionAmounts25.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#LocalBrokerCommissionAmount
	 * CorporateActionAmounts25.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#ChargesAmount
	 * CorporateActionAmounts25.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#ExecutingBrokerAmount
	 * CorporateActionAmounts4.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#PayingAgentCommissionAmount
	 * CorporateActionAmounts4.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#LocalBrokerCommissionAmount
	 * CorporateActionAmounts4.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#ChargesAmount
	 * CorporateActionAmounts4.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#ExecutingBrokerAmount
	 * CorporateActionAmounts7.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#PayingAgentCommissionAmount
	 * CorporateActionAmounts7.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#LocalBrokerCommissionAmount
	 * CorporateActionAmounts7.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#ChargesAmount
	 * CorporateActionAmounts7.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#ExecutingBrokerAmount
	 * CorporateActionAmounts10.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#PayingAgentCommissionAmount
	 * CorporateActionAmounts10.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#LocalBrokerCommissionAmount
	 * CorporateActionAmounts10.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#ChargesAmount
	 * CorporateActionAmounts10.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#ExecutingBrokerAmount
	 * CorporateActionAmounts14.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#PayingAgentCommissionAmount
	 * CorporateActionAmounts14.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#LocalBrokerCommissionAmount
	 * CorporateActionAmounts14.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#ChargesAmount
	 * CorporateActionAmounts14.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#ExecutingBrokerAmount
	 * CorporateActionAmounts15.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#PayingAgentCommissionAmount
	 * CorporateActionAmounts15.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#LocalBrokerCommissionAmount
	 * CorporateActionAmounts15.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#ChargesAmount
	 * CorporateActionAmounts15.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#ExecutingBrokerAmount
	 * CorporateActionAmounts18.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#PayingAgentCommissionAmount
	 * CorporateActionAmounts18.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#LocalBrokerCommissionAmount
	 * CorporateActionAmounts18.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#ChargesAmount
	 * CorporateActionAmounts18.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#ExecutingBrokerAmount
	 * CorporateActionAmounts21.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#PayingAgentCommissionAmount
	 * CorporateActionAmounts21.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#LocalBrokerCommissionAmount
	 * CorporateActionAmounts21.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#ChargesAmount
	 * CorporateActionAmounts21.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#ExecutingBrokerAmount
	 * CorporateActionAmounts26.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#PayingAgentCommissionAmount
	 * CorporateActionAmounts26.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#LocalBrokerCommissionAmount
	 * CorporateActionAmounts26.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#ChargesAmount
	 * CorporateActionAmounts26.ChargesAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts4#ChargesFees
	 * OtherAmounts4.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#ExecutingBrokerAmount
	 * OtherAmounts4.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#LocalBrokerCommission
	 * OtherAmounts4.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts5#ChargesFees
	 * OtherAmounts5.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#ExecutingBrokerAmount
	 * OtherAmounts5.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#LocalBrokerCommission
	 * OtherAmounts5.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts17#ChargesFees
	 * OtherAmounts17.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#ExecutingBrokerAmount
	 * OtherAmounts17.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#LocalBrokerCommission
	 * OtherAmounts17.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts23#ChargesFees
	 * OtherAmounts23.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts23#ExecutingBrokerAmount
	 * OtherAmounts23.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts23#LocalBrokerCommission
	 * OtherAmounts23.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts3#ChargesFees
	 * OtherAmounts3.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#ExecutingBrokerAmount
	 * OtherAmounts3.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#LocalBrokerCommission
	 * OtherAmounts3.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7#ChargesFees
	 * OtherAmounts7.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#ExecutingBrokerAmount
	 * OtherAmounts7.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#LocalBrokerCommission
	 * OtherAmounts7.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#ChargesFees
	 * OtherAmounts9.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#ExecutingBrokerAmount
	 * OtherAmounts9.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#LocalBrokerCommission
	 * OtherAmounts9.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts10#ChargesFees
	 * OtherAmounts10.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#ExecutingBrokerAmount
	 * OtherAmounts10.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#LocalBrokerCommission
	 * OtherAmounts10.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts18#ChargesFees
	 * OtherAmounts18.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#ExecutingBrokerAmount
	 * OtherAmounts18.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#LocalBrokerCommission
	 * OtherAmounts18.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts24#ChargesFees
	 * OtherAmounts24.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#ExecutingBrokerAmount
	 * OtherAmounts24.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#LocalBrokerCommission
	 * OtherAmounts24.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts13#ChargesFees
	 * OtherAmounts13.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#ExecutingBrokerAmount
	 * OtherAmounts13.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#LocalBrokerCommission
	 * OtherAmounts13.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts1#ChargesFees
	 * OtherAmounts1.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#ExecutingBrokerAmount
	 * OtherAmounts1.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#LocalBrokerCommission
	 * OtherAmounts1.LocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission16#TotalCommission
	 * Commission16.TotalCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#ChargesFees
	 * OtherAmounts16.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#ExecutingBrokerAmount
	 * OtherAmounts16.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#LocalBrokerCommission
	 * OtherAmounts16.LocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#SharedBrokerageAmount
	 * OtherAmounts16.SharedBrokerageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#ClearingBrokerCommission
	 * OtherAmounts16.ClearingBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesInformation3#TotalChargesAndTaxAmount
	 * ChargesInformation3.TotalChargesAndTaxAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation3#Amount
	 * ChargesInformation3.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesInformation6#TotalChargesAndTaxAmount
	 * ChargesInformation6.TotalChargesAndTaxAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation6#Amount
	 * ChargesInformation6.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DocumentAdjustment1#Amount
	 * DocumentAdjustment1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#Amount
	 * ChargesRecord1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Charges3#TotalChargesAndTaxAmount
	 * Charges3.TotalChargesAndTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DiscountAmountAndType1#Amount
	 * DiscountAmountAndType1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#Amount
	 * ChargesRecord2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Charges4#TotalChargesAndTaxAmount
	 * Charges4.TotalChargesAndTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesInformation1#ChargesAmount
	 * ChargesInformation1.ChargesAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation5#Amount
	 * ChargesInformation5.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation7#Amount
	 * ChargesInformation7.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charges2#Amount
	 * Charges2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#CompensationAmount
	 * PaymentTransaction45.CompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#CompensationAmount
	 * PaymentTransaction34.CompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#CompensationAmount
	 * PaymentTransaction44.CompensationAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission4#Amount
	 * Commission4.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge16#Amount
	 * Charge16.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission9#Amount
	 * Commission9.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge11#Amount
	 * Charge11.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission7#Amount
	 * Commission7.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge19#Amount
	 * Charge19.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission11#Amount
	 * Commission11.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge8#Amount
	 * Charge8.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission6#Amount
	 * Commission6.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge17#Amount
	 * Charge17.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission10#Amount
	 * Commission10.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge10#Amount
	 * Charge10.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalCharges2#TotalAmountOfCharges
	 * TotalCharges2.TotalAmountOfCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalCommissions2#TotalAmountOfCommissions
	 * TotalCommissions2.TotalAmountOfCommissions}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge18#Amount
	 * Charge18.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalCharges3#TotalAmountOfCharges
	 * TotalCharges3.TotalAmountOfCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalCommissions3#TotalAmountOfCommissions
	 * TotalCommissions3.TotalAmountOfCommissions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#ExecutingBrokerAmount
	 * CorporateActionAmounts1.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#PayingAgentCommissionAmount
	 * CorporateActionAmounts1.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#LocalBrokerCommissionAmount
	 * CorporateActionAmounts1.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#ChargesAmount
	 * CorporateActionAmounts1.ChargesAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charges1#Amount
	 * Charges1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#ChargeAmount
	 * TaxVoucher1.ChargeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#CommissionAmount
	 * TaxVoucher1.CommissionAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts2#ChargesFees
	 * OtherAmounts2.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts8#ChargesFees
	 * OtherAmounts8.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts8#ExecutingBrokerAmount
	 * OtherAmounts8.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts8#LocalBrokerCommission
	 * OtherAmounts8.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment5#Amount
	 * Adjustment5.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementAllowanceCharge1#ActualAmount
	 * SettlementAllowanceCharge1.ActualAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesDetails2#Amount
	 * ChargesDetails2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3#DiscountAmount
	 * PaymentTerms3.DiscountAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3#PenaltyAmount
	 * PaymentTerms3.PenaltyAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DocumentAdjustment2#Amount
	 * DocumentAdjustment2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge1#ActualAmount
	 * LineItemAllowanceCharge1.ActualAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment4#Amount
	 * Adjustment4.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemMonetarySummation1#ChargeTotalAmount
	 * LineItemMonetarySummation1.ChargeTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment3#Amount
	 * Adjustment3.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesDetails1#Amount
	 * ChargesDetails1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#ChargesAmount
	 * PaymentObligation1.ChargesAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts11#ChargesFees
	 * OtherAmounts11.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts11#ExecutingBrokerAmount
	 * OtherAmounts11.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts11#LocalBrokerCommission
	 * OtherAmounts11.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts6#ChargesFees
	 * OtherAmounts6.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts15#ChargesFees
	 * OtherAmounts15.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts22#ChargesFees
	 * OtherAmounts22.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountRate1Choice#Amount
	 * AmountRate1Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalCharges4#TotalAmountOfCharges
	 * TotalCharges4.TotalAmountOfCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesInformation2#ChargesAmount
	 * ChargesInformation2.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesInformation4#ChargesAmount
	 * ChargesInformation4.ChargesAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge23#Amount
	 * Charge23.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge22#Amount
	 * Charge22.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission14#Amount
	 * Commission14.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charges5#Amount
	 * Charges5.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission17#Amount
	 * Commission17.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#ExecutingBrokerAmount
	 * CorporateActionAmounts29.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#PayingAgentCommissionAmount
	 * CorporateActionAmounts29.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#LocalBrokerCommissionAmount
	 * CorporateActionAmounts29.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#ChargesAmount
	 * CorporateActionAmounts29.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#ExecutingBrokerAmount
	 * CorporateActionAmounts27.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#PayingAgentCommissionAmount
	 * CorporateActionAmounts27.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#LocalBrokerCommissionAmount
	 * CorporateActionAmounts27.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#ChargesAmount
	 * CorporateActionAmounts27.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#ExecutingBrokerAmount
	 * CorporateActionAmounts28.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#PayingAgentCommissionAmount
	 * CorporateActionAmounts28.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#LocalBrokerCommissionAmount
	 * CorporateActionAmounts28.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#ChargesAmount
	 * CorporateActionAmounts28.ChargesAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment6#Amount
	 * Adjustment6.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Adjustment7#AmountOrPercentage
	 * Adjustment7.AmountOrPercentage}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesDetails4#Amount
	 * ChargesDetails4.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#ExecutingBrokerAmount
	 * CorporateActionAmounts33.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#PayingAgentCommissionAmount
	 * CorporateActionAmounts33.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#LocalBrokerCommissionAmount
	 * CorporateActionAmounts33.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#ChargesAmount
	 * CorporateActionAmounts33.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#ExecutingBrokerAmount
	 * CorporateActionAmounts32.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#PayingAgentCommissionAmount
	 * CorporateActionAmounts32.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#LocalBrokerCommissionAmount
	 * CorporateActionAmounts32.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#ChargesAmount
	 * CorporateActionAmounts32.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#ExecutingBrokerAmount
	 * CorporateActionAmounts35.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#PayingAgentCommissionAmount
	 * CorporateActionAmounts35.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#LocalBrokerCommissionAmount
	 * CorporateActionAmounts35.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#ChargesAmount
	 * CorporateActionAmounts35.ChargesAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission19#Amount
	 * Commission19.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge26#ChargeApplied
	 * Charge26.ChargeApplied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountOrRate3Choice#Amount
	 * AmountOrRate3Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission21#CommissionApplied
	 * Commission21.CommissionApplied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#CompensationAmount
	 * PaymentTransaction50.CompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#CompensationAmount
	 * PaymentTransaction51.CompensationAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission22#Amount
	 * Commission22.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge27#Amount
	 * Charge27.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6#PenaltyAmount
	 * PaymentTerms6.PenaltyAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialItem1#DueAmount
	 * FinancialItem1.DueAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts28#ChargesFees
	 * OtherAmounts28.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#ExecutingBrokerAmount
	 * OtherAmounts28.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#LocalBrokerCommission
	 * OtherAmounts28.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts30#ChargesFees
	 * OtherAmounts30.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#ExecutingBrokerAmount
	 * OtherAmounts30.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#LocalBrokerCommission
	 * OtherAmounts30.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts31#ChargesFees
	 * OtherAmounts31.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#ExecutingBrokerAmount
	 * OtherAmounts31.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#LocalBrokerCommission
	 * OtherAmounts31.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts32#ChargesFees
	 * OtherAmounts32.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts32#ExecutingBrokerAmount
	 * OtherAmounts32.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts32#LocalBrokerCommission
	 * OtherAmounts32.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts29#ChargesFees
	 * OtherAmounts29.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#CompensationAmount
	 * PaymentTransaction65.CompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#CompensationAmount
	 * PaymentTransaction60.CompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#ExecutingBrokerAmount
	 * CorporateActionAmounts37.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#PayingAgentCommissionAmount
	 * CorporateActionAmounts37.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#LocalBrokerCommissionAmount
	 * CorporateActionAmounts37.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#ChargesAmount
	 * CorporateActionAmounts37.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#ExecutingBrokerAmount
	 * CorporateActionAmounts36.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#PayingAgentCommissionAmount
	 * CorporateActionAmounts36.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#LocalBrokerCommissionAmount
	 * CorporateActionAmounts36.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#ChargesAmount
	 * CorporateActionAmounts36.ChargesAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission23#Amount
	 * Commission23.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge29#Amount
	 * Charge29.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#ExecutingBrokerAmount
	 * CorporateActionAmounts38.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#PayingAgentCommissionAmount
	 * CorporateActionAmounts38.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#LocalBrokerCommissionAmount
	 * CorporateActionAmounts38.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#ChargesAmount
	 * CorporateActionAmounts38.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#ExecutingBrokerAmount
	 * CorporateActionAmounts39.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#PayingAgentCommissionAmount
	 * CorporateActionAmounts39.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#LocalBrokerCommissionAmount
	 * CorporateActionAmounts39.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#ChargesAmount
	 * CorporateActionAmounts39.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#ExecutingBrokerAmount
	 * CorporateActionAmounts41.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#PayingAgentCommissionAmount
	 * CorporateActionAmounts41.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#LocalBrokerCommissionAmount
	 * CorporateActionAmounts41.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#ChargesAmount
	 * CorporateActionAmounts41.ChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#ExecutingBrokerAmount
	 * CorporateActionAmounts40.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#PayingAgentCommissionAmount
	 * CorporateActionAmounts40.PayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#LocalBrokerCommissionAmount
	 * CorporateActionAmounts40.LocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#ChargesAmount
	 * CorporateActionAmounts40.ChargesAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts35#ChargesFees
	 * OtherAmounts35.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts35#ExecutingBrokerAmount
	 * OtherAmounts35.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts35#LocalBrokerCommission
	 * OtherAmounts35.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts34#ChargesFees
	 * OtherAmounts34.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts34#ExecutingBrokerAmount
	 * OtherAmounts34.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts34#LocalBrokerCommission
	 * OtherAmounts34.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts38#ChargesFees
	 * OtherAmounts38.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#ExecutingBrokerAmount
	 * OtherAmounts38.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#LocalBrokerCommission
	 * OtherAmounts38.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts36#ChargesFees
	 * OtherAmounts36.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts36#ExecutingBrokerAmount
	 * OtherAmounts36.ExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts36#LocalBrokerCommission
	 * OtherAmounts36.LocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts33#ChargesFees
	 * OtherAmounts33.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge2#ActualAmount
	 * LineItemAllowanceCharge2.ActualAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#TotalOverheadApplied
	 * TotalFeesAndTaxes40.TotalOverheadApplied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fee3#RepairedStandardAmount
	 * Fee3.RepairedStandardAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fee3#RepairedDiscountAmount
	 * Fee3.RepairedDiscountAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fee3#RepairedRequestedAmount
	 * Fee3.RepairedRequestedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee2#StandardAmount
	 * Fee2.StandardAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee2#AppliedAmount
	 * Fee2.AppliedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee1#StandardAmount
	 * Fee1.StandardAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee1#RequestedAmount
	 * Fee1.RequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#CompensationAmount
	 * PaymentTransaction81.CompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#CompensationAmount
	 * PaymentTransaction76.CompensationAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money that results from the application of an adjustment (charges. fees, discount or allowance) to the amount due."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Charge9.Amount, com.tools20022.repository.msg.Charge15.Amount, com.tools20022.repository.msg.Charge4.Amount, com.tools20022.repository.msg.Charge20.Amount,
					com.tools20022.repository.msg.Commission12.Amount, com.tools20022.repository.msg.OtherAmounts12.ChargesFees, com.tools20022.repository.msg.OtherAmounts12.ExecutingBrokerAmount,
					com.tools20022.repository.msg.OtherAmounts12.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts14.ChargesFees, com.tools20022.repository.msg.OtherAmounts14.ExecutingBrokerAmount,
					com.tools20022.repository.msg.OtherAmounts14.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts20.ChargesFees, com.tools20022.repository.msg.OtherAmounts20.ExecutingBrokerAmount,
					com.tools20022.repository.msg.OtherAmounts20.LocalBrokerCommission, com.tools20022.repository.msg.CorporateActionAmounts2.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts2.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts2.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts2.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts5.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts5.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts5.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts5.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts11.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts11.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts11.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts11.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts12.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts12.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts12.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts12.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts17.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts17.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts17.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts17.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts20.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts20.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts20.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts20.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts23.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts23.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts23.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts23.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts24.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts24.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts24.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts24.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts3.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts3.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts3.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts3.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts6.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts6.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts6.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts6.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts9.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts9.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts9.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts9.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts13.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts13.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts13.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts13.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts16.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts16.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts16.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts16.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts19.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts19.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts19.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts19.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts22.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts22.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts22.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts22.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts25.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts25.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts25.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts25.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts4.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts4.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts4.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts4.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts7.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts7.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts7.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts7.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts10.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts10.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts10.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts10.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts14.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts14.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts14.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts14.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts15.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts15.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts15.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts15.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts18.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts18.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts18.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts18.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts21.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts21.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts21.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts21.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts26.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts26.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts26.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts26.ChargesAmount, com.tools20022.repository.msg.OtherAmounts4.ChargesFees, com.tools20022.repository.msg.OtherAmounts4.ExecutingBrokerAmount,
					com.tools20022.repository.msg.OtherAmounts4.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts5.ChargesFees, com.tools20022.repository.msg.OtherAmounts5.ExecutingBrokerAmount,
					com.tools20022.repository.msg.OtherAmounts5.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts17.ChargesFees, com.tools20022.repository.msg.OtherAmounts17.ExecutingBrokerAmount,
					com.tools20022.repository.msg.OtherAmounts17.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts23.ChargesFees, com.tools20022.repository.msg.OtherAmounts23.ExecutingBrokerAmount,
					com.tools20022.repository.msg.OtherAmounts23.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts3.ChargesFees, com.tools20022.repository.msg.OtherAmounts3.ExecutingBrokerAmount,
					com.tools20022.repository.msg.OtherAmounts3.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts7.ChargesFees, com.tools20022.repository.msg.OtherAmounts7.ExecutingBrokerAmount,
					com.tools20022.repository.msg.OtherAmounts7.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts9.ChargesFees, com.tools20022.repository.msg.OtherAmounts9.ExecutingBrokerAmount,
					com.tools20022.repository.msg.OtherAmounts9.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts10.ChargesFees, com.tools20022.repository.msg.OtherAmounts10.ExecutingBrokerAmount,
					com.tools20022.repository.msg.OtherAmounts10.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts18.ChargesFees, com.tools20022.repository.msg.OtherAmounts18.ExecutingBrokerAmount,
					com.tools20022.repository.msg.OtherAmounts18.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts24.ChargesFees, com.tools20022.repository.msg.OtherAmounts24.ExecutingBrokerAmount,
					com.tools20022.repository.msg.OtherAmounts24.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts13.ChargesFees, com.tools20022.repository.msg.OtherAmounts13.ExecutingBrokerAmount,
					com.tools20022.repository.msg.OtherAmounts13.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts1.ChargesFees, com.tools20022.repository.msg.OtherAmounts1.ExecutingBrokerAmount,
					com.tools20022.repository.msg.OtherAmounts1.LocalBrokerCommission, com.tools20022.repository.msg.Commission16.TotalCommission, com.tools20022.repository.msg.OtherAmounts16.ChargesFees,
					com.tools20022.repository.msg.OtherAmounts16.ExecutingBrokerAmount, com.tools20022.repository.msg.OtherAmounts16.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts16.SharedBrokerageAmount,
					com.tools20022.repository.msg.OtherAmounts16.ClearingBrokerCommission, com.tools20022.repository.msg.ChargesInformation3.TotalChargesAndTaxAmount, com.tools20022.repository.msg.ChargesInformation3.Amount,
					com.tools20022.repository.msg.ChargesInformation6.TotalChargesAndTaxAmount, com.tools20022.repository.msg.ChargesInformation6.Amount, com.tools20022.repository.msg.DocumentAdjustment1.Amount,
					com.tools20022.repository.msg.ChargesRecord1.Amount, com.tools20022.repository.msg.Charges3.TotalChargesAndTaxAmount, com.tools20022.repository.msg.DiscountAmountAndType1.Amount,
					com.tools20022.repository.msg.ChargesRecord2.Amount, com.tools20022.repository.msg.Charges4.TotalChargesAndTaxAmount, com.tools20022.repository.msg.ChargesInformation1.ChargesAmount,
					com.tools20022.repository.msg.ChargesInformation5.Amount, com.tools20022.repository.msg.ChargesInformation7.Amount, com.tools20022.repository.msg.Charges2.Amount,
					com.tools20022.repository.msg.PaymentTransaction45.CompensationAmount, com.tools20022.repository.msg.PaymentTransaction34.CompensationAmount, com.tools20022.repository.msg.PaymentTransaction44.CompensationAmount,
					com.tools20022.repository.msg.Commission4.Amount, com.tools20022.repository.msg.Charge16.Amount, com.tools20022.repository.msg.Commission9.Amount, com.tools20022.repository.msg.Charge11.Amount,
					com.tools20022.repository.msg.Commission7.Amount, com.tools20022.repository.msg.Charge19.Amount, com.tools20022.repository.msg.Commission11.Amount, com.tools20022.repository.msg.Charge8.Amount,
					com.tools20022.repository.msg.Commission6.Amount, com.tools20022.repository.msg.Charge17.Amount, com.tools20022.repository.msg.Commission10.Amount, com.tools20022.repository.msg.Charge10.Amount,
					com.tools20022.repository.msg.TotalCharges2.TotalAmountOfCharges, com.tools20022.repository.msg.TotalCommissions2.TotalAmountOfCommissions, com.tools20022.repository.msg.Charge18.Amount,
					com.tools20022.repository.msg.TotalCharges3.TotalAmountOfCharges, com.tools20022.repository.msg.TotalCommissions3.TotalAmountOfCommissions, com.tools20022.repository.msg.CorporateActionAmounts1.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts1.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts1.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts1.ChargesAmount, com.tools20022.repository.msg.Charges1.Amount, com.tools20022.repository.msg.TaxVoucher1.ChargeAmount,
					com.tools20022.repository.msg.TaxVoucher1.CommissionAmount, com.tools20022.repository.msg.OtherAmounts2.ChargesFees, com.tools20022.repository.msg.OtherAmounts8.ChargesFees,
					com.tools20022.repository.msg.OtherAmounts8.ExecutingBrokerAmount, com.tools20022.repository.msg.OtherAmounts8.LocalBrokerCommission, com.tools20022.repository.msg.Adjustment5.Amount,
					com.tools20022.repository.msg.SettlementAllowanceCharge1.ActualAmount, com.tools20022.repository.msg.ChargesDetails2.Amount, com.tools20022.repository.msg.PaymentTerms3.DiscountAmount,
					com.tools20022.repository.msg.PaymentTerms3.PenaltyAmount, com.tools20022.repository.msg.DocumentAdjustment2.Amount, com.tools20022.repository.msg.LineItemAllowanceCharge1.ActualAmount,
					com.tools20022.repository.msg.Adjustment4.Amount, com.tools20022.repository.msg.LineItemMonetarySummation1.ChargeTotalAmount, com.tools20022.repository.msg.Adjustment3.Amount,
					com.tools20022.repository.msg.ChargesDetails1.Amount, com.tools20022.repository.msg.PaymentObligation1.ChargesAmount, com.tools20022.repository.msg.OtherAmounts11.ChargesFees,
					com.tools20022.repository.msg.OtherAmounts11.ExecutingBrokerAmount, com.tools20022.repository.msg.OtherAmounts11.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts6.ChargesFees,
					com.tools20022.repository.msg.OtherAmounts15.ChargesFees, com.tools20022.repository.msg.OtherAmounts22.ChargesFees, com.tools20022.repository.choice.AmountRate1Choice.Amount,
					com.tools20022.repository.msg.TotalCharges4.TotalAmountOfCharges, com.tools20022.repository.msg.ChargesInformation2.ChargesAmount, com.tools20022.repository.msg.ChargesInformation4.ChargesAmount,
					com.tools20022.repository.msg.Charge23.Amount, com.tools20022.repository.msg.Charge22.Amount, com.tools20022.repository.msg.Commission14.Amount, com.tools20022.repository.msg.Charges5.Amount,
					com.tools20022.repository.msg.Commission17.Amount, com.tools20022.repository.msg.CorporateActionAmounts29.ExecutingBrokerAmount, com.tools20022.repository.msg.CorporateActionAmounts29.PayingAgentCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts29.LocalBrokerCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts29.ChargesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts27.ExecutingBrokerAmount, com.tools20022.repository.msg.CorporateActionAmounts27.PayingAgentCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts27.LocalBrokerCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts27.ChargesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts28.ExecutingBrokerAmount, com.tools20022.repository.msg.CorporateActionAmounts28.PayingAgentCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts28.LocalBrokerCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts28.ChargesAmount, com.tools20022.repository.msg.Adjustment6.Amount,
					com.tools20022.repository.msg.Adjustment7.AmountOrPercentage, com.tools20022.repository.msg.ChargesDetails4.Amount, com.tools20022.repository.msg.CorporateActionAmounts33.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts33.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts33.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts33.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts32.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts32.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts32.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts32.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts35.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts35.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts35.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts35.ChargesAmount, com.tools20022.repository.msg.Commission19.Amount, com.tools20022.repository.msg.Charge26.ChargeApplied,
					com.tools20022.repository.choice.AmountOrRate3Choice.Amount, com.tools20022.repository.msg.Commission21.CommissionApplied, com.tools20022.repository.msg.PaymentTransaction50.CompensationAmount,
					com.tools20022.repository.msg.PaymentTransaction51.CompensationAmount, com.tools20022.repository.msg.Commission22.Amount, com.tools20022.repository.msg.Charge27.Amount,
					com.tools20022.repository.msg.PaymentTerms6.PenaltyAmount, com.tools20022.repository.msg.FinancialItem1.DueAmount, com.tools20022.repository.msg.OtherAmounts28.ChargesFees,
					com.tools20022.repository.msg.OtherAmounts28.ExecutingBrokerAmount, com.tools20022.repository.msg.OtherAmounts28.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts30.ChargesFees,
					com.tools20022.repository.msg.OtherAmounts30.ExecutingBrokerAmount, com.tools20022.repository.msg.OtherAmounts30.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts31.ChargesFees,
					com.tools20022.repository.msg.OtherAmounts31.ExecutingBrokerAmount, com.tools20022.repository.msg.OtherAmounts31.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts32.ChargesFees,
					com.tools20022.repository.msg.OtherAmounts32.ExecutingBrokerAmount, com.tools20022.repository.msg.OtherAmounts32.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts29.ChargesFees,
					com.tools20022.repository.msg.PaymentTransaction65.CompensationAmount, com.tools20022.repository.msg.PaymentTransaction60.CompensationAmount, com.tools20022.repository.msg.CorporateActionAmounts37.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts37.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts37.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts37.ChargesAmount, com.tools20022.repository.msg.CorporateActionAmounts36.ExecutingBrokerAmount,
					com.tools20022.repository.msg.CorporateActionAmounts36.PayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts36.LocalBrokerCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts36.ChargesAmount, com.tools20022.repository.msg.Commission23.Amount, com.tools20022.repository.msg.Charge29.Amount,
					com.tools20022.repository.msg.CorporateActionAmounts38.ExecutingBrokerAmount, com.tools20022.repository.msg.CorporateActionAmounts38.PayingAgentCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts38.LocalBrokerCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts38.ChargesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts39.ExecutingBrokerAmount, com.tools20022.repository.msg.CorporateActionAmounts39.PayingAgentCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts39.LocalBrokerCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts39.ChargesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts41.ExecutingBrokerAmount, com.tools20022.repository.msg.CorporateActionAmounts41.PayingAgentCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts41.LocalBrokerCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts41.ChargesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts40.ExecutingBrokerAmount, com.tools20022.repository.msg.CorporateActionAmounts40.PayingAgentCommissionAmount,
					com.tools20022.repository.msg.CorporateActionAmounts40.LocalBrokerCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts40.ChargesAmount, com.tools20022.repository.msg.OtherAmounts35.ChargesFees,
					com.tools20022.repository.msg.OtherAmounts35.ExecutingBrokerAmount, com.tools20022.repository.msg.OtherAmounts35.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts34.ChargesFees,
					com.tools20022.repository.msg.OtherAmounts34.ExecutingBrokerAmount, com.tools20022.repository.msg.OtherAmounts34.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts38.ChargesFees,
					com.tools20022.repository.msg.OtherAmounts38.ExecutingBrokerAmount, com.tools20022.repository.msg.OtherAmounts38.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts36.ChargesFees,
					com.tools20022.repository.msg.OtherAmounts36.ExecutingBrokerAmount, com.tools20022.repository.msg.OtherAmounts36.LocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts33.ChargesFees,
					com.tools20022.repository.msg.LineItemAllowanceCharge2.ActualAmount, com.tools20022.repository.msg.TotalFeesAndTaxes40.TotalOverheadApplied, com.tools20022.repository.msg.Fee3.RepairedStandardAmount,
					com.tools20022.repository.msg.Fee3.RepairedDiscountAmount, com.tools20022.repository.msg.Fee3.RepairedRequestedAmount, com.tools20022.repository.msg.Fee2.StandardAmount, com.tools20022.repository.msg.Fee2.AppliedAmount,
					com.tools20022.repository.msg.Fee1.StandardAmount, com.tools20022.repository.msg.Fee1.RequestedAmount, com.tools20022.repository.msg.PaymentTransaction81.CompensationAmount,
					com.tools20022.repository.msg.PaymentTransaction76.CompensationAmount);
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money that results from the application of an adjustment (charges. fees, discount or allowance) to the amount due.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Rate used to calculate the amount of the adjustment, allowance, charge or
	 * fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge15#Rate
	 * Charge15.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation3#Rate
	 * ChargesInformation3.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation6#Rate
	 * ChargesInformation6.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#Rate
	 * ChargesRecord1.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#Rate
	 * ChargesRecord2.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge16#Rate
	 * Charge16.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge11#Rate
	 * Charge11.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge19#Rate
	 * Charge19.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge8#Rate Charge8.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge17#Rate
	 * Charge17.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge10#Rate
	 * Charge10.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge18#Rate
	 * Charge18.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3#DiscountPercentRate
	 * PaymentTerms3.DiscountPercentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3#PenaltyPercentRate
	 * PaymentTerms3.PenaltyPercentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge1#CalculationPercent
	 * LineItemAllowanceCharge1.CalculationPercent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment3#Rate
	 * Adjustment3.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesDetails1#Rate
	 * ChargesDetails1.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#ChargesPercentage
	 * PaymentObligation1.ChargesPercentage}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.AmountRate1Choice#Rate
	 * AmountRate1Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge23#Rate
	 * Charge23.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge22#Rate
	 * Charge22.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charges5#Percentage
	 * Charges5.Percentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountOrRate3Choice#Rate
	 * AmountOrRate3Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6#DiscountPercentRate
	 * PaymentTerms6.DiscountPercentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6#PenaltyPercentRate
	 * PaymentTerms6.PenaltyPercentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EarlyPayment1#DiscountPercent
	 * EarlyPayment1.DiscountPercent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge2#CalculationPercent
	 * LineItemAllowanceCharge2.CalculationPercent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee3#RepairedStandardRate
	 * Fee3.RepairedStandardRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee3#RepairedDiscountRate
	 * Fee3.RepairedDiscountRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee3#RepairedRequestedRate
	 * Fee3.RepairedRequestedRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee2#StandardRate
	 * Fee2.StandardRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee2#AppliedRate
	 * Fee2.AppliedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargeOrCommissionDiscount1#Rate
	 * ChargeOrCommissionDiscount1.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee1#StandardRate
	 * Fee1.StandardRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee1#RequestedRate
	 * Fee1.RequestedRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to calculate the amount of the adjustment, allowance, charge or fee."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ChargeRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Charge15.Rate, com.tools20022.repository.msg.ChargesInformation3.Rate, com.tools20022.repository.msg.ChargesInformation6.Rate,
					com.tools20022.repository.msg.ChargesRecord1.Rate, com.tools20022.repository.msg.ChargesRecord2.Rate, com.tools20022.repository.msg.Charge16.Rate, com.tools20022.repository.msg.Charge11.Rate,
					com.tools20022.repository.msg.Charge19.Rate, com.tools20022.repository.msg.Charge8.Rate, com.tools20022.repository.msg.Charge17.Rate, com.tools20022.repository.msg.Charge10.Rate,
					com.tools20022.repository.msg.Charge18.Rate, com.tools20022.repository.msg.PaymentTerms3.DiscountPercentRate, com.tools20022.repository.msg.PaymentTerms3.PenaltyPercentRate,
					com.tools20022.repository.msg.LineItemAllowanceCharge1.CalculationPercent, com.tools20022.repository.msg.Adjustment3.Rate, com.tools20022.repository.msg.ChargesDetails1.Rate,
					com.tools20022.repository.msg.PaymentObligation1.ChargesPercentage, com.tools20022.repository.choice.AmountRate1Choice.Rate, com.tools20022.repository.msg.Charge23.Rate, com.tools20022.repository.msg.Charge22.Rate,
					com.tools20022.repository.msg.Charges5.Percentage, com.tools20022.repository.choice.AmountOrRate3Choice.Rate, com.tools20022.repository.msg.PaymentTerms6.DiscountPercentRate,
					com.tools20022.repository.msg.PaymentTerms6.PenaltyPercentRate, com.tools20022.repository.msg.EarlyPayment1.DiscountPercent, com.tools20022.repository.msg.LineItemAllowanceCharge2.CalculationPercent,
					com.tools20022.repository.msg.Fee3.RepairedStandardRate, com.tools20022.repository.msg.Fee3.RepairedDiscountRate, com.tools20022.repository.msg.Fee3.RepairedRequestedRate,
					com.tools20022.repository.msg.Fee2.StandardRate, com.tools20022.repository.msg.Fee2.AppliedRate, com.tools20022.repository.msg.ChargeOrCommissionDiscount1.Rate, com.tools20022.repository.msg.Fee1.StandardRate,
					com.tools20022.repository.msg.Fee1.RequestedRate);
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargeRate";
			definition = "Rate used to calculate the amount of the adjustment, allowance, charge or fee.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Method used to calculate an adjustment (financial adjustment, charge or
	 * allowance).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode
	 * TaxationBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge4#ChargeBasis
	 * Charge4.ChargeBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge20#ChargeBasis
	 * Charge20.ChargeBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Charge20#ExtendedChargeBasis
	 * Charge20.ExtendedChargeBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge8#ChargeBasis
	 * Charge8.ChargeBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge17#ChargeBasis
	 * Charge17.ChargeBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Charge17#ExtendedChargeBasis
	 * Charge17.ExtendedChargeBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge10#ChargeBasis
	 * Charge10.ChargeBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge18#ChargeBasis
	 * Charge18.ChargeBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Charge18#ExtendedChargeBasis
	 * Charge18.ExtendedChargeBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommissionBasis1Choice#Code
	 * CommissionBasis1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommissionBasis1Choice#Proprietary
	 * CommissionBasis1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge27#ChargeBasis
	 * Charge27.ChargeBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge29#ChargeBasis
	 * Charge29.ChargeBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.ChargeBasis2Choice#Code
	 * ChargeBasis2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeBasis2Choice#Proprietary
	 * ChargeBasis2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee2#Basis Fee2.Basis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee1#Basis Fee1.Basis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used to calculate an adjustment (financial adjustment, charge or allowance)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CalculationMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Charge4.ChargeBasis, com.tools20022.repository.msg.Charge20.ChargeBasis, com.tools20022.repository.msg.Charge20.ExtendedChargeBasis,
					com.tools20022.repository.msg.Charge8.ChargeBasis, com.tools20022.repository.msg.Charge17.ChargeBasis, com.tools20022.repository.msg.Charge17.ExtendedChargeBasis, com.tools20022.repository.msg.Charge10.ChargeBasis,
					com.tools20022.repository.msg.Charge18.ChargeBasis, com.tools20022.repository.msg.Charge18.ExtendedChargeBasis, com.tools20022.repository.choice.CommissionBasis1Choice.Code,
					com.tools20022.repository.choice.CommissionBasis1Choice.Proprietary, com.tools20022.repository.msg.Charge27.ChargeBasis, com.tools20022.repository.msg.Charge29.ChargeBasis,
					com.tools20022.repository.choice.ChargeBasis2Choice.Code, com.tools20022.repository.choice.ChargeBasis2Choice.Proprietary, com.tools20022.repository.msg.Fee2.Basis, com.tools20022.repository.msg.Fee1.Basis);
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationMethod";
			definition = "Method used to calculate an adjustment (financial adjustment, charge or allowance).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TaxationBasisCode.mmObject();
		}
	};
	/**
	 * Specifies the payment resulting from charges due by one party to another
	 * or the payment to which adjustements (for instance charges) are applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#Adjustments
	 * Payment.Adjustments}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the payment resulting from charges due by one party to another or the payment to which adjustements (for instance charges) are applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Specifies the payment resulting from charges due by one party to another or the payment to which adjustements (for instance charges) are applied.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.Adjustments;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether the adjustment must be subtracted or added to the total
	 * amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AdjustmentDirectionCode
	 * AdjustmentDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentAdjustment1#CreditDebitIndicator
	 * DocumentAdjustment1.CreditDebitIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment5#Direction
	 * Adjustment5.Direction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentAdjustment2#CreditDebitIndicator
	 * DocumentAdjustment2.CreditDebitIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment4#Direction
	 * Adjustment4.Direction}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment3#Direction
	 * Adjustment3.Direction}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment6#Direction
	 * Adjustment6.Direction}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment7#Direction
	 * Adjustment7.Direction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Direction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the adjustment must be subtracted or added to the total amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Direction = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentAdjustment1.CreditDebitIndicator, com.tools20022.repository.msg.Adjustment5.Direction,
					com.tools20022.repository.msg.DocumentAdjustment2.CreditDebitIndicator, com.tools20022.repository.msg.Adjustment4.Direction, com.tools20022.repository.msg.Adjustment3.Direction,
					com.tools20022.repository.msg.Adjustment6.Direction, com.tools20022.repository.msg.Adjustment7.Direction);
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Direction";
			definition = "Specifies whether the adjustment must be subtracted or added to the total amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AdjustmentDirectionCode.mmObject();
		}
	};
	/**
	 * Reason for the amount adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.DocumentAdjustment1#Reason
	 * DocumentAdjustment1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementAllowanceCharge1#Reason
	 * SettlementAllowanceCharge1.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DocumentAdjustment2#Reason
	 * DocumentAdjustment2.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge1#Reason
	 * LineItemAllowanceCharge1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge2#Reason
	 * LineItemAllowanceCharge2.Reason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the amount adjustment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Reason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentAdjustment1.Reason, com.tools20022.repository.msg.SettlementAllowanceCharge1.Reason, com.tools20022.repository.msg.DocumentAdjustment2.Reason,
					com.tools20022.repository.msg.LineItemAllowanceCharge1.Reason, com.tools20022.repository.msg.LineItemAllowanceCharge2.Reason);
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Reason for the amount adjustment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	/**
	 * Specifies the line item on which a financial adjustment took place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#FinancialAdjustment
	 * LineItem.FinancialAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the line item on which a financial adjustment took place."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedLineItem";
			definition = "Specifies the line item on which a financial adjustment took place.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> LineItem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.FinancialAdjustment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indication of whether or not this allowance charge is a charge (Indicator
	 * is Yes) that should be added or an allowance that should be subtracted
	 * (Indicator is No).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementAllowanceCharge1#AllowanceChargeIndicator
	 * SettlementAllowanceCharge1.AllowanceChargeIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowanceChargeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of whether or not this allowance charge is a charge (Indicator is Yes) that should be added or an allowance that should be subtracted (Indicator is No)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AllowanceChargeIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementAllowanceCharge1.AllowanceChargeIndicator);
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllowanceChargeIndicator";
			definition = "Indication of whether or not this allowance charge is a charge (Indicator is Yes) that should be added or an allowance that should be subtracted (Indicator is No).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the price which is adjusted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#PriceAdjustment
	 * Price.PriceAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#MarketBrokerCommission
	 * OtherPrices1.MarketBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2#MarketBrokerCommission
	 * OtherPrices2.MarketBrokerCommission}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the price which is adjusted."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Price = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherPrices1.MarketBrokerCommission, com.tools20022.repository.msg.OtherPrices2.MarketBrokerCommission);
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Specifies the price which is adjusted.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Price.PriceAdjustment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indication of whether or not this allowance charge is a charge.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge1#ChargeIndicator
	 * LineItemAllowanceCharge1.ChargeIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge2#ChargeIndicator
	 * LineItemAllowanceCharge2.ChargeIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of whether or not this allowance charge is a charge."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ChargeIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItemAllowanceCharge1.ChargeIndicator, com.tools20022.repository.msg.LineItemAllowanceCharge2.ChargeIndicator);
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargeIndicator";
			definition = "Indication of whether or not this allowance charge is a charge.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the type of adjustment applied to the amount of goods/services
	 * by means of a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AdjustmentTypeCode
	 * AdjustmentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment4#Type
	 * Adjustment4.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Adjustment4#OtherAdjustmentType
	 * Adjustment4.OtherAdjustmentType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment3#Type
	 * Adjustment3.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Adjustment3#OtherAdjustmentType
	 * Adjustment3.OtherAdjustmentType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment6#Type
	 * Adjustment6.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment7#Type
	 * Adjustment7.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdjustmentType1Choice#Type
	 * AdjustmentType1Choice.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdjustmentType1Choice#OtherAdjustmentType
	 * AdjustmentType1Choice.OtherAdjustmentType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of adjustment applied to the amount of goods/services by means of a code."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Adjustment4.Type, com.tools20022.repository.msg.Adjustment4.OtherAdjustmentType, com.tools20022.repository.msg.Adjustment3.Type,
					com.tools20022.repository.msg.Adjustment3.OtherAdjustmentType, com.tools20022.repository.msg.Adjustment6.Type, com.tools20022.repository.msg.Adjustment7.Type, com.tools20022.repository.choice.AdjustmentType1Choice.Type,
					com.tools20022.repository.choice.AdjustmentType1Choice.OtherAdjustmentType);
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of adjustment applied to the amount of goods/services by means of a code.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AdjustmentTypeCode.mmObject();
		}
	};
	/**
	 * Process which groups the activities related to collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#FeesAndCommissions
	 * CollateralManagement.FeesAndCommissions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CollateralManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Process which groups the activities related to collateral.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.FeesAndCommissions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Balance for which adjustments are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#Adjustment
	 * Balance.Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance for which adjustments are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AdjustedBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdjustedBalance";
			definition = "Balance for which adjustments are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Balance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.Adjustment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Role played by a party in the context of charges due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChargePartyRole#Adjustment
	 * ChargePartyRole.Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ChargePartyRole
	 * ChargePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role played by a party in the context of charges due."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ChargesPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargesPartyRole";
			definition = "Role played by a party in the context of charges due.";
			minOccurs = 0;
			type_lazy = () -> ChargePartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ChargePartyRole.Adjustment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period during which the adjustment is applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedAdjustment
	 * DateTimePeriod.RelatedAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectivePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the adjustment is applicable."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd EffectivePeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the adjustment is applicable.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedAdjustment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency exchange for which adjustments such as fees or commissions are
	 * applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#Adjustment
	 * CurrencyExchange.Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency exchange for which adjustments such as fees or commissions are applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Currency exchange for which adjustments such as fees or commissions are applied.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.Adjustment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order for which adjustments are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#Adjustments
	 * SecuritiesOrder.Adjustments}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which adjustments are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesOrder";
			definition = "Order for which adjustments are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.Adjustments;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information on the calculation method resulting in the tax amount
	 * included in the charge transfer. The tax is expressed as a fixed amount,
	 * or as a percentage of the charge amount, upon which the tax is applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#Adjustment
	 * Tax.Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation3#Tax
	 * ChargesInformation3.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation6#Tax
	 * ChargesInformation6.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#Tax
	 * ChargesRecord1.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#Tax
	 * ChargesRecord2.Tax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the calculation method resulting in the tax amount included in the charge transfer. The tax is expressed as a fixed amount, or as a percentage of the charge amount, upon which the tax is applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Tax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ChargesInformation3.Tax, com.tools20022.repository.msg.ChargesInformation6.Tax, com.tools20022.repository.msg.ChargesRecord1.Tax,
					com.tools20022.repository.msg.ChargesRecord2.Tax);
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Information on the calculation method resulting in the tax amount included in the charge transfer. The tax is expressed as a fixed amount, or as a percentage of the charge amount, upon which the tax is applied.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.Adjustment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Adjustment";
				definition = "Modification on the value of goods and / or services. For example: rebate, discount.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedAdjustment, com.tools20022.repository.entity.Tax.Adjustment, com.tools20022.repository.entity.Payment.Adjustments,
						com.tools20022.repository.entity.Balance.Adjustment, com.tools20022.repository.entity.Price.PriceAdjustment, com.tools20022.repository.entity.CurrencyExchange.Adjustment,
						com.tools20022.repository.entity.SecuritiesOrder.Adjustments, com.tools20022.repository.entity.ChargePartyRole.Adjustment, com.tools20022.repository.entity.LineItem.FinancialAdjustment,
						com.tools20022.repository.entity.CollateralManagement.FeesAndCommissions);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount3.AdjustmentAmountAndReason);
				subType_lazy = () -> Arrays.asList(Commission.mmObject(), Charges.mmObject(), Discount.mmObject(), Allowance.mmObject(), Penalty.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Adjustment.Amount, com.tools20022.repository.entity.Adjustment.ChargeRate, com.tools20022.repository.entity.Adjustment.CalculationMethod,
						com.tools20022.repository.entity.Adjustment.Payment, com.tools20022.repository.entity.Adjustment.Direction, com.tools20022.repository.entity.Adjustment.Reason,
						com.tools20022.repository.entity.Adjustment.RelatedLineItem, com.tools20022.repository.entity.Adjustment.AllowanceChargeIndicator, com.tools20022.repository.entity.Adjustment.Price,
						com.tools20022.repository.entity.Adjustment.ChargeIndicator, com.tools20022.repository.entity.Adjustment.Type, com.tools20022.repository.entity.Adjustment.CollateralManagement,
						com.tools20022.repository.entity.Adjustment.AdjustedBalance, com.tools20022.repository.entity.Adjustment.ChargesPartyRole, com.tools20022.repository.entity.Adjustment.EffectivePeriod,
						com.tools20022.repository.entity.Adjustment.CurrencyExchange, com.tools20022.repository.entity.Adjustment.SecuritiesOrder, com.tools20022.repository.entity.Adjustment.Tax);
				derivationComponent_lazy = () -> Arrays.asList(ChargeTaxBasisType1Choice.mmObject(), DocumentAdjustment1.mmObject(), Adjustment5.mmObject(), DiscountOrChargeType1Choice.mmObject(), DocumentAdjustment2.mmObject(),
						LineItemAllowanceCharge1.mmObject(), Adjustment4.mmObject(), Adjustment3.mmObject(), Adjustment6.mmObject(), Adjustment7.mmObject(), AdjustmentType1Choice.mmObject(), ChargeBasisType1Choice.mmObject(),
						LineItemAllowanceCharge2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}