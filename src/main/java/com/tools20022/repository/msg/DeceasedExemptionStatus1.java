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
import com.tools20022.repository.choice.AcknowledgementOfExemption1Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DeceasedExemptionStatus1", propOrder = {"beneficialOwnerDeathDate", "deathCertificateSerialNumber", "issuingJurisdiction", "documentationAcknowledgementOfExemption"})
public class DeceasedExemptionStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate beneficialOwnerDeathDate;
	/**
	 * Date of death of the beneficial owner.
	 * <p>
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
	public static final MMMessageAttribute mmBeneficialOwnerDeathDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DeceasedExemptionStatus1.mmObject();
			isDerived = false;
			xmlTag = "BnfclOwnrDthDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerDeathDate";
			definition = "Date of death of the beneficial owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max35Text deathCertificateSerialNumber;
	/**
	 * Serial number of the death certificate.
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
	 * {@linkplain com.tools20022.repository.msg.DeceasedExemptionStatus1
	 * DeceasedExemptionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DthCertSrlNb"</li>
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
	public static final MMMessageAttribute mmDeathCertificateSerialNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DeceasedExemptionStatus1.mmObject();
			isDerived = false;
			xmlTag = "DthCertSrlNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeathCertificateSerialNumber";
			definition = "Serial number of the death certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text issuingJurisdiction;
	/**
	 * Identification of the jurisdiction issuing the death certificate.
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
	 * {@linkplain com.tools20022.repository.msg.DeceasedExemptionStatus1
	 * DeceasedExemptionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssgJursdctn"</li>
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
	public static final MMMessageAttribute mmIssuingJurisdiction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DeceasedExemptionStatus1.mmObject();
			isDerived = false;
			xmlTag = "IssgJursdctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuingJurisdiction";
			definition = "Identification of the jurisdiction issuing the death certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected AcknowledgementOfExemption1Choice documentationAcknowledgementOfExemption;
	/**
	 * Acknowledgement of exempt instruction specifying whether the
	 * documentation will be sent to DTC (The Depository Trust Corporation) or
	 * not (not maintained by DTCC).
	 * <p>
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
	public static final MMMessageAssociationEnd mmDocumentationAcknowledgementOfExemption = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DeceasedExemptionStatus1.mmObject();
			isDerived = false;
			xmlTag = "DcmnttnAckOfXmptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentationAcknowledgementOfExemption";
			definition = "Acknowledgement of exempt instruction specifying whether the documentation will be sent to DTC (The Depository Trust Corporation) or not (not maintained by DTCC).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AcknowledgementOfExemption1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DeceasedExemptionStatus1.mmBeneficialOwnerDeathDate, DeceasedExemptionStatus1.mmDeathCertificateSerialNumber, DeceasedExemptionStatus1.mmIssuingJurisdiction,
						DeceasedExemptionStatus1.mmDocumentationAcknowledgementOfExemption);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DeceasedExemptionStatus1";
				definition = "Deceased beneficial owner exemption information.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "BnfclOwnrDthDt", required = true)
	public ISODate getBeneficialOwnerDeathDate() {
		return beneficialOwnerDeathDate;
	}

	public void setBeneficialOwnerDeathDate(ISODate beneficialOwnerDeathDate) {
		this.beneficialOwnerDeathDate = beneficialOwnerDeathDate;
	}

	@XmlElement(name = "DthCertSrlNb", required = true)
	public Max35Text getDeathCertificateSerialNumber() {
		return deathCertificateSerialNumber;
	}

	public void setDeathCertificateSerialNumber(Max35Text deathCertificateSerialNumber) {
		this.deathCertificateSerialNumber = deathCertificateSerialNumber;
	}

	@XmlElement(name = "IssgJursdctn", required = true)
	public Max35Text getIssuingJurisdiction() {
		return issuingJurisdiction;
	}

	public void setIssuingJurisdiction(Max35Text issuingJurisdiction) {
		this.issuingJurisdiction = issuingJurisdiction;
	}

	@XmlElement(name = "DcmnttnAckOfXmptn", required = true)
	public AcknowledgementOfExemption1Choice getDocumentationAcknowledgementOfExemption() {
		return documentationAcknowledgementOfExemption;
	}

	public void setDocumentationAcknowledgementOfExemption(AcknowledgementOfExemption1Choice documentationAcknowledgementOfExemption) {
		this.documentationAcknowledgementOfExemption = documentationAcknowledgementOfExemption;
	}
}