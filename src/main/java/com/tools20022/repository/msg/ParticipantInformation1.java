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
import com.tools20022.repository.choice.CentralisedAndAuthorisedBranchIdentification1Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Participant profile participant information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantInformation1#mmProfileDeletionDate
 * ParticipantInformation1.mmProfileDeletionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantInformation1#mmBankBranch
 * ParticipantInformation1.mmBankBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantInformation1#mmTerminalIdentification
 * ParticipantInformation1.mmTerminalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantInformation1#mmRestrictions
 * ParticipantInformation1.mmRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantInformation1#mmExternalPaymentSystemInformation
 * ParticipantInformation1.mmExternalPaymentSystemInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantInformation1#mmMigration
 * ParticipantInformation1.mmMigration}</li>
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
 * "ParticipantInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Participant profile participant information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ParticipantInformation1", propOrder = {"profileDeletionDate", "bankBranch", "terminalIdentification", "restrictions", "externalPaymentSystemInformation", "migration"})
public class ParticipantInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrflDeltnDt")
	protected ISODateTime profileDeletionDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantInformation1
	 * ParticipantInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrflDeltnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfileDeletionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the profile was deleted."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProfileDeletionDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ParticipantInformation1.mmObject();
			isDerived = false;
			xmlTag = "PrflDeltnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfileDeletionDate";
			definition = "Date the profile was deleted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "BkBrnch")
	protected CentralisedAndAuthorisedBranchIdentification1Choice bankBranch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CentralisedAndAuthorisedBranchIdentification1Choice
	 * CentralisedAndAuthorisedBranchIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantInformation1
	 * ParticipantInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkBrnch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "National BIC identifiers for authorised and central branches."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBankBranch = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ParticipantInformation1.mmObject();
			isDerived = false;
			xmlTag = "BkBrnch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankBranch";
			definition = "National BIC identifiers for authorised and central branches.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CentralisedAndAuthorisedBranchIdentification1Choice.mmObject();
		}
	};
	@XmlElement(name = "TermnlId")
	protected Max35Text terminalIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.ParticipantInformation1
	 * ParticipantInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermnlId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CBRF identification of the terminal."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTerminalIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ParticipantInformation1.mmObject();
			isDerived = false;
			xmlTag = "TermnlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalIdentification";
			definition = "CBRF identification of the terminal.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Rstrctns")
	protected List<Max35Text> restrictions;
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
	 * {@linkplain com.tools20022.repository.msg.ParticipantInformation1
	 * ParticipantInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rstrctns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Intraday restrictions details."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRestrictions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ParticipantInformation1.mmObject();
			isDerived = false;
			xmlTag = "Rstrctns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restrictions";
			definition = "Intraday restrictions details.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "XtrnlPmtSysInf")
	protected ExternalPaymentSystemDetails1 externalPaymentSystemInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ExternalPaymentSystemDetails1
	 * ExternalPaymentSystemDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantInformation1
	 * ParticipantInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtrnlPmtSysInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalPaymentSystemInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "External payment system details."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExternalPaymentSystemInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ParticipantInformation1.mmObject();
			isDerived = false;
			xmlTag = "XtrnlPmtSysInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalPaymentSystemInformation";
			definition = "External payment system details.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExternalPaymentSystemDetails1.mmObject();
		}
	};
	@XmlElement(name = "Mgrtn", required = true)
	protected SystemMigration1 migration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemMigration1
	 * SystemMigration1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantInformation1
	 * ParticipantInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mgrtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Migration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related for participant migration process."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMigration = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ParticipantInformation1.mmObject();
			isDerived = false;
			xmlTag = "Mgrtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Migration";
			definition = "Information related for participant migration process.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemMigration1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ParticipantInformation1.mmProfileDeletionDate, com.tools20022.repository.msg.ParticipantInformation1.mmBankBranch,
						com.tools20022.repository.msg.ParticipantInformation1.mmTerminalIdentification, com.tools20022.repository.msg.ParticipantInformation1.mmRestrictions,
						com.tools20022.repository.msg.ParticipantInformation1.mmExternalPaymentSystemInformation, com.tools20022.repository.msg.ParticipantInformation1.mmMigration);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ParticipantInformation1";
				definition = "Participant profile participant information.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODateTime> getProfileDeletionDate() {
		return profileDeletionDate == null ? Optional.empty() : Optional.of(profileDeletionDate);
	}

	public ParticipantInformation1 setProfileDeletionDate(ISODateTime profileDeletionDate) {
		this.profileDeletionDate = profileDeletionDate;
		return this;
	}

	public Optional<CentralisedAndAuthorisedBranchIdentification1Choice> getBankBranch() {
		return bankBranch == null ? Optional.empty() : Optional.of(bankBranch);
	}

	public ParticipantInformation1 setBankBranch(CentralisedAndAuthorisedBranchIdentification1Choice bankBranch) {
		this.bankBranch = bankBranch;
		return this;
	}

	public Optional<Max35Text> getTerminalIdentification() {
		return terminalIdentification == null ? Optional.empty() : Optional.of(terminalIdentification);
	}

	public ParticipantInformation1 setTerminalIdentification(Max35Text terminalIdentification) {
		this.terminalIdentification = terminalIdentification;
		return this;
	}

	public List<Max35Text> getRestrictions() {
		return restrictions == null ? restrictions = new ArrayList<>() : restrictions;
	}

	public ParticipantInformation1 setRestrictions(List<Max35Text> restrictions) {
		this.restrictions = Objects.requireNonNull(restrictions);
		return this;
	}

	public Optional<ExternalPaymentSystemDetails1> getExternalPaymentSystemInformation() {
		return externalPaymentSystemInformation == null ? Optional.empty() : Optional.of(externalPaymentSystemInformation);
	}

	public ParticipantInformation1 setExternalPaymentSystemInformation(com.tools20022.repository.msg.ExternalPaymentSystemDetails1 externalPaymentSystemInformation) {
		this.externalPaymentSystemInformation = externalPaymentSystemInformation;
		return this;
	}

	public SystemMigration1 getMigration() {
		return migration;
	}

	public ParticipantInformation1 setMigration(com.tools20022.repository.msg.SystemMigration1 migration) {
		this.migration = Objects.requireNonNull(migration);
		return this;
	}
}