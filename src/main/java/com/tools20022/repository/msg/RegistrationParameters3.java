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
import com.tools20022.repository.choice.DateAndDateTime1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.BasicSecuritiesRegistration;
import com.tools20022.repository.entity.SecuritiesPartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RegistrationParameters3", propOrder = {"certificationIdentification", "certificationDateTime", "registrarAccount", "certificateNumber"})
public class RegistrationParameters3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text certificationIdentification;
	/**
	 * Identification assigned to a deposit.
	 * <p>
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
	public static final MMMessageAttribute mmCertificationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BasicSecuritiesRegistration.mmCertificationIdentification;
			componentContext_lazy = () -> RegistrationParameters3.mmObject();
			isDerived = false;
			xmlTag = "CertfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationIdentification";
			definition = "Identification assigned to a deposit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DateAndDateTime1Choice certificationDateTime;
	/**
	 * Date/time at which the certificates in the deposit were validated by the
	 * agent.
	 * <p>
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
	public static final MMMessageAttribute mmCertificationDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BasicSecuritiesRegistration.mmCertificationDate;
			componentContext_lazy = () -> RegistrationParameters3.mmObject();
			isDerived = false;
			xmlTag = "CertfctnDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationDateTime";
			definition = "Date/time at which the certificates in the deposit were validated by the agent.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTime1Choice.mmObject();
		}
	};
	protected Max35Text registrarAccount;
	/**
	 * Account at the registrar where financial instruments are registered.
	 * <p>
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
	public static final MMMessageAttribute mmRegistrarAccount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPartyRole.mmSecuritiesAccount;
			componentContext_lazy = () -> RegistrationParameters3.mmObject();
			isDerived = false;
			xmlTag = "RegarAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrarAccount";
			definition = "Account at the registrar where financial instruments are registered.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SecuritiesCertificate3> certificateNumber;
	/**
	 * Unique and unambiguous identifier of a certificate assigned by the
	 * issuer.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCertificateNumber = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BasicSecuritiesRegistration.mmSecuritiesCertificate;
			componentContext_lazy = () -> RegistrationParameters3.mmObject();
			isDerived = false;
			xmlTag = "CertNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateNumber";
			definition = "Unique and unambiguous identifier of a certificate assigned by the issuer.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesCertificate3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RegistrationParameters3.mmCertificationIdentification, RegistrationParameters3.mmCertificationDateTime, RegistrationParameters3.mmRegistrarAccount,
						RegistrationParameters3.mmCertificateNumber);
				trace_lazy = () -> BasicSecuritiesRegistration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegistrationParameters3";
				definition = "Information related to registration of securities.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CertfctnId")
	public Max35Text getCertificationIdentification() {
		return certificationIdentification;
	}

	public void setCertificationIdentification(Max35Text certificationIdentification) {
		this.certificationIdentification = certificationIdentification;
	}

	@XmlElement(name = "CertfctnDtTm")
	public DateAndDateTime1Choice getCertificationDateTime() {
		return certificationDateTime;
	}

	public void setCertificationDateTime(DateAndDateTime1Choice certificationDateTime) {
		this.certificationDateTime = certificationDateTime;
	}

	@XmlElement(name = "RegarAcct")
	public Max35Text getRegistrarAccount() {
		return registrarAccount;
	}

	public void setRegistrarAccount(Max35Text registrarAccount) {
		this.registrarAccount = registrarAccount;
	}

	@XmlElement(name = "CertNb")
	public List<SecuritiesCertificate3> getCertificateNumber() {
		return certificateNumber;
	}

	public void setCertificateNumber(List<com.tools20022.repository.msg.SecuritiesCertificate3> certificateNumber) {
		this.certificateNumber = certificateNumber;
	}
}