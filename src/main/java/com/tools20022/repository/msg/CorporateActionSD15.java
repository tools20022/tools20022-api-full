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
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15AlphaNumericText;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Contains details about called certificates.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD15#mmCertificateNumber
 * CorporateActionSD15.mmCertificateNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD15#mmCertificateCalledAmount
 * CorporateActionSD15.mmCertificateCalledAmount}</li>
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
 * "CorporateActionSD15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Contains details about called certificates."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD5
 * CorporateActionSD5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionSD15", propOrder = {"certificateNumber", "certificateCalledAmount"})
public class CorporateActionSD15 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD15
	 * CorporateActionSD15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Certificate Number</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification or serial number that is assigned and affixed by an issuer or transfer agent to each securities certificate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD5#mmCertificateNumber
	 * CorporateActionSD5.mmCertificateNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD15, Max15AlphaNumericText> mmCertificateNumber = new MMMessageAttribute<CorporateActionSD15, Max15AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD15.mmObject();
			isDerived = false;
			xmlTag = "CertNb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Certificate Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateNumber";
			definition = "Unique identification or serial number that is assigned and affixed by an issuer or transfer agent to each securities certificate.";
			previousVersion_lazy = () -> CorporateActionSD5.mmCertificateNumber;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15AlphaNumericText.mmObject();
		}

		@Override
		public Max15AlphaNumericText getValue(CorporateActionSD15 obj) {
			return obj.getCertificateNumber();
		}

		@Override
		public void setValue(CorporateActionSD15 obj, Max15AlphaNumericText value) {
			obj.setCertificateNumber(value);
		}
	};
	@XmlElement(name = "CertClldAmt", required = true)
	protected DecimalNumber certificateCalledAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD15
	 * CorporateActionSD15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertClldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Certificate Called Amount</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateCalledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Principal amount (for debt issues) or number of shares (for equity issues) that has been called for redemption for a particular certificate number."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD5#mmCertificateCalledAmount
	 * CorporateActionSD5.mmCertificateCalledAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD15, DecimalNumber> mmCertificateCalledAmount = new MMMessageAttribute<CorporateActionSD15, DecimalNumber>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD15.mmObject();
			isDerived = false;
			xmlTag = "CertClldAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Certificate Called Amount"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateCalledAmount";
			definition = "Principal amount (for debt issues) or number of shares (for equity issues) that has been called for redemption for a particular certificate number.";
			previousVersion_lazy = () -> CorporateActionSD5.mmCertificateCalledAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(CorporateActionSD15 obj) {
			return obj.getCertificateCalledAmount();
		}

		@Override
		public void setValue(CorporateActionSD15 obj, DecimalNumber value) {
			obj.setCertificateCalledAmount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionSD15.mmCertificateNumber, com.tools20022.repository.msg.CorporateActionSD15.mmCertificateCalledAmount);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionSD15";
				definition = "Contains details about called certificates.";
				previousVersion_lazy = () -> CorporateActionSD5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max15AlphaNumericText getCertificateNumber() {
		return certificateNumber;
	}

	public CorporateActionSD15 setCertificateNumber(Max15AlphaNumericText certificateNumber) {
		this.certificateNumber = Objects.requireNonNull(certificateNumber);
		return this;
	}

	public DecimalNumber getCertificateCalledAmount() {
		return certificateCalledAmount;
	}

	public CorporateActionSD15 setCertificateCalledAmount(DecimalNumber certificateCalledAmount) {
		this.certificateCalledAmount = Objects.requireNonNull(certificateCalledAmount);
		return this;
	}
}