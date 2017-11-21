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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DirectoryInformation1", propOrder = {"participantInformation", "participantSWIFTIdentifiersList", "accounts"})
public class DirectoryInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DirectoryParticipantInformation1 participantInformation;
	/**
	 * Information about participant.
	 * <p>
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
			componentContext_lazy = () -> DirectoryInformation1.mmObject();
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
	protected List<BICFIIdentifier> participantSWIFTIdentifiersList;
	/**
	 * SWIFT assigned BIC.
	 * <p>
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
			componentContext_lazy = () -> DirectoryInformation1.mmObject();
			isDerived = false;
			xmlTag = "PtcptSwiftIdrsList";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantSWIFTIdentifiersList";
			definition = "SWIFT assigned BIC.";
			minOccurs = 0;
			simpleType_lazy = () -> BICFIIdentifier.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DirectoryAccountInformation1> accounts;
	/**
	 * Account information.
	 * <p>
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
			componentContext_lazy = () -> DirectoryInformation1.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(DirectoryInformation1.mmParticipantInformation, DirectoryInformation1.mmParticipantSWIFTIdentifiersList, DirectoryInformation1.mmAccounts);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DirectoryInformation1";
				definition = "Participant details from National BIC directory.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PtcptInf", required = true)
	public DirectoryParticipantInformation1 getParticipantInformation() {
		return participantInformation;
	}

	public void setParticipantInformation(com.tools20022.repository.msg.DirectoryParticipantInformation1 participantInformation) {
		this.participantInformation = participantInformation;
	}

	@XmlElement(name = "PtcptSwiftIdrsList")
	public List<BICFIIdentifier> getParticipantSWIFTIdentifiersList() {
		return participantSWIFTIdentifiersList;
	}

	public void setParticipantSWIFTIdentifiersList(List<BICFIIdentifier> participantSWIFTIdentifiersList) {
		this.participantSWIFTIdentifiersList = participantSWIFTIdentifiersList;
	}

	@XmlElement(name = "Accts")
	public List<DirectoryAccountInformation1> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<com.tools20022.repository.msg.DirectoryAccountInformation1> accounts) {
		this.accounts = accounts;
	}
}