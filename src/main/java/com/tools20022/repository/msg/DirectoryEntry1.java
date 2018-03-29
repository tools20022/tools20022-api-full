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
import com.tools20022.repository.msg.DirectoryInformation1;
import com.tools20022.repository.msg.FinancialInstitutionIdentification9;
import com.tools20022.repository.msg.ParticipantProfile1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DirectoryEntry1", propOrder = {"accountOwner", "changeType", "changeIdentification", "directoryCommonDetails", "participantProfile"})
public class DirectoryEntry1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctOwnr", required = true)
	protected FinancialInstitutionIdentification9 accountOwner;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<DirectoryEntry1, FinancialInstitutionIdentification9> mmAccountOwner = new MMMessageAssociationEnd<DirectoryEntry1, FinancialInstitutionIdentification9>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectoryEntry1.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Owner of the account identification.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstitutionIdentification9.mmObject();
		}

		@Override
		public FinancialInstitutionIdentification9 getValue(DirectoryEntry1 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(DirectoryEntry1 obj, FinancialInstitutionIdentification9 value) {
			obj.setAccountOwner(value);
		}
	};
	@XmlElement(name = "ChngTp")
	protected Max35Text changeType;
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
	public static final MMMessageAttribute<DirectoryEntry1, Optional<Max35Text>> mmChangeType = new MMMessageAttribute<DirectoryEntry1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectoryEntry1.mmObject();
			isDerived = false;
			xmlTag = "ChngTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeType";
			definition = "Type of the change.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(DirectoryEntry1 obj) {
			return obj.getChangeType();
		}

		@Override
		public void setValue(DirectoryEntry1 obj, Optional<Max35Text> value) {
			obj.setChangeType(value.orElse(null));
		}
	};
	@XmlElement(name = "ChngId")
	protected Number changeIdentification;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<DirectoryEntry1, Optional<Number>> mmChangeIdentification = new MMMessageAttribute<DirectoryEntry1, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectoryEntry1.mmObject();
			isDerived = false;
			xmlTag = "ChngId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeIdentification";
			definition = "Identification number of the entry change.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(DirectoryEntry1 obj) {
			return obj.getChangeIdentification();
		}

		@Override
		public void setValue(DirectoryEntry1 obj, Optional<Number> value) {
			obj.setChangeIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "DrctryCmonDtls", required = true)
	protected DirectoryInformation1 directoryCommonDetails;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<DirectoryEntry1, DirectoryInformation1> mmDirectoryCommonDetails = new MMMessageAssociationEnd<DirectoryEntry1, DirectoryInformation1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectoryEntry1.mmObject();
			isDerived = false;
			xmlTag = "DrctryCmonDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectoryCommonDetails";
			definition = "Information details from National BIC directory.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DirectoryInformation1.mmObject();
		}

		@Override
		public DirectoryInformation1 getValue(DirectoryEntry1 obj) {
			return obj.getDirectoryCommonDetails();
		}

		@Override
		public void setValue(DirectoryEntry1 obj, DirectoryInformation1 value) {
			obj.setDirectoryCommonDetails(value);
		}
	};
	@XmlElement(name = "PtcptPrfl")
	protected ParticipantProfile1 participantProfile;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<DirectoryEntry1, Optional<ParticipantProfile1>> mmParticipantProfile = new MMMessageAssociationEnd<DirectoryEntry1, Optional<ParticipantProfile1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectoryEntry1.mmObject();
			isDerived = false;
			xmlTag = "PtcptPrfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantProfile";
			definition = "Participant information from National BIC Directory.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ParticipantProfile1.mmObject();
		}

		@Override
		public Optional<ParticipantProfile1> getValue(DirectoryEntry1 obj) {
			return obj.getParticipantProfile();
		}

		@Override
		public void setValue(DirectoryEntry1 obj, Optional<ParticipantProfile1> value) {
			obj.setParticipantProfile(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectoryEntry1.mmAccountOwner, com.tools20022.repository.msg.DirectoryEntry1.mmChangeType,
						com.tools20022.repository.msg.DirectoryEntry1.mmChangeIdentification, com.tools20022.repository.msg.DirectoryEntry1.mmDirectoryCommonDetails, com.tools20022.repository.msg.DirectoryEntry1.mmParticipantProfile);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DirectoryEntry1";
				definition = "Record details from National BIC directory.";
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstitutionIdentification9 getAccountOwner() {
		return accountOwner;
	}

	public DirectoryEntry1 setAccountOwner(FinancialInstitutionIdentification9 accountOwner) {
		this.accountOwner = Objects.requireNonNull(accountOwner);
		return this;
	}

	public Optional<Max35Text> getChangeType() {
		return changeType == null ? Optional.empty() : Optional.of(changeType);
	}

	public DirectoryEntry1 setChangeType(Max35Text changeType) {
		this.changeType = changeType;
		return this;
	}

	public Optional<Number> getChangeIdentification() {
		return changeIdentification == null ? Optional.empty() : Optional.of(changeIdentification);
	}

	public DirectoryEntry1 setChangeIdentification(Number changeIdentification) {
		this.changeIdentification = changeIdentification;
		return this;
	}

	public DirectoryInformation1 getDirectoryCommonDetails() {
		return directoryCommonDetails;
	}

	public DirectoryEntry1 setDirectoryCommonDetails(DirectoryInformation1 directoryCommonDetails) {
		this.directoryCommonDetails = Objects.requireNonNull(directoryCommonDetails);
		return this;
	}

	public Optional<ParticipantProfile1> getParticipantProfile() {
		return participantProfile == null ? Optional.empty() : Optional.of(participantProfile);
	}

	public DirectoryEntry1 setParticipantProfile(ParticipantProfile1 participantProfile) {
		this.participantProfile = participantProfile;
		return this;
	}
}