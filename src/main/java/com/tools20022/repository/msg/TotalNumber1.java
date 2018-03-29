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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Settlement transaction numbering information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalNumber1#mmCurrentInstructionNumber
 * TotalNumber1.mmCurrentInstructionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalNumber1#mmTotalOfLinkedInstructions
 * TotalNumber1.mmTotalOfLinkedInstructions}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrentInstructionNumberRule#forTotalNumber1
 * ConstraintCurrentInstructionNumberRule.forTotalNumber1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBlockTradeGuideline#forTotalNumber1
 * ConstraintBlockTradeGuideline.forTotalNumber1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TotalNumber1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Settlement transaction numbering information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TotalNumber1", propOrder = {"currentInstructionNumber", "totalOfLinkedInstructions"})
public class TotalNumber1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.TotalNumber1 TotalNumber1}</li>
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
	public static final MMMessageAttribute<TotalNumber1, Exact3NumericText> mmCurrentInstructionNumber = new MMMessageAttribute<TotalNumber1, Exact3NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalNumber1.mmObject();
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

		@Override
		public Exact3NumericText getValue(TotalNumber1 obj) {
			return obj.getCurrentInstructionNumber();
		}

		@Override
		public void setValue(TotalNumber1 obj, Exact3NumericText value) {
			obj.setCurrentInstructionNumber(value);
		}
	};
	@XmlElement(name = "TtlOfLkdInstrs", required = true)
	protected Exact3NumericText totalOfLinkedInstructions;
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
	 * {@linkplain com.tools20022.repository.msg.TotalNumber1 TotalNumber1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlOfLkdInstrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :99B::TOSE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalOfLinkedInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of settlement instructions that are linked together."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalNumber1, Exact3NumericText> mmTotalOfLinkedInstructions = new MMMessageAttribute<TotalNumber1, Exact3NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalNumber1.mmObject();
			isDerived = false;
			xmlTag = "TtlOfLkdInstrs";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":99B::TOSE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalOfLinkedInstructions";
			definition = "Total number of settlement instructions that are linked together.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		@Override
		public Exact3NumericText getValue(TotalNumber1 obj) {
			return obj.getTotalOfLinkedInstructions();
		}

		@Override
		public void setValue(TotalNumber1 obj, Exact3NumericText value) {
			obj.setTotalOfLinkedInstructions(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalNumber1.mmCurrentInstructionNumber, com.tools20022.repository.msg.TotalNumber1.mmTotalOfLinkedInstructions);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrentInstructionNumberRule.forTotalNumber1, com.tools20022.repository.constraints.ConstraintBlockTradeGuideline.forTotalNumber1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TotalNumber1";
				definition = "Settlement transaction numbering information.";
			}
		});
		return mmObject_lazy.get();
	}

	public Exact3NumericText getCurrentInstructionNumber() {
		return currentInstructionNumber;
	}

	public TotalNumber1 setCurrentInstructionNumber(Exact3NumericText currentInstructionNumber) {
		this.currentInstructionNumber = Objects.requireNonNull(currentInstructionNumber);
		return this;
	}

	public Exact3NumericText getTotalOfLinkedInstructions() {
		return totalOfLinkedInstructions;
	}

	public TotalNumber1 setTotalOfLinkedInstructions(Exact3NumericText totalOfLinkedInstructions) {
		this.totalOfLinkedInstructions = Objects.requireNonNull(totalOfLinkedInstructions);
		return this;
	}
}