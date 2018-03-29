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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PledgeeType1Code;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.entity.Pledgee;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of the entity to which the financial instruments are pledged
 * expressed as a code and a BIC.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PledgeeTypeAndAnyBICIdentifier1#mmIdentification
 * PledgeeTypeAndAnyBICIdentifier1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PledgeeTypeAndAnyBICIdentifier1#mmPledgeeType
 * PledgeeTypeAndAnyBICIdentifier1.mmPledgeeType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Pledgee Pledgee}</li>
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
 * "PledgeeTypeAndAnyBICIdentifier1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of the entity to which the financial instruments are pledged expressed as a code and a BIC."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PledgeeTypeAndAnyBICIdentifier1", propOrder = {"identification", "pledgeeType"})
public class PledgeeTypeAndAnyBICIdentifier1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected AnyBICIdentifier identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Pledgee Pledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PledgeeTypeAndAnyBICIdentifier1
	 * PledgeeTypeAndAnyBICIdentifier1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the entity to which the financial instruments are pledged, expressed as a BIC."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PledgeeTypeAndAnyBICIdentifier1, AnyBICIdentifier> mmIdentification = new MMMessageAttribute<PledgeeTypeAndAnyBICIdentifier1, AnyBICIdentifier>() {
		{
			businessComponentTrace_lazy = () -> Pledgee.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PledgeeTypeAndAnyBICIdentifier1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the entity to which the financial instruments are pledged, expressed as a BIC.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		@Override
		public AnyBICIdentifier getValue(PledgeeTypeAndAnyBICIdentifier1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(PledgeeTypeAndAnyBICIdentifier1 obj, AnyBICIdentifier value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "PldgeeTp", required = true)
	protected PledgeeType1Code pledgeeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PledgeeType1Code
	 * PledgeeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Pledgee#mmPledgeeType
	 * Pledgee.mmPledgeeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PledgeeTypeAndAnyBICIdentifier1
	 * PledgeeTypeAndAnyBICIdentifier1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PldgeeTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgeeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity to which the financial instruments are pledged expressed as a code."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PledgeeTypeAndAnyBICIdentifier1, PledgeeType1Code> mmPledgeeType = new MMMessageAttribute<PledgeeTypeAndAnyBICIdentifier1, PledgeeType1Code>() {
		{
			businessElementTrace_lazy = () -> Pledgee.mmPledgeeType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PledgeeTypeAndAnyBICIdentifier1.mmObject();
			isDerived = false;
			xmlTag = "PldgeeTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgeeType";
			definition = "Entity to which the financial instruments are pledged expressed as a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PledgeeType1Code.mmObject();
		}

		@Override
		public PledgeeType1Code getValue(PledgeeTypeAndAnyBICIdentifier1 obj) {
			return obj.getPledgeeType();
		}

		@Override
		public void setValue(PledgeeTypeAndAnyBICIdentifier1 obj, PledgeeType1Code value) {
			obj.setPledgeeType(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PledgeeTypeAndAnyBICIdentifier1.mmIdentification, com.tools20022.repository.msg.PledgeeTypeAndAnyBICIdentifier1.mmPledgeeType);
				trace_lazy = () -> Pledgee.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PledgeeTypeAndAnyBICIdentifier1";
				definition = "Identification of the entity to which the financial instruments are pledged expressed as a code and a BIC.";
			}
		});
		return mmObject_lazy.get();
	}

	public AnyBICIdentifier getIdentification() {
		return identification;
	}

	public PledgeeTypeAndAnyBICIdentifier1 setIdentification(AnyBICIdentifier identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public PledgeeType1Code getPledgeeType() {
		return pledgeeType;
	}

	public PledgeeTypeAndAnyBICIdentifier1 setPledgeeType(PledgeeType1Code pledgeeType) {
		this.pledgeeType = Objects.requireNonNull(pledgeeType);
		return this;
	}
}