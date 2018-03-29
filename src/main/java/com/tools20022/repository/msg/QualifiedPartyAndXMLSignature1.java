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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.ElectronicSignature;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.QualifiedPartyIdentification1;
import com.tools20022.repository.other.SignatureEnvelope;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines a signing party and a digital signature made by this party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QualifiedPartyAndXMLSignature1#mmParty
 * QualifiedPartyAndXMLSignature1.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QualifiedPartyAndXMLSignature1#mmSignature
 * QualifiedPartyAndXMLSignature1.mmSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ElectronicSignature
 * ElectronicSignature}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIDRule#forQualifiedPartyAndXMLSignature1
 * ConstraintIDRule.forQualifiedPartyAndXMLSignature1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintManifestRule#forQualifiedPartyAndXMLSignature1
 * ConstraintManifestRule.forQualifiedPartyAndXMLSignature1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QualifiedPartyAndXMLSignature1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines a signing party and a digital signature made by this party."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "QualifiedPartyAndXMLSignature1", propOrder = {"party", "signature"})
public class QualifiedPartyAndXMLSignature1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pty")
	protected QualifiedPartyIdentification1 party;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyAndXMLSignature1
	 * QualifiedPartyAndXMLSignature1}</li>
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
	 * definition} = "Identification of the signing party."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QualifiedPartyAndXMLSignature1, Optional<QualifiedPartyIdentification1>> mmParty = new MMMessageAssociationEnd<QualifiedPartyAndXMLSignature1, Optional<QualifiedPartyIdentification1>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.QualifiedPartyAndXMLSignature1.mmObject();
			isDerived = false;
			xmlTag = "Pty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party";
			definition = "Identification of the signing party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public Optional<QualifiedPartyIdentification1> getValue(QualifiedPartyAndXMLSignature1 obj) {
			return obj.getParty();
		}

		@Override
		public void setValue(QualifiedPartyAndXMLSignature1 obj, Optional<QualifiedPartyIdentification1> value) {
			obj.setParty(value.orElse(null));
		}
	};
	@XmlElement(name = "Sgntr", required = true)
	protected SignatureEnvelope signature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.other.SignatureEnvelope
	 * SignatureEnvelope}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicSignature
	 * ElectronicSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyAndXMLSignature1
	 * QualifiedPartyAndXMLSignature1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Signature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Digital signature in XML-DSIG format and reference to signing party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QualifiedPartyAndXMLSignature1, SignatureEnvelope> mmSignature = new MMMessageAttribute<QualifiedPartyAndXMLSignature1, SignatureEnvelope>() {
		{
			businessComponentTrace_lazy = () -> ElectronicSignature.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.QualifiedPartyAndXMLSignature1.mmObject();
			isDerived = false;
			xmlTag = "Sgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Signature";
			definition = "Digital signature in XML-DSIG format and reference to signing party.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignatureEnvelope.mmObject();
		}

		@Override
		public SignatureEnvelope getValue(QualifiedPartyAndXMLSignature1 obj) {
			return obj.getSignature();
		}

		@Override
		public void setValue(QualifiedPartyAndXMLSignature1 obj, SignatureEnvelope value) {
			obj.setSignature(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QualifiedPartyAndXMLSignature1.mmParty, com.tools20022.repository.msg.QualifiedPartyAndXMLSignature1.mmSignature);
				trace_lazy = () -> ElectronicSignature.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIDRule.forQualifiedPartyAndXMLSignature1, com.tools20022.repository.constraints.ConstraintManifestRule.forQualifiedPartyAndXMLSignature1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QualifiedPartyAndXMLSignature1";
				definition = "Defines a signing party and a digital signature made by this party.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<QualifiedPartyIdentification1> getParty() {
		return party == null ? Optional.empty() : Optional.of(party);
	}

	public QualifiedPartyAndXMLSignature1 setParty(QualifiedPartyIdentification1 party) {
		this.party = party;
		return this;
	}

	public SignatureEnvelope getSignature() {
		return signature;
	}

	public QualifiedPartyAndXMLSignature1 setSignature(SignatureEnvelope signature) {
		this.signature = Objects.requireNonNull(signature);
		return this;
	}
}