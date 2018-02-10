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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information from the National BIC Directory.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1#mmParticipantNameAndAddress
 * DirectoryParticipantInformation1.mmParticipantNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1#mmAccountServicer
 * DirectoryParticipantInformation1.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1#mmDirectParticipant
 * DirectoryParticipantInformation1.mmDirectParticipant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1#mmEntryCreationDate
 * DirectoryParticipantInformation1.mmEntryCreationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1#mmEntryDeletionDate
 * DirectoryParticipantInformation1.mmEntryDeletionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1#mmServicerType
 * DirectoryParticipantInformation1.mmServicerType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1#mmServiceType
 * DirectoryParticipantInformation1.mmServiceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1#mmExchangeType
 * DirectoryParticipantInformation1.mmExchangeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1#mmRestrictionType
 * DirectoryParticipantInformation1.mmRestrictionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1#mmRestrictionEffectiveDate
 * DirectoryParticipantInformation1.mmRestrictionEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1#mmParticipantIdentification
 * DirectoryParticipantInformation1.mmParticipantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1#mmMigrationDetails
 * DirectoryParticipantInformation1.mmMigrationDetails}</li>
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
 * "DirectoryParticipantInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information from the National BIC Directory."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DirectoryParticipantInformation1", propOrder = {"participantNameAndAddress", "accountServicer", "directParticipant", "entryCreationDate", "entryDeletionDate", "servicerType", "serviceType", "exchangeType",
		"restrictionType", "restrictionEffectiveDate", "participantIdentification", "migrationDetails"})
