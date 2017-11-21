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
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.BasicSecuritiesRegistration;
import com.tools20022.repository.entity.RegistrarRole;
import com.tools20022.repository.entity.SecuritiesCertificate;
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
 * {@linkplain com.tools20022.repository.msg.RegistrationParameters4#mmCertificationIdentification
 * RegistrationParameters4.mmCertificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegistrationParameters4#mmCertificationDateTime
 * RegistrationParameters4.mmCertificationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegistrationParameters4#mmRegistrarAccount
 * RegistrationParameters4.mmRegistrarAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegistrationParameters4#mmCertificateNumber
 * RegistrationParameters4.mmCertificateNumber}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
 * BasicSecuritiesRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV06#mmAdditionalPhysicalOrRegistrationDetails
 * SecuritiesSettlementTransactionInstructionV06.
 * mmAdditionalPhysicalOrRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmAdditionalPhysicalOrRegistrationDetails
 * SecuritiesSettlementTransactionConfirmationV06.
 * mmAdditionalPhysicalOrRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmAdditionalPhysicalOrRegistrationDetails
 * SecuritiesSettlementTransactionGenerationNotificationV06.
 * mmAdditionalPhysicalOrRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmAdditionalPhysicalOrRegistrationDetails
 * SecuritiesSettlementTransactionReversalAdviceV05.
 * mmAdditionalPhysicalOrRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV07#mmAdditionalPhysicalOrRegistrationDetails
 * SecuritiesSettlementTransactionGenerationNotificationV07.
 * mmAdditionalPhysicalOrRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmAdditionalPhysicalOrRegistrationDetails
 * SecuritiesSettlementTransactionConfirmationV07.
 * mmAdditionalPhysicalOrRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV06#mmAdditionalPhysicalOrRegistrationDetails
 * SecuritiesSettlementTransactionReversalAdviceV06.
 * mmAdditionalPhysicalOrRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV07#mmAdditionalPhysicalOrRegistrationDetails
 * SecuritiesSettlementTransactionInstructionV07.
 * mmAdditionalPhysicalOrRegistrationDetails}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RegistrationParameters4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to registration of securities."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.RegistrationParameters1
 * RegistrationParameters1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RegistrationParameters4", propOrder = {"certificationIdentification", "certificationDateTime", "registrarAccount", "certificateNumber"})
public class RegistrationParameters4 {

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
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters4
	 * RegistrationParameters4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters1#mmCertificationIdentification
	 * RegistrationParameters1.mmCertificationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BasicSecuritiesRegistration.mmCertificationIdentification;
			componentContext_lazy = () -> RegistrationParameters4.mmObject();
			isDerived = false;
			xmlTag = "CertfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationIdentification";
			definition = "Identification assigned to a deposit.";
			previousVersion_lazy = () -> RegistrationParameters1.mmCertificationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DateAndDateTimeChoice certificationDateTime;
	/**
	 * Date/time at which the certificates in the deposit were validated by the
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmCertificationDate
	 * BasicSecuritiesRegistration.mmCertificationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters4
	 * RegistrationParameters4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters1#mmCertificationDateTime
	 * RegistrationParameters1.mmCertificationDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificationDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BasicSecuritiesRegistration.mmCertificationDate;
			componentContext_lazy = () -> RegistrationParameters4.mmObject();
			isDerived = false;
			xmlTag = "CertfctnDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationDateTime";
			definition = "Date/time at which the certificates in the deposit were validated by the agent.";
			previousVersion_lazy = () -> RegistrationParameters1.mmCertificationDateTime;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.RegistrarRole#mmRegistrarAccount
	 * RegistrarRole.mmRegistrarAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters4
	 * RegistrationParameters4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters1#mmRegistrarAccount
	 * RegistrationParameters1.mmRegistrarAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrarAccount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RegistrarRole.mmRegistrarAccount;
			componentContext_lazy = () -> RegistrationParameters4.mmObject();
			isDerived = false;
			xmlTag = "RegarAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrarAccount";
			definition = "Account at the registrar where financial instruments are registered.";
			previousVersion_lazy = () -> RegistrationParameters1.mmRegistrarAccount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SecuritiesCertificate4> certificateNumber;
	/**
	 * Unique and unambiguous identifier of a certificate assigned by the
	 * issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesCertificate4
	 * SecuritiesCertificate4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmNumber
	 * SecuritiesCertificate.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters4
	 * RegistrationParameters4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters1#mmCertificateNumber
	 * RegistrationParameters1.mmCertificateNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCertificateNumber = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesCertificate.mmNumber;
			componentContext_lazy = () -> RegistrationParameters4.mmObject();
			isDerived = false;
			xmlTag = "CertNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateNumber";
			definition = "Unique and unambiguous identifier of a certificate assigned by the issuer.";
			previousVersion_lazy = () -> RegistrationParameters1.mmCertificateNumber;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesCertificate4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RegistrationParameters4.mmCertificationIdentification, RegistrationParameters4.mmCertificationDateTime, RegistrationParameters4.mmRegistrarAccount,
						RegistrationParameters4.mmCertificateNumber);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV06.mmAdditionalPhysicalOrRegistrationDetails,
						SecuritiesSettlementTransactionConfirmationV06.mmAdditionalPhysicalOrRegistrationDetails, SecuritiesSettlementTransactionGenerationNotificationV06.mmAdditionalPhysicalOrRegistrationDetails,
						SecuritiesSettlementTransactionReversalAdviceV05.mmAdditionalPhysicalOrRegistrationDetails, SecuritiesSettlementTransactionGenerationNotificationV07.mmAdditionalPhysicalOrRegistrationDetails,
						SecuritiesSettlementTransactionConfirmationV07.mmAdditionalPhysicalOrRegistrationDetails, SecuritiesSettlementTransactionReversalAdviceV06.mmAdditionalPhysicalOrRegistrationDetails,
						SecuritiesSettlementTransactionInstructionV07.mmAdditionalPhysicalOrRegistrationDetails);
				trace_lazy = () -> BasicSecuritiesRegistration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegistrationParameters4";
				definition = "Information related to registration of securities.";
				previousVersion_lazy = () -> RegistrationParameters1.mmObject();
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
	public DateAndDateTimeChoice getCertificationDateTime() {
		return certificationDateTime;
	}

	public void setCertificationDateTime(DateAndDateTimeChoice certificationDateTime) {
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
	public List<SecuritiesCertificate4> getCertificateNumber() {
		return certificateNumber;
	}

	public void setCertificateNumber(List<com.tools20022.repository.msg.SecuritiesCertificate4> certificateNumber) {
		this.certificateNumber = certificateNumber;
	}
}