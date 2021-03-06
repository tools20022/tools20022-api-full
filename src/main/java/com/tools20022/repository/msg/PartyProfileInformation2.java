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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.CertificationType1Choice;
import com.tools20022.repository.choice.CustomerConductClassification1Choice;
import com.tools20022.repository.choice.RiskLevel1Choice;
import com.tools20022.repository.codeset.EventFrequency1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.PersonProfile;
import com.tools20022.repository.entity.PrivateCertificate;
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
 * Information to support the Know Your Customer processes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmCertificationIndicator
 * PartyProfileInformation2.mmCertificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmValidatingParty
 * PartyProfileInformation2.mmValidatingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmCheckingParty
 * PartyProfileInformation2.mmCheckingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmResponsibleParty
 * PartyProfileInformation2.mmResponsibleParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmCertificateType
 * PartyProfileInformation2.mmCertificateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmCheckingDate
 * PartyProfileInformation2.mmCheckingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmCheckingFrequency
 * PartyProfileInformation2.mmCheckingFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmNextRevisionDate
 * PartyProfileInformation2.mmNextRevisionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmSalaryRange
 * PartyProfileInformation2.mmSalaryRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmSourceOfWealth
 * PartyProfileInformation2.mmSourceOfWealth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmCustomerConductClassification
 * PartyProfileInformation2.mmCustomerConductClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmRiskLevel
 * PartyProfileInformation2.mmRiskLevel}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PrivateCertificate
 * PrivateCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyProfileInformation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information to support the Know Your Customer processes."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyProfileInformation3
 * PartyProfileInformation3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1
 * PartyProfileInformation1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyProfileInformation2", propOrder = {"certificationIndicator", "validatingParty", "checkingParty", "responsibleParty", "certificateType", "checkingDate", "checkingFrequency", "nextRevisionDate", "salaryRange",
		"sourceOfWealth", "customerConductClassification", "riskLevel"})
