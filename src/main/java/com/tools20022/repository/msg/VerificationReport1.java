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
import com.tools20022.repository.area.acmt.IdentificationVerificationReportV01;
import com.tools20022.repository.choice.VerificationReason1Choice;
import com.tools20022.repository.datatype.IdentificationVerificationIndicator;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IdentificationInformation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide information concerning the verification of
 * identification data for which verification was requested.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VerificationReport1#mmOriginalIdentification
 * VerificationReport1.mmOriginalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VerificationReport1#mmVerification
 * VerificationReport1.mmVerification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VerificationReport1#mmReason
 * VerificationReport1.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VerificationReport1#mmOriginalPartyAndAccountIdentification
 * VerificationReport1.mmOriginalPartyAndAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VerificationReport1#mmUpdatedPartyAndAccountIdentification
 * VerificationReport1.mmUpdatedPartyAndAccountIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV01#mmReport
 * IdentificationVerificationReportV01.mmReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "VerificationReport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide information concerning the verification of identification data for which verification was requested."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "VerificationReport1", propOrder = {"originalIdentification", "verification", "reason", "originalPartyAndAccountIdentification", "updatedPartyAndAccountIdentification"})
public class VerificationReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlId", required = true)
	protected Max35Text originalIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.VerificationReport1
	 * VerificationReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by a sending party, to unambiguously identify the party and account identification information group within the original message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<VerificationReport1, Max35Text> mmOriginalIdentification = new MMMessageAttribute<VerificationReport1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.VerificationReport1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalIdentification";
			definition = "Unique identification, as assigned by a sending party, to unambiguously identify the party and account identification information group within the original message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(VerificationReport1 obj) {
			return obj.getOriginalIdentification();
		}

		@Override
		public void setValue(VerificationReport1 obj, Max35Text value) {
			obj.setOriginalIdentification(value);
		}
	};
	@XmlElement(name = "Vrfctn", required = true)
	protected IdentificationVerificationIndicator verification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.IdentificationVerificationIndicator
	 * IdentificationVerificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VerificationReport1
	 * VerificationReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrfctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Verification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the party and/or account information received is correct."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<VerificationReport1, IdentificationVerificationIndicator> mmVerification = new MMMessageAttribute<VerificationReport1, IdentificationVerificationIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.VerificationReport1.mmObject();
			isDerived = false;
			xmlTag = "Vrfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Verification";
			definition = "Identifies whether the party and/or account information received is correct.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IdentificationVerificationIndicator.mmObject();
		}

		@Override
		public IdentificationVerificationIndicator getValue(VerificationReport1 obj) {
			return obj.getVerification();
		}

		@Override
		public void setValue(VerificationReport1 obj, IdentificationVerificationIndicator value) {
			obj.setVerification(value);
		}
	};
	@XmlElement(name = "Rsn")
	protected VerificationReason1Choice reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.VerificationReason1Choice
	 * VerificationReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VerificationReport1
	 * VerificationReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the verified identification information is incorrect."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<VerificationReport1, Optional<VerificationReason1Choice>> mmReason = new MMMessageAssociationEnd<VerificationReport1, Optional<VerificationReason1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.VerificationReport1.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Specifies the reason why the verified identification information is incorrect.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> VerificationReason1Choice.mmObject();
		}

		@Override
		public Optional<VerificationReason1Choice> getValue(VerificationReport1 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(VerificationReport1 obj, Optional<VerificationReason1Choice> value) {
			obj.setReason(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlPtyAndAcctId")
	protected IdentificationInformation1 originalPartyAndAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationInformation1
	 * IdentificationInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VerificationReport1
	 * VerificationReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPtyAndAcctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPartyAndAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides party and/or account identification information as given in the original message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<VerificationReport1, Optional<IdentificationInformation1>> mmOriginalPartyAndAccountIdentification = new MMMessageAssociationEnd<VerificationReport1, Optional<IdentificationInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.VerificationReport1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlPtyAndAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPartyAndAccountIdentification";
			definition = "Provides party and/or account identification information as given in the original message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IdentificationInformation1.mmObject();
		}

		@Override
		public Optional<IdentificationInformation1> getValue(VerificationReport1 obj) {
			return obj.getOriginalPartyAndAccountIdentification();
		}

		@Override
		public void setValue(VerificationReport1 obj, Optional<IdentificationInformation1> value) {
			obj.setOriginalPartyAndAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "UpdtdPtyAndAcctId")
	protected IdentificationInformation1 updatedPartyAndAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationInformation1
	 * IdentificationInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VerificationReport1
	 * VerificationReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdtdPtyAndAcctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdatedPartyAndAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides party and/or account identification information."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<VerificationReport1, Optional<IdentificationInformation1>> mmUpdatedPartyAndAccountIdentification = new MMMessageAssociationEnd<VerificationReport1, Optional<IdentificationInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.VerificationReport1.mmObject();
			isDerived = false;
			xmlTag = "UpdtdPtyAndAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdatedPartyAndAccountIdentification";
			definition = "Provides party and/or account identification information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IdentificationInformation1.mmObject();
		}

		@Override
		public Optional<IdentificationInformation1> getValue(VerificationReport1 obj) {
			return obj.getUpdatedPartyAndAccountIdentification();
		}

		@Override
		public void setValue(VerificationReport1 obj, Optional<IdentificationInformation1> value) {
			obj.setUpdatedPartyAndAccountIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VerificationReport1.mmOriginalIdentification, com.tools20022.repository.msg.VerificationReport1.mmVerification,
						com.tools20022.repository.msg.VerificationReport1.mmReason, com.tools20022.repository.msg.VerificationReport1.mmOriginalPartyAndAccountIdentification,
						com.tools20022.repository.msg.VerificationReport1.mmUpdatedPartyAndAccountIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(IdentificationVerificationReportV01.mmReport);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "VerificationReport1";
				definition = "Set of elements used to provide information concerning the verification of identification data for which verification was requested.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOriginalIdentification() {
		return originalIdentification;
	}

	public VerificationReport1 setOriginalIdentification(Max35Text originalIdentification) {
		this.originalIdentification = Objects.requireNonNull(originalIdentification);
		return this;
	}

	public IdentificationVerificationIndicator getVerification() {
		return verification;
	}

	public VerificationReport1 setVerification(IdentificationVerificationIndicator verification) {
		this.verification = Objects.requireNonNull(verification);
		return this;
	}

	public Optional<VerificationReason1Choice> getReason() {
		return reason == null ? Optional.empty() : Optional.of(reason);
	}

	public VerificationReport1 setReason(VerificationReason1Choice reason) {
		this.reason = reason;
		return this;
	}

	public Optional<IdentificationInformation1> getOriginalPartyAndAccountIdentification() {
		return originalPartyAndAccountIdentification == null ? Optional.empty() : Optional.of(originalPartyAndAccountIdentification);
	}

	public VerificationReport1 setOriginalPartyAndAccountIdentification(IdentificationInformation1 originalPartyAndAccountIdentification) {
		this.originalPartyAndAccountIdentification = originalPartyAndAccountIdentification;
		return this;
	}

	public Optional<IdentificationInformation1> getUpdatedPartyAndAccountIdentification() {
		return updatedPartyAndAccountIdentification == null ? Optional.empty() : Optional.of(updatedPartyAndAccountIdentification);
	}

	public VerificationReport1 setUpdatedPartyAndAccountIdentification(IdentificationInformation1 updatedPartyAndAccountIdentification) {
		this.updatedPartyAndAccountIdentification = updatedPartyAndAccountIdentification;
		return this;
	}
}