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
import com.tools20022.repository.datatype.BICFIIdentifier;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Participant details from National BIC directory.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectoryInformation1#mmParticipantInformation
 * DirectoryInformation1.mmParticipantInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectoryInformation1#mmParticipantSWIFTIdentifiersList
 * DirectoryInformation1.mmParticipantSWIFTIdentifiersList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectoryInformation1#mmAccounts
 * DirectoryInformation1.mmAccounts}</li>
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
 * "DirectoryInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Participant details from National BIC directory."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DirectoryInformation1", propOrder = {"participantInformation", "participantSWIFTIdentifiersList", "accounts"})
public class DirectoryInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PtcptInf", required = true)
	protected DirectoryParticipantInformation1 participantInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1
	 * DirectoryParticipantInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectoryInformation1
	 * DirectoryInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcptInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about participant."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParticipantInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectoryInformation1.mmObject();
			isDerived = false;
			xmlTag = "PtcptInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantInformation";
			definition = "Information about participant.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DirectoryParticipantInformation1.mmObject();
		}
	};
	@XmlElement(name = "PtcptSwiftIdrsList")
	protected List<BICFIIdentifier> participantSWIFTIdentifiersList;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICFIIdentifier
	 * BICFIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectoryInformation1
	 * DirectoryInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcptSwiftIdrsList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantSWIFTIdentifiersList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "SWIFT assigned BIC."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParticipantSWIFTIdentifiersList = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectoryInformation1.mmObject();
			isDerived = false;
			xmlTag = "PtcptSwiftIdrsList";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantSWIFTIdentifiersList";
			definition = "SWIFT assigned BIC.";
			minOccurs = 0;
			simpleType_lazy = () -> BICFIIdentifier.mmObject();
		}
	};
	@XmlElement(name = "Accts")
	protected List<com.tools20022.repository.msg.DirectoryAccountInformation1> accounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DirectoryAccountInformation1
	 * DirectoryAccountInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectoryInformation1
	 * DirectoryInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Accts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccounts = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectoryInformation1.mmObject();
			isDerived = false;
			xmlTag = "Accts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accounts";
			definition = "Account information.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DirectoryAccountInformation1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectoryInformation1.mmParticipantInformation, com.tools20022.repository.msg.DirectoryInformation1.mmParticipantSWIFTIdentifiersList,
						com.tools20022.repository.msg.DirectoryInformation1.mmAccounts);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DirectoryInformation1";
				definition = "Participant details from National BIC directory.";
			}
		});
		return mmObject_lazy.get();
	}

	public DirectoryParticipantInformation1 getParticipantInformation() {
		return participantInformation;
	}

	public DirectoryInformation1 setParticipantInformation(com.tools20022.repository.msg.DirectoryParticipantInformation1 participantInformation) {
		this.participantInformation = Objects.requireNonNull(participantInformation);
		return this;
	}

	public List<BICFIIdentifier> getParticipantSWIFTIdentifiersList() {
		return participantSWIFTIdentifiersList == null ? participantSWIFTIdentifiersList = new ArrayList<>() : participantSWIFTIdentifiersList;
	}

	public DirectoryInformation1 setParticipantSWIFTIdentifiersList(List<BICFIIdentifier> participantSWIFTIdentifiersList) {
		this.participantSWIFTIdentifiersList = Objects.requireNonNull(participantSWIFTIdentifiersList);
		return this;
	}

	public List<DirectoryAccountInformation1> getAccounts() {
		return accounts == null ? accounts = new ArrayList<>() : accounts;
	}

	public DirectoryInformation1 setAccounts(List<com.tools20022.repository.msg.DirectoryAccountInformation1> accounts) {
		this.accounts = Objects.requireNonNull(accounts);
		return this;
	}
}