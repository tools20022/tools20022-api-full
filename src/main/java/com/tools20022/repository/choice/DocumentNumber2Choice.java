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
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.ISO20022MessageIdentificationText;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification23;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a short document number, a long document number or a
 * proprietary document number.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DocumentNumber2Choice#mmShortNumber
 * DocumentNumber2Choice.mmShortNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DocumentNumber2Choice#mmLongNumber
 * DocumentNumber2Choice.mmLongNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DocumentNumber2Choice#mmProprietaryNumber
 * DocumentNumber2Choice.mmProprietaryNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DocumentNumber2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a short document number, a long document number or a proprietary document number."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DocumentNumber2Choice", propOrder = {"shortNumber", "longNumber", "proprietaryNumber"})
public class DocumentNumber2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Exact3NumericText shortNumber;
	/**
	 * Message type number of the document referenced.
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
	 * {@linkplain com.tools20022.repository.choice.DocumentNumber2Choice
	 * DocumentNumber2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message type number of the document referenced."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShortNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DocumentNumber2Choice.mmObject();
			isDerived = false;
			xmlTag = "ShrtNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortNumber";
			definition = "Message type number of the document referenced.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	protected ISO20022MessageIdentificationText longNumber;
	/**
	 * MX Message identifier of the referenced document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISO20022MessageIdentificationText
	 * ISO20022MessageIdentificationText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DocumentNumber2Choice
	 * DocumentNumber2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LngNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "MX Message identifier of the referenced document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLongNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DocumentNumber2Choice.mmObject();
			isDerived = false;
			xmlTag = "LngNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongNumber";
			definition = "MX Message identifier of the referenced document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISO20022MessageIdentificationText.mmObject();
		}
	};
	protected GenericIdentification23 proprietaryNumber;
	/**
	 * Proprietary document identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification23
	 * GenericIdentification23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DocumentNumber2Choice
	 * DocumentNumber2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proprietary document identification."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietaryNumber = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DocumentNumber2Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryNumber";
			definition = "Proprietary document identification.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification23.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DocumentNumber2Choice.mmShortNumber, DocumentNumber2Choice.mmLongNumber, DocumentNumber2Choice.mmProprietaryNumber);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentNumber2Choice";
				definition = "Choice between a short document number, a long document number or a proprietary document number.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ShrtNb", required = true)
	public Exact3NumericText getShortNumber() {
		return shortNumber;
	}

	public void setShortNumber(Exact3NumericText shortNumber) {
		this.shortNumber = shortNumber;
	}

	@XmlElement(name = "LngNb", required = true)
	public ISO20022MessageIdentificationText getLongNumber() {
		return longNumber;
	}

	public void setLongNumber(ISO20022MessageIdentificationText longNumber) {
		this.longNumber = longNumber;
	}

	@XmlElement(name = "PrtryNb", required = true)
	public GenericIdentification23 getProprietaryNumber() {
		return proprietaryNumber;
	}

	public void setProprietaryNumber(GenericIdentification23 proprietaryNumber) {
		this.proprietaryNumber = proprietaryNumber;
	}
}