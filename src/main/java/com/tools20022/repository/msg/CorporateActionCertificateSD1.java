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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max15AlphaNumericText;
import com.tools20022.repository.datatype.Max30Text;
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
 * Certificate information provided for a given corporate action instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCertificateSD1#mmCertificateNumber
 * CorporateActionCertificateSD1.mmCertificateNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCertificateSD1#mmCertificateSequenceNumber
 * CorporateActionCertificateSD1.mmCertificateSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCertificateSD1#mmCertificateRegistrationName
 * CorporateActionCertificateSD1.mmCertificateRegistrationName}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionCertificateSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Certificate information provided for a given corporate action instruction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionCertificateSD1", propOrder = {"certificateNumber", "certificateSequenceNumber", "certificateRegistrationName"})
public class CorporateActionCertificateSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CertNb", required = true)
	protected Max15AlphaNumericText certificateNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15AlphaNumericText
	 * Max15AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCertificateSD1
	 * CorporateActionCertificateSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification or serial number that is assigned and affixed by an issuer or transfer agent to each securities certificate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Certificate Number</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionCertificateSD1, Max15AlphaNumericText> mmCertificateNumber = new MMMessageAttribute<CorporateActionCertificateSD1, Max15AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionCertificateSD1.mmObject();
			isDerived = false;
			xmlTag = "CertNb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Certificate Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateNumber";
			definition = "Unique identification or serial number that is assigned and affixed by an issuer or transfer agent to each securities certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15AlphaNumericText.mmObject();
		}

		@Override
		public Max15AlphaNumericText getValue(CorporateActionCertificateSD1 obj) {
			return obj.getCertificateNumber();
		}

		@Override
		public void setValue(CorporateActionCertificateSD1 obj, Max15AlphaNumericText value) {
			obj.setCertificateNumber(value);
		}
	};
	@XmlElement(name = "CertSeqNb")
	protected Max15AlphaNumericText certificateSequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15AlphaNumericText
	 * Max15AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCertificateSD1
	 * CorporateActionCertificateSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertSeqNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional identifier assigned by DTC."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionCertificateSD1, Optional<Max15AlphaNumericText>> mmCertificateSequenceNumber = new MMMessageAttribute<CorporateActionCertificateSD1, Optional<Max15AlphaNumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionCertificateSD1.mmObject();
			isDerived = false;
			xmlTag = "CertSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateSequenceNumber";
			definition = "Additional identifier assigned by DTC.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15AlphaNumericText.mmObject();
		}

		@Override
		public Optional<Max15AlphaNumericText> getValue(CorporateActionCertificateSD1 obj) {
			return obj.getCertificateSequenceNumber();
		}

		@Override
		public void setValue(CorporateActionCertificateSD1 obj, Optional<Max15AlphaNumericText> value) {
			obj.setCertificateSequenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "CertRegnNm")
	protected Max30Text certificateRegistrationName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max30Text
	 * Max30Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCertificateSD1
	 * CorporateActionCertificateSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertRegnNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateRegistrationName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Registration name of the beneficial holder."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionCertificateSD1, Optional<Max30Text>> mmCertificateRegistrationName = new MMMessageAttribute<CorporateActionCertificateSD1, Optional<Max30Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionCertificateSD1.mmObject();
			isDerived = false;
			xmlTag = "CertRegnNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateRegistrationName";
			definition = "Registration name of the beneficial holder.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max30Text.mmObject();
		}

		@Override
		public Optional<Max30Text> getValue(CorporateActionCertificateSD1 obj) {
			return obj.getCertificateRegistrationName();
		}

		@Override
		public void setValue(CorporateActionCertificateSD1 obj, Optional<Max30Text> value) {
			obj.setCertificateRegistrationName(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionCertificateSD1.mmCertificateNumber, com.tools20022.repository.msg.CorporateActionCertificateSD1.mmCertificateSequenceNumber,
						com.tools20022.repository.msg.CorporateActionCertificateSD1.mmCertificateRegistrationName);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionCertificateSD1";
				definition = "Certificate information provided for a given corporate action instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max15AlphaNumericText getCertificateNumber() {
		return certificateNumber;
	}

	public CorporateActionCertificateSD1 setCertificateNumber(Max15AlphaNumericText certificateNumber) {
		this.certificateNumber = Objects.requireNonNull(certificateNumber);
		return this;
	}

	public Optional<Max15AlphaNumericText> getCertificateSequenceNumber() {
		return certificateSequenceNumber == null ? Optional.empty() : Optional.of(certificateSequenceNumber);
	}

	public CorporateActionCertificateSD1 setCertificateSequenceNumber(Max15AlphaNumericText certificateSequenceNumber) {
		this.certificateSequenceNumber = certificateSequenceNumber;
		return this;
	}

	public Optional<Max30Text> getCertificateRegistrationName() {
		return certificateRegistrationName == null ? Optional.empty() : Optional.of(certificateRegistrationName);
	}

	public CorporateActionCertificateSD1 setCertificateRegistrationName(Max30Text certificateRegistrationName) {
		this.certificateRegistrationName = certificateRegistrationName;
		return this;
	}
}