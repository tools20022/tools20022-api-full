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
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.datatype.ID;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.RolePlayer;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Defines and associates identifications for a party as a list of other global
 * or qualified relative identifiers.<br>
 * It is assumed that customers of a party can be referenced by an identifier
 * local to the party. The party together with the local identifier can be used
 * to reference the customer.<br>
 * Multiple references can be given to identify the same party.<br>
 * A short identification can be used for display purposes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1#mmIdentification
 * QualifiedPartyIdentification1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1#mmParty
 * QualifiedPartyIdentification1.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1#mmShortIdentification
 * QualifiedPartyIdentification1.mmShortIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1#mmRole
 * QualifiedPartyIdentification1.mmRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1#mmRoleDescription
 * QualifiedPartyIdentification1.mmRoleDescription}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
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
 * "QualifiedPartyIdentification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines and associates identifications for a party as a list of other global or qualified relative identifiers.\r\nIt is assumed that customers of a party can be referenced by an identifier local to the party. The party together with the local identifier can be used to reference the customer.\r\nMultiple references can be given to identify the same party.\r\nA short identification can be used for display purposes."
 * </li>
 * </ul>
 */
public class QualifiedPartyIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ID identification;
	/**
	 * Schema ID to be used in IDREF values.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ID ID}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
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
	 * definition} = "Schema ID to be used in IDREF values."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> QualifiedPartyIdentification1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Schema ID to be used in IDREF values.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ID.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SingleQualifiedPartyIdentification1> party;
	/**
	 * List of identifications for the same party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SingleQualifiedPartyIdentification1
	 * SingleQualifiedPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmIdentifiedParty
	 * PartyIdentificationInformation.mmIdentifiedParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
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
	 * definition} = "List of identifications for the same party."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmIdentifiedParty;
			componentContext_lazy = () -> QualifiedPartyIdentification1.mmObject();
			isDerived = false;
			xmlTag = "Pty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party";
			definition = "List of identifications for the same party.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SingleQualifiedPartyIdentification1.mmObject();
		}
	};
	protected PartyIdentification2Choice shortIdentification;
	/**
	 * Short identification of the resulting party as a control mechanism for
	 * humans.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Short identification of the resulting party as a control mechanism for humans."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmShortIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> QualifiedPartyIdentification1.mmObject();
			isDerived = false;
			xmlTag = "ShrtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortIdentification";
			definition = "Short identification of the resulting party as a control mechanism for humans.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	protected GenericIdentification1 role;
	/**
	 * Formally defined role qualifying the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GenericIdentification1
	 * GenericIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RolePlayer#mmRole
	 * RolePlayer.mmRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Formally defined role qualifying the party."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRole = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> RolePlayer.mmRole;
			componentContext_lazy = () -> QualifiedPartyIdentification1.mmObject();
			isDerived = false;
			xmlTag = "Role";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Role";
			definition = "Formally defined role qualifying the party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification1.mmObject();
		}
	};
	protected Max256Text roleDescription;
	/**
	 * Free form description of the party's role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RoleDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoleDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Free form description of the party's role."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRoleDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> QualifiedPartyIdentification1.mmObject();
			isDerived = false;
			xmlTag = "RoleDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoleDescription";
			definition = "Free form description of the party's role.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(QualifiedPartyIdentification1.mmIdentification, QualifiedPartyIdentification1.mmParty, QualifiedPartyIdentification1.mmShortIdentification, QualifiedPartyIdentification1.mmRole,
						QualifiedPartyIdentification1.mmRoleDescription);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QualifiedPartyIdentification1";
				definition = "Defines and associates identifications for a party as a list of other global or qualified relative identifiers.\r\nIt is assumed that customers of a party can be referenced by an identifier local to the party. The party together with the local identifier can be used to reference the customer.\r\nMultiple references can be given to identify the same party.\r\nA short identification can be used for display purposes.";
			}
		});
		return mmObject_lazy.get();
	}

	public ID getIdentification() {
		return identification;
	}

	public void setIdentification(ID identification) {
		this.identification = identification;
	}

	public List<SingleQualifiedPartyIdentification1> getParty() {
		return party;
	}

	public void setParty(List<com.tools20022.repository.msg.SingleQualifiedPartyIdentification1> party) {
		this.party = party;
	}

	public PartyIdentification2Choice getShortIdentification() {
		return shortIdentification;
	}

	public void setShortIdentification(PartyIdentification2Choice shortIdentification) {
		this.shortIdentification = shortIdentification;
	}

	public GenericIdentification1 getRole() {
		return role;
	}

	public void setRole(com.tools20022.repository.msg.GenericIdentification1 role) {
		this.role = role;
	}

	public Max256Text getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(Max256Text roleDescription) {
		this.roleDescription = roleDescription;
	}
}