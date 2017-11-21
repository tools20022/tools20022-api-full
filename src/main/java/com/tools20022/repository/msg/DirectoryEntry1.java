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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Record details from National BIC directory.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DirectoryEntry1#mmAccountOwner
 * DirectoryEntry1.mmAccountOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DirectoryEntry1#mmChangeType
 * DirectoryEntry1.mmChangeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectoryEntry1#mmChangeIdentification
 * DirectoryEntry1.mmChangeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectoryEntry1#mmDirectoryCommonDetails
 * DirectoryEntry1.mmDirectoryCommonDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectoryEntry1#mmParticipantProfile
 * DirectoryEntry1.mmParticipantProfile}</li>
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
 * "DirectoryEntry1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Record details from National BIC directory."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DirectoryEntry1", propOrder = {"accountOwner", "changeType", "changeIdentification", "directoryCommonDetails", "participantProfile"})
public class DirectoryEntry1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialInstitutionIdentification9 accountOwner;
	/**
	 * Owner of the account identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification9
	 * FinancialInstitutionIdentification9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectoryEntry1
	 * DirectoryEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Owner of the account identification."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountOwner = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DirectoryEntry1.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Owner of the account identification.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitutionIdentification9.mmObject();
		}
	};
	protected Max35Text changeType;
	/**
	 * Type of the change.
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
	 * {@linkplain com.tools20022.repository.msg.DirectoryEntry1
	 * DirectoryEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChngTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the change."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChangeType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DirectoryEntry1.mmObject();
			isDerived = false;
			xmlTag = "ChngTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeType";
			definition = "Type of the change.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Number changeIdentification;
	/**
	 * Identification number of the entry change.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectoryEntry1
	 * DirectoryEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChngId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification number of the entry change."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChangeIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DirectoryEntry1.mmObject();
			isDerived = false;
			xmlTag = "ChngId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeIdentification";
			definition = "Identification number of the entry change.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected DirectoryInformation1 directoryCommonDetails;
	/**
	 * Information details from National BIC directory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DirectoryInformation1
	 * DirectoryInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectoryEntry1
	 * DirectoryEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrctryCmonDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectoryCommonDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information details from National BIC directory."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDirectoryCommonDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DirectoryEntry1.mmObject();
			isDerived = false;
			xmlTag = "DrctryCmonDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectoryCommonDetails";
			definition = "Information details from National BIC directory.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DirectoryInformation1.mmObject();
		}
	};
	protected ParticipantProfile1 participantProfile;
	/**
	 * Participant information from National BIC Directory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ParticipantProfile1
	 * ParticipantProfile1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectoryEntry1
	 * DirectoryEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcptPrfl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantProfile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Participant information from National BIC Directory."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParticipantProfile = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DirectoryEntry1.mmObject();
			isDerived = false;
			xmlTag = "PtcptPrfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantProfile";
			definition = "Participant information from National BIC Directory.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ParticipantProfile1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DirectoryEntry1.mmAccountOwner, DirectoryEntry1.mmChangeType, DirectoryEntry1.mmChangeIdentification, DirectoryEntry1.mmDirectoryCommonDetails, DirectoryEntry1.mmParticipantProfile);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DirectoryEntry1";
				definition = "Record details from National BIC directory.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AcctOwnr", required = true)
	public FinancialInstitutionIdentification9 getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(com.tools20022.repository.msg.FinancialInstitutionIdentification9 accountOwner) {
		this.accountOwner = accountOwner;
	}

	@XmlElement(name = "ChngTp")
	public Max35Text getChangeType() {
		return changeType;
	}

	public void setChangeType(Max35Text changeType) {
		this.changeType = changeType;
	}

	@XmlElement(name = "ChngId")
	public Number getChangeIdentification() {
		return changeIdentification;
	}

	public void setChangeIdentification(Number changeIdentification) {
		this.changeIdentification = changeIdentification;
	}

	@XmlElement(name = "DrctryCmonDtls", required = true)
	public DirectoryInformation1 getDirectoryCommonDetails() {
		return directoryCommonDetails;
	}

	public void setDirectoryCommonDetails(com.tools20022.repository.msg.DirectoryInformation1 directoryCommonDetails) {
		this.directoryCommonDetails = directoryCommonDetails;
	}

	@XmlElement(name = "PtcptPrfl")
	public ParticipantProfile1 getParticipantProfile() {
		return participantProfile;
	}

	public void setParticipantProfile(com.tools20022.repository.msg.ParticipantProfile1 participantProfile) {
		this.participantProfile = participantProfile;
	}
}