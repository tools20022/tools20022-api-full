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
import com.tools20022.repository.codeset.SafekeepingPlace1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SafekeepingPlace;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of the place of safekeeping expressed as a code and a BIC.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceAsCodeAndPartyIdentification#mmPlaceSafekeeping
 * SafekeepingPlaceAsCodeAndPartyIdentification.mmPlaceSafekeeping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceAsCodeAndPartyIdentification#mmNarrative
 * SafekeepingPlaceAsCodeAndPartyIdentification.mmNarrative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceAsCodeAndPartyIdentification#mmParty
 * SafekeepingPlaceAsCodeAndPartyIdentification.mmParty}</li>
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
 * "SafekeepingPlaceAsCodeAndPartyIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of the place of safekeeping expressed as a code and a BIC."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SafekeepingPlaceAsCodeAndPartyIdentification", propOrder = {"placeSafekeeping", "narrative", "party"})
public class SafekeepingPlaceAsCodeAndPartyIdentification {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SafekeepingPlace1Code placeSafekeeping;
	/**
	 * Place of safekeeping as a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlace1Code
	 * SafekeepingPlace1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceAsCodeAndPartyIdentification
	 * SafekeepingPlaceAsCodeAndPartyIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcSfkpg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceSafekeeping"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place of safekeeping as a code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceSafekeeping = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SafekeepingPlaceAsCodeAndPartyIdentification.mmObject();
			isDerived = false;
			xmlTag = "PlcSfkpg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceSafekeeping";
			definition = "Place of safekeeping as a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SafekeepingPlace1Code.mmObject();
		}
	};
	protected Max35Text narrative;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceAsCodeAndPartyIdentification
	 * SafekeepingPlaceAsCodeAndPartyIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nrrtv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Narrative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about the place of safekeeping."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNarrative = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SafekeepingPlaceAsCodeAndPartyIdentification.mmObject();
			isDerived = false;
			xmlTag = "Nrrtv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Narrative";
			definition = "Additional information about the place of safekeeping.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification3 party;
	/**
	 * Place of safekeeping.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification3
	 * PartyIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceAsCodeAndPartyIdentification
	 * SafekeepingPlaceAsCodeAndPartyIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place of safekeeping."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParty = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> SafekeepingPlaceAsCodeAndPartyIdentification.mmObject();
			isDerived = false;
			xmlTag = "Pty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party";
			definition = "Place of safekeeping.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentification3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SafekeepingPlaceAsCodeAndPartyIdentification.mmPlaceSafekeeping, SafekeepingPlaceAsCodeAndPartyIdentification.mmNarrative, SafekeepingPlaceAsCodeAndPartyIdentification.mmParty);
				trace_lazy = () -> SafekeepingPlace.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SafekeepingPlaceAsCodeAndPartyIdentification";
				definition = "Identification of the place of safekeeping expressed as a code and a BIC.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PlcSfkpg", required = true)
	public SafekeepingPlace1Code getPlaceSafekeeping() {
		return placeSafekeeping;
	}

	public void setPlaceSafekeeping(SafekeepingPlace1Code placeSafekeeping) {
		this.placeSafekeeping = placeSafekeeping;
	}

	@XmlElement(name = "Nrrtv")
	public Max35Text getNarrative() {
		return narrative;
	}

	public void setNarrative(Max35Text narrative) {
		this.narrative = narrative;
	}

	@XmlElement(name = "Pty")
	public PartyIdentification3 getParty() {
		return party;
	}

	public void setParty(com.tools20022.repository.msg.PartyIdentification3 party) {
		this.party = party;
	}
}