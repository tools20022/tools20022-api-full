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
import com.tools20022.repository.msg.PartyIdentification3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintParty1Rule#forSafekeepingPlaceAsCodeAndPartyIdentification
 * ConstraintParty1Rule.forSafekeepingPlaceAsCodeAndPartyIdentification}</li>
 * </ul>
 * </li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SafekeepingPlaceAsCodeAndPartyIdentification", propOrder = {"placeSafekeeping", "narrative", "party"})
public class SafekeepingPlaceAsCodeAndPartyIdentification {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcSfkpg", required = true)
	protected SafekeepingPlace1Code placeSafekeeping;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<SafekeepingPlaceAsCodeAndPartyIdentification, SafekeepingPlace1Code> mmPlaceSafekeeping = new MMMessageAttribute<SafekeepingPlaceAsCodeAndPartyIdentification, SafekeepingPlace1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SafekeepingPlaceAsCodeAndPartyIdentification.mmObject();
			isDerived = false;
			xmlTag = "PlcSfkpg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceSafekeeping";
			definition = "Place of safekeeping as a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SafekeepingPlace1Code.mmObject();
		}

		@Override
		public SafekeepingPlace1Code getValue(SafekeepingPlaceAsCodeAndPartyIdentification obj) {
			return obj.getPlaceSafekeeping();
		}

		@Override
		public void setValue(SafekeepingPlaceAsCodeAndPartyIdentification obj, SafekeepingPlace1Code value) {
			obj.setPlaceSafekeeping(value);
		}
	};
	@XmlElement(name = "Nrrtv")
	protected Max35Text narrative;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<SafekeepingPlaceAsCodeAndPartyIdentification, Optional<Max35Text>> mmNarrative = new MMMessageAttribute<SafekeepingPlaceAsCodeAndPartyIdentification, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SafekeepingPlaceAsCodeAndPartyIdentification.mmObject();
			isDerived = false;
			xmlTag = "Nrrtv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Narrative";
			definition = "Additional information about the place of safekeeping.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SafekeepingPlaceAsCodeAndPartyIdentification obj) {
			return obj.getNarrative();
		}

		@Override
		public void setValue(SafekeepingPlaceAsCodeAndPartyIdentification obj, Optional<Max35Text> value) {
			obj.setNarrative(value.orElse(null));
		}
	};
	@XmlElement(name = "Pty")
	protected PartyIdentification3 party;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<SafekeepingPlaceAsCodeAndPartyIdentification, Optional<PartyIdentification3>> mmParty = new MMMessageAttribute<SafekeepingPlaceAsCodeAndPartyIdentification, Optional<PartyIdentification3>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SafekeepingPlaceAsCodeAndPartyIdentification.mmObject();
			isDerived = false;
			xmlTag = "Pty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party";
			definition = "Place of safekeeping.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification3.mmObject();
		}

		@Override
		public Optional<PartyIdentification3> getValue(SafekeepingPlaceAsCodeAndPartyIdentification obj) {
			return obj.getParty();
		}

		@Override
		public void setValue(SafekeepingPlaceAsCodeAndPartyIdentification obj, Optional<PartyIdentification3> value) {
			obj.setParty(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SafekeepingPlaceAsCodeAndPartyIdentification.mmPlaceSafekeeping,
						com.tools20022.repository.msg.SafekeepingPlaceAsCodeAndPartyIdentification.mmNarrative, com.tools20022.repository.msg.SafekeepingPlaceAsCodeAndPartyIdentification.mmParty);
				trace_lazy = () -> SafekeepingPlace.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintParty1Rule.forSafekeepingPlaceAsCodeAndPartyIdentification);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SafekeepingPlaceAsCodeAndPartyIdentification";
				definition = "Identification of the place of safekeeping expressed as a code and a BIC.";
			}
		});
		return mmObject_lazy.get();
	}

	public SafekeepingPlace1Code getPlaceSafekeeping() {
		return placeSafekeeping;
	}

	public SafekeepingPlaceAsCodeAndPartyIdentification setPlaceSafekeeping(SafekeepingPlace1Code placeSafekeeping) {
		this.placeSafekeeping = Objects.requireNonNull(placeSafekeeping);
		return this;
	}

	public Optional<Max35Text> getNarrative() {
		return narrative == null ? Optional.empty() : Optional.of(narrative);
	}

	public SafekeepingPlaceAsCodeAndPartyIdentification setNarrative(Max35Text narrative) {
		this.narrative = narrative;
		return this;
	}

	public Optional<PartyIdentification3> getParty() {
		return party == null ? Optional.empty() : Optional.of(party);
	}

	public SafekeepingPlaceAsCodeAndPartyIdentification setParty(PartyIdentification3 party) {
		this.party = party;
		return this;
	}
}