public class PartyProfileInformation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CertfctnInd", required = true)
	protected YesNoIndicator certificationIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmCertificationIndicator
	 * PrivateCertificate.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2
	 * PartyProfileInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the certificate type has been obtained and verified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmCertificationIndicator
	 * PartyProfileInformation3.mmCertificationIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation2, YesNoIndicator> mmCertificationIndicator = new MMMessageAttribute<PartyProfileInformation2, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> PrivateCertificate.mmCertificationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation2.mmObject();
			isDerived = false;
			xmlTag = "CertfctnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationIndicator";
			definition = "Indicates whether the certificate type has been obtained and verified.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation3.mmCertificationIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(PartyProfileInformation2 obj) {
			return obj.getCertificationIndicator();
		}

		@Override
		public void setValue(PartyProfileInformation2 obj, YesNoIndicator value) {
			obj.setCertificationIndicator(value);
		}
	};
	@XmlElement(name = "VldtngPty")
	protected Max140Text validatingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2
	 * PartyProfileInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtngPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidatingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the person who validated the document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmValidatingParty
	 * PartyProfileInformation3.mmValidatingParty}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation2, Optional<Max140Text>> mmValidatingParty = new MMMessageAttribute<PartyProfileInformation2, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation2.mmObject();
			isDerived = false;
			xmlTag = "VldtngPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidatingParty";
			definition = "Identification of the person who validated the document.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation3.mmValidatingParty);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(PartyProfileInformation2 obj) {
			return obj.getValidatingParty();
		}

		@Override
		public void setValue(PartyProfileInformation2 obj, Optional<Max140Text> value) {
			obj.setValidatingParty(value.orElse(null));
		}
	};
	@XmlElement(name = "ChckngPty")
	protected Max140Text checkingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2
	 * PartyProfileInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChckngPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the person who checked the document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmCheckingParty
	 * PartyProfileInformation3.mmCheckingParty}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation2, Optional<Max140Text>> mmCheckingParty = new MMMessageAttribute<PartyProfileInformation2, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation2.mmObject();
			isDerived = false;
			xmlTag = "ChckngPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckingParty";
			definition = "Identification of the person who checked the document.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation3.mmCheckingParty);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(PartyProfileInformation2 obj) {
			return obj.getCheckingParty();
		}

		@Override
		public void setValue(PartyProfileInformation2 obj, Optional<Max140Text> value) {
			obj.setCheckingParty(value.orElse(null));
		}
	};
	@XmlElement(name = "RspnsblPty")
	protected Max140Text responsibleParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2
	 * PartyProfileInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnsblPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponsibleParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the person who is responsible for the document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmResponsibleParty
	 * PartyProfileInformation3.mmResponsibleParty}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation2, Optional<Max140Text>> mmResponsibleParty = new MMMessageAttribute<PartyProfileInformation2, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation2.mmObject();
			isDerived = false;
			xmlTag = "RspnsblPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponsibleParty";
			definition = "Identification of the person who is responsible for the document.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation3.mmResponsibleParty);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(PartyProfileInformation2 obj) {
			return obj.getResponsibleParty();
		}

		@Override
		public void setValue(PartyProfileInformation2 obj, Optional<Max140Text> value) {
			obj.setResponsibleParty(value.orElse(null));
		}
	};
	@XmlElement(name = "CertTp", required = true)
	protected CertificationType1Choice certificateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CertificationType1Choice
	 * CertificationType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate
	 * PrivateCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2
	 * PartyProfileInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of certificate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmCertificateType
	 * PartyProfileInformation3.mmCertificateType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation2, CertificationType1Choice> mmCertificateType = new MMMessageAttribute<PartyProfileInformation2, CertificationType1Choice>() {
		{
			businessComponentTrace_lazy = () -> PrivateCertificate.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation2.mmObject();
			isDerived = false;
			xmlTag = "CertTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateType";
			definition = "Type of certificate.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation3.mmCertificateType);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CertificationType1Choice.mmObject();
		}

		@Override
		public CertificationType1Choice getValue(PartyProfileInformation2 obj) {
			return obj.getCertificateType();
		}

		@Override
		public void setValue(PartyProfileInformation2 obj, CertificationType1Choice value) {
			obj.setCertificateType(value);
		}
	};
	@XmlElement(name = "ChckngDt")
	protected ISODate checkingDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmCheckingDate
	 * PrivateCertificate.mmCheckingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2
	 * PartyProfileInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChckngDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the certification check has been performed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmCheckingDate
	 * PartyProfileInformation3.mmCheckingDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation2, Optional<ISODate>> mmCheckingDate = new MMMessageAttribute<PartyProfileInformation2, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> PrivateCertificate.mmCheckingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation2.mmObject();
			isDerived = false;
			xmlTag = "ChckngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckingDate";
			definition = "Date at which the certification check has been performed.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation3.mmCheckingDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(PartyProfileInformation2 obj) {
			return obj.getCheckingDate();
		}

		@Override
		public void setValue(PartyProfileInformation2 obj, Optional<ISODate> value) {
			obj.setCheckingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ChckngFrqcy")
	protected EventFrequency1Code checkingFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code
	 * EventFrequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmCheckingFrequency
	 * PrivateCertificate.mmCheckingFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2
	 * PartyProfileInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChckngFrqcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckingFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies how frequently the check is performed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmCheckingFrequency
	 * PartyProfileInformation3.mmCheckingFrequency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation2, Optional<EventFrequency1Code>> mmCheckingFrequency = new MMMessageAttribute<PartyProfileInformation2, Optional<EventFrequency1Code>>() {
		{
			businessElementTrace_lazy = () -> PrivateCertificate.mmCheckingFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation2.mmObject();
			isDerived = false;
			xmlTag = "ChckngFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckingFrequency";
			definition = "Specifies how frequently the check is performed.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation3.mmCheckingFrequency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EventFrequency1Code.mmObject();
		}

		@Override
		public Optional<EventFrequency1Code> getValue(PartyProfileInformation2 obj) {
			return obj.getCheckingFrequency();
		}

		@Override
		public void setValue(PartyProfileInformation2 obj, Optional<EventFrequency1Code> value) {
			obj.setCheckingFrequency(value.orElse(null));
		}
	};
	@XmlElement(name = "NxtRvsnDt")
	protected ISODate nextRevisionDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmNextRevisionDate
	 * PrivateCertificate.mmNextRevisionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2
	 * PartyProfileInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtRvsnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextRevisionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date at which the next certification check will be performed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmNextRevisionDate
	 * PartyProfileInformation3.mmNextRevisionDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation2, Optional<ISODate>> mmNextRevisionDate = new MMMessageAttribute<PartyProfileInformation2, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> PrivateCertificate.mmNextRevisionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation2.mmObject();
			isDerived = false;
			xmlTag = "NxtRvsnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextRevisionDate";
			definition = "Specifies the date at which the next certification check will be performed.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation3.mmNextRevisionDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(PartyProfileInformation2 obj) {
			return obj.getNextRevisionDate();
		}

		@Override
		public void setValue(PartyProfileInformation2 obj, Optional<ISODate> value) {
			obj.setNextRevisionDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SlryRg")
	protected Max35Text salaryRange;
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
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmSalaryRange
	 * PersonProfile.mmSalaryRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2
	 * PartyProfileInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlryRg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SalaryRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limits between which a person's salary is estimated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmSalaryRange
	 * PartyProfileInformation3.mmSalaryRange}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation2, Optional<Max35Text>> mmSalaryRange = new MMMessageAttribute<PartyProfileInformation2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PersonProfile.mmSalaryRange;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation2.mmObject();
			isDerived = false;
			xmlTag = "SlryRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SalaryRange";
			definition = "Limits between which a person's salary is estimated.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation3.mmSalaryRange);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PartyProfileInformation2 obj) {
			return obj.getSalaryRange();
		}

		@Override
		public void setValue(PartyProfileInformation2 obj, Optional<Max35Text> value) {
			obj.setSalaryRange(value.orElse(null));
		}
	};
	@XmlElement(name = "SrcOfWlth")
	protected Max140Text sourceOfWealth;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmSourceOfWealth
	 * PersonProfile.mmSourceOfWealth}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2
	 * PartyProfileInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrcOfWlth"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceOfWealth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the main source of revenue."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmSourceOfWealth
	 * PartyProfileInformation3.mmSourceOfWealth}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation2, Optional<Max140Text>> mmSourceOfWealth = new MMMessageAttribute<PartyProfileInformation2, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> PersonProfile.mmSourceOfWealth;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation2.mmObject();
			isDerived = false;
			xmlTag = "SrcOfWlth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceOfWealth";
			definition = "Indicates the main source of revenue.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation3.mmSourceOfWealth);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(PartyProfileInformation2 obj) {
			return obj.getSourceOfWealth();
		}

		@Override
		public void setValue(PartyProfileInformation2 obj, Optional<Max140Text> value) {
			obj.setSourceOfWealth(value.orElse(null));
		}
	};
	@XmlElement(name = "CstmrCndctClssfctn")
	protected CustomerConductClassification1Choice customerConductClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CustomerConductClassification1Choice
	 * CustomerConductClassification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2
	 * PartyProfileInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrCndctClssfctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerConductClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies an assessment of the customer’s behaviour at the time of the account opening application."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmCustomerConductClassification
	 * PartyProfileInformation3.mmCustomerConductClassification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation2, Optional<CustomerConductClassification1Choice>> mmCustomerConductClassification = new MMMessageAttribute<PartyProfileInformation2, Optional<CustomerConductClassification1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation2.mmObject();
			isDerived = false;
			xmlTag = "CstmrCndctClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerConductClassification";
			definition = "Specifies an assessment of the customer’s behaviour at the time of the account opening application.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation3.mmCustomerConductClassification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CustomerConductClassification1Choice.mmObject();
		}

		@Override
		public Optional<CustomerConductClassification1Choice> getValue(PartyProfileInformation2 obj) {
			return obj.getCustomerConductClassification();
		}

		@Override
		public void setValue(PartyProfileInformation2 obj, Optional<CustomerConductClassification1Choice> value) {
			obj.setCustomerConductClassification(value.orElse(null));
		}
	};
	@XmlElement(name = "RskLvl")
	protected RiskLevel1Choice riskLevel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RiskLevel1Choice
	 * RiskLevel1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2
	 * PartyProfileInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RskLvl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the customer’s money laundering risk."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmRiskLevel
	 * PartyProfileInformation3.mmRiskLevel}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation2, Optional<RiskLevel1Choice>> mmRiskLevel = new MMMessageAttribute<PartyProfileInformation2, Optional<RiskLevel1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation2.mmObject();
			isDerived = false;
			xmlTag = "RskLvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RiskLevel";
			definition = "Specifies the customer’s money laundering risk.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation3.mmRiskLevel);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RiskLevel1Choice.mmObject();
		}

		@Override
		public Optional<RiskLevel1Choice> getValue(PartyProfileInformation2 obj) {
			return obj.getRiskLevel();
		}

		@Override
		public void setValue(PartyProfileInformation2 obj, Optional<RiskLevel1Choice> value) {
			obj.setRiskLevel(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyProfileInformation2.mmCertificationIndicator, com.tools20022.repository.msg.PartyProfileInformation2.mmValidatingParty,
						com.tools20022.repository.msg.PartyProfileInformation2.mmCheckingParty, com.tools20022.repository.msg.PartyProfileInformation2.mmResponsibleParty,
						com.tools20022.repository.msg.PartyProfileInformation2.mmCertificateType, com.tools20022.repository.msg.PartyProfileInformation2.mmCheckingDate,
						com.tools20022.repository.msg.PartyProfileInformation2.mmCheckingFrequency, com.tools20022.repository.msg.PartyProfileInformation2.mmNextRevisionDate,
						com.tools20022.repository.msg.PartyProfileInformation2.mmSalaryRange, com.tools20022.repository.msg.PartyProfileInformation2.mmSourceOfWealth,
						com.tools20022.repository.msg.PartyProfileInformation2.mmCustomerConductClassification, com.tools20022.repository.msg.PartyProfileInformation2.mmRiskLevel);
				trace_lazy = () -> PrivateCertificate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyProfileInformation2";
				definition = "Information to support the Know Your Customer processes.";
				nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation3.mmObject());
				previousVersion_lazy = () -> PartyProfileInformation1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getCertificationIndicator() {
		return certificationIndicator;
	}

	public PartyProfileInformation2 setCertificationIndicator(YesNoIndicator certificationIndicator) {
		this.certificationIndicator = Objects.requireNonNull(certificationIndicator);
		return this;
	}

	public Optional<Max140Text> getValidatingParty() {
		return validatingParty == null ? Optional.empty() : Optional.of(validatingParty);
	}

	public PartyProfileInformation2 setValidatingParty(Max140Text validatingParty) {
		this.validatingParty = validatingParty;
		return this;
	}

	public Optional<Max140Text> getCheckingParty() {
		return checkingParty == null ? Optional.empty() : Optional.of(checkingParty);
	}

	public PartyProfileInformation2 setCheckingParty(Max140Text checkingParty) {
		this.checkingParty = checkingParty;
		return this;
	}

	public Optional<Max140Text> getResponsibleParty() {
		return responsibleParty == null ? Optional.empty() : Optional.of(responsibleParty);
	}

	public PartyProfileInformation2 setResponsibleParty(Max140Text responsibleParty) {
		this.responsibleParty = responsibleParty;
		return this;
	}

	public CertificationType1Choice getCertificateType() {
		return certificateType;
	}

	public PartyProfileInformation2 setCertificateType(CertificationType1Choice certificateType) {
		this.certificateType = Objects.requireNonNull(certificateType);
		return this;
	}

	public Optional<ISODate> getCheckingDate() {
		return checkingDate == null ? Optional.empty() : Optional.of(checkingDate);
	}

	public PartyProfileInformation2 setCheckingDate(ISODate checkingDate) {
		this.checkingDate = checkingDate;
		return this;
	}

	public Optional<EventFrequency1Code> getCheckingFrequency() {
		return checkingFrequency == null ? Optional.empty() : Optional.of(checkingFrequency);
	}

	public PartyProfileInformation2 setCheckingFrequency(EventFrequency1Code checkingFrequency) {
		this.checkingFrequency = checkingFrequency;
		return this;
	}

	public Optional<ISODate> getNextRevisionDate() {
		return nextRevisionDate == null ? Optional.empty() : Optional.of(nextRevisionDate);
	}

	public PartyProfileInformation2 setNextRevisionDate(ISODate nextRevisionDate) {
		this.nextRevisionDate = nextRevisionDate;
		return this;
	}

	public Optional<Max35Text> getSalaryRange() {
		return salaryRange == null ? Optional.empty() : Optional.of(salaryRange);
	}

	public PartyProfileInformation2 setSalaryRange(Max35Text salaryRange) {
		this.salaryRange = salaryRange;
		return this;
	}

	public Optional<Max140Text> getSourceOfWealth() {
		return sourceOfWealth == null ? Optional.empty() : Optional.of(sourceOfWealth);
	}

	public PartyProfileInformation2 setSourceOfWealth(Max140Text sourceOfWealth) {
		this.sourceOfWealth = sourceOfWealth;
		return this;
	}

	public Optional<CustomerConductClassification1Choice> getCustomerConductClassification() {
		return customerConductClassification == null ? Optional.empty() : Optional.of(customerConductClassification);
	}

	public PartyProfileInformation2 setCustomerConductClassification(CustomerConductClassification1Choice customerConductClassification) {
		this.customerConductClassification = customerConductClassification;
		return this;
	}

	public Optional<RiskLevel1Choice> getRiskLevel() {
		return riskLevel == null ? Optional.empty() : Optional.of(riskLevel);
	}

	public PartyProfileInformation2 setRiskLevel(RiskLevel1Choice riskLevel) {
		this.riskLevel = riskLevel;
		return this;
	}
}