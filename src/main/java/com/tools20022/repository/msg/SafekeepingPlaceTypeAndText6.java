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
import com.tools20022.repository.codeset.SafekeepingPlace2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.SafekeepingPlace;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of the place of safekeeping expressed as a code and a
 * narrative description.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText6#mmSafekeepingPlaceType
 * SafekeepingPlaceTypeAndText6.mmSafekeepingPlaceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText6#mmIdentification
 * SafekeepingPlaceTypeAndText6.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SafekeepingPlace
 * SafekeepingPlace}</li>
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
 * "SafekeepingPlaceTypeAndText6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of the place of safekeeping expressed as a code and a narrative description."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText2
 * SafekeepingPlaceTypeAndText2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SafekeepingPlaceTypeAndText6", propOrder = {"safekeepingPlaceType", "identification"})
public class SafekeepingPlaceTypeAndText6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SafekeepingPlace2Code safekeepingPlaceType;
	/**
	 * Place of safekeeping as a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlace2Code
	 * SafekeepingPlace2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSafekeepingPlaceType
	 * SafekeepingPlace.mmSafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText6
	 * SafekeepingPlaceTypeAndText6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlcTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place of safekeeping as a code."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText2#mmSafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText2.mmSafekeepingPlaceType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSafekeepingPlaceType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SafekeepingPlace.mmSafekeepingPlaceType;
			componentContext_lazy = () -> SafekeepingPlaceTypeAndText6.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlcTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceType";
			definition = "Place of safekeeping as a code.";
			previousVersion_lazy = () -> SafekeepingPlaceTypeAndText2.mmSafekeepingPlaceType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SafekeepingPlace2Code.mmObject();
		}
	};
	protected Max35Text identification;
	/**
	 * Additional information about the place of safekeeping.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText6
	 * SafekeepingPlaceTypeAndText6}</li>
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
	 * definition} = "Additional information about the place of safekeeping."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText2#mmIdentification
	 * SafekeepingPlaceTypeAndText2.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> SafekeepingPlaceTypeAndText6.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Additional information about the place of safekeeping.";
			previousVersion_lazy = () -> SafekeepingPlaceTypeAndText2.mmIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SafekeepingPlaceTypeAndText6.mmSafekeepingPlaceType, SafekeepingPlaceTypeAndText6.mmIdentification);
				trace_lazy = () -> SafekeepingPlace.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SafekeepingPlaceTypeAndText6";
				definition = "Identification of the place of safekeeping expressed as a code and a narrative description.";
				previousVersion_lazy = () -> SafekeepingPlaceTypeAndText2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SfkpgPlcTp", required = true)
	public SafekeepingPlace2Code getSafekeepingPlaceType() {
		return safekeepingPlaceType;
	}

	public void setSafekeepingPlaceType(SafekeepingPlace2Code safekeepingPlaceType) {
		this.safekeepingPlaceType = safekeepingPlaceType;
	}

	@XmlElement(name = "Id")
	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}
}