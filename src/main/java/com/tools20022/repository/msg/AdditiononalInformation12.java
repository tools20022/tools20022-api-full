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
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07;
import com.tools20022.repository.area.acmt.AccountOpeningInstructionV07;
import com.tools20022.repository.choice.PartyIdentification70Choice;
import com.tools20022.repository.choice.RestrictionStatus1Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DateTimePeriodDetails1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Restrictions, remarks or notes that may be applied to an account or
 * investment plan.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12#mmLimitation
 * AdditiononalInformation12.mmLimitation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12#mmAdditionalInformation
 * AdditiononalInformation12.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12#mmAccountValidation
 * AdditiononalInformation12.mmAccountValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12#mmType
 * AdditiononalInformation12.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12#mmRegulator
 * AdditiononalInformation12.mmRegulator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12#mmStatus
 * AdditiononalInformation12.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12#mmPeriod
 * AdditiononalInformation12.mmPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmAdditionalInformation
 * AccountDetailsConfirmationV07.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmAdditionalInformation
 * AccountOpeningInstructionV07.mmAdditionalInformation}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditiononalInformation12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Restrictions, remarks or notes that may be applied to an account or investment plan."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1
 * AccountRestrictions1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AdditiononalInformation12", propOrder = {"limitation", "additionalInformation", "accountValidation", "type", "regulator", "status", "period"})