public class DirectoryParticipantInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PtcptNmAndAdr")
	protected EnglishNameLocalNameAndAddress1 participantNameAndAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.EnglishNameLocalNameAndAddress1
	 * EnglishNameLocalNameAndAddress1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1
	 * DirectoryParticipantInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcptNmAndAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantNameAndAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name and address as in participant profile."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParticipantNameAndAddress = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectoryParticipantInformation1.mmObject();
			isDerived = false;
			xmlTag = "PtcptNmAndAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantNameAndAddress";
			definition = "Name and address as in participant profile.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.EnglishNameLocalNameAndAddress1.mmObject();
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected BranchAndFinancialInstitutionIdentification5 accountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1
	 * DirectoryParticipantInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Branch and Head branch of the CBR servicing the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountServicer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectoryParticipantInformation1.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Branch and Head branch of the CBR servicing the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	@XmlElement(name = "DrctPtcpt")
	protected FinancialInstitutionIdentification9 directParticipant;
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
	 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1
	 * DirectoryParticipantInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrctPtcpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectParticipant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Direct participant of the CBR payment system."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDirectParticipant = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectoryParticipantInformation1.mmObject();
			isDerived = false;
			xmlTag = "DrctPtcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectParticipant";
			definition = "Direct participant of the CBR payment system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitutionIdentification9.mmObject();
		}
	};
	@XmlElement(name = "NtryCreDt", required = true)
	protected ISODateTime entryCreationDate;
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
	 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1
	 * DirectoryParticipantInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryCreDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryCreationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the entry was created."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntryCreationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectoryParticipantInformation1.mmObject();
			isDerived = false;
			xmlTag = "NtryCreDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryCreationDate";
			definition = "Date when the entry was created.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "NtryDeltnDt")
	protected ISODateTime entryDeletionDate;
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
	 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1
	 * DirectoryParticipantInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryDeltnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryDeletionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date entry was deleted."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntryDeletionDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectoryParticipantInformation1.mmObject();
			isDerived = false;
			xmlTag = "NtryDeltnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryDeletionDate";
			definition = "Date entry was deleted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "SvcrTp", required = true)
	protected Max35Text servicerType;
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
	 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1
	 * DirectoryParticipantInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServicerType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of the funds transfer participant."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServicerType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectoryParticipantInformation1.mmObject();
			isDerived = false;
			xmlTag = "SvcrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServicerType";
			definition = "Specifies the type of the funds transfer participant.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "SvcTp", required = true)
	protected Max35Text serviceType;
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
	 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1
	 * DirectoryParticipantInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies available types of the funds transfer services."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectoryParticipantInformation1.mmObject();
			isDerived = false;
			xmlTag = "SvcTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceType";
			definition = "Specifies available types of the funds transfer services.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "XchgTp", required = true)
	protected Max35Text exchangeType;
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
	 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1
	 * DirectoryParticipantInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the participant is a member of the exchange."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectoryParticipantInformation1.mmObject();
			isDerived = false;
			xmlTag = "XchgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeType";
			definition = "Specifies whether the participant is a member of the exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "RstrctnTp", required = true)
	protected Max35Text restrictionType;
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
	 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1
	 * DirectoryParticipantInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RstrctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the restriction applied."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRestrictionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectoryParticipantInformation1.mmObject();
			isDerived = false;
			xmlTag = "RstrctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionType";
			definition = "Type of the restriction applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "RstrctnFctvDt")
	protected ISODateTime restrictionEffectiveDate;
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
	 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1
	 * DirectoryParticipantInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RstrctnFctvDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionEffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Effective date of the restriction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRestrictionEffectiveDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectoryParticipantInformation1.mmObject();
			isDerived = false;
			xmlTag = "RstrctnFctvDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionEffectiveDate";
			definition = "Effective date of the restriction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "PtcptId", required = true)
	protected FinancialInstitutionIdentification9 participantIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1
	 * DirectoryParticipantInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of participant."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParticipantIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectoryParticipantInformation1.mmObject();
			isDerived = false;
			xmlTag = "PtcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantIdentification";
			definition = "Identifier of participant.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitutionIdentification9.mmObject();
		}
	};
	@XmlElement(name = "MgrtnDtls", required = true)
	protected SystemMigration1 migrationDetails;
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
	 * {@linkplain com.tools20022.repository.msg.DirectoryParticipantInformation1
	 * DirectoryParticipantInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MgrtnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MigrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to migration to new payment system."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMigrationDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectoryParticipantInformation1.mmObject();
			isDerived = false;
			xmlTag = "MgrtnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MigrationDetails";
			definition = "Details related to migration to new payment system.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemMigration1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectoryParticipantInformation1.mmParticipantNameAndAddress, com.tools20022.repository.msg.DirectoryParticipantInformation1.mmAccountServicer,
						com.tools20022.repository.msg.DirectoryParticipantInformation1.mmDirectParticipant, com.tools20022.repository.msg.DirectoryParticipantInformation1.mmEntryCreationDate,
						com.tools20022.repository.msg.DirectoryParticipantInformation1.mmEntryDeletionDate, com.tools20022.repository.msg.DirectoryParticipantInformation1.mmServicerType,
						com.tools20022.repository.msg.DirectoryParticipantInformation1.mmServiceType, com.tools20022.repository.msg.DirectoryParticipantInformation1.mmExchangeType,
						com.tools20022.repository.msg.DirectoryParticipantInformation1.mmRestrictionType, com.tools20022.repository.msg.DirectoryParticipantInformation1.mmRestrictionEffectiveDate,
						com.tools20022.repository.msg.DirectoryParticipantInformation1.mmParticipantIdentification, com.tools20022.repository.msg.DirectoryParticipantInformation1.mmMigrationDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DirectoryParticipantInformation1";
				definition = "Information from the National BIC Directory.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<EnglishNameLocalNameAndAddress1> getParticipantNameAndAddress() {
		return participantNameAndAddress == null ? Optional.empty() : Optional.of(participantNameAndAddress);
	}

	public DirectoryParticipantInformation1 setParticipantNameAndAddress(com.tools20022.repository.msg.EnglishNameLocalNameAndAddress1 participantNameAndAddress) {
		this.participantNameAndAddress = participantNameAndAddress;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public DirectoryParticipantInformation1 setAccountServicer(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}

	public Optional<FinancialInstitutionIdentification9> getDirectParticipant() {
		return directParticipant == null ? Optional.empty() : Optional.of(directParticipant);
	}

	public DirectoryParticipantInformation1 setDirectParticipant(com.tools20022.repository.msg.FinancialInstitutionIdentification9 directParticipant) {
		this.directParticipant = directParticipant;
		return this;
	}

	public ISODateTime getEntryCreationDate() {
		return entryCreationDate;
	}

	public DirectoryParticipantInformation1 setEntryCreationDate(ISODateTime entryCreationDate) {
		this.entryCreationDate = Objects.requireNonNull(entryCreationDate);
		return this;
	}

	public Optional<ISODateTime> getEntryDeletionDate() {
		return entryDeletionDate == null ? Optional.empty() : Optional.of(entryDeletionDate);
	}

	public DirectoryParticipantInformation1 setEntryDeletionDate(ISODateTime entryDeletionDate) {
		this.entryDeletionDate = entryDeletionDate;
		return this;
	}

	public Max35Text getServicerType() {
		return servicerType;
	}

	public DirectoryParticipantInformation1 setServicerType(Max35Text servicerType) {
		this.servicerType = Objects.requireNonNull(servicerType);
		return this;
	}

	public Max35Text getServiceType() {
		return serviceType;
	}

	public DirectoryParticipantInformation1 setServiceType(Max35Text serviceType) {
		this.serviceType = Objects.requireNonNull(serviceType);
		return this;
	}

	public Max35Text getExchangeType() {
		return exchangeType;
	}

	public DirectoryParticipantInformation1 setExchangeType(Max35Text exchangeType) {
		this.exchangeType = Objects.requireNonNull(exchangeType);
		return this;
	}

	public Max35Text getRestrictionType() {
		return restrictionType;
	}

	public DirectoryParticipantInformation1 setRestrictionType(Max35Text restrictionType) {
		this.restrictionType = Objects.requireNonNull(restrictionType);
		return this;
	}

	public Optional<ISODateTime> getRestrictionEffectiveDate() {
		return restrictionEffectiveDate == null ? Optional.empty() : Optional.of(restrictionEffectiveDate);
	}

	public DirectoryParticipantInformation1 setRestrictionEffectiveDate(ISODateTime restrictionEffectiveDate) {
		this.restrictionEffectiveDate = restrictionEffectiveDate;
		return this;
	}

	public FinancialInstitutionIdentification9 getParticipantIdentification() {
		return participantIdentification;
	}

	public DirectoryParticipantInformation1 setParticipantIdentification(com.tools20022.repository.msg.FinancialInstitutionIdentification9 participantIdentification) {
		this.participantIdentification = Objects.requireNonNull(participantIdentification);
		return this;
	}

	public SystemMigration1 getMigrationDetails() {
		return migrationDetails;
	}

	public DirectoryParticipantInformation1 setMigrationDetails(com.tools20022.repository.msg.SystemMigration1 migrationDetails) {
		this.migrationDetails = Objects.requireNonNull(migrationDetails);
		return this;
	}
}