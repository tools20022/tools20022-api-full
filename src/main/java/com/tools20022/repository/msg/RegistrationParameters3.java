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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateAndDateTime1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.BasicSecuritiesRegistration;
import com.tools20022.repository.entity.SecuritiesPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecuritiesCertificate3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to registration of securities.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegistrationParameters3#mmCertificationIdentification
 * RegistrationParameters3.mmCertificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegistrationParameters3#mmCertificationDateTime
 * RegistrationParameters3.mmCertificationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegistrationParameters3#mmRegistrarAccount
 * RegistrationParameters3.mmRegistrarAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegistrationParameters3#mmCertificateNumber
 * RegistrationParameters3.mmCertificateNumber}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
 * BasicSecuritiesRegistration}</li>
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
 * "RegistrationParameters3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to registration of securities."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RegistrationParameters3", propOrder = {"certificationIdentification", "certificationDateTime", "registrarAccount", "certificateNumber"})
public class RegistrationParameters3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CertfctnId")
	protected Max35Text certificationIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmCertificationIdentification
	 * BasicSecuritiesRegistration.mmCertificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters3
	 * RegistrationParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::CERT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification assigned to a deposit."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegistrationParameters3, Optional<Max35Text>> mmCertificationIdentification = new MMMessageAttribute<RegistrationParameters3, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> BasicSecuritiesRegistration.mmCertificationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegistrationParameters3.mmObject();
			isDerived = false;
			xmlTag = "CertfctnId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::CERT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationIdentification";
			definition = "Identification assigned to a deposit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(RegistrationParameters3 obj) {
			return obj.getCertificationIdentification();
		}

		@Override
		public void setValue(RegistrationParameters3 obj, Optional<Max35Text> value) {
			obj.setCertificationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CertfctnDtTm")
	protected DateAndDateTime1Choice certificationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime1Choice
	 * DateAndDateTime1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmCertificationDate
	 * BasicSecuritiesRegistration.mmCertificationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters3
	 * RegistrationParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::CERT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the certificates in the deposit were validated by the agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegistrationParameters3, Optional<DateAndDateTime1Choice>> mmCertificationDateTime = new MMMessageAttribute<RegistrationParameters3, Optional<DateAndDateTime1Choice>>() {
		{
			businessElementTrace_lazy = () -> BasicSecuritiesRegistration.mmCertificationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegistrationParameters3.mmObject();
			isDerived = false;
			xmlTag = "CertfctnDtTm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::CERT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationDateTime";
			definition = "Date/time at which the certificates in the deposit were validated by the agent.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTime1Choice.mmObject();
		}

		@Override
		public Optional<DateAndDateTime1Choice> getValue(RegistrationParameters3 obj) {
			return obj.getCertificationDateTime();
		}

		@Override
		public void setValue(RegistrationParameters3 obj, Optional<DateAndDateTime1Choice> value) {
			obj.setCertificationDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "RegarAcct")
	protected Max35Text registrarAccount;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#mmSecuritiesAccount
	 * SecuritiesPartyRole.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters3
	 * RegistrationParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegarAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :97a::REGI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrarAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account at the registrar where financial instruments are registered."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegistrationParameters3, Optional<Max35Text>> mmRegistrarAccount = new MMMessageAttribute<RegistrationParameters3, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPartyRole.mmSecuritiesAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegistrationParameters3.mmObject();
			isDerived = false;
			xmlTag = "RegarAcct";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97a::REGI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrarAccount";
			definition = "Account at the registrar where financial instruments are registered.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(RegistrationParameters3 obj) {
			return obj.getRegistrarAccount();
		}

		@Override
		public void setValue(RegistrationParameters3 obj, Optional<Max35Text> value) {
			obj.setRegistrarAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "CertNb")
	protected List<SecuritiesCertificate3> certificateNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesCertificate3
	 * SecuritiesCertificate3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSecuritiesCertificate
	 * BasicSecuritiesRegistration.mmSecuritiesCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters3
	 * RegistrationParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a certificate assigned by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RegistrationParameters3, List<SecuritiesCertificate3>> mmCertificateNumber = new MMMessageAssociationEnd<RegistrationParameters3, List<SecuritiesCertificate3>>() {
		{
			businessElementTrace_lazy = () -> BasicSecuritiesRegistration.mmSecuritiesCertificate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegistrationParameters3.mmObject();
			isDerived = false;
			xmlTag = "CertNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateNumber";
			definition = "Unique and unambiguous identifier of a certificate assigned by the issuer.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesCertificate3.mmObject();
		}

		@Override
		public List<SecuritiesCertificate3> getValue(RegistrationParameters3 obj) {
			return obj.getCertificateNumber();
		}

		@Override
		public void setValue(RegistrationParameters3 obj, List<SecuritiesCertificate3> value) {
			obj.setCertificateNumber(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegistrationParameters3.mmCertificationIdentification, com.tools20022.repository.msg.RegistrationParameters3.mmCertificationDateTime,
						com.tools20022.repository.msg.RegistrationParameters3.mmRegistrarAccount, com.tools20022.repository.msg.RegistrationParameters3.mmCertificateNumber);
				trace_lazy = () -> BasicSecuritiesRegistration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegistrationParameters3";
				definition = "Information related to registration of securities.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getCertificationIdentification() {
		return certificationIdentification == null ? Optional.empty() : Optional.of(certificationIdentification);
	}

	public RegistrationParameters3 setCertificationIdentification(Max35Text certificationIdentification) {
		this.certificationIdentification = certificationIdentification;
		return this;
	}

	public Optional<DateAndDateTime1Choice> getCertificationDateTime() {
		return certificationDateTime == null ? Optional.empty() : Optional.of(certificationDateTime);
	}

	public RegistrationParameters3 setCertificationDateTime(DateAndDateTime1Choice certificationDateTime) {
		this.certificationDateTime = certificationDateTime;
		return this;
	}

	public Optional<Max35Text> getRegistrarAccount() {
		return registrarAccount == null ? Optional.empty() : Optional.of(registrarAccount);
	}

	public RegistrationParameters3 setRegistrarAccount(Max35Text registrarAccount) {
		this.registrarAccount = registrarAccount;
		return this;
	}

	public List<SecuritiesCertificate3> getCertificateNumber() {
		return certificateNumber == null ? certificateNumber = new ArrayList<>() : certificateNumber;
	}

	public RegistrationParameters3 setCertificateNumber(List<SecuritiesCertificate3> certificateNumber) {
		this.certificateNumber = Objects.requireNonNull(certificateNumber);
		return this;
	}
}