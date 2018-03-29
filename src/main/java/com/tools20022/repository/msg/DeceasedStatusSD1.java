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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max30Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PartyName;
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
 * Deceased beneficial owner information details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeceasedStatusSD1#mmBeneficialOwnerName
 * DeceasedStatusSD1.mmBeneficialOwnerName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeceasedStatusSD1#mmDeathDate
 * DeceasedStatusSD1.mmDeathDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeceasedStatusSD1#mmDeathCertificateSerialNumber
 * DeceasedStatusSD1.mmDeathCertificateSerialNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeceasedStatusSD1#mmIssuingJurisdiction
 * DeceasedStatusSD1.mmIssuingJurisdiction}</li>
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
 * "DeceasedStatusSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Deceased beneficial owner information details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DeceasedStatusSD1", propOrder = {"beneficialOwnerName", "deathDate", "deathCertificateSerialNumber", "issuingJurisdiction"})
public class DeceasedStatusSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BnfclOwnrNm", required = true)
	protected Max35Text beneficialOwnerName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeceasedStatusSD1
	 * DeceasedStatusSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfclOwnrNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name by which the beneficial owner is known."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DeceasedStatusSD1, Max35Text> mmBeneficialOwnerName = new MMMessageAttribute<DeceasedStatusSD1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeceasedStatusSD1.mmObject();
			isDerived = false;
			xmlTag = "BnfclOwnrNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerName";
			definition = "Name by which the beneficial owner is known.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(DeceasedStatusSD1 obj) {
			return obj.getBeneficialOwnerName();
		}

		@Override
		public void setValue(DeceasedStatusSD1 obj, Max35Text value) {
			obj.setBeneficialOwnerName(value);
		}
	};
	@XmlElement(name = "DthDt")
	protected ISODate deathDate;
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
	 * {@linkplain com.tools20022.repository.msg.DeceasedStatusSD1
	 * DeceasedStatusSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DthDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Beneficial Owner Death Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeathDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of death of the beneficial owner."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DeceasedStatusSD1, Optional<ISODate>> mmDeathDate = new MMMessageAttribute<DeceasedStatusSD1, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DeceasedStatusSD1.mmObject();
			isDerived = false;
			xmlTag = "DthDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Beneficial Owner Death Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeathDate";
			definition = "Date of death of the beneficial owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(DeceasedStatusSD1 obj) {
			return obj.getDeathDate();
		}

		@Override
		public void setValue(DeceasedStatusSD1 obj, Optional<ISODate> value) {
			obj.setDeathDate(value.orElse(null));
		}
	};
	@XmlElement(name = "DthCertSrlNb")
	protected Max30Text deathCertificateSerialNumber;
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
	 * {@linkplain com.tools20022.repository.msg.DeceasedStatusSD1
	 * DeceasedStatusSD1}</li>
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
	 * definition} = "Death certificate number of the beneficial owner."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DeceasedStatusSD1, Optional<Max30Text>> mmDeathCertificateSerialNumber = new MMMessageAttribute<DeceasedStatusSD1, Optional<Max30Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DeceasedStatusSD1.mmObject();
			isDerived = false;
			xmlTag = "DthCertSrlNb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Death Certificate Serial Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeathCertificateSerialNumber";
			definition = "Death certificate number of the beneficial owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max30Text.mmObject();
		}

		@Override
		public Optional<Max30Text> getValue(DeceasedStatusSD1 obj) {
			return obj.getDeathCertificateSerialNumber();
		}

		@Override
		public void setValue(DeceasedStatusSD1 obj, Optional<Max30Text> value) {
			obj.setDeathCertificateSerialNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "IssgJursdctn")
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
	 * {@linkplain com.tools20022.repository.msg.DeceasedStatusSD1
	 * DeceasedStatusSD1}</li>
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
	 * "Jurisdiction by which the certificate of deposit was issued."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DeceasedStatusSD1, Optional<Max35Text>> mmIssuingJurisdiction = new MMMessageAttribute<DeceasedStatusSD1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DeceasedStatusSD1.mmObject();
			isDerived = false;
			xmlTag = "IssgJursdctn";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Issuing Jurisdiction"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuingJurisdiction";
			definition = "Jurisdiction by which the certificate of deposit was issued.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(DeceasedStatusSD1 obj) {
			return obj.getIssuingJurisdiction();
		}

		@Override
		public void setValue(DeceasedStatusSD1 obj, Optional<Max35Text> value) {
			obj.setIssuingJurisdiction(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeceasedStatusSD1.mmBeneficialOwnerName, com.tools20022.repository.msg.DeceasedStatusSD1.mmDeathDate,
						com.tools20022.repository.msg.DeceasedStatusSD1.mmDeathCertificateSerialNumber, com.tools20022.repository.msg.DeceasedStatusSD1.mmIssuingJurisdiction);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeceasedStatusSD1";
				definition = "Deceased beneficial owner information details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getBeneficialOwnerName() {
		return beneficialOwnerName;
	}

	public DeceasedStatusSD1 setBeneficialOwnerName(Max35Text beneficialOwnerName) {
		this.beneficialOwnerName = Objects.requireNonNull(beneficialOwnerName);
		return this;
	}

	public Optional<ISODate> getDeathDate() {
		return deathDate == null ? Optional.empty() : Optional.of(deathDate);
	}

	public DeceasedStatusSD1 setDeathDate(ISODate deathDate) {
		this.deathDate = deathDate;
		return this;
	}

	public Optional<Max30Text> getDeathCertificateSerialNumber() {
		return deathCertificateSerialNumber == null ? Optional.empty() : Optional.of(deathCertificateSerialNumber);
	}

	public DeceasedStatusSD1 setDeathCertificateSerialNumber(Max30Text deathCertificateSerialNumber) {
		this.deathCertificateSerialNumber = deathCertificateSerialNumber;
		return this;
	}

	public Optional<Max35Text> getIssuingJurisdiction() {
		return issuingJurisdiction == null ? Optional.empty() : Optional.of(issuingJurisdiction);
	}

	public DeceasedStatusSD1 setIssuingJurisdiction(Max35Text issuingJurisdiction) {
		this.issuingJurisdiction = issuingJurisdiction;
		return this;
	}
}