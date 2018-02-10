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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.IntraPositionMovementInstruction002V04;
import com.tools20022.repository.area.semt.IntraPositionMovementInstructionV03;
import com.tools20022.repository.area.semt.IntraPositionMovementInstructionV04;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TotalNumber1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.choice.NumberCount1Choice#mmCurrentInstructionNumber
 * NumberCount1Choice.mmCurrentInstructionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NumberCount1Choice#mmTotalNumber
 * NumberCount1Choice.mmTotalNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmNumberCounts
 * SecuritiesFinancingInstructionV01.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV02#mmNumberCounts
 * SecuritiesFinancingInstructionV02.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV03#mmNumberCounts
 * SecuritiesFinancingInstructionV03.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV01#mmNumberCounts
 * SecuritiesSettlementTransactionGenerationNotificationV01.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV02#mmNumberCounts
 * SecuritiesSettlementTransactionGenerationNotificationV02.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV03#mmNumberCounts
 * SecuritiesSettlementTransactionGenerationNotificationV03.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04#mmNumberCounts
 * SecuritiesSettlementTransactionGenerationNotificationV04.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01#mmNumberCounts
 * SecuritiesSettlementTransactionInstructionV01.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV02#mmNumberCounts
 * SecuritiesSettlementTransactionInstructionV02.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV03#mmNumberCounts
 * SecuritiesSettlementTransactionInstructionV03.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#mmNumberCounts
 * SecuritiesSettlementTransactionInstructionV04.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmNumberCount
 * SecuritiesTradeConfirmationV01.mmNumberCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV04#mmNumberCounts
 * SecuritiesFinancingInstructionV04.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02#mmNumberCount
 * SecuritiesTradeConfirmationV02.mmNumberCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV03#mmNumberCounts
 * IntraPositionMovementInstructionV03.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmNumberCounts
 * SecuritiesSettlementTransactionGenerationNotificationV05.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV05#mmNumberCounts
 * SecuritiesFinancingInstructionV05.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmNumberCounts
 * SecuritiesSettlementTransactionInstructionV05.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmNumberCount
 * SecuritiesTradeConfirmationV03.mmNumberCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV06#mmNumberCounts
 * SecuritiesSettlementTransactionInstructionV06.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV04#mmNumberCounts
 * IntraPositionMovementInstructionV04.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV06#mmNumberCounts
 * SecuritiesFinancingInstructionV06.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmNumberCounts
 * SecuritiesSettlementTransactionGenerationNotificationV06.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstruction002V04#mmNumberCounts
 * IntraPositionMovementInstruction002V04.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V06#mmNumberCounts
 * SecuritiesSettlementTransactionGenerationNotification002V06.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmNumberCounts
 * SecuritiesSettlementTransactionInstruction002V06.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmNumberCounts
 * SecuritiesFinancingInstruction002V06.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV07#mmNumberCounts
 * SecuritiesFinancingInstructionV07.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV07#mmNumberCounts
 * SecuritiesSettlementTransactionGenerationNotificationV07.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV07#mmNumberCounts
 * SecuritiesSettlementTransactionInstructionV07.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V07#mmNumberCounts
 * SecuritiesSettlementTransactionInstruction002V07.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V07#mmNumberCounts
 * SecuritiesFinancingInstruction002V07.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V07#mmNumberCounts
 * SecuritiesSettlementTransactionGenerationNotification002V07.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV08#mmNumberCounts
 * SecuritiesSettlementTransactionGenerationNotificationV08.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV08#mmNumberCounts
 * SecuritiesFinancingInstructionV08.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV08#mmNumberCounts
 * SecuritiesSettlementTransactionInstructionV08.mmNumberCounts}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrentInstructionNumberRule#forNumberCount1Choice
 * ConstraintCurrentInstructionNumberRule.forNumberCount1Choice}</li>
 * </ul>
 * </li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NumberCount1Choice", propOrder = {"currentInstructionNumber", "totalNumber"})
