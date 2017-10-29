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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.msg.TotalNumber1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice of number count type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NumberCount1Choice#CurrentInstructionNumber
 * NumberCount1Choice.CurrentInstructionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NumberCount1Choice#TotalNumber
 * NumberCount1Choice.TotalNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#NumberCounts
 * SecuritiesFinancingInstructionV01.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV02#NumberCounts
 * SecuritiesFinancingInstructionV02.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV03#NumberCounts
 * SecuritiesFinancingInstructionV03.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV01#NumberCounts
 * SecuritiesSettlementTransactionGenerationNotificationV01.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV02#NumberCounts
 * SecuritiesSettlementTransactionGenerationNotificationV02.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV03#NumberCounts
 * SecuritiesSettlementTransactionGenerationNotificationV03.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04#NumberCounts
 * SecuritiesSettlementTransactionGenerationNotificationV04.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01#NumberCounts
 * SecuritiesSettlementTransactionInstructionV01.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV02#NumberCounts
 * SecuritiesSettlementTransactionInstructionV02.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV03#NumberCounts
 * SecuritiesSettlementTransactionInstructionV03.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#NumberCounts
 * SecuritiesSettlementTransactionInstructionV04.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#NumberCount
 * SecuritiesTradeConfirmationV01.NumberCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV04#NumberCounts
 * SecuritiesFinancingInstructionV04.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02#NumberCount
 * SecuritiesTradeConfirmationV02.NumberCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV03#NumberCounts
 * IntraPositionMovementInstructionV03.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#NumberCounts
 * SecuritiesSettlementTransactionGenerationNotificationV05.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV05#NumberCounts
 * SecuritiesFinancingInstructionV05.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#NumberCounts
 * SecuritiesSettlementTransactionInstructionV05.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#NumberCount
 * SecuritiesTradeConfirmationV03.NumberCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV06#NumberCounts
 * SecuritiesSettlementTransactionInstructionV06.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV04#NumberCounts
 * IntraPositionMovementInstructionV04.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV06#NumberCounts
 * SecuritiesFinancingInstructionV06.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#NumberCounts
 * SecuritiesSettlementTransactionGenerationNotificationV06.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstruction002V04#NumberCounts
 * IntraPositionMovementInstruction002V04.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V06#NumberCounts
 * SecuritiesSettlementTransactionGenerationNotification002V06.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#NumberCounts
 * SecuritiesSettlementTransactionInstruction002V06.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#NumberCounts
 * SecuritiesFinancingInstruction002V06.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV07#NumberCounts
 * SecuritiesFinancingInstructionV07.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV07#NumberCounts
 * SecuritiesSettlementTransactionGenerationNotificationV07.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV07#NumberCounts
 * SecuritiesSettlementTransactionInstructionV07.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V07#NumberCounts
 * SecuritiesSettlementTransactionInstruction002V07.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V07#NumberCounts
 * SecuritiesFinancingInstruction002V07.NumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V07#NumberCounts
 * SecuritiesSettlementTransactionGenerationNotification002V07.NumberCounts}</li>
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
 * "NumberCount1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of number count type."</li>
 * </ul>
 */
public class NumberCount1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Sequential number of the instruction in a range of linked settlement
	 * instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.NumberCount1Choice
	 * NumberCount1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurInstrNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentInstructionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequential number of the instruction in a range of linked settlement instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CurrentInstructionNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NumberCount1Choice.mmObject();
			isDerived = false;
			xmlTag = "CurInstrNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentInstructionNumber";
			definition = "Sequential number of the instruction in a range of linked settlement instructions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	/**
	 * Total numbers of settlement transactions, receipts and deliveries, and
	 * the concerned settlement transaction number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TotalNumber1
	 * TotalNumber1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.NumberCount1Choice
	 * NumberCount1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total numbers of settlement transactions, receipts and deliveries, and the concerned settlement transaction number."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TotalNumber = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> NumberCount1Choice.mmObject();
			isDerived = false;
			xmlTag = "TtlNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumber";
			definition = "Total numbers of settlement transactions, receipts and deliveries, and the concerned settlement transaction number.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TotalNumber1.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.NumberCount1Choice.CurrentInstructionNumber, com.tools20022.repository.choice.NumberCount1Choice.TotalNumber);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.NumberCounts, com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV02.NumberCounts,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV03.NumberCounts, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV01.NumberCounts,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV02.NumberCounts, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV03.NumberCounts,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04.NumberCounts, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01.NumberCounts,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV02.NumberCounts, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV03.NumberCounts,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04.NumberCounts, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.NumberCount,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV04.NumberCounts, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02.NumberCount,
						com.tools20022.repository.area.semt.IntraPositionMovementInstructionV03.NumberCounts, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05.NumberCounts,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV05.NumberCounts, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05.NumberCounts,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.NumberCount, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV06.NumberCounts,
						com.tools20022.repository.area.semt.IntraPositionMovementInstructionV04.NumberCounts, com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV06.NumberCounts,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06.NumberCounts, com.tools20022.repository.area.semt.IntraPositionMovementInstruction002V04.NumberCounts,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V06.NumberCounts, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06.NumberCounts,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06.NumberCounts, com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV07.NumberCounts,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV07.NumberCounts, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV07.NumberCounts,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V07.NumberCounts, com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V07.NumberCounts,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V07.NumberCounts);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NumberCount1Choice";
				definition = "Choice of number count type.";
			}
		});
		return mmObject_lazy.get();
	}
}