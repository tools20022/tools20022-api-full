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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Process which consists in transferring the proceeds related to a trade from
 * one party to the next one.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Settlement" src="doc-files/Settlement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Settlement#CentralCounterpartyEligibilityIndicator
 * Settlement.CentralCounterpartyEligibilityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Settlement#StandingSettlementInstruction
 * Settlement.StandingSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Settlement#SettlementPartyRole
 * Settlement.SettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Settlement#Trade
 * Settlement.Trade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#Settlement
 * Trade.Settlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole#Settlement
 * SettlementPartyRole.Settlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#Settlement
 * StandingSettlementInstruction.Settlement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement
 * CashSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTradeSettlement
 * CommercialTradeSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility1Choice
 * CentralCounterPartyEligibility1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility2Choice
 * CentralCounterPartyEligibility2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility3Choice
 * CentralCounterPartyEligibility3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility4Choice
 * CentralCounterPartyEligibility4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility5Choice
 * CentralCounterPartyEligibility5Choice}</li>
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
 * "Settlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Process which consists in transferring the proceeds related to a trade from one party to the next one."
 * </li>
 * </ul>
 */
public class Settlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies whether the settlement transaction is CCP (Central
	 * Counterparty) eligible.
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
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility1Choice#Indicator
	 * CentralCounterPartyEligibility1Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility1Choice#Proprietary
	 * CentralCounterPartyEligibility1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility2Choice#Indicator
	 * CentralCounterPartyEligibility2Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility2Choice#Proprietary
	 * CentralCounterPartyEligibility2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility3Choice#Indicator
	 * CentralCounterPartyEligibility3Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility4Choice#Indicator
	 * CentralCounterPartyEligibility4Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility4Choice#Proprietary
	 * CentralCounterPartyEligibility4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility5Choice#Indicator
	 * CentralCounterPartyEligibility5Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility5Choice#Proprietary
	 * CentralCounterPartyEligibility5Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Settlement Settlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralCounterpartyEligibilityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CentralCounterpartyEligibilityIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CentralCounterPartyEligibility1Choice.Indicator, com.tools20022.repository.choice.CentralCounterPartyEligibility1Choice.Proprietary,
					com.tools20022.repository.choice.CentralCounterPartyEligibility2Choice.Indicator, com.tools20022.repository.choice.CentralCounterPartyEligibility2Choice.Proprietary,
					com.tools20022.repository.choice.CentralCounterPartyEligibility3Choice.Indicator, com.tools20022.repository.choice.CentralCounterPartyEligibility4Choice.Indicator,
					com.tools20022.repository.choice.CentralCounterPartyEligibility4Choice.Proprietary, com.tools20022.repository.choice.CentralCounterPartyEligibility5Choice.Indicator,
					com.tools20022.repository.choice.CentralCounterPartyEligibility5Choice.Proprietary);
			elementContext_lazy = () -> Settlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CentralCounterpartyEligibilityIndicator";
			definition = "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Settlement Standing Instruction database to be used for settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#Settlement
	 * StandingSettlementInstruction.Settlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#FXStandingInstruction
	 * SettlementDetails50.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails3.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails4.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails2.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#FXStandingInstruction
	 * SettlementDetails51.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails5.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails6.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails7.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#FXStandingInstruction
	 * SettlementDetails3.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#FXStandingInstruction
	 * SettlementDetails16.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#FXStandingInstruction
	 * SettlementDetails31.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#FXStandingInstruction
	 * SettlementDetails40.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#FXStandingInstruction
	 * SettlementDetails62.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#FXStandingInstruction
	 * SettlementDetails63.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#FXStandingInstruction
	 * SettlementDetails1.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#FXStandingInstruction
	 * SettlementDetails19.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#FXStandingInstruction
	 * SettlementDetails22.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#FXStandingInstruction
	 * SettlementDetails35.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#FXStandingInstruction
	 * SettlementDetails42.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#FXStandingInstruction
	 * SettlementDetails52.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails8.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails9.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails10.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails11.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails12.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails13.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#FXStandingInstruction
	 * SettlementDetails43.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#StandardSettlementInstructions
	 * InterestAmount1.StandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#StandardSettlementInstructions
	 * InterestAmount2.StandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#FXStandingInstruction
	 * SettlementDetails65.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#FXStandingInstruction
	 * SettlementDetails67.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails16.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#FXStandingInstruction
	 * SettlementDetails68.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails14.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails15.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#FXStandingInstruction
	 * SettlementDetails72.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#FXStandingInstruction
	 * SettlementDetails81.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#FXStandingInstruction
	 * SettlementDetails78.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#FXStandingInstruction
	 * SettlementDetails77.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails17.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails18.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails19.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#FXStandingInstruction
	 * SettlementDetails83.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails21.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails22.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails20.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#FXStandingInstruction
	 * SettlementDetails93.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#FXStandingInstruction
	 * SettlementDetails97.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#FXStandingInstruction
	 * SettlementDetails94.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#FXStandingInstruction
	 * SettlementDetails101.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#FXStandingInstruction
	 * SettlementDetails105.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#FXStandingInstruction
	 * SettlementDetails106.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#FXStandingInstruction
	 * SettlementDetails111.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#FXStandingInstruction
	 * SettlementDetails112.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails23.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails25.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails24.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#FXStandingInstruction
	 * SettlementDetails113.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#FXStandingInstruction
	 * SettlementDetails120.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#FXStandingInstruction
	 * SettlementDetails119.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails27.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails28.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails26.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#FXStandingInstruction
	 * SettlementDetails122.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#FXStandingInstruction
	 * SettlementDetails137.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#FXStandingInstruction
	 * SettlementDetails132.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails30.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#FXStandingInstruction
	 * SettlementDetails138.FXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails29.
	 * StandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#StandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails31.
	 * StandingSettlementInstructionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Settlement Settlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement Standing Instruction database to be used for settlement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd StandingSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails50.FXStandingInstruction, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3.StandingSettlementInstructionDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4.StandingSettlementInstructionDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2.StandingSettlementInstructionDetails,
					com.tools20022.repository.msg.SettlementDetails51.FXStandingInstruction, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5.StandingSettlementInstructionDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6.StandingSettlementInstructionDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7.StandingSettlementInstructionDetails,
					com.tools20022.repository.msg.SettlementDetails3.FXStandingInstruction, com.tools20022.repository.msg.SettlementDetails16.FXStandingInstruction, com.tools20022.repository.msg.SettlementDetails31.FXStandingInstruction,
					com.tools20022.repository.msg.SettlementDetails40.FXStandingInstruction, com.tools20022.repository.msg.SettlementDetails62.FXStandingInstruction, com.tools20022.repository.msg.SettlementDetails63.FXStandingInstruction,
					com.tools20022.repository.msg.SettlementDetails1.FXStandingInstruction, com.tools20022.repository.msg.SettlementDetails19.FXStandingInstruction, com.tools20022.repository.msg.SettlementDetails22.FXStandingInstruction,
					com.tools20022.repository.msg.SettlementDetails35.FXStandingInstruction, com.tools20022.repository.msg.SettlementDetails42.FXStandingInstruction, com.tools20022.repository.msg.SettlementDetails52.FXStandingInstruction,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8.StandingSettlementInstructionDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9.StandingSettlementInstructionDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10.StandingSettlementInstructionDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11.StandingSettlementInstructionDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12.StandingSettlementInstructionDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13.StandingSettlementInstructionDetails,
					com.tools20022.repository.msg.SettlementDetails43.FXStandingInstruction, com.tools20022.repository.msg.InterestAmount1.StandardSettlementInstructions,
					com.tools20022.repository.msg.InterestAmount2.StandardSettlementInstructions, com.tools20022.repository.msg.SettlementDetails65.FXStandingInstruction,
					com.tools20022.repository.msg.SettlementDetails67.FXStandingInstruction, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16.StandingSettlementInstructionDetails,
					com.tools20022.repository.msg.SettlementDetails68.FXStandingInstruction, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14.StandingSettlementInstructionDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15.StandingSettlementInstructionDetails, com.tools20022.repository.msg.SettlementDetails72.FXStandingInstruction,
					com.tools20022.repository.msg.SettlementDetails81.FXStandingInstruction, com.tools20022.repository.msg.SettlementDetails78.FXStandingInstruction, com.tools20022.repository.msg.SettlementDetails77.FXStandingInstruction,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17.StandingSettlementInstructionDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18.StandingSettlementInstructionDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19.StandingSettlementInstructionDetails, com.tools20022.repository.msg.SettlementDetails83.FXStandingInstruction,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21.StandingSettlementInstructionDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22.StandingSettlementInstructionDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20.StandingSettlementInstructionDetails, com.tools20022.repository.msg.SettlementDetails93.FXStandingInstruction,
					com.tools20022.repository.msg.SettlementDetails97.FXStandingInstruction, com.tools20022.repository.msg.SettlementDetails94.FXStandingInstruction, com.tools20022.repository.msg.SettlementDetails101.FXStandingInstruction,
					com.tools20022.repository.msg.SettlementDetails105.FXStandingInstruction, com.tools20022.repository.msg.SettlementDetails106.FXStandingInstruction,
					com.tools20022.repository.msg.SettlementDetails111.FXStandingInstruction, com.tools20022.repository.msg.SettlementDetails112.FXStandingInstruction,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23.StandingSettlementInstructionDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25.StandingSettlementInstructionDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24.StandingSettlementInstructionDetails, com.tools20022.repository.msg.SettlementDetails113.FXStandingInstruction,
					com.tools20022.repository.msg.SettlementDetails120.FXStandingInstruction, com.tools20022.repository.msg.SettlementDetails119.FXStandingInstruction,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27.StandingSettlementInstructionDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28.StandingSettlementInstructionDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26.StandingSettlementInstructionDetails, com.tools20022.repository.msg.SettlementDetails122.FXStandingInstruction,
					com.tools20022.repository.msg.SettlementDetails137.FXStandingInstruction, com.tools20022.repository.msg.SettlementDetails132.FXStandingInstruction,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30.StandingSettlementInstructionDetails, com.tools20022.repository.msg.SettlementDetails138.FXStandingInstruction,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29.StandingSettlementInstructionDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31.StandingSettlementInstructionDetails);
			elementContext_lazy = () -> Settlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandingSettlementInstruction";
			definition = "Settlement Standing Instruction database to be used for settlement.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.Settlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies roles played by a party in the settlement process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole#Settlement
	 * SettlementPartyRole.Settlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SettlementPartyRole
	 * SettlementPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetObligation1#CounterpartySettlementInstructions
	 * NetObligation1.CounterpartySettlementInstructions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Settlement Settlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies roles played by a party in the settlement process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SettlementPartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NetObligation1.CounterpartySettlementInstructions);
			elementContext_lazy = () -> Settlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementPartyRole";
			definition = "Specifies roles played by a party in the settlement process.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SettlementPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SettlementPartyRole.Settlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade for which settlement information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#Settlement
	 * Trade.Settlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Settlement Settlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade for which settlement information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Settlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade for which settlement information is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.Settlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Settlement";
				definition = "Process which consists in transferring the proceeds related to a trade from one party to the next one.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.Settlement, com.tools20022.repository.entity.SettlementPartyRole.Settlement,
						com.tools20022.repository.entity.StandingSettlementInstruction.Settlement);
				subType_lazy = () -> Arrays.asList(CashSettlement.mmObject(), SecuritiesSettlement.mmObject(), CommercialTradeSettlement.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Settlement.CentralCounterpartyEligibilityIndicator, com.tools20022.repository.entity.Settlement.StandingSettlementInstruction,
						com.tools20022.repository.entity.Settlement.SettlementPartyRole, com.tools20022.repository.entity.Settlement.Trade);
				derivationComponent_lazy = () -> Arrays.asList(CentralCounterPartyEligibility1Choice.mmObject(), CentralCounterPartyEligibility2Choice.mmObject(), CentralCounterPartyEligibility3Choice.mmObject(),
						CentralCounterPartyEligibility4Choice.mmObject(), CentralCounterPartyEligibility5Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}