public class NumberCount1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CurInstrNb", required = true)
	protected Exact3NumericText currentInstructionNumber;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :99B::SETT</li>
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
	public static final MMMessageAttribute mmCurrentInstructionNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.NumberCount1Choice.mmObject();
			isDerived = false;
			xmlTag = "CurInstrNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":99B::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentInstructionNumber";
			definition = "Sequential number of the instruction in a range of linked settlement instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	@XmlElement(name = "TtlNb", required = true)
	protected TotalNumber1 totalNumber;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :99B:</li>
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
	public static final MMMessageAssociationEnd mmTotalNumber = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.NumberCount1Choice.mmObject();
			isDerived = false;
			xmlTag = "TtlNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":99B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumber";
			definition = "Total numbers of settlement transactions, receipts and deliveries, and the concerned settlement transaction number.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TotalNumber1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.NumberCount1Choice.mmCurrentInstructionNumber, com.tools20022.repository.choice.NumberCount1Choice.mmTotalNumber);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesFinancingInstructionV01.mmNumberCounts, SecuritiesFinancingInstructionV02.mmNumberCounts, SecuritiesFinancingInstructionV03.mmNumberCounts,
						SecuritiesSettlementTransactionGenerationNotificationV01.mmNumberCounts, SecuritiesSettlementTransactionGenerationNotificationV02.mmNumberCounts,
						SecuritiesSettlementTransactionGenerationNotificationV03.mmNumberCounts, SecuritiesSettlementTransactionGenerationNotificationV04.mmNumberCounts, SecuritiesSettlementTransactionInstructionV01.mmNumberCounts,
						SecuritiesSettlementTransactionInstructionV02.mmNumberCounts, SecuritiesSettlementTransactionInstructionV03.mmNumberCounts, SecuritiesSettlementTransactionInstructionV04.mmNumberCounts,
						SecuritiesTradeConfirmationV01.mmNumberCount, SecuritiesFinancingInstructionV04.mmNumberCounts, SecuritiesTradeConfirmationV02.mmNumberCount, IntraPositionMovementInstructionV03.mmNumberCounts,
						SecuritiesSettlementTransactionGenerationNotificationV05.mmNumberCounts, SecuritiesFinancingInstructionV05.mmNumberCounts, SecuritiesSettlementTransactionInstructionV05.mmNumberCounts,
						SecuritiesTradeConfirmationV03.mmNumberCount, SecuritiesSettlementTransactionInstructionV06.mmNumberCounts, IntraPositionMovementInstructionV04.mmNumberCounts, SecuritiesFinancingInstructionV06.mmNumberCounts,
						SecuritiesSettlementTransactionGenerationNotificationV06.mmNumberCounts, IntraPositionMovementInstruction002V04.mmNumberCounts, SecuritiesSettlementTransactionGenerationNotification002V06.mmNumberCounts,
						SecuritiesSettlementTransactionInstruction002V06.mmNumberCounts, SecuritiesFinancingInstruction002V06.mmNumberCounts, SecuritiesFinancingInstructionV07.mmNumberCounts,
						SecuritiesSettlementTransactionGenerationNotificationV07.mmNumberCounts, SecuritiesSettlementTransactionInstructionV07.mmNumberCounts, SecuritiesSettlementTransactionInstruction002V07.mmNumberCounts,
						SecuritiesFinancingInstruction002V07.mmNumberCounts, SecuritiesSettlementTransactionGenerationNotification002V07.mmNumberCounts, SecuritiesSettlementTransactionGenerationNotificationV08.mmNumberCounts,
						SecuritiesFinancingInstructionV08.mmNumberCounts, SecuritiesSettlementTransactionInstructionV08.mmNumberCounts);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrentInstructionNumberRule.forNumberCount1Choice);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NumberCount1Choice";
				definition = "Choice of number count type.";
			}
		});
		return mmObject_lazy.get();
	}

	public Exact3NumericText getCurrentInstructionNumber() {
		return currentInstructionNumber;
	}

	public NumberCount1Choice setCurrentInstructionNumber(Exact3NumericText currentInstructionNumber) {
		this.currentInstructionNumber = Objects.requireNonNull(currentInstructionNumber);
		return this;
	}

	public TotalNumber1 getTotalNumber() {
		return totalNumber;
	}

	public NumberCount1Choice setTotalNumber(TotalNumber1 totalNumber) {
		this.totalNumber = Objects.requireNonNull(totalNumber);
		return this;
	}
}