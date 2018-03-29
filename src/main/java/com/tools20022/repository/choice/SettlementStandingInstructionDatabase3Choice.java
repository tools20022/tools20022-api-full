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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.SettlementStandingInstructionDatabase1Code;
import com.tools20022.repository.entity.StandingSettlementInstruction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification38;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format for the standing settlement instruction information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase3Choice#mmCode
 * SettlementStandingInstructionDatabase3Choice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase3Choice#mmProprietary
 * SettlementStandingInstructionDatabase3Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
 * StandingSettlementInstruction}</li>
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
 * "SettlementStandingInstructionDatabase3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of format for the standing settlement instruction information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementStandingInstructionDatabase3Choice", propOrder = {"code", "proprietary"})
public class SettlementStandingInstructionDatabase3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd", required = true)
	protected SettlementStandingInstructionDatabase1Code code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStandingInstructionDatabase1Code
	 * SettlementStandingInstructionDatabase1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmSettlementStandingInstructionDatabase
	 * StandingSettlementInstruction.mmSettlementStandingInstructionDatabase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase3Choice
	 * SettlementStandingInstructionDatabase3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::DBNM//4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement standing instruction database expressed as an ISO 20022 code."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementStandingInstructionDatabase3Choice, SettlementStandingInstructionDatabase1Code> mmCode = new MMMessageAttribute<SettlementStandingInstructionDatabase3Choice, SettlementStandingInstructionDatabase1Code>() {
		{
			businessElementTrace_lazy = () -> StandingSettlementInstruction.mmSettlementStandingInstructionDatabase;
			componentContext_lazy = () -> com.tools20022.repository.choice.SettlementStandingInstructionDatabase3Choice.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::DBNM//4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Settlement standing instruction database expressed as an ISO 20022 code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementStandingInstructionDatabase1Code.mmObject();
		}

		@Override
		public SettlementStandingInstructionDatabase1Code getValue(SettlementStandingInstructionDatabase3Choice obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(SettlementStandingInstructionDatabase3Choice obj, SettlementStandingInstructionDatabase1Code value) {
			obj.setCode(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected GenericIdentification38 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification38
	 * GenericIdentification38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmSettlementStandingInstructionDatabase
	 * StandingSettlementInstruction.mmSettlementStandingInstructionDatabase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase3Choice
	 * SettlementStandingInstructionDatabase3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::NETT/4!c[4c]/4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement standing instruction database expressed as a proprietary code."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementStandingInstructionDatabase3Choice, GenericIdentification38> mmProprietary = new MMMessageAttribute<SettlementStandingInstructionDatabase3Choice, GenericIdentification38>() {
		{
			businessElementTrace_lazy = () -> StandingSettlementInstruction.mmSettlementStandingInstructionDatabase;
			componentContext_lazy = () -> com.tools20022.repository.choice.SettlementStandingInstructionDatabase3Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::NETT/4!c[4c]/4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Settlement standing instruction database expressed as a proprietary code.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification38.mmObject();
		}

		@Override
		public GenericIdentification38 getValue(SettlementStandingInstructionDatabase3Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(SettlementStandingInstructionDatabase3Choice obj, GenericIdentification38 value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SettlementStandingInstructionDatabase3Choice.mmCode, com.tools20022.repository.choice.SettlementStandingInstructionDatabase3Choice.mmProprietary);
				trace_lazy = () -> StandingSettlementInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementStandingInstructionDatabase3Choice";
				definition = "Choice of format for the standing settlement instruction information.";
			}
		});
		return mmObject_lazy.get();
	}

	public SettlementStandingInstructionDatabase1Code getCode() {
		return code;
	}

	public SettlementStandingInstructionDatabase3Choice setCode(SettlementStandingInstructionDatabase1Code code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public GenericIdentification38 getProprietary() {
		return proprietary;
	}

	public SettlementStandingInstructionDatabase3Choice setProprietary(GenericIdentification38 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}