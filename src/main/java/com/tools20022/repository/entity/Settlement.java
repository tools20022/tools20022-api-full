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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SettlementPartyRole;
import com.tools20022.repository.entity.StandingSettlementInstruction;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * {@linkplain com.tools20022.repository.entity.Settlement#mmCentralCounterpartyEligibilityIndicator
 * Settlement.mmCentralCounterpartyEligibilityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Settlement#mmStandingSettlementInstruction
 * Settlement.mmStandingSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Settlement#mmSettlementPartyRole
 * Settlement.mmSettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Settlement#mmTrade
 * Settlement.mmTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmSettlement
 * Trade.mmSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole#mmSettlement
 * SettlementPartyRole.mmSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmSettlement
 * StandingSettlementInstruction.mmSettlement}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Settlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Process which consists in transferring the proceeds related to a trade from one party to the next one."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class Settlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator centralCounterpartyEligibilityIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility1Choice#mmIndicator
	 * CentralCounterPartyEligibility1Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility1Choice#mmProprietary
	 * CentralCounterPartyEligibility1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility2Choice#mmIndicator
	 * CentralCounterPartyEligibility2Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility2Choice#mmProprietary
	 * CentralCounterPartyEligibility2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility3Choice#mmIndicator
	 * CentralCounterPartyEligibility3Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility4Choice#mmIndicator
	 * CentralCounterPartyEligibility4Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility4Choice#mmProprietary
	 * CentralCounterPartyEligibility4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility5Choice#mmIndicator
	 * CentralCounterPartyEligibility5Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility5Choice#mmProprietary
	 * CentralCounterPartyEligibility5Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Settlement Settlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralCounterpartyEligibilityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Settlement, YesNoIndicator> mmCentralCounterpartyEligibilityIndicator = new MMBusinessAttribute<Settlement, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(CentralCounterPartyEligibility1Choice.mmIndicator, CentralCounterPartyEligibility1Choice.mmProprietary, CentralCounterPartyEligibility2Choice.mmIndicator,
					CentralCounterPartyEligibility2Choice.mmProprietary, CentralCounterPartyEligibility3Choice.mmIndicator, CentralCounterPartyEligibility4Choice.mmIndicator, CentralCounterPartyEligibility4Choice.mmProprietary,
					CentralCounterPartyEligibility5Choice.mmIndicator, CentralCounterPartyEligibility5Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Settlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CentralCounterpartyEligibilityIndicator";
			definition = "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Settlement obj) {
			return obj.getCentralCounterpartyEligibilityIndicator();
		}

		@Override
		public void setValue(Settlement obj, YesNoIndicator value) {
			obj.setCentralCounterpartyEligibilityIndicator(value);
		}
	};
	protected StandingSettlementInstruction standingSettlementInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmSettlement
	 * StandingSettlementInstruction.mmSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmFXStandingInstruction
	 * SettlementDetails50.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails3.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails4.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails2.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#mmFXStandingInstruction
	 * SettlementDetails51.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails5.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails6.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails7.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#mmFXStandingInstruction
	 * SettlementDetails3.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#mmFXStandingInstruction
	 * SettlementDetails16.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#mmFXStandingInstruction
	 * SettlementDetails31.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#mmFXStandingInstruction
	 * SettlementDetails40.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmFXStandingInstruction
	 * SettlementDetails62.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#mmFXStandingInstruction
	 * SettlementDetails63.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmFXStandingInstruction
	 * SettlementDetails1.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmFXStandingInstruction
	 * SettlementDetails19.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmFXStandingInstruction
	 * SettlementDetails22.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmFXStandingInstruction
	 * SettlementDetails35.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmFXStandingInstruction
	 * SettlementDetails42.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmFXStandingInstruction
	 * SettlementDetails52.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails8.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails9.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails10.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails11.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails12.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails13.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmFXStandingInstruction
	 * SettlementDetails43.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmStandardSettlementInstructions
	 * InterestAmount1.mmStandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmStandardSettlementInstructions
	 * InterestAmount2.mmStandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#mmFXStandingInstruction
	 * SettlementDetails65.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmFXStandingInstruction
	 * SettlementDetails67.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails16.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmFXStandingInstruction
	 * SettlementDetails68.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails14.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails15.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmFXStandingInstruction
	 * SettlementDetails72.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmFXStandingInstruction
	 * SettlementDetails81.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#mmFXStandingInstruction
	 * SettlementDetails78.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#mmFXStandingInstruction
	 * SettlementDetails77.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails17.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails18.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails19.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#mmFXStandingInstruction
	 * SettlementDetails83.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails21.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails22.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails20.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmFXStandingInstruction
	 * SettlementDetails93.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmFXStandingInstruction
	 * SettlementDetails97.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmFXStandingInstruction
	 * SettlementDetails94.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmFXStandingInstruction
	 * SettlementDetails101.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#mmFXStandingInstruction
	 * SettlementDetails105.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#mmFXStandingInstruction
	 * SettlementDetails106.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmFXStandingInstruction
	 * SettlementDetails111.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmFXStandingInstruction
	 * SettlementDetails112.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails23.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails25.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails24.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#mmFXStandingInstruction
	 * SettlementDetails113.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmFXStandingInstruction
	 * SettlementDetails120.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmFXStandingInstruction
	 * SettlementDetails119.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails27.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails28.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails26.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmFXStandingInstruction
	 * SettlementDetails122.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmFXStandingInstruction
	 * SettlementDetails137.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmFXStandingInstruction
	 * SettlementDetails132.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails30.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#mmFXStandingInstruction
	 * SettlementDetails138.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails29.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails31.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140#mmFXStandingInstruction
	 * SettlementDetails140.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmFXStandingInstruction
	 * SettlementDetails142.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmFXStandingInstruction
	 * SettlementDetails148.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmFXStandingInstruction
	 * SettlementDetails145.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails34#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails34.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmFXStandingInstruction
	 * SettlementDetails146.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails33#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails33.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails32.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails152#mmFXStandingInstruction
	 * SettlementDetails152.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156#mmFXStandingInstruction
	 * SettlementDetails156.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmFXStandingInstruction
	 * SettlementDetails157.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails35#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails35.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails158#mmFXStandingInstruction
	 * SettlementDetails158.mmFXStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails36#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails36.
	 * mmStandingSettlementInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails37#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails37.
	 * mmStandingSettlementInstructionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Settlement Settlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement Standing Instruction database to be used for settlement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Settlement, Optional<StandingSettlementInstruction>> mmStandingSettlementInstruction = new MMBusinessAssociationEnd<Settlement, Optional<StandingSettlementInstruction>>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails50.mmFXStandingInstruction, SecuritiesSettlementTransactionDetails3.mmStandingSettlementInstructionDetails,
					SecuritiesSettlementTransactionDetails4.mmStandingSettlementInstructionDetails, SecuritiesSettlementTransactionDetails2.mmStandingSettlementInstructionDetails, SettlementDetails51.mmFXStandingInstruction,
					SecuritiesSettlementTransactionDetails5.mmStandingSettlementInstructionDetails, SecuritiesSettlementTransactionDetails6.mmStandingSettlementInstructionDetails,
					SecuritiesSettlementTransactionDetails7.mmStandingSettlementInstructionDetails, SettlementDetails3.mmFXStandingInstruction, SettlementDetails16.mmFXStandingInstruction, SettlementDetails31.mmFXStandingInstruction,
					SettlementDetails40.mmFXStandingInstruction, SettlementDetails62.mmFXStandingInstruction, SettlementDetails63.mmFXStandingInstruction, SettlementDetails1.mmFXStandingInstruction,
					SettlementDetails19.mmFXStandingInstruction, SettlementDetails22.mmFXStandingInstruction, SettlementDetails35.mmFXStandingInstruction, SettlementDetails42.mmFXStandingInstruction,
					SettlementDetails52.mmFXStandingInstruction, SecuritiesSettlementTransactionDetails8.mmStandingSettlementInstructionDetails, SecuritiesSettlementTransactionDetails9.mmStandingSettlementInstructionDetails,
					SecuritiesSettlementTransactionDetails10.mmStandingSettlementInstructionDetails, SecuritiesSettlementTransactionDetails11.mmStandingSettlementInstructionDetails,
					SecuritiesSettlementTransactionDetails12.mmStandingSettlementInstructionDetails, SecuritiesSettlementTransactionDetails13.mmStandingSettlementInstructionDetails, SettlementDetails43.mmFXStandingInstruction,
					InterestAmount1.mmStandardSettlementInstructions, InterestAmount2.mmStandardSettlementInstructions, SettlementDetails65.mmFXStandingInstruction, SettlementDetails67.mmFXStandingInstruction,
					SecuritiesSettlementTransactionDetails16.mmStandingSettlementInstructionDetails, SettlementDetails68.mmFXStandingInstruction, SecuritiesSettlementTransactionDetails14.mmStandingSettlementInstructionDetails,
					SecuritiesSettlementTransactionDetails15.mmStandingSettlementInstructionDetails, SettlementDetails72.mmFXStandingInstruction, SettlementDetails81.mmFXStandingInstruction, SettlementDetails78.mmFXStandingInstruction,
					SettlementDetails77.mmFXStandingInstruction, SecuritiesSettlementTransactionDetails17.mmStandingSettlementInstructionDetails, SecuritiesSettlementTransactionDetails18.mmStandingSettlementInstructionDetails,
					SecuritiesSettlementTransactionDetails19.mmStandingSettlementInstructionDetails, SettlementDetails83.mmFXStandingInstruction, SecuritiesSettlementTransactionDetails21.mmStandingSettlementInstructionDetails,
					SecuritiesSettlementTransactionDetails22.mmStandingSettlementInstructionDetails, SecuritiesSettlementTransactionDetails20.mmStandingSettlementInstructionDetails, SettlementDetails93.mmFXStandingInstruction,
					SettlementDetails97.mmFXStandingInstruction, SettlementDetails94.mmFXStandingInstruction, SettlementDetails101.mmFXStandingInstruction, SettlementDetails105.mmFXStandingInstruction,
					SettlementDetails106.mmFXStandingInstruction, SettlementDetails111.mmFXStandingInstruction, SettlementDetails112.mmFXStandingInstruction, SecuritiesSettlementTransactionDetails23.mmStandingSettlementInstructionDetails,
					SecuritiesSettlementTransactionDetails25.mmStandingSettlementInstructionDetails, SecuritiesSettlementTransactionDetails24.mmStandingSettlementInstructionDetails, SettlementDetails113.mmFXStandingInstruction,
					SettlementDetails120.mmFXStandingInstruction, SettlementDetails119.mmFXStandingInstruction, SecuritiesSettlementTransactionDetails27.mmStandingSettlementInstructionDetails,
					SecuritiesSettlementTransactionDetails28.mmStandingSettlementInstructionDetails, SecuritiesSettlementTransactionDetails26.mmStandingSettlementInstructionDetails, SettlementDetails122.mmFXStandingInstruction,
					SettlementDetails137.mmFXStandingInstruction, SettlementDetails132.mmFXStandingInstruction, SecuritiesSettlementTransactionDetails30.mmStandingSettlementInstructionDetails, SettlementDetails138.mmFXStandingInstruction,
					SecuritiesSettlementTransactionDetails29.mmStandingSettlementInstructionDetails, SecuritiesSettlementTransactionDetails31.mmStandingSettlementInstructionDetails, SettlementDetails140.mmFXStandingInstruction,
					SettlementDetails142.mmFXStandingInstruction, SettlementDetails148.mmFXStandingInstruction, SettlementDetails145.mmFXStandingInstruction, SecuritiesSettlementTransactionDetails34.mmStandingSettlementInstructionDetails,
					SettlementDetails146.mmFXStandingInstruction, SecuritiesSettlementTransactionDetails33.mmStandingSettlementInstructionDetails, SecuritiesSettlementTransactionDetails32.mmStandingSettlementInstructionDetails,
					SettlementDetails152.mmFXStandingInstruction, SettlementDetails156.mmFXStandingInstruction, SettlementDetails157.mmFXStandingInstruction, SecuritiesSettlementTransactionDetails35.mmStandingSettlementInstructionDetails,
					SettlementDetails158.mmFXStandingInstruction, SecuritiesSettlementTransactionDetails36.mmStandingSettlementInstructionDetails, SecuritiesSettlementTransactionDetails37.mmStandingSettlementInstructionDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Settlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandingSettlementInstruction";
			definition = "Settlement Standing Instruction database to be used for settlement.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> StandingSettlementInstruction.mmSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> StandingSettlementInstruction.mmObject();
		}

		@Override
		public Optional<StandingSettlementInstruction> getValue(Settlement obj) {
			return obj.getStandingSettlementInstruction();
		}

		@Override
		public void setValue(Settlement obj, Optional<StandingSettlementInstruction> value) {
			obj.setStandingSettlementInstruction(value.orElse(null));
		}
	};
	protected List<SettlementPartyRole> settlementPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SettlementPartyRole
	 * SettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole#mmSettlement
	 * SettlementPartyRole.mmSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetObligation1#mmCounterpartySettlementInstructions
	 * NetObligation1.mmCounterpartySettlementInstructions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Settlement Settlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies roles played by a party in the settlement process."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Settlement, List<SettlementPartyRole>> mmSettlementPartyRole = new MMBusinessAssociationEnd<Settlement, List<SettlementPartyRole>>() {
		{
			derivation_lazy = () -> Arrays.asList(NetObligation1.mmCounterpartySettlementInstructions);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Settlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementPartyRole";
			definition = "Specifies roles played by a party in the settlement process.";
			minOccurs = 0;
			opposite_lazy = () -> SettlementPartyRole.mmSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SettlementPartyRole.mmObject();
		}

		@Override
		public List<SettlementPartyRole> getValue(Settlement obj) {
			return obj.getSettlementPartyRole();
		}

		@Override
		public void setValue(Settlement obj, List<SettlementPartyRole> value) {
			obj.setSettlementPartyRole(value);
		}
	};
	protected Trade trade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmSettlement
	 * Trade.mmSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Settlement Settlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade for which settlement information is provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Settlement, Trade> mmTrade = new MMBusinessAssociationEnd<Settlement, Trade>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Settlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade for which settlement information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Trade.mmSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Trade.mmObject();
		}

		@Override
		public Trade getValue(Settlement obj) {
			return obj.getTrade();
		}

		@Override
		public void setValue(Settlement obj, Trade value) {
			obj.setTrade(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Settlement";
				definition = "Process which consists in transferring the proceeds related to a trade from one party to the next one.";
				associationDomain_lazy = () -> Arrays.asList(Trade.mmSettlement, SettlementPartyRole.mmSettlement, StandingSettlementInstruction.mmSettlement);
				subType_lazy = () -> Arrays.asList(CashSettlement.mmObject(), SecuritiesSettlement.mmObject(), CommercialTradeSettlement.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Settlement.mmCentralCounterpartyEligibilityIndicator, com.tools20022.repository.entity.Settlement.mmStandingSettlementInstruction,
						com.tools20022.repository.entity.Settlement.mmSettlementPartyRole, com.tools20022.repository.entity.Settlement.mmTrade);
				derivationComponent_lazy = () -> Arrays.asList(CentralCounterPartyEligibility1Choice.mmObject(), CentralCounterPartyEligibility2Choice.mmObject(), CentralCounterPartyEligibility3Choice.mmObject(),
						CentralCounterPartyEligibility4Choice.mmObject(), CentralCounterPartyEligibility5Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Settlement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getCentralCounterpartyEligibilityIndicator() {
		return centralCounterpartyEligibilityIndicator;
	}

	public Settlement setCentralCounterpartyEligibilityIndicator(YesNoIndicator centralCounterpartyEligibilityIndicator) {
		this.centralCounterpartyEligibilityIndicator = Objects.requireNonNull(centralCounterpartyEligibilityIndicator);
		return this;
	}

	public Optional<StandingSettlementInstruction> getStandingSettlementInstruction() {
		return standingSettlementInstruction == null ? Optional.empty() : Optional.of(standingSettlementInstruction);
	}

	public Settlement setStandingSettlementInstruction(StandingSettlementInstruction standingSettlementInstruction) {
		this.standingSettlementInstruction = standingSettlementInstruction;
		return this;
	}

	public List<SettlementPartyRole> getSettlementPartyRole() {
		return settlementPartyRole == null ? settlementPartyRole = new ArrayList<>() : settlementPartyRole;
	}

	public Settlement setSettlementPartyRole(List<SettlementPartyRole> settlementPartyRole) {
		this.settlementPartyRole = Objects.requireNonNull(settlementPartyRole);
		return this;
	}

	public Trade getTrade() {
		return trade;
	}

	public Settlement setTrade(Trade trade) {
		this.trade = Objects.requireNonNull(trade);
		return this;
	}
}