public class AdditiononalInformation12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Lmttn")
	protected Max350Text limitation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12
	 * AdditiononalInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lmttn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limitation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Restrictions and/or limitations on the account or party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1#mmLimitation
	 * AccountRestrictions1.mmLimitation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditiononalInformation12, Optional<Max350Text>> mmLimitation = new MMMessageAttribute<AdditiononalInformation12, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditiononalInformation12.mmObject();
			isDerived = false;
			xmlTag = "Lmttn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limitation";
			definition = "Restrictions and/or limitations on the account or party.";
			previousVersion_lazy = () -> AccountRestrictions1.mmLimitation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(AdditiononalInformation12 obj) {
			return obj.getLimitation();
		}

		@Override
		public void setValue(AdditiononalInformation12 obj, Optional<Max350Text> value) {
			obj.setLimitation(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max350Text additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12
	 * AdditiononalInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information such as remarks or notes that must be conveyed about the account management activity or party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1#mmAdditionalInformation
	 * AccountRestrictions1.mmAdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditiononalInformation12, Optional<Max350Text>> mmAdditionalInformation = new MMMessageAttribute<AdditiononalInformation12, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditiononalInformation12.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information such as remarks or notes that must be conveyed about the account management activity or party.";
			previousVersion_lazy = () -> AccountRestrictions1.mmAdditionalInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(AdditiononalInformation12 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(AdditiononalInformation12 obj, Optional<Max350Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctVldtn")
	protected Max350Text accountValidation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12
	 * AdditiononalInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctVldtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information or instructions for the by-passing of validations in the account registration process."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1#mmAccountValidation
	 * AccountRestrictions1.mmAccountValidation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditiononalInformation12, Optional<Max350Text>> mmAccountValidation = new MMMessageAttribute<AdditiononalInformation12, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditiononalInformation12.mmObject();
			isDerived = false;
			xmlTag = "AcctVldtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountValidation";
			definition = "Information or instructions for the by-passing of validations in the account registration process.";
			previousVersion_lazy = () -> AccountRestrictions1.mmAccountValidation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(AdditiononalInformation12 obj) {
			return obj.getAccountValidation();
		}

		@Override
		public void setValue(AdditiononalInformation12 obj, Optional<Max350Text> value) {
			obj.setAccountValidation(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp")
	protected Max35Text type;
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
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12
	 * AdditiononalInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type or identification of the remark, note, limitation or restriction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1#mmType
	 * AccountRestrictions1.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditiononalInformation12, Optional<Max35Text>> mmType = new MMMessageAttribute<AdditiononalInformation12, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditiononalInformation12.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type or identification of the remark, note, limitation or restriction.";
			previousVersion_lazy = () -> AccountRestrictions1.mmType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AdditiononalInformation12 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(AdditiononalInformation12 obj, Optional<Max35Text> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Rgltr")
	protected PartyIdentification70Choice regulator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
	 * PartyIdentification70Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12
	 * AdditiononalInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rgltr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Regulator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regulator that may have to be informed about the remark, note, limitation or restriction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1#mmRegulator
	 * AccountRestrictions1.mmRegulator}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AdditiononalInformation12, Optional<PartyIdentification70Choice>> mmRegulator = new MMMessageAssociationEnd<AdditiononalInformation12, Optional<PartyIdentification70Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditiononalInformation12.mmObject();
			isDerived = false;
			xmlTag = "Rgltr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Regulator";
			definition = "Regulator that may have to be informed about the remark, note, limitation or restriction.";
			previousVersion_lazy = () -> AccountRestrictions1.mmRegulator;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification70Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification70Choice> getValue(AdditiononalInformation12 obj) {
			return obj.getRegulator();
		}

		@Override
		public void setValue(AdditiononalInformation12 obj, Optional<PartyIdentification70Choice> value) {
			obj.setRegulator(value.orElse(null));
		}
	};
	@XmlElement(name = "Sts")
	protected RestrictionStatus1Choice status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RestrictionStatus1Choice
	 * RestrictionStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12
	 * AdditiononalInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the remark, note, limitation or restriction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1#mmStatus
	 * AccountRestrictions1.mmStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AdditiononalInformation12, Optional<RestrictionStatus1Choice>> mmStatus = new MMMessageAssociationEnd<AdditiononalInformation12, Optional<RestrictionStatus1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditiononalInformation12.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the remark, note, limitation or restriction.";
			previousVersion_lazy = () -> AccountRestrictions1.mmStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RestrictionStatus1Choice.mmObject();
		}

		@Override
		public Optional<RestrictionStatus1Choice> getValue(AdditiononalInformation12 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(AdditiononalInformation12 obj, Optional<RestrictionStatus1Choice> value) {
			obj.setStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "Prd")
	protected DateTimePeriodDetails1 period;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails1
	 * DateTimePeriodDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12
	 * AdditiononalInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Period"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period of the restriction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1#mmPeriod
	 * AccountRestrictions1.mmPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AdditiononalInformation12, Optional<DateTimePeriodDetails1>> mmPeriod = new MMMessageAssociationEnd<AdditiononalInformation12, Optional<DateTimePeriodDetails1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditiononalInformation12.mmObject();
			isDerived = false;
			xmlTag = "Prd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Period";
			definition = "Period of the restriction.";
			previousVersion_lazy = () -> AccountRestrictions1.mmPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateTimePeriodDetails1.mmObject();
		}

		@Override
		public Optional<DateTimePeriodDetails1> getValue(AdditiononalInformation12 obj) {
			return obj.getPeriod();
		}

		@Override
		public void setValue(AdditiononalInformation12 obj, Optional<DateTimePeriodDetails1> value) {
			obj.setPeriod(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditiononalInformation12.mmLimitation, com.tools20022.repository.msg.AdditiononalInformation12.mmAdditionalInformation,
						com.tools20022.repository.msg.AdditiononalInformation12.mmAccountValidation, com.tools20022.repository.msg.AdditiononalInformation12.mmType, com.tools20022.repository.msg.AdditiononalInformation12.mmRegulator,
						com.tools20022.repository.msg.AdditiononalInformation12.mmStatus, com.tools20022.repository.msg.AdditiononalInformation12.mmPeriod);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmAdditionalInformation, AccountOpeningInstructionV07.mmAdditionalInformation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditiononalInformation12";
				definition = "Restrictions, remarks or notes that may be applied to an account or investment plan.";
				previousVersion_lazy = () -> AccountRestrictions1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getLimitation() {
		return limitation == null ? Optional.empty() : Optional.of(limitation);
	}

	public AdditiononalInformation12 setLimitation(Max350Text limitation) {
		this.limitation = limitation;
		return this;
	}

	public Optional<Max350Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public AdditiononalInformation12 setAdditionalInformation(Max350Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public Optional<Max350Text> getAccountValidation() {
		return accountValidation == null ? Optional.empty() : Optional.of(accountValidation);
	}

	public AdditiononalInformation12 setAccountValidation(Max350Text accountValidation) {
		this.accountValidation = accountValidation;
		return this;
	}

	public Optional<Max35Text> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public AdditiononalInformation12 setType(Max35Text type) {
		this.type = type;
		return this;
	}

	public Optional<PartyIdentification70Choice> getRegulator() {
		return regulator == null ? Optional.empty() : Optional.of(regulator);
	}

	public AdditiononalInformation12 setRegulator(PartyIdentification70Choice regulator) {
		this.regulator = regulator;
		return this;
	}

	public Optional<RestrictionStatus1Choice> getStatus() {
		return status == null ? Optional.empty() : Optional.of(status);
	}

	public AdditiononalInformation12 setStatus(RestrictionStatus1Choice status) {
		this.status = status;
		return this;
	}

	public Optional<DateTimePeriodDetails1> getPeriod() {
		return period == null ? Optional.empty() : Optional.of(period);
	}

	public AdditiononalInformation12 setPeriod(DateTimePeriodDetails1 period) {
		this.period = period;
		return this;
	}
}