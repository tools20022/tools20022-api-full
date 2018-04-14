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
import com.tools20022.repository.codeset.SecuritiesPaymentStatus1Code;
import com.tools20022.repository.entity.SecuritiesStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification30;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format for securities payment status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus7Choice#mmCode
 * SecuritiesPaymentStatus7Choice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus7Choice#mmProprietary
 * SecuritiesPaymentStatus7Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesStatus
 * SecuritiesStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesPaymentStatus7Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for securities payment status."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus4Choice
 * SecuritiesPaymentStatus4Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesPaymentStatus7Choice", propOrder = {"code", "proprietary"})
public class SecuritiesPaymentStatus7Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd", required = true)
	protected SecuritiesPaymentStatus1Code code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesPaymentStatus1Code
	 * SecuritiesPaymentStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmPaymentStatus
	 * SecuritiesStatus.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus7Choice
	 * SecuritiesPaymentStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities payment status expressed as an ISO 20022 code."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus4Choice#mmCode
	 * SecuritiesPaymentStatus4Choice.mmCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesPaymentStatus7Choice, SecuritiesPaymentStatus1Code> mmCode = new MMMessageAttribute<SecuritiesPaymentStatus7Choice, SecuritiesPaymentStatus1Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesStatus.mmPaymentStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesPaymentStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Securities payment status expressed as an ISO 20022 code.";
			previousVersion_lazy = () -> SecuritiesPaymentStatus4Choice.mmCode;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesPaymentStatus1Code.mmObject();
		}

		@Override
		public SecuritiesPaymentStatus1Code getValue(SecuritiesPaymentStatus7Choice obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(SecuritiesPaymentStatus7Choice obj, SecuritiesPaymentStatus1Code value) {
			obj.setCode(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected GenericIdentification30 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30
	 * GenericIdentification30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmPaymentStatus
	 * SecuritiesStatus.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus7Choice
	 * SecuritiesPaymentStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities payment status expressed as a proprietary code."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus4Choice#mmProprietary
	 * SecuritiesPaymentStatus4Choice.mmProprietary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesPaymentStatus7Choice, GenericIdentification30> mmProprietary = new MMMessageAssociationEnd<SecuritiesPaymentStatus7Choice, GenericIdentification30>() {
		{
			businessElementTrace_lazy = () -> SecuritiesStatus.mmPaymentStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesPaymentStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Securities payment status expressed as a proprietary code.";
			previousVersion_lazy = () -> SecuritiesPaymentStatus4Choice.mmProprietary;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification30.mmObject();
		}

		@Override
		public GenericIdentification30 getValue(SecuritiesPaymentStatus7Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(SecuritiesPaymentStatus7Choice obj, GenericIdentification30 value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuritiesPaymentStatus7Choice.mmCode, com.tools20022.repository.choice.SecuritiesPaymentStatus7Choice.mmProprietary);
				trace_lazy = () -> SecuritiesStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesPaymentStatus7Choice";
				definition = "Choice of format for securities payment status.";
				previousVersion_lazy = () -> SecuritiesPaymentStatus4Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesPaymentStatus1Code getCode() {
		return code;
	}

	public SecuritiesPaymentStatus7Choice setCode(SecuritiesPaymentStatus1Code code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public GenericIdentification30 getProprietary() {
		return proprietary;
	}

	public SecuritiesPaymentStatus7Choice setProprietary(GenericIdentification30 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}