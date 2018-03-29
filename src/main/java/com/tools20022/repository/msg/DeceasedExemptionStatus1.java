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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.AcknowledgementOfExemption1Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Deceased beneficial owner exemption information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeceasedExemptionStatus1#mmBeneficialOwnerDeathDate
 * DeceasedExemptionStatus1.mmBeneficialOwnerDeathDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeceasedExemptionStatus1#mmDeathCertificateSerialNumber
 * DeceasedExemptionStatus1.mmDeathCertificateSerialNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeceasedExemptionStatus1#mmIssuingJurisdiction
 * DeceasedExemptionStatus1.mmIssuingJurisdiction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeceasedExemptionStatus1#mmDocumentationAcknowledgementOfExemption
 * DeceasedExemptionStatus1.mmDocumentationAcknowledgementOfExemption}</li>
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
 * "DeceasedExemptionStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Deceased beneficial owner exemption information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DeceasedExemptionStatus1", propOrder = {"beneficialOwnerDeathDate", "deathCertificateSerialNumber", "issuingJurisdiction", "documentationAcknowledgementOfExemption"})
public class DeceasedExemptionStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BnfclOwnrDthDt", required = true)
	protected ISODate beneficialOwnerDeathDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeceasedExemptionStatus1
	 * DeceasedExemptionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfclOwnrDthDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Beneficial Owner Death Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerDeathDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of death of the beneficial owner."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DeceasedExemptionStatus1, ISODate> mmBeneficialOwnerDeathDate = new MMMessageAttribute<DeceasedExemptionStatus1, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DeceasedExemptionStatus1.mmObject();
			isDerived = false;
			xmlTag = "BnfclOwnrDthDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Beneficial Owner Death Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerDeathDate";
			definition = "Date of death of the beneficial owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(DeceasedExemptionStatus1 obj) {
			return obj.getBeneficialOwnerDeathDate();
		}

		@Override
		public void setValue(DeceasedExemptionStatus1 obj, ISODate value) {
			obj.setBeneficialOwnerDeathDate(value);
		}
	};
	@XmlElement(name = "DthCertSrlNb", required = true)
	protected Max35Text deathCertificateSerialNumber;
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
	 * {@linkplain com.tools20022.repository.msg.DeceasedExemptionStatus1
	 * DeceasedExemptionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DthCertSrlNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Death Certificate Serial Number</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeathCertificateSerialNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Serial number of the death certificate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DeceasedExemptionStatus1, Max35Text> mmDeathCertificateSerialNumber = new MMMessageAttribute<DeceasedExemptionStatus1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DeceasedExemptionStatus1.mmObject();
			isDerived = false;
			xmlTag = "DthCertSrlNb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Death Certificate Serial Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeathCertificateSerialNumber";
			definition = "Serial number of the death certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(DeceasedExemptionStatus1 obj) {
			return obj.getDeathCertificateSerialNumber();
		}

		@Override
		public void setValue(DeceasedExemptionStatus1 obj, Max35Text value) {
			obj.setDeathCertificateSerialNumber(value);
		}
	};
	@XmlElement(name = "IssgJursdctn", required = true)
	protected Max35Text issuingJurisdiction;
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
	 * {@linkplain com.tools20022.repository.msg.DeceasedExemptionStatus1
	 * DeceasedExemptionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssgJursdctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Issuing Jurisdiction</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuingJurisdiction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the jurisdiction issuing the death certificate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DeceasedExemptionStatus1, Max35Text> mmIssuingJurisdiction = new MMMessageAttribute<DeceasedExemptionStatus1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DeceasedExemptionStatus1.mmObject();
			isDerived = false;
			xmlTag = "IssgJursdctn";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Issuing Jurisdiction"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuingJurisdiction";
			definition = "Identification of the jurisdiction issuing the death certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(DeceasedExemptionStatus1 obj) {
			return obj.getIssuingJurisdiction();
		}

		@Override
		public void setValue(DeceasedExemptionStatus1 obj, Max35Text value) {
			obj.setIssuingJurisdiction(value);
		}
	};
	@XmlElement(name = "DcmnttnAckOfXmptn", required = true)
	protected AcknowledgementOfExemption1Choice documentationAcknowledgementOfExemption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementOfExemption1Choice
	 * AcknowledgementOfExemption1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeceasedExemptionStatus1
	 * DeceasedExemptionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DcmnttnAckOfXmptn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Documentation Acknowledgement Of Exemption
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentationAcknowledgementOfExemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acknowledgement of exempt instruction specifying whether the documentation will be sent to DTC (The Depository Trust Corporation) or not (not maintained by DTCC)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DeceasedExemptionStatus1, AcknowledgementOfExemption1Choice> mmDocumentationAcknowledgementOfExemption = new MMMessageAssociationEnd<DeceasedExemptionStatus1, AcknowledgementOfExemption1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DeceasedExemptionStatus1.mmObject();
			isDerived = false;
			xmlTag = "DcmnttnAckOfXmptn";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Documentation Acknowledgement Of Exemption"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentationAcknowledgementOfExemption";
			definition = "Acknowledgement of exempt instruction specifying whether the documentation will be sent to DTC (The Depository Trust Corporation) or not (not maintained by DTCC).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AcknowledgementOfExemption1Choice.mmObject();
		}

		@Override
		public AcknowledgementOfExemption1Choice getValue(DeceasedExemptionStatus1 obj) {
			return obj.getDocumentationAcknowledgementOfExemption();
		}

		@Override
		public void setValue(DeceasedExemptionStatus1 obj, AcknowledgementOfExemption1Choice value) {
			obj.setDocumentationAcknowledgementOfExemption(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeceasedExemptionStatus1.mmBeneficialOwnerDeathDate, com.tools20022.repository.msg.DeceasedExemptionStatus1.mmDeathCertificateSerialNumber,
						com.tools20022.repository.msg.DeceasedExemptionStatus1.mmIssuingJurisdiction, com.tools20022.repository.msg.DeceasedExemptionStatus1.mmDocumentationAcknowledgementOfExemption);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DeceasedExemptionStatus1";
				definition = "Deceased beneficial owner exemption information.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getBeneficialOwnerDeathDate() {
		return beneficialOwnerDeathDate;
	}

	public DeceasedExemptionStatus1 setBeneficialOwnerDeathDate(ISODate beneficialOwnerDeathDate) {
		this.beneficialOwnerDeathDate = Objects.requireNonNull(beneficialOwnerDeathDate);
		return this;
	}

	public Max35Text getDeathCertificateSerialNumber() {
		return deathCertificateSerialNumber;
	}

	public DeceasedExemptionStatus1 setDeathCertificateSerialNumber(Max35Text deathCertificateSerialNumber) {
		this.deathCertificateSerialNumber = Objects.requireNonNull(deathCertificateSerialNumber);
		return this;
	}

	public Max35Text getIssuingJurisdiction() {
		return issuingJurisdiction;
	}

	public DeceasedExemptionStatus1 setIssuingJurisdiction(Max35Text issuingJurisdiction) {
		this.issuingJurisdiction = Objects.requireNonNull(issuingJurisdiction);
		return this;
	}

	public AcknowledgementOfExemption1Choice getDocumentationAcknowledgementOfExemption() {
		return documentationAcknowledgementOfExemption;
	}

	public DeceasedExemptionStatus1 setDocumentationAcknowledgementOfExemption(AcknowledgementOfExemption1Choice documentationAcknowledgementOfExemption) {
		this.documentationAcknowledgementOfExemption = Objects.requireNonNull(documentationAcknowledgementOfExemption);
		return this;
	}
}