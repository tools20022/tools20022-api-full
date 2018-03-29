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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CustomerHandlingInstructions1Code;
import com.tools20022.repository.entity.SecuritiesOrderParameters;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification13;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a code and a data source scheme to determine the customer
 * handling instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CustomerHandlingInstructionChoice#mmCode
 * CustomerHandlingInstructionChoice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CustomerHandlingInstructionChoice#mmProprietary
 * CustomerHandlingInstructionChoice.mmProprietary}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerHandlingInstructionChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a code and a data source scheme to determine the customer handling instruction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CustomerHandlingInstructionChoice", propOrder = {"code", "proprietary"})
public class CustomerHandlingInstructionChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd", required = true)
	protected CustomerHandlingInstructions1Code code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code
	 * CustomerHandlingInstructions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmCustomerHandlingInstruction
	 * SecuritiesOrderParameters.mmCustomerHandlingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CustomerHandlingInstructionChoice
	 * CustomerHandlingInstructionChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Customer handling instruction is defined using a code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerHandlingInstructionChoice, CustomerHandlingInstructions1Code> mmCode = new MMMessageAttribute<CustomerHandlingInstructionChoice, CustomerHandlingInstructions1Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmCustomerHandlingInstruction;
			componentContext_lazy = () -> com.tools20022.repository.choice.CustomerHandlingInstructionChoice.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Customer handling instruction is defined using a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CustomerHandlingInstructions1Code.mmObject();
		}

		@Override
		public CustomerHandlingInstructions1Code getValue(CustomerHandlingInstructionChoice obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(CustomerHandlingInstructionChoice obj, CustomerHandlingInstructions1Code value) {
			obj.setCode(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected GenericIdentification13 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification13
	 * GenericIdentification13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmCustomerHandlingInstruction
	 * SecuritiesOrderParameters.mmCustomerHandlingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CustomerHandlingInstructionChoice
	 * CustomerHandlingInstructionChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Customer handling instruction is defined using a data source scheme."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CustomerHandlingInstructionChoice, GenericIdentification13> mmProprietary = new MMMessageAssociationEnd<CustomerHandlingInstructionChoice, GenericIdentification13>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmCustomerHandlingInstruction;
			componentContext_lazy = () -> com.tools20022.repository.choice.CustomerHandlingInstructionChoice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Customer handling instruction is defined using a data source scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification13.mmObject();
		}

		@Override
		public GenericIdentification13 getValue(CustomerHandlingInstructionChoice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(CustomerHandlingInstructionChoice obj, GenericIdentification13 value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CustomerHandlingInstructionChoice.mmCode, com.tools20022.repository.choice.CustomerHandlingInstructionChoice.mmProprietary);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CustomerHandlingInstructionChoice";
				definition = "Choice between a code and a data source scheme to determine the customer handling instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	public CustomerHandlingInstructions1Code getCode() {
		return code;
	}

	public CustomerHandlingInstructionChoice setCode(CustomerHandlingInstructions1Code code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public GenericIdentification13 getProprietary() {
		return proprietary;
	}

	public CustomerHandlingInstructionChoice setProprietary(GenericIdentification13 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}